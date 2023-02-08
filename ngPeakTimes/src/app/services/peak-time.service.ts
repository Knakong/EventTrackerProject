import { DatePipe } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, catchError, throwError } from 'rxjs';
import { environment } from 'src/environments/environment';
import { PeakTime } from '../models/peak-time';

@Injectable({
  providedIn: 'root',
})
export class PeakTimeService {
  //url = environment.baseUrl + 'api/events';

  url = 'http://localhost:8083/' + 'api/events';

  constructor(private http: HttpClient, private datePipe: DatePipe) {}

  index(): Observable<PeakTime[]> {
    return this.http.get<PeakTime[]>(this.url).pipe(
      catchError((err: any) => {
        console.log(err);

        return throwError(
          () => new Error('TodoService.index(): error retrieving todos: ' + err)
        );
      })
    );
  }

  update(peakTime: PeakTime, id: number) {
    return this.http.put<PeakTime>(this.url + '/' + id, peakTime).pipe(
      catchError((err: any) => {
        console.log(err);

        return throwError(
          () =>
            new Error('peakTimeService.update(): error upating peaktime' + err)
        );
      })
    );
  }

  create(peakTime: PeakTime) {


    return this.http.post<PeakTime>(this.url, peakTime).pipe(
      catchError((err: any) => {
        console.log(err);

        return throwError(
          () =>
            new Error('peakTimeService.create(): error creating peaktime' + err)
        );
      })
    );
  }
}

import { Observable } from 'rxjs';
import { PeakTimeService } from './../../services/peak-time.service';
import { PeakTime } from 'src/app/models/peak-time';
import { Component, OnInit } from '@angular/core';
import { DatePipe } from '@angular/common';

@Component({
  selector: 'app-event',
  templateUrl: './event.component.html',
  styleUrls: ['./event.component.css'],
})
export class EventComponent implements OnInit {
  constructor(
    private peaktimeService: PeakTimeService,
    private datePipe: DatePipe
  ) {}
  ngOnInit(): void {
    this.reload();
  }

  peaktimes: PeakTime[] = [];

  newPeakTime : PeakTime = new PeakTime();
  selected: PeakTime | null = null;
  showNewForm = false;
  showEditForm = false;
  today: number = Date.now()

  update(peakTime: PeakTime) {
    this.peaktimeService.update(peakTime, peakTime.id).subscribe({
      next: (data) => {
        this.selected = data;
        this.reload();
        this.showEditForm = false;

      },
    });
  }

  create(peakTime : PeakTime ){
    this.peaktimeService.create(peakTime).subscribe({
      next: (data) => {
        this.selected = data;
        this.reload();

        this.newPeakTime = new PeakTime();
      },
    });

  }


  delete(peakTime: PeakTime) {



  }

  reload() {
    this.peaktimeService.index().subscribe({
      next: (peaktimes) => {
        this.peaktimes = peaktimes;
      },
    });
  }
}

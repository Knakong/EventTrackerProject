import { TestBed } from '@angular/core/testing';

import { PeakTimeService } from './peak-time.service';

describe('PeakTimeService', () => {
  let service: PeakTimeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PeakTimeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

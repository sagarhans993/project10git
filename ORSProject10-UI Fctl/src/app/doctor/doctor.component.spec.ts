import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { doctorComponent } from './doctor.component';

describe('DoctorComponent', () => {
  let component: doctorComponent;
  let fixture: ComponentFixture<doctorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ doctorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(doctorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

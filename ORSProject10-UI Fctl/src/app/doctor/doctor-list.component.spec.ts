import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { doctorlistComponent } from './doctor-list.component';

describe('DoctorListComponent', () => {
  let component: doctorlistComponent;
  let fixture: ComponentFixture<doctorlistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ doctorlistComponent]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(doctorlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

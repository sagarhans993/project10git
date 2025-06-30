import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ActivatedRoute } from '@angular/router';
import { ServiceLocatorService } from '../service-locator.service';

@Component({
  selector: 'app-doctor',
  templateUrl: './doctor.component.html',
  styleUrls: ['./doctor.component.css']
})
export class doctorComponent extends BaseCtl {
  errorMessageTitle: string = '';

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.DOCTOR, locator, route);
  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.fullname);
    flag = flag && validator.isNotNullObject(form.birthdate);
    flag = flag && validator.isNotNullObject(form.phone);
    flag = flag && validator.isNotNullObject(form.specialization);

    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.fullname = data.fullname;
    form.birthdate = data.birthdate;
    form.specialization = data.specialization;
    form.phone = data.phone;
  }
}
import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ActivatedRoute } from '@angular/router';
import { ServiceLocatorService } from '../service-locator.service';

@Component({
  selector: 'app-medication',
  templateUrl: './medication.component.html',
  styleUrls: ['./medication.component.css']
})
export class medicationComponent extends BaseCtl {
  errorMessageTitle: string = '';

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.MEDICATION, locator, route);
  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.fullname);
    flag = flag && validator.isNotNullObject(form.illness);
    flag = flag && validator.isNotNullObject(form.dosage);
    flag = flag && validator.isNotNullObject(form.prescriptiondate);

    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.fullname = data.fullname;
    form.illness = data.illness;
    form.dosage = data.dosage;
    form.prescriptiondate = data.prescriptiondate;
  }
}
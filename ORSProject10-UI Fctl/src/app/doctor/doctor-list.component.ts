 import { Component, OnInit } from '@angular/core';
 import { BaseListCtl } from '../base-list.component';
 import { ServiceLocatorService } from '../service-locator.service';
 import { ActivatedRoute } from '@angular/router';
 import { HttpClient } from '@angular/common/http';
 
 @Component({
   selector: 'app-doctorlist',
   templateUrl: './doctor-list.component.html',
   styleUrls: ['./doctor-list.component.css']
 })
 export class doctorlistComponent extends BaseListCtl implements OnInit {
   myKey = "";
 
   public form = {
     error: false,
     message: null,
     preload: [],
     data: { id: null },
     inputerror: {},
     searchParams: {},
     searchMessage: null,
     list: [],
     pageNo: 0
   };
 
   base64Data: any;
   retrieveResonse: any;
   message: string;
 
   constructor(public locator: ServiceLocatorService, public route: ActivatedRoute, private httpClient: HttpClient) {
     super(locator.endpoints.DOCTOR, locator, route);
   }
 }
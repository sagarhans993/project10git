import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';
import { HttpClientModule, HttpClient, HTTP_INTERCEPTORS } from '@angular/common/http';
import { CookieService } from 'ngx-cookie-service';

import { AppComponent } from './app.component';
import { MarksheetComponent } from './marksheet/marksheet.component';
import { StudentComponent } from './student/student.component';
import { CollegeComponent } from './college/college.component';
import { AppRoutingModule } from './app-routing.module';
import { HttpServiceService } from './http-service.service';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { DataValidator } from './utility/data-validator';
import { ForgotPasswordComponent } from './login/forgotpassword.component';
import { SignUpComponent } from './login/signup.component';
import { MessageComponent } from './message/message.component';
import { MessageListComponent } from './message/message-list.component';
import { MarksheetListComponent } from './marksheet/marksheet-list.component';
import { CollegeListComponent } from './college/college-list.component';
import { StudentListComponent } from './student/student-list.component';
import { UserComponent } from './user/user.component';
import { UserListComponent } from './user/user-list.component';
import { RoleComponent } from './role/role.component';
import { CourseComponent } from './course/course.component';
import { SubjectComponent } from './subject/subject.component';
import { RoleListComponent } from './role/role-list.component';
import { TimetableComponent } from './timetable/timetable.component';
import { CourseListComponent } from "./course/course-list.component";
import { FacultyComponent } from './faculty/faculty.component';
import { FacultyListComponent } from "./faculty/faculty-list.component";
import { FileComponent } from './file/file.component';
import { TimetableListComponent } from "./timetable/timetable-list.component";
import { SubjectListComponent } from "./subject/subject-list.component";
import { MarksheetmeritListComponent } from "./marksheet/marksheetmerit-list.component";
import { GetmarksheetComponent } from "./marksheet/getmarksheet.component";
import { ChangepasswordComponent } from "./user/changepassword.component";
import { LoaderComponent } from "./loader/loader.component";
import { NavbarComponent } from './navbar/navbar.component';
import { SpinnerComponent } from './spinner/spinner.component';
import { FooterComponent } from './footer/footer.component';
import { MyprofileComponent } from './user/myprofile.component';
import { AuthService } from './auth-service.service';
import { OwnerComponent } from './owner/owner.component';
import { OwnerlistComponent } from './owner/ownerlist.component';
import { PositionComponent } from './position/position.component';
import { PositionlistComponent } from './position/positionlist.component';
import { AssetComponent } from './asset/asset.component';
import { AssetListComponent } from './asset/assetlist.component';
import { ProprietorComponent } from './proprietor/proprietor.component';
import { ProprietorlistComponent } from './proprietor/proprietorlist.component';
import { PathComponent } from './path/path.component';
import { PathlistComponent } from './path/pathlist.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeelistComponent } from './employee/employeelist.component';
import { CustomerComponent } from './customer/customer.component';
import { CustomerListComponent } from './customer/customerlist/customerlist.component';
import { ItemComponent } from './item/item.component';
import { ItemListComponent } from './item/itemlist.component';
import { CartComponent } from './cart/cart.component';
import { CartListComponent } from './cart/cartlist.component';
import { PhysicianComponent } from './physician/physician.component';
import { PhysicianListComponent } from './physician/physician-list/physician-list.component';
import { medicationlistComponent } from './medication/medication-list.component';
import { medicationComponent } from './medication/medication.component';
import { doctorComponent } from './doctor/doctor.component';
import { doctorlistComponent } from './doctor/doctor-list.component';
 
 
  
export function myHttpLoader(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}

@NgModule({
  declarations: [
    AppComponent,
    MarksheetComponent,
    MarksheetListComponent,
    StudentComponent,
    StudentListComponent,
    CollegeComponent,
    CollegeListComponent,
    LoginComponent,
    DashboardComponent,
    ForgotPasswordComponent,
    SignUpComponent,
    MessageComponent,
    MessageListComponent,
    UserComponent,
    UserListComponent,
    RoleComponent,
    RoleListComponent,
    CourseComponent,
    SubjectComponent,
    SubjectListComponent,
    TimetableComponent,
    CourseListComponent,
    FacultyComponent,
    FacultyListComponent,
    TimetableListComponent,
    MarksheetmeritListComponent,
    GetmarksheetComponent,
    ChangepasswordComponent,
    LoaderComponent,
    FileComponent,
    NavbarComponent,
    SpinnerComponent,
    FooterComponent,
    MyprofileComponent,
    OwnerComponent,
     OwnerlistComponent,
    PositionComponent,
    PositionlistComponent,
    AssetComponent,
    AssetListComponent,
    ProprietorComponent,
    ProprietorlistComponent,
    PathComponent,
    PathlistComponent,
    EmployeeComponent,
    EmployeelistComponent,
    CustomerComponent,
    CustomerListComponent,
    ItemComponent,
    ItemListComponent,
    CartComponent,
    CartListComponent,

    PhysicianComponent,
    PhysicianListComponent,
    medicationComponent,
    medicationlistComponent,
    doctorComponent,
    doctorlistComponent,
      
   
     
  
     
     
    
   
    
  ],
  imports: [
    BrowserModule,
    TranslateModule.forRoot({
      loader: {
        provide: TranslateLoader,
        useFactory: myHttpLoader,
        deps: [HttpClient]
      }
    }),
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [
    {
      provide: HTTP_INTERCEPTORS, 
      useClass: AuthService, 
      multi: true 
    },
    HttpServiceService,
    DataValidator,
    CookieService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

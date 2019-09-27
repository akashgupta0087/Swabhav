import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from "@angular/forms";

import { WelcomeComponent } from './welcome/welcome.component';
import { StudentComponent } from './student/stdudent.component';
import { BlueBallComponent } from './blueBall/blueBall.component';
import { TwoWayComponent } from './twoWay/twoWay.component'

@NgModule({
  declarations: [
    WelcomeComponent, StudentComponent, BlueBallComponent, TwoWayComponent
  ],
  imports: [
    BrowserModule,FormsModule
  ],
  providers: [],
  bootstrap: [WelcomeComponent]
})
export class AppModule { }

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from "@angular/forms";

import { WelcomeComponent } from './welcome/welcome.component';
import { StudentComponent } from './student/stdudent.component';
import { BlueBallComponent } from './blueBall/blueBall.component';
import { TwoWayComponent } from './twoWay/twoWay.component'
import { MathService } from './service/MathService';
import { QuestionService } from './service/QuestionService';
import{ QuestionComponent } from './question/question.component'

@NgModule({
  declarations: [
    WelcomeComponent, StudentComponent, BlueBallComponent, TwoWayComponent,QuestionComponent
  ],
  imports: [
    BrowserModule,FormsModule
  ],
  providers: [MathService,QuestionService],
  bootstrap: [WelcomeComponent]
})
export class AppModule { }

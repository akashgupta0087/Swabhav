import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from "@angular/forms";
import { HttpModule } from '@angular/http'
import { MatTooltipModule} from '@angular/material/tooltip'
import { BrowserAnimationsModule} from '@angular/platform-browser/animations'

import { WelcomeComponent } from './welcome/welcome.component';
import { StudentComponent } from './student/stdudent.component';
import { BlueBallComponent } from './blueBall/blueBall.component';
import { TwoWayComponent } from './twoWay/twoWay.component'
import { MathService } from './service/MathService';
import { QuestionService } from './service/QuestionService';
import { QuestionComponent } from './question/question.component'
import { SqrtPipe } from './custom Pipe/srrtPipe';
import { ParentChildComponent } from './parentChild/parentChild.component';
import { ToggleBtnComponent } from './parentChild/toggle/togglebtn.component';
import { RatingComponent } from './parentChild/rating/rating.component';
import { NumbersApiComponent } from './numbers API/numbersApi.component';


@NgModule({
  declarations: [
    WelcomeComponent, StudentComponent, BlueBallComponent, TwoWayComponent, QuestionComponent, SqrtPipe, ParentChildComponent, ToggleBtnComponent, RatingComponent,NumbersApiComponent
  ],
  imports: [
    BrowserModule, FormsModule, HttpModule, MatTooltipModule, BrowserAnimationsModule
  ],
  providers: [MathService, QuestionService],
  bootstrap: [WelcomeComponent]
})
export class AppModule { }

import { Component } from "@angular/core";
import { QuestionService } from '../service/QuestionService';

@Component({
    selector: 'aurionpro-question',
    templateUrl: './question.component.html'
})
export class QuestionComponent{
    questions: String[]
    quesNo:number
    question:String

    constructor(private questionService:QuestionService){
        this.questions = []
        this.questions = questionService.Questions
        console.log(this.questions)
        this.quesNo = 0
    }
    
    getQuestion(){
        this.quesNo++
    }
}
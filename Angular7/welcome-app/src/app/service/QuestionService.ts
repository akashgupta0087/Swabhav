export class QuestionService{
    questions : String[]

    get Questions(){
        return  this.questions = ["Q1.This is question1", "Q2.This is question2", "Q3.This is question3", "Q4.This is question4"]   
    }

}
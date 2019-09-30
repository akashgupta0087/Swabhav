import { Component } from "@angular/core";

@Component({
    selector: 'aurionpro-parentChild',
    templateUrl: './parentChild.component.html'
})
export class ParentChildComponent{
    status: String
    rate : String
    constructor() {
        console.log("Inside parent constructor")
    }

    stateChangeHandler(event){
        this.status = event
    }

    displayRatingHandler(event){
        this.rate = event
    }
}
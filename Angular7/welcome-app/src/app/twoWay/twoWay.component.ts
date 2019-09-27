import { Component } from "@angular/core";


@Component({
    selector: 'aurionpro-twoWay',
    templateUrl: './twoWay.component.html'
})
export class TwoWayComponent{
    firstName: String
    lastName: String

    constructor(){
        this.firstName = "Akash"
        this.lastName = "Gupta"  
    }

    firstNameChange(e){
        console.log(e)
        this.firstName = e
    }

}
import { Component, Input, OnInit, Output,EventEmitter } from "@angular/core";

@Component({
    selector: 'aurionpro-togglebtn',
    templateUrl: './togglebtn.component.html'
})
export class ToggleBtnComponent implements OnInit{
    @Input()
    textContent: String
    state: number
    @Input()
    onStateColor: String
    @Input()
    offStateColor: String
    buttonColor: String
    @Output()
    stateChange: EventEmitter<String> = new EventEmitter<String>()

    constructor(){
        console.log("Inside toggle btn constructor")
        this.state = 0
    }

    ngOnInit(){
        console.log("Inside ngOnInit")
        if(this.textContent == "")
        {
            console.log("Inside if")
            this.textContent = "AurionPro"
        }
        this.buttonColor = this.offStateColor
        this.stateChange.emit("State is: "+ this.state)
    }

    clickHandler(){
        if(this.state == 0){
            this.state = 1
            this.buttonColor = this.onStateColor
        }
        else{
            this.state = 0
            this.buttonColor = this.offStateColor
        }

        this.stateChange.emit("State is: "+ this.state)
    }

}
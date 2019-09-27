import { Component } from "@angular/core";
import { Ball } from './Ball';

@Component({
    selector: 'aurionpro-blueBall',
    templateUrl: './blueBall.component.html'
})
export class BlueBallComponent {
    balls: Ball[]

    constructor(){
        this.balls = []
    }

    makeBalls() {
        for (let i = 0; i < 50; i++) {
            this.balls.push(new Ball(i+1))
        }
    }
    
}
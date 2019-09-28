import { Component } from "@angular/core";
import { Ball } from './Ball';

@Component({
    selector: 'aurionpro-blueBall',
    templateUrl: './blueBall.component.html'
})
export class BlueBallComponent {
    balls: Ball[]
    randomNumber: number
    attempts: number
    result: String

    constructor() {
        this.balls = []
        this.randomNumber = Math.floor((Math.random() * 50) + 1);
        console.log(this.randomNumber)
        this.attempts = 3
    }

    makeBalls() {
        for (let i = 0; i < 50; i++) {
            this.balls.push(new Ball(i + 1))
        }
    }

    changeColor(ball) {
        this.attempts--
        if (this.attempts <= 3 && this.attempts >= 0) {
            if (this.randomNumber < ball.Id) {
                ball.Color = "green"
                this.result = this.getResult(ball.Color)
            }
            if (this.randomNumber > ball.Id) {
                ball.Color = "red"
                this.result = this.getResult(ball.Color)
            }
            if (this.randomNumber == ball.Id) {
                ball.Color = "blue"
                this.result = this.getResult(ball.Color)
            }
        }
    }

    getResult(ballColor) {
        if (ballColor == "blue")
            return "Win!!"
        if (this.attempts == 0)
            return "Loose!!"
    }
}
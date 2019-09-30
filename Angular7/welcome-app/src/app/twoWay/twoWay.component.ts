import { Component } from "@angular/core";
import { MathService } from '../service/MathService';


@Component({
    selector: 'aurionpro-twoWay',
    templateUrl: './twoWay.component.html'
})
export class TwoWayComponent {
    firstName: String
    lastName: String
    number: number
    numberAsync: number
    primeAsyncColor: String

    constructor(private mathService: MathService) {
        this.firstName = "Akash"
        this.lastName = "Gupta"
    }

    firstNameChange(e) {
        console.log(e)
        this.firstName = e
    }

    isPrime() {
        if (this.number) {
            if (this.number == 1)
                return "white"

            if (this.mathService.checkPrime(this.number))
                return "green"

            return "red"
        }
    }

    observe() {
        this.mathService.getData().subscribe((data) => {
            console.log(data)
        },
            (error) => {
                console.log(error)
            },
            () => {
                console.log("Finished")
            })
    }

    isPrimeAsync(e) {
        this.numberAsync = e
        if (this.numberAsync) {
            if (this.numberAsync == 1)
                return this.primeAsyncColor = "white"
            this.mathService.checkPrimeAsync(this.numberAsync).subscribe((data) => {
                if (data)
                    this.primeAsyncColor = "green"
                else
                    this.primeAsyncColor = "red"
            },
                (error) => {
                    console.log(error)
                })
        }
    }

    // numberAsyncChange(e) {
    //     this.numberAsync = e
    // }

    // isPrimeAsync(){
    //     if (this.numberAsync) {
    //         console.log(this.numberAsync)
    //         if (this.numberAsync == 1)
    //             return "white"

    //         this.mathService.checkPrimeAsync(this.numberAsync)
    //         .then(function(fromResolve) {
    //             console.log(fromResolve)
    //             if(!fromResolve)
    //                 return "red"
    //         })
    //         .catch(function (fromReject) {
    //                 console.log(fromReject)
    //                 if(fromReject)
    //                     return "green"
    //         })
    //     }
    // }
}


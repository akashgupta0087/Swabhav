import { Component, OnInit } from "@angular/core";
import { Http } from '@angular/http';

@Component({
    selector: 'aurionpro-numbersApi',
    templateUrl: './numbersApi.component.html'
})
export class NumbersApiComponent implements OnInit {

    number: number
    facts: String[]
    constructor(private http: Http) {
        this.facts = []
    }

    ngOnInit() {

    }

    getFacts() {
        let link = "http://numbersapi.com/" + this.number
        this.http.get(link)
            .subscribe((data) => {
                // console.log(data._body)
                this.facts.unshift(data.text())
            })
    }
}
import { Component } from '@angular/core'
import { IStudent } from './IStudent'

@Component({
    selector: 'aurionpro-student',
    templateUrl: './student.component.html'
})
export class StudentComponent{
    student: IStudent
    students: IStudent[]
    imgWidth: Number
    imgHeight: Number

    constructor(){
        this.student = {
            rollNo : 101,
            cgpa: 8.5,
            name: "Sachin",
            photo: "../assets/sachin.jpg"
        }
        this.imgWidth = 200
        this.imgHeight = 150
    }

    convertCGPAToColor(cgpa) {
        if(cgpa >= 8)
            return "green"
        else if(cgpa < 8 && cgpa >= 6.75) 
            return "yellow"
        return "red"
    }

    loadStudents(){
        console.log("Inside LoadStudents()")
        this.students = [this.student,{rollNo:102,cgpa:7.83,name:"Virat",photo:"../assets/virat.jpg"},{rollNo:103,cgpa:6.00,name:"Rashi",photo:"../assets/rashi.jpg"}]
    }
}


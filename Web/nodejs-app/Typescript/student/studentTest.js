"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var student_1 = require("./student");
var student1 = new student_1.Student(101, "Sachin");
var student2 = new student_1.Student(102, "Virat");
var address1 = new student_1.Address("Mumbai");
var address2 = new student_1.Address("New Delhi");
console.log(student1);
console.log(student2);
console.log(address1);
console.log(address2);
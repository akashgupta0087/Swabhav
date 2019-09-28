// import { Injectable } from '@angular/core'
// If using this, then no need to add in app.module
// or vice-versa
// @Injectable({
//     providedIn: 'root'
// })           
export class MathService {

    checkPrime(number) {
        for (var i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false
        }
        return true
    }

    checkPrimeAsync(number): Promise<boolean> {
        return new Promise(function (resolve, reject) {
            // for (var i = 2; i <= number / 2; i++) {
            if (number % 2 == 0)
                resolve(false)
            // }
            reject(true)
        })
    }

}
class Customer{
    _id:number
    _firstName:String
    _lastName:String

    constructor(id:number,firstName:String,lastName:String){
        this._id = id
        this._firstName = firstName
        this._lastName = lastName
    }

    get Id(){
        return this._id
    }

    get FirstName(){
        return this._firstName
    }

    get LastName(){
        return this._lastName
    }

    set Id(id:number){
        this._id = id
    }

    set FirstName(name:String){
        this._firstName = name
    }

    set LastName(name:String){
        this._lastName = name
    }
}

let c1 = new Customer(101,"Sachin","Tendulkar")

console.log(c1)
console.log(c1.Id)
console.log(c1.FirstName)
console.log(c1.LastName)
console.log(c1._firstName)

c1.Id = 102
c1.FirstName = "Virat"
c1.LastName = "Kholi"
console.log(c1)
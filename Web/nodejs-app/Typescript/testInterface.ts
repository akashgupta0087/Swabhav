interface ICustomer{
    id: number,
    firstName: String,
    lastName: String,
    location?: String
}

function printInfo(customers:ICustomer[]){
    for(let c of customers){
        console.log(c)
    }
    // customers.forEach(function(value){
    //     console.log(value)
    // })
}

printInfo([{id:101,firstName:"Sachin",lastName:"Tendulkar"},
{id:102,firstName:"Virat",lastName:"Kholi",location:"India"}])
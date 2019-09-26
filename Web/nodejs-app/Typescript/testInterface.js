function printInfo(customers) {
    for (var _i = 0, customers_1 = customers; _i < customers_1.length; _i++) {
        var c = customers_1[_i];
        console.log(c);
    }
    // customers.forEach(function(value){
    //     console.log(value)
    // })
}
printInfo([{ id: 101, firstName: "Sachin", lastName: "Tendulkar" },
    { id: 102, firstName: "Virat", lastName: "Kholi", location: "India" }]);

var Customer = /** @class */ (function () {
    function Customer(id, firstName, lastName) {
        this._id = id;
        this._firstName = firstName;
        this._lastName = lastName;
    }
    Object.defineProperty(Customer.prototype, "Id", {
        get: function () {
            return this._id;
        },
        set: function (id) {
            this._id = id;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Customer.prototype, "FirstName", {
        get: function () {
            return this._firstName;
        },
        set: function (name) {
            this._firstName = name;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Customer.prototype, "LastName", {
        get: function () {
            return this._lastName;
        },
        set: function (name) {
            this._lastName = name;
        },
        enumerable: true,
        configurable: true
    });
    return Customer;
}());
var c1 = new Customer(101, "Sachin", "Tendulkar");
console.log(c1);
console.log(c1.Id);
console.log(c1.FirstName);
console.log(c1.LastName);
console.log(c1._firstName);
c1.Id = 102;
c1.FirstName = "Virat";
c1.LastName = "Kholi";
console.log(c1);

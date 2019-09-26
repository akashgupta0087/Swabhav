angular.module('emp.module')
    .factory('empFactory', function () {

        var factory = {}

        factory.employees = [{
            id: "1569326064064",
            name: "Sachin",
            age: 40,
            gender: "Male",
            job: "Manager",
            salary: 5000
        },
        {
            id: "1569326471843",
            name: "Virat",
            age: 30,
            gender: "Male",
            job: "Programmer",
            salary: 3000
        },
        {
            id: "1569326584891",
            name: "Dhoni",
            age: 35,
            gender: "Male",
            job: "Analyst",
            salary: 2500
        },
        {
            id: "1569325787029",
            name: "Ronaldo",
            age: 46,
            gender: "Male",
            job: "Programmer",
            salary: 3000
        },
        {
            id: "1569326471648",
            name: "Messi",
            age: 42,
            gender: "Male",
            job: "Analyst",
            salary: 2500
        },
        {
            id: "1569326538826",
            name: "Amy",
            age: 32,
            gender: "Female",
            job: "Manager",
            salary: 5000
        }]

        factory.jobs = ["Manager", "Programmer", "Analyst", "Clerk"]


        factory.Employee = function (name, age, gender, job, salary) {
            this.id = Date.now().toString()
            this.name = name
            this.age = age
            this.gender = gender
            this.job = job
            this.salary = salary
        }

        factory.getEmployees = function () {
            return factory.employees
        }

        factory.addEmployee = function (employee) {
            factory.employees.unshift(employee)
        }

        factory.deleteEmployee = function (employeeId) {
            console.log("Inside delete Service")
            for (var i = 0; i < factory.employees.length; i++) {
                if (factory.employees[i].id == employeeId) {
                    factory.employees.splice(i, 1)
                }
            }
            console.log(factory.employees)
        }

        factory.getEmployee = function (employeeId) {
            for (var i = 0; i < factory.employees.length; i++) {
                if (factory.employees[i].id == employeeId) {
                    return factory.employees[i]
                }
            }
        }

        factory.updateEmployee = function (updatedEmployee) {
            for (var i = 0; i < factory.employees.length; i++) {
                if (factory.employees[i].id == updatedEmployee.id) {
                    factory.employees.splice(i, 1, updatedEmployee)
                }
            }
        }

        return factory
    })


angular.module('emp.module')
    .factory('authService', function () {
        var auth = {}

        auth.admin = {
            username: "admin",
            password: "admin"
        }

        auth.isLogged = false

        auth.login = function (username, password) {
            if (username == auth.admin.username && password == auth.admin.password) {
                alert("Success")
                auth.isLogged = true
                localStorage.setItem("empLogged", auth.isLogged)
            }
            else
                alert("Failure")
            return auth.isLogged
        }

        auth.getLoginStatus = function () {
            if(localStorage.getItem("empLogged") == "true"){
                return true
            }
            return false
        }

        auth.logout = function () {
            console.log("Inside logout()")
            auth.isLogged = false
            localStorage.setItem("empLogged", auth.isLogged)
            console.log(localStorage.getItem("empLogged"))
        }

        return auth
    })


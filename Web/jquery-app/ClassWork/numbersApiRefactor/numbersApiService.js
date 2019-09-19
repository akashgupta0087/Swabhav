
var numbersApi = function () {
    var service = {}
    var facts = []

    service.getFacts = function (number) {
        return new Promise(function (resolve, reject) {
            var link = "http://numbersapi.com/" + number
            $.ajax({
                url: link,
                success: function (data) {
                    resolve(data)
                    facts = localStorage.getItem("factsArray") ? JSON.parse(localStorage.getItem("factsArray")) : []
                    facts.push(data)
                    localStorage.setItem("factsArray", JSON.stringify(facts))
                },
                error: function () {
                    reject("Data not fetched")
                }
            })
        })
    }

    service.loadPreviousFacts = function () {
        facts = JSON.parse(localStorage.getItem("factsArray"))
        return facts
    }

    return service;
}()
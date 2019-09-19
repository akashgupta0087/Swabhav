
var students = []

function Student(rollNo, name, age, email, date, isMale) {
    this.rollNo = rollNo
    this.name = name
    this.age = age
    this.email = email
    this.date = date
    this.isMale = isMale
}

function addStudent() {
    console.log("Inside addStduent()")

    var rollNo = $("#rollNo").val()
    var name = $("#name").val()
    var age = $("#age").val()
    var email = $("#email").val()
    var date = $("#date").val()
    var gender = $("input[name='gender']:checked").val()
    var isMale = false

    if (gender == "male") {
        isMale = true
    }

    var student = new Student(rollNo, name, age, email, date, isMale)

    putData(student)

}

getData();

function getData() {
    document.getElementById("table").innerHTML = " "
    document.getElementById("loading").src = "Spinner-1s-200px.gif"
    var txt = ""
    $.ajax({
        type: "GET",
        url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students", success: function (result) {
            document.getElementById("loading").style.display = "none"
            students = result
            console.log(students)
            txt += "<table id=tableArea class='table' border='1'> <br> <tr> <td>Id</td> <td>RollNo</td> <td>Name</td> <td>Age</td> <td>Email</td> <td>Date</td> <td>Gender</td> <td>Update</td> <td>Delete</td></tr>"
            for (var i = 0; i < students.length; i++) {
                // if (students[i].isMale)
                //     students[i].isMale = "Male"
                // else
                //     students[i].isMale = "Female"

                txt += "<tr><td>" + students[i].id + "</td>"
                    + "<td>" + students[i].rollNo + "</td>"
                    + "<td>" + students[i].name + "</td>"
                    + "<td>" + students[i].age + "</td>"
                    + "<td>" + students[i].email + "</td>"
                    + "<td>" + students[i].date + "</td>"
                    + "<td>" + getGender(students[i].isMale) + "</td>"
                    + "<td> <button id=u" + students[i].id + " onclick=update(students[" + i + "])>Edit</button> </td>"
                    + "<td> <button id=" + students[i].id + " class='deletebtn glyphicon glyphicon-remove'></button> </td> </tr>"
            }

            txt += "</table>"
            document.getElementById("table").innerHTML = "<center> Found <span class='badge'>" + i + "</span> students </center>" + txt

            for (var i = 0; i < students.length; i++) {
                $("#" + students[i].id).on('click', function () {
                    deleteData(this.id)
                })

            }

        }
    })
}

function getGender(isMale) {
    if (isMale)
        return "Male"
    else
        return "Female"
}

function putData(objData) {
    $.ajax({
        type: "POST",
        url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students",
        data: objData,
        success: function (data) {
            alert("Success")
            getData()
        },

        error: function (data) {
            alert("Error")
        }

    }
    )

    // $.post("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students",objData,function(data,status){
    //     alert("Data: " + data + "Status: " + status)
    // })
}

function deleteData(id) {
    $.ajax({
        type: "DELETE",
        url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + id,

        success: function (data) {
            alert("Success")
            getData()
        },

        error: function (data) {
            alert("Error")
        }

    }
    )

}

function update(student) {
    console.log(student)

    $("#rollNo").val(student.rollNo)
    $("#name").val(student.name)
    $("#age").val(student.age)
    $("#email").val(student.email)
    $("#date").val(student.date)
    console.log(student.isMale)
    if (student.isMale)
        $("#male").prop("checked", true)
    else
        $("#female").prop("checked", true)
    
    $("#updateButton").html("<input type='button' value='Update' class='btn btn-primary'>")

}

// function updateData(){
//     var rollNo = $("#rollNo").val()
//     var name = $("#name").val()
//     var age = $("#age").val()
//     var email = $("#email").val()
//     var date = $("#date").val()
//     var gender = $("input[name='gender']:checked").val()
//     var isMale = false

//     if (gender == "male") {
//         isMale = true
//     }

//     var student = new Student(rollNo, name, age, email, date, isMale)

    
// }



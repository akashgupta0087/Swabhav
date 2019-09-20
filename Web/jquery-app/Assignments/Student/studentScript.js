
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
    $("#addButton").attr("disabled", true)
    document.getElementById("table").innerHTML = " "
    document.getElementById("loading").src = "Spinner-1s-200px.gif"
    var txt = ""
    $.ajax({
        type: "GET",
        url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students", success: function (result) {
            document.getElementById("loading").style.display = "none"
            students = result
            console.log(students)
            txt += "<table id=tableArea class='table table-bordered'> <br> <tr> <th>Id</th> <th>RollNo</th> <th>Name</th> <th>Age</th> <th>Email</th> <th>Date</th> <th>Gender</th> <th>Update</th> <th>Delete</th></tr>"
            for (var i = 0; i < students.length; i++) {
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
            document.getElementById("table").innerHTML = "<center style='font-weight:bold'> Found <span class='badge'>" + i + "</span> students </center>" + txt
            $("#addButton").attr("disabled", false)

            for (var i = 0; i < students.length; i++) {
                $("#" + students[i].id).on('click', function () {
                    var deleteStudent = confirm("Do you want to delete the current data")
                    if(deleteStudent){
                    deleteData(this.id)
                    }
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
    $('#u'+student.id).css("background","yellow")
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
    
    $("#updateButton").html("<input type='button' value='Update' class='btn btn-primary' onclick=updateData('"+student.id+"')>")
    $("#cancelUpdation").html("<input type='button' value='Cancel' class='btn btn-danger' onclick=cancelUpdate('"+student.id+"')>")

}

function updateData(id){
    console.log("Inside UpdateData()")
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

    $.ajax({
        type: "PUT",
        url: "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + id,
        data: student,
        success: function (data) {
            document.getElementById("updateButton").innerHTML = " "
            getData()
        },

        error: function (data) {
            alert("Error")
        }

    }
    )  
}

function cancelUpdate(id){
    $('#u'+id).css("background","")
    document.getElementById("updateButton").innerHTML = " "
    document.getElementById("cancelUpdation").innerHTML = " "
}



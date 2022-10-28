<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <!-- <script src="jquery-3.6.0.min.js"></script> -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
    <h1 align="center">Welcome</h1>
    <div style="text-align-last: center;">
        <label>Full Name : <br></label><input type="text" id="name"><br>
        <label>DOB : <br></label><input type="text" id="dob"><br>
        <label>Email : <br></label><input type="text" id="email"><br>
        <label>Phone Number : <br></label><input type="text" id="phone"><br><br>
        <button id="submitbtn" style="background-color: cornflowerblue; border-radius: 15px;">Submit</button>
    </div>

<script>

document.querySelector("#submitbtn").addEventListener("click",function(){

    let obj = {
     fullName : document.querySelector("#name").value,
     dob : document.querySelector("#dob").value,
     email : document.querySelector("#email").value,
     phone : document.querySelector("#phone").value,
    }

    $.ajax({
        url: "/senddata",
        type:"POST",
        data: JSON.stringify(obj),
        contentType: false,
        success:function(response){
            console.log(response);
            location.href = "/done";
        },
        error:function(error){
            console.log(error);
        }
    })
})
</script>
</body>
</html>
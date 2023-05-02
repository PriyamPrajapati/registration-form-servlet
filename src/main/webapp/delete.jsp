<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        * {
            margin: 0px;
            padding: 0px;
            box-sizing: border-box;
        }

        .top {
            display: flex;
            justify-content: center;
        }
        .top2{
            display: flex;
            justify-content: center;
        }

        .img1 {
            width: 400px;
            height: 200px;
            background-size: cover;
            margin-bottom: 20px;
        }
        .text1{
            width: 400px;
            height: 30px;
            border-radius: 5px;
        }
        .form1{
            display: flex;
            flex-direction: column;
            gap: 20px;
            margin-bottom: 100px;
        }
        .btn{
            background-color: blue;
            width: 100px;
            height: 35px;
            border-radius: 7px;
        }
        .btn:hover{
            background-color: red;
        }
    </style>
</head>

<body>
    <div class="top2"><img src="https://upload.wikimedia.org/wikipedia/commons/9/99/Purvanchalmain.jpg" class="img1"></div>
    <section class="top">
        <div>
            <form class="form1" action="delete" method="post">
                <div><div>Id:</div><input type="number" name="id" placeholder="Enter Your Id" class="text1"></div>
                <div><input type="submit" class="btn"> <a href="home.jsp">Home</a></div>
            </form>
        </div>
    </section>
</body>
</html>
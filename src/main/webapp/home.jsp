<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentLoginForm</title>
<style>
        *{
            margin: 0px;
            padding: 0px;
            box-sizing: border-box;
        }
        .top1{
            display: flex;
            gap: 20px;
            list-style: none;
            background-color: black;
            width: 100%;
            height: 40px;
            border-radius: 6px;
            justify-content: center;
            position: fixed;
        }
        .top1 a{
            text-decoration: none;
            color: white;
            font-size: 20px;
        }
        .top1 a:hover{
            color: red;
        }
        .top1 li {
            padding-top: 10px;
        }
        .img1{
            width: 100%;
            height: 500px;
            background-size: cover;
        }
    </style>
</head>
<body>
    <nav class="top">
        <ul class="top1">
            <li><a href="home.jsp">Home</a></li>
            <li><a href="register.jsp">Register</a></li>
            <li><a href="update.jsp">Update</a></li>
            <li><a href="delete.jsp">Delete</a></li>
            <li><a href="display.jsp">Display</a></li>
        </ul>
    </nav>
    <div><img src="https://upload.wikimedia.org/wikipedia/commons/9/99/Purvanchalmain.jpg" class="img1"></div>
</body>
</html>
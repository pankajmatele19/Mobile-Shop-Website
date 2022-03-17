

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="userhome.css">
    </head>

    <body>
        <header>
            <div class="links">
                <ul>
                    <li><h3>PEXELS</h3></li>
                    <li><a href="home.html">HOME</a></li>
                    <li><a href="shop.html">SHOP</a></li>
                    <li><a href="dashboard.jsp">PROFILE</a></li>
                </ul>
            </div>
            <div class="cred">
                <b> Welcome ${User}</b>
            </div>
        </header>
        <div class="cover">

            <a href="shop.html"><img src="img/cover.png"></a>
        </div>
        <div class="collection">
            <h2>Our Collection</h2>
        </div>
        <div class="container" style="background-image: url('img/container.jpg');">
            <div class="row">
                <a href="shop.html"><img src="img/iphone11.jpg" title="Samsung S20"></a>
                <div class="content">
                    <h3>Apple Iphone 11</h3><br>
                </div>
            </div>
            <div class="row">
                <a href="shop.html"><img src="img/iphone11tale.jpg" title="Samsung S20"></a>
                <div class="content">
                    <h3>Apple Iphone 13</h3><br>
                </div>
            </div>
            <div class="row">
                <a href="shop.html"><img src="img/s21.jpg" title="Samsung S20"></a>
                <div class="content">
                    <h3>Samsung S21</h3><br>
                </div>
            </div>
            <div class="row">
                <a href="shop.html"><img src="img/note20.jpg" title="Samsung S20"></a>
                <div class="content">
                    <h3>Samsung Note 20</h3><br>
                </div>
            </div>
        </div>
        <div class="offer">
            <img src="img/offer.png" href="shop.html">
        </div>
        <footer>
            <h2>PEXELS</h2>
            <h3>Created By Pankaj Kisan Matele</h3>

        </footer>

    </body>

</html>

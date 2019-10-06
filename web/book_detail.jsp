<%@ page import="java.util.List" %>
<%@ page import="com.bo.entity.Book" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书详情页面</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css">
    <style type="text/css">
        h2, h3 {
            color: rgb(73, 73, 73);
        }

        #search {
            height: 80px;
            background-color: rgb(246, 246, 241);
            display: flex;
            align-items: center;
            padding-left: 8%;
            margin-bottom: 10px;
        }

        .search-input {
            flex: 0 0 40%;
            height: 35px;
            background-color: #fff;
            border: none;
            border-radius: 3px;
            margin-left: 50px;
        }

        .search-btn {
            width: 35px;
            height: 35px;
            background-color: rgb(155, 154, 143);
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .search-btn img {
            width: 50%;
            height: 50%;
        }


        .col-4 img {
            margin: 10px 5px 20px 5px;
            width: 80%;
        }

        hr {
            width: 90%;
            color: #eee;
            margin-top: 10px;
        }

        .col-6 {
            height: 400px;
            padding-right: 10px;
        }

        .col-6 img {
            width: 100%;
            height: 100%;
            border-radius: 20px;
        }
    </style>
</head>
<body>
<%
    Book book = (Book) request.getAttribute("book");
    pageContext.setAttribute("book", book);
%>

<div id="top">
    <jsp:include page="top.jsp"/>
</div>

<div id="search">
    <h2>读书时刻</h2>
    <input type="text" placeholder="请输入书名或作者" class="search-input">
    <div class="search-btn">
        <img src="${pageContext.request.contextPath}/images/search.png" alt="">
    </div>
</div>

<div class="container">
    <div class="row">
        <div class="col-8">
            <h3>${book.name}</h3>
            <hr>
            <div class="row">
                <div class="col-6">
                    <img src="/images/${book.cover}" alt="">
                </div>
                <div class="col-4">
                    <p>${book.author}</p>
                </div>
            </div>
        </div>
        <div class="col-4">
            <h3>介绍</h3>
            <hr>
            《斗罗大陆Ⅳ终极斗罗 [1]  》是一部玄幻小说，作者是唐家三少，该作品于2018年12月14日首发于起点中文网。
            第四届橙瓜网络文学奖最具潜力十大动漫IP。 [2]
            第四届橙瓜网络文学奖最具潜力十大游戏IP。 [3]
            本书是《斗罗大陆》系列的第四部，讲述的是《斗罗大陆III龙王传说》一万年后的故事，作品继承了《斗罗大陆》系列的诸多设定。
            男女主角：蓝轩宇（唐轩宇）、冻千秋（白秀秀） [1]
            主要角色：娜娜（古月娜）、唐乐（唐舞麟）、原恩辉辉、蓝梦琴、钱磊、刘锋、唐雨格
        </div>
    </div>

</div>
</body>
</html>

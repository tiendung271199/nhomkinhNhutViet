<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/components/taglib.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Nhôm Kính Nhựt Việt</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <c:url value="/resources/nhomkinhnhutviet" var="contextPath" scope="application"></c:url>
    
    <link rel="apple-touch-icon" href="${contextPath}/assets/img/apple-icon.png">
    <link rel="shortcut icon" type="image/x-icon" href="${contextPath}/assets/img/favicon.ico">
    <!-- Load Require CSS -->
    <link href="${contextPath}/assets/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font CSS -->
    <link href="${contextPath}/assets/css/boxicon.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400;600&display=swap" rel="stylesheet">
    <!-- Load Template CSS -->
    <link rel="stylesheet" href="${contextPath}/assets/css/templatemo.css">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="${contextPath}/assets/css/custom.css">
</head>

<body>
    <tiles:insertAttribute name="header"></tiles:insertAttribute>
    <tiles:insertAttribute name="body"></tiles:insertAttribute>
    <tiles:insertAttribute name="footer"></tiles:insertAttribute>
    
    <!-- Bootstrap -->
    <script src="${contextPath}/assets/js/bootstrap.bundle.min.js"></script>
    <!-- Light box -->
    <script src="assets/js/fslightbox.js"></script>
    <script>
        fsLightboxInstances['gallery'].props.loadOnlyCurrentSource = true;
    </script>
    <!-- Load jQuery require for isotope -->
    <script src="${contextPath}/assets/js/jquery.min.js"></script>
    <!-- Isotope -->
    <script src="${contextPath}/assets/js/isotope.pkgd.js"></script>
    <!-- Page Script -->
    <script>
        $(window).load(function() {
            // init Isotope
            var $projects = $('.projects').isotope({
                itemSelector: '.project',
                layoutMode: 'fitRows'
            });
            $(".filter-btn").click(function() {
                var data_filter = $(this).attr("data-filter");
                $projects.isotope({
                    filter: data_filter
                });
                $(".filter-btn").removeClass("active");
                $(".filter-btn").removeClass("shadow");
                $(this).addClass("active");
                $(this).addClass("shadow");
                return false;
            });
        });
    </script>
    <!-- Templatemo -->
    <script src="${contextPath}/assets/js/templatemo.js"></script>
    <!-- Custom -->
    <script src="${contextPath}/assets/js/custom.js"></script>
</body>
</html>
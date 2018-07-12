<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="">
	<meta name="author" content="">
	<link rel="icon" href="<c:url value="/img/favicon.ico"></c:url>">

	<title>Home Page</title>

	<link href="<c:url value="/css/bootstrap.min.css"></c:url>" rel="stylesheet">
	<link href="<c:url value="/css/font-awesome.min.css"></c:url>" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Montserrat|Open+Sans" rel="stylesheet">

	<!-- Custom styles for this template -->
	<link href="<c:url value="/css/style.css"></c:url>" rel="stylesheet">

</head>
<body>
	<div class= "jumbotron">
		<h1> ${greeting}</h1>
        <p> ${hello}</p>
	</div>
	<tiles:insertAttribute name="navigation" />
	<div class="container wrapper">
		<div class="row">
			<div class="col-sm-12">
				<tiles:insertAttribute name="content" />
			</div>
		</div>
	</div>
	<tiles:insertAttribute name="footer" />
	<tiles:insertAttribute name="jslib" />
</body>
</html>
</main>

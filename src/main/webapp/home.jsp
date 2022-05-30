<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<div class="container">
		<h2>Welcome ,${emp.name}</h2>
		<h1>Your Id is ${emp.id}</h1>
		<hr />
		<a class="btn btn-danger" href="#">Logout</a>
	</div>
</body>
</html>
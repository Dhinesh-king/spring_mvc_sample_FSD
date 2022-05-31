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
<body class="align-center text-center">
	<form action="/login" method="post">
		<div class="form-group text-primary">
			<label>Username</label>
			<input class="form-input" type="text" name="username">
		</div>
		<div class="form-group">
			<label>Password</label>
			<input class="form-input" type="password" name="password">
		</div>
		<button type="submit">Login</button>
		<span>${message}</span>
	</form>
</body>
</html>


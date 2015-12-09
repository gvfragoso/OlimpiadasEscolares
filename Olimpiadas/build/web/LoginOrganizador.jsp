<%-- 
    Document   : LoginOrganizador
    Created on : 18/11/2015, 09:20:48
    Author     : TATIANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Olimpiadas Escolares</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link href="forms.css" rel="stylesheet" type="text/css" media="all" />
        <link href="http://fonts.googleapis.com/css?family=Varela+Round" rel="stylesheet" />
	<link href='https://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <form method="post" action="Login">
	<body>
        <div id="header">
			<div id="title"><p>Olimpíadas Escolares</p></div>
			<div id="desc"><p>Faça o seu login, organizador</p></div>
		</div>
		<div id="box">
			<div id="titulo">
				<table id="table">
					<tr>
						<td><h6>Siape</h6></td>
						<td><input class="textbox"  type="text" name="login" value="" size="50px" /></td>
					</tr>
					<tr>
						<td><h6>Senha</h6></td>
						<td><input class="textbox" type="password" name="senha" value="" size="50px" /></td>
					</tr>
				</table>
				<input class="botao" type="submit" value="logar" name="login" />
			</div>
		</div>
		<div id="linkCad">
			<a href="CadastroOrganizador.jsp">Não tem uma conta? Cadastre-se!</a>
		</div>
	</form>
    </body>
</html>

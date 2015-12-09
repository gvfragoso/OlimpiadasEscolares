<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Olimpíadas Escolares</title>
	<link href="forms.css" rel="stylesheet" type="text/css" media="all" />
	<link href="http://fonts.googleapis.com/css?family=Varela+Round" rel="stylesheet" />
	<link href='https://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
	<link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <form method="post" action="CadastroOrganizador">
			<div id="header">
				<div id="title"><p>Olimpíadas Escolares</p></div>
				<div id="desc"><p>Faça o seu cadastro, organizador</p></div>
			</div>
			<div id="box">
				<div id="titulo">
					<table id="table">
						<tr>
							<td><h6>Siape</h6></td>
							<td><input class="textbox" type="text" name="siape" value="" size="50px" /></td>
						</tr>
						<tr>
							<td><h6>Nome</h6></td>
							<td><input type="text" name="nomeorg" value="" size="50px" /></td>
						</tr>
						<tr>
							<td><h6>CPF</h6></td>
							<td><input class="textbox" type="text" name="cpforg" value="" size="50px" /></td>
						</tr>
						<tr>
							<td><h6>Senha</h6></td>
							<td><input class="textbox" type="password" name="senha" value="" size="50px" /></td>
						</tr>
					</table>
					<input class="botao" type="submit" value="Enviar" name="cadastrarOrganizador" />
					</div>
				</div>
		</form>
    </body>
</html>

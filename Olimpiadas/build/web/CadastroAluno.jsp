<!DOCTYPE html>
<html>
    <head>
			<title>Olimpiadas Escolares</title>
			<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
                        <link href="forms.css" rel="stylesheet" type="text/css" media="all" />
			<link href="http://fonts.googleapis.com/css?family=Varela+Round" rel="stylesheet" />
			<link href='https://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
			<link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <form method="post" action="CadastroAluno">
			<div id="header">
				<div id="title"><p>Olimpíadas Escolares</p></div>
				<div id="desc"><p>Faça o seu cadastro, aluno</p></div>
			</div>
			<div id="box">
				<div id="titulo">
					<table id="table">
						<tr>
							<td><h6>Nome</h6></td>
							<td><input type="text" name="nome" value="" size="50px" /></td>
						</tr>
						<tr>
							<td><h6>Matrícula</h6></td>
							<td><input type="text" name="matricula" value="" size="50px" /></td>
						</tr>
						<tr>
							<td><h6>Série</h6></td>
							<td><input type="text" name="serie" value="" size="50px" /></td>
						</tr>
						<tr>
							<td><h6>Login</h6></td>
							<td><input type="text" name="login" value="" size="50px" /></td>
						</tr>
						<tr>
							<td><h6>Senha</h6></td>
							<td><input type="text" name="senha" value="" size="50px" /></td>
						</tr>
						<tr>
							<td><h6>Data</h6></td>
							<td><input type="text" name="data" value="" size="50px" /></td>
						</tr>
					</table>
					<input type="submit" value="Enviar" name="cadastrarAluno" />
					</div>
				</div>
		</form>
    </body>
</html>
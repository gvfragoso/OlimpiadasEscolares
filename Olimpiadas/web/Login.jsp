<%-- 
    Document   : login
    Created on : 05/10/2015, 16:48:32
    Author     : Thayná
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
    		<title>Olimpiadas Escolares</title>
    		<link rel="stylesheet" type="text/css" href="style.css" />
	</head>
        <form method="post" action="Login">
	<body>
        	<div id="conteiner">
			<div id="top">
                		<h1>Olimpiadas Escolares</h1>
            		</div>
			<h2>Faça seu login</h2>
			<div id="body">
				<div id="blockDistinct">
                    			<table>
                        			<tr>
                            				<td>
                                				<h6>Login</h6>
                            				</td>
                            				<td>
                                                            <input type="text" name="login" value="" size="50px" />
                            				</td>
                        			</tr>
                        			<tr>
                            				<td>
								<h6>Senha</h6>
                            				</td>
                            				<td>
                                                            <input type="password" name="senha" value="" size="50px" />
                            				</td>
                        			</tr>
                        			<tr>
                            				<td>
                                                            <input type="submit" value="logar" name="login" />
                            				</td>
                        			</tr>
                        			<tr>
                            				<td>
                                				<a href="CadastroAluno.jsp">Não tem uma conta? Cadastre-se</a>
                            				</td>
                        			</tr>
                    			</table>
                    			<br />
                    			<table>
                        			<tr>
                            				<td>
                                				
                            				</td>
                        			</tr>
                    			</table>
                		</div>
            		</div>
        	</div>
            </form>
	</body>
</html>

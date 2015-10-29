<%-- 
    Document   : time
    Created on : 05/10/2015, 16:44:20
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
        	<div id="topOfPage">
            		<a name="topOfPage"></a>
        	</div>
        	<div id="conteiner">
             		<a href="cadastro">Cadastro Aluno</a>
            		<a href="modalidades">Modalidades</a>
            		<a href="times">Time</a>
            		<a href="paginainicial">Voltar a página inicial</a>
            		<div id="top">
                		<h1>Olimpiadas Escolares</h1>
            		</div>

            		<h2>Cadastro do time</h2>

            		<div id="body">

                		<div id="blockDistinct">
                    			<table>
                        			<tr>
                            				<td>
                                				<h6>Nome do aluno</h6>
                            				</td>
                            				<td>
                                                            <input type="text" name="nomealuno" value="" size="50px" />
                            				</td>
                            				<td>
                                				<h6>Matrícula</h6>
                            				</td>
                            				<td>
                                                            <input type="text" name="matriculaaluno" value="" size="50px" />
                            				</td>
                        			</tr>
                        			<tr>
                            				<td>
                                				<h6>Nome do time</h6>
                            				</td>
                            				<td>
                                                            <input type="text" name="nometime" value="" size="50px" />
                            				</td>
                            				<td>
                                                            <input type="submit" value="Enviar" name="botaocadastrotime" />
                            				</td>
                        			</tr>
                        			<tr>
                            				<td>
                            				</td>
                        			</tr>
                    			</table>
                		</div>
            		</div>
        	</div>
            
	</body>
        </form>
</html>

<%-- 
    Document   : cadastroAluno
    Created on : 05/10/2015, 16:40:09
    Author     : Thayná
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Olimpiadas Escolares</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>

    <body>
        <form method="post" action="CadastroAluno">
            <div id="conteiner">
                <div id="top">
                    <h1>Olimpiadas Escolares</h1>
                </div>
                <h2>Cadastro Aluno</h2>
                <div id="body">
                    <div class="blockDistinct">
                        <table>
                            <tr>
                                <td>
                                    <h6>Nome</h6>
                                </td>
                                <td>
                                    <input type="text" name="nome" value="" size="50px" />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <h6>Matrícula</h6>
                                </td>
                                <td>
                                    <input type="text" name="matricula" value="" size="50px" />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <h6>Serie</h6>
                                </td>
                                <td>
                                    <input type="text" name="serie" value="" size="50px" />
                                </td>
                            </tr>
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
                                    <input type="text" name="senha" value="" size="50px" />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <h6>Data</h6>
                                </td>
                                <td>
                                    <input type="text" name="data" value="" size="50px" />
                                </td>
                            </tr>
                             <tr>
                                <td>
                                    <input type="submit" value="Enviar" name="cadastrarAluno" />
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>
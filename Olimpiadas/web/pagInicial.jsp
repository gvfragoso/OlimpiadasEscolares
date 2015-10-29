<%-- 
    Document   : pagInicial
    Created on : 05/10/2015, 16:40:40
    Author     : Thayná
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Olimpiadas Escolares</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
        <style type="text/css">
            .auto-style1 {
                height: 23px;
            }
            .auto-style2 {
                height: 23px;
                width: 10px;
            }
        </style>
    </head>
    <body>
        <div id="conteiner">

            <div id="top">
                <h1>Olimpiadas Escolares</h1>
            </div>
            <h2>Pagina inicial </h2>

            <div id="body">

                <div id="blockDistinct">
                    <table>
                        <tr>
                            <td class="auto-style1">
                                <a href="Login.jsp">Login</a>
                            </td>
                            <td class="auto-style2"></td>
                        </tr>
                        <tr>
                            <td class="auto-style1">
                                <a href="CadastroAluno.jsp">Cadastro Aluno</a>
                            </td>
                            <td class="auto-style2"></td>
                        </tr>
                        <tr>
                            <td class="auto-style1">
                                <a href="excluirconta">Excluir conta</a>
                            </td>
                            <td class="auto-style2"></td>
                        </tr>
                        <tr>
                            <td>
                                <a href="sair">Sair</a>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>

    </body>
</html>
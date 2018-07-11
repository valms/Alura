<%--
  Created by IntelliJ IDEA.
  User: valmar.junior
  Date: 11/07/2018
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<form action="/produtos" method="post">
    <div>
        <label>Título</label>
        <input type="text" name="titulo">
    </div>

    <div>
        <label>Descrição</label>
        <textarea name="descricao" cols="320" rows="10"></textarea>
    </div>

    <div>
        <label>Páginas</label>
        <input type="text" name="paginas">
    </div>

    <button type="submit">Cadastrar</button>
</form>


</body>
</html>

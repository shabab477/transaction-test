<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <title>Transaction Form</title>
    </head>

    <body>

        <form method="GET" action="/TransactionTest/result">
            <input name="transaction" type="radio" value="required"/> Required <br />
            <input name="transaction" type="radio" value="mandatory"/> Mandatory <br />
            <input name="transaction" type="radio" value="requires_new"/> Requires New <br />
            <input name="transaction" type="radio" value="supports"/> Supports <br />
            <input name="transaction" type="radio" value="not_supported"/> Not Supported <br />
            <input name="transaction" type="radio" value="never"/> Never <br />

            <input type="submit" />
        </form>

    </body>

</html>
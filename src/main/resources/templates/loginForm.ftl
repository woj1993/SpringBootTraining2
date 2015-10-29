<html>
    <head>
        <title>Login</title>
        </head>
    <body>
<#if error??>
        <span>${error}</span>
        </#if>
        <form action="login" method="post">
            <input type="text" name="username" placeholder="Nazwa użytkownika"/>
            <input type="password" name="password" placeholder="Hasło"/>
            <input type="submit" name="submit" value="Zaloguj"/>
            </form>
        </body>
    </html>

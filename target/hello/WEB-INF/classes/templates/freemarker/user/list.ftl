<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>用户列表</title>
</head>
<body>
  <table>
    <tr>
      <th>id</th><th>用户名</th><th>密码</th><th>邮箱</th>
    </tr>
    <#list userList as user>
    <tr>
      <td>${user.user_id}</td> <td>${user.user_name}</td><td>${user.user_password}</td><td>${user.user_email}</td>
    </tr>
    </#list>
 </table>
</body>
</html>
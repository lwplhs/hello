<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>姓氏列表</title>
</head>
<body>
  <table>
    <tr>
      <th>id</th><th>姓氏</th><th>pinyin</th><th>key_uuid</th>
    </tr>
    <#list surnameList as surname>
    <tr>
      <td>${surname.id}</td> <td>${surname.surname}</td><td>${surname.pinyin}</td><td>${surname.key_uuid}</td>
    </tr>
    </#list>
 </table>
</body>
</html>
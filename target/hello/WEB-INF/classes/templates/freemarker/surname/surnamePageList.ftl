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
    <#list pageBean.list as surname>
    <tr>
      <td>${surname.id}</td> <td>${surname.surname}</td><td>${surname.pinyin}</td><td>${surname.key_uuid}</td>
    </tr>
    </#list>
 </table>
  	  <#--构建分页导航-->
            共有${pageBean.totalRecord}个员工，共${pageBean.totalPage}页，当前为${pageBean.pageNum}页<br/>
      <a href="/surname/list?pageNum=1">首页</a>
      <#--如果当前页为第一页时，就没有上一页这个超链接显示-->
      <#if pageBean.pageNum ==1>
      		<#list pageBean.start..pageBean.end as i>
      			<#if pageBean.pageNum == i>
      				${i}
      			<#else>
      				<a href="/surname/list?pageNum=${i}">${i}</a>
      			</#if>
      			
      		</#list>
      		<a href="/surname/list?pageNum=${pageBean.pageNum+1}">下一页</a>    
      </#if>
      <#--如果当前页不是第一页也不是最后一页，则有上一页和下一页这个超链接显示-->
      <#if pageBean.pageNum gt 1 && pageBean.pageNum lt pageBean.totalPage>
      		<a href="/surname/list?pageNum=${pageBean.pageNum-1}">上一页</a>
      		<#list pageBean.start..pageBean.end as i>
      			<#if pageBean.pageNum == i>
      				${i}
      			<#else>
      				<a href="/surname/list?pageNum=${i}">${i}</a>
      			</#if>
      		</#list>
      		<a href="/surname/list?pageNum=${pageBean.pageNum+1}">下一页</a>
      </#if>
      <#--如果当前页是最后一页，则只有上一页这个超链接显示，下一页没有-->
      <#if pageBean.pageNum == pageBean.totalPage>
      		<a href="/surname/list?pageNum=${pageBean.pageNum-1}">上一页</a>
      		<#list pageBean.start..pageBean.end as i>
      			<#if pageBean.pageNum == i>
      				${i}
      			<#else>
      				<a href="/surname/list?pageNum=${i}">${i}</a>
      			</#if>
      		</#list>
      </#if>
      <a href="/surname/list?pageNum=${pageBean.totalPage}">尾页</a>
</body>
</html>
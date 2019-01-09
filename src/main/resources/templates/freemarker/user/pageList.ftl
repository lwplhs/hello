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
    <#list pageInfo.list as user>
    <tr>
      <td>${user.user_id}</td> <td>${user.user_name}</td><td>${user.user_password}</td><td>${user.user_email}</td>
    </tr>
    </#list>
 </table>
 <#--构建分页导航-->
            共有${pageInfo.total}条记录，当前为${pageInfo.pageNum}页<br/>
      <a href="/user/all?pageNum=1">首页</a>
      
      <#if !pageInfo.isFirstPage>
      		<a href="/user/all?pageNum=${pageInfo.prePage}">上一页</a>
      </#if>
      
      <#list pageInfo.navigatepageNums as navigate>
      		<#if pageInfo.pageNum == navigate>
      			${navigate}
      		<#else>
      			<a href="/user/all?pageNum=${navigate}">${navigate}</a>
      		</#if>
      </#list>
      
      <#if !pageInfo.isLastPage>
      		<a href="/user/all?pageNum=${pageInfo.nextPage}">下一页</a>
      </#if>
      <#--如果当前页为第一页时，就没有上一页这个超链接显示
      <#if pageBean.isFirstPage>
      		<#list pageBean.start..pageBean.end as i>
      			<#if pageBean.pageNum == i>
      				${i}
      			<#else>
      				<a href="/surname/list?pageNum=${i}">${i}</a>
      			</#if>
      			
      		</#list>
      		<a href="/surname/list?pageNum=${pageBean.pageNum+1}">下一页</a>    
      </#if>
      <#--如果当前页不是第一页也不是最后一页，则有上一页和下一页这个超链接显示
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
      <#--如果当前页是最后一页，则只有上一页这个超链接显示，下一页没有
      <#if pageBean.pageNum == pageBean.totalPage>
      		<a href="/surname/list?pageNum=${pageBean.pageNum-1}">上一页</a>
      		<#list pageBean.start..pageBean.end as i>
      			<#if pageBean.pageNum == i>
      				${i}
      			<#else>
      				<a href="/surname/list?pageNum=${i}">${i}</a>
      			</#if>
      		</#list>
      </#if>-->
      <a href="/user/all?pageNum=${pageInfo.pages}">尾页</a>
</body>
</html>
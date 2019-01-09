package com.lhs.controller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
 
import com.github.pagehelper.PageInfo;
import com.lhs.entity.User;
import com.lhs.service.UserService;
import com.lhs.service.impl.UserServiceImpl;
import com.lhs.util.aop.CheckMySqlTable;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping("/list")
	public String list(ModelMap map) {
		List<User> userList = userService.findAll();
		map.addAttribute("userList", userList);
		return "user/list";
	}
	
	@RequestMapping("/all")
	public String selectAll(ModelMap map,@RequestParam(defaultValue="1") Integer pageNum,@RequestParam(defaultValue="10") Integer pageSize){
		 
		PageInfo<User> pageInfo = userService.selectAll(pageNum, pageSize);
		System.out.println(pageInfo);
		map.addAttribute("pageInfo", pageInfo);
		return "user/pageList";
	}
	
	@RequestMapping("/test")
    public String helloHtml(Map<String,String> map){
        map.put("hello","from TemplateController.helloHtml");
        return "hello/hello";
    }
	@CheckMySqlTable
	@RequestMapping("creat")
	public String creat(ModelMap map){
		return "main/main";
		
	}
}

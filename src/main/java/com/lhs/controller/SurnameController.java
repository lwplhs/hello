package com.lhs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lhs.entity.PageBean;
import com.lhs.entity.Surname;
import com.lhs.service.impl.SurnameServiceImpl;
import com.lhs.util.aop.CheckMySqlTable;

@Controller
@RequestMapping("/surname")
public class SurnameController {
	
	@Autowired
	private SurnameServiceImpl surnameService;
	
	@CheckMySqlTable
	@RequestMapping("/list")
	public String list(ModelMap map,Integer pageNum,Integer pageSize){
		

		if(null == pageNum){			
			pageNum=1;
		}
		if(null == pageSize){
			pageSize=10;
		}
		PageBean pb=surnameService.findAllSurnameWithPage(pageNum, pageSize);
		//List<Surname> surnameList=surnameService.findAll();
		//map.addAttribute("surnameList", surnameList);
		map.addAttribute("pageBean",pb);
		
		return "surname/surnamePageList";
	}
}

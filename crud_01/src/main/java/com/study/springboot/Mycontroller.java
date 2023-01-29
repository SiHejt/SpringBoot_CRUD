package com.study.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.springboot.dao.IBoardDao;
import com.study.springboot.dto.BoardDto;

@Controller
public class Mycontroller {

	@Autowired
	IBoardDao boardDao;
	
	@RequestMapping("/")
	//@ResponseBody
	public String root() {
		//return "root()함수 호출됨.";
		return "redirect:listform";
	}
	
	@RequestMapping("/listForm")
	public String listForm( Model model) {
		List<BoardDto> list = boardDao.list();
		model.addAttribute("list", list);
		
		System.out.println( list );
		
		return "listForm";
	}
}

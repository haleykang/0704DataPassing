package com.haley.pass;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.haley.pass.domain.Board;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
	
		return "home";
	}
	
	// 1. 포워딩
	/*
	 * // 1) request 객체에 데이터를 보관
	 * 
	 * @RequestMapping(value = "myforwarding", method = RequestMethod.GET)
	 * public String myforwarding(HttpServletRequest request) {
	 * 
	 * // 뷰 페이지에게 데이터를 전달하기 위해서 데이터를 저장 request.setAttribute("title", "맛있구마");
	 * return "goguma"; }
	 */
	
	// 2) model 객체에 데이터 보관
	@RequestMapping(value = "myforwarding", method = RequestMethod.GET)
	public String myforwarding(HttpServletRequest request, Model model) {
		
		// 1)request 객체에 데이터를 보관
		request.setAttribute("request", "리퀘스트");
		
		// 2) model 객체에 데이터 보관
		model.addAttribute("model", "모델");
		return "goguma";		
	}
	
	
	//2. JSP 에서 EL을 이용한 Attribute 출력
	
	// 2)전달할 데이터가 Map인 경우
	@RequestMapping(value ="mymap.do", method=RequestMethod.GET) 
	public String mymap(Model model) {
		Map<String, Object>map =
				new HashMap<String,Object>();
		
		map.put("age", 28);
		map.put("name","haley");
		map.put("gender", "여");
		map.put("job", "학생");
		
		// map을 저장
		model.addAttribute("data",map);
		
		
		return "goguma2";
	}
	
	// 3) 전달할 데이터가 DTO 클래스 인 경우 
	@RequestMapping(value ="mydto", method=RequestMethod.GET) 
	public String mydto(Model model) {
	
		Board board = new Board();
		
		board.setNum(1);
		board.setTitle("제목");
		board.setContent("내용");
		board.setId("id");
		
		model.addAttribute("board",board);
		
		return "goguma3";
	}
	
	
	// 4) 전달할 데이터가 List인 경우 -> 반복문을 사용
	@RequestMapping(value ="mylist", method=RequestMethod.GET) 
	public String mylist(Model model) {
	
		List<Board> list = new ArrayList<Board>();
		
		Board board = new Board();
		Board board2 = new Board();
		Board board3 = new Board();
		
		board.setNum(2);
		board.setTitle("나는 누구인가");
		board.setContent("나는 고구마이다");
		board.setId("id2");
		
		board2.setNum(3);
		board2.setTitle("너는 누구인가");
		board2.setContent("너는 인삼이다");
		board2.setId("id3");
		
		board3.setNum(4);
		board3.setTitle("제목입니당");
		board3.setContent("내용입니당");
		board3.setId("id4");
		
		list.add(board);
		list.add(board2);
		list.add(board3);
		
		model.addAttribute("data", list);
		
		// goguma 디렉토리 안에 babygoguma.jsp를 결과 화면으로 지정하고 싶을 때 
		return "goguma/babygoguma";
	}
	
	
	// 2. 리다이렉트redirect
	
	@RequestMapping(value = "redirect", method = RequestMethod.GET)
	public String redirect(HttpServletRequest request, Model model,
			HttpSession session, RedirectAttributes attr) {
		
		// 데이터 저장방법 
		// 1) 2) -> 포워딩으로 이동하는 경우에만 데이터 전달 
		// 1) HttpServletRequest
		request.setAttribute("request", "request 이용");
		// 2) Model
		model.addAttribute("model","model 이용");
		
		// 3) 4) 이동 방법에 상관없이 데이터 전달
		// 3) HttpSession - 계속해서 남아있는 데이터 : 로그인 정보 등등 
		session.setAttribute("session", "session 이용");
		
		// 4) RedirectAttributes - 휘발성 데이터
		attr.addFlashAttribute("attr", "RedirectAttributes 휘발성 데이터");
		
		// 리다이렉트를 할 때는 바로 jsp 페이지로 가지 않소 
		// 주소로 이동해서 결과 페이지로 포워딩 해야함
		// 그렇지 않으면 jsp 페이지 이름이 노출 됨
		return "redirect:test";		
		
	}
	
	@RequestMapping(value="test", method=RequestMethod.GET)
	public String test() {
		
		return "test";
	}
	
	
	
	
}

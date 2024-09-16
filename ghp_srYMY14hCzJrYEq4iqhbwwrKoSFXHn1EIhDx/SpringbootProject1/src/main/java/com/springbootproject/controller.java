package com.springbootproject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class controller {

    @RequestMapping("web")
    public String disp(HttpServletRequest req) {
    	HttpSession session=req.getSession();
    	String n=req.getParameter("name");
    	session.setAttribute("name", n);
    	String n1=req.getParameter("roll");
    	session.setAttribute("roll", n1);
    	String n2=req.getParameter("mark");
    	session.setAttribute("mark", n2);
    	 //System.out.println("i am "+n);
        return "Demo"; 
    }
}
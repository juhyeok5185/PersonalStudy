package com.example.demo.todo.controller;


import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import com.example.demo.todo.service.TodoService;


@WebServlet("/toggle")
public class ToggleController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TodoService service = TodoService.getInstance();
		Integer no = Integer.parseInt(req.getParameter("no"));
		boolean suc = service.toggleFinish(no);
		req.setAttribute("suc", suc);
		resp.sendRedirect("/Todo/list");
	}
}

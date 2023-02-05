package com.example.demo.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.entity.Todo;
import com.example.demo.service.TodoService;
import com.example.demo.util.TodoUtils;

@WebServlet("/write")
public class WriteController extends HttpServlet{
	@Override
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/write.jsp");
		rd.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		LocalDate deadline = TodoUtils.getLocalDate(req.getParameter("deadline"));
		Todo todo = Todo.builder().title(title).content(content).deadline(deadline).build();
		TodoService.getInstance().write(todo);
		resp.sendRedirect("/Todo/list");
	}
}

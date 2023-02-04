package com.example.demo.todo.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.todo.entity.Todo;
import com.example.demo.todo.service.TodoService;
import com.example.demo.todo.util.TodoUtils;

@WebServlet("/write")
public class WriteController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/write.jsp");
		rd.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		TodoService todoService =  TodoService.getInstance();
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		LocalDate deadline = TodoUtils.getLocalDate(req.getParameter("deadline"));
		Todo todo = Todo.builder().title(title).content(content).deadline(deadline).build();
		todoService.write(todo);
		resp.sendRedirect("/Todo/list");
	}
}

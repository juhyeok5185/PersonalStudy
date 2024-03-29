package com.example.demo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.entity.Todo;
import com.example.demo.service.TodoService;

@WebServlet("/read")
public class ReadController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TodoService todoService = TodoService.getInstance();
		int no = Integer.parseInt(req.getParameter("no"));
		Todo todo = todoService.read(no);
		req.setAttribute("todo", todo);
		RequestDispatcher rd = req.getRequestDispatcher("/read.jsp");
		rd.forward(req, resp);
	}
}

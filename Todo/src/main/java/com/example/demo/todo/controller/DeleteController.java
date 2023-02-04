package com.example.demo.todo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.todo.service.TodoService;

@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int no = Integer.parseInt(req.getParameter("no"));
		TodoService todoService = TodoService.getInstance();
		boolean delete = todoService.delete(no);
		resp.sendRedirect("/Todo/list");
	}
}

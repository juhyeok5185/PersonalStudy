package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.dao.TodoDao;
import com.example.demo.entity.Todo;

@WebServlet("/list")
public class ListController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TodoDao todoDao = TodoDao.getInstance();
		List<Todo> list = todoDao.getList();
		req.setAttribute("list", list);
		RequestDispatcher rd = req.getRequestDispatcher("/list.jsp");
		rd.forward(req, resp);
	}
}

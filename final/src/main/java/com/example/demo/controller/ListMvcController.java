package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.entity.Todo;
import com.exmaple.demo.dao.TodoDao;

@WebServlet("/mvc/list")
public class ListMvcController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 출력할 데이터 : model
		List<Todo> todos = TodoDao.findAll();
		
//		Model을 뷰에 넘긴다.
		RequestDispatcher rd = req.getRequestDispatcher("/mvc/list.jsp");
		req.setAttribute("todos", todos);
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}
}

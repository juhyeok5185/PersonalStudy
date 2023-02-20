package com.example.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.entity.Todo;
import com.exmaple.demo.dao.TodoDao;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/rest/list")
public class ListRestController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		model을 JSON으로 출력하면 된다.
		List<Todo> todos =TodoDao.findAll();
		ObjectMapper objectMapper = new ObjectMapper();
		String json =objectMapper.writeValueAsString(todos);
		PrintWriter out = resp.getWriter();
		out.print(json);
	}
}

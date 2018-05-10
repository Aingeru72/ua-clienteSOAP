package com.ipartek.formacion.ua.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.ua.web_service_SOAP.ClaseAlojamiento;
import com.ipartek.formacion.ua.web_service_SOAP.Pub_gralSoapProxy;

/**
 * Servlet implementation class AlojamientosController
 */
@WebServlet("/alojamientos")
public class AlojamientosController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// cliente para ws UA
		Pub_gralSoapProxy client = new Pub_gralSoapProxy();

		// conseguir alojamientos
		ClaseAlojamiento[] alojamientos = client.wsalojamientos();
		// System.out.println(alojamientos[0]);
		
		// pasar como atributo en request alojamientos
		request.setAttribute("alojamientos", alojamientos);
		
		request.getRequestDispatcher("alojamientos.jsp").forward(request, response);		
	}

}

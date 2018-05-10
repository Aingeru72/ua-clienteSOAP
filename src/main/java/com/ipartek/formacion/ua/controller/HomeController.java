package com.ipartek.formacion.ua.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.ua.web_service_SOAP.ClaseAlojamiento;
import com.ipartek.formacion.ua.web_service_SOAP.ClaseDiasFestivos;
import com.ipartek.formacion.ua.web_service_SOAP.ClaseNoticias;
import com.ipartek.formacion.ua.web_service_SOAP.Pub_gralSoapProxy;

/**
 * Servlet implementation class HomeController
 */
@WebServlet(urlPatterns = { "/", "/noticias" })
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// cliente para ws UA
		Pub_gralSoapProxy client = new Pub_gralSoapProxy();

		// conseguir noticias
		ClaseNoticias[] noticias = client.wsnoticias("C", "");
		// System.out.println("" + noticias[0].getUrl());
		
		// conseguir días festivos
		ClaseDiasFestivos[] festivos = client.wsdiasfestivos("C", "2017-18");

		// pasar como atributo en request noticias
		request.setAttribute("noticias", noticias);
		request.setAttribute("festivos", festivos);

		request.getRequestDispatcher("noticias.jsp").forward(request, response);
	}

}

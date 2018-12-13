/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.el.lang.ELSupport;

/**
 *
 * @author Roger
 */
@WebServlet(urlPatterns = {"/Calcula"})
public class TestCalcula extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
           String num1 = request.getParameter("n1");
           String num2 = request.getParameter("n2");
           String opcao = request.getParameter("opcao");
           
           try{
           int op = Integer.parseInt(opcao);
           double valor1 = Double.parseDouble(num1);
           double valor2 = Double.parseDouble(num2);
           double resultado=0;
           
           switch(op){
               case 0:
                    resultado = valor1 + valor2;
               break;
               case 1:
                    resultado = valor1 - valor2;
               break;
               case 2:
                    resultado = valor1 * valor2;
               break;
               case 3:
                    resultado = valor1 / valor2;
               break;
           }
           
           
           out.print("<h1 style='transition: 1s;\n" +
"	background-color: aqua;\n" +
"	border-radius: 30px;\n" +
"	text-align: center;\n" +
"	font-size: 70px;\n" +
"	text-shadow: 2px 2px 5px rgb(189, 115, 18);'>Resultado: "+resultado+"</h1>");
           out.print("<br><br> <a style='font-family: \"Arial black\", cursive;\n" +
"	font-size: 12px;\n" +
"	border-radius: 2px; \n" +
"	background: #3a07c7;\n" +
"	background-color: aqua;\n" +
"	border-radius: 2mm;\n" +
"	padding: 7px;\n" +
"	box-shadow: 2px 2px 5px rgb(189, 115, 18);' href='DadosServlet'>Calcular Mais</a> ");
           
           }catch (NumberFormatException ex){
               request.getRequestDispatcher("/WEB-INF/paginas/calculadora.jsp")
                    .forward(request, response);
           }
           
        }
    }

}

package com.zhangwei.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhangwei.service.UserService;


/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userService = new UserService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset = utf-8");
		response.setHeader("Content-type", "text/html;charset=utf-8");
		
		String jsonString = getRequestBody(request);
//        if(jsonString.equals("")) {
//        	System.out.println("JsonObj is null.");
//        }
//        else {
        	System.out.println(jsonString);
    //    }
        PrintWriter out = response.getWriter();
        out.write("{\"name\":\"舞蹈家\"}");
        out.close();
        
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(userService.login(username, password)) {
			response.getOutputStream().write(("登录成功...\n用户: " + username + "\n密码: " + password).getBytes("utf-8"));
		}
		else {
			response.getOutputStream().write(("登录失败...\n请检查用户名和密码是否正确").getBytes("utf-8"));
		}
	}
	
	public static String getRequestBody(HttpServletRequest req) throws IOException { 
			BufferedReader reader = req.getReader(); 
			String input = null; 
			StringBuffer requestBody = new StringBuffer(); 
			while((input = reader.readLine()) != null) { 
				requestBody.append(input); 
			} 
			return requestBody.toString(); 
		}

}

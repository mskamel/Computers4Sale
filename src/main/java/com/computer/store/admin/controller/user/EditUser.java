package com.computer.store.admin.controller.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.computer.store.service.UserService;

@WebServlet("/admin/edit_user")
public class EditUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditUser() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService userService = new UserService(request, response);
		userService.editUser();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService userService = new UserService(request, response);
		userService.updateUser();
	}

}

/*Develop an application using SpringMVC.
try to read employee Information(empno,name,designation,sal ..etc) from the keyboard
and display on webpage*/

package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

//Annotation is used to mark the class as the controller
@Controller

public class EmployeeController {
	
	//Annotation is used to map the class with the specified URL name
	@RequestMapping("/hello")

	public String display(@RequestParam("name") String name, @RequestParam("pass") String pass,
			@RequestParam("email") String email, @RequestParam("addr") String addr, @RequestParam("Desig") String Desig,
			@RequestParam("sal") String Sal, Model m) throws Exception

	{

		if (pass.equals("admin"))

		{

			String msg = "Hello " + name + " registration is successfull.Your detail information is..........";
			String name1 = "E_Name :-" + name;
			String email1 = "E_Email :- " + email;
			String address = "E_Address :- " + addr;
			String designation = "E_Designation :- " + Desig;
			String Salary = "E_Salary :- " + Sal;

			m.addAttribute("message1", msg);
			m.addAttribute("message2", name1);
			m.addAttribute("message3", email1);
			m.addAttribute("message4", address);
			m.addAttribute("message5", designation);
			m.addAttribute("message6", Salary);

			return "viewpage1";

		}

		else

		{

			String msg = "Sorry " + name
					+ ". You are not existing employee plz enter correct password provided by company";

			m.addAttribute("message", msg);

			return "errorpage1";

		}

	}

}

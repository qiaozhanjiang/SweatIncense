package com.qfedu.hanxiang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.qfedu.hanxiang.pojo.JS;
import com.qfedu.hanxiang.pojo.Users;
import com.qfedu.hanxiang.service.UsersService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class UsersController {
	@Resource
	private UsersService usersService;
	
	
	// 注册账号
	@RequestMapping("/register.do")
	public void register(Users user, HttpServletRequest req, HttpServletResponse resp) {

		JS<Users> js = usersService.save(user);
		String ret = JSON.toJSONString(js);
		try {
			resp.getWriter().print(ret);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 登录
	@RequestMapping("/login.do")
	public void userLogin(Users user, HttpServletResponse resp) {
		try {
			resp.getWriter().print(usersService.login(user));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	// 修改资料
	@RequestMapping("/update.do")
	public void update(Users user, MultipartFile files, HttpServletRequest req, HttpServletResponse resp) {
		try {
			resp.getWriter().print(usersService.update(user));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
			
	//XXX 退出--- 这里到 redis 删除token
	@RequestMapping("/loginOut.do")
	public void userLoginOut(HttpSession session, HttpServletResponse resp) {
		try {
			resp.getWriter().print(101);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
			
	
	
	
	
	
	
	
	
	
	
}

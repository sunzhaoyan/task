package com.szy.task.controller;

import com.szy.task.common.Page;
import com.szy.task.model.User;
import com.szy.task.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description:
 * @Author: sunzhaoyan
 * @CreateDate: 2018-05-15 23:25
 * @Version: 1.0
 **/
@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping()
	public List<User> list(@RequestParam(required = false) Integer pageNum, @RequestParam(required = false) Integer pageSize) {
		Page page = new Page(pageNum, pageSize);
		return userService.findAll(page);
	}

	@PostMapping
	public int add(User user) {
		return userService.add(user);
	}

}

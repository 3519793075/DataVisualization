package cn.yq.ssm.conterller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.yq.ssm.pojo.User_login;
import cn.yq.ssm.service.User_loginService;

//控制中心
@Controller
@RequestMapping("/user")
public class User_loginConterller {
	
	//注入数据
	@Autowired
    private User_loginService service;
	
	@RequestMapping("/login")
	public String userLogin(){
		return "index";
	}
	
	
	@RequestMapping("/select")
	public String select(){
		//在该方法中执行查询
		List<User_login> listUser = service.selectUser_login();
		
		//将列表输出到控制台
		for(int i=0;i<listUser.size();i++){
			User_login user = listUser.get(i);
			System.out.print(user.getUsername()+"   ");
			System.out.println(user.getPassword());
			
		}
		return null;
	}
}

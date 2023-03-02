package cn.yq.ssm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yq.ssm.mapper.User_loginMapper;
import cn.yq.ssm.pojo.User_login;
import cn.yq.ssm.service.User_loginService;

//写一个注解标签
@Service
public class User_loginServiceImpl implements User_loginService{

	//注入标签
	@Autowired
	private User_loginMapper user_loginMapper;
	
	@Override
	public User_login selectUser_loginById(User_login user_login) {
		System.out.println("userLogin Info"+user_loginMapper);
		return user_loginMapper.selectUser_loginById(user_login);
	}

	@Override
	public int insert(User_login user_login) {
		System.out.println("userLogin Info"+user_loginMapper);
		return user_loginMapper.insert(user_login);
	}

	@Override
	public List<User_login> selectUser_login() {
		return user_loginMapper.selectUser_login();
	}

}

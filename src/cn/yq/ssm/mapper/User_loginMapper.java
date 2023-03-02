package cn.yq.ssm.mapper;

import java.util.List;

import cn.yq.ssm.pojo.User_login;

public interface User_loginMapper {
	
	//²éÑ¯
    User_login selectUser_loginById(User_login user_login);
	//ĞÂÔö
	int insert(User_login user_login);
	
	List<User_login> selectUser_login();
}

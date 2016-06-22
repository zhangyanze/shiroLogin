package com.baf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baf.entity.Member;
import com.baf.shiro.dao.memberMapper;
import java.util.*;

/**
 * 
 * @author ZYZ
 * @ClassName :UserServiceImpl
 * @Version : 版本
 * @ModifiedBy : 无
 * @data : 2016年6月22日上午10:56:24
 * @Copyright : 厦门帝网
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private memberMapper userMapper;

	/* (创建用户)
	 * @see com.baf.service.UserService#createUser(com.baf.entity.Member)
	 */
	public Member createUser(Member user) {
		userMapper.insert(user);
		return user;
	}

	/* (更新账户)
	 * @see com.baf.service.UserService#updateUser(com.baf.entity.Member)
	 */
	public Member updateUser(Member user) {
		userMapper.updateByPrimaryKey(user);
		return user;
	}

	/* (删除用户)
	 * @see com.baf.service.UserService#deleteUser(java.lang.Long)
	 */
	public void deleteUser(Long userId) {
		userMapper.deleteByPrimaryKey(userId);
	}

	/* (non-Javadoc)
	 * @see com.baf.service.UserService#changePassword(java.lang.Long, java.lang.String)
	 */
	public void changePassword(Long userId, String newPassword) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.baf.service.UserService#findOne(java.lang.Long)
	 */
	public Member findOne(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.baf.service.UserService#findAll()
	 */
	public List<Member> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.baf.service.UserService#findByUsername(java.lang.String)
	 */
	public Member findByUsername(String username) {
		Member member=userMapper.findByUsername(username);
		return member;
	}

   


}

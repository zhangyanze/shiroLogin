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
 * @Version : �汾
 * @ModifiedBy : ��
 * @data : 2016��6��22������10:56:24
 * @Copyright : ���ŵ���
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private memberMapper userMapper;

	/* (�����û�)
	 * @see com.baf.service.UserService#createUser(com.baf.entity.Member)
	 */
	public Member createUser(Member user) {
		userMapper.insert(user);
		return user;
	}

	/* (�����˻�)
	 * @see com.baf.service.UserService#updateUser(com.baf.entity.Member)
	 */
	public Member updateUser(Member user) {
		userMapper.updateByPrimaryKey(user);
		return user;
	}

	/* (ɾ���û�)
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

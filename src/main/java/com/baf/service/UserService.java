package com.baf.service;

import com.baf.entity.Member;

import java.util.*;

/**
 * 
 * @author ZYZ
 * @ClassName :UserService
 * @Version : 版本
 * @ModifiedBy : 无
 * @data : 2016年6月22日上午10:53:34
 * @Copyright : 厦门帝网
 */
public interface UserService {

	/**
	 * 创建用户
	 * 
	 * @param user
	 */
	public Member createUser(Member user);

	public Member updateUser(Member user);

	public void deleteUser(Long userId);

	/**
	 * 修改密码
	 * 
	 * @param userId
	 * @param newPassword
	 */
	public void changePassword(Long userId, String newPassword);

	Member findOne(Long userId);

	List<Member> findAll();

	/**
	 * 根据用户名查找用
	 * 
	 * @param username
	 * @return
	 */
	public Member findByUsername(String username);

}

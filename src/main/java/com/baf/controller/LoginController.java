/**
 * @ModifiedBy ZYZ
 * @data 2016��6��22��
 */
package com.baf.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ZYZ
 * @ClassName :LoginController
 * @Version : �汾
 * @ModifiedBy : ��
 * @data : 2016��6��22������10:19:31
 * @Copyright : ���ŵ���
 */
@Controller
@RequestMapping("/member")
public class LoginController {
	/**
	 * ��¼
	 * @ModifiedBy ZYZ
	 * @data 2016��6��22��
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(HttpServletRequest request){
		return "login";
	}

}

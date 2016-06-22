/**
 * @ModifiedBy ZYZ
 * @data 2016年6月22日
 */
package com.baf.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ZYZ
 * @ClassName :LoginController
 * @Version : 版本
 * @ModifiedBy : 无
 * @data : 2016年6月22日上午10:19:31
 * @Copyright : 厦门帝网
 */
@Controller
@RequestMapping("/member")
public class LoginController {
	/**
	 * 登录
	 * @ModifiedBy ZYZ
	 * @data 2016年6月22日
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(HttpServletRequest request){
		return "login";
	}

}

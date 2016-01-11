package com.user;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.user.service.UserService;

public class UserAction {
	private UserService userService;
	private String id;
	private String t_name;

	public String loginDemo() {
		// AjaxReturnValue arv = new AjaxReturnValue();
		HttpServletResponse response = ServletActionContext.getResponse();
		// System.out.println("###################");
		String result = userService.findUserByUser(id, t_name);
		// arv.setMsg(result);
		// String sJsonStr = JSONObject.fromObject(arv).toString();
		// System.out.println(sJsonStr);
		response.setContentType("text/json;charset=UTF-8");
		/*
		 * try { response.getWriter().write(sJsonStr); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
		return result;
	}

	public String login() throws Exception {
		String result = userService.findUserByUser(id, t_name);
		if (result.equals("success")) {
			return "success";
		} else {
			return "error";
		}
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

}

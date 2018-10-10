package com.zr.check;

import java.util.regex.Pattern;

/**
 * 验证是否是密码格式数据 6-18位 字母或数字
 * @author zr
 * @date 2018年9月17日
 */
public class IsPwd implements ParamValidate {
	/**
	 * 验证是否是密码格式数据 6-18位 字母或数字
	 * 
	 * @param pwd
	 * @return
	 */
	@Override
	public String validate(String param,String validateVal) {
		Pattern pattern = Pattern.compile("^[0-9a-zA-Z]{6,18}$");
		java.util.regex.Matcher match = pattern.matcher(param);
		if (match.matches() == false) {
			return "密码格式不正确";
		} else {
			return null;
		}
	}

}

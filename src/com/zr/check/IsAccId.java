package com.zr.check;

import java.util.regex.Pattern;

/**
 * 验证是否是账号格式数据 6-50位 字母或数字
 * @author zr
 * @date 2018年9月17日
 */
public class IsAccId implements ParamValidate {
	/**
	 * 验证是否是账号格式数据 6-50位 字母或数字
	 * 
	 * @param pwd
	 * @return
	 */
	@Override
	public String validate(String param,String validateVal) {
		Pattern pattern = Pattern.compile("^[0-9a-zA-Z]{6,50}$");
		java.util.regex.Matcher match = pattern.matcher(param);
		if (match.matches() == false) {
			return "账号格式不正确";
		} else {
			return null;
		}
	}

}


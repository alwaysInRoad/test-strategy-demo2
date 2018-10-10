package com.zr.check;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 邮箱校验
 * @author zr
 * @date 2018-9-17
 *
 */
public class IsEmail implements ParamValidate{

	@Override
	public String validate(String param,String validateVal) {
		String str = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
		Pattern p = Pattern.compile(str);
		Matcher m = p.matcher(param);
		if (m.matches() == false) {
			return "邮箱格式不正确";
		} else {
			return null;
		}
	}

}

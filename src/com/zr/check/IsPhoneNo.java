package com.zr.check;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 手机格式验证
 * @author zr
 * @date 2018年9月17日
 */
public class IsPhoneNo implements ParamValidate {
	/**
	 * 验证手机号和座机电话号码
	 * 
	 * @param mobiles
	 * @return
	 */
	
	@Override
	public String validate(String param,String validateVal) {
		Pattern p = Pattern.compile("^((1[3,5,7,8][0-9])|(14[5,7])|(17[0,6,7,8]))\\d{8}$");
		Matcher m = p.matcher(param);
		if(m.matches() || isFax(param)){
			return null;
		}else{
			return "手机格式错误";
		}
	}
	/**
	 * 验证传真号码、固定电话
	 * 格式：028-86114408
	 * @param fax
	 * @return
	 */
	public static boolean isFax(String email) {
		String str = "^(0\\d{2}-\\d{8}(-\\d{1,4})?)|(0\\d{3}-\\d{7,8}(-\\d{1,4})?)$";
		Pattern p = Pattern.compile(str);
		Matcher m = p.matcher(email);
		return m.matches();
	}
}

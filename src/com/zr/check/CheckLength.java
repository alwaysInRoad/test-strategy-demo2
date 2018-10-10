package com.zr.check;

/**
 * 检查数据的长度是否正确
 * @author zr
 * @date 2018年9月17日
 */
public class CheckLength implements ParamValidate {
	/**
	 * 检查数据的长度是否正确
	 * 
	 * @param data
	 *            数据
	 * @param length
	 *            长度
	 * @return
	 */
	@Override
	public String validate(String param,String validateVal) {
		if (param == null || "".equals(param.trim())) {
			return "数据为空";
		}
		if (param.length() > Integer.parseInt(validateVal)) {
			return "数据长度超过了限定长度";
		}
		return null;
	}

}

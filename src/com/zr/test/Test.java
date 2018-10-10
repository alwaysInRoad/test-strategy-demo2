package com.zr.test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import com.zr.model.SqlParam;
import com.zr.strategy.ParamValidateUtil;

public class Test {

	public static void main(String[] args) {
		Test test = new Test();
		try {
			List<String> messageList = test.test();
			for (String msg : messageList) {
				System.out.println(msg);
			}			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException
				| SecurityException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public List<String> test() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		//获取参数key的字符串值,需要转换成json对象（需要替换sql中的数据）
		String keyParameter = "{\"name\": \"张三\", \"age\": \"aaa\", \"phone\": \"4541\", \"email\": \"1525\"}";
		//根据sql id得到参数验证list
		List<SqlParam> sqlParamList = getSqlParamList();		//校验参数
		List<String> messageList = ParamValidateUtil.ValidateAllFields(sqlParamList,keyParameter);
		return messageList;
	}
	
	private List<SqlParam> getSqlParamList(){
		SqlParam sqlParam1 = new SqlParam("1", "name", "0", "10", "");
		SqlParam sqlParam2 = new SqlParam("2", "age", "1", "", "");
		SqlParam sqlParam3 = new SqlParam("3", "phone", "5", "", "");
		SqlParam sqlParam4 = new SqlParam("4", "email", "3", "", "");
		List<SqlParam> sqlParamList = new ArrayList<>();
		sqlParamList.add(sqlParam1);
		sqlParamList.add(sqlParam2);
		sqlParamList.add(sqlParam3);
		sqlParamList.add(sqlParam4);
		return sqlParamList;
	}
}

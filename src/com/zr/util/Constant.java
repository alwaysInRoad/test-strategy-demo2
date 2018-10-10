package com.zr.util;

public class Constant {
	
	 /**
	  * 参数校验枚举类
	  * @author zr
	  * @date 2018年9月17日
	  */
	 public static enum ParamValidate {
		 CheckLength("CheckLength",0),
		 IsAccId("IsAccId",1),
		 IsAge("IsAge",2),
		 IsEmail("IsEmail",3),
		 IsIdCard("IsIdCard",4),
		 IsPhoneNo("IsPhoneNo",5),
		 IsPostCode("IsPostCode",6),
		 IsPwd("IsPwd",7);
		 // 成员变量
         private String desc;
         private int index;

         // 构造方法
         private ParamValidate(String name, int index) {
             this.desc = name;
             this.index = index;
         }

         // 覆盖方法
         @Override
         public String toString() {
             return this.index + "_" + this.desc;
         }

		 public String getDesc() {
		  	 return desc;
		 }

		 public void setDesc(String desc) {
			 this.desc = desc;
		 }

		 public int getIndex() {
			 return index;
		 }

		 public void setIndex(int index) {
			 this.index = index;
		 }
	 } 
	 
}

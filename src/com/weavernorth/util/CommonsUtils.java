package com.weavernorth.util;

import java.util.UUID;

/**
 * 通用的工具类
 * @author ys
 */
public class CommonsUtils {

	//生成uuid方法
	public static String getUUID(){
		return UUID.randomUUID().toString();
	}
	
}

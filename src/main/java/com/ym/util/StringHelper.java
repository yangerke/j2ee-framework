package com.ym.util;

/**
 * 提供一些和字符串有关的功能类
 * @author yangerke
 *
 */
public class StringHelper {
	public static final String[] EMPTY_STRINGS = new String[0];
	
	public static boolean isEmpty (String s) {
		return s == null || s.isEmpty ();
	}
	
	public static boolean isEmptyContent (String s) {
		return s == null || s.trim ().isEmpty ();
	}
}


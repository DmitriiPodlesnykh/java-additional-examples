package com.luxoft.podlesnykh.example;


import org.apache.commons.lang3.StringUtils;

public class MyApplication {

	public static void main(String... args) {

		boolean a = StringUtils.isBlank(" ");

		boolean b = StringUtils.isEmpty(" ");
		System.out.println(a + " " + b);
	}



}

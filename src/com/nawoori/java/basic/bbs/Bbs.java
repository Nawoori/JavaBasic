package com.nawoori.java.basic.bbs;

import java.text.SimpleDateFormat;
//import java.util.Scanner;

public class Bbs {
	//class : 객체를 정보와 행동을 정의 해놓는 것이다.
	public String author;
	public String date;
	public String title;
	public String content;
	//이름을 정해준다.
	
	public void initDate(){
		// void : 메소드, 기능이다.
		// initDate() : initDate 라는 기능을 가진 함수이다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		// 시스템시간을 가져오는 기능 클래스를 불러온다.
		// 내가 만든 클래스가 아니기 때문에 import(남이 만들어 놓은 class이다)해서 불러온다.
		date = sdf.format(System.currentTimeMillis());
		//가져온 함수를 date변수에 넣어준다
	}
}

package com.nawoori.java.basic.bbs;

import java.text.SimpleDateFormat;
//import java.util.Scanner;

public class Bbs {
	//class : ��ü�� ������ �ൿ�� ���� �س��� ���̴�.
	public String author;
	public String date;
	public String title;
	public String content;
	//�̸��� �����ش�.
	
	public void initDate(){
		// void : �޼ҵ�, ����̴�.
		// initDate() : initDate ��� ����� ���� �Լ��̴�.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		// �ý��۽ð��� �������� ��� Ŭ������ �ҷ��´�.
		// ���� ���� Ŭ������ �ƴϱ� ������ import(���� ����� ���� class�̴�)�ؼ� �ҷ��´�.
		date = sdf.format(System.currentTimeMillis());
		//������ �Լ��� date������ �־��ش�
	}
}

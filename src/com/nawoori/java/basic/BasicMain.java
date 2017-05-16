package com.nawoori.java.basic;
//오늘 수업에서 이해 한 부분을 정리해보았다.

import java.util.ArrayList;
import java.util.Scanner;

import com.nawoori.java.basic.bbs.Bbs;

public class BasicMain {

	// public : 접근제한자 (공개)
	// static : 메모리에 올려져서 굳이 new를 하지 않아도 실행 가능하다.
	// void : return 값이 없다.
	// main : 전체함수의 이름
	// String : 메인함수가 입력값을 받는 값의 타입 (고정)
	// args[] : 변수명
	// [] : 배열이란 의미 (String의 배열이다)
	public static void main(String args[]) {

		// ArrayList : 내가 쓸 데이터 담는 가방
		// 제네릭 <> : 어떤 데이터를 담을지를 한정
		// datas : ArrayList의 이름
		// = : 값을 받아옴
		// new ArrayList<> : new = 메모리에 클래스파일을 로드해서 사용할 수 있게만드는 명령어, <> = 제네릭 약어
		ArrayList<Bbs> datas = new ArrayList<>();

		// Scanner = 내가 쓴 문자를 읽고 처리함
		// Scanner Scanner = new Scanner(System.in) = 클래스파일에 올리겠다.
		Scanner Scanner = new Scanner(System.in);

		// while : 괄호안에 있는 내용이 참이면 계속 반복하겠다.
		// (true) : 참이라면 설정 블록 안애 내용을 계속 반복하겠다.
		// System.out.println("명령어를 입력하세요 : 1.입력, 2.목록, 3.상세보기"); = 괄호안에 있는
		// 문자열을 읽겠다.
		// String : 문자열을 받겠다.
		// command : 사용자가 입력한 변수를 확인하겠다.
		// Scanner.nextLine() = 사용자가 다음문장을 쓸때 까지 기다렸다가 사용자가 내용을 입력하면 처리하겠다.
		while (true) {
			System.out.println("명령어를 입력하세요 : 1.입력, 2.목록, 3.상세보기");
			String command = Scanner.nextLine();

			// if = if 만약에 ~라면 ~을 하겠다.
			// command.equals("1") : "1"과 같은지(equals) = 사용자가 입력한 변수를 확인하겠다.
			// "System.out.println("제목을 입력하세요:")" = 괄호안에 있는 문자열을 출력하겠다.
			// "Bbs bbs = new Bbs()" = Bbs는 Bbs이다. 메모리에 클래스 파일을 로드해서 사용할 수
			// 있게 하겠다.
			// "bbs.title = Scanner.nextLine()" = 키보드로 입력받은 값을 Bbs클래스파일에 있는
			// title에 넣겠다.
			if (command.equals("1")) {
				Bbs bbs = new Bbs();
				System.out.println("제목을 입력하세요:");
				bbs.title = Scanner.nextLine();

				// "System.out.println("제목을 입력하세요:")" = 괄호안에 있는 문자열을 출력하겠다.
				// "bbs.author = Scanner.nextLine()" = 키보드로 입력받은 값을 Bbs클래스파일에 있는
				// author에 읽어서 넣겠다.
				System.out.println("이름을 입력하세요:");
				bbs.author = Scanner.nextLine();

				// "System.out.println("제목을 입력하세요:")" = 괄호안에 있는 문자열을 출력하겠다.
				// "bbs.author = Scanner.nextLine()" = 키보드로 입력받은 값을 Bbs클래스파일에 있는 author에 읽어서 넣겠다.
				System.out.println("내용을 입력하세요:");
				bbs.content = Scanner.nextLine();

				// bbs에 있는 initDate 함수를 호출하겠다.
				bbs.initDate();

				// bbs에서 작성한 다 쓴 글 묶음을 datas.add에 담아둔다.
				datas.add(bbs);

			// else if : 만약에 if가 아니라면 이것을 실행하겠다.
			// command.equals("2") : "2"과 같은지(equals) = 사용자가 입력한 변수를 확인하겠다.
			} else if (command.equals("2")) {

				// System.out.println("------ LIST ------") = 괄호안에 있는 문자열을
				// 출력하겠다.
				System.out.println("------ LIST ------");

				// 기본적으로 for문에서는 (초기치; 조건문; 증가치)를 반복한다.
				// for( Bbs x : datas) = 향상된 for문이다. 오른쪽이 데이터가 들어가있는 가방, 왼쪽이
				// 가방에 들어가있는 하나하나의 무언가이다.
				for (Bbs bbs : datas) {

					// bbs에 있는 타이틀을 가져와서 출력한다.
					System.out.print(bbs.title);
					// 타이틀과 데이트사이에 / 이 출력되도록 가져와서 출력한다.
					System.out.print(" / ");
					// bbs에 있는 데이트를 가져와서 출력한다.
					System.out.print(bbs.date);

				}
			} else if (command.equals("3")) {
				System.out.println("상세검색할 글번호를 입력하세요 : ");
				
				//int = 정수타입
				//number = 임의로 부여한 이름
				//Scanner.nextInt() = 키보드로 입력받은 값을 int number로 읽어서 넣겠다. 
				int number = Scanner.nextInt();

				//Bbs의 title에서 ArrayList(datas)의 get이라는 함수를 호툴하여 출력하겠다.
				System.out.println("제목 : " + datas.get(number - 1).title);
				System.out.println("작성자 : " + datas.get(number - 1).author);
				System.out.println("내용 : " + datas.get(number - 1).content);

			}

			System.out.println("-------------------");
			// 구분하기 위해 "-------------------"을 출력한다.
		}
	}
}

## JavaBasic
Main 만들기

// 메모리 식별자와 자료형 식별자
Cmd에서 java [java파일명]을 입력하면 해당 파일이 실행됨
Int number = 157;
Int : 자료형 식별자
Number : 메모리에 대한 식별자(identifier)
157 = 157 자료
이클립스는 정수가 들어오면 int로 인식하기 때문에
Long 과 float는 숫자 뒤에 l,f를 붙여줘야 정상적으로 인식된다.
long lng = 1345679812300L;
float flt = 123456.789f;


//  조건문
if(조건식)
{
// 실행코드
}

switch (key) {
case value:

	break;

default:
	break;
}


// 반복문
for (int i = 0; i < args.length; i++) {

}r()
//		// 1~100까지의 짝수의 합 구하기
		// 1. 결과 값을 저장할 변수 선언
		int c = 0;
		// 2. 로직 수행
		for (int i = 0; i <= 100; i=i+1) {
			if(i%2 == 0)	// 홀수는  1 or 연산자를 !=
			{
				c+=i;
			}
			else
			{

			}
		}
		// 3. 결과값 출력
		System.out.println("1~100까지의 짝수의 합은 : " + c);		

// 컴파일 순서
파일명.java -> 파일명.class(Pre compile) -> JVM
Sublime text 를 통해서 편집 가능


Java의 VM을 통한 실행 시 컴파일 방식에는 두가지가 있다
JIT 방식으로 실행 시 최초 한번 컴파일 하는 방식과 AOT방식으로 설치시 최초 한번 컴파일 방식이 있다.

VM = Runtime
Android Runtime Archtecture 확인할 것.

Dalvik은 JIT 방식으로 동작
마시멜로우 이후의 버전에서는 ART 방식으로 AOT 방식으로 동작함
누가 버전 이후로는 설치시에는 JIT 방식으로 실행은 AOT 방식으로 함

Vm은 어딘가 돌아갈 수 있는 인프라가 있어야만 함(독립적이지 않음)
Runtime이 없다면 vm을 사용할 수 없음
Runtime 환경은 OS

Cloud : 여러개의 공간에 추상레이어라는 공간을 임대(가상의 공간을 임대)
Web server :
Hosting : 웹서버를 임대해서 쓰는 방법
	- 서버 호스팅 : 서버 하나를 통채로 임대
	- 웹 호스팅 : 서버에서 일부의 용량을 임대
Instance : 웹서버를 실행시킬 하나의 시스템을 생성 시키는 것

메모리에 new를 입력하여 객체를 생성하면 Heap에 저장된다.
소스 코드는 Method Area에 저장된다.
Static 함수는 stack에 저장된다.

Basic_sub bs = new Basic_sub();
Basic_sub  : 타입
bs : 식별자
New = 객체  생성
Basic_sub(); 객체를 생성할 함수

인스턴스 : 객체가 생성될 때 멤버변수의 공간만큼 지정

객체 vs 오브젝트
오브젝트(=객체) : 실생활에서 코드 되기 전 단계의 프로그램 단계
클래스 : 객체를 프로그램한 단계
인스턴스(=개체) : 클래스 코드를 Heap메모리에 new를 로드한 상태
코드 전부 올라가는 것은 아니고 멤버변수만 올라간다.



주석
// : 한줄 주석
/*  */ : 전체 주석
/** */ : 자바 도큐먼트 만들 때

식별자
	- 클래스, 함수(Mehod), 변수(Variable), Constant)의 이름
	1. 대소문자 구분
	2. 첫 글자에 숫자는 안됨
	3. 키워드 사용불가
	4. 클래스의 이름  첫글자는 대문자로 한다.
	5. 변수의 첫글자는 소문자로 한다.

기본 자료형은 크기의 제한이 있음
사용자 지정 자료형은 크기의 제한이 없음

미니 테스트
	1. 마트에서 물건을 사고 거스름돈을 계산하는 프로그램을 작성해보세요
	2. 조건 : 입력값은 두개(지불금액, 구입금액) , 잔돈의 갯수를 출력해야함

입력조건
	- 지불금액 : 10,000원
	- 구입금액 : 3,750원
총 거스름 돈 : ?원
오천원  : ? 개
천원 : ? 개
오백원 : ? 개
백원 : ? 개
오십원 : ? 개
십원 : ? 개

저녁 스터디 - 도형 스터디
	1. 객체
		1) 객체 : 실존하는 무언가
		2) 프로그램에서 실존한다라는 것은 메모리에 올라간다는 말이다.
		3) 객체지향 :  “세계는 객체로 이루어져 있으며, 모든 것은 객체 간의 상호작용이다.” 라는 관점
		일렬의 연산의 절차로서의 프로그래밍 절차지향
		여러 객체의 상호작용으로서의 프로그래밍 객체지향
			i. 객체지향언어의 특징
				- 코드의 재사용성이 높다
				- 코드의 구조화
				- 중복코드 제거
			ii. 객체를 중심으로 하는 관점
		4) 클래스 : (실존하게될 무언가의)설계도, 객체의 정의, 사용자 지정 타입 (객체가 클래스다? no!)
		5) 인스턴스 : 클래스를 통해 만들어진 실존체, 객체
		6) 객체 vs 오브젝트
		오브젝트(=객체) : 실생활에서 코드 되기 전 단계의 프로그램 단계
		클래스 : 객체를 프로그램한 단계
		인스턴스(=개체) : 클래스 코드를 Heap메모리에 new를 로드한 상태
		코드 전부 올라가는 것은 아니고 멤버변수만 올라간다.

	2. 인스턴스
		1) 인스턴스화(instantiate) :클래스를 통해 객체를 만드는 것(new연산자)
		2) 인스턴스(instance) : 인스턴스화로 클래스를 통해 만들어진 객체
		3) 객체가 생성될 때 멤버변수의 공간만큼 지정
		4) AnyClass obj = new AnyClass();
			§ AnyClass가 클래스에 해당하는 인스턴스를 만들어 obj라는 변수에 대입한다.
			§ new는 인스턴스화를 위한 연산자이며, AnyClass()는 인스턴스를 초기화 하는 메소드(함수)이다.
	3. 클래스 : 설계도, 데이터의 집합, 사용자 정의 타입
		1) 설계도: 객체생성에 왜 설계도를 만들까?
			§ 설계도 없이 만드는 자동차...?
			§ 틀 없이 찍어내는 붕어빵...?
			§ 빠르게 객체를 생성할 수 있다. - 객체 생성의 비용이 적게 듬
		2) 데이터의 집합: 클래스는 어떤 것으로 구성되어 있을까? 무엇으로 정의되는가?
			§ 속성(멤버변수), 기능 : 속성과 기능의 차이는 속성은 정의가 가능하지만 기능(동작)은 정의가 되지 않음
			§ 값, 함수
			§ 속성: 필드, 멤버 변수 ...( int height = 176cm;)
			§ 기능: 메소드 ( public static void main(String[] args), public static void makeTriangle())
		3) 사용자 정의 타입: 왜 타입으로 클래스를 사용할까?
			§ 표준화
			§ 서로 관련된 값을 묶어서 하나의 타입으로 정리
			§ 사용과 이해에 유리함
			§ Object doHyeong  VS Human doHyeong
		4) 클래스를 만든다 = 속성과 동작의 집합으로 설계하여 생산성과 재사용성을 높인다.
			§ 속성 : 정의 가능한 것.
				변수와 상수로 구현
				int index = 0;
				String cmnd = null;
				final String STOP = “멈춰”;
				□ 전역변수 : 인스턴스화를 통해서 Heap메모리에 올라감
					® 클래스에 있는 변수, 클래스 내 어디에서나 사용할 수 있다.
				□ 지역변수 : 인스턴스화를 통해서 Heap메모리에 올라감
					® 메소드에 있는 변수, 해당 메소드에서만 사용할 수 있다.
					® 사용되기 전에 반드시 초기화 해주어야 한다.
				□ static 변수, 상수 (클래스 변수)
					® 클래스에 소속
					® 클래스가 인스턴스화 하지 않더라도 참조할 수 있음
			§ 동작(메소드) : 기능으로 구현 가능한 것.
				메소드로 구현
				public static void main(String[] args){}
				void drawTriangle(int n){}
				□ 높은 재사용성
				□ 중복코드 제거
				□ 구조화


	4. 메소드
		1) 메소드의 구조
		선언부
		Public static void main(String[] args)
			• public: 접근제어자
			• static: 제어자
			• void: 반환 타입
			• main: 메소드 식별자
			• (String[] args): 매개변수
		구현부
			매개변수의 식별자를 사용
		2) 메소드의 반환값
			§ void는 반환값이 없다는 의미이다
			§ 해당 메소드는 어떠한 값도 메소드의 결과로서 만들어내지 않는다
			§ void가 아닌 다른 종류의 타입이 들어가면 해당 타입의 데이터를 반환한다는 의미이다.
			§ 해당 메소드는 반드시 return이라는 구문을 통해 해당 타입의 결과값을 만들어내야한다.
		3) 메소드의 이용
			§ 같은 클래스 내에서
				□ 메소드의 이름만으로 호출해 사용한다
				□ drawTriangle(11);
			§ 다른 클래스에서
				□ 메소드가 소속된 클래스의 인스턴스를 만든다.
				□ 해당 ‘인스턴스의 무언가’ 라는 형태로 호출해 사용한다.
				□ TriangleMaker triangleMaker = new TriangleMaker();
				□ triangleMaker.drawTriangle(19);
			§ static 메소드
				□ 소속 클래스의 인스턴스 없이 클래스에서 바로 호출해 사용한다.
				□ TriangleMaker.drawTrianlge(21);
	5. 식별자
		1) 클래스, 함수(Mehod), 변수(Variable), Constant)의 이름
		2) 대소문자 구분
		3) 첫 글자에 숫자는 안됨
		4) 키워드 사용불가
		5) 클래스의 이름  첫글자는 대문자로 한다.
		6) 변수의 첫글자는 소문자로 한다.
	6. Static
			§ 클래스에 저장되는 정보
			§ 일반적으로 데이터는 인스턴스에 저장됩니다.
				AnyClass class1 = new AnyClass();
				AnyClass class2 = new AnyClass();
				class1.numb = 1;
				class2.numb = 2;
				class.numb == class2.numb; =>(false)
			§ static은 정보가 클래스에 저장됩니다.
				AnyClass.sNumb = 1;
				class1.sNumb == 1 => (true);
				class2.sNumb == 1 => (true);
				class1.sNumb = 2;
				class2.sNumb == 2 => (true);
		1) Static 메소드, static 변수
			• 인스턴스는 클래스에 저장된 정보 참조 가능
			• 클래스는 인스턴스에 저장된 정보 참조 불가능
			• static 변수를 static 메소드에서 참조 (true)
			• static 변수를 instance 메소드에서 참조 (true)
			• instance변수를 static 메소드에서 참조 (false)
			• instance변수를 instance메소드에서 참조(true)
	7. 변수
		1) 변수의 타입

		2) 기본형 타입
		             크기	1Byte	2Byte	4Byte	8Byte
		 종류
		논리형	Boolean			
		문자형		char		
		정수형	Byte	short	int	long
		실수형			float	double

		3) 변수의 초기화
			• Int number = 157;
			Int : 자료형 식별자
			Number : 메모리에 대한 식별자(identifier)
			157 = 157 정수 값을 갖는 data
			• 이클립스는 정수가 들어오면 int로 인식하기 때문에
			Long 과 float는 숫자 뒤에 l,f를 붙여줘야 정상적으로 인식된다.
			long lng = 1345679812300L;
			float flt = 123456.789f;
			• 변수는 초기값을 지정해 줘야하는데
			• 기본 자료형은 크기의 제한이 있음
			• 사용자 지정 자료형은 크기의 제한이 없음


	8. 조건문
		1) 어떠한 조건에 따라 해당 과정을 시행 여부를 판단.
		//  조건문
		• if(조건식)
		{
		// 실행코드
		}

		• switch (key) {
		case value:

			break;

		default:
			break;
		}

	9. 반복문
		1) 특정 과정의 반복적인 시행을 하는 것
		2) 어떠한 조건에 따라 해당 과정 시행 여부를 판단
			• while (condition) {

			}

			• do{do {

			} while (condition);

			• for (int i = 0; i < args.length; i++) {

			}

			• for (String string : args) {

			}
	10. 주석
	// : 한줄 주석
	/*  */ : 전체 주석
	/** */ : 자바 도큐먼트 만들 때

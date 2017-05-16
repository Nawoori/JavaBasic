package com.nawoori.java.basic;
//���� �������� ���� �� �κ��� �����غ��Ҵ�.

import java.util.ArrayList;
import java.util.Scanner;

import com.nawoori.java.basic.bbs.Bbs;

public class BasicMain {

	// public : ���������� (����)
	// static : �޸𸮿� �÷����� ���� new�� ���� �ʾƵ� ���� �����ϴ�.
	// void : return ���� ����.
	// main : ��ü�Լ��� �̸�
	// String : �����Լ��� �Է°��� �޴� ���� Ÿ�� (����)
	// args[] : ������
	// [] : �迭�̶� �ǹ� (String�� �迭�̴�)
	public static void main(String args[]) {

		// ArrayList : ���� �� ������ ��� ����
		// ���׸� <> : � �����͸� �������� ����
		// datas : ArrayList�� �̸�
		// = : ���� �޾ƿ�
		// new ArrayList<> : new = �޸𸮿� Ŭ���������� �ε��ؼ� ����� �� �ְԸ���� ��ɾ�, <> = ���׸� ���
		ArrayList<Bbs> datas = new ArrayList<>();

		// Scanner = ���� �� ���ڸ� �а� ó����
		// Scanner Scanner = new Scanner(System.in) = Ŭ�������Ͽ� �ø��ڴ�.
		Scanner Scanner = new Scanner(System.in);

		// while : ��ȣ�ȿ� �ִ� ������ ���̸� ��� �ݺ��ϰڴ�.
		// (true) : ���̶�� ���� ��� �Ⱦ� ������ ��� �ݺ��ϰڴ�.
		// System.out.println("��ɾ �Է��ϼ��� : 1.�Է�, 2.���, 3.�󼼺���"); = ��ȣ�ȿ� �ִ�
		// ���ڿ��� �аڴ�.
		// String : ���ڿ��� �ްڴ�.
		// command : ����ڰ� �Է��� ������ Ȯ���ϰڴ�.
		// Scanner.nextLine() = ����ڰ� ���������� ���� ���� ��ٷȴٰ� ����ڰ� ������ �Է��ϸ� ó���ϰڴ�.
		while (true) {
			System.out.println("��ɾ �Է��ϼ��� : 1.�Է�, 2.���, 3.�󼼺���");
			String command = Scanner.nextLine();

			// if = if ���࿡ ~��� ~�� �ϰڴ�.
			// command.equals("1") : "1"�� ������(equals) = ����ڰ� �Է��� ������ Ȯ���ϰڴ�.
			// "System.out.println("������ �Է��ϼ���:")" = ��ȣ�ȿ� �ִ� ���ڿ��� ����ϰڴ�.
			// "Bbs bbs = new Bbs()" = Bbs�� Bbs�̴�. �޸𸮿� Ŭ���� ������ �ε��ؼ� ����� ��
			// �ְ� �ϰڴ�.
			// "bbs.title = Scanner.nextLine()" = Ű����� �Է¹��� ���� BbsŬ�������Ͽ� �ִ�
			// title�� �ְڴ�.
			if (command.equals("1")) {
				Bbs bbs = new Bbs();
				System.out.println("������ �Է��ϼ���:");
				bbs.title = Scanner.nextLine();

				// "System.out.println("������ �Է��ϼ���:")" = ��ȣ�ȿ� �ִ� ���ڿ��� ����ϰڴ�.
				// "bbs.author = Scanner.nextLine()" = Ű����� �Է¹��� ���� BbsŬ�������Ͽ� �ִ�
				// author�� �о �ְڴ�.
				System.out.println("�̸��� �Է��ϼ���:");
				bbs.author = Scanner.nextLine();

				// "System.out.println("������ �Է��ϼ���:")" = ��ȣ�ȿ� �ִ� ���ڿ��� ����ϰڴ�.
				// "bbs.author = Scanner.nextLine()" = Ű����� �Է¹��� ���� BbsŬ�������Ͽ� �ִ� author�� �о �ְڴ�.
				System.out.println("������ �Է��ϼ���:");
				bbs.content = Scanner.nextLine();

				// bbs�� �ִ� initDate �Լ��� ȣ���ϰڴ�.
				bbs.initDate();

				// bbs���� �ۼ��� �� �� �� ������ datas.add�� ��Ƶд�.
				datas.add(bbs);

			// else if : ���࿡ if�� �ƴ϶�� �̰��� �����ϰڴ�.
			// command.equals("2") : "2"�� ������(equals) = ����ڰ� �Է��� ������ Ȯ���ϰڴ�.
			} else if (command.equals("2")) {

				// System.out.println("------ LIST ------") = ��ȣ�ȿ� �ִ� ���ڿ���
				// ����ϰڴ�.
				System.out.println("------ LIST ------");

				// �⺻������ for�������� (�ʱ�ġ; ���ǹ�; ����ġ)�� �ݺ��Ѵ�.
				// for( Bbs x : datas) = ���� for���̴�. �������� �����Ͱ� ���ִ� ����, ������
				// ���濡 ���ִ� �ϳ��ϳ��� �����̴�.
				for (Bbs bbs : datas) {

					// bbs�� �ִ� Ÿ��Ʋ�� �����ͼ� ����Ѵ�.
					System.out.print(bbs.title);
					// Ÿ��Ʋ�� ����Ʈ���̿� / �� ��µǵ��� �����ͼ� ����Ѵ�.
					System.out.print(" / ");
					// bbs�� �ִ� ����Ʈ�� �����ͼ� ����Ѵ�.
					System.out.print(bbs.date);

				}
			} else if (command.equals("3")) {
				System.out.println("�󼼰˻��� �۹�ȣ�� �Է��ϼ��� : ");
				
				//int = ����Ÿ��
				//number = ���Ƿ� �ο��� �̸�
				//Scanner.nextInt() = Ű����� �Է¹��� ���� int number�� �о �ְڴ�. 
				int number = Scanner.nextInt();

				//Bbs�� title���� ArrayList(datas)�� get�̶�� �Լ��� ȣ���Ͽ� ����ϰڴ�.
				System.out.println("���� : " + datas.get(number - 1).title);
				System.out.println("�ۼ��� : " + datas.get(number - 1).author);
				System.out.println("���� : " + datas.get(number - 1).content);

			}

			System.out.println("-------------------");
			// �����ϱ� ���� "-------------------"�� ����Ѵ�.
		}
	}
}

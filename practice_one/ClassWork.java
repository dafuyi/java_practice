package Class;

import java.util.Scanner;

public class ClassWork{
    public static void main(String args[]){
    	System.out.println("**************************\n��һ�⣺");
    	T1 t1 = new T1();
    	System.out.println(t1.getSum());
    	
    	System.out.println("**************************\n�ڶ��⣺");
    	T2 t2 = new T2();
    	System.out.println(t2.out());
    	
    	
    	System.out.println("**************************\n�����⣺");
//    	Scanner scan = new Scanner(System.in);
//    	int in = scan.nextInt();
    	// Ϊ�˱��ڵ���ע��ӿ���̨��ȡ�ַ���
    	int in = 1595;
    	T3 t3 = new T3(in);
    	t3.print();
    	
    	System.out.println("**************************\n�����⣺");
    	T4 t4 = new T4();
    	t4.print();
    	System.out.println("");
    	System.out.println("**************************\n�����⣺");
    	T5 t5 = new T5();
    	t5.print();
    	
    	System.out.println("**************************\n�����⣺");
    	T6 t6 = new T6();
    	t6.print();
    	
    	System.out.println("**************************\n�����⣺");
    	T7 t7 = new T7();
    	t7.printNum();
    	
    	System.out.println("**************************\n�ڰ��⣺");
    	T8 t8 = new T8();
    	t8.print();
    	
    	System.out.println("**************************\n�ھ��⣺");
    	T9 t9 = new T9();
    	System.out.println(t9.compare());
    	
    	System.out.println("**************************\n��ʮ�⣺");
//    	Scanner get = new Scanner(System.in);
//    	String str = get.nextLine();
    	String str = "1234555666789";
    	T10 t10 = new T10(str);
    	System.out.println("�ظ���������������ǣ�" + t10.judge());
    	
  }
}

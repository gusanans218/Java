package exam01;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
      int num = 0; 
		           int sum = 0; 
		            
		            System.out.print("0~999 ������ ���ڸ� �Է��ϼ��� : ");
		            Scanner sc = new Scanner(System.in);
		            num = sc.nextInt();
		            
		            while(num!=0){
		                
		                sum += num%10;
		                num /= 10;
		            }
		            System.out.println("�� �ڸ����� ����= "+sum);

		        
		    }

		
	}


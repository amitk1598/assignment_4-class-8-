import java.util.Scanner;

public class conversion {

Scanner sc= new Scanner(System.in);
	void input(){
		System.out.println("enter 1 number - ");
		String no1=sc.next();
		System.out.println("enter 2 number - ");
		String no2=sc.next();
		 
		int a=Integer.parseInt(no1);
		int b=Integer.parseInt(no2);
		
		if (a>b){
			System.out.println("1st number is greater");
		}else{
			System.out.println("2nd number is greater");
		}
		
	}
	

	public static void main(String[] args) {
		conversion ob = new conversion();
		ob.input();
	
}}
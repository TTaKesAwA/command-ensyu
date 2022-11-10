import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdln = new Scanner(System.in);

		System.out.println("身長を入力してください。");
		double height = stdln.nextDouble();
		System.out.println("体重を入力してください。");
		double weight = stdln.nextDouble();
		double bmi = weight/Math.pow(height,2);
	System.out.println("BMI値は"+(Math.floor(bmi*100)/100)+"です。");
	}
}

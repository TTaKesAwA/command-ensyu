import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdln = new Scanner(System.in);

		System.out.println("一人目の身長を入力してください。");
		double height = stdln.nextDouble();
		System.out.println("一人目の体重を入力してください。");
		double weight = stdln.nextDouble();
		System.out.println("二人目の身長を入力してください。");
		double height2 = stdln.nextDouble();
		System.out.println("二人目の体重を入力してください。");
		double weight2 = stdln.nextDouble();
		double bmi = weight/Math.pow(height,2);
		double bmi2 = weight2/Math.pow(height2,2);
	System.out.println("一人目のBMI値は"+(Math.floor(bmi*100)/100)+"です。");
	System.out.println("二人目のBMI値は"+(Math.floor(bmi2*100)/100)+"です。");
	}
}

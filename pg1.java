//BMI作业：
package chapter1;
import java.util.Scanner;
public class pg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pg1=new Scanner(System.in);//建一个pg1对象
		System.out.println("请输入体重kg:");
		float Weight=pg1.nextFloat();//体重kg
		System.out.println("请输入身高m:");
		float Height=pg1.nextFloat();//身高m
		System.out.println("请输入性别:男or女");
		String sex=pg1.next();//性别
		float BMI=Weight/(Height*Height);//BMI指数
		switch(sex) {
		case "男":
			if(BMI<=20) {
				System.out.println("您的BMI指数为:"+BMI+"\n表现为:过轻");
			}
			if(BMI>20&&BMI<=25) {
				System.out.println("您的BMI指数为:"+BMI+"\n表现为:适中");
			}
			if(BMI>25&&BMI<=30) {
				System.out.println("您的BMI指数为:"+BMI+"\n表现为:过重");
			}
			if(BMI>30&&BMI<=35) {
				System.out.println("您的BMI指数为:"+BMI+"\n表现为:肥胖");
			}
			if(BMI>35) {
				System.out.println("您的BMI指数为:"+BMI+"\n表现为:过度肥胖");
			}
		break;
		case "女":
			if(BMI<=19) {
				System.out.println("您的BMI指数为:"+BMI+"\n表现为:过轻");
			}
			if(BMI>19&&BMI<=24) {
				System.out.println("您的BMI指数为:"+BMI+"\n表现为:适中");
			}
			if(BMI>24&&BMI<=29) {
				System.out.println("您的BMI指数为:"+BMI+"\n表现为:过重");
			}
			if(BMI>29&&BMI<=34) {
				System.out.println("您的BMI指数为:"+BMI+"\n表现为:肥胖");
			}
			if(BMI>34) {
				System.out.println("您的BMI指数为:"+BMI+"\n表现为:过度肥胖");
			}
		pg1.close();
	}
	}

}

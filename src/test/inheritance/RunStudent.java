package test.inheritance;

public class RunStudent {

	public static void main(String[] args) {
		Student stu1 = new Student();
		
		stu1.name = "������";//Person
		stu1.weight = 50;//Person
		stu1.height = 168;//Person
		stu1.stuId = 1102;
		stu1.grade = 1;
		stu1.ban = 1;
		
		stu1.sleep();
		stu1.wakeUP();
		stu1.walk();
		stu1.eat();
		stu1.study();
		stu1.play();
	}

}

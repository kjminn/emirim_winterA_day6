package test.inheritance;

public class RunStudent {

	public static void main(String[] args) {
		Student stu1 = new Student();
		
		stu1.name = "±èÀ±¼­";//Person
		stu1.weight = 50;//Person
		stu1.height = 168;//Person
		stu1.stuId = 1102;
		stu1.grade = 1;
		stu1.ban = 1;
		
		stu1.sleep();//Person
		stu1.wakeUP();//Person
		stu1.walk();//Person
		stu1.eat();//Person
		stu1.study();
		stu1.play();
	}

}

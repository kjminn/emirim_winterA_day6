package p2;

import p1.Parent;

public class Child extends Parent {
// ��Ӱ����϶��� �ٸ� ��Ű���� �ִ� protected�� �θ��� ����� ������ �� �ִ�.
	public void testProtected() {
		num1 = 100;
		System.out.println("Parent�� protected field num1: " + num1);
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.testProtected();
	}
}

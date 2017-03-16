package oop.nested;

public class AA {

	public static int a1;

	static {
		a1 = 11111;
	}

	void AA() {
		// TODO Auto-generated method stub
		a1 = 3;
	}

	public void f2() {
		a1 = 4;
	}

	public static void f3() {
		a1 += 5;
	}

	class BB {
		private int a1 = 5;

		public void f1() {
			int a1 = 7;

			System.out.printf("a1 : %d", AA.this.a1);
		}

	}

}

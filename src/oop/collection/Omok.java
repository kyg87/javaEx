package oop.collection;

import java.util.Scanner;

public class Omok {

	private int x;
	private int y;
	Scanner scan;

	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public Omok() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
	}


	public void input() {
		// TODO Auto-generated method stub
		x = scan.nextInt();

		y = scan.nextInt();

	}

}

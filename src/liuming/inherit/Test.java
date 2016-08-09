package liuming.inherit;

import javax.swing.JOptionPane;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Polygon po = new Polygon(3);
		Triangle tr = new Triangle(5, 6);
		
		po.getNumberOfSides();
		tr.getArea();
		tr.getNumberOfSides();
	}

}

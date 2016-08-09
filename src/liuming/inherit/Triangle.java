package liuming.inherit;

import javax.swing.JOptionPane;
/**
 * 三角形
 * @author 那小子’超赞
 *
 */
public class Triangle extends Polygon{
	int base;//代表三角行的底
	int height;//代表三角行的高
	//构造器
	public Triangle(int base,int height){
		super(3);
		JOptionPane.showMessageDialog(null, "在Triangle类的构造器中！");
	}
	
	@Override
	public String toString(){
		JOptionPane.showMessageDialog(null, "三角行的底:"+this.base+"三角行的高:"+this.height);
		return "";
	}
	
	//getArea方法
	public double getArea(){
		area =  1/2*(this.base*this.height);
		return area;
	}
}

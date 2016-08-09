package liuming.inherit;

import javax.swing.JOptionPane;
/**
 * 多边形
 * @author 那小子’超赞
 *
 */
public class Polygon {
	int sides;//边数
	double area;//面积
	//构造器
	public Polygon(int sides){
		JOptionPane.showMessageDialog(null, "在Polygon类的构造器中！");
	}
	
	public int getNumberOfSides(){
		JOptionPane.showMessageDialog(null,"边数为："+this.sides+"面积为："+this.area);
		return this.sides;
	}
	@Override
	public String toString(){
		return "面积是："+this.area+"变数是："+this.sides;
	}
}

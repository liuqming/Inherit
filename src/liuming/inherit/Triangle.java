package liuming.inherit;

import javax.swing.JOptionPane;
/**
 * ������
 * @author ��С�ӡ�����
 *
 */
public class Triangle extends Polygon{
	int base;//���������еĵ�
	int height;//���������еĸ�
	//������
	public Triangle(int base,int height){
		super(3);
		JOptionPane.showMessageDialog(null, "��Triangle��Ĺ������У�");
	}
	
	@Override
	public String toString(){
		JOptionPane.showMessageDialog(null, "�����еĵ�:"+this.base+"�����еĸ�:"+this.height);
		return "";
	}
	
	//getArea����
	public double getArea(){
		area =  1/2*(this.base*this.height);
		return area;
	}
}

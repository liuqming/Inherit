package liuming.inherit;

import javax.swing.JOptionPane;
/**
 * �����
 * @author ��С�ӡ�����
 *
 */
public class Polygon {
	int sides;//����
	double area;//���
	//������
	public Polygon(int sides){
		JOptionPane.showMessageDialog(null, "��Polygon��Ĺ������У�");
	}
	
	public int getNumberOfSides(){
		JOptionPane.showMessageDialog(null,"����Ϊ��"+this.sides+"���Ϊ��"+this.area);
		return this.sides;
	}
	@Override
	public String toString(){
		return "����ǣ�"+this.area+"�����ǣ�"+this.sides;
	}
}

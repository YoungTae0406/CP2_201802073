package ����3;

public class ChocolateJar implements Jar{
	
	private int chocolate;
	private int chilli;
	
	public ChocolateJar() {
		this.chocolate = 13;
		this.chilli = 1;}
	public ChocolateJar(int chocolate) {
		this.chocolate = chocolate;
		this.chilli = 1;}
	public int getItem() {
		return chocolate+chilli;}
	public void takeItem(int hand) {//�Է¹��� ����ŭ �������� ����
		this.chocolate -= hand;}
	public String status() {//���� ������ ���¸� ���ڿ��� ��ȯ
		if (getItem()==14) {return     "[ �� �� �� �� �� �� �� �� �� �� �� �� �� �� ]";}
		else if(getItem()==13) {return "[ �� �� �� �� �� �� �� �� �� �� �� �� �� ]";}
		else if(getItem()==12) {return "[ �� �� �� �� �� �� �� �� �� �� �� �� ]";}
		else if(getItem()==11) {return "[ �� �� �� �� �� �� �� �� �� �� �� ]";}
		else if(getItem()==10) {return "[ �� �� �� �� �� �� �� �� �� �� ]";}
		else if(getItem()==9) {return  "[ �� �� �� �� �� �� �� �� �� ]";}
		else if(getItem()==8) {return  "[ �� �� �� �� �� �� �� �� ]";}
		else if(getItem()==7) {return  "[ �� �� �� �� �� �� �� ]";}
		else if(getItem()==6) {return  "[ �� �� �� �� �� �� ]";}
		else if(getItem()==5) {return  "[ �� �� �� �� �� ]";}
		else if(getItem()==4) {return  "[ �� �� �� �� ]";}
		else if(getItem()==3) {return  "[ �� �� �� ]";}
		else if(getItem()==2) {return  "[ �� �� ]";}
		else if(getItem()==1) {return  "[ �� ]";}
		else return "";		
	}
	public boolean isEmpty() {// �׾Ƹ� ���� �������� ������ �Ǵܿ��� ��ȯ
		if(chocolate<=0) return true;
		else return false;}
	public int getChocolate() {
		return this.chocolate;}
	public int getChilli() {
		return this.chilli;}
}

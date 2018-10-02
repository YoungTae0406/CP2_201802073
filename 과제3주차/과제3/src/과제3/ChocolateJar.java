package 과제3;

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
	public void takeItem(int hand) {//입력받은 수만큼 아이템을 제거
		this.chocolate -= hand;}
	public String status() {//내부 아이템 상태를 문자열로 반환
		if (getItem()==14) {return     "[ ■ □ □ □ □ □ □ □ □ □ □ □ □ □ ]";}
		else if(getItem()==13) {return "[ ■ □ □ □ □ □ □ □ □ □ □ □ □ ]";}
		else if(getItem()==12) {return "[ ■ □ □ □ □ □ □ □ □ □ □ □ ]";}
		else if(getItem()==11) {return "[ ■ □ □ □ □ □ □ □ □ □ □ ]";}
		else if(getItem()==10) {return "[ ■ □ □ □ □ □ □ □ □ □ ]";}
		else if(getItem()==9) {return  "[ ■ □ □ □ □ □ □ □ □ ]";}
		else if(getItem()==8) {return  "[ ■ □ □ □ □ □ □ □ ]";}
		else if(getItem()==7) {return  "[ ■ □ □ □ □ □ □ ]";}
		else if(getItem()==6) {return  "[ ■ □ □ □ □ □ ]";}
		else if(getItem()==5) {return  "[ ■ □ □ □ □ ]";}
		else if(getItem()==4) {return  "[ ■ □ □ □ ]";}
		else if(getItem()==3) {return  "[ ■ □ □ ]";}
		else if(getItem()==2) {return  "[ ■ □ ]";}
		else if(getItem()==1) {return  "[ ■ ]";}
		else return "";		
	}
	public boolean isEmpty() {// 항아리 내부 아이템이 없는지 판단여부 반환
		if(chocolate<=0) return true;
		else return false;}
	public int getChocolate() {
		return this.chocolate;}
	public int getChilli() {
		return this.chilli;}
}

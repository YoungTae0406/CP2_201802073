package Training;
import java.util.*;

public class GradeChEck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char grade=0;
		System.out.println("������ �Է��ϼ���");
		int score = sc.nextInt();
		System.out.println("�Է��� ������ "+score+"�� �Դϴ�.");
		if(score >=90&&score<=100) grade = 'A';
		else if(score>=80 && score<90) grade = 'B';
		else if(score>=70 && score<80) grade = 'C';
		else if(score<70) grade = 'D';
		
		System.out.println("������ ���� ������ "+grade+"�Դϴ�.");
	}

}

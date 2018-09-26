package Training;
import java.util.*;

public class GradeChEck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char grade=0;
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		System.out.println("입력한 점수는 "+score+"점 입니다.");
		if(score >=90&&score<=100) grade = 'A';
		else if(score>=80 && score<90) grade = 'B';
		else if(score>=70 && score<80) grade = 'C';
		else if(score<70) grade = 'D';
		
		System.out.println("점수로 인한 학점은 "+grade+"입니다.");
	}

}

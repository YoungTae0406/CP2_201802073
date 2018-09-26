package Training;

public class gradecheckk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {78, 91, 54, 70, 98, 100, 87, 84,72};
		char[] grade = new char[9];
		
		for(int i=0;i<scores.length;i++) {
			if(scores[i]>=90) grade[i]='A';
			else if (scores[i]>=80&&scores[i]<90) grade[i]='B';
			else if (scores[i]>=70&&scores[i]<80) grade[i]='C';
			else if (scores[i]<70) grade[i] = 'D';
		}
		for (int i=0;i<scores.length;i++) {
			System.out.println((i+1)+"번 째 학생의 학점은 "+grade[i]+"입니다.");
		}
		
		
	

}}

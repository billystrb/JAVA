
public class Main {

	public static void main(String[] args) {

		
		//Evaluation with 2 Tests ,1 progress,
		// 1 final exam  and  a  letter score
		//Test scores are given directly to the programm
		
		
		Evaluation std1 = new Evaluation("dai17150",100,100,100,100);
		//Evaluation std2 = new Evaluation("dai17007",4,2,1,10);

		
		
		double testValue = std1.testGrade() ;
		double progressValue = std1.progressGrade() ;
		double examsValue = std1.examsGrade() ;
		
		double FinalValue = testValue + progressValue + examsValue ;
		if(FinalValue>100) {
			FinalValue = 100 ;
		}
		
		char letterValue=std1.FinalGrade(FinalValue);
		
		std1.print(testValue, progressValue, examsValue, FinalValue, letterValue);
		
		
		
		
	}

}

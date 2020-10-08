
public class Evaluation {

	public String name;
	public double Test1 ;
	public double Test2 ;
	public double progress ;
	public double exams;
	
	public Evaluation(String aName, double test1, double test2, double aProgress, double theExams) {
		super();
		name = aName;
		Test1 = test1;
		Test2 = test2;
		progress = aProgress;
		exams = theExams;
	}
	
	public double testGrade() {
		double sumnation = Test1+Test2 ;
		double result = sumnation*0.25;	
		return result ;
	}

	public double progressGrade() {
		double result = progress*0.25;
		return result ;
	}
	
	public double examsGrade() {
		double result = exams*0.50;
		return result ;
	}
	
	public char FinalGrade(double aGrade) {
		char letter ;
		if(aGrade>=90)
			letter = 'A' ;
		else if(aGrade<90 && aGrade>=80)
			letter = 'B' ;
		else if(aGrade<80 && aGrade>=70)
			letter = 'C' ;
		else if(aGrade<70 && aGrade>=60)
			letter = 'D' ;
		else
			letter = 'F';
		
		return letter ;
		
	}
	
	public void print(double tests,double progress,double exams,double finals,char letter) {
		System.out.println("Evaluation of student: "+name);
		System.out.println("Tests: "+tests);
		System.out.println("Progress :"+progress);
		System.out.println("Exams :"+exams);
		System.out.println("Final value "+finals +"\nEvaluated with: "+letter);
		

		
		
	}
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	


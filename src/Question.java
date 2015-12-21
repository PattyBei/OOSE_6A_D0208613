import java.util.ArrayList;
//12311231
//D0208613 陳佩貝
class Question {
   String description;
   public Question(String desc) {
      this.description = desc;
   }
   public void print() {
      System.out.println(desc);
   }      

}

abstract class ExamPaper {
    public ExamPaper() {
    }
    abstract void op () ;
}
class Topic extends ExamPaper {

    public Topic() {
    }

	@Override
	void op() {		
	}

}
class OtherPaperTopic extends ExamPaper {
	ArrayList <ExamPaper > gList ;
	
    public OtherPaperTopic() {
    }
    
	@Override
	void op() {	
	}
}

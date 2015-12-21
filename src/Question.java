import java.util.ArrayList;

//D0208613 陳佩貝
class Question {
   String description;
   
   public Question(String desc) {
      this.description = desc;
   }
   
   public void print() {
      System.out.println(this.description);
   }      
}
//----------------------------------
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
//----------------------------------
class OtherPaperTopic extends ExamPaper {
	ArrayList <ExamPaper > gList ;
	String description;
	
    public OtherPaperTopic() {
    }
    
    public OtherPaperTopic(String desc) {
       this.description = desc;
    }
    
    public void print() {
       System.out.println(this.description);
    }  
    
	@Override
	void op() {	
	}
}

package quizApp;
/**
 *AAAAHHHHH
 */
public enum StorageQuestions {
	/**note real questions, Source: i made them the fuck up*/
	Q1("SQ1?", "option1", "answer1", "SFF1"), 
	Q2("SQ2?", "option2", "answer2", "SFF2"), 
	Q3("SQ3?", "option3", "answer3", "SFF3"), 
	Q4("SQ4?", "option4", "answer4", "SFF4"), 
	Q5("SQ5?", "option5", "answer5", "SFF5");
	
    private String question;
    private String options;
    private String answer;
    private String funFact;
    
    private StorageQuestions(String question, String options, String answer, String funFact) {
        this.question = question;
        this.options = options;
        this.answer = answer;
        this.funFact = funFact;
    }
    
    public String getQuestion() {
    	return question;
    }
    public String getOptions() {
    	return options;
    }
    public String getAnswer() {
    	return answer;
    }
    public String getFunFact() {
    	return funFact;
    }
}

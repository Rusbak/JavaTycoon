package quizApp;
/**
 *AAAAHHHHH
 */
public enum Edibility {
	/**note real questions, Source: i made them the fuck up*/
	Q1("EQ1?", "option1", "answer1", "EFF1"), 
	Q2("EQ2?", "option2", "answer2", "EFF2"), 
	Q3("EQ3?", "option3", "answer3", "EFF3"), 
	Q4("EQ4?", "option4", "answer4", "EFF4"), 
	Q5("EQ5?", "option5", "answer5", "EFF5");
	
    private String question;
    private String options;
    private String answer;
    private String funFact;
    
    private Edibility(String question, String options, String answer, String funFact) {
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

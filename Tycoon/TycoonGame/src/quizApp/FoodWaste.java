package quizApp;
/**
 *AAAAHHHHH
 */
public enum FoodWaste {
	/**note real questions, Source: i made them the fuck up*/
	Q1("FWQ1?", "option1", "answer1", "FWFF1"), 
	Q2("FWQ2?", "option2", "answer2", "FWFF2"), 
	Q3("FWQ3?", "option3", "answer3", "FWFF3"), 
	Q4("FWQ4?", "option4", "answer4", "FWFF4"), 
	Q5("FWQ5?", "option5", "answer5", "FWFF5");
	
    private String question;
    private String options;
    private String answer;
    private String funFact;
    
    private FoodWaste(String question, String options, String answer, String funFact) {
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

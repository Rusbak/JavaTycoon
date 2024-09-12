package quizApp;

public enum Categories {
//	StorageEnum, EdibilityEnum, FoodWasteFactsEnum, RandomEnum, CustomEnum
	
//	CategoriesEnum(Category.StorageEnum, Category.EdibilityEnum, Category.FoodWasteFactsEnum, Category.RandomEnum, Category.CustomEnum);
//	
//	private Category[] categoriesEnum;
//	
//	Categories(Category... categoriesEnum) {
//		this.categoriesEnum = categoriesEnum;
//	}
//	
//	public Category[] getCategoriesEnum() {
//		return categoriesEnum;
//	}
//	
//	public enum Category {
//		StorageEnum, 
//		EdibilityEnum, 
//		FoodWasteFactsEnum,
//		RandomEnum,
//		CustomEnum
//	}
	Storage(/*StorageEnum.Q1, StorageEnum.Q2, */StorageEnum.Q3, StorageEnum.Q4, StorageEnum.Q5),
	Edibility(EdibilityEnum.Q1, EdibilityEnum.Q2, EdibilityEnum.Q3, EdibilityEnum.Q4, EdibilityEnum.Q5),
	FoodWasteFacts(FoodWasteFactsEnum.Q1, FoodWasteFactsEnum.Q2, FoodWasteFactsEnum.Q3, FoodWasteFactsEnum.Q4, FoodWasteFactsEnum.Q5),
	Random(RandomEnum.Q1, RandomEnum.Q2, RandomEnum.Q3, RandomEnum.Q4, RandomEnum.Q5),
	Custom(CustomEnum.Q1, CustomEnum.Q2, CustomEnum.Q3, CustomEnum.Q4, CustomEnum.Q5);
	
	private StorageEnum[] storageEnum;
	private EdibilityEnum[] edibilityEnum;
	private FoodWasteFactsEnum[] foodWasteFactsEnum;
	private RandomEnum[] randomEnum;
	private CustomEnum[] customEnum;
	
	Categories(StorageEnum... storageEnum) {
		this.storageEnum = storageEnum;
	}
	Categories(EdibilityEnum... edibilityEnum) {
		this.edibilityEnum = edibilityEnum;
	}
	Categories(FoodWasteFactsEnum... foodWasteFactsEnum) {
		this.foodWasteFactsEnum = foodWasteFactsEnum;
	}
	Categories(RandomEnum... randomEnum) {
		this.randomEnum = randomEnum;
	}
	Categories(CustomEnum... customEnum) {
		this.customEnum = customEnum;
	}


	public StorageEnum[] getStorageEnum(String category) {
		return storageEnum;
	}
	public EdibilityEnum[] getEdibilityEnum(String category) {
		return edibilityEnum;
	}
	public FoodWasteFactsEnum[] getFoodWasteFactsEnum(String category) {
		return foodWasteFactsEnum;
	}
	public RandomEnum[] getRandomEnum(String category) {
		return randomEnum;
	}
	public CustomEnum[] getCustomEnum(String category) {
		return customEnum;
	}
	//im just tryna do whatever
//	private Categories getCategoryEnum(String category) {
//		if (category == "storage") { return/* storageEnum*/;}
//	}
	
	public enum StorageEnum{
		/**note real questions, Source: i made them the fuck up*/
		/*Q1("Er mug usundt?", 						"binary", 	"Ja", 	"man kan godt spise muggen ost"), 
		Q2("Har vand en udløbsdato?", 				"binary", 	"Nej", 	"vand er like, mega sundt"), 
		*/Q3("Hvad kan man bruge bananskræller til?", "multiple", "A", 	"man kan også brugedem som fælder"), 
		Q4("Hvor lang tid holder mælk sig god?", 	"multiple", "C", 	"kakaomælk holder sig ikke lige så lang tid"), 
		Q5("StorageEnum spørgsmål?", 				"binary", 	"Ja", 	"vi kan alle sammen gøre en forskel på madspild!");
		
	    private String question;
	    private String options;
	    private String answer;
	    private String funFact;
	    
	    private StorageEnum(String question, String options, String answer, String funFact) {
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
	public enum EdibilityEnum {
		/**note real questions, Source: i made them the fuck up*/
		Q1("Er mug usundt?", 						"binary", 	"Ja", 	"man kan godt spise muggen ost"), 
		Q2("Har vand en udløbsdato?", 				"binary", 	"Nej", 	"vand er like, mega sundt"), 
		Q3("Hvad kan man bruge bananskræller til?", "multiple", "A", 	"man kan også brugedem som fælder"), 
		Q4("Hvor lang tid holder mælk sig god?", 	"multiple", "C", 	"kakaomælk holder sig ikke lige så lang tid"), 
		Q5("EdibilityEnum spørgsmål?", 					"binary", 	"Ja", 	"vi kan alle sammen gøre en forskel på madspild!");
		
	    private String question;
	    private String options;
	    private String answer;
	    private String funFact;
	    
	    private EdibilityEnum(String question, String options, String answer, String funFact) {
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
	public enum FoodWasteFactsEnum {
		/**note real questions, Source: i made them the fuck up*/
		Q1("Er mug usundt?", 						"binary", 	"Ja", 	"man kan godt spise muggen ost"), 
		Q2("Har vand en udløbsdato?", 				"binary", 	"Nej", 	"vand er like, mega sundt"), 
		Q3("Hvad kan man bruge bananskræller til?", "multiple", "A", 	"man kan også brugedem som fælder"), 
		Q4("Hvor lang tid holder mælk sig god?", 	"multiple", "C", 	"kakaomælk holder sig ikke lige så lang tid"), 
		Q5("FoodWasteFactsEnum spørgsmål?", 			"binary", 	"Ja", 	"vi kan alle sammen gøre en forskel på madspild!");
		
	    private String question;
	    private String options;
	    private String answer;
	    private String funFact;
	    
	    private FoodWasteFactsEnum(String question, String options, String answer, String funFact) {
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
	public enum RandomEnum {
		/**note real questions, Source: i made them the fuck up*/
		Q1("Er mug usundt?", 						"binary", 	"Ja", 	"man kan godt spise muggen ost"), 
		Q2("Har vand en udløbsdato?", 				"binary", 	"Nej", 	"vand er like, mega sundt"), 
		Q3("Hvad kan man bruge bananskræller til?", "multiple", "A", 	"man kan også brugedem som fælder"), 
		Q4("Hvor lang tid holder mælk sig god?", 	"multiple", "C", 	"kakaomælk holder sig ikke lige så lang tid"), 
		Q5("RandomEnum spørgsmål?", 					"binary", 	"Ja", 	"vi kan alle sammen gøre en forskel på madspild!");
		
	    private String question;
	    private String options;
	    private String answer;
	    private String funFact;
	    
	    private RandomEnum(String question, String options, String answer, String funFact) {
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
	public enum CustomEnum {
		/**note real questions, Source: i made them the fuck up*/
		Q1("Er mug usundt?", 						"binary", 	"Ja", 	"man kan godt spise muggen ost"), 
		Q2("Har vand en udløbsdato?", 				"binary", 	"Nej", 	"vand er like, mega sundt"), 
		Q3("Hvad kan man bruge bananskræller til?", "multiple", "A", 	"man kan også brugedem som fælder"), 
		Q4("Hvor lang tid holder mælk sig god?", 	"multiple", "C", 	"kakaomælk holder sig ikke lige så lang tid"), 
		Q5("CustomEnum spørgsmål?", 				"binary", 	"Ja", 	"vi kan alle sammen gøre en forskel på madspild!");
	    
	    private String question;
	    private String options;
	    private String answer;
	    private String funFact;
	    
	    private CustomEnum(String question, String options, String answer, String funFact) {
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
}
//Make a dictionary from each of these entries in another file, 
//with a for-loop. Then load those dictionaries with all the questions,
//from the different categories together with their respective answers.
//The questions for the different categories might need to be in each
//file.

//This looks fine and all, but i think i just put everything into 
//another enum, without separating them... :)
//psst.. try changing the word ´category´ with something more specific,
//like we did in ´storage´ enum. Been there done that (FeelsStrongMan)
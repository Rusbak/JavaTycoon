package quizApp;

public enum Cat {
	
	Cat(Kategori.StorageQuestions, Kategori.EdibilityQuestions, Kategori.FoodWasteQuestions);
	
	private Kategori[] catEnum;
	
	Cat(Kategori... catEnum) {
		this.catEnum = catEnum;
	}
	
	public Kategori[] getCategoriesEnum() {
		return catEnum;
	}
	
	public enum Kategori {
		StorageQuestions, 
		EdibilityQuestions, 
		FoodWasteQuestions
	}
	
//	public String getKategori(String kategori) {
//		if(kategori == Kategori.StorageQuestions.toString()) {return StorageQuestions.values();}
//		if(kategori == Kategori.EdibilityQuestions.toString()) {return edibility;}
//		if(kategori == Kategori.FoodWasteQuestions.toString()) {return foodwaste;}
//	}
	
	public static void main(String[] args) {
		//Categories.values();
		//Storage.values();
		System.out.println(FoodWasteQuestions.values()[1].getQuestion());
		
	}
}

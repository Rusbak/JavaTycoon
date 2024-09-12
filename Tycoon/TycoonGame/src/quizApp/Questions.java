package quizApp;

import java.util.*;


public class Questions {
	//With this line we can generate random numbers
	public static Random rand = new Random();

	//	Here we create a temp Dictionary, that we can store the Q's and A's in
	static Dictionary<String, String> qDict;
	
	public static void loadCategories() {
//		Here we create a list to store all the categories in
		ArrayList<String> categories = new ArrayList<String>();
		
//		Here we loop through the categories and add them all
		for(int i=0; i<Categories.values().length; i++) {
			categories.add(Categories.values()[i].toString());
		}
		System.out.println("Possible categories: " + categories);
		
//		Here we select a random category. Change away from random
		selectedCategory = categories.get(rand.nextInt(categories.size()));
		selectedCategoryIndex = categories.indexOf(selectedCategory);
		
		System.out.println("Selected Category: " + selectedCategory + " | Index: " + selectedCategoryIndex);
		
		loadStorageQuestions();

	}
	
	public static String selectedCategory;
	public static int selectedCategoryIndex; //maybe not needed, just verification
	
    public static void loadStorageQuestions() {
        qDict = new Hashtable<String, String>();

//		Here we store the questions in the questions Dictionary
        for (int i = 0; i < Storage.values().length; i++) {
            qDict.put(Storage.values()[i].getQuestion(), Storage.values()[i].getAnswer()); //i already have this in Storage enum i think?

            System.out.println(Storage.values()[i].getQuestion() + " - " + Storage.values()[i].getAnswer());
        }
        
//        System.out.println(Cat.values()[0].getKategori(selectedCategory));
    }
	public static void main(String[]args) {
//		Calls the methods in here from other scripts
		loadCategories();
	}
}

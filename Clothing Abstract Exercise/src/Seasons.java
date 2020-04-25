// Michael Jay Marajas Abstract Class Assignment

// COP 2800C 

// 3/24/2020

// Purpose: To demonstrate the ability to create abstract classes
//			To demonstrate the ability to distinguish and call concrete classes and abstract classes
public class Seasons extends AbClothing{

	//Have to reference super constructor
		public Seasons(String cloth, String type) {
		super(cloth, type);
		
	}
		//Defines all the Seasons abstract classes in the super
		public void winter() {
			System.out.println("This clothing is great for winter.");
		}
		public void summer() {
			System.out.println("This clothing is great for summer.");
		}
		public void fall() {
			System.out.println("This clothing is great for fall.");
		}
		public void spring() {
			System.out.println("This clothing is great for spring.");
		}
		
}
			


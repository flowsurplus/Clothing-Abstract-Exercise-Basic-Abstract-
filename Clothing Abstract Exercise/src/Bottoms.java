// Michael Jay Marajas Abstract Class Assignment

// COP 2800C 

// 3/24/2020

// Purpose: To demonstrate the ability to create abstract classes
//			To demonstrate the ability to distinguish and call concrete classes and abstract classes
public class Bottoms extends AbClothing{
	public Bottoms(String cloth, String type) {
		super(cloth, type);
	}
	//Defines all the Bottoms abstract classes in the super
	public void sweatpants() {
		System.out.println("This would be great with a pair of sweatpants!");
	}
	public void shorts() {
		System.out.println("This would be great with a pair of shorts!");
	}
	public void jeans() {
		System.out.println("This would be great with a pair of jeans!");
	}
	public void joggers() {
		System.out.println("This would be great with a pair of joggers!");
	}
}

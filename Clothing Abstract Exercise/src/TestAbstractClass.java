// Michael Jay Marajas Abstract Class Assignment

// COP 2800C 

// 3/24/2020

// Purpose: To demonstrate the ability to create abstract classes
//			To demonstrate the ability to distinguish and call concrete classes and abstract classes
public class TestAbstractClass {

	public static void main(String[] args) {
		//First part of the instantiation begins with abstract class
		//The second part can only refer to a "concrete" class an not an abstract one
		AbClothing jacket = new Seasons("Polyester", "Jacket");
		//Needed to instantiate two objects to access different classes
		AbClothing jacketbot = new Bottoms("Polyester", "Jacket");
		System.out.println(jacket);
		jacket.winter();
		jacketbot.sweatpants();
		System.out.println("\n");
		
		AbClothing tshirt = new Seasons("Cotton", "T-Shirt");
		AbClothing tshirtbot = new Bottoms("Cotton", "T-Shirt");
		System.out.println(tshirt);
		tshirt.summer();
		tshirtbot.joggers();
		System.out.println("\n");
		
		AbClothing turtleneck = new Seasons("Wool", "Turtleneck");
		AbClothing turtleneckbot = new Bottoms("Wool", "Turtleneck");
		System.out.println(turtleneck);
		turtleneck.fall();
		turtleneckbot.jeans();
		System.out.println("\n");
		
		AbClothing tanktop = new Seasons("Cotton", "Tank-Top");
		AbClothing tanktopbot = new Bottoms("Cotton", "Tank-Top");
		System.out.println(tanktop);
		tanktop.spring();
		tanktopbot.shorts();
		System.out.println("\n");
	}

}

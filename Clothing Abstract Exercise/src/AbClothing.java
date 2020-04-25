// Michael Jay Marajas Abstract Class Assignment

// COP 2800C 

// 3/24/2020

// Purpose: To demonstrate the ability to create abstract classes
//			To demonstrate the ability to distinguish and call concrete classes and abstract classes
abstract class AbClothing {
	//Integrate inheritance to base abstract class
	//This class will be used to hold all abstract variables to be tested and modified in other classes 
	private String cloth;
	private String type;
	
	public AbClothing (String cloth, String type) {
		setCloth(cloth);
		setType(type);
	}
	// Generated the getters and setters for cloth and type parameters
	public String getCloth() {
		return cloth;
	}

	public void setCloth(String cloth) {
		this.cloth = cloth;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		String result;
		result = type + ": The cloth used for this particular clothing is " + cloth;
		return result;
	}
	//Generate abstract classes within so I can modify it in other classes 
	public abstract void winter();
	public abstract void summer();
	public abstract void fall();
	public abstract void spring();
	
	//Generate Abstract classes for Bottoms
	public abstract void sweatpants();
	public abstract void shorts();
	public abstract void jeans();
	public abstract void joggers();
}

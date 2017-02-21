import java.util.ArrayList;


public class Dog extends Pet {
	boolean isTrianed;
	private Tail tailType;
	private String newline = System.getProperty("line.separator");

	//ArrayList <String>tailType;
	public Dog()
	{
		this.isTrianed=false;

	}
	public Dog(String name, String breed,String color, double weight, Tail tailtype)
	{
		super.setName(name);
		super.setBreed(breed);
		super.setColor(color);
		setWeight(weight);
		setTailType(tailtype);

	}
	public Dog(String name, String breed,String color, double weight, boolean isTrained ,  Tail tailtype)
	{
		super.setName(name);
		super.setBreed(breed);
		super.setColor(color);
		setWeight(weight);
		setTrianed(isTrained);
		setTailType(tailtype);


	}
	public Dog(String name, String breed, String color, String numLegs, String weight, String tailType)
	{
		super.setName(name);
		super.setBreed(breed);
		super.setColor(color);
		
		setWeight(weight);
		setTailType(tailType);
		setNumOfLegs(numLegs);
	}

	public boolean isTrianed()
	{
		return isTrianed;
	}
	public void setTrianed(boolean isTrianed)
	{
		this.isTrianed = isTrianed;
	}
	public Tail getTailType()
	{
		return tailType;
	}
	public void setTailType(Tail tailType)
	{
		this.tailType = tailType;
	}
	public void setTailType(String tt)
	{
		if(tt.equalsIgnoreCase("ring"))
		{
			this.tailType=Tail.RING;
		}
		else if(tt.equalsIgnoreCase("Docked"))
		{
			this.tailType=Tail.DOCKED;
		}
		else if (tt.equalsIgnoreCase("Corkscrew")||tt.equalsIgnoreCase("screw")||tt.equalsIgnoreCase("cork"))
		{
			this.tailType=Tail.CORKSCREW;
		}
		else if(tt.equalsIgnoreCase("Bob"))
		{
			this.tailType=Tail.BOB;
			
		}
		else if(tt.equalsIgnoreCase("Flagpole"))
		{
			this.tailType= Tail.FLAGPOLE;
		}
		else if(tt.equalsIgnoreCase("Saber"))
		{
			this.tailType=Tail.SABER;
		}
		else if(tt.equalsIgnoreCase("Sickle"))
		{
			this.tailType=Tail.SICKLE;
		}
	}

	public  void setWeight(double weight)
	{

		if(weight>2&&weight<250)
		{
			this.weight=weight;
		}
		else 
		{
			this.weight = 40;
		}
	}
	@Override
	public String toString()
	{
		return "The name of the dog is : " + name + newline+
				"The breed of the dog is: " + breed + newline +
				"The color of the dog is: "+ color + newline + 
				" The weight of the dog is: "+ weight + newline +
				"The  number of legs the dog has is: "+ numOfLegs + newline+
				"The dogs tail type is : " + tailType  + newline + newline;

	}


}

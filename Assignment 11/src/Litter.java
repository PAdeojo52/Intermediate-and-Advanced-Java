public enum Litter 
{
	SCOOPABLE, CRYSTALS, REGULAR, CORN, NONE;  //only valid values.

	@Override 
	public String toString() 
	{
		String s = super.toString();
		return s.toLowerCase();
	}
}

/**
 * Class: Fraction.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Aug 25, 2015
 * 
 * 
 *  This class – ******
 * 
 *  Purpose: – ******
 */

public class Fraction
{

	private int num;
	private int denom;
	


public Fraction()
{
	this.num= 0;
	this.denom= 1;
	
}

public Fraction(int denom)
{
	this.num = num;
	this.denom= denom;
}
public Fraction(int num , int denom)
{
	this.num = num;
	this.denom= denom;
	
}

public Fraction add(Fraction f)
{
	int num = num * f.getDenom() + f.getNum()* denom;
	int denom1= denom *  f.getDenom();
	return new Fraction(num1,denom1);
}

public int getNum()
{
	return num;
}

public void setNum(int num)
{
	this.num = num;
}

public int getDenom()
{
	return denom;
}

public void setDenom(int denom)
{
	this.denom = denom;
}

public String toString()
{
	return "Fraction num" + num + "," + 
}
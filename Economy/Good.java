/*

The purpose of the class is represent a good.

VARIABLES 


CONSTRUCTOR

METHODS

*/

import java.lang.Comparable; 
import java.lang.Number; 
public class Good implements Comparable<Good>
{

	double price; 


	public Good(double price)
	{

		this.price = price; 

	}//end constructor 


	public double getPrice()
	{

		return this.price; 

	}//end getPrice()


	public int compareTo(Good otherGood)
	{

		if (this.price - otherGood.getPrice() > 0.0)
		{
			
			return 1;

		}//end if 
		else if(this.price - otherGood.getPrice() < 0.0)
		{

			return -1; 

		}//end if else 
		else
		{

			return 0; 

		}//end else 

	}//end compareTo()



}//end class 
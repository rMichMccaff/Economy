
/*

 Our budget equation is as follows px + py = m.  The consumer will have an income which is a function of their job.  
 Really this function should  


VARIABLES 
Price px
Price py 
Quantity x 
Quantity y 


CONSTRUCTOR 


METHODS
setPx()
setPy()
getPx()
getPy()
getX()
getY()
getM()

*/


import java.lang.Number; 

public class BudgetConstraint<Price extends Number,Quantity extends Number,
								 Income extends Number> extends Function
{

	
	double px;
	double py; 
	double x; 
	double y; 
	double m; 



	//building with a good  
	public BudgetConstraint(Good good1 , Good good2, Income income)
	{

		this.px = good1.getPrice();  
		this.py = good2.getPrice();
		this.m 	= income.doubleValue(); 

	}//end constructor 

	 

	public void getPx(Price newPrice)
	{

		this.px = newPrice; 

	}//end getPx()


	public void setPy(Price newPrice)
	{

		this.py = newPrice; 

	}//end setPy()


	public void setIncome(Income newM)
	{

		this.m = newM; 

	}//end setIncome() 


	public double getPx()
	{

		return this.px.doubleValue(); 

	}//end getPx()


	public double getPy()
	{

		return this.py.doubleValue(); 

	}//end getPy()


	public double getY(Quantity x)
	{

		return ( (this.m.doubleValue()/this.py.doubleValue() ) - 
				((this.px.doubleValue()/this.py.doubleValue())*(x.doubleValue())) );


	}//end getY()


	public double getX(Quantity y)
	{

		return ((this.m.doubleValue()/this.px.doubleValue()) - 
				((this.py.doubleValue()/this.px.doubleValue())*(y.doubleValue()) ));

	}//end getX()


	public double getIncome()
	{

		return this.m.doubleValue(); 

	}//end getIncome() 


}//end class
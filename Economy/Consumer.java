
/*

The purpose of this class is to model a consumer for the purpose of creating a program capable of simulating economic 
behavior. There will need to be larger functionality that needs to be open to be used.  Ideally, we should be able to
make this work for some kind of shopkeeper game.  On a small scale however we should make our first set of goals to put   
together some basic functionality such as budget constraint, indifference curves, preferences, utility, and demand 
functions.  The real sort of end goal of the program should be to find optimal choice between two goods given a budget
constraint and a set of indifference curves.  The real question though is how will i develope these fundamental componenets?
How will i create



Step:
The Budget Constraint.  The idea will be to have a function which will tell us if the consumer is able to afford 
something or not.  There might be something more which needs to be considered further here as to whether we should 
consider the price of the budget constraint as originating from two commodities inserted into the budget function.  


Step:  
The Indifference Curves.  The idea should be to have a class which keeps an indifference curve based around a few 
cases.  We should have complements, perfect and otherwise, bads, and neutrals.  We then need a method of assigning 
how the consumer feels about these goods.  This should be a property of the good itself and assigned using the 
constructor of the good.  Are indifference curves properties of the goods themselves or the disposition of the 
consumer or a dialectic?      


**VARIABLES** 
BudgetConstraint budget; 



**CONSTRUCTORS**



**METHODS**
boolean affordable() 

*/

public class Consumer
{


	BudgetConstraint budget; 



	public Consumer(BudgetConstraint budget)
	{

		this.budget = budget; 

	}//end Consumer 


	

}//end class 
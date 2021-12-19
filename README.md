# FetchNextNumber
yebelo internship assighnment

## 1.Framework
	Spring boot

## 2.Architecture
	MVC architecture
  ### dependencies used
         1. spring boot Data Jpa
         2. spring boot starter web
         3. h2-database
         4. spring boot starter test

## 3.Tools
	Intellij IDE , H2 database , Postman , chrome , 

## 4.End point
	@GetMapping  in spring annotation Which receives the category  	as /FetchVariable/{category}
	Overall api link is 
	http://localhost:8080/FetchNextNumber/1
## 5. Data Model
Table model – h2 database stores this as a table. 
### Two variables
		Category
		value
		
### Return object model –  this returns below two value has JSON object.
	    oldValue
	    NewValue
## 6. Service class –  all the business logic of the application reside
	Contains two methods,businessLogic() has public and digSum() has private.

## 7. Algorithms
To find a digit sum in O(1) time Complexity.

If n == 0
   return 0;
   
If n % 9 == 0      
    digSum(n) = 9
    
Else               
    digSum(n) = n % 9

# FetchNextNumber
yebelo internship assighnment
# usage guide

## 1 . Application.properties
	Connection to database ( H2 - database)
		spring.datasource.url=jdbc:h2:mem:test
		spring.datasource.driverClassName=org.h2.Driver
		spring.datasource.username=sa
		spring.datasource.password=password
		spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
		spring.h2.console.enabled=true


## 2. Api LINK
	http://localhost:8080/FetchNextNumber/1
	
	The last path variable range from 1 to 9
## 3. Multiple users/applications 
can request the data and each one will get distinct output


## 4.Framework
	Spring boot

## 5.Architecture
	MVC architecture
  ### dependencies used
         1. spring boot Data Jpa
         2. spring boot starter web
         3. h2-database
         4. spring boot starter test

## 6.Tools
	Intellij IDE , H2 database , Postman , chrome , 

## 7.End point
	@GetMapping  in spring annotation Which receives the category  	as /FetchVariable/{category}
	Overall api link is 
	http://localhost:8080/FetchNextNumber/1
## 8. Data Model
Table model – h2 database stores this as a table. 
### Two variables
		Category
		value
		
### Return object model –  this returns below two value has JSON object.
	    oldValue
	    NewValue
## 9. Service class –  all the business logic of the application reside
	Contains two methods,businessLogic() has public and digSum() has private.

## 10. Algorithms
To find a digit sum in O(1) time Complexity.

If n == 0
   return 0;
   
If n % 9 == 0      
    digSum(n) = 9
    
Else               
    digSum(n) = n % 9

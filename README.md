# Springboot-Project
pre-requiste:
1. java 8
2. maven 3.3+

Steps to run the app:

1. checkout the code from https://github.com/kailashgitacnt/Springboot-Project.git.
2. open command window in the extracted directory.
3. run the command:  mvn clean spring-boot:run
4. once the app is started successfully, access swagger using: http://localhost:8090/swagger-ui.html
5. or the below endpoints can be accessed using postman:
	
	operation 1:
	
	POST: 
	endpoint: http://localhost:8090/addEmployee
	request:
	{
		"firstName" : "myFirstName",
		"lastName"	: "myLastName",
		"gender"	: "male",
		"dateOfBirth" : "20 Oct 89",
		"department" : "IT"
	}
	
	operation 2:
	
	GET:
	endpoint: http://localhost:8090/getEmployees

	

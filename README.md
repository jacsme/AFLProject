# AFLProject
This project is developed using Java 8 with Maven, Junit and Mockito. The code is organized through a controller, service, constant, enums and util. Jacoco is not included at the moment.

# CONTROLLER
The controller is the main program. As for the purpose of execution it methods were coded in a plain main method. Which eventually can be replace as restful api. 

# SERVICE
The service classes are composed of interface class and implemented class. These will promote code maintainable and reusable for the future enhancement. The implement classes are the actual execution of the project. 

# CONSTANT
Constants variables are place here to make it reusable to some future usage.

# ENUMS
This project uses enums to ensure the correct usage of condition particularly in the number iterations

# UTIL
This is for the utility classes which will help the service classess implementation to process some calculation, these are refactored methods.

Children’s Game
----------------------------------------------------------------------------------
totalChildren - is the number of Children will play the game.
runningNumber - is the number that was selected to stop the counting and the number that pointed to it will be eliminated. 
winnerChild - is the final number that the was the last number left.

Number Iterator
----------------------------------------------------------------------------------
integersLength - is the total number of the sequence, this will be the basis of the code to iterate over the sequence. 
firstNumber - is the number that is divisible by 3
secondNumber - is the number that is divisible by 5

The program will append each item to String Builder together with the sequence number and the word FOO is it is divisible by 3. 
The program will append each item to String Builder together with the sequence number and the word BARis it is divisible by 5
The program will append each item to String Builder together with the sequence number and the word BAZ is it is divisible by both 3 and 5. 

The code was coded to include some enums for other divisibilities however the main code conditions only limited to odd numbers. 

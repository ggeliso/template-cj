# template-cj

_This mini project allows us to calculate a total amount according the salary of active employees_

## Overview of functionality 📄
_Template-cj's process allow us to get a total amount depending on salaries active employees, to reach this,
it was necessary to create an abstract class, which hides how it is implemented, with this
scenario, in the future we can implement another way to calculate an new total amount, 
without modifying the existing code, so the current functionality inherit its attributes, methods 
and the abstract method to create behavior according our needs_


## How is it possible to add new functionalities without modifying any further? 📄
_This is possible extending abstract class in new class and coding the behavior as you
want, in this way you do not need to do any adjust on current functionality, but it is
necessary to say that, the mini project was created with spring boot, so if you need to use a specific implementation, you can inject an implementation using Qualifier annotation
to avoid any compile exception and your functionality can work as you need_

## Stack tool 🛠️
* [Spring boot](https://spring.io/projects/spring-boot) - Framework de java
* [Junit 5](https://junit.org/junit5/docs/current/user-guide/) - Write test
* [H2](https://www.h2database.com/html/main.html) - Memory database

### Requirement
* Java 17 (JDK)
* Apache Maven 3.9.5

#### Apache Maven
_Commands:_

    compile: mvn compile clean
    run test: mvn test
    run project: mvn spring-boot:run
    
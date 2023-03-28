# Spring-boot-learning
Listing out the things I have learnt in Spring boot

- Application properties
- Logging

### Application Properties
Several default behaviours by Spring boot can be overridden according to our need via properties in application properties

Steps to use custom properties in the application
- Add annotation @EnableConfigurationProperties({ApplicationProperties.class}) to the main class of your spring boot application  
- Create a class or record in the application and annotate it with @ConfigurationProperties(prefix = "app") where the prefix is the prefix of the properties that are custom to the application
  - For example, ApplicationProperties is the record which holds the custom properties of the application

#### Profiles
We can have different properties with several profiles in the application.  
- We can have properties change per profile by setting them in the appropriate file like application-dev.properties or application-qa.properties
- In here, we have application-p1.properties for profile1 and application-p2.properties for profile2

Update the property "spring.profiles.active=p1" in application.properties to select the profile we need.

### Logging
Logging is enabled by default in Spring boot.  
As we are using spring boot starter dependencies, Logback is used for logging by default.  

Customisation of logging can be performed using properties.  
Basic logging customisation via properties can be found in application-p1.properties.

#### Mapped Diagnostic context
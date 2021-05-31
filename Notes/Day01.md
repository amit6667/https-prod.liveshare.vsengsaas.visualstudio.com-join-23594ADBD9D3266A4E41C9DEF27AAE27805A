# Installing Scoop

Timestamp: 10:25 am 31/05/2021

# JDK: Vendors, Licenses and Versions


timestamp: 10:47

## Raw

- google search download jdk
- oracle site
- openjdk

- Oracle acquired sunmicrosystems
- People selling applications created using Java


- oraclejdk
- openjdk

# Vendors

Loads of Vendors:

- OracleJDK
- OpenJDK
- AdoptOpenJDK
- Zulu JDK
- Corretto (I will be using this)
- Microsoft

# Licensing

https://www.oracle.com/java/technologies/java-se-support-roadmap.html

# Version

I will use version 11

# Installing Java with Scoop

Timestamp: 11:37 am 

In powershell type the following command:

```
scoop search corretto
scoop install git
scoop bucket add java
scoop install corretto11
java --version
```

# Installing Maven

Timestamp: 12:09


Scoop :

```
scoop install maven
mvn --version
```

# Installing STS

Timestamp: 12:40 pm


```
scoop bucket add extras
scoop install sts
```

Manual Way:

https://spring.io/tools

# Lunch Work

- Install STS
- Install VSCode
- Create a Github account



---

# Setting up JDK

Timestamp:16:07

- STS comes up with it's own version of java
- We want to use Corretto11


# New Spring Boot Project (Dependency Injection Examples)

TImestamp: 15:43


cognixia.com
com.cognixia.lockdown

groupid = organizationname.teamname  (not mandatory, depends on company to company)


## Raw

move the creation and binding of the dependent objects outside of the class that depends on them.

If any class need some libraries or user defined functionaries we need some dependencies so spring is responsible to create  the instance and inject automatically 

object receives other objects that it depends on.


# What does spring bring to Java?

- programming paradigms
- Brings Declarative paradigm to Java

## DI

Dependency Injection is a concept which is not unique to java.

Spring provides an amazing implementation of DI.


## Raws

- Removes boilerplate code from Java Code
- Abstraction on technologies

# An non industry best practice example of Manual Dependency Injection using Spring

TimeStamp: 16:42


## Naming Conventions

- Classes should start with Caps and should be a Noun
- Function names should be camelCase and a Verb


# Coupling

## Case: Change from Lockdown1 to LockdownFirst

1. Right Click -> Refactor -> Rename
2. Change Class Name at instantiation
3. Change Class Name at data type declaration


# OOPS

- Encapsulation
- Polymorphism
- Inheritance
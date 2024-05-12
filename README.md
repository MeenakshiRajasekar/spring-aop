Spring AOP is a technique used to modularize cross-cutting concerns in applications. 
It allows separating cross-cutting concerns from the main business logic, promoting better code organization, and easier maintenance.

Key Concepts:

Aspect: Explain what an aspect is in Spring AOP. An aspect encapsulates cross-cutting concerns.
Advice: Discuss the types of advice: before, after, and around advice, which are actions taken by an aspect at specified join points.
Join Point: Describe what a join point is. It represents a point in the execution of a program, such as method invocation or exception handling.
Pointcut: Explain pointcuts, which are expressions that define where advice should be applied in the code.

Dependencies:
aspectjrt - rt(run time)
aspectjweaver
spring-starter-aop

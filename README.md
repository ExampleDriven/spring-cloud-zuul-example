[![Build Status](https://travis-ci.org/ExampleDriven/spring-cloud-zuul-example.svg?branch=master)](https://travis-ci.org/ExampleDriven/spring-cloud-zuul-example)
# spring-cloud-zuul-example

This is the source code for the blog post

https://exampledriven.wordpress.com/2016/07/06/spring-cloud-zuul-example/


Feature |test url
--- |---
Service auto registration via Eureka | http://localhost:9090/api/customer-service/customer/1
Service registration by address | http://localhost:9090/api/customer-by-address/customer/1
Service registration by Eureka service id | http://localhost:9090/api/customer-by-service/customer/1
Display Routes | http://localhost:9090/routes
Static response | http://localhost:9090/api/static
Static response | http://localhost:9090/api/static/dsf.svg
Dynamic routing | http://localhost:9090/api/redirect

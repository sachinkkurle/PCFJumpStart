PCF Jump Starter Kit - This library contains Spring/Spring cloud/Netflix components which are commonly used and required to migrate your application on PASS platform like Pivotal Cloud Foundry using Spring cloud Tech Stack. It worth while to note this libraries/componets can be used for any Java/Spring based application migration and PASS platform.

Demo Client - Sample Application to learn Eureka discovery, Zuul Routing, logging and zipkin traces

==========================================================================

Start Eureka server in 8761 and zipkin server in 9411 before this application

==========================================================================

build and run the student sample which runs in localhost:8090

application will be connected with eureka which is running in localhost:8761, and this application name will be shown in eureka dashboard.

check if the student application is working fine, try to hit

localhost:8090/echoStudentName/sumanth Expected response: Hello sumanth Responsed on : Tue Oct 02 15:35:22 IST 2018

localhost:8090/getStudentDetails/sumanth Expected Response: {"name":"sumanth","address":"India","cls":"MBA"}

==========================================================================

#logging:

Lombok dependency has been added to the project, so we can use @Slf4j annotation and add logging.

There are 5 levels of logs based on usage

Trace
Debug
Info
Warn
Error
These are in the order of low to high priority. Default log level is info, so the logs of info and higher only will get logged.

This log level can be modified by the below property in the yml file, logging: level: root: warn

========================================================================== 

If you want to find the details for each request, open zipkin dashboard and find the trace details

==========================================================================

© 2018 GitHub, Inc.

Build the application
Run the application, it starts in localhost:8080

==============================================================================

Now build and run the student sample (spring-boot-zuulgatwayproxy-student-service) which runs in localhost:8090
check if the student application is working fine, try to hit
localhost:8090/echoStudentName/sumanth
Expected response: Hello sumanth Responsed on : Tue Oct 02 15:35:22 IST 2018

localhost:8090/getStudentDetails/sumanth
Expected Response: {"name":"sumanth","address":"Pune","cls":"MCA"}

==============================================================================

If we see application.yml of zuul, we will find that we are pointing it to student service using eureka with the url starting with /student

So we can access student application from zuul,

localhost:8080/student/echoStudentName/sumanth
Expected response: Hello sumanth Responsed on : Tue Oct 02 15:35:22 IST 2018

localhost:8080/student/getStudentDetails/sumanth
Expected Response: {"name":"sumanth","address":"Pune","cls":"MCA"}


==============================================================================

Successfully we learnt about zuul, still there is lot of configuration to know about routings. 

We can get it from 

https://cloud.spring.io/spring-cloud-netflix/multi/multi__router_and_filter_zuul.html

https://spring.io/guides/gs/routing-and-filtering/

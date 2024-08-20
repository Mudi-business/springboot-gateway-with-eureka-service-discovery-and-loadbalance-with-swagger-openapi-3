# springboot-gateway-with-eureka-service-discovery-and-loadbalance-with-swagger-openapi-3
dockerized Micro-services spring gateway that connects with eureka service discovery, making an internal docker connection  which makes it fast and reliable, also with eureka again we were able to create a load balance for our test service called service_1 , we created two different instance and db's of service_1 to check if the load balance's working

FOR DOCKER
Note: docker-compose.yml contains a eureka-network which help us call all of our services by continer's name instead of localhost or local IPs because internal container communications make
service respond super fast and secured since no external IP's exposed out apart from eureka and gateway all other services IPs are invincible outside so it's highly recomended, but you can also
adjust the compose file according to your needs.
1) clone the project , modify the docker-compose.yml enviroment according to your needs.
2) all services were deploy without .jar files so make sure you build them up before running them with docker compose up.
3) run docker compose up --build or docker compose up -d --build.
4) navigate to eureka url "localhost:8761" to check if it's up and already registerd the gateway and first-service( demo service ) at this stage first-service will have two instance performing load balance.
5) If eureka has successfully registerd gateway and first-serivice then navigate to gateway url to check the availabilit of those services default will be "localhost:5050/swagger-ui.html" or with your custom PORT.
6) You can try to send multiple data or stress the endpoint to see if everything's working fine and if the loadbalance's working as well.
7) If you've set different database schema for the first-service and first-service_replica you will be able to see the loadbalance working.
8) navigate to your schema one at time you will find a users table , try to select * users from your db_1 and db_2 you find them all with data meaning that the loadbalance is working fine


WITHOUT DOCKER
1) clone the project , navigate to eureka,service_1 and service_1_dub and change the .env file with your suitable configurations.
2) all services were deploy without .jar files so make sure you build them up before running them one by one.
3) navigate to eureka url "localhost:8761" to check if it's up and already registerd the gateway and first-service( demo service ) at this stage first-service will have two instance performing load balance.
4) If eureka has successfully registerd gateway and first-serivice then navigate to gateway url to check the availabilit of those services default will be "localhost:5050/swagger-ui.html" or with your custom PORT.
5) You can try to send multiple data or stress the endpoint to see if everything's working fine and if the loadbalance's working as well.
6) If you've set different database schema for the first-service and first-service_replica you will be able to see the loadbalance working.
7) navigate to your schema one at time you will find a users table , try to select * users from your db_1 and db_2 you find them all with data meaning that the loadbalance is working fine


If there are any bugs don't hesitate to add them on the issues sections for more modifications
Thank you , I hope this will be a step in mastering Spring-boot Microservices Archietecture.
Don't forget to give me a start if all this was helpful to you.
   

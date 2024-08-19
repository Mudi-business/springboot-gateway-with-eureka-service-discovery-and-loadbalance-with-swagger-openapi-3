package zra.org.service_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

 @SpringBootApplication
// @OpenAPIDefinition(info = @Info(title = "Test Service",description = "SERVICE FOR MANAGING LOAD BALANCE",version = "1.0", contact = @Contact( name = "Mohamed Bakari Mohamed",
//  email = "dogojanja50@gmail.com", url = "https://test.co.tz")) , servers = @Server(url = "http://localhost:5051/service_1", description = "RESFUL API FOR TESTING"))

 @OpenAPIDefinition(info = @Info(title = "Test Service",description = "SERVICE FOR MANAGING LOAD BALANCE",version = "1.0", contact = @Contact( name = "Mohamed Bakari Mohamed",
 email = "mohdbeka240@gmail.com", url = "https://test.co.tz")) , servers = @Server(url = "http://${API_GATEWAY_PATH}:${API_GATEWAY_PORT}/${APPLICATION_NAME}", description = "RESFUL API FOR TESTING"))
public class Service1Application {

	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}

}

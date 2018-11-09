package entelect.incubator.netflixsso.msrv.service.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication()
@EnableEurekaServer
public class ServiceDiscoveryMsrvApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ServiceDiscoveryMsrvApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryMsrvApplication.class, args);
    }
}
package entelect.incubator.netflixsso.msrv.zuul.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulProxyApplication extends SpringBootServletInitializer {
        public static void main(String[] args) {
            SpringApplication.run(ZuulProxyApplication.class, args);
        }
}

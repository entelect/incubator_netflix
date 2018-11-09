package entelect.incubator.netflixsso.msrv.sequences;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication()
public class MathMsrvApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MathMsrvApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(MathMsrvApplication.class, args);
    }
}
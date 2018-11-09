package entelect.incubator.netflixsso.msrv.sequences;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication()
public class SequencesMsrvApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SequencesMsrvApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SequencesMsrvApplication.class, args);
    }
}
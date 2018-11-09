package entelect.incubator.netflixsso.msrv.sequences.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Feign;
import feign.form.FormEncoder;
import feign.Client;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import entelect.incubator.netflixsso.msrv.sequences.clients.SequencesClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import discovery.portal.das.exceptions.handling.advice.FeignErrorDecoder;

@Configuration
@EnableFeignClients
public class FeignConfiguration {

    @Value("${client.sequences.name}")
    private String sequencesClientName;


    @Bean
    public Client feignClient() {
        return new Client.Default(null, null);
    }

    @Bean
    public SequencesClient sampleClient(Client feignClient, ObjectMapper objectMapper) {
        return Feign.builder()
                .client(feignClient)
                .encoder(new FormEncoder(new JacksonEncoder(objectMapper)))
                .decoder(new JacksonDecoder(objectMapper)).target(SequencesClient.class, sequencesClientName);
    }
}
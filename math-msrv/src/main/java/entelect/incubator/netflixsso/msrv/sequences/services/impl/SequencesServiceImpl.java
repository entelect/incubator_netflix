package entelect.incubator.netflixsso.msrv.sequences.services.impl;

import entelect.incubator.netflixsso.msrv.sequences.clients.SequencesClient;
import entelect.incubator.netflixsso.msrv.sequences.services.SequencesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/***
 * Business logic layer. Notes:
 * 1. Put only business logic here, even as simple as getting something from a client
 * 2. Try not to inject http/web beans such as RestTemplates or WebserviceTemplates. instead write a client interface and
 * delegate those calls to the client
 * 3. Business logic exception handling + validation here. Try not to
 * validate web requests or handle bad web responses here
 *
 */

@Service
public class SequencesServiceImpl implements SequencesService {

    private SequencesClient sequencesClient;
    private static final Logger logger = LoggerFactory.getLogger(SequencesServiceImpl.class);

    @Autowired
    public SequencesServiceImpl(SequencesClient sequencesClient) {
        this.sequencesClient = sequencesClient;
    }

    @Override
    public String printAllSequences(int depth){
        StringBuilder sequences= new StringBuilder();
        sequences.append("Printing all sequences:\n");
        Arrays.stream(SequenceTypes.values()).forEach(x->{
            sequences.append(x.name().toLowerCase());
            sequences.append(": ");
            sequences.append(sequencesClient.generateSequence(x.name(), String.valueOf(depth)));
            sequences.append("\n");
        });
        return sequences.toString();
    }
}
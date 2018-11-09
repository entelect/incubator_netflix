package entelect.incubator.netflixsso.msrv.sequences.services.impl;

import entelect.incubator.netflixsso.msrv.sequences.services.SequencesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

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

    private static final Logger logger = LoggerFactory.getLogger(SequencesServiceImpl.class);

    @Override
    public String generateSequence(String type, int depth) {
        StringBuilder sequence= new StringBuilder();

        switch (type.toLowerCase()) {
            case "fibonacci":{
                sequence.append(fibonacci(depth));
                break;
            }
            case "triangular":{
                sequence.append(triangular(depth));
                break;
            }
            case "hexagonal":{
                sequence.append(hexagonal(depth));
                break;
            }
            default:{
                sequence.append("I dont know what you want but here is the Fibonacci in anycase: \n");
                sequence.append(fibonacci(depth));
                break;
            }
        }

        return sequence.toString();
    }

    private String fibonacci(int depth) {
        StringBuilder fibonacciSequence= new StringBuilder();
        int prevValue=1;
        int value=0;
        for(int i =0; i<depth; i++){
            int current=value;
            fibonacciSequence.append(value + ",");
            value= current+prevValue;
            prevValue=current;
        }
        fibonacciSequence.append("...");
        return fibonacciSequence.toString();
    }

    private String triangular(int depth){
        StringBuilder triangularSequence= new StringBuilder();
        for(int i =1; i<=depth; i++){
            triangularSequence.append((i*(i+1))/2 + ",");
        }
        triangularSequence.append("...");
        return triangularSequence.toString();
    }

    private String hexagonal(int depth){
        StringBuilder hexagonal= new StringBuilder();
        for(int i =1; i<=depth; i++){
            hexagonal.append((2*i*((2*i)-1))/2 + ",");
        }
        hexagonal.append("...");
        return hexagonal.toString();
    }
}
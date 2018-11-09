package entelect.incubator.netflixsso.msrv.sequences.clients;

import feign.Param;
import feign.RequestLine;

public interface SequencesClient {
    @RequestLine("GET sequence/{type}/{depth}")
    String generateSequence(@Param("type") String type, @Param("depth") String depth);
}

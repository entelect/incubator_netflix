package entelect.incubator.netflixsso.msrv.sequences.controllers;

import entelect.incubator.netflixsso.msrv.sequences.services.SequencesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Web facing layer. Notes:
 * 1. Do web validation here (ie null checks, formatting checks etc.)
 * 2. Try to make responses as RESTful as possible ie. 201 when items are created, 200 when GET is call,
 * 401 when a user is unauthorized etc.
 * 3. Do Web security here (or atleast inject web security entelect.incubator.netflixsso.msrv.sequences.services in here)
 */
@RestController
public class SequencesController {

    private SequencesService sequencesService;

    @Autowired
    public SequencesController(SequencesService sequencesService) {
        this.sequencesService = sequencesService;
    }

    @GetMapping("printAllSequences/{depth}")
    public String printAllSequences(@PathVariable("depth") int depth) {
        return sequencesService.printAllSequences(depth);
    }

}

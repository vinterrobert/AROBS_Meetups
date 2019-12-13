package com.arobs.ArobsMeetups.Controllers;

import com.arobs.ArobsMeetups.Entities.Proposal;
import com.arobs.ArobsMeetups.Services.ProposalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/proposals")
public class ProposalController {

    @Autowired
    ProposalService proposalService;

    @GetMapping(path="/", produces = "application/json")
    public List<Proposal> getAllProposals(){

        return null;
    }

    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addProposal(@RequestBody Proposal newProposal) {

        return null;
    }

    @DeleteMapping(path="/{idProposal}")
    public ResponseEntity<Object> deleteProposal(@PathVariable int idProposal){

        return null;
    }

    @GetMapping(path="/user/{idUser}/proposals", produces = "application/json")
    public List<Proposal> getUserProposal(@PathVariable int idUser){

        return null;
    }

    @GetMapping (path = "/{difficulty}/proposals", produces = "application/json")
    public List<Proposal> getProposalsOfSameDifficulty(@PathVariable String difficulty){

        return null;
    }

    @GetMapping (path = "/{type}/proposals", produces = "application/json")
    public List<Proposal> getProposalsOfSameType(@PathVariable String type){

        return null;
    }

}

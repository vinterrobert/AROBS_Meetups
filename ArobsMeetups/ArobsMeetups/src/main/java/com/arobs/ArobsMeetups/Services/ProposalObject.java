package com.arobs.ArobsMeetups.Services;

import com.arobs.ArobsMeetups.Entities.Proposal;
import com.arobs.ArobsMeetups.Repositories.ProposalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class ProposalObject {

    @Autowired
    ProposalRepository proposalRepository;

}

package com.arobs.ArobsMeetups.Repositories;

import com.arobs.ArobsMeetups.Entities.Proposal;

import java.util.List;

public class ProposalRepository {

    Proposal findProposalById(int proposalId){

        return null;
    }

    List<Proposal> getAllProposals(){

        return null;
    }

    List<Proposal> getProposalsOfSameDifficulty (String difficulty){

        return null;
    }

    List<Proposal> getUsersProposals (int userId){

        return null;
    }

    List<Proposal> getProposalsOfSameType(String type){

        return null;
    }

    void createProposal (Proposal newProposal){

    }

    void updateProposal(int idProposal, Proposal updatedProposal){

    }

    void deleteProposal (int idProposal){

    }

}

package com.arobs.ArobsMeetups.Controllers;

import com.arobs.ArobsMeetups.Services.ProposalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/proposal")
public class ProposalController {

    @Autowired
    ProposalService proposalService;

}

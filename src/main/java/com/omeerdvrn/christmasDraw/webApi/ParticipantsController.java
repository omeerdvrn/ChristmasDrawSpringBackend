package com.omeerdvrn.christmasDraw.webApi;


import com.omeerdvrn.christmasDraw.business.abstracts.ParticipantService;
import com.omeerdvrn.christmasDraw.business.requests.CreateParticipantRequest;
import com.omeerdvrn.christmasDraw.business.responses.GetParticipantByDrawIdResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/participants")
public class ParticipantsController {
    private ParticipantService participantService;

    @Autowired
    public ParticipantsController(ParticipantService participantService){
        this.participantService = participantService;
    }

    @GetMapping(path = "/getbyid")
    public List<GetParticipantByDrawIdResponse> getByDrawID(@RequestParam("drawID") String drawID){
        return participantService.getByDrawID(drawID);
    }

    @PostMapping(path = "/add")
    public void add(@RequestBody() CreateParticipantRequest createParticipantRequest){
        this.participantService.add(createParticipantRequest);
    }
}

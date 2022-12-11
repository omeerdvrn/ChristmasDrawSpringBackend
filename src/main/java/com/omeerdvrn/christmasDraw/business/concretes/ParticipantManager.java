package com.omeerdvrn.christmasDraw.business.concretes;

import com.omeerdvrn.christmasDraw.business.abstracts.ParticipantService;
import com.omeerdvrn.christmasDraw.business.requests.CreateParticipantRequest;
import com.omeerdvrn.christmasDraw.business.responses.GetParticipantByDrawIdResponse;
import com.omeerdvrn.christmasDraw.dataAccess.abstracts.ParticipantRepository;
import com.omeerdvrn.christmasDraw.entities.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParticipantManager implements ParticipantService {
    private ParticipantRepository participantRepository;

    @Autowired
    public ParticipantManager(ParticipantRepository participantRepository){
        super();
        this.participantRepository = participantRepository;
    }

    @Override
    public List<GetParticipantByDrawIdResponse> getByDrawID(String drawID) {
        List<Participant> participants = participantRepository.findAll();
        List<GetParticipantByDrawIdResponse> participantResponses = new ArrayList<GetParticipantByDrawIdResponse>();
        for (Participant participant : participants) {
            if(participant.getDrawID().equals(drawID)){
                GetParticipantByDrawIdResponse getByIdResponse = new GetParticipantByDrawIdResponse();


                getByIdResponse.setId(participant.getId());
                getByIdResponse.setName(participant.getName());
                getByIdResponse.setPair(participant.getPair());
                getByIdResponse.setDrawID(participant.getDrawID());

                participantResponses.add(getByIdResponse);
            }

        }
        return participantResponses;
    }

    @Override
    public void add(CreateParticipantRequest createTeamRequest) {
        Participant participant = new Participant();
        participant.setName(createTeamRequest.getName());
        participant.setPair(createTeamRequest.getPair());
        participant.setDrawID(createTeamRequest.getDrawID());
        participantRepository.save(participant);
    }


}

package com.omeerdvrn.christmasDraw.business.abstracts;

import com.omeerdvrn.christmasDraw.business.requests.CreateParticipantRequest;
import com.omeerdvrn.christmasDraw.business.responses.GetParticipantByDrawIdResponse;

import java.util.List;

public interface ParticipantService {
    List<GetParticipantByDrawIdResponse> getByDrawID(String drawID);
    void add(CreateParticipantRequest createTeamRequest);

}

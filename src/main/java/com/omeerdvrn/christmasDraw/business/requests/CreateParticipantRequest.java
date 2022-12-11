package com.omeerdvrn.christmasDraw.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateParticipantRequest {
    private int id;
    private String name;
    private String pair;
    private String drawID;
}

package com.omeerdvrn.christmasDraw.business.responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetParticipantByDrawIdResponse {
    private int id;
    private String name;
    private String pair;
    private String drawID;
}

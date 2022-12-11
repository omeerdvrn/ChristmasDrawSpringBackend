package com.omeerdvrn.christmasDraw.dataAccess.abstracts;

import com.omeerdvrn.christmasDraw.entities.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Integer> {
}

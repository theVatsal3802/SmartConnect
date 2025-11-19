package com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.repositories;

import com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.entities.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRepository extends JpaRepository<Meeting, Long> {
}

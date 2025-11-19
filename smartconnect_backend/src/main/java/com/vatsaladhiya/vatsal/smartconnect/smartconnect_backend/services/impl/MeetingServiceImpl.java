package com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.services.impl;

import com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.dtos.MeetingDto;
import com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.services.MeetingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingServiceImpl implements MeetingService {
    @Override
    public MeetingDto createMeeting(MeetingDto meetingDto) {
        return null;
    }

    @Override
    public MeetingDto deleteMeeting(Long meetingId) {
        return null;
    }

    @Override
    public List<MeetingDto> getAllMeetings(Long userId) {
        return List.of();
    }

    @Override
    public MeetingDto addMeetingNote(String note, Long meetingId) {
        return null;
    }

    @Override
    public MeetingDto generateAISummary(Long meetingId) {
        return null;
    }
}

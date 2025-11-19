package com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.services;

import com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.dtos.MeetingDto;

import java.util.List;

public interface MeetingService {
    MeetingDto createMeeting(MeetingDto meetingDto);
    MeetingDto deleteMeeting(Long meetingId);
    List<MeetingDto> getAllMeetings(Long userId);
    MeetingDto addMeetingNote(String note, Long meetingId);
    MeetingDto generateAISummary(Long meetingId);
}

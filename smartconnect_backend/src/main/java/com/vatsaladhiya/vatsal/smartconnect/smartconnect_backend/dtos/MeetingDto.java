package com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.dtos;

import com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.enums.MeetingTag;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public class MeetingDto {
    private UserDto creator;

    private String title;
    private String raw_notes;
    private String ai_summary;
    private Set<MeetingTag> tags;

    private List<UserDto> attendees;

    private LocalDateTime creationTime;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    private List<ActionItemDto> actionItems;
}

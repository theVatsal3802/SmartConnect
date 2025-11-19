package com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.dtos;

import com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.enums.ActionItemStatus;

import java.time.LocalDateTime;

public class ActionItemDto {
    private String title;

    private MeetingDto meeting;

    private String description;

    private UserDto owner;

    private LocalDateTime dueDate;

    private ActionItemStatus status;
}

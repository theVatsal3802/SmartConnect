package com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.strategies;

public interface GenAIStrategy {
    String generateMeetingSummary(Long meetingId, String note);
}

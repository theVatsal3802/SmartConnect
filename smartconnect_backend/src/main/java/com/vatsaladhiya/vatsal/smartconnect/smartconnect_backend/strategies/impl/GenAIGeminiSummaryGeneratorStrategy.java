package com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.strategies.impl;

import com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.strategies.GenAIStrategy;
import org.springframework.stereotype.Service;

@Service
public class GenAIGeminiSummaryGeneratorStrategy implements GenAIStrategy {
    @Override
    public String generateMeetingSummary(Long meetingId, String note) {
        return "";
    }
}

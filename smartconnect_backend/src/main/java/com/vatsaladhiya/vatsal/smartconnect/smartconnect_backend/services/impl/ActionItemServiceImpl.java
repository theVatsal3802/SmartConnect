package com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.services.impl;

import com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.dtos.ActionItemDto;
import com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.enums.ActionItemStatus;
import com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.services.ActionItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionItemServiceImpl implements ActionItemService {
    @Override
    public ActionItemDto createActionItem(ActionItemDto actionItemDto) {
        return null;
    }

    @Override
    public ActionItemDto updateActionItemStatus(Long actionItemId, ActionItemStatus updatedStatus) {
        return null;
    }

    @Override
    public List<ActionItemDto> getAllActionItems(Long userId) {
        return List.of();
    }

    @Override
    public ActionItemDto deleteActionItem(Long actionItemId) {
        return null;
    }
}

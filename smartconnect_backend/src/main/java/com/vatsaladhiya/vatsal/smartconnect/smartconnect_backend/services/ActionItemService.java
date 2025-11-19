package com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.services;

import com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.dtos.ActionItemDto;
import com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.enums.ActionItemStatus;

import java.util.List;

public interface ActionItemService {
    ActionItemDto createActionItem(ActionItemDto actionItemDto);
    ActionItemDto updateActionItemStatus(Long actionItemId, ActionItemStatus updatedStatus);
    List<ActionItemDto> getAllActionItems(Long userId);
    ActionItemDto deleteActionItem(Long actionItemId);
}

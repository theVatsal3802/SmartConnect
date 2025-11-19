package com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.entities;

import com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.enums.ActionItemStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ActionItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    private Meeting meeting;

    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    private User owner;

    private LocalDateTime dueDate;

    @Enumerated(EnumType.STRING)
    private ActionItemStatus status;
}

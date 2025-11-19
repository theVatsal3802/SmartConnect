package com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.entities;

import com.vatsaladhiya.vatsal.smartconnect.smartconnect_backend.enums.MeetingTag;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private User creator;

    private String title;
    private String rawNotes;
    private String aiSummary;

    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<MeetingTag> tags;

    @ManyToOne(fetch = FetchType.LAZY)
    private List<User> attendees;

    @CreationTimestamp
    private LocalDateTime creationTime;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @OneToMany(fetch = FetchType.LAZY)
    private List<ActionItem> actionItems;
}

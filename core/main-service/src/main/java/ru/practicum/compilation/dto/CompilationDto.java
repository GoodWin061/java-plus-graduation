package ru.practicum.compilation.dto;

import lombok.*;
import ru.practicum.events.dto.EventShortDto;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class CompilationDto {
    private Long id;
    private List<EventShortDto> events;

    @Builder.Default
    private Boolean pinned = false;
    private String title;
}

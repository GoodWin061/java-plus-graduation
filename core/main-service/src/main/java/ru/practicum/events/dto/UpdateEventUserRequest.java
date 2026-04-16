package ru.practicum.events.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import ru.practicum.events.constants.DateTimePattern;

import java.time.LocalDateTime;

public record UpdateEventUserRequest(

        @Size(min = 20, max = 2000)
        String annotation,

        Long category,

        @Size(min = 20, max = 7000)
        String description,

        @Future
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimePattern.DATE_TIME_PATTERN)
        LocalDateTime eventDate,

        LocationDto location,

        Boolean paid,

        @PositiveOrZero()
        Integer participantLimit,

        Boolean requestModeration,

        UpdateStateAction stateAction,

        @Size(min = 3, max = 120)
        String title
) {
}

package ru.practicum.events.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.category.dto.CategoryDto;
import ru.practicum.comment.dto.CommentDto;
import ru.practicum.events.constants.DateTimePattern;
import ru.practicum.events.model.EventState;
import ru.practicum.user.dto.UserShortDto;
import java.util.List;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EventFullDto {

    Long id;

    String annotation;

    CategoryDto category;

    Long confirmedRequests;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimePattern.DATE_TIME_PATTERN)
    LocalDateTime createdOn;

    String description;

    List<CommentDto> comments;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimePattern.DATE_TIME_PATTERN)
    LocalDateTime eventDate;

    UserShortDto initiator;

    LocationDto location;

    Boolean paid;

    Integer participantLimit;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateTimePattern.DATE_TIME_PATTERN)
    LocalDateTime publishedOn;

    Boolean requestModeration;

    EventState state;

    String title;

    Long views;
}

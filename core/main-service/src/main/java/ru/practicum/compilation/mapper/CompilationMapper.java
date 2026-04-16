package ru.practicum.compilation.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.practicum.compilation.dto.CompilationDto;
import ru.practicum.compilation.dto.NewCompilationDto;
import ru.practicum.compilation.model.Compilation;
import ru.practicum.events.mapper.EventMapper;

@Mapper(componentModel = "spring", uses = EventMapper.class)
public interface CompilationMapper {

    @Mapping(target = "events", source = "events")
    CompilationDto toDto(Compilation compilation);

    @Mapping(target = "events", ignore = true)
    Compilation toEntity(NewCompilationDto dto);
}
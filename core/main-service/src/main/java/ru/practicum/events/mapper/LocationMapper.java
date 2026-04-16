package ru.practicum.events.mapper;

import lombok.experimental.UtilityClass;
import org.mapstruct.factory.Mappers;
import ru.practicum.events.dto.LocationDto;
import ru.practicum.events.model.Location;

@UtilityClass
public class LocationMapper {

    private static final LocationMapper INSTANCE = Mappers.getMapper(LocationMapper.class);

    public Location toLocation(LocationDto dto) {
        if (dto == null) {
            return null;
        }
        Location location = new Location();
        location.setLat(dto.getLat());
        location.setLon(dto.getLon());
        return location;
    }

    public LocationDto toLocationDto(Location location) {
        if (location == null) {
            return null;
        }
        return LocationDto.builder()
                .lat(location.getLat())
                .lon(location.getLon())
                .build();
    }

    public static LocationDto toLocationDtoStatic(Location location) {
        return INSTANCE.toLocationDto(location);
    }

    public static Location toLocationStatic(LocationDto dto) {
        return INSTANCE.toLocation(dto);
    }
}

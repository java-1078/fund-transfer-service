package com.yvsjs.apis.fundtransferservice.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public abstract class BaseMapper<E, D> {

    public abstract E convertToEntity(D dto, Object... args);
    public abstract D convertToDto(E entity, Object... args);

    public Collection<E> convertToEntity(Collection<D> dto, Object... args) {
        return dto.stream().map(d -> convertToEntity(d, args)).toList();
    }

    public Collection<D> convertToDto(Collection<E> entity, Object... args) {
        return entity.stream().map(e -> convertToDto(e, args)).toList();
    }

    public List<E> convertToEntityList(Collection<D> dto, Object... args) {
        return new ArrayList<>(convertToEntity(dto, args));
    }

    public List<D> convertToDtoList(Collection<E> entity, Object... args) {
        return convertToDto(entity, args).stream().collect(Collectors.toList());
    }

    public Set<E> convertToEntitySet(Collection<D> dto, Object... args) {
        return convertToEntity(dto, args).stream().collect(Collectors.toSet());
    }

    public Set<D> convertToDtoSet(Collection<E> entity, Object... args) {
        return convertToDto(entity, args).stream().collect(Collectors.toSet());
    }
}

package fptu.sep490.commonlibrary.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

public interface BaseMapper<M, V> {
    M toModel(V view);

    V toView(M model);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(M model, V view);
}

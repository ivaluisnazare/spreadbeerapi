package bearapidio.example.bearapi.mapper;

import bearapidio.example.bearapi.dto.BeerDTO;
import bearapidio.example.bearapi.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {
    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);
    BeerDTO toDTO(Beer beer);
}

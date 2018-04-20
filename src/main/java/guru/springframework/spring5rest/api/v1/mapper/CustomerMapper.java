package guru.springframework.spring5rest.api.v1.mapper;

import guru.springframework.spring5rest.api.v1.model.CustomerDTO;
import guru.springframework.spring5rest.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);
}
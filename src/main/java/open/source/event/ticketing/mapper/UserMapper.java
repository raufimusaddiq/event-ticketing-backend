package open.source.event.ticketing.mapper;

import open.source.event.ticketing.entity.User;
import open.source.event.ticketing.rest.request.RegisterUserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * mapper for user class
 *
 * @author musaddiqr
 * @version UserMapper.java, v 0.1 24 June 2022 01.05:44 raufi-musaddiq Exp $$
 */

@Mapper(componentModel = "spring", uses = {UserPostMapper.class})
public interface UserMapper {

  @Mapping(target = "password", ignore = true)
  User toUser(RegisterUserRequest request);

}

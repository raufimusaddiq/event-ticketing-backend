package open.source.event.ticketing.mapper;

import open.source.event.ticketing.entity.User;
import open.source.event.ticketing.rest.request.RegisterUserRequest;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * abstrac class to set data after map
 *
 * @author musaddiqr
 * @version UserPostMapper.java, v 0.1 24 June 2022 01.10:22 raufi-musaddiq Exp $$
 */

@Mapper(componentModel = "spring")
public abstract class UserPostMapper {
  @Autowired
  private BCryptPasswordEncoder bCryptPasswordEncoder;

  @AfterMapping
  public void setRegisterUser(RegisterUserRequest request, @MappingTarget User user){
    String encryptedPassword =  bCryptPasswordEncoder.encode(request.getPassword());
    user.setPassword(encryptedPassword);
    user.setVerified(true);
  }
}

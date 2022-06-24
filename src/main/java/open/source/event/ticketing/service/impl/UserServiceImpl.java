package open.source.event.ticketing.service.impl;

import java.util.UUID;
import javax.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import open.source.event.ticketing.entity.User;
import open.source.event.ticketing.enumeration.ErrorCode;
import open.source.event.ticketing.exception.DataNotValidException;
import open.source.event.ticketing.mapper.UserMapper;
import open.source.event.ticketing.repository.UserRepository;
import open.source.event.ticketing.rest.request.RegisterUserRequest;
import open.source.event.ticketing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * implementation of user service
 *
 * @author musaddiqr
 * @version UserServiceImpl.java, v 0.1 23 June 2022 23.55:06 raufi-musaddiq Exp $$
 */

@Service
@Slf4j
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private UserMapper userMapper;

  @Override
  @Transactional
  public UUID register(RegisterUserRequest registerRequest) {
    validateRegisterData(registerRequest);
    User newUser = userMapper.toUser(registerRequest);
    return userRepository.save(newUser).getId();
  }

  private void validateRegisterData(RegisterUserRequest request){
    if (emailAlreadyExists(request.getEmail()))
      throw new DataNotValidException(ErrorCode.EDIT_USER_FAILED_EMAIL_ALREADY_EXISTS.toString());
  }

  private boolean emailAlreadyExists(String email) {
    return userRepository.findByEmail(email) != null;
  }
}

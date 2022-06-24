package open.source.event.ticketing.rest.controller;

import java.util.UUID;
import javax.validation.Valid;
import open.source.event.ticketing.rest.request.RegisterUserRequest;
import open.source.event.ticketing.rest.response.BaseWebResponse;
import open.source.event.ticketing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * rest controller for user
 *
 * @author musaddiqr
 * @version UserController.java, v 0.1 22 June 2022 11.36:48 raufi-musaddiq Exp $$
 */

@RestController
@RequestMapping("/api/user")
public class UserController {
  @Autowired
  private UserService userService;

  @PostMapping("/register")
  public ResponseEntity<BaseWebResponse> register(@Valid @RequestBody RegisterUserRequest request){
    String userId = userService.register(request).toString();
    return ResponseEntity
        .status(HttpStatus.CREATED)
        .header(HttpHeaders.LOCATION, "/api/user/"+userId)
        .body(BaseWebResponse.successNoData());
  }
}

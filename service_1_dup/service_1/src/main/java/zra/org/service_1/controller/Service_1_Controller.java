package zra.org.service_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import zra.org.service_1.dto.UserRequestDto;
import zra.org.service_1.dto.UserResponseDto;
import zra.org.service_1.model.UserModel;
import zra.org.service_1.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/first")
public class Service_1_Controller {
    @Autowired
  public UserService userService;

  @Operation(summary = "Create Test Data")
  @PostMapping("/users")
  public ResponseEntity<UserResponseDto> postMethodName(@RequestBody UserRequestDto body) {

      UserModel user = new UserModel();
      user.setFirst_name(body.getFirst_name());
      user.setLast_name(body.getLast_name());
      user.setUser_name(body.getUser_name());

      UserModel savedUser = userService.saveUser(user);

      UserResponseDto responseUser = new UserResponseDto();
      responseUser.setId(savedUser.getId());
      responseUser.setFirst_name(savedUser.getFirst_name());
      responseUser.setLast_name(savedUser.getLast_name());
      responseUser.setUser_name(savedUser.getUser_name());

     return ResponseEntity.ok(responseUser);
  }
    
}

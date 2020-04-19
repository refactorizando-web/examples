package com.refactorizando.examples.openAPI.controller.impl;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.refactorizando.examples.openAPI.controller.UsersApi;
import com.refactorizando.examples.openAPI.dto.UserDto;

public class UsersAPIController implements UsersApi {

  public ResponseEntity<List<UserDto>> getUsers() {

    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

  }
}

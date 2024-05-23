package com.mxrxss.todo.service;

import com.mxrxss.todo.model.dto.AuthenticationRequest;
import com.mxrxss.todo.model.dto.RegisterRequest;
import com.mxrxss.todo.model.payload.AuthenticationResponse;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);
}

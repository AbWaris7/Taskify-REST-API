package com.khan.code.Taskify.REST.API.service;


import com.khan.code.Taskify.REST.API.request.RegisterRequest;

public interface AuthenticationService {
    void register(RegisterRequest input) throws Exception;

}

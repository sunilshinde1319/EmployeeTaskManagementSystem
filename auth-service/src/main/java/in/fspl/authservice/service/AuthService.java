package in.fspl.authservice.service;

import in.fspl.authservice.dto.AuthResponse;
import in.fspl.authservice.dto.LoginRequest;
import in.fspl.authservice.dto.RegisterRequest;


public interface AuthService {
    AuthResponse register(RegisterRequest request);
    AuthResponse login(LoginRequest request);
}

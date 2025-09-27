package in.raja.billingsoftware.service;

import in.raja.billingsoftware.io.UserRequest;
import in.raja.billingsoftware.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}

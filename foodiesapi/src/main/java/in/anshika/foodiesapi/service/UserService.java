package in.anshika.foodiesapi.service;

import in.anshika.foodiesapi.io.UserRequest;
import in.anshika.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}

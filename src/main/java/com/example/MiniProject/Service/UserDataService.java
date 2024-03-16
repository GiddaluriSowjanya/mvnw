package com.example.MiniProject.Service;
import com.example.MiniProject.Entity.UserData;

import java.util.List;

public interface UserDataService {
    UserData saveUserData(UserData userData);

    List<UserData> findAll();
}

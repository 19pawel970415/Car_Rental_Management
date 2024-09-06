package org.example.db;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class UsersRepo {
    List<User> users = new ArrayList<>();
}

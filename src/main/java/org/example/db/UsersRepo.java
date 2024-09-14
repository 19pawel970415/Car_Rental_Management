package org.example.db;

import lombok.Getter;
import lombok.Setter;
import org.example.domain.User;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class UsersRepo {
    List<User> users;

    private UsersRepo(List<User> users) {
        this.users = users;
    }

    private static UsersRepo USERS_REPO_INSTANCE = new UsersRepo(new ArrayList<>());

    public static UsersRepo getInstance() {
        return USERS_REPO_INSTANCE;
    }
}

package app.service;

import app.model.User;

import java.util.List;

public interface IUserService {
    void add(User t);
    List<User> findAll();
}

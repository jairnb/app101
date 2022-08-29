package app.service.impl;


import app.model.User;
import app.repository.UserRepository;
import app.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    @Override
    public void add(User t) {
        userRepository.save(t);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }


}

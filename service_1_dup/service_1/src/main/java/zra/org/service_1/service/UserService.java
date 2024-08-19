package zra.org.service_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import zra.org.service_1.model.UserModel;
import zra.org.service_1.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

    @Transactional
    public UserModel saveUser (UserModel body){
        return userRepository.save(body);
    }
}

package com.example.demo.service;

import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public User findById (Long id)
    {
        Optional<User> optionalUser =  repository.findById(id);
        return optionalUser.get();
    }

    public List<User> getAll()
    {
        return repository.findAll();
    }

    public void create(User User)
    {
        repository.save(User);
    }

    public void updateAccount(User updatedAcc)
    {
        Optional<User>  accToUpdate = repository.findById(updatedAcc.getId());
        User user = accToUpdate.get();
        user.setFirst_name(updatedAcc.getFirst_name());
        user.setLast_name(updatedAcc.getLast_name());
        user.setAge(updatedAcc.getAge());
        repository.save(user);
    }

    public void delete(Long id)
    {
        User user = findById(id);
        repository.delete(user);
    }
}

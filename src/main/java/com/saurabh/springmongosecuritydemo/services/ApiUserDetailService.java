package com.saurabh.springmongosecuritydemo.services;

import com.saurabh.springmongosecuritydemo.models.ApiUserDetails;
import com.saurabh.springmongosecuritydemo.models.User;
import com.saurabh.springmongosecuritydemo.repositories.ApiUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApiUserDetailService implements UserDetailsService {

    @Autowired
    ApiUsersRepository apiUsersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = apiUsersRepository.findByUsername(username);
        user.orElseThrow(()-> new UsernameNotFoundException("User: "+username+" does not exist!!"));

        return user.map(ApiUserDetails::new).get();
    }
}

package com.angularapp.angularexample;

import com.angularapp.angularexample.entity.User;
import com.angularapp.angularexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AngularExampleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AngularExampleApplication.class, args);
    }

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        if(userRepository.count() == 0){
            userRepository.save(new User(0L,"Liton","Miah","liton.ymail.com"));
            userRepository.save(new User(0L,"Don","Azibul","don.ymail.com"));
            userRepository.save(new User(0L,"Sohel","Mahmud","sohel.ymail.com"));
        }
    }
}

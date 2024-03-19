package com.TuneHub.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TuneHub.main.entity.Users;

public interface UsersRepository 
               extends JpaRepository<Users , Integer>{

}

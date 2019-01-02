package com.greenfoxacademy.redditclone.repositories;

import com.greenfoxacademy.redditclone.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}

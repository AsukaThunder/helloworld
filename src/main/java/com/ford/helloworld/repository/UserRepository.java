package com.ford.helloworld.repository;

import com.ford.helloworld.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @ClassName: UserRepository
 * @author: Ford.Zhang
 * @version: 1.0
 * 2019/12/25 下午 5:20
 **/
public interface UserRepository extends CrudRepository<User, Long> {
}

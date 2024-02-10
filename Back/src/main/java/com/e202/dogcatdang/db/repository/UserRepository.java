package com.e202.dogcatdang.db.repository;

import com.e202.dogcatdang.db.entity.User;
import com.e202.dogcatdang.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    //이미 등록된 회원인지 체크

    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    Boolean existsByNickname(String nickname);


    User findByUsername(String username);

//    User findByEmail(String email);

    Optional<User> findByEmail(String email);


}

package com.harbinger.cmad;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Integer> {
	List<User> findByLoginId(int loginid);
	List<User> findAll();
}
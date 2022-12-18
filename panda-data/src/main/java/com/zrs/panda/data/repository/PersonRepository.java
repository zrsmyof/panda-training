package com.zrs.panda.data.repository;

import com.zrs.panda.data.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Transactional
@Repository
public interface PersonRepository extends JpaRepository<UUID, Person> {
}

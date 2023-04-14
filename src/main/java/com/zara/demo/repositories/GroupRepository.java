package com.zara.demo.repositories;

import com.zara.demo.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

/** @author LD */
public interface GroupRepository extends JpaRepository<Group, Long> {
}

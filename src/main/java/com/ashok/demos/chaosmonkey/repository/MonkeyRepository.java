package com.ashok.demos.chaosmonkey.repository;

import com.ashok.demos.chaosmonkey.model.Monkey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonkeyRepository extends JpaRepository<Monkey, String> {
}

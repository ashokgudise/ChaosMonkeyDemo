package com.ashok.demos.chaosmonkey.repository;

import com.ashok.demos.chaosmonkey.model.Gorilla;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GorillaRepository extends JpaRepository<Gorilla, String> {
}

package com.ashok.demos.chaosmonkey.repository;

import com.ashok.demos.chaosmonkey.model.Chimp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChimpRepository extends JpaRepository<Chimp, String> {
}

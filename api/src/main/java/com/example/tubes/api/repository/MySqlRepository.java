package com.example.tubes.api.repository;

import com.example.tubes.api.model.karyawan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySqlRepository extends JpaRepository<karyawan, Integer>{
    
}

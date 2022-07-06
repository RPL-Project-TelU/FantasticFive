package com.example.tubes.api.controller;

import com.example.tubes.api.repository.MySqlRepository;
import com.example.tubes.api.model.karyawan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KaryawanController {
    
    @Autowired
    MySqlRepository msr;
    
    @GetMapping("/get-all-information")
    public List<karyawan> getAll(){
        return msr.findAll();
    }
    
    
}

package com.example.tubes.api.controller;

import com.example.tubes.api.repository.karyawanRepository;
import com.example.tubes.api.model.karyawan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class KaryawanController {
    
    @Autowired
    karyawanRepository msr;
    
    @GetMapping("/get-all-karyawan")
    public List<karyawan> getAll(){
        return msr.findAll();
    }

    @GetMapping("/get-karyawan/{id}")
    public karyawan getSingleKaryawan(@PathVariable("id") Integer id){
        return msr.findById(id).get();
    }
    
    @DeleteMapping("/remove/{id}")
    public boolean deleteRow(@PathVariable("id") Integer id){
        if(!msr.findById(id).equals(Optional.empty())){
            msr.deleteById(id);
            return true;
        }
        return false;
    }

    @PutMapping("/update/{id}")
    public karyawan updateKaryawan(@PathVariable("id") Integer id,
                                   @RequestBody Map<String, String> body){
        karyawan current = msr.findById(id).get();
        current.setNama(body.get("nama"));
        current.setPosisi(body.get("posisi"));
        current.setGender(body.get("gender"));
        current.setTgl_lahir(LocalDate.parse(body.get("tgl_lahir")));

        msr.save(current);
        return current;
    }

    @PostMapping("/add")
    public karyawan create(@RequestBody Map<String, String> body){

        String nama = body.get("nama");
        String posisi = body.get("posisi");
        String gender = body.get("gender");
        LocalDate tgl_lahir = LocalDate.parse(body.get("tgl_lahir"));

        karyawan newKaryawan = new karyawan(nama, posisi, gender, tgl_lahir);

        return msr.save(newKaryawan);
    }

}

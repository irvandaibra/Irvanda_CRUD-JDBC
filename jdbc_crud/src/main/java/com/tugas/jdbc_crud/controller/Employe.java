package com.tugas.jdbc_crud.controller;

import com.tugas.jdbc_crud.dao.EmployeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Employe {

    @Autowired
    private EmployeDAO eDAO;

    @GetMapping("/employes")
    public List<com.tugas.jdbc_crud.model.Employe> getEmployes() {
        return eDAO.getAll();
    }

    @GetMapping("/employes/{nis}")
    public com.tugas.jdbc_crud.model.Employe getEmployeByNis(@PathVariable int nis) {
        return eDAO.getByNis(nis);
    }

    @PostMapping("/employes")
    public String saveEmploye(@RequestBody com.tugas.jdbc_crud.model.Employe employe) {
      return  eDAO.save(employe) + "Done, Data Berhasil Ditambahkan!";
    }

    @PutMapping("/employes/{nis}")
    public String updateEmploye(@RequestBody com.tugas.jdbc_crud.model.Employe employe, @PathVariable int nis ) {
        return eDAO.update(employe, nis) + "Succes, Data Berhasil Di Edit!";
    }

    @DeleteMapping("/employes/{nis}")
    public String deleteEmployeByNis(@PathVariable int nis){
        return eDAO.delete(nis) + "Clear, Data Berhasil Di Hapus";
    }
}

package com.tugas.jdbc_crud.dao;

import com.tugas.jdbc_crud.model.Employe;

import java.util.List;

public interface EmployeDAO {
    
    int save(Employe employe);
    int update(Employe employe, int nis);
    int delete(int nis);
    List<Employe> getAll();
    Employe getByNis(int nis);

}

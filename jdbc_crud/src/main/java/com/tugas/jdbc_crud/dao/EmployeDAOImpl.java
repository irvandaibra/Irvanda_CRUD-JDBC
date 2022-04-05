package com.tugas.jdbc_crud.dao;

import com.tugas.jdbc_crud.model.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeDAOImpl implements EmployeDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public int save(Employe employe) {
        return jdbcTemplate.update("INSERT INTO siswa (Nama, Nilai, Jurusan) VALUES (?,?,?)", new Object[]{
                employe.getNama(), employe.getNilai(), employe.getJurusan()
        });
    }

    @Override
    public int update(Employe employe, int nis) {
        return jdbcTemplate.update("UPDATE siswa SET Nama=?, Nilai=?, Jurusan=? WHERE Nis=?", new Object[]{
                employe.getNama(), employe.getNilai(), employe.getJurusan(), nis
        });
    }

    @Override
    public int delete(int nis) {
        return jdbcTemplate.update("DELETE FROM siswa WHERE nis=?", nis);
    }

    @Override
    public List<Employe> getAll() {
        return jdbcTemplate.query("SELECT * FROM siswa", new BeanPropertyRowMapper<Employe>(Employe.class));
    }

    @Override
    public Employe getByNis(int nis) {
        return jdbcTemplate.queryForObject("SELECT * FROM siswa where nis=?", new BeanPropertyRowMapper<Employe>(Employe.class), nis);
    }
}

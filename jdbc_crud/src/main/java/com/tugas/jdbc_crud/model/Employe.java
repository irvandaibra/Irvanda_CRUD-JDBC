package com.tugas.jdbc_crud.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employe {
    private int nis;
    private String Nama;
    private float Nilai;
    private String Jurusan;
}
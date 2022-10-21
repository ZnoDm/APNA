package com.sinfloo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinfloo.demo.model.Categoria;

public interface ICategoriaRepository extends JpaRepository<Categoria, Long> {

}

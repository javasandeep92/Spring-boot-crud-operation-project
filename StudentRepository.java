package com.curdoperation.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.curdoperation.app.entity.StudentEntity;


public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}

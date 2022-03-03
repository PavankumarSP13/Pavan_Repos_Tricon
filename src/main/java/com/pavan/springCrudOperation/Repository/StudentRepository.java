package com.pavan.springCrudOperation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pavan.springCrudOperation.Model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}

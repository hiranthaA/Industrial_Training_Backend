package com.spm.spmbackend.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.spm.spmbackend.model.Student;

@Repository
public interface StudentRepository  extends MongoRepository<Student, String> {

}

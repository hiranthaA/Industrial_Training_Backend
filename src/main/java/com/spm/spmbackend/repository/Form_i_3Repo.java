package com.spm.spmbackend.repository;

import com.spm.spmbackend.model.Form_i_3;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Form_i_3Repo extends MongoRepository<Form_i_3, String>{


    Form_i_3 findOneBystudentId(String studentId);
    List<Form_i_3> findAllByStatusAndSupervisorEmail(String status, String supervisorEmail);
    Form_i_3 findOneByStudentEmail( String studentEmail);
    Form_i_3 findOneByStatus(String status);
    Form_i_3 findOneByFormId(String formId);
    
//    Form_i_1 findByFormId(String studentId);
}

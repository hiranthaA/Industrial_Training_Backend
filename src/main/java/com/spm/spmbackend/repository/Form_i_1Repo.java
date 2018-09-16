package com.spm.spmbackend.repository;

import com.spm.spmbackend.model.Form_i_1;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Form_i_1Repo extends MongoRepository<Form_i_1, String>{

    Form_i_1 findOneBystudentId(String studentId);
    Form_i_1 findOneByStatusAndSupervisorEmail(String status, String supervisorEmail);
    Form_i_1 findOneByStudentEmail( String studentEmail);
    Form_i_1 findOneByStatus(String status);
    Form_i_1 findOneByFormId(String formId);
    
//    Form_i_1 findByFormId(String studentId);
}

package com.uptodate.repository;

import com.uptodate.entity.Doctor;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by shahs on 2/26/2017.
 */
@Transactional
public interface DoctorRepository extends CrudRepository<Doctor, String>{
    Doctor findByEmail(String email);
    Doctor findByFirstNameAndLastName(String firstName, String lastName);
    List<Doctor> findById(String doctorId);
}

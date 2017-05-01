package com.uptodate.repository;

import com.uptodate.entity.Patient;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface PatientRepository extends CrudRepository<Patient, String> {
    Patient findByEmail(String email);
    List<Patient> findByUniqueId(String uniqueId);
}

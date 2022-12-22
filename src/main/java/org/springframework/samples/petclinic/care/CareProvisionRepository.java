package org.springframework.samples.petclinic.care;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CareProvisionRepository extends CrudRepository{
    List<CareProvision> findAll();        
    Optional<CareProvision> findById(int id);
    CareProvision save(CareProvision p);
	List<Care> findAllCares();
    //List<Care> findCompatibleCares(PetType petType, Care additionalCare);
    //Care findCareByName(String name);
    //List<CareProvision> findCaresProvidedByVisitId(Integer visitId);
    //Page<CareProvision> findAllPaginatedCareProvisions(Pageable p);
}

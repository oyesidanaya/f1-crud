package org.yesid.f1_crud.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yesid.f1_crud.entities.F1Driver;

@Repository
public interface F1DriversRepository extends JpaRepository<F1Driver, Integer> {

}

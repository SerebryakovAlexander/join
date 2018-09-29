package ru.raiffeisen.join.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.raiffeisen.join.entities.ChildFirst;

public interface ChildFirstRepository extends CrudRepository<ChildFirst, Long> {
    @Query("SELECT u FROM ChildFirst u WHERE u.master.field2 = 'fff2'")
    Iterable<ChildFirst> findAllCustom();
}

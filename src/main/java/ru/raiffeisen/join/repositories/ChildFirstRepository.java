package ru.raiffeisen.join.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.raiffeisen.join.entities.ChildFirst;

public interface ChildFirstRepository extends CrudRepository<ChildFirst, Long> {
}

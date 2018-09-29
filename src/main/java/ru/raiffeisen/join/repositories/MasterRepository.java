package ru.raiffeisen.join.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.raiffeisen.join.entities.Master;

public interface MasterRepository extends CrudRepository<Master, Long> {
}

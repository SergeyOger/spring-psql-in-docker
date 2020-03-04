package com.zmex.springindocker.repository;

import com.zmex.springindocker.model.RecordModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends CrudRepository<RecordModel, Integer> {
}

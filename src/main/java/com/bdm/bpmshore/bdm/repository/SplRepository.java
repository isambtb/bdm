package com.bdm.bpmshore.bdm.repository;

import com.bdm.bpmshore.bdm.domain.Document;
import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

public interface SplRepository extends CrudRepository<Document, ObjectId> {


}

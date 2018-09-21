package com.bdm.bpmshore.bdm.service;

import com.bdm.bpmshore.bdm.domain.Document;
import com.bdm.bpmshore.bdm.repository.SplRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


/**
 * Document service implement.
 */

@Service
public class SplServiceImp implements SplService {

    private SplRepository splRepository;

    @Autowired
    public void setSplRepository(SplRepository splRepository) {
        this.splRepository = splRepository;
    }

    @Override
    public Iterable<Document> listAllDocuments(){
        return splRepository.findAll();
    }

    @Override
    public Optional<Document> getDocumentById(String id){
        return splRepository.findById(new ObjectId(id));
    }

    @Override
    public Document saveDocument(Document document){
        splRepository.save(document);
        return  document;
    }

    @Override
    public void deleteDocument(String id){
        splRepository.deleteById(new ObjectId(id));
    }

}

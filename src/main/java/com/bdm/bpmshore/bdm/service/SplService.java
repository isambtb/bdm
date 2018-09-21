package com.bdm.bpmshore.bdm.service;

import com.bdm.bpmshore.bdm.domain.Document;

import java.util.Optional;


public interface SplService {

    Iterable<Document> listAllDocuments();

    Optional<Document> getDocumentById(String id);

    Document saveDocument(Document document);

    void deleteDocument(String id);


}

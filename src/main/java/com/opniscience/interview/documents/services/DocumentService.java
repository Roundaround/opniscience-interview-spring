package com.opniscience.interview.documents.services;

import com.opniscience.interview.documents.jpa.entities.DocumentEntity;
import com.opniscience.interview.documents.jpa.repositories.DocumentRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class DocumentService {
  private final ObjectStorageClient storageClient;
  private final DocumentRepository documentRepository;
  private final String bucketName;

  public DocumentService(
      ObjectStorageClient storageClient,
      DocumentRepository documentRepository,
      @Value("${app.document-bucket}") String bucketName
  ) {
    this.storageClient = storageClient;
    this.documentRepository = documentRepository;
    this.bucketName = bucketName;
  }

  /**
   * Upload a brand new document.
   */
  public DocumentEntity uploadDocument(UUID ownerUserId, String filename, String contentType, byte[] content) {
    throw new UnsupportedOperationException("TODO");
  }

  /**
   * Download the latest version of a document by external ID.
   */
  @Transactional(readOnly = true)
  public byte[] downloadDocument(String externalId) {
    throw new UnsupportedOperationException("TODO");
  }

  /**
   * Update an existing document (creates a new version).
   */
  public DocumentEntity updateDocument(String externalId, byte[] newContent, String newContentType) {
    throw new UnsupportedOperationException("TODO");
  }

  /**
   * Soft-delete a document.
   */
  public void deleteDocument(String externalId) {
    throw new UnsupportedOperationException("TODO");
  }

  /**
   * List all documents for a given user.
   */
  @Transactional(readOnly = true)
  public List<DocumentEntity> listUserDocuments(UUID userId) {
    throw new UnsupportedOperationException("TODO");
  }
}

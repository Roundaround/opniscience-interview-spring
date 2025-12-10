package com.opniscience.interview.documents.jpa.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "documents")
public class DocumentEntity {
  @Id
  @GeneratedValue
  private UUID id;

  @Column(nullable = false, unique = true, updatable = false)
  private String externalId; // Public immutable ID

  @Column(nullable = false)
  private String filename;

  @Column(nullable = false)
  private String contentType;

  @Column(nullable = false)
  private long sizeBytes;

  @Column(nullable = false)
  private Integer version;

  @Column(nullable = false)
  private String s3Bucket;

  @Column(nullable = false)
  private String s3Key;

  @Column(nullable = false)
  private UUID ownerUserId;

  @Column(nullable = false)
  private Instant createdAt;

  @Column(nullable = false)
  private Instant updatedAt;

  public static DocumentEntity create(
      String externalId,
      String filename,
      String contentType,
      long sizeBytes,
      Integer version,
      String s3Bucket,
      String s3Key,
      UUID ownerUserId
  ) {
    throw new UnsupportedOperationException("TODO");
  }

  public UUID getId() {
    return this.id;
  }

  public String getExternalId() {
    return this.externalId;
  }

  public String getFilename() {
    return this.filename;
  }

  public String getContentType() {
    return this.contentType;
  }

  public long getSizeBytes() {
    return this.sizeBytes;
  }

  public Integer getVersion() {
    return this.version;
  }

  public String getS3Bucket() {
    return this.s3Bucket;
  }

  public String getS3Key() {
    return this.s3Key;
  }

  public UUID getOwnerUserId() {
    return this.ownerUserId;
  }

  public Instant getCreatedAt() {
    return this.createdAt;
  }

  public Instant getUpdatedAt() {
    return this.updatedAt;
  }
}

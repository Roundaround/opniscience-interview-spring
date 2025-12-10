package com.opniscience.interview.documents.services;

public interface ObjectStorageClient {
  /**
   * Upload an object to the given bucket of the configured object storage solution.
   * @param bucket The bucket name to upload to
   * @param key The unique key for the object, usually expressed as a path, e.g. `foo/bar/baz`
   * @param content The content of the object as a raw byte array
   * @param contentType The MIME type expression for the object, e.g. `application/pdf`
   * @throws ObjectAlreadyExistsException If an object with the given key already exists in the bucket
   */
  void uploadObject(String bucket, String key, byte[] content, String contentType) throws ObjectAlreadyExistsException;

  /**
   * Download an object located at the given bucket and key as a raw byte array.
   * @param bucket The bucket name to download from
   * @param key The unique key for the object, usually expressed as a path, e.g. `foo/bar/baz`
   * @return The object's contents in the form of a raw byte array
   * @throws ObjectNotFoundException If no object is found in the bucket with the given key
   */
  byte[] downloadObject(String bucket, String key) throws ObjectNotFoundException;

  /**
   * Check whether an object located at the given bucket and key exists.
   * @param bucket The bucket name to look in
   * @param key The unique key for the object, usually expressed as a path, e.g. `foo/bar/baz`
   * @return True if an object exists and is visible, false otherwise
   */
  boolean objectExists(String bucket, String key);

  /**
   * Delete an object located at the given bucket and key from the configured object storage solution.
   * @param bucket The bucket name to delete from
   * @param key The unique key for the object, usually expressed as a path, e.g. `foo/bar/baz`
   * @throws ObjectNotFoundException If no object is found in the bucket with the given key
   */
  void deleteObject(String bucket, String key) throws ObjectNotFoundException;

  class ObjectAlreadyExistsException extends Exception {
    public ObjectAlreadyExistsException(String message) {
      super(message);
    }
  }

  class ObjectNotFoundException extends Exception {
    public ObjectNotFoundException(String message) {
      super(message);
    }
  }
}

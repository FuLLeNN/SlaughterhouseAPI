// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: products.proto

package com.example.protobuf;

public interface PartsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Parts)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string partType = 2;</code>
   * @return The partType.
   */
  java.lang.String getPartType();
  /**
   * <code>string partType = 2;</code>
   * @return The bytes for partType.
   */
  com.google.protobuf.ByteString
      getPartTypeBytes();

  /**
   * <code>int64 reference = 3;</code>
   * @return The reference.
   */
  long getReference();
}
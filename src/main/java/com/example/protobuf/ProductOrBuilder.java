// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: products.proto

package com.example.protobuf;

public interface ProductOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Product)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>repeated .Parts parts = 2;</code>
   */
  java.util.List<com.example.protobuf.Parts> 
      getPartsList();
  /**
   * <code>repeated .Parts parts = 2;</code>
   */
  com.example.protobuf.Parts getParts(int index);
  /**
   * <code>repeated .Parts parts = 2;</code>
   */
  int getPartsCount();
  /**
   * <code>repeated .Parts parts = 2;</code>
   */
  java.util.List<? extends com.example.protobuf.PartsOrBuilder> 
      getPartsOrBuilderList();
  /**
   * <code>repeated .Parts parts = 2;</code>
   */
  com.example.protobuf.PartsOrBuilder getPartsOrBuilder(
      int index);
}
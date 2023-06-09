// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: products.proto

package com.example.protobuf;

/**
 * Protobuf type {@code getProductsWithAnimalResponse}
 */
public final class getProductsWithAnimalResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:getProductsWithAnimalResponse)
    getProductsWithAnimalResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use getProductsWithAnimalResponse.newBuilder() to construct.
  private getProductsWithAnimalResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private getProductsWithAnimalResponse() {
    products_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new getProductsWithAnimalResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private getProductsWithAnimalResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              products_ = new java.util.ArrayList<com.example.protobuf.Product>();
              mutable_bitField0_ |= 0x00000001;
            }
            products_.add(
                input.readMessage(com.example.protobuf.Product.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        products_ = java.util.Collections.unmodifiableList(products_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.protobuf.Products.internal_static_getProductsWithAnimalResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.protobuf.Products.internal_static_getProductsWithAnimalResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.protobuf.getProductsWithAnimalResponse.class, com.example.protobuf.getProductsWithAnimalResponse.Builder.class);
  }

  public static final int PRODUCTS_FIELD_NUMBER = 1;
  private java.util.List<com.example.protobuf.Product> products_;
  /**
   * <code>repeated .Product products = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.example.protobuf.Product> getProductsList() {
    return products_;
  }
  /**
   * <code>repeated .Product products = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.example.protobuf.ProductOrBuilder> 
      getProductsOrBuilderList() {
    return products_;
  }
  /**
   * <code>repeated .Product products = 1;</code>
   */
  @java.lang.Override
  public int getProductsCount() {
    return products_.size();
  }
  /**
   * <code>repeated .Product products = 1;</code>
   */
  @java.lang.Override
  public com.example.protobuf.Product getProducts(int index) {
    return products_.get(index);
  }
  /**
   * <code>repeated .Product products = 1;</code>
   */
  @java.lang.Override
  public com.example.protobuf.ProductOrBuilder getProductsOrBuilder(
      int index) {
    return products_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < products_.size(); i++) {
      output.writeMessage(1, products_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < products_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, products_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.protobuf.getProductsWithAnimalResponse)) {
      return super.equals(obj);
    }
    com.example.protobuf.getProductsWithAnimalResponse other = (com.example.protobuf.getProductsWithAnimalResponse) obj;

    if (!getProductsList()
        .equals(other.getProductsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getProductsCount() > 0) {
      hash = (37 * hash) + PRODUCTS_FIELD_NUMBER;
      hash = (53 * hash) + getProductsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.protobuf.getProductsWithAnimalResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.protobuf.getProductsWithAnimalResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.protobuf.getProductsWithAnimalResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.protobuf.getProductsWithAnimalResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.protobuf.getProductsWithAnimalResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.protobuf.getProductsWithAnimalResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.protobuf.getProductsWithAnimalResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.protobuf.getProductsWithAnimalResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.protobuf.getProductsWithAnimalResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.protobuf.getProductsWithAnimalResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.protobuf.getProductsWithAnimalResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.protobuf.getProductsWithAnimalResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.protobuf.getProductsWithAnimalResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code getProductsWithAnimalResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:getProductsWithAnimalResponse)
      com.example.protobuf.getProductsWithAnimalResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.protobuf.Products.internal_static_getProductsWithAnimalResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.protobuf.Products.internal_static_getProductsWithAnimalResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.protobuf.getProductsWithAnimalResponse.class, com.example.protobuf.getProductsWithAnimalResponse.Builder.class);
    }

    // Construct using com.example.protobuf.getProductsWithAnimalResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getProductsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (productsBuilder_ == null) {
        products_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        productsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.protobuf.Products.internal_static_getProductsWithAnimalResponse_descriptor;
    }

    @java.lang.Override
    public com.example.protobuf.getProductsWithAnimalResponse getDefaultInstanceForType() {
      return com.example.protobuf.getProductsWithAnimalResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.protobuf.getProductsWithAnimalResponse build() {
      com.example.protobuf.getProductsWithAnimalResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.protobuf.getProductsWithAnimalResponse buildPartial() {
      com.example.protobuf.getProductsWithAnimalResponse result = new com.example.protobuf.getProductsWithAnimalResponse(this);
      int from_bitField0_ = bitField0_;
      if (productsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          products_ = java.util.Collections.unmodifiableList(products_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.products_ = products_;
      } else {
        result.products_ = productsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.protobuf.getProductsWithAnimalResponse) {
        return mergeFrom((com.example.protobuf.getProductsWithAnimalResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.protobuf.getProductsWithAnimalResponse other) {
      if (other == com.example.protobuf.getProductsWithAnimalResponse.getDefaultInstance()) return this;
      if (productsBuilder_ == null) {
        if (!other.products_.isEmpty()) {
          if (products_.isEmpty()) {
            products_ = other.products_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProductsIsMutable();
            products_.addAll(other.products_);
          }
          onChanged();
        }
      } else {
        if (!other.products_.isEmpty()) {
          if (productsBuilder_.isEmpty()) {
            productsBuilder_.dispose();
            productsBuilder_ = null;
            products_ = other.products_;
            bitField0_ = (bitField0_ & ~0x00000001);
            productsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProductsFieldBuilder() : null;
          } else {
            productsBuilder_.addAllMessages(other.products_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.protobuf.getProductsWithAnimalResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.protobuf.getProductsWithAnimalResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.example.protobuf.Product> products_ =
      java.util.Collections.emptyList();
    private void ensureProductsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        products_ = new java.util.ArrayList<com.example.protobuf.Product>(products_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.protobuf.Product, com.example.protobuf.Product.Builder, com.example.protobuf.ProductOrBuilder> productsBuilder_;

    /**
     * <code>repeated .Product products = 1;</code>
     */
    public java.util.List<com.example.protobuf.Product> getProductsList() {
      if (productsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(products_);
      } else {
        return productsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Product products = 1;</code>
     */
    public int getProductsCount() {
      if (productsBuilder_ == null) {
        return products_.size();
      } else {
        return productsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Product products = 1;</code>
     */
    public com.example.protobuf.Product getProducts(int index) {
      if (productsBuilder_ == null) {
        return products_.get(index);
      } else {
        return productsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Product products = 1;</code>
     */
    public Builder setProducts(
        int index, com.example.protobuf.Product value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.set(index, value);
        onChanged();
      } else {
        productsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Product products = 1;</code>
     */
    public Builder setProducts(
        int index, com.example.protobuf.Product.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.set(index, builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Product products = 1;</code>
     */
    public Builder addProducts(com.example.protobuf.Product value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.add(value);
        onChanged();
      } else {
        productsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Product products = 1;</code>
     */
    public Builder addProducts(
        int index, com.example.protobuf.Product value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.add(index, value);
        onChanged();
      } else {
        productsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Product products = 1;</code>
     */
    public Builder addProducts(
        com.example.protobuf.Product.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.add(builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Product products = 1;</code>
     */
    public Builder addProducts(
        int index, com.example.protobuf.Product.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.add(index, builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Product products = 1;</code>
     */
    public Builder addAllProducts(
        java.lang.Iterable<? extends com.example.protobuf.Product> values) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, products_);
        onChanged();
      } else {
        productsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Product products = 1;</code>
     */
    public Builder clearProducts() {
      if (productsBuilder_ == null) {
        products_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        productsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Product products = 1;</code>
     */
    public Builder removeProducts(int index) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.remove(index);
        onChanged();
      } else {
        productsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Product products = 1;</code>
     */
    public com.example.protobuf.Product.Builder getProductsBuilder(
        int index) {
      return getProductsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Product products = 1;</code>
     */
    public com.example.protobuf.ProductOrBuilder getProductsOrBuilder(
        int index) {
      if (productsBuilder_ == null) {
        return products_.get(index);  } else {
        return productsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Product products = 1;</code>
     */
    public java.util.List<? extends com.example.protobuf.ProductOrBuilder> 
         getProductsOrBuilderList() {
      if (productsBuilder_ != null) {
        return productsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(products_);
      }
    }
    /**
     * <code>repeated .Product products = 1;</code>
     */
    public com.example.protobuf.Product.Builder addProductsBuilder() {
      return getProductsFieldBuilder().addBuilder(
          com.example.protobuf.Product.getDefaultInstance());
    }
    /**
     * <code>repeated .Product products = 1;</code>
     */
    public com.example.protobuf.Product.Builder addProductsBuilder(
        int index) {
      return getProductsFieldBuilder().addBuilder(
          index, com.example.protobuf.Product.getDefaultInstance());
    }
    /**
     * <code>repeated .Product products = 1;</code>
     */
    public java.util.List<com.example.protobuf.Product.Builder> 
         getProductsBuilderList() {
      return getProductsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.protobuf.Product, com.example.protobuf.Product.Builder, com.example.protobuf.ProductOrBuilder> 
        getProductsFieldBuilder() {
      if (productsBuilder_ == null) {
        productsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.example.protobuf.Product, com.example.protobuf.Product.Builder, com.example.protobuf.ProductOrBuilder>(
                products_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        products_ = null;
      }
      return productsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:getProductsWithAnimalResponse)
  }

  // @@protoc_insertion_point(class_scope:getProductsWithAnimalResponse)
  private static final com.example.protobuf.getProductsWithAnimalResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.protobuf.getProductsWithAnimalResponse();
  }

  public static com.example.protobuf.getProductsWithAnimalResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<getProductsWithAnimalResponse>
      PARSER = new com.google.protobuf.AbstractParser<getProductsWithAnimalResponse>() {
    @java.lang.Override
    public getProductsWithAnimalResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new getProductsWithAnimalResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<getProductsWithAnimalResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<getProductsWithAnimalResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.protobuf.getProductsWithAnimalResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


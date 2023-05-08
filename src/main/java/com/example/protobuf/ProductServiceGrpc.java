package com.example.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: products.proto")
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.protobuf.getAnimalsInProductRequest,
      com.example.protobuf.getAnimalsInProductResponse> getGetAnimalsInProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimalsInProduct",
      requestType = com.example.protobuf.getAnimalsInProductRequest.class,
      responseType = com.example.protobuf.getAnimalsInProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.protobuf.getAnimalsInProductRequest,
      com.example.protobuf.getAnimalsInProductResponse> getGetAnimalsInProductMethod() {
    io.grpc.MethodDescriptor<com.example.protobuf.getAnimalsInProductRequest, com.example.protobuf.getAnimalsInProductResponse> getGetAnimalsInProductMethod;
    if ((getGetAnimalsInProductMethod = ProductServiceGrpc.getGetAnimalsInProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetAnimalsInProductMethod = ProductServiceGrpc.getGetAnimalsInProductMethod) == null) {
          ProductServiceGrpc.getGetAnimalsInProductMethod = getGetAnimalsInProductMethod =
              io.grpc.MethodDescriptor.<com.example.protobuf.getAnimalsInProductRequest, com.example.protobuf.getAnimalsInProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimalsInProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.protobuf.getAnimalsInProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.protobuf.getAnimalsInProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("getAnimalsInProduct"))
              .build();
        }
      }
    }
    return getGetAnimalsInProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.protobuf.getProductsWithAnimalRequest,
      com.example.protobuf.getProductsWithAnimalResponse> getGetProductsWithAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProductsWithAnimal",
      requestType = com.example.protobuf.getProductsWithAnimalRequest.class,
      responseType = com.example.protobuf.getProductsWithAnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.protobuf.getProductsWithAnimalRequest,
      com.example.protobuf.getProductsWithAnimalResponse> getGetProductsWithAnimalMethod() {
    io.grpc.MethodDescriptor<com.example.protobuf.getProductsWithAnimalRequest, com.example.protobuf.getProductsWithAnimalResponse> getGetProductsWithAnimalMethod;
    if ((getGetProductsWithAnimalMethod = ProductServiceGrpc.getGetProductsWithAnimalMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductsWithAnimalMethod = ProductServiceGrpc.getGetProductsWithAnimalMethod) == null) {
          ProductServiceGrpc.getGetProductsWithAnimalMethod = getGetProductsWithAnimalMethod =
              io.grpc.MethodDescriptor.<com.example.protobuf.getProductsWithAnimalRequest, com.example.protobuf.getProductsWithAnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProductsWithAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.protobuf.getProductsWithAnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.protobuf.getProductsWithAnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("getProductsWithAnimal"))
              .build();
        }
      }
    }
    return getGetProductsWithAnimalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub>() {
        @java.lang.Override
        public ProductServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceStub(channel, callOptions);
        }
      };
    return ProductServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub>() {
        @java.lang.Override
        public ProductServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub>() {
        @java.lang.Override
        public ProductServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceFutureStub(channel, callOptions);
        }
      };
    return ProductServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProductServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAnimalsInProduct(com.example.protobuf.getAnimalsInProductRequest request,
        io.grpc.stub.StreamObserver<com.example.protobuf.getAnimalsInProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalsInProductMethod(), responseObserver);
    }

    /**
     */
    public void getProductsWithAnimal(com.example.protobuf.getProductsWithAnimalRequest request,
        io.grpc.stub.StreamObserver<com.example.protobuf.getProductsWithAnimalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsWithAnimalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAnimalsInProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.protobuf.getAnimalsInProductRequest,
                com.example.protobuf.getAnimalsInProductResponse>(
                  this, METHODID_GET_ANIMALS_IN_PRODUCT)))
          .addMethod(
            getGetProductsWithAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.protobuf.getProductsWithAnimalRequest,
                com.example.protobuf.getProductsWithAnimalResponse>(
                  this, METHODID_GET_PRODUCTS_WITH_ANIMAL)))
          .build();
    }
  }

  /**
   */
  public static final class ProductServiceStub extends io.grpc.stub.AbstractAsyncStub<ProductServiceStub> {
    private ProductServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAnimalsInProduct(com.example.protobuf.getAnimalsInProductRequest request,
        io.grpc.stub.StreamObserver<com.example.protobuf.getAnimalsInProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalsInProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductsWithAnimal(com.example.protobuf.getProductsWithAnimalRequest request,
        io.grpc.stub.StreamObserver<com.example.protobuf.getProductsWithAnimalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductsWithAnimalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.protobuf.getAnimalsInProductResponse getAnimalsInProduct(com.example.protobuf.getAnimalsInProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalsInProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.protobuf.getProductsWithAnimalResponse getProductsWithAnimal(com.example.protobuf.getProductsWithAnimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductsWithAnimalMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.protobuf.getAnimalsInProductResponse> getAnimalsInProduct(
        com.example.protobuf.getAnimalsInProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalsInProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.protobuf.getProductsWithAnimalResponse> getProductsWithAnimal(
        com.example.protobuf.getProductsWithAnimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductsWithAnimalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ANIMALS_IN_PRODUCT = 0;
  private static final int METHODID_GET_PRODUCTS_WITH_ANIMAL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ANIMALS_IN_PRODUCT:
          serviceImpl.getAnimalsInProduct((com.example.protobuf.getAnimalsInProductRequest) request,
              (io.grpc.stub.StreamObserver<com.example.protobuf.getAnimalsInProductResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCTS_WITH_ANIMAL:
          serviceImpl.getProductsWithAnimal((com.example.protobuf.getProductsWithAnimalRequest) request,
              (io.grpc.stub.StreamObserver<com.example.protobuf.getProductsWithAnimalResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.protobuf.Products.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getGetAnimalsInProductMethod())
              .addMethod(getGetProductsWithAnimalMethod())
              .build();
        }
      }
    }
    return result;
  }
}

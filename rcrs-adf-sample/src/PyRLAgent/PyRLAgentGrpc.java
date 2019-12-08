package PyRLAgent;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: AgentInfo.proto")
public final class PyRLAgentGrpc {

  private PyRLAgentGrpc() {}

  public static final String SERVICE_NAME = "PyRLAgent.PyRLAgent";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<PyRLProto.ActionInfo,
      PyRLProto.AgentInfo> getGetAgentInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAgentInfo",
      requestType = PyRLProto.ActionInfo.class,
      responseType = PyRLProto.AgentInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PyRLProto.ActionInfo,
      PyRLProto.AgentInfo> getGetAgentInfoMethod() {
    io.grpc.MethodDescriptor<PyRLProto.ActionInfo, PyRLProto.AgentInfo> getGetAgentInfoMethod;
    if ((getGetAgentInfoMethod = PyRLAgentGrpc.getGetAgentInfoMethod) == null) {
      synchronized (PyRLAgentGrpc.class) {
        if ((getGetAgentInfoMethod = PyRLAgentGrpc.getGetAgentInfoMethod) == null) {
          PyRLAgentGrpc.getGetAgentInfoMethod = getGetAgentInfoMethod =
              io.grpc.MethodDescriptor.<PyRLProto.ActionInfo, PyRLProto.AgentInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAgentInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PyRLProto.ActionInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PyRLProto.AgentInfo.getDefaultInstance()))
              .setSchemaDescriptor(new PyRLAgentMethodDescriptorSupplier("getAgentInfo"))
              .build();
        }
      }
    }
    return getGetAgentInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PyRLAgentStub newStub(io.grpc.Channel channel) {
    return new PyRLAgentStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PyRLAgentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PyRLAgentBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PyRLAgentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PyRLAgentFutureStub(channel);
  }

  /**
   */
  public static abstract class PyRLAgentImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAgentInfo(PyRLProto.ActionInfo request,
        io.grpc.stub.StreamObserver<PyRLProto.AgentInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAgentInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAgentInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                PyRLProto.ActionInfo,
                PyRLProto.AgentInfo>(
                  this, METHODID_GET_AGENT_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class PyRLAgentStub extends io.grpc.stub.AbstractStub<PyRLAgentStub> {
    private PyRLAgentStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PyRLAgentStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PyRLAgentStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PyRLAgentStub(channel, callOptions);
    }

    /**
     */
    public void getAgentInfo(PyRLProto.ActionInfo request,
        io.grpc.stub.StreamObserver<PyRLProto.AgentInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAgentInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PyRLAgentBlockingStub extends io.grpc.stub.AbstractStub<PyRLAgentBlockingStub> {
    private PyRLAgentBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PyRLAgentBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PyRLAgentBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PyRLAgentBlockingStub(channel, callOptions);
    }

    /**
     */
    public PyRLProto.AgentInfo getAgentInfo(PyRLProto.ActionInfo request) {
      return blockingUnaryCall(
          getChannel(), getGetAgentInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PyRLAgentFutureStub extends io.grpc.stub.AbstractStub<PyRLAgentFutureStub> {
    private PyRLAgentFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PyRLAgentFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PyRLAgentFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PyRLAgentFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<PyRLProto.AgentInfo> getAgentInfo(
        PyRLProto.ActionInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAgentInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AGENT_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PyRLAgentImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PyRLAgentImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AGENT_INFO:
          serviceImpl.getAgentInfo((PyRLProto.ActionInfo) request,
              (io.grpc.stub.StreamObserver<PyRLProto.AgentInfo>) responseObserver);
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

  private static abstract class PyRLAgentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PyRLAgentBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return PyRLProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PyRLAgent");
    }
  }

  private static final class PyRLAgentFileDescriptorSupplier
      extends PyRLAgentBaseDescriptorSupplier {
    PyRLAgentFileDescriptorSupplier() {}
  }

  private static final class PyRLAgentMethodDescriptorSupplier
      extends PyRLAgentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PyRLAgentMethodDescriptorSupplier(String methodName) {
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
      synchronized (PyRLAgentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PyRLAgentFileDescriptorSupplier())
              .addMethod(getGetAgentInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
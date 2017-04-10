// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/instrumentation/v1alpha/monitoring.proto

package io.grpc.instrumentation.v1alpha;

public interface CanonicalRpcStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.instrumentation.v1alpha.CanonicalRpcStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_errors = 1;</code>
   */
  boolean hasRpcClientErrors();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_errors = 1;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponse getRpcClientErrors();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_errors = 1;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponseOrBuilder getRpcClientErrorsOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_completed_rpcs = 2;</code>
   */
  boolean hasRpcClientCompletedRpcs();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_completed_rpcs = 2;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponse getRpcClientCompletedRpcs();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_completed_rpcs = 2;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponseOrBuilder getRpcClientCompletedRpcsOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_started_rpcs = 3;</code>
   */
  boolean hasRpcClientStartedRpcs();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_started_rpcs = 3;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponse getRpcClientStartedRpcs();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_started_rpcs = 3;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponseOrBuilder getRpcClientStartedRpcsOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_elapsed_time = 4;</code>
   */
  boolean hasRpcClientElapsedTime();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_elapsed_time = 4;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponse getRpcClientElapsedTime();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_elapsed_time = 4;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponseOrBuilder getRpcClientElapsedTimeOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_server_elapsed_time = 5;</code>
   */
  boolean hasRpcClientServerElapsedTime();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_server_elapsed_time = 5;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponse getRpcClientServerElapsedTime();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_server_elapsed_time = 5;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponseOrBuilder getRpcClientServerElapsedTimeOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_request_bytes = 6;</code>
   */
  boolean hasRpcClientRequestBytes();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_request_bytes = 6;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponse getRpcClientRequestBytes();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_request_bytes = 6;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponseOrBuilder getRpcClientRequestBytesOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_response_bytes = 7;</code>
   */
  boolean hasRpcClientResponseBytes();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_response_bytes = 7;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponse getRpcClientResponseBytes();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_response_bytes = 7;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponseOrBuilder getRpcClientResponseBytesOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_request_count = 8;</code>
   */
  boolean hasRpcClientRequestCount();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_request_count = 8;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponse getRpcClientRequestCount();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_request_count = 8;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponseOrBuilder getRpcClientRequestCountOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_response_count = 9;</code>
   */
  boolean hasRpcClientResponseCount();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_response_count = 9;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponse getRpcClientResponseCount();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_client_response_count = 9;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponseOrBuilder getRpcClientResponseCountOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_errors = 10;</code>
   */
  boolean hasRpcServerErrors();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_errors = 10;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponse getRpcServerErrors();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_errors = 10;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponseOrBuilder getRpcServerErrorsOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_completed_rpcs = 11;</code>
   */
  boolean hasRpcServerCompletedRpcs();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_completed_rpcs = 11;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponse getRpcServerCompletedRpcs();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_completed_rpcs = 11;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponseOrBuilder getRpcServerCompletedRpcsOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_server_elapsed_time = 12;</code>
   */
  boolean hasRpcServerServerElapsedTime();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_server_elapsed_time = 12;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponse getRpcServerServerElapsedTime();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_server_elapsed_time = 12;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponseOrBuilder getRpcServerServerElapsedTimeOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_request_bytes = 13;</code>
   */
  boolean hasRpcServerRequestBytes();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_request_bytes = 13;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponse getRpcServerRequestBytes();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_request_bytes = 13;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponseOrBuilder getRpcServerRequestBytesOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_response_bytes = 14;</code>
   */
  boolean hasRpcServerResponseBytes();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_response_bytes = 14;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponse getRpcServerResponseBytes();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_response_bytes = 14;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponseOrBuilder getRpcServerResponseBytesOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_request_count = 15;</code>
   */
  boolean hasRpcServerRequestCount();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_request_count = 15;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponse getRpcServerRequestCount();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_request_count = 15;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponseOrBuilder getRpcServerRequestCountOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_response_count = 16;</code>
   */
  boolean hasRpcServerResponseCount();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_response_count = 16;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponse getRpcServerResponseCount();
  /**
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_response_count = 16;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponseOrBuilder getRpcServerResponseCountOrBuilder();

  /**
   * <pre>
   *TODO(ericgribkoff) Add minute-hour interval stats.
   * </pre>
   *
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_elapsed_time = 17;</code>
   */
  boolean hasRpcServerElapsedTime();
  /**
   * <pre>
   *TODO(ericgribkoff) Add minute-hour interval stats.
   * </pre>
   *
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_elapsed_time = 17;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponse getRpcServerElapsedTime();
  /**
   * <pre>
   *TODO(ericgribkoff) Add minute-hour interval stats.
   * </pre>
   *
   * <code>.grpc.instrumentation.v1alpha.StatsResponse rpc_server_elapsed_time = 17;</code>
   */
  io.grpc.instrumentation.v1alpha.StatsResponseOrBuilder getRpcServerElapsedTimeOrBuilder();
}
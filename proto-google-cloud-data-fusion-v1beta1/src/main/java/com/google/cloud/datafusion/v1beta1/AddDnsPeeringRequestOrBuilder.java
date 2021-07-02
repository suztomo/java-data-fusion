/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datafusion/v1beta1/v1beta1.proto

package com.google.cloud.datafusion.v1beta1;

public interface AddDnsPeeringRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datafusion.v1beta1.AddDnsPeeringRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource on which DNS peering will be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The resource on which DNS peering will be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Dns peering config.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1beta1.DnsPeering dns_peering = 2;</code>
   *
   * @return Whether the dnsPeering field is set.
   */
  boolean hasDnsPeering();
  /**
   *
   *
   * <pre>
   * Dns peering config.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1beta1.DnsPeering dns_peering = 2;</code>
   *
   * @return The dnsPeering.
   */
  com.google.cloud.datafusion.v1beta1.DnsPeering getDnsPeering();
  /**
   *
   *
   * <pre>
   * Dns peering config.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1beta1.DnsPeering dns_peering = 2;</code>
   */
  com.google.cloud.datafusion.v1beta1.DnsPeeringOrBuilder getDnsPeeringOrBuilder();
}

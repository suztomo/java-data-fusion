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
// source: google/cloud/datafusion/v1/datafusion.proto

package com.google.cloud.datafusion.v1;

public final class Datafusion {
  private Datafusion() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datafusion_v1_NetworkConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datafusion_v1_NetworkConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datafusion_v1_Version_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datafusion_v1_Version_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datafusion_v1_Accelerator_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datafusion_v1_Accelerator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datafusion_v1_CryptoKeyConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datafusion_v1_CryptoKeyConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datafusion_v1_Instance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datafusion_v1_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datafusion_v1_Instance_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datafusion_v1_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datafusion_v1_Instance_OptionsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datafusion_v1_Instance_OptionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datafusion_v1_ListInstancesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datafusion_v1_ListInstancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datafusion_v1_ListInstancesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datafusion_v1_ListInstancesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datafusion_v1_ListAvailableVersionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datafusion_v1_ListAvailableVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datafusion_v1_ListAvailableVersionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datafusion_v1_ListAvailableVersionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datafusion_v1_GetInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datafusion_v1_GetInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datafusion_v1_CreateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datafusion_v1_CreateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datafusion_v1_DeleteInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datafusion_v1_DeleteInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datafusion_v1_UpdateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datafusion_v1_UpdateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datafusion_v1_RestartInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datafusion_v1_RestartInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datafusion_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datafusion_v1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datafusion_v1_OperationMetadata_AdditionalStatusEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datafusion_v1_OperationMetadata_AdditionalStatusEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/datafusion/v1/datafusion."
          + "proto\022\032google.cloud.datafusion.v1\032\034googl"
          + "e/api/annotations.proto\032\027google/api/clie"
          + "nt.proto\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\032#google/lon"
          + "grunning/operations.proto\032 google/protob"
          + "uf/field_mask.proto\032\037google/protobuf/tim"
          + "estamp.proto\"7\n\rNetworkConfig\022\017\n\007network"
          + "\030\001 \001(\t\022\025\n\rip_allocation\030\002 \001(\t\"V\n\007Version"
          + "\022\026\n\016version_number\030\001 \001(\t\022\027\n\017default_vers"
          + "ion\030\002 \001(\010\022\032\n\022available_features\030\003 \003(\t\"\307\002"
          + "\n\013Accelerator\022Q\n\020accelerator_type\030\001 \001(\0162"
          + "7.google.cloud.datafusion.v1.Accelerator"
          + ".AcceleratorType\022<\n\005state\030\002 \001(\0162-.google"
          + ".cloud.datafusion.v1.Accelerator.State\"_"
          + "\n\017AcceleratorType\022 \n\034ACCELERATOR_TYPE_UN"
          + "SPECIFIED\020\000\022\007\n\003CDC\020\001\022\016\n\nHEALTHCARE\020\002\022\021\n\r"
          + "CCAI_INSIGHTS\020\003\"F\n\005State\022\025\n\021STATE_UNSPEC"
          + "IFIED\020\000\022\013\n\007ENABLED\020\001\022\014\n\010DISABLED\020\002\022\013\n\007UN"
          + "KNOWN\020\003\"(\n\017CryptoKeyConfig\022\025\n\rkey_refere"
          + "nce\030\001 \001(\t\"\204\014\n\010Instance\022\021\n\004name\030\001 \001(\tB\003\340A"
          + "\003\022\023\n\013description\030\002 \001(\t\022<\n\004type\030\003 \001(\0162).g"
          + "oogle.cloud.datafusion.v1.Instance.TypeB"
          + "\003\340A\002\022\"\n\032enable_stackdriver_logging\030\004 \001(\010"
          + "\022%\n\035enable_stackdriver_monitoring\030\005 \001(\010\022"
          + "\030\n\020private_instance\030\006 \001(\010\022A\n\016network_con"
          + "fig\030\007 \001(\0132).google.cloud.datafusion.v1.N"
          + "etworkConfig\022@\n\006labels\030\010 \003(\01320.google.cl"
          + "oud.datafusion.v1.Instance.LabelsEntry\022B"
          + "\n\007options\030\t \003(\01321.google.cloud.datafusio"
          + "n.v1.Instance.OptionsEntry\0224\n\013create_tim"
          + "e\030\n \001(\0132\032.google.protobuf.TimestampB\003\340A\003"
          + "\0224\n\013update_time\030\013 \001(\0132\032.google.protobuf."
          + "TimestampB\003\340A\003\022>\n\005state\030\014 \001(\0162*.google.c"
          + "loud.datafusion.v1.Instance.StateB\003\340A\003\022\032"
          + "\n\rstate_message\030\r \001(\tB\003\340A\003\022\035\n\020service_en"
          + "dpoint\030\016 \001(\tB\003\340A\003\022\014\n\004zone\030\017 \001(\t\022\017\n\007versi"
          + "on\030\020 \001(\t\022\036\n\017service_account\030\021 \001(\tB\005\030\001\340A\003"
          + "\022\024\n\014display_name\030\022 \001(\t\022>\n\021available_vers"
          + "ion\030\023 \003(\0132#.google.cloud.datafusion.v1.V"
          + "ersion\022\031\n\014api_endpoint\030\024 \001(\tB\003\340A\003\022\027\n\ngcs"
          + "_bucket\030\025 \001(\tB\003\340A\003\022=\n\014accelerators\030\026 \003(\013"
          + "2\'.google.cloud.datafusion.v1.Accelerato"
          + "r\022\037\n\022p4_service_account\030\027 \001(\tB\003\340A\003\022\036\n\021te"
          + "nant_project_id\030\030 \001(\tB\003\340A\003\022 \n\030dataproc_s"
          + "ervice_account\030\031 \001(\t\022\023\n\013enable_rbac\030\033 \001("
          + "\010\022F\n\021crypto_key_config\030\034 \001(\0132+.google.cl"
          + "oud.datafusion.v1.CryptoKeyConfig\032-\n\013Lab"
          + "elsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001"
          + "\032.\n\014OptionsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002"
          + " \001(\t:\0028\001\"F\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\t"
          + "\n\005BASIC\020\001\022\016\n\nENTERPRISE\020\002\022\r\n\tDEVELOPER\020\003"
          + "\"\246\001\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010CRE"
          + "ATING\020\001\022\n\n\006ACTIVE\020\002\022\n\n\006FAILED\020\003\022\014\n\010DELET"
          + "ING\020\004\022\r\n\tUPGRADING\020\005\022\016\n\nRESTARTING\020\006\022\014\n\010"
          + "UPDATING\020\007\022\021\n\rAUTO_UPDATING\020\010\022\022\n\016AUTO_UP"
          + "GRADING\020\t:e\352Ab\n\"datafusion.googleapis.co"
          + "m/Instance\022<projects/{project}/locations"
          + "/{location}/instances/{instance}\"o\n\024List"
          + "InstancesRequest\022\016\n\006parent\030\001 \001(\t\022\021\n\tpage"
          + "_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filte"
          + "r\030\004 \001(\t\022\020\n\010order_by\030\005 \001(\t\"~\n\025ListInstanc"
          + "esResponse\0227\n\tinstances\030\001 \003(\0132$.google.c"
          + "loud.datafusion.v1.Instance\022\027\n\017next_page"
          + "_token\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"u\n\034Lis"
          + "tAvailableVersionsRequest\022\023\n\006parent\030\001 \001("
          + "\tB\003\340A\002\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030"
          + "\003 \001(\t\022\031\n\021latest_patch_only\030\004 \001(\010\"y\n\035List"
          + "AvailableVersionsResponse\022?\n\022available_v"
          + "ersions\030\001 \003(\0132#.google.cloud.datafusion."
          + "v1.Version\022\027\n\017next_page_token\030\002 \001(\t\"\"\n\022G"
          + "etInstanceRequest\022\014\n\004name\030\001 \001(\t\"t\n\025Creat"
          + "eInstanceRequest\022\016\n\006parent\030\001 \001(\t\022\023\n\013inst"
          + "ance_id\030\002 \001(\t\0226\n\010instance\030\003 \001(\0132$.google"
          + ".cloud.datafusion.v1.Instance\"%\n\025DeleteI"
          + "nstanceRequest\022\014\n\004name\030\001 \001(\t\"\200\001\n\025UpdateI"
          + "nstanceRequest\0226\n\010instance\030\001 \001(\0132$.googl"
          + "e.cloud.datafusion.v1.Instance\022/\n\013update"
          + "_mask\030\002 \001(\0132\032.google.protobuf.FieldMask\""
          + "&\n\026RestartInstanceRequest\022\014\n\004name\030\001 \001(\t\""
          + "\365\002\n\021OperationMetadata\022/\n\013create_time\030\001 \001"
          + "(\0132\032.google.protobuf.Timestamp\022,\n\010end_ti"
          + "me\030\002 \001(\0132\032.google.protobuf.Timestamp\022\016\n\006"
          + "target\030\003 \001(\t\022\014\n\004verb\030\004 \001(\t\022\025\n\rstatus_det"
          + "ail\030\005 \001(\t\022\036\n\026requested_cancellation\030\006 \001("
          + "\010\022\023\n\013api_version\030\007 \001(\t\022^\n\021additional_sta"
          + "tus\030\010 \003(\0132C.google.cloud.datafusion.v1.O"
          + "perationMetadata.AdditionalStatusEntry\0327"
          + "\n\025AdditionalStatusEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005"
          + "value\030\002 \001(\t:\0028\0012\327\013\n\nDataFusion\022\313\001\n\025ListA"
          + "vailableVersions\0228.google.cloud.datafusi"
          + "on.v1.ListAvailableVersionsRequest\0329.goo"
          + "gle.cloud.datafusion.v1.ListAvailableVer"
          + "sionsResponse\"=\202\323\344\223\002.\022,/v1/{parent=proje"
          + "cts/*/locations/*}/versions\332A\006parent\022\253\001\n"
          + "\rListInstances\0220.google.cloud.datafusion"
          + ".v1.ListInstancesRequest\0321.google.cloud."
          + "datafusion.v1.ListInstancesResponse\"5\202\323\344"
          + "\223\002/\022-/v1/{parent=projects/*/locations/*}"
          + "/instances\022\232\001\n\013GetInstance\022..google.clou"
          + "d.datafusion.v1.GetInstanceRequest\032$.goo"
          + "gle.cloud.datafusion.v1.Instance\"5\202\323\344\223\002/"
          + "\022-/v1/{name=projects/*/locations/*/insta"
          + "nces/*}\022\341\001\n\016CreateInstance\0221.google.clou"
          + "d.datafusion.v1.CreateInstanceRequest\032\035."
          + "google.longrunning.Operation\"}\202\323\344\223\0029\"-/v"
          + "1/{parent=projects/*/locations/*}/instan"
          + "ces:\010instance\332A\033parent,instance,instance"
          + "_id\312A\035\n\010Instance\022\021OperationMetadata\022\315\001\n\016"
          + "DeleteInstance\0221.google.cloud.datafusion"
          + ".v1.DeleteInstanceRequest\032\035.google.longr"
          + "unning.Operation\"i\202\323\344\223\002/*-/v1/{name=proj"
          + "ects/*/locations/*/instances/*}\332A\004name\312A"
          + "*\n\025google.protobuf.Empty\022\021OperationMetad"
          + "ata\022\343\001\n\016UpdateInstance\0221.google.cloud.da"
          + "tafusion.v1.UpdateInstanceRequest\032\035.goog"
          + "le.longrunning.Operation\"\177\202\323\344\223\002B26/v1/{i"
          + "nstance.name=projects/*/locations/*/inst"
          + "ances/*}:\010instance\332A\024instance,update_mas"
          + "k\312A\035\n\010Instance\022\021OperationMetadata\022\306\001\n\017Re"
          + "startInstance\0222.google.cloud.datafusion."
          + "v1.RestartInstanceRequest\032\035.google.longr"
          + "unning.Operation\"`\202\323\344\223\002:\"5/v1/{name=proj"
          + "ects/*/locations/*/instances/*}:restart:"
          + "\001*\312A\035\n\010Instance\022\021OperationMetadata\032M\312A\031d"
          + "atafusion.googleapis.com\322A.https://www.g"
          + "oogleapis.com/auth/cloud-platformB\302\001\n\036co"
          + "m.google.cloud.datafusion.v1P\001ZDgoogle.g"
          + "olang.org/genproto/googleapis/cloud/data"
          + "fusion/v1;datafusion\252\002\032Google.Cloud.Data"
          + "Fusion.V1\312\002\032Google\\Cloud\\DataFusion\\V1\352\002"
          + "\035Google::Cloud::DataFusion::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_datafusion_v1_NetworkConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datafusion_v1_NetworkConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datafusion_v1_NetworkConfig_descriptor,
            new java.lang.String[] {
              "Network", "IpAllocation",
            });
    internal_static_google_cloud_datafusion_v1_Version_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datafusion_v1_Version_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datafusion_v1_Version_descriptor,
            new java.lang.String[] {
              "VersionNumber", "DefaultVersion", "AvailableFeatures",
            });
    internal_static_google_cloud_datafusion_v1_Accelerator_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datafusion_v1_Accelerator_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datafusion_v1_Accelerator_descriptor,
            new java.lang.String[] {
              "AcceleratorType", "State",
            });
    internal_static_google_cloud_datafusion_v1_CryptoKeyConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datafusion_v1_CryptoKeyConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datafusion_v1_CryptoKeyConfig_descriptor,
            new java.lang.String[] {
              "KeyReference",
            });
    internal_static_google_cloud_datafusion_v1_Instance_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_datafusion_v1_Instance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datafusion_v1_Instance_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "Type",
              "EnableStackdriverLogging",
              "EnableStackdriverMonitoring",
              "PrivateInstance",
              "NetworkConfig",
              "Labels",
              "Options",
              "CreateTime",
              "UpdateTime",
              "State",
              "StateMessage",
              "ServiceEndpoint",
              "Zone",
              "Version",
              "ServiceAccount",
              "DisplayName",
              "AvailableVersion",
              "ApiEndpoint",
              "GcsBucket",
              "Accelerators",
              "P4ServiceAccount",
              "TenantProjectId",
              "DataprocServiceAccount",
              "EnableRbac",
              "CryptoKeyConfig",
            });
    internal_static_google_cloud_datafusion_v1_Instance_LabelsEntry_descriptor =
        internal_static_google_cloud_datafusion_v1_Instance_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_datafusion_v1_Instance_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datafusion_v1_Instance_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_datafusion_v1_Instance_OptionsEntry_descriptor =
        internal_static_google_cloud_datafusion_v1_Instance_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_datafusion_v1_Instance_OptionsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datafusion_v1_Instance_OptionsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_datafusion_v1_ListInstancesRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_datafusion_v1_ListInstancesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datafusion_v1_ListInstancesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_datafusion_v1_ListInstancesResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_datafusion_v1_ListInstancesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datafusion_v1_ListInstancesResponse_descriptor,
            new java.lang.String[] {
              "Instances", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_datafusion_v1_ListAvailableVersionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_datafusion_v1_ListAvailableVersionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datafusion_v1_ListAvailableVersionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "LatestPatchOnly",
            });
    internal_static_google_cloud_datafusion_v1_ListAvailableVersionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_datafusion_v1_ListAvailableVersionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datafusion_v1_ListAvailableVersionsResponse_descriptor,
            new java.lang.String[] {
              "AvailableVersions", "NextPageToken",
            });
    internal_static_google_cloud_datafusion_v1_GetInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_datafusion_v1_GetInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datafusion_v1_GetInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_datafusion_v1_CreateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_datafusion_v1_CreateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datafusion_v1_CreateInstanceRequest_descriptor,
            new java.lang.String[] {
              "Parent", "InstanceId", "Instance",
            });
    internal_static_google_cloud_datafusion_v1_DeleteInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_datafusion_v1_DeleteInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datafusion_v1_DeleteInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_datafusion_v1_UpdateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_datafusion_v1_UpdateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datafusion_v1_UpdateInstanceRequest_descriptor,
            new java.lang.String[] {
              "Instance", "UpdateMask",
            });
    internal_static_google_cloud_datafusion_v1_RestartInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_datafusion_v1_RestartInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datafusion_v1_RestartInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_datafusion_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_datafusion_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datafusion_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusDetail",
              "RequestedCancellation",
              "ApiVersion",
              "AdditionalStatus",
            });
    internal_static_google_cloud_datafusion_v1_OperationMetadata_AdditionalStatusEntry_descriptor =
        internal_static_google_cloud_datafusion_v1_OperationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_datafusion_v1_OperationMetadata_AdditionalStatusEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datafusion_v1_OperationMetadata_AdditionalStatusEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

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

/**
 *
 *
 * <pre>
 * The Data Fusion version. This proto message stores information about certain
 * Data Fusion version, which is used for Data Fusion version upgrade.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datafusion.v1.Version}
 */
public final class Version extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datafusion.v1.Version)
    VersionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Version.newBuilder() to construct.
  private Version(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Version() {
    versionNumber_ = "";
    availableFeatures_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Version();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Version(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              versionNumber_ = s;
              break;
            }
          case 16:
            {
              defaultVersion_ = input.readBool();
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                availableFeatures_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              availableFeatures_.add(s);
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        availableFeatures_ = availableFeatures_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datafusion.v1.Datafusion
        .internal_static_google_cloud_datafusion_v1_Version_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datafusion.v1.Datafusion
        .internal_static_google_cloud_datafusion_v1_Version_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datafusion.v1.Version.class,
            com.google.cloud.datafusion.v1.Version.Builder.class);
  }

  public static final int VERSION_NUMBER_FIELD_NUMBER = 1;
  private volatile java.lang.Object versionNumber_;
  /**
   *
   *
   * <pre>
   * The version number of the Data Fusion instance, such as '6.0.1.0'.
   * </pre>
   *
   * <code>string version_number = 1;</code>
   *
   * @return The versionNumber.
   */
  @java.lang.Override
  public java.lang.String getVersionNumber() {
    java.lang.Object ref = versionNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      versionNumber_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The version number of the Data Fusion instance, such as '6.0.1.0'.
   * </pre>
   *
   * <code>string version_number = 1;</code>
   *
   * @return The bytes for versionNumber.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVersionNumberBytes() {
    java.lang.Object ref = versionNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      versionNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEFAULT_VERSION_FIELD_NUMBER = 2;
  private boolean defaultVersion_;
  /**
   *
   *
   * <pre>
   * Whether this is currently the default version for Cloud Data Fusion
   * </pre>
   *
   * <code>bool default_version = 2;</code>
   *
   * @return The defaultVersion.
   */
  @java.lang.Override
  public boolean getDefaultVersion() {
    return defaultVersion_;
  }

  public static final int AVAILABLE_FEATURES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList availableFeatures_;
  /**
   *
   *
   * <pre>
   * Represents a list of available feature names for a given version.
   * </pre>
   *
   * <code>repeated string available_features = 3;</code>
   *
   * @return A list containing the availableFeatures.
   */
  public com.google.protobuf.ProtocolStringList getAvailableFeaturesList() {
    return availableFeatures_;
  }
  /**
   *
   *
   * <pre>
   * Represents a list of available feature names for a given version.
   * </pre>
   *
   * <code>repeated string available_features = 3;</code>
   *
   * @return The count of availableFeatures.
   */
  public int getAvailableFeaturesCount() {
    return availableFeatures_.size();
  }
  /**
   *
   *
   * <pre>
   * Represents a list of available feature names for a given version.
   * </pre>
   *
   * <code>repeated string available_features = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The availableFeatures at the given index.
   */
  public java.lang.String getAvailableFeatures(int index) {
    return availableFeatures_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Represents a list of available feature names for a given version.
   * </pre>
   *
   * <code>repeated string available_features = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the availableFeatures at the given index.
   */
  public com.google.protobuf.ByteString getAvailableFeaturesBytes(int index) {
    return availableFeatures_.getByteString(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(versionNumber_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, versionNumber_);
    }
    if (defaultVersion_ != false) {
      output.writeBool(2, defaultVersion_);
    }
    for (int i = 0; i < availableFeatures_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, availableFeatures_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(versionNumber_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, versionNumber_);
    }
    if (defaultVersion_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, defaultVersion_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < availableFeatures_.size(); i++) {
        dataSize += computeStringSizeNoTag(availableFeatures_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAvailableFeaturesList().size();
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
    if (!(obj instanceof com.google.cloud.datafusion.v1.Version)) {
      return super.equals(obj);
    }
    com.google.cloud.datafusion.v1.Version other = (com.google.cloud.datafusion.v1.Version) obj;

    if (!getVersionNumber().equals(other.getVersionNumber())) return false;
    if (getDefaultVersion() != other.getDefaultVersion()) return false;
    if (!getAvailableFeaturesList().equals(other.getAvailableFeaturesList())) return false;
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
    hash = (37 * hash) + VERSION_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getVersionNumber().hashCode();
    hash = (37 * hash) + DEFAULT_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getDefaultVersion());
    if (getAvailableFeaturesCount() > 0) {
      hash = (37 * hash) + AVAILABLE_FEATURES_FIELD_NUMBER;
      hash = (53 * hash) + getAvailableFeaturesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datafusion.v1.Version parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datafusion.v1.Version parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1.Version parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datafusion.v1.Version parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1.Version parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datafusion.v1.Version parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1.Version parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datafusion.v1.Version parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1.Version parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datafusion.v1.Version parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1.Version parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datafusion.v1.Version parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.datafusion.v1.Version prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The Data Fusion version. This proto message stores information about certain
   * Data Fusion version, which is used for Data Fusion version upgrade.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datafusion.v1.Version}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datafusion.v1.Version)
      com.google.cloud.datafusion.v1.VersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datafusion.v1.Datafusion
          .internal_static_google_cloud_datafusion_v1_Version_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datafusion.v1.Datafusion
          .internal_static_google_cloud_datafusion_v1_Version_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datafusion.v1.Version.class,
              com.google.cloud.datafusion.v1.Version.Builder.class);
    }

    // Construct using com.google.cloud.datafusion.v1.Version.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      versionNumber_ = "";

      defaultVersion_ = false;

      availableFeatures_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datafusion.v1.Datafusion
          .internal_static_google_cloud_datafusion_v1_Version_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1.Version getDefaultInstanceForType() {
      return com.google.cloud.datafusion.v1.Version.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1.Version build() {
      com.google.cloud.datafusion.v1.Version result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1.Version buildPartial() {
      com.google.cloud.datafusion.v1.Version result =
          new com.google.cloud.datafusion.v1.Version(this);
      int from_bitField0_ = bitField0_;
      result.versionNumber_ = versionNumber_;
      result.defaultVersion_ = defaultVersion_;
      if (((bitField0_ & 0x00000001) != 0)) {
        availableFeatures_ = availableFeatures_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.availableFeatures_ = availableFeatures_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datafusion.v1.Version) {
        return mergeFrom((com.google.cloud.datafusion.v1.Version) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datafusion.v1.Version other) {
      if (other == com.google.cloud.datafusion.v1.Version.getDefaultInstance()) return this;
      if (!other.getVersionNumber().isEmpty()) {
        versionNumber_ = other.versionNumber_;
        onChanged();
      }
      if (other.getDefaultVersion() != false) {
        setDefaultVersion(other.getDefaultVersion());
      }
      if (!other.availableFeatures_.isEmpty()) {
        if (availableFeatures_.isEmpty()) {
          availableFeatures_ = other.availableFeatures_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAvailableFeaturesIsMutable();
          availableFeatures_.addAll(other.availableFeatures_);
        }
        onChanged();
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
      com.google.cloud.datafusion.v1.Version parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datafusion.v1.Version) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object versionNumber_ = "";
    /**
     *
     *
     * <pre>
     * The version number of the Data Fusion instance, such as '6.0.1.0'.
     * </pre>
     *
     * <code>string version_number = 1;</code>
     *
     * @return The versionNumber.
     */
    public java.lang.String getVersionNumber() {
      java.lang.Object ref = versionNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        versionNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The version number of the Data Fusion instance, such as '6.0.1.0'.
     * </pre>
     *
     * <code>string version_number = 1;</code>
     *
     * @return The bytes for versionNumber.
     */
    public com.google.protobuf.ByteString getVersionNumberBytes() {
      java.lang.Object ref = versionNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        versionNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The version number of the Data Fusion instance, such as '6.0.1.0'.
     * </pre>
     *
     * <code>string version_number = 1;</code>
     *
     * @param value The versionNumber to set.
     * @return This builder for chaining.
     */
    public Builder setVersionNumber(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      versionNumber_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The version number of the Data Fusion instance, such as '6.0.1.0'.
     * </pre>
     *
     * <code>string version_number = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVersionNumber() {

      versionNumber_ = getDefaultInstance().getVersionNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The version number of the Data Fusion instance, such as '6.0.1.0'.
     * </pre>
     *
     * <code>string version_number = 1;</code>
     *
     * @param value The bytes for versionNumber to set.
     * @return This builder for chaining.
     */
    public Builder setVersionNumberBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      versionNumber_ = value;
      onChanged();
      return this;
    }

    private boolean defaultVersion_;
    /**
     *
     *
     * <pre>
     * Whether this is currently the default version for Cloud Data Fusion
     * </pre>
     *
     * <code>bool default_version = 2;</code>
     *
     * @return The defaultVersion.
     */
    @java.lang.Override
    public boolean getDefaultVersion() {
      return defaultVersion_;
    }
    /**
     *
     *
     * <pre>
     * Whether this is currently the default version for Cloud Data Fusion
     * </pre>
     *
     * <code>bool default_version = 2;</code>
     *
     * @param value The defaultVersion to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultVersion(boolean value) {

      defaultVersion_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether this is currently the default version for Cloud Data Fusion
     * </pre>
     *
     * <code>bool default_version = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDefaultVersion() {

      defaultVersion_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList availableFeatures_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureAvailableFeaturesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        availableFeatures_ = new com.google.protobuf.LazyStringArrayList(availableFeatures_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Represents a list of available feature names for a given version.
     * </pre>
     *
     * <code>repeated string available_features = 3;</code>
     *
     * @return A list containing the availableFeatures.
     */
    public com.google.protobuf.ProtocolStringList getAvailableFeaturesList() {
      return availableFeatures_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Represents a list of available feature names for a given version.
     * </pre>
     *
     * <code>repeated string available_features = 3;</code>
     *
     * @return The count of availableFeatures.
     */
    public int getAvailableFeaturesCount() {
      return availableFeatures_.size();
    }
    /**
     *
     *
     * <pre>
     * Represents a list of available feature names for a given version.
     * </pre>
     *
     * <code>repeated string available_features = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The availableFeatures at the given index.
     */
    public java.lang.String getAvailableFeatures(int index) {
      return availableFeatures_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Represents a list of available feature names for a given version.
     * </pre>
     *
     * <code>repeated string available_features = 3;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the availableFeatures at the given index.
     */
    public com.google.protobuf.ByteString getAvailableFeaturesBytes(int index) {
      return availableFeatures_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Represents a list of available feature names for a given version.
     * </pre>
     *
     * <code>repeated string available_features = 3;</code>
     *
     * @param index The index to set the value at.
     * @param value The availableFeatures to set.
     * @return This builder for chaining.
     */
    public Builder setAvailableFeatures(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAvailableFeaturesIsMutable();
      availableFeatures_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents a list of available feature names for a given version.
     * </pre>
     *
     * <code>repeated string available_features = 3;</code>
     *
     * @param value The availableFeatures to add.
     * @return This builder for chaining.
     */
    public Builder addAvailableFeatures(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAvailableFeaturesIsMutable();
      availableFeatures_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents a list of available feature names for a given version.
     * </pre>
     *
     * <code>repeated string available_features = 3;</code>
     *
     * @param values The availableFeatures to add.
     * @return This builder for chaining.
     */
    public Builder addAllAvailableFeatures(java.lang.Iterable<java.lang.String> values) {
      ensureAvailableFeaturesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, availableFeatures_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents a list of available feature names for a given version.
     * </pre>
     *
     * <code>repeated string available_features = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAvailableFeatures() {
      availableFeatures_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents a list of available feature names for a given version.
     * </pre>
     *
     * <code>repeated string available_features = 3;</code>
     *
     * @param value The bytes of the availableFeatures to add.
     * @return This builder for chaining.
     */
    public Builder addAvailableFeaturesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureAvailableFeaturesIsMutable();
      availableFeatures_.add(value);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.datafusion.v1.Version)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datafusion.v1.Version)
  private static final com.google.cloud.datafusion.v1.Version DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datafusion.v1.Version();
  }

  public static com.google.cloud.datafusion.v1.Version getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Version> PARSER =
      new com.google.protobuf.AbstractParser<Version>() {
        @java.lang.Override
        public Version parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Version(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Version> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Version> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datafusion.v1.Version getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

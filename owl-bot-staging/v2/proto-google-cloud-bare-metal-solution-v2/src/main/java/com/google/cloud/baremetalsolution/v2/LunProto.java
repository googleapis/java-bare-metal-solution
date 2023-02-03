// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/baremetalsolution/v2/lun.proto

package com.google.cloud.baremetalsolution.v2;

public final class LunProto {
  private LunProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_baremetalsolution_v2_Lun_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_Lun_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_baremetalsolution_v2_GetLunRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_GetLunRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_baremetalsolution_v2_ListLunsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ListLunsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_baremetalsolution_v2_ListLunsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ListLunsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/baremetalsolution/v2/lun." +
      "proto\022!google.cloud.baremetalsolution.v2" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\"\323\005\n\003Lun\022\021\n\004name\030\001 \001" +
      "(\tB\003\340A\003\022\n\n\002id\030\n \001(\t\022;\n\005state\030\002 \001(\0162,.goo" +
      "gle.cloud.baremetalsolution.v2.Lun.State" +
      "\022\017\n\007size_gb\030\003 \001(\003\022T\n\022multiprotocol_type\030" +
      "\004 \001(\01628.google.cloud.baremetalsolution.v" +
      "2.Lun.MultiprotocolType\022D\n\016storage_volum" +
      "e\030\005 \001(\tB,\372A)\n\'baremetalsolution.googleap" +
      "is.com/Volume\022\021\n\tshareable\030\006 \001(\010\022\020\n\010boot" +
      "_lun\030\007 \001(\010\022H\n\014storage_type\030\010 \001(\01622.googl" +
      "e.cloud.baremetalsolution.v2.Lun.Storage" +
      "Type\022\014\n\004wwid\030\t \001(\t\"S\n\005State\022\025\n\021STATE_UNS" +
      "PECIFIED\020\000\022\014\n\010CREATING\020\001\022\014\n\010UPDATING\020\002\022\t" +
      "\n\005READY\020\003\022\014\n\010DELETING\020\004\"B\n\021Multiprotocol" +
      "Type\022\"\n\036MULTIPROTOCOL_TYPE_UNSPECIFIED\020\000" +
      "\022\t\n\005LINUX\020\001\"=\n\013StorageType\022\034\n\030STORAGE_TY" +
      "PE_UNSPECIFIED\020\000\022\007\n\003SSD\020\001\022\007\n\003HDD\020\002:n\352Ak\n" +
      "$baremetalsolution.googleapis.com/Lun\022Cp" +
      "rojects/{project}/locations/{location}/v" +
      "olumes/{volume}/luns/{lun}\"K\n\rGetLunRequ" +
      "est\022:\n\004name\030\001 \001(\tB,\340A\002\372A&\n$baremetalsolu" +
      "tion.googleapis.com/Lun\"y\n\017ListLunsReque" +
      "st\022?\n\006parent\030\001 \001(\tB/\340A\002\372A)\n\'baremetalsol" +
      "ution.googleapis.com/Volume\022\021\n\tpage_size" +
      "\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"v\n\020ListLunsRe" +
      "sponse\0224\n\004luns\030\001 \003(\0132&.google.cloud.bare" +
      "metalsolution.v2.Lun\022\027\n\017next_page_token\030" +
      "\002 \001(\t\022\023\n\013unreachable\030\003 \003(\tB\367\001\n%com.googl" +
      "e.cloud.baremetalsolution.v2B\010LunProtoP\001" +
      "ZScloud.google.com/go/baremetalsolution/" +
      "apiv2/baremetalsolutionpb;baremetalsolut" +
      "ionpb\252\002!Google.Cloud.BareMetalSolution.V" +
      "2\312\002!Google\\Cloud\\BareMetalSolution\\V2\352\002$" +
      "Google::Cloud::BareMetalSolution::V2b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_cloud_baremetalsolution_v2_Lun_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_baremetalsolution_v2_Lun_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_baremetalsolution_v2_Lun_descriptor,
        new java.lang.String[] { "Name", "Id", "State", "SizeGb", "MultiprotocolType", "StorageVolume", "Shareable", "BootLun", "StorageType", "Wwid", });
    internal_static_google_cloud_baremetalsolution_v2_GetLunRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_baremetalsolution_v2_GetLunRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_baremetalsolution_v2_GetLunRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_baremetalsolution_v2_ListLunsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_baremetalsolution_v2_ListLunsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_baremetalsolution_v2_ListLunsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_baremetalsolution_v2_ListLunsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_baremetalsolution_v2_ListLunsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_baremetalsolution_v2_ListLunsResponse_descriptor,
        new java.lang.String[] { "Luns", "NextPageToken", "Unreachable", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

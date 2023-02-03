// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/baremetalsolution/v2/baremetalsolution.proto

package com.google.cloud.baremetalsolution.v2;

public final class BareMetalSolutionProto {
  private BareMetalSolutionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/baremetalsolution/v2/bare" +
      "metalsolution.proto\022!google.cloud.bareme" +
      "talsolution.v2\032\034google/api/annotations.p" +
      "roto\032\027google/api/client.proto\032\037google/ap" +
      "i/field_behavior.proto\0320google/cloud/bar" +
      "emetalsolution/v2/instance.proto\032+google" +
      "/cloud/baremetalsolution/v2/lun.proto\032/g" +
      "oogle/cloud/baremetalsolution/v2/network" +
      ".proto\0321google/cloud/baremetalsolution/v" +
      "2/nfs_share.proto\032.google/cloud/baremeta" +
      "lsolution/v2/volume.proto\032#google/longru" +
      "nning/operations.proto\032\037google/protobuf/" +
      "timestamp.proto\"\200\002\n\021OperationMetadata\0224\n" +
      "\013create_time\030\001 \001(\0132\032.google.protobuf.Tim" +
      "estampB\003\340A\003\0221\n\010end_time\030\002 \001(\0132\032.google.p" +
      "rotobuf.TimestampB\003\340A\003\022\023\n\006target\030\003 \001(\tB\003" +
      "\340A\003\022\021\n\004verb\030\004 \001(\tB\003\340A\003\022\033\n\016status_message" +
      "\030\005 \001(\tB\003\340A\003\022#\n\026requested_cancellation\030\006 " +
      "\001(\010B\003\340A\003\022\030\n\013api_version\030\007 \001(\tB\003\340A\003\"\027\n\025Re" +
      "setInstanceResponse2\335 \n\021BareMetalSolutio" +
      "n\022\302\001\n\rListInstances\0227.google.cloud.barem" +
      "etalsolution.v2.ListInstancesRequest\0328.g" +
      "oogle.cloud.baremetalsolution.v2.ListIns" +
      "tancesResponse\">\202\323\344\223\002/\022-/v2/{parent=proj" +
      "ects/*/locations/*}/instances\332A\006parent\022\257" +
      "\001\n\013GetInstance\0225.google.cloud.baremetals" +
      "olution.v2.GetInstanceRequest\032+.google.c" +
      "loud.baremetalsolution.v2.Instance\"<\202\323\344\223" +
      "\002/\022-/v2/{name=projects/*/locations/*/ins" +
      "tances/*}\332A\004name\022\352\001\n\016UpdateInstance\0228.go" +
      "ogle.cloud.baremetalsolution.v2.UpdateIn" +
      "stanceRequest\032\035.google.longrunning.Opera" +
      "tion\"\177\202\323\344\223\002B26/v2/{instance.name=project" +
      "s/*/locations/*/instances/*}:\010instance\332A" +
      "\024instance,update_mask\312A\035\n\010Instance\022\021Oper" +
      "ationMetadata\022\333\001\n\rResetInstance\0227.google" +
      ".cloud.baremetalsolution.v2.ResetInstanc" +
      "eRequest\032\035.google.longrunning.Operation\"" +
      "r\202\323\344\223\0028\"3/v2/{name=projects/*/locations/" +
      "*/instances/*}:reset:\001*\332A\004name\312A*\n\025Reset" +
      "InstanceResponse\022\021OperationMetadata\022\333\001\n\r" +
      "StartInstance\0227.google.cloud.baremetalso" +
      "lution.v2.StartInstanceRequest\032\035.google." +
      "longrunning.Operation\"r\202\323\344\223\0028\"3/v2/{name" +
      "=projects/*/locations/*/instances/*}:sta" +
      "rt:\001*\332A\004name\312A*\n\025StartInstanceResponse\022\021" +
      "OperationMetadata\022\327\001\n\014StopInstance\0226.goo" +
      "gle.cloud.baremetalsolution.v2.StopInsta" +
      "nceRequest\032\035.google.longrunning.Operatio" +
      "n\"p\202\323\344\223\0027\"2/v2/{name=projects/*/location" +
      "s/*/instances/*}:stop:\001*\332A\004name\312A)\n\024Stop" +
      "InstanceResponse\022\021OperationMetadata\022\326\001\n\t" +
      "DetachLun\0223.google.cloud.baremetalsoluti" +
      "on.v2.DetachLunRequest\032\035.google.longrunn" +
      "ing.Operation\"u\202\323\344\223\002@\";/v2/{instance=pro" +
      "jects/*/locations/*/instances/*}:detachL" +
      "un:\001*\332A\014instance,lun\312A\035\n\010Instance\022\021Opera" +
      "tionMetadata\022\272\001\n\013ListVolumes\0225.google.cl" +
      "oud.baremetalsolution.v2.ListVolumesRequ" +
      "est\0326.google.cloud.baremetalsolution.v2." +
      "ListVolumesResponse\"<\202\323\344\223\002-\022+/v2/{parent" +
      "=projects/*/locations/*}/volumes\332A\006paren" +
      "t\022\247\001\n\tGetVolume\0223.google.cloud.baremetal" +
      "solution.v2.GetVolumeRequest\032).google.cl" +
      "oud.baremetalsolution.v2.Volume\":\202\323\344\223\002-\022" +
      "+/v2/{name=projects/*/locations/*/volume" +
      "s/*}\332A\004name\022\334\001\n\014UpdateVolume\0226.google.cl" +
      "oud.baremetalsolution.v2.UpdateVolumeReq" +
      "uest\032\035.google.longrunning.Operation\"u\202\323\344" +
      "\223\002<22/v2/{volume.name=projects/*/locatio" +
      "ns/*/volumes/*}:\006volume\332A\022volume,update_" +
      "mask\312A\033\n\006Volume\022\021OperationMetadata\022\326\001\n\014R" +
      "esizeVolume\0226.google.cloud.baremetalsolu" +
      "tion.v2.ResizeVolumeRequest\032\035.google.lon" +
      "grunning.Operation\"o\202\323\344\223\0029\"4/v2/{volume=" +
      "projects/*/locations/*/volumes/*}:resize" +
      ":\001*\332A\017volume,size_gib\312A\033\n\006Volume\022\021Operat" +
      "ionMetadata\022\276\001\n\014ListNetworks\0226.google.cl" +
      "oud.baremetalsolution.v2.ListNetworksReq" +
      "uest\0327.google.cloud.baremetalsolution.v2" +
      ".ListNetworksResponse\"=\202\323\344\223\002.\022,/v2/{pare" +
      "nt=projects/*/locations/*}/networks\332A\006pa" +
      "rent\022\337\001\n\020ListNetworkUsage\022:.google.cloud" +
      ".baremetalsolution.v2.ListNetworkUsageRe" +
      "quest\032;.google.cloud.baremetalsolution.v" +
      "2.ListNetworkUsageResponse\"R\202\323\344\223\002A\022?/v2/" +
      "{location=projects/*/locations/*}/networ" +
      "ks:listNetworkUsage\332A\010location\022\253\001\n\nGetNe" +
      "twork\0224.google.cloud.baremetalsolution.v" +
      "2.GetNetworkRequest\032*.google.cloud.barem" +
      "etalsolution.v2.Network\";\202\323\344\223\002.\022,/v2/{na" +
      "me=projects/*/locations/*/networks/*}\332A\004" +
      "name\022\343\001\n\rUpdateNetwork\0227.google.cloud.ba" +
      "remetalsolution.v2.UpdateNetworkRequest\032" +
      "\035.google.longrunning.Operation\"z\202\323\344\223\002?24" +
      "/v2/{network.name=projects/*/locations/*" +
      "/networks/*}:\007network\332A\023network,update_m" +
      "ask\312A\034\n\007Network\022\021OperationMetadata\022\245\001\n\006G" +
      "etLun\0220.google.cloud.baremetalsolution.v" +
      "2.GetLunRequest\032&.google.cloud.baremetal" +
      "solution.v2.Lun\"A\202\323\344\223\0024\0222/v2/{name=proje" +
      "cts/*/locations/*/volumes/*/luns/*}\332A\004na" +
      "me\022\270\001\n\010ListLuns\0222.google.cloud.baremetal" +
      "solution.v2.ListLunsRequest\0323.google.clo" +
      "ud.baremetalsolution.v2.ListLunsResponse" +
      "\"C\202\323\344\223\0024\0222/v2/{parent=projects/*/locatio" +
      "ns/*/volumes/*}/luns\332A\006parent\022\257\001\n\013GetNfs" +
      "Share\0225.google.cloud.baremetalsolution.v" +
      "2.GetNfsShareRequest\032+.google.cloud.bare" +
      "metalsolution.v2.NfsShare\"<\202\323\344\223\002/\022-/v2/{" +
      "name=projects/*/locations/*/nfsShares/*}" +
      "\332A\004name\022\302\001\n\rListNfsShares\0227.google.cloud" +
      ".baremetalsolution.v2.ListNfsSharesReque" +
      "st\0328.google.cloud.baremetalsolution.v2.L" +
      "istNfsSharesResponse\">\202\323\344\223\002/\022-/v2/{paren" +
      "t=projects/*/locations/*}/nfsShares\332A\006pa" +
      "rent\022\356\001\n\016UpdateNfsShare\0228.google.cloud.b" +
      "aremetalsolution.v2.UpdateNfsShareReques" +
      "t\032\035.google.longrunning.Operation\"\202\001\202\323\344\223\002" +
      "D27/v2/{nfs_share.name=projects/*/locati" +
      "ons/*/nfsShares/*}:\tnfs_share\332A\025nfs_shar" +
      "e,update_mask\312A\035\n\010NfsShare\022\021OperationMet" +
      "adata\032T\312A baremetalsolution.googleapis.c" +
      "om\322A.https://www.googleapis.com/auth/clo" +
      "ud-platformB\205\002\n%com.google.cloud.baremet" +
      "alsolution.v2B\026BareMetalSolutionProtoP\001Z" +
      "Scloud.google.com/go/baremetalsolution/a" +
      "piv2/baremetalsolutionpb;baremetalsoluti" +
      "onpb\252\002!Google.Cloud.BareMetalSolution.V2" +
      "\312\002!Google\\Cloud\\BareMetalSolution\\V2\352\002$G" +
      "oogle::Cloud::BareMetalSolution::V2b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.cloud.baremetalsolution.v2.InstanceProto.getDescriptor(),
          com.google.cloud.baremetalsolution.v2.LunProto.getDescriptor(),
          com.google.cloud.baremetalsolution.v2.NetworkProto.getDescriptor(),
          com.google.cloud.baremetalsolution.v2.NfsShareProto.getDescriptor(),
          com.google.cloud.baremetalsolution.v2.VolumeProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_descriptor,
        new java.lang.String[] { "CreateTime", "EndTime", "Target", "Verb", "StatusMessage", "RequestedCancellation", "ApiVersion", });
    internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.InstanceProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.LunProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.NetworkProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.NfsShareProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.VolumeProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

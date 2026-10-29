.class public final Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Luq0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Luq0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00060\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "com/usercentrics/sdk/services/tcf/interfaces/TCFVendor.$serializer",
        "Luq0;",
        "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;",
        "<init>",
        "()V",
        "",
        "Lkotlinx/serialization/KSerializer;",
        "childSerializers",
        "()[Lkotlinx/serialization/KSerializer;",
        "Lkotlinx/serialization/encoding/Decoder;",
        "decoder",
        "deserialize",
        "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;",
        "Lkotlinx/serialization/encoding/Encoder;",
        "encoder",
        "value",
        "",
        "serialize",
        "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;)V",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "getDescriptor",
        "()Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "descriptor",
        "usercentrics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$$serializer;->INSTANCE:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$$serializer;

    .line 7
    .line 8
    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 9
    .line 10
    const-string v2, "com.usercentrics.sdk.services.tcf.interfaces.TCFVendor"

    .line 11
    .line 12
    const/16 v3, 0x17

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Luq0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "consent"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "features"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "flexiblePurposes"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "id"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "legitimateInterestConsent"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "legitimateInterestPurposes"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "name"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "policyUrl"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "purposes"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "restrictions"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "specialFeatures"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string v0, "specialPurposes"

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const-string v0, "showConsentToggle"

    .line 79
    .line 80
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    const-string v0, "showLegitimateInterestToggle"

    .line 84
    .line 85
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 86
    .line 87
    .line 88
    const-string v0, "cookieMaxAgeSeconds"

    .line 89
    .line 90
    const/4 v3, 0x1

    .line 91
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 92
    .line 93
    .line 94
    const-string v0, "usesNonCookieAccess"

    .line 95
    .line 96
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 97
    .line 98
    .line 99
    const-string v0, "deviceStorageDisclosureUrl"

    .line 100
    .line 101
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 102
    .line 103
    .line 104
    const-string v0, "usesCookies"

    .line 105
    .line 106
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    const-string v0, "cookieRefresh"

    .line 110
    .line 111
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 112
    .line 113
    .line 114
    const-string v0, "dataSharedOutsideEU"

    .line 115
    .line 116
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 117
    .line 118
    .line 119
    const-string v0, "dataRetention"

    .line 120
    .line 121
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 122
    .line 123
    .line 124
    const-string v0, "dataCategories"

    .line 125
    .line 126
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 127
    .line 128
    .line 129
    const-string v0, "vendorUrls"

    .line 130
    .line 131
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 132
    .line 133
    .line 134
    sput-object v1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 135
    .line 136
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public childSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lkotlinx/serialization/KSerializer;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->x:[Lkotlinx/serialization/KSerializer;

    .line 2
    .line 3
    sget-object v1, Lfk;->a:Lfk;

    .line 4
    .line 5
    invoke-static {v1}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/4 v3, 0x1

    .line 10
    aget-object v4, v0, v3

    .line 11
    .line 12
    const/4 v5, 0x2

    .line 13
    aget-object v6, v0, v5

    .line 14
    .line 15
    invoke-static {v1}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    const/4 v8, 0x5

    .line 20
    aget-object v9, v0, v8

    .line 21
    .line 22
    sget-object v10, Lvh2;->a:Lvh2;

    .line 23
    .line 24
    const/16 v11, 0x8

    .line 25
    .line 26
    aget-object v12, v0, v11

    .line 27
    .line 28
    const/16 v13, 0x9

    .line 29
    .line 30
    aget-object v14, v0, v13

    .line 31
    .line 32
    const/16 v15, 0xa

    .line 33
    .line 34
    aget-object v16, v0, v15

    .line 35
    .line 36
    const/16 v17, 0xb

    .line 37
    .line 38
    aget-object v18, v0, v17

    .line 39
    .line 40
    sget-object v19, Lo90;->a:Lo90;

    .line 41
    .line 42
    invoke-static/range {v19 .. v19}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 43
    .line 44
    .line 45
    move-result-object v19

    .line 46
    invoke-static {v10}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 47
    .line 48
    .line 49
    move-result-object v20

    .line 50
    invoke-static {v1}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 51
    .line 52
    .line 53
    move-result-object v21

    .line 54
    invoke-static {v1}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 55
    .line 56
    .line 57
    move-result-object v22

    .line 58
    sget-object v23, Lcom/usercentrics/tcf/core/model/gvl/DataRetention$$serializer;->INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/DataRetention$$serializer;

    .line 59
    .line 60
    invoke-static/range {v23 .. v23}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 61
    .line 62
    .line 63
    move-result-object v23

    .line 64
    const/16 v24, 0x15

    .line 65
    .line 66
    aget-object v25, v0, v24

    .line 67
    .line 68
    const/16 v26, 0x16

    .line 69
    .line 70
    aget-object v0, v0, v26

    .line 71
    .line 72
    move/from16 p0, v3

    .line 73
    .line 74
    const/16 v3, 0x17

    .line 75
    .line 76
    new-array v3, v3, [Lkotlinx/serialization/KSerializer;

    .line 77
    .line 78
    const/16 v27, 0x0

    .line 79
    .line 80
    aput-object v2, v3, v27

    .line 81
    .line 82
    aput-object v4, v3, p0

    .line 83
    .line 84
    aput-object v6, v3, v5

    .line 85
    .line 86
    sget-object v2, Laz0;->a:Laz0;

    .line 87
    .line 88
    const/4 v4, 0x3

    .line 89
    aput-object v2, v3, v4

    .line 90
    .line 91
    const/4 v2, 0x4

    .line 92
    aput-object v7, v3, v2

    .line 93
    .line 94
    aput-object v9, v3, v8

    .line 95
    .line 96
    const/4 v2, 0x6

    .line 97
    aput-object v10, v3, v2

    .line 98
    .line 99
    const/4 v2, 0x7

    .line 100
    aput-object v10, v3, v2

    .line 101
    .line 102
    aput-object v12, v3, v11

    .line 103
    .line 104
    aput-object v14, v3, v13

    .line 105
    .line 106
    aput-object v16, v3, v15

    .line 107
    .line 108
    aput-object v18, v3, v17

    .line 109
    .line 110
    const/16 v2, 0xc

    .line 111
    .line 112
    aput-object v1, v3, v2

    .line 113
    .line 114
    const/16 v2, 0xd

    .line 115
    .line 116
    aput-object v1, v3, v2

    .line 117
    .line 118
    const/16 v2, 0xe

    .line 119
    .line 120
    aput-object v19, v3, v2

    .line 121
    .line 122
    const/16 v2, 0xf

    .line 123
    .line 124
    aput-object v1, v3, v2

    .line 125
    .line 126
    const/16 v2, 0x10

    .line 127
    .line 128
    aput-object v20, v3, v2

    .line 129
    .line 130
    const/16 v2, 0x11

    .line 131
    .line 132
    aput-object v1, v3, v2

    .line 133
    .line 134
    const/16 v1, 0x12

    .line 135
    .line 136
    aput-object v21, v3, v1

    .line 137
    .line 138
    const/16 v1, 0x13

    .line 139
    .line 140
    aput-object v22, v3, v1

    .line 141
    .line 142
    const/16 v1, 0x14

    .line 143
    .line 144
    aput-object v23, v3, v1

    .line 145
    .line 146
    aput-object v25, v3, v24

    .line 147
    .line 148
    aput-object v0, v3, v26

    .line 149
    .line 150
    return-object v3
.end method

.method public deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;
    .locals 32

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p0 .. p0}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/Decoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lky;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->x:[Lkotlinx/serialization/KSerializer;

    .line 15
    .line 16
    move-object/from16 v18, v2

    .line 17
    .line 18
    const/16 p0, 0x0

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v9, 0x0

    .line 28
    const/4 v10, 0x0

    .line 29
    const/4 v11, 0x0

    .line 30
    const/4 v12, 0x0

    .line 31
    const/4 v13, 0x0

    .line 32
    const/4 v14, 0x0

    .line 33
    const/4 v15, 0x0

    .line 34
    const/16 v16, 0x0

    .line 35
    .line 36
    const/16 v17, 0x1

    .line 37
    .line 38
    const/16 v19, 0x1

    .line 39
    .line 40
    const/16 v20, 0x0

    .line 41
    .line 42
    const/16 v21, 0x0

    .line 43
    .line 44
    const/16 v22, 0x0

    .line 45
    .line 46
    const/16 v23, 0x0

    .line 47
    .line 48
    const/16 v24, 0x0

    .line 49
    .line 50
    const/16 v25, 0x0

    .line 51
    .line 52
    const/16 v26, 0x0

    .line 53
    .line 54
    const/16 v27, 0x0

    .line 55
    .line 56
    const/16 v28, 0x0

    .line 57
    .line 58
    :goto_0
    if-eqz v19, :cond_0

    .line 59
    .line 60
    invoke-interface {v1, v0}, Lky;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 61
    .line 62
    .line 63
    move-result v29

    .line 64
    packed-switch v29, :pswitch_data_0

    .line 65
    .line 66
    .line 67
    invoke-static/range {v29 .. v29}, Ln4;->e(I)V

    .line 68
    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_0
    move-object/from16 v29, v13

    .line 72
    .line 73
    const/16 v13, 0x16

    .line 74
    .line 75
    move-object/from16 v30, v14

    .line 76
    .line 77
    aget-object v14, v18, v13

    .line 78
    .line 79
    invoke-interface {v1, v0, v13, v14, v11}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    check-cast v11, Ljava/util/List;

    .line 84
    .line 85
    const/high16 v13, 0x400000

    .line 86
    .line 87
    :goto_1
    or-int/2addr v8, v13

    .line 88
    :goto_2
    move-object/from16 v13, v29

    .line 89
    .line 90
    move-object/from16 v14, v30

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :pswitch_1
    move-object/from16 v29, v13

    .line 94
    .line 95
    move-object/from16 v30, v14

    .line 96
    .line 97
    const/16 v13, 0x15

    .line 98
    .line 99
    aget-object v14, v18, v13

    .line 100
    .line 101
    invoke-interface {v1, v0, v13, v14, v10}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    check-cast v10, Ljava/util/List;

    .line 106
    .line 107
    const/high16 v13, 0x200000

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :pswitch_2
    move-object/from16 v29, v13

    .line 111
    .line 112
    move-object/from16 v30, v14

    .line 113
    .line 114
    const/16 v13, 0x14

    .line 115
    .line 116
    sget-object v14, Lcom/usercentrics/tcf/core/model/gvl/DataRetention$$serializer;->INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/DataRetention$$serializer;

    .line 117
    .line 118
    invoke-interface {v1, v0, v13, v14, v9}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    check-cast v9, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;

    .line 123
    .line 124
    const/high16 v13, 0x100000

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :pswitch_3
    move-object/from16 v29, v13

    .line 128
    .line 129
    move-object/from16 v30, v14

    .line 130
    .line 131
    const/16 v13, 0x13

    .line 132
    .line 133
    sget-object v14, Lfk;->a:Lfk;

    .line 134
    .line 135
    invoke-interface {v1, v0, v13, v14, v15}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    move-object v15, v13

    .line 140
    check-cast v15, Ljava/lang/Boolean;

    .line 141
    .line 142
    const/high16 v13, 0x80000

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :pswitch_4
    move-object/from16 v29, v13

    .line 146
    .line 147
    move-object/from16 v30, v14

    .line 148
    .line 149
    sget-object v13, Lfk;->a:Lfk;

    .line 150
    .line 151
    const/16 v14, 0x12

    .line 152
    .line 153
    invoke-interface {v1, v0, v14, v13, v12}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v12

    .line 157
    check-cast v12, Ljava/lang/Boolean;

    .line 158
    .line 159
    const/high16 v13, 0x40000

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :pswitch_5
    move-object/from16 v29, v13

    .line 163
    .line 164
    move-object/from16 v30, v14

    .line 165
    .line 166
    const/16 v13, 0x11

    .line 167
    .line 168
    invoke-interface {v1, v0, v13}, Lky;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 169
    .line 170
    .line 171
    move-result v26

    .line 172
    const/high16 v13, 0x20000

    .line 173
    .line 174
    :goto_3
    or-int/2addr v8, v13

    .line 175
    :goto_4
    move-object/from16 v13, v29

    .line 176
    .line 177
    goto :goto_0

    .line 178
    :pswitch_6
    move-object/from16 v29, v13

    .line 179
    .line 180
    move-object/from16 v30, v14

    .line 181
    .line 182
    sget-object v13, Lvh2;->a:Lvh2;

    .line 183
    .line 184
    const/16 v14, 0x10

    .line 185
    .line 186
    invoke-interface {v1, v0, v14, v13, v6}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    check-cast v6, Ljava/lang/String;

    .line 191
    .line 192
    const/high16 v13, 0x10000

    .line 193
    .line 194
    goto :goto_1

    .line 195
    :pswitch_7
    move-object/from16 v29, v13

    .line 196
    .line 197
    move-object/from16 v30, v14

    .line 198
    .line 199
    const/16 v13, 0xf

    .line 200
    .line 201
    invoke-interface {v1, v0, v13}, Lky;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 202
    .line 203
    .line 204
    move-result v24

    .line 205
    const v13, 0x8000

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :pswitch_8
    move-object/from16 v29, v13

    .line 210
    .line 211
    move-object/from16 v30, v14

    .line 212
    .line 213
    sget-object v13, Lo90;->a:Lo90;

    .line 214
    .line 215
    const/16 v14, 0xe

    .line 216
    .line 217
    invoke-interface {v1, v0, v14, v13, v2}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    check-cast v2, Ljava/lang/Double;

    .line 222
    .line 223
    or-int/lit16 v8, v8, 0x4000

    .line 224
    .line 225
    goto/16 :goto_2

    .line 226
    .line 227
    :pswitch_9
    move-object/from16 v29, v13

    .line 228
    .line 229
    move-object/from16 v30, v14

    .line 230
    .line 231
    const/16 v13, 0xd

    .line 232
    .line 233
    invoke-interface {v1, v0, v13}, Lky;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 234
    .line 235
    .line 236
    move-result v22

    .line 237
    or-int/lit16 v8, v8, 0x2000

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :pswitch_a
    move-object/from16 v29, v13

    .line 241
    .line 242
    move-object/from16 v30, v14

    .line 243
    .line 244
    const/16 v13, 0xc

    .line 245
    .line 246
    invoke-interface {v1, v0, v13}, Lky;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 247
    .line 248
    .line 249
    move-result v21

    .line 250
    or-int/lit16 v8, v8, 0x1000

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :pswitch_b
    move-object/from16 v29, v13

    .line 254
    .line 255
    move-object/from16 v30, v14

    .line 256
    .line 257
    const/16 v13, 0xb

    .line 258
    .line 259
    aget-object v14, v18, v13

    .line 260
    .line 261
    invoke-interface {v1, v0, v13, v14, v3}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    check-cast v3, Ljava/util/List;

    .line 266
    .line 267
    or-int/lit16 v8, v8, 0x800

    .line 268
    .line 269
    goto/16 :goto_2

    .line 270
    .line 271
    :pswitch_c
    move-object/from16 v29, v13

    .line 272
    .line 273
    move-object/from16 v30, v14

    .line 274
    .line 275
    const/16 v13, 0xa

    .line 276
    .line 277
    aget-object v14, v18, v13

    .line 278
    .line 279
    invoke-interface {v1, v0, v13, v14, v4}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    check-cast v4, Ljava/util/List;

    .line 284
    .line 285
    or-int/lit16 v8, v8, 0x400

    .line 286
    .line 287
    goto/16 :goto_2

    .line 288
    .line 289
    :pswitch_d
    move-object/from16 v29, v13

    .line 290
    .line 291
    move-object/from16 v30, v14

    .line 292
    .line 293
    const/16 v13, 0x9

    .line 294
    .line 295
    aget-object v14, v18, v13

    .line 296
    .line 297
    invoke-interface {v1, v0, v13, v14, v5}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    check-cast v5, Ljava/util/List;

    .line 302
    .line 303
    or-int/lit16 v8, v8, 0x200

    .line 304
    .line 305
    goto/16 :goto_2

    .line 306
    .line 307
    :pswitch_e
    move-object/from16 v29, v13

    .line 308
    .line 309
    move-object/from16 v30, v14

    .line 310
    .line 311
    const/16 v13, 0x8

    .line 312
    .line 313
    aget-object v14, v18, v13

    .line 314
    .line 315
    invoke-interface {v1, v0, v13, v14, v7}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    check-cast v7, Ljava/util/List;

    .line 320
    .line 321
    or-int/lit16 v8, v8, 0x100

    .line 322
    .line 323
    goto/16 :goto_2

    .line 324
    .line 325
    :pswitch_f
    move-object/from16 v29, v13

    .line 326
    .line 327
    move-object/from16 v30, v14

    .line 328
    .line 329
    const/4 v13, 0x7

    .line 330
    invoke-interface {v1, v0, v13}, Lky;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v16

    .line 334
    or-int/lit16 v8, v8, 0x80

    .line 335
    .line 336
    goto/16 :goto_4

    .line 337
    .line 338
    :pswitch_10
    move-object/from16 v29, v13

    .line 339
    .line 340
    move-object/from16 v30, v14

    .line 341
    .line 342
    const/4 v13, 0x6

    .line 343
    invoke-interface {v1, v0, v13}, Lky;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v23

    .line 347
    or-int/lit8 v8, v8, 0x40

    .line 348
    .line 349
    goto/16 :goto_4

    .line 350
    .line 351
    :pswitch_11
    move-object/from16 v29, v13

    .line 352
    .line 353
    move-object/from16 v30, v14

    .line 354
    .line 355
    const/4 v13, 0x5

    .line 356
    aget-object v14, v18, v13

    .line 357
    .line 358
    move-object/from16 v31, v2

    .line 359
    .line 360
    move-object/from16 v2, v30

    .line 361
    .line 362
    invoke-interface {v1, v0, v13, v14, v2}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    move-object v14, v2

    .line 367
    check-cast v14, Ljava/util/List;

    .line 368
    .line 369
    or-int/lit8 v8, v8, 0x20

    .line 370
    .line 371
    move-object/from16 v13, v29

    .line 372
    .line 373
    :goto_5
    move-object/from16 v2, v31

    .line 374
    .line 375
    goto/16 :goto_0

    .line 376
    .line 377
    :pswitch_12
    move-object/from16 v31, v2

    .line 378
    .line 379
    move-object/from16 v29, v13

    .line 380
    .line 381
    move-object v2, v14

    .line 382
    sget-object v13, Lfk;->a:Lfk;

    .line 383
    .line 384
    const/4 v14, 0x4

    .line 385
    move-object/from16 v30, v2

    .line 386
    .line 387
    move-object/from16 v2, v29

    .line 388
    .line 389
    invoke-interface {v1, v0, v14, v13, v2}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    move-object v13, v2

    .line 394
    check-cast v13, Ljava/lang/Boolean;

    .line 395
    .line 396
    or-int/lit8 v8, v8, 0x10

    .line 397
    .line 398
    :goto_6
    move-object/from16 v14, v30

    .line 399
    .line 400
    goto :goto_5

    .line 401
    :pswitch_13
    move-object/from16 v31, v2

    .line 402
    .line 403
    move-object v2, v13

    .line 404
    move-object/from16 v30, v14

    .line 405
    .line 406
    const/4 v13, 0x3

    .line 407
    invoke-interface {v1, v0, v13}, Lky;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    .line 408
    .line 409
    .line 410
    move-result v20

    .line 411
    or-int/lit8 v8, v8, 0x8

    .line 412
    .line 413
    move-object v13, v2

    .line 414
    goto :goto_5

    .line 415
    :pswitch_14
    move-object/from16 v31, v2

    .line 416
    .line 417
    move-object v2, v13

    .line 418
    move-object/from16 v30, v14

    .line 419
    .line 420
    const/4 v13, 0x2

    .line 421
    aget-object v14, v18, v13

    .line 422
    .line 423
    move-object/from16 v29, v2

    .line 424
    .line 425
    move-object/from16 v2, v28

    .line 426
    .line 427
    invoke-interface {v1, v0, v13, v14, v2}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    move-object/from16 v28, v2

    .line 432
    .line 433
    check-cast v28, Ljava/util/List;

    .line 434
    .line 435
    or-int/lit8 v8, v8, 0x4

    .line 436
    .line 437
    move-object/from16 v13, v29

    .line 438
    .line 439
    goto :goto_6

    .line 440
    :pswitch_15
    move-object/from16 v31, v2

    .line 441
    .line 442
    move-object/from16 v29, v13

    .line 443
    .line 444
    move-object/from16 v30, v14

    .line 445
    .line 446
    move-object/from16 v2, v28

    .line 447
    .line 448
    aget-object v13, v18, v17

    .line 449
    .line 450
    move/from16 v14, v17

    .line 451
    .line 452
    move-object/from16 v17, v2

    .line 453
    .line 454
    move v2, v14

    .line 455
    move-object/from16 v14, v27

    .line 456
    .line 457
    invoke-interface {v1, v0, v2, v13, v14}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v13

    .line 461
    move-object/from16 v27, v13

    .line 462
    .line 463
    check-cast v27, Ljava/util/List;

    .line 464
    .line 465
    or-int/lit8 v8, v8, 0x2

    .line 466
    .line 467
    move-object/from16 v28, v17

    .line 468
    .line 469
    move-object/from16 v13, v29

    .line 470
    .line 471
    move-object/from16 v14, v30

    .line 472
    .line 473
    move/from16 v17, v2

    .line 474
    .line 475
    goto :goto_5

    .line 476
    :pswitch_16
    move-object/from16 v31, v2

    .line 477
    .line 478
    move-object/from16 v29, v13

    .line 479
    .line 480
    move-object/from16 v30, v14

    .line 481
    .line 482
    move/from16 v2, v17

    .line 483
    .line 484
    move-object/from16 v14, v27

    .line 485
    .line 486
    move-object/from16 v17, v28

    .line 487
    .line 488
    sget-object v13, Lfk;->a:Lfk;

    .line 489
    .line 490
    move-object/from16 v2, v25

    .line 491
    .line 492
    move-object/from16 v25, v3

    .line 493
    .line 494
    const/4 v3, 0x0

    .line 495
    invoke-interface {v1, v0, v3, v13, v2}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    check-cast v2, Ljava/lang/Boolean;

    .line 500
    .line 501
    or-int/lit8 v8, v8, 0x1

    .line 502
    .line 503
    move-object/from16 v3, v25

    .line 504
    .line 505
    move-object/from16 v13, v29

    .line 506
    .line 507
    :goto_7
    move-object/from16 v14, v30

    .line 508
    .line 509
    const/16 v17, 0x1

    .line 510
    .line 511
    move-object/from16 v25, v2

    .line 512
    .line 513
    goto/16 :goto_5

    .line 514
    .line 515
    :pswitch_17
    move-object/from16 v31, v2

    .line 516
    .line 517
    move-object/from16 v29, v13

    .line 518
    .line 519
    move-object/from16 v30, v14

    .line 520
    .line 521
    move-object/from16 v2, v25

    .line 522
    .line 523
    move-object/from16 v14, v27

    .line 524
    .line 525
    move-object/from16 v17, v28

    .line 526
    .line 527
    move-object/from16 v25, v3

    .line 528
    .line 529
    const/4 v3, 0x0

    .line 530
    move/from16 v19, v3

    .line 531
    .line 532
    move-object/from16 v3, v25

    .line 533
    .line 534
    goto :goto_7

    .line 535
    :cond_0
    move-object/from16 v31, v2

    .line 536
    .line 537
    move-object/from16 v29, v13

    .line 538
    .line 539
    move-object/from16 v30, v14

    .line 540
    .line 541
    move-object/from16 v2, v25

    .line 542
    .line 543
    move-object/from16 v14, v27

    .line 544
    .line 545
    move-object/from16 v17, v28

    .line 546
    .line 547
    move-object/from16 v25, v3

    .line 548
    .line 549
    invoke-interface {v1, v0}, Lky;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 550
    .line 551
    .line 552
    move-object/from16 v28, v15

    .line 553
    .line 554
    move-object/from16 v15, v23

    .line 555
    .line 556
    move-object/from16 v23, v31

    .line 557
    .line 558
    move-object/from16 v31, v11

    .line 559
    .line 560
    move-object/from16 v11, v17

    .line 561
    .line 562
    move-object/from16 v17, v7

    .line 563
    .line 564
    new-instance v7, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 565
    .line 566
    move-object/from16 v13, v30

    .line 567
    .line 568
    move-object/from16 v30, v10

    .line 569
    .line 570
    move-object v10, v14

    .line 571
    move-object v14, v13

    .line 572
    move-object/from16 v19, v4

    .line 573
    .line 574
    move-object/from16 v18, v5

    .line 575
    .line 576
    move-object/from16 v27, v12

    .line 577
    .line 578
    move/from16 v12, v20

    .line 579
    .line 580
    move-object/from16 v20, v25

    .line 581
    .line 582
    move-object/from16 v13, v29

    .line 583
    .line 584
    move-object/from16 v25, v6

    .line 585
    .line 586
    move-object/from16 v29, v9

    .line 587
    .line 588
    move-object v9, v2

    .line 589
    invoke-direct/range {v7 .. v31}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;-><init>(ILjava/lang/Boolean;Ljava/util/List;Ljava/util/List;ILjava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZLjava/lang/Double;ZLjava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/usercentrics/tcf/core/model/gvl/DataRetention;Ljava/util/List;Ljava/util/List;)V

    .line 590
    .line 591
    .line 592
    return-object v7

    .line 593
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 0

    .line 593
    invoke-virtual {p0, p1}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$$serializer;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    move-result-object p0

    return-object p0
.end method

.method public getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 0

    .line 1
    sget-object p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 2
    .line 3
    return-object p0
.end method

.method public serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p1, p0}, Lkotlinx/serialization/encoding/Encoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lly;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->x:[Lkotlinx/serialization/KSerializer;

    .line 16
    .line 17
    sget-object v1, Lfk;->a:Lfk;

    .line 18
    .line 19
    iget-object v2, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->a:Ljava/lang/Boolean;

    .line 20
    .line 21
    iget-object v3, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->u:Lcom/usercentrics/tcf/core/model/gvl/DataRetention;

    .line 22
    .line 23
    iget-object v4, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->t:Ljava/lang/Boolean;

    .line 24
    .line 25
    iget-object v5, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->s:Ljava/lang/Boolean;

    .line 26
    .line 27
    iget-boolean v6, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->r:Z

    .line 28
    .line 29
    iget-object v7, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->q:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v8, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->o:Ljava/lang/Double;

    .line 32
    .line 33
    const/4 v9, 0x0

    .line 34
    invoke-interface {p1, p0, v9, v1, v2}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    aget-object v9, v0, v2

    .line 39
    .line 40
    iget-object v10, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->b:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {p1, p0, v2, v9, v10}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const/4 v2, 0x2

    .line 46
    aget-object v9, v0, v2

    .line 47
    .line 48
    iget-object v10, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->c:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {p1, p0, v2, v9, v10}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    const/4 v2, 0x3

    .line 54
    iget v9, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->d:I

    .line 55
    .line 56
    invoke-interface {p1, v2, v9, p0}, Lly;->l(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 57
    .line 58
    .line 59
    const/4 v2, 0x4

    .line 60
    iget-object v9, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->e:Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-interface {p1, p0, v2, v1, v9}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    const/4 v2, 0x5

    .line 66
    aget-object v9, v0, v2

    .line 67
    .line 68
    iget-object v10, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->f:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {p1, p0, v2, v9, v10}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    const/4 v2, 0x6

    .line 74
    iget-object v9, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->g:Ljava/lang/String;

    .line 75
    .line 76
    invoke-interface {p1, p0, v2, v9}, Lly;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/4 v2, 0x7

    .line 80
    iget-object v9, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->h:Ljava/lang/String;

    .line 81
    .line 82
    invoke-interface {p1, p0, v2, v9}, Lly;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const/16 v2, 0x8

    .line 86
    .line 87
    aget-object v9, v0, v2

    .line 88
    .line 89
    iget-object v10, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->i:Ljava/util/List;

    .line 90
    .line 91
    invoke-interface {p1, p0, v2, v9, v10}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    const/16 v2, 0x9

    .line 95
    .line 96
    aget-object v9, v0, v2

    .line 97
    .line 98
    iget-object v10, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->j:Ljava/util/List;

    .line 99
    .line 100
    invoke-interface {p1, p0, v2, v9, v10}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    const/16 v2, 0xa

    .line 104
    .line 105
    aget-object v9, v0, v2

    .line 106
    .line 107
    iget-object v10, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->k:Ljava/util/List;

    .line 108
    .line 109
    invoke-interface {p1, p0, v2, v9, v10}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    const/16 v2, 0xb

    .line 113
    .line 114
    aget-object v9, v0, v2

    .line 115
    .line 116
    iget-object v10, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->l:Ljava/util/List;

    .line 117
    .line 118
    invoke-interface {p1, p0, v2, v9, v10}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    const/16 v2, 0xc

    .line 122
    .line 123
    iget-boolean v9, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->m:Z

    .line 124
    .line 125
    invoke-interface {p1, p0, v2, v9}, Lly;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 126
    .line 127
    .line 128
    const/16 v2, 0xd

    .line 129
    .line 130
    iget-boolean v9, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->n:Z

    .line 131
    .line 132
    invoke-interface {p1, p0, v2, v9}, Lly;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 133
    .line 134
    .line 135
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_0

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_0
    if-eqz v8, :cond_1

    .line 143
    .line 144
    :goto_0
    sget-object v2, Lo90;->a:Lo90;

    .line 145
    .line 146
    const/16 v9, 0xe

    .line 147
    .line 148
    invoke-interface {p1, p0, v9, v2, v8}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :cond_1
    const/16 v2, 0xf

    .line 152
    .line 153
    iget-boolean v8, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->p:Z

    .line 154
    .line 155
    invoke-interface {p1, p0, v2, v8}, Lly;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 156
    .line 157
    .line 158
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-eqz v2, :cond_2

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_2
    if-eqz v7, :cond_3

    .line 166
    .line 167
    :goto_1
    sget-object v2, Lvh2;->a:Lvh2;

    .line 168
    .line 169
    const/16 v8, 0x10

    .line 170
    .line 171
    invoke-interface {p1, p0, v8, v2, v7}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :cond_3
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    if-eqz v2, :cond_4

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_4
    if-eqz v6, :cond_5

    .line 182
    .line 183
    :goto_2
    const/16 v2, 0x11

    .line 184
    .line 185
    invoke-interface {p1, p0, v2, v6}, Lly;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 186
    .line 187
    .line 188
    :cond_5
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-eqz v2, :cond_6

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_6
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 196
    .line 197
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-nez v2, :cond_7

    .line 202
    .line 203
    :goto_3
    const/16 v2, 0x12

    .line 204
    .line 205
    invoke-interface {p1, p0, v2, v1, v5}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_7
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-eqz v2, :cond_8

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_8
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 216
    .line 217
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    if-nez v2, :cond_9

    .line 222
    .line 223
    :goto_4
    const/16 v2, 0x13

    .line 224
    .line 225
    invoke-interface {p1, p0, v2, v1, v4}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    :cond_9
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-eqz v1, :cond_a

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_a
    if-eqz v3, :cond_b

    .line 236
    .line 237
    :goto_5
    sget-object v1, Lcom/usercentrics/tcf/core/model/gvl/DataRetention$$serializer;->INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/DataRetention$$serializer;

    .line 238
    .line 239
    const/16 v2, 0x14

    .line 240
    .line 241
    invoke-interface {p1, p0, v2, v1, v3}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    :cond_b
    const/16 v1, 0x15

    .line 245
    .line 246
    aget-object v2, v0, v1

    .line 247
    .line 248
    iget-object v3, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->v:Ljava/util/List;

    .line 249
    .line 250
    invoke-interface {p1, p0, v1, v2, v3}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    const/16 v1, 0x16

    .line 254
    .line 255
    aget-object v0, v0, v1

    .line 256
    .line 257
    iget-object p2, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->w:Ljava/util/List;

    .line 258
    .line 259
    invoke-interface {p1, p0, v1, v0, p2}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    invoke-interface {p1, p0}, Lly;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 263
    .line 264
    .line 265
    return-void
.end method

.method public bridge synthetic serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 0

    .line 266
    check-cast p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    invoke-virtual {p0, p1, p2}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$$serializer;->serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;)V

    return-void
.end method

.method public typeParametersSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lkotlinx/serialization/KSerializer;"
        }
    .end annotation

    .line 1
    sget-object p0, Lde3;->d:[Lkotlinx/serialization/KSerializer;

    .line 2
    .line 3
    return-object p0
.end method

.class public final Lcom/usercentrics/tcf/core/model/gvl/Vendor$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Luq0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usercentrics/tcf/core/model/gvl/Vendor;
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
        "com/usercentrics/tcf/core/model/gvl/Vendor.$serializer",
        "Luq0;",
        "Lcom/usercentrics/tcf/core/model/gvl/Vendor;",
        "<init>",
        "()V",
        "",
        "Lkotlinx/serialization/KSerializer;",
        "childSerializers",
        "()[Lkotlinx/serialization/KSerializer;",
        "Lkotlinx/serialization/encoding/Decoder;",
        "decoder",
        "deserialize",
        "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/tcf/core/model/gvl/Vendor;",
        "Lkotlinx/serialization/encoding/Encoder;",
        "encoder",
        "value",
        "",
        "serialize",
        "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/tcf/core/model/gvl/Vendor;)V",
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
.field public static final INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/Vendor$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/usercentrics/tcf/core/model/gvl/Vendor$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/usercentrics/tcf/core/model/gvl/Vendor$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/tcf/core/model/gvl/Vendor$$serializer;->INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/Vendor$$serializer;

    .line 7
    .line 8
    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 9
    .line 10
    const-string v2, "com.usercentrics.tcf.core.model.gvl.Vendor"

    .line 11
    .line 12
    const/16 v3, 0x13

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Luq0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "purposes"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "legIntPurposes"

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
    const-string v0, "specialPurposes"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "features"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "specialFeatures"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "policyUrl"

    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "deletedDate"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "overflow"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "cookieMaxAgeSeconds"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "usesNonCookieAccess"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v0, "deviceStorageDisclosureUrl"

    .line 75
    .line 76
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    const-string v0, "usesCookies"

    .line 80
    .line 81
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    const-string v0, "cookieRefresh"

    .line 85
    .line 86
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    const-string v0, "id"

    .line 90
    .line 91
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 92
    .line 93
    .line 94
    const-string v0, "name"

    .line 95
    .line 96
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 97
    .line 98
    .line 99
    const-string v0, "dataRetention"

    .line 100
    .line 101
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 102
    .line 103
    .line 104
    const-string v0, "urls"

    .line 105
    .line 106
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    const-string v0, "dataDeclaration"

    .line 110
    .line 111
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 112
    .line 113
    .line 114
    sput-object v1, Lcom/usercentrics/tcf/core/model/gvl/Vendor$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 115
    .line 116
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
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lkotlinx/serialization/KSerializer;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->t:[Lkotlinx/serialization/KSerializer;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v2, v0, v1

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    aget-object v4, v0, v3

    .line 8
    .line 9
    const/4 v5, 0x2

    .line 10
    aget-object v6, v0, v5

    .line 11
    .line 12
    const/4 v7, 0x3

    .line 13
    aget-object v8, v0, v7

    .line 14
    .line 15
    const/4 v9, 0x4

    .line 16
    aget-object v10, v0, v9

    .line 17
    .line 18
    const/4 v11, 0x5

    .line 19
    aget-object v12, v0, v11

    .line 20
    .line 21
    sget-object v13, Lvh2;->a:Lvh2;

    .line 22
    .line 23
    invoke-static {v13}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 24
    .line 25
    .line 26
    move-result-object v14

    .line 27
    sget-object v15, Lcom/usercentrics/tcf/core/model/gvl/Overflow$$serializer;->INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/Overflow$$serializer;

    .line 28
    .line 29
    invoke-static {v15}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 30
    .line 31
    .line 32
    move-result-object v15

    .line 33
    sget-object v16, Lo90;->a:Lo90;

    .line 34
    .line 35
    invoke-static/range {v16 .. v16}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 36
    .line 37
    .line 38
    move-result-object v16

    .line 39
    sget-object v17, Lfk;->a:Lfk;

    .line 40
    .line 41
    invoke-static {v13}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 42
    .line 43
    .line 44
    move-result-object v18

    .line 45
    invoke-static/range {v17 .. v17}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 46
    .line 47
    .line 48
    move-result-object v19

    .line 49
    sget-object v20, Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention$$serializer;->INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention$$serializer;

    .line 50
    .line 51
    invoke-static/range {v20 .. v20}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 52
    .line 53
    .line 54
    move-result-object v20

    .line 55
    const/16 v21, 0x11

    .line 56
    .line 57
    aget-object v22, v0, v21

    .line 58
    .line 59
    invoke-static/range {v22 .. v22}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 60
    .line 61
    .line 62
    move-result-object v22

    .line 63
    const/16 v23, 0x12

    .line 64
    .line 65
    aget-object v0, v0, v23

    .line 66
    .line 67
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    move/from16 p0, v1

    .line 72
    .line 73
    const/16 v1, 0x13

    .line 74
    .line 75
    new-array v1, v1, [Lkotlinx/serialization/KSerializer;

    .line 76
    .line 77
    aput-object v2, v1, p0

    .line 78
    .line 79
    aput-object v4, v1, v3

    .line 80
    .line 81
    aput-object v6, v1, v5

    .line 82
    .line 83
    aput-object v8, v1, v7

    .line 84
    .line 85
    aput-object v10, v1, v9

    .line 86
    .line 87
    aput-object v12, v1, v11

    .line 88
    .line 89
    const/4 v2, 0x6

    .line 90
    aput-object v13, v1, v2

    .line 91
    .line 92
    const/4 v2, 0x7

    .line 93
    aput-object v14, v1, v2

    .line 94
    .line 95
    const/16 v2, 0x8

    .line 96
    .line 97
    aput-object v15, v1, v2

    .line 98
    .line 99
    const/16 v2, 0x9

    .line 100
    .line 101
    aput-object v16, v1, v2

    .line 102
    .line 103
    const/16 v2, 0xa

    .line 104
    .line 105
    aput-object v17, v1, v2

    .line 106
    .line 107
    const/16 v2, 0xb

    .line 108
    .line 109
    aput-object v18, v1, v2

    .line 110
    .line 111
    const/16 v2, 0xc

    .line 112
    .line 113
    aput-object v17, v1, v2

    .line 114
    .line 115
    const/16 v2, 0xd

    .line 116
    .line 117
    aput-object v19, v1, v2

    .line 118
    .line 119
    sget-object v2, Laz0;->a:Laz0;

    .line 120
    .line 121
    const/16 v3, 0xe

    .line 122
    .line 123
    aput-object v2, v1, v3

    .line 124
    .line 125
    const/16 v2, 0xf

    .line 126
    .line 127
    aput-object v13, v1, v2

    .line 128
    .line 129
    const/16 v2, 0x10

    .line 130
    .line 131
    aput-object v20, v1, v2

    .line 132
    .line 133
    aput-object v22, v1, v21

    .line 134
    .line 135
    aput-object v0, v1, v23

    .line 136
    .line 137
    return-object v1
.end method

.method public deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/tcf/core/model/gvl/Vendor;
    .locals 28

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p0 .. p0}, Lcom/usercentrics/tcf/core/model/gvl/Vendor$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

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
    sget-object v2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->t:[Lkotlinx/serialization/KSerializer;

    .line 15
    .line 16
    move-object/from16 v17, v2

    .line 17
    .line 18
    const/16 p0, 0x0

    .line 19
    .line 20
    const/16 p1, 0x0

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v7, 0x0

    .line 28
    const/4 v8, 0x0

    .line 29
    const/4 v9, 0x0

    .line 30
    const/4 v10, 0x0

    .line 31
    const/4 v11, 0x0

    .line 32
    const/4 v12, 0x0

    .line 33
    const/4 v13, 0x0

    .line 34
    const/4 v14, 0x0

    .line 35
    const/4 v15, 0x0

    .line 36
    const/16 v16, 0x1

    .line 37
    .line 38
    const/16 v18, 0x1

    .line 39
    .line 40
    const/16 v19, 0x0

    .line 41
    .line 42
    const/16 v20, 0x0

    .line 43
    .line 44
    const/16 v21, 0x0

    .line 45
    .line 46
    const/16 v22, 0x0

    .line 47
    .line 48
    const/16 v23, 0x0

    .line 49
    .line 50
    const/16 v24, 0x0

    .line 51
    .line 52
    :goto_0
    if-eqz v18, :cond_0

    .line 53
    .line 54
    invoke-interface {v1, v0}, Lky;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 55
    .line 56
    .line 57
    move-result v25

    .line 58
    packed-switch v25, :pswitch_data_0

    .line 59
    .line 60
    .line 61
    invoke-static/range {v25 .. v25}, Ln4;->e(I)V

    .line 62
    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_0
    move-object/from16 v25, v10

    .line 66
    .line 67
    const/16 v10, 0x12

    .line 68
    .line 69
    move-object/from16 v26, v11

    .line 70
    .line 71
    aget-object v11, v17, v10

    .line 72
    .line 73
    invoke-interface {v1, v0, v10, v11, v9}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    check-cast v9, Ljava/util/List;

    .line 78
    .line 79
    const/high16 v10, 0x40000

    .line 80
    .line 81
    :goto_1
    or-int/2addr v8, v10

    .line 82
    :goto_2
    move-object/from16 v10, v25

    .line 83
    .line 84
    move-object/from16 v11, v26

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :pswitch_1
    move-object/from16 v25, v10

    .line 88
    .line 89
    move-object/from16 v26, v11

    .line 90
    .line 91
    const/16 v10, 0x11

    .line 92
    .line 93
    aget-object v11, v17, v10

    .line 94
    .line 95
    invoke-interface {v1, v0, v10, v11, v15}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    move-object v15, v10

    .line 100
    check-cast v15, Ljava/util/List;

    .line 101
    .line 102
    const/high16 v10, 0x20000

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :pswitch_2
    move-object/from16 v25, v10

    .line 106
    .line 107
    move-object/from16 v26, v11

    .line 108
    .line 109
    sget-object v10, Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention$$serializer;->INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention$$serializer;

    .line 110
    .line 111
    const/16 v11, 0x10

    .line 112
    .line 113
    invoke-interface {v1, v0, v11, v10, v6}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    check-cast v6, Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention;

    .line 118
    .line 119
    const/high16 v10, 0x10000

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :pswitch_3
    move-object/from16 v25, v10

    .line 123
    .line 124
    move-object/from16 v26, v11

    .line 125
    .line 126
    const/16 v10, 0xf

    .line 127
    .line 128
    invoke-interface {v1, v0, v10}, Lky;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v24

    .line 132
    const v10, 0x8000

    .line 133
    .line 134
    .line 135
    or-int/2addr v8, v10

    .line 136
    :goto_3
    move-object/from16 v10, v25

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :pswitch_4
    move-object/from16 v25, v10

    .line 140
    .line 141
    move-object/from16 v26, v11

    .line 142
    .line 143
    const/16 v10, 0xe

    .line 144
    .line 145
    invoke-interface {v1, v0, v10}, Lky;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    .line 146
    .line 147
    .line 148
    move-result v23

    .line 149
    or-int/lit16 v8, v8, 0x4000

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :pswitch_5
    move-object/from16 v25, v10

    .line 153
    .line 154
    move-object/from16 v26, v11

    .line 155
    .line 156
    sget-object v10, Lfk;->a:Lfk;

    .line 157
    .line 158
    const/16 v11, 0xd

    .line 159
    .line 160
    invoke-interface {v1, v0, v11, v10, v2}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, Ljava/lang/Boolean;

    .line 165
    .line 166
    or-int/lit16 v8, v8, 0x2000

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :pswitch_6
    move-object/from16 v25, v10

    .line 170
    .line 171
    move-object/from16 v26, v11

    .line 172
    .line 173
    const/16 v10, 0xc

    .line 174
    .line 175
    invoke-interface {v1, v0, v10}, Lky;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 176
    .line 177
    .line 178
    move-result v21

    .line 179
    or-int/lit16 v8, v8, 0x1000

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :pswitch_7
    move-object/from16 v25, v10

    .line 183
    .line 184
    move-object/from16 v26, v11

    .line 185
    .line 186
    sget-object v10, Lvh2;->a:Lvh2;

    .line 187
    .line 188
    const/16 v11, 0xb

    .line 189
    .line 190
    invoke-interface {v1, v0, v11, v10, v3}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    check-cast v3, Ljava/lang/String;

    .line 195
    .line 196
    or-int/lit16 v8, v8, 0x800

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :pswitch_8
    move-object/from16 v25, v10

    .line 200
    .line 201
    move-object/from16 v26, v11

    .line 202
    .line 203
    const/16 v10, 0xa

    .line 204
    .line 205
    invoke-interface {v1, v0, v10}, Lky;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 206
    .line 207
    .line 208
    move-result v19

    .line 209
    or-int/lit16 v8, v8, 0x400

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :pswitch_9
    move-object/from16 v25, v10

    .line 213
    .line 214
    move-object/from16 v26, v11

    .line 215
    .line 216
    sget-object v10, Lo90;->a:Lo90;

    .line 217
    .line 218
    const/16 v11, 0x9

    .line 219
    .line 220
    invoke-interface {v1, v0, v11, v10, v4}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    check-cast v4, Ljava/lang/Double;

    .line 225
    .line 226
    or-int/lit16 v8, v8, 0x200

    .line 227
    .line 228
    goto/16 :goto_2

    .line 229
    .line 230
    :pswitch_a
    move-object/from16 v25, v10

    .line 231
    .line 232
    move-object/from16 v26, v11

    .line 233
    .line 234
    sget-object v10, Lcom/usercentrics/tcf/core/model/gvl/Overflow$$serializer;->INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/Overflow$$serializer;

    .line 235
    .line 236
    const/16 v11, 0x8

    .line 237
    .line 238
    invoke-interface {v1, v0, v11, v10, v5}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    check-cast v5, Lcom/usercentrics/tcf/core/model/gvl/Overflow;

    .line 243
    .line 244
    or-int/lit16 v8, v8, 0x100

    .line 245
    .line 246
    goto/16 :goto_2

    .line 247
    .line 248
    :pswitch_b
    move-object/from16 v25, v10

    .line 249
    .line 250
    move-object/from16 v26, v11

    .line 251
    .line 252
    sget-object v10, Lvh2;->a:Lvh2;

    .line 253
    .line 254
    const/4 v11, 0x7

    .line 255
    invoke-interface {v1, v0, v11, v10, v7}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v7

    .line 259
    check-cast v7, Ljava/lang/String;

    .line 260
    .line 261
    or-int/lit16 v8, v8, 0x80

    .line 262
    .line 263
    goto/16 :goto_2

    .line 264
    .line 265
    :pswitch_c
    move-object/from16 v25, v10

    .line 266
    .line 267
    move-object/from16 v26, v11

    .line 268
    .line 269
    const/4 v10, 0x6

    .line 270
    invoke-interface {v1, v0, v10}, Lky;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v20

    .line 274
    or-int/lit8 v8, v8, 0x40

    .line 275
    .line 276
    goto/16 :goto_3

    .line 277
    .line 278
    :pswitch_d
    move-object/from16 v25, v10

    .line 279
    .line 280
    move-object/from16 v26, v11

    .line 281
    .line 282
    const/4 v10, 0x5

    .line 283
    aget-object v11, v17, v10

    .line 284
    .line 285
    invoke-interface {v1, v0, v10, v11, v14}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v10

    .line 289
    move-object v14, v10

    .line 290
    check-cast v14, Ljava/util/List;

    .line 291
    .line 292
    or-int/lit8 v8, v8, 0x20

    .line 293
    .line 294
    goto/16 :goto_2

    .line 295
    .line 296
    :pswitch_e
    move-object/from16 v25, v10

    .line 297
    .line 298
    move-object/from16 v26, v11

    .line 299
    .line 300
    const/4 v10, 0x4

    .line 301
    aget-object v11, v17, v10

    .line 302
    .line 303
    invoke-interface {v1, v0, v10, v11, v13}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v10

    .line 307
    move-object v13, v10

    .line 308
    check-cast v13, Ljava/util/List;

    .line 309
    .line 310
    or-int/lit8 v8, v8, 0x10

    .line 311
    .line 312
    goto/16 :goto_2

    .line 313
    .line 314
    :pswitch_f
    move-object/from16 v25, v10

    .line 315
    .line 316
    move-object/from16 v26, v11

    .line 317
    .line 318
    const/4 v10, 0x3

    .line 319
    aget-object v11, v17, v10

    .line 320
    .line 321
    invoke-interface {v1, v0, v10, v11, v12}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v10

    .line 325
    move-object v12, v10

    .line 326
    check-cast v12, Ljava/util/List;

    .line 327
    .line 328
    or-int/lit8 v8, v8, 0x8

    .line 329
    .line 330
    goto/16 :goto_2

    .line 331
    .line 332
    :pswitch_10
    move-object/from16 v25, v10

    .line 333
    .line 334
    move-object/from16 v26, v11

    .line 335
    .line 336
    const/4 v10, 0x2

    .line 337
    aget-object v11, v17, v10

    .line 338
    .line 339
    move-object/from16 v27, v2

    .line 340
    .line 341
    move-object/from16 v2, v26

    .line 342
    .line 343
    invoke-interface {v1, v0, v10, v11, v2}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    move-object v11, v2

    .line 348
    check-cast v11, Ljava/util/List;

    .line 349
    .line 350
    or-int/lit8 v8, v8, 0x4

    .line 351
    .line 352
    move-object/from16 v10, v25

    .line 353
    .line 354
    :goto_4
    move-object/from16 v2, v27

    .line 355
    .line 356
    goto/16 :goto_0

    .line 357
    .line 358
    :pswitch_11
    move-object/from16 v27, v2

    .line 359
    .line 360
    move-object/from16 v25, v10

    .line 361
    .line 362
    move-object v2, v11

    .line 363
    aget-object v10, v17, v16

    .line 364
    .line 365
    move-object/from16 v26, v2

    .line 366
    .line 367
    move/from16 v2, v16

    .line 368
    .line 369
    move-object/from16 v11, v25

    .line 370
    .line 371
    invoke-interface {v1, v0, v2, v10, v11}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v10

    .line 375
    check-cast v10, Ljava/util/List;

    .line 376
    .line 377
    or-int/lit8 v8, v8, 0x2

    .line 378
    .line 379
    move-object/from16 v11, v26

    .line 380
    .line 381
    goto :goto_4

    .line 382
    :pswitch_12
    move-object/from16 v27, v2

    .line 383
    .line 384
    move-object/from16 v26, v11

    .line 385
    .line 386
    move/from16 v2, v16

    .line 387
    .line 388
    move-object v11, v10

    .line 389
    aget-object v10, v17, p1

    .line 390
    .line 391
    move-object/from16 v2, v22

    .line 392
    .line 393
    move-object/from16 v22, v3

    .line 394
    .line 395
    move/from16 v3, p1

    .line 396
    .line 397
    invoke-interface {v1, v0, v3, v10, v2}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    check-cast v2, Ljava/util/List;

    .line 402
    .line 403
    or-int/lit8 v8, v8, 0x1

    .line 404
    .line 405
    move-object v10, v11

    .line 406
    :goto_5
    move-object/from16 v3, v22

    .line 407
    .line 408
    move-object/from16 v11, v26

    .line 409
    .line 410
    const/16 v16, 0x1

    .line 411
    .line 412
    move-object/from16 v22, v2

    .line 413
    .line 414
    goto :goto_4

    .line 415
    :pswitch_13
    move-object/from16 v27, v2

    .line 416
    .line 417
    move-object/from16 v26, v11

    .line 418
    .line 419
    move-object/from16 v2, v22

    .line 420
    .line 421
    move-object/from16 v22, v3

    .line 422
    .line 423
    move-object v11, v10

    .line 424
    move/from16 v3, p1

    .line 425
    .line 426
    move/from16 v18, p1

    .line 427
    .line 428
    goto :goto_5

    .line 429
    :cond_0
    move-object/from16 v27, v2

    .line 430
    .line 431
    move-object/from16 v26, v11

    .line 432
    .line 433
    move-object/from16 v2, v22

    .line 434
    .line 435
    move-object/from16 v22, v3

    .line 436
    .line 437
    move-object v11, v10

    .line 438
    invoke-interface {v1, v0}, Lky;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 439
    .line 440
    .line 441
    move-object/from16 v16, v7

    .line 442
    .line 443
    new-instance v7, Lcom/usercentrics/tcf/core/model/gvl/Vendor;

    .line 444
    .line 445
    move-object/from16 v18, v4

    .line 446
    .line 447
    move-object/from16 v17, v5

    .line 448
    .line 449
    move-object/from16 v25, v6

    .line 450
    .line 451
    move-object/from16 v11, v26

    .line 452
    .line 453
    move-object/from16 v26, v15

    .line 454
    .line 455
    move-object/from16 v15, v20

    .line 456
    .line 457
    move-object/from16 v20, v22

    .line 458
    .line 459
    move-object/from16 v22, v27

    .line 460
    .line 461
    move-object/from16 v27, v9

    .line 462
    .line 463
    move-object v9, v2

    .line 464
    invoke-direct/range {v7 .. v27}, Lcom/usercentrics/tcf/core/model/gvl/Vendor;-><init>(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/usercentrics/tcf/core/model/gvl/Overflow;Ljava/lang/Double;ZLjava/lang/String;ZLjava/lang/Boolean;ILjava/lang/String;Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention;Ljava/util/List;Ljava/util/List;)V

    .line 465
    .line 466
    .line 467
    return-object v7

    .line 468
    nop

    .line 469
    :pswitch_data_0
    .packed-switch -0x1
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

    .line 469
    invoke-virtual {p0, p1}, Lcom/usercentrics/tcf/core/model/gvl/Vendor$$serializer;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/tcf/core/model/gvl/Vendor;

    move-result-object p0

    return-object p0
.end method

.method public getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 0

    .line 1
    sget-object p0, Lcom/usercentrics/tcf/core/model/gvl/Vendor$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 2
    .line 3
    return-object p0
.end method

.method public serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/tcf/core/model/gvl/Vendor;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/usercentrics/tcf/core/model/gvl/Vendor$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

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
    sget-object v0, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->t:[Lkotlinx/serialization/KSerializer;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    aget-object v2, v0, v1

    .line 19
    .line 20
    iget-object v3, p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->a:Ljava/util/List;

    .line 21
    .line 22
    iget-object v4, p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->s:Ljava/util/List;

    .line 23
    .line 24
    iget-object v5, p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->n:Ljava/lang/Boolean;

    .line 25
    .line 26
    iget-boolean v6, p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->m:Z

    .line 27
    .line 28
    iget-object v7, p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->l:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v8, p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->j:Ljava/lang/Double;

    .line 31
    .line 32
    iget-object v9, p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->i:Lcom/usercentrics/tcf/core/model/gvl/Overflow;

    .line 33
    .line 34
    iget-object v10, p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->h:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v11, p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->g:Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {p1, p0, v1, v2, v3}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    aget-object v2, v0, v1

    .line 43
    .line 44
    iget-object v3, p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->b:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {p1, p0, v1, v2, v3}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x2

    .line 50
    aget-object v2, v0, v1

    .line 51
    .line 52
    iget-object v3, p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->c:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {p1, p0, v1, v2, v3}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    const/4 v1, 0x3

    .line 58
    aget-object v2, v0, v1

    .line 59
    .line 60
    iget-object v3, p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->d:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {p1, p0, v1, v2, v3}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    const/4 v1, 0x4

    .line 66
    aget-object v2, v0, v1

    .line 67
    .line 68
    iget-object v3, p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->e:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {p1, p0, v1, v2, v3}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    const/4 v1, 0x5

    .line 74
    aget-object v2, v0, v1

    .line 75
    .line 76
    iget-object v3, p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->f:Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {p1, p0, v1, v2, v3}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_0

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    const-string v1, ""

    .line 89
    .line 90
    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_1

    .line 95
    .line 96
    :goto_0
    const/4 v1, 0x6

    .line 97
    invoke-interface {p1, p0, v1, v11}, Lly;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_1
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_2

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    if-eqz v10, :cond_3

    .line 108
    .line 109
    :goto_1
    sget-object v1, Lvh2;->a:Lvh2;

    .line 110
    .line 111
    const/4 v2, 0x7

    .line 112
    invoke-interface {p1, p0, v2, v1, v10}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_3
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_4

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    if-eqz v9, :cond_5

    .line 123
    .line 124
    :goto_2
    sget-object v1, Lcom/usercentrics/tcf/core/model/gvl/Overflow$$serializer;->INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/Overflow$$serializer;

    .line 125
    .line 126
    const/16 v2, 0x8

    .line 127
    .line 128
    invoke-interface {p1, p0, v2, v1, v9}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_5
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_6

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_6
    if-eqz v8, :cond_7

    .line 139
    .line 140
    :goto_3
    sget-object v1, Lo90;->a:Lo90;

    .line 141
    .line 142
    const/16 v2, 0x9

    .line 143
    .line 144
    invoke-interface {p1, p0, v2, v1, v8}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :cond_7
    const/16 v1, 0xa

    .line 148
    .line 149
    iget-boolean v2, p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->k:Z

    .line 150
    .line 151
    invoke-interface {p1, p0, v1, v2}, Lly;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 152
    .line 153
    .line 154
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_8

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_8
    if-eqz v7, :cond_9

    .line 162
    .line 163
    :goto_4
    sget-object v1, Lvh2;->a:Lvh2;

    .line 164
    .line 165
    const/16 v2, 0xb

    .line 166
    .line 167
    invoke-interface {p1, p0, v2, v1, v7}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_9
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-eqz v1, :cond_a

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_a
    if-eqz v6, :cond_b

    .line 178
    .line 179
    :goto_5
    const/16 v1, 0xc

    .line 180
    .line 181
    invoke-interface {p1, p0, v1, v6}, Lly;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 182
    .line 183
    .line 184
    :cond_b
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_c

    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_c
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 192
    .line 193
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-nez v1, :cond_d

    .line 198
    .line 199
    :goto_6
    sget-object v1, Lfk;->a:Lfk;

    .line 200
    .line 201
    const/16 v2, 0xd

    .line 202
    .line 203
    invoke-interface {p1, p0, v2, v1, v5}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    :cond_d
    const/16 v1, 0xe

    .line 207
    .line 208
    iget v2, p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->o:I

    .line 209
    .line 210
    invoke-interface {p1, v1, v2, p0}, Lly;->l(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 211
    .line 212
    .line 213
    const/16 v1, 0xf

    .line 214
    .line 215
    iget-object v2, p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->p:Ljava/lang/String;

    .line 216
    .line 217
    invoke-interface {p1, p0, v1, v2}, Lly;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 218
    .line 219
    .line 220
    sget-object v1, Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention$$serializer;->INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention$$serializer;

    .line 221
    .line 222
    iget-object v2, p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->q:Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention;

    .line 223
    .line 224
    const/16 v3, 0x10

    .line 225
    .line 226
    invoke-interface {p1, p0, v3, v1, v2}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    const/16 v1, 0x11

    .line 230
    .line 231
    aget-object v2, v0, v1

    .line 232
    .line 233
    iget-object p2, p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->r:Ljava/util/List;

    .line 234
    .line 235
    invoke-interface {p1, p0, v1, v2, p2}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 239
    .line 240
    .line 241
    move-result p2

    .line 242
    if-eqz p2, :cond_e

    .line 243
    .line 244
    goto :goto_7

    .line 245
    :cond_e
    if-eqz v4, :cond_f

    .line 246
    .line 247
    :goto_7
    const/16 p2, 0x12

    .line 248
    .line 249
    aget-object v0, v0, p2

    .line 250
    .line 251
    invoke-interface {p1, p0, p2, v0, v4}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    :cond_f
    invoke-interface {p1, p0}, Lly;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 255
    .line 256
    .line 257
    return-void
.end method

.method public bridge synthetic serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 0

    .line 258
    check-cast p2, Lcom/usercentrics/tcf/core/model/gvl/Vendor;

    invoke-virtual {p0, p1, p2}, Lcom/usercentrics/tcf/core/model/gvl/Vendor$$serializer;->serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/tcf/core/model/gvl/Vendor;)V

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

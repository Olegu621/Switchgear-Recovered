.class public final Lcom/usercentrics/tcf/core/model/gvl/VendorList$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Luq0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usercentrics/tcf/core/model/gvl/VendorList;
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
        "com/usercentrics/tcf/core/model/gvl/VendorList.$serializer",
        "Luq0;",
        "Lcom/usercentrics/tcf/core/model/gvl/VendorList;",
        "<init>",
        "()V",
        "",
        "Lkotlinx/serialization/KSerializer;",
        "childSerializers",
        "()[Lkotlinx/serialization/KSerializer;",
        "Lkotlinx/serialization/encoding/Decoder;",
        "decoder",
        "deserialize",
        "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/tcf/core/model/gvl/VendorList;",
        "Lkotlinx/serialization/encoding/Encoder;",
        "encoder",
        "value",
        "",
        "serialize",
        "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/tcf/core/model/gvl/VendorList;)V",
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
.field public static final INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/VendorList$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/usercentrics/tcf/core/model/gvl/VendorList$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/usercentrics/tcf/core/model/gvl/VendorList$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/tcf/core/model/gvl/VendorList$$serializer;->INSTANCE:Lcom/usercentrics/tcf/core/model/gvl/VendorList$$serializer;

    .line 7
    .line 8
    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 9
    .line 10
    const-string v2, "com.usercentrics.tcf.core.model.gvl.VendorList"

    .line 11
    .line 12
    const/16 v3, 0xb

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Luq0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "lastUpdated"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "gvlSpecificationVersion"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "vendorListVersion"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "tcfPolicyVersion"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "vendors"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "purposes"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "features"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "specialFeatures"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "specialPurposes"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "stacks"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "dataCategories"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    sput-object v1, Lcom/usercentrics/tcf/core/model/gvl/VendorList$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 74
    .line 75
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
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lkotlinx/serialization/KSerializer;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->l:[Lkotlinx/serialization/KSerializer;

    .line 2
    .line 3
    sget-object v1, Lvh2;->a:Lvh2;

    .line 4
    .line 5
    invoke-static {v1}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Laz0;->a:Laz0;

    .line 10
    .line 11
    invoke-static {v2}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-static {v2}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-static {v2}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const/4 v5, 0x4

    .line 24
    aget-object v6, v0, v5

    .line 25
    .line 26
    invoke-static {v6}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    const/4 v7, 0x5

    .line 31
    aget-object v8, v0, v7

    .line 32
    .line 33
    invoke-static {v8}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    const/4 v9, 0x6

    .line 38
    aget-object v10, v0, v9

    .line 39
    .line 40
    invoke-static {v10}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    const/4 v11, 0x7

    .line 45
    aget-object v12, v0, v11

    .line 46
    .line 47
    invoke-static {v12}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 48
    .line 49
    .line 50
    move-result-object v12

    .line 51
    const/16 v13, 0x8

    .line 52
    .line 53
    aget-object v14, v0, v13

    .line 54
    .line 55
    invoke-static {v14}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 56
    .line 57
    .line 58
    move-result-object v14

    .line 59
    const/16 v15, 0x9

    .line 60
    .line 61
    aget-object v16, v0, v15

    .line 62
    .line 63
    invoke-static/range {v16 .. v16}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 64
    .line 65
    .line 66
    move-result-object v16

    .line 67
    const/16 v17, 0xa

    .line 68
    .line 69
    aget-object v0, v0, v17

    .line 70
    .line 71
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    move/from16 p0, v5

    .line 76
    .line 77
    const/16 v5, 0xb

    .line 78
    .line 79
    new-array v5, v5, [Lkotlinx/serialization/KSerializer;

    .line 80
    .line 81
    const/16 v18, 0x0

    .line 82
    .line 83
    aput-object v1, v5, v18

    .line 84
    .line 85
    const/4 v1, 0x1

    .line 86
    aput-object v3, v5, v1

    .line 87
    .line 88
    const/4 v1, 0x2

    .line 89
    aput-object v4, v5, v1

    .line 90
    .line 91
    const/4 v1, 0x3

    .line 92
    aput-object v2, v5, v1

    .line 93
    .line 94
    aput-object v6, v5, p0

    .line 95
    .line 96
    aput-object v8, v5, v7

    .line 97
    .line 98
    aput-object v10, v5, v9

    .line 99
    .line 100
    aput-object v12, v5, v11

    .line 101
    .line 102
    aput-object v14, v5, v13

    .line 103
    .line 104
    aput-object v16, v5, v15

    .line 105
    .line 106
    aput-object v0, v5, v17

    .line 107
    .line 108
    return-object v5
.end method

.method public deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/tcf/core/model/gvl/VendorList;
    .locals 20

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p0 .. p0}, Lcom/usercentrics/tcf/core/model/gvl/VendorList$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

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
    sget-object v2, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->l:[Lkotlinx/serialization/KSerializer;

    .line 15
    .line 16
    const/16 p0, 0x0

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x1

    .line 22
    const/4 v7, 0x0

    .line 23
    const/4 v8, 0x0

    .line 24
    const/4 v9, 0x0

    .line 25
    const/4 v10, 0x0

    .line 26
    const/4 v11, 0x0

    .line 27
    const/4 v12, 0x0

    .line 28
    const/4 v13, 0x0

    .line 29
    const/4 v14, 0x0

    .line 30
    const/4 v15, 0x0

    .line 31
    :goto_0
    if-eqz v6, :cond_0

    .line 32
    .line 33
    invoke-interface {v1, v0}, Lky;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 34
    .line 35
    .line 36
    move-result v17

    .line 37
    packed-switch v17, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    invoke-static/range {v17 .. v17}, Ln4;->e(I)V

    .line 41
    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    move-object/from16 v17, v2

    .line 45
    .line 46
    const/16 v2, 0xa

    .line 47
    .line 48
    move/from16 v18, v6

    .line 49
    .line 50
    aget-object v6, v17, v2

    .line 51
    .line 52
    invoke-interface {v1, v0, v2, v6, v3}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    move-object v3, v2

    .line 57
    check-cast v3, Ljava/util/Map;

    .line 58
    .line 59
    or-int/lit16 v8, v8, 0x400

    .line 60
    .line 61
    :goto_1
    move-object/from16 v2, v17

    .line 62
    .line 63
    move/from16 v6, v18

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :pswitch_1
    move-object/from16 v17, v2

    .line 67
    .line 68
    move/from16 v18, v6

    .line 69
    .line 70
    const/16 v2, 0x9

    .line 71
    .line 72
    aget-object v6, v17, v2

    .line 73
    .line 74
    invoke-interface {v1, v0, v2, v6, v4}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    move-object v4, v2

    .line 79
    check-cast v4, Ljava/util/Map;

    .line 80
    .line 81
    or-int/lit16 v8, v8, 0x200

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :pswitch_2
    move-object/from16 v17, v2

    .line 85
    .line 86
    move/from16 v18, v6

    .line 87
    .line 88
    const/16 v2, 0x8

    .line 89
    .line 90
    aget-object v6, v17, v2

    .line 91
    .line 92
    invoke-interface {v1, v0, v2, v6, v5}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    move-object v5, v2

    .line 97
    check-cast v5, Ljava/util/Map;

    .line 98
    .line 99
    or-int/lit16 v8, v8, 0x100

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :pswitch_3
    move-object/from16 v17, v2

    .line 103
    .line 104
    move/from16 v18, v6

    .line 105
    .line 106
    const/4 v2, 0x7

    .line 107
    aget-object v6, v17, v2

    .line 108
    .line 109
    invoke-interface {v1, v0, v2, v6, v7}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    move-object v7, v2

    .line 114
    check-cast v7, Ljava/util/Map;

    .line 115
    .line 116
    or-int/lit16 v8, v8, 0x80

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :pswitch_4
    move-object/from16 v17, v2

    .line 120
    .line 121
    move/from16 v18, v6

    .line 122
    .line 123
    const/4 v2, 0x6

    .line 124
    aget-object v6, v17, v2

    .line 125
    .line 126
    invoke-interface {v1, v0, v2, v6, v15}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    move-object v15, v2

    .line 131
    check-cast v15, Ljava/util/Map;

    .line 132
    .line 133
    or-int/lit8 v8, v8, 0x40

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :pswitch_5
    move-object/from16 v17, v2

    .line 137
    .line 138
    move/from16 v18, v6

    .line 139
    .line 140
    const/4 v2, 0x5

    .line 141
    aget-object v6, v17, v2

    .line 142
    .line 143
    invoke-interface {v1, v0, v2, v6, v14}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    move-object v14, v2

    .line 148
    check-cast v14, Ljava/util/Map;

    .line 149
    .line 150
    or-int/lit8 v8, v8, 0x20

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :pswitch_6
    move-object/from16 v17, v2

    .line 154
    .line 155
    move/from16 v18, v6

    .line 156
    .line 157
    const/4 v2, 0x4

    .line 158
    aget-object v6, v17, v2

    .line 159
    .line 160
    invoke-interface {v1, v0, v2, v6, v13}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    move-object v13, v2

    .line 165
    check-cast v13, Ljava/util/Map;

    .line 166
    .line 167
    or-int/lit8 v8, v8, 0x10

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :pswitch_7
    move-object/from16 v17, v2

    .line 171
    .line 172
    move/from16 v18, v6

    .line 173
    .line 174
    sget-object v2, Laz0;->a:Laz0;

    .line 175
    .line 176
    const/4 v6, 0x3

    .line 177
    invoke-interface {v1, v0, v6, v2, v12}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    move-object v12, v2

    .line 182
    check-cast v12, Ljava/lang/Integer;

    .line 183
    .line 184
    or-int/lit8 v8, v8, 0x8

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :pswitch_8
    move-object/from16 v17, v2

    .line 188
    .line 189
    move/from16 v18, v6

    .line 190
    .line 191
    sget-object v2, Laz0;->a:Laz0;

    .line 192
    .line 193
    const/4 v6, 0x2

    .line 194
    invoke-interface {v1, v0, v6, v2, v11}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    move-object v11, v2

    .line 199
    check-cast v11, Ljava/lang/Integer;

    .line 200
    .line 201
    or-int/lit8 v8, v8, 0x4

    .line 202
    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    :pswitch_9
    move-object/from16 v17, v2

    .line 206
    .line 207
    move/from16 v18, v6

    .line 208
    .line 209
    sget-object v2, Laz0;->a:Laz0;

    .line 210
    .line 211
    const/4 v6, 0x1

    .line 212
    invoke-interface {v1, v0, v6, v2, v10}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    move-object v10, v2

    .line 217
    check-cast v10, Ljava/lang/Integer;

    .line 218
    .line 219
    or-int/lit8 v8, v8, 0x2

    .line 220
    .line 221
    goto/16 :goto_1

    .line 222
    .line 223
    :pswitch_a
    move-object/from16 v17, v2

    .line 224
    .line 225
    move/from16 v18, v6

    .line 226
    .line 227
    const/4 v6, 0x1

    .line 228
    sget-object v2, Lvh2;->a:Lvh2;

    .line 229
    .line 230
    const/4 v6, 0x0

    .line 231
    invoke-interface {v1, v0, v6, v2, v9}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    move-object v9, v2

    .line 236
    check-cast v9, Ljava/lang/String;

    .line 237
    .line 238
    or-int/lit8 v8, v8, 0x1

    .line 239
    .line 240
    goto/16 :goto_1

    .line 241
    .line 242
    :pswitch_b
    const/4 v6, 0x0

    .line 243
    goto/16 :goto_0

    .line 244
    .line 245
    :cond_0
    invoke-interface {v1, v0}, Lky;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 246
    .line 247
    .line 248
    move-object/from16 v16, v7

    .line 249
    .line 250
    new-instance v7, Lcom/usercentrics/tcf/core/model/gvl/VendorList;

    .line 251
    .line 252
    move-object/from16 v19, v3

    .line 253
    .line 254
    move-object/from16 v18, v4

    .line 255
    .line 256
    move-object/from16 v17, v5

    .line 257
    .line 258
    invoke-direct/range {v7 .. v19}, Lcom/usercentrics/tcf/core/model/gvl/VendorList;-><init>(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    .line 259
    .line 260
    .line 261
    return-object v7

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch -0x1
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

    .line 263
    invoke-virtual {p0, p1}, Lcom/usercentrics/tcf/core/model/gvl/VendorList$$serializer;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/tcf/core/model/gvl/VendorList;

    move-result-object p0

    return-object p0
.end method

.method public getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 0

    .line 1
    sget-object p0, Lcom/usercentrics/tcf/core/model/gvl/VendorList$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 2
    .line 3
    return-object p0
.end method

.method public serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/tcf/core/model/gvl/VendorList;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->k:Ljava/util/Map;

    .line 8
    .line 9
    iget-object v1, p2, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->j:Ljava/util/Map;

    .line 10
    .line 11
    iget-object v2, p2, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->i:Ljava/util/Map;

    .line 12
    .line 13
    iget-object v3, p2, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->h:Ljava/util/Map;

    .line 14
    .line 15
    iget-object v4, p2, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->g:Ljava/util/Map;

    .line 16
    .line 17
    iget-object v5, p2, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->f:Ljava/util/Map;

    .line 18
    .line 19
    iget-object v6, p2, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->e:Ljava/util/Map;

    .line 20
    .line 21
    iget-object v7, p2, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->d:Ljava/lang/Integer;

    .line 22
    .line 23
    iget-object v8, p2, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->c:Ljava/lang/Integer;

    .line 24
    .line 25
    iget-object v9, p2, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->b:Ljava/lang/Integer;

    .line 26
    .line 27
    iget-object p2, p2, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/usercentrics/tcf/core/model/gvl/VendorList$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p1, p0}, Lkotlinx/serialization/encoding/Encoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lly;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object v10, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->l:[Lkotlinx/serialization/KSerializer;

    .line 38
    .line 39
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 40
    .line 41
    .line 42
    move-result v11

    .line 43
    if-eqz v11, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    if-eqz p2, :cond_1

    .line 47
    .line 48
    :goto_0
    sget-object v11, Lvh2;->a:Lvh2;

    .line 49
    .line 50
    const/4 v12, 0x0

    .line 51
    invoke-interface {p1, p0, v12, v11, p2}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-eqz p2, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    if-eqz v9, :cond_3

    .line 62
    .line 63
    :goto_1
    sget-object p2, Laz0;->a:Laz0;

    .line 64
    .line 65
    const/4 v11, 0x1

    .line 66
    invoke-interface {p1, p0, v11, p2, v9}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-eqz p2, :cond_4

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    if-eqz v8, :cond_5

    .line 77
    .line 78
    :goto_2
    sget-object p2, Laz0;->a:Laz0;

    .line 79
    .line 80
    const/4 v9, 0x2

    .line 81
    invoke-interface {p1, p0, v9, p2, v8}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_5
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-eqz p2, :cond_6

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_6
    if-eqz v7, :cond_7

    .line 92
    .line 93
    :goto_3
    sget-object p2, Laz0;->a:Laz0;

    .line 94
    .line 95
    const/4 v8, 0x3

    .line 96
    invoke-interface {p1, p0, v8, p2, v7}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_7
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-eqz p2, :cond_8

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_8
    if-eqz v6, :cond_9

    .line 107
    .line 108
    :goto_4
    const/4 p2, 0x4

    .line 109
    aget-object v7, v10, p2

    .line 110
    .line 111
    invoke-interface {p1, p0, p2, v7, v6}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_9
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    if-eqz p2, :cond_a

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_a
    if-eqz v5, :cond_b

    .line 122
    .line 123
    :goto_5
    const/4 p2, 0x5

    .line 124
    aget-object v6, v10, p2

    .line 125
    .line 126
    invoke-interface {p1, p0, p2, v6, v5}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_b
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    if-eqz p2, :cond_c

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_c
    if-eqz v4, :cond_d

    .line 137
    .line 138
    :goto_6
    const/4 p2, 0x6

    .line 139
    aget-object v5, v10, p2

    .line 140
    .line 141
    invoke-interface {p1, p0, p2, v5, v4}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_d
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 145
    .line 146
    .line 147
    move-result p2

    .line 148
    if-eqz p2, :cond_e

    .line 149
    .line 150
    goto :goto_7

    .line 151
    :cond_e
    if-eqz v3, :cond_f

    .line 152
    .line 153
    :goto_7
    const/4 p2, 0x7

    .line 154
    aget-object v4, v10, p2

    .line 155
    .line 156
    invoke-interface {p1, p0, p2, v4, v3}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :cond_f
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 160
    .line 161
    .line 162
    move-result p2

    .line 163
    if-eqz p2, :cond_10

    .line 164
    .line 165
    goto :goto_8

    .line 166
    :cond_10
    if-eqz v2, :cond_11

    .line 167
    .line 168
    :goto_8
    const/16 p2, 0x8

    .line 169
    .line 170
    aget-object v3, v10, p2

    .line 171
    .line 172
    invoke-interface {p1, p0, p2, v3, v2}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    :cond_11
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 176
    .line 177
    .line 178
    move-result p2

    .line 179
    if-eqz p2, :cond_12

    .line 180
    .line 181
    goto :goto_9

    .line 182
    :cond_12
    if-eqz v1, :cond_13

    .line 183
    .line 184
    :goto_9
    const/16 p2, 0x9

    .line 185
    .line 186
    aget-object v2, v10, p2

    .line 187
    .line 188
    invoke-interface {p1, p0, p2, v2, v1}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_13
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    if-eqz p2, :cond_14

    .line 196
    .line 197
    goto :goto_a

    .line 198
    :cond_14
    if-eqz v0, :cond_15

    .line 199
    .line 200
    :goto_a
    const/16 p2, 0xa

    .line 201
    .line 202
    aget-object v1, v10, p2

    .line 203
    .line 204
    invoke-interface {p1, p0, p2, v1, v0}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    :cond_15
    invoke-interface {p1, p0}, Lly;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 208
    .line 209
    .line 210
    return-void
.end method

.method public bridge synthetic serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 0

    .line 211
    check-cast p2, Lcom/usercentrics/tcf/core/model/gvl/VendorList;

    invoke-virtual {p0, p1, p2}, Lcom/usercentrics/tcf/core/model/gvl/VendorList$$serializer;->serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/tcf/core/model/gvl/VendorList;)V

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

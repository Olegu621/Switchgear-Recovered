.class public final Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Luq0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;
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
        "com/usercentrics/sdk/services/tcf/interfaces/TCFPurpose.$serializer",
        "Luq0;",
        "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;",
        "<init>",
        "()V",
        "",
        "Lkotlinx/serialization/KSerializer;",
        "childSerializers",
        "()[Lkotlinx/serialization/KSerializer;",
        "Lkotlinx/serialization/encoding/Decoder;",
        "decoder",
        "deserialize",
        "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;",
        "Lkotlinx/serialization/encoding/Encoder;",
        "encoder",
        "value",
        "",
        "serialize",
        "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;)V",
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
.field public static final INSTANCE:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$$serializer;->INSTANCE:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$$serializer;

    .line 7
    .line 8
    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 9
    .line 10
    const-string v2, "com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose"

    .line 11
    .line 12
    const/16 v3, 0xb

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Luq0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "purposeDescription"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "illustrations"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "id"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "name"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "consent"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "isPartOfASelectedStack"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "legitimateInterestConsent"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "showConsentToggle"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "showLegitimateInterestToggle"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "stackId"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "numberOfVendors"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    sput-object v1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

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
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lkotlinx/serialization/KSerializer;"
        }
    .end annotation

    .line 1
    sget-object p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->l:[Lkotlinx/serialization/KSerializer;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    aget-object p0, p0, v0

    .line 5
    .line 6
    sget-object v1, Laz0;->a:Laz0;

    .line 7
    .line 8
    sget-object v2, Lfk;->a:Lfk;

    .line 9
    .line 10
    invoke-static {v2}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-static {v2}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-static {v1}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-static {v1}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    const/16 v7, 0xb

    .line 27
    .line 28
    new-array v7, v7, [Lkotlinx/serialization/KSerializer;

    .line 29
    .line 30
    sget-object v8, Lvh2;->a:Lvh2;

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    aput-object v8, v7, v9

    .line 34
    .line 35
    aput-object p0, v7, v0

    .line 36
    .line 37
    const/4 p0, 0x2

    .line 38
    aput-object v1, v7, p0

    .line 39
    .line 40
    const/4 p0, 0x3

    .line 41
    aput-object v8, v7, p0

    .line 42
    .line 43
    const/4 p0, 0x4

    .line 44
    aput-object v3, v7, p0

    .line 45
    .line 46
    const/4 p0, 0x5

    .line 47
    aput-object v2, v7, p0

    .line 48
    .line 49
    const/4 p0, 0x6

    .line 50
    aput-object v4, v7, p0

    .line 51
    .line 52
    const/4 p0, 0x7

    .line 53
    aput-object v2, v7, p0

    .line 54
    .line 55
    const/16 p0, 0x8

    .line 56
    .line 57
    aput-object v2, v7, p0

    .line 58
    .line 59
    const/16 p0, 0x9

    .line 60
    .line 61
    aput-object v5, v7, p0

    .line 62
    .line 63
    const/16 p0, 0xa

    .line 64
    .line 65
    aput-object v6, v7, p0

    .line 66
    .line 67
    return-object v7
.end method

.method public deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;
    .locals 20

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p0 .. p0}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

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
    sget-object v2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->l:[Lkotlinx/serialization/KSerializer;

    .line 15
    .line 16
    const/16 p0, 0x0

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    const/4 v12, 0x0

    .line 26
    const/4 v13, 0x0

    .line 27
    const/4 v14, 0x0

    .line 28
    const/4 v15, 0x0

    .line 29
    const/16 v16, 0x0

    .line 30
    .line 31
    const/16 v17, 0x0

    .line 32
    .line 33
    :goto_0
    if-eqz v6, :cond_0

    .line 34
    .line 35
    invoke-interface {v1, v0}, Lky;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 36
    .line 37
    .line 38
    move-result v18

    .line 39
    packed-switch v18, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    invoke-static/range {v18 .. v18}, Ln4;->e(I)V

    .line 43
    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    sget-object v4, Laz0;->a:Laz0;

    .line 47
    .line 48
    const/16 v18, 0x1

    .line 49
    .line 50
    const/16 v3, 0xa

    .line 51
    .line 52
    invoke-interface {v1, v0, v3, v4, v5}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    move-object v5, v3

    .line 57
    check-cast v5, Ljava/lang/Integer;

    .line 58
    .line 59
    or-int/lit16 v8, v8, 0x400

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_1
    const/16 v18, 0x1

    .line 63
    .line 64
    sget-object v3, Laz0;->a:Laz0;

    .line 65
    .line 66
    const/16 v4, 0x9

    .line 67
    .line 68
    invoke-interface {v1, v0, v4, v3, v7}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    move-object v7, v3

    .line 73
    check-cast v7, Ljava/lang/Integer;

    .line 74
    .line 75
    or-int/lit16 v8, v8, 0x200

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :pswitch_2
    const/16 v18, 0x1

    .line 79
    .line 80
    const/16 v3, 0x8

    .line 81
    .line 82
    invoke-interface {v1, v0, v3}, Lky;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 83
    .line 84
    .line 85
    move-result v17

    .line 86
    or-int/lit16 v8, v8, 0x100

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :pswitch_3
    const/16 v18, 0x1

    .line 90
    .line 91
    const/4 v3, 0x7

    .line 92
    invoke-interface {v1, v0, v3}, Lky;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 93
    .line 94
    .line 95
    move-result v16

    .line 96
    or-int/lit16 v8, v8, 0x80

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :pswitch_4
    const/16 v18, 0x1

    .line 100
    .line 101
    sget-object v3, Lfk;->a:Lfk;

    .line 102
    .line 103
    const/4 v4, 0x6

    .line 104
    invoke-interface {v1, v0, v4, v3, v15}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    move-object v15, v3

    .line 109
    check-cast v15, Ljava/lang/Boolean;

    .line 110
    .line 111
    or-int/lit8 v8, v8, 0x40

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :pswitch_5
    const/16 v18, 0x1

    .line 115
    .line 116
    const/4 v3, 0x5

    .line 117
    invoke-interface {v1, v0, v3}, Lky;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 118
    .line 119
    .line 120
    move-result v14

    .line 121
    or-int/lit8 v8, v8, 0x20

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :pswitch_6
    const/16 v18, 0x1

    .line 125
    .line 126
    sget-object v3, Lfk;->a:Lfk;

    .line 127
    .line 128
    const/4 v4, 0x4

    .line 129
    invoke-interface {v1, v0, v4, v3, v13}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    move-object v13, v3

    .line 134
    check-cast v13, Ljava/lang/Boolean;

    .line 135
    .line 136
    or-int/lit8 v8, v8, 0x10

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :pswitch_7
    const/16 v18, 0x1

    .line 140
    .line 141
    const/4 v3, 0x3

    .line 142
    invoke-interface {v1, v0, v3}, Lky;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v12

    .line 146
    or-int/lit8 v8, v8, 0x8

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :pswitch_8
    const/16 v18, 0x1

    .line 150
    .line 151
    const/4 v3, 0x2

    .line 152
    invoke-interface {v1, v0, v3}, Lky;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    or-int/lit8 v8, v8, 0x4

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :pswitch_9
    const/16 v18, 0x1

    .line 160
    .line 161
    aget-object v3, v2, v18

    .line 162
    .line 163
    move/from16 v4, v18

    .line 164
    .line 165
    invoke-interface {v1, v0, v4, v3, v10}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    move-object v10, v3

    .line 170
    check-cast v10, Ljava/util/List;

    .line 171
    .line 172
    or-int/lit8 v8, v8, 0x2

    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    :pswitch_a
    const/4 v3, 0x0

    .line 177
    const/4 v4, 0x1

    .line 178
    invoke-interface {v1, v0, v3}, Lky;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    or-int/lit8 v8, v8, 0x1

    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :pswitch_b
    const/4 v3, 0x0

    .line 187
    const/4 v4, 0x1

    .line 188
    move v6, v3

    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_0
    invoke-interface {v1, v0}, Lky;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 192
    .line 193
    .line 194
    move-object/from16 v18, v7

    .line 195
    .line 196
    new-instance v7, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;

    .line 197
    .line 198
    move-object/from16 v19, v5

    .line 199
    .line 200
    invoke-direct/range {v7 .. v19}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;-><init>(ILjava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;ZZLjava/lang/Integer;Ljava/lang/Integer;)V

    .line 201
    .line 202
    .line 203
    return-object v7

    .line 204
    nop

    .line 205
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

    .line 205
    invoke-virtual {p0, p1}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$$serializer;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;

    move-result-object p0

    return-object p0
.end method

.method public getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 0

    .line 1
    sget-object p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 2
    .line 3
    return-object p0
.end method

.method public serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

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
    sget-object v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->l:[Lkotlinx/serialization/KSerializer;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iget-object v2, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->a:Ljava/lang/String;

    .line 19
    .line 20
    invoke-interface {p1, p0, v1, v2}, Lly;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    aget-object v0, v0, v1

    .line 25
    .line 26
    iget-object v2, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->b:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {p1, p0, v1, v0, v2}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    iget v1, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->c:I

    .line 33
    .line 34
    invoke-interface {p1, v0, v1, p0}, Lly;->l(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    iget-object v1, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-interface {p1, p0, v0, v1}, Lly;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Lfk;->a:Lfk;

    .line 44
    .line 45
    iget-object v1, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->e:Ljava/lang/Boolean;

    .line 46
    .line 47
    const/4 v2, 0x4

    .line 48
    invoke-interface {p1, p0, v2, v0, v1}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const/4 v1, 0x5

    .line 52
    iget-boolean v2, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->f:Z

    .line 53
    .line 54
    invoke-interface {p1, p0, v1, v2}, Lly;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 55
    .line 56
    .line 57
    const/4 v1, 0x6

    .line 58
    iget-object v2, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->g:Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-interface {p1, p0, v1, v0, v2}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    const/4 v0, 0x7

    .line 64
    iget-boolean v1, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->h:Z

    .line 65
    .line 66
    invoke-interface {p1, p0, v0, v1}, Lly;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 67
    .line 68
    .line 69
    const/16 v0, 0x8

    .line 70
    .line 71
    iget-boolean v1, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->i:Z

    .line 72
    .line 73
    invoke-interface {p1, p0, v0, v1}, Lly;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 74
    .line 75
    .line 76
    sget-object v0, Laz0;->a:Laz0;

    .line 77
    .line 78
    iget-object v1, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->j:Ljava/lang/Integer;

    .line 79
    .line 80
    const/16 v2, 0x9

    .line 81
    .line 82
    invoke-interface {p1, p0, v2, v0, v1}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    const/16 v1, 0xa

    .line 86
    .line 87
    iget-object p2, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->k:Ljava/lang/Integer;

    .line 88
    .line 89
    invoke-interface {p1, p0, v1, v0, p2}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p1, p0}, Lly;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public bridge synthetic serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 0

    .line 96
    check-cast p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;

    invoke-virtual {p0, p1, p2}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose$$serializer;->serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;)V

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

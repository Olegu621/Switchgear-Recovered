.class public final Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Luq0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;
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
        "com/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate.$serializer",
        "Luq0;",
        "Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;",
        "<init>",
        "()V",
        "",
        "Lkotlinx/serialization/KSerializer;",
        "childSerializers",
        "()[Lkotlinx/serialization/KSerializer;",
        "Lkotlinx/serialization/encoding/Decoder;",
        "decoder",
        "deserialize",
        "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;",
        "Lkotlinx/serialization/encoding/Encoder;",
        "encoder",
        "value",
        "",
        "serialize",
        "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;)V",
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
.field public static final INSTANCE:Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$$serializer;

    .line 7
    .line 8
    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 9
    .line 10
    const-string v2, "com.usercentrics.sdk.v2.settings.data.ServiceConsentTemplate"

    .line 11
    .line 12
    const/16 v3, 0xb

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Luq0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "isDeactivated"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "defaultConsentStatus"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "templateId"

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    const-string v0, "version"

    .line 35
    .line 36
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v0, "categorySlug"

    .line 40
    .line 41
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "description"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "isHidden"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "subConsents"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "isAutoUpdateAllowed"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "legalBasisList"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "disableLegalBasis"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    sput-object v1, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 75
    .line 76
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
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lkotlinx/serialization/KSerializer;"
        }
    .end annotation

    .line 1
    sget-object p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->l:[Lkotlinx/serialization/KSerializer;

    .line 2
    .line 3
    sget-object v0, Lfk;->a:Lfk;

    .line 4
    .line 5
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v3, Lvh2;->a:Lvh2;

    .line 14
    .line 15
    invoke-static {v3}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-static {v3}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    const/4 v6, 0x7

    .line 24
    aget-object v7, p0, v6

    .line 25
    .line 26
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    const/16 v9, 0x9

    .line 31
    .line 32
    aget-object p0, p0, v9

    .line 33
    .line 34
    invoke-static {p0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 39
    .line 40
    .line 41
    move-result-object v10

    .line 42
    const/16 v11, 0xb

    .line 43
    .line 44
    new-array v11, v11, [Lkotlinx/serialization/KSerializer;

    .line 45
    .line 46
    const/4 v12, 0x0

    .line 47
    aput-object v1, v11, v12

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    aput-object v2, v11, v1

    .line 51
    .line 52
    const/4 v1, 0x2

    .line 53
    aput-object v3, v11, v1

    .line 54
    .line 55
    const/4 v1, 0x3

    .line 56
    aput-object v3, v11, v1

    .line 57
    .line 58
    const/4 v1, 0x4

    .line 59
    aput-object v4, v11, v1

    .line 60
    .line 61
    const/4 v1, 0x5

    .line 62
    aput-object v5, v11, v1

    .line 63
    .line 64
    const/4 v1, 0x6

    .line 65
    aput-object v0, v11, v1

    .line 66
    .line 67
    aput-object v7, v11, v6

    .line 68
    .line 69
    const/16 v0, 0x8

    .line 70
    .line 71
    aput-object v8, v11, v0

    .line 72
    .line 73
    aput-object p0, v11, v9

    .line 74
    .line 75
    const/16 p0, 0xa

    .line 76
    .line 77
    aput-object v10, v11, p0

    .line 78
    .line 79
    return-object v11
.end method

.method public deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;
    .locals 20

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p0 .. p0}, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

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
    sget-object v2, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->l:[Lkotlinx/serialization/KSerializer;

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
    sget-object v2, Lfk;->a:Lfk;

    .line 47
    .line 48
    move/from16 v18, v6

    .line 49
    .line 50
    const/16 v6, 0xa

    .line 51
    .line 52
    invoke-interface {v1, v0, v6, v2, v3}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    move-object v3, v2

    .line 57
    check-cast v3, Ljava/lang/Boolean;

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
    check-cast v4, Ljava/util/List;

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
    sget-object v2, Lfk;->a:Lfk;

    .line 89
    .line 90
    const/16 v6, 0x8

    .line 91
    .line 92
    invoke-interface {v1, v0, v6, v2, v5}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    move-object v5, v2

    .line 97
    check-cast v5, Ljava/lang/Boolean;

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
    invoke-interface {v1, v0, v2, v6, v7}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    move-object v7, v2

    .line 114
    check-cast v7, Ljava/util/List;

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
    invoke-interface {v1, v0, v2}, Lky;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 125
    .line 126
    .line 127
    move-result v15

    .line 128
    or-int/lit8 v8, v8, 0x40

    .line 129
    .line 130
    :goto_2
    move-object/from16 v2, v17

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :pswitch_5
    move-object/from16 v17, v2

    .line 134
    .line 135
    move/from16 v18, v6

    .line 136
    .line 137
    sget-object v2, Lvh2;->a:Lvh2;

    .line 138
    .line 139
    const/4 v6, 0x5

    .line 140
    invoke-interface {v1, v0, v6, v2, v14}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    move-object v14, v2

    .line 145
    check-cast v14, Ljava/lang/String;

    .line 146
    .line 147
    or-int/lit8 v8, v8, 0x20

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :pswitch_6
    move-object/from16 v17, v2

    .line 151
    .line 152
    move/from16 v18, v6

    .line 153
    .line 154
    sget-object v2, Lvh2;->a:Lvh2;

    .line 155
    .line 156
    const/4 v6, 0x4

    .line 157
    invoke-interface {v1, v0, v6, v2, v13}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    move-object v13, v2

    .line 162
    check-cast v13, Ljava/lang/String;

    .line 163
    .line 164
    or-int/lit8 v8, v8, 0x10

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :pswitch_7
    move-object/from16 v17, v2

    .line 168
    .line 169
    move/from16 v18, v6

    .line 170
    .line 171
    const/4 v2, 0x3

    .line 172
    invoke-interface {v1, v0, v2}, Lky;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    or-int/lit8 v8, v8, 0x8

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :pswitch_8
    move-object/from16 v17, v2

    .line 180
    .line 181
    move/from16 v18, v6

    .line 182
    .line 183
    const/4 v2, 0x2

    .line 184
    invoke-interface {v1, v0, v2}, Lky;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v11

    .line 188
    or-int/lit8 v8, v8, 0x4

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :pswitch_9
    move-object/from16 v17, v2

    .line 192
    .line 193
    move/from16 v18, v6

    .line 194
    .line 195
    sget-object v2, Lfk;->a:Lfk;

    .line 196
    .line 197
    const/4 v6, 0x1

    .line 198
    invoke-interface {v1, v0, v6, v2, v10}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    move-object v10, v2

    .line 203
    check-cast v10, Ljava/lang/Boolean;

    .line 204
    .line 205
    or-int/lit8 v8, v8, 0x2

    .line 206
    .line 207
    goto/16 :goto_1

    .line 208
    .line 209
    :pswitch_a
    move-object/from16 v17, v2

    .line 210
    .line 211
    move/from16 v18, v6

    .line 212
    .line 213
    const/4 v6, 0x1

    .line 214
    sget-object v2, Lfk;->a:Lfk;

    .line 215
    .line 216
    const/4 v6, 0x0

    .line 217
    invoke-interface {v1, v0, v6, v2, v9}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    move-object v9, v2

    .line 222
    check-cast v9, Ljava/lang/Boolean;

    .line 223
    .line 224
    or-int/lit8 v8, v8, 0x1

    .line 225
    .line 226
    goto/16 :goto_1

    .line 227
    .line 228
    :pswitch_b
    const/4 v6, 0x0

    .line 229
    goto/16 :goto_0

    .line 230
    .line 231
    :cond_0
    invoke-interface {v1, v0}, Lky;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 232
    .line 233
    .line 234
    move-object/from16 v16, v7

    .line 235
    .line 236
    new-instance v7, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;

    .line 237
    .line 238
    move-object/from16 v19, v3

    .line 239
    .line 240
    move-object/from16 v18, v4

    .line 241
    .line 242
    move-object/from16 v17, v5

    .line 243
    .line 244
    invoke-direct/range {v7 .. v19}, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;-><init>(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;)V

    .line 245
    .line 246
    .line 247
    return-object v7

    .line 248
    nop

    .line 249
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

    .line 249
    invoke-virtual {p0, p1}, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$$serializer;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;

    move-result-object p0

    return-object p0
.end method

.method public getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 0

    .line 1
    sget-object p0, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 2
    .line 3
    return-object p0
.end method

.method public serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->b:Ljava/lang/Boolean;

    .line 8
    .line 9
    iget-object v1, p2, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->a:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p1, p0}, Lkotlinx/serialization/encoding/Encoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lly;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget-object v2, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->l:[Lkotlinx/serialization/KSerializer;

    .line 20
    .line 21
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    if-eqz v1, :cond_1

    .line 29
    .line 30
    :goto_0
    sget-object v3, Lfk;->a:Lfk;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-interface {p1, p0, v4, v3, v1}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    if-eqz v0, :cond_3

    .line 44
    .line 45
    :goto_1
    sget-object v1, Lfk;->a:Lfk;

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    invoke-interface {p1, p0, v3, v1, v0}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_3
    iget-object v0, p2, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->c:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v1, p2, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->k:Ljava/lang/Boolean;

    .line 54
    .line 55
    iget-object v3, p2, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->j:Ljava/util/List;

    .line 56
    .line 57
    iget-object v4, p2, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->i:Ljava/lang/Boolean;

    .line 58
    .line 59
    iget-object v5, p2, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->h:Ljava/util/List;

    .line 60
    .line 61
    iget-object v6, p2, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->f:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v7, p2, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->e:Ljava/lang/String;

    .line 64
    .line 65
    const/4 v8, 0x2

    .line 66
    invoke-interface {p1, p0, v8, v0}, Lly;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 v0, 0x3

    .line 70
    iget-object v8, p2, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->d:Ljava/lang/String;

    .line 71
    .line 72
    invoke-interface {p1, p0, v0, v8}, Lly;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    if-eqz v7, :cond_5

    .line 83
    .line 84
    :goto_2
    sget-object v0, Lvh2;->a:Lvh2;

    .line 85
    .line 86
    const/4 v8, 0x4

    .line 87
    invoke-interface {p1, p0, v8, v0, v7}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_6
    if-eqz v6, :cond_7

    .line 98
    .line 99
    :goto_3
    sget-object v0, Lvh2;->a:Lvh2;

    .line 100
    .line 101
    const/4 v7, 0x5

    .line 102
    invoke-interface {p1, p0, v7, v0, v6}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_7
    const/4 v0, 0x6

    .line 106
    iget-boolean p2, p2, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->g:Z

    .line 107
    .line 108
    invoke-interface {p1, p0, v0, p2}, Lly;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    if-eqz p2, :cond_8

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_8
    sget-object p2, Lnd0;->a:Lnd0;

    .line 119
    .line 120
    invoke-static {v5, p2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-nez p2, :cond_9

    .line 125
    .line 126
    :goto_4
    const/4 p2, 0x7

    .line 127
    aget-object v0, v2, p2

    .line 128
    .line 129
    invoke-interface {p1, p0, p2, v0, v5}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_9
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-eqz p2, :cond_a

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_a
    if-eqz v4, :cond_b

    .line 140
    .line 141
    :goto_5
    sget-object p2, Lfk;->a:Lfk;

    .line 142
    .line 143
    const/16 v0, 0x8

    .line 144
    .line 145
    invoke-interface {p1, p0, v0, p2, v4}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_b
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    if-eqz p2, :cond_c

    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_c
    if-eqz v3, :cond_d

    .line 156
    .line 157
    :goto_6
    const/16 p2, 0x9

    .line 158
    .line 159
    aget-object v0, v2, p2

    .line 160
    .line 161
    invoke-interface {p1, p0, p2, v0, v3}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :cond_d
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    if-eqz p2, :cond_e

    .line 169
    .line 170
    goto :goto_7

    .line 171
    :cond_e
    if-eqz v1, :cond_f

    .line 172
    .line 173
    :goto_7
    sget-object p2, Lfk;->a:Lfk;

    .line 174
    .line 175
    const/16 v0, 0xa

    .line 176
    .line 177
    invoke-interface {p1, p0, v0, p2, v1}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    :cond_f
    invoke-interface {p1, p0}, Lly;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 181
    .line 182
    .line 183
    return-void
.end method

.method public bridge synthetic serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 0

    .line 184
    check-cast p2, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;

    invoke-virtual {p0, p1, p2}, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$$serializer;->serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;)V

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

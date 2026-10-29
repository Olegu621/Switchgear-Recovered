.class public final Lcom/usercentrics/sdk/UsercentricsOptions$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Luq0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usercentrics/sdk/UsercentricsOptions;
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
        "com/usercentrics/sdk/UsercentricsOptions.$serializer",
        "Luq0;",
        "Lcom/usercentrics/sdk/UsercentricsOptions;",
        "<init>",
        "()V",
        "",
        "Lkotlinx/serialization/KSerializer;",
        "childSerializers",
        "()[Lkotlinx/serialization/KSerializer;",
        "Lkotlinx/serialization/encoding/Decoder;",
        "decoder",
        "deserialize",
        "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/UsercentricsOptions;",
        "Lkotlinx/serialization/encoding/Encoder;",
        "encoder",
        "value",
        "",
        "serialize",
        "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/UsercentricsOptions;)V",
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
.field public static final INSTANCE:Lcom/usercentrics/sdk/UsercentricsOptions$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/UsercentricsOptions$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/usercentrics/sdk/UsercentricsOptions$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/UsercentricsOptions$$serializer;->INSTANCE:Lcom/usercentrics/sdk/UsercentricsOptions$$serializer;

    .line 7
    .line 8
    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 9
    .line 10
    const-string v2, "com.usercentrics.sdk.UsercentricsOptions"

    .line 11
    .line 12
    const/16 v3, 0xa

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Luq0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "settingsId"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "defaultLanguage"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "version"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "timeoutMillis"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "loggerLevel"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "ruleSetId"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "consentMediation"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "domains"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "initTimeoutMillis"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "networkMode"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    sput-object v1, Lcom/usercentrics/sdk/UsercentricsOptions$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 69
    .line 70
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
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lkotlinx/serialization/KSerializer;"
        }
    .end annotation

    .line 1
    sget-object p0, Lcom/usercentrics/sdk/UsercentricsOptions;->k:[Lkotlinx/serialization/KSerializer;

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    aget-object v1, p0, v0

    .line 5
    .line 6
    sget-object v2, Lcom/usercentrics/sdk/UsercentricsDomains$$serializer;->INSTANCE:Lcom/usercentrics/sdk/UsercentricsDomains$$serializer;

    .line 7
    .line 8
    invoke-static {v2}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/16 v3, 0x9

    .line 13
    .line 14
    aget-object p0, p0, v3

    .line 15
    .line 16
    const/16 v4, 0xa

    .line 17
    .line 18
    new-array v4, v4, [Lkotlinx/serialization/KSerializer;

    .line 19
    .line 20
    sget-object v5, Lvh2;->a:Lvh2;

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    aput-object v5, v4, v6

    .line 24
    .line 25
    const/4 v6, 0x1

    .line 26
    aput-object v5, v4, v6

    .line 27
    .line 28
    const/4 v6, 0x2

    .line 29
    aput-object v5, v4, v6

    .line 30
    .line 31
    sget-object v6, Lsa1;->a:Lsa1;

    .line 32
    .line 33
    const/4 v7, 0x3

    .line 34
    aput-object v6, v4, v7

    .line 35
    .line 36
    aput-object v1, v4, v0

    .line 37
    .line 38
    const/4 v0, 0x5

    .line 39
    aput-object v5, v4, v0

    .line 40
    .line 41
    sget-object v0, Lfk;->a:Lfk;

    .line 42
    .line 43
    const/4 v1, 0x6

    .line 44
    aput-object v0, v4, v1

    .line 45
    .line 46
    const/4 v0, 0x7

    .line 47
    aput-object v2, v4, v0

    .line 48
    .line 49
    const/16 v0, 0x8

    .line 50
    .line 51
    aput-object v6, v4, v0

    .line 52
    .line 53
    aput-object p0, v4, v3

    .line 54
    .line 55
    return-object v4
.end method

.method public deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/UsercentricsOptions;
    .locals 19

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p0 .. p0}, Lcom/usercentrics/sdk/UsercentricsOptions$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

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
    sget-object v2, Lcom/usercentrics/sdk/UsercentricsOptions;->k:[Lkotlinx/serialization/KSerializer;

    .line 15
    .line 16
    const-wide/16 v6, 0x0

    .line 17
    .line 18
    move-wide v8, v6

    .line 19
    const/16 p0, 0x0

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v10, 0x1

    .line 25
    const/4 v11, 0x0

    .line 26
    const/4 v12, 0x0

    .line 27
    const/4 v13, 0x0

    .line 28
    const/4 v14, 0x0

    .line 29
    const/4 v15, 0x0

    .line 30
    const/16 v16, 0x0

    .line 31
    .line 32
    :goto_0
    if-eqz v10, :cond_0

    .line 33
    .line 34
    invoke-interface {v1, v0}, Lky;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 35
    .line 36
    .line 37
    move-result v17

    .line 38
    packed-switch v17, :pswitch_data_0

    .line 39
    .line 40
    .line 41
    invoke-static/range {v17 .. v17}, Ln4;->e(I)V

    .line 42
    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_0
    move-object/from16 v17, v2

    .line 46
    .line 47
    const/16 v2, 0x9

    .line 48
    .line 49
    move/from16 v18, v10

    .line 50
    .line 51
    aget-object v10, v17, v2

    .line 52
    .line 53
    invoke-interface {v1, v0, v2, v10, v3}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    move-object v3, v2

    .line 58
    check-cast v3, Lbn1;

    .line 59
    .line 60
    or-int/lit16 v11, v11, 0x200

    .line 61
    .line 62
    :goto_1
    move-object/from16 v2, v17

    .line 63
    .line 64
    move/from16 v10, v18

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :pswitch_1
    move-object/from16 v17, v2

    .line 68
    .line 69
    move/from16 v18, v10

    .line 70
    .line 71
    const/16 v2, 0x8

    .line 72
    .line 73
    invoke-interface {v1, v0, v2}, Lky;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;I)J

    .line 74
    .line 75
    .line 76
    move-result-wide v8

    .line 77
    or-int/lit16 v11, v11, 0x100

    .line 78
    .line 79
    :goto_2
    move-object/from16 v2, v17

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :pswitch_2
    move-object/from16 v17, v2

    .line 83
    .line 84
    move/from16 v18, v10

    .line 85
    .line 86
    sget-object v2, Lcom/usercentrics/sdk/UsercentricsDomains$$serializer;->INSTANCE:Lcom/usercentrics/sdk/UsercentricsDomains$$serializer;

    .line 87
    .line 88
    const/4 v10, 0x7

    .line 89
    invoke-interface {v1, v0, v10, v2, v4}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    move-object v4, v2

    .line 94
    check-cast v4, Lcom/usercentrics/sdk/UsercentricsDomains;

    .line 95
    .line 96
    or-int/lit16 v11, v11, 0x80

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :pswitch_3
    move-object/from16 v17, v2

    .line 100
    .line 101
    move/from16 v18, v10

    .line 102
    .line 103
    const/4 v2, 0x6

    .line 104
    invoke-interface {v1, v0, v2}, Lky;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 105
    .line 106
    .line 107
    move-result v16

    .line 108
    or-int/lit8 v11, v11, 0x40

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :pswitch_4
    move-object/from16 v17, v2

    .line 112
    .line 113
    move/from16 v18, v10

    .line 114
    .line 115
    const/4 v2, 0x5

    .line 116
    invoke-interface {v1, v0, v2}, Lky;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    or-int/lit8 v11, v11, 0x20

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :pswitch_5
    move-object/from16 v17, v2

    .line 124
    .line 125
    move/from16 v18, v10

    .line 126
    .line 127
    const/4 v2, 0x4

    .line 128
    aget-object v10, v17, v2

    .line 129
    .line 130
    invoke-interface {v1, v0, v2, v10, v15}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    move-object v15, v2

    .line 135
    check-cast v15, Ll03;

    .line 136
    .line 137
    or-int/lit8 v11, v11, 0x10

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :pswitch_6
    move-object/from16 v17, v2

    .line 141
    .line 142
    move/from16 v18, v10

    .line 143
    .line 144
    const/4 v2, 0x3

    .line 145
    invoke-interface {v1, v0, v2}, Lky;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;I)J

    .line 146
    .line 147
    .line 148
    move-result-wide v6

    .line 149
    or-int/lit8 v11, v11, 0x8

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :pswitch_7
    move-object/from16 v17, v2

    .line 153
    .line 154
    move/from16 v18, v10

    .line 155
    .line 156
    const/4 v2, 0x2

    .line 157
    invoke-interface {v1, v0, v2}, Lky;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v14

    .line 161
    or-int/lit8 v11, v11, 0x4

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :pswitch_8
    move-object/from16 v17, v2

    .line 165
    .line 166
    move/from16 v18, v10

    .line 167
    .line 168
    const/4 v2, 0x1

    .line 169
    invoke-interface {v1, v0, v2}, Lky;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v13

    .line 173
    or-int/lit8 v11, v11, 0x2

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :pswitch_9
    move-object/from16 v17, v2

    .line 177
    .line 178
    move/from16 v18, v10

    .line 179
    .line 180
    const/4 v2, 0x1

    .line 181
    const/4 v10, 0x0

    .line 182
    invoke-interface {v1, v0, v10}, Lky;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v12

    .line 186
    or-int/lit8 v11, v11, 0x1

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :pswitch_a
    const/4 v10, 0x0

    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :cond_0
    invoke-interface {v1, v0}, Lky;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 193
    .line 194
    .line 195
    new-instance v0, Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 196
    .line 197
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 198
    .line 199
    .line 200
    and-int/lit8 v1, v11, 0x1

    .line 201
    .line 202
    const-string v2, ""

    .line 203
    .line 204
    if-nez v1, :cond_1

    .line 205
    .line 206
    iput-object v2, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->a:Ljava/lang/String;

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_1
    iput-object v12, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->a:Ljava/lang/String;

    .line 210
    .line 211
    :goto_3
    and-int/lit8 v1, v11, 0x2

    .line 212
    .line 213
    if-nez v1, :cond_2

    .line 214
    .line 215
    iput-object v2, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->b:Ljava/lang/String;

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_2
    iput-object v13, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->b:Ljava/lang/String;

    .line 219
    .line 220
    :goto_4
    and-int/lit8 v1, v11, 0x4

    .line 221
    .line 222
    if-nez v1, :cond_3

    .line 223
    .line 224
    const-string v1, "latest"

    .line 225
    .line 226
    iput-object v1, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->c:Ljava/lang/String;

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_3
    iput-object v14, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->c:Ljava/lang/String;

    .line 230
    .line 231
    :goto_5
    and-int/lit8 v1, v11, 0x8

    .line 232
    .line 233
    const-wide/16 v12, 0x2710

    .line 234
    .line 235
    if-nez v1, :cond_4

    .line 236
    .line 237
    iput-wide v12, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->d:J

    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_4
    iput-wide v6, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->d:J

    .line 241
    .line 242
    :goto_6
    and-int/lit8 v1, v11, 0x10

    .line 243
    .line 244
    if-nez v1, :cond_5

    .line 245
    .line 246
    sget-object v1, Ll03;->a:Ll03;

    .line 247
    .line 248
    iput-object v1, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->e:Ll03;

    .line 249
    .line 250
    goto :goto_7

    .line 251
    :cond_5
    iput-object v15, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->e:Ll03;

    .line 252
    .line 253
    :goto_7
    and-int/lit8 v1, v11, 0x20

    .line 254
    .line 255
    if-nez v1, :cond_6

    .line 256
    .line 257
    iput-object v2, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->f:Ljava/lang/String;

    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_6
    iput-object v5, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->f:Ljava/lang/String;

    .line 261
    .line 262
    :goto_8
    and-int/lit8 v1, v11, 0x40

    .line 263
    .line 264
    if-nez v1, :cond_7

    .line 265
    .line 266
    const/4 v10, 0x0

    .line 267
    iput-boolean v10, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->g:Z

    .line 268
    .line 269
    goto :goto_9

    .line 270
    :cond_7
    move/from16 v1, v16

    .line 271
    .line 272
    iput-boolean v1, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->g:Z

    .line 273
    .line 274
    :goto_9
    and-int/lit16 v1, v11, 0x80

    .line 275
    .line 276
    if-nez v1, :cond_8

    .line 277
    .line 278
    move-object/from16 v1, p0

    .line 279
    .line 280
    iput-object v1, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->h:Lcom/usercentrics/sdk/UsercentricsDomains;

    .line 281
    .line 282
    goto :goto_a

    .line 283
    :cond_8
    iput-object v4, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->h:Lcom/usercentrics/sdk/UsercentricsDomains;

    .line 284
    .line 285
    :goto_a
    and-int/lit16 v1, v11, 0x100

    .line 286
    .line 287
    if-nez v1, :cond_9

    .line 288
    .line 289
    iput-wide v12, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->i:J

    .line 290
    .line 291
    goto :goto_b

    .line 292
    :cond_9
    iput-wide v8, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->i:J

    .line 293
    .line 294
    :goto_b
    and-int/lit16 v1, v11, 0x200

    .line 295
    .line 296
    if-nez v1, :cond_a

    .line 297
    .line 298
    sget-object v1, Lbn1;->a:Lbn1;

    .line 299
    .line 300
    iput-object v1, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->j:Lbn1;

    .line 301
    .line 302
    goto :goto_c

    .line 303
    :cond_a
    iput-object v3, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->j:Lbn1;

    .line 304
    .line 305
    :goto_c
    iget-object v1, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->a:Ljava/lang/String;

    .line 306
    .line 307
    invoke-static {v1}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    iput-object v1, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->a:Ljava/lang/String;

    .line 316
    .line 317
    iget-object v1, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->b:Ljava/lang/String;

    .line 318
    .line 319
    invoke-static {v1}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    iput-object v1, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->b:Ljava/lang/String;

    .line 328
    .line 329
    iget-object v1, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->f:Ljava/lang/String;

    .line 330
    .line 331
    invoke-static {v1}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    iput-object v1, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->f:Ljava/lang/String;

    .line 340
    .line 341
    return-object v0

    .line 342
    nop

    .line 343
    :pswitch_data_0
    .packed-switch -0x1
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

    .line 343
    invoke-virtual {p0, p1}, Lcom/usercentrics/sdk/UsercentricsOptions$$serializer;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/UsercentricsOptions;

    move-result-object p0

    return-object p0
.end method

.method public getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 0

    .line 1
    sget-object p0, Lcom/usercentrics/sdk/UsercentricsOptions$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 2
    .line 3
    return-object p0
.end method

.method public serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/UsercentricsOptions;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, Lcom/usercentrics/sdk/UsercentricsOptions;->h:Lcom/usercentrics/sdk/UsercentricsDomains;

    .line 8
    .line 9
    iget-object v1, p2, Lcom/usercentrics/sdk/UsercentricsOptions;->e:Ll03;

    .line 10
    .line 11
    iget-object v2, p2, Lcom/usercentrics/sdk/UsercentricsOptions;->c:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v3, p2, Lcom/usercentrics/sdk/UsercentricsOptions;->b:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v4, p2, Lcom/usercentrics/sdk/UsercentricsOptions;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/usercentrics/sdk/UsercentricsOptions$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p1, p0}, Lkotlinx/serialization/encoding/Encoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lly;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    sget-object v5, Lcom/usercentrics/sdk/UsercentricsOptions;->k:[Lkotlinx/serialization/KSerializer;

    .line 26
    .line 27
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    const-string v7, ""

    .line 32
    .line 33
    if-eqz v6, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-nez v6, :cond_1

    .line 41
    .line 42
    :goto_0
    const/4 v6, 0x0

    .line 43
    invoke-interface {p1, p0, v6, v4}, Lly;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_3

    .line 58
    .line 59
    :goto_1
    const/4 v4, 0x1

    .line 60
    invoke-interface {p1, p0, v4, v3}, Lly;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    const-string v3, "latest"

    .line 71
    .line 72
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-nez v3, :cond_5

    .line 77
    .line 78
    :goto_2
    const/4 v3, 0x2

    .line 79
    invoke-interface {p1, p0, v3, v2}, Lly;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_5
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    const-wide/16 v3, 0x2710

    .line 87
    .line 88
    if-eqz v2, :cond_6

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_6
    iget-wide v8, p2, Lcom/usercentrics/sdk/UsercentricsOptions;->d:J

    .line 92
    .line 93
    cmp-long v2, v8, v3

    .line 94
    .line 95
    if-eqz v2, :cond_7

    .line 96
    .line 97
    :goto_3
    iget-wide v8, p2, Lcom/usercentrics/sdk/UsercentricsOptions;->d:J

    .line 98
    .line 99
    const/4 v2, 0x3

    .line 100
    invoke-interface {p1, p0, v2, v8, v9}, Lly;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;IJ)V

    .line 101
    .line 102
    .line 103
    :cond_7
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_8

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_8
    sget-object v2, Ll03;->a:Ll03;

    .line 111
    .line 112
    if-eq v1, v2, :cond_9

    .line 113
    .line 114
    :goto_4
    const/4 v2, 0x4

    .line 115
    aget-object v6, v5, v2

    .line 116
    .line 117
    invoke-interface {p1, p0, v2, v6, v1}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_9
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_a

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_a
    iget-object v1, p2, Lcom/usercentrics/sdk/UsercentricsOptions;->f:Ljava/lang/String;

    .line 128
    .line 129
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-nez v1, :cond_b

    .line 134
    .line 135
    :goto_5
    iget-object v1, p2, Lcom/usercentrics/sdk/UsercentricsOptions;->f:Ljava/lang/String;

    .line 136
    .line 137
    const/4 v2, 0x5

    .line 138
    invoke-interface {p1, p0, v2, v1}, Lly;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 139
    .line 140
    .line 141
    :cond_b
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_c

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_c
    iget-boolean v1, p2, Lcom/usercentrics/sdk/UsercentricsOptions;->g:Z

    .line 149
    .line 150
    if-eqz v1, :cond_d

    .line 151
    .line 152
    :goto_6
    iget-boolean v1, p2, Lcom/usercentrics/sdk/UsercentricsOptions;->g:Z

    .line 153
    .line 154
    const/4 v2, 0x6

    .line 155
    invoke-interface {p1, p0, v2, v1}, Lly;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 156
    .line 157
    .line 158
    :cond_d
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_e

    .line 163
    .line 164
    goto :goto_7

    .line 165
    :cond_e
    if-eqz v0, :cond_f

    .line 166
    .line 167
    :goto_7
    sget-object v1, Lcom/usercentrics/sdk/UsercentricsDomains$$serializer;->INSTANCE:Lcom/usercentrics/sdk/UsercentricsDomains$$serializer;

    .line 168
    .line 169
    const/4 v2, 0x7

    .line 170
    invoke-interface {p1, p0, v2, v1, v0}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :cond_f
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-eqz v0, :cond_10

    .line 178
    .line 179
    goto :goto_8

    .line 180
    :cond_10
    iget-wide v0, p2, Lcom/usercentrics/sdk/UsercentricsOptions;->i:J

    .line 181
    .line 182
    cmp-long v0, v0, v3

    .line 183
    .line 184
    if-eqz v0, :cond_11

    .line 185
    .line 186
    :goto_8
    iget-wide v0, p2, Lcom/usercentrics/sdk/UsercentricsOptions;->i:J

    .line 187
    .line 188
    const/16 v2, 0x8

    .line 189
    .line 190
    invoke-interface {p1, p0, v2, v0, v1}, Lly;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;IJ)V

    .line 191
    .line 192
    .line 193
    :cond_11
    invoke-interface {p1, p0}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_12

    .line 198
    .line 199
    goto :goto_9

    .line 200
    :cond_12
    iget-object v0, p2, Lcom/usercentrics/sdk/UsercentricsOptions;->j:Lbn1;

    .line 201
    .line 202
    sget-object v1, Lbn1;->a:Lbn1;

    .line 203
    .line 204
    if-eq v0, v1, :cond_13

    .line 205
    .line 206
    :goto_9
    const/16 v0, 0x9

    .line 207
    .line 208
    aget-object v1, v5, v0

    .line 209
    .line 210
    iget-object p2, p2, Lcom/usercentrics/sdk/UsercentricsOptions;->j:Lbn1;

    .line 211
    .line 212
    invoke-interface {p1, p0, v0, v1, p2}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :cond_13
    invoke-interface {p1, p0}, Lly;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 216
    .line 217
    .line 218
    return-void
.end method

.method public bridge synthetic serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 0

    .line 219
    check-cast p2, Lcom/usercentrics/sdk/UsercentricsOptions;

    invoke-virtual {p0, p1, p2}, Lcom/usercentrics/sdk/UsercentricsOptions$$serializer;->serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/UsercentricsOptions;)V

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

.class public final Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Luq0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;
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
        "com/usercentrics/sdk/v2/settings/data/CustomizationColor.$serializer",
        "Luq0;",
        "Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;",
        "<init>",
        "()V",
        "",
        "Lkotlinx/serialization/KSerializer;",
        "childSerializers",
        "()[Lkotlinx/serialization/KSerializer;",
        "Lkotlinx/serialization/encoding/Decoder;",
        "decoder",
        "deserialize",
        "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;",
        "Lkotlinx/serialization/encoding/Encoder;",
        "encoder",
        "value",
        "",
        "serialize",
        "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;)V",
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
.field public static final INSTANCE:Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor$$serializer;

    .line 7
    .line 8
    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 9
    .line 10
    const-string v2, "com.usercentrics.sdk.v2.settings.data.CustomizationColor"

    .line 11
    .line 12
    const/16 v3, 0x16

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Luq0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "primary"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "acceptBtnText"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "acceptBtnBackground"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "denyBtnText"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "denyBtnBackground"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "saveBtnText"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "saveBtnBackground"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "linkIcon"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "linkFont"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "text"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "layerBackground"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string v0, "overlay"

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const-string v0, "toggleInactiveBackground"

    .line 79
    .line 80
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    const-string v0, "toggleInactiveIcon"

    .line 84
    .line 85
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 86
    .line 87
    .line 88
    const-string v0, "toggleActiveBackground"

    .line 89
    .line 90
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    const-string v0, "toggleActiveIcon"

    .line 94
    .line 95
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 96
    .line 97
    .line 98
    const-string v0, "toggleDisabledBackground"

    .line 99
    .line 100
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    const-string v0, "toggleDisabledIcon"

    .line 104
    .line 105
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 106
    .line 107
    .line 108
    const-string v0, "secondLayerTab"

    .line 109
    .line 110
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 111
    .line 112
    .line 113
    const-string v0, "tabsBorderColor"

    .line 114
    .line 115
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 116
    .line 117
    .line 118
    const-string v0, "ccpaButtonColor"

    .line 119
    .line 120
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 121
    .line 122
    .line 123
    const-string v0, "ccpaButtonTextColor"

    .line 124
    .line 125
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 126
    .line 127
    .line 128
    sput-object v1, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 129
    .line 130
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
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lkotlinx/serialization/KSerializer;"
        }
    .end annotation

    .line 1
    sget-object v0, Lvh2;->a:Lvh2;

    .line 2
    .line 3
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 36
    .line 37
    .line 38
    move-result-object v9

    .line 39
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 40
    .line 41
    .line 42
    move-result-object v10

    .line 43
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 48
    .line 49
    .line 50
    move-result-object v12

    .line 51
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 52
    .line 53
    .line 54
    move-result-object v13

    .line 55
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 56
    .line 57
    .line 58
    move-result-object v14

    .line 59
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 60
    .line 61
    .line 62
    move-result-object v15

    .line 63
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 64
    .line 65
    .line 66
    move-result-object v16

    .line 67
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 68
    .line 69
    .line 70
    move-result-object v17

    .line 71
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 72
    .line 73
    .line 74
    move-result-object v18

    .line 75
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 76
    .line 77
    .line 78
    move-result-object v19

    .line 79
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 80
    .line 81
    .line 82
    move-result-object v20

    .line 83
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 84
    .line 85
    .line 86
    move-result-object v21

    .line 87
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    move-object/from16 p0, v0

    .line 92
    .line 93
    const/16 v0, 0x16

    .line 94
    .line 95
    new-array v0, v0, [Lkotlinx/serialization/KSerializer;

    .line 96
    .line 97
    const/16 v22, 0x0

    .line 98
    .line 99
    aput-object v1, v0, v22

    .line 100
    .line 101
    const/4 v1, 0x1

    .line 102
    aput-object v2, v0, v1

    .line 103
    .line 104
    const/4 v1, 0x2

    .line 105
    aput-object v3, v0, v1

    .line 106
    .line 107
    const/4 v1, 0x3

    .line 108
    aput-object v4, v0, v1

    .line 109
    .line 110
    const/4 v1, 0x4

    .line 111
    aput-object v5, v0, v1

    .line 112
    .line 113
    const/4 v1, 0x5

    .line 114
    aput-object v6, v0, v1

    .line 115
    .line 116
    const/4 v1, 0x6

    .line 117
    aput-object v7, v0, v1

    .line 118
    .line 119
    const/4 v1, 0x7

    .line 120
    aput-object v8, v0, v1

    .line 121
    .line 122
    const/16 v1, 0x8

    .line 123
    .line 124
    aput-object v9, v0, v1

    .line 125
    .line 126
    const/16 v1, 0x9

    .line 127
    .line 128
    aput-object v10, v0, v1

    .line 129
    .line 130
    const/16 v1, 0xa

    .line 131
    .line 132
    aput-object v11, v0, v1

    .line 133
    .line 134
    const/16 v1, 0xb

    .line 135
    .line 136
    aput-object v12, v0, v1

    .line 137
    .line 138
    const/16 v1, 0xc

    .line 139
    .line 140
    aput-object v13, v0, v1

    .line 141
    .line 142
    const/16 v1, 0xd

    .line 143
    .line 144
    aput-object v14, v0, v1

    .line 145
    .line 146
    const/16 v1, 0xe

    .line 147
    .line 148
    aput-object v15, v0, v1

    .line 149
    .line 150
    const/16 v1, 0xf

    .line 151
    .line 152
    aput-object v16, v0, v1

    .line 153
    .line 154
    const/16 v1, 0x10

    .line 155
    .line 156
    aput-object v17, v0, v1

    .line 157
    .line 158
    const/16 v1, 0x11

    .line 159
    .line 160
    aput-object v18, v0, v1

    .line 161
    .line 162
    const/16 v1, 0x12

    .line 163
    .line 164
    aput-object v19, v0, v1

    .line 165
    .line 166
    const/16 v1, 0x13

    .line 167
    .line 168
    aput-object v20, v0, v1

    .line 169
    .line 170
    const/16 v1, 0x14

    .line 171
    .line 172
    aput-object v21, v0, v1

    .line 173
    .line 174
    const/16 v1, 0x15

    .line 175
    .line 176
    aput-object p0, v0, v1

    .line 177
    .line 178
    return-object v0
.end method

.method public deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;
    .locals 30

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p0 .. p0}, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

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
    const/16 p0, 0x0

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v10, 0x0

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
    const/16 v17, 0x1

    .line 31
    .line 32
    const/16 v18, 0x0

    .line 33
    .line 34
    const/16 v19, 0x0

    .line 35
    .line 36
    const/16 v20, 0x0

    .line 37
    .line 38
    const/16 v21, 0x0

    .line 39
    .line 40
    const/16 v22, 0x0

    .line 41
    .line 42
    const/16 v23, 0x0

    .line 43
    .line 44
    const/16 v24, 0x0

    .line 45
    .line 46
    const/16 v25, 0x0

    .line 47
    .line 48
    const/16 v26, 0x0

    .line 49
    .line 50
    :goto_0
    if-eqz v17, :cond_0

    .line 51
    .line 52
    invoke-interface {v1, v0}, Lky;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 53
    .line 54
    .line 55
    move-result v27

    .line 56
    packed-switch v27, :pswitch_data_0

    .line 57
    .line 58
    .line 59
    invoke-static/range {v27 .. v27}, Ln4;->e(I)V

    .line 60
    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_0
    move-object/from16 v27, v4

    .line 64
    .line 65
    const/16 v4, 0x15

    .line 66
    .line 67
    move-object/from16 v28, v3

    .line 68
    .line 69
    sget-object v3, Lvh2;->a:Lvh2;

    .line 70
    .line 71
    invoke-interface {v1, v0, v4, v3, v6}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    move-object v6, v3

    .line 76
    check-cast v6, Ljava/lang/String;

    .line 77
    .line 78
    const/high16 v3, 0x200000

    .line 79
    .line 80
    :goto_1
    or-int/2addr v7, v3

    .line 81
    :goto_2
    move-object/from16 v4, v27

    .line 82
    .line 83
    move-object/from16 v3, v28

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :pswitch_1
    move-object/from16 v28, v3

    .line 87
    .line 88
    move-object/from16 v27, v4

    .line 89
    .line 90
    sget-object v3, Lvh2;->a:Lvh2;

    .line 91
    .line 92
    const/16 v4, 0x14

    .line 93
    .line 94
    invoke-interface {v1, v0, v4, v3, v15}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    move-object v15, v3

    .line 99
    check-cast v15, Ljava/lang/String;

    .line 100
    .line 101
    const/high16 v3, 0x100000

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :pswitch_2
    move-object/from16 v28, v3

    .line 105
    .line 106
    move-object/from16 v27, v4

    .line 107
    .line 108
    sget-object v3, Lvh2;->a:Lvh2;

    .line 109
    .line 110
    const/16 v4, 0x13

    .line 111
    .line 112
    invoke-interface {v1, v0, v4, v3, v14}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    move-object v14, v3

    .line 117
    check-cast v14, Ljava/lang/String;

    .line 118
    .line 119
    const/high16 v3, 0x80000

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :pswitch_3
    move-object/from16 v28, v3

    .line 123
    .line 124
    move-object/from16 v27, v4

    .line 125
    .line 126
    sget-object v3, Lvh2;->a:Lvh2;

    .line 127
    .line 128
    const/16 v4, 0x12

    .line 129
    .line 130
    invoke-interface {v1, v0, v4, v3, v13}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    move-object v13, v3

    .line 135
    check-cast v13, Ljava/lang/String;

    .line 136
    .line 137
    const/high16 v3, 0x40000

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :pswitch_4
    move-object/from16 v28, v3

    .line 141
    .line 142
    move-object/from16 v27, v4

    .line 143
    .line 144
    sget-object v3, Lvh2;->a:Lvh2;

    .line 145
    .line 146
    const/16 v4, 0x11

    .line 147
    .line 148
    invoke-interface {v1, v0, v4, v3, v12}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    move-object v12, v3

    .line 153
    check-cast v12, Ljava/lang/String;

    .line 154
    .line 155
    const/high16 v3, 0x20000

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :pswitch_5
    move-object/from16 v28, v3

    .line 159
    .line 160
    move-object/from16 v27, v4

    .line 161
    .line 162
    sget-object v3, Lvh2;->a:Lvh2;

    .line 163
    .line 164
    const/16 v4, 0x10

    .line 165
    .line 166
    invoke-interface {v1, v0, v4, v3, v11}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    move-object v11, v3

    .line 171
    check-cast v11, Ljava/lang/String;

    .line 172
    .line 173
    const/high16 v3, 0x10000

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :pswitch_6
    move-object/from16 v28, v3

    .line 177
    .line 178
    move-object/from16 v27, v4

    .line 179
    .line 180
    sget-object v3, Lvh2;->a:Lvh2;

    .line 181
    .line 182
    const/16 v4, 0xf

    .line 183
    .line 184
    invoke-interface {v1, v0, v4, v3, v10}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    move-object v10, v3

    .line 189
    check-cast v10, Ljava/lang/String;

    .line 190
    .line 191
    const v3, 0x8000

    .line 192
    .line 193
    .line 194
    goto :goto_1

    .line 195
    :pswitch_7
    move-object/from16 v28, v3

    .line 196
    .line 197
    move-object/from16 v27, v4

    .line 198
    .line 199
    sget-object v3, Lvh2;->a:Lvh2;

    .line 200
    .line 201
    const/16 v4, 0xe

    .line 202
    .line 203
    invoke-interface {v1, v0, v4, v3, v9}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    move-object v9, v3

    .line 208
    check-cast v9, Ljava/lang/String;

    .line 209
    .line 210
    or-int/lit16 v7, v7, 0x4000

    .line 211
    .line 212
    goto/16 :goto_2

    .line 213
    .line 214
    :pswitch_8
    move-object/from16 v28, v3

    .line 215
    .line 216
    move-object/from16 v27, v4

    .line 217
    .line 218
    sget-object v3, Lvh2;->a:Lvh2;

    .line 219
    .line 220
    const/16 v4, 0xd

    .line 221
    .line 222
    invoke-interface {v1, v0, v4, v3, v8}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    move-object v8, v3

    .line 227
    check-cast v8, Ljava/lang/String;

    .line 228
    .line 229
    or-int/lit16 v7, v7, 0x2000

    .line 230
    .line 231
    goto/16 :goto_2

    .line 232
    .line 233
    :pswitch_9
    move-object/from16 v28, v3

    .line 234
    .line 235
    move-object/from16 v27, v4

    .line 236
    .line 237
    sget-object v3, Lvh2;->a:Lvh2;

    .line 238
    .line 239
    const/16 v4, 0xc

    .line 240
    .line 241
    invoke-interface {v1, v0, v4, v3, v5}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    move-object v5, v3

    .line 246
    check-cast v5, Ljava/lang/String;

    .line 247
    .line 248
    or-int/lit16 v7, v7, 0x1000

    .line 249
    .line 250
    goto/16 :goto_2

    .line 251
    .line 252
    :pswitch_a
    move-object/from16 v28, v3

    .line 253
    .line 254
    move-object/from16 v27, v4

    .line 255
    .line 256
    sget-object v3, Lvh2;->a:Lvh2;

    .line 257
    .line 258
    const/16 v4, 0xb

    .line 259
    .line 260
    invoke-interface {v1, v0, v4, v3, v2}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    check-cast v2, Ljava/lang/String;

    .line 265
    .line 266
    or-int/lit16 v7, v7, 0x800

    .line 267
    .line 268
    goto/16 :goto_2

    .line 269
    .line 270
    :pswitch_b
    move-object/from16 v28, v3

    .line 271
    .line 272
    move-object/from16 v27, v4

    .line 273
    .line 274
    sget-object v3, Lvh2;->a:Lvh2;

    .line 275
    .line 276
    const/16 v4, 0xa

    .line 277
    .line 278
    move-object/from16 v29, v2

    .line 279
    .line 280
    move-object/from16 v2, v28

    .line 281
    .line 282
    invoke-interface {v1, v0, v4, v3, v2}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    move-object v3, v2

    .line 287
    check-cast v3, Ljava/lang/String;

    .line 288
    .line 289
    or-int/lit16 v7, v7, 0x400

    .line 290
    .line 291
    move-object/from16 v4, v27

    .line 292
    .line 293
    :goto_3
    move-object/from16 v2, v29

    .line 294
    .line 295
    goto/16 :goto_0

    .line 296
    .line 297
    :pswitch_c
    move-object/from16 v29, v2

    .line 298
    .line 299
    move-object v2, v3

    .line 300
    move-object/from16 v27, v4

    .line 301
    .line 302
    sget-object v3, Lvh2;->a:Lvh2;

    .line 303
    .line 304
    const/16 v4, 0x9

    .line 305
    .line 306
    move-object/from16 v28, v2

    .line 307
    .line 308
    move-object/from16 v2, v27

    .line 309
    .line 310
    invoke-interface {v1, v0, v4, v3, v2}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    move-object v4, v2

    .line 315
    check-cast v4, Ljava/lang/String;

    .line 316
    .line 317
    or-int/lit16 v7, v7, 0x200

    .line 318
    .line 319
    :goto_4
    move-object/from16 v3, v28

    .line 320
    .line 321
    goto :goto_3

    .line 322
    :pswitch_d
    move-object/from16 v29, v2

    .line 323
    .line 324
    move-object/from16 v28, v3

    .line 325
    .line 326
    move-object v2, v4

    .line 327
    sget-object v3, Lvh2;->a:Lvh2;

    .line 328
    .line 329
    const/16 v4, 0x8

    .line 330
    .line 331
    move-object/from16 v27, v2

    .line 332
    .line 333
    move-object/from16 v2, v26

    .line 334
    .line 335
    invoke-interface {v1, v0, v4, v3, v2}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    move-object/from16 v26, v2

    .line 340
    .line 341
    check-cast v26, Ljava/lang/String;

    .line 342
    .line 343
    or-int/lit16 v7, v7, 0x100

    .line 344
    .line 345
    :goto_5
    move-object/from16 v4, v27

    .line 346
    .line 347
    goto :goto_4

    .line 348
    :pswitch_e
    move-object/from16 v29, v2

    .line 349
    .line 350
    move-object/from16 v28, v3

    .line 351
    .line 352
    move-object/from16 v27, v4

    .line 353
    .line 354
    move-object/from16 v2, v26

    .line 355
    .line 356
    sget-object v3, Lvh2;->a:Lvh2;

    .line 357
    .line 358
    const/4 v4, 0x7

    .line 359
    move-object/from16 v2, v25

    .line 360
    .line 361
    invoke-interface {v1, v0, v4, v3, v2}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    move-object/from16 v25, v2

    .line 366
    .line 367
    check-cast v25, Ljava/lang/String;

    .line 368
    .line 369
    or-int/lit16 v7, v7, 0x80

    .line 370
    .line 371
    goto :goto_5

    .line 372
    :pswitch_f
    move-object/from16 v29, v2

    .line 373
    .line 374
    move-object/from16 v28, v3

    .line 375
    .line 376
    move-object/from16 v27, v4

    .line 377
    .line 378
    move-object/from16 v2, v25

    .line 379
    .line 380
    sget-object v3, Lvh2;->a:Lvh2;

    .line 381
    .line 382
    const/4 v4, 0x6

    .line 383
    move-object/from16 v2, v24

    .line 384
    .line 385
    invoke-interface {v1, v0, v4, v3, v2}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    move-object/from16 v24, v2

    .line 390
    .line 391
    check-cast v24, Ljava/lang/String;

    .line 392
    .line 393
    or-int/lit8 v7, v7, 0x40

    .line 394
    .line 395
    goto :goto_5

    .line 396
    :pswitch_10
    move-object/from16 v29, v2

    .line 397
    .line 398
    move-object/from16 v28, v3

    .line 399
    .line 400
    move-object/from16 v27, v4

    .line 401
    .line 402
    move-object/from16 v2, v24

    .line 403
    .line 404
    sget-object v3, Lvh2;->a:Lvh2;

    .line 405
    .line 406
    const/4 v4, 0x5

    .line 407
    move-object/from16 v2, v23

    .line 408
    .line 409
    invoke-interface {v1, v0, v4, v3, v2}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    move-object/from16 v23, v2

    .line 414
    .line 415
    check-cast v23, Ljava/lang/String;

    .line 416
    .line 417
    or-int/lit8 v7, v7, 0x20

    .line 418
    .line 419
    goto :goto_5

    .line 420
    :pswitch_11
    move-object/from16 v29, v2

    .line 421
    .line 422
    move-object/from16 v28, v3

    .line 423
    .line 424
    move-object/from16 v27, v4

    .line 425
    .line 426
    move-object/from16 v2, v23

    .line 427
    .line 428
    sget-object v3, Lvh2;->a:Lvh2;

    .line 429
    .line 430
    const/4 v4, 0x4

    .line 431
    move-object/from16 v2, v22

    .line 432
    .line 433
    invoke-interface {v1, v0, v4, v3, v2}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    move-object/from16 v22, v2

    .line 438
    .line 439
    check-cast v22, Ljava/lang/String;

    .line 440
    .line 441
    or-int/lit8 v7, v7, 0x10

    .line 442
    .line 443
    goto :goto_5

    .line 444
    :pswitch_12
    move-object/from16 v29, v2

    .line 445
    .line 446
    move-object/from16 v28, v3

    .line 447
    .line 448
    move-object/from16 v27, v4

    .line 449
    .line 450
    move-object/from16 v2, v22

    .line 451
    .line 452
    sget-object v3, Lvh2;->a:Lvh2;

    .line 453
    .line 454
    const/4 v4, 0x3

    .line 455
    move-object/from16 v2, v21

    .line 456
    .line 457
    invoke-interface {v1, v0, v4, v3, v2}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    move-object/from16 v21, v2

    .line 462
    .line 463
    check-cast v21, Ljava/lang/String;

    .line 464
    .line 465
    or-int/lit8 v7, v7, 0x8

    .line 466
    .line 467
    goto :goto_5

    .line 468
    :pswitch_13
    move-object/from16 v29, v2

    .line 469
    .line 470
    move-object/from16 v28, v3

    .line 471
    .line 472
    move-object/from16 v27, v4

    .line 473
    .line 474
    move-object/from16 v2, v21

    .line 475
    .line 476
    sget-object v3, Lvh2;->a:Lvh2;

    .line 477
    .line 478
    const/4 v4, 0x2

    .line 479
    move-object/from16 v2, v20

    .line 480
    .line 481
    invoke-interface {v1, v0, v4, v3, v2}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    move-object/from16 v20, v2

    .line 486
    .line 487
    check-cast v20, Ljava/lang/String;

    .line 488
    .line 489
    or-int/lit8 v7, v7, 0x4

    .line 490
    .line 491
    goto/16 :goto_5

    .line 492
    .line 493
    :pswitch_14
    move-object/from16 v29, v2

    .line 494
    .line 495
    move-object/from16 v28, v3

    .line 496
    .line 497
    move-object/from16 v27, v4

    .line 498
    .line 499
    move-object/from16 v2, v20

    .line 500
    .line 501
    sget-object v3, Lvh2;->a:Lvh2;

    .line 502
    .line 503
    move-object/from16 v16, v2

    .line 504
    .line 505
    move-object/from16 v4, v19

    .line 506
    .line 507
    const/4 v2, 0x1

    .line 508
    invoke-interface {v1, v0, v2, v3, v4}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    move-object/from16 v19, v3

    .line 513
    .line 514
    check-cast v19, Ljava/lang/String;

    .line 515
    .line 516
    or-int/lit8 v7, v7, 0x2

    .line 517
    .line 518
    move-object/from16 v20, v16

    .line 519
    .line 520
    goto/16 :goto_5

    .line 521
    .line 522
    :pswitch_15
    move-object/from16 v29, v2

    .line 523
    .line 524
    move-object/from16 v28, v3

    .line 525
    .line 526
    move-object/from16 v27, v4

    .line 527
    .line 528
    move-object/from16 v4, v19

    .line 529
    .line 530
    move-object/from16 v16, v20

    .line 531
    .line 532
    const/4 v2, 0x1

    .line 533
    sget-object v3, Lvh2;->a:Lvh2;

    .line 534
    .line 535
    move-object/from16 v2, v18

    .line 536
    .line 537
    move-object/from16 v18, v4

    .line 538
    .line 539
    const/4 v4, 0x0

    .line 540
    invoke-interface {v1, v0, v4, v3, v2}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    check-cast v2, Ljava/lang/String;

    .line 545
    .line 546
    or-int/lit8 v7, v7, 0x1

    .line 547
    .line 548
    move-object/from16 v19, v18

    .line 549
    .line 550
    move-object/from16 v4, v27

    .line 551
    .line 552
    move-object/from16 v3, v28

    .line 553
    .line 554
    :goto_6
    move-object/from16 v18, v2

    .line 555
    .line 556
    goto/16 :goto_3

    .line 557
    .line 558
    :pswitch_16
    move-object/from16 v29, v2

    .line 559
    .line 560
    move-object/from16 v28, v3

    .line 561
    .line 562
    move-object/from16 v27, v4

    .line 563
    .line 564
    move-object/from16 v2, v18

    .line 565
    .line 566
    move-object/from16 v18, v19

    .line 567
    .line 568
    move-object/from16 v16, v20

    .line 569
    .line 570
    const/4 v4, 0x0

    .line 571
    move/from16 v17, v4

    .line 572
    .line 573
    move-object/from16 v4, v27

    .line 574
    .line 575
    goto :goto_6

    .line 576
    :cond_0
    move-object/from16 v29, v2

    .line 577
    .line 578
    move-object/from16 v28, v3

    .line 579
    .line 580
    move-object/from16 v27, v4

    .line 581
    .line 582
    move-object/from16 v2, v18

    .line 583
    .line 584
    move-object/from16 v18, v19

    .line 585
    .line 586
    move-object/from16 v16, v20

    .line 587
    .line 588
    invoke-interface {v1, v0}, Lky;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 589
    .line 590
    .line 591
    move-object/from16 v19, v29

    .line 592
    .line 593
    move-object/from16 v29, v6

    .line 594
    .line 595
    new-instance v6, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;

    .line 596
    .line 597
    move-object/from16 v17, v22

    .line 598
    .line 599
    move-object/from16 v22, v9

    .line 600
    .line 601
    move-object/from16 v9, v18

    .line 602
    .line 603
    move-object/from16 v18, v28

    .line 604
    .line 605
    move-object/from16 v28, v15

    .line 606
    .line 607
    move-object/from16 v15, v25

    .line 608
    .line 609
    move-object/from16 v25, v12

    .line 610
    .line 611
    move-object/from16 v12, v17

    .line 612
    .line 613
    move-object/from16 v17, v23

    .line 614
    .line 615
    move-object/from16 v23, v10

    .line 616
    .line 617
    move-object/from16 v10, v16

    .line 618
    .line 619
    move-object/from16 v16, v26

    .line 620
    .line 621
    move-object/from16 v26, v13

    .line 622
    .line 623
    move-object/from16 v13, v17

    .line 624
    .line 625
    move-object/from16 v20, v5

    .line 626
    .line 627
    move-object/from16 v17, v27

    .line 628
    .line 629
    move-object/from16 v27, v14

    .line 630
    .line 631
    move-object/from16 v14, v24

    .line 632
    .line 633
    move-object/from16 v24, v11

    .line 634
    .line 635
    move-object/from16 v11, v21

    .line 636
    .line 637
    move-object/from16 v21, v8

    .line 638
    .line 639
    move-object v8, v2

    .line 640
    invoke-direct/range {v6 .. v29}, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    return-object v6

    .line 644
    nop

    .line 645
    :pswitch_data_0
    .packed-switch -0x1
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

    .line 645
    invoke-virtual {p0, p1}, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor$$serializer;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;

    move-result-object p0

    return-object p0
.end method

.method public getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 0

    .line 1
    sget-object p0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 2
    .line 3
    return-object p0
.end method

.method public serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;)V
    .locals 26

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->v:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->u:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v3, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->t:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v4, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->s:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v5, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->r:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v6, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->q:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v7, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->p:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v8, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->o:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v9, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->n:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v10, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->m:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v11, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->l:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v12, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->k:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v13, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->j:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v14, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->i:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v15, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->h:Ljava/lang/String;

    .line 38
    .line 39
    move-object/from16 v16, v1

    .line 40
    .line 41
    iget-object v1, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->g:Ljava/lang/String;

    .line 42
    .line 43
    move-object/from16 v17, v2

    .line 44
    .line 45
    iget-object v2, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->f:Ljava/lang/String;

    .line 46
    .line 47
    move-object/from16 v18, v3

    .line 48
    .line 49
    iget-object v3, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->e:Ljava/lang/String;

    .line 50
    .line 51
    move-object/from16 v19, v4

    .line 52
    .line 53
    iget-object v4, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->d:Ljava/lang/String;

    .line 54
    .line 55
    move-object/from16 v20, v5

    .line 56
    .line 57
    iget-object v5, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->c:Ljava/lang/String;

    .line 58
    .line 59
    move-object/from16 v21, v6

    .line 60
    .line 61
    iget-object v6, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->b:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v0, v0, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;->a:Ljava/lang/String;

    .line 64
    .line 65
    move-object/from16 v22, v7

    .line 66
    .line 67
    invoke-virtual/range {p0 .. p0}, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    move-object/from16 v23, v8

    .line 72
    .line 73
    move-object/from16 v8, p1

    .line 74
    .line 75
    invoke-interface {v8, v7}, Lkotlinx/serialization/encoding/Encoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lly;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 80
    .line 81
    .line 82
    move-result v24

    .line 83
    if-eqz v24, :cond_0

    .line 84
    .line 85
    :goto_0
    move-object/from16 v24, v9

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_0
    if-eqz v0, :cond_1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :goto_1
    sget-object v9, Lvh2;->a:Lvh2;

    .line 92
    .line 93
    move-object/from16 v25, v10

    .line 94
    .line 95
    const/4 v10, 0x0

    .line 96
    invoke-interface {v8, v7, v10, v9, v0}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_1
    move-object/from16 v24, v9

    .line 101
    .line 102
    move-object/from16 v25, v10

    .line 103
    .line 104
    :goto_2
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_2

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_2
    if-eqz v6, :cond_3

    .line 112
    .line 113
    :goto_3
    sget-object v0, Lvh2;->a:Lvh2;

    .line 114
    .line 115
    const/4 v9, 0x1

    .line 116
    invoke-interface {v8, v7, v9, v0, v6}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_3
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_4

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_4
    if-eqz v5, :cond_5

    .line 127
    .line 128
    :goto_4
    sget-object v0, Lvh2;->a:Lvh2;

    .line 129
    .line 130
    const/4 v6, 0x2

    .line 131
    invoke-interface {v8, v7, v6, v0, v5}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_5
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_6

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_6
    if-eqz v4, :cond_7

    .line 142
    .line 143
    :goto_5
    sget-object v0, Lvh2;->a:Lvh2;

    .line 144
    .line 145
    const/4 v5, 0x3

    .line 146
    invoke-interface {v8, v7, v5, v0, v4}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :cond_7
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_8

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_8
    if-eqz v3, :cond_9

    .line 157
    .line 158
    :goto_6
    sget-object v0, Lvh2;->a:Lvh2;

    .line 159
    .line 160
    const/4 v4, 0x4

    .line 161
    invoke-interface {v8, v7, v4, v0, v3}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :cond_9
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_a

    .line 169
    .line 170
    goto :goto_7

    .line 171
    :cond_a
    if-eqz v2, :cond_b

    .line 172
    .line 173
    :goto_7
    sget-object v0, Lvh2;->a:Lvh2;

    .line 174
    .line 175
    const/4 v3, 0x5

    .line 176
    invoke-interface {v8, v7, v3, v0, v2}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :cond_b
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_c

    .line 184
    .line 185
    goto :goto_8

    .line 186
    :cond_c
    if-eqz v1, :cond_d

    .line 187
    .line 188
    :goto_8
    sget-object v0, Lvh2;->a:Lvh2;

    .line 189
    .line 190
    const/4 v2, 0x6

    .line 191
    invoke-interface {v8, v7, v2, v0, v1}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    :cond_d
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_e

    .line 199
    .line 200
    goto :goto_9

    .line 201
    :cond_e
    if-eqz v15, :cond_f

    .line 202
    .line 203
    :goto_9
    sget-object v0, Lvh2;->a:Lvh2;

    .line 204
    .line 205
    const/4 v1, 0x7

    .line 206
    invoke-interface {v8, v7, v1, v0, v15}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    :cond_f
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_10

    .line 214
    .line 215
    goto :goto_a

    .line 216
    :cond_10
    if-eqz v14, :cond_11

    .line 217
    .line 218
    :goto_a
    sget-object v0, Lvh2;->a:Lvh2;

    .line 219
    .line 220
    const/16 v1, 0x8

    .line 221
    .line 222
    invoke-interface {v8, v7, v1, v0, v14}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :cond_11
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_12

    .line 230
    .line 231
    goto :goto_b

    .line 232
    :cond_12
    if-eqz v13, :cond_13

    .line 233
    .line 234
    :goto_b
    sget-object v0, Lvh2;->a:Lvh2;

    .line 235
    .line 236
    const/16 v1, 0x9

    .line 237
    .line 238
    invoke-interface {v8, v7, v1, v0, v13}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    :cond_13
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-eqz v0, :cond_14

    .line 246
    .line 247
    goto :goto_c

    .line 248
    :cond_14
    if-eqz v12, :cond_15

    .line 249
    .line 250
    :goto_c
    sget-object v0, Lvh2;->a:Lvh2;

    .line 251
    .line 252
    const/16 v1, 0xa

    .line 253
    .line 254
    invoke-interface {v8, v7, v1, v0, v12}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    :cond_15
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_16

    .line 262
    .line 263
    goto :goto_d

    .line 264
    :cond_16
    if-eqz v11, :cond_17

    .line 265
    .line 266
    :goto_d
    sget-object v0, Lvh2;->a:Lvh2;

    .line 267
    .line 268
    const/16 v1, 0xb

    .line 269
    .line 270
    invoke-interface {v8, v7, v1, v0, v11}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    :cond_17
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_18

    .line 278
    .line 279
    goto :goto_e

    .line 280
    :cond_18
    if-eqz v25, :cond_19

    .line 281
    .line 282
    :goto_e
    sget-object v0, Lvh2;->a:Lvh2;

    .line 283
    .line 284
    const/16 v1, 0xc

    .line 285
    .line 286
    move-object/from16 v2, v25

    .line 287
    .line 288
    invoke-interface {v8, v7, v1, v0, v2}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    :cond_19
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-eqz v0, :cond_1a

    .line 296
    .line 297
    goto :goto_f

    .line 298
    :cond_1a
    if-eqz v24, :cond_1b

    .line 299
    .line 300
    :goto_f
    sget-object v0, Lvh2;->a:Lvh2;

    .line 301
    .line 302
    const/16 v1, 0xd

    .line 303
    .line 304
    move-object/from16 v2, v24

    .line 305
    .line 306
    invoke-interface {v8, v7, v1, v0, v2}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    :cond_1b
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-eqz v0, :cond_1c

    .line 314
    .line 315
    goto :goto_10

    .line 316
    :cond_1c
    if-eqz v23, :cond_1d

    .line 317
    .line 318
    :goto_10
    sget-object v0, Lvh2;->a:Lvh2;

    .line 319
    .line 320
    const/16 v1, 0xe

    .line 321
    .line 322
    move-object/from16 v2, v23

    .line 323
    .line 324
    invoke-interface {v8, v7, v1, v0, v2}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    :cond_1d
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    if-eqz v0, :cond_1e

    .line 332
    .line 333
    goto :goto_11

    .line 334
    :cond_1e
    if-eqz v22, :cond_1f

    .line 335
    .line 336
    :goto_11
    sget-object v0, Lvh2;->a:Lvh2;

    .line 337
    .line 338
    const/16 v1, 0xf

    .line 339
    .line 340
    move-object/from16 v2, v22

    .line 341
    .line 342
    invoke-interface {v8, v7, v1, v0, v2}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    :cond_1f
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    if-eqz v0, :cond_20

    .line 350
    .line 351
    goto :goto_12

    .line 352
    :cond_20
    if-eqz v21, :cond_21

    .line 353
    .line 354
    :goto_12
    sget-object v0, Lvh2;->a:Lvh2;

    .line 355
    .line 356
    const/16 v1, 0x10

    .line 357
    .line 358
    move-object/from16 v2, v21

    .line 359
    .line 360
    invoke-interface {v8, v7, v1, v0, v2}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    :cond_21
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    if-eqz v0, :cond_22

    .line 368
    .line 369
    goto :goto_13

    .line 370
    :cond_22
    if-eqz v20, :cond_23

    .line 371
    .line 372
    :goto_13
    sget-object v0, Lvh2;->a:Lvh2;

    .line 373
    .line 374
    const/16 v1, 0x11

    .line 375
    .line 376
    move-object/from16 v2, v20

    .line 377
    .line 378
    invoke-interface {v8, v7, v1, v0, v2}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    :cond_23
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-eqz v0, :cond_24

    .line 386
    .line 387
    goto :goto_14

    .line 388
    :cond_24
    if-eqz v19, :cond_25

    .line 389
    .line 390
    :goto_14
    sget-object v0, Lvh2;->a:Lvh2;

    .line 391
    .line 392
    const/16 v1, 0x12

    .line 393
    .line 394
    move-object/from16 v2, v19

    .line 395
    .line 396
    invoke-interface {v8, v7, v1, v0, v2}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    :cond_25
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    if-eqz v0, :cond_26

    .line 404
    .line 405
    goto :goto_15

    .line 406
    :cond_26
    if-eqz v18, :cond_27

    .line 407
    .line 408
    :goto_15
    sget-object v0, Lvh2;->a:Lvh2;

    .line 409
    .line 410
    const/16 v1, 0x13

    .line 411
    .line 412
    move-object/from16 v2, v18

    .line 413
    .line 414
    invoke-interface {v8, v7, v1, v0, v2}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    :cond_27
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    if-eqz v0, :cond_28

    .line 422
    .line 423
    goto :goto_16

    .line 424
    :cond_28
    if-eqz v17, :cond_29

    .line 425
    .line 426
    :goto_16
    sget-object v0, Lvh2;->a:Lvh2;

    .line 427
    .line 428
    const/16 v1, 0x14

    .line 429
    .line 430
    move-object/from16 v2, v17

    .line 431
    .line 432
    invoke-interface {v8, v7, v1, v0, v2}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    :cond_29
    invoke-interface {v8, v7}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    if-eqz v0, :cond_2a

    .line 440
    .line 441
    goto :goto_17

    .line 442
    :cond_2a
    if-eqz v16, :cond_2b

    .line 443
    .line 444
    :goto_17
    sget-object v0, Lvh2;->a:Lvh2;

    .line 445
    .line 446
    const/16 v1, 0x15

    .line 447
    .line 448
    move-object/from16 v2, v16

    .line 449
    .line 450
    invoke-interface {v8, v7, v1, v0, v2}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    :cond_2b
    invoke-interface {v8, v7}, Lly;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 454
    .line 455
    .line 456
    return-void
.end method

.method public bridge synthetic serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 0

    .line 457
    check-cast p2, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;

    invoke-virtual {p0, p1, p2}, Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor$$serializer;->serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;)V

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

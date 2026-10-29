.class public final Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$$serializer;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Luq0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;
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
        "com/usercentrics/sdk/v2/settings/data/CCPASettings.$serializer",
        "Luq0;",
        "Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;",
        "<init>",
        "()V",
        "",
        "Lkotlinx/serialization/KSerializer;",
        "childSerializers",
        "()[Lkotlinx/serialization/KSerializer;",
        "Lkotlinx/serialization/encoding/Decoder;",
        "decoder",
        "deserialize",
        "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;",
        "Lkotlinx/serialization/encoding/Encoder;",
        "encoder",
        "value",
        "",
        "serialize",
        "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;)V",
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
.field public static final INSTANCE:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$$serializer;

    .line 7
    .line 8
    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 9
    .line 10
    const-string v2, "com.usercentrics.sdk.v2.settings.data.CCPASettings"

    .line 11
    .line 12
    const/16 v3, 0x11

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Luq0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "optOutNoticeLabel"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "btnSave"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "firstLayerTitle"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "secondLayerTitle"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "secondLayerDescription"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "btnMoreInfo"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "firstLayerMobileVariant"

    .line 49
    .line 50
    const/4 v2, 0x1

    .line 51
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "isActive"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "region"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "showOnPageLoad"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "reshowAfterDays"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v0, "iabAgreementExists"

    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    const-string v0, "removeDoNotSellToggle"

    .line 80
    .line 81
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    const-string v0, "appFirstLayerDescription"

    .line 85
    .line 86
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    const-string v0, "firstLayerMobileDescriptionIsActive"

    .line 90
    .line 91
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 92
    .line 93
    .line 94
    const-string v0, "firstLayerMobileDescription"

    .line 95
    .line 96
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 97
    .line 98
    .line 99
    const-string v0, "secondLayerHideLanguageSwitch"

    .line 100
    .line 101
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 102
    .line 103
    .line 104
    sput-object v1, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 105
    .line 106
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
    sget-object p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->r:[Lkotlinx/serialization/KSerializer;

    .line 2
    .line 3
    sget-object v0, Lvh2;->a:Lvh2;

    .line 4
    .line 5
    const/4 v1, 0x6

    .line 6
    aget-object v2, p0, v1

    .line 7
    .line 8
    invoke-static {v2}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/16 v3, 0x8

    .line 13
    .line 14
    aget-object p0, p0, v3

    .line 15
    .line 16
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-static {v0}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    const/16 v6, 0x11

    .line 25
    .line 26
    new-array v6, v6, [Lkotlinx/serialization/KSerializer;

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    aput-object v0, v6, v7

    .line 30
    .line 31
    const/4 v7, 0x1

    .line 32
    aput-object v0, v6, v7

    .line 33
    .line 34
    const/4 v7, 0x2

    .line 35
    aput-object v0, v6, v7

    .line 36
    .line 37
    const/4 v7, 0x3

    .line 38
    aput-object v0, v6, v7

    .line 39
    .line 40
    const/4 v7, 0x4

    .line 41
    aput-object v0, v6, v7

    .line 42
    .line 43
    const/4 v7, 0x5

    .line 44
    aput-object v0, v6, v7

    .line 45
    .line 46
    aput-object v2, v6, v1

    .line 47
    .line 48
    sget-object v0, Lfk;->a:Lfk;

    .line 49
    .line 50
    const/4 v1, 0x7

    .line 51
    aput-object v0, v6, v1

    .line 52
    .line 53
    aput-object p0, v6, v3

    .line 54
    .line 55
    const/16 p0, 0x9

    .line 56
    .line 57
    aput-object v0, v6, p0

    .line 58
    .line 59
    sget-object p0, Laz0;->a:Laz0;

    .line 60
    .line 61
    const/16 v1, 0xa

    .line 62
    .line 63
    aput-object p0, v6, v1

    .line 64
    .line 65
    const/16 p0, 0xb

    .line 66
    .line 67
    aput-object v0, v6, p0

    .line 68
    .line 69
    const/16 p0, 0xc

    .line 70
    .line 71
    aput-object v0, v6, p0

    .line 72
    .line 73
    const/16 p0, 0xd

    .line 74
    .line 75
    aput-object v4, v6, p0

    .line 76
    .line 77
    const/16 p0, 0xe

    .line 78
    .line 79
    aput-object v0, v6, p0

    .line 80
    .line 81
    const/16 p0, 0xf

    .line 82
    .line 83
    aput-object v5, v6, p0

    .line 84
    .line 85
    const/16 p0, 0x10

    .line 86
    .line 87
    aput-object v0, v6, p0

    .line 88
    .line 89
    return-object v6
.end method

.method public deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;
    .locals 26

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p0 .. p0}, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

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
    sget-object v2, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->r:[Lkotlinx/serialization/KSerializer;

    .line 15
    .line 16
    const/16 p0, 0x0

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x1

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
    const/16 v16, 0x0

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
    const/16 v23, 0x0

    .line 41
    .line 42
    const/16 v25, 0x0

    .line 43
    .line 44
    :goto_0
    if-eqz v6, :cond_0

    .line 45
    .line 46
    invoke-interface {v1, v0}, Lky;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 47
    .line 48
    .line 49
    move-result v17

    .line 50
    packed-switch v17, :pswitch_data_0

    .line 51
    .line 52
    .line 53
    invoke-static/range {v17 .. v17}, Ln4;->e(I)V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_0
    const/16 v3, 0x10

    .line 58
    .line 59
    invoke-interface {v1, v0, v3}, Lky;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 60
    .line 61
    .line 62
    move-result v25

    .line 63
    const/high16 v3, 0x10000

    .line 64
    .line 65
    or-int/2addr v8, v3

    .line 66
    goto :goto_0

    .line 67
    :pswitch_1
    sget-object v3, Lvh2;->a:Lvh2;

    .line 68
    .line 69
    move-object/from16 v22, v2

    .line 70
    .line 71
    const/16 v2, 0xf

    .line 72
    .line 73
    invoke-interface {v1, v0, v2, v3, v4}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    move-object v4, v2

    .line 78
    check-cast v4, Ljava/lang/String;

    .line 79
    .line 80
    const v2, 0x8000

    .line 81
    .line 82
    .line 83
    or-int/2addr v8, v2

    .line 84
    :goto_1
    move-object/from16 v2, v22

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :pswitch_2
    move-object/from16 v22, v2

    .line 88
    .line 89
    const/16 v2, 0xe

    .line 90
    .line 91
    invoke-interface {v1, v0, v2}, Lky;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 92
    .line 93
    .line 94
    move-result v23

    .line 95
    or-int/lit16 v8, v8, 0x4000

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :pswitch_3
    move-object/from16 v22, v2

    .line 99
    .line 100
    sget-object v2, Lvh2;->a:Lvh2;

    .line 101
    .line 102
    const/16 v3, 0xd

    .line 103
    .line 104
    invoke-interface {v1, v0, v3, v2, v5}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    move-object v5, v2

    .line 109
    check-cast v5, Ljava/lang/String;

    .line 110
    .line 111
    or-int/lit16 v8, v8, 0x2000

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :pswitch_4
    move-object/from16 v22, v2

    .line 115
    .line 116
    const/16 v2, 0xc

    .line 117
    .line 118
    invoke-interface {v1, v0, v2}, Lky;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 119
    .line 120
    .line 121
    move-result v21

    .line 122
    or-int/lit16 v8, v8, 0x1000

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :pswitch_5
    move-object/from16 v22, v2

    .line 126
    .line 127
    const/16 v2, 0xb

    .line 128
    .line 129
    invoke-interface {v1, v0, v2}, Lky;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 130
    .line 131
    .line 132
    move-result v20

    .line 133
    or-int/lit16 v8, v8, 0x800

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :pswitch_6
    move-object/from16 v22, v2

    .line 137
    .line 138
    const/16 v2, 0xa

    .line 139
    .line 140
    invoke-interface {v1, v0, v2}, Lky;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    .line 141
    .line 142
    .line 143
    move-result v19

    .line 144
    or-int/lit16 v8, v8, 0x400

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :pswitch_7
    move-object/from16 v22, v2

    .line 148
    .line 149
    const/16 v2, 0x9

    .line 150
    .line 151
    invoke-interface {v1, v0, v2}, Lky;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 152
    .line 153
    .line 154
    move-result v18

    .line 155
    or-int/lit16 v8, v8, 0x200

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :pswitch_8
    move-object/from16 v22, v2

    .line 159
    .line 160
    const/16 v2, 0x8

    .line 161
    .line 162
    aget-object v3, v22, v2

    .line 163
    .line 164
    invoke-interface {v1, v0, v2, v3, v7}, Lky;->A(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    move-object v7, v2

    .line 169
    check-cast v7, Lbm;

    .line 170
    .line 171
    or-int/lit16 v8, v8, 0x100

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :pswitch_9
    move-object/from16 v22, v2

    .line 175
    .line 176
    const/4 v2, 0x7

    .line 177
    invoke-interface {v1, v0, v2}, Lky;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 178
    .line 179
    .line 180
    move-result v16

    .line 181
    or-int/lit16 v8, v8, 0x80

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :pswitch_a
    move-object/from16 v22, v2

    .line 185
    .line 186
    const/4 v2, 0x6

    .line 187
    aget-object v3, v22, v2

    .line 188
    .line 189
    invoke-interface {v1, v0, v2, v3, v15}, Lky;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    move-object v15, v2

    .line 194
    check-cast v15, Lfj0;

    .line 195
    .line 196
    or-int/lit8 v8, v8, 0x40

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :pswitch_b
    move-object/from16 v22, v2

    .line 200
    .line 201
    const/4 v2, 0x5

    .line 202
    invoke-interface {v1, v0, v2}, Lky;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v14

    .line 206
    or-int/lit8 v8, v8, 0x20

    .line 207
    .line 208
    goto :goto_1

    .line 209
    :pswitch_c
    move-object/from16 v22, v2

    .line 210
    .line 211
    const/4 v2, 0x4

    .line 212
    invoke-interface {v1, v0, v2}, Lky;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v13

    .line 216
    or-int/lit8 v8, v8, 0x10

    .line 217
    .line 218
    goto/16 :goto_1

    .line 219
    .line 220
    :pswitch_d
    move-object/from16 v22, v2

    .line 221
    .line 222
    const/4 v2, 0x3

    .line 223
    invoke-interface {v1, v0, v2}, Lky;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v12

    .line 227
    or-int/lit8 v8, v8, 0x8

    .line 228
    .line 229
    goto/16 :goto_1

    .line 230
    .line 231
    :pswitch_e
    move-object/from16 v22, v2

    .line 232
    .line 233
    const/4 v2, 0x2

    .line 234
    invoke-interface {v1, v0, v2}, Lky;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v11

    .line 238
    or-int/lit8 v8, v8, 0x4

    .line 239
    .line 240
    goto/16 :goto_1

    .line 241
    .line 242
    :pswitch_f
    move-object/from16 v22, v2

    .line 243
    .line 244
    const/4 v2, 0x1

    .line 245
    invoke-interface {v1, v0, v2}, Lky;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v10

    .line 249
    or-int/lit8 v8, v8, 0x2

    .line 250
    .line 251
    goto/16 :goto_1

    .line 252
    .line 253
    :pswitch_10
    move-object/from16 v22, v2

    .line 254
    .line 255
    const/4 v2, 0x1

    .line 256
    const/4 v3, 0x0

    .line 257
    invoke-interface {v1, v0, v3}, Lky;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v9

    .line 261
    or-int/lit8 v8, v8, 0x1

    .line 262
    .line 263
    goto/16 :goto_1

    .line 264
    .line 265
    :pswitch_11
    move-object/from16 v22, v2

    .line 266
    .line 267
    const/4 v2, 0x1

    .line 268
    const/4 v3, 0x0

    .line 269
    move v6, v3

    .line 270
    goto/16 :goto_1

    .line 271
    .line 272
    :cond_0
    invoke-interface {v1, v0}, Lky;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 273
    .line 274
    .line 275
    move-object/from16 v17, v7

    .line 276
    .line 277
    new-instance v7, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    .line 278
    .line 279
    move-object/from16 v24, v4

    .line 280
    .line 281
    move-object/from16 v22, v5

    .line 282
    .line 283
    invoke-direct/range {v7 .. v25}, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfj0;ZLbm;ZIZZLjava/lang/String;ZLjava/lang/String;Z)V

    .line 284
    .line 285
    .line 286
    return-object v7

    .line 287
    :pswitch_data_0
    .packed-switch -0x1
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

    .line 287
    invoke-virtual {p0, p1}, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$$serializer;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    move-result-object p0

    return-object p0
.end method

.method public getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 0

    .line 1
    sget-object p0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 2
    .line 3
    return-object p0
.end method

.method public serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;)V
    .locals 16

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
    invoke-virtual/range {p0 .. p0}, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    move-object/from16 v2, p1

    .line 14
    .line 15
    invoke-interface {v2, v1}, Lkotlinx/serialization/encoding/Encoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lly;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sget-object v3, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->r:[Lkotlinx/serialization/KSerializer;

    .line 20
    .line 21
    iget-object v4, v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->a:Ljava/lang/String;

    .line 22
    .line 23
    iget-boolean v5, v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->q:Z

    .line 24
    .line 25
    iget-object v6, v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->p:Ljava/lang/String;

    .line 26
    .line 27
    iget-boolean v7, v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->o:Z

    .line 28
    .line 29
    iget-object v8, v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->n:Ljava/lang/String;

    .line 30
    .line 31
    iget-boolean v9, v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->m:Z

    .line 32
    .line 33
    iget-boolean v10, v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->l:Z

    .line 34
    .line 35
    iget v11, v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->k:I

    .line 36
    .line 37
    iget-boolean v12, v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->j:Z

    .line 38
    .line 39
    iget-object v13, v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->i:Lbm;

    .line 40
    .line 41
    iget-boolean v14, v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->h:Z

    .line 42
    .line 43
    iget-object v15, v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->g:Lfj0;

    .line 44
    .line 45
    move-object/from16 p0, v3

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-interface {v2, v1, v3, v4}, Lly;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    iget-object v4, v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->b:Ljava/lang/String;

    .line 53
    .line 54
    invoke-interface {v2, v1, v3, v4}, Lly;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 v3, 0x2

    .line 58
    iget-object v4, v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->c:Ljava/lang/String;

    .line 59
    .line 60
    invoke-interface {v2, v1, v3, v4}, Lly;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 v3, 0x3

    .line 64
    iget-object v4, v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->d:Ljava/lang/String;

    .line 65
    .line 66
    invoke-interface {v2, v1, v3, v4}, Lly;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 v3, 0x4

    .line 70
    iget-object v4, v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->e:Ljava/lang/String;

    .line 71
    .line 72
    invoke-interface {v2, v1, v3, v4}, Lly;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 v3, 0x5

    .line 76
    iget-object v0, v0, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->f:Ljava/lang/String;

    .line 77
    .line 78
    invoke-interface {v2, v1, v3, v0}, Lly;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v2, v1}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_0

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    if-eqz v15, :cond_1

    .line 89
    .line 90
    :goto_0
    const/4 v0, 0x6

    .line 91
    aget-object v3, p0, v0

    .line 92
    .line 93
    invoke-interface {v2, v1, v0, v3, v15}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_1
    invoke-interface {v2, v1}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_2

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    if-eqz v14, :cond_3

    .line 104
    .line 105
    :goto_1
    const/4 v0, 0x7

    .line 106
    invoke-interface {v2, v1, v0, v14}, Lly;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 107
    .line 108
    .line 109
    :cond_3
    invoke-interface {v2, v1}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_4

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    sget-object v0, Lbm;->a:Lbm;

    .line 117
    .line 118
    if-eq v13, v0, :cond_5

    .line 119
    .line 120
    :goto_2
    const/16 v0, 0x8

    .line 121
    .line 122
    aget-object v3, p0, v0

    .line 123
    .line 124
    invoke-interface {v2, v1, v0, v3, v13}, Lly;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :cond_5
    invoke-interface {v2, v1}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_6

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_6
    if-eqz v12, :cond_7

    .line 135
    .line 136
    :goto_3
    const/16 v0, 0x9

    .line 137
    .line 138
    invoke-interface {v2, v1, v0, v12}, Lly;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 139
    .line 140
    .line 141
    :cond_7
    invoke-interface {v2, v1}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_8

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_8
    const/16 v0, 0x16d

    .line 149
    .line 150
    if-eq v11, v0, :cond_9

    .line 151
    .line 152
    :goto_4
    const/16 v0, 0xa

    .line 153
    .line 154
    invoke-interface {v2, v0, v11, v1}, Lly;->l(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 155
    .line 156
    .line 157
    :cond_9
    invoke-interface {v2, v1}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_a

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_a
    if-eqz v10, :cond_b

    .line 165
    .line 166
    :goto_5
    const/16 v0, 0xb

    .line 167
    .line 168
    invoke-interface {v2, v1, v0, v10}, Lly;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 169
    .line 170
    .line 171
    :cond_b
    invoke-interface {v2, v1}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_c

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_c
    if-eqz v9, :cond_d

    .line 179
    .line 180
    :goto_6
    const/16 v0, 0xc

    .line 181
    .line 182
    invoke-interface {v2, v1, v0, v9}, Lly;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 183
    .line 184
    .line 185
    :cond_d
    invoke-interface {v2, v1}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_e

    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_e
    if-eqz v8, :cond_f

    .line 193
    .line 194
    :goto_7
    sget-object v0, Lvh2;->a:Lvh2;

    .line 195
    .line 196
    const/16 v3, 0xd

    .line 197
    .line 198
    invoke-interface {v2, v1, v3, v0, v8}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    :cond_f
    invoke-interface {v2, v1}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_10

    .line 206
    .line 207
    goto :goto_8

    .line 208
    :cond_10
    if-eqz v7, :cond_11

    .line 209
    .line 210
    :goto_8
    const/16 v0, 0xe

    .line 211
    .line 212
    invoke-interface {v2, v1, v0, v7}, Lly;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 213
    .line 214
    .line 215
    :cond_11
    invoke-interface {v2, v1}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_12

    .line 220
    .line 221
    goto :goto_9

    .line 222
    :cond_12
    if-eqz v6, :cond_13

    .line 223
    .line 224
    :goto_9
    sget-object v0, Lvh2;->a:Lvh2;

    .line 225
    .line 226
    const/16 v3, 0xf

    .line 227
    .line 228
    invoke-interface {v2, v1, v3, v0, v6}, Lly;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    :cond_13
    invoke-interface {v2, v1}, Lly;->E(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_14

    .line 236
    .line 237
    goto :goto_a

    .line 238
    :cond_14
    if-eqz v5, :cond_15

    .line 239
    .line 240
    :goto_a
    const/16 v0, 0x10

    .line 241
    .line 242
    invoke-interface {v2, v1, v0, v5}, Lly;->q(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 243
    .line 244
    .line 245
    :cond_15
    invoke-interface {v2, v1}, Lly;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 246
    .line 247
    .line 248
    return-void
.end method

.method public bridge synthetic serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 0

    .line 249
    check-cast p2, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    invoke-virtual {p0, p1, p2}, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$$serializer;->serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;)V

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

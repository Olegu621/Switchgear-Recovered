.class public final Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings$$serializer;,
        Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings$Companion;

.field public static final I:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final A:Lcom/usercentrics/sdk/v2/settings/data/VariantsSettings;

.field public final B:Lq90;

.field public final C:Lyw2;

.field public final D:Ljava/util/List;

.field public final E:Ljava/lang/Long;

.field public final F:Z

.field public final G:Ljava/util/List;

.field public final H:Ljava/util/List;

.field public final a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

.field public final b:Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Z

.field public final l:Z

.field public final m:Z

.field public final n:Z

.field public final o:Ljava/lang/Integer;

.field public final p:Ljava/util/List;

.field public final q:Ljava/util/List;

.field public final r:Ljava/util/List;

.field public final s:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

.field public final t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

.field public final u:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;

.field public final v:Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;

.field public final w:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsStyles;

.field public final x:Z

.field public final y:Z

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->Companion:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings$Companion;

    .line 7
    .line 8
    new-instance v0, Lgd;

    .line 9
    .line 10
    sget-object v1, Lvh2;->a:Lvh2;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 14
    .line 15
    .line 16
    new-instance v3, Lgd;

    .line 17
    .line 18
    invoke-direct {v3, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Lgd;

    .line 22
    .line 23
    invoke-direct {v4, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Loe0;

    .line 27
    .line 28
    const-string v5, "com.usercentrics.sdk.v2.settings.data.DpsDisplayFormat"

    .line 29
    .line 30
    invoke-static {}, Lq90;->values()[Lq90;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-direct {v1, v5, v6}, Loe0;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 35
    .line 36
    .line 37
    new-instance v5, Loe0;

    .line 38
    .line 39
    const-string v6, "com.usercentrics.sdk.models.settings.USAFrameworks"

    .line 40
    .line 41
    invoke-static {}, Lyw2;->values()[Lyw2;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-direct {v5, v6, v7}, Loe0;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 46
    .line 47
    .line 48
    new-instance v6, Lgd;

    .line 49
    .line 50
    sget-object v7, Lcom/usercentrics/sdk/v2/settings/data/PublishedApp$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/settings/data/PublishedApp$$serializer;

    .line 51
    .line 52
    invoke-direct {v6, v7, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 53
    .line 54
    .line 55
    new-instance v7, Lgd;

    .line 56
    .line 57
    sget-object v8, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$$serializer;

    .line 58
    .line 59
    invoke-direct {v7, v8, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 60
    .line 61
    .line 62
    new-instance v8, Lgd;

    .line 63
    .line 64
    sget-object v9, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory$$serializer;

    .line 65
    .line 66
    invoke-direct {v8, v9, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 67
    .line 68
    .line 69
    const/16 v9, 0x22

    .line 70
    .line 71
    new-array v9, v9, [Lkotlinx/serialization/KSerializer;

    .line 72
    .line 73
    const/4 v10, 0x0

    .line 74
    aput-object v10, v9, v2

    .line 75
    .line 76
    const/4 v2, 0x1

    .line 77
    aput-object v10, v9, v2

    .line 78
    .line 79
    const/4 v2, 0x2

    .line 80
    aput-object v10, v9, v2

    .line 81
    .line 82
    const/4 v2, 0x3

    .line 83
    aput-object v10, v9, v2

    .line 84
    .line 85
    const/4 v2, 0x4

    .line 86
    aput-object v10, v9, v2

    .line 87
    .line 88
    const/4 v2, 0x5

    .line 89
    aput-object v10, v9, v2

    .line 90
    .line 91
    const/4 v2, 0x6

    .line 92
    aput-object v10, v9, v2

    .line 93
    .line 94
    const/4 v2, 0x7

    .line 95
    aput-object v10, v9, v2

    .line 96
    .line 97
    const/16 v2, 0x8

    .line 98
    .line 99
    aput-object v10, v9, v2

    .line 100
    .line 101
    const/16 v2, 0x9

    .line 102
    .line 103
    aput-object v10, v9, v2

    .line 104
    .line 105
    const/16 v2, 0xa

    .line 106
    .line 107
    aput-object v10, v9, v2

    .line 108
    .line 109
    const/16 v2, 0xb

    .line 110
    .line 111
    aput-object v10, v9, v2

    .line 112
    .line 113
    const/16 v2, 0xc

    .line 114
    .line 115
    aput-object v10, v9, v2

    .line 116
    .line 117
    const/16 v2, 0xd

    .line 118
    .line 119
    aput-object v10, v9, v2

    .line 120
    .line 121
    const/16 v2, 0xe

    .line 122
    .line 123
    aput-object v10, v9, v2

    .line 124
    .line 125
    const/16 v2, 0xf

    .line 126
    .line 127
    aput-object v0, v9, v2

    .line 128
    .line 129
    const/16 v0, 0x10

    .line 130
    .line 131
    aput-object v3, v9, v0

    .line 132
    .line 133
    const/16 v0, 0x11

    .line 134
    .line 135
    aput-object v4, v9, v0

    .line 136
    .line 137
    const/16 v0, 0x12

    .line 138
    .line 139
    aput-object v10, v9, v0

    .line 140
    .line 141
    const/16 v0, 0x13

    .line 142
    .line 143
    aput-object v10, v9, v0

    .line 144
    .line 145
    const/16 v0, 0x14

    .line 146
    .line 147
    aput-object v10, v9, v0

    .line 148
    .line 149
    const/16 v0, 0x15

    .line 150
    .line 151
    aput-object v10, v9, v0

    .line 152
    .line 153
    const/16 v0, 0x16

    .line 154
    .line 155
    aput-object v10, v9, v0

    .line 156
    .line 157
    const/16 v0, 0x17

    .line 158
    .line 159
    aput-object v10, v9, v0

    .line 160
    .line 161
    const/16 v0, 0x18

    .line 162
    .line 163
    aput-object v10, v9, v0

    .line 164
    .line 165
    const/16 v0, 0x19

    .line 166
    .line 167
    aput-object v10, v9, v0

    .line 168
    .line 169
    const/16 v0, 0x1a

    .line 170
    .line 171
    aput-object v10, v9, v0

    .line 172
    .line 173
    const/16 v0, 0x1b

    .line 174
    .line 175
    aput-object v1, v9, v0

    .line 176
    .line 177
    const/16 v0, 0x1c

    .line 178
    .line 179
    aput-object v5, v9, v0

    .line 180
    .line 181
    const/16 v0, 0x1d

    .line 182
    .line 183
    aput-object v6, v9, v0

    .line 184
    .line 185
    const/16 v0, 0x1e

    .line 186
    .line 187
    aput-object v10, v9, v0

    .line 188
    .line 189
    const/16 v0, 0x1f

    .line 190
    .line 191
    aput-object v10, v9, v0

    .line 192
    .line 193
    const/16 v0, 0x20

    .line 194
    .line 195
    aput-object v7, v9, v0

    .line 196
    .line 197
    const/16 v0, 0x21

    .line 198
    .line 199
    aput-object v8, v9, v0

    .line 200
    .line 201
    sput-object v9, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->I:[Lkotlinx/serialization/KSerializer;

    .line 202
    .line 203
    return-void
.end method

.method public constructor <init>(IILcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsStyles;ZZZLcom/usercentrics/sdk/v2/settings/data/VariantsSettings;Lq90;Lyw2;Ljava/util/List;Ljava/lang/Long;ZLjava/util/List;Ljava/util/List;)V
    .locals 4

    and-int/lit8 v0, p1, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x3

    if-ne v3, v0, :cond_20

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->b:Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;

    and-int/lit8 p3, p1, 0x4

    if-nez p3, :cond_0

    .line 2
    const-string p3, "1.0.0"

    .line 3
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->c:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p5, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->c:Ljava/lang/String;

    :goto_0
    and-int/lit8 p3, p1, 0x8

    const-string p4, "en"

    if-nez p3, :cond_1

    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->d:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p6, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->d:Ljava/lang/String;

    :goto_1
    and-int/lit8 p3, p1, 0x10

    if-nez p3, :cond_2

    iput-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->e:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p7, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->e:Ljava/lang/String;

    :goto_2
    and-int/lit8 p3, p1, 0x20

    if-nez p3, :cond_3

    iput-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->f:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p8, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->f:Ljava/lang/String;

    :goto_3
    and-int/lit8 p3, p1, 0x40

    if-nez p3, :cond_4

    iput-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->g:Ljava/lang/String;

    goto :goto_4

    :cond_4
    iput-object p9, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->g:Ljava/lang/String;

    :goto_4
    and-int/lit16 p3, p1, 0x80

    if-nez p3, :cond_5

    iput-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->h:Ljava/lang/String;

    goto :goto_5

    :cond_5
    iput-object p10, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->h:Ljava/lang/String;

    :goto_5
    and-int/lit16 p3, p1, 0x100

    if-nez p3, :cond_6

    iput-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->i:Ljava/lang/String;

    goto :goto_6

    :cond_6
    iput-object p11, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->i:Ljava/lang/String;

    :goto_6
    and-int/lit16 p3, p1, 0x200

    if-nez p3, :cond_7

    .line 4
    const-string p3, ""

    .line 5
    :goto_7
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->j:Ljava/lang/String;

    goto :goto_8

    :cond_7
    move-object/from16 p3, p12

    goto :goto_7

    :goto_8
    and-int/lit16 p3, p1, 0x400

    if-nez p3, :cond_8

    iput-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->k:Z

    goto :goto_9

    :cond_8
    move/from16 p3, p13

    iput-boolean p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->k:Z

    :goto_9
    and-int/lit16 p3, p1, 0x800

    if-nez p3, :cond_9

    const/4 p3, 0x1

    :goto_a
    iput-boolean p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->l:Z

    goto :goto_b

    :cond_9
    move/from16 p3, p14

    goto :goto_a

    :goto_b
    and-int/lit16 p3, p1, 0x1000

    if-nez p3, :cond_a

    iput-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->m:Z

    goto :goto_c

    :cond_a
    move/from16 p3, p15

    iput-boolean p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->m:Z

    :goto_c
    and-int/lit16 p3, p1, 0x2000

    if-nez p3, :cond_b

    iput-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->n:Z

    goto :goto_d

    :cond_b
    move/from16 p3, p16

    iput-boolean p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->n:Z

    :goto_d
    and-int/lit16 p3, p1, 0x4000

    if-nez p3, :cond_c

    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    .line 7
    :goto_e
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->o:Ljava/lang/Integer;

    goto :goto_f

    :cond_c
    move-object/from16 p3, p17

    goto :goto_e

    :goto_f
    const p3, 0x8000

    and-int/2addr p3, p1

    if-nez p3, :cond_d

    .line 8
    invoke-static {p4}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    .line 9
    :goto_10
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->p:Ljava/util/List;

    goto :goto_11

    :cond_d
    move-object/from16 p3, p18

    goto :goto_10

    :goto_11
    const/high16 p3, 0x10000

    and-int/2addr p3, p1

    if-nez p3, :cond_e

    .line 10
    invoke-static {p4}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    .line 11
    :goto_12
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->q:Ljava/util/List;

    goto :goto_13

    :cond_e
    move-object/from16 p3, p19

    goto :goto_12

    :goto_13
    const/high16 p3, 0x20000

    and-int/2addr p3, p1

    if-nez p3, :cond_f

    .line 12
    sget-object p3, Lnd0;->a:Lnd0;

    .line 13
    :goto_14
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->r:Ljava/util/List;

    goto :goto_15

    :cond_f
    move-object/from16 p3, p20

    goto :goto_14

    :goto_15
    const/high16 p3, 0x40000

    and-int/2addr p3, p1

    if-nez p3, :cond_10

    iput-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->s:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    goto :goto_16

    :cond_10
    move-object/from16 p3, p21

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->s:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    :goto_16
    const/high16 p3, 0x80000

    and-int/2addr p3, p1

    if-nez p3, :cond_11

    iput-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    goto :goto_17

    :cond_11
    move-object/from16 p3, p22

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    :goto_17
    const/high16 p3, 0x100000

    and-int/2addr p3, p1

    if-nez p3, :cond_12

    iput-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->u:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;

    goto :goto_18

    :cond_12
    move-object/from16 p3, p23

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->u:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;

    :goto_18
    const/high16 p3, 0x200000

    and-int/2addr p3, p1

    if-nez p3, :cond_13

    iput-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->v:Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;

    goto :goto_19

    :cond_13
    move-object/from16 p3, p24

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->v:Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;

    :goto_19
    const/high16 p3, 0x400000

    and-int/2addr p3, p1

    if-nez p3, :cond_14

    iput-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->w:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsStyles;

    goto :goto_1a

    :cond_14
    move-object/from16 p3, p25

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->w:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsStyles;

    :goto_1a
    const/high16 p3, 0x800000

    and-int/2addr p3, p1

    if-nez p3, :cond_15

    iput-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->x:Z

    goto :goto_1b

    :cond_15
    move/from16 p3, p26

    iput-boolean p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->x:Z

    :goto_1b
    const/high16 p3, 0x1000000

    and-int/2addr p3, p1

    if-nez p3, :cond_16

    iput-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->y:Z

    goto :goto_1c

    :cond_16
    move/from16 p3, p27

    iput-boolean p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->y:Z

    :goto_1c
    const/high16 p3, 0x2000000

    and-int/2addr p3, p1

    if-nez p3, :cond_17

    iput-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->z:Z

    goto :goto_1d

    :cond_17
    move/from16 p3, p28

    iput-boolean p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->z:Z

    :goto_1d
    const/high16 p3, 0x4000000

    and-int/2addr p3, p1

    if-nez p3, :cond_18

    iput-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->A:Lcom/usercentrics/sdk/v2/settings/data/VariantsSettings;

    goto :goto_1e

    :cond_18
    move-object/from16 p3, p29

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->A:Lcom/usercentrics/sdk/v2/settings/data/VariantsSettings;

    :goto_1e
    const/high16 p3, 0x8000000

    and-int/2addr p3, p1

    if-nez p3, :cond_19

    iput-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->B:Lq90;

    goto :goto_1f

    :cond_19
    move-object/from16 p3, p30

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->B:Lq90;

    :goto_1f
    const/high16 p3, 0x10000000

    and-int/2addr p3, p1

    if-nez p3, :cond_1a

    iput-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->C:Lyw2;

    goto :goto_20

    :cond_1a
    move-object/from16 p3, p31

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->C:Lyw2;

    :goto_20
    const/high16 p3, 0x20000000

    and-int/2addr p3, p1

    if-nez p3, :cond_1b

    iput-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->D:Ljava/util/List;

    goto :goto_21

    :cond_1b
    move-object/from16 p3, p32

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->D:Ljava/util/List;

    :goto_21
    const/high16 p3, 0x40000000    # 2.0f

    and-int/2addr p3, p1

    if-nez p3, :cond_1c

    iput-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->E:Ljava/lang/Long;

    goto :goto_22

    :cond_1c
    move-object/from16 p3, p33

    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->E:Ljava/lang/Long;

    :goto_22
    const/high16 p3, -0x80000000

    and-int/2addr p1, p3

    if-nez p1, :cond_1d

    iput-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->F:Z

    goto :goto_23

    :cond_1d
    move/from16 p1, p34

    iput-boolean p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->F:Z

    :goto_23
    and-int/lit8 p1, p2, 0x1

    if-nez p1, :cond_1e

    .line 14
    sget-object p1, Lnd0;->a:Lnd0;

    .line 15
    :goto_24
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->G:Ljava/util/List;

    goto :goto_25

    :cond_1e
    move-object/from16 p1, p35

    goto :goto_24

    :goto_25
    and-int/lit8 p1, p2, 0x2

    if-nez p1, :cond_1f

    iput-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->H:Ljava/util/List;

    return-void

    :cond_1f
    move-object/from16 p1, p36

    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->H:Ljava/util/List;

    return-void

    :cond_20
    filled-new-array/range {p1 .. p2}, [I

    move-result-object p0

    filled-new-array {v3, v1}, [I

    move-result-object p1

    sget-object p2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings$$serializer;

    invoke-virtual {p2}, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lb40;->D([I[ILkotlinx/serialization/descriptors/SerialDescriptor;)V

    throw v2
.end method

.method public constructor <init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsStyles;ZZZLcom/usercentrics/sdk/v2/settings/data/VariantsSettings;Lq90;Lyw2;Ljava/util/List;Ljava/lang/Long;ZLjava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p18 .. p18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 18
    iput-object p2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->b:Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;

    .line 19
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->c:Ljava/lang/String;

    .line 20
    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->d:Ljava/lang/String;

    .line 21
    iput-object p5, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->e:Ljava/lang/String;

    .line 22
    iput-object p6, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->f:Ljava/lang/String;

    .line 23
    iput-object p7, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->g:Ljava/lang/String;

    .line 24
    iput-object p8, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->h:Ljava/lang/String;

    .line 25
    iput-object p9, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->i:Ljava/lang/String;

    .line 26
    iput-object p10, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->j:Ljava/lang/String;

    .line 27
    iput-boolean p11, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->k:Z

    .line 28
    iput-boolean p12, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->l:Z

    .line 29
    iput-boolean p13, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->m:Z

    .line 30
    iput-boolean p14, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->n:Z

    .line 31
    iput-object p15, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->o:Ljava/lang/Integer;

    move-object/from16 p1, p16

    .line 32
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->p:Ljava/util/List;

    move-object/from16 p1, p17

    .line 33
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->q:Ljava/util/List;

    move-object/from16 p1, p18

    .line 34
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->r:Ljava/util/List;

    move-object/from16 p1, p19

    .line 35
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->s:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    move-object/from16 p1, p20

    .line 36
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    move-object/from16 p1, p21

    .line 37
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->u:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;

    move-object/from16 p1, p22

    .line 38
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->v:Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;

    move-object/from16 p1, p23

    .line 39
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->w:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsStyles;

    move/from16 p1, p24

    .line 40
    iput-boolean p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->x:Z

    move/from16 p1, p25

    .line 41
    iput-boolean p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->y:Z

    move/from16 p1, p26

    .line 42
    iput-boolean p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->z:Z

    move-object/from16 p1, p27

    .line 43
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->A:Lcom/usercentrics/sdk/v2/settings/data/VariantsSettings;

    move-object/from16 p1, p28

    .line 44
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->B:Lq90;

    move-object/from16 p1, p29

    .line 45
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->C:Lyw2;

    move-object/from16 p1, p30

    .line 46
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->D:Ljava/util/List;

    move-object/from16 p1, p31

    .line 47
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->E:Ljava/lang/Long;

    move/from16 p1, p32

    .line 48
    iput-boolean p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->F:Z

    move-object/from16 p1, p33

    .line 49
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->G:Ljava/util/List;

    move-object/from16 p1, p34

    .line 50
    iput-object p1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->H:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->b:Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->b:Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->d:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->d:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->e:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->f:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->g:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->g:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_8

    .line 88
    .line 89
    return v2

    .line 90
    :cond_8
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->h:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->h:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_9

    .line 99
    .line 100
    return v2

    .line 101
    :cond_9
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->i:Ljava/lang/String;

    .line 102
    .line 103
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->i:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_a

    .line 110
    .line 111
    return v2

    .line 112
    :cond_a
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->j:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->j:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_b

    .line 121
    .line 122
    return v2

    .line 123
    :cond_b
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->k:Z

    .line 124
    .line 125
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->k:Z

    .line 126
    .line 127
    if-eq v1, v3, :cond_c

    .line 128
    .line 129
    return v2

    .line 130
    :cond_c
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->l:Z

    .line 131
    .line 132
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->l:Z

    .line 133
    .line 134
    if-eq v1, v3, :cond_d

    .line 135
    .line 136
    return v2

    .line 137
    :cond_d
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->m:Z

    .line 138
    .line 139
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->m:Z

    .line 140
    .line 141
    if-eq v1, v3, :cond_e

    .line 142
    .line 143
    return v2

    .line 144
    :cond_e
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->n:Z

    .line 145
    .line 146
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->n:Z

    .line 147
    .line 148
    if-eq v1, v3, :cond_f

    .line 149
    .line 150
    return v2

    .line 151
    :cond_f
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->o:Ljava/lang/Integer;

    .line 152
    .line 153
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->o:Ljava/lang/Integer;

    .line 154
    .line 155
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-nez v1, :cond_10

    .line 160
    .line 161
    return v2

    .line 162
    :cond_10
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->p:Ljava/util/List;

    .line 163
    .line 164
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->p:Ljava/util/List;

    .line 165
    .line 166
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-nez v1, :cond_11

    .line 171
    .line 172
    return v2

    .line 173
    :cond_11
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->q:Ljava/util/List;

    .line 174
    .line 175
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->q:Ljava/util/List;

    .line 176
    .line 177
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-nez v1, :cond_12

    .line 182
    .line 183
    return v2

    .line 184
    :cond_12
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->r:Ljava/util/List;

    .line 185
    .line 186
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->r:Ljava/util/List;

    .line 187
    .line 188
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-nez v1, :cond_13

    .line 193
    .line 194
    return v2

    .line 195
    :cond_13
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->s:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    .line 196
    .line 197
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->s:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    .line 198
    .line 199
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-nez v1, :cond_14

    .line 204
    .line 205
    return v2

    .line 206
    :cond_14
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 207
    .line 208
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 209
    .line 210
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-nez v1, :cond_15

    .line 215
    .line 216
    return v2

    .line 217
    :cond_15
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->u:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;

    .line 218
    .line 219
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->u:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;

    .line 220
    .line 221
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-nez v1, :cond_16

    .line 226
    .line 227
    return v2

    .line 228
    :cond_16
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->v:Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;

    .line 229
    .line 230
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->v:Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;

    .line 231
    .line 232
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-nez v1, :cond_17

    .line 237
    .line 238
    return v2

    .line 239
    :cond_17
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->w:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsStyles;

    .line 240
    .line 241
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->w:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsStyles;

    .line 242
    .line 243
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    if-nez v1, :cond_18

    .line 248
    .line 249
    return v2

    .line 250
    :cond_18
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->x:Z

    .line 251
    .line 252
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->x:Z

    .line 253
    .line 254
    if-eq v1, v3, :cond_19

    .line 255
    .line 256
    return v2

    .line 257
    :cond_19
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->y:Z

    .line 258
    .line 259
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->y:Z

    .line 260
    .line 261
    if-eq v1, v3, :cond_1a

    .line 262
    .line 263
    return v2

    .line 264
    :cond_1a
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->z:Z

    .line 265
    .line 266
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->z:Z

    .line 267
    .line 268
    if-eq v1, v3, :cond_1b

    .line 269
    .line 270
    return v2

    .line 271
    :cond_1b
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->A:Lcom/usercentrics/sdk/v2/settings/data/VariantsSettings;

    .line 272
    .line 273
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->A:Lcom/usercentrics/sdk/v2/settings/data/VariantsSettings;

    .line 274
    .line 275
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-nez v1, :cond_1c

    .line 280
    .line 281
    return v2

    .line 282
    :cond_1c
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->B:Lq90;

    .line 283
    .line 284
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->B:Lq90;

    .line 285
    .line 286
    if-eq v1, v3, :cond_1d

    .line 287
    .line 288
    return v2

    .line 289
    :cond_1d
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->C:Lyw2;

    .line 290
    .line 291
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->C:Lyw2;

    .line 292
    .line 293
    if-eq v1, v3, :cond_1e

    .line 294
    .line 295
    return v2

    .line 296
    :cond_1e
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->D:Ljava/util/List;

    .line 297
    .line 298
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->D:Ljava/util/List;

    .line 299
    .line 300
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    if-nez v1, :cond_1f

    .line 305
    .line 306
    return v2

    .line 307
    :cond_1f
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->E:Ljava/lang/Long;

    .line 308
    .line 309
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->E:Ljava/lang/Long;

    .line 310
    .line 311
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    if-nez v1, :cond_20

    .line 316
    .line 317
    return v2

    .line 318
    :cond_20
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->F:Z

    .line 319
    .line 320
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->F:Z

    .line 321
    .line 322
    if-eq v1, v3, :cond_21

    .line 323
    .line 324
    return v2

    .line 325
    :cond_21
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->G:Ljava/util/List;

    .line 326
    .line 327
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->G:Ljava/util/List;

    .line 328
    .line 329
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    if-nez v1, :cond_22

    .line 334
    .line 335
    return v2

    .line 336
    :cond_22
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->H:Ljava/util/List;

    .line 337
    .line 338
    iget-object p1, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->H:Ljava/util/List;

    .line 339
    .line 340
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result p0

    .line 344
    if-nez p0, :cond_23

    .line 345
    .line 346
    return v2

    .line 347
    :cond_23
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->b:Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;

    .line 11
    .line 12
    invoke-virtual {v2}, Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, Lpm2;->h(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->d:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v2, 0x0

    .line 31
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->e:Ljava/lang/String;

    .line 32
    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    move v3, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    :goto_0
    add-int/2addr v0, v3

    .line 42
    mul-int/2addr v0, v1

    .line 43
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->f:Ljava/lang/String;

    .line 44
    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    move v3, v2

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    :goto_1
    add-int/2addr v0, v3

    .line 54
    mul-int/2addr v0, v1

    .line 55
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->g:Ljava/lang/String;

    .line 56
    .line 57
    if-nez v3, :cond_2

    .line 58
    .line 59
    move v3, v2

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    :goto_2
    add-int/2addr v0, v3

    .line 66
    mul-int/2addr v0, v1

    .line 67
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->h:Ljava/lang/String;

    .line 68
    .line 69
    if-nez v3, :cond_3

    .line 70
    .line 71
    move v3, v2

    .line 72
    goto :goto_3

    .line 73
    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    :goto_3
    add-int/2addr v0, v3

    .line 78
    mul-int/2addr v0, v1

    .line 79
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->i:Ljava/lang/String;

    .line 80
    .line 81
    if-nez v3, :cond_4

    .line 82
    .line 83
    move v3, v2

    .line 84
    goto :goto_4

    .line 85
    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    :goto_4
    add-int/2addr v0, v3

    .line 90
    mul-int/2addr v0, v1

    .line 91
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->j:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {v0, v1, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->k:Z

    .line 98
    .line 99
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->l:Z

    .line 104
    .line 105
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->m:Z

    .line 110
    .line 111
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->n:Z

    .line 116
    .line 117
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->o:Ljava/lang/Integer;

    .line 122
    .line 123
    if-nez v3, :cond_5

    .line 124
    .line 125
    move v3, v2

    .line 126
    goto :goto_5

    .line 127
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    :goto_5
    add-int/2addr v0, v3

    .line 132
    mul-int/2addr v0, v1

    .line 133
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->p:Ljava/util/List;

    .line 134
    .line 135
    invoke-static {v0, v1, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->q:Ljava/util/List;

    .line 140
    .line 141
    invoke-static {v0, v1, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->r:Ljava/util/List;

    .line 146
    .line 147
    invoke-static {v0, v1, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->s:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    .line 152
    .line 153
    if-nez v3, :cond_6

    .line 154
    .line 155
    move v3, v2

    .line 156
    goto :goto_6

    .line 157
    :cond_6
    invoke-virtual {v3}, Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;->hashCode()I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    :goto_6
    add-int/2addr v0, v3

    .line 162
    mul-int/2addr v0, v1

    .line 163
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 164
    .line 165
    if-nez v3, :cond_7

    .line 166
    .line 167
    move v3, v2

    .line 168
    goto :goto_7

    .line 169
    :cond_7
    invoke-virtual {v3}, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->hashCode()I

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    :goto_7
    add-int/2addr v0, v3

    .line 174
    mul-int/2addr v0, v1

    .line 175
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->u:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;

    .line 176
    .line 177
    if-nez v3, :cond_8

    .line 178
    .line 179
    move v3, v2

    .line 180
    goto :goto_8

    .line 181
    :cond_8
    invoke-virtual {v3}, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;->hashCode()I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    :goto_8
    add-int/2addr v0, v3

    .line 186
    mul-int/2addr v0, v1

    .line 187
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->v:Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;

    .line 188
    .line 189
    if-nez v3, :cond_9

    .line 190
    .line 191
    move v3, v2

    .line 192
    goto :goto_9

    .line 193
    :cond_9
    invoke-virtual {v3}, Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;->hashCode()I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    :goto_9
    add-int/2addr v0, v3

    .line 198
    mul-int/2addr v0, v1

    .line 199
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->w:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsStyles;

    .line 200
    .line 201
    if-nez v3, :cond_a

    .line 202
    .line 203
    move v3, v2

    .line 204
    goto :goto_a

    .line 205
    :cond_a
    invoke-virtual {v3}, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsStyles;->hashCode()I

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    :goto_a
    add-int/2addr v0, v3

    .line 210
    mul-int/2addr v0, v1

    .line 211
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->x:Z

    .line 212
    .line 213
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->y:Z

    .line 218
    .line 219
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->z:Z

    .line 224
    .line 225
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->A:Lcom/usercentrics/sdk/v2/settings/data/VariantsSettings;

    .line 230
    .line 231
    if-nez v3, :cond_b

    .line 232
    .line 233
    move v3, v2

    .line 234
    goto :goto_b

    .line 235
    :cond_b
    invoke-virtual {v3}, Lcom/usercentrics/sdk/v2/settings/data/VariantsSettings;->hashCode()I

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    :goto_b
    add-int/2addr v0, v3

    .line 240
    mul-int/2addr v0, v1

    .line 241
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->B:Lq90;

    .line 242
    .line 243
    if-nez v3, :cond_c

    .line 244
    .line 245
    move v3, v2

    .line 246
    goto :goto_c

    .line 247
    :cond_c
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    :goto_c
    add-int/2addr v0, v3

    .line 252
    mul-int/2addr v0, v1

    .line 253
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->C:Lyw2;

    .line 254
    .line 255
    if-nez v3, :cond_d

    .line 256
    .line 257
    move v3, v2

    .line 258
    goto :goto_d

    .line 259
    :cond_d
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    :goto_d
    add-int/2addr v0, v3

    .line 264
    mul-int/2addr v0, v1

    .line 265
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->D:Ljava/util/List;

    .line 266
    .line 267
    if-nez v3, :cond_e

    .line 268
    .line 269
    move v3, v2

    .line 270
    goto :goto_e

    .line 271
    :cond_e
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    :goto_e
    add-int/2addr v0, v3

    .line 276
    mul-int/2addr v0, v1

    .line 277
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->E:Ljava/lang/Long;

    .line 278
    .line 279
    if-nez v3, :cond_f

    .line 280
    .line 281
    move v3, v2

    .line 282
    goto :goto_f

    .line 283
    :cond_f
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    :goto_f
    add-int/2addr v0, v3

    .line 288
    mul-int/2addr v0, v1

    .line 289
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->F:Z

    .line 290
    .line 291
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->G:Ljava/util/List;

    .line 296
    .line 297
    invoke-static {v0, v1, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->H:Ljava/util/List;

    .line 302
    .line 303
    if-nez p0, :cond_10

    .line 304
    .line 305
    goto :goto_10

    .line 306
    :cond_10
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    :goto_10
    add-int/2addr v0, v2

    .line 311
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "UsercentricsSettings(labels="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", secondLayer="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->b:Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", version="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", language="

    .line 29
    .line 30
    const-string v2, ", imprintUrl="

    .line 31
    .line 32
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->c:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->d:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", privacyPolicyUrl="

    .line 40
    .line 41
    const-string v2, ", cookiePolicyUrl="

    .line 42
    .line 43
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->e:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->f:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v1, ", firstLayerDescriptionHtml="

    .line 51
    .line 52
    const-string v2, ", firstLayerMobileDescriptionHtml="

    .line 53
    .line 54
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->g:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->h:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v1, ", settingsId="

    .line 62
    .line 63
    const-string v2, ", bannerMobileDescriptionIsActive="

    .line 64
    .line 65
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->i:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->j:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->k:Z

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, ", enablePoweredBy="

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->l:Z

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v1, ", displayOnlyForEU="

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->m:Z

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v1, ", tcf2Enabled="

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->n:Z

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v1, ", reshowBanner="

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->o:Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v1, ", editableLanguages="

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->p:Ljava/util/List;

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string v1, ", languagesAvailable="

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->q:Ljava/util/List;

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v1, ", showInitialViewForVersionChange="

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->r:Ljava/util/List;

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v1, ", ccpa="

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->s:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v1, ", tcf2="

    .line 158
    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string v1, ", customization="

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->u:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;

    .line 173
    .line 174
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string v1, ", firstLayer="

    .line 178
    .line 179
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->v:Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string v1, ", styles="

    .line 188
    .line 189
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->w:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsStyles;

    .line 193
    .line 194
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    const-string v1, ", interactionAnalytics="

    .line 198
    .line 199
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->x:Z

    .line 203
    .line 204
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    const-string v1, ", consentAnalytics="

    .line 208
    .line 209
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->y:Z

    .line 213
    .line 214
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string v1, ", consentXDevice="

    .line 218
    .line 219
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->z:Z

    .line 223
    .line 224
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    const-string v1, ", variants="

    .line 228
    .line 229
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->A:Lcom/usercentrics/sdk/v2/settings/data/VariantsSettings;

    .line 233
    .line 234
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    const-string v1, ", dpsDisplayFormat="

    .line 238
    .line 239
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->B:Lq90;

    .line 243
    .line 244
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string v1, ", framework="

    .line 248
    .line 249
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->C:Lyw2;

    .line 253
    .line 254
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    const-string v1, ", publishedApps="

    .line 258
    .line 259
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->D:Ljava/util/List;

    .line 263
    .line 264
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    const-string v1, ", renewConsentsTimestamp="

    .line 268
    .line 269
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->E:Ljava/lang/Long;

    .line 273
    .line 274
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    const-string v1, ", consentWebhook="

    .line 278
    .line 279
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->F:Z

    .line 283
    .line 284
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    const-string v1, ", consentTemplates="

    .line 288
    .line 289
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->G:Ljava/util/List;

    .line 293
    .line 294
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    const-string v1, ", categories="

    .line 298
    .line 299
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->H:Ljava/util/List;

    .line 303
    .line 304
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    const-string p0, ")"

    .line 308
    .line 309
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    return-object p0
.end method

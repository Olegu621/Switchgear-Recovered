.class public final Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings$$serializer;,
        Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings$Companion;

.field public static final l0:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final A:Z

.field public final B:Ljava/lang/String;

.field public final C:Ljava/lang/String;

.field public final D:Ljava/lang/String;

.field public final E:Ljava/lang/String;

.field public final F:Ljava/lang/String;

.field public final G:I

.field public final H:I

.field public final I:Z

.field public final J:Ljava/lang/String;

.field public final K:Ljava/util/List;

.field public final L:Ljava/lang/Boolean;

.field public final M:Ljava/lang/Boolean;

.field public final N:Z

.field public final O:Ljava/lang/String;

.field public final P:Z

.field public final Q:Ljava/util/List;

.field public final R:Z

.field public final S:Ljava/util/List;

.field public final T:Lpk2;

.field public final U:Ljava/util/List;

.field public final V:Z

.field public final W:Z

.field public final X:Z

.field public final Y:Z

.field public final Z:Z

.field public final a:Ljava/lang/String;

.field public final a0:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final b0:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final c0:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final d0:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final e0:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final f0:Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;

.field public final g:Ljava/lang/String;

.field public final g0:Z

.field public final h:Ljava/lang/String;

.field public final h0:Ljava/util/List;

.field public final i:Ljava/lang/String;

.field public final i0:Z

.field public final j:Ljava/lang/String;

.field public final j0:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final k0:Z

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;

.field public final q:Ljava/lang/String;

.field public final r:Ljava/lang/String;

.field public final s:Ljava/lang/String;

.field public final t:Ljava/lang/String;

.field public final u:Ljava/lang/String;

.field public final v:Ljava/lang/String;

.field public final w:Ljava/lang/String;

.field public final x:Lfj0;

.field public final y:Z

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Companion:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings$Companion;

    .line 7
    .line 8
    new-instance v0, Loe0;

    .line 9
    .line 10
    const-string v1, "com.usercentrics.sdk.v2.settings.data.FirstLayerMobileVariant"

    .line 11
    .line 12
    invoke-static {}, Lfj0;->values()[Lfj0;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {v0, v1, v2}, Loe0;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Lgd;

    .line 20
    .line 21
    sget-object v2, Laz0;->a:Laz0;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-direct {v1, v2, v3}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 25
    .line 26
    .line 27
    new-instance v4, Lgd;

    .line 28
    .line 29
    invoke-direct {v4, v2, v3}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Lgd;

    .line 33
    .line 34
    invoke-direct {v5, v2, v3}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 35
    .line 36
    .line 37
    new-instance v6, Loe0;

    .line 38
    .line 39
    const-string v7, "com.usercentrics.sdk.v2.settings.data.TCF2Scope"

    .line 40
    .line 41
    invoke-static {}, Lpk2;->values()[Lpk2;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    invoke-direct {v6, v7, v8}, Loe0;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 46
    .line 47
    .line 48
    new-instance v7, Lgd;

    .line 49
    .line 50
    invoke-direct {v7, v2, v3}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 51
    .line 52
    .line 53
    new-instance v8, Lgd;

    .line 54
    .line 55
    invoke-direct {v8, v2, v3}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 56
    .line 57
    .line 58
    const/16 v2, 0x3f

    .line 59
    .line 60
    new-array v2, v2, [Lkotlinx/serialization/KSerializer;

    .line 61
    .line 62
    const/4 v9, 0x0

    .line 63
    aput-object v9, v2, v3

    .line 64
    .line 65
    const/4 v3, 0x1

    .line 66
    aput-object v9, v2, v3

    .line 67
    .line 68
    const/4 v3, 0x2

    .line 69
    aput-object v9, v2, v3

    .line 70
    .line 71
    const/4 v3, 0x3

    .line 72
    aput-object v9, v2, v3

    .line 73
    .line 74
    const/4 v3, 0x4

    .line 75
    aput-object v9, v2, v3

    .line 76
    .line 77
    const/4 v3, 0x5

    .line 78
    aput-object v9, v2, v3

    .line 79
    .line 80
    const/4 v3, 0x6

    .line 81
    aput-object v9, v2, v3

    .line 82
    .line 83
    const/4 v3, 0x7

    .line 84
    aput-object v9, v2, v3

    .line 85
    .line 86
    const/16 v3, 0x8

    .line 87
    .line 88
    aput-object v9, v2, v3

    .line 89
    .line 90
    const/16 v3, 0x9

    .line 91
    .line 92
    aput-object v9, v2, v3

    .line 93
    .line 94
    const/16 v3, 0xa

    .line 95
    .line 96
    aput-object v9, v2, v3

    .line 97
    .line 98
    const/16 v3, 0xb

    .line 99
    .line 100
    aput-object v9, v2, v3

    .line 101
    .line 102
    const/16 v3, 0xc

    .line 103
    .line 104
    aput-object v9, v2, v3

    .line 105
    .line 106
    const/16 v3, 0xd

    .line 107
    .line 108
    aput-object v9, v2, v3

    .line 109
    .line 110
    const/16 v3, 0xe

    .line 111
    .line 112
    aput-object v9, v2, v3

    .line 113
    .line 114
    const/16 v3, 0xf

    .line 115
    .line 116
    aput-object v9, v2, v3

    .line 117
    .line 118
    const/16 v3, 0x10

    .line 119
    .line 120
    aput-object v9, v2, v3

    .line 121
    .line 122
    const/16 v3, 0x11

    .line 123
    .line 124
    aput-object v9, v2, v3

    .line 125
    .line 126
    const/16 v3, 0x12

    .line 127
    .line 128
    aput-object v9, v2, v3

    .line 129
    .line 130
    const/16 v3, 0x13

    .line 131
    .line 132
    aput-object v9, v2, v3

    .line 133
    .line 134
    const/16 v3, 0x14

    .line 135
    .line 136
    aput-object v9, v2, v3

    .line 137
    .line 138
    const/16 v3, 0x15

    .line 139
    .line 140
    aput-object v9, v2, v3

    .line 141
    .line 142
    const/16 v3, 0x16

    .line 143
    .line 144
    aput-object v9, v2, v3

    .line 145
    .line 146
    const/16 v3, 0x17

    .line 147
    .line 148
    aput-object v0, v2, v3

    .line 149
    .line 150
    const/16 v0, 0x18

    .line 151
    .line 152
    aput-object v9, v2, v0

    .line 153
    .line 154
    const/16 v0, 0x19

    .line 155
    .line 156
    aput-object v9, v2, v0

    .line 157
    .line 158
    const/16 v0, 0x1a

    .line 159
    .line 160
    aput-object v9, v2, v0

    .line 161
    .line 162
    const/16 v0, 0x1b

    .line 163
    .line 164
    aput-object v9, v2, v0

    .line 165
    .line 166
    const/16 v0, 0x1c

    .line 167
    .line 168
    aput-object v9, v2, v0

    .line 169
    .line 170
    const/16 v0, 0x1d

    .line 171
    .line 172
    aput-object v9, v2, v0

    .line 173
    .line 174
    const/16 v0, 0x1e

    .line 175
    .line 176
    aput-object v9, v2, v0

    .line 177
    .line 178
    const/16 v0, 0x1f

    .line 179
    .line 180
    aput-object v9, v2, v0

    .line 181
    .line 182
    const/16 v0, 0x20

    .line 183
    .line 184
    aput-object v9, v2, v0

    .line 185
    .line 186
    const/16 v0, 0x21

    .line 187
    .line 188
    aput-object v9, v2, v0

    .line 189
    .line 190
    const/16 v0, 0x22

    .line 191
    .line 192
    aput-object v9, v2, v0

    .line 193
    .line 194
    const/16 v0, 0x23

    .line 195
    .line 196
    aput-object v9, v2, v0

    .line 197
    .line 198
    const/16 v0, 0x24

    .line 199
    .line 200
    aput-object v1, v2, v0

    .line 201
    .line 202
    const/16 v0, 0x25

    .line 203
    .line 204
    aput-object v9, v2, v0

    .line 205
    .line 206
    const/16 v0, 0x26

    .line 207
    .line 208
    aput-object v9, v2, v0

    .line 209
    .line 210
    const/16 v0, 0x27

    .line 211
    .line 212
    aput-object v9, v2, v0

    .line 213
    .line 214
    const/16 v0, 0x28

    .line 215
    .line 216
    aput-object v9, v2, v0

    .line 217
    .line 218
    const/16 v0, 0x29

    .line 219
    .line 220
    aput-object v9, v2, v0

    .line 221
    .line 222
    const/16 v0, 0x2a

    .line 223
    .line 224
    aput-object v4, v2, v0

    .line 225
    .line 226
    const/16 v0, 0x2b

    .line 227
    .line 228
    aput-object v9, v2, v0

    .line 229
    .line 230
    const/16 v0, 0x2c

    .line 231
    .line 232
    aput-object v5, v2, v0

    .line 233
    .line 234
    const/16 v0, 0x2d

    .line 235
    .line 236
    aput-object v6, v2, v0

    .line 237
    .line 238
    const/16 v0, 0x2e

    .line 239
    .line 240
    aput-object v7, v2, v0

    .line 241
    .line 242
    const/16 v0, 0x2f

    .line 243
    .line 244
    aput-object v9, v2, v0

    .line 245
    .line 246
    const/16 v0, 0x30

    .line 247
    .line 248
    aput-object v9, v2, v0

    .line 249
    .line 250
    const/16 v0, 0x31

    .line 251
    .line 252
    aput-object v9, v2, v0

    .line 253
    .line 254
    const/16 v0, 0x32

    .line 255
    .line 256
    aput-object v9, v2, v0

    .line 257
    .line 258
    const/16 v0, 0x33

    .line 259
    .line 260
    aput-object v9, v2, v0

    .line 261
    .line 262
    const/16 v0, 0x34

    .line 263
    .line 264
    aput-object v9, v2, v0

    .line 265
    .line 266
    const/16 v0, 0x35

    .line 267
    .line 268
    aput-object v9, v2, v0

    .line 269
    .line 270
    const/16 v0, 0x36

    .line 271
    .line 272
    aput-object v9, v2, v0

    .line 273
    .line 274
    const/16 v0, 0x37

    .line 275
    .line 276
    aput-object v9, v2, v0

    .line 277
    .line 278
    const/16 v0, 0x38

    .line 279
    .line 280
    aput-object v9, v2, v0

    .line 281
    .line 282
    const/16 v0, 0x39

    .line 283
    .line 284
    aput-object v9, v2, v0

    .line 285
    .line 286
    const/16 v0, 0x3a

    .line 287
    .line 288
    aput-object v9, v2, v0

    .line 289
    .line 290
    const/16 v0, 0x3b

    .line 291
    .line 292
    aput-object v8, v2, v0

    .line 293
    .line 294
    const/16 v0, 0x3c

    .line 295
    .line 296
    aput-object v9, v2, v0

    .line 297
    .line 298
    const/16 v0, 0x3d

    .line 299
    .line 300
    aput-object v9, v2, v0

    .line 301
    .line 302
    const/16 v0, 0x3e

    .line 303
    .line 304
    aput-object v9, v2, v0

    .line 305
    .line 306
    sput-object v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->l0:[Lkotlinx/serialization/KSerializer;

    .line 307
    .line 308
    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfj0;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/String;ZLjava/util/List;ZLjava/util/List;Lpk2;Ljava/util/List;ZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;ZLjava/util/List;ZLjava/lang/String;Z)V
    .locals 14

    move/from16 v0, p2

    const v1, 0x7fffff

    and-int v2, p1, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-ne v1, v2, :cond_28

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v1, p3

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->a:Ljava/lang/String;

    move-object/from16 v1, p4

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->b:Ljava/lang/String;

    move-object/from16 v1, p5

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->c:Ljava/lang/String;

    move-object/from16 v1, p6

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->d:Ljava/lang/String;

    move-object/from16 v1, p7

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->e:Ljava/lang/String;

    move-object/from16 v1, p8

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->f:Ljava/lang/String;

    move-object/from16 v1, p9

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->g:Ljava/lang/String;

    move-object/from16 v1, p10

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->h:Ljava/lang/String;

    move-object/from16 v1, p11

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->i:Ljava/lang/String;

    move-object/from16 v1, p12

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->j:Ljava/lang/String;

    move-object/from16 v1, p13

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->k:Ljava/lang/String;

    move-object/from16 v1, p14

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->l:Ljava/lang/String;

    move-object/from16 v1, p15

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->m:Ljava/lang/String;

    move-object/from16 v1, p16

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->n:Ljava/lang/String;

    move-object/from16 v1, p17

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->o:Ljava/lang/String;

    move-object/from16 v1, p18

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->p:Ljava/lang/String;

    move-object/from16 v1, p19

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->q:Ljava/lang/String;

    move-object/from16 v1, p20

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->r:Ljava/lang/String;

    move-object/from16 v1, p21

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->s:Ljava/lang/String;

    move-object/from16 v1, p22

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->t:Ljava/lang/String;

    move-object/from16 v1, p23

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->u:Ljava/lang/String;

    move-object/from16 v1, p24

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->v:Ljava/lang/String;

    move-object/from16 v1, p25

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->w:Ljava/lang/String;

    const/high16 v1, 0x800000

    and-int v2, p1, v1

    if-nez v2, :cond_0

    iput-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->x:Lfj0;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p26

    iput-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->x:Lfj0;

    :goto_0
    const/high16 v2, 0x1000000

    and-int v5, p1, v2

    if-nez v5, :cond_1

    iput-boolean v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->y:Z

    goto :goto_1

    :cond_1
    move/from16 v5, p27

    iput-boolean v5, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->y:Z

    :goto_1
    const/high16 v5, 0x2000000

    and-int v6, p1, v5

    if-nez v6, :cond_2

    iput-boolean v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->z:Z

    goto :goto_2

    :cond_2
    move/from16 v6, p28

    iput-boolean v6, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->z:Z

    :goto_2
    const/high16 v6, 0x4000000

    and-int v7, p1, v6

    if-nez v7, :cond_3

    iput-boolean v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->A:Z

    goto :goto_3

    :cond_3
    move/from16 v7, p29

    iput-boolean v7, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->A:Z

    :goto_3
    const/high16 v7, 0x8000000

    and-int v8, p1, v7

    const-string v9, ""

    if-nez v8, :cond_4

    iput-object v9, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->B:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v8, p30

    iput-object v8, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->B:Ljava/lang/String;

    :goto_4
    const/high16 v8, 0x10000000

    and-int v10, p1, v8

    if-nez v10, :cond_5

    iput-object v9, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->C:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v10, p31

    iput-object v10, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->C:Ljava/lang/String;

    :goto_5
    const/high16 v10, 0x20000000

    and-int v11, p1, v10

    if-nez v11, :cond_6

    iput-object v9, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->D:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v11, p32

    iput-object v11, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->D:Ljava/lang/String;

    :goto_6
    const/high16 v11, 0x40000000    # 2.0f

    and-int v12, p1, v11

    if-nez v12, :cond_7

    iput-object v9, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->E:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v12, p33

    iput-object v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->E:Ljava/lang/String;

    :goto_7
    const/high16 v12, -0x80000000

    and-int/2addr v12, p1

    if-nez v12, :cond_8

    iput-object v9, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->F:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v12, p34

    iput-object v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->F:Ljava/lang/String;

    :goto_8
    and-int/lit8 v12, v0, 0x1

    if-nez v12, :cond_9

    const/4 v12, 0x5

    :goto_9
    iput v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->G:I

    goto :goto_a

    :cond_9
    move/from16 v12, p35

    goto :goto_9

    :goto_a
    and-int/lit8 v12, v0, 0x2

    if-nez v12, :cond_a

    const/4 v12, 0x3

    :goto_b
    iput v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->H:I

    goto :goto_c

    :cond_a
    move/from16 v12, p36

    goto :goto_b

    :goto_c
    and-int/lit8 v12, v0, 0x4

    if-nez v12, :cond_b

    iput-boolean v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->I:Z

    goto :goto_d

    :cond_b
    move/from16 v12, p37

    iput-boolean v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->I:Z

    :goto_d
    and-int/lit8 v12, v0, 0x8

    if-nez v12, :cond_c

    iput-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->J:Ljava/lang/String;

    goto :goto_e

    :cond_c
    move-object/from16 v12, p38

    iput-object v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->J:Ljava/lang/String;

    :goto_e
    and-int/lit8 v12, v0, 0x10

    if-nez v12, :cond_d

    .line 2
    sget-object v12, Lnd0;->a:Lnd0;

    .line 3
    :goto_f
    iput-object v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->K:Ljava/util/List;

    goto :goto_10

    :cond_d
    move-object/from16 v12, p39

    goto :goto_f

    :goto_10
    and-int/lit8 v12, v0, 0x20

    if-nez v12, :cond_e

    .line 4
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 5
    :goto_11
    iput-object v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->L:Ljava/lang/Boolean;

    goto :goto_12

    :cond_e
    move-object/from16 v12, p40

    goto :goto_11

    :goto_12
    and-int/lit8 v12, v0, 0x40

    if-nez v12, :cond_f

    iput-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->M:Ljava/lang/Boolean;

    goto :goto_13

    :cond_f
    move-object/from16 v12, p41

    iput-object v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->M:Ljava/lang/Boolean;

    :goto_13
    and-int/lit16 v12, v0, 0x80

    const/4 v13, 0x1

    if-nez v12, :cond_10

    iput-boolean v13, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->N:Z

    goto :goto_14

    :cond_10
    move/from16 v12, p42

    iput-boolean v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->N:Z

    :goto_14
    and-int/lit16 v12, v0, 0x100

    if-nez v12, :cond_11

    .line 6
    const-string v12, "DE"

    .line 7
    :goto_15
    iput-object v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->O:Ljava/lang/String;

    goto :goto_16

    :cond_11
    move-object/from16 v12, p43

    goto :goto_15

    :goto_16
    and-int/lit16 v12, v0, 0x200

    if-nez v12, :cond_12

    iput-boolean v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->P:Z

    goto :goto_17

    :cond_12
    move/from16 v12, p44

    iput-boolean v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->P:Z

    :goto_17
    and-int/lit16 v12, v0, 0x400

    if-nez v12, :cond_13

    .line 8
    sget-object v12, Lnd0;->a:Lnd0;

    .line 9
    :goto_18
    iput-object v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Q:Ljava/util/List;

    goto :goto_19

    :cond_13
    move-object/from16 v12, p45

    goto :goto_18

    :goto_19
    and-int/lit16 v12, v0, 0x800

    if-nez v12, :cond_14

    iput-boolean v13, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->R:Z

    goto :goto_1a

    :cond_14
    move/from16 v12, p46

    iput-boolean v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->R:Z

    :goto_1a
    and-int/lit16 v12, v0, 0x1000

    if-nez v12, :cond_15

    .line 10
    sget-object v12, Lnd0;->a:Lnd0;

    .line 11
    :goto_1b
    iput-object v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->S:Ljava/util/List;

    goto :goto_1c

    :cond_15
    move-object/from16 v12, p47

    goto :goto_1b

    :goto_1c
    and-int/lit16 v12, v0, 0x2000

    if-nez v12, :cond_16

    .line 12
    sget-object v12, Lpk2;->a:Lpk2;

    .line 13
    :goto_1d
    iput-object v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->T:Lpk2;

    goto :goto_1e

    :cond_16
    move-object/from16 v12, p48

    goto :goto_1d

    :goto_1e
    and-int/lit16 v12, v0, 0x4000

    if-nez v12, :cond_17

    .line 14
    sget-object v12, Lnd0;->a:Lnd0;

    .line 15
    :goto_1f
    iput-object v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->U:Ljava/util/List;

    goto :goto_20

    :cond_17
    move-object/from16 v12, p49

    goto :goto_1f

    :goto_20
    const v12, 0x8000

    and-int/2addr v12, v0

    if-nez v12, :cond_18

    iput-boolean v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->V:Z

    goto :goto_21

    :cond_18
    move/from16 v12, p50

    iput-boolean v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->V:Z

    :goto_21
    const/high16 v12, 0x10000

    and-int/2addr v12, v0

    if-nez v12, :cond_19

    iput-boolean v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->W:Z

    goto :goto_22

    :cond_19
    move/from16 v12, p51

    iput-boolean v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->W:Z

    :goto_22
    const/high16 v12, 0x20000

    and-int/2addr v12, v0

    if-nez v12, :cond_1a

    iput-boolean v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->X:Z

    goto :goto_23

    :cond_1a
    move/from16 v12, p52

    iput-boolean v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->X:Z

    :goto_23
    const/high16 v12, 0x40000

    and-int/2addr v12, v0

    if-nez v12, :cond_1b

    iput-boolean v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Y:Z

    goto :goto_24

    :cond_1b
    move/from16 v12, p53

    iput-boolean v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Y:Z

    :goto_24
    const/high16 v12, 0x80000

    and-int/2addr v12, v0

    if-nez v12, :cond_1c

    iput-boolean v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Z:Z

    goto :goto_25

    :cond_1c
    move/from16 v12, p54

    iput-boolean v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Z:Z

    :goto_25
    const/high16 v12, 0x100000

    and-int/2addr v12, v0

    if-nez v12, :cond_1d

    iput-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->a0:Ljava/lang/String;

    goto :goto_26

    :cond_1d
    move-object/from16 v12, p55

    iput-object v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->a0:Ljava/lang/String;

    :goto_26
    const/high16 v12, 0x200000

    and-int/2addr v12, v0

    if-nez v12, :cond_1e

    iput-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->b0:Ljava/lang/String;

    goto :goto_27

    :cond_1e
    move-object/from16 v12, p56

    iput-object v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->b0:Ljava/lang/String;

    :goto_27
    const/high16 v12, 0x400000

    and-int/2addr v12, v0

    if-nez v12, :cond_1f

    iput-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->c0:Ljava/lang/String;

    goto :goto_28

    :cond_1f
    move-object/from16 v12, p57

    iput-object v12, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->c0:Ljava/lang/String;

    :goto_28
    and-int/2addr v1, v0

    if-nez v1, :cond_20

    iput-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->d0:Ljava/lang/String;

    goto :goto_29

    :cond_20
    move-object/from16 v1, p58

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->d0:Ljava/lang/String;

    :goto_29
    and-int v1, v0, v2

    if-nez v1, :cond_21

    iput-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->e0:Ljava/lang/String;

    goto :goto_2a

    :cond_21
    move-object/from16 v1, p59

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->e0:Ljava/lang/String;

    :goto_2a
    and-int v1, v0, v5

    if-nez v1, :cond_22

    iput-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->f0:Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;

    goto :goto_2b

    :cond_22
    move-object/from16 v1, p60

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->f0:Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;

    :goto_2b
    and-int v1, v0, v6

    if-nez v1, :cond_23

    iput-boolean v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->g0:Z

    goto :goto_2c

    :cond_23
    move/from16 v1, p61

    iput-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->g0:Z

    :goto_2c
    and-int v1, v0, v7

    if-nez v1, :cond_24

    .line 16
    sget-object v1, Lnd0;->a:Lnd0;

    .line 17
    :goto_2d
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->h0:Ljava/util/List;

    goto :goto_2e

    :cond_24
    move-object/from16 v1, p62

    goto :goto_2d

    :goto_2e
    and-int v1, v0, v8

    if-nez v1, :cond_25

    iput-boolean v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->i0:Z

    goto :goto_2f

    :cond_25
    move/from16 v1, p63

    iput-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->i0:Z

    :goto_2f
    and-int v1, v0, v10

    if-nez v1, :cond_26

    iput-object v9, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->j0:Ljava/lang/String;

    goto :goto_30

    :cond_26
    move-object/from16 v1, p64

    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->j0:Ljava/lang/String;

    :goto_30
    and-int/2addr v0, v11

    if-nez v0, :cond_27

    iput-boolean v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->k0:Z

    return-void

    :cond_27
    move/from16 v0, p65

    iput-boolean v0, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->k0:Z

    return-void

    :cond_28
    filled-new-array/range {p1 .. p2}, [I

    move-result-object p0

    filled-new-array {v1, v4}, [I

    move-result-object v0

    sget-object v1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings$$serializer;

    invoke-virtual {v1}, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lb40;->D([I[ILkotlinx/serialization/descriptors/SerialDescriptor;)V

    throw v3
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean p0, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->z:Z

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

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
    instance-of v1, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

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
    check-cast p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->a:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->b:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->c:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->d:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->d:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->e:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->f:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->g:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->g:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->h:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->h:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->i:Ljava/lang/String;

    .line 102
    .line 103
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->i:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->j:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->j:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->k:Ljava/lang/String;

    .line 124
    .line 125
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->k:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-nez v1, :cond_c

    .line 132
    .line 133
    return v2

    .line 134
    :cond_c
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->l:Ljava/lang/String;

    .line 135
    .line 136
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->l:Ljava/lang/String;

    .line 137
    .line 138
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-nez v1, :cond_d

    .line 143
    .line 144
    return v2

    .line 145
    :cond_d
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->m:Ljava/lang/String;

    .line 146
    .line 147
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->m:Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-nez v1, :cond_e

    .line 154
    .line 155
    return v2

    .line 156
    :cond_e
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->n:Ljava/lang/String;

    .line 157
    .line 158
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->n:Ljava/lang/String;

    .line 159
    .line 160
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-nez v1, :cond_f

    .line 165
    .line 166
    return v2

    .line 167
    :cond_f
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->o:Ljava/lang/String;

    .line 168
    .line 169
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->o:Ljava/lang/String;

    .line 170
    .line 171
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-nez v1, :cond_10

    .line 176
    .line 177
    return v2

    .line 178
    :cond_10
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->p:Ljava/lang/String;

    .line 179
    .line 180
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->p:Ljava/lang/String;

    .line 181
    .line 182
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-nez v1, :cond_11

    .line 187
    .line 188
    return v2

    .line 189
    :cond_11
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->q:Ljava/lang/String;

    .line 190
    .line 191
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->q:Ljava/lang/String;

    .line 192
    .line 193
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-nez v1, :cond_12

    .line 198
    .line 199
    return v2

    .line 200
    :cond_12
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->r:Ljava/lang/String;

    .line 201
    .line 202
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->r:Ljava/lang/String;

    .line 203
    .line 204
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-nez v1, :cond_13

    .line 209
    .line 210
    return v2

    .line 211
    :cond_13
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->s:Ljava/lang/String;

    .line 212
    .line 213
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->s:Ljava/lang/String;

    .line 214
    .line 215
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-nez v1, :cond_14

    .line 220
    .line 221
    return v2

    .line 222
    :cond_14
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->t:Ljava/lang/String;

    .line 223
    .line 224
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->t:Ljava/lang/String;

    .line 225
    .line 226
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-nez v1, :cond_15

    .line 231
    .line 232
    return v2

    .line 233
    :cond_15
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->u:Ljava/lang/String;

    .line 234
    .line 235
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->u:Ljava/lang/String;

    .line 236
    .line 237
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-nez v1, :cond_16

    .line 242
    .line 243
    return v2

    .line 244
    :cond_16
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->v:Ljava/lang/String;

    .line 245
    .line 246
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->v:Ljava/lang/String;

    .line 247
    .line 248
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    if-nez v1, :cond_17

    .line 253
    .line 254
    return v2

    .line 255
    :cond_17
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->w:Ljava/lang/String;

    .line 256
    .line 257
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->w:Ljava/lang/String;

    .line 258
    .line 259
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    if-nez v1, :cond_18

    .line 264
    .line 265
    return v2

    .line 266
    :cond_18
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->x:Lfj0;

    .line 267
    .line 268
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->x:Lfj0;

    .line 269
    .line 270
    if-eq v1, v3, :cond_19

    .line 271
    .line 272
    return v2

    .line 273
    :cond_19
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->y:Z

    .line 274
    .line 275
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->y:Z

    .line 276
    .line 277
    if-eq v1, v3, :cond_1a

    .line 278
    .line 279
    return v2

    .line 280
    :cond_1a
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->z:Z

    .line 281
    .line 282
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->z:Z

    .line 283
    .line 284
    if-eq v1, v3, :cond_1b

    .line 285
    .line 286
    return v2

    .line 287
    :cond_1b
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->A:Z

    .line 288
    .line 289
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->A:Z

    .line 290
    .line 291
    if-eq v1, v3, :cond_1c

    .line 292
    .line 293
    return v2

    .line 294
    :cond_1c
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->B:Ljava/lang/String;

    .line 295
    .line 296
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->B:Ljava/lang/String;

    .line 297
    .line 298
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-nez v1, :cond_1d

    .line 303
    .line 304
    return v2

    .line 305
    :cond_1d
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->C:Ljava/lang/String;

    .line 306
    .line 307
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->C:Ljava/lang/String;

    .line 308
    .line 309
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    if-nez v1, :cond_1e

    .line 314
    .line 315
    return v2

    .line 316
    :cond_1e
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->D:Ljava/lang/String;

    .line 317
    .line 318
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->D:Ljava/lang/String;

    .line 319
    .line 320
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-nez v1, :cond_1f

    .line 325
    .line 326
    return v2

    .line 327
    :cond_1f
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->E:Ljava/lang/String;

    .line 328
    .line 329
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->E:Ljava/lang/String;

    .line 330
    .line 331
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    if-nez v1, :cond_20

    .line 336
    .line 337
    return v2

    .line 338
    :cond_20
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->F:Ljava/lang/String;

    .line 339
    .line 340
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->F:Ljava/lang/String;

    .line 341
    .line 342
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    if-nez v1, :cond_21

    .line 347
    .line 348
    return v2

    .line 349
    :cond_21
    iget v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->G:I

    .line 350
    .line 351
    iget v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->G:I

    .line 352
    .line 353
    if-eq v1, v3, :cond_22

    .line 354
    .line 355
    return v2

    .line 356
    :cond_22
    iget v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->H:I

    .line 357
    .line 358
    iget v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->H:I

    .line 359
    .line 360
    if-eq v1, v3, :cond_23

    .line 361
    .line 362
    return v2

    .line 363
    :cond_23
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->I:Z

    .line 364
    .line 365
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->I:Z

    .line 366
    .line 367
    if-eq v1, v3, :cond_24

    .line 368
    .line 369
    return v2

    .line 370
    :cond_24
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->J:Ljava/lang/String;

    .line 371
    .line 372
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->J:Ljava/lang/String;

    .line 373
    .line 374
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    if-nez v1, :cond_25

    .line 379
    .line 380
    return v2

    .line 381
    :cond_25
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->K:Ljava/util/List;

    .line 382
    .line 383
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->K:Ljava/util/List;

    .line 384
    .line 385
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    if-nez v1, :cond_26

    .line 390
    .line 391
    return v2

    .line 392
    :cond_26
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->L:Ljava/lang/Boolean;

    .line 393
    .line 394
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->L:Ljava/lang/Boolean;

    .line 395
    .line 396
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v1

    .line 400
    if-nez v1, :cond_27

    .line 401
    .line 402
    return v2

    .line 403
    :cond_27
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->M:Ljava/lang/Boolean;

    .line 404
    .line 405
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->M:Ljava/lang/Boolean;

    .line 406
    .line 407
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    if-nez v1, :cond_28

    .line 412
    .line 413
    return v2

    .line 414
    :cond_28
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->N:Z

    .line 415
    .line 416
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->N:Z

    .line 417
    .line 418
    if-eq v1, v3, :cond_29

    .line 419
    .line 420
    return v2

    .line 421
    :cond_29
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->O:Ljava/lang/String;

    .line 422
    .line 423
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->O:Ljava/lang/String;

    .line 424
    .line 425
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    if-nez v1, :cond_2a

    .line 430
    .line 431
    return v2

    .line 432
    :cond_2a
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->P:Z

    .line 433
    .line 434
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->P:Z

    .line 435
    .line 436
    if-eq v1, v3, :cond_2b

    .line 437
    .line 438
    return v2

    .line 439
    :cond_2b
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Q:Ljava/util/List;

    .line 440
    .line 441
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Q:Ljava/util/List;

    .line 442
    .line 443
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    if-nez v1, :cond_2c

    .line 448
    .line 449
    return v2

    .line 450
    :cond_2c
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->R:Z

    .line 451
    .line 452
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->R:Z

    .line 453
    .line 454
    if-eq v1, v3, :cond_2d

    .line 455
    .line 456
    return v2

    .line 457
    :cond_2d
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->S:Ljava/util/List;

    .line 458
    .line 459
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->S:Ljava/util/List;

    .line 460
    .line 461
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    if-nez v1, :cond_2e

    .line 466
    .line 467
    return v2

    .line 468
    :cond_2e
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->T:Lpk2;

    .line 469
    .line 470
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->T:Lpk2;

    .line 471
    .line 472
    if-eq v1, v3, :cond_2f

    .line 473
    .line 474
    return v2

    .line 475
    :cond_2f
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->U:Ljava/util/List;

    .line 476
    .line 477
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->U:Ljava/util/List;

    .line 478
    .line 479
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    if-nez v1, :cond_30

    .line 484
    .line 485
    return v2

    .line 486
    :cond_30
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->V:Z

    .line 487
    .line 488
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->V:Z

    .line 489
    .line 490
    if-eq v1, v3, :cond_31

    .line 491
    .line 492
    return v2

    .line 493
    :cond_31
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->W:Z

    .line 494
    .line 495
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->W:Z

    .line 496
    .line 497
    if-eq v1, v3, :cond_32

    .line 498
    .line 499
    return v2

    .line 500
    :cond_32
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->X:Z

    .line 501
    .line 502
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->X:Z

    .line 503
    .line 504
    if-eq v1, v3, :cond_33

    .line 505
    .line 506
    return v2

    .line 507
    :cond_33
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Y:Z

    .line 508
    .line 509
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Y:Z

    .line 510
    .line 511
    if-eq v1, v3, :cond_34

    .line 512
    .line 513
    return v2

    .line 514
    :cond_34
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Z:Z

    .line 515
    .line 516
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Z:Z

    .line 517
    .line 518
    if-eq v1, v3, :cond_35

    .line 519
    .line 520
    return v2

    .line 521
    :cond_35
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->a0:Ljava/lang/String;

    .line 522
    .line 523
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->a0:Ljava/lang/String;

    .line 524
    .line 525
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v1

    .line 529
    if-nez v1, :cond_36

    .line 530
    .line 531
    return v2

    .line 532
    :cond_36
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->b0:Ljava/lang/String;

    .line 533
    .line 534
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->b0:Ljava/lang/String;

    .line 535
    .line 536
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result v1

    .line 540
    if-nez v1, :cond_37

    .line 541
    .line 542
    return v2

    .line 543
    :cond_37
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->c0:Ljava/lang/String;

    .line 544
    .line 545
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->c0:Ljava/lang/String;

    .line 546
    .line 547
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    if-nez v1, :cond_38

    .line 552
    .line 553
    return v2

    .line 554
    :cond_38
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->d0:Ljava/lang/String;

    .line 555
    .line 556
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->d0:Ljava/lang/String;

    .line 557
    .line 558
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v1

    .line 562
    if-nez v1, :cond_39

    .line 563
    .line 564
    return v2

    .line 565
    :cond_39
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->e0:Ljava/lang/String;

    .line 566
    .line 567
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->e0:Ljava/lang/String;

    .line 568
    .line 569
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    move-result v1

    .line 573
    if-nez v1, :cond_3a

    .line 574
    .line 575
    return v2

    .line 576
    :cond_3a
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->f0:Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;

    .line 577
    .line 578
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->f0:Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;

    .line 579
    .line 580
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result v1

    .line 584
    if-nez v1, :cond_3b

    .line 585
    .line 586
    return v2

    .line 587
    :cond_3b
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->g0:Z

    .line 588
    .line 589
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->g0:Z

    .line 590
    .line 591
    if-eq v1, v3, :cond_3c

    .line 592
    .line 593
    return v2

    .line 594
    :cond_3c
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->h0:Ljava/util/List;

    .line 595
    .line 596
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->h0:Ljava/util/List;

    .line 597
    .line 598
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    move-result v1

    .line 602
    if-nez v1, :cond_3d

    .line 603
    .line 604
    return v2

    .line 605
    :cond_3d
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->i0:Z

    .line 606
    .line 607
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->i0:Z

    .line 608
    .line 609
    if-eq v1, v3, :cond_3e

    .line 610
    .line 611
    return v2

    .line 612
    :cond_3e
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->j0:Ljava/lang/String;

    .line 613
    .line 614
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->j0:Ljava/lang/String;

    .line 615
    .line 616
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    move-result v1

    .line 620
    if-nez v1, :cond_3f

    .line 621
    .line 622
    return v2

    .line 623
    :cond_3f
    iget-boolean p0, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->k0:Z

    .line 624
    .line 625
    iget-boolean p1, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->k0:Z

    .line 626
    .line 627
    if-eq p0, p1, :cond_40

    .line 628
    .line 629
    return v2

    .line 630
    :cond_40
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->j:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->k:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->l:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->m:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->n:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->o:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->p:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->q:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->r:Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->s:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->t:Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->u:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->v:Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->w:Ljava/lang/String;

    .line 137
    .line 138
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    const/4 v2, 0x0

    .line 143
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->x:Lfj0;

    .line 144
    .line 145
    if-nez v3, :cond_0

    .line 146
    .line 147
    move v3, v2

    .line 148
    goto :goto_0

    .line 149
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    :goto_0
    add-int/2addr v0, v3

    .line 154
    mul-int/2addr v0, v1

    .line 155
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->y:Z

    .line 156
    .line 157
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->z:Z

    .line 162
    .line 163
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->A:Z

    .line 168
    .line 169
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->B:Ljava/lang/String;

    .line 174
    .line 175
    invoke-static {v0, v1, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->C:Ljava/lang/String;

    .line 180
    .line 181
    invoke-static {v0, v1, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->D:Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {v0, v1, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->E:Ljava/lang/String;

    .line 192
    .line 193
    invoke-static {v0, v1, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->F:Ljava/lang/String;

    .line 198
    .line 199
    invoke-static {v0, v1, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    iget v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->G:I

    .line 204
    .line 205
    invoke-static {v3, v0, v1}, Lcom/appsflyer/internal/j;->a(III)I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    iget v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->H:I

    .line 210
    .line 211
    invoke-static {v3, v0, v1}, Lcom/appsflyer/internal/j;->a(III)I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->I:Z

    .line 216
    .line 217
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->J:Ljava/lang/String;

    .line 222
    .line 223
    if-nez v3, :cond_1

    .line 224
    .line 225
    move v3, v2

    .line 226
    goto :goto_1

    .line 227
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    :goto_1
    add-int/2addr v0, v3

    .line 232
    mul-int/2addr v0, v1

    .line 233
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->K:Ljava/util/List;

    .line 234
    .line 235
    invoke-static {v0, v1, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->L:Ljava/lang/Boolean;

    .line 240
    .line 241
    if-nez v3, :cond_2

    .line 242
    .line 243
    move v3, v2

    .line 244
    goto :goto_2

    .line 245
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    :goto_2
    add-int/2addr v0, v3

    .line 250
    mul-int/2addr v0, v1

    .line 251
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->M:Ljava/lang/Boolean;

    .line 252
    .line 253
    if-nez v3, :cond_3

    .line 254
    .line 255
    move v3, v2

    .line 256
    goto :goto_3

    .line 257
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    :goto_3
    add-int/2addr v0, v3

    .line 262
    mul-int/2addr v0, v1

    .line 263
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->N:Z

    .line 264
    .line 265
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->O:Ljava/lang/String;

    .line 270
    .line 271
    invoke-static {v0, v1, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->P:Z

    .line 276
    .line 277
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Q:Ljava/util/List;

    .line 282
    .line 283
    invoke-static {v0, v1, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->R:Z

    .line 288
    .line 289
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->S:Ljava/util/List;

    .line 294
    .line 295
    invoke-static {v0, v1, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->T:Lpk2;

    .line 300
    .line 301
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    add-int/2addr v3, v0

    .line 306
    mul-int/2addr v3, v1

    .line 307
    iget-object v0, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->U:Ljava/util/List;

    .line 308
    .line 309
    invoke-static {v3, v1, v0}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->V:Z

    .line 314
    .line 315
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->W:Z

    .line 320
    .line 321
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->X:Z

    .line 326
    .line 327
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Y:Z

    .line 332
    .line 333
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Z:Z

    .line 338
    .line 339
    invoke-static {v0, v1, v3}, Len;->h(IIZ)I

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->a0:Ljava/lang/String;

    .line 344
    .line 345
    if-nez v3, :cond_4

    .line 346
    .line 347
    move v3, v2

    .line 348
    goto :goto_4

    .line 349
    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    :goto_4
    add-int/2addr v0, v3

    .line 354
    mul-int/2addr v0, v1

    .line 355
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->b0:Ljava/lang/String;

    .line 356
    .line 357
    if-nez v3, :cond_5

    .line 358
    .line 359
    move v3, v2

    .line 360
    goto :goto_5

    .line 361
    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    :goto_5
    add-int/2addr v0, v3

    .line 366
    mul-int/2addr v0, v1

    .line 367
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->c0:Ljava/lang/String;

    .line 368
    .line 369
    if-nez v3, :cond_6

    .line 370
    .line 371
    move v3, v2

    .line 372
    goto :goto_6

    .line 373
    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    :goto_6
    add-int/2addr v0, v3

    .line 378
    mul-int/2addr v0, v1

    .line 379
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->d0:Ljava/lang/String;

    .line 380
    .line 381
    if-nez v3, :cond_7

    .line 382
    .line 383
    move v3, v2

    .line 384
    goto :goto_7

    .line 385
    :cond_7
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    :goto_7
    add-int/2addr v0, v3

    .line 390
    mul-int/2addr v0, v1

    .line 391
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->e0:Ljava/lang/String;

    .line 392
    .line 393
    if-nez v3, :cond_8

    .line 394
    .line 395
    move v3, v2

    .line 396
    goto :goto_8

    .line 397
    :cond_8
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 398
    .line 399
    .line 400
    move-result v3

    .line 401
    :goto_8
    add-int/2addr v0, v3

    .line 402
    mul-int/2addr v0, v1

    .line 403
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->f0:Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;

    .line 404
    .line 405
    if-nez v3, :cond_9

    .line 406
    .line 407
    goto :goto_9

    .line 408
    :cond_9
    invoke-virtual {v3}, Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;->hashCode()I

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    :goto_9
    add-int/2addr v0, v2

    .line 413
    mul-int/2addr v0, v1

    .line 414
    iget-boolean v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->g0:Z

    .line 415
    .line 416
    invoke-static {v0, v1, v2}, Len;->h(IIZ)I

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->h0:Ljava/util/List;

    .line 421
    .line 422
    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    iget-boolean v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->i0:Z

    .line 427
    .line 428
    invoke-static {v0, v1, v2}, Len;->h(IIZ)I

    .line 429
    .line 430
    .line 431
    move-result v0

    .line 432
    iget-object v2, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->j0:Ljava/lang/String;

    .line 433
    .line 434
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    iget-boolean p0, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->k0:Z

    .line 439
    .line 440
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 441
    .line 442
    .line 443
    move-result p0

    .line 444
    add-int/2addr p0, v0

    .line 445
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", secondLayerTitle="

    .line 2
    .line 3
    const-string v1, ", tabsPurposeLabel="

    .line 4
    .line 5
    const-string v2, "TCF2Settings(firstLayerTitle="

    .line 6
    .line 7
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Len;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", tabsVendorsLabel="

    .line 16
    .line 17
    const-string v2, ", labelsFeatures="

    .line 18
    .line 19
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", labelsIabVendors="

    .line 27
    .line 28
    const-string v2, ", labelsNonIabPurposes="

    .line 29
    .line 30
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->f:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", labelsNonIabVendors="

    .line 38
    .line 39
    const-string v2, ", labelsPurposes="

    .line 40
    .line 41
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->g:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->h:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v1, ", vendorFeatures="

    .line 49
    .line 50
    const-string v2, ", vendorLegitimateInterestPurposes="

    .line 51
    .line 52
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->i:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->j:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-string v1, ", vendorPurpose="

    .line 60
    .line 61
    const-string v2, ", vendorSpecialFeatures="

    .line 62
    .line 63
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->k:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->l:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string v1, ", vendorSpecialPurposes="

    .line 71
    .line 72
    const-string v2, ", togglesConsentToggleLabel="

    .line 73
    .line 74
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->m:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->n:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v1, ", togglesLegIntToggleLabel="

    .line 82
    .line 83
    const-string v2, ", buttonsAcceptAllLabel="

    .line 84
    .line 85
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->o:Ljava/lang/String;

    .line 86
    .line 87
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->p:Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const-string v1, ", buttonsDenyAllLabel="

    .line 93
    .line 94
    const-string v2, ", buttonsSaveLabel="

    .line 95
    .line 96
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->q:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->r:Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const-string v1, ", linksManageSettingsLabel="

    .line 104
    .line 105
    const-string v2, ", linksVendorListLinkLabel="

    .line 106
    .line 107
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->s:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->t:Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    const-string v1, ", togglesSpecialFeaturesToggleOn="

    .line 115
    .line 116
    const-string v2, ", togglesSpecialFeaturesToggleOff="

    .line 117
    .line 118
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->u:Ljava/lang/String;

    .line 119
    .line 120
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->v:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->w:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v1, ", firstLayerMobileVariant="

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->x:Lfj0;

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v1, ", firstLayerHideToggles="

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->y:Z

    .line 146
    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v1, ", secondLayerHideToggles="

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->z:Z

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const-string v1, ", hideLegitimateInterestToggles="

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->A:Z

    .line 166
    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v1, ", categoriesOfDataLabel="

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->B:Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v1, ", dataRetentionPeriodLabel="

    .line 181
    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v1, ", legitimateInterestLabel="

    .line 186
    .line 187
    const-string v2, ", version="

    .line 188
    .line 189
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->C:Ljava/lang/String;

    .line 190
    .line 191
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->D:Ljava/lang/String;

    .line 192
    .line 193
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    const-string v1, ", examplesLabel="

    .line 197
    .line 198
    const-string v2, ", cmpId="

    .line 199
    .line 200
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->E:Ljava/lang/String;

    .line 201
    .line 202
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->F:Ljava/lang/String;

    .line 203
    .line 204
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    iget v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->G:I

    .line 208
    .line 209
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    const-string v1, ", cmpVersion="

    .line 213
    .line 214
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    iget v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->H:I

    .line 218
    .line 219
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    const-string v1, ", showDataSharedOutsideEUText="

    .line 223
    .line 224
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->I:Z

    .line 228
    .line 229
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    const-string v1, ", dataSharedOutsideEUText="

    .line 233
    .line 234
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->J:Ljava/lang/String;

    .line 238
    .line 239
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    const-string v1, ", vendorIdsOutsideEUList="

    .line 243
    .line 244
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->K:Ljava/util/List;

    .line 248
    .line 249
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v1, ", firstLayerHideButtonDeny="

    .line 253
    .line 254
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->L:Ljava/lang/Boolean;

    .line 258
    .line 259
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    const-string v1, ", hideButtonManageSettings="

    .line 263
    .line 264
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->M:Ljava/lang/Boolean;

    .line 268
    .line 269
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    const-string v1, ", secondLayerHideButtonDeny="

    .line 273
    .line 274
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->N:Z

    .line 278
    .line 279
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    const-string v1, ", publisherCountryCode="

    .line 283
    .line 284
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->O:Ljava/lang/String;

    .line 288
    .line 289
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    const-string v1, ", purposeOneTreatment="

    .line 293
    .line 294
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->P:Z

    .line 298
    .line 299
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    const-string v1, ", selectedVendorIds="

    .line 303
    .line 304
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Q:Ljava/util/List;

    .line 308
    .line 309
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    const-string v1, ", gdprApplies="

    .line 313
    .line 314
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->R:Z

    .line 318
    .line 319
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    const-string v1, ", selectedStacks="

    .line 323
    .line 324
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->S:Ljava/util/List;

    .line 328
    .line 329
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    const-string v1, ", scope="

    .line 333
    .line 334
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->T:Lpk2;

    .line 338
    .line 339
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    const-string v1, ", disabledSpecialFeatures="

    .line 343
    .line 344
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->U:Ljava/util/List;

    .line 348
    .line 349
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    const-string v1, ", firstLayerShowDescriptions="

    .line 353
    .line 354
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->V:Z

    .line 358
    .line 359
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    const-string v1, ", hideNonIabOnFirstLayer="

    .line 363
    .line 364
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->W:Z

    .line 368
    .line 369
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    const-string v1, ", resurfacePeriodEnded="

    .line 373
    .line 374
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->X:Z

    .line 378
    .line 379
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    const-string v1, ", resurfacePurposeChanged="

    .line 383
    .line 384
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Y:Z

    .line 388
    .line 389
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    const-string v1, ", resurfaceVendorAdded="

    .line 393
    .line 394
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Z:Z

    .line 398
    .line 399
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    const-string v1, ", firstLayerDescription="

    .line 403
    .line 404
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    const-string v1, ", firstLayerAdditionalInfo="

    .line 408
    .line 409
    const-string v2, ", secondLayerDescription="

    .line 410
    .line 411
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->a0:Ljava/lang/String;

    .line 412
    .line 413
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->b0:Ljava/lang/String;

    .line 414
    .line 415
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    const-string v1, ", appLayerNoteResurface="

    .line 419
    .line 420
    const-string v2, ", firstLayerNoteResurface="

    .line 421
    .line 422
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->c0:Ljava/lang/String;

    .line 423
    .line 424
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->d0:Ljava/lang/String;

    .line 425
    .line 426
    invoke-static {v0, v3, v1, v4, v2}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->e0:Ljava/lang/String;

    .line 430
    .line 431
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    const-string v1, ", changedPurposes="

    .line 435
    .line 436
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->f0:Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;

    .line 440
    .line 441
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    const-string v1, ", acmV2Enabled="

    .line 445
    .line 446
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->g0:Z

    .line 450
    .line 451
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    const-string v1, ", selectedATPIds="

    .line 455
    .line 456
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->h0:Ljava/util/List;

    .line 460
    .line 461
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    const-string v1, ", resurfaceATPListChanged="

    .line 465
    .line 466
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->i0:Z

    .line 470
    .line 471
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    const-string v1, ", atpListTitle="

    .line 475
    .line 476
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->j0:Ljava/lang/String;

    .line 480
    .line 481
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    const-string v1, ", maintainLegitimateInterest="

    .line 485
    .line 486
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    const-string v1, ")"

    .line 490
    .line 491
    iget-boolean p0, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->k0:Z

    .line 492
    .line 493
    invoke-static {v0, p0, v1}, Len;->o(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object p0

    .line 497
    return-object p0
.end method

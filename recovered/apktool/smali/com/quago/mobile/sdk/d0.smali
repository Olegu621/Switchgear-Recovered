.class public final Lcom/quago/mobile/sdk/d0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final transient w:Lcom/quago/mobile/sdk/j0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;

.field public final q:Ljava/lang/String;

.field public final r:Ljava/lang/String;

.field public final s:Ljava/util/ArrayList;

.field public final t:Ljava/util/ArrayList;

.field public final u:Ljava/util/ArrayList;

.field public final v:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/k0;->a:Ljava/util/Locale;

    .line 2
    .line 3
    new-instance v0, Lcom/quago/mobile/sdk/j0;

    .line 4
    .line 5
    const-string v1, "QuagoBuild"

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/quago/mobile/sdk/j0;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const-string v0, "Build"

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    sget-object v2, Landroid/os/Build;->BOARD:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    move-exception v2

    .line 11
    sget-object v3, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 12
    .line 13
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    move-object v2, v1

    .line 17
    :goto_0
    iput-object v2, p0, Lcom/quago/mobile/sdk/d0;->a:Ljava/lang/String;

    .line 18
    .line 19
    :try_start_1
    sget-object v2, Landroid/os/Build;->BOOTLOADER:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :catch_1
    move-exception v2

    .line 23
    sget-object v3, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 24
    .line 25
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object v2, v1

    .line 29
    :goto_1
    iput-object v2, p0, Lcom/quago/mobile/sdk/d0;->b:Ljava/lang/String;

    .line 30
    .line 31
    :try_start_2
    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :catch_2
    move-exception v2

    .line 35
    sget-object v3, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 36
    .line 37
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    move-object v2, v1

    .line 41
    :goto_2
    iput-object v2, p0, Lcom/quago/mobile/sdk/d0;->c:Ljava/lang/String;

    .line 42
    .line 43
    :try_start_3
    sget-object v2, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :catch_3
    move-exception v2

    .line 47
    sget-object v3, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 48
    .line 49
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object v2, v1

    .line 53
    :goto_3
    iput-object v2, p0, Lcom/quago/mobile/sdk/d0;->d:Ljava/lang/String;

    .line 54
    .line 55
    :try_start_4
    sget-object v2, Landroid/os/Build;->CPU_ABI2:Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 56
    .line 57
    goto :goto_4

    .line 58
    :catch_4
    move-exception v2

    .line 59
    sget-object v3, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 60
    .line 61
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    move-object v2, v1

    .line 65
    :goto_4
    iput-object v2, p0, Lcom/quago/mobile/sdk/d0;->e:Ljava/lang/String;

    .line 66
    .line 67
    :try_start_5
    sget-object v2, Landroid/os/Build;->DEVICE:Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 68
    .line 69
    goto :goto_5

    .line 70
    :catch_5
    move-exception v2

    .line 71
    sget-object v3, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 72
    .line 73
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    move-object v2, v1

    .line 77
    :goto_5
    iput-object v2, p0, Lcom/quago/mobile/sdk/d0;->f:Ljava/lang/String;

    .line 78
    .line 79
    :try_start_6
    sget-object v2, Landroid/os/Build;->DISPLAY:Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 80
    .line 81
    goto :goto_6

    .line 82
    :catch_6
    move-exception v2

    .line 83
    sget-object v3, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 84
    .line 85
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    move-object v2, v1

    .line 89
    :goto_6
    iput-object v2, p0, Lcom/quago/mobile/sdk/d0;->g:Ljava/lang/String;

    .line 90
    .line 91
    :try_start_7
    sget-object v2, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    .line 92
    .line 93
    goto :goto_7

    .line 94
    :catch_7
    move-exception v2

    .line 95
    sget-object v3, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 96
    .line 97
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    move-object v2, v1

    .line 101
    :goto_7
    iput-object v2, p0, Lcom/quago/mobile/sdk/d0;->h:Ljava/lang/String;

    .line 102
    .line 103
    :try_start_8
    sget-object v2, Landroid/os/Build;->HARDWARE:Ljava/lang/String;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    .line 104
    .line 105
    goto :goto_8

    .line 106
    :catch_8
    move-exception v2

    .line 107
    sget-object v3, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 108
    .line 109
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    move-object v2, v1

    .line 113
    :goto_8
    iput-object v2, p0, Lcom/quago/mobile/sdk/d0;->i:Ljava/lang/String;

    .line 114
    .line 115
    :try_start_9
    sget-object v2, Landroid/os/Build;->HOST:Ljava/lang/String;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    .line 116
    .line 117
    goto :goto_9

    .line 118
    :catch_9
    move-exception v2

    .line 119
    sget-object v3, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 120
    .line 121
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    move-object v2, v1

    .line 125
    :goto_9
    iput-object v2, p0, Lcom/quago/mobile/sdk/d0;->j:Ljava/lang/String;

    .line 126
    .line 127
    :try_start_a
    sget-object v2, Landroid/os/Build;->ID:Ljava/lang/String;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a

    .line 128
    .line 129
    goto :goto_a

    .line 130
    :catch_a
    move-exception v2

    .line 131
    sget-object v3, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 132
    .line 133
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    move-object v2, v1

    .line 137
    :goto_a
    iput-object v2, p0, Lcom/quago/mobile/sdk/d0;->k:Ljava/lang/String;

    .line 138
    .line 139
    :try_start_b
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_b

    .line 140
    .line 141
    goto :goto_b

    .line 142
    :catch_b
    move-exception v2

    .line 143
    sget-object v3, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 144
    .line 145
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    move-object v2, v1

    .line 149
    :goto_b
    iput-object v2, p0, Lcom/quago/mobile/sdk/d0;->l:Ljava/lang/String;

    .line 150
    .line 151
    :try_start_c
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c

    .line 152
    .line 153
    goto :goto_c

    .line 154
    :catch_c
    move-exception v2

    .line 155
    sget-object v3, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 156
    .line 157
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    move-object v2, v1

    .line 161
    :goto_c
    iput-object v2, p0, Lcom/quago/mobile/sdk/d0;->m:Ljava/lang/String;

    .line 162
    .line 163
    :try_start_d
    sget-object v2, Landroid/os/Build;->PRODUCT:Ljava/lang/String;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_d

    .line 164
    .line 165
    goto :goto_d

    .line 166
    :catch_d
    move-exception v2

    .line 167
    sget-object v3, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 168
    .line 169
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    move-object v2, v1

    .line 173
    :goto_d
    iput-object v2, p0, Lcom/quago/mobile/sdk/d0;->n:Ljava/lang/String;

    .line 174
    .line 175
    :try_start_e
    invoke-static {}, Landroid/os/Build;->getRadioVersion()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v2
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_e

    .line 179
    goto :goto_e

    .line 180
    :catch_e
    move-exception v2

    .line 181
    sget-object v3, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 182
    .line 183
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    move-object v2, v1

    .line 187
    :goto_e
    iput-object v2, p0, Lcom/quago/mobile/sdk/d0;->o:Ljava/lang/String;

    .line 188
    .line 189
    new-instance v2, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 192
    .line 193
    .line 194
    new-instance v3, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 197
    .line 198
    .line 199
    new-instance v4, Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 202
    .line 203
    .line 204
    :try_start_f
    sget-object v5, Landroid/os/Build;->SUPPORTED_32_BIT_ABIS:[Ljava/lang/String;

    .line 205
    .line 206
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_f

    .line 211
    .line 212
    .line 213
    goto :goto_f

    .line 214
    :catch_f
    move-exception v5

    .line 215
    sget-object v6, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 216
    .line 217
    invoke-virtual {v6, v0, v5}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    :goto_f
    :try_start_10
    sget-object v5, Landroid/os/Build;->SUPPORTED_64_BIT_ABIS:[Ljava/lang/String;

    .line 221
    .line 222
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_10

    .line 227
    .line 228
    .line 229
    goto :goto_10

    .line 230
    :catch_10
    move-exception v5

    .line 231
    sget-object v6, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 232
    .line 233
    invoke-virtual {v6, v0, v5}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 234
    .line 235
    .line 236
    :goto_10
    :try_start_11
    sget-object v5, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    .line 237
    .line 238
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_11

    .line 243
    .line 244
    .line 245
    goto :goto_11

    .line 246
    :catch_11
    move-exception v5

    .line 247
    sget-object v6, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 248
    .line 249
    invoke-virtual {v6, v0, v5}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 250
    .line 251
    .line 252
    :goto_11
    iput-object v2, p0, Lcom/quago/mobile/sdk/d0;->s:Ljava/util/ArrayList;

    .line 253
    .line 254
    iput-object v3, p0, Lcom/quago/mobile/sdk/d0;->t:Ljava/util/ArrayList;

    .line 255
    .line 256
    iput-object v4, p0, Lcom/quago/mobile/sdk/d0;->u:Ljava/util/ArrayList;

    .line 257
    .line 258
    :try_start_12
    sget-object v2, Landroid/os/Build;->TAGS:Ljava/lang/String;
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_12

    .line 259
    .line 260
    goto :goto_12

    .line 261
    :catch_12
    move-exception v2

    .line 262
    sget-object v3, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 263
    .line 264
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 265
    .line 266
    .line 267
    move-object v2, v1

    .line 268
    :goto_12
    iput-object v2, p0, Lcom/quago/mobile/sdk/d0;->p:Ljava/lang/String;

    .line 269
    .line 270
    :try_start_13
    sget-wide v2, Landroid/os/Build;->TIME:J
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_13

    .line 271
    .line 272
    goto :goto_13

    .line 273
    :catch_13
    move-exception v2

    .line 274
    sget-object v3, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 275
    .line 276
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 277
    .line 278
    .line 279
    const-wide/16 v2, 0x0

    .line 280
    .line 281
    :goto_13
    iput-wide v2, p0, Lcom/quago/mobile/sdk/d0;->v:J

    .line 282
    .line 283
    :try_start_14
    sget-object v2, Landroid/os/Build;->TYPE:Ljava/lang/String;
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_14

    .line 284
    .line 285
    goto :goto_14

    .line 286
    :catch_14
    move-exception v2

    .line 287
    sget-object v3, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 288
    .line 289
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 290
    .line 291
    .line 292
    move-object v2, v1

    .line 293
    :goto_14
    iput-object v2, p0, Lcom/quago/mobile/sdk/d0;->q:Ljava/lang/String;

    .line 294
    .line 295
    :try_start_15
    sget-object v1, Landroid/os/Build;->USER:Ljava/lang/String;
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_15

    .line 296
    .line 297
    goto :goto_15

    .line 298
    :catch_15
    move-exception v2

    .line 299
    sget-object v3, Lcom/quago/mobile/sdk/d0;->w:Lcom/quago/mobile/sdk/j0;

    .line 300
    .line 301
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 302
    .line 303
    .line 304
    :goto_15
    iput-object v1, p0, Lcom/quago/mobile/sdk/d0;->r:Ljava/lang/String;

    .line 305
    .line 306
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "QuagoBuild{board=\'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\', bootloader=\'"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "\', brand=\'"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, "\', cpu_abi=\'"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, "\', cpu_abi2=\'"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->e:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, "\', device=\'"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->f:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, "\', display=\'"

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->g:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, "\', fingerprint=\'"

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->h:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, "\', hardware=\'"

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->i:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, "\', host=\'"

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->j:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, "\', id=\'"

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->k:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v1, "\', manufacturer=\'"

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->l:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v1, "\', model=\'"

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->m:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v1, "\', product=\'"

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->n:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, "\', radio=\'"

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->o:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v1, "\', tags=\'"

    .line 154
    .line 155
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->p:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v1, "\', type=\'"

    .line 164
    .line 165
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->q:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v1, "\', user=\'"

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->r:Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v1, "\', supported_32_bit_abis="

    .line 184
    .line 185
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->s:Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const-string v1, ", supported_64_bit_abis="

    .line 202
    .line 203
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->t:Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    const-string v1, ", supported_abis="

    .line 220
    .line 221
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    iget-object v1, p0, Lcom/quago/mobile/sdk/d0;->u:Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-virtual {v1}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    const-string v1, ", time="

    .line 238
    .line 239
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    iget-wide v1, p0, Lcom/quago/mobile/sdk/d0;->v:J

    .line 243
    .line 244
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const/16 p0, 0x7d

    .line 248
    .line 249
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    return-object p0
.end method

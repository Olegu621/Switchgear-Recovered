.class public final Lsg3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lrg3;
.implements Lnh3;


# instance fields
.field public final a:Ljava/util/logging/Level;

.field public final b:J

.field public c:Leh3;

.field public d:Lhh3;

.field public e:Lxh3;

.field public f:[Ljava/lang/Object;

.field public final synthetic g:Lqc3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/String;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lqc3;)V
    .locals 3

    .line 1
    sget-object v0, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 2
    .line 3
    iput-object p1, p0, Lsg3;->g:Lqc3;

    .line 4
    .line 5
    sget-object p1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 6
    .line 7
    sget-object v0, Ljj3;->a:Llj3;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    iput-object v2, p0, Lsg3;->c:Leh3;

    .line 27
    .line 28
    iput-object v2, p0, Lsg3;->d:Lhh3;

    .line 29
    .line 30
    iput-object v2, p0, Lsg3;->e:Lxh3;

    .line 31
    .line 32
    iput-object v2, p0, Lsg3;->f:[Ljava/lang/Object;

    .line 33
    .line 34
    const-string v2, "level"

    .line 35
    .line 36
    invoke-static {p1, v2}, Lpg3;->F(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lsg3;->a:Ljava/util/logging/Level;

    .line 40
    .line 41
    iput-wide v0, p0, Lsg3;->b:J

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnh3;
    .locals 1

    .line 1
    new-instance v0, Lgh3;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Lgh3;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lsg3;->d:Lhh3;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    iput-object v0, p0, Lsg3;->d:Lhh3;

    .line 11
    .line 12
    :cond_0
    return-object p0
.end method

.method public final b(Luo3;)Lnh3;
    .locals 2

    .line 1
    sget-object v0, Ldh3;->a:Lph3;

    .line 2
    .line 3
    const-string v1, "metadata key"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lpg3;->F(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0, p1}, Lsg3;->d(Lph3;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final c()Lkb1;
    .locals 0

    .line 1
    iget-object p0, p0, Lsg3;->c:Leh3;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object p0, Lni3;->e:Lni3;

    .line 7
    .line 8
    return-object p0
.end method

.method public final d(Lph3;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsg3;->c:Leh3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Leh3;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    new-array v1, v1, [Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v1, v0, Leh3;->e:[Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput v1, v0, Leh3;->f:I

    .line 18
    .line 19
    iput-object v0, p0, Lsg3;->c:Leh3;

    .line 20
    .line 21
    :cond_0
    iget-object p0, p0, Lsg3;->c:Leh3;

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Leh3;->b0(Lph3;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final zzq()V
    .locals 14

    .line 1
    iget-object v0, p0, Lsg3;->d:Lhh3;

    .line 2
    .line 3
    sget-object v1, Lhh3;->a:Lfh3;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Ljj3;->a:Llj3;

    .line 8
    .line 9
    check-cast v0, Lrj3;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v0, Lrj3;->b:Ldg3;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lsg3;->d:Lhh3;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lsg3;->d:Lhh3;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eq v0, v1, :cond_2

    .line 26
    .line 27
    iget-object v1, p0, Lsg3;->c:Leh3;

    .line 28
    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    iget v4, v1, Leh3;->f:I

    .line 32
    .line 33
    if-lez v4, :cond_3

    .line 34
    .line 35
    const-string v4, "logSiteKey"

    .line 36
    .line 37
    invoke-static {v0, v4}, Lpg3;->F(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget v4, v1, Leh3;->f:I

    .line 41
    .line 42
    move v5, v3

    .line 43
    :goto_0
    if-ge v5, v4, :cond_3

    .line 44
    .line 45
    sget-object v6, Ldh3;->e:Lch3;

    .line 46
    .line 47
    invoke-virtual {v1, v5}, Leh3;->Y(I)Lph3;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_1

    .line 56
    .line 57
    invoke-virtual {v1, v5}, Leh3;->Z(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    new-instance v7, Lzh3;

    .line 62
    .line 63
    invoke-direct {v7, v0, v6}, Lzh3;-><init>(Ljh3;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    move-object v0, v7

    .line 67
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move-object v0, v2

    .line 71
    :cond_3
    invoke-virtual {p0}, Lsg3;->c()Lkb1;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Lkb1;->X()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    move v5, v3

    .line 80
    :goto_1
    if-ge v5, v4, :cond_5

    .line 81
    .line 82
    invoke-virtual {v1, v5}, Lkb1;->Y(I)Lph3;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    iget-object v6, v6, Lph3;->a:Ljava/lang/String;

    .line 87
    .line 88
    const-string v7, "eye3tag"

    .line 89
    .line 90
    if-ne v6, v7, :cond_4

    .line 91
    .line 92
    sget-object v4, Ldh3;->a:Lph3;

    .line 93
    .line 94
    invoke-virtual {v1, v4}, Lkb1;->a0(Lph3;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    if-nez v4, :cond_5

    .line 99
    .line 100
    sget-object v4, Ldh3;->h:Lph3;

    .line 101
    .line 102
    invoke-virtual {v1, v4}, Lkb1;->a0(Lph3;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    if-nez v1, :cond_5

    .line 107
    .line 108
    sget-object v1, Lai3;->b:Lai3;

    .line 109
    .line 110
    invoke-virtual {p0, v4, v1}, Lsg3;->d(Lph3;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_5
    :goto_2
    iget-object v1, p0, Lsg3;->c:Leh3;

    .line 118
    .line 119
    const/4 v4, -0x1

    .line 120
    sget-object v5, Lxh3;->a:Lrh3;

    .line 121
    .line 122
    const/4 v6, 0x1

    .line 123
    if-eqz v1, :cond_19

    .line 124
    .line 125
    if-eqz v0, :cond_b

    .line 126
    .line 127
    sget-object v7, Log3;->c:Lng3;

    .line 128
    .line 129
    sget-object v7, Ldh3;->b:Lph3;

    .line 130
    .line 131
    invoke-virtual {v1, v7}, Leh3;->a0(Lph3;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    check-cast v7, Ljava/lang/Integer;

    .line 136
    .line 137
    if-nez v7, :cond_6

    .line 138
    .line 139
    move-object v1, v2

    .line 140
    goto :goto_3

    .line 141
    :cond_6
    sget-object v8, Log3;->c:Lng3;

    .line 142
    .line 143
    invoke-virtual {v8, v0, v1}, Lsq3;->p(Ljh3;Lkb1;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    check-cast v1, Log3;

    .line 148
    .line 149
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    iget-object v8, v1, Log3;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 154
    .line 155
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 156
    .line 157
    .line 158
    move-result-wide v8

    .line 159
    int-to-long v10, v7

    .line 160
    cmp-long v7, v8, v10

    .line 161
    .line 162
    if-ltz v7, :cond_7

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_7
    move-object v1, v5

    .line 166
    :goto_3
    iget-object v7, p0, Lsg3;->c:Leh3;

    .line 167
    .line 168
    sget v8, Lqg3;->c:I

    .line 169
    .line 170
    sget-object v8, Ldh3;->c:Lph3;

    .line 171
    .line 172
    invoke-virtual {v7, v8}, Leh3;->a0(Lph3;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    if-nez v7, :cond_a

    .line 177
    .line 178
    if-nez v1, :cond_8

    .line 179
    .line 180
    move-object v1, v2

    .line 181
    :cond_8
    iput-object v1, p0, Lsg3;->e:Lxh3;

    .line 182
    .line 183
    if-eq v1, v5, :cond_9

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_9
    move v1, v3

    .line 187
    goto/16 :goto_d

    .line 188
    .line 189
    :cond_a
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :cond_b
    :goto_4
    iget-object v1, p0, Lsg3;->c:Leh3;

    .line 194
    .line 195
    sget-object v7, Ldh3;->h:Lph3;

    .line 196
    .line 197
    invoke-virtual {v1, v7}, Leh3;->a0(Lph3;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    check-cast v1, Lai3;

    .line 202
    .line 203
    if-eqz v1, :cond_19

    .line 204
    .line 205
    iget-object v8, p0, Lsg3;->c:Leh3;

    .line 206
    .line 207
    if-eqz v8, :cond_e

    .line 208
    .line 209
    invoke-virtual {v8, v7}, Leh3;->c0(Lph3;)I

    .line 210
    .line 211
    .line 212
    move-result v9

    .line 213
    if-ltz v9, :cond_e

    .line 214
    .line 215
    add-int/2addr v9, v9

    .line 216
    add-int/lit8 v10, v9, 0x2

    .line 217
    .line 218
    :goto_5
    iget v11, v8, Leh3;->f:I

    .line 219
    .line 220
    add-int v12, v11, v11

    .line 221
    .line 222
    if-ge v10, v12, :cond_d

    .line 223
    .line 224
    iget-object v11, v8, Leh3;->e:[Ljava/lang/Object;

    .line 225
    .line 226
    aget-object v11, v11, v10

    .line 227
    .line 228
    invoke-virtual {v11, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v12

    .line 232
    if-nez v12, :cond_c

    .line 233
    .line 234
    iget-object v12, v8, Leh3;->e:[Ljava/lang/Object;

    .line 235
    .line 236
    aput-object v11, v12, v9

    .line 237
    .line 238
    add-int/lit8 v11, v9, 0x1

    .line 239
    .line 240
    add-int/lit8 v13, v10, 0x1

    .line 241
    .line 242
    aget-object v13, v12, v13

    .line 243
    .line 244
    aput-object v13, v12, v11

    .line 245
    .line 246
    add-int/lit8 v9, v9, 0x2

    .line 247
    .line 248
    :cond_c
    add-int/lit8 v10, v10, 0x2

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_d
    sub-int v7, v10, v9

    .line 252
    .line 253
    shr-int/2addr v7, v6

    .line 254
    sub-int/2addr v11, v7

    .line 255
    iput v11, v8, Leh3;->f:I

    .line 256
    .line 257
    :goto_6
    if-ge v9, v10, :cond_e

    .line 258
    .line 259
    iget-object v7, v8, Leh3;->e:[Ljava/lang/Object;

    .line 260
    .line 261
    add-int/lit8 v11, v9, 0x1

    .line 262
    .line 263
    aput-object v2, v7, v9

    .line 264
    .line 265
    move v9, v11

    .line 266
    goto :goto_6

    .line 267
    :cond_e
    new-instance v2, Llp;

    .line 268
    .line 269
    invoke-virtual {p0}, Lsg3;->c()Lkb1;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    sget-object v8, Ldh3;->a:Lph3;

    .line 274
    .line 275
    invoke-virtual {v7, v8}, Lkb1;->a0(Lph3;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    check-cast v7, Ljava/lang/Throwable;

    .line 280
    .line 281
    iget v8, v1, Lai3;->a:I

    .line 282
    .line 283
    sget-object v9, Lvk3;->a:Lyk3;

    .line 284
    .line 285
    if-gtz v8, :cond_10

    .line 286
    .line 287
    if-ne v8, v4, :cond_f

    .line 288
    .line 289
    goto :goto_7

    .line 290
    :cond_f
    const-string p0, "invalid maximum depth: 0"

    .line 291
    .line 292
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :cond_10
    :goto_7
    sget-object v9, Lvk3;->a:Lyk3;

    .line 297
    .line 298
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    if-eq v8, v4, :cond_11

    .line 302
    .line 303
    if-lez v8, :cond_12

    .line 304
    .line 305
    :cond_11
    move v9, v6

    .line 306
    goto :goto_8

    .line 307
    :cond_12
    move v9, v3

    .line 308
    :goto_8
    if-eqz v9, :cond_1a

    .line 309
    .line 310
    new-instance v9, Ljava/lang/Throwable;

    .line 311
    .line 312
    invoke-direct {v9}, Ljava/lang/Throwable;-><init>()V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v9}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 316
    .line 317
    .line 318
    move-result-object v9

    .line 319
    const-class v10, Lsg3;

    .line 320
    .line 321
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v10

    .line 325
    const/4 v11, 0x3

    .line 326
    move v12, v3

    .line 327
    :goto_9
    array-length v13, v9

    .line 328
    if-ge v11, v13, :cond_15

    .line 329
    .line 330
    aget-object v13, v9, v11

    .line 331
    .line 332
    invoke-virtual {v13}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v13

    .line 336
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v13

    .line 340
    if-eqz v13, :cond_13

    .line 341
    .line 342
    move v12, v6

    .line 343
    goto :goto_a

    .line 344
    :cond_13
    if-eqz v12, :cond_14

    .line 345
    .line 346
    goto :goto_b

    .line 347
    :cond_14
    :goto_a
    add-int/lit8 v11, v11, 0x1

    .line 348
    .line 349
    goto :goto_9

    .line 350
    :cond_15
    move v11, v4

    .line 351
    :goto_b
    if-ne v11, v4, :cond_16

    .line 352
    .line 353
    new-array v8, v3, [Ljava/lang/StackTraceElement;

    .line 354
    .line 355
    goto :goto_c

    .line 356
    :cond_16
    array-length v10, v9

    .line 357
    sub-int/2addr v10, v11

    .line 358
    if-lez v8, :cond_17

    .line 359
    .line 360
    if-lt v8, v10, :cond_18

    .line 361
    .line 362
    :cond_17
    move v8, v10

    .line 363
    :cond_18
    new-array v10, v8, [Ljava/lang/StackTraceElement;

    .line 364
    .line 365
    invoke-static {v9, v11, v10, v3, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 366
    .line 367
    .line 368
    move-object v8, v10

    .line 369
    :goto_c
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    const/4 v9, 0x6

    .line 374
    invoke-direct {v2, v1, v9, v7}, Llp;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2, v8}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 378
    .line 379
    .line 380
    sget-object v1, Ldh3;->a:Lph3;

    .line 381
    .line 382
    invoke-virtual {p0, v1, v2}, Lsg3;->d(Lph3;Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    :cond_19
    move v1, v6

    .line 386
    goto :goto_d

    .line 387
    :cond_1a
    const-string p0, "maxDepth must be > 0 or -1"

    .line 388
    .line 389
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    return-void

    .line 393
    :goto_d
    iget-object v2, p0, Lsg3;->e:Lxh3;

    .line 394
    .line 395
    if-eqz v2, :cond_1f

    .line 396
    .line 397
    iget-object v7, p0, Lsg3;->c:Leh3;

    .line 398
    .line 399
    sget-object v8, Lvh3;->c:Lng3;

    .line 400
    .line 401
    invoke-virtual {v8, v0, v7}, Lsq3;->p(Ljh3;Lkb1;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    check-cast v0, Lvh3;

    .line 406
    .line 407
    iget-object v7, v0, Lvh3;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 408
    .line 409
    iget-object v0, v0, Lvh3;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 410
    .line 411
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 412
    .line 413
    .line 414
    move-result v8

    .line 415
    if-eq v2, v5, :cond_1c

    .line 416
    .line 417
    invoke-virtual {v0, v3, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 418
    .line 419
    .line 420
    move-result v5

    .line 421
    if-nez v5, :cond_1b

    .line 422
    .line 423
    goto :goto_e

    .line 424
    :cond_1b
    :try_start_0
    invoke-virtual {v2}, Lxh3;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 428
    .line 429
    .line 430
    neg-int v0, v8

    .line 431
    invoke-virtual {v7, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 432
    .line 433
    .line 434
    add-int/2addr v4, v8

    .line 435
    goto :goto_e

    .line 436
    :catchall_0
    move-exception p0

    .line 437
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 438
    .line 439
    .line 440
    throw p0

    .line 441
    :cond_1c
    :goto_e
    if-eqz v1, :cond_1d

    .line 442
    .line 443
    if-lez v4, :cond_1d

    .line 444
    .line 445
    iget-object v0, p0, Lsg3;->c:Leh3;

    .line 446
    .line 447
    sget-object v2, Ldh3;->d:Lph3;

    .line 448
    .line 449
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 450
    .line 451
    .line 452
    move-result-object v5

    .line 453
    invoke-virtual {v0, v2, v5}, Leh3;->b0(Lph3;Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    :cond_1d
    if-ltz v4, :cond_1e

    .line 457
    .line 458
    move v0, v6

    .line 459
    goto :goto_f

    .line 460
    :cond_1e
    move v0, v3

    .line 461
    :goto_f
    and-int/2addr v1, v0

    .line 462
    :cond_1f
    if-eqz v1, :cond_26

    .line 463
    .line 464
    const-string v0, ""

    .line 465
    .line 466
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    iput-object v0, p0, Lsg3;->f:[Ljava/lang/Object;

    .line 471
    .line 472
    :goto_10
    if-gtz v3, :cond_20

    .line 473
    .line 474
    aget-object v1, v0, v3

    .line 475
    .line 476
    add-int/lit8 v3, v3, 0x1

    .line 477
    .line 478
    goto :goto_10

    .line 479
    :cond_20
    sget-object v0, Ljj3;->a:Llj3;

    .line 480
    .line 481
    check-cast v0, Lrj3;

    .line 482
    .line 483
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    sget-object v0, Lvj3;->b:Lvj3;

    .line 487
    .line 488
    invoke-virtual {v0}, Lvj3;->b()Lkk3;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    iget-object v1, v0, Lkk3;->a:Lik3;

    .line 493
    .line 494
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 495
    .line 496
    .line 497
    move-result v1

    .line 498
    if-nez v1, :cond_23

    .line 499
    .line 500
    invoke-virtual {p0}, Lsg3;->c()Lkb1;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    sget-object v2, Ldh3;->g:Lch3;

    .line 505
    .line 506
    invoke-virtual {v1, v2}, Lkb1;->a0(Lph3;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    check-cast v1, Lkk3;

    .line 511
    .line 512
    if-eqz v1, :cond_22

    .line 513
    .line 514
    iget-object v3, v1, Lkk3;->a:Lik3;

    .line 515
    .line 516
    iget-object v4, v0, Lkk3;->a:Lik3;

    .line 517
    .line 518
    invoke-virtual {v3}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 519
    .line 520
    .line 521
    move-result v5

    .line 522
    if-nez v5, :cond_22

    .line 523
    .line 524
    invoke-virtual {v4}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 525
    .line 526
    .line 527
    move-result v0

    .line 528
    if-eqz v0, :cond_21

    .line 529
    .line 530
    move-object v0, v1

    .line 531
    goto :goto_11

    .line 532
    :cond_21
    new-instance v0, Lkk3;

    .line 533
    .line 534
    new-instance v1, Lik3;

    .line 535
    .line 536
    invoke-direct {v1, v4, v3}, Lik3;-><init>(Lik3;Lik3;)V

    .line 537
    .line 538
    .line 539
    invoke-direct {v0, v1}, Lkk3;-><init>(Lik3;)V

    .line 540
    .line 541
    .line 542
    :cond_22
    :goto_11
    invoke-virtual {p0, v2, v0}, Lsg3;->d(Lph3;Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    :cond_23
    iget-object v0, p0, Lsg3;->g:Lqc3;

    .line 546
    .line 547
    iget-object v0, v0, Lqc3;->b:Ljava/lang/Object;

    .line 548
    .line 549
    check-cast v0, Lsq3;

    .line 550
    .line 551
    :try_start_1
    sget-object v1, Lxk3;->b:Lg5;

    .line 552
    .line 553
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    check-cast v1, Lxk3;

    .line 558
    .line 559
    iget v2, v1, Lxk3;->a:I

    .line 560
    .line 561
    add-int/2addr v2, v6

    .line 562
    iput v2, v1, Lxk3;->a:I
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 563
    .line 564
    if-eqz v2, :cond_25

    .line 565
    .line 566
    const/16 v3, 0x64

    .line 567
    .line 568
    if-gt v2, v3, :cond_24

    .line 569
    .line 570
    :try_start_2
    invoke-virtual {v0, p0}, Lsq3;->t(Lsg3;)V

    .line 571
    .line 572
    .line 573
    goto :goto_12

    .line 574
    :catchall_1
    move-exception v2

    .line 575
    goto :goto_13

    .line 576
    :cond_24
    const-string v2, "unbounded recursion in log statement"

    .line 577
    .line 578
    invoke-static {v2, p0}, Lqc3;->s(Ljava/lang/String;Lsg3;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 579
    .line 580
    .line 581
    :goto_12
    :try_start_3
    invoke-virtual {v1}, Lxk3;->close()V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    .line 582
    .line 583
    .line 584
    return-void

    .line 585
    :catch_0
    move-exception v1

    .line 586
    goto :goto_15

    .line 587
    :goto_13
    :try_start_4
    invoke-virtual {v1}, Lxk3;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 588
    .line 589
    .line 590
    goto :goto_14

    .line 591
    :catchall_2
    move-exception v1

    .line 592
    :try_start_5
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 593
    .line 594
    .line 595
    :goto_14
    throw v2

    .line 596
    :cond_25
    new-instance v1, Ljava/lang/AssertionError;

    .line 597
    .line 598
    const-string v2, "Overflow of RecursionDepth (possible error in core library)"

    .line 599
    .line 600
    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    throw v1
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0

    .line 604
    :goto_15
    :try_start_6
    invoke-virtual {v0, v1, p0}, Lsq3;->v(Ljava/lang/RuntimeException;Lsg3;)V
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_1

    .line 605
    .line 606
    .line 607
    goto :goto_16

    .line 608
    :catch_1
    move-exception v0

    .line 609
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    move-result-object v1

    .line 613
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 622
    .line 623
    .line 624
    move-result v3

    .line 625
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v4

    .line 629
    add-int/lit8 v3, v3, 0x2

    .line 630
    .line 631
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 632
    .line 633
    .line 634
    move-result v4

    .line 635
    new-instance v5, Ljava/lang/StringBuilder;

    .line 636
    .line 637
    add-int/2addr v3, v4

    .line 638
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    const-string v1, ": "

    .line 645
    .line 646
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v1

    .line 656
    invoke-static {v1, p0}, Lqc3;->s(Ljava/lang/String;Lsg3;)V

    .line 657
    .line 658
    .line 659
    :try_start_7
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 660
    .line 661
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_2

    .line 662
    .line 663
    .line 664
    :catch_2
    :cond_26
    :goto_16
    return-void
.end method

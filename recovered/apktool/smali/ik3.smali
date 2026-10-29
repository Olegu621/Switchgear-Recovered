.class public final Lik3;
.super Ljava/util/AbstractMap;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final f:Lwa3;


# instance fields
.field public final a:[Ljava/lang/Object;

.field public final b:[I

.field public final c:Lgk3;

.field public d:Ljava/lang/Integer;

.field public e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwa3;

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lwa3;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lik3;->f:Lwa3;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 412
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    new-instance v1, Lgk3;

    const/4 v2, -0x1

    .line 413
    invoke-direct {v1, p0, v2}, Lgk3;-><init>(Lik3;I)V

    iput-object v1, p0, Lik3;->c:Lgk3;

    const/4 v1, 0x0

    iput-object v1, p0, Lik3;->d:Ljava/lang/Integer;

    iput-object v1, p0, Lik3;->e:Ljava/lang/String;

    .line 414
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2

    .line 415
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v2, v1, [Ljava/lang/Object;

    .line 416
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    const/4 v0, 0x0

    .line 417
    filled-new-array {v0}, [I

    move-result-object v3

    invoke-static {v1, v0}, Lik3;->b(II)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 418
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    :cond_0
    iput-object v2, p0, Lik3;->a:[Ljava/lang/Object;

    iput-object v3, p0, Lik3;->b:[I

    return-void

    .line 419
    :cond_1
    invoke-static {v0}, Lfm0;->f(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p0

    .line 420
    throw p0

    .line 421
    :cond_2
    invoke-static {v1}, Lfm0;->f(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p0

    .line 422
    throw p0
.end method

.method public constructor <init>(Lik3;Lik3;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/AbstractMap;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lgk3;

    .line 11
    .line 12
    const/4 v8, -0x1

    .line 13
    invoke-direct {v1, v0, v8}, Lgk3;-><init>(Lik3;I)V

    .line 14
    .line 15
    .line 16
    iput-object v1, v0, Lik3;->c:Lgk3;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput-object v1, v0, Lik3;->d:Ljava/lang/Integer;

    .line 20
    .line 21
    iput-object v1, v0, Lik3;->e:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v6}, Ljava/util/AbstractMap;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v7}, Ljava/util/AbstractMap;->size()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    add-int/2addr v2, v1

    .line 32
    iget-object v1, v6, Lik3;->b:[I

    .line 33
    .line 34
    invoke-virtual {v6}, Ljava/util/AbstractMap;->size()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    aget v1, v1, v3

    .line 39
    .line 40
    iget-object v3, v7, Lik3;->b:[I

    .line 41
    .line 42
    invoke-virtual {v7}, Ljava/util/AbstractMap;->size()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    aget v3, v3, v4

    .line 47
    .line 48
    add-int v9, v1, v3

    .line 49
    .line 50
    add-int/lit8 v10, v2, 0x1

    .line 51
    .line 52
    new-array v4, v9, [Ljava/lang/Object;

    .line 53
    .line 54
    new-array v5, v10, [I

    .line 55
    .line 56
    const/4 v11, 0x0

    .line 57
    aput v2, v5, v11

    .line 58
    .line 59
    invoke-virtual {v6, v11}, Lik3;->c(I)Ljava/util/Map$Entry;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v7, v11}, Lik3;->c(I)Ljava/util/Map$Entry;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    move-object v12, v3

    .line 68
    move v13, v11

    .line 69
    move v14, v13

    .line 70
    move v3, v2

    .line 71
    move v2, v14

    .line 72
    :goto_0
    const/4 v15, 0x1

    .line 73
    if-nez v1, :cond_5

    .line 74
    .line 75
    if-eqz v12, :cond_0

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_0
    aget v1, v5, v11

    .line 79
    .line 80
    sub-int v3, v1, v2

    .line 81
    .line 82
    if-nez v3, :cond_1

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_1
    move v6, v11

    .line 86
    :goto_1
    if-gt v6, v2, :cond_2

    .line 87
    .line 88
    aget v7, v5, v6

    .line 89
    .line 90
    sub-int/2addr v7, v3

    .line 91
    aput v7, v5, v6

    .line 92
    .line 93
    add-int/lit8 v6, v6, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    aget v3, v5, v2

    .line 97
    .line 98
    sub-int v6, v3, v2

    .line 99
    .line 100
    invoke-static {v9, v3}, Lik3;->b(II)Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    if-eqz v7, :cond_3

    .line 105
    .line 106
    new-array v3, v3, [Ljava/lang/Object;

    .line 107
    .line 108
    invoke-static {v4, v11, v3, v11, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_3
    move-object v3, v4

    .line 113
    :goto_2
    invoke-static {v4, v1, v3, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 114
    .line 115
    .line 116
    move-object v4, v3

    .line 117
    :goto_3
    iput-object v4, v0, Lik3;->a:[Ljava/lang/Object;

    .line 118
    .line 119
    aget v1, v5, v11

    .line 120
    .line 121
    add-int/2addr v1, v15

    .line 122
    invoke-static {v10, v1}, Lik3;->b(II)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_4

    .line 127
    .line 128
    invoke-static {v5, v1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    :cond_4
    iput-object v5, v0, Lik3;->b:[I

    .line 133
    .line 134
    return-void

    .line 135
    :cond_5
    :goto_4
    if-nez v1, :cond_6

    .line 136
    .line 137
    move/from16 v16, v15

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_6
    if-nez v12, :cond_7

    .line 141
    .line 142
    move/from16 v16, v8

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_7
    move/from16 v16, v11

    .line 146
    .line 147
    :goto_5
    if-nez v16, :cond_f

    .line 148
    .line 149
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v16

    .line 153
    move-object/from16 v8, v16

    .line 154
    .line 155
    check-cast v8, Ljava/lang/String;

    .line 156
    .line 157
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v16

    .line 161
    move-object/from16 v11, v16

    .line 162
    .line 163
    check-cast v11, Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {v8, v11}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v16

    .line 169
    if-nez v16, :cond_f

    .line 170
    .line 171
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    check-cast v8, Ljava/lang/String;

    .line 176
    .line 177
    new-instance v11, Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 178
    .line 179
    new-instance v15, Lgk3;

    .line 180
    .line 181
    invoke-direct {v15, v0, v2}, Lgk3;-><init>(Lik3;I)V

    .line 182
    .line 183
    .line 184
    invoke-direct {v11, v8, v15}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    aput-object v11, v4, v2

    .line 188
    .line 189
    add-int/lit8 v8, v2, 0x1

    .line 190
    .line 191
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    move-object v11, v1

    .line 196
    check-cast v11, Lgk3;

    .line 197
    .line 198
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    move-object v15, v1

    .line 203
    check-cast v15, Lgk3;

    .line 204
    .line 205
    const/4 v1, 0x0

    .line 206
    const/4 v2, 0x0

    .line 207
    :goto_6
    invoke-virtual {v11}, Lgk3;->b()I

    .line 208
    .line 209
    .line 210
    move-result v12

    .line 211
    iget-object v0, v11, Lgk3;->b:Lik3;

    .line 212
    .line 213
    invoke-virtual {v11}, Lgk3;->a()I

    .line 214
    .line 215
    .line 216
    move-result v16

    .line 217
    sub-int v12, v12, v16

    .line 218
    .line 219
    if-lt v1, v12, :cond_9

    .line 220
    .line 221
    invoke-virtual {v15}, Lgk3;->b()I

    .line 222
    .line 223
    .line 224
    move-result v12

    .line 225
    invoke-virtual {v15}, Lgk3;->a()I

    .line 226
    .line 227
    .line 228
    move-result v16

    .line 229
    sub-int v12, v12, v16

    .line 230
    .line 231
    if-ge v2, v12, :cond_8

    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_8
    aput v3, v5, v8

    .line 235
    .line 236
    add-int/lit8 v13, v13, 0x1

    .line 237
    .line 238
    invoke-virtual {v6, v13}, Lik3;->c(I)Ljava/util/Map$Entry;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    add-int/lit8 v14, v14, 0x1

    .line 243
    .line 244
    invoke-virtual {v7, v14}, Lik3;->c(I)Ljava/util/Map$Entry;

    .line 245
    .line 246
    .line 247
    move-result-object v12

    .line 248
    move v2, v8

    .line 249
    const/4 v8, -0x1

    .line 250
    const/4 v11, 0x0

    .line 251
    move-object/from16 v0, p0

    .line 252
    .line 253
    goto/16 :goto_0

    .line 254
    .line 255
    :cond_9
    :goto_7
    invoke-virtual {v11}, Lgk3;->b()I

    .line 256
    .line 257
    .line 258
    move-result v12

    .line 259
    invoke-virtual {v11}, Lgk3;->a()I

    .line 260
    .line 261
    .line 262
    move-result v16

    .line 263
    sub-int v12, v12, v16

    .line 264
    .line 265
    if-ne v1, v12, :cond_a

    .line 266
    .line 267
    const/4 v12, 0x1

    .line 268
    goto :goto_8

    .line 269
    :cond_a
    invoke-virtual {v15}, Lgk3;->b()I

    .line 270
    .line 271
    .line 272
    move-result v12

    .line 273
    invoke-virtual {v15}, Lgk3;->a()I

    .line 274
    .line 275
    .line 276
    move-result v16

    .line 277
    sub-int v12, v12, v16

    .line 278
    .line 279
    if-ne v2, v12, :cond_b

    .line 280
    .line 281
    const/4 v12, -0x1

    .line 282
    goto :goto_8

    .line 283
    :cond_b
    const/4 v12, 0x0

    .line 284
    :goto_8
    if-nez v12, :cond_c

    .line 285
    .line 286
    sget-object v12, Lkk3;->b:Lwa3;

    .line 287
    .line 288
    iget-object v12, v0, Lik3;->a:[Ljava/lang/Object;

    .line 289
    .line 290
    invoke-virtual {v11}, Lgk3;->a()I

    .line 291
    .line 292
    .line 293
    move-result v16

    .line 294
    add-int v16, v16, v1

    .line 295
    .line 296
    aget-object v12, v12, v16

    .line 297
    .line 298
    move/from16 v16, v1

    .line 299
    .line 300
    iget-object v1, v15, Lgk3;->b:Lik3;

    .line 301
    .line 302
    iget-object v1, v1, Lik3;->a:[Ljava/lang/Object;

    .line 303
    .line 304
    invoke-virtual {v15}, Lgk3;->a()I

    .line 305
    .line 306
    .line 307
    move-result v17

    .line 308
    add-int v17, v17, v2

    .line 309
    .line 310
    aget-object v1, v1, v17

    .line 311
    .line 312
    move/from16 v17, v2

    .line 313
    .line 314
    sget-object v2, Lkk3;->b:Lwa3;

    .line 315
    .line 316
    invoke-virtual {v2, v12, v1}, Lwa3;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 317
    .line 318
    .line 319
    move-result v12

    .line 320
    goto :goto_9

    .line 321
    :cond_c
    move/from16 v16, v1

    .line 322
    .line 323
    move/from16 v17, v2

    .line 324
    .line 325
    :goto_9
    if-gez v12, :cond_d

    .line 326
    .line 327
    add-int/lit8 v1, v16, 0x1

    .line 328
    .line 329
    iget-object v0, v0, Lik3;->a:[Ljava/lang/Object;

    .line 330
    .line 331
    invoke-virtual {v11}, Lgk3;->a()I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    add-int v2, v2, v16

    .line 336
    .line 337
    aget-object v0, v0, v2

    .line 338
    .line 339
    move/from16 v2, v17

    .line 340
    .line 341
    goto :goto_a

    .line 342
    :cond_d
    add-int/lit8 v2, v17, 0x1

    .line 343
    .line 344
    iget-object v0, v15, Lgk3;->b:Lik3;

    .line 345
    .line 346
    iget-object v0, v0, Lik3;->a:[Ljava/lang/Object;

    .line 347
    .line 348
    invoke-virtual {v15}, Lgk3;->a()I

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    add-int v1, v1, v17

    .line 353
    .line 354
    aget-object v0, v0, v1

    .line 355
    .line 356
    if-nez v12, :cond_e

    .line 357
    .line 358
    add-int/lit8 v1, v16, 0x1

    .line 359
    .line 360
    goto :goto_a

    .line 361
    :cond_e
    move/from16 v1, v16

    .line 362
    .line 363
    :goto_a
    add-int/lit8 v12, v3, 0x1

    .line 364
    .line 365
    aput-object v0, v4, v3

    .line 366
    .line 367
    move-object/from16 v0, p0

    .line 368
    .line 369
    move v3, v12

    .line 370
    goto/16 :goto_6

    .line 371
    .line 372
    :cond_f
    if-gez v16, :cond_10

    .line 373
    .line 374
    add-int/lit8 v8, v2, 0x1

    .line 375
    .line 376
    move-object/from16 v0, p0

    .line 377
    .line 378
    invoke-virtual/range {v0 .. v5}, Lik3;->a(Ljava/util/Map$Entry;II[Ljava/lang/Object;[I)I

    .line 379
    .line 380
    .line 381
    move-result v3

    .line 382
    add-int/lit8 v13, v13, 0x1

    .line 383
    .line 384
    invoke-virtual {v6, v13}, Lik3;->c(I)Ljava/util/Map$Entry;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    move v2, v8

    .line 389
    :goto_b
    const/4 v8, -0x1

    .line 390
    const/4 v11, 0x0

    .line 391
    goto/16 :goto_0

    .line 392
    .line 393
    :cond_10
    move-object v8, v1

    .line 394
    add-int/lit8 v11, v2, 0x1

    .line 395
    .line 396
    move-object/from16 v0, p0

    .line 397
    .line 398
    move-object v1, v12

    .line 399
    invoke-virtual/range {v0 .. v5}, Lik3;->a(Ljava/util/Map$Entry;II[Ljava/lang/Object;[I)I

    .line 400
    .line 401
    .line 402
    move-result v3

    .line 403
    add-int/lit8 v14, v14, 0x1

    .line 404
    .line 405
    invoke-virtual {v7, v14}, Lik3;->c(I)Ljava/util/Map$Entry;

    .line 406
    .line 407
    .line 408
    move-result-object v12

    .line 409
    move-object v1, v8

    .line 410
    move v2, v11

    .line 411
    goto :goto_b
.end method

.method public static b(II)Z
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    if-le p0, v0, :cond_0

    .line 4
    .line 5
    mul-int/lit8 p0, p0, 0x9

    .line 6
    .line 7
    mul-int/lit8 p1, p1, 0xa

    .line 8
    .line 9
    if-le p0, p1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method


# virtual methods
.method public final a(Ljava/util/Map$Entry;II[Ljava/lang/Object;[I)I
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lgk3;

    .line 6
    .line 7
    invoke-virtual {v0}, Lgk3;->b()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0}, Lgk3;->a()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    sub-int/2addr v1, v2

    .line 16
    iget-object v2, v0, Lgk3;->b:Lik3;

    .line 17
    .line 18
    iget-object v2, v2, Lik3;->a:[Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v0}, Lgk3;->a()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {v2, v0, p4, p3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Ljava/lang/String;

    .line 32
    .line 33
    new-instance v0, Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 34
    .line 35
    new-instance v2, Lgk3;

    .line 36
    .line 37
    invoke-direct {v2, p0, p2}, Lgk3;-><init>(Lik3;I)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, p1, v2}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    aput-object v0, p4, p2

    .line 44
    .line 45
    add-int/lit8 p2, p2, 0x1

    .line 46
    .line 47
    add-int/2addr p3, v1

    .line 48
    aput p3, p5, p2

    .line 49
    .line 50
    return p3
.end method

.method public final c(I)Ljava/util/Map$Entry;
    .locals 2

    .line 1
    iget-object v0, p0, Lik3;->b:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget v0, v0, v1

    .line 5
    .line 6
    if-ge p1, v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lik3;->a:[Ljava/lang/Object;

    .line 9
    .line 10
    aget-object p0, p0, p1

    .line 11
    .line 12
    check-cast p0, Ljava/util/Map$Entry;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lik3;->c:Lgk3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lik3;->d:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Ljava/util/AbstractMap;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lik3;->d:Ljava/lang/Integer;

    .line 14
    .line 15
    :cond_0
    iget-object p0, p0, Lik3;->d:Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lik3;->e:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Ljava/util/AbstractMap;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lik3;->e:Ljava/lang/String;

    .line 10
    .line 11
    :cond_0
    iget-object p0, p0, Lik3;->e:Ljava/lang/String;

    .line 12
    .line 13
    return-object p0
.end method

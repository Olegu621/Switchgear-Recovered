.class public final Lio/sentry/android/core/internal/tombstone/c;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final a:Ljava/io/InputStream;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/List;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/android/core/internal/tombstone/c;->e:Ljava/util/HashMap;

    .line 10
    .line 11
    iput-object p1, p0, Lio/sentry/android/core/internal/tombstone/c;->a:Ljava/io/InputStream;

    .line 12
    .line 13
    iput-object p2, p0, Lio/sentry/android/core/internal/tombstone/c;->b:Ljava/util/List;

    .line 14
    .line 15
    iput-object p3, p0, Lio/sentry/android/core/internal/tombstone/c;->c:Ljava/util/List;

    .line 16
    .line 17
    iput-object p4, p0, Lio/sentry/android/core/internal/tombstone/c;->d:Ljava/lang/String;

    .line 18
    .line 19
    const-string p0, "SIGILL"

    .line 20
    .line 21
    const-string p1, "IllegalInstruction"

    .line 22
    .line 23
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    const-string p0, "SIGTRAP"

    .line 27
    .line 28
    const-string p1, "Trap"

    .line 29
    .line 30
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    const-string p0, "SIGABRT"

    .line 34
    .line 35
    const-string p1, "Abort"

    .line 36
    .line 37
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    const-string p0, "SIGBUS"

    .line 41
    .line 42
    const-string p1, "BusError"

    .line 43
    .line 44
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    const-string p0, "SIGFPE"

    .line 48
    .line 49
    const-string p1, "FloatingPointException"

    .line 50
    .line 51
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    const-string p0, "SIGSEGV"

    .line 55
    .line 56
    const-string p1, "Segfault"

    .line 57
    .line 58
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final c()Lio/sentry/c5;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v2, v0, Lio/sentry/android/core/internal/tombstone/c;->a:Ljava/io/InputStream;

    .line 4
    .line 5
    if-eqz v2, :cond_3e

    .line 6
    .line 7
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 10
    .line 11
    .line 12
    const/16 v4, 0x2000

    .line 13
    .line 14
    new-array v4, v4, [B

    .line 15
    .line 16
    :goto_0
    invoke-virtual {v2, v4}, Ljava/io/InputStream;->read([B)I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    const/4 v6, -0x1

    .line 21
    const/4 v7, 0x0

    .line 22
    if-eq v5, v6, :cond_0

    .line 23
    .line 24
    invoke-virtual {v3, v4, v7, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v2, Luj;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const/4 v4, 0x1

    .line 35
    invoke-direct {v2, v3, v4}, Luj;-><init>([BI)V

    .line 36
    .line 37
    .line 38
    new-instance v3, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v5, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v6, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    new-instance v8, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    new-instance v9, Ljava/util/HashMap;

    .line 59
    .line 60
    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    new-instance v10, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    new-instance v11, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    new-instance v12, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v13, ""

    .line 79
    .line 80
    move v14, v7

    .line 81
    move v15, v14

    .line 82
    move-object/from16 v17, v13

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    const/16 v16, 0x0

    .line 86
    .line 87
    :goto_1
    invoke-virtual {v2}, Luj;->h()I

    .line 88
    .line 89
    .line 90
    move-result v18

    .line 91
    const-wide/16 v19, 0x0

    .line 92
    .line 93
    if-eqz v18, :cond_25

    .line 94
    .line 95
    ushr-int/lit8 v7, v18, 0x3

    .line 96
    .line 97
    and-int/lit8 v4, v18, 0x7

    .line 98
    .line 99
    move-object/from16 v18, v13

    .line 100
    .line 101
    const/4 v13, 0x2

    .line 102
    const/16 v21, 0x6

    .line 103
    .line 104
    packed-switch v7, :pswitch_data_0

    .line 105
    .line 106
    .line 107
    :pswitch_0
    invoke-virtual {v2, v4}, Luj;->j(I)V

    .line 108
    .line 109
    .line 110
    move-object/from16 v23, v2

    .line 111
    .line 112
    move/from16 v25, v14

    .line 113
    .line 114
    move/from16 v24, v15

    .line 115
    .line 116
    goto/16 :goto_21

    .line 117
    .line 118
    :pswitch_1
    invoke-static {v7, v13, v4}, Luj;->b(III)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Luj;->f()Luj;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    new-instance v7, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 128
    .line 129
    .line 130
    :goto_2
    invoke-virtual {v4}, Luj;->h()I

    .line 131
    .line 132
    .line 133
    move-result v19

    .line 134
    if-eqz v19, :cond_7

    .line 135
    .line 136
    ushr-int/lit8 v13, v19, 0x3

    .line 137
    .line 138
    move-object/from16 v23, v2

    .line 139
    .line 140
    and-int/lit8 v2, v19, 0x7

    .line 141
    .line 142
    move/from16 v24, v15

    .line 143
    .line 144
    const/4 v15, 0x1

    .line 145
    if-eq v13, v15, :cond_6

    .line 146
    .line 147
    const/4 v15, 0x2

    .line 148
    if-eq v13, v15, :cond_1

    .line 149
    .line 150
    invoke-virtual {v4, v2}, Luj;->j(I)V

    .line 151
    .line 152
    .line 153
    move-object/from16 v19, v4

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_1
    invoke-static {v13, v15, v2}, Luj;->b(III)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4}, Luj;->f()Luj;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    :goto_3
    invoke-virtual {v2}, Luj;->h()I

    .line 164
    .line 165
    .line 166
    move-result v13

    .line 167
    if-eqz v13, :cond_5

    .line 168
    .line 169
    ushr-int/lit8 v15, v13, 0x3

    .line 170
    .line 171
    and-int/lit8 v13, v13, 0x7

    .line 172
    .line 173
    move-object/from16 v19, v4

    .line 174
    .line 175
    const/4 v4, 0x1

    .line 176
    if-eq v15, v4, :cond_4

    .line 177
    .line 178
    const/4 v4, 0x2

    .line 179
    if-eq v15, v4, :cond_3

    .line 180
    .line 181
    const/4 v4, 0x3

    .line 182
    if-eq v15, v4, :cond_2

    .line 183
    .line 184
    invoke-virtual {v2, v13}, Luj;->j(I)V

    .line 185
    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_2
    const/4 v4, 0x0

    .line 189
    invoke-static {v15, v4, v13}, Luj;->b(III)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Luj;->i()J

    .line 193
    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_3
    const/4 v4, 0x0

    .line 197
    invoke-static {v15, v4, v13}, Luj;->b(III)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2}, Luj;->i()J

    .line 201
    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_4
    const/4 v4, 0x2

    .line 205
    invoke-static {v15, v4, v13}, Luj;->b(III)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2}, Luj;->f()Luj;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-static {v4}, Lw11;->e(Luj;)Llh;

    .line 213
    .line 214
    .line 215
    :goto_4
    move-object/from16 v4, v19

    .line 216
    .line 217
    const/4 v15, 0x2

    .line 218
    goto :goto_3

    .line 219
    :cond_5
    move-object/from16 v19, v4

    .line 220
    .line 221
    new-instance v2, Lp62;

    .line 222
    .line 223
    const/4 v4, 0x3

    .line 224
    invoke-direct {v2, v4}, Lp62;-><init>(I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    :goto_5
    const/4 v15, 0x0

    .line 231
    goto :goto_6

    .line 232
    :cond_6
    move-object/from16 v19, v4

    .line 233
    .line 234
    const/4 v15, 0x0

    .line 235
    invoke-static {v13, v15, v2}, Luj;->b(III)V

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v19 .. v19}, Luj;->i()J

    .line 239
    .line 240
    .line 241
    :goto_6
    move-object/from16 v4, v19

    .line 242
    .line 243
    move-object/from16 v2, v23

    .line 244
    .line 245
    move/from16 v15, v24

    .line 246
    .line 247
    const/4 v13, 0x2

    .line 248
    goto :goto_2

    .line 249
    :cond_7
    move-object/from16 v23, v2

    .line 250
    .line 251
    move/from16 v24, v15

    .line 252
    .line 253
    const/4 v15, 0x0

    .line 254
    invoke-static {v7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 255
    .line 256
    .line 257
    :goto_7
    move/from16 v15, v24

    .line 258
    .line 259
    goto/16 :goto_24

    .line 260
    .line 261
    :pswitch_2
    move-object/from16 v23, v2

    .line 262
    .line 263
    move v2, v13

    .line 264
    move/from16 v24, v15

    .line 265
    .line 266
    const/4 v15, 0x0

    .line 267
    invoke-static {v7, v2, v4}, Luj;->b(III)V

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v23 .. v23}, Luj;->f()Luj;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    invoke-static {v2, v9}, Lw11;->g(Luj;Ljava/util/HashMap;)V

    .line 275
    .line 276
    .line 277
    move/from16 v25, v14

    .line 278
    .line 279
    goto/16 :goto_21

    .line 280
    .line 281
    :pswitch_3
    move-object/from16 v23, v2

    .line 282
    .line 283
    move/from16 v24, v15

    .line 284
    .line 285
    const/4 v15, 0x0

    .line 286
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 287
    .line 288
    .line 289
    move v2, v14

    .line 290
    invoke-virtual/range {v23 .. v23}, Luj;->i()J

    .line 291
    .line 292
    .line 293
    move-result-wide v13

    .line 294
    long-to-int v4, v13

    .line 295
    invoke-static/range {v21 .. v21}, Len;->E(I)[I

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    array-length v13, v7

    .line 300
    const/4 v14, 0x0

    .line 301
    :goto_8
    if-ge v14, v13, :cond_9

    .line 302
    .line 303
    aget v15, v7, v14

    .line 304
    .line 305
    invoke-static {v15}, Len;->y(I)I

    .line 306
    .line 307
    .line 308
    move-result v15

    .line 309
    if-ne v15, v4, :cond_8

    .line 310
    .line 311
    goto :goto_9

    .line 312
    :cond_8
    add-int/lit8 v14, v14, 0x1

    .line 313
    .line 314
    goto :goto_8

    .line 315
    :cond_9
    :goto_9
    move v14, v2

    .line 316
    goto :goto_7

    .line 317
    :pswitch_4
    move-object/from16 v23, v2

    .line 318
    .line 319
    move v2, v14

    .line 320
    move/from16 v24, v15

    .line 321
    .line 322
    const/4 v15, 0x0

    .line 323
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v23 .. v23}, Luj;->d()Z

    .line 327
    .line 328
    .line 329
    goto :goto_7

    .line 330
    :pswitch_5
    move-object/from16 v23, v2

    .line 331
    .line 332
    move v2, v14

    .line 333
    move/from16 v24, v15

    .line 334
    .line 335
    const/4 v15, 0x0

    .line 336
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v23 .. v23}, Luj;->i()J

    .line 340
    .line 341
    .line 342
    goto :goto_7

    .line 343
    :pswitch_6
    move-object/from16 v23, v2

    .line 344
    .line 345
    move v2, v14

    .line 346
    move/from16 v24, v15

    .line 347
    .line 348
    move v15, v13

    .line 349
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v23 .. v23}, Luj;->f()Luj;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    :goto_a
    invoke-virtual {v4}, Luj;->h()I

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    if-eqz v7, :cond_c

    .line 361
    .line 362
    ushr-int/lit8 v13, v7, 0x3

    .line 363
    .line 364
    and-int/lit8 v7, v7, 0x7

    .line 365
    .line 366
    const/4 v14, 0x1

    .line 367
    if-eq v13, v14, :cond_b

    .line 368
    .line 369
    if-eq v13, v15, :cond_a

    .line 370
    .line 371
    invoke-virtual {v4, v7}, Luj;->j(I)V

    .line 372
    .line 373
    .line 374
    goto :goto_b

    .line 375
    :cond_a
    invoke-static {v13, v15, v7}, Luj;->b(III)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v4}, Luj;->e()[B

    .line 379
    .line 380
    .line 381
    goto :goto_b

    .line 382
    :cond_b
    invoke-static {v13, v15, v7}, Luj;->b(III)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v4}, Luj;->e()[B

    .line 386
    .line 387
    .line 388
    :goto_b
    const/4 v15, 0x2

    .line 389
    goto :goto_a

    .line 390
    :cond_c
    new-instance v4, Lxt0;

    .line 391
    .line 392
    const/16 v7, 0x1a

    .line 393
    .line 394
    invoke-direct {v4, v7}, Lxt0;-><init>(I)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    :goto_c
    move/from16 v25, v2

    .line 401
    .line 402
    goto/16 :goto_21

    .line 403
    .line 404
    :pswitch_7
    move-object/from16 v23, v2

    .line 405
    .line 406
    move v2, v14

    .line 407
    move/from16 v24, v15

    .line 408
    .line 409
    const/4 v15, 0x0

    .line 410
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v23 .. v23}, Luj;->i()J

    .line 414
    .line 415
    .line 416
    goto/16 :goto_7

    .line 417
    .line 418
    :pswitch_8
    move-object/from16 v23, v2

    .line 419
    .line 420
    move v2, v14

    .line 421
    move/from16 v24, v15

    .line 422
    .line 423
    move v15, v13

    .line 424
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v23 .. v23}, Luj;->f()Luj;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    :goto_d
    invoke-virtual {v4}, Luj;->h()I

    .line 432
    .line 433
    .line 434
    move-result v7

    .line 435
    if-eqz v7, :cond_11

    .line 436
    .line 437
    ushr-int/lit8 v13, v7, 0x3

    .line 438
    .line 439
    and-int/lit8 v7, v7, 0x7

    .line 440
    .line 441
    const/4 v14, 0x1

    .line 442
    if-eq v13, v14, :cond_10

    .line 443
    .line 444
    if-eq v13, v15, :cond_f

    .line 445
    .line 446
    const/4 v14, 0x3

    .line 447
    if-eq v13, v14, :cond_e

    .line 448
    .line 449
    const/4 v14, 0x4

    .line 450
    if-eq v13, v14, :cond_d

    .line 451
    .line 452
    invoke-virtual {v4, v7}, Luj;->j(I)V

    .line 453
    .line 454
    .line 455
    goto :goto_e

    .line 456
    :cond_d
    const/4 v14, 0x0

    .line 457
    invoke-static {v13, v14, v7}, Luj;->b(III)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v4}, Luj;->i()J

    .line 461
    .line 462
    .line 463
    goto :goto_e

    .line 464
    :cond_e
    const/4 v14, 0x0

    .line 465
    invoke-static {v13, v15, v7}, Luj;->b(III)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v4}, Luj;->g()Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    goto :goto_e

    .line 472
    :cond_f
    const/4 v14, 0x0

    .line 473
    invoke-static {v13, v15, v7}, Luj;->b(III)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v4}, Luj;->g()Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    goto :goto_e

    .line 480
    :cond_10
    const/4 v14, 0x0

    .line 481
    invoke-static {v13, v14, v7}, Luj;->b(III)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v4}, Luj;->i()J

    .line 485
    .line 486
    .line 487
    :goto_e
    const/4 v15, 0x2

    .line 488
    goto :goto_d

    .line 489
    :cond_11
    new-instance v4, Lzb0;

    .line 490
    .line 491
    const/16 v7, 0x8

    .line 492
    .line 493
    invoke-direct {v4, v7}, Lzb0;-><init>(I)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    goto :goto_c

    .line 500
    :pswitch_9
    move-object/from16 v23, v2

    .line 501
    .line 502
    move v2, v14

    .line 503
    move/from16 v24, v15

    .line 504
    .line 505
    move v15, v13

    .line 506
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v23 .. v23}, Luj;->f()Luj;

    .line 510
    .line 511
    .line 512
    move-result-object v4

    .line 513
    new-instance v7, Ljava/util/ArrayList;

    .line 514
    .line 515
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 516
    .line 517
    .line 518
    :goto_f
    invoke-virtual {v4}, Luj;->h()I

    .line 519
    .line 520
    .line 521
    move-result v13

    .line 522
    if-eqz v13, :cond_15

    .line 523
    .line 524
    ushr-int/lit8 v14, v13, 0x3

    .line 525
    .line 526
    and-int/lit8 v13, v13, 0x7

    .line 527
    .line 528
    const/4 v15, 0x1

    .line 529
    if-eq v14, v15, :cond_14

    .line 530
    .line 531
    const/4 v15, 0x2

    .line 532
    if-eq v14, v15, :cond_12

    .line 533
    .line 534
    invoke-virtual {v4, v13}, Luj;->j(I)V

    .line 535
    .line 536
    .line 537
    move/from16 v25, v2

    .line 538
    .line 539
    move v2, v15

    .line 540
    goto/16 :goto_13

    .line 541
    .line 542
    :cond_12
    invoke-static {v14, v15, v13}, Luj;->b(III)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v4}, Luj;->f()Luj;

    .line 546
    .line 547
    .line 548
    move-result-object v13

    .line 549
    :goto_10
    invoke-virtual {v13}, Luj;->h()I

    .line 550
    .line 551
    .line 552
    move-result v14

    .line 553
    if-eqz v14, :cond_13

    .line 554
    .line 555
    ushr-int/lit8 v15, v14, 0x3

    .line 556
    .line 557
    and-int/lit8 v14, v14, 0x7

    .line 558
    .line 559
    packed-switch v15, :pswitch_data_1

    .line 560
    .line 561
    .line 562
    invoke-virtual {v13, v14}, Luj;->j(I)V

    .line 563
    .line 564
    .line 565
    move/from16 v25, v2

    .line 566
    .line 567
    :goto_11
    const/4 v2, 0x2

    .line 568
    goto :goto_12

    .line 569
    :pswitch_a
    move/from16 v25, v2

    .line 570
    .line 571
    const/4 v2, 0x2

    .line 572
    invoke-static {v15, v2, v14}, Luj;->b(III)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v13}, Luj;->g()Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    goto :goto_12

    .line 579
    :pswitch_b
    move/from16 v25, v2

    .line 580
    .line 581
    const/4 v2, 0x2

    .line 582
    invoke-static {v15, v2, v14}, Luj;->b(III)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v13}, Luj;->g()Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    goto :goto_11

    .line 589
    :pswitch_c
    move/from16 v25, v2

    .line 590
    .line 591
    const/4 v2, 0x0

    .line 592
    invoke-static {v15, v2, v14}, Luj;->b(III)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v13}, Luj;->i()J

    .line 596
    .line 597
    .line 598
    goto :goto_11

    .line 599
    :pswitch_d
    move/from16 v25, v2

    .line 600
    .line 601
    const/4 v2, 0x0

    .line 602
    invoke-static {v15, v2, v14}, Luj;->b(III)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v13}, Luj;->i()J

    .line 606
    .line 607
    .line 608
    goto :goto_11

    .line 609
    :pswitch_e
    move/from16 v25, v2

    .line 610
    .line 611
    const/4 v2, 0x0

    .line 612
    invoke-static {v15, v2, v14}, Luj;->b(III)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v13}, Luj;->i()J

    .line 616
    .line 617
    .line 618
    goto :goto_11

    .line 619
    :pswitch_f
    move/from16 v25, v2

    .line 620
    .line 621
    const/4 v2, 0x2

    .line 622
    invoke-static {v15, v2, v14}, Luj;->b(III)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v13}, Luj;->g()Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    :goto_12
    move/from16 v2, v25

    .line 629
    .line 630
    goto :goto_10

    .line 631
    :cond_13
    move/from16 v25, v2

    .line 632
    .line 633
    const/4 v2, 0x2

    .line 634
    new-instance v13, Lec0;

    .line 635
    .line 636
    const/16 v14, 0x12

    .line 637
    .line 638
    invoke-direct {v13, v14}, Lec0;-><init>(I)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    goto :goto_13

    .line 645
    :cond_14
    move/from16 v25, v2

    .line 646
    .line 647
    const/4 v2, 0x2

    .line 648
    invoke-static {v14, v2, v13}, Luj;->b(III)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v4}, Luj;->g()Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    :goto_13
    move/from16 v2, v25

    .line 655
    .line 656
    goto/16 :goto_f

    .line 657
    .line 658
    :cond_15
    move/from16 v25, v2

    .line 659
    .line 660
    new-instance v2, Lts0;

    .line 661
    .line 662
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 663
    .line 664
    .line 665
    invoke-static {v7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 666
    .line 667
    .line 668
    move-result-object v4

    .line 669
    iput-object v4, v2, Lts0;->a:Ljava/lang/Object;

    .line 670
    .line 671
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    goto/16 :goto_21

    .line 675
    .line 676
    :pswitch_10
    move-object/from16 v23, v2

    .line 677
    .line 678
    move v2, v13

    .line 679
    move/from16 v25, v14

    .line 680
    .line 681
    move/from16 v24, v15

    .line 682
    .line 683
    invoke-static {v7, v2, v4}, Luj;->b(III)V

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v23 .. v23}, Luj;->f()Luj;

    .line 687
    .line 688
    .line 689
    move-result-object v2

    .line 690
    move-object/from16 v34, v18

    .line 691
    .line 692
    move-object/from16 v35, v34

    .line 693
    .line 694
    move-wide/from16 v27, v19

    .line 695
    .line 696
    move-wide/from16 v29, v27

    .line 697
    .line 698
    move-wide/from16 v31, v29

    .line 699
    .line 700
    const/16 v33, 0x0

    .line 701
    .line 702
    :goto_14
    invoke-virtual {v2}, Luj;->h()I

    .line 703
    .line 704
    .line 705
    move-result v4

    .line 706
    if-eqz v4, :cond_16

    .line 707
    .line 708
    ushr-int/lit8 v7, v4, 0x3

    .line 709
    .line 710
    and-int/lit8 v4, v4, 0x7

    .line 711
    .line 712
    packed-switch v7, :pswitch_data_2

    .line 713
    .line 714
    .line 715
    invoke-virtual {v2, v4}, Luj;->j(I)V

    .line 716
    .line 717
    .line 718
    goto :goto_14

    .line 719
    :pswitch_11
    const/4 v15, 0x0

    .line 720
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 721
    .line 722
    .line 723
    invoke-virtual {v2}, Luj;->i()J

    .line 724
    .line 725
    .line 726
    goto :goto_14

    .line 727
    :pswitch_12
    const/4 v13, 0x2

    .line 728
    const/4 v15, 0x0

    .line 729
    invoke-static {v7, v13, v4}, Luj;->b(III)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v2}, Luj;->g()Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v35

    .line 736
    goto :goto_14

    .line 737
    :pswitch_13
    const/4 v13, 0x2

    .line 738
    const/4 v15, 0x0

    .line 739
    invoke-static {v7, v13, v4}, Luj;->b(III)V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v2}, Luj;->g()Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v34

    .line 746
    goto :goto_14

    .line 747
    :pswitch_14
    const/4 v15, 0x0

    .line 748
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 749
    .line 750
    .line 751
    invoke-virtual {v2}, Luj;->d()Z

    .line 752
    .line 753
    .line 754
    goto :goto_14

    .line 755
    :pswitch_15
    const/4 v15, 0x0

    .line 756
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 757
    .line 758
    .line 759
    invoke-virtual {v2}, Luj;->d()Z

    .line 760
    .line 761
    .line 762
    goto :goto_14

    .line 763
    :pswitch_16
    const/4 v15, 0x0

    .line 764
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v2}, Luj;->d()Z

    .line 768
    .line 769
    .line 770
    move-result v4

    .line 771
    move/from16 v33, v4

    .line 772
    .line 773
    goto :goto_14

    .line 774
    :pswitch_17
    const/4 v15, 0x0

    .line 775
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 776
    .line 777
    .line 778
    invoke-virtual {v2}, Luj;->i()J

    .line 779
    .line 780
    .line 781
    move-result-wide v13

    .line 782
    move-wide/from16 v31, v13

    .line 783
    .line 784
    goto :goto_14

    .line 785
    :pswitch_18
    const/4 v15, 0x0

    .line 786
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v2}, Luj;->i()J

    .line 790
    .line 791
    .line 792
    move-result-wide v13

    .line 793
    move-wide/from16 v29, v13

    .line 794
    .line 795
    goto :goto_14

    .line 796
    :pswitch_19
    const/4 v15, 0x0

    .line 797
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 798
    .line 799
    .line 800
    invoke-virtual {v2}, Luj;->i()J

    .line 801
    .line 802
    .line 803
    move-result-wide v13

    .line 804
    move-wide/from16 v27, v13

    .line 805
    .line 806
    goto :goto_14

    .line 807
    :cond_16
    new-instance v26, Lfg1;

    .line 808
    .line 809
    invoke-direct/range {v26 .. v35}, Lfg1;-><init>(JJJZLjava/lang/String;Ljava/lang/String;)V

    .line 810
    .line 811
    .line 812
    move-object/from16 v2, v26

    .line 813
    .line 814
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 815
    .line 816
    .line 817
    goto/16 :goto_21

    .line 818
    .line 819
    :pswitch_1a
    move-object/from16 v23, v2

    .line 820
    .line 821
    move/from16 v25, v14

    .line 822
    .line 823
    move/from16 v24, v15

    .line 824
    .line 825
    move v15, v13

    .line 826
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 827
    .line 828
    .line 829
    invoke-virtual/range {v23 .. v23}, Luj;->f()Luj;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    invoke-static {v2, v8}, Lw11;->g(Luj;Ljava/util/HashMap;)V

    .line 834
    .line 835
    .line 836
    goto/16 :goto_21

    .line 837
    .line 838
    :pswitch_1b
    move-object/from16 v23, v2

    .line 839
    .line 840
    move/from16 v25, v14

    .line 841
    .line 842
    move/from16 v24, v15

    .line 843
    .line 844
    move v15, v13

    .line 845
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 846
    .line 847
    .line 848
    invoke-virtual/range {v23 .. v23}, Luj;->f()Luj;

    .line 849
    .line 850
    .line 851
    move-result-object v2

    .line 852
    :goto_15
    invoke-virtual {v2}, Luj;->h()I

    .line 853
    .line 854
    .line 855
    move-result v4

    .line 856
    if-eqz v4, :cond_21

    .line 857
    .line 858
    ushr-int/lit8 v7, v4, 0x3

    .line 859
    .line 860
    and-int/lit8 v4, v4, 0x7

    .line 861
    .line 862
    const/4 v14, 0x1

    .line 863
    if-eq v7, v14, :cond_20

    .line 864
    .line 865
    if-eq v7, v15, :cond_18

    .line 866
    .line 867
    invoke-virtual {v2, v4}, Luj;->j(I)V

    .line 868
    .line 869
    .line 870
    :cond_17
    move-object/from16 v20, v2

    .line 871
    .line 872
    goto/16 :goto_1d

    .line 873
    .line 874
    :cond_18
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {v2}, Luj;->f()Luj;

    .line 878
    .line 879
    .line 880
    move-result-object v4

    .line 881
    :goto_16
    invoke-virtual {v4}, Luj;->h()I

    .line 882
    .line 883
    .line 884
    move-result v7

    .line 885
    if-eqz v7, :cond_17

    .line 886
    .line 887
    ushr-int/lit8 v13, v7, 0x3

    .line 888
    .line 889
    and-int/lit8 v7, v7, 0x7

    .line 890
    .line 891
    const/4 v14, 0x1

    .line 892
    if-eq v13, v14, :cond_1d

    .line 893
    .line 894
    if-eq v13, v15, :cond_1b

    .line 895
    .line 896
    const/4 v14, 0x3

    .line 897
    if-eq v13, v14, :cond_19

    .line 898
    .line 899
    invoke-virtual {v4, v7}, Luj;->j(I)V

    .line 900
    .line 901
    .line 902
    move-object/from16 v20, v2

    .line 903
    .line 904
    move-object/from16 v19, v4

    .line 905
    .line 906
    goto/16 :goto_1c

    .line 907
    .line 908
    :cond_19
    invoke-static {v13, v15, v7}, Luj;->b(III)V

    .line 909
    .line 910
    .line 911
    invoke-virtual {v4}, Luj;->f()Luj;

    .line 912
    .line 913
    .line 914
    move-result-object v7

    .line 915
    new-instance v13, Ljava/util/ArrayList;

    .line 916
    .line 917
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 918
    .line 919
    .line 920
    new-instance v15, Ljava/util/ArrayList;

    .line 921
    .line 922
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 923
    .line 924
    .line 925
    :goto_17
    invoke-virtual {v7}, Luj;->h()I

    .line 926
    .line 927
    .line 928
    move-result v19

    .line 929
    if-eqz v19, :cond_1a

    .line 930
    .line 931
    ushr-int/lit8 v14, v19, 0x3

    .line 932
    .line 933
    move-object/from16 v20, v2

    .line 934
    .line 935
    and-int/lit8 v2, v19, 0x7

    .line 936
    .line 937
    packed-switch v14, :pswitch_data_3

    .line 938
    .line 939
    .line 940
    invoke-virtual {v7, v2}, Luj;->j(I)V

    .line 941
    .line 942
    .line 943
    move-object/from16 v19, v4

    .line 944
    .line 945
    goto :goto_18

    .line 946
    :pswitch_1c
    move-object/from16 v19, v4

    .line 947
    .line 948
    const/4 v4, 0x2

    .line 949
    invoke-static {v14, v4, v2}, Luj;->b(III)V

    .line 950
    .line 951
    .line 952
    invoke-virtual {v7}, Luj;->f()Luj;

    .line 953
    .line 954
    .line 955
    move-result-object v2

    .line 956
    invoke-static {v2}, Lw11;->e(Luj;)Llh;

    .line 957
    .line 958
    .line 959
    move-result-object v2

    .line 960
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 961
    .line 962
    .line 963
    goto :goto_18

    .line 964
    :pswitch_1d
    move-object/from16 v19, v4

    .line 965
    .line 966
    const/4 v4, 0x0

    .line 967
    invoke-static {v14, v4, v2}, Luj;->b(III)V

    .line 968
    .line 969
    .line 970
    invoke-virtual {v7}, Luj;->i()J

    .line 971
    .line 972
    .line 973
    goto :goto_19

    .line 974
    :pswitch_1e
    move-object/from16 v19, v4

    .line 975
    .line 976
    const/4 v4, 0x2

    .line 977
    invoke-static {v14, v4, v2}, Luj;->b(III)V

    .line 978
    .line 979
    .line 980
    invoke-virtual {v7}, Luj;->f()Luj;

    .line 981
    .line 982
    .line 983
    move-result-object v2

    .line 984
    invoke-static {v2}, Lw11;->e(Luj;)Llh;

    .line 985
    .line 986
    .line 987
    move-result-object v2

    .line 988
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 989
    .line 990
    .line 991
    :goto_18
    const/4 v4, 0x0

    .line 992
    goto :goto_19

    .line 993
    :pswitch_1f
    move-object/from16 v19, v4

    .line 994
    .line 995
    const/4 v4, 0x0

    .line 996
    invoke-static {v14, v4, v2}, Luj;->b(III)V

    .line 997
    .line 998
    .line 999
    invoke-virtual {v7}, Luj;->i()J

    .line 1000
    .line 1001
    .line 1002
    goto :goto_19

    .line 1003
    :pswitch_20
    move-object/from16 v19, v4

    .line 1004
    .line 1005
    const/4 v4, 0x0

    .line 1006
    invoke-static {v14, v4, v2}, Luj;->b(III)V

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v7}, Luj;->i()J

    .line 1010
    .line 1011
    .line 1012
    goto :goto_19

    .line 1013
    :pswitch_21
    move-object/from16 v19, v4

    .line 1014
    .line 1015
    const/4 v4, 0x0

    .line 1016
    invoke-static {v14, v4, v2}, Luj;->b(III)V

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v7}, Luj;->i()J

    .line 1020
    .line 1021
    .line 1022
    :goto_19
    move-object/from16 v4, v19

    .line 1023
    .line 1024
    move-object/from16 v2, v20

    .line 1025
    .line 1026
    const/4 v14, 0x3

    .line 1027
    goto :goto_17

    .line 1028
    :cond_1a
    move-object/from16 v20, v2

    .line 1029
    .line 1030
    move-object/from16 v19, v4

    .line 1031
    .line 1032
    const/4 v4, 0x0

    .line 1033
    invoke-static {v13}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1034
    .line 1035
    .line 1036
    invoke-static {v15}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1037
    .line 1038
    .line 1039
    goto :goto_1c

    .line 1040
    :cond_1b
    move-object/from16 v20, v2

    .line 1041
    .line 1042
    move-object/from16 v19, v4

    .line 1043
    .line 1044
    const/4 v4, 0x0

    .line 1045
    invoke-static {v13, v4, v7}, Luj;->b(III)V

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual/range {v19 .. v19}, Luj;->i()J

    .line 1049
    .line 1050
    .line 1051
    move-result-wide v13

    .line 1052
    long-to-int v2, v13

    .line 1053
    invoke-static/range {v21 .. v21}, Len;->E(I)[I

    .line 1054
    .line 1055
    .line 1056
    move-result-object v4

    .line 1057
    array-length v7, v4

    .line 1058
    const/4 v13, 0x0

    .line 1059
    :goto_1a
    if-ge v13, v7, :cond_1f

    .line 1060
    .line 1061
    aget v14, v4, v13

    .line 1062
    .line 1063
    invoke-static {v14}, Len;->y(I)I

    .line 1064
    .line 1065
    .line 1066
    move-result v14

    .line 1067
    if-ne v14, v2, :cond_1c

    .line 1068
    .line 1069
    goto :goto_1c

    .line 1070
    :cond_1c
    add-int/lit8 v13, v13, 0x1

    .line 1071
    .line 1072
    goto :goto_1a

    .line 1073
    :cond_1d
    move-object/from16 v20, v2

    .line 1074
    .line 1075
    move-object/from16 v19, v4

    .line 1076
    .line 1077
    const/4 v15, 0x0

    .line 1078
    invoke-static {v13, v15, v7}, Luj;->b(III)V

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual/range {v19 .. v19}, Luj;->i()J

    .line 1082
    .line 1083
    .line 1084
    move-result-wide v13

    .line 1085
    long-to-int v2, v13

    .line 1086
    const/16 v22, 0x2

    .line 1087
    .line 1088
    invoke-static/range {v22 .. v22}, Len;->E(I)[I

    .line 1089
    .line 1090
    .line 1091
    move-result-object v4

    .line 1092
    array-length v7, v4

    .line 1093
    const/4 v13, 0x0

    .line 1094
    :goto_1b
    if-ge v13, v7, :cond_1f

    .line 1095
    .line 1096
    aget v14, v4, v13

    .line 1097
    .line 1098
    invoke-static {v14}, Len;->y(I)I

    .line 1099
    .line 1100
    .line 1101
    move-result v14

    .line 1102
    if-ne v14, v2, :cond_1e

    .line 1103
    .line 1104
    goto :goto_1c

    .line 1105
    :cond_1e
    add-int/lit8 v13, v13, 0x1

    .line 1106
    .line 1107
    goto :goto_1b

    .line 1108
    :cond_1f
    :goto_1c
    move-object/from16 v4, v19

    .line 1109
    .line 1110
    move-object/from16 v2, v20

    .line 1111
    .line 1112
    const/4 v15, 0x2

    .line 1113
    goto/16 :goto_16

    .line 1114
    .line 1115
    :cond_20
    move-object/from16 v20, v2

    .line 1116
    .line 1117
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual/range {v20 .. v20}, Luj;->g()Ljava/lang/String;

    .line 1121
    .line 1122
    .line 1123
    :goto_1d
    move-object/from16 v2, v20

    .line 1124
    .line 1125
    goto/16 :goto_15

    .line 1126
    .line 1127
    :cond_21
    new-instance v2, Ldc0;

    .line 1128
    .line 1129
    const/16 v4, 0x19

    .line 1130
    .line 1131
    invoke-direct {v2, v4}, Ldc0;-><init>(I)V

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1135
    .line 1136
    .line 1137
    goto/16 :goto_21

    .line 1138
    .line 1139
    :pswitch_22
    move-object/from16 v23, v2

    .line 1140
    .line 1141
    move/from16 v25, v14

    .line 1142
    .line 1143
    move/from16 v24, v15

    .line 1144
    .line 1145
    move v15, v13

    .line 1146
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 1147
    .line 1148
    .line 1149
    invoke-virtual/range {v23 .. v23}, Luj;->g()Ljava/lang/String;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v17

    .line 1153
    goto/16 :goto_7

    .line 1154
    .line 1155
    :pswitch_23
    move-object/from16 v23, v2

    .line 1156
    .line 1157
    move/from16 v25, v14

    .line 1158
    .line 1159
    move/from16 v24, v15

    .line 1160
    .line 1161
    move v15, v13

    .line 1162
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual/range {v23 .. v23}, Luj;->f()Luj;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v1

    .line 1169
    move-object/from16 v7, v18

    .line 1170
    .line 1171
    move-object v13, v7

    .line 1172
    const/4 v2, 0x0

    .line 1173
    const/4 v4, 0x0

    .line 1174
    :goto_1e
    invoke-virtual {v1}, Luj;->h()I

    .line 1175
    .line 1176
    .line 1177
    move-result v14

    .line 1178
    if-eqz v14, :cond_22

    .line 1179
    .line 1180
    ushr-int/lit8 v15, v14, 0x3

    .line 1181
    .line 1182
    and-int/lit8 v14, v14, 0x7

    .line 1183
    .line 1184
    packed-switch v15, :pswitch_data_4

    .line 1185
    .line 1186
    .line 1187
    invoke-virtual {v1, v14}, Luj;->j(I)V

    .line 1188
    .line 1189
    .line 1190
    move-object/from16 v19, v1

    .line 1191
    .line 1192
    :goto_1f
    const/16 v22, 0x2

    .line 1193
    .line 1194
    goto/16 :goto_20

    .line 1195
    .line 1196
    :pswitch_24
    move-object/from16 v19, v1

    .line 1197
    .line 1198
    const/4 v1, 0x2

    .line 1199
    invoke-static {v15, v1, v14}, Luj;->b(III)V

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual/range {v19 .. v19}, Luj;->f()Luj;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v1

    .line 1206
    invoke-static {v1}, Lw11;->f(Luj;)Lzb0;

    .line 1207
    .line 1208
    .line 1209
    goto :goto_1f

    .line 1210
    :pswitch_25
    move-object/from16 v19, v1

    .line 1211
    .line 1212
    const/4 v1, 0x0

    .line 1213
    invoke-static {v15, v1, v14}, Luj;->b(III)V

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual/range {v19 .. v19}, Luj;->i()J

    .line 1217
    .line 1218
    .line 1219
    goto :goto_1f

    .line 1220
    :pswitch_26
    move-object/from16 v19, v1

    .line 1221
    .line 1222
    const/4 v1, 0x0

    .line 1223
    invoke-static {v15, v1, v14}, Luj;->b(III)V

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual/range {v19 .. v19}, Luj;->d()Z

    .line 1227
    .line 1228
    .line 1229
    goto :goto_1f

    .line 1230
    :pswitch_27
    move-object/from16 v19, v1

    .line 1231
    .line 1232
    const/4 v1, 0x0

    .line 1233
    invoke-static {v15, v1, v14}, Luj;->b(III)V

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual/range {v19 .. v19}, Luj;->i()J

    .line 1237
    .line 1238
    .line 1239
    goto :goto_1f

    .line 1240
    :pswitch_28
    move-object/from16 v19, v1

    .line 1241
    .line 1242
    const/4 v1, 0x0

    .line 1243
    invoke-static {v15, v1, v14}, Luj;->b(III)V

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual/range {v19 .. v19}, Luj;->i()J

    .line 1247
    .line 1248
    .line 1249
    goto :goto_1f

    .line 1250
    :pswitch_29
    move-object/from16 v19, v1

    .line 1251
    .line 1252
    const/4 v1, 0x0

    .line 1253
    invoke-static {v15, v1, v14}, Luj;->b(III)V

    .line 1254
    .line 1255
    .line 1256
    invoke-virtual/range {v19 .. v19}, Luj;->d()Z

    .line 1257
    .line 1258
    .line 1259
    goto :goto_1f

    .line 1260
    :pswitch_2a
    move-object/from16 v19, v1

    .line 1261
    .line 1262
    const/4 v1, 0x0

    .line 1263
    const/4 v13, 0x2

    .line 1264
    invoke-static {v15, v13, v14}, Luj;->b(III)V

    .line 1265
    .line 1266
    .line 1267
    invoke-virtual/range {v19 .. v19}, Luj;->g()Ljava/lang/String;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v14

    .line 1271
    move/from16 v22, v13

    .line 1272
    .line 1273
    move-object v13, v14

    .line 1274
    goto :goto_20

    .line 1275
    :pswitch_2b
    move-object/from16 v19, v1

    .line 1276
    .line 1277
    const/4 v1, 0x0

    .line 1278
    const/16 v22, 0x2

    .line 1279
    .line 1280
    invoke-static {v15, v1, v14}, Luj;->b(III)V

    .line 1281
    .line 1282
    .line 1283
    invoke-virtual/range {v19 .. v19}, Luj;->i()J

    .line 1284
    .line 1285
    .line 1286
    move-result-wide v14

    .line 1287
    long-to-int v4, v14

    .line 1288
    goto :goto_20

    .line 1289
    :pswitch_2c
    move-object/from16 v19, v1

    .line 1290
    .line 1291
    const/4 v1, 0x0

    .line 1292
    const/4 v7, 0x2

    .line 1293
    invoke-static {v15, v7, v14}, Luj;->b(III)V

    .line 1294
    .line 1295
    .line 1296
    invoke-virtual/range {v19 .. v19}, Luj;->g()Ljava/lang/String;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v14

    .line 1300
    move/from16 v22, v7

    .line 1301
    .line 1302
    move-object v7, v14

    .line 1303
    goto :goto_20

    .line 1304
    :pswitch_2d
    move-object/from16 v19, v1

    .line 1305
    .line 1306
    const/4 v1, 0x0

    .line 1307
    const/16 v22, 0x2

    .line 1308
    .line 1309
    invoke-static {v15, v1, v14}, Luj;->b(III)V

    .line 1310
    .line 1311
    .line 1312
    invoke-virtual/range {v19 .. v19}, Luj;->i()J

    .line 1313
    .line 1314
    .line 1315
    move-result-wide v1

    .line 1316
    long-to-int v1, v1

    .line 1317
    move v2, v1

    .line 1318
    :goto_20
    move-object/from16 v1, v19

    .line 1319
    .line 1320
    goto/16 :goto_1e

    .line 1321
    .line 1322
    :cond_22
    new-instance v1, Lke2;

    .line 1323
    .line 1324
    invoke-direct {v1, v7, v2, v4, v13}, Lke2;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 1325
    .line 1326
    .line 1327
    :cond_23
    :goto_21
    move/from16 v15, v24

    .line 1328
    .line 1329
    :goto_22
    move/from16 v14, v25

    .line 1330
    .line 1331
    goto/16 :goto_24

    .line 1332
    .line 1333
    :pswitch_2e
    move-object/from16 v23, v2

    .line 1334
    .line 1335
    move/from16 v25, v14

    .line 1336
    .line 1337
    move/from16 v24, v15

    .line 1338
    .line 1339
    move v15, v13

    .line 1340
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 1341
    .line 1342
    .line 1343
    invoke-virtual/range {v23 .. v23}, Luj;->g()Ljava/lang/String;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v2

    .line 1347
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1348
    .line 1349
    .line 1350
    goto :goto_21

    .line 1351
    :pswitch_2f
    move-object/from16 v23, v2

    .line 1352
    .line 1353
    move/from16 v25, v14

    .line 1354
    .line 1355
    move/from16 v24, v15

    .line 1356
    .line 1357
    move v15, v13

    .line 1358
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 1359
    .line 1360
    .line 1361
    invoke-virtual/range {v23 .. v23}, Luj;->g()Ljava/lang/String;

    .line 1362
    .line 1363
    .line 1364
    goto/16 :goto_7

    .line 1365
    .line 1366
    :pswitch_30
    move-object/from16 v23, v2

    .line 1367
    .line 1368
    move/from16 v25, v14

    .line 1369
    .line 1370
    move/from16 v24, v15

    .line 1371
    .line 1372
    const/4 v15, 0x0

    .line 1373
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual/range {v23 .. v23}, Luj;->i()J

    .line 1377
    .line 1378
    .line 1379
    goto/16 :goto_7

    .line 1380
    .line 1381
    :pswitch_31
    move-object/from16 v23, v2

    .line 1382
    .line 1383
    move/from16 v25, v14

    .line 1384
    .line 1385
    const/4 v15, 0x0

    .line 1386
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 1387
    .line 1388
    .line 1389
    invoke-virtual/range {v23 .. v23}, Luj;->i()J

    .line 1390
    .line 1391
    .line 1392
    move-result-wide v13

    .line 1393
    long-to-int v2, v13

    .line 1394
    move v15, v2

    .line 1395
    goto :goto_22

    .line 1396
    :pswitch_32
    move-object/from16 v23, v2

    .line 1397
    .line 1398
    move/from16 v24, v15

    .line 1399
    .line 1400
    const/4 v15, 0x0

    .line 1401
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 1402
    .line 1403
    .line 1404
    invoke-virtual/range {v23 .. v23}, Luj;->i()J

    .line 1405
    .line 1406
    .line 1407
    move-result-wide v13

    .line 1408
    long-to-int v14, v13

    .line 1409
    goto/16 :goto_7

    .line 1410
    .line 1411
    :pswitch_33
    move-object/from16 v23, v2

    .line 1412
    .line 1413
    move/from16 v25, v14

    .line 1414
    .line 1415
    move/from16 v24, v15

    .line 1416
    .line 1417
    move v15, v13

    .line 1418
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 1419
    .line 1420
    .line 1421
    invoke-virtual/range {v23 .. v23}, Luj;->g()Ljava/lang/String;

    .line 1422
    .line 1423
    .line 1424
    goto/16 :goto_7

    .line 1425
    .line 1426
    :pswitch_34
    move-object/from16 v23, v2

    .line 1427
    .line 1428
    move/from16 v25, v14

    .line 1429
    .line 1430
    move/from16 v24, v15

    .line 1431
    .line 1432
    move v15, v13

    .line 1433
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 1434
    .line 1435
    .line 1436
    invoke-virtual/range {v23 .. v23}, Luj;->g()Ljava/lang/String;

    .line 1437
    .line 1438
    .line 1439
    goto/16 :goto_7

    .line 1440
    .line 1441
    :pswitch_35
    move-object/from16 v23, v2

    .line 1442
    .line 1443
    move/from16 v25, v14

    .line 1444
    .line 1445
    move/from16 v24, v15

    .line 1446
    .line 1447
    move v15, v13

    .line 1448
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 1449
    .line 1450
    .line 1451
    invoke-virtual/range {v23 .. v23}, Luj;->g()Ljava/lang/String;

    .line 1452
    .line 1453
    .line 1454
    goto/16 :goto_7

    .line 1455
    .line 1456
    :pswitch_36
    move-object/from16 v23, v2

    .line 1457
    .line 1458
    move/from16 v25, v14

    .line 1459
    .line 1460
    move/from16 v24, v15

    .line 1461
    .line 1462
    const/4 v15, 0x0

    .line 1463
    invoke-static {v7, v15, v4}, Luj;->b(III)V

    .line 1464
    .line 1465
    .line 1466
    invoke-virtual/range {v23 .. v23}, Luj;->i()J

    .line 1467
    .line 1468
    .line 1469
    move-result-wide v13

    .line 1470
    long-to-int v2, v13

    .line 1471
    invoke-static/range {v21 .. v21}, Len;->E(I)[I

    .line 1472
    .line 1473
    .line 1474
    move-result-object v4

    .line 1475
    array-length v7, v4

    .line 1476
    const/4 v13, 0x0

    .line 1477
    :goto_23
    if-ge v13, v7, :cond_23

    .line 1478
    .line 1479
    aget v14, v4, v13

    .line 1480
    .line 1481
    invoke-static {v14}, Len;->y(I)I

    .line 1482
    .line 1483
    .line 1484
    move-result v14

    .line 1485
    if-ne v14, v2, :cond_24

    .line 1486
    .line 1487
    goto/16 :goto_21

    .line 1488
    .line 1489
    :cond_24
    add-int/lit8 v13, v13, 0x1

    .line 1490
    .line 1491
    goto :goto_23

    .line 1492
    :goto_24
    move-object/from16 v13, v18

    .line 1493
    .line 1494
    move-object/from16 v2, v23

    .line 1495
    .line 1496
    const/4 v4, 0x1

    .line 1497
    const/4 v7, 0x0

    .line 1498
    goto/16 :goto_1

    .line 1499
    .line 1500
    :cond_25
    move-object/from16 v18, v13

    .line 1501
    .line 1502
    move/from16 v25, v14

    .line 1503
    .line 1504
    move/from16 v24, v15

    .line 1505
    .line 1506
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v2

    .line 1510
    invoke-static {v5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1511
    .line 1512
    .line 1513
    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1514
    .line 1515
    .line 1516
    invoke-static {v8}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v3

    .line 1520
    invoke-static {v9}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 1521
    .line 1522
    .line 1523
    invoke-static {v10}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v4

    .line 1527
    invoke-static {v11}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1528
    .line 1529
    .line 1530
    invoke-static {v12}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1531
    .line 1532
    .line 1533
    new-instance v5, Lio/sentry/c5;

    .line 1534
    .line 1535
    invoke-direct {v5}, Lio/sentry/c5;-><init>()V

    .line 1536
    .line 1537
    .line 1538
    sget-object v6, Lio/sentry/m5;->FATAL:Lio/sentry/m5;

    .line 1539
    .line 1540
    iput-object v6, v5, Lio/sentry/c5;->f0:Lio/sentry/m5;

    .line 1541
    .line 1542
    const-string v6, "native"

    .line 1543
    .line 1544
    iput-object v6, v5, Lio/sentry/q4;->v:Ljava/lang/String;

    .line 1545
    .line 1546
    new-instance v6, Lio/sentry/protocol/p;

    .line 1547
    .line 1548
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1549
    .line 1550
    .line 1551
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1552
    .line 1553
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 1554
    .line 1555
    .line 1556
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v2

    .line 1560
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1561
    .line 1562
    .line 1563
    move-result v8

    .line 1564
    if-eqz v8, :cond_26

    .line 1565
    .line 1566
    :goto_25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v8

    .line 1570
    check-cast v8, Ljava/lang/CharSequence;

    .line 1571
    .line 1572
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 1573
    .line 1574
    .line 1575
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1576
    .line 1577
    .line 1578
    move-result v8

    .line 1579
    if-eqz v8, :cond_26

    .line 1580
    .line 1581
    const-string v8, " "

    .line 1582
    .line 1583
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 1584
    .line 1585
    .line 1586
    goto :goto_25

    .line 1587
    :cond_26
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v2

    .line 1591
    const-string v7, ")"

    .line 1592
    .line 1593
    const-string v8, " ("

    .line 1594
    .line 1595
    if-eqz v1, :cond_28

    .line 1596
    .line 1597
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1598
    .line 1599
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->isEmpty()Z

    .line 1600
    .line 1601
    .line 1602
    move-result v9

    .line 1603
    if-nez v9, :cond_27

    .line 1604
    .line 1605
    const-string v9, ": "

    .line 1606
    .line 1607
    move-object/from16 v13, v17

    .line 1608
    .line 1609
    invoke-virtual {v13, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v13

    .line 1613
    goto :goto_26

    .line 1614
    :cond_27
    move-object/from16 v13, v18

    .line 1615
    .line 1616
    :goto_26
    iget-object v9, v1, Lke2;->b:Ljava/lang/String;

    .line 1617
    .line 1618
    iget v10, v1, Lke2;->a:I

    .line 1619
    .line 1620
    iget-object v11, v1, Lke2;->d:Ljava/lang/String;

    .line 1621
    .line 1622
    iget v12, v1, Lke2;->c:I

    .line 1623
    .line 1624
    new-instance v14, Ljava/lang/StringBuilder;

    .line 1625
    .line 1626
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 1627
    .line 1628
    .line 1629
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1630
    .line 1631
    .line 1632
    const-string v13, "Fatal signal "

    .line 1633
    .line 1634
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1635
    .line 1636
    .line 1637
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1638
    .line 1639
    .line 1640
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1641
    .line 1642
    .line 1643
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1644
    .line 1645
    .line 1646
    const-string v9, "), "

    .line 1647
    .line 1648
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1649
    .line 1650
    .line 1651
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1652
    .line 1653
    .line 1654
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1655
    .line 1656
    .line 1657
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1658
    .line 1659
    .line 1660
    const-string v9, "), pid = "

    .line 1661
    .line 1662
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1663
    .line 1664
    .line 1665
    move/from16 v9, v25

    .line 1666
    .line 1667
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1668
    .line 1669
    .line 1670
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1671
    .line 1672
    .line 1673
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1674
    .line 1675
    .line 1676
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1677
    .line 1678
    .line 1679
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v2

    .line 1683
    iput-object v2, v6, Lio/sentry/protocol/p;->a:Ljava/lang/String;

    .line 1684
    .line 1685
    goto :goto_27

    .line 1686
    :cond_28
    move/from16 v9, v25

    .line 1687
    .line 1688
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1689
    .line 1690
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1691
    .line 1692
    const-string v11, "Fatal exit pid = "

    .line 1693
    .line 1694
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1695
    .line 1696
    .line 1697
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1698
    .line 1699
    .line 1700
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1701
    .line 1702
    .line 1703
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1704
    .line 1705
    .line 1706
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1707
    .line 1708
    .line 1709
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v2

    .line 1713
    iput-object v2, v6, Lio/sentry/protocol/p;->a:Ljava/lang/String;

    .line 1714
    .line 1715
    :goto_27
    iput-object v6, v5, Lio/sentry/c5;->b0:Lio/sentry/protocol/p;

    .line 1716
    .line 1717
    new-instance v2, Ljava/util/ArrayList;

    .line 1718
    .line 1719
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1720
    .line 1721
    .line 1722
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1723
    .line 1724
    .line 1725
    move-result-object v4

    .line 1726
    move-object/from16 v6, v16

    .line 1727
    .line 1728
    :cond_29
    :goto_28
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1729
    .line 1730
    .line 1731
    move-result v7

    .line 1732
    if-eqz v7, :cond_30

    .line 1733
    .line 1734
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v7

    .line 1738
    check-cast v7, Lfg1;

    .line 1739
    .line 1740
    iget-boolean v8, v7, Lfg1;->d:Z

    .line 1741
    .line 1742
    iget-object v9, v7, Lfg1;->f:Ljava/lang/String;

    .line 1743
    .line 1744
    iget-object v10, v7, Lfg1;->e:Ljava/lang/String;

    .line 1745
    .line 1746
    iget-wide v11, v7, Lfg1;->b:J

    .line 1747
    .line 1748
    if-nez v8, :cond_2a

    .line 1749
    .line 1750
    goto :goto_28

    .line 1751
    :cond_2a
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    .line 1752
    .line 1753
    .line 1754
    move-result v8

    .line 1755
    if-nez v8, :cond_29

    .line 1756
    .line 1757
    const-string v8, "/dev/"

    .line 1758
    .line 1759
    invoke-virtual {v10, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1760
    .line 1761
    .line 1762
    move-result v8

    .line 1763
    if-eqz v8, :cond_2b

    .line 1764
    .line 1765
    goto :goto_28

    .line 1766
    :cond_2b
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 1767
    .line 1768
    .line 1769
    move-result v8

    .line 1770
    iget-wide v13, v7, Lfg1;->c:J

    .line 1771
    .line 1772
    cmp-long v13, v13, v19

    .line 1773
    .line 1774
    if-nez v13, :cond_2c

    .line 1775
    .line 1776
    const/4 v13, 0x1

    .line 1777
    goto :goto_29

    .line 1778
    :cond_2c
    const/4 v13, 0x0

    .line 1779
    :goto_29
    if-nez v8, :cond_2f

    .line 1780
    .line 1781
    if-eqz v13, :cond_2f

    .line 1782
    .line 1783
    if-eqz v6, :cond_2d

    .line 1784
    .line 1785
    iget-object v8, v6, Lio/sentry/android/core/internal/tombstone/b;->c:Ljava/lang/Object;

    .line 1786
    .line 1787
    check-cast v8, Ljava/lang/String;

    .line 1788
    .line 1789
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1790
    .line 1791
    .line 1792
    move-result v8

    .line 1793
    if-eqz v8, :cond_2d

    .line 1794
    .line 1795
    iput-wide v11, v6, Lio/sentry/android/core/internal/tombstone/b;->b:J

    .line 1796
    .line 1797
    goto :goto_28

    .line 1798
    :cond_2d
    if-eqz v6, :cond_2e

    .line 1799
    .line 1800
    invoke-virtual {v6}, Lio/sentry/android/core/internal/tombstone/b;->a()Lio/sentry/protocol/DebugImage;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v6

    .line 1804
    if-eqz v6, :cond_2e

    .line 1805
    .line 1806
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1807
    .line 1808
    .line 1809
    :cond_2e
    new-instance v6, Lio/sentry/android/core/internal/tombstone/b;

    .line 1810
    .line 1811
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1812
    .line 1813
    .line 1814
    iput-object v10, v6, Lio/sentry/android/core/internal/tombstone/b;->c:Ljava/lang/Object;

    .line 1815
    .line 1816
    iput-object v9, v6, Lio/sentry/android/core/internal/tombstone/b;->d:Ljava/lang/Object;

    .line 1817
    .line 1818
    iget-wide v7, v7, Lfg1;->a:J

    .line 1819
    .line 1820
    iput-wide v7, v6, Lio/sentry/android/core/internal/tombstone/b;->a:J

    .line 1821
    .line 1822
    iput-wide v11, v6, Lio/sentry/android/core/internal/tombstone/b;->b:J

    .line 1823
    .line 1824
    goto :goto_28

    .line 1825
    :cond_2f
    if-eqz v6, :cond_29

    .line 1826
    .line 1827
    iget-object v7, v6, Lio/sentry/android/core/internal/tombstone/b;->c:Ljava/lang/Object;

    .line 1828
    .line 1829
    check-cast v7, Ljava/lang/String;

    .line 1830
    .line 1831
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1832
    .line 1833
    .line 1834
    move-result v7

    .line 1835
    if-eqz v7, :cond_29

    .line 1836
    .line 1837
    iput-wide v11, v6, Lio/sentry/android/core/internal/tombstone/b;->b:J

    .line 1838
    .line 1839
    goto :goto_28

    .line 1840
    :cond_30
    if-eqz v6, :cond_31

    .line 1841
    .line 1842
    invoke-virtual {v6}, Lio/sentry/android/core/internal/tombstone/b;->a()Lio/sentry/protocol/DebugImage;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v4

    .line 1846
    if-eqz v4, :cond_31

    .line 1847
    .line 1848
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1849
    .line 1850
    .line 1851
    :cond_31
    new-instance v4, Lio/sentry/protocol/f;

    .line 1852
    .line 1853
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 1854
    .line 1855
    .line 1856
    new-instance v6, Ljava/util/ArrayList;

    .line 1857
    .line 1858
    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1859
    .line 1860
    .line 1861
    iput-object v6, v4, Lio/sentry/protocol/f;->b:Ljava/util/List;

    .line 1862
    .line 1863
    iput-object v4, v5, Lio/sentry/q4;->Y:Lio/sentry/protocol/f;

    .line 1864
    .line 1865
    new-instance v2, Lio/sentry/protocol/v;

    .line 1866
    .line 1867
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1868
    .line 1869
    .line 1870
    if-eqz v1, :cond_32

    .line 1871
    .line 1872
    iget-object v4, v1, Lke2;->b:Ljava/lang/String;

    .line 1873
    .line 1874
    iput-object v4, v2, Lio/sentry/protocol/v;->a:Ljava/lang/String;

    .line 1875
    .line 1876
    iget-object v6, v0, Lio/sentry/android/core/internal/tombstone/c;->e:Ljava/util/HashMap;

    .line 1877
    .line 1878
    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1879
    .line 1880
    .line 1881
    move-result-object v4

    .line 1882
    check-cast v4, Ljava/lang/String;

    .line 1883
    .line 1884
    iput-object v4, v2, Lio/sentry/protocol/v;->b:Ljava/lang/String;

    .line 1885
    .line 1886
    new-instance v4, Lio/sentry/protocol/o;

    .line 1887
    .line 1888
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 1889
    .line 1890
    .line 1891
    sget-object v6, Lio/sentry/android/core/internal/tombstone/a;->TOMBSTONE:Lio/sentry/android/core/internal/tombstone/a;

    .line 1892
    .line 1893
    invoke-virtual {v6}, Lio/sentry/android/core/internal/tombstone/a;->getValue()Ljava/lang/String;

    .line 1894
    .line 1895
    .line 1896
    move-result-object v6

    .line 1897
    iput-object v6, v4, Lio/sentry/protocol/o;->a:Ljava/lang/String;

    .line 1898
    .line 1899
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1900
    .line 1901
    iput-object v6, v4, Lio/sentry/protocol/o;->d:Ljava/lang/Boolean;

    .line 1902
    .line 1903
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1904
    .line 1905
    iput-object v6, v4, Lio/sentry/protocol/o;->i:Ljava/lang/Boolean;

    .line 1906
    .line 1907
    new-instance v6, Ljava/util/HashMap;

    .line 1908
    .line 1909
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 1910
    .line 1911
    .line 1912
    iget v7, v1, Lke2;->a:I

    .line 1913
    .line 1914
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v7

    .line 1918
    const-string v8, "number"

    .line 1919
    .line 1920
    invoke-virtual {v6, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1921
    .line 1922
    .line 1923
    const-string v7, "name"

    .line 1924
    .line 1925
    iget-object v8, v1, Lke2;->b:Ljava/lang/String;

    .line 1926
    .line 1927
    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1928
    .line 1929
    .line 1930
    iget v7, v1, Lke2;->c:I

    .line 1931
    .line 1932
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v7

    .line 1936
    const-string v8, "code"

    .line 1937
    .line 1938
    invoke-virtual {v6, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1939
    .line 1940
    .line 1941
    const-string v7, "code_name"

    .line 1942
    .line 1943
    iget-object v1, v1, Lke2;->d:Ljava/lang/String;

    .line 1944
    .line 1945
    invoke-virtual {v6, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1946
    .line 1947
    .line 1948
    new-instance v1, Ljava/util/HashMap;

    .line 1949
    .line 1950
    invoke-direct {v1, v6}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 1951
    .line 1952
    .line 1953
    iput-object v1, v4, Lio/sentry/protocol/o;->e:Ljava/util/AbstractMap;

    .line 1954
    .line 1955
    iput-object v4, v2, Lio/sentry/protocol/v;->f:Lio/sentry/protocol/o;

    .line 1956
    .line 1957
    :cond_32
    move/from16 v15, v24

    .line 1958
    .line 1959
    int-to-long v6, v15

    .line 1960
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1961
    .line 1962
    .line 1963
    move-result-object v1

    .line 1964
    iput-object v1, v2, Lio/sentry/protocol/v;->d:Ljava/lang/Long;

    .line 1965
    .line 1966
    new-instance v1, Ljava/util/ArrayList;

    .line 1967
    .line 1968
    const/4 v14, 0x1

    .line 1969
    invoke-direct {v1, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 1970
    .line 1971
    .line 1972
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1973
    .line 1974
    .line 1975
    new-instance v2, Lio/sentry/d2;

    .line 1976
    .line 1977
    invoke-direct {v2, v1}, Lio/sentry/d2;-><init>(Ljava/util/List;)V

    .line 1978
    .line 1979
    .line 1980
    iput-object v2, v5, Lio/sentry/c5;->e0:Lio/sentry/d2;

    .line 1981
    .line 1982
    invoke-virtual {v5}, Lio/sentry/c5;->d()Ljava/util/ArrayList;

    .line 1983
    .line 1984
    .line 1985
    move-result-object v1

    .line 1986
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1987
    .line 1988
    .line 1989
    const/4 v4, 0x0

    .line 1990
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v1

    .line 1994
    check-cast v1, Lio/sentry/protocol/v;

    .line 1995
    .line 1996
    new-instance v2, Ljava/util/ArrayList;

    .line 1997
    .line 1998
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1999
    .line 2000
    .line 2001
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2002
    .line 2003
    .line 2004
    move-result-object v3

    .line 2005
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2006
    .line 2007
    .line 2008
    move-result-object v3

    .line 2009
    :goto_2a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2010
    .line 2011
    .line 2012
    move-result v4

    .line 2013
    if-eqz v4, :cond_3d

    .line 2014
    .line 2015
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2016
    .line 2017
    .line 2018
    move-result-object v4

    .line 2019
    check-cast v4, Ljava/util/Map$Entry;

    .line 2020
    .line 2021
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v6

    .line 2025
    check-cast v6, Ltp2;

    .line 2026
    .line 2027
    new-instance v7, Lio/sentry/protocol/e0;

    .line 2028
    .line 2029
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 2030
    .line 2031
    .line 2032
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v4

    .line 2036
    check-cast v4, Ljava/lang/Integer;

    .line 2037
    .line 2038
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2039
    .line 2040
    .line 2041
    move-result v4

    .line 2042
    int-to-long v8, v4

    .line 2043
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2044
    .line 2045
    .line 2046
    move-result-object v4

    .line 2047
    iput-object v4, v7, Lio/sentry/protocol/e0;->a:Ljava/lang/Long;

    .line 2048
    .line 2049
    iget-object v4, v6, Ltp2;->b:Ljava/lang/String;

    .line 2050
    .line 2051
    iput-object v4, v7, Lio/sentry/protocol/e0;->c:Ljava/lang/String;

    .line 2052
    .line 2053
    new-instance v4, Ljava/util/ArrayList;

    .line 2054
    .line 2055
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2056
    .line 2057
    .line 2058
    iget-object v8, v6, Ltp2;->f:Ljava/util/List;

    .line 2059
    .line 2060
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2061
    .line 2062
    .line 2063
    move-result-object v8

    .line 2064
    :goto_2b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2065
    .line 2066
    .line 2067
    move-result v9

    .line 2068
    const-string v10, "0x%x"

    .line 2069
    .line 2070
    if-eqz v9, :cond_3a

    .line 2071
    .line 2072
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2073
    .line 2074
    .line 2075
    move-result-object v9

    .line 2076
    check-cast v9, Llh;

    .line 2077
    .line 2078
    iget-object v11, v9, Llh;->c:Ljava/lang/String;

    .line 2079
    .line 2080
    iget-object v12, v9, Llh;->b:Ljava/lang/String;

    .line 2081
    .line 2082
    const-string v13, "libart.so"

    .line 2083
    .line 2084
    invoke-virtual {v11, v13}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 2085
    .line 2086
    .line 2087
    move-result v13

    .line 2088
    if-eqz v13, :cond_33

    .line 2089
    .line 2090
    goto :goto_2b

    .line 2091
    :cond_33
    const-string v13, "<anonymous"

    .line 2092
    .line 2093
    invoke-virtual {v11, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 2094
    .line 2095
    .line 2096
    move-result v13

    .line 2097
    if-eqz v13, :cond_34

    .line 2098
    .line 2099
    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    .line 2100
    .line 2101
    .line 2102
    move-result v13

    .line 2103
    if-eqz v13, :cond_34

    .line 2104
    .line 2105
    goto :goto_2b

    .line 2106
    :cond_34
    new-instance v13, Lio/sentry/protocol/a0;

    .line 2107
    .line 2108
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 2109
    .line 2110
    .line 2111
    iput-object v11, v13, Lio/sentry/protocol/a0;->W:Ljava/lang/String;

    .line 2112
    .line 2113
    iput-object v12, v13, Lio/sentry/protocol/a0;->e:Ljava/lang/String;

    .line 2114
    .line 2115
    move/from16 v24, v15

    .line 2116
    .line 2117
    iget-wide v14, v9, Llh;->a:J

    .line 2118
    .line 2119
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2120
    .line 2121
    .line 2122
    move-result-object v9

    .line 2123
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 2124
    .line 2125
    .line 2126
    move-result-object v9

    .line 2127
    invoke-static {v10, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2128
    .line 2129
    .line 2130
    move-result-object v9

    .line 2131
    iput-object v9, v13, Lio/sentry/protocol/a0;->b0:Ljava/lang/String;

    .line 2132
    .line 2133
    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    .line 2134
    .line 2135
    .line 2136
    move-result v9

    .line 2137
    if-eqz v9, :cond_35

    .line 2138
    .line 2139
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2140
    .line 2141
    goto :goto_2c

    .line 2142
    :cond_35
    iget-object v9, v0, Lio/sentry/android/core/internal/tombstone/c;->b:Ljava/util/List;

    .line 2143
    .line 2144
    iget-object v10, v0, Lio/sentry/android/core/internal/tombstone/c;->c:Ljava/util/List;

    .line 2145
    .line 2146
    invoke-static {v12, v9, v10}, Lio/sentry/s6;->n(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/lang/Boolean;

    .line 2147
    .line 2148
    .line 2149
    move-result-object v9

    .line 2150
    :goto_2c
    iget-object v10, v0, Lio/sentry/android/core/internal/tombstone/c;->d:Ljava/lang/String;

    .line 2151
    .line 2152
    if-eqz v10, :cond_36

    .line 2153
    .line 2154
    invoke-virtual {v11, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 2155
    .line 2156
    .line 2157
    move-result v10

    .line 2158
    if-eqz v10, :cond_36

    .line 2159
    .line 2160
    const/4 v15, 0x1

    .line 2161
    goto :goto_2d

    .line 2162
    :cond_36
    const/4 v15, 0x0

    .line 2163
    :goto_2d
    if-eqz v9, :cond_37

    .line 2164
    .line 2165
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2166
    .line 2167
    .line 2168
    move-result v9

    .line 2169
    if-nez v9, :cond_38

    .line 2170
    .line 2171
    :cond_37
    if-eqz v15, :cond_39

    .line 2172
    .line 2173
    :cond_38
    const/4 v15, 0x1

    .line 2174
    goto :goto_2e

    .line 2175
    :cond_39
    const/4 v15, 0x0

    .line 2176
    :goto_2e
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2177
    .line 2178
    .line 2179
    move-result-object v9

    .line 2180
    iput-object v9, v13, Lio/sentry/protocol/a0;->V:Ljava/lang/Boolean;

    .line 2181
    .line 2182
    const/4 v15, 0x0

    .line 2183
    invoke-virtual {v4, v15, v13}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 2184
    .line 2185
    .line 2186
    move/from16 v15, v24

    .line 2187
    .line 2188
    const/4 v14, 0x1

    .line 2189
    goto :goto_2b

    .line 2190
    :cond_3a
    move/from16 v24, v15

    .line 2191
    .line 2192
    const/4 v15, 0x0

    .line 2193
    new-instance v8, Lio/sentry/protocol/c0;

    .line 2194
    .line 2195
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 2196
    .line 2197
    .line 2198
    iput-object v4, v8, Lio/sentry/protocol/c0;->a:Ljava/util/List;

    .line 2199
    .line 2200
    sget-object v4, Lio/sentry/protocol/b0;->NONE:Lio/sentry/protocol/b0;

    .line 2201
    .line 2202
    iput-object v4, v8, Lio/sentry/protocol/c0;->d:Lio/sentry/protocol/b0;

    .line 2203
    .line 2204
    new-instance v4, Ljava/util/HashMap;

    .line 2205
    .line 2206
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 2207
    .line 2208
    .line 2209
    iget-object v9, v6, Ltp2;->c:Ljava/util/List;

    .line 2210
    .line 2211
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2212
    .line 2213
    .line 2214
    move-result-object v9

    .line 2215
    :goto_2f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 2216
    .line 2217
    .line 2218
    move-result v11

    .line 2219
    if-eqz v11, :cond_3b

    .line 2220
    .line 2221
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2222
    .line 2223
    .line 2224
    move-result-object v11

    .line 2225
    check-cast v11, Lo22;

    .line 2226
    .line 2227
    iget-object v12, v11, Lo22;->a:Ljava/lang/String;

    .line 2228
    .line 2229
    iget-wide v13, v11, Lo22;->b:J

    .line 2230
    .line 2231
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2232
    .line 2233
    .line 2234
    move-result-object v11

    .line 2235
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 2236
    .line 2237
    .line 2238
    move-result-object v11

    .line 2239
    invoke-static {v10, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2240
    .line 2241
    .line 2242
    move-result-object v11

    .line 2243
    invoke-virtual {v4, v12, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2244
    .line 2245
    .line 2246
    goto :goto_2f

    .line 2247
    :cond_3b
    iput-object v4, v8, Lio/sentry/protocol/c0;->b:Ljava/util/AbstractMap;

    .line 2248
    .line 2249
    iput-object v8, v7, Lio/sentry/protocol/e0;->w:Lio/sentry/protocol/c0;

    .line 2250
    .line 2251
    iget v4, v6, Ltp2;->a:I

    .line 2252
    .line 2253
    move/from16 v6, v24

    .line 2254
    .line 2255
    if-ne v6, v4, :cond_3c

    .line 2256
    .line 2257
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2258
    .line 2259
    iput-object v4, v7, Lio/sentry/protocol/e0;->e:Ljava/lang/Boolean;

    .line 2260
    .line 2261
    iput-object v8, v1, Lio/sentry/protocol/v;->e:Lio/sentry/protocol/c0;

    .line 2262
    .line 2263
    :cond_3c
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2264
    .line 2265
    .line 2266
    move v15, v6

    .line 2267
    const/4 v14, 0x1

    .line 2268
    goto/16 :goto_2a

    .line 2269
    .line 2270
    :cond_3d
    new-instance v0, Lio/sentry/d2;

    .line 2271
    .line 2272
    invoke-direct {v0, v2}, Lio/sentry/d2;-><init>(Ljava/util/List;)V

    .line 2273
    .line 2274
    .line 2275
    iput-object v0, v5, Lio/sentry/c5;->d0:Lio/sentry/d2;

    .line 2276
    .line 2277
    return-object v5

    .line 2278
    :cond_3e
    const/16 v16, 0x0

    .line 2279
    .line 2280
    const-string v0, "No InputStream provided; use parse(Tombstone) instead."

    .line 2281
    .line 2282
    invoke-static {v0}, Lds0;->l(Ljava/lang/String;)V

    .line 2283
    .line 2284
    .line 2285
    return-object v16

    .line 2286
    nop

    .line 2287
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_23
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_22
        :pswitch_1b
        :pswitch_1a
        :pswitch_10
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
    .end packed-switch

    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
    .end packed-switch

    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
    .end packed-switch
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/core/internal/tombstone/c;->a:Ljava/io/InputStream;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

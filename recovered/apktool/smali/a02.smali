.class public final La02;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lqc3;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lqc3;

    .line 5
    .line 6
    const/16 v1, 0x14

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lqc3;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La02;->a:Lqc3;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Lcb;)Lwc0;
    .locals 40

    .line 1
    new-instance v0, Ld52;

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lcb;->r()Lsj;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ld52;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Ltj;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v2, v1, v3}, Ltj;-><init>(Lsj;I)V

    .line 14
    .line 15
    .line 16
    iget-object v4, v2, Ltj;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, Ljava/util/ArrayList;

    .line 19
    .line 20
    iget v5, v1, Lsj;->b:I

    .line 21
    .line 22
    iget v6, v1, Lsj;->a:I

    .line 23
    .line 24
    mul-int/lit8 v7, v5, 0x3

    .line 25
    .line 26
    div-int/lit16 v7, v7, 0x184

    .line 27
    .line 28
    const/4 v8, 0x3

    .line 29
    if-lt v7, v8, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v7, v8

    .line 33
    :goto_0
    const/4 v9, 0x5

    .line 34
    new-array v9, v9, [I

    .line 35
    .line 36
    add-int/lit8 v10, v7, -0x1

    .line 37
    .line 38
    const/4 v12, 0x0

    .line 39
    :goto_1
    const/4 v14, 0x2

    .line 40
    const/4 v15, 0x4

    .line 41
    if-ge v10, v5, :cond_f

    .line 42
    .line 43
    if-nez v12, :cond_f

    .line 44
    .line 45
    invoke-static {v9}, Ltj;->b([I)V

    .line 46
    .line 47
    .line 48
    const/4 v11, 0x0

    .line 49
    const/4 v13, 0x0

    .line 50
    const/16 v16, 0x0

    .line 51
    .line 52
    :goto_2
    if-ge v13, v6, :cond_d

    .line 53
    .line 54
    invoke-virtual {v1, v13, v10}, Lsj;->b(II)Z

    .line 55
    .line 56
    .line 57
    move-result v17

    .line 58
    if-eqz v17, :cond_2

    .line 59
    .line 60
    move/from16 v17, v8

    .line 61
    .line 62
    and-int/lit8 v8, v11, 0x1

    .line 63
    .line 64
    if-ne v8, v3, :cond_1

    .line 65
    .line 66
    add-int/lit8 v11, v11, 0x1

    .line 67
    .line 68
    :cond_1
    aget v8, v9, v11

    .line 69
    .line 70
    add-int/2addr v8, v3

    .line 71
    aput v8, v9, v11

    .line 72
    .line 73
    move/from16 v18, v15

    .line 74
    .line 75
    goto/16 :goto_7

    .line 76
    .line 77
    :cond_2
    move/from16 v17, v8

    .line 78
    .line 79
    and-int/lit8 v8, v11, 0x1

    .line 80
    .line 81
    if-nez v8, :cond_c

    .line 82
    .line 83
    if-ne v11, v15, :cond_b

    .line 84
    .line 85
    invoke-static {v9}, Ltj;->d([I)Z

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-eqz v8, :cond_a

    .line 90
    .line 91
    invoke-virtual {v2, v10, v13, v9}, Ltj;->e(II[I)Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_9

    .line 96
    .line 97
    iget-boolean v7, v2, Ltj;->b:Z

    .line 98
    .line 99
    if-eqz v7, :cond_3

    .line 100
    .line 101
    invoke-virtual {v2}, Ltj;->f()Z

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    move/from16 v18, v15

    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-gt v7, v3, :cond_5

    .line 113
    .line 114
    :cond_4
    move/from16 v18, v15

    .line 115
    .line 116
    move/from16 v7, v16

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    const/4 v8, 0x0

    .line 124
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v11

    .line 128
    if-eqz v11, :cond_4

    .line 129
    .line 130
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    check-cast v11, Lni0;

    .line 135
    .line 136
    move/from16 v18, v15

    .line 137
    .line 138
    iget v15, v11, Lni0;->d:I

    .line 139
    .line 140
    if-lt v15, v14, :cond_6

    .line 141
    .line 142
    if-nez v8, :cond_7

    .line 143
    .line 144
    move-object v8, v11

    .line 145
    :cond_6
    move/from16 v15, v18

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_7
    iput-boolean v3, v2, Ltj;->b:Z

    .line 149
    .line 150
    iget v7, v8, Ls42;->a:F

    .line 151
    .line 152
    iget v15, v11, Ls42;->a:F

    .line 153
    .line 154
    sub-float/2addr v7, v15

    .line 155
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    iget v8, v8, Ls42;->b:F

    .line 160
    .line 161
    iget v11, v11, Ls42;->b:F

    .line 162
    .line 163
    sub-float/2addr v8, v11

    .line 164
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    sub-float/2addr v7, v8

    .line 169
    float-to-int v7, v7

    .line 170
    div-int/2addr v7, v14

    .line 171
    :goto_4
    aget v8, v9, v14

    .line 172
    .line 173
    if-le v7, v8, :cond_8

    .line 174
    .line 175
    sub-int/2addr v7, v8

    .line 176
    sub-int/2addr v7, v14

    .line 177
    add-int/2addr v10, v7

    .line 178
    add-int/lit8 v13, v6, -0x1

    .line 179
    .line 180
    :cond_8
    :goto_5
    invoke-static {v9}, Ltj;->b([I)V

    .line 181
    .line 182
    .line 183
    move v7, v14

    .line 184
    move/from16 v11, v16

    .line 185
    .line 186
    goto :goto_7

    .line 187
    :cond_9
    move/from16 v18, v15

    .line 188
    .line 189
    aget v8, v9, v14

    .line 190
    .line 191
    aput v8, v9, v16

    .line 192
    .line 193
    aget v8, v9, v17

    .line 194
    .line 195
    aput v8, v9, v3

    .line 196
    .line 197
    aget v8, v9, v18

    .line 198
    .line 199
    aput v8, v9, v14

    .line 200
    .line 201
    aput v3, v9, v17

    .line 202
    .line 203
    aput v16, v9, v18

    .line 204
    .line 205
    :goto_6
    move/from16 v11, v17

    .line 206
    .line 207
    goto :goto_7

    .line 208
    :cond_a
    move/from16 v18, v15

    .line 209
    .line 210
    aget v8, v9, v14

    .line 211
    .line 212
    aput v8, v9, v16

    .line 213
    .line 214
    aget v8, v9, v17

    .line 215
    .line 216
    aput v8, v9, v3

    .line 217
    .line 218
    aget v8, v9, v18

    .line 219
    .line 220
    aput v8, v9, v14

    .line 221
    .line 222
    aput v3, v9, v17

    .line 223
    .line 224
    aput v16, v9, v18

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_b
    move/from16 v18, v15

    .line 228
    .line 229
    add-int/lit8 v11, v11, 0x1

    .line 230
    .line 231
    aget v8, v9, v11

    .line 232
    .line 233
    add-int/2addr v8, v3

    .line 234
    aput v8, v9, v11

    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_c
    move/from16 v18, v15

    .line 238
    .line 239
    aget v8, v9, v11

    .line 240
    .line 241
    add-int/2addr v8, v3

    .line 242
    aput v8, v9, v11

    .line 243
    .line 244
    :goto_7
    add-int/2addr v13, v3

    .line 245
    move/from16 v8, v17

    .line 246
    .line 247
    move/from16 v15, v18

    .line 248
    .line 249
    goto/16 :goto_2

    .line 250
    .line 251
    :cond_d
    move/from16 v17, v8

    .line 252
    .line 253
    invoke-static {v9}, Ltj;->d([I)Z

    .line 254
    .line 255
    .line 256
    move-result v8

    .line 257
    if-eqz v8, :cond_e

    .line 258
    .line 259
    invoke-virtual {v2, v10, v6, v9}, Ltj;->e(II[I)Z

    .line 260
    .line 261
    .line 262
    move-result v8

    .line 263
    if-eqz v8, :cond_e

    .line 264
    .line 265
    aget v7, v9, v16

    .line 266
    .line 267
    iget-boolean v8, v2, Ltj;->b:Z

    .line 268
    .line 269
    if-eqz v8, :cond_e

    .line 270
    .line 271
    invoke-virtual {v2}, Ltj;->f()Z

    .line 272
    .line 273
    .line 274
    move-result v8

    .line 275
    move v12, v8

    .line 276
    :cond_e
    add-int/2addr v10, v7

    .line 277
    move/from16 v8, v17

    .line 278
    .line 279
    goto/16 :goto_1

    .line 280
    .line 281
    :cond_f
    move/from16 v17, v8

    .line 282
    .line 283
    move/from16 v18, v15

    .line 284
    .line 285
    const/16 v16, 0x0

    .line 286
    .line 287
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    move/from16 v5, v17

    .line 292
    .line 293
    if-lt v2, v5, :cond_3e

    .line 294
    .line 295
    const/4 v7, 0x0

    .line 296
    if-le v2, v5, :cond_12

    .line 297
    .line 298
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 299
    .line 300
    .line 301
    move-result-object v5

    .line 302
    move v8, v7

    .line 303
    move v9, v8

    .line 304
    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 305
    .line 306
    .line 307
    move-result v10

    .line 308
    if-eqz v10, :cond_10

    .line 309
    .line 310
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v10

    .line 314
    check-cast v10, Lni0;

    .line 315
    .line 316
    iget v10, v10, Lni0;->c:F

    .line 317
    .line 318
    add-float/2addr v8, v10

    .line 319
    mul-float/2addr v10, v10

    .line 320
    add-float/2addr v9, v10

    .line 321
    goto :goto_8

    .line 322
    :cond_10
    int-to-float v2, v2

    .line 323
    div-float/2addr v8, v2

    .line 324
    div-float/2addr v9, v2

    .line 325
    mul-float v2, v8, v8

    .line 326
    .line 327
    sub-float/2addr v9, v2

    .line 328
    float-to-double v9, v9

    .line 329
    invoke-static {v9, v10}, Ljava/lang/Math;->sqrt(D)D

    .line 330
    .line 331
    .line 332
    move-result-wide v9

    .line 333
    double-to-float v2, v9

    .line 334
    new-instance v5, Loi0;

    .line 335
    .line 336
    invoke-direct {v5, v8, v3}, Loi0;-><init>(FI)V

    .line 337
    .line 338
    .line 339
    invoke-static {v4, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 340
    .line 341
    .line 342
    const v5, 0x3e4ccccd    # 0.2f

    .line 343
    .line 344
    .line 345
    mul-float/2addr v5, v8

    .line 346
    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    .line 347
    .line 348
    .line 349
    move-result v2

    .line 350
    move/from16 v5, v16

    .line 351
    .line 352
    :goto_9
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 353
    .line 354
    .line 355
    move-result v9

    .line 356
    if-ge v5, v9, :cond_12

    .line 357
    .line 358
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 359
    .line 360
    .line 361
    move-result v9

    .line 362
    const/4 v10, 0x3

    .line 363
    if-le v9, v10, :cond_12

    .line 364
    .line 365
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v9

    .line 369
    check-cast v9, Lni0;

    .line 370
    .line 371
    iget v9, v9, Lni0;->c:F

    .line 372
    .line 373
    sub-float/2addr v9, v8

    .line 374
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 375
    .line 376
    .line 377
    move-result v9

    .line 378
    cmpl-float v9, v9, v2

    .line 379
    .line 380
    if-lez v9, :cond_11

    .line 381
    .line 382
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    add-int/lit8 v5, v5, -0x1

    .line 386
    .line 387
    :cond_11
    add-int/2addr v5, v3

    .line 388
    goto :goto_9

    .line 389
    :cond_12
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    const/4 v5, 0x3

    .line 394
    if-le v2, v5, :cond_14

    .line 395
    .line 396
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    move v5, v7

    .line 401
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 402
    .line 403
    .line 404
    move-result v8

    .line 405
    if-eqz v8, :cond_13

    .line 406
    .line 407
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v8

    .line 411
    check-cast v8, Lni0;

    .line 412
    .line 413
    iget v8, v8, Lni0;->c:F

    .line 414
    .line 415
    add-float/2addr v5, v8

    .line 416
    goto :goto_a

    .line 417
    :cond_13
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    int-to-float v2, v2

    .line 422
    div-float/2addr v5, v2

    .line 423
    new-instance v2, Loi0;

    .line 424
    .line 425
    move/from16 v8, v16

    .line 426
    .line 427
    invoke-direct {v2, v5, v8}, Loi0;-><init>(FI)V

    .line 428
    .line 429
    .line 430
    invoke-static {v4, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    const/4 v5, 0x3

    .line 438
    invoke-virtual {v4, v5, v2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 443
    .line 444
    .line 445
    goto :goto_b

    .line 446
    :cond_14
    move/from16 v8, v16

    .line 447
    .line 448
    :goto_b
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    check-cast v2, Lni0;

    .line 453
    .line 454
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v5

    .line 458
    check-cast v5, Lni0;

    .line 459
    .line 460
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    check-cast v4, Lni0;

    .line 465
    .line 466
    filled-new-array {v2, v5, v4}, [Lni0;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    aget-object v4, v2, v8

    .line 471
    .line 472
    aget-object v5, v2, v3

    .line 473
    .line 474
    invoke-static {v4, v5}, Ls42;->a(Ls42;Ls42;)F

    .line 475
    .line 476
    .line 477
    move-result v4

    .line 478
    aget-object v5, v2, v3

    .line 479
    .line 480
    aget-object v9, v2, v14

    .line 481
    .line 482
    invoke-static {v5, v9}, Ls42;->a(Ls42;Ls42;)F

    .line 483
    .line 484
    .line 485
    move-result v5

    .line 486
    aget-object v9, v2, v8

    .line 487
    .line 488
    aget-object v10, v2, v14

    .line 489
    .line 490
    invoke-static {v9, v10}, Ls42;->a(Ls42;Ls42;)F

    .line 491
    .line 492
    .line 493
    move-result v9

    .line 494
    cmpl-float v10, v5, v4

    .line 495
    .line 496
    if-ltz v10, :cond_15

    .line 497
    .line 498
    cmpl-float v10, v5, v9

    .line 499
    .line 500
    if-ltz v10, :cond_15

    .line 501
    .line 502
    aget-object v4, v2, v8

    .line 503
    .line 504
    aget-object v5, v2, v3

    .line 505
    .line 506
    aget-object v9, v2, v14

    .line 507
    .line 508
    goto :goto_c

    .line 509
    :cond_15
    cmpl-float v5, v9, v5

    .line 510
    .line 511
    if-ltz v5, :cond_16

    .line 512
    .line 513
    cmpl-float v4, v9, v4

    .line 514
    .line 515
    if-ltz v4, :cond_16

    .line 516
    .line 517
    aget-object v4, v2, v3

    .line 518
    .line 519
    aget-object v5, v2, v8

    .line 520
    .line 521
    aget-object v9, v2, v14

    .line 522
    .line 523
    goto :goto_c

    .line 524
    :cond_16
    aget-object v4, v2, v14

    .line 525
    .line 526
    aget-object v5, v2, v8

    .line 527
    .line 528
    aget-object v9, v2, v3

    .line 529
    .line 530
    :goto_c
    iget v8, v4, Ls42;->a:F

    .line 531
    .line 532
    iget v10, v4, Ls42;->b:F

    .line 533
    .line 534
    iget v11, v9, Ls42;->a:F

    .line 535
    .line 536
    sub-float/2addr v11, v8

    .line 537
    iget v12, v5, Ls42;->b:F

    .line 538
    .line 539
    sub-float/2addr v12, v10

    .line 540
    mul-float/2addr v12, v11

    .line 541
    iget v11, v9, Ls42;->b:F

    .line 542
    .line 543
    sub-float/2addr v11, v10

    .line 544
    iget v13, v5, Ls42;->a:F

    .line 545
    .line 546
    sub-float/2addr v13, v8

    .line 547
    mul-float/2addr v13, v11

    .line 548
    sub-float/2addr v12, v13

    .line 549
    cmpg-float v8, v12, v7

    .line 550
    .line 551
    if-gez v8, :cond_17

    .line 552
    .line 553
    move-object/from16 v16, v9

    .line 554
    .line 555
    move-object v9, v5

    .line 556
    move-object/from16 v5, v16

    .line 557
    .line 558
    :cond_17
    const/16 v16, 0x0

    .line 559
    .line 560
    aput-object v5, v2, v16

    .line 561
    .line 562
    aput-object v4, v2, v3

    .line 563
    .line 564
    aput-object v9, v2, v14

    .line 565
    .line 566
    invoke-virtual {v0, v4, v9}, Ld52;->A(Lni0;Lni0;)F

    .line 567
    .line 568
    .line 569
    move-result v2

    .line 570
    iget v8, v4, Ls42;->a:F

    .line 571
    .line 572
    iget v11, v9, Ls42;->b:F

    .line 573
    .line 574
    iget v12, v9, Ls42;->a:F

    .line 575
    .line 576
    invoke-virtual {v0, v4, v5}, Ld52;->A(Lni0;Lni0;)F

    .line 577
    .line 578
    .line 579
    move-result v13

    .line 580
    iget v15, v5, Ls42;->b:F

    .line 581
    .line 582
    move/from16 v19, v7

    .line 583
    .line 584
    iget v7, v5, Ls42;->a:F

    .line 585
    .line 586
    add-float/2addr v13, v2

    .line 587
    const/high16 v2, 0x40000000    # 2.0f

    .line 588
    .line 589
    div-float/2addr v13, v2

    .line 590
    const/high16 v2, 0x3f800000    # 1.0f

    .line 591
    .line 592
    cmpg-float v20, v13, v2

    .line 593
    .line 594
    if-ltz v20, :cond_3d

    .line 595
    .line 596
    invoke-static {v4, v9}, Ls42;->a(Ls42;Ls42;)F

    .line 597
    .line 598
    .line 599
    move-result v20

    .line 600
    div-float v20, v20, v13

    .line 601
    .line 602
    cmpg-float v21, v20, v19

    .line 603
    .line 604
    const/high16 v22, -0x41000000    # -0.5f

    .line 605
    .line 606
    const/high16 v23, 0x3f000000    # 0.5f

    .line 607
    .line 608
    if-gez v21, :cond_18

    .line 609
    .line 610
    move/from16 v21, v22

    .line 611
    .line 612
    :goto_d
    move/from16 v24, v2

    .line 613
    .line 614
    goto :goto_e

    .line 615
    :cond_18
    move/from16 v21, v23

    .line 616
    .line 617
    goto :goto_d

    .line 618
    :goto_e
    add-float v2, v20, v21

    .line 619
    .line 620
    float-to-int v2, v2

    .line 621
    invoke-static {v4, v5}, Ls42;->a(Ls42;Ls42;)F

    .line 622
    .line 623
    .line 624
    move-result v20

    .line 625
    div-float v20, v20, v13

    .line 626
    .line 627
    cmpg-float v21, v20, v19

    .line 628
    .line 629
    if-gez v21, :cond_19

    .line 630
    .line 631
    goto :goto_f

    .line 632
    :cond_19
    move/from16 v22, v23

    .line 633
    .line 634
    :goto_f
    add-float v3, v20, v22

    .line 635
    .line 636
    float-to-int v3, v3

    .line 637
    add-int/2addr v3, v2

    .line 638
    div-int/2addr v3, v14

    .line 639
    add-int/lit8 v2, v3, 0x7

    .line 640
    .line 641
    move/from16 v20, v2

    .line 642
    .line 643
    and-int/lit8 v2, v20, 0x3

    .line 644
    .line 645
    if-eqz v2, :cond_1c

    .line 646
    .line 647
    if-eq v2, v14, :cond_1b

    .line 648
    .line 649
    move/from16 v22, v14

    .line 650
    .line 651
    const/4 v14, 0x3

    .line 652
    if-eq v2, v14, :cond_1a

    .line 653
    .line 654
    move/from16 v2, v20

    .line 655
    .line 656
    goto :goto_10

    .line 657
    :cond_1a
    sget-object v0, Lun1;->c:Lun1;

    .line 658
    .line 659
    throw v0

    .line 660
    :cond_1b
    move/from16 v22, v14

    .line 661
    .line 662
    add-int/lit8 v2, v3, 0x6

    .line 663
    .line 664
    goto :goto_10

    .line 665
    :cond_1c
    move/from16 v22, v14

    .line 666
    .line 667
    add-int/lit8 v2, v3, 0x8

    .line 668
    .line 669
    :goto_10
    sget-object v3, Lf23;->e:[I

    .line 670
    .line 671
    rem-int/lit8 v3, v2, 0x4

    .line 672
    .line 673
    const/4 v14, 0x1

    .line 674
    if-ne v3, v14, :cond_3c

    .line 675
    .line 676
    add-int/lit8 v3, v2, -0x11

    .line 677
    .line 678
    :try_start_0
    div-int/lit8 v3, v3, 0x4

    .line 679
    .line 680
    invoke-static {v3}, Lf23;->c(I)Lf23;

    .line 681
    .line 682
    .line 683
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_5

    .line 684
    iget v14, v3, Lf23;->a:I

    .line 685
    .line 686
    mul-int/lit8 v14, v14, 0x4

    .line 687
    .line 688
    add-int/lit8 v14, v14, 0xa

    .line 689
    .line 690
    iget-object v3, v3, Lf23;->b:[I

    .line 691
    .line 692
    array-length v3, v3

    .line 693
    const/high16 v20, 0x40400000    # 3.0f

    .line 694
    .line 695
    if-lez v3, :cond_1d

    .line 696
    .line 697
    sub-float v3, v12, v8

    .line 698
    .line 699
    add-float/2addr v3, v7

    .line 700
    sub-float v25, v11, v10

    .line 701
    .line 702
    move/from16 v26, v7

    .line 703
    .line 704
    add-float v7, v25, v15

    .line 705
    .line 706
    int-to-float v14, v14

    .line 707
    div-float v14, v20, v14

    .line 708
    .line 709
    sub-float v14, v24, v14

    .line 710
    .line 711
    invoke-static {v3, v8, v14, v8}, Len;->g(FFFF)F

    .line 712
    .line 713
    .line 714
    move-result v3

    .line 715
    float-to-int v3, v3

    .line 716
    invoke-static {v7, v10, v14, v10}, Len;->g(FFFF)F

    .line 717
    .line 718
    .line 719
    move-result v7

    .line 720
    float-to-int v7, v7

    .line 721
    move/from16 v24, v8

    .line 722
    .line 723
    move/from16 v14, v18

    .line 724
    .line 725
    :goto_11
    const/16 v8, 0x10

    .line 726
    .line 727
    if-gt v14, v8, :cond_1e

    .line 728
    .line 729
    int-to-float v8, v14

    .line 730
    :try_start_1
    invoke-virtual {v0, v13, v8, v3, v7}, Ld52;->C(FFII)Lq7;

    .line 731
    .line 732
    .line 733
    move-result-object v0
    :try_end_1
    .catch Lun1; {:try_start_1 .. :try_end_1} :catch_0

    .line 734
    goto :goto_12

    .line 735
    :catch_0
    shl-int/lit8 v14, v14, 0x1

    .line 736
    .line 737
    goto :goto_11

    .line 738
    :cond_1d
    move/from16 v26, v7

    .line 739
    .line 740
    move/from16 v24, v8

    .line 741
    .line 742
    :cond_1e
    const/4 v0, 0x0

    .line 743
    :goto_12
    int-to-float v3, v2

    .line 744
    const/high16 v7, 0x40600000    # 3.5f

    .line 745
    .line 746
    sub-float v29, v3, v7

    .line 747
    .line 748
    if-eqz v0, :cond_1f

    .line 749
    .line 750
    iget v3, v0, Ls42;->a:F

    .line 751
    .line 752
    iget v7, v0, Ls42;->b:F

    .line 753
    .line 754
    sub-float v8, v29, v20

    .line 755
    .line 756
    move/from16 v31, v8

    .line 757
    .line 758
    :goto_13
    move/from16 v35, v7

    .line 759
    .line 760
    goto :goto_14

    .line 761
    :cond_1f
    sub-float v12, v12, v24

    .line 762
    .line 763
    add-float v3, v12, v26

    .line 764
    .line 765
    sub-float/2addr v11, v10

    .line 766
    add-float v7, v11, v15

    .line 767
    .line 768
    move/from16 v31, v29

    .line 769
    .line 770
    goto :goto_13

    .line 771
    :goto_14
    iget v7, v4, Ls42;->a:F

    .line 772
    .line 773
    iget v8, v4, Ls42;->b:F

    .line 774
    .line 775
    iget v10, v9, Ls42;->a:F

    .line 776
    .line 777
    iget v11, v9, Ls42;->b:F

    .line 778
    .line 779
    iget v12, v5, Ls42;->a:F

    .line 780
    .line 781
    iget v13, v5, Ls42;->b:F

    .line 782
    .line 783
    const/high16 v27, 0x40600000    # 3.5f

    .line 784
    .line 785
    const/high16 v28, 0x40600000    # 3.5f

    .line 786
    .line 787
    const/high16 v30, 0x40600000    # 3.5f

    .line 788
    .line 789
    const/high16 v33, 0x40600000    # 3.5f

    .line 790
    .line 791
    move/from16 v32, v31

    .line 792
    .line 793
    move/from16 v34, v29

    .line 794
    .line 795
    invoke-static/range {v27 .. v34}, Lyr1;->a(FFFFFFFF)Lyr1;

    .line 796
    .line 797
    .line 798
    move-result-object v14

    .line 799
    iget v15, v14, Lyr1;->e:F

    .line 800
    .line 801
    move-object/from16 v20, v0

    .line 802
    .line 803
    iget v0, v14, Lyr1;->i:F

    .line 804
    .line 805
    mul-float v24, v15, v0

    .line 806
    .line 807
    move/from16 v25, v0

    .line 808
    .line 809
    iget v0, v14, Lyr1;->f:F

    .line 810
    .line 811
    move/from16 v26, v0

    .line 812
    .line 813
    iget v0, v14, Lyr1;->h:F

    .line 814
    .line 815
    mul-float v27, v26, v0

    .line 816
    .line 817
    sub-float v24, v24, v27

    .line 818
    .line 819
    move/from16 v27, v0

    .line 820
    .line 821
    iget v0, v14, Lyr1;->g:F

    .line 822
    .line 823
    mul-float v28, v26, v0

    .line 824
    .line 825
    move/from16 v29, v0

    .line 826
    .line 827
    iget v0, v14, Lyr1;->d:F

    .line 828
    .line 829
    mul-float v30, v0, v25

    .line 830
    .line 831
    sub-float v28, v28, v30

    .line 832
    .line 833
    mul-float v30, v0, v27

    .line 834
    .line 835
    mul-float v31, v15, v29

    .line 836
    .line 837
    sub-float v38, v30, v31

    .line 838
    .line 839
    move/from16 v30, v0

    .line 840
    .line 841
    iget v0, v14, Lyr1;->c:F

    .line 842
    .line 843
    mul-float v31, v0, v27

    .line 844
    .line 845
    move/from16 v32, v0

    .line 846
    .line 847
    iget v0, v14, Lyr1;->b:F

    .line 848
    .line 849
    mul-float v33, v0, v25

    .line 850
    .line 851
    sub-float v39, v31, v33

    .line 852
    .line 853
    iget v14, v14, Lyr1;->a:F

    .line 854
    .line 855
    mul-float v25, v25, v14

    .line 856
    .line 857
    mul-float v31, v32, v29

    .line 858
    .line 859
    sub-float v25, v25, v31

    .line 860
    .line 861
    mul-float v29, v29, v0

    .line 862
    .line 863
    mul-float v27, v27, v14

    .line 864
    .line 865
    sub-float v29, v29, v27

    .line 866
    .line 867
    mul-float v27, v0, v26

    .line 868
    .line 869
    mul-float v31, v32, v15

    .line 870
    .line 871
    sub-float v27, v27, v31

    .line 872
    .line 873
    mul-float v31, v32, v30

    .line 874
    .line 875
    mul-float v26, v26, v14

    .line 876
    .line 877
    sub-float v26, v31, v26

    .line 878
    .line 879
    mul-float/2addr v14, v15

    .line 880
    mul-float v0, v0, v30

    .line 881
    .line 882
    sub-float/2addr v14, v0

    .line 883
    move/from16 v34, v3

    .line 884
    .line 885
    move/from16 v30, v7

    .line 886
    .line 887
    move/from16 v31, v8

    .line 888
    .line 889
    move/from16 v32, v10

    .line 890
    .line 891
    move/from16 v33, v11

    .line 892
    .line 893
    move/from16 v36, v12

    .line 894
    .line 895
    move/from16 v37, v13

    .line 896
    .line 897
    invoke-static/range {v30 .. v37}, Lyr1;->a(FFFFFFFF)Lyr1;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    iget v3, v0, Lyr1;->a:F

    .line 902
    .line 903
    mul-float v7, v3, v24

    .line 904
    .line 905
    iget v8, v0, Lyr1;->d:F

    .line 906
    .line 907
    mul-float v10, v8, v39

    .line 908
    .line 909
    add-float/2addr v10, v7

    .line 910
    iget v7, v0, Lyr1;->g:F

    .line 911
    .line 912
    mul-float v11, v7, v27

    .line 913
    .line 914
    add-float/2addr v11, v10

    .line 915
    mul-float v10, v3, v28

    .line 916
    .line 917
    mul-float v12, v8, v25

    .line 918
    .line 919
    add-float/2addr v12, v10

    .line 920
    mul-float v10, v7, v26

    .line 921
    .line 922
    add-float/2addr v10, v12

    .line 923
    mul-float v3, v3, v38

    .line 924
    .line 925
    mul-float v8, v8, v29

    .line 926
    .line 927
    add-float/2addr v8, v3

    .line 928
    mul-float/2addr v7, v14

    .line 929
    add-float/2addr v7, v8

    .line 930
    iget v3, v0, Lyr1;->b:F

    .line 931
    .line 932
    mul-float v8, v3, v24

    .line 933
    .line 934
    iget v12, v0, Lyr1;->e:F

    .line 935
    .line 936
    mul-float v13, v12, v39

    .line 937
    .line 938
    add-float/2addr v13, v8

    .line 939
    iget v8, v0, Lyr1;->h:F

    .line 940
    .line 941
    mul-float v15, v8, v27

    .line 942
    .line 943
    add-float/2addr v15, v13

    .line 944
    mul-float v13, v3, v28

    .line 945
    .line 946
    mul-float v30, v12, v25

    .line 947
    .line 948
    add-float v30, v30, v13

    .line 949
    .line 950
    mul-float v13, v8, v26

    .line 951
    .line 952
    add-float v13, v13, v30

    .line 953
    .line 954
    mul-float v3, v3, v38

    .line 955
    .line 956
    mul-float v12, v12, v29

    .line 957
    .line 958
    add-float/2addr v12, v3

    .line 959
    mul-float/2addr v8, v14

    .line 960
    add-float/2addr v8, v12

    .line 961
    iget v3, v0, Lyr1;->c:F

    .line 962
    .line 963
    mul-float v24, v24, v3

    .line 964
    .line 965
    iget v12, v0, Lyr1;->f:F

    .line 966
    .line 967
    mul-float v39, v39, v12

    .line 968
    .line 969
    add-float v39, v39, v24

    .line 970
    .line 971
    iget v0, v0, Lyr1;->i:F

    .line 972
    .line 973
    mul-float v27, v27, v0

    .line 974
    .line 975
    add-float v27, v27, v39

    .line 976
    .line 977
    mul-float v28, v28, v3

    .line 978
    .line 979
    mul-float v25, v25, v12

    .line 980
    .line 981
    add-float v25, v25, v28

    .line 982
    .line 983
    mul-float v26, v26, v0

    .line 984
    .line 985
    add-float v26, v26, v25

    .line 986
    .line 987
    mul-float v3, v3, v38

    .line 988
    .line 989
    mul-float v12, v12, v29

    .line 990
    .line 991
    add-float/2addr v12, v3

    .line 992
    mul-float/2addr v0, v14

    .line 993
    add-float/2addr v0, v12

    .line 994
    if-lez v2, :cond_3b

    .line 995
    .line 996
    if-lez v2, :cond_3b

    .line 997
    .line 998
    new-instance v3, Lsj;

    .line 999
    .line 1000
    invoke-direct {v3, v2, v2}, Lsj;-><init>(II)V

    .line 1001
    .line 1002
    .line 1003
    mul-int/lit8 v12, v2, 0x2

    .line 1004
    .line 1005
    new-array v14, v12, [F

    .line 1006
    .line 1007
    move/from16 v24, v0

    .line 1008
    .line 1009
    const/4 v0, 0x0

    .line 1010
    :goto_15
    if-ge v0, v2, :cond_30

    .line 1011
    .line 1012
    move/from16 v25, v2

    .line 1013
    .line 1014
    int-to-float v2, v0

    .line 1015
    add-float v2, v2, v23

    .line 1016
    .line 1017
    move/from16 v28, v2

    .line 1018
    .line 1019
    const/4 v2, 0x0

    .line 1020
    :goto_16
    if-ge v2, v12, :cond_20

    .line 1021
    .line 1022
    move/from16 v29, v2

    .line 1023
    .line 1024
    div-int/lit8 v2, v29, 0x2

    .line 1025
    .line 1026
    int-to-float v2, v2

    .line 1027
    add-float v2, v2, v23

    .line 1028
    .line 1029
    aput v2, v14, v29

    .line 1030
    .line 1031
    add-int/lit8 v2, v29, 0x1

    .line 1032
    .line 1033
    aput v28, v14, v2

    .line 1034
    .line 1035
    add-int/lit8 v2, v29, 0x2

    .line 1036
    .line 1037
    goto :goto_16

    .line 1038
    :cond_20
    const/4 v2, 0x0

    .line 1039
    :goto_17
    if-ge v2, v12, :cond_21

    .line 1040
    .line 1041
    aget v28, v14, v2

    .line 1042
    .line 1043
    add-int/lit8 v29, v2, 0x1

    .line 1044
    .line 1045
    aget v30, v14, v29

    .line 1046
    .line 1047
    mul-float v31, v27, v28

    .line 1048
    .line 1049
    mul-float v32, v26, v30

    .line 1050
    .line 1051
    add-float v32, v32, v31

    .line 1052
    .line 1053
    add-float v32, v32, v24

    .line 1054
    .line 1055
    mul-float v31, v11, v28

    .line 1056
    .line 1057
    mul-float v33, v10, v30

    .line 1058
    .line 1059
    add-float v33, v33, v31

    .line 1060
    .line 1061
    add-float v33, v33, v7

    .line 1062
    .line 1063
    div-float v33, v33, v32

    .line 1064
    .line 1065
    aput v33, v14, v2

    .line 1066
    .line 1067
    mul-float v28, v28, v15

    .line 1068
    .line 1069
    mul-float v30, v30, v13

    .line 1070
    .line 1071
    add-float v30, v30, v28

    .line 1072
    .line 1073
    add-float v30, v30, v8

    .line 1074
    .line 1075
    div-float v30, v30, v32

    .line 1076
    .line 1077
    aput v30, v14, v29

    .line 1078
    .line 1079
    add-int/lit8 v2, v2, 0x2

    .line 1080
    .line 1081
    goto :goto_17

    .line 1082
    :cond_21
    iget v2, v1, Lsj;->b:I

    .line 1083
    .line 1084
    move-object/from16 v28, v4

    .line 1085
    .line 1086
    move-object/from16 v30, v5

    .line 1087
    .line 1088
    const/4 v4, 0x0

    .line 1089
    const/16 v29, 0x1

    .line 1090
    .line 1091
    :goto_18
    if-ge v4, v12, :cond_27

    .line 1092
    .line 1093
    if-eqz v29, :cond_27

    .line 1094
    .line 1095
    aget v5, v14, v4

    .line 1096
    .line 1097
    float-to-int v5, v5

    .line 1098
    add-int/lit8 v31, v4, 0x1

    .line 1099
    .line 1100
    move/from16 v32, v4

    .line 1101
    .line 1102
    aget v4, v14, v31

    .line 1103
    .line 1104
    float-to-int v4, v4

    .line 1105
    move/from16 v33, v7

    .line 1106
    .line 1107
    const/4 v7, -0x1

    .line 1108
    if-lt v5, v7, :cond_26

    .line 1109
    .line 1110
    if-gt v5, v6, :cond_26

    .line 1111
    .line 1112
    if-lt v4, v7, :cond_26

    .line 1113
    .line 1114
    if-gt v4, v2, :cond_26

    .line 1115
    .line 1116
    if-ne v5, v7, :cond_22

    .line 1117
    .line 1118
    aput v19, v14, v32

    .line 1119
    .line 1120
    :goto_19
    const/4 v5, 0x1

    .line 1121
    goto :goto_1a

    .line 1122
    :cond_22
    if-ne v5, v6, :cond_23

    .line 1123
    .line 1124
    add-int/lit8 v5, v6, -0x1

    .line 1125
    .line 1126
    int-to-float v5, v5

    .line 1127
    aput v5, v14, v32

    .line 1128
    .line 1129
    goto :goto_19

    .line 1130
    :cond_23
    const/4 v5, 0x0

    .line 1131
    :goto_1a
    if-ne v4, v7, :cond_24

    .line 1132
    .line 1133
    aput v19, v14, v31

    .line 1134
    .line 1135
    :goto_1b
    const/16 v29, 0x1

    .line 1136
    .line 1137
    goto :goto_1c

    .line 1138
    :cond_24
    if-ne v4, v2, :cond_25

    .line 1139
    .line 1140
    add-int/lit8 v4, v2, -0x1

    .line 1141
    .line 1142
    int-to-float v4, v4

    .line 1143
    aput v4, v14, v31

    .line 1144
    .line 1145
    goto :goto_1b

    .line 1146
    :cond_25
    move/from16 v29, v5

    .line 1147
    .line 1148
    :goto_1c
    add-int/lit8 v4, v32, 0x2

    .line 1149
    .line 1150
    move/from16 v7, v33

    .line 1151
    .line 1152
    goto :goto_18

    .line 1153
    :cond_26
    sget-object v0, Lun1;->c:Lun1;

    .line 1154
    .line 1155
    throw v0

    .line 1156
    :cond_27
    move/from16 v33, v7

    .line 1157
    .line 1158
    add-int/lit8 v4, v12, -0x2

    .line 1159
    .line 1160
    const/4 v5, 0x1

    .line 1161
    :goto_1d
    if-ltz v4, :cond_2d

    .line 1162
    .line 1163
    if-eqz v5, :cond_2d

    .line 1164
    .line 1165
    aget v5, v14, v4

    .line 1166
    .line 1167
    float-to-int v5, v5

    .line 1168
    add-int/lit8 v7, v4, 0x1

    .line 1169
    .line 1170
    move/from16 v31, v4

    .line 1171
    .line 1172
    aget v4, v14, v7

    .line 1173
    .line 1174
    float-to-int v4, v4

    .line 1175
    move/from16 v32, v7

    .line 1176
    .line 1177
    const/4 v7, -0x1

    .line 1178
    if-lt v5, v7, :cond_2c

    .line 1179
    .line 1180
    if-gt v5, v6, :cond_2c

    .line 1181
    .line 1182
    if-lt v4, v7, :cond_2c

    .line 1183
    .line 1184
    if-gt v4, v2, :cond_2c

    .line 1185
    .line 1186
    if-ne v5, v7, :cond_28

    .line 1187
    .line 1188
    aput v19, v14, v31

    .line 1189
    .line 1190
    :goto_1e
    const/4 v5, 0x1

    .line 1191
    goto :goto_1f

    .line 1192
    :cond_28
    if-ne v5, v6, :cond_29

    .line 1193
    .line 1194
    add-int/lit8 v5, v6, -0x1

    .line 1195
    .line 1196
    int-to-float v5, v5

    .line 1197
    aput v5, v14, v31

    .line 1198
    .line 1199
    goto :goto_1e

    .line 1200
    :cond_29
    const/4 v5, 0x0

    .line 1201
    :goto_1f
    if-ne v4, v7, :cond_2a

    .line 1202
    .line 1203
    aput v19, v14, v32

    .line 1204
    .line 1205
    :goto_20
    const/4 v5, 0x1

    .line 1206
    goto :goto_21

    .line 1207
    :cond_2a
    if-ne v4, v2, :cond_2b

    .line 1208
    .line 1209
    add-int/lit8 v4, v2, -0x1

    .line 1210
    .line 1211
    int-to-float v4, v4

    .line 1212
    aput v4, v14, v32

    .line 1213
    .line 1214
    goto :goto_20

    .line 1215
    :cond_2b
    :goto_21
    add-int/lit8 v4, v31, -0x2

    .line 1216
    .line 1217
    goto :goto_1d

    .line 1218
    :cond_2c
    sget-object v0, Lun1;->c:Lun1;

    .line 1219
    .line 1220
    throw v0

    .line 1221
    :cond_2d
    const/4 v2, 0x0

    .line 1222
    :goto_22
    if-ge v2, v12, :cond_2f

    .line 1223
    .line 1224
    :try_start_2
    aget v4, v14, v2

    .line 1225
    .line 1226
    float-to-int v4, v4

    .line 1227
    add-int/lit8 v5, v2, 0x1

    .line 1228
    .line 1229
    aget v5, v14, v5

    .line 1230
    .line 1231
    float-to-int v5, v5

    .line 1232
    invoke-virtual {v1, v4, v5}, Lsj;->b(II)Z

    .line 1233
    .line 1234
    .line 1235
    move-result v4

    .line 1236
    if-eqz v4, :cond_2e

    .line 1237
    .line 1238
    div-int/lit8 v4, v2, 0x2

    .line 1239
    .line 1240
    invoke-virtual {v3, v4, v0}, Lsj;->c(II)V
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    .line 1241
    .line 1242
    .line 1243
    :cond_2e
    add-int/lit8 v2, v2, 0x2

    .line 1244
    .line 1245
    goto :goto_22

    .line 1246
    :catch_1
    sget-object v0, Lun1;->c:Lun1;

    .line 1247
    .line 1248
    throw v0

    .line 1249
    :cond_2f
    add-int/lit8 v0, v0, 0x1

    .line 1250
    .line 1251
    move/from16 v2, v25

    .line 1252
    .line 1253
    move-object/from16 v4, v28

    .line 1254
    .line 1255
    move-object/from16 v5, v30

    .line 1256
    .line 1257
    move/from16 v7, v33

    .line 1258
    .line 1259
    goto/16 :goto_15

    .line 1260
    .line 1261
    :cond_30
    move-object/from16 v28, v4

    .line 1262
    .line 1263
    move-object/from16 v30, v5

    .line 1264
    .line 1265
    if-nez v20, :cond_31

    .line 1266
    .line 1267
    const/4 v5, 0x3

    .line 1268
    new-array v0, v5, [Ls42;

    .line 1269
    .line 1270
    const/4 v8, 0x0

    .line 1271
    aput-object v30, v0, v8

    .line 1272
    .line 1273
    const/16 v21, 0x1

    .line 1274
    .line 1275
    aput-object v28, v0, v21

    .line 1276
    .line 1277
    aput-object v9, v0, v22

    .line 1278
    .line 1279
    :goto_23
    move-object v1, v0

    .line 1280
    move-object/from16 v0, p0

    .line 1281
    .line 1282
    goto :goto_24

    .line 1283
    :cond_31
    move/from16 v0, v18

    .line 1284
    .line 1285
    const/4 v5, 0x3

    .line 1286
    const/4 v8, 0x0

    .line 1287
    const/16 v21, 0x1

    .line 1288
    .line 1289
    new-array v0, v0, [Ls42;

    .line 1290
    .line 1291
    aput-object v30, v0, v8

    .line 1292
    .line 1293
    aput-object v28, v0, v21

    .line 1294
    .line 1295
    aput-object v9, v0, v22

    .line 1296
    .line 1297
    aput-object v20, v0, v5

    .line 1298
    .line 1299
    goto :goto_23

    .line 1300
    :goto_24
    iget-object v2, v0, La02;->a:Lqc3;

    .line 1301
    .line 1302
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1303
    .line 1304
    .line 1305
    new-instance v4, Ltj;

    .line 1306
    .line 1307
    invoke-direct {v4, v3, v8}, Ltj;-><init>(Lsj;I)V

    .line 1308
    .line 1309
    .line 1310
    const/16 v3, 0x1c

    .line 1311
    .line 1312
    :try_start_3
    invoke-virtual {v2, v4}, Lqc3;->g(Ltj;)Ll50;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v0
    :try_end_3
    .catch Lyl0; {:try_start_3 .. :try_end_3} :catch_3
    .catch Lxt; {:try_start_3 .. :try_end_3} :catch_2

    .line 1316
    goto :goto_28

    .line 1317
    :catch_2
    move-exception v0

    .line 1318
    move-object v5, v0

    .line 1319
    const/4 v0, 0x0

    .line 1320
    goto :goto_25

    .line 1321
    :catch_3
    move-exception v0

    .line 1322
    const/4 v5, 0x0

    .line 1323
    :goto_25
    :try_start_4
    invoke-virtual {v4}, Ltj;->l()V

    .line 1324
    .line 1325
    .line 1326
    const/4 v6, 0x0

    .line 1327
    iput-object v6, v4, Ltj;->c:Ljava/lang/Object;

    .line 1328
    .line 1329
    iput-object v6, v4, Ltj;->d:Ljava/lang/Object;

    .line 1330
    .line 1331
    const/4 v14, 0x1

    .line 1332
    iput-boolean v14, v4, Ltj;->b:Z

    .line 1333
    .line 1334
    invoke-virtual {v4}, Ltj;->k()Lf23;

    .line 1335
    .line 1336
    .line 1337
    invoke-virtual {v4}, Ltj;->j()Lzl0;

    .line 1338
    .line 1339
    .line 1340
    iget-object v6, v4, Ltj;->a:Ljava/lang/Object;

    .line 1341
    .line 1342
    check-cast v6, Lsj;

    .line 1343
    .line 1344
    const/4 v8, 0x0

    .line 1345
    :goto_26
    iget v7, v6, Lsj;->a:I

    .line 1346
    .line 1347
    if-ge v8, v7, :cond_34

    .line 1348
    .line 1349
    add-int/lit8 v7, v8, 0x1

    .line 1350
    .line 1351
    move v9, v7

    .line 1352
    :goto_27
    iget v10, v6, Lsj;->b:I

    .line 1353
    .line 1354
    if-ge v9, v10, :cond_33

    .line 1355
    .line 1356
    invoke-virtual {v6, v8, v9}, Lsj;->b(II)Z

    .line 1357
    .line 1358
    .line 1359
    move-result v10

    .line 1360
    invoke-virtual {v6, v9, v8}, Lsj;->b(II)Z

    .line 1361
    .line 1362
    .line 1363
    move-result v11

    .line 1364
    if-eq v10, v11, :cond_32

    .line 1365
    .line 1366
    invoke-virtual {v6, v9, v8}, Lsj;->a(II)V

    .line 1367
    .line 1368
    .line 1369
    invoke-virtual {v6, v8, v9}, Lsj;->a(II)V

    .line 1370
    .line 1371
    .line 1372
    :cond_32
    add-int/lit8 v9, v9, 0x1

    .line 1373
    .line 1374
    goto :goto_27

    .line 1375
    :cond_33
    move v8, v7

    .line 1376
    goto :goto_26

    .line 1377
    :cond_34
    invoke-virtual {v2, v4}, Lqc3;->g(Ltj;)Ll50;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v2

    .line 1381
    new-instance v4, Lec0;

    .line 1382
    .line 1383
    invoke-direct {v4, v3}, Lec0;-><init>(I)V

    .line 1384
    .line 1385
    .line 1386
    iput-object v4, v2, Ll50;->d:Lec0;
    :try_end_4
    .catch Lyl0; {:try_start_4 .. :try_end_4} :catch_4
    .catch Lxt; {:try_start_4 .. :try_end_4} :catch_4

    .line 1387
    .line 1388
    move-object v0, v2

    .line 1389
    :goto_28
    iget v2, v0, Ll50;->e:I

    .line 1390
    .line 1391
    iget-object v4, v0, Ll50;->d:Lec0;

    .line 1392
    .line 1393
    if-eqz v4, :cond_36

    .line 1394
    .line 1395
    array-length v4, v1

    .line 1396
    const/4 v5, 0x3

    .line 1397
    if-ge v4, v5, :cond_35

    .line 1398
    .line 1399
    goto :goto_29

    .line 1400
    :cond_35
    const/16 v16, 0x0

    .line 1401
    .line 1402
    aget-object v4, v1, v16

    .line 1403
    .line 1404
    aget-object v5, v1, v22

    .line 1405
    .line 1406
    aput-object v5, v1, v16

    .line 1407
    .line 1408
    aput-object v4, v1, v22

    .line 1409
    .line 1410
    :cond_36
    :goto_29
    new-instance v1, Lwc0;

    .line 1411
    .line 1412
    iget-object v4, v0, Ll50;->a:Ljava/lang/String;

    .line 1413
    .line 1414
    invoke-direct {v1, v4, v3}, Lwc0;-><init>(Ljava/lang/String;I)V

    .line 1415
    .line 1416
    .line 1417
    iget-object v3, v0, Ll50;->b:Ljava/util/List;

    .line 1418
    .line 1419
    if-eqz v3, :cond_37

    .line 1420
    .line 1421
    sget-object v4, Lr42;->a:Lr42;

    .line 1422
    .line 1423
    invoke-virtual {v1, v4, v3}, Lwc0;->B(Lr42;Ljava/lang/Object;)V

    .line 1424
    .line 1425
    .line 1426
    :cond_37
    iget-object v3, v0, Ll50;->c:Ljava/lang/String;

    .line 1427
    .line 1428
    if-eqz v3, :cond_38

    .line 1429
    .line 1430
    sget-object v4, Lr42;->b:Lr42;

    .line 1431
    .line 1432
    invoke-virtual {v1, v4, v3}, Lwc0;->B(Lr42;Ljava/lang/Object;)V

    .line 1433
    .line 1434
    .line 1435
    :cond_38
    if-ltz v2, :cond_39

    .line 1436
    .line 1437
    iget v0, v0, Ll50;->f:I

    .line 1438
    .line 1439
    if-ltz v0, :cond_39

    .line 1440
    .line 1441
    sget-object v3, Lr42;->c:Lr42;

    .line 1442
    .line 1443
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v0

    .line 1447
    invoke-virtual {v1, v3, v0}, Lwc0;->B(Lr42;Ljava/lang/Object;)V

    .line 1448
    .line 1449
    .line 1450
    sget-object v0, Lr42;->d:Lr42;

    .line 1451
    .line 1452
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v2

    .line 1456
    invoke-virtual {v1, v0, v2}, Lwc0;->B(Lr42;Ljava/lang/Object;)V

    .line 1457
    .line 1458
    .line 1459
    :cond_39
    return-object v1

    .line 1460
    :catch_4
    if-eqz v0, :cond_3a

    .line 1461
    .line 1462
    throw v0

    .line 1463
    :cond_3a
    throw v5

    .line 1464
    :cond_3b
    sget-object v0, Lun1;->c:Lun1;

    .line 1465
    .line 1466
    throw v0

    .line 1467
    :catch_5
    invoke-static {}, Lyl0;->a()Lyl0;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v0

    .line 1471
    throw v0

    .line 1472
    :cond_3c
    invoke-static {}, Lyl0;->a()Lyl0;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v0

    .line 1476
    throw v0

    .line 1477
    :cond_3d
    sget-object v0, Lun1;->c:Lun1;

    .line 1478
    .line 1479
    throw v0

    .line 1480
    :cond_3e
    sget-object v0, Lun1;->c:Lun1;

    .line 1481
    .line 1482
    throw v0
.end method

.class public final Ls8;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic a:Lec;


# direct methods
.method public constructor <init>(Lec;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls8;->a:Lec;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, Ls8;->a:Lec;

    .line 4
    .line 5
    iget-object v0, v0, Lec;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lqc3;

    .line 8
    .line 9
    iget-object v0, v0, Lqc3;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lt8;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    iget-object v3, v0, Lt8;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    const/4 v6, 0x0

    .line 24
    move v7, v6

    .line 25
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v8

    .line 29
    if-ge v7, v8, :cond_e

    .line 30
    .line 31
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    check-cast v8, Lag2;

    .line 36
    .line 37
    if-nez v8, :cond_1

    .line 38
    .line 39
    :cond_0
    :goto_1
    move/from16 v26, v7

    .line 40
    .line 41
    goto/16 :goto_8

    .line 42
    .line 43
    :cond_1
    iget-object v10, v0, Lt8;->a:Lle2;

    .line 44
    .line 45
    const/4 v11, 0x0

    .line 46
    invoke-virtual {v10, v8, v11}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v12

    .line 50
    check-cast v12, Ljava/lang/Long;

    .line 51
    .line 52
    if-nez v12, :cond_2

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 56
    .line 57
    .line 58
    move-result-wide v12

    .line 59
    cmp-long v12, v12, v4

    .line 60
    .line 61
    if-gez v12, :cond_0

    .line 62
    .line 63
    invoke-virtual {v10, v8}, Lle2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :goto_2
    iget-wide v12, v8, Lag2;->g:J

    .line 67
    .line 68
    const-wide/16 v14, 0x0

    .line 69
    .line 70
    cmp-long v10, v12, v14

    .line 71
    .line 72
    if-nez v10, :cond_3

    .line 73
    .line 74
    iput-wide v1, v8, Lag2;->g:J

    .line 75
    .line 76
    iget v9, v8, Lag2;->b:F

    .line 77
    .line 78
    invoke-virtual {v8, v9}, Lag2;->a(F)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    sub-long v17, v1, v12

    .line 83
    .line 84
    iput-wide v1, v8, Lag2;->g:J

    .line 85
    .line 86
    iget-boolean v10, v8, Lag2;->m:Z

    .line 87
    .line 88
    iget v12, v8, Lag2;->l:F

    .line 89
    .line 90
    const v13, 0x7f7fffff    # Float.MAX_VALUE

    .line 91
    .line 92
    .line 93
    const v14, -0x800001

    .line 94
    .line 95
    .line 96
    const/4 v15, 0x0

    .line 97
    if-eqz v10, :cond_5

    .line 98
    .line 99
    cmpl-float v10, v12, v13

    .line 100
    .line 101
    if-eqz v10, :cond_4

    .line 102
    .line 103
    iget-object v10, v8, Lag2;->k:Lbg2;

    .line 104
    .line 105
    float-to-double v11, v12

    .line 106
    iput-wide v11, v10, Lbg2;->i:D

    .line 107
    .line 108
    iput v13, v8, Lag2;->l:F

    .line 109
    .line 110
    :cond_4
    iget-object v10, v8, Lag2;->k:Lbg2;

    .line 111
    .line 112
    iget-wide v10, v10, Lbg2;->i:D

    .line 113
    .line 114
    double-to-float v10, v10

    .line 115
    iput v10, v8, Lag2;->b:F

    .line 116
    .line 117
    iput v15, v8, Lag2;->a:F

    .line 118
    .line 119
    iput-boolean v6, v8, Lag2;->m:Z

    .line 120
    .line 121
    move/from16 v26, v7

    .line 122
    .line 123
    :goto_3
    const/4 v9, 0x1

    .line 124
    goto/16 :goto_5

    .line 125
    .line 126
    :cond_5
    cmpl-float v10, v12, v13

    .line 127
    .line 128
    iget-object v11, v8, Lag2;->k:Lbg2;

    .line 129
    .line 130
    if-eqz v10, :cond_6

    .line 131
    .line 132
    iget-wide v9, v11, Lbg2;->i:D

    .line 133
    .line 134
    iget v9, v8, Lag2;->b:F

    .line 135
    .line 136
    float-to-double v9, v9

    .line 137
    iget v12, v8, Lag2;->a:F

    .line 138
    .line 139
    move/from16 v26, v7

    .line 140
    .line 141
    float-to-double v6, v12

    .line 142
    const-wide/16 v19, 0x2

    .line 143
    .line 144
    div-long v28, v17, v19

    .line 145
    .line 146
    move-wide/from16 v24, v6

    .line 147
    .line 148
    move-wide/from16 v22, v9

    .line 149
    .line 150
    move-object/from16 v19, v11

    .line 151
    .line 152
    move-wide/from16 v20, v28

    .line 153
    .line 154
    invoke-virtual/range {v19 .. v25}, Lbg2;->a(JDD)Llb0;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    iget-object v7, v8, Lag2;->k:Lbg2;

    .line 159
    .line 160
    iget v9, v8, Lag2;->l:F

    .line 161
    .line 162
    float-to-double v9, v9

    .line 163
    iput-wide v9, v7, Lbg2;->i:D

    .line 164
    .line 165
    iput v13, v8, Lag2;->l:F

    .line 166
    .line 167
    iget v9, v6, Llb0;->a:F

    .line 168
    .line 169
    float-to-double v9, v9

    .line 170
    iget v6, v6, Llb0;->b:F

    .line 171
    .line 172
    float-to-double v11, v6

    .line 173
    move-object/from16 v27, v7

    .line 174
    .line 175
    move-wide/from16 v30, v9

    .line 176
    .line 177
    move-wide/from16 v32, v11

    .line 178
    .line 179
    invoke-virtual/range {v27 .. v33}, Lbg2;->a(JDD)Llb0;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    iget v7, v6, Llb0;->a:F

    .line 184
    .line 185
    iput v7, v8, Lag2;->b:F

    .line 186
    .line 187
    iget v6, v6, Llb0;->b:F

    .line 188
    .line 189
    iput v6, v8, Lag2;->a:F

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_6
    move/from16 v26, v7

    .line 193
    .line 194
    move-object/from16 v16, v11

    .line 195
    .line 196
    iget v6, v8, Lag2;->b:F

    .line 197
    .line 198
    float-to-double v6, v6

    .line 199
    iget v9, v8, Lag2;->a:F

    .line 200
    .line 201
    float-to-double v9, v9

    .line 202
    move-wide/from16 v19, v6

    .line 203
    .line 204
    move-wide/from16 v21, v9

    .line 205
    .line 206
    invoke-virtual/range {v16 .. v22}, Lbg2;->a(JDD)Llb0;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    iget v7, v6, Llb0;->a:F

    .line 211
    .line 212
    iput v7, v8, Lag2;->b:F

    .line 213
    .line 214
    iget v6, v6, Llb0;->b:F

    .line 215
    .line 216
    iput v6, v8, Lag2;->a:F

    .line 217
    .line 218
    :goto_4
    iget v6, v8, Lag2;->b:F

    .line 219
    .line 220
    invoke-static {v6, v14}, Ljava/lang/Math;->max(FF)F

    .line 221
    .line 222
    .line 223
    move-result v6

    .line 224
    iput v6, v8, Lag2;->b:F

    .line 225
    .line 226
    invoke-static {v6, v13}, Ljava/lang/Math;->min(FF)F

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    iput v6, v8, Lag2;->b:F

    .line 231
    .line 232
    iget v7, v8, Lag2;->a:F

    .line 233
    .line 234
    iget-object v9, v8, Lag2;->k:Lbg2;

    .line 235
    .line 236
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    float-to-double v10, v7

    .line 244
    iget-wide v13, v9, Lbg2;->e:D

    .line 245
    .line 246
    cmpg-double v10, v10, v13

    .line 247
    .line 248
    if-gez v10, :cond_7

    .line 249
    .line 250
    iget-wide v10, v9, Lbg2;->i:D

    .line 251
    .line 252
    double-to-float v10, v10

    .line 253
    sub-float/2addr v6, v10

    .line 254
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    float-to-double v10, v6

    .line 259
    iget-wide v13, v9, Lbg2;->d:D

    .line 260
    .line 261
    cmpg-double v6, v10, v13

    .line 262
    .line 263
    if-gez v6, :cond_7

    .line 264
    .line 265
    iget-object v6, v8, Lag2;->k:Lbg2;

    .line 266
    .line 267
    iget-wide v9, v6, Lbg2;->i:D

    .line 268
    .line 269
    double-to-float v6, v9

    .line 270
    iput v6, v8, Lag2;->b:F

    .line 271
    .line 272
    iput v15, v8, Lag2;->a:F

    .line 273
    .line 274
    goto/16 :goto_3

    .line 275
    .line 276
    :cond_7
    const/4 v9, 0x0

    .line 277
    :goto_5
    iget v6, v8, Lag2;->b:F

    .line 278
    .line 279
    const v7, 0x7f7fffff    # Float.MAX_VALUE

    .line 280
    .line 281
    .line 282
    invoke-static {v6, v7}, Ljava/lang/Math;->min(FF)F

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    iput v6, v8, Lag2;->b:F

    .line 287
    .line 288
    const v12, -0x800001

    .line 289
    .line 290
    .line 291
    invoke-static {v6, v12}, Ljava/lang/Math;->max(FF)F

    .line 292
    .line 293
    .line 294
    move-result v6

    .line 295
    iput v6, v8, Lag2;->b:F

    .line 296
    .line 297
    invoke-virtual {v8, v6}, Lag2;->a(F)V

    .line 298
    .line 299
    .line 300
    if-eqz v9, :cond_d

    .line 301
    .line 302
    iget-object v6, v8, Lag2;->i:Ljava/util/ArrayList;

    .line 303
    .line 304
    const/4 v7, 0x0

    .line 305
    iput-boolean v7, v8, Lag2;->f:Z

    .line 306
    .line 307
    sget-object v7, Lt8;->f:Ljava/lang/ThreadLocal;

    .line 308
    .line 309
    invoke-virtual {v7}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v9

    .line 313
    if-nez v9, :cond_8

    .line 314
    .line 315
    new-instance v9, Lt8;

    .line 316
    .line 317
    invoke-direct {v9}, Lt8;-><init>()V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v7, v9}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    :cond_8
    invoke-virtual {v7}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v7

    .line 327
    check-cast v7, Lt8;

    .line 328
    .line 329
    iget-object v9, v7, Lt8;->a:Lle2;

    .line 330
    .line 331
    invoke-virtual {v9, v8}, Lle2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    iget-object v9, v7, Lt8;->b:Ljava/util/ArrayList;

    .line 335
    .line 336
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 337
    .line 338
    .line 339
    move-result v10

    .line 340
    if-ltz v10, :cond_9

    .line 341
    .line 342
    const/4 v11, 0x0

    .line 343
    invoke-virtual {v9, v10, v11}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    const/4 v12, 0x1

    .line 347
    iput-boolean v12, v7, Lt8;->e:Z

    .line 348
    .line 349
    :cond_9
    const-wide/16 v9, 0x0

    .line 350
    .line 351
    iput-wide v9, v8, Lag2;->g:J

    .line 352
    .line 353
    const/4 v7, 0x0

    .line 354
    iput-boolean v7, v8, Lag2;->c:Z

    .line 355
    .line 356
    const/4 v7, 0x0

    .line 357
    :goto_6
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 358
    .line 359
    .line 360
    move-result v8

    .line 361
    if-ge v7, v8, :cond_b

    .line 362
    .line 363
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v8

    .line 367
    if-nez v8, :cond_a

    .line 368
    .line 369
    add-int/lit8 v7, v7, 0x1

    .line 370
    .line 371
    goto :goto_6

    .line 372
    :cond_a
    invoke-static {v7, v6}, Lpm2;->i(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    throw v0

    .line 377
    :cond_b
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 378
    .line 379
    .line 380
    move-result v7

    .line 381
    const/4 v12, 0x1

    .line 382
    sub-int/2addr v7, v12

    .line 383
    :goto_7
    if-ltz v7, :cond_d

    .line 384
    .line 385
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v8

    .line 389
    if-nez v8, :cond_c

    .line 390
    .line 391
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    :cond_c
    add-int/lit8 v7, v7, -0x1

    .line 395
    .line 396
    goto :goto_7

    .line 397
    :cond_d
    :goto_8
    add-int/lit8 v7, v26, 0x1

    .line 398
    .line 399
    const/4 v6, 0x0

    .line 400
    goto/16 :goto_0

    .line 401
    .line 402
    :cond_e
    iget-boolean v1, v0, Lt8;->e:Z

    .line 403
    .line 404
    if-eqz v1, :cond_11

    .line 405
    .line 406
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 407
    .line 408
    .line 409
    move-result v1

    .line 410
    const/4 v12, 0x1

    .line 411
    sub-int/2addr v1, v12

    .line 412
    :goto_9
    if-ltz v1, :cond_10

    .line 413
    .line 414
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    if-nez v2, :cond_f

    .line 419
    .line 420
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    :cond_f
    add-int/lit8 v1, v1, -0x1

    .line 424
    .line 425
    goto :goto_9

    .line 426
    :cond_10
    const/4 v7, 0x0

    .line 427
    iput-boolean v7, v0, Lt8;->e:Z

    .line 428
    .line 429
    :cond_11
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 430
    .line 431
    .line 432
    move-result v1

    .line 433
    if-lez v1, :cond_13

    .line 434
    .line 435
    iget-object v1, v0, Lt8;->d:Lec;

    .line 436
    .line 437
    if-nez v1, :cond_12

    .line 438
    .line 439
    new-instance v1, Lec;

    .line 440
    .line 441
    iget-object v2, v0, Lt8;->c:Lqc3;

    .line 442
    .line 443
    invoke-direct {v1, v2}, Lec;-><init>(Lqc3;)V

    .line 444
    .line 445
    .line 446
    iput-object v1, v0, Lt8;->d:Lec;

    .line 447
    .line 448
    :cond_12
    iget-object v0, v0, Lt8;->d:Lec;

    .line 449
    .line 450
    iget-object v1, v0, Lec;->c:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v1, Landroid/view/Choreographer;

    .line 453
    .line 454
    iget-object v0, v0, Lec;->d:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v0, Ls8;

    .line 457
    .line 458
    invoke-virtual {v1, v0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 459
    .line 460
    .line 461
    :cond_13
    return-void
.end method

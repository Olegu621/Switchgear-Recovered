.class public final Lzm;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:F

.field public e:F

.field public f:F


# direct methods
.method public constructor <init>(FFFFFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lzm;->a:F

    .line 5
    .line 6
    iput p2, p0, Lzm;->b:F

    .line 7
    .line 8
    iput p3, p0, Lzm;->c:F

    .line 9
    .line 10
    iput p4, p0, Lzm;->d:F

    .line 11
    .line 12
    iput p5, p0, Lzm;->e:F

    .line 13
    .line 14
    iput p6, p0, Lzm;->f:F

    .line 15
    .line 16
    return-void
.end method

.method public static b(I)Lzm;
    .locals 26

    .line 1
    sget-object v0, Lp53;->k:Lp53;

    .line 2
    .line 3
    invoke-static/range {p0 .. p0}, Landroid/graphics/Color;->red(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Lj13;->n(I)F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static/range {p0 .. p0}, Landroid/graphics/Color;->green(I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v2}, Lj13;->n(I)F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-static/range {p0 .. p0}, Landroid/graphics/Color;->blue(I)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-static {v3}, Lj13;->n(I)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    sget-object v4, Lj13;->e:[[F

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    aget-object v6, v4, v5

    .line 31
    .line 32
    aget v7, v6, v5

    .line 33
    .line 34
    mul-float/2addr v7, v1

    .line 35
    const/4 v8, 0x1

    .line 36
    aget v9, v6, v8

    .line 37
    .line 38
    mul-float/2addr v9, v2

    .line 39
    add-float/2addr v9, v7

    .line 40
    const/4 v7, 0x2

    .line 41
    aget v6, v6, v7

    .line 42
    .line 43
    mul-float/2addr v6, v3

    .line 44
    add-float/2addr v6, v9

    .line 45
    aget-object v9, v4, v8

    .line 46
    .line 47
    aget v10, v9, v5

    .line 48
    .line 49
    mul-float/2addr v10, v1

    .line 50
    aget v11, v9, v8

    .line 51
    .line 52
    mul-float/2addr v11, v2

    .line 53
    add-float/2addr v11, v10

    .line 54
    aget v9, v9, v7

    .line 55
    .line 56
    mul-float/2addr v9, v3

    .line 57
    add-float/2addr v9, v11

    .line 58
    aget-object v4, v4, v7

    .line 59
    .line 60
    aget v10, v4, v5

    .line 61
    .line 62
    mul-float/2addr v1, v10

    .line 63
    aget v10, v4, v8

    .line 64
    .line 65
    mul-float/2addr v2, v10

    .line 66
    add-float/2addr v2, v1

    .line 67
    aget v1, v4, v7

    .line 68
    .line 69
    mul-float/2addr v3, v1

    .line 70
    add-float/2addr v3, v2

    .line 71
    sget-object v1, Lj13;->b:[[F

    .line 72
    .line 73
    aget-object v2, v1, v5

    .line 74
    .line 75
    aget v4, v2, v5

    .line 76
    .line 77
    mul-float/2addr v4, v6

    .line 78
    aget v10, v2, v8

    .line 79
    .line 80
    mul-float/2addr v10, v9

    .line 81
    add-float/2addr v10, v4

    .line 82
    aget v2, v2, v7

    .line 83
    .line 84
    mul-float/2addr v2, v3

    .line 85
    add-float/2addr v2, v10

    .line 86
    aget-object v4, v1, v8

    .line 87
    .line 88
    aget v10, v4, v5

    .line 89
    .line 90
    mul-float/2addr v10, v6

    .line 91
    aget v11, v4, v8

    .line 92
    .line 93
    mul-float/2addr v11, v9

    .line 94
    add-float/2addr v11, v10

    .line 95
    aget v4, v4, v7

    .line 96
    .line 97
    mul-float/2addr v4, v3

    .line 98
    add-float/2addr v4, v11

    .line 99
    aget-object v1, v1, v7

    .line 100
    .line 101
    aget v10, v1, v5

    .line 102
    .line 103
    mul-float/2addr v6, v10

    .line 104
    aget v10, v1, v8

    .line 105
    .line 106
    mul-float/2addr v9, v10

    .line 107
    add-float/2addr v9, v6

    .line 108
    aget v1, v1, v7

    .line 109
    .line 110
    mul-float/2addr v3, v1

    .line 111
    add-float/2addr v3, v9

    .line 112
    iget-object v1, v0, Lp53;->g:[F

    .line 113
    .line 114
    iget v6, v0, Lp53;->i:F

    .line 115
    .line 116
    iget v9, v0, Lp53;->d:F

    .line 117
    .line 118
    iget v10, v0, Lp53;->a:F

    .line 119
    .line 120
    aget v5, v1, v5

    .line 121
    .line 122
    mul-float/2addr v5, v2

    .line 123
    aget v2, v1, v8

    .line 124
    .line 125
    mul-float/2addr v2, v4

    .line 126
    aget v1, v1, v7

    .line 127
    .line 128
    mul-float/2addr v1, v3

    .line 129
    iget v3, v0, Lp53;->h:F

    .line 130
    .line 131
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    mul-float/2addr v4, v3

    .line 136
    float-to-double v7, v4

    .line 137
    const-wide/high16 v11, 0x4059000000000000L    # 100.0

    .line 138
    .line 139
    div-double/2addr v7, v11

    .line 140
    const-wide v13, 0x3fdae147ae147ae1L    # 0.42

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    invoke-static {v7, v8, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 146
    .line 147
    .line 148
    move-result-wide v7

    .line 149
    double-to-float v4, v7

    .line 150
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    mul-float/2addr v7, v3

    .line 155
    float-to-double v7, v7

    .line 156
    div-double/2addr v7, v11

    .line 157
    invoke-static {v7, v8, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 158
    .line 159
    .line 160
    move-result-wide v7

    .line 161
    double-to-float v7, v7

    .line 162
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    mul-float/2addr v8, v3

    .line 167
    move-wide v15, v11

    .line 168
    float-to-double v11, v8

    .line 169
    div-double/2addr v11, v15

    .line 170
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 171
    .line 172
    .line 173
    move-result-wide v11

    .line 174
    double-to-float v3, v11

    .line 175
    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    const/high16 v8, 0x43c80000    # 400.0f

    .line 180
    .line 181
    mul-float/2addr v5, v8

    .line 182
    mul-float/2addr v5, v4

    .line 183
    const v11, 0x41d90a3d    # 27.13f

    .line 184
    .line 185
    .line 186
    add-float/2addr v4, v11

    .line 187
    div-float/2addr v5, v4

    .line 188
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    mul-float/2addr v2, v8

    .line 193
    mul-float/2addr v2, v7

    .line 194
    add-float/2addr v7, v11

    .line 195
    div-float/2addr v2, v7

    .line 196
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    mul-float/2addr v1, v8

    .line 201
    mul-float/2addr v1, v3

    .line 202
    add-float/2addr v3, v11

    .line 203
    div-float/2addr v1, v3

    .line 204
    const-wide/high16 v3, 0x4026000000000000L    # 11.0

    .line 205
    .line 206
    float-to-double v7, v5

    .line 207
    mul-double/2addr v7, v3

    .line 208
    const-wide/high16 v3, -0x3fd8000000000000L    # -12.0

    .line 209
    .line 210
    float-to-double v11, v2

    .line 211
    mul-double/2addr v11, v3

    .line 212
    add-double/2addr v11, v7

    .line 213
    float-to-double v3, v1

    .line 214
    add-double/2addr v11, v3

    .line 215
    double-to-float v7, v11

    .line 216
    const/high16 v8, 0x41300000    # 11.0f

    .line 217
    .line 218
    div-float/2addr v7, v8

    .line 219
    add-float v8, v5, v2

    .line 220
    .line 221
    float-to-double v11, v8

    .line 222
    const-wide/high16 v13, 0x4000000000000000L    # 2.0

    .line 223
    .line 224
    mul-double/2addr v3, v13

    .line 225
    sub-double/2addr v11, v3

    .line 226
    double-to-float v3, v11

    .line 227
    const/high16 v4, 0x41100000    # 9.0f

    .line 228
    .line 229
    div-float/2addr v3, v4

    .line 230
    const/high16 v4, 0x41a00000    # 20.0f

    .line 231
    .line 232
    mul-float v8, v5, v4

    .line 233
    .line 234
    mul-float/2addr v2, v4

    .line 235
    add-float/2addr v8, v2

    .line 236
    const/high16 v11, 0x41a80000    # 21.0f

    .line 237
    .line 238
    mul-float/2addr v11, v1

    .line 239
    add-float/2addr v11, v8

    .line 240
    div-float/2addr v11, v4

    .line 241
    const/high16 v8, 0x42200000    # 40.0f

    .line 242
    .line 243
    mul-float/2addr v5, v8

    .line 244
    add-float/2addr v5, v2

    .line 245
    add-float/2addr v5, v1

    .line 246
    div-float/2addr v5, v4

    .line 247
    float-to-double v1, v3

    .line 248
    move-wide/from16 v17, v13

    .line 249
    .line 250
    float-to-double v13, v7

    .line 251
    invoke-static {v1, v2, v13, v14}, Ljava/lang/Math;->atan2(DD)D

    .line 252
    .line 253
    .line 254
    move-result-wide v1

    .line 255
    double-to-float v1, v1

    .line 256
    const/high16 v2, 0x43340000    # 180.0f

    .line 257
    .line 258
    mul-float/2addr v1, v2

    .line 259
    const v4, 0x40490fdb    # (float)Math.PI

    .line 260
    .line 261
    .line 262
    div-float/2addr v1, v4

    .line 263
    const/4 v8, 0x0

    .line 264
    cmpg-float v8, v1, v8

    .line 265
    .line 266
    const/high16 v12, 0x43b40000    # 360.0f

    .line 267
    .line 268
    if-gez v8, :cond_0

    .line 269
    .line 270
    add-float/2addr v1, v12

    .line 271
    goto :goto_0

    .line 272
    :cond_0
    cmpl-float v8, v1, v12

    .line 273
    .line 274
    if-ltz v8, :cond_1

    .line 275
    .line 276
    sub-float/2addr v1, v12

    .line 277
    :cond_1
    :goto_0
    mul-float/2addr v4, v1

    .line 278
    div-float/2addr v4, v2

    .line 279
    iget v2, v0, Lp53;->b:F

    .line 280
    .line 281
    mul-float/2addr v5, v2

    .line 282
    div-float/2addr v5, v10

    .line 283
    float-to-double v13, v5

    .line 284
    iget v2, v0, Lp53;->j:F

    .line 285
    .line 286
    mul-float/2addr v2, v9

    .line 287
    move/from16 p0, v3

    .line 288
    .line 289
    float-to-double v2, v2

    .line 290
    invoke-static {v13, v14, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 291
    .line 292
    .line 293
    move-result-wide v2

    .line 294
    double-to-float v2, v2

    .line 295
    const/high16 v3, 0x42c80000    # 100.0f

    .line 296
    .line 297
    mul-float/2addr v2, v3

    .line 298
    div-float v3, v2, v3

    .line 299
    .line 300
    float-to-double v13, v3

    .line 301
    invoke-static {v13, v14}, Ljava/lang/Math;->sqrt(D)D

    .line 302
    .line 303
    .line 304
    const/high16 v3, 0x40800000    # 4.0f

    .line 305
    .line 306
    add-float/2addr v10, v3

    .line 307
    float-to-double v13, v1

    .line 308
    const-wide v19, 0x403423d70a3d70a4L    # 20.14

    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    cmpg-double v3, v13, v19

    .line 314
    .line 315
    if-gez v3, :cond_2

    .line 316
    .line 317
    add-float/2addr v12, v1

    .line 318
    goto :goto_1

    .line 319
    :cond_2
    move v12, v1

    .line 320
    :goto_1
    float-to-double v12, v12

    .line 321
    const-wide v19, 0x400921fb54442d18L    # Math.PI

    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    mul-double v12, v12, v19

    .line 327
    .line 328
    const-wide v19, 0x4066800000000000L    # 180.0

    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    div-double v12, v12, v19

    .line 334
    .line 335
    add-double v12, v12, v17

    .line 336
    .line 337
    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    .line 338
    .line 339
    .line 340
    move-result-wide v12

    .line 341
    const-wide v17, 0x400e666666666666L    # 3.8

    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    add-double v12, v12, v17

    .line 347
    .line 348
    double-to-float v3, v12

    .line 349
    const/high16 v5, 0x3e800000    # 0.25f

    .line 350
    .line 351
    mul-float/2addr v3, v5

    .line 352
    const v5, 0x45706276

    .line 353
    .line 354
    .line 355
    mul-float/2addr v3, v5

    .line 356
    iget v5, v0, Lp53;->e:F

    .line 357
    .line 358
    mul-float/2addr v3, v5

    .line 359
    iget v5, v0, Lp53;->c:F

    .line 360
    .line 361
    mul-float/2addr v3, v5

    .line 362
    mul-float/2addr v7, v7

    .line 363
    mul-float v5, p0, p0

    .line 364
    .line 365
    add-float/2addr v5, v7

    .line 366
    float-to-double v7, v5

    .line 367
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    .line 368
    .line 369
    .line 370
    move-result-wide v7

    .line 371
    double-to-float v5, v7

    .line 372
    mul-float/2addr v3, v5

    .line 373
    const v5, 0x3e9c28f6    # 0.305f

    .line 374
    .line 375
    .line 376
    add-float/2addr v11, v5

    .line 377
    div-float/2addr v3, v11

    .line 378
    iget v0, v0, Lp53;->f:F

    .line 379
    .line 380
    float-to-double v7, v0

    .line 381
    const-wide v11, 0x3fd28f5c28f5c28fL    # 0.29

    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    invoke-static {v11, v12, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 387
    .line 388
    .line 389
    move-result-wide v7

    .line 390
    const-wide v11, 0x3ffa3d70a3d70a3dL    # 1.64

    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    sub-double/2addr v11, v7

    .line 396
    const-wide v7, 0x3fe75c28f5c28f5cL    # 0.73

    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    invoke-static {v11, v12, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 402
    .line 403
    .line 404
    move-result-wide v7

    .line 405
    double-to-float v0, v7

    .line 406
    float-to-double v7, v3

    .line 407
    const-wide v11, 0x3feccccccccccccdL    # 0.9

    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    invoke-static {v7, v8, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 413
    .line 414
    .line 415
    move-result-wide v7

    .line 416
    double-to-float v3, v7

    .line 417
    mul-float/2addr v0, v3

    .line 418
    float-to-double v7, v2

    .line 419
    div-double/2addr v7, v15

    .line 420
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    .line 421
    .line 422
    .line 423
    move-result-wide v7

    .line 424
    double-to-float v3, v7

    .line 425
    mul-float v21, v0, v3

    .line 426
    .line 427
    mul-float v6, v6, v21

    .line 428
    .line 429
    mul-float/2addr v0, v9

    .line 430
    div-float/2addr v0, v10

    .line 431
    float-to-double v7, v0

    .line 432
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    .line 433
    .line 434
    .line 435
    const v0, 0x3fd9999a    # 1.7f

    .line 436
    .line 437
    .line 438
    mul-float/2addr v0, v2

    .line 439
    const v3, 0x3be56042    # 0.007f

    .line 440
    .line 441
    .line 442
    mul-float/2addr v3, v2

    .line 443
    const/high16 v5, 0x3f800000    # 1.0f

    .line 444
    .line 445
    add-float/2addr v3, v5

    .line 446
    div-float v23, v0, v3

    .line 447
    .line 448
    const v0, 0x3cbac711    # 0.0228f

    .line 449
    .line 450
    .line 451
    mul-float/2addr v6, v0

    .line 452
    add-float/2addr v6, v5

    .line 453
    float-to-double v5, v6

    .line 454
    invoke-static {v5, v6}, Ljava/lang/Math;->log(D)D

    .line 455
    .line 456
    .line 457
    move-result-wide v5

    .line 458
    double-to-float v0, v5

    .line 459
    const v3, 0x422f7048

    .line 460
    .line 461
    .line 462
    mul-float/2addr v0, v3

    .line 463
    float-to-double v3, v4

    .line 464
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    .line 465
    .line 466
    .line 467
    move-result-wide v5

    .line 468
    double-to-float v5, v5

    .line 469
    mul-float v24, v0, v5

    .line 470
    .line 471
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 472
    .line 473
    .line 474
    move-result-wide v3

    .line 475
    double-to-float v3, v3

    .line 476
    mul-float v25, v0, v3

    .line 477
    .line 478
    new-instance v19, Lzm;

    .line 479
    .line 480
    move/from16 v20, v1

    .line 481
    .line 482
    move/from16 v22, v2

    .line 483
    .line 484
    invoke-direct/range {v19 .. v25}, Lzm;-><init>(FFFFFF)V

    .line 485
    .line 486
    .line 487
    return-object v19
.end method

.method public static c(FFF)Lzm;
    .locals 12

    .line 1
    sget-object v0, Lp53;->k:Lp53;

    .line 2
    .line 3
    iget v1, v0, Lp53;->d:F

    .line 4
    .line 5
    float-to-double v1, p0

    .line 6
    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    .line 7
    .line 8
    div-double/2addr v1, v3

    .line 9
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    .line 10
    .line 11
    .line 12
    iget v3, v0, Lp53;->a:F

    .line 13
    .line 14
    const/high16 v4, 0x40800000    # 4.0f

    .line 15
    .line 16
    add-float/2addr v3, v4

    .line 17
    iget v4, v0, Lp53;->i:F

    .line 18
    .line 19
    mul-float/2addr v4, p1

    .line 20
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    double-to-float v1, v1

    .line 25
    div-float v1, p1, v1

    .line 26
    .line 27
    iget v0, v0, Lp53;->d:F

    .line 28
    .line 29
    mul-float/2addr v1, v0

    .line 30
    div-float/2addr v1, v3

    .line 31
    float-to-double v0, v1

    .line 32
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 33
    .line 34
    .line 35
    const v0, 0x40490fdb    # (float)Math.PI

    .line 36
    .line 37
    .line 38
    mul-float/2addr v0, p2

    .line 39
    const/high16 v1, 0x43340000    # 180.0f

    .line 40
    .line 41
    div-float/2addr v0, v1

    .line 42
    const v1, 0x3fd9999a    # 1.7f

    .line 43
    .line 44
    .line 45
    mul-float/2addr v1, p0

    .line 46
    const v2, 0x3be56042    # 0.007f

    .line 47
    .line 48
    .line 49
    mul-float/2addr v2, p0

    .line 50
    const/high16 v3, 0x3f800000    # 1.0f

    .line 51
    .line 52
    add-float/2addr v2, v3

    .line 53
    div-float v9, v1, v2

    .line 54
    .line 55
    const-wide v1, 0x3f9758e219652bd4L    # 0.0228

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    float-to-double v3, v4

    .line 61
    mul-double/2addr v3, v1

    .line 62
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 63
    .line 64
    add-double/2addr v3, v1

    .line 65
    invoke-static {v3, v4}, Ljava/lang/Math;->log(D)D

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    double-to-float v1, v1

    .line 70
    const v2, 0x422f7048

    .line 71
    .line 72
    .line 73
    mul-float/2addr v1, v2

    .line 74
    float-to-double v2, v0

    .line 75
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 76
    .line 77
    .line 78
    move-result-wide v4

    .line 79
    double-to-float v0, v4

    .line 80
    mul-float v10, v1, v0

    .line 81
    .line 82
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 83
    .line 84
    .line 85
    move-result-wide v2

    .line 86
    double-to-float v0, v2

    .line 87
    mul-float v11, v1, v0

    .line 88
    .line 89
    new-instance v5, Lzm;

    .line 90
    .line 91
    move v8, p0

    .line 92
    move v7, p1

    .line 93
    move v6, p2

    .line 94
    invoke-direct/range {v5 .. v11}, Lzm;-><init>(FFFFFF)V

    .line 95
    .line 96
    .line 97
    return-object v5
.end method


# virtual methods
.method public a(FFII[F)V
    .locals 14

    .line 1
    move/from16 v0, p3

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget v2, p5, v1

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    aget v4, p5, v3

    .line 8
    .line 9
    const/high16 v5, 0x3f000000    # 0.5f

    .line 10
    .line 11
    sub-float v6, p1, v5

    .line 12
    .line 13
    const/high16 v7, 0x40000000    # 2.0f

    .line 14
    .line 15
    mul-float/2addr v6, v7

    .line 16
    sub-float v5, p2, v5

    .line 17
    .line 18
    mul-float/2addr v5, v7

    .line 19
    iget v7, p0, Lzm;->c:F

    .line 20
    .line 21
    add-float/2addr v2, v7

    .line 22
    iget v7, p0, Lzm;->d:F

    .line 23
    .line 24
    add-float/2addr v4, v7

    .line 25
    iget v7, p0, Lzm;->a:F

    .line 26
    .line 27
    mul-float/2addr v7, v6

    .line 28
    add-float/2addr v7, v2

    .line 29
    iget v2, p0, Lzm;->b:F

    .line 30
    .line 31
    mul-float/2addr v2, v5

    .line 32
    add-float/2addr v2, v4

    .line 33
    iget v4, p0, Lzm;->f:F

    .line 34
    .line 35
    float-to-double v8, v4

    .line 36
    invoke-static {v8, v9}, Ljava/lang/Math;->toRadians(D)D

    .line 37
    .line 38
    .line 39
    move-result-wide v8

    .line 40
    double-to-float v4, v8

    .line 41
    iget p0, p0, Lzm;->e:F

    .line 42
    .line 43
    float-to-double v8, p0

    .line 44
    invoke-static {v8, v9}, Ljava/lang/Math;->toRadians(D)D

    .line 45
    .line 46
    .line 47
    move-result-wide v8

    .line 48
    double-to-float p0, v8

    .line 49
    neg-int v8, v0

    .line 50
    int-to-float v8, v8

    .line 51
    mul-float/2addr v8, v6

    .line 52
    float-to-double v8, v8

    .line 53
    float-to-double v10, v4

    .line 54
    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    .line 55
    .line 56
    .line 57
    move-result-wide v12

    .line 58
    mul-double/2addr v12, v8

    .line 59
    move/from16 v4, p4

    .line 60
    .line 61
    int-to-float v4, v4

    .line 62
    mul-float/2addr v4, v5

    .line 63
    float-to-double v4, v4

    .line 64
    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    .line 65
    .line 66
    .line 67
    move-result-wide v8

    .line 68
    mul-double/2addr v8, v4

    .line 69
    sub-double/2addr v12, v8

    .line 70
    double-to-float v8, v12

    .line 71
    mul-float/2addr v8, p0

    .line 72
    add-float/2addr v8, v7

    .line 73
    int-to-float v0, v0

    .line 74
    mul-float/2addr v0, v6

    .line 75
    float-to-double v6, v0

    .line 76
    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    .line 77
    .line 78
    .line 79
    move-result-wide v12

    .line 80
    mul-double/2addr v12, v6

    .line 81
    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    .line 82
    .line 83
    .line 84
    move-result-wide v6

    .line 85
    mul-double/2addr v6, v4

    .line 86
    sub-double/2addr v12, v6

    .line 87
    double-to-float v0, v12

    .line 88
    mul-float/2addr p0, v0

    .line 89
    add-float/2addr p0, v2

    .line 90
    aput v8, p5, v1

    .line 91
    .line 92
    aput p0, p5, v3

    .line 93
    .line 94
    return-void
.end method

.method public d(Lp53;)I
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lzm;->c:F

    .line 6
    .line 7
    iget v3, v0, Lzm;->b:F

    .line 8
    .line 9
    float-to-double v4, v3

    .line 10
    const-wide/16 v6, 0x0

    .line 11
    .line 12
    cmpl-double v4, v4, v6

    .line 13
    .line 14
    const-wide/high16 v8, 0x4059000000000000L    # 100.0

    .line 15
    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    float-to-double v4, v2

    .line 19
    cmpl-double v10, v4, v6

    .line 20
    .line 21
    if-nez v10, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    div-double/2addr v4, v8

    .line 25
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    double-to-float v4, v4

    .line 30
    div-float/2addr v3, v4

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    const/4 v3, 0x0

    .line 33
    :goto_1
    float-to-double v3, v3

    .line 34
    iget v5, v1, Lp53;->f:F

    .line 35
    .line 36
    iget v10, v1, Lp53;->h:F

    .line 37
    .line 38
    float-to-double v11, v5

    .line 39
    const-wide v13, 0x3fd28f5c28f5c28fL    # 0.29

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 45
    .line 46
    .line 47
    move-result-wide v11

    .line 48
    const-wide v13, 0x3ffa3d70a3d70a3dL    # 1.64

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    sub-double/2addr v13, v11

    .line 54
    const-wide v11, 0x3fe75c28f5c28f5cL    # 0.73

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 60
    .line 61
    .line 62
    move-result-wide v11

    .line 63
    div-double/2addr v3, v11

    .line 64
    const-wide v11, 0x3ff1c71c71c71c72L    # 1.1111111111111112

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    invoke-static {v3, v4, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 70
    .line 71
    .line 72
    move-result-wide v3

    .line 73
    double-to-float v3, v3

    .line 74
    iget v0, v0, Lzm;->a:F

    .line 75
    .line 76
    const v4, 0x40490fdb    # (float)Math.PI

    .line 77
    .line 78
    .line 79
    mul-float/2addr v0, v4

    .line 80
    const/high16 v4, 0x43340000    # 180.0f

    .line 81
    .line 82
    div-float/2addr v0, v4

    .line 83
    float-to-double v4, v0

    .line 84
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 85
    .line 86
    add-double/2addr v11, v4

    .line 87
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    .line 88
    .line 89
    .line 90
    move-result-wide v11

    .line 91
    const-wide v13, 0x400e666666666666L    # 3.8

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    add-double/2addr v11, v13

    .line 97
    double-to-float v0, v11

    .line 98
    const/high16 v11, 0x3e800000    # 0.25f

    .line 99
    .line 100
    mul-float/2addr v0, v11

    .line 101
    iget v11, v1, Lp53;->a:F

    .line 102
    .line 103
    float-to-double v12, v2

    .line 104
    div-double/2addr v12, v8

    .line 105
    iget v2, v1, Lp53;->d:F

    .line 106
    .line 107
    float-to-double v8, v2

    .line 108
    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    .line 109
    .line 110
    div-double/2addr v14, v8

    .line 111
    iget v2, v1, Lp53;->j:F

    .line 112
    .line 113
    float-to-double v8, v2

    .line 114
    div-double/2addr v14, v8

    .line 115
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 116
    .line 117
    .line 118
    move-result-wide v8

    .line 119
    double-to-float v2, v8

    .line 120
    mul-float/2addr v11, v2

    .line 121
    const v2, 0x45706276

    .line 122
    .line 123
    .line 124
    mul-float/2addr v0, v2

    .line 125
    iget v2, v1, Lp53;->e:F

    .line 126
    .line 127
    mul-float/2addr v0, v2

    .line 128
    iget v2, v1, Lp53;->c:F

    .line 129
    .line 130
    mul-float/2addr v0, v2

    .line 131
    iget v2, v1, Lp53;->b:F

    .line 132
    .line 133
    div-float/2addr v11, v2

    .line 134
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 135
    .line 136
    .line 137
    move-result-wide v8

    .line 138
    double-to-float v2, v8

    .line 139
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    .line 140
    .line 141
    .line 142
    move-result-wide v4

    .line 143
    double-to-float v4, v4

    .line 144
    const v5, 0x3e9c28f6    # 0.305f

    .line 145
    .line 146
    .line 147
    add-float/2addr v5, v11

    .line 148
    const/high16 v8, 0x41b80000    # 23.0f

    .line 149
    .line 150
    mul-float/2addr v5, v8

    .line 151
    mul-float/2addr v5, v3

    .line 152
    mul-float/2addr v0, v8

    .line 153
    const/high16 v8, 0x41300000    # 11.0f

    .line 154
    .line 155
    mul-float/2addr v8, v3

    .line 156
    mul-float/2addr v8, v4

    .line 157
    add-float/2addr v8, v0

    .line 158
    const/high16 v0, 0x42d80000    # 108.0f

    .line 159
    .line 160
    mul-float/2addr v3, v0

    .line 161
    mul-float/2addr v3, v2

    .line 162
    add-float/2addr v3, v8

    .line 163
    div-float/2addr v5, v3

    .line 164
    mul-float/2addr v4, v5

    .line 165
    mul-float/2addr v5, v2

    .line 166
    const/high16 v0, 0x43e60000    # 460.0f

    .line 167
    .line 168
    mul-float/2addr v11, v0

    .line 169
    const v0, 0x43e18000    # 451.0f

    .line 170
    .line 171
    .line 172
    mul-float/2addr v0, v4

    .line 173
    add-float/2addr v0, v11

    .line 174
    const/high16 v2, 0x43900000    # 288.0f

    .line 175
    .line 176
    mul-float/2addr v2, v5

    .line 177
    add-float/2addr v2, v0

    .line 178
    const v0, 0x44af6000    # 1403.0f

    .line 179
    .line 180
    .line 181
    div-float/2addr v2, v0

    .line 182
    const v3, 0x445ec000    # 891.0f

    .line 183
    .line 184
    .line 185
    mul-float/2addr v3, v4

    .line 186
    sub-float v3, v11, v3

    .line 187
    .line 188
    const v8, 0x43828000    # 261.0f

    .line 189
    .line 190
    .line 191
    mul-float/2addr v8, v5

    .line 192
    sub-float/2addr v3, v8

    .line 193
    div-float/2addr v3, v0

    .line 194
    const/high16 v8, 0x435c0000    # 220.0f

    .line 195
    .line 196
    mul-float/2addr v4, v8

    .line 197
    sub-float/2addr v11, v4

    .line 198
    const v4, 0x45c4e000    # 6300.0f

    .line 199
    .line 200
    .line 201
    mul-float/2addr v5, v4

    .line 202
    sub-float/2addr v11, v5

    .line 203
    div-float/2addr v11, v0

    .line 204
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    float-to-double v4, v0

    .line 209
    const-wide v8, 0x403b2147ae147ae1L    # 27.13

    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    mul-double/2addr v4, v8

    .line 215
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    float-to-double v12, v0

    .line 220
    const-wide/high16 v14, 0x4079000000000000L    # 400.0

    .line 221
    .line 222
    sub-double v12, v14, v12

    .line 223
    .line 224
    div-double/2addr v4, v12

    .line 225
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(DD)D

    .line 226
    .line 227
    .line 228
    move-result-wide v4

    .line 229
    double-to-float v0, v4

    .line 230
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    const/high16 v4, 0x42c80000    # 100.0f

    .line 235
    .line 236
    div-float/2addr v4, v10

    .line 237
    mul-float/2addr v2, v4

    .line 238
    float-to-double v12, v0

    .line 239
    move-wide/from16 v16, v8

    .line 240
    .line 241
    const-wide v8, 0x40030c30c30c30c3L    # 2.380952380952381

    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    invoke-static {v12, v13, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 247
    .line 248
    .line 249
    move-result-wide v12

    .line 250
    double-to-float v0, v12

    .line 251
    mul-float/2addr v2, v0

    .line 252
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    float-to-double v12, v0

    .line 257
    mul-double v12, v12, v16

    .line 258
    .line 259
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    move-wide/from16 v18, v14

    .line 264
    .line 265
    float-to-double v14, v0

    .line 266
    sub-double v14, v18, v14

    .line 267
    .line 268
    div-double/2addr v12, v14

    .line 269
    invoke-static {v6, v7, v12, v13}, Ljava/lang/Math;->max(DD)D

    .line 270
    .line 271
    .line 272
    move-result-wide v12

    .line 273
    double-to-float v0, v12

    .line 274
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    mul-float/2addr v3, v4

    .line 279
    float-to-double v12, v0

    .line 280
    invoke-static {v12, v13, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 281
    .line 282
    .line 283
    move-result-wide v12

    .line 284
    double-to-float v0, v12

    .line 285
    mul-float/2addr v3, v0

    .line 286
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    float-to-double v12, v0

    .line 291
    mul-double v12, v12, v16

    .line 292
    .line 293
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    float-to-double v14, v0

    .line 298
    sub-double v14, v18, v14

    .line 299
    .line 300
    div-double/2addr v12, v14

    .line 301
    invoke-static {v6, v7, v12, v13}, Ljava/lang/Math;->max(DD)D

    .line 302
    .line 303
    .line 304
    move-result-wide v5

    .line 305
    double-to-float v0, v5

    .line 306
    invoke-static {v11}, Ljava/lang/Math;->signum(F)F

    .line 307
    .line 308
    .line 309
    move-result v5

    .line 310
    mul-float/2addr v5, v4

    .line 311
    float-to-double v6, v0

    .line 312
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 313
    .line 314
    .line 315
    move-result-wide v6

    .line 316
    double-to-float v0, v6

    .line 317
    mul-float/2addr v5, v0

    .line 318
    iget-object v0, v1, Lp53;->g:[F

    .line 319
    .line 320
    const/4 v1, 0x0

    .line 321
    aget v4, v0, v1

    .line 322
    .line 323
    div-float/2addr v2, v4

    .line 324
    const/4 v4, 0x1

    .line 325
    aget v6, v0, v4

    .line 326
    .line 327
    div-float/2addr v3, v6

    .line 328
    const/4 v6, 0x2

    .line 329
    aget v0, v0, v6

    .line 330
    .line 331
    div-float/2addr v5, v0

    .line 332
    sget-object v0, Lj13;->c:[[F

    .line 333
    .line 334
    aget-object v7, v0, v1

    .line 335
    .line 336
    aget v8, v7, v1

    .line 337
    .line 338
    mul-float/2addr v8, v2

    .line 339
    aget v9, v7, v4

    .line 340
    .line 341
    mul-float/2addr v9, v3

    .line 342
    add-float/2addr v9, v8

    .line 343
    aget v7, v7, v6

    .line 344
    .line 345
    mul-float/2addr v7, v5

    .line 346
    add-float/2addr v7, v9

    .line 347
    aget-object v8, v0, v4

    .line 348
    .line 349
    aget v9, v8, v1

    .line 350
    .line 351
    mul-float/2addr v9, v2

    .line 352
    aget v10, v8, v4

    .line 353
    .line 354
    mul-float/2addr v10, v3

    .line 355
    add-float/2addr v10, v9

    .line 356
    aget v8, v8, v6

    .line 357
    .line 358
    mul-float/2addr v8, v5

    .line 359
    add-float/2addr v8, v10

    .line 360
    aget-object v0, v0, v6

    .line 361
    .line 362
    aget v1, v0, v1

    .line 363
    .line 364
    mul-float/2addr v2, v1

    .line 365
    aget v1, v0, v4

    .line 366
    .line 367
    mul-float/2addr v3, v1

    .line 368
    add-float/2addr v3, v2

    .line 369
    aget v0, v0, v6

    .line 370
    .line 371
    mul-float/2addr v5, v0

    .line 372
    add-float/2addr v5, v3

    .line 373
    float-to-double v9, v7

    .line 374
    float-to-double v11, v8

    .line 375
    float-to-double v13, v5

    .line 376
    invoke-static/range {v9 .. v14}, Lbx;->a(DDD)I

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    return v0
.end method

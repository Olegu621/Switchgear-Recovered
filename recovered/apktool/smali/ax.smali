.class public abstract Lax;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Ljava/lang/ThreadLocal;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax;->a:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-static/range {p1 .. p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    :goto_0
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x1

    .line 14
    const/4 v5, 0x2

    .line 15
    if-eq v3, v5, :cond_0

    .line 16
    .line 17
    if-eq v3, v4, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-ne v3, v5, :cond_25

    .line 21
    .line 22
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const-string v6, "selector"

    .line 27
    .line 28
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-eqz v6, :cond_24

    .line 33
    .line 34
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    add-int/2addr v3, v4

    .line 39
    const/16 v6, 0x14

    .line 40
    .line 41
    new-array v7, v6, [[I

    .line 42
    .line 43
    new-array v6, v6, [I

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    move v9, v8

    .line 47
    :goto_1
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    if-eq v10, v4, :cond_23

    .line 52
    .line 53
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    if-ge v11, v3, :cond_1

    .line 58
    .line 59
    const/4 v12, 0x3

    .line 60
    if-eq v10, v12, :cond_23

    .line 61
    .line 62
    :cond_1
    if-ne v10, v5, :cond_2

    .line 63
    .line 64
    if-gt v11, v3, :cond_2

    .line 65
    .line 66
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    const-string v11, "item"

    .line 71
    .line 72
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    if-nez v10, :cond_3

    .line 77
    .line 78
    :cond_2
    move-object/from16 v33, v2

    .line 79
    .line 80
    move/from16 v35, v3

    .line 81
    .line 82
    move/from16 v16, v4

    .line 83
    .line 84
    move/from16 v17, v5

    .line 85
    .line 86
    goto/16 :goto_19

    .line 87
    .line 88
    :cond_3
    sget-object v10, Landroidx/core/R$styleable;->ColorStateListItem:[I

    .line 89
    .line 90
    if-nez v1, :cond_4

    .line 91
    .line 92
    invoke-virtual {v0, v2, v10}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    goto :goto_2

    .line 97
    :cond_4
    invoke-virtual {v1, v2, v10, v8, v8}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    :goto_2
    sget v11, Landroidx/core/R$styleable;->ColorStateListItem_android_color:I

    .line 102
    .line 103
    const/4 v12, -0x1

    .line 104
    invoke-virtual {v10, v11, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 105
    .line 106
    .line 107
    move-result v11

    .line 108
    const v13, -0xff01

    .line 109
    .line 110
    .line 111
    const/16 v14, 0x1f

    .line 112
    .line 113
    if-eq v11, v12, :cond_7

    .line 114
    .line 115
    sget-object v12, Lax;->a:Ljava/lang/ThreadLocal;

    .line 116
    .line 117
    invoke-virtual {v12}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v15

    .line 121
    check-cast v15, Landroid/util/TypedValue;

    .line 122
    .line 123
    if-nez v15, :cond_5

    .line 124
    .line 125
    new-instance v15, Landroid/util/TypedValue;

    .line 126
    .line 127
    invoke-direct {v15}, Landroid/util/TypedValue;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v12, v15}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_5
    invoke-virtual {v0, v11, v15, v4}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 134
    .line 135
    .line 136
    iget v12, v15, Landroid/util/TypedValue;->type:I

    .line 137
    .line 138
    const/16 v15, 0x1c

    .line 139
    .line 140
    if-lt v12, v15, :cond_6

    .line 141
    .line 142
    if-gt v12, v14, :cond_6

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_6
    :try_start_0
    invoke-virtual {v0, v11}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 146
    .line 147
    .line 148
    move-result-object v11

    .line 149
    invoke-static {v0, v11, v1}, Lax;->a(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    .line 150
    .line 151
    .line 152
    move-result-object v11

    .line 153
    invoke-virtual {v11}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 154
    .line 155
    .line 156
    move-result v11
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    goto :goto_4

    .line 158
    :catch_0
    sget v11, Landroidx/core/R$styleable;->ColorStateListItem_android_color:I

    .line 159
    .line 160
    invoke-virtual {v10, v11, v13}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 161
    .line 162
    .line 163
    move-result v11

    .line 164
    goto :goto_4

    .line 165
    :cond_7
    :goto_3
    sget v11, Landroidx/core/R$styleable;->ColorStateListItem_android_color:I

    .line 166
    .line 167
    invoke-virtual {v10, v11, v13}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    :goto_4
    sget v12, Landroidx/core/R$styleable;->ColorStateListItem_android_alpha:I

    .line 172
    .line 173
    invoke-virtual {v10, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    const/high16 v13, 0x3f800000    # 1.0f

    .line 178
    .line 179
    if-eqz v12, :cond_8

    .line 180
    .line 181
    sget v12, Landroidx/core/R$styleable;->ColorStateListItem_android_alpha:I

    .line 182
    .line 183
    invoke-virtual {v10, v12, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 184
    .line 185
    .line 186
    move-result v12

    .line 187
    goto :goto_5

    .line 188
    :cond_8
    sget v12, Landroidx/core/R$styleable;->ColorStateListItem_alpha:I

    .line 189
    .line 190
    invoke-virtual {v10, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 191
    .line 192
    .line 193
    move-result v12

    .line 194
    if-eqz v12, :cond_9

    .line 195
    .line 196
    sget v12, Landroidx/core/R$styleable;->ColorStateListItem_alpha:I

    .line 197
    .line 198
    invoke-virtual {v10, v12, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 199
    .line 200
    .line 201
    move-result v12

    .line 202
    goto :goto_5

    .line 203
    :cond_9
    move v12, v13

    .line 204
    :goto_5
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 205
    .line 206
    move/from16 v16, v4

    .line 207
    .line 208
    const/high16 v4, -0x40800000    # -1.0f

    .line 209
    .line 210
    if-lt v15, v14, :cond_a

    .line 211
    .line 212
    sget v14, Landroidx/core/R$styleable;->ColorStateListItem_android_lStar:I

    .line 213
    .line 214
    invoke-virtual {v10, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 215
    .line 216
    .line 217
    move-result v14

    .line 218
    if-eqz v14, :cond_a

    .line 219
    .line 220
    sget v14, Landroidx/core/R$styleable;->ColorStateListItem_android_lStar:I

    .line 221
    .line 222
    invoke-virtual {v10, v14, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    goto :goto_6

    .line 227
    :cond_a
    sget v14, Landroidx/core/R$styleable;->ColorStateListItem_lStar:I

    .line 228
    .line 229
    invoke-virtual {v10, v14, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    :goto_6
    invoke-virtual {v10}, Landroid/content/res/TypedArray;->recycle()V

    .line 234
    .line 235
    .line 236
    invoke-interface {v2}, Landroid/util/AttributeSet;->getAttributeCount()I

    .line 237
    .line 238
    .line 239
    move-result v10

    .line 240
    new-array v14, v10, [I

    .line 241
    .line 242
    move/from16 v17, v5

    .line 243
    .line 244
    move v5, v8

    .line 245
    move v15, v5

    .line 246
    :goto_7
    if-ge v15, v10, :cond_d

    .line 247
    .line 248
    move/from16 v18, v13

    .line 249
    .line 250
    invoke-interface {v2, v15}, Landroid/util/AttributeSet;->getAttributeNameResource(I)I

    .line 251
    .line 252
    .line 253
    move-result v13

    .line 254
    const v8, 0x10101a5

    .line 255
    .line 256
    .line 257
    if-eq v13, v8, :cond_c

    .line 258
    .line 259
    const v8, 0x101031f

    .line 260
    .line 261
    .line 262
    if-eq v13, v8, :cond_c

    .line 263
    .line 264
    sget v8, Landroidx/core/R$attr;->alpha:I

    .line 265
    .line 266
    if-eq v13, v8, :cond_c

    .line 267
    .line 268
    sget v8, Landroidx/core/R$attr;->lStar:I

    .line 269
    .line 270
    if-eq v13, v8, :cond_c

    .line 271
    .line 272
    add-int/lit8 v8, v5, 0x1

    .line 273
    .line 274
    const/4 v0, 0x0

    .line 275
    invoke-interface {v2, v15, v0}, Landroid/util/AttributeSet;->getAttributeBooleanValue(IZ)Z

    .line 276
    .line 277
    .line 278
    move-result v20

    .line 279
    if-eqz v20, :cond_b

    .line 280
    .line 281
    goto :goto_8

    .line 282
    :cond_b
    neg-int v13, v13

    .line 283
    :goto_8
    aput v13, v14, v5

    .line 284
    .line 285
    move v5, v8

    .line 286
    :cond_c
    add-int/lit8 v15, v15, 0x1

    .line 287
    .line 288
    move-object/from16 v0, p0

    .line 289
    .line 290
    move/from16 v13, v18

    .line 291
    .line 292
    const/4 v8, 0x0

    .line 293
    goto :goto_7

    .line 294
    :cond_d
    move/from16 v18, v13

    .line 295
    .line 296
    invoke-static {v14, v5}, Landroid/util/StateSet;->trimStateSet([II)[I

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    const/4 v5, 0x0

    .line 301
    cmpl-float v8, v4, v5

    .line 302
    .line 303
    const/high16 v10, 0x42c80000    # 100.0f

    .line 304
    .line 305
    if-ltz v8, :cond_e

    .line 306
    .line 307
    cmpg-float v8, v4, v10

    .line 308
    .line 309
    if-gtz v8, :cond_e

    .line 310
    .line 311
    move/from16 v8, v16

    .line 312
    .line 313
    goto :goto_9

    .line 314
    :cond_e
    const/4 v8, 0x0

    .line 315
    :goto_9
    cmpl-float v13, v12, v18

    .line 316
    .line 317
    if-nez v13, :cond_f

    .line 318
    .line 319
    if-nez v8, :cond_f

    .line 320
    .line 321
    move-object/from16 v31, v0

    .line 322
    .line 323
    move-object/from16 v33, v2

    .line 324
    .line 325
    move/from16 v35, v3

    .line 326
    .line 327
    goto/16 :goto_16

    .line 328
    .line 329
    :cond_f
    invoke-static {v11}, Landroid/graphics/Color;->alpha(I)I

    .line 330
    .line 331
    .line 332
    move-result v13

    .line 333
    int-to-float v13, v13

    .line 334
    mul-float/2addr v13, v12

    .line 335
    const/high16 v12, 0x3f000000    # 0.5f

    .line 336
    .line 337
    add-float/2addr v13, v12

    .line 338
    float-to-int v12, v13

    .line 339
    const/16 v13, 0xff

    .line 340
    .line 341
    const/4 v14, 0x0

    .line 342
    invoke-static {v12, v14, v13}, Lqj3;->c(III)I

    .line 343
    .line 344
    .line 345
    move-result v12

    .line 346
    if-eqz v8, :cond_1e

    .line 347
    .line 348
    invoke-static {v11}, Lzm;->b(I)Lzm;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    iget v11, v8, Lzm;->a:F

    .line 353
    .line 354
    iget v8, v8, Lzm;->b:F

    .line 355
    .line 356
    sget-object v13, Lp53;->k:Lp53;

    .line 357
    .line 358
    float-to-double v14, v8

    .line 359
    const-wide/high16 v20, 0x3ff0000000000000L    # 1.0

    .line 360
    .line 361
    cmpg-double v14, v14, v20

    .line 362
    .line 363
    if-ltz v14, :cond_10

    .line 364
    .line 365
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 366
    .line 367
    .line 368
    move-result v14

    .line 369
    int-to-double v14, v14

    .line 370
    const-wide/16 v20, 0x0

    .line 371
    .line 372
    cmpg-double v14, v14, v20

    .line 373
    .line 374
    if-lez v14, :cond_10

    .line 375
    .line 376
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 377
    .line 378
    .line 379
    move-result v14

    .line 380
    int-to-double v14, v14

    .line 381
    const-wide/high16 v20, 0x4059000000000000L    # 100.0

    .line 382
    .line 383
    cmpl-double v14, v14, v20

    .line 384
    .line 385
    if-ltz v14, :cond_11

    .line 386
    .line 387
    :cond_10
    move-object/from16 v31, v0

    .line 388
    .line 389
    move-object/from16 v33, v2

    .line 390
    .line 391
    move/from16 v35, v3

    .line 392
    .line 393
    goto/16 :goto_14

    .line 394
    .line 395
    :cond_11
    cmpg-float v14, v11, v5

    .line 396
    .line 397
    if-gez v14, :cond_12

    .line 398
    .line 399
    move v11, v5

    .line 400
    goto :goto_a

    .line 401
    :cond_12
    const/high16 v14, 0x43b40000    # 360.0f

    .line 402
    .line 403
    invoke-static {v14, v11}, Ljava/lang/Math;->min(FF)F

    .line 404
    .line 405
    .line 406
    move-result v11

    .line 407
    :goto_a
    move/from16 v21, v5

    .line 408
    .line 409
    move/from16 v22, v21

    .line 410
    .line 411
    move v15, v8

    .line 412
    move/from16 v20, v16

    .line 413
    .line 414
    const/4 v5, 0x0

    .line 415
    :goto_b
    sub-float v23, v21, v8

    .line 416
    .line 417
    invoke-static/range {v23 .. v23}, Ljava/lang/Math;->abs(F)F

    .line 418
    .line 419
    .line 420
    move-result v23

    .line 421
    const v24, 0x3ecccccd    # 0.4f

    .line 422
    .line 423
    .line 424
    cmpl-float v23, v23, v24

    .line 425
    .line 426
    if-ltz v23, :cond_1c

    .line 427
    .line 428
    const/high16 v23, 0x447a0000    # 1000.0f

    .line 429
    .line 430
    move/from16 v26, v10

    .line 431
    .line 432
    move/from16 v25, v22

    .line 433
    .line 434
    move/from16 v24, v23

    .line 435
    .line 436
    const/16 v27, 0x0

    .line 437
    .line 438
    :goto_c
    sub-float v28, v25, v26

    .line 439
    .line 440
    invoke-static/range {v28 .. v28}, Ljava/lang/Math;->abs(F)F

    .line 441
    .line 442
    .line 443
    move-result v28

    .line 444
    const v29, 0x3c23d70a    # 0.01f

    .line 445
    .line 446
    .line 447
    cmpl-float v28, v28, v29

    .line 448
    .line 449
    const/high16 v29, 0x40000000    # 2.0f

    .line 450
    .line 451
    if-lez v28, :cond_18

    .line 452
    .line 453
    sub-float v28, v26, v25

    .line 454
    .line 455
    div-float v28, v28, v29

    .line 456
    .line 457
    move/from16 v30, v10

    .line 458
    .line 459
    add-float v10, v28, v25

    .line 460
    .line 461
    invoke-static {v10, v15, v11}, Lzm;->c(FFF)Lzm;

    .line 462
    .line 463
    .line 464
    move-result-object v14

    .line 465
    move-object/from16 v31, v0

    .line 466
    .line 467
    sget-object v0, Lp53;->k:Lp53;

    .line 468
    .line 469
    invoke-virtual {v14, v0}, Lzm;->d(Lp53;)I

    .line 470
    .line 471
    .line 472
    move-result v0

    .line 473
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 474
    .line 475
    .line 476
    move-result v14

    .line 477
    invoke-static {v14}, Lj13;->n(I)F

    .line 478
    .line 479
    .line 480
    move-result v14

    .line 481
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 482
    .line 483
    .line 484
    move-result v32

    .line 485
    invoke-static/range {v32 .. v32}, Lj13;->n(I)F

    .line 486
    .line 487
    .line 488
    move-result v32

    .line 489
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 490
    .line 491
    .line 492
    move-result v33

    .line 493
    invoke-static/range {v33 .. v33}, Lj13;->n(I)F

    .line 494
    .line 495
    .line 496
    move-result v33

    .line 497
    sget-object v34, Lj13;->e:[[F

    .line 498
    .line 499
    aget-object v34, v34, v16

    .line 500
    .line 501
    const/16 v19, 0x0

    .line 502
    .line 503
    aget v35, v34, v19

    .line 504
    .line 505
    mul-float v14, v14, v35

    .line 506
    .line 507
    aget v35, v34, v16

    .line 508
    .line 509
    mul-float v32, v32, v35

    .line 510
    .line 511
    add-float v32, v32, v14

    .line 512
    .line 513
    aget v14, v34, v17

    .line 514
    .line 515
    mul-float v33, v33, v14

    .line 516
    .line 517
    add-float v33, v33, v32

    .line 518
    .line 519
    div-float v14, v33, v30

    .line 520
    .line 521
    const v32, 0x3c111aa7

    .line 522
    .line 523
    .line 524
    cmpg-float v32, v14, v32

    .line 525
    .line 526
    if-gtz v32, :cond_13

    .line 527
    .line 528
    const v32, 0x4461d2f7

    .line 529
    .line 530
    .line 531
    mul-float v14, v14, v32

    .line 532
    .line 533
    move/from16 v32, v0

    .line 534
    .line 535
    goto :goto_d

    .line 536
    :cond_13
    move/from16 v32, v0

    .line 537
    .line 538
    float-to-double v0, v14

    .line 539
    invoke-static {v0, v1}, Ljava/lang/Math;->cbrt(D)D

    .line 540
    .line 541
    .line 542
    move-result-wide v0

    .line 543
    double-to-float v0, v0

    .line 544
    const/high16 v1, 0x42e80000    # 116.0f

    .line 545
    .line 546
    mul-float/2addr v0, v1

    .line 547
    const/high16 v1, 0x41800000    # 16.0f

    .line 548
    .line 549
    sub-float v14, v0, v1

    .line 550
    .line 551
    :goto_d
    sub-float v0, v4, v14

    .line 552
    .line 553
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 554
    .line 555
    .line 556
    move-result v0

    .line 557
    const v1, 0x3e4ccccd    # 0.2f

    .line 558
    .line 559
    .line 560
    cmpg-float v1, v0, v1

    .line 561
    .line 562
    if-gez v1, :cond_14

    .line 563
    .line 564
    invoke-static/range {v32 .. v32}, Lzm;->b(I)Lzm;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    move/from16 v32, v0

    .line 569
    .line 570
    iget v0, v1, Lzm;->c:F

    .line 571
    .line 572
    move-object/from16 v33, v2

    .line 573
    .line 574
    iget v2, v1, Lzm;->b:F

    .line 575
    .line 576
    invoke-static {v0, v2, v11}, Lzm;->c(FFF)Lzm;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    iget v2, v1, Lzm;->d:F

    .line 581
    .line 582
    move/from16 v34, v2

    .line 583
    .line 584
    iget v2, v0, Lzm;->d:F

    .line 585
    .line 586
    sub-float v2, v34, v2

    .line 587
    .line 588
    move/from16 v34, v2

    .line 589
    .line 590
    iget v2, v1, Lzm;->e:F

    .line 591
    .line 592
    move/from16 v35, v2

    .line 593
    .line 594
    iget v2, v0, Lzm;->e:F

    .line 595
    .line 596
    sub-float v2, v35, v2

    .line 597
    .line 598
    move/from16 v35, v2

    .line 599
    .line 600
    iget v2, v1, Lzm;->f:F

    .line 601
    .line 602
    iget v0, v0, Lzm;->f:F

    .line 603
    .line 604
    sub-float/2addr v2, v0

    .line 605
    mul-float v0, v34, v34

    .line 606
    .line 607
    mul-float v34, v35, v35

    .line 608
    .line 609
    add-float v34, v34, v0

    .line 610
    .line 611
    mul-float/2addr v2, v2

    .line 612
    add-float v2, v2, v34

    .line 613
    .line 614
    move-object/from16 v34, v1

    .line 615
    .line 616
    float-to-double v0, v2

    .line 617
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 618
    .line 619
    .line 620
    move-result-wide v0

    .line 621
    move/from16 v35, v3

    .line 622
    .line 623
    const-wide v2, 0x3fe428f5c28f5c29L    # 0.63

    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 629
    .line 630
    .line 631
    move-result-wide v0

    .line 632
    const-wide v2, 0x3ff68f5c28f5c28fL    # 1.41

    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    mul-double/2addr v0, v2

    .line 638
    double-to-float v0, v0

    .line 639
    cmpg-float v1, v0, v18

    .line 640
    .line 641
    if-gtz v1, :cond_15

    .line 642
    .line 643
    move/from16 v24, v0

    .line 644
    .line 645
    move/from16 v23, v32

    .line 646
    .line 647
    move-object/from16 v27, v34

    .line 648
    .line 649
    goto :goto_e

    .line 650
    :cond_14
    move-object/from16 v33, v2

    .line 651
    .line 652
    move/from16 v35, v3

    .line 653
    .line 654
    :cond_15
    :goto_e
    cmpl-float v0, v23, v22

    .line 655
    .line 656
    if-nez v0, :cond_16

    .line 657
    .line 658
    cmpl-float v0, v24, v22

    .line 659
    .line 660
    if-nez v0, :cond_16

    .line 661
    .line 662
    :goto_f
    move-object/from16 v0, v27

    .line 663
    .line 664
    goto :goto_11

    .line 665
    :cond_16
    cmpg-float v0, v14, v4

    .line 666
    .line 667
    if-gez v0, :cond_17

    .line 668
    .line 669
    move/from16 v25, v10

    .line 670
    .line 671
    goto :goto_10

    .line 672
    :cond_17
    move/from16 v26, v10

    .line 673
    .line 674
    :goto_10
    move-object/from16 v1, p2

    .line 675
    .line 676
    move/from16 v10, v30

    .line 677
    .line 678
    move-object/from16 v0, v31

    .line 679
    .line 680
    move-object/from16 v2, v33

    .line 681
    .line 682
    move/from16 v3, v35

    .line 683
    .line 684
    goto/16 :goto_c

    .line 685
    .line 686
    :cond_18
    move-object/from16 v31, v0

    .line 687
    .line 688
    move-object/from16 v33, v2

    .line 689
    .line 690
    move/from16 v35, v3

    .line 691
    .line 692
    move/from16 v30, v10

    .line 693
    .line 694
    goto :goto_f

    .line 695
    :goto_11
    if-eqz v20, :cond_1a

    .line 696
    .line 697
    if-eqz v0, :cond_19

    .line 698
    .line 699
    invoke-virtual {v0, v13}, Lzm;->d(Lp53;)I

    .line 700
    .line 701
    .line 702
    move-result v0

    .line 703
    :goto_12
    move v11, v0

    .line 704
    goto :goto_15

    .line 705
    :cond_19
    sub-float v0, v8, v21

    .line 706
    .line 707
    div-float v0, v0, v29

    .line 708
    .line 709
    add-float v15, v0, v21

    .line 710
    .line 711
    move-object/from16 v1, p2

    .line 712
    .line 713
    move/from16 v10, v30

    .line 714
    .line 715
    move-object/from16 v0, v31

    .line 716
    .line 717
    move-object/from16 v2, v33

    .line 718
    .line 719
    move/from16 v3, v35

    .line 720
    .line 721
    const/16 v20, 0x0

    .line 722
    .line 723
    goto/16 :goto_b

    .line 724
    .line 725
    :cond_1a
    if-nez v0, :cond_1b

    .line 726
    .line 727
    move v8, v15

    .line 728
    goto :goto_13

    .line 729
    :cond_1b
    move-object v5, v0

    .line 730
    move/from16 v21, v15

    .line 731
    .line 732
    :goto_13
    sub-float v0, v8, v21

    .line 733
    .line 734
    div-float v0, v0, v29

    .line 735
    .line 736
    add-float v15, v0, v21

    .line 737
    .line 738
    move-object/from16 v1, p2

    .line 739
    .line 740
    move/from16 v10, v30

    .line 741
    .line 742
    move-object/from16 v0, v31

    .line 743
    .line 744
    move-object/from16 v2, v33

    .line 745
    .line 746
    move/from16 v3, v35

    .line 747
    .line 748
    goto/16 :goto_b

    .line 749
    .line 750
    :cond_1c
    move-object/from16 v31, v0

    .line 751
    .line 752
    move-object/from16 v33, v2

    .line 753
    .line 754
    move/from16 v35, v3

    .line 755
    .line 756
    if-nez v5, :cond_1d

    .line 757
    .line 758
    invoke-static {v4}, Lj13;->k(F)I

    .line 759
    .line 760
    .line 761
    move-result v0

    .line 762
    goto :goto_12

    .line 763
    :cond_1d
    invoke-virtual {v5, v13}, Lzm;->d(Lp53;)I

    .line 764
    .line 765
    .line 766
    move-result v0

    .line 767
    goto :goto_12

    .line 768
    :goto_14
    invoke-static {v4}, Lj13;->k(F)I

    .line 769
    .line 770
    .line 771
    move-result v0

    .line 772
    goto :goto_12

    .line 773
    :cond_1e
    move-object/from16 v31, v0

    .line 774
    .line 775
    move-object/from16 v33, v2

    .line 776
    .line 777
    move/from16 v35, v3

    .line 778
    .line 779
    :goto_15
    const v0, 0xffffff

    .line 780
    .line 781
    .line 782
    and-int/2addr v0, v11

    .line 783
    shl-int/lit8 v1, v12, 0x18

    .line 784
    .line 785
    or-int v11, v0, v1

    .line 786
    .line 787
    :goto_16
    add-int/lit8 v0, v9, 0x1

    .line 788
    .line 789
    array-length v1, v6

    .line 790
    const/16 v2, 0x8

    .line 791
    .line 792
    const/4 v3, 0x4

    .line 793
    if-le v0, v1, :cond_20

    .line 794
    .line 795
    if-gt v9, v3, :cond_1f

    .line 796
    .line 797
    move v1, v2

    .line 798
    goto :goto_17

    .line 799
    :cond_1f
    mul-int/lit8 v1, v9, 0x2

    .line 800
    .line 801
    :goto_17
    new-array v1, v1, [I

    .line 802
    .line 803
    const/4 v14, 0x0

    .line 804
    invoke-static {v6, v14, v1, v14, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 805
    .line 806
    .line 807
    move-object v6, v1

    .line 808
    :cond_20
    aput v11, v6, v9

    .line 809
    .line 810
    array-length v1, v7

    .line 811
    if-le v0, v1, :cond_22

    .line 812
    .line 813
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 814
    .line 815
    .line 816
    move-result-object v1

    .line 817
    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 818
    .line 819
    .line 820
    move-result-object v1

    .line 821
    if-gt v9, v3, :cond_21

    .line 822
    .line 823
    goto :goto_18

    .line 824
    :cond_21
    mul-int/lit8 v2, v9, 0x2

    .line 825
    .line 826
    :goto_18
    invoke-static {v1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v1

    .line 830
    check-cast v1, [Ljava/lang/Object;

    .line 831
    .line 832
    const/4 v14, 0x0

    .line 833
    invoke-static {v7, v14, v1, v14, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 834
    .line 835
    .line 836
    move-object v7, v1

    .line 837
    :cond_22
    aput-object v31, v7, v9

    .line 838
    .line 839
    check-cast v7, [[I

    .line 840
    .line 841
    move-object/from16 v1, p2

    .line 842
    .line 843
    move v9, v0

    .line 844
    move/from16 v4, v16

    .line 845
    .line 846
    move/from16 v5, v17

    .line 847
    .line 848
    move-object/from16 v2, v33

    .line 849
    .line 850
    move/from16 v3, v35

    .line 851
    .line 852
    const/4 v8, 0x0

    .line 853
    move-object/from16 v0, p0

    .line 854
    .line 855
    goto/16 :goto_1

    .line 856
    .line 857
    :goto_19
    move-object/from16 v0, p0

    .line 858
    .line 859
    move-object/from16 v1, p2

    .line 860
    .line 861
    move/from16 v4, v16

    .line 862
    .line 863
    move/from16 v5, v17

    .line 864
    .line 865
    move-object/from16 v2, v33

    .line 866
    .line 867
    move/from16 v3, v35

    .line 868
    .line 869
    const/4 v8, 0x0

    .line 870
    goto/16 :goto_1

    .line 871
    .line 872
    :cond_23
    new-array v0, v9, [I

    .line 873
    .line 874
    new-array v1, v9, [[I

    .line 875
    .line 876
    const/4 v14, 0x0

    .line 877
    invoke-static {v6, v14, v0, v14, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 878
    .line 879
    .line 880
    invoke-static {v7, v14, v1, v14, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 881
    .line 882
    .line 883
    new-instance v2, Landroid/content/res/ColorStateList;

    .line 884
    .line 885
    invoke-direct {v2, v1, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 886
    .line 887
    .line 888
    return-object v2

    .line 889
    :cond_24
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 890
    .line 891
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    .line 892
    .line 893
    .line 894
    move-result-object v1

    .line 895
    new-instance v2, Ljava/lang/StringBuilder;

    .line 896
    .line 897
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 898
    .line 899
    .line 900
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 901
    .line 902
    .line 903
    const-string v1, ": invalid color state list tag "

    .line 904
    .line 905
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 909
    .line 910
    .line 911
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v1

    .line 915
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 916
    .line 917
    .line 918
    throw v0

    .line 919
    :cond_25
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 920
    .line 921
    const-string v1, "No start tag found"

    .line 922
    .line 923
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 924
    .line 925
    .line 926
    throw v0
.end method

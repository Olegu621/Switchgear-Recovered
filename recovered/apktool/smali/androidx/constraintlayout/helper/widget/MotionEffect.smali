.class public Landroidx/constraintlayout/helper/widget/MotionEffect;
.super Landroidx/constraintlayout/motion/widget/MotionHelper;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a0:F

.field public b0:I

.field public c0:I

.field public d0:I

.field public e0:I

.field public f0:Z

.field public g0:I

.field public h0:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/motion/widget/MotionHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const v0, 0x3dcccccd    # 0.1f

    .line 5
    .line 6
    .line 7
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->a0:F

    .line 8
    .line 9
    const/16 v0, 0x31

    .line 10
    .line 11
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->b0:I

    .line 12
    .line 13
    const/16 v0, 0x32

    .line 14
    .line 15
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->c0:I

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->d0:I

    .line 19
    .line 20
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->e0:I

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->f0:Z

    .line 24
    .line 25
    const/4 v0, -0x1

    .line 26
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->g0:I

    .line 27
    .line 28
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->h0:I

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/helper/widget/MotionEffect;->s(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/motion/widget/MotionHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const p3, 0x3dcccccd    # 0.1f

    .line 35
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->a0:F

    const/16 p3, 0x31

    .line 36
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->b0:I

    const/16 p3, 0x32

    .line 37
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->c0:I

    const/4 p3, 0x0

    .line 38
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->d0:I

    .line 39
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->e0:I

    const/4 p3, 0x1

    .line 40
    iput-boolean p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->f0:Z

    const/4 p3, -0x1

    .line 41
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->g0:I

    .line 42
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->h0:I

    .line 43
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/helper/widget/MotionEffect;->s(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final r(Landroidx/constraintlayout/motion/widget/MotionLayout;Ljava/util/HashMap;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const/4 v4, 0x1

    .line 11
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 20
    .line 21
    invoke-virtual {v0, v6}, Landroidx/constraintlayout/widget/ConstraintHelper;->j(Landroidx/constraintlayout/widget/ConstraintLayout;)[Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    if-nez v6, :cond_0

    .line 26
    .line 27
    invoke-static {}, Lde3;->s()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    new-instance v7, Lc31;

    .line 32
    .line 33
    invoke-direct {v7}, Lc31;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v8, Lc31;

    .line 37
    .line 38
    invoke-direct {v8}, Lc31;-><init>()V

    .line 39
    .line 40
    .line 41
    iget v9, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->a0:F

    .line 42
    .line 43
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    const-string v10, "alpha"

    .line 48
    .line 49
    invoke-virtual {v7, v9, v10}, Lc31;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget v9, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->a0:F

    .line 53
    .line 54
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    invoke-virtual {v8, v9, v10}, Lc31;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget v9, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->b0:I

    .line 62
    .line 63
    iput v9, v7, La31;->a:I

    .line 64
    .line 65
    iget v10, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->c0:I

    .line 66
    .line 67
    iput v10, v8, La31;->a:I

    .line 68
    .line 69
    new-instance v10, Ls31;

    .line 70
    .line 71
    invoke-direct {v10}, Ls31;-><init>()V

    .line 72
    .line 73
    .line 74
    iput v9, v10, La31;->a:I

    .line 75
    .line 76
    iput v2, v10, Ls31;->m:I

    .line 77
    .line 78
    const-string v9, "percentX"

    .line 79
    .line 80
    invoke-virtual {v10, v3, v9}, Ls31;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string v11, "percentY"

    .line 84
    .line 85
    invoke-virtual {v10, v3, v11}, Ls31;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    new-instance v12, Ls31;

    .line 89
    .line 90
    invoke-direct {v12}, Ls31;-><init>()V

    .line 91
    .line 92
    .line 93
    iget v13, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->c0:I

    .line 94
    .line 95
    iput v13, v12, La31;->a:I

    .line 96
    .line 97
    iput v2, v12, Ls31;->m:I

    .line 98
    .line 99
    invoke-virtual {v12, v5, v9}, Ls31;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v5, v11}, Ls31;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iget v5, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->d0:I

    .line 106
    .line 107
    const/4 v9, 0x0

    .line 108
    if-lez v5, :cond_1

    .line 109
    .line 110
    new-instance v5, Lc31;

    .line 111
    .line 112
    invoke-direct {v5}, Lc31;-><init>()V

    .line 113
    .line 114
    .line 115
    new-instance v11, Lc31;

    .line 116
    .line 117
    invoke-direct {v11}, Lc31;-><init>()V

    .line 118
    .line 119
    .line 120
    iget v13, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->d0:I

    .line 121
    .line 122
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v13

    .line 126
    const-string v14, "translationX"

    .line 127
    .line 128
    invoke-virtual {v5, v13, v14}, Lc31;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    iget v13, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->c0:I

    .line 132
    .line 133
    iput v13, v5, La31;->a:I

    .line 134
    .line 135
    invoke-virtual {v11, v3, v14}, Lc31;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget v13, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->c0:I

    .line 139
    .line 140
    sub-int/2addr v13, v4

    .line 141
    iput v13, v11, La31;->a:I

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_1
    move-object v5, v9

    .line 145
    move-object v11, v5

    .line 146
    :goto_0
    iget v13, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->e0:I

    .line 147
    .line 148
    if-lez v13, :cond_2

    .line 149
    .line 150
    new-instance v9, Lc31;

    .line 151
    .line 152
    invoke-direct {v9}, Lc31;-><init>()V

    .line 153
    .line 154
    .line 155
    new-instance v13, Lc31;

    .line 156
    .line 157
    invoke-direct {v13}, Lc31;-><init>()V

    .line 158
    .line 159
    .line 160
    iget v14, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->e0:I

    .line 161
    .line 162
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v14

    .line 166
    const-string v15, "translationY"

    .line 167
    .line 168
    invoke-virtual {v9, v14, v15}, Lc31;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    iget v14, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->c0:I

    .line 172
    .line 173
    iput v14, v9, La31;->a:I

    .line 174
    .line 175
    invoke-virtual {v13, v3, v15}, Lc31;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    iget v3, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->c0:I

    .line 179
    .line 180
    sub-int/2addr v3, v4

    .line 181
    iput v3, v13, La31;->a:I

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_2
    move-object v13, v9

    .line 185
    :goto_1
    iget v3, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->h0:I

    .line 186
    .line 187
    move/from16 v16, v2

    .line 188
    .line 189
    const/4 v2, -0x1

    .line 190
    const/16 v17, 0x0

    .line 191
    .line 192
    if-ne v3, v2, :cond_a

    .line 193
    .line 194
    const/4 v3, 0x4

    .line 195
    new-array v2, v3, [I

    .line 196
    .line 197
    move/from16 v15, v16

    .line 198
    .line 199
    const/16 v19, 0x3

    .line 200
    .line 201
    const/16 v20, 0x2

    .line 202
    .line 203
    :goto_2
    array-length v14, v6

    .line 204
    if-ge v15, v14, :cond_8

    .line 205
    .line 206
    aget-object v14, v6, v15

    .line 207
    .line 208
    invoke-virtual {v1, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v14

    .line 212
    check-cast v14, Lzj1;

    .line 213
    .line 214
    if-nez v14, :cond_3

    .line 215
    .line 216
    move-object/from16 v22, v2

    .line 217
    .line 218
    move/from16 v21, v4

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_3
    move/from16 v21, v4

    .line 222
    .line 223
    iget-object v4, v14, Lzj1;->g:Lik1;

    .line 224
    .line 225
    iget v3, v4, Lik1;->e:F

    .line 226
    .line 227
    iget-object v14, v14, Lzj1;->f:Lik1;

    .line 228
    .line 229
    move-object/from16 v22, v2

    .line 230
    .line 231
    iget v2, v14, Lik1;->e:F

    .line 232
    .line 233
    sub-float/2addr v3, v2

    .line 234
    iget v2, v4, Lik1;->f:F

    .line 235
    .line 236
    iget v4, v14, Lik1;->f:F

    .line 237
    .line 238
    sub-float/2addr v2, v4

    .line 239
    cmpg-float v4, v2, v17

    .line 240
    .line 241
    if-gez v4, :cond_4

    .line 242
    .line 243
    aget v4, v22, v21

    .line 244
    .line 245
    add-int/lit8 v4, v4, 0x1

    .line 246
    .line 247
    aput v4, v22, v21

    .line 248
    .line 249
    :cond_4
    cmpl-float v2, v2, v17

    .line 250
    .line 251
    if-lez v2, :cond_5

    .line 252
    .line 253
    aget v2, v22, v16

    .line 254
    .line 255
    add-int/lit8 v2, v2, 0x1

    .line 256
    .line 257
    aput v2, v22, v16

    .line 258
    .line 259
    :cond_5
    cmpl-float v2, v3, v17

    .line 260
    .line 261
    if-lez v2, :cond_6

    .line 262
    .line 263
    aget v2, v22, v19

    .line 264
    .line 265
    add-int/lit8 v2, v2, 0x1

    .line 266
    .line 267
    aput v2, v22, v19

    .line 268
    .line 269
    :cond_6
    cmpg-float v2, v3, v17

    .line 270
    .line 271
    if-gez v2, :cond_7

    .line 272
    .line 273
    aget v2, v22, v20

    .line 274
    .line 275
    add-int/lit8 v2, v2, 0x1

    .line 276
    .line 277
    aput v2, v22, v20

    .line 278
    .line 279
    :cond_7
    :goto_3
    add-int/lit8 v15, v15, 0x1

    .line 280
    .line 281
    move/from16 v4, v21

    .line 282
    .line 283
    move-object/from16 v2, v22

    .line 284
    .line 285
    const/4 v3, 0x4

    .line 286
    goto :goto_2

    .line 287
    :cond_8
    move-object/from16 v22, v2

    .line 288
    .line 289
    move/from16 v21, v4

    .line 290
    .line 291
    aget v2, v22, v16

    .line 292
    .line 293
    move/from16 v3, v16

    .line 294
    .line 295
    const/4 v14, 0x4

    .line 296
    :goto_4
    if-ge v4, v14, :cond_b

    .line 297
    .line 298
    aget v15, v22, v4

    .line 299
    .line 300
    if-ge v2, v15, :cond_9

    .line 301
    .line 302
    move v3, v4

    .line 303
    move v2, v15

    .line 304
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 305
    .line 306
    goto :goto_4

    .line 307
    :cond_a
    move/from16 v21, v4

    .line 308
    .line 309
    const/16 v19, 0x3

    .line 310
    .line 311
    const/16 v20, 0x2

    .line 312
    .line 313
    :cond_b
    move/from16 v2, v16

    .line 314
    .line 315
    :goto_5
    array-length v4, v6

    .line 316
    if-ge v2, v4, :cond_1b

    .line 317
    .line 318
    aget-object v4, v6, v2

    .line 319
    .line 320
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v4

    .line 324
    check-cast v4, Lzj1;

    .line 325
    .line 326
    if-nez v4, :cond_d

    .line 327
    .line 328
    move-object/from16 v15, p1

    .line 329
    .line 330
    move/from16 v16, v2

    .line 331
    .line 332
    :cond_c
    :goto_6
    const/16 v18, -0x1

    .line 333
    .line 334
    goto/16 :goto_c

    .line 335
    .line 336
    :cond_d
    iget-object v14, v4, Lzj1;->g:Lik1;

    .line 337
    .line 338
    iget v15, v14, Lik1;->e:F

    .line 339
    .line 340
    iget-object v1, v4, Lzj1;->f:Lik1;

    .line 341
    .line 342
    move/from16 v16, v2

    .line 343
    .line 344
    iget v2, v1, Lik1;->e:F

    .line 345
    .line 346
    sub-float/2addr v15, v2

    .line 347
    iget v2, v14, Lik1;->f:F

    .line 348
    .line 349
    iget v1, v1, Lik1;->f:F

    .line 350
    .line 351
    sub-float/2addr v2, v1

    .line 352
    if-nez v3, :cond_10

    .line 353
    .line 354
    cmpl-float v1, v2, v17

    .line 355
    .line 356
    if-lez v1, :cond_e

    .line 357
    .line 358
    iget-boolean v1, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->f0:Z

    .line 359
    .line 360
    if-eqz v1, :cond_f

    .line 361
    .line 362
    cmpl-float v1, v15, v17

    .line 363
    .line 364
    if-nez v1, :cond_e

    .line 365
    .line 366
    goto :goto_7

    .line 367
    :cond_e
    move/from16 v1, v19

    .line 368
    .line 369
    move/from16 v14, v20

    .line 370
    .line 371
    goto :goto_a

    .line 372
    :cond_f
    :goto_7
    move/from16 v1, v19

    .line 373
    .line 374
    move/from16 v14, v20

    .line 375
    .line 376
    goto :goto_9

    .line 377
    :cond_10
    move/from16 v1, v21

    .line 378
    .line 379
    if-ne v3, v1, :cond_11

    .line 380
    .line 381
    cmpg-float v2, v2, v17

    .line 382
    .line 383
    if-gez v2, :cond_e

    .line 384
    .line 385
    iget-boolean v2, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->f0:Z

    .line 386
    .line 387
    if-eqz v2, :cond_f

    .line 388
    .line 389
    cmpl-float v2, v15, v17

    .line 390
    .line 391
    if-nez v2, :cond_e

    .line 392
    .line 393
    goto :goto_7

    .line 394
    :cond_11
    move/from16 v14, v20

    .line 395
    .line 396
    if-ne v3, v14, :cond_14

    .line 397
    .line 398
    cmpg-float v15, v15, v17

    .line 399
    .line 400
    if-gez v15, :cond_12

    .line 401
    .line 402
    iget-boolean v15, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->f0:Z

    .line 403
    .line 404
    if-eqz v15, :cond_13

    .line 405
    .line 406
    cmpl-float v2, v2, v17

    .line 407
    .line 408
    if-nez v2, :cond_12

    .line 409
    .line 410
    goto :goto_8

    .line 411
    :cond_12
    move/from16 v1, v19

    .line 412
    .line 413
    goto :goto_a

    .line 414
    :cond_13
    :goto_8
    move/from16 v1, v19

    .line 415
    .line 416
    goto :goto_9

    .line 417
    :cond_14
    move/from16 v1, v19

    .line 418
    .line 419
    if-ne v3, v1, :cond_16

    .line 420
    .line 421
    cmpl-float v15, v15, v17

    .line 422
    .line 423
    if-lez v15, :cond_16

    .line 424
    .line 425
    iget-boolean v15, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->f0:Z

    .line 426
    .line 427
    if-eqz v15, :cond_15

    .line 428
    .line 429
    cmpl-float v2, v2, v17

    .line 430
    .line 431
    if-nez v2, :cond_16

    .line 432
    .line 433
    :cond_15
    :goto_9
    move-object/from16 v15, p1

    .line 434
    .line 435
    goto :goto_6

    .line 436
    :cond_16
    :goto_a
    iget v2, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->g0:I

    .line 437
    .line 438
    const/4 v15, -0x1

    .line 439
    if-ne v2, v15, :cond_18

    .line 440
    .line 441
    invoke-virtual {v4, v7}, Lzj1;->a(La31;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v4, v8}, Lzj1;->a(La31;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v4, v10}, Lzj1;->a(La31;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v4, v12}, Lzj1;->a(La31;)V

    .line 451
    .line 452
    .line 453
    iget v2, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->d0:I

    .line 454
    .line 455
    if-lez v2, :cond_17

    .line 456
    .line 457
    invoke-virtual {v4, v5}, Lzj1;->a(La31;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v4, v11}, Lzj1;->a(La31;)V

    .line 461
    .line 462
    .line 463
    :cond_17
    iget v2, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->e0:I

    .line 464
    .line 465
    if-lez v2, :cond_15

    .line 466
    .line 467
    invoke-virtual {v4, v9}, Lzj1;->a(La31;)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v4, v13}, Lzj1;->a(La31;)V

    .line 471
    .line 472
    .line 473
    goto :goto_9

    .line 474
    :cond_18
    move-object/from16 v15, p1

    .line 475
    .line 476
    iget-object v1, v15, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 477
    .line 478
    if-eqz v1, :cond_c

    .line 479
    .line 480
    iget-object v1, v1, Llk1;->q:Lb5;

    .line 481
    .line 482
    iget-object v1, v1, Lb5;->c:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v1, Ljava/util/ArrayList;

    .line 485
    .line 486
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 491
    .line 492
    .line 493
    move-result v20

    .line 494
    if-eqz v20, :cond_c

    .line 495
    .line 496
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v20

    .line 500
    move-object/from16 v14, v20

    .line 501
    .line 502
    check-cast v14, Le53;

    .line 503
    .line 504
    iget v0, v14, Le53;->a:I

    .line 505
    .line 506
    if-ne v0, v2, :cond_19

    .line 507
    .line 508
    iget-object v0, v14, Le53;->f:Lm31;

    .line 509
    .line 510
    iget-object v0, v0, Lm31;->a:Ljava/util/HashMap;

    .line 511
    .line 512
    const/16 v18, -0x1

    .line 513
    .line 514
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    check-cast v0, Ljava/util/ArrayList;

    .line 523
    .line 524
    if-eqz v0, :cond_1a

    .line 525
    .line 526
    iget-object v1, v4, Lzj1;->w:Ljava/util/ArrayList;

    .line 527
    .line 528
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 529
    .line 530
    .line 531
    goto :goto_c

    .line 532
    :cond_19
    const/16 v18, -0x1

    .line 533
    .line 534
    const/4 v14, 0x2

    .line 535
    move-object/from16 v0, p0

    .line 536
    .line 537
    goto :goto_b

    .line 538
    :cond_1a
    :goto_c
    add-int/lit8 v2, v16, 0x1

    .line 539
    .line 540
    move-object/from16 v1, p2

    .line 541
    .line 542
    const/16 v19, 0x3

    .line 543
    .line 544
    const/16 v20, 0x2

    .line 545
    .line 546
    const/16 v21, 0x1

    .line 547
    .line 548
    move-object/from16 v0, p0

    .line 549
    .line 550
    goto/16 :goto_5

    .line 551
    .line 552
    :cond_1b
    return-void
.end method

.method public final s(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    if-eqz p2, :cond_b

    .line 2
    .line 3
    sget-object v0, Landroidx/constraintlayout/widget/R$styleable;->MotionEffect:[I

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/4 v0, 0x0

    .line 14
    move v1, v0

    .line 15
    :goto_0
    if-ge v1, p2, :cond_8

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionEffect_motionEffect_start:I

    .line 22
    .line 23
    const/16 v4, 0x63

    .line 24
    .line 25
    if-ne v2, v3, :cond_0

    .line 26
    .line 27
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->b0:I

    .line 28
    .line 29
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->b0:I

    .line 34
    .line 35
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->b0:I

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionEffect_motionEffect_end:I

    .line 47
    .line 48
    if-ne v2, v3, :cond_1

    .line 49
    .line 50
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->c0:I

    .line 51
    .line 52
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->c0:I

    .line 57
    .line 58
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->c0:I

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionEffect_motionEffect_translationX:I

    .line 70
    .line 71
    if-ne v2, v3, :cond_2

    .line 72
    .line 73
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->d0:I

    .line 74
    .line 75
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->d0:I

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionEffect_motionEffect_translationY:I

    .line 83
    .line 84
    if-ne v2, v3, :cond_3

    .line 85
    .line 86
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->e0:I

    .line 87
    .line 88
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->e0:I

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionEffect_motionEffect_alpha:I

    .line 96
    .line 97
    if-ne v2, v3, :cond_4

    .line 98
    .line 99
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->a0:F

    .line 100
    .line 101
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->a0:F

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionEffect_motionEffect_move:I

    .line 109
    .line 110
    if-ne v2, v3, :cond_5

    .line 111
    .line 112
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->h0:I

    .line 113
    .line 114
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->h0:I

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_5
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionEffect_motionEffect_strict:I

    .line 122
    .line 123
    if-ne v2, v3, :cond_6

    .line 124
    .line 125
    iget-boolean v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->f0:Z

    .line 126
    .line 127
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    iput-boolean v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->f0:Z

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_6
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionEffect_motionEffect_viewTransition:I

    .line 135
    .line 136
    if-ne v2, v3, :cond_7

    .line 137
    .line 138
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->g0:I

    .line 139
    .line 140
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->g0:I

    .line 145
    .line 146
    :cond_7
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 147
    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :cond_8
    iget p2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->b0:I

    .line 151
    .line 152
    iget v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->c0:I

    .line 153
    .line 154
    if-ne p2, v0, :cond_a

    .line 155
    .line 156
    if-lez p2, :cond_9

    .line 157
    .line 158
    add-int/lit8 p2, p2, -0x1

    .line 159
    .line 160
    iput p2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->b0:I

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_9
    add-int/lit8 v0, v0, 0x1

    .line 164
    .line 165
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->c0:I

    .line 166
    .line 167
    :cond_a
    :goto_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 168
    .line 169
    .line 170
    :cond_b
    return-void
.end method

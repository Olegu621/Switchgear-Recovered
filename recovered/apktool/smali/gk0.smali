.class public final Lgk0;
.super Ly53;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public H0:I

.field public I0:I

.field public J0:I

.field public K0:I

.field public L0:I

.field public M0:I

.field public N0:F

.field public O0:F

.field public P0:F

.field public Q0:F

.field public R0:F

.field public S0:F

.field public T0:I

.field public U0:I

.field public V0:I

.field public W0:I

.field public X0:I

.field public Y0:I

.field public Z0:I

.field public final a1:Ljava/util/ArrayList;

.field public b1:[Lzz;

.field public c1:[Lzz;

.field public d1:[I

.field public e1:[Lzz;

.field public f1:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ly53;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lgk0;->H0:I

    .line 6
    .line 7
    iput v0, p0, Lgk0;->I0:I

    .line 8
    .line 9
    iput v0, p0, Lgk0;->J0:I

    .line 10
    .line 11
    iput v0, p0, Lgk0;->K0:I

    .line 12
    .line 13
    iput v0, p0, Lgk0;->L0:I

    .line 14
    .line 15
    iput v0, p0, Lgk0;->M0:I

    .line 16
    .line 17
    const/high16 v1, 0x3f000000    # 0.5f

    .line 18
    .line 19
    iput v1, p0, Lgk0;->N0:F

    .line 20
    .line 21
    iput v1, p0, Lgk0;->O0:F

    .line 22
    .line 23
    iput v1, p0, Lgk0;->P0:F

    .line 24
    .line 25
    iput v1, p0, Lgk0;->Q0:F

    .line 26
    .line 27
    iput v1, p0, Lgk0;->R0:F

    .line 28
    .line 29
    iput v1, p0, Lgk0;->S0:F

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput v1, p0, Lgk0;->T0:I

    .line 33
    .line 34
    iput v1, p0, Lgk0;->U0:I

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    iput v2, p0, Lgk0;->V0:I

    .line 38
    .line 39
    iput v2, p0, Lgk0;->W0:I

    .line 40
    .line 41
    iput v1, p0, Lgk0;->X0:I

    .line 42
    .line 43
    iput v0, p0, Lgk0;->Y0:I

    .line 44
    .line 45
    iput v1, p0, Lgk0;->Z0:I

    .line 46
    .line 47
    new-instance v0, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lgk0;->a1:Ljava/util/ArrayList;

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    iput-object v0, p0, Lgk0;->b1:[Lzz;

    .line 56
    .line 57
    iput-object v0, p0, Lgk0;->c1:[Lzz;

    .line 58
    .line 59
    iput-object v0, p0, Lgk0;->d1:[I

    .line 60
    .line 61
    iput v1, p0, Lgk0;->f1:I

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final V(IIII)V
    .locals 38

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v8, p1

    .line 4
    .line 5
    iget v0, v1, Lcu0;->v0:I

    .line 6
    .line 7
    sget-object v12, Lyz;->c:Lyz;

    .line 8
    .line 9
    sget-object v13, Lyz;->b:Lyz;

    .line 10
    .line 11
    const/4 v14, 0x1

    .line 12
    const/4 v15, 0x0

    .line 13
    if-lez v0, :cond_7

    .line 14
    .line 15
    iget-object v0, v1, Lzz;->V:Lzz;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    check-cast v0, La00;

    .line 20
    .line 21
    iget-object v0, v0, La00;->y0:Lxi;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    if-nez v0, :cond_1

    .line 26
    .line 27
    iput v15, v1, Ly53;->D0:I

    .line 28
    .line 29
    iput v15, v1, Ly53;->E0:I

    .line 30
    .line 31
    iput-boolean v15, v1, Ly53;->C0:Z

    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    move v3, v15

    .line 35
    :goto_1
    iget v4, v1, Lcu0;->v0:I

    .line 36
    .line 37
    if-ge v3, v4, :cond_7

    .line 38
    .line 39
    iget-object v4, v1, Lcu0;->u0:[Lzz;

    .line 40
    .line 41
    aget-object v4, v4, v3

    .line 42
    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    instance-of v5, v4, Lbs0;

    .line 47
    .line 48
    if-eqz v5, :cond_3

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_3
    invoke-virtual {v4, v15}, Lzz;->k(I)Lyz;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v4, v14}, Lzz;->k(I)Lyz;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    if-ne v5, v12, :cond_4

    .line 60
    .line 61
    iget v7, v4, Lzz;->r:I

    .line 62
    .line 63
    if-eq v7, v14, :cond_4

    .line 64
    .line 65
    if-ne v6, v12, :cond_4

    .line 66
    .line 67
    iget v7, v4, Lzz;->s:I

    .line 68
    .line 69
    if-eq v7, v14, :cond_4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    if-ne v5, v12, :cond_5

    .line 73
    .line 74
    move-object v5, v13

    .line 75
    :cond_5
    if-ne v6, v12, :cond_6

    .line 76
    .line 77
    move-object v6, v13

    .line 78
    :cond_6
    iget-object v7, v1, Ly53;->F0:Lwi;

    .line 79
    .line 80
    iput-object v5, v7, Lwi;->a:Lyz;

    .line 81
    .line 82
    iput-object v6, v7, Lwi;->b:Lyz;

    .line 83
    .line 84
    invoke-virtual {v4}, Lzz;->r()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    iput v5, v7, Lwi;->c:I

    .line 89
    .line 90
    invoke-virtual {v4}, Lzz;->l()I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    iput v5, v7, Lwi;->d:I

    .line 95
    .line 96
    move-object v5, v0

    .line 97
    check-cast v5, Landroidx/constraintlayout/widget/b;

    .line 98
    .line 99
    invoke-virtual {v5, v4, v7}, Landroidx/constraintlayout/widget/b;->b(Lzz;Lwi;)V

    .line 100
    .line 101
    .line 102
    iget v5, v7, Lwi;->e:I

    .line 103
    .line 104
    invoke-virtual {v4, v5}, Lzz;->P(I)V

    .line 105
    .line 106
    .line 107
    iget v5, v7, Lwi;->f:I

    .line 108
    .line 109
    invoke-virtual {v4, v5}, Lzz;->M(I)V

    .line 110
    .line 111
    .line 112
    iget v5, v7, Lwi;->g:I

    .line 113
    .line 114
    invoke-virtual {v4, v5}, Lzz;->J(I)V

    .line 115
    .line 116
    .line 117
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_7
    iget v0, v1, Ly53;->A0:I

    .line 121
    .line 122
    iget v3, v1, Ly53;->B0:I

    .line 123
    .line 124
    iget v4, v1, Ly53;->w0:I

    .line 125
    .line 126
    iget v5, v1, Ly53;->x0:I

    .line 127
    .line 128
    const/4 v6, 0x2

    .line 129
    new-array v7, v6, [I

    .line 130
    .line 131
    sub-int v16, p2, v0

    .line 132
    .line 133
    sub-int v16, v16, v3

    .line 134
    .line 135
    iget v2, v1, Lgk0;->Z0:I

    .line 136
    .line 137
    if-ne v2, v14, :cond_8

    .line 138
    .line 139
    sub-int v16, p4, v4

    .line 140
    .line 141
    sub-int v16, v16, v5

    .line 142
    .line 143
    :cond_8
    move/from16 v28, v16

    .line 144
    .line 145
    iget v6, v1, Lgk0;->H0:I

    .line 146
    .line 147
    const/4 v14, -0x1

    .line 148
    if-nez v2, :cond_a

    .line 149
    .line 150
    if-ne v6, v14, :cond_9

    .line 151
    .line 152
    iput v15, v1, Lgk0;->H0:I

    .line 153
    .line 154
    :cond_9
    iget v2, v1, Lgk0;->I0:I

    .line 155
    .line 156
    if-ne v2, v14, :cond_c

    .line 157
    .line 158
    iput v15, v1, Lgk0;->I0:I

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_a
    if-ne v6, v14, :cond_b

    .line 162
    .line 163
    iput v15, v1, Lgk0;->H0:I

    .line 164
    .line 165
    :cond_b
    iget v2, v1, Lgk0;->I0:I

    .line 166
    .line 167
    if-ne v2, v14, :cond_c

    .line 168
    .line 169
    iput v15, v1, Lgk0;->I0:I

    .line 170
    .line 171
    :cond_c
    :goto_3
    iget-object v2, v1, Lcu0;->u0:[Lzz;

    .line 172
    .line 173
    move v6, v15

    .line 174
    move v14, v6

    .line 175
    move/from16 v30, v14

    .line 176
    .line 177
    :goto_4
    iget v15, v1, Lcu0;->v0:I

    .line 178
    .line 179
    move/from16 v18, v0

    .line 180
    .line 181
    const/16 v0, 0x8

    .line 182
    .line 183
    if-ge v6, v15, :cond_e

    .line 184
    .line 185
    iget-object v15, v1, Lcu0;->u0:[Lzz;

    .line 186
    .line 187
    aget-object v15, v15, v6

    .line 188
    .line 189
    iget v15, v15, Lzz;->i0:I

    .line 190
    .line 191
    if-ne v15, v0, :cond_d

    .line 192
    .line 193
    add-int/lit8 v14, v14, 0x1

    .line 194
    .line 195
    :cond_d
    add-int/lit8 v6, v6, 0x1

    .line 196
    .line 197
    move/from16 v0, v18

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_e
    if-lez v14, :cond_11

    .line 201
    .line 202
    sub-int/2addr v15, v14

    .line 203
    new-array v2, v15, [Lzz;

    .line 204
    .line 205
    move/from16 v6, v30

    .line 206
    .line 207
    move v14, v6

    .line 208
    :goto_5
    iget v15, v1, Lcu0;->v0:I

    .line 209
    .line 210
    if-ge v6, v15, :cond_10

    .line 211
    .line 212
    iget-object v15, v1, Lcu0;->u0:[Lzz;

    .line 213
    .line 214
    aget-object v15, v15, v6

    .line 215
    .line 216
    move-object/from16 v19, v2

    .line 217
    .line 218
    iget v2, v15, Lzz;->i0:I

    .line 219
    .line 220
    if-eq v2, v0, :cond_f

    .line 221
    .line 222
    aput-object v15, v19, v14

    .line 223
    .line 224
    add-int/lit8 v14, v14, 0x1

    .line 225
    .line 226
    :cond_f
    add-int/lit8 v6, v6, 0x1

    .line 227
    .line 228
    move-object/from16 v2, v19

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_10
    move-object/from16 v19, v2

    .line 232
    .line 233
    move v15, v14

    .line 234
    move-object/from16 v14, v19

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_11
    move-object v14, v2

    .line 238
    :goto_6
    iput-object v14, v1, Lgk0;->e1:[Lzz;

    .line 239
    .line 240
    iput v15, v1, Lgk0;->f1:I

    .line 241
    .line 242
    iget v0, v1, Lgk0;->X0:I

    .line 243
    .line 244
    iget-object v2, v1, Lgk0;->a1:Ljava/util/ArrayList;

    .line 245
    .line 246
    if-eqz v0, :cond_6e

    .line 247
    .line 248
    iget-object v6, v1, Lzz;->K:Loz;

    .line 249
    .line 250
    iget-object v11, v1, Lzz;->J:Loz;

    .line 251
    .line 252
    move-object/from16 v19, v11

    .line 253
    .line 254
    iget-object v11, v1, Lzz;->L:Loz;

    .line 255
    .line 256
    move-object/from16 v31, v11

    .line 257
    .line 258
    iget-object v11, v1, Lzz;->M:Loz;

    .line 259
    .line 260
    move-object/from16 v20, v2

    .line 261
    .line 262
    const/4 v2, 0x1

    .line 263
    if-eq v0, v2, :cond_54

    .line 264
    .line 265
    const/4 v2, 0x2

    .line 266
    if-eq v0, v2, :cond_2d

    .line 267
    .line 268
    const/4 v2, 0x3

    .line 269
    if-eq v0, v2, :cond_12

    .line 270
    .line 271
    :goto_7
    move/from16 v33, v3

    .line 272
    .line 273
    move/from16 v34, v4

    .line 274
    .line 275
    move/from16 v35, v5

    .line 276
    .line 277
    move-object/from16 v36, v7

    .line 278
    .line 279
    move/from16 v32, v18

    .line 280
    .line 281
    :goto_8
    const/16 v29, 0x1

    .line 282
    .line 283
    goto/16 :goto_3a

    .line 284
    .line 285
    :cond_12
    iget v2, v1, Lgk0;->Z0:I

    .line 286
    .line 287
    if-nez v15, :cond_13

    .line 288
    .line 289
    goto :goto_7

    .line 290
    :cond_13
    invoke-virtual/range {v20 .. v20}, Ljava/util/ArrayList;->clear()V

    .line 291
    .line 292
    .line 293
    new-instance v0, Lek0;

    .line 294
    .line 295
    move/from16 v16, v5

    .line 296
    .line 297
    iget-object v5, v1, Lzz;->L:Loz;

    .line 298
    .line 299
    move-object/from16 v17, v6

    .line 300
    .line 301
    iget-object v6, v1, Lzz;->M:Loz;

    .line 302
    .line 303
    move/from16 v21, v3

    .line 304
    .line 305
    iget-object v3, v1, Lzz;->J:Loz;

    .line 306
    .line 307
    move/from16 v22, v4

    .line 308
    .line 309
    iget-object v4, v1, Lzz;->K:Loz;

    .line 310
    .line 311
    move-object/from16 v36, v7

    .line 312
    .line 313
    move-object/from16 v37, v11

    .line 314
    .line 315
    move/from16 v35, v16

    .line 316
    .line 317
    move/from16 v32, v18

    .line 318
    .line 319
    move-object/from16 v11, v20

    .line 320
    .line 321
    move/from16 v33, v21

    .line 322
    .line 323
    move/from16 v34, v22

    .line 324
    .line 325
    move/from16 v7, v28

    .line 326
    .line 327
    invoke-direct/range {v0 .. v7}, Lek0;-><init>(Lgk0;ILoz;Loz;Loz;Loz;I)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    if-nez v2, :cond_1a

    .line 334
    .line 335
    move/from16 v3, v30

    .line 336
    .line 337
    move v4, v3

    .line 338
    move v5, v4

    .line 339
    move v6, v5

    .line 340
    :goto_9
    if-ge v3, v15, :cond_22

    .line 341
    .line 342
    const/16 v29, 0x1

    .line 343
    .line 344
    add-int/lit8 v4, v4, 0x1

    .line 345
    .line 346
    aget-object v10, v14, v3

    .line 347
    .line 348
    invoke-virtual {v1, v10, v7}, Lgk0;->Y(Lzz;I)I

    .line 349
    .line 350
    .line 351
    move-result v16

    .line 352
    move/from16 v18, v2

    .line 353
    .line 354
    iget-object v2, v10, Lzz;->U:[Lyz;

    .line 355
    .line 356
    aget-object v2, v2, v30

    .line 357
    .line 358
    if-ne v2, v12, :cond_14

    .line 359
    .line 360
    add-int/lit8 v5, v5, 0x1

    .line 361
    .line 362
    :cond_14
    move/from16 v20, v5

    .line 363
    .line 364
    if-eq v6, v7, :cond_15

    .line 365
    .line 366
    iget v2, v1, Lgk0;->T0:I

    .line 367
    .line 368
    add-int/2addr v2, v6

    .line 369
    add-int v2, v2, v16

    .line 370
    .line 371
    if-le v2, v7, :cond_16

    .line 372
    .line 373
    :cond_15
    iget-object v2, v0, Lek0;->b:Lzz;

    .line 374
    .line 375
    if-eqz v2, :cond_16

    .line 376
    .line 377
    const/4 v2, 0x1

    .line 378
    goto :goto_a

    .line 379
    :cond_16
    move/from16 v2, v30

    .line 380
    .line 381
    :goto_a
    if-nez v2, :cond_17

    .line 382
    .line 383
    if-lez v3, :cond_17

    .line 384
    .line 385
    iget v5, v1, Lgk0;->Y0:I

    .line 386
    .line 387
    if-lez v5, :cond_17

    .line 388
    .line 389
    if-le v4, v5, :cond_17

    .line 390
    .line 391
    const/4 v2, 0x1

    .line 392
    :cond_17
    if-eqz v2, :cond_18

    .line 393
    .line 394
    new-instance v0, Lek0;

    .line 395
    .line 396
    iget-object v5, v1, Lzz;->L:Loz;

    .line 397
    .line 398
    iget-object v6, v1, Lzz;->M:Loz;

    .line 399
    .line 400
    move v2, v3

    .line 401
    iget-object v3, v1, Lzz;->J:Loz;

    .line 402
    .line 403
    move/from16 v21, v4

    .line 404
    .line 405
    iget-object v4, v1, Lzz;->K:Loz;

    .line 406
    .line 407
    move v9, v2

    .line 408
    move/from16 v2, v18

    .line 409
    .line 410
    invoke-direct/range {v0 .. v7}, Lek0;-><init>(Lgk0;ILoz;Loz;Loz;Loz;I)V

    .line 411
    .line 412
    .line 413
    iput v9, v0, Lek0;->n:I

    .line 414
    .line 415
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move/from16 v6, v16

    .line 419
    .line 420
    move/from16 v4, v21

    .line 421
    .line 422
    goto :goto_c

    .line 423
    :cond_18
    move v9, v3

    .line 424
    move/from16 v2, v18

    .line 425
    .line 426
    if-lez v9, :cond_19

    .line 427
    .line 428
    iget v3, v1, Lgk0;->T0:I

    .line 429
    .line 430
    add-int v3, v3, v16

    .line 431
    .line 432
    add-int/2addr v3, v6

    .line 433
    move v6, v3

    .line 434
    :goto_b
    move/from16 v4, v30

    .line 435
    .line 436
    goto :goto_c

    .line 437
    :cond_19
    move/from16 v6, v16

    .line 438
    .line 439
    goto :goto_b

    .line 440
    :goto_c
    invoke-virtual {v0, v10}, Lek0;->a(Lzz;)V

    .line 441
    .line 442
    .line 443
    add-int/lit8 v3, v9, 0x1

    .line 444
    .line 445
    move/from16 v5, v20

    .line 446
    .line 447
    goto :goto_9

    .line 448
    :cond_1a
    move/from16 v3, v30

    .line 449
    .line 450
    move v4, v3

    .line 451
    move v9, v4

    .line 452
    :goto_d
    if-ge v9, v15, :cond_21

    .line 453
    .line 454
    aget-object v10, v14, v9

    .line 455
    .line 456
    invoke-virtual {v1, v10, v7}, Lgk0;->X(Lzz;I)I

    .line 457
    .line 458
    .line 459
    move-result v16

    .line 460
    iget-object v5, v10, Lzz;->U:[Lyz;

    .line 461
    .line 462
    const/16 v29, 0x1

    .line 463
    .line 464
    aget-object v5, v5, v29

    .line 465
    .line 466
    if-ne v5, v12, :cond_1b

    .line 467
    .line 468
    add-int/lit8 v3, v3, 0x1

    .line 469
    .line 470
    :cond_1b
    move/from16 v18, v3

    .line 471
    .line 472
    if-eq v4, v7, :cond_1c

    .line 473
    .line 474
    iget v3, v1, Lgk0;->U0:I

    .line 475
    .line 476
    add-int/2addr v3, v4

    .line 477
    add-int v3, v3, v16

    .line 478
    .line 479
    if-le v3, v7, :cond_1d

    .line 480
    .line 481
    :cond_1c
    iget-object v3, v0, Lek0;->b:Lzz;

    .line 482
    .line 483
    if-eqz v3, :cond_1d

    .line 484
    .line 485
    const/4 v3, 0x1

    .line 486
    goto :goto_e

    .line 487
    :cond_1d
    move/from16 v3, v30

    .line 488
    .line 489
    :goto_e
    if-nez v3, :cond_1e

    .line 490
    .line 491
    if-lez v9, :cond_1e

    .line 492
    .line 493
    iget v5, v1, Lgk0;->Y0:I

    .line 494
    .line 495
    if-lez v5, :cond_1e

    .line 496
    .line 497
    if-gez v5, :cond_1e

    .line 498
    .line 499
    const/4 v3, 0x1

    .line 500
    :cond_1e
    if-eqz v3, :cond_20

    .line 501
    .line 502
    new-instance v0, Lek0;

    .line 503
    .line 504
    iget-object v5, v1, Lzz;->L:Loz;

    .line 505
    .line 506
    iget-object v6, v1, Lzz;->M:Loz;

    .line 507
    .line 508
    iget-object v3, v1, Lzz;->J:Loz;

    .line 509
    .line 510
    iget-object v4, v1, Lzz;->K:Loz;

    .line 511
    .line 512
    invoke-direct/range {v0 .. v7}, Lek0;-><init>(Lgk0;ILoz;Loz;Loz;Loz;I)V

    .line 513
    .line 514
    .line 515
    iput v9, v0, Lek0;->n:I

    .line 516
    .line 517
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    :cond_1f
    move/from16 v4, v16

    .line 521
    .line 522
    goto :goto_f

    .line 523
    :cond_20
    if-lez v9, :cond_1f

    .line 524
    .line 525
    iget v3, v1, Lgk0;->U0:I

    .line 526
    .line 527
    add-int v3, v3, v16

    .line 528
    .line 529
    add-int/2addr v3, v4

    .line 530
    move v4, v3

    .line 531
    :goto_f
    invoke-virtual {v0, v10}, Lek0;->a(Lzz;)V

    .line 532
    .line 533
    .line 534
    add-int/lit8 v9, v9, 0x1

    .line 535
    .line 536
    move/from16 v3, v18

    .line 537
    .line 538
    goto :goto_d

    .line 539
    :cond_21
    move v5, v3

    .line 540
    :cond_22
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 541
    .line 542
    .line 543
    move-result v0

    .line 544
    iget v3, v1, Ly53;->A0:I

    .line 545
    .line 546
    iget v4, v1, Ly53;->w0:I

    .line 547
    .line 548
    iget v6, v1, Ly53;->B0:I

    .line 549
    .line 550
    iget v9, v1, Ly53;->x0:I

    .line 551
    .line 552
    iget-object v10, v1, Lzz;->U:[Lyz;

    .line 553
    .line 554
    aget-object v12, v10, v30

    .line 555
    .line 556
    if-eq v12, v13, :cond_24

    .line 557
    .line 558
    const/16 v29, 0x1

    .line 559
    .line 560
    aget-object v10, v10, v29

    .line 561
    .line 562
    if-ne v10, v13, :cond_23

    .line 563
    .line 564
    goto :goto_10

    .line 565
    :cond_23
    move/from16 v10, v30

    .line 566
    .line 567
    goto :goto_11

    .line 568
    :cond_24
    :goto_10
    const/4 v10, 0x1

    .line 569
    :goto_11
    if-lez v5, :cond_26

    .line 570
    .line 571
    if-eqz v10, :cond_26

    .line 572
    .line 573
    move/from16 v5, v30

    .line 574
    .line 575
    :goto_12
    if-ge v5, v0, :cond_26

    .line 576
    .line 577
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v10

    .line 581
    check-cast v10, Lek0;

    .line 582
    .line 583
    if-nez v2, :cond_25

    .line 584
    .line 585
    invoke-virtual {v10}, Lek0;->d()I

    .line 586
    .line 587
    .line 588
    move-result v12

    .line 589
    sub-int v12, v7, v12

    .line 590
    .line 591
    invoke-virtual {v10, v12}, Lek0;->e(I)V

    .line 592
    .line 593
    .line 594
    goto :goto_13

    .line 595
    :cond_25
    invoke-virtual {v10}, Lek0;->c()I

    .line 596
    .line 597
    .line 598
    move-result v12

    .line 599
    sub-int v12, v7, v12

    .line 600
    .line 601
    invoke-virtual {v10, v12}, Lek0;->e(I)V

    .line 602
    .line 603
    .line 604
    :goto_13
    add-int/lit8 v5, v5, 0x1

    .line 605
    .line 606
    goto :goto_12

    .line 607
    :cond_26
    move/from16 v24, v3

    .line 608
    .line 609
    move/from16 v25, v4

    .line 610
    .line 611
    move/from16 v26, v6

    .line 612
    .line 613
    move/from16 v27, v9

    .line 614
    .line 615
    move-object/from16 v21, v17

    .line 616
    .line 617
    move-object/from16 v20, v19

    .line 618
    .line 619
    move/from16 v3, v30

    .line 620
    .line 621
    move v4, v3

    .line 622
    move v5, v4

    .line 623
    move-object/from16 v22, v31

    .line 624
    .line 625
    move-object/from16 v23, v37

    .line 626
    .line 627
    :goto_14
    if-ge v3, v0, :cond_2c

    .line 628
    .line 629
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v6

    .line 633
    check-cast v6, Lek0;

    .line 634
    .line 635
    if-nez v2, :cond_29

    .line 636
    .line 637
    add-int/lit8 v9, v0, -0x1

    .line 638
    .line 639
    if-ge v3, v9, :cond_27

    .line 640
    .line 641
    add-int/lit8 v9, v3, 0x1

    .line 642
    .line 643
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v9

    .line 647
    check-cast v9, Lek0;

    .line 648
    .line 649
    iget-object v9, v9, Lek0;->b:Lzz;

    .line 650
    .line 651
    iget-object v9, v9, Lzz;->K:Loz;

    .line 652
    .line 653
    move-object/from16 v23, v9

    .line 654
    .line 655
    move/from16 v27, v30

    .line 656
    .line 657
    goto :goto_15

    .line 658
    :cond_27
    iget v9, v1, Ly53;->x0:I

    .line 659
    .line 660
    move/from16 v27, v9

    .line 661
    .line 662
    move-object/from16 v23, v37

    .line 663
    .line 664
    :goto_15
    iget-object v9, v6, Lek0;->b:Lzz;

    .line 665
    .line 666
    iget-object v9, v9, Lzz;->M:Loz;

    .line 667
    .line 668
    move/from16 v19, v2

    .line 669
    .line 670
    move-object/from16 v18, v6

    .line 671
    .line 672
    move/from16 v28, v7

    .line 673
    .line 674
    invoke-virtual/range {v18 .. v28}, Lek0;->f(ILoz;Loz;Loz;Loz;IIIII)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v6}, Lek0;->d()I

    .line 678
    .line 679
    .line 680
    move-result v10

    .line 681
    invoke-static {v4, v10}, Ljava/lang/Math;->max(II)I

    .line 682
    .line 683
    .line 684
    move-result v4

    .line 685
    invoke-virtual {v6}, Lek0;->c()I

    .line 686
    .line 687
    .line 688
    move-result v6

    .line 689
    add-int/2addr v6, v5

    .line 690
    if-lez v3, :cond_28

    .line 691
    .line 692
    iget v5, v1, Lgk0;->U0:I

    .line 693
    .line 694
    add-int/2addr v6, v5

    .line 695
    :cond_28
    move v5, v6

    .line 696
    move-object/from16 v21, v9

    .line 697
    .line 698
    move/from16 v25, v30

    .line 699
    .line 700
    goto :goto_17

    .line 701
    :cond_29
    add-int/lit8 v9, v0, -0x1

    .line 702
    .line 703
    if-ge v3, v9, :cond_2a

    .line 704
    .line 705
    add-int/lit8 v9, v3, 0x1

    .line 706
    .line 707
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v9

    .line 711
    check-cast v9, Lek0;

    .line 712
    .line 713
    iget-object v9, v9, Lek0;->b:Lzz;

    .line 714
    .line 715
    iget-object v9, v9, Lzz;->J:Loz;

    .line 716
    .line 717
    move-object/from16 v22, v9

    .line 718
    .line 719
    move/from16 v26, v30

    .line 720
    .line 721
    goto :goto_16

    .line 722
    :cond_2a
    iget v9, v1, Ly53;->B0:I

    .line 723
    .line 724
    move/from16 v26, v9

    .line 725
    .line 726
    move-object/from16 v22, v31

    .line 727
    .line 728
    :goto_16
    iget-object v9, v6, Lek0;->b:Lzz;

    .line 729
    .line 730
    iget-object v9, v9, Lzz;->L:Loz;

    .line 731
    .line 732
    move/from16 v19, v2

    .line 733
    .line 734
    move-object/from16 v18, v6

    .line 735
    .line 736
    move/from16 v28, v7

    .line 737
    .line 738
    invoke-virtual/range {v18 .. v28}, Lek0;->f(ILoz;Loz;Loz;Loz;IIIII)V

    .line 739
    .line 740
    .line 741
    invoke-virtual/range {v18 .. v18}, Lek0;->d()I

    .line 742
    .line 743
    .line 744
    move-result v6

    .line 745
    add-int/2addr v6, v4

    .line 746
    invoke-virtual/range {v18 .. v18}, Lek0;->c()I

    .line 747
    .line 748
    .line 749
    move-result v4

    .line 750
    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    .line 751
    .line 752
    .line 753
    move-result v4

    .line 754
    if-lez v3, :cond_2b

    .line 755
    .line 756
    iget v5, v1, Lgk0;->T0:I

    .line 757
    .line 758
    add-int/2addr v6, v5

    .line 759
    :cond_2b
    move v5, v4

    .line 760
    move v4, v6

    .line 761
    move-object/from16 v20, v9

    .line 762
    .line 763
    move/from16 v24, v30

    .line 764
    .line 765
    :goto_17
    add-int/lit8 v3, v3, 0x1

    .line 766
    .line 767
    goto/16 :goto_14

    .line 768
    .line 769
    :cond_2c
    aput v4, v36, v30

    .line 770
    .line 771
    const/16 v29, 0x1

    .line 772
    .line 773
    aput v5, v36, v29

    .line 774
    .line 775
    goto/16 :goto_8

    .line 776
    .line 777
    :cond_2d
    move/from16 v33, v3

    .line 778
    .line 779
    move/from16 v34, v4

    .line 780
    .line 781
    move/from16 v35, v5

    .line 782
    .line 783
    move-object/from16 v36, v7

    .line 784
    .line 785
    move/from16 v32, v18

    .line 786
    .line 787
    move/from16 v7, v28

    .line 788
    .line 789
    iget v0, v1, Lgk0;->Z0:I

    .line 790
    .line 791
    iget v2, v1, Lgk0;->Y0:I

    .line 792
    .line 793
    if-nez v0, :cond_33

    .line 794
    .line 795
    if-gtz v2, :cond_32

    .line 796
    .line 797
    move/from16 v2, v30

    .line 798
    .line 799
    move v3, v2

    .line 800
    move v4, v3

    .line 801
    :goto_18
    if-ge v2, v15, :cond_31

    .line 802
    .line 803
    if-lez v2, :cond_2e

    .line 804
    .line 805
    iget v5, v1, Lgk0;->T0:I

    .line 806
    .line 807
    add-int/2addr v3, v5

    .line 808
    :cond_2e
    aget-object v5, v14, v2

    .line 809
    .line 810
    if-nez v5, :cond_2f

    .line 811
    .line 812
    goto :goto_19

    .line 813
    :cond_2f
    invoke-virtual {v1, v5, v7}, Lgk0;->Y(Lzz;I)I

    .line 814
    .line 815
    .line 816
    move-result v5

    .line 817
    add-int/2addr v5, v3

    .line 818
    if-le v5, v7, :cond_30

    .line 819
    .line 820
    goto :goto_1a

    .line 821
    :cond_30
    add-int/lit8 v4, v4, 0x1

    .line 822
    .line 823
    move v3, v5

    .line 824
    :goto_19
    add-int/lit8 v2, v2, 0x1

    .line 825
    .line 826
    goto :goto_18

    .line 827
    :cond_31
    :goto_1a
    move/from16 v2, v30

    .line 828
    .line 829
    goto :goto_1e

    .line 830
    :cond_32
    move v4, v2

    .line 831
    goto :goto_1a

    .line 832
    :cond_33
    if-gtz v2, :cond_38

    .line 833
    .line 834
    move/from16 v2, v30

    .line 835
    .line 836
    move v3, v2

    .line 837
    move v4, v3

    .line 838
    :goto_1b
    if-ge v2, v15, :cond_37

    .line 839
    .line 840
    if-lez v2, :cond_34

    .line 841
    .line 842
    iget v5, v1, Lgk0;->U0:I

    .line 843
    .line 844
    add-int/2addr v3, v5

    .line 845
    :cond_34
    aget-object v5, v14, v2

    .line 846
    .line 847
    if-nez v5, :cond_35

    .line 848
    .line 849
    goto :goto_1c

    .line 850
    :cond_35
    invoke-virtual {v1, v5, v7}, Lgk0;->X(Lzz;I)I

    .line 851
    .line 852
    .line 853
    move-result v5

    .line 854
    add-int/2addr v5, v3

    .line 855
    if-le v5, v7, :cond_36

    .line 856
    .line 857
    goto :goto_1d

    .line 858
    :cond_36
    add-int/lit8 v4, v4, 0x1

    .line 859
    .line 860
    move v3, v5

    .line 861
    :goto_1c
    add-int/lit8 v2, v2, 0x1

    .line 862
    .line 863
    goto :goto_1b

    .line 864
    :cond_37
    :goto_1d
    move v2, v4

    .line 865
    :cond_38
    move/from16 v4, v30

    .line 866
    .line 867
    :goto_1e
    iget-object v3, v1, Lgk0;->d1:[I

    .line 868
    .line 869
    if-nez v3, :cond_39

    .line 870
    .line 871
    const/4 v3, 0x2

    .line 872
    new-array v3, v3, [I

    .line 873
    .line 874
    iput-object v3, v1, Lgk0;->d1:[I

    .line 875
    .line 876
    :cond_39
    if-nez v2, :cond_3a

    .line 877
    .line 878
    const/4 v3, 0x1

    .line 879
    if-eq v0, v3, :cond_3b

    .line 880
    .line 881
    :cond_3a
    if-nez v4, :cond_3c

    .line 882
    .line 883
    if-nez v0, :cond_3c

    .line 884
    .line 885
    :cond_3b
    const/4 v3, 0x1

    .line 886
    goto :goto_1f

    .line 887
    :cond_3c
    move/from16 v3, v30

    .line 888
    .line 889
    :goto_1f
    if-nez v3, :cond_53

    .line 890
    .line 891
    if-nez v0, :cond_3d

    .line 892
    .line 893
    int-to-float v2, v15

    .line 894
    int-to-float v5, v4

    .line 895
    div-float/2addr v2, v5

    .line 896
    float-to-double v5, v2

    .line 897
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 898
    .line 899
    .line 900
    move-result-wide v5

    .line 901
    double-to-int v2, v5

    .line 902
    goto :goto_20

    .line 903
    :cond_3d
    int-to-float v4, v15

    .line 904
    int-to-float v5, v2

    .line 905
    div-float/2addr v4, v5

    .line 906
    float-to-double v4, v4

    .line 907
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 908
    .line 909
    .line 910
    move-result-wide v4

    .line 911
    double-to-int v4, v4

    .line 912
    :goto_20
    iget-object v5, v1, Lgk0;->c1:[Lzz;

    .line 913
    .line 914
    if-eqz v5, :cond_3e

    .line 915
    .line 916
    array-length v6, v5

    .line 917
    if-ge v6, v4, :cond_3f

    .line 918
    .line 919
    :cond_3e
    const/4 v6, 0x0

    .line 920
    goto :goto_21

    .line 921
    :cond_3f
    const/4 v6, 0x0

    .line 922
    invoke-static {v5, v6}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 923
    .line 924
    .line 925
    goto :goto_22

    .line 926
    :goto_21
    new-array v5, v4, [Lzz;

    .line 927
    .line 928
    iput-object v5, v1, Lgk0;->c1:[Lzz;

    .line 929
    .line 930
    :goto_22
    iget-object v5, v1, Lgk0;->b1:[Lzz;

    .line 931
    .line 932
    if-eqz v5, :cond_41

    .line 933
    .line 934
    array-length v9, v5

    .line 935
    if-ge v9, v2, :cond_40

    .line 936
    .line 937
    goto :goto_23

    .line 938
    :cond_40
    invoke-static {v5, v6}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 939
    .line 940
    .line 941
    goto :goto_24

    .line 942
    :cond_41
    :goto_23
    new-array v5, v2, [Lzz;

    .line 943
    .line 944
    iput-object v5, v1, Lgk0;->b1:[Lzz;

    .line 945
    .line 946
    :goto_24
    move/from16 v5, v30

    .line 947
    .line 948
    :goto_25
    if-ge v5, v4, :cond_4a

    .line 949
    .line 950
    move/from16 v6, v30

    .line 951
    .line 952
    :goto_26
    if-ge v6, v2, :cond_49

    .line 953
    .line 954
    mul-int v9, v6, v4

    .line 955
    .line 956
    add-int/2addr v9, v5

    .line 957
    const/4 v10, 0x1

    .line 958
    if-ne v0, v10, :cond_42

    .line 959
    .line 960
    mul-int v9, v5, v2

    .line 961
    .line 962
    add-int/2addr v9, v6

    .line 963
    :cond_42
    array-length v10, v14

    .line 964
    if-lt v9, v10, :cond_43

    .line 965
    .line 966
    goto :goto_27

    .line 967
    :cond_43
    aget-object v9, v14, v9

    .line 968
    .line 969
    if-nez v9, :cond_44

    .line 970
    .line 971
    goto :goto_27

    .line 972
    :cond_44
    invoke-virtual {v1, v9, v7}, Lgk0;->Y(Lzz;I)I

    .line 973
    .line 974
    .line 975
    move-result v10

    .line 976
    iget-object v11, v1, Lgk0;->c1:[Lzz;

    .line 977
    .line 978
    aget-object v11, v11, v5

    .line 979
    .line 980
    if-eqz v11, :cond_45

    .line 981
    .line 982
    invoke-virtual {v11}, Lzz;->r()I

    .line 983
    .line 984
    .line 985
    move-result v11

    .line 986
    if-ge v11, v10, :cond_46

    .line 987
    .line 988
    :cond_45
    iget-object v10, v1, Lgk0;->c1:[Lzz;

    .line 989
    .line 990
    aput-object v9, v10, v5

    .line 991
    .line 992
    :cond_46
    invoke-virtual {v1, v9, v7}, Lgk0;->X(Lzz;I)I

    .line 993
    .line 994
    .line 995
    move-result v10

    .line 996
    iget-object v11, v1, Lgk0;->b1:[Lzz;

    .line 997
    .line 998
    aget-object v11, v11, v6

    .line 999
    .line 1000
    if-eqz v11, :cond_47

    .line 1001
    .line 1002
    invoke-virtual {v11}, Lzz;->l()I

    .line 1003
    .line 1004
    .line 1005
    move-result v11

    .line 1006
    if-ge v11, v10, :cond_48

    .line 1007
    .line 1008
    :cond_47
    iget-object v10, v1, Lgk0;->b1:[Lzz;

    .line 1009
    .line 1010
    aput-object v9, v10, v6

    .line 1011
    .line 1012
    :cond_48
    :goto_27
    add-int/lit8 v6, v6, 0x1

    .line 1013
    .line 1014
    goto :goto_26

    .line 1015
    :cond_49
    add-int/lit8 v5, v5, 0x1

    .line 1016
    .line 1017
    goto :goto_25

    .line 1018
    :cond_4a
    move/from16 v5, v30

    .line 1019
    .line 1020
    move v6, v5

    .line 1021
    :goto_28
    if-ge v5, v4, :cond_4d

    .line 1022
    .line 1023
    iget-object v9, v1, Lgk0;->c1:[Lzz;

    .line 1024
    .line 1025
    aget-object v9, v9, v5

    .line 1026
    .line 1027
    if-eqz v9, :cond_4c

    .line 1028
    .line 1029
    if-lez v5, :cond_4b

    .line 1030
    .line 1031
    iget v10, v1, Lgk0;->T0:I

    .line 1032
    .line 1033
    add-int/2addr v6, v10

    .line 1034
    :cond_4b
    invoke-virtual {v1, v9, v7}, Lgk0;->Y(Lzz;I)I

    .line 1035
    .line 1036
    .line 1037
    move-result v9

    .line 1038
    add-int/2addr v9, v6

    .line 1039
    move v6, v9

    .line 1040
    :cond_4c
    add-int/lit8 v5, v5, 0x1

    .line 1041
    .line 1042
    goto :goto_28

    .line 1043
    :cond_4d
    move/from16 v5, v30

    .line 1044
    .line 1045
    move v9, v5

    .line 1046
    :goto_29
    if-ge v5, v2, :cond_50

    .line 1047
    .line 1048
    iget-object v10, v1, Lgk0;->b1:[Lzz;

    .line 1049
    .line 1050
    aget-object v10, v10, v5

    .line 1051
    .line 1052
    if-eqz v10, :cond_4f

    .line 1053
    .line 1054
    if-lez v5, :cond_4e

    .line 1055
    .line 1056
    iget v11, v1, Lgk0;->U0:I

    .line 1057
    .line 1058
    add-int/2addr v9, v11

    .line 1059
    :cond_4e
    invoke-virtual {v1, v10, v7}, Lgk0;->X(Lzz;I)I

    .line 1060
    .line 1061
    .line 1062
    move-result v10

    .line 1063
    add-int/2addr v10, v9

    .line 1064
    move v9, v10

    .line 1065
    :cond_4f
    add-int/lit8 v5, v5, 0x1

    .line 1066
    .line 1067
    goto :goto_29

    .line 1068
    :cond_50
    aput v6, v36, v30

    .line 1069
    .line 1070
    const/4 v10, 0x1

    .line 1071
    aput v9, v36, v10

    .line 1072
    .line 1073
    if-nez v0, :cond_52

    .line 1074
    .line 1075
    if-le v6, v7, :cond_51

    .line 1076
    .line 1077
    if-le v4, v10, :cond_51

    .line 1078
    .line 1079
    add-int/lit8 v4, v4, -0x1

    .line 1080
    .line 1081
    goto/16 :goto_1f

    .line 1082
    .line 1083
    :cond_51
    move v3, v10

    .line 1084
    goto/16 :goto_1f

    .line 1085
    .line 1086
    :cond_52
    if-le v9, v7, :cond_51

    .line 1087
    .line 1088
    if-le v2, v10, :cond_51

    .line 1089
    .line 1090
    add-int/lit8 v2, v2, -0x1

    .line 1091
    .line 1092
    goto/16 :goto_1f

    .line 1093
    .line 1094
    :cond_53
    const/4 v10, 0x1

    .line 1095
    iget-object v0, v1, Lgk0;->d1:[I

    .line 1096
    .line 1097
    aput v4, v0, v30

    .line 1098
    .line 1099
    aput v2, v0, v10

    .line 1100
    .line 1101
    move/from16 v29, v10

    .line 1102
    .line 1103
    goto/16 :goto_3a

    .line 1104
    .line 1105
    :cond_54
    move/from16 v33, v3

    .line 1106
    .line 1107
    move/from16 v34, v4

    .line 1108
    .line 1109
    move/from16 v35, v5

    .line 1110
    .line 1111
    move-object/from16 v17, v6

    .line 1112
    .line 1113
    move-object/from16 v36, v7

    .line 1114
    .line 1115
    move-object/from16 v37, v11

    .line 1116
    .line 1117
    move/from16 v32, v18

    .line 1118
    .line 1119
    move-object/from16 v11, v20

    .line 1120
    .line 1121
    move/from16 v7, v28

    .line 1122
    .line 1123
    iget v2, v1, Lgk0;->Z0:I

    .line 1124
    .line 1125
    if-nez v15, :cond_55

    .line 1126
    .line 1127
    goto/16 :goto_8

    .line 1128
    .line 1129
    :cond_55
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 1130
    .line 1131
    .line 1132
    new-instance v0, Lek0;

    .line 1133
    .line 1134
    iget-object v5, v1, Lzz;->L:Loz;

    .line 1135
    .line 1136
    iget-object v6, v1, Lzz;->M:Loz;

    .line 1137
    .line 1138
    iget-object v3, v1, Lzz;->J:Loz;

    .line 1139
    .line 1140
    iget-object v4, v1, Lzz;->K:Loz;

    .line 1141
    .line 1142
    invoke-direct/range {v0 .. v7}, Lek0;-><init>(Lgk0;ILoz;Loz;Loz;Loz;I)V

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1146
    .line 1147
    .line 1148
    if-nez v2, :cond_5c

    .line 1149
    .line 1150
    move/from16 v3, v30

    .line 1151
    .line 1152
    move v4, v3

    .line 1153
    move v9, v4

    .line 1154
    :goto_2a
    if-ge v9, v15, :cond_63

    .line 1155
    .line 1156
    aget-object v10, v14, v9

    .line 1157
    .line 1158
    invoke-virtual {v1, v10, v7}, Lgk0;->Y(Lzz;I)I

    .line 1159
    .line 1160
    .line 1161
    move-result v16

    .line 1162
    iget-object v5, v10, Lzz;->U:[Lyz;

    .line 1163
    .line 1164
    aget-object v5, v5, v30

    .line 1165
    .line 1166
    if-ne v5, v12, :cond_56

    .line 1167
    .line 1168
    add-int/lit8 v3, v3, 0x1

    .line 1169
    .line 1170
    :cond_56
    move/from16 v18, v3

    .line 1171
    .line 1172
    if-eq v4, v7, :cond_57

    .line 1173
    .line 1174
    iget v3, v1, Lgk0;->T0:I

    .line 1175
    .line 1176
    add-int/2addr v3, v4

    .line 1177
    add-int v3, v3, v16

    .line 1178
    .line 1179
    if-le v3, v7, :cond_58

    .line 1180
    .line 1181
    :cond_57
    iget-object v3, v0, Lek0;->b:Lzz;

    .line 1182
    .line 1183
    if-eqz v3, :cond_58

    .line 1184
    .line 1185
    const/4 v3, 0x1

    .line 1186
    goto :goto_2b

    .line 1187
    :cond_58
    move/from16 v3, v30

    .line 1188
    .line 1189
    :goto_2b
    if-nez v3, :cond_59

    .line 1190
    .line 1191
    if-lez v9, :cond_59

    .line 1192
    .line 1193
    iget v5, v1, Lgk0;->Y0:I

    .line 1194
    .line 1195
    if-lez v5, :cond_59

    .line 1196
    .line 1197
    rem-int v5, v9, v5

    .line 1198
    .line 1199
    if-nez v5, :cond_59

    .line 1200
    .line 1201
    const/4 v3, 0x1

    .line 1202
    :cond_59
    if-eqz v3, :cond_5b

    .line 1203
    .line 1204
    new-instance v0, Lek0;

    .line 1205
    .line 1206
    iget-object v5, v1, Lzz;->L:Loz;

    .line 1207
    .line 1208
    iget-object v6, v1, Lzz;->M:Loz;

    .line 1209
    .line 1210
    iget-object v3, v1, Lzz;->J:Loz;

    .line 1211
    .line 1212
    iget-object v4, v1, Lzz;->K:Loz;

    .line 1213
    .line 1214
    invoke-direct/range {v0 .. v7}, Lek0;-><init>(Lgk0;ILoz;Loz;Loz;Loz;I)V

    .line 1215
    .line 1216
    .line 1217
    iput v9, v0, Lek0;->n:I

    .line 1218
    .line 1219
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1220
    .line 1221
    .line 1222
    :cond_5a
    move/from16 v4, v16

    .line 1223
    .line 1224
    goto :goto_2c

    .line 1225
    :cond_5b
    if-lez v9, :cond_5a

    .line 1226
    .line 1227
    iget v3, v1, Lgk0;->T0:I

    .line 1228
    .line 1229
    add-int v3, v3, v16

    .line 1230
    .line 1231
    add-int/2addr v3, v4

    .line 1232
    move v4, v3

    .line 1233
    :goto_2c
    invoke-virtual {v0, v10}, Lek0;->a(Lzz;)V

    .line 1234
    .line 1235
    .line 1236
    add-int/lit8 v9, v9, 0x1

    .line 1237
    .line 1238
    move/from16 v3, v18

    .line 1239
    .line 1240
    goto :goto_2a

    .line 1241
    :cond_5c
    move/from16 v3, v30

    .line 1242
    .line 1243
    move v4, v3

    .line 1244
    move v9, v4

    .line 1245
    :goto_2d
    if-ge v9, v15, :cond_63

    .line 1246
    .line 1247
    aget-object v10, v14, v9

    .line 1248
    .line 1249
    invoke-virtual {v1, v10, v7}, Lgk0;->X(Lzz;I)I

    .line 1250
    .line 1251
    .line 1252
    move-result v16

    .line 1253
    iget-object v5, v10, Lzz;->U:[Lyz;

    .line 1254
    .line 1255
    const/16 v29, 0x1

    .line 1256
    .line 1257
    aget-object v5, v5, v29

    .line 1258
    .line 1259
    if-ne v5, v12, :cond_5d

    .line 1260
    .line 1261
    add-int/lit8 v3, v3, 0x1

    .line 1262
    .line 1263
    :cond_5d
    move/from16 v18, v3

    .line 1264
    .line 1265
    if-eq v4, v7, :cond_5e

    .line 1266
    .line 1267
    iget v3, v1, Lgk0;->U0:I

    .line 1268
    .line 1269
    add-int/2addr v3, v4

    .line 1270
    add-int v3, v3, v16

    .line 1271
    .line 1272
    if-le v3, v7, :cond_5f

    .line 1273
    .line 1274
    :cond_5e
    iget-object v3, v0, Lek0;->b:Lzz;

    .line 1275
    .line 1276
    if-eqz v3, :cond_5f

    .line 1277
    .line 1278
    const/4 v3, 0x1

    .line 1279
    goto :goto_2e

    .line 1280
    :cond_5f
    move/from16 v3, v30

    .line 1281
    .line 1282
    :goto_2e
    if-nez v3, :cond_60

    .line 1283
    .line 1284
    if-lez v9, :cond_60

    .line 1285
    .line 1286
    iget v5, v1, Lgk0;->Y0:I

    .line 1287
    .line 1288
    if-lez v5, :cond_60

    .line 1289
    .line 1290
    rem-int v5, v9, v5

    .line 1291
    .line 1292
    if-nez v5, :cond_60

    .line 1293
    .line 1294
    const/4 v3, 0x1

    .line 1295
    :cond_60
    if-eqz v3, :cond_62

    .line 1296
    .line 1297
    new-instance v0, Lek0;

    .line 1298
    .line 1299
    iget-object v5, v1, Lzz;->L:Loz;

    .line 1300
    .line 1301
    iget-object v6, v1, Lzz;->M:Loz;

    .line 1302
    .line 1303
    iget-object v3, v1, Lzz;->J:Loz;

    .line 1304
    .line 1305
    iget-object v4, v1, Lzz;->K:Loz;

    .line 1306
    .line 1307
    invoke-direct/range {v0 .. v7}, Lek0;-><init>(Lgk0;ILoz;Loz;Loz;Loz;I)V

    .line 1308
    .line 1309
    .line 1310
    iput v9, v0, Lek0;->n:I

    .line 1311
    .line 1312
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1313
    .line 1314
    .line 1315
    :cond_61
    move/from16 v4, v16

    .line 1316
    .line 1317
    goto :goto_2f

    .line 1318
    :cond_62
    if-lez v9, :cond_61

    .line 1319
    .line 1320
    iget v3, v1, Lgk0;->U0:I

    .line 1321
    .line 1322
    add-int v3, v3, v16

    .line 1323
    .line 1324
    add-int/2addr v3, v4

    .line 1325
    move v4, v3

    .line 1326
    :goto_2f
    invoke-virtual {v0, v10}, Lek0;->a(Lzz;)V

    .line 1327
    .line 1328
    .line 1329
    add-int/lit8 v9, v9, 0x1

    .line 1330
    .line 1331
    move/from16 v3, v18

    .line 1332
    .line 1333
    goto :goto_2d

    .line 1334
    :cond_63
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 1335
    .line 1336
    .line 1337
    move-result v0

    .line 1338
    iget v4, v1, Ly53;->A0:I

    .line 1339
    .line 1340
    iget v5, v1, Ly53;->w0:I

    .line 1341
    .line 1342
    iget v6, v1, Ly53;->B0:I

    .line 1343
    .line 1344
    iget v9, v1, Ly53;->x0:I

    .line 1345
    .line 1346
    iget-object v10, v1, Lzz;->U:[Lyz;

    .line 1347
    .line 1348
    aget-object v12, v10, v30

    .line 1349
    .line 1350
    if-eq v12, v13, :cond_65

    .line 1351
    .line 1352
    const/16 v29, 0x1

    .line 1353
    .line 1354
    aget-object v10, v10, v29

    .line 1355
    .line 1356
    if-ne v10, v13, :cond_64

    .line 1357
    .line 1358
    goto :goto_30

    .line 1359
    :cond_64
    move/from16 v10, v30

    .line 1360
    .line 1361
    goto :goto_31

    .line 1362
    :cond_65
    :goto_30
    const/4 v10, 0x1

    .line 1363
    :goto_31
    if-lez v3, :cond_67

    .line 1364
    .line 1365
    if-eqz v10, :cond_67

    .line 1366
    .line 1367
    move/from16 v3, v30

    .line 1368
    .line 1369
    :goto_32
    if-ge v3, v0, :cond_67

    .line 1370
    .line 1371
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v10

    .line 1375
    check-cast v10, Lek0;

    .line 1376
    .line 1377
    if-nez v2, :cond_66

    .line 1378
    .line 1379
    invoke-virtual {v10}, Lek0;->d()I

    .line 1380
    .line 1381
    .line 1382
    move-result v12

    .line 1383
    sub-int v12, v7, v12

    .line 1384
    .line 1385
    invoke-virtual {v10, v12}, Lek0;->e(I)V

    .line 1386
    .line 1387
    .line 1388
    goto :goto_33

    .line 1389
    :cond_66
    invoke-virtual {v10}, Lek0;->c()I

    .line 1390
    .line 1391
    .line 1392
    move-result v12

    .line 1393
    sub-int v12, v7, v12

    .line 1394
    .line 1395
    invoke-virtual {v10, v12}, Lek0;->e(I)V

    .line 1396
    .line 1397
    .line 1398
    :goto_33
    add-int/lit8 v3, v3, 0x1

    .line 1399
    .line 1400
    goto :goto_32

    .line 1401
    :cond_67
    move/from16 v24, v4

    .line 1402
    .line 1403
    move/from16 v25, v5

    .line 1404
    .line 1405
    move/from16 v26, v6

    .line 1406
    .line 1407
    move/from16 v27, v9

    .line 1408
    .line 1409
    move-object/from16 v21, v17

    .line 1410
    .line 1411
    move-object/from16 v20, v19

    .line 1412
    .line 1413
    move/from16 v3, v30

    .line 1414
    .line 1415
    move v4, v3

    .line 1416
    move v5, v4

    .line 1417
    move-object/from16 v22, v31

    .line 1418
    .line 1419
    move-object/from16 v23, v37

    .line 1420
    .line 1421
    :goto_34
    if-ge v3, v0, :cond_6d

    .line 1422
    .line 1423
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v6

    .line 1427
    check-cast v6, Lek0;

    .line 1428
    .line 1429
    if-nez v2, :cond_6a

    .line 1430
    .line 1431
    add-int/lit8 v9, v0, -0x1

    .line 1432
    .line 1433
    if-ge v3, v9, :cond_68

    .line 1434
    .line 1435
    add-int/lit8 v9, v3, 0x1

    .line 1436
    .line 1437
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v9

    .line 1441
    check-cast v9, Lek0;

    .line 1442
    .line 1443
    iget-object v9, v9, Lek0;->b:Lzz;

    .line 1444
    .line 1445
    iget-object v9, v9, Lzz;->K:Loz;

    .line 1446
    .line 1447
    move-object/from16 v23, v9

    .line 1448
    .line 1449
    move/from16 v27, v30

    .line 1450
    .line 1451
    goto :goto_35

    .line 1452
    :cond_68
    iget v9, v1, Ly53;->x0:I

    .line 1453
    .line 1454
    move/from16 v27, v9

    .line 1455
    .line 1456
    move-object/from16 v23, v37

    .line 1457
    .line 1458
    :goto_35
    iget-object v9, v6, Lek0;->b:Lzz;

    .line 1459
    .line 1460
    iget-object v9, v9, Lzz;->M:Loz;

    .line 1461
    .line 1462
    move/from16 v19, v2

    .line 1463
    .line 1464
    move-object/from16 v18, v6

    .line 1465
    .line 1466
    move/from16 v28, v7

    .line 1467
    .line 1468
    invoke-virtual/range {v18 .. v28}, Lek0;->f(ILoz;Loz;Loz;Loz;IIIII)V

    .line 1469
    .line 1470
    .line 1471
    invoke-virtual {v6}, Lek0;->d()I

    .line 1472
    .line 1473
    .line 1474
    move-result v10

    .line 1475
    invoke-static {v4, v10}, Ljava/lang/Math;->max(II)I

    .line 1476
    .line 1477
    .line 1478
    move-result v4

    .line 1479
    invoke-virtual {v6}, Lek0;->c()I

    .line 1480
    .line 1481
    .line 1482
    move-result v6

    .line 1483
    add-int/2addr v6, v5

    .line 1484
    if-lez v3, :cond_69

    .line 1485
    .line 1486
    iget v5, v1, Lgk0;->U0:I

    .line 1487
    .line 1488
    add-int/2addr v6, v5

    .line 1489
    :cond_69
    move v5, v6

    .line 1490
    move-object/from16 v21, v9

    .line 1491
    .line 1492
    move/from16 v25, v30

    .line 1493
    .line 1494
    goto :goto_37

    .line 1495
    :cond_6a
    add-int/lit8 v9, v0, -0x1

    .line 1496
    .line 1497
    if-ge v3, v9, :cond_6b

    .line 1498
    .line 1499
    add-int/lit8 v9, v3, 0x1

    .line 1500
    .line 1501
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v9

    .line 1505
    check-cast v9, Lek0;

    .line 1506
    .line 1507
    iget-object v9, v9, Lek0;->b:Lzz;

    .line 1508
    .line 1509
    iget-object v9, v9, Lzz;->J:Loz;

    .line 1510
    .line 1511
    move-object/from16 v22, v9

    .line 1512
    .line 1513
    move/from16 v26, v30

    .line 1514
    .line 1515
    goto :goto_36

    .line 1516
    :cond_6b
    iget v9, v1, Ly53;->B0:I

    .line 1517
    .line 1518
    move/from16 v26, v9

    .line 1519
    .line 1520
    move-object/from16 v22, v31

    .line 1521
    .line 1522
    :goto_36
    iget-object v9, v6, Lek0;->b:Lzz;

    .line 1523
    .line 1524
    iget-object v9, v9, Lzz;->L:Loz;

    .line 1525
    .line 1526
    move/from16 v19, v2

    .line 1527
    .line 1528
    move-object/from16 v18, v6

    .line 1529
    .line 1530
    move/from16 v28, v7

    .line 1531
    .line 1532
    invoke-virtual/range {v18 .. v28}, Lek0;->f(ILoz;Loz;Loz;Loz;IIIII)V

    .line 1533
    .line 1534
    .line 1535
    invoke-virtual/range {v18 .. v18}, Lek0;->d()I

    .line 1536
    .line 1537
    .line 1538
    move-result v6

    .line 1539
    add-int/2addr v6, v4

    .line 1540
    invoke-virtual/range {v18 .. v18}, Lek0;->c()I

    .line 1541
    .line 1542
    .line 1543
    move-result v4

    .line 1544
    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    .line 1545
    .line 1546
    .line 1547
    move-result v4

    .line 1548
    if-lez v3, :cond_6c

    .line 1549
    .line 1550
    iget v5, v1, Lgk0;->T0:I

    .line 1551
    .line 1552
    add-int/2addr v6, v5

    .line 1553
    :cond_6c
    move v5, v4

    .line 1554
    move v4, v6

    .line 1555
    move-object/from16 v20, v9

    .line 1556
    .line 1557
    move/from16 v24, v30

    .line 1558
    .line 1559
    :goto_37
    add-int/lit8 v3, v3, 0x1

    .line 1560
    .line 1561
    goto/16 :goto_34

    .line 1562
    .line 1563
    :cond_6d
    aput v4, v36, v30

    .line 1564
    .line 1565
    const/16 v29, 0x1

    .line 1566
    .line 1567
    aput v5, v36, v29

    .line 1568
    .line 1569
    goto/16 :goto_8

    .line 1570
    .line 1571
    :cond_6e
    move-object v11, v2

    .line 1572
    move/from16 v33, v3

    .line 1573
    .line 1574
    move/from16 v34, v4

    .line 1575
    .line 1576
    move/from16 v35, v5

    .line 1577
    .line 1578
    move-object/from16 v36, v7

    .line 1579
    .line 1580
    move/from16 v32, v18

    .line 1581
    .line 1582
    move/from16 v7, v28

    .line 1583
    .line 1584
    iget v2, v1, Lgk0;->Z0:I

    .line 1585
    .line 1586
    if-nez v15, :cond_6f

    .line 1587
    .line 1588
    goto/16 :goto_8

    .line 1589
    .line 1590
    :cond_6f
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 1591
    .line 1592
    .line 1593
    move-result v0

    .line 1594
    if-nez v0, :cond_70

    .line 1595
    .line 1596
    new-instance v0, Lek0;

    .line 1597
    .line 1598
    iget-object v5, v1, Lzz;->L:Loz;

    .line 1599
    .line 1600
    iget-object v6, v1, Lzz;->M:Loz;

    .line 1601
    .line 1602
    iget-object v3, v1, Lzz;->J:Loz;

    .line 1603
    .line 1604
    iget-object v4, v1, Lzz;->K:Loz;

    .line 1605
    .line 1606
    invoke-direct/range {v0 .. v7}, Lek0;-><init>(Lgk0;ILoz;Loz;Loz;Loz;I)V

    .line 1607
    .line 1608
    .line 1609
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1610
    .line 1611
    .line 1612
    goto :goto_38

    .line 1613
    :cond_70
    move/from16 v0, v30

    .line 1614
    .line 1615
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v3

    .line 1619
    check-cast v3, Lek0;

    .line 1620
    .line 1621
    iput v0, v3, Lek0;->c:I

    .line 1622
    .line 1623
    const/4 v6, 0x0

    .line 1624
    iput-object v6, v3, Lek0;->b:Lzz;

    .line 1625
    .line 1626
    iput v0, v3, Lek0;->l:I

    .line 1627
    .line 1628
    iput v0, v3, Lek0;->m:I

    .line 1629
    .line 1630
    iput v0, v3, Lek0;->n:I

    .line 1631
    .line 1632
    iput v0, v3, Lek0;->o:I

    .line 1633
    .line 1634
    iput v0, v3, Lek0;->p:I

    .line 1635
    .line 1636
    iget v0, v1, Ly53;->A0:I

    .line 1637
    .line 1638
    iget v4, v1, Ly53;->w0:I

    .line 1639
    .line 1640
    iget v5, v1, Ly53;->B0:I

    .line 1641
    .line 1642
    iget v6, v1, Ly53;->x0:I

    .line 1643
    .line 1644
    iget-object v9, v1, Lzz;->J:Loz;

    .line 1645
    .line 1646
    iget-object v10, v1, Lzz;->K:Loz;

    .line 1647
    .line 1648
    iget-object v11, v1, Lzz;->L:Loz;

    .line 1649
    .line 1650
    iget-object v12, v1, Lzz;->M:Loz;

    .line 1651
    .line 1652
    move/from16 v24, v0

    .line 1653
    .line 1654
    move/from16 v19, v2

    .line 1655
    .line 1656
    move-object/from16 v18, v3

    .line 1657
    .line 1658
    move/from16 v25, v4

    .line 1659
    .line 1660
    move/from16 v26, v5

    .line 1661
    .line 1662
    move/from16 v27, v6

    .line 1663
    .line 1664
    move/from16 v28, v7

    .line 1665
    .line 1666
    move-object/from16 v20, v9

    .line 1667
    .line 1668
    move-object/from16 v21, v10

    .line 1669
    .line 1670
    move-object/from16 v22, v11

    .line 1671
    .line 1672
    move-object/from16 v23, v12

    .line 1673
    .line 1674
    invoke-virtual/range {v18 .. v28}, Lek0;->f(ILoz;Loz;Loz;Loz;IIIII)V

    .line 1675
    .line 1676
    .line 1677
    move-object/from16 v0, v18

    .line 1678
    .line 1679
    :goto_38
    const/4 v2, 0x0

    .line 1680
    :goto_39
    if-ge v2, v15, :cond_71

    .line 1681
    .line 1682
    aget-object v3, v14, v2

    .line 1683
    .line 1684
    invoke-virtual {v0, v3}, Lek0;->a(Lzz;)V

    .line 1685
    .line 1686
    .line 1687
    add-int/lit8 v2, v2, 0x1

    .line 1688
    .line 1689
    goto :goto_39

    .line 1690
    :cond_71
    invoke-virtual {v0}, Lek0;->d()I

    .line 1691
    .line 1692
    .line 1693
    move-result v2

    .line 1694
    const/16 v30, 0x0

    .line 1695
    .line 1696
    aput v2, v36, v30

    .line 1697
    .line 1698
    invoke-virtual {v0}, Lek0;->c()I

    .line 1699
    .line 1700
    .line 1701
    move-result v0

    .line 1702
    const/16 v29, 0x1

    .line 1703
    .line 1704
    aput v0, v36, v29

    .line 1705
    .line 1706
    :goto_3a
    aget v0, v36, v30

    .line 1707
    .line 1708
    add-int v0, v0, v32

    .line 1709
    .line 1710
    add-int v0, v0, v33

    .line 1711
    .line 1712
    aget v2, v36, v29

    .line 1713
    .line 1714
    add-int v2, v2, v34

    .line 1715
    .line 1716
    add-int v2, v2, v35

    .line 1717
    .line 1718
    const/high16 v3, -0x80000000

    .line 1719
    .line 1720
    const/high16 v4, 0x40000000    # 2.0f

    .line 1721
    .line 1722
    if-ne v8, v4, :cond_72

    .line 1723
    .line 1724
    move/from16 v0, p2

    .line 1725
    .line 1726
    :goto_3b
    move/from16 v10, p3

    .line 1727
    .line 1728
    goto :goto_3c

    .line 1729
    :cond_72
    if-ne v8, v3, :cond_73

    .line 1730
    .line 1731
    move/from16 v9, p2

    .line 1732
    .line 1733
    invoke-static {v0, v9}, Ljava/lang/Math;->min(II)I

    .line 1734
    .line 1735
    .line 1736
    move-result v0

    .line 1737
    goto :goto_3b

    .line 1738
    :cond_73
    move/from16 v10, p3

    .line 1739
    .line 1740
    if-nez v8, :cond_74

    .line 1741
    .line 1742
    goto :goto_3c

    .line 1743
    :cond_74
    move/from16 v0, v30

    .line 1744
    .line 1745
    :goto_3c
    if-ne v10, v4, :cond_75

    .line 1746
    .line 1747
    move/from16 v2, p4

    .line 1748
    .line 1749
    goto :goto_3d

    .line 1750
    :cond_75
    if-ne v10, v3, :cond_76

    .line 1751
    .line 1752
    move/from16 v11, p4

    .line 1753
    .line 1754
    invoke-static {v2, v11}, Ljava/lang/Math;->min(II)I

    .line 1755
    .line 1756
    .line 1757
    move-result v2

    .line 1758
    goto :goto_3d

    .line 1759
    :cond_76
    if-nez v10, :cond_77

    .line 1760
    .line 1761
    goto :goto_3d

    .line 1762
    :cond_77
    move/from16 v2, v30

    .line 1763
    .line 1764
    :goto_3d
    iput v0, v1, Ly53;->D0:I

    .line 1765
    .line 1766
    iput v2, v1, Ly53;->E0:I

    .line 1767
    .line 1768
    invoke-virtual {v1, v0}, Lzz;->P(I)V

    .line 1769
    .line 1770
    .line 1771
    invoke-virtual {v1, v2}, Lzz;->M(I)V

    .line 1772
    .line 1773
    .line 1774
    iget v0, v1, Lcu0;->v0:I

    .line 1775
    .line 1776
    if-lez v0, :cond_78

    .line 1777
    .line 1778
    move/from16 v14, v29

    .line 1779
    .line 1780
    goto :goto_3e

    .line 1781
    :cond_78
    move/from16 v14, v30

    .line 1782
    .line 1783
    :goto_3e
    iput-boolean v14, v1, Ly53;->C0:Z

    .line 1784
    .line 1785
    return-void
.end method

.method public final X(Lzz;I)I
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p1, Lzz;->U:[Lyz;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    aget-object v1, v1, v2

    .line 9
    .line 10
    sget-object v3, Lyz;->c:Lyz;

    .line 11
    .line 12
    if-ne v1, v3, :cond_5

    .line 13
    .line 14
    iget v1, p1, Lzz;->s:I

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    return v0

    .line 19
    :cond_1
    const/4 v3, 0x2

    .line 20
    if-ne v1, v3, :cond_3

    .line 21
    .line 22
    iget v1, p1, Lzz;->z:F

    .line 23
    .line 24
    int-to-float p2, p2

    .line 25
    mul-float/2addr v1, p2

    .line 26
    float-to-int v8, v1

    .line 27
    invoke-virtual {p1}, Lzz;->l()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eq v8, p2, :cond_2

    .line 32
    .line 33
    iput-boolean v2, p1, Lzz;->g:Z

    .line 34
    .line 35
    iget-object p2, p1, Lzz;->U:[Lyz;

    .line 36
    .line 37
    aget-object v5, p2, v0

    .line 38
    .line 39
    invoke-virtual {p1}, Lzz;->r()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    sget-object v7, Lyz;->a:Lyz;

    .line 44
    .line 45
    move-object v3, p0

    .line 46
    move-object v4, p1

    .line 47
    invoke-virtual/range {v3 .. v8}, Ly53;->W(Lzz;Lyz;ILyz;I)V

    .line 48
    .line 49
    .line 50
    :cond_2
    return v8

    .line 51
    :cond_3
    move-object v4, p1

    .line 52
    if-ne v1, v2, :cond_4

    .line 53
    .line 54
    invoke-virtual {v4}, Lzz;->l()I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    return p0

    .line 59
    :cond_4
    const/4 p0, 0x3

    .line 60
    if-ne v1, p0, :cond_6

    .line 61
    .line 62
    invoke-virtual {v4}, Lzz;->r()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    int-to-float p0, p0

    .line 67
    iget p1, v4, Lzz;->Y:F

    .line 68
    .line 69
    mul-float/2addr p0, p1

    .line 70
    const/high16 p1, 0x3f000000    # 0.5f

    .line 71
    .line 72
    add-float/2addr p0, p1

    .line 73
    float-to-int p0, p0

    .line 74
    return p0

    .line 75
    :cond_5
    move-object v4, p1

    .line 76
    :cond_6
    invoke-virtual {v4}, Lzz;->l()I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    return p0
.end method

.method public final Y(Lzz;I)I
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p1, Lzz;->U:[Lyz;

    .line 6
    .line 7
    aget-object v1, v1, v0

    .line 8
    .line 9
    sget-object v2, Lyz;->c:Lyz;

    .line 10
    .line 11
    if-ne v1, v2, :cond_5

    .line 12
    .line 13
    iget v1, p1, Lzz;->r:I

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    return v0

    .line 18
    :cond_1
    const/4 v0, 0x2

    .line 19
    const/4 v2, 0x1

    .line 20
    if-ne v1, v0, :cond_3

    .line 21
    .line 22
    iget v0, p1, Lzz;->w:F

    .line 23
    .line 24
    int-to-float p2, p2

    .line 25
    mul-float/2addr v0, p2

    .line 26
    float-to-int v6, v0

    .line 27
    invoke-virtual {p1}, Lzz;->r()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eq v6, p2, :cond_2

    .line 32
    .line 33
    iput-boolean v2, p1, Lzz;->g:Z

    .line 34
    .line 35
    iget-object p2, p1, Lzz;->U:[Lyz;

    .line 36
    .line 37
    aget-object v7, p2, v2

    .line 38
    .line 39
    invoke-virtual {p1}, Lzz;->l()I

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    sget-object v5, Lyz;->a:Lyz;

    .line 44
    .line 45
    move-object v3, p0

    .line 46
    move-object v4, p1

    .line 47
    invoke-virtual/range {v3 .. v8}, Ly53;->W(Lzz;Lyz;ILyz;I)V

    .line 48
    .line 49
    .line 50
    :cond_2
    return v6

    .line 51
    :cond_3
    move-object v4, p1

    .line 52
    if-ne v1, v2, :cond_4

    .line 53
    .line 54
    invoke-virtual {v4}, Lzz;->r()I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    return p0

    .line 59
    :cond_4
    const/4 p0, 0x3

    .line 60
    if-ne v1, p0, :cond_6

    .line 61
    .line 62
    invoke-virtual {v4}, Lzz;->l()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    int-to-float p0, p0

    .line 67
    iget p1, v4, Lzz;->Y:F

    .line 68
    .line 69
    mul-float/2addr p0, p1

    .line 70
    const/high16 p1, 0x3f000000    # 0.5f

    .line 71
    .line 72
    add-float/2addr p0, p1

    .line 73
    float-to-int p0, p0

    .line 74
    return p0

    .line 75
    :cond_5
    move-object v4, p1

    .line 76
    :cond_6
    invoke-virtual {v4}, Lzz;->r()I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    return p0
.end method

.method public final b(Lt71;Z)V
    .locals 11

    .line 1
    invoke-super {p0, p1, p2}, Lzz;->b(Lt71;Z)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lzz;->V:Lzz;

    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    const/4 v0, 0x1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    check-cast p1, La00;

    .line 11
    .line 12
    iget-boolean p1, p1, La00;->z0:Z

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    move p1, v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move p1, p2

    .line 19
    :goto_0
    iget v1, p0, Lgk0;->X0:I

    .line 20
    .line 21
    iget-object v2, p0, Lgk0;->a1:Ljava/util/ArrayList;

    .line 22
    .line 23
    if-eqz v1, :cond_1b

    .line 24
    .line 25
    if-eq v1, v0, :cond_19

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    const/4 v3, 0x3

    .line 31
    if-eq v1, v3, :cond_1

    .line 32
    .line 33
    goto/16 :goto_e

    .line 34
    .line 35
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    move v3, p2

    .line 40
    :goto_1
    if-ge v3, v1, :cond_1c

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Lek0;

    .line 47
    .line 48
    add-int/lit8 v5, v1, -0x1

    .line 49
    .line 50
    if-ne v3, v5, :cond_2

    .line 51
    .line 52
    move v5, v0

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    move v5, p2

    .line 55
    :goto_2
    invoke-virtual {v4, p1, v3, v5}, Lek0;->b(ZIZ)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v3, v3, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    iget-object v1, p0, Lgk0;->d1:[I

    .line 62
    .line 63
    if-eqz v1, :cond_1c

    .line 64
    .line 65
    iget-object v1, p0, Lgk0;->c1:[Lzz;

    .line 66
    .line 67
    if-eqz v1, :cond_1c

    .line 68
    .line 69
    iget-object v1, p0, Lgk0;->b1:[Lzz;

    .line 70
    .line 71
    if-nez v1, :cond_4

    .line 72
    .line 73
    goto/16 :goto_e

    .line 74
    .line 75
    :cond_4
    move v1, p2

    .line 76
    :goto_3
    iget v2, p0, Lgk0;->f1:I

    .line 77
    .line 78
    if-ge v1, v2, :cond_5

    .line 79
    .line 80
    iget-object v2, p0, Lgk0;->e1:[Lzz;

    .line 81
    .line 82
    aget-object v2, v2, v1

    .line 83
    .line 84
    invoke-virtual {v2}, Lzz;->E()V

    .line 85
    .line 86
    .line 87
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_5
    iget-object v1, p0, Lgk0;->d1:[I

    .line 91
    .line 92
    aget v2, v1, p2

    .line 93
    .line 94
    aget v1, v1, v0

    .line 95
    .line 96
    iget v3, p0, Lgk0;->N0:F

    .line 97
    .line 98
    const/4 v4, 0x0

    .line 99
    move v5, p2

    .line 100
    :goto_4
    const/16 v6, 0x8

    .line 101
    .line 102
    if-ge v5, v2, :cond_c

    .line 103
    .line 104
    if-eqz p1, :cond_6

    .line 105
    .line 106
    sub-int v3, v2, v5

    .line 107
    .line 108
    sub-int/2addr v3, v0

    .line 109
    const/high16 v7, 0x3f800000    # 1.0f

    .line 110
    .line 111
    iget v8, p0, Lgk0;->N0:F

    .line 112
    .line 113
    sub-float/2addr v7, v8

    .line 114
    goto :goto_5

    .line 115
    :cond_6
    move v7, v3

    .line 116
    move v3, v5

    .line 117
    :goto_5
    iget-object v8, p0, Lgk0;->c1:[Lzz;

    .line 118
    .line 119
    aget-object v3, v8, v3

    .line 120
    .line 121
    if-eqz v3, :cond_b

    .line 122
    .line 123
    iget-object v8, v3, Lzz;->J:Loz;

    .line 124
    .line 125
    iget v9, v3, Lzz;->i0:I

    .line 126
    .line 127
    if-ne v9, v6, :cond_7

    .line 128
    .line 129
    goto :goto_6

    .line 130
    :cond_7
    if-nez v5, :cond_8

    .line 131
    .line 132
    iget-object v6, p0, Lzz;->J:Loz;

    .line 133
    .line 134
    iget v9, p0, Ly53;->A0:I

    .line 135
    .line 136
    invoke-virtual {v3, v8, v6, v9}, Lzz;->f(Loz;Loz;I)V

    .line 137
    .line 138
    .line 139
    iget v6, p0, Lgk0;->H0:I

    .line 140
    .line 141
    iput v6, v3, Lzz;->l0:I

    .line 142
    .line 143
    iput v7, v3, Lzz;->f0:F

    .line 144
    .line 145
    :cond_8
    add-int/lit8 v6, v2, -0x1

    .line 146
    .line 147
    if-ne v5, v6, :cond_9

    .line 148
    .line 149
    iget-object v6, v3, Lzz;->L:Loz;

    .line 150
    .line 151
    iget-object v9, p0, Lzz;->L:Loz;

    .line 152
    .line 153
    iget v10, p0, Ly53;->B0:I

    .line 154
    .line 155
    invoke-virtual {v3, v6, v9, v10}, Lzz;->f(Loz;Loz;I)V

    .line 156
    .line 157
    .line 158
    :cond_9
    if-lez v5, :cond_a

    .line 159
    .line 160
    if-eqz v4, :cond_a

    .line 161
    .line 162
    iget-object v6, v4, Lzz;->L:Loz;

    .line 163
    .line 164
    iget v9, p0, Lgk0;->T0:I

    .line 165
    .line 166
    invoke-virtual {v3, v8, v6, v9}, Lzz;->f(Loz;Loz;I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4, v6, v8, p2}, Lzz;->f(Loz;Loz;I)V

    .line 170
    .line 171
    .line 172
    :cond_a
    move-object v4, v3

    .line 173
    :cond_b
    :goto_6
    add-int/lit8 v5, v5, 0x1

    .line 174
    .line 175
    move v3, v7

    .line 176
    goto :goto_4

    .line 177
    :cond_c
    move p1, p2

    .line 178
    :goto_7
    if-ge p1, v1, :cond_12

    .line 179
    .line 180
    iget-object v3, p0, Lgk0;->b1:[Lzz;

    .line 181
    .line 182
    aget-object v3, v3, p1

    .line 183
    .line 184
    if-eqz v3, :cond_11

    .line 185
    .line 186
    iget-object v5, v3, Lzz;->K:Loz;

    .line 187
    .line 188
    iget v7, v3, Lzz;->i0:I

    .line 189
    .line 190
    if-ne v7, v6, :cond_d

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_d
    if-nez p1, :cond_e

    .line 194
    .line 195
    iget-object v7, p0, Lzz;->K:Loz;

    .line 196
    .line 197
    iget v8, p0, Ly53;->w0:I

    .line 198
    .line 199
    invoke-virtual {v3, v5, v7, v8}, Lzz;->f(Loz;Loz;I)V

    .line 200
    .line 201
    .line 202
    iget v7, p0, Lgk0;->I0:I

    .line 203
    .line 204
    iput v7, v3, Lzz;->m0:I

    .line 205
    .line 206
    iget v7, p0, Lgk0;->O0:F

    .line 207
    .line 208
    iput v7, v3, Lzz;->g0:F

    .line 209
    .line 210
    :cond_e
    add-int/lit8 v7, v1, -0x1

    .line 211
    .line 212
    if-ne p1, v7, :cond_f

    .line 213
    .line 214
    iget-object v7, v3, Lzz;->M:Loz;

    .line 215
    .line 216
    iget-object v8, p0, Lzz;->M:Loz;

    .line 217
    .line 218
    iget v9, p0, Ly53;->x0:I

    .line 219
    .line 220
    invoke-virtual {v3, v7, v8, v9}, Lzz;->f(Loz;Loz;I)V

    .line 221
    .line 222
    .line 223
    :cond_f
    if-lez p1, :cond_10

    .line 224
    .line 225
    if-eqz v4, :cond_10

    .line 226
    .line 227
    iget-object v7, v4, Lzz;->M:Loz;

    .line 228
    .line 229
    iget v8, p0, Lgk0;->U0:I

    .line 230
    .line 231
    invoke-virtual {v3, v5, v7, v8}, Lzz;->f(Loz;Loz;I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v4, v7, v5, p2}, Lzz;->f(Loz;Loz;I)V

    .line 235
    .line 236
    .line 237
    :cond_10
    move-object v4, v3

    .line 238
    :cond_11
    :goto_8
    add-int/lit8 p1, p1, 0x1

    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_12
    move p1, p2

    .line 242
    :goto_9
    if-ge p1, v2, :cond_1c

    .line 243
    .line 244
    move v3, p2

    .line 245
    :goto_a
    if-ge v3, v1, :cond_18

    .line 246
    .line 247
    mul-int v4, v3, v2

    .line 248
    .line 249
    add-int/2addr v4, p1

    .line 250
    iget v5, p0, Lgk0;->Z0:I

    .line 251
    .line 252
    if-ne v5, v0, :cond_13

    .line 253
    .line 254
    mul-int v4, p1, v1

    .line 255
    .line 256
    add-int/2addr v4, v3

    .line 257
    :cond_13
    iget-object v5, p0, Lgk0;->e1:[Lzz;

    .line 258
    .line 259
    array-length v7, v5

    .line 260
    if-lt v4, v7, :cond_14

    .line 261
    .line 262
    goto :goto_b

    .line 263
    :cond_14
    aget-object v4, v5, v4

    .line 264
    .line 265
    if-eqz v4, :cond_17

    .line 266
    .line 267
    iget v5, v4, Lzz;->i0:I

    .line 268
    .line 269
    if-ne v5, v6, :cond_15

    .line 270
    .line 271
    goto :goto_b

    .line 272
    :cond_15
    iget-object v5, p0, Lgk0;->c1:[Lzz;

    .line 273
    .line 274
    aget-object v5, v5, p1

    .line 275
    .line 276
    iget-object v7, p0, Lgk0;->b1:[Lzz;

    .line 277
    .line 278
    aget-object v7, v7, v3

    .line 279
    .line 280
    if-eq v4, v5, :cond_16

    .line 281
    .line 282
    iget-object v8, v4, Lzz;->J:Loz;

    .line 283
    .line 284
    iget-object v9, v5, Lzz;->J:Loz;

    .line 285
    .line 286
    invoke-virtual {v4, v8, v9, p2}, Lzz;->f(Loz;Loz;I)V

    .line 287
    .line 288
    .line 289
    iget-object v8, v4, Lzz;->L:Loz;

    .line 290
    .line 291
    iget-object v5, v5, Lzz;->L:Loz;

    .line 292
    .line 293
    invoke-virtual {v4, v8, v5, p2}, Lzz;->f(Loz;Loz;I)V

    .line 294
    .line 295
    .line 296
    :cond_16
    if-eq v4, v7, :cond_17

    .line 297
    .line 298
    iget-object v5, v4, Lzz;->K:Loz;

    .line 299
    .line 300
    iget-object v8, v7, Lzz;->K:Loz;

    .line 301
    .line 302
    invoke-virtual {v4, v5, v8, p2}, Lzz;->f(Loz;Loz;I)V

    .line 303
    .line 304
    .line 305
    iget-object v5, v4, Lzz;->M:Loz;

    .line 306
    .line 307
    iget-object v7, v7, Lzz;->M:Loz;

    .line 308
    .line 309
    invoke-virtual {v4, v5, v7, p2}, Lzz;->f(Loz;Loz;I)V

    .line 310
    .line 311
    .line 312
    :cond_17
    :goto_b
    add-int/lit8 v3, v3, 0x1

    .line 313
    .line 314
    goto :goto_a

    .line 315
    :cond_18
    add-int/lit8 p1, p1, 0x1

    .line 316
    .line 317
    goto :goto_9

    .line 318
    :cond_19
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    move v3, p2

    .line 323
    :goto_c
    if-ge v3, v1, :cond_1c

    .line 324
    .line 325
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    check-cast v4, Lek0;

    .line 330
    .line 331
    add-int/lit8 v5, v1, -0x1

    .line 332
    .line 333
    if-ne v3, v5, :cond_1a

    .line 334
    .line 335
    move v5, v0

    .line 336
    goto :goto_d

    .line 337
    :cond_1a
    move v5, p2

    .line 338
    :goto_d
    invoke-virtual {v4, p1, v3, v5}, Lek0;->b(ZIZ)V

    .line 339
    .line 340
    .line 341
    add-int/lit8 v3, v3, 0x1

    .line 342
    .line 343
    goto :goto_c

    .line 344
    :cond_1b
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 345
    .line 346
    .line 347
    move-result v1

    .line 348
    if-lez v1, :cond_1c

    .line 349
    .line 350
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    check-cast v1, Lek0;

    .line 355
    .line 356
    invoke-virtual {v1, p1, p2, v0}, Lek0;->b(ZIZ)V

    .line 357
    .line 358
    .line 359
    :cond_1c
    :goto_e
    iput-boolean p2, p0, Ly53;->C0:Z

    .line 360
    .line 361
    return-void
.end method

.method public final g(Lzz;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcu0;->g(Lzz;Ljava/util/HashMap;)V

    .line 2
    .line 3
    .line 4
    check-cast p1, Lgk0;

    .line 5
    .line 6
    iget p2, p1, Lgk0;->H0:I

    .line 7
    .line 8
    iput p2, p0, Lgk0;->H0:I

    .line 9
    .line 10
    iget p2, p1, Lgk0;->I0:I

    .line 11
    .line 12
    iput p2, p0, Lgk0;->I0:I

    .line 13
    .line 14
    iget p2, p1, Lgk0;->J0:I

    .line 15
    .line 16
    iput p2, p0, Lgk0;->J0:I

    .line 17
    .line 18
    iget p2, p1, Lgk0;->K0:I

    .line 19
    .line 20
    iput p2, p0, Lgk0;->K0:I

    .line 21
    .line 22
    iget p2, p1, Lgk0;->L0:I

    .line 23
    .line 24
    iput p2, p0, Lgk0;->L0:I

    .line 25
    .line 26
    iget p2, p1, Lgk0;->M0:I

    .line 27
    .line 28
    iput p2, p0, Lgk0;->M0:I

    .line 29
    .line 30
    iget p2, p1, Lgk0;->N0:F

    .line 31
    .line 32
    iput p2, p0, Lgk0;->N0:F

    .line 33
    .line 34
    iget p2, p1, Lgk0;->O0:F

    .line 35
    .line 36
    iput p2, p0, Lgk0;->O0:F

    .line 37
    .line 38
    iget p2, p1, Lgk0;->P0:F

    .line 39
    .line 40
    iput p2, p0, Lgk0;->P0:F

    .line 41
    .line 42
    iget p2, p1, Lgk0;->Q0:F

    .line 43
    .line 44
    iput p2, p0, Lgk0;->Q0:F

    .line 45
    .line 46
    iget p2, p1, Lgk0;->R0:F

    .line 47
    .line 48
    iput p2, p0, Lgk0;->R0:F

    .line 49
    .line 50
    iget p2, p1, Lgk0;->S0:F

    .line 51
    .line 52
    iput p2, p0, Lgk0;->S0:F

    .line 53
    .line 54
    iget p2, p1, Lgk0;->T0:I

    .line 55
    .line 56
    iput p2, p0, Lgk0;->T0:I

    .line 57
    .line 58
    iget p2, p1, Lgk0;->U0:I

    .line 59
    .line 60
    iput p2, p0, Lgk0;->U0:I

    .line 61
    .line 62
    iget p2, p1, Lgk0;->V0:I

    .line 63
    .line 64
    iput p2, p0, Lgk0;->V0:I

    .line 65
    .line 66
    iget p2, p1, Lgk0;->W0:I

    .line 67
    .line 68
    iput p2, p0, Lgk0;->W0:I

    .line 69
    .line 70
    iget p2, p1, Lgk0;->X0:I

    .line 71
    .line 72
    iput p2, p0, Lgk0;->X0:I

    .line 73
    .line 74
    iget p2, p1, Lgk0;->Y0:I

    .line 75
    .line 76
    iput p2, p0, Lgk0;->Y0:I

    .line 77
    .line 78
    iget p1, p1, Lgk0;->Z0:I

    .line 79
    .line 80
    iput p1, p0, Lgk0;->Z0:I

    .line 81
    .line 82
    return-void
.end method

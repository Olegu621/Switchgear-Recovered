.class public final Leb1;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lfb1;


# direct methods
.method public synthetic constructor <init>(Lfb1;I)V
    .locals 0

    .line 1
    iput p2, p0, Leb1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Leb1;->b:Lfb1;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Leb1;->a:I

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x3

    .line 8
    iget-object v0, v0, Leb1;->b:Lfb1;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance v1, Lzt1;

    .line 14
    .line 15
    iget-object v2, v0, Lfb1;->o:Lhk2;

    .line 16
    .line 17
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Loz2;

    .line 22
    .line 23
    invoke-virtual {v0}, Lfb1;->e()Li03;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-object v0, v0, Lfb1;->a:Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->e:Ll03;

    .line 30
    .line 31
    invoke-direct {v1, v2, v3, v0}, Lzt1;-><init>(Loz2;Li03;Ll03;)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :pswitch_0
    new-instance v5, Lr3;

    .line 36
    .line 37
    invoke-virtual {v0}, Lfb1;->c()Lxu0;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v3, v0, Lfb1;->i:Lhk2;

    .line 42
    .line 43
    invoke-virtual {v3}, Lhk2;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Lhb1;

    .line 48
    .line 49
    invoke-direct {v5, v1, v3, v2}, Lr3;-><init>(Lxu0;Lhb1;I)V

    .line 50
    .line 51
    .line 52
    new-instance v4, Lv3;

    .line 53
    .line 54
    invoke-virtual {v0}, Lfb1;->d()La21;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-virtual {v0}, Lfb1;->e()Li03;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    iget-object v1, v0, Lfb1;->T:Lhk2;

    .line 63
    .line 64
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    move-object v8, v1

    .line 69
    check-cast v8, Lse0;

    .line 70
    .line 71
    iget-object v0, v0, Lfb1;->d:Lhk2;

    .line 72
    .line 73
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    move-object v9, v0

    .line 78
    check-cast v9, Lfn1;

    .line 79
    .line 80
    const/4 v10, 0x0

    .line 81
    invoke-direct/range {v4 .. v10}, Lv3;-><init>(Lr3;La21;Li03;Lse0;Lfn1;C)V

    .line 82
    .line 83
    .line 84
    new-instance v0, Lsr2;

    .line 85
    .line 86
    invoke-direct {v0, v4}, Lsr2;-><init>(Lv3;)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :pswitch_1
    iget-object v0, v0, Lfb1;->a:Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 91
    .line 92
    iget-wide v0, v0, Lcom/usercentrics/sdk/UsercentricsOptions;->d:J

    .line 93
    .line 94
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    return-object v0

    .line 99
    :pswitch_2
    new-instance v2, Lr3;

    .line 100
    .line 101
    invoke-virtual {v0}, Lfb1;->c()Lxu0;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    iget-object v5, v0, Lfb1;->i:Lhk2;

    .line 106
    .line 107
    invoke-virtual {v5}, Lhk2;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    check-cast v6, Lhb1;

    .line 112
    .line 113
    invoke-direct {v2, v1, v6, v4}, Lr3;-><init>(Lxu0;Lhb1;I)V

    .line 114
    .line 115
    .line 116
    new-instance v8, Lr3;

    .line 117
    .line 118
    invoke-virtual {v0}, Lfb1;->c()Lxu0;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {v5}, Lhk2;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    check-cast v4, Lhb1;

    .line 127
    .line 128
    invoke-direct {v8, v1, v4, v3}, Lr3;-><init>(Lxu0;Lhb1;I)V

    .line 129
    .line 130
    .line 131
    new-instance v14, Lgl2;

    .line 132
    .line 133
    new-instance v7, Lk51;

    .line 134
    .line 135
    invoke-virtual {v0}, Lfb1;->d()La21;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    invoke-virtual {v0}, Lfb1;->e()Li03;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    iget-object v1, v0, Lfb1;->T:Lhk2;

    .line 144
    .line 145
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    move-object v11, v3

    .line 150
    check-cast v11, Lse0;

    .line 151
    .line 152
    iget-object v3, v0, Lfb1;->d:Lhk2;

    .line 153
    .line 154
    invoke-virtual {v3}, Lhk2;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    move-object v12, v4

    .line 159
    check-cast v12, Lfn1;

    .line 160
    .line 161
    const/4 v13, 0x0

    .line 162
    invoke-direct/range {v7 .. v13}, Lk51;-><init>(Lr3;La21;Li03;Lse0;Lfn1;B)V

    .line 163
    .line 164
    .line 165
    move-object v4, v1

    .line 166
    move-object v8, v7

    .line 167
    new-instance v1, Lv3;

    .line 168
    .line 169
    move-object v5, v3

    .line 170
    invoke-virtual {v0}, Lfb1;->d()La21;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    move-object v6, v4

    .line 175
    invoke-virtual {v0}, Lfb1;->e()Li03;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-virtual {v6}, Lhk2;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    check-cast v0, Lse0;

    .line 184
    .line 185
    invoke-virtual {v5}, Lhk2;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    move-object v6, v5

    .line 190
    check-cast v6, Lfn1;

    .line 191
    .line 192
    const/4 v7, 0x0

    .line 193
    move-object v5, v0

    .line 194
    invoke-direct/range {v1 .. v7}, Lv3;-><init>(Lr3;La21;Li03;Lse0;Lfn1;B)V

    .line 195
    .line 196
    .line 197
    invoke-direct {v14, v8, v1}, Lgl2;-><init>(Lk51;Lv3;)V

    .line 198
    .line 199
    .line 200
    return-object v14

    .line 201
    :pswitch_3
    new-instance v1, Lfs0;

    .line 202
    .line 203
    iget-object v2, v0, Lfb1;->J:Lhk2;

    .line 204
    .line 205
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    check-cast v2, Lgl2;

    .line 210
    .line 211
    invoke-direct {v1, v2}, Lfs0;-><init>(Lgl2;)V

    .line 212
    .line 213
    .line 214
    new-instance v24, Lib1;

    .line 215
    .line 216
    invoke-direct/range {v24 .. v24}, Ljava/lang/Object;-><init>()V

    .line 217
    .line 218
    .line 219
    new-instance v15, Lqk2;

    .line 220
    .line 221
    invoke-virtual {v0}, Lfb1;->e()Li03;

    .line 222
    .line 223
    .line 224
    move-result-object v16

    .line 225
    invoke-virtual {v0}, Lfb1;->f()Lpc2;

    .line 226
    .line 227
    .line 228
    move-result-object v17

    .line 229
    iget-object v2, v0, Lfb1;->z:Lhk2;

    .line 230
    .line 231
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    move-object/from16 v18, v2

    .line 236
    .line 237
    check-cast v18, Lg80;

    .line 238
    .line 239
    iget-object v2, v0, Lfb1;->s:Lhk2;

    .line 240
    .line 241
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    move-object/from16 v19, v2

    .line 246
    .line 247
    check-cast v19, Ljz;

    .line 248
    .line 249
    iget-object v2, v0, Lfb1;->C:Lhk2;

    .line 250
    .line 251
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    move-object/from16 v20, v2

    .line 256
    .line 257
    check-cast v20, Lp91;

    .line 258
    .line 259
    iget-object v2, v0, Lfb1;->X:Lhk2;

    .line 260
    .line 261
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    move-object/from16 v21, v2

    .line 266
    .line 267
    check-cast v21, Ly3;

    .line 268
    .line 269
    invoke-virtual {v0}, Lfb1;->b()Lx80;

    .line 270
    .line 271
    .line 272
    move-result-object v23

    .line 273
    iget-object v0, v0, Lfb1;->U:Lhk2;

    .line 274
    .line 275
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    move-object/from16 v25, v0

    .line 280
    .line 281
    check-cast v25, Ljc2;

    .line 282
    .line 283
    move-object/from16 v22, v1

    .line 284
    .line 285
    invoke-direct/range {v15 .. v25}, Lqk2;-><init>(Li03;Lpc2;Lg80;Ljz;Lp91;Ly3;Lfs0;Lx80;Lib1;Ljc2;)V

    .line 286
    .line 287
    .line 288
    return-object v15

    .line 289
    :pswitch_4
    new-instance v1, Lwe2;

    .line 290
    .line 291
    iget-object v5, v0, Lfb1;->x:Lhk2;

    .line 292
    .line 293
    invoke-virtual {v5}, Lhk2;->getValue()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    check-cast v5, Lod2;

    .line 298
    .line 299
    iget-object v6, v0, Lfb1;->y:Lhk2;

    .line 300
    .line 301
    invoke-virtual {v6}, Lhk2;->getValue()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    check-cast v6, Lod2;

    .line 306
    .line 307
    invoke-direct {v1, v5, v6}, Lwe2;-><init>(Lod2;Lod2;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0}, Lfb1;->e()Li03;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    move-object v6, v5

    .line 315
    invoke-virtual {v0}, Lfb1;->d()La21;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    new-instance v7, Ljava/util/ArrayList;

    .line 326
    .line 327
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 328
    .line 329
    .line 330
    new-instance v8, Laj1;

    .line 331
    .line 332
    invoke-virtual {v0}, Lfb1;->d()La21;

    .line 333
    .line 334
    .line 335
    move-result-object v9

    .line 336
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    const/4 v9, 0x1

    .line 340
    invoke-direct {v8, v1, v9}, Lui1;-><init>(Lwe2;I)V

    .line 341
    .line 342
    .line 343
    new-array v10, v9, [Lui1;

    .line 344
    .line 345
    const/4 v11, 0x0

    .line 346
    aput-object v8, v10, v11

    .line 347
    .line 348
    invoke-static {v7, v10}, Luw;->l(Ljava/util/Collection;[Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    new-instance v8, Lbj1;

    .line 352
    .line 353
    const/4 v10, 0x2

    .line 354
    invoke-direct {v8, v1, v10, v11}, Lbj1;-><init>(Lwe2;II)V

    .line 355
    .line 356
    .line 357
    new-array v12, v9, [Lui1;

    .line 358
    .line 359
    aput-object v8, v12, v11

    .line 360
    .line 361
    invoke-static {v7, v12}, Luw;->l(Ljava/util/Collection;[Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    new-instance v8, Lcj1;

    .line 365
    .line 366
    invoke-virtual {v0}, Lfb1;->d()La21;

    .line 367
    .line 368
    .line 369
    move-result-object v12

    .line 370
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    invoke-direct {v8, v1, v4}, Lui1;-><init>(Lwe2;I)V

    .line 374
    .line 375
    .line 376
    new-array v12, v9, [Lui1;

    .line 377
    .line 378
    aput-object v8, v12, v11

    .line 379
    .line 380
    invoke-static {v7, v12}, Luw;->l(Ljava/util/Collection;[Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    new-instance v8, Lbj1;

    .line 384
    .line 385
    invoke-direct {v8, v1, v3, v9}, Lbj1;-><init>(Lwe2;II)V

    .line 386
    .line 387
    .line 388
    new-array v12, v9, [Lui1;

    .line 389
    .line 390
    aput-object v8, v12, v11

    .line 391
    .line 392
    invoke-static {v7, v12}, Luw;->l(Ljava/util/Collection;[Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    new-instance v8, Lbj1;

    .line 396
    .line 397
    invoke-direct {v8, v1, v2, v10}, Lbj1;-><init>(Lwe2;II)V

    .line 398
    .line 399
    .line 400
    new-array v2, v9, [Lui1;

    .line 401
    .line 402
    aput-object v8, v2, v11

    .line 403
    .line 404
    invoke-static {v7, v2}, Luw;->l(Ljava/util/Collection;[Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    new-instance v2, Lbj1;

    .line 408
    .line 409
    invoke-virtual {v0}, Lfb1;->d()La21;

    .line 410
    .line 411
    .line 412
    move-result-object v8

    .line 413
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    const/4 v8, 0x6

    .line 417
    invoke-direct {v2, v1, v8, v4}, Lbj1;-><init>(Lwe2;II)V

    .line 418
    .line 419
    .line 420
    new-array v4, v9, [Lui1;

    .line 421
    .line 422
    aput-object v2, v4, v11

    .line 423
    .line 424
    invoke-static {v7, v4}, Luw;->l(Ljava/util/Collection;[Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    new-instance v2, Lbj1;

    .line 428
    .line 429
    const/4 v4, 0x7

    .line 430
    invoke-direct {v2, v1, v4, v3}, Lbj1;-><init>(Lwe2;II)V

    .line 431
    .line 432
    .line 433
    new-array v3, v9, [Lui1;

    .line 434
    .line 435
    aput-object v2, v3, v11

    .line 436
    .line 437
    invoke-static {v7, v3}, Luw;->l(Ljava/util/Collection;[Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    new-instance v2, Ldj1;

    .line 441
    .line 442
    invoke-virtual {v0}, Lfb1;->d()La21;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    iget-object v0, v0, Lfb1;->P:Lhk2;

    .line 447
    .line 448
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    check-cast v0, Lev0;

    .line 453
    .line 454
    invoke-direct {v2, v1, v3, v0}, Ldj1;-><init>(Lwe2;La21;Lev0;)V

    .line 455
    .line 456
    .line 457
    new-array v0, v9, [Lui1;

    .line 458
    .line 459
    aput-object v2, v0, v11

    .line 460
    .line 461
    invoke-static {v7, v0}, Luw;->l(Ljava/util/Collection;[Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    new-instance v0, Lpz2;

    .line 465
    .line 466
    const/16 v3, 0x8

    .line 467
    .line 468
    move-object v2, v6

    .line 469
    move-object v4, v7

    .line 470
    invoke-direct/range {v0 .. v5}, Lpz2;-><init>(Lwe2;Li03;ILjava/util/ArrayList;La21;)V

    .line 471
    .line 472
    .line 473
    sget-object v1, Lfh2;->a:[Lfh2;

    .line 474
    .line 475
    iget-object v1, v0, Lpz2;->e:Lod2;

    .line 476
    .line 477
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    iget-object v1, v1, Lod2;->a:Landroid/content/SharedPreferences;

    .line 481
    .line 482
    const-string v2, "storage_version"

    .line 483
    .line 484
    invoke-interface {v1, v2, v11}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 485
    .line 486
    .line 487
    move-result v4

    .line 488
    if-nez v4, :cond_1

    .line 489
    .line 490
    invoke-static {}, Lzi1;->values()[Lzi1;

    .line 491
    .line 492
    .line 493
    move-result-object v5

    .line 494
    array-length v6, v5

    .line 495
    :goto_0
    if-ge v11, v6, :cond_2

    .line 496
    .line 497
    aget-object v7, v5, v11

    .line 498
    .line 499
    iget-object v8, v0, Lpz2;->a:Lwe2;

    .line 500
    .line 501
    iget-object v8, v8, Lwe2;->c:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v8, Lod2;

    .line 504
    .line 505
    iget-object v7, v7, Lzi1;->a:Ljava/lang/String;

    .line 506
    .line 507
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    iget-object v8, v8, Lod2;->a:Landroid/content/SharedPreferences;

    .line 511
    .line 512
    invoke-interface {v8, v7}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 513
    .line 514
    .line 515
    move-result v7

    .line 516
    if-eqz v7, :cond_0

    .line 517
    .line 518
    goto :goto_1

    .line 519
    :cond_0
    add-int/lit8 v11, v11, 0x1

    .line 520
    .line 521
    goto :goto_0

    .line 522
    :cond_1
    if-ge v4, v3, :cond_2

    .line 523
    .line 524
    :goto_1
    new-instance v5, Lkotlin/ranges/IntRange;

    .line 525
    .line 526
    add-int/2addr v4, v9

    .line 527
    invoke-direct {v5, v4, v3, v9}, Lkotlin/ranges/a;-><init>(III)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v5}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 531
    .line 532
    .line 533
    move-result-object v4

    .line 534
    :goto_2
    move-object v5, v4

    .line 535
    check-cast v5, Lyy0;

    .line 536
    .line 537
    iget-boolean v5, v5, Lyy0;->c:Z

    .line 538
    .line 539
    if-eqz v5, :cond_2

    .line 540
    .line 541
    move-object v5, v4

    .line 542
    check-cast v5, Lwy0;

    .line 543
    .line 544
    invoke-virtual {v5}, Lwy0;->nextInt()I

    .line 545
    .line 546
    .line 547
    move-result v5

    .line 548
    add-int/lit8 v6, v5, -0x1

    .line 549
    .line 550
    :try_start_0
    invoke-virtual {v0, v6, v5}, Lpz2;->e(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 551
    .line 552
    .line 553
    goto :goto_2

    .line 554
    :catchall_0
    move-exception v0

    .line 555
    new-instance v1, Lvi1;

    .line 556
    .line 557
    const-string v2, "Cannot migrate stored data from "

    .line 558
    .line 559
    const-string v3, " to "

    .line 560
    .line 561
    invoke-static {v2, v6, v5, v3}, Len;->j(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    invoke-direct {v1, v2, v0}, Lvi1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 566
    .line 567
    .line 568
    throw v1

    .line 569
    :cond_2
    sget-object v4, Lfh2;->a:[Lfh2;

    .line 570
    .line 571
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 576
    .line 577
    .line 578
    move-result-object v1

    .line 579
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 580
    .line 581
    .line 582
    return-object v0

    .line 583
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

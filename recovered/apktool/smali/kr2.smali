.class public final Lkr2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public a:Landroidx/transition/Transition;

.field public b:Landroid/view/ViewGroup;


# virtual methods
.method public final onPreDraw()Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lkr2;->a:Landroidx/transition/Transition;

    .line 4
    .line 5
    iget-object v2, v0, Lkr2;->b:Landroid/view/ViewGroup;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v3, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 15
    .line 16
    .line 17
    sget-object v3, Llr2;->c:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v6, 0x1

    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    return v6

    .line 27
    :cond_0
    invoke-static {}, Llr2;->b()Lid;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-virtual {v3, v2, v4}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    check-cast v5, Ljava/util/ArrayList;

    .line 37
    .line 38
    if-nez v5, :cond_2

    .line 39
    .line 40
    new-instance v5, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v2, v5}, Lle2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    :cond_1
    move-object v7, v4

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    if-lez v7, :cond_1

    .line 55
    .line 56
    new-instance v7, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    new-instance v5, Lus;

    .line 65
    .line 66
    invoke-direct {v5, v0, v3}, Lus;-><init>(Lkr2;Lid;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v5}, Landroidx/transition/Transition;->a(Lir2;)V

    .line 70
    .line 71
    .line 72
    const/4 v0, 0x0

    .line 73
    invoke-virtual {v1, v2, v0}, Landroidx/transition/Transition;->h(Landroid/view/ViewGroup;Z)V

    .line 74
    .line 75
    .line 76
    if-eqz v7, :cond_3

    .line 77
    .line 78
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_3

    .line 87
    .line 88
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    check-cast v5, Landroidx/transition/Transition;

    .line 93
    .line 94
    invoke-virtual {v5, v2}, Landroidx/transition/Transition;->x(Landroid/view/View;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    new-instance v3, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    iput-object v3, v1, Landroidx/transition/Transition;->V:Ljava/util/ArrayList;

    .line 104
    .line 105
    new-instance v3, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    iput-object v3, v1, Landroidx/transition/Transition;->W:Ljava/util/ArrayList;

    .line 111
    .line 112
    iget-object v3, v1, Landroidx/transition/Transition;->i:Lra2;

    .line 113
    .line 114
    iget-object v5, v1, Landroidx/transition/Transition;->v:Lra2;

    .line 115
    .line 116
    new-instance v7, Lid;

    .line 117
    .line 118
    iget-object v8, v3, Lra2;->a:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v8, Lid;

    .line 121
    .line 122
    invoke-direct {v7, v8}, Lid;-><init>(Lle2;)V

    .line 123
    .line 124
    .line 125
    new-instance v8, Lid;

    .line 126
    .line 127
    iget-object v9, v5, Lra2;->a:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v9, Lid;

    .line 130
    .line 131
    invoke-direct {v8, v9}, Lid;-><init>(Lle2;)V

    .line 132
    .line 133
    .line 134
    move v9, v0

    .line 135
    :goto_2
    iget-object v10, v1, Landroidx/transition/Transition;->U:[I

    .line 136
    .line 137
    array-length v11, v10

    .line 138
    if-ge v9, v11, :cond_11

    .line 139
    .line 140
    aget v10, v10, v9

    .line 141
    .line 142
    if-eq v10, v6, :cond_e

    .line 143
    .line 144
    const/4 v11, 0x2

    .line 145
    if-eq v10, v11, :cond_c

    .line 146
    .line 147
    const/4 v11, 0x3

    .line 148
    if-eq v10, v11, :cond_a

    .line 149
    .line 150
    const/4 v11, 0x4

    .line 151
    if-eq v10, v11, :cond_6

    .line 152
    .line 153
    :cond_4
    move-object v4, v5

    .line 154
    :cond_5
    move/from16 v17, v6

    .line 155
    .line 156
    goto/16 :goto_9

    .line 157
    .line 158
    :cond_6
    iget-object v10, v3, Lra2;->c:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v10, Lta1;

    .line 161
    .line 162
    iget-object v11, v5, Lra2;->c:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v11, Lta1;

    .line 165
    .line 166
    invoke-virtual {v10}, Lta1;->e()I

    .line 167
    .line 168
    .line 169
    move-result v12

    .line 170
    move v13, v0

    .line 171
    :goto_3
    if-ge v13, v12, :cond_4

    .line 172
    .line 173
    invoke-virtual {v10, v13}, Lta1;->f(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v14

    .line 177
    check-cast v14, Landroid/view/View;

    .line 178
    .line 179
    if-eqz v14, :cond_8

    .line 180
    .line 181
    invoke-virtual {v1, v14}, Landroidx/transition/Transition;->s(Landroid/view/View;)Z

    .line 182
    .line 183
    .line 184
    move-result v15

    .line 185
    if-eqz v15, :cond_8

    .line 186
    .line 187
    iget-boolean v15, v10, Lta1;->a:Z

    .line 188
    .line 189
    if-eqz v15, :cond_7

    .line 190
    .line 191
    invoke-virtual {v10}, Lta1;->b()V

    .line 192
    .line 193
    .line 194
    :cond_7
    iget-object v15, v10, Lta1;->b:[J

    .line 195
    .line 196
    move-object/from16 p0, v5

    .line 197
    .line 198
    aget-wide v4, v15, v13

    .line 199
    .line 200
    invoke-virtual {v11, v4, v5}, Lta1;->c(J)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    check-cast v4, Landroid/view/View;

    .line 205
    .line 206
    if-eqz v4, :cond_9

    .line 207
    .line 208
    invoke-virtual {v1, v4}, Landroidx/transition/Transition;->s(Landroid/view/View;)Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-eqz v5, :cond_9

    .line 213
    .line 214
    const/4 v5, 0x0

    .line 215
    invoke-virtual {v7, v14, v5}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v15

    .line 219
    check-cast v15, Lor2;

    .line 220
    .line 221
    invoke-virtual {v8, v4, v5}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v16

    .line 225
    move-object/from16 v5, v16

    .line 226
    .line 227
    check-cast v5, Lor2;

    .line 228
    .line 229
    if-eqz v15, :cond_9

    .line 230
    .line 231
    if-eqz v5, :cond_9

    .line 232
    .line 233
    iget-object v0, v1, Landroidx/transition/Transition;->V:Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    iget-object v0, v1, Landroidx/transition/Transition;->W:Ljava/util/ArrayList;

    .line 239
    .line 240
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    invoke-virtual {v7, v14}, Lle2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v8, v4}, Lle2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_8
    move-object/from16 p0, v5

    .line 251
    .line 252
    :cond_9
    :goto_4
    add-int/lit8 v13, v13, 0x1

    .line 253
    .line 254
    move-object/from16 v5, p0

    .line 255
    .line 256
    const/4 v0, 0x0

    .line 257
    const/4 v4, 0x0

    .line 258
    goto :goto_3

    .line 259
    :cond_a
    move-object/from16 p0, v5

    .line 260
    .line 261
    iget-object v0, v3, Lra2;->b:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v0, Landroid/util/SparseArray;

    .line 264
    .line 265
    move-object/from16 v4, p0

    .line 266
    .line 267
    iget-object v5, v4, Lra2;->b:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v5, Landroid/util/SparseArray;

    .line 270
    .line 271
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    const/4 v11, 0x0

    .line 276
    :goto_5
    if-ge v11, v10, :cond_5

    .line 277
    .line 278
    invoke-virtual {v0, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v12

    .line 282
    check-cast v12, Landroid/view/View;

    .line 283
    .line 284
    if-eqz v12, :cond_b

    .line 285
    .line 286
    invoke-virtual {v1, v12}, Landroidx/transition/Transition;->s(Landroid/view/View;)Z

    .line 287
    .line 288
    .line 289
    move-result v13

    .line 290
    if-eqz v13, :cond_b

    .line 291
    .line 292
    invoke-virtual {v0, v11}, Landroid/util/SparseArray;->keyAt(I)I

    .line 293
    .line 294
    .line 295
    move-result v13

    .line 296
    invoke-virtual {v5, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v13

    .line 300
    check-cast v13, Landroid/view/View;

    .line 301
    .line 302
    if-eqz v13, :cond_b

    .line 303
    .line 304
    invoke-virtual {v1, v13}, Landroidx/transition/Transition;->s(Landroid/view/View;)Z

    .line 305
    .line 306
    .line 307
    move-result v14

    .line 308
    if-eqz v14, :cond_b

    .line 309
    .line 310
    const/4 v14, 0x0

    .line 311
    invoke-virtual {v7, v12, v14}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v15

    .line 315
    check-cast v15, Lor2;

    .line 316
    .line 317
    invoke-virtual {v8, v13, v14}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v17

    .line 321
    move-object/from16 v14, v17

    .line 322
    .line 323
    check-cast v14, Lor2;

    .line 324
    .line 325
    if-eqz v15, :cond_b

    .line 326
    .line 327
    if-eqz v14, :cond_b

    .line 328
    .line 329
    move/from16 v17, v6

    .line 330
    .line 331
    iget-object v6, v1, Landroidx/transition/Transition;->V:Ljava/util/ArrayList;

    .line 332
    .line 333
    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    iget-object v6, v1, Landroidx/transition/Transition;->W:Ljava/util/ArrayList;

    .line 337
    .line 338
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    invoke-virtual {v7, v12}, Lle2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v8, v13}, Lle2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    goto :goto_6

    .line 348
    :cond_b
    move/from16 v17, v6

    .line 349
    .line 350
    :goto_6
    add-int/lit8 v11, v11, 0x1

    .line 351
    .line 352
    move/from16 v6, v17

    .line 353
    .line 354
    goto :goto_5

    .line 355
    :cond_c
    move-object v4, v5

    .line 356
    move/from16 v17, v6

    .line 357
    .line 358
    iget-object v0, v3, Lra2;->d:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v0, Lid;

    .line 361
    .line 362
    iget-object v5, v4, Lra2;->d:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v5, Lid;

    .line 365
    .line 366
    iget v6, v0, Lle2;->c:I

    .line 367
    .line 368
    const/4 v10, 0x0

    .line 369
    :goto_7
    if-ge v10, v6, :cond_10

    .line 370
    .line 371
    invoke-virtual {v0, v10}, Lle2;->j(I)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v11

    .line 375
    check-cast v11, Landroid/view/View;

    .line 376
    .line 377
    if-eqz v11, :cond_d

    .line 378
    .line 379
    invoke-virtual {v1, v11}, Landroidx/transition/Transition;->s(Landroid/view/View;)Z

    .line 380
    .line 381
    .line 382
    move-result v12

    .line 383
    if-eqz v12, :cond_d

    .line 384
    .line 385
    invoke-virtual {v0, v10}, Lle2;->h(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v12

    .line 389
    const/4 v14, 0x0

    .line 390
    invoke-virtual {v5, v12, v14}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v12

    .line 394
    check-cast v12, Landroid/view/View;

    .line 395
    .line 396
    if-eqz v12, :cond_d

    .line 397
    .line 398
    invoke-virtual {v1, v12}, Landroidx/transition/Transition;->s(Landroid/view/View;)Z

    .line 399
    .line 400
    .line 401
    move-result v13

    .line 402
    if-eqz v13, :cond_d

    .line 403
    .line 404
    invoke-virtual {v7, v11, v14}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v13

    .line 408
    check-cast v13, Lor2;

    .line 409
    .line 410
    invoke-virtual {v8, v12, v14}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v15

    .line 414
    check-cast v15, Lor2;

    .line 415
    .line 416
    if-eqz v13, :cond_d

    .line 417
    .line 418
    if-eqz v15, :cond_d

    .line 419
    .line 420
    iget-object v14, v1, Landroidx/transition/Transition;->V:Ljava/util/ArrayList;

    .line 421
    .line 422
    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    iget-object v13, v1, Landroidx/transition/Transition;->W:Ljava/util/ArrayList;

    .line 426
    .line 427
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    invoke-virtual {v7, v11}, Lle2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v8, v12}, Lle2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    :cond_d
    add-int/lit8 v10, v10, 0x1

    .line 437
    .line 438
    goto :goto_7

    .line 439
    :cond_e
    move-object v4, v5

    .line 440
    move/from16 v17, v6

    .line 441
    .line 442
    iget v0, v7, Lle2;->c:I

    .line 443
    .line 444
    add-int/lit8 v0, v0, -0x1

    .line 445
    .line 446
    :goto_8
    if-ltz v0, :cond_10

    .line 447
    .line 448
    invoke-virtual {v7, v0}, Lle2;->h(I)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v5

    .line 452
    check-cast v5, Landroid/view/View;

    .line 453
    .line 454
    if-eqz v5, :cond_f

    .line 455
    .line 456
    invoke-virtual {v1, v5}, Landroidx/transition/Transition;->s(Landroid/view/View;)Z

    .line 457
    .line 458
    .line 459
    move-result v6

    .line 460
    if-eqz v6, :cond_f

    .line 461
    .line 462
    invoke-virtual {v8, v5}, Lle2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v5

    .line 466
    check-cast v5, Lor2;

    .line 467
    .line 468
    if-eqz v5, :cond_f

    .line 469
    .line 470
    iget-object v6, v5, Lor2;->b:Landroid/view/View;

    .line 471
    .line 472
    invoke-virtual {v1, v6}, Landroidx/transition/Transition;->s(Landroid/view/View;)Z

    .line 473
    .line 474
    .line 475
    move-result v6

    .line 476
    if-eqz v6, :cond_f

    .line 477
    .line 478
    invoke-virtual {v7, v0}, Lle2;->i(I)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v6

    .line 482
    check-cast v6, Lor2;

    .line 483
    .line 484
    iget-object v10, v1, Landroidx/transition/Transition;->V:Ljava/util/ArrayList;

    .line 485
    .line 486
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    iget-object v6, v1, Landroidx/transition/Transition;->W:Ljava/util/ArrayList;

    .line 490
    .line 491
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    :cond_f
    add-int/lit8 v0, v0, -0x1

    .line 495
    .line 496
    goto :goto_8

    .line 497
    :cond_10
    :goto_9
    add-int/lit8 v9, v9, 0x1

    .line 498
    .line 499
    move-object v5, v4

    .line 500
    move/from16 v6, v17

    .line 501
    .line 502
    const/4 v0, 0x0

    .line 503
    const/4 v4, 0x0

    .line 504
    goto/16 :goto_2

    .line 505
    .line 506
    :cond_11
    move/from16 v17, v6

    .line 507
    .line 508
    const/4 v0, 0x0

    .line 509
    :goto_a
    iget v3, v7, Lle2;->c:I

    .line 510
    .line 511
    if-ge v0, v3, :cond_13

    .line 512
    .line 513
    invoke-virtual {v7, v0}, Lle2;->j(I)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v3

    .line 517
    check-cast v3, Lor2;

    .line 518
    .line 519
    iget-object v4, v3, Lor2;->b:Landroid/view/View;

    .line 520
    .line 521
    invoke-virtual {v1, v4}, Landroidx/transition/Transition;->s(Landroid/view/View;)Z

    .line 522
    .line 523
    .line 524
    move-result v4

    .line 525
    if-eqz v4, :cond_12

    .line 526
    .line 527
    iget-object v4, v1, Landroidx/transition/Transition;->V:Ljava/util/ArrayList;

    .line 528
    .line 529
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    iget-object v3, v1, Landroidx/transition/Transition;->W:Ljava/util/ArrayList;

    .line 533
    .line 534
    const/4 v14, 0x0

    .line 535
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    :cond_12
    add-int/lit8 v0, v0, 0x1

    .line 539
    .line 540
    goto :goto_a

    .line 541
    :cond_13
    const/4 v0, 0x0

    .line 542
    :goto_b
    iget v3, v8, Lle2;->c:I

    .line 543
    .line 544
    if-ge v0, v3, :cond_15

    .line 545
    .line 546
    invoke-virtual {v8, v0}, Lle2;->j(I)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    check-cast v3, Lor2;

    .line 551
    .line 552
    iget-object v4, v3, Lor2;->b:Landroid/view/View;

    .line 553
    .line 554
    invoke-virtual {v1, v4}, Landroidx/transition/Transition;->s(Landroid/view/View;)Z

    .line 555
    .line 556
    .line 557
    move-result v4

    .line 558
    if-eqz v4, :cond_14

    .line 559
    .line 560
    iget-object v4, v1, Landroidx/transition/Transition;->W:Ljava/util/ArrayList;

    .line 561
    .line 562
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    iget-object v3, v1, Landroidx/transition/Transition;->V:Ljava/util/ArrayList;

    .line 566
    .line 567
    const/4 v14, 0x0

    .line 568
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    :cond_14
    add-int/lit8 v0, v0, 0x1

    .line 572
    .line 573
    goto :goto_b

    .line 574
    :cond_15
    invoke-static {}, Landroidx/transition/Transition;->o()Lid;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    iget v3, v0, Lle2;->c:I

    .line 579
    .line 580
    sget-object v4, Ll53;->a:Ln53;

    .line 581
    .line 582
    invoke-virtual {v2}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    .line 583
    .line 584
    .line 585
    move-result-object v4

    .line 586
    add-int/lit8 v3, v3, -0x1

    .line 587
    .line 588
    :goto_c
    if-ltz v3, :cond_1c

    .line 589
    .line 590
    invoke-virtual {v0, v3}, Lle2;->h(I)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v5

    .line 594
    check-cast v5, Landroid/animation/Animator;

    .line 595
    .line 596
    if-eqz v5, :cond_1a

    .line 597
    .line 598
    const/4 v14, 0x0

    .line 599
    invoke-virtual {v0, v5, v14}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v6

    .line 603
    check-cast v6, Lhr2;

    .line 604
    .line 605
    if-eqz v6, :cond_1a

    .line 606
    .line 607
    iget-object v7, v6, Lhr2;->a:Landroid/view/View;

    .line 608
    .line 609
    if-eqz v7, :cond_1a

    .line 610
    .line 611
    iget-object v8, v6, Lhr2;->d:Lu73;

    .line 612
    .line 613
    iget-object v8, v8, Lu73;->a:Landroid/view/WindowId;

    .line 614
    .line 615
    invoke-virtual {v8, v4}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    move-result v8

    .line 619
    if-eqz v8, :cond_1a

    .line 620
    .line 621
    iget-object v8, v6, Lhr2;->c:Lor2;

    .line 622
    .line 623
    move/from16 v9, v17

    .line 624
    .line 625
    invoke-virtual {v1, v7, v9}, Landroidx/transition/Transition;->q(Landroid/view/View;Z)Lor2;

    .line 626
    .line 627
    .line 628
    move-result-object v10

    .line 629
    invoke-virtual {v1, v7, v9}, Landroidx/transition/Transition;->n(Landroid/view/View;Z)Lor2;

    .line 630
    .line 631
    .line 632
    move-result-object v11

    .line 633
    if-nez v10, :cond_16

    .line 634
    .line 635
    if-nez v11, :cond_16

    .line 636
    .line 637
    iget-object v9, v1, Landroidx/transition/Transition;->v:Lra2;

    .line 638
    .line 639
    iget-object v9, v9, Lra2;->a:Ljava/lang/Object;

    .line 640
    .line 641
    check-cast v9, Lid;

    .line 642
    .line 643
    const/4 v14, 0x0

    .line 644
    invoke-virtual {v9, v7, v14}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v7

    .line 648
    move-object v11, v7

    .line 649
    check-cast v11, Lor2;

    .line 650
    .line 651
    goto :goto_d

    .line 652
    :cond_16
    const/4 v14, 0x0

    .line 653
    :goto_d
    if-nez v10, :cond_17

    .line 654
    .line 655
    if-eqz v11, :cond_1b

    .line 656
    .line 657
    :cond_17
    iget-object v6, v6, Lhr2;->e:Landroidx/transition/Transition;

    .line 658
    .line 659
    invoke-virtual {v6, v8, v11}, Landroidx/transition/Transition;->r(Lor2;Lor2;)Z

    .line 660
    .line 661
    .line 662
    move-result v6

    .line 663
    if-eqz v6, :cond_1b

    .line 664
    .line 665
    invoke-virtual {v5}, Landroid/animation/Animator;->isRunning()Z

    .line 666
    .line 667
    .line 668
    move-result v6

    .line 669
    if-nez v6, :cond_19

    .line 670
    .line 671
    invoke-virtual {v5}, Landroid/animation/Animator;->isStarted()Z

    .line 672
    .line 673
    .line 674
    move-result v6

    .line 675
    if-eqz v6, :cond_18

    .line 676
    .line 677
    goto :goto_e

    .line 678
    :cond_18
    invoke-virtual {v0, v5}, Lle2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    goto :goto_f

    .line 682
    :cond_19
    :goto_e
    invoke-virtual {v5}, Landroid/animation/Animator;->cancel()V

    .line 683
    .line 684
    .line 685
    goto :goto_f

    .line 686
    :cond_1a
    const/4 v14, 0x0

    .line 687
    :cond_1b
    :goto_f
    add-int/lit8 v3, v3, -0x1

    .line 688
    .line 689
    const/16 v17, 0x1

    .line 690
    .line 691
    goto :goto_c

    .line 692
    :cond_1c
    iget-object v0, v1, Landroidx/transition/Transition;->i:Lra2;

    .line 693
    .line 694
    iget-object v3, v1, Landroidx/transition/Transition;->v:Lra2;

    .line 695
    .line 696
    iget-object v4, v1, Landroidx/transition/Transition;->V:Ljava/util/ArrayList;

    .line 697
    .line 698
    iget-object v5, v1, Landroidx/transition/Transition;->W:Ljava/util/ArrayList;

    .line 699
    .line 700
    move-object/from16 v18, v2

    .line 701
    .line 702
    move-object v2, v0

    .line 703
    move-object v0, v1

    .line 704
    move-object/from16 v1, v18

    .line 705
    .line 706
    invoke-virtual/range {v0 .. v5}, Landroidx/transition/Transition;->l(Landroid/view/ViewGroup;Lra2;Lra2;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v0}, Landroidx/transition/Transition;->y()V

    .line 710
    .line 711
    .line 712
    const/16 v17, 0x1

    .line 713
    .line 714
    return v17
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lkr2;->b:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Llr2;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    invoke-static {}, Llr2;->b()Lid;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, p1, v1}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/util/ArrayList;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-lez v1, :cond_0

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Landroidx/transition/Transition;

    .line 52
    .line 53
    invoke-virtual {v1, p1}, Landroidx/transition/Transition;->x(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object p0, p0, Lkr2;->a:Landroidx/transition/Transition;

    .line 58
    .line 59
    const/4 p1, 0x1

    .line 60
    invoke-virtual {p0, p1}, Landroidx/transition/Transition;->i(Z)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

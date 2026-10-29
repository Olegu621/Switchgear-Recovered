.class public final Lo4;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/lang/Class;

.field public final synthetic b:I


# direct methods
.method public constructor <init>(ILjava/lang/Class;)V
    .locals 0

    .line 1
    iput p1, p0, Lo4;->b:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lo4;->a:Ljava/lang/Class;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lw;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget p0, p0, Lo4;->b:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x3

    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ll93;

    .line 11
    .line 12
    new-instance p0, Ly5;

    .line 13
    .line 14
    invoke-virtual {p1}, Ll93;->y()Lvl;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lvl;->e()[B

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {p0, p1, v1}, Ly5;-><init>([BI)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, Lu41;

    .line 27
    .line 28
    invoke-virtual {p1}, Lu41;->y()Lv41;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Lv41;->y()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Lr41;->a(Ljava/lang/String;)Ll8;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0, p0}, Ll8;->c(Ljava/lang/String;)Ly5;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    new-instance v0, Ls41;

    .line 45
    .line 46
    invoke-virtual {p1}, Lu41;->y()Lv41;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lv41;->x()Lw31;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-direct {v0, p1, p0}, Ls41;-><init>(Lw31;Ly5;)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_1
    check-cast p1, Lp41;

    .line 59
    .line 60
    invoke-virtual {p1}, Lp41;->y()Lq41;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Lq41;->x()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p0}, Lr41;->a(Ljava/lang/String;)Ll8;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1, p0}, Ll8;->c(Ljava/lang/String;)Ly5;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_2
    check-cast p1, Lmu0;

    .line 78
    .line 79
    invoke-virtual {p1}, Lmu0;->B()Lsu0;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0}, Lsu0;->z()Lst0;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p1}, Lmu0;->A()Lvl;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Lvl;->e()[B

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    .line 96
    .line 97
    const-string v5, "HMAC"

    .line 98
    .line 99
    invoke-direct {v4, v0, v5}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Lmu0;->B()Lsu0;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p1}, Lsu0;->A()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    const/4 v0, 0x1

    .line 115
    if-eq p0, v0, :cond_4

    .line 116
    .line 117
    if-eq p0, v2, :cond_3

    .line 118
    .line 119
    if-eq p0, v1, :cond_2

    .line 120
    .line 121
    const/4 v0, 0x4

    .line 122
    if-eq p0, v0, :cond_1

    .line 123
    .line 124
    const/4 v0, 0x5

    .line 125
    if-ne p0, v0, :cond_0

    .line 126
    .line 127
    new-instance v3, Lax1;

    .line 128
    .line 129
    new-instance p0, Lur3;

    .line 130
    .line 131
    const-string v0, "HMACSHA224"

    .line 132
    .line 133
    invoke-direct {p0, v0, v4}, Lur3;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    .line 134
    .line 135
    .line 136
    invoke-direct {v3, p0, p1}, Lax1;-><init>(Lyw1;I)V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_0
    const-string p0, "unknown hash"

    .line 141
    .line 142
    invoke-static {p0}, Lds0;->t(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_1
    new-instance v3, Lax1;

    .line 147
    .line 148
    new-instance p0, Lur3;

    .line 149
    .line 150
    const-string v0, "HMACSHA512"

    .line 151
    .line 152
    invoke-direct {p0, v0, v4}, Lur3;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    .line 153
    .line 154
    .line 155
    invoke-direct {v3, p0, p1}, Lax1;-><init>(Lyw1;I)V

    .line 156
    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_2
    new-instance v3, Lax1;

    .line 160
    .line 161
    new-instance p0, Lur3;

    .line 162
    .line 163
    const-string v0, "HMACSHA256"

    .line 164
    .line 165
    invoke-direct {p0, v0, v4}, Lur3;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    .line 166
    .line 167
    .line 168
    invoke-direct {v3, p0, p1}, Lax1;-><init>(Lyw1;I)V

    .line 169
    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_3
    new-instance v3, Lax1;

    .line 173
    .line 174
    new-instance p0, Lur3;

    .line 175
    .line 176
    const-string v0, "HMACSHA384"

    .line 177
    .line 178
    invoke-direct {p0, v0, v4}, Lur3;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    .line 179
    .line 180
    .line 181
    invoke-direct {v3, p0, p1}, Lax1;-><init>(Lyw1;I)V

    .line 182
    .line 183
    .line 184
    goto :goto_0

    .line 185
    :cond_4
    new-instance v3, Lax1;

    .line 186
    .line 187
    new-instance p0, Lur3;

    .line 188
    .line 189
    const-string v0, "HMACSHA1"

    .line 190
    .line 191
    invoke-direct {p0, v0, v4}, Lur3;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    .line 192
    .line 193
    .line 194
    invoke-direct {v3, p0, p1}, Lax1;-><init>(Lyw1;I)V

    .line 195
    .line 196
    .line 197
    :goto_0
    return-object v3

    .line 198
    :pswitch_3
    check-cast p1, Lcs;

    .line 199
    .line 200
    new-instance p0, Ly5;

    .line 201
    .line 202
    invoke-virtual {p1}, Lcs;->y()Lvl;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {p1}, Lvl;->e()[B

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-direct {p0, p1, v2}, Ly5;-><init>([BI)V

    .line 211
    .line 212
    .line 213
    return-object p0

    .line 214
    :pswitch_4
    check-cast p1, Lq6;

    .line 215
    .line 216
    new-instance p0, Lo6;

    .line 217
    .line 218
    invoke-virtual {p1}, Lq6;->y()Lvl;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-virtual {p1}, Lvl;->e()[B

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-direct {p0, p1}, Lo6;-><init>([B)V

    .line 227
    .line 228
    .line 229
    return-object p0

    .line 230
    :pswitch_5
    check-cast p1, Li6;

    .line 231
    .line 232
    new-instance p0, Lg6;

    .line 233
    .line 234
    invoke-virtual {p1}, Li6;->y()Lvl;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-virtual {p1}, Lvl;->e()[B

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    invoke-direct {p0, p1}, Lg6;-><init>([B)V

    .line 243
    .line 244
    .line 245
    return-object p0

    .line 246
    :pswitch_6
    check-cast p1, La6;

    .line 247
    .line 248
    new-instance p0, Ly5;

    .line 249
    .line 250
    invoke-virtual {p1}, La6;->y()Lvl;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-virtual {p1}, Lvl;->e()[B

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    invoke-direct {p0, p1, v0}, Ly5;-><init>([BI)V

    .line 259
    .line 260
    .line 261
    return-object p0

    .line 262
    :pswitch_7
    check-cast p1, Lq5;

    .line 263
    .line 264
    new-instance p0, Lo5;

    .line 265
    .line 266
    invoke-virtual {p1}, Lq5;->z()Lvl;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-virtual {v0}, Lvl;->e()[B

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-virtual {p1}, Lq5;->A()Lw5;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    invoke-virtual {p1}, Lw5;->y()I

    .line 279
    .line 280
    .line 281
    move-result p1

    .line 282
    invoke-direct {p0, v0, p1}, Lo5;-><init>([BI)V

    .line 283
    .line 284
    .line 285
    return-object p0

    .line 286
    :pswitch_8
    check-cast p1, Lj5;

    .line 287
    .line 288
    new-instance p0, Lh5;

    .line 289
    .line 290
    invoke-virtual {p1}, Lj5;->A()Lvl;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {v0}, Lvl;->e()[B

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {p1}, Lj5;->B()Ln5;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    invoke-virtual {p1}, Ln5;->y()I

    .line 303
    .line 304
    .line 305
    move-result p1

    .line 306
    invoke-direct {p0, v0, p1}, Lh5;-><init>([BI)V

    .line 307
    .line 308
    .line 309
    return-object p0

    .line 310
    :pswitch_9
    check-cast p1, Lx4;

    .line 311
    .line 312
    new-instance p0, Lxd0;

    .line 313
    .line 314
    new-instance v1, Lo4;

    .line 315
    .line 316
    const-class v4, Lh5;

    .line 317
    .line 318
    invoke-direct {v1, v2, v4}, Lo4;-><init>(ILjava/lang/Class;)V

    .line 319
    .line 320
    .line 321
    filled-new-array {v1}, [Lo4;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    new-instance v2, Ljava/util/HashMap;

    .line 326
    .line 327
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 328
    .line 329
    .line 330
    array-length v5, v1

    .line 331
    move v6, v0

    .line 332
    :goto_1
    const-string v7, "KeyTypeManager constructed with duplicate factories for primitive "

    .line 333
    .line 334
    if-ge v6, v5, :cond_6

    .line 335
    .line 336
    aget-object v8, v1, v6

    .line 337
    .line 338
    iget-object v9, v8, Lo4;->a:Ljava/lang/Class;

    .line 339
    .line 340
    invoke-virtual {v2, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v9

    .line 344
    iget-object v10, v8, Lo4;->a:Ljava/lang/Class;

    .line 345
    .line 346
    if-nez v9, :cond_5

    .line 347
    .line 348
    invoke-virtual {v2, v10, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    add-int/lit8 v6, v6, 0x1

    .line 352
    .line 353
    goto :goto_1

    .line 354
    :cond_5
    invoke-virtual {v10}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    invoke-static {p0, v7}, Ln4;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    goto/16 :goto_3

    .line 362
    .line 363
    :cond_6
    array-length v5, v1

    .line 364
    if-lez v5, :cond_7

    .line 365
    .line 366
    aget-object v1, v1, v0

    .line 367
    .line 368
    iget-object v1, v1, Lo4;->a:Ljava/lang/Class;

    .line 369
    .line 370
    :cond_7
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    invoke-virtual {p1}, Lx4;->z()Lj5;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    check-cast v1, Lo4;

    .line 383
    .line 384
    const-string v5, " not supported."

    .line 385
    .line 386
    const-string v6, "Requested primitive class "

    .line 387
    .line 388
    if-eqz v1, :cond_c

    .line 389
    .line 390
    invoke-virtual {v1, v2}, Lo4;->a(Lw;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    check-cast v1, Lh5;

    .line 395
    .line 396
    new-instance v2, Lo4;

    .line 397
    .line 398
    const/16 v4, 0x8

    .line 399
    .line 400
    const-class v8, Lwa1;

    .line 401
    .line 402
    invoke-direct {v2, v4, v8}, Lo4;-><init>(ILjava/lang/Class;)V

    .line 403
    .line 404
    .line 405
    filled-new-array {v2}, [Lo4;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    new-instance v4, Ljava/util/HashMap;

    .line 410
    .line 411
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 412
    .line 413
    .line 414
    array-length v9, v2

    .line 415
    move v10, v0

    .line 416
    :goto_2
    if-ge v10, v9, :cond_9

    .line 417
    .line 418
    aget-object v11, v2, v10

    .line 419
    .line 420
    iget-object v12, v11, Lo4;->a:Ljava/lang/Class;

    .line 421
    .line 422
    invoke-virtual {v4, v12}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v12

    .line 426
    iget-object v13, v11, Lo4;->a:Ljava/lang/Class;

    .line 427
    .line 428
    if-nez v12, :cond_8

    .line 429
    .line 430
    invoke-virtual {v4, v13, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    add-int/lit8 v10, v10, 0x1

    .line 434
    .line 435
    goto :goto_2

    .line 436
    :cond_8
    invoke-virtual {v13}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object p0

    .line 440
    invoke-static {p0, v7}, Ln4;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    goto :goto_3

    .line 444
    :cond_9
    array-length v7, v2

    .line 445
    if-lez v7, :cond_a

    .line 446
    .line 447
    aget-object v0, v2, v0

    .line 448
    .line 449
    iget-object v0, v0, Lo4;->a:Ljava/lang/Class;

    .line 450
    .line 451
    :cond_a
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    invoke-virtual {p1}, Lx4;->A()Lmu0;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    check-cast v0, Lo4;

    .line 464
    .line 465
    if-eqz v0, :cond_b

    .line 466
    .line 467
    invoke-virtual {v0, v2}, Lo4;->a(Lw;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    check-cast v0, Lwa1;

    .line 472
    .line 473
    invoke-virtual {p1}, Lx4;->A()Lmu0;

    .line 474
    .line 475
    .line 476
    move-result-object p1

    .line 477
    invoke-virtual {p1}, Lmu0;->B()Lsu0;

    .line 478
    .line 479
    .line 480
    move-result-object p1

    .line 481
    invoke-virtual {p1}, Lsu0;->A()I

    .line 482
    .line 483
    .line 484
    move-result p1

    .line 485
    invoke-direct {p0, v1, v0, p1}, Lxd0;-><init>(Lh5;Lwa1;I)V

    .line 486
    .line 487
    .line 488
    move-object v3, p0

    .line 489
    goto :goto_3

    .line 490
    :cond_b
    invoke-virtual {v8}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object p0

    .line 494
    invoke-static {p0, v6, v5}, Lf42;->r(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    goto :goto_3

    .line 498
    :cond_c
    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object p0

    .line 502
    invoke-static {p0, v6, v5}, Lf42;->r(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 503
    .line 504
    .line 505
    :goto_3
    return-object v3

    .line 506
    :pswitch_a
    check-cast p1, Lj4;

    .line 507
    .line 508
    new-instance p0, Lax1;

    .line 509
    .line 510
    new-instance v0, Lac1;

    .line 511
    .line 512
    invoke-virtual {p1}, Lj4;->z()Lvl;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    invoke-virtual {v1}, Lvl;->e()[B

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    invoke-direct {v0, v1}, Lac1;-><init>([B)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {p1}, Lj4;->A()Lu4;

    .line 524
    .line 525
    .line 526
    move-result-object p1

    .line 527
    invoke-virtual {p1}, Lu4;->y()I

    .line 528
    .line 529
    .line 530
    move-result p1

    .line 531
    invoke-direct {p0, v0, p1}, Lax1;-><init>(Lyw1;I)V

    .line 532
    .line 533
    .line 534
    return-object p0

    .line 535
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

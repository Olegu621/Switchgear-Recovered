.class public final synthetic Lod;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lod;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lod;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lod;->a:I

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const/4 v2, 0x6

    .line 5
    const/4 v3, 0x5

    .line 6
    const/4 v4, 0x2

    .line 7
    const/4 v5, 0x1

    .line 8
    const/16 v6, 0xa

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    iget-object p0, p0, Lod;->b:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p0, Lwq2;

    .line 17
    .line 18
    iget-object p0, p0, Lwq2;->a:Ljava/util/Map;

    .line 19
    .line 20
    sget-object v0, Lwq2;->c:[Lu21;

    .line 21
    .line 22
    const/16 v8, 0xb

    .line 23
    .line 24
    aget-object v0, v0, v8

    .line 25
    .line 26
    invoke-interface {v0}, Ln21;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {p0, v0}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ljava/util/Map;

    .line 35
    .line 36
    if-eqz p0, :cond_13

    .line 37
    .line 38
    new-instance v0, Lls1;

    .line 39
    .line 40
    invoke-direct {v0, p0}, Lls1;-><init>(Ljava/util/Map;)V

    .line 41
    .line 42
    .line 43
    new-instance v7, Lns1;

    .line 44
    .line 45
    invoke-direct {v7}, Lns1;-><init>()V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lls1;->b:[Lu21;

    .line 49
    .line 50
    const/4 v9, 0x0

    .line 51
    aget-object v10, p0, v9

    .line 52
    .line 53
    invoke-interface {v10}, Ln21;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    iget-object v0, v0, Lls1;->a:Ljava/util/Map;

    .line 58
    .line 59
    invoke-static {v0, v10}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v10

    .line 63
    check-cast v10, Ljava/lang/String;

    .line 64
    .line 65
    if-eqz v10, :cond_0

    .line 66
    .line 67
    new-instance v11, Lhs1;

    .line 68
    .line 69
    invoke-direct {v11, v10, v9}, Lhs1;-><init>(Ljava/lang/String;I)V

    .line 70
    .line 71
    .line 72
    iput-object v11, v7, Lns1;->a:Lhs1;

    .line 73
    .line 74
    :cond_0
    aget-object v10, p0, v5

    .line 75
    .line 76
    invoke-interface {v10}, Ln21;->getName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    invoke-static {v0, v10}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    check-cast v10, Ljava/lang/String;

    .line 85
    .line 86
    if-eqz v10, :cond_1

    .line 87
    .line 88
    new-instance v11, Lhs1;

    .line 89
    .line 90
    invoke-direct {v11, v10, v9}, Lhs1;-><init>(Ljava/lang/String;I)V

    .line 91
    .line 92
    .line 93
    iput-object v11, v7, Lns1;->b:Lhs1;

    .line 94
    .line 95
    :cond_1
    aget-object v10, p0, v4

    .line 96
    .line 97
    invoke-interface {v10}, Ln21;->getName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    invoke-static {v0, v10}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    check-cast v10, Ljava/lang/String;

    .line 106
    .line 107
    if-eqz v10, :cond_2

    .line 108
    .line 109
    new-instance v11, Lhs1;

    .line 110
    .line 111
    invoke-direct {v11, v10, v9}, Lhs1;-><init>(Ljava/lang/String;I)V

    .line 112
    .line 113
    .line 114
    iput-object v11, v7, Lns1;->c:Lhs1;

    .line 115
    .line 116
    :cond_2
    const/4 v10, 0x3

    .line 117
    aget-object v11, p0, v10

    .line 118
    .line 119
    invoke-interface {v11}, Ln21;->getName()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    invoke-static {v0, v11}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    check-cast v11, Ljava/lang/String;

    .line 128
    .line 129
    if-eqz v11, :cond_3

    .line 130
    .line 131
    new-instance v12, Lhs1;

    .line 132
    .line 133
    invoke-direct {v12, v11, v9}, Lhs1;-><init>(Ljava/lang/String;I)V

    .line 134
    .line 135
    .line 136
    iput-object v12, v7, Lns1;->d:Lhs1;

    .line 137
    .line 138
    :cond_3
    const/4 v11, 0x4

    .line 139
    aget-object v12, p0, v11

    .line 140
    .line 141
    invoke-interface {v12}, Ln21;->getName()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    invoke-static {v0, v12}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v12

    .line 149
    check-cast v12, Ljava/lang/String;

    .line 150
    .line 151
    if-eqz v12, :cond_4

    .line 152
    .line 153
    new-instance v13, Lhs1;

    .line 154
    .line 155
    invoke-direct {v13, v12, v9}, Lhs1;-><init>(Ljava/lang/String;I)V

    .line 156
    .line 157
    .line 158
    iput-object v13, v7, Lns1;->e:Lhs1;

    .line 159
    .line 160
    :cond_4
    aget-object v3, p0, v3

    .line 161
    .line 162
    invoke-interface {v3}, Ln21;->getName()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-static {v0, v3}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    check-cast v3, Ljava/lang/String;

    .line 171
    .line 172
    if-eqz v3, :cond_5

    .line 173
    .line 174
    new-instance v12, Lhs1;

    .line 175
    .line 176
    invoke-direct {v12, v3, v9}, Lhs1;-><init>(Ljava/lang/String;I)V

    .line 177
    .line 178
    .line 179
    iput-object v12, v7, Lns1;->f:Lhs1;

    .line 180
    .line 181
    :cond_5
    aget-object v2, p0, v2

    .line 182
    .line 183
    invoke-interface {v2}, Ln21;->getName()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-static {v0, v2}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    check-cast v2, Ljava/lang/String;

    .line 192
    .line 193
    if-eqz v2, :cond_6

    .line 194
    .line 195
    new-instance v3, Lhs1;

    .line 196
    .line 197
    invoke-direct {v3, v2, v9}, Lhs1;-><init>(Ljava/lang/String;I)V

    .line 198
    .line 199
    .line 200
    iput-object v3, v7, Lns1;->g:Lhs1;

    .line 201
    .line 202
    :cond_6
    aget-object v1, p0, v1

    .line 203
    .line 204
    invoke-interface {v1}, Ln21;->getName()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-static {v0, v1}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    check-cast v1, Ljava/lang/String;

    .line 213
    .line 214
    if-eqz v1, :cond_7

    .line 215
    .line 216
    new-instance v2, Lhs1;

    .line 217
    .line 218
    invoke-direct {v2, v1, v9}, Lhs1;-><init>(Ljava/lang/String;I)V

    .line 219
    .line 220
    .line 221
    iput-object v2, v7, Lns1;->h:Lhs1;

    .line 222
    .line 223
    :cond_7
    const/16 v1, 0x8

    .line 224
    .line 225
    aget-object v1, p0, v1

    .line 226
    .line 227
    invoke-interface {v1}, Ln21;->getName()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-static {v0, v1}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    check-cast v1, Ljava/lang/String;

    .line 236
    .line 237
    if-eqz v1, :cond_8

    .line 238
    .line 239
    new-instance v2, Lhs1;

    .line 240
    .line 241
    invoke-direct {v2, v1, v10}, Lhs1;-><init>(Ljava/lang/String;I)V

    .line 242
    .line 243
    .line 244
    iput-object v2, v7, Lns1;->i:Lhs1;

    .line 245
    .line 246
    :cond_8
    const/16 v1, 0x9

    .line 247
    .line 248
    aget-object v1, p0, v1

    .line 249
    .line 250
    invoke-interface {v1}, Ln21;->getName()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    invoke-static {v0, v1}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    check-cast v1, Ljava/lang/String;

    .line 259
    .line 260
    if-eqz v1, :cond_9

    .line 261
    .line 262
    new-instance v2, Lhs1;

    .line 263
    .line 264
    invoke-direct {v2, v1, v11}, Lhs1;-><init>(Ljava/lang/String;I)V

    .line 265
    .line 266
    .line 267
    iput-object v2, v7, Lns1;->j:Lhs1;

    .line 268
    .line 269
    :cond_9
    aget-object v1, p0, v6

    .line 270
    .line 271
    invoke-interface {v1}, Ln21;->getName()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    invoke-static {v0, v1}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    check-cast v1, Ljava/lang/String;

    .line 280
    .line 281
    if-eqz v1, :cond_a

    .line 282
    .line 283
    new-instance v2, Lhs1;

    .line 284
    .line 285
    invoke-direct {v2, v1, v5}, Lhs1;-><init>(Ljava/lang/String;I)V

    .line 286
    .line 287
    .line 288
    iput-object v2, v7, Lns1;->k:Lhs1;

    .line 289
    .line 290
    :cond_a
    aget-object v1, p0, v8

    .line 291
    .line 292
    invoke-interface {v1}, Ln21;->getName()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-static {v0, v1}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    check-cast v1, Ljava/lang/String;

    .line 301
    .line 302
    if-eqz v1, :cond_b

    .line 303
    .line 304
    new-instance v2, Lhs1;

    .line 305
    .line 306
    invoke-direct {v2, v1, v4}, Lhs1;-><init>(Ljava/lang/String;I)V

    .line 307
    .line 308
    .line 309
    iput-object v2, v7, Lns1;->l:Lhs1;

    .line 310
    .line 311
    :cond_b
    const/16 v1, 0xc

    .line 312
    .line 313
    aget-object v1, p0, v1

    .line 314
    .line 315
    invoke-interface {v1}, Ln21;->getName()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    invoke-static {v0, v1}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    check-cast v1, Ljava/lang/Integer;

    .line 324
    .line 325
    if-eqz v1, :cond_c

    .line 326
    .line 327
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    new-instance v2, Lis1;

    .line 332
    .line 333
    invoke-direct {v2, v1}, Lis1;-><init>(I)V

    .line 334
    .line 335
    .line 336
    iput-object v2, v7, Lns1;->m:Lis1;

    .line 337
    .line 338
    :cond_c
    const/16 v1, 0xd

    .line 339
    .line 340
    aget-object v1, p0, v1

    .line 341
    .line 342
    invoke-interface {v1}, Ln21;->getName()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-static {v0, v1}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    check-cast v1, Ljava/lang/String;

    .line 351
    .line 352
    if-eqz v1, :cond_d

    .line 353
    .line 354
    new-instance v2, Lhs1;

    .line 355
    .line 356
    invoke-direct {v2, v1, v9}, Lhs1;-><init>(Ljava/lang/String;I)V

    .line 357
    .line 358
    .line 359
    iput-object v2, v7, Lns1;->n:Lhs1;

    .line 360
    .line 361
    :cond_d
    const/16 v1, 0xe

    .line 362
    .line 363
    aget-object v1, p0, v1

    .line 364
    .line 365
    invoke-interface {v1}, Ln21;->getName()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    invoke-static {v0, v1}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    check-cast v1, Ljava/lang/Boolean;

    .line 374
    .line 375
    if-eqz v1, :cond_e

    .line 376
    .line 377
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    new-instance v2, Ljs1;

    .line 382
    .line 383
    invoke-direct {v2, v1}, Ljs1;-><init>(Z)V

    .line 384
    .line 385
    .line 386
    iput-object v2, v7, Lns1;->o:Ljs1;

    .line 387
    .line 388
    :cond_e
    const/16 v1, 0xf

    .line 389
    .line 390
    aget-object v1, p0, v1

    .line 391
    .line 392
    invoke-interface {v1}, Ln21;->getName()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    invoke-static {v0, v1}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    check-cast v1, Ljava/lang/String;

    .line 401
    .line 402
    if-eqz v1, :cond_f

    .line 403
    .line 404
    new-instance v2, Lhs1;

    .line 405
    .line 406
    invoke-direct {v2, v1, v9}, Lhs1;-><init>(Ljava/lang/String;I)V

    .line 407
    .line 408
    .line 409
    iput-object v2, v7, Lns1;->p:Lhs1;

    .line 410
    .line 411
    :cond_f
    const/16 v1, 0x10

    .line 412
    .line 413
    aget-object v1, p0, v1

    .line 414
    .line 415
    invoke-interface {v1}, Ln21;->getName()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-static {v0, v1}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    check-cast v1, Ljava/lang/Double;

    .line 424
    .line 425
    if-eqz v1, :cond_10

    .line 426
    .line 427
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 428
    .line 429
    .line 430
    move-result-wide v1

    .line 431
    new-instance v3, Lks1;

    .line 432
    .line 433
    invoke-direct {v3, v1, v2}, Lks1;-><init>(D)V

    .line 434
    .line 435
    .line 436
    iput-object v3, v7, Lns1;->q:Lks1;

    .line 437
    .line 438
    :cond_10
    const/16 v1, 0x11

    .line 439
    .line 440
    aget-object v1, p0, v1

    .line 441
    .line 442
    invoke-interface {v1}, Ln21;->getName()Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    invoke-static {v0, v1}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    check-cast v1, Ljava/lang/String;

    .line 451
    .line 452
    if-eqz v1, :cond_11

    .line 453
    .line 454
    new-instance v2, Lhs1;

    .line 455
    .line 456
    invoke-direct {v2, v1, v9}, Lhs1;-><init>(Ljava/lang/String;I)V

    .line 457
    .line 458
    .line 459
    iput-object v2, v7, Lns1;->r:Lhs1;

    .line 460
    .line 461
    :cond_11
    const/16 v1, 0x12

    .line 462
    .line 463
    aget-object v1, p0, v1

    .line 464
    .line 465
    invoke-interface {v1}, Ln21;->getName()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    invoke-static {v0, v1}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    check-cast v1, Ljava/lang/String;

    .line 474
    .line 475
    if-eqz v1, :cond_12

    .line 476
    .line 477
    new-instance v2, Lhs1;

    .line 478
    .line 479
    invoke-direct {v2, v1, v9}, Lhs1;-><init>(Ljava/lang/String;I)V

    .line 480
    .line 481
    .line 482
    iput-object v2, v7, Lns1;->s:Lhs1;

    .line 483
    .line 484
    :cond_12
    const/16 v1, 0x13

    .line 485
    .line 486
    aget-object p0, p0, v1

    .line 487
    .line 488
    invoke-interface {p0}, Ln21;->getName()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object p0

    .line 492
    invoke-static {v0, p0}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object p0

    .line 496
    check-cast p0, Ljava/lang/String;

    .line 497
    .line 498
    if-eqz p0, :cond_13

    .line 499
    .line 500
    new-instance v0, Lhs1;

    .line 501
    .line 502
    invoke-direct {v0, p0, v9}, Lhs1;-><init>(Ljava/lang/String;I)V

    .line 503
    .line 504
    .line 505
    iput-object v0, v7, Lns1;->t:Lhs1;

    .line 506
    .line 507
    :cond_13
    return-object v7

    .line 508
    :pswitch_0
    check-cast p0, Llg2;

    .line 509
    .line 510
    new-instance v0, Luf1;

    .line 511
    .line 512
    iget-object p0, p0, Llg2;->a:Ljava/util/Map;

    .line 513
    .line 514
    const-string v1, "configuration"

    .line 515
    .line 516
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object p0

    .line 520
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    check-cast p0, Ljava/util/Map;

    .line 524
    .line 525
    invoke-direct {v0, p0}, Luf1;-><init>(Ljava/util/Map;)V

    .line 526
    .line 527
    .line 528
    return-object v0

    .line 529
    :pswitch_1
    check-cast p0, Lb5;

    .line 530
    .line 531
    iget-object v0, p0, Lb5;->c:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast v0, Landroid/app/Activity;

    .line 534
    .line 535
    if-eqz v0, :cond_14

    .line 536
    .line 537
    goto :goto_0

    .line 538
    :cond_14
    iget-object p0, p0, Lb5;->b:Ljava/lang/Object;

    .line 539
    .line 540
    move-object v0, p0

    .line 541
    check-cast v0, Landroid/content/Context;

    .line 542
    .line 543
    :goto_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object p0

    .line 547
    const-string v0, ".flutter.share_provider"

    .line 548
    .line 549
    invoke-static {p0, v0}, Lfm0;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object p0

    .line 553
    return-object p0

    .line 554
    :pswitch_2
    check-cast p0, Lw72;

    .line 555
    .line 556
    iget-object p0, p0, Lw72;->a:Ljava/util/Map;

    .line 557
    .line 558
    sget-object v0, Lw72;->c:[Lu21;

    .line 559
    .line 560
    aget-object v0, v0, v5

    .line 561
    .line 562
    invoke-interface {v0}, Ln21;->getName()Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    invoke-static {p0, v0}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object p0

    .line 570
    check-cast p0, Ljava/lang/String;

    .line 571
    .line 572
    if-eqz p0, :cond_15

    .line 573
    .line 574
    invoke-static {p0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 575
    .line 576
    .line 577
    move-result-object v7

    .line 578
    :cond_15
    return-object v7

    .line 579
    :pswitch_3
    check-cast p0, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;

    .line 580
    .line 581
    invoke-static {p0}, Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;->a(Lcom/supercell/id/scid_plugin/platform_interface/PackageValidation;)Z

    .line 582
    .line 583
    .line 584
    move-result p0

    .line 585
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 586
    .line 587
    .line 588
    move-result-object p0

    .line 589
    return-object p0

    .line 590
    :pswitch_4
    check-cast p0, Luf1;

    .line 591
    .line 592
    iget-object p0, p0, Luf1;->a:Ljava/util/Map;

    .line 593
    .line 594
    sget-object v0, Luf1;->g:[Lu21;

    .line 595
    .line 596
    aget-object v0, v0, v2

    .line 597
    .line 598
    invoke-interface {v0}, Ln21;->getName()Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    invoke-static {p0, v0}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object p0

    .line 606
    check-cast p0, Ljava/util/List;

    .line 607
    .line 608
    if-eqz p0, :cond_16

    .line 609
    .line 610
    new-instance v7, Ljava/util/ArrayList;

    .line 611
    .line 612
    invoke-static {p0, v6}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 617
    .line 618
    .line 619
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 620
    .line 621
    .line 622
    move-result-object p0

    .line 623
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 624
    .line 625
    .line 626
    move-result v0

    .line 627
    if-eqz v0, :cond_16

    .line 628
    .line 629
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    check-cast v0, Ljava/util/Map;

    .line 634
    .line 635
    new-instance v1, Lc92;

    .line 636
    .line 637
    invoke-direct {v1, v0}, Lc92;-><init>(Ljava/util/Map;)V

    .line 638
    .line 639
    .line 640
    invoke-virtual {v1}, Lc92;->a()Lb92;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 645
    .line 646
    .line 647
    goto :goto_1

    .line 648
    :cond_16
    return-object v7

    .line 649
    :pswitch_5
    check-cast p0, Ljava/util/Map;

    .line 650
    .line 651
    const-string v0, "player"

    .line 652
    .line 653
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object p0

    .line 657
    if-eqz p0, :cond_17

    .line 658
    .line 659
    new-instance v7, Ljf1;

    .line 660
    .line 661
    check-cast p0, Ljava/util/Map;

    .line 662
    .line 663
    invoke-direct {v7, p0}, Ljf1;-><init>(Ljava/util/Map;)V

    .line 664
    .line 665
    .line 666
    :cond_17
    return-object v7

    .line 667
    :pswitch_6
    check-cast p0, Ljf1;

    .line 668
    .line 669
    iget-object p0, p0, Ljf1;->a:Ljava/util/Map;

    .line 670
    .line 671
    sget-object v0, Ljf1;->c:[Lu21;

    .line 672
    .line 673
    aget-object v0, v0, v1

    .line 674
    .line 675
    invoke-interface {v0}, Ln21;->getName()Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    invoke-static {p0, v0}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object p0

    .line 683
    check-cast p0, Ljava/lang/String;

    .line 684
    .line 685
    const-string v0, "audio"

    .line 686
    .line 687
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 688
    .line 689
    .line 690
    move-result v0

    .line 691
    if-eqz v0, :cond_18

    .line 692
    .line 693
    sget-object v7, Lwf1;->b:Lwf1;

    .line 694
    .line 695
    goto :goto_2

    .line 696
    :cond_18
    const-string v0, "video"

    .line 697
    .line 698
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 699
    .line 700
    .line 701
    move-result p0

    .line 702
    if-eqz p0, :cond_19

    .line 703
    .line 704
    sget-object v7, Lwf1;->a:Lwf1;

    .line 705
    .line 706
    :cond_19
    :goto_2
    return-object v7

    .line 707
    :pswitch_7
    check-cast p0, Lud1;

    .line 708
    .line 709
    iget-object p0, p0, Lud1;->a:Ljava/util/Map;

    .line 710
    .line 711
    sget-object v0, Lud1;->d:[Lu21;

    .line 712
    .line 713
    aget-object v0, v0, v4

    .line 714
    .line 715
    invoke-interface {v0}, Ln21;->getName()Ljava/lang/String;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    invoke-static {p0, v0}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object p0

    .line 723
    check-cast p0, Ljava/lang/String;

    .line 724
    .line 725
    if-eqz p0, :cond_20

    .line 726
    .line 727
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 728
    .line 729
    .line 730
    move-result v0

    .line 731
    const v1, -0x54361cf4

    .line 732
    .line 733
    .line 734
    if-eq v0, v1, :cond_1e

    .line 735
    .line 736
    const v1, -0x41b970db

    .line 737
    .line 738
    .line 739
    if-eq v0, v1, :cond_1c

    .line 740
    .line 741
    const v1, 0x2a31852

    .line 742
    .line 743
    .line 744
    if-eq v0, v1, :cond_1a

    .line 745
    .line 746
    goto :goto_3

    .line 747
    :cond_1a
    const-string v0, "nonLinear"

    .line 748
    .line 749
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result p0

    .line 753
    if-nez p0, :cond_1b

    .line 754
    .line 755
    goto :goto_3

    .line 756
    :cond_1b
    sget-object v7, Lwd1;->b:Lwd1;

    .line 757
    .line 758
    goto :goto_3

    .line 759
    :cond_1c
    const-string v0, "linear"

    .line 760
    .line 761
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 762
    .line 763
    .line 764
    move-result p0

    .line 765
    if-nez p0, :cond_1d

    .line 766
    .line 767
    goto :goto_3

    .line 768
    :cond_1d
    sget-object v7, Lwd1;->a:Lwd1;

    .line 769
    .line 770
    goto :goto_3

    .line 771
    :cond_1e
    const-string v0, "companion"

    .line 772
    .line 773
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 774
    .line 775
    .line 776
    move-result p0

    .line 777
    if-nez p0, :cond_1f

    .line 778
    .line 779
    goto :goto_3

    .line 780
    :cond_1f
    sget-object v7, Lwd1;->c:Lwd1;

    .line 781
    .line 782
    :cond_20
    :goto_3
    return-object v7

    .line 783
    :pswitch_8
    check-cast p0, Liz;

    .line 784
    .line 785
    iget-object p0, p0, Liz;->a:Ljava/util/Map;

    .line 786
    .line 787
    sget-object v0, Liz;->c:[Lu21;

    .line 788
    .line 789
    aget-object v0, v0, v3

    .line 790
    .line 791
    invoke-interface {v0}, Ln21;->getName()Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    invoke-static {p0, v0}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object p0

    .line 799
    check-cast p0, Ljava/util/List;

    .line 800
    .line 801
    if-eqz p0, :cond_21

    .line 802
    .line 803
    new-instance v7, Ljava/util/ArrayList;

    .line 804
    .line 805
    invoke-static {p0, v6}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 806
    .line 807
    .line 808
    move-result v0

    .line 809
    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 810
    .line 811
    .line 812
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 813
    .line 814
    .line 815
    move-result-object p0

    .line 816
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 817
    .line 818
    .line 819
    move-result v0

    .line 820
    if-eqz v0, :cond_21

    .line 821
    .line 822
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    check-cast v0, Ljava/util/Map;

    .line 827
    .line 828
    new-instance v1, Lcz;

    .line 829
    .line 830
    invoke-direct {v1, v0}, Lcz;-><init>(Ljava/util/Map;)V

    .line 831
    .line 832
    .line 833
    invoke-virtual {v1}, Lcz;->a()Laz;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    goto :goto_4

    .line 841
    :cond_21
    return-object v7

    .line 842
    :pswitch_9
    check-cast p0, Lez;

    .line 843
    .line 844
    iget-object p0, p0, Lez;->a:Ljava/util/Map;

    .line 845
    .line 846
    sget-object v0, Lez;->c:[Lu21;

    .line 847
    .line 848
    aget-object v0, v0, v3

    .line 849
    .line 850
    invoke-interface {v0}, Ln21;->getName()Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    invoke-static {p0, v0}, Lmc1;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 855
    .line 856
    .line 857
    move-result-object p0

    .line 858
    check-cast p0, Ljava/util/List;

    .line 859
    .line 860
    if-eqz p0, :cond_22

    .line 861
    .line 862
    new-instance v7, Ljava/util/ArrayList;

    .line 863
    .line 864
    invoke-static {p0, v6}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 865
    .line 866
    .line 867
    move-result v0

    .line 868
    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 869
    .line 870
    .line 871
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 872
    .line 873
    .line 874
    move-result-object p0

    .line 875
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 876
    .line 877
    .line 878
    move-result v0

    .line 879
    if-eqz v0, :cond_22

    .line 880
    .line 881
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    check-cast v0, Ljava/util/Map;

    .line 886
    .line 887
    new-instance v1, Lcz;

    .line 888
    .line 889
    invoke-direct {v1, v0}, Lcz;-><init>(Ljava/util/Map;)V

    .line 890
    .line 891
    .line 892
    invoke-virtual {v1}, Lcz;->a()Laz;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 897
    .line 898
    .line 899
    goto :goto_5

    .line 900
    :cond_22
    return-object v7

    .line 901
    :pswitch_a
    check-cast p0, Landroidx/activity/ComponentActivity;

    .line 902
    .line 903
    sget v0, Landroidx/activity/ComponentActivity;->a:I

    .line 904
    .line 905
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->reportFullyDrawn()V

    .line 906
    .line 907
    .line 908
    return-object v7

    .line 909
    :pswitch_b
    check-cast p0, [Ljava/lang/Object;

    .line 910
    .line 911
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 912
    .line 913
    .line 914
    new-instance v0, Lr;

    .line 915
    .line 916
    invoke-direct {v0, p0}, Lr;-><init>([Ljava/lang/Object;)V

    .line 917
    .line 918
    .line 919
    return-object v0

    .line 920
    nop

    .line 921
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
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

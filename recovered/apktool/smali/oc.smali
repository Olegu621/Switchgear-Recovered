.class public final Loc;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Loc;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Loc;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Loc;->c:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Loc;->a:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, Lio/sentry/android/replay/capture/l;

    .line 14
    .line 15
    iget-object v2, v0, Loc;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lio/sentry/android/replay/capture/n;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    instance-of v3, v1, Lio/sentry/android/replay/capture/j;

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    check-cast v1, Lio/sentry/android/replay/capture/j;

    .line 27
    .line 28
    iget-object v3, v2, Lio/sentry/android/replay/capture/n;->u:Lio/sentry/c1;

    .line 29
    .line 30
    invoke-static {v1, v3}, Lio/sentry/android/replay/capture/j;->a(Lio/sentry/android/replay/capture/j;Lio/sentry/c1;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    const/4 v1, -0x1

    .line 34
    invoke-virtual {v2, v1}, Lio/sentry/android/replay/capture/c;->k(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ljava/io/File;

    .line 40
    .line 41
    invoke-static {v0}, Lio/sentry/util/c;->f(Ljava/io/File;)Z

    .line 42
    .line 43
    .line 44
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_0
    move-object/from16 v1, p1

    .line 48
    .line 49
    check-cast v1, Lio/sentry/rrweb/b;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-wide v2, v1, Lio/sentry/rrweb/b;->b:J

    .line 55
    .line 56
    iget-object v4, v0, Loc;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v4, Ljava/util/Date;

    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    cmp-long v2, v2, v4

    .line 65
    .line 66
    if-ltz v2, :cond_1

    .line 67
    .line 68
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_1
    move-object/from16 v1, p1

    .line 79
    .line 80
    check-cast v1, Lio/sentry/android/replay/capture/l;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iget-object v3, v0, Loc;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v3, Lio/sentry/android/replay/capture/g;

    .line 88
    .line 89
    iget-object v5, v3, Lio/sentry/android/replay/capture/g;->x:Ljava/util/ArrayList;

    .line 90
    .line 91
    iget-object v3, v3, Lio/sentry/android/replay/capture/g;->u:Lio/sentry/c1;

    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_2

    .line 101
    .line 102
    move-object v6, v4

    .line 103
    goto :goto_0

    .line 104
    :cond_2
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    :goto_0
    check-cast v6, Lio/sentry/android/replay/capture/j;

    .line 109
    .line 110
    :goto_1
    if-eqz v6, :cond_4

    .line 111
    .line 112
    invoke-static {v6, v3}, Lio/sentry/android/replay/capture/j;->a(Lio/sentry/android/replay/capture/j;Lio/sentry/c1;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-eqz v6, :cond_3

    .line 120
    .line 121
    move-object v6, v4

    .line 122
    goto :goto_2

    .line 123
    :cond_3
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    :goto_2
    check-cast v6, Lio/sentry/android/replay/capture/j;

    .line 128
    .line 129
    const-wide/16 v7, 0x64

    .line 130
    .line 131
    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_4
    instance-of v2, v1, Lio/sentry/android/replay/capture/j;

    .line 136
    .line 137
    if-eqz v2, :cond_5

    .line 138
    .line 139
    check-cast v1, Lio/sentry/android/replay/capture/j;

    .line 140
    .line 141
    invoke-static {v1, v3}, Lio/sentry/android/replay/capture/j;->a(Lio/sentry/android/replay/capture/j;Lio/sentry/c1;)V

    .line 142
    .line 143
    .line 144
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, Lo;

    .line 147
    .line 148
    iget-object v1, v1, Lio/sentry/android/replay/capture/j;->a:Lio/sentry/o6;

    .line 149
    .line 150
    iget-object v1, v1, Lio/sentry/o6;->f0:Ljava/util/Date;

    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v1}, Lo;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    return-object v0

    .line 161
    :pswitch_2
    move-object/from16 v1, p1

    .line 162
    .line 163
    check-cast v1, Ltz2;

    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    iget-object v2, v0, Loc;->b:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v2, Lb5;

    .line 171
    .line 172
    iget-object v2, v2, Lb5;->e:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v2, Li03;

    .line 175
    .line 176
    invoke-interface {v2, v1}, Li03;->d(Ltz2;)V

    .line 177
    .line 178
    .line 179
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 182
    .line 183
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object v0

    .line 189
    :pswitch_3
    move-object/from16 v1, p1

    .line 190
    .line 191
    check-cast v1, Lcw1;

    .line 192
    .line 193
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iget-object v2, v0, Loc;->b:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v2, Lsh;

    .line 199
    .line 200
    new-instance v4, Lwu1;

    .line 201
    .line 202
    new-instance v5, Lac1;

    .line 203
    .line 204
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v0, Lb5;

    .line 207
    .line 208
    iget-object v6, v0, Lb5;->b:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v6, La13;

    .line 211
    .line 212
    iget-object v7, v0, Lb5;->c:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v7, Lg13;

    .line 215
    .line 216
    iget-object v8, v0, Lb5;->d:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v8, Ljava/lang/String;

    .line 219
    .line 220
    invoke-direct {v5, v6, v7, v8}, Lac1;-><init>(La13;Lg13;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    new-instance v6, Ler0;

    .line 224
    .line 225
    new-instance v7, Luv2;

    .line 226
    .line 227
    invoke-direct {v7, v0, v3}, Luv2;-><init>(Ljava/lang/Object;I)V

    .line 228
    .line 229
    .line 230
    const/16 v0, 0x9

    .line 231
    .line 232
    invoke-direct {v6, v7, v0}, Ler0;-><init>(Ljava/lang/Object;I)V

    .line 233
    .line 234
    .line 235
    invoke-direct {v4, v1, v5, v6}, Lwu1;-><init>(Lcw1;Lac1;Ler0;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v4}, Lsh;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 242
    .line 243
    return-object v0

    .line 244
    :pswitch_4
    move-object/from16 v1, p1

    .line 245
    .line 246
    check-cast v1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    iget-object v2, v0, Loc;->b:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v2, La13;

    .line 254
    .line 255
    iget-object v2, v2, La13;->a:Lfb1;

    .line 256
    .line 257
    invoke-virtual {v2}, Lfb1;->b()Lx80;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    new-instance v3, Llz;

    .line 262
    .line 263
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 266
    .line 267
    const/16 v4, 0xe

    .line 268
    .line 269
    invoke-direct {v3, v4, v0, v1}, Llz;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v3}, Lx80;->c(Lkotlin/jvm/functions/Function0;)V

    .line 273
    .line 274
    .line 275
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 276
    .line 277
    return-object v0

    .line 278
    :pswitch_5
    move-object/from16 v1, p1

    .line 279
    .line 280
    check-cast v1, Ljava/lang/Throwable;

    .line 281
    .line 282
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    iget-object v2, v0, Loc;->b:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v2, La13;

    .line 288
    .line 289
    iget-object v3, v2, La13;->a:Lfb1;

    .line 290
    .line 291
    invoke-virtual {v3}, Lfb1;->b()Lx80;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    new-instance v4, Llz;

    .line 296
    .line 297
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v0, Lbz;

    .line 300
    .line 301
    invoke-direct {v4, v1, v2, v0}, Llz;-><init>(Ljava/lang/Throwable;La13;Lbz;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v3, v4}, Lx80;->c(Lkotlin/jvm/functions/Function0;)V

    .line 305
    .line 306
    .line 307
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 308
    .line 309
    return-object v0

    .line 310
    :pswitch_6
    move-object/from16 v1, p1

    .line 311
    .line 312
    check-cast v1, Lkotlin/Unit;

    .line 313
    .line 314
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    iget-object v1, v0, Loc;->b:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v1, La13;

    .line 320
    .line 321
    iget-object v2, v1, La13;->a:Lfb1;

    .line 322
    .line 323
    invoke-virtual {v2}, Lfb1;->b()Lx80;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    new-instance v3, Lf8;

    .line 328
    .line 329
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v0, Lt03;

    .line 332
    .line 333
    invoke-direct {v3, v1, v0}, Lf8;-><init>(La13;Lt03;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2, v3}, Lx80;->c(Lkotlin/jvm/functions/Function0;)V

    .line 337
    .line 338
    .line 339
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 340
    .line 341
    return-object v0

    .line 342
    :pswitch_7
    move-object/from16 v1, p1

    .line 343
    .line 344
    check-cast v1, Ljava/lang/Throwable;

    .line 345
    .line 346
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    iget-object v2, v0, Loc;->b:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v2, La13;

    .line 352
    .line 353
    iget-object v2, v2, La13;->a:Lfb1;

    .line 354
    .line 355
    invoke-virtual {v2}, Lfb1;->b()Lx80;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    new-instance v3, Llz;

    .line 360
    .line 361
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v0, Loc;

    .line 364
    .line 365
    const/16 v4, 0xc

    .line 366
    .line 367
    invoke-direct {v3, v4, v0, v1}, Llz;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v3}, Lx80;->c(Lkotlin/jvm/functions/Function0;)V

    .line 371
    .line 372
    .line 373
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 374
    .line 375
    return-object v0

    .line 376
    :pswitch_8
    move-object/from16 v1, p1

    .line 377
    .line 378
    check-cast v1, Lo42;

    .line 379
    .line 380
    iget-object v1, v1, Lo42;->a:Ljava/lang/Object;

    .line 381
    .line 382
    iget-object v1, v0, Loc;->b:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v1, La13;

    .line 385
    .line 386
    iget-object v1, v1, La13;->a:Lfb1;

    .line 387
    .line 388
    invoke-virtual {v1}, Lfb1;->b()Lx80;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    new-instance v2, Lf8;

    .line 393
    .line 394
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v0, Llz;

    .line 397
    .line 398
    const/16 v3, 0x13

    .line 399
    .line 400
    invoke-direct {v2, v0, v3}, Lf8;-><init>(Ljava/lang/Object;I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v1, v2}, Lx80;->c(Lkotlin/jvm/functions/Function0;)V

    .line 404
    .line 405
    .line 406
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 407
    .line 408
    return-object v0

    .line 409
    :pswitch_9
    move-object/from16 v1, p1

    .line 410
    .line 411
    check-cast v1, Lo42;

    .line 412
    .line 413
    iget-object v1, v1, Lo42;->a:Ljava/lang/Object;

    .line 414
    .line 415
    iget-object v2, v0, Loc;->b:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 418
    .line 419
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 420
    .line 421
    move-object v3, v0

    .line 422
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 423
    .line 424
    sget-object v0, Lo42;->b:Lm42;

    .line 425
    .line 426
    instance-of v0, v1, Ln42;

    .line 427
    .line 428
    if-nez v0, :cond_8

    .line 429
    .line 430
    move-object v0, v1

    .line 431
    check-cast v0, Lu03;

    .line 432
    .line 433
    :try_start_0
    invoke-virtual {v0}, Lu03;->b()Lcom/usercentrics/sdk/UsercentricsReadyStatus;

    .line 434
    .line 435
    .line 436
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 437
    goto :goto_3

    .line 438
    :catchall_0
    move-exception v0

    .line 439
    sget-object v4, Lo42;->b:Lm42;

    .line 440
    .line 441
    new-instance v4, Ln42;

    .line 442
    .line 443
    invoke-direct {v4, v0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 444
    .line 445
    .line 446
    move-object v0, v4

    .line 447
    :goto_3
    nop

    .line 448
    instance-of v4, v0, Ln42;

    .line 449
    .line 450
    if-nez v4, :cond_6

    .line 451
    .line 452
    move-object v4, v0

    .line 453
    check-cast v4, Lcom/usercentrics/sdk/UsercentricsReadyStatus;

    .line 454
    .line 455
    invoke-interface {v2, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    :cond_6
    invoke-static {v0}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    if-eqz v0, :cond_8

    .line 463
    .line 464
    new-instance v2, Ltz2;

    .line 465
    .line 466
    new-instance v4, Lvz2;

    .line 467
    .line 468
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v5

    .line 472
    if-nez v5, :cond_7

    .line 473
    .line 474
    const-string v5, ""

    .line 475
    .line 476
    :cond_7
    invoke-direct {v4, v5, v0}, Lvz2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 477
    .line 478
    .line 479
    invoke-direct {v2, v4}, Ltz2;-><init>(Lvz2;)V

    .line 480
    .line 481
    .line 482
    invoke-interface {v3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    :cond_8
    invoke-static {v1}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    if-eqz v0, :cond_9

    .line 490
    .line 491
    check-cast v0, Lvz2;

    .line 492
    .line 493
    new-instance v1, Ltz2;

    .line 494
    .line 495
    invoke-direct {v1, v0}, Ltz2;-><init>(Lvz2;)V

    .line 496
    .line 497
    .line 498
    invoke-interface {v3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 502
    .line 503
    return-object v0

    .line 504
    :pswitch_a
    move-object/from16 v1, p1

    .line 505
    .line 506
    check-cast v1, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 507
    .line 508
    const-string v2, "\u2022 "

    .line 509
    .line 510
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    iget-object v3, v0, Loc;->b:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v3, Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;

    .line 516
    .line 517
    if-eqz v3, :cond_a

    .line 518
    .line 519
    iget-object v3, v3, Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;->a:Ljava/util/Map;

    .line 520
    .line 521
    if-eqz v3, :cond_a

    .line 522
    .line 523
    iget v4, v1, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 524
    .line 525
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 526
    .line 527
    .line 528
    move-result-object v4

    .line 529
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    move-object v4, v3

    .line 534
    check-cast v4, Ljava/lang/Integer;

    .line 535
    .line 536
    :cond_a
    iget-object v1, v1, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->b:Ljava/lang/String;

    .line 537
    .line 538
    if-eqz v4, :cond_b

    .line 539
    .line 540
    invoke-static {v1}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v0, Lol2;

    .line 551
    .line 552
    invoke-virtual {v0}, Lol2;->b()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    iget-object v0, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->C:Ljava/lang/String;

    .line 557
    .line 558
    const-string v3, " ("

    .line 559
    .line 560
    const-string v5, ": "

    .line 561
    .line 562
    invoke-static {v2, v1, v3, v0, v5}, Len;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    const-string v1, ")"

    .line 570
    .line 571
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    goto :goto_4

    .line 579
    :cond_b
    invoke-static {v1}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-static {v2, v0}, Len;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    :goto_4
    return-object v0

    .line 592
    :pswitch_b
    move-object/from16 v1, p1

    .line 593
    .line 594
    check-cast v1, Ljava/lang/Throwable;

    .line 595
    .line 596
    iget-object v3, v0, Loc;->b:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast v3, Lo;

    .line 599
    .line 600
    invoke-virtual {v3, v1}, Lo;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 604
    .line 605
    check-cast v0, Lra2;

    .line 606
    .line 607
    iget-object v0, v0, Lra2;->c:Ljava/lang/Object;

    .line 608
    .line 609
    move-object v5, v0

    .line 610
    check-cast v5, Lzk;

    .line 611
    .line 612
    invoke-virtual {v5, v2, v1}, Lzk;->g(ZLjava/lang/Throwable;)Z

    .line 613
    .line 614
    .line 615
    :cond_c
    invoke-virtual {v5}, Lzk;->E()Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    instance-of v2, v0, Let;

    .line 620
    .line 621
    if-nez v2, :cond_d

    .line 622
    .line 623
    goto :goto_5

    .line 624
    :cond_d
    move-object v0, v4

    .line 625
    :goto_5
    if-eqz v0, :cond_f

    .line 626
    .line 627
    check-cast v0, Lkh1;

    .line 628
    .line 629
    iget-object v0, v0, Lkh1;->b:Lkx;

    .line 630
    .line 631
    if-nez v1, :cond_e

    .line 632
    .line 633
    new-instance v2, Ljava/util/concurrent/CancellationException;

    .line 634
    .line 635
    const-string v3, "DataStore scope was cancelled before updateData could complete"

    .line 636
    .line 637
    invoke-direct {v2, v3}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    goto :goto_6

    .line 641
    :cond_e
    move-object v2, v1

    .line 642
    :goto_6
    invoke-virtual {v0, v2}, Lkx;->U(Ljava/lang/Throwable;)Z

    .line 643
    .line 644
    .line 645
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 646
    .line 647
    goto :goto_7

    .line 648
    :cond_f
    move-object v0, v4

    .line 649
    :goto_7
    if-nez v0, :cond_c

    .line 650
    .line 651
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 652
    .line 653
    return-object v0

    .line 654
    :pswitch_c
    move-object/from16 v1, p1

    .line 655
    .line 656
    check-cast v1, Luq2;

    .line 657
    .line 658
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    iget-object v5, v0, Loc;->b:Ljava/lang/Object;

    .line 662
    .line 663
    check-cast v5, Ld31;

    .line 664
    .line 665
    iput-object v5, v1, Luq2;->j:Ld31;

    .line 666
    .line 667
    iget-object v5, v0, Loc;->c:Ljava/lang/Object;

    .line 668
    .line 669
    check-cast v5, Lqa2;

    .line 670
    .line 671
    invoke-virtual {v5}, Lqa2;->f()Lvq2;

    .line 672
    .line 673
    .line 674
    move-result-object v5

    .line 675
    invoke-virtual {v5}, Lvq2;->t()Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v5

    .line 679
    iget-boolean v6, v1, Luq2;->c:Z

    .line 680
    .line 681
    if-nez v6, :cond_10

    .line 682
    .line 683
    iput-object v5, v1, Luq2;->v:Ljava/lang/String;

    .line 684
    .line 685
    :cond_10
    iget-object v5, v0, Loc;->c:Ljava/lang/Object;

    .line 686
    .line 687
    check-cast v5, Lqa2;

    .line 688
    .line 689
    invoke-virtual {v5}, Lqa2;->f()Lvq2;

    .line 690
    .line 691
    .line 692
    move-result-object v5

    .line 693
    invoke-virtual {v5}, Lvq2;->c()Z

    .line 694
    .line 695
    .line 696
    move-result v5

    .line 697
    iget-boolean v6, v1, Luq2;->c:Z

    .line 698
    .line 699
    if-nez v6, :cond_11

    .line 700
    .line 701
    iput-boolean v5, v1, Luq2;->l:Z

    .line 702
    .line 703
    :cond_11
    iget-object v5, v0, Loc;->c:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v5, Lqa2;

    .line 706
    .line 707
    invoke-virtual {v5}, Lqa2;->f()Lvq2;

    .line 708
    .line 709
    .line 710
    move-result-object v5

    .line 711
    invoke-virtual {v5}, Lvq2;->e()I

    .line 712
    .line 713
    .line 714
    move-result v5

    .line 715
    iput v5, v1, Luq2;->H:I

    .line 716
    .line 717
    iget-object v5, v0, Loc;->c:Ljava/lang/Object;

    .line 718
    .line 719
    check-cast v5, Lqa2;

    .line 720
    .line 721
    invoke-virtual {v5}, Lqa2;->f()Lvq2;

    .line 722
    .line 723
    .line 724
    move-result-object v5

    .line 725
    invoke-virtual {v5}, Lvq2;->k()I

    .line 726
    .line 727
    .line 728
    move-result v5

    .line 729
    if-eqz v5, :cond_2a

    .line 730
    .line 731
    iget-boolean v6, v1, Luq2;->c:Z

    .line 732
    .line 733
    if-nez v6, :cond_12

    .line 734
    .line 735
    iput v5, v1, Luq2;->I:I

    .line 736
    .line 737
    :cond_12
    iget-object v5, v0, Loc;->c:Ljava/lang/Object;

    .line 738
    .line 739
    check-cast v5, Lqa2;

    .line 740
    .line 741
    invoke-virtual {v5}, Lqa2;->f()Lvq2;

    .line 742
    .line 743
    .line 744
    move-result-object v5

    .line 745
    invoke-virtual {v5}, Lvq2;->l()Ldc0;

    .line 746
    .line 747
    .line 748
    iget-boolean v5, v1, Luq2;->c:Z

    .line 749
    .line 750
    if-nez v5, :cond_13

    .line 751
    .line 752
    sget v5, Lk50;->b:I

    .line 753
    .line 754
    sget v5, Lk50;->b:I

    .line 755
    .line 756
    :cond_13
    iget-object v5, v0, Loc;->c:Ljava/lang/Object;

    .line 757
    .line 758
    check-cast v5, Lqa2;

    .line 759
    .line 760
    invoke-virtual {v5}, Lqa2;->f()Lvq2;

    .line 761
    .line 762
    .line 763
    move-result-object v5

    .line 764
    invoke-virtual {v5}, Lvq2;->s()Z

    .line 765
    .line 766
    .line 767
    move-result v5

    .line 768
    monitor-enter v1

    .line 769
    :try_start_1
    iput-boolean v5, v1, Luq2;->x:Z

    .line 770
    .line 771
    iget-object v6, v1, Luq2;->k:Lza2;

    .line 772
    .line 773
    if-eqz v6, :cond_14

    .line 774
    .line 775
    if-nez v5, :cond_14

    .line 776
    .line 777
    invoke-virtual {v1}, Luq2;->b()V

    .line 778
    .line 779
    .line 780
    iput-object v4, v1, Luq2;->k:Lza2;

    .line 781
    .line 782
    goto :goto_9

    .line 783
    :catchall_1
    move-exception v0

    .line 784
    goto/16 :goto_e

    .line 785
    .line 786
    :cond_14
    if-nez v6, :cond_16

    .line 787
    .line 788
    if-eqz v5, :cond_16

    .line 789
    .line 790
    filled-new-array {v4, v4, v4, v4}, [Ljava/lang/Runnable;

    .line 791
    .line 792
    .line 793
    move-result-object v5

    .line 794
    iget-object v6, v1, Luq2;->w:[Ljava/lang/Runnable;

    .line 795
    .line 796
    array-length v7, v6

    .line 797
    const/4 v8, 0x4

    .line 798
    if-ne v7, v8, :cond_15

    .line 799
    .line 800
    move-object/from16 v17, v6

    .line 801
    .line 802
    goto :goto_8

    .line 803
    :cond_15
    move-object/from16 v17, v5

    .line 804
    .line 805
    :goto_8
    sget-object v9, Lza2;->r:Lp62;

    .line 806
    .line 807
    iget-object v10, v1, Luq2;->d:Landroid/content/Context;

    .line 808
    .line 809
    iget-wide v11, v1, Luq2;->m:J

    .line 810
    .line 811
    iget-wide v13, v1, Luq2;->n:J

    .line 812
    .line 813
    iget-object v15, v1, Luq2;->o:Ljava/util/concurrent/TimeUnit;

    .line 814
    .line 815
    iget-object v5, v1, Luq2;->a:Ljava/lang/String;

    .line 816
    .line 817
    move-object/from16 v16, v5

    .line 818
    .line 819
    invoke-virtual/range {v9 .. v17}, Lp62;->e(Landroid/content/Context;JJLjava/util/concurrent/TimeUnit;Ljava/lang/String;[Ljava/lang/Runnable;)Lza2;

    .line 820
    .line 821
    .line 822
    move-result-object v5

    .line 823
    iput-object v5, v1, Luq2;->k:Lza2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 824
    .line 825
    :cond_16
    :goto_9
    monitor-exit v1

    .line 826
    iget-object v5, v0, Loc;->c:Ljava/lang/Object;

    .line 827
    .line 828
    check-cast v5, Lqa2;

    .line 829
    .line 830
    invoke-virtual {v5}, Lqa2;->f()Lvq2;

    .line 831
    .line 832
    .line 833
    move-result-object v5

    .line 834
    invoke-virtual {v5}, Lvq2;->b()Z

    .line 835
    .line 836
    .line 837
    move-result v5

    .line 838
    iget-boolean v6, v1, Luq2;->c:Z

    .line 839
    .line 840
    if-nez v6, :cond_17

    .line 841
    .line 842
    iput-boolean v5, v1, Luq2;->A:Z

    .line 843
    .line 844
    :cond_17
    iget-object v5, v0, Loc;->c:Ljava/lang/Object;

    .line 845
    .line 846
    check-cast v5, Lqa2;

    .line 847
    .line 848
    invoke-virtual {v5}, Lqa2;->f()Lvq2;

    .line 849
    .line 850
    .line 851
    move-result-object v5

    .line 852
    invoke-virtual {v5}, Lvq2;->m()Z

    .line 853
    .line 854
    .line 855
    move-result v5

    .line 856
    iget-boolean v6, v1, Luq2;->c:Z

    .line 857
    .line 858
    if-nez v6, :cond_18

    .line 859
    .line 860
    iput-boolean v5, v1, Luq2;->z:Z

    .line 861
    .line 862
    :cond_18
    iget-object v5, v0, Loc;->c:Ljava/lang/Object;

    .line 863
    .line 864
    check-cast v5, Lqa2;

    .line 865
    .line 866
    invoke-virtual {v5}, Lqa2;->f()Lvq2;

    .line 867
    .line 868
    .line 869
    move-result-object v5

    .line 870
    invoke-virtual {v5}, Lvq2;->h()Z

    .line 871
    .line 872
    .line 873
    move-result v5

    .line 874
    iget-boolean v6, v1, Luq2;->c:Z

    .line 875
    .line 876
    if-nez v6, :cond_19

    .line 877
    .line 878
    iput-boolean v5, v1, Luq2;->y:Z

    .line 879
    .line 880
    :cond_19
    iget-object v5, v0, Loc;->c:Ljava/lang/Object;

    .line 881
    .line 882
    check-cast v5, Lqa2;

    .line 883
    .line 884
    invoke-virtual {v5}, Lqa2;->f()Lvq2;

    .line 885
    .line 886
    .line 887
    move-result-object v5

    .line 888
    invoke-virtual {v5}, Lvq2;->d()Z

    .line 889
    .line 890
    .line 891
    move-result v5

    .line 892
    if-eqz v5, :cond_1a

    .line 893
    .line 894
    new-instance v5, Lq50;

    .line 895
    .line 896
    invoke-direct {v5, v2}, Lq50;-><init>(I)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v1, v5}, Luq2;->a(Lq50;)V

    .line 900
    .line 901
    .line 902
    goto :goto_a

    .line 903
    :cond_1a
    const-string v2, "DeepLinkContext"

    .line 904
    .line 905
    iget-object v5, v1, Luq2;->e:Lf31;

    .line 906
    .line 907
    invoke-virtual {v5, v2}, Lf31;->e(Ljava/lang/String;)V

    .line 908
    .line 909
    .line 910
    :goto_a
    iget-object v2, v0, Loc;->c:Ljava/lang/Object;

    .line 911
    .line 912
    check-cast v2, Lqa2;

    .line 913
    .line 914
    invoke-virtual {v2}, Lqa2;->f()Lvq2;

    .line 915
    .line 916
    .line 917
    move-result-object v2

    .line 918
    invoke-virtual {v2}, Lvq2;->p()Z

    .line 919
    .line 920
    .line 921
    move-result v2

    .line 922
    if-eqz v2, :cond_1b

    .line 923
    .line 924
    new-instance v2, Lq50;

    .line 925
    .line 926
    const/4 v5, 0x2

    .line 927
    invoke-direct {v2, v5}, Lq50;-><init>(I)V

    .line 928
    .line 929
    .line 930
    invoke-virtual {v1, v2}, Luq2;->a(Lq50;)V

    .line 931
    .line 932
    .line 933
    goto :goto_b

    .line 934
    :cond_1b
    const-string v2, "ScreenContext"

    .line 935
    .line 936
    iget-object v5, v1, Luq2;->e:Lf31;

    .line 937
    .line 938
    invoke-virtual {v5, v2}, Lf31;->e(Ljava/lang/String;)V

    .line 939
    .line 940
    .line 941
    :goto_b
    iget-object v2, v0, Loc;->c:Ljava/lang/Object;

    .line 942
    .line 943
    check-cast v2, Lqa2;

    .line 944
    .line 945
    invoke-virtual {v2}, Lqa2;->f()Lvq2;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    invoke-virtual {v2}, Lvq2;->r()Z

    .line 950
    .line 951
    .line 952
    move-result v2

    .line 953
    iget-boolean v5, v1, Luq2;->c:Z

    .line 954
    .line 955
    if-nez v5, :cond_1c

    .line 956
    .line 957
    iput-boolean v2, v1, Luq2;->t:Z

    .line 958
    .line 959
    :cond_1c
    iget-object v2, v0, Loc;->c:Ljava/lang/Object;

    .line 960
    .line 961
    check-cast v2, Lqa2;

    .line 962
    .line 963
    invoke-virtual {v2}, Lqa2;->f()Lvq2;

    .line 964
    .line 965
    .line 966
    move-result-object v2

    .line 967
    invoke-virtual {v2}, Lvq2;->q()Z

    .line 968
    .line 969
    .line 970
    move-result v2

    .line 971
    if-eqz v2, :cond_1d

    .line 972
    .line 973
    new-instance v2, Lq50;

    .line 974
    .line 975
    const/4 v5, 0x3

    .line 976
    invoke-direct {v2, v5}, Lq50;-><init>(I)V

    .line 977
    .line 978
    .line 979
    invoke-virtual {v1, v2}, Luq2;->a(Lq50;)V

    .line 980
    .line 981
    .line 982
    goto :goto_c

    .line 983
    :cond_1d
    const-string v2, "ScreenSummaryContext"

    .line 984
    .line 985
    iget-object v5, v1, Luq2;->e:Lf31;

    .line 986
    .line 987
    invoke-virtual {v5, v2}, Lf31;->e(Ljava/lang/String;)V

    .line 988
    .line 989
    .line 990
    :goto_c
    iget-object v2, v0, Loc;->c:Ljava/lang/Object;

    .line 991
    .line 992
    check-cast v2, Lqa2;

    .line 993
    .line 994
    invoke-virtual {v2}, Lqa2;->f()Lvq2;

    .line 995
    .line 996
    .line 997
    move-result-object v2

    .line 998
    invoke-virtual {v2}, Lvq2;->j()Z

    .line 999
    .line 1000
    .line 1001
    move-result v2

    .line 1002
    iget-boolean v5, v1, Luq2;->c:Z

    .line 1003
    .line 1004
    if-nez v5, :cond_1e

    .line 1005
    .line 1006
    iput-boolean v2, v1, Luq2;->r:Z

    .line 1007
    .line 1008
    :cond_1e
    iget-object v2, v0, Loc;->c:Ljava/lang/Object;

    .line 1009
    .line 1010
    check-cast v2, Lqa2;

    .line 1011
    .line 1012
    invoke-virtual {v2}, Lqa2;->f()Lvq2;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v2

    .line 1016
    invoke-virtual {v2}, Lvq2;->i()Z

    .line 1017
    .line 1018
    .line 1019
    move-result v2

    .line 1020
    iget-boolean v5, v1, Luq2;->c:Z

    .line 1021
    .line 1022
    if-nez v5, :cond_1f

    .line 1023
    .line 1024
    iput-boolean v2, v1, Luq2;->s:Z

    .line 1025
    .line 1026
    :cond_1f
    iget-object v2, v0, Loc;->c:Ljava/lang/Object;

    .line 1027
    .line 1028
    check-cast v2, Lqa2;

    .line 1029
    .line 1030
    invoke-virtual {v2}, Lqa2;->f()Lvq2;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v2

    .line 1034
    invoke-virtual {v2}, Lvq2;->g()Z

    .line 1035
    .line 1036
    .line 1037
    move-result v2

    .line 1038
    iget-boolean v5, v1, Luq2;->c:Z

    .line 1039
    .line 1040
    if-nez v5, :cond_20

    .line 1041
    .line 1042
    iput-boolean v2, v1, Luq2;->p:Z

    .line 1043
    .line 1044
    :cond_20
    iget-object v2, v0, Loc;->c:Ljava/lang/Object;

    .line 1045
    .line 1046
    check-cast v2, Lqa2;

    .line 1047
    .line 1048
    invoke-virtual {v2}, Lqa2;->f()Lvq2;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v2

    .line 1052
    invoke-virtual {v2}, Lvq2;->f()Z

    .line 1053
    .line 1054
    .line 1055
    move-result v2

    .line 1056
    iget-boolean v5, v1, Luq2;->c:Z

    .line 1057
    .line 1058
    if-nez v5, :cond_21

    .line 1059
    .line 1060
    iput-boolean v2, v1, Luq2;->q:Z

    .line 1061
    .line 1062
    :cond_21
    iget-object v2, v0, Loc;->c:Ljava/lang/Object;

    .line 1063
    .line 1064
    check-cast v2, Lqa2;

    .line 1065
    .line 1066
    invoke-virtual {v2}, Lqa2;->f()Lvq2;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v2

    .line 1070
    invoke-virtual {v2}, Lvq2;->u()Z

    .line 1071
    .line 1072
    .line 1073
    move-result v2

    .line 1074
    iget-boolean v5, v1, Luq2;->c:Z

    .line 1075
    .line 1076
    if-nez v5, :cond_22

    .line 1077
    .line 1078
    iput-boolean v2, v1, Luq2;->u:Z

    .line 1079
    .line 1080
    goto :goto_d

    .line 1081
    :cond_22
    iget-boolean v6, v1, Luq2;->u:Z

    .line 1082
    .line 1083
    if-eq v6, v2, :cond_23

    .line 1084
    .line 1085
    if-eqz v5, :cond_23

    .line 1086
    .line 1087
    iput-boolean v2, v1, Luq2;->u:Z

    .line 1088
    .line 1089
    iget-object v2, v1, Luq2;->k:Lza2;

    .line 1090
    .line 1091
    if-eqz v2, :cond_23

    .line 1092
    .line 1093
    iget-object v2, v2, Lza2;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1094
    .line 1095
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1096
    .line 1097
    .line 1098
    :cond_23
    :goto_d
    iget-object v2, v0, Loc;->c:Ljava/lang/Object;

    .line 1099
    .line 1100
    check-cast v2, Lqa2;

    .line 1101
    .line 1102
    invoke-virtual {v2}, Lqa2;->f()Lvq2;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v2

    .line 1106
    invoke-virtual {v2}, Lvq2;->t()Ljava/lang/String;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v2

    .line 1110
    iget-boolean v3, v1, Luq2;->c:Z

    .line 1111
    .line 1112
    if-nez v3, :cond_24

    .line 1113
    .line 1114
    iput-object v2, v1, Luq2;->v:Ljava/lang/String;

    .line 1115
    .line 1116
    :cond_24
    iget-object v2, v0, Loc;->c:Ljava/lang/Object;

    .line 1117
    .line 1118
    check-cast v2, Lqa2;

    .line 1119
    .line 1120
    iget-object v2, v2, Lqa2;->o:Liq0;

    .line 1121
    .line 1122
    if-eqz v2, :cond_29

    .line 1123
    .line 1124
    iget-object v2, v2, Liq0;->a:Liq0;

    .line 1125
    .line 1126
    if-eqz v2, :cond_25

    .line 1127
    .line 1128
    new-instance v3, Lur3;

    .line 1129
    .line 1130
    invoke-virtual {v2}, Liq0;->a()I

    .line 1131
    .line 1132
    .line 1133
    move-result v4

    .line 1134
    invoke-virtual {v2}, Liq0;->c()Ljava/lang/String;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v5

    .line 1138
    invoke-virtual {v2}, Liq0;->d()Ljava/lang/String;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v6

    .line 1142
    invoke-virtual {v2}, Liq0;->b()Ljava/lang/String;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v2

    .line 1146
    invoke-direct {v3, v4, v5, v6, v2}, Lur3;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1147
    .line 1148
    .line 1149
    iput-object v3, v1, Luq2;->B:Lur3;

    .line 1150
    .line 1151
    :cond_25
    iget-object v2, v0, Loc;->c:Ljava/lang/Object;

    .line 1152
    .line 1153
    check-cast v2, Lqa2;

    .line 1154
    .line 1155
    invoke-virtual {v2}, Lqa2;->e()Lgb2;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v2

    .line 1159
    invoke-virtual {v2}, Lgb2;->a()Lio2;

    .line 1160
    .line 1161
    .line 1162
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1163
    .line 1164
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1165
    .line 1166
    .line 1167
    iget-boolean v2, v1, Luq2;->c:Z

    .line 1168
    .line 1169
    const-wide/16 v3, 0x708

    .line 1170
    .line 1171
    if-nez v2, :cond_26

    .line 1172
    .line 1173
    iput-wide v3, v1, Luq2;->n:J

    .line 1174
    .line 1175
    :cond_26
    iget-object v2, v0, Loc;->c:Ljava/lang/Object;

    .line 1176
    .line 1177
    check-cast v2, Lqa2;

    .line 1178
    .line 1179
    invoke-virtual {v2}, Lqa2;->e()Lgb2;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v2

    .line 1183
    invoke-virtual {v2}, Lgb2;->b()Lio2;

    .line 1184
    .line 1185
    .line 1186
    iget-boolean v2, v1, Luq2;->c:Z

    .line 1187
    .line 1188
    if-nez v2, :cond_27

    .line 1189
    .line 1190
    iput-wide v3, v1, Luq2;->m:J

    .line 1191
    .line 1192
    :cond_27
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 1193
    .line 1194
    check-cast v0, Lqa2;

    .line 1195
    .line 1196
    iget-object v0, v0, Lqa2;->p:Ljava/util/ArrayList;

    .line 1197
    .line 1198
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0

    .line 1202
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1203
    .line 1204
    .line 1205
    move-result v1

    .line 1206
    if-nez v1, :cond_28

    .line 1207
    .line 1208
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1209
    .line 1210
    return-object v0

    .line 1211
    :cond_28
    invoke-static {v0}, Lfm0;->f(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v0

    .line 1215
    throw v0

    .line 1216
    :cond_29
    const-string v0, "gdprConfiguration"

    .line 1217
    .line 1218
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 1219
    .line 1220
    .line 1221
    throw v4

    .line 1222
    :goto_e
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1223
    throw v0

    .line 1224
    :cond_2a
    throw v4

    .line 1225
    :pswitch_d
    move-object/from16 v1, p1

    .line 1226
    .line 1227
    check-cast v1, Ljava/lang/Throwable;

    .line 1228
    .line 1229
    iget-object v1, v0, Loc;->b:Ljava/lang/Object;

    .line 1230
    .line 1231
    check-cast v1, Ler0;

    .line 1232
    .line 1233
    iget-object v1, v1, Ler0;->b:Ljava/lang/Object;

    .line 1234
    .line 1235
    check-cast v1, Lf8;

    .line 1236
    .line 1237
    invoke-virtual {v1}, Lf8;->invoke()Ljava/lang/Object;

    .line 1238
    .line 1239
    .line 1240
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 1241
    .line 1242
    check-cast v0, Ler;

    .line 1243
    .line 1244
    new-instance v1, Llp;

    .line 1245
    .line 1246
    invoke-direct {v1}, Llp;-><init>()V

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual {v0, v1}, Ler;->H(Ljava/lang/Throwable;)Lr4;

    .line 1250
    .line 1251
    .line 1252
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1253
    .line 1254
    return-object v0

    .line 1255
    :pswitch_e
    move-object/from16 v1, p1

    .line 1256
    .line 1257
    check-cast v1, Ljava/lang/Throwable;

    .line 1258
    .line 1259
    iget-object v1, v0, Loc;->b:Ljava/lang/Object;

    .line 1260
    .line 1261
    check-cast v1, Lkt0;

    .line 1262
    .line 1263
    iget-object v1, v1, Lkt0;->c:Landroid/os/Handler;

    .line 1264
    .line 1265
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 1266
    .line 1267
    check-cast v0, Lcp0;

    .line 1268
    .line 1269
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1270
    .line 1271
    .line 1272
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1273
    .line 1274
    return-object v0

    .line 1275
    :pswitch_f
    move-object/from16 v1, p1

    .line 1276
    .line 1277
    check-cast v1, Ljava/lang/Throwable;

    .line 1278
    .line 1279
    iget-object v2, v0, Loc;->b:Ljava/lang/Object;

    .line 1280
    .line 1281
    check-cast v2, Lum;

    .line 1282
    .line 1283
    if-eqz v1, :cond_2c

    .line 1284
    .line 1285
    instance-of v0, v1, Ljava/util/concurrent/CancellationException;

    .line 1286
    .line 1287
    if-eqz v0, :cond_2b

    .line 1288
    .line 1289
    iput-boolean v3, v2, Lum;->d:Z

    .line 1290
    .line 1291
    iget-object v0, v2, Lum;->b:Lxm;

    .line 1292
    .line 1293
    if-eqz v0, :cond_2d

    .line 1294
    .line 1295
    iget-object v0, v0, Lxm;->b:Lwm;

    .line 1296
    .line 1297
    invoke-virtual {v0, v3}, Ll0;->cancel(Z)Z

    .line 1298
    .line 1299
    .line 1300
    move-result v0

    .line 1301
    if-eqz v0, :cond_2d

    .line 1302
    .line 1303
    iput-object v4, v2, Lum;->a:Ljava/lang/Object;

    .line 1304
    .line 1305
    iput-object v4, v2, Lum;->b:Lxm;

    .line 1306
    .line 1307
    iput-object v4, v2, Lum;->c:Lu32;

    .line 1308
    .line 1309
    goto :goto_f

    .line 1310
    :cond_2b
    invoke-virtual {v2, v1}, Lum;->b(Ljava/lang/Throwable;)Z

    .line 1311
    .line 1312
    .line 1313
    goto :goto_f

    .line 1314
    :cond_2c
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 1315
    .line 1316
    check-cast v0, Lf70;

    .line 1317
    .line 1318
    invoke-virtual {v0}, Lz01;->r()Ljava/lang/Object;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v0

    .line 1322
    invoke-virtual {v2, v0}, Lum;->a(Ljava/lang/Object;)Z

    .line 1323
    .line 1324
    .line 1325
    :cond_2d
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1326
    .line 1327
    return-object v0

    .line 1328
    :pswitch_10
    move-object/from16 v1, p1

    .line 1329
    .line 1330
    check-cast v1, Ljava/lang/Throwable;

    .line 1331
    .line 1332
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1333
    .line 1334
    .line 1335
    iget-object v1, v0, Loc;->b:Ljava/lang/Object;

    .line 1336
    .line 1337
    check-cast v1, Lj10;

    .line 1338
    .line 1339
    iget-object v1, v1, Lj10;->a:Lx80;

    .line 1340
    .line 1341
    new-instance v2, Lf8;

    .line 1342
    .line 1343
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 1344
    .line 1345
    check-cast v0, Lf8;

    .line 1346
    .line 1347
    invoke-direct {v2, v0, v3}, Lf8;-><init>(Ljava/lang/Object;I)V

    .line 1348
    .line 1349
    .line 1350
    invoke-virtual {v1, v2}, Lx80;->c(Lkotlin/jvm/functions/Function0;)V

    .line 1351
    .line 1352
    .line 1353
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1354
    .line 1355
    return-object v0

    .line 1356
    :pswitch_11
    move-object/from16 v1, p1

    .line 1357
    .line 1358
    check-cast v1, Ljava/util/List;

    .line 1359
    .line 1360
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1361
    .line 1362
    .line 1363
    iget-object v2, v0, Loc;->b:Ljava/lang/Object;

    .line 1364
    .line 1365
    check-cast v2, Lj10;

    .line 1366
    .line 1367
    iget-object v2, v2, Lj10;->a:Lx80;

    .line 1368
    .line 1369
    new-instance v4, Llz;

    .line 1370
    .line 1371
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 1372
    .line 1373
    check-cast v0, Lo;

    .line 1374
    .line 1375
    invoke-direct {v4, v3, v0, v1}, Llz;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {v2, v4}, Lx80;->c(Lkotlin/jvm/functions/Function0;)V

    .line 1379
    .line 1380
    .line 1381
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1382
    .line 1383
    return-object v0

    .line 1384
    :pswitch_12
    move-object/from16 v1, p1

    .line 1385
    .line 1386
    check-cast v1, Ljava/lang/Throwable;

    .line 1387
    .line 1388
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1389
    .line 1390
    .line 1391
    iget-object v3, v0, Loc;->b:Ljava/lang/Object;

    .line 1392
    .line 1393
    check-cast v3, Lmz;

    .line 1394
    .line 1395
    iget-object v5, v3, Lmz;->b:Li03;

    .line 1396
    .line 1397
    const-string v6, "Failed while trying to save consents"

    .line 1398
    .line 1399
    invoke-interface {v5, v6, v1}, Li03;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1400
    .line 1401
    .line 1402
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 1403
    .line 1404
    check-cast v0, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;

    .line 1405
    .line 1406
    iget-object v1, v3, Lmz;->a:Lx80;

    .line 1407
    .line 1408
    new-instance v5, Lkz;

    .line 1409
    .line 1410
    invoke-direct {v5, v3, v0, v4, v2}, Lkz;-><init>(Lmz;Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;Lc10;I)V

    .line 1411
    .line 1412
    .line 1413
    invoke-virtual {v1, v5}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 1414
    .line 1415
    .line 1416
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1417
    .line 1418
    return-object v0

    .line 1419
    :pswitch_13
    move-object/from16 v1, p1

    .line 1420
    .line 1421
    check-cast v1, Loy0;

    .line 1422
    .line 1423
    iget-object v2, v0, Loc;->b:Ljava/lang/Object;

    .line 1424
    .line 1425
    check-cast v2, Lpc;

    .line 1426
    .line 1427
    if-eqz v1, :cond_2e

    .line 1428
    .line 1429
    iget-object v3, v2, Lk;->a:Ljava/util/ArrayList;

    .line 1430
    .line 1431
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1432
    .line 1433
    .line 1434
    :cond_2e
    new-instance v1, Ljava/util/HashMap;

    .line 1435
    .line 1436
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 1437
    .line 1438
    .line 1439
    const-string v3, "event"

    .line 1440
    .line 1441
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1442
    .line 1443
    .line 1444
    const-string v2, "SnowplowInstallTracking"

    .line 1445
    .line 1446
    invoke-static {v2, v1}, Lxn1;->b(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 1447
    .line 1448
    .line 1449
    iget-object v0, v0, Loc;->c:Ljava/lang/Object;

    .line 1450
    .line 1451
    check-cast v0, Landroid/content/Context;

    .line 1452
    .line 1453
    invoke-static {v0}, Li13;->r(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v0

    .line 1457
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v0

    .line 1461
    if-eqz v0, :cond_2f

    .line 1462
    .line 1463
    const-string v1, "installed_before"

    .line 1464
    .line 1465
    const-string v2, "YES"

    .line 1466
    .line 1467
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1468
    .line 1469
    .line 1470
    :cond_2f
    if-eqz v0, :cond_30

    .line 1471
    .line 1472
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1473
    .line 1474
    .line 1475
    :cond_30
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1476
    .line 1477
    return-object v0

    .line 1478
    nop

    .line 1479
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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

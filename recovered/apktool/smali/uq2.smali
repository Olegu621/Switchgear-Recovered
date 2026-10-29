.class public final Luq2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public A:Z

.field public B:Lur3;

.field public final C:Ltq2;

.field public final D:Ltq2;

.field public final E:Ltq2;

.field public final F:Ltq2;

.field public final G:Ltq2;

.field public H:I

.field public I:I

.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Landroid/content/Context;

.field public final e:Lf31;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final h:Lgs1;

.field public final i:Ljc0;

.field public j:Ld31;

.field public k:Lza2;

.field public l:Z

.field public m:J

.field public n:J

.field public final o:Ljava/util/concurrent/TimeUnit;

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Ljava/lang/String;

.field public final w:[Ljava/lang/Runnable;

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Ljc0;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lns1;Landroid/content/Context;Loc;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p6

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    move-object/from16 v8, p2

    .line 14
    .line 15
    iput-object v8, v0, Luq2;->a:Ljava/lang/String;

    .line 16
    .line 17
    move-object/from16 v3, p3

    .line 18
    .line 19
    iput-object v3, v0, Luq2;->b:Ljava/lang/String;

    .line 20
    .line 21
    new-instance v3, Lf31;

    .line 22
    .line 23
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v4, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v4, v3, Lf31;->a:Ljava/lang/Object;

    .line 32
    .line 33
    new-instance v4, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v4, v3, Lf31;->b:Ljava/lang/Object;

    .line 39
    .line 40
    new-instance v4, Ljava/util/HashMap;

    .line 41
    .line 42
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v4, v3, Lf31;->c:Ljava/lang/Object;

    .line 46
    .line 47
    new-instance v4, Ljava/util/HashMap;

    .line 48
    .line 49
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v4, v3, Lf31;->d:Ljava/lang/Object;

    .line 53
    .line 54
    new-instance v4, Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v4, v3, Lf31;->e:Ljava/lang/Object;

    .line 60
    .line 61
    new-instance v4, Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v4, v3, Lf31;->f:Ljava/lang/Object;

    .line 67
    .line 68
    new-instance v4, Ljava/util/HashMap;

    .line 69
    .line 70
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object v4, v3, Lf31;->g:Ljava/lang/Object;

    .line 74
    .line 75
    new-instance v4, Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object v4, v3, Lf31;->h:Ljava/lang/Object;

    .line 81
    .line 82
    new-instance v4, Lfs0;

    .line 83
    .line 84
    const/16 v5, 0x12

    .line 85
    .line 86
    invoke-direct {v4, v5}, Lfs0;-><init>(I)V

    .line 87
    .line 88
    .line 89
    iput-object v4, v3, Lf31;->i:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v3, v0, Luq2;->e:Lf31;

    .line 92
    .line 93
    const-string v3, "andr-6.0.6"

    .line 94
    .line 95
    iput-object v3, v0, Luq2;->f:Ljava/lang/String;

    .line 96
    .line 97
    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 98
    .line 99
    const/4 v10, 0x1

    .line 100
    invoke-direct {v3, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 101
    .line 102
    .line 103
    iput-object v3, v0, Luq2;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 104
    .line 105
    new-instance v3, Lgs1;

    .line 106
    .line 107
    if-nez p5, :cond_0

    .line 108
    .line 109
    new-instance v4, Lns1;

    .line 110
    .line 111
    invoke-direct {v4}, Lns1;-><init>()V

    .line 112
    .line 113
    .line 114
    :goto_0
    move-object/from16 v5, p4

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_0
    move-object/from16 v4, p5

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :goto_1
    invoke-direct {v3, v5, v4, v2}, Lgs1;-><init>(Ljava/util/List;Lns1;Landroid/content/Context;)V

    .line 121
    .line 122
    .line 123
    iput-object v3, v0, Luq2;->h:Lgs1;

    .line 124
    .line 125
    iput-object v1, v0, Luq2;->i:Ljc0;

    .line 126
    .line 127
    iput-boolean v10, v0, Luq2;->l:Z

    .line 128
    .line 129
    const/4 v11, 0x2

    .line 130
    iput v11, v0, Luq2;->H:I

    .line 131
    .line 132
    iput v10, v0, Luq2;->I:I

    .line 133
    .line 134
    const-wide/16 v3, 0x708

    .line 135
    .line 136
    iput-wide v3, v0, Luq2;->m:J

    .line 137
    .line 138
    iput-wide v3, v0, Luq2;->n:J

    .line 139
    .line 140
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 141
    .line 142
    iput-object v7, v0, Luq2;->o:Ljava/util/concurrent/TimeUnit;

    .line 143
    .line 144
    iput-boolean v10, v0, Luq2;->p:Z

    .line 145
    .line 146
    const/4 v12, 0x0

    .line 147
    iput-boolean v12, v0, Luq2;->q:Z

    .line 148
    .line 149
    iput-boolean v10, v0, Luq2;->r:Z

    .line 150
    .line 151
    iput-boolean v10, v0, Luq2;->s:Z

    .line 152
    .line 153
    iput-boolean v10, v0, Luq2;->t:Z

    .line 154
    .line 155
    iput-boolean v12, v0, Luq2;->u:Z

    .line 156
    .line 157
    const/4 v13, 0x0

    .line 158
    filled-new-array {v13, v13, v13, v13}, [Ljava/lang/Runnable;

    .line 159
    .line 160
    .line 161
    move-result-object v9

    .line 162
    iput-object v9, v0, Luq2;->w:[Ljava/lang/Runnable;

    .line 163
    .line 164
    iput-boolean v10, v0, Luq2;->x:Z

    .line 165
    .line 166
    iput-boolean v12, v0, Luq2;->y:Z

    .line 167
    .line 168
    iput-boolean v10, v0, Luq2;->z:Z

    .line 169
    .line 170
    iput-boolean v10, v0, Luq2;->A:Z

    .line 171
    .line 172
    new-instance v14, Ltq2;

    .line 173
    .line 174
    const/4 v15, 0x3

    .line 175
    invoke-direct {v14, v0, v15}, Ltq2;-><init>(Luq2;I)V

    .line 176
    .line 177
    .line 178
    iput-object v14, v0, Luq2;->C:Ltq2;

    .line 179
    .line 180
    new-instance v3, Ltq2;

    .line 181
    .line 182
    const/4 v4, 0x4

    .line 183
    invoke-direct {v3, v0, v4}, Ltq2;-><init>(Luq2;I)V

    .line 184
    .line 185
    .line 186
    iput-object v3, v0, Luq2;->D:Ltq2;

    .line 187
    .line 188
    new-instance v4, Ltq2;

    .line 189
    .line 190
    invoke-direct {v4, v0, v11}, Ltq2;-><init>(Luq2;I)V

    .line 191
    .line 192
    .line 193
    iput-object v4, v0, Luq2;->E:Ltq2;

    .line 194
    .line 195
    new-instance v5, Ltq2;

    .line 196
    .line 197
    invoke-direct {v5, v0, v10}, Ltq2;-><init>(Luq2;I)V

    .line 198
    .line 199
    .line 200
    iput-object v5, v0, Luq2;->F:Ltq2;

    .line 201
    .line 202
    new-instance v6, Ltq2;

    .line 203
    .line 204
    invoke-direct {v6, v0, v12}, Ltq2;-><init>(Luq2;I)V

    .line 205
    .line 206
    .line 207
    iput-object v6, v0, Luq2;->G:Ltq2;

    .line 208
    .line 209
    iput-object v2, v0, Luq2;->d:Landroid/content/Context;

    .line 210
    .line 211
    move-object/from16 p3, v13

    .line 212
    .line 213
    move-object/from16 v13, p7

    .line 214
    .line 215
    invoke-virtual {v13, v0}, Loc;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    iget-object v13, v1, Ljc0;->a:Ljava/lang/String;

    .line 219
    .line 220
    new-instance v15, Ls2;

    .line 221
    .line 222
    const/16 v11, 0x13

    .line 223
    .line 224
    invoke-direct {v15, v1, v11}, Ls2;-><init>(Ljava/lang/Object;I)V

    .line 225
    .line 226
    .line 227
    invoke-static {v13, v12, v15}, Lmf0;->a(Ljava/lang/String;ZLjava/lang/Runnable;)V

    .line 228
    .line 229
    .line 230
    iget-object v1, v0, Luq2;->v:Ljava/lang/String;

    .line 231
    .line 232
    if-eqz v1, :cond_1

    .line 233
    .line 234
    new-instance v11, Lkotlin/text/Regex;

    .line 235
    .line 236
    const-string v13, "[^A-Za-z0-9.-]"

    .line 237
    .line 238
    invoke-direct {v11, v13}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    const-string v13, ""

    .line 242
    .line 243
    invoke-virtual {v11, v1, v13}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 248
    .line 249
    .line 250
    move-result v11

    .line 251
    if-lez v11, :cond_1

    .line 252
    .line 253
    new-instance v11, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 256
    .line 257
    .line 258
    iget-object v13, v0, Luq2;->f:Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    const/16 v13, 0x20

    .line 264
    .line 265
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    iget-boolean v11, v0, Luq2;->c:Z

    .line 276
    .line 277
    if-nez v11, :cond_1

    .line 278
    .line 279
    iput-object v1, v0, Luq2;->f:Ljava/lang/String;

    .line 280
    .line 281
    :cond_1
    iget-boolean v1, v0, Luq2;->q:Z

    .line 282
    .line 283
    if-eqz v1, :cond_2

    .line 284
    .line 285
    iget v1, v0, Luq2;->I:I

    .line 286
    .line 287
    if-ne v1, v10, :cond_2

    .line 288
    .line 289
    iget-boolean v1, v0, Luq2;->c:Z

    .line 290
    .line 291
    if-nez v1, :cond_2

    .line 292
    .line 293
    const/4 v1, 0x2

    .line 294
    iput v1, v0, Luq2;->I:I

    .line 295
    .line 296
    :cond_2
    iget v1, v0, Luq2;->I:I

    .line 297
    .line 298
    sget v11, Lk50;->b:I

    .line 299
    .line 300
    if-eqz v1, :cond_d

    .line 301
    .line 302
    invoke-static {v1}, Len;->y(I)I

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    sput v1, Lk50;->b:I

    .line 307
    .line 308
    iget-boolean v1, v0, Luq2;->x:Z

    .line 309
    .line 310
    if-eqz v1, :cond_3

    .line 311
    .line 312
    sget-object v1, Lza2;->r:Lp62;

    .line 313
    .line 314
    move-object v11, v3

    .line 315
    move-object v13, v4

    .line 316
    iget-wide v3, v0, Luq2;->m:J

    .line 317
    .line 318
    move-object v15, v5

    .line 319
    move-object/from16 v16, v6

    .line 320
    .line 321
    iget-wide v5, v0, Luq2;->n:J

    .line 322
    .line 323
    move-object/from16 v12, v16

    .line 324
    .line 325
    invoke-virtual/range {v1 .. v9}, Lp62;->e(Landroid/content/Context;JJLjava/util/concurrent/TimeUnit;Ljava/lang/String;[Ljava/lang/Runnable;)Lza2;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    iput-object v1, v0, Luq2;->k:Lza2;

    .line 330
    .line 331
    goto :goto_2

    .line 332
    :cond_3
    move-object v11, v3

    .line 333
    move-object v13, v4

    .line 334
    move-object v15, v5

    .line 335
    move-object v12, v6

    .line 336
    :goto_2
    const-string v1, "SnowplowTrackerDiagnostic"

    .line 337
    .line 338
    invoke-static {v1, v15}, Lxn1;->a(Ljava/lang/String;Ltq2;)V

    .line 339
    .line 340
    .line 341
    const-string v1, "SnowplowScreenView"

    .line 342
    .line 343
    invoke-static {v1, v11}, Lxn1;->a(Ljava/lang/String;Ltq2;)V

    .line 344
    .line 345
    .line 346
    const-string v1, "SnowplowLifecycleTracking"

    .line 347
    .line 348
    invoke-static {v1, v14}, Lxn1;->a(Ljava/lang/String;Ltq2;)V

    .line 349
    .line 350
    .line 351
    const-string v1, "SnowplowInstallTracking"

    .line 352
    .line 353
    invoke-static {v1, v13}, Lxn1;->a(Ljava/lang/String;Ltq2;)V

    .line 354
    .line 355
    .line 356
    const-string v1, "SnowplowCrashReporting"

    .line 357
    .line 358
    invoke-static {v1, v12}, Lxn1;->a(Ljava/lang/String;Ltq2;)V

    .line 359
    .line 360
    .line 361
    iget-boolean v1, v0, Luq2;->p:Z

    .line 362
    .line 363
    if-eqz v1, :cond_4

    .line 364
    .line 365
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    instance-of v1, v1, Lif0;

    .line 370
    .line 371
    if-nez v1, :cond_4

    .line 372
    .line 373
    new-instance v1, Lif0;

    .line 374
    .line 375
    invoke-direct {v1}, Lif0;-><init>()V

    .line 376
    .line 377
    .line 378
    invoke-static {v1}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 379
    .line 380
    .line 381
    :cond_4
    iget-boolean v1, v0, Luq2;->s:Z

    .line 382
    .line 383
    if-eqz v1, :cond_5

    .line 384
    .line 385
    const-string v1, "pc"

    .line 386
    .line 387
    new-instance v3, Lea;

    .line 388
    .line 389
    invoke-direct {v3, v2, v10}, Lea;-><init>(Landroid/content/Context;I)V

    .line 390
    .line 391
    .line 392
    const/4 v4, 0x0

    .line 393
    invoke-static {v1, v4, v3}, Lmf0;->a(Ljava/lang/String;ZLjava/lang/Runnable;)V

    .line 394
    .line 395
    .line 396
    :cond_5
    iget-boolean v1, v0, Luq2;->t:Z

    .line 397
    .line 398
    if-eqz v1, :cond_9

    .line 399
    .line 400
    sget-object v1, Ly2;->a:Lxt0;

    .line 401
    .line 402
    monitor-enter v1

    .line 403
    :try_start_0
    sget-object v3, Ly2;->b:Ly2;

    .line 404
    .line 405
    if-nez v3, :cond_8

    .line 406
    .line 407
    new-instance v3, Ly2;

    .line 408
    .line 409
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    instance-of v5, v4, Landroid/app/Application;

    .line 417
    .line 418
    if-eqz v5, :cond_6

    .line 419
    .line 420
    move-object v13, v4

    .line 421
    check-cast v13, Landroid/app/Application;

    .line 422
    .line 423
    goto :goto_3

    .line 424
    :cond_6
    move-object/from16 v13, p3

    .line 425
    .line 426
    :goto_3
    if-eqz v13, :cond_7

    .line 427
    .line 428
    invoke-virtual {v13, v3}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 429
    .line 430
    .line 431
    :cond_7
    sput-object v3, Ly2;->b:Ly2;

    .line 432
    .line 433
    goto :goto_4

    .line 434
    :catchall_0
    move-exception v0

    .line 435
    goto :goto_5

    .line 436
    :cond_8
    :goto_4
    sget-object v3, Ly2;->b:Ly2;

    .line 437
    .line 438
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 439
    .line 440
    .line 441
    monitor-exit v1

    .line 442
    goto :goto_6

    .line 443
    :goto_5
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 444
    throw v0

    .line 445
    :cond_9
    :goto_6
    iget-boolean v1, v0, Luq2;->r:Z

    .line 446
    .line 447
    if-eqz v1, :cond_b

    .line 448
    .line 449
    sget-object v1, Lvx1;->a:Lec0;

    .line 450
    .line 451
    monitor-enter v1

    .line 452
    :try_start_2
    sget v3, Lvx1;->b:I

    .line 453
    .line 454
    if-ne v3, v10, :cond_a

    .line 455
    .line 456
    const/4 v3, 0x2

    .line 457
    sput v3, Lvx1;->b:I

    .line 458
    .line 459
    new-instance v3, Landroid/os/Handler;

    .line 460
    .line 461
    invoke-virtual {v2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    invoke-direct {v3, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 466
    .line 467
    .line 468
    new-instance v2, Lh7;

    .line 469
    .line 470
    const/4 v4, 0x3

    .line 471
    invoke-direct {v2, v4}, Lh7;-><init>(I)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v3, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 475
    .line 476
    .line 477
    goto :goto_7

    .line 478
    :catchall_1
    move-exception v0

    .line 479
    goto :goto_8

    .line 480
    :cond_a
    :goto_7
    monitor-exit v1

    .line 481
    new-instance v1, Lq50;

    .line 482
    .line 483
    invoke-direct {v1, v10}, Lq50;-><init>(I)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v0, v1}, Luq2;->a(Lq50;)V

    .line 487
    .line 488
    .line 489
    goto :goto_9

    .line 490
    :goto_8
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 491
    throw v0

    .line 492
    :cond_b
    :goto_9
    iget-object v1, v0, Luq2;->k:Lza2;

    .line 493
    .line 494
    if-eqz v1, :cond_c

    .line 495
    .line 496
    const/4 v4, 0x0

    .line 497
    invoke-virtual {v1, v4}, Lza2;->c(Z)V

    .line 498
    .line 499
    .line 500
    const-string v1, "uq2"

    .line 501
    .line 502
    const-string v2, "Session checking has been resumed."

    .line 503
    .line 504
    new-array v3, v4, [Ljava/lang/Object;

    .line 505
    .line 506
    invoke-static {v1, v2, v3}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 507
    .line 508
    .line 509
    goto :goto_a

    .line 510
    :cond_c
    const/4 v4, 0x0

    .line 511
    :goto_a
    iput-boolean v10, v0, Luq2;->c:Z

    .line 512
    .line 513
    const-string v0, "uq2"

    .line 514
    .line 515
    const-string v1, "Tracker created successfully."

    .line 516
    .line 517
    new-array v2, v4, [Ljava/lang/Object;

    .line 518
    .line 519
    invoke-static {v0, v1, v2}, Lk50;->L(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    return-void

    .line 523
    :cond_d
    throw p3
.end method


# virtual methods
.method public final a(Lq50;)V
    .locals 2

    .line 1
    iget-object p0, p0, Luq2;->e:Lf31;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v0, p0, Lf31;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {p1}, Lq50;->b()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lq50;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    monitor-exit p0

    .line 35
    return-void

    .line 36
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Lq50;->b()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p0, v0}, Lf31;->e(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    iget-object v0, p0, Lf31;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Ljava/util/HashMap;

    .line 49
    .line 50
    invoke-virtual {p1}, Lq50;->b()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lf31;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Ljava/util/HashMap;

    .line 60
    .line 61
    invoke-virtual {p1}, Lq50;->b()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lf31;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ljava/util/HashMap;

    .line 71
    .line 72
    invoke-virtual {p1}, Lq50;->h()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v0, v1, p1}, Lf31;->a(Ljava/util/Map;Ljava/util/List;Lq50;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lf31;->d:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Ljava/util/HashMap;

    .line 82
    .line 83
    invoke-virtual {p1}, Lq50;->d()Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-static {v0, v1, p1}, Lf31;->a(Ljava/util/Map;Ljava/util/List;Lq50;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lf31;->e:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Ljava/util/HashMap;

    .line 93
    .line 94
    invoke-virtual {p1}, Lq50;->g()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {v0, v1, p1}, Lf31;->a(Ljava/util/Map;Ljava/util/List;Lq50;)V

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, Lf31;->f:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Ljava/util/HashMap;

    .line 104
    .line 105
    invoke-virtual {p1}, Lq50;->c()Lnd0;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-static {v0, v1, p1}, Lf31;->a(Ljava/util/Map;Ljava/util/List;Lq50;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lf31;->g:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, Ljava/util/HashMap;

    .line 115
    .line 116
    invoke-virtual {p1}, Lq50;->f()Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-static {v0, v1, p1}, Lf31;->a(Ljava/util/Map;Ljava/util/List;Lq50;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Lf31;->h:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, Ljava/util/HashMap;

    .line 126
    .line 127
    invoke-virtual {p1}, Lq50;->e()Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-static {v0, v1, p1}, Lf31;->a(Ljava/util/Map;Ljava/util/List;Lq50;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 132
    .line 133
    .line 134
    monitor-exit p0

    .line 135
    return-void

    .line 136
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 137
    throw p1
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object p0, p0, Luq2;->k:Lza2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, v0}, Lza2;->c(Z)V

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    new-array p0, p0, [Ljava/lang/Object;

    .line 11
    .line 12
    const-string v0, "uq2"

    .line 13
    .line 14
    const-string v1, "Session checking has been paused."

    .line 15
    .line 16
    invoke-static {v0, v1, p0}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final c(Lk;)Ljava/util/UUID;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Luq2;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    iget-object v0, p0, Luq2;->e:Lf31;

    .line 15
    .line 16
    monitor-enter v0

    .line 17
    :try_start_0
    new-instance v2, Ljava/util/LinkedList;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 20
    .line 21
    .line 22
    instance-of v3, p1, Lm0;

    .line 23
    .line 24
    if-eqz v3, :cond_4

    .line 25
    .line 26
    new-instance v3, Ljava/util/LinkedList;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 29
    .line 30
    .line 31
    iget-object v4, v0, Lf31;->h:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v4, Ljava/util/HashMap;

    .line 34
    .line 35
    move-object v5, p1

    .line 36
    check-cast v5, Lm0;

    .line 37
    .line 38
    invoke-virtual {v5}, Lm0;->d()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Ljava/util/List;

    .line 47
    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    invoke-virtual {v3, v4}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    goto/16 :goto_7

    .line 56
    .line 57
    :cond_1
    :goto_0
    iget-object v4, v0, Lf31;->h:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v4, Ljava/util/HashMap;

    .line 60
    .line 61
    const-string v5, "*"

    .line 62
    .line 63
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Ljava/util/List;

    .line 68
    .line 69
    if-eqz v4, :cond_2

    .line 70
    .line 71
    invoke-virtual {v3, v4}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_4

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Lq50;

    .line 89
    .line 90
    iget-object v5, v0, Lf31;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v5, Ljava/util/HashMap;

    .line 93
    .line 94
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Ljava/lang/String;

    .line 99
    .line 100
    if-eqz v5, :cond_3

    .line 101
    .line 102
    iget v4, v4, Lq50;->a:I

    .line 103
    .line 104
    packed-switch v4, :pswitch_data_0

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    new-instance v4, Lr72;

    .line 111
    .line 112
    invoke-direct {v4}, Lk;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-static {v4}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    goto :goto_3

    .line 120
    :goto_2
    move-object v4, v1

    .line 121
    goto :goto_3

    .line 122
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :goto_3
    if-eqz v4, :cond_3

    .line 127
    .line 128
    invoke-virtual {v2, v4}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_4
    monitor-exit v0

    .line 133
    invoke-static {p1}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->B(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_5

    .line 150
    .line 151
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    check-cast v2, Lk;

    .line 156
    .line 157
    invoke-virtual {v2, p0}, Lk;->b(Luq2;)V

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_5
    new-instance v1, Lh22;

    .line 162
    .line 163
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 164
    .line 165
    .line 166
    monitor-enter p0

    .line 167
    :try_start_1
    new-instance v2, Ljava/util/ArrayList;

    .line 168
    .line 169
    const/16 v3, 0xa

    .line 170
    .line 171
    invoke-static {v0, v3}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-eqz v3, :cond_6

    .line 187
    .line 188
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    check-cast v3, Lk;

    .line 193
    .line 194
    iget-object v4, p0, Luq2;->e:Lf31;

    .line 195
    .line 196
    invoke-virtual {v4, v3}, Lf31;->f(Lk;)Lfs0;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    new-instance v5, Lyq2;

    .line 201
    .line 202
    invoke-direct {v5, v3, v4}, Lyq2;-><init>(Lk;Lfs0;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, v5}, Luq2;->d(Lyq2;)V

    .line 206
    .line 207
    .line 208
    new-instance v4, Lkotlin/Pair;

    .line 209
    .line 210
    invoke-direct {v4, v3, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    goto :goto_5

    .line 217
    :catchall_1
    move-exception p1

    .line 218
    goto :goto_6

    .line 219
    :cond_6
    iput-object v2, v1, Lh22;->a:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 220
    .line 221
    monitor-exit p0

    .line 222
    instance-of p1, p1, Lxq2;

    .line 223
    .line 224
    xor-int/lit8 p1, p1, 0x1

    .line 225
    .line 226
    const-string v0, "uq2"

    .line 227
    .line 228
    new-instance v2, Lji1;

    .line 229
    .line 230
    const/16 v3, 0xf

    .line 231
    .line 232
    invoke-direct {v2, v3, v1, p0}, Lji1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v0, p1, v2}, Lmf0;->a(Ljava/lang/String;ZLjava/lang/Runnable;)V

    .line 236
    .line 237
    .line 238
    iget-object p0, v1, Lh22;->a:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast p0, Ljava/util/List;

    .line 241
    .line 242
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->y(Ljava/util/List;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    check-cast p0, Lkotlin/Pair;

    .line 247
    .line 248
    iget-object p0, p0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast p0, Lyq2;

    .line 251
    .line 252
    iget-object p0, p0, Lyq2;->f:Ljava/util/UUID;

    .line 253
    .line 254
    return-object p0

    .line 255
    :goto_6
    monitor-exit p0

    .line 256
    throw p1

    .line 257
    :goto_7
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 258
    throw p0

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Lyq2;)V
    .locals 12

    .line 1
    iget-boolean v0, p1, Lyq2;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_9

    .line 4
    .line 5
    iget-boolean v0, p0, Luq2;->x:Z

    .line 6
    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    iget-object v0, p1, Lyq2;->f:Ljava/util/UUID;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-wide v1, p1, Lyq2;->g:J

    .line 19
    .line 20
    iget-object v3, p0, Luq2;->k:Lza2;

    .line 21
    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    const-string p0, "uq2"

    .line 25
    .line 26
    const-string p1, "Session not ready or method getHasLoadedFromFile returned false with eventId: %s"

    .line 27
    .line 28
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {p0, p1, v0}, Lk50;->K(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    iget-boolean p0, p0, Luq2;->u:Z

    .line 37
    .line 38
    monitor-enter v3

    .line 39
    :try_start_0
    const-string v4, "za2"

    .line 40
    .line 41
    const-string v5, "Getting session context..."

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    new-array v7, v6, [Ljava/lang/Object;

    .line 45
    .line 46
    invoke-static {v4, v5, v7}, Lk50;->L(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-boolean v4, v3, Lza2;->i:Z

    .line 50
    .line 51
    if-eqz v4, :cond_6

    .line 52
    .line 53
    iget-object v4, v3, Lza2;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 63
    .line 64
    .line 65
    move-result-wide v4

    .line 66
    iget-object v7, v3, Lza2;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 67
    .line 68
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-eqz v7, :cond_2

    .line 73
    .line 74
    iget-wide v7, v3, Lza2;->k:J

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    iget-wide v7, v3, Lza2;->j:J

    .line 78
    .line 79
    :goto_0
    iget-wide v9, v3, Lza2;->g:J

    .line 80
    .line 81
    cmp-long v11, v4, v9

    .line 82
    .line 83
    if-ltz v11, :cond_3

    .line 84
    .line 85
    sub-long/2addr v4, v9

    .line 86
    cmp-long v4, v4, v7

    .line 87
    .line 88
    if-lez v4, :cond_5

    .line 89
    .line 90
    :cond_3
    :goto_1
    const-string v4, "za2"

    .line 91
    .line 92
    const-string v5, "Update session information."

    .line 93
    .line 94
    new-array v7, v6, [Ljava/lang/Object;

    .line 95
    .line 96
    invoke-static {v4, v5, v7}, Lk50;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v0, v1, v2}, Lza2;->d(Ljava/lang/String;J)V

    .line 100
    .line 101
    .line 102
    iget-object v0, v3, Lza2;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    iget-object v0, v3, Lza2;->o:Ljava/lang/Runnable;

    .line 111
    .line 112
    invoke-static {v0}, Lza2;->a(Ljava/lang/Runnable;)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :catchall_0
    move-exception p0

    .line 117
    goto :goto_4

    .line 118
    :cond_4
    iget-object v0, v3, Lza2;->n:Ljava/lang/Runnable;

    .line 119
    .line 120
    invoke-static {v0}, Lza2;->a(Ljava/lang/Runnable;)V

    .line 121
    .line 122
    .line 123
    :cond_5
    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 124
    .line 125
    .line 126
    move-result-wide v0

    .line 127
    iput-wide v0, v3, Lza2;->g:J

    .line 128
    .line 129
    :cond_6
    iget v0, v3, Lza2;->b:I

    .line 130
    .line 131
    add-int/lit8 v0, v0, 0x1

    .line 132
    .line 133
    iput v0, v3, Lza2;->b:I

    .line 134
    .line 135
    iget-object v0, v3, Lza2;->e:Lkn;

    .line 136
    .line 137
    const/4 v1, 0x0

    .line 138
    if-nez v0, :cond_7

    .line 139
    .line 140
    const-string p0, "za2"

    .line 141
    .line 142
    const-string v0, "Session state not present"

    .line 143
    .line 144
    new-array v2, v6, [Ljava/lang/Object;

    .line 145
    .line 146
    invoke-static {p0, v0, v2}, Lk50;->L(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    .line 148
    .line 149
    monitor-exit v3

    .line 150
    goto :goto_3

    .line 151
    :cond_7
    :try_start_1
    iget-object v0, v0, Lkn;->c:Ljava/io/Serializable;

    .line 152
    .line 153
    check-cast v0, Ljava/util/HashMap;

    .line 154
    .line 155
    new-instance v2, Ljava/util/HashMap;

    .line 156
    .line 157
    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 158
    .line 159
    .line 160
    const-string v0, "eventIndex"

    .line 161
    .line 162
    iget v4, v3, Lza2;->b:I

    .line 163
    .line 164
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    if-eqz p0, :cond_8

    .line 172
    .line 173
    const-string p0, "userId"

    .line 174
    .line 175
    const-string v0, "00000000-0000-0000-0000-000000000000"

    .line 176
    .line 177
    invoke-virtual {v2, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    const-string p0, "previousSessionId"

    .line 181
    .line 182
    invoke-virtual {v2, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    :cond_8
    new-instance v1, Luv;

    .line 186
    .line 187
    const-string p0, "iglu:com.snowplowanalytics.snowplow/client_session/jsonschema/1-0-2"

    .line 188
    .line 189
    invoke-direct {v1, p0, v2}, Lb92;-><init>(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 190
    .line 191
    .line 192
    monitor-exit v3

    .line 193
    :goto_3
    if-eqz v1, :cond_9

    .line 194
    .line 195
    invoke-virtual {p1}, Lyq2;->a()Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    check-cast p0, Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :goto_4
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 206
    throw p0

    .line 207
    :cond_9
    return-void
.end method

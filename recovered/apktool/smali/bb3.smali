.class public final Lbb3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lej;Lds0;Ld5;)V
    .locals 0

    const/4 p2, 0x5

    iput p2, p0, Lbb3;->a:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbb3;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lgi3;Z)V
    .locals 0

    const/4 p2, 0x7

    iput p2, p0, Lbb3;->a:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbb3;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 11
    iput p2, p0, Lbb3;->a:I

    iput-object p1, p0, Lbb3;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lmp3;Lv30;)V
    .locals 0

    .line 1
    const/16 p2, 0xb

    .line 2
    .line 3
    iput p2, p0, Lbb3;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lbb3;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lbb3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/16 v2, 0x18

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lbb3;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lij3;

    .line 15
    .line 16
    iget-object v0, p0, Lij3;->w:Lup3;

    .line 17
    .line 18
    iget-object v1, p0, Lij3;->X:Lsl3;

    .line 19
    .line 20
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lsq3;->y()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lup3;->U()J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    const-wide/16 v4, 0x1

    .line 31
    .line 32
    cmp-long v0, v2, v4

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    invoke-static {v1}, Lij3;->k(Lwg3;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Leg3;->y()V

    .line 40
    .line 41
    .line 42
    iget-object p0, v1, Lsl3;->W:Lwk3;

    .line 43
    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    invoke-virtual {p0}, Lbe3;->c()V

    .line 47
    .line 48
    .line 49
    :cond_0
    new-instance p0, Ljava/lang/Thread;

    .line 50
    .line 51
    invoke-static {v1}, Lij3;->k(Lwg3;)V

    .line 52
    .line 53
    .line 54
    new-instance v0, Luk3;

    .line 55
    .line 56
    const/4 v2, 0x3

    .line 57
    invoke-direct {v0, v1, v2}, Luk3;-><init>(Lsl3;I)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 68
    .line 69
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 70
    .line 71
    .line 72
    iget-object p0, p0, Luh3;->w:Lsh3;

    .line 73
    .line 74
    const-string v0, "registerTrigger called but app not eligible"

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :goto_0
    return-void

    .line 80
    :pswitch_0
    iget-object p0, p0, Lbb3;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, Lcom/google/android/gms/measurement/internal/zzw;

    .line 83
    .line 84
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzw;->a:Lij3;

    .line 85
    .line 86
    iget-object v0, p0, Lij3;->f0:Lxl3;

    .line 87
    .line 88
    invoke-static {v0}, Lij3;->i(Leg3;)V

    .line 89
    .line 90
    .line 91
    iget-object p0, p0, Lij3;->f0:Lxl3;

    .line 92
    .line 93
    sget-object v0, Lvg3;->D:Lug3;

    .line 94
    .line 95
    invoke-virtual {v0, v4}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Ljava/lang/Long;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 102
    .line 103
    .line 104
    move-result-wide v0

    .line 105
    invoke-virtual {p0, v0, v1}, Lxl3;->D(J)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :pswitch_1
    iget-object p0, p0, Lbb3;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p0, Lmp3;

    .line 112
    .line 113
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0}, Lbj3;->y()V

    .line 118
    .line 119
    .line 120
    new-instance v0, Loi3;

    .line 121
    .line 122
    invoke-direct {v0, p0}, Loi3;-><init>(Lmp3;)V

    .line 123
    .line 124
    .line 125
    iput-object v0, p0, Lmp3;->V:Loi3;

    .line 126
    .line 127
    new-instance v0, Lae3;

    .line 128
    .line 129
    invoke-direct {v0, p0}, Lae3;-><init>(Lmp3;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Lwo3;->B()V

    .line 133
    .line 134
    .line 135
    iput-object v0, p0, Lmp3;->c:Lae3;

    .line 136
    .line 137
    iget-object v0, p0, Lmp3;->a:Lvi3;

    .line 138
    .line 139
    invoke-virtual {p0}, Lmp3;->d0()Lpd3;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    iput-object v0, v1, Lpd3;->d:Lod3;

    .line 147
    .line 148
    new-instance v0, Ltn3;

    .line 149
    .line 150
    invoke-direct {v0, p0}, Ltn3;-><init>(Lmp3;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Lwo3;->B()V

    .line 154
    .line 155
    .line 156
    iput-object v0, p0, Lmp3;->w:Ltn3;

    .line 157
    .line 158
    new-instance v0, Lfd3;

    .line 159
    .line 160
    invoke-direct {v0, p0}, Lwo3;-><init>(Lmp3;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Lwo3;->B()V

    .line 164
    .line 165
    .line 166
    iput-object v0, p0, Lmp3;->f:Lfd3;

    .line 167
    .line 168
    new-instance v0, Lci3;

    .line 169
    .line 170
    invoke-direct {v0, p0, v5}, Lci3;-><init>(Lmp3;I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Lwo3;->B()V

    .line 174
    .line 175
    .line 176
    iput-object v0, p0, Lmp3;->v:Lci3;

    .line 177
    .line 178
    new-instance v0, Lpo3;

    .line 179
    .line 180
    invoke-direct {v0, p0}, Lpo3;-><init>(Lmp3;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Lwo3;->B()V

    .line 184
    .line 185
    .line 186
    iput-object v0, p0, Lmp3;->e:Lpo3;

    .line 187
    .line 188
    new-instance v0, Lgi3;

    .line 189
    .line 190
    invoke-direct {v0, p0}, Lgi3;-><init>(Lmp3;)V

    .line 191
    .line 192
    .line 193
    iput-object v0, p0, Lmp3;->d:Lgi3;

    .line 194
    .line 195
    iget v0, p0, Lmp3;->c0:I

    .line 196
    .line 197
    iget v1, p0, Lmp3;->d0:I

    .line 198
    .line 199
    if-eq v0, v1, :cond_2

    .line 200
    .line 201
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 206
    .line 207
    iget v1, p0, Lmp3;->c0:I

    .line 208
    .line 209
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    iget v2, p0, Lmp3;->d0:I

    .line 214
    .line 215
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    const-string v3, "Not all upload components initialized"

    .line 220
    .line 221
    invoke-virtual {v0, v1, v3, v2}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    :cond_2
    iget-object v0, p0, Lmp3;->X:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 225
    .line 226
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0}, Lmp3;->a()Luh3;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 234
    .line 235
    const-string v1, "UploadController is now fully initialized"

    .line 236
    .line 237
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0}, Lmp3;->b()Lbj3;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-virtual {v0}, Lbj3;->y()V

    .line 245
    .line 246
    .line 247
    iget-object v0, p0, Lmp3;->c:Lae3;

    .line 248
    .line 249
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0}, Lae3;->J()V

    .line 253
    .line 254
    .line 255
    iget-object v0, p0, Lmp3;->c:Lae3;

    .line 256
    .line 257
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Lsq3;->y()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0}, Lwo3;->A()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0}, Lae3;->k0()Z

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    const-wide/16 v2, 0x0

    .line 271
    .line 272
    if-eqz v1, :cond_4

    .line 273
    .line 274
    sget-object v1, Lvg3;->v0:Lug3;

    .line 275
    .line 276
    invoke-virtual {v1, v4}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    check-cast v5, Ljava/lang/Long;

    .line 281
    .line 282
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 283
    .line 284
    .line 285
    move-result-wide v5

    .line 286
    cmp-long v5, v5, v2

    .line 287
    .line 288
    if-nez v5, :cond_3

    .line 289
    .line 290
    goto :goto_1

    .line 291
    :cond_3
    invoke-virtual {v0}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v0, Lij3;

    .line 298
    .line 299
    iget-object v6, v0, Lij3;->V:Lxt0;

    .line 300
    .line 301
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 305
    .line 306
    .line 307
    move-result-wide v6

    .line 308
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v6

    .line 312
    invoke-virtual {v1, v4}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    filled-new-array {v6, v1}, [Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    const-string v4, "trigger_uris"

    .line 325
    .line 326
    const-string v6, "abs(timestamp_millis - ?) > cast(? as integer)"

    .line 327
    .line 328
    invoke-virtual {v5, v4, v6, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    if-lez v1, :cond_4

    .line 333
    .line 334
    iget-object v0, v0, Lij3;->f:Luh3;

    .line 335
    .line 336
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 337
    .line 338
    .line 339
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 340
    .line 341
    const-string v4, "Deleted stale trigger uris. rowsDeleted"

    .line 342
    .line 343
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-virtual {v0, v1, v4}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    :cond_4
    :goto_1
    iget-object v0, p0, Lmp3;->w:Ltn3;

    .line 351
    .line 352
    iget-object v0, v0, Ltn3;->v:Lio/sentry/android/core/s;

    .line 353
    .line 354
    invoke-virtual {v0}, Lio/sentry/android/core/s;->a()J

    .line 355
    .line 356
    .line 357
    move-result-wide v0

    .line 358
    cmp-long v0, v0, v2

    .line 359
    .line 360
    if-nez v0, :cond_5

    .line 361
    .line 362
    iget-object v0, p0, Lmp3;->w:Ltn3;

    .line 363
    .line 364
    iget-object v0, v0, Ltn3;->v:Lio/sentry/android/core/s;

    .line 365
    .line 366
    invoke-virtual {p0}, Lmp3;->f()Lxv;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    check-cast v1, Lxt0;

    .line 371
    .line 372
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 376
    .line 377
    .line 378
    move-result-wide v1

    .line 379
    invoke-virtual {v0, v1, v2}, Lio/sentry/android/core/s;->b(J)V

    .line 380
    .line 381
    .line 382
    :cond_5
    invoke-virtual {p0}, Lmp3;->L()V

    .line 383
    .line 384
    .line 385
    return-void

    .line 386
    :pswitch_2
    iget-object p0, p0, Lbb3;->b:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast p0, Lco3;

    .line 389
    .line 390
    iget-object v0, p0, Lco3;->c:Lwe2;

    .line 391
    .line 392
    iget-object v0, v0, Lwe2;->b:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v0, Llo3;

    .line 395
    .line 396
    invoke-virtual {v0}, Leg3;->y()V

    .line 397
    .line 398
    .line 399
    iget-object v1, v0, Lsq3;->a:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v1, Lij3;

    .line 402
    .line 403
    iget-object v2, v1, Lij3;->f:Luh3;

    .line 404
    .line 405
    iget-object v6, v1, Lij3;->a:Landroid/content/Context;

    .line 406
    .line 407
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 408
    .line 409
    .line 410
    iget-object v7, v2, Luh3;->X:Lsh3;

    .line 411
    .line 412
    const-string v8, "Application going to the background"

    .line 413
    .line 414
    invoke-virtual {v7, v8}, Lsh3;->a(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    iget-object v7, v1, Lij3;->e:Lki3;

    .line 418
    .line 419
    invoke-static {v7}, Lij3;->j(Lsq3;)V

    .line 420
    .line 421
    .line 422
    iget-object v7, v7, Lki3;->d0:Lhi3;

    .line 423
    .line 424
    invoke-virtual {v7, v5}, Lhi3;->b(Z)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0}, Leg3;->y()V

    .line 428
    .line 429
    .line 430
    iput-boolean v5, v0, Llo3;->d:Z

    .line 431
    .line 432
    iget-object v7, v1, Lij3;->d:Lpd3;

    .line 433
    .line 434
    invoke-virtual {v7}, Lpd3;->N()Z

    .line 435
    .line 436
    .line 437
    move-result v8

    .line 438
    if-nez v8, :cond_6

    .line 439
    .line 440
    iget-wide v8, p0, Lco3;->b:J

    .line 441
    .line 442
    iget-object v0, v0, Llo3;->f:Lio/sentry/android/core/internal/tombstone/b;

    .line 443
    .line 444
    invoke-virtual {v0, v8, v9, v3, v3}, Lio/sentry/android/core/internal/tombstone/b;->b(JZZ)Z

    .line 445
    .line 446
    .line 447
    iget-object v0, v0, Lio/sentry/android/core/internal/tombstone/b;->c:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast v0, Ldo3;

    .line 450
    .line 451
    invoke-virtual {v0}, Lbe3;->c()V

    .line 452
    .line 453
    .line 454
    :cond_6
    iget-wide v8, p0, Lco3;->a:J

    .line 455
    .line 456
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 457
    .line 458
    .line 459
    iget-object p0, v2, Luh3;->W:Lsh3;

    .line 460
    .line 461
    const-string v0, "Application backgrounded at: timestamp_millis"

    .line 462
    .line 463
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    invoke-virtual {p0, v3, v0}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    iget-object p0, v1, Lij3;->X:Lsl3;

    .line 471
    .line 472
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {p0}, Leg3;->y()V

    .line 476
    .line 477
    .line 478
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v0, Lij3;

    .line 481
    .line 482
    invoke-virtual {p0}, Lwg3;->A()V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0}, Lij3;->o()Lpn3;

    .line 486
    .line 487
    .line 488
    move-result-object p0

    .line 489
    invoke-virtual {p0}, Leg3;->y()V

    .line 490
    .line 491
    .line 492
    invoke-virtual {p0}, Lwg3;->A()V

    .line 493
    .line 494
    .line 495
    invoke-virtual {p0}, Lpn3;->G()Z

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    if-nez v3, :cond_7

    .line 500
    .line 501
    goto :goto_2

    .line 502
    :cond_7
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast p0, Lij3;

    .line 505
    .line 506
    iget-object p0, p0, Lij3;->w:Lup3;

    .line 507
    .line 508
    invoke-static {p0}, Lij3;->j(Lsq3;)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {p0}, Lup3;->f0()I

    .line 512
    .line 513
    .line 514
    move-result p0

    .line 515
    const v3, 0x3b3a8

    .line 516
    .line 517
    .line 518
    if-lt p0, v3, :cond_8

    .line 519
    .line 520
    :goto_2
    invoke-virtual {v0}, Lij3;->o()Lpn3;

    .line 521
    .line 522
    .line 523
    move-result-object p0

    .line 524
    invoke-virtual {p0}, Leg3;->y()V

    .line 525
    .line 526
    .line 527
    invoke-virtual {p0}, Lwg3;->A()V

    .line 528
    .line 529
    .line 530
    invoke-virtual {p0, v5}, Lpn3;->P(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    new-instance v3, Lsm3;

    .line 535
    .line 536
    invoke-direct {v3, p0, v0, v5}, Lsm3;-><init>(Lpn3;Lcom/google/android/gms/measurement/internal/zzr;I)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {p0, v3}, Lpn3;->N(Ljava/lang/Runnable;)V

    .line 540
    .line 541
    .line 542
    :cond_8
    sget-object p0, Lvg3;->N0:Lug3;

    .line 543
    .line 544
    invoke-virtual {v7, v4, p0}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 545
    .line 546
    .line 547
    move-result p0

    .line 548
    if-eqz p0, :cond_a

    .line 549
    .line 550
    iget-object p0, v1, Lij3;->w:Lup3;

    .line 551
    .line 552
    invoke-static {p0}, Lij3;->j(Lsq3;)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    iget-object v3, v7, Lpd3;->c:Ljava/lang/String;

    .line 560
    .line 561
    invoke-virtual {p0, v0, v3}, Lup3;->Z(Ljava/lang/String;Ljava/lang/String;)Z

    .line 562
    .line 563
    .line 564
    move-result p0

    .line 565
    if-eqz p0, :cond_9

    .line 566
    .line 567
    const-wide/16 v3, 0x3e8

    .line 568
    .line 569
    goto :goto_3

    .line 570
    :cond_9
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object p0

    .line 574
    sget-object v0, Lvg3;->E:Lug3;

    .line 575
    .line 576
    invoke-virtual {v7, p0, v0}, Lpd3;->G(Ljava/lang/String;Lug3;)J

    .line 577
    .line 578
    .line 579
    move-result-wide v3

    .line 580
    :goto_3
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 581
    .line 582
    .line 583
    iget-object p0, v2, Luh3;->Y:Lsh3;

    .line 584
    .line 585
    const-string v0, "[sgtm] Scheduling batch upload with minimum latency in millis"

    .line 586
    .line 587
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    invoke-virtual {p0, v2, v0}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    iget-object p0, v1, Lij3;->f0:Lxl3;

    .line 595
    .line 596
    invoke-static {p0}, Lij3;->i(Leg3;)V

    .line 597
    .line 598
    .line 599
    iget-object p0, v1, Lij3;->f0:Lxl3;

    .line 600
    .line 601
    invoke-virtual {p0, v3, v4}, Lxl3;->D(J)V

    .line 602
    .line 603
    .line 604
    :cond_a
    return-void

    .line 605
    :pswitch_3
    iget-object p0, p0, Lbb3;->b:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast p0, Lol3;

    .line 608
    .line 609
    iget-object p0, p0, Lol3;->c:Ljava/lang/Object;

    .line 610
    .line 611
    check-cast p0, Lmn3;

    .line 612
    .line 613
    iget-object p0, p0, Lmn3;->c:Lpn3;

    .line 614
    .line 615
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v0, Lij3;

    .line 618
    .line 619
    iget-object v0, v0, Lij3;->i:Lbj3;

    .line 620
    .line 621
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 622
    .line 623
    .line 624
    new-instance v1, Lln3;

    .line 625
    .line 626
    invoke-direct {v1, p0, v3}, Lln3;-><init>(Lpn3;I)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v0, v1}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 630
    .line 631
    .line 632
    return-void

    .line 633
    :pswitch_4
    iget-object p0, p0, Lbb3;->b:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast p0, Lmn3;

    .line 636
    .line 637
    iget-object p0, p0, Lmn3;->c:Lpn3;

    .line 638
    .line 639
    new-instance v0, Landroid/content/ComponentName;

    .line 640
    .line 641
    iget-object v1, p0, Lsq3;->a:Ljava/lang/Object;

    .line 642
    .line 643
    check-cast v1, Lij3;

    .line 644
    .line 645
    iget-object v1, v1, Lij3;->a:Landroid/content/Context;

    .line 646
    .line 647
    const-string v2, "com.google.android.gms.measurement.AppMeasurementService"

    .line 648
    .line 649
    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {p0, v0}, Lpn3;->K(Landroid/content/ComponentName;)V

    .line 653
    .line 654
    .line 655
    return-void

    .line 656
    :pswitch_5
    iget-object p0, p0, Lbb3;->b:Ljava/lang/Object;

    .line 657
    .line 658
    check-cast p0, Lgi3;

    .line 659
    .line 660
    iget-object p0, p0, Lgi3;->d:Ljava/lang/Object;

    .line 661
    .line 662
    check-cast p0, Lmp3;

    .line 663
    .line 664
    invoke-virtual {p0}, Lmp3;->L()V

    .line 665
    .line 666
    .line 667
    return-void

    .line 668
    :pswitch_6
    iget-object p0, p0, Lbb3;->b:Ljava/lang/Object;

    .line 669
    .line 670
    check-cast p0, Lne3;

    .line 671
    .line 672
    iget-object v0, p0, Lne3;->b:Lej;

    .line 673
    .line 674
    invoke-virtual {v0, v3}, Lej;->o(I)V

    .line 675
    .line 676
    .line 677
    sget-object v1, Lkf3;->k:Lkj;

    .line 678
    .line 679
    const/4 v3, 0x6

    .line 680
    invoke-virtual {v0, v2, v3, v1}, Lej;->x(IILkj;)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {p0, v1}, Lne3;->a(Lkj;)V

    .line 684
    .line 685
    .line 686
    return-void

    .line 687
    :pswitch_7
    iget-object p0, p0, Lbb3;->b:Ljava/lang/Object;

    .line 688
    .line 689
    check-cast p0, Lej;

    .line 690
    .line 691
    sget-object v0, Lkf3;->k:Lkj;

    .line 692
    .line 693
    invoke-virtual {p0, v2, v1, v0}, Lej;->x(IILkj;)V

    .line 694
    .line 695
    .line 696
    iget p0, v0, Lkj;->a:I

    .line 697
    .line 698
    return-void

    .line 699
    :pswitch_8
    new-instance v0, Ljava/io/IOException;

    .line 700
    .line 701
    const-string v1, "TIMEOUT"

    .line 702
    .line 703
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 704
    .line 705
    .line 706
    iget-object p0, p0, Lbb3;->b:Ljava/lang/Object;

    .line 707
    .line 708
    check-cast p0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 709
    .line 710
    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    .line 711
    .line 712
    .line 713
    move-result p0

    .line 714
    if-eqz p0, :cond_b

    .line 715
    .line 716
    const-string p0, "Rpc"

    .line 717
    .line 718
    const-string v0, "No response"

    .line 719
    .line 720
    invoke-static {p0, v0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 721
    .line 722
    .line 723
    :cond_b
    return-void

    .line 724
    :pswitch_9
    iget-object p0, p0, Lbb3;->b:Ljava/lang/Object;

    .line 725
    .line 726
    check-cast p0, Lg63;

    .line 727
    .line 728
    iget-object v0, p0, Lg63;->a:Ljava/lang/Object;

    .line 729
    .line 730
    monitor-enter v0

    .line 731
    :try_start_0
    invoke-virtual {p0}, Lg63;->b()Z

    .line 732
    .line 733
    .line 734
    move-result v1

    .line 735
    if-nez v1, :cond_c

    .line 736
    .line 737
    monitor-exit v0

    .line 738
    goto :goto_4

    .line 739
    :catchall_0
    move-exception p0

    .line 740
    goto :goto_5

    .line 741
    :cond_c
    const-string v1, "WakeLock"

    .line 742
    .line 743
    iget-object v2, p0, Lg63;->j:Ljava/lang/String;

    .line 744
    .line 745
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    const-string v3, " ** IS FORCE-RELEASED ON TIMEOUT **"

    .line 750
    .line 751
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    move-result-object v2

    .line 755
    invoke-static {v1, v2}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 756
    .line 757
    .line 758
    invoke-virtual {p0}, Lg63;->d()V

    .line 759
    .line 760
    .line 761
    invoke-virtual {p0}, Lg63;->b()Z

    .line 762
    .line 763
    .line 764
    move-result v1

    .line 765
    if-nez v1, :cond_d

    .line 766
    .line 767
    monitor-exit v0

    .line 768
    goto :goto_4

    .line 769
    :cond_d
    iput v5, p0, Lg63;->c:I

    .line 770
    .line 771
    invoke-virtual {p0}, Lg63;->e()V

    .line 772
    .line 773
    .line 774
    monitor-exit v0

    .line 775
    :goto_4
    return-void

    .line 776
    :goto_5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 777
    throw p0

    .line 778
    :pswitch_a
    iget-object p0, p0, Lbb3;->b:Ljava/lang/Object;

    .line 779
    .line 780
    check-cast p0, Lcom/google/android/gms/common/api/internal/zact;

    .line 781
    .line 782
    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/zact;->i:Lu93;

    .line 783
    .line 784
    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    .line 785
    .line 786
    invoke-direct {v0, v1, v4, v4}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {p0, v0}, Lu93;->A(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 790
    .line 791
    .line 792
    return-void

    .line 793
    :pswitch_b
    iget-object p0, p0, Lbb3;->b:Ljava/lang/Object;

    .line 794
    .line 795
    check-cast p0, Lfs0;

    .line 796
    .line 797
    iget-object p0, p0, Lfs0;->b:Ljava/lang/Object;

    .line 798
    .line 799
    check-cast p0, Lcb3;

    .line 800
    .line 801
    iget-object p0, p0, Lcb3;->b:Ld9;

    .line 802
    .line 803
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    const-string v1, " disconnecting because it was signed out."

    .line 812
    .line 813
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    invoke-interface {p0, v0}, Ld9;->disconnect(Ljava/lang/String;)V

    .line 818
    .line 819
    .line 820
    return-void

    .line 821
    :pswitch_c
    iget-object p0, p0, Lbb3;->b:Ljava/lang/Object;

    .line 822
    .line 823
    check-cast p0, Lcb3;

    .line 824
    .line 825
    invoke-virtual {p0}, Lcb3;->h()V

    .line 826
    .line 827
    .line 828
    return-void

    .line 829
    :pswitch_data_0
    .packed-switch 0x0
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

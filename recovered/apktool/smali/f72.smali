.class public final synthetic Lf72;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/a;Lio/sentry/u2;)V
    .locals 0

    .line 1
    const/16 p2, 0x10

    .line 2
    .line 3
    iput p2, p0, Lf72;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lf72;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/android/core/g0;Lio/sentry/android/core/f0;)V
    .locals 0

    .line 11
    const/16 p1, 0x14

    iput p1, p0, Lf72;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lf72;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 12
    iput p2, p0, Lf72;->a:I

    iput-object p1, p0, Lf72;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lf72;->a:I

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v1, v0

    .line 13
    check-cast v1, Lio/sentry/cache/f;

    .line 14
    .line 15
    :try_start_0
    iget-object v0, v1, Lio/sentry/cache/f;->b:Lio/sentry/util/g;

    .line 16
    .line 17
    invoke-virtual {v0}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lio/sentry/cache/tape/f;

    .line 22
    .line 23
    invoke-virtual {v0}, Lio/sentry/cache/tape/f;->clear()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    move-exception v0

    .line 28
    iget-object v1, v1, Lio/sentry/cache/f;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 29
    .line 30
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v2, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 35
    .line 36
    const-string v3, "Failed to clear breadcrumbs from file queue"

    .line 37
    .line 38
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    return-void

    .line 42
    :pswitch_0
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lio/sentry/android/replay/screenshot/h;

    .line 45
    .line 46
    iget-object v1, v0, Lio/sentry/android/replay/screenshot/h;->g:Landroid/graphics/Bitmap;

    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    iget-object v1, v0, Lio/sentry/android/replay/screenshot/h;->g:Landroid/graphics/Bitmap;

    .line 55
    .line 56
    monitor-enter v1

    .line 57
    :try_start_1
    iget-object v2, v0, Lio/sentry/android/replay/screenshot/h;->g:Landroid/graphics/Bitmap;

    .line 58
    .line 59
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_0

    .line 64
    .line 65
    iget-object v2, v0, Lio/sentry/android/replay/screenshot/h;->g:Landroid/graphics/Bitmap;

    .line 66
    .line 67
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    goto :goto_2

    .line 73
    :cond_0
    :goto_1
    monitor-exit v1

    .line 74
    goto :goto_3

    .line 75
    :goto_2
    monitor-exit v1

    .line 76
    throw v0

    .line 77
    :cond_1
    :goto_3
    iget-object v0, v0, Lio/sentry/android/replay/screenshot/h;->j:Lio/sentry/android/replay/util/e;

    .line 78
    .line 79
    invoke-virtual {v0}, Lio/sentry/android/replay/util/e;->close()V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_1
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Lio/sentry/android/replay/u;

    .line 86
    .line 87
    iget-object v1, v0, Lio/sentry/android/replay/u;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_2

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_2
    new-instance v1, Lo;

    .line 97
    .line 98
    const/16 v2, 0x1d

    .line 99
    .line 100
    invoke-direct {v1, v0, v2}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 101
    .line 102
    .line 103
    :try_start_2
    sget-object v0, Lio/sentry/android/replay/a0;->b:Lp51;

    .line 104
    .line 105
    invoke-interface {v0}, Lp51;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    sget-object v2, Lio/sentry/android/replay/a0;->c:Lp51;

    .line 112
    .line 113
    invoke-interface {v2}, Lp51;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    check-cast v2, Ljava/lang/reflect/Field;

    .line 118
    .line 119
    if-eqz v2, :cond_3

    .line 120
    .line 121
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    check-cast v3, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-virtual {v1, v3}, Lo;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v2, v0, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 135
    .line 136
    .line 137
    :catchall_1
    :cond_3
    :goto_4
    return-void

    .line 138
    :pswitch_2
    const-string v1, ""

    .line 139
    .line 140
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, Lio/sentry/android/replay/ReplayIntegration;

    .line 143
    .line 144
    const-string v5, "options"

    .line 145
    .line 146
    iget-object v6, v0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 147
    .line 148
    if-eqz v6, :cond_23

    .line 149
    .line 150
    invoke-virtual {v6}, Lio/sentry/m6;->findPersistingScopeObserver()Lio/sentry/cache/f;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    if-eqz v6, :cond_22

    .line 155
    .line 156
    iget-object v7, v0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 157
    .line 158
    if-eqz v7, :cond_21

    .line 159
    .line 160
    const-string v8, "replay.json"

    .line 161
    .line 162
    const-class v9, Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v6, v7, v8, v9}, Lio/sentry/cache/f;->b(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    check-cast v7, Ljava/lang/String;

    .line 169
    .line 170
    if-nez v7, :cond_4

    .line 171
    .line 172
    goto/16 :goto_1a

    .line 173
    .line 174
    :cond_4
    new-instance v13, Lio/sentry/protocol/w;

    .line 175
    .line 176
    invoke-direct {v13, v7}, Lio/sentry/protocol/w;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    sget-object v8, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 180
    .line 181
    invoke-virtual {v13, v8}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    if-eqz v8, :cond_5

    .line 186
    .line 187
    invoke-virtual {v0, v1}, Lio/sentry/android/replay/ReplayIntegration;->m(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    goto/16 :goto_1b

    .line 191
    .line 192
    :cond_5
    iget-object v8, v0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 193
    .line 194
    if-eqz v8, :cond_20

    .line 195
    .line 196
    invoke-virtual {v8}, Lio/sentry/m6;->getCacheDirPath()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    if-eqz v9, :cond_7

    .line 201
    .line 202
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 203
    .line 204
    .line 205
    move-result v9

    .line 206
    if-nez v9, :cond_6

    .line 207
    .line 208
    goto :goto_5

    .line 209
    :cond_6
    new-instance v9, Ljava/io/File;

    .line 210
    .line 211
    invoke-virtual {v8}, Lio/sentry/m6;->getCacheDirPath()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    new-instance v11, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    const-string v12, "replay_"

    .line 221
    .line 222
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v11

    .line 232
    invoke-direct {v9, v10, v11}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v9}, Ljava/io/File;->mkdirs()Z

    .line 236
    .line 237
    .line 238
    goto :goto_6

    .line 239
    :cond_7
    :goto_5
    invoke-virtual {v8}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    sget-object v10, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 244
    .line 245
    const-string v11, "SentryOptions.cacheDirPath is not set, session replay is no-op"

    .line 246
    .line 247
    new-array v12, v4, [Ljava/lang/Object;

    .line 248
    .line 249
    invoke-interface {v9, v10, v11, v12}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    const/4 v9, 0x0

    .line 253
    :goto_6
    new-instance v10, Ljava/io/File;

    .line 254
    .line 255
    const-string v11, ".ongoing_segment"

    .line 256
    .line 257
    invoke-direct {v10, v9, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    .line 261
    .line 262
    .line 263
    move-result v11

    .line 264
    if-nez v11, :cond_8

    .line 265
    .line 266
    invoke-virtual {v8}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    sget-object v4, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 271
    .line 272
    const-string v8, "No ongoing segment found for replay: %s"

    .line 273
    .line 274
    filled-new-array {v13}, [Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v10

    .line 278
    invoke-interface {v3, v4, v8, v10}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    invoke-static {v9}, Lio/sentry/util/c;->f(Ljava/io/File;)Z

    .line 282
    .line 283
    .line 284
    move-object/from16 p0, v5

    .line 285
    .line 286
    const/4 v2, 0x0

    .line 287
    const/16 v17, 0x0

    .line 288
    .line 289
    goto/16 :goto_17

    .line 290
    .line 291
    :cond_8
    new-instance v11, Ljava/util/LinkedHashMap;

    .line 292
    .line 293
    invoke-direct {v11}, Ljava/util/LinkedHashMap;-><init>()V

    .line 294
    .line 295
    .line 296
    sget-object v12, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 297
    .line 298
    new-instance v14, Ljava/io/InputStreamReader;

    .line 299
    .line 300
    new-instance v15, Ljava/io/FileInputStream;

    .line 301
    .line 302
    invoke-direct {v15, v10}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 303
    .line 304
    .line 305
    invoke-direct {v14, v15, v12}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 306
    .line 307
    .line 308
    new-instance v10, Ljava/io/BufferedReader;

    .line 309
    .line 310
    const/16 v12, 0x2000

    .line 311
    .line 312
    invoke-direct {v10, v14, v12}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 313
    .line 314
    .line 315
    :try_start_3
    new-instance v12, Lpd;

    .line 316
    .line 317
    const/4 v14, 0x2

    .line 318
    invoke-direct {v12, v10, v14}, Lpd;-><init>(Ljava/lang/Object;I)V

    .line 319
    .line 320
    .line 321
    new-instance v15, Lnz;

    .line 322
    .line 323
    invoke-direct {v15, v12}, Lnz;-><init>(Lkotlin/sequences/Sequence;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v15}, Lnz;->iterator()Ljava/util/Iterator;

    .line 327
    .line 328
    .line 329
    move-result-object v12

    .line 330
    :goto_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 331
    .line 332
    .line 333
    move-result v15

    .line 334
    if-eqz v15, :cond_9

    .line 335
    .line 336
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v15

    .line 340
    check-cast v15, Ljava/lang/String;

    .line 341
    .line 342
    const-string v16, "="

    .line 343
    .line 344
    const/16 v17, 0x0

    .line 345
    .line 346
    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    invoke-static {v15, v2, v14, v14}, Lkotlin/text/StringsKt;->L(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v15

    .line 358
    check-cast v15, Ljava/lang/String;

    .line 359
    .line 360
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    check-cast v2, Ljava/lang/String;

    .line 365
    .line 366
    invoke-interface {v11, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 367
    .line 368
    .line 369
    goto :goto_7

    .line 370
    :catchall_2
    move-exception v0

    .line 371
    move-object v1, v0

    .line 372
    goto/16 :goto_19

    .line 373
    .line 374
    :cond_9
    const/16 v17, 0x0

    .line 375
    .line 376
    invoke-interface {v10}, Ljava/io/Closeable;->close()V

    .line 377
    .line 378
    .line 379
    const-string v2, "config.height"

    .line 380
    .line 381
    invoke-virtual {v11, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    check-cast v2, Ljava/lang/String;

    .line 386
    .line 387
    if-eqz v2, :cond_a

    .line 388
    .line 389
    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    goto :goto_8

    .line 394
    :cond_a
    move-object/from16 v2, v17

    .line 395
    .line 396
    :goto_8
    const-string v10, "config.width"

    .line 397
    .line 398
    invoke-virtual {v11, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v10

    .line 402
    check-cast v10, Ljava/lang/String;

    .line 403
    .line 404
    if-eqz v10, :cond_b

    .line 405
    .line 406
    invoke-static {v10}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 407
    .line 408
    .line 409
    move-result-object v10

    .line 410
    goto :goto_9

    .line 411
    :cond_b
    move-object/from16 v10, v17

    .line 412
    .line 413
    :goto_9
    const-string v12, "config.frame-rate"

    .line 414
    .line 415
    invoke-virtual {v11, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v12

    .line 419
    check-cast v12, Ljava/lang/String;

    .line 420
    .line 421
    if-eqz v12, :cond_c

    .line 422
    .line 423
    invoke-static {v12}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 424
    .line 425
    .line 426
    move-result-object v12

    .line 427
    goto :goto_a

    .line 428
    :cond_c
    move-object/from16 v12, v17

    .line 429
    .line 430
    :goto_a
    const-string v14, "config.bit-rate"

    .line 431
    .line 432
    invoke-virtual {v11, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v14

    .line 436
    check-cast v14, Ljava/lang/String;

    .line 437
    .line 438
    if-eqz v14, :cond_d

    .line 439
    .line 440
    invoke-static {v14}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 441
    .line 442
    .line 443
    move-result-object v14

    .line 444
    goto :goto_b

    .line 445
    :cond_d
    move-object/from16 v14, v17

    .line 446
    .line 447
    :goto_b
    const-string v15, "segment.id"

    .line 448
    .line 449
    invoke-virtual {v11, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v15

    .line 453
    check-cast v15, Ljava/lang/String;

    .line 454
    .line 455
    if-eqz v15, :cond_e

    .line 456
    .line 457
    invoke-static {v15}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 458
    .line 459
    .line 460
    move-result-object v15

    .line 461
    goto :goto_c

    .line 462
    :cond_e
    move-object/from16 v15, v17

    .line 463
    .line 464
    :goto_c
    :try_start_4
    const-string v4, "segment.timestamp"

    .line 465
    .line 466
    invoke-virtual {v11, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v4

    .line 470
    check-cast v4, Ljava/lang/String;

    .line 471
    .line 472
    if-nez v4, :cond_f

    .line 473
    .line 474
    move-object v4, v1

    .line 475
    :cond_f
    invoke-static {v4}, Lio/sentry/config/a;->l(Ljava/lang/String;)Ljava/util/Date;

    .line 476
    .line 477
    .line 478
    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 479
    goto :goto_d

    .line 480
    :catchall_3
    move-object/from16 v4, v17

    .line 481
    .line 482
    :goto_d
    :try_start_5
    const-string v3, "replay.type"

    .line 483
    .line 484
    invoke-virtual {v11, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v3

    .line 488
    check-cast v3, Ljava/lang/String;

    .line 489
    .line 490
    if-nez v3, :cond_10

    .line 491
    .line 492
    move-object v3, v1

    .line 493
    :cond_10
    invoke-static {v3}, Lio/sentry/n6;->valueOf(Ljava/lang/String;)Lio/sentry/n6;

    .line 494
    .line 495
    .line 496
    move-result-object v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 497
    goto :goto_e

    .line 498
    :catchall_4
    move-object/from16 v3, v17

    .line 499
    .line 500
    :goto_e
    if-eqz v2, :cond_11

    .line 501
    .line 502
    if-eqz v10, :cond_11

    .line 503
    .line 504
    if-eqz v12, :cond_11

    .line 505
    .line 506
    if-eqz v14, :cond_11

    .line 507
    .line 508
    if-eqz v15, :cond_11

    .line 509
    .line 510
    move-object/from16 p0, v2

    .line 511
    .line 512
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 513
    .line 514
    .line 515
    move-result v2

    .line 516
    move-object/from16 v19, v4

    .line 517
    .line 518
    const/4 v4, -0x1

    .line 519
    if-eq v2, v4, :cond_11

    .line 520
    .line 521
    if-eqz v19, :cond_11

    .line 522
    .line 523
    if-nez v3, :cond_12

    .line 524
    .line 525
    :cond_11
    move-object/from16 p0, v5

    .line 526
    .line 527
    goto/16 :goto_16

    .line 528
    .line 529
    :cond_12
    new-instance v20, Lio/sentry/android/replay/x;

    .line 530
    .line 531
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 532
    .line 533
    .line 534
    move-result v21

    .line 535
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Integer;->intValue()I

    .line 536
    .line 537
    .line 538
    move-result v22

    .line 539
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 540
    .line 541
    .line 542
    move-result v25

    .line 543
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 544
    .line 545
    .line 546
    move-result v26

    .line 547
    const/high16 v23, 0x3f800000    # 1.0f

    .line 548
    .line 549
    const/high16 v24, 0x3f800000    # 1.0f

    .line 550
    .line 551
    invoke-direct/range {v20 .. v26}, Lio/sentry/android/replay/x;-><init>(IIFFII)V

    .line 552
    .line 553
    .line 554
    new-instance v2, Lio/sentry/android/replay/k;

    .line 555
    .line 556
    invoke-direct {v2, v8, v13}, Lio/sentry/android/replay/k;-><init>(Lio/sentry/m6;Lio/sentry/protocol/w;)V

    .line 557
    .line 558
    .line 559
    iget-object v4, v2, Lio/sentry/android/replay/k;->w:Ljava/util/ArrayList;

    .line 560
    .line 561
    invoke-virtual {v2}, Lio/sentry/android/replay/k;->g()Ljava/io/File;

    .line 562
    .line 563
    .line 564
    move-result-object v10

    .line 565
    if-eqz v10, :cond_13

    .line 566
    .line 567
    new-instance v14, Lio/sentry/u;

    .line 568
    .line 569
    move-object/from16 p0, v5

    .line 570
    .line 571
    const/4 v5, 0x1

    .line 572
    invoke-direct {v14, v2, v5}, Lio/sentry/u;-><init>(Ljava/lang/Object;I)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v10, v14}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 576
    .line 577
    .line 578
    goto :goto_f

    .line 579
    :cond_13
    move-object/from16 p0, v5

    .line 580
    .line 581
    :goto_f
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 582
    .line 583
    .line 584
    move-result v5

    .line 585
    if-eqz v5, :cond_14

    .line 586
    .line 587
    invoke-virtual {v8}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    sget-object v3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 592
    .line 593
    const-string v4, "No frames found for replay: %s, deleting the replay"

    .line 594
    .line 595
    filled-new-array {v13}, [Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v5

    .line 599
    invoke-interface {v2, v3, v4, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 600
    .line 601
    .line 602
    invoke-static {v9}, Lio/sentry/util/c;->f(Ljava/io/File;)Z

    .line 603
    .line 604
    .line 605
    :goto_10
    move-object/from16 v2, v17

    .line 606
    .line 607
    goto/16 :goto_17

    .line 608
    .line 609
    :cond_14
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 610
    .line 611
    .line 612
    move-result v5

    .line 613
    const/4 v9, 0x1

    .line 614
    if-le v5, v9, :cond_15

    .line 615
    .line 616
    new-instance v5, Lio/sentry/android/replay/g;

    .line 617
    .line 618
    const/4 v10, 0x0

    .line 619
    invoke-direct {v5, v10}, Lio/sentry/android/replay/g;-><init>(I)V

    .line 620
    .line 621
    .line 622
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 623
    .line 624
    .line 625
    move-result v10

    .line 626
    if-le v10, v9, :cond_15

    .line 627
    .line 628
    invoke-static {v4, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 629
    .line 630
    .line 631
    :cond_15
    sget-object v5, Lio/sentry/n6;->SESSION:Lio/sentry/n6;

    .line 632
    .line 633
    if-ne v3, v5, :cond_16

    .line 634
    .line 635
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 636
    .line 637
    .line 638
    move-result v9

    .line 639
    move/from16 v23, v9

    .line 640
    .line 641
    goto :goto_11

    .line 642
    :cond_16
    const/16 v23, 0x0

    .line 643
    .line 644
    :goto_11
    if-ne v3, v5, :cond_17

    .line 645
    .line 646
    move-object/from16 v22, v19

    .line 647
    .line 648
    goto :goto_12

    .line 649
    :cond_17
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->u(Ljava/util/List;)Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v5

    .line 653
    check-cast v5, Lio/sentry/android/replay/l;

    .line 654
    .line 655
    iget-wide v9, v5, Lio/sentry/android/replay/l;->b:J

    .line 656
    .line 657
    new-instance v5, Ljava/util/Date;

    .line 658
    .line 659
    invoke-direct {v5, v9, v10}, Ljava/util/Date;-><init>(J)V

    .line 660
    .line 661
    .line 662
    move-object/from16 v22, v5

    .line 663
    .line 664
    :goto_12
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->y(Ljava/util/List;)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v4

    .line 668
    check-cast v4, Lio/sentry/android/replay/l;

    .line 669
    .line 670
    iget-wide v4, v4, Lio/sentry/android/replay/l;->b:J

    .line 671
    .line 672
    invoke-virtual/range {v22 .. v22}, Ljava/util/Date;->getTime()J

    .line 673
    .line 674
    .line 675
    move-result-wide v9

    .line 676
    sub-long/2addr v4, v9

    .line 677
    const/16 v9, 0x3e8

    .line 678
    .line 679
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 680
    .line 681
    .line 682
    move-result v10

    .line 683
    div-int/2addr v9, v10

    .line 684
    int-to-long v9, v9

    .line 685
    add-long v24, v4, v9

    .line 686
    .line 687
    const-string v4, "replay.recording"

    .line 688
    .line 689
    invoke-virtual {v11, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v4

    .line 693
    check-cast v4, Ljava/lang/String;

    .line 694
    .line 695
    if-eqz v4, :cond_1a

    .line 696
    .line 697
    new-instance v5, Ljava/io/StringReader;

    .line 698
    .line 699
    invoke-direct {v5, v4}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v8}, Lio/sentry/m6;->getSerializer()Lio/sentry/i1;

    .line 703
    .line 704
    .line 705
    move-result-object v4

    .line 706
    const-class v8, Lio/sentry/x3;

    .line 707
    .line 708
    invoke-interface {v4, v5, v8}, Lio/sentry/i1;->b(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v4

    .line 712
    check-cast v4, Lio/sentry/x3;

    .line 713
    .line 714
    if-eqz v4, :cond_18

    .line 715
    .line 716
    iget-object v5, v4, Lio/sentry/x3;->b:Ljava/util/List;

    .line 717
    .line 718
    goto :goto_13

    .line 719
    :cond_18
    move-object/from16 v5, v17

    .line 720
    .line 721
    :goto_13
    if-eqz v5, :cond_19

    .line 722
    .line 723
    new-instance v5, Ljava/util/LinkedList;

    .line 724
    .line 725
    iget-object v4, v4, Lio/sentry/x3;->b:Ljava/util/List;

    .line 726
    .line 727
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 728
    .line 729
    .line 730
    invoke-direct {v5, v4}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 731
    .line 732
    .line 733
    goto :goto_14

    .line 734
    :cond_19
    move-object/from16 v5, v17

    .line 735
    .line 736
    :goto_14
    if-eqz v5, :cond_1a

    .line 737
    .line 738
    goto :goto_15

    .line 739
    :cond_1a
    sget-object v5, Lnd0;->a:Lnd0;

    .line 740
    .line 741
    :goto_15
    new-instance v19, Lio/sentry/android/replay/e;

    .line 742
    .line 743
    const-string v4, "replay.screen-at-start"

    .line 744
    .line 745
    invoke-virtual {v11, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v4

    .line 749
    move-object/from16 v27, v4

    .line 750
    .line 751
    check-cast v27, Ljava/lang/String;

    .line 752
    .line 753
    new-instance v4, Lio/sentry/android/replay/g;

    .line 754
    .line 755
    const/4 v9, 0x1

    .line 756
    invoke-direct {v4, v9}, Lio/sentry/android/replay/g;-><init>(I)V

    .line 757
    .line 758
    .line 759
    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->E(Ljava/util/Comparator;Ljava/lang/Iterable;)Ljava/util/List;

    .line 760
    .line 761
    .line 762
    move-result-object v28

    .line 763
    move-object/from16 v21, v2

    .line 764
    .line 765
    move-object/from16 v26, v3

    .line 766
    .line 767
    invoke-direct/range {v19 .. v28}, Lio/sentry/android/replay/e;-><init>(Lio/sentry/android/replay/x;Lio/sentry/android/replay/k;Ljava/util/Date;IJLio/sentry/n6;Ljava/lang/String;Ljava/util/List;)V

    .line 768
    .line 769
    .line 770
    move-object/from16 v2, v19

    .line 771
    .line 772
    goto :goto_17

    .line 773
    :goto_16
    invoke-virtual {v8}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 774
    .line 775
    .line 776
    move-result-object v2

    .line 777
    sget-object v3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 778
    .line 779
    const-string v4, "Incorrect segment values found for replay: %s, deleting the replay"

    .line 780
    .line 781
    filled-new-array {v13}, [Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v5

    .line 785
    invoke-interface {v2, v3, v4, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 786
    .line 787
    .line 788
    invoke-static {v9}, Lio/sentry/util/c;->f(Ljava/io/File;)Z

    .line 789
    .line 790
    .line 791
    goto/16 :goto_10

    .line 792
    .line 793
    :goto_17
    if-nez v2, :cond_1b

    .line 794
    .line 795
    invoke-virtual {v0, v1}, Lio/sentry/android/replay/ReplayIntegration;->m(Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    goto/16 :goto_1b

    .line 799
    .line 800
    :cond_1b
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 801
    .line 802
    if-eqz v1, :cond_1f

    .line 803
    .line 804
    const-string v3, "breadcrumbs.json"

    .line 805
    .line 806
    const-class v4, Ljava/util/List;

    .line 807
    .line 808
    invoke-virtual {v6, v1, v3, v4}, Lio/sentry/cache/f;->b(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    move-result-object v1

    .line 812
    instance-of v3, v1, Ljava/util/List;

    .line 813
    .line 814
    if-eqz v3, :cond_1c

    .line 815
    .line 816
    check-cast v1, Ljava/util/List;

    .line 817
    .line 818
    move-object/from16 v22, v1

    .line 819
    .line 820
    goto :goto_18

    .line 821
    :cond_1c
    move-object/from16 v22, v17

    .line 822
    .line 823
    :goto_18
    iget-object v8, v0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/h4;

    .line 824
    .line 825
    iget-object v9, v0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 826
    .line 827
    if-eqz v9, :cond_1e

    .line 828
    .line 829
    iget-wide v10, v2, Lio/sentry/android/replay/e;->e:J

    .line 830
    .line 831
    iget-object v12, v2, Lio/sentry/android/replay/e;->c:Ljava/util/Date;

    .line 832
    .line 833
    iget v14, v2, Lio/sentry/android/replay/e;->d:I

    .line 834
    .line 835
    iget-object v1, v2, Lio/sentry/android/replay/e;->a:Lio/sentry/android/replay/x;

    .line 836
    .line 837
    iget v15, v1, Lio/sentry/android/replay/x;->b:I

    .line 838
    .line 839
    iget v3, v1, Lio/sentry/android/replay/x;->a:I

    .line 840
    .line 841
    iget v4, v1, Lio/sentry/android/replay/x;->e:I

    .line 842
    .line 843
    iget v1, v1, Lio/sentry/android/replay/x;->f:I

    .line 844
    .line 845
    iget-object v5, v2, Lio/sentry/android/replay/e;->b:Lio/sentry/android/replay/k;

    .line 846
    .line 847
    iget-object v6, v2, Lio/sentry/android/replay/e;->f:Lio/sentry/n6;

    .line 848
    .line 849
    move/from16 v20, v1

    .line 850
    .line 851
    iget-object v1, v2, Lio/sentry/android/replay/e;->g:Ljava/lang/String;

    .line 852
    .line 853
    move-object/from16 v21, v1

    .line 854
    .line 855
    new-instance v1, Ljava/util/LinkedList;

    .line 856
    .line 857
    iget-object v2, v2, Lio/sentry/android/replay/e;->h:Ljava/util/List;

    .line 858
    .line 859
    invoke-direct {v1, v2}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 860
    .line 861
    .line 862
    sget-object v24, Lnd0;->a:Lnd0;

    .line 863
    .line 864
    move-object/from16 v23, v1

    .line 865
    .line 866
    move/from16 v16, v3

    .line 867
    .line 868
    move/from16 v19, v4

    .line 869
    .line 870
    move-object/from16 v18, v5

    .line 871
    .line 872
    move-object/from16 v17, v6

    .line 873
    .line 874
    invoke-static/range {v8 .. v24}, Lio/sentry/android/replay/capture/i;->a(Lio/sentry/c1;Lio/sentry/m6;JLjava/util/Date;Lio/sentry/protocol/w;IIILio/sentry/n6;Lio/sentry/android/replay/k;IILjava/lang/String;Ljava/util/List;Ljava/util/Deque;Ljava/util/List;)Lio/sentry/android/replay/capture/l;

    .line 875
    .line 876
    .line 877
    move-result-object v1

    .line 878
    instance-of v2, v1, Lio/sentry/android/replay/capture/j;

    .line 879
    .line 880
    if-eqz v2, :cond_1d

    .line 881
    .line 882
    new-instance v2, Lio/sentry/android/replay/n;

    .line 883
    .line 884
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 885
    .line 886
    .line 887
    invoke-static {v2}, Lio/sentry/util/c;->e(Ljava/lang/Object;)Lio/sentry/i0;

    .line 888
    .line 889
    .line 890
    move-result-object v2

    .line 891
    check-cast v1, Lio/sentry/android/replay/capture/j;

    .line 892
    .line 893
    iget-object v3, v0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/h4;

    .line 894
    .line 895
    if-eqz v3, :cond_1d

    .line 896
    .line 897
    iget-object v4, v1, Lio/sentry/android/replay/capture/j;->a:Lio/sentry/o6;

    .line 898
    .line 899
    iget-object v1, v1, Lio/sentry/android/replay/capture/j;->b:Lio/sentry/x3;

    .line 900
    .line 901
    iput-object v1, v2, Lio/sentry/i0;->h:Lio/sentry/x3;

    .line 902
    .line 903
    invoke-virtual {v3, v4, v2}, Lio/sentry/h4;->u(Lio/sentry/o6;Lio/sentry/i0;)Lio/sentry/protocol/w;

    .line 904
    .line 905
    .line 906
    :cond_1d
    invoke-virtual {v0, v7}, Lio/sentry/android/replay/ReplayIntegration;->m(Ljava/lang/String;)V

    .line 907
    .line 908
    .line 909
    goto :goto_1b

    .line 910
    :cond_1e
    invoke-static/range {p0 .. p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 911
    .line 912
    .line 913
    throw v17

    .line 914
    :cond_1f
    invoke-static/range {p0 .. p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 915
    .line 916
    .line 917
    throw v17

    .line 918
    :goto_19
    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 919
    :catchall_5
    move-exception v0

    .line 920
    invoke-static {v10, v1}, Ljb1;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 921
    .line 922
    .line 923
    throw v0

    .line 924
    :cond_20
    move-object/from16 p0, v5

    .line 925
    .line 926
    const/16 v17, 0x0

    .line 927
    .line 928
    invoke-static/range {p0 .. p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 929
    .line 930
    .line 931
    throw v17

    .line 932
    :cond_21
    move-object/from16 p0, v5

    .line 933
    .line 934
    const/16 v17, 0x0

    .line 935
    .line 936
    invoke-static/range {p0 .. p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    throw v17

    .line 940
    :cond_22
    :goto_1a
    invoke-virtual {v0, v1}, Lio/sentry/android/replay/ReplayIntegration;->m(Ljava/lang/String;)V

    .line 941
    .line 942
    .line 943
    :goto_1b
    return-void

    .line 944
    :cond_23
    move-object/from16 p0, v5

    .line 945
    .line 946
    const/16 v17, 0x0

    .line 947
    .line 948
    invoke-static/range {p0 .. p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 949
    .line 950
    .line 951
    throw v17

    .line 952
    :pswitch_3
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 953
    .line 954
    check-cast v0, Lio/sentry/android/ndk/b;

    .line 955
    .line 956
    iget-object v0, v0, Lio/sentry/android/ndk/b;->b:Lio/sentry/ndk/NativeScope;

    .line 957
    .line 958
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 959
    .line 960
    .line 961
    invoke-static {}, Lio/sentry/ndk/NativeScope;->nativeClearAttachments()V

    .line 962
    .line 963
    .line 964
    return-void

    .line 965
    :pswitch_4
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 966
    .line 967
    check-cast v0, Lio/sentry/internal/modules/f;

    .line 968
    .line 969
    invoke-virtual {v0}, Lio/sentry/internal/modules/d;->a()Ljava/util/Map;

    .line 970
    .line 971
    .line 972
    return-void

    .line 973
    :pswitch_5
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 974
    .line 975
    check-cast v0, Lio/sentry/android/core/anr/AnrProfilingIntegration;

    .line 976
    .line 977
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 978
    .line 979
    .line 980
    move-result-wide v1

    .line 981
    iput-wide v1, v0, Lio/sentry/android/core/anr/AnrProfilingIntegration;->e:J

    .line 982
    .line 983
    return-void

    .line 984
    :pswitch_6
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 985
    .line 986
    check-cast v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;

    .line 987
    .line 988
    iget-object v1, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 989
    .line 990
    invoke-virtual {v0, v1}, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->h(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 991
    .line 992
    .line 993
    return-void

    .line 994
    :pswitch_7
    const/16 v17, 0x0

    .line 995
    .line 996
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 997
    .line 998
    check-cast v0, Lio/sentry/android/core/o1;

    .line 999
    .line 1000
    iget-object v0, v0, Lio/sentry/android/core/o1;->g:Lsz;

    .line 1001
    .line 1002
    :goto_1c
    iget-object v1, v0, Lsz;->d:Ljava/lang/Object;

    .line 1003
    .line 1004
    check-cast v1, Lio/sentry/android/core/n1;

    .line 1005
    .line 1006
    if-eqz v1, :cond_24

    .line 1007
    .line 1008
    iget-object v2, v1, Lio/sentry/android/core/n1;->c:Lio/sentry/android/core/n1;

    .line 1009
    .line 1010
    iput-object v2, v0, Lsz;->d:Ljava/lang/Object;

    .line 1011
    .line 1012
    iget-object v2, v0, Lsz;->c:Ljava/lang/Object;

    .line 1013
    .line 1014
    check-cast v2, Lio/sentry/android/core/o0;

    .line 1015
    .line 1016
    iget-object v3, v2, Lio/sentry/android/core/o0;->a:Ljava/lang/Object;

    .line 1017
    .line 1018
    check-cast v3, Lio/sentry/android/core/n1;

    .line 1019
    .line 1020
    iput-object v3, v1, Lio/sentry/android/core/n1;->c:Lio/sentry/android/core/n1;

    .line 1021
    .line 1022
    iput-object v1, v2, Lio/sentry/android/core/o0;->a:Ljava/lang/Object;

    .line 1023
    .line 1024
    goto :goto_1c

    .line 1025
    :cond_24
    move-object/from16 v1, v17

    .line 1026
    .line 1027
    iput-object v1, v0, Lsz;->e:Ljava/lang/Object;

    .line 1028
    .line 1029
    const/4 v10, 0x0

    .line 1030
    iput v10, v0, Lsz;->a:I

    .line 1031
    .line 1032
    iput v10, v0, Lsz;->b:I

    .line 1033
    .line 1034
    return-void

    .line 1035
    :pswitch_8
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1036
    .line 1037
    check-cast v0, Lio/sentry/android/core/f0;

    .line 1038
    .line 1039
    if-eqz v0, :cond_25

    .line 1040
    .line 1041
    sget-object v1, Landroidx/lifecycle/ProcessLifecycleOwner;->w:Landroidx/lifecycle/ProcessLifecycleOwner;

    .line 1042
    .line 1043
    iget-object v1, v1, Landroidx/lifecycle/ProcessLifecycleOwner;->f:Li71;

    .line 1044
    .line 1045
    invoke-virtual {v1, v0}, Li71;->b(Lf71;)V

    .line 1046
    .line 1047
    .line 1048
    :cond_25
    return-void

    .line 1049
    :pswitch_9
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1050
    .line 1051
    check-cast v0, Lio/sentry/android/core/t;

    .line 1052
    .line 1053
    const/4 v1, 0x0

    .line 1054
    const/4 v9, 0x1

    .line 1055
    invoke-virtual {v0, v1, v9}, Lio/sentry/android/core/t;->a(Ljava/util/List;Z)Lio/sentry/android/core/s;

    .line 1056
    .line 1057
    .line 1058
    return-void

    .line 1059
    :pswitch_a
    move v9, v3

    .line 1060
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1061
    .line 1062
    check-cast v0, Lio/sentry/android/core/h;

    .line 1063
    .line 1064
    invoke-virtual {v0, v9}, Lio/sentry/android/core/h;->h(Z)V

    .line 1065
    .line 1066
    .line 1067
    return-void

    .line 1068
    :pswitch_b
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1069
    .line 1070
    check-cast v0, Lio/sentry/android/core/d;

    .line 1071
    .line 1072
    iget-object v0, v0, Lio/sentry/android/core/d;->a:Ljava/lang/Object;

    .line 1073
    .line 1074
    check-cast v0, Lio/sentry/util/g;

    .line 1075
    .line 1076
    invoke-virtual {v0}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v0

    .line 1080
    check-cast v0, Landroidx/core/app/FrameMetricsAggregator;

    .line 1081
    .line 1082
    iget-object v0, v0, Landroidx/core/app/FrameMetricsAggregator;->a:Lur3;

    .line 1083
    .line 1084
    iget-object v1, v0, Lur3;->c:Ljava/lang/Object;

    .line 1085
    .line 1086
    check-cast v1, Ljava/util/ArrayList;

    .line 1087
    .line 1088
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1089
    .line 1090
    .line 1091
    move-result v2

    .line 1092
    const/16 v18, 0x1

    .line 1093
    .line 1094
    add-int/lit8 v2, v2, -0x1

    .line 1095
    .line 1096
    :goto_1d
    if-ltz v2, :cond_27

    .line 1097
    .line 1098
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v3

    .line 1102
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 1103
    .line 1104
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v4

    .line 1108
    check-cast v4, Landroid/app/Activity;

    .line 1109
    .line 1110
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v3

    .line 1114
    if-eqz v3, :cond_26

    .line 1115
    .line 1116
    invoke-virtual {v4}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v3

    .line 1120
    iget-object v4, v0, Lur3;->d:Ljava/lang/Object;

    .line 1121
    .line 1122
    check-cast v4, Lsn0;

    .line 1123
    .line 1124
    invoke-virtual {v3, v4}, Landroid/view/Window;->removeOnFrameMetricsAvailableListener(Landroid/view/Window$OnFrameMetricsAvailableListener;)V

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1128
    .line 1129
    .line 1130
    :cond_26
    add-int/lit8 v2, v2, -0x1

    .line 1131
    .line 1132
    goto :goto_1d

    .line 1133
    :cond_27
    return-void

    .line 1134
    :pswitch_c
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1135
    .line 1136
    check-cast v0, Lio/sentry/android/core/a;

    .line 1137
    .line 1138
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1139
    .line 1140
    .line 1141
    move-result-wide v1

    .line 1142
    iput-wide v1, v0, Lio/sentry/android/core/a;->v:J

    .line 1143
    .line 1144
    iget-object v0, v0, Lio/sentry/android/core/a;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1145
    .line 1146
    const/4 v10, 0x0

    .line 1147
    invoke-virtual {v0, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1148
    .line 1149
    .line 1150
    return-void

    .line 1151
    :pswitch_d
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1152
    .line 1153
    check-cast v0, Ljava/io/File;

    .line 1154
    .line 1155
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v0

    .line 1159
    if-nez v0, :cond_28

    .line 1160
    .line 1161
    goto :goto_1f

    .line 1162
    :cond_28
    array-length v1, v0

    .line 1163
    const/4 v4, 0x0

    .line 1164
    :goto_1e
    if-ge v4, v1, :cond_2a

    .line 1165
    .line 1166
    aget-object v2, v0, v4

    .line 1167
    .line 1168
    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    .line 1169
    .line 1170
    .line 1171
    move-result-wide v5

    .line 1172
    sget-wide v7, Lio/sentry/m4;->f:J

    .line 1173
    .line 1174
    const-wide/32 v9, 0x493e0

    .line 1175
    .line 1176
    .line 1177
    sub-long/2addr v7, v9

    .line 1178
    cmp-long v3, v5, v7

    .line 1179
    .line 1180
    if-gez v3, :cond_29

    .line 1181
    .line 1182
    invoke-static {v2}, Lio/sentry/util/c;->f(Ljava/io/File;)Z

    .line 1183
    .line 1184
    .line 1185
    :cond_29
    add-int/lit8 v4, v4, 0x1

    .line 1186
    .line 1187
    goto :goto_1e

    .line 1188
    :cond_2a
    :goto_1f
    return-void

    .line 1189
    :pswitch_e
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1190
    .line 1191
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1192
    .line 1193
    invoke-static {v0}, Lcom/appsflyer/AFLogger;->a(Lkotlin/jvm/functions/Function1;)V

    .line 1194
    .line 1195
    .line 1196
    return-void

    .line 1197
    :pswitch_f
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1198
    .line 1199
    check-cast v0, Lra2;

    .line 1200
    .line 1201
    iget-object v1, v0, Lra2;->d:Ljava/lang/Object;

    .line 1202
    .line 1203
    check-cast v1, Ls52;

    .line 1204
    .line 1205
    new-instance v2, Lx6;

    .line 1206
    .line 1207
    const/16 v3, 0x16

    .line 1208
    .line 1209
    invoke-direct {v2, v0, v3}, Lx6;-><init>(Ljava/lang/Object;I)V

    .line 1210
    .line 1211
    .line 1212
    invoke-virtual {v1, v2}, Ls52;->k(Lbk2;)Ljava/lang/Object;

    .line 1213
    .line 1214
    .line 1215
    return-void

    .line 1216
    :pswitch_10
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1217
    .line 1218
    check-cast v0, Lb93;

    .line 1219
    .line 1220
    const-string v1, "FirebaseMessaging"

    .line 1221
    .line 1222
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1223
    .line 1224
    const-string v3, "Service took too long to process intent: "

    .line 1225
    .line 1226
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1227
    .line 1228
    .line 1229
    iget-object v3, v0, Lb93;->a:Landroid/content/Intent;

    .line 1230
    .line 1231
    invoke-virtual {v3}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v3

    .line 1235
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1236
    .line 1237
    .line 1238
    const-string v3, " finishing."

    .line 1239
    .line 1240
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1241
    .line 1242
    .line 1243
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v2

    .line 1247
    invoke-static {v1, v2}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 1248
    .line 1249
    .line 1250
    iget-object v0, v0, Lb93;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 1251
    .line 1252
    const/4 v1, 0x0

    .line 1253
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 1254
    .line 1255
    .line 1256
    return-void

    .line 1257
    :pswitch_11
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1258
    .line 1259
    check-cast v0, Lwv2;

    .line 1260
    .line 1261
    invoke-static {v0}, Lwv2;->j(Lwv2;)V

    .line 1262
    .line 1263
    .line 1264
    return-void

    .line 1265
    :pswitch_12
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1266
    .line 1267
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 1268
    .line 1269
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 1270
    .line 1271
    .line 1272
    return-void

    .line 1273
    :pswitch_13
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1274
    .line 1275
    check-cast v0, Lcom/usercentrics/sdk/ui/components/UCControllerId;

    .line 1276
    .line 1277
    sget-object v1, Lcom/usercentrics/sdk/ui/components/UCControllerId;->Companion:Lbu2;

    .line 1278
    .line 1279
    invoke-virtual {v0}, Lcom/usercentrics/sdk/ui/components/UCControllerId;->l()V

    .line 1280
    .line 1281
    .line 1282
    return-void

    .line 1283
    :pswitch_14
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1284
    .line 1285
    check-cast v0, Lbt2;

    .line 1286
    .line 1287
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1288
    .line 1289
    .line 1290
    new-instance v1, Landroidx/transition/Slide;

    .line 1291
    .line 1292
    invoke-direct {v1}, Landroidx/transition/Visibility;-><init>()V

    .line 1293
    .line 1294
    .line 1295
    sget-object v2, Landroidx/transition/Slide;->t0:Lye2;

    .line 1296
    .line 1297
    iput-object v2, v1, Landroidx/transition/Slide;->l0:Lze2;

    .line 1298
    .line 1299
    const/16 v2, 0x50

    .line 1300
    .line 1301
    invoke-virtual {v1, v2}, Landroidx/transition/Slide;->M(I)V

    .line 1302
    .line 1303
    .line 1304
    const-wide/16 v2, 0x12c

    .line 1305
    .line 1306
    iput-wide v2, v1, Landroidx/transition/Transition;->c:J

    .line 1307
    .line 1308
    iget-object v4, v0, Lbt2;->d:Lys2;

    .line 1309
    .line 1310
    invoke-virtual {v1, v4}, Landroidx/transition/Transition;->b(Landroid/view/View;)V

    .line 1311
    .line 1312
    .line 1313
    invoke-static {v4, v1}, Llr2;->a(Landroid/view/ViewGroup;Landroidx/transition/Transition;)V

    .line 1314
    .line 1315
    .line 1316
    const/4 v10, 0x0

    .line 1317
    invoke-virtual {v4, v10}, Landroid/view/View;->setVisibility(I)V

    .line 1318
    .line 1319
    .line 1320
    new-instance v1, Landroidx/transition/Fade;

    .line 1321
    .line 1322
    const/4 v9, 0x1

    .line 1323
    invoke-direct {v1, v9}, Landroidx/transition/Fade;-><init>(I)V

    .line 1324
    .line 1325
    .line 1326
    iput-wide v2, v1, Landroidx/transition/Transition;->c:J

    .line 1327
    .line 1328
    invoke-virtual {v0}, Lbt2;->a()Landroid/widget/FrameLayout;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v2

    .line 1332
    invoke-virtual {v1, v2}, Landroidx/transition/Transition;->b(Landroid/view/View;)V

    .line 1333
    .line 1334
    .line 1335
    invoke-virtual {v0}, Lbt2;->a()Landroid/widget/FrameLayout;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v2

    .line 1339
    invoke-static {v2, v1}, Llr2;->a(Landroid/view/ViewGroup;Landroidx/transition/Transition;)V

    .line 1340
    .line 1341
    .line 1342
    invoke-virtual {v0}, Lbt2;->a()Landroid/widget/FrameLayout;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v0

    .line 1346
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 1347
    .line 1348
    .line 1349
    return-void

    .line 1350
    :pswitch_15
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1351
    .line 1352
    check-cast v0, Lcom/supercell/titan/TitanWebView$TitanWebViewClient;

    .line 1353
    .line 1354
    iget-object v1, v0, Lcom/supercell/titan/TitanWebView$TitanWebViewClient;->b:Lcom/supercell/titan/TitanWebView;

    .line 1355
    .line 1356
    iget-object v2, v1, Lcom/supercell/titan/TitanWebView;->o:Landroid/webkit/WebView;

    .line 1357
    .line 1358
    invoke-virtual {v2}, Landroid/webkit/WebView;->canGoBack()Z

    .line 1359
    .line 1360
    .line 1361
    move-result v2

    .line 1362
    iput-boolean v2, v1, Lcom/supercell/titan/TitanWebView;->a:Z

    .line 1363
    .line 1364
    iget-object v0, v0, Lcom/supercell/titan/TitanWebView$TitanWebViewClient;->a:Lcom/supercell/titan/TitanWebView;

    .line 1365
    .line 1366
    iget-object v1, v0, Lcom/supercell/titan/TitanWebView;->f:Landroid/widget/ImageView;

    .line 1367
    .line 1368
    if-eqz v1, :cond_2c

    .line 1369
    .line 1370
    iget-boolean v0, v0, Lcom/supercell/titan/TitanWebView;->j:Z

    .line 1371
    .line 1372
    if-eqz v0, :cond_2b

    .line 1373
    .line 1374
    if-eqz v2, :cond_2b

    .line 1375
    .line 1376
    const/4 v4, 0x0

    .line 1377
    goto :goto_20

    .line 1378
    :cond_2b
    const/16 v4, 0x8

    .line 1379
    .line 1380
    :goto_20
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1381
    .line 1382
    .line 1383
    :cond_2c
    return-void

    .line 1384
    :pswitch_16
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1385
    .line 1386
    check-cast v0, Lop2;

    .line 1387
    .line 1388
    iget-object v0, v0, Lop2;->a:Lcom/supercell/titan/TitanWebView;

    .line 1389
    .line 1390
    invoke-virtual {v0}, Lcom/supercell/titan/TitanWebView;->onSwipeRight()V

    .line 1391
    .line 1392
    .line 1393
    return-void

    .line 1394
    :pswitch_17
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1395
    .line 1396
    check-cast v0, Lcom/supercell/titan/GameApp;

    .line 1397
    .line 1398
    iget v1, v0, Lcom/supercell/titan/GameApp;->requestedOrientation:I

    .line 1399
    .line 1400
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 1401
    .line 1402
    .line 1403
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v0

    .line 1407
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v0

    .line 1411
    sget v1, Lcom/supercell/titan/R$id;->stage:I

    .line 1412
    .line 1413
    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v0

    .line 1417
    if-eqz v0, :cond_2d

    .line 1418
    .line 1419
    const/4 v10, 0x0

    .line 1420
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 1421
    .line 1422
    .line 1423
    :cond_2d
    return-void

    .line 1424
    :pswitch_18
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1425
    .line 1426
    check-cast v0, Ljava/lang/Runnable;

    .line 1427
    .line 1428
    const/16 v1, 0xa

    .line 1429
    .line 1430
    invoke-static {v1}, Landroid/os/Process;->setThreadPriority(I)V

    .line 1431
    .line 1432
    .line 1433
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1434
    .line 1435
    .line 1436
    return-void

    .line 1437
    :pswitch_19
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1438
    .line 1439
    check-cast v0, Lqm2;

    .line 1440
    .line 1441
    invoke-virtual {v0}, Lqm2;->c()V

    .line 1442
    .line 1443
    .line 1444
    return-void

    .line 1445
    :pswitch_1a
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1446
    .line 1447
    check-cast v0, Lac1;

    .line 1448
    .line 1449
    iget-object v0, v0, Lac1;->d:Ljava/lang/Object;

    .line 1450
    .line 1451
    check-cast v0, Ldb0;

    .line 1452
    .line 1453
    if-eqz v0, :cond_2e

    .line 1454
    .line 1455
    invoke-virtual {v0}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v0

    .line 1459
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v0

    .line 1463
    :goto_21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1464
    .line 1465
    .line 1466
    move-result v1

    .line 1467
    if-eqz v1, :cond_2e

    .line 1468
    .line 1469
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v1

    .line 1473
    check-cast v1, Llj2;

    .line 1474
    .line 1475
    invoke-virtual {v1}, Llj2;->b()V

    .line 1476
    .line 1477
    .line 1478
    goto :goto_21

    .line 1479
    :cond_2e
    return-void

    .line 1480
    :pswitch_1b
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1481
    .line 1482
    check-cast v0, Lb5;

    .line 1483
    .line 1484
    iget-object v1, v0, Lb5;->e:Ljava/lang/Object;

    .line 1485
    .line 1486
    check-cast v1, Ljava/util/ArrayDeque;

    .line 1487
    .line 1488
    monitor-enter v1

    .line 1489
    :try_start_7
    iget-object v2, v0, Lb5;->b:Ljava/lang/Object;

    .line 1490
    .line 1491
    check-cast v2, Landroid/content/SharedPreferences;

    .line 1492
    .line 1493
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v2

    .line 1497
    iget-object v3, v0, Lb5;->c:Ljava/lang/Object;

    .line 1498
    .line 1499
    check-cast v3, Ljava/lang/String;

    .line 1500
    .line 1501
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1502
    .line 1503
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1504
    .line 1505
    .line 1506
    iget-object v5, v0, Lb5;->e:Ljava/lang/Object;

    .line 1507
    .line 1508
    check-cast v5, Ljava/util/ArrayDeque;

    .line 1509
    .line 1510
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v5

    .line 1514
    :goto_22
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1515
    .line 1516
    .line 1517
    move-result v6

    .line 1518
    if-eqz v6, :cond_2f

    .line 1519
    .line 1520
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v6

    .line 1524
    check-cast v6, Ljava/lang/String;

    .line 1525
    .line 1526
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1527
    .line 1528
    .line 1529
    iget-object v6, v0, Lb5;->d:Ljava/lang/Object;

    .line 1530
    .line 1531
    check-cast v6, Ljava/lang/String;

    .line 1532
    .line 1533
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1534
    .line 1535
    .line 1536
    goto :goto_22

    .line 1537
    :cond_2f
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v0

    .line 1541
    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v0

    .line 1545
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1546
    .line 1547
    .line 1548
    monitor-exit v1

    .line 1549
    return-void

    .line 1550
    :catchall_6
    move-exception v0

    .line 1551
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 1552
    throw v0

    .line 1553
    :pswitch_1c
    iget-object v0, v0, Lf72;->b:Ljava/lang/Object;

    .line 1554
    .line 1555
    check-cast v0, Lcom/supercell/titan/ScInfoBox;

    .line 1556
    .line 1557
    iget-object v1, v0, Lcom/supercell/titan/ScInfoBox;->e:Landroid/widget/LinearLayout;

    .line 1558
    .line 1559
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v1

    .line 1563
    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 1564
    .line 1565
    if-eqz v1, :cond_30

    .line 1566
    .line 1567
    iget-object v0, v0, Lcom/supercell/titan/ScInfoBox;->e:Landroid/widget/LinearLayout;

    .line 1568
    .line 1569
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1570
    .line 1571
    .line 1572
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1573
    .line 1574
    .line 1575
    move-result v0

    .line 1576
    if-nez v0, :cond_30

    .line 1577
    .line 1578
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v0

    .line 1582
    check-cast v0, Landroid/view/ViewGroup;

    .line 1583
    .line 1584
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1585
    .line 1586
    .line 1587
    :cond_30
    return-void

    .line 1588
    nop

    .line 1589
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
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

.class public final synthetic Lio/sentry/android/core/internal/util/l;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/PixelCopy$OnPixelCopyFinishedListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lio/sentry/android/core/internal/util/l;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lio/sentry/android/core/internal/util/l;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lio/sentry/android/core/internal/util/l;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onPixelCopyFinished(I)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lio/sentry/android/core/internal/util/l;->a:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, v0, Lio/sentry/android/core/internal/util/l;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v0, v0, Lio/sentry/android/core/internal/util/l;->b:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v6, v0

    .line 15
    check-cast v6, Lio/sentry/android/replay/screenshot/h;

    .line 16
    .line 17
    move-object v7, v4

    .line 18
    check-cast v7, Landroid/view/View;

    .line 19
    .line 20
    iget-object v0, v6, Lio/sentry/android/replay/screenshot/h;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    iget-object v1, v6, Lio/sentry/android/replay/screenshot/h;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 23
    .line 24
    iget-object v4, v6, Lio/sentry/android/replay/screenshot/h;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 25
    .line 26
    iget-object v5, v6, Lio/sentry/android/replay/screenshot/h;->b:Lio/sentry/android/core/SentryAndroidOptions;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sget-object v1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 39
    .line 40
    const-string v3, "PixelCopyStrategy is closed, ignoring capture result"

    .line 41
    .line 42
    new-array v2, v2, [Ljava/lang/Object;

    .line 43
    .line 44
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_c

    .line 48
    .line 49
    :cond_0
    if-eqz p1, :cond_1

    .line 50
    .line 51
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sget-object v3, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 56
    .line 57
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    const-string v6, "Failed to capture replay recording: %d"

    .line 66
    .line 67
    invoke-interface {v0, v3, v6, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_c

    .line 77
    .line 78
    :cond_1
    iget-object v0, v6, Lio/sentry/android/replay/screenshot/h;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-gt v4, v3, :cond_2

    .line 91
    .line 92
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    sget-object v3, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 97
    .line 98
    const-string v4, "Failed to determine view hierarchy, not capturing"

    .line 99
    .line 100
    new-array v5, v2, [Ljava/lang/Object;

    .line 101
    .line 102
    invoke-interface {v0, v3, v4, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 106
    .line 107
    .line 108
    goto/16 :goto_c

    .line 109
    .line 110
    :cond_2
    invoke-virtual {v5}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    const/4 v4, 0x0

    .line 118
    invoke-static {v7, v4, v1}, Lio/sentry/config/a;->i(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/h;Lta;)Lio/sentry/android/replay/viewhierarchy/h;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    invoke-virtual {v5}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    iget-boolean v1, v1, Lio/sentry/q6;->o:Z

    .line 127
    .line 128
    if-eqz v1, :cond_3

    .line 129
    .line 130
    new-instance v1, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_3
    move-object v1, v4

    .line 137
    :goto_0
    invoke-virtual {v5}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 145
    .line 146
    .line 147
    move-result-object v10

    .line 148
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-static {v7, v9, v8, v10, v1}, Lio/sentry/config/a;->v(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/h;Lta;Lio/sentry/ILogger;Ljava/util/List;)V

    .line 152
    .line 153
    .line 154
    if-eqz v1, :cond_4

    .line 155
    .line 156
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    if-eqz v8, :cond_5

    .line 161
    .line 162
    :cond_4
    move-object v14, v9

    .line 163
    goto/16 :goto_b

    .line 164
    .line 165
    :cond_5
    iget-object v8, v6, Lio/sentry/android/replay/screenshot/h;->d:Lf8;

    .line 166
    .line 167
    invoke-virtual {v8}, Lf8;->invoke()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    xor-int/lit8 v12, v0, 0x1

    .line 171
    .line 172
    iget-object v8, v6, Lio/sentry/android/replay/screenshot/h;->s:[I

    .line 173
    .line 174
    iget-object v0, v6, Lio/sentry/android/replay/screenshot/h;->r:[I

    .line 175
    .line 176
    invoke-virtual {v7, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 177
    .line 178
    .line 179
    aget v10, v0, v2

    .line 180
    .line 181
    aget v11, v0, v3

    .line 182
    .line 183
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    new-array v13, v0, [Lcd1;

    .line 188
    .line 189
    move/from16 v17, v12

    .line 190
    .line 191
    new-instance v12, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 192
    .line 193
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    invoke-direct {v12, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 198
    .line 199
    .line 200
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    move-object v14, v9

    .line 205
    move v9, v2

    .line 206
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_a

    .line 211
    .line 212
    add-int/lit8 v18, v9, 0x1

    .line 213
    .line 214
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    check-cast v0, Lio/sentry/android/replay/viewhierarchy/f;

    .line 219
    .line 220
    iget-object v0, v0, Lio/sentry/android/replay/viewhierarchy/f;->h:Ljava/lang/ref/WeakReference;

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, Landroid/view/SurfaceView;

    .line 227
    .line 228
    if-eqz v0, :cond_6

    .line 229
    .line 230
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 231
    .line 232
    .line 233
    move-result-object v15

    .line 234
    if-eqz v15, :cond_6

    .line 235
    .line 236
    invoke-interface {v15}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 237
    .line 238
    .line 239
    move-result-object v15

    .line 240
    goto :goto_2

    .line 241
    :cond_6
    move-object v15, v4

    .line 242
    :goto_2
    if-eqz v0, :cond_7

    .line 243
    .line 244
    if-eqz v15, :cond_7

    .line 245
    .line 246
    invoke-virtual {v15}, Landroid/view/Surface;->isValid()Z

    .line 247
    .line 248
    .line 249
    move-result v15

    .line 250
    if-nez v15, :cond_8

    .line 251
    .line 252
    :cond_7
    move/from16 v19, v2

    .line 253
    .line 254
    move/from16 v20, v3

    .line 255
    .line 256
    move-object v3, v5

    .line 257
    move-object v2, v8

    .line 258
    move-object v5, v12

    .line 259
    move-object v8, v13

    .line 260
    move-object v9, v14

    .line 261
    move/from16 v12, v17

    .line 262
    .line 263
    goto/16 :goto_9

    .line 264
    .line 265
    :cond_8
    :try_start_0
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 266
    .line 267
    .line 268
    move-result v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 269
    move/from16 v19, v2

    .line 270
    .line 271
    :try_start_1
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 272
    .line 273
    .line 274
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    .line 275
    move/from16 v20, v3

    .line 276
    .line 277
    :try_start_2
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 278
    .line 279
    invoke-static {v15, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 280
    .line 281
    .line 282
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 283
    :try_start_3
    invoke-virtual {v0, v8}, Landroid/view/View;->getLocationOnScreen([I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 284
    .line 285
    .line 286
    move v15, v10

    .line 287
    :try_start_4
    aget v10, v8, v19
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 288
    .line 289
    move/from16 v16, v11

    .line 290
    .line 291
    :try_start_5
    aget v11, v8, v20
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 292
    .line 293
    move-object v3, v5

    .line 294
    :try_start_6
    new-instance v5, Lio/sentry/android/replay/screenshot/d;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 295
    .line 296
    move-object/from16 v21, v7

    .line 297
    .line 298
    move-object v7, v2

    .line 299
    move-object v2, v8

    .line 300
    move-object v8, v13

    .line 301
    move-object/from16 v13, v21

    .line 302
    .line 303
    :try_start_7
    invoke-direct/range {v5 .. v17}, Lio/sentry/android/replay/screenshot/d;-><init>(Lio/sentry/android/replay/screenshot/h;Landroid/graphics/Bitmap;[Lcd1;IIILjava/util/concurrent/atomic/AtomicInteger;Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/h;IIZ)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 304
    .line 305
    .line 306
    move-object v9, v5

    .line 307
    move-object v5, v12

    .line 308
    :try_start_8
    iget-object v10, v6, Lio/sentry/android/replay/screenshot/h;->f:Lio/sentry/s6;

    .line 309
    .line 310
    iget-object v10, v10, Lio/sentry/s6;->b:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v10, Landroid/os/Handler;

    .line 313
    .line 314
    invoke-static {v0, v7, v9, v10}, Landroid/view/PixelCopy;->request(Landroid/view/SurfaceView;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 315
    .line 316
    .line 317
    move-object v7, v13

    .line 318
    goto/16 :goto_a

    .line 319
    .line 320
    :catchall_0
    move-exception v0

    .line 321
    goto/16 :goto_7

    .line 322
    .line 323
    :catchall_1
    move-exception v0

    .line 324
    :goto_3
    move-object v5, v12

    .line 325
    goto/16 :goto_7

    .line 326
    .line 327
    :catchall_2
    move-exception v0

    .line 328
    move-object v5, v7

    .line 329
    move-object v7, v2

    .line 330
    move-object v2, v8

    .line 331
    move-object v8, v13

    .line 332
    move-object v13, v5

    .line 333
    goto :goto_3

    .line 334
    :catchall_3
    move-exception v0

    .line 335
    move-object v3, v7

    .line 336
    move-object v7, v2

    .line 337
    move-object v2, v8

    .line 338
    move-object v8, v13

    .line 339
    move-object v13, v3

    .line 340
    move-object v3, v5

    .line 341
    goto :goto_3

    .line 342
    :catchall_4
    move-exception v0

    .line 343
    move-object v3, v7

    .line 344
    move-object v7, v2

    .line 345
    move-object v2, v8

    .line 346
    move-object v8, v13

    .line 347
    move-object v13, v3

    .line 348
    move-object v3, v5

    .line 349
    :goto_4
    move/from16 v16, v11

    .line 350
    .line 351
    goto :goto_3

    .line 352
    :catchall_5
    move-exception v0

    .line 353
    move-object v3, v7

    .line 354
    move-object v7, v2

    .line 355
    move-object v2, v8

    .line 356
    move-object v8, v13

    .line 357
    move-object v13, v3

    .line 358
    move-object v3, v5

    .line 359
    move v15, v10

    .line 360
    goto :goto_4

    .line 361
    :catchall_6
    move-exception v0

    .line 362
    :goto_5
    move-object v3, v5

    .line 363
    move-object v2, v8

    .line 364
    move v15, v10

    .line 365
    move/from16 v16, v11

    .line 366
    .line 367
    move-object v5, v12

    .line 368
    move-object v8, v13

    .line 369
    move-object v13, v7

    .line 370
    move-object v7, v4

    .line 371
    goto :goto_7

    .line 372
    :catchall_7
    move-exception v0

    .line 373
    :goto_6
    move/from16 v20, v3

    .line 374
    .line 375
    goto :goto_5

    .line 376
    :catchall_8
    move-exception v0

    .line 377
    move/from16 v19, v2

    .line 378
    .line 379
    goto :goto_6

    .line 380
    :goto_7
    invoke-virtual {v3}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 381
    .line 382
    .line 383
    move-result-object v9

    .line 384
    sget-object v10, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 385
    .line 386
    const-string v11, "Failed to capture SurfaceView"

    .line 387
    .line 388
    invoke-interface {v9, v10, v11, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 389
    .line 390
    .line 391
    if-eqz v7, :cond_9

    .line 392
    .line 393
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V

    .line 394
    .line 395
    .line 396
    :cond_9
    move-object v7, v13

    .line 397
    move-object v9, v14

    .line 398
    move v10, v15

    .line 399
    move/from16 v11, v16

    .line 400
    .line 401
    move/from16 v12, v17

    .line 402
    .line 403
    invoke-static/range {v5 .. v12}, Lio/sentry/android/replay/screenshot/h;->e(Ljava/util/concurrent/atomic/AtomicInteger;Lio/sentry/android/replay/screenshot/h;Landroid/view/View;[Lcd1;Lio/sentry/android/replay/viewhierarchy/h;IIZ)V

    .line 404
    .line 405
    .line 406
    :goto_8
    move-object v14, v9

    .line 407
    move v15, v10

    .line 408
    move/from16 v16, v11

    .line 409
    .line 410
    move/from16 v17, v12

    .line 411
    .line 412
    goto :goto_a

    .line 413
    :goto_9
    invoke-static/range {v5 .. v12}, Lio/sentry/android/replay/screenshot/h;->e(Ljava/util/concurrent/atomic/AtomicInteger;Lio/sentry/android/replay/screenshot/h;Landroid/view/View;[Lcd1;Lio/sentry/android/replay/viewhierarchy/h;IIZ)V

    .line 414
    .line 415
    .line 416
    goto :goto_8

    .line 417
    :goto_a
    move-object v12, v5

    .line 418
    move-object v13, v8

    .line 419
    move v10, v15

    .line 420
    move/from16 v11, v16

    .line 421
    .line 422
    move/from16 v9, v18

    .line 423
    .line 424
    move-object v8, v2

    .line 425
    move-object v5, v3

    .line 426
    move/from16 v2, v19

    .line 427
    .line 428
    move/from16 v3, v20

    .line 429
    .line 430
    goto/16 :goto_1

    .line 431
    .line 432
    :goto_b
    iget-object v1, v6, Lio/sentry/android/replay/screenshot/h;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 433
    .line 434
    new-instance v2, Lio/sentry/android/replay/util/h;

    .line 435
    .line 436
    new-instance v3, Lgp2;

    .line 437
    .line 438
    invoke-direct {v3, v6, v7, v14, v0}, Lgp2;-><init>(Lio/sentry/android/replay/screenshot/h;Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/h;Z)V

    .line 439
    .line 440
    .line 441
    const-string v0, "screenshot_recorder.mask"

    .line 442
    .line 443
    invoke-direct {v2, v3, v0}, Lio/sentry/android/replay/util/h;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 447
    .line 448
    .line 449
    :cond_a
    :goto_c
    return-void

    .line 450
    :pswitch_0
    move/from16 v19, v2

    .line 451
    .line 452
    move/from16 v20, v3

    .line 453
    .line 454
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 455
    .line 456
    check-cast v4, Ljava/util/concurrent/CountDownLatch;

    .line 457
    .line 458
    if-nez p1, :cond_b

    .line 459
    .line 460
    move/from16 v2, v20

    .line 461
    .line 462
    goto :goto_d

    .line 463
    :cond_b
    move/from16 v2, v19

    .line 464
    .line 465
    :goto_d
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v4}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 469
    .line 470
    .line 471
    return-void

    .line 472
    nop

    .line 473
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

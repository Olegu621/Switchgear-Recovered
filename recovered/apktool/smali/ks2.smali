.class public abstract Lks2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Lhu0;

.field public static final b:Lua1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lps2;

    .line 8
    .line 9
    invoke-direct {v0}, Lhu0;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lks2;->a:Lhu0;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/16 v1, 0x1c

    .line 16
    .line 17
    if-lt v0, v1, :cond_1

    .line 18
    .line 19
    new-instance v0, Los2;

    .line 20
    .line 21
    invoke-direct {v0}, Lns2;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lks2;->a:Lhu0;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/16 v1, 0x1a

    .line 28
    .line 29
    if-lt v0, v1, :cond_2

    .line 30
    .line 31
    new-instance v0, Lns2;

    .line 32
    .line 33
    invoke-direct {v0}, Lns2;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lks2;->a:Lhu0;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    sget-object v0, Lms2;->g:Ljava/lang/reflect/Method;

    .line 40
    .line 41
    if-nez v0, :cond_3

    .line 42
    .line 43
    const-string v1, "TypefaceCompatApi24Impl"

    .line 44
    .line 45
    const-string v2, "Unable to collect necessary private methods.Fallback to legacy implementation."

    .line 46
    .line 47
    invoke-static {v1, v2}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    :cond_3
    if-eqz v0, :cond_4

    .line 51
    .line 52
    new-instance v0, Lms2;

    .line 53
    .line 54
    invoke-direct {v0}, Lhu0;-><init>()V

    .line 55
    .line 56
    .line 57
    sput-object v0, Lks2;->a:Lhu0;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    new-instance v0, Lls2;

    .line 61
    .line 62
    invoke-direct {v0}, Lhu0;-><init>()V

    .line 63
    .line 64
    .line 65
    sput-object v0, Lks2;->a:Lhu0;

    .line 66
    .line 67
    :goto_0
    new-instance v0, Lua1;

    .line 68
    .line 69
    const/16 v1, 0x10

    .line 70
    .line 71
    invoke-direct {v0, v1}, Lua1;-><init>(I)V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lks2;->b:Lua1;

    .line 75
    .line 76
    return-void
.end method

.method public static a(Landroid/content/Context;Lrl0;Landroid/content/res/Resources;ILjava/lang/String;IILde3;Z)Landroid/graphics/Typeface;
    .locals 14

    .line 1
    move/from16 v4, p6

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    instance-of v2, p1, Lul0;

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v6, -0x3

    .line 9
    if-eqz v2, :cond_d

    .line 10
    .line 11
    move-object v0, p1

    .line 12
    check-cast v0, Lul0;

    .line 13
    .line 14
    iget-object v2, v0, Lul0;->d:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v8, 0x0

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v2, v8}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v5, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 32
    .line 33
    invoke-static {v5, v8}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {v2, v5}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-nez v5, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    move-object v2, v7

    .line 47
    :goto_1
    if-eqz v2, :cond_3

    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    new-instance p0, Landroid/os/Handler;

    .line 52
    .line 53
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Lji1;

    .line 61
    .line 62
    invoke-direct {v0, v3, v1, v2}, Lji1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 66
    .line 67
    .line 68
    :cond_2
    return-object v2

    .line 69
    :cond_3
    const/4 v2, 0x1

    .line 70
    if-eqz p8, :cond_5

    .line 71
    .line 72
    iget v5, v0, Lul0;->c:I

    .line 73
    .line 74
    if-nez v5, :cond_4

    .line 75
    .line 76
    :goto_2
    move v5, v2

    .line 77
    goto :goto_3

    .line 78
    :cond_4
    move v5, v8

    .line 79
    goto :goto_3

    .line 80
    :cond_5
    if-nez v1, :cond_4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :goto_3
    const/4 v9, -0x1

    .line 84
    if-eqz p8, :cond_6

    .line 85
    .line 86
    iget v10, v0, Lul0;->b:I

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_6
    move v10, v9

    .line 90
    :goto_4
    new-instance v11, Landroid/os/Handler;

    .line 91
    .line 92
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 93
    .line 94
    .line 95
    move-result-object v12

    .line 96
    invoke-direct {v11, v12}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 97
    .line 98
    .line 99
    new-instance v12, Lts0;

    .line 100
    .line 101
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v1, v12, Lts0;->a:Ljava/lang/Object;

    .line 105
    .line 106
    iget-object v0, v0, Lul0;->a:Lb5;

    .line 107
    .line 108
    new-instance v13, Lcb;

    .line 109
    .line 110
    const/16 v1, 0xc

    .line 111
    .line 112
    invoke-direct {v13, v1, v12, v11}, Lcb;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    if-eqz v5, :cond_9

    .line 116
    .line 117
    sget-object v1, Lpl0;->a:Lua1;

    .line 118
    .line 119
    new-instance v1, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    .line 123
    .line 124
    iget-object v2, v0, Lb5;->f:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v2, Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v2, "-"

    .line 132
    .line 133
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    sget-object v2, Lpl0;->a:Lua1;

    .line 144
    .line 145
    invoke-virtual {v2, v1}, Lua1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    check-cast v2, Landroid/graphics/Typeface;

    .line 150
    .line 151
    if-eqz v2, :cond_7

    .line 152
    .line 153
    new-instance p0, Lcp0;

    .line 154
    .line 155
    invoke-direct {p0, v3, v12, v2}, Lcp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v11, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 159
    .line 160
    .line 161
    move-object v7, v2

    .line 162
    goto/16 :goto_8

    .line 163
    .line 164
    :cond_7
    if-ne v10, v9, :cond_8

    .line 165
    .line 166
    invoke-static {v1, p0, v0, v4}, Lpl0;->a(Ljava/lang/String;Landroid/content/Context;Lb5;I)Lol0;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {v13, p0}, Lcb;->D(Lol0;)V

    .line 171
    .line 172
    .line 173
    iget-object v7, p0, Lol0;->a:Landroid/graphics/Typeface;

    .line 174
    .line 175
    goto/16 :goto_8

    .line 176
    .line 177
    :cond_8
    move-object v3, v0

    .line 178
    new-instance v0, Lnl0;

    .line 179
    .line 180
    const/4 v5, 0x0

    .line 181
    move-object v2, p0

    .line 182
    invoke-direct/range {v0 .. v5}, Lnl0;-><init>(Ljava/lang/String;Landroid/content/Context;Lb5;II)V

    .line 183
    .line 184
    .line 185
    :try_start_0
    sget-object p0, Lpl0;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 186
    .line 187
    invoke-interface {p0, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 188
    .line 189
    .line 190
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3

    .line 191
    int-to-long v0, v10

    .line 192
    :try_start_1
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 193
    .line 194
    invoke-interface {p0, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p0
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_2

    .line 198
    :try_start_2
    check-cast p0, Lol0;

    .line 199
    .line 200
    invoke-virtual {v13, p0}, Lcb;->D(Lol0;)V

    .line 201
    .line 202
    .line 203
    iget-object v7, p0, Lol0;->a:Landroid/graphics/Typeface;

    .line 204
    .line 205
    goto/16 :goto_8

    .line 206
    .line 207
    :catch_0
    move-exception v0

    .line 208
    move-object p0, v0

    .line 209
    goto :goto_5

    .line 210
    :catch_1
    move-exception v0

    .line 211
    move-object p0, v0

    .line 212
    goto :goto_6

    .line 213
    :catch_2
    new-instance p0, Ljava/lang/InterruptedException;

    .line 214
    .line 215
    const-string v0, "timeout"

    .line 216
    .line 217
    invoke-direct {p0, v0}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw p0

    .line 221
    :goto_5
    throw p0

    .line 222
    :goto_6
    new-instance v0, Ljava/lang/RuntimeException;

    .line 223
    .line 224
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 225
    .line 226
    .line 227
    throw v0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3

    .line 228
    :catch_3
    iget-object p0, v13, Lcb;->c:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast p0, Landroid/os/Handler;

    .line 231
    .line 232
    iget-object v0, v13, Lcb;->b:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v0, Lts0;

    .line 235
    .line 236
    new-instance v1, Lym;

    .line 237
    .line 238
    invoke-direct {v1, v0, v6, v8}, Lym;-><init>(Ljava/lang/Object;II)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 242
    .line 243
    .line 244
    goto/16 :goto_8

    .line 245
    .line 246
    :cond_9
    sget-object v1, Lpl0;->a:Lua1;

    .line 247
    .line 248
    new-instance v1, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 251
    .line 252
    .line 253
    iget-object v5, v0, Lb5;->f:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v5, Ljava/lang/String;

    .line 256
    .line 257
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    const-string v5, "-"

    .line 261
    .line 262
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    sget-object v5, Lpl0;->a:Lua1;

    .line 273
    .line 274
    invoke-virtual {v5, v1}, Lua1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    check-cast v5, Landroid/graphics/Typeface;

    .line 279
    .line 280
    if-eqz v5, :cond_a

    .line 281
    .line 282
    new-instance p0, Lcp0;

    .line 283
    .line 284
    invoke-direct {p0, v3, v12, v5}, Lcp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v11, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 288
    .line 289
    .line 290
    move-object v7, v5

    .line 291
    goto :goto_8

    .line 292
    :cond_a
    new-instance v3, Lac0;

    .line 293
    .line 294
    invoke-direct {v3, v13, v2}, Lac0;-><init>(Ljava/lang/Object;I)V

    .line 295
    .line 296
    .line 297
    sget-object v2, Lpl0;->c:Ljava/lang/Object;

    .line 298
    .line 299
    monitor-enter v2

    .line 300
    :try_start_3
    sget-object v5, Lpl0;->d:Lle2;

    .line 301
    .line 302
    invoke-virtual {v5, v1, v7}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    check-cast v6, Ljava/util/ArrayList;

    .line 307
    .line 308
    if-eqz v6, :cond_b

    .line 309
    .line 310
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    monitor-exit v2

    .line 314
    goto :goto_8

    .line 315
    :catchall_0
    move-exception v0

    .line 316
    move-object p0, v0

    .line 317
    goto :goto_9

    .line 318
    :cond_b
    new-instance v6, Ljava/util/ArrayList;

    .line 319
    .line 320
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    invoke-virtual {v5, v1, v6}, Lle2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 330
    move-object v3, v0

    .line 331
    new-instance v0, Lnl0;

    .line 332
    .line 333
    const/4 v5, 0x1

    .line 334
    move-object v2, p0

    .line 335
    invoke-direct/range {v0 .. v5}, Lnl0;-><init>(Ljava/lang/String;Landroid/content/Context;Lb5;II)V

    .line 336
    .line 337
    .line 338
    sget-object p0, Lpl0;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 339
    .line 340
    new-instance v2, Lac0;

    .line 341
    .line 342
    const/4 v3, 0x2

    .line 343
    invoke-direct {v2, v1, v3}, Lac0;-><init>(Ljava/lang/Object;I)V

    .line 344
    .line 345
    .line 346
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    if-nez v1, :cond_c

    .line 351
    .line 352
    new-instance v1, Landroid/os/Handler;

    .line 353
    .line 354
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 359
    .line 360
    .line 361
    goto :goto_7

    .line 362
    :cond_c
    new-instance v1, Landroid/os/Handler;

    .line 363
    .line 364
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 365
    .line 366
    .line 367
    :goto_7
    new-instance v3, Ljs0;

    .line 368
    .line 369
    invoke-direct {v3}, Ljs0;-><init>()V

    .line 370
    .line 371
    .line 372
    iput-object v0, v3, Ljs0;->b:Ljava/lang/Object;

    .line 373
    .line 374
    iput-object v2, v3, Ljs0;->c:Ljava/lang/Object;

    .line 375
    .line 376
    iput-object v1, v3, Ljs0;->d:Ljava/lang/Object;

    .line 377
    .line 378
    invoke-virtual {p0, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 379
    .line 380
    .line 381
    :goto_8
    move-object p0, v7

    .line 382
    move-object/from16 v7, p2

    .line 383
    .line 384
    goto :goto_a

    .line 385
    :goto_9
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 386
    throw p0

    .line 387
    :cond_d
    sget-object v2, Lks2;->a:Lhu0;

    .line 388
    .line 389
    move-object v0, p1

    .line 390
    check-cast v0, Lsl0;

    .line 391
    .line 392
    move-object/from16 v7, p2

    .line 393
    .line 394
    invoke-virtual {v2, p0, v0, v7, v4}, Lhu0;->P(Landroid/content/Context;Lsl0;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    .line 395
    .line 396
    .line 397
    move-result-object p0

    .line 398
    if-eqz v1, :cond_f

    .line 399
    .line 400
    if-eqz p0, :cond_e

    .line 401
    .line 402
    new-instance v0, Landroid/os/Handler;

    .line 403
    .line 404
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 409
    .line 410
    .line 411
    new-instance v2, Lji1;

    .line 412
    .line 413
    invoke-direct {v2, v3, v1, p0}, Lji1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 417
    .line 418
    .line 419
    goto :goto_a

    .line 420
    :cond_e
    invoke-virtual {v1, v6}, Lde3;->d(I)V

    .line 421
    .line 422
    .line 423
    :cond_f
    :goto_a
    if-eqz p0, :cond_10

    .line 424
    .line 425
    sget-object v0, Lks2;->b:Lua1;

    .line 426
    .line 427
    invoke-static/range {p2 .. p6}, Lks2;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    invoke-virtual {v0, v1, p0}, Lua1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    :cond_10
    return-object p0
.end method

.method public static b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x2d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.class public final synthetic Lio/sentry/k4;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/sentry/android/core/SentryAndroidOptions;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;I)V
    .locals 0

    .line 1
    iput p2, p0, Lio/sentry/k4;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lio/sentry/k4;->b:Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lio/sentry/k4;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/k4;->b:Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lio/sentry/m6;->getFlushTimeoutMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {p0, v0, v1}, Lio/sentry/c1;->b(J)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    invoke-virtual {p0}, Lio/sentry/m6;->getOptionsObservers()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const-string v2, "tags.json"

    .line 33
    .line 34
    if-eqz v1, :cond_6

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lio/sentry/w0;

    .line 41
    .line 42
    invoke-virtual {p0}, Lio/sentry/m6;->getRelease()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    move-object v4, v1

    .line 47
    check-cast v4, Lio/sentry/cache/e;

    .line 48
    .line 49
    const-string v5, "release.json"

    .line 50
    .line 51
    if-nez v3, :cond_0

    .line 52
    .line 53
    invoke-virtual {v4, v5}, Lio/sentry/cache/e;->a(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    invoke-virtual {v4, v3, v5}, Lio/sentry/cache/e;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :goto_1
    invoke-virtual {p0}, Lio/sentry/m6;->getProguardUuid()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v1, Lio/sentry/cache/e;

    .line 65
    .line 66
    const-string v4, "proguard-uuid.json"

    .line 67
    .line 68
    if-nez v3, :cond_1

    .line 69
    .line 70
    invoke-virtual {v1, v4}, Lio/sentry/cache/e;->a(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_1
    invoke-virtual {v1, v3, v4}, Lio/sentry/cache/e;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :goto_2
    invoke-virtual {p0}, Lio/sentry/m6;->getSdkVersion()Lio/sentry/protocol/u;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    const-string v4, "sdk-version.json"

    .line 82
    .line 83
    if-nez v3, :cond_2

    .line 84
    .line 85
    invoke-virtual {v1, v4}, Lio/sentry/cache/e;->a(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_2
    invoke-virtual {v1, v3, v4}, Lio/sentry/cache/e;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :goto_3
    invoke-virtual {p0}, Lio/sentry/m6;->getDist()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    const-string v4, "dist.json"

    .line 97
    .line 98
    if-nez v3, :cond_3

    .line 99
    .line 100
    invoke-virtual {v1, v4}, Lio/sentry/cache/e;->a(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_3
    invoke-virtual {v1, v3, v4}, Lio/sentry/cache/e;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :goto_4
    invoke-virtual {p0}, Lio/sentry/m6;->getEnvironment()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    const-string v4, "environment.json"

    .line 112
    .line 113
    if-nez v3, :cond_4

    .line 114
    .line 115
    invoke-virtual {v1, v4}, Lio/sentry/cache/e;->a(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_4
    invoke-virtual {v1, v3, v4}, Lio/sentry/cache/e;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :goto_5
    invoke-virtual {p0}, Lio/sentry/m6;->getTags()Ljava/util/Map;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v1, v3, v2}, Lio/sentry/cache/e;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    iget-object v2, v2, Lio/sentry/q6;->e:Ljava/lang/Double;

    .line 134
    .line 135
    const-string v3, "replay-error-sample-rate.json"

    .line 136
    .line 137
    if-nez v2, :cond_5

    .line 138
    .line 139
    invoke-virtual {v1, v3}, Lio/sentry/cache/e;->a(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Double;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v1, v2, v3}, Lio/sentry/cache/e;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_6
    invoke-virtual {p0}, Lio/sentry/m6;->findPersistingScopeObserver()Lio/sentry/cache/f;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    if-eqz p0, :cond_7

    .line 156
    .line 157
    :try_start_0
    iget-object v0, p0, Lio/sentry/cache/f;->b:Lio/sentry/util/g;

    .line 158
    .line 159
    invoke-virtual {v0}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    check-cast v0, Lio/sentry/cache/tape/f;

    .line 164
    .line 165
    invoke-virtual {v0}, Lio/sentry/cache/tape/f;->clear()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 166
    .line 167
    .line 168
    goto :goto_6

    .line 169
    :catch_0
    move-exception v0

    .line 170
    iget-object v1, p0, Lio/sentry/cache/f;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 171
    .line 172
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 177
    .line 178
    const-string v4, "Failed to clear breadcrumbs from file queue"

    .line 179
    .line 180
    invoke-interface {v1, v3, v4, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 181
    .line 182
    .line 183
    :goto_6
    const-string v0, "user.json"

    .line 184
    .line 185
    invoke-virtual {p0, v0}, Lio/sentry/cache/f;->a(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    const-string v0, "level.json"

    .line 189
    .line 190
    invoke-virtual {p0, v0}, Lio/sentry/cache/f;->a(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    const-string v0, "request.json"

    .line 194
    .line 195
    invoke-virtual {p0, v0}, Lio/sentry/cache/f;->a(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    const-string v0, "fingerprint.json"

    .line 199
    .line 200
    invoke-virtual {p0, v0}, Lio/sentry/cache/f;->a(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    const-string v0, "contexts.json"

    .line 204
    .line 205
    invoke-virtual {p0, v0}, Lio/sentry/cache/f;->a(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    const-string v0, "extras.json"

    .line 209
    .line 210
    invoke-virtual {p0, v0}, Lio/sentry/cache/f;->a(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0, v2}, Lio/sentry/cache/f;->a(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    const-string v0, "trace.json"

    .line 217
    .line 218
    invoke-virtual {p0, v0}, Lio/sentry/cache/f;->a(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    const-string v0, "transaction.json"

    .line 222
    .line 223
    invoke-virtual {p0, v0}, Lio/sentry/cache/f;->a(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    :cond_7
    return-void

    .line 227
    :pswitch_1
    invoke-virtual {p0}, Lio/sentry/m6;->getCacheDirPathWithoutDsn()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    if-eqz v0, :cond_b

    .line 232
    .line 233
    new-instance v1, Ljava/io/File;

    .line 234
    .line 235
    const-string v2, "app_start_profiling_config"

    .line 236
    .line 237
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    :try_start_1
    invoke-static {v1}, Lio/sentry/util/c;->f(Ljava/io/File;)Z

    .line 241
    .line 242
    .line 243
    invoke-virtual {p0}, Lio/sentry/m6;->isEnableAppStartProfiling()Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-nez v0, :cond_8

    .line 248
    .line 249
    invoke-virtual {p0}, Lio/sentry/m6;->isStartProfilerOnAppStart()Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    if-nez v0, :cond_8

    .line 254
    .line 255
    goto/16 :goto_c

    .line 256
    .line 257
    :catchall_0
    move-exception v0

    .line 258
    goto/16 :goto_b

    .line 259
    .line 260
    :cond_8
    invoke-virtual {p0}, Lio/sentry/m6;->isStartProfilerOnAppStart()Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-nez v0, :cond_9

    .line 265
    .line 266
    invoke-virtual {p0}, Lio/sentry/m6;->isTracingEnabled()Z

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-nez v0, :cond_9

    .line 271
    .line 272
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    sget-object v1, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 277
    .line 278
    const-string v2, "Tracing is disabled and app start profiling will not start."

    .line 279
    .line 280
    const/4 v3, 0x0

    .line 281
    new-array v3, v3, [Ljava/lang/Object;

    .line 282
    .line 283
    invoke-interface {v0, v1, v2, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    goto/16 :goto_c

    .line 287
    .line 288
    :cond_9
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_b

    .line 293
    .line 294
    invoke-virtual {p0}, Lio/sentry/m6;->isEnableAppStartProfiling()Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    const/4 v2, 0x0

    .line 299
    if-eqz v0, :cond_a

    .line 300
    .line 301
    new-instance v0, Lio/sentry/j7;

    .line 302
    .line 303
    const-string v3, "app.launch"

    .line 304
    .line 305
    const-string v4, "profile"

    .line 306
    .line 307
    sget-object v5, Lio/sentry/protocol/i0;->CUSTOM:Lio/sentry/protocol/i0;

    .line 308
    .line 309
    invoke-direct {v0, v3, v5, v4, v2}, Lio/sentry/j7;-><init>(Ljava/lang/String;Lio/sentry/protocol/i0;Ljava/lang/String;Lio/sentry/t3;)V

    .line 310
    .line 311
    .line 312
    new-instance v2, Lio/sentry/internal/debugmeta/c;

    .line 313
    .line 314
    invoke-static {}, Lio/sentry/util/m;->a()Lio/sentry/util/l;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    invoke-virtual {v3}, Lio/sentry/util/l;->c()D

    .line 319
    .line 320
    .line 321
    move-result-wide v3

    .line 322
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    invoke-direct {v2, v0, v3}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/j7;Ljava/lang/Double;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {p0}, Lio/sentry/m6;->getInternalTracesSampler()Lio/sentry/i7;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-virtual {v0, v2}, Lio/sentry/i7;->a(Lio/sentry/internal/debugmeta/c;)Lio/sentry/t3;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    goto :goto_7

    .line 338
    :cond_a
    new-instance v0, Lio/sentry/t3;

    .line 339
    .line 340
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 341
    .line 342
    invoke-direct {v0, v3, v2}, Lio/sentry/t3;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;)V

    .line 343
    .line 344
    .line 345
    :goto_7
    new-instance v2, Lio/sentry/n4;

    .line 346
    .line 347
    invoke-direct {v2, p0, v0}, Lio/sentry/n4;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/t3;)V

    .line 348
    .line 349
    .line 350
    new-instance v0, Ljava/io/FileOutputStream;

    .line 351
    .line 352
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 353
    .line 354
    .line 355
    :try_start_2
    new-instance v1, Ljava/io/BufferedWriter;

    .line 356
    .line 357
    new-instance v3, Ljava/io/OutputStreamWriter;

    .line 358
    .line 359
    sget-object v4, Lio/sentry/m4;->e:Ljava/nio/charset/Charset;

    .line 360
    .line 361
    invoke-direct {v3, v0, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 362
    .line 363
    .line 364
    invoke-direct {v1, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 365
    .line 366
    .line 367
    :try_start_3
    invoke-virtual {p0}, Lio/sentry/m6;->getSerializer()Lio/sentry/i1;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    invoke-interface {v3, v1, v2}, Lio/sentry/i1;->a(Ljava/io/Writer;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 372
    .line 373
    .line 374
    :try_start_4
    invoke-virtual {v1}, Ljava/io/Writer;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 375
    .line 376
    .line 377
    :try_start_5
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 378
    .line 379
    .line 380
    goto :goto_c

    .line 381
    :catchall_1
    move-exception v1

    .line 382
    goto :goto_9

    .line 383
    :catchall_2
    move-exception v2

    .line 384
    :try_start_6
    invoke-virtual {v1}, Ljava/io/Writer;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 385
    .line 386
    .line 387
    goto :goto_8

    .line 388
    :catchall_3
    move-exception v1

    .line 389
    :try_start_7
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 390
    .line 391
    .line 392
    :goto_8
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 393
    :goto_9
    :try_start_8
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 394
    .line 395
    .line 396
    goto :goto_a

    .line 397
    :catchall_4
    move-exception v0

    .line 398
    :try_start_9
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 399
    .line 400
    .line 401
    :goto_a
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 402
    :goto_b
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 407
    .line 408
    const-string v2, "Unable to create app start profiling config file. "

    .line 409
    .line 410
    invoke-interface {p0, v1, v2, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 411
    .line 412
    .line 413
    :cond_b
    :goto_c
    return-void

    .line 414
    :pswitch_2
    invoke-virtual {p0}, Lio/sentry/m6;->loadLazyFields()V

    .line 415
    .line 416
    .line 417
    return-void

    .line 418
    nop

    .line 419
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

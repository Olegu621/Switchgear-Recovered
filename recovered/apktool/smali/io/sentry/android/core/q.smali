.class public abstract Lio/sentry/android/core/q;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public static a(Lio/sentry/android/core/SentryAndroidOptions;Landroid/content/Context;Lio/sentry/android/core/o0;Lio/sentry/util/h;Lio/sentry/android/core/d;Z)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lio/sentry/m6;->getCacheDirPath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lio/sentry/m6;->getEnvelopeDiskCache()Lio/sentry/cache/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v0, v0, Lio/sentry/transport/i;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lio/sentry/android/core/cache/b;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lio/sentry/android/core/cache/b;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lio/sentry/m6;->setEnvelopeDiskCache(Lio/sentry/cache/d;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Lio/sentry/m6;->getConnectionStatusProvider()Lio/sentry/q0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    instance-of v0, v0, Lio/sentry/n2;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    new-instance v0, Lio/sentry/android/core/internal/util/c;

    .line 32
    .line 33
    invoke-direct {v0, p1, p2, p0}, Lio/sentry/android/core/internal/util/c;-><init>(Landroid/content/Context;Lio/sentry/android/core/o0;Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lio/sentry/m6;->setConnectionStatusProvider(Lio/sentry/q0;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Lio/sentry/m6;->getCacheDirPath()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    new-instance v0, Lio/sentry/cache/f;

    .line 46
    .line 47
    invoke-direct {v0, p0}, Lio/sentry/cache/f;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lio/sentry/m6;->addScopeObserver(Lio/sentry/b1;)V

    .line 51
    .line 52
    .line 53
    new-instance v0, Lio/sentry/cache/e;

    .line 54
    .line 55
    invoke-direct {v0, p0}, Lio/sentry/cache/e;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lio/sentry/m6;->addOptionsObserver(Lio/sentry/w0;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    new-instance v0, Lio/sentry/o;

    .line 62
    .line 63
    invoke-direct {v0, p0}, Lio/sentry/o;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v0}, Lio/sentry/m6;->addEventProcessor(Lio/sentry/c0;)V

    .line 67
    .line 68
    .line 69
    new-instance v0, Lio/sentry/android/core/q0;

    .line 70
    .line 71
    invoke-direct {v0, p1, p2, p0}, Lio/sentry/android/core/q0;-><init>(Landroid/content/Context;Lio/sentry/android/core/o0;Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v0}, Lio/sentry/m6;->addEventProcessor(Lio/sentry/c0;)V

    .line 75
    .line 76
    .line 77
    new-instance v0, Lio/sentry/android/core/f1;

    .line 78
    .line 79
    invoke-direct {v0, p0, p4}, Lio/sentry/android/core/f1;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/d;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lio/sentry/m6;->addEventProcessor(Lio/sentry/c0;)V

    .line 83
    .line 84
    .line 85
    new-instance p4, Lio/sentry/android/core/ScreenshotEventProcessor;

    .line 86
    .line 87
    invoke-direct {p4, p0, p2, p5}, Lio/sentry/android/core/ScreenshotEventProcessor;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/o0;Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p4}, Lio/sentry/m6;->addEventProcessor(Lio/sentry/c0;)V

    .line 91
    .line 92
    .line 93
    new-instance p4, Lio/sentry/android/core/ViewHierarchyEventProcessor;

    .line 94
    .line 95
    invoke-direct {p4, p0}, Lio/sentry/android/core/ViewHierarchyEventProcessor;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, p4}, Lio/sentry/m6;->addEventProcessor(Lio/sentry/c0;)V

    .line 99
    .line 100
    .line 101
    new-instance p4, Lio/sentry/android/core/i0;

    .line 102
    .line 103
    invoke-direct {p4, p1, p2, p0}, Lio/sentry/android/core/i0;-><init>(Landroid/content/Context;Lio/sentry/android/core/o0;Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, p4}, Lio/sentry/m6;->addEventProcessor(Lio/sentry/c0;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Lio/sentry/m6;->getTransportGate()Lio/sentry/transport/h;

    .line 110
    .line 111
    .line 112
    move-result-object p4

    .line 113
    instance-of p4, p4, Lio/sentry/transport/k;

    .line 114
    .line 115
    if-eqz p4, :cond_3

    .line 116
    .line 117
    new-instance p4, Lio/sentry/android/core/x;

    .line 118
    .line 119
    invoke-direct {p4, p0}, Lio/sentry/android/core/x;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, p4}, Lio/sentry/m6;->setTransportGate(Lio/sentry/transport/h;)V

    .line 123
    .line 124
    .line 125
    :cond_3
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 126
    .line 127
    .line 128
    move-result-object p4

    .line 129
    iget-object v0, p4, Lio/sentry/android/core/performance/g;->i0:Lio/sentry/android/core/o0;

    .line 130
    .line 131
    invoke-virtual {p0, v0}, Lio/sentry/m6;->setAppStartExtender(Lio/sentry/n0;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Lio/sentry/m6;->getModulesLoader()Lio/sentry/internal/modules/a;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    instance-of v0, v0, Lio/sentry/internal/modules/e;

    .line 139
    .line 140
    if-eqz v0, :cond_4

    .line 141
    .line 142
    new-instance v0, Lio/sentry/internal/modules/f;

    .line 143
    .line 144
    invoke-direct {v0, p1, p0}, Lio/sentry/internal/modules/f;-><init>(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v0}, Lio/sentry/m6;->setModulesLoader(Lio/sentry/internal/modules/a;)V

    .line 148
    .line 149
    .line 150
    :cond_4
    invoke-virtual {p0}, Lio/sentry/m6;->getDebugMetaLoader()Lio/sentry/internal/debugmeta/a;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    instance-of v0, v0, Lio/sentry/internal/debugmeta/b;

    .line 155
    .line 156
    if-eqz v0, :cond_5

    .line 157
    .line 158
    new-instance v0, Lio/sentry/internal/debugmeta/c;

    .line 159
    .line 160
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-direct {v0, p1, v1}, Lio/sentry/internal/debugmeta/c;-><init>(Landroid/content/Context;Lio/sentry/ILogger;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, v0}, Lio/sentry/m6;->setDebugMetaLoader(Lio/sentry/internal/debugmeta/a;)V

    .line 168
    .line 169
    .line 170
    :cond_5
    invoke-virtual {p0}, Lio/sentry/m6;->getVersionDetector()Lio/sentry/p1;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    instance-of v0, v0, Lio/sentry/h3;

    .line 175
    .line 176
    const/4 v1, 0x0

    .line 177
    if-eqz v0, :cond_6

    .line 178
    .line 179
    new-instance v0, Lio/sentry/t;

    .line 180
    .line 181
    invoke-direct {v0, p0, v1}, Lio/sentry/t;-><init>(Lio/sentry/android/core/SentryAndroidOptions;I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, v0}, Lio/sentry/m6;->setVersionDetector(Lio/sentry/p1;)V

    .line 185
    .line 186
    .line 187
    :cond_6
    new-instance v0, Lio/sentry/util/g;

    .line 188
    .line 189
    new-instance v2, Lio/sentry/android/core/p;

    .line 190
    .line 191
    invoke-direct {v2, p3, p0}, Lio/sentry/android/core/p;-><init>(Lio/sentry/util/h;Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 192
    .line 193
    .line 194
    invoke-direct {v0, v2}, Lio/sentry/util/g;-><init>(Lio/sentry/util/f;)V

    .line 195
    .line 196
    .line 197
    const-string p3, "androidx.compose.ui.node.Owner"

    .line 198
    .line 199
    invoke-static {p0, p3}, Lio/sentry/util/h;->b(Lio/sentry/m6;Ljava/lang/String;)Z

    .line 200
    .line 201
    .line 202
    move-result p3

    .line 203
    invoke-virtual {p0}, Lio/sentry/m6;->getGestureTargetLocators()Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_8

    .line 212
    .line 213
    new-instance v2, Ljava/util/ArrayList;

    .line 214
    .line 215
    const/4 v3, 0x2

    .line 216
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 217
    .line 218
    .line 219
    new-instance v3, Lio/sentry/android/core/internal/gestures/a;

    .line 220
    .line 221
    invoke-direct {v3, v0}, Lio/sentry/android/core/internal/gestures/a;-><init>(Lio/sentry/util/g;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    if-eqz p3, :cond_7

    .line 228
    .line 229
    const-string v0, "io.sentry.compose.gestures.ComposeGestureTargetLocator"

    .line 230
    .line 231
    invoke-static {p0, v0}, Lio/sentry/util/h;->b(Lio/sentry/m6;Ljava/lang/String;)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_7

    .line 236
    .line 237
    new-instance v0, Lio/sentry/compose/gestures/ComposeGestureTargetLocator;

    .line 238
    .line 239
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    invoke-direct {v0, v3}, Lio/sentry/compose/gestures/ComposeGestureTargetLocator;-><init>(Lio/sentry/ILogger;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    :cond_7
    invoke-virtual {p0, v2}, Lio/sentry/m6;->setGestureTargetLocators(Ljava/util/List;)V

    .line 250
    .line 251
    .line 252
    :cond_8
    invoke-virtual {p0}, Lio/sentry/m6;->getViewHierarchyExporters()Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    const/4 v2, 0x1

    .line 261
    if-eqz v0, :cond_9

    .line 262
    .line 263
    if-eqz p3, :cond_9

    .line 264
    .line 265
    const-string p3, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter"

    .line 266
    .line 267
    invoke-static {p0, p3}, Lio/sentry/util/h;->b(Lio/sentry/m6;Ljava/lang/String;)Z

    .line 268
    .line 269
    .line 270
    move-result p3

    .line 271
    if-eqz p3, :cond_9

    .line 272
    .line 273
    new-instance p3, Ljava/util/ArrayList;

    .line 274
    .line 275
    invoke-direct {p3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 276
    .line 277
    .line 278
    new-instance v0, Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;

    .line 279
    .line 280
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    invoke-direct {v0, v3}, Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;-><init>(Lio/sentry/ILogger;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    invoke-virtual {p0, p3}, Lio/sentry/m6;->setViewHierarchyExporters(Ljava/util/List;)V

    .line 291
    .line 292
    .line 293
    :cond_9
    invoke-virtual {p0}, Lio/sentry/m6;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 294
    .line 295
    .line 296
    move-result-object p3

    .line 297
    instance-of p3, p3, Lio/sentry/util/thread/b;

    .line 298
    .line 299
    if-eqz p3, :cond_a

    .line 300
    .line 301
    sget-object p3, Lio/sentry/android/core/internal/util/e;->a:Lio/sentry/android/core/internal/util/e;

    .line 302
    .line 303
    invoke-virtual {p0, p3}, Lio/sentry/m6;->setThreadChecker(Lio/sentry/util/thread/a;)V

    .line 304
    .line 305
    .line 306
    :cond_a
    invoke-virtual {p0}, Lio/sentry/m6;->getSocketTagger()Lio/sentry/j1;

    .line 307
    .line 308
    .line 309
    move-result-object p3

    .line 310
    instance-of p3, p3, Lio/sentry/c3;

    .line 311
    .line 312
    if-eqz p3, :cond_b

    .line 313
    .line 314
    sget-object p3, Lio/sentry/android/core/u;->b:Lio/sentry/android/core/u;

    .line 315
    .line 316
    invoke-virtual {p0, p3}, Lio/sentry/m6;->setSocketTagger(Lio/sentry/j1;)V

    .line 317
    .line 318
    .line 319
    :cond_b
    invoke-virtual {p0}, Lio/sentry/m6;->getPerformanceCollectors()Ljava/util/List;

    .line 320
    .line 321
    .line 322
    move-result-object p3

    .line 323
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 324
    .line 325
    .line 326
    move-result p3

    .line 327
    const-string v0, "options.getFrameMetricsCollector is required"

    .line 328
    .line 329
    if-eqz p3, :cond_c

    .line 330
    .line 331
    new-instance p3, Lio/sentry/android/core/n;

    .line 332
    .line 333
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 334
    .line 335
    .line 336
    invoke-virtual {p0, p3}, Lio/sentry/m6;->addPerformanceCollector(Lio/sentry/x0;)V

    .line 337
    .line 338
    .line 339
    new-instance p3, Lio/sentry/android/core/i;

    .line 340
    .line 341
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    invoke-direct {p3, v3}, Lio/sentry/android/core/i;-><init>(Lio/sentry/ILogger;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {p0, p3}, Lio/sentry/m6;->addPerformanceCollector(Lio/sentry/x0;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {p0}, Lio/sentry/android/core/SentryAndroidOptions;->isEnablePerformanceV2()Z

    .line 352
    .line 353
    .line 354
    move-result p3

    .line 355
    if-eqz p3, :cond_c

    .line 356
    .line 357
    new-instance p3, Lio/sentry/android/core/u1;

    .line 358
    .line 359
    invoke-virtual {p0}, Lio/sentry/android/core/SentryAndroidOptions;->getFrameMetricsCollector()Lio/sentry/android/core/internal/util/r;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    invoke-static {v3, v0}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    invoke-direct {p3, p0, v3}, Lio/sentry/android/core/u1;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/internal/util/r;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {p0, p3}, Lio/sentry/m6;->addPerformanceCollector(Lio/sentry/x0;)V

    .line 370
    .line 371
    .line 372
    :cond_c
    invoke-virtual {p0}, Lio/sentry/m6;->getCompositePerformanceCollector()Lio/sentry/m;

    .line 373
    .line 374
    .line 375
    move-result-object p3

    .line 376
    instance-of p3, p3, Lio/sentry/m2;

    .line 377
    .line 378
    if-eqz p3, :cond_d

    .line 379
    .line 380
    new-instance p3, Lio/sentry/q;

    .line 381
    .line 382
    invoke-direct {p3, p0}, Lio/sentry/q;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {p0, p3}, Lio/sentry/m6;->setCompositePerformanceCollector(Lio/sentry/m;)V

    .line 386
    .line 387
    .line 388
    :cond_d
    if-eqz p5, :cond_e

    .line 389
    .line 390
    invoke-virtual {p0}, Lio/sentry/m6;->getReplayController()Lio/sentry/v3;

    .line 391
    .line 392
    .line 393
    move-result-object p3

    .line 394
    invoke-interface {p3}, Lio/sentry/v3;->p()Lio/sentry/u3;

    .line 395
    .line 396
    .line 397
    move-result-object p3

    .line 398
    instance-of p3, p3, Lio/sentry/t2;

    .line 399
    .line 400
    if-eqz p3, :cond_e

    .line 401
    .line 402
    invoke-virtual {p0}, Lio/sentry/m6;->getReplayController()Lio/sentry/v3;

    .line 403
    .line 404
    .line 405
    move-result-object p3

    .line 406
    new-instance p5, Lio/sentry/android/replay/c;

    .line 407
    .line 408
    invoke-direct {p5, p0}, Lio/sentry/android/replay/c;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 409
    .line 410
    .line 411
    invoke-interface {p3, p5}, Lio/sentry/v3;->h(Lio/sentry/android/replay/c;)V

    .line 412
    .line 413
    .line 414
    :cond_e
    sget-object p3, Lio/sentry/android/core/performance/g;->l0:Lio/sentry/util/a;

    .line 415
    .line 416
    invoke-virtual {p3}, Lio/sentry/util/a;->c()V

    .line 417
    .line 418
    .line 419
    :try_start_0
    iget-object p5, p4, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/v;

    .line 420
    .line 421
    iget-object v3, p4, Lio/sentry/android/core/performance/g;->U:Lio/sentry/android/core/h;

    .line 422
    .line 423
    const/4 v4, 0x0

    .line 424
    iput-object v4, p4, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/v;

    .line 425
    .line 426
    iput-object v4, p4, Lio/sentry/android/core/performance/g;->U:Lio/sentry/android/core/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 427
    .line 428
    invoke-virtual {p3}, Lio/sentry/util/a;->close()V

    .line 429
    .line 430
    .line 431
    invoke-virtual {p0}, Lio/sentry/m6;->getCompositePerformanceCollector()Lio/sentry/m;

    .line 432
    .line 433
    .line 434
    move-result-object p3

    .line 435
    invoke-virtual {p0}, Lio/sentry/m6;->isProfilingEnabled()Z

    .line 436
    .line 437
    .line 438
    move-result p4

    .line 439
    if-nez p4, :cond_f

    .line 440
    .line 441
    invoke-virtual {p0}, Lio/sentry/m6;->getProfilesSampleRate()Ljava/lang/Double;

    .line 442
    .line 443
    .line 444
    move-result-object p4

    .line 445
    if-eqz p4, :cond_10

    .line 446
    .line 447
    :cond_f
    move-object v1, p2

    .line 448
    move-object p3, v0

    .line 449
    goto :goto_0

    .line 450
    :cond_10
    sget-object p1, Lio/sentry/l2;->e:Lio/sentry/l2;

    .line 451
    .line 452
    invoke-virtual {p0, p1}, Lio/sentry/m6;->setTransactionProfiler(Lio/sentry/n1;)V

    .line 453
    .line 454
    .line 455
    if-eqz p5, :cond_11

    .line 456
    .line 457
    invoke-virtual {p5}, Lio/sentry/android/core/v;->close()V

    .line 458
    .line 459
    .line 460
    :cond_11
    if-eqz v3, :cond_13

    .line 461
    .line 462
    invoke-virtual {p0, v3}, Lio/sentry/m6;->setContinuousProfiler(Lio/sentry/r0;)V

    .line 463
    .line 464
    .line 465
    iget-object p0, v3, Lio/sentry/android/core/h;->Z:Lio/sentry/protocol/w;

    .line 466
    .line 467
    iget-boolean p1, v3, Lio/sentry/android/core/h;->w:Z

    .line 468
    .line 469
    if-eqz p1, :cond_12

    .line 470
    .line 471
    sget-object p1, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 472
    .line 473
    invoke-virtual {p0, p1}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result p1

    .line 477
    if-nez p1, :cond_12

    .line 478
    .line 479
    invoke-virtual {p0}, Lio/sentry/protocol/w;->a()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    invoke-interface {p3, p0}, Lio/sentry/m;->a(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    :cond_12
    return-void

    .line 487
    :cond_13
    move-object p3, v0

    .line 488
    new-instance v0, Lio/sentry/android/core/h;

    .line 489
    .line 490
    invoke-virtual {p0}, Lio/sentry/android/core/SentryAndroidOptions;->getFrameMetricsCollector()Lio/sentry/android/core/internal/util/r;

    .line 491
    .line 492
    .line 493
    move-result-object v2

    .line 494
    invoke-static {v2, p3}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    invoke-virtual {p0}, Lio/sentry/m6;->getProfilingTracesDirPath()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v4

    .line 505
    invoke-virtual {p0}, Lio/sentry/m6;->getProfilingTracesHz()I

    .line 506
    .line 507
    .line 508
    move-result v5

    .line 509
    new-instance v6, Lio/sentry/android/core/p;

    .line 510
    .line 511
    invoke-direct {v6, p0, v1}, Lio/sentry/android/core/p;-><init>(Lio/sentry/android/core/SentryAndroidOptions;I)V

    .line 512
    .line 513
    .line 514
    move-object v1, p2

    .line 515
    invoke-direct/range {v0 .. v6}, Lio/sentry/android/core/h;-><init>(Lio/sentry/android/core/o0;Lio/sentry/android/core/internal/util/r;Lio/sentry/ILogger;Ljava/lang/String;ILio/sentry/util/f;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {p0, v0}, Lio/sentry/m6;->setContinuousProfiler(Lio/sentry/r0;)V

    .line 519
    .line 520
    .line 521
    return-void

    .line 522
    :goto_0
    sget-object p2, Lio/sentry/o2;->a:Lio/sentry/o2;

    .line 523
    .line 524
    invoke-virtual {p0, p2}, Lio/sentry/m6;->setContinuousProfiler(Lio/sentry/r0;)V

    .line 525
    .line 526
    .line 527
    if-eqz v3, :cond_14

    .line 528
    .line 529
    invoke-virtual {v3, v2}, Lio/sentry/android/core/h;->a(Z)V

    .line 530
    .line 531
    .line 532
    :cond_14
    if-eqz p5, :cond_15

    .line 533
    .line 534
    invoke-virtual {p0, p5}, Lio/sentry/m6;->setTransactionProfiler(Lio/sentry/n1;)V

    .line 535
    .line 536
    .line 537
    return-void

    .line 538
    :cond_15
    move-object v3, v1

    .line 539
    new-instance v1, Lio/sentry/android/core/v;

    .line 540
    .line 541
    invoke-virtual {p0}, Lio/sentry/android/core/SentryAndroidOptions;->getFrameMetricsCollector()Lio/sentry/android/core/internal/util/r;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    invoke-static {v4, p3}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 549
    .line 550
    .line 551
    move-result-object v5

    .line 552
    invoke-virtual {p0}, Lio/sentry/m6;->getProfilingTracesDirPath()Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v6

    .line 556
    invoke-virtual {p0}, Lio/sentry/m6;->isProfilingEnabled()Z

    .line 557
    .line 558
    .line 559
    move-result v7

    .line 560
    invoke-virtual {p0}, Lio/sentry/m6;->getProfilingTracesHz()I

    .line 561
    .line 562
    .line 563
    move-result v8

    .line 564
    new-instance v9, Lio/sentry/android/core/p;

    .line 565
    .line 566
    const/4 p2, 0x3

    .line 567
    invoke-direct {v9, p0, p2}, Lio/sentry/android/core/p;-><init>(Lio/sentry/android/core/SentryAndroidOptions;I)V

    .line 568
    .line 569
    .line 570
    move-object v2, p1

    .line 571
    invoke-direct/range {v1 .. v9}, Lio/sentry/android/core/v;-><init>(Landroid/content/Context;Lio/sentry/android/core/o0;Lio/sentry/android/core/internal/util/r;Lio/sentry/ILogger;Ljava/lang/String;ZILio/sentry/util/f;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {p0, v1}, Lio/sentry/m6;->setTransactionProfiler(Lio/sentry/n1;)V

    .line 575
    .line 576
    .line 577
    return-void

    .line 578
    :catchall_0
    move-exception v0

    .line 579
    move-object p0, v0

    .line 580
    :try_start_1
    invoke-virtual {p3}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 581
    .line 582
    .line 583
    goto :goto_1

    .line 584
    :catchall_1
    move-exception v0

    .line 585
    move-object p1, v0

    .line 586
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 587
    .line 588
    .line 589
    :goto_1
    throw p0
.end method

.method public static b(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/o0;Lio/sentry/util/h;Lio/sentry/android/core/d;ZZZZ)V
    .locals 7

    .line 1
    new-instance p3, Lio/sentry/util/g;

    .line 2
    .line 3
    new-instance v0, Lio/sentry/android/core/p;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {v0, p1, v1}, Lio/sentry/android/core/p;-><init>(Lio/sentry/android/core/SentryAndroidOptions;I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p3, v0}, Lio/sentry/util/g;-><init>(Lio/sentry/util/f;)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;

    .line 13
    .line 14
    new-instance v2, Lio/sentry/j4;

    .line 15
    .line 16
    new-instance v3, Lio/sentry/android/core/p;

    .line 17
    .line 18
    const/4 v4, 0x2

    .line 19
    invoke-direct {v3, p1, v4}, Lio/sentry/android/core/p;-><init>(Lio/sentry/android/core/SentryAndroidOptions;I)V

    .line 20
    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-direct {v2, v3, v5}, Lio/sentry/j4;-><init>(Lio/sentry/android/core/p;I)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v2, p3}, Lio/sentry/android/core/SendCachedEnvelopeIntegration;-><init>(Lio/sentry/j4;Lio/sentry/util/g;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lio/sentry/m6;->addIntegration(Lio/sentry/s1;)V

    .line 30
    .line 31
    .line 32
    const-string v0, "io.sentry.android.ndk.SentryNdk"

    .line 33
    .line 34
    invoke-virtual {p1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v2, v0, v1}, Lio/sentry/util/h;->f(Lio/sentry/ILogger;Ljava/lang/String;Z)Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v2, Lio/sentry/android/core/NdkIntegration;

    .line 43
    .line 44
    invoke-direct {v2, v0}, Lio/sentry/android/core/NdkIntegration;-><init>(Ljava/lang/Class;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v2}, Lio/sentry/m6;->addIntegration(Lio/sentry/s1;)V

    .line 48
    .line 49
    .line 50
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 51
    .line 52
    const/16 v2, 0x1f

    .line 53
    .line 54
    if-lt v0, v2, :cond_0

    .line 55
    .line 56
    new-instance v2, Lio/sentry/android/core/TombstoneIntegration;

    .line 57
    .line 58
    invoke-direct {v2, p0}, Lio/sentry/android/core/TombstoneIntegration;-><init>(Landroid/content/Context;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v2}, Lio/sentry/m6;->addIntegration(Lio/sentry/s1;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    new-instance v2, Lio/sentry/android/core/EnvelopeFileObserverIntegration$OutboxEnvelopeFileObserverIntegration;

    .line 65
    .line 66
    invoke-direct {v2}, Lio/sentry/android/core/EnvelopeFileObserverIntegration;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v2}, Lio/sentry/m6;->addIntegration(Lio/sentry/s1;)V

    .line 70
    .line 71
    .line 72
    new-instance v2, Lio/sentry/android/core/SendCachedEnvelopeIntegration;

    .line 73
    .line 74
    new-instance v3, Lio/sentry/j4;

    .line 75
    .line 76
    new-instance v6, Lio/sentry/android/core/p;

    .line 77
    .line 78
    invoke-direct {v6, p1, v4}, Lio/sentry/android/core/p;-><init>(Lio/sentry/android/core/SentryAndroidOptions;I)V

    .line 79
    .line 80
    .line 81
    invoke-direct {v3, v6, v1}, Lio/sentry/j4;-><init>(Lio/sentry/android/core/p;I)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v2, v3, p3}, Lio/sentry/android/core/SendCachedEnvelopeIntegration;-><init>(Lio/sentry/j4;Lio/sentry/util/g;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v2}, Lio/sentry/m6;->addIntegration(Lio/sentry/s1;)V

    .line 88
    .line 89
    .line 90
    new-instance p3, Lio/sentry/android/core/AppLifecycleIntegration;

    .line 91
    .line 92
    invoke-direct {p3}, Lio/sentry/android/core/AppLifecycleIntegration;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, p3}, Lio/sentry/m6;->addIntegration(Lio/sentry/s1;)V

    .line 96
    .line 97
    .line 98
    const/16 p3, 0x1e

    .line 99
    .line 100
    if-lt v0, p3, :cond_1

    .line 101
    .line 102
    new-instance p3, Lio/sentry/android/core/AnrV2Integration;

    .line 103
    .line 104
    invoke-direct {p3, p0}, Lio/sentry/android/core/AnrV2Integration;-><init>(Landroid/content/Context;)V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_1
    new-instance p3, Lio/sentry/android/core/AnrIntegration;

    .line 109
    .line 110
    invoke-direct {p3, p0}, Lio/sentry/android/core/AnrIntegration;-><init>(Landroid/content/Context;)V

    .line 111
    .line 112
    .line 113
    :goto_0
    invoke-virtual {p1, p3}, Lio/sentry/m6;->addIntegration(Lio/sentry/s1;)V

    .line 114
    .line 115
    .line 116
    new-instance p3, Lio/sentry/android/core/anr/AnrProfilingIntegration;

    .line 117
    .line 118
    invoke-direct {p3}, Lio/sentry/android/core/anr/AnrProfilingIntegration;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, p3}, Lio/sentry/m6;->addIntegration(Lio/sentry/s1;)V

    .line 122
    .line 123
    .line 124
    instance-of p3, p0, Landroid/app/Application;

    .line 125
    .line 126
    if-eqz p3, :cond_2

    .line 127
    .line 128
    new-instance p3, Lio/sentry/android/core/ActivityLifecycleIntegration;

    .line 129
    .line 130
    move-object v0, p0

    .line 131
    check-cast v0, Landroid/app/Application;

    .line 132
    .line 133
    invoke-direct {p3, v0, p2, p4}, Lio/sentry/android/core/ActivityLifecycleIntegration;-><init>(Landroid/app/Application;Lio/sentry/android/core/o0;Lio/sentry/android/core/d;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, p3}, Lio/sentry/m6;->addIntegration(Lio/sentry/s1;)V

    .line 137
    .line 138
    .line 139
    new-instance p3, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;

    .line 140
    .line 141
    invoke-direct {p3, v0}, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;-><init>(Landroid/app/Application;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, p3}, Lio/sentry/m6;->addIntegration(Lio/sentry/s1;)V

    .line 145
    .line 146
    .line 147
    new-instance p3, Lio/sentry/android/core/UserInteractionIntegration;

    .line 148
    .line 149
    invoke-direct {p3, v0}, Lio/sentry/android/core/UserInteractionIntegration;-><init>(Landroid/app/Application;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, p3}, Lio/sentry/m6;->addIntegration(Lio/sentry/s1;)V

    .line 153
    .line 154
    .line 155
    new-instance p3, Lio/sentry/android/core/FeedbackShakeIntegration;

    .line 156
    .line 157
    invoke-direct {p3, v0}, Lio/sentry/android/core/FeedbackShakeIntegration;-><init>(Landroid/app/Application;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, p3}, Lio/sentry/m6;->addIntegration(Lio/sentry/s1;)V

    .line 161
    .line 162
    .line 163
    if-eqz p5, :cond_3

    .line 164
    .line 165
    new-instance p3, Lio/sentry/android/fragment/FragmentLifecycleIntegration;

    .line 166
    .line 167
    invoke-direct {p3, v0, v1, v1}, Lio/sentry/android/fragment/FragmentLifecycleIntegration;-><init>(Landroid/app/Application;ZZ)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, p3}, Lio/sentry/m6;->addIntegration(Lio/sentry/s1;)V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_2
    invoke-virtual {p1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    sget-object p4, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 179
    .line 180
    const-string p5, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed."

    .line 181
    .line 182
    new-array v0, v5, [Ljava/lang/Object;

    .line 183
    .line 184
    invoke-interface {p3, p4, p5, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :cond_3
    :goto_1
    if-eqz p6, :cond_4

    .line 188
    .line 189
    new-instance p3, Lio/sentry/android/timber/SentryTimberIntegration;

    .line 190
    .line 191
    invoke-direct {p3}, Lio/sentry/android/timber/SentryTimberIntegration;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, p3}, Lio/sentry/m6;->addIntegration(Lio/sentry/s1;)V

    .line 195
    .line 196
    .line 197
    :cond_4
    new-instance p3, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;

    .line 198
    .line 199
    invoke-direct {p3, p0}, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;-><init>(Landroid/content/Context;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, p3}, Lio/sentry/m6;->addIntegration(Lio/sentry/s1;)V

    .line 203
    .line 204
    .line 205
    new-instance p3, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;

    .line 206
    .line 207
    invoke-direct {p3, p0}, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;-><init>(Landroid/content/Context;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1, p3}, Lio/sentry/m6;->addIntegration(Lio/sentry/s1;)V

    .line 211
    .line 212
    .line 213
    new-instance p3, Lio/sentry/android/core/NetworkBreadcrumbsIntegration;

    .line 214
    .line 215
    invoke-direct {p3, p0, p2}, Lio/sentry/android/core/NetworkBreadcrumbsIntegration;-><init>(Landroid/content/Context;Lio/sentry/android/core/o0;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, p3}, Lio/sentry/m6;->addIntegration(Lio/sentry/s1;)V

    .line 219
    .line 220
    .line 221
    if-eqz p7, :cond_5

    .line 222
    .line 223
    new-instance p2, Lio/sentry/android/replay/ReplayIntegration;

    .line 224
    .line 225
    invoke-direct {p2, p0}, Lio/sentry/android/replay/ReplayIntegration;-><init>(Landroid/content/Context;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1, p2}, Lio/sentry/m6;->addIntegration(Lio/sentry/s1;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1, p2}, Lio/sentry/m6;->setReplayController(Lio/sentry/v3;)V

    .line 232
    .line 233
    .line 234
    :cond_5
    if-eqz p8, :cond_6

    .line 235
    .line 236
    new-instance p2, Lio/sentry/android/distribution/DistributionIntegration;

    .line 237
    .line 238
    invoke-direct {p2, p0}, Lio/sentry/android/distribution/DistributionIntegration;-><init>(Landroid/content/Context;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1, p2}, Lio/sentry/m6;->setDistributionController(Lio/sentry/s0;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1, p2}, Lio/sentry/m6;->addIntegration(Lio/sentry/s1;)V

    .line 245
    .line 246
    .line 247
    :cond_6
    invoke-virtual {p1}, Lio/sentry/m6;->getFeedbackOptions()Lio/sentry/h5;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    return-void
.end method

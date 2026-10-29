.class public final Lio/sentry/android/core/i0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/c0;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lio/sentry/android/core/SentryAndroidOptions;

.field public final c:Lio/sentry/android/core/o0;

.field public final d:Lio/sentry/d5;

.field public final e:Lio/sentry/cache/f;

.field public final f:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/core/o0;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/android/core/h0;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lio/sentry/android/core/h0;-><init>(Lio/sentry/android/core/i0;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lio/sentry/android/core/i0;->f:Ljava/util/List;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    move-object p1, v0

    .line 22
    :cond_0
    iput-object p1, p0, Lio/sentry/android/core/i0;->a:Landroid/content/Context;

    .line 23
    .line 24
    iput-object p3, p0, Lio/sentry/android/core/i0;->b:Lio/sentry/android/core/SentryAndroidOptions;

    .line 25
    .line 26
    iput-object p2, p0, Lio/sentry/android/core/i0;->c:Lio/sentry/android/core/o0;

    .line 27
    .line 28
    invoke-virtual {p3}, Lio/sentry/m6;->findPersistingScopeObserver()Lio/sentry/cache/f;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lio/sentry/android/core/i0;->e:Lio/sentry/cache/f;

    .line 33
    .line 34
    new-instance p1, Lio/sentry/s6;

    .line 35
    .line 36
    const/4 p2, 0x0

    .line 37
    invoke-direct {p1, p3, p2}, Lio/sentry/s6;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    new-instance p2, Lio/sentry/d5;

    .line 41
    .line 42
    invoke-direct {p2, p1}, Lio/sentry/d5;-><init>(Lio/sentry/s6;)V

    .line 43
    .line 44
    .line 45
    iput-object p2, p0, Lio/sentry/android/core/i0;->d:Lio/sentry/d5;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/core/i0;->e:Lio/sentry/cache/f;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lio/sentry/cache/f;->b(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final f(Lio/sentry/c5;Lio/sentry/i0;)Lio/sentry/c5;
    .locals 37

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v0, "sentry:typeCheckHint"

    .line 6
    .line 7
    move-object/from16 v3, p2

    .line 8
    .line 9
    invoke-virtual {v3, v0}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v3, v0, Lio/sentry/hints/b;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    iget-object v5, v1, Lio/sentry/android/core/i0;->b:Lio/sentry/android/core/SentryAndroidOptions;

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget-object v1, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 25
    .line 26
    const-string v3, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping."

    .line 27
    .line 28
    new-array v4, v4, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-interface {v0, v1, v3, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object v2

    .line 34
    :cond_0
    move-object v3, v0

    .line 35
    check-cast v3, Lio/sentry/hints/b;

    .line 36
    .line 37
    iget-object v6, v1, Lio/sentry/android/core/i0;->f:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_2

    .line 48
    .line 49
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    check-cast v7, Lio/sentry/android/core/h0;

    .line 54
    .line 55
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    instance-of v9, v0, Lio/sentry/hints/a;

    .line 59
    .line 60
    if-eqz v9, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    const/4 v7, 0x0

    .line 64
    :goto_0
    const-string v6, "anr_background"

    .line 65
    .line 66
    const-string v9, "main"

    .line 67
    .line 68
    const-string v10, "ANR"

    .line 69
    .line 70
    const/4 v11, 0x1

    .line 71
    if-eqz v7, :cond_c

    .line 72
    .line 73
    instance-of v0, v3, Lio/sentry/hints/a;

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    move-object v0, v3

    .line 78
    check-cast v0, Lio/sentry/hints/a;

    .line 79
    .line 80
    invoke-interface {v0}, Lio/sentry/hints/a;->e()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    goto :goto_1

    .line 89
    :cond_3
    move v0, v4

    .line 90
    :goto_1
    iget-object v12, v7, Lio/sentry/android/core/h0;->a:Lio/sentry/android/core/i0;

    .line 91
    .line 92
    iget-object v13, v2, Lio/sentry/q4;->v:Ljava/lang/String;

    .line 93
    .line 94
    if-nez v13, :cond_4

    .line 95
    .line 96
    const-string v13, "java"

    .line 97
    .line 98
    iput-object v13, v2, Lio/sentry/q4;->v:Ljava/lang/String;

    .line 99
    .line 100
    :cond_4
    invoke-virtual {v2}, Lio/sentry/c5;->d()Ljava/util/ArrayList;

    .line 101
    .line 102
    .line 103
    move-result-object v13

    .line 104
    if-eqz v13, :cond_5

    .line 105
    .line 106
    goto/16 :goto_6

    .line 107
    .line 108
    :cond_5
    new-instance v13, Lio/sentry/protocol/o;

    .line 109
    .line 110
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-interface {v3}, Lio/sentry/hints/b;->a()Z

    .line 114
    .line 115
    .line 116
    move-result v14

    .line 117
    if-nez v14, :cond_6

    .line 118
    .line 119
    const-string v14, "HistoricalAppExitInfo"

    .line 120
    .line 121
    iput-object v14, v13, Lio/sentry/protocol/o;->a:Ljava/lang/String;

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_6
    const-string v14, "AppExitInfo"

    .line 125
    .line 126
    iput-object v14, v13, Lio/sentry/protocol/o;->a:Ljava/lang/String;

    .line 127
    .line 128
    :goto_2
    if-eqz v0, :cond_7

    .line 129
    .line 130
    const-string v0, "Background ANR"

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_7
    move-object v0, v10

    .line 134
    :goto_3
    new-instance v14, Lio/sentry/android/core/ApplicationNotResponding;

    .line 135
    .line 136
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 137
    .line 138
    .line 139
    move-result-object v15

    .line 140
    invoke-direct {v14, v0, v15}, Lio/sentry/android/core/ApplicationNotResponding;-><init>(Ljava/lang/String;Ljava/lang/Thread;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Lio/sentry/c5;->e()Ljava/util/ArrayList;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-eqz v0, :cond_9

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v15

    .line 157
    if-eqz v15, :cond_9

    .line 158
    .line 159
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v15

    .line 163
    check-cast v15, Lio/sentry/protocol/e0;

    .line 164
    .line 165
    iget-object v8, v15, Lio/sentry/protocol/e0;->c:Ljava/lang/String;

    .line 166
    .line 167
    if-eqz v8, :cond_8

    .line 168
    .line 169
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    if-eqz v8, :cond_8

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_9
    const/4 v15, 0x0

    .line 177
    :goto_4
    if-nez v15, :cond_a

    .line 178
    .line 179
    new-instance v15, Lio/sentry/protocol/e0;

    .line 180
    .line 181
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 182
    .line 183
    .line 184
    new-instance v0, Lio/sentry/protocol/c0;

    .line 185
    .line 186
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 187
    .line 188
    .line 189
    iput-object v0, v15, Lio/sentry/protocol/e0;->w:Lio/sentry/protocol/c0;

    .line 190
    .line 191
    :cond_a
    iget-object v0, v12, Lio/sentry/android/core/i0;->d:Lio/sentry/d5;

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iget-object v0, v15, Lio/sentry/protocol/e0;->w:Lio/sentry/protocol/c0;

    .line 197
    .line 198
    if-nez v0, :cond_b

    .line 199
    .line 200
    new-instance v0, Ljava/util/ArrayList;

    .line 201
    .line 202
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_b
    new-instance v8, Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-direct {v8, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 209
    .line 210
    .line 211
    iget-object v12, v15, Lio/sentry/protocol/e0;->a:Ljava/lang/Long;

    .line 212
    .line 213
    iget-object v0, v0, Lio/sentry/protocol/c0;->a:Ljava/util/List;

    .line 214
    .line 215
    invoke-static {v14, v13, v12, v0, v11}, Lio/sentry/d5;->c(Ljava/lang/Throwable;Lio/sentry/protocol/o;Ljava/lang/Long;Ljava/util/List;Z)Lio/sentry/protocol/v;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-object v0, v8

    .line 223
    :goto_5
    new-instance v8, Lio/sentry/d2;

    .line 224
    .line 225
    invoke-direct {v8, v0}, Lio/sentry/d2;-><init>(Ljava/util/List;)V

    .line 226
    .line 227
    .line 228
    iput-object v8, v2, Lio/sentry/c5;->e0:Lio/sentry/d2;

    .line 229
    .line 230
    :cond_c
    :goto_6
    iget-object v8, v2, Lio/sentry/q4;->b:Lio/sentry/protocol/e;

    .line 231
    .line 232
    invoke-virtual {v8}, Lio/sentry/protocol/e;->g()Lio/sentry/protocol/q;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    iget-object v12, v1, Lio/sentry/android/core/i0;->a:Landroid/content/Context;

    .line 237
    .line 238
    invoke-static {v12, v5}, Lio/sentry/android/core/t0;->c(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/t0;

    .line 239
    .line 240
    .line 241
    move-result-object v13

    .line 242
    iget-object v13, v13, Lio/sentry/android/core/t0;->g:Lio/sentry/protocol/q;

    .line 243
    .line 244
    invoke-virtual {v8, v13}, Lio/sentry/protocol/e;->r(Lio/sentry/protocol/q;)V

    .line 245
    .line 246
    .line 247
    if-eqz v0, :cond_e

    .line 248
    .line 249
    iget-object v13, v0, Lio/sentry/protocol/q;->a:Ljava/lang/String;

    .line 250
    .line 251
    if-eqz v13, :cond_d

    .line 252
    .line 253
    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    .line 254
    .line 255
    .line 256
    move-result v14

    .line 257
    if-nez v14, :cond_d

    .line 258
    .line 259
    new-instance v14, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    const-string v15, "os_"

    .line 262
    .line 263
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v13}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v13

    .line 270
    sget-object v15, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 271
    .line 272
    invoke-virtual {v13, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v13

    .line 276
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v13

    .line 283
    goto :goto_7

    .line 284
    :cond_d
    const-string v13, "os_1"

    .line 285
    .line 286
    :goto_7
    invoke-virtual {v8, v0, v13}, Lio/sentry/protocol/e;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    :cond_e
    invoke-virtual {v8}, Lio/sentry/protocol/e;->e()Lio/sentry/protocol/h;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    const-string v13, "Error getting installationId."

    .line 294
    .line 295
    iget-object v14, v1, Lio/sentry/android/core/i0;->c:Lio/sentry/android/core/o0;

    .line 296
    .line 297
    if-nez v0, :cond_13

    .line 298
    .line 299
    new-instance v15, Lio/sentry/protocol/h;

    .line 300
    .line 301
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 302
    .line 303
    .line 304
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 305
    .line 306
    iput-object v0, v15, Lio/sentry/protocol/h;->b:Ljava/lang/String;

    .line 307
    .line 308
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 309
    .line 310
    iput-object v0, v15, Lio/sentry/protocol/h;->c:Ljava/lang/String;

    .line 311
    .line 312
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-static {v0}, Lio/sentry/android/core/n0;->f(Lio/sentry/ILogger;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    iput-object v0, v15, Lio/sentry/protocol/h;->d:Ljava/lang/String;

    .line 321
    .line 322
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 323
    .line 324
    iput-object v0, v15, Lio/sentry/protocol/h;->e:Ljava/lang/String;

    .line 325
    .line 326
    sget-object v0, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 327
    .line 328
    iput-object v0, v15, Lio/sentry/protocol/h;->f:Ljava/lang/String;

    .line 329
    .line 330
    sget-object v0, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    .line 331
    .line 332
    iput-object v0, v15, Lio/sentry/protocol/h;->i:[Ljava/lang/String;

    .line 333
    .line 334
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-static {v12, v0}, Lio/sentry/android/core/n0;->g(Landroid/content/Context;Lio/sentry/ILogger;)Landroid/app/ActivityManager$MemoryInfo;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    move/from16 v16, v11

    .line 343
    .line 344
    move-object/from16 v17, v12

    .line 345
    .line 346
    if-eqz v0, :cond_f

    .line 347
    .line 348
    iget-wide v11, v0, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    .line 349
    .line 350
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    iput-object v0, v15, Lio/sentry/protocol/h;->X:Ljava/lang/Long;

    .line 355
    .line 356
    :cond_f
    invoke-virtual {v14}, Lio/sentry/android/core/o0;->a()Ljava/lang/Boolean;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    iput-object v0, v15, Lio/sentry/protocol/h;->W:Ljava/lang/Boolean;

    .line 361
    .line 362
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 363
    .line 364
    .line 365
    move-result-object v11

    .line 366
    :try_start_0
    invoke-virtual/range {v17 .. v17}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 371
    .line 372
    .line 373
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 374
    goto :goto_8

    .line 375
    :catchall_0
    move-exception v0

    .line 376
    sget-object v12, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 377
    .line 378
    const-string v4, "Error getting DisplayMetrics."

    .line 379
    .line 380
    invoke-interface {v11, v12, v4, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 381
    .line 382
    .line 383
    const/4 v0, 0x0

    .line 384
    :goto_8
    if-eqz v0, :cond_10

    .line 385
    .line 386
    iget v4, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 387
    .line 388
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    iput-object v4, v15, Lio/sentry/protocol/h;->f0:Ljava/lang/Integer;

    .line 393
    .line 394
    iget v4, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 395
    .line 396
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 397
    .line 398
    .line 399
    move-result-object v4

    .line 400
    iput-object v4, v15, Lio/sentry/protocol/h;->g0:Ljava/lang/Integer;

    .line 401
    .line 402
    iget v4, v0, Landroid/util/DisplayMetrics;->density:F

    .line 403
    .line 404
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 405
    .line 406
    .line 407
    move-result-object v4

    .line 408
    iput-object v4, v15, Lio/sentry/protocol/h;->h0:Ljava/lang/Float;

    .line 409
    .line 410
    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 411
    .line 412
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    iput-object v0, v15, Lio/sentry/protocol/h;->i0:Ljava/lang/Integer;

    .line 417
    .line 418
    :cond_10
    iget-object v0, v15, Lio/sentry/protocol/h;->l0:Ljava/lang/String;

    .line 419
    .line 420
    if-nez v0, :cond_11

    .line 421
    .line 422
    :try_start_1
    invoke-static/range {v17 .. v17}, Lio/sentry/android/core/y0;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 426
    goto :goto_9

    .line 427
    :catchall_1
    move-exception v0

    .line 428
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 429
    .line 430
    .line 431
    move-result-object v4

    .line 432
    sget-object v11, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 433
    .line 434
    invoke-interface {v4, v11, v13, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 435
    .line 436
    .line 437
    const/4 v0, 0x0

    .line 438
    :goto_9
    iput-object v0, v15, Lio/sentry/protocol/h;->l0:Ljava/lang/String;

    .line 439
    .line 440
    :cond_11
    sget-object v0, Lio/sentry/android/core/internal/util/f;->c:Lio/sentry/android/core/internal/util/f;

    .line 441
    .line 442
    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/f;->a()Ljava/util/ArrayList;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 447
    .line 448
    .line 449
    move-result v4

    .line 450
    if-nez v4, :cond_12

    .line 451
    .line 452
    invoke-static {v0}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v4

    .line 456
    check-cast v4, Ljava/lang/Integer;

    .line 457
    .line 458
    invoke-virtual {v4}, Ljava/lang/Integer;->doubleValue()D

    .line 459
    .line 460
    .line 461
    move-result-wide v11

    .line 462
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    iput-object v4, v15, Lio/sentry/protocol/h;->q0:Ljava/lang/Double;

    .line 467
    .line 468
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    iput-object v0, v15, Lio/sentry/protocol/h;->p0:Ljava/lang/Integer;

    .line 477
    .line 478
    :cond_12
    invoke-virtual {v8, v15}, Lio/sentry/protocol/e;->o(Lio/sentry/protocol/h;)V

    .line 479
    .line 480
    .line 481
    goto :goto_a

    .line 482
    :cond_13
    move/from16 v16, v11

    .line 483
    .line 484
    move-object/from16 v17, v12

    .line 485
    .line 486
    :goto_a
    invoke-interface {v3}, Lio/sentry/hints/b;->a()Z

    .line 487
    .line 488
    .line 489
    move-result v0

    .line 490
    if-nez v0, :cond_14

    .line 491
    .line 492
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    sget-object v1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 497
    .line 498
    const-string v3, "The event is Backfillable, but should not be enriched, skipping."

    .line 499
    .line 500
    const/4 v4, 0x0

    .line 501
    new-array v4, v4, [Ljava/lang/Object;

    .line 502
    .line 503
    invoke-interface {v0, v1, v3, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    return-object v2

    .line 507
    :cond_14
    iget-object v0, v2, Lio/sentry/q4;->d:Lio/sentry/protocol/r;

    .line 508
    .line 509
    if-nez v0, :cond_15

    .line 510
    .line 511
    const-string v0, "request.json"

    .line 512
    .line 513
    const-class v4, Lio/sentry/protocol/r;

    .line 514
    .line 515
    invoke-virtual {v1, v5, v0, v4}, Lio/sentry/android/core/i0;->a(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    check-cast v0, Lio/sentry/protocol/r;

    .line 520
    .line 521
    iput-object v0, v2, Lio/sentry/q4;->d:Lio/sentry/protocol/r;

    .line 522
    .line 523
    :cond_15
    iget-object v0, v2, Lio/sentry/q4;->w:Lio/sentry/protocol/j0;

    .line 524
    .line 525
    if-nez v0, :cond_16

    .line 526
    .line 527
    const-string v0, "user.json"

    .line 528
    .line 529
    const-class v4, Lio/sentry/protocol/j0;

    .line 530
    .line 531
    invoke-virtual {v1, v5, v0, v4}, Lio/sentry/android/core/i0;->a(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    check-cast v0, Lio/sentry/protocol/j0;

    .line 536
    .line 537
    iput-object v0, v2, Lio/sentry/q4;->w:Lio/sentry/protocol/j0;

    .line 538
    .line 539
    :cond_16
    const-string v4, "tags.json"

    .line 540
    .line 541
    const-class v11, Ljava/util/Map;

    .line 542
    .line 543
    invoke-virtual {v1, v5, v4, v11}, Lio/sentry/android/core/i0;->a(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    check-cast v0, Ljava/util/Map;

    .line 548
    .line 549
    if-nez v0, :cond_17

    .line 550
    .line 551
    goto :goto_c

    .line 552
    :cond_17
    iget-object v12, v2, Lio/sentry/q4;->e:Ljava/util/AbstractMap;

    .line 553
    .line 554
    if-nez v12, :cond_18

    .line 555
    .line 556
    new-instance v12, Ljava/util/HashMap;

    .line 557
    .line 558
    invoke-direct {v12, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v2, v12}, Lio/sentry/q4;->c(Ljava/util/Map;)V

    .line 562
    .line 563
    .line 564
    goto :goto_c

    .line 565
    :cond_18
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 574
    .line 575
    .line 576
    move-result v12

    .line 577
    if-eqz v12, :cond_1a

    .line 578
    .line 579
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v12

    .line 583
    check-cast v12, Ljava/util/Map$Entry;

    .line 584
    .line 585
    iget-object v15, v2, Lio/sentry/q4;->e:Ljava/util/AbstractMap;

    .line 586
    .line 587
    move-object/from16 v19, v0

    .line 588
    .line 589
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    invoke-interface {v15, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    move-result v0

    .line 597
    if-nez v0, :cond_19

    .line 598
    .line 599
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    check-cast v0, Ljava/lang/String;

    .line 604
    .line 605
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v12

    .line 609
    check-cast v12, Ljava/lang/String;

    .line 610
    .line 611
    invoke-virtual {v2, v0, v12}, Lio/sentry/q4;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 612
    .line 613
    .line 614
    :cond_19
    move-object/from16 v0, v19

    .line 615
    .line 616
    goto :goto_b

    .line 617
    :cond_1a
    :goto_c
    const-string v0, "breadcrumbs.json"

    .line 618
    .line 619
    const-class v12, Ljava/util/List;

    .line 620
    .line 621
    invoke-virtual {v1, v5, v0, v12}, Lio/sentry/android/core/i0;->a(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    check-cast v0, Ljava/util/List;

    .line 626
    .line 627
    if-nez v0, :cond_1b

    .line 628
    .line 629
    goto :goto_d

    .line 630
    :cond_1b
    iget-object v15, v2, Lio/sentry/q4;->X:Ljava/util/List;

    .line 631
    .line 632
    if-nez v15, :cond_1c

    .line 633
    .line 634
    new-instance v15, Ljava/util/ArrayList;

    .line 635
    .line 636
    invoke-direct {v15, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 637
    .line 638
    .line 639
    iput-object v15, v2, Lio/sentry/q4;->X:Ljava/util/List;

    .line 640
    .line 641
    goto :goto_d

    .line 642
    :cond_1c
    invoke-interface {v15, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 643
    .line 644
    .line 645
    :goto_d
    const-string v0, "extras.json"

    .line 646
    .line 647
    invoke-virtual {v1, v5, v0, v11}, Lio/sentry/android/core/i0;->a(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    check-cast v0, Ljava/util/Map;

    .line 652
    .line 653
    if-nez v0, :cond_1d

    .line 654
    .line 655
    goto :goto_e

    .line 656
    :cond_1d
    iget-object v15, v2, Lio/sentry/q4;->Z:Ljava/util/AbstractMap;

    .line 657
    .line 658
    if-nez v15, :cond_1f

    .line 659
    .line 660
    new-instance v15, Ljava/util/HashMap;

    .line 661
    .line 662
    invoke-direct {v15, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 663
    .line 664
    .line 665
    new-instance v0, Ljava/util/HashMap;

    .line 666
    .line 667
    invoke-direct {v0, v15}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 668
    .line 669
    .line 670
    iput-object v0, v2, Lio/sentry/q4;->Z:Ljava/util/AbstractMap;

    .line 671
    .line 672
    :cond_1e
    :goto_e
    move-object/from16 v21, v10

    .line 673
    .line 674
    goto :goto_11

    .line 675
    :cond_1f
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 684
    .line 685
    .line 686
    move-result v15

    .line 687
    if-eqz v15, :cond_1e

    .line 688
    .line 689
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v15

    .line 693
    check-cast v15, Ljava/util/Map$Entry;

    .line 694
    .line 695
    move-object/from16 v19, v0

    .line 696
    .line 697
    iget-object v0, v2, Lio/sentry/q4;->Z:Ljava/util/AbstractMap;

    .line 698
    .line 699
    move-object/from16 v20, v15

    .line 700
    .line 701
    invoke-interface/range {v20 .. v20}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v15

    .line 705
    invoke-interface {v0, v15}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 706
    .line 707
    .line 708
    move-result v0

    .line 709
    if-nez v0, :cond_20

    .line 710
    .line 711
    iget-object v0, v2, Lio/sentry/q4;->Z:Ljava/util/AbstractMap;

    .line 712
    .line 713
    invoke-interface/range {v20 .. v20}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v15

    .line 717
    check-cast v15, Ljava/lang/String;

    .line 718
    .line 719
    move-object/from16 v21, v10

    .line 720
    .line 721
    invoke-interface/range {v20 .. v20}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v10

    .line 725
    invoke-interface {v0, v15, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    goto :goto_10

    .line 729
    :cond_20
    move-object/from16 v21, v10

    .line 730
    .line 731
    :goto_10
    move-object/from16 v0, v19

    .line 732
    .line 733
    move-object/from16 v10, v21

    .line 734
    .line 735
    goto :goto_f

    .line 736
    :goto_11
    const-string v0, "contexts.json"

    .line 737
    .line 738
    const-class v10, Lio/sentry/protocol/e;

    .line 739
    .line 740
    invoke-virtual {v1, v5, v0, v10}, Lio/sentry/android/core/i0;->a(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    check-cast v0, Lio/sentry/protocol/e;

    .line 745
    .line 746
    if-nez v0, :cond_21

    .line 747
    .line 748
    goto :goto_14

    .line 749
    :cond_21
    new-instance v10, Lio/sentry/protocol/e;

    .line 750
    .line 751
    invoke-direct {v10, v0}, Lio/sentry/protocol/e;-><init>(Lio/sentry/protocol/e;)V

    .line 752
    .line 753
    .line 754
    iget-object v0, v10, Lio/sentry/protocol/e;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 755
    .line 756
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 765
    .line 766
    .line 767
    move-result v10

    .line 768
    if-eqz v10, :cond_24

    .line 769
    .line 770
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v10

    .line 774
    check-cast v10, Ljava/util/Map$Entry;

    .line 775
    .line 776
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v15

    .line 780
    move-object/from16 v19, v0

    .line 781
    .line 782
    const-string v0, "trace"

    .line 783
    .line 784
    move-object/from16 v20, v10

    .line 785
    .line 786
    invoke-interface/range {v20 .. v20}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v10

    .line 790
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 791
    .line 792
    .line 793
    move-result v0

    .line 794
    if-eqz v0, :cond_23

    .line 795
    .line 796
    instance-of v0, v15, Lio/sentry/b7;

    .line 797
    .line 798
    if-eqz v0, :cond_23

    .line 799
    .line 800
    :cond_22
    :goto_13
    move-object/from16 v0, v19

    .line 801
    .line 802
    goto :goto_12

    .line 803
    :cond_23
    invoke-interface/range {v20 .. v20}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    invoke-virtual {v8, v0}, Lio/sentry/protocol/e;->a(Ljava/lang/Object;)Z

    .line 808
    .line 809
    .line 810
    move-result v0

    .line 811
    if-nez v0, :cond_22

    .line 812
    .line 813
    invoke-interface/range {v20 .. v20}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    check-cast v0, Ljava/lang/String;

    .line 818
    .line 819
    invoke-virtual {v8, v15, v0}, Lio/sentry/protocol/e;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    goto :goto_13

    .line 823
    :cond_24
    :goto_14
    const-string v0, "transaction.json"

    .line 824
    .line 825
    const-class v10, Ljava/lang/String;

    .line 826
    .line 827
    invoke-virtual {v1, v5, v0, v10}, Lio/sentry/android/core/i0;->a(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    check-cast v0, Ljava/lang/String;

    .line 832
    .line 833
    iget-object v15, v2, Lio/sentry/c5;->g0:Ljava/lang/String;

    .line 834
    .line 835
    if-nez v15, :cond_25

    .line 836
    .line 837
    iput-object v0, v2, Lio/sentry/c5;->g0:Ljava/lang/String;

    .line 838
    .line 839
    :cond_25
    const-string v0, "fingerprint.json"

    .line 840
    .line 841
    invoke-virtual {v1, v5, v0, v12}, Lio/sentry/android/core/i0;->a(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    check-cast v0, Ljava/util/List;

    .line 846
    .line 847
    iget-object v12, v2, Lio/sentry/c5;->h0:Ljava/util/List;

    .line 848
    .line 849
    if-nez v12, :cond_26

    .line 850
    .line 851
    invoke-virtual {v2, v0}, Lio/sentry/c5;->h(Ljava/util/List;)V

    .line 852
    .line 853
    .line 854
    :cond_26
    const-string v0, "level.json"

    .line 855
    .line 856
    const-class v12, Lio/sentry/m5;

    .line 857
    .line 858
    invoke-virtual {v1, v5, v0, v12}, Lio/sentry/android/core/i0;->a(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v0

    .line 862
    check-cast v0, Lio/sentry/m5;

    .line 863
    .line 864
    iget-object v12, v2, Lio/sentry/c5;->f0:Lio/sentry/m5;

    .line 865
    .line 866
    if-nez v12, :cond_27

    .line 867
    .line 868
    iput-object v0, v2, Lio/sentry/c5;->f0:Lio/sentry/m5;

    .line 869
    .line 870
    :cond_27
    const-string v0, "trace.json"

    .line 871
    .line 872
    const-class v12, Lio/sentry/b7;

    .line 873
    .line 874
    invoke-virtual {v1, v5, v0, v12}, Lio/sentry/android/core/i0;->a(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    check-cast v0, Lio/sentry/b7;

    .line 879
    .line 880
    invoke-virtual {v8}, Lio/sentry/protocol/e;->i()Lio/sentry/b7;

    .line 881
    .line 882
    .line 883
    move-result-object v12

    .line 884
    if-nez v12, :cond_28

    .line 885
    .line 886
    if-eqz v0, :cond_28

    .line 887
    .line 888
    invoke-virtual {v8, v0}, Lio/sentry/protocol/e;->v(Lio/sentry/b7;)V

    .line 889
    .line 890
    .line 891
    :cond_28
    const-string v0, "replay.json"

    .line 892
    .line 893
    invoke-virtual {v1, v5, v0, v10}, Lio/sentry/android/core/i0;->a(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    move-result-object v1

    .line 897
    check-cast v1, Ljava/lang/String;

    .line 898
    .line 899
    invoke-virtual {v5}, Lio/sentry/m6;->getCacheDirPath()Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v12

    .line 903
    const-string v15, ".options-cache"

    .line 904
    .line 905
    if-nez v12, :cond_29

    .line 906
    .line 907
    move-object/from16 v22, v6

    .line 908
    .line 909
    move-object/from16 v20, v7

    .line 910
    .line 911
    move-object/from16 v19, v9

    .line 912
    .line 913
    goto/16 :goto_18

    .line 914
    .line 915
    :cond_29
    move-object/from16 v19, v9

    .line 916
    .line 917
    new-instance v9, Ljava/io/File;

    .line 918
    .line 919
    move-object/from16 v20, v7

    .line 920
    .line 921
    const-string v7, "replay_"

    .line 922
    .line 923
    move-object/from16 v22, v6

    .line 924
    .line 925
    invoke-static {v7, v1}, Len;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 926
    .line 927
    .line 928
    move-result-object v6

    .line 929
    invoke-direct {v9, v12, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 930
    .line 931
    .line 932
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    .line 933
    .line 934
    .line 935
    move-result v6

    .line 936
    if-nez v6, :cond_2f

    .line 937
    .line 938
    const-string v1, "replay-error-sample-rate.json"

    .line 939
    .line 940
    invoke-static {v5, v15, v1, v10}, Lio/sentry/cache/a;->c(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v1

    .line 944
    check-cast v1, Ljava/lang/String;

    .line 945
    .line 946
    if-nez v1, :cond_2a

    .line 947
    .line 948
    goto/16 :goto_18

    .line 949
    .line 950
    :cond_2a
    :try_start_2
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 951
    .line 952
    .line 953
    move-result-wide v23

    .line 954
    invoke-static {}, Lio/sentry/util/m;->a()Lio/sentry/util/l;

    .line 955
    .line 956
    .line 957
    move-result-object v1

    .line 958
    invoke-virtual {v1}, Lio/sentry/util/l;->c()D

    .line 959
    .line 960
    .line 961
    move-result-wide v25

    .line 962
    cmpg-double v1, v23, v25

    .line 963
    .line 964
    if-gez v1, :cond_2b

    .line 965
    .line 966
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 967
    .line 968
    .line 969
    move-result-object v0

    .line 970
    sget-object v1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 971
    .line 972
    const-string v6, "Not capturing replay for ANR %s due to not being sampled."

    .line 973
    .line 974
    iget-object v7, v2, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 975
    .line 976
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    move-result-object v7

    .line 980
    invoke-interface {v0, v1, v6, v7}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 981
    .line 982
    .line 983
    goto/16 :goto_18

    .line 984
    .line 985
    :catchall_2
    move-exception v0

    .line 986
    goto :goto_16

    .line 987
    :cond_2b
    new-instance v1, Ljava/io/File;

    .line 988
    .line 989
    invoke-direct {v1, v12}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 990
    .line 991
    .line 992
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 993
    .line 994
    .line 995
    move-result-object v1

    .line 996
    if-eqz v1, :cond_2e

    .line 997
    .line 998
    array-length v6, v1

    .line 999
    const-wide/high16 v23, -0x8000000000000000L

    .line 1000
    .line 1001
    const/4 v9, 0x0

    .line 1002
    const/4 v12, 0x0

    .line 1003
    :goto_15
    if-ge v12, v6, :cond_2d

    .line 1004
    .line 1005
    aget-object v25, v1, v12

    .line 1006
    .line 1007
    invoke-virtual/range {v25 .. v25}, Ljava/io/File;->isDirectory()Z

    .line 1008
    .line 1009
    .line 1010
    move-result v26

    .line 1011
    move-object/from16 p0, v1

    .line 1012
    .line 1013
    if-eqz v26, :cond_2c

    .line 1014
    .line 1015
    invoke-virtual/range {v25 .. v25}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v1

    .line 1019
    invoke-virtual {v1, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1020
    .line 1021
    .line 1022
    move-result v1

    .line 1023
    if-eqz v1, :cond_2c

    .line 1024
    .line 1025
    invoke-virtual/range {v25 .. v25}, Ljava/io/File;->lastModified()J

    .line 1026
    .line 1027
    .line 1028
    move-result-wide v26

    .line 1029
    cmp-long v1, v26, v23

    .line 1030
    .line 1031
    if-lez v1, :cond_2c

    .line 1032
    .line 1033
    invoke-virtual/range {v25 .. v25}, Ljava/io/File;->lastModified()J

    .line 1034
    .line 1035
    .line 1036
    move-result-wide v26

    .line 1037
    iget-object v1, v2, Lio/sentry/c5;->a0:Ljava/util/Date;

    .line 1038
    .line 1039
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    .line 1040
    .line 1041
    .line 1042
    move-result-wide v28

    .line 1043
    cmp-long v1, v26, v28

    .line 1044
    .line 1045
    if-gtz v1, :cond_2c

    .line 1046
    .line 1047
    invoke-virtual/range {v25 .. v25}, Ljava/io/File;->lastModified()J

    .line 1048
    .line 1049
    .line 1050
    move-result-wide v23

    .line 1051
    invoke-virtual/range {v25 .. v25}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v1

    .line 1055
    const/4 v9, 0x7

    .line 1056
    invoke-virtual {v1, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v9

    .line 1060
    :cond_2c
    add-int/lit8 v12, v12, 0x1

    .line 1061
    .line 1062
    move-object/from16 v1, p0

    .line 1063
    .line 1064
    goto :goto_15

    .line 1065
    :cond_2d
    move-object v1, v9

    .line 1066
    goto :goto_17

    .line 1067
    :cond_2e
    const/4 v1, 0x0

    .line 1068
    goto :goto_17

    .line 1069
    :goto_16
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v1

    .line 1073
    sget-object v6, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1074
    .line 1075
    const-string v7, "Error parsing replay sample rate."

    .line 1076
    .line 1077
    invoke-interface {v1, v6, v7, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1078
    .line 1079
    .line 1080
    goto :goto_18

    .line 1081
    :cond_2f
    :goto_17
    if-nez v1, :cond_30

    .line 1082
    .line 1083
    goto :goto_18

    .line 1084
    :cond_30
    sget-object v6, Lio/sentry/cache/f;->c:Ljava/nio/charset/Charset;

    .line 1085
    .line 1086
    const-string v6, ".scope-cache"

    .line 1087
    .line 1088
    invoke-static {v5, v1, v6, v0}, Lio/sentry/cache/a;->d(Lio/sentry/m6;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 1089
    .line 1090
    .line 1091
    const-string v0, "replay_id"

    .line 1092
    .line 1093
    invoke-virtual {v8, v1, v0}, Lio/sentry/protocol/e;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1094
    .line 1095
    .line 1096
    :goto_18
    iget-object v0, v2, Lio/sentry/q4;->f:Ljava/lang/String;

    .line 1097
    .line 1098
    const-string v1, "release.json"

    .line 1099
    .line 1100
    if-nez v0, :cond_31

    .line 1101
    .line 1102
    invoke-static {v5, v15, v1, v10}, Lio/sentry/cache/a;->c(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v0

    .line 1106
    check-cast v0, Ljava/lang/String;

    .line 1107
    .line 1108
    iput-object v0, v2, Lio/sentry/q4;->f:Ljava/lang/String;

    .line 1109
    .line 1110
    :cond_31
    iget-object v0, v2, Lio/sentry/q4;->i:Ljava/lang/String;

    .line 1111
    .line 1112
    if-nez v0, :cond_33

    .line 1113
    .line 1114
    const-string v0, "environment.json"

    .line 1115
    .line 1116
    invoke-static {v5, v15, v0, v10}, Lio/sentry/cache/a;->c(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v0

    .line 1120
    check-cast v0, Ljava/lang/String;

    .line 1121
    .line 1122
    if-eqz v0, :cond_32

    .line 1123
    .line 1124
    goto :goto_19

    .line 1125
    :cond_32
    invoke-virtual {v5}, Lio/sentry/m6;->getEnvironment()Ljava/lang/String;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v0

    .line 1129
    :goto_19
    iput-object v0, v2, Lio/sentry/q4;->i:Ljava/lang/String;

    .line 1130
    .line 1131
    :cond_33
    iget-object v0, v2, Lio/sentry/q4;->W:Ljava/lang/String;

    .line 1132
    .line 1133
    if-nez v0, :cond_34

    .line 1134
    .line 1135
    const-string v0, "dist.json"

    .line 1136
    .line 1137
    invoke-static {v5, v15, v0, v10}, Lio/sentry/cache/a;->c(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v0

    .line 1141
    check-cast v0, Ljava/lang/String;

    .line 1142
    .line 1143
    iput-object v0, v2, Lio/sentry/q4;->W:Ljava/lang/String;

    .line 1144
    .line 1145
    :cond_34
    iget-object v0, v2, Lio/sentry/q4;->W:Ljava/lang/String;

    .line 1146
    .line 1147
    const-string v6, "Failed to parse release from scope cache: %s"

    .line 1148
    .line 1149
    const/16 v7, 0x2b

    .line 1150
    .line 1151
    if-nez v0, :cond_35

    .line 1152
    .line 1153
    invoke-static {v5, v15, v1, v10}, Lio/sentry/cache/a;->c(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v0

    .line 1157
    check-cast v0, Ljava/lang/String;

    .line 1158
    .line 1159
    if-eqz v0, :cond_35

    .line 1160
    .line 1161
    :try_start_3
    invoke-virtual {v0, v7}, Ljava/lang/String;->indexOf(I)I

    .line 1162
    .line 1163
    .line 1164
    move-result v9

    .line 1165
    add-int/lit8 v9, v9, 0x1

    .line 1166
    .line 1167
    invoke-virtual {v0, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v9

    .line 1171
    iput-object v9, v2, Lio/sentry/q4;->W:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1172
    .line 1173
    goto :goto_1a

    .line 1174
    :catchall_3
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v9

    .line 1178
    sget-object v12, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 1179
    .line 1180
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v0

    .line 1184
    invoke-interface {v9, v12, v6, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1185
    .line 1186
    .line 1187
    :cond_35
    :goto_1a
    iget-object v0, v2, Lio/sentry/q4;->Y:Lio/sentry/protocol/f;

    .line 1188
    .line 1189
    if-nez v0, :cond_36

    .line 1190
    .line 1191
    new-instance v0, Lio/sentry/protocol/f;

    .line 1192
    .line 1193
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1194
    .line 1195
    .line 1196
    :cond_36
    iget-object v9, v0, Lio/sentry/protocol/f;->b:Ljava/util/List;

    .line 1197
    .line 1198
    if-nez v9, :cond_37

    .line 1199
    .line 1200
    new-instance v9, Ljava/util/ArrayList;

    .line 1201
    .line 1202
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1203
    .line 1204
    .line 1205
    new-instance v12, Ljava/util/ArrayList;

    .line 1206
    .line 1207
    invoke-direct {v12, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1208
    .line 1209
    .line 1210
    iput-object v12, v0, Lio/sentry/protocol/f;->b:Ljava/util/List;

    .line 1211
    .line 1212
    :cond_37
    iget-object v9, v0, Lio/sentry/protocol/f;->b:Ljava/util/List;

    .line 1213
    .line 1214
    if-eqz v9, :cond_39

    .line 1215
    .line 1216
    const-string v12, "proguard-uuid.json"

    .line 1217
    .line 1218
    invoke-static {v5, v15, v12, v10}, Lio/sentry/cache/a;->c(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v12

    .line 1222
    check-cast v12, Ljava/lang/String;

    .line 1223
    .line 1224
    if-eqz v12, :cond_38

    .line 1225
    .line 1226
    new-instance v7, Lio/sentry/protocol/DebugImage;

    .line 1227
    .line 1228
    invoke-direct {v7}, Lio/sentry/protocol/DebugImage;-><init>()V

    .line 1229
    .line 1230
    .line 1231
    move-object/from16 v23, v3

    .line 1232
    .line 1233
    const-string v3, "proguard"

    .line 1234
    .line 1235
    invoke-virtual {v7, v3}, Lio/sentry/protocol/DebugImage;->setType(Ljava/lang/String;)V

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual {v7, v12}, Lio/sentry/protocol/DebugImage;->setUuid(Ljava/lang/String;)V

    .line 1239
    .line 1240
    .line 1241
    invoke-interface {v9, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1242
    .line 1243
    .line 1244
    goto :goto_1b

    .line 1245
    :cond_38
    move-object/from16 v23, v3

    .line 1246
    .line 1247
    :goto_1b
    iput-object v0, v2, Lio/sentry/q4;->Y:Lio/sentry/protocol/f;

    .line 1248
    .line 1249
    goto :goto_1c

    .line 1250
    :cond_39
    move-object/from16 v23, v3

    .line 1251
    .line 1252
    :goto_1c
    iget-object v0, v2, Lio/sentry/q4;->c:Lio/sentry/protocol/u;

    .line 1253
    .line 1254
    if-nez v0, :cond_3a

    .line 1255
    .line 1256
    const-string v0, "sdk-version.json"

    .line 1257
    .line 1258
    const-class v3, Lio/sentry/protocol/u;

    .line 1259
    .line 1260
    invoke-static {v5, v15, v0, v3}, Lio/sentry/cache/a;->c(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v0

    .line 1264
    check-cast v0, Lio/sentry/protocol/u;

    .line 1265
    .line 1266
    iput-object v0, v2, Lio/sentry/q4;->c:Lio/sentry/protocol/u;

    .line 1267
    .line 1268
    :cond_3a
    invoke-virtual {v8}, Lio/sentry/protocol/e;->d()Lio/sentry/protocol/a;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v0

    .line 1272
    if-nez v0, :cond_3b

    .line 1273
    .line 1274
    new-instance v0, Lio/sentry/protocol/a;

    .line 1275
    .line 1276
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1277
    .line 1278
    .line 1279
    :cond_3b
    move-object v3, v0

    .line 1280
    sget-object v0, Lio/sentry/android/core/n0;->c:Las0;

    .line 1281
    .line 1282
    move-object/from16 v7, v17

    .line 1283
    .line 1284
    invoke-virtual {v0, v7}, Las0;->c(Landroid/content/Context;)Ljava/lang/Object;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v0

    .line 1288
    check-cast v0, Ljava/lang/String;

    .line 1289
    .line 1290
    iput-object v0, v3, Lio/sentry/protocol/a;->e:Ljava/lang/String;

    .line 1291
    .line 1292
    invoke-static {v7, v14}, Lio/sentry/android/core/n0;->h(Landroid/content/Context;Lio/sentry/android/core/o0;)Landroid/content/pm/PackageInfo;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v0

    .line 1296
    if-eqz v0, :cond_3c

    .line 1297
    .line 1298
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 1299
    .line 1300
    iput-object v0, v3, Lio/sentry/protocol/a;->a:Ljava/lang/String;

    .line 1301
    .line 1302
    :cond_3c
    iget-object v0, v2, Lio/sentry/q4;->f:Ljava/lang/String;

    .line 1303
    .line 1304
    if-eqz v0, :cond_3d

    .line 1305
    .line 1306
    goto :goto_1d

    .line 1307
    :cond_3d
    invoke-static {v5, v15, v1, v10}, Lio/sentry/cache/a;->c(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v0

    .line 1311
    check-cast v0, Ljava/lang/String;

    .line 1312
    .line 1313
    :goto_1d
    if-eqz v0, :cond_3e

    .line 1314
    .line 1315
    const/16 v1, 0x40

    .line 1316
    .line 1317
    :try_start_4
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 1318
    .line 1319
    .line 1320
    move-result v1

    .line 1321
    add-int/lit8 v1, v1, 0x1

    .line 1322
    .line 1323
    const/16 v9, 0x2b

    .line 1324
    .line 1325
    invoke-virtual {v0, v9}, Ljava/lang/String;->indexOf(I)I

    .line 1326
    .line 1327
    .line 1328
    move-result v10

    .line 1329
    invoke-virtual {v0, v1, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v1

    .line 1333
    invoke-virtual {v0, v9}, Ljava/lang/String;->indexOf(I)I

    .line 1334
    .line 1335
    .line 1336
    move-result v9

    .line 1337
    add-int/lit8 v9, v9, 0x1

    .line 1338
    .line 1339
    invoke-virtual {v0, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v9

    .line 1343
    iput-object v1, v3, Lio/sentry/protocol/a;->f:Ljava/lang/String;

    .line 1344
    .line 1345
    iput-object v9, v3, Lio/sentry/protocol/a;->i:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 1346
    .line 1347
    goto :goto_1e

    .line 1348
    :catchall_4
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v1

    .line 1352
    sget-object v9, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 1353
    .line 1354
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v0

    .line 1358
    invoke-interface {v1, v9, v6, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1359
    .line 1360
    .line 1361
    :cond_3e
    :goto_1e
    :try_start_5
    invoke-static {v7, v5}, Lio/sentry/android/core/t0;->c(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/t0;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v0

    .line 1365
    iget-object v0, v0, Lio/sentry/android/core/t0;->f:Lio/sentry/android/core/m0;

    .line 1366
    .line 1367
    if-eqz v0, :cond_3f

    .line 1368
    .line 1369
    iget-boolean v1, v0, Lio/sentry/android/core/m0;->a:Z

    .line 1370
    .line 1371
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v1

    .line 1375
    iput-object v1, v3, Lio/sentry/protocol/a;->W:Ljava/lang/Boolean;

    .line 1376
    .line 1377
    iget-object v0, v0, Lio/sentry/android/core/m0;->b:Ljava/io/Serializable;

    .line 1378
    .line 1379
    check-cast v0, [Ljava/lang/String;

    .line 1380
    .line 1381
    if-eqz v0, :cond_3f

    .line 1382
    .line 1383
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v0

    .line 1387
    iput-object v0, v3, Lio/sentry/protocol/a;->X:Ljava/util/List;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 1388
    .line 1389
    goto :goto_1f

    .line 1390
    :catchall_5
    move-exception v0

    .line 1391
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v1

    .line 1395
    sget-object v6, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1396
    .line 1397
    const-string v9, "Error getting split apks info."

    .line 1398
    .line 1399
    invoke-interface {v1, v6, v9, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1400
    .line 1401
    .line 1402
    :cond_3f
    :goto_1f
    invoke-virtual {v8, v3}, Lio/sentry/protocol/e;->m(Lio/sentry/protocol/a;)V

    .line 1403
    .line 1404
    .line 1405
    invoke-static {v5, v15, v4, v11}, Lio/sentry/cache/a;->c(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v0

    .line 1409
    check-cast v0, Ljava/util/Map;

    .line 1410
    .line 1411
    if-nez v0, :cond_40

    .line 1412
    .line 1413
    goto :goto_21

    .line 1414
    :cond_40
    iget-object v1, v2, Lio/sentry/q4;->e:Ljava/util/AbstractMap;

    .line 1415
    .line 1416
    if-nez v1, :cond_41

    .line 1417
    .line 1418
    new-instance v1, Ljava/util/HashMap;

    .line 1419
    .line 1420
    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 1421
    .line 1422
    .line 1423
    invoke-virtual {v2, v1}, Lio/sentry/q4;->c(Ljava/util/Map;)V

    .line 1424
    .line 1425
    .line 1426
    goto :goto_21

    .line 1427
    :cond_41
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v0

    .line 1431
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v0

    .line 1435
    :cond_42
    :goto_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1436
    .line 1437
    .line 1438
    move-result v1

    .line 1439
    if-eqz v1, :cond_43

    .line 1440
    .line 1441
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v1

    .line 1445
    check-cast v1, Ljava/util/Map$Entry;

    .line 1446
    .line 1447
    iget-object v3, v2, Lio/sentry/q4;->e:Ljava/util/AbstractMap;

    .line 1448
    .line 1449
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v4

    .line 1453
    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1454
    .line 1455
    .line 1456
    move-result v3

    .line 1457
    if-nez v3, :cond_42

    .line 1458
    .line 1459
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v3

    .line 1463
    check-cast v3, Ljava/lang/String;

    .line 1464
    .line 1465
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v1

    .line 1469
    check-cast v1, Ljava/lang/String;

    .line 1470
    .line 1471
    invoke-virtual {v2, v3, v1}, Lio/sentry/q4;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1472
    .line 1473
    .line 1474
    goto :goto_20

    .line 1475
    :cond_43
    :goto_21
    iget-object v0, v2, Lio/sentry/q4;->w:Lio/sentry/protocol/j0;

    .line 1476
    .line 1477
    if-nez v0, :cond_44

    .line 1478
    .line 1479
    new-instance v0, Lio/sentry/protocol/j0;

    .line 1480
    .line 1481
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1482
    .line 1483
    .line 1484
    iput-object v0, v2, Lio/sentry/q4;->w:Lio/sentry/protocol/j0;

    .line 1485
    .line 1486
    :cond_44
    move-object v1, v0

    .line 1487
    iget-object v0, v1, Lio/sentry/protocol/j0;->b:Ljava/lang/String;

    .line 1488
    .line 1489
    if-nez v0, :cond_45

    .line 1490
    .line 1491
    :try_start_6
    invoke-static {v7}, Lio/sentry/android/core/y0;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 1495
    goto :goto_22

    .line 1496
    :catchall_6
    move-exception v0

    .line 1497
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v3

    .line 1501
    sget-object v4, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1502
    .line 1503
    invoke-interface {v3, v4, v13, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1504
    .line 1505
    .line 1506
    const/4 v0, 0x0

    .line 1507
    :goto_22
    iput-object v0, v1, Lio/sentry/protocol/j0;->b:Ljava/lang/String;

    .line 1508
    .line 1509
    :cond_45
    iget-object v0, v1, Lio/sentry/protocol/j0;->d:Ljava/lang/String;

    .line 1510
    .line 1511
    if-nez v0, :cond_46

    .line 1512
    .line 1513
    invoke-virtual {v5}, Lio/sentry/m6;->isSendDefaultPii()Z

    .line 1514
    .line 1515
    .line 1516
    move-result v0

    .line 1517
    if-eqz v0, :cond_46

    .line 1518
    .line 1519
    const-string v0, "{{auto}}"

    .line 1520
    .line 1521
    iput-object v0, v1, Lio/sentry/protocol/j0;->d:Ljava/lang/String;

    .line 1522
    .line 1523
    :cond_46
    :try_start_7
    invoke-static {v7, v5}, Lio/sentry/android/core/t0;->c(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/t0;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v0

    .line 1527
    iget-object v0, v0, Lio/sentry/android/core/t0;->e:Lio/sentry/android/core/m0;

    .line 1528
    .line 1529
    if-eqz v0, :cond_48

    .line 1530
    .line 1531
    new-instance v1, Ljava/util/HashMap;

    .line 1532
    .line 1533
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 1534
    .line 1535
    .line 1536
    const-string v3, "isSideLoaded"

    .line 1537
    .line 1538
    iget-boolean v4, v0, Lio/sentry/android/core/m0;->a:Z

    .line 1539
    .line 1540
    invoke-static {v4}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v4

    .line 1544
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1545
    .line 1546
    .line 1547
    iget-object v0, v0, Lio/sentry/android/core/m0;->b:Ljava/io/Serializable;

    .line 1548
    .line 1549
    check-cast v0, Ljava/lang/String;

    .line 1550
    .line 1551
    if-eqz v0, :cond_47

    .line 1552
    .line 1553
    const-string v3, "installerStore"

    .line 1554
    .line 1555
    invoke-virtual {v1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1556
    .line 1557
    .line 1558
    :cond_47
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v0

    .line 1562
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v0

    .line 1566
    :goto_23
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1567
    .line 1568
    .line 1569
    move-result v1

    .line 1570
    if-eqz v1, :cond_48

    .line 1571
    .line 1572
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v1

    .line 1576
    check-cast v1, Ljava/util/Map$Entry;

    .line 1577
    .line 1578
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v3

    .line 1582
    check-cast v3, Ljava/lang/String;

    .line 1583
    .line 1584
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v1

    .line 1588
    check-cast v1, Ljava/lang/String;

    .line 1589
    .line 1590
    invoke-virtual {v2, v3, v1}, Lio/sentry/q4;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 1591
    .line 1592
    .line 1593
    goto :goto_23

    .line 1594
    :catchall_7
    move-exception v0

    .line 1595
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v1

    .line 1599
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1600
    .line 1601
    const-string v4, "Error getting side loaded info."

    .line 1602
    .line 1603
    invoke-interface {v1, v3, v4, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1604
    .line 1605
    .line 1606
    :cond_48
    if-eqz v20, :cond_74

    .line 1607
    .line 1608
    move-object/from16 v1, v23

    .line 1609
    .line 1610
    instance-of v0, v1, Lio/sentry/hints/a;

    .line 1611
    .line 1612
    if-eqz v0, :cond_49

    .line 1613
    .line 1614
    move-object v3, v1

    .line 1615
    check-cast v3, Lio/sentry/hints/a;

    .line 1616
    .line 1617
    invoke-interface {v3}, Lio/sentry/hints/a;->e()Ljava/lang/String;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v3

    .line 1621
    move-object/from16 v4, v22

    .line 1622
    .line 1623
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1624
    .line 1625
    .line 1626
    move-result v3

    .line 1627
    move v4, v3

    .line 1628
    :goto_24
    move-object/from16 v7, v20

    .line 1629
    .line 1630
    goto :goto_25

    .line 1631
    :cond_49
    const/4 v4, 0x0

    .line 1632
    goto :goto_24

    .line 1633
    :goto_25
    iget-object v3, v7, Lio/sentry/android/core/h0;->a:Lio/sentry/android/core/i0;

    .line 1634
    .line 1635
    iget-object v5, v3, Lio/sentry/android/core/i0;->b:Lio/sentry/android/core/SentryAndroidOptions;

    .line 1636
    .line 1637
    invoke-virtual {v5}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrProfilingEnabled()Z

    .line 1638
    .line 1639
    .line 1640
    move-result v6

    .line 1641
    if-eqz v6, :cond_68

    .line 1642
    .line 1643
    const-string v6, "Could not delete ANR profile file"

    .line 1644
    .line 1645
    if-eqz v4, :cond_4a

    .line 1646
    .line 1647
    goto/16 :goto_3c

    .line 1648
    .line 1649
    :cond_4a
    invoke-virtual {v5}, Lio/sentry/m6;->getCacheDirPath()Ljava/lang/String;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v7

    .line 1653
    if-nez v7, :cond_4b

    .line 1654
    .line 1655
    goto/16 :goto_3c

    .line 1656
    .line 1657
    :cond_4b
    new-instance v9, Ljava/io/File;

    .line 1658
    .line 1659
    invoke-direct {v9, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1660
    .line 1661
    .line 1662
    if-nez v0, :cond_4c

    .line 1663
    .line 1664
    goto/16 :goto_3c

    .line 1665
    .line 1666
    :cond_4c
    move-object v0, v1

    .line 1667
    check-cast v0, Lio/sentry/hints/a;

    .line 1668
    .line 1669
    invoke-interface {v0}, Lio/sentry/hints/a;->b()Ljava/lang/Long;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v0

    .line 1673
    if-eqz v0, :cond_4d

    .line 1674
    .line 1675
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1676
    .line 1677
    .line 1678
    move-result-wide v0

    .line 1679
    :goto_26
    move-wide v10, v0

    .line 1680
    goto :goto_27

    .line 1681
    :cond_4d
    iget-object v0, v2, Lio/sentry/c5;->a0:Ljava/util/Date;

    .line 1682
    .line 1683
    if-eqz v0, :cond_68

    .line 1684
    .line 1685
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 1686
    .line 1687
    .line 1688
    move-result-wide v0

    .line 1689
    goto :goto_26

    .line 1690
    :goto_27
    :try_start_8
    invoke-static {v9}, Lio/sentry/android/core/anr/e;->b(Ljava/io/File;)V

    .line 1691
    .line 1692
    .line 1693
    new-instance v0, Ljava/io/File;

    .line 1694
    .line 1695
    const-string v1, "anr_profile_old"

    .line 1696
    .line 1697
    invoke-direct {v0, v9, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1698
    .line 1699
    .line 1700
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 1701
    .line 1702
    .line 1703
    move-result v1

    .line 1704
    if-eqz v1, :cond_4e

    .line 1705
    .line 1706
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v1

    .line 1710
    sget-object v7, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 1711
    .line 1712
    const-string v12, "Reading ANR profile"

    .line 1713
    .line 1714
    const/4 v13, 0x0

    .line 1715
    new-array v14, v13, [Ljava/lang/Object;

    .line 1716
    .line 1717
    invoke-interface {v1, v7, v12, v14}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1718
    .line 1719
    .line 1720
    new-instance v1, Lio/sentry/android/core/anr/d;

    .line 1721
    .line 1722
    invoke-direct {v1, v5, v0}, Lio/sentry/android/core/anr/d;-><init>(Lio/sentry/m6;Ljava/io/File;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_b

    .line 1723
    .line 1724
    .line 1725
    :try_start_9
    new-instance v7, Lun;

    .line 1726
    .line 1727
    iget-object v0, v1, Lio/sentry/android/core/anr/d;->a:Lio/sentry/cache/tape/f;

    .line 1728
    .line 1729
    invoke-virtual {v0}, Lio/sentry/cache/tape/f;->f()Ljava/util/List;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v0

    .line 1733
    invoke-direct {v7, v0}, Lun;-><init>(Ljava/util/List;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1734
    .line 1735
    .line 1736
    :try_start_a
    invoke-virtual {v1}, Lio/sentry/android/core/anr/d;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 1737
    .line 1738
    .line 1739
    const/4 v13, 0x0

    .line 1740
    goto :goto_2b

    .line 1741
    :catchall_8
    move-exception v0

    .line 1742
    goto :goto_2c

    .line 1743
    :goto_28
    move-object v7, v0

    .line 1744
    goto :goto_29

    .line 1745
    :catchall_9
    move-exception v0

    .line 1746
    goto :goto_28

    .line 1747
    :goto_29
    :try_start_b
    invoke-virtual {v1}, Lio/sentry/android/core/anr/d;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    .line 1748
    .line 1749
    .line 1750
    goto :goto_2a

    .line 1751
    :catchall_a
    move-exception v0

    .line 1752
    :try_start_c
    invoke-virtual {v7, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1753
    .line 1754
    .line 1755
    :goto_2a
    throw v7

    .line 1756
    :catchall_b
    move-exception v0

    .line 1757
    const/4 v7, 0x0

    .line 1758
    goto :goto_2c

    .line 1759
    :cond_4e
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1760
    .line 1761
    .line 1762
    move-result-object v0

    .line 1763
    sget-object v1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 1764
    .line 1765
    const-string v7, "No ANR profile file found"

    .line 1766
    .line 1767
    const/4 v13, 0x0

    .line 1768
    new-array v12, v13, [Ljava/lang/Object;

    .line 1769
    .line 1770
    invoke-interface {v0, v1, v7, v12}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    .line 1771
    .line 1772
    .line 1773
    const/4 v7, 0x0

    .line 1774
    :goto_2b
    invoke-static {v9}, Lio/sentry/android/core/anr/e;->a(Ljava/io/File;)Z

    .line 1775
    .line 1776
    .line 1777
    move-result v0

    .line 1778
    if-nez v0, :cond_4f

    .line 1779
    .line 1780
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1781
    .line 1782
    .line 1783
    move-result-object v0

    .line 1784
    sget-object v1, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 1785
    .line 1786
    new-array v9, v13, [Ljava/lang/Object;

    .line 1787
    .line 1788
    invoke-interface {v0, v1, v6, v9}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1789
    .line 1790
    .line 1791
    goto :goto_2d

    .line 1792
    :goto_2c
    :try_start_d
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v1

    .line 1796
    sget-object v12, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 1797
    .line 1798
    const-string v13, "Could not retrieve ANR profile"

    .line 1799
    .line 1800
    invoke-interface {v1, v12, v13, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_c

    .line 1801
    .line 1802
    .line 1803
    invoke-static {v9}, Lio/sentry/android/core/anr/e;->a(Ljava/io/File;)Z

    .line 1804
    .line 1805
    .line 1806
    move-result v0

    .line 1807
    if-nez v0, :cond_4f

    .line 1808
    .line 1809
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v0

    .line 1813
    const/4 v13, 0x0

    .line 1814
    new-array v1, v13, [Ljava/lang/Object;

    .line 1815
    .line 1816
    invoke-interface {v0, v12, v6, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1817
    .line 1818
    .line 1819
    :cond_4f
    :goto_2d
    if-nez v7, :cond_50

    .line 1820
    .line 1821
    goto/16 :goto_3c

    .line 1822
    .line 1823
    :cond_50
    iget-object v0, v7, Lun;->c:Ljava/lang/Object;

    .line 1824
    .line 1825
    check-cast v0, Ljava/util/ArrayList;

    .line 1826
    .line 1827
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1828
    .line 1829
    .line 1830
    move-result-object v1

    .line 1831
    sget-object v6, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 1832
    .line 1833
    const-string v9, "ANR profile found"

    .line 1834
    .line 1835
    const/4 v13, 0x0

    .line 1836
    new-array v12, v13, [Ljava/lang/Object;

    .line 1837
    .line 1838
    invoke-interface {v1, v6, v9, v12}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1839
    .line 1840
    .line 1841
    iget-wide v12, v7, Lun;->a:J

    .line 1842
    .line 1843
    cmp-long v1, v10, v12

    .line 1844
    .line 1845
    if-ltz v1, :cond_51

    .line 1846
    .line 1847
    iget-wide v6, v7, Lun;->b:J

    .line 1848
    .line 1849
    cmp-long v1, v10, v6

    .line 1850
    .line 1851
    if-lez v1, :cond_52

    .line 1852
    .line 1853
    :cond_51
    move-object v3, v2

    .line 1854
    move/from16 v20, v4

    .line 1855
    .line 1856
    move-object/from16 v17, v5

    .line 1857
    .line 1858
    move-object v2, v8

    .line 1859
    goto/16 :goto_3b

    .line 1860
    .line 1861
    :cond_52
    sget-object v1, Lio/sentry/android/core/anr/c;->a:Ljava/util/ArrayList;

    .line 1862
    .line 1863
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1864
    .line 1865
    .line 1866
    move-result v1

    .line 1867
    if-eqz v1, :cond_53

    .line 1868
    .line 1869
    move-object/from16 p0, v0

    .line 1870
    .line 1871
    move v15, v4

    .line 1872
    move-object/from16 v17, v5

    .line 1873
    .line 1874
    :goto_2e
    const/4 v0, 0x0

    .line 1875
    goto/16 :goto_34

    .line 1876
    .line 1877
    :cond_53
    new-instance v1, Ljava/util/HashMap;

    .line 1878
    .line 1879
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 1880
    .line 1881
    .line 1882
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1883
    .line 1884
    .line 1885
    move-result-object v6

    .line 1886
    :cond_54
    :goto_2f
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1887
    .line 1888
    .line 1889
    move-result v7

    .line 1890
    if-eqz v7, :cond_59

    .line 1891
    .line 1892
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v7

    .line 1896
    check-cast v7, Lio/sentry/android/core/anr/f;

    .line 1897
    .line 1898
    iget-object v9, v7, Lio/sentry/android/core/anr/f;->a:[Ljava/lang/StackTraceElement;

    .line 1899
    .line 1900
    array-length v12, v9

    .line 1901
    const/4 v13, 0x2

    .line 1902
    if-ge v12, v13, :cond_55

    .line 1903
    .line 1904
    goto :goto_2f

    .line 1905
    :cond_55
    array-length v12, v9

    .line 1906
    add-int/lit8 v12, v12, -0x1

    .line 1907
    .line 1908
    const/4 v13, 0x0

    .line 1909
    :goto_30
    if-ltz v12, :cond_54

    .line 1910
    .line 1911
    aget-object v14, v9, v12

    .line 1912
    .line 1913
    invoke-virtual {v14}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 1914
    .line 1915
    .line 1916
    move-result-object v14

    .line 1917
    sget-object v15, Lio/sentry/android/core/anr/c;->a:Ljava/util/ArrayList;

    .line 1918
    .line 1919
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1920
    .line 1921
    .line 1922
    move-result-object v15

    .line 1923
    :goto_31
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 1924
    .line 1925
    .line 1926
    move-result v17

    .line 1927
    if-eqz v17, :cond_57

    .line 1928
    .line 1929
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1930
    .line 1931
    .line 1932
    move-result-object v17

    .line 1933
    move-object/from16 p0, v0

    .line 1934
    .line 1935
    move-object/from16 v0, v17

    .line 1936
    .line 1937
    check-cast v0, Ljava/lang/String;

    .line 1938
    .line 1939
    invoke-virtual {v14, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1940
    .line 1941
    .line 1942
    move-result v0

    .line 1943
    if-eqz v0, :cond_56

    .line 1944
    .line 1945
    goto :goto_32

    .line 1946
    :cond_56
    move-object/from16 v0, p0

    .line 1947
    .line 1948
    goto :goto_31

    .line 1949
    :cond_57
    move-object/from16 p0, v0

    .line 1950
    .line 1951
    add-int/lit8 v13, v13, 0x1

    .line 1952
    .line 1953
    :goto_32
    array-length v0, v9

    .line 1954
    sub-int/2addr v0, v12

    .line 1955
    int-to-float v14, v13

    .line 1956
    int-to-float v0, v0

    .line 1957
    div-float v28, v14, v0

    .line 1958
    .line 1959
    new-instance v0, Lio/sentry/android/core/anr/b;

    .line 1960
    .line 1961
    array-length v14, v9

    .line 1962
    add-int/lit8 v14, v14, -0x1

    .line 1963
    .line 1964
    invoke-direct {v0, v9, v12, v14}, Lio/sentry/android/core/anr/b;-><init>([Ljava/lang/StackTraceElement;II)V

    .line 1965
    .line 1966
    .line 1967
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v14

    .line 1971
    check-cast v14, Lio/sentry/android/core/anr/a;

    .line 1972
    .line 1973
    if-nez v14, :cond_58

    .line 1974
    .line 1975
    new-instance v22, Lio/sentry/android/core/anr/a;

    .line 1976
    .line 1977
    iget-object v14, v7, Lio/sentry/android/core/anr/f;->a:[Ljava/lang/StackTraceElement;

    .line 1978
    .line 1979
    array-length v15, v14

    .line 1980
    add-int/lit8 v25, v15, -0x1

    .line 1981
    .line 1982
    move v15, v4

    .line 1983
    move-object/from16 v17, v5

    .line 1984
    .line 1985
    iget-wide v4, v7, Lio/sentry/android/core/anr/f;->b:J

    .line 1986
    .line 1987
    move-wide/from16 v26, v4

    .line 1988
    .line 1989
    move/from16 v24, v12

    .line 1990
    .line 1991
    move-object/from16 v23, v14

    .line 1992
    .line 1993
    invoke-direct/range {v22 .. v28}, Lio/sentry/android/core/anr/a;-><init>([Ljava/lang/StackTraceElement;IIJF)V

    .line 1994
    .line 1995
    .line 1996
    move-object/from16 v4, v22

    .line 1997
    .line 1998
    invoke-virtual {v1, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1999
    .line 2000
    .line 2001
    move-object v12, v1

    .line 2002
    goto :goto_33

    .line 2003
    :cond_58
    move v15, v4

    .line 2004
    move-object/from16 v17, v5

    .line 2005
    .line 2006
    move/from16 v24, v12

    .line 2007
    .line 2008
    iget-wide v4, v7, Lio/sentry/android/core/anr/f;->b:J

    .line 2009
    .line 2010
    move-object v12, v1

    .line 2011
    iget-wide v0, v14, Lio/sentry/android/core/anr/a;->g:J

    .line 2012
    .line 2013
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 2014
    .line 2015
    .line 2016
    move-result-wide v0

    .line 2017
    iput-wide v0, v14, Lio/sentry/android/core/anr/a;->g:J

    .line 2018
    .line 2019
    iget-wide v0, v14, Lio/sentry/android/core/anr/a;->h:J

    .line 2020
    .line 2021
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 2022
    .line 2023
    .line 2024
    move-result-wide v0

    .line 2025
    iput-wide v0, v14, Lio/sentry/android/core/anr/a;->h:J

    .line 2026
    .line 2027
    iget v0, v14, Lio/sentry/android/core/anr/a;->f:I

    .line 2028
    .line 2029
    add-int/lit8 v0, v0, 0x1

    .line 2030
    .line 2031
    iput v0, v14, Lio/sentry/android/core/anr/a;->f:I

    .line 2032
    .line 2033
    :goto_33
    add-int/lit8 v0, v24, -0x1

    .line 2034
    .line 2035
    move-object v1, v12

    .line 2036
    move v4, v15

    .line 2037
    move-object/from16 v5, v17

    .line 2038
    .line 2039
    move v12, v0

    .line 2040
    move-object/from16 v0, p0

    .line 2041
    .line 2042
    goto/16 :goto_30

    .line 2043
    .line 2044
    :cond_59
    move-object/from16 p0, v0

    .line 2045
    .line 2046
    move-object v12, v1

    .line 2047
    move v15, v4

    .line 2048
    move-object/from16 v17, v5

    .line 2049
    .line 2050
    invoke-virtual {v12}, Ljava/util/HashMap;->isEmpty()Z

    .line 2051
    .line 2052
    .line 2053
    move-result v0

    .line 2054
    if-eqz v0, :cond_5a

    .line 2055
    .line 2056
    goto/16 :goto_2e

    .line 2057
    .line 2058
    :cond_5a
    invoke-virtual {v12}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 2059
    .line 2060
    .line 2061
    move-result-object v0

    .line 2062
    new-instance v1, Lkl0;

    .line 2063
    .line 2064
    const/4 v4, 0x4

    .line 2065
    invoke-direct {v1, v4}, Lkl0;-><init>(I)V

    .line 2066
    .line 2067
    .line 2068
    invoke-static {v0, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 2069
    .line 2070
    .line 2071
    move-result-object v0

    .line 2072
    check-cast v0, Lio/sentry/android/core/anr/a;

    .line 2073
    .line 2074
    :goto_34
    if-nez v0, :cond_5b

    .line 2075
    .line 2076
    move-object v3, v2

    .line 2077
    move-object v2, v8

    .line 2078
    move/from16 v20, v15

    .line 2079
    .line 2080
    goto/16 :goto_3d

    .line 2081
    .line 2082
    :cond_5b
    new-instance v1, Lio/sentry/protocol/profiling/a;

    .line 2083
    .line 2084
    invoke-direct {v1}, Lio/sentry/protocol/profiling/a;-><init>()V

    .line 2085
    .line 2086
    .line 2087
    new-instance v4, Ljava/util/ArrayList;

    .line 2088
    .line 2089
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2090
    .line 2091
    .line 2092
    new-instance v5, Ljava/util/HashMap;

    .line 2093
    .line 2094
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 2095
    .line 2096
    .line 2097
    new-instance v6, Ljava/util/ArrayList;

    .line 2098
    .line 2099
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2100
    .line 2101
    .line 2102
    new-instance v7, Ljava/util/HashMap;

    .line 2103
    .line 2104
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 2105
    .line 2106
    .line 2107
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2108
    .line 2109
    .line 2110
    move-result-object v9

    .line 2111
    :goto_35
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 2112
    .line 2113
    .line 2114
    move-result v12

    .line 2115
    const-wide v22, 0x408f400000000000L    # 1000.0

    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    const-string v13, "0"

    .line 2121
    .line 2122
    if-eqz v12, :cond_63

    .line 2123
    .line 2124
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2125
    .line 2126
    .line 2127
    move-result-object v12

    .line 2128
    check-cast v12, Lio/sentry/android/core/anr/f;

    .line 2129
    .line 2130
    iget-object v14, v12, Lio/sentry/android/core/anr/f;->a:[Ljava/lang/StackTraceElement;

    .line 2131
    .line 2132
    move-object/from16 p0, v9

    .line 2133
    .line 2134
    new-instance v9, Ljava/util/ArrayList;

    .line 2135
    .line 2136
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 2137
    .line 2138
    .line 2139
    move/from16 v20, v15

    .line 2140
    .line 2141
    array-length v15, v14

    .line 2142
    move-object/from16 v24, v14

    .line 2143
    .line 2144
    const/4 v14, 0x0

    .line 2145
    :goto_36
    if-ge v14, v15, :cond_5f

    .line 2146
    .line 2147
    aget-object v25, v24, v14

    .line 2148
    .line 2149
    move/from16 v26, v14

    .line 2150
    .line 2151
    new-instance v14, Ljava/lang/StringBuilder;

    .line 2152
    .line 2153
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 2154
    .line 2155
    .line 2156
    move/from16 v27, v15

    .line 2157
    .line 2158
    invoke-virtual/range {v25 .. v25}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 2159
    .line 2160
    .line 2161
    move-result-object v15

    .line 2162
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2163
    .line 2164
    .line 2165
    const-string v15, "#"

    .line 2166
    .line 2167
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2168
    .line 2169
    .line 2170
    move-object/from16 v28, v8

    .line 2171
    .line 2172
    invoke-virtual/range {v25 .. v25}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 2173
    .line 2174
    .line 2175
    move-result-object v8

    .line 2176
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2177
    .line 2178
    .line 2179
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2180
    .line 2181
    .line 2182
    invoke-virtual/range {v25 .. v25}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    .line 2183
    .line 2184
    .line 2185
    move-result-object v8

    .line 2186
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2187
    .line 2188
    .line 2189
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2190
    .line 2191
    .line 2192
    invoke-virtual/range {v25 .. v25}, Ljava/lang/StackTraceElement;->getLineNumber()I

    .line 2193
    .line 2194
    .line 2195
    move-result v8

    .line 2196
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2197
    .line 2198
    .line 2199
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2200
    .line 2201
    .line 2202
    move-result-object v8

    .line 2203
    invoke-virtual {v5, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2204
    .line 2205
    .line 2206
    move-result-object v14

    .line 2207
    check-cast v14, Ljava/lang/Integer;

    .line 2208
    .line 2209
    if-nez v14, :cond_5e

    .line 2210
    .line 2211
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 2212
    .line 2213
    .line 2214
    move-result v14

    .line 2215
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2216
    .line 2217
    .line 2218
    move-result-object v14

    .line 2219
    new-instance v15, Lio/sentry/protocol/a0;

    .line 2220
    .line 2221
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 2222
    .line 2223
    .line 2224
    invoke-virtual/range {v25 .. v25}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    .line 2225
    .line 2226
    .line 2227
    move-result-object v2

    .line 2228
    iput-object v2, v15, Lio/sentry/protocol/a0;->d:Ljava/lang/String;

    .line 2229
    .line 2230
    invoke-virtual/range {v25 .. v25}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 2231
    .line 2232
    .line 2233
    move-result-object v2

    .line 2234
    iput-object v2, v15, Lio/sentry/protocol/a0;->e:Ljava/lang/String;

    .line 2235
    .line 2236
    invoke-virtual/range {v25 .. v25}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 2237
    .line 2238
    .line 2239
    move-result-object v2

    .line 2240
    iput-object v2, v15, Lio/sentry/protocol/a0;->f:Ljava/lang/String;

    .line 2241
    .line 2242
    invoke-virtual/range {v25 .. v25}, Ljava/lang/StackTraceElement;->getLineNumber()I

    .line 2243
    .line 2244
    .line 2245
    move-result v2

    .line 2246
    if-lez v2, :cond_5c

    .line 2247
    .line 2248
    invoke-virtual/range {v25 .. v25}, Ljava/lang/StackTraceElement;->getLineNumber()I

    .line 2249
    .line 2250
    .line 2251
    move-result v2

    .line 2252
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2253
    .line 2254
    .line 2255
    move-result-object v2

    .line 2256
    goto :goto_37

    .line 2257
    :cond_5c
    const/4 v2, 0x0

    .line 2258
    :goto_37
    iput-object v2, v15, Lio/sentry/protocol/a0;->i:Ljava/lang/Integer;

    .line 2259
    .line 2260
    invoke-virtual/range {v25 .. v25}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    .line 2261
    .line 2262
    .line 2263
    move-result v2

    .line 2264
    if-eqz v2, :cond_5d

    .line 2265
    .line 2266
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2267
    .line 2268
    iput-object v2, v15, Lio/sentry/protocol/a0;->X:Ljava/lang/Boolean;

    .line 2269
    .line 2270
    :cond_5d
    invoke-virtual {v4, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2271
    .line 2272
    .line 2273
    invoke-virtual {v5, v8, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2274
    .line 2275
    .line 2276
    :cond_5e
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2277
    .line 2278
    .line 2279
    add-int/lit8 v14, v26, 0x1

    .line 2280
    .line 2281
    move-object/from16 v2, p1

    .line 2282
    .line 2283
    move/from16 v15, v27

    .line 2284
    .line 2285
    move-object/from16 v8, v28

    .line 2286
    .line 2287
    goto/16 :goto_36

    .line 2288
    .line 2289
    :cond_5f
    move-object/from16 v28, v8

    .line 2290
    .line 2291
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2292
    .line 2293
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 2294
    .line 2295
    .line 2296
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2297
    .line 2298
    .line 2299
    move-result-object v8

    .line 2300
    :goto_38
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2301
    .line 2302
    .line 2303
    move-result v14

    .line 2304
    if-eqz v14, :cond_61

    .line 2305
    .line 2306
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2307
    .line 2308
    .line 2309
    move-result-object v14

    .line 2310
    check-cast v14, Ljava/lang/Integer;

    .line 2311
    .line 2312
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 2313
    .line 2314
    .line 2315
    move-result v15

    .line 2316
    if-lez v15, :cond_60

    .line 2317
    .line 2318
    const-string v15, ","

    .line 2319
    .line 2320
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2321
    .line 2322
    .line 2323
    :cond_60
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2324
    .line 2325
    .line 2326
    goto :goto_38

    .line 2327
    :cond_61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2328
    .line 2329
    .line 2330
    move-result-object v2

    .line 2331
    invoke-virtual {v7, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v8

    .line 2335
    check-cast v8, Ljava/lang/Integer;

    .line 2336
    .line 2337
    if-nez v8, :cond_62

    .line 2338
    .line 2339
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 2340
    .line 2341
    .line 2342
    move-result v8

    .line 2343
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2344
    .line 2345
    .line 2346
    move-result-object v8

    .line 2347
    new-instance v14, Ljava/util/ArrayList;

    .line 2348
    .line 2349
    invoke-direct {v14, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2350
    .line 2351
    .line 2352
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2353
    .line 2354
    .line 2355
    invoke-virtual {v7, v2, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2356
    .line 2357
    .line 2358
    :cond_62
    new-instance v2, Lio/sentry/protocol/profiling/b;

    .line 2359
    .line 2360
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 2361
    .line 2362
    .line 2363
    iget-wide v14, v12, Lio/sentry/android/core/anr/f;->b:J

    .line 2364
    .line 2365
    long-to-double v14, v14

    .line 2366
    div-double v14, v14, v22

    .line 2367
    .line 2368
    iput-wide v14, v2, Lio/sentry/protocol/profiling/b;->a:D

    .line 2369
    .line 2370
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 2371
    .line 2372
    .line 2373
    move-result v8

    .line 2374
    iput v8, v2, Lio/sentry/protocol/profiling/b;->b:I

    .line 2375
    .line 2376
    iput-object v13, v2, Lio/sentry/protocol/profiling/b;->c:Ljava/lang/String;

    .line 2377
    .line 2378
    iget-object v8, v1, Lio/sentry/protocol/profiling/a;->a:Ljava/util/List;

    .line 2379
    .line 2380
    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2381
    .line 2382
    .line 2383
    move-object/from16 v9, p0

    .line 2384
    .line 2385
    move-object/from16 v2, p1

    .line 2386
    .line 2387
    move/from16 v15, v20

    .line 2388
    .line 2389
    move-object/from16 v8, v28

    .line 2390
    .line 2391
    goto/16 :goto_35

    .line 2392
    .line 2393
    :cond_63
    move-object/from16 v28, v8

    .line 2394
    .line 2395
    move/from16 v20, v15

    .line 2396
    .line 2397
    iput-object v4, v1, Lio/sentry/protocol/profiling/a;->c:Ljava/util/List;

    .line 2398
    .line 2399
    iput-object v6, v1, Lio/sentry/protocol/profiling/a;->b:Ljava/util/List;

    .line 2400
    .line 2401
    new-instance v2, Lio/sentry/protocol/profiling/c;

    .line 2402
    .line 2403
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 2404
    .line 2405
    .line 2406
    move-object/from16 v4, v19

    .line 2407
    .line 2408
    iput-object v4, v2, Lio/sentry/protocol/profiling/c;->a:Ljava/lang/String;

    .line 2409
    .line 2410
    const/4 v4, 0x5

    .line 2411
    iput v4, v2, Lio/sentry/protocol/profiling/c;->b:I

    .line 2412
    .line 2413
    invoke-static {v13, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 2414
    .line 2415
    .line 2416
    move-result-object v2

    .line 2417
    iput-object v2, v1, Lio/sentry/protocol/profiling/a;->d:Ljava/util/Map;

    .line 2418
    .line 2419
    new-instance v29, Lio/sentry/o3;

    .line 2420
    .line 2421
    new-instance v30, Lio/sentry/protocol/w;

    .line 2422
    .line 2423
    invoke-direct/range {v30 .. v30}, Ljava/lang/Object;-><init>()V

    .line 2424
    .line 2425
    .line 2426
    new-instance v31, Lio/sentry/protocol/w;

    .line 2427
    .line 2428
    invoke-direct/range {v31 .. v31}, Ljava/lang/Object;-><init>()V

    .line 2429
    .line 2430
    .line 2431
    new-instance v2, Ljava/util/HashMap;

    .line 2432
    .line 2433
    const/4 v13, 0x0

    .line 2434
    invoke-direct {v2, v13}, Ljava/util/HashMap;-><init>(I)V

    .line 2435
    .line 2436
    .line 2437
    long-to-double v4, v10

    .line 2438
    div-double v4, v4, v22

    .line 2439
    .line 2440
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 2441
    .line 2442
    .line 2443
    move-result-object v34

    .line 2444
    const-string v35, "java"

    .line 2445
    .line 2446
    iget-object v4, v3, Lio/sentry/android/core/i0;->b:Lio/sentry/android/core/SentryAndroidOptions;

    .line 2447
    .line 2448
    const/16 v32, 0x0

    .line 2449
    .line 2450
    move-object/from16 v33, v2

    .line 2451
    .line 2452
    move-object/from16 v36, v4

    .line 2453
    .line 2454
    invoke-direct/range {v29 .. v36}, Lio/sentry/o3;-><init>(Lio/sentry/protocol/w;Lio/sentry/protocol/w;Ljava/io/File;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/String;Lio/sentry/m6;)V

    .line 2455
    .line 2456
    .line 2457
    move-object/from16 v2, v29

    .line 2458
    .line 2459
    iput-object v1, v2, Lio/sentry/o3;->X:Lio/sentry/protocol/profiling/a;

    .line 2460
    .line 2461
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 2462
    .line 2463
    .line 2464
    move-result-object v1

    .line 2465
    invoke-interface {v1, v2}, Lio/sentry/c1;->j(Lio/sentry/o3;)Lio/sentry/protocol/w;

    .line 2466
    .line 2467
    .line 2468
    move-result-object v1

    .line 2469
    sget-object v4, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 2470
    .line 2471
    invoke-virtual {v4, v1}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 2472
    .line 2473
    .line 2474
    move-result v1

    .line 2475
    if-eqz v1, :cond_64

    .line 2476
    .line 2477
    const/4 v1, 0x0

    .line 2478
    goto :goto_39

    .line 2479
    :cond_64
    iget-object v1, v2, Lio/sentry/o3;->b:Lio/sentry/protocol/w;

    .line 2480
    .line 2481
    :goto_39
    iget-object v2, v0, Lio/sentry/android/core/anr/a;->c:[Ljava/lang/StackTraceElement;

    .line 2482
    .line 2483
    iget v4, v0, Lio/sentry/android/core/anr/a;->d:I

    .line 2484
    .line 2485
    iget v0, v0, Lio/sentry/android/core/anr/a;->e:I

    .line 2486
    .line 2487
    add-int/lit8 v0, v0, 0x1

    .line 2488
    .line 2489
    invoke-static {v2, v4, v0}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 2490
    .line 2491
    .line 2492
    move-result-object v0

    .line 2493
    check-cast v0, [Ljava/lang/StackTraceElement;

    .line 2494
    .line 2495
    array-length v2, v0

    .line 2496
    if-lez v2, :cond_66

    .line 2497
    .line 2498
    const/16 v18, 0x0

    .line 2499
    .line 2500
    aget-object v2, v0, v18

    .line 2501
    .line 2502
    new-instance v4, Ljava/lang/StringBuilder;

    .line 2503
    .line 2504
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 2505
    .line 2506
    .line 2507
    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 2508
    .line 2509
    .line 2510
    move-result-object v5

    .line 2511
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2512
    .line 2513
    .line 2514
    const-string v5, "."

    .line 2515
    .line 2516
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2517
    .line 2518
    .line 2519
    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 2520
    .line 2521
    .line 2522
    move-result-object v2

    .line 2523
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2524
    .line 2525
    .line 2526
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2527
    .line 2528
    .line 2529
    move-result-object v2

    .line 2530
    new-instance v4, Lio/sentry/android/core/ApplicationNotResponding;

    .line 2531
    .line 2532
    invoke-direct {v4, v2}, Lio/sentry/android/core/ApplicationNotResponding;-><init>(Ljava/lang/String;)V

    .line 2533
    .line 2534
    .line 2535
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 2536
    .line 2537
    .line 2538
    new-instance v0, Lio/sentry/protocol/o;

    .line 2539
    .line 2540
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2541
    .line 2542
    .line 2543
    move-object/from16 v2, v21

    .line 2544
    .line 2545
    iput-object v2, v0, Lio/sentry/protocol/o;->a:Ljava/lang/String;

    .line 2546
    .line 2547
    new-instance v6, Lio/sentry/exception/a;

    .line 2548
    .line 2549
    const/4 v2, 0x0

    .line 2550
    const/4 v13, 0x0

    .line 2551
    invoke-direct {v6, v0, v4, v2, v13}, Lio/sentry/exception/a;-><init>(Lio/sentry/protocol/o;Ljava/lang/Throwable;Ljava/lang/Thread;Z)V

    .line 2552
    .line 2553
    .line 2554
    iget-object v5, v3, Lio/sentry/android/core/i0;->d:Lio/sentry/d5;

    .line 2555
    .line 2556
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2557
    .line 2558
    .line 2559
    new-instance v7, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2560
    .line 2561
    const/4 v0, -0x1

    .line 2562
    invoke-direct {v7, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 2563
    .line 2564
    .line 2565
    new-instance v8, Ljava/util/HashSet;

    .line 2566
    .line 2567
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 2568
    .line 2569
    .line 2570
    new-instance v9, Ljava/util/ArrayDeque;

    .line 2571
    .line 2572
    invoke-direct {v9}, Ljava/util/ArrayDeque;-><init>()V

    .line 2573
    .line 2574
    .line 2575
    const/4 v10, 0x0

    .line 2576
    invoke-virtual/range {v5 .. v10}, Lio/sentry/d5;->a(Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/HashSet;Ljava/util/ArrayDeque;Ljava/lang/String;)V

    .line 2577
    .line 2578
    .line 2579
    new-instance v0, Ljava/util/ArrayList;

    .line 2580
    .line 2581
    invoke-direct {v0, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2582
    .line 2583
    .line 2584
    new-instance v2, Lio/sentry/d2;

    .line 2585
    .line 2586
    invoke-direct {v2, v0}, Lio/sentry/d2;-><init>(Ljava/util/List;)V

    .line 2587
    .line 2588
    .line 2589
    move-object/from16 v3, p1

    .line 2590
    .line 2591
    iput-object v2, v3, Lio/sentry/c5;->e0:Lio/sentry/d2;

    .line 2592
    .line 2593
    if-eqz v1, :cond_65

    .line 2594
    .line 2595
    new-instance v0, Lio/sentry/p3;

    .line 2596
    .line 2597
    invoke-direct {v0, v1}, Lio/sentry/p3;-><init>(Lio/sentry/protocol/w;)V

    .line 2598
    .line 2599
    .line 2600
    const-string v1, "profile"

    .line 2601
    .line 2602
    move-object/from16 v2, v28

    .line 2603
    .line 2604
    invoke-virtual {v2, v0, v1}, Lio/sentry/protocol/e;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2605
    .line 2606
    .line 2607
    goto :goto_3d

    .line 2608
    :cond_65
    :goto_3a
    move-object/from16 v2, v28

    .line 2609
    .line 2610
    goto :goto_3d

    .line 2611
    :cond_66
    move-object/from16 v3, p1

    .line 2612
    .line 2613
    goto :goto_3a

    .line 2614
    :goto_3b
    invoke-virtual/range {v17 .. v17}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 2615
    .line 2616
    .line 2617
    move-result-object v0

    .line 2618
    sget-object v1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 2619
    .line 2620
    const-string v4, "ANR profile found, but doesn\'t match"

    .line 2621
    .line 2622
    const/4 v13, 0x0

    .line 2623
    new-array v5, v13, [Ljava/lang/Object;

    .line 2624
    .line 2625
    invoke-interface {v0, v1, v4, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2626
    .line 2627
    .line 2628
    goto :goto_3d

    .line 2629
    :catchall_c
    move-exception v0

    .line 2630
    move-object/from16 v17, v5

    .line 2631
    .line 2632
    invoke-static {v9}, Lio/sentry/android/core/anr/e;->a(Ljava/io/File;)Z

    .line 2633
    .line 2634
    .line 2635
    move-result v1

    .line 2636
    if-nez v1, :cond_67

    .line 2637
    .line 2638
    invoke-virtual/range {v17 .. v17}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 2639
    .line 2640
    .line 2641
    move-result-object v1

    .line 2642
    sget-object v2, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 2643
    .line 2644
    const/4 v13, 0x0

    .line 2645
    new-array v3, v13, [Ljava/lang/Object;

    .line 2646
    .line 2647
    invoke-interface {v1, v2, v6, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2648
    .line 2649
    .line 2650
    :cond_67
    throw v0

    .line 2651
    :cond_68
    :goto_3c
    move-object v3, v2

    .line 2652
    move/from16 v20, v4

    .line 2653
    .line 2654
    move-object/from16 v17, v5

    .line 2655
    .line 2656
    move-object v2, v8

    .line 2657
    :goto_3d
    iget-object v0, v3, Lio/sentry/c5;->h0:Ljava/util/List;

    .line 2658
    .line 2659
    if-eqz v0, :cond_69

    .line 2660
    .line 2661
    goto/16 :goto_40

    .line 2662
    .line 2663
    :cond_69
    invoke-virtual/range {v17 .. v17}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAnrFingerprinting()Z

    .line 2664
    .line 2665
    .line 2666
    move-result v0

    .line 2667
    const-string v1, "foreground-anr"

    .line 2668
    .line 2669
    const-string v4, "background-anr"

    .line 2670
    .line 2671
    if-eqz v0, :cond_71

    .line 2672
    .line 2673
    invoke-virtual {v3}, Lio/sentry/c5;->d()Ljava/util/ArrayList;

    .line 2674
    .line 2675
    .line 2676
    move-result-object v0

    .line 2677
    if-eqz v0, :cond_71

    .line 2678
    .line 2679
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2680
    .line 2681
    .line 2682
    move-result v5

    .line 2683
    if-eqz v5, :cond_6a

    .line 2684
    .line 2685
    goto :goto_3f

    .line 2686
    :cond_6a
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2687
    .line 2688
    .line 2689
    move-result-object v0

    .line 2690
    :cond_6b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2691
    .line 2692
    .line 2693
    move-result v5

    .line 2694
    if-eqz v5, :cond_6f

    .line 2695
    .line 2696
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2697
    .line 2698
    .line 2699
    move-result-object v5

    .line 2700
    check-cast v5, Lio/sentry/protocol/v;

    .line 2701
    .line 2702
    iget-object v5, v5, Lio/sentry/protocol/v;->e:Lio/sentry/protocol/c0;

    .line 2703
    .line 2704
    if-eqz v5, :cond_6b

    .line 2705
    .line 2706
    iget-object v5, v5, Lio/sentry/protocol/c0;->a:Ljava/util/List;

    .line 2707
    .line 2708
    if-eqz v5, :cond_6b

    .line 2709
    .line 2710
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 2711
    .line 2712
    .line 2713
    move-result v6

    .line 2714
    if-nez v6, :cond_6b

    .line 2715
    .line 2716
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2717
    .line 2718
    .line 2719
    move-result-object v5

    .line 2720
    :cond_6c
    :goto_3e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2721
    .line 2722
    .line 2723
    move-result v6

    .line 2724
    if-eqz v6, :cond_6b

    .line 2725
    .line 2726
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2727
    .line 2728
    .line 2729
    move-result-object v6

    .line 2730
    check-cast v6, Lio/sentry/protocol/a0;

    .line 2731
    .line 2732
    iget-object v7, v6, Lio/sentry/protocol/a0;->V:Ljava/lang/Boolean;

    .line 2733
    .line 2734
    if-eqz v7, :cond_6d

    .line 2735
    .line 2736
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2737
    .line 2738
    .line 2739
    move-result v7

    .line 2740
    if-eqz v7, :cond_6d

    .line 2741
    .line 2742
    goto :goto_3f

    .line 2743
    :cond_6d
    iget-object v6, v6, Lio/sentry/protocol/a0;->f:Ljava/lang/String;

    .line 2744
    .line 2745
    if-eqz v6, :cond_6c

    .line 2746
    .line 2747
    sget-object v7, Lio/sentry/android/core/anr/c;->a:Ljava/util/ArrayList;

    .line 2748
    .line 2749
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2750
    .line 2751
    .line 2752
    move-result-object v7

    .line 2753
    :cond_6e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 2754
    .line 2755
    .line 2756
    move-result v8

    .line 2757
    if-eqz v8, :cond_71

    .line 2758
    .line 2759
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2760
    .line 2761
    .line 2762
    move-result-object v8

    .line 2763
    check-cast v8, Ljava/lang/String;

    .line 2764
    .line 2765
    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 2766
    .line 2767
    .line 2768
    move-result v8

    .line 2769
    if-eqz v8, :cond_6e

    .line 2770
    .line 2771
    goto :goto_3e

    .line 2772
    :cond_6f
    if-eqz v20, :cond_70

    .line 2773
    .line 2774
    move-object v1, v4

    .line 2775
    :cond_70
    const-string v0, "system-frames-only-anr"

    .line 2776
    .line 2777
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 2778
    .line 2779
    .line 2780
    move-result-object v0

    .line 2781
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 2782
    .line 2783
    .line 2784
    move-result-object v0

    .line 2785
    invoke-virtual {v3, v0}, Lio/sentry/c5;->h(Ljava/util/List;)V

    .line 2786
    .line 2787
    .line 2788
    goto :goto_40

    .line 2789
    :cond_71
    :goto_3f
    if-eqz v20, :cond_72

    .line 2790
    .line 2791
    move-object v1, v4

    .line 2792
    :cond_72
    const-string v0, "{{ default }}"

    .line 2793
    .line 2794
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 2795
    .line 2796
    .line 2797
    move-result-object v0

    .line 2798
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 2799
    .line 2800
    .line 2801
    move-result-object v0

    .line 2802
    invoke-virtual {v3, v0}, Lio/sentry/c5;->h(Ljava/util/List;)V

    .line 2803
    .line 2804
    .line 2805
    :goto_40
    xor-int/lit8 v0, v20, 0x1

    .line 2806
    .line 2807
    invoke-virtual {v2}, Lio/sentry/protocol/e;->d()Lio/sentry/protocol/a;

    .line 2808
    .line 2809
    .line 2810
    move-result-object v1

    .line 2811
    if-nez v1, :cond_73

    .line 2812
    .line 2813
    new-instance v1, Lio/sentry/protocol/a;

    .line 2814
    .line 2815
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 2816
    .line 2817
    .line 2818
    invoke-virtual {v2, v1}, Lio/sentry/protocol/e;->m(Lio/sentry/protocol/a;)V

    .line 2819
    .line 2820
    .line 2821
    :cond_73
    iget-object v2, v1, Lio/sentry/protocol/a;->V:Ljava/lang/Boolean;

    .line 2822
    .line 2823
    if-nez v2, :cond_75

    .line 2824
    .line 2825
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2826
    .line 2827
    .line 2828
    move-result-object v0

    .line 2829
    iput-object v0, v1, Lio/sentry/protocol/a;->V:Ljava/lang/Boolean;

    .line 2830
    .line 2831
    goto :goto_41

    .line 2832
    :cond_74
    move-object v3, v2

    .line 2833
    :cond_75
    :goto_41
    return-object v3
.end method

.method public final g(Lio/sentry/protocol/f0;Lio/sentry/i0;)Lio/sentry/protocol/f0;
    .locals 0

    .line 1
    return-object p1
.end method

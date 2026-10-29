.class public Lio/sentry/cache/c;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/cache/d;


# static fields
.field public static final w:Ljava/nio/charset/Charset;


# instance fields
.field public final a:Lio/sentry/android/core/SentryAndroidOptions;

.field public final b:Lio/sentry/util/g;

.field public final c:Ljava/io/File;

.field public final d:I

.field public final e:Ljava/util/concurrent/CountDownLatch;

.field public final f:Ljava/util/WeakHashMap;

.field public final i:Lio/sentry/util/a;

.field public final v:Lio/sentry/util/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lio/sentry/cache/c;->w:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;Ljava/lang/String;I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/util/g;

    .line 5
    .line 6
    new-instance v1, Lio/sentry/android/core/h1;

    .line 7
    .line 8
    const/4 v2, 0x6

    .line 9
    invoke-direct {v1, p0, v2}, Lio/sentry/android/core/h1;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Lio/sentry/util/g;-><init>(Lio/sentry/util/f;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lio/sentry/cache/c;->b:Lio/sentry/util/g;

    .line 16
    .line 17
    iput-object p1, p0, Lio/sentry/cache/c;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 18
    .line 19
    new-instance p1, Ljava/io/File;

    .line 20
    .line 21
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lio/sentry/cache/c;->c:Ljava/io/File;

    .line 25
    .line 26
    iput p3, p0, Lio/sentry/cache/c;->d:I

    .line 27
    .line 28
    new-instance p1, Ljava/util/WeakHashMap;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lio/sentry/cache/c;->f:Ljava/util/WeakHashMap;

    .line 34
    .line 35
    new-instance p1, Lio/sentry/util/a;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lio/sentry/cache/c;->i:Lio/sentry/util/a;

    .line 41
    .line 42
    new-instance p1, Lio/sentry/util/a;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lio/sentry/cache/c;->v:Lio/sentry/util/a;

    .line 48
    .line 49
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    .line 50
    .line 51
    const/4 p2, 0x1

    .line 52
    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lio/sentry/cache/c;->e:Ljava/util/concurrent/CountDownLatch;

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public K(Lio/sentry/internal/debugmeta/c;Lio/sentry/i0;)Z
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    const-string v0, "Envelope is required."

    .line 8
    .line 9
    invoke-static {v2, v0}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lio/sentry/cache/c;->a()[Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    array-length v0, v4

    .line 17
    iget-object v6, v1, Lio/sentry/cache/c;->b:Lio/sentry/util/g;

    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    iget-object v8, v1, Lio/sentry/cache/c;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 21
    .line 22
    const/4 v9, 0x1

    .line 23
    iget v10, v1, Lio/sentry/cache/c;->d:I

    .line 24
    .line 25
    if-lt v0, v10, :cond_15

    .line 26
    .line 27
    invoke-virtual {v8}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 28
    .line 29
    .line 30
    move-result-object v11

    .line 31
    sget-object v12, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 32
    .line 33
    const-string v13, "Cache folder if full (respecting maxSize). Rotating files"

    .line 34
    .line 35
    new-array v14, v7, [Ljava/lang/Object;

    .line 36
    .line 37
    invoke-interface {v11, v12, v13, v14}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sub-int v10, v0, v10

    .line 41
    .line 42
    add-int/2addr v10, v9

    .line 43
    array-length v11, v4

    .line 44
    if-le v11, v9, :cond_0

    .line 45
    .line 46
    new-instance v11, Lkl0;

    .line 47
    .line 48
    const/4 v12, 0x5

    .line 49
    invoke-direct {v11, v12}, Lkl0;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v4, v11}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    invoke-static {v4, v10, v0}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    move-object v11, v0

    .line 60
    check-cast v11, [Ljava/io/File;

    .line 61
    .line 62
    move v12, v7

    .line 63
    :goto_0
    if-ge v12, v10, :cond_15

    .line 64
    .line 65
    aget-object v13, v4, v12

    .line 66
    .line 67
    invoke-virtual {v1, v13}, Lio/sentry/cache/c;->d(Ljava/io/File;)Lio/sentry/internal/debugmeta/c;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v14, "File can\'t be deleted: %s"

    .line 72
    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    iget-object v15, v0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v15, Ljava/lang/Iterable;

    .line 78
    .line 79
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v16

    .line 83
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v16

    .line 87
    if-nez v16, :cond_1

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_1
    invoke-virtual {v8}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    sget-object v9, Lio/sentry/clientreport/d;->CACHE_OVERFLOW:Lio/sentry/clientreport/d;

    .line 95
    .line 96
    invoke-interface {v5, v9, v0}, Lio/sentry/clientreport/f;->c(Lio/sentry/clientreport/d;Lio/sentry/internal/debugmeta/c;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-eqz v5, :cond_4

    .line 108
    .line 109
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    check-cast v5, Lio/sentry/a5;

    .line 114
    .line 115
    if-nez v5, :cond_2

    .line 116
    .line 117
    move v9, v7

    .line 118
    goto :goto_2

    .line 119
    :cond_2
    iget-object v9, v5, Lio/sentry/a5;->a:Lio/sentry/b5;

    .line 120
    .line 121
    iget-object v9, v9, Lio/sentry/b5;->e:Lio/sentry/l5;

    .line 122
    .line 123
    sget-object v15, Lio/sentry/l5;->Session:Lio/sentry/l5;

    .line 124
    .line 125
    invoke-virtual {v9, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    :goto_2
    if-nez v9, :cond_3

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    invoke-virtual {v1, v5}, Lio/sentry/cache/c;->e(Lio/sentry/a5;)Lio/sentry/z6;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    goto :goto_3

    .line 137
    :cond_4
    const/4 v0, 0x0

    .line 138
    :goto_3
    if-eqz v0, :cond_5

    .line 139
    .line 140
    iget-object v5, v0, Lio/sentry/z6;->e:Ljava/lang/String;

    .line 141
    .line 142
    iget-object v9, v0, Lio/sentry/z6;->i:Lio/sentry/y6;

    .line 143
    .line 144
    sget-object v15, Lio/sentry/y6;->Ok:Lio/sentry/y6;

    .line 145
    .line 146
    invoke-virtual {v9, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    if-nez v9, :cond_6

    .line 151
    .line 152
    :cond_5
    :goto_4
    move-object/from16 v17, v4

    .line 153
    .line 154
    move-object/from16 v19, v6

    .line 155
    .line 156
    move-object/from16 v21, v8

    .line 157
    .line 158
    goto/16 :goto_f

    .line 159
    .line 160
    :cond_6
    if-eqz v5, :cond_5

    .line 161
    .line 162
    iget-object v0, v0, Lio/sentry/z6;->f:Ljava/lang/Boolean;

    .line 163
    .line 164
    if-eqz v0, :cond_5

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-nez v0, :cond_7

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_7
    array-length v9, v11

    .line 174
    move v15, v7

    .line 175
    :goto_5
    if-ge v15, v9, :cond_5

    .line 176
    .line 177
    aget-object v7, v11, v15

    .line 178
    .line 179
    move-object/from16 v17, v4

    .line 180
    .line 181
    invoke-virtual {v1, v7}, Lio/sentry/cache/c;->d(Ljava/io/File;)Lio/sentry/internal/debugmeta/c;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    if-eqz v4, :cond_8

    .line 186
    .line 187
    iget-object v0, v4, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    .line 188
    .line 189
    move-object/from16 v18, v0

    .line 190
    .line 191
    check-cast v18, Ljava/lang/Iterable;

    .line 192
    .line 193
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-nez v0, :cond_9

    .line 202
    .line 203
    :cond_8
    move-object/from16 v23, v5

    .line 204
    .line 205
    move-object/from16 v19, v6

    .line 206
    .line 207
    move-object/from16 v21, v8

    .line 208
    .line 209
    move/from16 v22, v9

    .line 210
    .line 211
    goto/16 :goto_e

    .line 212
    .line 213
    :cond_9
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v19

    .line 221
    if-eqz v19, :cond_10

    .line 222
    .line 223
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v19

    .line 227
    move-object/from16 v20, v0

    .line 228
    .line 229
    move-object/from16 v0, v19

    .line 230
    .line 231
    check-cast v0, Lio/sentry/a5;

    .line 232
    .line 233
    if-nez v0, :cond_a

    .line 234
    .line 235
    move-object/from16 v19, v6

    .line 236
    .line 237
    move-object/from16 v21, v8

    .line 238
    .line 239
    const/4 v6, 0x0

    .line 240
    goto :goto_7

    .line 241
    :cond_a
    move-object/from16 v19, v6

    .line 242
    .line 243
    iget-object v6, v0, Lio/sentry/a5;->a:Lio/sentry/b5;

    .line 244
    .line 245
    iget-object v6, v6, Lio/sentry/b5;->e:Lio/sentry/l5;

    .line 246
    .line 247
    move-object/from16 v21, v8

    .line 248
    .line 249
    sget-object v8, Lio/sentry/l5;->Session:Lio/sentry/l5;

    .line 250
    .line 251
    invoke-virtual {v6, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v6

    .line 255
    :goto_7
    if-nez v6, :cond_c

    .line 256
    .line 257
    :cond_b
    move-object/from16 v6, v19

    .line 258
    .line 259
    move-object/from16 v0, v20

    .line 260
    .line 261
    move-object/from16 v8, v21

    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_c
    invoke-virtual {v1, v0}, Lio/sentry/cache/c;->e(Lio/sentry/a5;)Lio/sentry/z6;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    if-eqz v0, :cond_b

    .line 269
    .line 270
    iget-object v6, v0, Lio/sentry/z6;->e:Ljava/lang/String;

    .line 271
    .line 272
    iget-object v8, v0, Lio/sentry/z6;->i:Lio/sentry/y6;

    .line 273
    .line 274
    move/from16 v22, v9

    .line 275
    .line 276
    sget-object v9, Lio/sentry/y6;->Ok:Lio/sentry/y6;

    .line 277
    .line 278
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v8

    .line 282
    if-nez v8, :cond_d

    .line 283
    .line 284
    goto :goto_9

    .line 285
    :cond_d
    if-eqz v6, :cond_f

    .line 286
    .line 287
    iget-object v8, v0, Lio/sentry/z6;->f:Ljava/lang/Boolean;

    .line 288
    .line 289
    if-eqz v8, :cond_e

    .line 290
    .line 291
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 292
    .line 293
    .line 294
    move-result v8

    .line 295
    if-eqz v8, :cond_e

    .line 296
    .line 297
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    sget-object v4, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 302
    .line 303
    const-string v6, "Session %s has 2 times the init flag."

    .line 304
    .line 305
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v5

    .line 309
    invoke-interface {v0, v4, v6, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    goto/16 :goto_f

    .line 313
    .line 314
    :cond_e
    if-eqz v5, :cond_f

    .line 315
    .line 316
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v6

    .line 320
    if-eqz v6, :cond_f

    .line 321
    .line 322
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 323
    .line 324
    iput-object v6, v0, Lio/sentry/z6;->f:Ljava/lang/Boolean;

    .line 325
    .line 326
    :try_start_0
    invoke-virtual/range {v19 .. v19}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    check-cast v6, Lio/sentry/i1;

    .line 331
    .line 332
    invoke-static {v6, v0}, Lio/sentry/a5;->d(Lio/sentry/i1;Lio/sentry/z6;)Lio/sentry/a5;

    .line 333
    .line 334
    .line 335
    move-result-object v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 336
    :try_start_1
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->remove()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 337
    .line 338
    .line 339
    move-object/from16 v23, v5

    .line 340
    .line 341
    goto :goto_a

    .line 342
    :catch_0
    move-exception v0

    .line 343
    goto :goto_8

    .line 344
    :catch_1
    move-exception v0

    .line 345
    const/4 v6, 0x0

    .line 346
    :goto_8
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 347
    .line 348
    .line 349
    move-result-object v8

    .line 350
    sget-object v9, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 351
    .line 352
    move-object/from16 v23, v5

    .line 353
    .line 354
    const-string v5, "Failed to create new envelope item for the session %s"

    .line 355
    .line 356
    move-object/from16 v20, v6

    .line 357
    .line 358
    filled-new-array/range {v23 .. v23}, [Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v6

    .line 362
    invoke-interface {v8, v9, v0, v5, v6}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    move-object/from16 v6, v20

    .line 366
    .line 367
    goto :goto_a

    .line 368
    :cond_f
    :goto_9
    move-object/from16 v23, v5

    .line 369
    .line 370
    move-object/from16 v6, v19

    .line 371
    .line 372
    move-object/from16 v0, v20

    .line 373
    .line 374
    move-object/from16 v8, v21

    .line 375
    .line 376
    move/from16 v9, v22

    .line 377
    .line 378
    move-object/from16 v5, v23

    .line 379
    .line 380
    goto/16 :goto_6

    .line 381
    .line 382
    :cond_10
    move-object/from16 v23, v5

    .line 383
    .line 384
    move-object/from16 v19, v6

    .line 385
    .line 386
    move-object/from16 v21, v8

    .line 387
    .line 388
    move/from16 v22, v9

    .line 389
    .line 390
    const/4 v6, 0x0

    .line 391
    :goto_a
    if-eqz v6, :cond_13

    .line 392
    .line 393
    new-instance v0, Ljava/util/ArrayList;

    .line 394
    .line 395
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 396
    .line 397
    .line 398
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 399
    .line 400
    .line 401
    move-result-object v5

    .line 402
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 403
    .line 404
    .line 405
    move-result v8

    .line 406
    if-eqz v8, :cond_11

    .line 407
    .line 408
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v8

    .line 412
    check-cast v8, Lio/sentry/a5;

    .line 413
    .line 414
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    goto :goto_b

    .line 418
    :cond_11
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    new-instance v5, Lio/sentry/internal/debugmeta/c;

    .line 422
    .line 423
    iget-object v4, v4, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v4, Lio/sentry/v4;

    .line 426
    .line 427
    invoke-direct {v5, v4, v0}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/v4;Ljava/util/List;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v7}, Ljava/io/File;->lastModified()J

    .line 431
    .line 432
    .line 433
    move-result-wide v8

    .line 434
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    if-nez v0, :cond_12

    .line 439
    .line 440
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    sget-object v4, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 445
    .line 446
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v6

    .line 450
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v6

    .line 454
    invoke-interface {v0, v4, v14, v6}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    :cond_12
    :try_start_2
    new-instance v4, Ljava/io/FileOutputStream;

    .line 458
    .line 459
    invoke-direct {v4, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 460
    .line 461
    .line 462
    :try_start_3
    invoke-virtual/range {v19 .. v19}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    check-cast v0, Lio/sentry/i1;

    .line 467
    .line 468
    invoke-interface {v0, v5, v4}, Lio/sentry/i1;->e(Lio/sentry/internal/debugmeta/c;Ljava/io/OutputStream;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v7, v8, v9}, Ljava/io/File;->setLastModified(J)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 472
    .line 473
    .line 474
    :try_start_4
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 475
    .line 476
    .line 477
    goto :goto_f

    .line 478
    :catchall_0
    move-exception v0

    .line 479
    goto :goto_d

    .line 480
    :catchall_1
    move-exception v0

    .line 481
    move-object v5, v0

    .line 482
    :try_start_5
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 483
    .line 484
    .line 485
    goto :goto_c

    .line 486
    :catchall_2
    move-exception v0

    .line 487
    :try_start_6
    invoke-virtual {v5, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 488
    .line 489
    .line 490
    :goto_c
    throw v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 491
    :goto_d
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 492
    .line 493
    .line 494
    move-result-object v4

    .line 495
    sget-object v5, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 496
    .line 497
    const-string v6, "Failed to serialize the new envelope to the disk."

    .line 498
    .line 499
    invoke-interface {v4, v5, v6, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 500
    .line 501
    .line 502
    goto :goto_f

    .line 503
    :cond_13
    :goto_e
    add-int/lit8 v15, v15, 0x1

    .line 504
    .line 505
    move-object/from16 v4, v17

    .line 506
    .line 507
    move-object/from16 v6, v19

    .line 508
    .line 509
    move-object/from16 v8, v21

    .line 510
    .line 511
    move/from16 v9, v22

    .line 512
    .line 513
    move-object/from16 v5, v23

    .line 514
    .line 515
    const/4 v7, 0x0

    .line 516
    goto/16 :goto_5

    .line 517
    .line 518
    :goto_f
    invoke-virtual {v13}, Ljava/io/File;->delete()Z

    .line 519
    .line 520
    .line 521
    move-result v0

    .line 522
    if-nez v0, :cond_14

    .line 523
    .line 524
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    sget-object v4, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 529
    .line 530
    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v5

    .line 534
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v5

    .line 538
    invoke-interface {v0, v4, v14, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    :cond_14
    add-int/lit8 v12, v12, 0x1

    .line 542
    .line 543
    move-object/from16 v4, v17

    .line 544
    .line 545
    move-object/from16 v6, v19

    .line 546
    .line 547
    move-object/from16 v8, v21

    .line 548
    .line 549
    const/4 v7, 0x0

    .line 550
    const/4 v9, 0x1

    .line 551
    goto/16 :goto_0

    .line 552
    .line 553
    :cond_15
    move-object/from16 v19, v6

    .line 554
    .line 555
    move-object/from16 v21, v8

    .line 556
    .line 557
    iget-object v0, v1, Lio/sentry/cache/c;->c:Ljava/io/File;

    .line 558
    .line 559
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v4

    .line 563
    new-instance v5, Ljava/io/File;

    .line 564
    .line 565
    const-string v6, "session.json"

    .line 566
    .line 567
    invoke-direct {v5, v4, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v4

    .line 574
    new-instance v6, Ljava/io/File;

    .line 575
    .line 576
    const-string v7, "previous_session.json"

    .line 577
    .line 578
    invoke-direct {v6, v4, v7}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    const-class v4, Lio/sentry/hints/i;

    .line 582
    .line 583
    invoke-static {v3, v4}, Lio/sentry/util/c;->i(Lio/sentry/i0;Ljava/lang/Class;)Z

    .line 584
    .line 585
    .line 586
    move-result v4

    .line 587
    if-eqz v4, :cond_16

    .line 588
    .line 589
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 590
    .line 591
    .line 592
    move-result v4

    .line 593
    if-nez v4, :cond_16

    .line 594
    .line 595
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 596
    .line 597
    .line 598
    move-result-object v4

    .line 599
    sget-object v8, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 600
    .line 601
    const-string v9, "Current envelope doesn\'t exist."

    .line 602
    .line 603
    const/4 v10, 0x0

    .line 604
    new-array v11, v10, [Ljava/lang/Object;

    .line 605
    .line 606
    invoke-interface {v4, v8, v9, v11}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 607
    .line 608
    .line 609
    :cond_16
    const-class v4, Lio/sentry/hints/a;

    .line 610
    .line 611
    const-string v8, "sentry:typeCheckHint"

    .line 612
    .line 613
    invoke-virtual {v3, v8}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v9

    .line 617
    invoke-virtual {v4, v9}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    move-result v4

    .line 621
    const-class v9, Lio/sentry/z6;

    .line 622
    .line 623
    sget-object v10, Lio/sentry/cache/c;->w:Ljava/nio/charset/Charset;

    .line 624
    .line 625
    if-nez v4, :cond_18

    .line 626
    .line 627
    const-class v4, Lio/sentry/hints/g;

    .line 628
    .line 629
    invoke-virtual {v3, v8}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v11

    .line 633
    invoke-virtual {v4, v11}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    move-result v4

    .line 637
    if-eqz v4, :cond_17

    .line 638
    .line 639
    goto :goto_11

    .line 640
    :cond_17
    :goto_10
    const/4 v15, 0x1

    .line 641
    goto/16 :goto_1a

    .line 642
    .line 643
    :cond_18
    :goto_11
    invoke-virtual {v3, v8}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v4

    .line 647
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    new-instance v11, Ljava/io/File;

    .line 652
    .line 653
    invoke-direct {v11, v0, v7}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    .line 657
    .line 658
    .line 659
    move-result v0

    .line 660
    if-eqz v0, :cond_21

    .line 661
    .line 662
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    sget-object v7, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 667
    .line 668
    const-string v12, "Previous session is not ended, we\'d need to end it."

    .line 669
    .line 670
    const/4 v13, 0x0

    .line 671
    new-array v14, v13, [Ljava/lang/Object;

    .line 672
    .line 673
    invoke-interface {v0, v7, v12, v14}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    :try_start_7
    new-instance v12, Ljava/io/BufferedReader;

    .line 677
    .line 678
    new-instance v0, Ljava/io/InputStreamReader;

    .line 679
    .line 680
    new-instance v13, Ljava/io/FileInputStream;

    .line 681
    .line 682
    invoke-direct {v13, v11}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 683
    .line 684
    .line 685
    invoke-direct {v0, v13, v10}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 686
    .line 687
    .line 688
    invoke-direct {v12, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 689
    .line 690
    .line 691
    :try_start_8
    invoke-virtual/range {v19 .. v19}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    check-cast v0, Lio/sentry/i1;

    .line 696
    .line 697
    invoke-interface {v0, v12, v9}, Lio/sentry/i1;->b(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    check-cast v0, Lio/sentry/z6;

    .line 702
    .line 703
    if-eqz v0, :cond_20

    .line 704
    .line 705
    iget-object v13, v0, Lio/sentry/z6;->a:Ljava/util/Date;

    .line 706
    .line 707
    instance-of v14, v4, Lio/sentry/hints/a;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 708
    .line 709
    if-eqz v14, :cond_1c

    .line 710
    .line 711
    :try_start_9
    check-cast v4, Lio/sentry/hints/a;

    .line 712
    .line 713
    invoke-interface {v4}, Lio/sentry/hints/a;->b()Ljava/lang/Long;

    .line 714
    .line 715
    .line 716
    move-result-object v14

    .line 717
    if-eqz v14, :cond_1a

    .line 718
    .line 719
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 720
    .line 721
    .line 722
    move-result-wide v14

    .line 723
    move-object/from16 v17, v4

    .line 724
    .line 725
    new-instance v4, Ljava/util/Date;

    .line 726
    .line 727
    invoke-direct {v4, v14, v15}, Ljava/util/Date;-><init>(J)V

    .line 728
    .line 729
    .line 730
    if-eqz v13, :cond_19

    .line 731
    .line 732
    invoke-virtual {v4, v13}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    .line 733
    .line 734
    .line 735
    move-result v13

    .line 736
    if-eqz v13, :cond_1b

    .line 737
    .line 738
    goto :goto_12

    .line 739
    :catchall_3
    move-exception v0

    .line 740
    move-object v4, v0

    .line 741
    const/4 v15, 0x1

    .line 742
    goto/16 :goto_17

    .line 743
    .line 744
    :cond_19
    :goto_12
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    const-string v4, "Abnormal exit happened before previous session start, not ending the session."

    .line 749
    .line 750
    const/4 v13, 0x0

    .line 751
    new-array v11, v13, [Ljava/lang/Object;

    .line 752
    .line 753
    invoke-interface {v0, v7, v4, v11}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 754
    .line 755
    .line 756
    :try_start_a
    invoke-virtual {v12}, Ljava/io/Reader;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 757
    .line 758
    .line 759
    goto :goto_10

    .line 760
    :catchall_4
    move-exception v0

    .line 761
    const/4 v15, 0x1

    .line 762
    goto :goto_19

    .line 763
    :cond_1a
    move-object/from16 v17, v4

    .line 764
    .line 765
    const/4 v4, 0x0

    .line 766
    :cond_1b
    :try_start_b
    invoke-interface/range {v17 .. v17}, Lio/sentry/hints/a;->e()Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object v7

    .line 770
    sget-object v13, Lio/sentry/y6;->Abnormal:Lio/sentry/y6;

    .line 771
    .line 772
    const/4 v14, 0x0

    .line 773
    const/4 v15, 0x1

    .line 774
    invoke-virtual {v0, v13, v14, v15, v7}, Lio/sentry/z6;->c(Lio/sentry/y6;Ljava/lang/String;ZLjava/lang/String;)Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 775
    .line 776
    .line 777
    const/4 v15, 0x1

    .line 778
    goto :goto_16

    .line 779
    :cond_1c
    :try_start_c
    instance-of v14, v4, Lio/sentry/hints/g;

    .line 780
    .line 781
    if-eqz v14, :cond_1f

    .line 782
    .line 783
    check-cast v4, Lio/sentry/hints/g;

    .line 784
    .line 785
    check-cast v4, Lio/sentry/android/core/x1;

    .line 786
    .line 787
    iget-wide v14, v4, Lio/sentry/android/core/x1;->d:J

    .line 788
    .line 789
    new-instance v4, Ljava/util/Date;

    .line 790
    .line 791
    invoke-direct {v4, v14, v15}, Ljava/util/Date;-><init>(J)V

    .line 792
    .line 793
    .line 794
    if-eqz v13, :cond_1d

    .line 795
    .line 796
    invoke-virtual {v4, v13}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    .line 797
    .line 798
    .line 799
    move-result v13

    .line 800
    if-eqz v13, :cond_1e

    .line 801
    .line 802
    :cond_1d
    const/4 v15, 0x1

    .line 803
    goto :goto_14

    .line 804
    :cond_1e
    sget-object v7, Lio/sentry/y6;->Crashed:Lio/sentry/y6;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 805
    .line 806
    const/4 v14, 0x0

    .line 807
    const/4 v15, 0x1

    .line 808
    :try_start_d
    invoke-virtual {v0, v7, v14, v15, v14}, Lio/sentry/z6;->c(Lio/sentry/y6;Ljava/lang/String;ZLjava/lang/String;)Z

    .line 809
    .line 810
    .line 811
    goto :goto_16

    .line 812
    :catchall_5
    move-exception v0

    .line 813
    :goto_13
    move-object v4, v0

    .line 814
    goto :goto_17

    .line 815
    :catchall_6
    move-exception v0

    .line 816
    const/4 v15, 0x1

    .line 817
    goto :goto_13

    .line 818
    :goto_14
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    const-string v4, "Native crash exit happened before previous session start, not ending the session."

    .line 823
    .line 824
    const/4 v13, 0x0

    .line 825
    new-array v11, v13, [Ljava/lang/Object;

    .line 826
    .line 827
    invoke-interface {v0, v7, v4, v11}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 828
    .line 829
    .line 830
    :goto_15
    :try_start_e
    invoke-virtual {v12}, Ljava/io/Reader;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 831
    .line 832
    .line 833
    goto :goto_1a

    .line 834
    :catchall_7
    move-exception v0

    .line 835
    goto :goto_19

    .line 836
    :cond_1f
    const/4 v14, 0x0

    .line 837
    const/4 v15, 0x1

    .line 838
    move-object v4, v14

    .line 839
    :goto_16
    :try_start_f
    invoke-virtual {v0, v4}, Lio/sentry/z6;->b(Ljava/util/Date;)V

    .line 840
    .line 841
    .line 842
    invoke-virtual {v1, v11, v0}, Lio/sentry/cache/c;->g(Ljava/io/File;Lio/sentry/z6;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 843
    .line 844
    .line 845
    goto :goto_15

    .line 846
    :cond_20
    const/4 v15, 0x1

    .line 847
    goto :goto_15

    .line 848
    :goto_17
    :try_start_10
    invoke-virtual {v12}, Ljava/io/Reader;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 849
    .line 850
    .line 851
    goto :goto_18

    .line 852
    :catchall_8
    move-exception v0

    .line 853
    :try_start_11
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 854
    .line 855
    .line 856
    :goto_18
    throw v4
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 857
    :goto_19
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 858
    .line 859
    .line 860
    move-result-object v4

    .line 861
    sget-object v7, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 862
    .line 863
    const-string v11, "Error processing previous session."

    .line 864
    .line 865
    invoke-interface {v4, v7, v11, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 866
    .line 867
    .line 868
    goto :goto_1a

    .line 869
    :cond_21
    const/4 v15, 0x1

    .line 870
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    sget-object v4, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 875
    .line 876
    const-string v7, "No previous session file to end."

    .line 877
    .line 878
    const/4 v13, 0x0

    .line 879
    new-array v11, v13, [Ljava/lang/Object;

    .line 880
    .line 881
    invoke-interface {v0, v4, v7, v11}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 882
    .line 883
    .line 884
    :goto_1a
    const-class v0, Lio/sentry/hints/j;

    .line 885
    .line 886
    invoke-virtual {v3, v8}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v4

    .line 890
    invoke-virtual {v0, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 891
    .line 892
    .line 893
    move-result v0

    .line 894
    const-string v4, "last_crash"

    .line 895
    .line 896
    if-eqz v0, :cond_27

    .line 897
    .line 898
    invoke-virtual {v1, v5, v6}, Lio/sentry/cache/c;->c(Ljava/io/File;Ljava/io/File;)V

    .line 899
    .line 900
    .line 901
    iget-object v0, v2, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    .line 902
    .line 903
    check-cast v0, Ljava/lang/Iterable;

    .line 904
    .line 905
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 906
    .line 907
    .line 908
    move-result-object v6

    .line 909
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 910
    .line 911
    .line 912
    move-result v6

    .line 913
    if-eqz v6, :cond_24

    .line 914
    .line 915
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    move-result-object v0

    .line 923
    check-cast v0, Lio/sentry/a5;

    .line 924
    .line 925
    sget-object v6, Lio/sentry/l5;->Session:Lio/sentry/l5;

    .line 926
    .line 927
    iget-object v7, v0, Lio/sentry/a5;->a:Lio/sentry/b5;

    .line 928
    .line 929
    iget-object v7, v7, Lio/sentry/b5;->e:Lio/sentry/l5;

    .line 930
    .line 931
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 932
    .line 933
    .line 934
    move-result v6

    .line 935
    if-eqz v6, :cond_23

    .line 936
    .line 937
    :try_start_12
    new-instance v6, Ljava/io/BufferedReader;

    .line 938
    .line 939
    new-instance v11, Ljava/io/InputStreamReader;

    .line 940
    .line 941
    new-instance v12, Ljava/io/ByteArrayInputStream;

    .line 942
    .line 943
    invoke-virtual {v0}, Lio/sentry/a5;->f()[B

    .line 944
    .line 945
    .line 946
    move-result-object v0

    .line 947
    invoke-direct {v12, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 948
    .line 949
    .line 950
    invoke-direct {v11, v12, v10}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 951
    .line 952
    .line 953
    invoke-direct {v6, v11}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    .line 954
    .line 955
    .line 956
    :try_start_13
    invoke-virtual/range {v19 .. v19}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v0

    .line 960
    check-cast v0, Lio/sentry/i1;

    .line 961
    .line 962
    invoke-interface {v0, v6, v9}, Lio/sentry/i1;->b(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    check-cast v0, Lio/sentry/z6;

    .line 967
    .line 968
    if-nez v0, :cond_22

    .line 969
    .line 970
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    sget-object v5, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 975
    .line 976
    const-string v9, "Item of type %s returned null by the parser."

    .line 977
    .line 978
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    move-result-object v7

    .line 982
    invoke-interface {v0, v5, v9, v7}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 983
    .line 984
    .line 985
    goto :goto_1b

    .line 986
    :catchall_9
    move-exception v0

    .line 987
    move-object v5, v0

    .line 988
    goto :goto_1c

    .line 989
    :cond_22
    invoke-virtual {v1, v5, v0}, Lio/sentry/cache/c;->g(Ljava/io/File;Lio/sentry/z6;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    .line 990
    .line 991
    .line 992
    :goto_1b
    :try_start_14
    invoke-virtual {v6}, Ljava/io/Reader;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_a

    .line 993
    .line 994
    .line 995
    goto :goto_1f

    .line 996
    :catchall_a
    move-exception v0

    .line 997
    goto :goto_1e

    .line 998
    :goto_1c
    :try_start_15
    invoke-virtual {v6}, Ljava/io/Reader;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_b

    .line 999
    .line 1000
    .line 1001
    goto :goto_1d

    .line 1002
    :catchall_b
    move-exception v0

    .line 1003
    :try_start_16
    invoke-virtual {v5, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1004
    .line 1005
    .line 1006
    :goto_1d
    throw v5
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_a

    .line 1007
    :goto_1e
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v5

    .line 1011
    sget-object v6, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1012
    .line 1013
    const-string v7, "Item failed to process."

    .line 1014
    .line 1015
    invoke-interface {v5, v6, v7, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1016
    .line 1017
    .line 1018
    goto :goto_1f

    .line 1019
    :cond_23
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v0

    .line 1023
    sget-object v5, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 1024
    .line 1025
    const-string v6, "Current envelope has a different envelope type %s"

    .line 1026
    .line 1027
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v7

    .line 1031
    invoke-interface {v0, v5, v6, v7}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1032
    .line 1033
    .line 1034
    goto :goto_1f

    .line 1035
    :cond_24
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v0

    .line 1039
    sget-object v6, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 1040
    .line 1041
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v5

    .line 1045
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v5

    .line 1049
    const-string v7, "Current envelope %s is empty"

    .line 1050
    .line 1051
    invoke-interface {v0, v6, v7, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1052
    .line 1053
    .line 1054
    :goto_1f
    new-instance v0, Ljava/io/File;

    .line 1055
    .line 1056
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getCacheDirPath()Ljava/lang/String;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v5

    .line 1060
    const-string v6, ".sentry-native/last_crash"

    .line 1061
    .line 1062
    invoke-direct {v0, v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 1066
    .line 1067
    .line 1068
    move-result v0

    .line 1069
    if-nez v0, :cond_25

    .line 1070
    .line 1071
    new-instance v0, Ljava/io/File;

    .line 1072
    .line 1073
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getCacheDirPath()Ljava/lang/String;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v5

    .line 1077
    invoke-direct {v0, v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 1081
    .line 1082
    .line 1083
    move-result v5

    .line 1084
    if-eqz v5, :cond_25

    .line 1085
    .line 1086
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v5

    .line 1090
    sget-object v6, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 1091
    .line 1092
    const-string v7, "Crash marker file exists, crashedLastRun will return true."

    .line 1093
    .line 1094
    const/4 v13, 0x0

    .line 1095
    new-array v9, v13, [Ljava/lang/Object;

    .line 1096
    .line 1097
    invoke-interface {v5, v6, v7, v9}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 1101
    .line 1102
    .line 1103
    move-result v5

    .line 1104
    if-nez v5, :cond_26

    .line 1105
    .line 1106
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v5

    .line 1110
    sget-object v6, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1111
    .line 1112
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v0

    .line 1116
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v0

    .line 1120
    const-string v7, "Failed to delete the crash marker file. %s."

    .line 1121
    .line 1122
    invoke-interface {v5, v6, v7, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1123
    .line 1124
    .line 1125
    goto :goto_20

    .line 1126
    :cond_25
    const/4 v13, 0x0

    .line 1127
    :cond_26
    :goto_20
    sget-object v0, Lio/sentry/s4;->c:Lio/sentry/s4;

    .line 1128
    .line 1129
    invoke-virtual {v0}, Lio/sentry/s4;->a()V

    .line 1130
    .line 1131
    .line 1132
    iget-object v0, v1, Lio/sentry/cache/c;->e:Ljava/util/concurrent/CountDownLatch;

    .line 1133
    .line 1134
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 1135
    .line 1136
    .line 1137
    goto :goto_21

    .line 1138
    :cond_27
    const/4 v13, 0x0

    .line 1139
    :goto_21
    invoke-virtual/range {p0 .. p1}, Lio/sentry/cache/c;->b(Lio/sentry/internal/debugmeta/c;)Ljava/io/File;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v1

    .line 1143
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 1144
    .line 1145
    .line 1146
    move-result v0

    .line 1147
    if-eqz v0, :cond_28

    .line 1148
    .line 1149
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v0

    .line 1153
    sget-object v2, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 1154
    .line 1155
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v1

    .line 1159
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v1

    .line 1163
    const-string v3, "Not adding Envelope to offline storage because it already exists: %s"

    .line 1164
    .line 1165
    invoke-interface {v0, v2, v3, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1166
    .line 1167
    .line 1168
    move v9, v15

    .line 1169
    goto/16 :goto_28

    .line 1170
    .line 1171
    :cond_28
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v0

    .line 1175
    sget-object v5, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 1176
    .line 1177
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v6

    .line 1181
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v6

    .line 1185
    const-string v7, "Adding Envelope to offline storage: %s"

    .line 1186
    .line 1187
    invoke-interface {v0, v5, v7, v6}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 1191
    .line 1192
    .line 1193
    move-result v0

    .line 1194
    if-eqz v0, :cond_29

    .line 1195
    .line 1196
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v0

    .line 1200
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v6

    .line 1204
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v6

    .line 1208
    const-string v7, "Overwriting envelope to offline storage: %s"

    .line 1209
    .line 1210
    invoke-interface {v0, v5, v7, v6}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 1214
    .line 1215
    .line 1216
    move-result v0

    .line 1217
    if-nez v0, :cond_29

    .line 1218
    .line 1219
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v0

    .line 1223
    sget-object v5, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1224
    .line 1225
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v6

    .line 1229
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v6

    .line 1233
    const-string v7, "Failed to delete: %s"

    .line 1234
    .line 1235
    invoke-interface {v0, v5, v7, v6}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1236
    .line 1237
    .line 1238
    :cond_29
    :try_start_17
    new-instance v5, Ljava/io/FileOutputStream;

    .line 1239
    .line 1240
    invoke-direct {v5, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_c

    .line 1241
    .line 1242
    .line 1243
    :try_start_18
    invoke-virtual/range {v19 .. v19}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v0

    .line 1247
    check-cast v0, Lio/sentry/i1;

    .line 1248
    .line 1249
    invoke-interface {v0, v2, v5}, Lio/sentry/i1;->e(Lio/sentry/internal/debugmeta/c;Ljava/io/OutputStream;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_d

    .line 1250
    .line 1251
    .line 1252
    :try_start_19
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_c

    .line 1253
    .line 1254
    .line 1255
    move v7, v15

    .line 1256
    goto :goto_24

    .line 1257
    :catchall_c
    move-exception v0

    .line 1258
    goto :goto_23

    .line 1259
    :catchall_d
    move-exception v0

    .line 1260
    move-object v2, v0

    .line 1261
    :try_start_1a
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_e

    .line 1262
    .line 1263
    .line 1264
    goto :goto_22

    .line 1265
    :catchall_e
    move-exception v0

    .line 1266
    :try_start_1b
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1267
    .line 1268
    .line 1269
    :goto_22
    throw v2
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_c

    .line 1270
    :goto_23
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v2

    .line 1274
    sget-object v5, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1275
    .line 1276
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v1

    .line 1280
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v1

    .line 1284
    const-string v6, "Error writing Envelope %s to offline storage"

    .line 1285
    .line 1286
    invoke-interface {v2, v5, v0, v6, v1}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1287
    .line 1288
    .line 1289
    move v7, v13

    .line 1290
    :goto_24
    const-class v0, Lio/sentry/l7;

    .line 1291
    .line 1292
    invoke-virtual {v3, v8}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v1

    .line 1296
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 1297
    .line 1298
    .line 1299
    move-result v0

    .line 1300
    if-eqz v0, :cond_2a

    .line 1301
    .line 1302
    new-instance v0, Ljava/io/File;

    .line 1303
    .line 1304
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getCacheDirPath()Ljava/lang/String;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v1

    .line 1308
    invoke-direct {v0, v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1309
    .line 1310
    .line 1311
    :try_start_1c
    new-instance v1, Ljava/io/FileOutputStream;

    .line 1312
    .line 1313
    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_f

    .line 1314
    .line 1315
    .line 1316
    :try_start_1d
    new-instance v0, Ljava/util/Date;

    .line 1317
    .line 1318
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 1319
    .line 1320
    .line 1321
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 1322
    .line 1323
    .line 1324
    move-result-wide v2

    .line 1325
    invoke-static {v2, v3}, Lio/sentry/config/a;->q(J)Ljava/lang/String;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v0

    .line 1329
    invoke-virtual {v0, v10}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 1330
    .line 1331
    .line 1332
    move-result-object v0

    .line 1333
    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 1334
    .line 1335
    .line 1336
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_10

    .line 1337
    .line 1338
    .line 1339
    :try_start_1e
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_f

    .line 1340
    .line 1341
    .line 1342
    goto :goto_27

    .line 1343
    :catchall_f
    move-exception v0

    .line 1344
    goto :goto_26

    .line 1345
    :catchall_10
    move-exception v0

    .line 1346
    move-object v2, v0

    .line 1347
    :try_start_1f
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_11

    .line 1348
    .line 1349
    .line 1350
    goto :goto_25

    .line 1351
    :catchall_11
    move-exception v0

    .line 1352
    :try_start_20
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1353
    .line 1354
    .line 1355
    :goto_25
    throw v2
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_f

    .line 1356
    :goto_26
    invoke-virtual/range {v21 .. v21}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v1

    .line 1360
    sget-object v2, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1361
    .line 1362
    const-string v3, "Error writing the crash marker file to the disk"

    .line 1363
    .line 1364
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1365
    .line 1366
    .line 1367
    :cond_2a
    :goto_27
    move v9, v7

    .line 1368
    :goto_28
    return v9
.end method

.method public final a()[Ljava/io/File;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/cache/c;->c:Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p0, Lio/sentry/cache/b;

    .line 23
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    :goto_0
    iget-object p0, p0, Lio/sentry/cache/c;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 35
    .line 36
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-string v2, "The directory for caching files is inaccessible.: %s"

    .line 51
    .line 52
    invoke-interface {p0, v1, v2, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    const/4 p0, 0x0

    .line 56
    new-array p0, p0, [Ljava/io/File;

    .line 57
    .line 58
    return-object p0
.end method

.method public final b(Lio/sentry/internal/debugmeta/c;)Ljava/io/File;
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/cache/c;->f:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    const-string v1, ".envelope"

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/cache/c;->i:Lio/sentry/util/a;

    .line 6
    .line 7
    invoke-virtual {v2}, Lio/sentry/util/a;->c()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ljava/lang/String;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-static {}, Lio/sentry/config/a;->j()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-object p1, v1

    .line 37
    :goto_0
    new-instance v0, Ljava/io/File;

    .line 38
    .line 39
    iget-object p0, p0, Lio/sentry/cache/c;->c:Ljava/io/File;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Lio/sentry/util/a;->close()V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :goto_1
    :try_start_1
    invoke-virtual {v2}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :catchall_1
    move-exception p1

    .line 57
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    :goto_2
    throw p0
.end method

.method public final c(Ljava/io/File;Ljava/io/File;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lio/sentry/cache/c;->v:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 7
    .line 8
    .line 9
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    :try_start_1
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    .line 17
    .line 18
    .line 19
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    const/4 v2, 0x0

    .line 21
    iget-object p0, p0, Lio/sentry/cache/c;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    :try_start_2
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    sget-object v3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 30
    .line 31
    const-string v4, "Previous session file already exists, deleting it."

    .line 32
    .line 33
    new-array v5, v2, [Ljava/lang/Object;

    .line 34
    .line 35
    invoke-interface {v1, v3, v4, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    sget-object v3, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 49
    .line 50
    const-string v4, "Unable to delete previous session file: %s"

    .line 51
    .line 52
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-interface {v1, v3, v4, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    goto :goto_2

    .line 62
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    sget-object v3, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 67
    .line 68
    const-string v4, "Moving current session to previous session."

    .line 69
    .line 70
    new-array v5, v2, [Ljava/lang/Object;

    .line 71
    .line 72
    invoke-interface {v1, v3, v4, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    .line 74
    .line 75
    :try_start_3
    invoke-virtual {p1, p2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-nez p1, :cond_2

    .line 80
    .line 81
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    sget-object p2, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 86
    .line 87
    const-string v1, "Unable to move current session to previous session."

    .line 88
    .line 89
    new-array v2, v2, [Ljava/lang/Object;

    .line 90
    .line 91
    invoke-interface {p1, p2, v1, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :catchall_1
    move-exception p1

    .line 96
    :try_start_4
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    sget-object p2, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 101
    .line 102
    const-string v1, "Error moving current session to previous session."

    .line 103
    .line 104
    invoke-interface {p0, p2, v1, p1}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 105
    .line 106
    .line 107
    :cond_2
    :goto_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :goto_2
    :try_start_5
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :catchall_2
    move-exception p1

    .line 116
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    :goto_3
    throw p0
.end method

.method public final d(Ljava/io/File;)Lio/sentry/internal/debugmeta/c;
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 2
    .line 3
    new-instance v1, Ljava/io/FileInputStream;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    :try_start_1
    iget-object p1, p0, Lio/sentry/cache/c;->b:Lio/sentry/util/g;

    .line 12
    .line 13
    invoke-virtual {p1}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lio/sentry/i1;

    .line 18
    .line 19
    invoke-interface {p1, v0}, Lio/sentry/i1;->c(Ljava/io/BufferedInputStream;)Lio/sentry/internal/debugmeta/c;

    .line 20
    .line 21
    .line 22
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :catch_0
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_1
    move-exception v0

    .line 35
    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 39
    :goto_1
    iget-object p0, p0, Lio/sentry/cache/c;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 40
    .line 41
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    sget-object v0, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 46
    .line 47
    const-string v1, "Failed to deserialize the envelope."

    .line 48
    .line 49
    invoke-interface {p0, v0, v1, p1}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0
.end method

.method public final e(Lio/sentry/a5;)Lio/sentry/z6;
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/BufferedReader;

    .line 2
    .line 3
    new-instance v1, Ljava/io/InputStreamReader;

    .line 4
    .line 5
    new-instance v2, Ljava/io/ByteArrayInputStream;

    .line 6
    .line 7
    invoke-virtual {p1}, Lio/sentry/a5;->f()[B

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v2, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Lio/sentry/cache/c;->w:Ljava/nio/charset/Charset;

    .line 15
    .line 16
    invoke-direct {v1, v2, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :try_start_1
    iget-object p1, p0, Lio/sentry/cache/c;->b:Lio/sentry/util/g;

    .line 23
    .line 24
    invoke-virtual {p1}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lio/sentry/i1;

    .line 29
    .line 30
    const-class v1, Lio/sentry/z6;

    .line 31
    .line 32
    invoke-interface {p1, v0, v1}, Lio/sentry/i1;->b(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lio/sentry/z6;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    .line 38
    :try_start_2
    invoke-virtual {v0}, Ljava/io/Reader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :catchall_1
    move-exception p1

    .line 45
    :try_start_3
    invoke-virtual {v0}, Ljava/io/Reader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_2
    move-exception v0

    .line 50
    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 54
    :goto_1
    iget-object p0, p0, Lio/sentry/cache/c;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 55
    .line 56
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    sget-object v0, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 61
    .line 62
    const-string v1, "Failed to deserialize the session."

    .line 63
    .line 64
    invoke-interface {p0, v0, v1, p1}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    return-object p0
.end method

.method public final f()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/cache/c;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    :try_start_0
    iget-object p0, p0, Lio/sentry/cache/c;->e:Ljava/util/concurrent/CountDownLatch;

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/sentry/m6;->getSessionFlushTimeoutMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    invoke-virtual {p0, v1, v2, v3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 12
    .line 13
    .line 14
    move-result p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return p0

    .line 16
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object v0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 28
    .line 29
    const-string v1, "Timed out waiting for previous session to flush."

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    new-array v3, v2, [Ljava/lang/Object;

    .line 33
    .line 34
    invoke-interface {p0, v0, v1, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return v2
.end method

.method public final g(Ljava/io/File;Lio/sentry/z6;)V
    .locals 7

    .line 1
    iget-object v0, p2, Lio/sentry/z6;->e:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/cache/c;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    .line 6
    .line 7
    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    :try_start_1
    new-instance p1, Ljava/io/BufferedWriter;

    .line 11
    .line 12
    new-instance v3, Ljava/io/OutputStreamWriter;

    .line 13
    .line 14
    sget-object v4, Lio/sentry/cache/c;->w:Ljava/nio/charset/Charset;

    .line 15
    .line 16
    invoke-direct {v3, v2, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p1, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    .line 21
    .line 22
    :try_start_2
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    sget-object v4, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 27
    .line 28
    const-string v5, "Overwriting session to offline storage: %s"

    .line 29
    .line 30
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-interface {v3, v4, v5, v6}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Lio/sentry/cache/c;->b:Lio/sentry/util/g;

    .line 38
    .line 39
    invoke-virtual {p0}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lio/sentry/i1;

    .line 44
    .line 45
    invoke-interface {p0, p1, p2}, Lio/sentry/i1;->a(Ljava/io/Writer;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 46
    .line 47
    .line 48
    :try_start_3
    invoke-virtual {p1}, Ljava/io/Writer;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 49
    .line 50
    .line 51
    :try_start_4
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto :goto_3

    .line 57
    :catchall_1
    move-exception p0

    .line 58
    goto :goto_1

    .line 59
    :catchall_2
    move-exception p0

    .line 60
    :try_start_5
    invoke-virtual {p1}, Ljava/io/Writer;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_3
    move-exception p1

    .line 65
    :try_start_6
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 69
    :goto_1
    :try_start_7
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :catchall_4
    move-exception p1

    .line 74
    :try_start_8
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    :goto_2
    throw p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 78
    :goto_3
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    sget-object p2, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 83
    .line 84
    const-string v1, "Error writing Session to offline storage: %s"

    .line 85
    .line 86
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-interface {p1, p2, p0, v1, v0}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 11

    .line 1
    iget-object v0, p0, Lio/sentry/cache/c;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/sentry/cache/c;->a()[Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Ljava/util/ArrayList;

    .line 8
    .line 9
    array-length v3, v1

    .line 10
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    .line 12
    .line 13
    array-length v3, v1

    .line 14
    const/4 v4, 0x0

    .line 15
    :goto_0
    if-ge v4, v3, :cond_0

    .line 16
    .line 17
    aget-object v5, v1, v4

    .line 18
    .line 19
    :try_start_0
    new-instance v6, Ljava/io/BufferedInputStream;

    .line 20
    .line 21
    new-instance v7, Ljava/io/FileInputStream;

    .line 22
    .line 23
    invoke-direct {v7, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v6, v7}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    :try_start_1
    iget-object v7, p0, Lio/sentry/cache/c;->b:Lio/sentry/util/g;

    .line 30
    .line 31
    invoke-virtual {v7}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    check-cast v7, Lio/sentry/i1;

    .line 36
    .line 37
    invoke-interface {v7, v6}, Lio/sentry/i1;->c(Ljava/io/BufferedInputStream;)Lio/sentry/internal/debugmeta/c;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    .line 44
    :try_start_2
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :catch_0
    move-exception v6

    .line 49
    goto :goto_2

    .line 50
    :catchall_0
    move-exception v7

    .line 51
    :try_start_3
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_1
    move-exception v6

    .line 56
    :try_start_4
    invoke-virtual {v7, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    :goto_1
    throw v7
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 60
    :goto_2
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    sget-object v8, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 65
    .line 66
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    new-instance v9, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string v10, "Error while reading cached envelope from file "

    .line 73
    .line 74
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-interface {v7, v8, v5, v6}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :catch_1
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    sget-object v7, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 93
    .line 94
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    const-string v8, "Envelope file \'%s\' disappeared while converting all cached files to envelopes."

    .line 103
    .line 104
    invoke-interface {v6, v7, v8, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0
.end method

.method public final w1(Lio/sentry/internal/debugmeta/c;)V
    .locals 2

    .line 1
    const-string v0, "Envelope is required."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lio/sentry/cache/c;->b(Lio/sentry/internal/debugmeta/c;)Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object p0, p0, Lio/sentry/cache/c;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object v0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v1, "Discarding envelope from cache: %s"

    .line 33
    .line 34
    invoke-interface {p0, v0, v1, p1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sget-object v0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const-string v1, "Envelope was not cached or could not be deleted: %s"

    .line 53
    .line 54
    invoke-interface {p0, v0, v1, p1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

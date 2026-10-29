.class public final Lih3;
.super Lwg3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final U:J

.field public V:Ljava/util/List;

.field public W:Ljava/lang/String;

.field public X:I

.field public Y:Ljava/lang/String;

.field public Z:Ljava/lang/String;

.field public a0:J

.field public b0:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I

.field public f:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public v:J

.field public final w:J


# direct methods
.method public constructor <init>(Lij3;JJ)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lwg3;-><init>(Lij3;)V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lih3;->a0:J

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lih3;->b0:Ljava/lang/String;

    .line 10
    .line 11
    iput-wide p2, p0, Lih3;->w:J

    .line 12
    .line 13
    iput-wide p4, p0, Lih3;->U:J

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final C()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final D(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzr;
    .locals 46

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Leg3;->y()V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzr;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    invoke-virtual {v1}, Lih3;->F()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    move-object v4, v3

    .line 14
    invoke-virtual {v1}, Lih3;->G()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v1}, Lwg3;->A()V

    .line 19
    .line 20
    .line 21
    move-object v5, v4

    .line 22
    iget-object v4, v1, Lih3;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v1}, Lwg3;->A()V

    .line 25
    .line 26
    .line 27
    iget v0, v1, Lih3;->e:I

    .line 28
    .line 29
    int-to-long v6, v0

    .line 30
    invoke-virtual {v1}, Lwg3;->A()V

    .line 31
    .line 32
    .line 33
    iget-object v0, v1, Lih3;->f:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object v8, v5

    .line 39
    move-wide v5, v6

    .line 40
    iget-object v7, v1, Lih3;->f:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v0, v1, Lsq3;->a:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v9, v0

    .line 45
    check-cast v9, Lij3;

    .line 46
    .line 47
    iget-object v0, v9, Lij3;->d:Lpd3;

    .line 48
    .line 49
    iget-object v10, v9, Lij3;->f:Luh3;

    .line 50
    .line 51
    iget-object v11, v9, Lij3;->d:Lpd3;

    .line 52
    .line 53
    iget-object v12, v9, Lij3;->a:Landroid/content/Context;

    .line 54
    .line 55
    iget-object v13, v9, Lij3;->w:Lup3;

    .line 56
    .line 57
    iget-object v14, v9, Lij3;->e:Lki3;

    .line 58
    .line 59
    invoke-virtual {v0}, Lpd3;->E()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Lwg3;->A()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Leg3;->y()V

    .line 66
    .line 67
    .line 68
    move-object v15, v2

    .line 69
    move-object/from16 v16, v3

    .line 70
    .line 71
    iget-wide v2, v1, Lih3;->v:J

    .line 72
    .line 73
    const-wide/16 v17, 0x0

    .line 74
    .line 75
    cmp-long v0, v2, v17

    .line 76
    .line 77
    move-wide/from16 v19, v2

    .line 78
    .line 79
    if-nez v0, :cond_4

    .line 80
    .line 81
    invoke-static {v13}, Lij3;->j(Lsq3;)V

    .line 82
    .line 83
    .line 84
    iget-object v0, v13, Lsq3;->a:Ljava/lang/Object;

    .line 85
    .line 86
    move-object v3, v0

    .line 87
    check-cast v3, Lij3;

    .line 88
    .line 89
    invoke-virtual {v12}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v13}, Lsq3;->y()V

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, Lkb1;->k(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v12}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 100
    .line 101
    .line 102
    move-result-object v19

    .line 103
    const/16 v21, 0x0

    .line 104
    .line 105
    invoke-static {}, Lup3;->Q()Ljava/security/MessageDigest;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const-wide/16 v22, -0x1

    .line 110
    .line 111
    if-nez v2, :cond_0

    .line 112
    .line 113
    iget-object v0, v3, Lij3;->f:Luh3;

    .line 114
    .line 115
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 116
    .line 117
    .line 118
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 119
    .line 120
    const-string v2, "Could not get MD5 instance"

    .line 121
    .line 122
    invoke-virtual {v0, v2}, Lsh3;->a(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    move-object/from16 v24, v4

    .line 126
    .line 127
    move-wide/from16 v25, v5

    .line 128
    .line 129
    :goto_0
    move-wide/from16 v2, v22

    .line 130
    .line 131
    goto/16 :goto_4

    .line 132
    .line 133
    :cond_0
    if-eqz v19, :cond_3

    .line 134
    .line 135
    :try_start_0
    invoke-virtual {v13, v12, v0}, Lup3;->c0(Landroid/content/Context;Ljava/lang/String;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-nez v0, :cond_2

    .line 140
    .line 141
    invoke-static {v12}, Lg93;->a(Landroid/content/Context;)Lv30;

    .line 142
    .line 143
    .line 144
    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 145
    move-object/from16 v24, v4

    .line 146
    .line 147
    :try_start_1
    iget-object v4, v3, Lij3;->a:Landroid/content/Context;

    .line 148
    .line 149
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v4
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 153
    move-wide/from16 v25, v5

    .line 154
    .line 155
    const/16 v5, 0x40

    .line 156
    .line 157
    :try_start_2
    invoke-virtual {v0, v5, v4}, Lv30;->c(ILjava/lang/String;)Landroid/content/pm/PackageInfo;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 162
    .line 163
    if-eqz v0, :cond_1

    .line 164
    .line 165
    array-length v4, v0

    .line 166
    if-lez v4, :cond_1

    .line 167
    .line 168
    aget-object v0, v0, v21

    .line 169
    .line 170
    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0}, Lup3;->R([B)J

    .line 179
    .line 180
    .line 181
    move-result-wide v22

    .line 182
    goto :goto_0

    .line 183
    :catch_0
    move-exception v0

    .line 184
    goto :goto_2

    .line 185
    :cond_1
    iget-object v0, v3, Lij3;->f:Luh3;

    .line 186
    .line 187
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 188
    .line 189
    .line 190
    iget-object v0, v0, Luh3;->w:Lsh3;

    .line 191
    .line 192
    const-string v2, "Could not get signatures"

    .line 193
    .line 194
    invoke-virtual {v0, v2}, Lsh3;->a(Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    .line 195
    .line 196
    .line 197
    goto :goto_0

    .line 198
    :catch_1
    move-exception v0

    .line 199
    :goto_1
    move-wide/from16 v25, v5

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :catch_2
    move-exception v0

    .line 203
    move-object/from16 v24, v4

    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_2
    move-object/from16 v24, v4

    .line 207
    .line 208
    move-wide/from16 v25, v5

    .line 209
    .line 210
    move-wide/from16 v22, v17

    .line 211
    .line 212
    goto :goto_0

    .line 213
    :goto_2
    iget-object v2, v3, Lij3;->f:Luh3;

    .line 214
    .line 215
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 216
    .line 217
    .line 218
    iget-object v2, v2, Luh3;->f:Lsh3;

    .line 219
    .line 220
    const-string v3, "Package name not found"

    .line 221
    .line 222
    invoke-virtual {v2, v0, v3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    :goto_3
    move-wide/from16 v2, v17

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_3
    move-object/from16 v24, v4

    .line 229
    .line 230
    move-wide/from16 v25, v5

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :goto_4
    iput-wide v2, v1, Lih3;->v:J

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_4
    move-object/from16 v24, v4

    .line 237
    .line 238
    move-wide/from16 v25, v5

    .line 239
    .line 240
    const/16 v21, 0x0

    .line 241
    .line 242
    move-wide/from16 v2, v19

    .line 243
    .line 244
    :goto_5
    invoke-virtual {v9}, Lij3;->d()Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    invoke-static {v14}, Lij3;->j(Lsq3;)V

    .line 249
    .line 250
    .line 251
    iget-boolean v4, v14, Lki3;->c0:Z

    .line 252
    .line 253
    const/4 v5, 0x1

    .line 254
    xor-int/2addr v4, v5

    .line 255
    invoke-virtual {v1}, Leg3;->y()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v9}, Lij3;->d()Z

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    const/4 v5, 0x0

    .line 263
    if-nez v6, :cond_5

    .line 264
    .line 265
    :goto_6
    move/from16 v23, v0

    .line 266
    .line 267
    move-object v12, v5

    .line 268
    goto :goto_8

    .line 269
    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzrg;->zza()Z

    .line 270
    .line 271
    .line 272
    sget-object v6, Lvg3;->H0:Lug3;

    .line 273
    .line 274
    invoke-virtual {v11, v5, v6}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    if-eqz v6, :cond_6

    .line 279
    .line 280
    invoke-static {v10}, Lij3;->l(Lhk3;)V

    .line 281
    .line 282
    .line 283
    iget-object v6, v10, Luh3;->Y:Lsh3;

    .line 284
    .line 285
    const-string v10, "Disabled IID for tests."

    .line 286
    .line 287
    invoke-virtual {v6, v10}, Lsh3;->a(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    goto :goto_6

    .line 291
    :cond_6
    :try_start_3
    invoke-virtual {v12}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    const-string v5, "com.google.firebase.analytics.FirebaseAnalytics"

    .line 296
    .line 297
    invoke-virtual {v6, v5}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    move-result-object v5
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_3

    .line 301
    if-nez v5, :cond_7

    .line 302
    .line 303
    :catch_3
    move/from16 v23, v0

    .line 304
    .line 305
    :goto_7
    const/4 v12, 0x0

    .line 306
    goto :goto_8

    .line 307
    :cond_7
    :try_start_4
    const-string v6, "getInstance"

    .line 308
    .line 309
    const-class v22, Landroid/content/Context;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5

    .line 310
    .line 311
    move/from16 v23, v0

    .line 312
    .line 313
    :try_start_5
    filled-new-array/range {v22 .. v22}, [Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-virtual {v5, v6, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    const/4 v12, 0x0

    .line 326
    invoke-virtual {v0, v12, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6

    .line 330
    if-nez v0, :cond_8

    .line 331
    .line 332
    goto :goto_8

    .line 333
    :cond_8
    :try_start_6
    const-string v6, "getFirebaseInstanceId"

    .line 334
    .line 335
    invoke-virtual {v5, v6, v12}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 336
    .line 337
    .line 338
    move-result-object v5

    .line 339
    invoke-virtual {v5, v0, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    check-cast v0, Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 344
    .line 345
    move-object v12, v0

    .line 346
    goto :goto_8

    .line 347
    :catch_4
    invoke-static {v10}, Lij3;->l(Lhk3;)V

    .line 348
    .line 349
    .line 350
    iget-object v0, v10, Luh3;->V:Lsh3;

    .line 351
    .line 352
    const-string v5, "Failed to retrieve Firebase Instance Id"

    .line 353
    .line 354
    invoke-virtual {v0, v5}, Lsh3;->a(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    goto :goto_7

    .line 358
    :catch_5
    move/from16 v23, v0

    .line 359
    .line 360
    :catch_6
    invoke-static {v10}, Lij3;->l(Lhk3;)V

    .line 361
    .line 362
    .line 363
    iget-object v0, v10, Luh3;->U:Lsh3;

    .line 364
    .line 365
    const-string v5, "Failed to obtain Firebase Analytics instance"

    .line 366
    .line 367
    invoke-virtual {v0, v5}, Lsh3;->a(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    goto :goto_7

    .line 371
    :goto_8
    invoke-static {v14}, Lij3;->j(Lsq3;)V

    .line 372
    .line 373
    .line 374
    iget-object v0, v14, Lki3;->f:Lio/sentry/android/core/s;

    .line 375
    .line 376
    invoke-virtual {v0}, Lio/sentry/android/core/s;->a()J

    .line 377
    .line 378
    .line 379
    move-result-wide v5

    .line 380
    cmp-long v0, v5, v17

    .line 381
    .line 382
    move-wide/from16 v27, v2

    .line 383
    .line 384
    iget-wide v2, v9, Lij3;->o0:J

    .line 385
    .line 386
    if-nez v0, :cond_9

    .line 387
    .line 388
    goto :goto_9

    .line 389
    :cond_9
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 390
    .line 391
    .line 392
    move-result-wide v2

    .line 393
    :goto_9
    invoke-virtual {v1}, Lwg3;->A()V

    .line 394
    .line 395
    .line 396
    iget v0, v1, Lih3;->X:I

    .line 397
    .line 398
    const-string v5, "google_analytics_adid_collection_enabled"

    .line 399
    .line 400
    invoke-virtual {v11, v5}, Lpd3;->L(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 401
    .line 402
    .line 403
    move-result-object v5

    .line 404
    if-eqz v5, :cond_b

    .line 405
    .line 406
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 407
    .line 408
    .line 409
    move-result v5

    .line 410
    if-eqz v5, :cond_a

    .line 411
    .line 412
    goto :goto_a

    .line 413
    :cond_a
    move/from16 v5, v21

    .line 414
    .line 415
    goto :goto_b

    .line 416
    :cond_b
    :goto_a
    const/4 v5, 0x1

    .line 417
    :goto_b
    invoke-static {v14}, Lij3;->j(Lsq3;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v14}, Lsq3;->y()V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v14}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 424
    .line 425
    .line 426
    move-result-object v6

    .line 427
    const-string v10, "deferred_analytics_collection"

    .line 428
    .line 429
    move-wide/from16 v29, v2

    .line 430
    .line 431
    move/from16 v2, v21

    .line 432
    .line 433
    invoke-interface {v6, v10, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 434
    .line 435
    .line 436
    move-result v3

    .line 437
    const-string v2, "google_analytics_default_allow_ad_personalization_signals"

    .line 438
    .line 439
    const/4 v6, 0x1

    .line 440
    invoke-virtual {v11, v2, v6}, Lpd3;->O(Ljava/lang/String;Z)Llk3;

    .line 441
    .line 442
    .line 443
    move-result-object v10

    .line 444
    sget-object v6, Llk3;->e:Llk3;

    .line 445
    .line 446
    if-eq v10, v6, :cond_c

    .line 447
    .line 448
    const/4 v6, 0x1

    .line 449
    goto :goto_c

    .line 450
    :cond_c
    const/4 v6, 0x0

    .line 451
    :goto_c
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 452
    .line 453
    .line 454
    move-result-object v6

    .line 455
    iget-object v10, v1, Lih3;->V:Ljava/util/List;

    .line 456
    .line 457
    invoke-virtual {v14}, Lki3;->G()Lok3;

    .line 458
    .line 459
    .line 460
    move-result-object v22

    .line 461
    invoke-virtual/range {v22 .. v22}, Lok3;->g()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v22

    .line 465
    move/from16 v31, v0

    .line 466
    .line 467
    iget-object v0, v1, Lih3;->W:Ljava/lang/String;

    .line 468
    .line 469
    if-nez v0, :cond_d

    .line 470
    .line 471
    invoke-static {v13}, Lij3;->j(Lsq3;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v13}, Lup3;->r0()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    iput-object v0, v1, Lih3;->W:Ljava/lang/String;

    .line 479
    .line 480
    :cond_d
    iget-object v0, v1, Lih3;->W:Ljava/lang/String;

    .line 481
    .line 482
    move-object/from16 v32, v0

    .line 483
    .line 484
    invoke-virtual {v14}, Lki3;->G()Lok3;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    move/from16 v33, v3

    .line 489
    .line 490
    sget-object v3, Lnk3;->c:Lnk3;

    .line 491
    .line 492
    invoke-virtual {v0, v3}, Lok3;->i(Lnk3;)Z

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    if-nez v0, :cond_e

    .line 497
    .line 498
    move/from16 v34, v4

    .line 499
    .line 500
    const/4 v0, 0x0

    .line 501
    goto :goto_e

    .line 502
    :cond_e
    invoke-virtual {v1}, Leg3;->y()V

    .line 503
    .line 504
    .line 505
    move v0, v4

    .line 506
    iget-wide v3, v1, Lih3;->a0:J

    .line 507
    .line 508
    cmp-long v3, v3, v17

    .line 509
    .line 510
    if-nez v3, :cond_f

    .line 511
    .line 512
    move/from16 v34, v0

    .line 513
    .line 514
    goto :goto_d

    .line 515
    :cond_f
    iget-object v3, v9, Lij3;->V:Lxt0;

    .line 516
    .line 517
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 521
    .line 522
    .line 523
    move-result-wide v3

    .line 524
    move-wide/from16 v34, v3

    .line 525
    .line 526
    iget-wide v3, v1, Lih3;->a0:J

    .line 527
    .line 528
    sub-long v3, v34, v3

    .line 529
    .line 530
    move/from16 v34, v0

    .line 531
    .line 532
    iget-object v0, v1, Lih3;->Z:Ljava/lang/String;

    .line 533
    .line 534
    if-eqz v0, :cond_10

    .line 535
    .line 536
    const-wide/32 v35, 0x5265c00

    .line 537
    .line 538
    .line 539
    cmp-long v0, v3, v35

    .line 540
    .line 541
    if-lez v0, :cond_10

    .line 542
    .line 543
    iget-object v0, v1, Lih3;->b0:Ljava/lang/String;

    .line 544
    .line 545
    if-nez v0, :cond_10

    .line 546
    .line 547
    invoke-virtual {v1}, Lih3;->E()V

    .line 548
    .line 549
    .line 550
    :cond_10
    :goto_d
    iget-object v0, v1, Lih3;->Z:Ljava/lang/String;

    .line 551
    .line 552
    if-nez v0, :cond_11

    .line 553
    .line 554
    invoke-virtual {v1}, Lih3;->E()V

    .line 555
    .line 556
    .line 557
    :cond_11
    iget-object v0, v1, Lih3;->Z:Ljava/lang/String;

    .line 558
    .line 559
    :goto_e
    const-string v3, "google_analytics_sgtm_upload_enabled"

    .line 560
    .line 561
    invoke-virtual {v11, v3}, Lpd3;->L(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    if-nez v3, :cond_12

    .line 566
    .line 567
    const/4 v3, 0x0

    .line 568
    goto :goto_f

    .line 569
    :cond_12
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 570
    .line 571
    .line 572
    move-result v3

    .line 573
    :goto_f
    invoke-static {v13}, Lij3;->j(Lsq3;)V

    .line 574
    .line 575
    .line 576
    iget-object v4, v13, Lsq3;->a:Ljava/lang/Object;

    .line 577
    .line 578
    check-cast v4, Lij3;

    .line 579
    .line 580
    move-object/from16 v35, v0

    .line 581
    .line 582
    invoke-virtual {v1}, Lih3;->F()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    move/from16 v36, v3

    .line 587
    .line 588
    iget-object v3, v4, Lij3;->a:Landroid/content/Context;

    .line 589
    .line 590
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 591
    .line 592
    .line 593
    move-result-object v3

    .line 594
    if-nez v3, :cond_13

    .line 595
    .line 596
    move/from16 v37, v5

    .line 597
    .line 598
    move-wide/from16 v3, v17

    .line 599
    .line 600
    const/4 v5, 0x0

    .line 601
    goto :goto_12

    .line 602
    :cond_13
    :try_start_7
    iget-object v3, v4, Lij3;->a:Landroid/content/Context;

    .line 603
    .line 604
    invoke-static {v3}, Lg93;->a(Landroid/content/Context;)Lv30;

    .line 605
    .line 606
    .line 607
    move-result-object v3
    :try_end_7
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_7 .. :try_end_7} :catch_7

    .line 608
    move/from16 v37, v5

    .line 609
    .line 610
    const/4 v5, 0x0

    .line 611
    :try_start_8
    invoke-virtual {v3, v5, v0}, Lv30;->b(ILjava/lang/String;)Landroid/content/pm/ApplicationInfo;

    .line 612
    .line 613
    .line 614
    move-result-object v3

    .line 615
    if-eqz v3, :cond_14

    .line 616
    .line 617
    iget v0, v3, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    :try_end_8
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_8 .. :try_end_8} :catch_8

    .line 618
    .line 619
    goto :goto_11

    .line 620
    :cond_14
    :goto_10
    move v0, v5

    .line 621
    goto :goto_11

    .line 622
    :catch_7
    move/from16 v37, v5

    .line 623
    .line 624
    const/4 v5, 0x0

    .line 625
    :catch_8
    iget-object v3, v4, Lij3;->f:Luh3;

    .line 626
    .line 627
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 628
    .line 629
    .line 630
    iget-object v3, v3, Luh3;->W:Lsh3;

    .line 631
    .line 632
    const-string v4, "PackageManager failed to find running app: app_id"

    .line 633
    .line 634
    invoke-virtual {v3, v0, v4}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    goto :goto_10

    .line 638
    :goto_11
    int-to-long v3, v0

    .line 639
    :goto_12
    invoke-static {v14}, Lij3;->j(Lsq3;)V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v14}, Lki3;->G()Lok3;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    iget v0, v0, Lok3;->b:I

    .line 647
    .line 648
    invoke-static {v14}, Lij3;->j(Lsq3;)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v14}, Lsq3;->y()V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v14}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 655
    .line 656
    .line 657
    move-result-object v14

    .line 658
    const-string v5, "dma_consent_settings"

    .line 659
    .line 660
    move/from16 v38, v0

    .line 661
    .line 662
    const/4 v0, 0x0

    .line 663
    invoke-interface {v14, v5, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v5

    .line 667
    invoke-static {v5}, Lce3;->b(Ljava/lang/String;)Lce3;

    .line 668
    .line 669
    .line 670
    move-result-object v5

    .line 671
    iget-object v5, v5, Lce3;->b:Ljava/lang/String;

    .line 672
    .line 673
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzql;->zza()Z

    .line 674
    .line 675
    .line 676
    sget-object v14, Lvg3;->Q0:Lug3;

    .line 677
    .line 678
    invoke-virtual {v11, v0, v14}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 679
    .line 680
    .line 681
    move-result v39

    .line 682
    if-eqz v39, :cond_15

    .line 683
    .line 684
    invoke-static {v13}, Lij3;->j(Lsq3;)V

    .line 685
    .line 686
    .line 687
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 688
    .line 689
    move-wide/from16 v39, v3

    .line 690
    .line 691
    const/16 v3, 0x1e

    .line 692
    .line 693
    if-lt v0, v3, :cond_16

    .line 694
    .line 695
    invoke-static {}, Lk83;->o()I

    .line 696
    .line 697
    .line 698
    move-result v0

    .line 699
    const/4 v3, 0x3

    .line 700
    if-le v0, v3, :cond_16

    .line 701
    .line 702
    invoke-static {}, Lw0;->v()I

    .line 703
    .line 704
    .line 705
    move-result v0

    .line 706
    goto :goto_13

    .line 707
    :cond_15
    move-wide/from16 v39, v3

    .line 708
    .line 709
    :cond_16
    const/4 v0, 0x0

    .line 710
    :goto_13
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzql;->zza()Z

    .line 711
    .line 712
    .line 713
    const/4 v3, 0x0

    .line 714
    invoke-virtual {v11, v3, v14}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 715
    .line 716
    .line 717
    move-result v3

    .line 718
    if-eqz v3, :cond_17

    .line 719
    .line 720
    invoke-static {v13}, Lij3;->j(Lsq3;)V

    .line 721
    .line 722
    .line 723
    invoke-virtual {v13}, Lup3;->U()J

    .line 724
    .line 725
    .line 726
    move-result-wide v17

    .line 727
    :cond_17
    iget-object v3, v11, Lpd3;->c:Ljava/lang/String;

    .line 728
    .line 729
    const/4 v4, 0x1

    .line 730
    invoke-virtual {v11, v2, v4}, Lpd3;->O(Ljava/lang/String;Z)Llk3;

    .line 731
    .line 732
    .line 733
    move-result-object v2

    .line 734
    invoke-static {v2}, Lok3;->h(Llk3;)C

    .line 735
    .line 736
    .line 737
    move-result v2

    .line 738
    invoke-static {v2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v2

    .line 742
    iget-wide v13, v9, Lij3;->o0:J

    .line 743
    .line 744
    iget-object v4, v9, Lij3;->f0:Lxl3;

    .line 745
    .line 746
    invoke-static {v4}, Lij3;->i(Leg3;)V

    .line 747
    .line 748
    .line 749
    iget-object v4, v9, Lij3;->f0:Lxl3;

    .line 750
    .line 751
    invoke-virtual {v4}, Lxl3;->E()Lcom/google/android/gms/internal/measurement/zzin;

    .line 752
    .line 753
    .line 754
    move-result-object v4

    .line 755
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzin;->zza()I

    .line 756
    .line 757
    .line 758
    move-result v4

    .line 759
    move-object v11, v8

    .line 760
    iget-wide v8, v1, Lih3;->w:J

    .line 761
    .line 762
    move-object/from16 v21, v6

    .line 763
    .line 764
    move-object v1, v11

    .line 765
    move/from16 v20, v33

    .line 766
    .line 767
    move/from16 v19, v37

    .line 768
    .line 769
    move/from16 v33, v0

    .line 770
    .line 771
    move-object/from16 v37, v2

    .line 772
    .line 773
    move-object v2, v15

    .line 774
    move-object v15, v12

    .line 775
    move-object/from16 v12, p1

    .line 776
    .line 777
    move/from16 v41, v36

    .line 778
    .line 779
    move-object/from16 v36, v3

    .line 780
    .line 781
    move-object/from16 v3, v16

    .line 782
    .line 783
    move-wide/from16 v42, v39

    .line 784
    .line 785
    move/from16 v40, v4

    .line 786
    .line 787
    move-object/from16 v4, v24

    .line 788
    .line 789
    move-object/from16 v24, v10

    .line 790
    .line 791
    move-wide/from16 v10, v27

    .line 792
    .line 793
    move-object/from16 v27, v35

    .line 794
    .line 795
    move/from16 v28, v41

    .line 796
    .line 797
    move-object/from16 v41, v32

    .line 798
    .line 799
    move-object/from16 v32, v5

    .line 800
    .line 801
    move-wide/from16 v5, v25

    .line 802
    .line 803
    move-object/from16 v26, v41

    .line 804
    .line 805
    move-object/from16 v25, v22

    .line 806
    .line 807
    move-wide/from16 v44, v13

    .line 808
    .line 809
    move/from16 v13, v23

    .line 810
    .line 811
    move-wide/from16 v22, v8

    .line 812
    .line 813
    move/from16 v14, v34

    .line 814
    .line 815
    const-wide/32 v8, 0x1fbd0

    .line 816
    .line 817
    .line 818
    move-wide/from16 v34, v17

    .line 819
    .line 820
    move-wide/from16 v16, v29

    .line 821
    .line 822
    move/from16 v18, v31

    .line 823
    .line 824
    move/from16 v31, v38

    .line 825
    .line 826
    move-wide/from16 v29, v42

    .line 827
    .line 828
    move-wide/from16 v38, v44

    .line 829
    .line 830
    invoke-direct/range {v1 .. v40}, Lcom/google/android/gms/measurement/internal/zzr;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JIZZLjava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;JI)V

    .line 831
    .line 832
    .line 833
    return-object v1
.end method

.method public final E()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Leg3;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lij3;

    .line 7
    .line 8
    iget-object v1, v0, Lij3;->e:Lki3;

    .line 9
    .line 10
    iget-object v2, v0, Lij3;->f:Luh3;

    .line 11
    .line 12
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lki3;->G()Lok3;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sget-object v3, Lnk3;->c:Lnk3;

    .line 20
    .line 21
    invoke-virtual {v1, v3}, Lok3;->i(Lnk3;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, v2, Luh3;->X:Lsh3;

    .line 31
    .line 32
    const-string v3, "Analytics Storage consent is not granted"

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/16 v1, 0x10

    .line 40
    .line 41
    new-array v1, v1, [B

    .line 42
    .line 43
    iget-object v3, v0, Lij3;->w:Lup3;

    .line 44
    .line 45
    invoke-static {v3}, Lij3;->j(Lsq3;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Lup3;->w0()Ljava/security/SecureRandom;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 53
    .line 54
    .line 55
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 56
    .line 57
    new-instance v4, Ljava/math/BigInteger;

    .line 58
    .line 59
    const/4 v5, 0x1

    .line 60
    invoke-direct {v4, v5, v1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 61
    .line 62
    .line 63
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const-string v4, "%032x"

    .line 68
    .line 69
    invoke-static {v3, v4, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    :goto_0
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 74
    .line 75
    .line 76
    iget-object v2, v2, Luh3;->X:Lsh3;

    .line 77
    .line 78
    if-nez v1, :cond_1

    .line 79
    .line 80
    const-string v3, "null"

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    const-string v3, "not null"

    .line 84
    .line 85
    :goto_1
    const-string v4, "Resetting session stitching token to "

    .line 86
    .line 87
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v2, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iput-object v1, p0, Lih3;->Z:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v0, v0, Lij3;->V:Lxt0;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 102
    .line 103
    .line 104
    move-result-wide v0

    .line 105
    iput-wide v0, p0, Lih3;->a0:J

    .line 106
    .line 107
    return-void
.end method

.method public final F()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwg3;->A()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lih3;->c:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lih3;->c:Ljava/lang/String;

    .line 10
    .line 11
    return-object p0
.end method

.method public final G()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Leg3;->y()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lwg3;->A()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lih3;->Y:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lih3;->Y:Ljava/lang/String;

    .line 13
    .line 14
    return-object p0
.end method

.class public final Ldp0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 17
    iput p1, p0, Ldp0;->a:I

    iput-object p2, p0, Ldp0;->b:Ljava/lang/Object;

    iput-object p3, p0, Ldp0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 16
    iput p3, p0, Ldp0;->a:I

    iput-object p1, p0, Ldp0;->c:Ljava/lang/Object;

    iput-object p2, p0, Ldp0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lsl3;Lcom/google/android/gms/internal/measurement/zzcu;)V
    .locals 1

    .line 1
    const/16 v0, 0x1c

    .line 2
    .line 3
    iput v0, p0, Ldp0;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Ldp0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ldp0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lx92;)V
    .locals 1

    const/16 v0, 0x14

    iput v0, p0, Ldp0;->a:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldp0;->c:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldp0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v3, v1

    .line 6
    check-cast v3, Lij3;

    .line 7
    .line 8
    iget-object v0, v0, Ldp0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lsk3;

    .line 11
    .line 12
    iget-object v1, v3, Lij3;->i:Lbj3;

    .line 13
    .line 14
    iget-object v8, v3, Lij3;->f:Luh3;

    .line 15
    .line 16
    iget-object v9, v3, Lij3;->e:Lki3;

    .line 17
    .line 18
    iget-object v10, v3, Lij3;->w:Lup3;

    .line 19
    .line 20
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lbj3;->y()V

    .line 24
    .line 25
    .line 26
    iget-object v1, v3, Lij3;->d:Lpd3;

    .line 27
    .line 28
    iget-object v2, v1, Lsq3;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Lij3;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v2, Lme3;

    .line 36
    .line 37
    invoke-direct {v2, v3}, Lhk3;-><init>(Lij3;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Lhk3;->C()V

    .line 41
    .line 42
    .line 43
    iput-object v2, v3, Lij3;->d0:Lme3;

    .line 44
    .line 45
    iget-object v11, v0, Lsk3;->d:Lcom/google/android/gms/internal/measurement/zzdd;

    .line 46
    .line 47
    const-wide/16 v12, 0x0

    .line 48
    .line 49
    if-nez v11, :cond_0

    .line 50
    .line 51
    move-wide v6, v12

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-wide v4, v11, Lcom/google/android/gms/internal/measurement/zzdd;->zza:J

    .line 54
    .line 55
    move-wide v6, v4

    .line 56
    :goto_0
    new-instance v2, Lih3;

    .line 57
    .line 58
    iget-wide v4, v0, Lsk3;->c:J

    .line 59
    .line 60
    invoke-direct/range {v2 .. v7}, Lih3;-><init>(Lij3;JJ)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Lwg3;->B()V

    .line 64
    .line 65
    .line 66
    iput-object v2, v3, Lij3;->e0:Lih3;

    .line 67
    .line 68
    new-instance v0, Llh3;

    .line 69
    .line 70
    invoke-direct {v0, v3}, Llh3;-><init>(Lij3;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lwg3;->B()V

    .line 74
    .line 75
    .line 76
    iput-object v0, v3, Lij3;->b0:Llh3;

    .line 77
    .line 78
    new-instance v0, Lpn3;

    .line 79
    .line 80
    invoke-direct {v0, v3}, Lpn3;-><init>(Lij3;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Lwg3;->B()V

    .line 84
    .line 85
    .line 86
    iput-object v0, v3, Lij3;->c0:Lpn3;

    .line 87
    .line 88
    iget-boolean v0, v10, Lhk3;->b:Z

    .line 89
    .line 90
    iget-object v4, v10, Lsq3;->a:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v4, Lij3;

    .line 93
    .line 94
    const-string v5, "Can\'t initialize twice"

    .line 95
    .line 96
    if-nez v0, :cond_47

    .line 97
    .line 98
    invoke-virtual {v10}, Lsq3;->y()V

    .line 99
    .line 100
    .line 101
    new-instance v0, Ljava/security/SecureRandom;

    .line 102
    .line 103
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    .line 107
    .line 108
    .line 109
    move-result-wide v6

    .line 110
    cmp-long v14, v6, v12

    .line 111
    .line 112
    if-nez v14, :cond_1

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    .line 115
    .line 116
    .line 117
    move-result-wide v6

    .line 118
    cmp-long v0, v6, v12

    .line 119
    .line 120
    if-nez v0, :cond_1

    .line 121
    .line 122
    iget-object v0, v10, Lsq3;->a:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Lij3;

    .line 125
    .line 126
    iget-object v0, v0, Lij3;->f:Luh3;

    .line 127
    .line 128
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 129
    .line 130
    .line 131
    iget-object v0, v0, Luh3;->w:Lsh3;

    .line 132
    .line 133
    const-string v14, "Utils falling back to Random for random id"

    .line 134
    .line 135
    invoke-virtual {v0, v14}, Lsh3;->a(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :cond_1
    iget-object v0, v10, Lup3;->d:Ljava/util/concurrent/atomic/AtomicLong;

    .line 139
    .line 140
    invoke-virtual {v0, v6, v7}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 141
    .line 142
    .line 143
    iget-object v0, v4, Lij3;->n0:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 146
    .line 147
    .line 148
    const/4 v6, 0x1

    .line 149
    iput-boolean v6, v10, Lhk3;->b:Z

    .line 150
    .line 151
    iget-boolean v0, v9, Lhk3;->b:Z

    .line 152
    .line 153
    if-nez v0, :cond_46

    .line 154
    .line 155
    iget-object v0, v9, Lsq3;->a:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Lij3;

    .line 158
    .line 159
    iget-object v0, v0, Lij3;->a:Landroid/content/Context;

    .line 160
    .line 161
    const-string v7, "com.google.android.gms.measurement.prefs"

    .line 162
    .line 163
    const/4 v14, 0x0

    .line 164
    invoke-virtual {v0, v7, v14}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    iput-object v0, v9, Lki3;->c:Landroid/content/SharedPreferences;

    .line 169
    .line 170
    const-string v7, "has_been_opened"

    .line 171
    .line 172
    invoke-interface {v0, v7, v14}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    iput-boolean v0, v9, Lki3;->c0:Z

    .line 177
    .line 178
    if-nez v0, :cond_2

    .line 179
    .line 180
    iget-object v0, v9, Lki3;->c:Landroid/content/SharedPreferences;

    .line 181
    .line 182
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-interface {v0, v7, v6}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 187
    .line 188
    .line 189
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 190
    .line 191
    .line 192
    :cond_2
    new-instance v0, Lji3;

    .line 193
    .line 194
    sget-object v7, Lvg3;->d:Lug3;

    .line 195
    .line 196
    const/4 v15, 0x0

    .line 197
    invoke-virtual {v7, v15}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    check-cast v7, Ljava/lang/Long;

    .line 202
    .line 203
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 204
    .line 205
    .line 206
    move-result-wide v14

    .line 207
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 208
    .line 209
    .line 210
    move-result-wide v14

    .line 211
    invoke-direct {v0, v9, v14, v15}, Lji3;-><init>(Lki3;J)V

    .line 212
    .line 213
    .line 214
    iput-object v0, v9, Lki3;->e:Lji3;

    .line 215
    .line 216
    iget-object v0, v9, Lsq3;->a:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, Lij3;

    .line 219
    .line 220
    iget-object v0, v0, Lij3;->n0:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 223
    .line 224
    .line 225
    iput-boolean v6, v9, Lhk3;->b:Z

    .line 226
    .line 227
    iget-object v7, v3, Lij3;->e0:Lih3;

    .line 228
    .line 229
    iget-boolean v0, v7, Lwg3;->b:Z

    .line 230
    .line 231
    if-nez v0, :cond_45

    .line 232
    .line 233
    iget-object v0, v7, Lsq3;->a:Ljava/lang/Object;

    .line 234
    .line 235
    move-object v14, v0

    .line 236
    check-cast v14, Lij3;

    .line 237
    .line 238
    iget-object v0, v14, Lij3;->f:Luh3;

    .line 239
    .line 240
    iget-object v15, v14, Lij3;->f:Luh3;

    .line 241
    .line 242
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 243
    .line 244
    .line 245
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 246
    .line 247
    iget-wide v12, v7, Lih3;->U:J

    .line 248
    .line 249
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 250
    .line 251
    .line 252
    move-result-object v12

    .line 253
    move-object v13, v4

    .line 254
    move-object/from16 v18, v5

    .line 255
    .line 256
    iget-wide v4, v7, Lih3;->w:J

    .line 257
    .line 258
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    const-string v5, "sdkVersion bundled with app, dynamiteVersion"

    .line 263
    .line 264
    invoke-virtual {v0, v12, v5, v4}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    iget-object v4, v14, Lij3;->a:Landroid/content/Context;

    .line 268
    .line 269
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 274
    .line 275
    .line 276
    move-result-object v12

    .line 277
    const-string v0, ""

    .line 278
    .line 279
    const/high16 v19, -0x80000000

    .line 280
    .line 281
    const-string v20, "Unknown"

    .line 282
    .line 283
    const-string v21, "unknown"

    .line 284
    .line 285
    if-nez v12, :cond_4

    .line 286
    .line 287
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 288
    .line 289
    .line 290
    iget-object v6, v15, Luh3;->f:Lsh3;

    .line 291
    .line 292
    move-object/from16 v22, v2

    .line 293
    .line 294
    invoke-static {v5}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    move-object/from16 v23, v13

    .line 299
    .line 300
    const-string v13, "PackageManager is null, app identity information might be inaccurate. appId"

    .line 301
    .line 302
    invoke-virtual {v6, v2, v13}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    :cond_3
    move-object/from16 v24, v12

    .line 306
    .line 307
    move/from16 v2, v19

    .line 308
    .line 309
    move-object/from16 v6, v20

    .line 310
    .line 311
    move-object v13, v6

    .line 312
    :goto_1
    move-object/from16 v12, v21

    .line 313
    .line 314
    goto/16 :goto_7

    .line 315
    .line 316
    :cond_4
    move-object/from16 v22, v2

    .line 317
    .line 318
    move-object/from16 v23, v13

    .line 319
    .line 320
    :try_start_0
    invoke-virtual {v12, v5}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v21
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 324
    :goto_2
    move-object/from16 v2, v21

    .line 325
    .line 326
    goto :goto_3

    .line 327
    :catch_0
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 328
    .line 329
    .line 330
    iget-object v2, v15, Luh3;->f:Lsh3;

    .line 331
    .line 332
    invoke-static {v5}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 333
    .line 334
    .line 335
    move-result-object v6

    .line 336
    const-string v13, "Error retrieving app installer package name. appId"

    .line 337
    .line 338
    invoke-virtual {v2, v6, v13}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    goto :goto_2

    .line 342
    :goto_3
    if-nez v2, :cond_6

    .line 343
    .line 344
    const-string v2, "manual_install"

    .line 345
    .line 346
    :cond_5
    move-object/from16 v21, v2

    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_6
    const-string v6, "com.android.vending"

    .line 350
    .line 351
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v6

    .line 355
    if-eqz v6, :cond_5

    .line 356
    .line 357
    move-object/from16 v21, v0

    .line 358
    .line 359
    :goto_4
    :try_start_1
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    const/4 v6, 0x0

    .line 364
    invoke-virtual {v12, v2, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    if-eqz v2, :cond_3

    .line 369
    .line 370
    iget-object v6, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 371
    .line 372
    invoke-virtual {v12, v6}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    .line 373
    .line 374
    .line 375
    move-result-object v6

    .line 376
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 377
    .line 378
    .line 379
    move-result v13

    .line 380
    if-nez v13, :cond_7

    .line 381
    .line 382
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v6
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    .line 386
    goto :goto_5

    .line 387
    :cond_7
    move-object/from16 v6, v20

    .line 388
    .line 389
    :goto_5
    :try_start_2
    iget-object v13, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_3

    .line 390
    .line 391
    :try_start_3
    iget v2, v2, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_1

    .line 392
    .line 393
    move-object/from16 v24, v12

    .line 394
    .line 395
    goto :goto_1

    .line 396
    :catch_1
    move-object/from16 v20, v13

    .line 397
    .line 398
    goto :goto_6

    .line 399
    :catch_2
    move-object/from16 v6, v20

    .line 400
    .line 401
    :catch_3
    :goto_6
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 402
    .line 403
    .line 404
    iget-object v2, v15, Luh3;->f:Lsh3;

    .line 405
    .line 406
    invoke-static {v5}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 407
    .line 408
    .line 409
    move-result-object v13

    .line 410
    move-object/from16 v24, v12

    .line 411
    .line 412
    const-string v12, "Error retrieving package info. appId, appName"

    .line 413
    .line 414
    invoke-virtual {v2, v13, v12, v6}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    move/from16 v2, v19

    .line 418
    .line 419
    move-object/from16 v13, v20

    .line 420
    .line 421
    goto :goto_1

    .line 422
    :goto_7
    iput-object v5, v7, Lih3;->c:Ljava/lang/String;

    .line 423
    .line 424
    iput-object v12, v7, Lih3;->f:Ljava/lang/String;

    .line 425
    .line 426
    iput-object v13, v7, Lih3;->d:Ljava/lang/String;

    .line 427
    .line 428
    iput v2, v7, Lih3;->e:I

    .line 429
    .line 430
    iput-object v6, v7, Lih3;->i:Ljava/lang/String;

    .line 431
    .line 432
    const-wide/16 v12, 0x0

    .line 433
    .line 434
    iput-wide v12, v7, Lih3;->v:J

    .line 435
    .line 436
    invoke-virtual {v14}, Lij3;->g()I

    .line 437
    .line 438
    .line 439
    move-result v2

    .line 440
    if-eqz v2, :cond_e

    .line 441
    .line 442
    const/4 v6, 0x1

    .line 443
    if-eq v2, v6, :cond_d

    .line 444
    .line 445
    const/4 v6, 0x3

    .line 446
    if-eq v2, v6, :cond_c

    .line 447
    .line 448
    const/4 v6, 0x4

    .line 449
    if-eq v2, v6, :cond_b

    .line 450
    .line 451
    const/4 v6, 0x6

    .line 452
    if-eq v2, v6, :cond_a

    .line 453
    .line 454
    const/4 v6, 0x7

    .line 455
    if-eq v2, v6, :cond_9

    .line 456
    .line 457
    const/16 v6, 0x8

    .line 458
    .line 459
    if-eq v2, v6, :cond_8

    .line 460
    .line 461
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 462
    .line 463
    .line 464
    iget-object v6, v15, Luh3;->W:Lsh3;

    .line 465
    .line 466
    const-string v12, "App measurement disabled"

    .line 467
    .line 468
    invoke-virtual {v6, v12}, Lsh3;->a(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 472
    .line 473
    .line 474
    iget-object v6, v15, Luh3;->i:Lsh3;

    .line 475
    .line 476
    const-string v12, "Invalid scion state in identity"

    .line 477
    .line 478
    invoke-virtual {v6, v12}, Lsh3;->a(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    goto :goto_8

    .line 482
    :cond_8
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 483
    .line 484
    .line 485
    iget-object v6, v15, Luh3;->W:Lsh3;

    .line 486
    .line 487
    const-string v12, "App measurement disabled due to denied storage consent"

    .line 488
    .line 489
    invoke-virtual {v6, v12}, Lsh3;->a(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    goto :goto_8

    .line 493
    :cond_9
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 494
    .line 495
    .line 496
    iget-object v6, v15, Luh3;->W:Lsh3;

    .line 497
    .line 498
    const-string v12, "App measurement disabled via the global data collection setting"

    .line 499
    .line 500
    invoke-virtual {v6, v12}, Lsh3;->a(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    goto :goto_8

    .line 504
    :cond_a
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 505
    .line 506
    .line 507
    iget-object v6, v15, Luh3;->V:Lsh3;

    .line 508
    .line 509
    const-string v12, "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"

    .line 510
    .line 511
    invoke-virtual {v6, v12}, Lsh3;->a(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    goto :goto_8

    .line 515
    :cond_b
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 516
    .line 517
    .line 518
    iget-object v6, v15, Luh3;->W:Lsh3;

    .line 519
    .line 520
    const-string v12, "App measurement disabled via the manifest"

    .line 521
    .line 522
    invoke-virtual {v6, v12}, Lsh3;->a(Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    goto :goto_8

    .line 526
    :cond_c
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 527
    .line 528
    .line 529
    iget-object v6, v15, Luh3;->W:Lsh3;

    .line 530
    .line 531
    const-string v12, "App measurement disabled by setAnalyticsCollectionEnabled(false)"

    .line 532
    .line 533
    invoke-virtual {v6, v12}, Lsh3;->a(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    goto :goto_8

    .line 537
    :cond_d
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 538
    .line 539
    .line 540
    iget-object v6, v15, Luh3;->W:Lsh3;

    .line 541
    .line 542
    const-string v12, "App measurement deactivated via the manifest"

    .line 543
    .line 544
    invoke-virtual {v6, v12}, Lsh3;->a(Ljava/lang/String;)V

    .line 545
    .line 546
    .line 547
    goto :goto_8

    .line 548
    :cond_e
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 549
    .line 550
    .line 551
    iget-object v6, v15, Luh3;->Y:Lsh3;

    .line 552
    .line 553
    const-string v12, "App measurement collection enabled"

    .line 554
    .line 555
    invoke-virtual {v6, v12}, Lsh3;->a(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    :goto_8
    iput-object v0, v7, Lih3;->Y:Ljava/lang/String;

    .line 559
    .line 560
    :try_start_4
    iget-object v6, v14, Lij3;->a0:Ljava/lang/String;

    .line 561
    .line 562
    invoke-static {v4, v6}, Lqj3;->S(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v6

    .line 566
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 567
    .line 568
    .line 569
    move-result v12

    .line 570
    if-eqz v12, :cond_f

    .line 571
    .line 572
    goto :goto_9

    .line 573
    :cond_f
    move-object v0, v6

    .line 574
    :goto_9
    iput-object v0, v7, Lih3;->Y:Ljava/lang/String;

    .line 575
    .line 576
    if-nez v2, :cond_10

    .line 577
    .line 578
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 579
    .line 580
    .line 581
    iget-object v0, v15, Luh3;->Y:Lsh3;

    .line 582
    .line 583
    const-string v2, "App measurement enabled for app package, google app id"

    .line 584
    .line 585
    iget-object v6, v7, Lih3;->c:Ljava/lang/String;

    .line 586
    .line 587
    iget-object v12, v7, Lih3;->Y:Ljava/lang/String;

    .line 588
    .line 589
    invoke-virtual {v0, v6, v2, v12}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_4

    .line 590
    .line 591
    .line 592
    :cond_10
    :goto_a
    const/4 v2, 0x0

    .line 593
    goto :goto_b

    .line 594
    :catch_4
    move-exception v0

    .line 595
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 596
    .line 597
    .line 598
    iget-object v2, v15, Luh3;->f:Lsh3;

    .line 599
    .line 600
    invoke-static {v5}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 601
    .line 602
    .line 603
    move-result-object v5

    .line 604
    const-string v6, "Fetching Google App Id failed with exception. appId"

    .line 605
    .line 606
    invoke-virtual {v2, v5, v6, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 607
    .line 608
    .line 609
    goto :goto_a

    .line 610
    :goto_b
    iput-object v2, v7, Lih3;->V:Ljava/util/List;

    .line 611
    .line 612
    iget-object v0, v14, Lij3;->d:Lpd3;

    .line 613
    .line 614
    iget-object v2, v0, Lsq3;->a:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v2, Lij3;

    .line 617
    .line 618
    const-string v5, "analytics.safelisted_events"

    .line 619
    .line 620
    invoke-static {v5}, Lkb1;->k(Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v0}, Lpd3;->K()Landroid/os/Bundle;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    if-nez v0, :cond_11

    .line 628
    .line 629
    iget-object v0, v2, Lij3;->f:Luh3;

    .line 630
    .line 631
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 632
    .line 633
    .line 634
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 635
    .line 636
    const-string v5, "Failed to load metadata: Metadata bundle is null"

    .line 637
    .line 638
    invoke-virtual {v0, v5}, Lsh3;->a(Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    :goto_c
    const/4 v0, 0x0

    .line 642
    goto :goto_d

    .line 643
    :cond_11
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 644
    .line 645
    .line 646
    move-result v6

    .line 647
    if-nez v6, :cond_12

    .line 648
    .line 649
    goto :goto_c

    .line 650
    :cond_12
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 651
    .line 652
    .line 653
    move-result v0

    .line 654
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    :goto_d
    if-eqz v0, :cond_13

    .line 659
    .line 660
    :try_start_5
    iget-object v5, v2, Lij3;->a:Landroid/content/Context;

    .line 661
    .line 662
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 663
    .line 664
    .line 665
    move-result-object v5

    .line 666
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 667
    .line 668
    .line 669
    move-result v0

    .line 670
    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    if-nez v0, :cond_14

    .line 675
    .line 676
    :cond_13
    :goto_e
    const/4 v0, 0x0

    .line 677
    goto :goto_f

    .line 678
    :cond_14
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 679
    .line 680
    .line 681
    move-result-object v0
    :try_end_5
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_5 .. :try_end_5} :catch_5

    .line 682
    goto :goto_f

    .line 683
    :catch_5
    move-exception v0

    .line 684
    iget-object v2, v2, Lij3;->f:Luh3;

    .line 685
    .line 686
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 687
    .line 688
    .line 689
    iget-object v2, v2, Luh3;->f:Lsh3;

    .line 690
    .line 691
    const-string v5, "Failed to load string array from metadata: resource not found"

    .line 692
    .line 693
    invoke-virtual {v2, v0, v5}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 694
    .line 695
    .line 696
    goto :goto_e

    .line 697
    :goto_f
    if-nez v0, :cond_15

    .line 698
    .line 699
    goto :goto_10

    .line 700
    :cond_15
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 701
    .line 702
    .line 703
    move-result v2

    .line 704
    if-eqz v2, :cond_16

    .line 705
    .line 706
    invoke-static {v15}, Lij3;->l(Lhk3;)V

    .line 707
    .line 708
    .line 709
    iget-object v0, v15, Luh3;->V:Lsh3;

    .line 710
    .line 711
    const-string v2, "Safelisted event list is empty. Ignoring"

    .line 712
    .line 713
    invoke-virtual {v0, v2}, Lsh3;->a(Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    goto :goto_11

    .line 717
    :cond_16
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 718
    .line 719
    .line 720
    move-result-object v2

    .line 721
    :cond_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 722
    .line 723
    .line 724
    move-result v5

    .line 725
    if-eqz v5, :cond_18

    .line 726
    .line 727
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v5

    .line 731
    check-cast v5, Ljava/lang/String;

    .line 732
    .line 733
    iget-object v6, v14, Lij3;->w:Lup3;

    .line 734
    .line 735
    invoke-static {v6}, Lij3;->j(Lsq3;)V

    .line 736
    .line 737
    .line 738
    const-string v12, "safelisted event"

    .line 739
    .line 740
    invoke-virtual {v6, v12, v5}, Lup3;->A0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 741
    .line 742
    .line 743
    move-result v5

    .line 744
    if-nez v5, :cond_17

    .line 745
    .line 746
    goto :goto_11

    .line 747
    :cond_18
    :goto_10
    iput-object v0, v7, Lih3;->V:Ljava/util/List;

    .line 748
    .line 749
    :goto_11
    if-eqz v24, :cond_19

    .line 750
    .line 751
    invoke-static {v4}, Lpy0;->p0(Landroid/content/Context;)Z

    .line 752
    .line 753
    .line 754
    move-result v0

    .line 755
    iput v0, v7, Lih3;->X:I

    .line 756
    .line 757
    goto :goto_12

    .line 758
    :cond_19
    const/4 v6, 0x0

    .line 759
    iput v6, v7, Lih3;->X:I

    .line 760
    .line 761
    :goto_12
    iget-object v0, v7, Lsq3;->a:Ljava/lang/Object;

    .line 762
    .line 763
    check-cast v0, Lij3;

    .line 764
    .line 765
    iget-object v0, v0, Lij3;->n0:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 766
    .line 767
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 768
    .line 769
    .line 770
    const/4 v6, 0x1

    .line 771
    iput-boolean v6, v7, Lwg3;->b:Z

    .line 772
    .line 773
    new-instance v0, Lxl3;

    .line 774
    .line 775
    invoke-direct {v0, v3}, Lwg3;-><init>(Lij3;)V

    .line 776
    .line 777
    .line 778
    invoke-virtual {v0}, Lwg3;->B()V

    .line 779
    .line 780
    .line 781
    iput-object v0, v3, Lij3;->f0:Lxl3;

    .line 782
    .line 783
    iget-boolean v2, v0, Lwg3;->b:Z

    .line 784
    .line 785
    if-nez v2, :cond_44

    .line 786
    .line 787
    iget-object v2, v0, Lsq3;->a:Ljava/lang/Object;

    .line 788
    .line 789
    check-cast v2, Lij3;

    .line 790
    .line 791
    iget-object v2, v2, Lij3;->a:Landroid/content/Context;

    .line 792
    .line 793
    const-string v4, "jobscheduler"

    .line 794
    .line 795
    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v2

    .line 799
    check-cast v2, Landroid/app/job/JobScheduler;

    .line 800
    .line 801
    iput-object v2, v0, Lxl3;->c:Landroid/app/job/JobScheduler;

    .line 802
    .line 803
    iget-object v2, v0, Lsq3;->a:Ljava/lang/Object;

    .line 804
    .line 805
    check-cast v2, Lij3;

    .line 806
    .line 807
    iget-object v2, v2, Lij3;->n0:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 808
    .line 809
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 810
    .line 811
    .line 812
    const/4 v6, 0x1

    .line 813
    iput-boolean v6, v0, Lwg3;->b:Z

    .line 814
    .line 815
    invoke-static {v8}, Lij3;->l(Lhk3;)V

    .line 816
    .line 817
    .line 818
    iget-object v0, v8, Luh3;->X:Lsh3;

    .line 819
    .line 820
    iget-object v2, v8, Luh3;->W:Lsh3;

    .line 821
    .line 822
    iget-object v4, v8, Luh3;->Y:Lsh3;

    .line 823
    .line 824
    iget-object v5, v8, Luh3;->f:Lsh3;

    .line 825
    .line 826
    invoke-virtual {v1}, Lpd3;->E()V

    .line 827
    .line 828
    .line 829
    const-wide/32 v6, 0x1fbd0

    .line 830
    .line 831
    .line 832
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 833
    .line 834
    .line 835
    move-result-object v6

    .line 836
    const-string v7, "App measurement initialized, version"

    .line 837
    .line 838
    invoke-virtual {v2, v6, v7}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 839
    .line 840
    .line 841
    invoke-static {v8}, Lij3;->l(Lhk3;)V

    .line 842
    .line 843
    .line 844
    const-string v6, "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"

    .line 845
    .line 846
    invoke-virtual {v2, v6}, Lsh3;->a(Ljava/lang/String;)V

    .line 847
    .line 848
    .line 849
    invoke-virtual/range {v22 .. v22}, Lih3;->F()Ljava/lang/String;

    .line 850
    .line 851
    .line 852
    move-result-object v6

    .line 853
    iget-object v7, v1, Lpd3;->c:Ljava/lang/String;

    .line 854
    .line 855
    invoke-virtual {v10, v6, v7}, Lup3;->Z(Ljava/lang/String;Ljava/lang/String;)Z

    .line 856
    .line 857
    .line 858
    move-result v7

    .line 859
    if-eqz v7, :cond_1a

    .line 860
    .line 861
    invoke-static {v8}, Lij3;->l(Lhk3;)V

    .line 862
    .line 863
    .line 864
    const-string v6, "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."

    .line 865
    .line 866
    invoke-virtual {v2, v6}, Lsh3;->a(Ljava/lang/String;)V

    .line 867
    .line 868
    .line 869
    goto :goto_13

    .line 870
    :cond_1a
    invoke-static {v8}, Lij3;->l(Lhk3;)V

    .line 871
    .line 872
    .line 873
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v6

    .line 877
    const-string v7, "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "

    .line 878
    .line 879
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 880
    .line 881
    .line 882
    move-result-object v6

    .line 883
    invoke-virtual {v2, v6}, Lsh3;->a(Ljava/lang/String;)V

    .line 884
    .line 885
    .line 886
    :goto_13
    invoke-static {v8}, Lij3;->l(Lhk3;)V

    .line 887
    .line 888
    .line 889
    const-string v6, "Debug-level message logging enabled"

    .line 890
    .line 891
    invoke-virtual {v0, v6}, Lsh3;->a(Ljava/lang/String;)V

    .line 892
    .line 893
    .line 894
    iget v6, v3, Lij3;->l0:I

    .line 895
    .line 896
    iget-object v7, v3, Lij3;->n0:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 897
    .line 898
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 899
    .line 900
    .line 901
    move-result v12

    .line 902
    if-eq v6, v12, :cond_1b

    .line 903
    .line 904
    invoke-static {v8}, Lij3;->l(Lhk3;)V

    .line 905
    .line 906
    .line 907
    iget v6, v3, Lij3;->l0:I

    .line 908
    .line 909
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 910
    .line 911
    .line 912
    move-result-object v6

    .line 913
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 914
    .line 915
    .line 916
    move-result v7

    .line 917
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 918
    .line 919
    .line 920
    move-result-object v7

    .line 921
    const-string v12, "Not all components initialized"

    .line 922
    .line 923
    invoke-virtual {v5, v6, v12, v7}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 924
    .line 925
    .line 926
    :cond_1b
    const/4 v6, 0x1

    .line 927
    iput-boolean v6, v3, Lij3;->g0:Z

    .line 928
    .line 929
    iget-wide v6, v3, Lij3;->o0:J

    .line 930
    .line 931
    iget-object v12, v3, Lij3;->X:Lsl3;

    .line 932
    .line 933
    iget-object v13, v3, Lij3;->i:Lbj3;

    .line 934
    .line 935
    invoke-static {v13}, Lij3;->l(Lhk3;)V

    .line 936
    .line 937
    .line 938
    invoke-virtual {v13}, Lbj3;->y()V

    .line 939
    .line 940
    .line 941
    iget-object v13, v3, Lij3;->f0:Lxl3;

    .line 942
    .line 943
    invoke-static {v13}, Lij3;->i(Leg3;)V

    .line 944
    .line 945
    .line 946
    iget-object v13, v3, Lij3;->f0:Lxl3;

    .line 947
    .line 948
    invoke-virtual {v13}, Lxl3;->E()Lcom/google/android/gms/internal/measurement/zzin;

    .line 949
    .line 950
    .line 951
    move-result-object v13

    .line 952
    sget-object v14, Lcom/google/android/gms/internal/measurement/zzin;->zzb:Lcom/google/android/gms/internal/measurement/zzin;

    .line 953
    .line 954
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzql;->zza()Z

    .line 955
    .line 956
    .line 957
    sget-object v15, Lvg3;->Q0:Lug3;

    .line 958
    .line 959
    move-object/from16 v19, v8

    .line 960
    .line 961
    const/4 v8, 0x0

    .line 962
    invoke-virtual {v1, v8, v15}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 963
    .line 964
    .line 965
    move-result v15

    .line 966
    if-ne v13, v14, :cond_1c

    .line 967
    .line 968
    const/4 v8, 0x1

    .line 969
    goto :goto_14

    .line 970
    :cond_1c
    const/4 v8, 0x0

    .line 971
    :goto_14
    const-wide/16 v20, 0x1

    .line 972
    .line 973
    if-eqz v15, :cond_1d

    .line 974
    .line 975
    invoke-virtual {v10}, Lsq3;->y()V

    .line 976
    .line 977
    .line 978
    invoke-virtual {v10}, Lup3;->U()J

    .line 979
    .line 980
    .line 981
    move-result-wide v14

    .line 982
    cmp-long v14, v14, v20

    .line 983
    .line 984
    if-nez v14, :cond_1d

    .line 985
    .line 986
    goto :goto_15

    .line 987
    :cond_1d
    if-eqz v8, :cond_1e

    .line 988
    .line 989
    const/4 v8, 0x1

    .line 990
    :goto_15
    invoke-virtual {v10}, Lsq3;->y()V

    .line 991
    .line 992
    .line 993
    new-instance v14, Landroid/content/IntentFilter;

    .line 994
    .line 995
    invoke-direct {v14}, Landroid/content/IntentFilter;-><init>()V

    .line 996
    .line 997
    .line 998
    const-string v15, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    .line 999
    .line 1000
    invoke-virtual {v14, v15}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1001
    .line 1002
    .line 1003
    const-string v15, "com.google.android.gms.measurement.BATCHES_AVAILABLE"

    .line 1004
    .line 1005
    invoke-virtual {v14, v15}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1006
    .line 1007
    .line 1008
    new-instance v15, Lcom/google/android/gms/measurement/internal/zzw;

    .line 1009
    .line 1010
    move-object/from16 v13, v23

    .line 1011
    .line 1012
    invoke-direct {v15, v13}, Lcom/google/android/gms/measurement/internal/zzw;-><init>(Lij3;)V

    .line 1013
    .line 1014
    .line 1015
    move/from16 v22, v8

    .line 1016
    .line 1017
    iget-object v8, v13, Lij3;->a:Landroid/content/Context;

    .line 1018
    .line 1019
    move-object/from16 v23, v2

    .line 1020
    .line 1021
    const/4 v2, 0x2

    .line 1022
    invoke-static {v8, v15, v14, v2}, Lv00;->registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 1023
    .line 1024
    .line 1025
    iget-object v2, v13, Lij3;->f:Luh3;

    .line 1026
    .line 1027
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 1028
    .line 1029
    .line 1030
    iget-object v2, v2, Luh3;->X:Lsh3;

    .line 1031
    .line 1032
    const-string v8, "Registered app receiver"

    .line 1033
    .line 1034
    invoke-virtual {v2, v8}, Lsh3;->a(Ljava/lang/String;)V

    .line 1035
    .line 1036
    .line 1037
    if-eqz v22, :cond_1f

    .line 1038
    .line 1039
    iget-object v2, v3, Lij3;->f0:Lxl3;

    .line 1040
    .line 1041
    invoke-static {v2}, Lij3;->i(Leg3;)V

    .line 1042
    .line 1043
    .line 1044
    iget-object v2, v3, Lij3;->f0:Lxl3;

    .line 1045
    .line 1046
    sget-object v8, Lvg3;->C:Lug3;

    .line 1047
    .line 1048
    const/4 v14, 0x0

    .line 1049
    invoke-virtual {v8, v14}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v8

    .line 1053
    check-cast v8, Ljava/lang/Long;

    .line 1054
    .line 1055
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 1056
    .line 1057
    .line 1058
    move-result-wide v14

    .line 1059
    invoke-virtual {v2, v14, v15}, Lxl3;->D(J)V

    .line 1060
    .line 1061
    .line 1062
    goto :goto_16

    .line 1063
    :cond_1e
    move-object/from16 v13, v23

    .line 1064
    .line 1065
    move-object/from16 v23, v2

    .line 1066
    .line 1067
    :cond_1f
    :goto_16
    iget-object v2, v9, Lki3;->i:Ltj;

    .line 1068
    .line 1069
    invoke-virtual {v9}, Lki3;->G()Lok3;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v8

    .line 1073
    iget v14, v8, Lok3;->b:I

    .line 1074
    .line 1075
    const-string v15, "google_analytics_default_allow_ad_storage"

    .line 1076
    .line 1077
    move-object/from16 v22, v8

    .line 1078
    .line 1079
    const/4 v8, 0x0

    .line 1080
    invoke-virtual {v1, v15, v8}, Lpd3;->O(Ljava/lang/String;Z)Llk3;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v15

    .line 1084
    move-object/from16 v24, v13

    .line 1085
    .line 1086
    const-string v13, "google_analytics_default_allow_analytics_storage"

    .line 1087
    .line 1088
    invoke-virtual {v1, v13, v8}, Lpd3;->O(Ljava/lang/String;Z)Llk3;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v13

    .line 1092
    sget-object v8, Llk3;->b:Llk3;

    .line 1093
    .line 1094
    move-object/from16 v25, v2

    .line 1095
    .line 1096
    sget-object v2, Lnk3;->c:Lnk3;

    .line 1097
    .line 1098
    move-object/from16 v26, v3

    .line 1099
    .line 1100
    const-class v3, Lnk3;

    .line 1101
    .line 1102
    move-object/from16 v27, v5

    .line 1103
    .line 1104
    if-ne v15, v8, :cond_21

    .line 1105
    .line 1106
    if-eq v13, v8, :cond_20

    .line 1107
    .line 1108
    goto :goto_17

    .line 1109
    :cond_20
    move-wide/from16 v29, v6

    .line 1110
    .line 1111
    move-object/from16 v28, v10

    .line 1112
    .line 1113
    goto :goto_18

    .line 1114
    :cond_21
    :goto_17
    invoke-virtual {v9}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v5

    .line 1118
    move-object/from16 v28, v10

    .line 1119
    .line 1120
    const-string v10, "consent_source"

    .line 1121
    .line 1122
    move-wide/from16 v29, v6

    .line 1123
    .line 1124
    const/16 v6, 0x64

    .line 1125
    .line 1126
    invoke-interface {v5, v10, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1127
    .line 1128
    .line 1129
    move-result v5

    .line 1130
    const/16 v6, -0xa

    .line 1131
    .line 1132
    invoke-static {v6, v5}, Lok3;->l(II)Z

    .line 1133
    .line 1134
    .line 1135
    move-result v5

    .line 1136
    if-eqz v5, :cond_22

    .line 1137
    .line 1138
    new-instance v5, Ljava/util/EnumMap;

    .line 1139
    .line 1140
    invoke-direct {v5, v3}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 1141
    .line 1142
    .line 1143
    sget-object v7, Lnk3;->b:Lnk3;

    .line 1144
    .line 1145
    invoke-virtual {v5, v7, v15}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v5, v2, v13}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1149
    .line 1150
    .line 1151
    new-instance v7, Lok3;

    .line 1152
    .line 1153
    invoke-direct {v7, v5, v6}, Lok3;-><init>(Ljava/util/EnumMap;I)V

    .line 1154
    .line 1155
    .line 1156
    goto :goto_1b

    .line 1157
    :cond_22
    :goto_18
    invoke-virtual/range {v26 .. v26}, Lij3;->q()Lih3;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v5

    .line 1161
    invoke-virtual {v5}, Lih3;->G()Ljava/lang/String;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v5

    .line 1165
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1166
    .line 1167
    .line 1168
    move-result v5

    .line 1169
    if-nez v5, :cond_23

    .line 1170
    .line 1171
    if-eqz v14, :cond_24

    .line 1172
    .line 1173
    const/16 v5, 0x1e

    .line 1174
    .line 1175
    if-eq v14, v5, :cond_24

    .line 1176
    .line 1177
    const/16 v5, 0xa

    .line 1178
    .line 1179
    if-eq v14, v5, :cond_24

    .line 1180
    .line 1181
    const/16 v5, 0x28

    .line 1182
    .line 1183
    if-ne v14, v5, :cond_23

    .line 1184
    .line 1185
    goto :goto_1a

    .line 1186
    :cond_23
    :goto_19
    const/4 v7, 0x0

    .line 1187
    goto :goto_1b

    .line 1188
    :cond_24
    :goto_1a
    invoke-static {v12}, Lij3;->k(Lwg3;)V

    .line 1189
    .line 1190
    .line 1191
    new-instance v5, Lok3;

    .line 1192
    .line 1193
    const/16 v6, -0xa

    .line 1194
    .line 1195
    invoke-direct {v5, v6}, Lok3;-><init>(I)V

    .line 1196
    .line 1197
    .line 1198
    const/4 v6, 0x0

    .line 1199
    invoke-virtual {v12, v5, v6}, Lsl3;->U(Lok3;Z)V

    .line 1200
    .line 1201
    .line 1202
    goto :goto_19

    .line 1203
    :goto_1b
    if-eqz v7, :cond_25

    .line 1204
    .line 1205
    invoke-static {v12}, Lij3;->k(Lwg3;)V

    .line 1206
    .line 1207
    .line 1208
    const/4 v6, 0x1

    .line 1209
    invoke-virtual {v12, v7, v6}, Lsl3;->U(Lok3;Z)V

    .line 1210
    .line 1211
    .line 1212
    goto :goto_1c

    .line 1213
    :cond_25
    move-object/from16 v7, v22

    .line 1214
    .line 1215
    :goto_1c
    invoke-static {v12}, Lij3;->k(Lwg3;)V

    .line 1216
    .line 1217
    .line 1218
    iget-object v5, v12, Lsq3;->a:Ljava/lang/Object;

    .line 1219
    .line 1220
    check-cast v5, Lij3;

    .line 1221
    .line 1222
    invoke-virtual {v12, v7}, Lsl3;->D(Lok3;)V

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual {v9}, Lsq3;->y()V

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v9}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v6

    .line 1232
    const-string v7, "dma_consent_settings"

    .line 1233
    .line 1234
    const/4 v14, 0x0

    .line 1235
    invoke-interface {v6, v7, v14}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v6

    .line 1239
    invoke-static {v6}, Lce3;->b(Ljava/lang/String;)Lce3;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v6

    .line 1243
    iget v6, v6, Lce3;->a:I

    .line 1244
    .line 1245
    const-string v7, "google_analytics_default_allow_ad_personalization_signals"

    .line 1246
    .line 1247
    const/4 v10, 0x1

    .line 1248
    invoke-virtual {v1, v7, v10}, Lpd3;->O(Ljava/lang/String;Z)Llk3;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v7

    .line 1252
    if-eq v7, v8, :cond_26

    .line 1253
    .line 1254
    invoke-static/range {v19 .. v19}, Lij3;->l(Lhk3;)V

    .line 1255
    .line 1256
    .line 1257
    const-string v13, "Default ad personalization consent from Manifest"

    .line 1258
    .line 1259
    invoke-virtual {v4, v7, v13}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1260
    .line 1261
    .line 1262
    :cond_26
    const-string v7, "google_analytics_default_allow_ad_user_data"

    .line 1263
    .line 1264
    invoke-virtual {v1, v7, v10}, Lpd3;->O(Ljava/lang/String;Z)Llk3;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v7

    .line 1268
    if-eq v7, v8, :cond_27

    .line 1269
    .line 1270
    const/16 v13, -0xa

    .line 1271
    .line 1272
    invoke-static {v13, v6}, Lok3;->l(II)Z

    .line 1273
    .line 1274
    .line 1275
    move-result v14

    .line 1276
    if-eqz v14, :cond_27

    .line 1277
    .line 1278
    invoke-static {v12}, Lij3;->k(Lwg3;)V

    .line 1279
    .line 1280
    .line 1281
    new-instance v6, Ljava/util/EnumMap;

    .line 1282
    .line 1283
    invoke-direct {v6, v3}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 1284
    .line 1285
    .line 1286
    sget-object v3, Lnk3;->d:Lnk3;

    .line 1287
    .line 1288
    invoke-virtual {v6, v3, v7}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1289
    .line 1290
    .line 1291
    new-instance v3, Lce3;

    .line 1292
    .line 1293
    const/4 v14, 0x0

    .line 1294
    invoke-direct {v3, v6, v13, v14, v14}, Lce3;-><init>(Ljava/util/EnumMap;ILjava/lang/Boolean;Ljava/lang/String;)V

    .line 1295
    .line 1296
    .line 1297
    invoke-virtual {v12, v3, v10}, Lsl3;->T(Lce3;Z)V

    .line 1298
    .line 1299
    .line 1300
    goto :goto_1d

    .line 1301
    :cond_27
    invoke-virtual/range {v26 .. v26}, Lij3;->q()Lih3;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v3

    .line 1305
    invoke-virtual {v3}, Lih3;->G()Ljava/lang/String;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v3

    .line 1309
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1310
    .line 1311
    .line 1312
    move-result v3

    .line 1313
    if-nez v3, :cond_29

    .line 1314
    .line 1315
    if-eqz v6, :cond_28

    .line 1316
    .line 1317
    const/16 v3, 0x1e

    .line 1318
    .line 1319
    if-ne v6, v3, :cond_29

    .line 1320
    .line 1321
    :cond_28
    invoke-static {v12}, Lij3;->k(Lwg3;)V

    .line 1322
    .line 1323
    .line 1324
    new-instance v3, Lce3;

    .line 1325
    .line 1326
    const/16 v6, -0xa

    .line 1327
    .line 1328
    const/4 v14, 0x0

    .line 1329
    invoke-direct {v3, v14, v6, v14, v14}, Lce3;-><init>(Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;)V

    .line 1330
    .line 1331
    .line 1332
    const/4 v6, 0x1

    .line 1333
    invoke-virtual {v12, v3, v6}, Lsl3;->T(Lce3;Z)V

    .line 1334
    .line 1335
    .line 1336
    goto :goto_1d

    .line 1337
    :cond_29
    invoke-virtual/range {v26 .. v26}, Lij3;->q()Lih3;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v3

    .line 1341
    invoke-virtual {v3}, Lih3;->G()Ljava/lang/String;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v3

    .line 1345
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1346
    .line 1347
    .line 1348
    move-result v3

    .line 1349
    if-eqz v3, :cond_2b

    .line 1350
    .line 1351
    if-eqz v11, :cond_2b

    .line 1352
    .line 1353
    iget-object v3, v11, Lcom/google/android/gms/internal/measurement/zzdd;->zzd:Landroid/os/Bundle;

    .line 1354
    .line 1355
    if-eqz v3, :cond_2b

    .line 1356
    .line 1357
    const/16 v7, 0x1e

    .line 1358
    .line 1359
    invoke-static {v7, v6}, Lok3;->l(II)Z

    .line 1360
    .line 1361
    .line 1362
    move-result v6

    .line 1363
    if-eqz v6, :cond_2b

    .line 1364
    .line 1365
    invoke-static {v7, v3}, Lce3;->c(ILandroid/os/Bundle;)Lce3;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v3

    .line 1369
    iget-object v6, v3, Lce3;->e:Ljava/util/EnumMap;

    .line 1370
    .line 1371
    invoke-virtual {v6}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v6

    .line 1375
    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v6

    .line 1379
    :cond_2a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1380
    .line 1381
    .line 1382
    move-result v7

    .line 1383
    if-eqz v7, :cond_2b

    .line 1384
    .line 1385
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v7

    .line 1389
    check-cast v7, Llk3;

    .line 1390
    .line 1391
    if-eq v7, v8, :cond_2a

    .line 1392
    .line 1393
    invoke-static {v12}, Lij3;->k(Lwg3;)V

    .line 1394
    .line 1395
    .line 1396
    const/4 v6, 0x1

    .line 1397
    invoke-virtual {v12, v3, v6}, Lsl3;->T(Lce3;Z)V

    .line 1398
    .line 1399
    .line 1400
    :cond_2b
    :goto_1d
    const-string v3, "google_analytics_tcf_data_enabled"

    .line 1401
    .line 1402
    invoke-virtual {v1, v3}, Lpd3;->L(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v3

    .line 1406
    if-eqz v3, :cond_2c

    .line 1407
    .line 1408
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1409
    .line 1410
    .line 1411
    move-result v3

    .line 1412
    if-eqz v3, :cond_2e

    .line 1413
    .line 1414
    :cond_2c
    invoke-static/range {v19 .. v19}, Lij3;->l(Lhk3;)V

    .line 1415
    .line 1416
    .line 1417
    const-string v3, "TCF client enabled."

    .line 1418
    .line 1419
    invoke-virtual {v0, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 1420
    .line 1421
    .line 1422
    invoke-static {v12}, Lij3;->k(Lwg3;)V

    .line 1423
    .line 1424
    .line 1425
    invoke-virtual {v12}, Leg3;->y()V

    .line 1426
    .line 1427
    .line 1428
    iget-object v0, v5, Lij3;->f:Luh3;

    .line 1429
    .line 1430
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 1431
    .line 1432
    .line 1433
    iget-object v0, v0, Luh3;->X:Lsh3;

    .line 1434
    .line 1435
    const-string v3, "Register tcfPrefChangeListener."

    .line 1436
    .line 1437
    invoke-virtual {v0, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 1438
    .line 1439
    .line 1440
    iget-object v0, v12, Lsl3;->f0:Lrl3;

    .line 1441
    .line 1442
    if-nez v0, :cond_2d

    .line 1443
    .line 1444
    new-instance v0, Lwk3;

    .line 1445
    .line 1446
    const/4 v3, 0x2

    .line 1447
    invoke-direct {v0, v12, v5, v3}, Lwk3;-><init>(Lsl3;Ljk3;I)V

    .line 1448
    .line 1449
    .line 1450
    iput-object v0, v12, Lsl3;->g0:Lwk3;

    .line 1451
    .line 1452
    new-instance v0, Lrl3;

    .line 1453
    .line 1454
    invoke-direct {v0, v12}, Lrl3;-><init>(Lsl3;)V

    .line 1455
    .line 1456
    .line 1457
    iput-object v0, v12, Lsl3;->f0:Lrl3;

    .line 1458
    .line 1459
    :cond_2d
    iget-object v0, v5, Lij3;->e:Lki3;

    .line 1460
    .line 1461
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 1462
    .line 1463
    .line 1464
    invoke-virtual {v0}, Lki3;->E()Landroid/content/SharedPreferences;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v0

    .line 1468
    iget-object v3, v12, Lsl3;->f0:Lrl3;

    .line 1469
    .line 1470
    invoke-interface {v0, v3}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 1471
    .line 1472
    .line 1473
    invoke-static {v12}, Lij3;->k(Lwg3;)V

    .line 1474
    .line 1475
    .line 1476
    invoke-virtual {v12}, Lsl3;->F()V

    .line 1477
    .line 1478
    .line 1479
    :cond_2e
    iget-object v0, v9, Lki3;->f:Lio/sentry/android/core/s;

    .line 1480
    .line 1481
    invoke-virtual {v0}, Lio/sentry/android/core/s;->a()J

    .line 1482
    .line 1483
    .line 1484
    move-result-wide v6

    .line 1485
    const-wide/16 v16, 0x0

    .line 1486
    .line 1487
    cmp-long v3, v6, v16

    .line 1488
    .line 1489
    if-nez v3, :cond_2f

    .line 1490
    .line 1491
    invoke-static/range {v19 .. v19}, Lij3;->l(Lhk3;)V

    .line 1492
    .line 1493
    .line 1494
    const-string v3, "Persisting first open"

    .line 1495
    .line 1496
    invoke-static/range {v29 .. v30}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v6

    .line 1500
    invoke-virtual {v4, v6, v3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1501
    .line 1502
    .line 1503
    move-wide/from16 v6, v29

    .line 1504
    .line 1505
    invoke-virtual {v0, v6, v7}, Lio/sentry/android/core/s;->b(J)V

    .line 1506
    .line 1507
    .line 1508
    goto :goto_1e

    .line 1509
    :cond_2f
    move-wide/from16 v6, v29

    .line 1510
    .line 1511
    :goto_1e
    invoke-static {v12}, Lij3;->k(Lwg3;)V

    .line 1512
    .line 1513
    .line 1514
    iget-object v3, v12, Lsl3;->c0:Loi3;

    .line 1515
    .line 1516
    invoke-virtual {v3}, Loi3;->d()Z

    .line 1517
    .line 1518
    .line 1519
    move-result v8

    .line 1520
    if-eqz v8, :cond_30

    .line 1521
    .line 1522
    invoke-virtual {v3}, Loi3;->c()Z

    .line 1523
    .line 1524
    .line 1525
    move-result v8

    .line 1526
    if-eqz v8, :cond_30

    .line 1527
    .line 1528
    iget-object v3, v3, Loi3;->b:Lij3;

    .line 1529
    .line 1530
    iget-object v3, v3, Lij3;->e:Lki3;

    .line 1531
    .line 1532
    invoke-static {v3}, Lij3;->j(Lsq3;)V

    .line 1533
    .line 1534
    .line 1535
    iget-object v3, v3, Lki3;->h0:Ltj;

    .line 1536
    .line 1537
    const/4 v14, 0x0

    .line 1538
    invoke-virtual {v3, v14}, Ltj;->n(Ljava/lang/String;)V

    .line 1539
    .line 1540
    .line 1541
    :cond_30
    invoke-virtual/range {v26 .. v26}, Lij3;->h()Z

    .line 1542
    .line 1543
    .line 1544
    move-result v3

    .line 1545
    if-nez v3, :cond_36

    .line 1546
    .line 1547
    invoke-virtual/range {v26 .. v26}, Lij3;->d()Z

    .line 1548
    .line 1549
    .line 1550
    move-result v0

    .line 1551
    if-eqz v0, :cond_35

    .line 1552
    .line 1553
    const-string v0, "android.permission.INTERNET"

    .line 1554
    .line 1555
    move-object/from16 v3, v28

    .line 1556
    .line 1557
    invoke-virtual {v3, v0}, Lup3;->W(Ljava/lang/String;)Z

    .line 1558
    .line 1559
    .line 1560
    move-result v0

    .line 1561
    if-nez v0, :cond_31

    .line 1562
    .line 1563
    invoke-static/range {v19 .. v19}, Lij3;->l(Lhk3;)V

    .line 1564
    .line 1565
    .line 1566
    const-string v0, "App is missing INTERNET permission"

    .line 1567
    .line 1568
    move-object/from16 v2, v27

    .line 1569
    .line 1570
    invoke-virtual {v2, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 1571
    .line 1572
    .line 1573
    goto :goto_1f

    .line 1574
    :cond_31
    move-object/from16 v2, v27

    .line 1575
    .line 1576
    :goto_1f
    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    .line 1577
    .line 1578
    invoke-virtual {v3, v0}, Lup3;->W(Ljava/lang/String;)Z

    .line 1579
    .line 1580
    .line 1581
    move-result v0

    .line 1582
    if-nez v0, :cond_32

    .line 1583
    .line 1584
    invoke-static/range {v19 .. v19}, Lij3;->l(Lhk3;)V

    .line 1585
    .line 1586
    .line 1587
    const-string v0, "App is missing ACCESS_NETWORK_STATE permission"

    .line 1588
    .line 1589
    invoke-virtual {v2, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 1590
    .line 1591
    .line 1592
    :cond_32
    move-object/from16 v8, v26

    .line 1593
    .line 1594
    iget-object v0, v8, Lij3;->a:Landroid/content/Context;

    .line 1595
    .line 1596
    invoke-static {v0}, Lg93;->a(Landroid/content/Context;)Lv30;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v6

    .line 1600
    invoke-virtual {v6}, Lv30;->d()Z

    .line 1601
    .line 1602
    .line 1603
    move-result v6

    .line 1604
    if-nez v6, :cond_34

    .line 1605
    .line 1606
    invoke-virtual {v1}, Lpd3;->C()Z

    .line 1607
    .line 1608
    .line 1609
    move-result v6

    .line 1610
    if-nez v6, :cond_34

    .line 1611
    .line 1612
    invoke-static {v0}, Lup3;->p0(Landroid/content/Context;)Z

    .line 1613
    .line 1614
    .line 1615
    move-result v6

    .line 1616
    if-nez v6, :cond_33

    .line 1617
    .line 1618
    invoke-static/range {v19 .. v19}, Lij3;->l(Lhk3;)V

    .line 1619
    .line 1620
    .line 1621
    const-string v6, "AppMeasurementReceiver not registered/enabled"

    .line 1622
    .line 1623
    invoke-virtual {v2, v6}, Lsh3;->a(Ljava/lang/String;)V

    .line 1624
    .line 1625
    .line 1626
    :cond_33
    invoke-static {v0}, Lup3;->S(Landroid/content/Context;)Z

    .line 1627
    .line 1628
    .line 1629
    move-result v0

    .line 1630
    if-nez v0, :cond_34

    .line 1631
    .line 1632
    invoke-static/range {v19 .. v19}, Lij3;->l(Lhk3;)V

    .line 1633
    .line 1634
    .line 1635
    const-string v0, "AppMeasurementService not registered/enabled"

    .line 1636
    .line 1637
    invoke-virtual {v2, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 1638
    .line 1639
    .line 1640
    :cond_34
    invoke-static/range {v19 .. v19}, Lij3;->l(Lhk3;)V

    .line 1641
    .line 1642
    .line 1643
    const-string v0, "Uploading is not possible. App measurement disabled"

    .line 1644
    .line 1645
    invoke-virtual {v2, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 1646
    .line 1647
    .line 1648
    :goto_20
    move-object/from16 v2, v19

    .line 1649
    .line 1650
    goto/16 :goto_26

    .line 1651
    .line 1652
    :cond_35
    move-object/from16 v8, v26

    .line 1653
    .line 1654
    move-object/from16 v3, v28

    .line 1655
    .line 1656
    goto :goto_20

    .line 1657
    :cond_36
    move-object/from16 v8, v26

    .line 1658
    .line 1659
    move-object/from16 v3, v28

    .line 1660
    .line 1661
    invoke-virtual {v8}, Lij3;->q()Lih3;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v10

    .line 1665
    invoke-virtual {v10}, Lih3;->G()Ljava/lang/String;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v10

    .line 1669
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1670
    .line 1671
    .line 1672
    move-result v10

    .line 1673
    if-nez v10, :cond_3a

    .line 1674
    .line 1675
    invoke-virtual {v8}, Lij3;->q()Lih3;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v10

    .line 1679
    invoke-virtual {v10}, Lih3;->G()Ljava/lang/String;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v10

    .line 1683
    invoke-virtual {v9}, Lsq3;->y()V

    .line 1684
    .line 1685
    .line 1686
    invoke-virtual {v9}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v11

    .line 1690
    const-string v13, "gmp_app_id"

    .line 1691
    .line 1692
    const/4 v14, 0x0

    .line 1693
    invoke-interface {v11, v13, v14}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v11

    .line 1697
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1698
    .line 1699
    .line 1700
    move-result v14

    .line 1701
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1702
    .line 1703
    .line 1704
    move-result v15

    .line 1705
    if-nez v14, :cond_39

    .line 1706
    .line 1707
    if-nez v15, :cond_39

    .line 1708
    .line 1709
    invoke-static {v10}, Lkb1;->n(Ljava/lang/Object;)V

    .line 1710
    .line 1711
    .line 1712
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1713
    .line 1714
    .line 1715
    move-result v10

    .line 1716
    if-nez v10, :cond_39

    .line 1717
    .line 1718
    invoke-static/range {v19 .. v19}, Lij3;->l(Lhk3;)V

    .line 1719
    .line 1720
    .line 1721
    const-string v10, "Rechecking which service to use due to a GMP App Id change"

    .line 1722
    .line 1723
    move-object/from16 v11, v23

    .line 1724
    .line 1725
    invoke-virtual {v11, v10}, Lsh3;->a(Ljava/lang/String;)V

    .line 1726
    .line 1727
    .line 1728
    invoke-virtual {v9}, Lsq3;->y()V

    .line 1729
    .line 1730
    .line 1731
    invoke-virtual {v9}, Lsq3;->y()V

    .line 1732
    .line 1733
    .line 1734
    invoke-virtual {v9}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v10

    .line 1738
    const-string v11, "measurement_enabled"

    .line 1739
    .line 1740
    invoke-interface {v10, v11}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 1741
    .line 1742
    .line 1743
    move-result v10

    .line 1744
    if-eqz v10, :cond_37

    .line 1745
    .line 1746
    invoke-virtual {v9}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v10

    .line 1750
    const/4 v14, 0x1

    .line 1751
    invoke-interface {v10, v11, v14}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1752
    .line 1753
    .line 1754
    move-result v10

    .line 1755
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v10

    .line 1759
    goto :goto_21

    .line 1760
    :cond_37
    const/4 v10, 0x0

    .line 1761
    :goto_21
    invoke-virtual {v9}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v14

    .line 1765
    invoke-interface {v14}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v14

    .line 1769
    invoke-interface {v14}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 1770
    .line 1771
    .line 1772
    invoke-interface {v14}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1773
    .line 1774
    .line 1775
    if-eqz v10, :cond_38

    .line 1776
    .line 1777
    invoke-virtual {v9}, Lsq3;->y()V

    .line 1778
    .line 1779
    .line 1780
    invoke-virtual {v9}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 1781
    .line 1782
    .line 1783
    move-result-object v14

    .line 1784
    invoke-interface {v14}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v14

    .line 1788
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1789
    .line 1790
    .line 1791
    move-result v10

    .line 1792
    invoke-interface {v14, v11, v10}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 1793
    .line 1794
    .line 1795
    invoke-interface {v14}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1796
    .line 1797
    .line 1798
    :cond_38
    invoke-virtual {v8}, Lij3;->n()Llh3;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v10

    .line 1802
    invoke-virtual {v10}, Llh3;->D()V

    .line 1803
    .line 1804
    .line 1805
    iget-object v10, v8, Lij3;->c0:Lpn3;

    .line 1806
    .line 1807
    invoke-virtual {v10}, Lpn3;->H()V

    .line 1808
    .line 1809
    .line 1810
    iget-object v10, v8, Lij3;->c0:Lpn3;

    .line 1811
    .line 1812
    invoke-virtual {v10}, Lpn3;->F()V

    .line 1813
    .line 1814
    .line 1815
    invoke-virtual {v0, v6, v7}, Lio/sentry/android/core/s;->b(J)V

    .line 1816
    .line 1817
    .line 1818
    move-object/from16 v0, v25

    .line 1819
    .line 1820
    const/4 v14, 0x0

    .line 1821
    invoke-virtual {v0, v14}, Ltj;->n(Ljava/lang/String;)V

    .line 1822
    .line 1823
    .line 1824
    goto :goto_22

    .line 1825
    :cond_39
    move-object/from16 v0, v25

    .line 1826
    .line 1827
    :goto_22
    invoke-virtual {v8}, Lij3;->q()Lih3;

    .line 1828
    .line 1829
    .line 1830
    move-result-object v6

    .line 1831
    invoke-virtual {v6}, Lih3;->G()Ljava/lang/String;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v6

    .line 1835
    invoke-virtual {v9}, Lsq3;->y()V

    .line 1836
    .line 1837
    .line 1838
    invoke-virtual {v9}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 1839
    .line 1840
    .line 1841
    move-result-object v7

    .line 1842
    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v7

    .line 1846
    invoke-interface {v7, v13, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1847
    .line 1848
    .line 1849
    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1850
    .line 1851
    .line 1852
    goto :goto_23

    .line 1853
    :cond_3a
    move-object/from16 v0, v25

    .line 1854
    .line 1855
    :goto_23
    invoke-virtual {v9}, Lki3;->G()Lok3;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v6

    .line 1859
    invoke-virtual {v6, v2}, Lok3;->i(Lnk3;)Z

    .line 1860
    .line 1861
    .line 1862
    move-result v2

    .line 1863
    if-nez v2, :cond_3b

    .line 1864
    .line 1865
    const/4 v14, 0x0

    .line 1866
    invoke-virtual {v0, v14}, Ltj;->n(Ljava/lang/String;)V

    .line 1867
    .line 1868
    .line 1869
    :cond_3b
    invoke-static {v12}, Lij3;->k(Lwg3;)V

    .line 1870
    .line 1871
    .line 1872
    invoke-virtual {v0}, Ltj;->m()Ljava/lang/String;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v0

    .line 1876
    iget-object v2, v12, Lsl3;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 1877
    .line 1878
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 1879
    .line 1880
    .line 1881
    move-object/from16 v13, v24

    .line 1882
    .line 1883
    :try_start_6
    iget-object v0, v13, Lij3;->a:Landroid/content/Context;

    .line 1884
    .line 1885
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1886
    .line 1887
    .line 1888
    move-result-object v0

    .line 1889
    const-string v2, "com.google.firebase.remoteconfig.FirebaseRemoteConfig"

    .line 1890
    .line 1891
    invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_6

    .line 1892
    .line 1893
    .line 1894
    :cond_3c
    move-object/from16 v2, v19

    .line 1895
    .line 1896
    goto :goto_24

    .line 1897
    :catch_6
    iget-object v0, v9, Lki3;->g0:Ltj;

    .line 1898
    .line 1899
    invoke-virtual {v0}, Ltj;->m()Ljava/lang/String;

    .line 1900
    .line 1901
    .line 1902
    move-result-object v2

    .line 1903
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1904
    .line 1905
    .line 1906
    move-result v2

    .line 1907
    if-nez v2, :cond_3c

    .line 1908
    .line 1909
    invoke-static/range {v19 .. v19}, Lij3;->l(Lhk3;)V

    .line 1910
    .line 1911
    .line 1912
    move-object/from16 v2, v19

    .line 1913
    .line 1914
    iget-object v6, v2, Luh3;->w:Lsh3;

    .line 1915
    .line 1916
    const-string v7, "Remote config removed with active feature rollouts"

    .line 1917
    .line 1918
    invoke-virtual {v6, v7}, Lsh3;->a(Ljava/lang/String;)V

    .line 1919
    .line 1920
    .line 1921
    const/4 v14, 0x0

    .line 1922
    invoke-virtual {v0, v14}, Ltj;->n(Ljava/lang/String;)V

    .line 1923
    .line 1924
    .line 1925
    :goto_24
    invoke-virtual {v8}, Lij3;->q()Lih3;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v0

    .line 1929
    invoke-virtual {v0}, Lih3;->G()Ljava/lang/String;

    .line 1930
    .line 1931
    .line 1932
    move-result-object v0

    .line 1933
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1934
    .line 1935
    .line 1936
    move-result v0

    .line 1937
    if-nez v0, :cond_40

    .line 1938
    .line 1939
    invoke-virtual {v8}, Lij3;->d()Z

    .line 1940
    .line 1941
    .line 1942
    move-result v0

    .line 1943
    iget-object v6, v9, Lki3;->c:Landroid/content/SharedPreferences;

    .line 1944
    .line 1945
    if-nez v6, :cond_3d

    .line 1946
    .line 1947
    const/4 v6, 0x0

    .line 1948
    goto :goto_25

    .line 1949
    :cond_3d
    const-string v7, "deferred_analytics_collection"

    .line 1950
    .line 1951
    invoke-interface {v6, v7}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 1952
    .line 1953
    .line 1954
    move-result v6

    .line 1955
    :goto_25
    if-nez v6, :cond_3e

    .line 1956
    .line 1957
    invoke-virtual {v1}, Lpd3;->M()Z

    .line 1958
    .line 1959
    .line 1960
    move-result v6

    .line 1961
    if-nez v6, :cond_3e

    .line 1962
    .line 1963
    xor-int/lit8 v6, v0, 0x1

    .line 1964
    .line 1965
    invoke-virtual {v9, v6}, Lki3;->I(Z)V

    .line 1966
    .line 1967
    .line 1968
    :cond_3e
    if-eqz v0, :cond_3f

    .line 1969
    .line 1970
    invoke-static {v12}, Lij3;->k(Lwg3;)V

    .line 1971
    .line 1972
    .line 1973
    invoke-virtual {v12}, Lsl3;->L()V

    .line 1974
    .line 1975
    .line 1976
    :cond_3f
    iget-object v0, v8, Lij3;->v:Llo3;

    .line 1977
    .line 1978
    invoke-static {v0}, Lij3;->k(Lwg3;)V

    .line 1979
    .line 1980
    .line 1981
    iget-object v0, v0, Llo3;->e:Lpi3;

    .line 1982
    .line 1983
    invoke-virtual {v0}, Lpi3;->a()V

    .line 1984
    .line 1985
    .line 1986
    invoke-virtual {v8}, Lij3;->o()Lpn3;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v0

    .line 1990
    new-instance v6, Ljava/util/concurrent/atomic/AtomicReference;

    .line 1991
    .line 1992
    invoke-direct {v6}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 1993
    .line 1994
    .line 1995
    invoke-virtual {v0, v6}, Lpn3;->D(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 1996
    .line 1997
    .line 1998
    invoke-virtual {v8}, Lij3;->o()Lpn3;

    .line 1999
    .line 2000
    .line 2001
    move-result-object v0

    .line 2002
    iget-object v6, v9, Lki3;->j0:Lra2;

    .line 2003
    .line 2004
    invoke-virtual {v6}, Lra2;->x()Landroid/os/Bundle;

    .line 2005
    .line 2006
    .line 2007
    move-result-object v6

    .line 2008
    invoke-virtual {v0, v6}, Lpn3;->E(Landroid/os/Bundle;)V

    .line 2009
    .line 2010
    .line 2011
    :cond_40
    :goto_26
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzql;->zza()Z

    .line 2012
    .line 2013
    .line 2014
    sget-object v0, Lvg3;->Q0:Lug3;

    .line 2015
    .line 2016
    const/4 v14, 0x0

    .line 2017
    invoke-virtual {v1, v14, v0}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 2018
    .line 2019
    .line 2020
    move-result v0

    .line 2021
    if-eqz v0, :cond_43

    .line 2022
    .line 2023
    invoke-virtual {v3}, Lsq3;->y()V

    .line 2024
    .line 2025
    .line 2026
    invoke-virtual {v3}, Lup3;->U()J

    .line 2027
    .line 2028
    .line 2029
    move-result-wide v0

    .line 2030
    cmp-long v0, v0, v20

    .line 2031
    .line 2032
    if-nez v0, :cond_43

    .line 2033
    .line 2034
    sget-object v0, Lvg3;->x0:Lug3;

    .line 2035
    .line 2036
    invoke-virtual {v0, v14}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2037
    .line 2038
    .line 2039
    move-result-object v0

    .line 2040
    check-cast v0, Ljava/lang/Integer;

    .line 2041
    .line 2042
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2043
    .line 2044
    .line 2045
    move-result v0

    .line 2046
    int-to-long v0, v0

    .line 2047
    new-instance v3, Ljava/util/Random;

    .line 2048
    .line 2049
    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    .line 2050
    .line 2051
    .line 2052
    const/16 v6, 0x1388

    .line 2053
    .line 2054
    invoke-virtual {v3, v6}, Ljava/util/Random;->nextInt(I)I

    .line 2055
    .line 2056
    .line 2057
    move-result v3

    .line 2058
    const-wide/16 v6, 0x3e8

    .line 2059
    .line 2060
    mul-long/2addr v0, v6

    .line 2061
    int-to-long v6, v3

    .line 2062
    iget-object v3, v8, Lij3;->V:Lxt0;

    .line 2063
    .line 2064
    add-long/2addr v0, v6

    .line 2065
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2066
    .line 2067
    .line 2068
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2069
    .line 2070
    .line 2071
    move-result-wide v6

    .line 2072
    sub-long/2addr v0, v6

    .line 2073
    const-wide/16 v6, 0x1f4

    .line 2074
    .line 2075
    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 2076
    .line 2077
    .line 2078
    move-result-wide v0

    .line 2079
    cmp-long v3, v0, v6

    .line 2080
    .line 2081
    if-lez v3, :cond_41

    .line 2082
    .line 2083
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 2084
    .line 2085
    .line 2086
    const-string v2, "Waiting to fetch trigger URIs until some time after boot. Delay in millis"

    .line 2087
    .line 2088
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2089
    .line 2090
    .line 2091
    move-result-object v3

    .line 2092
    invoke-virtual {v4, v3, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2093
    .line 2094
    .line 2095
    :cond_41
    invoke-static {v12}, Lij3;->k(Lwg3;)V

    .line 2096
    .line 2097
    .line 2098
    invoke-virtual {v12}, Leg3;->y()V

    .line 2099
    .line 2100
    .line 2101
    iget-object v2, v12, Lsl3;->W:Lwk3;

    .line 2102
    .line 2103
    if-nez v2, :cond_42

    .line 2104
    .line 2105
    new-instance v2, Lwk3;

    .line 2106
    .line 2107
    const/4 v6, 0x0

    .line 2108
    invoke-direct {v2, v12, v5, v6}, Lwk3;-><init>(Lsl3;Ljk3;I)V

    .line 2109
    .line 2110
    .line 2111
    iput-object v2, v12, Lsl3;->W:Lwk3;

    .line 2112
    .line 2113
    :cond_42
    iget-object v2, v12, Lsl3;->W:Lwk3;

    .line 2114
    .line 2115
    invoke-virtual {v2, v0, v1}, Lbe3;->b(J)V

    .line 2116
    .line 2117
    .line 2118
    :cond_43
    iget-object v0, v9, Lki3;->Z:Lhi3;

    .line 2119
    .line 2120
    const/4 v6, 0x1

    .line 2121
    invoke-virtual {v0, v6}, Lhi3;->b(Z)V

    .line 2122
    .line 2123
    .line 2124
    return-void

    .line 2125
    :cond_44
    invoke-static/range {v18 .. v18}, Lf42;->l(Ljava/lang/String;)V

    .line 2126
    .line 2127
    .line 2128
    return-void

    .line 2129
    :cond_45
    move-object/from16 v18, v5

    .line 2130
    .line 2131
    invoke-static/range {v18 .. v18}, Lf42;->l(Ljava/lang/String;)V

    .line 2132
    .line 2133
    .line 2134
    return-void

    .line 2135
    :cond_46
    move-object/from16 v18, v5

    .line 2136
    .line 2137
    invoke-static/range {v18 .. v18}, Lf42;->l(Ljava/lang/String;)V

    .line 2138
    .line 2139
    .line 2140
    return-void

    .line 2141
    :cond_47
    move-object/from16 v18, v5

    .line 2142
    .line 2143
    invoke-static/range {v18 .. v18}, Lf42;->l(Ljava/lang/String;)V

    .line 2144
    .line 2145
    .line 2146
    return-void
.end method


# virtual methods
.method public b()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    :try_start_0
    iget-object v2, p0, Ldp0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, Lx92;

    .line 6
    .line 7
    iget-object v2, v2, Lx92;->b:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    const/4 v3, 0x1

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    :try_start_1
    iget-object v0, p0, Ldp0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lx92;

    .line 16
    .line 17
    iget v4, v0, Lx92;->c:I

    .line 18
    .line 19
    const/4 v5, 0x4

    .line 20
    if-ne v4, v5, :cond_0

    .line 21
    .line 22
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_5

    .line 35
    :cond_0
    :try_start_2
    iget-wide v6, v0, Lx92;->d:J

    .line 36
    .line 37
    const-wide/16 v8, 0x1

    .line 38
    .line 39
    add-long/2addr v6, v8

    .line 40
    iput-wide v6, v0, Lx92;->d:J

    .line 41
    .line 42
    iput v5, v0, Lx92;->c:I

    .line 43
    .line 44
    move v0, v3

    .line 45
    :cond_1
    iget-object v4, p0, Ldp0;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, Lx92;

    .line 48
    .line 49
    iget-object v4, v4, Lx92;->b:Ljava/util/ArrayDeque;

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/Runnable;

    .line 56
    .line 57
    iput-object v4, p0, Ldp0;->b:Ljava/lang/Object;

    .line 58
    .line 59
    if-nez v4, :cond_3

    .line 60
    .line 61
    iget-object p0, p0, Ldp0;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Lx92;

    .line 64
    .line 65
    iput v3, p0, Lx92;->c:I

    .line 66
    .line 67
    monitor-exit v2

    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    :goto_2
    return-void

    .line 72
    :cond_3
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 74
    .line 75
    .line 76
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 77
    or-int/2addr v1, v2

    .line 78
    const/4 v2, 0x0

    .line 79
    :try_start_4
    iget-object v3, p0, Ldp0;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v3, Ljava/lang/Runnable;

    .line 82
    .line 83
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 84
    .line 85
    .line 86
    :goto_3
    :try_start_5
    iput-object v2, p0, Ldp0;->b:Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catchall_1
    move-exception p0

    .line 90
    goto :goto_6

    .line 91
    :catchall_2
    move-exception v0

    .line 92
    goto :goto_4

    .line 93
    :catch_0
    move-exception v3

    .line 94
    :try_start_6
    sget-object v4, Lx92;->f:Ljava/util/logging/Logger;

    .line 95
    .line 96
    sget-object v5, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    .line 97
    .line 98
    new-instance v6, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v7, "Exception while executing runnable "

    .line 104
    .line 105
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v7, p0, Ldp0;->b:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v7, Ljava/lang/Runnable;

    .line 111
    .line 112
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    invoke-virtual {v4, v5, v6, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :goto_4
    :try_start_7
    iput-object v2, p0, Ldp0;->b:Ljava/lang/Object;

    .line 124
    .line 125
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 126
    :goto_5
    :try_start_8
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 127
    :try_start_9
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 128
    :goto_6
    if-eqz v1, :cond_4

    .line 129
    .line 130
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 135
    .line 136
    .line 137
    :cond_4
    throw p0
.end method

.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ldp0;->a:I

    .line 4
    .line 5
    const/16 v2, 0x18

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, v1, Ldp0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lsl3;

    .line 17
    .line 18
    iget-object v2, v0, Lsq3;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lij3;

    .line 21
    .line 22
    iget-object v3, v2, Lij3;->e:Lki3;

    .line 23
    .line 24
    iget-object v2, v2, Lij3;->f:Luh3;

    .line 25
    .line 26
    invoke-static {v3}, Lij3;->j(Lsq3;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Lsq3;->y()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Lsq3;->y()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    const-string v8, "dma_consent_settings"

    .line 40
    .line 41
    invoke-interface {v7, v8, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-static {v5}, Lce3;->b(Ljava/lang/String;)Lce3;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    iget-object v1, v1, Ldp0;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Lce3;

    .line 52
    .line 53
    iget v7, v1, Lce3;->a:I

    .line 54
    .line 55
    iget v5, v5, Lce3;->a:I

    .line 56
    .line 57
    invoke-static {v7, v5}, Lok3;->l(II)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_1

    .line 62
    .line 63
    invoke-virtual {v3}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    iget-object v5, v1, Lce3;->b:Ljava/lang/String;

    .line 72
    .line 73
    invoke-interface {v3, v8, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 74
    .line 75
    .line 76
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 77
    .line 78
    .line 79
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 80
    .line 81
    .line 82
    iget-object v2, v2, Luh3;->Y:Lsh3;

    .line 83
    .line 84
    const-string v3, "Setting DMA consent(FE)"

    .line 85
    .line 86
    invoke-virtual {v2, v1, v3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Lij3;

    .line 92
    .line 93
    invoke-virtual {v0}, Lij3;->o()Lpn3;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v1}, Lpn3;->J()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_0

    .line 102
    .line 103
    invoke-virtual {v0}, Lij3;->o()Lpn3;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Leg3;->y()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Lwg3;->A()V

    .line 111
    .line 112
    .line 113
    new-instance v1, Lln3;

    .line 114
    .line 115
    invoke-direct {v1, v0, v6}, Lln3;-><init>(Lpn3;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1}, Lpn3;->N(Ljava/lang/Runnable;)V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_0
    invoke-virtual {v0}, Lij3;->o()Lpn3;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Leg3;->y()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Lwg3;->A()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Lpn3;->I()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_2

    .line 137
    .line 138
    invoke-virtual {v0, v4}, Lpn3;->P(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    new-instance v2, Lum3;

    .line 143
    .line 144
    invoke-direct {v2, v0, v1, v6}, Lum3;-><init>(Lpn3;Lcom/google/android/gms/measurement/internal/zzr;I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v2}, Lpn3;->N(Ljava/lang/Runnable;)V

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_1
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 152
    .line 153
    .line 154
    iget-object v0, v2, Luh3;->W:Lsh3;

    .line 155
    .line 156
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    const-string v2, "Lower precedence consent source ignored, proposed source"

    .line 161
    .line 162
    invoke-virtual {v0, v1, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :cond_2
    :goto_0
    return-void

    .line 166
    :pswitch_0
    iget-object v0, v1, Ldp0;->b:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 169
    .line 170
    iget-object v1, v1, Ldp0;->c:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v1, Lsl3;

    .line 173
    .line 174
    iget-object v2, v1, Lsq3;->a:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v2, Lij3;

    .line 177
    .line 178
    iget-object v1, v1, Lsq3;->a:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v1, Lij3;

    .line 181
    .line 182
    iget-object v2, v2, Lij3;->v:Llo3;

    .line 183
    .line 184
    invoke-static {v2}, Lij3;->k(Lwg3;)V

    .line 185
    .line 186
    .line 187
    iget-object v2, v2, Lsq3;->a:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v2, Lij3;

    .line 190
    .line 191
    iget-object v3, v2, Lij3;->e:Lki3;

    .line 192
    .line 193
    invoke-static {v3}, Lij3;->j(Lsq3;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v3}, Lki3;->G()Lok3;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    sget-object v6, Lnk3;->c:Lnk3;

    .line 201
    .line 202
    invoke-virtual {v4, v6}, Lok3;->i(Lnk3;)Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-nez v4, :cond_4

    .line 207
    .line 208
    iget-object v2, v2, Lij3;->f:Luh3;

    .line 209
    .line 210
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 211
    .line 212
    .line 213
    iget-object v2, v2, Luh3;->V:Lsh3;

    .line 214
    .line 215
    const-string v3, "Analytics storage consent denied; will not get session id"

    .line 216
    .line 217
    invoke-virtual {v2, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    :cond_3
    :goto_1
    move-object v2, v5

    .line 221
    goto :goto_2

    .line 222
    :cond_4
    invoke-static {v3}, Lij3;->j(Lsq3;)V

    .line 223
    .line 224
    .line 225
    iget-object v4, v3, Lki3;->b0:Lio/sentry/android/core/s;

    .line 226
    .line 227
    iget-object v2, v2, Lij3;->V:Lxt0;

    .line 228
    .line 229
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 233
    .line 234
    .line 235
    move-result-wide v6

    .line 236
    invoke-virtual {v3, v6, v7}, Lki3;->J(J)Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-nez v2, :cond_3

    .line 241
    .line 242
    invoke-virtual {v4}, Lio/sentry/android/core/s;->a()J

    .line 243
    .line 244
    .line 245
    move-result-wide v2

    .line 246
    const-wide/16 v6, 0x0

    .line 247
    .line 248
    cmp-long v2, v2, v6

    .line 249
    .line 250
    if-nez v2, :cond_5

    .line 251
    .line 252
    goto :goto_1

    .line 253
    :cond_5
    invoke-virtual {v4}, Lio/sentry/android/core/s;->a()J

    .line 254
    .line 255
    .line 256
    move-result-wide v2

    .line 257
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    :goto_2
    if-eqz v2, :cond_6

    .line 262
    .line 263
    iget-object v1, v1, Lij3;->w:Lup3;

    .line 264
    .line 265
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 269
    .line 270
    .line 271
    move-result-wide v2

    .line 272
    invoke-virtual {v1, v0, v2, v3}, Lup3;->i0(Lcom/google/android/gms/internal/measurement/zzcu;J)V

    .line 273
    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_6
    :try_start_0
    invoke-interface {v0, v5}, Lcom/google/android/gms/internal/measurement/zzcu;->zzb(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 277
    .line 278
    .line 279
    goto :goto_3

    .line 280
    :catch_0
    move-exception v0

    .line 281
    iget-object v1, v1, Lij3;->f:Luh3;

    .line 282
    .line 283
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 284
    .line 285
    .line 286
    iget-object v1, v1, Luh3;->f:Lsh3;

    .line 287
    .line 288
    const-string v2, "getSessionId failed with exception"

    .line 289
    .line 290
    invoke-virtual {v1, v0, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    :goto_3
    return-void

    .line 294
    :pswitch_1
    iget-object v0, v1, Ldp0;->b:Ljava/lang/Object;

    .line 295
    .line 296
    move-object v2, v0

    .line 297
    check-cast v2, Lgp3;

    .line 298
    .line 299
    iget-object v0, v1, Ldp0;->c:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v0, Landroid/os/IBinder;

    .line 302
    .line 303
    monitor-enter v2

    .line 304
    if-nez v0, :cond_7

    .line 305
    .line 306
    :try_start_1
    const-string v0, "Null service connection"

    .line 307
    .line 308
    invoke-virtual {v2, v0}, Lgp3;->a(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 312
    goto :goto_4

    .line 313
    :catchall_0
    move-exception v0

    .line 314
    goto :goto_5

    .line 315
    :cond_7
    :try_start_2
    new-instance v1, Lwe2;

    .line 316
    .line 317
    invoke-direct {v1, v0}, Lwe2;-><init>(Landroid/os/IBinder;)V

    .line 318
    .line 319
    .line 320
    iput-object v1, v2, Lgp3;->c:Lwe2;
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 321
    .line 322
    :try_start_3
    iput v3, v2, Lgp3;->a:I

    .line 323
    .line 324
    iget-object v0, v2, Lgp3;->f:Lur3;

    .line 325
    .line 326
    iget-object v0, v0, Lur3;->c:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 329
    .line 330
    new-instance v1, Lfk3;

    .line 331
    .line 332
    invoke-direct {v1, v2, v4}, Lfk3;-><init>(Lgp3;I)V

    .line 333
    .line 334
    .line 335
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 336
    .line 337
    .line 338
    monitor-exit v2

    .line 339
    goto :goto_4

    .line 340
    :catch_1
    move-exception v0

    .line 341
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-virtual {v2, v0}, Lgp3;->a(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    monitor-exit v2

    .line 349
    :goto_4
    return-void

    .line 350
    :goto_5
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 351
    throw v0

    .line 352
    :pswitch_2
    invoke-direct {v1}, Ldp0;->a()V

    .line 353
    .line 354
    .line 355
    return-void

    .line 356
    :pswitch_3
    iget-object v0, v1, Ldp0;->b:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v0, Lbh3;

    .line 359
    .line 360
    iget-object v1, v1, Ldp0;->c:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v1, Lsd3;

    .line 363
    .line 364
    invoke-virtual {v0}, Lbh3;->a()Landroid/app/Activity;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    if-nez v0, :cond_8

    .line 369
    .line 370
    goto :goto_6

    .line 371
    :cond_8
    invoke-virtual {v1, v0}, Lsd3;->a(Landroid/app/Activity;)V

    .line 372
    .line 373
    .line 374
    :goto_6
    return-void

    .line 375
    :pswitch_4
    iget-object v0, v1, Ldp0;->b:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v0, Lej;

    .line 378
    .line 379
    iget-object v1, v1, Ldp0;->c:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v1, Lcom/supercell/titan/g;

    .line 382
    .line 383
    sget-object v3, Lkf3;->k:Lkj;

    .line 384
    .line 385
    const/4 v4, 0x7

    .line 386
    invoke-virtual {v0, v2, v4, v3}, Lej;->x(IILkj;)V

    .line 387
    .line 388
    .line 389
    new-instance v0, Ljava/util/ArrayList;

    .line 390
    .line 391
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1, v3, v0}, Lcom/supercell/titan/g;->a(Lkj;Ljava/util/ArrayList;)V

    .line 395
    .line 396
    .line 397
    return-void

    .line 398
    :pswitch_5
    iget-object v0, v1, Ldp0;->b:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v0, Lej;

    .line 401
    .line 402
    iget-object v1, v1, Ldp0;->c:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v1, Lx6;

    .line 405
    .line 406
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    sget-object v3, Lkf3;->k:Lkj;

    .line 410
    .line 411
    const/16 v4, 0x9

    .line 412
    .line 413
    invoke-virtual {v0, v2, v4, v3}, Lej;->x(IILkj;)V

    .line 414
    .line 415
    .line 416
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzco;->zzl()Lcom/google/android/gms/internal/play_billing/zzco;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-virtual {v1, v3, v0}, Lx6;->g(Lkj;Ljava/util/List;)V

    .line 421
    .line 422
    .line 423
    return-void

    .line 424
    :pswitch_6
    iget-object v0, v1, Ldp0;->c:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast v0, Lcom/google/android/gms/common/api/internal/zact;

    .line 427
    .line 428
    iget-object v1, v1, Ldp0;->b:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v1, Lcom/google/android/gms/signin/internal/zak;

    .line 431
    .line 432
    sget-object v2, Lcom/google/android/gms/common/api/internal/zact;->j:Lva3;

    .line 433
    .line 434
    iget-object v2, v1, Lcom/google/android/gms/signin/internal/zak;->b:Lcom/google/android/gms/common/ConnectionResult;

    .line 435
    .line 436
    iget v3, v2, Lcom/google/android/gms/common/ConnectionResult;->b:I

    .line 437
    .line 438
    if-nez v3, :cond_e

    .line 439
    .line 440
    iget-object v1, v1, Lcom/google/android/gms/signin/internal/zak;->c:Lcom/google/android/gms/common/internal/zav;

    .line 441
    .line 442
    invoke-static {v1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    iget-object v2, v1, Lcom/google/android/gms/common/internal/zav;->c:Lcom/google/android/gms/common/ConnectionResult;

    .line 446
    .line 447
    iget v3, v2, Lcom/google/android/gms/common/ConnectionResult;->b:I

    .line 448
    .line 449
    if-nez v3, :cond_d

    .line 450
    .line 451
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/zact;->i:Lu93;

    .line 452
    .line 453
    iget-object v1, v1, Lcom/google/android/gms/common/internal/zav;->b:Landroid/os/IBinder;

    .line 454
    .line 455
    if-nez v1, :cond_9

    .line 456
    .line 457
    move-object v4, v5

    .line 458
    goto :goto_7

    .line 459
    :cond_9
    sget v3, Lcom/google/android/gms/common/internal/IAccountAccessor$Stub;->a:I

    .line 460
    .line 461
    const-string v3, "com.google.android.gms.common.internal.IAccountAccessor"

    .line 462
    .line 463
    invoke-interface {v1, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 464
    .line 465
    .line 466
    move-result-object v4

    .line 467
    instance-of v6, v4, Lcom/google/android/gms/common/internal/IAccountAccessor;

    .line 468
    .line 469
    if-eqz v6, :cond_a

    .line 470
    .line 471
    check-cast v4, Lcom/google/android/gms/common/internal/IAccountAccessor;

    .line 472
    .line 473
    goto :goto_7

    .line 474
    :cond_a
    new-instance v4, Lcom/google/android/gms/common/internal/zzt;

    .line 475
    .line 476
    invoke-direct {v4, v1, v3}, Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    :goto_7
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/zact;->d:Ljava/util/Set;

    .line 480
    .line 481
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    if-eqz v4, :cond_c

    .line 485
    .line 486
    if-nez v1, :cond_b

    .line 487
    .line 488
    goto :goto_8

    .line 489
    :cond_b
    iput-object v4, v2, Lu93;->d:Ljava/lang/Object;

    .line 490
    .line 491
    iput-object v1, v2, Lu93;->e:Ljava/lang/Object;

    .line 492
    .line 493
    iget-boolean v3, v2, Lu93;->a:Z

    .line 494
    .line 495
    if-eqz v3, :cond_f

    .line 496
    .line 497
    iget-object v2, v2, Lu93;->b:Ljava/lang/Object;

    .line 498
    .line 499
    check-cast v2, Ld9;

    .line 500
    .line 501
    invoke-interface {v2, v4, v1}, Ld9;->getRemoteService(Lcom/google/android/gms/common/internal/IAccountAccessor;Ljava/util/Set;)V

    .line 502
    .line 503
    .line 504
    goto :goto_9

    .line 505
    :cond_c
    :goto_8
    new-instance v1, Ljava/lang/Exception;

    .line 506
    .line 507
    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    .line 508
    .line 509
    .line 510
    const-string v3, "GoogleApiManager"

    .line 511
    .line 512
    const-string v4, "Received null response from onSignInSuccess"

    .line 513
    .line 514
    invoke-static {v3, v4, v1}, Lio/sentry/android/core/n0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 515
    .line 516
    .line 517
    new-instance v1, Lcom/google/android/gms/common/ConnectionResult;

    .line 518
    .line 519
    const/4 v3, 0x4

    .line 520
    invoke-direct {v1, v3, v5, v5}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2, v1}, Lu93;->A(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 524
    .line 525
    .line 526
    goto :goto_9

    .line 527
    :cond_d
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    new-instance v3, Ljava/lang/Exception;

    .line 532
    .line 533
    invoke-direct {v3}, Ljava/lang/Exception;-><init>()V

    .line 534
    .line 535
    .line 536
    const-string v4, "Sign-in succeeded with resolve account failure: "

    .line 537
    .line 538
    const-string v5, "SignInCoordinator"

    .line 539
    .line 540
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    invoke-static {v5, v1, v3}, Lio/sentry/android/core/n0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 545
    .line 546
    .line 547
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/zact;->i:Lu93;

    .line 548
    .line 549
    invoke-virtual {v1, v2}, Lu93;->A(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 550
    .line 551
    .line 552
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/zact;->f:Lie2;

    .line 553
    .line 554
    invoke-interface {v0}, Ld9;->disconnect()V

    .line 555
    .line 556
    .line 557
    goto :goto_a

    .line 558
    :cond_e
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/zact;->i:Lu93;

    .line 559
    .line 560
    invoke-virtual {v1, v2}, Lu93;->A(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 561
    .line 562
    .line 563
    :cond_f
    :goto_9
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/zact;->f:Lie2;

    .line 564
    .line 565
    invoke-interface {v0}, Ld9;->disconnect()V

    .line 566
    .line 567
    .line 568
    :goto_a
    return-void

    .line 569
    :pswitch_7
    iget-object v0, v1, Ldp0;->b:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast v0, Lcom/google/android/gms/common/ConnectionResult;

    .line 572
    .line 573
    iget-object v1, v1, Ldp0;->c:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast v1, Lu93;

    .line 576
    .line 577
    iget-object v2, v1, Lu93;->b:Ljava/lang/Object;

    .line 578
    .line 579
    check-cast v2, Ld9;

    .line 580
    .line 581
    iget-object v3, v1, Lu93;->f:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v3, Lur0;

    .line 584
    .line 585
    iget-object v3, v3, Lur0;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 586
    .line 587
    iget-object v4, v1, Lu93;->c:Ljava/lang/Object;

    .line 588
    .line 589
    check-cast v4, Lw9;

    .line 590
    .line 591
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v3

    .line 595
    check-cast v3, Lcb3;

    .line 596
    .line 597
    if-nez v3, :cond_10

    .line 598
    .line 599
    goto :goto_b

    .line 600
    :cond_10
    iget v4, v0, Lcom/google/android/gms/common/ConnectionResult;->b:I

    .line 601
    .line 602
    if-nez v4, :cond_12

    .line 603
    .line 604
    iput-boolean v6, v1, Lu93;->a:Z

    .line 605
    .line 606
    invoke-interface {v2}, Ld9;->requiresSignIn()Z

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    if-eqz v0, :cond_11

    .line 611
    .line 612
    iget-boolean v0, v1, Lu93;->a:Z

    .line 613
    .line 614
    if-eqz v0, :cond_13

    .line 615
    .line 616
    iget-object v0, v1, Lu93;->d:Ljava/lang/Object;

    .line 617
    .line 618
    check-cast v0, Lcom/google/android/gms/common/internal/IAccountAccessor;

    .line 619
    .line 620
    if-eqz v0, :cond_13

    .line 621
    .line 622
    iget-object v1, v1, Lu93;->e:Ljava/lang/Object;

    .line 623
    .line 624
    check-cast v1, Ljava/util/Set;

    .line 625
    .line 626
    invoke-interface {v2, v0, v1}, Ld9;->getRemoteService(Lcom/google/android/gms/common/internal/IAccountAccessor;Ljava/util/Set;)V

    .line 627
    .line 628
    .line 629
    goto :goto_b

    .line 630
    :cond_11
    :try_start_4
    invoke-interface {v2}, Ld9;->getScopesForConnectionlessNonSignIn()Ljava/util/Set;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    invoke-interface {v2, v5, v0}, Ld9;->getRemoteService(Lcom/google/android/gms/common/internal/IAccountAccessor;Ljava/util/Set;)V
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_2

    .line 635
    .line 636
    .line 637
    goto :goto_b

    .line 638
    :catch_2
    move-exception v0

    .line 639
    const-string v1, "GoogleApiManager"

    .line 640
    .line 641
    const-string v4, "Failed to get service from broker. "

    .line 642
    .line 643
    invoke-static {v1, v4, v0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 644
    .line 645
    .line 646
    const-string v0, "Failed to get service from broker."

    .line 647
    .line 648
    invoke-interface {v2, v0}, Ld9;->disconnect(Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    .line 652
    .line 653
    const/16 v1, 0xa

    .line 654
    .line 655
    invoke-direct {v0, v1, v5, v5}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v3, v0, v5}, Lcb3;->p(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/RuntimeException;)V

    .line 659
    .line 660
    .line 661
    goto :goto_b

    .line 662
    :cond_12
    invoke-virtual {v3, v0, v5}, Lcb3;->p(Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/RuntimeException;)V

    .line 663
    .line 664
    .line 665
    :cond_13
    :goto_b
    return-void

    .line 666
    :pswitch_8
    :try_start_5
    invoke-virtual {v1}, Ldp0;->b()V
    :try_end_5
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_3

    .line 667
    .line 668
    .line 669
    return-void

    .line 670
    :catch_3
    move-exception v0

    .line 671
    iget-object v2, v1, Ldp0;->c:Ljava/lang/Object;

    .line 672
    .line 673
    check-cast v2, Lx92;

    .line 674
    .line 675
    iget-object v2, v2, Lx92;->b:Ljava/util/ArrayDeque;

    .line 676
    .line 677
    monitor-enter v2

    .line 678
    :try_start_6
    iget-object v1, v1, Ldp0;->c:Ljava/lang/Object;

    .line 679
    .line 680
    check-cast v1, Lx92;

    .line 681
    .line 682
    iput v6, v1, Lx92;->c:I

    .line 683
    .line 684
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 685
    throw v0

    .line 686
    :catchall_1
    move-exception v0

    .line 687
    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 688
    throw v0

    .line 689
    :pswitch_9
    iget-object v0, v1, Ldp0;->c:Ljava/lang/Object;

    .line 690
    .line 691
    check-cast v0, Ler;

    .line 692
    .line 693
    iget-object v1, v1, Ldp0;->b:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast v1, Lof0;

    .line 696
    .line 697
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 698
    .line 699
    invoke-virtual {v0, v1, v2}, Ler;->E(Ls10;Lkotlin/Unit;)V

    .line 700
    .line 701
    .line 702
    return-void

    .line 703
    :pswitch_a
    iget-object v0, v1, Ldp0;->b:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v0, Landroid/widget/EditText;

    .line 706
    .line 707
    iget-object v1, v1, Ldp0;->c:Ljava/lang/Object;

    .line 708
    .line 709
    check-cast v1, Lnv;

    .line 710
    .line 711
    iget-object v1, v1, Lnv;->b:Lde0;

    .line 712
    .line 713
    check-cast v1, Lor1;

    .line 714
    .line 715
    iget-object v1, v1, Lor1;->e:Lwa0;

    .line 716
    .line 717
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 718
    .line 719
    .line 720
    return-void

    .line 721
    :pswitch_b
    const-string v2, "LocationService"

    .line 722
    .line 723
    iget-object v0, v1, Ldp0;->c:Ljava/lang/Object;

    .line 724
    .line 725
    check-cast v0, Lcom/supercell/titan/LocationService;

    .line 726
    .line 727
    iget-object v3, v0, Lcom/supercell/titan/LocationService;->b:Landroid/location/LocationManager;

    .line 728
    .line 729
    :try_start_8
    const-string v4, "network"

    .line 730
    .line 731
    invoke-virtual {v3, v4}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    .line 732
    .line 733
    .line 734
    move-result-object v4

    .line 735
    const-string v5, "gps"

    .line 736
    .line 737
    invoke-virtual {v3, v5}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    .line 738
    .line 739
    .line 740
    move-result-object v5

    .line 741
    sget-object v7, Lcom/supercell/titan/LocationService;->e:Landroid/location/Location;

    .line 742
    .line 743
    invoke-static {v5, v7}, Lcom/supercell/titan/LocationService;->a(Landroid/location/Location;Landroid/location/Location;)Z

    .line 744
    .line 745
    .line 746
    move-result v7

    .line 747
    if-eqz v7, :cond_14

    .line 748
    .line 749
    sput-object v5, Lcom/supercell/titan/LocationService;->e:Landroid/location/Location;

    .line 750
    .line 751
    :cond_14
    sget-object v5, Lcom/supercell/titan/LocationService;->e:Landroid/location/Location;

    .line 752
    .line 753
    invoke-static {v4, v5}, Lcom/supercell/titan/LocationService;->a(Landroid/location/Location;Landroid/location/Location;)Z

    .line 754
    .line 755
    .line 756
    move-result v5

    .line 757
    if-eqz v5, :cond_15

    .line 758
    .line 759
    sput-object v4, Lcom/supercell/titan/LocationService;->e:Landroid/location/Location;

    .line 760
    .line 761
    :cond_15
    sget-object v4, Lcom/supercell/titan/LocationService;->e:Landroid/location/Location;

    .line 762
    .line 763
    if-eqz v4, :cond_16

    .line 764
    .line 765
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    invoke-virtual {v0, v4}, Lcom/supercell/titan/LocationService;->onLocationChanged(Landroid/location/Location;)V

    .line 769
    .line 770
    .line 771
    goto :goto_c

    .line 772
    :catch_4
    move-exception v0

    .line 773
    goto :goto_d

    .line 774
    :cond_16
    :goto_c
    new-instance v4, Landroid/location/Criteria;

    .line 775
    .line 776
    invoke-direct {v4}, Landroid/location/Criteria;-><init>()V

    .line 777
    .line 778
    .line 779
    invoke-virtual {v4, v6}, Landroid/location/Criteria;->setAccuracy(I)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v3, v4, v6}, Landroid/location/LocationManager;->getBestProvider(Landroid/location/Criteria;Z)Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v8

    .line 786
    if-nez v8, :cond_17

    .line 787
    .line 788
    const-string v0, "LocationService.startLocationTracking.run mProvider = null"

    .line 789
    .line 790
    invoke-static {v2, v0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 791
    .line 792
    .line 793
    goto :goto_e

    .line 794
    :cond_17
    iget-object v7, v0, Lcom/supercell/titan/LocationService;->b:Landroid/location/LocationManager;

    .line 795
    .line 796
    iget-object v0, v1, Ldp0;->b:Ljava/lang/Object;

    .line 797
    .line 798
    move-object v12, v0

    .line 799
    check-cast v12, Lcom/supercell/titan/LocationService;

    .line 800
    .line 801
    const-wide/16 v9, 0x3e8

    .line 802
    .line 803
    const/high16 v11, 0x41200000    # 10.0f

    .line 804
    .line 805
    invoke-virtual/range {v7 .. v12}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V
    :try_end_8
    .catch Ljava/lang/SecurityException; {:try_start_8 .. :try_end_8} :catch_4

    .line 806
    .line 807
    .line 808
    goto :goto_e

    .line 809
    :goto_d
    const-string v1, "Security Exception while starting tracking location"

    .line 810
    .line 811
    invoke-static {v2, v1, v0}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 812
    .line 813
    .line 814
    :goto_e
    return-void

    .line 815
    :pswitch_c
    const-string v0, "KeyboardDialog"

    .line 816
    .line 817
    iget-object v2, v1, Ldp0;->c:Ljava/lang/Object;

    .line 818
    .line 819
    check-cast v2, Lcom/supercell/titan/KeyboardDialog;

    .line 820
    .line 821
    iget-object v3, v1, Ldp0;->b:Ljava/lang/Object;

    .line 822
    .line 823
    check-cast v3, Ljava/lang/String;

    .line 824
    .line 825
    invoke-static {v3}, Lcom/supercell/titan/VirtualKeyboardHandler;->getFontPath(Ljava/lang/String;)Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v3

    .line 829
    if-eqz v3, :cond_1a

    .line 830
    .line 831
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v5

    .line 835
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 836
    .line 837
    .line 838
    move-result v5

    .line 839
    if-lez v5, :cond_1a

    .line 840
    .line 841
    iget-object v5, v2, Lcom/supercell/titan/KeyboardDialog;->a:Lcom/supercell/titan/GameApp;

    .line 842
    .line 843
    sget-object v6, Ljl0;->a:Ljava/util/HashMap;

    .line 844
    .line 845
    invoke-virtual {v6, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 846
    .line 847
    .line 848
    move-result v7

    .line 849
    if-eqz v7, :cond_18

    .line 850
    .line 851
    invoke-virtual {v6, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v3

    .line 855
    check-cast v3, Landroid/graphics/Typeface;

    .line 856
    .line 857
    goto :goto_f

    .line 858
    :cond_18
    invoke-virtual {v5}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 859
    .line 860
    .line 861
    move-result-object v5

    .line 862
    invoke-static {v5, v3}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 863
    .line 864
    .line 865
    move-result-object v5

    .line 866
    invoke-virtual {v6, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    move-object v3, v5

    .line 870
    :goto_f
    if-eqz v3, :cond_19

    .line 871
    .line 872
    iget-object v0, v2, Lcom/supercell/titan/KeyboardDialog;->a:Lcom/supercell/titan/GameApp;

    .line 873
    .line 874
    new-instance v2, Lcp0;

    .line 875
    .line 876
    const/16 v5, 0xf

    .line 877
    .line 878
    invoke-direct {v2, v1, v3, v5, v4}, Lcp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 879
    .line 880
    .line 881
    invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 882
    .line 883
    .line 884
    goto :goto_10

    .line 885
    :cond_19
    const-string v1, "Failed to load font from"

    .line 886
    .line 887
    invoke-static {v0, v1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 888
    .line 889
    .line 890
    goto :goto_10

    .line 891
    :cond_1a
    const-string v1, "Failed to find path for font"

    .line 892
    .line 893
    invoke-static {v0, v1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 894
    .line 895
    .line 896
    :goto_10
    return-void

    .line 897
    :pswitch_d
    :try_start_9
    sput-boolean v6, Lcom/supercell/titan/HelpshiftTitan;->j:Z

    .line 898
    .line 899
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    iget-object v2, v1, Ldp0;->b:Ljava/lang/Object;

    .line 904
    .line 905
    check-cast v2, Ljava/lang/String;

    .line 906
    .line 907
    iget-object v1, v1, Ldp0;->c:Ljava/lang/Object;

    .line 908
    .line 909
    check-cast v1, Ljava/util/HashMap;

    .line 910
    .line 911
    invoke-static {v0, v2, v1}, Lhu0;->A0(Lcom/supercell/titan/GameApp;Ljava/lang/String;Ljava/util/HashMap;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5

    .line 912
    .line 913
    .line 914
    goto :goto_11

    .line 915
    :catch_5
    move-exception v0

    .line 916
    const-string v1, "HelpshiftTitan"

    .line 917
    .line 918
    const-string v2, "HelpshiftTitan.showFAQSection"

    .line 919
    .line 920
    invoke-static {v1, v2, v0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 921
    .line 922
    .line 923
    :goto_11
    return-void

    .line 924
    :pswitch_e
    const-string v0, "push_unread_count"

    .line 925
    .line 926
    iget-object v2, v1, Ldp0;->b:Ljava/lang/Object;

    .line 927
    .line 928
    check-cast v2, Lrs0;

    .line 929
    .line 930
    iget-boolean v3, v2, Lrs0;->a:Z

    .line 931
    .line 932
    if-nez v3, :cond_1b

    .line 933
    .line 934
    iget-object v3, v2, Lrs0;->f:Lnm;

    .line 935
    .line 936
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 937
    .line 938
    .line 939
    move-result-object v4

    .line 940
    invoke-virtual {v3, v4, v0}, Lnm;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v4

    .line 944
    check-cast v4, Ljava/lang/Integer;

    .line 945
    .line 946
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 947
    .line 948
    .line 949
    move-result v4

    .line 950
    add-int/2addr v4, v6

    .line 951
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 952
    .line 953
    .line 954
    move-result-object v4

    .line 955
    invoke-virtual {v3, v4, v0}, Lnm;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 956
    .line 957
    .line 958
    :cond_1b
    iget-object v0, v2, Lrs0;->h:Lb5;

    .line 959
    .line 960
    iget-object v1, v1, Ldp0;->c:Ljava/lang/Object;

    .line 961
    .line 962
    check-cast v1, Ljava/util/Map;

    .line 963
    .line 964
    const-string v2, "alert"

    .line 965
    .line 966
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v1

    .line 970
    check-cast v1, Ljava/lang/String;

    .line 971
    .line 972
    invoke-virtual {v0, v1, v6}, Lb5;->H(Ljava/lang/String;Z)V

    .line 973
    .line 974
    .line 975
    return-void

    .line 976
    :pswitch_f
    iget-object v0, v1, Ldp0;->c:Ljava/lang/Object;

    .line 977
    .line 978
    check-cast v0, Lra2;

    .line 979
    .line 980
    iget-object v0, v0, Lra2;->c:Ljava/lang/Object;

    .line 981
    .line 982
    iget-object v0, v1, Ldp0;->b:Ljava/lang/Object;

    .line 983
    .line 984
    check-cast v0, Ljava/lang/Runnable;

    .line 985
    .line 986
    new-instance v1, Lf62;

    .line 987
    .line 988
    invoke-direct {v1, v0, v6}, Lf62;-><init>(Ljava/lang/Runnable;I)V

    .line 989
    .line 990
    .line 991
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 996
    .line 997
    .line 998
    move-result-object v2

    .line 999
    if-ne v0, v2, :cond_1c

    .line 1000
    .line 1001
    invoke-virtual {v1}, Lf62;->run()V

    .line 1002
    .line 1003
    .line 1004
    goto :goto_12

    .line 1005
    :cond_1c
    new-instance v0, Landroid/os/Handler;

    .line 1006
    .line 1007
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v2

    .line 1011
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1015
    .line 1016
    .line 1017
    :goto_12
    return-void

    .line 1018
    :pswitch_10
    iget-object v0, v1, Ldp0;->c:Ljava/lang/Object;

    .line 1019
    .line 1020
    check-cast v0, Lxs0;

    .line 1021
    .line 1022
    iget-object v0, v0, Lxs0;->a:Lcom/helpshift/views/HSWebView;

    .line 1023
    .line 1024
    if-nez v0, :cond_1d

    .line 1025
    .line 1026
    goto :goto_13

    .line 1027
    :cond_1d
    iget-object v1, v1, Ldp0;->b:Ljava/lang/Object;

    .line 1028
    .line 1029
    check-cast v1, Ljava/lang/String;

    .line 1030
    .line 1031
    invoke-virtual {v0, v1, v5}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 1032
    .line 1033
    .line 1034
    :goto_13
    return-void

    .line 1035
    :pswitch_11
    iget-object v0, v1, Ldp0;->c:Ljava/lang/Object;

    .line 1036
    .line 1037
    check-cast v0, Lra2;

    .line 1038
    .line 1039
    iget-object v0, v0, Lra2;->a:Ljava/lang/Object;

    .line 1040
    .line 1041
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 1042
    .line 1043
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v0

    .line 1047
    check-cast v0, Lxs0;

    .line 1048
    .line 1049
    if-eqz v0, :cond_1e

    .line 1050
    .line 1051
    iget-object v1, v1, Ldp0;->b:Ljava/lang/Object;

    .line 1052
    .line 1053
    check-cast v1, Landroid/webkit/WebView;

    .line 1054
    .line 1055
    iget-object v0, v0, Lxs0;->d:Landroid/widget/LinearLayout;

    .line 1056
    .line 1057
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1058
    .line 1059
    .line 1060
    :cond_1e
    return-void

    .line 1061
    :pswitch_12
    iget-object v0, v1, Ldp0;->b:Ljava/lang/Object;

    .line 1062
    .line 1063
    check-cast v0, Ljava/lang/String;

    .line 1064
    .line 1065
    iget-object v1, v1, Ldp0;->c:Ljava/lang/Object;

    .line 1066
    .line 1067
    check-cast v1, Lwc0;

    .line 1068
    .line 1069
    iget-object v2, v1, Lwc0;->b:Ljava/lang/Object;

    .line 1070
    .line 1071
    check-cast v2, Lec0;

    .line 1072
    .line 1073
    if-nez v2, :cond_1f

    .line 1074
    .line 1075
    goto :goto_16

    .line 1076
    :cond_1f
    const-string v2, "missing user auth token"

    .line 1077
    .line 1078
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1079
    .line 1080
    .line 1081
    move-result v2

    .line 1082
    const/4 v4, 0x3

    .line 1083
    if-eqz v2, :cond_20

    .line 1084
    .line 1085
    move v0, v6

    .line 1086
    goto :goto_14

    .line 1087
    :cond_20
    const-string v2, "invalid user auth token"

    .line 1088
    .line 1089
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1090
    .line 1091
    .line 1092
    move-result v0

    .line 1093
    if-eqz v0, :cond_21

    .line 1094
    .line 1095
    move v0, v3

    .line 1096
    goto :goto_14

    .line 1097
    :cond_21
    move v0, v4

    .line 1098
    :goto_14
    iget-object v1, v1, Lwc0;->b:Ljava/lang/Object;

    .line 1099
    .line 1100
    check-cast v1, Lec0;

    .line 1101
    .line 1102
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1103
    .line 1104
    .line 1105
    const-string v1, "HelpshiftTitan"

    .line 1106
    .line 1107
    const-string v2, "authenticationFailed"

    .line 1108
    .line 1109
    invoke-static {v1, v2}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 1110
    .line 1111
    .line 1112
    if-eq v0, v6, :cond_24

    .line 1113
    .line 1114
    if-eq v0, v3, :cond_23

    .line 1115
    .line 1116
    if-ne v0, v4, :cond_22

    .line 1117
    .line 1118
    const-string v0, "UNKNOWN"

    .line 1119
    .line 1120
    goto :goto_15

    .line 1121
    :cond_22
    throw v5

    .line 1122
    :cond_23
    const-string v0, "REASON_INVALID_AUTH_TOKEN"

    .line 1123
    .line 1124
    goto :goto_15

    .line 1125
    :cond_24
    const-string v0, "REASON_AUTH_TOKEN_NOT_PROVIDED"

    .line 1126
    .line 1127
    :goto_15
    invoke-static {v1, v0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 1128
    .line 1129
    .line 1130
    :goto_16
    return-void

    .line 1131
    :pswitch_13
    iget-object v0, v1, Ldp0;->c:Ljava/lang/Object;

    .line 1132
    .line 1133
    check-cast v0, Lxy1;

    .line 1134
    .line 1135
    :try_start_a
    iget-object v1, v1, Ldp0;->b:Ljava/lang/Object;

    .line 1136
    .line 1137
    check-cast v1, Lorg/json/JSONArray;

    .line 1138
    .line 1139
    invoke-static {v0, v1, v6}, Lxy1;->a(Lxy1;Lorg/json/JSONArray;Z)I

    .line 1140
    .line 1141
    .line 1142
    move-result v1

    .line 1143
    const/16 v2, 0xc8

    .line 1144
    .line 1145
    if-lt v1, v2, :cond_25

    .line 1146
    .line 1147
    const/16 v2, 0x12c

    .line 1148
    .line 1149
    if-ge v1, v2, :cond_25

    .line 1150
    .line 1151
    iget-object v0, v0, Lxy1;->c:Ljava/lang/Object;

    .line 1152
    .line 1153
    check-cast v0, Ler0;

    .line 1154
    .line 1155
    new-instance v1, Lorg/json/JSONArray;

    .line 1156
    .line 1157
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v0, v1}, Ler0;->A(Lorg/json/JSONArray;)V
    :try_end_a
    .catch Lgt0; {:try_start_a .. :try_end_a} :catch_6

    .line 1161
    .line 1162
    .line 1163
    goto :goto_17

    .line 1164
    :catch_6
    move-exception v0

    .line 1165
    const-string v1, "analyticsMngr"

    .line 1166
    .line 1167
    const-string v2, "Error trying to sync failed events"

    .line 1168
    .line 1169
    invoke-static {v1, v2, v0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1170
    .line 1171
    .line 1172
    :cond_25
    :goto_17
    return-void

    .line 1173
    :pswitch_14
    iget-object v0, v1, Ldp0;->c:Ljava/lang/Object;

    .line 1174
    .line 1175
    move-object v2, v0

    .line 1176
    check-cast v2, Lrd0;

    .line 1177
    .line 1178
    iget-object v7, v2, Lrd0;->a:Landroid/content/Context;

    .line 1179
    .line 1180
    sget-object v0, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 1181
    .line 1182
    sget-object v8, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 1183
    .line 1184
    sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1185
    .line 1186
    sget-object v10, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 1187
    .line 1188
    sget-object v11, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1189
    .line 1190
    sget-object v12, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    .line 1191
    .line 1192
    sget-object v13, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 1193
    .line 1194
    const-string v14, "google_sdk"

    .line 1195
    .line 1196
    const-string v15, "nox"

    .line 1197
    .line 1198
    move/from16 v16, v4

    .line 1199
    .line 1200
    const-string v4, "generic"

    .line 1201
    .line 1202
    invoke-virtual {v13, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1203
    .line 1204
    .line 1205
    move-result v13

    .line 1206
    if-nez v13, :cond_27

    .line 1207
    .line 1208
    invoke-virtual {v11, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1209
    .line 1210
    .line 1211
    move-result v13

    .line 1212
    if-nez v13, :cond_27

    .line 1213
    .line 1214
    invoke-virtual {v11}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v13

    .line 1218
    const-string v5, "droid4x"

    .line 1219
    .line 1220
    invoke-virtual {v13, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1221
    .line 1222
    .line 1223
    move-result v5

    .line 1224
    if-nez v5, :cond_27

    .line 1225
    .line 1226
    const-string v5, "Emulator"

    .line 1227
    .line 1228
    invoke-virtual {v11, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1229
    .line 1230
    .line 1231
    move-result v5

    .line 1232
    if-nez v5, :cond_27

    .line 1233
    .line 1234
    const-string v5, "Android SDK built for x86"

    .line 1235
    .line 1236
    invoke-virtual {v11, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v5

    .line 1240
    if-nez v5, :cond_27

    .line 1241
    .line 1242
    const-string v5, "Genymotion"

    .line 1243
    .line 1244
    invoke-virtual {v8, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1245
    .line 1246
    .line 1247
    move-result v5

    .line 1248
    if-nez v5, :cond_27

    .line 1249
    .line 1250
    const-string v5, "goldfish"

    .line 1251
    .line 1252
    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1253
    .line 1254
    .line 1255
    move-result v5

    .line 1256
    if-nez v5, :cond_27

    .line 1257
    .line 1258
    const-string v5, "vbox86"

    .line 1259
    .line 1260
    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1261
    .line 1262
    .line 1263
    move-result v5

    .line 1264
    if-nez v5, :cond_27

    .line 1265
    .line 1266
    const-string v5, "sdk"

    .line 1267
    .line 1268
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1269
    .line 1270
    .line 1271
    move-result v5

    .line 1272
    if-nez v5, :cond_27

    .line 1273
    .line 1274
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1275
    .line 1276
    .line 1277
    move-result v5

    .line 1278
    if-nez v5, :cond_27

    .line 1279
    .line 1280
    const-string v5, "sdk_x86"

    .line 1281
    .line 1282
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1283
    .line 1284
    .line 1285
    move-result v5

    .line 1286
    if-nez v5, :cond_27

    .line 1287
    .line 1288
    const-string v5, "sdk_gphone64_arm64"

    .line 1289
    .line 1290
    invoke-virtual {v0, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1291
    .line 1292
    .line 1293
    move-result v5

    .line 1294
    if-nez v5, :cond_27

    .line 1295
    .line 1296
    const-string v5, "vbox86p"

    .line 1297
    .line 1298
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1299
    .line 1300
    .line 1301
    move-result v5

    .line 1302
    if-nez v5, :cond_27

    .line 1303
    .line 1304
    sget-object v5, Landroid/os/Build;->BOARD:Ljava/lang/String;

    .line 1305
    .line 1306
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v5

    .line 1310
    invoke-virtual {v5, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1311
    .line 1312
    .line 1313
    move-result v5

    .line 1314
    if-nez v5, :cond_27

    .line 1315
    .line 1316
    sget-object v5, Landroid/os/Build;->BOOTLOADER:Ljava/lang/String;

    .line 1317
    .line 1318
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v5

    .line 1322
    invoke-virtual {v5, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1323
    .line 1324
    .line 1325
    move-result v5

    .line 1326
    if-nez v5, :cond_27

    .line 1327
    .line 1328
    invoke-virtual {v12}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v5

    .line 1332
    invoke-virtual {v5, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1333
    .line 1334
    .line 1335
    move-result v5

    .line 1336
    if-nez v5, :cond_27

    .line 1337
    .line 1338
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v5

    .line 1342
    invoke-virtual {v5, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1343
    .line 1344
    .line 1345
    move-result v5

    .line 1346
    if-nez v5, :cond_27

    .line 1347
    .line 1348
    sget-object v5, Landroid/os/Build;->SERIAL:Ljava/lang/String;

    .line 1349
    .line 1350
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v5

    .line 1354
    invoke-virtual {v5, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1355
    .line 1356
    .line 1357
    move-result v5

    .line 1358
    if-eqz v5, :cond_26

    .line 1359
    .line 1360
    goto :goto_18

    .line 1361
    :cond_26
    move/from16 v5, v16

    .line 1362
    .line 1363
    goto :goto_19

    .line 1364
    :cond_27
    :goto_18
    move v5, v6

    .line 1365
    :goto_19
    if-eqz v5, :cond_28

    .line 1366
    .line 1367
    :goto_1a
    move v0, v6

    .line 1368
    goto :goto_1c

    .line 1369
    :cond_28
    invoke-virtual {v9, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1370
    .line 1371
    .line 1372
    move-result v8

    .line 1373
    if-eqz v8, :cond_29

    .line 1374
    .line 1375
    invoke-virtual {v10, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1376
    .line 1377
    .line 1378
    move-result v4

    .line 1379
    if-eqz v4, :cond_29

    .line 1380
    .line 1381
    move v4, v6

    .line 1382
    goto :goto_1b

    .line 1383
    :cond_29
    move/from16 v4, v16

    .line 1384
    .line 1385
    :goto_1b
    or-int/2addr v4, v5

    .line 1386
    if-eqz v4, :cond_2a

    .line 1387
    .line 1388
    goto :goto_1a

    .line 1389
    :cond_2a
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1390
    .line 1391
    .line 1392
    move-result v0

    .line 1393
    or-int/2addr v0, v4

    .line 1394
    :goto_1c
    if-nez v0, :cond_36

    .line 1395
    .line 1396
    const-string v0, "android.permission.READ_PHONE_STATE"

    .line 1397
    .line 1398
    invoke-static {v7, v0}, Lv00;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 1399
    .line 1400
    .line 1401
    sget-object v0, Lrd0;->c:[Ljava/lang/String;

    .line 1402
    .line 1403
    invoke-static {v0}, Lrd0;->a([Ljava/lang/String;)Z

    .line 1404
    .line 1405
    .line 1406
    move-result v0

    .line 1407
    if-nez v0, :cond_35

    .line 1408
    .line 1409
    sget-object v0, Lrd0;->d:[Ljava/lang/String;

    .line 1410
    .line 1411
    invoke-static {v0}, Lrd0;->a([Ljava/lang/String;)Z

    .line 1412
    .line 1413
    .line 1414
    move-result v0

    .line 1415
    if-nez v0, :cond_35

    .line 1416
    .line 1417
    sget-object v0, Lrd0;->h:[Ljava/lang/String;

    .line 1418
    .line 1419
    invoke-static {v0}, Lrd0;->a([Ljava/lang/String;)Z

    .line 1420
    .line 1421
    .line 1422
    move-result v0

    .line 1423
    if-nez v0, :cond_35

    .line 1424
    .line 1425
    sget-object v0, Lrd0;->i:[Ljava/lang/String;

    .line 1426
    .line 1427
    invoke-static {v0}, Lrd0;->a([Ljava/lang/String;)Z

    .line 1428
    .line 1429
    .line 1430
    move-result v0

    .line 1431
    if-nez v0, :cond_35

    .line 1432
    .line 1433
    new-instance v0, Ljava/io/File;

    .line 1434
    .line 1435
    const-string v4, "/proc/tty/drivers"

    .line 1436
    .line 1437
    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1438
    .line 1439
    .line 1440
    new-instance v4, Ljava/io/File;

    .line 1441
    .line 1442
    const-string v5, "/proc/cpuinfo"

    .line 1443
    .line 1444
    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1445
    .line 1446
    .line 1447
    filled-new-array {v0, v4}, [Ljava/io/File;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v4

    .line 1451
    move/from16 v5, v16

    .line 1452
    .line 1453
    :goto_1d
    const/16 v0, 0x400

    .line 1454
    .line 1455
    if-ge v5, v3, :cond_2c

    .line 1456
    .line 1457
    aget-object v8, v4, v5

    .line 1458
    .line 1459
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    .line 1460
    .line 1461
    .line 1462
    move-result v9

    .line 1463
    if-eqz v9, :cond_2b

    .line 1464
    .line 1465
    invoke-virtual {v8}, Ljava/io/File;->canRead()Z

    .line 1466
    .line 1467
    .line 1468
    move-result v9

    .line 1469
    if-eqz v9, :cond_2b

    .line 1470
    .line 1471
    new-array v9, v0, [B

    .line 1472
    .line 1473
    :try_start_b
    new-instance v0, Ljava/io/FileInputStream;

    .line 1474
    .line 1475
    invoke-direct {v0, v8}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 1476
    .line 1477
    .line 1478
    invoke-static {v8, v0}, Lio/sentry/config/a;->b(Ljava/io/File;Ljava/io/FileInputStream;)Ljava/io/FileInputStream;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v0

    .line 1482
    invoke-virtual {v0, v9}, Ljava/io/InputStream;->read([B)I

    .line 1483
    .line 1484
    .line 1485
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_7

    .line 1486
    .line 1487
    .line 1488
    goto :goto_1e

    .line 1489
    :catch_7
    move-exception v0

    .line 1490
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1491
    .line 1492
    .line 1493
    :goto_1e
    new-instance v0, Ljava/lang/String;

    .line 1494
    .line 1495
    invoke-direct {v0, v9}, Ljava/lang/String;-><init>([B)V

    .line 1496
    .line 1497
    .line 1498
    sget-object v8, Lrd0;->e:[Ljava/lang/String;

    .line 1499
    .line 1500
    aget-object v8, v8, v16

    .line 1501
    .line 1502
    invoke-virtual {v0, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1503
    .line 1504
    .line 1505
    move-result v0

    .line 1506
    if-eqz v0, :cond_2b

    .line 1507
    .line 1508
    goto/16 :goto_23

    .line 1509
    .line 1510
    :cond_2b
    add-int/lit8 v5, v5, 0x1

    .line 1511
    .line 1512
    goto :goto_1d

    .line 1513
    :cond_2c
    sget-object v3, Lrd0;->f:[Ljava/lang/String;

    .line 1514
    .line 1515
    invoke-static {v3}, Lrd0;->a([Ljava/lang/String;)Z

    .line 1516
    .line 1517
    .line 1518
    move-result v3

    .line 1519
    if-nez v3, :cond_35

    .line 1520
    .line 1521
    const-string v3, "android.permission.INTERNET"

    .line 1522
    .line 1523
    invoke-static {v7, v3}, Lv00;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 1524
    .line 1525
    .line 1526
    move-result v3

    .line 1527
    if-nez v3, :cond_30

    .line 1528
    .line 1529
    const-string v3, "/system/bin/netcfg"

    .line 1530
    .line 1531
    filled-new-array {v3}, [Ljava/lang/String;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v3

    .line 1535
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1536
    .line 1537
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1538
    .line 1539
    .line 1540
    :try_start_c
    new-instance v5, Ljava/lang/ProcessBuilder;

    .line 1541
    .line 1542
    invoke-direct {v5, v3}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    .line 1543
    .line 1544
    .line 1545
    new-instance v3, Ljava/io/File;

    .line 1546
    .line 1547
    const-string v8, "/system/bin/"

    .line 1548
    .line 1549
    invoke-direct {v3, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1550
    .line 1551
    .line 1552
    invoke-virtual {v5, v3}, Ljava/lang/ProcessBuilder;->directory(Ljava/io/File;)Ljava/lang/ProcessBuilder;

    .line 1553
    .line 1554
    .line 1555
    invoke-virtual {v5, v6}, Ljava/lang/ProcessBuilder;->redirectErrorStream(Z)Ljava/lang/ProcessBuilder;

    .line 1556
    .line 1557
    .line 1558
    invoke-virtual {v5}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v3

    .line 1562
    invoke-virtual {v3}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v3

    .line 1566
    new-array v0, v0, [B

    .line 1567
    .line 1568
    :goto_1f
    invoke-virtual {v3, v0}, Ljava/io/InputStream;->read([B)I

    .line 1569
    .line 1570
    .line 1571
    move-result v5

    .line 1572
    const/4 v8, -0x1

    .line 1573
    if-eq v5, v8, :cond_2d

    .line 1574
    .line 1575
    new-instance v5, Ljava/lang/String;

    .line 1576
    .line 1577
    invoke-direct {v5, v0}, Ljava/lang/String;-><init>([B)V

    .line 1578
    .line 1579
    .line 1580
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1581
    .line 1582
    .line 1583
    goto :goto_1f

    .line 1584
    :cond_2d
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_8

    .line 1585
    .line 1586
    .line 1587
    :catch_8
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v0

    .line 1591
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1592
    .line 1593
    .line 1594
    move-result v3

    .line 1595
    if-nez v3, :cond_30

    .line 1596
    .line 1597
    const-string v3, "\n"

    .line 1598
    .line 1599
    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v0

    .line 1603
    array-length v3, v0

    .line 1604
    move/from16 v4, v16

    .line 1605
    .line 1606
    :goto_20
    if-ge v4, v3, :cond_30

    .line 1607
    .line 1608
    aget-object v5, v0, v4

    .line 1609
    .line 1610
    const-string v8, "wlan0"

    .line 1611
    .line 1612
    invoke-virtual {v5, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1613
    .line 1614
    .line 1615
    move-result v8

    .line 1616
    if-nez v8, :cond_2e

    .line 1617
    .line 1618
    const-string v8, "tunl0"

    .line 1619
    .line 1620
    invoke-virtual {v5, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1621
    .line 1622
    .line 1623
    move-result v8

    .line 1624
    if-nez v8, :cond_2e

    .line 1625
    .line 1626
    const-string v8, "eth0"

    .line 1627
    .line 1628
    invoke-virtual {v5, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1629
    .line 1630
    .line 1631
    move-result v8

    .line 1632
    if-eqz v8, :cond_2f

    .line 1633
    .line 1634
    :cond_2e
    const-string v8, "10.0.2.15"

    .line 1635
    .line 1636
    invoke-virtual {v5, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1637
    .line 1638
    .line 1639
    move-result v5

    .line 1640
    if-eqz v5, :cond_2f

    .line 1641
    .line 1642
    goto :goto_23

    .line 1643
    :cond_2f
    add-int/lit8 v4, v4, 0x1

    .line 1644
    .line 1645
    goto :goto_20

    .line 1646
    :cond_30
    sget-object v0, Lrd0;->j:[Lru1;

    .line 1647
    .line 1648
    move/from16 v3, v16

    .line 1649
    .line 1650
    move v4, v3

    .line 1651
    :goto_21
    const/16 v5, 0xe

    .line 1652
    .line 1653
    if-ge v3, v5, :cond_33

    .line 1654
    .line 1655
    aget-object v5, v0, v3

    .line 1656
    .line 1657
    iget-object v8, v5, Lru1;->a:Ljava/lang/String;

    .line 1658
    .line 1659
    :try_start_d
    invoke-virtual {v7}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v9

    .line 1663
    const-string v10, "android.os.SystemProperties"

    .line 1664
    .line 1665
    invoke-virtual {v9, v10}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v9

    .line 1669
    const-string v10, "get"

    .line 1670
    .line 1671
    const-class v11, Ljava/lang/String;

    .line 1672
    .line 1673
    filled-new-array {v11}, [Ljava/lang/Class;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v11

    .line 1677
    invoke-virtual {v9, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v10

    .line 1681
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v8

    .line 1685
    invoke-virtual {v10, v9, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v8

    .line 1689
    check-cast v8, Ljava/lang/String;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_9

    .line 1690
    .line 1691
    goto :goto_22

    .line 1692
    :catch_9
    const/4 v8, 0x0

    .line 1693
    :goto_22
    iget-object v5, v5, Lru1;->b:Ljava/lang/String;

    .line 1694
    .line 1695
    if-nez v5, :cond_31

    .line 1696
    .line 1697
    if-eqz v8, :cond_31

    .line 1698
    .line 1699
    add-int/lit8 v4, v4, 0x1

    .line 1700
    .line 1701
    :cond_31
    if-eqz v5, :cond_32

    .line 1702
    .line 1703
    invoke-virtual {v8, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1704
    .line 1705
    .line 1706
    move-result v5

    .line 1707
    if-eqz v5, :cond_32

    .line 1708
    .line 1709
    add-int/lit8 v4, v4, 0x1

    .line 1710
    .line 1711
    :cond_32
    add-int/lit8 v3, v3, 0x1

    .line 1712
    .line 1713
    goto :goto_21

    .line 1714
    :cond_33
    const/4 v0, 0x5

    .line 1715
    if-lt v4, v0, :cond_34

    .line 1716
    .line 1717
    sget-object v0, Lrd0;->g:[Ljava/lang/String;

    .line 1718
    .line 1719
    invoke-static {v0}, Lrd0;->a([Ljava/lang/String;)Z

    .line 1720
    .line 1721
    .line 1722
    move-result v0

    .line 1723
    if-eqz v0, :cond_34

    .line 1724
    .line 1725
    goto :goto_23

    .line 1726
    :cond_34
    move/from16 v0, v16

    .line 1727
    .line 1728
    goto :goto_24

    .line 1729
    :cond_35
    :goto_23
    move v0, v6

    .line 1730
    :cond_36
    :goto_24
    if-nez v0, :cond_3a

    .line 1731
    .line 1732
    iget-object v0, v2, Lrd0;->b:Ljava/util/ArrayList;

    .line 1733
    .line 1734
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1735
    .line 1736
    .line 1737
    move-result v2

    .line 1738
    if-eqz v2, :cond_38

    .line 1739
    .line 1740
    :cond_37
    move/from16 v4, v16

    .line 1741
    .line 1742
    goto :goto_25

    .line 1743
    :cond_38
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 1744
    .line 1745
    .line 1746
    move-result-object v2

    .line 1747
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v0

    .line 1751
    :cond_39
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1752
    .line 1753
    .line 1754
    move-result v3

    .line 1755
    if-eqz v3, :cond_37

    .line 1756
    .line 1757
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v3

    .line 1761
    check-cast v3, Ljava/lang/String;

    .line 1762
    .line 1763
    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1764
    .line 1765
    .line 1766
    move-result-object v3

    .line 1767
    if-eqz v3, :cond_39

    .line 1768
    .line 1769
    const/high16 v4, 0x10000

    .line 1770
    .line 1771
    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v3

    .line 1775
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 1776
    .line 1777
    .line 1778
    move-result v3

    .line 1779
    if-nez v3, :cond_39

    .line 1780
    .line 1781
    move v4, v6

    .line 1782
    :goto_25
    move v0, v4

    .line 1783
    :cond_3a
    iget-object v1, v1, Ldp0;->b:Ljava/lang/Object;

    .line 1784
    .line 1785
    check-cast v1, Ld52;

    .line 1786
    .line 1787
    iget-object v1, v1, Ld52;->a:Ljava/lang/Object;

    .line 1788
    .line 1789
    check-cast v1, Lcom/supercell/titan/GameApp;

    .line 1790
    .line 1791
    iput-boolean v0, v1, Lcom/supercell/titan/GameApp;->d:Z

    .line 1792
    .line 1793
    return-void

    .line 1794
    :pswitch_15
    iget-object v0, v1, Ldp0;->b:Ljava/lang/Object;

    .line 1795
    .line 1796
    check-cast v0, Landroid/widget/AutoCompleteTextView;

    .line 1797
    .line 1798
    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    .line 1799
    .line 1800
    .line 1801
    move-result v0

    .line 1802
    iget-object v1, v1, Ldp0;->c:Ljava/lang/Object;

    .line 1803
    .line 1804
    check-cast v1, Lwa0;

    .line 1805
    .line 1806
    iget-object v1, v1, Lwa0;->b:Lde0;

    .line 1807
    .line 1808
    check-cast v1, Lza0;

    .line 1809
    .line 1810
    invoke-virtual {v1, v0}, Lza0;->i(Z)V

    .line 1811
    .line 1812
    .line 1813
    iput-boolean v0, v1, Lza0;->l:Z

    .line 1814
    .line 1815
    return-void

    .line 1816
    :pswitch_16
    iget-object v0, v1, Ldp0;->c:Ljava/lang/Object;

    .line 1817
    .line 1818
    move-object v2, v0

    .line 1819
    check-cast v2, Lj60;

    .line 1820
    .line 1821
    iget-object v0, v1, Ldp0;->b:Ljava/lang/Object;

    .line 1822
    .line 1823
    check-cast v0, Ljava/util/ArrayList;

    .line 1824
    .line 1825
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v7

    .line 1829
    :cond_3b
    :goto_26
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1830
    .line 1831
    .line 1832
    move-result v1

    .line 1833
    if-eqz v1, :cond_3f

    .line 1834
    .line 1835
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v1

    .line 1839
    move-object v3, v1

    .line 1840
    check-cast v3, Lh60;

    .line 1841
    .line 1842
    iget-object v8, v2, Lj60;->r:Ljava/util/ArrayList;

    .line 1843
    .line 1844
    iget-wide v9, v2, Ln12;->f:J

    .line 1845
    .line 1846
    iget-object v1, v3, Lh60;->a:Landroidx/recyclerview/widget/o;

    .line 1847
    .line 1848
    if-nez v1, :cond_3c

    .line 1849
    .line 1850
    const/4 v5, 0x0

    .line 1851
    goto :goto_27

    .line 1852
    :cond_3c
    iget-object v1, v1, Landroidx/recyclerview/widget/o;->a:Landroid/view/View;

    .line 1853
    .line 1854
    move-object v5, v1

    .line 1855
    :goto_27
    iget-object v1, v3, Lh60;->b:Landroidx/recyclerview/widget/o;

    .line 1856
    .line 1857
    if-eqz v1, :cond_3d

    .line 1858
    .line 1859
    iget-object v1, v1, Landroidx/recyclerview/widget/o;->a:Landroid/view/View;

    .line 1860
    .line 1861
    move-object v11, v1

    .line 1862
    goto :goto_28

    .line 1863
    :cond_3d
    const/4 v11, 0x0

    .line 1864
    :goto_28
    const/4 v12, 0x0

    .line 1865
    if-eqz v5, :cond_3e

    .line 1866
    .line 1867
    invoke-virtual {v5}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v1

    .line 1871
    invoke-virtual {v1, v9, v10}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v4

    .line 1875
    iget-object v1, v3, Lh60;->a:Landroidx/recyclerview/widget/o;

    .line 1876
    .line 1877
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1878
    .line 1879
    .line 1880
    iget v1, v3, Lh60;->e:I

    .line 1881
    .line 1882
    iget v6, v3, Lh60;->c:I

    .line 1883
    .line 1884
    sub-int/2addr v1, v6

    .line 1885
    int-to-float v1, v1

    .line 1886
    invoke-virtual {v4, v1}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 1887
    .line 1888
    .line 1889
    iget v1, v3, Lh60;->f:I

    .line 1890
    .line 1891
    iget v6, v3, Lh60;->d:I

    .line 1892
    .line 1893
    sub-int/2addr v1, v6

    .line 1894
    int-to-float v1, v1

    .line 1895
    invoke-virtual {v4, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 1896
    .line 1897
    .line 1898
    invoke-virtual {v4, v12}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v13

    .line 1902
    new-instance v1, Lg60;

    .line 1903
    .line 1904
    const/4 v6, 0x0

    .line 1905
    invoke-direct/range {v1 .. v6}, Lg60;-><init>(Lj60;Lh60;Landroid/view/ViewPropertyAnimator;Landroid/view/View;I)V

    .line 1906
    .line 1907
    .line 1908
    invoke-virtual {v13, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 1909
    .line 1910
    .line 1911
    move-result-object v1

    .line 1912
    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 1913
    .line 1914
    .line 1915
    :cond_3e
    if-eqz v11, :cond_3b

    .line 1916
    .line 1917
    invoke-virtual {v11}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 1918
    .line 1919
    .line 1920
    move-result-object v4

    .line 1921
    iget-object v1, v3, Lh60;->b:Landroidx/recyclerview/widget/o;

    .line 1922
    .line 1923
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1924
    .line 1925
    .line 1926
    invoke-virtual {v4, v12}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v1

    .line 1930
    invoke-virtual {v1, v12}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v1

    .line 1934
    invoke-virtual {v1, v9, v10}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 1935
    .line 1936
    .line 1937
    move-result-object v1

    .line 1938
    const/high16 v5, 0x3f800000    # 1.0f

    .line 1939
    .line 1940
    invoke-virtual {v1, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 1941
    .line 1942
    .line 1943
    move-result-object v8

    .line 1944
    new-instance v1, Lg60;

    .line 1945
    .line 1946
    const/4 v6, 0x1

    .line 1947
    move-object v5, v11

    .line 1948
    invoke-direct/range {v1 .. v6}, Lg60;-><init>(Lj60;Lh60;Landroid/view/ViewPropertyAnimator;Landroid/view/View;I)V

    .line 1949
    .line 1950
    .line 1951
    invoke-virtual {v8, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 1952
    .line 1953
    .line 1954
    move-result-object v1

    .line 1955
    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 1956
    .line 1957
    .line 1958
    goto/16 :goto_26

    .line 1959
    .line 1960
    :cond_3f
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1961
    .line 1962
    .line 1963
    iget-object v1, v2, Lj60;->n:Ljava/util/ArrayList;

    .line 1964
    .line 1965
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1966
    .line 1967
    .line 1968
    return-void

    .line 1969
    :pswitch_17
    iget-object v0, v1, Ldp0;->c:Ljava/lang/Object;

    .line 1970
    .line 1971
    check-cast v0, Lcom/google/android/material/datepicker/g;

    .line 1972
    .line 1973
    iget-object v2, v0, Lcom/google/android/material/datepicker/g;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 1974
    .line 1975
    iget-object v3, v0, Lcom/google/android/material/datepicker/g;->b:Ljava/text/SimpleDateFormat;

    .line 1976
    .line 1977
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v4

    .line 1981
    sget v5, Lcom/google/android/material/R$string;->mtrl_picker_invalid_format:I

    .line 1982
    .line 1983
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1984
    .line 1985
    .line 1986
    move-result-object v5

    .line 1987
    sget v6, Lcom/google/android/material/R$string;->mtrl_picker_invalid_format_use:I

    .line 1988
    .line 1989
    invoke-virtual {v4, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1990
    .line 1991
    .line 1992
    move-result-object v6

    .line 1993
    iget-object v1, v1, Ldp0;->b:Ljava/lang/Object;

    .line 1994
    .line 1995
    check-cast v1, Ljava/lang/String;

    .line 1996
    .line 1997
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v1

    .line 2001
    invoke-static {v6, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2002
    .line 2003
    .line 2004
    move-result-object v1

    .line 2005
    sget v6, Lcom/google/android/material/R$string;->mtrl_picker_invalid_format_example:I

    .line 2006
    .line 2007
    invoke-virtual {v4, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2008
    .line 2009
    .line 2010
    move-result-object v4

    .line 2011
    new-instance v6, Ljava/util/Date;

    .line 2012
    .line 2013
    invoke-static {}, Lh13;->e()Ljava/util/Calendar;

    .line 2014
    .line 2015
    .line 2016
    move-result-object v7

    .line 2017
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 2018
    .line 2019
    .line 2020
    move-result-wide v7

    .line 2021
    invoke-direct {v6, v7, v8}, Ljava/util/Date;-><init>(J)V

    .line 2022
    .line 2023
    .line 2024
    invoke-virtual {v3, v6}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 2025
    .line 2026
    .line 2027
    move-result-object v3

    .line 2028
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 2029
    .line 2030
    .line 2031
    move-result-object v3

    .line 2032
    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v3

    .line 2036
    new-instance v4, Ljava/lang/StringBuilder;

    .line 2037
    .line 2038
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 2039
    .line 2040
    .line 2041
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2042
    .line 2043
    .line 2044
    const-string v5, "\n"

    .line 2045
    .line 2046
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2047
    .line 2048
    .line 2049
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2050
    .line 2051
    .line 2052
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2053
    .line 2054
    .line 2055
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2056
    .line 2057
    .line 2058
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2059
    .line 2060
    .line 2061
    move-result-object v1

    .line 2062
    invoke-virtual {v2, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 2063
    .line 2064
    .line 2065
    invoke-virtual {v0}, Lcom/google/android/material/datepicker/g;->a()V

    .line 2066
    .line 2067
    .line 2068
    return-void

    .line 2069
    :pswitch_18
    move/from16 v16, v4

    .line 2070
    .line 2071
    :try_start_e
    iget-object v0, v1, Ldp0;->c:Ljava/lang/Object;

    .line 2072
    .line 2073
    check-cast v0, Lls;

    .line 2074
    .line 2075
    iget-object v2, v1, Ldp0;->b:Ljava/lang/Object;

    .line 2076
    .line 2077
    check-cast v2, Ls81;

    .line 2078
    .line 2079
    invoke-static {v2}, Lw11;->r(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 2080
    .line 2081
    .line 2082
    move-result-object v2

    .line 2083
    iget-object v0, v0, Lyo0;->b:Lum;

    .line 2084
    .line 2085
    if-eqz v0, :cond_40

    .line 2086
    .line 2087
    invoke-virtual {v0, v2}, Lum;->a(Ljava/lang/Object;)Z
    :try_end_e
    .catch Ljava/util/concurrent/CancellationException; {:try_start_e .. :try_end_e} :catch_b
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_e .. :try_end_e} :catch_a
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 2088
    .line 2089
    .line 2090
    :cond_40
    :goto_29
    iget-object v0, v1, Ldp0;->c:Ljava/lang/Object;

    .line 2091
    .line 2092
    check-cast v0, Lls;

    .line 2093
    .line 2094
    const/4 v1, 0x0

    .line 2095
    iput-object v1, v0, Lls;->i:Ls81;

    .line 2096
    .line 2097
    goto :goto_2a

    .line 2098
    :catchall_2
    move-exception v0

    .line 2099
    goto :goto_2b

    .line 2100
    :catch_a
    move-exception v0

    .line 2101
    :try_start_f
    iget-object v2, v1, Ldp0;->c:Ljava/lang/Object;

    .line 2102
    .line 2103
    check-cast v2, Lls;

    .line 2104
    .line 2105
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 2106
    .line 2107
    .line 2108
    move-result-object v0

    .line 2109
    iget-object v2, v2, Lyo0;->b:Lum;

    .line 2110
    .line 2111
    if-eqz v2, :cond_40

    .line 2112
    .line 2113
    invoke-virtual {v2, v0}, Lum;->b(Ljava/lang/Throwable;)Z

    .line 2114
    .line 2115
    .line 2116
    goto :goto_29

    .line 2117
    :catch_b
    iget-object v0, v1, Ldp0;->c:Ljava/lang/Object;

    .line 2118
    .line 2119
    check-cast v0, Lls;

    .line 2120
    .line 2121
    move/from16 v2, v16

    .line 2122
    .line 2123
    invoke-virtual {v0, v2}, Lls;->cancel(Z)Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 2124
    .line 2125
    .line 2126
    goto :goto_29

    .line 2127
    :goto_2a
    return-void

    .line 2128
    :goto_2b
    iget-object v1, v1, Ldp0;->c:Ljava/lang/Object;

    .line 2129
    .line 2130
    check-cast v1, Lls;

    .line 2131
    .line 2132
    const/4 v2, 0x0

    .line 2133
    iput-object v2, v1, Lls;->i:Ls81;

    .line 2134
    .line 2135
    throw v0

    .line 2136
    :pswitch_19
    :try_start_10
    iget-object v0, v1, Ldp0;->b:Ljava/lang/Object;

    .line 2137
    .line 2138
    check-cast v0, Lcom/supercell/titan/GameApp;

    .line 2139
    .line 2140
    const-string v2, "clipboard"

    .line 2141
    .line 2142
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 2143
    .line 2144
    .line 2145
    move-result-object v0

    .line 2146
    check-cast v0, Landroid/content/ClipboardManager;

    .line 2147
    .line 2148
    const-string v2, "text"

    .line 2149
    .line 2150
    iget-object v1, v1, Ldp0;->c:Ljava/lang/Object;

    .line 2151
    .line 2152
    check-cast v1, Ljava/lang/String;

    .line 2153
    .line 2154
    invoke-static {v2, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v1

    .line 2158
    invoke-virtual {v0, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_c

    .line 2159
    .line 2160
    .line 2161
    goto :goto_2c

    .line 2162
    :catch_c
    move-exception v0

    .line 2163
    invoke-static {v0}, Lcom/supercell/titan/GameApp;->debuggerException(Ljava/lang/Exception;)V

    .line 2164
    .line 2165
    .line 2166
    :goto_2c
    return-void

    .line 2167
    :pswitch_1a
    iget-object v0, v1, Ldp0;->b:Ljava/lang/Object;

    .line 2168
    .line 2169
    check-cast v0, Landroid/app/Application;

    .line 2170
    .line 2171
    iget-object v1, v1, Ldp0;->c:Ljava/lang/Object;

    .line 2172
    .line 2173
    check-cast v1, La3;

    .line 2174
    .line 2175
    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 2176
    .line 2177
    .line 2178
    return-void

    .line 2179
    :pswitch_1b
    iget-object v0, v1, Ldp0;->b:Ljava/lang/Object;

    .line 2180
    .line 2181
    check-cast v0, Ld2;

    .line 2182
    .line 2183
    iget-object v1, v1, Ldp0;->c:Ljava/lang/Object;

    .line 2184
    .line 2185
    check-cast v1, Landroidx/appcompat/widget/b;

    .line 2186
    .line 2187
    iget-object v2, v1, Lii;->c:Ljg1;

    .line 2188
    .line 2189
    if-eqz v2, :cond_41

    .line 2190
    .line 2191
    iget-object v3, v2, Ljg1;->e:Lhg1;

    .line 2192
    .line 2193
    if-eqz v3, :cond_41

    .line 2194
    .line 2195
    invoke-interface {v3, v2}, Lhg1;->l(Ljg1;)V

    .line 2196
    .line 2197
    .line 2198
    :cond_41
    iget-object v2, v1, Lii;->v:Lhh1;

    .line 2199
    .line 2200
    check-cast v2, Landroid/view/View;

    .line 2201
    .line 2202
    if-eqz v2, :cond_43

    .line 2203
    .line 2204
    invoke-virtual {v2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 2205
    .line 2206
    .line 2207
    move-result-object v2

    .line 2208
    if-eqz v2, :cond_43

    .line 2209
    .line 2210
    invoke-virtual {v0}, Lzg1;->b()Z

    .line 2211
    .line 2212
    .line 2213
    move-result v2

    .line 2214
    if-eqz v2, :cond_42

    .line 2215
    .line 2216
    goto :goto_2e

    .line 2217
    :cond_42
    iget-object v2, v0, Lzg1;->e:Landroid/view/View;

    .line 2218
    .line 2219
    if-nez v2, :cond_44

    .line 2220
    .line 2221
    :cond_43
    :goto_2d
    const/4 v2, 0x0

    .line 2222
    goto :goto_2f

    .line 2223
    :cond_44
    const/4 v2, 0x0

    .line 2224
    invoke-virtual {v0, v2, v2, v2, v2}, Lzg1;->d(IIZZ)V

    .line 2225
    .line 2226
    .line 2227
    :goto_2e
    iput-object v0, v1, Landroidx/appcompat/widget/b;->e0:Ld2;

    .line 2228
    .line 2229
    goto :goto_2d

    .line 2230
    :goto_2f
    iput-object v2, v1, Landroidx/appcompat/widget/b;->g0:Ldp0;

    .line 2231
    .line 2232
    return-void

    .line 2233
    :pswitch_1c
    iget-object v0, v1, Ldp0;->c:Ljava/lang/Object;

    .line 2234
    .line 2235
    move-object v2, v0

    .line 2236
    check-cast v2, Lxo0;

    .line 2237
    .line 2238
    :try_start_11
    iget-object v0, v1, Ldp0;->b:Ljava/lang/Object;

    .line 2239
    .line 2240
    check-cast v0, Ljava/util/concurrent/Future;

    .line 2241
    .line 2242
    invoke-static {v0}, Lw11;->n(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 2243
    .line 2244
    .line 2245
    move-result-object v0
    :try_end_11
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_11 .. :try_end_11} :catch_f
    .catch Ljava/lang/RuntimeException; {:try_start_11 .. :try_end_11} :catch_e
    .catch Ljava/lang/Error; {:try_start_11 .. :try_end_11} :catch_d

    .line 2246
    invoke-interface {v2, v0}, Lxo0;->onSuccess(Ljava/lang/Object;)V

    .line 2247
    .line 2248
    .line 2249
    goto :goto_32

    .line 2250
    :catch_d
    move-exception v0

    .line 2251
    goto :goto_30

    .line 2252
    :catch_e
    move-exception v0

    .line 2253
    goto :goto_30

    .line 2254
    :catch_f
    move-exception v0

    .line 2255
    goto :goto_31

    .line 2256
    :goto_30
    invoke-interface {v2, v0}, Lxo0;->onFailure(Ljava/lang/Throwable;)V

    .line 2257
    .line 2258
    .line 2259
    goto :goto_32

    .line 2260
    :goto_31
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 2261
    .line 2262
    .line 2263
    move-result-object v1

    .line 2264
    if-nez v1, :cond_45

    .line 2265
    .line 2266
    invoke-interface {v2, v0}, Lxo0;->onFailure(Ljava/lang/Throwable;)V

    .line 2267
    .line 2268
    .line 2269
    goto :goto_32

    .line 2270
    :cond_45
    invoke-interface {v2, v1}, Lxo0;->onFailure(Ljava/lang/Throwable;)V

    .line 2271
    .line 2272
    .line 2273
    :goto_32
    return-void

    .line 2274
    nop

    .line 2275
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

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Ldp0;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Ldp0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :sswitch_0
    iget-object p0, p0, Ldp0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ljava/lang/Runnable;

    .line 16
    .line 17
    const-string v0, "}"

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "SequentialExecutorWorker{running="

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v2, "SequentialExecutorWorker{state="

    .line 42
    .line 43
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    check-cast v1, Lx92;

    .line 47
    .line 48
    iget v1, v1, Lx92;->c:I

    .line 49
    .line 50
    const/4 v2, 0x1

    .line 51
    if-eq v1, v2, :cond_4

    .line 52
    .line 53
    const/4 v2, 0x2

    .line 54
    if-eq v1, v2, :cond_3

    .line 55
    .line 56
    const/4 v2, 0x3

    .line 57
    if-eq v1, v2, :cond_2

    .line 58
    .line 59
    const/4 v2, 0x4

    .line 60
    if-eq v1, v2, :cond_1

    .line 61
    .line 62
    const-string v1, "null"

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const-string v1, "RUNNING"

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const-string v1, "QUEUED"

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    const-string v1, "QUEUING"

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    const-string v1, "IDLE"

    .line 75
    .line 76
    :goto_0
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    :goto_1
    return-object p0

    .line 87
    :sswitch_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-class v0, Ldp0;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v0, ","

    .line 102
    .line 103
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    check-cast v1, Lxo0;

    .line 107
    .line 108
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    nop

    .line 117
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x14 -> :sswitch_0
    .end sparse-switch
.end method

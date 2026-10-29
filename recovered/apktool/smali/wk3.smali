.class public final Lwk3;
.super Lbe3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lsl3;


# direct methods
.method public constructor <init>(Lsl3;Ljk3;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwk3;->e:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lwk3;->f:Lsl3;

    .line 10
    .line 11
    invoke-direct {p0, p2}, Lbe3;-><init>(Ljk3;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    iput-object p1, p0, Lwk3;->f:Lsl3;

    .line 16
    .line 17
    invoke-direct {p0, p2}, Lbe3;-><init>(Ljk3;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lwk3;->f:Lsl3;

    .line 25
    .line 26
    invoke-direct {p0, p2}, Lbe3;-><init>(Ljk3;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_2
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lwk3;->f:Lsl3;

    .line 34
    .line 35
    invoke-direct {p0, p2}, Lbe3;-><init>(Ljk3;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwk3;->e:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, Lwk3;->f:Lsl3;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v3, Lsq3;->a:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    check-cast v1, Lij3;

    .line 15
    .line 16
    iget-object v4, v1, Lij3;->e:Lki3;

    .line 17
    .line 18
    iget-object v5, v1, Lij3;->f:Luh3;

    .line 19
    .line 20
    iget-object v0, v1, Lij3;->i:Lbj3;

    .line 21
    .line 22
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lbj3;->y()V

    .line 26
    .line 27
    .line 28
    iget-object v7, v1, Lij3;->Z:Lwl3;

    .line 29
    .line 30
    invoke-static {v7}, Lij3;->l(Lhk3;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, v7, Lsq3;->a:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v6, v0

    .line 36
    check-cast v6, Lij3;

    .line 37
    .line 38
    invoke-static {v7}, Lij3;->l(Lhk3;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Lij3;->q()Lih3;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lih3;->F()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    iget-object v0, v1, Lij3;->d:Lpd3;

    .line 50
    .line 51
    const-string v9, "google_analytics_adid_collection_enabled"

    .line 52
    .line 53
    invoke-virtual {v0, v9}, Lpd3;->L(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-static {v5}, Lij3;->l(Lhk3;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, v5, Luh3;->Y:Lsh3;

    .line 70
    .line 71
    const-string v1, "ADID collection is disabled from Manifest. Skipping"

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_11

    .line 77
    .line 78
    :cond_1
    :goto_0
    invoke-static {v4}, Lij3;->j(Lsq3;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, v4, Lsq3;->a:Ljava/lang/Object;

    .line 82
    .line 83
    move-object v9, v0

    .line 84
    check-cast v9, Lij3;

    .line 85
    .line 86
    invoke-virtual {v4}, Lsq3;->y()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Lki3;->G()Lok3;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sget-object v10, Lnk3;->b:Lnk3;

    .line 94
    .line 95
    invoke-virtual {v0, v10}, Lok3;->i(Lnk3;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const-string v10, ""

    .line 100
    .line 101
    const/4 v11, 0x1

    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    iget-object v0, v9, Lij3;->V:Lxt0;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 110
    .line 111
    .line 112
    move-result-wide v12

    .line 113
    iget-object v0, v4, Lki3;->v:Ljava/lang/String;

    .line 114
    .line 115
    if-eqz v0, :cond_3

    .line 116
    .line 117
    iget-wide v14, v4, Lki3;->U:J

    .line 118
    .line 119
    cmp-long v14, v12, v14

    .line 120
    .line 121
    if-ltz v14, :cond_2

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_2
    new-instance v9, Landroid/util/Pair;

    .line 125
    .line 126
    iget-boolean v10, v4, Lki3;->w:Z

    .line 127
    .line 128
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    invoke-direct {v9, v0, v10}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_3
    :goto_1
    iget-object v0, v9, Lij3;->d:Lpd3;

    .line 137
    .line 138
    sget-object v14, Lvg3;->b:Lug3;

    .line 139
    .line 140
    invoke-virtual {v0, v8, v14}, Lpd3;->G(Ljava/lang/String;Lug3;)J

    .line 141
    .line 142
    .line 143
    move-result-wide v14

    .line 144
    add-long/2addr v14, v12

    .line 145
    iput-wide v14, v4, Lki3;->U:J

    .line 146
    .line 147
    invoke-static {v11}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->setShouldSkipGmsCoreVersionCheck(Z)V

    .line 148
    .line 149
    .line 150
    :try_start_0
    iget-object v0, v9, Lij3;->a:Landroid/content/Context;

    .line 151
    .line 152
    invoke-static {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iput-object v10, v4, Lki3;->v:Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v12

    .line 162
    if-eqz v12, :cond_4

    .line 163
    .line 164
    iput-object v12, v4, Lki3;->v:Ljava/lang/String;

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :catch_0
    move-exception v0

    .line 168
    goto :goto_3

    .line 169
    :cond_4
    :goto_2
    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    iput-boolean v0, v4, Lki3;->w:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :goto_3
    iget-object v9, v9, Lij3;->f:Luh3;

    .line 177
    .line 178
    invoke-static {v9}, Lij3;->l(Lhk3;)V

    .line 179
    .line 180
    .line 181
    iget-object v9, v9, Luh3;->X:Lsh3;

    .line 182
    .line 183
    const-string v12, "Unable to get advertising id"

    .line 184
    .line 185
    invoke-virtual {v9, v0, v12}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    iput-object v10, v4, Lki3;->v:Ljava/lang/String;

    .line 189
    .line 190
    :goto_4
    invoke-static {v2}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->setShouldSkipGmsCoreVersionCheck(Z)V

    .line 191
    .line 192
    .line 193
    new-instance v9, Landroid/util/Pair;

    .line 194
    .line 195
    iget-object v0, v4, Lki3;->v:Ljava/lang/String;

    .line 196
    .line 197
    iget-boolean v10, v4, Lki3;->w:Z

    .line 198
    .line 199
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    invoke-direct {v9, v0, v10}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_5
    new-instance v9, Landroid/util/Pair;

    .line 208
    .line 209
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 210
    .line 211
    invoke-direct {v9, v10, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    :goto_5
    iget-object v0, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v0, Ljava/lang/Boolean;

    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-nez v0, :cond_16

    .line 223
    .line 224
    iget-object v0, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v0, Ljava/lang/CharSequence;

    .line 227
    .line 228
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_6

    .line 233
    .line 234
    goto/16 :goto_10

    .line 235
    .line 236
    :cond_6
    invoke-static {v7}, Lij3;->l(Lhk3;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v7}, Lhk3;->B()V

    .line 240
    .line 241
    .line 242
    iget-object v0, v6, Lij3;->a:Landroid/content/Context;

    .line 243
    .line 244
    const-string v10, "connectivity"

    .line 245
    .line 246
    invoke-virtual {v0, v10}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 251
    .line 252
    const/4 v10, 0x0

    .line 253
    if-eqz v0, :cond_7

    .line 254
    .line 255
    :try_start_1
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 256
    .line 257
    .line 258
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    .line 259
    goto :goto_6

    .line 260
    :catch_1
    :cond_7
    move-object v0, v10

    .line 261
    :goto_6
    if-eqz v0, :cond_15

    .line 262
    .line 263
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-eqz v0, :cond_15

    .line 268
    .line 269
    new-instance v12, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1}, Lij3;->o()Lpn3;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-virtual {v0}, Leg3;->y()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0}, Lwg3;->A()V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0}, Lpn3;->G()Z

    .line 285
    .line 286
    .line 287
    move-result v13

    .line 288
    if-nez v13, :cond_8

    .line 289
    .line 290
    goto :goto_7

    .line 291
    :cond_8
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v0, Lij3;

    .line 294
    .line 295
    iget-object v0, v0, Lij3;->w:Lup3;

    .line 296
    .line 297
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0}, Lup3;->f0()I

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    const v13, 0x392d8

    .line 305
    .line 306
    .line 307
    if-lt v0, v13, :cond_11

    .line 308
    .line 309
    :goto_7
    iget-object v0, v1, Lij3;->X:Lsl3;

    .line 310
    .line 311
    invoke-static {v0}, Lij3;->k(Lwg3;)V

    .line 312
    .line 313
    .line 314
    iget-object v13, v0, Lsq3;->a:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v13, Lij3;

    .line 317
    .line 318
    invoke-virtual {v0}, Leg3;->y()V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v13}, Lij3;->o()Lpn3;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    iget-object v13, v0, Lsq3;->a:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v13, Lij3;

    .line 328
    .line 329
    invoke-virtual {v0}, Leg3;->y()V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0}, Lwg3;->A()V

    .line 333
    .line 334
    .line 335
    iget-object v14, v0, Lpn3;->d:Lcom/google/android/gms/measurement/internal/zzga;

    .line 336
    .line 337
    if-nez v14, :cond_9

    .line 338
    .line 339
    invoke-virtual {v0}, Lpn3;->F()V

    .line 340
    .line 341
    .line 342
    iget-object v0, v13, Lij3;->f:Luh3;

    .line 343
    .line 344
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 345
    .line 346
    .line 347
    iget-object v0, v0, Luh3;->X:Lsh3;

    .line 348
    .line 349
    const-string v13, "Failed to get consents; not connected to service yet."

    .line 350
    .line 351
    invoke-virtual {v0, v13}, Lsh3;->a(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    :goto_8
    move-object v14, v10

    .line 355
    goto :goto_9

    .line 356
    :cond_9
    invoke-virtual {v0, v2}, Lpn3;->P(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 357
    .line 358
    .line 359
    move-result-object v15

    .line 360
    :try_start_2
    invoke-interface {v14, v15}, Lcom/google/android/gms/measurement/internal/zzga;->P(Lcom/google/android/gms/measurement/internal/zzr;)Lcom/google/android/gms/measurement/internal/zzao;

    .line 361
    .line 362
    .line 363
    move-result-object v14

    .line 364
    invoke-virtual {v0}, Lpn3;->M()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    .line 365
    .line 366
    .line 367
    goto :goto_9

    .line 368
    :catch_2
    move-exception v0

    .line 369
    iget-object v13, v13, Lij3;->f:Luh3;

    .line 370
    .line 371
    invoke-static {v13}, Lij3;->l(Lhk3;)V

    .line 372
    .line 373
    .line 374
    iget-object v13, v13, Luh3;->f:Lsh3;

    .line 375
    .line 376
    const-string v14, "Failed to get consents; remote exception"

    .line 377
    .line 378
    invoke-virtual {v13, v0, v14}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    goto :goto_8

    .line 382
    :goto_9
    if-eqz v14, :cond_a

    .line 383
    .line 384
    iget-object v0, v14, Lcom/google/android/gms/measurement/internal/zzao;->a:Landroid/os/Bundle;

    .line 385
    .line 386
    goto :goto_a

    .line 387
    :cond_a
    move-object v0, v10

    .line 388
    :goto_a
    if-nez v0, :cond_d

    .line 389
    .line 390
    iget v0, v1, Lij3;->m0:I

    .line 391
    .line 392
    add-int/lit8 v4, v0, 0x1

    .line 393
    .line 394
    iput v4, v1, Lij3;->m0:I

    .line 395
    .line 396
    const/16 v4, 0xa

    .line 397
    .line 398
    if-ge v0, v4, :cond_b

    .line 399
    .line 400
    move v2, v11

    .line 401
    :cond_b
    invoke-static {v5}, Lij3;->l(Lhk3;)V

    .line 402
    .line 403
    .line 404
    if-ge v0, v4, :cond_c

    .line 405
    .line 406
    const-string v0, "Retrying."

    .line 407
    .line 408
    goto :goto_b

    .line 409
    :cond_c
    const-string v0, "Skipping."

    .line 410
    .line 411
    :goto_b
    iget-object v4, v5, Luh3;->X:Lsh3;

    .line 412
    .line 413
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 414
    .line 415
    .line 416
    move-result v5

    .line 417
    new-instance v6, Ljava/lang/StringBuilder;

    .line 418
    .line 419
    add-int/lit8 v5, v5, 0x3c

    .line 420
    .line 421
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 422
    .line 423
    .line 424
    const-string v5, "Failed to retrieve DMA consent from the service, "

    .line 425
    .line 426
    const-string v7, " retryCount"

    .line 427
    .line 428
    invoke-static {v6, v5, v0, v7}, Lfm0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    iget v1, v1, Lij3;->m0:I

    .line 433
    .line 434
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    invoke-virtual {v4, v1, v0}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    goto/16 :goto_11

    .line 442
    .line 443
    :cond_d
    const/16 v13, 0x64

    .line 444
    .line 445
    invoke-static {v13, v0}, Lok3;->b(ILandroid/os/Bundle;)Lok3;

    .line 446
    .line 447
    .line 448
    move-result-object v14

    .line 449
    const-string v15, "&gcs="

    .line 450
    .line 451
    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v14}, Lok3;->f()Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v14

    .line 458
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-static {v13, v0}, Lce3;->c(ILandroid/os/Bundle;)Lce3;

    .line 462
    .line 463
    .line 464
    move-result-object v13

    .line 465
    iget-object v14, v13, Lce3;->d:Ljava/lang/String;

    .line 466
    .line 467
    const-string v15, "&dma="

    .line 468
    .line 469
    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    iget-object v13, v13, Lce3;->c:Ljava/lang/Boolean;

    .line 473
    .line 474
    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 475
    .line 476
    invoke-static {v13, v15}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v13

    .line 480
    xor-int/2addr v13, v11

    .line 481
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 485
    .line 486
    .line 487
    move-result v13

    .line 488
    if-nez v13, :cond_e

    .line 489
    .line 490
    const-string v13, "&dma_cps="

    .line 491
    .line 492
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    :cond_e
    const-string v13, "ad_personalization"

    .line 499
    .line 500
    invoke-virtual {v0, v13}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-static {v0}, Lok3;->d(Ljava/lang/String;)Llk3;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    const/4 v13, 0x2

    .line 513
    if-eq v0, v13, :cond_10

    .line 514
    .line 515
    const/4 v13, 0x3

    .line 516
    if-eq v0, v13, :cond_f

    .line 517
    .line 518
    move-object v15, v10

    .line 519
    goto :goto_c

    .line 520
    :cond_f
    sget-object v15, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 521
    .line 522
    :cond_10
    :goto_c
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 523
    .line 524
    invoke-static {v15, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result v0

    .line 528
    xor-int/2addr v0, v11

    .line 529
    const-string v11, "&npa="

    .line 530
    .line 531
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    invoke-static {v5}, Lij3;->l(Lhk3;)V

    .line 538
    .line 539
    .line 540
    iget-object v0, v5, Luh3;->Y:Lsh3;

    .line 541
    .line 542
    const-string v5, "Consent query parameters to Bow"

    .line 543
    .line 544
    invoke-virtual {v0, v12, v5}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 545
    .line 546
    .line 547
    :cond_11
    iget-object v0, v1, Lij3;->w:Lup3;

    .line 548
    .line 549
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v1}, Lij3;->q()Lih3;

    .line 553
    .line 554
    .line 555
    move-result-object v5

    .line 556
    iget-object v5, v5, Lsq3;->a:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v5, Lij3;

    .line 559
    .line 560
    iget-object v5, v5, Lij3;->d:Lpd3;

    .line 561
    .line 562
    invoke-virtual {v5}, Lpd3;->E()V

    .line 563
    .line 564
    .line 565
    iget-object v5, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 566
    .line 567
    check-cast v5, Ljava/lang/String;

    .line 568
    .line 569
    iget-object v4, v4, Lki3;->f0:Lio/sentry/android/core/s;

    .line 570
    .line 571
    invoke-virtual {v4}, Lio/sentry/android/core/s;->a()J

    .line 572
    .line 573
    .line 574
    move-result-wide v13

    .line 575
    const-wide/16 v15, -0x1

    .line 576
    .line 577
    add-long/2addr v13, v15

    .line 578
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v4

    .line 582
    iget-object v9, v0, Lsq3;->a:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast v9, Lij3;

    .line 585
    .line 586
    const-string v11, "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version="

    .line 587
    .line 588
    const-string v12, "v130000."

    .line 589
    .line 590
    :try_start_3
    invoke-static {v5}, Lkb1;->k(Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    invoke-static {v8}, Lkb1;->k(Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v0}, Lup3;->f0()I

    .line 597
    .line 598
    .line 599
    move-result v0

    .line 600
    new-instance v15, Ljava/lang/StringBuilder;

    .line 601
    .line 602
    invoke-direct {v15, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    new-instance v12, Ljava/lang/StringBuilder;

    .line 613
    .line 614
    invoke-direct {v12, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    const-string v0, "&rdid="

    .line 621
    .line 622
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 626
    .line 627
    .line 628
    const-string v0, "&bundleid="

    .line 629
    .line 630
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 634
    .line 635
    .line 636
    const-string v0, "&retry="

    .line 637
    .line 638
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    iget-object v5, v9, Lij3;->d:Lpd3;

    .line 649
    .line 650
    const-string v11, "debug.deferred.deeplink"

    .line 651
    .line 652
    invoke-virtual {v5, v11}, Lpd3;->D(Ljava/lang/String;)Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v5

    .line 656
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 657
    .line 658
    .line 659
    move-result v5

    .line 660
    if-eqz v5, :cond_12

    .line 661
    .line 662
    const-string v5, "&ddl_test=1"

    .line 663
    .line 664
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    goto :goto_d

    .line 669
    :catch_3
    move-exception v0

    .line 670
    goto :goto_e

    .line 671
    :catch_4
    move-exception v0

    .line 672
    goto :goto_e

    .line 673
    :cond_12
    :goto_d
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 674
    .line 675
    .line 676
    move-result v5

    .line 677
    if-nez v5, :cond_14

    .line 678
    .line 679
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    .line 680
    .line 681
    .line 682
    move-result v5

    .line 683
    const/16 v11, 0x26

    .line 684
    .line 685
    if-eq v5, v11, :cond_13

    .line 686
    .line 687
    const-string v5, "&"

    .line 688
    .line 689
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    :cond_13
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    :cond_14
    new-instance v4, Ljava/net/URL;

    .line 698
    .line 699
    invoke-direct {v4, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/net/MalformedURLException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    .line 700
    .line 701
    .line 702
    move-object v9, v4

    .line 703
    goto :goto_f

    .line 704
    :goto_e
    iget-object v4, v9, Lij3;->f:Luh3;

    .line 705
    .line 706
    invoke-static {v4}, Lij3;->l(Lhk3;)V

    .line 707
    .line 708
    .line 709
    iget-object v4, v4, Luh3;->f:Lsh3;

    .line 710
    .line 711
    const-string v5, "Failed to create BOW URL for Deferred Deep Link. exception"

    .line 712
    .line 713
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    invoke-virtual {v4, v0, v5}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 718
    .line 719
    .line 720
    move-object v9, v10

    .line 721
    :goto_f
    if-eqz v9, :cond_17

    .line 722
    .line 723
    invoke-static {v7}, Lij3;->l(Lhk3;)V

    .line 724
    .line 725
    .line 726
    new-instance v12, Lpi3;

    .line 727
    .line 728
    invoke-direct {v12, v1}, Lpi3;-><init>(Ljava/lang/Object;)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v7}, Lhk3;->B()V

    .line 732
    .line 733
    .line 734
    iget-object v0, v6, Lij3;->i:Lbj3;

    .line 735
    .line 736
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 737
    .line 738
    .line 739
    new-instance v6, Leu0;

    .line 740
    .line 741
    const/4 v10, 0x0

    .line 742
    const/4 v11, 0x0

    .line 743
    invoke-direct/range {v6 .. v12}, Leu0;-><init>(Lwl3;Ljava/lang/String;Ljava/net/URL;[BLjava/util/HashMap;Lul3;)V

    .line 744
    .line 745
    .line 746
    invoke-virtual {v0, v6}, Lbj3;->L(Ljava/lang/Runnable;)V

    .line 747
    .line 748
    .line 749
    goto :goto_11

    .line 750
    :cond_15
    invoke-static {v5}, Lij3;->l(Lhk3;)V

    .line 751
    .line 752
    .line 753
    iget-object v0, v5, Luh3;->w:Lsh3;

    .line 754
    .line 755
    const-string v1, "Network is not available for Deferred Deep Link request. Skipping"

    .line 756
    .line 757
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 758
    .line 759
    .line 760
    goto :goto_11

    .line 761
    :cond_16
    :goto_10
    invoke-static {v5}, Lij3;->l(Lhk3;)V

    .line 762
    .line 763
    .line 764
    iget-object v0, v5, Luh3;->Y:Lsh3;

    .line 765
    .line 766
    const-string v1, "ADID unavailable to retrieve Deferred Deep Link. Skipping"

    .line 767
    .line 768
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 769
    .line 770
    .line 771
    :cond_17
    :goto_11
    if-eqz v2, :cond_18

    .line 772
    .line 773
    iget-object v0, v3, Lsl3;->e0:Lwk3;

    .line 774
    .line 775
    const-wide/16 v1, 0x7d0

    .line 776
    .line 777
    invoke-virtual {v0, v1, v2}, Lbe3;->b(J)V

    .line 778
    .line 779
    .line 780
    :cond_18
    return-void

    .line 781
    :pswitch_0
    invoke-virtual {v3}, Lsl3;->F()V

    .line 782
    .line 783
    .line 784
    return-void

    .line 785
    :pswitch_1
    invoke-virtual {v3}, Lsl3;->X()V

    .line 786
    .line 787
    .line 788
    return-void

    .line 789
    :pswitch_2
    new-instance v0, Ljava/lang/Thread;

    .line 790
    .line 791
    iget-object v1, v3, Lsq3;->a:Ljava/lang/Object;

    .line 792
    .line 793
    check-cast v1, Lij3;

    .line 794
    .line 795
    iget-object v1, v1, Lij3;->X:Lsl3;

    .line 796
    .line 797
    invoke-static {v1}, Lij3;->k(Lwg3;)V

    .line 798
    .line 799
    .line 800
    new-instance v3, Luk3;

    .line 801
    .line 802
    invoke-direct {v3, v1, v2}, Luk3;-><init>(Lsl3;I)V

    .line 803
    .line 804
    .line 805
    invoke-direct {v0, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 806
    .line 807
    .line 808
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 809
    .line 810
    .line 811
    return-void

    .line 812
    nop

    .line 813
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

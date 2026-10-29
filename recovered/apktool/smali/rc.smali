.class public final Lrc;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzjc;Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/16 p2, 0x8

    .line 2
    .line 3
    iput p2, p0, Lrc;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lrc;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 11
    iput p2, p0, Lrc;->a:I

    iput-object p1, p0, Lrc;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lrc;->a:I

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lrc;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzjc;

    .line 16
    .line 17
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 18
    .line 19
    invoke-virtual {v1}, Lmp3;->A()V

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 23
    .line 24
    iget-object v0, v0, Lmp3;->v:Lci3;

    .line 25
    .line 26
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lsq3;->y()V

    .line 30
    .line 31
    .line 32
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v1, "Unexpected call on client side"

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :pswitch_0
    iget-object v0, v0, Lrc;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lvi3;

    .line 43
    .line 44
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzt;

    .line 45
    .line 46
    iget-object v0, v0, Lvi3;->V:Lac3;

    .line 47
    .line 48
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/zzt;-><init>(Lcom/google/android/gms/internal/measurement/zzr;)V

    .line 49
    .line 50
    .line 51
    return-object v1

    .line 52
    :pswitch_1
    iget-object v0, v0, Lrc;->b:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v1, v0

    .line 55
    check-cast v1, Lne3;

    .line 56
    .line 57
    iget-object v0, v1, Lne3;->b:Lej;

    .line 58
    .line 59
    iget-object v6, v0, Lej;->a:Ljava/lang/Object;

    .line 60
    .line 61
    monitor-enter v6

    .line 62
    :try_start_0
    iget-object v0, v1, Lne3;->b:Lej;

    .line 63
    .line 64
    iget v0, v0, Lej;->b:I

    .line 65
    .line 66
    const/4 v7, 0x3

    .line 67
    if-ne v0, v7, :cond_0

    .line 68
    .line 69
    monitor-exit v6

    .line 70
    goto/16 :goto_23

    .line 71
    .line 72
    :catchall_0
    move-exception v0

    .line 73
    goto/16 :goto_24

    .line 74
    .line 75
    :cond_0
    iget-object v0, v1, Lne3;->b:Lej;

    .line 76
    .line 77
    iget v8, v0, Lej;->b:I

    .line 78
    .line 79
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_1

    .line 85
    .line 86
    new-instance v0, Landroid/os/Bundle;

    .line 87
    .line 88
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string v6, "accountName"

    .line 92
    .line 93
    invoke-virtual {v0, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    iget-object v6, v1, Lne3;->b:Lej;

    .line 97
    .line 98
    iget-object v9, v6, Lej;->c:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v6, v6, Lej;->A:Ljava/lang/Long;

    .line 101
    .line 102
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 103
    .line 104
    .line 105
    move-result-wide v10

    .line 106
    invoke-static {v0, v9, v10, v11}, Lcom/google/android/gms/internal/play_billing/zze;->zzc(Landroid/os/Bundle;Ljava/lang/String;J)Landroid/os/Bundle;

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    move-object v0, v5

    .line 111
    :goto_0
    const/4 v6, 0x6

    .line 112
    :try_start_1
    iget-object v9, v1, Lne3;->b:Lej;

    .line 113
    .line 114
    iget-object v9, v9, Lej;->a:Ljava/lang/Object;

    .line 115
    .line 116
    monitor-enter v9
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 117
    :try_start_2
    iget-object v10, v1, Lne3;->b:Lej;

    .line 118
    .line 119
    iget-object v10, v10, Lej;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 120
    .line 121
    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 122
    iget-object v9, v1, Lne3;->b:Lej;

    .line 123
    .line 124
    if-nez v10, :cond_2

    .line 125
    .line 126
    :try_start_3
    invoke-virtual {v9, v4}, Lej;->o(I)V

    .line 127
    .line 128
    .line 129
    iget-object v0, v1, Lne3;->b:Lej;

    .line 130
    .line 131
    sget-object v2, Lkf3;->j:Lkj;

    .line 132
    .line 133
    const/16 v7, 0x77

    .line 134
    .line 135
    invoke-virtual {v0, v7, v6, v2}, Lej;->x(IILkj;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v2}, Lne3;->a(Lkj;)V

    .line 139
    .line 140
    .line 141
    goto/16 :goto_23

    .line 142
    .line 143
    :catch_0
    move-exception v0

    .line 144
    goto/16 :goto_19

    .line 145
    .line 146
    :cond_2
    iget-object v9, v9, Lej;->f:Landroid/content/Context;

    .line 147
    .line 148
    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    move v13, v7

    .line 153
    const/16 v12, 0x17

    .line 154
    .line 155
    :goto_1
    if-lt v12, v7, :cond_5

    .line 156
    .line 157
    if-nez v0, :cond_3

    .line 158
    .line 159
    const-string v13, "subs"

    .line 160
    .line 161
    invoke-interface {v10, v12, v9, v13}, Lcom/google/android/gms/internal/play_billing/zzan;->zzy(ILjava/lang/String;Ljava/lang/String;)I

    .line 162
    .line 163
    .line 164
    move-result v13

    .line 165
    goto :goto_2

    .line 166
    :cond_3
    const-string v13, "subs"

    .line 167
    .line 168
    invoke-interface {v10, v12, v9, v13, v0}, Lcom/google/android/gms/internal/play_billing/zzan;->zzc(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I

    .line 169
    .line 170
    .line 171
    move-result v13

    .line 172
    :goto_2
    if-nez v13, :cond_4

    .line 173
    .line 174
    const-string v14, "BillingClient"

    .line 175
    .line 176
    new-instance v15, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    .line 180
    .line 181
    const-string v11, "highestLevelSupportedForSubs: "

    .line 182
    .line 183
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    invoke-static {v14, v11}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_4
    add-int/lit8 v12, v12, -0x1

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_5
    move v12, v4

    .line 201
    :goto_3
    iget-object v11, v1, Lne3;->b:Lej;

    .line 202
    .line 203
    if-lt v12, v7, :cond_6

    .line 204
    .line 205
    move v14, v3

    .line 206
    goto :goto_4

    .line 207
    :cond_6
    move v14, v4

    .line 208
    :goto_4
    iput-boolean v14, v11, Lej;->j:Z

    .line 209
    .line 210
    const/16 v11, 0x9

    .line 211
    .line 212
    if-ge v12, v7, :cond_7

    .line 213
    .line 214
    const-string v12, "BillingClient"

    .line 215
    .line 216
    const-string v14, "In-app billing API does not support subscription on this device."

    .line 217
    .line 218
    invoke-static {v12, v14}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    move v12, v11

    .line 222
    goto :goto_5

    .line 223
    :cond_7
    move v12, v3

    .line 224
    :goto_5
    move v14, v13

    .line 225
    const/16 v13, 0x17

    .line 226
    .line 227
    :goto_6
    if-lt v13, v7, :cond_a

    .line 228
    .line 229
    if-nez v0, :cond_8

    .line 230
    .line 231
    const-string v14, "inapp"

    .line 232
    .line 233
    invoke-interface {v10, v13, v9, v14}, Lcom/google/android/gms/internal/play_billing/zzan;->zzy(ILjava/lang/String;Ljava/lang/String;)I

    .line 234
    .line 235
    .line 236
    move-result v14

    .line 237
    goto :goto_7

    .line 238
    :cond_8
    const-string v14, "inapp"

    .line 239
    .line 240
    invoke-interface {v10, v13, v9, v14, v0}, Lcom/google/android/gms/internal/play_billing/zzan;->zzc(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I

    .line 241
    .line 242
    .line 243
    move-result v14

    .line 244
    :goto_7
    if-nez v14, :cond_9

    .line 245
    .line 246
    iget-object v0, v1, Lne3;->b:Lej;

    .line 247
    .line 248
    iput v13, v0, Lej;->k:I

    .line 249
    .line 250
    const-string v0, "BillingClient"

    .line 251
    .line 252
    new-instance v9, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 255
    .line 256
    .line 257
    const-string v10, "mHighestLevelSupportedForInApp: "

    .line 258
    .line 259
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    invoke-static {v0, v9}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    goto :goto_8

    .line 273
    :cond_9
    add-int/lit8 v13, v13, -0x1

    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_a
    :goto_8
    iget-object v0, v1, Lne3;->b:Lej;

    .line 277
    .line 278
    iget v9, v0, Lej;->k:I

    .line 279
    .line 280
    const/16 v10, 0x15

    .line 281
    .line 282
    if-lt v9, v10, :cond_b

    .line 283
    .line 284
    move v10, v3

    .line 285
    goto :goto_9

    .line 286
    :cond_b
    move v10, v4

    .line 287
    :goto_9
    iput-boolean v10, v0, Lej;->v:Z

    .line 288
    .line 289
    const/16 v10, 0x14

    .line 290
    .line 291
    if-lt v9, v10, :cond_c

    .line 292
    .line 293
    move v10, v3

    .line 294
    goto :goto_a

    .line 295
    :cond_c
    move v10, v4

    .line 296
    :goto_a
    iput-boolean v10, v0, Lej;->u:Z

    .line 297
    .line 298
    const/16 v10, 0x13

    .line 299
    .line 300
    if-lt v9, v10, :cond_d

    .line 301
    .line 302
    move v10, v3

    .line 303
    goto :goto_b

    .line 304
    :cond_d
    move v10, v4

    .line 305
    :goto_b
    iput-boolean v10, v0, Lej;->t:Z

    .line 306
    .line 307
    const/16 v10, 0x12

    .line 308
    .line 309
    if-lt v9, v10, :cond_e

    .line 310
    .line 311
    move v10, v3

    .line 312
    goto :goto_c

    .line 313
    :cond_e
    move v10, v4

    .line 314
    :goto_c
    iput-boolean v10, v0, Lej;->s:Z

    .line 315
    .line 316
    const/16 v10, 0x11

    .line 317
    .line 318
    if-lt v9, v10, :cond_f

    .line 319
    .line 320
    move v10, v3

    .line 321
    goto :goto_d

    .line 322
    :cond_f
    move v10, v4

    .line 323
    :goto_d
    iput-boolean v10, v0, Lej;->r:Z

    .line 324
    .line 325
    const/16 v10, 0x10

    .line 326
    .line 327
    if-lt v9, v10, :cond_10

    .line 328
    .line 329
    move v10, v3

    .line 330
    goto :goto_e

    .line 331
    :cond_10
    move v10, v4

    .line 332
    :goto_e
    iput-boolean v10, v0, Lej;->q:Z

    .line 333
    .line 334
    const/16 v10, 0xf

    .line 335
    .line 336
    if-lt v9, v10, :cond_11

    .line 337
    .line 338
    move v10, v3

    .line 339
    goto :goto_f

    .line 340
    :cond_11
    move v10, v4

    .line 341
    :goto_f
    iput-boolean v10, v0, Lej;->p:Z

    .line 342
    .line 343
    const/16 v10, 0xe

    .line 344
    .line 345
    if-lt v9, v10, :cond_12

    .line 346
    .line 347
    move v10, v3

    .line 348
    goto :goto_10

    .line 349
    :cond_12
    move v10, v4

    .line 350
    :goto_10
    iput-boolean v10, v0, Lej;->o:Z

    .line 351
    .line 352
    if-lt v9, v2, :cond_13

    .line 353
    .line 354
    move v2, v3

    .line 355
    goto :goto_11

    .line 356
    :cond_13
    move v2, v4

    .line 357
    :goto_11
    iput-boolean v2, v0, Lej;->n:Z

    .line 358
    .line 359
    if-lt v9, v11, :cond_14

    .line 360
    .line 361
    move v2, v3

    .line 362
    goto :goto_12

    .line 363
    :cond_14
    move v2, v4

    .line 364
    :goto_12
    iput-boolean v2, v0, Lej;->m:Z

    .line 365
    .line 366
    if-lt v9, v6, :cond_15

    .line 367
    .line 368
    move v2, v3

    .line 369
    goto :goto_13

    .line 370
    :cond_15
    move v2, v4

    .line 371
    :goto_13
    iput-boolean v2, v0, Lej;->l:Z

    .line 372
    .line 373
    if-ge v9, v7, :cond_16

    .line 374
    .line 375
    const-string v0, "BillingClient"

    .line 376
    .line 377
    const-string v2, "In-app billing API version 3 is not supported on this device."

    .line 378
    .line 379
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    const/16 v12, 0x24

    .line 383
    .line 384
    :cond_16
    if-nez v14, :cond_1b

    .line 385
    .line 386
    iget-object v0, v1, Lne3;->b:Lej;

    .line 387
    .line 388
    iget-object v2, v0, Lej;->a:Ljava/lang/Object;

    .line 389
    .line 390
    monitor-enter v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 391
    :try_start_4
    iget-object v0, v1, Lne3;->b:Lej;

    .line 392
    .line 393
    iget v0, v0, Lej;->b:I

    .line 394
    .line 395
    if-ne v0, v7, :cond_17

    .line 396
    .line 397
    monitor-exit v2

    .line 398
    goto/16 :goto_23

    .line 399
    .line 400
    :catchall_1
    move-exception v0

    .line 401
    goto :goto_17

    .line 402
    :cond_17
    if-ne v8, v3, :cond_18

    .line 403
    .line 404
    move v0, v4

    .line 405
    goto :goto_14

    .line 406
    :cond_18
    move v0, v3

    .line 407
    :goto_14
    iget-object v7, v1, Lne3;->b:Lej;

    .line 408
    .line 409
    const/4 v9, 0x2

    .line 410
    invoke-virtual {v7, v9}, Lej;->o(I)V

    .line 411
    .line 412
    .line 413
    iget-object v7, v1, Lne3;->b:Lej;

    .line 414
    .line 415
    iget-object v7, v7, Lej;->e:Lu93;

    .line 416
    .line 417
    if-eqz v7, :cond_19

    .line 418
    .line 419
    iget-object v7, v1, Lne3;->b:Lej;

    .line 420
    .line 421
    iget-object v7, v7, Lej;->e:Lu93;

    .line 422
    .line 423
    goto :goto_15

    .line 424
    :cond_19
    move-object v7, v5

    .line 425
    :goto_15
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 426
    if-eqz v7, :cond_1a

    .line 427
    .line 428
    :try_start_5
    iget-object v2, v1, Lne3;->b:Lej;

    .line 429
    .line 430
    iget-boolean v2, v2, Lej;->v:Z

    .line 431
    .line 432
    invoke-virtual {v7, v2}, Lu93;->B(Z)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 433
    .line 434
    .line 435
    :cond_1a
    :goto_16
    move-object v2, v5

    .line 436
    goto :goto_1e

    .line 437
    :goto_17
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 438
    :try_start_7
    throw v0

    .line 439
    :cond_1b
    if-ne v8, v3, :cond_1c

    .line 440
    .line 441
    move v0, v4

    .line 442
    goto :goto_18

    .line 443
    :cond_1c
    move v0, v3

    .line 444
    :goto_18
    iget-object v2, v1, Lne3;->b:Lej;

    .line 445
    .line 446
    invoke-virtual {v2, v4}, Lej;->o(I)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 447
    .line 448
    .line 449
    goto :goto_16

    .line 450
    :catchall_2
    move-exception v0

    .line 451
    :try_start_8
    monitor-exit v9
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 452
    :try_start_9
    throw v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    .line 453
    :goto_19
    if-ne v8, v3, :cond_1d

    .line 454
    .line 455
    move v2, v4

    .line 456
    goto :goto_1a

    .line 457
    :cond_1d
    move v2, v3

    .line 458
    :goto_1a
    const-string v7, "BillingClient"

    .line 459
    .line 460
    const-string v8, "Exception while checking if billing is supported; try to reconnect"

    .line 461
    .line 462
    invoke-static {v7, v8, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 463
    .line 464
    .line 465
    instance-of v7, v0, Landroid/os/DeadObjectException;

    .line 466
    .line 467
    const/16 v8, 0x2a

    .line 468
    .line 469
    if-eqz v7, :cond_1e

    .line 470
    .line 471
    const/16 v7, 0x65

    .line 472
    .line 473
    :goto_1b
    move v12, v7

    .line 474
    goto :goto_1c

    .line 475
    :cond_1e
    instance-of v7, v0, Landroid/os/RemoteException;

    .line 476
    .line 477
    if-eqz v7, :cond_1f

    .line 478
    .line 479
    const/16 v7, 0x64

    .line 480
    .line 481
    goto :goto_1b

    .line 482
    :cond_1f
    instance-of v7, v0, Ljava/lang/SecurityException;

    .line 483
    .line 484
    if-eqz v7, :cond_20

    .line 485
    .line 486
    const/16 v7, 0x66

    .line 487
    .line 488
    goto :goto_1b

    .line 489
    :cond_20
    move v12, v8

    .line 490
    :goto_1c
    if-ne v12, v8, :cond_21

    .line 491
    .line 492
    invoke-static {v0}, Lif3;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    goto :goto_1d

    .line 497
    :cond_21
    move-object v0, v5

    .line 498
    :goto_1d
    iget-object v7, v1, Lne3;->b:Lej;

    .line 499
    .line 500
    invoke-virtual {v7, v4}, Lej;->o(I)V

    .line 501
    .line 502
    .line 503
    move v14, v2

    .line 504
    move-object v2, v0

    .line 505
    move v0, v14

    .line 506
    move v14, v6

    .line 507
    :goto_1e
    if-nez v14, :cond_23

    .line 508
    .line 509
    iget-object v2, v1, Lne3;->b:Lej;

    .line 510
    .line 511
    if-eq v3, v0, :cond_22

    .line 512
    .line 513
    :try_start_a
    invoke-virtual {v2, v6}, Lej;->z(I)V

    .line 514
    .line 515
    .line 516
    goto :goto_20

    .line 517
    :catchall_3
    move-exception v0

    .line 518
    goto :goto_1f

    .line 519
    :cond_22
    iget-object v0, v2, Lej;->g:Lwe2;

    .line 520
    .line 521
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzlq;->zzc()Lcom/google/android/gms/internal/play_billing/zzlo;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzki;->zzc()Lcom/google/android/gms/internal/play_billing/zzke;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/play_billing/zzke;->zzn(I)Lcom/google/android/gms/internal/play_billing/zzke;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/play_billing/zzlo;->zza(Lcom/google/android/gms/internal/play_billing/zzke;)Lcom/google/android/gms/internal/play_billing/zzlo;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    check-cast v2, Lcom/google/android/gms/internal/play_billing/zzlq;

    .line 540
    .line 541
    invoke-virtual {v0, v2}, Lwe2;->w(Lcom/google/android/gms/internal/play_billing/zzlq;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 542
    .line 543
    .line 544
    goto :goto_20

    .line 545
    :goto_1f
    const-string v2, "BillingClient"

    .line 546
    .line 547
    const-string v3, "Unable to log."

    .line 548
    .line 549
    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 550
    .line 551
    .line 552
    :goto_20
    sget-object v0, Lkf3;->i:Lkj;

    .line 553
    .line 554
    invoke-virtual {v1, v0}, Lne3;->a(Lkj;)V

    .line 555
    .line 556
    .line 557
    goto :goto_23

    .line 558
    :cond_23
    sget-object v4, Lkf3;->a:Lkj;

    .line 559
    .line 560
    if-eq v3, v0, :cond_24

    .line 561
    .line 562
    :try_start_b
    iget-object v0, v1, Lne3;->b:Lej;

    .line 563
    .line 564
    invoke-virtual {v0, v12, v6, v4, v2}, Lej;->y(IILkj;Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    goto :goto_22

    .line 568
    :catchall_4
    move-exception v0

    .line 569
    goto :goto_21

    .line 570
    :cond_24
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzki;->zzc()Lcom/google/android/gms/internal/play_billing/zzke;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    iget v3, v4, Lkj;->a:I

    .line 575
    .line 576
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/play_billing/zzke;->zzn(I)Lcom/google/android/gms/internal/play_billing/zzke;

    .line 577
    .line 578
    .line 579
    iget-object v3, v4, Lkj;->b:Ljava/lang/String;

    .line 580
    .line 581
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/play_billing/zzke;->zzm(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/zzke;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/play_billing/zzke;->zzo(I)Lcom/google/android/gms/internal/play_billing/zzke;

    .line 585
    .line 586
    .line 587
    if-eqz v2, :cond_25

    .line 588
    .line 589
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/zzke;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/zzke;

    .line 590
    .line 591
    .line 592
    :cond_25
    iget-object v2, v1, Lne3;->b:Lej;

    .line 593
    .line 594
    iget-object v2, v2, Lej;->g:Lwe2;

    .line 595
    .line 596
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzlq;->zzc()Lcom/google/android/gms/internal/play_billing/zzlo;

    .line 597
    .line 598
    .line 599
    move-result-object v3

    .line 600
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzki;

    .line 605
    .line 606
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/play_billing/zzlo;->zzm(Lcom/google/android/gms/internal/play_billing/zzki;)Lcom/google/android/gms/internal/play_billing/zzlo;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzlq;

    .line 614
    .line 615
    invoke-virtual {v2, v0}, Lwe2;->w(Lcom/google/android/gms/internal/play_billing/zzlq;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 616
    .line 617
    .line 618
    goto :goto_22

    .line 619
    :goto_21
    const-string v2, "BillingClient"

    .line 620
    .line 621
    const-string v3, "Unable to log."

    .line 622
    .line 623
    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 624
    .line 625
    .line 626
    :goto_22
    sget-object v0, Lkf3;->a:Lkj;

    .line 627
    .line 628
    invoke-virtual {v1, v0}, Lne3;->a(Lkj;)V

    .line 629
    .line 630
    .line 631
    :goto_23
    return-object v5

    .line 632
    :goto_24
    :try_start_c
    monitor-exit v6
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 633
    throw v0

    .line 634
    :pswitch_2
    new-instance v1, Li73;

    .line 635
    .line 636
    iget-object v0, v0, Lrc;->b:Ljava/lang/Object;

    .line 637
    .line 638
    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewRendererBoundaryInterface;

    .line 639
    .line 640
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 641
    .line 642
    .line 643
    iput-object v0, v1, Li73;->a:Lorg/chromium/support_lib_boundary/WebViewRendererBoundaryInterface;

    .line 644
    .line 645
    return-object v1

    .line 646
    :pswitch_3
    iget-object v0, v0, Lrc;->b:Ljava/lang/Object;

    .line 647
    .line 648
    move-object v1, v0

    .line 649
    check-cast v1, Lvd;

    .line 650
    .line 651
    iget-object v0, v1, Lvd;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 652
    .line 653
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 654
    .line 655
    .line 656
    :try_start_d
    invoke-static {v2}, Landroid/os/Process;->setThreadPriority(I)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v1}, Lvd;->a()V

    .line 660
    .line 661
    .line 662
    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 663
    .line 664
    .line 665
    invoke-virtual {v1, v5}, Lvd;->b(Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    return-object v5

    .line 669
    :catchall_5
    move-exception v0

    .line 670
    :try_start_e
    iget-object v2, v1, Lvd;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 671
    .line 672
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 673
    .line 674
    .line 675
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 676
    :catchall_6
    move-exception v0

    .line 677
    invoke-virtual {v1, v5}, Lvd;->b(Ljava/lang/Object;)V

    .line 678
    .line 679
    .line 680
    throw v0

    .line 681
    :pswitch_4
    new-instance v1, Landroid/content/Intent;

    .line 682
    .line 683
    const-string v2, "android.settings.LOCATION_SOURCE_SETTINGS"

    .line 684
    .line 685
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    iget-object v0, v0, Lrc;->b:Ljava/lang/Object;

    .line 689
    .line 690
    check-cast v0, Lcom/supercell/titan/LocationService;

    .line 691
    .line 692
    iget-object v0, v0, Lcom/supercell/titan/LocationService;->c:Lcom/supercell/titan/GameApp;

    .line 693
    .line 694
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 695
    .line 696
    .line 697
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 698
    .line 699
    return-object v0

    .line 700
    :pswitch_5
    new-instance v1, Le01;

    .line 701
    .line 702
    iget-object v0, v0, Lrc;->b:Ljava/lang/Object;

    .line 703
    .line 704
    check-cast v0, Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;

    .line 705
    .line 706
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 707
    .line 708
    .line 709
    iput-object v0, v1, Le01;->a:Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;

    .line 710
    .line 711
    return-object v1

    .line 712
    :pswitch_6
    iget-object v0, v0, Lrc;->b:Ljava/lang/Object;

    .line 713
    .line 714
    check-cast v0, Ljava/lang/Runnable;

    .line 715
    .line 716
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 717
    .line 718
    .line 719
    return-object v5

    .line 720
    :pswitch_7
    const-string v1, ""

    .line 721
    .line 722
    :try_start_f
    iget-object v0, v0, Lrc;->b:Ljava/lang/Object;

    .line 723
    .line 724
    check-cast v0, Lcom/supercell/titan/GameApp;

    .line 725
    .line 726
    const-string v2, "clipboard"

    .line 727
    .line 728
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    check-cast v0, Landroid/content/ClipboardManager;

    .line 733
    .line 734
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    .line 735
    .line 736
    .line 737
    move-result v2

    .line 738
    if-eqz v2, :cond_26

    .line 739
    .line 740
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    .line 741
    .line 742
    .line 743
    move-result-object v2

    .line 744
    invoke-virtual {v2}, Landroid/content/ClipData;->getItemCount()I

    .line 745
    .line 746
    .line 747
    move-result v2

    .line 748
    if-lez v2, :cond_26

    .line 749
    .line 750
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    invoke-virtual {v0, v4}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    invoke-virtual {v0}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_1

    .line 766
    :try_start_10
    const-string v2, "UTF-8"

    .line 767
    .line 768
    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_10
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_10 .. :try_end_10} :catch_2
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1

    .line 769
    .line 770
    .line 771
    move-object v1, v0

    .line 772
    goto :goto_26

    .line 773
    :catch_1
    move-exception v0

    .line 774
    goto :goto_25

    .line 775
    :catch_2
    :try_start_11
    const-string v0, "ApplicationUtil"

    .line 776
    .line 777
    const-string v2, "UTF-8 encoding not found."

    .line 778
    .line 779
    invoke-static {v0, v2}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_1

    .line 780
    .line 781
    .line 782
    goto :goto_26

    .line 783
    :goto_25
    invoke-static {v0}, Lcom/supercell/titan/GameApp;->debuggerException(Ljava/lang/Exception;)V

    .line 784
    .line 785
    .line 786
    :cond_26
    :goto_26
    return-object v1

    .line 787
    :pswitch_data_0
    .packed-switch 0x0
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

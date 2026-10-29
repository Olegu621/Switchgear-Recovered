.class public final synthetic Lkd3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lej;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lej;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lkd3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lkd3;->b:Lej;

    .line 4
    .line 5
    iput-object p2, p0, Lkd3;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lkd3;->d:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lkd3;->a:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x77

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v1, Lkd3;->b:Lej;

    .line 12
    .line 13
    iget-object v2, v1, Lkd3;->c:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v7, v2

    .line 16
    check-cast v7, Ljava/lang/String;

    .line 17
    .line 18
    iget-object v1, v1, Lkd3;->d:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v8, v1

    .line 21
    check-cast v8, Ljava/lang/String;

    .line 22
    .line 23
    const/4 v1, 0x5

    .line 24
    :try_start_0
    iget-object v2, v0, Lej;->a:Ljava/lang/Object;

    .line 25
    .line 26
    monitor-enter v2
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    :try_start_1
    iget-object v4, v0, Lej;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 28
    .line 29
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    if-nez v4, :cond_0

    .line 31
    .line 32
    :try_start_2
    sget-object v0, Lkf3;->j:Lkj;

    .line 33
    .line 34
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzn(Lkj;I)Landroid/os/Bundle;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    goto :goto_2

    .line 39
    :catch_0
    move-exception v0

    .line 40
    goto :goto_0

    .line 41
    :catch_1
    move-exception v0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    iget-object v0, v0, Lej;->f:Landroid/content/Context;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v5, 0x3

    .line 51
    invoke-interface/range {v4 .. v9}, Lcom/google/android/gms/internal/play_billing/zzan;->zzf(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 52
    .line 53
    .line 54
    move-result-object v0
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 55
    goto :goto_2

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 58
    :try_start_4
    throw v0
    :try_end_4
    .catch Landroid/os/DeadObjectException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 59
    :goto_0
    sget-object v2, Lkf3;->h:Lkj;

    .line 60
    .line 61
    invoke-static {v0}, Lif3;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v2, v1, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzo(Lkj;ILjava/lang/String;)Landroid/os/Bundle;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_2

    .line 70
    :goto_1
    sget-object v2, Lkf3;->j:Lkj;

    .line 71
    .line 72
    invoke-static {v0}, Lif3;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v2, v1, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzo(Lkj;ILjava/lang/String;)Landroid/os/Bundle;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    :goto_2
    return-object v0

    .line 81
    :pswitch_0
    iget-object v4, v1, Lkd3;->b:Lej;

    .line 82
    .line 83
    iget-object v0, v1, Lkd3;->c:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Lfs0;

    .line 86
    .line 87
    new-instance v5, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    iget-object v6, v0, Lfs0;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v6, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 95
    .line 96
    const/4 v7, 0x0

    .line 97
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    check-cast v6, Lg02;

    .line 102
    .line 103
    iget-object v11, v6, Lg02;->b:Ljava/lang/String;

    .line 104
    .line 105
    iget-object v0, v0, Lfs0;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 108
    .line 109
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    move v8, v7

    .line 114
    :goto_3
    if-ge v8, v6, :cond_10

    .line 115
    .line 116
    add-int/lit8 v15, v8, 0x14

    .line 117
    .line 118
    if-le v15, v6, :cond_1

    .line 119
    .line 120
    move v9, v6

    .line 121
    goto :goto_4

    .line 122
    :cond_1
    move v9, v15

    .line 123
    :goto_4
    new-instance v10, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-interface {v0, v8, v9}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    invoke-direct {v10, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 130
    .line 131
    .line 132
    new-instance v8, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    move v12, v7

    .line 142
    :goto_5
    if-ge v12, v9, :cond_2

    .line 143
    .line 144
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v13

    .line 148
    check-cast v13, Lg02;

    .line 149
    .line 150
    iget-object v13, v13, Lg02;->a:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    add-int/lit8 v12, v12, 0x1

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_2
    new-instance v12, Landroid/os/Bundle;

    .line 159
    .line 160
    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    .line 161
    .line 162
    .line 163
    const-string v9, "ITEM_ID_LIST"

    .line 164
    .line 165
    invoke-virtual {v12, v9, v8}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 166
    .line 167
    .line 168
    iget-object v8, v4, Lej;->c:Ljava/lang/String;

    .line 169
    .line 170
    const-string v9, "playBillingLibraryVersion"

    .line 171
    .line 172
    invoke-virtual {v12, v9, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    const/16 v8, 0x2b

    .line 176
    .line 177
    :try_start_5
    iget-object v9, v4, Lej;->a:Ljava/lang/Object;

    .line 178
    .line 179
    monitor-enter v9
    :try_end_5
    .catch Landroid/os/DeadObjectException; {:try_start_5 .. :try_end_5} :catch_a
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_9

    .line 180
    move v13, v8

    .line 181
    :try_start_6
    iget-object v8, v4, Lej;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 182
    .line 183
    monitor-exit v9
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 184
    if-nez v8, :cond_3

    .line 185
    .line 186
    :try_start_7
    sget-object v0, Lkf3;->j:Lkj;

    .line 187
    .line 188
    const-string v5, "Service has been reset to null."

    .line 189
    .line 190
    invoke-virtual {v4, v0, v3, v5, v2}, Lej;->q(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lbx0;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    goto/16 :goto_d

    .line 195
    .line 196
    :catch_2
    move-exception v0

    .line 197
    move v2, v13

    .line 198
    goto/16 :goto_b

    .line 199
    .line 200
    :catch_3
    move-exception v0

    .line 201
    move v2, v13

    .line 202
    goto/16 :goto_c

    .line 203
    .line 204
    :cond_3
    iget-boolean v9, v4, Lej;->u:Z
    :try_end_7
    .catch Landroid/os/DeadObjectException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    .line 205
    .line 206
    const/4 v3, 0x1

    .line 207
    if-eq v3, v9, :cond_4

    .line 208
    .line 209
    const/16 v9, 0x11

    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_4
    const/16 v9, 0x14

    .line 213
    .line 214
    :goto_6
    :try_start_8
    iget-object v13, v4, Lej;->f:Landroid/content/Context;

    .line 215
    .line 216
    invoke-virtual {v13}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v13

    .line 220
    iget-boolean v7, v4, Lej;->t:Z

    .line 221
    .line 222
    if-eqz v7, :cond_5

    .line 223
    .line 224
    iget-object v7, v4, Lej;->w:Lec0;

    .line 225
    .line 226
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    :cond_5
    iget-object v7, v4, Lej;->c:Ljava/lang/String;

    .line 230
    .line 231
    invoke-virtual {v4}, Lej;->j()V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v4}, Lej;->j()V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v4}, Lej;->j()V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v4}, Lej;->j()V

    .line 241
    .line 242
    .line 243
    iget-object v14, v4, Lej;->A:Ljava/lang/Long;

    .line 244
    .line 245
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 246
    .line 247
    .line 248
    move-result-wide v2

    .line 249
    move-object v14, v13

    .line 250
    new-instance v13, Landroid/os/Bundle;

    .line 251
    .line 252
    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 253
    .line 254
    .line 255
    invoke-static {v13, v7, v2, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzc(Landroid/os/Bundle;Ljava/lang/String;J)Landroid/os/Bundle;

    .line 256
    .line 257
    .line 258
    const-string v2, "enablePendingPurchases"

    .line 259
    .line 260
    const/4 v3, 0x1

    .line 261
    invoke-virtual {v13, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 262
    .line 263
    .line 264
    const-string v2, "SKU_DETAILS_RESPONSE_FORMAT"

    .line 265
    .line 266
    const-string v3, "PRODUCT_DETAILS"

    .line 267
    .line 268
    invoke-virtual {v13, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    new-instance v2, Ljava/util/ArrayList;

    .line 272
    .line 273
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 274
    .line 275
    .line 276
    new-instance v3, Ljava/util/ArrayList;

    .line 277
    .line 278
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 282
    .line 283
    .line 284
    move-result v7

    .line 285
    move-object/from16 v19, v0

    .line 286
    .line 287
    const/4 v0, 0x0

    .line 288
    const/16 v18, 0x0

    .line 289
    .line 290
    const/16 v20, 0x0

    .line 291
    .line 292
    :goto_7
    if-ge v0, v7, :cond_7

    .line 293
    .line 294
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v21

    .line 298
    move/from16 v22, v0

    .line 299
    .line 300
    move-object/from16 v0, v21

    .line 301
    .line 302
    check-cast v0, Lg02;

    .line 303
    .line 304
    move/from16 v21, v6

    .line 305
    .line 306
    const/4 v6, 0x0

    .line 307
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 311
    .line 312
    .line 313
    move-result v23

    .line 314
    const/16 v17, 0x1

    .line 315
    .line 316
    xor-int/lit8 v6, v23, 0x1

    .line 317
    .line 318
    or-int v20, v20, v6

    .line 319
    .line 320
    iget-object v0, v0, Lg02;->b:Ljava/lang/String;

    .line 321
    .line 322
    const-string v6, "first_party"

    .line 323
    .line 324
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    if-eqz v0, :cond_6

    .line 329
    .line 330
    const-string v0, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products."

    .line 331
    .line 332
    const/4 v6, 0x0

    .line 333
    invoke-static {v6, v0}, Lcom/google/android/gms/internal/play_billing/zzbe;->zzc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move/from16 v18, v17

    .line 340
    .line 341
    goto :goto_8

    .line 342
    :catch_4
    move-exception v0

    .line 343
    const/16 v2, 0x2b

    .line 344
    .line 345
    goto/16 :goto_b

    .line 346
    .line 347
    :catch_5
    move-exception v0

    .line 348
    const/16 v2, 0x2b

    .line 349
    .line 350
    goto/16 :goto_c

    .line 351
    .line 352
    :cond_6
    :goto_8
    add-int/lit8 v0, v22, 0x1

    .line 353
    .line 354
    move/from16 v6, v21

    .line 355
    .line 356
    goto :goto_7

    .line 357
    :cond_7
    move/from16 v21, v6

    .line 358
    .line 359
    if-eqz v20, :cond_8

    .line 360
    .line 361
    const-string v0, "SKU_OFFER_ID_TOKEN_LIST"

    .line 362
    .line 363
    invoke-virtual {v13, v0, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 364
    .line 365
    .line 366
    :cond_8
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 367
    .line 368
    .line 369
    move-result v0

    .line 370
    if-nez v0, :cond_9

    .line 371
    .line 372
    const-string v0, "SKU_SERIALIZED_DOCID_LIST"

    .line 373
    .line 374
    invoke-virtual {v13, v0, v3}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 375
    .line 376
    .line 377
    :cond_9
    if-eqz v18, :cond_a

    .line 378
    .line 379
    const/4 v6, 0x0

    .line 380
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    if-nez v0, :cond_a

    .line 385
    .line 386
    const-string v0, "accountName"

    .line 387
    .line 388
    invoke-virtual {v13, v0, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catch Landroid/os/DeadObjectException; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    .line 389
    .line 390
    .line 391
    :cond_a
    move-object v10, v14

    .line 392
    const/16 v2, 0x2b

    .line 393
    .line 394
    :try_start_9
    invoke-interface/range {v8 .. v13}, Lcom/google/android/gms/internal/play_billing/zzan;->zzl(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 395
    .line 396
    .line 397
    move-result-object v0
    :try_end_9
    .catch Landroid/os/DeadObjectException; {:try_start_9 .. :try_end_9} :catch_8
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7

    .line 398
    if-nez v0, :cond_b

    .line 399
    .line 400
    const-string v0, "queryProductDetailsAsync got empty product details response."

    .line 401
    .line 402
    sget-object v2, Lkf3;->q:Lkj;

    .line 403
    .line 404
    const/16 v3, 0x2c

    .line 405
    .line 406
    const/4 v6, 0x0

    .line 407
    invoke-virtual {v4, v2, v3, v0, v6}, Lej;->q(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lbx0;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    goto/16 :goto_d

    .line 412
    .line 413
    :cond_b
    const-string v2, "DETAILS_LIST"

    .line 414
    .line 415
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 416
    .line 417
    .line 418
    move-result v2

    .line 419
    if-nez v2, :cond_d

    .line 420
    .line 421
    const-string v2, "BillingClient"

    .line 422
    .line 423
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/zze;->zzb(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 424
    .line 425
    .line 426
    move-result v2

    .line 427
    const-string v3, "BillingClient"

    .line 428
    .line 429
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzh(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    if-eqz v2, :cond_c

    .line 434
    .line 435
    invoke-static {v2, v0}, Lkf3;->a(ILjava/lang/String;)Lkj;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    const-string v3, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "

    .line 440
    .line 441
    invoke-static {v2, v3}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    const/16 v3, 0x17

    .line 446
    .line 447
    const/4 v6, 0x0

    .line 448
    invoke-virtual {v4, v0, v3, v2, v6}, Lej;->q(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lbx0;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    goto/16 :goto_d

    .line 453
    .line 454
    :cond_c
    const/4 v2, 0x6

    .line 455
    const/4 v6, 0x0

    .line 456
    invoke-static {v2, v0}, Lkf3;->a(ILjava/lang/String;)Lkj;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    const/16 v2, 0x2d

    .line 461
    .line 462
    const-string v3, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync."

    .line 463
    .line 464
    invoke-virtual {v4, v0, v2, v3, v6}, Lej;->q(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lbx0;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    goto/16 :goto_d

    .line 469
    .line 470
    :cond_d
    const-string v2, "DETAILS_LIST"

    .line 471
    .line 472
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    if-eqz v0, :cond_f

    .line 477
    .line 478
    const/4 v2, 0x0

    .line 479
    :goto_9
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 480
    .line 481
    .line 482
    move-result v3

    .line 483
    if-ge v2, v3, :cond_e

    .line 484
    .line 485
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    check-cast v3, Ljava/lang/String;

    .line 490
    .line 491
    :try_start_a
    new-instance v6, Lzx1;

    .line 492
    .line 493
    invoke-direct {v6, v3}, Lzx1;-><init>(Ljava/lang/String;)V
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_6

    .line 494
    .line 495
    .line 496
    invoke-virtual {v6}, Lzx1;->toString()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    const-string v7, "Got product details: "

    .line 501
    .line 502
    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v3

    .line 506
    const-string v7, "BillingClient"

    .line 507
    .line 508
    invoke-static {v7, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    add-int/lit8 v2, v2, 0x1

    .line 515
    .line 516
    goto :goto_9

    .line 517
    :catch_6
    move-exception v0

    .line 518
    const-string v2, "Error trying to decode SkuDetails."

    .line 519
    .line 520
    const/4 v3, 0x6

    .line 521
    invoke-static {v3, v2}, Lkf3;->a(ILjava/lang/String;)Lkj;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    const/16 v3, 0x2f

    .line 526
    .line 527
    const-string v5, "Got a JSON exception trying to decode ProductDetails. \n Exception: "

    .line 528
    .line 529
    invoke-virtual {v4, v2, v3, v5, v0}, Lej;->q(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lbx0;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    goto :goto_d

    .line 534
    :cond_e
    move v8, v15

    .line 535
    move-object/from16 v0, v19

    .line 536
    .line 537
    move/from16 v6, v21

    .line 538
    .line 539
    const/4 v2, 0x0

    .line 540
    const/16 v3, 0x77

    .line 541
    .line 542
    const/4 v7, 0x0

    .line 543
    goto/16 :goto_3

    .line 544
    .line 545
    :cond_f
    const-string v0, "queryProductDetailsAsync got null response list"

    .line 546
    .line 547
    sget-object v2, Lkf3;->q:Lkj;

    .line 548
    .line 549
    const/16 v3, 0x2e

    .line 550
    .line 551
    const/4 v6, 0x0

    .line 552
    invoke-virtual {v4, v2, v3, v0, v6}, Lej;->q(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lbx0;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    goto :goto_d

    .line 557
    :catch_7
    move-exception v0

    .line 558
    goto :goto_b

    .line 559
    :catch_8
    move-exception v0

    .line 560
    goto :goto_c

    .line 561
    :catchall_1
    move-exception v0

    .line 562
    move v2, v13

    .line 563
    :goto_a
    :try_start_b
    monitor-exit v9
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 564
    :try_start_c
    throw v0
    :try_end_c
    .catch Landroid/os/DeadObjectException; {:try_start_c .. :try_end_c} :catch_8
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_7

    .line 565
    :catchall_2
    move-exception v0

    .line 566
    goto :goto_a

    .line 567
    :catch_9
    move-exception v0

    .line 568
    move v2, v8

    .line 569
    goto :goto_b

    .line 570
    :catch_a
    move-exception v0

    .line 571
    move v2, v8

    .line 572
    goto :goto_c

    .line 573
    :goto_b
    const-string v3, "queryProductDetailsAsync got a remote exception (try to reconnect)."

    .line 574
    .line 575
    sget-object v5, Lkf3;->h:Lkj;

    .line 576
    .line 577
    invoke-virtual {v4, v5, v2, v3, v0}, Lej;->q(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lbx0;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    goto :goto_d

    .line 582
    :goto_c
    const-string v3, "queryProductDetailsAsync got a remote exception (try to reconnect)."

    .line 583
    .line 584
    sget-object v5, Lkf3;->j:Lkj;

    .line 585
    .line 586
    invoke-virtual {v4, v5, v2, v3, v0}, Lej;->q(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lbx0;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    goto :goto_d

    .line 591
    :cond_10
    const-string v0, ""

    .line 592
    .line 593
    new-instance v2, Lbx0;

    .line 594
    .line 595
    const/4 v3, 0x0

    .line 596
    const/4 v4, 0x6

    .line 597
    invoke-direct {v2, v3, v0, v5, v4}, Lbx0;-><init>(ILjava/lang/String;Ljava/util/ArrayList;I)V

    .line 598
    .line 599
    .line 600
    move-object v0, v2

    .line 601
    :goto_d
    iget v2, v0, Lbx0;->c:I

    .line 602
    .line 603
    iget-object v3, v0, Lbx0;->d:Ljava/lang/Object;

    .line 604
    .line 605
    check-cast v3, Ljava/lang/String;

    .line 606
    .line 607
    invoke-static {v2, v3}, Lkf3;->a(ILjava/lang/String;)Lkj;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    iget-object v0, v0, Lbx0;->b:Ljava/lang/Object;

    .line 612
    .line 613
    check-cast v0, Ljava/util/ArrayList;

    .line 614
    .line 615
    iget-object v1, v1, Lkd3;->d:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v1, Lcom/supercell/titan/g;

    .line 618
    .line 619
    invoke-virtual {v1, v2, v0}, Lcom/supercell/titan/g;->a(Lkj;Ljava/util/ArrayList;)V

    .line 620
    .line 621
    .line 622
    const/16 v16, 0x0

    .line 623
    .line 624
    return-object v16

    .line 625
    :pswitch_1
    iget-object v2, v1, Lkd3;->b:Lej;

    .line 626
    .line 627
    iget-object v0, v1, Lkd3;->c:Ljava/lang/Object;

    .line 628
    .line 629
    check-cast v0, Ld5;

    .line 630
    .line 631
    iget-object v1, v1, Lkd3;->d:Ljava/lang/Object;

    .line 632
    .line 633
    check-cast v1, Lds0;

    .line 634
    .line 635
    const-string v3, "Error consuming purchase with token. Response code: "

    .line 636
    .line 637
    const-string v4, "Consuming purchase with token: "

    .line 638
    .line 639
    iget-object v0, v0, Ld5;->b:Ljava/lang/String;

    .line 640
    .line 641
    :try_start_d
    const-string v5, "BillingClient"

    .line 642
    .line 643
    new-instance v6, Ljava/lang/StringBuilder;

    .line 644
    .line 645
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v4

    .line 655
    invoke-static {v5, v4}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    iget-object v4, v2, Lej;->a:Ljava/lang/Object;

    .line 659
    .line 660
    monitor-enter v4
    :try_end_d
    .catch Landroid/os/DeadObjectException; {:try_start_d .. :try_end_d} :catch_e
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_d

    .line 661
    :try_start_e
    iget-object v5, v2, Lej;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 662
    .line 663
    monitor-exit v4
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 664
    if-nez v5, :cond_11

    .line 665
    .line 666
    :try_start_f
    sget-object v3, Lkf3;->j:Lkj;

    .line 667
    .line 668
    const-string v5, "Service has been reset to null."
    :try_end_f
    .catch Landroid/os/DeadObjectException; {:try_start_f .. :try_end_f} :catch_e
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_d

    .line 669
    .line 670
    const/4 v6, 0x0

    .line 671
    const/16 v4, 0x77

    .line 672
    .line 673
    move-object/from16 v24, v2

    .line 674
    .line 675
    move-object v2, v1

    .line 676
    move-object/from16 v1, v24

    .line 677
    .line 678
    :try_start_10
    invoke-virtual/range {v1 .. v6}, Lej;->t(Lds0;Lkj;ILjava/lang/String;Ljava/lang/Exception;)V

    .line 679
    .line 680
    .line 681
    :goto_e
    const/16 v16, 0x0

    .line 682
    .line 683
    goto/16 :goto_15

    .line 684
    .line 685
    :catch_b
    move-exception v0

    .line 686
    :goto_f
    move-object v6, v0

    .line 687
    goto/16 :goto_13

    .line 688
    .line 689
    :catch_c
    move-exception v0

    .line 690
    :goto_10
    move-object v6, v0

    .line 691
    goto/16 :goto_14

    .line 692
    .line 693
    :catch_d
    move-exception v0

    .line 694
    move-object/from16 v24, v2

    .line 695
    .line 696
    move-object v2, v1

    .line 697
    move-object/from16 v1, v24

    .line 698
    .line 699
    goto :goto_f

    .line 700
    :catch_e
    move-exception v0

    .line 701
    move-object/from16 v24, v2

    .line 702
    .line 703
    move-object v2, v1

    .line 704
    move-object/from16 v1, v24

    .line 705
    .line 706
    goto :goto_10

    .line 707
    :cond_11
    move-object/from16 v24, v2

    .line 708
    .line 709
    move-object v2, v1

    .line 710
    move-object/from16 v1, v24

    .line 711
    .line 712
    iget-boolean v4, v1, Lej;->m:Z
    :try_end_10
    .catch Landroid/os/DeadObjectException; {:try_start_10 .. :try_end_10} :catch_c
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_b

    .line 713
    .line 714
    iget-object v6, v1, Lej;->f:Landroid/content/Context;

    .line 715
    .line 716
    if-eqz v4, :cond_13

    .line 717
    .line 718
    :try_start_11
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v4

    .line 722
    iget-boolean v6, v1, Lej;->m:Z

    .line 723
    .line 724
    iget-object v7, v1, Lej;->c:Ljava/lang/String;

    .line 725
    .line 726
    iget-object v8, v1, Lej;->A:Ljava/lang/Long;

    .line 727
    .line 728
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 729
    .line 730
    .line 731
    move-result-wide v8

    .line 732
    new-instance v10, Landroid/os/Bundle;

    .line 733
    .line 734
    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 735
    .line 736
    .line 737
    if-eqz v6, :cond_12

    .line 738
    .line 739
    invoke-static {v10, v7, v8, v9}, Lcom/google/android/gms/internal/play_billing/zze;->zzc(Landroid/os/Bundle;Ljava/lang/String;J)Landroid/os/Bundle;

    .line 740
    .line 741
    .line 742
    :cond_12
    const/16 v6, 0x9

    .line 743
    .line 744
    invoke-interface {v5, v6, v4, v0, v10}, Lcom/google/android/gms/internal/play_billing/zzan;->zze(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    const-string v4, "RESPONSE_CODE"

    .line 749
    .line 750
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 751
    .line 752
    .line 753
    move-result v4

    .line 754
    const-string v5, "BillingClient"

    .line 755
    .line 756
    invoke-static {v0, v5}, Lcom/google/android/gms/internal/play_billing/zze;->zzh(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    goto :goto_11

    .line 761
    :cond_13
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v4

    .line 765
    const/4 v6, 0x3

    .line 766
    invoke-interface {v5, v6, v4, v0}, Lcom/google/android/gms/internal/play_billing/zzan;->zza(ILjava/lang/String;Ljava/lang/String;)I

    .line 767
    .line 768
    .line 769
    move-result v4

    .line 770
    const-string v0, ""

    .line 771
    .line 772
    :goto_11
    invoke-static {v4, v0}, Lkf3;->a(ILjava/lang/String;)Lkj;

    .line 773
    .line 774
    .line 775
    move-result-object v0

    .line 776
    if-nez v4, :cond_14

    .line 777
    .line 778
    const-string v0, "BillingClient"

    .line 779
    .line 780
    const-string v3, "Successfully consumed purchase."

    .line 781
    .line 782
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    goto :goto_e

    .line 786
    :cond_14
    new-instance v5, Ljava/lang/StringBuilder;

    .line 787
    .line 788
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v5

    .line 798
    const/4 v6, 0x0

    .line 799
    const/16 v4, 0x17

    .line 800
    .line 801
    move-object v3, v0

    .line 802
    invoke-virtual/range {v1 .. v6}, Lej;->t(Lds0;Lkj;ILjava/lang/String;Ljava/lang/Exception;)V
    :try_end_11
    .catch Landroid/os/DeadObjectException; {:try_start_11 .. :try_end_11} :catch_c
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_b

    .line 803
    .line 804
    .line 805
    goto :goto_e

    .line 806
    :catchall_3
    move-exception v0

    .line 807
    move-object/from16 v24, v2

    .line 808
    .line 809
    move-object v2, v1

    .line 810
    move-object/from16 v1, v24

    .line 811
    .line 812
    :goto_12
    :try_start_12
    monitor-exit v4
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    .line 813
    :try_start_13
    throw v0
    :try_end_13
    .catch Landroid/os/DeadObjectException; {:try_start_13 .. :try_end_13} :catch_c
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_b

    .line 814
    :catchall_4
    move-exception v0

    .line 815
    goto :goto_12

    .line 816
    :goto_13
    const-string v5, "Error consuming purchase!"

    .line 817
    .line 818
    sget-object v3, Lkf3;->h:Lkj;

    .line 819
    .line 820
    const/16 v4, 0x1d

    .line 821
    .line 822
    invoke-virtual/range {v1 .. v6}, Lej;->t(Lds0;Lkj;ILjava/lang/String;Ljava/lang/Exception;)V

    .line 823
    .line 824
    .line 825
    goto/16 :goto_e

    .line 826
    .line 827
    :goto_14
    const-string v5, "Error consuming purchase!"

    .line 828
    .line 829
    sget-object v3, Lkf3;->j:Lkj;

    .line 830
    .line 831
    const/16 v4, 0x1d

    .line 832
    .line 833
    invoke-virtual/range {v1 .. v6}, Lej;->t(Lds0;Lkj;ILjava/lang/String;Ljava/lang/Exception;)V

    .line 834
    .line 835
    .line 836
    goto/16 :goto_e

    .line 837
    .line 838
    :goto_15
    return-object v16

    .line 839
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

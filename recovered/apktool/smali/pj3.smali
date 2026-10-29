.class public final Lpj3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/io/Serializable;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/zzjc;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 16
    iput p5, p0, Lpj3;->a:I

    iput-object p2, p0, Lpj3;->b:Ljava/lang/String;

    iput-object p3, p0, Lpj3;->c:Ljava/lang/Object;

    iput-object p4, p0, Lpj3;->d:Ljava/io/Serializable;

    iput-object p1, p0, Lpj3;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lej;Ljava/lang/String;Ljava/util/ArrayList;Lcom/supercell/titan/h;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lpj3;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lpj3;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lpj3;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Lpj3;->d:Ljava/io/Serializable;

    .line 12
    .line 13
    iput-object p4, p0, Lpj3;->e:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lpj3;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lpj3;->c:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, Lej;

    .line 12
    .line 13
    iget-object v6, v1, Lpj3;->b:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v0, v1, Lpj3;->d:Ljava/io/Serializable;

    .line 16
    .line 17
    check-cast v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v9, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v10

    .line 28
    const/4 v3, 0x0

    .line 29
    :goto_0
    const/4 v12, 0x0

    .line 30
    if-ge v3, v10, :cond_b

    .line 31
    .line 32
    add-int/lit8 v13, v3, 0x14

    .line 33
    .line 34
    if-le v13, v10, :cond_0

    .line 35
    .line 36
    move v4, v10

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    move v4, v13

    .line 39
    :goto_1
    new-instance v5, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-interface {v0, v3, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 46
    .line 47
    .line 48
    new-instance v7, Landroid/os/Bundle;

    .line 49
    .line 50
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v3, "ITEM_ID_LIST"

    .line 54
    .line 55
    invoke-virtual {v7, v3, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 56
    .line 57
    .line 58
    iget-object v3, v2, Lej;->c:Ljava/lang/String;

    .line 59
    .line 60
    const-string v4, "playBillingLibraryVersion"

    .line 61
    .line 62
    invoke-virtual {v7, v4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :try_start_0
    iget-object v3, v2, Lej;->a:Ljava/lang/Object;

    .line 66
    .line 67
    monitor-enter v3
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    move-object v4, v3

    .line 69
    :try_start_1
    iget-object v3, v2, Lej;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 70
    .line 71
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    if-nez v3, :cond_1

    .line 73
    .line 74
    :try_start_2
    sget-object v0, Lkf3;->j:Lkj;

    .line 75
    .line 76
    const-string v3, "Service has been reset to null."

    .line 77
    .line 78
    const/16 v4, 0x77

    .line 79
    .line 80
    invoke-virtual {v2, v0, v4, v3, v12}, Lej;->s(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lbx0;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    goto/16 :goto_6

    .line 85
    .line 86
    :catch_0
    move-exception v0

    .line 87
    goto/16 :goto_4

    .line 88
    .line 89
    :catch_1
    move-exception v0

    .line 90
    const/16 v5, 0x2b

    .line 91
    .line 92
    goto/16 :goto_5

    .line 93
    .line 94
    :cond_1
    iget-boolean v4, v2, Lej;->n:Z
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 95
    .line 96
    iget-object v5, v2, Lej;->f:Landroid/content/Context;

    .line 97
    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    :try_start_3
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    iget v4, v2, Lej;->k:I

    .line 105
    .line 106
    iget-object v8, v2, Lej;->w:Lec0;

    .line 107
    .line 108
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-boolean v8, v2, Lej;->t:Z

    .line 112
    .line 113
    if-eqz v8, :cond_2

    .line 114
    .line 115
    iget-object v8, v2, Lej;->w:Lec0;

    .line 116
    .line 117
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    :cond_2
    iget-object v8, v2, Lej;->c:Ljava/lang/String;

    .line 121
    .line 122
    iget-object v15, v2, Lej;->A:Ljava/lang/Long;

    .line 123
    .line 124
    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    .line 125
    .line 126
    .line 127
    move-result-wide v14

    .line 128
    new-instance v11, Landroid/os/Bundle;

    .line 129
    .line 130
    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 131
    .line 132
    .line 133
    const/16 v12, 0x9

    .line 134
    .line 135
    if-lt v4, v12, :cond_3

    .line 136
    .line 137
    invoke-static {v11, v8, v14, v15}, Lcom/google/android/gms/internal/play_billing/zze;->zzc(Landroid/os/Bundle;Ljava/lang/String;J)Landroid/os/Bundle;

    .line 138
    .line 139
    .line 140
    :cond_3
    if-lt v4, v12, :cond_4

    .line 141
    .line 142
    const-string v4, "enablePendingPurchases"

    .line 143
    .line 144
    const/4 v8, 0x1

    .line 145
    invoke-virtual {v11, v4, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 146
    .line 147
    .line 148
    :cond_4
    const/16 v4, 0xa

    .line 149
    .line 150
    move-object v8, v11

    .line 151
    invoke-interface/range {v3 .. v8}, Lcom/google/android/gms/internal/play_billing/zzan;->zzl(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    goto :goto_2

    .line 156
    :cond_5
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    const/4 v5, 0x3

    .line 161
    invoke-interface {v3, v5, v4, v6, v7}, Lcom/google/android/gms/internal/play_billing/zzan;->zzk(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 162
    .line 163
    .line 164
    move-result-object v3
    :try_end_3
    .catch Landroid/os/DeadObjectException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 165
    :goto_2
    if-nez v3, :cond_6

    .line 166
    .line 167
    const-string v0, "querySkuDetailsAsync got null sku details list"

    .line 168
    .line 169
    sget-object v3, Lkf3;->q:Lkj;

    .line 170
    .line 171
    const/16 v4, 0x2c

    .line 172
    .line 173
    const/4 v5, 0x0

    .line 174
    invoke-virtual {v2, v3, v4, v0, v5}, Lej;->s(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lbx0;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    goto/16 :goto_6

    .line 179
    .line 180
    :cond_6
    const-string v4, "DETAILS_LIST"

    .line 181
    .line 182
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    const/4 v5, 0x6

    .line 187
    if-nez v4, :cond_8

    .line 188
    .line 189
    const-string v0, "BillingClient"

    .line 190
    .line 191
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzb(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    const-string v4, "BillingClient"

    .line 196
    .line 197
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/play_billing/zze;->zzh(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    if-eqz v0, :cond_7

    .line 202
    .line 203
    invoke-static {v0, v3}, Lkf3;->a(ILjava/lang/String;)Lkj;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    const-string v4, "getSkuDetails() failed. Response code: "

    .line 208
    .line 209
    invoke-static {v0, v4}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    const/16 v4, 0x17

    .line 214
    .line 215
    const/4 v6, 0x0

    .line 216
    invoke-virtual {v2, v3, v4, v0, v6}, Lej;->s(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lbx0;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    goto/16 :goto_6

    .line 221
    .line 222
    :cond_7
    const/4 v6, 0x0

    .line 223
    invoke-static {v5, v3}, Lkf3;->a(ILjava/lang/String;)Lkj;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    const/16 v3, 0x2d

    .line 228
    .line 229
    const-string v4, "getSkuDetails() returned a bundle with neither an error nor a detail list."

    .line 230
    .line 231
    invoke-virtual {v2, v0, v3, v4, v6}, Lej;->s(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lbx0;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    goto/16 :goto_6

    .line 236
    .line 237
    :cond_8
    const-string v4, "DETAILS_LIST"

    .line 238
    .line 239
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    if-eqz v3, :cond_a

    .line 244
    .line 245
    const/4 v4, 0x0

    .line 246
    :goto_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 247
    .line 248
    .line 249
    move-result v7

    .line 250
    if-ge v4, v7, :cond_9

    .line 251
    .line 252
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    check-cast v7, Ljava/lang/String;

    .line 257
    .line 258
    :try_start_4
    new-instance v8, Lve2;

    .line 259
    .line 260
    invoke-direct {v8, v7}, Lve2;-><init>(Ljava/lang/String;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_2

    .line 261
    .line 262
    .line 263
    invoke-virtual {v8}, Lve2;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    const-string v11, "Got sku details: "

    .line 268
    .line 269
    invoke-virtual {v11, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    const-string v11, "BillingClient"

    .line 274
    .line 275
    invoke-static {v11, v7}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    add-int/lit8 v4, v4, 0x1

    .line 282
    .line 283
    goto :goto_3

    .line 284
    :catch_2
    move-exception v0

    .line 285
    const-string v3, "Error trying to decode SkuDetails."

    .line 286
    .line 287
    invoke-static {v5, v3}, Lkf3;->a(ILjava/lang/String;)Lkj;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    const/16 v4, 0x2f

    .line 292
    .line 293
    const-string v5, "Got a JSON exception trying to decode SkuDetails."

    .line 294
    .line 295
    invoke-virtual {v2, v3, v4, v5, v0}, Lej;->s(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lbx0;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    goto :goto_6

    .line 300
    :cond_9
    move v3, v13

    .line 301
    goto/16 :goto_0

    .line 302
    .line 303
    :cond_a
    const-string v0, "querySkuDetailsAsync got null response list"

    .line 304
    .line 305
    sget-object v3, Lkf3;->q:Lkj;

    .line 306
    .line 307
    const/16 v4, 0x2e

    .line 308
    .line 309
    const/4 v5, 0x0

    .line 310
    invoke-virtual {v2, v3, v4, v0, v5}, Lej;->s(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lbx0;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    goto :goto_6

    .line 315
    :catchall_0
    move-exception v0

    .line 316
    :try_start_5
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 317
    :try_start_6
    throw v0
    :try_end_6
    .catch Landroid/os/DeadObjectException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 318
    :goto_4
    const-string v3, "querySkuDetailsAsync got a remote exception (try to reconnect)."

    .line 319
    .line 320
    sget-object v4, Lkf3;->h:Lkj;

    .line 321
    .line 322
    const/16 v5, 0x2b

    .line 323
    .line 324
    invoke-virtual {v2, v4, v5, v3, v0}, Lej;->s(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lbx0;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    goto :goto_6

    .line 329
    :goto_5
    const-string v3, "querySkuDetailsAsync got a remote exception (try to reconnect)."

    .line 330
    .line 331
    sget-object v4, Lkf3;->j:Lkj;

    .line 332
    .line 333
    invoke-virtual {v2, v4, v5, v3, v0}, Lej;->s(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lbx0;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    goto :goto_6

    .line 338
    :cond_b
    const-string v0, ""

    .line 339
    .line 340
    new-instance v2, Lbx0;

    .line 341
    .line 342
    const/16 v3, 0x8

    .line 343
    .line 344
    const/4 v4, 0x0

    .line 345
    invoke-direct {v2, v4, v0, v9, v3}, Lbx0;-><init>(ILjava/lang/String;Ljava/util/ArrayList;I)V

    .line 346
    .line 347
    .line 348
    move-object v0, v2

    .line 349
    :goto_6
    iget v2, v0, Lbx0;->c:I

    .line 350
    .line 351
    iget-object v3, v0, Lbx0;->d:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v3, Ljava/lang/String;

    .line 354
    .line 355
    invoke-static {v2, v3}, Lkf3;->a(ILjava/lang/String;)Lkj;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    iget-object v0, v0, Lbx0;->b:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v0, Ljava/util/List;

    .line 362
    .line 363
    iget-object v1, v1, Lpj3;->e:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v1, Lcom/supercell/titan/h;

    .line 366
    .line 367
    invoke-virtual {v1, v2, v0}, Lcom/supercell/titan/h;->a(Lkj;Ljava/util/List;)V

    .line 368
    .line 369
    .line 370
    const/16 v16, 0x0

    .line 371
    .line 372
    return-object v16

    .line 373
    :pswitch_0
    iget-object v0, v1, Lpj3;->e:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzjc;

    .line 376
    .line 377
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 378
    .line 379
    invoke-virtual {v2}, Lmp3;->A()V

    .line 380
    .line 381
    .line 382
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 383
    .line 384
    iget-object v0, v0, Lmp3;->c:Lae3;

    .line 385
    .line 386
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 387
    .line 388
    .line 389
    iget-object v2, v1, Lpj3;->b:Ljava/lang/String;

    .line 390
    .line 391
    iget-object v3, v1, Lpj3;->c:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v3, Ljava/lang/String;

    .line 394
    .line 395
    iget-object v1, v1, Lpj3;->d:Ljava/io/Serializable;

    .line 396
    .line 397
    check-cast v1, Ljava/lang/String;

    .line 398
    .line 399
    invoke-virtual {v0, v2, v3, v1}, Lae3;->B0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    return-object v0

    .line 404
    :pswitch_1
    iget-object v0, v1, Lpj3;->e:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzjc;

    .line 407
    .line 408
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 409
    .line 410
    invoke-virtual {v2}, Lmp3;->A()V

    .line 411
    .line 412
    .line 413
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 414
    .line 415
    iget-object v0, v0, Lmp3;->c:Lae3;

    .line 416
    .line 417
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 418
    .line 419
    .line 420
    iget-object v2, v1, Lpj3;->b:Ljava/lang/String;

    .line 421
    .line 422
    iget-object v3, v1, Lpj3;->c:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast v3, Ljava/lang/String;

    .line 425
    .line 426
    iget-object v1, v1, Lpj3;->d:Ljava/io/Serializable;

    .line 427
    .line 428
    check-cast v1, Ljava/lang/String;

    .line 429
    .line 430
    invoke-virtual {v0, v2, v3, v1}, Lae3;->B0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    return-object v0

    .line 435
    :pswitch_2
    iget-object v0, v1, Lpj3;->e:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzjc;

    .line 438
    .line 439
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 440
    .line 441
    invoke-virtual {v2}, Lmp3;->A()V

    .line 442
    .line 443
    .line 444
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 445
    .line 446
    iget-object v0, v0, Lmp3;->c:Lae3;

    .line 447
    .line 448
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 449
    .line 450
    .line 451
    iget-object v2, v1, Lpj3;->b:Ljava/lang/String;

    .line 452
    .line 453
    iget-object v3, v1, Lpj3;->c:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v3, Ljava/lang/String;

    .line 456
    .line 457
    iget-object v1, v1, Lpj3;->d:Ljava/io/Serializable;

    .line 458
    .line 459
    check-cast v1, Ljava/lang/String;

    .line 460
    .line 461
    invoke-virtual {v0, v2, v3, v1}, Lae3;->x0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    return-object v0

    .line 466
    :pswitch_3
    iget-object v0, v1, Lpj3;->e:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzjc;

    .line 469
    .line 470
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 471
    .line 472
    invoke-virtual {v2}, Lmp3;->A()V

    .line 473
    .line 474
    .line 475
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 476
    .line 477
    iget-object v0, v0, Lmp3;->c:Lae3;

    .line 478
    .line 479
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 480
    .line 481
    .line 482
    iget-object v2, v1, Lpj3;->b:Ljava/lang/String;

    .line 483
    .line 484
    iget-object v3, v1, Lpj3;->c:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v3, Ljava/lang/String;

    .line 487
    .line 488
    iget-object v1, v1, Lpj3;->d:Ljava/io/Serializable;

    .line 489
    .line 490
    check-cast v1, Ljava/lang/String;

    .line 491
    .line 492
    invoke-virtual {v0, v2, v3, v1}, Lae3;->x0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    return-object v0

    .line 497
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

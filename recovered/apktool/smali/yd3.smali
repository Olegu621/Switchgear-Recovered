.class public final Lyd3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 15
    iput p1, p0, Lyd3;->a:I

    iput-object p3, p0, Lyd3;->b:Ljava/lang/Object;

    iput-object p2, p0, Lyd3;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzjc;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lyd3;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lyd3;->b:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lyd3;->c:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lmp3;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lyd3;->a:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lyd3;->b:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lyd3;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lyd3;->a:I

    .line 4
    .line 5
    const/16 v2, 0x77

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v1, Lyd3;->c:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, Lej;

    .line 15
    .line 16
    iget-object v0, v1, Lyd3;->b:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v1, v0

    .line 19
    check-cast v1, Lpn;

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const/16 v5, 0x3e

    .line 25
    .line 26
    :try_start_0
    iget-object v6, v4, Lej;->a:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v6
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    :try_start_1
    iget-object v0, v4, Lej;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 30
    .line 31
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    :try_start_2
    sget-object v0, Lkf3;->j:Lkj;

    .line 35
    .line 36
    invoke-virtual {v4, v1, v0, v2, v3}, Lej;->w(Lpn;Lkj;ILjava/lang/Exception;)V

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :catch_0
    move-exception v0

    .line 41
    goto :goto_0

    .line 42
    :catch_1
    move-exception v0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    iget-object v2, v4, Lej;->f:Landroid/content/Context;

    .line 45
    .line 46
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    iget-object v6, v4, Lej;->c:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v7, v4, Lej;->A:Ljava/lang/Long;

    .line 53
    .line 54
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide v7

    .line 58
    new-instance v9, Landroid/os/Bundle;

    .line 59
    .line 60
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-static {v9, v6, v7, v8}, Lcom/google/android/gms/internal/play_billing/zze;->zzc(Landroid/os/Bundle;Ljava/lang/String;J)Landroid/os/Bundle;

    .line 64
    .line 65
    .line 66
    new-instance v6, Lqe3;

    .line 67
    .line 68
    iget-object v7, v4, Lej;->g:Lwe2;

    .line 69
    .line 70
    iget v8, v4, Lej;->k:I

    .line 71
    .line 72
    invoke-direct {v6, v1, v7, v8}, Lqe3;-><init>(Lpn;Lwe2;I)V

    .line 73
    .line 74
    .line 75
    const/16 v7, 0x12

    .line 76
    .line 77
    invoke-interface {v0, v7, v2, v9, v6}, Lcom/google/android/gms/internal/play_billing/zzan;->zzp(ILjava/lang/String;Landroid/os/Bundle;Lcom/google/android/gms/internal/play_billing/zzae;)V
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 83
    :try_start_4
    throw v0
    :try_end_4
    .catch Landroid/os/DeadObjectException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 84
    :goto_0
    sget-object v2, Lkf3;->h:Lkj;

    .line 85
    .line 86
    invoke-virtual {v4, v1, v2, v5, v0}, Lej;->w(Lpn;Lkj;ILjava/lang/Exception;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :goto_1
    sget-object v2, Lkf3;->j:Lkj;

    .line 91
    .line 92
    invoke-virtual {v4, v1, v2, v5, v0}, Lej;->w(Lpn;Lkj;ILjava/lang/Exception;)V

    .line 93
    .line 94
    .line 95
    :goto_2
    return-object v3

    .line 96
    :pswitch_0
    iget-object v0, v1, Lyd3;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzr;

    .line 99
    .line 100
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {v2}, Lkb1;->n(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iget-object v1, v1, Lyd3;->c:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, Lmp3;

    .line 108
    .line 109
    invoke-virtual {v1, v2}, Lmp3;->d(Ljava/lang/String;)Lok3;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    sget-object v4, Lnk3;->c:Lnk3;

    .line 114
    .line 115
    invoke-virtual {v2, v4}, Lok3;->i(Lnk3;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_2

    .line 120
    .line 121
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzr;->d0:Ljava/lang/String;

    .line 122
    .line 123
    const/16 v5, 0x64

    .line 124
    .line 125
    invoke-static {v5, v2}, Lok3;->c(ILjava/lang/String;)Lok3;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v2, v4}, Lok3;->i(Lnk3;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-nez v2, :cond_1

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_1
    invoke-virtual {v1, v0}, Lmp3;->a0(Lcom/google/android/gms/measurement/internal/zzr;)Ldi3;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0}, Ldi3;->E()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    goto :goto_4

    .line 145
    :cond_2
    :goto_3
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 150
    .line 151
    const-string v1, "Analytics storage consent denied. Returning null app instance id"

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :goto_4
    return-object v3

    .line 157
    :pswitch_1
    iget-object v0, v1, Lyd3;->c:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzjc;

    .line 160
    .line 161
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 162
    .line 163
    invoke-virtual {v2}, Lmp3;->A()V

    .line 164
    .line 165
    .line 166
    iget-object v1, v1, Lyd3;->b:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzr;

    .line 169
    .line 170
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzao;

    .line 171
    .line 172
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 173
    .line 174
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v0, v1}, Lmp3;->o0(Ljava/lang/String;)Landroid/os/Bundle;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-direct {v2, v0}, Lcom/google/android/gms/measurement/internal/zzao;-><init>(Landroid/os/Bundle;)V

    .line 181
    .line 182
    .line 183
    return-object v2

    .line 184
    :pswitch_2
    iget-object v0, v1, Lyd3;->c:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzjc;

    .line 187
    .line 188
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 189
    .line 190
    invoke-virtual {v2}, Lmp3;->A()V

    .line 191
    .line 192
    .line 193
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 194
    .line 195
    iget-object v0, v0, Lmp3;->c:Lae3;

    .line 196
    .line 197
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 198
    .line 199
    .line 200
    iget-object v1, v1, Lyd3;->b:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v1, Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {v0, v1}, Lae3;->w0(Ljava/lang/String;)Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    return-object v0

    .line 209
    :pswitch_3
    iget-object v0, v1, Lyd3;->c:Ljava/lang/Object;

    .line 210
    .line 211
    move-object v4, v0

    .line 212
    check-cast v4, Lej;

    .line 213
    .line 214
    const-string v8, "inapp"

    .line 215
    .line 216
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    const-string v0, "Querying owned items, item type: "

    .line 220
    .line 221
    const-string v5, "BillingClient"

    .line 222
    .line 223
    invoke-virtual {v0, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-static {v5, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    new-instance v0, Ljava/util/ArrayList;

    .line 231
    .line 232
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 233
    .line 234
    .line 235
    iget-boolean v9, v4, Lej;->m:Z

    .line 236
    .line 237
    iget-boolean v10, v4, Lej;->t:Z

    .line 238
    .line 239
    iget-object v5, v4, Lej;->w:Lec0;

    .line 240
    .line 241
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    iget-object v5, v4, Lej;->w:Lec0;

    .line 245
    .line 246
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    iget-object v5, v4, Lej;->A:Ljava/lang/Long;

    .line 250
    .line 251
    iget-object v13, v4, Lej;->c:Ljava/lang/String;

    .line 252
    .line 253
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 254
    .line 255
    .line 256
    move-result-wide v14

    .line 257
    const/4 v11, 0x1

    .line 258
    const/4 v12, 0x0

    .line 259
    invoke-static/range {v9 .. v15}, Lcom/google/android/gms/internal/play_billing/zze;->zzd(ZZZZLjava/lang/String;J)Landroid/os/Bundle;

    .line 260
    .line 261
    .line 262
    move-result-object v10

    .line 263
    move-object v9, v3

    .line 264
    :goto_5
    const/16 v11, 0x34

    .line 265
    .line 266
    :try_start_5
    iget-object v5, v4, Lej;->a:Ljava/lang/Object;

    .line 267
    .line 268
    monitor-enter v5
    :try_end_5
    .catch Landroid/os/DeadObjectException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 269
    move-object v6, v5

    .line 270
    :try_start_6
    iget-object v5, v4, Lej;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 271
    .line 272
    monitor-exit v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 273
    if-nez v5, :cond_3

    .line 274
    .line 275
    :try_start_7
    sget-object v0, Lkf3;->j:Lkj;

    .line 276
    .line 277
    const-string v5, "Service has been reset to null"

    .line 278
    .line 279
    invoke-virtual {v4, v0, v2, v5, v3}, Lej;->r(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lwe2;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    goto/16 :goto_d

    .line 284
    .line 285
    :catch_2
    move-exception v0

    .line 286
    goto/16 :goto_b

    .line 287
    .line 288
    :catch_3
    move-exception v0

    .line 289
    goto/16 :goto_c

    .line 290
    .line 291
    :cond_3
    iget-boolean v6, v4, Lej;->m:Z

    .line 292
    .line 293
    const/4 v14, 0x1

    .line 294
    if-eqz v6, :cond_5

    .line 295
    .line 296
    iget-boolean v6, v4, Lej;->t:Z

    .line 297
    .line 298
    if-eq v14, v6, :cond_4

    .line 299
    .line 300
    const/16 v6, 0x9

    .line 301
    .line 302
    goto :goto_6

    .line 303
    :cond_4
    const/16 v6, 0x13

    .line 304
    .line 305
    :goto_6
    iget-object v7, v4, Lej;->f:Landroid/content/Context;

    .line 306
    .line 307
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    invoke-interface/range {v5 .. v10}, Lcom/google/android/gms/internal/play_billing/zzan;->zzj(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    goto :goto_7

    .line 316
    :cond_5
    iget-object v6, v4, Lej;->f:Landroid/content/Context;

    .line 317
    .line 318
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v6

    .line 322
    const/4 v7, 0x3

    .line 323
    invoke-interface {v5, v7, v6, v8, v9}, Lcom/google/android/gms/internal/play_billing/zzan;->zzi(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 324
    .line 325
    .line 326
    move-result-object v5
    :try_end_7
    .catch Landroid/os/DeadObjectException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    .line 327
    :goto_7
    const-string v6, "INAPP_DATA_SIGNATURE_LIST"

    .line 328
    .line 329
    const-string v7, "INAPP_PURCHASE_DATA_LIST"

    .line 330
    .line 331
    const-string v9, "INAPP_PURCHASE_ITEM_LIST"

    .line 332
    .line 333
    sget-object v11, Lkf3;->h:Lkj;

    .line 334
    .line 335
    const-string v15, "BillingClient"

    .line 336
    .line 337
    const/16 v2, 0xb

    .line 338
    .line 339
    if-nez v5, :cond_6

    .line 340
    .line 341
    const-string v6, "getPurchase() got null owned items list"

    .line 342
    .line 343
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    new-instance v6, Ln7;

    .line 347
    .line 348
    const/16 v7, 0x36

    .line 349
    .line 350
    invoke-direct {v6, v11, v7, v2}, Ln7;-><init>(Ljava/lang/Object;II)V

    .line 351
    .line 352
    .line 353
    goto/16 :goto_9

    .line 354
    .line 355
    :cond_6
    invoke-static {v5, v15}, Lcom/google/android/gms/internal/play_billing/zze;->zzb(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 356
    .line 357
    .line 358
    move-result v12

    .line 359
    invoke-static {v5, v15}, Lcom/google/android/gms/internal/play_billing/zze;->zzh(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v13

    .line 363
    invoke-static {}, Lkj;->a()Ljj;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    iput v12, v3, Ljj;->a:I

    .line 368
    .line 369
    iput-object v13, v3, Ljj;->b:Ljava/lang/String;

    .line 370
    .line 371
    invoke-virtual {v3}, Ljj;->a()Lkj;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    if-eqz v12, :cond_7

    .line 376
    .line 377
    new-instance v6, Ljava/lang/StringBuilder;

    .line 378
    .line 379
    const-string v7, "getPurchase() failed. Response code: "

    .line 380
    .line 381
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    invoke-static {v15, v6}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    new-instance v6, Ln7;

    .line 395
    .line 396
    const/16 v7, 0x17

    .line 397
    .line 398
    invoke-direct {v6, v3, v7, v2}, Ln7;-><init>(Ljava/lang/Object;II)V

    .line 399
    .line 400
    .line 401
    goto :goto_9

    .line 402
    :cond_7
    invoke-virtual {v5, v9}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    if-eqz v3, :cond_c

    .line 407
    .line 408
    invoke-virtual {v5, v7}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 409
    .line 410
    .line 411
    move-result v3

    .line 412
    if-eqz v3, :cond_c

    .line 413
    .line 414
    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 415
    .line 416
    .line 417
    move-result v3

    .line 418
    if-nez v3, :cond_8

    .line 419
    .line 420
    goto :goto_8

    .line 421
    :cond_8
    invoke-virtual {v5, v9}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    invoke-virtual {v5, v7}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 426
    .line 427
    .line 428
    move-result-object v7

    .line 429
    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 430
    .line 431
    .line 432
    move-result-object v6

    .line 433
    if-nez v3, :cond_9

    .line 434
    .line 435
    const-string v3, "Bundle returned from getPurchase() contains null SKUs list."

    .line 436
    .line 437
    invoke-static {v15, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    new-instance v6, Ln7;

    .line 441
    .line 442
    const/16 v3, 0x38

    .line 443
    .line 444
    invoke-direct {v6, v11, v3, v2}, Ln7;-><init>(Ljava/lang/Object;II)V

    .line 445
    .line 446
    .line 447
    goto :goto_9

    .line 448
    :cond_9
    if-nez v7, :cond_a

    .line 449
    .line 450
    const-string v3, "Bundle returned from getPurchase() contains null purchases list."

    .line 451
    .line 452
    invoke-static {v15, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    new-instance v6, Ln7;

    .line 456
    .line 457
    const/16 v3, 0x39

    .line 458
    .line 459
    invoke-direct {v6, v11, v3, v2}, Ln7;-><init>(Ljava/lang/Object;II)V

    .line 460
    .line 461
    .line 462
    goto :goto_9

    .line 463
    :cond_a
    if-nez v6, :cond_b

    .line 464
    .line 465
    const-string v3, "Bundle returned from getPurchase() contains null signatures list."

    .line 466
    .line 467
    invoke-static {v15, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    new-instance v6, Ln7;

    .line 471
    .line 472
    const/16 v3, 0x3a

    .line 473
    .line 474
    invoke-direct {v6, v11, v3, v2}, Ln7;-><init>(Ljava/lang/Object;II)V

    .line 475
    .line 476
    .line 477
    goto :goto_9

    .line 478
    :cond_b
    new-instance v6, Ln7;

    .line 479
    .line 480
    sget-object v3, Lkf3;->i:Lkj;

    .line 481
    .line 482
    invoke-direct {v6, v3, v14, v2}, Ln7;-><init>(Ljava/lang/Object;II)V

    .line 483
    .line 484
    .line 485
    goto :goto_9

    .line 486
    :cond_c
    :goto_8
    const-string v3, "Bundle returned from getPurchase() doesn\'t contain required fields."

    .line 487
    .line 488
    invoke-static {v15, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    new-instance v6, Ln7;

    .line 492
    .line 493
    const/16 v3, 0x37

    .line 494
    .line 495
    invoke-direct {v6, v11, v3, v2}, Ln7;-><init>(Ljava/lang/Object;II)V

    .line 496
    .line 497
    .line 498
    :goto_9
    iget-object v2, v6, Ln7;->c:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v2, Lkj;

    .line 501
    .line 502
    sget-object v3, Lkf3;->i:Lkj;

    .line 503
    .line 504
    if-eq v2, v3, :cond_d

    .line 505
    .line 506
    iget v0, v6, Ln7;->b:I

    .line 507
    .line 508
    const-string v3, "Purchase bundle invalid"

    .line 509
    .line 510
    const/4 v5, 0x0

    .line 511
    invoke-virtual {v4, v2, v0, v3, v5}, Lej;->r(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lwe2;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    goto/16 :goto_d

    .line 516
    .line 517
    :cond_d
    const-string v2, "INAPP_PURCHASE_ITEM_LIST"

    .line 518
    .line 519
    invoke-virtual {v5, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    const-string v3, "INAPP_PURCHASE_DATA_LIST"

    .line 524
    .line 525
    invoke-virtual {v5, v3}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    const-string v6, "INAPP_DATA_SIGNATURE_LIST"

    .line 530
    .line 531
    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 532
    .line 533
    .line 534
    move-result-object v6

    .line 535
    const/4 v7, 0x0

    .line 536
    move v9, v7

    .line 537
    :goto_a
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 538
    .line 539
    .line 540
    move-result v11

    .line 541
    if-ge v7, v11, :cond_f

    .line 542
    .line 543
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v11

    .line 547
    check-cast v11, Ljava/lang/String;

    .line 548
    .line 549
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v12

    .line 553
    check-cast v12, Ljava/lang/String;

    .line 554
    .line 555
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v13

    .line 559
    check-cast v13, Ljava/lang/String;

    .line 560
    .line 561
    invoke-static {v13}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v13

    .line 565
    const-string v15, "Sku is owned: "

    .line 566
    .line 567
    const-string v14, "BillingClient"

    .line 568
    .line 569
    invoke-virtual {v15, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v13

    .line 573
    invoke-static {v14, v13}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    :try_start_8
    new-instance v13, Lsz1;

    .line 577
    .line 578
    invoke-direct {v13, v11, v12}, Lsz1;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_4

    .line 579
    .line 580
    .line 581
    iget-object v11, v13, Lsz1;->c:Lorg/json/JSONObject;

    .line 582
    .line 583
    const-string v12, "purchaseToken"

    .line 584
    .line 585
    const-string v14, "token"

    .line 586
    .line 587
    invoke-virtual {v11, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v12

    .line 591
    invoke-virtual {v11, v14, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v11

    .line 595
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 596
    .line 597
    .line 598
    move-result v11

    .line 599
    if-eqz v11, :cond_e

    .line 600
    .line 601
    const-string v9, "BillingClient"

    .line 602
    .line 603
    const-string v11, "BUG: empty/null token!"

    .line 604
    .line 605
    invoke-static {v9, v11}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    const/4 v9, 0x1

    .line 609
    :cond_e
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    add-int/lit8 v7, v7, 0x1

    .line 613
    .line 614
    const/4 v14, 0x1

    .line 615
    goto :goto_a

    .line 616
    :catch_4
    move-exception v0

    .line 617
    const-string v2, "Got an exception trying to decode the purchase!"

    .line 618
    .line 619
    sget-object v3, Lkf3;->h:Lkj;

    .line 620
    .line 621
    const/16 v5, 0x33

    .line 622
    .line 623
    invoke-virtual {v4, v3, v5, v2, v0}, Lej;->r(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lwe2;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    goto :goto_d

    .line 628
    :cond_f
    if-eqz v9, :cond_10

    .line 629
    .line 630
    const/16 v2, 0x1a

    .line 631
    .line 632
    sget-object v3, Lkf3;->h:Lkj;

    .line 633
    .line 634
    const/16 v6, 0x9

    .line 635
    .line 636
    invoke-virtual {v4, v2, v6, v3}, Lej;->x(IILkj;)V

    .line 637
    .line 638
    .line 639
    :cond_10
    const-string v2, "INAPP_CONTINUATION_TOKEN"

    .line 640
    .line 641
    invoke-virtual {v5, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v9

    .line 645
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    const-string v3, "Continuation token: "

    .line 650
    .line 651
    const-string v5, "BillingClient"

    .line 652
    .line 653
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    invoke-static {v5, v2}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 661
    .line 662
    .line 663
    move-result v2

    .line 664
    if-eqz v2, :cond_11

    .line 665
    .line 666
    new-instance v2, Lwe2;

    .line 667
    .line 668
    sget-object v3, Lkf3;->i:Lkj;

    .line 669
    .line 670
    const/16 v4, 0x13

    .line 671
    .line 672
    invoke-direct {v2, v4, v3, v0}, Lwe2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 673
    .line 674
    .line 675
    move-object v0, v2

    .line 676
    goto :goto_d

    .line 677
    :cond_11
    const/16 v2, 0x77

    .line 678
    .line 679
    const/4 v3, 0x0

    .line 680
    goto/16 :goto_5

    .line 681
    .line 682
    :catchall_1
    move-exception v0

    .line 683
    :try_start_9
    monitor-exit v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 684
    :try_start_a
    throw v0
    :try_end_a
    .catch Landroid/os/DeadObjectException; {:try_start_a .. :try_end_a} :catch_3
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    .line 685
    :goto_b
    const-string v2, "Got exception trying to get purchases try to reconnect"

    .line 686
    .line 687
    sget-object v3, Lkf3;->h:Lkj;

    .line 688
    .line 689
    invoke-virtual {v4, v3, v11, v2, v0}, Lej;->r(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lwe2;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    goto :goto_d

    .line 694
    :goto_c
    const-string v2, "Got exception trying to get purchases try to reconnect"

    .line 695
    .line 696
    sget-object v3, Lkf3;->j:Lkj;

    .line 697
    .line 698
    invoke-virtual {v4, v3, v11, v2, v0}, Lej;->r(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lwe2;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    :goto_d
    iget-object v2, v0, Lwe2;->c:Ljava/lang/Object;

    .line 703
    .line 704
    check-cast v2, Ljava/util/List;

    .line 705
    .line 706
    iget-object v1, v1, Lyd3;->b:Ljava/lang/Object;

    .line 707
    .line 708
    check-cast v1, Lx6;

    .line 709
    .line 710
    iget-object v0, v0, Lwe2;->b:Ljava/lang/Object;

    .line 711
    .line 712
    check-cast v0, Lkj;

    .line 713
    .line 714
    if-eqz v2, :cond_12

    .line 715
    .line 716
    invoke-virtual {v1, v0, v2}, Lx6;->g(Lkj;Ljava/util/List;)V

    .line 717
    .line 718
    .line 719
    :goto_e
    const/16 v16, 0x0

    .line 720
    .line 721
    goto :goto_f

    .line 722
    :cond_12
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzco;->zzl()Lcom/google/android/gms/internal/play_billing/zzco;

    .line 723
    .line 724
    .line 725
    move-result-object v2

    .line 726
    invoke-virtual {v1, v0, v2}, Lx6;->g(Lkj;Ljava/util/List;)V

    .line 727
    .line 728
    .line 729
    goto :goto_e

    .line 730
    :goto_f
    return-object v16

    .line 731
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

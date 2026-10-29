.class public final Lcp0;
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
    iput p1, p0, Lcp0;->a:I

    iput-object p2, p0, Lcp0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcp0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzjc;Lcom/google/android/gms/measurement/internal/zzah;)V
    .locals 1

    .line 1
    const/16 v0, 0x1b

    .line 2
    .line 3
    iput v0, p0, Lcp0;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lcp0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcp0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 16
    iput p3, p0, Lcp0;->a:I

    iput-object p1, p0, Lcp0;->c:Ljava/lang/Object;

    iput-object p2, p0, Lcp0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lmi3;Lcom/google/android/gms/internal/measurement/zzbq;Lmi3;)V
    .locals 0

    const/16 p3, 0x19

    iput p3, p0, Lcp0;->a:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcp0;->b:Ljava/lang/Object;

    iput-object p1, p0, Lcp0;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lcp0;->a:I

    .line 4
    .line 5
    const-string v2, "active_user"

    .line 6
    .line 7
    const/16 v3, 0x16

    .line 8
    .line 9
    const/16 v4, 0x10

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x1

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v0, v1, Lcp0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lsl3;

    .line 20
    .line 21
    iget-object v1, v1, Lcp0;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v7}, Lsl3;->P(Ljava/lang/Boolean;Z)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    const-string v0, "creation_timestamp"

    .line 30
    .line 31
    const-string v2, "app_id"

    .line 32
    .line 33
    iget-object v3, v1, Lcp0;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, Lsl3;

    .line 36
    .line 37
    invoke-virtual {v3}, Leg3;->y()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Lwg3;->A()V

    .line 41
    .line 42
    .line 43
    iget-object v1, v1, Lcp0;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Landroid/os/Bundle;

    .line 46
    .line 47
    const-string v4, "name"

    .line 48
    .line 49
    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    invoke-static {v9}, Lkb1;->k(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v3, v3, Lsq3;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Lij3;

    .line 59
    .line 60
    invoke-virtual {v3}, Lij3;->d()Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-nez v4, :cond_0

    .line 65
    .line 66
    iget-object v0, v3, Lij3;->f:Luh3;

    .line 67
    .line 68
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 72
    .line 73
    const-string v1, "Conditional property not cleared since app measurement is disabled"

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    new-instance v5, Lcom/google/android/gms/measurement/internal/zzpk;

    .line 80
    .line 81
    const-wide/16 v6, 0x0

    .line 82
    .line 83
    const/4 v8, 0x0

    .line 84
    const-string v10, ""

    .line 85
    .line 86
    invoke-direct/range {v5 .. v10}, Lcom/google/android/gms/measurement/internal/zzpk;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :try_start_0
    iget-object v6, v3, Lij3;->w:Lup3;

    .line 90
    .line 91
    invoke-static {v6}, Lij3;->j(Lsq3;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    const-string v4, "expired_event_name"

    .line 98
    .line 99
    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    const-string v4, "expired_event_params"

    .line 104
    .line 105
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    const-string v9, ""

    .line 110
    .line 111
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 112
    .line 113
    .line 114
    move-result-wide v10

    .line 115
    const/4 v12, 0x1

    .line 116
    invoke-virtual/range {v6 .. v12}, Lup3;->b0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)Lcom/google/android/gms/measurement/internal/zzbg;

    .line 117
    .line 118
    .line 119
    move-result-object v18
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    new-instance v4, Lcom/google/android/gms/measurement/internal/zzah;

    .line 121
    .line 122
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 127
    .line 128
    .line 129
    move-result-wide v8

    .line 130
    const-string v0, "active"

    .line 131
    .line 132
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    const-string v0, "trigger_event_name"

    .line 137
    .line 138
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v11

    .line 142
    const-string v0, "trigger_timeout"

    .line 143
    .line 144
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 145
    .line 146
    .line 147
    move-result-wide v13

    .line 148
    const-string v0, "time_to_live"

    .line 149
    .line 150
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 151
    .line 152
    .line 153
    move-result-wide v16

    .line 154
    const/4 v12, 0x0

    .line 155
    const/4 v15, 0x0

    .line 156
    const-string v6, ""

    .line 157
    .line 158
    move-object v7, v5

    .line 159
    move-object v5, v2

    .line 160
    invoke-direct/range {v4 .. v18}, Lcom/google/android/gms/measurement/internal/zzah;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzpk;JZLjava/lang/String;Lcom/google/android/gms/measurement/internal/zzbg;JLcom/google/android/gms/measurement/internal/zzbg;JLcom/google/android/gms/measurement/internal/zzbg;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v3}, Lij3;->o()Lpn3;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v0, v4}, Lpn3;->S(Lcom/google/android/gms/measurement/internal/zzah;)V

    .line 168
    .line 169
    .line 170
    :catch_0
    :goto_0
    return-void

    .line 171
    :pswitch_1
    iget-object v0, v1, Lcp0;->c:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzjc;

    .line 174
    .line 175
    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 176
    .line 177
    invoke-virtual {v2}, Lmp3;->A()V

    .line 178
    .line 179
    .line 180
    iget-object v1, v1, Lcp0;->b:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzah;

    .line 183
    .line 184
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpk;

    .line 185
    .line 186
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzpk;->D1()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 191
    .line 192
    if-nez v2, :cond_1

    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 198
    .line 199
    invoke-static {v2}, Lkb1;->n(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v2}, Lmp3;->O(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzr;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    if-eqz v2, :cond_2

    .line 207
    .line 208
    invoke-virtual {v0, v1, v2}, Lmp3;->Y(Lcom/google/android/gms/measurement/internal/zzah;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 209
    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzah;->a:Ljava/lang/String;

    .line 216
    .line 217
    invoke-static {v2}, Lkb1;->n(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v2}, Lmp3;->O(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzr;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    if-eqz v2, :cond_2

    .line 225
    .line 226
    invoke-virtual {v0, v1, v2}, Lmp3;->X(Lcom/google/android/gms/measurement/internal/zzah;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 227
    .line 228
    .line 229
    :cond_2
    :goto_1
    return-void

    .line 230
    :pswitch_2
    iget-object v0, v1, Lcp0;->c:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 233
    .line 234
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 235
    .line 236
    invoke-virtual {v0}, Lij3;->o()Lpn3;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    iget-object v1, v1, Lcp0;->b:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 243
    .line 244
    invoke-virtual {v0}, Leg3;->y()V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0}, Lwg3;->A()V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v6}, Lpn3;->P(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    new-instance v3, Ljs0;

    .line 255
    .line 256
    invoke-direct {v3, v4, v0, v2, v1}, Ljs0;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v3}, Lpn3;->N(Ljava/lang/Runnable;)V

    .line 260
    .line 261
    .line 262
    return-void

    .line 263
    :pswitch_3
    iget-object v0, v1, Lcp0;->c:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v0, Lmi3;

    .line 266
    .line 267
    iget-object v2, v0, Lmi3;->b:Loi3;

    .line 268
    .line 269
    iget-object v2, v2, Loi3;->b:Lij3;

    .line 270
    .line 271
    iget-object v3, v2, Lij3;->i:Lbj3;

    .line 272
    .line 273
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3}, Lbj3;->y()V

    .line 277
    .line 278
    .line 279
    new-instance v3, Landroid/os/Bundle;

    .line 280
    .line 281
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 282
    .line 283
    .line 284
    const-string v4, "package_name"

    .line 285
    .line 286
    iget-object v0, v0, Lmi3;->a:Ljava/lang/String;

    .line 287
    .line 288
    invoke-virtual {v3, v4, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    iget-object v0, v1, Lcp0;->b:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzbq;

    .line 294
    .line 295
    :try_start_1
    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/measurement/zzbq;->zze(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    if-nez v0, :cond_3

    .line 300
    .line 301
    iget-object v0, v2, Lij3;->f:Luh3;

    .line 302
    .line 303
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 304
    .line 305
    .line 306
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 307
    .line 308
    const-string v1, "Install Referrer Service returned a null response"

    .line 309
    .line 310
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 311
    .line 312
    .line 313
    goto :goto_2

    .line 314
    :catch_1
    move-exception v0

    .line 315
    iget-object v1, v2, Lij3;->f:Luh3;

    .line 316
    .line 317
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 318
    .line 319
    .line 320
    iget-object v1, v1, Luh3;->f:Lsh3;

    .line 321
    .line 322
    const-string v3, "Exception occurred while retrieving the Install Referrer"

    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-virtual {v1, v0, v3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    :cond_3
    :goto_2
    iget-object v0, v2, Lij3;->i:Lbj3;

    .line 332
    .line 333
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0}, Lbj3;->y()V

    .line 337
    .line 338
    .line 339
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 340
    .line 341
    const-string v1, "Unexpected call on client side"

    .line 342
    .line 343
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    throw v0

    .line 347
    :pswitch_4
    iget-object v0, v1, Lcp0;->b:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v0, Ljk3;

    .line 350
    .line 351
    invoke-interface {v0}, Ljk3;->c()Lq62;

    .line 352
    .line 353
    .line 354
    invoke-static {}, Lq62;->g()Z

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    if-eqz v2, :cond_4

    .line 359
    .line 360
    invoke-interface {v0}, Ljk3;->b()Lbj3;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-virtual {v0, v1}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 365
    .line 366
    .line 367
    goto :goto_3

    .line 368
    :cond_4
    iget-object v0, v1, Lcp0;->c:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v0, Lbe3;

    .line 371
    .line 372
    iget-wide v1, v0, Lbe3;->c:J

    .line 373
    .line 374
    const-wide/16 v3, 0x0

    .line 375
    .line 376
    cmp-long v1, v1, v3

    .line 377
    .line 378
    if-eqz v1, :cond_5

    .line 379
    .line 380
    move v6, v7

    .line 381
    :cond_5
    iput-wide v3, v0, Lbe3;->c:J

    .line 382
    .line 383
    if-eqz v6, :cond_6

    .line 384
    .line 385
    invoke-virtual {v0}, Lbe3;->a()V

    .line 386
    .line 387
    .line 388
    :cond_6
    :goto_3
    return-void

    .line 389
    :pswitch_5
    iget-object v0, v1, Lcp0;->b:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v0, Ljava/util/concurrent/Future;

    .line 392
    .line 393
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    if-nez v2, :cond_7

    .line 398
    .line 399
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    if-nez v2, :cond_7

    .line 404
    .line 405
    iget-object v1, v1, Lcp0;->c:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v1, Ljava/lang/Runnable;

    .line 408
    .line 409
    invoke-interface {v0, v7}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 410
    .line 411
    .line 412
    const-string v0, "BillingClient"

    .line 413
    .line 414
    const-string v2, "Async task is taking too long, cancel it!"

    .line 415
    .line 416
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    if-eqz v1, :cond_7

    .line 420
    .line 421
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 422
    .line 423
    .line 424
    :cond_7
    return-void

    .line 425
    :pswitch_6
    iget-object v0, v1, Lcp0;->b:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v0, Lej;

    .line 428
    .line 429
    iget-object v1, v1, Lcp0;->c:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v1, Lcom/supercell/titan/h;

    .line 432
    .line 433
    sget-object v2, Lkf3;->k:Lkj;

    .line 434
    .line 435
    const/16 v3, 0x18

    .line 436
    .line 437
    const/16 v4, 0x8

    .line 438
    .line 439
    invoke-virtual {v0, v3, v4, v2}, Lej;->x(IILkj;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v1, v2, v5}, Lcom/supercell/titan/h;->a(Lkj;Ljava/util/List;)V

    .line 443
    .line 444
    .line 445
    return-void

    .line 446
    :pswitch_7
    iget-object v0, v1, Lcp0;->b:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v0, Lv81;

    .line 449
    .line 450
    iget-object v1, v1, Lcp0;->c:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v1, Lu81;

    .line 453
    .line 454
    iget-object v0, v0, Lv81;->b:Ljava/lang/Object;

    .line 455
    .line 456
    if-nez v0, :cond_8

    .line 457
    .line 458
    invoke-interface {v1}, Lu81;->onNotifyListenerFailed()V

    .line 459
    .line 460
    .line 461
    goto :goto_4

    .line 462
    :cond_8
    :try_start_2
    invoke-interface {v1, v0}, Lu81;->notifyListener(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    .line 463
    .line 464
    .line 465
    :goto_4
    return-void

    .line 466
    :catch_2
    move-exception v0

    .line 467
    invoke-interface {v1}, Lu81;->onNotifyListenerFailed()V

    .line 468
    .line 469
    .line 470
    throw v0

    .line 471
    :pswitch_8
    iget-object v0, v1, Lcp0;->c:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast v0, Lnm;

    .line 474
    .line 475
    iget-object v2, v0, Lnm;->e:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v2, Liy;

    .line 478
    .line 479
    invoke-virtual {v2}, Liy;->h()I

    .line 480
    .line 481
    .line 482
    invoke-virtual {v0}, Lnm;->p()Z

    .line 483
    .line 484
    .line 485
    move-result v2

    .line 486
    if-eqz v2, :cond_9

    .line 487
    .line 488
    iget-object v2, v0, Lnm;->c:Ljava/lang/Object;

    .line 489
    .line 490
    check-cast v2, Lqi1;

    .line 491
    .line 492
    iget-object v1, v1, Lcp0;->b:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v1, Ljava/lang/String;

    .line 495
    .line 496
    invoke-virtual {v0}, Lnm;->e()Ljava/util/HashMap;

    .line 497
    .line 498
    .line 499
    move-result-object v4

    .line 500
    new-instance v5, Ler0;

    .line 501
    .line 502
    invoke-direct {v5, v0, v3}, Ler0;-><init>(Ljava/lang/Object;I)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v2, v1, v4, v6, v5}, Lqi1;->i(Ljava/lang/String;Ljava/util/HashMap;ZLer0;)V

    .line 506
    .line 507
    .line 508
    :cond_9
    return-void

    .line 509
    :pswitch_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 510
    .line 511
    const-string v2, "ScExternalWebView timeout after "

    .line 512
    .line 513
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    iget-object v2, v1, Lcp0;->c:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast v2, Lcom/supercell/titan/ScExternalWebView;

    .line 519
    .line 520
    iget-wide v2, v2, Lcom/supercell/titan/ScExternalWebView;->g:J

    .line 521
    .line 522
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    const-string v2, "ms"

    .line 526
    .line 527
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    const-string v2, "ScExternalWebView"

    .line 535
    .line 536
    invoke-static {v2, v0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 537
    .line 538
    .line 539
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    iget-object v3, v1, Lcp0;->b:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast v3, Ljava/lang/String;

    .line 546
    .line 547
    new-instance v4, Lji1;

    .line 548
    .line 549
    const/4 v5, 0x7

    .line 550
    invoke-direct {v4, v5, v1, v3}, Lji1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v0, v4}, Lcom/supercell/titan/GameApp;->runOnView(Ljava/lang/Runnable;)V

    .line 554
    .line 555
    .line 556
    :try_start_3
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    const v1, 0xa04c

    .line 561
    .line 562
    .line 563
    invoke-virtual {v0, v1}, Landroid/app/Activity;->finishActivity(I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 564
    .line 565
    .line 566
    goto :goto_5

    .line 567
    :catch_3
    move-exception v0

    .line 568
    new-instance v1, Ljava/lang/StringBuilder;

    .line 569
    .line 570
    const-string v3, "Could not close Custom Tab on timeout: "

    .line 571
    .line 572
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    invoke-static {v2, v0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 587
    .line 588
    .line 589
    :goto_5
    return-void

    .line 590
    :pswitch_a
    iget-object v0, v1, Lcp0;->b:Ljava/lang/Object;

    .line 591
    .line 592
    check-cast v0, Lac0;

    .line 593
    .line 594
    iget-object v1, v1, Lcp0;->c:Ljava/lang/Object;

    .line 595
    .line 596
    invoke-virtual {v0, v1}, Lac0;->accept(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    return-void

    .line 600
    :pswitch_b
    iget-object v0, v1, Lcp0;->c:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast v0, Lcom/supercell/titan/LocationService;

    .line 603
    .line 604
    iget-wide v2, v0, Lcom/supercell/titan/LocationService;->d:J

    .line 605
    .line 606
    iget-object v0, v1, Lcp0;->b:Ljava/lang/Object;

    .line 607
    .line 608
    check-cast v0, Landroid/location/Location;

    .line 609
    .line 610
    move-wide v1, v2

    .line 611
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    .line 612
    .line 613
    .line 614
    move-result-wide v3

    .line 615
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    .line 616
    .line 617
    .line 618
    move-result-wide v5

    .line 619
    invoke-static/range {v1 .. v6}, Lcom/supercell/titan/LocationService;->locationChanged(JDD)V

    .line 620
    .line 621
    .line 622
    return-void

    .line 623
    :pswitch_c
    iget-object v0, v1, Lcp0;->c:Ljava/lang/Object;

    .line 624
    .line 625
    move-object v2, v0

    .line 626
    check-cast v2, Lm71;

    .line 627
    .line 628
    iget-object v3, v2, Lm71;->c:Ls10;

    .line 629
    .line 630
    :cond_a
    :try_start_4
    iget-object v0, v1, Lcp0;->b:Ljava/lang/Object;

    .line 631
    .line 632
    check-cast v0, Ljava/lang/Runnable;

    .line 633
    .line 634
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 635
    .line 636
    .line 637
    goto :goto_6

    .line 638
    :catchall_0
    move-exception v0

    .line 639
    sget-object v5, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 640
    .line 641
    invoke-static {v0, v5}, Lb40;->o(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V

    .line 642
    .line 643
    .line 644
    :goto_6
    invoke-virtual {v2}, Lm71;->l()Ljava/lang/Runnable;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    if-nez v0, :cond_b

    .line 649
    .line 650
    goto :goto_7

    .line 651
    :cond_b
    iput-object v0, v1, Lcp0;->b:Ljava/lang/Object;

    .line 652
    .line 653
    add-int/2addr v6, v7

    .line 654
    if-lt v6, v4, :cond_a

    .line 655
    .line 656
    invoke-virtual {v3}, Ls10;->i()Z

    .line 657
    .line 658
    .line 659
    move-result v0

    .line 660
    if-eqz v0, :cond_a

    .line 661
    .line 662
    invoke-virtual {v3, v2, v1}, Ls10;->g(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    .line 663
    .line 664
    .line 665
    :goto_7
    return-void

    .line 666
    :pswitch_d
    iget-object v0, v1, Lcp0;->c:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v0, Ldp0;

    .line 669
    .line 670
    iget-object v0, v0, Ldp0;->c:Ljava/lang/Object;

    .line 671
    .line 672
    check-cast v0, Lcom/supercell/titan/KeyboardDialog;

    .line 673
    .line 674
    iget-object v0, v0, Lcom/supercell/titan/KeyboardDialog;->d:Lbp2;

    .line 675
    .line 676
    iget-object v1, v1, Lcp0;->b:Ljava/lang/Object;

    .line 677
    .line 678
    check-cast v1, Landroid/graphics/Typeface;

    .line 679
    .line 680
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 681
    .line 682
    .line 683
    return-void

    .line 684
    :pswitch_e
    :try_start_5
    sput-boolean v7, Lcom/supercell/titan/HelpshiftTitan;->j:Z

    .line 685
    .line 686
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    iget-object v2, v1, Lcp0;->b:Ljava/lang/Object;

    .line 691
    .line 692
    check-cast v2, Ljava/lang/String;

    .line 693
    .line 694
    iget-object v1, v1, Lcp0;->c:Ljava/lang/Object;

    .line 695
    .line 696
    check-cast v1, Ljava/util/HashMap;

    .line 697
    .line 698
    invoke-static {v0, v2, v1}, Lhu0;->C0(Lcom/supercell/titan/GameApp;Ljava/lang/String;Ljava/util/HashMap;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 699
    .line 700
    .line 701
    goto :goto_8

    .line 702
    :catch_4
    move-exception v0

    .line 703
    const-string v1, "HelpshiftTitan"

    .line 704
    .line 705
    const-string v2, "HelpshiftTitan.showSingleFAQ"

    .line 706
    .line 707
    invoke-static {v1, v2, v0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 708
    .line 709
    .line 710
    :goto_8
    return-void

    .line 711
    :pswitch_f
    iget-object v0, v1, Lcp0;->b:Ljava/lang/Object;

    .line 712
    .line 713
    check-cast v0, Lrs0;

    .line 714
    .line 715
    iget-object v0, v0, Lrs0;->f:Lnm;

    .line 716
    .line 717
    iget-object v1, v1, Lcp0;->c:Ljava/lang/Object;

    .line 718
    .line 719
    check-cast v1, Ljava/lang/String;

    .line 720
    .line 721
    iget-object v3, v0, Lnm;->a:Ljava/lang/Object;

    .line 722
    .line 723
    check-cast v3, Ler0;

    .line 724
    .line 725
    invoke-virtual {v3}, Ler0;->m()Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v4

    .line 729
    invoke-static {v4}, Lb40;->p(Ljava/lang/String;)Z

    .line 730
    .line 731
    .line 732
    move-result v5

    .line 733
    if-nez v5, :cond_c

    .line 734
    .line 735
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    move-result v4

    .line 739
    if-eqz v4, :cond_c

    .line 740
    .line 741
    invoke-virtual {v0}, Lnm;->m()Z

    .line 742
    .line 743
    .line 744
    move-result v4

    .line 745
    if-nez v4, :cond_10

    .line 746
    .line 747
    :cond_c
    invoke-virtual {v3}, Ler0;->m()Ljava/lang/String;

    .line 748
    .line 749
    .line 750
    move-result-object v3

    .line 751
    invoke-static {v1}, Lb40;->r(Ljava/lang/String;)Z

    .line 752
    .line 753
    .line 754
    move-result v4

    .line 755
    if-eqz v4, :cond_d

    .line 756
    .line 757
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 758
    .line 759
    .line 760
    move-result v3

    .line 761
    if-nez v3, :cond_d

    .line 762
    .line 763
    goto :goto_9

    .line 764
    :cond_d
    move v7, v6

    .line 765
    :goto_9
    iget-object v3, v0, Lnm;->c:Ljava/lang/Object;

    .line 766
    .line 767
    check-cast v3, Lqi1;

    .line 768
    .line 769
    iget-object v3, v3, Lqi1;->a:Ljava/lang/Object;

    .line 770
    .line 771
    check-cast v3, Ler0;

    .line 772
    .line 773
    const-string v4, "current_push_token"

    .line 774
    .line 775
    invoke-virtual {v3, v4, v1}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 776
    .line 777
    .line 778
    const-string v3, "push_token_synced"

    .line 779
    .line 780
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 781
    .line 782
    invoke-virtual {v0, v4, v3}, Lnm;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    iget-object v3, v0, Lnm;->a:Ljava/lang/Object;

    .line 786
    .line 787
    check-cast v3, Ler0;

    .line 788
    .line 789
    iget-object v3, v3, Ler0;->b:Ljava/lang/Object;

    .line 790
    .line 791
    check-cast v3, Ler0;

    .line 792
    .line 793
    invoke-virtual {v3, v2}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v2

    .line 797
    invoke-static {v2}, Lb40;->w(Ljava/lang/String;)Ljava/util/HashMap;

    .line 798
    .line 799
    .line 800
    move-result-object v2

    .line 801
    invoke-static {v2}, Lb40;->q(Ljava/util/Map;)Z

    .line 802
    .line 803
    .line 804
    move-result v3

    .line 805
    if-eqz v3, :cond_e

    .line 806
    .line 807
    invoke-virtual {v0}, Lnm;->f()Ljava/util/HashMap;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    :cond_e
    invoke-static {v2}, Lb40;->q(Ljava/util/Map;)Z

    .line 812
    .line 813
    .line 814
    move-result v2

    .line 815
    if-eqz v2, :cond_f

    .line 816
    .line 817
    goto :goto_a

    .line 818
    :cond_f
    if-eqz v7, :cond_10

    .line 819
    .line 820
    invoke-virtual {v0}, Lnm;->p()Z

    .line 821
    .line 822
    .line 823
    move-result v2

    .line 824
    if-eqz v2, :cond_10

    .line 825
    .line 826
    iget-object v2, v0, Lnm;->f:Ljava/lang/Object;

    .line 827
    .line 828
    check-cast v2, Lra2;

    .line 829
    .line 830
    iget-object v2, v2, Lra2;->a:Ljava/lang/Object;

    .line 831
    .line 832
    check-cast v2, Lfs0;

    .line 833
    .line 834
    new-instance v3, Lcp0;

    .line 835
    .line 836
    const/16 v4, 0x14

    .line 837
    .line 838
    invoke-direct {v3, v0, v1, v4, v6}, Lcp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 839
    .line 840
    .line 841
    invoke-virtual {v2, v3}, Lfs0;->w(Ljava/lang/Runnable;)V

    .line 842
    .line 843
    .line 844
    :cond_10
    :goto_a
    return-void

    .line 845
    :pswitch_10
    iget-object v0, v1, Lcp0;->b:Ljava/lang/Object;

    .line 846
    .line 847
    check-cast v0, Lrs0;

    .line 848
    .line 849
    iget-object v0, v0, Lrs0;->f:Lnm;

    .line 850
    .line 851
    iget-object v4, v0, Lnm;->a:Ljava/lang/Object;

    .line 852
    .line 853
    check-cast v4, Ler0;

    .line 854
    .line 855
    iget-object v8, v0, Lnm;->a:Ljava/lang/Object;

    .line 856
    .line 857
    check-cast v8, Ler0;

    .line 858
    .line 859
    iget-object v4, v4, Ler0;->b:Ljava/lang/Object;

    .line 860
    .line 861
    check-cast v4, Ler0;

    .line 862
    .line 863
    iget-object v4, v4, Ler0;->b:Ljava/lang/Object;

    .line 864
    .line 865
    check-cast v4, Landroid/content/SharedPreferences;

    .line 866
    .line 867
    const-string v9, "clear_anonymous_user"

    .line 868
    .line 869
    invoke-interface {v4, v9, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 870
    .line 871
    .line 872
    move-result v4

    .line 873
    const-string v9, "{}"

    .line 874
    .line 875
    if-eqz v4, :cond_11

    .line 876
    .line 877
    iget-object v4, v8, Ler0;->b:Ljava/lang/Object;

    .line 878
    .line 879
    check-cast v4, Ler0;

    .line 880
    .line 881
    const-string v10, "anon_user_id_map"

    .line 882
    .line 883
    invoke-virtual {v4, v10}, Ler0;->z(Ljava/lang/String;)V

    .line 884
    .line 885
    .line 886
    const-string v4, "anon_user_data"

    .line 887
    .line 888
    invoke-virtual {v8, v4, v9}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v0}, Lnm;->b()V

    .line 892
    .line 893
    .line 894
    :cond_11
    iget-object v1, v1, Lcp0;->c:Ljava/lang/Object;

    .line 895
    .line 896
    check-cast v1, Ljava/util/HashMap;

    .line 897
    .line 898
    invoke-static {v1}, Lb40;->q(Ljava/util/Map;)Z

    .line 899
    .line 900
    .line 901
    move-result v4

    .line 902
    if-eqz v4, :cond_12

    .line 903
    .line 904
    const-string v0, "UsrMngr"

    .line 905
    .line 906
    const-string v1, "Empty data for user login"

    .line 907
    .line 908
    invoke-static {v0, v1, v5}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 909
    .line 910
    .line 911
    goto/16 :goto_b

    .line 912
    .line 913
    :cond_12
    iget-object v4, v8, Ler0;->b:Ljava/lang/Object;

    .line 914
    .line 915
    check-cast v4, Ler0;

    .line 916
    .line 917
    invoke-virtual {v4, v2}, Ler0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 918
    .line 919
    .line 920
    move-result-object v4

    .line 921
    invoke-static {v4}, Lb40;->w(Ljava/lang/String;)Ljava/util/HashMap;

    .line 922
    .line 923
    .line 924
    move-result-object v4

    .line 925
    invoke-static {v4}, Lb40;->q(Ljava/util/Map;)Z

    .line 926
    .line 927
    .line 928
    move-result v10

    .line 929
    if-nez v10, :cond_13

    .line 930
    .line 931
    invoke-interface {v4, v1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 932
    .line 933
    .line 934
    move-result v10

    .line 935
    if-eqz v10, :cond_13

    .line 936
    .line 937
    goto/16 :goto_b

    .line 938
    .line 939
    :cond_13
    invoke-static {v4}, Lb40;->q(Ljava/util/Map;)Z

    .line 940
    .line 941
    .line 942
    move-result v10

    .line 943
    if-eqz v10, :cond_14

    .line 944
    .line 945
    invoke-virtual {v0}, Lnm;->f()Ljava/util/HashMap;

    .line 946
    .line 947
    .line 948
    move-result-object v4

    .line 949
    :cond_14
    iget-object v10, v0, Lnm;->d:Ljava/lang/Object;

    .line 950
    .line 951
    check-cast v10, Lcb;

    .line 952
    .line 953
    invoke-virtual {v10}, Lcb;->L()V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v0}, Lnm;->m()Z

    .line 957
    .line 958
    .line 959
    move-result v10

    .line 960
    if-eqz v10, :cond_15

    .line 961
    .line 962
    iget-object v10, v0, Lnm;->c:Ljava/lang/Object;

    .line 963
    .line 964
    check-cast v10, Lqi1;

    .line 965
    .line 966
    invoke-virtual {v0, v4}, Lnm;->j(Ljava/util/HashMap;)Ljava/util/HashMap;

    .line 967
    .line 968
    .line 969
    move-result-object v4

    .line 970
    new-instance v11, Ler0;

    .line 971
    .line 972
    invoke-direct {v11, v0, v3}, Ler0;-><init>(Ljava/lang/Object;I)V

    .line 973
    .line 974
    .line 975
    const-string v3, "unreg"

    .line 976
    .line 977
    invoke-virtual {v10, v3, v4, v7, v11}, Lqi1;->i(Ljava/lang/String;Ljava/util/HashMap;ZLer0;)V

    .line 978
    .line 979
    .line 980
    :cond_15
    iget-object v3, v8, Ler0;->b:Ljava/lang/Object;

    .line 981
    .line 982
    check-cast v3, Ler0;

    .line 983
    .line 984
    invoke-virtual {v3, v2}, Ler0;->z(Ljava/lang/String;)V

    .line 985
    .line 986
    .line 987
    const-string v3, "active_user_data"

    .line 988
    .line 989
    invoke-virtual {v8, v3, v9}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 990
    .line 991
    .line 992
    new-instance v3, Lorg/json/JSONArray;

    .line 993
    .line 994
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 995
    .line 996
    .line 997
    invoke-virtual {v8, v3}, Ler0;->A(Lorg/json/JSONArray;)V

    .line 998
    .line 999
    .line 1000
    iget-object v3, v0, Lnm;->g:Ljava/lang/Object;

    .line 1001
    .line 1002
    check-cast v3, Lb5;

    .line 1003
    .line 1004
    iget-object v3, v3, Lb5;->b:Ljava/lang/Object;

    .line 1005
    .line 1006
    check-cast v3, Landroid/content/Context;

    .line 1007
    .line 1008
    const-string v4, "AppUtil"

    .line 1009
    .line 1010
    const-string v7, "Cancelling notification"

    .line 1011
    .line 1012
    invoke-static {v4, v7, v5}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1013
    .line 1014
    .line 1015
    invoke-static {v3}, Lb40;->n(Landroid/content/Context;)Landroid/app/NotificationManager;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v3

    .line 1019
    if-eqz v3, :cond_16

    .line 1020
    .line 1021
    const-string v4, "hsft_notification_tag"

    .line 1022
    .line 1023
    const/16 v7, 0x79

    .line 1024
    .line 1025
    invoke-virtual {v3, v4, v7}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    .line 1026
    .line 1027
    .line 1028
    :cond_16
    new-instance v3, Lorg/json/JSONObject;

    .line 1029
    .line 1030
    invoke-direct {v3, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v1

    .line 1037
    invoke-virtual {v8, v2, v1}, Ler0;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 1038
    .line 1039
    .line 1040
    iget-object v1, v0, Lnm;->h:Ljava/lang/Object;

    .line 1041
    .line 1042
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 1043
    .line 1044
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v1

    .line 1048
    if-eqz v1, :cond_17

    .line 1049
    .line 1050
    iget-object v1, v0, Lnm;->h:Ljava/lang/Object;

    .line 1051
    .line 1052
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 1053
    .line 1054
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v1

    .line 1058
    check-cast v1, Lls0;

    .line 1059
    .line 1060
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1061
    .line 1062
    .line 1063
    sget-object v2, Lrs0;->y:Lrs0;

    .line 1064
    .line 1065
    iget-object v2, v2, Lrs0;->e:Liy;

    .line 1066
    .line 1067
    invoke-virtual {v2, v6}, Liy;->m(Z)Lorg/json/JSONObject;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v2

    .line 1071
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v2

    .line 1075
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1076
    .line 1077
    const-string v4, "window.helpshiftConfig = JSON.parse(JSON.stringify("

    .line 1078
    .line 1079
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1083
    .line 1084
    .line 1085
    const-string v2, "));Helpshift(\'updateHelpshiftConfig\')"

    .line 1086
    .line 1087
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v2

    .line 1094
    invoke-virtual {v1, v2, v5}, Lls0;->g(Ljava/lang/String;Lks0;)V

    .line 1095
    .line 1096
    .line 1097
    :cond_17
    iget-object v1, v0, Lnm;->f:Ljava/lang/Object;

    .line 1098
    .line 1099
    check-cast v1, Lra2;

    .line 1100
    .line 1101
    iget-object v1, v1, Lra2;->a:Ljava/lang/Object;

    .line 1102
    .line 1103
    check-cast v1, Lfs0;

    .line 1104
    .line 1105
    new-instance v2, Lye;

    .line 1106
    .line 1107
    const/16 v3, 0x1a

    .line 1108
    .line 1109
    invoke-direct {v2, v0, v3}, Lye;-><init>(Ljava/lang/Object;I)V

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual {v1, v2}, Lfs0;->w(Ljava/lang/Runnable;)V

    .line 1113
    .line 1114
    .line 1115
    :goto_b
    return-void

    .line 1116
    :pswitch_11
    iget-object v0, v1, Lcp0;->b:Ljava/lang/Object;

    .line 1117
    .line 1118
    check-cast v0, Ler;

    .line 1119
    .line 1120
    iget-object v1, v1, Lcp0;->c:Ljava/lang/Object;

    .line 1121
    .line 1122
    check-cast v1, Lkt0;

    .line 1123
    .line 1124
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1125
    .line 1126
    invoke-virtual {v0, v1, v2}, Ler;->E(Ls10;Lkotlin/Unit;)V

    .line 1127
    .line 1128
    .line 1129
    return-void

    .line 1130
    :pswitch_12
    iget-object v0, v1, Lcp0;->c:Ljava/lang/Object;

    .line 1131
    .line 1132
    check-cast v0, Lb5;

    .line 1133
    .line 1134
    iget-object v1, v1, Lcp0;->b:Ljava/lang/Object;

    .line 1135
    .line 1136
    check-cast v1, Ljava/lang/String;

    .line 1137
    .line 1138
    const-class v2, Lcom/helpshift/activities/HSMainActivity;

    .line 1139
    .line 1140
    invoke-static {v0, v1, v2}, Lb5;->f(Lb5;Ljava/lang/String;Ljava/lang/Class;)V

    .line 1141
    .line 1142
    .line 1143
    return-void

    .line 1144
    :pswitch_13
    iget-object v0, v1, Lcp0;->c:Ljava/lang/Object;

    .line 1145
    .line 1146
    check-cast v0, Lra2;

    .line 1147
    .line 1148
    iget-object v0, v0, Lra2;->a:Ljava/lang/Object;

    .line 1149
    .line 1150
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 1151
    .line 1152
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v0

    .line 1156
    check-cast v0, Lxs0;

    .line 1157
    .line 1158
    if-eqz v0, :cond_18

    .line 1159
    .line 1160
    iget-object v1, v1, Lcp0;->b:Ljava/lang/Object;

    .line 1161
    .line 1162
    check-cast v1, Landroid/content/Intent;

    .line 1163
    .line 1164
    :try_start_6
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    .line 1165
    .line 1166
    .line 1167
    goto :goto_c

    .line 1168
    :catch_5
    move-exception v0

    .line 1169
    const-string v1, "HelpCenter"

    .line 1170
    .line 1171
    const-string v2, "Unable to resolve the activity for this intent"

    .line 1172
    .line 1173
    invoke-static {v1, v2, v0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1174
    .line 1175
    .line 1176
    :cond_18
    :goto_c
    return-void

    .line 1177
    :pswitch_14
    iget-object v0, v1, Lcp0;->c:Ljava/lang/Object;

    .line 1178
    .line 1179
    check-cast v0, Leq2;

    .line 1180
    .line 1181
    iget-object v0, v0, Leq2;->i:Ljava/lang/Object;

    .line 1182
    .line 1183
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 1184
    .line 1185
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v0

    .line 1189
    check-cast v0, Lls0;

    .line 1190
    .line 1191
    if-eqz v0, :cond_19

    .line 1192
    .line 1193
    iget-object v1, v1, Lcp0;->b:Ljava/lang/Object;

    .line 1194
    .line 1195
    check-cast v1, Landroid/webkit/WebView;

    .line 1196
    .line 1197
    iget-object v0, v0, Lls0;->e:Landroid/widget/LinearLayout;

    .line 1198
    .line 1199
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1200
    .line 1201
    .line 1202
    :cond_19
    return-void

    .line 1203
    :pswitch_15
    :try_start_7
    iget-object v0, v1, Lcp0;->c:Ljava/lang/Object;

    .line 1204
    .line 1205
    check-cast v0, Lxy1;

    .line 1206
    .line 1207
    iget-object v1, v1, Lcp0;->b:Ljava/lang/Object;

    .line 1208
    .line 1209
    check-cast v1, Lorg/json/JSONArray;

    .line 1210
    .line 1211
    invoke-static {v0, v1, v6}, Lxy1;->a(Lxy1;Lorg/json/JSONArray;Z)I
    :try_end_7
    .catch Lgt0; {:try_start_7 .. :try_end_7} :catch_6

    .line 1212
    .line 1213
    .line 1214
    goto :goto_d

    .line 1215
    :catch_6
    move-exception v0

    .line 1216
    const-string v1, "analyticsMngr"

    .line 1217
    .line 1218
    const-string v2, "Failed to send quit event"

    .line 1219
    .line 1220
    invoke-static {v1, v2, v0}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1221
    .line 1222
    .line 1223
    :goto_d
    return-void

    .line 1224
    :pswitch_16
    iget-object v0, v1, Lcp0;->b:Ljava/lang/Object;

    .line 1225
    .line 1226
    check-cast v0, Landroid/widget/AutoCompleteTextView;

    .line 1227
    .line 1228
    iget-object v1, v1, Lcp0;->c:Ljava/lang/Object;

    .line 1229
    .line 1230
    check-cast v1, Lnv;

    .line 1231
    .line 1232
    iget-object v1, v1, Lnv;->b:Lde0;

    .line 1233
    .line 1234
    check-cast v1, Lza0;

    .line 1235
    .line 1236
    iget-object v1, v1, Lza0;->e:Lwa0;

    .line 1237
    .line 1238
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1239
    .line 1240
    .line 1241
    return-void

    .line 1242
    :pswitch_17
    iget-object v0, v1, Lcp0;->b:Ljava/lang/Object;

    .line 1243
    .line 1244
    check-cast v0, Landroid/widget/EditText;

    .line 1245
    .line 1246
    iget-object v1, v1, Lcp0;->c:Ljava/lang/Object;

    .line 1247
    .line 1248
    check-cast v1, Lnv;

    .line 1249
    .line 1250
    iget-object v1, v1, Lnv;->b:Lde0;

    .line 1251
    .line 1252
    check-cast v1, Lqv;

    .line 1253
    .line 1254
    iget-object v2, v1, Lqv;->e:Lkv;

    .line 1255
    .line 1256
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v1, v7}, Lqv;->e(Z)V

    .line 1260
    .line 1261
    .line 1262
    return-void

    .line 1263
    :pswitch_18
    iget-object v0, v1, Lcp0;->b:Ljava/lang/Object;

    .line 1264
    .line 1265
    check-cast v0, Lts0;

    .line 1266
    .line 1267
    iget-object v1, v1, Lcp0;->c:Ljava/lang/Object;

    .line 1268
    .line 1269
    check-cast v1, Landroid/graphics/Typeface;

    .line 1270
    .line 1271
    iget-object v0, v0, Lts0;->a:Ljava/lang/Object;

    .line 1272
    .line 1273
    check-cast v0, Lde3;

    .line 1274
    .line 1275
    if-eqz v0, :cond_1a

    .line 1276
    .line 1277
    invoke-virtual {v0, v1}, Lde3;->B(Landroid/graphics/Typeface;)V

    .line 1278
    .line 1279
    .line 1280
    :cond_1a
    return-void

    .line 1281
    :pswitch_19
    iget-object v0, v1, Lcp0;->c:Ljava/lang/Object;

    .line 1282
    .line 1283
    iget-object v1, v1, Lcp0;->b:Ljava/lang/Object;

    .line 1284
    .line 1285
    :try_start_8
    sget-object v2, Lb3;->d:Ljava/lang/reflect/Method;

    .line 1286
    .line 1287
    if-eqz v2, :cond_1b

    .line 1288
    .line 1289
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1290
    .line 1291
    const-string v4, "AppCompat recreation"

    .line 1292
    .line 1293
    filled-new-array {v0, v3, v4}, [Ljava/lang/Object;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v0

    .line 1297
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1298
    .line 1299
    .line 1300
    goto :goto_e

    .line 1301
    :cond_1b
    sget-object v2, Lb3;->e:Ljava/lang/reflect/Method;

    .line 1302
    .line 1303
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1304
    .line 1305
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v0

    .line 1309
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 1310
    .line 1311
    .line 1312
    goto :goto_e

    .line 1313
    :catchall_1
    move-exception v0

    .line 1314
    const-string v1, "ActivityRecreator"

    .line 1315
    .line 1316
    const-string v2, "Exception while invoking performStopActivity"

    .line 1317
    .line 1318
    invoke-static {v1, v2, v0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1319
    .line 1320
    .line 1321
    goto :goto_e

    .line 1322
    :catch_7
    move-exception v0

    .line 1323
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v1

    .line 1327
    const-class v2, Ljava/lang/RuntimeException;

    .line 1328
    .line 1329
    if-ne v1, v2, :cond_1d

    .line 1330
    .line 1331
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v1

    .line 1335
    if-eqz v1, :cond_1d

    .line 1336
    .line 1337
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v1

    .line 1341
    const-string v2, "Unable to stop"

    .line 1342
    .line 1343
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1344
    .line 1345
    .line 1346
    move-result v1

    .line 1347
    if-nez v1, :cond_1c

    .line 1348
    .line 1349
    goto :goto_e

    .line 1350
    :cond_1c
    throw v0

    .line 1351
    :cond_1d
    :goto_e
    return-void

    .line 1352
    :pswitch_1a
    iget-object v0, v1, Lcp0;->b:Ljava/lang/Object;

    .line 1353
    .line 1354
    check-cast v0, La3;

    .line 1355
    .line 1356
    iget-object v1, v1, Lcp0;->c:Ljava/lang/Object;

    .line 1357
    .line 1358
    iput-object v1, v0, La3;->a:Ljava/lang/Object;

    .line 1359
    .line 1360
    return-void

    .line 1361
    :pswitch_1b
    iget-object v0, v1, Lcp0;->c:Ljava/lang/Object;

    .line 1362
    .line 1363
    check-cast v0, Lya3;

    .line 1364
    .line 1365
    iget-boolean v0, v0, Lya3;->a:Z

    .line 1366
    .line 1367
    if-nez v0, :cond_1e

    .line 1368
    .line 1369
    goto/16 :goto_10

    .line 1370
    .line 1371
    :cond_1e
    iget-object v0, v1, Lcp0;->b:Ljava/lang/Object;

    .line 1372
    .line 1373
    check-cast v0, Ldc3;

    .line 1374
    .line 1375
    iget-object v0, v0, Ldc3;->b:Lcom/google/android/gms/common/ConnectionResult;

    .line 1376
    .line 1377
    iget v2, v0, Lcom/google/android/gms/common/ConnectionResult;->b:I

    .line 1378
    .line 1379
    if-eqz v2, :cond_1f

    .line 1380
    .line 1381
    iget-object v2, v0, Lcom/google/android/gms/common/ConnectionResult;->c:Landroid/app/PendingIntent;

    .line 1382
    .line 1383
    if-eqz v2, :cond_1f

    .line 1384
    .line 1385
    move v2, v7

    .line 1386
    goto :goto_f

    .line 1387
    :cond_1f
    move v2, v6

    .line 1388
    :goto_f
    iget-object v3, v1, Lcp0;->c:Ljava/lang/Object;

    .line 1389
    .line 1390
    check-cast v3, Lya3;

    .line 1391
    .line 1392
    if-eqz v2, :cond_20

    .line 1393
    .line 1394
    iget-object v2, v3, Lx61;->mLifecycleFragment:Le71;

    .line 1395
    .line 1396
    invoke-virtual {v3}, Lx61;->getActivity()Landroid/app/Activity;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v3

    .line 1400
    iget-object v0, v0, Lcom/google/android/gms/common/ConnectionResult;->c:Landroid/app/PendingIntent;

    .line 1401
    .line 1402
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 1403
    .line 1404
    .line 1405
    iget-object v1, v1, Lcp0;->b:Ljava/lang/Object;

    .line 1406
    .line 1407
    check-cast v1, Ldc3;

    .line 1408
    .line 1409
    iget v1, v1, Ldc3;->a:I

    .line 1410
    .line 1411
    sget v4, Lcom/google/android/gms/common/api/GoogleApiActivity;->b:I

    .line 1412
    .line 1413
    new-instance v4, Landroid/content/Intent;

    .line 1414
    .line 1415
    const-class v5, Lcom/google/android/gms/common/api/GoogleApiActivity;

    .line 1416
    .line 1417
    invoke-direct {v4, v3, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1418
    .line 1419
    .line 1420
    const-string v3, "pending_intent"

    .line 1421
    .line 1422
    invoke-virtual {v4, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1423
    .line 1424
    .line 1425
    const-string v0, "failing_client_id"

    .line 1426
    .line 1427
    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1428
    .line 1429
    .line 1430
    const-string v0, "notify_manager"

    .line 1431
    .line 1432
    invoke-virtual {v4, v0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1433
    .line 1434
    .line 1435
    invoke-interface {v2, v4, v7}, Le71;->startActivityForResult(Landroid/content/Intent;I)V

    .line 1436
    .line 1437
    .line 1438
    goto/16 :goto_10

    .line 1439
    .line 1440
    :cond_20
    invoke-virtual {v3}, Lx61;->getActivity()Landroid/app/Activity;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v2

    .line 1444
    iget v4, v0, Lcom/google/android/gms/common/ConnectionResult;->b:I

    .line 1445
    .line 1446
    iget-object v3, v3, Lya3;->d:Lpr0;

    .line 1447
    .line 1448
    invoke-virtual {v3, v2, v5, v4}, Lqr0;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/Intent;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v2

    .line 1452
    if-eqz v2, :cond_21

    .line 1453
    .line 1454
    iget-object v2, v1, Lcp0;->c:Ljava/lang/Object;

    .line 1455
    .line 1456
    check-cast v2, Lya3;

    .line 1457
    .line 1458
    invoke-virtual {v2}, Lx61;->getActivity()Landroid/app/Activity;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v3

    .line 1462
    iget-object v4, v2, Lx61;->mLifecycleFragment:Le71;

    .line 1463
    .line 1464
    iget v0, v0, Lcom/google/android/gms/common/ConnectionResult;->b:I

    .line 1465
    .line 1466
    iget-object v1, v1, Lcp0;->c:Ljava/lang/Object;

    .line 1467
    .line 1468
    check-cast v1, Lya3;

    .line 1469
    .line 1470
    iget-object v2, v2, Lya3;->d:Lpr0;

    .line 1471
    .line 1472
    invoke-virtual {v2, v3, v4, v0, v1}, Lpr0;->h(Landroid/app/Activity;Le71;ILandroid/content/DialogInterface$OnCancelListener;)V

    .line 1473
    .line 1474
    .line 1475
    goto/16 :goto_10

    .line 1476
    .line 1477
    :cond_21
    iget v2, v0, Lcom/google/android/gms/common/ConnectionResult;->b:I

    .line 1478
    .line 1479
    iget-object v3, v1, Lcp0;->c:Ljava/lang/Object;

    .line 1480
    .line 1481
    check-cast v3, Lya3;

    .line 1482
    .line 1483
    const/16 v4, 0x12

    .line 1484
    .line 1485
    if-ne v2, v4, :cond_22

    .line 1486
    .line 1487
    iget-object v0, v3, Lya3;->d:Lpr0;

    .line 1488
    .line 1489
    invoke-virtual {v3}, Lx61;->getActivity()Landroid/app/Activity;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v2

    .line 1493
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1494
    .line 1495
    .line 1496
    new-instance v0, Landroid/widget/ProgressBar;

    .line 1497
    .line 1498
    const v8, 0x101007a

    .line 1499
    .line 1500
    .line 1501
    invoke-direct {v0, v2, v5, v8}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 1502
    .line 1503
    .line 1504
    invoke-virtual {v0, v7}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 1505
    .line 1506
    .line 1507
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1508
    .line 1509
    .line 1510
    new-instance v6, Landroid/app/AlertDialog$Builder;

    .line 1511
    .line 1512
    invoke-direct {v6, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1513
    .line 1514
    .line 1515
    invoke-virtual {v6, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1516
    .line 1517
    .line 1518
    invoke-static {v2, v4}, Lhb3;->b(Landroid/content/Context;I)Ljava/lang/String;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v0

    .line 1522
    invoke-virtual {v6, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1523
    .line 1524
    .line 1525
    const-string v0, ""

    .line 1526
    .line 1527
    invoke-virtual {v6, v0, v5}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1528
    .line 1529
    .line 1530
    invoke-virtual {v6}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v0

    .line 1534
    const-string v4, "GooglePlayServicesUpdatingDialog"

    .line 1535
    .line 1536
    invoke-static {v2, v0, v4, v3}, Lpr0;->f(Landroid/app/Activity;Landroid/app/AlertDialog;Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 1537
    .line 1538
    .line 1539
    iget-object v2, v1, Lcp0;->c:Ljava/lang/Object;

    .line 1540
    .line 1541
    check-cast v2, Lya3;

    .line 1542
    .line 1543
    invoke-virtual {v2}, Lx61;->getActivity()Landroid/app/Activity;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v3

    .line 1547
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v3

    .line 1551
    new-instance v4, Lec3;

    .line 1552
    .line 1553
    invoke-direct {v4, v1, v0}, Lec3;-><init>(Lcp0;Landroid/app/AlertDialog;)V

    .line 1554
    .line 1555
    .line 1556
    iget-object v0, v2, Lya3;->d:Lpr0;

    .line 1557
    .line 1558
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1559
    .line 1560
    .line 1561
    new-instance v0, Landroid/content/IntentFilter;

    .line 1562
    .line 1563
    const-string v1, "android.intent.action.PACKAGE_ADDED"

    .line 1564
    .line 1565
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 1566
    .line 1567
    .line 1568
    const-string v1, "package"

    .line 1569
    .line 1570
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 1571
    .line 1572
    .line 1573
    new-instance v1, Lcom/google/android/gms/common/api/internal/zabx;

    .line 1574
    .line 1575
    invoke-direct {v1, v4}, Lcom/google/android/gms/common/api/internal/zabx;-><init>(Lfb3;)V

    .line 1576
    .line 1577
    .line 1578
    invoke-static {v3, v1, v0}, Lcom/google/android/gms/internal/base/zao;->zaa(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1579
    .line 1580
    .line 1581
    invoke-virtual {v1, v3}, Lcom/google/android/gms/common/api/internal/zabx;->a(Landroid/content/Context;)V

    .line 1582
    .line 1583
    .line 1584
    invoke-static {v3}, Lwr0;->b(Landroid/content/Context;)Z

    .line 1585
    .line 1586
    .line 1587
    move-result v0

    .line 1588
    if-nez v0, :cond_23

    .line 1589
    .line 1590
    invoke-virtual {v4}, Lec3;->a()V

    .line 1591
    .line 1592
    .line 1593
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/zabx;->b()V

    .line 1594
    .line 1595
    .line 1596
    goto :goto_10

    .line 1597
    :cond_22
    iget-object v1, v1, Lcp0;->b:Ljava/lang/Object;

    .line 1598
    .line 1599
    check-cast v1, Ldc3;

    .line 1600
    .line 1601
    iget v1, v1, Ldc3;->a:I

    .line 1602
    .line 1603
    iget-object v2, v3, Lya3;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 1604
    .line 1605
    invoke-virtual {v2, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 1606
    .line 1607
    .line 1608
    iget-object v2, v3, Lya3;->f:Lur0;

    .line 1609
    .line 1610
    invoke-virtual {v2, v0, v1}, Lur0;->i(Lcom/google/android/gms/common/ConnectionResult;I)V

    .line 1611
    .line 1612
    .line 1613
    :cond_23
    :goto_10
    return-void

    .line 1614
    :pswitch_1c
    iget-object v0, v1, Lcp0;->c:Ljava/lang/Object;

    .line 1615
    .line 1616
    move-object v2, v0

    .line 1617
    check-cast v2, Lwe2;

    .line 1618
    .line 1619
    iget-object v0, v1, Lcp0;->b:Ljava/lang/Object;

    .line 1620
    .line 1621
    check-cast v0, Ls81;

    .line 1622
    .line 1623
    :try_start_9
    invoke-static {v0}, Lk50;->s(Ls81;)V
    :try_end_9
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_9 .. :try_end_9} :catch_a
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_9
    .catch Ljava/lang/Error; {:try_start_9 .. :try_end_9} :catch_8

    .line 1624
    .line 1625
    .line 1626
    iget-object v0, v2, Lwe2;->b:Ljava/lang/Object;

    .line 1627
    .line 1628
    check-cast v0, Lsl3;

    .line 1629
    .line 1630
    invoke-virtual {v0}, Leg3;->y()V

    .line 1631
    .line 1632
    .line 1633
    invoke-virtual {v2}, Lwe2;->s()V

    .line 1634
    .line 1635
    .line 1636
    iput-boolean v6, v0, Lsl3;->w:Z

    .line 1637
    .line 1638
    iput v7, v0, Lsl3;->U:I

    .line 1639
    .line 1640
    iget-object v1, v0, Lsq3;->a:Ljava/lang/Object;

    .line 1641
    .line 1642
    check-cast v1, Lij3;

    .line 1643
    .line 1644
    iget-object v1, v1, Lij3;->f:Luh3;

    .line 1645
    .line 1646
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 1647
    .line 1648
    .line 1649
    iget-object v1, v1, Luh3;->X:Lsh3;

    .line 1650
    .line 1651
    iget-object v2, v2, Lwe2;->c:Ljava/lang/Object;

    .line 1652
    .line 1653
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzog;

    .line 1654
    .line 1655
    const-string v3, "Successfully registered trigger URI"

    .line 1656
    .line 1657
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzog;->a:Ljava/lang/String;

    .line 1658
    .line 1659
    invoke-virtual {v1, v2, v3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1660
    .line 1661
    .line 1662
    invoke-virtual {v0}, Lsl3;->X()V

    .line 1663
    .line 1664
    .line 1665
    goto :goto_12

    .line 1666
    :catch_8
    move-exception v0

    .line 1667
    goto :goto_11

    .line 1668
    :catch_9
    move-exception v0

    .line 1669
    :goto_11
    invoke-virtual {v2, v0}, Lwe2;->onFailure(Ljava/lang/Throwable;)V

    .line 1670
    .line 1671
    .line 1672
    goto :goto_12

    .line 1673
    :catch_a
    move-exception v0

    .line 1674
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v0

    .line 1678
    invoke-virtual {v2, v0}, Lwe2;->onFailure(Ljava/lang/Throwable;)V

    .line 1679
    .line 1680
    .line 1681
    :goto_12
    return-void

    .line 1682
    nop

    .line 1683
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
    .locals 4

    .line 1
    iget v0, p0, Lcp0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Lac1;

    .line 12
    .line 13
    const-class v1, Lcp0;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Lac1;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lcp0;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Lwe2;

    .line 25
    .line 26
    new-instance v1, Lwc0;

    .line 27
    .line 28
    const/16 v2, 0x14

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-direct {v1, v2, v3}, Lwc0;-><init>(IZ)V

    .line 32
    .line 33
    .line 34
    iget-object v2, v0, Lac1;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lwc0;

    .line 37
    .line 38
    iput-object v1, v2, Lwc0;->c:Ljava/lang/Object;

    .line 39
    .line 40
    iput-object v1, v0, Lac1;->d:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object p0, v1, Lwc0;->b:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v0}, Lac1;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

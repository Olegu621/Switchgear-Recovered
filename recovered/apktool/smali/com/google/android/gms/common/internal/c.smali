.class public final Lcom/google/android/gms/common/internal/c;
.super Lcom/google/android/gms/internal/common/zzg;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:Lcom/google/android/gms/common/internal/a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/internal/a;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/common/internal/c;->a:Lcom/google/android/gms/common/internal/a;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/common/zzg;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 9

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/common/internal/c;->a:Lcom/google/android/gms/common/internal/a;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/common/internal/a;->zzd:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p1, Landroid/os/Message;->arg1:I

    .line 10
    .line 11
    iget v2, p1, Landroid/os/Message;->what:I

    .line 12
    .line 13
    const/4 v3, 0x7

    .line 14
    const/4 v4, 0x2

    .line 15
    const/4 v5, 0x1

    .line 16
    const/4 v6, 0x0

    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    if-eq v2, v4, :cond_1

    .line 20
    .line 21
    if-eq v2, v5, :cond_1

    .line 22
    .line 23
    if-ne v2, v3, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void

    .line 27
    :cond_1
    :goto_0
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Lad3;

    .line 30
    .line 31
    if-eqz p0, :cond_19

    .line 32
    .line 33
    monitor-enter p0

    .line 34
    :try_start_0
    iput-object v6, p0, Lad3;->a:Ljava/lang/Boolean;

    .line 35
    .line 36
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    iget-object p1, p0, Lad3;->c:Lcom/google/android/gms/common/internal/a;

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->zzj()Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    monitor-enter v0

    .line 44
    :try_start_1
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->zzj()Ljava/util/ArrayList;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    monitor-exit v0

    .line 52
    return-void

    .line 53
    :catchall_0
    move-exception p0

    .line 54
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    throw p0

    .line 56
    :catchall_1
    move-exception p1

    .line 57
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 58
    throw p1

    .line 59
    :cond_2
    const/4 v0, 0x4

    .line 60
    const/4 v1, 0x5

    .line 61
    if-eq v2, v5, :cond_4

    .line 62
    .line 63
    if-eq v2, v3, :cond_4

    .line 64
    .line 65
    if-ne v2, v0, :cond_3

    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->enableLocalFallback()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    :cond_3
    iget v2, p1, Landroid/os/Message;->what:I

    .line 74
    .line 75
    if-ne v2, v1, :cond_5

    .line 76
    .line 77
    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->isConnecting()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_18

    .line 82
    .line 83
    :cond_5
    iget v2, p1, Landroid/os/Message;->what:I

    .line 84
    .line 85
    const/16 v7, 0x8

    .line 86
    .line 87
    const/4 v8, 0x3

    .line 88
    if-ne v2, v0, :cond_9

    .line 89
    .line 90
    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    .line 91
    .line 92
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 93
    .line 94
    invoke-direct {v0, p1, v6, v6}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/internal/a;->zzn(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->zzg()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_7

    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->zzo()Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_6

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_6
    invoke-virtual {p0, v8, v6}, Lcom/google/android/gms/common/internal/a;->zzd(ILandroid/os/IInterface;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_7
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->zzm()Lcom/google/android/gms/common/ConnectionResult;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-eqz p1, :cond_8

    .line 122
    .line 123
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->zzm()Lcom/google/android/gms/common/ConnectionResult;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    goto :goto_2

    .line 128
    :cond_8
    new-instance p1, Lcom/google/android/gms/common/ConnectionResult;

    .line 129
    .line 130
    invoke-direct {p1, v7, v6, v6}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 131
    .line 132
    .line 133
    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/common/internal/a;->zzc:Lei;

    .line 134
    .line 135
    invoke-interface {v0, p1}, Lei;->f(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/internal/a;->onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_9
    if-ne v2, v1, :cond_b

    .line 143
    .line 144
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->zzm()Lcom/google/android/gms/common/ConnectionResult;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-eqz p1, :cond_a

    .line 149
    .line 150
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->zzm()Lcom/google/android/gms/common/ConnectionResult;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    goto :goto_3

    .line 155
    :cond_a
    new-instance p1, Lcom/google/android/gms/common/ConnectionResult;

    .line 156
    .line 157
    invoke-direct {p1, v7, v6, v6}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 158
    .line 159
    .line 160
    :goto_3
    iget-object v0, p0, Lcom/google/android/gms/common/internal/a;->zzc:Lei;

    .line 161
    .line 162
    invoke-interface {v0, p1}, Lei;->f(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/internal/a;->onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_b
    if-ne v2, v8, :cond_d

    .line 170
    .line 171
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 172
    .line 173
    instance-of v1, v0, Landroid/app/PendingIntent;

    .line 174
    .line 175
    if-eqz v1, :cond_c

    .line 176
    .line 177
    check-cast v0, Landroid/app/PendingIntent;

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_c
    move-object v0, v6

    .line 181
    :goto_4
    new-instance v1, Lcom/google/android/gms/common/ConnectionResult;

    .line 182
    .line 183
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 184
    .line 185
    invoke-direct {v1, p1, v6, v0}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 186
    .line 187
    .line 188
    iget-object p1, p0, Lcom/google/android/gms/common/internal/a;->zzc:Lei;

    .line 189
    .line 190
    invoke-interface {p1, v1}, Lei;->f(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, v1}, Lcom/google/android/gms/common/internal/a;->onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :cond_d
    const/4 v0, 0x6

    .line 198
    if-ne v2, v0, :cond_f

    .line 199
    .line 200
    invoke-virtual {p0, v1, v6}, Lcom/google/android/gms/common/internal/a;->zzd(ILandroid/os/IInterface;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->zzk()Lci;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    if-eqz v0, :cond_e

    .line 208
    .line 209
    iget v0, p1, Landroid/os/Message;->arg2:I

    .line 210
    .line 211
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->zzk()Lci;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-interface {v2, v0}, Lci;->a(I)V

    .line 216
    .line 217
    .line 218
    :cond_e
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 219
    .line 220
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/internal/a;->onConnectionSuspended(I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0, v1, v5, v6}, Lcom/google/android/gms/common/internal/a;->zze(IILandroid/os/IInterface;)Z

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :cond_f
    if-ne v2, v4, :cond_11

    .line 228
    .line 229
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->isConnected()Z

    .line 230
    .line 231
    .line 232
    move-result p0

    .line 233
    if-eqz p0, :cond_10

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_10
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast p0, Lad3;

    .line 239
    .line 240
    if-eqz p0, :cond_19

    .line 241
    .line 242
    monitor-enter p0

    .line 243
    :try_start_3
    iput-object v6, p0, Lad3;->a:Ljava/lang/Boolean;

    .line 244
    .line 245
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 246
    iget-object p1, p0, Lad3;->c:Lcom/google/android/gms/common/internal/a;

    .line 247
    .line 248
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->zzj()Ljava/util/ArrayList;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    monitor-enter v0

    .line 253
    :try_start_4
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->zzj()Ljava/util/ArrayList;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    monitor-exit v0

    .line 261
    return-void

    .line 262
    :catchall_2
    move-exception p0

    .line 263
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 264
    throw p0

    .line 265
    :catchall_3
    move-exception p1

    .line 266
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 267
    throw p1

    .line 268
    :cond_11
    :goto_5
    iget p0, p1, Landroid/os/Message;->what:I

    .line 269
    .line 270
    if-eq p0, v4, :cond_13

    .line 271
    .line 272
    if-eq p0, v5, :cond_13

    .line 273
    .line 274
    if-ne p0, v3, :cond_12

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_12
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 282
    .line 283
    .line 284
    move-result p1

    .line 285
    new-instance v0, Ljava/lang/StringBuilder;

    .line 286
    .line 287
    add-int/lit8 p1, p1, 0x22

    .line 288
    .line 289
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 290
    .line 291
    .line 292
    const-string p1, "Don\'t know how to handle message: "

    .line 293
    .line 294
    invoke-static {v0, p1, p0}, Lfm0;->n(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    new-instance p1, Ljava/lang/Exception;

    .line 299
    .line 300
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 301
    .line 302
    .line 303
    const-string v0, "GmsClient"

    .line 304
    .line 305
    invoke-static {v0, p0, p1}, Lio/sentry/android/core/n0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :cond_13
    :goto_6
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast p0, Lad3;

    .line 312
    .line 313
    const-string p1, " being reused. This is not safe."

    .line 314
    .line 315
    const-string v0, "Callback proxy "

    .line 316
    .line 317
    monitor-enter p0

    .line 318
    :try_start_6
    iget-object v1, p0, Lad3;->a:Ljava/lang/Boolean;

    .line 319
    .line 320
    iget-boolean v2, p0, Lad3;->b:Z

    .line 321
    .line 322
    if-eqz v2, :cond_14

    .line 323
    .line 324
    const-string v2, "GmsClient"

    .line 325
    .line 326
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 331
    .line 332
    .line 333
    move-result v4

    .line 334
    add-int/lit8 v4, v4, 0x2f

    .line 335
    .line 336
    new-instance v8, Ljava/lang/StringBuilder;

    .line 337
    .line 338
    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    invoke-static {v2, p1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 355
    .line 356
    .line 357
    goto :goto_7

    .line 358
    :catchall_4
    move-exception p1

    .line 359
    goto :goto_a

    .line 360
    :cond_14
    :goto_7
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 361
    if-eqz v1, :cond_17

    .line 362
    .line 363
    iget-object p1, p0, Lad3;->f:Lcom/google/android/gms/common/internal/a;

    .line 364
    .line 365
    iget v0, p0, Lad3;->d:I

    .line 366
    .line 367
    if-nez v0, :cond_15

    .line 368
    .line 369
    invoke-virtual {p0}, Lad3;->a()Z

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    if-nez v0, :cond_17

    .line 374
    .line 375
    invoke-virtual {p1, v5, v6}, Lcom/google/android/gms/common/internal/a;->zzd(ILandroid/os/IInterface;)V

    .line 376
    .line 377
    .line 378
    new-instance p1, Lcom/google/android/gms/common/ConnectionResult;

    .line 379
    .line 380
    invoke-direct {p1, v7, v6, v6}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {p0, p1}, Lad3;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 384
    .line 385
    .line 386
    goto :goto_9

    .line 387
    :cond_15
    invoke-virtual {p1, v5, v6}, Lcom/google/android/gms/common/internal/a;->zzd(ILandroid/os/IInterface;)V

    .line 388
    .line 389
    .line 390
    iget-object p1, p0, Lad3;->e:Landroid/os/Bundle;

    .line 391
    .line 392
    if-eqz p1, :cond_16

    .line 393
    .line 394
    const-string v1, "pendingIntent"

    .line 395
    .line 396
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 397
    .line 398
    .line 399
    move-result-object p1

    .line 400
    check-cast p1, Landroid/app/PendingIntent;

    .line 401
    .line 402
    goto :goto_8

    .line 403
    :cond_16
    move-object p1, v6

    .line 404
    :goto_8
    new-instance v1, Lcom/google/android/gms/common/ConnectionResult;

    .line 405
    .line 406
    invoke-direct {v1, v0, v6, p1}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {p0, v1}, Lad3;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 410
    .line 411
    .line 412
    :cond_17
    :goto_9
    monitor-enter p0

    .line 413
    :try_start_7
    iput-boolean v5, p0, Lad3;->b:Z

    .line 414
    .line 415
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 416
    monitor-enter p0

    .line 417
    :try_start_8
    iput-object v6, p0, Lad3;->a:Ljava/lang/Boolean;

    .line 418
    .line 419
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 420
    iget-object p1, p0, Lad3;->c:Lcom/google/android/gms/common/internal/a;

    .line 421
    .line 422
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->zzj()Ljava/util/ArrayList;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    monitor-enter v0

    .line 427
    :try_start_9
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->zzj()Ljava/util/ArrayList;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    monitor-exit v0

    .line 435
    return-void

    .line 436
    :catchall_5
    move-exception p0

    .line 437
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 438
    throw p0

    .line 439
    :catchall_6
    move-exception p1

    .line 440
    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 441
    throw p1

    .line 442
    :catchall_7
    move-exception p1

    .line 443
    :try_start_b
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 444
    throw p1

    .line 445
    :goto_a
    :try_start_c
    monitor-exit p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 446
    throw p1

    .line 447
    :cond_18
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast p0, Lad3;

    .line 450
    .line 451
    if-eqz p0, :cond_19

    .line 452
    .line 453
    monitor-enter p0

    .line 454
    :try_start_d
    iput-object v6, p0, Lad3;->a:Ljava/lang/Boolean;

    .line 455
    .line 456
    monitor-exit p0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    .line 457
    iget-object p1, p0, Lad3;->c:Lcom/google/android/gms/common/internal/a;

    .line 458
    .line 459
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->zzj()Ljava/util/ArrayList;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    monitor-enter v0

    .line 464
    :try_start_e
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->zzj()Ljava/util/ArrayList;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    monitor-exit v0

    .line 472
    return-void

    .line 473
    :catchall_8
    move-exception p0

    .line 474
    monitor-exit v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 475
    throw p0

    .line 476
    :catchall_9
    move-exception p1

    .line 477
    :try_start_f
    monitor-exit p0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 478
    throw p1

    .line 479
    :cond_19
    return-void
.end method

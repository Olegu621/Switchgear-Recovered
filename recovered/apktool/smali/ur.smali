.class public final Lur;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 20
    iput p5, p0, Lur;->a:I

    iput-object p1, p0, Lur;->e:Ljava/lang/Object;

    iput-object p2, p0, Lur;->b:Ljava/lang/Object;

    iput-object p3, p0, Lur;->c:Ljava/lang/Object;

    iput-object p4, p0, Lur;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 19
    iput p5, p0, Lur;->a:I

    iput-object p1, p0, Lur;->b:Ljava/lang/Object;

    iput-object p2, p0, Lur;->c:Ljava/lang/Object;

    iput-object p3, p0, Lur;->d:Ljava/lang/Object;

    iput-object p4, p0, Lur;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lsl3;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    iput v0, p0, Lur;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lur;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lur;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p4, p0, Lur;->d:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lur;->e:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lur;->a:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lur;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lac3;

    .line 13
    .line 14
    iget-object v1, v1, Lac3;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lmp3;

    .line 17
    .line 18
    invoke-virtual {v1}, Lmp3;->j0()Lup3;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v1}, Lmp3;->f()Lxv;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lxt0;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v6

    .line 35
    iget-object v3, v0, Lur;->b:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v9, v3

    .line 38
    check-cast v9, Ljava/lang/String;

    .line 39
    .line 40
    iget-object v3, v0, Lur;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Ljava/lang/String;

    .line 43
    .line 44
    iget-object v0, v0, Lur;->d:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v4, v0

    .line 47
    check-cast v4, Landroid/os/Bundle;

    .line 48
    .line 49
    const-string v5, "auto"

    .line 50
    .line 51
    const/4 v8, 0x0

    .line 52
    invoke-virtual/range {v2 .. v8}, Lup3;->b0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)Lcom/google/android/gms/measurement/internal/zzbg;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v0, v9}, Lmp3;->h(Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_0
    iget-object v1, v0, Lur;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Lpn3;

    .line 66
    .line 67
    iget-object v2, v0, Lur;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 70
    .line 71
    iget-object v3, v0, Lur;->d:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v3, Lcom/google/android/gms/measurement/internal/zzr;

    .line 74
    .line 75
    iget-object v0, v0, Lur;->e:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzon;

    .line 78
    .line 79
    monitor-enter v2

    .line 80
    :try_start_0
    iget-object v4, v1, Lpn3;->d:Lcom/google/android/gms/measurement/internal/zzga;

    .line 81
    .line 82
    if-nez v4, :cond_0

    .line 83
    .line 84
    iget-object v0, v1, Lsq3;->a:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Lij3;

    .line 87
    .line 88
    iget-object v0, v0, Lij3;->f:Luh3;

    .line 89
    .line 90
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 94
    .line 95
    const-string v3, "[sgtm] Failed to get upload batches; not connected to service"

    .line 96
    .line 97
    invoke-virtual {v0, v3}, Lsh3;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    .line 99
    .line 100
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    goto :goto_2

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    goto :goto_3

    .line 104
    :catch_0
    move-exception v0

    .line 105
    goto :goto_0

    .line 106
    :cond_0
    :try_start_2
    new-instance v5, Lpm3;

    .line 107
    .line 108
    invoke-direct {v5, v1, v2}, Lpm3;-><init>(Lpn3;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v4, v3, v0, v5}, Lcom/google/android/gms/measurement/internal/zzga;->Y(Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/measurement/internal/zzon;Lcom/google/android/gms/measurement/internal/zzgg;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Lpn3;->M()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :goto_0
    :try_start_3
    iget-object v1, v1, Lsq3;->a:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v1, Lij3;

    .line 121
    .line 122
    iget-object v1, v1, Lij3;->f:Luh3;

    .line 123
    .line 124
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 125
    .line 126
    .line 127
    iget-object v1, v1, Luh3;->f:Lsh3;

    .line 128
    .line 129
    const-string v3, "[sgtm] Failed to get upload batches; remote exception"

    .line 130
    .line 131
    invoke-virtual {v1, v0, v3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 135
    .line 136
    .line 137
    :goto_1
    monitor-exit v2

    .line 138
    :goto_2
    return-void

    .line 139
    :goto_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 140
    throw v0

    .line 141
    :pswitch_1
    iget-object v1, v0, Lur;->b:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, Lpn3;

    .line 144
    .line 145
    iget-object v2, v0, Lur;->c:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 148
    .line 149
    iget-object v3, v0, Lur;->d:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v3, Lcom/google/android/gms/measurement/internal/zzr;

    .line 152
    .line 153
    iget-object v0, v0, Lur;->e:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Landroid/os/Bundle;

    .line 156
    .line 157
    monitor-enter v2

    .line 158
    :try_start_4
    iget-object v4, v1, Lpn3;->d:Lcom/google/android/gms/measurement/internal/zzga;

    .line 159
    .line 160
    if-nez v4, :cond_1

    .line 161
    .line 162
    iget-object v0, v1, Lsq3;->a:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, Lij3;

    .line 165
    .line 166
    iget-object v0, v0, Lij3;->f:Luh3;

    .line 167
    .line 168
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 169
    .line 170
    .line 171
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 172
    .line 173
    const-string v3, "Failed to request trigger URIs; not connected to service"

    .line 174
    .line 175
    invoke-virtual {v0, v3}, Lsh3;->a(Ljava/lang/String;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 176
    .line 177
    .line 178
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 179
    goto :goto_6

    .line 180
    :catchall_1
    move-exception v0

    .line 181
    goto :goto_7

    .line 182
    :catch_1
    move-exception v0

    .line 183
    goto :goto_4

    .line 184
    :cond_1
    :try_start_6
    new-instance v5, Lom3;

    .line 185
    .line 186
    invoke-direct {v5, v1, v2}, Lom3;-><init>(Lpn3;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 187
    .line 188
    .line 189
    invoke-interface {v4, v3, v0, v5}, Lcom/google/android/gms/measurement/internal/zzga;->z(Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/zzgd;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1}, Lpn3;->M()V
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 193
    .line 194
    .line 195
    goto :goto_5

    .line 196
    :goto_4
    :try_start_7
    iget-object v1, v1, Lsq3;->a:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v1, Lij3;

    .line 199
    .line 200
    iget-object v1, v1, Lij3;->f:Luh3;

    .line 201
    .line 202
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 203
    .line 204
    .line 205
    iget-object v1, v1, Luh3;->f:Lsh3;

    .line 206
    .line 207
    const-string v3, "Failed to request trigger URIs; remote exception"

    .line 208
    .line 209
    invoke-virtual {v1, v0, v3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 213
    .line 214
    .line 215
    :goto_5
    monitor-exit v2

    .line 216
    :goto_6
    return-void

    .line 217
    :goto_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 218
    throw v0

    .line 219
    :pswitch_2
    iget-object v1, v0, Lur;->d:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 222
    .line 223
    iget-object v2, v0, Lur;->e:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v2, Lpn3;

    .line 226
    .line 227
    :try_start_8
    iget-object v4, v2, Lpn3;->d:Lcom/google/android/gms/measurement/internal/zzga;

    .line 228
    .line 229
    if-nez v4, :cond_2

    .line 230
    .line 231
    iget-object v0, v2, Lsq3;->a:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v0, Lij3;

    .line 234
    .line 235
    iget-object v4, v0, Lij3;->f:Luh3;

    .line 236
    .line 237
    invoke-static {v4}, Lij3;->l(Lhk3;)V

    .line 238
    .line 239
    .line 240
    iget-object v4, v4, Luh3;->f:Lsh3;

    .line 241
    .line 242
    const-string v5, "Discarding data. Failed to send event to service to bundle"

    .line 243
    .line 244
    invoke-virtual {v4, v5}, Lsh3;->a(Ljava/lang/String;)V
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 245
    .line 246
    .line 247
    iget-object v0, v0, Lij3;->w:Lup3;

    .line 248
    .line 249
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, v1, v3}, Lup3;->k0(Lcom/google/android/gms/internal/measurement/zzcu;[B)V

    .line 253
    .line 254
    .line 255
    goto :goto_9

    .line 256
    :cond_2
    :try_start_9
    iget-object v5, v0, Lur;->b:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v5, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 259
    .line 260
    iget-object v0, v0, Lur;->c:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v0, Ljava/lang/String;

    .line 263
    .line 264
    invoke-interface {v4, v5, v0}, Lcom/google/android/gms/measurement/internal/zzga;->N(Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)[B

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-virtual {v2}, Lpn3;->M()V
    :try_end_9
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 269
    .line 270
    .line 271
    goto :goto_8

    .line 272
    :catchall_2
    move-exception v0

    .line 273
    goto :goto_a

    .line 274
    :catch_2
    move-exception v0

    .line 275
    :try_start_a
    iget-object v4, v2, Lsq3;->a:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v4, Lij3;

    .line 278
    .line 279
    iget-object v4, v4, Lij3;->f:Luh3;

    .line 280
    .line 281
    invoke-static {v4}, Lij3;->l(Lhk3;)V

    .line 282
    .line 283
    .line 284
    iget-object v4, v4, Luh3;->f:Lsh3;

    .line 285
    .line 286
    const-string v5, "Failed to send event to the service to bundle"

    .line 287
    .line 288
    invoke-virtual {v4, v0, v5}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 289
    .line 290
    .line 291
    :goto_8
    iget-object v0, v2, Lsq3;->a:Ljava/lang/Object;

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
    invoke-virtual {v0, v1, v3}, Lup3;->k0(Lcom/google/android/gms/internal/measurement/zzcu;[B)V

    .line 301
    .line 302
    .line 303
    :goto_9
    return-void

    .line 304
    :goto_a
    iget-object v2, v2, Lsq3;->a:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v2, Lij3;

    .line 307
    .line 308
    iget-object v2, v2, Lij3;->w:Lup3;

    .line 309
    .line 310
    invoke-static {v2}, Lij3;->j(Lsq3;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2, v1, v3}, Lup3;->k0(Lcom/google/android/gms/internal/measurement/zzcu;[B)V

    .line 314
    .line 315
    .line 316
    throw v0

    .line 317
    :pswitch_3
    iget-object v1, v0, Lur;->e:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 320
    .line 321
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 322
    .line 323
    invoke-virtual {v1}, Lij3;->o()Lpn3;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    iget-object v1, v0, Lur;->b:Ljava/lang/Object;

    .line 328
    .line 329
    move-object v8, v1

    .line 330
    check-cast v8, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 331
    .line 332
    iget-object v1, v0, Lur;->c:Ljava/lang/Object;

    .line 333
    .line 334
    move-object v5, v1

    .line 335
    check-cast v5, Ljava/lang/String;

    .line 336
    .line 337
    iget-object v0, v0, Lur;->d:Ljava/lang/Object;

    .line 338
    .line 339
    move-object v6, v0

    .line 340
    check-cast v6, Ljava/lang/String;

    .line 341
    .line 342
    invoke-virtual {v4}, Leg3;->y()V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v4}, Lwg3;->A()V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v4, v2}, Lpn3;->P(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 349
    .line 350
    .line 351
    move-result-object v7

    .line 352
    new-instance v3, Lck3;

    .line 353
    .line 354
    invoke-direct/range {v3 .. v8}, Lck3;-><init>(Lpn3;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v4, v3}, Lpn3;->N(Ljava/lang/Runnable;)V

    .line 358
    .line 359
    .line 360
    return-void

    .line 361
    :pswitch_4
    iget-object v1, v0, Lur;->c:Ljava/lang/Object;

    .line 362
    .line 363
    move-object v6, v1

    .line 364
    check-cast v6, Ljava/lang/String;

    .line 365
    .line 366
    iget-object v1, v0, Lur;->d:Ljava/lang/Object;

    .line 367
    .line 368
    move-object v7, v1

    .line 369
    check-cast v7, Ljava/lang/String;

    .line 370
    .line 371
    iget-object v1, v0, Lur;->e:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v1, Lsl3;

    .line 374
    .line 375
    iget-object v1, v1, Lsq3;->a:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v1, Lij3;

    .line 378
    .line 379
    invoke-virtual {v1}, Lij3;->o()Lpn3;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    iget-object v0, v0, Lur;->b:Ljava/lang/Object;

    .line 384
    .line 385
    move-object v5, v0

    .line 386
    check-cast v5, Ljava/util/concurrent/atomic/AtomicReference;

    .line 387
    .line 388
    invoke-virtual {v4}, Leg3;->y()V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v4}, Lwg3;->A()V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v4, v2}, Lpn3;->P(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 395
    .line 396
    .line 397
    move-result-object v8

    .line 398
    new-instance v3, Lck3;

    .line 399
    .line 400
    invoke-direct/range {v3 .. v8}, Lck3;-><init>(Lpn3;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v4, v3}, Lpn3;->N(Ljava/lang/Runnable;)V

    .line 404
    .line 405
    .line 406
    return-void

    .line 407
    :pswitch_5
    iget-object v1, v0, Lur;->b:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzjc;

    .line 410
    .line 411
    iget-object v2, v0, Lur;->c:Ljava/lang/Object;

    .line 412
    .line 413
    move-object v13, v2

    .line 414
    check-cast v13, Landroid/os/Bundle;

    .line 415
    .line 416
    iget-object v2, v0, Lur;->d:Ljava/lang/Object;

    .line 417
    .line 418
    move-object v7, v2

    .line 419
    check-cast v7, Ljava/lang/String;

    .line 420
    .line 421
    iget-object v0, v0, Lur;->e:Ljava/lang/Object;

    .line 422
    .line 423
    move-object v2, v0

    .line 424
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzr;

    .line 425
    .line 426
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 427
    .line 428
    invoke-virtual {v1}, Lmp3;->d0()Lpd3;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    sget-object v4, Lvg3;->V0:Lug3;

    .line 433
    .line 434
    invoke-virtual {v0, v3, v4}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    invoke-virtual {v13}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 439
    .line 440
    .line 441
    move-result v4

    .line 442
    if-eqz v4, :cond_3

    .line 443
    .line 444
    if-eqz v0, :cond_3

    .line 445
    .line 446
    iget-object v1, v1, Lmp3;->c:Lae3;

    .line 447
    .line 448
    invoke-static {v1}, Lmp3;->S(Lwo3;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v1}, Lsq3;->y()V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v1}, Lwo3;->A()V

    .line 455
    .line 456
    .line 457
    :try_start_b
    invoke-virtual {v1}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    const-string v2, "delete from default_event_params where app_id=?"

    .line 462
    .line 463
    filled-new-array {v7}, [Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    invoke-virtual {v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_b .. :try_end_b} :catch_3

    .line 468
    .line 469
    .line 470
    goto/16 :goto_c

    .line 471
    .line 472
    :catch_3
    move-exception v0

    .line 473
    iget-object v1, v1, Lsq3;->a:Ljava/lang/Object;

    .line 474
    .line 475
    check-cast v1, Lij3;

    .line 476
    .line 477
    iget-object v1, v1, Lij3;->f:Luh3;

    .line 478
    .line 479
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 480
    .line 481
    .line 482
    iget-object v1, v1, Luh3;->f:Lsh3;

    .line 483
    .line 484
    const-string v2, "Error clearing default event params"

    .line 485
    .line 486
    invoke-virtual {v1, v0, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    goto/16 :goto_c

    .line 490
    .line 491
    :cond_3
    iget-object v0, v1, Lmp3;->c:Lae3;

    .line 492
    .line 493
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 494
    .line 495
    .line 496
    iget-object v4, v0, Lsq3;->a:Ljava/lang/Object;

    .line 497
    .line 498
    move-object v14, v4

    .line 499
    check-cast v14, Lij3;

    .line 500
    .line 501
    invoke-virtual {v0}, Lsq3;->y()V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v0}, Lwo3;->A()V

    .line 505
    .line 506
    .line 507
    iget-object v4, v0, Lsq3;->a:Ljava/lang/Object;

    .line 508
    .line 509
    move-object v5, v4

    .line 510
    check-cast v5, Lij3;

    .line 511
    .line 512
    const-string v8, "dep"

    .line 513
    .line 514
    new-instance v4, Loe3;

    .line 515
    .line 516
    const-string v6, ""

    .line 517
    .line 518
    const-wide/16 v9, 0x0

    .line 519
    .line 520
    const-wide/16 v11, 0x0

    .line 521
    .line 522
    invoke-direct/range {v4 .. v13}, Loe3;-><init>(Lij3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    .line 523
    .line 524
    .line 525
    iget-object v5, v0, Lqo3;->b:Lmp3;

    .line 526
    .line 527
    iget-object v5, v5, Lmp3;->i:Lci3;

    .line 528
    .line 529
    invoke-static {v5}, Lmp3;->S(Lwo3;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v5, v4}, Lci3;->b0(Loe3;)Lcom/google/android/gms/internal/measurement/zzhs;

    .line 533
    .line 534
    .line 535
    move-result-object v4

    .line 536
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzkr;->zzcc()[B

    .line 537
    .line 538
    .line 539
    move-result-object v4

    .line 540
    iget-object v5, v14, Lij3;->f:Luh3;

    .line 541
    .line 542
    invoke-static {v5}, Lij3;->l(Lhk3;)V

    .line 543
    .line 544
    .line 545
    iget-object v6, v5, Luh3;->Y:Lsh3;

    .line 546
    .line 547
    array-length v8, v4

    .line 548
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 549
    .line 550
    .line 551
    move-result-object v8

    .line 552
    const-string v9, "Saving default event parameters, appId, data size"

    .line 553
    .line 554
    invoke-virtual {v6, v7, v9, v8}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    new-instance v6, Landroid/content/ContentValues;

    .line 558
    .line 559
    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 560
    .line 561
    .line 562
    const-string v8, "app_id"

    .line 563
    .line 564
    invoke-virtual {v6, v8, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    const-string v8, "parameters"

    .line 568
    .line 569
    invoke-virtual {v6, v8, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 570
    .line 571
    .line 572
    :try_start_c
    invoke-virtual {v0}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    const-string v4, "default_event_params"

    .line 577
    .line 578
    const/4 v8, 0x5

    .line 579
    invoke-virtual {v0, v4, v3, v6, v8}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    .line 580
    .line 581
    .line 582
    move-result-wide v8

    .line 583
    const-wide/16 v10, -0x1

    .line 584
    .line 585
    cmp-long v0, v8, v10

    .line 586
    .line 587
    if-nez v0, :cond_4

    .line 588
    .line 589
    invoke-static {v5}, Lij3;->l(Lhk3;)V

    .line 590
    .line 591
    .line 592
    iget-object v0, v5, Luh3;->f:Lsh3;

    .line 593
    .line 594
    const-string v4, "Failed to insert default event parameters (got -1). appId"

    .line 595
    .line 596
    invoke-static {v7}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 597
    .line 598
    .line 599
    move-result-object v6

    .line 600
    invoke-virtual {v0, v6, v4}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_4

    .line 601
    .line 602
    .line 603
    goto :goto_b

    .line 604
    :catch_4
    move-exception v0

    .line 605
    invoke-static {v5}, Lij3;->l(Lhk3;)V

    .line 606
    .line 607
    .line 608
    iget-object v4, v5, Luh3;->f:Lsh3;

    .line 609
    .line 610
    invoke-static {v7}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 611
    .line 612
    .line 613
    move-result-object v5

    .line 614
    const-string v6, "Error storing default event parameters. appId"

    .line 615
    .line 616
    invoke-virtual {v4, v5, v6, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 617
    .line 618
    .line 619
    :cond_4
    :goto_b
    iget-object v4, v1, Lmp3;->c:Lae3;

    .line 620
    .line 621
    invoke-static {v4}, Lmp3;->S(Lwo3;)V

    .line 622
    .line 623
    .line 624
    iget-wide v5, v2, Lcom/google/android/gms/measurement/internal/zzr;->o0:J

    .line 625
    .line 626
    :try_start_d
    const-string v0, "select count(*) from raw_events where app_id=? and timestamp >= ? and name not like \'!_%\' escape \'!\' limit 1;"

    .line 627
    .line 628
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    filled-new-array {v7, v2}, [Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v2

    .line 636
    const-wide/16 v8, 0x0

    .line 637
    .line 638
    invoke-virtual {v4, v0, v2, v8, v9}, Lae3;->W(Ljava/lang/String;[Ljava/lang/String;J)J

    .line 639
    .line 640
    .line 641
    move-result-wide v10

    .line 642
    cmp-long v0, v10, v8

    .line 643
    .line 644
    if-lez v0, :cond_5

    .line 645
    .line 646
    goto :goto_c

    .line 647
    :cond_5
    const-string v0, "select count(*) from raw_events where app_id=? and timestamp >= ? and name like \'!_%\' escape \'!\' limit 1;"

    .line 648
    .line 649
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    filled-new-array {v7, v2}, [Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    invoke-virtual {v4, v0, v2, v8, v9}, Lae3;->W(Ljava/lang/String;[Ljava/lang/String;J)J

    .line 658
    .line 659
    .line 660
    move-result-wide v10
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_5

    .line 661
    cmp-long v0, v10, v8

    .line 662
    .line 663
    if-lez v0, :cond_6

    .line 664
    .line 665
    iget-object v0, v1, Lmp3;->c:Lae3;

    .line 666
    .line 667
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 668
    .line 669
    .line 670
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    invoke-virtual {v0, v7, v1, v3, v13}, Lae3;->T(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 675
    .line 676
    .line 677
    goto :goto_c

    .line 678
    :catch_5
    move-exception v0

    .line 679
    iget-object v1, v4, Lsq3;->a:Ljava/lang/Object;

    .line 680
    .line 681
    check-cast v1, Lij3;

    .line 682
    .line 683
    iget-object v1, v1, Lij3;->f:Luh3;

    .line 684
    .line 685
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 686
    .line 687
    .line 688
    iget-object v1, v1, Luh3;->f:Lsh3;

    .line 689
    .line 690
    const-string v2, "Error checking backfill conditions"

    .line 691
    .line 692
    invoke-virtual {v1, v0, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 693
    .line 694
    .line 695
    :cond_6
    :goto_c
    return-void

    .line 696
    :pswitch_6
    iget-object v1, v0, Lur;->e:Ljava/lang/Object;

    .line 697
    .line 698
    check-cast v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 699
    .line 700
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 701
    .line 702
    invoke-virtual {v1}, Lij3;->o()Lpn3;

    .line 703
    .line 704
    .line 705
    move-result-object v4

    .line 706
    iget-object v1, v0, Lur;->b:Ljava/lang/Object;

    .line 707
    .line 708
    move-object v7, v1

    .line 709
    check-cast v7, Lcom/google/android/gms/internal/measurement/zzcu;

    .line 710
    .line 711
    iget-object v1, v0, Lur;->c:Ljava/lang/Object;

    .line 712
    .line 713
    move-object v5, v1

    .line 714
    check-cast v5, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 715
    .line 716
    iget-object v0, v0, Lur;->d:Ljava/lang/Object;

    .line 717
    .line 718
    move-object v6, v0

    .line 719
    check-cast v6, Ljava/lang/String;

    .line 720
    .line 721
    invoke-virtual {v4}, Leg3;->y()V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v4}, Lwg3;->A()V

    .line 725
    .line 726
    .line 727
    iget-object v0, v4, Lsq3;->a:Ljava/lang/Object;

    .line 728
    .line 729
    check-cast v0, Lij3;

    .line 730
    .line 731
    iget-object v1, v0, Lij3;->w:Lup3;

    .line 732
    .line 733
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 734
    .line 735
    .line 736
    iget-object v1, v1, Lsq3;->a:Ljava/lang/Object;

    .line 737
    .line 738
    check-cast v1, Lij3;

    .line 739
    .line 740
    sget-object v3, Lqr0;->b:Lqr0;

    .line 741
    .line 742
    iget-object v1, v1, Lij3;->a:Landroid/content/Context;

    .line 743
    .line 744
    const v8, 0xbdfcb8

    .line 745
    .line 746
    .line 747
    invoke-virtual {v3, v1, v8}, Lqr0;->c(Landroid/content/Context;I)I

    .line 748
    .line 749
    .line 750
    move-result v1

    .line 751
    if-eqz v1, :cond_7

    .line 752
    .line 753
    iget-object v1, v0, Lij3;->f:Luh3;

    .line 754
    .line 755
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 756
    .line 757
    .line 758
    iget-object v1, v1, Luh3;->w:Lsh3;

    .line 759
    .line 760
    const-string v3, "Not bundling data. Service unavailable or out of date"

    .line 761
    .line 762
    invoke-virtual {v1, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 763
    .line 764
    .line 765
    iget-object v0, v0, Lij3;->w:Lup3;

    .line 766
    .line 767
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 768
    .line 769
    .line 770
    new-array v1, v2, [B

    .line 771
    .line 772
    invoke-virtual {v0, v7, v1}, Lup3;->k0(Lcom/google/android/gms/internal/measurement/zzcu;[B)V

    .line 773
    .line 774
    .line 775
    goto :goto_d

    .line 776
    :cond_7
    new-instance v3, Lur;

    .line 777
    .line 778
    const/4 v8, 0x7

    .line 779
    invoke-direct/range {v3 .. v8}, Lur;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v4, v3}, Lpn3;->N(Ljava/lang/Runnable;)V

    .line 783
    .line 784
    .line 785
    :goto_d
    return-void

    .line 786
    :pswitch_7
    iget-object v1, v0, Lur;->b:Ljava/lang/Object;

    .line 787
    .line 788
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzjc;

    .line 789
    .line 790
    iget-object v4, v0, Lur;->c:Ljava/lang/Object;

    .line 791
    .line 792
    check-cast v4, Ljava/lang/String;

    .line 793
    .line 794
    iget-object v5, v0, Lur;->d:Ljava/lang/Object;

    .line 795
    .line 796
    check-cast v5, Lcom/google/android/gms/measurement/internal/zzon;

    .line 797
    .line 798
    iget-object v0, v0, Lur;->e:Ljava/lang/Object;

    .line 799
    .line 800
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzgg;

    .line 801
    .line 802
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 803
    .line 804
    invoke-virtual {v1}, Lmp3;->A()V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v1}, Lmp3;->b()Lbj3;

    .line 808
    .line 809
    .line 810
    move-result-object v6

    .line 811
    invoke-virtual {v6}, Lbj3;->y()V

    .line 812
    .line 813
    .line 814
    invoke-virtual {v1}, Lmp3;->k0()V

    .line 815
    .line 816
    .line 817
    iget-object v6, v1, Lmp3;->c:Lae3;

    .line 818
    .line 819
    invoke-static {v6}, Lmp3;->S(Lwo3;)V

    .line 820
    .line 821
    .line 822
    sget-object v7, Lvg3;->B:Lug3;

    .line 823
    .line 824
    invoke-virtual {v7, v3}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v7

    .line 828
    check-cast v7, Ljava/lang/Integer;

    .line 829
    .line 830
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 831
    .line 832
    .line 833
    move-result v7

    .line 834
    invoke-virtual {v6, v4, v5, v7}, Lae3;->E(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzon;I)Ljava/util/List;

    .line 835
    .line 836
    .line 837
    move-result-object v5

    .line 838
    new-instance v6, Ljava/util/ArrayList;

    .line 839
    .line 840
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 841
    .line 842
    .line 843
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 844
    .line 845
    .line 846
    move-result-object v5

    .line 847
    :goto_e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 848
    .line 849
    .line 850
    move-result v7

    .line 851
    if-eqz v7, :cond_f

    .line 852
    .line 853
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v7

    .line 857
    check-cast v7, Lpp3;

    .line 858
    .line 859
    iget-object v8, v7, Lpp3;->c:Ljava/lang/String;

    .line 860
    .line 861
    iget-wide v9, v7, Lpp3;->h:J

    .line 862
    .line 863
    iget-wide v11, v7, Lpp3;->a:J

    .line 864
    .line 865
    invoke-virtual {v1, v4, v8}, Lmp3;->s(Ljava/lang/String;Ljava/lang/String;)Z

    .line 866
    .line 867
    .line 868
    move-result v8

    .line 869
    if-nez v8, :cond_8

    .line 870
    .line 871
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 872
    .line 873
    .line 874
    move-result-object v8

    .line 875
    iget-object v8, v8, Luh3;->Y:Lsh3;

    .line 876
    .line 877
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 878
    .line 879
    .line 880
    move-result-object v9

    .line 881
    iget-object v7, v7, Lpp3;->c:Ljava/lang/String;

    .line 882
    .line 883
    const-string v10, "[sgtm] batch skipped due to destination in backoff. appId, rowId, url"

    .line 884
    .line 885
    invoke-virtual {v8, v10, v4, v9, v7}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 886
    .line 887
    .line 888
    goto :goto_e

    .line 889
    :cond_8
    iget v8, v7, Lpp3;->i:I

    .line 890
    .line 891
    if-gtz v8, :cond_9

    .line 892
    .line 893
    goto :goto_f

    .line 894
    :cond_9
    sget-object v13, Lvg3;->z:Lug3;

    .line 895
    .line 896
    invoke-virtual {v13, v3}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    move-result-object v13

    .line 900
    check-cast v13, Ljava/lang/Integer;

    .line 901
    .line 902
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 903
    .line 904
    .line 905
    move-result v13

    .line 906
    if-le v8, v13, :cond_a

    .line 907
    .line 908
    goto/16 :goto_13

    .line 909
    .line 910
    :cond_a
    sget-object v13, Lvg3;->x:Lug3;

    .line 911
    .line 912
    invoke-virtual {v13, v3}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v13

    .line 916
    check-cast v13, Ljava/lang/Long;

    .line 917
    .line 918
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 919
    .line 920
    .line 921
    move-result-wide v13

    .line 922
    add-int/lit8 v8, v8, -0x1

    .line 923
    .line 924
    const-wide/16 v15, 0x1

    .line 925
    .line 926
    shl-long/2addr v15, v8

    .line 927
    mul-long/2addr v13, v15

    .line 928
    sget-object v8, Lvg3;->y:Lug3;

    .line 929
    .line 930
    invoke-virtual {v8, v3}, Lug3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v8

    .line 934
    check-cast v8, Ljava/lang/Long;

    .line 935
    .line 936
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 937
    .line 938
    .line 939
    move-result-wide v2

    .line 940
    invoke-static {v13, v14, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 941
    .line 942
    .line 943
    move-result-wide v2

    .line 944
    invoke-virtual {v1}, Lmp3;->f()Lxv;

    .line 945
    .line 946
    .line 947
    move-result-object v8

    .line 948
    check-cast v8, Lxt0;

    .line 949
    .line 950
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 951
    .line 952
    .line 953
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 954
    .line 955
    .line 956
    move-result-wide v13

    .line 957
    add-long/2addr v2, v9

    .line 958
    cmp-long v2, v13, v2

    .line 959
    .line 960
    if-ltz v2, :cond_e

    .line 961
    .line 962
    :goto_f
    new-instance v2, Landroid/os/Bundle;

    .line 963
    .line 964
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 965
    .line 966
    .line 967
    iget-object v3, v7, Lpp3;->d:Ljava/util/HashMap;

    .line 968
    .line 969
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 970
    .line 971
    .line 972
    move-result-object v3

    .line 973
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 974
    .line 975
    .line 976
    move-result-object v3

    .line 977
    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 978
    .line 979
    .line 980
    move-result v8

    .line 981
    if-eqz v8, :cond_b

    .line 982
    .line 983
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    move-result-object v8

    .line 987
    check-cast v8, Ljava/util/Map$Entry;

    .line 988
    .line 989
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v9

    .line 993
    check-cast v9, Ljava/lang/String;

    .line 994
    .line 995
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 996
    .line 997
    .line 998
    move-result-object v8

    .line 999
    check-cast v8, Ljava/lang/String;

    .line 1000
    .line 1001
    invoke-virtual {v2, v9, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1002
    .line 1003
    .line 1004
    goto :goto_10

    .line 1005
    :cond_b
    iget-wide v8, v7, Lpp3;->a:J

    .line 1006
    .line 1007
    iget-object v3, v7, Lpp3;->b:Lcom/google/android/gms/internal/measurement/zzib;

    .line 1008
    .line 1009
    iget-object v10, v7, Lpp3;->c:Ljava/lang/String;

    .line 1010
    .line 1011
    iget-object v11, v7, Lpp3;->e:Lzl3;

    .line 1012
    .line 1013
    iget-wide v12, v7, Lpp3;->g:J

    .line 1014
    .line 1015
    new-instance v17, Lcom/google/android/gms/measurement/internal/zzol;

    .line 1016
    .line 1017
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzkr;->zzcc()[B

    .line 1018
    .line 1019
    .line 1020
    move-result-object v20

    .line 1021
    iget v3, v11, Lzl3;->a:I

    .line 1022
    .line 1023
    const-string v26, ""

    .line 1024
    .line 1025
    move-object/from16 v22, v2

    .line 1026
    .line 1027
    move/from16 v23, v3

    .line 1028
    .line 1029
    move-wide/from16 v18, v8

    .line 1030
    .line 1031
    move-object/from16 v21, v10

    .line 1032
    .line 1033
    move-wide/from16 v24, v12

    .line 1034
    .line 1035
    invoke-direct/range {v17 .. v26}, Lcom/google/android/gms/measurement/internal/zzol;-><init>(J[BLjava/lang/String;Landroid/os/Bundle;IJLjava/lang/String;)V

    .line 1036
    .line 1037
    .line 1038
    move-object/from16 v2, v17

    .line 1039
    .line 1040
    :try_start_e
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzib;->zzh()Lcom/google/android/gms/internal/measurement/zzhz;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v3

    .line 1044
    iget-object v7, v2, Lcom/google/android/gms/measurement/internal/zzol;->b:[B

    .line 1045
    .line 1046
    invoke-static {v3, v7}, Lci3;->m0(Lcom/google/android/gms/internal/measurement/zzma;[B)Lcom/google/android/gms/internal/measurement/zznk;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v3

    .line 1050
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzhz;

    .line 1051
    .line 1052
    const/4 v7, 0x0

    .line 1053
    :goto_11
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzhz;->zzb()I

    .line 1054
    .line 1055
    .line 1056
    move-result v8

    .line 1057
    if-ge v7, v8, :cond_c

    .line 1058
    .line 1059
    invoke-virtual {v3, v7}, Lcom/google/android/gms/internal/measurement/zzhz;->zzc(I)Lcom/google/android/gms/internal/measurement/zzid;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v8

    .line 1063
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzme;->zzcl()Lcom/google/android/gms/internal/measurement/zzma;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v8

    .line 1067
    check-cast v8, Lcom/google/android/gms/internal/measurement/zzic;

    .line 1068
    .line 1069
    invoke-virtual {v1}, Lmp3;->f()Lxv;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v9

    .line 1073
    check-cast v9, Lxt0;

    .line 1074
    .line 1075
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1076
    .line 1077
    .line 1078
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1079
    .line 1080
    .line 1081
    move-result-wide v9

    .line 1082
    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/measurement/zzic;->zzs(J)Lcom/google/android/gms/internal/measurement/zzic;

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v3, v7, v8}, Lcom/google/android/gms/internal/measurement/zzhz;->zzd(ILcom/google/android/gms/internal/measurement/zzic;)Lcom/google/android/gms/internal/measurement/zzhz;

    .line 1086
    .line 1087
    .line 1088
    add-int/lit8 v7, v7, 0x1

    .line 1089
    .line 1090
    goto :goto_11

    .line 1091
    :cond_c
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v7

    .line 1095
    check-cast v7, Lcom/google/android/gms/internal/measurement/zzib;

    .line 1096
    .line 1097
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzkr;->zzcc()[B

    .line 1098
    .line 1099
    .line 1100
    move-result-object v7

    .line 1101
    iput-object v7, v2, Lcom/google/android/gms/measurement/internal/zzol;->b:[B

    .line 1102
    .line 1103
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v7

    .line 1107
    invoke-virtual {v7}, Luh3;->J()Ljava/lang/String;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v7

    .line 1111
    const/4 v8, 0x2

    .line 1112
    invoke-static {v7, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1113
    .line 1114
    .line 1115
    move-result v7

    .line 1116
    if-eqz v7, :cond_d

    .line 1117
    .line 1118
    iget-object v7, v1, Lmp3;->i:Lci3;

    .line 1119
    .line 1120
    invoke-static {v7}, Lmp3;->S(Lwo3;)V

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v3

    .line 1127
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzib;

    .line 1128
    .line 1129
    invoke-virtual {v7, v3}, Lci3;->c0(Lcom/google/android/gms/internal/measurement/zzib;)Ljava/lang/String;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v3

    .line 1133
    iput-object v3, v2, Lcom/google/android/gms/measurement/internal/zzol;->i:Ljava/lang/String;
    :try_end_e
    .catch Lcom/google/android/gms/internal/measurement/zzmq; {:try_start_e .. :try_end_e} :catch_6

    .line 1134
    .line 1135
    :cond_d
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1136
    .line 1137
    .line 1138
    :goto_12
    const/4 v2, 0x0

    .line 1139
    const/4 v3, 0x0

    .line 1140
    goto/16 :goto_e

    .line 1141
    .line 1142
    :catch_6
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v2

    .line 1146
    iget-object v2, v2, Luh3;->w:Lsh3;

    .line 1147
    .line 1148
    const-string v3, "Failed to parse queued batch. appId"

    .line 1149
    .line 1150
    invoke-virtual {v2, v4, v3}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1151
    .line 1152
    .line 1153
    goto :goto_12

    .line 1154
    :cond_e
    :goto_13
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v2

    .line 1158
    iget-object v2, v2, Luh3;->Y:Lsh3;

    .line 1159
    .line 1160
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v3

    .line 1164
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v7

    .line 1168
    const-string v8, "[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis"

    .line 1169
    .line 1170
    invoke-virtual {v2, v8, v4, v3, v7}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1171
    .line 1172
    .line 1173
    goto :goto_12

    .line 1174
    :cond_f
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzop;

    .line 1175
    .line 1176
    invoke-direct {v2, v6}, Lcom/google/android/gms/measurement/internal/zzop;-><init>(Ljava/util/ArrayList;)V

    .line 1177
    .line 1178
    .line 1179
    :try_start_f
    invoke-interface {v0, v2}, Lcom/google/android/gms/measurement/internal/zzgg;->i0(Lcom/google/android/gms/measurement/internal/zzop;)V

    .line 1180
    .line 1181
    .line 1182
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v0

    .line 1186
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 1187
    .line 1188
    const-string v2, "[sgtm] Sending queued upload batches to client. appId, count"

    .line 1189
    .line 1190
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1191
    .line 1192
    .line 1193
    move-result v3

    .line 1194
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v3

    .line 1198
    invoke-virtual {v0, v4, v2, v3}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_f
    .catch Landroid/os/RemoteException; {:try_start_f .. :try_end_f} :catch_7

    .line 1199
    .line 1200
    .line 1201
    goto :goto_14

    .line 1202
    :catch_7
    move-exception v0

    .line 1203
    invoke-virtual {v1}, Lmp3;->a()Luh3;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v1

    .line 1207
    iget-object v1, v1, Luh3;->f:Lsh3;

    .line 1208
    .line 1209
    const-string v2, "[sgtm] Failed to return upload batches for app"

    .line 1210
    .line 1211
    invoke-virtual {v1, v4, v2, v0}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1212
    .line 1213
    .line 1214
    :goto_14
    return-void

    .line 1215
    :pswitch_8
    :try_start_10
    new-instance v1, Ljava/util/HashMap;

    .line 1216
    .line 1217
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 1218
    .line 1219
    .line 1220
    const-string v2, "userName"

    .line 1221
    .line 1222
    iget-object v3, v0, Lur;->b:Ljava/lang/Object;

    .line 1223
    .line 1224
    check-cast v3, Ljava/lang/String;

    .line 1225
    .line 1226
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1227
    .line 1228
    .line 1229
    const-string v2, "userId"

    .line 1230
    .line 1231
    iget-object v3, v0, Lur;->c:Ljava/lang/Object;

    .line 1232
    .line 1233
    check-cast v3, Ljava/lang/String;

    .line 1234
    .line 1235
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    const-string v2, "userEmail"

    .line 1239
    .line 1240
    iget-object v3, v0, Lur;->d:Ljava/lang/Object;

    .line 1241
    .line 1242
    check-cast v3, Ljava/lang/String;

    .line 1243
    .line 1244
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1245
    .line 1246
    .line 1247
    const-string v2, "userAuthToken"

    .line 1248
    .line 1249
    iget-object v0, v0, Lur;->e:Ljava/lang/Object;

    .line 1250
    .line 1251
    check-cast v0, Ljava/lang/String;

    .line 1252
    .line 1253
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1254
    .line 1255
    .line 1256
    invoke-static {}, Lrs0;->b()Z

    .line 1257
    .line 1258
    .line 1259
    move-result v0

    .line 1260
    if-nez v0, :cond_10

    .line 1261
    .line 1262
    goto :goto_15

    .line 1263
    :cond_10
    const-string v0, "Helpshift"

    .line 1264
    .line 1265
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1266
    .line 1267
    const-string v3, "Logging in the user: "

    .line 1268
    .line 1269
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1270
    .line 1271
    .line 1272
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1273
    .line 1274
    .line 1275
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v2

    .line 1279
    const/4 v15, 0x0

    .line 1280
    invoke-static {v0, v2, v15}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1281
    .line 1282
    .line 1283
    sget-object v0, Lrs0;->y:Lrs0;

    .line 1284
    .line 1285
    iget-object v2, v0, Lrs0;->p:Lra2;

    .line 1286
    .line 1287
    new-instance v3, Lcp0;

    .line 1288
    .line 1289
    const/16 v4, 0xc

    .line 1290
    .line 1291
    invoke-direct {v3, v4, v0, v1}, Lcp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1292
    .line 1293
    .line 1294
    invoke-virtual {v2, v3}, Lra2;->u(Ljava/lang/Runnable;)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_8

    .line 1295
    .line 1296
    .line 1297
    goto :goto_15

    .line 1298
    :catch_8
    move-exception v0

    .line 1299
    const-string v1, "HelpshiftTitan"

    .line 1300
    .line 1301
    const-string v2, "HelpshiftTitan.login"

    .line 1302
    .line 1303
    invoke-static {v1, v2, v0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1304
    .line 1305
    .line 1306
    :goto_15
    return-void

    .line 1307
    :pswitch_9
    iget-object v1, v0, Lur;->e:Ljava/lang/Object;

    .line 1308
    .line 1309
    check-cast v1, Lqc3;

    .line 1310
    .line 1311
    iget-object v1, v1, Lqc3;->b:Ljava/lang/Object;

    .line 1312
    .line 1313
    check-cast v1, Lwr;

    .line 1314
    .line 1315
    iget-object v2, v0, Lur;->c:Ljava/lang/Object;

    .line 1316
    .line 1317
    check-cast v2, Lsg1;

    .line 1318
    .line 1319
    iget-object v3, v0, Lur;->b:Ljava/lang/Object;

    .line 1320
    .line 1321
    check-cast v3, Lvr;

    .line 1322
    .line 1323
    if-eqz v3, :cond_11

    .line 1324
    .line 1325
    const/4 v4, 0x1

    .line 1326
    iput-boolean v4, v1, Lwr;->k0:Z

    .line 1327
    .line 1328
    iget-object v3, v3, Lvr;->b:Ljg1;

    .line 1329
    .line 1330
    const/4 v4, 0x0

    .line 1331
    invoke-virtual {v3, v4}, Ljg1;->c(Z)V

    .line 1332
    .line 1333
    .line 1334
    iput-boolean v4, v1, Lwr;->k0:Z

    .line 1335
    .line 1336
    :cond_11
    invoke-virtual {v2}, Lsg1;->isEnabled()Z

    .line 1337
    .line 1338
    .line 1339
    move-result v1

    .line 1340
    if-eqz v1, :cond_12

    .line 1341
    .line 1342
    invoke-virtual {v2}, Lsg1;->hasSubMenu()Z

    .line 1343
    .line 1344
    .line 1345
    move-result v1

    .line 1346
    if-eqz v1, :cond_12

    .line 1347
    .line 1348
    iget-object v0, v0, Lur;->d:Ljava/lang/Object;

    .line 1349
    .line 1350
    check-cast v0, Ljg1;

    .line 1351
    .line 1352
    const/4 v1, 0x4

    .line 1353
    const/4 v15, 0x0

    .line 1354
    invoke-virtual {v0, v2, v15, v1}, Ljg1;->q(Landroid/view/MenuItem;Leh1;I)Z

    .line 1355
    .line 1356
    .line 1357
    :cond_12
    return-void

    .line 1358
    nop

    .line 1359
    :pswitch_data_0
    .packed-switch 0x0
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

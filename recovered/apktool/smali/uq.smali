.class public final synthetic Luq;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lvq;

.field public final synthetic c:Ljava/util/concurrent/Executor;

.field public final synthetic d:J

.field public final synthetic e:I

.field public final synthetic f:Landroid/content/Context;

.field public final synthetic i:Lum;


# direct methods
.method public synthetic constructor <init>(Lvq;Landroid/content/Context;Ljava/util/concurrent/Executor;ILum;J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Luq;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Luq;->b:Lvq;

    .line 8
    .line 9
    iput-object p2, p0, Luq;->f:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p3, p0, Luq;->c:Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    iput p4, p0, Luq;->e:I

    .line 14
    .line 15
    iput-object p5, p0, Luq;->i:Lum;

    .line 16
    .line 17
    iput-wide p6, p0, Luq;->d:J

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Lvq;Ljava/util/concurrent/Executor;JILandroid/content/Context;Lum;)V
    .locals 1

    .line 20
    const/4 v0, 0x1

    iput v0, p0, Luq;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luq;->b:Lvq;

    iput-object p2, p0, Luq;->c:Ljava/util/concurrent/Executor;

    iput-wide p3, p0, Luq;->d:J

    iput p5, p0, Luq;->e:I

    iput-object p6, p0, Luq;->f:Landroid/content/Context;

    iput-object p7, p0, Luq;->i:Lum;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Luq;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v4, v0, Luq;->b:Lvq;

    .line 10
    .line 11
    iget-object v6, v0, Luq;->c:Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    iget-wide v9, v0, Luq;->d:J

    .line 14
    .line 15
    iget v1, v0, Luq;->e:I

    .line 16
    .line 17
    iget-object v5, v0, Luq;->f:Landroid/content/Context;

    .line 18
    .line 19
    iget-object v8, v0, Luq;->i:Lum;

    .line 20
    .line 21
    add-int/lit8 v7, v1, 0x1

    .line 22
    .line 23
    new-instance v3, Luq;

    .line 24
    .line 25
    invoke-direct/range {v3 .. v10}, Luq;-><init>(Lvq;Landroid/content/Context;Ljava/util/concurrent/Executor;ILum;J)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v6, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_0
    iget-object v8, v0, Luq;->b:Lvq;

    .line 33
    .line 34
    iget-object v1, v0, Luq;->f:Landroid/content/Context;

    .line 35
    .line 36
    iget-object v9, v0, Luq;->c:Ljava/util/concurrent/Executor;

    .line 37
    .line 38
    iget v12, v0, Luq;->e:I

    .line 39
    .line 40
    iget-object v14, v0, Luq;->i:Lum;

    .line 41
    .line 42
    iget-wide v10, v0, Luq;->d:J

    .line 43
    .line 44
    const-string v3, "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: "

    .line 45
    .line 46
    const-string v4, "Retry init. Start time "

    .line 47
    .line 48
    const-string v0, "CX:initAndRetryRecursively"

    .line 49
    .line 50
    invoke-static {v0}, Lj13;->A(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Lpg3;->l(Landroid/content/Context;)Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v16

    .line 61
    const/4 v1, 0x4

    .line 62
    const/4 v5, 0x0

    .line 63
    :try_start_0
    iget-object v0, v8, Lvq;->c:Lxq;

    .line 64
    .line 65
    invoke-virtual {v0}, Lxq;->j()Leo;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    iget-object v0, v8, Lvq;->d:Ljava/util/concurrent/Executor;

    .line 72
    .line 73
    iget-object v6, v8, Lvq;->e:Landroid/os/Handler;

    .line 74
    .line 75
    new-instance v7, Lgf;

    .line 76
    .line 77
    invoke-direct {v7, v0, v6}, Lgf;-><init>(Ljava/util/concurrent/Executor;Landroid/os/Handler;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, v8, Lvq;->c:Lxq;

    .line 81
    .line 82
    invoke-virtual {v0}, Lxq;->d()Ljq;

    .line 83
    .line 84
    .line 85
    move-result-object v18

    .line 86
    iget-object v0, v8, Lvq;->c:Lxq;

    .line 87
    .line 88
    invoke-virtual {v0}, Lxq;->m()J

    .line 89
    .line 90
    .line 91
    move-result-wide v19

    .line 92
    new-instance v15, Lln;

    .line 93
    .line 94
    move-object/from16 v17, v7

    .line 95
    .line 96
    invoke-direct/range {v15 .. v20}, Lln;-><init>(Landroid/content/Context;Lgf;Ljq;J)V
    :try_end_0
    .catch Lsq; {:try_start_0 .. :try_end_0} :catch_5
    .catch Lux0; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 97
    .line 98
    .line 99
    move-object/from16 v13, v16

    .line 100
    .line 101
    move-object/from16 v0, v18

    .line 102
    .line 103
    :try_start_1
    iput-object v15, v8, Lvq;->f:Lln;

    .line 104
    .line 105
    iget-object v6, v8, Lvq;->c:Lxq;

    .line 106
    .line 107
    invoke-virtual {v6}, Lxq;->o()Lfo;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    if-eqz v6, :cond_3

    .line 112
    .line 113
    iget-object v6, v8, Lvq;->f:Lln;

    .line 114
    .line 115
    iget-object v7, v6, Lln;->e:Lcq;

    .line 116
    .line 117
    new-instance v15, Ljava/util/LinkedHashSet;

    .line 118
    .line 119
    iget-object v6, v6, Lln;->f:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-direct {v15, v6}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v13, v7, v15}, Lfo;->a(Landroid/content/Context;Ljava/lang/Object;Ljava/util/LinkedHashSet;)Lcb;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    iput-object v6, v8, Lvq;->g:Lcb;

    .line 129
    .line 130
    iget-object v6, v8, Lvq;->c:Lxq;

    .line 131
    .line 132
    invoke-virtual {v6}, Lxq;->p()Lgo;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    if-eqz v6, :cond_2

    .line 137
    .line 138
    new-instance v6, Ljo;

    .line 139
    .line 140
    invoke-direct {v6, v13}, Ljo;-><init>(Landroid/content/Context;)V

    .line 141
    .line 142
    .line 143
    iput-object v6, v8, Lvq;->h:Ljo;

    .line 144
    .line 145
    instance-of v6, v9, Lwp;

    .line 146
    .line 147
    if-eqz v6, :cond_0

    .line 148
    .line 149
    move-object v6, v9

    .line 150
    check-cast v6, Lwp;

    .line 151
    .line 152
    iget-object v7, v8, Lvq;->f:Lln;

    .line 153
    .line 154
    invoke-virtual {v6, v7}, Lwp;->a(Lln;)V

    .line 155
    .line 156
    .line 157
    goto :goto_0

    .line 158
    :catch_0
    move-exception v0

    .line 159
    goto :goto_3

    .line 160
    :catch_1
    move-exception v0

    .line 161
    goto :goto_3

    .line 162
    :catch_2
    move-exception v0

    .line 163
    goto :goto_3

    .line 164
    :cond_0
    :goto_0
    iget-object v6, v8, Lvq;->a:Lcb;

    .line 165
    .line 166
    iget-object v7, v8, Lvq;->f:Lln;

    .line 167
    .line 168
    invoke-virtual {v6, v7}, Lcb;->z(Lln;)V

    .line 169
    .line 170
    .line 171
    iget-object v6, v8, Lvq;->a:Lcb;

    .line 172
    .line 173
    invoke-static {v13, v6, v0}, Ltq;->a(Landroid/content/Context;Lcb;Ljq;)V

    .line 174
    .line 175
    .line 176
    if-le v12, v2, :cond_1

    .line 177
    .line 178
    invoke-static {}, Lj13;->m()Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_1

    .line 183
    .line 184
    const-string v0, "CX:CameraProvider-RetryStatus"

    .line 185
    .line 186
    const/4 v2, -0x1

    .line 187
    invoke-static {v2, v0}, Lj13;->v(ILjava/lang/String;)V

    .line 188
    .line 189
    .line 190
    :cond_1
    iget-object v2, v8, Lvq;->b:Ljava/lang/Object;

    .line 191
    .line 192
    monitor-enter v2
    :try_end_1
    .catch Lsq; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lux0; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 193
    :try_start_2
    iput v1, v8, Lvq;->k:I

    .line 194
    .line 195
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 196
    :try_start_3
    invoke-virtual {v14, v5}, Lum;->a(Ljava/lang/Object;)Z
    :try_end_3
    .catch Lsq; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lux0; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 197
    .line 198
    .line 199
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_4

    .line 203
    .line 204
    :catchall_0
    move-exception v0

    .line 205
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 206
    :try_start_5
    throw v0

    .line 207
    :cond_2
    new-instance v0, Lux0;

    .line 208
    .line 209
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 210
    .line 211
    const-string v6, "Invalid app configuration provided. Missing UseCaseConfigFactory."

    .line 212
    .line 213
    invoke-direct {v2, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 217
    .line 218
    .line 219
    throw v0

    .line 220
    :cond_3
    new-instance v0, Lux0;

    .line 221
    .line 222
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 223
    .line 224
    const-string v6, "Invalid app configuration provided. Missing CameraDeviceSurfaceManager."

    .line 225
    .line 226
    invoke-direct {v2, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 230
    .line 231
    .line 232
    throw v0

    .line 233
    :catch_3
    move-exception v0

    .line 234
    :goto_2
    move-object/from16 v13, v16

    .line 235
    .line 236
    goto :goto_3

    .line 237
    :catch_4
    move-exception v0

    .line 238
    goto :goto_2

    .line 239
    :catch_5
    move-exception v0

    .line 240
    goto :goto_2

    .line 241
    :cond_4
    move-object/from16 v13, v16

    .line 242
    .line 243
    new-instance v0, Lux0;

    .line 244
    .line 245
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 246
    .line 247
    const-string v6, "Invalid app configuration provided. Missing CameraFactory."

    .line 248
    .line 249
    invoke-direct {v2, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 253
    .line 254
    .line 255
    throw v0
    :try_end_5
    .catch Lsq; {:try_start_5 .. :try_end_5} :catch_2
    .catch Lux0; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 256
    :goto_3
    :try_start_6
    new-instance v2, Lbd;

    .line 257
    .line 258
    invoke-direct {v2, v10, v11, v0}, Lbd;-><init>(JLjava/lang/Exception;)V

    .line 259
    .line 260
    .line 261
    iget-object v6, v8, Lvq;->i:Ly42;

    .line 262
    .line 263
    invoke-interface {v6, v2}, Ly42;->b(Lbd;)Lx42;

    .line 264
    .line 265
    .line 266
    move-result-object v6

    .line 267
    invoke-static {}, Lj13;->m()Z

    .line 268
    .line 269
    .line 270
    move-result v7

    .line 271
    if-eqz v7, :cond_5

    .line 272
    .line 273
    iget v2, v2, Lbd;->a:I

    .line 274
    .line 275
    const-string v7, "CX:CameraProvider-RetryStatus"

    .line 276
    .line 277
    invoke-static {v2, v7}, Lj13;->v(ILjava/lang/String;)V

    .line 278
    .line 279
    .line 280
    :cond_5
    iget-boolean v2, v6, Lx42;->b:Z

    .line 281
    .line 282
    if-eqz v2, :cond_7

    .line 283
    .line 284
    const v2, 0x7fffffff

    .line 285
    .line 286
    .line 287
    if-ge v12, v2, :cond_7

    .line 288
    .line 289
    const-string v1, "CameraX"

    .line 290
    .line 291
    new-instance v2, Ljava/lang/StringBuilder;

    .line 292
    .line 293
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    const-string v3, " current time "

    .line 300
    .line 301
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 305
    .line 306
    .line 307
    move-result-wide v3

    .line 308
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    invoke-static {v1, v2, v0}, Lhu0;->I0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 316
    .line 317
    .line 318
    iget-object v0, v8, Lvq;->e:Landroid/os/Handler;

    .line 319
    .line 320
    new-instance v7, Luq;

    .line 321
    .line 322
    invoke-direct/range {v7 .. v14}, Luq;-><init>(Lvq;Ljava/util/concurrent/Executor;JILandroid/content/Context;Lum;)V

    .line 323
    .line 324
    .line 325
    const-string v1, "retry_token"

    .line 326
    .line 327
    iget-wide v2, v6, Lx42;->a:J

    .line 328
    .line 329
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 330
    .line 331
    const/16 v5, 0x1c

    .line 332
    .line 333
    if-lt v4, v5, :cond_6

    .line 334
    .line 335
    invoke-static {v0, v7, v2, v3}, Ly60;->c(Landroid/os/Handler;Luq;J)Z

    .line 336
    .line 337
    .line 338
    goto/16 :goto_1

    .line 339
    .line 340
    :cond_6
    invoke-static {v0, v7}, Landroid/os/Message;->obtain(Landroid/os/Handler;Ljava/lang/Runnable;)Landroid/os/Message;

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    iput-object v1, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 345
    .line 346
    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 347
    .line 348
    .line 349
    goto/16 :goto_1

    .line 350
    .line 351
    :cond_7
    iget-object v2, v8, Lvq;->b:Ljava/lang/Object;

    .line 352
    .line 353
    monitor-enter v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 354
    const/4 v4, 0x3

    .line 355
    :try_start_7
    iput v4, v8, Lvq;->k:I

    .line 356
    .line 357
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 358
    :try_start_8
    iget-boolean v2, v6, Lx42;->c:Z

    .line 359
    .line 360
    if-eqz v2, :cond_8

    .line 361
    .line 362
    iget-object v2, v8, Lvq;->b:Ljava/lang/Object;

    .line 363
    .line 364
    monitor-enter v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 365
    :try_start_9
    iput v1, v8, Lvq;->k:I

    .line 366
    .line 367
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 368
    :try_start_a
    invoke-virtual {v14, v5}, Lum;->a(Ljava/lang/Object;)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 369
    .line 370
    .line 371
    goto/16 :goto_1

    .line 372
    .line 373
    :catchall_1
    move-exception v0

    .line 374
    :try_start_b
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 375
    :try_start_c
    throw v0

    .line 376
    :cond_8
    instance-of v1, v0, Lsq;

    .line 377
    .line 378
    if-eqz v1, :cond_9

    .line 379
    .line 380
    new-instance v1, Ljava/lang/StringBuilder;

    .line 381
    .line 382
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    move-object v2, v0

    .line 386
    check-cast v2, Lsq;

    .line 387
    .line 388
    iget v2, v2, Lsq;->a:I

    .line 389
    .line 390
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    const-string v2, "CameraX"

    .line 398
    .line 399
    invoke-static {v2, v1, v0}, Lhu0;->U(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 400
    .line 401
    .line 402
    new-instance v0, Lux0;

    .line 403
    .line 404
    new-instance v2, Lmq;

    .line 405
    .line 406
    invoke-direct {v2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v14, v0}, Lum;->b(Ljava/lang/Throwable;)Z

    .line 413
    .line 414
    .line 415
    goto/16 :goto_1

    .line 416
    .line 417
    :cond_9
    instance-of v1, v0, Lux0;

    .line 418
    .line 419
    if-eqz v1, :cond_a

    .line 420
    .line 421
    invoke-virtual {v14, v0}, Lum;->b(Ljava/lang/Throwable;)Z

    .line 422
    .line 423
    .line 424
    goto/16 :goto_1

    .line 425
    .line 426
    :cond_a
    new-instance v1, Lux0;

    .line 427
    .line 428
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v14, v1}, Lum;->b(Ljava/lang/Throwable;)Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 432
    .line 433
    .line 434
    goto/16 :goto_1

    .line 435
    .line 436
    :goto_4
    return-void

    .line 437
    :catchall_2
    move-exception v0

    .line 438
    :try_start_d
    monitor-exit v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 439
    :try_start_e
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 440
    :catchall_3
    move-exception v0

    .line 441
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 442
    .line 443
    .line 444
    throw v0

    .line 445
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

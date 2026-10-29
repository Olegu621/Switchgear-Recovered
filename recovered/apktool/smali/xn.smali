.class public final Lxn;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lzp;


# instance fields
.field public U:Landroid/hardware/camera2/CameraDevice;

.field public V:I

.field public W:Lrr;

.field public final X:Ljava/util/LinkedHashMap;

.field public Y:I

.field public final Z:Lsn;

.field public final a:Lfs0;

.field public final a0:Lkn;

.field public final b:Lcq;

.field public final b0:Llq;

.field public final c:Ly92;

.field public final c0:Z

.field public final d:Lnt0;

.field public final d0:Z

.field public final e:Lfs0;

.field public e0:Z

.field public final f:Lcb;

.field public f0:Z

.field public g0:Z

.field public h0:Lqi1;

.field public final i:Ljn;

.field public final i0:Lqi1;

.field public final j0:Lxy1;

.field public final k0:Ljava/util/HashSet;

.field public l0:Lhp;

.field public final m0:Ljava/lang/Object;

.field public n0:Z

.field public final o0:Lc90;

.field public final p0:Lqc3;

.field public final q0:Lcj2;

.field public final r0:Lcb;

.field public volatile s0:I

.field public final v:Lwn;

.field public final w:Lzn;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcq;Ljava/lang/String;Lzn;Lkn;Llq;Ljava/util/concurrent/Executor;Landroid/os/Handler;Lc90;J)V
    .locals 15

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p6

    .line 8
    .line 9
    move-object/from16 v4, p8

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v5, 0x3

    .line 15
    iput v5, p0, Lxn;->s0:I

    .line 16
    .line 17
    new-instance v5, Lfs0;

    .line 18
    .line 19
    const/4 v6, 0x4

    .line 20
    invoke-direct {v5, v6}, Lfs0;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object v5, p0, Lxn;->e:Lfs0;

    .line 24
    .line 25
    const/4 v6, 0x0

    .line 26
    iput v6, p0, Lxn;->V:I

    .line 27
    .line 28
    new-instance v7, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 29
    .line 30
    invoke-direct {v7, v6}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 31
    .line 32
    .line 33
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v7, p0, Lxn;->X:Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    iput v6, p0, Lxn;->Y:I

    .line 41
    .line 42
    iput-boolean v6, p0, Lxn;->e0:Z

    .line 43
    .line 44
    iput-boolean v6, p0, Lxn;->f0:Z

    .line 45
    .line 46
    const/4 v7, 0x1

    .line 47
    iput-boolean v7, p0, Lxn;->g0:Z

    .line 48
    .line 49
    new-instance v8, Ljava/util/HashSet;

    .line 50
    .line 51
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v8, p0, Lxn;->k0:Ljava/util/HashSet;

    .line 55
    .line 56
    sget-object v8, Lkp;->a:Ljp;

    .line 57
    .line 58
    iput-object v8, p0, Lxn;->l0:Lhp;

    .line 59
    .line 60
    new-instance v8, Ljava/lang/Object;

    .line 61
    .line 62
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v8, p0, Lxn;->m0:Ljava/lang/Object;

    .line 66
    .line 67
    iput-boolean v6, p0, Lxn;->n0:Z

    .line 68
    .line 69
    new-instance v6, Lcb;

    .line 70
    .line 71
    invoke-direct {v6, p0}, Lcb;-><init>(Lxn;)V

    .line 72
    .line 73
    .line 74
    iput-object v6, p0, Lxn;->r0:Lcb;

    .line 75
    .line 76
    iput-object v0, p0, Lxn;->b:Lcq;

    .line 77
    .line 78
    move-object/from16 v6, p5

    .line 79
    .line 80
    iput-object v6, p0, Lxn;->a0:Lkn;

    .line 81
    .line 82
    iput-object v3, p0, Lxn;->b0:Llq;

    .line 83
    .line 84
    new-instance v10, Lnt0;

    .line 85
    .line 86
    invoke-direct {v10, v4}, Lnt0;-><init>(Landroid/os/Handler;)V

    .line 87
    .line 88
    .line 89
    iput-object v10, p0, Lxn;->d:Lnt0;

    .line 90
    .line 91
    new-instance v11, Ly92;

    .line 92
    .line 93
    move-object/from16 v6, p7

    .line 94
    .line 95
    invoke-direct {v11, v6}, Ly92;-><init>(Ljava/util/concurrent/Executor;)V

    .line 96
    .line 97
    .line 98
    iput-object v11, p0, Lxn;->c:Ly92;

    .line 99
    .line 100
    new-instance v8, Lwn;

    .line 101
    .line 102
    move-object v9, v11

    .line 103
    move-object v11, v10

    .line 104
    move-object v10, v9

    .line 105
    move-object v9, p0

    .line 106
    move-wide/from16 v12, p10

    .line 107
    .line 108
    invoke-direct/range {v8 .. v13}, Lwn;-><init>(Lxn;Ly92;Lnt0;J)V

    .line 109
    .line 110
    .line 111
    move-object v6, v11

    .line 112
    move-object v11, v10

    .line 113
    move-object v10, v6

    .line 114
    move-object v6, v9

    .line 115
    iput-object v8, v6, Lxn;->v:Lwn;

    .line 116
    .line 117
    new-instance v8, Lfs0;

    .line 118
    .line 119
    invoke-direct {v8, v1}, Lfs0;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    iput-object v8, v6, Lxn;->a:Lfs0;

    .line 123
    .line 124
    sget-object v8, Lyp;->d:Lyp;

    .line 125
    .line 126
    iget-object v5, v5, Lfs0;->b:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v5, Lrk1;

    .line 129
    .line 130
    new-instance v9, Ler0;

    .line 131
    .line 132
    const/4 v12, 0x5

    .line 133
    invoke-direct {v9, v8, v12}, Ler0;-><init>(Ljava/lang/Object;I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5, v9}, Lrk1;->k(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    new-instance v5, Lcb;

    .line 140
    .line 141
    invoke-direct {v5, v3}, Lcb;-><init>(Llq;)V

    .line 142
    .line 143
    .line 144
    iput-object v5, v6, Lxn;->f:Lcb;

    .line 145
    .line 146
    new-instance v14, Lqi1;

    .line 147
    .line 148
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 149
    .line 150
    .line 151
    new-instance v8, Ljava/lang/Object;

    .line 152
    .line 153
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 154
    .line 155
    .line 156
    iput-object v8, v14, Lqi1;->b:Ljava/lang/Object;

    .line 157
    .line 158
    new-instance v8, Ljava/util/LinkedHashSet;

    .line 159
    .line 160
    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    .line 161
    .line 162
    .line 163
    iput-object v8, v14, Lqi1;->c:Ljava/lang/Object;

    .line 164
    .line 165
    new-instance v8, Ljava/util/LinkedHashSet;

    .line 166
    .line 167
    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    .line 168
    .line 169
    .line 170
    iput-object v8, v14, Lqi1;->d:Ljava/lang/Object;

    .line 171
    .line 172
    new-instance v8, Ljava/util/LinkedHashSet;

    .line 173
    .line 174
    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    .line 175
    .line 176
    .line 177
    iput-object v8, v14, Lqi1;->e:Ljava/lang/Object;

    .line 178
    .line 179
    new-instance v8, Lrp;

    .line 180
    .line 181
    invoke-direct {v8, v14}, Lrp;-><init>(Lqi1;)V

    .line 182
    .line 183
    .line 184
    iput-object v8, v14, Lqi1;->f:Ljava/lang/Object;

    .line 185
    .line 186
    iput-object v11, v14, Lqi1;->a:Ljava/lang/Object;

    .line 187
    .line 188
    iput-object v14, v6, Lxn;->i0:Lqi1;

    .line 189
    .line 190
    move-object/from16 v8, p9

    .line 191
    .line 192
    iput-object v8, v6, Lxn;->o0:Lc90;

    .line 193
    .line 194
    :try_start_0
    invoke-virtual/range {p2 .. p3}, Lcq;->b(Ljava/lang/String;)Lgp;

    .line 195
    .line 196
    .line 197
    move-result-object v9

    .line 198
    new-instance v8, Ljn;

    .line 199
    .line 200
    new-instance v12, Lgr0;

    .line 201
    .line 202
    invoke-direct {v12, p0}, Lgr0;-><init>(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    iget-object v13, v2, Lzn;->f:Ler0;

    .line 206
    .line 207
    invoke-direct/range {v8 .. v13}, Ljn;-><init>(Lgp;Lnt0;Ly92;Lgr0;Ler0;)V

    .line 208
    .line 209
    .line 210
    iput-object v8, v6, Lxn;->i:Ljn;

    .line 211
    .line 212
    iput-object v2, v6, Lxn;->w:Lzn;

    .line 213
    .line 214
    iget-object v8, v2, Lzn;->d:Ljava/lang/Object;

    .line 215
    .line 216
    monitor-enter v8
    :try_end_0
    .catch Llo; {:try_start_0 .. :try_end_0} :catch_0

    .line 217
    :try_start_1
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 218
    :try_start_2
    iget-object v8, v2, Lzn;->b:Lgp;

    .line 219
    .line 220
    sget-object v12, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 221
    .line 222
    invoke-virtual {v8, v12}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    check-cast v8, Ljava/lang/Integer;

    .line 227
    .line 228
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    const-string v8, "Camera2CameraInfo"

    .line 232
    .line 233
    invoke-static {v8}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    iget-object v5, v5, Lcb;->c:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v5, Lrk1;

    .line 239
    .line 240
    iget-object v8, v2, Lzn;->e:Lyn;

    .line 241
    .line 242
    invoke-virtual {v8, v5}, Lyn;->l(Lrk1;)V
    :try_end_2
    .catch Llo; {:try_start_2 .. :try_end_2} :catch_0

    .line 243
    .line 244
    .line 245
    invoke-static {v9}, Lqc3;->j(Lgp;)Lqc3;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    iput-object v5, v6, Lxn;->p0:Lqc3;

    .line 250
    .line 251
    invoke-virtual {p0}, Lxn;->y()Lrr;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    iput-object v5, v6, Lxn;->W:Lrr;

    .line 256
    .line 257
    new-instance v5, Lxy1;

    .line 258
    .line 259
    iget-object v8, v2, Lzn;->f:Ler0;

    .line 260
    .line 261
    sget-object v9, Lf80;->a:Ler0;

    .line 262
    .line 263
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 264
    .line 265
    .line 266
    iput-object v11, v5, Lxy1;->a:Ljava/lang/Object;

    .line 267
    .line 268
    iput-object v10, v5, Lxy1;->c:Ljava/lang/Object;

    .line 269
    .line 270
    iput-object v4, v5, Lxy1;->d:Ljava/lang/Object;

    .line 271
    .line 272
    iput-object v14, v5, Lxy1;->e:Ljava/lang/Object;

    .line 273
    .line 274
    iput-object v8, v5, Lxy1;->f:Ljava/lang/Object;

    .line 275
    .line 276
    iput-object v9, v5, Lxy1;->b:Ljava/lang/Object;

    .line 277
    .line 278
    iput-object v5, v6, Lxn;->j0:Lxy1;

    .line 279
    .line 280
    iget-object v4, v2, Lzn;->f:Ler0;

    .line 281
    .line 282
    const-class v5, Landroidx/camera/camera2/internal/compat/quirk/LegacyCameraOutputConfigNullPointerQuirk;

    .line 283
    .line 284
    invoke-virtual {v4, v5}, Ler0;->d(Ljava/lang/Class;)Z

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    iput-boolean v4, v6, Lxn;->c0:Z

    .line 289
    .line 290
    iget-object v2, v2, Lzn;->f:Ler0;

    .line 291
    .line 292
    const-class v4, Landroidx/camera/camera2/internal/compat/quirk/LegacyCameraSurfaceCleanupQuirk;

    .line 293
    .line 294
    invoke-virtual {v2, v4}, Ler0;->d(Ljava/lang/Class;)Z

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    iput-boolean v2, v6, Lxn;->d0:Z

    .line 299
    .line 300
    new-instance v2, Lsn;

    .line 301
    .line 302
    invoke-direct {v2, p0, v1}, Lsn;-><init>(Lxn;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    iput-object v2, v6, Lxn;->Z:Lsn;

    .line 306
    .line 307
    new-instance v4, Ld52;

    .line 308
    .line 309
    invoke-direct {v4, p0}, Ld52;-><init>(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    const-string v5, "Camera is already registered: "

    .line 313
    .line 314
    iget-object v8, v3, Llq;->b:Ljava/lang/Object;

    .line 315
    .line 316
    monitor-enter v8

    .line 317
    :try_start_3
    iget-object v9, v3, Llq;->e:Ljava/util/HashMap;

    .line 318
    .line 319
    invoke-virtual {v9, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    xor-int/2addr v7, v9

    .line 324
    new-instance v9, Ljava/lang/StringBuilder;

    .line 325
    .line 326
    invoke-direct {v9, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v5

    .line 336
    invoke-static {v5, v7}, Lde3;->j(Ljava/lang/String;Z)V

    .line 337
    .line 338
    .line 339
    iget-object v3, v3, Llq;->e:Ljava/util/HashMap;

    .line 340
    .line 341
    new-instance v5, Lkq;

    .line 342
    .line 343
    invoke-direct {v5, v11, v4, v2}, Lkq;-><init>(Ly92;Ld52;Lsn;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v3, p0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 350
    iget-object v3, v0, Lcq;->a:Lcb;

    .line 351
    .line 352
    invoke-virtual {v3, v11, v2}, Lcb;->G(Ly92;Lsn;)V

    .line 353
    .line 354
    .line 355
    new-instance v2, Lcj2;

    .line 356
    .line 357
    new-instance v3, Ldc0;

    .line 358
    .line 359
    const/16 v4, 0x17

    .line 360
    .line 361
    invoke-direct {v3, v4}, Ldc0;-><init>(I)V

    .line 362
    .line 363
    .line 364
    move-object/from16 v4, p1

    .line 365
    .line 366
    invoke-direct {v2, v4, v1, v0, v3}, Lcj2;-><init>(Landroid/content/Context;Ljava/lang/String;Lcq;Ldc0;)V

    .line 367
    .line 368
    .line 369
    iput-object v2, v6, Lxn;->q0:Lcj2;

    .line 370
    .line 371
    return-void

    .line 372
    :catchall_0
    move-exception v0

    .line 373
    move-object p0, v0

    .line 374
    :try_start_4
    monitor-exit v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 375
    throw p0

    .line 376
    :catchall_1
    move-exception v0

    .line 377
    move-object p0, v0

    .line 378
    :try_start_5
    monitor-exit v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 379
    :try_start_6
    throw p0
    :try_end_6
    .catch Llo; {:try_start_6 .. :try_end_6} :catch_0

    .line 380
    :catch_0
    move-exception v0

    .line 381
    move-object p0, v0

    .line 382
    new-instance v0, Lmq;

    .line 383
    .line 384
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 385
    .line 386
    .line 387
    throw v0
.end method

.method public static u(I)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_4

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p0, v0, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p0, v0, :cond_2

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    if-eq p0, v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x5

    .line 16
    if-eq p0, v0, :cond_0

    .line 17
    .line 18
    const-string p0, "UNKNOWN ERROR"

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    const-string p0, "ERROR_CAMERA_SERVICE"

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    const-string p0, "ERROR_CAMERA_DEVICE"

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_2
    const-string p0, "ERROR_CAMERA_DISABLED"

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_3
    const-string p0, "ERROR_MAX_CAMERAS_IN_USE"

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_4
    const-string p0, "ERROR_CAMERA_IN_USE"

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_5
    const-string p0, "ERROR_NONE"

    .line 37
    .line 38
    return-object p0
.end method

.method public static v(Lqi1;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MeteringRepeating"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static w(Lwy2;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lwy2;->f()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method


# virtual methods
.method public final A()V
    .locals 13

    .line 1
    iget v0, p0, Lxn;->s0:I

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    move v0, v3

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v2

    .line 12
    :goto_0
    const/4 v1, 0x0

    .line 13
    invoke-static {v1, v0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lxn;->a:Lfs0;

    .line 17
    .line 18
    invoke-virtual {v0}, Lfs0;->m()Leb2;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-boolean v1, v0, Leb2;->k:Z

    .line 23
    .line 24
    if-eqz v1, :cond_7

    .line 25
    .line 26
    iget-boolean v1, v0, Leb2;->j:Z

    .line 27
    .line 28
    if-eqz v1, :cond_7

    .line 29
    .line 30
    iget-object v1, p0, Lxn;->b0:Llq;

    .line 31
    .line 32
    iget-object v4, p0, Lxn;->U:Landroid/hardware/camera2/CameraDevice;

    .line 33
    .line 34
    invoke-virtual {v4}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    iget-object v5, p0, Lxn;->a0:Lkn;

    .line 39
    .line 40
    iget-object v6, p0, Lxn;->U:Landroid/hardware/camera2/CameraDevice;

    .line 41
    .line 42
    invoke-virtual {v6}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-virtual {v5, v6}, Lkn;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v1, v4, v5}, Llq;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v1, "Unable to create capture session in camera operating mode = "

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lxn;->a0:Lkn;

    .line 64
    .line 65
    iget v1, v1, Lkn;->b:I

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p0, v0}, Lxn;->s(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_1
    new-instance v1, Ljava/util/HashMap;

    .line 79
    .line 80
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 81
    .line 82
    .line 83
    iget-object v4, p0, Lxn;->a:Lfs0;

    .line 84
    .line 85
    invoke-virtual {v4}, Lfs0;->n()Ljava/util/Collection;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    iget-object v5, p0, Lxn;->a:Lfs0;

    .line 90
    .line 91
    invoke-virtual {v5}, Lfs0;->o()Ljava/util/Collection;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    sget-object v6, Lnh2;->a:Llf;

    .line 96
    .line 97
    new-instance v7, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    if-eqz v8, :cond_6

    .line 111
    .line 112
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    check-cast v8, Lfb2;

    .line 117
    .line 118
    iget-object v9, v8, Lfb2;->g:Ljr;

    .line 119
    .line 120
    iget-object v9, v9, Ljr;->b:Lnq1;

    .line 121
    .line 122
    iget-object v9, v9, Lnq1;->a:Ljava/util/TreeMap;

    .line 123
    .line 124
    invoke-virtual {v9, v6}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    if-eqz v9, :cond_3

    .line 129
    .line 130
    invoke-virtual {v8}, Lfb2;->b()Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    if-eq v9, v3, :cond_3

    .line 139
    .line 140
    const-string v4, "StreamUseCaseUtil"

    .line 141
    .line 142
    const-string v5, "SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping()."

    .line 143
    .line 144
    invoke-virtual {v8}, Lfb2;->b()Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-static {v4, v5}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    goto/16 :goto_3

    .line 168
    .line 169
    :cond_3
    iget-object v8, v8, Lfb2;->g:Ljr;

    .line 170
    .line 171
    iget-object v8, v8, Ljr;->b:Lnq1;

    .line 172
    .line 173
    iget-object v8, v8, Lnq1;->a:Ljava/util/TreeMap;

    .line 174
    .line 175
    invoke-virtual {v8, v6}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    if-eqz v8, :cond_2

    .line 180
    .line 181
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    move v5, v2

    .line 186
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    if-eqz v8, :cond_6

    .line 191
    .line 192
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    check-cast v8, Lfb2;

    .line 197
    .line 198
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    check-cast v9, Lzy2;

    .line 203
    .line 204
    invoke-interface {v9}, Lzy2;->t()Lbz2;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    sget-object v10, Lbz2;->f:Lbz2;

    .line 209
    .line 210
    if-ne v9, v10, :cond_4

    .line 211
    .line 212
    invoke-virtual {v8}, Lfb2;->b()Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v9

    .line 216
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 217
    .line 218
    .line 219
    move-result v9

    .line 220
    xor-int/2addr v9, v3

    .line 221
    const-string v10, "MeteringRepeating should contain a surface"

    .line 222
    .line 223
    invoke-static {v10, v9}, Lde3;->j(Ljava/lang/String;Z)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v8}, Lfb2;->b()Ljava/util/List;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v8

    .line 234
    check-cast v8, Ld70;

    .line 235
    .line 236
    const-wide/16 v9, 0x1

    .line 237
    .line 238
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 239
    .line 240
    .line 241
    move-result-object v9

    .line 242
    invoke-virtual {v1, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_4
    iget-object v9, v8, Lfb2;->g:Ljr;

    .line 247
    .line 248
    iget-object v9, v9, Ljr;->b:Lnq1;

    .line 249
    .line 250
    iget-object v9, v9, Lnq1;->a:Ljava/util/TreeMap;

    .line 251
    .line 252
    invoke-virtual {v9, v6}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v9

    .line 256
    if-eqz v9, :cond_5

    .line 257
    .line 258
    invoke-virtual {v8}, Lfb2;->b()Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object v9

    .line 262
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 263
    .line 264
    .line 265
    move-result v9

    .line 266
    if-nez v9, :cond_5

    .line 267
    .line 268
    invoke-virtual {v8}, Lfb2;->b()Ljava/util/List;

    .line 269
    .line 270
    .line 271
    move-result-object v9

    .line 272
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v9

    .line 276
    check-cast v9, Ld70;

    .line 277
    .line 278
    iget-object v8, v8, Lfb2;->g:Ljr;

    .line 279
    .line 280
    iget-object v8, v8, Ljr;->b:Lnq1;

    .line 281
    .line 282
    invoke-virtual {v8, v6}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v8

    .line 286
    check-cast v8, Ljava/lang/Long;

    .line 287
    .line 288
    invoke-virtual {v1, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    :cond_5
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 292
    .line 293
    goto :goto_1

    .line 294
    :cond_6
    :goto_3
    iget-object v4, p0, Lxn;->W:Lrr;

    .line 295
    .line 296
    iget-object v5, v4, Lrr;->a:Ljava/lang/Object;

    .line 297
    .line 298
    monitor-enter v5

    .line 299
    :try_start_0
    iput-object v1, v4, Lrr;->l:Ljava/util/HashMap;

    .line 300
    .line 301
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 302
    iget-object v1, p0, Lxn;->W:Lrr;

    .line 303
    .line 304
    invoke-virtual {v0}, Leb2;->b()Lfb2;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    iget-object v4, p0, Lxn;->U:Landroid/hardware/camera2/CameraDevice;

    .line 309
    .line 310
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    iget-object v5, p0, Lxn;->j0:Lxy1;

    .line 314
    .line 315
    new-instance v6, Lgk2;

    .line 316
    .line 317
    iget-object v7, v5, Lxy1;->f:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v7, Ler0;

    .line 320
    .line 321
    iget-object v8, v5, Lxy1;->b:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v8, Ler0;

    .line 324
    .line 325
    iget-object v9, v5, Lxy1;->e:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v9, Lqi1;

    .line 328
    .line 329
    iget-object v10, v5, Lxy1;->a:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v10, Ly92;

    .line 332
    .line 333
    iget-object v11, v5, Lxy1;->c:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v11, Lnt0;

    .line 336
    .line 337
    iget-object v5, v5, Lxy1;->d:Ljava/lang/Object;

    .line 338
    .line 339
    move-object v12, v5

    .line 340
    check-cast v12, Landroid/os/Handler;

    .line 341
    .line 342
    invoke-direct/range {v6 .. v12}, Lgk2;-><init>(Ler0;Ler0;Lqi1;Ly92;Lnt0;Landroid/os/Handler;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v1, v0, v4, v6}, Lrr;->i(Lfb2;Landroid/hardware/camera2/CameraDevice;Lgk2;)Ls81;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    new-instance v4, Lrn;

    .line 350
    .line 351
    invoke-direct {v4, p0, v1, v3}, Lrn;-><init>(Lxn;Lrr;I)V

    .line 352
    .line 353
    .line 354
    iget-object p0, p0, Lxn;->c:Ly92;

    .line 355
    .line 356
    new-instance v1, Ldp0;

    .line 357
    .line 358
    invoke-direct {v1, v2, v0, v4}, Ldp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    invoke-interface {v0, v1, p0}, Ls81;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 362
    .line 363
    .line 364
    return-void

    .line 365
    :catchall_0
    move-exception v0

    .line 366
    move-object p0, v0

    .line 367
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 368
    throw p0

    .line 369
    :cond_7
    const-string v0, "Unable to create capture session due to conflicting configurations"

    .line 370
    .line 371
    invoke-virtual {p0, v0}, Lxn;->s(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    return-void
.end method

.method public final B()V
    .locals 6

    .line 1
    iget-object v0, p0, Lxn;->h0:Lqi1;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "MeteringRepeating"

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lxn;->h0:Lqi1;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lxn;->h0:Lqi1;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v2, p0, Lxn;->a:Lfs0;

    .line 31
    .line 32
    iget-object v3, v2, Lfs0;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 35
    .line 36
    invoke-interface {v3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/4 v5, 0x0

    .line 41
    if-nez v4, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v3, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Lxy2;

    .line 49
    .line 50
    iput-boolean v5, v4, Lxy2;->e:Z

    .line 51
    .line 52
    iget-boolean v4, v4, Lxy2;->f:Z

    .line 53
    .line 54
    if-nez v4, :cond_1

    .line 55
    .line 56
    invoke-interface {v3, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object v3, p0, Lxn;->h0:Lqi1;

    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v3, p0, Lxn;->h0:Lqi1;

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object v2, v2, Lfs0;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 85
    .line 86
    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-nez v3, :cond_2

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, Lxy2;

    .line 98
    .line 99
    iput-boolean v5, v3, Lxy2;->f:Z

    .line 100
    .line 101
    iget-boolean v3, v3, Lxy2;->e:Z

    .line 102
    .line 103
    if-nez v3, :cond_3

    .line 104
    .line 105
    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    :cond_3
    :goto_1
    iget-object v0, p0, Lxn;->h0:Lqi1;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-static {v1}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    iget-object v1, v0, Lqi1;->a:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v1, Luw0;

    .line 119
    .line 120
    if-eqz v1, :cond_4

    .line 121
    .line 122
    invoke-virtual {v1}, Ld70;->a()V

    .line 123
    .line 124
    .line 125
    :cond_4
    const/4 v1, 0x0

    .line 126
    iput-object v1, v0, Lqi1;->a:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object v1, p0, Lxn;->h0:Lqi1;

    .line 129
    .line 130
    :cond_5
    return-void
.end method

.method public final C()V
    .locals 6

    .line 1
    iget-object v0, p0, Lxn;->W:Lrr;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    const/4 v3, 0x0

    .line 11
    invoke-static {v3, v0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    const-string v0, "Resetting Capture Session"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lxn;->s(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lxn;->W:Lrr;

    .line 20
    .line 21
    iget-object v3, v0, Lrr;->a:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v3

    .line 24
    :try_start_0
    iget-object v4, v0, Lrr;->f:Lfb2;

    .line 25
    .line 26
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 27
    iget-object v5, v0, Lrr;->a:Ljava/lang/Object;

    .line 28
    .line 29
    monitor-enter v5

    .line 30
    :try_start_1
    iget-object v3, v0, Lrr;->b:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    invoke-virtual {p0}, Lxn;->y()Lrr;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    iput-object v5, p0, Lxn;->W:Lrr;

    .line 42
    .line 43
    invoke-virtual {v5, v4}, Lrr;->k(Lfb2;)V

    .line 44
    .line 45
    .line 46
    iget-object v4, p0, Lxn;->W:Lrr;

    .line 47
    .line 48
    invoke-virtual {v4, v3}, Lrr;->g(Ljava/util/List;)V

    .line 49
    .line 50
    .line 51
    iget v3, p0, Lxn;->s0:I

    .line 52
    .line 53
    invoke-static {v3}, Len;->y(I)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    const/16 v4, 0x8

    .line 58
    .line 59
    if-eq v3, v4, :cond_1

    .line 60
    .line 61
    new-instance v3, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v4, "Skipping Capture Session state check due to current camera state: "

    .line 64
    .line 65
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget v4, p0, Lxn;->s0:I

    .line 69
    .line 70
    invoke-static {v4}, Len;->A(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v4, " and previous session status: "

    .line 78
    .line 79
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Lrr;->e()Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {p0, v3}, Lxn;->s(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    iget-boolean v3, p0, Lxn;->c0:Z

    .line 98
    .line 99
    if-eqz v3, :cond_2

    .line 100
    .line 101
    invoke-virtual {v0}, Lrr;->e()Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_2

    .line 106
    .line 107
    const-string v3, "Close camera before creating new session"

    .line 108
    .line 109
    invoke-virtual {p0, v3}, Lxn;->s(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const/4 v3, 0x6

    .line 113
    invoke-virtual {p0, v3}, Lxn;->E(I)V

    .line 114
    .line 115
    .line 116
    :cond_2
    :goto_1
    iget-boolean v3, p0, Lxn;->d0:Z

    .line 117
    .line 118
    if-eqz v3, :cond_3

    .line 119
    .line 120
    invoke-virtual {v0}, Lrr;->e()Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-eqz v3, :cond_3

    .line 125
    .line 126
    const-string v3, "ConfigAndClose is required when close the camera."

    .line 127
    .line 128
    invoke-virtual {p0, v3}, Lxn;->s(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    iput-boolean v2, p0, Lxn;->e0:Z

    .line 132
    .line 133
    :cond_3
    invoke-virtual {v0}, Lrr;->a()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Lrr;->j()Ls81;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    iget v3, p0, Lxn;->s0:I

    .line 141
    .line 142
    invoke-static {v3}, Len;->v(I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    const-string v4, "Releasing session in state "

    .line 147
    .line 148
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-virtual {p0, v3}, Lxn;->s(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iget-object v3, p0, Lxn;->X:Ljava/util/LinkedHashMap;

    .line 156
    .line 157
    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    new-instance v3, Lrn;

    .line 161
    .line 162
    invoke-direct {v3, p0, v0, v1}, Lrn;-><init>(Lxn;Lrr;I)V

    .line 163
    .line 164
    .line 165
    invoke-static {}, Lpg3;->g()Lo80;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    new-instance v0, Ldp0;

    .line 170
    .line 171
    invoke-direct {v0, v1, v2, v3}, Ldp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-interface {v2, v0, p0}, Ls81;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :catchall_0
    move-exception p0

    .line 179
    :try_start_2
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 180
    throw p0

    .line 181
    :catchall_1
    move-exception p0

    .line 182
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 183
    throw p0
.end method

.method public final D(ILff;Z)V
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Transitioning camera internal state: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lxn;->s0:I

    .line 9
    .line 10
    invoke-static {v1}, Len;->A(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, " --> "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Len;->A(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p0, v0}, Lxn;->s(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "]"

    .line 37
    .line 38
    invoke-static {}, Lj13;->m()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x0

    .line 43
    const/4 v3, 0x1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    new-instance v1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v4, "CX:C2State["

    .line 49
    .line 50
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {p1}, Len;->y(I)I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    invoke-static {v4, v1}, Lj13;->v(ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    if-eqz p2, :cond_0

    .line 71
    .line 72
    iget v1, p0, Lxn;->Y:I

    .line 73
    .line 74
    add-int/2addr v1, v3

    .line 75
    iput v1, p0, Lxn;->Y:I

    .line 76
    .line 77
    :cond_0
    iget v1, p0, Lxn;->Y:I

    .line 78
    .line 79
    if-lez v1, :cond_2

    .line 80
    .line 81
    new-instance v1, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    const-string v4, "CX:C2StateErrorCode["

    .line 84
    .line 85
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-eqz p2, :cond_1

    .line 99
    .line 100
    iget v1, p2, Lff;->a:I

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    move v1, v2

    .line 104
    :goto_0
    invoke-static {v1, v0}, Lj13;->v(ILjava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :cond_2
    iput p1, p0, Lxn;->s0:I

    .line 108
    .line 109
    invoke-static {p1}, Len;->y(I)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    packed-switch v0, :pswitch_data_0

    .line 114
    .line 115
    .line 116
    invoke-static {p1}, Len;->A(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    const-string p1, "Unknown state: "

    .line 121
    .line 122
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :pswitch_0
    sget-object p1, Lyp;->w:Lyp;

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :pswitch_1
    sget-object p1, Lyp;->v:Lyp;

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :pswitch_2
    sget-object p1, Lyp;->i:Lyp;

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :pswitch_3
    sget-object p1, Lyp;->f:Lyp;

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :pswitch_4
    sget-object p1, Lyp;->e:Lyp;

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :pswitch_5
    sget-object p1, Lyp;->d:Lyp;

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :pswitch_6
    sget-object p1, Lyp;->c:Lyp;

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :pswitch_7
    sget-object p1, Lyp;->b:Lyp;

    .line 152
    .line 153
    :goto_1
    iget-object v0, p0, Lxn;->b0:Llq;

    .line 154
    .line 155
    iget-object v1, v0, Llq;->b:Ljava/lang/Object;

    .line 156
    .line 157
    monitor-enter v1

    .line 158
    :try_start_0
    iget v4, v0, Llq;->f:I

    .line 159
    .line 160
    sget-object v5, Lyp;->b:Lyp;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    .line 162
    iget-object v6, v0, Llq;->e:Ljava/util/HashMap;

    .line 163
    .line 164
    const/4 v7, 0x0

    .line 165
    if-ne p1, v5, :cond_4

    .line 166
    .line 167
    :try_start_1
    invoke-virtual {v6, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    check-cast v2, Lkq;

    .line 172
    .line 173
    if-eqz v2, :cond_3

    .line 174
    .line 175
    invoke-virtual {v0}, Llq;->b()V

    .line 176
    .line 177
    .line 178
    iget-object v2, v2, Lkq;->a:Lyp;

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_3
    move-object v2, v7

    .line 182
    goto :goto_2

    .line 183
    :cond_4
    invoke-virtual {v6, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    check-cast v5, Lkq;

    .line 188
    .line 189
    const-string v6, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()"

    .line 190
    .line 191
    invoke-static {v5, v6}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    iget-object v6, v5, Lkq;->a:Lyp;

    .line 195
    .line 196
    iput-object p1, v5, Lkq;->a:Lyp;

    .line 197
    .line 198
    sget-object v5, Lyp;->i:Lyp;

    .line 199
    .line 200
    if-ne p1, v5, :cond_7

    .line 201
    .line 202
    iget-boolean v8, p1, Lyp;->a:Z

    .line 203
    .line 204
    if-nez v8, :cond_5

    .line 205
    .line 206
    if-ne v6, v5, :cond_6

    .line 207
    .line 208
    :cond_5
    move v2, v3

    .line 209
    :cond_6
    const-string v5, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()"

    .line 210
    .line 211
    invoke-static {v5, v2}, Lde3;->j(Ljava/lang/String;Z)V

    .line 212
    .line 213
    .line 214
    :cond_7
    if-eq v6, p1, :cond_8

    .line 215
    .line 216
    invoke-static {p0, p1}, Llq;->c(Lxn;Lyp;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0}, Llq;->b()V

    .line 220
    .line 221
    .line 222
    :cond_8
    move-object v2, v6

    .line 223
    :goto_2
    const/4 v5, 0x2

    .line 224
    if-ne v2, p1, :cond_9

    .line 225
    .line 226
    monitor-exit v1

    .line 227
    goto/16 :goto_7

    .line 228
    .line 229
    :catchall_0
    move-exception p0

    .line 230
    goto/16 :goto_a

    .line 231
    .line 232
    :cond_9
    iget-object v2, v0, Llq;->d:Lkn;

    .line 233
    .line 234
    iget v2, v2, Lkn;->b:I

    .line 235
    .line 236
    if-ne v2, v5, :cond_a

    .line 237
    .line 238
    sget-object v2, Lyp;->w:Lyp;

    .line 239
    .line 240
    if-ne p1, v2, :cond_a

    .line 241
    .line 242
    invoke-virtual {p0}, Lxn;->m()Lxp;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    invoke-interface {v2}, Lxp;->b()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    iget-object v6, v0, Llq;->d:Lkn;

    .line 251
    .line 252
    invoke-virtual {v6, v2}, Lkn;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    if-eqz v2, :cond_a

    .line 257
    .line 258
    invoke-virtual {v0, v2}, Llq;->a(Ljava/lang/String;)Lkq;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    goto :goto_3

    .line 263
    :cond_a
    move-object v2, v7

    .line 264
    :goto_3
    if-ge v4, v3, :cond_c

    .line 265
    .line 266
    iget v4, v0, Llq;->f:I

    .line 267
    .line 268
    if-lez v4, :cond_c

    .line 269
    .line 270
    new-instance v4, Ljava/util/HashMap;

    .line 271
    .line 272
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 273
    .line 274
    .line 275
    iget-object v0, v0, Llq;->e:Ljava/util/HashMap;

    .line 276
    .line 277
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    :cond_b
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    if-eqz v6, :cond_e

    .line 290
    .line 291
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    check-cast v6, Ljava/util/Map$Entry;

    .line 296
    .line 297
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v8

    .line 301
    check-cast v8, Lkq;

    .line 302
    .line 303
    iget-object v8, v8, Lkq;->a:Lyp;

    .line 304
    .line 305
    sget-object v9, Lyp;->e:Lyp;

    .line 306
    .line 307
    if-ne v8, v9, :cond_b

    .line 308
    .line 309
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v8

    .line 313
    check-cast v8, Lko;

    .line 314
    .line 315
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v6

    .line 319
    check-cast v6, Lkq;

    .line 320
    .line 321
    invoke-virtual {v4, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    goto :goto_4

    .line 325
    :cond_c
    sget-object v4, Lyp;->e:Lyp;

    .line 326
    .line 327
    if-ne p1, v4, :cond_d

    .line 328
    .line 329
    iget v4, v0, Llq;->f:I

    .line 330
    .line 331
    if-lez v4, :cond_d

    .line 332
    .line 333
    new-instance v4, Ljava/util/HashMap;

    .line 334
    .line 335
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 336
    .line 337
    .line 338
    iget-object v0, v0, Llq;->e:Ljava/util/HashMap;

    .line 339
    .line 340
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    check-cast v0, Lkq;

    .line 345
    .line 346
    invoke-virtual {v4, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    goto :goto_5

    .line 350
    :cond_d
    move-object v4, v7

    .line 351
    :cond_e
    :goto_5
    if-eqz v4, :cond_f

    .line 352
    .line 353
    if-nez p3, :cond_f

    .line 354
    .line 355
    invoke-interface {v4, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    :cond_f
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 359
    if-eqz v4, :cond_10

    .line 360
    .line 361
    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 362
    .line 363
    .line 364
    move-result-object p3

    .line 365
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 366
    .line 367
    .line 368
    move-result-object p3

    .line 369
    :goto_6
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    if-eqz v0, :cond_10

    .line 374
    .line 375
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    check-cast v0, Lkq;

    .line 380
    .line 381
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    :try_start_2
    iget-object v1, v0, Lkq;->b:Ly92;

    .line 385
    .line 386
    iget-object v0, v0, Lkq;->d:Lsn;

    .line 387
    .line 388
    new-instance v4, Ls2;

    .line 389
    .line 390
    const/4 v6, 0x6

    .line 391
    invoke-direct {v4, v0, v6}, Ls2;-><init>(Ljava/lang/Object;I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1, v4}, Ly92;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_2 .. :try_end_2} :catch_0

    .line 395
    .line 396
    .line 397
    goto :goto_6

    .line 398
    :catch_0
    move-exception v0

    .line 399
    const-string v1, "CameraStateRegistry"

    .line 400
    .line 401
    const-string v4, "Unable to notify camera to open."

    .line 402
    .line 403
    invoke-static {v1, v4, v0}, Lhu0;->U(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 404
    .line 405
    .line 406
    goto :goto_6

    .line 407
    :cond_10
    if-eqz v2, :cond_11

    .line 408
    .line 409
    :try_start_3
    iget-object p3, v2, Lkq;->b:Ly92;

    .line 410
    .line 411
    iget-object v0, v2, Lkq;->c:Ld52;

    .line 412
    .line 413
    new-instance v1, Ls2;

    .line 414
    .line 415
    const/4 v2, 0x7

    .line 416
    invoke-direct {v1, v0, v2}, Ls2;-><init>(Ljava/lang/Object;I)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {p3, v1}, Ly92;->execute(Ljava/lang/Runnable;)V
    :try_end_3
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_3 .. :try_end_3} :catch_1

    .line 420
    .line 421
    .line 422
    goto :goto_7

    .line 423
    :catch_1
    move-exception p3

    .line 424
    const-string v0, "CameraStateRegistry"

    .line 425
    .line 426
    const-string v1, "Unable to notify camera to configure."

    .line 427
    .line 428
    invoke-static {v0, v1, p3}, Lhu0;->U(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 429
    .line 430
    .line 431
    :cond_11
    :goto_7
    iget-object p3, p0, Lxn;->e:Lfs0;

    .line 432
    .line 433
    iget-object p3, p3, Lfs0;->b:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast p3, Lrk1;

    .line 436
    .line 437
    new-instance v0, Ler0;

    .line 438
    .line 439
    const/4 v1, 0x5

    .line 440
    invoke-direct {v0, p1, v1}, Ler0;-><init>(Ljava/lang/Object;I)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {p3, v0}, Lrk1;->k(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    iget-object p0, p0, Lxn;->f:Lcb;

    .line 447
    .line 448
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 452
    .line 453
    .line 454
    move-result p3

    .line 455
    packed-switch p3, :pswitch_data_1

    .line 456
    .line 457
    .line 458
    const-string p0, "Unknown internal camera state: "

    .line 459
    .line 460
    invoke-static {p1, p0}, Lds0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    return-void

    .line 464
    :pswitch_8
    new-instance p3, Lef;

    .line 465
    .line 466
    const/4 v0, 0x3

    .line 467
    invoke-direct {p3, v0, p2}, Lef;-><init>(ILff;)V

    .line 468
    .line 469
    .line 470
    goto :goto_9

    .line 471
    :pswitch_9
    new-instance p3, Lef;

    .line 472
    .line 473
    invoke-direct {p3, v5, p2}, Lef;-><init>(ILff;)V

    .line 474
    .line 475
    .line 476
    goto :goto_9

    .line 477
    :pswitch_a
    iget-object p3, p0, Lcb;->b:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast p3, Llq;

    .line 480
    .line 481
    iget-object v0, p3, Llq;->b:Ljava/lang/Object;

    .line 482
    .line 483
    monitor-enter v0

    .line 484
    :try_start_4
    iget-object p3, p3, Llq;->e:Ljava/util/HashMap;

    .line 485
    .line 486
    invoke-virtual {p3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 487
    .line 488
    .line 489
    move-result-object p3

    .line 490
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 491
    .line 492
    .line 493
    move-result-object p3

    .line 494
    :cond_12
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 495
    .line 496
    .line 497
    move-result v1

    .line 498
    if-eqz v1, :cond_13

    .line 499
    .line 500
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    check-cast v1, Ljava/util/Map$Entry;

    .line 505
    .line 506
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    check-cast v1, Lkq;

    .line 511
    .line 512
    iget-object v1, v1, Lkq;->a:Lyp;

    .line 513
    .line 514
    sget-object v2, Lyp;->f:Lyp;

    .line 515
    .line 516
    if-ne v1, v2, :cond_12

    .line 517
    .line 518
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 519
    new-instance p3, Lef;

    .line 520
    .line 521
    invoke-direct {p3, v5, v7}, Lef;-><init>(ILff;)V

    .line 522
    .line 523
    .line 524
    goto :goto_9

    .line 525
    :catchall_1
    move-exception p0

    .line 526
    goto :goto_8

    .line 527
    :cond_13
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 528
    new-instance p3, Lef;

    .line 529
    .line 530
    invoke-direct {p3, v3, v7}, Lef;-><init>(ILff;)V

    .line 531
    .line 532
    .line 533
    goto :goto_9

    .line 534
    :goto_8
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 535
    throw p0

    .line 536
    :pswitch_b
    new-instance p3, Lef;

    .line 537
    .line 538
    const/4 v0, 0x4

    .line 539
    invoke-direct {p3, v0, p2}, Lef;-><init>(ILff;)V

    .line 540
    .line 541
    .line 542
    goto :goto_9

    .line 543
    :pswitch_c
    new-instance p3, Lef;

    .line 544
    .line 545
    invoke-direct {p3, v1, p2}, Lef;-><init>(ILff;)V

    .line 546
    .line 547
    .line 548
    :goto_9
    const-string v0, "CameraStateMachine"

    .line 549
    .line 550
    invoke-virtual {p3}, Lef;->toString()Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    invoke-static {v0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    iget-object p1, p0, Lcb;->c:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast p1, Lrk1;

    .line 565
    .line 566
    invoke-virtual {p1}, La91;->d()Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object p1

    .line 570
    check-cast p1, Lef;

    .line 571
    .line 572
    invoke-static {p1, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-result p1

    .line 576
    if-nez p1, :cond_14

    .line 577
    .line 578
    const-string p1, "CameraStateMachine"

    .line 579
    .line 580
    invoke-virtual {p3}, Lef;->toString()Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    invoke-static {p1}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    iget-object p0, p0, Lcb;->c:Ljava/lang/Object;

    .line 587
    .line 588
    check-cast p0, Lrk1;

    .line 589
    .line 590
    invoke-virtual {p0, p3}, Lrk1;->k(Ljava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    :cond_14
    return-void

    .line 594
    :goto_a
    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 595
    throw p0

    .line 596
    nop

    .line 597
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_c
        :pswitch_a
        :pswitch_b
        :pswitch_9
        :pswitch_8
        :pswitch_8
    .end packed-switch
.end method

.method public final E(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, p1, v0, v1}, Lxn;->D(ILff;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final F(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 11

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lwy2;

    .line 21
    .line 22
    iget-boolean v2, p0, Lxn;->g0:Z

    .line 23
    .line 24
    invoke-static {v1}, Lxn;->w(Lwy2;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    iget-object v2, v1, Lwy2;->m:Lfb2;

    .line 35
    .line 36
    :goto_1
    move-object v6, v2

    .line 37
    goto :goto_2

    .line 38
    :cond_0
    iget-object v2, v1, Lwy2;->n:Lfb2;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :goto_2
    iget-object v7, v1, Lwy2;->f:Lzy2;

    .line 42
    .line 43
    iget-object v9, v1, Lwy2;->g:Lpg;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    if-eqz v9, :cond_1

    .line 47
    .line 48
    iget-object v3, v9, Lpg;->a:Landroid/util/Size;

    .line 49
    .line 50
    move-object v8, v3

    .line 51
    goto :goto_3

    .line 52
    :cond_1
    move-object v8, v2

    .line 53
    :goto_3
    invoke-virtual {v1}, Lwy2;->b()Lzp;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-nez v3, :cond_2

    .line 58
    .line 59
    :goto_4
    move-object v10, v2

    .line 60
    goto :goto_5

    .line 61
    :cond_2
    invoke-static {v1}, Llh2;->F(Lwy2;)Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    goto :goto_4

    .line 66
    :goto_5
    new-instance v3, Ldf;

    .line 67
    .line 68
    invoke-direct/range {v3 .. v10}, Ldf;-><init>(Ljava/lang/String;Ljava/lang/Class;Lfb2;Lzy2;Landroid/util/Size;Lpg;Ljava/util/ArrayList;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    return-object v0
.end method

.method public final G(Ljava/util/ArrayList;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lxn;->a:Lfs0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lfs0;->n()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v2, 0x0

    .line 21
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v4, 0x1

    .line 26
    if-eqz v3, :cond_2

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ldf;

    .line 33
    .line 34
    iget-object v5, p0, Lxn;->a:Lfs0;

    .line 35
    .line 36
    iget-object v6, v3, Ldf;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v5, v6}, Lfs0;->t(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-nez v5, :cond_0

    .line 43
    .line 44
    iget-object v6, p0, Lxn;->a:Lfs0;

    .line 45
    .line 46
    iget-object v7, v3, Ldf;->a:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v8, v3, Ldf;->c:Lfb2;

    .line 49
    .line 50
    iget-object v9, v3, Ldf;->d:Lzy2;

    .line 51
    .line 52
    iget-object v10, v3, Ldf;->f:Lpg;

    .line 53
    .line 54
    iget-object v11, v3, Ldf;->g:Ljava/util/List;

    .line 55
    .line 56
    iget-object v5, v6, Lfs0;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v5, Ljava/util/LinkedHashMap;

    .line 59
    .line 60
    invoke-virtual {v5, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    check-cast v12, Lxy2;

    .line 65
    .line 66
    if-nez v12, :cond_1

    .line 67
    .line 68
    new-instance v12, Lxy2;

    .line 69
    .line 70
    invoke-direct {v12, v8, v9, v10, v11}, Lxy2;-><init>(Lfb2;Lzy2;Lpg;Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v5, v7, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    :cond_1
    iput-boolean v4, v12, Lxy2;->e:Z

    .line 77
    .line 78
    invoke-virtual/range {v6 .. v11}, Lfs0;->x(Ljava/lang/String;Lfb2;Lzy2;Lpg;Ljava/util/List;)V

    .line 79
    .line 80
    .line 81
    iget-object v4, v3, Ldf;->a:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    iget-object v4, v3, Ldf;->b:Ljava/lang/Class;

    .line 87
    .line 88
    const-class v5, Lvw1;

    .line 89
    .line 90
    if-ne v4, v5, :cond_0

    .line 91
    .line 92
    iget-object v3, v3, Ldf;->e:Landroid/util/Size;

    .line 93
    .line 94
    if-eqz v3, :cond_0

    .line 95
    .line 96
    new-instance v2, Landroid/util/Rational;

    .line 97
    .line 98
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    invoke-direct {v2, v4, v3}, Landroid/util/Rational;-><init>(II)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_3

    .line 115
    .line 116
    goto/16 :goto_4

    .line 117
    .line 118
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string v3, "Use cases ["

    .line 121
    .line 122
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const-string v3, ", "

    .line 126
    .line 127
    invoke-static {v3, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v1, "] now ATTACHED"

    .line 135
    .line 136
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p0, p1}, Lxn;->s(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    if-eqz v0, :cond_4

    .line 147
    .line 148
    iget-object p1, p0, Lxn;->i:Ljn;

    .line 149
    .line 150
    invoke-virtual {p1, v4}, Ljn;->m(Z)V

    .line 151
    .line 152
    .line 153
    iget-object p1, p0, Lxn;->i:Ljn;

    .line 154
    .line 155
    iget-object v1, p1, Ljn;->d:Ljava/lang/Object;

    .line 156
    .line 157
    monitor-enter v1

    .line 158
    :try_start_0
    iget v0, p1, Ljn;->p:I

    .line 159
    .line 160
    add-int/2addr v0, v4

    .line 161
    iput v0, p1, Ljn;->p:I

    .line 162
    .line 163
    monitor-exit v1

    .line 164
    goto :goto_1

    .line 165
    :catchall_0
    move-exception v0

    .line 166
    move-object p0, v0

    .line 167
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    throw p0

    .line 169
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lxn;->o()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, Lxn;->K()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0}, Lxn;->J()V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Lxn;->C()V

    .line 179
    .line 180
    .line 181
    iget p1, p0, Lxn;->s0:I

    .line 182
    .line 183
    const/16 v0, 0x9

    .line 184
    .line 185
    if-ne p1, v0, :cond_5

    .line 186
    .line 187
    invoke-virtual {p0}, Lxn;->A()V

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_5
    iget p1, p0, Lxn;->s0:I

    .line 192
    .line 193
    invoke-static {p1}, Len;->y(I)I

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    const/4 v1, 0x2

    .line 198
    const/4 v3, 0x0

    .line 199
    if-eq p1, v1, :cond_8

    .line 200
    .line 201
    const/4 v1, 0x3

    .line 202
    if-eq p1, v1, :cond_8

    .line 203
    .line 204
    const/4 v1, 0x4

    .line 205
    if-eq p1, v1, :cond_6

    .line 206
    .line 207
    iget p1, p0, Lxn;->s0:I

    .line 208
    .line 209
    invoke-static {p1}, Len;->A(I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    const-string v0, "open() ignored due to being in state: "

    .line 214
    .line 215
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-virtual {p0, p1}, Lxn;->s(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_6
    const/4 p1, 0x7

    .line 224
    invoke-virtual {p0, p1}, Lxn;->E(I)V

    .line 225
    .line 226
    .line 227
    iget-object p1, p0, Lxn;->X:Ljava/util/LinkedHashMap;

    .line 228
    .line 229
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 230
    .line 231
    .line 232
    move-result p1

    .line 233
    if-nez p1, :cond_9

    .line 234
    .line 235
    iget-boolean p1, p0, Lxn;->f0:Z

    .line 236
    .line 237
    if-nez p1, :cond_9

    .line 238
    .line 239
    iget p1, p0, Lxn;->V:I

    .line 240
    .line 241
    if-nez p1, :cond_9

    .line 242
    .line 243
    iget-object p1, p0, Lxn;->U:Landroid/hardware/camera2/CameraDevice;

    .line 244
    .line 245
    if-eqz p1, :cond_7

    .line 246
    .line 247
    goto :goto_2

    .line 248
    :cond_7
    move v4, v3

    .line 249
    :goto_2
    const-string p1, "Camera Device should be open if session close is not complete"

    .line 250
    .line 251
    invoke-static {p1, v4}, Lde3;->j(Ljava/lang/String;Z)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p0, v0}, Lxn;->E(I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0}, Lxn;->A()V

    .line 258
    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_8
    invoke-virtual {p0, v3}, Lxn;->H(Z)V

    .line 262
    .line 263
    .line 264
    :cond_9
    :goto_3
    if-eqz v2, :cond_a

    .line 265
    .line 266
    iget-object p0, p0, Lxn;->i:Ljn;

    .line 267
    .line 268
    iget-object p0, p0, Ljn;->h:Lfl0;

    .line 269
    .line 270
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    :cond_a
    :goto_4
    return-void
.end method

.method public final H(Z)V
    .locals 1

    .line 1
    const-string v0, "Attempting to force open the camera."

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lxn;->s(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lxn;->b0:Llq;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Llq;->d(Lxn;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-string p1, "No cameras available. Waiting for available camera before opening camera."

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lxn;->s(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x4

    .line 20
    invoke-virtual {p0, p1}, Lxn;->E(I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-virtual {p0, p1}, Lxn;->z(Z)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final I(Z)V
    .locals 1

    .line 1
    const-string v0, "Attempting to open the camera."

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lxn;->s(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lxn;->Z:Lsn;

    .line 7
    .line 8
    iget-boolean v0, v0, Lsn;->b:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lxn;->b0:Llq;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Llq;->d(Lxn;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lxn;->z(Z)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p1, "No cameras available. Waiting for available camera before opening camera."

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lxn;->s(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x4

    .line 30
    invoke-virtual {p0, p1}, Lxn;->E(I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final J()V
    .locals 6

    .line 1
    iget-object v0, p0, Lxn;->a:Lfs0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Leb2;

    .line 7
    .line 8
    invoke-direct {v1}, Leb2;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lfs0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/util/Map$Entry;

    .line 39
    .line 40
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Lxy2;

    .line 45
    .line 46
    iget-boolean v5, v4, Lxy2;->f:Z

    .line 47
    .line 48
    if-eqz v5, :cond_0

    .line 49
    .line 50
    iget-boolean v5, v4, Lxy2;->e:Z

    .line 51
    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Ljava/lang/String;

    .line 59
    .line 60
    iget-object v4, v4, Lxy2;->a:Lfb2;

    .line 61
    .line 62
    invoke-virtual {v1, v4}, Leb2;->a(Lfb2;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    const-string v0, "UseCaseAttachState"

    .line 73
    .line 74
    invoke-static {v0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    iget-boolean v0, v1, Leb2;->k:Z

    .line 78
    .line 79
    iget-object v2, p0, Lxn;->i:Ljn;

    .line 80
    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    iget-boolean v0, v1, Leb2;->j:Z

    .line 84
    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    invoke-virtual {v1}, Leb2;->b()Lfb2;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object v0, v0, Lfb2;->g:Ljr;

    .line 92
    .line 93
    iget v0, v0, Ljr;->c:I

    .line 94
    .line 95
    iput v0, v2, Ljn;->v:I

    .line 96
    .line 97
    iget-object v3, v2, Ljn;->h:Lfl0;

    .line 98
    .line 99
    iput v0, v3, Lfl0;->c:I

    .line 100
    .line 101
    iget-object v0, v2, Ljn;->n:Lxt0;

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Ljn;->j()Lfb2;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v1, v0}, Leb2;->a(Lfb2;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Leb2;->b()Lfb2;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iget-object p0, p0, Lxn;->W:Lrr;

    .line 118
    .line 119
    invoke-virtual {p0, v0}, Lrr;->k(Lfb2;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_2
    const/4 v0, 0x1

    .line 124
    iput v0, v2, Ljn;->v:I

    .line 125
    .line 126
    iget-object v1, v2, Ljn;->h:Lfl0;

    .line 127
    .line 128
    iput v0, v1, Lfl0;->c:I

    .line 129
    .line 130
    iget-object v0, v2, Ljn;->n:Lxt0;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    iget-object p0, p0, Lxn;->W:Lrr;

    .line 136
    .line 137
    invoke-virtual {v2}, Ljn;->j()Lfb2;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {p0, v0}, Lrr;->k(Lfb2;)V

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method public final K()V
    .locals 5

    .line 1
    iget-object v0, p0, Lxn;->a:Lfs0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lfs0;->o()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lzy2;

    .line 23
    .line 24
    sget-object v3, Lzy2;->M:Llf;

    .line 25
    .line 26
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-interface {v2, v3, v4}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    or-int/2addr v1, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object p0, p0, Lxn;->i:Ljn;

    .line 41
    .line 42
    iget-object p0, p0, Ljn;->l:Lzr0;

    .line 43
    .line 44
    iput-boolean v1, p0, Lzr0;->a:Z

    .line 45
    .line 46
    return-void
.end method

.method public final b(Lwy2;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lxn;->g0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Lwy2;->m:Lfb2;

    .line 6
    .line 7
    :goto_0
    move-object v4, v0

    .line 8
    goto :goto_1

    .line 9
    :cond_0
    iget-object v0, p1, Lwy2;->n:Lfb2;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :goto_1
    iget-object v5, p1, Lwy2;->f:Lzy2;

    .line 13
    .line 14
    iget-object v6, p1, Lwy2;->g:Lpg;

    .line 15
    .line 16
    invoke-virtual {p1}, Lwy2;->b()Lzp;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    :goto_2
    move-object v7, v0

    .line 24
    goto :goto_3

    .line 25
    :cond_1
    invoke-static {p1}, Llh2;->F(Lwy2;)Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_2

    .line 30
    :goto_3
    invoke-static {p1}, Lxn;->w(Lwy2;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    new-instance v1, Lon;

    .line 35
    .line 36
    const/4 v8, 0x0

    .line 37
    move-object v2, p0

    .line 38
    invoke-direct/range {v1 .. v8}, Lon;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    iget-object p0, v2, Lxn;->c:Ly92;

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Ly92;->execute(Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final c(Ljp;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    sget-object p1, Lkp;->a:Ljp;

    .line 5
    .line 6
    :goto_0
    invoke-interface {p1}, Lhp;->u()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lxn;->l0:Lhp;

    .line 10
    .line 11
    iget-object p0, p0, Lxn;->m0:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter p0

    .line 14
    :try_start_0
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p1
.end method

.method public final d(Lwy2;)V
    .locals 8

    .line 1
    invoke-static {p1}, Lxn;->w(Lwy2;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    iget-boolean v0, p0, Lxn;->g0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p1, Lwy2;->m:Lfb2;

    .line 10
    .line 11
    :goto_0
    move-object v3, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    iget-object v0, p1, Lwy2;->n:Lfb2;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :goto_1
    iget-object v4, p1, Lwy2;->f:Lzy2;

    .line 17
    .line 18
    iget-object v5, p1, Lwy2;->g:Lpg;

    .line 19
    .line 20
    invoke-virtual {p1}, Lwy2;->b()Lzp;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    :goto_2
    move-object v6, p1

    .line 28
    goto :goto_3

    .line 29
    :cond_1
    invoke-static {p1}, Llh2;->F(Lwy2;)Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    goto :goto_2

    .line 34
    :goto_3
    new-instance v0, Lon;

    .line 35
    .line 36
    const/4 v7, 0x2

    .line 37
    move-object v1, p0

    .line 38
    invoke-direct/range {v0 .. v7}, Lon;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    iget-object p0, v1, Lxn;->c:Ly92;

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ly92;->execute(Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final e()Lnp;
    .locals 0

    .line 1
    iget-object p0, p0, Lxn;->i:Ljn;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f()Lhp;
    .locals 0

    .line 1
    iget-object p0, p0, Lxn;->l0:Lhp;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g(Lwy2;)V
    .locals 8

    .line 1
    invoke-static {p1}, Lxn;->w(Lwy2;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    iget-boolean v0, p0, Lxn;->g0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p1, Lwy2;->m:Lfb2;

    .line 10
    .line 11
    :goto_0
    move-object v3, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    iget-object v0, p1, Lwy2;->n:Lfb2;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :goto_1
    iget-object v4, p1, Lwy2;->f:Lzy2;

    .line 17
    .line 18
    iget-object v5, p1, Lwy2;->g:Lpg;

    .line 19
    .line 20
    invoke-virtual {p1}, Lwy2;->b()Lzp;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    :goto_2
    move-object v6, p1

    .line 28
    goto :goto_3

    .line 29
    :cond_1
    invoke-static {p1}, Llh2;->F(Lwy2;)Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    goto :goto_2

    .line 34
    :goto_3
    new-instance v0, Lon;

    .line 35
    .line 36
    const/4 v7, 0x1

    .line 37
    move-object v1, p0

    .line 38
    invoke-direct/range {v0 .. v7}, Lon;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    iget-object p0, v1, Lxn;->c:Ly92;

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ly92;->execute(Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final h(Z)V
    .locals 2

    .line 1
    new-instance v0, Lan;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1, p0, p1}, Lan;-><init>(ILjava/lang/Object;Z)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lxn;->c:Ly92;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ly92;->execute(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final i(Ljava/util/ArrayList;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lxn;->F(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lwy2;

    .line 42
    .line 43
    invoke-static {v1}, Lxn;->w(Lwy2;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iget-object v3, p0, Lxn;->k0:Ljava/util/HashSet;

    .line 48
    .line 49
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {v1}, Lwy2;->t()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    new-instance v0, Lnn;

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    invoke-direct {v0, p0, p1, v1}, Lnn;-><init>(Lxn;Ljava/util/ArrayList;I)V

    .line 67
    .line 68
    .line 69
    iget-object p0, p0, Lxn;->c:Ly92;

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Ly92;->execute(Ljava/lang/Runnable;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final j(Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lxn;->i:Ljn;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p1, v0, Ljn;->d:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter p1

    .line 18
    :try_start_0
    iget v2, v0, Ljn;->p:I

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    add-int/2addr v2, v3

    .line 22
    iput v2, v0, Ljn;->p:I

    .line 23
    .line 24
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lxn;->k0:Ljava/util/HashSet;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Lwy2;

    .line 47
    .line 48
    invoke-static {v4}, Lxn;->w(Lwy2;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v2, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Lwy2;->s()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4}, Lwy2;->q()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {p0, v1}, Lxn;->F(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 76
    .line 77
    .line 78
    :try_start_1
    iget-object v1, p0, Lxn;->c:Ly92;

    .line 79
    .line 80
    new-instance v2, Lnn;

    .line 81
    .line 82
    invoke-direct {v2, p0, p1, v3}, Lnn;-><init>(Lxn;Ljava/util/ArrayList;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v2}, Ly92;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :catch_0
    const-string p1, "Unable to attach use cases."

    .line 90
    .line 91
    invoke-virtual {p0, p1}, Lxn;->s(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljn;->i()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :catchall_0
    move-exception p0

    .line 99
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 100
    throw p0
.end method

.method public final l(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lxn;->g0:Z

    .line 2
    .line 3
    return-void
.end method

.method public final m()Lxp;
    .locals 0

    .line 1
    iget-object p0, p0, Lxn;->w:Lzn;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n(Lwy2;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lxn;->w(Lwy2;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lj8;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-direct {v0, v1, p0, p1}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lxn;->c:Ly92;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ly92;->execute(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final o()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lxn;->a:Lfs0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lfs0;->m()Leb2;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Leb2;->b()Lfb2;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, v2, Lfb2;->g:Ljr;

    .line 14
    .line 15
    iget-object v4, v3, Ljr;->a:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-virtual {v2}, Lfb2;->b()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    invoke-virtual {v2}, Lfb2;->b()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_10

    .line 42
    .line 43
    iget-object v2, v3, Ljr;->a:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    const/4 v3, 0x2

    .line 54
    const/4 v7, 0x1

    .line 55
    const-string v6, "Camera2CameraImpl"

    .line 56
    .line 57
    if-eqz v2, :cond_c

    .line 58
    .line 59
    iget-object v2, v0, Lxn;->h0:Lqi1;

    .line 60
    .line 61
    const/4 v8, 0x0

    .line 62
    if-nez v2, :cond_8

    .line 63
    .line 64
    new-instance v2, Lqi1;

    .line 65
    .line 66
    iget-object v4, v0, Lxn;->w:Lzn;

    .line 67
    .line 68
    iget-object v4, v4, Lzn;->b:Lgp;

    .line 69
    .line 70
    new-instance v5, Lmn;

    .line 71
    .line 72
    invoke-direct {v5, v0, v3}, Lmn;-><init>(Lxn;I)V

    .line 73
    .line 74
    .line 75
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 76
    .line 77
    .line 78
    new-instance v3, Lbj2;

    .line 79
    .line 80
    invoke-direct {v3}, Lbj2;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object v8, v2, Lqi1;->f:Ljava/lang/Object;

    .line 84
    .line 85
    new-instance v9, Lpi1;

    .line 86
    .line 87
    invoke-direct {v9}, Lpi1;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object v9, v2, Lqi1;->c:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object v5, v2, Lqi1;->e:Ljava/lang/Object;

    .line 93
    .line 94
    invoke-virtual {v4}, Lgp;->b()Lac1;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    const/16 v5, 0x22

    .line 99
    .line 100
    invoke-virtual {v4, v5}, Lac1;->r(I)[Landroid/util/Size;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    const-string v5, "MeteringRepeating"

    .line 105
    .line 106
    const/4 v9, 0x0

    .line 107
    if-nez v4, :cond_0

    .line 108
    .line 109
    const-string v3, "Can not get output size list."

    .line 110
    .line 111
    invoke-static {v5, v3}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    new-instance v3, Landroid/util/Size;

    .line 115
    .line 116
    invoke-direct {v3, v9, v9}, Landroid/util/Size;-><init>(II)V

    .line 117
    .line 118
    .line 119
    move-object/from16 v16, v5

    .line 120
    .line 121
    goto/16 :goto_3

    .line 122
    .line 123
    :cond_0
    iget-object v3, v3, Lbj2;->a:Landroidx/camera/camera2/internal/compat/quirk/RepeatingStreamConstraintForVideoRecordingQuirk;

    .line 124
    .line 125
    if-eqz v3, :cond_3

    .line 126
    .line 127
    const-string v3, "Huawei"

    .line 128
    .line 129
    sget-object v10, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v3, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_3

    .line 136
    .line 137
    const-string v3, "mha-l29"

    .line 138
    .line 139
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {v3, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-eqz v3, :cond_3

    .line 146
    .line 147
    new-instance v3, Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 150
    .line 151
    .line 152
    array-length v10, v4

    .line 153
    move v11, v9

    .line 154
    :goto_0
    if-ge v11, v10, :cond_2

    .line 155
    .line 156
    aget-object v12, v4, v11

    .line 157
    .line 158
    sget-object v13, Lbj2;->c:Lhx;

    .line 159
    .line 160
    sget-object v14, Lbj2;->b:Landroid/util/Size;

    .line 161
    .line 162
    invoke-virtual {v13, v12, v14}, Lhx;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 163
    .line 164
    .line 165
    move-result v13

    .line 166
    if-ltz v13, :cond_1

    .line 167
    .line 168
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    :cond_1
    add-int/lit8 v11, v11, 0x1

    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_2
    new-array v4, v9, [Landroid/util/Size;

    .line 175
    .line 176
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    move-object v4, v3

    .line 181
    check-cast v4, [Landroid/util/Size;

    .line 182
    .line 183
    :cond_3
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    new-instance v10, Lkl0;

    .line 188
    .line 189
    invoke-direct {v10, v7}, Lkl0;-><init>(I)V

    .line 190
    .line 191
    .line 192
    invoke-static {v3, v10}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 193
    .line 194
    .line 195
    iget-object v10, v0, Lxn;->o0:Lc90;

    .line 196
    .line 197
    invoke-virtual {v10}, Lc90;->e()Landroid/util/Size;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    invoke-virtual {v10}, Landroid/util/Size;->getWidth()I

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    int-to-long v11, v11

    .line 206
    invoke-virtual {v10}, Landroid/util/Size;->getHeight()I

    .line 207
    .line 208
    .line 209
    move-result v10

    .line 210
    int-to-long v13, v10

    .line 211
    mul-long/2addr v11, v13

    .line 212
    const-wide/32 v13, 0x4b000

    .line 213
    .line 214
    .line 215
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 216
    .line 217
    .line 218
    move-result-wide v10

    .line 219
    array-length v12, v4

    .line 220
    move-object v13, v8

    .line 221
    move v14, v9

    .line 222
    :goto_1
    if-ge v14, v12, :cond_7

    .line 223
    .line 224
    aget-object v15, v4, v14

    .line 225
    .line 226
    invoke-virtual {v15}, Landroid/util/Size;->getWidth()I

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    int-to-long v7, v8

    .line 231
    invoke-virtual {v15}, Landroid/util/Size;->getHeight()I

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    move-object/from16 v17, v4

    .line 236
    .line 237
    move-object/from16 v16, v5

    .line 238
    .line 239
    int-to-long v4, v9

    .line 240
    mul-long/2addr v7, v4

    .line 241
    cmp-long v4, v7, v10

    .line 242
    .line 243
    if-nez v4, :cond_4

    .line 244
    .line 245
    move-object v3, v15

    .line 246
    goto :goto_3

    .line 247
    :cond_4
    if-lez v4, :cond_6

    .line 248
    .line 249
    if-eqz v13, :cond_5

    .line 250
    .line 251
    move-object v3, v13

    .line 252
    goto :goto_3

    .line 253
    :cond_5
    const/4 v4, 0x0

    .line 254
    goto :goto_2

    .line 255
    :cond_6
    add-int/lit8 v14, v14, 0x1

    .line 256
    .line 257
    move-object v13, v15

    .line 258
    move-object/from16 v5, v16

    .line 259
    .line 260
    move-object/from16 v4, v17

    .line 261
    .line 262
    const/4 v7, 0x1

    .line 263
    const/4 v8, 0x0

    .line 264
    const/4 v9, 0x0

    .line 265
    goto :goto_1

    .line 266
    :cond_7
    move-object/from16 v16, v5

    .line 267
    .line 268
    move v4, v9

    .line 269
    :goto_2
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    check-cast v3, Landroid/util/Size;

    .line 274
    .line 275
    :goto_3
    iput-object v3, v2, Lqi1;->d:Ljava/lang/Object;

    .line 276
    .line 277
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    invoke-static/range {v16 .. v16}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2}, Lqi1;->c()Lfb2;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    iput-object v3, v2, Lqi1;->b:Ljava/lang/Object;

    .line 288
    .line 289
    iput-object v2, v0, Lxn;->h0:Lqi1;

    .line 290
    .line 291
    :cond_8
    invoke-virtual {v0}, Lxn;->x()Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    if-eqz v2, :cond_b

    .line 296
    .line 297
    iget-object v2, v0, Lxn;->h0:Lqi1;

    .line 298
    .line 299
    if-eqz v2, :cond_10

    .line 300
    .line 301
    invoke-static {v2}, Lxn;->v(Lqi1;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    iget-object v3, v0, Lxn;->h0:Lqi1;

    .line 306
    .line 307
    iget-object v4, v3, Lqi1;->b:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v4, Lfb2;

    .line 310
    .line 311
    iget-object v3, v3, Lqi1;->c:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v3, Lpi1;

    .line 314
    .line 315
    sget-object v7, Lbz2;->f:Lbz2;

    .line 316
    .line 317
    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    iget-object v5, v1, Lfs0;->b:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v5, Ljava/util/LinkedHashMap;

    .line 324
    .line 325
    invoke-virtual {v5, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v8

    .line 329
    check-cast v8, Lxy2;

    .line 330
    .line 331
    const/4 v9, 0x0

    .line 332
    if-nez v8, :cond_9

    .line 333
    .line 334
    new-instance v8, Lxy2;

    .line 335
    .line 336
    invoke-direct {v8, v4, v3, v9, v6}, Lxy2;-><init>(Lfb2;Lzy2;Lpg;Ljava/util/List;)V

    .line 337
    .line 338
    .line 339
    invoke-interface {v5, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    :cond_9
    const/4 v5, 0x1

    .line 343
    iput-boolean v5, v8, Lxy2;->e:Z

    .line 344
    .line 345
    move-object v5, v4

    .line 346
    move-object v4, v3

    .line 347
    move-object v3, v5

    .line 348
    move-object v5, v9

    .line 349
    invoke-virtual/range {v1 .. v6}, Lfs0;->x(Ljava/lang/String;Lfb2;Lzy2;Lpg;Ljava/util/List;)V

    .line 350
    .line 351
    .line 352
    iget-object v0, v0, Lxn;->h0:Lqi1;

    .line 353
    .line 354
    iget-object v3, v0, Lqi1;->b:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast v3, Lfb2;

    .line 357
    .line 358
    iget-object v0, v0, Lqi1;->c:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v0, Lpi1;

    .line 361
    .line 362
    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    iget-object v1, v1, Lfs0;->b:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 369
    .line 370
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v5

    .line 374
    check-cast v5, Lxy2;

    .line 375
    .line 376
    if-nez v5, :cond_a

    .line 377
    .line 378
    new-instance v5, Lxy2;

    .line 379
    .line 380
    const/4 v6, 0x0

    .line 381
    invoke-direct {v5, v3, v0, v6, v4}, Lxy2;-><init>(Lfb2;Lzy2;Lpg;Ljava/util/List;)V

    .line 382
    .line 383
    .line 384
    invoke-interface {v1, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    :cond_a
    const/4 v1, 0x1

    .line 388
    iput-boolean v1, v5, Lxy2;->f:Z

    .line 389
    .line 390
    return-void

    .line 391
    :cond_b
    const-string v0, "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly."

    .line 392
    .line 393
    invoke-static {v6, v0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    return-void

    .line 397
    :cond_c
    move v1, v7

    .line 398
    if-ne v5, v1, :cond_d

    .line 399
    .line 400
    if-ne v4, v1, :cond_d

    .line 401
    .line 402
    invoke-virtual {v0}, Lxn;->B()V

    .line 403
    .line 404
    .line 405
    return-void

    .line 406
    :cond_d
    if-lt v4, v3, :cond_e

    .line 407
    .line 408
    invoke-virtual {v0}, Lxn;->B()V

    .line 409
    .line 410
    .line 411
    return-void

    .line 412
    :cond_e
    iget-object v1, v0, Lxn;->h0:Lqi1;

    .line 413
    .line 414
    if-eqz v1, :cond_f

    .line 415
    .line 416
    invoke-virtual {v0}, Lxn;->x()Z

    .line 417
    .line 418
    .line 419
    move-result v1

    .line 420
    if-nez v1, :cond_f

    .line 421
    .line 422
    invoke-virtual {v0}, Lxn;->B()V

    .line 423
    .line 424
    .line 425
    return-void

    .line 426
    :cond_f
    invoke-static {v6}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    :cond_10
    return-void
.end method

.method public final p()V
    .locals 5

    .line 1
    iget v0, p0, Lxn;->s0:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    iget v0, p0, Lxn;->s0:I

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    iget v0, p0, Lxn;->s0:I

    .line 12
    .line 13
    const/4 v1, 0x7

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget v0, p0, Lxn;->V:I

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 24
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: "

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget v2, p0, Lxn;->s0:I

    .line 32
    .line 33
    invoke-static {v2}, Len;->A(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, " (error: "

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget v2, p0, Lxn;->V:I

    .line 46
    .line 47
    invoke-static {v2}, Lxn;->u(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v2, ")"

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1, v0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lxn;->C()V

    .line 67
    .line 68
    .line 69
    iget-object p0, p0, Lxn;->W:Lrr;

    .line 70
    .line 71
    iget-object v0, p0, Lrr;->a:Ljava/lang/Object;

    .line 72
    .line 73
    monitor-enter v0

    .line 74
    :try_start_0
    iget-object v1, p0, Lrr;->b:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_2

    .line 81
    .line 82
    new-instance v1, Ljava/util/ArrayList;

    .line 83
    .line 84
    iget-object v2, p0, Lrr;->b:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 87
    .line 88
    .line 89
    iget-object p0, p0, Lrr;->b:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :catchall_0
    move-exception p0

    .line 96
    goto :goto_5

    .line 97
    :cond_2
    const/4 v1, 0x0

    .line 98
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_5

    .line 110
    .line 111
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Ljr;

    .line 116
    .line 117
    iget-object v1, v0, Ljr;->d:Ljava/util/List;

    .line 118
    .line 119
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_3

    .line 128
    .line 129
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    check-cast v2, Lmo;

    .line 134
    .line 135
    iget-object v3, v0, Ljr;->f:Lnm2;

    .line 136
    .line 137
    const-string v4, "CAPTURE_CONFIG_ID_KEY"

    .line 138
    .line 139
    iget-object v3, v3, Lnm2;->a:Landroid/util/ArrayMap;

    .line 140
    .line 141
    invoke-virtual {v3, v4}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    if-nez v3, :cond_4

    .line 146
    .line 147
    const/4 v3, -0x1

    .line 148
    goto :goto_4

    .line 149
    :cond_4
    check-cast v3, Ljava/lang/Integer;

    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    :goto_4
    invoke-virtual {v2, v3}, Lmo;->a(I)V

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_5
    return-void

    .line 160
    :goto_5
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 161
    throw p0
.end method

.method public final q()V
    .locals 5

    .line 1
    iget v0, p0, Lxn;->s0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x2

    .line 6
    if-eq v0, v3, :cond_1

    .line 7
    .line 8
    iget v0, p0, Lxn;->s0:I

    .line 9
    .line 10
    const/4 v4, 0x5

    .line 11
    if-ne v0, v4, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, v2

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    move v0, v1

    .line 17
    :goto_1
    const/4 v4, 0x0

    .line 18
    invoke-static {v4, v0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lxn;->X:Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v4, v0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    iget-boolean v0, p0, Lxn;->e0:Z

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Lxn;->t()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    iget-boolean v0, p0, Lxn;->f0:Z

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    const-string v0, "Ignored since configAndClose is processing"

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lxn;->s(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_3
    iget-object v0, p0, Lxn;->Z:Lsn;

    .line 49
    .line 50
    iget-boolean v0, v0, Lsn;->b:Z

    .line 51
    .line 52
    if-nez v0, :cond_4

    .line 53
    .line 54
    iput-boolean v2, p0, Lxn;->e0:Z

    .line 55
    .line 56
    invoke-virtual {p0}, Lxn;->t()V

    .line 57
    .line 58
    .line 59
    const-string v0, "Ignore configAndClose and finish the close flow directly since camera is unavailable."

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lxn;->s(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_4
    const-string v0, "Open camera to configAndClose"

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lxn;->s(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Lmn;

    .line 71
    .line 72
    invoke-direct {v0, p0, v1}, Lmn;-><init>(Lxn;I)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, Lpy0;->Y(Lvm;)Lxm;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-boolean v1, p0, Lxn;->f0:Z

    .line 80
    .line 81
    new-instance v1, Ls2;

    .line 82
    .line 83
    invoke-direct {v1, p0, v3}, Ls2;-><init>(Ljava/lang/Object;I)V

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, Lxn;->c:Ly92;

    .line 87
    .line 88
    iget-object v0, v0, Lxm;->b:Lwm;

    .line 89
    .line 90
    invoke-virtual {v0, v1, p0}, Ll0;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final r()Landroid/hardware/camera2/CameraDevice$StateCallback;
    .locals 2

    .line 1
    iget-object v0, p0, Lxn;->a:Lfs0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lfs0;->m()Leb2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Leb2;->b()Lfb2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, Lfb2;->c:Ljava/util/List;

    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lxn;->i0:Lqi1;

    .line 19
    .line 20
    iget-object v0, v0, Lqi1;->f:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lrp;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lxn;->v:Lwn;

    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    invoke-static {v1}, Lkb1;->s(Ljava/util/ArrayList;)Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public final s(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxn;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    const-string p0, "Camera2CameraImpl"

    .line 5
    .line 6
    invoke-static {p0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final t()V
    .locals 4

    .line 1
    iget v0, p0, Lxn;->s0:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x5

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    iget v0, p0, Lxn;->s0:I

    .line 9
    .line 10
    if-ne v0, v3, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    :goto_0
    move v0, v2

    .line 16
    :goto_1
    const/4 v1, 0x0

    .line 17
    invoke-static {v1, v0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lxn;->X:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {v1, v0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lxn;->U:Landroid/hardware/camera2/CameraDevice;

    .line 30
    .line 31
    iget v0, p0, Lxn;->s0:I

    .line 32
    .line 33
    if-ne v0, v3, :cond_2

    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    invoke-virtual {p0, v0}, Lxn;->E(I)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    iget-object v0, p0, Lxn;->b:Lcq;

    .line 41
    .line 42
    iget-object v1, p0, Lxn;->Z:Lsn;

    .line 43
    .line 44
    iget-object v0, v0, Lcq;->a:Lcb;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lcb;->N(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v2}, Lxn;->E(I)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object p0, p0, Lxn;->w:Lzn;

    .line 12
    .line 13
    iget-object p0, p0, Lzn;->a:Ljava/lang/String;

    .line 14
    .line 15
    filled-new-array {v1, p0}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v1, "Camera@%x[id=%s]"

    .line 20
    .line 21
    invoke-static {v0, v1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final x()Z
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v3, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lxn;->m0:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    :try_start_0
    iget-object v2, v0, Lxn;->a0:Lkn;

    .line 12
    .line 13
    iget v2, v2, Lkn;->b:I

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v8, 0x0

    .line 17
    if-ne v2, v4, :cond_0

    .line 18
    .line 19
    monitor-exit v1

    .line 20
    const/4 v2, 0x1

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto/16 :goto_5

    .line 24
    .line 25
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    move v2, v8

    .line 27
    :goto_0
    iget-object v1, v0, Lxn;->a:Lfs0;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance v4, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    iget-object v1, v1, Lfs0;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, Ljava/util/Map$Entry;

    .line 60
    .line 61
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    check-cast v6, Lxy2;

    .line 66
    .line 67
    iget-boolean v6, v6, Lxy2;->e:Z

    .line 68
    .line 69
    if-eqz v6, :cond_1

    .line 70
    .line 71
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    check-cast v5, Lxy2;

    .line 76
    .line 77
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-eqz v4, :cond_7

    .line 94
    .line 95
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    check-cast v4, Lxy2;

    .line 100
    .line 101
    iget-object v5, v4, Lxy2;->d:Ljava/util/List;

    .line 102
    .line 103
    if-eqz v5, :cond_4

    .line 104
    .line 105
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    sget-object v6, Lbz2;->f:Lbz2;

    .line 110
    .line 111
    if-ne v5, v6, :cond_4

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    iget-object v5, v4, Lxy2;->c:Lpg;

    .line 115
    .line 116
    if-eqz v5, :cond_6

    .line 117
    .line 118
    iget-object v5, v4, Lxy2;->d:Ljava/util/List;

    .line 119
    .line 120
    if-nez v5, :cond_5

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_5
    iget-object v5, v4, Lxy2;->a:Lfb2;

    .line 124
    .line 125
    iget-object v6, v4, Lxy2;->b:Lzy2;

    .line 126
    .line 127
    invoke-virtual {v5}, Lfb2;->b()Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    if-eqz v9, :cond_3

    .line 140
    .line 141
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    check-cast v9, Ld70;

    .line 146
    .line 147
    iget-object v10, v0, Lxn;->q0:Lcj2;

    .line 148
    .line 149
    invoke-interface {v6}, Lhw0;->l()I

    .line 150
    .line 151
    .line 152
    move-result v11

    .line 153
    iget-object v12, v9, Ld70;->h:Landroid/util/Size;

    .line 154
    .line 155
    invoke-virtual {v10, v11}, Lcj2;->i(I)Lwg;

    .line 156
    .line 157
    .line 158
    move-result-object v10

    .line 159
    invoke-static {v2, v11, v12, v10}, Lrg;->b(IILandroid/util/Size;Lwg;)Lrg;

    .line 160
    .line 161
    .line 162
    move-result-object v14

    .line 163
    invoke-interface {v6}, Lhw0;->l()I

    .line 164
    .line 165
    .line 166
    move-result v15

    .line 167
    iget-object v9, v9, Ld70;->h:Landroid/util/Size;

    .line 168
    .line 169
    iget-object v10, v4, Lxy2;->c:Lpg;

    .line 170
    .line 171
    iget-object v11, v10, Lpg;->b:Lmb0;

    .line 172
    .line 173
    iget-object v12, v4, Lxy2;->d:Ljava/util/List;

    .line 174
    .line 175
    iget-object v10, v10, Lpg;->d:Lty;

    .line 176
    .line 177
    const/4 v13, 0x0

    .line 178
    const/16 v21, 0x1

    .line 179
    .line 180
    sget-object v7, Lzy2;->L:Llf;

    .line 181
    .line 182
    invoke-interface {v6, v7, v13}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    move-object/from16 v20, v7

    .line 187
    .line 188
    check-cast v20, Landroid/util/Range;

    .line 189
    .line 190
    new-instance v13, Laf;

    .line 191
    .line 192
    move-object/from16 v16, v9

    .line 193
    .line 194
    move-object/from16 v19, v10

    .line 195
    .line 196
    move-object/from16 v17, v11

    .line 197
    .line 198
    move-object/from16 v18, v12

    .line 199
    .line 200
    invoke-direct/range {v13 .. v20}, Laf;-><init>(Lrg;ILandroid/util/Size;Lmb0;Ljava/util/List;Lty;Landroid/util/Range;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_6
    :goto_4
    const-string v0, "Camera2CameraImpl"

    .line 208
    .line 209
    new-instance v1, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    const-string v2, "Invalid stream spec or capture types in "

    .line 212
    .line 213
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-static {v0, v1}, Lhu0;->H0(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    return v8

    .line 227
    :cond_7
    const/16 v21, 0x1

    .line 228
    .line 229
    iget-object v1, v0, Lxn;->h0:Lqi1;

    .line 230
    .line 231
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    new-instance v4, Ljava/util/HashMap;

    .line 235
    .line 236
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 237
    .line 238
    .line 239
    iget-object v1, v0, Lxn;->h0:Lqi1;

    .line 240
    .line 241
    iget-object v5, v1, Lqi1;->c:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v5, Lpi1;

    .line 244
    .line 245
    iget-object v1, v1, Lqi1;->d:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v1, Landroid/util/Size;

    .line 248
    .line 249
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-virtual {v4, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    :try_start_1
    iget-object v1, v0, Lxn;->q0:Lcj2;

    .line 257
    .line 258
    const/4 v5, 0x0

    .line 259
    const/4 v6, 0x0

    .line 260
    invoke-virtual/range {v1 .. v6}, Lcj2;->g(ILjava/util/ArrayList;Ljava/util/HashMap;ZZ)Landroid/util/Pair;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 261
    .line 262
    .line 263
    const-string v1, "Surface combination with metering repeating supported!"

    .line 264
    .line 265
    invoke-virtual {v0, v1}, Lxn;->s(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    return v21

    .line 269
    :catch_0
    const-string v1, "Surface combination with metering repeating  not supported!"

    .line 270
    .line 271
    invoke-virtual {v0, v1}, Lxn;->s(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    return v8

    .line 275
    :goto_5
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 276
    throw v0
.end method

.method public final y()Lrr;
    .locals 3

    .line 1
    iget-object v0, p0, Lxn;->m0:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Lrr;

    .line 5
    .line 6
    iget-object v2, p0, Lxn;->p0:Lqc3;

    .line 7
    .line 8
    iget-object p0, p0, Lxn;->w:Lzn;

    .line 9
    .line 10
    iget-object p0, p0, Lzn;->f:Ler0;

    .line 11
    .line 12
    invoke-direct {v1, v2, p0}, Lrr;-><init>(Lqc3;Ler0;)V

    .line 13
    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-object v1

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p0
.end method

.method public final z(Z)V
    .locals 6

    .line 1
    const-string v0, "Unable to open camera due to "

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lxn;->v:Lwn;

    .line 6
    .line 7
    iget-object p1, p1, Lwn;->e:Lun;

    .line 8
    .line 9
    const-wide/16 v1, -0x1

    .line 10
    .line 11
    iput-wide v1, p1, Lun;->b:J

    .line 12
    .line 13
    :cond_0
    iget-object p1, p0, Lxn;->v:Lwn;

    .line 14
    .line 15
    invoke-virtual {p1}, Lwn;->a()Z

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lxn;->r0:Lcb;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcb;->l()V

    .line 21
    .line 22
    .line 23
    const-string p1, "Opening camera."

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lxn;->s(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/16 p1, 0x8

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lxn;->E(I)V

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x7

    .line 34
    :try_start_0
    iget-object v2, p0, Lxn;->b:Lcq;

    .line 35
    .line 36
    iget-object v3, p0, Lxn;->w:Lzn;

    .line 37
    .line 38
    iget-object v3, v3, Lzn;->a:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v4, p0, Lxn;->c:Ly92;

    .line 41
    .line 42
    invoke-virtual {p0}, Lxn;->r()Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    iget-object v2, v2, Lcq;->a:Lcb;

    .line 47
    .line 48
    invoke-virtual {v2, v3, v4, v5}, Lcb;->E(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V
    :try_end_0
    .catch Llo; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catch_0
    move-exception p1

    .line 53
    goto :goto_0

    .line 54
    :catch_1
    move-exception v2

    .line 55
    goto :goto_1

    .line 56
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p0, p1}, Lxn;->s(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v1}, Lxn;->E(I)V

    .line 76
    .line 77
    .line 78
    iget-object p0, p0, Lxn;->v:Lwn;

    .line 79
    .line 80
    invoke-virtual {p0}, Lwn;->b()V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {p0, v0}, Lxn;->s(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iget v0, v2, Llo;->a:I

    .line 104
    .line 105
    const/16 v3, 0x2711

    .line 106
    .line 107
    if-eq v0, v3, :cond_2

    .line 108
    .line 109
    iget-object p0, p0, Lxn;->r0:Lcb;

    .line 110
    .line 111
    iget-object v0, p0, Lcb;->c:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Lxn;

    .line 114
    .line 115
    iget v0, v0, Lxn;->s0:I

    .line 116
    .line 117
    iget-object v1, p0, Lcb;->c:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v1, Lxn;

    .line 120
    .line 121
    if-eq v0, p1, :cond_1

    .line 122
    .line 123
    const-string p0, "Don\'t need the onError timeout handler."

    .line 124
    .line 125
    invoke-virtual {v1, p0}, Lxn;->s(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_1
    const-string p1, "Camera waiting for onError."

    .line 130
    .line 131
    invoke-virtual {v1, p1}, Lxn;->s(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Lcb;->l()V

    .line 135
    .line 136
    .line 137
    new-instance p1, Lec;

    .line 138
    .line 139
    invoke-direct {p1, p0}, Lec;-><init>(Lcb;)V

    .line 140
    .line 141
    .line 142
    iput-object p1, p0, Lcb;->b:Ljava/lang/Object;

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_2
    new-instance p1, Lff;

    .line 146
    .line 147
    invoke-direct {p1, v1, v2}, Lff;-><init>(ILjava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    const/4 v0, 0x1

    .line 151
    const/4 v1, 0x3

    .line 152
    invoke-virtual {p0, v1, p1, v0}, Lxn;->D(ILff;Z)V

    .line 153
    .line 154
    .line 155
    :goto_2
    return-void
.end method

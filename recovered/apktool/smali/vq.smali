.class public final Lvq;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final l:Ljava/lang/Object;

.field public static final m:Landroid/util/SparseArray;


# instance fields
.field public final a:Lcb;

.field public final b:Ljava/lang/Object;

.field public final c:Lxq;

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:Landroid/os/Handler;

.field public f:Lln;

.field public g:Lcb;

.field public h:Ljo;

.field public final i:Ly42;

.field public final j:Lxm;

.field public k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lvq;->l:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Landroid/util/SparseArray;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lvq;->m:Landroid/util/SparseArray;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 12

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcb;

    .line 5
    .line 6
    const/16 v1, 0x13

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcb;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lvq;->a:Lcb;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lvq;->b:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    iput v1, p0, Lvq;->k:I

    .line 22
    .line 23
    const-string v2, "CameraX"

    .line 24
    .line 25
    invoke-static {p1}, Lpg3;->l(Landroid/content/Context;)Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    instance-of v3, v0, Landroid/content/ContextWrapper;

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    instance-of v3, v0, Landroid/app/Application;

    .line 35
    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    :goto_1
    const/16 v3, 0x280

    .line 47
    .line 48
    :try_start_0
    invoke-static {p1}, Lpg3;->l(Landroid/content/Context;)Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    new-instance v6, Landroid/content/ComponentName;

    .line 57
    .line 58
    const-class v7, Landroidx/camera/core/impl/MetadataHolderService;

    .line 59
    .line 60
    invoke-direct {v6, v0, v7}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, v6, v3}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object v0, v0, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    .line 68
    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    const-string v5, "androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER"

    .line 72
    .line 73
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    goto :goto_2

    .line 78
    :catch_0
    move-exception v0

    .line 79
    goto :goto_4

    .line 80
    :catch_1
    move-exception v0

    .line 81
    goto :goto_4

    .line 82
    :catch_2
    move-exception v0

    .line 83
    goto :goto_4

    .line 84
    :catch_3
    move-exception v0

    .line 85
    goto :goto_4

    .line 86
    :catch_4
    move-exception v0

    .line 87
    goto :goto_4

    .line 88
    :catch_5
    move-exception v0

    .line 89
    goto :goto_4

    .line 90
    :catch_6
    move-exception v0

    .line 91
    goto :goto_4

    .line 92
    :cond_2
    move-object v0, v4

    .line 93
    :goto_2
    if-nez v0, :cond_3

    .line 94
    .line 95
    const-string v0, "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as \'camera-camera2\'."

    .line 96
    .line 97
    invoke-static {v2, v0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :goto_3
    move-object v0, v4

    .line 101
    goto :goto_5

    .line 102
    :cond_3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Landroidx/camera/camera2/Camera2Config$DefaultProvider;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :goto_4
    const-string v5, "Failed to retrieve default CameraXConfig.Provider from meta-data"

    .line 118
    .line 119
    invoke-static {v2, v5, v0}, Lhu0;->U(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :goto_5
    if-eqz v0, :cond_16

    .line 124
    .line 125
    invoke-virtual {v0}, Landroidx/camera/camera2/Camera2Config$DefaultProvider;->getCameraXConfig()Lxq;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iput-object v0, p0, Lvq;->c:Lxq;

    .line 130
    .line 131
    iget-object v0, v0, Lxq;->a:Lnq1;

    .line 132
    .line 133
    sget-object v2, Lxq;->V:Llf;

    .line 134
    .line 135
    :try_start_1
    invoke-virtual {v0, v2}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_7

    .line 139
    goto :goto_6

    .line 140
    :catch_7
    move-object v0, v4

    .line 141
    :goto_6
    check-cast v0, Li02;

    .line 142
    .line 143
    if-eqz v0, :cond_4

    .line 144
    .line 145
    const-string v2, "CameraX"

    .line 146
    .line 147
    invoke-virtual {v0}, Li02;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    invoke-static {v2}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    goto :goto_9

    .line 154
    :cond_4
    const-string v0, "QuirkSettingsLoader"

    .line 155
    .line 156
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    :try_start_2
    new-instance v5, Landroid/content/ComponentName;

    .line 161
    .line 162
    const-class v6, Landroidx/camera/core/impl/QuirkSettingsLoader$MetadataHolderService;

    .line 163
    .line 164
    invoke-direct {v5, p1, v6}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v5, v3}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    iget-object v2, v2, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    .line 172
    .line 173
    if-nez v2, :cond_5

    .line 174
    .line 175
    const-string v2, "No metadata in MetadataHolderService."

    .line 176
    .line 177
    invoke-static {v0, v2}, Lhu0;->H0(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    :goto_7
    move-object v0, v4

    .line 181
    goto :goto_8

    .line 182
    :cond_5
    invoke-static {p1, v2}, Lkb1;->e(Landroid/content/Context;Landroid/os/Bundle;)Li02;

    .line 183
    .line 184
    .line 185
    move-result-object v0
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_8

    .line 186
    goto :goto_8

    .line 187
    :catch_8
    invoke-static {v0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    goto :goto_7

    .line 191
    :goto_8
    const-string v2, "CameraX"

    .line 192
    .line 193
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    invoke-static {v2}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    :goto_9
    if-nez v0, :cond_6

    .line 200
    .line 201
    sget-object v0, Lj02;->b:Li02;

    .line 202
    .line 203
    const-string v2, "CameraX"

    .line 204
    .line 205
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    invoke-static {v2}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    :cond_6
    sget-object v2, Lj02;->c:Lj02;

    .line 212
    .line 213
    iget-object v2, v2, Lj02;->a:Lbl1;

    .line 214
    .line 215
    iget-object v3, v2, Lbl1;->a:Ljava/lang/Object;

    .line 216
    .line 217
    monitor-enter v3

    .line 218
    :try_start_3
    iget-object v5, v2, Lbl1;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 219
    .line 220
    invoke-virtual {v5, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    invoke-static {v5, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    const/4 v5, 0x0

    .line 229
    if-eqz v0, :cond_7

    .line 230
    .line 231
    monitor-exit v3

    .line 232
    goto :goto_b

    .line 233
    :catchall_0
    move-exception v0

    .line 234
    move-object p0, v0

    .line 235
    goto/16 :goto_19

    .line 236
    .line 237
    :cond_7
    iget v0, v2, Lbl1;->c:I

    .line 238
    .line 239
    add-int/2addr v0, v1

    .line 240
    iput v0, v2, Lbl1;->c:I

    .line 241
    .line 242
    iget-boolean v6, v2, Lbl1;->d:Z

    .line 243
    .line 244
    if-eqz v6, :cond_8

    .line 245
    .line 246
    monitor-exit v3

    .line 247
    goto :goto_b

    .line 248
    :cond_8
    iput-boolean v1, v2, Lbl1;->d:Z

    .line 249
    .line 250
    iget-object v6, v2, Lbl1;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 251
    .line 252
    invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 257
    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    if-eqz v3, :cond_9

    .line 262
    .line 263
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    check-cast v3, Lvg2;

    .line 268
    .line 269
    invoke-virtual {v3, v0}, Lvg2;->a(I)V

    .line 270
    .line 271
    .line 272
    goto :goto_a

    .line 273
    :cond_9
    iget-object v6, v2, Lbl1;->a:Ljava/lang/Object;

    .line 274
    .line 275
    monitor-enter v6

    .line 276
    :try_start_4
    iget v3, v2, Lbl1;->c:I

    .line 277
    .line 278
    if-ne v3, v0, :cond_15

    .line 279
    .line 280
    iput-boolean v5, v2, Lbl1;->d:Z

    .line 281
    .line 282
    monitor-exit v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 283
    :goto_b
    iget-object v0, p0, Lvq;->c:Lxq;

    .line 284
    .line 285
    iget-object v0, v0, Lxq;->a:Lnq1;

    .line 286
    .line 287
    sget-object v2, Lxq;->e:Llf;

    .line 288
    .line 289
    :try_start_5
    invoke-virtual {v0, v2}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_9

    .line 293
    goto :goto_c

    .line 294
    :catch_9
    move-object v0, v4

    .line 295
    :goto_c
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 296
    .line 297
    iget-object v2, p0, Lvq;->c:Lxq;

    .line 298
    .line 299
    iget-object v2, v2, Lxq;->a:Lnq1;

    .line 300
    .line 301
    sget-object v3, Lxq;->f:Llf;

    .line 302
    .line 303
    :try_start_6
    invoke-virtual {v2, v3}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v2
    :try_end_6
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_a

    .line 307
    goto :goto_d

    .line 308
    :catch_a
    move-object v2, v4

    .line 309
    :goto_d
    check-cast v2, Landroid/os/Handler;

    .line 310
    .line 311
    if-nez v0, :cond_a

    .line 312
    .line 313
    new-instance v0, Lwp;

    .line 314
    .line 315
    invoke-direct {v0}, Lwp;-><init>()V

    .line 316
    .line 317
    .line 318
    :cond_a
    iput-object v0, p0, Lvq;->d:Ljava/util/concurrent/Executor;

    .line 319
    .line 320
    if-nez v2, :cond_b

    .line 321
    .line 322
    new-instance v0, Landroid/os/HandlerThread;

    .line 323
    .line 324
    const-string v2, "CameraX-scheduler"

    .line 325
    .line 326
    const/16 v3, 0xa

    .line 327
    .line 328
    invoke-direct {v0, v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-static {v0}, Lhe3;->b(Landroid/os/Looper;)Landroid/os/Handler;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    iput-object v0, p0, Lvq;->e:Landroid/os/Handler;

    .line 343
    .line 344
    goto :goto_e

    .line 345
    :cond_b
    iput-object v2, p0, Lvq;->e:Landroid/os/Handler;

    .line 346
    .line 347
    :goto_e
    iget-object v0, p0, Lvq;->c:Lxq;

    .line 348
    .line 349
    sget-object v2, Lxq;->i:Llf;

    .line 350
    .line 351
    invoke-interface {v0, v2, v4}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    check-cast v0, Ljava/lang/Integer;

    .line 356
    .line 357
    sget-object v2, Lvq;->l:Ljava/lang/Object;

    .line 358
    .line 359
    monitor-enter v2

    .line 360
    if-nez v0, :cond_c

    .line 361
    .line 362
    :try_start_7
    monitor-exit v2

    .line 363
    goto :goto_11

    .line 364
    :catchall_1
    move-exception v0

    .line 365
    move-object p0, v0

    .line 366
    goto/16 :goto_17

    .line 367
    .line 368
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    const-string v4, "minLogLevel"

    .line 373
    .line 374
    const/4 v6, 0x6

    .line 375
    const/4 v7, 0x3

    .line 376
    invoke-static {v4, v3, v7, v6}, Lde3;->g(Ljava/lang/String;III)V

    .line 377
    .line 378
    .line 379
    sget-object v3, Lvq;->m:Landroid/util/SparseArray;

    .line 380
    .line 381
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 382
    .line 383
    .line 384
    move-result v4

    .line 385
    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    if-eqz v4, :cond_d

    .line 390
    .line 391
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 392
    .line 393
    .line 394
    move-result v4

    .line 395
    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    check-cast v4, Ljava/lang/Integer;

    .line 400
    .line 401
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    add-int/2addr v4, v1

    .line 406
    goto :goto_f

    .line 407
    :cond_d
    move v4, v1

    .line 408
    :goto_f
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    invoke-virtual {v3, v0, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    if-nez v0, :cond_e

    .line 424
    .line 425
    sput v7, Lhu0;->d:I

    .line 426
    .line 427
    goto :goto_10

    .line 428
    :cond_e
    invoke-virtual {v3, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    if-eqz v0, :cond_f

    .line 433
    .line 434
    sput v7, Lhu0;->d:I

    .line 435
    .line 436
    goto :goto_10

    .line 437
    :cond_f
    const/4 v0, 0x4

    .line 438
    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    if-eqz v4, :cond_10

    .line 443
    .line 444
    sput v0, Lhu0;->d:I

    .line 445
    .line 446
    goto :goto_10

    .line 447
    :cond_10
    const/4 v0, 0x5

    .line 448
    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v4

    .line 452
    if-eqz v4, :cond_11

    .line 453
    .line 454
    sput v0, Lhu0;->d:I

    .line 455
    .line 456
    goto :goto_10

    .line 457
    :cond_11
    invoke-virtual {v3, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    if-eqz v0, :cond_12

    .line 462
    .line 463
    sput v6, Lhu0;->d:I

    .line 464
    .line 465
    :cond_12
    :goto_10
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 466
    :goto_11
    iget-object v0, p0, Lvq;->c:Lxq;

    .line 467
    .line 468
    iget-object v0, v0, Lxq;->a:Lnq1;

    .line 469
    .line 470
    sget-object v2, Lxq;->U:Llf;

    .line 471
    .line 472
    sget-object v3, Ly42;->a:Liq;

    .line 473
    .line 474
    :try_start_8
    invoke-virtual {v0, v2}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v3
    :try_end_8
    .catch Ljava/lang/IllegalArgumentException; {:try_start_8 .. :try_end_8} :catch_b

    .line 478
    :catch_b
    check-cast v3, Ly42;

    .line 479
    .line 480
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    invoke-interface {v3}, Ly42;->a()J

    .line 484
    .line 485
    .line 486
    move-result-wide v6

    .line 487
    instance-of v0, v3, Liq;

    .line 488
    .line 489
    if-eqz v0, :cond_13

    .line 490
    .line 491
    check-cast v3, Liq;

    .line 492
    .line 493
    iget v0, v3, Liq;->b:I

    .line 494
    .line 495
    packed-switch v0, :pswitch_data_0

    .line 496
    .line 497
    .line 498
    new-instance v0, Liq;

    .line 499
    .line 500
    invoke-direct {v0, v1, v6, v7}, Liq;-><init>(IJ)V

    .line 501
    .line 502
    .line 503
    goto :goto_12

    .line 504
    :pswitch_0
    new-instance v0, Liq;

    .line 505
    .line 506
    invoke-direct {v0, v5, v6, v7}, Liq;-><init>(IJ)V

    .line 507
    .line 508
    .line 509
    goto :goto_12

    .line 510
    :cond_13
    new-instance v0, Loo2;

    .line 511
    .line 512
    invoke-direct {v0, v6, v7, v3}, Loo2;-><init>(JLy42;)V

    .line 513
    .line 514
    .line 515
    :goto_12
    iput-object v0, p0, Lvq;->i:Ly42;

    .line 516
    .line 517
    iget-object v3, p0, Lvq;->b:Ljava/lang/Object;

    .line 518
    .line 519
    monitor-enter v3

    .line 520
    :try_start_9
    iget v0, p0, Lvq;->k:I

    .line 521
    .line 522
    if-ne v0, v1, :cond_14

    .line 523
    .line 524
    goto :goto_13

    .line 525
    :cond_14
    move v1, v5

    .line 526
    :goto_13
    const-string v0, "CameraX.initInternal() should only be called once per instance"

    .line 527
    .line 528
    invoke-static {v0, v1}, Lde3;->j(Ljava/lang/String;Z)V

    .line 529
    .line 530
    .line 531
    const/4 v0, 0x2

    .line 532
    iput v0, p0, Lvq;->k:I

    .line 533
    .line 534
    new-instance v9, Lum;

    .line 535
    .line 536
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 537
    .line 538
    .line 539
    new-instance v0, Lu32;

    .line 540
    .line 541
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 542
    .line 543
    .line 544
    iput-object v0, v9, Lum;->c:Lu32;

    .line 545
    .line 546
    new-instance v1, Lxm;

    .line 547
    .line 548
    invoke-direct {v1, v9}, Lxm;-><init>(Lum;)V

    .line 549
    .line 550
    .line 551
    iput-object v1, v9, Lum;->b:Lxm;

    .line 552
    .line 553
    const-class v0, Len;

    .line 554
    .line 555
    iput-object v0, v9, Lum;->a:Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 556
    .line 557
    :try_start_a
    iget-object v7, p0, Lvq;->d:Ljava/util/concurrent/Executor;

    .line 558
    .line 559
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 560
    .line 561
    .line 562
    move-result-wide v10

    .line 563
    new-instance v4, Luq;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_c
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 564
    .line 565
    const/4 v8, 0x1

    .line 566
    move-object v5, p0

    .line 567
    move-object v6, p1

    .line 568
    :try_start_b
    invoke-direct/range {v4 .. v11}, Luq;-><init>(Lvq;Landroid/content/Context;Ljava/util/concurrent/Executor;ILum;J)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_d
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 569
    .line 570
    .line 571
    :try_start_c
    invoke-interface {v7, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 572
    .line 573
    .line 574
    const-string p1, "CameraX initInternal"

    .line 575
    .line 576
    iput-object p1, v9, Lum;->a:Ljava/lang/Object;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 577
    .line 578
    goto :goto_16

    .line 579
    :catch_c
    move-exception v0

    .line 580
    :goto_14
    move-object p1, v0

    .line 581
    goto :goto_15

    .line 582
    :catch_d
    move-exception v0

    .line 583
    move-object p0, v5

    .line 584
    goto :goto_14

    .line 585
    :goto_15
    :try_start_d
    invoke-virtual {v1, p1}, Lxm;->b(Ljava/lang/Throwable;)Z

    .line 586
    .line 587
    .line 588
    :goto_16
    monitor-exit v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 589
    iput-object v1, p0, Lvq;->j:Lxm;

    .line 590
    .line 591
    return-void

    .line 592
    :catchall_2
    move-exception v0

    .line 593
    move-object p0, v0

    .line 594
    :try_start_e
    monitor-exit v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 595
    throw p0

    .line 596
    :goto_17
    :try_start_f
    monitor-exit v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    .line 597
    throw p0

    .line 598
    :catchall_3
    move-exception v0

    .line 599
    move-object p0, v0

    .line 600
    goto :goto_18

    .line 601
    :cond_15
    :try_start_10
    iget-object v0, v2, Lbl1;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 602
    .line 603
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    iget v3, v2, Lbl1;->c:I

    .line 608
    .line 609
    monitor-exit v6

    .line 610
    move-object v6, v0

    .line 611
    move v0, v3

    .line 612
    goto/16 :goto_a

    .line 613
    .line 614
    :goto_18
    monitor-exit v6
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    .line 615
    throw p0

    .line 616
    :goto_19
    :try_start_11
    monitor-exit v3
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    .line 617
    throw p0

    .line 618
    :cond_16
    const-string p0, "CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as \'camera-camera2\'."

    .line 619
    .line 620
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    throw v4

    .line 624
    nop

    .line 625
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

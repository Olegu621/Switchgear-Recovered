.class public final synthetic Lqv0;
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

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic v:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lg71;Lls;Lkotlin/jvm/functions/Function1;Landroid/util/Size;Landroid/util/Size;Lkotlin/jvm/functions/Function1;Ljava/util/concurrent/Executor;I)V
    .locals 0

    .line 22
    iput p8, p0, Lqv0;->a:I

    iput-object p1, p0, Lqv0;->b:Ljava/lang/Object;

    iput-object p2, p0, Lqv0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lqv0;->d:Ljava/lang/Object;

    iput-object p4, p0, Lqv0;->e:Ljava/lang/Object;

    iput-object p5, p0, Lqv0;->f:Ljava/lang/Object;

    iput-object p6, p0, Lqv0;->i:Ljava/lang/Object;

    iput-object p7, p0, Lqv0;->v:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lrv0;Lmw0;Landroid/graphics/Matrix;Lmw0;Landroid/graphics/Rect;Lx6;Lum;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lqv0;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lqv0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lqv0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lqv0;->e:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lqv0;->d:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lqv0;->f:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Lqv0;->i:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p7, p0, Lqv0;->v:Ljava/lang/Object;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lqv0;->a:I

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
    iget-object v1, v0, Lqv0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 14
    .line 15
    iget-object v1, v0, Lqv0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v3, v1

    .line 18
    check-cast v3, Lls;

    .line 19
    .line 20
    iget-object v1, v0, Lqv0;->d:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v4, v1

    .line 23
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 24
    .line 25
    iget-object v1, v0, Lqv0;->e:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v5, v1

    .line 28
    check-cast v5, Landroid/util/Size;

    .line 29
    .line 30
    iget-object v1, v0, Lqv0;->f:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v6, v1

    .line 33
    check-cast v6, Landroid/util/Size;

    .line 34
    .line 35
    iget-object v1, v0, Lqv0;->i:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v7, v1

    .line 38
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 39
    .line 40
    iget-object v0, v0, Lqv0;->v:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v8, v0

    .line 43
    check-cast v8, Ljava/util/concurrent/Executor;

    .line 44
    .line 45
    invoke-static/range {v2 .. v8}, Lcom/supercell/id/scid_plugin/MobileScanner;->c(Lcom/supercell/id/scid_plugin/MobileScanner;Lls;Lkotlin/jvm/functions/Function1;Landroid/util/Size;Landroid/util/Size;Lkotlin/jvm/functions/Function1;Ljava/util/concurrent/Executor;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_0
    iget-object v1, v0, Lqv0;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Lfj1;

    .line 52
    .line 53
    iget-object v4, v0, Lqv0;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v4, Lls;

    .line 56
    .line 57
    iget-object v5, v0, Lqv0;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v5, Lij1;

    .line 60
    .line 61
    iget-object v6, v0, Lqv0;->e:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v6, Landroid/util/Size;

    .line 64
    .line 65
    iget-object v7, v0, Lqv0;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v7, Landroid/util/Size;

    .line 68
    .line 69
    iget-object v8, v0, Lqv0;->i:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v8, Lij1;

    .line 72
    .line 73
    iget-object v0, v0, Lqv0;->v:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 76
    .line 77
    invoke-virtual {v4}, Lls;->get()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    check-cast v4, Lsx1;

    .line 82
    .line 83
    iput-object v4, v1, Lfj1;->i:Lsx1;

    .line 84
    .line 85
    if-nez v4, :cond_0

    .line 86
    .line 87
    new-instance v0, Ltp;

    .line 88
    .line 89
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5, v0}, Lij1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    goto/16 :goto_4

    .line 96
    .line 97
    :cond_0
    invoke-virtual {v4}, Lsx1;->f()V

    .line 98
    .line 99
    .line 100
    iget-object v4, v1, Lfj1;->b:Lio/flutter/view/TextureRegistry;

    .line 101
    .line 102
    invoke-interface {v4}, Lio/flutter/view/TextureRegistry;->createSurfaceTexture()Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    iput-object v4, v1, Lfj1;->U:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    .line 107
    .line 108
    new-instance v4, Lpn;

    .line 109
    .line 110
    const/4 v9, 0x6

    .line 111
    invoke-direct {v4, v9, v1, v0}, Lpn;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    new-instance v9, Lnr;

    .line 115
    .line 116
    const/4 v10, 0x3

    .line 117
    invoke-direct {v9, v10}, Lnr;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v9}, Lnr;->a()Lvw1;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    invoke-virtual {v9, v4}, Lvw1;->D(Luw1;)V

    .line 125
    .line 126
    .line 127
    iput-object v9, v1, Lfj1;->w:Lvw1;

    .line 128
    .line 129
    new-instance v4, Lnr;

    .line 130
    .line 131
    const/4 v9, 0x1

    .line 132
    invoke-direct {v4, v9}, Lnr;-><init>(I)V

    .line 133
    .line 134
    .line 135
    iget-object v4, v4, Lnr;->b:Luk1;

    .line 136
    .line 137
    new-instance v10, Landroid/util/Size;

    .line 138
    .line 139
    const/16 v11, 0x300

    .line 140
    .line 141
    invoke-direct {v10, v11, v11}, Landroid/util/Size;-><init>(II)V

    .line 142
    .line 143
    .line 144
    sget-object v11, Ljw0;->u:Llf;

    .line 145
    .line 146
    invoke-virtual {v4, v11, v10}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    sget-object v10, Ltv0;->b:Llf;

    .line 150
    .line 151
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    invoke-virtual {v4, v10, v11}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    sget-object v10, Ltv0;->e:Llf;

    .line 159
    .line 160
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v11

    .line 164
    invoke-virtual {v4, v10, v11}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    new-instance v10, Ltv0;

    .line 168
    .line 169
    invoke-static {v4}, Lnq1;->d(Lty;)Lnq1;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-direct {v10, v4}, Ltv0;-><init>(Lnq1;)V

    .line 174
    .line 175
    .line 176
    invoke-static {v10}, Ljw0;->y(Ljw0;)V

    .line 177
    .line 178
    .line 179
    new-instance v4, Lpv0;

    .line 180
    .line 181
    invoke-direct {v4, v10}, Lpv0;-><init>(Ltv0;)V

    .line 182
    .line 183
    .line 184
    iget-object v10, v1, Lfj1;->b0:Lx6;

    .line 185
    .line 186
    invoke-virtual {v4, v0, v10}, Lpv0;->D(Ljava/util/concurrent/Executor;Llv0;)V

    .line 187
    .line 188
    .line 189
    :try_start_0
    iget-object v0, v1, Lfj1;->i:Lsx1;

    .line 190
    .line 191
    if-eqz v0, :cond_1

    .line 192
    .line 193
    sget-object v2, Ljq;->c:Ljq;

    .line 194
    .line 195
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    iget-object v10, v1, Lfj1;->w:Lvw1;

    .line 199
    .line 200
    const/4 v11, 0x2

    .line 201
    new-array v11, v11, [Lwy2;

    .line 202
    .line 203
    aput-object v10, v11, v3

    .line 204
    .line 205
    aput-object v4, v11, v9

    .line 206
    .line 207
    invoke-virtual {v0, v1, v2, v11}, Lsx1;->c(Lg71;Ljq;[Lwy2;)Ly61;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    :cond_1
    iput-object v2, v1, Lfj1;->v:Ly61;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 212
    .line 213
    iget-object v0, v1, Lfj1;->w:Lvw1;

    .line 214
    .line 215
    if-eqz v0, :cond_2

    .line 216
    .line 217
    invoke-virtual {v0}, Lvw1;->C()Lfs0;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    if-eqz v0, :cond_2

    .line 222
    .line 223
    iget-object v0, v0, Lfs0;->b:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v0, Ljg;

    .line 226
    .line 227
    iget-object v0, v0, Ljg;->a:Landroid/util/Size;

    .line 228
    .line 229
    goto :goto_0

    .line 230
    :cond_2
    new-instance v0, Landroid/util/Size;

    .line 231
    .line 232
    invoke-direct {v0, v3, v3}, Landroid/util/Size;-><init>(II)V

    .line 233
    .line 234
    .line 235
    :goto_0
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    int-to-double v4, v2

    .line 240
    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    int-to-double v10, v0

    .line 245
    invoke-virtual {v1}, Lfj1;->a()I

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    iput v0, v1, Lfj1;->a0:I

    .line 250
    .line 251
    iget-object v0, v1, Lfj1;->v:Ly61;

    .line 252
    .line 253
    if-eqz v0, :cond_3

    .line 254
    .line 255
    iget-object v0, v0, Ly61;->c:Lqq;

    .line 256
    .line 257
    iget-object v0, v0, Lqq;->a0:Lg42;

    .line 258
    .line 259
    if-eqz v0, :cond_3

    .line 260
    .line 261
    invoke-virtual {v0}, Lam0;->a()I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    goto :goto_1

    .line 266
    :cond_3
    move v0, v3

    .line 267
    :goto_1
    rem-int/lit16 v0, v0, 0xb4

    .line 268
    .line 269
    if-nez v0, :cond_4

    .line 270
    .line 271
    move v3, v9

    .line 272
    :cond_4
    iput-object v6, v1, Lfj1;->X:Landroid/util/Size;

    .line 273
    .line 274
    iput-object v7, v1, Lfj1;->Y:Landroid/util/Size;

    .line 275
    .line 276
    new-instance v12, Lmj1;

    .line 277
    .line 278
    if-eqz v3, :cond_5

    .line 279
    .line 280
    move-wide v13, v4

    .line 281
    goto :goto_2

    .line 282
    :cond_5
    move-wide v13, v10

    .line 283
    :goto_2
    if-eqz v3, :cond_6

    .line 284
    .line 285
    move-wide v15, v10

    .line 286
    goto :goto_3

    .line 287
    :cond_6
    move-wide v15, v4

    .line 288
    :goto_3
    iget v0, v1, Lfj1;->a0:I

    .line 289
    .line 290
    iget-object v1, v1, Lfj1;->U:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-interface {v1}, Lio/flutter/view/TextureRegistry$TextureEntry;->id()J

    .line 296
    .line 297
    .line 298
    move-result-wide v18

    .line 299
    move/from16 v17, v0

    .line 300
    .line 301
    invoke-direct/range {v12 .. v19}, Lmj1;-><init>(DDIJ)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v8, v12}, Lij1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    goto :goto_4

    .line 308
    :catch_0
    new-instance v0, Lln1;

    .line 309
    .line 310
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v5, v0}, Lij1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    :goto_4
    return-void

    .line 317
    :pswitch_1
    iget-object v1, v0, Lqv0;->b:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v1, Lrv0;

    .line 320
    .line 321
    iget-object v4, v0, Lqv0;->c:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v4, Lmw0;

    .line 324
    .line 325
    iget-object v5, v0, Lqv0;->e:Ljava/lang/Object;

    .line 326
    .line 327
    move-object v11, v5

    .line 328
    check-cast v11, Landroid/graphics/Matrix;

    .line 329
    .line 330
    iget-object v5, v0, Lqv0;->d:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v5, Lmw0;

    .line 333
    .line 334
    iget-object v6, v0, Lqv0;->f:Ljava/lang/Object;

    .line 335
    .line 336
    move-object v12, v6

    .line 337
    check-cast v12, Landroid/graphics/Rect;

    .line 338
    .line 339
    iget-object v6, v0, Lqv0;->i:Ljava/lang/Object;

    .line 340
    .line 341
    move-object v13, v6

    .line 342
    check-cast v13, Llv0;

    .line 343
    .line 344
    iget-object v0, v0, Lqv0;->v:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v0, Lum;

    .line 347
    .line 348
    iget-boolean v6, v1, Lrv0;->d0:Z

    .line 349
    .line 350
    if-eqz v6, :cond_a

    .line 351
    .line 352
    invoke-interface {v4}, Lmw0;->x0()Lgw0;

    .line 353
    .line 354
    .line 355
    move-result-object v6

    .line 356
    invoke-interface {v6}, Lgw0;->a()Lnm2;

    .line 357
    .line 358
    .line 359
    move-result-object v7

    .line 360
    invoke-interface {v4}, Lmw0;->x0()Lgw0;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    invoke-interface {v4}, Lgw0;->b()J

    .line 365
    .line 366
    .line 367
    move-result-wide v8

    .line 368
    iget-boolean v4, v1, Lrv0;->e:Z

    .line 369
    .line 370
    if-eqz v4, :cond_7

    .line 371
    .line 372
    move v10, v3

    .line 373
    goto :goto_5

    .line 374
    :cond_7
    iget v1, v1, Lrv0;->b:I

    .line 375
    .line 376
    move v10, v1

    .line 377
    :goto_5
    new-instance v6, Lxf;

    .line 378
    .line 379
    invoke-direct/range {v6 .. v11}, Lxf;-><init>(Lnm2;JILandroid/graphics/Matrix;)V

    .line 380
    .line 381
    .line 382
    new-instance v1, Lwb2;

    .line 383
    .line 384
    invoke-direct {v1, v5, v2, v6}, Lwb2;-><init>(Lmw0;Landroid/util/Size;Lgw0;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12}, Landroid/graphics/Rect;->isEmpty()Z

    .line 388
    .line 389
    .line 390
    move-result v4

    .line 391
    if-nez v4, :cond_9

    .line 392
    .line 393
    new-instance v4, Landroid/graphics/Rect;

    .line 394
    .line 395
    invoke-direct {v4, v12}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 396
    .line 397
    .line 398
    iget v5, v1, Lwb2;->f:I

    .line 399
    .line 400
    iget v6, v1, Lwb2;->i:I

    .line 401
    .line 402
    invoke-virtual {v4, v3, v3, v5, v6}, Landroid/graphics/Rect;->intersect(IIII)Z

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    if-nez v3, :cond_8

    .line 407
    .line 408
    invoke-virtual {v4}, Landroid/graphics/Rect;->setEmpty()V

    .line 409
    .line 410
    .line 411
    :cond_8
    iget-object v3, v1, Lwb2;->d:Ljava/lang/Object;

    .line 412
    .line 413
    monitor-enter v3

    .line 414
    :try_start_1
    monitor-exit v3

    .line 415
    goto :goto_6

    .line 416
    :catchall_0
    move-exception v0

    .line 417
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 418
    throw v0

    .line 419
    :cond_9
    :goto_6
    invoke-interface {v13, v1}, Llv0;->a(Lwb2;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v0, v2}, Lum;->a(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    goto :goto_7

    .line 426
    :cond_a
    new-instance v1, Lkq1;

    .line 427
    .line 428
    const-string v2, "ImageAnalysis is detached"

    .line 429
    .line 430
    invoke-direct {v1, v2}, Lkq1;-><init>(Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0, v1}, Lum;->b(Ljava/lang/Throwable;)Z

    .line 434
    .line 435
    .line 436
    :goto_7
    return-void

    .line 437
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

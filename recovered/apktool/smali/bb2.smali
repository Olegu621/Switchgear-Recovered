.class public final Lbb2;
.super Lab2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public static d(Lzy2;Landroid/util/Size;)Lbb2;
    .locals 8

    .line 1
    sget-object v0, Lzy2;->I:Llf;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {p0, v0, v1}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lio;

    .line 9
    .line 10
    if-eqz v0, :cond_d

    .line 11
    .line 12
    new-instance v0, Lbb2;

    .line 13
    .line 14
    invoke-direct {v0}, Lab2;-><init>()V

    .line 15
    .line 16
    .line 17
    sget-object v2, Lzy2;->G:Llf;

    .line 18
    .line 19
    invoke-interface {p0, v2, v1}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lfb2;

    .line 24
    .line 25
    sget-object v3, Lnq1;->c:Lnq1;

    .line 26
    .line 27
    invoke-static {}, Lfb2;->a()Lfb2;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget-object v4, v4, Lfb2;->g:Ljr;

    .line 32
    .line 33
    iget v4, v4, Ljr;->c:I

    .line 34
    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    iget-object v3, v2, Lfb2;->g:Ljr;

    .line 38
    .line 39
    iget v4, v3, Ljr;->c:I

    .line 40
    .line 41
    iget-object v3, v2, Lfb2;->c:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_1

    .line 52
    .line 53
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    check-cast v5, Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 58
    .line 59
    iget-object v6, v0, Lab2;->c:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-eqz v7, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    iget-object v3, v2, Lfb2;->d:Ljava/util/List;

    .line 73
    .line 74
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_3

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    check-cast v5, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 89
    .line 90
    iget-object v6, v0, Lab2;->d:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-eqz v7, :cond_2

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    iget-object v3, v2, Lfb2;->g:Ljr;

    .line 104
    .line 105
    iget-object v3, v3, Ljr;->d:Ljava/util/List;

    .line 106
    .line 107
    iget-object v5, v0, Lab2;->b:Lir;

    .line 108
    .line 109
    invoke-virtual {v5, v3}, Lir;->b(Ljava/util/Collection;)V

    .line 110
    .line 111
    .line 112
    iget-object v2, v2, Lfb2;->g:Ljr;

    .line 113
    .line 114
    iget-object v3, v2, Ljr;->b:Lnq1;

    .line 115
    .line 116
    :cond_4
    iget-object v2, v0, Lab2;->b:Lir;

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-static {v3}, Luk1;->m(Lty;)Luk1;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    iput-object v3, v2, Lir;->d:Ljava/lang/Object;

    .line 126
    .line 127
    instance-of v2, p0, Lww1;

    .line 128
    .line 129
    if-eqz v2, :cond_7

    .line 130
    .line 131
    sget-object v2, Lxw1;->a:Landroid/util/Rational;

    .line 132
    .line 133
    const-class v2, Landroidx/camera/camera2/internal/compat/quirk/PreviewPixelHDRnetQuirk;

    .line 134
    .line 135
    sget-object v3, Lf80;->a:Ler0;

    .line 136
    .line 137
    invoke-virtual {v3, v2}, Ler0;->h(Ljava/lang/Class;)Lh02;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    check-cast v2, Landroidx/camera/camera2/internal/compat/quirk/PreviewPixelHDRnetQuirk;

    .line 142
    .line 143
    if-nez v2, :cond_5

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_5
    sget-object v2, Lxw1;->a:Landroid/util/Rational;

    .line 147
    .line 148
    new-instance v3, Landroid/util/Rational;

    .line 149
    .line 150
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    invoke-direct {v3, v5, p1}, Landroid/util/Rational;-><init>(II)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v3}, Landroid/util/Rational;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-eqz p1, :cond_6

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_6
    invoke-static {}, Luk1;->j()Luk1;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->TONEMAP_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 173
    .line 174
    const/4 v3, 0x2

    .line 175
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-static {v2}, Lho;->L(Landroid/hardware/camera2/CaptureRequest$Key;)Llf;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {p1, v2, v3}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    new-instance v2, Lho;

    .line 187
    .line 188
    invoke-static {p1}, Lnq1;->d(Lty;)Lnq1;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-direct {v2, p1}, Ld52;-><init>(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    iget-object p1, v0, Lab2;->b:Lir;

    .line 196
    .line 197
    invoke-virtual {p1, v2}, Lir;->e(Lty;)V

    .line 198
    .line 199
    .line 200
    :cond_7
    :goto_2
    new-instance p1, Lho;

    .line 201
    .line 202
    sget-object p1, Lho;->i:Llf;

    .line 203
    .line 204
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-interface {p0, p1, v2}, Lty;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    check-cast p1, Ljava/lang/Integer;

    .line 213
    .line 214
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    iget-object v2, v0, Lab2;->b:Lir;

    .line 219
    .line 220
    iput p1, v2, Lir;->a:I

    .line 221
    .line 222
    new-instance p1, Lsp;

    .line 223
    .line 224
    invoke-direct {p1}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    .line 225
    .line 226
    .line 227
    sget-object v2, Lho;->w:Llf;

    .line 228
    .line 229
    invoke-interface {p0, v2, p1}, Lty;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    check-cast p1, Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 234
    .line 235
    iget-object v2, v0, Lab2;->c:Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-eqz v3, :cond_8

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_8
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    :goto_3
    new-instance p1, Lep;

    .line 248
    .line 249
    invoke-direct {p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;-><init>()V

    .line 250
    .line 251
    .line 252
    sget-object v2, Lho;->U:Llf;

    .line 253
    .line 254
    invoke-interface {p0, v2, p1}, Lty;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    check-cast p1, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 259
    .line 260
    iget-object v2, v0, Lab2;->d:Ljava/util/ArrayList;

    .line 261
    .line 262
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    if-eqz v3, :cond_9

    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_9
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    :goto_4
    new-instance p1, Lbo;

    .line 273
    .line 274
    invoke-direct {p1}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;-><init>()V

    .line 275
    .line 276
    .line 277
    sget-object v2, Lho;->V:Llf;

    .line 278
    .line 279
    invoke-interface {p0, v2, p1}, Lty;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    check-cast p1, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 284
    .line 285
    new-instance v2, Lhr;

    .line 286
    .line 287
    invoke-direct {v2, p1}, Lhr;-><init>(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)V

    .line 288
    .line 289
    .line 290
    iget-object p1, v0, Lab2;->b:Lir;

    .line 291
    .line 292
    invoke-virtual {p1, v2}, Lir;->c(Lmo;)V

    .line 293
    .line 294
    .line 295
    iget-object p1, v0, Lab2;->e:Ljava/util/ArrayList;

    .line 296
    .line 297
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    if-nez v3, :cond_a

    .line 302
    .line 303
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    :cond_a
    sget-object p1, Lzy2;->Q:Llf;

    .line 307
    .line 308
    const/4 v2, 0x0

    .line 309
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-interface {p0, p1, v2}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    check-cast v2, Ljava/lang/Integer;

    .line 318
    .line 319
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 320
    .line 321
    .line 322
    move-result v3

    .line 323
    if-eqz v3, :cond_b

    .line 324
    .line 325
    iget-object v4, v0, Lab2;->b:Lir;

    .line 326
    .line 327
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    if-eqz v3, :cond_b

    .line 331
    .line 332
    iget-object v3, v4, Lir;->d:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v3, Luk1;

    .line 335
    .line 336
    invoke-virtual {v3, p1, v2}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    :cond_b
    invoke-interface {p0}, Lzy2;->v()I

    .line 340
    .line 341
    .line 342
    move-result p1

    .line 343
    if-eqz p1, :cond_c

    .line 344
    .line 345
    iget-object v2, v0, Lab2;->b:Lir;

    .line 346
    .line 347
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    if-eqz p1, :cond_c

    .line 351
    .line 352
    sget-object v3, Lzy2;->P:Llf;

    .line 353
    .line 354
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    iget-object v2, v2, Lir;->d:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v2, Luk1;

    .line 361
    .line 362
    invoke-virtual {v2, v3, p1}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    :cond_c
    invoke-static {}, Luk1;->j()Luk1;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    sget-object v2, Lho;->W:Llf;

    .line 370
    .line 371
    invoke-interface {p0, v2, v1}, Lty;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    check-cast v1, Ljava/lang/String;

    .line 376
    .line 377
    invoke-virtual {p1, v2, v1}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    sget-object v1, Lho;->v:Llf;

    .line 381
    .line 382
    const-wide/16 v2, -0x1

    .line 383
    .line 384
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    invoke-interface {p0, v1, v2}, Lty;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    check-cast v2, Ljava/lang/Long;

    .line 393
    .line 394
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-virtual {p1, v1, v2}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    iget-object v1, v0, Lab2;->b:Lir;

    .line 401
    .line 402
    invoke-virtual {v1, p1}, Lir;->e(Lty;)V

    .line 403
    .line 404
    .line 405
    invoke-static {p0}, Lnr;->b(Lty;)Lnr;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    new-instance p1, Ld52;

    .line 410
    .line 411
    iget-object p0, p0, Lnr;->b:Luk1;

    .line 412
    .line 413
    invoke-static {p0}, Lnq1;->d(Lty;)Lnq1;

    .line 414
    .line 415
    .line 416
    move-result-object p0

    .line 417
    invoke-direct {p1, p0}, Ld52;-><init>(Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    iget-object p0, v0, Lab2;->b:Lir;

    .line 421
    .line 422
    invoke-virtual {p0, p1}, Lir;->e(Lty;)V

    .line 423
    .line 424
    .line 425
    return-object v0

    .line 426
    :cond_d
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object p1

    .line 430
    sget-object v0, Lrm2;->D:Llf;

    .line 431
    .line 432
    invoke-interface {p0, v0, p1}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object p0

    .line 436
    check-cast p0, Ljava/lang/String;

    .line 437
    .line 438
    const-string p1, "Implementation is missing option unpacker for "

    .line 439
    .line 440
    invoke-static {p0, p1}, Lds0;->w(Ljava/lang/Object;Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    return-object v1
.end method


# virtual methods
.method public final a(Lty;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lab2;->b:Lir;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lir;->e(Lty;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(Ld70;Lmb0;I)V
    .locals 1

    .line 1
    invoke-static {p1}, Lmg;->a(Ld70;)Lb5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    iput-object p2, v0, Lb5;->f:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iput-object p2, v0, Lb5;->b:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {v0}, Lb5;->j()Lmg;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iget-object p3, p0, Lab2;->a:Ljava/util/LinkedHashSet;

    .line 20
    .line 21
    invoke-interface {p3, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lab2;->b:Lir;

    .line 25
    .line 26
    iget-object p0, p0, Lir;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Ljava/util/HashSet;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    const-string p0, "Null dynamicRange"

    .line 35
    .line 36
    invoke-static {p0}, Ln4;->s(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final c()Lfb2;
    .locals 9

    .line 1
    new-instance v0, Lfb2;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v2, p0, Lab2;->a:Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v3, p0, Lab2;->c:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    new-instance v3, Ljava/util/ArrayList;

    .line 18
    .line 19
    iget-object v4, p0, Lab2;->d:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    new-instance v4, Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v5, p0, Lab2;->e:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    iget-object v5, p0, Lab2;->b:Lir;

    .line 32
    .line 33
    invoke-virtual {v5}, Lir;->i()Ljr;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    iget-object v6, p0, Lab2;->f:Lcb2;

    .line 38
    .line 39
    iget-object v7, p0, Lab2;->g:Landroid/hardware/camera2/params/InputConfiguration;

    .line 40
    .line 41
    iget-object v8, p0, Lab2;->h:Lmg;

    .line 42
    .line 43
    invoke-direct/range {v0 .. v8}, Lfb2;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljr;Ldb2;Landroid/hardware/camera2/params/InputConfiguration;Lmg;)V

    .line 44
    .line 45
    .line 46
    return-object v0
.end method

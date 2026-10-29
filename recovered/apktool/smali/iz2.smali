.class public final Liz2;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lra2;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lu03;

.field public final synthetic d:Lpg3;

.field public final synthetic e:Ltu1;


# direct methods
.method public constructor <init>(Lra2;Landroid/content/Context;Lu03;Lpg3;Ltu1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Liz2;->a:Lra2;

    .line 2
    .line 3
    iput-object p2, p0, Liz2;->b:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, Liz2;->c:Lu03;

    .line 6
    .line 7
    iput-object p4, p0, Liz2;->d:Lpg3;

    .line 8
    .line 9
    iput-object p5, p0, Liz2;->e:Ltu1;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lh03;->i:Lh03;

    .line 4
    .line 5
    iget-object v2, v1, Liz2;->d:Lpg3;

    .line 6
    .line 7
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v8

    .line 11
    iget-object v11, v1, Liz2;->a:Lra2;

    .line 12
    .line 13
    iget-object v0, v11, Lra2;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lrz2;

    .line 16
    .line 17
    const/4 v15, 0x0

    .line 18
    const/4 v12, 0x1

    .line 19
    const/16 v16, 0x0

    .line 20
    .line 21
    if-nez v0, :cond_5

    .line 22
    .line 23
    iget-object v0, v1, Liz2;->e:Ltu1;

    .line 24
    .line 25
    iget-object v10, v0, Ltu1;->a:Lwu1;

    .line 26
    .line 27
    iget-object v0, v0, Ltu1;->b:Lzt1;

    .line 28
    .line 29
    iget-object v3, v10, Lwu1;->a:Lcw1;

    .line 30
    .line 31
    iget-object v3, v3, Lcw1;->b:Ldw1;

    .line 32
    .line 33
    iget-object v3, v3, Ldw1;->b:Lra2;

    .line 34
    .line 35
    iget-object v3, v3, Lra2;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, Lau1;

    .line 38
    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    sget-object v4, Lqu1;->a:Ld13;

    .line 43
    .line 44
    new-instance v4, Ld13;

    .line 45
    .line 46
    iget-object v5, v0, Lzt1;->b:Ll03;

    .line 47
    .line 48
    invoke-direct {v4, v5}, Ld13;-><init>(Ll03;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, v0, Lzt1;->a:Loz2;

    .line 52
    .line 53
    new-instance v5, Lfs0;

    .line 54
    .line 55
    iget-object v6, v1, Liz2;->c:Lu03;

    .line 56
    .line 57
    invoke-direct {v5, v6}, Lfs0;-><init>(Lu03;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    sput-object v4, Lqu1;->a:Ld13;

    .line 64
    .line 65
    sput-object v0, Lqu1;->b:Loz2;

    .line 66
    .line 67
    sput-object v5, Lqu1;->c:Lfs0;

    .line 68
    .line 69
    sput-object v3, Lqu1;->d:Lau1;

    .line 70
    .line 71
    :goto_0
    iget-object v0, v10, Lwu1;->a:Lcw1;

    .line 72
    .line 73
    iget-object v0, v0, Lcw1;->b:Ldw1;

    .line 74
    .line 75
    iget-object v3, v0, Ldw1;->a:Lur3;

    .line 76
    .line 77
    sget-object v0, Lew2;->Companion:Ldw2;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    sget-object v0, Lwt2;->Companion:Lvt2;

    .line 83
    .line 84
    iget-object v4, v3, Lur3;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v4, Lju1;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    iget-object v0, v4, Lju1;->a:Lcom/usercentrics/sdk/ui/color/UsercentricsShadedColor;

    .line 92
    .line 93
    new-instance v17, Lwt2;

    .line 94
    .line 95
    iget-object v5, v0, Lcom/usercentrics/sdk/ui/color/UsercentricsShadedColor;->a:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v5}, Lxe2;->B(Ljava/lang/String;)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v18

    .line 101
    iget-object v5, v0, Lcom/usercentrics/sdk/ui/color/UsercentricsShadedColor;->b:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {v5}, Lxe2;->B(Ljava/lang/String;)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v19

    .line 107
    iget-object v5, v0, Lcom/usercentrics/sdk/ui/color/UsercentricsShadedColor;->c:Ljava/lang/String;

    .line 108
    .line 109
    invoke-static {v5}, Lxe2;->B(Ljava/lang/String;)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v20

    .line 113
    iget-object v0, v0, Lcom/usercentrics/sdk/ui/color/UsercentricsShadedColor;->d:Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {v0}, Lxe2;->B(Ljava/lang/String;)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v21

    .line 119
    iget-object v0, v4, Lju1;->h:Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {v0}, Lxe2;->B(Ljava/lang/String;)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v22

    .line 125
    iget-object v0, v4, Lju1;->i:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v0}, Lxe2;->B(Ljava/lang/String;)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v23

    .line 131
    iget-object v0, v4, Lju1;->k:Ljava/lang/String;

    .line 132
    .line 133
    invoke-static {v0}, Lxe2;->B(Ljava/lang/String;)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object v24

    .line 137
    iget-object v0, v4, Lju1;->j:Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {v0}, Lxe2;->B(Ljava/lang/String;)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v25

    .line 143
    iget-object v0, v4, Lju1;->l:Ljava/lang/String;

    .line 144
    .line 145
    iget-wide v5, v4, Lju1;->m:D

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-static {v0}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    if-eqz v7, :cond_1

    .line 155
    .line 156
    const-string v0, ""

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_1
    const-wide v13, 0x406fe00000000000L    # 255.0

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    mul-double/2addr v5, v13

    .line 165
    invoke-static {v5, v6}, Ljd1;->b(D)J

    .line 166
    .line 167
    .line 168
    move-result-wide v5

    .line 169
    invoke-static {v5, v6}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    if-ne v6, v12, :cond_2

    .line 178
    .line 179
    const-string v6, "0"

    .line 180
    .line 181
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    :cond_2
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    const/16 v7, 0x23

    .line 190
    .line 191
    if-ne v6, v7, :cond_3

    .line 192
    .line 193
    invoke-virtual {v0, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    goto :goto_1

    .line 202
    :cond_3
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    :goto_1
    invoke-static {v0}, Lxe2;->B(Ljava/lang/String;)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object v26

    .line 210
    iget-object v0, v4, Lju1;->n:Ljava/lang/String;

    .line 211
    .line 212
    invoke-static {v0}, Lxe2;->B(Ljava/lang/String;)Ljava/lang/Integer;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result v27

    .line 223
    invoke-direct/range {v17 .. v27}, Lwt2;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;I)V

    .line 224
    .line 225
    .line 226
    sget-object v0, Lwu2;->Companion:Lvu2;

    .line 227
    .line 228
    iget-object v5, v3, Lur3;->c:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v5, Llu1;

    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    new-instance v6, Lwu2;

    .line 236
    .line 237
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    sget-object v0, Luu2;->Companion:Ltu2;

    .line 248
    .line 249
    iget v5, v5, Llu1;->a:I

    .line 250
    .line 251
    int-to-float v5, v5

    .line 252
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    new-instance v0, Luu2;

    .line 256
    .line 257
    const/high16 v7, 0x40000000    # 2.0f

    .line 258
    .line 259
    add-float v9, v5, v7

    .line 260
    .line 261
    sub-float v7, v5, v7

    .line 262
    .line 263
    const/high16 v13, 0x40800000    # 4.0f

    .line 264
    .line 265
    sub-float v13, v5, v13

    .line 266
    .line 267
    invoke-direct {v0, v9, v5, v7, v13}, Luu2;-><init>(FFFF)V

    .line 268
    .line 269
    .line 270
    invoke-direct {v6, v0}, Lwu2;-><init>(Luu2;)V

    .line 271
    .line 272
    .line 273
    sget-object v0, Lhw2;->Companion:Lgw2;

    .line 274
    .line 275
    iget-object v5, v4, Lju1;->g:Lxy1;

    .line 276
    .line 277
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    :try_start_0
    sget-object v0, Lo42;->b:Lm42;

    .line 281
    .line 282
    new-instance v18, Lhw2;

    .line 283
    .line 284
    iget-object v0, v5, Lxy1;->a:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v0, Ljava/lang/String;

    .line 287
    .line 288
    invoke-static {v0}, Lxe2;->B(Ljava/lang/String;)Ljava/lang/Integer;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 296
    .line 297
    .line 298
    move-result v19

    .line 299
    iget-object v0, v5, Lxy1;->c:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v0, Ljava/lang/String;

    .line 302
    .line 303
    invoke-static {v0}, Lxe2;->B(Ljava/lang/String;)Ljava/lang/Integer;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 311
    .line 312
    .line 313
    move-result v20

    .line 314
    iget-object v0, v5, Lxy1;->d:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v0, Ljava/lang/String;

    .line 317
    .line 318
    invoke-static {v0}, Lxe2;->B(Ljava/lang/String;)Ljava/lang/Integer;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 326
    .line 327
    .line 328
    move-result v21

    .line 329
    iget-object v0, v5, Lxy1;->e:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v0, Ljava/lang/String;

    .line 332
    .line 333
    invoke-static {v0}, Lxe2;->B(Ljava/lang/String;)Ljava/lang/Integer;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 341
    .line 342
    .line 343
    move-result v22

    .line 344
    iget-object v0, v5, Lxy1;->f:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v0, Ljava/lang/String;

    .line 347
    .line 348
    invoke-static {v0}, Lxe2;->B(Ljava/lang/String;)Ljava/lang/Integer;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 356
    .line 357
    .line 358
    move-result v23

    .line 359
    iget-object v0, v5, Lxy1;->b:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v0, Ljava/lang/String;

    .line 362
    .line 363
    invoke-static {v0}, Lxe2;->B(Ljava/lang/String;)Ljava/lang/Integer;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 371
    .line 372
    .line 373
    move-result v24

    .line 374
    invoke-direct/range {v18 .. v24}, Lhw2;-><init>(IIIIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 375
    .line 376
    .line 377
    move-object/from16 v5, v18

    .line 378
    .line 379
    goto :goto_2

    .line 380
    :catchall_0
    move-exception v0

    .line 381
    sget-object v5, Lo42;->b:Lm42;

    .line 382
    .line 383
    new-instance v5, Ln42;

    .line 384
    .line 385
    invoke-direct {v5, v0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 386
    .line 387
    .line 388
    :goto_2
    instance-of v0, v5, Ln42;

    .line 389
    .line 390
    if-eqz v0, :cond_4

    .line 391
    .line 392
    move-object/from16 v5, v16

    .line 393
    .line 394
    :cond_4
    move-object/from16 v20, v5

    .line 395
    .line 396
    check-cast v20, Lhw2;

    .line 397
    .line 398
    iget v0, v3, Lur3;->a:I

    .line 399
    .line 400
    sget-object v3, Lit2;->Companion:Lht2;

    .line 401
    .line 402
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    new-instance v21, Lit2;

    .line 406
    .line 407
    sget-object v3, Let2;->Companion:Ldt2;

    .line 408
    .line 409
    iget-object v5, v4, Lju1;->b:Lbx0;

    .line 410
    .line 411
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    invoke-static {v5}, Ldt2;->a(Lbx0;)Let2;

    .line 415
    .line 416
    .line 417
    move-result-object v22

    .line 418
    iget-object v3, v4, Lju1;->c:Lbx0;

    .line 419
    .line 420
    invoke-static {v3}, Ldt2;->a(Lbx0;)Let2;

    .line 421
    .line 422
    .line 423
    move-result-object v23

    .line 424
    iget-object v3, v4, Lju1;->f:Lbx0;

    .line 425
    .line 426
    invoke-static {v3}, Ldt2;->a(Lbx0;)Let2;

    .line 427
    .line 428
    .line 429
    move-result-object v24

    .line 430
    iget-object v3, v4, Lju1;->d:Lbx0;

    .line 431
    .line 432
    invoke-static {v3}, Ldt2;->a(Lbx0;)Let2;

    .line 433
    .line 434
    .line 435
    move-result-object v25

    .line 436
    iget-object v3, v4, Lju1;->e:Lbx0;

    .line 437
    .line 438
    invoke-static {v3}, Ldt2;->a(Lbx0;)Let2;

    .line 439
    .line 440
    .line 441
    move-result-object v26

    .line 442
    invoke-direct/range {v21 .. v26}, Lit2;-><init>(Let2;Let2;Let2;Let2;Let2;)V

    .line 443
    .line 444
    .line 445
    new-instance v5, Lew2;

    .line 446
    .line 447
    move/from16 v22, v0

    .line 448
    .line 449
    move-object/from16 v19, v6

    .line 450
    .line 451
    move-object/from16 v18, v17

    .line 452
    .line 453
    move-object/from16 v17, v5

    .line 454
    .line 455
    invoke-direct/range {v17 .. v22}, Lew2;-><init>(Lwt2;Lwu2;Lhw2;Lit2;I)V

    .line 456
    .line 457
    .line 458
    new-instance v3, Lrz2;

    .line 459
    .line 460
    iget-object v0, v11, Lra2;->a:Ljava/lang/Object;

    .line 461
    .line 462
    move-object v6, v0

    .line 463
    check-cast v6, Loh;

    .line 464
    .line 465
    new-instance v9, Lts0;

    .line 466
    .line 467
    invoke-direct {v9, v11}, Lts0;-><init>(Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    iget-object v4, v1, Liz2;->b:Landroid/content/Context;

    .line 471
    .line 472
    const/4 v7, 0x0

    .line 473
    invoke-direct/range {v3 .. v10}, Lrz2;-><init>(Landroid/content/Context;Lew2;Loh;Ljava/lang/Integer;ZLts0;Lwu1;)V

    .line 474
    .line 475
    .line 476
    iput-object v3, v11, Lra2;->b:Ljava/lang/Object;

    .line 477
    .line 478
    move-object v0, v3

    .line 479
    :cond_5
    iget-object v1, v0, Lrz2;->d:Lwu1;

    .line 480
    .line 481
    iget-object v3, v1, Lwu1;->a:Lcw1;

    .line 482
    .line 483
    iget-object v3, v3, Lcw1;->b:Ldw1;

    .line 484
    .line 485
    iget-object v4, v3, Ldw1;->c:Ljw2;

    .line 486
    .line 487
    move-object v5, v4

    .line 488
    iget-object v4, v1, Lwu1;->b:Lac1;

    .line 489
    .line 490
    iget-object v3, v3, Ldw1;->b:Lra2;

    .line 491
    .line 492
    iget-object v3, v3, Lra2;->c:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v3, Lec0;

    .line 495
    .line 496
    iget-object v6, v0, Lrz2;->a:Lew2;

    .line 497
    .line 498
    iget-object v7, v0, Lrz2;->b:Loh;

    .line 499
    .line 500
    iget-object v7, v7, Loh;->b:Lgj0;

    .line 501
    .line 502
    iget-object v10, v0, Lrz2;->c:Lts0;

    .line 503
    .line 504
    iget-object v11, v0, Lrz2;->g:Lac1;

    .line 505
    .line 506
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    iget-object v8, v0, Lrz2;->f:Lhk2;

    .line 510
    .line 511
    invoke-virtual {v8}, Lhk2;->getValue()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v8

    .line 515
    check-cast v8, Ljava/lang/Boolean;

    .line 516
    .line 517
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 518
    .line 519
    .line 520
    move-result v8

    .line 521
    iget-object v9, v0, Lrz2;->k:Lhk2;

    .line 522
    .line 523
    invoke-virtual {v9}, Lhk2;->getValue()Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v9

    .line 527
    check-cast v9, Lo61;

    .line 528
    .line 529
    iget-object v1, v1, Lwu1;->a:Lcw1;

    .line 530
    .line 531
    iget-object v1, v1, Lcw1;->b:Ldw1;

    .line 532
    .line 533
    iget-object v1, v1, Ldw1;->b:Lra2;

    .line 534
    .line 535
    iget-object v1, v1, Lra2;->d:Ljava/lang/Object;

    .line 536
    .line 537
    move-object v13, v1

    .line 538
    check-cast v13, Lau1;

    .line 539
    .line 540
    new-instance v1, Lsu2;

    .line 541
    .line 542
    move v14, v12

    .line 543
    move v12, v8

    .line 544
    const/4 v8, 0x0

    .line 545
    move/from16 v17, v14

    .line 546
    .line 547
    const/4 v14, 0x0

    .line 548
    move-object/from16 v28, v5

    .line 549
    .line 550
    move-object v5, v3

    .line 551
    move-object/from16 v3, v28

    .line 552
    .line 553
    invoke-direct/range {v1 .. v14}, Lsu2;-><init>(Lpg3;Ljw2;Lac1;Lec0;Lew2;Lgj0;Lyz2;Lo61;Lts0;Lac1;ZLau1;Ljava/lang/Integer;)V

    .line 554
    .line 555
    .line 556
    iget-object v0, v0, Lrz2;->i:Lys2;

    .line 557
    .line 558
    if-eqz v0, :cond_e

    .line 559
    .line 560
    iget-object v3, v0, Lys2;->d:Landroid/widget/FrameLayout;

    .line 561
    .line 562
    iget-object v4, v0, Lys2;->b:Lz00;

    .line 563
    .line 564
    iget-object v5, v0, Lys2;->a:Lew2;

    .line 565
    .line 566
    iget v6, v5, Lew2;->e:I

    .line 567
    .line 568
    int-to-float v6, v6

    .line 569
    invoke-static {v6, v4}, Lyy1;->n(FLandroid/content/Context;)F

    .line 570
    .line 571
    .line 572
    move-result v6

    .line 573
    iget-object v7, v5, Lew2;->a:Lwt2;

    .line 574
    .line 575
    iget-object v7, v7, Lwt2;->e:Ljava/lang/Integer;

    .line 576
    .line 577
    instance-of v8, v2, Lh03;

    .line 578
    .line 579
    const/4 v9, -0x2

    .line 580
    const/4 v10, -0x1

    .line 581
    const/16 v11, 0x50

    .line 582
    .line 583
    if-eqz v8, :cond_8

    .line 584
    .line 585
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    invoke-virtual {v0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 593
    .line 594
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 595
    .line 596
    .line 597
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 598
    .line 599
    .line 600
    move-result-object v16

    .line 601
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 602
    .line 603
    .line 604
    move-result-object v17

    .line 605
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 606
    .line 607
    .line 608
    move-result-object v18

    .line 609
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 610
    .line 611
    .line 612
    move-result-object v19

    .line 613
    const/4 v2, 0x0

    .line 614
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 615
    .line 616
    .line 617
    move-result-object v20

    .line 618
    move-object/from16 v21, v20

    .line 619
    .line 620
    move-object/from16 v22, v20

    .line 621
    .line 622
    move-object/from16 v23, v20

    .line 623
    .line 624
    filled-new-array/range {v16 .. v23}, [Ljava/lang/Float;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    invoke-static {v2}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 633
    .line 634
    .line 635
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 636
    .line 637
    .line 638
    move-result v6

    .line 639
    new-array v6, v6, [F

    .line 640
    .line 641
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    move v8, v15

    .line 646
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 647
    .line 648
    .line 649
    move-result v12

    .line 650
    if-eqz v12, :cond_6

    .line 651
    .line 652
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v12

    .line 656
    check-cast v12, Ljava/lang/Number;

    .line 657
    .line 658
    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    .line 659
    .line 660
    .line 661
    move-result v12

    .line 662
    add-int/lit8 v13, v8, 0x1

    .line 663
    .line 664
    aput v12, v6, v8

    .line 665
    .line 666
    move v8, v13

    .line 667
    goto :goto_3

    .line 668
    :cond_6
    invoke-virtual {v0, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 669
    .line 670
    .line 671
    if-eqz v7, :cond_7

    .line 672
    .line 673
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 674
    .line 675
    .line 676
    move-result v2

    .line 677
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 678
    .line 679
    .line 680
    :cond_7
    invoke-virtual {v3, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 681
    .line 682
    .line 683
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 684
    .line 685
    invoke-direct {v0, v10, v9, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v0, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v0, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 692
    .line 693
    .line 694
    const/high16 v2, 0x41c00000    # 24.0f

    .line 695
    .line 696
    invoke-static {v2, v4}, Lyy1;->n(FLandroid/content/Context;)F

    .line 697
    .line 698
    .line 699
    move-result v2

    .line 700
    float-to-int v2, v2

    .line 701
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 702
    .line 703
    invoke-virtual {v3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 704
    .line 705
    .line 706
    goto :goto_5

    .line 707
    :cond_8
    instance-of v8, v2, Lg03;

    .line 708
    .line 709
    if-eqz v8, :cond_c

    .line 710
    .line 711
    check-cast v2, Lg03;

    .line 712
    .line 713
    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    .line 714
    .line 715
    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v8, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 719
    .line 720
    .line 721
    if-eqz v7, :cond_9

    .line 722
    .line 723
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 724
    .line 725
    .line 726
    move-result v6

    .line 727
    invoke-virtual {v8, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 728
    .line 729
    .line 730
    :cond_9
    invoke-virtual {v3, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 731
    .line 732
    .line 733
    iget-object v2, v2, Lg03;->i:Lpt1;

    .line 734
    .line 735
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 736
    .line 737
    .line 738
    move-result v2

    .line 739
    if-eqz v2, :cond_b

    .line 740
    .line 741
    const/4 v14, 0x1

    .line 742
    if-ne v2, v14, :cond_a

    .line 743
    .line 744
    const/16 v11, 0x11

    .line 745
    .line 746
    goto :goto_4

    .line 747
    :cond_a
    invoke-static {}, Lds0;->b()V

    .line 748
    .line 749
    .line 750
    return-object v16

    .line 751
    :cond_b
    :goto_4
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 752
    .line 753
    .line 754
    move-result-object v2

    .line 755
    invoke-virtual {v0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 756
    .line 757
    .line 758
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 759
    .line 760
    invoke-direct {v2, v10, v9, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 761
    .line 762
    .line 763
    new-instance v6, Lf8;

    .line 764
    .line 765
    const/16 v7, 0xb

    .line 766
    .line 767
    invoke-direct {v6, v0, v7}, Lf8;-><init>(Ljava/lang/Object;I)V

    .line 768
    .line 769
    .line 770
    invoke-static {v6}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v6

    .line 778
    check-cast v6, Ljava/lang/Number;

    .line 779
    .line 780
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 781
    .line 782
    .line 783
    move-result v6

    .line 784
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    check-cast v0, Ljava/lang/Number;

    .line 789
    .line 790
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 791
    .line 792
    .line 793
    move-result v0

    .line 794
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 795
    .line 796
    .line 797
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 798
    .line 799
    .line 800
    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 801
    .line 802
    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 803
    .line 804
    invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 805
    .line 806
    .line 807
    goto :goto_5

    .line 808
    :cond_c
    instance-of v2, v2, Lf03;

    .line 809
    .line 810
    if-eqz v2, :cond_d

    .line 811
    .line 812
    invoke-virtual {v0, v7}, Lys2;->a(Ljava/lang/Integer;)V

    .line 813
    .line 814
    .line 815
    :cond_d
    :goto_5
    invoke-virtual {v3}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 816
    .line 817
    .line 818
    new-instance v0, Lqu2;

    .line 819
    .line 820
    invoke-direct {v0, v4, v5, v1}, Lqu2;-><init>(Lz00;Lew2;Lsu2;)V

    .line 821
    .line 822
    .line 823
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 824
    .line 825
    .line 826
    :cond_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 827
    .line 828
    return-object v0
.end method

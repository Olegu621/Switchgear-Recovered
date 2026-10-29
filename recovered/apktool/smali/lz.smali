.class public final Llz;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 15
    iput p1, p0, Llz;->a:I

    iput-object p2, p0, Llz;->b:Ljava/lang/Object;

    iput-object p3, p0, Llz;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lgj0;Lyz2;Lsu2;)V
    .locals 0

    const/4 p1, 0x7

    iput p1, p0, Llz;->a:I

    .line 14
    iput-object p2, p0, Llz;->b:Ljava/lang/Object;

    iput-object p3, p0, Llz;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;La13;Lbz;)V
    .locals 0

    .line 1
    const/16 p3, 0xd

    .line 2
    .line 3
    iput p3, p0, Llz;->a:I

    .line 4
    .line 5
    iput-object p1, p0, Llz;->b:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p2, p0, Llz;->c:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Llz;->a:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    iget-object v5, p0, Llz;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Llz;->b:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, Lts0;

    .line 15
    .line 16
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lm73;

    .line 19
    .line 20
    check-cast v5, Ldl0;

    .line 21
    .line 22
    invoke-interface {p0, v5}, Lm73;->b(Ldl0;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    check-cast p0, Lb5;

    .line 29
    .line 30
    iget-object p0, p0, Lb5;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Lth;

    .line 33
    .line 34
    new-instance v0, Lo;

    .line 35
    .line 36
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 37
    .line 38
    const/16 v1, 0x1b

    .line 39
    .line 40
    invoke-direct {v0, v5, v1}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lth;->b:Lac2;

    .line 44
    .line 45
    iget-object v1, v1, Lac2;->c:Lk61;

    .line 46
    .line 47
    iget-object v3, p0, Lth;->h:Lx80;

    .line 48
    .line 49
    new-instance v5, Lqh;

    .line 50
    .line 51
    invoke-direct {v5, p0, v1, v4, v2}, Lqh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v5}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    new-instance v4, Lsh;

    .line 59
    .line 60
    invoke-direct {v4, v2, p0, v0, v1}, Lsh;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v4}, Lec;->H(Lkotlin/jvm/functions/Function1;)V

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_1
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 70
    .line 71
    check-cast v5, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 72
    .line 73
    invoke-interface {p0, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_2
    new-instance v0, Lvz2;

    .line 80
    .line 81
    const-string v1, "Clear User Session failed"

    .line 82
    .line 83
    check-cast p0, Ljava/lang/Throwable;

    .line 84
    .line 85
    invoke-direct {v0, v1, p0}, Lvz2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    new-instance p0, Ltz2;

    .line 89
    .line 90
    invoke-direct {p0, v0}, Ltz2;-><init>(Lvz2;)V

    .line 91
    .line 92
    .line 93
    check-cast v5, La13;

    .line 94
    .line 95
    iget-object v0, v5, La13;->a:Lfb1;

    .line 96
    .line 97
    invoke-virtual {v0}, Lfb1;->e()Li03;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-interface {v0, p0}, Li03;->d(Ltz2;)V

    .line 102
    .line 103
    .line 104
    invoke-static {p0}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->k(Ltz2;)Lkotlin/Unit;

    .line 105
    .line 106
    .line 107
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_3
    check-cast p0, Loc;

    .line 111
    .line 112
    new-instance v0, Ltz2;

    .line 113
    .line 114
    new-instance v1, Lvz2;

    .line 115
    .line 116
    const-string v2, ""

    .line 117
    .line 118
    check-cast v5, Ljava/lang/Throwable;

    .line 119
    .line 120
    invoke-direct {v1, v2, v5}, Lvz2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    invoke-direct {v0, v1}, Ltz2;-><init>(Lvz2;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v0}, Loc;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object p0

    .line 132
    :pswitch_4
    sget-object v0, Le03;->a:Le03;

    .line 133
    .line 134
    invoke-static {}, Le03;->e()Lfb1;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    if-eqz v0, :cond_0

    .line 139
    .line 140
    invoke-virtual {v0}, Lfb1;->e()Li03;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-eqz v0, :cond_0

    .line 145
    .line 146
    const-string v1, "Initialize is being invoked more than once, make sure this is the intended behaviour."

    .line 147
    .line 148
    invoke-interface {v0, v1, v4}, Li03;->c(Ljava/lang/String;Lvz2;)V

    .line 149
    .line 150
    .line 151
    :cond_0
    check-cast p0, Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 152
    .line 153
    check-cast v5, Landroid/content/Context;

    .line 154
    .line 155
    invoke-static {v5, p0}, Le03;->c(Landroid/content/Context;Lcom/usercentrics/sdk/UsercentricsOptions;)V

    .line 156
    .line 157
    .line 158
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    return-object p0

    .line 161
    :pswitch_5
    check-cast p0, Lwe2;

    .line 162
    .line 163
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p0, Ln01;

    .line 166
    .line 167
    check-cast v5, Ltv1;

    .line 168
    .line 169
    invoke-virtual {p0, v5}, Ln01;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object p0

    .line 175
    :pswitch_6
    check-cast p0, Lwe2;

    .line 176
    .line 177
    iget-object p0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast p0, Ln01;

    .line 180
    .line 181
    check-cast v5, Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {p0, v5}, Ln01;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object p0

    .line 189
    :pswitch_7
    check-cast p0, Lcom/usercentrics/sdk/ui/secondLayer/component/footer/UCSecondLayerFooter;

    .line 190
    .line 191
    iget-object p0, p0, Lcom/usercentrics/sdk/ui/secondLayer/component/footer/UCSecondLayerFooter;->l0:Lnv2;

    .line 192
    .line 193
    if-eqz p0, :cond_1

    .line 194
    .line 195
    check-cast v5, Lgt2;

    .line 196
    .line 197
    iget-object v0, v5, Lgt2;->f:Lkt2;

    .line 198
    .line 199
    iget-object p0, p0, Lnv2;->f:Lyv2;

    .line 200
    .line 201
    invoke-virtual {p0, v0}, Lyv2;->c(Lkt2;)V

    .line 202
    .line 203
    .line 204
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 205
    .line 206
    return-object p0

    .line 207
    :cond_1
    const-string p0, "viewModel"

    .line 208
    .line 209
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw v4

    .line 213
    :pswitch_8
    new-instance v0, Lru2;

    .line 214
    .line 215
    check-cast v5, Lsu2;

    .line 216
    .line 217
    const/4 v2, 0x5

    .line 218
    invoke-direct {v0, v5, v2}, Lru2;-><init>(Lsu2;I)V

    .line 219
    .line 220
    .line 221
    invoke-static {v0}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    new-instance v2, Lru2;

    .line 226
    .line 227
    invoke-direct {v2, v5, v1}, Lru2;-><init>(Lsu2;I)V

    .line 228
    .line 229
    .line 230
    invoke-static {v2}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    check-cast p0, Lyz2;

    .line 235
    .line 236
    if-eqz p0, :cond_2

    .line 237
    .line 238
    new-instance v4, Lut0;

    .line 239
    .line 240
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    check-cast v0, Lq82;

    .line 245
    .line 246
    invoke-direct {v4, p0, v0}, Lut0;-><init>(Lyz2;Lq82;)V

    .line 247
    .line 248
    .line 249
    goto :goto_0

    .line 250
    :cond_2
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    check-cast p0, Lyz2;

    .line 255
    .line 256
    if-eqz p0, :cond_3

    .line 257
    .line 258
    new-instance v4, Lut0;

    .line 259
    .line 260
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    check-cast p0, Lyz2;

    .line 265
    .line 266
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    check-cast v0, Lq82;

    .line 274
    .line 275
    invoke-direct {v4, p0, v0}, Lut0;-><init>(Lyz2;Lq82;)V

    .line 276
    .line 277
    .line 278
    :cond_3
    :goto_0
    return-object v4

    .line 279
    :pswitch_9
    sget-object v0, Lgt2;->Companion:Lft2;

    .line 280
    .line 281
    check-cast p0, Lsu2;

    .line 282
    .line 283
    iget-object v1, p0, Lsu2;->v:Lhk2;

    .line 284
    .line 285
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    check-cast v1, Lju2;

    .line 290
    .line 291
    if-eqz v1, :cond_4

    .line 292
    .line 293
    move v2, v3

    .line 294
    :cond_4
    check-cast v5, Lgj0;

    .line 295
    .line 296
    if-eqz v5, :cond_5

    .line 297
    .line 298
    iget-object v4, v5, Lgj0;->a:Lkl;

    .line 299
    .line 300
    :cond_5
    iget-object v1, p0, Lsu2;->o:Lhk2;

    .line 301
    .line 302
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    check-cast v1, Ljava/util/List;

    .line 307
    .line 308
    iget-object v3, p0, Lsu2;->e:Lew2;

    .line 309
    .line 310
    iget-object p0, p0, Lsu2;->d:Lec0;

    .line 311
    .line 312
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    invoke-static {v2, v4, v1, v3, p0}, Lft2;->b(ZLkl;Ljava/util/List;Lew2;Lec0;)Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    return-object p0

    .line 320
    :pswitch_a
    new-instance v0, Landroidx/core/widget/NestedScrollView;

    .line 321
    .line 322
    check-cast p0, Landroid/content/Context;

    .line 323
    .line 324
    invoke-direct {v0, p0, v4}, Landroidx/core/widget/NestedScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 325
    .line 326
    .line 327
    check-cast v5, Lqu2;

    .line 328
    .line 329
    sget p0, Lcom/usercentrics/sdk/ui/R$id;->ucBannerFirstLayerScrollContainer:I

    .line 330
    .line 331
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v5, v3}, Landroidx/appcompat/widget/LinearLayoutCompat;->setOrientation(I)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0, v3}, Landroidx/core/widget/NestedScrollView;->setFillViewport(Z)V

    .line 338
    .line 339
    .line 340
    return-object v0

    .line 341
    :pswitch_b
    check-cast p0, Lsu2;

    .line 342
    .line 343
    check-cast v5, Lgt2;

    .line 344
    .line 345
    iget-object v0, v5, Lgt2;->f:Lkt2;

    .line 346
    .line 347
    iget-object v2, p0, Lsu2;->g:Lts0;

    .line 348
    .line 349
    iget-object v5, p0, Lsu2;->c:Lac1;

    .line 350
    .line 351
    iget-object v6, p0, Lsu2;->h:Lac1;

    .line 352
    .line 353
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    if-eqz v0, :cond_c

    .line 358
    .line 359
    if-eq v0, v3, :cond_b

    .line 360
    .line 361
    const/4 v3, 0x2

    .line 362
    if-eq v0, v3, :cond_9

    .line 363
    .line 364
    const/4 v3, 0x3

    .line 365
    if-eq v0, v3, :cond_8

    .line 366
    .line 367
    if-eq v0, v1, :cond_6

    .line 368
    .line 369
    goto :goto_2

    .line 370
    :cond_6
    iget-object p0, p0, Lsu2;->k:Ljava/lang/Boolean;

    .line 371
    .line 372
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 373
    .line 374
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result p0

    .line 378
    if-eqz p0, :cond_7

    .line 379
    .line 380
    sget-object p0, Lwk2;->b:Lwk2;

    .line 381
    .line 382
    invoke-virtual {v6}, Lac1;->y()Ljava/util/ArrayList;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-virtual {v5, p0, v0}, Lac1;->g(Lwk2;Ljava/util/ArrayList;)Lcom/usercentrics/sdk/ui/PredefinedUIResponse;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    goto :goto_1

    .line 391
    :cond_7
    sget-object p0, Lwk2;->b:Lwk2;

    .line 392
    .line 393
    invoke-virtual {v5, p0}, Lac1;->c(Lwk2;)Lcom/usercentrics/sdk/ui/PredefinedUIResponse;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    :goto_1
    invoke-static {p0}, Lhe3;->u(Lcom/usercentrics/sdk/ui/PredefinedUIResponse;)Lnz2;

    .line 398
    .line 399
    .line 400
    move-result-object p0

    .line 401
    invoke-virtual {v2, p0}, Lts0;->g(Lnz2;)V

    .line 402
    .line 403
    .line 404
    goto :goto_2

    .line 405
    :cond_8
    invoke-virtual {p0, v4}, Lsu2;->c(Ljava/lang/Integer;)V

    .line 406
    .line 407
    .line 408
    goto :goto_2

    .line 409
    :cond_9
    invoke-virtual {v6}, Lac1;->y()Ljava/util/ArrayList;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    if-eqz v0, :cond_a

    .line 418
    .line 419
    invoke-virtual {p0, v4}, Lsu2;->c(Ljava/lang/Integer;)V

    .line 420
    .line 421
    .line 422
    goto :goto_2

    .line 423
    :cond_a
    sget-object p0, Lwk2;->b:Lwk2;

    .line 424
    .line 425
    invoke-virtual {v6}, Lac1;->y()Ljava/util/ArrayList;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-virtual {v5, p0, v0}, Lac1;->L(Lwk2;Ljava/util/ArrayList;)Lcom/usercentrics/sdk/ui/PredefinedUIResponse;

    .line 430
    .line 431
    .line 432
    move-result-object p0

    .line 433
    invoke-static {p0}, Lhe3;->u(Lcom/usercentrics/sdk/ui/PredefinedUIResponse;)Lnz2;

    .line 434
    .line 435
    .line 436
    move-result-object p0

    .line 437
    invoke-virtual {v2, p0}, Lts0;->g(Lnz2;)V

    .line 438
    .line 439
    .line 440
    goto :goto_2

    .line 441
    :cond_b
    sget-object p0, Lwk2;->b:Lwk2;

    .line 442
    .line 443
    invoke-virtual {v6}, Lac1;->y()Ljava/util/ArrayList;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-virtual {v5, p0, v0}, Lac1;->g(Lwk2;Ljava/util/ArrayList;)Lcom/usercentrics/sdk/ui/PredefinedUIResponse;

    .line 448
    .line 449
    .line 450
    move-result-object p0

    .line 451
    invoke-static {p0}, Lhe3;->u(Lcom/usercentrics/sdk/ui/PredefinedUIResponse;)Lnz2;

    .line 452
    .line 453
    .line 454
    move-result-object p0

    .line 455
    invoke-virtual {v2, p0}, Lts0;->g(Lnz2;)V

    .line 456
    .line 457
    .line 458
    goto :goto_2

    .line 459
    :cond_c
    sget-object p0, Lwk2;->b:Lwk2;

    .line 460
    .line 461
    invoke-virtual {v5, p0}, Lac1;->c(Lwk2;)Lcom/usercentrics/sdk/ui/PredefinedUIResponse;

    .line 462
    .line 463
    .line 464
    move-result-object p0

    .line 465
    invoke-static {p0}, Lhe3;->u(Lcom/usercentrics/sdk/ui/PredefinedUIResponse;)Lnz2;

    .line 466
    .line 467
    .line 468
    move-result-object p0

    .line 469
    invoke-virtual {v2, p0}, Lts0;->g(Lnz2;)V

    .line 470
    .line 471
    .line 472
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 473
    .line 474
    return-object p0

    .line 475
    :pswitch_c
    check-cast p0, Ljava/util/List;

    .line 476
    .line 477
    check-cast v5, Lew2;

    .line 478
    .line 479
    new-instance v0, Ljava/util/ArrayList;

    .line 480
    .line 481
    const/16 v1, 0xa

    .line 482
    .line 483
    invoke-static {p0, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 484
    .line 485
    .line 486
    move-result v2

    .line 487
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 488
    .line 489
    .line 490
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 491
    .line 492
    .line 493
    move-result-object p0

    .line 494
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 495
    .line 496
    .line 497
    move-result v2

    .line 498
    if-eqz v2, :cond_e

    .line 499
    .line 500
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    check-cast v2, Ljava/util/List;

    .line 505
    .line 506
    new-instance v3, Ljava/util/ArrayList;

    .line 507
    .line 508
    invoke-static {v2, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 509
    .line 510
    .line 511
    move-result v4

    .line 512
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 513
    .line 514
    .line 515
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 520
    .line 521
    .line 522
    move-result v4

    .line 523
    if-eqz v4, :cond_d

    .line 524
    .line 525
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v4

    .line 529
    check-cast v4, Luu1;

    .line 530
    .line 531
    sget-object v6, Lgt2;->Companion:Lft2;

    .line 532
    .line 533
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    invoke-static {v4, v5}, Lft2;->a(Luu1;Lew2;)Lgt2;

    .line 537
    .line 538
    .line 539
    move-result-object v4

    .line 540
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    goto :goto_4

    .line 544
    :cond_d
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    goto :goto_3

    .line 548
    :cond_e
    return-object v0

    .line 549
    :pswitch_d
    check-cast p0, Loe0;

    .line 550
    .line 551
    check-cast v5, Ljava/lang/String;

    .line 552
    .line 553
    new-instance v0, Lkotlinx/serialization/internal/EnumDescriptor;

    .line 554
    .line 555
    iget-object p0, p0, Loe0;->a:[Ljava/lang/Enum;

    .line 556
    .line 557
    array-length v1, p0

    .line 558
    invoke-direct {v0, v5, v1}, Lkotlinx/serialization/internal/EnumDescriptor;-><init>(Ljava/lang/String;I)V

    .line 559
    .line 560
    .line 561
    array-length v1, p0

    .line 562
    move v3, v2

    .line 563
    :goto_5
    if-ge v3, v1, :cond_f

    .line 564
    .line 565
    aget-object v4, p0, v3

    .line 566
    .line 567
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v4

    .line 571
    invoke-virtual {v0, v4, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->j(Ljava/lang/String;Z)V

    .line 572
    .line 573
    .line 574
    add-int/lit8 v3, v3, 0x1

    .line 575
    .line 576
    goto :goto_5

    .line 577
    :cond_f
    return-object v0

    .line 578
    :pswitch_e
    check-cast p0, Lo;

    .line 579
    .line 580
    check-cast v5, Ljava/util/List;

    .line 581
    .line 582
    invoke-virtual {p0, v5}, Lo;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 586
    .line 587
    return-object p0

    .line 588
    :pswitch_f
    check-cast p0, Lmz;

    .line 589
    .line 590
    check-cast v5, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;

    .line 591
    .line 592
    iget-object v0, p0, Lmz;->a:Lx80;

    .line 593
    .line 594
    new-instance v1, Lkz;

    .line 595
    .line 596
    invoke-direct {v1, p0, v5, v4, v3}, Lkz;-><init>(Lmz;Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;Lc10;I)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v0, v1}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 600
    .line 601
    .line 602
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 603
    .line 604
    return-object p0

    .line 605
    :pswitch_data_0
    .packed-switch 0x0
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

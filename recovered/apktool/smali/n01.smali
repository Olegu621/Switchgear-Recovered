.class public final synthetic Ln01;
.super Lvo0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, Ln01;->a:I

    .line 2
    .line 3
    invoke-direct/range {p0 .. p6}, Luo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Ln01;->a:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ltv1;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lpm;->receiver:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lyv2;

    .line 16
    .line 17
    new-instance v5, Lfu2;

    .line 18
    .line 19
    iget-object v0, p0, Lyv2;->k:Lew2;

    .line 20
    .line 21
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lyv2;->a:Landroid/content/Context;

    .line 25
    .line 26
    new-instance v11, Lra2;

    .line 27
    .line 28
    new-instance v3, Lv11;

    .line 29
    .line 30
    const/4 v9, 0x0

    .line 31
    const/4 v10, 0x4

    .line 32
    const/4 v4, 0x0

    .line 33
    const-class v6, Lfu2;

    .line 34
    .line 35
    const-string v7, "dismissDialog"

    .line 36
    .line 37
    const-string v8, "dismissDialog()V"

    .line 38
    .line 39
    invoke-direct/range {v3 .. v10}, Lv11;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, v11, Lra2;->a:Ljava/lang/Object;

    .line 49
    .line 50
    iput-object v3, v11, Lra2;->b:Ljava/lang/Object;

    .line 51
    .line 52
    sget-object p1, Lyh;->h0:Lyh;

    .line 53
    .line 54
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, v11, Lra2;->c:Ljava/lang/Object;

    .line 59
    .line 60
    new-instance p1, Lf8;

    .line 61
    .line 62
    const/16 v3, 0xd

    .line 63
    .line 64
    invoke-direct {p1, v11, v3}, Lf8;-><init>(Ljava/lang/Object;I)V

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, v11, Lra2;->d:Ljava/lang/Object;

    .line 72
    .line 73
    new-instance p1, Liu2;

    .line 74
    .line 75
    new-instance v3, Lz00;

    .line 76
    .line 77
    sget v4, Lcom/usercentrics/sdk/ui/R$style;->BaseTheme:I

    .line 78
    .line 79
    invoke-direct {v3, p0, v4}, Lz00;-><init>(Landroid/content/Context;I)V

    .line 80
    .line 81
    .line 82
    invoke-direct {p1, v3, v0, v11}, Liu2;-><init>(Lz00;Lew2;Lra2;)V

    .line 83
    .line 84
    .line 85
    new-instance v0, Ln7;

    .line 86
    .line 87
    sget v3, Lcom/usercentrics/sdk/ui/R$style;->DialogBaseTheme:I

    .line 88
    .line 89
    invoke-direct {v0, p0, v3}, Ln7;-><init>(Landroid/content/Context;I)V

    .line 90
    .line 91
    .line 92
    iget-object p0, v0, Ln7;->c:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p0, Lj7;

    .line 95
    .line 96
    iput-boolean v2, p0, Lj7;->k:Z

    .line 97
    .line 98
    iput-object p1, p0, Lj7;->q:Landroid/view/View;

    .line 99
    .line 100
    invoke-virtual {v0}, Ln7;->b()Lo7;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ln7;->b()Lo7;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-eqz p1, :cond_0

    .line 115
    .line 116
    const/4 v0, -0x2

    .line 117
    invoke-virtual {p1, v1, v0}, Landroid/view/Window;->setLayout(II)V

    .line 118
    .line 119
    .line 120
    :cond_0
    iput-object p0, v5, Lfu2;->a:Lo7;

    .line 121
    .line 122
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object p0

    .line 125
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-object p0, p0, Lpm;->receiver:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p0, Landroid/content/Context;

    .line 133
    .line 134
    invoke-static {p0, p1}, Lmn0;->x(Landroid/content/Context;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 141
    .line 142
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    iget-object p0, p0, Lpm;->receiver:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast p0, Lwv2;

    .line 149
    .line 150
    invoke-static {p0, p1}, Lwv2;->q(Lwv2;I)V

    .line 151
    .line 152
    .line 153
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    iget-object p0, p0, Lpm;->receiver:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast p0, Lrv2;

    .line 164
    .line 165
    iget-object v0, p0, Lrv2;->e:Ljava/util/LinkedHashMap;

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    move v3, v1

    .line 176
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    const/4 v5, 0x0

    .line 181
    if-eqz v4, :cond_6

    .line 182
    .line 183
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    move-object v4, v3

    .line 188
    check-cast v4, Ljava/util/Map$Entry;

    .line 189
    .line 190
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    check-cast v4, Lkv2;

    .line 195
    .line 196
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    iget-object v4, v4, Lkv2;->g:Ljava/util/List;

    .line 200
    .line 201
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    const/4 v6, 0x0

    .line 206
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    if-eqz v7, :cond_4

    .line 211
    .line 212
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    check-cast v7, Lqt2;

    .line 217
    .line 218
    instance-of v8, v7, Lst2;

    .line 219
    .line 220
    if-eqz v8, :cond_1

    .line 221
    .line 222
    check-cast v7, Lst2;

    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_1
    move-object v7, v5

    .line 226
    :goto_2
    if-eqz v7, :cond_2

    .line 227
    .line 228
    iget-object v7, v7, Lst2;->a:Ljava/lang/String;

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_2
    move-object v7, v5

    .line 232
    :goto_3
    invoke-static {v7, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    if-eqz v7, :cond_3

    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 240
    .line 241
    goto :goto_1

    .line 242
    :cond_4
    move v6, v1

    .line 243
    :goto_4
    if-le v6, v1, :cond_5

    .line 244
    .line 245
    move-object v5, v3

    .line 246
    move v3, v6

    .line 247
    goto :goto_5

    .line 248
    :cond_5
    move v3, v6

    .line 249
    goto :goto_0

    .line 250
    :cond_6
    :goto_5
    check-cast v5, Ljava/util/Map$Entry;

    .line 251
    .line 252
    if-nez v5, :cond_7

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_7
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 260
    .line 261
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    check-cast v0, Lkv2;

    .line 266
    .line 267
    iget-object v1, p0, Lrv2;->f:Ljava/util/LinkedHashMap;

    .line 268
    .line 269
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    check-cast v1, Ljava/lang/Integer;

    .line 274
    .line 275
    if-eqz v1, :cond_8

    .line 276
    .line 277
    iget-object v4, p0, Lrv2;->b:Ln01;

    .line 278
    .line 279
    invoke-virtual {v4, v1}, Ln01;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    iget-object p0, p0, Lrv2;->c:Lv11;

    .line 283
    .line 284
    invoke-virtual {p0}, Lv11;->invoke()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    iget-object p0, v0, Lkv2;->h:Ljava/util/LinkedHashSet;

    .line 288
    .line 289
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->I(Ljava/util/AbstractCollection;)Ljava/util/HashSet;

    .line 290
    .line 291
    .line 292
    invoke-interface {p0}, Ljava/util/Set;->clear()V

    .line 293
    .line 294
    .line 295
    iget-object p0, v0, Lkv2;->h:Ljava/util/LinkedHashSet;

    .line 296
    .line 297
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    invoke-interface {p0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0}, Landroidx/recyclerview/widget/g;->d()V

    .line 308
    .line 309
    .line 310
    iget-object p0, v0, Lkv2;->g:Ljava/util/List;

    .line 311
    .line 312
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 313
    .line 314
    .line 315
    move-result p0

    .line 316
    sub-int/2addr p0, v2

    .line 317
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->c0(I)V

    .line 318
    .line 319
    .line 320
    new-instance p0, Lfn;

    .line 321
    .line 322
    const/4 v0, 0x5

    .line 323
    invoke-direct {p0, p1, v3, v0}, Lfn;-><init>(Ljava/lang/Object;II)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 327
    .line 328
    .line 329
    :cond_8
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 330
    .line 331
    return-object p0

    .line 332
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 333
    .line 334
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    iget-object p0, p0, Lpm;->receiver:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast p0, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;

    .line 340
    .line 341
    invoke-static {p0, p1}, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;->j(Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 345
    .line 346
    return-object p0

    .line 347
    :pswitch_4
    check-cast p1, Lyu1;

    .line 348
    .line 349
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    iget-object p0, p0, Lpm;->receiver:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast p0, Lqv2;

    .line 355
    .line 356
    iget-object p0, p0, Lqv2;->c:Lyv2;

    .line 357
    .line 358
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 359
    .line 360
    .line 361
    move-result p1

    .line 362
    if-eqz p1, :cond_b

    .line 363
    .line 364
    if-eq p1, v2, :cond_a

    .line 365
    .line 366
    const/4 v0, 0x2

    .line 367
    if-eq p1, v0, :cond_9

    .line 368
    .line 369
    goto :goto_7

    .line 370
    :cond_9
    sget-object p1, Lkt2;->d:Lkt2;

    .line 371
    .line 372
    invoke-virtual {p0, p1}, Lyv2;->c(Lkt2;)V

    .line 373
    .line 374
    .line 375
    goto :goto_7

    .line 376
    :cond_a
    sget-object p1, Lkt2;->b:Lkt2;

    .line 377
    .line 378
    invoke-virtual {p0, p1}, Lyv2;->c(Lkt2;)V

    .line 379
    .line 380
    .line 381
    goto :goto_7

    .line 382
    :cond_b
    sget-object p1, Lkt2;->a:Lkt2;

    .line 383
    .line 384
    invoke-virtual {p0, p1}, Lyv2;->c(Lkt2;)V

    .line 385
    .line 386
    .line 387
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 388
    .line 389
    return-object p0

    .line 390
    :pswitch_5
    check-cast p1, Lyu1;

    .line 391
    .line 392
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    iget-object p0, p0, Lpm;->receiver:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast p0, Lsu2;

    .line 398
    .line 399
    invoke-virtual {p0, p1}, Lsu2;->b(Lyu1;)V

    .line 400
    .line 401
    .line 402
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 403
    .line 404
    return-object p0

    .line 405
    :pswitch_6
    check-cast p1, Lyu1;

    .line 406
    .line 407
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    iget-object p0, p0, Lpm;->receiver:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast p0, Lsu2;

    .line 413
    .line 414
    invoke-virtual {p0, p1}, Lsu2;->b(Lyu1;)V

    .line 415
    .line 416
    .line 417
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 418
    .line 419
    return-object p0

    .line 420
    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    .line 421
    .line 422
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    iget-object p0, p0, Lpm;->receiver:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast p0, Lyv1;

    .line 429
    .line 430
    invoke-virtual {p0, v0}, Lyv1;->setCurrentState(Z)V

    .line 431
    .line 432
    .line 433
    iget-object p0, p0, Lyv1;->a:Lkotlin/jvm/functions/Function1;

    .line 434
    .line 435
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 439
    .line 440
    return-object p0

    .line 441
    :pswitch_8
    check-cast p1, Ljava/lang/Throwable;

    .line 442
    .line 443
    iget-object p0, p0, Lpm;->receiver:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast p0, Lhz0;

    .line 446
    .line 447
    invoke-interface {p0, p1}, Lhz0;->a(Ljava/lang/Throwable;)V

    .line 448
    .line 449
    .line 450
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 451
    .line 452
    return-object p0

    .line 453
    :pswitch_data_0
    .packed-switch 0x0
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

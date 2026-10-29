.class public final synthetic Lrp2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lrp2;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lrp2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lrp2;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lrp2;->a:I

    .line 4
    .line 5
    const/16 v2, 0x16

    .line 6
    .line 7
    const-string v3, ""

    .line 8
    .line 9
    const-string v4, "viewModel"

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    iget-object v7, v0, Lrp2;->c:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v0, v0, Lrp2;->b:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object v10, v0

    .line 21
    check-cast v10, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;

    .line 22
    .line 23
    check-cast v7, Lew2;

    .line 24
    .line 25
    sget v0, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;->w0:I

    .line 26
    .line 27
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v0, v10, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;->s0:Lqv2;

    .line 31
    .line 32
    if-eqz v0, :cond_6

    .line 33
    .line 34
    iget-object v0, v0, Lqv2;->a:Lqi1;

    .line 35
    .line 36
    iget-object v0, v0, Lqi1;->f:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lcv1;

    .line 39
    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :cond_0
    iget-object v1, v0, Lcv1;->a:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :cond_1
    iget-object v0, v0, Lcv1;->b:Lbv1;

    .line 55
    .line 56
    iget-object v0, v0, Lbv1;->a:Ljava/lang/String;

    .line 57
    .line 58
    new-instance v2, Li51;

    .line 59
    .line 60
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-direct {v2, v3, v7}, Li51;-><init>(Landroid/content/Context;Lew2;)V

    .line 68
    .line 69
    .line 70
    new-instance v8, Ln01;

    .line 71
    .line 72
    const/4 v14, 0x0

    .line 73
    const/4 v15, 0x5

    .line 74
    const/4 v9, 0x1

    .line 75
    const-class v11, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;

    .line 76
    .line 77
    const-string v12, "onLanguageSelected"

    .line 78
    .line 79
    const-string v13, "onLanguageSelected(Ljava/lang/String;)V"

    .line 80
    .line 81
    invoke-direct/range {v8 .. v15}, Ln01;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 82
    .line 83
    .line 84
    iput-object v8, v2, Li51;->c:Ln01;

    .line 85
    .line 86
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance v8, Landroid/widget/ScrollView;

    .line 93
    .line 94
    invoke-direct {v8, v3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 95
    .line 96
    .line 97
    new-instance v9, Landroid/widget/LinearLayout;

    .line 98
    .line 99
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-direct {v9, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 104
    .line 105
    .line 106
    sget v4, Lcom/usercentrics/sdk/ui/R$id;->ucLanguagesAvailable:I

    .line 107
    .line 108
    invoke-virtual {v9, v4}, Landroid/view/View;->setId(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v9, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, Li51;->a()I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    const/16 v10, 0x10

    .line 119
    .line 120
    invoke-static {v3, v10}, Lyy1;->o(Landroid/content/Context;I)I

    .line 121
    .line 122
    .line 123
    move-result v11

    .line 124
    invoke-virtual {v2}, Li51;->a()I

    .line 125
    .line 126
    .line 127
    move-result v12

    .line 128
    invoke-static {v3, v10}, Lyy1;->o(Landroid/content/Context;I)I

    .line 129
    .line 130
    .line 131
    move-result v13

    .line 132
    invoke-virtual {v9, v4, v11, v12, v13}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    check-cast v4, Lbv1;

    .line 144
    .line 145
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v11

    .line 149
    if-eqz v11, :cond_2

    .line 150
    .line 151
    iget-object v12, v2, Li51;->a:Landroid/content/Context;

    .line 152
    .line 153
    invoke-static {v12, v10}, Lyy1;->o(Landroid/content/Context;I)I

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    goto :goto_1

    .line 158
    :cond_2
    invoke-virtual {v2}, Li51;->a()I

    .line 159
    .line 160
    .line 161
    move-result v12

    .line 162
    :goto_1
    iget-object v13, v4, Lbv1;->a:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v0, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v13

    .line 168
    new-instance v14, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 169
    .line 170
    invoke-direct {v14, v3, v6}, Lcom/usercentrics/sdk/ui/components/UCTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 171
    .line 172
    .line 173
    const/high16 v15, 0x41800000    # 16.0f

    .line 174
    .line 175
    invoke-virtual {v14, v15}, Landroid/widget/TextView;->setTextSize(F)V

    .line 176
    .line 177
    .line 178
    iget-object v15, v4, Lbv1;->b:Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {v14, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 181
    .line 182
    .line 183
    iget-object v4, v4, Lbv1;->a:Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v14, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2}, Li51;->a()I

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    invoke-virtual {v2}, Li51;->a()I

    .line 193
    .line 194
    .line 195
    move-result v15

    .line 196
    move-object/from16 v16, v6

    .line 197
    .line 198
    invoke-virtual {v2}, Li51;->a()I

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    invoke-virtual {v14, v4, v15, v6, v12}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 203
    .line 204
    .line 205
    iget-object v4, v7, Lew2;->a:Lwt2;

    .line 206
    .line 207
    iget-object v6, v4, Lwt2;->a:Ljava/lang/Integer;

    .line 208
    .line 209
    if-eqz v6, :cond_3

    .line 210
    .line 211
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    goto :goto_2

    .line 216
    :cond_3
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    sget v12, Lcom/usercentrics/sdk/ui/R$color;->ucDarkGray:I

    .line 221
    .line 222
    invoke-static {v6, v12}, Lv00;->getColor(Landroid/content/Context;I)I

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    :goto_2
    invoke-virtual {v14, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 227
    .line 228
    .line 229
    new-instance v6, Lh51;

    .line 230
    .line 231
    const/4 v12, 0x0

    .line 232
    invoke-direct {v6, v2, v12}, Lh51;-><init>(Ljava/lang/Object;I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v14, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 236
    .line 237
    .line 238
    sget-object v6, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 239
    .line 240
    invoke-virtual {v14, v6, v13}, Landroidx/appcompat/widget/AppCompatTextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v9, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 244
    .line 245
    .line 246
    if-nez v11, :cond_5

    .line 247
    .line 248
    invoke-virtual {v8, v9}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 249
    .line 250
    .line 251
    iget-object v0, v2, Li51;->b:Landroid/widget/PopupWindow;

    .line 252
    .line 253
    invoke-virtual {v0, v8}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 254
    .line 255
    .line 256
    const/high16 v1, 0x43480000    # 200.0f

    .line 257
    .line 258
    invoke-static {v1, v3}, Lyy1;->n(FLandroid/content/Context;)F

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    float-to-int v1, v1

    .line 263
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 264
    .line 265
    .line 266
    const/4 v1, -0x2

    .line 267
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0, v12}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0, v5}, Landroid/widget/PopupWindow;->setSoftInputMode(I)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0, v5}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, v5}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 283
    .line 284
    .line 285
    const/high16 v1, 0x41400000    # 12.0f

    .line 286
    .line 287
    invoke-static {v1, v3}, Lyy1;->n(FLandroid/content/Context;)F

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setElevation(F)V

    .line 292
    .line 293
    .line 294
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 295
    .line 296
    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 297
    .line 298
    .line 299
    const/high16 v2, 0x40800000    # 4.0f

    .line 300
    .line 301
    invoke-static {v2, v3}, Lyy1;->n(FLandroid/content/Context;)F

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 306
    .line 307
    .line 308
    iget-object v2, v4, Lwt2;->e:Ljava/lang/Integer;

    .line 309
    .line 310
    if-eqz v2, :cond_4

    .line 311
    .line 312
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    goto :goto_3

    .line 317
    :cond_4
    const/4 v2, -0x1

    .line 318
    :goto_3
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 319
    .line 320
    .line 321
    const/high16 v2, 0x3f800000    # 1.0f

    .line 322
    .line 323
    invoke-static {v2, v3}, Lyy1;->n(FLandroid/content/Context;)F

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    float-to-int v2, v2

    .line 328
    iget v3, v4, Lwt2;->j:I

    .line 329
    .line 330
    invoke-virtual {v1, v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getWidth()I

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    move-object/from16 v6, p1

    .line 341
    .line 342
    invoke-virtual {v0, v6, v1, v12, v12}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 343
    .line 344
    .line 345
    :goto_4
    return-void

    .line 346
    :cond_5
    move-object/from16 v6, p1

    .line 347
    .line 348
    move-object/from16 v6, v16

    .line 349
    .line 350
    goto/16 :goto_0

    .line 351
    .line 352
    :cond_6
    move-object/from16 v16, v6

    .line 353
    .line 354
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    throw v16

    .line 358
    :pswitch_0
    move-object/from16 v16, v6

    .line 359
    .line 360
    check-cast v0, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;

    .line 361
    .line 362
    check-cast v7, Lev1;

    .line 363
    .line 364
    sget v1, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;->w0:I

    .line 365
    .line 366
    iget-object v0, v0, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;->s0:Lqv2;

    .line 367
    .line 368
    if-eqz v0, :cond_b

    .line 369
    .line 370
    iget-object v0, v0, Lqv2;->c:Lyv2;

    .line 371
    .line 372
    iget-object v1, v7, Lev1;->c:Lfv1;

    .line 373
    .line 374
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    if-eqz v1, :cond_7

    .line 379
    .line 380
    goto :goto_6

    .line 381
    :cond_7
    iget-object v0, v0, Lyv2;->m:Lts0;

    .line 382
    .line 383
    iget-object v1, v7, Lev1;->b:Ljava/lang/String;

    .line 384
    .line 385
    if-nez v1, :cond_8

    .line 386
    .line 387
    goto :goto_5

    .line 388
    :cond_8
    move-object v3, v1

    .line 389
    :goto_5
    iget-object v0, v0, Lts0;->a:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v0, Lra2;

    .line 392
    .line 393
    iget-object v0, v0, Lra2;->d:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 396
    .line 397
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    check-cast v0, Landroid/content/Context;

    .line 402
    .line 403
    if-eqz v0, :cond_9

    .line 404
    .line 405
    invoke-static {v0, v3}, Lmn0;->x(Landroid/content/Context;Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    :cond_9
    iget-object v0, v7, Lev1;->d:Lez2;

    .line 409
    .line 410
    sget-object v1, Lqu1;->c:Lfs0;

    .line 411
    .line 412
    if-nez v1, :cond_a

    .line 413
    .line 414
    new-instance v1, Lec0;

    .line 415
    .line 416
    invoke-direct {v1, v2}, Lec0;-><init>(I)V

    .line 417
    .line 418
    .line 419
    :cond_a
    invoke-interface {v1, v0}, Lfz2;->b(Lez2;)V

    .line 420
    .line 421
    .line 422
    :goto_6
    return-void

    .line 423
    :cond_b
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    throw v16

    .line 427
    :pswitch_1
    check-cast v0, Lsu2;

    .line 428
    .line 429
    check-cast v7, Lev1;

    .line 430
    .line 431
    iget-object v1, v7, Lev1;->c:Lfv1;

    .line 432
    .line 433
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 434
    .line 435
    .line 436
    move-result v4

    .line 437
    iget-object v1, v1, Lfv1;->a:Ljava/lang/Integer;

    .line 438
    .line 439
    if-eqz v4, :cond_e

    .line 440
    .line 441
    if-eq v4, v5, :cond_d

    .line 442
    .line 443
    const/4 v2, 0x2

    .line 444
    if-eq v4, v2, :cond_c

    .line 445
    .line 446
    goto :goto_8

    .line 447
    :cond_c
    invoke-virtual {v0, v1}, Lsu2;->c(Ljava/lang/Integer;)V

    .line 448
    .line 449
    .line 450
    goto :goto_8

    .line 451
    :cond_d
    invoke-virtual {v0, v1}, Lsu2;->c(Ljava/lang/Integer;)V

    .line 452
    .line 453
    .line 454
    goto :goto_8

    .line 455
    :cond_e
    iget-object v0, v0, Lsu2;->g:Lts0;

    .line 456
    .line 457
    iget-object v1, v7, Lev1;->b:Ljava/lang/String;

    .line 458
    .line 459
    iget-object v0, v0, Lts0;->a:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v0, Lra2;

    .line 462
    .line 463
    iget-object v0, v0, Lra2;->d:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 466
    .line 467
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    check-cast v0, Landroid/content/Context;

    .line 472
    .line 473
    if-eqz v0, :cond_10

    .line 474
    .line 475
    if-nez v1, :cond_f

    .line 476
    .line 477
    goto :goto_7

    .line 478
    :cond_f
    move-object v3, v1

    .line 479
    :goto_7
    invoke-static {v0, v3}, Lmn0;->x(Landroid/content/Context;Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    :cond_10
    iget-object v0, v7, Lev1;->d:Lez2;

    .line 483
    .line 484
    sget-object v1, Lqu1;->c:Lfs0;

    .line 485
    .line 486
    if-nez v1, :cond_11

    .line 487
    .line 488
    new-instance v1, Lec0;

    .line 489
    .line 490
    invoke-direct {v1, v2}, Lec0;-><init>(I)V

    .line 491
    .line 492
    .line 493
    :cond_11
    invoke-interface {v1, v0}, Lfz2;->b(Lez2;)V

    .line 494
    .line 495
    .line 496
    :goto_8
    return-void

    .line 497
    :pswitch_2
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 498
    .line 499
    check-cast v7, Lkw2;

    .line 500
    .line 501
    if-eqz v0, :cond_12

    .line 502
    .line 503
    iget-object v1, v7, Lkw2;->a:Ljava/lang/String;

    .line 504
    .line 505
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    :cond_12
    return-void

    .line 509
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

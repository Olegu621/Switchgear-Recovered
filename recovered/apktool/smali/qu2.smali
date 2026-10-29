.class public final Lqu2;
.super Landroidx/appcompat/widget/LinearLayoutCompat;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final d0:Lhk2;

.field public final e0:Lhk2;

.field public final f0:Lhk2;

.field public final g0:Landroid/view/View;


# direct methods
.method public constructor <init>(Lz00;Lew2;Lsu2;)V
    .locals 27

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    move-object/from16 v11, p3

    .line 8
    .line 9
    iget-object v1, v11, Lsu2;->n:Lhk2;

    .line 10
    .line 11
    iget-object v3, v11, Lsu2;->v:Lhk2;

    .line 12
    .line 13
    iget-object v4, v11, Lsu2;->j:Lau1;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v5, v8, Lew2;->a:Lwt2;

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    invoke-direct {v2, v0, v6}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    .line 26
    .line 27
    new-instance v7, Lf8;

    .line 28
    .line 29
    const/16 v9, 0xf

    .line 30
    .line 31
    invoke-direct {v7, v2, v9}, Lf8;-><init>(Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {v7}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    iput-object v7, v2, Lqu2;->d0:Lhk2;

    .line 39
    .line 40
    new-instance v7, Llz;

    .line 41
    .line 42
    const/4 v9, 0x5

    .line 43
    invoke-direct {v7, v9, v0, v2}, Llz;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v7}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    iput-object v7, v2, Lqu2;->e0:Lhk2;

    .line 51
    .line 52
    new-instance v7, Lcb1;

    .line 53
    .line 54
    const/4 v9, 0x3

    .line 55
    invoke-direct {v7, v0, v9}, Lcb1;-><init>(Landroid/content/Context;I)V

    .line 56
    .line 57
    .line 58
    invoke-static {v7}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, v2, Lqu2;->f0:Lhk2;

    .line 63
    .line 64
    const/4 v0, 0x1

    .line 65
    invoke-virtual {v2, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->setOrientation(I)V

    .line 66
    .line 67
    .line 68
    invoke-direct {v2}, Lqu2;->getScrollView()Landroidx/core/widget/NestedScrollView;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    new-instance v9, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 73
    .line 74
    const/4 v10, -0x1

    .line 75
    const/4 v12, -0x2

    .line 76
    const/high16 v13, 0x3f800000    # 1.0f

    .line 77
    .line 78
    invoke-direct {v9, v10, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v7, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v2}, Lqu2;->getScrollView()Landroidx/core/widget/NestedScrollView;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-direct {v2}, Lqu2;->getScrollableContainer()Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    new-instance v14, Landroid/widget/FrameLayout$LayoutParams;

    .line 93
    .line 94
    invoke-direct {v14, v10, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v7, v9, v14}, Landroidx/core/widget/NestedScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    .line 99
    .line 100
    iget-object v7, v11, Lsu2;->m:Lhk2;

    .line 101
    .line 102
    invoke-virtual {v7}, Lhk2;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    check-cast v9, Lvt0;

    .line 107
    .line 108
    iget-object v9, v11, Lsu2;->b:Ljw2;

    .line 109
    .line 110
    iget-object v14, v9, Ljw2;->b:Lf31;

    .line 111
    .line 112
    iget-object v15, v14, Lf31;->g:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v15, Ljava/lang/String;

    .line 115
    .line 116
    move-object/from16 v17, v1

    .line 117
    .line 118
    move-object/from16 v16, v7

    .line 119
    .line 120
    const/4 v7, 0x0

    .line 121
    if-eqz v15, :cond_3

    .line 122
    .line 123
    invoke-direct {v2}, Lqu2;->getScrollableContainer()Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 124
    .line 125
    .line 126
    move-result-object v15

    .line 127
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    new-instance v13, Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 131
    .line 132
    invoke-virtual {v15}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    invoke-direct {v13, v10, v6}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v13, v7}, Landroidx/appcompat/widget/LinearLayoutCompat;->setOrientation(I)V

    .line 140
    .line 141
    .line 142
    new-instance v10, Landroid/util/TypedValue;

    .line 143
    .line 144
    invoke-direct {v10}, Landroid/util/TypedValue;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v13}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 148
    .line 149
    .line 150
    move-result-object v20

    .line 151
    invoke-virtual/range {v20 .. v20}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 152
    .line 153
    .line 154
    move-result-object v12

    .line 155
    const v1, 0x101030e

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v1, v10, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 159
    .line 160
    .line 161
    iget v1, v10, Landroid/util/TypedValue;->resourceId:I

    .line 162
    .line 163
    invoke-virtual {v13, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v13}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    sget v10, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerInnerPadding:I

    .line 171
    .line 172
    invoke-virtual {v1, v10}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    invoke-virtual {v13, v1, v1, v1, v1}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 177
    .line 178
    .line 179
    new-instance v1, Lku2;

    .line 180
    .line 181
    invoke-direct {v1, v11, v7}, Lku2;-><init>(Lsu2;I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v13, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 185
    .line 186
    .line 187
    new-instance v1, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 188
    .line 189
    invoke-virtual {v15}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 190
    .line 191
    .line 192
    move-result-object v10

    .line 193
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-direct {v1, v10, v6}, Lcom/usercentrics/sdk/ui/components/UCTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 197
    .line 198
    .line 199
    iget-object v10, v14, Lf31;->g:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v10, Ljava/lang/String;

    .line 202
    .line 203
    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 204
    .line 205
    .line 206
    const/16 v10, 0xe

    .line 207
    .line 208
    invoke-static {v1, v8, v10}, Lcom/usercentrics/sdk/ui/components/UCTextView;->i(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v11}, Lsu2;->a()Lmu2;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v11}, Lsu2;->a()Lmu2;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v11}, Lsu2;->a()Lmu2;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    new-instance v10, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 236
    .line 237
    const/4 v12, -0x2

    .line 238
    invoke-direct {v10, v12, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v13, v1, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v15}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 245
    .line 246
    .line 247
    move-result-object v10

    .line 248
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    sget v12, Lcom/usercentrics/sdk/ui/R$drawable;->uc_ic_arrow_back:I

    .line 252
    .line 253
    invoke-static {v10, v12}, Lmn0;->p(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    if-eqz v10, :cond_0

    .line 258
    .line 259
    iget-object v12, v5, Lwt2;->b:Ljava/lang/Integer;

    .line 260
    .line 261
    if-eqz v12, :cond_1

    .line 262
    .line 263
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 264
    .line 265
    .line 266
    move-result v12

    .line 267
    new-instance v14, Landroid/graphics/PorterDuffColorFilter;

    .line 268
    .line 269
    sget-object v7, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 270
    .line 271
    invoke-direct {v14, v12, v7}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v10, v14}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 275
    .line 276
    .line 277
    goto :goto_0

    .line 278
    :cond_0
    move-object v10, v6

    .line 279
    :cond_1
    :goto_0
    invoke-virtual {v11}, Lsu2;->a()Lmu2;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    new-instance v7, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 287
    .line 288
    invoke-virtual {v15}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 289
    .line 290
    .line 291
    move-result-object v12

    .line 292
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-direct {v7, v12, v6}, Lcom/usercentrics/sdk/ui/components/UCImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v7, v10}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1}, Landroid/widget/TextView;->getTextLocale()Ljava/util/Locale;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    invoke-static {v1}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    if-ne v1, v0, :cond_2

    .line 310
    .line 311
    const/4 v1, 0x0

    .line 312
    goto :goto_1

    .line 313
    :cond_2
    const/high16 v1, 0x43340000    # 180.0f

    .line 314
    .line 315
    :goto_1
    invoke-virtual {v7, v1}, Landroid/view/View;->setRotationY(F)V

    .line 316
    .line 317
    .line 318
    new-instance v1, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 319
    .line 320
    const/4 v10, -0x1

    .line 321
    const/4 v12, -0x2

    .line 322
    invoke-direct {v1, v12, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v13, v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 326
    .line 327
    .line 328
    new-instance v1, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 329
    .line 330
    invoke-direct {v1, v12, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 331
    .line 332
    .line 333
    const v7, 0x800005

    .line 334
    .line 335
    .line 336
    iput v7, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 337
    .line 338
    invoke-virtual {v15, v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 339
    .line 340
    .line 341
    goto/16 :goto_4

    .line 342
    .line 343
    :cond_3
    iget-object v1, v14, Lf31;->h:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v1, Ljava/lang/Boolean;

    .line 346
    .line 347
    if-eqz v1, :cond_4

    .line 348
    .line 349
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    goto :goto_2

    .line 354
    :cond_4
    const/4 v1, 0x0

    .line 355
    :goto_2
    if-eqz v1, :cond_7

    .line 356
    .line 357
    invoke-direct {v2}, Lqu2;->getScrollableContainer()Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 365
    .line 366
    .line 367
    move-result-object v7

    .line 368
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    sget v10, Lcom/usercentrics/sdk/ui/R$drawable;->uc_ic_close:I

    .line 372
    .line 373
    invoke-static {v7, v10}, Lmn0;->p(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 374
    .line 375
    .line 376
    move-result-object v7

    .line 377
    if-eqz v7, :cond_5

    .line 378
    .line 379
    iget-object v10, v5, Lwt2;->b:Ljava/lang/Integer;

    .line 380
    .line 381
    if-eqz v10, :cond_6

    .line 382
    .line 383
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 384
    .line 385
    .line 386
    move-result v10

    .line 387
    new-instance v12, Landroid/graphics/PorterDuffColorFilter;

    .line 388
    .line 389
    sget-object v13, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 390
    .line 391
    invoke-direct {v12, v10, v13}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v7, v12}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 395
    .line 396
    .line 397
    goto :goto_3

    .line 398
    :cond_5
    move-object v7, v6

    .line 399
    :cond_6
    :goto_3
    invoke-virtual {v11}, Lsu2;->a()Lmu2;

    .line 400
    .line 401
    .line 402
    move-result-object v10

    .line 403
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    new-instance v10, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 407
    .line 408
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 409
    .line 410
    .line 411
    move-result-object v12

    .line 412
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    invoke-direct {v10, v12, v6}, Lcom/usercentrics/sdk/ui/components/UCImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 419
    .line 420
    .line 421
    move-result-object v12

    .line 422
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    const/high16 v13, 0x41500000    # 13.0f

    .line 426
    .line 427
    invoke-static {v13, v12}, Lyy1;->n(FLandroid/content/Context;)F

    .line 428
    .line 429
    .line 430
    move-result v12

    .line 431
    float-to-int v12, v12

    .line 432
    invoke-virtual {v10, v12, v12, v12, v12}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 433
    .line 434
    .line 435
    new-instance v12, Lku2;

    .line 436
    .line 437
    invoke-direct {v12, v11, v0}, Lku2;-><init>(Lsu2;I)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v10, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v10, v7}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 444
    .line 445
    .line 446
    new-instance v7, Landroid/util/TypedValue;

    .line 447
    .line 448
    invoke-direct {v7}, Landroid/util/TypedValue;-><init>()V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 452
    .line 453
    .line 454
    move-result-object v12

    .line 455
    invoke-virtual {v12}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 456
    .line 457
    .line 458
    move-result-object v12

    .line 459
    const v13, 0x101045c

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12, v13, v7, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 463
    .line 464
    .line 465
    iget v7, v7, Landroid/util/TypedValue;->resourceId:I

    .line 466
    .line 467
    invoke-virtual {v10, v7}, Landroidx/appcompat/widget/AppCompatImageView;->setBackgroundResource(I)V

    .line 468
    .line 469
    .line 470
    iget-object v7, v4, Lau1;->a:Ljava/lang/String;

    .line 471
    .line 472
    invoke-virtual {v10, v7}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 473
    .line 474
    .line 475
    new-instance v7, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 476
    .line 477
    const/4 v12, -0x2

    .line 478
    invoke-direct {v7, v12, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 479
    .line 480
    .line 481
    const v12, 0x800005

    .line 482
    .line 483
    .line 484
    iput v12, v7, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 485
    .line 486
    const/4 v12, 0x0

    .line 487
    invoke-virtual {v7, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 491
    .line 492
    .line 493
    move-result-object v12

    .line 494
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    const/high16 v13, 0x40800000    # 4.0f

    .line 498
    .line 499
    invoke-static {v13, v12}, Lyy1;->n(FLandroid/content/Context;)F

    .line 500
    .line 501
    .line 502
    move-result v12

    .line 503
    float-to-int v12, v12

    .line 504
    invoke-virtual {v7, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v1, v10, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 508
    .line 509
    .line 510
    :cond_7
    :goto_4
    invoke-direct {v2}, Lqu2;->getScrollableContainer()Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    sget-object v7, Llu2;->a:Lq82;

    .line 515
    .line 516
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    iget-object v7, v9, Ljw2;->b:Lf31;

    .line 520
    .line 521
    iget-object v10, v7, Lf31;->g:Ljava/lang/Object;

    .line 522
    .line 523
    check-cast v10, Ljava/lang/String;

    .line 524
    .line 525
    if-nez v10, :cond_a

    .line 526
    .line 527
    iget-object v7, v7, Lf31;->h:Ljava/lang/Object;

    .line 528
    .line 529
    check-cast v7, Ljava/lang/Boolean;

    .line 530
    .line 531
    if-eqz v7, :cond_8

    .line 532
    .line 533
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 534
    .line 535
    .line 536
    move-result v7

    .line 537
    goto :goto_5

    .line 538
    :cond_8
    const/4 v7, 0x0

    .line 539
    :goto_5
    if-ne v7, v0, :cond_9

    .line 540
    .line 541
    goto :goto_6

    .line 542
    :cond_9
    const/4 v12, 0x0

    .line 543
    goto :goto_7

    .line 544
    :cond_a
    :goto_6
    move v12, v0

    .line 545
    :goto_7
    iget-object v4, v4, Lau1;->h:Ljava/lang/String;

    .line 546
    .line 547
    invoke-virtual/range {v16 .. v16}, Lhk2;->getValue()Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v7

    .line 551
    check-cast v7, Lvt0;

    .line 552
    .line 553
    instance-of v10, v7, Lut0;

    .line 554
    .line 555
    if-eqz v10, :cond_11

    .line 556
    .line 557
    check-cast v7, Lut0;

    .line 558
    .line 559
    iget-object v10, v7, Lut0;->b:Lq82;

    .line 560
    .line 561
    if-nez v10, :cond_b

    .line 562
    .line 563
    sget-object v10, Llu2;->a:Lq82;

    .line 564
    .line 565
    :cond_b
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 566
    .line 567
    .line 568
    move-result-object v15

    .line 569
    sget v14, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerDefaultLogoHeight:I

    .line 570
    .line 571
    invoke-virtual {v15, v14}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 572
    .line 573
    .line 574
    move-result v14

    .line 575
    new-instance v15, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 576
    .line 577
    const/4 v13, -0x1

    .line 578
    invoke-direct {v15, v13, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 582
    .line 583
    .line 584
    move-result-object v13

    .line 585
    sget v14, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerInnerPadding:I

    .line 586
    .line 587
    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 588
    .line 589
    .line 590
    move-result v13

    .line 591
    invoke-virtual {v15, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v15, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 595
    .line 596
    .line 597
    if-eqz v12, :cond_c

    .line 598
    .line 599
    const/4 v12, 0x0

    .line 600
    goto :goto_8

    .line 601
    :cond_c
    move v12, v13

    .line 602
    :goto_8
    iput v12, v15, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 603
    .line 604
    iput v13, v15, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 605
    .line 606
    new-instance v12, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 607
    .line 608
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 609
    .line 610
    .line 611
    move-result-object v13

    .line 612
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    invoke-direct {v12, v13, v6}, Lcom/usercentrics/sdk/ui/components/UCImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 616
    .line 617
    .line 618
    sget v13, Lcom/usercentrics/sdk/ui/R$id;->ucFirstLayerHeaderLogo:I

    .line 619
    .line 620
    invoke-virtual {v12, v13}, Landroid/view/View;->setId(I)V

    .line 621
    .line 622
    .line 623
    iget-object v7, v7, Lut0;->a:Lyz2;

    .line 624
    .line 625
    invoke-virtual {v12, v7}, Lcom/usercentrics/sdk/ui/components/UCImageView;->setImage(Lyz2;)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 629
    .line 630
    .line 631
    move-result v7

    .line 632
    if-eqz v7, :cond_f

    .line 633
    .line 634
    if-eq v7, v0, :cond_e

    .line 635
    .line 636
    const/4 v10, 0x2

    .line 637
    if-ne v7, v10, :cond_d

    .line 638
    .line 639
    sget-object v7, Landroid/widget/ImageView$ScaleType;->FIT_END:Landroid/widget/ImageView$ScaleType;

    .line 640
    .line 641
    goto :goto_9

    .line 642
    :cond_d
    invoke-static {}, Lds0;->b()V

    .line 643
    .line 644
    .line 645
    throw v6

    .line 646
    :cond_e
    const/4 v10, 0x2

    .line 647
    sget-object v7, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 648
    .line 649
    goto :goto_9

    .line 650
    :cond_f
    const/4 v10, 0x2

    .line 651
    sget-object v7, Landroid/widget/ImageView$ScaleType;->FIT_START:Landroid/widget/ImageView$ScaleType;

    .line 652
    .line 653
    :goto_9
    invoke-virtual {v12, v7}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v12, v4}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v1, v12, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 660
    .line 661
    .line 662
    :cond_10
    const/4 v12, 0x4

    .line 663
    goto :goto_c

    .line 664
    :cond_11
    const/4 v10, 0x2

    .line 665
    sget-object v4, Ltt0;->a:Ltt0;

    .line 666
    .line 667
    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 668
    .line 669
    .line 670
    move-result v4

    .line 671
    if-eqz v4, :cond_12

    .line 672
    .line 673
    goto :goto_a

    .line 674
    :cond_12
    if-nez v7, :cond_10

    .line 675
    .line 676
    :goto_a
    new-instance v4, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 677
    .line 678
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 679
    .line 680
    .line 681
    move-result v7

    .line 682
    const/4 v13, -0x1

    .line 683
    invoke-direct {v4, v13, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 687
    .line 688
    .line 689
    move-result-object v7

    .line 690
    sget v13, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerInnerPadding:I

    .line 691
    .line 692
    invoke-virtual {v7, v13}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 693
    .line 694
    .line 695
    move-result v7

    .line 696
    const/4 v13, 0x0

    .line 697
    invoke-virtual {v4, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 698
    .line 699
    .line 700
    iput v13, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 701
    .line 702
    invoke-virtual {v4, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 703
    .line 704
    .line 705
    if-eqz v12, :cond_13

    .line 706
    .line 707
    const/4 v12, 0x0

    .line 708
    goto :goto_b

    .line 709
    :cond_13
    move v12, v7

    .line 710
    :goto_b
    iput v12, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 711
    .line 712
    new-instance v7, Landroid/view/View;

    .line 713
    .line 714
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 715
    .line 716
    .line 717
    move-result-object v12

    .line 718
    invoke-direct {v7, v12}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 719
    .line 720
    .line 721
    const/4 v12, 0x4

    .line 722
    invoke-virtual {v7, v12}, Landroid/view/View;->setVisibility(I)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v1, v7, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 726
    .line 727
    .line 728
    :goto_c
    invoke-direct {v2}, Lqu2;->getScrollableContainer()Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 729
    .line 730
    .line 731
    move-result-object v1

    .line 732
    iget-object v4, v11, Lsu2;->p:Lhk2;

    .line 733
    .line 734
    invoke-virtual {v4}, Lhk2;->getValue()Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v4

    .line 738
    check-cast v4, Lpu2;

    .line 739
    .line 740
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 741
    .line 742
    .line 743
    if-nez v4, :cond_14

    .line 744
    .line 745
    const/4 v13, -0x1

    .line 746
    const/4 v14, -0x2

    .line 747
    const/4 v15, 0x0

    .line 748
    goto :goto_e

    .line 749
    :cond_14
    new-instance v7, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 750
    .line 751
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 752
    .line 753
    .line 754
    move-result-object v13

    .line 755
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 756
    .line 757
    .line 758
    invoke-direct {v7, v13, v6}, Lcom/usercentrics/sdk/ui/components/UCTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 759
    .line 760
    .line 761
    iget-object v4, v4, Lpu2;->a:Ljava/lang/String;

    .line 762
    .line 763
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v7, v8}, Lcom/usercentrics/sdk/ui/components/UCTextView;->k(Lew2;)V

    .line 767
    .line 768
    .line 769
    new-instance v4, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 770
    .line 771
    const/4 v13, -0x1

    .line 772
    const/4 v14, -0x2

    .line 773
    invoke-direct {v4, v13, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 774
    .line 775
    .line 776
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 777
    .line 778
    .line 779
    move-result-object v15

    .line 780
    sget v10, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerInnerPadding:I

    .line 781
    .line 782
    invoke-virtual {v15, v10}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 783
    .line 784
    .line 785
    move-result v10

    .line 786
    invoke-virtual {v4, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 787
    .line 788
    .line 789
    const/4 v15, 0x0

    .line 790
    iput v15, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 791
    .line 792
    invoke-virtual {v4, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 793
    .line 794
    .line 795
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 796
    .line 797
    .line 798
    move-result-object v10

    .line 799
    sget v12, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerTitleBottomMargin:I

    .line 800
    .line 801
    invoke-virtual {v10, v12}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 802
    .line 803
    .line 804
    move-result v10

    .line 805
    iput v10, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 806
    .line 807
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 808
    .line 809
    const/16 v12, 0x1c

    .line 810
    .line 811
    if-lt v10, v12, :cond_15

    .line 812
    .line 813
    invoke-static {v7}, Lrt1;->k(Lcom/usercentrics/sdk/ui/components/UCTextView;)V

    .line 814
    .line 815
    .line 816
    goto :goto_d

    .line 817
    :cond_15
    invoke-virtual {v7, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 818
    .line 819
    .line 820
    :goto_d
    invoke-virtual {v1, v7, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 821
    .line 822
    .line 823
    :goto_e
    invoke-direct {v2}, Lqu2;->getScrollableContainer()Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 824
    .line 825
    .line 826
    move-result-object v1

    .line 827
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 828
    .line 829
    .line 830
    new-instance v4, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 831
    .line 832
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 833
    .line 834
    .line 835
    move-result-object v7

    .line 836
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 837
    .line 838
    .line 839
    invoke-direct {v4, v7, v6}, Lcom/usercentrics/sdk/ui/components/UCTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 840
    .line 841
    .line 842
    invoke-virtual {v11}, Lsu2;->a()Lmu2;

    .line 843
    .line 844
    .line 845
    move-result-object v7

    .line 846
    iget-object v7, v7, Lmu2;->a:Ljava/lang/String;

    .line 847
    .line 848
    invoke-virtual {v11}, Lsu2;->a()Lmu2;

    .line 849
    .line 850
    .line 851
    move-result-object v10

    .line 852
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 853
    .line 854
    .line 855
    move-object v10, v9

    .line 856
    new-instance v9, Ln01;

    .line 857
    .line 858
    move/from16 v22, v15

    .line 859
    .line 860
    const/4 v15, 0x0

    .line 861
    const/4 v12, 0x4

    .line 862
    const/16 v16, 0x2

    .line 863
    .line 864
    move-object/from16 v19, v10

    .line 865
    .line 866
    const/4 v10, 0x1

    .line 867
    move/from16 v21, v12

    .line 868
    .line 869
    const-class v12, Lsu2;

    .line 870
    .line 871
    move/from16 v23, v13

    .line 872
    .line 873
    const-string v13, "onHtmlLinkClick"

    .line 874
    .line 875
    move/from16 v24, v14

    .line 876
    .line 877
    const-string v14, "onHtmlLinkClick(Lcom/usercentrics/sdk/models/settings/PredefinedUIHtmlLinkType;)V"

    .line 878
    .line 879
    move-object/from16 v25, v19

    .line 880
    .line 881
    move/from16 v0, v23

    .line 882
    .line 883
    move/from16 v6, v24

    .line 884
    .line 885
    invoke-direct/range {v9 .. v16}, Ln01;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 886
    .line 887
    .line 888
    invoke-virtual {v4, v7, v9}, Lcom/usercentrics/sdk/ui/components/UCTextView;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 889
    .line 890
    .line 891
    const/16 v10, 0xe

    .line 892
    .line 893
    invoke-static {v4, v8, v10}, Lcom/usercentrics/sdk/ui/components/UCTextView;->h(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 894
    .line 895
    .line 896
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 897
    .line 898
    .line 899
    move-result-object v7

    .line 900
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 901
    .line 902
    .line 903
    invoke-static {v11}, Lou2;->a(Lsu2;)V

    .line 904
    .line 905
    .line 906
    new-instance v7, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 907
    .line 908
    invoke-direct {v7, v0, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 909
    .line 910
    .line 911
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 912
    .line 913
    .line 914
    move-result-object v9

    .line 915
    sget v12, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerInnerPadding:I

    .line 916
    .line 917
    invoke-virtual {v9, v12}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 918
    .line 919
    .line 920
    move-result v9

    .line 921
    invoke-virtual {v7, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 922
    .line 923
    .line 924
    invoke-virtual {v7, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 925
    .line 926
    .line 927
    invoke-virtual {v1, v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 928
    .line 929
    .line 930
    iget-object v7, v11, Lsu2;->l:Lhk2;

    .line 931
    .line 932
    invoke-virtual {v7}, Lhk2;->getValue()Ljava/lang/Object;

    .line 933
    .line 934
    .line 935
    move-result-object v7

    .line 936
    check-cast v7, Ljava/lang/String;

    .line 937
    .line 938
    if-nez v7, :cond_16

    .line 939
    .line 940
    goto :goto_f

    .line 941
    :cond_16
    new-instance v9, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 942
    .line 943
    invoke-direct {v9, v0, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 944
    .line 945
    .line 946
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 947
    .line 948
    .line 949
    move-result-object v12

    .line 950
    sget v13, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerInnerPadding:I

    .line 951
    .line 952
    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 953
    .line 954
    .line 955
    move-result v12

    .line 956
    invoke-virtual {v9, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 957
    .line 958
    .line 959
    invoke-virtual {v9, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 960
    .line 961
    .line 962
    new-instance v12, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 963
    .line 964
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 965
    .line 966
    .line 967
    move-result-object v13

    .line 968
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 969
    .line 970
    .line 971
    const/4 v14, 0x0

    .line 972
    invoke-direct {v12, v13, v14}, Lcom/usercentrics/sdk/ui/components/UCTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 973
    .line 974
    .line 975
    invoke-virtual {v1, v12, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 976
    .line 977
    .line 978
    invoke-virtual {v12, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 979
    .line 980
    .line 981
    const/16 v7, 0xc

    .line 982
    .line 983
    invoke-static {v12, v8, v7}, Lcom/usercentrics/sdk/ui/components/UCTextView;->i(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 984
    .line 985
    .line 986
    invoke-static {v12}, Lxe2;->k(Landroid/view/View;)V

    .line 987
    .line 988
    .line 989
    new-instance v7, Lnu2;

    .line 990
    .line 991
    invoke-direct {v7, v11, v1, v12, v4}, Lnu2;-><init>(Lsu2;Landroidx/appcompat/widget/LinearLayoutCompat;Lcom/usercentrics/sdk/ui/components/UCTextView;Lcom/usercentrics/sdk/ui/components/UCTextView;)V

    .line 992
    .line 993
    .line 994
    invoke-virtual {v12, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 995
    .line 996
    .line 997
    :goto_f
    invoke-direct {v2}, Lqu2;->getScrollableContainer()Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 998
    .line 999
    .line 1000
    move-result-object v1

    .line 1001
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1002
    .line 1003
    .line 1004
    iget-object v4, v11, Lsu2;->u:Lhk2;

    .line 1005
    .line 1006
    invoke-virtual {v4}, Lhk2;->getValue()Ljava/lang/Object;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v4

    .line 1010
    check-cast v4, Ljava/util/List;

    .line 1011
    .line 1012
    if-nez v4, :cond_17

    .line 1013
    .line 1014
    move v13, v0

    .line 1015
    const/4 v10, 0x1

    .line 1016
    goto/16 :goto_11

    .line 1017
    .line 1018
    :cond_17
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v7

    .line 1022
    sget v9, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerLinksVerticalPadding:I

    .line 1023
    .line 1024
    invoke-virtual {v7, v9}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 1025
    .line 1026
    .line 1027
    move-result v7

    .line 1028
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v9

    .line 1032
    sget v12, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerLinksHorizontalSpacing:I

    .line 1033
    .line 1034
    invoke-virtual {v9, v12}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 1035
    .line 1036
    .line 1037
    move-result v9

    .line 1038
    new-instance v12, Ljava/util/ArrayList;

    .line 1039
    .line 1040
    const/16 v13, 0xa

    .line 1041
    .line 1042
    invoke-static {v4, v13}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 1043
    .line 1044
    .line 1045
    move-result v14

    .line 1046
    invoke-direct {v12, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 1047
    .line 1048
    .line 1049
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v4

    .line 1053
    :goto_10
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1054
    .line 1055
    .line 1056
    move-result v14

    .line 1057
    if-eqz v14, :cond_18

    .line 1058
    .line 1059
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v14

    .line 1063
    check-cast v14, Lev1;

    .line 1064
    .line 1065
    new-instance v15, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 1066
    .line 1067
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v10

    .line 1071
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1072
    .line 1073
    .line 1074
    const/4 v0, 0x0

    .line 1075
    invoke-direct {v15, v10, v0}, Lcom/usercentrics/sdk/ui/components/UCTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 1076
    .line 1077
    .line 1078
    iget-object v10, v14, Lev1;->a:Ljava/lang/String;

    .line 1079
    .line 1080
    invoke-virtual {v15, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v15}, Landroid/view/View;->getPaddingLeft()I

    .line 1084
    .line 1085
    .line 1086
    move-result v10

    .line 1087
    invoke-virtual {v15}, Landroid/view/View;->getPaddingRight()I

    .line 1088
    .line 1089
    .line 1090
    move-result v0

    .line 1091
    invoke-virtual {v15, v10, v7, v0, v7}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 1092
    .line 1093
    .line 1094
    invoke-static {v15, v8, v13}, Lcom/usercentrics/sdk/ui/components/UCTextView;->i(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 1095
    .line 1096
    .line 1097
    new-instance v0, Lrp2;

    .line 1098
    .line 1099
    const/4 v10, 0x1

    .line 1100
    invoke-direct {v0, v10, v11, v14}, Lrp2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v15, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v11}, Lsu2;->a()Lmu2;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v0

    .line 1110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1111
    .line 1112
    .line 1113
    invoke-static {v15}, Lxe2;->k(Landroid/view/View;)V

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1117
    .line 1118
    .line 1119
    const/4 v0, -0x1

    .line 1120
    const/16 v10, 0xe

    .line 1121
    .line 1122
    goto :goto_10

    .line 1123
    :cond_18
    const/4 v10, 0x1

    .line 1124
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v0

    .line 1128
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1129
    .line 1130
    .line 1131
    invoke-static {v0, v12, v9}, Lmn0;->g(Landroid/content/Context;Ljava/util/ArrayList;I)Landroid/widget/LinearLayout;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v0

    .line 1135
    new-instance v4, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 1136
    .line 1137
    const/4 v13, -0x1

    .line 1138
    invoke-direct {v4, v13, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v7

    .line 1145
    sget v9, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerInnerPadding:I

    .line 1146
    .line 1147
    invoke-virtual {v7, v9}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 1148
    .line 1149
    .line 1150
    move-result v7

    .line 1151
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v9

    .line 1158
    sget v12, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerLinksTopMargin:I

    .line 1159
    .line 1160
    invoke-virtual {v9, v12}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 1161
    .line 1162
    .line 1163
    move-result v9

    .line 1164
    iput v9, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1165
    .line 1166
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v7

    .line 1173
    sget v9, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerLinksBottomMargin:I

    .line 1174
    .line 1175
    invoke-virtual {v7, v9}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 1176
    .line 1177
    .line 1178
    move-result v7

    .line 1179
    iput v7, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1180
    .line 1181
    invoke-virtual {v1, v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1182
    .line 1183
    .line 1184
    :goto_11
    invoke-direct {v2}, Lqu2;->getScrollableContainer()Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v9

    .line 1188
    invoke-direct {v2}, Lqu2;->getCardsVerticalMargin()I

    .line 1189
    .line 1190
    .line 1191
    move-result v12

    .line 1192
    new-instance v0, Ld92;

    .line 1193
    .line 1194
    move/from16 v21, v6

    .line 1195
    .line 1196
    const/4 v6, 0x0

    .line 1197
    const/4 v7, 0x2

    .line 1198
    const/4 v1, 0x2

    .line 1199
    move-object v4, v3

    .line 1200
    const-class v3, Lqu2;

    .line 1201
    .line 1202
    move-object v14, v4

    .line 1203
    const-string v4, "onExpandedCardListener"

    .line 1204
    .line 1205
    move-object v15, v5

    .line 1206
    const-string v5, "onExpandedCardListener(II)V"

    .line 1207
    .line 1208
    move/from16 p1, v10

    .line 1209
    .line 1210
    move-object v10, v15

    .line 1211
    move-object v15, v14

    .line 1212
    const/4 v14, 0x0

    .line 1213
    invoke-direct/range {v0 .. v7}, Ld92;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 1214
    .line 1215
    .line 1216
    move-object v7, v0

    .line 1217
    move-object v6, v2

    .line 1218
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v9}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v0

    .line 1225
    sget v1, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerInnerPadding:I

    .line 1226
    .line 1227
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 1228
    .line 1229
    .line 1230
    move-result v0

    .line 1231
    iget-object v1, v11, Lsu2;->w:Lhk2;

    .line 1232
    .line 1233
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v1

    .line 1237
    check-cast v1, Ljava/util/List;

    .line 1238
    .line 1239
    if-nez v1, :cond_1a

    .line 1240
    .line 1241
    :cond_19
    move-object v1, v8

    .line 1242
    move-object/from16 v21, v14

    .line 1243
    .line 1244
    const/4 v14, -0x2

    .line 1245
    goto/16 :goto_16

    .line 1246
    .line 1247
    :cond_1a
    sget-object v2, Lqt2;->Companion:Lpt2;

    .line 1248
    .line 1249
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1250
    .line 1251
    .line 1252
    invoke-static {v1}, Lpt2;->a(Ljava/util/List;)Ljava/util/ArrayList;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v16

    .line 1256
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v18

    .line 1260
    const/4 v1, 0x0

    .line 1261
    :goto_12
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 1262
    .line 1263
    .line 1264
    move-result v2

    .line 1265
    if-eqz v2, :cond_19

    .line 1266
    .line 1267
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v2

    .line 1271
    add-int/lit8 v19, v1, 0x1

    .line 1272
    .line 1273
    if-ltz v1, :cond_1f

    .line 1274
    .line 1275
    check-cast v2, Lqt2;

    .line 1276
    .line 1277
    instance-of v3, v2, Lzv2;

    .line 1278
    .line 1279
    if-eqz v3, :cond_1c

    .line 1280
    .line 1281
    check-cast v2, Lzv2;

    .line 1282
    .line 1283
    new-instance v1, Lcom/usercentrics/sdk/ui/components/UCSectionTitle;

    .line 1284
    .line 1285
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v3

    .line 1289
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1290
    .line 1291
    .line 1292
    invoke-direct {v1, v3, v14}, Lcom/usercentrics/sdk/ui/components/UCSectionTitle;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual {v1, v0, v12, v0, v12}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 1296
    .line 1297
    .line 1298
    invoke-virtual {v1, v8}, Lcom/usercentrics/sdk/ui/components/UCSectionTitle;->l(Lew2;)V

    .line 1299
    .line 1300
    .line 1301
    iget-object v2, v2, Lzv2;->a:Ljava/lang/String;

    .line 1302
    .line 1303
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1304
    .line 1305
    .line 1306
    new-instance v2, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 1307
    .line 1308
    const/4 v3, -0x2

    .line 1309
    invoke-direct {v2, v13, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1310
    .line 1311
    .line 1312
    invoke-virtual {v9, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1313
    .line 1314
    .line 1315
    :cond_1b
    move-object v1, v8

    .line 1316
    move-object/from16 v21, v14

    .line 1317
    .line 1318
    move v8, v0

    .line 1319
    move v14, v3

    .line 1320
    goto :goto_15

    .line 1321
    :cond_1c
    const/4 v3, -0x2

    .line 1322
    instance-of v4, v2, Lst2;

    .line 1323
    .line 1324
    if-eqz v4, :cond_1b

    .line 1325
    .line 1326
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->size()I

    .line 1327
    .line 1328
    .line 1329
    move-result v4

    .line 1330
    add-int/lit8 v4, v4, -0x1

    .line 1331
    .line 1332
    if-ne v1, v4, :cond_1d

    .line 1333
    .line 1334
    move/from16 v20, p1

    .line 1335
    .line 1336
    goto :goto_13

    .line 1337
    :cond_1d
    const/16 v20, 0x0

    .line 1338
    .line 1339
    :goto_13
    check-cast v2, Lst2;

    .line 1340
    .line 1341
    move v1, v0

    .line 1342
    new-instance v0, Lcom/usercentrics/sdk/ui/components/cards/UCCard;

    .line 1343
    .line 1344
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v4

    .line 1348
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1349
    .line 1350
    .line 1351
    invoke-direct {v0, v4, v14}, Lcom/usercentrics/sdk/ui/components/cards/UCCard;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 1352
    .line 1353
    .line 1354
    invoke-virtual {v0, v8}, Lcom/usercentrics/sdk/ui/components/cards/UCCard;->c(Lew2;)V

    .line 1355
    .line 1356
    .line 1357
    const/4 v4, 0x0

    .line 1358
    const/4 v5, 0x0

    .line 1359
    move/from16 v21, v3

    .line 1360
    .line 1361
    const/4 v3, 0x0

    .line 1362
    move-object/from16 v26, v8

    .line 1363
    .line 1364
    move v8, v1

    .line 1365
    move-object/from16 v1, v26

    .line 1366
    .line 1367
    move/from16 v26, v21

    .line 1368
    .line 1369
    move-object/from16 v21, v14

    .line 1370
    .line 1371
    move/from16 v14, v26

    .line 1372
    .line 1373
    invoke-virtual/range {v0 .. v5}, Lcom/usercentrics/sdk/ui/components/cards/UCCard;->b(Lew2;Lst2;ZLjv2;Ln01;)V

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual {v0, v7}, Lcom/usercentrics/sdk/ui/components/cards/UCCard;->setOnExpandedListener(Lkotlin/jvm/functions/Function2;)V

    .line 1377
    .line 1378
    .line 1379
    new-instance v2, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 1380
    .line 1381
    invoke-direct {v2, v13, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1382
    .line 1383
    .line 1384
    if-eqz v20, :cond_1e

    .line 1385
    .line 1386
    move v3, v8

    .line 1387
    goto :goto_14

    .line 1388
    :cond_1e
    move v3, v12

    .line 1389
    :goto_14
    invoke-virtual {v2, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual {v2, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1393
    .line 1394
    .line 1395
    iput v12, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1396
    .line 1397
    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1398
    .line 1399
    invoke-virtual {v9, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1400
    .line 1401
    .line 1402
    :goto_15
    move v0, v8

    .line 1403
    move-object/from16 v14, v21

    .line 1404
    .line 1405
    move-object v8, v1

    .line 1406
    move/from16 v1, v19

    .line 1407
    .line 1408
    goto/16 :goto_12

    .line 1409
    .line 1410
    :cond_1f
    move-object/from16 v21, v14

    .line 1411
    .line 1412
    invoke-static {}, Lpw;->g()V

    .line 1413
    .line 1414
    .line 1415
    throw v21

    .line 1416
    :goto_16
    invoke-direct {v6}, Lqu2;->getScrollableContainer()Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v0

    .line 1420
    iget-object v2, v11, Lsu2;->q:Lhk2;

    .line 1421
    .line 1422
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v2

    .line 1426
    check-cast v2, Ljava/lang/Boolean;

    .line 1427
    .line 1428
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1429
    .line 1430
    .line 1431
    move-result v2

    .line 1432
    const/high16 v3, 0x42c80000    # 100.0f

    .line 1433
    .line 1434
    if-eqz v2, :cond_20

    .line 1435
    .line 1436
    new-instance v2, Landroid/view/View;

    .line 1437
    .line 1438
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v4

    .line 1442
    invoke-direct {v2, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1443
    .line 1444
    .line 1445
    const/4 v12, 0x4

    .line 1446
    invoke-virtual {v2, v12}, Landroid/view/View;->setVisibility(I)V

    .line 1447
    .line 1448
    .line 1449
    new-instance v4, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 1450
    .line 1451
    invoke-direct {v4, v13, v13, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1452
    .line 1453
    .line 1454
    invoke-virtual {v0, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1455
    .line 1456
    .line 1457
    goto :goto_17

    .line 1458
    :cond_20
    const/4 v12, 0x4

    .line 1459
    :goto_17
    new-instance v0, Landroid/view/View;

    .line 1460
    .line 1461
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v2

    .line 1465
    invoke-direct {v0, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 1466
    .line 1467
    .line 1468
    const/16 v2, 0x8

    .line 1469
    .line 1470
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1471
    .line 1472
    .line 1473
    iget v2, v10, Lwt2;->j:I

    .line 1474
    .line 1475
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1476
    .line 1477
    .line 1478
    new-instance v2, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 1479
    .line 1480
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v4

    .line 1484
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1485
    .line 1486
    .line 1487
    const/high16 v5, 0x3f800000    # 1.0f

    .line 1488
    .line 1489
    invoke-static {v5, v4}, Lyy1;->n(FLandroid/content/Context;)F

    .line 1490
    .line 1491
    .line 1492
    move-result v4

    .line 1493
    float-to-int v4, v4

    .line 1494
    invoke-direct {v2, v13, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1495
    .line 1496
    .line 1497
    invoke-virtual {v6, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1498
    .line 1499
    .line 1500
    iput-object v0, v6, Lqu2;->g0:Landroid/view/View;

    .line 1501
    .line 1502
    invoke-virtual {v15}, Lhk2;->getValue()Ljava/lang/Object;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v0

    .line 1506
    check-cast v0, Lju2;

    .line 1507
    .line 1508
    const/16 v2, 0x11

    .line 1509
    .line 1510
    if-nez v0, :cond_21

    .line 1511
    .line 1512
    goto/16 :goto_18

    .line 1513
    .line 1514
    :cond_21
    new-instance v4, Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 1515
    .line 1516
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v7

    .line 1520
    move-object/from16 v8, v21

    .line 1521
    .line 1522
    invoke-direct {v4, v7, v8}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 1523
    .line 1524
    .line 1525
    const/4 v7, 0x0

    .line 1526
    invoke-virtual {v4, v7}, Landroidx/appcompat/widget/LinearLayoutCompat;->setOrientation(I)V

    .line 1527
    .line 1528
    .line 1529
    invoke-virtual {v4, v2}, Landroidx/appcompat/widget/LinearLayoutCompat;->setGravity(I)V

    .line 1530
    .line 1531
    .line 1532
    new-instance v7, Lcom/usercentrics/sdk/ui/components/UCToggle;

    .line 1533
    .line 1534
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v9

    .line 1538
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1539
    .line 1540
    .line 1541
    invoke-direct {v7, v9, v8}, Lcom/usercentrics/sdk/ui/components/UCToggle;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 1542
    .line 1543
    .line 1544
    invoke-virtual {v7, v1}, Lcom/usercentrics/sdk/ui/components/UCToggle;->f(Lew2;)V

    .line 1545
    .line 1546
    .line 1547
    iget-boolean v9, v0, Lju2;->b:Z

    .line 1548
    .line 1549
    invoke-virtual {v7, v9}, Lcom/usercentrics/sdk/ui/components/UCToggle;->setCurrentState(Z)V

    .line 1550
    .line 1551
    .line 1552
    new-instance v9, Lo;

    .line 1553
    .line 1554
    const/16 v10, 0x17

    .line 1555
    .line 1556
    invoke-direct {v9, v11, v10}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 1557
    .line 1558
    .line 1559
    invoke-virtual {v7, v9}, Lcom/usercentrics/sdk/ui/components/UCToggle;->setListener(Lkotlin/jvm/functions/Function1;)V

    .line 1560
    .line 1561
    .line 1562
    new-instance v9, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 1563
    .line 1564
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v10

    .line 1568
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1569
    .line 1570
    .line 1571
    invoke-direct {v9, v10, v8}, Lcom/usercentrics/sdk/ui/components/UCTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 1572
    .line 1573
    .line 1574
    const/16 v10, 0xe

    .line 1575
    .line 1576
    invoke-static {v9, v1, v10}, Lcom/usercentrics/sdk/ui/components/UCTextView;->h(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 1577
    .line 1578
    .line 1579
    iget-object v0, v0, Lju2;->a:Ljava/lang/String;

    .line 1580
    .line 1581
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1582
    .line 1583
    .line 1584
    new-instance v0, Lh51;

    .line 1585
    .line 1586
    const/4 v10, 0x2

    .line 1587
    invoke-direct {v0, v7, v10}, Lh51;-><init>(Ljava/lang/Object;I)V

    .line 1588
    .line 1589
    .line 1590
    invoke-virtual {v9, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1591
    .line 1592
    .line 1593
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1594
    .line 1595
    .line 1596
    new-instance v0, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 1597
    .line 1598
    invoke-direct {v0, v13, v14, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1599
    .line 1600
    .line 1601
    invoke-virtual {v6}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v3

    .line 1605
    sget v8, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerToggleTextSpacing:I

    .line 1606
    .line 1607
    invoke-virtual {v3, v8}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 1608
    .line 1609
    .line 1610
    move-result v3

    .line 1611
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1612
    .line 1613
    .line 1614
    const/4 v3, 0x0

    .line 1615
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1616
    .line 1617
    .line 1618
    invoke-virtual {v4, v9, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1619
    .line 1620
    .line 1621
    invoke-static {v7}, Lxe2;->c(Landroid/view/View;)V

    .line 1622
    .line 1623
    .line 1624
    invoke-static {v9}, Lxe2;->c(Landroid/view/View;)V

    .line 1625
    .line 1626
    .line 1627
    new-instance v0, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 1628
    .line 1629
    invoke-direct {v0, v13, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1630
    .line 1631
    .line 1632
    invoke-virtual {v6}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v3

    .line 1636
    sget v7, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerInnerPadding:I

    .line 1637
    .line 1638
    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 1639
    .line 1640
    .line 1641
    move-result v3

    .line 1642
    invoke-virtual {v6}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v7

    .line 1646
    sget v8, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerToggleVerticalMargin:I

    .line 1647
    .line 1648
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 1649
    .line 1650
    .line 1651
    move-result v7

    .line 1652
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1653
    .line 1654
    .line 1655
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1656
    .line 1657
    .line 1658
    iput v7, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1659
    .line 1660
    iput v7, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1661
    .line 1662
    invoke-virtual {v6, v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1663
    .line 1664
    .line 1665
    :goto_18
    invoke-virtual {v6}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v0

    .line 1669
    sget v3, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerInnerPadding:I

    .line 1670
    .line 1671
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 1672
    .line 1673
    .line 1674
    move-result v7

    .line 1675
    invoke-virtual {v6}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v0

    .line 1679
    sget v3, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerButtonsSpacing:I

    .line 1680
    .line 1681
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 1682
    .line 1683
    .line 1684
    move-result v0

    .line 1685
    invoke-virtual/range {v17 .. v17}, Lhk2;->getValue()Ljava/lang/Object;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v3

    .line 1689
    check-cast v3, Ljava/util/List;

    .line 1690
    .line 1691
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v3

    .line 1695
    const/4 v4, 0x0

    .line 1696
    :goto_19
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1697
    .line 1698
    .line 1699
    move-result v8

    .line 1700
    if-eqz v8, :cond_2f

    .line 1701
    .line 1702
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1703
    .line 1704
    .line 1705
    move-result-object v8

    .line 1706
    add-int/lit8 v9, v4, 0x1

    .line 1707
    .line 1708
    if-ltz v4, :cond_2e

    .line 1709
    .line 1710
    check-cast v8, Ljava/util/List;

    .line 1711
    .line 1712
    if-nez v4, :cond_22

    .line 1713
    .line 1714
    move/from16 v10, p1

    .line 1715
    .line 1716
    goto :goto_1a

    .line 1717
    :cond_22
    const/4 v10, 0x0

    .line 1718
    :goto_1a
    invoke-virtual/range {v17 .. v17}, Lhk2;->getValue()Ljava/lang/Object;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v16

    .line 1722
    check-cast v16, Ljava/util/List;

    .line 1723
    .line 1724
    invoke-static/range {v16 .. v16}, Lpw;->d(Ljava/util/List;)I

    .line 1725
    .line 1726
    .line 1727
    move-result v2

    .line 1728
    if-ne v4, v2, :cond_23

    .line 1729
    .line 1730
    move/from16 v2, p1

    .line 1731
    .line 1732
    goto :goto_1b

    .line 1733
    :cond_23
    const/4 v2, 0x0

    .line 1734
    :goto_1b
    new-instance v4, Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 1735
    .line 1736
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v14

    .line 1740
    const/4 v5, 0x0

    .line 1741
    invoke-direct {v4, v14, v5}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 1742
    .line 1743
    .line 1744
    const/4 v5, 0x0

    .line 1745
    invoke-virtual {v4, v5}, Landroidx/appcompat/widget/LinearLayoutCompat;->setOrientation(I)V

    .line 1746
    .line 1747
    .line 1748
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1749
    .line 1750
    .line 1751
    move-result-object v5

    .line 1752
    const/4 v8, 0x0

    .line 1753
    :goto_1c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1754
    .line 1755
    .line 1756
    move-result v14

    .line 1757
    if-eqz v14, :cond_26

    .line 1758
    .line 1759
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1760
    .line 1761
    .line 1762
    move-result-object v14

    .line 1763
    add-int/lit8 v16, v8, 0x1

    .line 1764
    .line 1765
    if-ltz v8, :cond_25

    .line 1766
    .line 1767
    check-cast v14, Lgt2;

    .line 1768
    .line 1769
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v13

    .line 1773
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1774
    .line 1775
    .line 1776
    new-instance v12, Lcom/usercentrics/sdk/ui/components/UCButton;

    .line 1777
    .line 1778
    move/from16 v20, v0

    .line 1779
    .line 1780
    const/4 v0, 0x0

    .line 1781
    invoke-direct {v12, v13, v0}, Lcom/usercentrics/sdk/ui/components/UCButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 1782
    .line 1783
    .line 1784
    new-instance v0, Llz;

    .line 1785
    .line 1786
    move/from16 v23, v2

    .line 1787
    .line 1788
    const/4 v2, 0x4

    .line 1789
    invoke-direct {v0, v2, v11, v14}, Llz;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1790
    .line 1791
    .line 1792
    invoke-virtual {v12, v14, v0}, Lcom/usercentrics/sdk/ui/components/UCButton;->k(Lgt2;Lkotlin/jvm/functions/Function0;)V

    .line 1793
    .line 1794
    .line 1795
    const/high16 v0, 0x42480000    # 50.0f

    .line 1796
    .line 1797
    invoke-static {v0, v13}, Lyy1;->n(FLandroid/content/Context;)F

    .line 1798
    .line 1799
    .line 1800
    move-result v0

    .line 1801
    float-to-int v0, v0

    .line 1802
    invoke-virtual {v12, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 1803
    .line 1804
    .line 1805
    new-instance v0, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 1806
    .line 1807
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1808
    .line 1809
    const/4 v13, 0x0

    .line 1810
    const/4 v14, -0x1

    .line 1811
    invoke-direct {v0, v13, v14, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1812
    .line 1813
    .line 1814
    if-nez v8, :cond_24

    .line 1815
    .line 1816
    move v8, v13

    .line 1817
    goto :goto_1d

    .line 1818
    :cond_24
    move/from16 v8, v20

    .line 1819
    .line 1820
    :goto_1d
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1821
    .line 1822
    .line 1823
    invoke-virtual {v0, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1824
    .line 1825
    .line 1826
    invoke-virtual {v4, v12, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1827
    .line 1828
    .line 1829
    move v13, v14

    .line 1830
    move/from16 v8, v16

    .line 1831
    .line 1832
    move/from16 v0, v20

    .line 1833
    .line 1834
    move/from16 v2, v23

    .line 1835
    .line 1836
    const/4 v12, 0x4

    .line 1837
    goto :goto_1c

    .line 1838
    :cond_25
    invoke-static {}, Lpw;->g()V

    .line 1839
    .line 1840
    .line 1841
    const/16 v21, 0x0

    .line 1842
    .line 1843
    throw v21

    .line 1844
    :cond_26
    move/from16 v20, v0

    .line 1845
    .line 1846
    move/from16 v23, v2

    .line 1847
    .line 1848
    move v14, v13

    .line 1849
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1850
    .line 1851
    new-instance v0, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 1852
    .line 1853
    const/4 v12, -0x2

    .line 1854
    invoke-direct {v0, v14, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1855
    .line 1856
    .line 1857
    invoke-virtual {v15}, Lhk2;->getValue()Ljava/lang/Object;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v5

    .line 1861
    check-cast v5, Lju2;

    .line 1862
    .line 1863
    if-eqz v5, :cond_27

    .line 1864
    .line 1865
    move/from16 v5, p1

    .line 1866
    .line 1867
    goto :goto_1e

    .line 1868
    :cond_27
    const/4 v5, 0x0

    .line 1869
    :goto_1e
    if-eqz v10, :cond_28

    .line 1870
    .line 1871
    if-eqz v5, :cond_28

    .line 1872
    .line 1873
    move-object/from16 v10, v25

    .line 1874
    .line 1875
    const/4 v5, 0x0

    .line 1876
    goto :goto_20

    .line 1877
    :cond_28
    if-eqz v10, :cond_29

    .line 1878
    .line 1879
    move v5, v7

    .line 1880
    :goto_1f
    move-object/from16 v10, v25

    .line 1881
    .line 1882
    goto :goto_20

    .line 1883
    :cond_29
    move/from16 v5, v20

    .line 1884
    .line 1885
    goto :goto_1f

    .line 1886
    :goto_20
    iget-object v8, v10, Ljw2;->c:Lij;

    .line 1887
    .line 1888
    iget-object v8, v8, Lij;->c:Ljava/lang/Object;

    .line 1889
    .line 1890
    check-cast v8, Lr4;

    .line 1891
    .line 1892
    if-eqz v8, :cond_2a

    .line 1893
    .line 1894
    iget-object v8, v8, Lr4;->b:Ljava/lang/String;

    .line 1895
    .line 1896
    goto :goto_21

    .line 1897
    :cond_2a
    const/4 v8, 0x0

    .line 1898
    :goto_21
    if-eqz v8, :cond_2b

    .line 1899
    .line 1900
    move/from16 v8, p1

    .line 1901
    .line 1902
    goto :goto_22

    .line 1903
    :cond_2b
    const/4 v8, 0x0

    .line 1904
    :goto_22
    if-eqz v23, :cond_2c

    .line 1905
    .line 1906
    if-eqz v8, :cond_2c

    .line 1907
    .line 1908
    invoke-virtual {v6}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1909
    .line 1910
    .line 1911
    move-result-object v8

    .line 1912
    sget v12, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerPoweredByVerticalMargin:I

    .line 1913
    .line 1914
    invoke-virtual {v8, v12}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 1915
    .line 1916
    .line 1917
    move-result v8

    .line 1918
    goto :goto_23

    .line 1919
    :cond_2c
    if-eqz v23, :cond_2d

    .line 1920
    .line 1921
    invoke-virtual {v6}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1922
    .line 1923
    .line 1924
    move-result-object v8

    .line 1925
    sget v12, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerInnerPadding:I

    .line 1926
    .line 1927
    invoke-virtual {v8, v12}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 1928
    .line 1929
    .line 1930
    move-result v8

    .line 1931
    goto :goto_23

    .line 1932
    :cond_2d
    const/4 v8, 0x0

    .line 1933
    :goto_23
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1934
    .line 1935
    .line 1936
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1937
    .line 1938
    .line 1939
    iput v5, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1940
    .line 1941
    iput v8, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1942
    .line 1943
    invoke-virtual {v6, v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1944
    .line 1945
    .line 1946
    move v5, v2

    .line 1947
    move v4, v9

    .line 1948
    move-object/from16 v25, v10

    .line 1949
    .line 1950
    move/from16 v0, v20

    .line 1951
    .line 1952
    const/16 v2, 0x11

    .line 1953
    .line 1954
    const/4 v12, 0x4

    .line 1955
    const/4 v13, -0x1

    .line 1956
    const/4 v14, -0x2

    .line 1957
    goto/16 :goto_19

    .line 1958
    .line 1959
    :cond_2e
    invoke-static {}, Lpw;->g()V

    .line 1960
    .line 1961
    .line 1962
    const/16 v21, 0x0

    .line 1963
    .line 1964
    throw v21

    .line 1965
    :cond_2f
    move-object/from16 v10, v25

    .line 1966
    .line 1967
    iget-object v0, v10, Ljw2;->c:Lij;

    .line 1968
    .line 1969
    iget-object v0, v0, Lij;->c:Ljava/lang/Object;

    .line 1970
    .line 1971
    check-cast v0, Lr4;

    .line 1972
    .line 1973
    if-eqz v0, :cond_30

    .line 1974
    .line 1975
    iget-object v0, v0, Lr4;->b:Ljava/lang/String;

    .line 1976
    .line 1977
    goto :goto_24

    .line 1978
    :cond_30
    const/4 v0, 0x0

    .line 1979
    :goto_24
    if-eqz v0, :cond_32

    .line 1980
    .line 1981
    invoke-static {v0}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 1982
    .line 1983
    .line 1984
    move-result v2

    .line 1985
    if-eqz v2, :cond_31

    .line 1986
    .line 1987
    goto :goto_25

    .line 1988
    :cond_31
    new-instance v2, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 1989
    .line 1990
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v3

    .line 1994
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1995
    .line 1996
    .line 1997
    const/4 v14, 0x0

    .line 1998
    invoke-direct {v2, v3, v14}, Lcom/usercentrics/sdk/ui/components/UCTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 1999
    .line 2000
    .line 2001
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2002
    .line 2003
    .line 2004
    const/16 v0, 0x11

    .line 2005
    .line 2006
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 2007
    .line 2008
    .line 2009
    invoke-virtual {v2, v1}, Lcom/usercentrics/sdk/ui/components/UCTextView;->j(Lew2;)V

    .line 2010
    .line 2011
    .line 2012
    new-instance v0, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 2013
    .line 2014
    const/4 v12, -0x2

    .line 2015
    const/4 v13, -0x1

    .line 2016
    invoke-direct {v0, v13, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2017
    .line 2018
    .line 2019
    invoke-virtual {v6}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2020
    .line 2021
    .line 2022
    move-result-object v1

    .line 2023
    sget v3, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerInnerPadding:I

    .line 2024
    .line 2025
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 2026
    .line 2027
    .line 2028
    move-result v1

    .line 2029
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 2030
    .line 2031
    .line 2032
    const/4 v13, 0x0

    .line 2033
    iput v13, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 2034
    .line 2035
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 2036
    .line 2037
    .line 2038
    invoke-virtual {v6}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2039
    .line 2040
    .line 2041
    move-result-object v1

    .line 2042
    sget v3, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerPoweredByVerticalMargin:I

    .line 2043
    .line 2044
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 2045
    .line 2046
    .line 2047
    move-result v1

    .line 2048
    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 2049
    .line 2050
    invoke-virtual {v6, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 2051
    .line 2052
    .line 2053
    :cond_32
    :goto_25
    return-void
.end method

.method private final getCardsVerticalMargin()I
    .locals 0

    .line 1
    iget-object p0, p0, Lqu2;->d0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private final getScrollView()Landroidx/core/widget/NestedScrollView;
    .locals 0

    .line 1
    iget-object p0, p0, Lqu2;->e0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroidx/core/widget/NestedScrollView;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getScrollableContainer()Landroidx/appcompat/widget/LinearLayoutCompat;
    .locals 0

    .line 1
    iget-object p0, p0, Lqu2;->f0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 8
    .line 9
    return-object p0
.end method

.method public static final j(Lqu2;II)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    filled-new-array {v0, v0}, [I

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-direct {p0}, Lqu2;->getScrollView()Landroidx/core/widget/NestedScrollView;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v2, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    aget v1, v1, v2

    .line 15
    .line 16
    add-int/2addr p1, p2

    .line 17
    invoke-direct {p0}, Lqu2;->getScrollView()Landroidx/core/widget/NestedScrollView;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    add-int/2addr p2, v1

    .line 26
    if-le p1, p2, :cond_0

    .line 27
    .line 28
    sub-int/2addr p1, p2

    .line 29
    invoke-direct {p0}, Lqu2;->getCardsVerticalMargin()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    add-int/2addr p1, p2

    .line 34
    invoke-direct {p0}, Lqu2;->getScrollView()Landroidx/core/widget/NestedScrollView;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0, v0, p1, v0}, Landroidx/core/widget/NestedScrollView;->o(IIZ)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroidx/appcompat/widget/LinearLayoutCompat;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lqu2;->getScrollView()Landroidx/core/widget/NestedScrollView;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-direct {p0}, Lqu2;->getScrollableContainer()Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    const/4 p3, 0x0

    .line 21
    if-ge p1, p2, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move p1, p3

    .line 26
    :goto_0
    if-eqz p1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/16 p3, 0x8

    .line 30
    .line 31
    :goto_1
    iget-object p0, p0, Lqu2;->g0:Landroid/view/View;

    .line 32
    .line 33
    invoke-virtual {p0, p3}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

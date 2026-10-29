.class public abstract Lcom/google/android/material/navigation/d;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lsl1;

.field public final b:Ltl1;

.field public final c:Lcom/google/android/material/navigation/b;

.field public d:Landroid/content/res/ColorStateList;

.field public e:Lyi2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 8

    .line 1
    invoke-static {p1, p2, p3, p4}, Lhd1;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Lcom/google/android/material/navigation/b;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p1, Lcom/google/android/material/navigation/b;->b:Z

    .line 15
    .line 16
    iput-object p1, p0, Lcom/google/android/material/navigation/d;->c:Lcom/google/android/material/navigation/b;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    sget-object v3, Lcom/google/android/material/R$styleable;->NavigationBarView:[I

    .line 23
    .line 24
    sget v2, Lcom/google/android/material/R$styleable;->NavigationBarView_itemTextAppearanceInactive:I

    .line 25
    .line 26
    sget v4, Lcom/google/android/material/R$styleable;->NavigationBarView_itemTextAppearanceActive:I

    .line 27
    .line 28
    filled-new-array {v2, v4}, [I

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    move-object v2, p2

    .line 33
    move v4, p3

    .line 34
    move v5, p4

    .line 35
    invoke-static/range {v1 .. v6}, Lrn2;->e(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Lac1;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    new-instance p3, Lsl1;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object p4

    .line 45
    invoke-virtual {p0}, Lcom/google/android/material/navigation/d;->getMaxItemCount()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-direct {p3, v1, p4, v2}, Lsl1;-><init>(Landroid/content/Context;Ljava/lang/Class;I)V

    .line 50
    .line 51
    .line 52
    iput-object p3, p0, Lcom/google/android/material/navigation/d;->a:Lsl1;

    .line 53
    .line 54
    invoke-virtual {p0, v1}, Lcom/google/android/material/navigation/d;->a(Landroid/content/Context;)Ltl1;

    .line 55
    .line 56
    .line 57
    move-result-object p4

    .line 58
    iput-object p4, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 59
    .line 60
    iput-object p4, p1, Lcom/google/android/material/navigation/b;->a:Ltl1;

    .line 61
    .line 62
    const/4 v2, 0x1

    .line 63
    iput v2, p1, Lcom/google/android/material/navigation/b;->c:I

    .line 64
    .line 65
    invoke-virtual {p4, p1}, Ltl1;->setPresenter(Lcom/google/android/material/navigation/b;)V

    .line 66
    .line 67
    .line 68
    iget-object v3, p3, Ljg1;->a:Landroid/content/Context;

    .line 69
    .line 70
    invoke-virtual {p3, p1, v3}, Ljg1;->b(Leh1;Landroid/content/Context;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    iget-object v3, p1, Lcom/google/android/material/navigation/b;->a:Ltl1;

    .line 77
    .line 78
    iput-object p3, v3, Ltl1;->p0:Ljg1;

    .line 79
    .line 80
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_itemIconTint:I

    .line 81
    .line 82
    iget-object v4, p2, Lac1;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v4, Landroid/content/res/TypedArray;

    .line 85
    .line 86
    invoke-virtual {v4, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_0

    .line 91
    .line 92
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_itemIconTint:I

    .line 93
    .line 94
    invoke-virtual {p2, v3}, Lac1;->m(I)Landroid/content/res/ColorStateList;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {p4, v3}, Ltl1;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_0
    invoke-virtual {p4}, Ltl1;->c()Landroid/content/res/ColorStateList;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {p4, v3}, Ltl1;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 107
    .line 108
    .line 109
    :goto_0
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_itemIconSize:I

    .line 110
    .line 111
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    sget v6, Lcom/google/android/material/R$dimen;->mtrl_navigation_bar_item_default_icon_size:I

    .line 116
    .line 117
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    invoke-virtual {v4, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    invoke-virtual {p0, v3}, Lcom/google/android/material/navigation/d;->setItemIconSize(I)V

    .line 126
    .line 127
    .line 128
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_itemTextAppearanceInactive:I

    .line 129
    .line 130
    invoke-virtual {v4, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eqz v3, :cond_1

    .line 135
    .line 136
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_itemTextAppearanceInactive:I

    .line 137
    .line 138
    invoke-virtual {v4, v3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    invoke-virtual {p0, v3}, Lcom/google/android/material/navigation/d;->setItemTextAppearanceInactive(I)V

    .line 143
    .line 144
    .line 145
    :cond_1
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_itemTextAppearanceActive:I

    .line 146
    .line 147
    invoke-virtual {v4, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-eqz v3, :cond_2

    .line 152
    .line 153
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_itemTextAppearanceActive:I

    .line 154
    .line 155
    invoke-virtual {v4, v3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    invoke-virtual {p0, v3}, Lcom/google/android/material/navigation/d;->setItemTextAppearanceActive(I)V

    .line 160
    .line 161
    .line 162
    :cond_2
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_itemTextColor:I

    .line 163
    .line 164
    invoke-virtual {v4, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-eqz v3, :cond_3

    .line 169
    .line 170
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_itemTextColor:I

    .line 171
    .line 172
    invoke-virtual {p2, v3}, Lac1;->m(I)Landroid/content/res/ColorStateList;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-virtual {p0, v3}, Lcom/google/android/material/navigation/d;->setItemTextColor(Landroid/content/res/ColorStateList;)V

    .line 177
    .line 178
    .line 179
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    if-eqz v3, :cond_4

    .line 184
    .line 185
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    instance-of v3, v3, Landroid/graphics/drawable/ColorDrawable;

    .line 190
    .line 191
    if-eqz v3, :cond_6

    .line 192
    .line 193
    :cond_4
    new-instance v3, Lfd1;

    .line 194
    .line 195
    invoke-direct {v3}, Lfd1;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    instance-of v6, v5, Landroid/graphics/drawable/ColorDrawable;

    .line 203
    .line 204
    if-eqz v6, :cond_5

    .line 205
    .line 206
    check-cast v5, Landroid/graphics/drawable/ColorDrawable;

    .line 207
    .line 208
    invoke-virtual {v5}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    invoke-static {v5}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    invoke-virtual {v3, v5}, Lfd1;->n(Landroid/content/res/ColorStateList;)V

    .line 217
    .line 218
    .line 219
    :cond_5
    invoke-virtual {v3, v1}, Lfd1;->k(Landroid/content/Context;)V

    .line 220
    .line 221
    .line 222
    sget-object v5, Le33;->a:Ljava/util/WeakHashMap;

    .line 223
    .line 224
    invoke-virtual {p0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 225
    .line 226
    .line 227
    :cond_6
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_itemPaddingTop:I

    .line 228
    .line 229
    invoke-virtual {v4, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    if-eqz v3, :cond_7

    .line 234
    .line 235
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_itemPaddingTop:I

    .line 236
    .line 237
    invoke-virtual {v4, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    invoke-virtual {p0, v3}, Lcom/google/android/material/navigation/d;->setItemPaddingTop(I)V

    .line 242
    .line 243
    .line 244
    :cond_7
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_itemPaddingBottom:I

    .line 245
    .line 246
    invoke-virtual {v4, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    if-eqz v3, :cond_8

    .line 251
    .line 252
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_itemPaddingBottom:I

    .line 253
    .line 254
    invoke-virtual {v4, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    invoke-virtual {p0, v3}, Lcom/google/android/material/navigation/d;->setItemPaddingBottom(I)V

    .line 259
    .line 260
    .line 261
    :cond_8
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_elevation:I

    .line 262
    .line 263
    invoke-virtual {v4, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    if-eqz v3, :cond_9

    .line 268
    .line 269
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_elevation:I

    .line 270
    .line 271
    invoke-virtual {v4, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    int-to-float v3, v3

    .line 276
    invoke-virtual {p0, v3}, Lcom/google/android/material/navigation/d;->setElevation(F)V

    .line 277
    .line 278
    .line 279
    :cond_9
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_backgroundTint:I

    .line 280
    .line 281
    invoke-static {v1, p2, v3}, Lde3;->n(Landroid/content/Context;Lac1;I)Landroid/content/res/ColorStateList;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    invoke-static {v5, v3}, Ls90;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 294
    .line 295
    .line 296
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_labelVisibilityMode:I

    .line 297
    .line 298
    const/4 v5, -0x1

    .line 299
    invoke-virtual {v4, v3, v5}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    invoke-virtual {p0, v3}, Lcom/google/android/material/navigation/d;->setLabelVisibilityMode(I)V

    .line 304
    .line 305
    .line 306
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_itemBackground:I

    .line 307
    .line 308
    invoke-virtual {v4, v3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    if-eqz v3, :cond_a

    .line 313
    .line 314
    invoke-virtual {p4, v3}, Ltl1;->setItemBackgroundRes(I)V

    .line 315
    .line 316
    .line 317
    goto :goto_1

    .line 318
    :cond_a
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_itemRippleColor:I

    .line 319
    .line 320
    invoke-static {v1, p2, v3}, Lde3;->n(Landroid/content/Context;Lac1;I)Landroid/content/res/ColorStateList;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    invoke-virtual {p0, v3}, Lcom/google/android/material/navigation/d;->setItemRippleColor(Landroid/content/res/ColorStateList;)V

    .line 325
    .line 326
    .line 327
    :goto_1
    sget v3, Lcom/google/android/material/R$styleable;->NavigationBarView_itemActiveIndicatorStyle:I

    .line 328
    .line 329
    invoke-virtual {v4, v3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    if-eqz v3, :cond_b

    .line 334
    .line 335
    invoke-virtual {p0, v2}, Lcom/google/android/material/navigation/d;->setItemActiveIndicatorEnabled(Z)V

    .line 336
    .line 337
    .line 338
    sget-object v5, Lcom/google/android/material/R$styleable;->NavigationBarActiveIndicator:[I

    .line 339
    .line 340
    invoke-virtual {v1, v3, v5}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    sget v5, Lcom/google/android/material/R$styleable;->NavigationBarActiveIndicator_android_width:I

    .line 345
    .line 346
    invoke-virtual {v3, v5, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 347
    .line 348
    .line 349
    move-result v5

    .line 350
    invoke-virtual {p0, v5}, Lcom/google/android/material/navigation/d;->setItemActiveIndicatorWidth(I)V

    .line 351
    .line 352
    .line 353
    sget v5, Lcom/google/android/material/R$styleable;->NavigationBarActiveIndicator_android_height:I

    .line 354
    .line 355
    invoke-virtual {v3, v5, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 356
    .line 357
    .line 358
    move-result v5

    .line 359
    invoke-virtual {p0, v5}, Lcom/google/android/material/navigation/d;->setItemActiveIndicatorHeight(I)V

    .line 360
    .line 361
    .line 362
    sget v5, Lcom/google/android/material/R$styleable;->NavigationBarActiveIndicator_marginHorizontal:I

    .line 363
    .line 364
    invoke-virtual {v3, v5, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 365
    .line 366
    .line 367
    move-result v5

    .line 368
    invoke-virtual {p0, v5}, Lcom/google/android/material/navigation/d;->setItemActiveIndicatorMarginHorizontal(I)V

    .line 369
    .line 370
    .line 371
    sget v5, Lcom/google/android/material/R$styleable;->NavigationBarActiveIndicator_android_color:I

    .line 372
    .line 373
    invoke-static {v1, v3, v5}, Lde3;->o(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 374
    .line 375
    .line 376
    move-result-object v5

    .line 377
    invoke-virtual {p0, v5}, Lcom/google/android/material/navigation/d;->setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V

    .line 378
    .line 379
    .line 380
    sget v5, Lcom/google/android/material/R$styleable;->NavigationBarActiveIndicator_shapeAppearance:I

    .line 381
    .line 382
    invoke-virtual {v3, v5, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 383
    .line 384
    .line 385
    move-result v5

    .line 386
    new-instance v6, Le;

    .line 387
    .line 388
    const/4 v7, 0x0

    .line 389
    invoke-direct {v6, v7}, Le;-><init>(F)V

    .line 390
    .line 391
    .line 392
    invoke-static {v1, v5, v0, v6}, Ltc2;->a(Landroid/content/Context;IILm10;)Lsc2;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    invoke-virtual {v1}, Lsc2;->a()Ltc2;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    invoke-virtual {p0, v1}, Lcom/google/android/material/navigation/d;->setItemActiveIndicatorShapeAppearance(Ltc2;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 404
    .line 405
    .line 406
    :cond_b
    sget v1, Lcom/google/android/material/R$styleable;->NavigationBarView_menu:I

    .line 407
    .line 408
    invoke-virtual {v4, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    if-eqz v1, :cond_c

    .line 413
    .line 414
    sget v1, Lcom/google/android/material/R$styleable;->NavigationBarView_menu:I

    .line 415
    .line 416
    invoke-virtual {v4, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 417
    .line 418
    .line 419
    move-result v1

    .line 420
    iput-boolean v2, p1, Lcom/google/android/material/navigation/b;->b:Z

    .line 421
    .line 422
    invoke-direct {p0}, Lcom/google/android/material/navigation/d;->getMenuInflater()Landroid/view/MenuInflater;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    invoke-virtual {v3, v1, p3}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 427
    .line 428
    .line 429
    iput-boolean v0, p1, Lcom/google/android/material/navigation/b;->b:Z

    .line 430
    .line 431
    invoke-virtual {p1, v2}, Lcom/google/android/material/navigation/b;->b(Z)V

    .line 432
    .line 433
    .line 434
    :cond_c
    invoke-virtual {p2}, Lac1;->J()V

    .line 435
    .line 436
    .line 437
    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 438
    .line 439
    .line 440
    new-instance p1, Lec0;

    .line 441
    .line 442
    invoke-direct {p1, p0}, Lec0;-><init>(Lcom/google/android/material/navigation/d;)V

    .line 443
    .line 444
    .line 445
    iput-object p1, p3, Ljg1;->e:Lhg1;

    .line 446
    .line 447
    return-void
.end method

.method private getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->e:Lyi2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lyi2;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lyi2;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/android/material/navigation/d;->e:Lyi2;

    .line 15
    .line 16
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->e:Lyi2;

    .line 17
    .line 18
    return-object p0
.end method


# virtual methods
.method public abstract a(Landroid/content/Context;)Ltl1;
.end method

.method public getItemActiveIndicatorColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltl1;->getItemActiveIndicatorColor()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getItemActiveIndicatorHeight()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltl1;->getItemActiveIndicatorHeight()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItemActiveIndicatorMarginHorizontal()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltl1;->getItemActiveIndicatorMarginHorizontal()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItemActiveIndicatorShapeAppearance()Ltc2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltl1;->getItemActiveIndicatorShapeAppearance()Ltc2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getItemActiveIndicatorWidth()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltl1;->getItemActiveIndicatorWidth()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItemBackground()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltl1;->getItemBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getItemBackgroundResource()I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltl1;->getItemBackgroundRes()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItemIconSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltl1;->getItemIconSize()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItemIconTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltl1;->getIconTintList()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getItemPaddingBottom()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltl1;->getItemPaddingBottom()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItemPaddingTop()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltl1;->getItemPaddingTop()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItemRippleColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->d:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getItemTextAppearanceActive()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltl1;->getItemTextAppearanceActive()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItemTextAppearanceInactive()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltl1;->getItemTextAppearanceInactive()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItemTextColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltl1;->getItemTextColor()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getLabelVisibilityMode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltl1;->getLabelVisibilityMode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public abstract getMaxItemCount()I
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->a:Lsl1;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMenuView()Lhh1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPresenter()Lcom/google/android/material/navigation/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->c:Lcom/google/android/material/navigation/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSelectedItemId()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ltl1;->getSelectedItemId()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lhe3;->s(Landroid/view/ViewGroup;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/google/android/material/navigation/NavigationBarView$SavedState;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Lcom/google/android/material/navigation/NavigationBarView$SavedState;

    .line 10
    .line 11
    iget-object v0, p1, Landroidx/customview/view/AbsSavedState;->a:Landroid/os/Parcelable;

    .line 12
    .line 13
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->a:Lsl1;

    .line 17
    .line 18
    iget-object p1, p1, Lcom/google/android/material/navigation/NavigationBarView$SavedState;->c:Landroid/os/Bundle;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljg1;->t(Landroid/os/Bundle;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/google/android/material/navigation/NavigationBarView$SavedState;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, v1, Lcom/google/android/material/navigation/NavigationBarView$SavedState;->c:Landroid/os/Bundle;

    .line 16
    .line 17
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->a:Lsl1;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljg1;->v(Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method

.method public setElevation(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setElevation(F)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Lhe3;->m(Landroid/view/ViewGroup;F)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltl1;->setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorEnabled(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltl1;->setItemActiveIndicatorEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorHeight(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltl1;->setItemActiveIndicatorHeight(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorMarginHorizontal(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltl1;->setItemActiveIndicatorMarginHorizontal(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorShapeAppearance(Ltc2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltl1;->setItemActiveIndicatorShapeAppearance(Ltc2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorWidth(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltl1;->setItemActiveIndicatorWidth(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ltl1;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lcom/google/android/material/navigation/d;->d:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    return-void
.end method

.method public setItemBackgroundResource(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ltl1;->setItemBackgroundRes(I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lcom/google/android/material/navigation/d;->d:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    return-void
.end method

.method public setItemIconSize(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltl1;->setItemIconSize(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemIconSizeRes(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/d;->setItemIconSize(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setItemIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltl1;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemPaddingBottom(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltl1;->setItemPaddingBottom(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemPaddingTop(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltl1;->setItemPaddingTop(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemRippleColor(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->d:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 5
    .line 6
    if-ne v0, p1, :cond_1

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v2}, Ltl1;->getItemBackground()Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ltl1;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :cond_1
    iput-object p1, p0, Lcom/google/android/material/navigation/d;->d:Landroid/content/res/ColorStateList;

    .line 21
    .line 22
    if-nez p1, :cond_2

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ltl1;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_2
    invoke-static {p1}, Lc52;->a(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    new-instance p1, Landroid/graphics/drawable/RippleDrawable;

    .line 33
    .line 34
    invoke-direct {p1, p0, v1, v1}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p1}, Ltl1;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public setItemTextAppearanceActive(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltl1;->setItemTextAppearanceActive(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextAppearanceInactive(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltl1;->setItemTextAppearanceInactive(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltl1;->setItemTextColor(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setLabelVisibilityMode(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->b:Ltl1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ltl1;->getLabelVisibilityMode()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eq v1, p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ltl1;->setLabelVisibilityMode(I)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->c:Lcom/google/android/material/navigation/b;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/b;->b(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setOnItemReselectedListener(Lul1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setOnItemSelectedListener(Lvl1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setSelectedItemId(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/d;->a:Lsl1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljg1;->findItem(I)Landroid/view/MenuItem;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lcom/google/android/material/navigation/d;->c:Lcom/google/android/material/navigation/b;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, p0, v1}, Ljg1;->q(Landroid/view/MenuItem;Leh1;I)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    invoke-interface {p1, p0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

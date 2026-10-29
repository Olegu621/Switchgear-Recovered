.class public Lcom/google/android/material/navigation/NavigationView;
.super Lcom/google/android/material/internal/ScrimInsetsFrameLayout;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/navigation/NavigationView$SavedState;
    }
.end annotation


# static fields
.field public static final f0:[I

.field public static final g0:[I

.field public static final h0:I


# instance fields
.field public U:Lyi2;

.field public final V:Lo2;

.field public W:Z

.field public a0:Z

.field public final b0:I

.field public final c0:I

.field public d0:Landroid/graphics/Path;

.field public final e0:Landroid/graphics/RectF;

.field public final f:Lwl1;

.field public final i:Lgm1;

.field public final v:I

.field public final w:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const v0, 0x10100a0

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lcom/google/android/material/navigation/NavigationView;->f0:[I

    .line 9
    .line 10
    const v0, -0x101009e

    .line 11
    .line 12
    .line 13
    filled-new-array {v0}, [I

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lcom/google/android/material/navigation/NavigationView;->g0:[I

    .line 18
    .line 19
    sget v0, Lcom/google/android/material/R$style;->Widget_Design_NavigationView:I

    .line 20
    .line 21
    sput v0, Lcom/google/android/material/navigation/NavigationView;->h0:I

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 739
    sget v0, Lcom/google/android/material/R$attr;->navigationViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/navigation/NavigationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move/from16 v4, p3

    .line 6
    .line 7
    sget v5, Lcom/google/android/material/navigation/NavigationView;->h0:I

    .line 8
    .line 9
    move-object/from16 v1, p1

    .line 10
    .line 11
    invoke-static {v1, v2, v4, v5}, Lhd1;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1, v2, v4}, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 16
    .line 17
    .line 18
    new-instance v7, Lgm1;

    .line 19
    .line 20
    invoke-direct {v7}, Lgm1;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v7, v0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    new-array v1, v1, [I

    .line 27
    .line 28
    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->w:[I

    .line 29
    .line 30
    const/4 v8, 0x1

    .line 31
    iput-boolean v8, v0, Lcom/google/android/material/navigation/NavigationView;->W:Z

    .line 32
    .line 33
    iput-boolean v8, v0, Lcom/google/android/material/navigation/NavigationView;->a0:Z

    .line 34
    .line 35
    const/4 v9, 0x0

    .line 36
    iput v9, v0, Lcom/google/android/material/navigation/NavigationView;->b0:I

    .line 37
    .line 38
    iput v9, v0, Lcom/google/android/material/navigation/NavigationView;->c0:I

    .line 39
    .line 40
    new-instance v1, Landroid/graphics/RectF;

    .line 41
    .line 42
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->e0:Landroid/graphics/RectF;

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    new-instance v10, Lwl1;

    .line 52
    .line 53
    invoke-direct {v10, v1}, Ljg1;-><init>(Landroid/content/Context;)V

    .line 54
    .line 55
    .line 56
    iput-object v10, v0, Lcom/google/android/material/navigation/NavigationView;->f:Lwl1;

    .line 57
    .line 58
    sget-object v3, Lcom/google/android/material/R$styleable;->NavigationView:[I

    .line 59
    .line 60
    new-array v6, v9, [I

    .line 61
    .line 62
    invoke-static/range {v1 .. v6}, Lrn2;->e(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Lac1;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    sget v6, Lcom/google/android/material/R$styleable;->NavigationView_android_background:I

    .line 67
    .line 68
    iget-object v11, v3, Lac1;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v11, Landroid/content/res/TypedArray;

    .line 71
    .line 72
    invoke-virtual {v11, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_0

    .line 77
    .line 78
    sget v6, Lcom/google/android/material/R$styleable;->NavigationView_android_background:I

    .line 79
    .line 80
    invoke-virtual {v3, v6}, Lac1;->n(I)Landroid/graphics/drawable/Drawable;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    sget-object v12, Le33;->a:Ljava/util/WeakHashMap;

    .line 85
    .line 86
    invoke-virtual {v0, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 87
    .line 88
    .line 89
    :cond_0
    sget v6, Lcom/google/android/material/R$styleable;->NavigationView_drawerLayoutCornerSize:I

    .line 90
    .line 91
    invoke-virtual {v11, v6, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    iput v6, v0, Lcom/google/android/material/navigation/NavigationView;->c0:I

    .line 96
    .line 97
    sget v6, Lcom/google/android/material/R$styleable;->NavigationView_android_layout_gravity:I

    .line 98
    .line 99
    invoke-virtual {v11, v6, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    iput v6, v0, Lcom/google/android/material/navigation/NavigationView;->b0:I

    .line 104
    .line 105
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    if-eqz v6, :cond_1

    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    instance-of v6, v6, Landroid/graphics/drawable/ColorDrawable;

    .line 116
    .line 117
    if-eqz v6, :cond_3

    .line 118
    .line 119
    :cond_1
    invoke-static {v1, v2, v4, v5}, Ltc2;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)Lsc2;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v2}, Lsc2;->a()Ltc2;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    new-instance v5, Lfd1;

    .line 132
    .line 133
    invoke-direct {v5, v2}, Lfd1;-><init>(Ltc2;)V

    .line 134
    .line 135
    .line 136
    instance-of v2, v4, Landroid/graphics/drawable/ColorDrawable;

    .line 137
    .line 138
    if-eqz v2, :cond_2

    .line 139
    .line 140
    check-cast v4, Landroid/graphics/drawable/ColorDrawable;

    .line 141
    .line 142
    invoke-virtual {v4}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v5, v2}, Lfd1;->n(Landroid/content/res/ColorStateList;)V

    .line 151
    .line 152
    .line 153
    :cond_2
    invoke-virtual {v5, v1}, Lfd1;->k(Landroid/content/Context;)V

    .line 154
    .line 155
    .line 156
    sget-object v2, Le33;->a:Ljava/util/WeakHashMap;

    .line 157
    .line 158
    invoke-virtual {v0, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 159
    .line 160
    .line 161
    :cond_3
    sget v2, Lcom/google/android/material/R$styleable;->NavigationView_elevation:I

    .line 162
    .line 163
    invoke-virtual {v11, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    if-eqz v2, :cond_4

    .line 168
    .line 169
    sget v2, Lcom/google/android/material/R$styleable;->NavigationView_elevation:I

    .line 170
    .line 171
    invoke-virtual {v11, v2, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    int-to-float v2, v2

    .line 176
    invoke-virtual {v0, v2}, Lcom/google/android/material/navigation/NavigationView;->setElevation(F)V

    .line 177
    .line 178
    .line 179
    :cond_4
    sget v2, Lcom/google/android/material/R$styleable;->NavigationView_android_fitsSystemWindows:I

    .line 180
    .line 181
    invoke-virtual {v11, v2, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    invoke-virtual {v0, v2}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 186
    .line 187
    .line 188
    sget v2, Lcom/google/android/material/R$styleable;->NavigationView_android_maxWidth:I

    .line 189
    .line 190
    invoke-virtual {v11, v2, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    iput v2, v0, Lcom/google/android/material/navigation/NavigationView;->v:I

    .line 195
    .line 196
    sget v2, Lcom/google/android/material/R$styleable;->NavigationView_subheaderColor:I

    .line 197
    .line 198
    invoke-virtual {v11, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    const/4 v4, 0x0

    .line 203
    if-eqz v2, :cond_5

    .line 204
    .line 205
    sget v2, Lcom/google/android/material/R$styleable;->NavigationView_subheaderColor:I

    .line 206
    .line 207
    invoke-virtual {v3, v2}, Lac1;->m(I)Landroid/content/res/ColorStateList;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    goto :goto_0

    .line 212
    :cond_5
    move-object v2, v4

    .line 213
    :goto_0
    sget v5, Lcom/google/android/material/R$styleable;->NavigationView_subheaderTextAppearance:I

    .line 214
    .line 215
    invoke-virtual {v11, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-eqz v5, :cond_6

    .line 220
    .line 221
    sget v5, Lcom/google/android/material/R$styleable;->NavigationView_subheaderTextAppearance:I

    .line 222
    .line 223
    invoke-virtual {v11, v5, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    goto :goto_1

    .line 228
    :cond_6
    move v5, v9

    .line 229
    :goto_1
    const v6, 0x1010038

    .line 230
    .line 231
    .line 232
    if-nez v5, :cond_7

    .line 233
    .line 234
    if-nez v2, :cond_7

    .line 235
    .line 236
    invoke-virtual {v0, v6}, Lcom/google/android/material/navigation/NavigationView;->b(I)Landroid/content/res/ColorStateList;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    :cond_7
    sget v12, Lcom/google/android/material/R$styleable;->NavigationView_itemIconTint:I

    .line 241
    .line 242
    invoke-virtual {v11, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 243
    .line 244
    .line 245
    move-result v12

    .line 246
    if-eqz v12, :cond_8

    .line 247
    .line 248
    sget v6, Lcom/google/android/material/R$styleable;->NavigationView_itemIconTint:I

    .line 249
    .line 250
    invoke-virtual {v3, v6}, Lac1;->m(I)Landroid/content/res/ColorStateList;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    goto :goto_2

    .line 255
    :cond_8
    invoke-virtual {v0, v6}, Lcom/google/android/material/navigation/NavigationView;->b(I)Landroid/content/res/ColorStateList;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    :goto_2
    sget v12, Lcom/google/android/material/R$styleable;->NavigationView_itemTextAppearance:I

    .line 260
    .line 261
    invoke-virtual {v11, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 262
    .line 263
    .line 264
    move-result v12

    .line 265
    if-eqz v12, :cond_9

    .line 266
    .line 267
    sget v12, Lcom/google/android/material/R$styleable;->NavigationView_itemTextAppearance:I

    .line 268
    .line 269
    invoke-virtual {v11, v12, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 270
    .line 271
    .line 272
    move-result v12

    .line 273
    goto :goto_3

    .line 274
    :cond_9
    move v12, v9

    .line 275
    :goto_3
    sget v13, Lcom/google/android/material/R$styleable;->NavigationView_itemIconSize:I

    .line 276
    .line 277
    invoke-virtual {v11, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 278
    .line 279
    .line 280
    move-result v13

    .line 281
    if-eqz v13, :cond_a

    .line 282
    .line 283
    sget v13, Lcom/google/android/material/R$styleable;->NavigationView_itemIconSize:I

    .line 284
    .line 285
    invoke-virtual {v11, v13, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 286
    .line 287
    .line 288
    move-result v13

    .line 289
    invoke-virtual {v0, v13}, Lcom/google/android/material/navigation/NavigationView;->setItemIconSize(I)V

    .line 290
    .line 291
    .line 292
    :cond_a
    sget v13, Lcom/google/android/material/R$styleable;->NavigationView_itemTextColor:I

    .line 293
    .line 294
    invoke-virtual {v11, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 295
    .line 296
    .line 297
    move-result v13

    .line 298
    if-eqz v13, :cond_b

    .line 299
    .line 300
    sget v13, Lcom/google/android/material/R$styleable;->NavigationView_itemTextColor:I

    .line 301
    .line 302
    invoke-virtual {v3, v13}, Lac1;->m(I)Landroid/content/res/ColorStateList;

    .line 303
    .line 304
    .line 305
    move-result-object v13

    .line 306
    goto :goto_4

    .line 307
    :cond_b
    move-object v13, v4

    .line 308
    :goto_4
    if-nez v12, :cond_c

    .line 309
    .line 310
    if-nez v13, :cond_c

    .line 311
    .line 312
    const v13, 0x1010036

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0, v13}, Lcom/google/android/material/navigation/NavigationView;->b(I)Landroid/content/res/ColorStateList;

    .line 316
    .line 317
    .line 318
    move-result-object v13

    .line 319
    :cond_c
    sget v14, Lcom/google/android/material/R$styleable;->NavigationView_itemBackground:I

    .line 320
    .line 321
    invoke-virtual {v3, v14}, Lac1;->n(I)Landroid/graphics/drawable/Drawable;

    .line 322
    .line 323
    .line 324
    move-result-object v14

    .line 325
    if-nez v14, :cond_e

    .line 326
    .line 327
    sget v15, Lcom/google/android/material/R$styleable;->NavigationView_itemShapeAppearance:I

    .line 328
    .line 329
    invoke-virtual {v11, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 330
    .line 331
    .line 332
    move-result v15

    .line 333
    if-nez v15, :cond_d

    .line 334
    .line 335
    sget v15, Lcom/google/android/material/R$styleable;->NavigationView_itemShapeAppearanceOverlay:I

    .line 336
    .line 337
    invoke-virtual {v11, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 338
    .line 339
    .line 340
    move-result v15

    .line 341
    if-eqz v15, :cond_e

    .line 342
    .line 343
    :cond_d
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 344
    .line 345
    .line 346
    move-result-object v14

    .line 347
    sget v15, Lcom/google/android/material/R$styleable;->NavigationView_itemShapeFillColor:I

    .line 348
    .line 349
    invoke-static {v14, v3, v15}, Lde3;->n(Landroid/content/Context;Lac1;I)Landroid/content/res/ColorStateList;

    .line 350
    .line 351
    .line 352
    move-result-object v14

    .line 353
    invoke-virtual {v0, v3, v14}, Lcom/google/android/material/navigation/NavigationView;->c(Lac1;Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/InsetDrawable;

    .line 354
    .line 355
    .line 356
    move-result-object v14

    .line 357
    sget v15, Lcom/google/android/material/R$styleable;->NavigationView_itemRippleColor:I

    .line 358
    .line 359
    invoke-static {v1, v3, v15}, Lde3;->n(Landroid/content/Context;Lac1;I)Landroid/content/res/ColorStateList;

    .line 360
    .line 361
    .line 362
    move-result-object v15

    .line 363
    if-eqz v15, :cond_e

    .line 364
    .line 365
    invoke-virtual {v0, v3, v4}, Lcom/google/android/material/navigation/NavigationView;->c(Lac1;Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/InsetDrawable;

    .line 366
    .line 367
    .line 368
    move-result-object v8

    .line 369
    new-instance v9, Landroid/graphics/drawable/RippleDrawable;

    .line 370
    .line 371
    invoke-static {v15}, Lc52;->b(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 372
    .line 373
    .line 374
    move-result-object v15

    .line 375
    invoke-direct {v9, v15, v4, v8}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 376
    .line 377
    .line 378
    iput-object v9, v7, Lgm1;->X:Landroid/graphics/drawable/RippleDrawable;

    .line 379
    .line 380
    const/4 v4, 0x0

    .line 381
    invoke-virtual {v7, v4}, Lgm1;->b(Z)V

    .line 382
    .line 383
    .line 384
    goto :goto_5

    .line 385
    :cond_e
    move v4, v9

    .line 386
    :goto_5
    sget v8, Lcom/google/android/material/R$styleable;->NavigationView_itemHorizontalPadding:I

    .line 387
    .line 388
    invoke-virtual {v11, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 389
    .line 390
    .line 391
    move-result v8

    .line 392
    if-eqz v8, :cond_f

    .line 393
    .line 394
    sget v8, Lcom/google/android/material/R$styleable;->NavigationView_itemHorizontalPadding:I

    .line 395
    .line 396
    invoke-virtual {v11, v8, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 397
    .line 398
    .line 399
    move-result v8

    .line 400
    invoke-virtual {v0, v8}, Lcom/google/android/material/navigation/NavigationView;->setItemHorizontalPadding(I)V

    .line 401
    .line 402
    .line 403
    :cond_f
    sget v8, Lcom/google/android/material/R$styleable;->NavigationView_itemVerticalPadding:I

    .line 404
    .line 405
    invoke-virtual {v11, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 406
    .line 407
    .line 408
    move-result v8

    .line 409
    if-eqz v8, :cond_10

    .line 410
    .line 411
    sget v8, Lcom/google/android/material/R$styleable;->NavigationView_itemVerticalPadding:I

    .line 412
    .line 413
    invoke-virtual {v11, v8, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 414
    .line 415
    .line 416
    move-result v8

    .line 417
    invoke-virtual {v0, v8}, Lcom/google/android/material/navigation/NavigationView;->setItemVerticalPadding(I)V

    .line 418
    .line 419
    .line 420
    :cond_10
    sget v8, Lcom/google/android/material/R$styleable;->NavigationView_dividerInsetStart:I

    .line 421
    .line 422
    invoke-virtual {v11, v8, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 423
    .line 424
    .line 425
    move-result v8

    .line 426
    invoke-virtual {v0, v8}, Lcom/google/android/material/navigation/NavigationView;->setDividerInsetStart(I)V

    .line 427
    .line 428
    .line 429
    sget v8, Lcom/google/android/material/R$styleable;->NavigationView_dividerInsetEnd:I

    .line 430
    .line 431
    invoke-virtual {v11, v8, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 432
    .line 433
    .line 434
    move-result v8

    .line 435
    invoke-virtual {v0, v8}, Lcom/google/android/material/navigation/NavigationView;->setDividerInsetEnd(I)V

    .line 436
    .line 437
    .line 438
    sget v8, Lcom/google/android/material/R$styleable;->NavigationView_subheaderInsetStart:I

    .line 439
    .line 440
    invoke-virtual {v11, v8, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 441
    .line 442
    .line 443
    move-result v8

    .line 444
    invoke-virtual {v0, v8}, Lcom/google/android/material/navigation/NavigationView;->setSubheaderInsetStart(I)V

    .line 445
    .line 446
    .line 447
    sget v8, Lcom/google/android/material/R$styleable;->NavigationView_subheaderInsetEnd:I

    .line 448
    .line 449
    invoke-virtual {v11, v8, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 450
    .line 451
    .line 452
    move-result v8

    .line 453
    invoke-virtual {v0, v8}, Lcom/google/android/material/navigation/NavigationView;->setSubheaderInsetEnd(I)V

    .line 454
    .line 455
    .line 456
    sget v8, Lcom/google/android/material/R$styleable;->NavigationView_topInsetScrimEnabled:I

    .line 457
    .line 458
    iget-boolean v9, v0, Lcom/google/android/material/navigation/NavigationView;->W:Z

    .line 459
    .line 460
    invoke-virtual {v11, v8, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 461
    .line 462
    .line 463
    move-result v8

    .line 464
    invoke-virtual {v0, v8}, Lcom/google/android/material/navigation/NavigationView;->setTopInsetScrimEnabled(Z)V

    .line 465
    .line 466
    .line 467
    sget v8, Lcom/google/android/material/R$styleable;->NavigationView_bottomInsetScrimEnabled:I

    .line 468
    .line 469
    iget-boolean v9, v0, Lcom/google/android/material/navigation/NavigationView;->a0:Z

    .line 470
    .line 471
    invoke-virtual {v11, v8, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 472
    .line 473
    .line 474
    move-result v8

    .line 475
    invoke-virtual {v0, v8}, Lcom/google/android/material/navigation/NavigationView;->setBottomInsetScrimEnabled(Z)V

    .line 476
    .line 477
    .line 478
    sget v8, Lcom/google/android/material/R$styleable;->NavigationView_itemIconPadding:I

    .line 479
    .line 480
    invoke-virtual {v11, v8, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 481
    .line 482
    .line 483
    move-result v8

    .line 484
    sget v4, Lcom/google/android/material/R$styleable;->NavigationView_itemMaxLines:I

    .line 485
    .line 486
    const/4 v9, 0x1

    .line 487
    invoke-virtual {v11, v4, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 488
    .line 489
    .line 490
    move-result v4

    .line 491
    invoke-virtual {v0, v4}, Lcom/google/android/material/navigation/NavigationView;->setItemMaxLines(I)V

    .line 492
    .line 493
    .line 494
    new-instance v4, Lzb0;

    .line 495
    .line 496
    const/16 v15, 0x16

    .line 497
    .line 498
    invoke-direct {v4, v0, v15}, Lzb0;-><init>(Ljava/lang/Object;I)V

    .line 499
    .line 500
    .line 501
    iput-object v4, v10, Ljg1;->e:Lhg1;

    .line 502
    .line 503
    iput v9, v7, Lgm1;->d:I

    .line 504
    .line 505
    invoke-virtual {v7, v1, v10}, Lgm1;->k(Landroid/content/Context;Ljg1;)V

    .line 506
    .line 507
    .line 508
    if-eqz v5, :cond_11

    .line 509
    .line 510
    iput v5, v7, Lgm1;->i:I

    .line 511
    .line 512
    const/4 v4, 0x0

    .line 513
    invoke-virtual {v7, v4}, Lgm1;->b(Z)V

    .line 514
    .line 515
    .line 516
    goto :goto_6

    .line 517
    :cond_11
    const/4 v4, 0x0

    .line 518
    :goto_6
    iput-object v2, v7, Lgm1;->v:Landroid/content/res/ColorStateList;

    .line 519
    .line 520
    invoke-virtual {v7, v4}, Lgm1;->b(Z)V

    .line 521
    .line 522
    .line 523
    iput-object v6, v7, Lgm1;->V:Landroid/content/res/ColorStateList;

    .line 524
    .line 525
    invoke-virtual {v7, v4}, Lgm1;->b(Z)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v0}, Landroid/view/View;->getOverScrollMode()I

    .line 529
    .line 530
    .line 531
    move-result v1

    .line 532
    iput v1, v7, Lgm1;->k0:I

    .line 533
    .line 534
    iget-object v2, v7, Lgm1;->a:Lcom/google/android/material/internal/NavigationMenuView;

    .line 535
    .line 536
    if-eqz v2, :cond_12

    .line 537
    .line 538
    invoke-virtual {v2, v1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 539
    .line 540
    .line 541
    :cond_12
    if-eqz v12, :cond_13

    .line 542
    .line 543
    iput v12, v7, Lgm1;->w:I

    .line 544
    .line 545
    invoke-virtual {v7, v4}, Lgm1;->b(Z)V

    .line 546
    .line 547
    .line 548
    :cond_13
    iput-object v13, v7, Lgm1;->U:Landroid/content/res/ColorStateList;

    .line 549
    .line 550
    invoke-virtual {v7, v4}, Lgm1;->b(Z)V

    .line 551
    .line 552
    .line 553
    iput-object v14, v7, Lgm1;->W:Landroid/graphics/drawable/Drawable;

    .line 554
    .line 555
    invoke-virtual {v7, v4}, Lgm1;->b(Z)V

    .line 556
    .line 557
    .line 558
    iput v8, v7, Lgm1;->a0:I

    .line 559
    .line 560
    invoke-virtual {v7, v4}, Lgm1;->b(Z)V

    .line 561
    .line 562
    .line 563
    iget-object v1, v10, Ljg1;->a:Landroid/content/Context;

    .line 564
    .line 565
    invoke-virtual {v10, v7, v1}, Ljg1;->b(Leh1;Landroid/content/Context;)V

    .line 566
    .line 567
    .line 568
    iget-object v1, v7, Lgm1;->a:Lcom/google/android/material/internal/NavigationMenuView;

    .line 569
    .line 570
    if-nez v1, :cond_16

    .line 571
    .line 572
    iget-object v1, v7, Lgm1;->f:Landroid/view/LayoutInflater;

    .line 573
    .line 574
    sget v2, Lcom/google/android/material/R$layout;->design_navigation_menu:I

    .line 575
    .line 576
    invoke-virtual {v1, v2, v0, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    check-cast v1, Lcom/google/android/material/internal/NavigationMenuView;

    .line 581
    .line 582
    iput-object v1, v7, Lgm1;->a:Lcom/google/android/material/internal/NavigationMenuView;

    .line 583
    .line 584
    new-instance v2, Ldm1;

    .line 585
    .line 586
    iget-object v4, v7, Lgm1;->a:Lcom/google/android/material/internal/NavigationMenuView;

    .line 587
    .line 588
    invoke-direct {v2, v7, v4}, Ldm1;-><init>(Lgm1;Lcom/google/android/material/internal/NavigationMenuView;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAccessibilityDelegateCompat(Lc22;)V

    .line 592
    .line 593
    .line 594
    iget-object v1, v7, Lgm1;->e:Lyl1;

    .line 595
    .line 596
    if-nez v1, :cond_14

    .line 597
    .line 598
    new-instance v1, Lyl1;

    .line 599
    .line 600
    invoke-direct {v1, v7}, Lyl1;-><init>(Lgm1;)V

    .line 601
    .line 602
    .line 603
    iput-object v1, v7, Lgm1;->e:Lyl1;

    .line 604
    .line 605
    :cond_14
    iget v1, v7, Lgm1;->k0:I

    .line 606
    .line 607
    const/4 v2, -0x1

    .line 608
    if-eq v1, v2, :cond_15

    .line 609
    .line 610
    iget-object v2, v7, Lgm1;->a:Lcom/google/android/material/internal/NavigationMenuView;

    .line 611
    .line 612
    invoke-virtual {v2, v1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 613
    .line 614
    .line 615
    :cond_15
    iget-object v1, v7, Lgm1;->f:Landroid/view/LayoutInflater;

    .line 616
    .line 617
    sget v2, Lcom/google/android/material/R$layout;->design_navigation_item_header:I

    .line 618
    .line 619
    iget-object v4, v7, Lgm1;->a:Lcom/google/android/material/internal/NavigationMenuView;

    .line 620
    .line 621
    const/4 v5, 0x0

    .line 622
    invoke-virtual {v1, v2, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    check-cast v1, Landroid/widget/LinearLayout;

    .line 627
    .line 628
    iput-object v1, v7, Lgm1;->b:Landroid/widget/LinearLayout;

    .line 629
    .line 630
    iget-object v1, v7, Lgm1;->a:Lcom/google/android/material/internal/NavigationMenuView;

    .line 631
    .line 632
    iget-object v2, v7, Lgm1;->e:Lyl1;

    .line 633
    .line 634
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/g;)V

    .line 635
    .line 636
    .line 637
    :cond_16
    iget-object v1, v7, Lgm1;->a:Lcom/google/android/material/internal/NavigationMenuView;

    .line 638
    .line 639
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 640
    .line 641
    .line 642
    sget v1, Lcom/google/android/material/R$styleable;->NavigationView_menu:I

    .line 643
    .line 644
    invoke-virtual {v11, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 645
    .line 646
    .line 647
    move-result v1

    .line 648
    if-eqz v1, :cond_19

    .line 649
    .line 650
    sget v1, Lcom/google/android/material/R$styleable;->NavigationView_menu:I

    .line 651
    .line 652
    const/4 v4, 0x0

    .line 653
    invoke-virtual {v11, v1, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 654
    .line 655
    .line 656
    move-result v1

    .line 657
    iget-object v2, v7, Lgm1;->e:Lyl1;

    .line 658
    .line 659
    if-eqz v2, :cond_17

    .line 660
    .line 661
    const/4 v9, 0x1

    .line 662
    iput-boolean v9, v2, Lyl1;->f:Z

    .line 663
    .line 664
    :cond_17
    invoke-direct {v0}, Lcom/google/android/material/navigation/NavigationView;->getMenuInflater()Landroid/view/MenuInflater;

    .line 665
    .line 666
    .line 667
    move-result-object v2

    .line 668
    invoke-virtual {v2, v1, v10}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 669
    .line 670
    .line 671
    iget-object v1, v7, Lgm1;->e:Lyl1;

    .line 672
    .line 673
    if-eqz v1, :cond_18

    .line 674
    .line 675
    iput-boolean v4, v1, Lyl1;->f:Z

    .line 676
    .line 677
    :cond_18
    invoke-virtual {v7, v4}, Lgm1;->b(Z)V

    .line 678
    .line 679
    .line 680
    goto :goto_7

    .line 681
    :cond_19
    const/4 v4, 0x0

    .line 682
    :goto_7
    sget v1, Lcom/google/android/material/R$styleable;->NavigationView_headerLayout:I

    .line 683
    .line 684
    invoke-virtual {v11, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 685
    .line 686
    .line 687
    move-result v1

    .line 688
    if-eqz v1, :cond_1a

    .line 689
    .line 690
    sget v1, Lcom/google/android/material/R$styleable;->NavigationView_headerLayout:I

    .line 691
    .line 692
    invoke-virtual {v11, v1, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 693
    .line 694
    .line 695
    move-result v1

    .line 696
    iget-object v2, v7, Lgm1;->f:Landroid/view/LayoutInflater;

    .line 697
    .line 698
    iget-object v5, v7, Lgm1;->b:Landroid/widget/LinearLayout;

    .line 699
    .line 700
    invoke-virtual {v2, v1, v5, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 701
    .line 702
    .line 703
    move-result-object v1

    .line 704
    iget-object v2, v7, Lgm1;->b:Landroid/widget/LinearLayout;

    .line 705
    .line 706
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 707
    .line 708
    .line 709
    iget-object v1, v7, Lgm1;->a:Lcom/google/android/material/internal/NavigationMenuView;

    .line 710
    .line 711
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 712
    .line 713
    .line 714
    move-result v2

    .line 715
    invoke-virtual {v1, v4, v4, v4, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 716
    .line 717
    .line 718
    :cond_1a
    invoke-virtual {v3}, Lac1;->J()V

    .line 719
    .line 720
    .line 721
    new-instance v1, Lo2;

    .line 722
    .line 723
    const/4 v2, 0x5

    .line 724
    invoke-direct {v1, v0, v2}, Lo2;-><init>(Ljava/lang/Object;I)V

    .line 725
    .line 726
    .line 727
    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->V:Lo2;

    .line 728
    .line 729
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    iget-object v0, v0, Lcom/google/android/material/navigation/NavigationView;->V:Lo2;

    .line 734
    .line 735
    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 736
    .line 737
    .line 738
    return-void
.end method

.method private getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->U:Lyi2;

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
    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->U:Lyi2;

    .line 15
    .line 16
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->U:Lyi2;

    .line 17
    .line 18
    return-object p0
.end method


# virtual methods
.method public final a(Lm83;)V
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lm83;->d()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget v1, p0, Lgm1;->i0:I

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eq v1, v0, :cond_1

    .line 14
    .line 15
    iput v0, p0, Lgm1;->i0:I

    .line 16
    .line 17
    iget-object v0, p0, Lgm1;->b:Landroid/widget/LinearLayout;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    iget-boolean v0, p0, Lgm1;->g0:Z

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget v0, p0, Lgm1;->i0:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v0, v2

    .line 33
    :goto_0
    iget-object v1, p0, Lgm1;->a:Lcom/google/android/material/internal/NavigationMenuView;

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {v1, v2, v0, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object v0, p0, Lgm1;->a:Lcom/google/android/material/internal/NavigationMenuView;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {p1}, Lm83;->a()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-virtual {v0, v2, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, Lgm1;->b:Landroid/widget/LinearLayout;

    .line 56
    .line 57
    invoke-static {p0, p1}, Le33;->b(Landroid/view/View;Lm83;)Lm83;

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final b(I)Landroid/content/res/ColorStateList;
    .locals 5

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget v1, v0, Landroid/util/TypedValue;->resourceId:I

    .line 27
    .line 28
    invoke-static {p1, v1}, Lv00;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    sget v1, Landroidx/appcompat/R$attr;->colorPrimary:I

    .line 41
    .line 42
    invoke-virtual {p0, v1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_1

    .line 47
    .line 48
    :goto_0
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_1
    iget p0, v0, Landroid/util/TypedValue;->data:I

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    new-instance v1, Landroid/content/res/ColorStateList;

    .line 57
    .line 58
    sget-object v2, Lcom/google/android/material/navigation/NavigationView;->f0:[I

    .line 59
    .line 60
    sget-object v3, Landroid/widget/FrameLayout;->EMPTY_STATE_SET:[I

    .line 61
    .line 62
    sget-object v4, Lcom/google/android/material/navigation/NavigationView;->g0:[I

    .line 63
    .line 64
    filled-new-array {v4, v2, v3}, [[I

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {p1, v4, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    filled-new-array {p1, p0, v0}, [I

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-direct {v1, v2, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 77
    .line 78
    .line 79
    return-object v1
.end method

.method public final c(Lac1;Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/InsetDrawable;
    .locals 9

    .line 1
    sget v0, Lcom/google/android/material/R$styleable;->NavigationView_itemShapeAppearance:I

    .line 2
    .line 3
    iget-object p1, p1, Lac1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroid/content/res/TypedArray;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    sget v2, Lcom/google/android/material/R$styleable;->NavigationView_itemShapeAppearanceOverlay:I

    .line 13
    .line 14
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    new-instance v4, Lfd1;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance v3, Le;

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    invoke-direct {v3, v5}, Le;-><init>(F)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0, v0, v2, v3}, Ltc2;->a(Landroid/content/Context;IILm10;)Lsc2;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Lsc2;->a()Ltc2;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {v4, p0}, Lfd1;-><init>(Ltc2;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, p2}, Lfd1;->n(Landroid/content/res/ColorStateList;)V

    .line 42
    .line 43
    .line 44
    sget p0, Lcom/google/android/material/R$styleable;->NavigationView_itemShapeInsetStart:I

    .line 45
    .line 46
    invoke-virtual {p1, p0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    sget p0, Lcom/google/android/material/R$styleable;->NavigationView_itemShapeInsetTop:I

    .line 51
    .line 52
    invoke-virtual {p1, p0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    sget p0, Lcom/google/android/material/R$styleable;->NavigationView_itemShapeInsetEnd:I

    .line 57
    .line 58
    invoke-virtual {p1, p0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    sget p0, Lcom/google/android/material/R$styleable;->NavigationView_itemShapeInsetBottom:I

    .line 63
    .line 64
    invoke-virtual {p1, p0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    new-instance v3, Landroid/graphics/drawable/InsetDrawable;

    .line 69
    .line 70
    invoke-direct/range {v3 .. v8}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 71
    .line 72
    .line 73
    return-object v3
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->d0:Landroid/graphics/Path;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->d0:Landroid/graphics/Path;

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 16
    .line 17
    .line 18
    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public getCheckedItem()Landroid/view/MenuItem;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iget-object p0, p0, Lgm1;->e:Lyl1;

    .line 4
    .line 5
    iget-object p0, p0, Lyl1;->e:Lsg1;

    .line 6
    .line 7
    return-object p0
.end method

.method public getDividerInsetEnd()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iget p0, p0, Lgm1;->d0:I

    .line 4
    .line 5
    return p0
.end method

.method public getDividerInsetStart()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iget p0, p0, Lgm1;->c0:I

    .line 4
    .line 5
    return p0
.end method

.method public getHeaderCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iget-object p0, p0, Lgm1;->b:Landroid/widget/LinearLayout;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public getItemBackground()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iget-object p0, p0, Lgm1;->W:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    return-object p0
.end method

.method public getItemHorizontalPadding()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iget p0, p0, Lgm1;->Y:I

    .line 4
    .line 5
    return p0
.end method

.method public getItemIconPadding()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iget p0, p0, Lgm1;->a0:I

    .line 4
    .line 5
    return p0
.end method

.method public getItemIconTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iget-object p0, p0, Lgm1;->V:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    return-object p0
.end method

.method public getItemMaxLines()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iget p0, p0, Lgm1;->h0:I

    .line 4
    .line 5
    return p0
.end method

.method public getItemTextColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iget-object p0, p0, Lgm1;->U:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    return-object p0
.end method

.method public getItemVerticalPadding()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iget p0, p0, Lgm1;->Z:I

    .line 4
    .line 5
    return p0
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->f:Lwl1;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSubheaderInsetEnd()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public getSubheaderInsetStart()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iget p0, p0, Lgm1;->e0:I

    .line 4
    .line 5
    return p0
.end method

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lhe3;->s(Landroid/view/ViewGroup;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/material/internal/ScrimInsetsFrameLayout;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->V:Lo2;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    const/high16 v2, 0x40000000    # 2.0f

    .line 8
    .line 9
    iget v3, p0, Lcom/google/android/material/navigation/NavigationView;->v:I

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v3, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/google/android/material/navigation/NavigationView$SavedState;

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
    check-cast p1, Lcom/google/android/material/navigation/NavigationView$SavedState;

    .line 10
    .line 11
    iget-object v0, p1, Landroidx/customview/view/AbsSavedState;->a:Landroid/os/Parcelable;

    .line 12
    .line 13
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->f:Lwl1;

    .line 17
    .line 18
    iget-object p1, p1, Lcom/google/android/material/navigation/NavigationView$SavedState;->c:Landroid/os/Bundle;

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
    new-instance v1, Lcom/google/android/material/navigation/NavigationView$SavedState;

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
    iput-object v0, v1, Lcom/google/android/material/navigation/NavigationView$SavedState;->c:Landroid/os/Bundle;

    .line 16
    .line 17
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->f:Lwl1;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljg1;->v(Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method

.method public final onSizeChanged(IIII)V
    .locals 6

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    instance-of p3, p3, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 9
    .line 10
    iget-object v3, p0, Lcom/google/android/material/navigation/NavigationView;->e0:Landroid/graphics/RectF;

    .line 11
    .line 12
    if-eqz p3, :cond_2

    .line 13
    .line 14
    iget p3, p0, Lcom/google/android/material/navigation/NavigationView;->c0:I

    .line 15
    .line 16
    if-lez p3, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    instance-of p4, p4, Lfd1;

    .line 23
    .line 24
    if-eqz p4, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    .line 29
    move-result-object p4

    .line 30
    check-cast p4, Lfd1;

    .line 31
    .line 32
    iget-object v0, p4, Lfd1;->a:Led1;

    .line 33
    .line 34
    iget-object v0, v0, Led1;->a:Ltc2;

    .line 35
    .line 36
    invoke-virtual {v0}, Ltc2;->f()Lsc2;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v1, Le33;->a:Ljava/util/WeakHashMap;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iget v2, p0, Lcom/google/android/material/navigation/NavigationView;->b0:I

    .line 47
    .line 48
    invoke-static {v2, v1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    const/4 v2, 0x3

    .line 53
    if-ne v1, v2, :cond_0

    .line 54
    .line 55
    int-to-float p3, p3

    .line 56
    new-instance v1, Le;

    .line 57
    .line 58
    invoke-direct {v1, p3}, Le;-><init>(F)V

    .line 59
    .line 60
    .line 61
    iput-object v1, v0, Lsc2;->f:Lm10;

    .line 62
    .line 63
    new-instance v1, Le;

    .line 64
    .line 65
    invoke-direct {v1, p3}, Le;-><init>(F)V

    .line 66
    .line 67
    .line 68
    iput-object v1, v0, Lsc2;->g:Lm10;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    int-to-float p3, p3

    .line 72
    new-instance v1, Le;

    .line 73
    .line 74
    invoke-direct {v1, p3}, Le;-><init>(F)V

    .line 75
    .line 76
    .line 77
    iput-object v1, v0, Lsc2;->e:Lm10;

    .line 78
    .line 79
    new-instance v1, Le;

    .line 80
    .line 81
    invoke-direct {v1, p3}, Le;-><init>(F)V

    .line 82
    .line 83
    .line 84
    iput-object v1, v0, Lsc2;->h:Lm10;

    .line 85
    .line 86
    :goto_0
    invoke-virtual {v0}, Lsc2;->a()Ltc2;

    .line 87
    .line 88
    .line 89
    move-result-object p3

    .line 90
    invoke-virtual {p4, p3}, Lfd1;->setShapeAppearanceModel(Ltc2;)V

    .line 91
    .line 92
    .line 93
    iget-object p3, p0, Lcom/google/android/material/navigation/NavigationView;->d0:Landroid/graphics/Path;

    .line 94
    .line 95
    if-nez p3, :cond_1

    .line 96
    .line 97
    new-instance p3, Landroid/graphics/Path;

    .line 98
    .line 99
    invoke-direct {p3}, Landroid/graphics/Path;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object p3, p0, Lcom/google/android/material/navigation/NavigationView;->d0:Landroid/graphics/Path;

    .line 103
    .line 104
    :cond_1
    iget-object p3, p0, Lcom/google/android/material/navigation/NavigationView;->d0:Landroid/graphics/Path;

    .line 105
    .line 106
    invoke-virtual {p3}, Landroid/graphics/Path;->reset()V

    .line 107
    .line 108
    .line 109
    int-to-float p1, p1

    .line 110
    int-to-float p2, p2

    .line 111
    const/4 p3, 0x0

    .line 112
    invoke-virtual {v3, p3, p3, p1, p2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 113
    .line 114
    .line 115
    sget-object v0, Luc2;->a:Lvc2;

    .line 116
    .line 117
    iget-object p1, p4, Lfd1;->a:Led1;

    .line 118
    .line 119
    iget-object v1, p1, Led1;->a:Ltc2;

    .line 120
    .line 121
    iget v2, p1, Led1;->i:F

    .line 122
    .line 123
    iget-object v5, p0, Lcom/google/android/material/navigation/NavigationView;->d0:Landroid/graphics/Path;

    .line 124
    .line 125
    const/4 v4, 0x0

    .line 126
    invoke-virtual/range {v0 .. v5}, Lvc2;->a(Ltc2;FLandroid/graphics/RectF;Lts0;Landroid/graphics/Path;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_2
    const/4 p1, 0x0

    .line 134
    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->d0:Landroid/graphics/Path;

    .line 135
    .line 136
    invoke-virtual {v3}, Landroid/graphics/RectF;->setEmpty()V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public setBottomInsetScrimEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationView;->a0:Z

    .line 2
    .line 3
    return-void
.end method

.method public setCheckedItem(I)V
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->f:Lwl1;

    invoke-virtual {v0, p1}, Ljg1;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 30
    check-cast p1, Lsg1;

    .line 31
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    iget-object p0, p0, Lgm1;->e:Lyl1;

    .line 32
    invoke-virtual {p0, p1}, Lyl1;->i(Lsg1;)V

    :cond_0
    return-void
.end method

.method public setCheckedItem(Landroid/view/MenuItem;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->f:Lwl1;

    .line 2
    .line 3
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {v0, p1}, Ljg1;->findItem(I)Landroid/view/MenuItem;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    check-cast p1, Lsg1;

    .line 14
    .line 15
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 16
    .line 17
    iget-object p0, p0, Lgm1;->e:Lyl1;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lyl1;->i(Lsg1;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p0, "Called setCheckedItem(MenuItem) with an item that is not in the current menu."

    .line 24
    .line 25
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public setDividerInsetEnd(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iput p1, p0, Lgm1;->d0:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lgm1;->b(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setDividerInsetStart(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iput p1, p0, Lgm1;->c0:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lgm1;->b(Z)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iput-object p1, p0, Lgm1;->W:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lgm1;->b(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setItemBackgroundResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lv00;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationView;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setItemHorizontalPadding(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iput p1, p0, Lgm1;->Y:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lgm1;->b(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setItemHorizontalPaddingResource(I)V
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
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 10
    .line 11
    iput p1, p0, Lgm1;->Y:I

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Lgm1;->b(Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setItemIconPadding(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iput p1, p0, Lgm1;->a0:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lgm1;->b(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setItemIconPaddingResource(I)V
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
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 10
    .line 11
    iput p1, p0, Lgm1;->a0:I

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Lgm1;->b(Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setItemIconSize(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iget v0, p0, Lgm1;->b0:I

    .line 4
    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lgm1;->b0:I

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lgm1;->f0:Z

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1}, Lgm1;->b(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setItemIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iput-object p1, p0, Lgm1;->V:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lgm1;->b(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setItemMaxLines(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iput p1, p0, Lgm1;->h0:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lgm1;->b(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setItemTextAppearance(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iput p1, p0, Lgm1;->w:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lgm1;->b(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iput-object p1, p0, Lgm1;->U:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lgm1;->b(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setItemVerticalPadding(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iput p1, p0, Lgm1;->Z:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lgm1;->b(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setItemVerticalPaddingResource(I)V
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
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 10
    .line 11
    iput p1, p0, Lgm1;->Z:I

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Lgm1;->b(Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setNavigationItemSelectedListener(Lkm1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setOverScrollMode(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lgm1;->k0:I

    .line 9
    .line 10
    iget-object p0, p0, Lgm1;->a:Lcom/google/android/material/internal/NavigationMenuView;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setSubheaderInsetEnd(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iput p1, p0, Lgm1;->e0:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lgm1;->b(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setSubheaderInsetStart(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->i:Lgm1;

    .line 2
    .line 3
    iput p1, p0, Lgm1;->e0:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Lgm1;->b(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setTopInsetScrimEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationView;->W:Z

    .line 2
    .line 3
    return-void
.end method

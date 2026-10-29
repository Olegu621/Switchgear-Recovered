.class public final Lka;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljp1;
.implements Ldh1;


# instance fields
.field public final synthetic a:Lwa;


# direct methods
.method public synthetic constructor <init>(Lwa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lka;->a:Lwa;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public d(Ljg1;Z)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljg1;->k()Ljg1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    move v3, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v3, v1

    .line 12
    :goto_0
    if-eqz v3, :cond_1

    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :cond_1
    iget-object p0, p0, Lka;->a:Lwa;

    .line 16
    .line 17
    iget-object v4, p0, Lwa;->w0:[Lva;

    .line 18
    .line 19
    if-eqz v4, :cond_2

    .line 20
    .line 21
    array-length v5, v4

    .line 22
    goto :goto_1

    .line 23
    :cond_2
    move v5, v1

    .line 24
    :goto_1
    if-ge v1, v5, :cond_4

    .line 25
    .line 26
    aget-object v6, v4, v1

    .line 27
    .line 28
    if-eqz v6, :cond_3

    .line 29
    .line 30
    iget-object v7, v6, Lva;->h:Ljg1;

    .line 31
    .line 32
    if-ne v7, p1, :cond_3

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_4
    const/4 v6, 0x0

    .line 39
    :goto_2
    if-eqz v6, :cond_6

    .line 40
    .line 41
    if-eqz v3, :cond_5

    .line 42
    .line 43
    iget p1, v6, Lva;->a:I

    .line 44
    .line 45
    invoke-virtual {p0, p1, v6, v0}, Lwa;->q(ILva;Ljg1;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v6, v2}, Lwa;->s(Lva;Z)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_5
    invoke-virtual {p0, v6, p2}, Lwa;->s(Lva;Z)V

    .line 53
    .line 54
    .line 55
    :cond_6
    return-void
.end method

.method public k(Landroid/view/View;Lm83;)Lm83;
    .locals 14

    .line 1
    invoke-virtual/range {p2 .. p2}, Lm83;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, Lka;->a:Lwa;

    .line 6
    .line 7
    iget-object v1, p0, Lwa;->V:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual/range {p2 .. p2}, Lm83;->d()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, p0, Lwa;->g0:Landroidx/appcompat/widget/ActionBarContextView;

    .line 14
    .line 15
    const/16 v4, 0x8

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v3, :cond_11

    .line 19
    .line 20
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    instance-of v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 25
    .line 26
    if-eqz v3, :cond_11

    .line 27
    .line 28
    iget-object v3, p0, Lwa;->g0:Landroidx/appcompat/widget/ActionBarContextView;

    .line 29
    .line 30
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 35
    .line 36
    iget-object v6, p0, Lwa;->g0:Landroidx/appcompat/widget/ActionBarContextView;

    .line 37
    .line 38
    invoke-virtual {v6}, Landroid/view/View;->isShown()Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/4 v7, 0x1

    .line 43
    if-eqz v6, :cond_f

    .line 44
    .line 45
    iget-object v6, p0, Lwa;->N0:Landroid/graphics/Rect;

    .line 46
    .line 47
    if-nez v6, :cond_0

    .line 48
    .line 49
    new-instance v6, Landroid/graphics/Rect;

    .line 50
    .line 51
    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v6, p0, Lwa;->N0:Landroid/graphics/Rect;

    .line 55
    .line 56
    new-instance v6, Landroid/graphics/Rect;

    .line 57
    .line 58
    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v6, p0, Lwa;->O0:Landroid/graphics/Rect;

    .line 62
    .line 63
    :cond_0
    iget-object v6, p0, Lwa;->N0:Landroid/graphics/Rect;

    .line 64
    .line 65
    iget-object v8, p0, Lwa;->O0:Landroid/graphics/Rect;

    .line 66
    .line 67
    invoke-virtual/range {p2 .. p2}, Lm83;->b()I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    invoke-virtual/range {p2 .. p2}, Lm83;->d()I

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    invoke-virtual/range {p2 .. p2}, Lm83;->c()I

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    invoke-virtual/range {p2 .. p2}, Lm83;->a()I

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    invoke-virtual {v6, v9, v10, v11, v12}, Landroid/graphics/Rect;->set(IIII)V

    .line 84
    .line 85
    .line 86
    iget-object v9, p0, Lwa;->l0:Landroid/view/ViewGroup;

    .line 87
    .line 88
    const-class v10, Landroid/graphics/Rect;

    .line 89
    .line 90
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 91
    .line 92
    const/16 v12, 0x1d

    .line 93
    .line 94
    if-lt v11, v12, :cond_1

    .line 95
    .line 96
    sget-boolean v10, Lm53;->a:Z

    .line 97
    .line 98
    invoke-static {v9, v6, v8}, Li53;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_1
    sget-boolean v11, Lm53;->a:Z

    .line 103
    .line 104
    if-nez v11, :cond_2

    .line 105
    .line 106
    sput-boolean v7, Lm53;->a:Z

    .line 107
    .line 108
    :try_start_0
    const-class v11, Landroid/view/View;

    .line 109
    .line 110
    const-string v12, "computeFitSystemWindows"

    .line 111
    .line 112
    const/4 v13, 0x2

    .line 113
    new-array v13, v13, [Ljava/lang/Class;

    .line 114
    .line 115
    aput-object v10, v13, v5

    .line 116
    .line 117
    aput-object v10, v13, v7

    .line 118
    .line 119
    invoke-virtual {v11, v12, v13}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    sput-object v10, Lm53;->b:Ljava/lang/reflect/Method;

    .line 124
    .line 125
    invoke-virtual {v10}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    if-nez v10, :cond_2

    .line 130
    .line 131
    sget-object v10, Lm53;->b:Ljava/lang/reflect/Method;

    .line 132
    .line 133
    invoke-virtual {v10, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    .line 135
    .line 136
    :catch_0
    :cond_2
    sget-object v10, Lm53;->b:Ljava/lang/reflect/Method;

    .line 137
    .line 138
    if-eqz v10, :cond_3

    .line 139
    .line 140
    :try_start_1
    filled-new-array {v6, v8}, [Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    invoke-virtual {v10, v9, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 145
    .line 146
    .line 147
    :catch_1
    :cond_3
    :goto_0
    iget v8, v6, Landroid/graphics/Rect;->top:I

    .line 148
    .line 149
    iget v9, v6, Landroid/graphics/Rect;->left:I

    .line 150
    .line 151
    iget v6, v6, Landroid/graphics/Rect;->right:I

    .line 152
    .line 153
    iget-object v10, p0, Lwa;->l0:Landroid/view/ViewGroup;

    .line 154
    .line 155
    sget-object v11, Le33;->a:Ljava/util/WeakHashMap;

    .line 156
    .line 157
    invoke-static {v10}, Lt23;->a(Landroid/view/View;)Lm83;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    if-nez v10, :cond_4

    .line 162
    .line 163
    move v11, v5

    .line 164
    goto :goto_1

    .line 165
    :cond_4
    invoke-virtual {v10}, Lm83;->b()I

    .line 166
    .line 167
    .line 168
    move-result v11

    .line 169
    :goto_1
    if-nez v10, :cond_5

    .line 170
    .line 171
    move v10, v5

    .line 172
    goto :goto_2

    .line 173
    :cond_5
    invoke-virtual {v10}, Lm83;->c()I

    .line 174
    .line 175
    .line 176
    move-result v10

    .line 177
    :goto_2
    iget v12, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 178
    .line 179
    if-ne v12, v8, :cond_7

    .line 180
    .line 181
    iget v12, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 182
    .line 183
    if-ne v12, v9, :cond_7

    .line 184
    .line 185
    iget v12, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 186
    .line 187
    if-eq v12, v6, :cond_6

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_6
    move v6, v5

    .line 191
    goto :goto_4

    .line 192
    :cond_7
    :goto_3
    iput v8, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 193
    .line 194
    iput v9, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 195
    .line 196
    iput v6, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 197
    .line 198
    move v6, v7

    .line 199
    :goto_4
    if-lez v8, :cond_8

    .line 200
    .line 201
    iget-object v8, p0, Lwa;->n0:Landroid/view/View;

    .line 202
    .line 203
    if-nez v8, :cond_8

    .line 204
    .line 205
    new-instance v8, Landroid/view/View;

    .line 206
    .line 207
    invoke-direct {v8, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 208
    .line 209
    .line 210
    iput-object v8, p0, Lwa;->n0:Landroid/view/View;

    .line 211
    .line 212
    invoke-virtual {v8, v4}, Landroid/view/View;->setVisibility(I)V

    .line 213
    .line 214
    .line 215
    new-instance v8, Landroid/widget/FrameLayout$LayoutParams;

    .line 216
    .line 217
    iget v9, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 218
    .line 219
    const/16 v12, 0x33

    .line 220
    .line 221
    const/4 v13, -0x1

    .line 222
    invoke-direct {v8, v13, v9, v12}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 223
    .line 224
    .line 225
    iput v11, v8, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 226
    .line 227
    iput v10, v8, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 228
    .line 229
    iget-object v9, p0, Lwa;->l0:Landroid/view/ViewGroup;

    .line 230
    .line 231
    iget-object v10, p0, Lwa;->n0:Landroid/view/View;

    .line 232
    .line 233
    invoke-virtual {v9, v10, v13, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 234
    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_8
    iget-object v8, p0, Lwa;->n0:Landroid/view/View;

    .line 238
    .line 239
    if-eqz v8, :cond_a

    .line 240
    .line 241
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    check-cast v8, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 246
    .line 247
    iget v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 248
    .line 249
    iget v12, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 250
    .line 251
    if-ne v9, v12, :cond_9

    .line 252
    .line 253
    iget v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 254
    .line 255
    if-ne v9, v11, :cond_9

    .line 256
    .line 257
    iget v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 258
    .line 259
    if-eq v9, v10, :cond_a

    .line 260
    .line 261
    :cond_9
    iput v12, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 262
    .line 263
    iput v11, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 264
    .line 265
    iput v10, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 266
    .line 267
    iget-object v9, p0, Lwa;->n0:Landroid/view/View;

    .line 268
    .line 269
    invoke-virtual {v9, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 270
    .line 271
    .line 272
    :cond_a
    :goto_5
    iget-object v8, p0, Lwa;->n0:Landroid/view/View;

    .line 273
    .line 274
    if-eqz v8, :cond_b

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_b
    move v7, v5

    .line 278
    :goto_6
    if-eqz v7, :cond_d

    .line 279
    .line 280
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    .line 281
    .line 282
    .line 283
    move-result v8

    .line 284
    if-eqz v8, :cond_d

    .line 285
    .line 286
    iget-object v8, p0, Lwa;->n0:Landroid/view/View;

    .line 287
    .line 288
    invoke-virtual {v8}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 289
    .line 290
    .line 291
    move-result v9

    .line 292
    and-int/lit16 v9, v9, 0x2000

    .line 293
    .line 294
    if-eqz v9, :cond_c

    .line 295
    .line 296
    sget v9, Landroidx/appcompat/R$color;->abc_decor_view_status_guard_light:I

    .line 297
    .line 298
    invoke-static {v1, v9}, Lv00;->getColor(Landroid/content/Context;I)I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    goto :goto_7

    .line 303
    :cond_c
    sget v9, Landroidx/appcompat/R$color;->abc_decor_view_status_guard:I

    .line 304
    .line 305
    invoke-static {v1, v9}, Lv00;->getColor(Landroid/content/Context;I)I

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    :goto_7
    invoke-virtual {v8, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 310
    .line 311
    .line 312
    :cond_d
    iget-boolean v1, p0, Lwa;->s0:Z

    .line 313
    .line 314
    if-nez v1, :cond_e

    .line 315
    .line 316
    if-eqz v7, :cond_e

    .line 317
    .line 318
    move v2, v5

    .line 319
    :cond_e
    move v1, v7

    .line 320
    move v7, v6

    .line 321
    goto :goto_8

    .line 322
    :cond_f
    iget v1, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 323
    .line 324
    if-eqz v1, :cond_10

    .line 325
    .line 326
    iput v5, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 327
    .line 328
    move v1, v5

    .line 329
    goto :goto_8

    .line 330
    :cond_10
    move v1, v5

    .line 331
    move v7, v1

    .line 332
    :goto_8
    if-eqz v7, :cond_12

    .line 333
    .line 334
    iget-object v6, p0, Lwa;->g0:Landroidx/appcompat/widget/ActionBarContextView;

    .line 335
    .line 336
    invoke-virtual {v6, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 337
    .line 338
    .line 339
    goto :goto_9

    .line 340
    :cond_11
    move v1, v5

    .line 341
    :cond_12
    :goto_9
    iget-object p0, p0, Lwa;->n0:Landroid/view/View;

    .line 342
    .line 343
    if-eqz p0, :cond_14

    .line 344
    .line 345
    if-eqz v1, :cond_13

    .line 346
    .line 347
    move v4, v5

    .line 348
    :cond_13
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 349
    .line 350
    .line 351
    :cond_14
    if-eq v0, v2, :cond_15

    .line 352
    .line 353
    invoke-virtual/range {p2 .. p2}, Lm83;->b()I

    .line 354
    .line 355
    .line 356
    move-result p0

    .line 357
    invoke-virtual/range {p2 .. p2}, Lm83;->c()I

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    invoke-virtual/range {p2 .. p2}, Lm83;->a()I

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    move-object/from16 v3, p2

    .line 366
    .line 367
    invoke-virtual {v3, p0, v2, v0, v1}, Lm83;->f(IIII)Lm83;

    .line 368
    .line 369
    .line 370
    move-result-object p0

    .line 371
    goto :goto_a

    .line 372
    :cond_15
    move-object/from16 v3, p2

    .line 373
    .line 374
    move-object p0, v3

    .line 375
    :goto_a
    invoke-static {p1, p0}, Le33;->h(Landroid/view/View;Lm83;)Lm83;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    return-object p0
.end method

.method public z(Ljg1;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljg1;->k()Ljg1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lka;->a:Lwa;

    .line 8
    .line 9
    iget-boolean v0, p0, Lwa;->q0:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lwa;->W:Landroid/view/Window;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-boolean p0, p0, Lwa;->B0:Z

    .line 22
    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    const/16 p0, 0x6c

    .line 26
    .line 27
    invoke-interface {v0, p0, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    const/4 p0, 0x1

    .line 31
    return p0
.end method

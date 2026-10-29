.class public abstract Lio/sentry/android/replay/viewhierarchy/b;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Lp51;

.field public static b:Z

.field public static c:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lv51;->b:Lv51;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/android/replay/viewhierarchy/a;->a:Lio/sentry/android/replay/viewhierarchy/a;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lr51;->a(Lv51;Lkotlin/jvm/functions/Function0;)Lp51;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lio/sentry/android/replay/viewhierarchy/b;->a:Lp51;

    .line 10
    .line 11
    return-void
.end method

.method public static a(Landroidx/compose/ui/node/LayoutNode;Lio/sentry/android/replay/viewhierarchy/h;ZLta;Lio/sentry/ILogger;)Lio/sentry/android/replay/viewhierarchy/h;
    .locals 13

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->isPlaced()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_17

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->isAttached()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_17

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->findRootCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-direct {v1, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sput-object v1, Lio/sentry/android/replay/viewhierarchy/b;->c:Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sget-object v3, Lio/sentry/android/replay/viewhierarchy/b;->c:Ljava/lang/ref/WeakReference;

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move-object v3, v2

    .line 49
    :goto_0
    invoke-static {v1, v3}, Lio/sentry/android/replay/util/f;->a(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const/4 v3, 0x0

    .line 54
    const/4 v5, 0x0

    .line 55
    const/4 v6, 0x1

    .line 56
    :try_start_0
    invoke-static {p0}, Lio/sentry/android/replay/viewhierarchy/b;->d(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 57
    .line 58
    .line 59
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    invoke-static {p0}, Lio/sentry/android/replay/viewhierarchy/c;->c(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-nez v8, :cond_3

    .line 65
    .line 66
    if-eqz v7, :cond_2

    .line 67
    .line 68
    sget-object v8, Landroidx/compose/ui/semantics/SemanticsProperties;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsProperties;

    .line 69
    .line 70
    invoke-virtual {v8}, Landroidx/compose/ui/semantics/SemanticsProperties;->getInvisibleToUser()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-virtual {v7, v8}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->contains(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    if-nez v8, :cond_3

    .line 79
    .line 80
    :cond_2
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    sub-float/2addr v8, v9

    .line 89
    cmpl-float v8, v8, v3

    .line 90
    .line 91
    if-lez v8, :cond_3

    .line 92
    .line 93
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    sub-float/2addr v8, v9

    .line 102
    cmpl-float v3, v8, v3

    .line 103
    .line 104
    if-lez v3, :cond_3

    .line 105
    .line 106
    move v10, v6

    .line 107
    goto :goto_1

    .line 108
    :cond_3
    move v10, v5

    .line 109
    :goto_1
    if-eqz v7, :cond_4

    .line 110
    .line 111
    sget-object v3, Landroidx/compose/ui/semantics/SemanticsActions;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsActions;

    .line 112
    .line 113
    invoke-virtual {v3}, Landroidx/compose/ui/semantics/SemanticsActions;->getSetText()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v7, v3}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->contains(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-ne v3, v6, :cond_4

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_4
    if-eqz v7, :cond_5

    .line 125
    .line 126
    sget-object v3, Landroidx/compose/ui/semantics/SemanticsProperties;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsProperties;

    .line 127
    .line 128
    invoke-virtual {v3}, Landroidx/compose/ui/semantics/SemanticsProperties;->getEditableText()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v7, v3}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->contains(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-ne v3, v6, :cond_5

    .line 137
    .line 138
    :goto_2
    move v3, v6

    .line 139
    goto :goto_3

    .line 140
    :cond_5
    move v3, v5

    .line 141
    :goto_3
    if-eqz v7, :cond_6

    .line 142
    .line 143
    sget-object v8, Landroidx/compose/ui/semantics/SemanticsProperties;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsProperties;

    .line 144
    .line 145
    invoke-virtual {v8}, Landroidx/compose/ui/semantics/SemanticsProperties;->getText()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    invoke-virtual {v7, v8}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->contains(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z

    .line 150
    .line 151
    .line 152
    move-result v8

    .line 153
    if-ne v8, v6, :cond_6

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_6
    if-eqz v3, :cond_f

    .line 157
    .line 158
    :goto_4
    if-eqz v10, :cond_7

    .line 159
    .line 160
    invoke-static {v7, v5, v0}, Lio/sentry/android/replay/viewhierarchy/b;->e(Landroidx/compose/ui/semantics/SemanticsConfiguration;ZLta;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_7

    .line 165
    .line 166
    move v9, v6

    .line 167
    goto :goto_5

    .line 168
    :cond_7
    move v9, v5

    .line 169
    :goto_5
    new-instance v0, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 172
    .line 173
    .line 174
    if-eqz v7, :cond_8

    .line 175
    .line 176
    sget-object v6, Landroidx/compose/ui/semantics/SemanticsActions;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsActions;

    .line 177
    .line 178
    invoke-virtual {v6}, Landroidx/compose/ui/semantics/SemanticsActions;->getGetTextLayoutResult()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    invoke-static {v7, v6}, Landroidx/compose/ui/semantics/SemanticsConfigurationKt;->getOrNull(Landroidx/compose/ui/semantics/SemanticsConfiguration;Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    check-cast v6, Landroidx/compose/ui/semantics/AccessibilityAction;

    .line 187
    .line 188
    if-eqz v6, :cond_8

    .line 189
    .line 190
    invoke-virtual {v6}, Landroidx/compose/ui/semantics/AccessibilityAction;->getAction()Lkotlin/Function;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 195
    .line 196
    if-eqz v6, :cond_8

    .line 197
    .line 198
    invoke-interface {v6, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    check-cast v6, Ljava/lang/Boolean;

    .line 203
    .line 204
    :cond_8
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    check-cast v0, Landroidx/compose/ui/text/TextLayoutResult;

    .line 209
    .line 210
    if-eqz v0, :cond_9

    .line 211
    .line 212
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    if-eqz v6, :cond_9

    .line 217
    .line 218
    invoke-virtual {v6}, Landroidx/compose/ui/text/TextLayoutInput;->getStyle()Landroidx/compose/ui/text/TextStyle;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    if-eqz v6, :cond_9

    .line 223
    .line 224
    invoke-virtual {v6}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    .line 225
    .line 226
    .line 227
    move-result-wide v6

    .line 228
    invoke-static {v6, v7}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    goto :goto_6

    .line 233
    :cond_9
    move-object v6, v2

    .line 234
    :goto_6
    if-eqz v6, :cond_a

    .line 235
    .line 236
    invoke-virtual {v6}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 237
    .line 238
    .line 239
    move-result-wide v7

    .line 240
    const-wide/16 v11, 0x10

    .line 241
    .line 242
    cmp-long v7, v7, v11

    .line 243
    .line 244
    if-nez v7, :cond_a

    .line 245
    .line 246
    invoke-static {p0}, Lio/sentry/android/replay/util/f;->c(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/graphics/Color;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    :cond_a
    if-eqz v0, :cond_b

    .line 251
    .line 252
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    if-eqz v7, :cond_b

    .line 257
    .line 258
    invoke-virtual {v7}, Landroidx/compose/ui/text/TextLayoutInput;->getStyle()Landroidx/compose/ui/text/TextStyle;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    if-eqz v7, :cond_b

    .line 263
    .line 264
    invoke-virtual {v7}, Landroidx/compose/ui/text/TextStyle;->getFontSize-XSAIIZE()J

    .line 265
    .line 266
    .line 267
    move-result-wide v7

    .line 268
    invoke-static {v7, v8}, Landroidx/compose/ui/unit/TextUnit;->box-impl(J)Landroidx/compose/ui/unit/TextUnit;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    goto :goto_7

    .line 273
    :cond_b
    move-object v7, v2

    .line 274
    :goto_7
    sget-object v8, Landroidx/compose/ui/unit/TextUnit;->Companion:Landroidx/compose/ui/unit/TextUnit$Companion;

    .line 275
    .line 276
    invoke-virtual {v8}, Landroidx/compose/ui/unit/TextUnit$Companion;->getUnspecified-XSAIIZE()J

    .line 277
    .line 278
    .line 279
    move-result-wide v11

    .line 280
    if-nez v7, :cond_c

    .line 281
    .line 282
    goto :goto_8

    .line 283
    :cond_c
    invoke-virtual {v7}, Landroidx/compose/ui/unit/TextUnit;->unbox-impl()J

    .line 284
    .line 285
    .line 286
    move-result-wide v7

    .line 287
    invoke-static {v7, v8, v11, v12}, Landroidx/compose/ui/unit/TextUnit;->equals-impl0(JJ)Z

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    :goto_8
    new-instance v7, Lio/sentry/android/replay/viewhierarchy/g;

    .line 292
    .line 293
    if-eqz v0, :cond_d

    .line 294
    .line 295
    if-nez v3, :cond_d

    .line 296
    .line 297
    if-nez v5, :cond_d

    .line 298
    .line 299
    new-instance v3, Lio/sentry/android/replay/util/a;

    .line 300
    .line 301
    invoke-direct {v3, v0}, Lio/sentry/android/replay/util/a;-><init>(Landroidx/compose/ui/text/TextLayoutResult;)V

    .line 302
    .line 303
    .line 304
    goto :goto_9

    .line 305
    :cond_d
    move-object v3, v2

    .line 306
    :goto_9
    if-eqz v6, :cond_e

    .line 307
    .line 308
    invoke-virtual {v6}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 309
    .line 310
    .line 311
    move-result-wide v5

    .line 312
    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/ColorKt;->toArgb-8_81llA(J)I

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    const/high16 v2, -0x1000000

    .line 317
    .line 318
    or-int/2addr v0, v2

    .line 319
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    :cond_e
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 324
    .line 325
    .line 326
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    .line 327
    .line 328
    .line 329
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getWidth()I

    .line 330
    .line 331
    .line 332
    move-result v5

    .line 333
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getHeight()I

    .line 334
    .line 335
    .line 336
    move-result v6

    .line 337
    move-object v0, v7

    .line 338
    iget v7, p1, Lio/sentry/android/replay/viewhierarchy/h;->c:F

    .line 339
    .line 340
    invoke-static {v1}, Lio/sentry/android/replay/util/f;->d(Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/Rect;

    .line 341
    .line 342
    .line 343
    move-result-object v11

    .line 344
    move-object v1, v3

    .line 345
    const/4 v3, 0x0

    .line 346
    const/4 v4, 0x0

    .line 347
    move-object v8, p1

    .line 348
    invoke-direct/range {v0 .. v11}, Lio/sentry/android/replay/viewhierarchy/g;-><init>(Lio/sentry/android/replay/util/l;Ljava/lang/Integer;IIIIFLio/sentry/android/replay/viewhierarchy/h;ZZLandroid/graphics/Rect;)V

    .line 349
    .line 350
    .line 351
    return-object v0

    .line 352
    :cond_f
    invoke-static {p0}, Lio/sentry/android/replay/util/f;->b(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/graphics/painter/Painter;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    if-eqz v2, :cond_12

    .line 357
    .line 358
    if-eqz v10, :cond_10

    .line 359
    .line 360
    invoke-static {v7, v6, v0}, Lio/sentry/android/replay/viewhierarchy/b;->e(Landroidx/compose/ui/semantics/SemanticsConfiguration;ZLta;)Z

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    if-eqz v0, :cond_10

    .line 365
    .line 366
    move v0, v6

    .line 367
    goto :goto_a

    .line 368
    :cond_10
    move v0, v5

    .line 369
    :goto_a
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 370
    .line 371
    .line 372
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    .line 373
    .line 374
    .line 375
    move-object v8, v1

    .line 376
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getWidth()I

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    move-object v3, v2

    .line 381
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getHeight()I

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    move-object v7, v3

    .line 386
    iget v3, p1, Lio/sentry/android/replay/viewhierarchy/h;->c:F

    .line 387
    .line 388
    if-eqz v0, :cond_11

    .line 389
    .line 390
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    const-string v7, "Vector"

    .line 399
    .line 400
    invoke-static {v0, v7, v5}, Lkotlin/text/StringsKt;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 401
    .line 402
    .line 403
    move-result v7

    .line 404
    if-nez v7, :cond_11

    .line 405
    .line 406
    const-string v7, "Color"

    .line 407
    .line 408
    invoke-static {v0, v7, v5}, Lkotlin/text/StringsKt;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 409
    .line 410
    .line 411
    move-result v7

    .line 412
    if-nez v7, :cond_11

    .line 413
    .line 414
    const-string v7, "Brush"

    .line 415
    .line 416
    invoke-static {v0, v7, v5}, Lkotlin/text/StringsKt;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    if-nez v0, :cond_11

    .line 421
    .line 422
    move v5, v6

    .line 423
    :cond_11
    invoke-static {v8}, Lio/sentry/android/replay/util/f;->d(Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/Rect;

    .line 424
    .line 425
    .line 426
    move-result-object v7

    .line 427
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/e;

    .line 428
    .line 429
    move-object v4, p1

    .line 430
    move v6, v10

    .line 431
    invoke-direct/range {v0 .. v7}, Lio/sentry/android/replay/viewhierarchy/h;-><init>(IIFLio/sentry/android/replay/viewhierarchy/h;ZZLandroid/graphics/Rect;)V

    .line 432
    .line 433
    .line 434
    return-object v0

    .line 435
    :cond_12
    move-object v8, v1

    .line 436
    if-eqz v10, :cond_13

    .line 437
    .line 438
    invoke-static {v7, v5, v0}, Lio/sentry/android/replay/viewhierarchy/b;->e(Landroidx/compose/ui/semantics/SemanticsConfiguration;ZLta;)Z

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    if-eqz v0, :cond_13

    .line 443
    .line 444
    move v5, v6

    .line 445
    :cond_13
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/d;

    .line 446
    .line 447
    invoke-virtual {v8}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 448
    .line 449
    .line 450
    invoke-virtual {v8}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    .line 451
    .line 452
    .line 453
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getWidth()I

    .line 454
    .line 455
    .line 456
    move-result v1

    .line 457
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getHeight()I

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    iget v3, p1, Lio/sentry/android/replay/viewhierarchy/h;->c:F

    .line 462
    .line 463
    invoke-static {v8}, Lio/sentry/android/replay/util/f;->d(Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/Rect;

    .line 464
    .line 465
    .line 466
    move-result-object v7

    .line 467
    move-object v4, p1

    .line 468
    move v6, v10

    .line 469
    invoke-direct/range {v0 .. v7}, Lio/sentry/android/replay/viewhierarchy/h;-><init>(IIFLio/sentry/android/replay/viewhierarchy/h;ZZLandroid/graphics/Rect;)V

    .line 470
    .line 471
    .line 472
    return-object v0

    .line 473
    :catchall_0
    move-exception v0

    .line 474
    move-object v8, v1

    .line 475
    sget-boolean v1, Lio/sentry/android/replay/viewhierarchy/b;->b:Z

    .line 476
    .line 477
    if-nez v1, :cond_14

    .line 478
    .line 479
    sput-boolean v6, Lio/sentry/android/replay/viewhierarchy/b;->b:Z

    .line 480
    .line 481
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 482
    .line 483
    const-string v2, "Error retrieving semantics information from Compose tree. Most likely you\'re using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.10.2.\nIf you\'re using a newer version, please open a github issue with the version\nyou\'re using, so we can add support for it."

    .line 484
    .line 485
    new-array v7, v5, [Ljava/lang/Object;

    .line 486
    .line 487
    move-object/from16 v9, p4

    .line 488
    .line 489
    invoke-interface {v9, v1, v0, v2, v7}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    :cond_14
    const-string v1, "io.sentry.replay.compose.fail-fast"

    .line 493
    .line 494
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    const-string v2, "true"

    .line 499
    .line 500
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 501
    .line 502
    .line 503
    move-result v1

    .line 504
    if-nez v1, :cond_16

    .line 505
    .line 506
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/d;

    .line 507
    .line 508
    invoke-virtual {v8}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 509
    .line 510
    .line 511
    invoke-virtual {v8}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    .line 512
    .line 513
    .line 514
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getWidth()I

    .line 515
    .line 516
    .line 517
    move-result v1

    .line 518
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getHeight()I

    .line 519
    .line 520
    .line 521
    move-result v2

    .line 522
    move v7, v3

    .line 523
    iget v3, p1, Lio/sentry/android/replay/viewhierarchy/h;->c:F

    .line 524
    .line 525
    invoke-static {p0}, Lio/sentry/android/replay/viewhierarchy/c;->c(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 526
    .line 527
    .line 528
    move-result v9

    .line 529
    if-nez v9, :cond_15

    .line 530
    .line 531
    invoke-virtual {v8}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    .line 532
    .line 533
    .line 534
    move-result v9

    .line 535
    invoke-virtual {v8}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    .line 536
    .line 537
    .line 538
    move-result v10

    .line 539
    sub-float/2addr v9, v10

    .line 540
    cmpl-float v9, v9, v7

    .line 541
    .line 542
    if-lez v9, :cond_15

    .line 543
    .line 544
    invoke-virtual {v8}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    .line 545
    .line 546
    .line 547
    move-result v9

    .line 548
    invoke-virtual {v8}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    .line 549
    .line 550
    .line 551
    move-result v10

    .line 552
    sub-float/2addr v9, v10

    .line 553
    cmpl-float v7, v9, v7

    .line 554
    .line 555
    if-lez v7, :cond_15

    .line 556
    .line 557
    goto :goto_b

    .line 558
    :cond_15
    move v6, v5

    .line 559
    :goto_b
    invoke-static {v8}, Lio/sentry/android/replay/util/f;->d(Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/Rect;

    .line 560
    .line 561
    .line 562
    move-result-object v7

    .line 563
    const/4 v5, 0x1

    .line 564
    move-object v4, p1

    .line 565
    invoke-direct/range {v0 .. v7}, Lio/sentry/android/replay/viewhierarchy/h;-><init>(IIFLio/sentry/android/replay/viewhierarchy/h;ZZLandroid/graphics/Rect;)V

    .line 566
    .line 567
    .line 568
    return-object v0

    .line 569
    :cond_16
    throw v0

    .line 570
    :cond_17
    return-object v2
.end method

.method public static b(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/h;Lta;Lio/sentry/ILogger;)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string p1, "AndroidComposeView"

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-static {p0, p1, p2}, Lkotlin/text/StringsKt;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 19
    .line 20
    .line 21
    return p2
.end method

.method public static c(ZLandroidx/compose/ui/semantics/SemanticsConfiguration;)Ljava/lang/String;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-string p0, "android.widget.ImageView"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    if-eqz p1, :cond_2

    .line 7
    .line 8
    sget-object p0, Landroidx/compose/ui/semantics/SemanticsProperties;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsProperties;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/compose/ui/semantics/SemanticsProperties;->getText()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p1, p0}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->contains(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    sget-object p0, Landroidx/compose/ui/semantics/SemanticsActions;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsActions;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/compose/ui/semantics/SemanticsActions;->getSetText()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p1, p0}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->contains(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    sget-object p0, Landroidx/compose/ui/semantics/SemanticsProperties;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsProperties;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/compose/ui/semantics/SemanticsProperties;->getEditableText()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p1, p0}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->contains(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    :cond_1
    const-string p0, "android.widget.TextView"

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_2
    const-string p0, "android.view.View"

    .line 48
    .line 49
    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/semantics/SemanticsConfiguration;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getSemanticsConfiguration()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    return-object p0

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    sget-object v1, Lio/sentry/android/replay/viewhierarchy/b;->a:Lp51;

    .line 11
    .line 12
    invoke-interface {v1}, Lp51;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Ljava/lang/reflect/Method;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Lp51;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/reflect/Method;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_0
    throw v0
.end method

.method public static e(Landroidx/compose/ui/semantics/SemanticsConfiguration;ZLta;)Z
    .locals 3

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object v0, Lio/sentry/android/replay/z;->a:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    .line 4
    .line 5
    invoke-static {p0, v0}, Landroidx/compose/ui/semantics/SemanticsConfigurationKt;->getOrNull(Landroidx/compose/ui/semantics/SemanticsConfiguration;Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    const-string v1, "unmask"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p2}, Lta;->r()V

    .line 23
    .line 24
    .line 25
    return v2

    .line 26
    :cond_1
    const-string v1, "mask"

    .line 27
    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p2}, Lta;->r()V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_2
    invoke-static {p1, p0}, Lio/sentry/android/replay/viewhierarchy/b;->c(ZLandroidx/compose/ui/semantics/SemanticsConfiguration;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iget-object p1, p2, Lta;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    return v2

    .line 54
    :cond_3
    iget-object p1, p2, Lta;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 57
    .line 58
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0
.end method

.method public static f(Landroidx/compose/ui/node/LayoutNode;Lio/sentry/android/replay/viewhierarchy/h;ZLta;Lio/sentry/ILogger;)V
    .locals 6

    .line 1
    invoke-static {p0}, Lio/sentry/android/replay/viewhierarchy/c;->a(Landroidx/compose/ui/node/LayoutNode;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    move v3, v2

    .line 27
    :goto_0
    if-ge v3, v1, :cond_2

    .line 28
    .line 29
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Landroidx/compose/ui/node/LayoutNode;

    .line 34
    .line 35
    invoke-static {v4, p1, p2, p3, p4}, Lio/sentry/android/replay/viewhierarchy/b;->a(Landroidx/compose/ui/node/LayoutNode;Lio/sentry/android/replay/viewhierarchy/h;ZLta;Lio/sentry/ILogger;)Lio/sentry/android/replay/viewhierarchy/h;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    if-eqz v5, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    invoke-static {v4, v5, v2, p3, p4}, Lio/sentry/android/replay/viewhierarchy/b;->f(Landroidx/compose/ui/node/LayoutNode;Lio/sentry/android/replay/viewhierarchy/h;ZLta;Lio/sentry/ILogger;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    iput-object v0, p1, Lio/sentry/android/replay/viewhierarchy/h;->g:Ljava/util/ArrayList;

    .line 51
    .line 52
    return-void
.end method

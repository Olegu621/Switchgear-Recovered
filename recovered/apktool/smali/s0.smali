.class public final Ls0;
.super Landroid/view/View$AccessibilityDelegate;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lt0;


# direct methods
.method public constructor <init>(Lt0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls0;->a:Lt0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ls0;->a:Lt0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lt0;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 0

    .line 1
    iget-object p0, p0, Ls0;->a:Lt0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lt0;->b(Landroid/view/View;)Lqc3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Landroid/view/accessibility/AccessibilityNodeProvider;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls0;->a:Lt0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lt0;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 13

    .line 1
    new-instance v0, Lf1;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lf1;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Le33;->a:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    sget v1, Landroidx/core/R$id;->tag_screen_reader_focusable:I

    .line 9
    .line 10
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const/16 v4, 0x1c

    .line 14
    .line 15
    const-class v5, Ljava/lang/Boolean;

    .line 16
    .line 17
    if-lt v2, v4, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, Lx23;->d(Landroid/view/View;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v5, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v1, v3

    .line 40
    :goto_0
    check-cast v1, Ljava/lang/Boolean;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    const/4 v6, 0x1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    move v1, v6

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move v1, v2

    .line 55
    :goto_1
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 56
    .line 57
    if-lt v7, v4, :cond_3

    .line 58
    .line 59
    invoke-static {p2, v1}, Lq0;->z(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    invoke-virtual {v0, v6, v1}, Lf1;->h(IZ)V

    .line 64
    .line 65
    .line 66
    :goto_2
    sget v1, Landroidx/core/R$id;->tag_accessibility_heading:I

    .line 67
    .line 68
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 69
    .line 70
    if-lt v8, v4, :cond_4

    .line 71
    .line 72
    invoke-static {p1}, Lx23;->c(Landroid/view/View;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    goto :goto_3

    .line 81
    :cond_4
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v5, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_5

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_5
    move-object v1, v3

    .line 93
    :goto_3
    check-cast v1, Ljava/lang/Boolean;

    .line 94
    .line 95
    if-eqz v1, :cond_6

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_6

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_6
    move v6, v2

    .line 105
    :goto_4
    if-lt v7, v4, :cond_7

    .line 106
    .line 107
    invoke-static {p2, v6}, Lq0;->B(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 108
    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_7
    const/4 v1, 0x2

    .line 112
    invoke-virtual {v0, v1, v6}, Lf1;->h(IZ)V

    .line 113
    .line 114
    .line 115
    :goto_5
    sget v1, Landroidx/core/R$id;->tag_accessibility_pane_title:I

    .line 116
    .line 117
    const-class v5, Ljava/lang/CharSequence;

    .line 118
    .line 119
    if-lt v7, v4, :cond_8

    .line 120
    .line 121
    invoke-static {p1}, Lx23;->b(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    goto :goto_6

    .line 126
    :cond_8
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v5, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-eqz v6, :cond_9

    .line 135
    .line 136
    goto :goto_6

    .line 137
    :cond_9
    move-object v1, v3

    .line 138
    :goto_6
    check-cast v1, Ljava/lang/CharSequence;

    .line 139
    .line 140
    if-lt v7, v4, :cond_a

    .line 141
    .line 142
    invoke-static {p2, v1}, Lq0;->p(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 143
    .line 144
    .line 145
    goto :goto_7

    .line 146
    :cond_a
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    const-string v6, "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"

    .line 151
    .line 152
    invoke-virtual {v4, v6, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 153
    .line 154
    .line 155
    :goto_7
    sget v1, Landroidx/core/R$id;->tag_state_description:I

    .line 156
    .line 157
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 158
    .line 159
    const/16 v6, 0x1e

    .line 160
    .line 161
    if-lt v4, v6, :cond_b

    .line 162
    .line 163
    invoke-static {p1}, Lz23;->b(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    goto :goto_8

    .line 168
    :cond_b
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v5, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-eqz v4, :cond_c

    .line 177
    .line 178
    goto :goto_8

    .line 179
    :cond_c
    move-object v1, v3

    .line 180
    :goto_8
    check-cast v1, Ljava/lang/CharSequence;

    .line 181
    .line 182
    if-lt v7, v6, :cond_d

    .line 183
    .line 184
    invoke-static {p2, v1}, La1;->c(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 185
    .line 186
    .line 187
    goto :goto_9

    .line 188
    :cond_d
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    const-string v5, "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"

    .line 193
    .line 194
    invoke-virtual {v4, v5, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 195
    .line 196
    .line 197
    :goto_9
    iget-object p0, p0, Ls0;->a:Lt0;

    .line 198
    .line 199
    invoke-virtual {p0, p1, v0}, Lt0;->d(Landroid/view/View;Lf1;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    const/16 v1, 0x1a

    .line 207
    .line 208
    if-ge v7, v1, :cond_15

    .line 209
    .line 210
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    const-string v4, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"

    .line 215
    .line 216
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    const-string v5, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"

    .line 224
    .line 225
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    const-string v6, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"

    .line 233
    .line 234
    invoke-virtual {v1, v6}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    const-string v7, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"

    .line 242
    .line 243
    invoke-virtual {v1, v7}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    sget v1, Landroidx/core/R$id;->tag_accessibility_clickable_spans:I

    .line 247
    .line 248
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    check-cast v1, Landroid/util/SparseArray;

    .line 253
    .line 254
    if-eqz v1, :cond_10

    .line 255
    .line 256
    new-instance v8, Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 259
    .line 260
    .line 261
    move v9, v2

    .line 262
    :goto_a
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 263
    .line 264
    .line 265
    move-result v10

    .line 266
    if-ge v9, v10, :cond_f

    .line 267
    .line 268
    invoke-virtual {v1, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v10

    .line 272
    check-cast v10, Ljava/lang/ref/WeakReference;

    .line 273
    .line 274
    invoke-virtual {v10}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v10

    .line 278
    if-nez v10, :cond_e

    .line 279
    .line 280
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 281
    .line 282
    .line 283
    move-result-object v10

    .line 284
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    :cond_e
    add-int/lit8 v9, v9, 0x1

    .line 288
    .line 289
    goto :goto_a

    .line 290
    :cond_f
    move v9, v2

    .line 291
    :goto_b
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    if-ge v9, v10, :cond_10

    .line 296
    .line 297
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v10

    .line 301
    check-cast v10, Ljava/lang/Integer;

    .line 302
    .line 303
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 304
    .line 305
    .line 306
    move-result v10

    .line 307
    invoke-virtual {v1, v10}, Landroid/util/SparseArray;->remove(I)V

    .line 308
    .line 309
    .line 310
    add-int/lit8 v9, v9, 0x1

    .line 311
    .line 312
    goto :goto_b

    .line 313
    :cond_10
    instance-of v1, p0, Landroid/text/Spanned;

    .line 314
    .line 315
    if-eqz v1, :cond_11

    .line 316
    .line 317
    move-object v1, p0

    .line 318
    check-cast v1, Landroid/text/Spanned;

    .line 319
    .line 320
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    const-class v8, Landroid/text/style/ClickableSpan;

    .line 325
    .line 326
    invoke-interface {v1, v2, v3, v8}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    move-object v3, v1

    .line 331
    check-cast v3, [Landroid/text/style/ClickableSpan;

    .line 332
    .line 333
    :cond_11
    if-eqz v3, :cond_15

    .line 334
    .line 335
    array-length v1, v3

    .line 336
    if-lez v1, :cond_15

    .line 337
    .line 338
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 339
    .line 340
    .line 341
    move-result-object p2

    .line 342
    const-string v1, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"

    .line 343
    .line 344
    sget v8, Landroidx/core/R$id;->accessibility_action_clickable_span:I

    .line 345
    .line 346
    invoke-virtual {p2, v1, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 347
    .line 348
    .line 349
    sget p2, Landroidx/core/R$id;->tag_accessibility_clickable_spans:I

    .line 350
    .line 351
    invoke-virtual {p1, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object p2

    .line 355
    check-cast p2, Landroid/util/SparseArray;

    .line 356
    .line 357
    if-nez p2, :cond_12

    .line 358
    .line 359
    new-instance p2, Landroid/util/SparseArray;

    .line 360
    .line 361
    invoke-direct {p2}, Landroid/util/SparseArray;-><init>()V

    .line 362
    .line 363
    .line 364
    sget v1, Landroidx/core/R$id;->tag_accessibility_clickable_spans:I

    .line 365
    .line 366
    invoke-virtual {p1, v1, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    :cond_12
    move v1, v2

    .line 370
    :goto_c
    array-length v8, v3

    .line 371
    if-ge v1, v8, :cond_15

    .line 372
    .line 373
    aget-object v8, v3, v1

    .line 374
    .line 375
    move v9, v2

    .line 376
    :goto_d
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 377
    .line 378
    .line 379
    move-result v10

    .line 380
    if-ge v9, v10, :cond_14

    .line 381
    .line 382
    invoke-virtual {p2, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v10

    .line 386
    check-cast v10, Ljava/lang/ref/WeakReference;

    .line 387
    .line 388
    invoke-virtual {v10}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v10

    .line 392
    check-cast v10, Landroid/text/style/ClickableSpan;

    .line 393
    .line 394
    invoke-virtual {v8, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v10

    .line 398
    if-eqz v10, :cond_13

    .line 399
    .line 400
    invoke-virtual {p2, v9}, Landroid/util/SparseArray;->keyAt(I)I

    .line 401
    .line 402
    .line 403
    move-result v8

    .line 404
    goto :goto_e

    .line 405
    :cond_13
    add-int/lit8 v9, v9, 0x1

    .line 406
    .line 407
    goto :goto_d

    .line 408
    :cond_14
    sget v8, Lf1;->c:I

    .line 409
    .line 410
    add-int/lit8 v9, v8, 0x1

    .line 411
    .line 412
    sput v9, Lf1;->c:I

    .line 413
    .line 414
    :goto_e
    new-instance v9, Ljava/lang/ref/WeakReference;

    .line 415
    .line 416
    aget-object v10, v3, v1

    .line 417
    .line 418
    invoke-direct {v9, v10}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {p2, v8, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    aget-object v9, v3, v1

    .line 425
    .line 426
    move-object v10, p0

    .line 427
    check-cast v10, Landroid/text/Spanned;

    .line 428
    .line 429
    invoke-virtual {v0, v4}, Lf1;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 430
    .line 431
    .line 432
    move-result-object v11

    .line 433
    invoke-interface {v10, v9}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 434
    .line 435
    .line 436
    move-result v12

    .line 437
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 438
    .line 439
    .line 440
    move-result-object v12

    .line 441
    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0, v5}, Lf1;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 445
    .line 446
    .line 447
    move-result-object v11

    .line 448
    invoke-interface {v10, v9}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 449
    .line 450
    .line 451
    move-result v12

    .line 452
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 453
    .line 454
    .line 455
    move-result-object v12

    .line 456
    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    invoke-virtual {v0, v6}, Lf1;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 460
    .line 461
    .line 462
    move-result-object v11

    .line 463
    invoke-interface {v10, v9}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    .line 464
    .line 465
    .line 466
    move-result v9

    .line 467
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 468
    .line 469
    .line 470
    move-result-object v9

    .line 471
    invoke-interface {v11, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    invoke-virtual {v0, v7}, Lf1;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 475
    .line 476
    .line 477
    move-result-object v9

    .line 478
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 479
    .line 480
    .line 481
    move-result-object v8

    .line 482
    invoke-interface {v9, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    add-int/lit8 v1, v1, 0x1

    .line 486
    .line 487
    goto :goto_c

    .line 488
    :cond_15
    sget p0, Landroidx/core/R$id;->tag_accessibility_actions:I

    .line 489
    .line 490
    invoke-virtual {p1, p0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object p0

    .line 494
    check-cast p0, Ljava/util/List;

    .line 495
    .line 496
    if-nez p0, :cond_16

    .line 497
    .line 498
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 499
    .line 500
    :cond_16
    :goto_f
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 501
    .line 502
    .line 503
    move-result p1

    .line 504
    if-ge v2, p1, :cond_17

    .line 505
    .line 506
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object p1

    .line 510
    check-cast p1, Lz0;

    .line 511
    .line 512
    invoke-virtual {v0, p1}, Lf1;->b(Lz0;)V

    .line 513
    .line 514
    .line 515
    add-int/lit8 v2, v2, 0x1

    .line 516
    .line 517
    goto :goto_f

    .line 518
    :cond_17
    return-void
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls0;->a:Lt0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lt0;->e(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ls0;->a:Lt0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lt0;->f(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ls0;->a:Lt0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lt0;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls0;->a:Lt0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lt0;->h(Landroid/view/View;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls0;->a:Lt0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lt0;->i(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

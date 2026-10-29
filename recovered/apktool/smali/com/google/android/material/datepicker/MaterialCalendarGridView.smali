.class final Lcom/google/android/material/datepicker/MaterialCalendarGridView;
.super Landroid/widget/GridView;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/util/Calendar;

.field public final b:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 56
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/GridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-static {p1}, Lh13;->f(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->a:Ljava/util/Calendar;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const p2, 0x101020d

    .line 16
    .line 17
    .line 18
    invoke-static {p1, p2}, Lcom/google/android/material/datepicker/m;->k(Landroid/content/Context;I)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    sget p1, Lcom/google/android/material/R$id;->cancel_button:I

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Landroid/view/View;->setNextFocusLeftId(I)V

    .line 27
    .line 28
    .line 29
    sget p1, Lcom/google/android/material/R$id;->confirm_button:I

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/view/View;->setNextFocusRightId(I)V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget p2, Lcom/google/android/material/R$attr;->nestedScrollable:I

    .line 39
    .line 40
    invoke-static {p1, p2}, Lcom/google/android/material/datepicker/m;->k(Landroid/content/Context;I)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    iput-boolean p1, p0, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b:Z

    .line 45
    .line 46
    new-instance p1, Laa0;

    .line 47
    .line 48
    const/4 p2, 0x2

    .line 49
    invoke-direct {p1, p2}, Laa0;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, p1}, Le33;->n(Landroid/view/View;Lt0;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/material/datepicker/o;
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/google/android/material/datepicker/o;

    .line 6
    .line 7
    return-object p0
.end method

.method public final b(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int/2addr p1, v0

    .line 6
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final getAdapter()Landroid/widget/Adapter;
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/google/android/material/datepicker/o;

    .line 6
    .line 7
    return-object p0
.end method

.method public final getAdapter()Landroid/widget/ListAdapter;
    .locals 0

    .line 8
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/datepicker/o;

    return-object p0
.end method

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lcom/google/android/material/datepicker/o;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    invoke-super {v0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcom/google/android/material/datepicker/o;

    .line 11
    .line 12
    iget-object v2, v1, Lcom/google/android/material/datepicker/o;->b:Lcom/google/android/material/datepicker/DateSelector;

    .line 13
    .line 14
    iget-object v3, v1, Lcom/google/android/material/datepicker/o;->d:Lnm;

    .line 15
    .line 16
    iget-object v4, v1, Lcom/google/android/material/datepicker/o;->a:Lcom/google/android/material/datepicker/Month;

    .line 17
    .line 18
    invoke-virtual {v4}, Lcom/google/android/material/datepicker/Month;->e()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    iget v6, v4, Lcom/google/android/material/datepicker/Month;->d:I

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-virtual {v1}, Lcom/google/android/material/datepicker/o;->b()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    invoke-virtual {v1, v5}, Lcom/google/android/material/datepicker/o;->a(I)Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    invoke-virtual {v1, v7}, Lcom/google/android/material/datepicker/o;->a(I)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    invoke-interface {v2}, Lcom/google/android/material/datepicker/DateSelector;->s()Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    if-eqz v10, :cond_10

    .line 65
    .line 66
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    check-cast v10, Lhr1;

    .line 71
    .line 72
    iget-object v11, v10, Lhr1;->a:Ljava/lang/Object;

    .line 73
    .line 74
    if-eqz v11, :cond_f

    .line 75
    .line 76
    iget-object v12, v10, Lhr1;->b:Ljava/lang/Object;

    .line 77
    .line 78
    if-nez v12, :cond_0

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    check-cast v11, Ljava/lang/Long;

    .line 82
    .line 83
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 84
    .line 85
    .line 86
    move-result-wide v12

    .line 87
    iget-object v10, v10, Lhr1;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v10, Ljava/lang/Long;

    .line 90
    .line 91
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 92
    .line 93
    .line 94
    move-result-wide v14

    .line 95
    if-eqz v8, :cond_1

    .line 96
    .line 97
    if-eqz v9, :cond_1

    .line 98
    .line 99
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v16

    .line 103
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 104
    .line 105
    .line 106
    move-result-wide v18

    .line 107
    cmp-long v11, v16, v18

    .line 108
    .line 109
    if-gtz v11, :cond_1

    .line 110
    .line 111
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 112
    .line 113
    .line 114
    move-result-wide v10

    .line 115
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 116
    .line 117
    .line 118
    move-result-wide v16

    .line 119
    cmp-long v10, v10, v16

    .line 120
    .line 121
    if-gez v10, :cond_2

    .line 122
    .line 123
    :cond_1
    move-object/from16 v20, v1

    .line 124
    .line 125
    move-object/from16 v16, v2

    .line 126
    .line 127
    move-object v15, v4

    .line 128
    move/from16 v18, v5

    .line 129
    .line 130
    goto/16 :goto_a

    .line 131
    .line 132
    :cond_2
    invoke-static {v0}, Lkb1;->J(Landroid/view/View;)Z

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 137
    .line 138
    .line 139
    move-result-wide v16

    .line 140
    cmp-long v11, v12, v16

    .line 141
    .line 142
    move-object/from16 v16, v2

    .line 143
    .line 144
    const/16 v17, 0x0

    .line 145
    .line 146
    iget-object v2, v0, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->a:Ljava/util/Calendar;

    .line 147
    .line 148
    if-gez v11, :cond_5

    .line 149
    .line 150
    rem-int v11, v5, v6

    .line 151
    .line 152
    if-nez v11, :cond_3

    .line 153
    .line 154
    move/from16 v11, v17

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_3
    if-nez v10, :cond_4

    .line 158
    .line 159
    add-int/lit8 v11, v5, -0x1

    .line 160
    .line 161
    invoke-virtual {v0, v11}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    invoke-virtual {v11}, Landroid/view/View;->getRight()I

    .line 166
    .line 167
    .line 168
    move-result v11

    .line 169
    goto :goto_1

    .line 170
    :cond_4
    add-int/lit8 v11, v5, -0x1

    .line 171
    .line 172
    invoke-virtual {v0, v11}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    invoke-virtual {v11}, Landroid/view/View;->getLeft()I

    .line 177
    .line 178
    .line 179
    move-result v11

    .line 180
    :goto_1
    move v12, v11

    .line 181
    move v11, v5

    .line 182
    goto :goto_2

    .line 183
    :cond_5
    invoke-virtual {v2, v12, v13}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 184
    .line 185
    .line 186
    const/4 v11, 0x5

    .line 187
    invoke-virtual {v2, v11}, Ljava/util/Calendar;->get(I)I

    .line 188
    .line 189
    .line 190
    move-result v12

    .line 191
    add-int/lit8 v12, v12, -0x1

    .line 192
    .line 193
    invoke-virtual {v4}, Lcom/google/android/material/datepicker/Month;->e()I

    .line 194
    .line 195
    .line 196
    move-result v11

    .line 197
    add-int/2addr v11, v12

    .line 198
    invoke-virtual {v0, v11}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 199
    .line 200
    .line 201
    move-result-object v12

    .line 202
    invoke-virtual {v12}, Landroid/view/View;->getLeft()I

    .line 203
    .line 204
    .line 205
    move-result v13

    .line 206
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    .line 207
    .line 208
    .line 209
    move-result v12

    .line 210
    div-int/lit8 v12, v12, 0x2

    .line 211
    .line 212
    add-int/2addr v12, v13

    .line 213
    :goto_2
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 214
    .line 215
    .line 216
    move-result-wide v19

    .line 217
    cmp-long v13, v14, v19

    .line 218
    .line 219
    if-lez v13, :cond_8

    .line 220
    .line 221
    add-int/lit8 v2, v7, 0x1

    .line 222
    .line 223
    rem-int/2addr v2, v6

    .line 224
    if-nez v2, :cond_6

    .line 225
    .line 226
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    goto :goto_3

    .line 231
    :cond_6
    if-nez v10, :cond_7

    .line 232
    .line 233
    invoke-virtual {v0, v7}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    goto :goto_3

    .line 242
    :cond_7
    invoke-virtual {v0, v7}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    :goto_3
    move v13, v7

    .line 251
    goto :goto_4

    .line 252
    :cond_8
    invoke-virtual {v2, v14, v15}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 253
    .line 254
    .line 255
    const/4 v13, 0x5

    .line 256
    invoke-virtual {v2, v13}, Ljava/util/Calendar;->get(I)I

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    add-int/lit8 v2, v2, -0x1

    .line 261
    .line 262
    invoke-virtual {v4}, Lcom/google/android/material/datepicker/Month;->e()I

    .line 263
    .line 264
    .line 265
    move-result v13

    .line 266
    add-int/2addr v13, v2

    .line 267
    invoke-virtual {v0, v13}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 272
    .line 273
    .line 274
    move-result v14

    .line 275
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    div-int/lit8 v2, v2, 0x2

    .line 280
    .line 281
    add-int/2addr v2, v14

    .line 282
    :goto_4
    invoke-virtual {v1, v11}, Lcom/google/android/material/datepicker/o;->getItemId(I)J

    .line 283
    .line 284
    .line 285
    move-result-wide v14

    .line 286
    long-to-int v14, v14

    .line 287
    move-object v15, v4

    .line 288
    move/from16 v18, v5

    .line 289
    .line 290
    invoke-virtual {v1, v13}, Lcom/google/android/material/datepicker/o;->getItemId(I)J

    .line 291
    .line 292
    .line 293
    move-result-wide v4

    .line 294
    long-to-int v4, v4

    .line 295
    :goto_5
    if-gt v14, v4, :cond_e

    .line 296
    .line 297
    invoke-virtual {v0}, Landroid/widget/GridView;->getNumColumns()I

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    mul-int/2addr v5, v14

    .line 302
    invoke-virtual {v0}, Landroid/widget/GridView;->getNumColumns()I

    .line 303
    .line 304
    .line 305
    move-result v19

    .line 306
    add-int v19, v19, v5

    .line 307
    .line 308
    move-object/from16 v20, v1

    .line 309
    .line 310
    add-int/lit8 v1, v19, -0x1

    .line 311
    .line 312
    invoke-virtual {v0, v5}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b(I)Landroid/view/View;

    .line 313
    .line 314
    .line 315
    move-result-object v19

    .line 316
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getTop()I

    .line 317
    .line 318
    .line 319
    move-result v21

    .line 320
    iget-object v0, v3, Lnm;->a:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v0, Lq3;

    .line 323
    .line 324
    iget-object v0, v0, Lq3;->b:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v0, Landroid/graphics/Rect;

    .line 327
    .line 328
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 329
    .line 330
    add-int v0, v21, v0

    .line 331
    .line 332
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getBottom()I

    .line 333
    .line 334
    .line 335
    move-result v19

    .line 336
    move/from16 v21, v2

    .line 337
    .line 338
    iget-object v2, v3, Lnm;->a:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v2, Lq3;

    .line 341
    .line 342
    iget-object v2, v2, Lq3;->b:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v2, Landroid/graphics/Rect;

    .line 345
    .line 346
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 347
    .line 348
    sub-int v2, v19, v2

    .line 349
    .line 350
    if-nez v10, :cond_b

    .line 351
    .line 352
    if-le v5, v11, :cond_9

    .line 353
    .line 354
    move/from16 v5, v17

    .line 355
    .line 356
    goto :goto_6

    .line 357
    :cond_9
    move v5, v12

    .line 358
    :goto_6
    if-le v13, v1, :cond_a

    .line 359
    .line 360
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    goto :goto_9

    .line 365
    :cond_a
    move/from16 v1, v21

    .line 366
    .line 367
    goto :goto_9

    .line 368
    :cond_b
    if-le v13, v1, :cond_c

    .line 369
    .line 370
    move/from16 v1, v17

    .line 371
    .line 372
    goto :goto_7

    .line 373
    :cond_c
    move/from16 v1, v21

    .line 374
    .line 375
    :goto_7
    if-le v5, v11, :cond_d

    .line 376
    .line 377
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 378
    .line 379
    .line 380
    move-result v5

    .line 381
    goto :goto_8

    .line 382
    :cond_d
    move v5, v12

    .line 383
    :goto_8
    move/from16 v28, v5

    .line 384
    .line 385
    move v5, v1

    .line 386
    move/from16 v1, v28

    .line 387
    .line 388
    :goto_9
    int-to-float v5, v5

    .line 389
    int-to-float v0, v0

    .line 390
    int-to-float v1, v1

    .line 391
    int-to-float v2, v2

    .line 392
    move/from16 v24, v0

    .line 393
    .line 394
    iget-object v0, v3, Lnm;->h:Ljava/lang/Object;

    .line 395
    .line 396
    move-object/from16 v27, v0

    .line 397
    .line 398
    check-cast v27, Landroid/graphics/Paint;

    .line 399
    .line 400
    move-object/from16 v22, p1

    .line 401
    .line 402
    move/from16 v25, v1

    .line 403
    .line 404
    move/from16 v26, v2

    .line 405
    .line 406
    move/from16 v23, v5

    .line 407
    .line 408
    invoke-virtual/range {v22 .. v27}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 409
    .line 410
    .line 411
    add-int/lit8 v14, v14, 0x1

    .line 412
    .line 413
    move-object/from16 v0, p0

    .line 414
    .line 415
    move-object/from16 v1, v20

    .line 416
    .line 417
    move/from16 v2, v21

    .line 418
    .line 419
    goto :goto_5

    .line 420
    :cond_e
    move-object/from16 v0, p0

    .line 421
    .line 422
    move-object v4, v15

    .line 423
    move-object/from16 v2, v16

    .line 424
    .line 425
    move/from16 v5, v18

    .line 426
    .line 427
    goto/16 :goto_0

    .line 428
    .line 429
    :goto_a
    move-object/from16 v0, p0

    .line 430
    .line 431
    move-object v4, v15

    .line 432
    move-object/from16 v2, v16

    .line 433
    .line 434
    move/from16 v5, v18

    .line 435
    .line 436
    move-object/from16 v1, v20

    .line 437
    .line 438
    goto/16 :goto_0

    .line 439
    .line 440
    :cond_f
    move-object/from16 v0, p0

    .line 441
    .line 442
    goto/16 :goto_0

    .line 443
    .line 444
    :cond_10
    return-void
.end method

.method public final onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const/16 p1, 0x21

    .line 4
    .line 5
    if-ne p2, p1, :cond_0

    .line 6
    .line 7
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/google/android/material/datepicker/o;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/o;->b()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setSelection(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const/16 p1, 0x82

    .line 22
    .line 23
    if-ne p2, p1, :cond_1

    .line 24
    .line 25
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lcom/google/android/material/datepicker/o;

    .line 30
    .line 31
    iget-object p1, p1, Lcom/google/android/material/datepicker/o;->a:Lcom/google/android/material/datepicker/Month;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/Month;->e()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setSelection(I)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    const/4 p1, 0x1

    .line 42
    invoke-super {p0, p1, p2, p3}, Landroid/widget/GridView;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    const/4 p1, 0x0

    .line 47
    invoke-super {p0, p1, p2, p3}, Landroid/widget/GridView;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/GridView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/4 v1, -0x1

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eq p2, v1, :cond_3

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcom/google/android/material/datepicker/o;

    .line 26
    .line 27
    iget-object v1, v1, Lcom/google/android/material/datepicker/o;->a:Lcom/google/android/material/datepicker/Month;

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/google/android/material/datepicker/Month;->e()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-lt p2, v1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/16 p2, 0x13

    .line 37
    .line 38
    if-ne p2, p1, :cond_2

    .line 39
    .line 40
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lcom/google/android/material/datepicker/o;

    .line 45
    .line 46
    iget-object p1, p1, Lcom/google/android/material/datepicker/o;->a:Lcom/google/android/material/datepicker/Month;

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/Month;->e()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setSelection(I)V

    .line 53
    .line 54
    .line 55
    return v2

    .line 56
    :cond_2
    return v0

    .line 57
    :cond_3
    :goto_0
    return v2
.end method

.method public final onMeasure(II)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const p2, 0xffffff

    .line 6
    .line 7
    .line 8
    const/high16 v0, -0x80000000

    .line 9
    .line 10
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-super {p0, p1, p2}, Landroid/widget/GridView;->onMeasure(II)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    iput p0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/GridView;->onMeasure(II)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 0

    .line 31
    check-cast p1, Landroid/widget/ListAdapter;

    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public final setAdapter(Landroid/widget/ListAdapter;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/google/android/material/datepicker/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-class p0, Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-class p1, Lcom/google/android/material/datepicker/o;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string p1, "%1$s must have its Adapter set to a %2$s"

    .line 26
    .line 27
    invoke-static {p1, p0}, Lio/sentry/u2;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final setSelection(I)V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/google/android/material/datepicker/o;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/google/android/material/datepicker/o;->a:Lcom/google/android/material/datepicker/Month;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/material/datepicker/Month;->e()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ge p1, v0, :cond_0

    .line 14
    .line 15
    invoke-super {p0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/google/android/material/datepicker/o;

    .line 20
    .line 21
    iget-object p1, p1, Lcom/google/android/material/datepicker/o;->a:Lcom/google/android/material/datepicker/Month;

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/Month;->e()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-super {p0, p1}, Landroid/widget/GridView;->setSelection(I)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/GridView;->setSelection(I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

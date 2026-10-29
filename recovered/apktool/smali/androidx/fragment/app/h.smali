.class public final Landroidx/fragment/app/h;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Landroid/view/ViewGroup;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/fragment/app/h;->a:Landroid/view/ViewGroup;

    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Landroidx/fragment/app/h;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Landroidx/fragment/app/h;->c:Ljava/util/ArrayList;

    .line 22
    .line 23
    return-void
.end method

.method public static f(Lid;Landroid/view/View;)V
    .locals 4

    .line 1
    sget-object v0, Le33;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ls23;->k(Landroid/view/View;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0, p1}, Lle2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    check-cast p1, Landroid/view/ViewGroup;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-ge v1, v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    invoke-static {p0, v2}, Landroidx/fragment/app/h;->f(Lid;Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return-void
.end method

.method public static final j(Landroid/view/ViewGroup;Landroidx/fragment/app/w;)Landroidx/fragment/app/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/fragment/app/w;->J()Lec0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget p1, Landroidx/fragment/R$id;->special_effects_controller_view_tag:I

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    instance-of v0, p1, Landroidx/fragment/app/h;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    check-cast p1, Landroidx/fragment/app/h;

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_0
    new-instance p1, Landroidx/fragment/app/h;

    .line 28
    .line 29
    invoke-direct {p1, p0}, Landroidx/fragment/app/h;-><init>(Landroid/view/ViewGroup;)V

    .line 30
    .line 31
    .line 32
    sget v0, Landroidx/fragment/R$id;->special_effects_controller_view_tag:I

    .line 33
    .line 34
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-object p1
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/c0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p1, Landroidx/fragment/app/c0;->i:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget v0, p1, Landroidx/fragment/app/c0;->a:I

    .line 9
    .line 10
    iget-object v1, p1, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Landroidx/fragment/app/h;->a:Landroid/view/ViewGroup;

    .line 20
    .line 21
    invoke-static {v0, v1, p0}, Lfm0;->a(ILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    iput-boolean p0, p1, Landroidx/fragment/app/c0;->i:Z

    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final b(Ljava/util/ArrayList;Z)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v14, p2

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const-string v3, "Unknown visibility "

    .line 14
    .line 15
    const/16 v4, 0x8

    .line 16
    .line 17
    const/4 v5, 0x4

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v15, 0x2

    .line 20
    if-eqz v2, :cond_4

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    move-object v8, v2

    .line 27
    check-cast v8, Landroidx/fragment/app/c0;

    .line 28
    .line 29
    iget-object v9, v8, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 30
    .line 31
    iget-object v9, v9, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 32
    .line 33
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v9}, Landroid/view/View;->getAlpha()F

    .line 37
    .line 38
    .line 39
    move-result v10

    .line 40
    cmpg-float v10, v10, v6

    .line 41
    .line 42
    if-nez v10, :cond_1

    .line 43
    .line 44
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    .line 45
    .line 46
    .line 47
    move-result v10

    .line 48
    if-nez v10, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    if-eqz v9, :cond_3

    .line 56
    .line 57
    if-eq v9, v5, :cond_0

    .line 58
    .line 59
    if-ne v9, v4, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-static {v9, v3}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Ln4;->j(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_3
    iget v8, v8, Landroidx/fragment/app/c0;->a:I

    .line 71
    .line 72
    if-eq v8, v15, :cond_0

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    const/4 v2, 0x0

    .line 76
    :goto_1
    check-cast v2, Landroidx/fragment/app/c0;

    .line 77
    .line 78
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    move-object/from16 v8, p1

    .line 83
    .line 84
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    :cond_5
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    if-eqz v9, :cond_9

    .line 93
    .line 94
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    move-object v10, v9

    .line 99
    check-cast v10, Landroidx/fragment/app/c0;

    .line 100
    .line 101
    iget-object v11, v10, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 102
    .line 103
    iget-object v11, v11, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 104
    .line 105
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v11}, Landroid/view/View;->getAlpha()F

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    cmpg-float v12, v12, v6

    .line 113
    .line 114
    if-nez v12, :cond_6

    .line 115
    .line 116
    invoke-virtual {v11}, Landroid/view/View;->getVisibility()I

    .line 117
    .line 118
    .line 119
    move-result v12

    .line 120
    if-nez v12, :cond_6

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_6
    invoke-virtual {v11}, Landroid/view/View;->getVisibility()I

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    if-eqz v11, :cond_5

    .line 128
    .line 129
    if-eq v11, v5, :cond_8

    .line 130
    .line 131
    if-ne v11, v4, :cond_7

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_7
    invoke-static {v11, v3}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {v0}, Ln4;->j(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_8
    :goto_2
    iget v10, v10, Landroidx/fragment/app/c0;->a:I

    .line 143
    .line 144
    if-ne v10, v15, :cond_5

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_9
    const/4 v9, 0x0

    .line 148
    :goto_3
    move-object v4, v9

    .line 149
    check-cast v4, Landroidx/fragment/app/c0;

    .line 150
    .line 151
    invoke-static {v15}, Landroidx/fragment/app/w;->K(I)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_a

    .line 156
    .line 157
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    :cond_a
    new-instance v1, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 166
    .line 167
    .line 168
    new-instance v3, Ljava/util/ArrayList;

    .line 169
    .line 170
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->y(Ljava/util/List;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    check-cast v5, Landroidx/fragment/app/c0;

    .line 178
    .line 179
    iget-object v5, v5, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 180
    .line 181
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v9

    .line 189
    if-eqz v9, :cond_b

    .line 190
    .line 191
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    check-cast v9, Landroidx/fragment/app/c0;

    .line 196
    .line 197
    iget-object v9, v9, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 198
    .line 199
    iget-object v9, v9, Landroidx/fragment/app/Fragment;->mAnimationInfo:Ljm0;

    .line 200
    .line 201
    iget-object v10, v5, Landroidx/fragment/app/Fragment;->mAnimationInfo:Ljm0;

    .line 202
    .line 203
    iget v11, v10, Ljm0;->b:I

    .line 204
    .line 205
    iput v11, v9, Ljm0;->b:I

    .line 206
    .line 207
    iget v11, v10, Ljm0;->c:I

    .line 208
    .line 209
    iput v11, v9, Ljm0;->c:I

    .line 210
    .line 211
    iget v11, v10, Ljm0;->d:I

    .line 212
    .line 213
    iput v11, v9, Ljm0;->d:I

    .line 214
    .line 215
    iget v10, v10, Ljm0;->e:I

    .line 216
    .line 217
    iput v10, v9, Ljm0;->e:I

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_b
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    const/4 v8, 0x0

    .line 229
    const/16 v16, 0x1

    .line 230
    .line 231
    if-eqz v6, :cond_e

    .line 232
    .line 233
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v6

    .line 237
    check-cast v6, Landroidx/fragment/app/c0;

    .line 238
    .line 239
    new-instance v9, Landroidx/fragment/app/d;

    .line 240
    .line 241
    invoke-direct {v9, v6, v14}, Landroidx/fragment/app/d;-><init>(Landroidx/fragment/app/c0;Z)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    new-instance v9, Lu60;

    .line 248
    .line 249
    if-eqz v14, :cond_d

    .line 250
    .line 251
    if-ne v6, v2, :cond_c

    .line 252
    .line 253
    :goto_6
    move/from16 v10, v16

    .line 254
    .line 255
    goto :goto_7

    .line 256
    :cond_c
    move v10, v8

    .line 257
    goto :goto_7

    .line 258
    :cond_d
    if-ne v6, v4, :cond_c

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :goto_7
    invoke-direct {v9, v6, v14, v10}, Lu60;-><init>(Landroidx/fragment/app/c0;ZZ)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    new-instance v9, Lo60;

    .line 268
    .line 269
    invoke-direct {v9, v0, v6, v8}, Lo60;-><init>(Landroidx/fragment/app/h;Landroidx/fragment/app/c0;I)V

    .line 270
    .line 271
    .line 272
    iget-object v6, v6, Landroidx/fragment/app/c0;->d:Ljava/util/ArrayList;

    .line 273
    .line 274
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    goto :goto_5

    .line 278
    :cond_e
    new-instance v5, Ljava/util/ArrayList;

    .line 279
    .line 280
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    :cond_f
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 288
    .line 289
    .line 290
    move-result v6

    .line 291
    if-eqz v6, :cond_10

    .line 292
    .line 293
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    move-object v9, v6

    .line 298
    check-cast v9, Lu60;

    .line 299
    .line 300
    invoke-virtual {v9}, Landroidx/fragment/app/f;->a()Z

    .line 301
    .line 302
    .line 303
    move-result v9

    .line 304
    if-nez v9, :cond_f

    .line 305
    .line 306
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    goto :goto_8

    .line 310
    :cond_10
    new-instance v3, Ljava/util/ArrayList;

    .line 311
    .line 312
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    :cond_11
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 320
    .line 321
    .line 322
    move-result v6

    .line 323
    if-eqz v6, :cond_12

    .line 324
    .line 325
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    move-object v9, v6

    .line 330
    check-cast v9, Lu60;

    .line 331
    .line 332
    invoke-virtual {v9}, Lu60;->b()Lln0;

    .line 333
    .line 334
    .line 335
    move-result-object v9

    .line 336
    if-eqz v9, :cond_11

    .line 337
    .line 338
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    goto :goto_9

    .line 342
    :cond_12
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 343
    .line 344
    .line 345
    move-result-object v5

    .line 346
    move-object v6, v5

    .line 347
    const/4 v5, 0x0

    .line 348
    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 349
    .line 350
    .line 351
    move-result v9

    .line 352
    if-eqz v9, :cond_15

    .line 353
    .line 354
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v9

    .line 358
    check-cast v9, Lu60;

    .line 359
    .line 360
    invoke-virtual {v9}, Lu60;->b()Lln0;

    .line 361
    .line 362
    .line 363
    move-result-object v10

    .line 364
    if-eqz v5, :cond_14

    .line 365
    .line 366
    if-ne v10, v5, :cond_13

    .line 367
    .line 368
    goto :goto_b

    .line 369
    :cond_13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 370
    .line 371
    const-string v1, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "

    .line 372
    .line 373
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    iget-object v1, v9, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 377
    .line 378
    iget-object v1, v1, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 379
    .line 380
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    iget-object v1, v9, Lu60;->b:Ljava/lang/Object;

    .line 384
    .line 385
    const-string v2, " returned Transition "

    .line 386
    .line 387
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    const-string v1, " which uses a different Transition type than other Fragments."

    .line 394
    .line 395
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 403
    .line 404
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    throw v1

    .line 412
    :cond_14
    :goto_b
    move-object v5, v10

    .line 413
    goto :goto_a

    .line 414
    :cond_15
    if-nez v5, :cond_16

    .line 415
    .line 416
    move-object/from16 v22, v1

    .line 417
    .line 418
    move/from16 v21, v15

    .line 419
    .line 420
    move v15, v8

    .line 421
    goto/16 :goto_17

    .line 422
    .line 423
    :cond_16
    new-instance v6, Ljava/util/ArrayList;

    .line 424
    .line 425
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 426
    .line 427
    .line 428
    new-instance v9, Ljava/util/ArrayList;

    .line 429
    .line 430
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 431
    .line 432
    .line 433
    move-object v10, v9

    .line 434
    new-instance v9, Lid;

    .line 435
    .line 436
    invoke-direct {v9}, Lle2;-><init>()V

    .line 437
    .line 438
    .line 439
    new-instance v11, Ljava/util/ArrayList;

    .line 440
    .line 441
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 442
    .line 443
    .line 444
    new-instance v12, Ljava/util/ArrayList;

    .line 445
    .line 446
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 447
    .line 448
    .line 449
    move-object v13, v12

    .line 450
    new-instance v12, Lid;

    .line 451
    .line 452
    invoke-direct {v12}, Lle2;-><init>()V

    .line 453
    .line 454
    .line 455
    move-object/from16 v17, v13

    .line 456
    .line 457
    new-instance v13, Lid;

    .line 458
    .line 459
    invoke-direct {v13}, Lle2;-><init>()V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 463
    .line 464
    .line 465
    move-result-object v18

    .line 466
    move-object/from16 v19, v6

    .line 467
    .line 468
    :goto_c
    const/4 v6, 0x0

    .line 469
    :goto_d
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 470
    .line 471
    .line 472
    move-result v20

    .line 473
    if-eqz v20, :cond_24

    .line 474
    .line 475
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v20

    .line 479
    move/from16 v21, v15

    .line 480
    .line 481
    move-object/from16 v15, v20

    .line 482
    .line 483
    check-cast v15, Lu60;

    .line 484
    .line 485
    iget-object v15, v15, Lu60;->d:Ljava/lang/Object;

    .line 486
    .line 487
    if-eqz v15, :cond_23

    .line 488
    .line 489
    if-eqz v2, :cond_23

    .line 490
    .line 491
    iget-object v8, v2, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 492
    .line 493
    if-eqz v4, :cond_22

    .line 494
    .line 495
    iget-object v6, v4, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 496
    .line 497
    invoke-virtual {v5, v15}, Lln0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v11

    .line 501
    invoke-virtual {v5, v11}, Lln0;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v11

    .line 505
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->getSharedElementSourceNames()Ljava/util/ArrayList;

    .line 506
    .line 507
    .line 508
    move-result-object v15

    .line 509
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->getSharedElementSourceNames()Ljava/util/ArrayList;

    .line 513
    .line 514
    .line 515
    move-result-object v7

    .line 516
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    move-object/from16 v22, v1

    .line 520
    .line 521
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->getSharedElementTargetNames()Ljava/util/ArrayList;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    move-object/from16 v23, v2

    .line 529
    .line 530
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 531
    .line 532
    .line 533
    move-result v2

    .line 534
    move-object/from16 v24, v3

    .line 535
    .line 536
    move-object/from16 v25, v4

    .line 537
    .line 538
    const/4 v3, 0x0

    .line 539
    :goto_e
    const/4 v4, -0x1

    .line 540
    if-ge v3, v2, :cond_18

    .line 541
    .line 542
    move/from16 v17, v2

    .line 543
    .line 544
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 549
    .line 550
    .line 551
    move-result v2

    .line 552
    if-eq v2, v4, :cond_17

    .line 553
    .line 554
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v4

    .line 558
    invoke-virtual {v15, v2, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    :cond_17
    add-int/lit8 v3, v3, 0x1

    .line 562
    .line 563
    move/from16 v2, v17

    .line 564
    .line 565
    goto :goto_e

    .line 566
    :cond_18
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->getSharedElementTargetNames()Ljava/util/ArrayList;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    if-nez v14, :cond_19

    .line 574
    .line 575
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->getExitTransitionCallback()Lmd2;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->getEnterTransitionCallback()Lmd2;

    .line 579
    .line 580
    .line 581
    new-instance v2, Lkotlin/Pair;

    .line 582
    .line 583
    const/4 v3, 0x0

    .line 584
    invoke-direct {v2, v3, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 585
    .line 586
    .line 587
    goto :goto_f

    .line 588
    :cond_19
    const/4 v3, 0x0

    .line 589
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->getEnterTransitionCallback()Lmd2;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->getExitTransitionCallback()Lmd2;

    .line 593
    .line 594
    .line 595
    new-instance v2, Lkotlin/Pair;

    .line 596
    .line 597
    invoke-direct {v2, v3, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 598
    .line 599
    .line 600
    :goto_f
    iget-object v7, v2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 601
    .line 602
    if-nez v7, :cond_21

    .line 603
    .line 604
    iget-object v2, v2, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 605
    .line 606
    if-nez v2, :cond_20

    .line 607
    .line 608
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 609
    .line 610
    .line 611
    move-result v2

    .line 612
    const/4 v7, 0x0

    .line 613
    :goto_10
    if-ge v7, v2, :cond_1a

    .line 614
    .line 615
    invoke-virtual {v15, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v17

    .line 619
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    move-object/from16 v3, v17

    .line 623
    .line 624
    check-cast v3, Ljava/lang/String;

    .line 625
    .line 626
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v17

    .line 630
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    move-object/from16 v4, v17

    .line 634
    .line 635
    check-cast v4, Ljava/lang/String;

    .line 636
    .line 637
    invoke-virtual {v9, v3, v4}, Lle2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    add-int/lit8 v7, v7, 0x1

    .line 641
    .line 642
    const/4 v3, 0x0

    .line 643
    const/4 v4, -0x1

    .line 644
    goto :goto_10

    .line 645
    :cond_1a
    invoke-static/range {v21 .. v21}, Landroidx/fragment/app/w;->K(I)Z

    .line 646
    .line 647
    .line 648
    move-result v2

    .line 649
    if-eqz v2, :cond_1c

    .line 650
    .line 651
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 652
    .line 653
    .line 654
    move-result-object v2

    .line 655
    :goto_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 656
    .line 657
    .line 658
    move-result v3

    .line 659
    if-eqz v3, :cond_1b

    .line 660
    .line 661
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v3

    .line 665
    check-cast v3, Ljava/lang/String;

    .line 666
    .line 667
    goto :goto_11

    .line 668
    :cond_1b
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 673
    .line 674
    .line 675
    move-result v3

    .line 676
    if-eqz v3, :cond_1c

    .line 677
    .line 678
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v3

    .line 682
    check-cast v3, Ljava/lang/String;

    .line 683
    .line 684
    goto :goto_12

    .line 685
    :cond_1c
    iget-object v2, v8, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 686
    .line 687
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    invoke-static {v12, v2}, Landroidx/fragment/app/h;->f(Lid;Landroid/view/View;)V

    .line 691
    .line 692
    .line 693
    invoke-static {v12, v15}, Lkx0;->t(Ljava/util/Map;Ljava/util/Collection;)Z

    .line 694
    .line 695
    .line 696
    invoke-virtual {v12}, Lid;->keySet()Ljava/util/Set;

    .line 697
    .line 698
    .line 699
    move-result-object v2

    .line 700
    invoke-static {v9, v2}, Lkx0;->t(Ljava/util/Map;Ljava/util/Collection;)Z

    .line 701
    .line 702
    .line 703
    iget-object v2, v6, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 704
    .line 705
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 706
    .line 707
    .line 708
    invoke-static {v13, v2}, Landroidx/fragment/app/h;->f(Lid;Landroid/view/View;)V

    .line 709
    .line 710
    .line 711
    invoke-static {v13, v1}, Lkx0;->t(Ljava/util/Map;Ljava/util/Collection;)Z

    .line 712
    .line 713
    .line 714
    invoke-virtual {v9}, Lid;->values()Ljava/util/Collection;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    invoke-static {v13, v2}, Lkx0;->t(Ljava/util/Map;Ljava/util/Collection;)Z

    .line 719
    .line 720
    .line 721
    sget-object v2, Len0;->a:Ljn0;

    .line 722
    .line 723
    iget v2, v9, Lle2;->c:I

    .line 724
    .line 725
    add-int/lit8 v2, v2, -0x1

    .line 726
    .line 727
    const/4 v3, -0x1

    .line 728
    :goto_13
    if-ge v3, v2, :cond_1e

    .line 729
    .line 730
    invoke-virtual {v9, v2}, Lle2;->j(I)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v4

    .line 734
    check-cast v4, Ljava/lang/String;

    .line 735
    .line 736
    invoke-virtual {v13, v4}, Lle2;->containsKey(Ljava/lang/Object;)Z

    .line 737
    .line 738
    .line 739
    move-result v4

    .line 740
    if-nez v4, :cond_1d

    .line 741
    .line 742
    invoke-virtual {v9, v2}, Lle2;->i(I)Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    :cond_1d
    add-int/lit8 v2, v2, -0x1

    .line 746
    .line 747
    goto :goto_13

    .line 748
    :cond_1e
    invoke-virtual {v9}, Lid;->keySet()Ljava/util/Set;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 753
    .line 754
    .line 755
    invoke-virtual {v12}, Lid;->entrySet()Ljava/util/Set;

    .line 756
    .line 757
    .line 758
    move-result-object v3

    .line 759
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 760
    .line 761
    .line 762
    new-instance v4, Lo;

    .line 763
    .line 764
    const/4 v6, 0x7

    .line 765
    invoke-direct {v4, v2, v6}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 766
    .line 767
    .line 768
    const/4 v2, 0x0

    .line 769
    invoke-static {v3, v4, v2}, Luw;->m(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Z)Z

    .line 770
    .line 771
    .line 772
    invoke-virtual {v9}, Lid;->values()Ljava/util/Collection;

    .line 773
    .line 774
    .line 775
    move-result-object v3

    .line 776
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 777
    .line 778
    .line 779
    invoke-virtual {v13}, Lid;->entrySet()Ljava/util/Set;

    .line 780
    .line 781
    .line 782
    move-result-object v4

    .line 783
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    .line 785
    .line 786
    new-instance v7, Lo;

    .line 787
    .line 788
    invoke-direct {v7, v3, v6}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 789
    .line 790
    .line 791
    invoke-static {v4, v7, v2}, Luw;->m(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Z)Z

    .line 792
    .line 793
    .line 794
    invoke-virtual {v9}, Lle2;->isEmpty()Z

    .line 795
    .line 796
    .line 797
    move-result v3

    .line 798
    if-eqz v3, :cond_1f

    .line 799
    .line 800
    invoke-static {v11}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    invoke-virtual/range {v23 .. v23}, Landroidx/fragment/app/c0;->toString()Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    invoke-virtual/range {v25 .. v25}, Landroidx/fragment/app/c0;->toString()Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->clear()V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 813
    .line 814
    .line 815
    move-object v11, v1

    .line 816
    move v8, v2

    .line 817
    move-object/from16 v17, v15

    .line 818
    .line 819
    move/from16 v15, v21

    .line 820
    .line 821
    move-object/from16 v1, v22

    .line 822
    .line 823
    move-object/from16 v2, v23

    .line 824
    .line 825
    move-object/from16 v3, v24

    .line 826
    .line 827
    move-object/from16 v4, v25

    .line 828
    .line 829
    goto/16 :goto_c

    .line 830
    .line 831
    :cond_1f
    move v8, v2

    .line 832
    move-object v6, v11

    .line 833
    move-object/from16 v17, v15

    .line 834
    .line 835
    move/from16 v15, v21

    .line 836
    .line 837
    move-object/from16 v2, v23

    .line 838
    .line 839
    move-object/from16 v3, v24

    .line 840
    .line 841
    move-object/from16 v4, v25

    .line 842
    .line 843
    move-object v11, v1

    .line 844
    move-object/from16 v1, v22

    .line 845
    .line 846
    goto/16 :goto_d

    .line 847
    .line 848
    :cond_20
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 849
    .line 850
    .line 851
    return-void

    .line 852
    :cond_21
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 853
    .line 854
    .line 855
    return-void

    .line 856
    :cond_22
    move-object/from16 v22, v1

    .line 857
    .line 858
    move-object/from16 v23, v2

    .line 859
    .line 860
    move-object/from16 v24, v3

    .line 861
    .line 862
    move-object/from16 v25, v4

    .line 863
    .line 864
    const/4 v2, 0x0

    .line 865
    goto :goto_14

    .line 866
    :cond_23
    move-object/from16 v22, v1

    .line 867
    .line 868
    move-object/from16 v23, v2

    .line 869
    .line 870
    move-object/from16 v24, v3

    .line 871
    .line 872
    move-object/from16 v25, v4

    .line 873
    .line 874
    move v2, v8

    .line 875
    :goto_14
    move v8, v2

    .line 876
    move/from16 v15, v21

    .line 877
    .line 878
    move-object/from16 v1, v22

    .line 879
    .line 880
    move-object/from16 v2, v23

    .line 881
    .line 882
    move-object/from16 v3, v24

    .line 883
    .line 884
    move-object/from16 v4, v25

    .line 885
    .line 886
    goto/16 :goto_d

    .line 887
    .line 888
    :cond_24
    move-object/from16 v22, v1

    .line 889
    .line 890
    move-object/from16 v23, v2

    .line 891
    .line 892
    move-object/from16 v24, v3

    .line 893
    .line 894
    move-object/from16 v25, v4

    .line 895
    .line 896
    move v2, v8

    .line 897
    move/from16 v21, v15

    .line 898
    .line 899
    if-nez v6, :cond_27

    .line 900
    .line 901
    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->isEmpty()Z

    .line 902
    .line 903
    .line 904
    move-result v1

    .line 905
    if-eqz v1, :cond_26

    .line 906
    .line 907
    :cond_25
    move v15, v2

    .line 908
    goto :goto_17

    .line 909
    :cond_26
    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 910
    .line 911
    .line 912
    move-result-object v1

    .line 913
    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 914
    .line 915
    .line 916
    move-result v3

    .line 917
    if-eqz v3, :cond_25

    .line 918
    .line 919
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    move-result-object v3

    .line 923
    check-cast v3, Lu60;

    .line 924
    .line 925
    iget-object v3, v3, Lu60;->b:Ljava/lang/Object;

    .line 926
    .line 927
    if-nez v3, :cond_27

    .line 928
    .line 929
    goto :goto_15

    .line 930
    :cond_27
    new-instance v1, Landroidx/fragment/app/g;

    .line 931
    .line 932
    move v15, v2

    .line 933
    move-object v8, v10

    .line 934
    move-object v10, v11

    .line 935
    move-object/from16 v11, v17

    .line 936
    .line 937
    move-object/from16 v7, v19

    .line 938
    .line 939
    move-object/from16 v3, v23

    .line 940
    .line 941
    move-object/from16 v2, v24

    .line 942
    .line 943
    move-object/from16 v4, v25

    .line 944
    .line 945
    invoke-direct/range {v1 .. v14}, Landroidx/fragment/app/g;-><init>(Ljava/util/ArrayList;Landroidx/fragment/app/c0;Landroidx/fragment/app/c0;Lln0;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Lid;Ljava/util/ArrayList;Ljava/util/ArrayList;Lid;Lid;Z)V

    .line 946
    .line 947
    .line 948
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 949
    .line 950
    .line 951
    move-result-object v2

    .line 952
    :goto_16
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 953
    .line 954
    .line 955
    move-result v3

    .line 956
    if-eqz v3, :cond_28

    .line 957
    .line 958
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v3

    .line 962
    check-cast v3, Lu60;

    .line 963
    .line 964
    iget-object v3, v3, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 965
    .line 966
    iget-object v3, v3, Landroidx/fragment/app/c0;->j:Ljava/util/ArrayList;

    .line 967
    .line 968
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 969
    .line 970
    .line 971
    goto :goto_16

    .line 972
    :cond_28
    :goto_17
    new-instance v1, Ljava/util/ArrayList;

    .line 973
    .line 974
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 975
    .line 976
    .line 977
    new-instance v2, Ljava/util/ArrayList;

    .line 978
    .line 979
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 980
    .line 981
    .line 982
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 983
    .line 984
    .line 985
    move-result-object v3

    .line 986
    :goto_18
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 987
    .line 988
    .line 989
    move-result v4

    .line 990
    if-eqz v4, :cond_29

    .line 991
    .line 992
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 993
    .line 994
    .line 995
    move-result-object v4

    .line 996
    check-cast v4, Landroidx/fragment/app/d;

    .line 997
    .line 998
    iget-object v4, v4, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 999
    .line 1000
    iget-object v4, v4, Landroidx/fragment/app/c0;->k:Ljava/util/ArrayList;

    .line 1001
    .line 1002
    invoke-static {v2, v4}, Luw;->k(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1003
    .line 1004
    .line 1005
    goto :goto_18

    .line 1006
    :cond_29
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1007
    .line 1008
    .line 1009
    move-result v2

    .line 1010
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v3

    .line 1014
    move v8, v15

    .line 1015
    :cond_2a
    :goto_19
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1016
    .line 1017
    .line 1018
    move-result v4

    .line 1019
    if-eqz v4, :cond_2f

    .line 1020
    .line 1021
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v4

    .line 1025
    check-cast v4, Landroidx/fragment/app/d;

    .line 1026
    .line 1027
    iget-object v5, v0, Landroidx/fragment/app/h;->a:Landroid/view/ViewGroup;

    .line 1028
    .line 1029
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v5

    .line 1033
    iget-object v6, v4, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 1034
    .line 1035
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual {v4, v5}, Landroidx/fragment/app/d;->b(Landroid/content/Context;)Lwc0;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v5

    .line 1042
    if-nez v5, :cond_2b

    .line 1043
    .line 1044
    goto :goto_19

    .line 1045
    :cond_2b
    iget-object v5, v5, Lwc0;->c:Ljava/lang/Object;

    .line 1046
    .line 1047
    check-cast v5, Landroid/animation/AnimatorSet;

    .line 1048
    .line 1049
    if-nez v5, :cond_2c

    .line 1050
    .line 1051
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1052
    .line 1053
    .line 1054
    goto :goto_19

    .line 1055
    :cond_2c
    iget-object v5, v6, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 1056
    .line 1057
    iget-object v7, v6, Landroidx/fragment/app/c0;->k:Ljava/util/ArrayList;

    .line 1058
    .line 1059
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1060
    .line 1061
    .line 1062
    move-result v7

    .line 1063
    if-nez v7, :cond_2d

    .line 1064
    .line 1065
    invoke-static/range {v21 .. v21}, Landroidx/fragment/app/w;->K(I)Z

    .line 1066
    .line 1067
    .line 1068
    move-result v4

    .line 1069
    if-eqz v4, :cond_2a

    .line 1070
    .line 1071
    invoke-static {v5}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1072
    .line 1073
    .line 1074
    goto :goto_19

    .line 1075
    :cond_2d
    iget v5, v6, Landroidx/fragment/app/c0;->a:I

    .line 1076
    .line 1077
    const/4 v7, 0x3

    .line 1078
    if-ne v5, v7, :cond_2e

    .line 1079
    .line 1080
    iput-boolean v15, v6, Landroidx/fragment/app/c0;->i:Z

    .line 1081
    .line 1082
    :cond_2e
    new-instance v5, Landroidx/fragment/app/e;

    .line 1083
    .line 1084
    invoke-direct {v5, v4}, Landroidx/fragment/app/e;-><init>(Landroidx/fragment/app/d;)V

    .line 1085
    .line 1086
    .line 1087
    iget-object v4, v6, Landroidx/fragment/app/c0;->j:Ljava/util/ArrayList;

    .line 1088
    .line 1089
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1090
    .line 1091
    .line 1092
    move/from16 v8, v16

    .line 1093
    .line 1094
    goto :goto_19

    .line 1095
    :cond_2f
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v0

    .line 1099
    :cond_30
    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1100
    .line 1101
    .line 1102
    move-result v1

    .line 1103
    if-eqz v1, :cond_33

    .line 1104
    .line 1105
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v1

    .line 1109
    check-cast v1, Landroidx/fragment/app/d;

    .line 1110
    .line 1111
    iget-object v3, v1, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 1112
    .line 1113
    iget-object v4, v3, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 1114
    .line 1115
    if-nez v2, :cond_31

    .line 1116
    .line 1117
    invoke-static/range {v21 .. v21}, Landroidx/fragment/app/w;->K(I)Z

    .line 1118
    .line 1119
    .line 1120
    move-result v1

    .line 1121
    if-eqz v1, :cond_30

    .line 1122
    .line 1123
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1124
    .line 1125
    .line 1126
    goto :goto_1a

    .line 1127
    :cond_31
    if-eqz v8, :cond_32

    .line 1128
    .line 1129
    invoke-static/range {v21 .. v21}, Landroidx/fragment/app/w;->K(I)Z

    .line 1130
    .line 1131
    .line 1132
    move-result v1

    .line 1133
    if-eqz v1, :cond_30

    .line 1134
    .line 1135
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 1136
    .line 1137
    .line 1138
    goto :goto_1a

    .line 1139
    :cond_32
    new-instance v4, Landroidx/fragment/app/c;

    .line 1140
    .line 1141
    invoke-direct {v4, v1}, Landroidx/fragment/app/c;-><init>(Landroidx/fragment/app/d;)V

    .line 1142
    .line 1143
    .line 1144
    iget-object v1, v3, Landroidx/fragment/app/c0;->j:Ljava/util/ArrayList;

    .line 1145
    .line 1146
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1147
    .line 1148
    .line 1149
    goto :goto_1a

    .line 1150
    :cond_33
    return-void
.end method

.method public final c(Ljava/util/List;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroidx/fragment/app/c0;

    .line 24
    .line 25
    iget-object v2, v2, Landroidx/fragment/app/c0;->k:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-static {v0, v2}, Luw;->k(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->N(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x0

    .line 44
    move v3, v2

    .line 45
    :goto_1
    if-ge v3, v1, :cond_1

    .line 46
    .line 47
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Lwf2;

    .line 52
    .line 53
    iget-object v5, p0, Landroidx/fragment/app/h;->a:Landroid/view/ViewGroup;

    .line 54
    .line 55
    invoke-virtual {v4, v5}, Lwf2;->c(Landroid/view/ViewGroup;)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v3, v3, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    move v1, v2

    .line 66
    :goto_2
    if-ge v1, v0, :cond_2

    .line 67
    .line 68
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Landroidx/fragment/app/c0;

    .line 73
    .line 74
    invoke-virtual {p0, v3}, Landroidx/fragment/app/h;->a(Landroidx/fragment/app/c0;)V

    .line 75
    .line 76
    .line 77
    add-int/lit8 v1, v1, 0x1

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    :goto_3
    if-ge v2, p1, :cond_4

    .line 89
    .line 90
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Landroidx/fragment/app/c0;

    .line 95
    .line 96
    iget-object v1, v0, Landroidx/fragment/app/c0;->k:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_3

    .line 103
    .line 104
    invoke-virtual {v0}, Landroidx/fragment/app/c0;->b()V

    .line 105
    .line 106
    .line 107
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_4
    return-void
.end method

.method public final d(IILandroidx/fragment/app/y;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p3, Landroidx/fragment/app/y;->c:Landroidx/fragment/app/Fragment;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v1}, Landroidx/fragment/app/h;->g(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/c0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p3, Landroidx/fragment/app/y;->c:Landroidx/fragment/app/Fragment;

    .line 16
    .line 17
    iget-boolean v2, v1, Landroidx/fragment/app/Fragment;->mTransitioning:Z

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroidx/fragment/app/h;->h(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/c0;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {v1, p1, p2}, Landroidx/fragment/app/c0;->d(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :cond_2
    :try_start_1
    new-instance v1, Landroidx/fragment/app/c0;

    .line 37
    .line 38
    invoke-direct {v1, p1, p2, p3}, Landroidx/fragment/app/c0;-><init>(IILandroidx/fragment/app/y;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Landroidx/fragment/app/h;->b:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    new-instance p1, Landroidx/fragment/app/b0;

    .line 47
    .line 48
    invoke-direct {p1, p0, v1}, Landroidx/fragment/app/b0;-><init>(Landroidx/fragment/app/h;Landroidx/fragment/app/c0;)V

    .line 49
    .line 50
    .line 51
    iget-object p2, v1, Landroidx/fragment/app/c0;->d:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    new-instance p1, Lo60;

    .line 57
    .line 58
    const/4 p2, 0x1

    .line 59
    invoke-direct {p1, p0, v1, p2}, Lo60;-><init>(Landroidx/fragment/app/h;Landroidx/fragment/app/c0;I)V

    .line 60
    .line 61
    .line 62
    iget-object p0, v1, Landroidx/fragment/app/c0;->d:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    .line 66
    .line 67
    monitor-exit v0

    .line 68
    return-void

    .line 69
    :goto_1
    monitor-exit v0

    .line 70
    throw p0
.end method

.method public final e()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/h;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/h;->a:Landroid/view/ViewGroup;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/h;->i()V

    .line 16
    .line 17
    .line 18
    iput-boolean v1, p0, Landroidx/fragment/app/h;->d:Z

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/h;->b:Ljava/util/ArrayList;

    .line 22
    .line 23
    monitor-enter v0

    .line 24
    :try_start_0
    iget-object v2, p0, Landroidx/fragment/app/h;->b:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    iget-object v3, p0, Landroidx/fragment/app/h;->c:Ljava/util/ArrayList;

    .line 31
    .line 32
    const/4 v4, 0x2

    .line 33
    if-eqz v2, :cond_5

    .line 34
    .line 35
    :try_start_1
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->M(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v2, p0, Landroidx/fragment/app/h;->c:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_16

    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Landroidx/fragment/app/c0;

    .line 59
    .line 60
    invoke-static {v4}, Landroidx/fragment/app/w;->K(I)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_3

    .line 65
    .line 66
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :catchall_0
    move-exception p0

    .line 71
    goto/16 :goto_d

    .line 72
    .line 73
    :cond_3
    :goto_1
    iget-object v3, p0, Landroidx/fragment/app/h;->a:Landroid/view/ViewGroup;

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-boolean v5, v2, Landroidx/fragment/app/c0;->e:Z

    .line 82
    .line 83
    if-eqz v5, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    invoke-virtual {v2, v3}, Landroidx/fragment/app/c0;->a(Landroid/view/ViewGroup;)V

    .line 87
    .line 88
    .line 89
    :goto_2
    iget-boolean v3, v2, Landroidx/fragment/app/c0;->f:Z

    .line 90
    .line 91
    if-nez v3, :cond_2

    .line 92
    .line 93
    iget-object v3, p0, Landroidx/fragment/app/h;->c:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_5
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->M(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    iget-object v3, p0, Landroidx/fragment/app/h;->c:Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    :cond_6
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    const/4 v5, 0x1

    .line 117
    if-eqz v3, :cond_a

    .line 118
    .line 119
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    check-cast v3, Landroidx/fragment/app/c0;

    .line 124
    .line 125
    invoke-static {v4}, Landroidx/fragment/app/w;->K(I)Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-eqz v6, :cond_7

    .line 130
    .line 131
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    :cond_7
    iget-object v6, p0, Landroidx/fragment/app/h;->a:Landroid/view/ViewGroup;

    .line 135
    .line 136
    iget-object v7, v3, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 137
    .line 138
    iget-boolean v7, v7, Landroidx/fragment/app/Fragment;->mTransitioning:Z

    .line 139
    .line 140
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-boolean v8, v3, Landroidx/fragment/app/c0;->e:Z

    .line 144
    .line 145
    if-eqz v8, :cond_8

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_8
    if-eqz v7, :cond_9

    .line 149
    .line 150
    iput-boolean v5, v3, Landroidx/fragment/app/c0;->g:Z

    .line 151
    .line 152
    :cond_9
    invoke-virtual {v3, v6}, Landroidx/fragment/app/c0;->a(Landroid/view/ViewGroup;)V

    .line 153
    .line 154
    .line 155
    :goto_4
    iget-boolean v5, v3, Landroidx/fragment/app/c0;->f:Z

    .line 156
    .line 157
    if-nez v5, :cond_6

    .line 158
    .line 159
    iget-object v5, p0, Landroidx/fragment/app/h;->c:Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_a
    invoke-virtual {p0}, Landroidx/fragment/app/h;->m()V

    .line 166
    .line 167
    .line 168
    iget-object v2, p0, Landroidx/fragment/app/h;->b:Ljava/util/ArrayList;

    .line 169
    .line 170
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->M(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 178
    if-eqz v3, :cond_b

    .line 179
    .line 180
    monitor-exit v0

    .line 181
    return-void

    .line 182
    :cond_b
    :try_start_2
    iget-object v3, p0, Landroidx/fragment/app/h;->b:Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 185
    .line 186
    .line 187
    iget-object v3, p0, Landroidx/fragment/app/h;->c:Ljava/util/ArrayList;

    .line 188
    .line 189
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 190
    .line 191
    .line 192
    iget-boolean v3, p0, Landroidx/fragment/app/h;->d:Z

    .line 193
    .line 194
    invoke-virtual {p0, v2, v3}, Landroidx/fragment/app/h;->b(Ljava/util/ArrayList;Z)V

    .line 195
    .line 196
    .line 197
    new-instance v3, Le22;

    .line 198
    .line 199
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 200
    .line 201
    .line 202
    iput-boolean v5, v3, Le22;->a:Z

    .line 203
    .line 204
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    move v6, v5

    .line 209
    :cond_c
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v7

    .line 213
    if-eqz v7, :cond_11

    .line 214
    .line 215
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    check-cast v7, Landroidx/fragment/app/c0;

    .line 220
    .line 221
    iget-object v8, v7, Landroidx/fragment/app/c0;->k:Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 224
    .line 225
    .line 226
    move-result v8

    .line 227
    if-nez v8, :cond_10

    .line 228
    .line 229
    iget-object v8, v7, Landroidx/fragment/app/c0;->k:Ljava/util/ArrayList;

    .line 230
    .line 231
    if-eqz v8, :cond_d

    .line 232
    .line 233
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 234
    .line 235
    .line 236
    move-result v9

    .line 237
    if-eqz v9, :cond_d

    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_d
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    :cond_e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 245
    .line 246
    .line 247
    move-result v9

    .line 248
    if-eqz v9, :cond_f

    .line 249
    .line 250
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v9

    .line 254
    check-cast v9, Lwf2;

    .line 255
    .line 256
    invoke-virtual {v9}, Lwf2;->a()Z

    .line 257
    .line 258
    .line 259
    move-result v9

    .line 260
    if-nez v9, :cond_e

    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_f
    :goto_6
    move v8, v5

    .line 264
    goto :goto_8

    .line 265
    :cond_10
    :goto_7
    move v8, v1

    .line 266
    :goto_8
    iput-boolean v8, v3, Le22;->a:Z

    .line 267
    .line 268
    iget-object v7, v7, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 269
    .line 270
    iget-boolean v7, v7, Landroidx/fragment/app/Fragment;->mTransitioning:Z

    .line 271
    .line 272
    if-nez v7, :cond_c

    .line 273
    .line 274
    move v6, v1

    .line 275
    goto :goto_5

    .line 276
    :cond_11
    iget-boolean v4, v3, Le22;->a:Z

    .line 277
    .line 278
    if-eqz v4, :cond_13

    .line 279
    .line 280
    new-instance v4, Ljava/util/ArrayList;

    .line 281
    .line 282
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 286
    .line 287
    .line 288
    move-result-object v7

    .line 289
    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 290
    .line 291
    .line 292
    move-result v8

    .line 293
    if-eqz v8, :cond_12

    .line 294
    .line 295
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v8

    .line 299
    check-cast v8, Landroidx/fragment/app/c0;

    .line 300
    .line 301
    iget-object v8, v8, Landroidx/fragment/app/c0;->k:Ljava/util/ArrayList;

    .line 302
    .line 303
    invoke-static {v4, v8}, Luw;->k(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 304
    .line 305
    .line 306
    goto :goto_9

    .line 307
    :cond_12
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    if-nez v4, :cond_13

    .line 312
    .line 313
    goto :goto_a

    .line 314
    :cond_13
    move v5, v1

    .line 315
    :goto_a
    iput-boolean v5, v3, Le22;->a:Z

    .line 316
    .line 317
    if-nez v6, :cond_14

    .line 318
    .line 319
    invoke-virtual {p0, v2}, Landroidx/fragment/app/h;->l(Ljava/util/List;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {p0, v2}, Landroidx/fragment/app/h;->c(Ljava/util/List;)V

    .line 323
    .line 324
    .line 325
    goto :goto_c

    .line 326
    :cond_14
    if-eqz v5, :cond_15

    .line 327
    .line 328
    invoke-virtual {p0, v2}, Landroidx/fragment/app/h;->l(Ljava/util/List;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    move v4, v1

    .line 336
    :goto_b
    if-ge v4, v3, :cond_15

    .line 337
    .line 338
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    check-cast v5, Landroidx/fragment/app/c0;

    .line 343
    .line 344
    invoke-virtual {p0, v5}, Landroidx/fragment/app/h;->a(Landroidx/fragment/app/c0;)V

    .line 345
    .line 346
    .line 347
    add-int/lit8 v4, v4, 0x1

    .line 348
    .line 349
    goto :goto_b

    .line 350
    :cond_15
    :goto_c
    iput-boolean v1, p0, Landroidx/fragment/app/h;->d:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 351
    .line 352
    :cond_16
    monitor-exit v0

    .line 353
    return-void

    .line 354
    :goto_d
    monitor-exit v0

    .line 355
    throw p0
.end method

.method public final g(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/c0;
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/h;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, Landroidx/fragment/app/c0;

    .line 19
    .line 20
    iget-object v2, v1, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 21
    .line 22
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    iget-boolean v1, v1, Landroidx/fragment/app/c0;->e:Z

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    :goto_0
    check-cast v0, Landroidx/fragment/app/c0;

    .line 35
    .line 36
    return-object v0
.end method

.method public final h(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/c0;
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/h;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, Landroidx/fragment/app/c0;

    .line 19
    .line 20
    iget-object v2, v1, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 21
    .line 22
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    iget-boolean v1, v1, Landroidx/fragment/app/c0;->e:Z

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    :goto_0
    check-cast v0, Landroidx/fragment/app/c0;

    .line 35
    .line 36
    return-object v0
.end method

.method public final i()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h;->a:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Landroidx/fragment/app/h;->b:Ljava/util/ArrayList;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/h;->m()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Landroidx/fragment/app/h;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Landroidx/fragment/app/h;->l(Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Landroidx/fragment/app/h;->c:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->M(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/4 v4, 0x2

    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Landroidx/fragment/app/c0;

    .line 40
    .line 41
    invoke-static {v4}, Landroidx/fragment/app/w;->K(I)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    iget-object v4, p0, Landroidx/fragment/app/h;->a:Landroid/view/ViewGroup;

    .line 51
    .line 52
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    goto :goto_5

    .line 61
    :cond_1
    :goto_2
    iget-object v4, p0, Landroidx/fragment/app/h;->a:Landroid/view/ViewGroup;

    .line 62
    .line 63
    invoke-virtual {v3, v4}, Landroidx/fragment/app/c0;->a(Landroid/view/ViewGroup;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    iget-object v2, p0, Landroidx/fragment/app/h;->b:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->M(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_5

    .line 82
    .line 83
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    check-cast v3, Landroidx/fragment/app/c0;

    .line 88
    .line 89
    invoke-static {v4}, Landroidx/fragment/app/w;->K(I)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_4

    .line 94
    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_3
    iget-object v5, p0, Landroidx/fragment/app/h;->a:Landroid/view/ViewGroup;

    .line 99
    .line 100
    invoke-static {v5}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    :goto_4
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    :cond_4
    iget-object v5, p0, Landroidx/fragment/app/h;->a:Landroid/view/ViewGroup;

    .line 107
    .line 108
    invoke-virtual {v3, v5}, Landroidx/fragment/app/c0;->a(Landroid/view/ViewGroup;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    monitor-exit v1

    .line 113
    return-void

    .line 114
    :goto_5
    monitor-exit v1

    .line 115
    throw p0
.end method

.method public final k()V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/h;->m()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Landroidx/fragment/app/h;->b:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v2, :cond_5

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    move-object v4, v2

    .line 29
    check-cast v4, Landroidx/fragment/app/c0;

    .line 30
    .line 31
    iget-object v5, v4, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 32
    .line 33
    iget-object v5, v5, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5}, Landroid/view/View;->getAlpha()F

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/4 v7, 0x0

    .line 43
    cmpg-float v6, v6, v7

    .line 44
    .line 45
    const/4 v7, 0x2

    .line 46
    const/4 v8, 0x4

    .line 47
    if-nez v6, :cond_1

    .line 48
    .line 49
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-nez v6, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_3

    .line 61
    .line 62
    if-eq v5, v8, :cond_4

    .line 63
    .line 64
    const/16 v6, 0x8

    .line 65
    .line 66
    if-ne v5, v6, :cond_2

    .line 67
    .line 68
    const/4 v8, 0x3

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 71
    .line 72
    new-instance v1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v2, "Unknown visibility "

    .line 75
    .line 76
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p0

    .line 90
    :cond_3
    move v8, v7

    .line 91
    :cond_4
    :goto_0
    iget v4, v4, Landroidx/fragment/app/c0;->a:I

    .line 92
    .line 93
    if-ne v4, v7, :cond_0

    .line 94
    .line 95
    if-eq v8, v7, :cond_0

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :catchall_0
    move-exception p0

    .line 99
    goto :goto_3

    .line 100
    :cond_5
    move-object v2, v3

    .line 101
    :goto_1
    check-cast v2, Landroidx/fragment/app/c0;

    .line 102
    .line 103
    if-eqz v2, :cond_6

    .line 104
    .line 105
    iget-object v3, v2, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 106
    .line 107
    :cond_6
    if-eqz v3, :cond_7

    .line 108
    .line 109
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->isPostponed()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    goto :goto_2

    .line 114
    :cond_7
    const/4 v1, 0x0

    .line 115
    :goto_2
    iput-boolean v1, p0, Landroidx/fragment/app/h;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    .line 117
    monitor-exit v0

    .line 118
    return-void

    .line 119
    :goto_3
    monitor-exit v0

    .line 120
    throw p0
.end method

.method public final l(Ljava/util/List;)V
    .locals 8

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    const/4 v3, 0x1

    .line 8
    if-ge v2, v0, :cond_7

    .line 9
    .line 10
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    check-cast v4, Landroidx/fragment/app/c0;

    .line 15
    .line 16
    iget-object v5, v4, Landroidx/fragment/app/c0;->l:Landroidx/fragment/app/y;

    .line 17
    .line 18
    iget-boolean v6, v4, Landroidx/fragment/app/c0;->h:Z

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    goto/16 :goto_1

    .line 23
    .line 24
    :cond_0
    iput-boolean v3, v4, Landroidx/fragment/app/c0;->h:Z

    .line 25
    .line 26
    iget v3, v4, Landroidx/fragment/app/c0;->b:I

    .line 27
    .line 28
    const/4 v6, 0x2

    .line 29
    if-ne v3, v6, :cond_4

    .line 30
    .line 31
    iget-object v3, v5, Landroidx/fragment/app/y;->c:Landroidx/fragment/app/Fragment;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v7, v3, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 37
    .line 38
    invoke-virtual {v7}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    if-eqz v7, :cond_1

    .line 43
    .line 44
    invoke-virtual {v3, v7}, Landroidx/fragment/app/Fragment;->setFocusedView(Landroid/view/View;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v6}, Landroidx/fragment/app/w;->K(I)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_1

    .line 52
    .line 53
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    :cond_1
    iget-object v4, v4, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 60
    .line 61
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    const/4 v7, 0x0

    .line 73
    if-nez v6, :cond_2

    .line 74
    .line 75
    invoke-virtual {v5}, Landroidx/fragment/app/y;->a()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v7}, Landroid/view/View;->setAlpha(F)V

    .line 79
    .line 80
    .line 81
    :cond_2
    invoke-virtual {v4}, Landroid/view/View;->getAlpha()F

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    cmpg-float v5, v5, v7

    .line 86
    .line 87
    if-nez v5, :cond_3

    .line 88
    .line 89
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-nez v5, :cond_3

    .line 94
    .line 95
    const/4 v5, 0x4

    .line 96
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 97
    .line 98
    .line 99
    :cond_3
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->getPostOnViewCreatedAlpha()F

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-virtual {v4, v3}, Landroid/view/View;->setAlpha(F)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    const/4 v4, 0x3

    .line 108
    if-ne v3, v4, :cond_6

    .line 109
    .line 110
    iget-object v3, v5, Landroidx/fragment/app/y;->c:Landroidx/fragment/app/Fragment;

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-static {v6}, Landroidx/fragment/app/w;->K(I)Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-eqz v5, :cond_5

    .line 127
    .line 128
    invoke-virtual {v4}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-static {v5}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    :cond_5
    invoke-virtual {v4}, Landroid/view/View;->clearFocus()V

    .line 142
    .line 143
    .line 144
    :cond_6
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 145
    .line 146
    goto/16 :goto_0

    .line 147
    .line 148
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_8

    .line 162
    .line 163
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    check-cast v2, Landroidx/fragment/app/c0;

    .line 168
    .line 169
    iget-object v2, v2, Landroidx/fragment/app/c0;->k:Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-static {v0, v2}, Luw;->k(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_8
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->N(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    :goto_3
    if-ge v1, v0, :cond_a

    .line 188
    .line 189
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    check-cast v2, Lwf2;

    .line 194
    .line 195
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    iget-object v4, p0, Landroidx/fragment/app/h;->a:Landroid/view/ViewGroup;

    .line 199
    .line 200
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    iget-boolean v5, v2, Lwf2;->a:Z

    .line 204
    .line 205
    if-nez v5, :cond_9

    .line 206
    .line 207
    invoke-virtual {v2, v4}, Lwf2;->e(Landroid/view/ViewGroup;)V

    .line 208
    .line 209
    .line 210
    :cond_9
    iput-boolean v3, v2, Lwf2;->a:Z

    .line 211
    .line 212
    add-int/lit8 v1, v1, 0x1

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_a
    return-void
.end method

.method public final m()V
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/h;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroidx/fragment/app/c0;

    .line 18
    .line 19
    iget v1, v0, Landroidx/fragment/app/c0;->b:I

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    if-ne v1, v2, :cond_0

    .line 23
    .line 24
    iget-object v1, v0, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    const/4 v2, 0x4

    .line 40
    if-eq v1, v2, :cond_2

    .line 41
    .line 42
    const/16 v2, 0x8

    .line 43
    .line 44
    if-ne v1, v2, :cond_1

    .line 45
    .line 46
    const/4 v2, 0x3

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const-string p0, "Unknown visibility "

    .line 49
    .line 50
    invoke-static {v1, p0}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    :goto_1
    const/4 v1, 0x1

    .line 59
    invoke-virtual {v0, v2, v1}, Landroidx/fragment/app/c0;->d(II)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    return-void
.end method

.class public final Lkk1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:I

.field public final b:Z

.field public c:I

.field public d:I

.field public e:I

.field public f:Ljava/lang/String;

.field public g:I

.field public h:I

.field public final i:F

.field public final j:Llk1;

.field public final k:Ljava/util/ArrayList;

.field public l:Lmq2;

.field public final m:Ljava/util/ArrayList;

.field public final n:I

.field public final o:Z

.field public p:I

.field public final q:I

.field public final r:I


# direct methods
.method public constructor <init>(Llk1;II)V
    .locals 4

    .line 395
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 396
    iput v0, p0, Lkk1;->a:I

    const/4 v1, 0x0

    .line 397
    iput-boolean v1, p0, Lkk1;->b:Z

    .line 398
    iput v0, p0, Lkk1;->c:I

    .line 399
    iput v0, p0, Lkk1;->d:I

    .line 400
    iput v1, p0, Lkk1;->e:I

    const/4 v2, 0x0

    .line 401
    iput-object v2, p0, Lkk1;->f:Ljava/lang/String;

    .line 402
    iput v0, p0, Lkk1;->g:I

    const/16 v3, 0x190

    .line 403
    iput v3, p0, Lkk1;->h:I

    const/4 v3, 0x0

    .line 404
    iput v3, p0, Lkk1;->i:F

    .line 405
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lkk1;->k:Ljava/util/ArrayList;

    .line 406
    iput-object v2, p0, Lkk1;->l:Lmq2;

    .line 407
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lkk1;->m:Ljava/util/ArrayList;

    .line 408
    iput v1, p0, Lkk1;->n:I

    .line 409
    iput-boolean v1, p0, Lkk1;->o:Z

    .line 410
    iput v0, p0, Lkk1;->p:I

    .line 411
    iput v1, p0, Lkk1;->q:I

    .line 412
    iput v1, p0, Lkk1;->r:I

    .line 413
    iput v0, p0, Lkk1;->a:I

    .line 414
    iput-object p1, p0, Lkk1;->j:Llk1;

    .line 415
    iput p2, p0, Lkk1;->d:I

    .line 416
    iput p3, p0, Lkk1;->c:I

    .line 417
    iget p2, p1, Llk1;->j:I

    .line 418
    iput p2, p0, Lkk1;->h:I

    .line 419
    iget p1, p1, Llk1;->k:I

    .line 420
    iput p1, p0, Lkk1;->q:I

    return-void
.end method

.method public constructor <init>(Llk1;Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lkk1;->a:I

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-boolean v1, p0, Lkk1;->b:Z

    .line 9
    .line 10
    iput v0, p0, Lkk1;->c:I

    .line 11
    .line 12
    iput v0, p0, Lkk1;->d:I

    .line 13
    .line 14
    iput v1, p0, Lkk1;->e:I

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iput-object v2, p0, Lkk1;->f:Ljava/lang/String;

    .line 18
    .line 19
    iput v0, p0, Lkk1;->g:I

    .line 20
    .line 21
    const/16 v3, 0x190

    .line 22
    .line 23
    iput v3, p0, Lkk1;->h:I

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    iput v3, p0, Lkk1;->i:F

    .line 27
    .line 28
    new-instance v3, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v3, p0, Lkk1;->k:Ljava/util/ArrayList;

    .line 34
    .line 35
    iput-object v2, p0, Lkk1;->l:Lmq2;

    .line 36
    .line 37
    new-instance v2, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v2, p0, Lkk1;->m:Ljava/util/ArrayList;

    .line 43
    .line 44
    iput v1, p0, Lkk1;->n:I

    .line 45
    .line 46
    iput-boolean v1, p0, Lkk1;->o:Z

    .line 47
    .line 48
    iput v0, p0, Lkk1;->p:I

    .line 49
    .line 50
    iput v1, p0, Lkk1;->r:I

    .line 51
    .line 52
    iget v2, p1, Llk1;->j:I

    .line 53
    .line 54
    iget-object v3, p1, Llk1;->g:Landroid/util/SparseArray;

    .line 55
    .line 56
    iput v2, p0, Lkk1;->h:I

    .line 57
    .line 58
    iget v2, p1, Llk1;->k:I

    .line 59
    .line 60
    iput v2, p0, Lkk1;->q:I

    .line 61
    .line 62
    iput-object p1, p0, Lkk1;->j:Llk1;

    .line 63
    .line 64
    invoke-static {p3}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    sget-object v2, Landroidx/constraintlayout/widget/R$styleable;->Transition:[I

    .line 69
    .line 70
    invoke-virtual {p2, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    invoke-virtual {p3}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    move v4, v1

    .line 79
    :goto_0
    const/4 v5, 0x1

    .line 80
    if-ge v4, v2, :cond_10

    .line 81
    .line 82
    invoke-virtual {p3, v4}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    sget v7, Landroidx/constraintlayout/widget/R$styleable;->Transition_constraintSetEnd:I

    .line 87
    .line 88
    const-string v8, "xml"

    .line 89
    .line 90
    const-string v9, "layout"

    .line 91
    .line 92
    if-ne v6, v7, :cond_1

    .line 93
    .line 94
    invoke-virtual {p3, v6, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    iput v5, p0, Lkk1;->c:I

    .line 99
    .line 100
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    iget v6, p0, Lkk1;->c:I

    .line 105
    .line 106
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-eqz v6, :cond_0

    .line 115
    .line 116
    new-instance v5, Landroidx/constraintlayout/widget/d;

    .line 117
    .line 118
    invoke-direct {v5}, Landroidx/constraintlayout/widget/d;-><init>()V

    .line 119
    .line 120
    .line 121
    iget v6, p0, Lkk1;->c:I

    .line 122
    .line 123
    invoke-virtual {v5, p2, v6}, Landroidx/constraintlayout/widget/d;->j(Landroid/content/Context;I)V

    .line 124
    .line 125
    .line 126
    iget v6, p0, Lkk1;->c:I

    .line 127
    .line 128
    invoke-virtual {v3, v6, v5}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    goto/16 :goto_1

    .line 132
    .line 133
    :cond_0
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-eqz v5, :cond_f

    .line 138
    .line 139
    iget v5, p0, Lkk1;->c:I

    .line 140
    .line 141
    invoke-virtual {p1, p2, v5}, Llk1;->j(Landroid/content/Context;I)I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    iput v5, p0, Lkk1;->c:I

    .line 146
    .line 147
    goto/16 :goto_1

    .line 148
    .line 149
    :cond_1
    sget v7, Landroidx/constraintlayout/widget/R$styleable;->Transition_constraintSetStart:I

    .line 150
    .line 151
    if-ne v6, v7, :cond_3

    .line 152
    .line 153
    iget v5, p0, Lkk1;->d:I

    .line 154
    .line 155
    invoke-virtual {p3, v6, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    iput v5, p0, Lkk1;->d:I

    .line 160
    .line 161
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    iget v6, p0, Lkk1;->d:I

    .line 166
    .line 167
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    if-eqz v6, :cond_2

    .line 176
    .line 177
    new-instance v5, Landroidx/constraintlayout/widget/d;

    .line 178
    .line 179
    invoke-direct {v5}, Landroidx/constraintlayout/widget/d;-><init>()V

    .line 180
    .line 181
    .line 182
    iget v6, p0, Lkk1;->d:I

    .line 183
    .line 184
    invoke-virtual {v5, p2, v6}, Landroidx/constraintlayout/widget/d;->j(Landroid/content/Context;I)V

    .line 185
    .line 186
    .line 187
    iget v6, p0, Lkk1;->d:I

    .line 188
    .line 189
    invoke-virtual {v3, v6, v5}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_1

    .line 193
    .line 194
    :cond_2
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    if-eqz v5, :cond_f

    .line 199
    .line 200
    iget v5, p0, Lkk1;->d:I

    .line 201
    .line 202
    invoke-virtual {p1, p2, v5}, Llk1;->j(Landroid/content/Context;I)I

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    iput v5, p0, Lkk1;->d:I

    .line 207
    .line 208
    goto/16 :goto_1

    .line 209
    .line 210
    :cond_3
    sget v7, Landroidx/constraintlayout/widget/R$styleable;->Transition_motionInterpolator:I

    .line 211
    .line 212
    if-ne v6, v7, :cond_7

    .line 213
    .line 214
    invoke-virtual {p3, v6}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    iget v7, v7, Landroid/util/TypedValue;->type:I

    .line 219
    .line 220
    const/4 v8, -0x2

    .line 221
    if-ne v7, v5, :cond_4

    .line 222
    .line 223
    invoke-virtual {p3, v6, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    iput v5, p0, Lkk1;->g:I

    .line 228
    .line 229
    if-eq v5, v0, :cond_f

    .line 230
    .line 231
    iput v8, p0, Lkk1;->e:I

    .line 232
    .line 233
    goto/16 :goto_1

    .line 234
    .line 235
    :cond_4
    const/4 v5, 0x3

    .line 236
    if-ne v7, v5, :cond_6

    .line 237
    .line 238
    invoke-virtual {p3, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    iput-object v5, p0, Lkk1;->f:Ljava/lang/String;

    .line 243
    .line 244
    if-eqz v5, :cond_f

    .line 245
    .line 246
    const-string v7, "/"

    .line 247
    .line 248
    invoke-virtual {v5, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    if-lez v5, :cond_5

    .line 253
    .line 254
    invoke-virtual {p3, v6, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    iput v5, p0, Lkk1;->g:I

    .line 259
    .line 260
    iput v8, p0, Lkk1;->e:I

    .line 261
    .line 262
    goto/16 :goto_1

    .line 263
    .line 264
    :cond_5
    iput v0, p0, Lkk1;->e:I

    .line 265
    .line 266
    goto/16 :goto_1

    .line 267
    .line 268
    :cond_6
    iget v5, p0, Lkk1;->e:I

    .line 269
    .line 270
    invoke-virtual {p3, v6, v5}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 271
    .line 272
    .line 273
    move-result v5

    .line 274
    iput v5, p0, Lkk1;->e:I

    .line 275
    .line 276
    goto/16 :goto_1

    .line 277
    .line 278
    :cond_7
    sget v5, Landroidx/constraintlayout/widget/R$styleable;->Transition_duration:I

    .line 279
    .line 280
    if-ne v6, v5, :cond_8

    .line 281
    .line 282
    iget v5, p0, Lkk1;->h:I

    .line 283
    .line 284
    invoke-virtual {p3, v6, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 285
    .line 286
    .line 287
    move-result v5

    .line 288
    iput v5, p0, Lkk1;->h:I

    .line 289
    .line 290
    const/16 v6, 0x8

    .line 291
    .line 292
    if-ge v5, v6, :cond_f

    .line 293
    .line 294
    iput v6, p0, Lkk1;->h:I

    .line 295
    .line 296
    goto :goto_1

    .line 297
    :cond_8
    sget v5, Landroidx/constraintlayout/widget/R$styleable;->Transition_staggered:I

    .line 298
    .line 299
    if-ne v6, v5, :cond_9

    .line 300
    .line 301
    iget v5, p0, Lkk1;->i:F

    .line 302
    .line 303
    invoke-virtual {p3, v6, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 304
    .line 305
    .line 306
    move-result v5

    .line 307
    iput v5, p0, Lkk1;->i:F

    .line 308
    .line 309
    goto :goto_1

    .line 310
    :cond_9
    sget v5, Landroidx/constraintlayout/widget/R$styleable;->Transition_autoTransition:I

    .line 311
    .line 312
    if-ne v6, v5, :cond_a

    .line 313
    .line 314
    iget v5, p0, Lkk1;->n:I

    .line 315
    .line 316
    invoke-virtual {p3, v6, v5}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 317
    .line 318
    .line 319
    move-result v5

    .line 320
    iput v5, p0, Lkk1;->n:I

    .line 321
    .line 322
    goto :goto_1

    .line 323
    :cond_a
    sget v5, Landroidx/constraintlayout/widget/R$styleable;->Transition_android_id:I

    .line 324
    .line 325
    if-ne v6, v5, :cond_b

    .line 326
    .line 327
    iget v5, p0, Lkk1;->a:I

    .line 328
    .line 329
    invoke-virtual {p3, v6, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 330
    .line 331
    .line 332
    move-result v5

    .line 333
    iput v5, p0, Lkk1;->a:I

    .line 334
    .line 335
    goto :goto_1

    .line 336
    :cond_b
    sget v5, Landroidx/constraintlayout/widget/R$styleable;->Transition_transitionDisable:I

    .line 337
    .line 338
    if-ne v6, v5, :cond_c

    .line 339
    .line 340
    iget-boolean v5, p0, Lkk1;->o:Z

    .line 341
    .line 342
    invoke-virtual {p3, v6, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 343
    .line 344
    .line 345
    move-result v5

    .line 346
    iput-boolean v5, p0, Lkk1;->o:Z

    .line 347
    .line 348
    goto :goto_1

    .line 349
    :cond_c
    sget v5, Landroidx/constraintlayout/widget/R$styleable;->Transition_pathMotionArc:I

    .line 350
    .line 351
    if-ne v6, v5, :cond_d

    .line 352
    .line 353
    invoke-virtual {p3, v6, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 354
    .line 355
    .line 356
    move-result v5

    .line 357
    iput v5, p0, Lkk1;->p:I

    .line 358
    .line 359
    goto :goto_1

    .line 360
    :cond_d
    sget v5, Landroidx/constraintlayout/widget/R$styleable;->Transition_layoutDuringTransition:I

    .line 361
    .line 362
    if-ne v6, v5, :cond_e

    .line 363
    .line 364
    invoke-virtual {p3, v6, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 365
    .line 366
    .line 367
    move-result v5

    .line 368
    iput v5, p0, Lkk1;->q:I

    .line 369
    .line 370
    goto :goto_1

    .line 371
    :cond_e
    sget v5, Landroidx/constraintlayout/widget/R$styleable;->Transition_transitionFlags:I

    .line 372
    .line 373
    if-ne v6, v5, :cond_f

    .line 374
    .line 375
    invoke-virtual {p3, v6, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 376
    .line 377
    .line 378
    move-result v5

    .line 379
    iput v5, p0, Lkk1;->r:I

    .line 380
    .line 381
    :cond_f
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 382
    .line 383
    goto/16 :goto_0

    .line 384
    .line 385
    :cond_10
    iget p1, p0, Lkk1;->d:I

    .line 386
    .line 387
    if-ne p1, v0, :cond_11

    .line 388
    .line 389
    iput-boolean v5, p0, Lkk1;->b:Z

    .line 390
    .line 391
    :cond_11
    invoke-virtual {p3}, Landroid/content/res/TypedArray;->recycle()V

    .line 392
    .line 393
    .line 394
    return-void
.end method

.method public constructor <init>(Llk1;Lkk1;)V
    .locals 4

    .line 421
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 422
    iput v0, p0, Lkk1;->a:I

    const/4 v1, 0x0

    .line 423
    iput-boolean v1, p0, Lkk1;->b:Z

    .line 424
    iput v0, p0, Lkk1;->c:I

    .line 425
    iput v0, p0, Lkk1;->d:I

    .line 426
    iput v1, p0, Lkk1;->e:I

    const/4 v2, 0x0

    .line 427
    iput-object v2, p0, Lkk1;->f:Ljava/lang/String;

    .line 428
    iput v0, p0, Lkk1;->g:I

    const/16 v3, 0x190

    .line 429
    iput v3, p0, Lkk1;->h:I

    const/4 v3, 0x0

    .line 430
    iput v3, p0, Lkk1;->i:F

    .line 431
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lkk1;->k:Ljava/util/ArrayList;

    .line 432
    iput-object v2, p0, Lkk1;->l:Lmq2;

    .line 433
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lkk1;->m:Ljava/util/ArrayList;

    .line 434
    iput v1, p0, Lkk1;->n:I

    .line 435
    iput-boolean v1, p0, Lkk1;->o:Z

    .line 436
    iput v0, p0, Lkk1;->p:I

    .line 437
    iput v1, p0, Lkk1;->q:I

    .line 438
    iput v1, p0, Lkk1;->r:I

    .line 439
    iput-object p1, p0, Lkk1;->j:Llk1;

    .line 440
    iget p1, p1, Llk1;->j:I

    .line 441
    iput p1, p0, Lkk1;->h:I

    if-eqz p2, :cond_0

    .line 442
    iget p1, p2, Lkk1;->p:I

    iput p1, p0, Lkk1;->p:I

    .line 443
    iget p1, p2, Lkk1;->e:I

    iput p1, p0, Lkk1;->e:I

    .line 444
    iget-object p1, p2, Lkk1;->f:Ljava/lang/String;

    iput-object p1, p0, Lkk1;->f:Ljava/lang/String;

    .line 445
    iget p1, p2, Lkk1;->g:I

    iput p1, p0, Lkk1;->g:I

    .line 446
    iget p1, p2, Lkk1;->h:I

    iput p1, p0, Lkk1;->h:I

    .line 447
    iget-object p1, p2, Lkk1;->k:Ljava/util/ArrayList;

    iput-object p1, p0, Lkk1;->k:Ljava/util/ArrayList;

    .line 448
    iget p1, p2, Lkk1;->i:F

    iput p1, p0, Lkk1;->i:F

    .line 449
    iget p1, p2, Lkk1;->q:I

    iput p1, p0, Lkk1;->q:I

    :cond_0
    return-void
.end method

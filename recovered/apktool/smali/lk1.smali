.class public final Llk1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Landroidx/constraintlayout/motion/widget/MotionLayout;

.field public final b:Ln7;

.field public c:Lkk1;

.field public final d:Ljava/util/ArrayList;

.field public final e:Lkk1;

.field public final f:Ljava/util/ArrayList;

.field public final g:Landroid/util/SparseArray;

.field public final h:Ljava/util/HashMap;

.field public final i:Landroid/util/SparseIntArray;

.field public j:I

.field public k:I

.field public l:Landroid/view/MotionEvent;

.field public m:Z

.field public n:Z

.field public o:Lgr0;

.field public p:Z

.field public final q:Lb5;

.field public r:F

.field public s:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/constraintlayout/motion/widget/MotionLayout;I)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Llk1;->b:Ln7;

    .line 6
    .line 7
    iput-object v0, p0, Llk1;->c:Lkk1;

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Llk1;->d:Ljava/util/ArrayList;

    .line 15
    .line 16
    iput-object v0, p0, Llk1;->e:Lkk1;

    .line 17
    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v2, p0, Llk1;->f:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance v2, Landroid/util/SparseArray;

    .line 26
    .line 27
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v2, p0, Llk1;->g:Landroid/util/SparseArray;

    .line 31
    .line 32
    new-instance v2, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v2, p0, Llk1;->h:Ljava/util/HashMap;

    .line 38
    .line 39
    new-instance v2, Landroid/util/SparseIntArray;

    .line 40
    .line 41
    invoke-direct {v2}, Landroid/util/SparseIntArray;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v2, p0, Llk1;->i:Landroid/util/SparseIntArray;

    .line 45
    .line 46
    const/16 v2, 0x190

    .line 47
    .line 48
    iput v2, p0, Llk1;->j:I

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    iput v2, p0, Llk1;->k:I

    .line 52
    .line 53
    iput-boolean v2, p0, Llk1;->m:Z

    .line 54
    .line 55
    iput-boolean v2, p0, Llk1;->n:Z

    .line 56
    .line 57
    iput-object p2, p0, Llk1;->a:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 58
    .line 59
    new-instance v2, Lb5;

    .line 60
    .line 61
    invoke-direct {v2, p2}, Lb5;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 62
    .line 63
    .line 64
    iput-object v2, p0, Llk1;->q:Lb5;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    :try_start_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    move-object v3, v0

    .line 79
    :goto_0
    const/4 v4, 0x1

    .line 80
    if-eq v2, v4, :cond_7

    .line 81
    .line 82
    if-eqz v2, :cond_5

    .line 83
    .line 84
    const/4 v4, 0x2

    .line 85
    if-eq v2, v4, :cond_0

    .line 86
    .line 87
    goto/16 :goto_3

    .line 88
    .line 89
    :cond_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    sparse-switch v4, :sswitch_data_0

    .line 98
    .line 99
    .line 100
    goto/16 :goto_3

    .line 101
    .line 102
    :sswitch_0
    const-string v4, "include"

    .line 103
    .line 104
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_6

    .line 109
    .line 110
    goto/16 :goto_2

    .line 111
    .line 112
    :catch_0
    move-exception p1

    .line 113
    goto/16 :goto_4

    .line 114
    .line 115
    :catch_1
    move-exception p1

    .line 116
    goto/16 :goto_5

    .line 117
    .line 118
    :sswitch_1
    const-string v4, "StateSet"

    .line 119
    .line 120
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_6

    .line 125
    .line 126
    new-instance v2, Ln7;

    .line 127
    .line 128
    invoke-direct {v2, p1, p2}, Ln7;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 129
    .line 130
    .line 131
    iput-object v2, p0, Llk1;->b:Ln7;

    .line 132
    .line 133
    goto/16 :goto_3

    .line 134
    .line 135
    :sswitch_2
    const-string v4, "MotionScene"

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_6

    .line 142
    .line 143
    invoke-virtual {p0, p1, p2}, Llk1;->l(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 144
    .line 145
    .line 146
    goto/16 :goto_3

    .line 147
    .line 148
    :sswitch_3
    const-string v4, "OnSwipe"

    .line 149
    .line 150
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-eqz v2, :cond_6

    .line 155
    .line 156
    if-nez v3, :cond_1

    .line 157
    .line 158
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v2, p3}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    .line 166
    .line 167
    .line 168
    :cond_1
    if-eqz v3, :cond_6

    .line 169
    .line 170
    new-instance v2, Lmq2;

    .line 171
    .line 172
    iget-object v4, p0, Llk1;->a:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 173
    .line 174
    invoke-direct {v2, p1, v4, p2}, Lmq2;-><init>(Landroid/content/Context;Landroidx/constraintlayout/motion/widget/MotionLayout;Landroid/content/res/XmlResourceParser;)V

    .line 175
    .line 176
    .line 177
    iput-object v2, v3, Lkk1;->l:Lmq2;

    .line 178
    .line 179
    goto/16 :goto_3

    .line 180
    .line 181
    :sswitch_4
    const-string v4, "OnClick"

    .line 182
    .line 183
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-eqz v2, :cond_6

    .line 188
    .line 189
    if-eqz v3, :cond_6

    .line 190
    .line 191
    iget-object v2, v3, Lkk1;->m:Ljava/util/ArrayList;

    .line 192
    .line 193
    new-instance v4, Ljk1;

    .line 194
    .line 195
    invoke-direct {v4, p1, v3, p2}, Ljk1;-><init>(Landroid/content/Context;Lkk1;Landroid/content/res/XmlResourceParser;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    goto/16 :goto_3

    .line 202
    .line 203
    :sswitch_5
    const-string v4, "Transition"

    .line 204
    .line 205
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    if-eqz v2, :cond_6

    .line 210
    .line 211
    new-instance v3, Lkk1;

    .line 212
    .line 213
    invoke-direct {v3, p0, p1, p2}, Lkk1;-><init>(Llk1;Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 214
    .line 215
    .line 216
    iget-boolean v2, v3, Lkk1;->b:Z

    .line 217
    .line 218
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    iget-object v4, p0, Llk1;->c:Lkk1;

    .line 222
    .line 223
    if-nez v4, :cond_2

    .line 224
    .line 225
    if-nez v2, :cond_2

    .line 226
    .line 227
    iput-object v3, p0, Llk1;->c:Lkk1;

    .line 228
    .line 229
    iget-object v4, v3, Lkk1;->l:Lmq2;

    .line 230
    .line 231
    if-eqz v4, :cond_2

    .line 232
    .line 233
    iget-boolean v5, p0, Llk1;->p:Z

    .line 234
    .line 235
    invoke-virtual {v4, v5}, Lmq2;->c(Z)V

    .line 236
    .line 237
    .line 238
    :cond_2
    if-eqz v2, :cond_6

    .line 239
    .line 240
    iget v2, v3, Lkk1;->c:I

    .line 241
    .line 242
    const/4 v4, -0x1

    .line 243
    if-ne v2, v4, :cond_3

    .line 244
    .line 245
    iput-object v3, p0, Llk1;->e:Lkk1;

    .line 246
    .line 247
    goto :goto_1

    .line 248
    :cond_3
    iget-object v2, p0, Llk1;->f:Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    :goto_1
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    goto/16 :goto_3

    .line 257
    .line 258
    :sswitch_6
    const-string v4, "ViewTransition"

    .line 259
    .line 260
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    if-eqz v2, :cond_6

    .line 265
    .line 266
    new-instance v2, Le53;

    .line 267
    .line 268
    invoke-direct {v2, p1, p2}, Le53;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 269
    .line 270
    .line 271
    iget-object v4, p0, Llk1;->q:Lb5;

    .line 272
    .line 273
    iget-object v5, v4, Lb5;->c:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v5, Ljava/util/ArrayList;

    .line 276
    .line 277
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    iput-object v0, v4, Lb5;->d:Ljava/lang/Object;

    .line 281
    .line 282
    iget v4, v2, Le53;->b:I

    .line 283
    .line 284
    const/4 v5, 0x4

    .line 285
    if-ne v4, v5, :cond_4

    .line 286
    .line 287
    invoke-static {}, Landroidx/constraintlayout/widget/ConstraintLayout;->getSharedValues()Lqd2;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    iget v2, v2, Le53;->u:I

    .line 292
    .line 293
    new-instance v5, Lf53;

    .line 294
    .line 295
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v4, v2, v5}, Lqd2;->a(ILpd2;)V

    .line 299
    .line 300
    .line 301
    goto :goto_3

    .line 302
    :cond_4
    const/4 v5, 0x5

    .line 303
    if-ne v4, v5, :cond_6

    .line 304
    .line 305
    invoke-static {}, Landroidx/constraintlayout/widget/ConstraintLayout;->getSharedValues()Lqd2;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    iget v2, v2, Le53;->u:I

    .line 310
    .line 311
    new-instance v5, Lf53;

    .line 312
    .line 313
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v4, v2, v5}, Lqd2;->a(ILpd2;)V

    .line 317
    .line 318
    .line 319
    goto :goto_3

    .line 320
    :sswitch_7
    const-string v4, "Include"

    .line 321
    .line 322
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    if-eqz v2, :cond_6

    .line 327
    .line 328
    :goto_2
    invoke-virtual {p0, p1, p2}, Llk1;->k(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 329
    .line 330
    .line 331
    goto :goto_3

    .line 332
    :sswitch_8
    const-string v4, "KeyFrameSet"

    .line 333
    .line 334
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    if-eqz v2, :cond_6

    .line 339
    .line 340
    new-instance v2, Lm31;

    .line 341
    .line 342
    invoke-direct {v2, p1, p2}, Lm31;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 343
    .line 344
    .line 345
    if-eqz v3, :cond_6

    .line 346
    .line 347
    iget-object v4, v3, Lkk1;->k:Ljava/util/ArrayList;

    .line 348
    .line 349
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    goto :goto_3

    .line 353
    :sswitch_9
    const-string v4, "ConstraintSet"

    .line 354
    .line 355
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    if-eqz v2, :cond_6

    .line 360
    .line 361
    invoke-virtual {p0, p1, p2}, Llk1;->i(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)I

    .line 362
    .line 363
    .line 364
    goto :goto_3

    .line 365
    :cond_5
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    :cond_6
    :goto_3
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 369
    .line 370
    .line 371
    move-result v2
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 372
    goto/16 :goto_0

    .line 373
    .line 374
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 375
    .line 376
    .line 377
    goto :goto_6

    .line 378
    :goto_5
    invoke-virtual {p1}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    .line 379
    .line 380
    .line 381
    :cond_7
    :goto_6
    iget-object p1, p0, Llk1;->g:Landroid/util/SparseArray;

    .line 382
    .line 383
    sget p2, Landroidx/constraintlayout/widget/R$id;->motion_base:I

    .line 384
    .line 385
    new-instance p3, Landroidx/constraintlayout/widget/d;

    .line 386
    .line 387
    invoke-direct {p3}, Landroidx/constraintlayout/widget/d;-><init>()V

    .line 388
    .line 389
    .line 390
    invoke-virtual {p1, p2, p3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    iget-object p0, p0, Llk1;->h:Ljava/util/HashMap;

    .line 394
    .line 395
    sget p1, Landroidx/constraintlayout/widget/R$id;->motion_base:I

    .line 396
    .line 397
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    const-string p2, "motion_base"

    .line 402
    .line 403
    invoke-virtual {p0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    return-void

    .line 407
    :sswitch_data_0
    .sparse-switch
        -0x50764adb -> :sswitch_9
        -0x49df9cec -> :sswitch_8
        -0x28fe1378 -> :sswitch_7
        0x3b205fa -> :sswitch_6
        0x100d4975 -> :sswitch_5
        0x12a432c9 -> :sswitch_4
        0x138aac7b -> :sswitch_3
        0x2f487256 -> :sswitch_2
        0x526c4e31 -> :sswitch_1
        0x73c954a8 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final a(ILandroidx/constraintlayout/motion/widget/MotionLayout;)Z
    .locals 9

    .line 1
    iget-object v0, p0, Llk1;->o:Lgr0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_1

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Llk1;->d:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_9

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lkk1;

    .line 24
    .line 25
    iget v2, v1, Lkk1;->n:I

    .line 26
    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    iget-object v3, p0, Llk1;->c:Lkk1;

    .line 31
    .line 32
    const/4 v4, 0x2

    .line 33
    if-ne v3, v1, :cond_3

    .line 34
    .line 35
    iget v3, v3, Lkk1;->r:I

    .line 36
    .line 37
    and-int/2addr v3, v4

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    iget v3, v1, Lkk1;->d:I

    .line 42
    .line 43
    sget-object v5, Lhk1;->d:Lhk1;

    .line 44
    .line 45
    sget-object v6, Lhk1;->c:Lhk1;

    .line 46
    .line 47
    sget-object v7, Lhk1;->b:Lhk1;

    .line 48
    .line 49
    const/4 v8, 0x1

    .line 50
    if-ne p1, v3, :cond_6

    .line 51
    .line 52
    const/4 v3, 0x4

    .line 53
    if-eq v2, v3, :cond_4

    .line 54
    .line 55
    if-ne v2, v4, :cond_6

    .line 56
    .line 57
    :cond_4
    invoke-virtual {p2, v5}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setTransition(Lkk1;)V

    .line 61
    .line 62
    .line 63
    iget p0, v1, Lkk1;->n:I

    .line 64
    .line 65
    const/high16 p1, 0x3f800000    # 1.0f

    .line 66
    .line 67
    if-ne p0, v3, :cond_5

    .line 68
    .line 69
    invoke-virtual {p2, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->k(F)V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x0

    .line 73
    iput-object p0, p2, Landroidx/constraintlayout/motion/widget/MotionLayout;->i1:Lji1;

    .line 74
    .line 75
    invoke-virtual {p2, v7}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 79
    .line 80
    .line 81
    return v8

    .line 82
    :cond_5
    invoke-virtual {p2, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v8}, Landroidx/constraintlayout/motion/widget/MotionLayout;->m(Z)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2, v7}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v5}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->t()V

    .line 98
    .line 99
    .line 100
    return v8

    .line 101
    :cond_6
    iget v3, v1, Lkk1;->c:I

    .line 102
    .line 103
    if-ne p1, v3, :cond_1

    .line 104
    .line 105
    const/4 v3, 0x3

    .line 106
    if-eq v2, v3, :cond_7

    .line 107
    .line 108
    if-ne v2, v8, :cond_1

    .line 109
    .line 110
    :cond_7
    invoke-virtual {p2, v5}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setTransition(Lkk1;)V

    .line 114
    .line 115
    .line 116
    iget p0, v1, Lkk1;->n:I

    .line 117
    .line 118
    const/4 p1, 0x0

    .line 119
    if-ne p0, v3, :cond_8

    .line 120
    .line 121
    invoke-virtual {p2, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->k(F)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, v7}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2, v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 128
    .line 129
    .line 130
    return v8

    .line 131
    :cond_8
    invoke-virtual {p2, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, v8}, Landroidx/constraintlayout/motion/widget/MotionLayout;->m(Z)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2, v7}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2, v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p2, v5}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->t()V

    .line 147
    .line 148
    .line 149
    return v8

    .line 150
    :cond_9
    :goto_1
    const/4 p0, 0x0

    .line 151
    return p0
.end method

.method public final b(I)Landroidx/constraintlayout/widget/d;
    .locals 3

    .line 1
    iget-object v0, p0, Llk1;->b:Ln7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ln7;->o(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    move p1, v0

    .line 13
    :cond_0
    iget-object v0, p0, Llk1;->g:Landroid/util/SparseArray;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "Warning could not find ConstraintSet id/"

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Llk1;->a:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0, p1}, Lde3;->u(Landroid/content/Context;I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p0, " In MotionScene"

    .line 42
    .line 43
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string p1, "MotionScene"

    .line 51
    .line 52
    invoke-static {p1, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->keyAt(I)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, Landroidx/constraintlayout/widget/d;

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_1
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, Landroidx/constraintlayout/widget/d;

    .line 72
    .line 73
    return-object p0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget-object v0, p0, Llk1;->c:Lkk1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p0, v0, Lkk1;->h:I

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    iget p0, p0, Llk1;->j:I

    .line 9
    .line 10
    return p0
.end method

.method public final d(Landroid/content/Context;Ljava/lang/String;)I
    .locals 4

    .line 1
    const-string p0, "/"

    .line 2
    .line 3
    invoke-virtual {p2, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, -0x1

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/16 p0, 0x2f

    .line 12
    .line 13
    invoke-virtual {p2, p0}, Ljava/lang/String;->indexOf(I)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    invoke-virtual {p2, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "id"

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v2, p0, v3, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move p0, v1

    .line 38
    :goto_0
    if-ne p0, v1, :cond_2

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-le p1, v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0

    .line 55
    :cond_1
    const-string p1, "MotionScene"

    .line 56
    .line 57
    const-string p2, "error in parsing id"

    .line 58
    .line 59
    invoke-static {p1, p2}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    :cond_2
    return p0
.end method

.method public final e()Landroid/view/animation/Interpolator;
    .locals 3

    .line 1
    iget-object v0, p0, Llk1;->c:Lkk1;

    .line 2
    .line 3
    iget v1, v0, Lkk1;->e:I

    .line 4
    .line 5
    const/4 v2, -0x2

    .line 6
    if-eq v1, v2, :cond_7

    .line 7
    .line 8
    const/4 p0, -0x1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eq v1, p0, :cond_6

    .line 11
    .line 12
    if-eqz v1, :cond_5

    .line 13
    .line 14
    if-eq v1, v2, :cond_4

    .line 15
    .line 16
    const/4 p0, 0x2

    .line 17
    if-eq v1, p0, :cond_3

    .line 18
    .line 19
    const/4 p0, 0x4

    .line 20
    if-eq v1, p0, :cond_2

    .line 21
    .line 22
    const/4 p0, 0x5

    .line 23
    if-eq v1, p0, :cond_1

    .line 24
    .line 25
    const/4 p0, 0x6

    .line 26
    if-eq v1, p0, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0

    .line 30
    :cond_0
    new-instance p0, Landroid/view/animation/AnticipateInterpolator;

    .line 31
    .line 32
    invoke-direct {p0}, Landroid/view/animation/AnticipateInterpolator;-><init>()V

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    new-instance p0, Landroid/view/animation/OvershootInterpolator;

    .line 37
    .line 38
    invoke-direct {p0}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_2
    new-instance p0, Landroid/view/animation/BounceInterpolator;

    .line 43
    .line 44
    invoke-direct {p0}, Landroid/view/animation/BounceInterpolator;-><init>()V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_3
    new-instance p0, Landroid/view/animation/DecelerateInterpolator;

    .line 49
    .line 50
    invoke-direct {p0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 51
    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_4
    new-instance p0, Landroid/view/animation/AccelerateInterpolator;

    .line 55
    .line 56
    invoke-direct {p0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 57
    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_5
    new-instance p0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 61
    .line 62
    invoke-direct {p0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 63
    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_6
    iget-object p0, v0, Lkk1;->f:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {p0}, Lr4;->c(Ljava/lang/String;)Lr4;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    new-instance v0, Lyj1;

    .line 73
    .line 74
    invoke-direct {v0, p0, v2}, Lyj1;-><init>(Lr4;I)V

    .line 75
    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_7
    iget-object v0, p0, Llk1;->a:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object p0, p0, Llk1;->c:Lkk1;

    .line 85
    .line 86
    iget p0, p0, Lkk1;->g:I

    .line 87
    .line 88
    invoke-static {v0, p0}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0
.end method

.method public final f(Lzj1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Llk1;->c:Lkk1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Llk1;->e:Lkk1;

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Lkk1;->k:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lm31;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lm31;->a(Lzj1;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object p0, v0, Lkk1;->k:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lm31;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lm31;->a(Lzj1;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    return-void
.end method

.method public final g()F
    .locals 0

    .line 1
    iget-object p0, p0, Llk1;->c:Lkk1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lkk1;->l:Lmq2;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget p0, p0, Lmq2;->t:F

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public final h()I
    .locals 0

    .line 1
    iget-object p0, p0, Llk1;->c:Lkk1;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    iget p0, p0, Lkk1;->d:I

    .line 8
    .line 9
    return p0
.end method

.method public final i(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)I
    .locals 13

    .line 1
    new-instance v0, Landroidx/constraintlayout/widget/d;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/constraintlayout/widget/d;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-boolean v1, v0, Landroidx/constraintlayout/widget/d;->e:Z

    .line 8
    .line 9
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, -0x1

    .line 14
    move v4, v1

    .line 15
    move v5, v3

    .line 16
    move v6, v5

    .line 17
    :goto_0
    if-ge v4, v2, :cond_9

    .line 18
    .line 19
    invoke-interface {p2, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-interface {p2, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v9

    .line 34
    const/4 v10, 0x2

    .line 35
    const/4 v11, 0x1

    .line 36
    sparse-switch v9, :sswitch_data_0

    .line 37
    .line 38
    .line 39
    :goto_1
    move v7, v3

    .line 40
    goto :goto_2

    .line 41
    :sswitch_0
    const-string v9, "id"

    .line 42
    .line 43
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-nez v7, :cond_0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    move v7, v10

    .line 51
    goto :goto_2

    .line 52
    :sswitch_1
    const-string v9, "constraintRotate"

    .line 53
    .line 54
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-nez v7, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move v7, v11

    .line 62
    goto :goto_2

    .line 63
    :sswitch_2
    const-string v9, "deriveConstraintsFrom"

    .line 64
    .line 65
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-nez v7, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    move v7, v1

    .line 73
    :goto_2
    packed-switch v7, :pswitch_data_0

    .line 74
    .line 75
    .line 76
    goto/16 :goto_6

    .line 77
    .line 78
    :pswitch_0
    invoke-virtual {p0, p1, v8}, Llk1;->d(Landroid/content/Context;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    const/16 v7, 0x2f

    .line 83
    .line 84
    invoke-virtual {v8, v7}, Ljava/lang/String;->indexOf(I)I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-gez v7, :cond_3

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 92
    .line 93
    invoke-virtual {v8, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    :goto_3
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    iget-object v9, p0, Llk1;->h:Ljava/util/HashMap;

    .line 102
    .line 103
    invoke-virtual {v9, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    invoke-static {p1, v5}, Lde3;->u(Landroid/content/Context;I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    iput-object v7, v0, Landroidx/constraintlayout/widget/d;->a:Ljava/lang/String;

    .line 111
    .line 112
    goto/16 :goto_6

    .line 113
    .line 114
    :pswitch_1
    :try_start_0
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    iput v7, v0, Landroidx/constraintlayout/widget/d;->c:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    .line 120
    goto/16 :goto_6

    .line 121
    .line 122
    :catch_0
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    const/4 v9, 0x4

    .line 130
    const/4 v12, 0x3

    .line 131
    sparse-switch v7, :sswitch_data_1

    .line 132
    .line 133
    .line 134
    :goto_4
    move v7, v3

    .line 135
    goto :goto_5

    .line 136
    :sswitch_3
    const-string v7, "x_right"

    .line 137
    .line 138
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    if-nez v7, :cond_4

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_4
    move v7, v9

    .line 146
    goto :goto_5

    .line 147
    :sswitch_4
    const-string v7, "right"

    .line 148
    .line 149
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    if-nez v7, :cond_5

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_5
    move v7, v12

    .line 157
    goto :goto_5

    .line 158
    :sswitch_5
    const-string v7, "none"

    .line 159
    .line 160
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    if-nez v7, :cond_6

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_6
    move v7, v10

    .line 168
    goto :goto_5

    .line 169
    :sswitch_6
    const-string v7, "left"

    .line 170
    .line 171
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    if-nez v7, :cond_7

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_7
    move v7, v11

    .line 179
    goto :goto_5

    .line 180
    :sswitch_7
    const-string v7, "x_left"

    .line 181
    .line 182
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v7

    .line 186
    if-nez v7, :cond_8

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_8
    move v7, v1

    .line 190
    :goto_5
    packed-switch v7, :pswitch_data_1

    .line 191
    .line 192
    .line 193
    goto :goto_6

    .line 194
    :pswitch_2
    iput v12, v0, Landroidx/constraintlayout/widget/d;->c:I

    .line 195
    .line 196
    goto :goto_6

    .line 197
    :pswitch_3
    iput v11, v0, Landroidx/constraintlayout/widget/d;->c:I

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :pswitch_4
    iput v1, v0, Landroidx/constraintlayout/widget/d;->c:I

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :pswitch_5
    iput v10, v0, Landroidx/constraintlayout/widget/d;->c:I

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :pswitch_6
    iput v9, v0, Landroidx/constraintlayout/widget/d;->c:I

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :pswitch_7
    invoke-virtual {p0, p1, v8}, Llk1;->d(Landroid/content/Context;Ljava/lang/String;)I

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    :goto_6
    add-int/lit8 v4, v4, 0x1

    .line 214
    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :cond_9
    if-eq v5, v3, :cond_b

    .line 218
    .line 219
    iget-object v1, p0, Llk1;->a:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 220
    .line 221
    iget v1, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->A0:I

    .line 222
    .line 223
    invoke-virtual {v0, p1, p2}, Landroidx/constraintlayout/widget/d;->k(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    .line 224
    .line 225
    .line 226
    if-eq v6, v3, :cond_a

    .line 227
    .line 228
    iget-object p1, p0, Llk1;->i:Landroid/util/SparseIntArray;

    .line 229
    .line 230
    invoke-virtual {p1, v5, v6}, Landroid/util/SparseIntArray;->put(II)V

    .line 231
    .line 232
    .line 233
    :cond_a
    iget-object p0, p0, Llk1;->g:Landroid/util/SparseArray;

    .line 234
    .line 235
    invoke-virtual {p0, v5, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    :cond_b
    return v5

    .line 239
    :sswitch_data_0
    .sparse-switch
        -0x59328327 -> :sswitch_2
        -0x44bbba68 -> :sswitch_1
        0xd1b -> :sswitch_0
    .end sparse-switch

    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    :sswitch_data_1
    .sparse-switch
        -0x2dcd1c92 -> :sswitch_7
        0x32a007 -> :sswitch_6
        0x33af38 -> :sswitch_5
        0x677c21c -> :sswitch_4
        0x747feb95 -> :sswitch_3
    .end sparse-switch

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public final j(Landroid/content/Context;I)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :try_start_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :goto_0
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x2

    .line 21
    if-ne v2, v0, :cond_0

    .line 22
    .line 23
    const-string v0, "ConstraintSet"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0, p1, p2}, Llk1;->i(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :cond_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 37
    .line 38
    .line 39
    move-result v0
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catch_1
    move-exception p0

    .line 47
    invoke-virtual {p0}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_1
    const/4 p0, -0x1

    .line 51
    return p0
.end method

.method public final k(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 4

    .line 1
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    sget-object v0, Landroidx/constraintlayout/widget/R$styleable;->include:[I

    .line 6
    .line 7
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->include_constraintSet:I

    .line 23
    .line 24
    if-ne v2, v3, :cond_0

    .line 25
    .line 26
    const/4 v3, -0x1

    .line 27
    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {p0, p1, v2}, Llk1;->j(Landroid/content/Context;I)I

    .line 32
    .line 33
    .line 34
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final l(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 4

    .line 1
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    sget-object v0, Landroidx/constraintlayout/widget/R$styleable;->MotionScene:[I

    .line 6
    .line 7
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    const/4 v0, 0x0

    .line 16
    move v1, v0

    .line 17
    :goto_0
    if-ge v1, p2, :cond_2

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionScene_defaultDuration:I

    .line 24
    .line 25
    if-ne v2, v3, :cond_0

    .line 26
    .line 27
    iget v3, p0, Llk1;->j:I

    .line 28
    .line 29
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iput v2, p0, Llk1;->j:I

    .line 34
    .line 35
    const/16 v3, 0x8

    .line 36
    .line 37
    if-ge v2, v3, :cond_1

    .line 38
    .line 39
    iput v3, p0, Llk1;->j:I

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionScene_layoutDuringTransition:I

    .line 43
    .line 44
    if-ne v2, v3, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    iput v2, p0, Llk1;->k:I

    .line 51
    .line 52
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final m(ILandroidx/constraintlayout/motion/widget/MotionLayout;)V
    .locals 11

    .line 1
    iget-object v0, p0, Llk1;->g:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Landroidx/constraintlayout/widget/d;

    .line 8
    .line 9
    iget-object v2, v1, Landroidx/constraintlayout/widget/d;->a:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, v1, Landroidx/constraintlayout/widget/d;->f:Ljava/util/HashMap;

    .line 12
    .line 13
    iput-object v2, v1, Landroidx/constraintlayout/widget/d;->b:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v2, p0, Llk1;->i:Landroid/util/SparseIntArray;

    .line 16
    .line 17
    invoke-virtual {v2, p1}, Landroid/util/SparseIntArray;->get(I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-lez p1, :cond_9

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Llk1;->m(ILandroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Landroidx/constraintlayout/widget/d;

    .line 31
    .line 32
    if-nez p2, :cond_0

    .line 33
    .line 34
    new-instance p2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v0, "ERROR! invalid deriveConstraintsFrom: @id/"

    .line 37
    .line 38
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Llk1;->a:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0, p1}, Lde3;->u(Landroid/content/Context;I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string p1, "MotionScene"

    .line 59
    .line 60
    invoke-static {p1, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_0
    iget-object p0, p2, Landroidx/constraintlayout/widget/d;->f:Ljava/util/HashMap;

    .line 65
    .line 66
    new-instance p1, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    iget-object v0, v1, Landroidx/constraintlayout/widget/d;->b:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, "/"

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    iget-object p2, p2, Landroidx/constraintlayout/widget/d;->b:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p1, v1, Landroidx/constraintlayout/widget/d;->b:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    if-eqz p2, :cond_14

    .line 105
    .line 106
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    check-cast p2, Ljava/lang/Integer;

    .line 111
    .line 112
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Landroidx/constraintlayout/widget/c;

    .line 120
    .line 121
    invoke-virtual {v3, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-nez v2, :cond_2

    .line 126
    .line 127
    new-instance v2, Landroidx/constraintlayout/widget/c;

    .line 128
    .line 129
    invoke-direct {v2}, Landroidx/constraintlayout/widget/c;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, p2, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    :cond_2
    invoke-virtual {v3, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    check-cast p2, Landroidx/constraintlayout/widget/c;

    .line 140
    .line 141
    if-nez p2, :cond_3

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_3
    iget-object v2, p2, Landroidx/constraintlayout/widget/c;->e:Luz;

    .line 145
    .line 146
    iget-boolean v4, v2, Luz;->b:Z

    .line 147
    .line 148
    if-nez v4, :cond_4

    .line 149
    .line 150
    iget-object v4, v0, Landroidx/constraintlayout/widget/c;->e:Luz;

    .line 151
    .line 152
    invoke-virtual {v2, v4}, Luz;->a(Luz;)V

    .line 153
    .line 154
    .line 155
    :cond_4
    iget-object v2, p2, Landroidx/constraintlayout/widget/c;->c:Lwz;

    .line 156
    .line 157
    iget-boolean v4, v2, Lwz;->a:Z

    .line 158
    .line 159
    if-nez v4, :cond_5

    .line 160
    .line 161
    iget-object v4, v0, Landroidx/constraintlayout/widget/c;->c:Lwz;

    .line 162
    .line 163
    iget-boolean v5, v4, Lwz;->a:Z

    .line 164
    .line 165
    iput-boolean v5, v2, Lwz;->a:Z

    .line 166
    .line 167
    iget v5, v4, Lwz;->b:I

    .line 168
    .line 169
    iput v5, v2, Lwz;->b:I

    .line 170
    .line 171
    iget v5, v4, Lwz;->d:F

    .line 172
    .line 173
    iput v5, v2, Lwz;->d:F

    .line 174
    .line 175
    iget v5, v4, Lwz;->e:F

    .line 176
    .line 177
    iput v5, v2, Lwz;->e:F

    .line 178
    .line 179
    iget v4, v4, Lwz;->c:I

    .line 180
    .line 181
    iput v4, v2, Lwz;->c:I

    .line 182
    .line 183
    :cond_5
    iget-object v2, p2, Landroidx/constraintlayout/widget/c;->f:Lxz;

    .line 184
    .line 185
    iget-boolean v4, v2, Lxz;->a:Z

    .line 186
    .line 187
    if-nez v4, :cond_6

    .line 188
    .line 189
    iget-object v4, v0, Landroidx/constraintlayout/widget/c;->f:Lxz;

    .line 190
    .line 191
    invoke-virtual {v2, v4}, Lxz;->a(Lxz;)V

    .line 192
    .line 193
    .line 194
    :cond_6
    iget-object v2, p2, Landroidx/constraintlayout/widget/c;->d:Lvz;

    .line 195
    .line 196
    iget-boolean v4, v2, Lvz;->a:Z

    .line 197
    .line 198
    if-nez v4, :cond_7

    .line 199
    .line 200
    iget-object v4, v0, Landroidx/constraintlayout/widget/c;->d:Lvz;

    .line 201
    .line 202
    invoke-virtual {v2, v4}, Lvz;->a(Lvz;)V

    .line 203
    .line 204
    .line 205
    :cond_7
    iget-object v2, v0, Landroidx/constraintlayout/widget/c;->g:Ljava/util/HashMap;

    .line 206
    .line 207
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    :cond_8
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    if-eqz v4, :cond_1

    .line 220
    .line 221
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    check-cast v4, Ljava/lang/String;

    .line 226
    .line 227
    iget-object v5, p2, Landroidx/constraintlayout/widget/c;->g:Ljava/util/HashMap;

    .line 228
    .line 229
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-nez v5, :cond_8

    .line 234
    .line 235
    iget-object v5, p2, Landroidx/constraintlayout/widget/c;->g:Ljava/util/HashMap;

    .line 236
    .line 237
    iget-object v6, v0, Landroidx/constraintlayout/widget/c;->g:Ljava/util/HashMap;

    .line 238
    .line 239
    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    check-cast v6, Lpz;

    .line 244
    .line 245
    invoke-virtual {v5, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    goto :goto_1

    .line 249
    :cond_9
    new-instance p0, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 252
    .line 253
    .line 254
    iget-object p1, v1, Landroidx/constraintlayout/widget/d;->b:Ljava/lang/String;

    .line 255
    .line 256
    const-string v0, "  layout"

    .line 257
    .line 258
    invoke-static {p0, p1, v0}, Lfm0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    iput-object p0, v1, Landroidx/constraintlayout/widget/d;->b:Ljava/lang/String;

    .line 263
    .line 264
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 265
    .line 266
    .line 267
    move-result p0

    .line 268
    const/4 p1, 0x0

    .line 269
    :goto_2
    if-ge p1, p0, :cond_14

    .line 270
    .line 271
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 280
    .line 281
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    iget-boolean v5, v1, Landroidx/constraintlayout/widget/d;->e:Z

    .line 286
    .line 287
    if-eqz v5, :cond_b

    .line 288
    .line 289
    const/4 v5, -0x1

    .line 290
    if-eq v4, v5, :cond_a

    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_a
    const-string p0, "All children of ConstraintLayout must have ids to use ConstraintSet"

    .line 294
    .line 295
    invoke-static {p0}, Lf42;->s(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    return-void

    .line 299
    :cond_b
    :goto_3
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v5

    .line 307
    if-nez v5, :cond_c

    .line 308
    .line 309
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    new-instance v6, Landroidx/constraintlayout/widget/c;

    .line 314
    .line 315
    invoke-direct {v6}, Landroidx/constraintlayout/widget/c;-><init>()V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    :cond_c
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 322
    .line 323
    .line 324
    move-result-object v5

    .line 325
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    check-cast v5, Landroidx/constraintlayout/widget/c;

    .line 330
    .line 331
    if-nez v5, :cond_d

    .line 332
    .line 333
    goto/16 :goto_4

    .line 334
    .line 335
    :cond_d
    iget-object v6, v5, Landroidx/constraintlayout/widget/c;->c:Lwz;

    .line 336
    .line 337
    iget-object v7, v5, Landroidx/constraintlayout/widget/c;->e:Luz;

    .line 338
    .line 339
    iget-object v8, v5, Landroidx/constraintlayout/widget/c;->f:Lxz;

    .line 340
    .line 341
    iget-boolean v9, v7, Luz;->b:Z

    .line 342
    .line 343
    const/4 v10, 0x1

    .line 344
    if-nez v9, :cond_f

    .line 345
    .line 346
    invoke-virtual {v5, v4, v2}, Landroidx/constraintlayout/widget/c;->c(ILandroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;)V

    .line 347
    .line 348
    .line 349
    instance-of v2, v0, Landroidx/constraintlayout/widget/ConstraintHelper;

    .line 350
    .line 351
    if-eqz v2, :cond_e

    .line 352
    .line 353
    move-object v2, v0

    .line 354
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintHelper;

    .line 355
    .line 356
    invoke-virtual {v2}, Landroidx/constraintlayout/widget/ConstraintHelper;->getReferencedIds()[I

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    iput-object v2, v7, Luz;->j0:[I

    .line 361
    .line 362
    instance-of v2, v0, Landroidx/constraintlayout/widget/Barrier;

    .line 363
    .line 364
    if-eqz v2, :cond_e

    .line 365
    .line 366
    move-object v2, v0

    .line 367
    check-cast v2, Landroidx/constraintlayout/widget/Barrier;

    .line 368
    .line 369
    invoke-virtual {v2}, Landroidx/constraintlayout/widget/Barrier;->getAllowsGoneWidget()Z

    .line 370
    .line 371
    .line 372
    move-result v4

    .line 373
    iput-boolean v4, v7, Luz;->o0:Z

    .line 374
    .line 375
    invoke-virtual {v2}, Landroidx/constraintlayout/widget/Barrier;->getType()I

    .line 376
    .line 377
    .line 378
    move-result v4

    .line 379
    iput v4, v7, Luz;->g0:I

    .line 380
    .line 381
    invoke-virtual {v2}, Landroidx/constraintlayout/widget/Barrier;->getMargin()I

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    iput v2, v7, Luz;->h0:I

    .line 386
    .line 387
    :cond_e
    iput-boolean v10, v7, Luz;->b:Z

    .line 388
    .line 389
    :cond_f
    iget-boolean v2, v6, Lwz;->a:Z

    .line 390
    .line 391
    if-nez v2, :cond_10

    .line 392
    .line 393
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    iput v2, v6, Lwz;->b:I

    .line 398
    .line 399
    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    iput v2, v6, Lwz;->d:F

    .line 404
    .line 405
    iput-boolean v10, v6, Lwz;->a:Z

    .line 406
    .line 407
    :cond_10
    iget-boolean v2, v8, Lxz;->a:Z

    .line 408
    .line 409
    if-nez v2, :cond_13

    .line 410
    .line 411
    iput-boolean v10, v8, Lxz;->a:Z

    .line 412
    .line 413
    invoke-virtual {v0}, Landroid/view/View;->getRotation()F

    .line 414
    .line 415
    .line 416
    move-result v2

    .line 417
    iput v2, v8, Lxz;->b:F

    .line 418
    .line 419
    invoke-virtual {v0}, Landroid/view/View;->getRotationX()F

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    iput v2, v8, Lxz;->c:F

    .line 424
    .line 425
    invoke-virtual {v0}, Landroid/view/View;->getRotationY()F

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    iput v2, v8, Lxz;->d:F

    .line 430
    .line 431
    invoke-virtual {v0}, Landroid/view/View;->getScaleX()F

    .line 432
    .line 433
    .line 434
    move-result v2

    .line 435
    iput v2, v8, Lxz;->e:F

    .line 436
    .line 437
    invoke-virtual {v0}, Landroid/view/View;->getScaleY()F

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    iput v2, v8, Lxz;->f:F

    .line 442
    .line 443
    invoke-virtual {v0}, Landroid/view/View;->getPivotX()F

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    invoke-virtual {v0}, Landroid/view/View;->getPivotY()F

    .line 448
    .line 449
    .line 450
    move-result v4

    .line 451
    float-to-double v5, v2

    .line 452
    const-wide/16 v9, 0x0

    .line 453
    .line 454
    cmpl-double v5, v5, v9

    .line 455
    .line 456
    if-nez v5, :cond_11

    .line 457
    .line 458
    float-to-double v5, v4

    .line 459
    cmpl-double v5, v5, v9

    .line 460
    .line 461
    if-eqz v5, :cond_12

    .line 462
    .line 463
    :cond_11
    iput v2, v8, Lxz;->g:F

    .line 464
    .line 465
    iput v4, v8, Lxz;->h:F

    .line 466
    .line 467
    :cond_12
    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    iput v2, v8, Lxz;->j:F

    .line 472
    .line 473
    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    .line 474
    .line 475
    .line 476
    move-result v2

    .line 477
    iput v2, v8, Lxz;->k:F

    .line 478
    .line 479
    invoke-virtual {v0}, Landroid/view/View;->getTranslationZ()F

    .line 480
    .line 481
    .line 482
    move-result v2

    .line 483
    iput v2, v8, Lxz;->l:F

    .line 484
    .line 485
    iget-boolean v2, v8, Lxz;->m:Z

    .line 486
    .line 487
    if-eqz v2, :cond_13

    .line 488
    .line 489
    invoke-virtual {v0}, Landroid/view/View;->getElevation()F

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    iput v0, v8, Lxz;->n:F

    .line 494
    .line 495
    :cond_13
    :goto_4
    add-int/lit8 p1, p1, 0x1

    .line 496
    .line 497
    goto/16 :goto_2

    .line 498
    .line 499
    :cond_14
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 500
    .line 501
    .line 502
    move-result-object p0

    .line 503
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 504
    .line 505
    .line 506
    move-result-object p0

    .line 507
    :cond_15
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 508
    .line 509
    .line 510
    move-result p1

    .line 511
    if-eqz p1, :cond_18

    .line 512
    .line 513
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object p1

    .line 517
    check-cast p1, Landroidx/constraintlayout/widget/c;

    .line 518
    .line 519
    iget-object p2, p1, Landroidx/constraintlayout/widget/c;->h:Ltz;

    .line 520
    .line 521
    if-eqz p2, :cond_15

    .line 522
    .line 523
    iget-object p2, p1, Landroidx/constraintlayout/widget/c;->b:Ljava/lang/String;

    .line 524
    .line 525
    if-eqz p2, :cond_17

    .line 526
    .line 527
    invoke-virtual {v3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 528
    .line 529
    .line 530
    move-result-object p2

    .line 531
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 532
    .line 533
    .line 534
    move-result-object p2

    .line 535
    :cond_16
    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 536
    .line 537
    .line 538
    move-result v0

    .line 539
    if-eqz v0, :cond_15

    .line 540
    .line 541
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    check-cast v0, Ljava/lang/Integer;

    .line 546
    .line 547
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 548
    .line 549
    .line 550
    move-result v0

    .line 551
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/widget/d;->i(I)Landroidx/constraintlayout/widget/c;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    iget-object v2, v0, Landroidx/constraintlayout/widget/c;->e:Luz;

    .line 556
    .line 557
    iget-object v2, v2, Luz;->l0:Ljava/lang/String;

    .line 558
    .line 559
    if-eqz v2, :cond_16

    .line 560
    .line 561
    iget-object v4, p1, Landroidx/constraintlayout/widget/c;->b:Ljava/lang/String;

    .line 562
    .line 563
    invoke-virtual {v4, v2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 564
    .line 565
    .line 566
    move-result v2

    .line 567
    if-eqz v2, :cond_16

    .line 568
    .line 569
    iget-object v2, p1, Landroidx/constraintlayout/widget/c;->h:Ltz;

    .line 570
    .line 571
    invoke-virtual {v2, v0}, Ltz;->e(Landroidx/constraintlayout/widget/c;)V

    .line 572
    .line 573
    .line 574
    iget-object v0, v0, Landroidx/constraintlayout/widget/c;->g:Ljava/util/HashMap;

    .line 575
    .line 576
    iget-object v2, p1, Landroidx/constraintlayout/widget/c;->g:Ljava/util/HashMap;

    .line 577
    .line 578
    invoke-virtual {v2}, Ljava/util/HashMap;->clone()Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    check-cast v2, Ljava/util/HashMap;

    .line 583
    .line 584
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 585
    .line 586
    .line 587
    goto :goto_6

    .line 588
    :cond_17
    iget p2, p1, Landroidx/constraintlayout/widget/c;->a:I

    .line 589
    .line 590
    invoke-virtual {v1, p2}, Landroidx/constraintlayout/widget/d;->i(I)Landroidx/constraintlayout/widget/c;

    .line 591
    .line 592
    .line 593
    move-result-object p2

    .line 594
    iget-object p1, p1, Landroidx/constraintlayout/widget/c;->h:Ltz;

    .line 595
    .line 596
    invoke-virtual {p1, p2}, Ltz;->e(Landroidx/constraintlayout/widget/c;)V

    .line 597
    .line 598
    .line 599
    goto :goto_5

    .line 600
    :cond_18
    return-void
.end method

.method public final n(II)V
    .locals 8

    .line 1
    const/4 v0, -0x1

    .line 2
    iget-object v1, p0, Llk1;->b:Ln7;

    .line 3
    .line 4
    if-eqz v1, :cond_2

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ln7;->o(I)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eq v2, v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v2, p1

    .line 14
    :goto_0
    invoke-virtual {v1, p2}, Ln7;->o(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eq v1, v0, :cond_1

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_1
    :goto_1
    move v1, p2

    .line 22
    goto :goto_2

    .line 23
    :cond_2
    move v2, p1

    .line 24
    goto :goto_1

    .line 25
    :goto_2
    iget-object v3, p0, Llk1;->c:Lkk1;

    .line 26
    .line 27
    if-eqz v3, :cond_3

    .line 28
    .line 29
    iget v4, v3, Lkk1;->c:I

    .line 30
    .line 31
    if-ne v4, p2, :cond_3

    .line 32
    .line 33
    iget v3, v3, Lkk1;->d:I

    .line 34
    .line 35
    if-ne v3, p1, :cond_3

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_3
    iget-object v3, p0, Llk1;->d:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_8

    .line 49
    .line 50
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, Lkk1;

    .line 55
    .line 56
    iget v6, v5, Lkk1;->c:I

    .line 57
    .line 58
    if-ne v6, v1, :cond_5

    .line 59
    .line 60
    iget v7, v5, Lkk1;->d:I

    .line 61
    .line 62
    if-eq v7, v2, :cond_6

    .line 63
    .line 64
    :cond_5
    if-ne v6, p2, :cond_4

    .line 65
    .line 66
    iget v6, v5, Lkk1;->d:I

    .line 67
    .line 68
    if-ne v6, p1, :cond_4

    .line 69
    .line 70
    :cond_6
    iput-object v5, p0, Llk1;->c:Lkk1;

    .line 71
    .line 72
    iget-object p1, v5, Lkk1;->l:Lmq2;

    .line 73
    .line 74
    if-eqz p1, :cond_7

    .line 75
    .line 76
    iget-boolean p0, p0, Llk1;->p:Z

    .line 77
    .line 78
    invoke-virtual {p1, p0}, Lmq2;->c(Z)V

    .line 79
    .line 80
    .line 81
    :cond_7
    :goto_3
    return-void

    .line 82
    :cond_8
    iget-object p1, p0, Llk1;->f:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iget-object v4, p0, Llk1;->e:Lkk1;

    .line 89
    .line 90
    :cond_9
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_a

    .line 95
    .line 96
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    check-cast v5, Lkk1;

    .line 101
    .line 102
    iget v6, v5, Lkk1;->c:I

    .line 103
    .line 104
    if-ne v6, p2, :cond_9

    .line 105
    .line 106
    move-object v4, v5

    .line 107
    goto :goto_4

    .line 108
    :cond_a
    new-instance p1, Lkk1;

    .line 109
    .line 110
    invoke-direct {p1, p0, v4}, Lkk1;-><init>(Llk1;Lkk1;)V

    .line 111
    .line 112
    .line 113
    iput v2, p1, Lkk1;->d:I

    .line 114
    .line 115
    iput v1, p1, Lkk1;->c:I

    .line 116
    .line 117
    if-eq v2, v0, :cond_b

    .line 118
    .line 119
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    :cond_b
    iput-object p1, p0, Llk1;->c:Lkk1;

    .line 123
    .line 124
    return-void
.end method

.method public final o()Z
    .locals 3

    .line 1
    iget-object v0, p0, Llk1;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lkk1;

    .line 19
    .line 20
    iget-object v1, v1, Lkk1;->l:Lmq2;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    return v2

    .line 25
    :cond_1
    iget-object p0, p0, Llk1;->c:Lkk1;

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    iget-object p0, p0, Lkk1;->l:Lmq2;

    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    return v2

    .line 34
    :cond_2
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.class public final Lyi2;
.super Landroid/view/MenuInflater;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final e:[Ljava/lang/Class;

.field public static final f:[Ljava/lang/Class;


# instance fields
.field public final a:[Ljava/lang/Object;

.field public final b:[Ljava/lang/Object;

.field public final c:Landroid/content/Context;

.field public d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/content/Context;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lyi2;->e:[Ljava/lang/Class;

    .line 8
    .line 9
    sput-object v0, Lyi2;->f:[Ljava/lang/Class;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/view/MenuInflater;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyi2;->c:Landroid/content/Context;

    .line 5
    .line 6
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lyi2;->a:[Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p1, p0, Lyi2;->b:[Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public static a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/app/Activity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    check-cast p0, Landroid/content/ContextWrapper;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lyi2;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_1
    return-object p0
.end method


# virtual methods
.method public final b(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Lxi2;

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-direct {v2, v0, v3}, Lxi2;-><init>(Lyi2;Landroid/view/Menu;)V

    .line 10
    .line 11
    .line 12
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    :goto_0
    const/4 v4, 0x2

    .line 17
    const-string v5, "menu"

    .line 18
    .line 19
    const/4 v6, 0x1

    .line 20
    if-ne v3, v4, :cond_1

    .line 21
    .line 22
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    const-string v0, "Expecting menu, got "

    .line 38
    .line 39
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lf42;->s(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-ne v3, v6, :cond_17

    .line 52
    .line 53
    :goto_1
    const/4 v7, 0x0

    .line 54
    const/4 v8, 0x0

    .line 55
    move v9, v7

    .line 56
    move v10, v9

    .line 57
    move-object v11, v8

    .line 58
    :goto_2
    if-nez v9, :cond_16

    .line 59
    .line 60
    if-eq v3, v6, :cond_15

    .line 61
    .line 62
    const-string v12, "item"

    .line 63
    .line 64
    const-string v13, "group"

    .line 65
    .line 66
    iget-object v14, v2, Lxi2;->a:Landroid/view/Menu;

    .line 67
    .line 68
    if-eq v3, v4, :cond_8

    .line 69
    .line 70
    const/4 v15, 0x3

    .line 71
    if-eq v3, v15, :cond_3

    .line 72
    .line 73
    :cond_2
    :goto_3
    move-object/from16 v4, p1

    .line 74
    .line 75
    goto/16 :goto_b

    .line 76
    .line 77
    :cond_3
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    if-eqz v10, :cond_4

    .line 82
    .line 83
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v15

    .line 87
    if-eqz v15, :cond_4

    .line 88
    .line 89
    move-object/from16 v4, p1

    .line 90
    .line 91
    move v10, v7

    .line 92
    move-object v11, v8

    .line 93
    goto/16 :goto_b

    .line 94
    .line 95
    :cond_4
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v13

    .line 99
    if-eqz v13, :cond_5

    .line 100
    .line 101
    iput v7, v2, Lxi2;->b:I

    .line 102
    .line 103
    iput v7, v2, Lxi2;->c:I

    .line 104
    .line 105
    iput v7, v2, Lxi2;->d:I

    .line 106
    .line 107
    iput v7, v2, Lxi2;->e:I

    .line 108
    .line 109
    iput-boolean v6, v2, Lxi2;->f:Z

    .line 110
    .line 111
    iput-boolean v6, v2, Lxi2;->g:Z

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_5
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v12

    .line 118
    if-eqz v12, :cond_7

    .line 119
    .line 120
    iget-boolean v3, v2, Lxi2;->h:Z

    .line 121
    .line 122
    if-nez v3, :cond_2

    .line 123
    .line 124
    iget-object v3, v2, Lxi2;->z:Lk2;

    .line 125
    .line 126
    if-eqz v3, :cond_6

    .line 127
    .line 128
    check-cast v3, Ltg1;

    .line 129
    .line 130
    iget-object v3, v3, Ltg1;->c:Landroid/view/ActionProvider;

    .line 131
    .line 132
    invoke-virtual {v3}, Landroid/view/ActionProvider;->hasSubMenu()Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_6

    .line 137
    .line 138
    iput-boolean v6, v2, Lxi2;->h:Z

    .line 139
    .line 140
    iget v3, v2, Lxi2;->b:I

    .line 141
    .line 142
    iget v12, v2, Lxi2;->i:I

    .line 143
    .line 144
    iget v13, v2, Lxi2;->j:I

    .line 145
    .line 146
    iget-object v15, v2, Lxi2;->k:Ljava/lang/CharSequence;

    .line 147
    .line 148
    invoke-interface {v14, v3, v12, v13, v15}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-interface {v3}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v2, v3}, Lxi2;->b(Landroid/view/MenuItem;)V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_6
    iput-boolean v6, v2, Lxi2;->h:Z

    .line 161
    .line 162
    iget v3, v2, Lxi2;->b:I

    .line 163
    .line 164
    iget v12, v2, Lxi2;->i:I

    .line 165
    .line 166
    iget v13, v2, Lxi2;->j:I

    .line 167
    .line 168
    iget-object v15, v2, Lxi2;->k:Ljava/lang/CharSequence;

    .line 169
    .line 170
    invoke-interface {v14, v3, v12, v13, v15}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-virtual {v2, v3}, Lxi2;->b(Landroid/view/MenuItem;)V

    .line 175
    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_7
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-eqz v3, :cond_2

    .line 183
    .line 184
    move-object/from16 v4, p1

    .line 185
    .line 186
    move v9, v6

    .line 187
    goto/16 :goto_b

    .line 188
    .line 189
    :cond_8
    if-eqz v10, :cond_9

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_9
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v13

    .line 200
    iget-object v15, v0, Lyi2;->c:Landroid/content/Context;

    .line 201
    .line 202
    if-eqz v13, :cond_a

    .line 203
    .line 204
    sget-object v3, Landroidx/appcompat/R$styleable;->MenuGroup:[I

    .line 205
    .line 206
    invoke-virtual {v15, v1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    sget v12, Landroidx/appcompat/R$styleable;->MenuGroup_android_id:I

    .line 211
    .line 212
    invoke-virtual {v3, v12, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 213
    .line 214
    .line 215
    move-result v12

    .line 216
    iput v12, v2, Lxi2;->b:I

    .line 217
    .line 218
    sget v12, Landroidx/appcompat/R$styleable;->MenuGroup_android_menuCategory:I

    .line 219
    .line 220
    invoke-virtual {v3, v12, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 221
    .line 222
    .line 223
    move-result v12

    .line 224
    iput v12, v2, Lxi2;->c:I

    .line 225
    .line 226
    sget v12, Landroidx/appcompat/R$styleable;->MenuGroup_android_orderInCategory:I

    .line 227
    .line 228
    invoke-virtual {v3, v12, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 229
    .line 230
    .line 231
    move-result v12

    .line 232
    iput v12, v2, Lxi2;->d:I

    .line 233
    .line 234
    sget v12, Landroidx/appcompat/R$styleable;->MenuGroup_android_checkableBehavior:I

    .line 235
    .line 236
    invoke-virtual {v3, v12, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 237
    .line 238
    .line 239
    move-result v12

    .line 240
    iput v12, v2, Lxi2;->e:I

    .line 241
    .line 242
    sget v12, Landroidx/appcompat/R$styleable;->MenuGroup_android_visible:I

    .line 243
    .line 244
    invoke-virtual {v3, v12, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 245
    .line 246
    .line 247
    move-result v12

    .line 248
    iput-boolean v12, v2, Lxi2;->f:Z

    .line 249
    .line 250
    sget v12, Landroidx/appcompat/R$styleable;->MenuGroup_android_enabled:I

    .line 251
    .line 252
    invoke-virtual {v3, v12, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 253
    .line 254
    .line 255
    move-result v12

    .line 256
    iput-boolean v12, v2, Lxi2;->g:Z

    .line 257
    .line 258
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_3

    .line 262
    .line 263
    :cond_a
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v12

    .line 267
    if-eqz v12, :cond_13

    .line 268
    .line 269
    sget-object v3, Landroidx/appcompat/R$styleable;->MenuItem:[I

    .line 270
    .line 271
    invoke-static {v15, v1, v3}, Lac1;->G(Landroid/content/Context;Landroid/util/AttributeSet;[I)Lac1;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    sget v12, Landroidx/appcompat/R$styleable;->MenuItem_android_id:I

    .line 276
    .line 277
    iget-object v13, v3, Lac1;->c:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v13, Landroid/content/res/TypedArray;

    .line 280
    .line 281
    invoke-virtual {v13, v12, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 282
    .line 283
    .line 284
    move-result v12

    .line 285
    iput v12, v2, Lxi2;->i:I

    .line 286
    .line 287
    sget v12, Landroidx/appcompat/R$styleable;->MenuItem_android_menuCategory:I

    .line 288
    .line 289
    iget v14, v2, Lxi2;->c:I

    .line 290
    .line 291
    invoke-virtual {v13, v12, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 292
    .line 293
    .line 294
    move-result v12

    .line 295
    sget v14, Landroidx/appcompat/R$styleable;->MenuItem_android_orderInCategory:I

    .line 296
    .line 297
    iget v15, v2, Lxi2;->d:I

    .line 298
    .line 299
    invoke-virtual {v13, v14, v15}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 300
    .line 301
    .line 302
    move-result v14

    .line 303
    const/high16 v15, -0x10000

    .line 304
    .line 305
    and-int/2addr v12, v15

    .line 306
    const v15, 0xffff

    .line 307
    .line 308
    .line 309
    and-int/2addr v14, v15

    .line 310
    or-int/2addr v12, v14

    .line 311
    iput v12, v2, Lxi2;->j:I

    .line 312
    .line 313
    sget v12, Landroidx/appcompat/R$styleable;->MenuItem_android_title:I

    .line 314
    .line 315
    invoke-virtual {v13, v12}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 316
    .line 317
    .line 318
    move-result-object v12

    .line 319
    iput-object v12, v2, Lxi2;->k:Ljava/lang/CharSequence;

    .line 320
    .line 321
    sget v12, Landroidx/appcompat/R$styleable;->MenuItem_android_titleCondensed:I

    .line 322
    .line 323
    invoke-virtual {v13, v12}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 324
    .line 325
    .line 326
    move-result-object v12

    .line 327
    iput-object v12, v2, Lxi2;->l:Ljava/lang/CharSequence;

    .line 328
    .line 329
    sget v12, Landroidx/appcompat/R$styleable;->MenuItem_android_icon:I

    .line 330
    .line 331
    invoke-virtual {v13, v12, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 332
    .line 333
    .line 334
    move-result v12

    .line 335
    iput v12, v2, Lxi2;->m:I

    .line 336
    .line 337
    sget v12, Landroidx/appcompat/R$styleable;->MenuItem_android_alphabeticShortcut:I

    .line 338
    .line 339
    invoke-virtual {v13, v12}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v12

    .line 343
    if-nez v12, :cond_b

    .line 344
    .line 345
    move v12, v7

    .line 346
    goto :goto_4

    .line 347
    :cond_b
    invoke-virtual {v12, v7}, Ljava/lang/String;->charAt(I)C

    .line 348
    .line 349
    .line 350
    move-result v12

    .line 351
    :goto_4
    iput-char v12, v2, Lxi2;->n:C

    .line 352
    .line 353
    sget v12, Landroidx/appcompat/R$styleable;->MenuItem_alphabeticModifiers:I

    .line 354
    .line 355
    const/16 v14, 0x1000

    .line 356
    .line 357
    invoke-virtual {v13, v12, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 358
    .line 359
    .line 360
    move-result v12

    .line 361
    iput v12, v2, Lxi2;->o:I

    .line 362
    .line 363
    sget v12, Landroidx/appcompat/R$styleable;->MenuItem_android_numericShortcut:I

    .line 364
    .line 365
    invoke-virtual {v13, v12}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v12

    .line 369
    if-nez v12, :cond_c

    .line 370
    .line 371
    move v12, v7

    .line 372
    goto :goto_5

    .line 373
    :cond_c
    invoke-virtual {v12, v7}, Ljava/lang/String;->charAt(I)C

    .line 374
    .line 375
    .line 376
    move-result v12

    .line 377
    :goto_5
    iput-char v12, v2, Lxi2;->p:C

    .line 378
    .line 379
    sget v12, Landroidx/appcompat/R$styleable;->MenuItem_numericModifiers:I

    .line 380
    .line 381
    invoke-virtual {v13, v12, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 382
    .line 383
    .line 384
    move-result v12

    .line 385
    iput v12, v2, Lxi2;->q:I

    .line 386
    .line 387
    sget v12, Landroidx/appcompat/R$styleable;->MenuItem_android_checkable:I

    .line 388
    .line 389
    invoke-virtual {v13, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 390
    .line 391
    .line 392
    move-result v12

    .line 393
    if-eqz v12, :cond_d

    .line 394
    .line 395
    sget v12, Landroidx/appcompat/R$styleable;->MenuItem_android_checkable:I

    .line 396
    .line 397
    invoke-virtual {v13, v12, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 398
    .line 399
    .line 400
    move-result v12

    .line 401
    iput v12, v2, Lxi2;->r:I

    .line 402
    .line 403
    goto :goto_6

    .line 404
    :cond_d
    iget v12, v2, Lxi2;->e:I

    .line 405
    .line 406
    iput v12, v2, Lxi2;->r:I

    .line 407
    .line 408
    :goto_6
    sget v12, Landroidx/appcompat/R$styleable;->MenuItem_android_checked:I

    .line 409
    .line 410
    invoke-virtual {v13, v12, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 411
    .line 412
    .line 413
    move-result v12

    .line 414
    iput-boolean v12, v2, Lxi2;->s:Z

    .line 415
    .line 416
    sget v12, Landroidx/appcompat/R$styleable;->MenuItem_android_visible:I

    .line 417
    .line 418
    iget-boolean v14, v2, Lxi2;->f:Z

    .line 419
    .line 420
    invoke-virtual {v13, v12, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 421
    .line 422
    .line 423
    move-result v12

    .line 424
    iput-boolean v12, v2, Lxi2;->t:Z

    .line 425
    .line 426
    sget v12, Landroidx/appcompat/R$styleable;->MenuItem_android_enabled:I

    .line 427
    .line 428
    iget-boolean v14, v2, Lxi2;->g:Z

    .line 429
    .line 430
    invoke-virtual {v13, v12, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 431
    .line 432
    .line 433
    move-result v12

    .line 434
    iput-boolean v12, v2, Lxi2;->u:Z

    .line 435
    .line 436
    sget v12, Landroidx/appcompat/R$styleable;->MenuItem_showAsAction:I

    .line 437
    .line 438
    const/4 v14, -0x1

    .line 439
    invoke-virtual {v13, v12, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 440
    .line 441
    .line 442
    move-result v12

    .line 443
    iput v12, v2, Lxi2;->v:I

    .line 444
    .line 445
    sget v12, Landroidx/appcompat/R$styleable;->MenuItem_android_onClick:I

    .line 446
    .line 447
    invoke-virtual {v13, v12}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v12

    .line 451
    iput-object v12, v2, Lxi2;->y:Ljava/lang/String;

    .line 452
    .line 453
    sget v12, Landroidx/appcompat/R$styleable;->MenuItem_actionLayout:I

    .line 454
    .line 455
    invoke-virtual {v13, v12, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 456
    .line 457
    .line 458
    move-result v12

    .line 459
    iput v12, v2, Lxi2;->w:I

    .line 460
    .line 461
    sget v12, Landroidx/appcompat/R$styleable;->MenuItem_actionViewClass:I

    .line 462
    .line 463
    invoke-virtual {v13, v12}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v12

    .line 467
    iput-object v12, v2, Lxi2;->x:Ljava/lang/String;

    .line 468
    .line 469
    sget v12, Landroidx/appcompat/R$styleable;->MenuItem_actionProviderClass:I

    .line 470
    .line 471
    invoke-virtual {v13, v12}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v12

    .line 475
    if-eqz v12, :cond_e

    .line 476
    .line 477
    move v15, v6

    .line 478
    goto :goto_7

    .line 479
    :cond_e
    move v15, v7

    .line 480
    :goto_7
    if-eqz v15, :cond_f

    .line 481
    .line 482
    iget v4, v2, Lxi2;->w:I

    .line 483
    .line 484
    if-nez v4, :cond_f

    .line 485
    .line 486
    iget-object v4, v2, Lxi2;->x:Ljava/lang/String;

    .line 487
    .line 488
    if-nez v4, :cond_f

    .line 489
    .line 490
    sget-object v4, Lyi2;->f:[Ljava/lang/Class;

    .line 491
    .line 492
    iget-object v15, v0, Lyi2;->b:[Ljava/lang/Object;

    .line 493
    .line 494
    invoke-virtual {v2, v12, v4, v15}, Lxi2;->a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v4

    .line 498
    check-cast v4, Lk2;

    .line 499
    .line 500
    iput-object v4, v2, Lxi2;->z:Lk2;

    .line 501
    .line 502
    goto :goto_8

    .line 503
    :cond_f
    if-eqz v15, :cond_10

    .line 504
    .line 505
    const-string v4, "SupportMenuInflater"

    .line 506
    .line 507
    const-string v12, "Ignoring attribute \'actionProviderClass\'. Action view already specified."

    .line 508
    .line 509
    invoke-static {v4, v12}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 510
    .line 511
    .line 512
    :cond_10
    iput-object v8, v2, Lxi2;->z:Lk2;

    .line 513
    .line 514
    :goto_8
    sget v4, Landroidx/appcompat/R$styleable;->MenuItem_contentDescription:I

    .line 515
    .line 516
    invoke-virtual {v13, v4}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 517
    .line 518
    .line 519
    move-result-object v4

    .line 520
    iput-object v4, v2, Lxi2;->A:Ljava/lang/CharSequence;

    .line 521
    .line 522
    sget v4, Landroidx/appcompat/R$styleable;->MenuItem_tooltipText:I

    .line 523
    .line 524
    invoke-virtual {v13, v4}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 525
    .line 526
    .line 527
    move-result-object v4

    .line 528
    iput-object v4, v2, Lxi2;->B:Ljava/lang/CharSequence;

    .line 529
    .line 530
    sget v4, Landroidx/appcompat/R$styleable;->MenuItem_iconTintMode:I

    .line 531
    .line 532
    invoke-virtual {v13, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 533
    .line 534
    .line 535
    move-result v4

    .line 536
    if-eqz v4, :cond_11

    .line 537
    .line 538
    sget v4, Landroidx/appcompat/R$styleable;->MenuItem_iconTintMode:I

    .line 539
    .line 540
    invoke-virtual {v13, v4, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 541
    .line 542
    .line 543
    move-result v4

    .line 544
    iget-object v12, v2, Lxi2;->D:Landroid/graphics/PorterDuff$Mode;

    .line 545
    .line 546
    invoke-static {v4, v12}, Lw90;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 547
    .line 548
    .line 549
    move-result-object v4

    .line 550
    iput-object v4, v2, Lxi2;->D:Landroid/graphics/PorterDuff$Mode;

    .line 551
    .line 552
    goto :goto_9

    .line 553
    :cond_11
    iput-object v8, v2, Lxi2;->D:Landroid/graphics/PorterDuff$Mode;

    .line 554
    .line 555
    :goto_9
    sget v4, Landroidx/appcompat/R$styleable;->MenuItem_iconTint:I

    .line 556
    .line 557
    invoke-virtual {v13, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 558
    .line 559
    .line 560
    move-result v4

    .line 561
    if-eqz v4, :cond_12

    .line 562
    .line 563
    sget v4, Landroidx/appcompat/R$styleable;->MenuItem_iconTint:I

    .line 564
    .line 565
    invoke-virtual {v3, v4}, Lac1;->m(I)Landroid/content/res/ColorStateList;

    .line 566
    .line 567
    .line 568
    move-result-object v4

    .line 569
    iput-object v4, v2, Lxi2;->C:Landroid/content/res/ColorStateList;

    .line 570
    .line 571
    goto :goto_a

    .line 572
    :cond_12
    iput-object v8, v2, Lxi2;->C:Landroid/content/res/ColorStateList;

    .line 573
    .line 574
    :goto_a
    invoke-virtual {v3}, Lac1;->J()V

    .line 575
    .line 576
    .line 577
    iput-boolean v7, v2, Lxi2;->h:Z

    .line 578
    .line 579
    goto/16 :goto_3

    .line 580
    .line 581
    :cond_13
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v4

    .line 585
    if-eqz v4, :cond_14

    .line 586
    .line 587
    iput-boolean v6, v2, Lxi2;->h:Z

    .line 588
    .line 589
    iget v3, v2, Lxi2;->b:I

    .line 590
    .line 591
    iget v4, v2, Lxi2;->i:I

    .line 592
    .line 593
    iget v12, v2, Lxi2;->j:I

    .line 594
    .line 595
    iget-object v13, v2, Lxi2;->k:Ljava/lang/CharSequence;

    .line 596
    .line 597
    invoke-interface {v14, v3, v4, v12, v13}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    .line 598
    .line 599
    .line 600
    move-result-object v3

    .line 601
    invoke-interface {v3}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    .line 602
    .line 603
    .line 604
    move-result-object v4

    .line 605
    invoke-virtual {v2, v4}, Lxi2;->b(Landroid/view/MenuItem;)V

    .line 606
    .line 607
    .line 608
    move-object/from16 v4, p1

    .line 609
    .line 610
    invoke-virtual {v0, v4, v1, v3}, Lyi2;->b(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V

    .line 611
    .line 612
    .line 613
    goto :goto_b

    .line 614
    :cond_14
    move-object/from16 v4, p1

    .line 615
    .line 616
    move-object v11, v3

    .line 617
    move v10, v6

    .line 618
    :goto_b
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 619
    .line 620
    .line 621
    move-result v3

    .line 622
    const/4 v4, 0x2

    .line 623
    goto/16 :goto_2

    .line 624
    .line 625
    :cond_15
    const-string v0, "Unexpected end of document"

    .line 626
    .line 627
    invoke-static {v0}, Lf42;->s(Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    :cond_16
    return-void

    .line 631
    :cond_17
    move-object/from16 v4, p1

    .line 632
    .line 633
    goto/16 :goto_0
.end method

.method public final inflate(ILandroid/view/Menu;)V
    .locals 5

    .line 1
    const-string v0, "Error inflating menu XML"

    .line 2
    .line 3
    instance-of v1, p2, Ljg1;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1, p2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    :try_start_0
    iget-object v3, p0, Lyi2;->c:Landroid/content/Context;

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3, p1}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    instance-of v3, p2, Ljg1;

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    move-object v3, p2

    .line 32
    check-cast v3, Ljg1;

    .line 33
    .line 34
    iget-boolean v4, v3, Ljg1;->p:Z

    .line 35
    .line 36
    if-nez v4, :cond_1

    .line 37
    .line 38
    invoke-virtual {v3}, Ljg1;->y()V

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    goto :goto_3

    .line 45
    :catch_0
    move-exception p0

    .line 46
    goto :goto_1

    .line 47
    :catch_1
    move-exception p0

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    :goto_0
    invoke-virtual {p0, v1, p1, p2}, Lyi2;->b(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    check-cast p2, Ljg1;

    .line 55
    .line 56
    invoke-virtual {p2}, Ljg1;->x()V

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :goto_1
    :try_start_1
    new-instance p1, Landroid/view/InflateException;

    .line 64
    .line 65
    invoke-direct {p1, v0, p0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :goto_2
    new-instance p1, Landroid/view/InflateException;

    .line 70
    .line 71
    invoke-direct {p1, v0, p0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    :goto_3
    if-eqz v2, :cond_3

    .line 76
    .line 77
    check-cast p2, Ljg1;

    .line 78
    .line 79
    invoke-virtual {p2}, Ljg1;->x()V

    .line 80
    .line 81
    .line 82
    :cond_3
    if-eqz v1, :cond_4

    .line 83
    .line 84
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 85
    .line 86
    .line 87
    :cond_4
    throw p0
.end method

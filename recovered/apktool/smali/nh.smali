.class public final Lnh;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lcom/google/android/material/badge/BadgeState$State;

.field public final b:Lcom/google/android/material/badge/BadgeState$State;

.field public final c:F

.field public final d:F

.field public final e:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/material/badge/BadgeState$State;)V
    .locals 9

    .line 1
    sget v3, Lmh;->Z:I

    .line 2
    .line 3
    sget v0, Lmh;->Y:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lcom/google/android/material/badge/BadgeState$State;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/material/badge/BadgeState$State;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    new-instance p2, Lcom/google/android/material/badge/BadgeState$State;

    .line 18
    .line 19
    invoke-direct {p2}, Lcom/google/android/material/badge/BadgeState$State;-><init>()V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget v1, p2, Lcom/google/android/material/badge/BadgeState$State;->a:I

    .line 23
    .line 24
    const/4 v6, 0x1

    .line 25
    const/4 v7, 0x0

    .line 26
    if-eqz v1, :cond_5

    .line 27
    .line 28
    const-string v2, "badge"

    .line 29
    .line 30
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    :cond_1
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    const/4 v8, 0x2

    .line 43
    if-eq v5, v8, :cond_2

    .line 44
    .line 45
    if-ne v5, v6, :cond_1

    .line 46
    .line 47
    :cond_2
    if-ne v5, v8, :cond_4

    .line 48
    .line 49
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-static {v5, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_3

    .line 58
    .line 59
    invoke-static {v4}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 60
    .line 61
    .line 62
    move-result-object v1
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    invoke-interface {v1}, Landroid/util/AttributeSet;->getStyleAttribute()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    goto :goto_2

    .line 68
    :catch_0
    move-exception v0

    .line 69
    :goto_0
    move-object p0, v0

    .line 70
    goto :goto_1

    .line 71
    :catch_1
    move-exception v0

    .line 72
    goto :goto_0

    .line 73
    :cond_3
    :try_start_1
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 74
    .line 75
    new-instance p1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string p2, "Must have a <"

    .line 81
    .line 82
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string p2, "> start tag"

    .line 89
    .line 90
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p0

    .line 101
    :cond_4
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 102
    .line 103
    const-string p1, "No start tag found"

    .line 104
    .line 105
    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p0
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 109
    :goto_1
    new-instance p1, Landroid/content/res/Resources$NotFoundException;

    .line 110
    .line 111
    new-instance p2, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    const-string v0, "Can\'t load badge resource ID #0x"

    .line 114
    .line 115
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-direct {p1, p2}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 133
    .line 134
    .line 135
    throw p1

    .line 136
    :cond_5
    const/4 v1, 0x0

    .line 137
    move v2, v7

    .line 138
    :goto_2
    if-nez v2, :cond_6

    .line 139
    .line 140
    move v4, v0

    .line 141
    goto :goto_3

    .line 142
    :cond_6
    move v4, v2

    .line 143
    :goto_3
    sget-object v2, Lcom/google/android/material/R$styleable;->Badge:[I

    .line 144
    .line 145
    new-array v5, v7, [I

    .line 146
    .line 147
    move-object v0, p1

    .line 148
    invoke-static/range {v0 .. v5}, Lrn2;->d(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    sget v2, Lcom/google/android/material/R$styleable;->Badge_badgeRadius:I

    .line 157
    .line 158
    sget v3, Lcom/google/android/material/R$dimen;->mtrl_badge_radius:I

    .line 159
    .line 160
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    int-to-float v2, v2

    .line 169
    iput v2, p0, Lnh;->c:F

    .line 170
    .line 171
    sget v2, Lcom/google/android/material/R$styleable;->Badge_badgeWidePadding:I

    .line 172
    .line 173
    sget v3, Lcom/google/android/material/R$dimen;->mtrl_badge_long_text_horizontal_padding:I

    .line 174
    .line 175
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    int-to-float v2, v2

    .line 184
    iput v2, p0, Lnh;->e:F

    .line 185
    .line 186
    sget v2, Lcom/google/android/material/R$styleable;->Badge_badgeWithTextRadius:I

    .line 187
    .line 188
    sget v3, Lcom/google/android/material/R$dimen;->mtrl_badge_with_text_radius:I

    .line 189
    .line 190
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    int-to-float v1, v1

    .line 199
    iput v1, p0, Lnh;->d:F

    .line 200
    .line 201
    iget-object v1, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 202
    .line 203
    iget v2, p2, Lcom/google/android/material/badge/BadgeState$State;->d:I

    .line 204
    .line 205
    const/4 v3, -0x2

    .line 206
    if-ne v2, v3, :cond_7

    .line 207
    .line 208
    const/16 v2, 0xff

    .line 209
    .line 210
    :cond_7
    iput v2, v1, Lcom/google/android/material/badge/BadgeState$State;->d:I

    .line 211
    .line 212
    iget-object v2, p2, Lcom/google/android/material/badge/BadgeState$State;->v:Ljava/lang/CharSequence;

    .line 213
    .line 214
    if-nez v2, :cond_8

    .line 215
    .line 216
    sget v2, Lcom/google/android/material/R$string;->mtrl_badge_numberless_content_description:I

    .line 217
    .line 218
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    :cond_8
    iput-object v2, v1, Lcom/google/android/material/badge/BadgeState$State;->v:Ljava/lang/CharSequence;

    .line 223
    .line 224
    iget-object v1, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 225
    .line 226
    iget v2, p2, Lcom/google/android/material/badge/BadgeState$State;->w:I

    .line 227
    .line 228
    if-nez v2, :cond_9

    .line 229
    .line 230
    sget v2, Lcom/google/android/material/R$plurals;->mtrl_badge_content_description:I

    .line 231
    .line 232
    :cond_9
    iput v2, v1, Lcom/google/android/material/badge/BadgeState$State;->w:I

    .line 233
    .line 234
    iget v2, p2, Lcom/google/android/material/badge/BadgeState$State;->U:I

    .line 235
    .line 236
    if-nez v2, :cond_a

    .line 237
    .line 238
    sget v2, Lcom/google/android/material/R$string;->mtrl_exceed_max_badge_number_content_description:I

    .line 239
    .line 240
    :cond_a
    iput v2, v1, Lcom/google/android/material/badge/BadgeState$State;->U:I

    .line 241
    .line 242
    iget-object v2, p2, Lcom/google/android/material/badge/BadgeState$State;->W:Ljava/lang/Boolean;

    .line 243
    .line 244
    if-eqz v2, :cond_c

    .line 245
    .line 246
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-eqz v2, :cond_b

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_b
    move v2, v7

    .line 254
    goto :goto_5

    .line 255
    :cond_c
    :goto_4
    move v2, v6

    .line 256
    :goto_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    iput-object v2, v1, Lcom/google/android/material/badge/BadgeState$State;->W:Ljava/lang/Boolean;

    .line 261
    .line 262
    iget-object v1, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 263
    .line 264
    iget v2, p2, Lcom/google/android/material/badge/BadgeState$State;->f:I

    .line 265
    .line 266
    if-ne v2, v3, :cond_d

    .line 267
    .line 268
    sget v2, Lcom/google/android/material/R$styleable;->Badge_maxCharacterCount:I

    .line 269
    .line 270
    const/4 v4, 0x4

    .line 271
    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    :cond_d
    iput v2, v1, Lcom/google/android/material/badge/BadgeState$State;->f:I

    .line 276
    .line 277
    iget v1, p2, Lcom/google/android/material/badge/BadgeState$State;->e:I

    .line 278
    .line 279
    if-eq v1, v3, :cond_e

    .line 280
    .line 281
    iget-object v2, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 282
    .line 283
    iput v1, v2, Lcom/google/android/material/badge/BadgeState$State;->e:I

    .line 284
    .line 285
    goto :goto_6

    .line 286
    :cond_e
    sget v1, Lcom/google/android/material/R$styleable;->Badge_number:I

    .line 287
    .line 288
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    iget-object v2, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 293
    .line 294
    if-eqz v1, :cond_f

    .line 295
    .line 296
    sget v1, Lcom/google/android/material/R$styleable;->Badge_number:I

    .line 297
    .line 298
    invoke-virtual {p1, v1, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    iput v1, v2, Lcom/google/android/material/badge/BadgeState$State;->e:I

    .line 303
    .line 304
    goto :goto_6

    .line 305
    :cond_f
    const/4 v1, -0x1

    .line 306
    iput v1, v2, Lcom/google/android/material/badge/BadgeState$State;->e:I

    .line 307
    .line 308
    :goto_6
    iget-object v1, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 309
    .line 310
    iget-object v2, p2, Lcom/google/android/material/badge/BadgeState$State;->b:Ljava/lang/Integer;

    .line 311
    .line 312
    if-nez v2, :cond_10

    .line 313
    .line 314
    sget v2, Lcom/google/android/material/R$styleable;->Badge_backgroundColor:I

    .line 315
    .line 316
    invoke-static {v0, p1, v2}, Lde3;->o(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    goto :goto_7

    .line 325
    :cond_10
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    :goto_7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    iput-object v2, v1, Lcom/google/android/material/badge/BadgeState$State;->b:Ljava/lang/Integer;

    .line 334
    .line 335
    iget-object v1, p2, Lcom/google/android/material/badge/BadgeState$State;->c:Ljava/lang/Integer;

    .line 336
    .line 337
    if-eqz v1, :cond_11

    .line 338
    .line 339
    iget-object v0, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 340
    .line 341
    iput-object v1, v0, Lcom/google/android/material/badge/BadgeState$State;->c:Ljava/lang/Integer;

    .line 342
    .line 343
    goto/16 :goto_9

    .line 344
    .line 345
    :cond_11
    sget v1, Lcom/google/android/material/R$styleable;->Badge_badgeTextColor:I

    .line 346
    .line 347
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    if-eqz v1, :cond_12

    .line 352
    .line 353
    iget-object v1, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 354
    .line 355
    sget v2, Lcom/google/android/material/R$styleable;->Badge_badgeTextColor:I

    .line 356
    .line 357
    invoke-static {v0, p1, v2}, Lde3;->o(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    iput-object v0, v1, Lcom/google/android/material/badge/BadgeState$State;->c:Ljava/lang/Integer;

    .line 370
    .line 371
    goto :goto_9

    .line 372
    :cond_12
    sget v1, Lcom/google/android/material/R$style;->TextAppearance_MaterialComponents_Badge:I

    .line 373
    .line 374
    sget-object v2, Lcom/google/android/material/R$styleable;->TextAppearance:[I

    .line 375
    .line 376
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    sget v3, Lcom/google/android/material/R$styleable;->TextAppearance_android_textSize:I

    .line 381
    .line 382
    const/4 v4, 0x0

    .line 383
    invoke-virtual {v2, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 384
    .line 385
    .line 386
    sget v3, Lcom/google/android/material/R$styleable;->TextAppearance_android_textColor:I

    .line 387
    .line 388
    invoke-static {v0, v2, v3}, Lde3;->o(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    sget v5, Lcom/google/android/material/R$styleable;->TextAppearance_android_textColorHint:I

    .line 393
    .line 394
    invoke-static {v0, v2, v5}, Lde3;->o(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 395
    .line 396
    .line 397
    sget v5, Lcom/google/android/material/R$styleable;->TextAppearance_android_textColorLink:I

    .line 398
    .line 399
    invoke-static {v0, v2, v5}, Lde3;->o(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 400
    .line 401
    .line 402
    sget v5, Lcom/google/android/material/R$styleable;->TextAppearance_android_textStyle:I

    .line 403
    .line 404
    invoke-virtual {v2, v5, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 405
    .line 406
    .line 407
    sget v5, Lcom/google/android/material/R$styleable;->TextAppearance_android_typeface:I

    .line 408
    .line 409
    invoke-virtual {v2, v5, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 410
    .line 411
    .line 412
    sget v5, Lcom/google/android/material/R$styleable;->TextAppearance_fontFamily:I

    .line 413
    .line 414
    sget v6, Lcom/google/android/material/R$styleable;->TextAppearance_android_fontFamily:I

    .line 415
    .line 416
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 417
    .line 418
    .line 419
    move-result v8

    .line 420
    if-eqz v8, :cond_13

    .line 421
    .line 422
    goto :goto_8

    .line 423
    :cond_13
    move v5, v6

    .line 424
    :goto_8
    invoke-virtual {v2, v5, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    sget v5, Lcom/google/android/material/R$styleable;->TextAppearance_textAllCaps:I

    .line 431
    .line 432
    invoke-virtual {v2, v5, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 433
    .line 434
    .line 435
    sget v5, Lcom/google/android/material/R$styleable;->TextAppearance_android_shadowColor:I

    .line 436
    .line 437
    invoke-static {v0, v2, v5}, Lde3;->o(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 438
    .line 439
    .line 440
    sget v5, Lcom/google/android/material/R$styleable;->TextAppearance_android_shadowDx:I

    .line 441
    .line 442
    invoke-virtual {v2, v5, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 443
    .line 444
    .line 445
    sget v5, Lcom/google/android/material/R$styleable;->TextAppearance_android_shadowDy:I

    .line 446
    .line 447
    invoke-virtual {v2, v5, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 448
    .line 449
    .line 450
    sget v5, Lcom/google/android/material/R$styleable;->TextAppearance_android_shadowRadius:I

    .line 451
    .line 452
    invoke-virtual {v2, v5, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 456
    .line 457
    .line 458
    sget-object v2, Lcom/google/android/material/R$styleable;->MaterialTextAppearance:[I

    .line 459
    .line 460
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    sget v1, Lcom/google/android/material/R$styleable;->MaterialTextAppearance_android_letterSpacing:I

    .line 465
    .line 466
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 467
    .line 468
    .line 469
    sget v1, Lcom/google/android/material/R$styleable;->MaterialTextAppearance_android_letterSpacing:I

    .line 470
    .line 471
    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 472
    .line 473
    .line 474
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 475
    .line 476
    .line 477
    iget-object v0, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 478
    .line 479
    invoke-virtual {v3}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    iput-object v1, v0, Lcom/google/android/material/badge/BadgeState$State;->c:Ljava/lang/Integer;

    .line 488
    .line 489
    :goto_9
    iget-object v0, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 490
    .line 491
    iget-object v1, p2, Lcom/google/android/material/badge/BadgeState$State;->V:Ljava/lang/Integer;

    .line 492
    .line 493
    if-nez v1, :cond_14

    .line 494
    .line 495
    sget v1, Lcom/google/android/material/R$styleable;->Badge_badgeGravity:I

    .line 496
    .line 497
    const v2, 0x800035

    .line 498
    .line 499
    .line 500
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 501
    .line 502
    .line 503
    move-result v1

    .line 504
    goto :goto_a

    .line 505
    :cond_14
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 506
    .line 507
    .line 508
    move-result v1

    .line 509
    :goto_a
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    iput-object v1, v0, Lcom/google/android/material/badge/BadgeState$State;->V:Ljava/lang/Integer;

    .line 514
    .line 515
    iget-object v0, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 516
    .line 517
    iget-object v1, p2, Lcom/google/android/material/badge/BadgeState$State;->X:Ljava/lang/Integer;

    .line 518
    .line 519
    if-nez v1, :cond_15

    .line 520
    .line 521
    sget v1, Lcom/google/android/material/R$styleable;->Badge_horizontalOffset:I

    .line 522
    .line 523
    invoke-virtual {p1, v1, v7}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 524
    .line 525
    .line 526
    move-result v1

    .line 527
    goto :goto_b

    .line 528
    :cond_15
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 529
    .line 530
    .line 531
    move-result v1

    .line 532
    :goto_b
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    iput-object v1, v0, Lcom/google/android/material/badge/BadgeState$State;->X:Ljava/lang/Integer;

    .line 537
    .line 538
    iget-object v0, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 539
    .line 540
    iget-object v1, p2, Lcom/google/android/material/badge/BadgeState$State;->X:Ljava/lang/Integer;

    .line 541
    .line 542
    if-nez v1, :cond_16

    .line 543
    .line 544
    sget v1, Lcom/google/android/material/R$styleable;->Badge_verticalOffset:I

    .line 545
    .line 546
    invoke-virtual {p1, v1, v7}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 547
    .line 548
    .line 549
    move-result v1

    .line 550
    goto :goto_c

    .line 551
    :cond_16
    iget-object v1, p2, Lcom/google/android/material/badge/BadgeState$State;->Y:Ljava/lang/Integer;

    .line 552
    .line 553
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 554
    .line 555
    .line 556
    move-result v1

    .line 557
    :goto_c
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    iput-object v1, v0, Lcom/google/android/material/badge/BadgeState$State;->Y:Ljava/lang/Integer;

    .line 562
    .line 563
    iget-object v0, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 564
    .line 565
    iget-object v1, p2, Lcom/google/android/material/badge/BadgeState$State;->Z:Ljava/lang/Integer;

    .line 566
    .line 567
    if-nez v1, :cond_17

    .line 568
    .line 569
    sget v1, Lcom/google/android/material/R$styleable;->Badge_horizontalOffsetWithText:I

    .line 570
    .line 571
    iget-object v2, v0, Lcom/google/android/material/badge/BadgeState$State;->X:Ljava/lang/Integer;

    .line 572
    .line 573
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 574
    .line 575
    .line 576
    move-result v2

    .line 577
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 578
    .line 579
    .line 580
    move-result v1

    .line 581
    goto :goto_d

    .line 582
    :cond_17
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 583
    .line 584
    .line 585
    move-result v1

    .line 586
    :goto_d
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 587
    .line 588
    .line 589
    move-result-object v1

    .line 590
    iput-object v1, v0, Lcom/google/android/material/badge/BadgeState$State;->Z:Ljava/lang/Integer;

    .line 591
    .line 592
    iget-object v0, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 593
    .line 594
    iget-object v1, p2, Lcom/google/android/material/badge/BadgeState$State;->a0:Ljava/lang/Integer;

    .line 595
    .line 596
    if-nez v1, :cond_18

    .line 597
    .line 598
    sget v1, Lcom/google/android/material/R$styleable;->Badge_verticalOffsetWithText:I

    .line 599
    .line 600
    iget-object v2, v0, Lcom/google/android/material/badge/BadgeState$State;->Y:Ljava/lang/Integer;

    .line 601
    .line 602
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 603
    .line 604
    .line 605
    move-result v2

    .line 606
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 607
    .line 608
    .line 609
    move-result v1

    .line 610
    goto :goto_e

    .line 611
    :cond_18
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 612
    .line 613
    .line 614
    move-result v1

    .line 615
    :goto_e
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    iput-object v1, v0, Lcom/google/android/material/badge/BadgeState$State;->a0:Ljava/lang/Integer;

    .line 620
    .line 621
    iget-object v0, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 622
    .line 623
    iget-object v1, p2, Lcom/google/android/material/badge/BadgeState$State;->b0:Ljava/lang/Integer;

    .line 624
    .line 625
    if-nez v1, :cond_19

    .line 626
    .line 627
    move v1, v7

    .line 628
    goto :goto_f

    .line 629
    :cond_19
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 630
    .line 631
    .line 632
    move-result v1

    .line 633
    :goto_f
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 634
    .line 635
    .line 636
    move-result-object v1

    .line 637
    iput-object v1, v0, Lcom/google/android/material/badge/BadgeState$State;->b0:Ljava/lang/Integer;

    .line 638
    .line 639
    iget-object v0, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 640
    .line 641
    iget-object v1, p2, Lcom/google/android/material/badge/BadgeState$State;->c0:Ljava/lang/Integer;

    .line 642
    .line 643
    if-nez v1, :cond_1a

    .line 644
    .line 645
    goto :goto_10

    .line 646
    :cond_1a
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 647
    .line 648
    .line 649
    move-result v7

    .line 650
    :goto_10
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    iput-object v1, v0, Lcom/google/android/material/badge/BadgeState$State;->c0:Ljava/lang/Integer;

    .line 655
    .line 656
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 657
    .line 658
    .line 659
    iget-object p1, p2, Lcom/google/android/material/badge/BadgeState$State;->i:Ljava/util/Locale;

    .line 660
    .line 661
    iget-object v0, p0, Lnh;->b:Lcom/google/android/material/badge/BadgeState$State;

    .line 662
    .line 663
    if-nez p1, :cond_1b

    .line 664
    .line 665
    sget-object p1, Ljava/util/Locale$Category;->FORMAT:Ljava/util/Locale$Category;

    .line 666
    .line 667
    invoke-static {p1}, Ljava/util/Locale;->getDefault(Ljava/util/Locale$Category;)Ljava/util/Locale;

    .line 668
    .line 669
    .line 670
    move-result-object p1

    .line 671
    iput-object p1, v0, Lcom/google/android/material/badge/BadgeState$State;->i:Ljava/util/Locale;

    .line 672
    .line 673
    goto :goto_11

    .line 674
    :cond_1b
    iput-object p1, v0, Lcom/google/android/material/badge/BadgeState$State;->i:Ljava/util/Locale;

    .line 675
    .line 676
    :goto_11
    iput-object p2, p0, Lnh;->a:Lcom/google/android/material/badge/BadgeState$State;

    .line 677
    .line 678
    return-void
.end method

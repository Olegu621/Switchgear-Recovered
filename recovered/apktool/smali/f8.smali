.class public final Lf8;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La13;Lt03;)V
    .locals 0

    .line 1
    const/16 p2, 0x14

    .line 2
    .line 3
    iput p2, p0, Lf8;->a:I

    .line 4
    .line 5
    iput-object p1, p0, Lf8;->b:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 12
    iput p2, p0, Lf8;->a:I

    iput-object p1, p0, Lf8;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lf8;->a:I

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    iget-object p0, p0, Lf8;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    const-string v0, "Encoder doesn\'t support the provided bitRate: "

    .line 13
    .line 14
    check-cast p0, Lio/sentry/android/core/d;

    .line 15
    .line 16
    iget-object v2, p0, Lio/sentry/android/core/d;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lio/sentry/android/replay/video/a;

    .line 19
    .line 20
    iget-object v3, p0, Lio/sentry/android/core/d;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, Lio/sentry/m6;

    .line 23
    .line 24
    iget-object v5, v2, Lio/sentry/android/replay/video/a;->f:Ljava/lang/String;

    .line 25
    .line 26
    iget v6, v2, Lio/sentry/android/replay/video/a;->e:I

    .line 27
    .line 28
    :try_start_0
    iget-object p0, p0, Lio/sentry/android/core/d;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Landroid/media/MediaCodec;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/media/MediaCodec;->getCodecInfo()Landroid/media/MediaCodecInfo;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0, v5}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getBitrateRange()Landroid/util/Range;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    invoke-virtual {v7, v8}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-nez v7, :cond_0

    .line 57
    .line 58
    invoke-virtual {v3}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    sget-object v8, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 63
    .line 64
    new-instance v9, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v0, ", the value will be clamped to the closest one"

    .line 73
    .line 74
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    new-array v4, v4, [Ljava/lang/Object;

    .line 82
    .line 83
    invoke-interface {v7, v8, v0, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getBitrateRange()Landroid/util/Range;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {p0, v0}, Landroid/util/Range;->clamp(Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    check-cast p0, Ljava/lang/Number;

    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    goto :goto_0

    .line 108
    :catchall_0
    move-exception p0

    .line 109
    invoke-virtual {v3}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    sget-object v3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 114
    .line 115
    const-string v4, "Could not retrieve MediaCodec info"

    .line 116
    .line 117
    invoke-interface {v0, v3, v4, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    :cond_0
    :goto_0
    iget p0, v2, Lio/sentry/android/replay/video/a;->b:I

    .line 121
    .line 122
    iget v0, v2, Lio/sentry/android/replay/video/a;->c:I

    .line 123
    .line 124
    invoke-static {v5, p0, v0}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    const-string v0, "color-format"

    .line 132
    .line 133
    const v3, 0x7f000789

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v0, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 137
    .line 138
    .line 139
    const-string v0, "bitrate"

    .line 140
    .line 141
    invoke-virtual {p0, v0, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 142
    .line 143
    .line 144
    iget v0, v2, Lio/sentry/android/replay/video/a;->d:I

    .line 145
    .line 146
    int-to-float v0, v0

    .line 147
    const-string v2, "frame-rate"

    .line 148
    .line 149
    invoke-virtual {p0, v2, v0}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 150
    .line 151
    .line 152
    const-string v0, "i-frame-interval"

    .line 153
    .line 154
    invoke-virtual {p0, v0, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 155
    .line 156
    .line 157
    return-object p0

    .line 158
    :pswitch_0
    new-instance v0, Landroid/graphics/Canvas;

    .line 159
    .line 160
    check-cast p0, Lio/sentry/android/replay/util/e;

    .line 161
    .line 162
    iget-object p0, p0, Lio/sentry/android/replay/util/e;->a:Lp51;

    .line 163
    .line 164
    invoke-interface {p0}, Lp51;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    check-cast p0, Landroid/graphics/Bitmap;

    .line 169
    .line 170
    invoke-direct {v0, p0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 171
    .line 172
    .line 173
    return-object v0

    .line 174
    :pswitch_1
    new-instance v0, Landroid/graphics/Matrix;

    .line 175
    .line 176
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 177
    .line 178
    .line 179
    check-cast p0, Lio/sentry/android/replay/screenshot/c;

    .line 180
    .line 181
    iget-object p0, p0, Lio/sentry/android/replay/screenshot/c;->d:Lio/sentry/android/replay/x;

    .line 182
    .line 183
    iget v1, p0, Lio/sentry/android/replay/x;->c:F

    .line 184
    .line 185
    iget p0, p0, Lio/sentry/android/replay/x;->d:F

    .line 186
    .line 187
    invoke-virtual {v0, v1, p0}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 188
    .line 189
    .line 190
    return-object v0

    .line 191
    :pswitch_2
    check-cast p0, Lio/sentry/android/replay/w;

    .line 192
    .line 193
    iget-object p0, p0, Lio/sentry/android/replay/w;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 194
    .line 195
    invoke-virtual {p0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 196
    .line 197
    .line 198
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_3
    check-cast p0, Lg23;

    .line 202
    .line 203
    iget v0, p0, Lg23;->a:I

    .line 204
    .line 205
    int-to-long v0, v0

    .line 206
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    const/16 v1, 0x20

    .line 211
    .line 212
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    iget v2, p0, Lg23;->b:I

    .line 217
    .line 218
    int-to-long v2, v2

    .line 219
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    iget p0, p0, Lg23;->c:I

    .line 232
    .line 233
    int-to-long v1, p0

    .line 234
    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    invoke-virtual {v0, p0}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    return-object p0

    .line 243
    :pswitch_4
    check-cast p0, La13;

    .line 244
    .line 245
    iget-object v0, p0, La13;->a:Lfb1;

    .line 246
    .line 247
    invoke-virtual {v0}, Lfb1;->e()Li03;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    const-string v1, "Clear User Session finished with success"

    .line 252
    .line 253
    invoke-interface {v0, v1, v2}, Li03;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0}, La13;->b()Lcom/usercentrics/sdk/UsercentricsReadyStatus;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    invoke-static {p0}, Lcom/supercell/titan/usercentrics/UsercentricsSDK;->a(Lcom/usercentrics/sdk/UsercentricsReadyStatus;)Lkotlin/Unit;

    .line 261
    .line 262
    .line 263
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    return-object p0

    .line 266
    :pswitch_5
    check-cast p0, Llz;

    .line 267
    .line 268
    invoke-virtual {p0}, Llz;->invoke()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 272
    .line 273
    return-object p0

    .line 274
    :pswitch_6
    sget-object v0, Le03;->b:Las0;

    .line 275
    .line 276
    new-instance v1, Lo42;

    .line 277
    .line 278
    invoke-direct {v1, p0}, Lo42;-><init>(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v1}, Las0;->a(Ljava/io/Serializable;)V

    .line 282
    .line 283
    .line 284
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 285
    .line 286
    return-object p0

    .line 287
    :pswitch_7
    check-cast p0, Lnl1;

    .line 288
    .line 289
    iget-object p0, p0, Lnl1;->a:Lgv1;

    .line 290
    .line 291
    iget-object v0, p0, Lgv1;->b:Lod2;

    .line 292
    .line 293
    sget-object v1, Lfh2;->a:[Lfh2;

    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    iget-object v1, v0, Lod2;->a:Landroid/content/SharedPreferences;

    .line 299
    .line 300
    const-string v3, "ui_variant"

    .line 301
    .line 302
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    if-eqz v1, :cond_2

    .line 307
    .line 308
    invoke-static {v1}, Lhu0;->V(Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    if-nez v1, :cond_1

    .line 313
    .line 314
    goto :goto_1

    .line 315
    :cond_1
    invoke-virtual {v0, v3}, Lod2;->a(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-static {v1}, Lbw1;->valueOf(Ljava/lang/String;)Lbw1;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    :cond_2
    :goto_1
    if-eqz v2, :cond_3

    .line 323
    .line 324
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    goto :goto_2

    .line 329
    :cond_3
    iget-object p0, p0, Lgv1;->a:Lil1;

    .line 330
    .line 331
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    const-string p0, "predefined"

    .line 335
    .line 336
    :goto_2
    return-object p0

    .line 337
    :pswitch_8
    check-cast p0, Lcom/usercentrics/sdk/ui/components/links/UCLink;

    .line 338
    .line 339
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucLinkText:I

    .line 340
    .line 341
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 346
    .line 347
    return-object p0

    .line 348
    :pswitch_9
    check-cast p0, Lqu2;

    .line 349
    .line 350
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    sget v0, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerCardsVerticalMargin:I

    .line 355
    .line 356
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 357
    .line 358
    .line 359
    move-result p0

    .line 360
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 361
    .line 362
    .line 363
    move-result-object p0

    .line 364
    return-object p0

    .line 365
    :pswitch_a
    check-cast p0, Lhu2;

    .line 366
    .line 367
    invoke-virtual {p0}, Lhu2;->invoke()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 371
    .line 372
    return-object p0

    .line 373
    :pswitch_b
    check-cast p0, Lra2;

    .line 374
    .line 375
    iget-object p0, p0, Lra2;->c:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast p0, Lhk2;

    .line 378
    .line 379
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object p0

    .line 383
    check-cast p0, Loz2;

    .line 384
    .line 385
    invoke-interface {p0}, Loz2;->b()Lhu1;

    .line 386
    .line 387
    .line 388
    move-result-object p0

    .line 389
    return-object p0

    .line 390
    :pswitch_c
    check-cast p0, Lcom/usercentrics/sdk/ui/components/cards/UCCardSections;

    .line 391
    .line 392
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 393
    .line 394
    .line 395
    move-result-object p0

    .line 396
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    sget v0, Lcom/usercentrics/sdk/ui/R$dimen;->ucCardVerticalMargin:I

    .line 401
    .line 402
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 403
    .line 404
    .line 405
    move-result p0

    .line 406
    float-to-int p0, p0

    .line 407
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 408
    .line 409
    .line 410
    move-result-object p0

    .line 411
    return-object p0

    .line 412
    :pswitch_d
    check-cast p0, Lys2;

    .line 413
    .line 414
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 415
    .line 416
    .line 417
    move-result-object p0

    .line 418
    sget v0, Lcom/usercentrics/sdk/ui/R$dimen;->ucFirstLayerPopupMargin:I

    .line 419
    .line 420
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 421
    .line 422
    .line 423
    move-result p0

    .line 424
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 425
    .line 426
    .line 427
    move-result-object p0

    .line 428
    return-object p0

    .line 429
    :pswitch_e
    sget-object v0, Ln03;->Companion:Lm03;

    .line 430
    .line 431
    check-cast p0, Lbl2;

    .line 432
    .line 433
    iget-object p0, p0, Lbl2;->b:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 434
    .line 435
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    iget-object v0, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->e:Ljava/util/List;

    .line 439
    .line 440
    new-instance v1, Lwa3;

    .line 441
    .line 442
    const/16 v2, 0x11

    .line 443
    .line 444
    invoke-direct {v1, v2}, Lwa3;-><init>(I)V

    .line 445
    .line 446
    .line 447
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->E(Ljava/util/Comparator;Ljava/lang/Iterable;)Ljava/util/List;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    new-instance v1, Ljava/util/ArrayList;

    .line 452
    .line 453
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 454
    .line 455
    .line 456
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 461
    .line 462
    .line 463
    move-result v2

    .line 464
    if-eqz v2, :cond_e

    .line 465
    .line 466
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    check-cast v2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;

    .line 471
    .line 472
    iget-object v5, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->b:Ljava/util/List;

    .line 473
    .line 474
    new-instance v6, Ljava/util/ArrayList;

    .line 475
    .line 476
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 477
    .line 478
    .line 479
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 480
    .line 481
    .line 482
    move-result-object v5

    .line 483
    :cond_4
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 484
    .line 485
    .line 486
    move-result v7

    .line 487
    if-eqz v7, :cond_5

    .line 488
    .line 489
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v7

    .line 493
    move-object v8, v7

    .line 494
    check-cast v8, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;

    .line 495
    .line 496
    iget-object v9, v2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->d:Ljava/util/List;

    .line 497
    .line 498
    iget v8, v8, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->c:I

    .line 499
    .line 500
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 501
    .line 502
    .line 503
    move-result-object v8

    .line 504
    invoke-interface {v9, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v8

    .line 508
    if-eqz v8, :cond_4

    .line 509
    .line 510
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    goto :goto_4

    .line 514
    :cond_5
    iget-object v5, p0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;->c:Ljava/util/List;

    .line 515
    .line 516
    new-instance v7, Ljava/util/ArrayList;

    .line 517
    .line 518
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 519
    .line 520
    .line 521
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 522
    .line 523
    .line 524
    move-result-object v5

    .line 525
    :cond_6
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 526
    .line 527
    .line 528
    move-result v8

    .line 529
    if-eqz v8, :cond_7

    .line 530
    .line 531
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v8

    .line 535
    move-object v9, v8

    .line 536
    check-cast v9, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;

    .line 537
    .line 538
    iget-object v10, v2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->e:Ljava/util/List;

    .line 539
    .line 540
    iget v9, v9, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->c:I

    .line 541
    .line 542
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 543
    .line 544
    .line 545
    move-result-object v9

    .line 546
    invoke-interface {v10, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v9

    .line 550
    if-eqz v9, :cond_6

    .line 551
    .line 552
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    goto :goto_5

    .line 556
    :cond_7
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 557
    .line 558
    .line 559
    move-result v5

    .line 560
    if-eqz v5, :cond_8

    .line 561
    .line 562
    goto :goto_6

    .line 563
    :cond_8
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 564
    .line 565
    .line 566
    move-result-object v5

    .line 567
    :cond_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 568
    .line 569
    .line 570
    move-result v6

    .line 571
    if-eqz v6, :cond_a

    .line 572
    .line 573
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v6

    .line 577
    check-cast v6, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;

    .line 578
    .line 579
    iget-object v6, v6, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->e:Ljava/lang/Boolean;

    .line 580
    .line 581
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 582
    .line 583
    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    move-result v6

    .line 587
    if-eqz v6, :cond_9

    .line 588
    .line 589
    goto :goto_7

    .line 590
    :cond_a
    :goto_6
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 591
    .line 592
    .line 593
    move-result v5

    .line 594
    if-eqz v5, :cond_b

    .line 595
    .line 596
    goto :goto_8

    .line 597
    :cond_b
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 598
    .line 599
    .line 600
    move-result-object v5

    .line 601
    :cond_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 602
    .line 603
    .line 604
    move-result v6

    .line 605
    if-eqz v6, :cond_d

    .line 606
    .line 607
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v6

    .line 611
    check-cast v6, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;

    .line 612
    .line 613
    iget-object v6, v6, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->e:Ljava/lang/Boolean;

    .line 614
    .line 615
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 616
    .line 617
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    move-result v6

    .line 621
    if-eqz v6, :cond_c

    .line 622
    .line 623
    :goto_7
    move v5, v3

    .line 624
    goto :goto_9

    .line 625
    :cond_d
    :goto_8
    move v5, v4

    .line 626
    :goto_9
    new-instance v6, Leg2;

    .line 627
    .line 628
    invoke-direct {v6, v5, v2}, Leg2;-><init>(ZLcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    goto/16 :goto_3

    .line 635
    .line 636
    :cond_e
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 637
    .line 638
    .line 639
    move-result-object p0

    .line 640
    return-object p0

    .line 641
    :pswitch_f
    check-cast p0, Laa2;

    .line 642
    .line 643
    iget-object v0, p0, Laa2;->j:[Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 644
    .line 645
    invoke-static {p0, v0}, Lk50;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;[Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 646
    .line 647
    .line 648
    move-result p0

    .line 649
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 650
    .line 651
    .line 652
    move-result-object p0

    .line 653
    return-object p0

    .line 654
    :pswitch_10
    check-cast p0, Lu33;

    .line 655
    .line 656
    invoke-static {p0}, Lmn0;->s(Lu33;)Lt62;

    .line 657
    .line 658
    .line 659
    move-result-object p0

    .line 660
    return-object p0

    .line 661
    :pswitch_11
    check-cast p0, Lm62;

    .line 662
    .line 663
    iget-object p0, p0, Lm62;->c:Lnl1;

    .line 664
    .line 665
    invoke-virtual {p0}, Lnl1;->a()Le13;

    .line 666
    .line 667
    .line 668
    move-result-object p0

    .line 669
    return-object p0

    .line 670
    :pswitch_12
    check-cast p0, Lcb1;

    .line 671
    .line 672
    invoke-virtual {p0}, Lcb1;->invoke()Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object p0

    .line 676
    check-cast p0, Ljava/io/File;

    .line 677
    .line 678
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 683
    .line 684
    .line 685
    const/16 v5, 0x2e

    .line 686
    .line 687
    invoke-static {v0, v5, v4, v1}, Lkotlin/text/StringsKt;->F(Ljava/lang/String;CII)I

    .line 688
    .line 689
    .line 690
    move-result v1

    .line 691
    const/4 v4, -0x1

    .line 692
    if-ne v1, v4, :cond_f

    .line 693
    .line 694
    const-string v0, ""

    .line 695
    .line 696
    goto :goto_a

    .line 697
    :cond_f
    add-int/2addr v1, v3

    .line 698
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 699
    .line 700
    .line 701
    move-result v3

    .line 702
    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    :goto_a
    const-string v1, "preferences_pb"

    .line 707
    .line 708
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 709
    .line 710
    .line 711
    move-result v0

    .line 712
    if-eqz v0, :cond_10

    .line 713
    .line 714
    invoke-virtual {p0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    goto :goto_b

    .line 722
    :cond_10
    const-string v0, "File extension for file: "

    .line 723
    .line 724
    const-string v1, " does not match required extension for Preferences file: preferences_pb"

    .line 725
    .line 726
    invoke-static {p0, v0, v1}, Lds0;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 727
    .line 728
    .line 729
    :goto_b
    return-object v2

    .line 730
    :pswitch_13
    sget-object v0, Llt1;->k:Llt1;

    .line 731
    .line 732
    new-array v1, v4, [Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 733
    .line 734
    new-instance v2, Lo;

    .line 735
    .line 736
    check-cast p0, Lmt1;

    .line 737
    .line 738
    const/16 v3, 0xd

    .line 739
    .line 740
    invoke-direct {v2, p0, v3}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 741
    .line 742
    .line 743
    const-string v3, "kotlinx.serialization.Polymorphic"

    .line 744
    .line 745
    invoke-static {v3, v0, v1, v2}, Lhu0;->K(Ljava/lang/String;Lpy0;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Laa2;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    iget-object p0, p0, Lmt1;->a:Ldv;

    .line 750
    .line 751
    new-instance v1, Lx00;

    .line 752
    .line 753
    invoke-direct {v1, v0, p0}, Lx00;-><init>(Laa2;Ldv;)V

    .line 754
    .line 755
    .line 756
    return-object v1

    .line 757
    :pswitch_14
    sget-object v0, Lei2;->n:Lei2;

    .line 758
    .line 759
    new-array v1, v4, [Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 760
    .line 761
    new-instance v2, Lo;

    .line 762
    .line 763
    check-cast p0, Lep1;

    .line 764
    .line 765
    const/16 v3, 0xb

    .line 766
    .line 767
    invoke-direct {v2, p0, v3}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 768
    .line 769
    .line 770
    const-string p0, "kotlin.Unit"

    .line 771
    .line 772
    invoke-static {p0, v0, v1, v2}, Lhu0;->K(Ljava/lang/String;Lpy0;[Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function1;)Laa2;

    .line 773
    .line 774
    .line 775
    move-result-object p0

    .line 776
    return-object p0

    .line 777
    :pswitch_15
    check-cast p0, Lvf1;

    .line 778
    .line 779
    new-instance v0, Lpc;

    .line 780
    .line 781
    invoke-direct {v0, v3}, Lpc;-><init>(I)V

    .line 782
    .line 783
    .line 784
    invoke-virtual {p0, v0, v2, v2, v2}, Lvf1;->c(Lk;Lif1;Lzd1;Ltd1;)V

    .line 785
    .line 786
    .line 787
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 788
    .line 789
    return-object p0

    .line 790
    :pswitch_16
    check-cast p0, Lsx0;

    .line 791
    .line 792
    iget-object p0, p0, Lsx0;->d:Lp91;

    .line 793
    .line 794
    iget-object p0, p0, Lp91;->b:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 795
    .line 796
    return-object p0

    .line 797
    :pswitch_17
    check-cast p0, Lf8;

    .line 798
    .line 799
    invoke-virtual {p0}, Lf8;->invoke()Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 803
    .line 804
    return-object p0

    .line 805
    :pswitch_18
    check-cast p0, Ljava/net/HttpURLConnection;

    .line 806
    .line 807
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 808
    .line 809
    .line 810
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 811
    .line 812
    return-object p0

    .line 813
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

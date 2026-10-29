.class public final synthetic Lkr;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lc00;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lkr;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Lcb;I)V
    .locals 0

    .line 7
    iput p2, p0, Lkr;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 12

    .line 1
    iget p0, p0, Lkr;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "DeviceQuirks"

    .line 5
    .line 6
    const-string v2, "HUAWEI"

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    packed-switch p0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Lqj2;

    .line 14
    .line 15
    invoke-static {p1}, Lcom/supercell/id/scid_plugin/MobileScanner;->b(Lqj2;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    check-cast p1, Lqj2;

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    check-cast p1, Li02;

    .line 23
    .line 24
    new-instance p0, Ler0;

    .line 25
    .line 26
    new-instance v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    sget-object v5, Landroidx/camera/camera2/internal/compat/quirk/ImageCapturePixelHDRPlusQuirk;->a:Ljava/util/List;

    .line 32
    .line 33
    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 34
    .line 35
    invoke-interface {v5, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    const-string v7, "Google"

    .line 40
    .line 41
    if-eqz v5, :cond_0

    .line 42
    .line 43
    sget-object v5, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_0

    .line 50
    .line 51
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 52
    .line 53
    const/16 v8, 0x1a

    .line 54
    .line 55
    if-lt v5, v8, :cond_0

    .line 56
    .line 57
    move v5, v4

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move v5, v3

    .line 60
    :goto_0
    const-class v8, Landroidx/camera/camera2/internal/compat/quirk/ImageCapturePixelHDRPlusQuirk;

    .line 61
    .line 62
    invoke-virtual {p1, v8, v5}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_1

    .line 67
    .line 68
    new-instance v5, Landroidx/camera/camera2/internal/compat/quirk/ImageCapturePixelHDRPlusQuirk;

    .line 69
    .line 70
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    :cond_1
    const-class v5, Landroidx/camera/camera2/internal/compat/quirk/ExtraCroppingQuirk;

    .line 77
    .line 78
    invoke-static {}, Landroidx/camera/camera2/internal/compat/quirk/ExtraCroppingQuirk;->c()Z

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    invoke-virtual {p1, v5, v8}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_2

    .line 87
    .line 88
    new-instance v5, Landroidx/camera/camera2/internal/compat/quirk/ExtraCroppingQuirk;

    .line 89
    .line 90
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    :cond_2
    sget-object v5, Landroidx/camera/camera2/internal/compat/quirk/Nexus4AndroidLTargetAspectRatioQuirk;->a:Ljava/util/List;

    .line 97
    .line 98
    sget-object v5, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 99
    .line 100
    const-string v8, "GOOGLE"

    .line 101
    .line 102
    invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    const-class v8, Landroidx/camera/camera2/internal/compat/quirk/Nexus4AndroidLTargetAspectRatioQuirk;

    .line 106
    .line 107
    invoke-virtual {p1, v8, v3}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    if-eqz v8, :cond_3

    .line 112
    .line 113
    new-instance v8, Landroidx/camera/camera2/internal/compat/quirk/Nexus4AndroidLTargetAspectRatioQuirk;

    .line 114
    .line 115
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    :cond_3
    const-string v8, "OnePlus"

    .line 122
    .line 123
    invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    if-eqz v9, :cond_4

    .line 128
    .line 129
    const-string v9, "OnePlus6"

    .line 130
    .line 131
    sget-object v10, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    if-eqz v9, :cond_4

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_4
    invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    if-eqz v8, :cond_5

    .line 145
    .line 146
    const-string v8, "OnePlus6T"

    .line 147
    .line 148
    sget-object v9, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    if-eqz v8, :cond_5

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_5
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_6

    .line 162
    .line 163
    const-string v2, "HWANE"

    .line 164
    .line 165
    sget-object v8, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v2, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-eqz v2, :cond_6

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_6
    invoke-static {}, Landroidx/camera/camera2/internal/compat/quirk/ExcludedSupportedSizesQuirk;->c()Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    if-nez v2, :cond_8

    .line 179
    .line 180
    invoke-static {}, Landroidx/camera/camera2/internal/compat/quirk/ExcludedSupportedSizesQuirk;->b()Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    if-nez v2, :cond_8

    .line 185
    .line 186
    const-string v2, "REDMI"

    .line 187
    .line 188
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-eqz v2, :cond_7

    .line 193
    .line 194
    const-string v2, "joyeuse"

    .line 195
    .line 196
    sget-object v8, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {v2, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_7

    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_7
    move v2, v3

    .line 206
    goto :goto_2

    .line 207
    :cond_8
    :goto_1
    move v2, v4

    .line 208
    :goto_2
    const-class v8, Landroidx/camera/camera2/internal/compat/quirk/ExcludedSupportedSizesQuirk;

    .line 209
    .line 210
    invoke-virtual {p1, v8, v2}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-eqz v2, :cond_9

    .line 215
    .line 216
    new-instance v2, Landroidx/camera/camera2/internal/compat/quirk/ExcludedSupportedSizesQuirk;

    .line 217
    .line 218
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    :cond_9
    sget-object v2, Landroidx/camera/camera2/internal/compat/quirk/CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;->a:Ljava/util/List;

    .line 225
    .line 226
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 227
    .line 228
    invoke-virtual {v6, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v9

    .line 232
    invoke-interface {v2, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    const-class v9, Landroidx/camera/camera2/internal/compat/quirk/CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;

    .line 237
    .line 238
    invoke-virtual {p1, v9, v2}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    if-eqz v2, :cond_a

    .line 243
    .line 244
    new-instance v2, Landroidx/camera/camera2/internal/compat/quirk/CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;

    .line 245
    .line 246
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    :cond_a
    sget-object v2, Landroidx/camera/camera2/internal/compat/quirk/PreviewPixelHDRnetQuirk;->a:Ljava/util/List;

    .line 253
    .line 254
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 255
    .line 256
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    if-eqz v7, :cond_b

    .line 261
    .line 262
    sget-object v7, Landroidx/camera/camera2/internal/compat/quirk/PreviewPixelHDRnetQuirk;->a:Ljava/util/List;

    .line 263
    .line 264
    sget-object v9, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 265
    .line 266
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 267
    .line 268
    .line 269
    move-result-object v10

    .line 270
    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    invoke-interface {v7, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v7

    .line 278
    if-eqz v7, :cond_b

    .line 279
    .line 280
    move v7, v4

    .line 281
    goto :goto_3

    .line 282
    :cond_b
    move v7, v3

    .line 283
    :goto_3
    const-class v9, Landroidx/camera/camera2/internal/compat/quirk/PreviewPixelHDRnetQuirk;

    .line 284
    .line 285
    invoke-virtual {p1, v9, v7}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 286
    .line 287
    .line 288
    move-result v7

    .line 289
    if-eqz v7, :cond_c

    .line 290
    .line 291
    new-instance v7, Landroidx/camera/camera2/internal/compat/quirk/PreviewPixelHDRnetQuirk;

    .line 292
    .line 293
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    :cond_c
    const-string v7, "SAMSUNG"

    .line 300
    .line 301
    invoke-virtual {v2, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v7

    .line 309
    if-eqz v7, :cond_d

    .line 310
    .line 311
    invoke-virtual {v6, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v7

    .line 315
    const-string v9, "SM-A716"

    .line 316
    .line 317
    invoke-virtual {v7, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 318
    .line 319
    .line 320
    move-result v7

    .line 321
    if-eqz v7, :cond_d

    .line 322
    .line 323
    move v7, v4

    .line 324
    goto :goto_4

    .line 325
    :cond_d
    move v7, v3

    .line 326
    :goto_4
    const-class v9, Landroidx/camera/camera2/internal/compat/quirk/StillCaptureFlashStopRepeatingQuirk;

    .line 327
    .line 328
    invoke-virtual {p1, v9, v7}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 329
    .line 330
    .line 331
    move-result v7

    .line 332
    if-eqz v7, :cond_e

    .line 333
    .line 334
    new-instance v7, Landroidx/camera/camera2/internal/compat/quirk/StillCaptureFlashStopRepeatingQuirk;

    .line 335
    .line 336
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    :cond_e
    sget-object v7, Landroidx/camera/camera2/internal/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;->a:Ldj2;

    .line 343
    .line 344
    sget-object v7, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 345
    .line 346
    const-string v9, "heroqltevzw"

    .line 347
    .line 348
    invoke-virtual {v9, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 349
    .line 350
    .line 351
    move-result v9

    .line 352
    if-nez v9, :cond_12

    .line 353
    .line 354
    const-string v9, "heroqltetmo"

    .line 355
    .line 356
    invoke-virtual {v9, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    if-eqz v7, :cond_f

    .line 361
    .line 362
    goto :goto_6

    .line 363
    :cond_f
    const-string v7, "google"

    .line 364
    .line 365
    invoke-virtual {v7, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 366
    .line 367
    .line 368
    move-result v7

    .line 369
    if-nez v7, :cond_10

    .line 370
    .line 371
    move v7, v3

    .line 372
    goto :goto_5

    .line 373
    :cond_10
    invoke-virtual {v6, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v7

    .line 377
    sget-object v9, Landroidx/camera/camera2/internal/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;->c:Ljava/util/HashSet;

    .line 378
    .line 379
    invoke-virtual {v9, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v7

    .line 383
    :goto_5
    if-nez v7, :cond_12

    .line 384
    .line 385
    invoke-static {}, Landroidx/camera/camera2/internal/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;->b()Z

    .line 386
    .line 387
    .line 388
    move-result v7

    .line 389
    if-eqz v7, :cond_11

    .line 390
    .line 391
    goto :goto_6

    .line 392
    :cond_11
    move v7, v3

    .line 393
    goto :goto_7

    .line 394
    :cond_12
    :goto_6
    move v7, v4

    .line 395
    :goto_7
    const-class v9, Landroidx/camera/camera2/internal/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;

    .line 396
    .line 397
    invoke-virtual {p1, v9, v7}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 398
    .line 399
    .line 400
    move-result v7

    .line 401
    if-eqz v7, :cond_13

    .line 402
    .line 403
    new-instance v7, Landroidx/camera/camera2/internal/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;

    .line 404
    .line 405
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    :cond_13
    sget-object v7, Landroidx/camera/camera2/internal/compat/quirk/FlashAvailabilityBufferUnderflowQuirk;->a:Ljava/util/HashSet;

    .line 412
    .line 413
    new-instance v9, Landroid/util/Pair;

    .line 414
    .line 415
    invoke-virtual {v2, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    invoke-virtual {v6, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v10

    .line 423
    invoke-direct {v9, v2, v10}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v7, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v2

    .line 430
    const-class v7, Landroidx/camera/camera2/internal/compat/quirk/FlashAvailabilityBufferUnderflowQuirk;

    .line 431
    .line 432
    invoke-virtual {p1, v7, v2}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    if-eqz v2, :cond_14

    .line 437
    .line 438
    new-instance v2, Landroidx/camera/camera2/internal/compat/quirk/FlashAvailabilityBufferUnderflowQuirk;

    .line 439
    .line 440
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    :cond_14
    const-string v2, "Huawei"

    .line 447
    .line 448
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    if-eqz v2, :cond_15

    .line 453
    .line 454
    const-string v2, "mha-l29"

    .line 455
    .line 456
    invoke-virtual {v2, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 457
    .line 458
    .line 459
    move-result v2

    .line 460
    if-eqz v2, :cond_15

    .line 461
    .line 462
    move v2, v4

    .line 463
    goto :goto_8

    .line 464
    :cond_15
    move v2, v3

    .line 465
    :goto_8
    const-class v7, Landroidx/camera/camera2/internal/compat/quirk/RepeatingStreamConstraintForVideoRecordingQuirk;

    .line 466
    .line 467
    invoke-virtual {p1, v7, v2}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    if-eqz v2, :cond_16

    .line 472
    .line 473
    new-instance v2, Landroidx/camera/camera2/internal/compat/quirk/RepeatingStreamConstraintForVideoRecordingQuirk;

    .line 474
    .line 475
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    :cond_16
    const-class v2, Landroidx/camera/camera2/internal/compat/quirk/TextureViewIsClosedQuirk;

    .line 482
    .line 483
    invoke-virtual {p1, v2, v3}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 484
    .line 485
    .line 486
    move-result v2

    .line 487
    if-eqz v2, :cond_17

    .line 488
    .line 489
    new-instance v2, Landroidx/camera/camera2/internal/compat/quirk/TextureViewIsClosedQuirk;

    .line 490
    .line 491
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    :cond_17
    const-class v2, Landroidx/camera/camera2/internal/compat/quirk/CaptureSessionOnClosedNotCalledQuirk;

    .line 498
    .line 499
    invoke-virtual {p1, v2, v3}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 500
    .line 501
    .line 502
    move-result v2

    .line 503
    if-eqz v2, :cond_18

    .line 504
    .line 505
    new-instance v2, Landroidx/camera/camera2/internal/compat/quirk/CaptureSessionOnClosedNotCalledQuirk;

    .line 506
    .line 507
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    :cond_18
    sget-object v2, Landroidx/camera/camera2/internal/compat/quirk/TorchIsClosedAfterImageCapturingQuirk;->a:Ljava/util/List;

    .line 514
    .line 515
    invoke-virtual {v6, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v7

    .line 519
    invoke-interface {v2, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    move-result v2

    .line 523
    const-class v7, Landroidx/camera/camera2/internal/compat/quirk/TorchIsClosedAfterImageCapturingQuirk;

    .line 524
    .line 525
    invoke-virtual {p1, v7, v2}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 526
    .line 527
    .line 528
    move-result v2

    .line 529
    if-eqz v2, :cond_19

    .line 530
    .line 531
    new-instance v2, Landroidx/camera/camera2/internal/compat/quirk/TorchIsClosedAfterImageCapturingQuirk;

    .line 532
    .line 533
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    :cond_19
    sget-object v2, Landroidx/camera/camera2/internal/compat/quirk/ZslDisablerQuirk;->a:Ljava/util/List;

    .line 540
    .line 541
    const-string v2, "samsung"

    .line 542
    .line 543
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 544
    .line 545
    .line 546
    move-result v7

    .line 547
    const-string v9, "xiaomi"

    .line 548
    .line 549
    if-eqz v7, :cond_1a

    .line 550
    .line 551
    sget-object v7, Landroidx/camera/camera2/internal/compat/quirk/ZslDisablerQuirk;->a:Ljava/util/List;

    .line 552
    .line 553
    invoke-static {v7}, Landroidx/camera/camera2/internal/compat/quirk/ZslDisablerQuirk;->b(Ljava/util/List;)Z

    .line 554
    .line 555
    .line 556
    move-result v7

    .line 557
    if-eqz v7, :cond_1a

    .line 558
    .line 559
    goto :goto_9

    .line 560
    :cond_1a
    invoke-virtual {v9, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 561
    .line 562
    .line 563
    move-result v7

    .line 564
    if-eqz v7, :cond_1b

    .line 565
    .line 566
    sget-object v7, Landroidx/camera/camera2/internal/compat/quirk/ZslDisablerQuirk;->b:Ljava/util/List;

    .line 567
    .line 568
    invoke-static {v7}, Landroidx/camera/camera2/internal/compat/quirk/ZslDisablerQuirk;->b(Ljava/util/List;)Z

    .line 569
    .line 570
    .line 571
    move-result v7

    .line 572
    if-eqz v7, :cond_1b

    .line 573
    .line 574
    :goto_9
    move v7, v4

    .line 575
    goto :goto_a

    .line 576
    :cond_1b
    move v7, v3

    .line 577
    :goto_a
    const-class v10, Landroidx/camera/camera2/internal/compat/quirk/ZslDisablerQuirk;

    .line 578
    .line 579
    invoke-virtual {p1, v10, v7}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 580
    .line 581
    .line 582
    move-result v7

    .line 583
    if-eqz v7, :cond_1c

    .line 584
    .line 585
    new-instance v7, Landroidx/camera/camera2/internal/compat/quirk/ZslDisablerQuirk;

    .line 586
    .line 587
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    :cond_1c
    const-string v7, "motorola"

    .line 594
    .line 595
    invoke-virtual {v7, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 596
    .line 597
    .line 598
    move-result v7

    .line 599
    if-eqz v7, :cond_1d

    .line 600
    .line 601
    const-string v7, "moto e5 play"

    .line 602
    .line 603
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 604
    .line 605
    .line 606
    move-result v7

    .line 607
    if-eqz v7, :cond_1d

    .line 608
    .line 609
    move v7, v4

    .line 610
    goto :goto_b

    .line 611
    :cond_1d
    move v7, v3

    .line 612
    :goto_b
    const-class v10, Landroidx/camera/camera2/internal/compat/quirk/ExtraSupportedOutputSizeQuirk;

    .line 613
    .line 614
    invoke-virtual {p1, v10, v7}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 615
    .line 616
    .line 617
    move-result v7

    .line 618
    if-eqz v7, :cond_1e

    .line 619
    .line 620
    new-instance v7, Landroidx/camera/camera2/internal/compat/quirk/ExtraSupportedOutputSizeQuirk;

    .line 621
    .line 622
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    :cond_1e
    sget-object v7, Landroidx/camera/camera2/internal/compat/quirk/InvalidVideoProfilesQuirk;->a:Ljava/util/List;

    .line 629
    .line 630
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 631
    .line 632
    .line 633
    move-result v2

    .line 634
    const-string v7, "tp1a"

    .line 635
    .line 636
    if-eqz v2, :cond_1f

    .line 637
    .line 638
    sget-object v2, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 639
    .line 640
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 641
    .line 642
    invoke-virtual {v2, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v2

    .line 646
    invoke-virtual {v2, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 647
    .line 648
    .line 649
    move-result v2

    .line 650
    if-eqz v2, :cond_1f

    .line 651
    .line 652
    goto/16 :goto_c

    .line 653
    .line 654
    :cond_1f
    sget-object v2, Landroidx/camera/camera2/internal/compat/quirk/InvalidVideoProfilesQuirk;->a:Ljava/util/List;

    .line 655
    .line 656
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 657
    .line 658
    invoke-virtual {v6, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v11

    .line 662
    invoke-interface {v2, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    move-result v2

    .line 666
    if-eqz v2, :cond_20

    .line 667
    .line 668
    sget-object v2, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 669
    .line 670
    invoke-virtual {v2, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v11

    .line 674
    invoke-virtual {v11, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 675
    .line 676
    .line 677
    move-result v11

    .line 678
    if-nez v11, :cond_24

    .line 679
    .line 680
    invoke-virtual {v2, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    const-string v11, "td1a"

    .line 685
    .line 686
    invoke-virtual {v2, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 687
    .line 688
    .line 689
    move-result v2

    .line 690
    if-eqz v2, :cond_20

    .line 691
    .line 692
    goto :goto_c

    .line 693
    :cond_20
    const-string v2, "redmi"

    .line 694
    .line 695
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 696
    .line 697
    .line 698
    move-result v2

    .line 699
    if-nez v2, :cond_21

    .line 700
    .line 701
    invoke-virtual {v9, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 702
    .line 703
    .line 704
    move-result v2

    .line 705
    if-eqz v2, :cond_22

    .line 706
    .line 707
    :cond_21
    sget-object v2, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 708
    .line 709
    invoke-virtual {v2, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v5

    .line 713
    const-string v9, "tkq1"

    .line 714
    .line 715
    invoke-virtual {v5, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 716
    .line 717
    .line 718
    move-result v5

    .line 719
    if-nez v5, :cond_24

    .line 720
    .line 721
    invoke-virtual {v2, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v2

    .line 725
    invoke-virtual {v2, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 726
    .line 727
    .line 728
    move-result v2

    .line 729
    if-eqz v2, :cond_22

    .line 730
    .line 731
    goto :goto_c

    .line 732
    :cond_22
    sget-object v2, Landroidx/camera/camera2/internal/compat/quirk/InvalidVideoProfilesQuirk;->b:Ljava/util/List;

    .line 733
    .line 734
    invoke-virtual {v6, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v5

    .line 738
    invoke-interface {v2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 739
    .line 740
    .line 741
    move-result v2

    .line 742
    const/16 v5, 0x21

    .line 743
    .line 744
    if-eqz v2, :cond_23

    .line 745
    .line 746
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 747
    .line 748
    if-ne v2, v5, :cond_23

    .line 749
    .line 750
    goto :goto_c

    .line 751
    :cond_23
    sget-object v2, Landroidx/camera/camera2/internal/compat/quirk/InvalidVideoProfilesQuirk;->c:Ljava/util/List;

    .line 752
    .line 753
    invoke-virtual {v6, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v7

    .line 757
    invoke-interface {v2, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 758
    .line 759
    .line 760
    move-result v2

    .line 761
    if-eqz v2, :cond_25

    .line 762
    .line 763
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 764
    .line 765
    if-ne v2, v5, :cond_25

    .line 766
    .line 767
    :cond_24
    :goto_c
    move v3, v4

    .line 768
    :cond_25
    const-class v2, Landroidx/camera/camera2/internal/compat/quirk/InvalidVideoProfilesQuirk;

    .line 769
    .line 770
    invoke-virtual {p1, v2, v3}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 771
    .line 772
    .line 773
    move-result v2

    .line 774
    if-eqz v2, :cond_26

    .line 775
    .line 776
    new-instance v2, Landroidx/camera/camera2/internal/compat/quirk/InvalidVideoProfilesQuirk;

    .line 777
    .line 778
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 779
    .line 780
    .line 781
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 782
    .line 783
    .line 784
    :cond_26
    const-string v2, "samsungexynos7870"

    .line 785
    .line 786
    sget-object v3, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    .line 787
    .line 788
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 789
    .line 790
    .line 791
    move-result v2

    .line 792
    const-class v3, Landroidx/camera/camera2/internal/compat/quirk/Preview3AThreadCrashQuirk;

    .line 793
    .line 794
    invoke-virtual {p1, v3, v2}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 795
    .line 796
    .line 797
    move-result v2

    .line 798
    if-eqz v2, :cond_27

    .line 799
    .line 800
    new-instance v2, Landroidx/camera/camera2/internal/compat/quirk/Preview3AThreadCrashQuirk;

    .line 801
    .line 802
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 806
    .line 807
    .line 808
    :cond_27
    sget-object v2, Landroidx/camera/camera2/internal/compat/quirk/SmallDisplaySizeQuirk;->a:Ljava/util/HashMap;

    .line 809
    .line 810
    invoke-virtual {v6, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object v3

    .line 814
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 815
    .line 816
    .line 817
    move-result v2

    .line 818
    const-class v3, Landroidx/camera/camera2/internal/compat/quirk/SmallDisplaySizeQuirk;

    .line 819
    .line 820
    invoke-virtual {p1, v3, v2}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 821
    .line 822
    .line 823
    move-result p1

    .line 824
    if-eqz p1, :cond_28

    .line 825
    .line 826
    new-instance p1, Landroidx/camera/camera2/internal/compat/quirk/SmallDisplaySizeQuirk;

    .line 827
    .line 828
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 829
    .line 830
    .line 831
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 832
    .line 833
    .line 834
    :cond_28
    invoke-direct {p0, v0}, Ler0;-><init>(Ljava/util/List;)V

    .line 835
    .line 836
    .line 837
    sput-object p0, Lf80;->a:Ler0;

    .line 838
    .line 839
    sget-object p0, Lf80;->a:Ler0;

    .line 840
    .line 841
    invoke-static {p0}, Ler0;->B(Ler0;)V

    .line 842
    .line 843
    .line 844
    invoke-static {v1}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    return-void

    .line 848
    :pswitch_2
    check-cast p1, Li02;

    .line 849
    .line 850
    new-instance p0, Ler0;

    .line 851
    .line 852
    new-instance v0, Ljava/util/ArrayList;

    .line 853
    .line 854
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 855
    .line 856
    .line 857
    sget-object v5, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 858
    .line 859
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 860
    .line 861
    .line 862
    move-result v2

    .line 863
    if-eqz v2, :cond_29

    .line 864
    .line 865
    const-string v2, "SNE-LX1"

    .line 866
    .line 867
    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 868
    .line 869
    invoke-virtual {v2, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 870
    .line 871
    .line 872
    move-result v2

    .line 873
    if-eqz v2, :cond_29

    .line 874
    .line 875
    goto :goto_d

    .line 876
    :cond_29
    const-string v2, "HONOR"

    .line 877
    .line 878
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 879
    .line 880
    .line 881
    move-result v2

    .line 882
    if-eqz v2, :cond_2a

    .line 883
    .line 884
    const-string v2, "STK-LX1"

    .line 885
    .line 886
    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 887
    .line 888
    invoke-virtual {v2, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 889
    .line 890
    .line 891
    move-result v2

    .line 892
    if-eqz v2, :cond_2a

    .line 893
    .line 894
    :goto_d
    move v2, v4

    .line 895
    goto :goto_e

    .line 896
    :cond_2a
    sget-object v2, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 897
    .line 898
    const-string v6, "generic"

    .line 899
    .line 900
    invoke-virtual {v2, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 901
    .line 902
    .line 903
    move-result v7

    .line 904
    if-nez v7, :cond_2c

    .line 905
    .line 906
    const-string v7, "unknown"

    .line 907
    .line 908
    invoke-virtual {v2, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 909
    .line 910
    .line 911
    move-result v2

    .line 912
    if-nez v2, :cond_2c

    .line 913
    .line 914
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 915
    .line 916
    const-string v7, "google_sdk"

    .line 917
    .line 918
    invoke-virtual {v2, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 919
    .line 920
    .line 921
    move-result v8

    .line 922
    if-nez v8, :cond_2c

    .line 923
    .line 924
    const-string v8, "Emulator"

    .line 925
    .line 926
    invoke-virtual {v2, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 927
    .line 928
    .line 929
    move-result v8

    .line 930
    if-nez v8, :cond_2c

    .line 931
    .line 932
    const-string v8, "Cuttlefish"

    .line 933
    .line 934
    invoke-virtual {v2, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 935
    .line 936
    .line 937
    move-result v8

    .line 938
    if-nez v8, :cond_2c

    .line 939
    .line 940
    const-string v8, "Android SDK built for x86"

    .line 941
    .line 942
    invoke-virtual {v2, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 943
    .line 944
    .line 945
    move-result v2

    .line 946
    if-nez v2, :cond_2c

    .line 947
    .line 948
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 949
    .line 950
    const-string v8, "Genymotion"

    .line 951
    .line 952
    invoke-virtual {v2, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 953
    .line 954
    .line 955
    move-result v2

    .line 956
    if-nez v2, :cond_2c

    .line 957
    .line 958
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 959
    .line 960
    .line 961
    move-result v2

    .line 962
    if-eqz v2, :cond_2b

    .line 963
    .line 964
    sget-object v2, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 965
    .line 966
    invoke-virtual {v2, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 967
    .line 968
    .line 969
    move-result v2

    .line 970
    if-nez v2, :cond_2c

    .line 971
    .line 972
    :cond_2b
    sget-object v2, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 973
    .line 974
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 975
    .line 976
    .line 977
    move-result v2

    .line 978
    if-nez v2, :cond_2c

    .line 979
    .line 980
    sget-object v2, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    .line 981
    .line 982
    const-string v6, "ranchu"

    .line 983
    .line 984
    invoke-virtual {v2, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 985
    .line 986
    .line 987
    :cond_2c
    move v2, v3

    .line 988
    :goto_e
    const-class v6, Landroidx/camera/core/internal/compat/quirk/ImageCaptureRotationOptionQuirk;

    .line 989
    .line 990
    invoke-virtual {p1, v6, v2}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 991
    .line 992
    .line 993
    move-result v2

    .line 994
    if-eqz v2, :cond_2d

    .line 995
    .line 996
    new-instance v2, Landroidx/camera/core/internal/compat/quirk/ImageCaptureRotationOptionQuirk;

    .line 997
    .line 998
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1002
    .line 1003
    .line 1004
    :cond_2d
    const-class v2, Landroidx/camera/core/internal/compat/quirk/SurfaceOrderQuirk;

    .line 1005
    .line 1006
    invoke-virtual {p1, v2, v4}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 1007
    .line 1008
    .line 1009
    move-result v2

    .line 1010
    if-eqz v2, :cond_2e

    .line 1011
    .line 1012
    new-instance v2, Landroidx/camera/core/internal/compat/quirk/SurfaceOrderQuirk;

    .line 1013
    .line 1014
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1018
    .line 1019
    .line 1020
    :cond_2e
    sget-object v2, Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;->a:Ljava/util/HashSet;

    .line 1021
    .line 1022
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1023
    .line 1024
    invoke-virtual {v5, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v6

    .line 1028
    sget-object v7, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1029
    .line 1030
    invoke-virtual {v7, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v8

    .line 1034
    sget-object v9, Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;->a:Ljava/util/HashSet;

    .line 1035
    .line 1036
    invoke-static {v6, v8}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v6

    .line 1040
    invoke-virtual {v9, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1041
    .line 1042
    .line 1043
    move-result v6

    .line 1044
    const-class v8, Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;

    .line 1045
    .line 1046
    invoke-virtual {p1, v8, v6}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 1047
    .line 1048
    .line 1049
    move-result v6

    .line 1050
    if-eqz v6, :cond_2f

    .line 1051
    .line 1052
    new-instance v6, Landroidx/camera/core/internal/compat/quirk/CaptureFailedRetryQuirk;

    .line 1053
    .line 1054
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1058
    .line 1059
    .line 1060
    :cond_2f
    sget-object v6, Landroidx/camera/core/internal/compat/quirk/LowMemoryQuirk;->a:Ljava/util/HashSet;

    .line 1061
    .line 1062
    invoke-virtual {v7, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v8

    .line 1066
    invoke-virtual {v6, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1067
    .line 1068
    .line 1069
    move-result v6

    .line 1070
    const-class v8, Landroidx/camera/core/internal/compat/quirk/LowMemoryQuirk;

    .line 1071
    .line 1072
    invoke-virtual {p1, v8, v6}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 1073
    .line 1074
    .line 1075
    move-result v6

    .line 1076
    if-eqz v6, :cond_30

    .line 1077
    .line 1078
    new-instance v6, Landroidx/camera/core/internal/compat/quirk/LowMemoryQuirk;

    .line 1079
    .line 1080
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1084
    .line 1085
    .line 1086
    :cond_30
    sget-object v6, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;->a:Ljava/util/HashSet;

    .line 1087
    .line 1088
    const-string v6, "Samsung"

    .line 1089
    .line 1090
    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1091
    .line 1092
    .line 1093
    move-result v8

    .line 1094
    if-nez v8, :cond_32

    .line 1095
    .line 1096
    const-string v8, "Vivo"

    .line 1097
    .line 1098
    invoke-virtual {v8, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1099
    .line 1100
    .line 1101
    move-result v8

    .line 1102
    if-eqz v8, :cond_31

    .line 1103
    .line 1104
    sget-object v8, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;->a:Ljava/util/HashSet;

    .line 1105
    .line 1106
    invoke-virtual {v7, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v7

    .line 1110
    invoke-virtual {v8, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1111
    .line 1112
    .line 1113
    move-result v7

    .line 1114
    if-eqz v7, :cond_31

    .line 1115
    .line 1116
    goto :goto_f

    .line 1117
    :cond_31
    move v7, v3

    .line 1118
    goto :goto_10

    .line 1119
    :cond_32
    :goto_f
    move v7, v4

    .line 1120
    :goto_10
    const-class v8, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;

    .line 1121
    .line 1122
    invoke-virtual {p1, v8, v7}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 1123
    .line 1124
    .line 1125
    move-result v7

    .line 1126
    if-eqz v7, :cond_33

    .line 1127
    .line 1128
    new-instance v7, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;

    .line 1129
    .line 1130
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1134
    .line 1135
    .line 1136
    :cond_33
    sget-object v7, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;->a:Ljava/util/HashSet;

    .line 1137
    .line 1138
    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1139
    .line 1140
    .line 1141
    move-result v5

    .line 1142
    if-eqz v5, :cond_34

    .line 1143
    .line 1144
    sget-object v5, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;->a:Ljava/util/HashSet;

    .line 1145
    .line 1146
    sget-object v6, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 1147
    .line 1148
    invoke-virtual {v6, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v2

    .line 1152
    invoke-virtual {v5, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1153
    .line 1154
    .line 1155
    move-result v2

    .line 1156
    if-eqz v2, :cond_34

    .line 1157
    .line 1158
    move v3, v4

    .line 1159
    :cond_34
    const-class v2, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;

    .line 1160
    .line 1161
    invoke-virtual {p1, v2, v3}, Li02;->a(Ljava/lang/Class;Z)Z

    .line 1162
    .line 1163
    .line 1164
    move-result p1

    .line 1165
    if-eqz p1, :cond_35

    .line 1166
    .line 1167
    new-instance p1, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;

    .line 1168
    .line 1169
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 1170
    .line 1171
    .line 1172
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1173
    .line 1174
    .line 1175
    :cond_35
    invoke-direct {p0, v0}, Ler0;-><init>(Ljava/util/List;)V

    .line 1176
    .line 1177
    .line 1178
    sput-object p0, Le80;->a:Ler0;

    .line 1179
    .line 1180
    sget-object p0, Le80;->a:Ler0;

    .line 1181
    .line 1182
    invoke-static {p0}, Ler0;->B(Ler0;)V

    .line 1183
    .line 1184
    .line 1185
    invoke-static {v1}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 1186
    .line 1187
    .line 1188
    return-void

    .line 1189
    :pswitch_3
    check-cast p1, Lxg;

    .line 1190
    .line 1191
    invoke-static {}, Lpg3;->a()V

    .line 1192
    .line 1193
    .line 1194
    return-void

    .line 1195
    :pswitch_4
    if-nez p1, :cond_36

    .line 1196
    .line 1197
    invoke-static {}, Lpg3;->a()V

    .line 1198
    .line 1199
    .line 1200
    throw v0

    .line 1201
    :cond_36
    new-instance p0, Ljava/lang/ClassCastException;

    .line 1202
    .line 1203
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1204
    .line 1205
    .line 1206
    throw p0

    .line 1207
    :pswitch_5
    if-nez p1, :cond_37

    .line 1208
    .line 1209
    invoke-static {}, Lpg3;->a()V

    .line 1210
    .line 1211
    .line 1212
    throw v0

    .line 1213
    :cond_37
    new-instance p0, Ljava/lang/ClassCastException;

    .line 1214
    .line 1215
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1216
    .line 1217
    .line 1218
    throw p0

    .line 1219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

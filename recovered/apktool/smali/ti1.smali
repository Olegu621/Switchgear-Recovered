.class public final Lti1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lvr1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ldc0;Lvr1;Lq62;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lti1;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p3, p0, Lti1;->b:Lvr1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    const/4 v5, 0x1

    .line 13
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    const/4 v7, 0x0

    .line 18
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v8

    .line 22
    iget-object v9, v1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v10

    .line 31
    const/4 v12, 0x3

    .line 32
    const/4 v13, -0x1

    .line 33
    sparse-switch v10, :sswitch_data_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :sswitch_0
    const-string v10, "requestPermissions"

    .line 38
    .line 39
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    if-nez v9, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 v13, 0x4

    .line 47
    goto :goto_0

    .line 48
    :sswitch_1
    const-string v10, "openAppSettings"

    .line 49
    .line 50
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    if-nez v9, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move v13, v12

    .line 58
    goto :goto_0

    .line 59
    :sswitch_2
    const-string v10, "checkPermissionStatus"

    .line 60
    .line 61
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    if-nez v9, :cond_2

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    move v13, v3

    .line 69
    goto :goto_0

    .line 70
    :sswitch_3
    const-string v10, "shouldShowRequestPermissionRationale"

    .line 71
    .line 72
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    if-nez v9, :cond_3

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    move v13, v5

    .line 80
    goto :goto_0

    .line 81
    :sswitch_4
    const-string v10, "checkServiceStatus"

    .line 82
    .line 83
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    if-nez v9, :cond_4

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    move v13, v7

    .line 91
    :goto_0
    const-string v9, "Android context cannot be null."

    .line 92
    .line 93
    iget-object v10, v0, Lti1;->a:Landroid/content/Context;

    .line 94
    .line 95
    const/16 v14, 0x10

    .line 96
    .line 97
    const-string v15, "Unable to detect current Android Activity."

    .line 98
    .line 99
    move/from16 v16, v3

    .line 100
    .line 101
    const-string v3, "PermissionHandler.PermissionManager"

    .line 102
    .line 103
    iget-object v0, v0, Lti1;->b:Lvr1;

    .line 104
    .line 105
    const/4 v11, 0x0

    .line 106
    packed-switch v13, :pswitch_data_0

    .line 107
    .line 108
    .line 109
    invoke-interface {v2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_0
    invoke-virtual {v1}, Lio/flutter/plugin/common/MethodCall;->arguments()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Ljava/util/List;

    .line 118
    .line 119
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    new-instance v9, Lsi1;

    .line 123
    .line 124
    invoke-direct {v9, v2}, Lsi1;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 125
    .line 126
    .line 127
    iget v10, v0, Lvr1;->d:I

    .line 128
    .line 129
    if-lez v10, :cond_5

    .line 130
    .line 131
    const-string v0, "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time)."

    .line 132
    .line 133
    invoke-interface {v2, v3, v0, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_5
    iget-object v10, v0, Lvr1;->c:Landroid/app/Activity;

    .line 138
    .line 139
    if-nez v10, :cond_6

    .line 140
    .line 141
    invoke-interface {v2, v3, v15, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_6
    iput-object v9, v0, Lvr1;->b:Lsi1;

    .line 146
    .line 147
    new-instance v2, Ljava/util/HashMap;

    .line 148
    .line 149
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 150
    .line 151
    .line 152
    iput-object v2, v0, Lvr1;->e:Ljava/util/HashMap;

    .line 153
    .line 154
    iput v7, v0, Lvr1;->d:I

    .line 155
    .line 156
    new-instance v2, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    :cond_7
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    const/16 v9, 0x18

    .line 170
    .line 171
    if-eqz v3, :cond_15

    .line 172
    .line 173
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    check-cast v3, Ljava/lang/Integer;

    .line 178
    .line 179
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 180
    .line 181
    .line 182
    move-result v10

    .line 183
    invoke-virtual {v0, v10}, Lvr1;->a(I)I

    .line 184
    .line 185
    .line 186
    move-result v10

    .line 187
    if-ne v10, v5, :cond_8

    .line 188
    .line 189
    iget-object v9, v0, Lvr1;->e:Ljava/util/HashMap;

    .line 190
    .line 191
    invoke-virtual {v9, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v9

    .line 195
    if-nez v9, :cond_7

    .line 196
    .line 197
    iget-object v9, v0, Lvr1;->e:Ljava/util/HashMap;

    .line 198
    .line 199
    invoke-virtual {v9, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_8
    iget-object v10, v0, Lvr1;->c:Landroid/app/Activity;

    .line 204
    .line 205
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 206
    .line 207
    .line 208
    move-result v11

    .line 209
    invoke-static {v10, v11}, Lw11;->q(Landroid/content/Context;I)Ljava/util/ArrayList;

    .line 210
    .line 211
    .line 212
    move-result-object v10

    .line 213
    const/16 v11, 0x16

    .line 214
    .line 215
    const/16 v12, 0x1e

    .line 216
    .line 217
    if-eqz v10, :cond_13

    .line 218
    .line 219
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 220
    .line 221
    .line 222
    move-result v13

    .line 223
    if-eqz v13, :cond_9

    .line 224
    .line 225
    goto/16 :goto_3

    .line 226
    .line 227
    :cond_9
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result v13

    .line 231
    if-ne v13, v14, :cond_a

    .line 232
    .line 233
    const-string v3, "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"

    .line 234
    .line 235
    const/16 v9, 0xd1

    .line 236
    .line 237
    invoke-virtual {v0, v9, v3}, Lvr1;->c(ILjava/lang/String;)V

    .line 238
    .line 239
    .line 240
    goto :goto_1

    .line 241
    :cond_a
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 242
    .line 243
    if-lt v13, v12, :cond_b

    .line 244
    .line 245
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 246
    .line 247
    .line 248
    move-result v12

    .line 249
    if-ne v12, v11, :cond_b

    .line 250
    .line 251
    const-string v3, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION"

    .line 252
    .line 253
    const/16 v9, 0xd2

    .line 254
    .line 255
    invoke-virtual {v0, v9, v3}, Lvr1;->c(ILjava/lang/String;)V

    .line 256
    .line 257
    .line 258
    goto :goto_1

    .line 259
    :cond_b
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 260
    .line 261
    .line 262
    move-result v11

    .line 263
    const/16 v12, 0x17

    .line 264
    .line 265
    if-ne v11, v12, :cond_c

    .line 266
    .line 267
    const-string v3, "android.settings.action.MANAGE_OVERLAY_PERMISSION"

    .line 268
    .line 269
    const/16 v9, 0xd3

    .line 270
    .line 271
    invoke-virtual {v0, v9, v3}, Lvr1;->c(ILjava/lang/String;)V

    .line 272
    .line 273
    .line 274
    goto :goto_1

    .line 275
    :cond_c
    const/16 v11, 0x1a

    .line 276
    .line 277
    if-lt v13, v11, :cond_d

    .line 278
    .line 279
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 280
    .line 281
    .line 282
    move-result v11

    .line 283
    if-ne v11, v9, :cond_d

    .line 284
    .line 285
    const-string v3, "android.settings.MANAGE_UNKNOWN_APP_SOURCES"

    .line 286
    .line 287
    const/16 v9, 0xd4

    .line 288
    .line 289
    invoke-virtual {v0, v9, v3}, Lvr1;->c(ILjava/lang/String;)V

    .line 290
    .line 291
    .line 292
    goto :goto_1

    .line 293
    :cond_d
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 294
    .line 295
    .line 296
    move-result v9

    .line 297
    const/16 v11, 0x1b

    .line 298
    .line 299
    if-ne v9, v11, :cond_e

    .line 300
    .line 301
    const-string v3, "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"

    .line 302
    .line 303
    const/16 v9, 0xd5

    .line 304
    .line 305
    invoke-virtual {v0, v9, v3}, Lvr1;->c(ILjava/lang/String;)V

    .line 306
    .line 307
    .line 308
    goto/16 :goto_1

    .line 309
    .line 310
    :cond_e
    const/16 v9, 0x1f

    .line 311
    .line 312
    if-lt v13, v9, :cond_f

    .line 313
    .line 314
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 315
    .line 316
    .line 317
    move-result v9

    .line 318
    const/16 v11, 0x22

    .line 319
    .line 320
    if-ne v9, v11, :cond_f

    .line 321
    .line 322
    const-string v3, "android.settings.REQUEST_SCHEDULE_EXACT_ALARM"

    .line 323
    .line 324
    const/16 v9, 0xd6

    .line 325
    .line 326
    invoke-virtual {v0, v9, v3}, Lvr1;->c(ILjava/lang/String;)V

    .line 327
    .line 328
    .line 329
    goto/16 :goto_1

    .line 330
    .line 331
    :cond_f
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 332
    .line 333
    .line 334
    move-result v9

    .line 335
    const/16 v11, 0x25

    .line 336
    .line 337
    if-eq v9, v11, :cond_11

    .line 338
    .line 339
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 340
    .line 341
    .line 342
    move-result v9

    .line 343
    if-nez v9, :cond_10

    .line 344
    .line 345
    goto :goto_2

    .line 346
    :cond_10
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 347
    .line 348
    .line 349
    iget v3, v0, Lvr1;->d:I

    .line 350
    .line 351
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 352
    .line 353
    .line 354
    move-result v9

    .line 355
    add-int/2addr v9, v3

    .line 356
    iput v9, v0, Lvr1;->d:I

    .line 357
    .line 358
    goto/16 :goto_1

    .line 359
    .line 360
    :cond_11
    :goto_2
    invoke-virtual {v0}, Lvr1;->b()Z

    .line 361
    .line 362
    .line 363
    move-result v9

    .line 364
    if-eqz v9, :cond_12

    .line 365
    .line 366
    const-string v3, "android.permission.WRITE_CALENDAR"

    .line 367
    .line 368
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    const-string v3, "android.permission.READ_CALENDAR"

    .line 372
    .line 373
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    iget v3, v0, Lvr1;->d:I

    .line 377
    .line 378
    add-int/lit8 v3, v3, 0x2

    .line 379
    .line 380
    iput v3, v0, Lvr1;->d:I

    .line 381
    .line 382
    goto/16 :goto_1

    .line 383
    .line 384
    :cond_12
    iget-object v9, v0, Lvr1;->e:Ljava/util/HashMap;

    .line 385
    .line 386
    invoke-virtual {v9, v3, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    goto/16 :goto_1

    .line 390
    .line 391
    :cond_13
    :goto_3
    iget-object v9, v0, Lvr1;->e:Ljava/util/HashMap;

    .line 392
    .line 393
    invoke-virtual {v9, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v9

    .line 397
    if-nez v9, :cond_7

    .line 398
    .line 399
    iget-object v9, v0, Lvr1;->e:Ljava/util/HashMap;

    .line 400
    .line 401
    invoke-virtual {v9, v3, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 405
    .line 406
    .line 407
    move-result v9

    .line 408
    if-ne v9, v11, :cond_14

    .line 409
    .line 410
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 411
    .line 412
    if-ge v9, v12, :cond_14

    .line 413
    .line 414
    iget-object v9, v0, Lvr1;->e:Ljava/util/HashMap;

    .line 415
    .line 416
    invoke-virtual {v9, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    goto/16 :goto_1

    .line 420
    .line 421
    :cond_14
    iget-object v9, v0, Lvr1;->e:Ljava/util/HashMap;

    .line 422
    .line 423
    invoke-virtual {v9, v3, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    goto/16 :goto_1

    .line 427
    .line 428
    :cond_15
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 429
    .line 430
    .line 431
    move-result v1

    .line 432
    if-lez v1, :cond_16

    .line 433
    .line 434
    new-array v1, v7, [Ljava/lang/String;

    .line 435
    .line 436
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    check-cast v1, [Ljava/lang/String;

    .line 441
    .line 442
    iget-object v2, v0, Lvr1;->c:Landroid/app/Activity;

    .line 443
    .line 444
    invoke-static {v2, v1, v9}, Lx2;->a(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 445
    .line 446
    .line 447
    :cond_16
    iget-object v1, v0, Lvr1;->b:Lsi1;

    .line 448
    .line 449
    if-eqz v1, :cond_2a

    .line 450
    .line 451
    iget v2, v0, Lvr1;->d:I

    .line 452
    .line 453
    if-nez v2, :cond_2a

    .line 454
    .line 455
    iget-object v0, v0, Lvr1;->e:Ljava/util/HashMap;

    .line 456
    .line 457
    iget-object v1, v1, Lsi1;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 458
    .line 459
    invoke-interface {v1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    return-void

    .line 463
    :pswitch_1
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    const-string v0, "package:"

    .line 467
    .line 468
    if-nez v10, :cond_17

    .line 469
    .line 470
    const-string v0, "PermissionHandler.AppSettingsManager"

    .line 471
    .line 472
    invoke-interface {v2, v0, v9, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    goto/16 :goto_9

    .line 476
    .line 477
    :cond_17
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    .line 478
    .line 479
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 480
    .line 481
    .line 482
    const-string v3, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 483
    .line 484
    invoke-virtual {v1, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 485
    .line 486
    .line 487
    const-string v3, "android.intent.category.DEFAULT"

    .line 488
    .line 489
    invoke-virtual {v1, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 490
    .line 491
    .line 492
    new-instance v3, Ljava/lang/StringBuilder;

    .line 493
    .line 494
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v10}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x10000000

    .line 516
    .line 517
    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 518
    .line 519
    .line 520
    const/high16 v0, 0x40000000    # 2.0f

    .line 521
    .line 522
    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 523
    .line 524
    .line 525
    const/high16 v0, 0x800000

    .line 526
    .line 527
    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v10, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 531
    .line 532
    .line 533
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 534
    .line 535
    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 536
    .line 537
    .line 538
    goto/16 :goto_9

    .line 539
    .line 540
    :catch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 541
    .line 542
    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    goto/16 :goto_9

    .line 546
    .line 547
    :pswitch_2
    iget-object v1, v1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 548
    .line 549
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 554
    .line 555
    .line 556
    move-result v1

    .line 557
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0, v1}, Lvr1;->a(I)I

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 569
    .line 570
    .line 571
    return-void

    .line 572
    :pswitch_3
    iget-object v1, v1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 573
    .line 574
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 579
    .line 580
    .line 581
    move-result v1

    .line 582
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    iget-object v4, v0, Lvr1;->c:Landroid/app/Activity;

    .line 586
    .line 587
    if-nez v4, :cond_18

    .line 588
    .line 589
    invoke-interface {v2, v3, v15, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    return-void

    .line 593
    :cond_18
    invoke-static {v4, v1}, Lw11;->q(Landroid/content/Context;I)Ljava/util/ArrayList;

    .line 594
    .line 595
    .line 596
    move-result-object v1

    .line 597
    if-nez v1, :cond_19

    .line 598
    .line 599
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 600
    .line 601
    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 602
    .line 603
    .line 604
    return-void

    .line 605
    :cond_19
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 606
    .line 607
    .line 608
    move-result v3

    .line 609
    if-eqz v3, :cond_1a

    .line 610
    .line 611
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 612
    .line 613
    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    return-void

    .line 617
    :cond_1a
    iget-object v0, v0, Lvr1;->c:Landroid/app/Activity;

    .line 618
    .line 619
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    check-cast v1, Ljava/lang/String;

    .line 624
    .line 625
    invoke-static {v0, v1}, Lx2;->b(Landroid/app/Activity;Ljava/lang/String;)Z

    .line 626
    .line 627
    .line 628
    move-result v0

    .line 629
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 634
    .line 635
    .line 636
    return-void

    .line 637
    :pswitch_4
    iget-object v0, v1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 638
    .line 639
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 644
    .line 645
    .line 646
    move-result v0

    .line 647
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    if-nez v10, :cond_1b

    .line 651
    .line 652
    const-string v0, "PermissionHandler.ServiceManager"

    .line 653
    .line 654
    invoke-interface {v2, v0, v9, v11}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 655
    .line 656
    .line 657
    goto/16 :goto_9

    .line 658
    .line 659
    :cond_1b
    if-eq v0, v12, :cond_26

    .line 660
    .line 661
    const/4 v1, 0x4

    .line 662
    if-eq v0, v1, :cond_26

    .line 663
    .line 664
    const/4 v1, 0x5

    .line 665
    if-ne v0, v1, :cond_1c

    .line 666
    .line 667
    goto/16 :goto_6

    .line 668
    .line 669
    :cond_1c
    const/16 v3, 0x15

    .line 670
    .line 671
    if-ne v0, v3, :cond_1d

    .line 672
    .line 673
    const-string v0, "bluetooth"

    .line 674
    .line 675
    invoke-virtual {v10, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    check-cast v0, Landroid/bluetooth/BluetoothManager;

    .line 680
    .line 681
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    .line 686
    .line 687
    .line 688
    move-result v0

    .line 689
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 694
    .line 695
    .line 696
    goto/16 :goto_9

    .line 697
    .line 698
    :cond_1d
    const/16 v3, 0x8

    .line 699
    .line 700
    if-ne v0, v3, :cond_24

    .line 701
    .line 702
    invoke-virtual {v10}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    const-string v3, "android.hardware.telephony"

    .line 707
    .line 708
    invoke-virtual {v0, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 709
    .line 710
    .line 711
    move-result v3

    .line 712
    if-nez v3, :cond_1e

    .line 713
    .line 714
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 715
    .line 716
    .line 717
    goto/16 :goto_9

    .line 718
    .line 719
    :cond_1e
    const-string v3, "phone"

    .line 720
    .line 721
    invoke-virtual {v10, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v3

    .line 725
    check-cast v3, Landroid/telephony/TelephonyManager;

    .line 726
    .line 727
    if-eqz v3, :cond_23

    .line 728
    .line 729
    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getPhoneType()I

    .line 730
    .line 731
    .line 732
    move-result v5

    .line 733
    if-nez v5, :cond_1f

    .line 734
    .line 735
    goto :goto_5

    .line 736
    :cond_1f
    new-instance v5, Landroid/content/Intent;

    .line 737
    .line 738
    const-string v9, "android.intent.action.CALL"

    .line 739
    .line 740
    invoke-direct {v5, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 741
    .line 742
    .line 743
    const-string v9, "tel:123123"

    .line 744
    .line 745
    invoke-static {v9}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 746
    .line 747
    .line 748
    move-result-object v9

    .line 749
    invoke-virtual {v5, v9}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 750
    .line 751
    .line 752
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 753
    .line 754
    const/16 v10, 0x21

    .line 755
    .line 756
    if-lt v9, v10, :cond_20

    .line 757
    .line 758
    invoke-static {}, Lx72;->c()Landroid/content/pm/PackageManager$ResolveInfoFlags;

    .line 759
    .line 760
    .line 761
    move-result-object v7

    .line 762
    invoke-static {v0, v5, v7}, Lx72;->f(Landroid/content/pm/PackageManager;Landroid/content/Intent;Landroid/content/pm/PackageManager$ResolveInfoFlags;)Ljava/util/List;

    .line 763
    .line 764
    .line 765
    move-result-object v0

    .line 766
    goto :goto_4

    .line 767
    :cond_20
    invoke-virtual {v0, v5, v7}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    :goto_4
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 772
    .line 773
    .line 774
    move-result v0

    .line 775
    if-eqz v0, :cond_21

    .line 776
    .line 777
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 778
    .line 779
    .line 780
    goto :goto_9

    .line 781
    :cond_21
    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getSimState()I

    .line 782
    .line 783
    .line 784
    move-result v0

    .line 785
    if-eq v0, v1, :cond_22

    .line 786
    .line 787
    invoke-interface {v2, v8}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 788
    .line 789
    .line 790
    goto :goto_9

    .line 791
    :cond_22
    invoke-interface {v2, v6}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 792
    .line 793
    .line 794
    goto :goto_9

    .line 795
    :cond_23
    :goto_5
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 796
    .line 797
    .line 798
    goto :goto_9

    .line 799
    :cond_24
    if-ne v0, v14, :cond_25

    .line 800
    .line 801
    invoke-interface {v2, v6}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 802
    .line 803
    .line 804
    goto :goto_9

    .line 805
    :cond_25
    invoke-interface {v2, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 806
    .line 807
    .line 808
    goto :goto_9

    .line 809
    :cond_26
    :goto_6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 810
    .line 811
    const/16 v1, 0x1c

    .line 812
    .line 813
    if-lt v0, v1, :cond_29

    .line 814
    .line 815
    const-class v0, Landroid/location/LocationManager;

    .line 816
    .line 817
    invoke-virtual {v10, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    check-cast v0, Landroid/location/LocationManager;

    .line 822
    .line 823
    if-nez v0, :cond_28

    .line 824
    .line 825
    :cond_27
    :goto_7
    move v5, v7

    .line 826
    goto :goto_8

    .line 827
    :cond_28
    invoke-static {v0}, Lrt1;->m(Landroid/location/LocationManager;)Z

    .line 828
    .line 829
    .line 830
    move-result v5

    .line 831
    goto :goto_8

    .line 832
    :cond_29
    :try_start_1
    invoke-virtual {v10}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    const-string v1, "location_mode"

    .line 837
    .line 838
    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    .line 839
    .line 840
    .line 841
    move-result v0
    :try_end_1
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 842
    if-eqz v0, :cond_27

    .line 843
    .line 844
    goto :goto_8

    .line 845
    :catch_1
    move-exception v0

    .line 846
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 847
    .line 848
    .line 849
    goto :goto_7

    .line 850
    :goto_8
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 855
    .line 856
    .line 857
    :cond_2a
    :goto_9
    return-void

    .line 858
    nop

    .line 859
    :sswitch_data_0
    .sparse-switch
        -0x5c086121 -> :sswitch_4
        -0x3ca2ffb7 -> :sswitch_3
        -0x22583c37 -> :sswitch_2
        0x14b278ba -> :sswitch_1
        0x637dca75 -> :sswitch_0
    .end sparse-switch

    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final Lcom/quago/mobile/sdk/y0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lcom/quago/mobile/sdk/j0;

.field public final b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "QuagoRootDetection"

    .line 5
    .line 6
    invoke-static {v0}, Lcom/quago/mobile/sdk/k0;->a(Ljava/lang/String;)Lcom/quago/mobile/sdk/j0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/quago/mobile/sdk/y0;->a:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/quago/mobile/sdk/y0;->b:Landroid/content/Context;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "\n"

    .line 4
    .line 5
    const-string v3, "\\A"

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    sget-object v4, Lcom/quago/mobile/sdk/h;->a:[Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lcom/quago/mobile/sdk/y0;->a(Ljava/util/ArrayList;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_15

    .line 23
    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    sget-object v5, Lcom/quago/mobile/sdk/h;->b:[Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0}, Lcom/quago/mobile/sdk/y0;->a(Ljava/util/ArrayList;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_15

    .line 43
    .line 44
    const-string v5, "su"

    .line 45
    .line 46
    invoke-virtual {v1, v5}, Lcom/quago/mobile/sdk/y0;->a(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_15

    .line 51
    .line 52
    new-instance v6, Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v0, "ro.debuggable"

    .line 58
    .line 59
    const-string v7, "1"

    .line 60
    .line 61
    invoke-virtual {v6, v0, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    const-string v0, "ro.secure"

    .line 65
    .line 66
    const-string v7, "0"

    .line 67
    .line 68
    invoke-virtual {v6, v0, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v8, "getprop"

    .line 76
    .line 77
    invoke-virtual {v0, v8}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-nez v0, :cond_0

    .line 86
    .line 87
    :goto_0
    const/4 v0, 0x0

    .line 88
    goto :goto_2

    .line 89
    :cond_0
    new-instance v8, Ljava/util/Scanner;

    .line 90
    .line 91
    invoke-direct {v8, v0}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v8, v3}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/util/Scanner;->next()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    goto :goto_2

    .line 107
    :catch_0
    move-exception v0

    .line 108
    goto :goto_1

    .line 109
    :catch_1
    move-exception v0

    .line 110
    :goto_1
    iget-object v8, v1, Lcom/quago/mobile/sdk/y0;->a:Lcom/quago/mobile/sdk/j0;

    .line 111
    .line 112
    const-string v9, "propsReader"

    .line 113
    .line 114
    invoke-virtual {v8, v9, v0}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :goto_2
    const/4 v8, 0x0

    .line 119
    if-nez v0, :cond_1

    .line 120
    .line 121
    const/16 v16, 0x1

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_1
    array-length v9, v0

    .line 125
    move v10, v8

    .line 126
    move v11, v10

    .line 127
    :goto_3
    if-ge v10, v9, :cond_5

    .line 128
    .line 129
    aget-object v12, v0, v10

    .line 130
    .line 131
    invoke-virtual {v6}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 132
    .line 133
    .line 134
    move-result-object v13

    .line 135
    invoke-interface {v13}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    :cond_2
    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v14

    .line 143
    if-eqz v14, :cond_4

    .line 144
    .line 145
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v14

    .line 149
    check-cast v14, Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {v12, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 152
    .line 153
    .line 154
    move-result v15

    .line 155
    if-eqz v15, :cond_3

    .line 156
    .line 157
    invoke-virtual {v6, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v15

    .line 161
    check-cast v15, Ljava/lang/String;

    .line 162
    .line 163
    const/16 v16, 0x1

    .line 164
    .line 165
    const-string v4, "["

    .line 166
    .line 167
    const-string v7, "]"

    .line 168
    .line 169
    invoke-static {v4, v15, v7}, Lfm0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-virtual {v12, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 174
    .line 175
    .line 176
    move-result v7

    .line 177
    if-eqz v7, :cond_2

    .line 178
    .line 179
    iget-object v7, v1, Lcom/quago/mobile/sdk/y0;->a:Lcom/quago/mobile/sdk/j0;

    .line 180
    .line 181
    const-string v11, " = "

    .line 182
    .line 183
    const-string v15, " detected!"

    .line 184
    .line 185
    invoke-static {v14, v11, v4, v15}, Lpm2;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    new-array v11, v8, [Ljava/lang/Object;

    .line 190
    .line 191
    const-string v14, "checkForDangerousProps"

    .line 192
    .line 193
    invoke-virtual {v7, v14, v4, v11}, Lcom/quago/mobile/sdk/j0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    move/from16 v11, v16

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_3
    const/16 v16, 0x1

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_4
    const/16 v16, 0x1

    .line 203
    .line 204
    add-int/lit8 v10, v10, 0x1

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_5
    const/16 v16, 0x1

    .line 208
    .line 209
    if-nez v11, :cond_16

    .line 210
    .line 211
    :goto_5
    :try_start_1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    const-string v4, "mount"

    .line 216
    .line 217
    invoke-virtual {v0, v4}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    if-nez v0, :cond_6

    .line 226
    .line 227
    :goto_6
    const/4 v0, 0x0

    .line 228
    goto :goto_8

    .line 229
    :cond_6
    new-instance v4, Ljava/util/Scanner;

    .line 230
    .line 231
    invoke-direct {v4, v0}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v4, v3}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v0}, Ljava/util/Scanner;->next()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/util/NoSuchElementException; {:try_start_1 .. :try_end_1} :catch_2

    .line 246
    goto :goto_8

    .line 247
    :catch_2
    move-exception v0

    .line 248
    goto :goto_7

    .line 249
    :catch_3
    move-exception v0

    .line 250
    :goto_7
    iget-object v2, v1, Lcom/quago/mobile/sdk/y0;->a:Lcom/quago/mobile/sdk/j0;

    .line 251
    .line 252
    const-string v3, "mountReader"

    .line 253
    .line 254
    invoke-virtual {v2, v3, v0}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 255
    .line 256
    .line 257
    goto :goto_6

    .line 258
    :goto_8
    const/4 v2, 0x2

    .line 259
    if-nez v0, :cond_7

    .line 260
    .line 261
    goto/16 :goto_f

    .line 262
    .line 263
    :cond_7
    array-length v3, v0

    .line 264
    move v4, v8

    .line 265
    move v6, v4

    .line 266
    :goto_9
    if-ge v4, v3, :cond_d

    .line 267
    .line 268
    aget-object v7, v0, v4

    .line 269
    .line 270
    const-string v9, " "

    .line 271
    .line 272
    invoke-virtual {v7, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v9

    .line 276
    array-length v10, v9

    .line 277
    const/4 v11, 0x6

    .line 278
    const-string v12, "checkForRWPaths"

    .line 279
    .line 280
    if-ge v10, v11, :cond_9

    .line 281
    .line 282
    iget-object v9, v1, Lcom/quago/mobile/sdk/y0;->a:Lcom/quago/mobile/sdk/j0;

    .line 283
    .line 284
    const-string v10, "Error formatting mount line: "

    .line 285
    .line 286
    invoke-virtual {v10, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    new-array v10, v8, [Ljava/lang/Object;

    .line 291
    .line 292
    invoke-virtual {v9, v12, v7, v10}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    :cond_8
    move-object/from16 v18, v0

    .line 296
    .line 297
    goto :goto_e

    .line 298
    :cond_9
    aget-object v10, v9, v2

    .line 299
    .line 300
    const/4 v11, 0x5

    .line 301
    aget-object v9, v9, v11

    .line 302
    .line 303
    sget-object v11, Lcom/quago/mobile/sdk/h;->d:[Ljava/lang/String;

    .line 304
    .line 305
    move v13, v8

    .line 306
    :goto_a
    const/4 v14, 0x7

    .line 307
    if-ge v13, v14, :cond_8

    .line 308
    .line 309
    aget-object v14, v11, v13

    .line 310
    .line 311
    invoke-virtual {v10, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 312
    .line 313
    .line 314
    move-result v15

    .line 315
    if-eqz v15, :cond_c

    .line 316
    .line 317
    const-string v15, "("

    .line 318
    .line 319
    const-string v2, ""

    .line 320
    .line 321
    invoke-virtual {v9, v15, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v9

    .line 325
    const-string v15, ")"

    .line 326
    .line 327
    invoke-virtual {v9, v15, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    const-string v9, ","

    .line 332
    .line 333
    invoke-virtual {v2, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v9

    .line 337
    array-length v15, v9

    .line 338
    :goto_b
    move-object/from16 v18, v0

    .line 339
    .line 340
    if-ge v8, v15, :cond_b

    .line 341
    .line 342
    aget-object v0, v9, v8

    .line 343
    .line 344
    move-object/from16 v19, v2

    .line 345
    .line 346
    const-string v2, "rw"

    .line 347
    .line 348
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    if-eqz v0, :cond_a

    .line 353
    .line 354
    iget-object v0, v1, Lcom/quago/mobile/sdk/y0;->a:Lcom/quago/mobile/sdk/j0;

    .line 355
    .line 356
    const-string v2, " path is mounted with rw permissions! "

    .line 357
    .line 358
    invoke-static {v14, v2, v7}, Len;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    const/4 v6, 0x0

    .line 363
    new-array v8, v6, [Ljava/lang/Object;

    .line 364
    .line 365
    invoke-virtual {v0, v12, v2, v8}, Lcom/quago/mobile/sdk/j0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    move/from16 v6, v16

    .line 369
    .line 370
    :goto_c
    move-object/from16 v9, v19

    .line 371
    .line 372
    goto :goto_d

    .line 373
    :cond_a
    add-int/lit8 v8, v8, 0x1

    .line 374
    .line 375
    move-object/from16 v0, v18

    .line 376
    .line 377
    move-object/from16 v2, v19

    .line 378
    .line 379
    goto :goto_b

    .line 380
    :cond_b
    move-object/from16 v19, v2

    .line 381
    .line 382
    goto :goto_c

    .line 383
    :cond_c
    move-object/from16 v18, v0

    .line 384
    .line 385
    :goto_d
    add-int/lit8 v13, v13, 0x1

    .line 386
    .line 387
    move-object/from16 v0, v18

    .line 388
    .line 389
    const/4 v2, 0x2

    .line 390
    const/4 v8, 0x0

    .line 391
    goto :goto_a

    .line 392
    :goto_e
    add-int/lit8 v4, v4, 0x1

    .line 393
    .line 394
    move-object/from16 v0, v18

    .line 395
    .line 396
    const/4 v2, 0x2

    .line 397
    const/4 v8, 0x0

    .line 398
    goto/16 :goto_9

    .line 399
    .line 400
    :cond_d
    if-nez v6, :cond_16

    .line 401
    .line 402
    :goto_f
    sget-object v0, Landroid/os/Build;->TAGS:Ljava/lang/String;

    .line 403
    .line 404
    if-eqz v0, :cond_e

    .line 405
    .line 406
    const-string v2, "test-keys"

    .line 407
    .line 408
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    if-eqz v0, :cond_e

    .line 413
    .line 414
    goto/16 :goto_14

    .line 415
    .line 416
    :cond_e
    :try_start_2
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    const/4 v2, 0x2

    .line 421
    new-array v2, v2, [Ljava/lang/String;

    .line 422
    .line 423
    const-string v3, "which"

    .line 424
    .line 425
    const/16 v17, 0x0

    .line 426
    .line 427
    aput-object v3, v2, v17

    .line 428
    .line 429
    aput-object v5, v2, v16

    .line 430
    .line 431
    invoke-virtual {v0, v2}, Ljava/lang/Runtime;->exec([Ljava/lang/String;)Ljava/lang/Process;

    .line 432
    .line 433
    .line 434
    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 435
    :try_start_3
    new-instance v0, Ljava/io/BufferedReader;

    .line 436
    .line 437
    new-instance v2, Ljava/io/InputStreamReader;

    .line 438
    .line 439
    invoke-virtual {v7}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    invoke-direct {v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 444
    .line 445
    .line 446
    invoke-direct {v0, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 453
    if-eqz v0, :cond_f

    .line 454
    .line 455
    move/from16 v6, v16

    .line 456
    .line 457
    goto :goto_10

    .line 458
    :cond_f
    const/4 v6, 0x0

    .line 459
    :goto_10
    invoke-virtual {v7}, Ljava/lang/Process;->destroy()V

    .line 460
    .line 461
    .line 462
    if-nez v6, :cond_16

    .line 463
    .line 464
    goto :goto_11

    .line 465
    :catchall_0
    const/4 v7, 0x0

    .line 466
    :catchall_1
    if-eqz v7, :cond_10

    .line 467
    .line 468
    invoke-virtual {v7}, Ljava/lang/Process;->destroy()V

    .line 469
    .line 470
    .line 471
    :cond_10
    :goto_11
    new-instance v0, Lcom/quago/mobile/sdk/root/QuagoRootDetectionNative;

    .line 472
    .line 473
    sget-boolean v0, Lcom/quago/mobile/sdk/root/QuagoRootDetectionNative;->b:Z

    .line 474
    .line 475
    if-nez v0, :cond_11

    .line 476
    .line 477
    iget-object v0, v1, Lcom/quago/mobile/sdk/y0;->a:Lcom/quago/mobile/sdk/j0;

    .line 478
    .line 479
    const/4 v6, 0x0

    .line 480
    new-array v2, v6, [Ljava/lang/Object;

    .line 481
    .line 482
    const-string v3, "checkForRootNative"

    .line 483
    .line 484
    const-string v4, "We could not load the native library to test for root"

    .line 485
    .line 486
    invoke-virtual {v0, v3, v4, v2}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    goto :goto_13

    .line 490
    :cond_11
    const/4 v6, 0x0

    .line 491
    invoke-static {}, Lcom/quago/mobile/sdk/h;->a()[Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    array-length v2, v0

    .line 496
    new-array v3, v2, [Ljava/lang/String;

    .line 497
    .line 498
    move v4, v6

    .line 499
    :goto_12
    if-ge v4, v2, :cond_12

    .line 500
    .line 501
    new-instance v7, Ljava/lang/StringBuilder;

    .line 502
    .line 503
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 504
    .line 505
    .line 506
    aget-object v8, v0, v4

    .line 507
    .line 508
    invoke-static {v7, v8, v5}, Lfm0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v7

    .line 512
    aput-object v7, v3, v4

    .line 513
    .line 514
    add-int/lit8 v4, v4, 0x1

    .line 515
    .line 516
    goto :goto_12

    .line 517
    :cond_12
    new-instance v0, Lcom/quago/mobile/sdk/root/QuagoRootDetectionNative;

    .line 518
    .line 519
    invoke-direct {v0}, Lcom/quago/mobile/sdk/root/QuagoRootDetectionNative;-><init>()V

    .line 520
    .line 521
    .line 522
    :try_start_4
    sget v2, Lcom/quago/mobile/sdk/k0;->b:I

    .line 523
    .line 524
    invoke-static {v2}, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->getByPriority(I)Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    iget v2, v2, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->priority:I

    .line 529
    .line 530
    invoke-virtual {v0, v2}, Lcom/quago/mobile/sdk/root/QuagoRootDetectionNative;->setLogLevel(I)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v0, v3}, Lcom/quago/mobile/sdk/root/QuagoRootDetectionNative;->checkForRoot([Ljava/lang/Object;)I

    .line 534
    .line 535
    .line 536
    move-result v0
    :try_end_4
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_4 .. :try_end_4} :catch_4

    .line 537
    if-lez v0, :cond_13

    .line 538
    .line 539
    goto :goto_14

    .line 540
    :catch_4
    :cond_13
    :goto_13
    const-string v0, "magisk"

    .line 541
    .line 542
    invoke-virtual {v1, v0}, Lcom/quago/mobile/sdk/y0;->a(Ljava/lang/String;)Z

    .line 543
    .line 544
    .line 545
    move-result v0

    .line 546
    if-eqz v0, :cond_14

    .line 547
    .line 548
    goto :goto_14

    .line 549
    :cond_14
    move v4, v6

    .line 550
    goto :goto_15

    .line 551
    :cond_15
    const/16 v16, 0x1

    .line 552
    .line 553
    :cond_16
    :goto_14
    move/from16 v4, v16

    .line 554
    .line 555
    :goto_15
    return v4
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 8

    .line 556
    invoke-static {}, Lcom/quago/mobile/sdk/h;->a()[Ljava/lang/String;

    move-result-object v0

    .line 557
    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v5, v0, v3

    .line 558
    invoke-static {v5, p1}, Lfm0;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 559
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v5, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 560
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 561
    iget-object v4, p0, Lcom/quago/mobile/sdk/y0;->a:Lcom/quago/mobile/sdk/j0;

    const-string v5, " binary detected!"

    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-array v6, v2, [Ljava/lang/Object;

    const-string v7, "checkForBinary"

    invoke-virtual {v4, v7, v5, v6}, Lcom/quago/mobile/sdk/j0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v4, 0x1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v4
.end method

.method public final a(Ljava/util/ArrayList;)Z
    .locals 7

    .line 562
    iget-object v0, p0, Lcom/quago/mobile/sdk/y0;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 563
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move v2, v1

    :catch_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 564
    :try_start_0
    invoke-virtual {v0, v3, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 565
    iget-object v4, p0, Lcom/quago/mobile/sdk/y0;->a:Lcom/quago/mobile/sdk/j0;

    const-string v5, "isAnyPackageFromListInstalled"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ROOT management app detected!"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v6, v1, [Ljava/lang/Object;

    invoke-virtual {v4, v5, v3, v6}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    return v2
.end method

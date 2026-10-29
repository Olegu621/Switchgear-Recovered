.class public final Laj1;
.super Lui1;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# virtual methods
.method public final a()V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lzi1;->b:[Lzi1;

    .line 4
    .line 5
    const-string v1, "uc_ccpa"

    .line 6
    .line 7
    const-string v2, "ccpa_timestamp_millis"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Laj1;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "uc_session_timestamp"

    .line 13
    .line 14
    const-string v2, "session_timestamp"

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Laj1;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v1, "uc_consents_buffer"

    .line 20
    .line 21
    const-string v2, "consents_buffer"

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Laj1;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, "uc_tcf"

    .line 27
    .line 28
    const-string v2, "tcf"

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Laj1;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, v0, Lui1;->a:Lwe2;

    .line 34
    .line 35
    iget-object v1, v0, Lwe2;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lod2;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    iget-object v1, v1, Lod2;->a:Landroid/content/SharedPreferences;

    .line 41
    .line 42
    const-string v3, "uc_settings"

    .line 43
    .line 44
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_0

    .line 55
    .line 56
    goto/16 :goto_2

    .line 57
    .line 58
    :cond_0
    sget-object v2, Lkotlinx/serialization/json/c;->Companion:Lkotlinx/serialization/json/JsonObject$Companion;

    .line 59
    .line 60
    invoke-virtual {v2}, Lkotlinx/serialization/json/JsonObject$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    sget-object v3, Lb21;->a:Lr11;

    .line 65
    .line 66
    invoke-virtual {v3, v1, v2}, Lb11;->a(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Lkotlinx/serialization/json/c;

    .line 71
    .line 72
    const-string v2, "services"

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    check-cast v2, Lkotlinx/serialization/json/b;

    .line 82
    .line 83
    invoke-static {v2}, Lpy0;->Z(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/a;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    new-instance v7, Ljava/util/ArrayList;

    .line 88
    .line 89
    const/16 v3, 0xa

    .line 90
    .line 91
    invoke-static {v2, v3}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 96
    .line 97
    .line 98
    iget-object v2, v2, Lkotlinx/serialization/json/a;->a:Ljava/util/List;

    .line 99
    .line 100
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    const-string v5, "id"

    .line 109
    .line 110
    const-string v6, "language"

    .line 111
    .line 112
    if-eqz v4, :cond_2

    .line 113
    .line 114
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    check-cast v4, Lkotlinx/serialization/json/b;

    .line 119
    .line 120
    invoke-static {v4}, Lpy0;->a0(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/c;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    new-instance v8, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;

    .line 125
    .line 126
    const-string v9, "history"

    .line 127
    .line 128
    invoke-virtual {v4, v9}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    check-cast v9, Lkotlinx/serialization/json/b;

    .line 136
    .line 137
    invoke-static {v9}, Lpy0;->Z(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/a;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    new-instance v10, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-static {v9, v3}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 144
    .line 145
    .line 146
    move-result v11

    .line 147
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 148
    .line 149
    .line 150
    iget-object v9, v9, Lkotlinx/serialization/json/a;->a:Ljava/util/List;

    .line 151
    .line 152
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    const-string v12, "status"

    .line 161
    .line 162
    if-eqz v11, :cond_1

    .line 163
    .line 164
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v11

    .line 168
    check-cast v11, Lkotlinx/serialization/json/b;

    .line 169
    .line 170
    invoke-static {v11}, Lpy0;->a0(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/c;

    .line 171
    .line 172
    .line 173
    move-result-object v11

    .line 174
    const-string v13, "timestamp"

    .line 175
    .line 176
    invoke-virtual {v11, v13}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v13

    .line 180
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    check-cast v13, Lkotlinx/serialization/json/b;

    .line 184
    .line 185
    invoke-static {v13}, Lpy0;->b0(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    .line 186
    .line 187
    .line 188
    move-result-object v13

    .line 189
    invoke-virtual {v13}, Lkotlinx/serialization/json/d;->a()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v13

    .line 193
    invoke-static {v13}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 194
    .line 195
    .line 196
    move-result-wide v13

    .line 197
    double-to-long v13, v13

    .line 198
    const-wide/16 v15, 0x3e8

    .line 199
    .line 200
    mul-long v22, v13, v15

    .line 201
    .line 202
    const-string v13, "action"

    .line 203
    .line 204
    invoke-virtual {v11, v13}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v13

    .line 208
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    check-cast v13, Lkotlinx/serialization/json/b;

    .line 212
    .line 213
    invoke-static {v13}, Lpy0;->b0(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    .line 214
    .line 215
    .line 216
    move-result-object v13

    .line 217
    invoke-virtual {v13}, Lkotlinx/serialization/json/d;->a()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v13

    .line 221
    invoke-static {v13}, Lkz2;->valueOf(Ljava/lang/String;)Lkz2;

    .line 222
    .line 223
    .line 224
    move-result-object v13

    .line 225
    const-string v14, "type"

    .line 226
    .line 227
    invoke-virtual {v11, v14}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v14

    .line 231
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    check-cast v14, Lkotlinx/serialization/json/b;

    .line 235
    .line 236
    invoke-static {v14}, Lpy0;->b0(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    .line 237
    .line 238
    .line 239
    move-result-object v14

    .line 240
    invoke-virtual {v14}, Lkotlinx/serialization/json/d;->a()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v14

    .line 244
    invoke-static {v14}, Lmz2;->valueOf(Ljava/lang/String;)Lmz2;

    .line 245
    .line 246
    .line 247
    move-result-object v14

    .line 248
    new-instance v17, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;

    .line 249
    .line 250
    sget-object v15, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;->Companion:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction$Companion;

    .line 251
    .line 252
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-static {v13}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction$Companion;->a(Lkz2;)Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 256
    .line 257
    .line 258
    move-result-object v18

    .line 259
    invoke-virtual {v11, v12}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v12

    .line 263
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    check-cast v12, Lkotlinx/serialization/json/b;

    .line 267
    .line 268
    invoke-static {v12}, Lpy0;->b0(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    .line 269
    .line 270
    .line 271
    move-result-object v12

    .line 272
    invoke-static {v12}, Lpy0;->W(Lkotlinx/serialization/json/d;)Z

    .line 273
    .line 274
    .line 275
    move-result v19

    .line 276
    sget-object v12, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;->Companion:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType$Companion;

    .line 277
    .line 278
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-static {v14}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType$Companion;->a(Lmz2;)Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;

    .line 282
    .line 283
    .line 284
    move-result-object v20

    .line 285
    invoke-virtual {v11, v6}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v11

    .line 289
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    check-cast v11, Lkotlinx/serialization/json/b;

    .line 293
    .line 294
    invoke-static {v11}, Lpy0;->b0(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    .line 295
    .line 296
    .line 297
    move-result-object v11

    .line 298
    invoke-virtual {v11}, Lkotlinx/serialization/json/d;->a()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v21

    .line 302
    invoke-direct/range {v17 .. v23}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;-><init>(Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;ZLcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;Ljava/lang/String;J)V

    .line 303
    .line 304
    .line 305
    move-object/from16 v11, v17

    .line 306
    .line 307
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    goto/16 :goto_1

    .line 311
    .line 312
    :cond_1
    invoke-virtual {v4, v5}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    check-cast v5, Lkotlinx/serialization/json/b;

    .line 320
    .line 321
    invoke-static {v5}, Lpy0;->b0(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    .line 322
    .line 323
    .line 324
    move-result-object v5

    .line 325
    invoke-virtual {v5}, Lkotlinx/serialization/json/d;->a()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    const-string v6, "processorId"

    .line 330
    .line 331
    invoke-virtual {v4, v6}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    check-cast v6, Lkotlinx/serialization/json/b;

    .line 339
    .line 340
    invoke-static {v6}, Lpy0;->b0(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    .line 341
    .line 342
    .line 343
    move-result-object v6

    .line 344
    invoke-virtual {v6}, Lkotlinx/serialization/json/d;->a()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v6

    .line 348
    invoke-virtual {v4, v12}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    check-cast v4, Lkotlinx/serialization/json/b;

    .line 356
    .line 357
    invoke-static {v4}, Lpy0;->b0(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    .line 358
    .line 359
    .line 360
    move-result-object v4

    .line 361
    invoke-static {v4}, Lpy0;->W(Lkotlinx/serialization/json/d;)Z

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    invoke-direct {v8, v10, v5, v6, v4}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    goto/16 :goto_0

    .line 372
    .line 373
    :cond_2
    new-instance v3, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

    .line 374
    .line 375
    const-string v2, "controllerId"

    .line 376
    .line 377
    invoke-virtual {v1, v2}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    check-cast v2, Lkotlinx/serialization/json/b;

    .line 385
    .line 386
    invoke-static {v2}, Lpy0;->b0(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    invoke-virtual {v2}, Lkotlinx/serialization/json/d;->a()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v4

    .line 394
    invoke-virtual {v1, v5}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    check-cast v2, Lkotlinx/serialization/json/b;

    .line 402
    .line 403
    invoke-static {v2}, Lpy0;->b0(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    invoke-virtual {v2}, Lkotlinx/serialization/json/d;->a()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v5

    .line 411
    invoke-virtual {v1, v6}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    check-cast v2, Lkotlinx/serialization/json/b;

    .line 419
    .line 420
    invoke-static {v2}, Lpy0;->b0(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    invoke-virtual {v2}, Lkotlinx/serialization/json/d;->a()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v6

    .line 428
    const-string v2, "version"

    .line 429
    .line 430
    invoke-virtual {v1, v2}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    check-cast v1, Lkotlinx/serialization/json/b;

    .line 438
    .line 439
    invoke-static {v1}, Lpy0;->b0(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    invoke-virtual {v1}, Lkotlinx/serialization/json/d;->a()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v8

    .line 447
    invoke-direct/range {v3 .. v8}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    sget-object v1, Lb21;->a:Lr11;

    .line 451
    .line 452
    iget-object v2, v1, Lb11;->b:Lb5;

    .line 453
    .line 454
    const-class v4, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

    .line 455
    .line 456
    invoke-static {v4}, Lj22;->b(Ljava/lang/Class;)Ljs2;

    .line 457
    .line 458
    .line 459
    move-result-object v4

    .line 460
    invoke-static {v2, v4}, Ljb1;->z(Lb5;Lv21;)Lkotlinx/serialization/KSerializer;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    invoke-virtual {v1, v2, v3}, Lb11;->b(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    iget-object v2, v0, Lwe2;->b:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v2, Lod2;

    .line 471
    .line 472
    const-string v3, "settings"

    .line 473
    .line 474
    invoke-virtual {v2, v3, v1}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    :cond_3
    :goto_2
    invoke-static {}, Lzi1;->values()[Lzi1;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    array-length v2, v1

    .line 482
    const/4 v3, 0x0

    .line 483
    :goto_3
    if-ge v3, v2, :cond_4

    .line 484
    .line 485
    aget-object v4, v1, v3

    .line 486
    .line 487
    iget-object v5, v0, Lwe2;->c:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast v5, Lod2;

    .line 490
    .line 491
    iget-object v4, v4, Lzi1;->a:Ljava/lang/String;

    .line 492
    .line 493
    invoke-virtual {v5, v4}, Lod2;->a(Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    add-int/lit8 v3, v3, 0x1

    .line 497
    .line 498
    goto :goto_3

    .line 499
    :cond_4
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lui1;->a:Lwe2;

    .line 2
    .line 3
    iget-object v0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lod2;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iget-object v0, v0, Lod2;->a:Landroid/content/SharedPreferences;

    .line 9
    .line 10
    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x1

    .line 21
    xor-int/2addr v0, v1

    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lod2;

    .line 27
    .line 28
    invoke-virtual {p0, p2, p1}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

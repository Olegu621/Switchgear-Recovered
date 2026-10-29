.class public final Lpc2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Llc2;

.field public final b:Lv3;

.field public final c:Lim;

.field public d:Lkn1;


# direct methods
.method public constructor <init>(Llc2;Lv3;Lim;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lpc2;->a:Llc2;

    .line 8
    .line 9
    iput-object p2, p0, Lpc2;->b:Lv3;

    .line 10
    .line 11
    iput-object p3, p0, Lpc2;->c:Lim;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;ZLd10;)Ljava/io/Serializable;
    .locals 62

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    instance-of v3, v2, Lmc2;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lmc2;

    .line 13
    .line 14
    iget v4, v3, Lmc2;->i:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lmc2;->i:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lmc2;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Lmc2;-><init>(Lpc2;Ld10;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lmc2;->e:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, Lz10;->a:Lz10;

    .line 34
    .line 35
    iget v5, v3, Lmc2;->i:I

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/16 v7, 0xa

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    const/4 v9, 0x1

    .line 42
    if-eqz v5, :cond_2

    .line 43
    .line 44
    if-ne v5, v9, :cond_1

    .line 45
    .line 46
    iget v0, v3, Lmc2;->d:I

    .line 47
    .line 48
    iget-object v1, v3, Lmc2;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Ljava/util/Map;

    .line 51
    .line 52
    iget-object v4, v3, Lmc2;->b:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 53
    .line 54
    iget-object v3, v3, Lmc2;->a:Lpc2;

    .line 55
    .line 56
    invoke-static {v2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move v10, v0

    .line 60
    move-object v0, v3

    .line 61
    move-object v3, v2

    .line 62
    move-object v2, v1

    .line 63
    move-object v1, v4

    .line 64
    goto/16 :goto_5

    .line 65
    .line 66
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-static {v0}, Lf42;->l(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v6

    .line 72
    :cond_2
    invoke-static {v2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object v2, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->H:Ljava/util/List;

    .line 76
    .line 77
    if-nez v2, :cond_3

    .line 78
    .line 79
    sget-object v2, Lod0;->a:Lod0;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    invoke-static {v2, v7}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    invoke-static {v5}, Lnc1;->c(I)I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    const/16 v10, 0x10

    .line 94
    .line 95
    if-ge v5, v10, :cond_4

    .line 96
    .line 97
    move v5, v10

    .line 98
    :cond_4
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 99
    .line 100
    invoke-direct {v10, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-eqz v5, :cond_5

    .line 112
    .line 113
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    move-object v11, v5

    .line 118
    check-cast v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;

    .line 119
    .line 120
    iget-object v11, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;->a:Ljava/lang/String;

    .line 121
    .line 122
    invoke-interface {v10, v11, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_5
    move-object v2, v10

    .line 127
    :goto_2
    new-instance v5, Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 130
    .line 131
    .line 132
    iget-object v10, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->G:Ljava/util/List;

    .line 133
    .line 134
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    move v11, v8

    .line 139
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    if-eqz v12, :cond_8

    .line 144
    .line 145
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v12

    .line 149
    check-cast v12, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;

    .line 150
    .line 151
    iget-object v13, v12, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->e:Ljava/lang/String;

    .line 152
    .line 153
    invoke-interface {v2, v13}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v13

    .line 157
    if-nez v13, :cond_6

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_6
    new-instance v13, Lvi;

    .line 161
    .line 162
    invoke-virtual {v12}, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->b()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v14

    .line 166
    invoke-virtual {v12}, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->e()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v15

    .line 170
    invoke-direct {v13, v14, v15}, Lvi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    iget-object v12, v12, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->h:Ljava/util/List;

    .line 177
    .line 178
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v12

    .line 182
    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v13

    .line 186
    if-eqz v13, :cond_7

    .line 187
    .line 188
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v13

    .line 192
    check-cast v13, Lcom/usercentrics/sdk/v2/settings/data/SubConsentTemplate;

    .line 193
    .line 194
    new-instance v14, Lvi;

    .line 195
    .line 196
    invoke-virtual {v13}, Lcom/usercentrics/sdk/v2/settings/data/SubConsentTemplate;->b()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v15

    .line 200
    invoke-virtual {v13}, Lcom/usercentrics/sdk/v2/settings/data/SubConsentTemplate;->e()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v13

    .line 204
    invoke-direct {v14, v15, v13}, Lvi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_7
    add-int/lit8 v11, v11, 0x1

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_8
    new-instance v10, Lwa3;

    .line 215
    .line 216
    invoke-direct {v10, v7}, Lwa3;-><init>(I)V

    .line 217
    .line 218
    .line 219
    invoke-static {v10, v5}, Lkotlin/collections/CollectionsKt;->E(Ljava/util/Comparator;Ljava/lang/Iterable;)Ljava/util/List;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 228
    .line 229
    .line 230
    move-result v11

    .line 231
    if-eqz v11, :cond_9

    .line 232
    .line 233
    new-instance v0, Lkotlin/Pair;

    .line 234
    .line 235
    sget-object v1, Lnd0;->a:Lnd0;

    .line 236
    .line 237
    new-instance v2, Ljava/lang/Integer;

    .line 238
    .line 239
    invoke-direct {v2, v8}, Ljava/lang/Integer;-><init>(I)V

    .line 240
    .line 241
    .line 242
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    return-object v0

    .line 246
    :cond_9
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    iput-object v0, v3, Lmc2;->a:Lpc2;

    .line 251
    .line 252
    iput-object v1, v3, Lmc2;->b:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 253
    .line 254
    iput-object v2, v3, Lmc2;->c:Ljava/lang/Object;

    .line 255
    .line 256
    iput v10, v3, Lmc2;->d:I

    .line 257
    .line 258
    iput v9, v3, Lmc2;->i:I

    .line 259
    .line 260
    iget-object v11, v0, Lpc2;->b:Lv3;

    .line 261
    .line 262
    move-object/from16 v12, p1

    .line 263
    .line 264
    move/from16 v13, p3

    .line 265
    .line 266
    invoke-virtual {v11, v12, v5, v13, v3}, Lv3;->j(Ljava/lang/String;Ljava/util/List;ZLd10;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    if-ne v3, v4, :cond_a

    .line 271
    .line 272
    return-object v4

    .line 273
    :cond_a
    :goto_5
    check-cast v3, Ljava/util/List;

    .line 274
    .line 275
    new-instance v4, Lkotlin/Pair;

    .line 276
    .line 277
    iget-object v1, v1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->G:Ljava/util/List;

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    new-instance v0, Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 285
    .line 286
    .line 287
    new-instance v5, Ljava/util/ArrayList;

    .line 288
    .line 289
    invoke-static {v3, v7}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 290
    .line 291
    .line 292
    move-result v7

    .line 293
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 294
    .line 295
    .line 296
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 301
    .line 302
    .line 303
    move-result v7

    .line 304
    if-eqz v7, :cond_12

    .line 305
    .line 306
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v7

    .line 310
    check-cast v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;

    .line 311
    .line 312
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 313
    .line 314
    .line 315
    move-result-object v11

    .line 316
    :cond_b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 317
    .line 318
    .line 319
    move-result v12

    .line 320
    if-eqz v12, :cond_c

    .line 321
    .line 322
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v12

    .line 326
    move-object v13, v12

    .line 327
    check-cast v13, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;

    .line 328
    .line 329
    iget-object v14, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->a:Ljava/lang/String;

    .line 330
    .line 331
    iget-object v13, v13, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->c:Ljava/lang/String;

    .line 332
    .line 333
    invoke-static {v14, v13}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v13

    .line 337
    if-eqz v13, :cond_b

    .line 338
    .line 339
    goto :goto_7

    .line 340
    :cond_c
    move-object v12, v6

    .line 341
    :goto_7
    check-cast v12, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;

    .line 342
    .line 343
    if-eqz v12, :cond_d

    .line 344
    .line 345
    iget-object v11, v12, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->e:Ljava/lang/String;

    .line 346
    .line 347
    goto :goto_8

    .line 348
    :cond_d
    move-object v11, v6

    .line 349
    :goto_8
    invoke-interface {v2, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v11

    .line 353
    check-cast v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;

    .line 354
    .line 355
    if-eqz v12, :cond_11

    .line 356
    .line 357
    iget-object v13, v12, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->j:Ljava/util/List;

    .line 358
    .line 359
    if-eqz v11, :cond_11

    .line 360
    .line 361
    if-eqz v13, :cond_e

    .line 362
    .line 363
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 364
    .line 365
    .line 366
    move-result v14

    .line 367
    if-nez v14, :cond_e

    .line 368
    .line 369
    :goto_9
    move-object/from16 v30, v13

    .line 370
    .line 371
    goto :goto_a

    .line 372
    :cond_e
    iget-object v13, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->p:Ljava/util/List;

    .line 373
    .line 374
    goto :goto_9

    .line 375
    :goto_a
    iget-object v13, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;->a:Ljava/lang/String;

    .line 376
    .line 377
    iget-object v14, v12, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->a:Ljava/lang/Boolean;

    .line 378
    .line 379
    iget-object v15, v12, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->i:Ljava/lang/Boolean;

    .line 380
    .line 381
    iget-object v6, v12, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->k:Ljava/lang/Boolean;

    .line 382
    .line 383
    iget-boolean v8, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;->d:Z

    .line 384
    .line 385
    iget-boolean v11, v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;->e:Z

    .line 386
    .line 387
    if-nez v11, :cond_10

    .line 388
    .line 389
    iget-boolean v11, v12, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->g:Z

    .line 390
    .line 391
    if-eqz v11, :cond_f

    .line 392
    .line 393
    goto :goto_b

    .line 394
    :cond_f
    const/16 v56, 0x0

    .line 395
    .line 396
    goto :goto_c

    .line 397
    :cond_10
    :goto_b
    move/from16 v56, v9

    .line 398
    .line 399
    :goto_c
    sget-object v11, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->Companion:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService$Companion;

    .line 400
    .line 401
    move-object/from16 v59, v15

    .line 402
    .line 403
    iget-object v15, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->a:Ljava/lang/String;

    .line 404
    .line 405
    iget-object v11, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->b:Ljava/lang/String;

    .line 406
    .line 407
    iget-object v12, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->c:Ljava/lang/String;

    .line 408
    .line 409
    iget-object v9, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->d:Ljava/util/List;

    .line 410
    .line 411
    move-object/from16 p0, v1

    .line 412
    .line 413
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->e:Ljava/lang/String;

    .line 414
    .line 415
    move-object/from16 v19, v1

    .line 416
    .line 417
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->f:Ljava/util/List;

    .line 418
    .line 419
    move-object/from16 v20, v1

    .line 420
    .line 421
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->g:Ljava/lang/String;

    .line 422
    .line 423
    move-object/from16 v21, v1

    .line 424
    .line 425
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->h:Ljava/lang/String;

    .line 426
    .line 427
    move-object/from16 v22, v1

    .line 428
    .line 429
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->i:Ljava/lang/String;

    .line 430
    .line 431
    move-object/from16 v23, v1

    .line 432
    .line 433
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->j:Ljava/lang/String;

    .line 434
    .line 435
    move-object/from16 v24, v1

    .line 436
    .line 437
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->k:Ljava/util/List;

    .line 438
    .line 439
    move-object/from16 v25, v1

    .line 440
    .line 441
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->l:Ljava/util/List;

    .line 442
    .line 443
    move-object/from16 v26, v1

    .line 444
    .line 445
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->m:Ljava/util/List;

    .line 446
    .line 447
    move-object/from16 v27, v1

    .line 448
    .line 449
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->n:Ljava/util/List;

    .line 450
    .line 451
    move-object/from16 v28, v1

    .line 452
    .line 453
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->o:Ljava/util/List;

    .line 454
    .line 455
    move-object/from16 v29, v1

    .line 456
    .line 457
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->q:Ljava/util/List;

    .line 458
    .line 459
    move-object/from16 v31, v1

    .line 460
    .line 461
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->r:Ljava/util/List;

    .line 462
    .line 463
    move-object/from16 v32, v1

    .line 464
    .line 465
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->s:Ljava/lang/String;

    .line 466
    .line 467
    move-object/from16 v33, v1

    .line 468
    .line 469
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->t:Ljava/lang/String;

    .line 470
    .line 471
    move-object/from16 v34, v1

    .line 472
    .line 473
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->u:Ljava/lang/String;

    .line 474
    .line 475
    move-object/from16 v35, v1

    .line 476
    .line 477
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->v:Ljava/lang/Boolean;

    .line 478
    .line 479
    move-object/from16 v36, v1

    .line 480
    .line 481
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->w:Ljava/lang/String;

    .line 482
    .line 483
    move-object/from16 v37, v1

    .line 484
    .line 485
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->x:Ljava/lang/String;

    .line 486
    .line 487
    move-object/from16 v38, v1

    .line 488
    .line 489
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->y:Ljava/lang/String;

    .line 490
    .line 491
    move-object/from16 v39, v1

    .line 492
    .line 493
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->z:Ljava/lang/String;

    .line 494
    .line 495
    move-object/from16 v40, v1

    .line 496
    .line 497
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->B:Ljava/lang/String;

    .line 498
    .line 499
    move-object/from16 v42, v1

    .line 500
    .line 501
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->C:Ljava/lang/String;

    .line 502
    .line 503
    move-object/from16 v43, v1

    .line 504
    .line 505
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->D:Ljava/lang/String;

    .line 506
    .line 507
    move-object/from16 v44, v1

    .line 508
    .line 509
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->E:Ljava/lang/String;

    .line 510
    .line 511
    move-object/from16 v45, v1

    .line 512
    .line 513
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->F:Ljava/lang/String;

    .line 514
    .line 515
    move-object/from16 v46, v1

    .line 516
    .line 517
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->G:Ljava/lang/String;

    .line 518
    .line 519
    move-object/from16 v47, v1

    .line 520
    .line 521
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->H:Ljava/lang/String;

    .line 522
    .line 523
    move-object/from16 v48, v1

    .line 524
    .line 525
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->I:Ljava/lang/String;

    .line 526
    .line 527
    move-object/from16 v49, v1

    .line 528
    .line 529
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->J:Ljava/lang/String;

    .line 530
    .line 531
    move-object/from16 v50, v1

    .line 532
    .line 533
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->K:Ljava/lang/Long;

    .line 534
    .line 535
    move-object/from16 v51, v1

    .line 536
    .line 537
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->L:Ljava/lang/Boolean;

    .line 538
    .line 539
    move-object/from16 v52, v1

    .line 540
    .line 541
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->M:Ljava/lang/String;

    .line 542
    .line 543
    move-object/from16 v53, v1

    .line 544
    .line 545
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->N:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;

    .line 546
    .line 547
    move-object/from16 v54, v1

    .line 548
    .line 549
    iget-object v1, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->O:Ljava/lang/String;

    .line 550
    .line 551
    iget-object v7, v7, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;->Q:Ljava/lang/String;

    .line 552
    .line 553
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 587
    .line 588
    .line 589
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v38 .. v38}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v39 .. v39}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v40 .. v40}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v43 .. v43}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    invoke-virtual/range {v44 .. v44}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v45 .. v45}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 608
    .line 609
    .line 610
    invoke-virtual/range {v46 .. v46}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 611
    .line 612
    .line 613
    invoke-virtual/range {v47 .. v47}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v49 .. v49}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v54 .. v54}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    move-object/from16 v58, v14

    .line 623
    .line 624
    new-instance v14, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;

    .line 625
    .line 626
    move-object/from16 v55, v1

    .line 627
    .line 628
    move-object/from16 v60, v6

    .line 629
    .line 630
    move-object/from16 v57, v7

    .line 631
    .line 632
    move/from16 v61, v8

    .line 633
    .line 634
    move-object/from16 v18, v9

    .line 635
    .line 636
    move-object/from16 v16, v11

    .line 637
    .line 638
    move-object/from16 v17, v12

    .line 639
    .line 640
    move-object/from16 v41, v13

    .line 641
    .line 642
    invoke-direct/range {v14 .. v61}, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsService;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    goto :goto_d

    .line 649
    :cond_11
    move-object/from16 p0, v1

    .line 650
    .line 651
    :goto_d
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 652
    .line 653
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    move-object/from16 v1, p0

    .line 657
    .line 658
    const/4 v6, 0x0

    .line 659
    const/4 v8, 0x0

    .line 660
    const/4 v9, 0x1

    .line 661
    goto/16 :goto_6

    .line 662
    .line 663
    :cond_12
    new-instance v1, Ljava/lang/Integer;

    .line 664
    .line 665
    invoke-direct {v1, v10}, Ljava/lang/Integer;-><init>(I)V

    .line 666
    .line 667
    .line 668
    invoke-direct {v4, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 669
    .line 670
    .line 671
    return-object v4
.end method

.method public final b(Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;Ld10;)Ljava/lang/Object;
    .locals 39

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
    instance-of v3, v2, Lnc2;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lnc2;

    .line 13
    .line 14
    iget v4, v3, Lnc2;->e:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lnc2;->e:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lnc2;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Lnc2;-><init>(Lpc2;Ld10;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lnc2;->c:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, Lz10;->a:Lz10;

    .line 34
    .line 35
    iget v5, v3, Lnc2;->e:I

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    if-ne v5, v6, :cond_1

    .line 41
    .line 42
    iget-object v0, v3, Lnc2;->b:Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;

    .line 43
    .line 44
    iget-object v1, v3, Lnc2;->a:Lpc2;

    .line 45
    .line 46
    invoke-static {v2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object/from16 v38, v1

    .line 50
    .line 51
    move-object v1, v0

    .line 52
    move-object/from16 v0, v38

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {v0}, Lf42;->l(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    return-object v0

    .line 62
    :cond_2
    invoke-static {v2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iput-object v0, v3, Lnc2;->a:Lpc2;

    .line 66
    .line 67
    iput-object v1, v3, Lnc2;->b:Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;

    .line 68
    .line 69
    iput v6, v3, Lnc2;->e:I

    .line 70
    .line 71
    iget-object v2, v0, Lpc2;->a:Llc2;

    .line 72
    .line 73
    invoke-virtual {v2, v1, v3}, Llc2;->i(Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;Ld10;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    if-ne v2, v4, :cond_3

    .line 78
    .line 79
    return-object v4

    .line 80
    :cond_3
    :goto_1
    check-cast v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 81
    .line 82
    iget-object v3, v0, Lpc2;->c:Lim;

    .line 83
    .line 84
    iget-boolean v1, v1, Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;->e:Z

    .line 85
    .line 86
    iget-object v0, v0, Lpc2;->a:Llc2;

    .line 87
    .line 88
    iget-boolean v0, v0, Llc2;->f:Z

    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    if-nez v1, :cond_5

    .line 94
    .line 95
    if-ne v0, v6, :cond_4

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    const/4 v6, 0x0

    .line 99
    :cond_5
    :goto_2
    iput-boolean v6, v3, Lim;->a:Z

    .line 100
    .line 101
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->G:Ljava/util/List;

    .line 102
    .line 103
    new-instance v1, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_7

    .line 117
    .line 118
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    move-object v4, v3

    .line 123
    check-cast v4, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;

    .line 124
    .line 125
    iget-object v4, v4, Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;->a:Ljava/lang/Boolean;

    .line 126
    .line 127
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-nez v4, :cond_6

    .line 134
    .line 135
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_7
    iget-object v4, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;

    .line 140
    .line 141
    iget-object v5, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->b:Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;

    .line 142
    .line 143
    iget-object v6, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->c:Ljava/lang/String;

    .line 144
    .line 145
    iget-object v7, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->d:Ljava/lang/String;

    .line 146
    .line 147
    iget-object v8, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->e:Ljava/lang/String;

    .line 148
    .line 149
    iget-object v9, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->f:Ljava/lang/String;

    .line 150
    .line 151
    iget-object v10, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->g:Ljava/lang/String;

    .line 152
    .line 153
    iget-object v11, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->h:Ljava/lang/String;

    .line 154
    .line 155
    iget-object v12, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->i:Ljava/lang/String;

    .line 156
    .line 157
    iget-object v13, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->j:Ljava/lang/String;

    .line 158
    .line 159
    iget-boolean v14, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->k:Z

    .line 160
    .line 161
    iget-boolean v15, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->l:Z

    .line 162
    .line 163
    iget-boolean v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->m:Z

    .line 164
    .line 165
    iget-boolean v3, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->n:Z

    .line 166
    .line 167
    move/from16 v16, v0

    .line 168
    .line 169
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->o:Ljava/lang/Integer;

    .line 170
    .line 171
    move-object/from16 v18, v0

    .line 172
    .line 173
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->p:Ljava/util/List;

    .line 174
    .line 175
    move-object/from16 v19, v0

    .line 176
    .line 177
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->q:Ljava/util/List;

    .line 178
    .line 179
    move-object/from16 v20, v0

    .line 180
    .line 181
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->r:Ljava/util/List;

    .line 182
    .line 183
    move-object/from16 v21, v0

    .line 184
    .line 185
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->s:Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;

    .line 186
    .line 187
    move-object/from16 v22, v0

    .line 188
    .line 189
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 190
    .line 191
    move-object/from16 v23, v0

    .line 192
    .line 193
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->u:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;

    .line 194
    .line 195
    move-object/from16 v24, v0

    .line 196
    .line 197
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->v:Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;

    .line 198
    .line 199
    move-object/from16 v25, v0

    .line 200
    .line 201
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->w:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsStyles;

    .line 202
    .line 203
    move-object/from16 v26, v0

    .line 204
    .line 205
    iget-boolean v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->x:Z

    .line 206
    .line 207
    move/from16 v27, v0

    .line 208
    .line 209
    iget-boolean v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->y:Z

    .line 210
    .line 211
    move/from16 v28, v0

    .line 212
    .line 213
    iget-boolean v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->z:Z

    .line 214
    .line 215
    move/from16 v29, v0

    .line 216
    .line 217
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->A:Lcom/usercentrics/sdk/v2/settings/data/VariantsSettings;

    .line 218
    .line 219
    move-object/from16 v30, v0

    .line 220
    .line 221
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->B:Lq90;

    .line 222
    .line 223
    move-object/from16 v31, v0

    .line 224
    .line 225
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->C:Lyw2;

    .line 226
    .line 227
    move-object/from16 v32, v0

    .line 228
    .line 229
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->D:Ljava/util/List;

    .line 230
    .line 231
    move-object/from16 v33, v0

    .line 232
    .line 233
    iget-object v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->E:Ljava/lang/Long;

    .line 234
    .line 235
    move-object/from16 v34, v0

    .line 236
    .line 237
    iget-boolean v0, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->F:Z

    .line 238
    .line 239
    iget-object v2, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->H:Ljava/util/List;

    .line 240
    .line 241
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    move/from16 v17, v3

    .line 266
    .line 267
    new-instance v3, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 268
    .line 269
    move/from16 v35, v0

    .line 270
    .line 271
    move-object/from16 v36, v1

    .line 272
    .line 273
    move-object/from16 v37, v2

    .line 274
    .line 275
    invoke-direct/range {v3 .. v37}, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;-><init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsLabels;Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;Lcom/usercentrics/sdk/v2/settings/data/FirstLayer;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsStyles;ZZZLcom/usercentrics/sdk/v2/settings/data/VariantsSettings;Lq90;Lyw2;Ljava/util/List;Ljava/lang/Long;ZLjava/util/List;Ljava/util/List;)V

    .line 276
    .line 277
    .line 278
    return-object v3
.end method

.method public final c(Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;Ld10;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Loc2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Loc2;

    .line 7
    .line 8
    iget v1, v0, Loc2;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Loc2;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Loc2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Loc2;-><init>(Lpc2;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Loc2;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Loc2;->e:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p0, v0, Loc2;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 42
    .line 43
    iget-object p1, v0, Loc2;->a:Lpc2;

    .line 44
    .line 45
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0

    .line 56
    :cond_2
    iget-object p0, v0, Loc2;->b:Ljava/lang/Object;

    .line 57
    .line 58
    move-object p1, p0

    .line 59
    check-cast p1, Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;

    .line 60
    .line 61
    iget-object p0, v0, Loc2;->a:Lpc2;

    .line 62
    .line 63
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iput-object p0, v0, Loc2;->a:Lpc2;

    .line 71
    .line 72
    iput-object p1, v0, Loc2;->b:Ljava/lang/Object;

    .line 73
    .line 74
    iput v4, v0, Loc2;->e:I

    .line 75
    .line 76
    invoke-virtual {p0, p1, v0}, Lpc2;->b(Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;Ld10;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    if-ne p2, v1, :cond_4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    :goto_1
    check-cast p2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 84
    .line 85
    iget-object p1, p1, Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;->c:Ljava/lang/String;

    .line 86
    .line 87
    iget-object v2, p0, Lpc2;->c:Lim;

    .line 88
    .line 89
    iget-boolean v2, v2, Lim;->a:Z

    .line 90
    .line 91
    iput-object p0, v0, Loc2;->a:Lpc2;

    .line 92
    .line 93
    iput-object p2, v0, Loc2;->b:Ljava/lang/Object;

    .line 94
    .line 95
    iput v3, v0, Loc2;->e:I

    .line 96
    .line 97
    invoke-virtual {p0, p1, p2, v2, v0}, Lpc2;->a(Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;ZLd10;)Ljava/io/Serializable;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-ne p1, v1, :cond_5

    .line 102
    .line 103
    :goto_2
    return-object v1

    .line 104
    :cond_5
    move-object v5, p1

    .line 105
    move-object p1, p0

    .line 106
    move-object p0, p2

    .line 107
    move-object p2, v5

    .line 108
    :goto_3
    check-cast p2, Lkotlin/Pair;

    .line 109
    .line 110
    new-instance v0, Lkn1;

    .line 111
    .line 112
    iget-object v1, p2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, Ljava/util/List;

    .line 115
    .line 116
    iget-object p2, p2, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p2, Ljava/lang/Number;

    .line 119
    .line 120
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    invoke-direct {v0, p0, v1, p2}, Lkn1;-><init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Ljava/util/List;I)V

    .line 125
    .line 126
    .line 127
    iput-object v0, p1, Lpc2;->d:Lkn1;

    .line 128
    .line 129
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object p0
.end method

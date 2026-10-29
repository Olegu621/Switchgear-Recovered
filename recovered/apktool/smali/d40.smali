.class public final Ld40;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Lc40;


# instance fields
.field public final a:Ljz;

.field public final b:Lac2;

.field public final c:Lpc2;

.field public final d:Lg80;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc40;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ld40;->Companion:Lc40;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljz;Lac2;Lpc2;Lg80;Lil2;Ly3;Li03;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Ld40;->a:Ljz;

    .line 26
    .line 27
    iput-object p2, p0, Ld40;->b:Lac2;

    .line 28
    .line 29
    iput-object p3, p0, Ld40;->c:Lpc2;

    .line 30
    .line 31
    iput-object p4, p0, Ld40;->d:Lg80;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/util/List;Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;)Ljava/util/ArrayList;
    .locals 39

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    iget-object v1, v0, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;->d:Ljava/util/List;

    .line 4
    .line 5
    new-instance v2, Ljava/util/ArrayList;

    .line 6
    .line 7
    const/16 v3, 0xa

    .line 8
    .line 9
    move-object/from16 v4, p2

    .line 10
    .line 11
    invoke-static {v4, v3}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_9

    .line 27
    .line 28
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    check-cast v5, Lm61;

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    const/4 v7, 0x0

    .line 39
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    const/4 v9, -0x1

    .line 44
    if-eqz v8, :cond_1

    .line 45
    .line 46
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    check-cast v8, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectService;

    .line 51
    .line 52
    iget-object v8, v8, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectService;->a:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v10, v5, Lm61;->f:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_0

    .line 61
    .line 62
    :goto_2
    move-object/from16 v6, p0

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_0
    add-int/lit8 v7, v7, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    move v7, v9

    .line 69
    goto :goto_2

    .line 70
    :goto_3
    iget-object v8, v6, Ld40;->d:Lg80;

    .line 71
    .line 72
    check-cast v8, Lpz2;

    .line 73
    .line 74
    iget-object v10, v8, Lpz2;->f:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

    .line 75
    .line 76
    iget-object v10, v10, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;->d:Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    :cond_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    if-eqz v11, :cond_3

    .line 87
    .line 88
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    move-object v12, v11

    .line 93
    check-cast v12, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;

    .line 94
    .line 95
    iget-object v12, v12, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;->b:Ljava/lang/String;

    .line 96
    .line 97
    iget-object v13, v5, Lm61;->f:Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    if-eqz v12, :cond_2

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_3
    const/4 v11, 0x0

    .line 107
    :goto_4
    check-cast v11, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;

    .line 108
    .line 109
    if-le v7, v9, :cond_8

    .line 110
    .line 111
    new-instance v9, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 114
    .line 115
    .line 116
    iget-object v10, v5, Lm61;->p:Li61;

    .line 117
    .line 118
    iget-object v12, v5, Lm61;->t:Ljava/util/List;

    .line 119
    .line 120
    iget-object v13, v5, Lm61;->o:Ljava/lang/String;

    .line 121
    .line 122
    iget-object v14, v5, Lm61;->n:Ljava/lang/String;

    .line 123
    .line 124
    iget-object v15, v5, Lm61;->l:Law1;

    .line 125
    .line 126
    iget-object v3, v5, Lm61;->i:Lhv1;

    .line 127
    .line 128
    move-object/from16 v26, v14

    .line 129
    .line 130
    iget-object v14, v5, Lm61;->b:Lmu1;

    .line 131
    .line 132
    iget-object v10, v10, Li61;->a:Ljava/util/List;

    .line 133
    .line 134
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 135
    .line 136
    .line 137
    move-object/from16 v21, v3

    .line 138
    .line 139
    move-object/from16 p2, v4

    .line 140
    .line 141
    iget-wide v3, v0, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;->e:J

    .line 142
    .line 143
    const-wide/16 v16, 0x3e8

    .line 144
    .line 145
    mul-long v32, v3, v16

    .line 146
    .line 147
    new-instance v27, Lj61;

    .line 148
    .line 149
    iget-object v3, v0, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;->b:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectConsent;

    .line 150
    .line 151
    iget-object v4, v3, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectConsent;->a:Lkz2;

    .line 152
    .line 153
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    check-cast v7, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectService;

    .line 158
    .line 159
    iget-boolean v7, v7, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectService;->c:Z

    .line 160
    .line 161
    iget-object v3, v3, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectConsent;->b:Lmz2;

    .line 162
    .line 163
    iget-object v10, v0, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;->c:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectSettings;

    .line 164
    .line 165
    iget-object v10, v10, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectSettings;->c:Ljava/lang/String;

    .line 166
    .line 167
    move-object/from16 v30, v3

    .line 168
    .line 169
    move-object/from16 v28, v4

    .line 170
    .line 171
    move/from16 v29, v7

    .line 172
    .line 173
    move-object/from16 v31, v10

    .line 174
    .line 175
    invoke-direct/range {v27 .. v33}, Lj61;-><init>(Lkz2;ZLmz2;Ljava/lang/String;J)V

    .line 176
    .line 177
    .line 178
    move-object/from16 v3, v27

    .line 179
    .line 180
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    add-int/lit8 v3, v3, -0x1

    .line 188
    .line 189
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    check-cast v3, Lj61;

    .line 194
    .line 195
    iget-object v4, v8, Lpz2;->f:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

    .line 196
    .line 197
    iget-object v4, v4, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;->a:Ljava/lang/String;

    .line 198
    .line 199
    move-object/from16 v7, p1

    .line 200
    .line 201
    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    if-eqz v4, :cond_7

    .line 206
    .line 207
    if-eqz v11, :cond_7

    .line 208
    .line 209
    iget-object v4, v11, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;->a:Ljava/util/List;

    .line 210
    .line 211
    move-object v8, v1

    .line 212
    iget-wide v0, v3, Lj61;->e:J

    .line 213
    .line 214
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 215
    .line 216
    .line 217
    move-result v10

    .line 218
    if-nez v10, :cond_4

    .line 219
    .line 220
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 221
    .line 222
    .line 223
    move-result v10

    .line 224
    add-int/lit8 v10, v10, -0x1

    .line 225
    .line 226
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    check-cast v10, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;

    .line 231
    .line 232
    move-wide/from16 v16, v0

    .line 233
    .line 234
    iget-wide v0, v10, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->e:J

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_4
    move-wide/from16 v16, v0

    .line 238
    .line 239
    const-wide/16 v0, 0x0

    .line 240
    .line 241
    :goto_5
    cmp-long v0, v0, v16

    .line 242
    .line 243
    if-ltz v0, :cond_6

    .line 244
    .line 245
    move-object/from16 v27, v13

    .line 246
    .line 247
    iget-object v13, v5, Lm61;->a:Ljava/util/List;

    .line 248
    .line 249
    move-object/from16 v24, v15

    .line 250
    .line 251
    iget-object v15, v5, Lm61;->c:Ljava/util/List;

    .line 252
    .line 253
    iget-object v0, v5, Lm61;->d:Ljava/util/List;

    .line 254
    .line 255
    iget-object v1, v5, Lm61;->e:Ljava/lang/String;

    .line 256
    .line 257
    iget-object v3, v5, Lm61;->f:Ljava/lang/String;

    .line 258
    .line 259
    iget-object v9, v5, Lm61;->g:Ljava/util/List;

    .line 260
    .line 261
    iget-object v10, v5, Lm61;->h:Ljava/lang/String;

    .line 262
    .line 263
    move-object/from16 v16, v0

    .line 264
    .line 265
    iget-object v0, v5, Lm61;->j:Ljava/lang/String;

    .line 266
    .line 267
    move-object/from16 v22, v0

    .line 268
    .line 269
    iget-object v0, v5, Lm61;->k:Ljava/util/List;

    .line 270
    .line 271
    move-object/from16 v23, v0

    .line 272
    .line 273
    iget-object v0, v5, Lm61;->m:Ljava/lang/String;

    .line 274
    .line 275
    move-object/from16 v25, v0

    .line 276
    .line 277
    iget-boolean v0, v5, Lm61;->q:Z

    .line 278
    .line 279
    move/from16 v29, v0

    .line 280
    .line 281
    iget-object v0, v5, Lm61;->s:Ljava/lang/String;

    .line 282
    .line 283
    iget-boolean v11, v11, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;->d:Z

    .line 284
    .line 285
    move-object/from16 v31, v0

    .line 286
    .line 287
    new-instance v0, Ljava/util/ArrayList;

    .line 288
    .line 289
    move-object/from16 v17, v1

    .line 290
    .line 291
    move-object/from16 v18, v3

    .line 292
    .line 293
    const/16 v1, 0xa

    .line 294
    .line 295
    invoke-static {v4, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 300
    .line 301
    .line 302
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    if-eqz v4, :cond_5

    .line 311
    .line 312
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    check-cast v4, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;

    .line 317
    .line 318
    invoke-virtual {v4}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->a()Lj61;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_5
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->G(Ljava/util/List;)Ljava/util/List;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    new-instance v3, Li61;

    .line 331
    .line 332
    invoke-direct {v3, v0, v11}, Li61;-><init>(Ljava/util/List;Z)V

    .line 333
    .line 334
    .line 335
    iget-object v0, v5, Lm61;->u:Ljava/lang/Long;

    .line 336
    .line 337
    iget-object v4, v5, Lm61;->v:Ljava/lang/Boolean;

    .line 338
    .line 339
    iget-object v11, v5, Lm61;->w:Ljava/lang/String;

    .line 340
    .line 341
    iget-object v1, v5, Lm61;->x:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;

    .line 342
    .line 343
    move-object/from16 v33, v0

    .line 344
    .line 345
    iget-boolean v0, v5, Lm61;->r:Z

    .line 346
    .line 347
    move/from16 v30, v0

    .line 348
    .line 349
    iget-boolean v0, v5, Lm61;->y:Z

    .line 350
    .line 351
    iget-object v5, v5, Lm61;->z:Ljava/lang/Boolean;

    .line 352
    .line 353
    move-object/from16 v32, v12

    .line 354
    .line 355
    new-instance v12, Lm61;

    .line 356
    .line 357
    move/from16 v37, v0

    .line 358
    .line 359
    move-object/from16 v36, v1

    .line 360
    .line 361
    move-object/from16 v28, v3

    .line 362
    .line 363
    move-object/from16 v34, v4

    .line 364
    .line 365
    move-object/from16 v38, v5

    .line 366
    .line 367
    move-object/from16 v19, v9

    .line 368
    .line 369
    move-object/from16 v20, v10

    .line 370
    .line 371
    move-object/from16 v35, v11

    .line 372
    .line 373
    invoke-direct/range {v12 .. v38}, Lm61;-><init>(Ljava/util/List;Lmu1;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lhv1;Ljava/lang/String;Ljava/util/List;Law1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Li61;ZZLjava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;ZLjava/lang/Boolean;)V

    .line 374
    .line 375
    .line 376
    :goto_7
    move-object v5, v12

    .line 377
    goto/16 :goto_a

    .line 378
    .line 379
    :cond_6
    :goto_8
    move-object/from16 v32, v12

    .line 380
    .line 381
    move-object/from16 v27, v13

    .line 382
    .line 383
    move-object/from16 v24, v15

    .line 384
    .line 385
    goto :goto_9

    .line 386
    :cond_7
    move-object v8, v1

    .line 387
    goto :goto_8

    .line 388
    :goto_9
    iget-object v13, v5, Lm61;->a:Ljava/util/List;

    .line 389
    .line 390
    iget-object v15, v5, Lm61;->c:Ljava/util/List;

    .line 391
    .line 392
    iget-object v0, v5, Lm61;->d:Ljava/util/List;

    .line 393
    .line 394
    iget-object v1, v5, Lm61;->e:Ljava/lang/String;

    .line 395
    .line 396
    iget-object v4, v5, Lm61;->f:Ljava/lang/String;

    .line 397
    .line 398
    iget-object v10, v5, Lm61;->g:Ljava/util/List;

    .line 399
    .line 400
    iget-object v11, v5, Lm61;->h:Ljava/lang/String;

    .line 401
    .line 402
    iget-object v12, v5, Lm61;->j:Ljava/lang/String;

    .line 403
    .line 404
    move-object/from16 v16, v0

    .line 405
    .line 406
    iget-object v0, v5, Lm61;->k:Ljava/util/List;

    .line 407
    .line 408
    move-object/from16 v23, v0

    .line 409
    .line 410
    iget-object v0, v5, Lm61;->m:Ljava/lang/String;

    .line 411
    .line 412
    move-object/from16 v25, v0

    .line 413
    .line 414
    iget-boolean v0, v5, Lm61;->q:Z

    .line 415
    .line 416
    move/from16 v29, v0

    .line 417
    .line 418
    iget-object v0, v5, Lm61;->s:Ljava/lang/String;

    .line 419
    .line 420
    iget-boolean v3, v3, Lj61;->b:Z

    .line 421
    .line 422
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->G(Ljava/util/List;)Ljava/util/List;

    .line 423
    .line 424
    .line 425
    move-result-object v9

    .line 426
    move-object/from16 v31, v0

    .line 427
    .line 428
    new-instance v0, Li61;

    .line 429
    .line 430
    invoke-direct {v0, v9, v3}, Li61;-><init>(Ljava/util/List;Z)V

    .line 431
    .line 432
    .line 433
    iget-object v3, v5, Lm61;->u:Ljava/lang/Long;

    .line 434
    .line 435
    iget-object v9, v5, Lm61;->v:Ljava/lang/Boolean;

    .line 436
    .line 437
    move-object/from16 v28, v0

    .line 438
    .line 439
    iget-object v0, v5, Lm61;->w:Ljava/lang/String;

    .line 440
    .line 441
    move-object/from16 v35, v0

    .line 442
    .line 443
    iget-object v0, v5, Lm61;->x:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;

    .line 444
    .line 445
    move-object/from16 v36, v0

    .line 446
    .line 447
    iget-boolean v0, v5, Lm61;->r:Z

    .line 448
    .line 449
    move/from16 v30, v0

    .line 450
    .line 451
    iget-boolean v0, v5, Lm61;->y:Z

    .line 452
    .line 453
    iget-object v5, v5, Lm61;->z:Ljava/lang/Boolean;

    .line 454
    .line 455
    move-object/from16 v22, v12

    .line 456
    .line 457
    new-instance v12, Lm61;

    .line 458
    .line 459
    move/from16 v37, v0

    .line 460
    .line 461
    move-object/from16 v17, v1

    .line 462
    .line 463
    move-object/from16 v33, v3

    .line 464
    .line 465
    move-object/from16 v18, v4

    .line 466
    .line 467
    move-object/from16 v38, v5

    .line 468
    .line 469
    move-object/from16 v34, v9

    .line 470
    .line 471
    move-object/from16 v19, v10

    .line 472
    .line 473
    move-object/from16 v20, v11

    .line 474
    .line 475
    invoke-direct/range {v12 .. v38}, Lm61;-><init>(Ljava/util/List;Lmu1;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lhv1;Ljava/lang/String;Ljava/util/List;Law1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Li61;ZZLjava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;ZLjava/lang/Boolean;)V

    .line 476
    .line 477
    .line 478
    goto :goto_7

    .line 479
    :cond_8
    move-object/from16 v7, p1

    .line 480
    .line 481
    move-object v8, v1

    .line 482
    move-object/from16 p2, v4

    .line 483
    .line 484
    :goto_a
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-object/from16 v4, p2

    .line 488
    .line 489
    move-object/from16 v0, p3

    .line 490
    .line 491
    move-object v1, v8

    .line 492
    const/16 v3, 0xa

    .line 493
    .line 494
    goto/16 :goto_0

    .line 495
    .line 496
    :cond_9
    return-object v2
.end method

.method public final b(Ljava/lang/String;Ljava/util/List;Lkz2;Lmz2;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Ld40;->c:Lpc2;

    .line 8
    .line 9
    iget-object v0, v0, Lpc2;->d:Lkn1;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Lkn1;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 15
    .line 16
    move-object v3, v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v3, v1

    .line 19
    :goto_0
    if-nez v3, :cond_1

    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_1
    sget-object v2, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;->Companion:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$Companion;

    .line 24
    .line 25
    iget-object v0, p0, Ld40;->b:Lac2;

    .line 26
    .line 27
    iget-object v4, v0, Lac2;->c:Lk61;

    .line 28
    .line 29
    iget-object v4, v4, Lk61;->e:Ljava/lang/String;

    .line 30
    .line 31
    move-object v5, p2

    .line 32
    move-object v6, p3

    .line 33
    move-object v7, p4

    .line 34
    invoke-static/range {v2 .. v7}, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$Companion;->a(Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$Companion;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Ljava/lang/String;Ljava/util/List;Lkz2;Lmz2;)Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p0, p1, v5, p2}, Ld40;->a(Ljava/lang/String;Ljava/util/List;Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;)Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object p2, v0, Lac2;->c:Lk61;

    .line 43
    .line 44
    iget-object p2, p2, Lk61;->b:Ljava/util/List;

    .line 45
    .line 46
    invoke-static {p2, p1}, Lqj3;->O(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance p2, Ljava/util/ArrayList;

    .line 51
    .line 52
    const/16 p3, 0xa

    .line 53
    .line 54
    invoke-static {p1, p3}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 55
    .line 56
    .line 57
    move-result p3

    .line 58
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    if-eqz p3, :cond_3

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    check-cast p3, Lm61;

    .line 76
    .line 77
    iget-object p4, p3, Lm61;->p:Li61;

    .line 78
    .line 79
    iget-object p4, p4, Li61;->a:Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {p4}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result p4

    .line 85
    const/4 v2, 0x3

    .line 86
    if-le p4, v2, :cond_2

    .line 87
    .line 88
    iget-object p4, p3, Lm61;->p:Li61;

    .line 89
    .line 90
    iget-object v2, p4, Li61;->a:Ljava/util/List;

    .line 91
    .line 92
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->G(Ljava/util/List;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    iget-boolean p4, p4, Li61;->b:Z

    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    new-instance v3, Li61;

    .line 102
    .line 103
    invoke-direct {v3, v2, p4}, Li61;-><init>(Ljava/util/List;Z)V

    .line 104
    .line 105
    .line 106
    invoke-static {p3, v3}, Lm61;->a(Lm61;Li61;)Lm61;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    :cond_2
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    iget-object p1, v0, Lac2;->c:Lk61;

    .line 115
    .line 116
    const/16 p3, 0x3ffd

    .line 117
    .line 118
    invoke-static {p1, p2, v1, p3}, Lk61;->a(Lk61;Ljava/util/List;Ljava/lang/String;I)Lk61;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iput-object p1, v0, Lac2;->c:Lk61;

    .line 123
    .line 124
    iget-object p3, p0, Ld40;->d:Lg80;

    .line 125
    .line 126
    check-cast p3, Lpz2;

    .line 127
    .line 128
    invoke-virtual {p3, p1, p2}, Lpz2;->g(Lk61;Ljava/util/List;)V

    .line 129
    .line 130
    .line 131
    iget-object p0, p0, Ld40;->a:Ljz;

    .line 132
    .line 133
    check-cast p0, Lmz;

    .line 134
    .line 135
    iget-object p1, p0, Lmz;->a:Lx80;

    .line 136
    .line 137
    new-instance p2, Lqh;

    .line 138
    .line 139
    const/4 p4, 0x1

    .line 140
    invoke-direct {p2, p0, v6, v1, p4}, Lqh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, p2}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 144
    .line 145
    .line 146
    sget-object p0, Lkz2;->e:Lkz2;

    .line 147
    .line 148
    if-eq v6, p0, :cond_4

    .line 149
    .line 150
    iget-object p0, p3, Lpz2;->e:Lod2;

    .line 151
    .line 152
    sget-object p1, Lfh2;->a:[Lfh2;

    .line 153
    .line 154
    const-string p1, "user_action_required"

    .line 155
    .line 156
    invoke-virtual {p0, p1}, Lod2;->a(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    :cond_4
    :goto_2
    return-void
.end method

.method public final c()Ljh1;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lb7;->i:Lb7;

    .line 4
    .line 5
    iget-object v2, v0, Ld40;->d:Lg80;

    .line 6
    .line 7
    check-cast v2, Lpz2;

    .line 8
    .line 9
    iget-object v2, v2, Lpz2;->f:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;

    .line 10
    .line 11
    iget-object v0, v0, Ld40;->b:Lac2;

    .line 12
    .line 13
    iget-object v3, v0, Lac2;->c:Lk61;

    .line 14
    .line 15
    iget-object v3, v3, Lk61;->b:Ljava/util/List;

    .line 16
    .line 17
    new-instance v4, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_1

    .line 31
    .line 32
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    move-object v6, v5

    .line 37
    check-cast v6, Lm61;

    .line 38
    .line 39
    iget-boolean v6, v6, Lm61;->q:Z

    .line 40
    .line 41
    if-eqz v6, :cond_0

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-static {v4, v1}, Lhu0;->D0(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    new-instance v4, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    new-instance v5, Ljava/util/ArrayList;

    .line 57
    .line 58
    const/16 v6, 0xa

    .line 59
    .line 60
    invoke-static {v3, v6}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_7

    .line 76
    .line 77
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    check-cast v7, Lm61;

    .line 82
    .line 83
    iget-object v9, v2, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;->d:Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    :cond_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    if-eqz v10, :cond_3

    .line 94
    .line 95
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    move-object v11, v10

    .line 100
    check-cast v11, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;

    .line 101
    .line 102
    iget-object v11, v11, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;->b:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v12, v7, Lm61;->f:Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v11

    .line 110
    if-eqz v11, :cond_2

    .line 111
    .line 112
    move-object v8, v10

    .line 113
    goto :goto_2

    .line 114
    :cond_3
    const/4 v8, 0x0

    .line 115
    :goto_2
    check-cast v8, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;

    .line 116
    .line 117
    if-eqz v8, :cond_6

    .line 118
    .line 119
    iget-object v10, v7, Lm61;->a:Ljava/util/List;

    .line 120
    .line 121
    iget-object v11, v7, Lm61;->b:Lmu1;

    .line 122
    .line 123
    iget-object v12, v7, Lm61;->c:Ljava/util/List;

    .line 124
    .line 125
    iget-object v13, v7, Lm61;->d:Ljava/util/List;

    .line 126
    .line 127
    iget-object v14, v7, Lm61;->e:Ljava/lang/String;

    .line 128
    .line 129
    iget-object v15, v7, Lm61;->f:Ljava/lang/String;

    .line 130
    .line 131
    iget-object v9, v7, Lm61;->g:Ljava/util/List;

    .line 132
    .line 133
    iget-object v6, v7, Lm61;->h:Ljava/lang/String;

    .line 134
    .line 135
    move-object/from16 v36, v3

    .line 136
    .line 137
    iget-object v3, v7, Lm61;->i:Lhv1;

    .line 138
    .line 139
    move-object/from16 v18, v3

    .line 140
    .line 141
    iget-object v3, v7, Lm61;->j:Ljava/lang/String;

    .line 142
    .line 143
    move-object/from16 v19, v3

    .line 144
    .line 145
    iget-object v3, v7, Lm61;->k:Ljava/util/List;

    .line 146
    .line 147
    move-object/from16 v20, v3

    .line 148
    .line 149
    iget-object v3, v7, Lm61;->l:Law1;

    .line 150
    .line 151
    move-object/from16 v21, v3

    .line 152
    .line 153
    iget-object v3, v7, Lm61;->m:Ljava/lang/String;

    .line 154
    .line 155
    move-object/from16 v22, v3

    .line 156
    .line 157
    iget-object v3, v7, Lm61;->n:Ljava/lang/String;

    .line 158
    .line 159
    move-object/from16 v23, v3

    .line 160
    .line 161
    iget-object v3, v7, Lm61;->o:Ljava/lang/String;

    .line 162
    .line 163
    move-object/from16 v24, v3

    .line 164
    .line 165
    iget-boolean v3, v7, Lm61;->q:Z

    .line 166
    .line 167
    move/from16 v26, v3

    .line 168
    .line 169
    iget-object v3, v7, Lm61;->t:Ljava/util/List;

    .line 170
    .line 171
    move-object/from16 v29, v3

    .line 172
    .line 173
    iget-object v3, v8, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;->c:Ljava/lang/String;

    .line 174
    .line 175
    move-object/from16 v28, v3

    .line 176
    .line 177
    iget-object v3, v8, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;->a:Ljava/util/List;

    .line 178
    .line 179
    move-object/from16 v17, v6

    .line 180
    .line 181
    new-instance v6, Ljava/util/ArrayList;

    .line 182
    .line 183
    move-object/from16 v16, v9

    .line 184
    .line 185
    move-object/from16 v25, v10

    .line 186
    .line 187
    const/16 v9, 0xa

    .line 188
    .line 189
    invoke-static {v3, v9}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    invoke-direct {v6, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 194
    .line 195
    .line 196
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    if-eqz v9, :cond_4

    .line 205
    .line 206
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    check-cast v9, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;

    .line 211
    .line 212
    invoke-virtual {v9}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->a()Lj61;

    .line 213
    .line 214
    .line 215
    move-result-object v9

    .line 216
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_4
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->G(Ljava/util/List;)Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    new-instance v6, Li61;

    .line 225
    .line 226
    const/4 v9, 0x1

    .line 227
    invoke-direct {v6, v3, v9}, Li61;-><init>(Ljava/util/List;Z)V

    .line 228
    .line 229
    .line 230
    iget-object v3, v7, Lm61;->u:Ljava/lang/Long;

    .line 231
    .line 232
    iget-object v9, v7, Lm61;->v:Ljava/lang/Boolean;

    .line 233
    .line 234
    iget-object v10, v7, Lm61;->w:Ljava/lang/String;

    .line 235
    .line 236
    move-object/from16 v30, v3

    .line 237
    .line 238
    iget-object v3, v7, Lm61;->x:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;

    .line 239
    .line 240
    move-object/from16 v33, v3

    .line 241
    .line 242
    iget-boolean v3, v7, Lm61;->r:Z

    .line 243
    .line 244
    move/from16 v27, v3

    .line 245
    .line 246
    iget-boolean v3, v7, Lm61;->y:Z

    .line 247
    .line 248
    iget-object v7, v7, Lm61;->z:Ljava/lang/Boolean;

    .line 249
    .line 250
    move-object/from16 v31, v9

    .line 251
    .line 252
    new-instance v9, Lm61;

    .line 253
    .line 254
    move/from16 v34, v3

    .line 255
    .line 256
    move-object/from16 v35, v7

    .line 257
    .line 258
    move-object/from16 v32, v10

    .line 259
    .line 260
    move-object/from16 v10, v25

    .line 261
    .line 262
    move-object/from16 v25, v6

    .line 263
    .line 264
    invoke-direct/range {v9 .. v35}, Lm61;-><init>(Ljava/util/List;Lmu1;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lhv1;Ljava/lang/String;Ljava/util/List;Law1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Li61;ZZLjava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;ZLjava/lang/Boolean;)V

    .line 265
    .line 266
    .line 267
    iget-boolean v3, v8, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;->d:Z

    .line 268
    .line 269
    if-nez v3, :cond_5

    .line 270
    .line 271
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    :cond_5
    move-object v7, v9

    .line 275
    goto :goto_4

    .line 276
    :cond_6
    move-object/from16 v36, v3

    .line 277
    .line 278
    :goto_4
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-object/from16 v3, v36

    .line 282
    .line 283
    const/16 v6, 0xa

    .line 284
    .line 285
    goto/16 :goto_1

    .line 286
    .line 287
    :cond_7
    iget-object v3, v0, Lac2;->c:Lk61;

    .line 288
    .line 289
    iget-object v3, v3, Lk61;->b:Ljava/util/List;

    .line 290
    .line 291
    new-instance v6, Ljava/util/ArrayList;

    .line 292
    .line 293
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 294
    .line 295
    .line 296
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    :cond_8
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 301
    .line 302
    .line 303
    move-result v7

    .line 304
    if-eqz v7, :cond_9

    .line 305
    .line 306
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v7

    .line 310
    move-object v9, v7

    .line 311
    check-cast v9, Lm61;

    .line 312
    .line 313
    iget-boolean v9, v9, Lm61;->q:Z

    .line 314
    .line 315
    if-nez v9, :cond_8

    .line 316
    .line 317
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    goto :goto_5

    .line 321
    :cond_9
    invoke-static {v6, v1}, Lhu0;->D0(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    new-instance v3, Ljava/util/ArrayList;

    .line 326
    .line 327
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 328
    .line 329
    .line 330
    new-instance v6, Ljava/util/ArrayList;

    .line 331
    .line 332
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 333
    .line 334
    .line 335
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 340
    .line 341
    .line 342
    move-result v7

    .line 343
    if-eqz v7, :cond_e

    .line 344
    .line 345
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v7

    .line 349
    check-cast v7, Lm61;

    .line 350
    .line 351
    iget-object v9, v2, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;->d:Ljava/util/List;

    .line 352
    .line 353
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 354
    .line 355
    .line 356
    move-result-object v9

    .line 357
    :cond_a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 358
    .line 359
    .line 360
    move-result v10

    .line 361
    if-eqz v10, :cond_b

    .line 362
    .line 363
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v10

    .line 367
    move-object v11, v10

    .line 368
    check-cast v11, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;

    .line 369
    .line 370
    iget-object v11, v11, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;->b:Ljava/lang/String;

    .line 371
    .line 372
    iget-object v12, v7, Lm61;->f:Ljava/lang/String;

    .line 373
    .line 374
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v11

    .line 378
    if-eqz v11, :cond_a

    .line 379
    .line 380
    goto :goto_7

    .line 381
    :cond_b
    const/4 v10, 0x0

    .line 382
    :goto_7
    check-cast v10, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;

    .line 383
    .line 384
    if-nez v10, :cond_c

    .line 385
    .line 386
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-object/from16 v38, v1

    .line 390
    .line 391
    goto/16 :goto_9

    .line 392
    .line 393
    :cond_c
    iget-object v12, v7, Lm61;->a:Ljava/util/List;

    .line 394
    .line 395
    iget-object v13, v7, Lm61;->b:Lmu1;

    .line 396
    .line 397
    iget-object v14, v7, Lm61;->c:Ljava/util/List;

    .line 398
    .line 399
    iget-object v15, v7, Lm61;->d:Ljava/util/List;

    .line 400
    .line 401
    iget-object v9, v7, Lm61;->e:Ljava/lang/String;

    .line 402
    .line 403
    iget-object v11, v7, Lm61;->f:Ljava/lang/String;

    .line 404
    .line 405
    iget-object v8, v7, Lm61;->g:Ljava/util/List;

    .line 406
    .line 407
    move-object/from16 v38, v1

    .line 408
    .line 409
    iget-object v1, v7, Lm61;->h:Ljava/lang/String;

    .line 410
    .line 411
    move-object/from16 v19, v1

    .line 412
    .line 413
    iget-object v1, v7, Lm61;->i:Lhv1;

    .line 414
    .line 415
    move-object/from16 v20, v1

    .line 416
    .line 417
    iget-object v1, v7, Lm61;->j:Ljava/lang/String;

    .line 418
    .line 419
    move-object/from16 v21, v1

    .line 420
    .line 421
    iget-object v1, v7, Lm61;->k:Ljava/util/List;

    .line 422
    .line 423
    move-object/from16 v22, v1

    .line 424
    .line 425
    iget-object v1, v7, Lm61;->l:Law1;

    .line 426
    .line 427
    move-object/from16 v23, v1

    .line 428
    .line 429
    iget-object v1, v7, Lm61;->m:Ljava/lang/String;

    .line 430
    .line 431
    move-object/from16 v24, v1

    .line 432
    .line 433
    iget-object v1, v7, Lm61;->n:Ljava/lang/String;

    .line 434
    .line 435
    move-object/from16 v25, v1

    .line 436
    .line 437
    iget-object v1, v7, Lm61;->o:Ljava/lang/String;

    .line 438
    .line 439
    move-object/from16 v26, v1

    .line 440
    .line 441
    iget-boolean v1, v7, Lm61;->q:Z

    .line 442
    .line 443
    move/from16 v28, v1

    .line 444
    .line 445
    iget-object v1, v7, Lm61;->t:Ljava/util/List;

    .line 446
    .line 447
    move-object/from16 v31, v1

    .line 448
    .line 449
    iget-object v1, v10, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;->c:Ljava/lang/String;

    .line 450
    .line 451
    move-object/from16 v30, v1

    .line 452
    .line 453
    iget-object v1, v10, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;->a:Ljava/util/List;

    .line 454
    .line 455
    move-object/from16 v18, v8

    .line 456
    .line 457
    new-instance v8, Ljava/util/ArrayList;

    .line 458
    .line 459
    move-object/from16 v16, v9

    .line 460
    .line 461
    move-object/from16 v17, v11

    .line 462
    .line 463
    const/16 v9, 0xa

    .line 464
    .line 465
    invoke-static {v1, v9}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 466
    .line 467
    .line 468
    move-result v11

    .line 469
    invoke-direct {v8, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 470
    .line 471
    .line 472
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 477
    .line 478
    .line 479
    move-result v11

    .line 480
    if-eqz v11, :cond_d

    .line 481
    .line 482
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v11

    .line 486
    check-cast v11, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;

    .line 487
    .line 488
    invoke-virtual {v11}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->a()Lj61;

    .line 489
    .line 490
    .line 491
    move-result-object v11

    .line 492
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    goto :goto_8

    .line 496
    :cond_d
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->G(Ljava/util/List;)Ljava/util/List;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    iget-boolean v8, v10, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;->d:Z

    .line 501
    .line 502
    new-instance v10, Li61;

    .line 503
    .line 504
    invoke-direct {v10, v1, v8}, Li61;-><init>(Ljava/util/List;Z)V

    .line 505
    .line 506
    .line 507
    iget-object v1, v7, Lm61;->u:Ljava/lang/Long;

    .line 508
    .line 509
    iget-object v8, v7, Lm61;->v:Ljava/lang/Boolean;

    .line 510
    .line 511
    iget-object v11, v7, Lm61;->w:Ljava/lang/String;

    .line 512
    .line 513
    iget-object v9, v7, Lm61;->x:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;

    .line 514
    .line 515
    move-object/from16 v32, v1

    .line 516
    .line 517
    iget-boolean v1, v7, Lm61;->r:Z

    .line 518
    .line 519
    move/from16 v29, v1

    .line 520
    .line 521
    iget-boolean v1, v7, Lm61;->y:Z

    .line 522
    .line 523
    iget-object v7, v7, Lm61;->z:Ljava/lang/Boolean;

    .line 524
    .line 525
    move-object/from16 v34, v11

    .line 526
    .line 527
    new-instance v11, Lm61;

    .line 528
    .line 529
    move/from16 v36, v1

    .line 530
    .line 531
    move-object/from16 v37, v7

    .line 532
    .line 533
    move-object/from16 v33, v8

    .line 534
    .line 535
    move-object/from16 v35, v9

    .line 536
    .line 537
    move-object/from16 v27, v10

    .line 538
    .line 539
    invoke-direct/range {v11 .. v37}, Lm61;-><init>(Ljava/util/List;Lmu1;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lhv1;Ljava/lang/String;Ljava/util/List;Law1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Li61;ZZLjava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureObject;ZLjava/lang/Boolean;)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    :goto_9
    move-object/from16 v1, v38

    .line 546
    .line 547
    goto/16 :goto_6

    .line 548
    .line 549
    :cond_e
    new-instance v1, Ljava/util/ArrayList;

    .line 550
    .line 551
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 555
    .line 556
    .line 557
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 558
    .line 559
    .line 560
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 561
    .line 562
    .line 563
    iget-object v0, v0, Lac2;->c:Lk61;

    .line 564
    .line 565
    iget-object v2, v2, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;->a:Ljava/lang/String;

    .line 566
    .line 567
    invoke-static {v2}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 568
    .line 569
    .line 570
    move-result v3

    .line 571
    if-eqz v3, :cond_f

    .line 572
    .line 573
    iget-object v2, v0, Lk61;->e:Ljava/lang/String;

    .line 574
    .line 575
    :cond_f
    const/16 v3, 0x3fef

    .line 576
    .line 577
    const/4 v5, 0x0

    .line 578
    invoke-static {v0, v5, v2, v3}, Lk61;->a(Lk61;Ljava/util/List;Ljava/lang/String;I)Lk61;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    new-instance v2, Ljh1;

    .line 583
    .line 584
    invoke-direct {v2, v1, v0, v4, v6}, Ljh1;-><init>(Ljava/util/ArrayList;Lk61;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 585
    .line 586
    .line 587
    return-object v2
.end method

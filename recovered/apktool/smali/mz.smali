.class public final Lmz;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljz;


# instance fields
.field public final a:Lx80;

.field public final b:Li03;

.field public final c:Lm62;

.field public final d:Lg80;

.field public final e:Lpc2;

.field public final f:Lac2;


# direct methods
.method public constructor <init>(Lx80;Li03;Lxq0;Lm62;Lg80;Lpc2;Lac2;)V
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
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lmz;->a:Lx80;

    .line 20
    .line 21
    iput-object p2, p0, Lmz;->b:Li03;

    .line 22
    .line 23
    iput-object p4, p0, Lmz;->c:Lm62;

    .line 24
    .line 25
    iput-object p5, p0, Lmz;->d:Lg80;

    .line 26
    .line 27
    iput-object p6, p0, Lmz;->e:Lpc2;

    .line 28
    .line 29
    iput-object p7, p0, Lmz;->f:Lac2;

    .line 30
    .line 31
    return-void
.end method

.method public static final a(Lmz;Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lmz;->c:Lm62;

    .line 6
    .line 7
    invoke-virtual {v0}, Lmz;->b()Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iget-boolean v3, v3, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->y:Z

    .line 12
    .line 13
    invoke-virtual {v0}, Lmz;->b()Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    iget-boolean v4, v4, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->z:Z

    .line 18
    .line 19
    invoke-virtual {v0}, Lmz;->b()Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    iget-boolean v5, v5, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->F:Z

    .line 24
    .line 25
    new-instance v6, Llz;

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    invoke-direct {v6, v7, v0, v1}, Llz;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v7, Loc;

    .line 32
    .line 33
    const/4 v8, 0x1

    .line 34
    invoke-direct {v7, v8, v0, v1}, Loc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v0, v2, Lm62;->a:Lxu0;

    .line 41
    .line 42
    iget-object v9, v2, Lm62;->b:Lhb1;

    .line 43
    .line 44
    iget-object v10, v9, Lhb1;->b:Lcom/usercentrics/sdk/UsercentricsDomains;

    .line 45
    .line 46
    invoke-virtual {v10}, Lcom/usercentrics/sdk/UsercentricsDomains;->a()Z

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    if-eqz v11, :cond_0

    .line 51
    .line 52
    iget-object v8, v10, Lcom/usercentrics/sdk/UsercentricsDomains;->d:Ljava/lang/String;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget-object v9, v9, Lhb1;->a:Lbn1;

    .line 56
    .line 57
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-eqz v9, :cond_2

    .line 62
    .line 63
    if-ne v9, v8, :cond_1

    .line 64
    .line 65
    const-string v8, "https://consent-api.service.consent.eu1.usercentrics.eu"

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-static {}, Lds0;->b()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_2
    const-string v8, "https://consent-api.service.consent.usercentrics.eu"

    .line 73
    .line 74
    :goto_0
    const-string v9, "/consent/ua/3"

    .line 75
    .line 76
    invoke-static {v8, v9}, Lfm0;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v20

    .line 80
    iget-object v2, v2, Lm62;->d:Lhk2;

    .line 81
    .line 82
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Le13;

    .line 87
    .line 88
    iget-object v8, v1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->b:Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;

    .line 89
    .line 90
    iget-object v9, v1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->a:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;

    .line 91
    .line 92
    const-string v10, ""

    .line 93
    .line 94
    if-eqz v8, :cond_3

    .line 95
    .line 96
    iget-object v11, v8, Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;->a:Ljava/lang/String;

    .line 97
    .line 98
    if-nez v11, :cond_4

    .line 99
    .line 100
    :cond_3
    move-object v11, v10

    .line 101
    :cond_4
    sget-object v12, Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObjectDto;->Companion:Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObjectDto$Companion;

    .line 102
    .line 103
    iget-wide v13, v9, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;->e:J

    .line 104
    .line 105
    const-wide/16 v15, 0x3e8

    .line 106
    .line 107
    mul-long/2addr v13, v15

    .line 108
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    if-nez v8, :cond_5

    .line 112
    .line 113
    const/4 v8, 0x0

    .line 114
    move/from16 v17, v3

    .line 115
    .line 116
    move/from16 v18, v4

    .line 117
    .line 118
    move/from16 v19, v5

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    iget-object v8, v8, Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObject;->b:Ljava/util/Map;

    .line 122
    .line 123
    new-instance v12, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-interface {v8}, Ljava/util/Map;->size()I

    .line 126
    .line 127
    .line 128
    move-result v15

    .line 129
    invoke-direct {v12, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v8}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v15

    .line 144
    if-eqz v15, :cond_6

    .line 145
    .line 146
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v15

    .line 150
    check-cast v15, Ljava/util/Map$Entry;

    .line 151
    .line 152
    move/from16 v17, v3

    .line 153
    .line 154
    invoke-interface {v15}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-interface {v15}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v16

    .line 162
    move/from16 v18, v4

    .line 163
    .line 164
    move-object/from16 v4, v16

    .line 165
    .line 166
    check-cast v4, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageVendor;

    .line 167
    .line 168
    iget-object v4, v4, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageVendor;->a:Ljava/util/List;

    .line 169
    .line 170
    invoke-interface {v15}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v16

    .line 174
    move/from16 v19, v5

    .line 175
    .line 176
    move-object/from16 v5, v16

    .line 177
    .line 178
    check-cast v5, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageVendor;

    .line 179
    .line 180
    iget-object v5, v5, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageVendor;->b:Ljava/util/List;

    .line 181
    .line 182
    invoke-interface {v15}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v15

    .line 186
    check-cast v15, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageVendor;

    .line 187
    .line 188
    iget-object v15, v15, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageVendor;->c:Ljava/util/List;

    .line 189
    .line 190
    filled-new-array {v3, v4, v5, v15}, [Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-static {v3}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move/from16 v3, v17

    .line 202
    .line 203
    move/from16 v4, v18

    .line 204
    .line 205
    move/from16 v5, v19

    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_6
    move/from16 v17, v3

    .line 209
    .line 210
    move/from16 v18, v4

    .line 211
    .line 212
    move/from16 v19, v5

    .line 213
    .line 214
    new-instance v8, Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObjectDto;

    .line 215
    .line 216
    invoke-direct {v8, v13, v14, v12}, Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObjectDto;-><init>(JLjava/util/ArrayList;)V

    .line 217
    .line 218
    .line 219
    :goto_2
    if-nez v8, :cond_7

    .line 220
    .line 221
    move-object v12, v10

    .line 222
    goto :goto_3

    .line 223
    :cond_7
    sget-object v3, Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObjectDto;->Companion:Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObjectDto$Companion;

    .line 224
    .line 225
    invoke-virtual {v3}, Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObjectDto$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    sget-object v4, Lb21;->a:Lr11;

    .line 230
    .line 231
    invoke-virtual {v4, v3, v8}, Lb11;->b(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    move-object v12, v3

    .line 236
    :goto_3
    iget-object v3, v9, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;->b:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectConsent;

    .line 237
    .line 238
    iget-object v3, v3, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectConsent;->a:Lkz2;

    .line 239
    .line 240
    iget-object v5, v3, Lkz2;->a:Ljava/lang/String;

    .line 241
    .line 242
    move-object v3, v6

    .line 243
    iget-object v6, v2, Le13;->e:Ljava/lang/String;

    .line 244
    .line 245
    iget-object v4, v9, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;->c:Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectSettings;

    .line 246
    .line 247
    move-object v8, v7

    .line 248
    iget-object v7, v4, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectSettings;->b:Ljava/lang/String;

    .line 249
    .line 250
    move-object v13, v8

    .line 251
    iget-object v8, v4, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectSettings;->c:Ljava/lang/String;

    .line 252
    .line 253
    iget-object v14, v4, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectSettings;->a:Ljava/lang/String;

    .line 254
    .line 255
    iget-object v4, v4, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectSettings;->d:Ljava/lang/String;

    .line 256
    .line 257
    iget-object v9, v9, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;->d:Ljava/util/List;

    .line 258
    .line 259
    move-object v15, v13

    .line 260
    new-instance v13, Ljava/util/ArrayList;

    .line 261
    .line 262
    move-object/from16 p0, v3

    .line 263
    .line 264
    const/16 v3, 0xa

    .line 265
    .line 266
    move-object/from16 v16, v4

    .line 267
    .line 268
    invoke-static {v9, v3}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    invoke-direct {v13, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 273
    .line 274
    .line 275
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 280
    .line 281
    .line 282
    move-result v9

    .line 283
    if-eqz v9, :cond_8

    .line 284
    .line 285
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v9

    .line 289
    check-cast v9, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectService;

    .line 290
    .line 291
    new-instance v3, Lcom/usercentrics/sdk/v2/consent/data/ConsentStatusDto;

    .line 292
    .line 293
    move-object/from16 v21, v4

    .line 294
    .line 295
    iget-boolean v4, v9, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectService;->c:Z

    .line 296
    .line 297
    move-object/from16 v22, v5

    .line 298
    .line 299
    iget-object v5, v9, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectService;->a:Ljava/lang/String;

    .line 300
    .line 301
    iget-object v9, v9, Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectService;->d:Ljava/lang/String;

    .line 302
    .line 303
    invoke-direct {v3, v5, v9, v4}, Lcom/usercentrics/sdk/v2/consent/data/ConsentStatusDto;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-object/from16 v4, v21

    .line 310
    .line 311
    move-object/from16 v5, v22

    .line 312
    .line 313
    const/16 v3, 0xa

    .line 314
    .line 315
    goto :goto_4

    .line 316
    :cond_8
    move-object/from16 v22, v5

    .line 317
    .line 318
    iget-object v3, v2, Le13;->c:Ljava/lang/String;

    .line 319
    .line 320
    iget-object v2, v2, Le13;->a:Ljava/lang/String;

    .line 321
    .line 322
    iget-object v1, v1, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;->c:Ljava/lang/String;

    .line 323
    .line 324
    if-nez v1, :cond_9

    .line 325
    .line 326
    goto :goto_5

    .line 327
    :cond_9
    move-object v10, v1

    .line 328
    :goto_5
    new-instance v4, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;

    .line 329
    .line 330
    move/from16 v1, v18

    .line 331
    .line 332
    move-object/from16 v18, v10

    .line 333
    .line 334
    move-object/from16 v10, v16

    .line 335
    .line 336
    move/from16 v16, v1

    .line 337
    .line 338
    move-object v9, v14

    .line 339
    move-object v1, v15

    .line 340
    move-object/from16 v5, v22

    .line 341
    .line 342
    move-object v15, v2

    .line 343
    move-object v14, v3

    .line 344
    move-object/from16 v3, p0

    .line 345
    .line 346
    invoke-direct/range {v4 .. v19}, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 347
    .line 348
    .line 349
    sget-object v2, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;->Companion:Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto$Companion;

    .line 350
    .line 351
    invoke-virtual {v2}, Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    sget-object v5, Lb21;->a:Lr11;

    .line 356
    .line 357
    invoke-virtual {v5, v2, v4}, Lb11;->b(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v12

    .line 361
    new-instance v2, Lkotlin/Pair;

    .line 362
    .line 363
    const-string v4, "Accept"

    .line 364
    .line 365
    const-string v5, "application/json"

    .line 366
    .line 367
    invoke-direct {v2, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    new-instance v4, Lkotlin/Pair;

    .line 371
    .line 372
    const-string v5, "Access-Control-Allow-Origin"

    .line 373
    .line 374
    const-string v6, "*"

    .line 375
    .line 376
    invoke-direct {v4, v5, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 380
    .line 381
    .line 382
    move-result-object v5

    .line 383
    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v5

    .line 387
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    new-instance v6, Lkotlin/Pair;

    .line 391
    .line 392
    const-string v7, "X-Request-ID"

    .line 393
    .line 394
    invoke-direct {v6, v7, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    filled-new-array {v2, v4, v6}, [Lkotlin/Pair;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    invoke-static {v2}, Loc1;->e([Lkotlin/Pair;)Ljava/util/Map;

    .line 402
    .line 403
    .line 404
    move-result-object v13

    .line 405
    new-instance v2, Lo;

    .line 406
    .line 407
    const/16 v4, 0xf

    .line 408
    .line 409
    invoke-direct {v2, v3, v4}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    iget-object v3, v0, Lxu0;->c:Lx80;

    .line 416
    .line 417
    new-instance v9, Lv7;

    .line 418
    .line 419
    const/4 v14, 0x0

    .line 420
    move-object v10, v0

    .line 421
    move-object/from16 v11, v20

    .line 422
    .line 423
    invoke-direct/range {v9 .. v14}, Lv7;-><init>(Lxu0;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lc10;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v3, v9}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    new-instance v3, Lo;

    .line 431
    .line 432
    const/16 v4, 0x9

    .line 433
    .line 434
    invoke-direct {v3, v2, v4}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0, v3}, Lec;->H(Lkotlin/jvm/functions/Function1;)V

    .line 438
    .line 439
    .line 440
    new-instance v2, Lo;

    .line 441
    .line 442
    const/16 v3, 0xa

    .line 443
    .line 444
    invoke-direct {v2, v1, v3}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v0, v2}, Lec;->G(Lkotlin/jvm/functions/Function1;)V

    .line 448
    .line 449
    .line 450
    return-void
.end method


# virtual methods
.method public final b()Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;
    .locals 0

    .line 1
    iget-object p0, p0, Lmz;->e:Lpc2;

    .line 2
    .line 3
    iget-object p0, p0, Lpc2;->d:Lkn1;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lkn1;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "Consents Service requires a valid Settings state"

    .line 13
    .line 14
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.class public final Lcom/quago/mobile/sdk/b1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final b:[Ljava/lang/String;


# instance fields
.field public a:Ljava/lang/StringBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    new-array v0, v0, [Ljava/lang/String;

    .line 4
    .line 5
    sput-object v0, Lcom/quago/mobile/sdk/b1;->b:[Ljava/lang/String;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    const/16 v1, 0x1f

    .line 9
    .line 10
    if-gt v0, v1, :cond_0

    .line 11
    .line 12
    sget-object v1, Lcom/quago/mobile/sdk/b1;->b:[Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "\\u%04x"

    .line 23
    .line 24
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object v0, Lcom/quago/mobile/sdk/b1;->b:[Ljava/lang/String;

    .line 34
    .line 35
    const/16 v1, 0x22

    .line 36
    .line 37
    const-string v2, "\\\""

    .line 38
    .line 39
    aput-object v2, v0, v1

    .line 40
    .line 41
    const/16 v1, 0x5c

    .line 42
    .line 43
    const-string v2, "\\\\"

    .line 44
    .line 45
    aput-object v2, v0, v1

    .line 46
    .line 47
    const/16 v1, 0x9

    .line 48
    .line 49
    const-string v2, "\\t"

    .line 50
    .line 51
    aput-object v2, v0, v1

    .line 52
    .line 53
    const/16 v1, 0x8

    .line 54
    .line 55
    const-string v2, "\\b"

    .line 56
    .line 57
    aput-object v2, v0, v1

    .line 58
    .line 59
    const/16 v1, 0xa

    .line 60
    .line 61
    const-string v2, "\\n"

    .line 62
    .line 63
    aput-object v2, v0, v1

    .line 64
    .line 65
    const/16 v1, 0xd

    .line 66
    .line 67
    const-string v2, "\\r"

    .line 68
    .line 69
    aput-object v2, v0, v1

    .line 70
    .line 71
    const/16 v1, 0xc

    .line 72
    .line 73
    const-string v2, "\\f"

    .line 74
    .line 75
    aput-object v2, v0, v1

    .line 76
    .line 77
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 14

    .line 1
    const-string v0, "null"

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    instance-of v1, p1, Ljava/lang/Float;

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    check-cast p1, Ljava/lang/Float;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object p0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    instance-of v1, p1, Ljava/lang/Integer;

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    iget-object p0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 42
    .line 43
    check-cast p1, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_3
    instance-of v1, p1, Ljava/lang/Long;

    .line 54
    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    iget-object p0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 58
    .line 59
    check-cast p1, Ljava/lang/Long;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_4
    instance-of v1, p1, Ljava/lang/CharSequence;

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    const/16 v3, 0x22

    .line 73
    .line 74
    if-eqz v1, :cond_7

    .line 75
    .line 76
    check-cast p1, Ljava/lang/CharSequence;

    .line 77
    .line 78
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v1, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    :goto_0
    if-ge v2, v0, :cond_6

    .line 88
    .line 89
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    sget-object v4, Lcom/quago/mobile/sdk/b1;->b:[Ljava/lang/String;

    .line 94
    .line 95
    const/16 v5, 0x80

    .line 96
    .line 97
    if-ge v1, v5, :cond_5

    .line 98
    .line 99
    aget-object v4, v4, v1

    .line 100
    .line 101
    if-eqz v4, :cond_5

    .line 102
    .line 103
    iget-object v1, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_5
    iget-object v4, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_6
    iget-object p0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_7
    instance-of v1, p1, Ljava/lang/Boolean;

    .line 124
    .line 125
    if-eqz v1, :cond_8

    .line 126
    .line 127
    iget-object p0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 128
    .line 129
    check-cast p1, Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_8
    instance-of v1, p1, Ljava/lang/Double;

    .line 140
    .line 141
    if-eqz v1, :cond_a

    .line 142
    .line 143
    check-cast p1, Ljava/lang/Double;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 146
    .line 147
    .line 148
    move-result-wide v1

    .line 149
    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    iget-object p0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 154
    .line 155
    if-eqz p1, :cond_9

    .line 156
    .line 157
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_9
    invoke-virtual {p0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_a
    instance-of v0, p1, Ljava/lang/Short;

    .line 166
    .line 167
    if-eqz v0, :cond_b

    .line 168
    .line 169
    iget-object p0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 170
    .line 171
    check-cast p1, Ljava/lang/Short;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Short;->shortValue()S

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :cond_b
    instance-of v0, p1, Ljava/lang/Character;

    .line 182
    .line 183
    if-eqz v0, :cond_c

    .line 184
    .line 185
    iget-object v0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    iget-object v0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 191
    .line 192
    check-cast p1, Ljava/lang/Character;

    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    iget-object p0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 202
    .line 203
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :cond_c
    instance-of v0, p1, Ljava/lang/Byte;

    .line 208
    .line 209
    if-eqz v0, :cond_d

    .line 210
    .line 211
    iget-object p0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 212
    .line 213
    check-cast p1, Ljava/lang/Byte;

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    const/16 v1, 0x5d

    .line 232
    .line 233
    const/16 v4, 0x5b

    .line 234
    .line 235
    const/16 v5, 0x2c

    .line 236
    .line 237
    const/4 v6, 0x1

    .line 238
    if-eqz v0, :cond_f

    .line 239
    .line 240
    iget-object v0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 241
    .line 242
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    check-cast p1, [Ljava/lang/Object;

    .line 246
    .line 247
    array-length v0, p1

    .line 248
    if-lez v0, :cond_e

    .line 249
    .line 250
    aget-object v0, p1, v2

    .line 251
    .line 252
    invoke-virtual {p0, v0}, Lcom/quago/mobile/sdk/b1;->a(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    :goto_2
    array-length v0, p1

    .line 256
    if-ge v6, v0, :cond_e

    .line 257
    .line 258
    iget-object v0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 259
    .line 260
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    aget-object v0, p1, v6

    .line 264
    .line 265
    invoke-virtual {p0, v0}, Lcom/quago/mobile/sdk/b1;->a(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    add-int/lit8 v6, v6, 0x1

    .line 269
    .line 270
    goto :goto_2

    .line 271
    :cond_e
    iget-object p0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 272
    .line 273
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :cond_f
    instance-of v0, p1, Ljava/lang/Enum;

    .line 278
    .line 279
    if-eqz v0, :cond_10

    .line 280
    .line 281
    iget-object v0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    iget-object v0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 287
    .line 288
    check-cast p1, Ljava/lang/Enum;

    .line 289
    .line 290
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    iget-object p0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 298
    .line 299
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    return-void

    .line 303
    :cond_10
    instance-of v0, p1, Ljava/util/Map;

    .line 304
    .line 305
    const/16 v7, 0x7d

    .line 306
    .line 307
    const/16 v8, 0x3a

    .line 308
    .line 309
    const/16 v9, 0x7b

    .line 310
    .line 311
    if-eqz v0, :cond_1c

    .line 312
    .line 313
    iget-object v0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 314
    .line 315
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    check-cast p1, Ljava/util/Map;

    .line 319
    .line 320
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-eqz v0, :cond_1b

    .line 333
    .line 334
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    if-nez v2, :cond_11

    .line 339
    .line 340
    move v2, v6

    .line 341
    goto :goto_4

    .line 342
    :cond_11
    iget-object v1, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 343
    .line 344
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    :goto_4
    check-cast v0, Ljava/util/Map$Entry;

    .line 348
    .line 349
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    iget-object v4, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 354
    .line 355
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    instance-of v4, v1, Ljava/lang/Integer;

    .line 359
    .line 360
    if-eqz v4, :cond_12

    .line 361
    .line 362
    iget-object v4, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 363
    .line 364
    check-cast v1, Ljava/lang/Integer;

    .line 365
    .line 366
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    goto/16 :goto_5

    .line 374
    .line 375
    :cond_12
    instance-of v4, v1, Ljava/lang/Float;

    .line 376
    .line 377
    if-eqz v4, :cond_13

    .line 378
    .line 379
    iget-object v4, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 380
    .line 381
    check-cast v1, Ljava/lang/Float;

    .line 382
    .line 383
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    goto/16 :goto_5

    .line 391
    .line 392
    :cond_13
    instance-of v4, v1, Ljava/lang/Long;

    .line 393
    .line 394
    if-eqz v4, :cond_14

    .line 395
    .line 396
    iget-object v4, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 397
    .line 398
    check-cast v1, Ljava/lang/Long;

    .line 399
    .line 400
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 401
    .line 402
    .line 403
    move-result-wide v9

    .line 404
    invoke-virtual {v4, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    goto :goto_5

    .line 408
    :cond_14
    instance-of v4, v1, Ljava/lang/String;

    .line 409
    .line 410
    if-eqz v4, :cond_15

    .line 411
    .line 412
    iget-object v4, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 413
    .line 414
    check-cast v1, Ljava/lang/String;

    .line 415
    .line 416
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    goto :goto_5

    .line 420
    :cond_15
    instance-of v4, v1, Ljava/lang/Boolean;

    .line 421
    .line 422
    if-eqz v4, :cond_16

    .line 423
    .line 424
    iget-object v4, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 425
    .line 426
    check-cast v1, Ljava/lang/Boolean;

    .line 427
    .line 428
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 429
    .line 430
    .line 431
    move-result v1

    .line 432
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    goto :goto_5

    .line 436
    :cond_16
    instance-of v4, v1, Ljava/lang/Double;

    .line 437
    .line 438
    if-eqz v4, :cond_17

    .line 439
    .line 440
    iget-object v4, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 441
    .line 442
    check-cast v1, Ljava/lang/Double;

    .line 443
    .line 444
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 445
    .line 446
    .line 447
    move-result-wide v9

    .line 448
    invoke-virtual {v4, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    goto :goto_5

    .line 452
    :cond_17
    instance-of v4, v1, Ljava/lang/Short;

    .line 453
    .line 454
    if-eqz v4, :cond_18

    .line 455
    .line 456
    iget-object v4, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 457
    .line 458
    check-cast v1, Ljava/lang/Short;

    .line 459
    .line 460
    invoke-virtual {v1}, Ljava/lang/Short;->shortValue()S

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    goto :goto_5

    .line 468
    :cond_18
    instance-of v4, v1, Ljava/lang/Character;

    .line 469
    .line 470
    if-eqz v4, :cond_19

    .line 471
    .line 472
    iget-object v4, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 473
    .line 474
    check-cast v1, Ljava/lang/Character;

    .line 475
    .line 476
    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    .line 477
    .line 478
    .line 479
    move-result v1

    .line 480
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    goto :goto_5

    .line 484
    :cond_19
    instance-of v4, v1, Ljava/lang/Byte;

    .line 485
    .line 486
    if-eqz v4, :cond_1a

    .line 487
    .line 488
    iget-object v4, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 489
    .line 490
    check-cast v1, Ljava/lang/Byte;

    .line 491
    .line 492
    invoke-virtual {v1}, Ljava/lang/Byte;->byteValue()B

    .line 493
    .line 494
    .line 495
    move-result v1

    .line 496
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    goto :goto_5

    .line 500
    :cond_1a
    invoke-virtual {p0, v1}, Lcom/quago/mobile/sdk/b1;->a(Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    :goto_5
    iget-object v1, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 504
    .line 505
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    iget-object v1, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 509
    .line 510
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    invoke-virtual {p0, v0}, Lcom/quago/mobile/sdk/b1;->a(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    goto/16 :goto_3

    .line 521
    .line 522
    :cond_1b
    iget-object p0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 523
    .line 524
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    return-void

    .line 528
    :cond_1c
    instance-of v0, p1, Ljava/lang/Iterable;

    .line 529
    .line 530
    iget-object v10, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 531
    .line 532
    if-eqz v0, :cond_1f

    .line 533
    .line 534
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    check-cast p1, Ljava/lang/Iterable;

    .line 538
    .line 539
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 540
    .line 541
    .line 542
    move-result-object p1

    .line 543
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    if-eqz v0, :cond_1e

    .line 548
    .line 549
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    if-nez v2, :cond_1d

    .line 554
    .line 555
    move v2, v6

    .line 556
    goto :goto_7

    .line 557
    :cond_1d
    iget-object v3, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 558
    .line 559
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 560
    .line 561
    .line 562
    :goto_7
    invoke-virtual {p0, v0}, Lcom/quago/mobile/sdk/b1;->a(Ljava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    goto :goto_6

    .line 566
    :cond_1e
    iget-object p0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 567
    .line 568
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    return-void

    .line 572
    :cond_1f
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    move v1, v2

    .line 580
    :cond_20
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 581
    .line 582
    .line 583
    move-result-object v4

    .line 584
    array-length v9, v4

    .line 585
    move v10, v2

    .line 586
    :goto_8
    if-ge v10, v9, :cond_24

    .line 587
    .line 588
    aget-object v11, v4, v10

    .line 589
    .line 590
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 591
    .line 592
    .line 593
    move-result v12

    .line 594
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->isSynthetic()Z

    .line 595
    .line 596
    .line 597
    move-result v13

    .line 598
    if-nez v13, :cond_23

    .line 599
    .line 600
    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 601
    .line 602
    .line 603
    move-result v13

    .line 604
    if-nez v13, :cond_23

    .line 605
    .line 606
    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    .line 607
    .line 608
    .line 609
    move-result v12

    .line 610
    if-eqz v12, :cond_21

    .line 611
    .line 612
    goto :goto_a

    .line 613
    :cond_21
    if-nez v1, :cond_22

    .line 614
    .line 615
    move v1, v6

    .line 616
    goto :goto_9

    .line 617
    :cond_22
    iget-object v12, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 618
    .line 619
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 620
    .line 621
    .line 622
    :goto_9
    iget-object v12, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 623
    .line 624
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 625
    .line 626
    .line 627
    iget-object v12, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 628
    .line 629
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v13

    .line 633
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 634
    .line 635
    .line 636
    iget-object v12, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 637
    .line 638
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 639
    .line 640
    .line 641
    iget-object v12, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 642
    .line 643
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v11, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v11, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v11

    .line 653
    invoke-virtual {p0, v11}, Lcom/quago/mobile/sdk/b1;->a(Ljava/lang/Object;)V

    .line 654
    .line 655
    .line 656
    :cond_23
    :goto_a
    add-int/lit8 v10, v10, 0x1

    .line 657
    .line 658
    goto :goto_8

    .line 659
    :cond_24
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    if-nez v0, :cond_20

    .line 664
    .line 665
    iget-object p0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 666
    .line 667
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 668
    .line 669
    .line 670
    return-void
.end method

.method public final declared-synchronized b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/quago/mobile/sdk/b1;->c(Ljava/lang/Object;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit p0

    .line 7
    return-object p1

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    throw p1
.end method

.method public final declared-synchronized c(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    :try_start_0
    const-string p1, "null"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object p1

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    goto :goto_2

    .line 10
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const v1, 0x30d40

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception p1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lcom/quago/mobile/sdk/b1;->a(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object v0, p0, Lcom/quago/mobile/sdk/b1;->a:Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    .line 42
    monitor-exit p0

    .line 43
    return-object p1

    .line 44
    :goto_1
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 45
    .line 46
    .line 47
    monitor-exit p0

    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 51
    throw p1
.end method

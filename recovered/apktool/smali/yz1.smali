.class public final Lyz1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public static a(Lxz1;)Ljava/lang/String;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Lvy0;->Companion:Luy0;

    .line 7
    .line 8
    new-instance v2, Luh2;

    .line 9
    .line 10
    iget-object v3, v0, Lxz1;->b:Ljava/util/Map;

    .line 11
    .line 12
    invoke-interface {v3}, Ljava/util/Map;->size()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    invoke-direct {v2, v4}, Luh2;-><init>(I)V

    .line 17
    .line 18
    .line 19
    sget-object v4, Lrj;->Companion:Lqj;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const/16 v1, 0xc

    .line 25
    .line 26
    invoke-static {v2, v1}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget-object v4, v0, Lxz1;->d:Lwp0;

    .line 31
    .line 32
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-nez v5, :cond_a

    .line 37
    .line 38
    if-nez v4, :cond_0

    .line 39
    .line 40
    goto/16 :goto_6

    .line 41
    .line 42
    :cond_0
    const/4 v5, 0x0

    .line 43
    invoke-virtual {v0, v5}, Lxz1;->b(Ljava/lang/Integer;)Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_a

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    check-cast v5, Lwz1;

    .line 62
    .line 63
    sget-object v6, Lvy0;->Companion:Luy0;

    .line 64
    .line 65
    new-instance v7, Luh2;

    .line 66
    .line 67
    iget-object v8, v5, Lwz1;->a:Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    invoke-direct {v7, v8}, Luh2;-><init>(I)V

    .line 77
    .line 78
    .line 79
    sget-object v8, Lrj;->Companion:Lqj;

    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    const/4 v6, 0x6

    .line 85
    invoke-static {v7, v6}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    new-instance v7, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    new-instance v6, Luh2;

    .line 105
    .line 106
    invoke-virtual {v5}, Lwz1;->b()Ll42;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    iget v7, v7, Ll42;->a:I

    .line 111
    .line 112
    invoke-direct {v6, v7}, Luh2;-><init>(I)V

    .line 113
    .line 114
    .line 115
    const/4 v7, 0x2

    .line 116
    invoke-static {v6, v7}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    new-instance v7, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    sget-object v6, Lnd0;->a:Lnd0;

    .line 136
    .line 137
    invoke-virtual {v5}, Lwz1;->a()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-interface {v3, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-eqz v7, :cond_1

    .line 146
    .line 147
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    check-cast v5, Lrf2;

    .line 155
    .line 156
    iget-object v5, v5, Lrf2;->a:Ljava/util/TreeSet;

    .line 157
    .line 158
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    :cond_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    const-string v8, ""

    .line 167
    .line 168
    const/4 v9, 0x0

    .line 169
    const/4 v10, 0x0

    .line 170
    const/4 v11, 0x0

    .line 171
    :goto_1
    if-ge v9, v5, :cond_9

    .line 172
    .line 173
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    check-cast v12, Ljava/lang/Number;

    .line 178
    .line 179
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 180
    .line 181
    .line 182
    move-result v12

    .line 183
    if-nez v11, :cond_2

    .line 184
    .line 185
    add-int/lit8 v10, v10, 0x1

    .line 186
    .line 187
    move v11, v12

    .line 188
    :cond_2
    add-int/lit8 v13, v5, -0x1

    .line 189
    .line 190
    const/4 v14, 0x1

    .line 191
    if-eq v9, v13, :cond_5

    .line 192
    .line 193
    add-int/lit8 v15, v9, 0x1

    .line 194
    .line 195
    invoke-interface {v6, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v15

    .line 199
    check-cast v15, Ljava/lang/Number;

    .line 200
    .line 201
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 202
    .line 203
    .line 204
    move-result v15

    .line 205
    invoke-interface {v6, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v13

    .line 209
    check-cast v13, Ljava/lang/Number;

    .line 210
    .line 211
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 212
    .line 213
    .line 214
    move-result v13

    .line 215
    add-int/lit8 v16, v12, 0x1

    .line 216
    .line 217
    move/from16 v7, v16

    .line 218
    .line 219
    :goto_2
    if-gt v7, v13, :cond_4

    .line 220
    .line 221
    iget-object v1, v4, Lwp0;->c:Ljava/util/List;

    .line 222
    .line 223
    move-object/from16 v17, v0

    .line 224
    .line 225
    if-eqz v1, :cond_3

    .line 226
    .line 227
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-ne v0, v14, :cond_3

    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 239
    .line 240
    move-object/from16 v0, v17

    .line 241
    .line 242
    const/16 v1, 0xc

    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_4
    move-object/from16 v17, v0

    .line 246
    .line 247
    move v7, v12

    .line 248
    :goto_3
    if-le v15, v7, :cond_8

    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_5
    move-object/from16 v17, v0

    .line 252
    .line 253
    :goto_4
    if-eq v12, v11, :cond_6

    .line 254
    .line 255
    goto :goto_5

    .line 256
    :cond_6
    const/4 v14, 0x0

    .line 257
    :goto_5
    sget-object v0, Lek;->Companion:Ldk;

    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-static {v14}, Ldk;->a(Z)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    sget-object v1, Lvy0;->Companion:Luy0;

    .line 271
    .line 272
    new-instance v7, Luh2;

    .line 273
    .line 274
    invoke-direct {v7, v11}, Luh2;-><init>(I)V

    .line 275
    .line 276
    .line 277
    sget-object v8, Lrj;->Companion:Lqj;

    .line 278
    .line 279
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    const/16 v1, 0x10

    .line 283
    .line 284
    invoke-static {v7, v1}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    invoke-virtual {v0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    if-eqz v14, :cond_7

    .line 293
    .line 294
    new-instance v7, Luh2;

    .line 295
    .line 296
    invoke-direct {v7, v12}, Luh2;-><init>(I)V

    .line 297
    .line 298
    .line 299
    invoke-static {v7, v1}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    :cond_7
    move-object v8, v0

    .line 308
    const/4 v11, 0x0

    .line 309
    :cond_8
    add-int/lit8 v9, v9, 0x1

    .line 310
    .line 311
    move-object/from16 v0, v17

    .line 312
    .line 313
    const/16 v1, 0xc

    .line 314
    .line 315
    goto/16 :goto_1

    .line 316
    .line 317
    :cond_9
    move-object/from16 v17, v0

    .line 318
    .line 319
    sget-object v0, Lvy0;->Companion:Luy0;

    .line 320
    .line 321
    new-instance v1, Luh2;

    .line 322
    .line 323
    invoke-direct {v1, v10}, Luh2;-><init>(I)V

    .line 324
    .line 325
    .line 326
    sget-object v5, Lrj;->Companion:Lqj;

    .line 327
    .line 328
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    const/16 v0, 0xc

    .line 332
    .line 333
    invoke-static {v1, v0}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    new-instance v5, Ljava/lang/StringBuilder;

    .line 338
    .line 339
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    new-instance v2, Ljava/lang/StringBuilder;

    .line 353
    .line 354
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    move v1, v0

    .line 368
    move-object/from16 v0, v17

    .line 369
    .line 370
    goto/16 :goto_0

    .line 371
    .line 372
    :cond_a
    :goto_6
    return-object v2
.end method

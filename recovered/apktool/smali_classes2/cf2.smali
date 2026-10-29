.class public final Lcf2;
.super Lj42;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/util/Iterator;

.field public c:I

.field public d:I

.field public e:I

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic i:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcf2;->i:Ljava/util/Iterator;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lj42;-><init>(ILc10;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 1

    .line 1
    new-instance v0, Lcf2;

    .line 2
    .line 3
    iget-object p0, p0, Lcf2;->i:Ljava/util/Iterator;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, Lcf2;-><init>(Ljava/util/Iterator;Lc10;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcf2;->f:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lr92;

    .line 2
    .line 3
    check-cast p2, Lc10;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcf2;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcf2;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcf2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcf2;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lr92;

    .line 6
    .line 7
    sget-object v2, Lz10;->a:Lz10;

    .line 8
    .line 9
    iget v3, v0, Lcf2;->e:I

    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    const/16 v5, 0x14

    .line 13
    .line 14
    const/4 v6, 0x1

    .line 15
    const/4 v7, 0x0

    .line 16
    if-eqz v3, :cond_c

    .line 17
    .line 18
    if-eq v3, v6, :cond_b

    .line 19
    .line 20
    if-eq v3, v4, :cond_a

    .line 21
    .line 22
    const/4 v4, 0x5

    .line 23
    const/4 v8, 0x4

    .line 24
    const/4 v9, 0x3

    .line 25
    if-eq v3, v9, :cond_2

    .line 26
    .line 27
    if-eq v3, v8, :cond_1

    .line 28
    .line 29
    if-ne v3, v4, :cond_0

    .line 30
    .line 31
    iget-object v0, v0, Lcf2;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lb52;

    .line 34
    .line 35
    :goto_0
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {v0}, Lf42;->l(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v7

    .line 46
    :cond_1
    iget v3, v0, Lcf2;->d:I

    .line 47
    .line 48
    iget v6, v0, Lcf2;->c:I

    .line 49
    .line 50
    iget-object v9, v0, Lcf2;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v9, Lb52;

    .line 53
    .line 54
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v9}, Lb52;->a()V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_3

    .line 61
    .line 62
    :cond_2
    iget v3, v0, Lcf2;->d:I

    .line 63
    .line 64
    iget v10, v0, Lcf2;->c:I

    .line 65
    .line 66
    iget-object v11, v0, Lcf2;->b:Ljava/util/Iterator;

    .line 67
    .line 68
    iget-object v12, v0, Lcf2;->a:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v12, Lb52;

    .line 71
    .line 72
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12}, Lb52;->a()V

    .line 76
    .line 77
    .line 78
    :goto_1
    iget v13, v12, Lb52;->b:I

    .line 79
    .line 80
    iget-object v14, v12, Lb52;->a:[Ljava/lang/Object;

    .line 81
    .line 82
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v15

    .line 86
    if-eqz v15, :cond_8

    .line 87
    .line 88
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v15

    .line 92
    move/from16 v16, v6

    .line 93
    .line 94
    invoke-virtual {v12}, Lg;->size()I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-eq v6, v13, :cond_7

    .line 99
    .line 100
    iget v6, v12, Lb52;->c:I

    .line 101
    .line 102
    invoke-virtual {v12}, Lg;->size()I

    .line 103
    .line 104
    .line 105
    move-result v17

    .line 106
    add-int v17, v17, v6

    .line 107
    .line 108
    rem-int v17, v17, v13

    .line 109
    .line 110
    aput-object v15, v14, v17

    .line 111
    .line 112
    invoke-virtual {v12}, Lg;->size()I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    add-int/lit8 v6, v6, 0x1

    .line 117
    .line 118
    iput v6, v12, Lb52;->d:I

    .line 119
    .line 120
    invoke-virtual {v12}, Lg;->size()I

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-ne v6, v13, :cond_5

    .line 125
    .line 126
    invoke-virtual {v12}, Lg;->size()I

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-ge v6, v5, :cond_6

    .line 131
    .line 132
    shr-int/lit8 v6, v13, 0x1

    .line 133
    .line 134
    add-int/2addr v13, v6

    .line 135
    add-int/lit8 v13, v13, 0x1

    .line 136
    .line 137
    if-le v13, v5, :cond_3

    .line 138
    .line 139
    move v13, v5

    .line 140
    :cond_3
    iget v6, v12, Lb52;->c:I

    .line 141
    .line 142
    if-nez v6, :cond_4

    .line 143
    .line 144
    invoke-static {v14, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    goto :goto_2

    .line 149
    :cond_4
    new-array v6, v13, [Ljava/lang/Object;

    .line 150
    .line 151
    invoke-virtual {v12, v6}, Lb52;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    :goto_2
    new-instance v13, Lb52;

    .line 156
    .line 157
    invoke-virtual {v12}, Lg;->size()I

    .line 158
    .line 159
    .line 160
    move-result v12

    .line 161
    invoke-direct {v13, v6, v12}, Lb52;-><init>([Ljava/lang/Object;I)V

    .line 162
    .line 163
    .line 164
    move-object v12, v13

    .line 165
    :cond_5
    move/from16 v6, v16

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_6
    new-instance v4, Ljava/util/ArrayList;

    .line 169
    .line 170
    invoke-direct {v4, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 171
    .line 172
    .line 173
    iput-object v1, v0, Lcf2;->f:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object v12, v0, Lcf2;->a:Ljava/lang/Object;

    .line 176
    .line 177
    iput-object v11, v0, Lcf2;->b:Ljava/util/Iterator;

    .line 178
    .line 179
    iput v10, v0, Lcf2;->c:I

    .line 180
    .line 181
    iput v3, v0, Lcf2;->d:I

    .line 182
    .line 183
    iput v9, v0, Lcf2;->e:I

    .line 184
    .line 185
    invoke-virtual {v1, v4, v0}, Lr92;->a(Ljava/lang/Object;Lbi;)V

    .line 186
    .line 187
    .line 188
    sget-object v0, Lz10;->a:Lz10;

    .line 189
    .line 190
    return-object v2

    .line 191
    :cond_7
    const-string v0, "ring buffer is full"

    .line 192
    .line 193
    invoke-static {v0}, Lf42;->l(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    return-object v7

    .line 197
    :cond_8
    move v6, v10

    .line 198
    move-object v9, v12

    .line 199
    :goto_3
    invoke-virtual {v9}, Lg;->size()I

    .line 200
    .line 201
    .line 202
    move-result v10

    .line 203
    if-le v10, v5, :cond_9

    .line 204
    .line 205
    new-instance v4, Ljava/util/ArrayList;

    .line 206
    .line 207
    invoke-direct {v4, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 208
    .line 209
    .line 210
    iput-object v1, v0, Lcf2;->f:Ljava/lang/Object;

    .line 211
    .line 212
    iput-object v9, v0, Lcf2;->a:Ljava/lang/Object;

    .line 213
    .line 214
    iput-object v7, v0, Lcf2;->b:Ljava/util/Iterator;

    .line 215
    .line 216
    iput v6, v0, Lcf2;->c:I

    .line 217
    .line 218
    iput v3, v0, Lcf2;->d:I

    .line 219
    .line 220
    iput v8, v0, Lcf2;->e:I

    .line 221
    .line 222
    invoke-virtual {v1, v4, v0}, Lr92;->a(Ljava/lang/Object;Lbi;)V

    .line 223
    .line 224
    .line 225
    sget-object v0, Lz10;->a:Lz10;

    .line 226
    .line 227
    return-object v2

    .line 228
    :cond_9
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    if-nez v5, :cond_10

    .line 233
    .line 234
    iput-object v7, v0, Lcf2;->f:Ljava/lang/Object;

    .line 235
    .line 236
    iput-object v7, v0, Lcf2;->a:Ljava/lang/Object;

    .line 237
    .line 238
    iput-object v7, v0, Lcf2;->b:Ljava/util/Iterator;

    .line 239
    .line 240
    iput v6, v0, Lcf2;->c:I

    .line 241
    .line 242
    iput v3, v0, Lcf2;->d:I

    .line 243
    .line 244
    iput v4, v0, Lcf2;->e:I

    .line 245
    .line 246
    invoke-virtual {v1, v9, v0}, Lr92;->a(Ljava/lang/Object;Lbi;)V

    .line 247
    .line 248
    .line 249
    sget-object v0, Lz10;->a:Lz10;

    .line 250
    .line 251
    return-object v2

    .line 252
    :cond_a
    iget-object v0, v0, Lcf2;->a:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v0, Ljava/util/ArrayList;

    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :cond_b
    move/from16 v16, v6

    .line 259
    .line 260
    iget v3, v0, Lcf2;->d:I

    .line 261
    .line 262
    iget v6, v0, Lcf2;->c:I

    .line 263
    .line 264
    iget-object v8, v0, Lcf2;->b:Ljava/util/Iterator;

    .line 265
    .line 266
    iget-object v9, v0, Lcf2;->a:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v9, Ljava/util/ArrayList;

    .line 269
    .line 270
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    new-instance v9, Ljava/util/ArrayList;

    .line 274
    .line 275
    invoke-direct {v9, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 276
    .line 277
    .line 278
    move-object v10, v9

    .line 279
    move-object v9, v8

    .line 280
    move v8, v6

    .line 281
    move v6, v3

    .line 282
    goto :goto_4

    .line 283
    :cond_c
    move/from16 v16, v6

    .line 284
    .line 285
    invoke-static/range {p1 .. p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    new-instance v9, Ljava/util/ArrayList;

    .line 289
    .line 290
    invoke-direct {v9, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 291
    .line 292
    .line 293
    iget-object v8, v0, Lcf2;->i:Ljava/util/Iterator;

    .line 294
    .line 295
    const/4 v3, 0x0

    .line 296
    move v6, v3

    .line 297
    move-object v10, v9

    .line 298
    move-object v9, v8

    .line 299
    move v8, v5

    .line 300
    :cond_d
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 301
    .line 302
    .line 303
    move-result v11

    .line 304
    if-eqz v11, :cond_f

    .line 305
    .line 306
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v11

    .line 310
    if-lez v3, :cond_e

    .line 311
    .line 312
    add-int/lit8 v3, v3, -0x1

    .line 313
    .line 314
    goto :goto_4

    .line 315
    :cond_e
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 319
    .line 320
    .line 321
    move-result v11

    .line 322
    if-ne v11, v5, :cond_d

    .line 323
    .line 324
    iput-object v1, v0, Lcf2;->f:Ljava/lang/Object;

    .line 325
    .line 326
    iput-object v10, v0, Lcf2;->a:Ljava/lang/Object;

    .line 327
    .line 328
    iput-object v9, v0, Lcf2;->b:Ljava/util/Iterator;

    .line 329
    .line 330
    iput v8, v0, Lcf2;->c:I

    .line 331
    .line 332
    iput v6, v0, Lcf2;->d:I

    .line 333
    .line 334
    move/from16 v11, v16

    .line 335
    .line 336
    iput v11, v0, Lcf2;->e:I

    .line 337
    .line 338
    invoke-virtual {v1, v10, v0}, Lr92;->a(Ljava/lang/Object;Lbi;)V

    .line 339
    .line 340
    .line 341
    sget-object v0, Lz10;->a:Lz10;

    .line 342
    .line 343
    return-object v2

    .line 344
    :cond_f
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    if-nez v3, :cond_10

    .line 349
    .line 350
    iput-object v7, v0, Lcf2;->f:Ljava/lang/Object;

    .line 351
    .line 352
    iput-object v7, v0, Lcf2;->a:Ljava/lang/Object;

    .line 353
    .line 354
    iput-object v7, v0, Lcf2;->b:Ljava/util/Iterator;

    .line 355
    .line 356
    iput v8, v0, Lcf2;->c:I

    .line 357
    .line 358
    iput v6, v0, Lcf2;->d:I

    .line 359
    .line 360
    iput v4, v0, Lcf2;->e:I

    .line 361
    .line 362
    invoke-virtual {v1, v10, v0}, Lr92;->a(Ljava/lang/Object;Lbi;)V

    .line 363
    .line 364
    .line 365
    sget-object v0, Lz10;->a:Lz10;

    .line 366
    .line 367
    return-object v2

    .line 368
    :cond_10
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 369
    .line 370
    return-object v0
.end method

.class public final Lft2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public static a(Luu1;Lew2;)Lgt2;
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkt2;->Companion:Ljt2;

    .line 5
    .line 6
    iget-object v1, p0, Luu1;->u:Lbu1;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x4

    .line 20
    const/4 v3, 0x3

    .line 21
    const/4 v4, 0x2

    .line 22
    const/4 v5, 0x1

    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    if-eq v0, v5, :cond_3

    .line 26
    .line 27
    if-eq v0, v4, :cond_2

    .line 28
    .line 29
    if-eq v0, v3, :cond_1

    .line 30
    .line 31
    if-ne v0, v2, :cond_0

    .line 32
    .line 33
    sget-object v0, Lkt2;->d:Lkt2;

    .line 34
    .line 35
    :goto_0
    move-object v12, v0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-static {}, Lds0;->b()V

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_1
    sget-object v0, Lkt2;->c:Lkt2;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    sget-object v0, Lkt2;->e:Lkt2;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    sget-object v0, Lkt2;->b:Lkt2;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_4
    sget-object v0, Lkt2;->a:Lkt2;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :goto_1
    iget-object v0, p1, Lew2;->d:Lit2;

    .line 54
    .line 55
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_9

    .line 60
    .line 61
    if-eq v6, v5, :cond_8

    .line 62
    .line 63
    if-eq v6, v4, :cond_7

    .line 64
    .line 65
    if-eq v6, v3, :cond_6

    .line 66
    .line 67
    if-ne v6, v2, :cond_5

    .line 68
    .line 69
    iget-object v0, v0, Lit2;->e:Let2;

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_5
    invoke-static {}, Lds0;->b()V

    .line 73
    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_6
    iget-object v0, v0, Lit2;->c:Let2;

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_7
    iget-object v0, v0, Lit2;->d:Let2;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_8
    iget-object v0, v0, Lit2;->b:Let2;

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_9
    iget-object v0, v0, Lit2;->a:Let2;

    .line 86
    .line 87
    :goto_2
    iget-object p1, p1, Lew2;->b:Lwu2;

    .line 88
    .line 89
    iget-object v7, p0, Lr4;->b:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v8, v0, Let2;->b:Ljava/lang/Integer;

    .line 92
    .line 93
    iget v9, v0, Let2;->c:I

    .line 94
    .line 95
    iget-object v10, v0, Let2;->a:Ljava/lang/Integer;

    .line 96
    .line 97
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 98
    .line 99
    iget-object p0, p1, Lwu2;->a:Luu2;

    .line 100
    .line 101
    iget v11, p0, Luu2;->b:F

    .line 102
    .line 103
    new-instance v6, Lgt2;

    .line 104
    .line 105
    invoke-direct/range {v6 .. v12}, Lgt2;-><init>(Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;FLkt2;)V

    .line 106
    .line 107
    .line 108
    return-object v6
.end method

.method public static b(ZLkl;Ljava/util/List;Lew2;Lec0;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p4, Llz;

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    invoke-direct {p4, v0, p2, p3}, Llz;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p4}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 11
    .line 12
    .line 13
    move-result-object p4

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p4}, Lhk2;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/util/List;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    instance-of p0, p1, Lhl;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    const/16 v1, 0xa

    .line 27
    .line 28
    if-eqz p0, :cond_6

    .line 29
    .line 30
    check-cast p1, Lhl;

    .line 31
    .line 32
    iget-object p0, p1, Lhl;->a:Ljava/util/List;

    .line 33
    .line 34
    invoke-static {p0}, Lyy1;->p(Ljava/util/List;)Ljava/util/Collection;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ljava/util/List;

    .line 39
    .line 40
    if-eqz p0, :cond_3

    .line 41
    .line 42
    new-instance p1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-static {p0, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-nez p2, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-eqz p0, :cond_2

    .line 67
    .line 68
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_2
    sget-object p0, Lgt2;->Companion:Lft2;

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :cond_3
    invoke-static {p2}, Lqw;->i(Ljava/util/List;)Ljava/util/ArrayList;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    new-instance p1, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-static {p0, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_4

    .line 100
    .line 101
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    check-cast p2, Luu1;

    .line 106
    .line 107
    sget-object p4, Lgt2;->Companion:Lft2;

    .line 108
    .line 109
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-static {p2, p3}, Lft2;->a(Luu1;Lew2;)Lgt2;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_4
    :goto_1
    new-instance p0, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-static {p1, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    invoke-direct {p0, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 127
    .line 128
    .line 129
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-eqz p2, :cond_5

    .line 138
    .line 139
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    check-cast p2, Lgt2;

    .line 144
    .line 145
    invoke-static {p2}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_5
    return-object p0

    .line 154
    :cond_6
    instance-of p0, p1, Ljl;

    .line 155
    .line 156
    if-eqz p0, :cond_b

    .line 157
    .line 158
    check-cast p1, Ljl;

    .line 159
    .line 160
    iget-object p0, p1, Ljl;->a:Ljava/util/List;

    .line 161
    .line 162
    invoke-static {p0}, Lyy1;->p(Ljava/util/List;)Ljava/util/Collection;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    check-cast p0, Ljava/util/List;

    .line 167
    .line 168
    if-eqz p0, :cond_9

    .line 169
    .line 170
    new-instance p1, Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-static {p0, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 177
    .line 178
    .line 179
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    if-nez p2, :cond_7

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    if-eqz p0, :cond_8

    .line 195
    .line 196
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 197
    .line 198
    .line 199
    return-object v0

    .line 200
    :cond_8
    sget-object p0, Lgt2;->Companion:Lft2;

    .line 201
    .line 202
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    throw v0

    .line 206
    :cond_9
    invoke-static {p2}, Lqw;->i(Ljava/util/List;)Ljava/util/ArrayList;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    new-instance p1, Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-static {p0, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 213
    .line 214
    .line 215
    move-result p2

    .line 216
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result p2

    .line 227
    if-eqz p2, :cond_a

    .line 228
    .line 229
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    check-cast p2, Luu1;

    .line 234
    .line 235
    sget-object p4, Lgt2;->Companion:Lft2;

    .line 236
    .line 237
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-static {p2, p3}, Lft2;->a(Luu1;Lew2;)Lgt2;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_a
    :goto_4
    invoke-static {p1}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    return-object p0

    .line 253
    :cond_b
    instance-of p0, p1, Lil;

    .line 254
    .line 255
    if-eqz p0, :cond_12

    .line 256
    .line 257
    check-cast p1, Lil;

    .line 258
    .line 259
    iget-object p0, p1, Lil;->a:Ljava/util/List;

    .line 260
    .line 261
    invoke-static {p0}, Lyy1;->p(Ljava/util/List;)Ljava/util/Collection;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    check-cast p0, Ljava/util/List;

    .line 266
    .line 267
    if-eqz p0, :cond_f

    .line 268
    .line 269
    new-instance p1, Ljava/util/ArrayList;

    .line 270
    .line 271
    invoke-static {p0, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 272
    .line 273
    .line 274
    move-result p2

    .line 275
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 276
    .line 277
    .line 278
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result p2

    .line 286
    if-eqz p2, :cond_e

    .line 287
    .line 288
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p2

    .line 292
    check-cast p2, Ljava/util/List;

    .line 293
    .line 294
    new-instance p3, Ljava/util/ArrayList;

    .line 295
    .line 296
    invoke-static {p2, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 297
    .line 298
    .line 299
    move-result p4

    .line 300
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 301
    .line 302
    .line 303
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 304
    .line 305
    .line 306
    move-result-object p2

    .line 307
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 308
    .line 309
    .line 310
    move-result p4

    .line 311
    if-nez p4, :cond_c

    .line 312
    .line 313
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    goto :goto_5

    .line 317
    :cond_c
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    if-eqz p0, :cond_d

    .line 322
    .line 323
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 324
    .line 325
    .line 326
    return-object v0

    .line 327
    :cond_d
    sget-object p0, Lgt2;->Companion:Lft2;

    .line 328
    .line 329
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    throw v0

    .line 333
    :cond_e
    return-object p1

    .line 334
    :cond_f
    new-instance p0, Ljava/util/ArrayList;

    .line 335
    .line 336
    invoke-static {p2, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 337
    .line 338
    .line 339
    move-result p1

    .line 340
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 341
    .line 342
    .line 343
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 344
    .line 345
    .line 346
    move-result-object p1

    .line 347
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 348
    .line 349
    .line 350
    move-result p2

    .line 351
    if-eqz p2, :cond_11

    .line 352
    .line 353
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object p2

    .line 357
    check-cast p2, Ljava/util/List;

    .line 358
    .line 359
    new-instance p4, Ljava/util/ArrayList;

    .line 360
    .line 361
    invoke-static {p2, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    invoke-direct {p4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 366
    .line 367
    .line 368
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 369
    .line 370
    .line 371
    move-result-object p2

    .line 372
    :goto_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    if-eqz v0, :cond_10

    .line 377
    .line 378
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    check-cast v0, Luu1;

    .line 383
    .line 384
    sget-object v2, Lgt2;->Companion:Lft2;

    .line 385
    .line 386
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    invoke-static {v0, p3}, Lft2;->a(Luu1;Lew2;)Lgt2;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-virtual {p4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    goto :goto_7

    .line 397
    :cond_10
    invoke-virtual {p0, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    goto :goto_6

    .line 401
    :cond_11
    return-object p0

    .line 402
    :cond_12
    if-nez p1, :cond_13

    .line 403
    .line 404
    invoke-virtual {p4}, Lhk2;->getValue()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object p0

    .line 408
    check-cast p0, Ljava/util/List;

    .line 409
    .line 410
    return-object p0

    .line 411
    :cond_13
    invoke-static {}, Lds0;->b()V

    .line 412
    .line 413
    .line 414
    return-object v0
.end method

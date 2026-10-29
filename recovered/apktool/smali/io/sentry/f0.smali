.class public final Lio/sentry/f0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/u0;
.implements Lio/sentry/logger/a;


# instance fields
.field public final a:Lio/sentry/g4;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/g4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/f0;->a:Lio/sentry/g4;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lio/sentry/protocol/k;)Lio/sentry/protocol/w;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/f0;->a:Lio/sentry/g4;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lio/sentry/c1;->p(Lio/sentry/protocol/k;)Lio/sentry/protocol/w;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public varargs b(Lio/sentry/d;Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/HashMap;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lio/sentry/f0;->a:Lio/sentry/g4;

    .line 7
    .line 8
    iget-object v1, p0, Lio/sentry/g4;->e:Lio/sentry/l;

    .line 9
    .line 10
    invoke-virtual {v1}, Lio/sentry/l;->getAttributes()Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_f

    .line 27
    .line 28
    iget-object p1, p1, Lio/sentry/d;->a:Ljava/lang/String;

    .line 29
    .line 30
    const-string v1, "manual"

    .line 31
    .line 32
    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    new-instance v1, Lio/sentry/protocol/n;

    .line 39
    .line 40
    sget-object v2, Lio/sentry/o4;->STRING:Lio/sentry/o4;

    .line 41
    .line 42
    invoke-direct {v1, v2, p1}, Lio/sentry/protocol/n;-><init>(Lio/sentry/o4;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const-string p1, "sentry.origin"

    .line 46
    .line 47
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    :cond_0
    array-length p1, p3

    .line 51
    const/4 v1, 0x0

    .line 52
    move v2, v1

    .line 53
    move v3, v2

    .line 54
    :goto_0
    if-ge v2, p1, :cond_1

    .line 55
    .line 56
    aget-object v4, p3, v2

    .line 57
    .line 58
    invoke-static {v4}, Lio/sentry/o4;->inferFrom(Ljava/lang/Object;)Lio/sentry/o4;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    const-string v6, "sentry.message.parameter."

    .line 63
    .line 64
    invoke-static {v3, v6}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    new-instance v7, Lio/sentry/protocol/n;

    .line 69
    .line 70
    invoke-direct {v7, v5, v4}, Lio/sentry/protocol/n;-><init>(Lio/sentry/o4;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    add-int/lit8 v3, v3, 0x1

    .line 77
    .line 78
    add-int/lit8 v2, v2, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    if-lez v3, :cond_2

    .line 82
    .line 83
    const-string p1, "sentry.message.template"

    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    if-nez p3, :cond_2

    .line 90
    .line 91
    new-instance p3, Lio/sentry/protocol/n;

    .line 92
    .line 93
    sget-object v2, Lio/sentry/o4;->STRING:Lio/sentry/o4;

    .line 94
    .line 95
    invoke-direct {p3, v2, p2}, Lio/sentry/protocol/n;-><init>(Lio/sentry/o4;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    :cond_2
    invoke-virtual {p0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Lio/sentry/m6;->getSdkVersion()Lio/sentry/protocol/u;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-eqz p1, :cond_3

    .line 110
    .line 111
    new-instance p2, Lio/sentry/protocol/n;

    .line 112
    .line 113
    sget-object p3, Lio/sentry/o4;->STRING:Lio/sentry/o4;

    .line 114
    .line 115
    iget-object v2, p1, Lio/sentry/protocol/u;->a:Ljava/lang/String;

    .line 116
    .line 117
    invoke-direct {p2, p3, v2}, Lio/sentry/protocol/n;-><init>(Lio/sentry/o4;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    const-string v2, "sentry.sdk.name"

    .line 121
    .line 122
    invoke-virtual {v0, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    new-instance p2, Lio/sentry/protocol/n;

    .line 126
    .line 127
    iget-object p1, p1, Lio/sentry/protocol/u;->b:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {p3}, Lio/sentry/o4;->apiName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    invoke-direct {p2, p3, p1}, Lio/sentry/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    const-string p1, "sentry.sdk.version"

    .line 137
    .line 138
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    :cond_3
    invoke-virtual {p0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p1}, Lio/sentry/m6;->getEnvironment()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    if-eqz p1, :cond_4

    .line 150
    .line 151
    new-instance p2, Lio/sentry/protocol/n;

    .line 152
    .line 153
    sget-object p3, Lio/sentry/o4;->STRING:Lio/sentry/o4;

    .line 154
    .line 155
    invoke-direct {p2, p3, p1}, Lio/sentry/protocol/n;-><init>(Lio/sentry/o4;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    const-string p1, "sentry.environment"

    .line 159
    .line 160
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    :cond_4
    iget-object p1, p0, Lio/sentry/g4;->e:Lio/sentry/l;

    .line 164
    .line 165
    invoke-virtual {p1}, Lio/sentry/l;->i()Lio/sentry/protocol/w;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    sget-object p2, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 170
    .line 171
    invoke-virtual {p2, p1}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result p3

    .line 175
    const-string v2, "sentry.replay_id"

    .line 176
    .line 177
    if-nez p3, :cond_5

    .line 178
    .line 179
    new-instance p2, Lio/sentry/protocol/n;

    .line 180
    .line 181
    sget-object p3, Lio/sentry/o4;->STRING:Lio/sentry/o4;

    .line 182
    .line 183
    invoke-virtual {p1}, Lio/sentry/protocol/w;->a()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-direct {p2, p3, p1}, Lio/sentry/protocol/n;-><init>(Lio/sentry/o4;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_5
    invoke-virtual {p0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-virtual {p1}, Lio/sentry/m6;->getReplayController()Lio/sentry/v3;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-interface {p1}, Lio/sentry/v3;->i()Lio/sentry/protocol/w;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {p2, p1}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result p2

    .line 210
    if-nez p2, :cond_6

    .line 211
    .line 212
    new-instance p2, Lio/sentry/protocol/n;

    .line 213
    .line 214
    sget-object p3, Lio/sentry/o4;->STRING:Lio/sentry/o4;

    .line 215
    .line 216
    invoke-virtual {p1}, Lio/sentry/protocol/w;->a()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-direct {p2, p3, p1}, Lio/sentry/protocol/n;-><init>(Lio/sentry/o4;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    new-instance p1, Lio/sentry/protocol/n;

    .line 227
    .line 228
    sget-object p2, Lio/sentry/o4;->BOOLEAN:Lio/sentry/o4;

    .line 229
    .line 230
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 231
    .line 232
    invoke-direct {p1, p2, p3}, Lio/sentry/protocol/n;-><init>(Lio/sentry/o4;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    const-string p2, "sentry._internal.replay_is_buffering"

    .line 236
    .line 237
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    :cond_6
    :goto_1
    invoke-virtual {p0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    invoke-virtual {p1}, Lio/sentry/m6;->getRelease()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    if-eqz p1, :cond_7

    .line 249
    .line 250
    new-instance p2, Lio/sentry/protocol/n;

    .line 251
    .line 252
    sget-object p3, Lio/sentry/o4;->STRING:Lio/sentry/o4;

    .line 253
    .line 254
    invoke-direct {p2, p3, p1}, Lio/sentry/protocol/n;-><init>(Lio/sentry/o4;Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    const-string p1, "sentry.release"

    .line 258
    .line 259
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    :cond_7
    sget-boolean p1, Lio/sentry/util/k;->a:Z

    .line 263
    .line 264
    if-nez p1, :cond_a

    .line 265
    .line 266
    invoke-virtual {p0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-virtual {p1}, Lio/sentry/m6;->getServerName()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p2

    .line 274
    const-string p3, "server.address"

    .line 275
    .line 276
    if-eqz p2, :cond_8

    .line 277
    .line 278
    new-instance p1, Lio/sentry/protocol/n;

    .line 279
    .line 280
    sget-object v1, Lio/sentry/o4;->STRING:Lio/sentry/o4;

    .line 281
    .line 282
    invoke-direct {p1, v1, p2}, Lio/sentry/protocol/n;-><init>(Lio/sentry/o4;Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    goto :goto_2

    .line 289
    :cond_8
    invoke-virtual {p1}, Lio/sentry/m6;->isAttachServerName()Z

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    if-eqz p1, :cond_a

    .line 294
    .line 295
    invoke-static {}, Lio/sentry/l0;->a()Lio/sentry/l0;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    iget-wide v2, p1, Lio/sentry/l0;->c:J

    .line 300
    .line 301
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 302
    .line 303
    .line 304
    move-result-wide v4

    .line 305
    cmp-long p2, v2, v4

    .line 306
    .line 307
    if-gez p2, :cond_9

    .line 308
    .line 309
    iget-object p2, p1, Lio/sentry/l0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 310
    .line 311
    const/4 v2, 0x1

    .line 312
    invoke-virtual {p2, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 313
    .line 314
    .line 315
    move-result p2

    .line 316
    if-eqz p2, :cond_9

    .line 317
    .line 318
    invoke-virtual {p1}, Lio/sentry/l0;->b()V

    .line 319
    .line 320
    .line 321
    :cond_9
    iget-object p1, p1, Lio/sentry/l0;->b:Ljava/lang/String;

    .line 322
    .line 323
    if-eqz p1, :cond_a

    .line 324
    .line 325
    new-instance p2, Lio/sentry/protocol/n;

    .line 326
    .line 327
    sget-object v1, Lio/sentry/o4;->STRING:Lio/sentry/o4;

    .line 328
    .line 329
    invoke-direct {p2, v1, p1}, Lio/sentry/protocol/n;-><init>(Lio/sentry/o4;Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    :cond_a
    :goto_2
    iget-object p1, p0, Lio/sentry/g4;->e:Lio/sentry/l;

    .line 336
    .line 337
    invoke-virtual {p1}, Lio/sentry/l;->K()Lio/sentry/protocol/j0;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    const-string p2, "user.id"

    .line 342
    .line 343
    if-nez p1, :cond_b

    .line 344
    .line 345
    invoke-virtual {p0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    invoke-virtual {p0}, Lio/sentry/m6;->getDistinctId()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object p0

    .line 353
    if-eqz p0, :cond_e

    .line 354
    .line 355
    new-instance p1, Lio/sentry/protocol/n;

    .line 356
    .line 357
    sget-object p3, Lio/sentry/o4;->STRING:Lio/sentry/o4;

    .line 358
    .line 359
    invoke-direct {p1, p3, p0}, Lio/sentry/protocol/n;-><init>(Lio/sentry/o4;Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    return-object v0

    .line 366
    :cond_b
    iget-object p0, p1, Lio/sentry/protocol/j0;->b:Ljava/lang/String;

    .line 367
    .line 368
    if-eqz p0, :cond_c

    .line 369
    .line 370
    new-instance p3, Lio/sentry/protocol/n;

    .line 371
    .line 372
    sget-object v1, Lio/sentry/o4;->STRING:Lio/sentry/o4;

    .line 373
    .line 374
    invoke-direct {p3, v1, p0}, Lio/sentry/protocol/n;-><init>(Lio/sentry/o4;Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    :cond_c
    iget-object p0, p1, Lio/sentry/protocol/j0;->c:Ljava/lang/String;

    .line 381
    .line 382
    if-eqz p0, :cond_d

    .line 383
    .line 384
    new-instance p2, Lio/sentry/protocol/n;

    .line 385
    .line 386
    sget-object p3, Lio/sentry/o4;->STRING:Lio/sentry/o4;

    .line 387
    .line 388
    invoke-direct {p2, p3, p0}, Lio/sentry/protocol/n;-><init>(Lio/sentry/o4;Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    const-string p0, "user.name"

    .line 392
    .line 393
    invoke-virtual {v0, p0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    :cond_d
    iget-object p0, p1, Lio/sentry/protocol/j0;->a:Ljava/lang/String;

    .line 397
    .line 398
    if-eqz p0, :cond_e

    .line 399
    .line 400
    new-instance p1, Lio/sentry/protocol/n;

    .line 401
    .line 402
    sget-object p2, Lio/sentry/o4;->STRING:Lio/sentry/o4;

    .line 403
    .line 404
    invoke-direct {p1, p2, p0}, Lio/sentry/protocol/n;-><init>(Lio/sentry/o4;Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    const-string p0, "user.email"

    .line 408
    .line 409
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    :cond_e
    return-object v0

    .line 413
    :cond_f
    invoke-static {v1}, Lfm0;->f(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 414
    .line 415
    .line 416
    move-result-object p0

    .line 417
    throw p0
.end method

.method public varargs e(Lio/sentry/q5;Lio/sentry/d;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lio/sentry/f0;->a:Lio/sentry/g4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v0, Lio/sentry/g4;->e:Lio/sentry/l;

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {v0}, Lio/sentry/g4;->isEnabled()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x0

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget-object p1, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 21
    .line 22
    const-string p2, "Instance is disabled and this \'logger\' call is a no-op."

    .line 23
    .line 24
    new-array p3, v4, [Ljava/lang/Object;

    .line 25
    .line 26
    invoke-interface {p0, p1, p2, p3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto/16 :goto_4

    .line 32
    .line 33
    :cond_0
    invoke-virtual {v1}, Lio/sentry/m6;->getLogs()Lio/sentry/e6;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget-boolean v3, v3, Lio/sentry/e6;->a:Z

    .line 38
    .line 39
    if-nez v3, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    sget-object p1, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 46
    .line 47
    const-string p2, "Sentry Log is disabled and this \'logger\' call is a no-op."

    .line 48
    .line 49
    new-array p3, v4, [Ljava/lang/Object;

    .line 50
    .line 51
    invoke-interface {p0, p1, p2, p3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    if-nez p3, :cond_2

    .line 56
    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :cond_2
    invoke-virtual {v1}, Lio/sentry/m6;->getDateProvider()Lio/sentry/u4;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-interface {v3}, Lio/sentry/u4;->a()Lio/sentry/t4;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    array-length v4, p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    if-nez v4, :cond_3

    .line 69
    .line 70
    :goto_0
    move-object v0, p3

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    :try_start_1
    invoke-static {p3, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    goto :goto_1

    .line 77
    :catchall_1
    move-exception v4

    .line 78
    :try_start_2
    invoke-virtual {v0}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sget-object v5, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 87
    .line 88
    const-string v6, "Error while running log through String.format"

    .line 89
    .line 90
    invoke-interface {v0, v5, v6, v4}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :goto_1
    invoke-virtual {v2}, Lio/sentry/l;->u()Lio/sentry/t3;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-virtual {v2}, Lio/sentry/l;->g()Lio/sentry/k1;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    if-nez v5, :cond_4

    .line 103
    .line 104
    new-instance v6, Lpn;

    .line 105
    .line 106
    const/16 v7, 0x1d

    .line 107
    .line 108
    invoke-direct {v6, v7, v2, v1}, Lpn;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v6}, Lio/sentry/l;->E(Lio/sentry/y3;)Lio/sentry/t3;

    .line 112
    .line 113
    .line 114
    :cond_4
    if-nez v5, :cond_5

    .line 115
    .line 116
    iget-object v6, v4, Lio/sentry/t3;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v6, Lio/sentry/protocol/w;

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    invoke-interface {v5}, Lio/sentry/k1;->s()Lio/sentry/b7;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    iget-object v6, v6, Lio/sentry/b7;->a:Lio/sentry/protocol/w;

    .line 126
    .line 127
    :goto_2
    if-nez v5, :cond_6

    .line 128
    .line 129
    iget-object v4, v4, Lio/sentry/t3;->c:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v4, Lio/sentry/d7;

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_6
    invoke-interface {v5}, Lio/sentry/k1;->s()Lio/sentry/b7;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    iget-object v4, v4, Lio/sentry/b7;->b:Lio/sentry/d7;

    .line 139
    .line 140
    :goto_3
    new-instance v5, Lio/sentry/o5;

    .line 141
    .line 142
    invoke-virtual {v3}, Lio/sentry/t4;->d()J

    .line 143
    .line 144
    .line 145
    move-result-wide v7

    .line 146
    long-to-double v7, v7

    .line 147
    const-wide v9, 0x41cdcd6500000000L    # 1.0E9

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    div-double/2addr v7, v9

    .line 153
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-direct {v5, v6, v3, v0, p1}, Lio/sentry/o5;-><init>(Lio/sentry/protocol/w;Ljava/lang/Double;Ljava/lang/String;Lio/sentry/q5;)V

    .line 158
    .line 159
    .line 160
    iput-object v4, v5, Lio/sentry/o5;->b:Lio/sentry/d7;

    .line 161
    .line 162
    invoke-virtual {p0, p2, p3, p4}, Lio/sentry/f0;->b(Lio/sentry/d;Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/HashMap;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    iput-object p0, v5, Lio/sentry/o5;->i:Ljava/util/Map;

    .line 167
    .line 168
    invoke-virtual {p1}, Lio/sentry/q5;->getSeverityNumber()I

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    iput-object p0, v5, Lio/sentry/o5;->f:Ljava/lang/Integer;

    .line 177
    .line 178
    invoke-virtual {v2}, Lio/sentry/l;->y()Lio/sentry/f1;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-interface {p0, v5, v2}, Lio/sentry/f1;->i(Lio/sentry/o5;Lio/sentry/a1;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 183
    .line 184
    .line 185
    goto :goto_5

    .line 186
    :goto_4
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    sget-object p2, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 191
    .line 192
    const-string p3, "Error while capturing log event"

    .line 193
    .line 194
    invoke-interface {p1, p2, p3, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 195
    .line 196
    .line 197
    :goto_5
    return-void
.end method

.method public j(Lio/sentry/protocol/k;)Lio/sentry/protocol/w;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/f0;->a:Lio/sentry/g4;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/sentry/g4;->A(Lio/sentry/protocol/k;)Lio/sentry/protocol/w;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public l(Lio/sentry/protocol/k;)Lio/sentry/protocol/w;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/f0;->a:Lio/sentry/g4;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/sentry/g4;->A(Lio/sentry/protocol/k;)Lio/sentry/protocol/w;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

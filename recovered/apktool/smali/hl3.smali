.class public final Lhl3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lsl3;

.field public final synthetic c:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lsl3;Landroid/os/Bundle;I)V
    .locals 0

    .line 1
    iput p3, p0, Lhl3;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lhl3;->c:Landroid/os/Bundle;

    .line 4
    .line 5
    iput-object p1, p0, Lhl3;->b:Lsl3;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lhl3;->a:I

    .line 4
    .line 5
    iget-object v2, v0, Lhl3;->c:Landroid/os/Bundle;

    .line 6
    .line 7
    iget-object v0, v0, Lhl3;->b:Lsl3;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v3, v0, Lsl3;->h0:Lac3;

    .line 13
    .line 14
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lij3;

    .line 17
    .line 18
    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    move-object v1, v2

    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :cond_0
    new-instance v1, Landroid/os/Bundle;

    .line 28
    .line 29
    iget-object v4, v0, Lij3;->e:Lki3;

    .line 30
    .line 31
    iget-object v9, v0, Lij3;->w:Lup3;

    .line 32
    .line 33
    iget-object v10, v0, Lij3;->d:Lpd3;

    .line 34
    .line 35
    iget-object v11, v0, Lij3;->f:Luh3;

    .line 36
    .line 37
    invoke-static {v4}, Lij3;->j(Lsq3;)V

    .line 38
    .line 39
    .line 40
    iget-object v4, v4, Lki3;->j0:Lra2;

    .line 41
    .line 42
    invoke-virtual {v4}, Lra2;->x()Landroid/os/Bundle;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-direct {v1, v4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v12

    .line 57
    :cond_1
    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_6

    .line 62
    .line 63
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    move-object v13, v4

    .line 68
    check-cast v13, Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v2, v13}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v14

    .line 74
    if-eqz v14, :cond_3

    .line 75
    .line 76
    instance-of v4, v14, Ljava/lang/String;

    .line 77
    .line 78
    if-nez v4, :cond_3

    .line 79
    .line 80
    instance-of v4, v14, Ljava/lang/Long;

    .line 81
    .line 82
    if-nez v4, :cond_3

    .line 83
    .line 84
    instance-of v4, v14, Ljava/lang/Double;

    .line 85
    .line 86
    if-nez v4, :cond_3

    .line 87
    .line 88
    invoke-static {v9}, Lij3;->j(Lsq3;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v14}, Lup3;->H0(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_2

    .line 96
    .line 97
    const/4 v7, 0x0

    .line 98
    const/4 v8, 0x0

    .line 99
    const/4 v4, 0x0

    .line 100
    const/16 v5, 0x1b

    .line 101
    .line 102
    const/4 v6, 0x0

    .line 103
    invoke-static/range {v3 .. v8}, Lup3;->P(Lac3;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-static {v11}, Lij3;->l(Lhk3;)V

    .line 107
    .line 108
    .line 109
    iget-object v4, v11, Luh3;->V:Lsh3;

    .line 110
    .line 111
    const-string v5, "Invalid default event parameter type. Name, value"

    .line 112
    .line 113
    invoke-virtual {v4, v13, v5, v14}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    invoke-static {v13}, Lup3;->X(Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_4

    .line 122
    .line 123
    invoke-static {v11}, Lij3;->l(Lhk3;)V

    .line 124
    .line 125
    .line 126
    iget-object v4, v11, Luh3;->V:Lsh3;

    .line 127
    .line 128
    const-string v5, "Invalid default event parameter name. Name"

    .line 129
    .line 130
    invoke-virtual {v4, v13, v5}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_4
    if-nez v14, :cond_5

    .line 135
    .line 136
    invoke-virtual {v1, v13}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_5
    invoke-static {v9}, Lij3;->j(Lsq3;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    const/16 v4, 0x1f4

    .line 147
    .line 148
    const-string v5, "param"

    .line 149
    .line 150
    invoke-virtual {v9, v5, v13, v4, v14}, Lup3;->I0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-eqz v4, :cond_1

    .line 155
    .line 156
    invoke-virtual {v9, v14, v13, v1}, Lup3;->O(Ljava/lang/Object;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_6
    invoke-static {v9}, Lij3;->j(Lsq3;)V

    .line 161
    .line 162
    .line 163
    iget-object v4, v10, Lsq3;->a:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v4, Lij3;

    .line 166
    .line 167
    iget-object v4, v4, Lij3;->w:Lup3;

    .line 168
    .line 169
    invoke-static {v4}, Lij3;->j(Lsq3;)V

    .line 170
    .line 171
    .line 172
    const v5, 0xc02a560

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4, v5}, Lup3;->e0(I)Z

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    if-eqz v4, :cond_7

    .line 180
    .line 181
    const/16 v4, 0x64

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_7
    const/16 v4, 0x19

    .line 185
    .line 186
    :goto_1
    invoke-virtual {v1}, Landroid/os/BaseBundle;->size()I

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    if-gt v5, v4, :cond_8

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_8
    new-instance v5, Ljava/util/TreeSet;

    .line 194
    .line 195
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    invoke-direct {v5, v6}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v5}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    const/4 v6, 0x0

    .line 207
    :cond_9
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    if-eqz v7, :cond_a

    .line 212
    .line 213
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    check-cast v7, Ljava/lang/String;

    .line 218
    .line 219
    add-int/lit8 v6, v6, 0x1

    .line 220
    .line 221
    if-le v6, v4, :cond_9

    .line 222
    .line 223
    invoke-virtual {v1, v7}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_a
    invoke-static {v9}, Lij3;->j(Lsq3;)V

    .line 228
    .line 229
    .line 230
    const/4 v7, 0x0

    .line 231
    const/4 v8, 0x0

    .line 232
    const/4 v4, 0x0

    .line 233
    const/16 v5, 0x1a

    .line 234
    .line 235
    const/4 v6, 0x0

    .line 236
    invoke-static/range {v3 .. v8}, Lup3;->P(Lac3;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 237
    .line 238
    .line 239
    invoke-static {v11}, Lij3;->l(Lhk3;)V

    .line 240
    .line 241
    .line 242
    iget-object v3, v11, Luh3;->V:Lsh3;

    .line 243
    .line 244
    const-string v4, "Too many default event parameters set. Discarding beyond event parameter limit"

    .line 245
    .line 246
    invoke-virtual {v3, v4}, Lsh3;->a(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    :goto_3
    iget-object v3, v0, Lij3;->e:Lki3;

    .line 250
    .line 251
    invoke-static {v3}, Lij3;->j(Lsq3;)V

    .line 252
    .line 253
    .line 254
    iget-object v3, v3, Lki3;->j0:Lra2;

    .line 255
    .line 256
    invoke-virtual {v3, v1}, Lra2;->y(Landroid/os/Bundle;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    if-eqz v2, :cond_b

    .line 264
    .line 265
    iget-object v2, v0, Lij3;->d:Lpd3;

    .line 266
    .line 267
    const/4 v3, 0x0

    .line 268
    sget-object v4, Lvg3;->W0:Lug3;

    .line 269
    .line 270
    invoke-virtual {v2, v3, v4}, Lpd3;->J(Ljava/lang/String;Lug3;)Z

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    if-eqz v2, :cond_c

    .line 275
    .line 276
    :cond_b
    invoke-virtual {v0}, Lij3;->o()Lpn3;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {v0, v1}, Lpn3;->E(Landroid/os/Bundle;)V

    .line 281
    .line 282
    .line 283
    :cond_c
    return-void

    .line 284
    :pswitch_0
    const-string v1, "app_id"

    .line 285
    .line 286
    invoke-virtual {v0}, Leg3;->y()V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0}, Lwg3;->A()V

    .line 290
    .line 291
    .line 292
    const-string v3, "name"

    .line 293
    .line 294
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    const-string v3, "origin"

    .line 299
    .line 300
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v12

    .line 304
    invoke-static {v8}, Lkb1;->k(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-static {v12}, Lkb1;->k(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    const-string v3, "value"

    .line 311
    .line 312
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    invoke-static {v4}, Lkb1;->n(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v0, Lij3;

    .line 322
    .line 323
    invoke-virtual {v0}, Lij3;->d()Z

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    if-nez v4, :cond_d

    .line 328
    .line 329
    iget-object v0, v0, Lij3;->f:Luh3;

    .line 330
    .line 331
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 332
    .line 333
    .line 334
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 335
    .line 336
    const-string v1, "Conditional property not set since app measurement is disabled"

    .line 337
    .line 338
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    goto/16 :goto_4

    .line 342
    .line 343
    :cond_d
    new-instance v4, Lcom/google/android/gms/measurement/internal/zzpk;

    .line 344
    .line 345
    const-string v5, "triggered_timestamp"

    .line 346
    .line 347
    invoke-virtual {v2, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 348
    .line 349
    .line 350
    move-result-wide v5

    .line 351
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v7

    .line 355
    move-object v9, v12

    .line 356
    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/measurement/internal/zzpk;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    :try_start_0
    iget-object v9, v0, Lij3;->w:Lup3;

    .line 360
    .line 361
    invoke-static {v9}, Lij3;->j(Lsq3;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    const-string v3, "triggered_event_name"

    .line 368
    .line 369
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v10

    .line 373
    const-string v3, "triggered_event_params"

    .line 374
    .line 375
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 376
    .line 377
    .line 378
    move-result-object v11

    .line 379
    const-wide/16 v13, 0x0

    .line 380
    .line 381
    const/4 v15, 0x1

    .line 382
    invoke-virtual/range {v9 .. v15}, Lup3;->b0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)Lcom/google/android/gms/measurement/internal/zzbg;

    .line 383
    .line 384
    .line 385
    move-result-object v20

    .line 386
    invoke-static {v9}, Lij3;->j(Lsq3;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    const-string v3, "timed_out_event_name"

    .line 393
    .line 394
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v10

    .line 398
    const-string v3, "timed_out_event_params"

    .line 399
    .line 400
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 401
    .line 402
    .line 403
    move-result-object v11

    .line 404
    const-wide/16 v13, 0x0

    .line 405
    .line 406
    const/4 v15, 0x1

    .line 407
    invoke-virtual/range {v9 .. v15}, Lup3;->b0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)Lcom/google/android/gms/measurement/internal/zzbg;

    .line 408
    .line 409
    .line 410
    move-result-object v17

    .line 411
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    const-string v3, "expired_event_name"

    .line 415
    .line 416
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v10

    .line 420
    const-string v3, "expired_event_params"

    .line 421
    .line 422
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 423
    .line 424
    .line 425
    move-result-object v11

    .line 426
    const-wide/16 v13, 0x0

    .line 427
    .line 428
    const/4 v15, 0x1

    .line 429
    invoke-virtual/range {v9 .. v15}, Lup3;->b0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)Lcom/google/android/gms/measurement/internal/zzbg;

    .line 430
    .line 431
    .line 432
    move-result-object v23
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 433
    new-instance v9, Lcom/google/android/gms/measurement/internal/zzah;

    .line 434
    .line 435
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v10

    .line 439
    const-string v1, "creation_timestamp"

    .line 440
    .line 441
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 442
    .line 443
    .line 444
    move-result-wide v13

    .line 445
    const-string v1, "trigger_event_name"

    .line 446
    .line 447
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v16

    .line 451
    const-string v1, "trigger_timeout"

    .line 452
    .line 453
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 454
    .line 455
    .line 456
    move-result-wide v18

    .line 457
    const-string v1, "time_to_live"

    .line 458
    .line 459
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 460
    .line 461
    .line 462
    move-result-wide v21

    .line 463
    const/4 v15, 0x0

    .line 464
    move-object v11, v12

    .line 465
    move-object v12, v4

    .line 466
    invoke-direct/range {v9 .. v23}, Lcom/google/android/gms/measurement/internal/zzah;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzpk;JZLjava/lang/String;Lcom/google/android/gms/measurement/internal/zzbg;JLcom/google/android/gms/measurement/internal/zzbg;JLcom/google/android/gms/measurement/internal/zzbg;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v0}, Lij3;->o()Lpn3;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-virtual {v0, v9}, Lpn3;->S(Lcom/google/android/gms/measurement/internal/zzah;)V

    .line 474
    .line 475
    .line 476
    :catch_0
    :goto_4
    return-void

    .line 477
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final Lqd3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# static fields
.field public static final b:Lqd3;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lqd3;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lqd3;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lqd3;->b:Lqd3;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lqd3;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Lqd3;->a:I

    .line 6
    .line 7
    const-class v2, Ljava/lang/Long;

    .line 8
    .line 9
    const/4 v3, 0x4

    .line 10
    const/4 v4, 0x3

    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    move-object v11, v7

    .line 23
    move-object v12, v11

    .line 24
    move-object/from16 v16, v12

    .line 25
    .line 26
    move-object/from16 v17, v16

    .line 27
    .line 28
    move-object/from16 v19, v17

    .line 29
    .line 30
    move v10, v8

    .line 31
    move v13, v10

    .line 32
    move v14, v13

    .line 33
    move v15, v14

    .line 34
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-ge v2, v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    int-to-char v3, v2

    .line 45
    packed-switch v3, :pswitch_data_1

    .line 46
    .line 47
    .line 48
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :pswitch_0
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v19

    .line 56
    goto :goto_0

    .line 57
    :pswitch_1
    sget-object v3, Lcom/google/android/gms/auth/api/signin/internal/GoogleSignInOptionsExtensionParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 58
    .line 59
    invoke-static {v1, v2, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    goto :goto_0

    .line 64
    :pswitch_2
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v17

    .line 68
    goto :goto_0

    .line 69
    :pswitch_3
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v16

    .line 73
    goto :goto_0

    .line 74
    :pswitch_4
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 75
    .line 76
    .line 77
    move-result v15

    .line 78
    goto :goto_0

    .line 79
    :pswitch_5
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 80
    .line 81
    .line 82
    move-result v14

    .line 83
    goto :goto_0

    .line 84
    :pswitch_6
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 85
    .line 86
    .line 87
    move-result v13

    .line 88
    goto :goto_0

    .line 89
    :pswitch_7
    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 90
    .line 91
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    move-object v12, v2

    .line 96
    check-cast v12, Landroid/accounts/Account;

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :pswitch_8
    sget-object v3, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 100
    .line 101
    invoke-static {v1, v2, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    goto :goto_0

    .line 106
    :pswitch_9
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    goto :goto_0

    .line 111
    :cond_0
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 112
    .line 113
    .line 114
    new-instance v9, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 115
    .line 116
    invoke-static {v7}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->E1(Ljava/util/ArrayList;)Ljava/util/HashMap;

    .line 117
    .line 118
    .line 119
    move-result-object v18

    .line 120
    invoke-direct/range {v9 .. v19}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;-><init>(ILjava/util/ArrayList;Landroid/accounts/Account;ZZZLjava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return-object v9

    .line 124
    :pswitch_a
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    move v2, v8

    .line 129
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-ge v3, v0, :cond_4

    .line 134
    .line 135
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    int-to-char v9, v3

    .line 140
    if-eq v9, v6, :cond_3

    .line 141
    .line 142
    if-eq v9, v5, :cond_2

    .line 143
    .line 144
    if-eq v9, v4, :cond_1

    .line 145
    .line 146
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_1
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    goto :goto_1

    .line 155
    :cond_2
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    goto :goto_1

    .line 160
    :cond_3
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    goto :goto_1

    .line 165
    :cond_4
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 166
    .line 167
    .line 168
    new-instance v0, Lcom/google/android/gms/common/server/converter/zac;

    .line 169
    .line 170
    invoke-direct {v0, v8, v7, v2}, Lcom/google/android/gms/common/server/converter/zac;-><init>(ILjava/lang/String;I)V

    .line 171
    .line 172
    .line 173
    return-object v0

    .line 174
    :pswitch_b
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    move-object v12, v7

    .line 179
    move-object v13, v12

    .line 180
    move v10, v8

    .line 181
    move v11, v10

    .line 182
    move v14, v11

    .line 183
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-ge v2, v0, :cond_a

    .line 188
    .line 189
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    int-to-char v7, v2

    .line 194
    if-eq v7, v6, :cond_9

    .line 195
    .line 196
    if-eq v7, v5, :cond_8

    .line 197
    .line 198
    if-eq v7, v4, :cond_7

    .line 199
    .line 200
    if-eq v7, v3, :cond_6

    .line 201
    .line 202
    const/4 v8, 0x5

    .line 203
    if-eq v7, v8, :cond_5

    .line 204
    .line 205
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 206
    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_5
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 210
    .line 211
    .line 212
    move-result v14

    .line 213
    goto :goto_2

    .line 214
    :cond_6
    invoke-static {v2, v1}, Lqj3;->G(ILandroid/os/Parcel;)Ljava/lang/Long;

    .line 215
    .line 216
    .line 217
    move-result-object v13

    .line 218
    goto :goto_2

    .line 219
    :cond_7
    invoke-static {v2, v1}, Lqj3;->G(ILandroid/os/Parcel;)Ljava/lang/Long;

    .line 220
    .line 221
    .line 222
    move-result-object v12

    .line 223
    goto :goto_2

    .line 224
    :cond_8
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 225
    .line 226
    .line 227
    move-result v11

    .line 228
    goto :goto_2

    .line 229
    :cond_9
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    goto :goto_2

    .line 234
    :cond_a
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 235
    .line 236
    .line 237
    new-instance v9, Lcom/google/android/gms/common/moduleinstall/ModuleInstallStatusUpdate;

    .line 238
    .line 239
    invoke-direct/range {v9 .. v14}, Lcom/google/android/gms/common/moduleinstall/ModuleInstallStatusUpdate;-><init>(IILjava/lang/Long;Ljava/lang/Long;I)V

    .line 240
    .line 241
    .line 242
    return-object v9

    .line 243
    :pswitch_c
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    if-ge v2, v0, :cond_d

    .line 252
    .line 253
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    int-to-char v3, v2

    .line 258
    if-eq v3, v6, :cond_c

    .line 259
    .line 260
    if-eq v3, v5, :cond_b

    .line 261
    .line 262
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 263
    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_b
    sget-object v3, Lcom/google/android/gms/common/server/converter/zac;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 267
    .line 268
    invoke-static {v1, v2, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    goto :goto_3

    .line 273
    :cond_c
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 274
    .line 275
    .line 276
    move-result v8

    .line 277
    goto :goto_3

    .line 278
    :cond_d
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 279
    .line 280
    .line 281
    new-instance v0, Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    .line 282
    .line 283
    invoke-direct {v0, v8, v7}, Lcom/google/android/gms/common/server/converter/StringToIntConverter;-><init>(ILjava/util/ArrayList;)V

    .line 284
    .line 285
    .line 286
    return-object v0

    .line 287
    :pswitch_d
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    move v2, v8

    .line 292
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    if-ge v3, v0, :cond_10

    .line 297
    .line 298
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    int-to-char v4, v3

    .line 303
    if-eq v4, v6, :cond_f

    .line 304
    .line 305
    if-eq v4, v5, :cond_e

    .line 306
    .line 307
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 308
    .line 309
    .line 310
    goto :goto_4

    .line 311
    :cond_e
    invoke-static {v3, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    goto :goto_4

    .line 316
    :cond_f
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 317
    .line 318
    .line 319
    move-result v8

    .line 320
    goto :goto_4

    .line 321
    :cond_10
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 322
    .line 323
    .line 324
    new-instance v0, Lcom/google/android/gms/common/moduleinstall/ModuleInstallResponse;

    .line 325
    .line 326
    invoke-direct {v0, v8, v2}, Lcom/google/android/gms/common/moduleinstall/ModuleInstallResponse;-><init>(IZ)V

    .line 327
    .line 328
    .line 329
    return-object v0

    .line 330
    :pswitch_e
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    move-object v2, v7

    .line 335
    move v9, v8

    .line 336
    move-object v8, v2

    .line 337
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 338
    .line 339
    .line 340
    move-result v10

    .line 341
    if-ge v10, v0, :cond_15

    .line 342
    .line 343
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 344
    .line 345
    .line 346
    move-result v10

    .line 347
    int-to-char v11, v10

    .line 348
    if-eq v11, v6, :cond_14

    .line 349
    .line 350
    if-eq v11, v5, :cond_13

    .line 351
    .line 352
    if-eq v11, v4, :cond_12

    .line 353
    .line 354
    if-eq v11, v3, :cond_11

    .line 355
    .line 356
    invoke-static {v10, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 357
    .line 358
    .line 359
    goto :goto_5

    .line 360
    :cond_11
    invoke-static {v10, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v8

    .line 364
    goto :goto_5

    .line 365
    :cond_12
    invoke-static {v10, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    goto :goto_5

    .line 370
    :cond_13
    invoke-static {v10, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 371
    .line 372
    .line 373
    move-result v9

    .line 374
    goto :goto_5

    .line 375
    :cond_14
    sget-object v7, Lcom/google/android/gms/common/Feature;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 376
    .line 377
    invoke-static {v1, v10, v7}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    goto :goto_5

    .line 382
    :cond_15
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 383
    .line 384
    .line 385
    new-instance v0, Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;

    .line 386
    .line 387
    invoke-direct {v0, v7, v9, v2, v8}, Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;-><init>(Ljava/util/ArrayList;ZLjava/lang/String;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    return-object v0

    .line 391
    :pswitch_f
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    const-wide/16 v2, 0x0

    .line 396
    .line 397
    move-wide/from16 v17, v2

    .line 398
    .line 399
    move-object v11, v7

    .line 400
    move-object v12, v11

    .line 401
    move-object v13, v12

    .line 402
    move-object v14, v13

    .line 403
    move-object v15, v14

    .line 404
    move-object/from16 v16, v15

    .line 405
    .line 406
    move-object/from16 v19, v16

    .line 407
    .line 408
    move-object/from16 v20, v19

    .line 409
    .line 410
    move-object/from16 v21, v20

    .line 411
    .line 412
    move-object/from16 v22, v21

    .line 413
    .line 414
    move v10, v8

    .line 415
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 416
    .line 417
    .line 418
    move-result v2

    .line 419
    if-ge v2, v0, :cond_16

    .line 420
    .line 421
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    int-to-char v3, v2

    .line 426
    packed-switch v3, :pswitch_data_2

    .line 427
    .line 428
    .line 429
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 430
    .line 431
    .line 432
    goto :goto_6

    .line 433
    :pswitch_10
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    move-object/from16 v22, v2

    .line 438
    .line 439
    goto :goto_6

    .line 440
    :pswitch_11
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v2

    .line 444
    move-object/from16 v21, v2

    .line 445
    .line 446
    goto :goto_6

    .line 447
    :pswitch_12
    sget-object v3, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 448
    .line 449
    invoke-static {v1, v2, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    move-object/from16 v20, v2

    .line 454
    .line 455
    goto :goto_6

    .line 456
    :pswitch_13
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    move-object/from16 v19, v2

    .line 461
    .line 462
    goto :goto_6

    .line 463
    :pswitch_14
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 464
    .line 465
    .line 466
    move-result-wide v2

    .line 467
    move-wide/from16 v17, v2

    .line 468
    .line 469
    goto :goto_6

    .line 470
    :pswitch_15
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    move-object/from16 v16, v2

    .line 475
    .line 476
    goto :goto_6

    .line 477
    :pswitch_16
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 478
    .line 479
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    check-cast v2, Landroid/net/Uri;

    .line 484
    .line 485
    move-object v15, v2

    .line 486
    goto :goto_6

    .line 487
    :pswitch_17
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    move-object v14, v2

    .line 492
    goto :goto_6

    .line 493
    :pswitch_18
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    move-object v13, v2

    .line 498
    goto :goto_6

    .line 499
    :pswitch_19
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    move-object v12, v2

    .line 504
    goto :goto_6

    .line 505
    :pswitch_1a
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    move-object v11, v2

    .line 510
    goto :goto_6

    .line 511
    :pswitch_1b
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 512
    .line 513
    .line 514
    move-result v2

    .line 515
    move v10, v2

    .line 516
    goto :goto_6

    .line 517
    :cond_16
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 518
    .line 519
    .line 520
    new-instance v9, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 521
    .line 522
    invoke-direct/range {v9 .. v22}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;JLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    return-object v9

    .line 526
    :pswitch_1c
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    move v2, v8

    .line 531
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 532
    .line 533
    .line 534
    move-result v3

    .line 535
    if-ge v3, v0, :cond_1a

    .line 536
    .line 537
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 538
    .line 539
    .line 540
    move-result v3

    .line 541
    int-to-char v9, v3

    .line 542
    if-eq v9, v6, :cond_19

    .line 543
    .line 544
    if-eq v9, v5, :cond_18

    .line 545
    .line 546
    if-eq v9, v4, :cond_17

    .line 547
    .line 548
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 549
    .line 550
    .line 551
    goto :goto_7

    .line 552
    :cond_17
    sget-object v7, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 553
    .line 554
    invoke-static {v1, v3, v7}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 555
    .line 556
    .line 557
    move-result-object v3

    .line 558
    move-object v7, v3

    .line 559
    check-cast v7, Landroid/content/Intent;

    .line 560
    .line 561
    goto :goto_7

    .line 562
    :cond_18
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 563
    .line 564
    .line 565
    move-result v2

    .line 566
    goto :goto_7

    .line 567
    :cond_19
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 568
    .line 569
    .line 570
    move-result v8

    .line 571
    goto :goto_7

    .line 572
    :cond_1a
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 573
    .line 574
    .line 575
    new-instance v0, Lcom/google/android/gms/signin/internal/zaa;

    .line 576
    .line 577
    invoke-direct {v0, v8, v2, v7}, Lcom/google/android/gms/signin/internal/zaa;-><init>(IILandroid/content/Intent;)V

    .line 578
    .line 579
    .line 580
    return-object v0

    .line 581
    :pswitch_1d
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 582
    .line 583
    .line 584
    move-result v0

    .line 585
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 586
    .line 587
    .line 588
    move-result v2

    .line 589
    if-ge v2, v0, :cond_1d

    .line 590
    .line 591
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 592
    .line 593
    .line 594
    move-result v2

    .line 595
    int-to-char v3, v2

    .line 596
    if-eq v3, v6, :cond_1c

    .line 597
    .line 598
    if-eq v3, v5, :cond_1b

    .line 599
    .line 600
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 601
    .line 602
    .line 603
    goto :goto_8

    .line 604
    :cond_1b
    sget-object v3, Lcom/google/android/gms/common/server/converter/StringToIntConverter;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 605
    .line 606
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    move-object v7, v2

    .line 611
    check-cast v7, Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    .line 612
    .line 613
    goto :goto_8

    .line 614
    :cond_1c
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 615
    .line 616
    .line 617
    move-result v8

    .line 618
    goto :goto_8

    .line 619
    :cond_1d
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 620
    .line 621
    .line 622
    new-instance v0, Lcom/google/android/gms/common/server/converter/zaa;

    .line 623
    .line 624
    invoke-direct {v0, v8, v7}, Lcom/google/android/gms/common/server/converter/zaa;-><init>(ILcom/google/android/gms/common/server/converter/StringToIntConverter;)V

    .line 625
    .line 626
    .line 627
    return-object v0

    .line 628
    :pswitch_1e
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 629
    .line 630
    .line 631
    move-result v0

    .line 632
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 633
    .line 634
    .line 635
    move-result v2

    .line 636
    if-ge v2, v0, :cond_1f

    .line 637
    .line 638
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 639
    .line 640
    .line 641
    move-result v2

    .line 642
    int-to-char v3, v2

    .line 643
    if-eq v3, v6, :cond_1e

    .line 644
    .line 645
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 646
    .line 647
    .line 648
    goto :goto_9

    .line 649
    :cond_1e
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 650
    .line 651
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 652
    .line 653
    .line 654
    move-result-object v2

    .line 655
    move-object v7, v2

    .line 656
    check-cast v7, Landroid/app/PendingIntent;

    .line 657
    .line 658
    goto :goto_9

    .line 659
    :cond_1f
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 660
    .line 661
    .line 662
    new-instance v0, Lcom/google/android/gms/common/moduleinstall/ModuleInstallIntentResponse;

    .line 663
    .line 664
    invoke-direct {v0, v7}, Lcom/google/android/gms/common/moduleinstall/ModuleInstallIntentResponse;-><init>(Landroid/app/PendingIntent;)V

    .line 665
    .line 666
    .line 667
    return-object v0

    .line 668
    :pswitch_1f
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 669
    .line 670
    .line 671
    move-result v0

    .line 672
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 673
    .line 674
    .line 675
    move-result v2

    .line 676
    if-ge v2, v0, :cond_22

    .line 677
    .line 678
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 679
    .line 680
    .line 681
    move-result v2

    .line 682
    int-to-char v3, v2

    .line 683
    if-eq v3, v6, :cond_21

    .line 684
    .line 685
    if-eq v3, v5, :cond_20

    .line 686
    .line 687
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 688
    .line 689
    .line 690
    goto :goto_a

    .line 691
    :cond_20
    sget-object v3, Lcom/google/android/gms/common/internal/MethodInvocation;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 692
    .line 693
    invoke-static {v1, v2, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 694
    .line 695
    .line 696
    move-result-object v7

    .line 697
    goto :goto_a

    .line 698
    :cond_21
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 699
    .line 700
    .line 701
    move-result v8

    .line 702
    goto :goto_a

    .line 703
    :cond_22
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 704
    .line 705
    .line 706
    new-instance v0, Lcom/google/android/gms/common/internal/TelemetryData;

    .line 707
    .line 708
    invoke-direct {v0, v8, v7}, Lcom/google/android/gms/common/internal/TelemetryData;-><init>(ILjava/util/List;)V

    .line 709
    .line 710
    .line 711
    return-object v0

    .line 712
    :pswitch_20
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 713
    .line 714
    .line 715
    move-result v0

    .line 716
    move v2, v8

    .line 717
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 718
    .line 719
    .line 720
    move-result v3

    .line 721
    if-ge v3, v0, :cond_26

    .line 722
    .line 723
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 724
    .line 725
    .line 726
    move-result v3

    .line 727
    int-to-char v9, v3

    .line 728
    if-eq v9, v6, :cond_25

    .line 729
    .line 730
    if-eq v9, v5, :cond_24

    .line 731
    .line 732
    if-eq v9, v4, :cond_23

    .line 733
    .line 734
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 735
    .line 736
    .line 737
    goto :goto_b

    .line 738
    :cond_23
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 739
    .line 740
    .line 741
    move-result v2

    .line 742
    goto :goto_b

    .line 743
    :cond_24
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object v7

    .line 747
    goto :goto_b

    .line 748
    :cond_25
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 749
    .line 750
    .line 751
    move-result v8

    .line 752
    goto :goto_b

    .line 753
    :cond_26
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 754
    .line 755
    .line 756
    new-instance v0, Lcom/google/android/gms/common/server/FavaDiagnosticsEntity;

    .line 757
    .line 758
    invoke-direct {v0, v8, v7, v2}, Lcom/google/android/gms/common/server/FavaDiagnosticsEntity;-><init>(ILjava/lang/String;I)V

    .line 759
    .line 760
    .line 761
    return-object v0

    .line 762
    :pswitch_21
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 763
    .line 764
    .line 765
    move-result v0

    .line 766
    move v2, v8

    .line 767
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 768
    .line 769
    .line 770
    move-result v3

    .line 771
    if-ge v3, v0, :cond_29

    .line 772
    .line 773
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 774
    .line 775
    .line 776
    move-result v3

    .line 777
    int-to-char v4, v3

    .line 778
    if-eq v4, v6, :cond_28

    .line 779
    .line 780
    if-eq v4, v5, :cond_27

    .line 781
    .line 782
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 783
    .line 784
    .line 785
    goto :goto_c

    .line 786
    :cond_27
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 787
    .line 788
    .line 789
    move-result v2

    .line 790
    goto :goto_c

    .line 791
    :cond_28
    invoke-static {v3, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 792
    .line 793
    .line 794
    move-result v8

    .line 795
    goto :goto_c

    .line 796
    :cond_29
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 797
    .line 798
    .line 799
    new-instance v0, Lcom/google/android/gms/common/moduleinstall/ModuleAvailabilityResponse;

    .line 800
    .line 801
    invoke-direct {v0, v8, v2}, Lcom/google/android/gms/common/moduleinstall/ModuleAvailabilityResponse;-><init>(ZI)V

    .line 802
    .line 803
    .line 804
    return-object v0

    .line 805
    :pswitch_22
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 806
    .line 807
    .line 808
    move-result v0

    .line 809
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 810
    .line 811
    .line 812
    move-result v2

    .line 813
    if-ge v2, v0, :cond_2c

    .line 814
    .line 815
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 816
    .line 817
    .line 818
    move-result v2

    .line 819
    int-to-char v3, v2

    .line 820
    if-eq v3, v6, :cond_2b

    .line 821
    .line 822
    if-eq v3, v5, :cond_2a

    .line 823
    .line 824
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 825
    .line 826
    .line 827
    goto :goto_d

    .line 828
    :cond_2a
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v7

    .line 832
    goto :goto_d

    .line 833
    :cond_2b
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 834
    .line 835
    .line 836
    move-result v8

    .line 837
    goto :goto_d

    .line 838
    :cond_2c
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 839
    .line 840
    .line 841
    new-instance v0, Lcom/google/android/gms/common/internal/ClientIdentity;

    .line 842
    .line 843
    invoke-direct {v0, v8, v7}, Lcom/google/android/gms/common/internal/ClientIdentity;-><init>(ILjava/lang/String;)V

    .line 844
    .line 845
    .line 846
    return-object v0

    .line 847
    :pswitch_23
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 848
    .line 849
    .line 850
    move-result v0

    .line 851
    move v2, v8

    .line 852
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 853
    .line 854
    .line 855
    move-result v3

    .line 856
    if-ge v3, v0, :cond_30

    .line 857
    .line 858
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 859
    .line 860
    .line 861
    move-result v3

    .line 862
    int-to-char v9, v3

    .line 863
    if-eq v9, v6, :cond_2f

    .line 864
    .line 865
    if-eq v9, v5, :cond_2e

    .line 866
    .line 867
    if-eq v9, v4, :cond_2d

    .line 868
    .line 869
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 870
    .line 871
    .line 872
    goto :goto_e

    .line 873
    :cond_2d
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 874
    .line 875
    .line 876
    move-result v2

    .line 877
    goto :goto_e

    .line 878
    :cond_2e
    sget-object v7, Landroid/os/ParcelFileDescriptor;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 879
    .line 880
    invoke-static {v1, v3, v7}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 881
    .line 882
    .line 883
    move-result-object v3

    .line 884
    move-object v7, v3

    .line 885
    check-cast v7, Landroid/os/ParcelFileDescriptor;

    .line 886
    .line 887
    goto :goto_e

    .line 888
    :cond_2f
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 889
    .line 890
    .line 891
    move-result v8

    .line 892
    goto :goto_e

    .line 893
    :cond_30
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 894
    .line 895
    .line 896
    new-instance v0, Lcom/google/android/gms/common/data/BitmapTeleporter;

    .line 897
    .line 898
    invoke-direct {v0, v8, v7, v2}, Lcom/google/android/gms/common/data/BitmapTeleporter;-><init>(ILandroid/os/ParcelFileDescriptor;I)V

    .line 899
    .line 900
    .line 901
    return-object v0

    .line 902
    :pswitch_24
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 903
    .line 904
    .line 905
    move-result v0

    .line 906
    move v2, v8

    .line 907
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 908
    .line 909
    .line 910
    move-result v3

    .line 911
    if-ge v3, v0, :cond_34

    .line 912
    .line 913
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 914
    .line 915
    .line 916
    move-result v3

    .line 917
    int-to-char v9, v3

    .line 918
    if-eq v9, v6, :cond_33

    .line 919
    .line 920
    if-eq v9, v5, :cond_32

    .line 921
    .line 922
    if-eq v9, v4, :cond_31

    .line 923
    .line 924
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 925
    .line 926
    .line 927
    goto :goto_f

    .line 928
    :cond_31
    invoke-static {v3, v1}, Lqj3;->f(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 929
    .line 930
    .line 931
    move-result-object v7

    .line 932
    goto :goto_f

    .line 933
    :cond_32
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 934
    .line 935
    .line 936
    move-result v2

    .line 937
    goto :goto_f

    .line 938
    :cond_33
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 939
    .line 940
    .line 941
    move-result v8

    .line 942
    goto :goto_f

    .line 943
    :cond_34
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 944
    .line 945
    .line 946
    new-instance v0, Lcom/google/android/gms/auth/api/signin/internal/GoogleSignInOptionsExtensionParcelable;

    .line 947
    .line 948
    invoke-direct {v0, v8, v2, v7}, Lcom/google/android/gms/auth/api/signin/internal/GoogleSignInOptionsExtensionParcelable;-><init>(IILandroid/os/Bundle;)V

    .line 949
    .line 950
    .line 951
    return-object v0

    .line 952
    :pswitch_25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 953
    .line 954
    .line 955
    new-instance v0, Lcom/google/firebase/Timestamp;

    .line 956
    .line 957
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 958
    .line 959
    .line 960
    move-result-wide v2

    .line 961
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 962
    .line 963
    .line 964
    move-result v1

    .line 965
    invoke-direct {v0, v1, v2, v3}, Lcom/google/firebase/Timestamp;-><init>(IJ)V

    .line 966
    .line 967
    .line 968
    return-object v0

    .line 969
    :pswitch_26
    new-instance v0, Lcom/google/android/material/datepicker/SingleDateSelector;

    .line 970
    .line 971
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 975
    .line 976
    .line 977
    move-result-object v2

    .line 978
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    move-result-object v1

    .line 982
    check-cast v1, Ljava/lang/Long;

    .line 983
    .line 984
    iput-object v1, v0, Lcom/google/android/material/datepicker/SingleDateSelector;->a:Ljava/lang/Long;

    .line 985
    .line 986
    return-object v0

    .line 987
    :pswitch_27
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 988
    .line 989
    .line 990
    move-result v0

    .line 991
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 992
    .line 993
    .line 994
    move-result v2

    .line 995
    if-ge v2, v0, :cond_36

    .line 996
    .line 997
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 998
    .line 999
    .line 1000
    move-result v2

    .line 1001
    int-to-char v3, v2

    .line 1002
    if-eq v3, v5, :cond_35

    .line 1003
    .line 1004
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1005
    .line 1006
    .line 1007
    goto :goto_10

    .line 1008
    :cond_35
    invoke-static {v2, v1}, Lqj3;->f(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v2

    .line 1012
    move-object v7, v2

    .line 1013
    goto :goto_10

    .line 1014
    :cond_36
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1015
    .line 1016
    .line 1017
    new-instance v0, Lcom/google/firebase/messaging/RemoteMessage;

    .line 1018
    .line 1019
    invoke-direct {v0, v7}, Lcom/google/firebase/messaging/RemoteMessage;-><init>(Landroid/os/Bundle;)V

    .line 1020
    .line 1021
    .line 1022
    return-object v0

    .line 1023
    :pswitch_28
    new-instance v0, Lcom/google/android/material/datepicker/RangeDateSelector;

    .line 1024
    .line 1025
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1026
    .line 1027
    .line 1028
    iput-object v7, v0, Lcom/google/android/material/datepicker/RangeDateSelector;->b:Ljava/lang/Long;

    .line 1029
    .line 1030
    iput-object v7, v0, Lcom/google/android/material/datepicker/RangeDateSelector;->c:Ljava/lang/Long;

    .line 1031
    .line 1032
    iput-object v7, v0, Lcom/google/android/material/datepicker/RangeDateSelector;->d:Ljava/lang/Long;

    .line 1033
    .line 1034
    iput-object v7, v0, Lcom/google/android/material/datepicker/RangeDateSelector;->e:Ljava/lang/Long;

    .line 1035
    .line 1036
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v3

    .line 1040
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v3

    .line 1044
    check-cast v3, Ljava/lang/Long;

    .line 1045
    .line 1046
    iput-object v3, v0, Lcom/google/android/material/datepicker/RangeDateSelector;->b:Ljava/lang/Long;

    .line 1047
    .line 1048
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v2

    .line 1052
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v1

    .line 1056
    check-cast v1, Ljava/lang/Long;

    .line 1057
    .line 1058
    iput-object v1, v0, Lcom/google/android/material/datepicker/RangeDateSelector;->c:Ljava/lang/Long;

    .line 1059
    .line 1060
    return-object v0

    .line 1061
    :pswitch_29
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1062
    .line 1063
    .line 1064
    move-result v0

    .line 1065
    new-instance v2, Lcom/google/android/material/internal/ParcelableSparseIntArray;

    .line 1066
    .line 1067
    invoke-direct {v2, v0}, Landroid/util/SparseIntArray;-><init>(I)V

    .line 1068
    .line 1069
    .line 1070
    new-array v3, v0, [I

    .line 1071
    .line 1072
    new-array v4, v0, [I

    .line 1073
    .line 1074
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readIntArray([I)V

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readIntArray([I)V

    .line 1078
    .line 1079
    .line 1080
    :goto_11
    if-ge v8, v0, :cond_37

    .line 1081
    .line 1082
    aget v1, v3, v8

    .line 1083
    .line 1084
    aget v5, v4, v8

    .line 1085
    .line 1086
    invoke-virtual {v2, v1, v5}, Landroid/util/SparseIntArray;->put(II)V

    .line 1087
    .line 1088
    .line 1089
    add-int/lit8 v8, v8, 0x1

    .line 1090
    .line 1091
    goto :goto_11

    .line 1092
    :cond_37
    return-object v2

    .line 1093
    :pswitch_2a
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1094
    .line 1095
    .line 1096
    move-result v0

    .line 1097
    new-instance v2, Lcom/google/android/material/internal/ParcelableSparseBooleanArray;

    .line 1098
    .line 1099
    invoke-direct {v2, v0}, Landroid/util/SparseBooleanArray;-><init>(I)V

    .line 1100
    .line 1101
    .line 1102
    new-array v3, v0, [I

    .line 1103
    .line 1104
    new-array v4, v0, [Z

    .line 1105
    .line 1106
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readIntArray([I)V

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readBooleanArray([Z)V

    .line 1110
    .line 1111
    .line 1112
    :goto_12
    if-ge v8, v0, :cond_38

    .line 1113
    .line 1114
    aget v1, v3, v8

    .line 1115
    .line 1116
    aget-boolean v5, v4, v8

    .line 1117
    .line 1118
    invoke-virtual {v2, v1, v5}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 1119
    .line 1120
    .line 1121
    add-int/lit8 v8, v8, 0x1

    .line 1122
    .line 1123
    goto :goto_12

    .line 1124
    :cond_38
    return-object v2

    .line 1125
    :pswitch_2b
    new-instance v0, Landroidx/versionedparcelable/ParcelImpl;

    .line 1126
    .line 1127
    invoke-direct {v0, v1}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    .line 1128
    .line 1129
    .line 1130
    return-object v0

    .line 1131
    :pswitch_2c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1132
    .line 1133
    .line 1134
    new-instance v0, Landroidx/activity/result/IntentSenderRequest;

    .line 1135
    .line 1136
    const-class v2, Landroid/content/IntentSender;

    .line 1137
    .line 1138
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v2

    .line 1142
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v2

    .line 1146
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1147
    .line 1148
    .line 1149
    check-cast v2, Landroid/content/IntentSender;

    .line 1150
    .line 1151
    const-class v3, Landroid/content/Intent;

    .line 1152
    .line 1153
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v3

    .line 1157
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v3

    .line 1161
    check-cast v3, Landroid/content/Intent;

    .line 1162
    .line 1163
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1164
    .line 1165
    .line 1166
    move-result v4

    .line 1167
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1168
    .line 1169
    .line 1170
    move-result v1

    .line 1171
    invoke-direct {v0, v2, v3, v4, v1}, Landroidx/activity/result/IntentSenderRequest;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 1172
    .line 1173
    .line 1174
    return-object v0

    .line 1175
    :pswitch_2d
    new-instance v0, Lcom/google/android/material/datepicker/DateValidatorPointForward;

    .line 1176
    .line 1177
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1178
    .line 1179
    .line 1180
    move-result-wide v1

    .line 1181
    invoke-direct {v0, v1, v2}, Lcom/google/android/material/datepicker/DateValidatorPointForward;-><init>(J)V

    .line 1182
    .line 1183
    .line 1184
    return-object v0

    .line 1185
    :pswitch_2e
    new-instance v0, Lcom/google/android/material/datepicker/DateValidatorPointBackward;

    .line 1186
    .line 1187
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1188
    .line 1189
    .line 1190
    move-result-wide v1

    .line 1191
    invoke-direct {v0, v1, v2}, Lcom/google/android/material/datepicker/DateValidatorPointBackward;-><init>(J)V

    .line 1192
    .line 1193
    .line 1194
    return-object v0

    .line 1195
    :pswitch_2f
    new-instance v0, Lcom/google/android/material/badge/BadgeState$State;

    .line 1196
    .line 1197
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1198
    .line 1199
    .line 1200
    const/16 v2, 0xff

    .line 1201
    .line 1202
    iput v2, v0, Lcom/google/android/material/badge/BadgeState$State;->d:I

    .line 1203
    .line 1204
    const/4 v2, -0x2

    .line 1205
    iput v2, v0, Lcom/google/android/material/badge/BadgeState$State;->e:I

    .line 1206
    .line 1207
    iput v2, v0, Lcom/google/android/material/badge/BadgeState$State;->f:I

    .line 1208
    .line 1209
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1210
    .line 1211
    iput-object v2, v0, Lcom/google/android/material/badge/BadgeState$State;->W:Ljava/lang/Boolean;

    .line 1212
    .line 1213
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1214
    .line 1215
    .line 1216
    move-result v2

    .line 1217
    iput v2, v0, Lcom/google/android/material/badge/BadgeState$State;->a:I

    .line 1218
    .line 1219
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v2

    .line 1223
    check-cast v2, Ljava/lang/Integer;

    .line 1224
    .line 1225
    iput-object v2, v0, Lcom/google/android/material/badge/BadgeState$State;->b:Ljava/lang/Integer;

    .line 1226
    .line 1227
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v2

    .line 1231
    check-cast v2, Ljava/lang/Integer;

    .line 1232
    .line 1233
    iput-object v2, v0, Lcom/google/android/material/badge/BadgeState$State;->c:Ljava/lang/Integer;

    .line 1234
    .line 1235
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1236
    .line 1237
    .line 1238
    move-result v2

    .line 1239
    iput v2, v0, Lcom/google/android/material/badge/BadgeState$State;->d:I

    .line 1240
    .line 1241
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1242
    .line 1243
    .line 1244
    move-result v2

    .line 1245
    iput v2, v0, Lcom/google/android/material/badge/BadgeState$State;->e:I

    .line 1246
    .line 1247
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1248
    .line 1249
    .line 1250
    move-result v2

    .line 1251
    iput v2, v0, Lcom/google/android/material/badge/BadgeState$State;->f:I

    .line 1252
    .line 1253
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v2

    .line 1257
    iput-object v2, v0, Lcom/google/android/material/badge/BadgeState$State;->v:Ljava/lang/CharSequence;

    .line 1258
    .line 1259
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1260
    .line 1261
    .line 1262
    move-result v2

    .line 1263
    iput v2, v0, Lcom/google/android/material/badge/BadgeState$State;->w:I

    .line 1264
    .line 1265
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v2

    .line 1269
    check-cast v2, Ljava/lang/Integer;

    .line 1270
    .line 1271
    iput-object v2, v0, Lcom/google/android/material/badge/BadgeState$State;->V:Ljava/lang/Integer;

    .line 1272
    .line 1273
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v2

    .line 1277
    check-cast v2, Ljava/lang/Integer;

    .line 1278
    .line 1279
    iput-object v2, v0, Lcom/google/android/material/badge/BadgeState$State;->X:Ljava/lang/Integer;

    .line 1280
    .line 1281
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v2

    .line 1285
    check-cast v2, Ljava/lang/Integer;

    .line 1286
    .line 1287
    iput-object v2, v0, Lcom/google/android/material/badge/BadgeState$State;->Y:Ljava/lang/Integer;

    .line 1288
    .line 1289
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v2

    .line 1293
    check-cast v2, Ljava/lang/Integer;

    .line 1294
    .line 1295
    iput-object v2, v0, Lcom/google/android/material/badge/BadgeState$State;->Z:Ljava/lang/Integer;

    .line 1296
    .line 1297
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v2

    .line 1301
    check-cast v2, Ljava/lang/Integer;

    .line 1302
    .line 1303
    iput-object v2, v0, Lcom/google/android/material/badge/BadgeState$State;->a0:Ljava/lang/Integer;

    .line 1304
    .line 1305
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v2

    .line 1309
    check-cast v2, Ljava/lang/Integer;

    .line 1310
    .line 1311
    iput-object v2, v0, Lcom/google/android/material/badge/BadgeState$State;->b0:Ljava/lang/Integer;

    .line 1312
    .line 1313
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v2

    .line 1317
    check-cast v2, Ljava/lang/Integer;

    .line 1318
    .line 1319
    iput-object v2, v0, Lcom/google/android/material/badge/BadgeState$State;->c0:Ljava/lang/Integer;

    .line 1320
    .line 1321
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v2

    .line 1325
    check-cast v2, Ljava/lang/Boolean;

    .line 1326
    .line 1327
    iput-object v2, v0, Lcom/google/android/material/badge/BadgeState$State;->W:Ljava/lang/Boolean;

    .line 1328
    .line 1329
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v1

    .line 1333
    check-cast v1, Ljava/util/Locale;

    .line 1334
    .line 1335
    iput-object v1, v0, Lcom/google/android/material/badge/BadgeState$State;->i:Ljava/util/Locale;

    .line 1336
    .line 1337
    return-object v0

    .line 1338
    :pswitch_30
    new-instance v0, Landroidx/activity/result/ActivityResult;

    .line 1339
    .line 1340
    invoke-direct {v0, v1}, Landroidx/activity/result/ActivityResult;-><init>(Landroid/os/Parcel;)V

    .line 1341
    .line 1342
    .line 1343
    return-object v0

    .line 1344
    :pswitch_31
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1345
    .line 1346
    .line 1347
    move-result v0

    .line 1348
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1349
    .line 1350
    .line 1351
    move-result v2

    .line 1352
    const v3, -0xc2a5d3a

    .line 1353
    .line 1354
    .line 1355
    if-ne v2, v3, :cond_3c

    .line 1356
    .line 1357
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1358
    .line 1359
    .line 1360
    move-result v0

    .line 1361
    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1362
    .line 1363
    .line 1364
    move-result v2

    .line 1365
    if-ge v2, v0, :cond_3b

    .line 1366
    .line 1367
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1368
    .line 1369
    .line 1370
    move-result v2

    .line 1371
    int-to-char v3, v2

    .line 1372
    if-eq v3, v6, :cond_3a

    .line 1373
    .line 1374
    if-eq v3, v5, :cond_39

    .line 1375
    .line 1376
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1377
    .line 1378
    .line 1379
    goto :goto_13

    .line 1380
    :cond_39
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1381
    .line 1382
    .line 1383
    move-result v8

    .line 1384
    goto :goto_13

    .line 1385
    :cond_3a
    sget-object v3, Lcom/google/android/gms/common/api/ComplianceOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1386
    .line 1387
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v2

    .line 1391
    move-object v7, v2

    .line 1392
    check-cast v7, Lcom/google/android/gms/common/api/ComplianceOptions;

    .line 1393
    .line 1394
    goto :goto_13

    .line 1395
    :cond_3b
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1396
    .line 1397
    .line 1398
    new-instance v0, Lcom/google/android/gms/common/api/ApiMetadata;

    .line 1399
    .line 1400
    invoke-direct {v0, v7, v8}, Lcom/google/android/gms/common/api/ApiMetadata;-><init>(Lcom/google/android/gms/common/api/ComplianceOptions;Z)V

    .line 1401
    .line 1402
    .line 1403
    goto :goto_14

    .line 1404
    :cond_3c
    add-int/lit8 v0, v0, -0x4

    .line 1405
    .line 1406
    invoke-virtual {v1, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1407
    .line 1408
    .line 1409
    sget-object v0, Lcom/google/android/gms/common/api/ApiMetadata;->d:Lcom/google/android/gms/common/api/ApiMetadata;

    .line 1410
    .line 1411
    :goto_14
    return-object v0

    .line 1412
    :pswitch_32
    new-instance v0, Lcom/google/android/libraries/play/games/internal/zzam;

    .line 1413
    .line 1414
    const-class v2, Lqd3;

    .line 1415
    .line 1416
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v2

    .line 1420
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v1

    .line 1424
    invoke-direct {v0, v1}, Lcom/google/android/libraries/play/games/internal/zzam;-><init>(Landroid/os/Bundle;)V

    .line 1425
    .line 1426
    .line 1427
    return-object v0

    .line 1428
    nop

    .line 1429
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lqd3;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lcom/google/android/gms/common/server/converter/zac;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lcom/google/android/gms/common/moduleinstall/ModuleInstallStatusUpdate;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lcom/google/android/gms/common/moduleinstall/ModuleInstallResponse;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lcom/google/android/gms/signin/internal/zaa;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lcom/google/android/gms/common/server/converter/zaa;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lcom/google/android/gms/common/moduleinstall/ModuleInstallIntentResponse;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lcom/google/android/gms/common/internal/TelemetryData;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lcom/google/android/gms/common/server/FavaDiagnosticsEntity;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lcom/google/android/gms/common/moduleinstall/ModuleAvailabilityResponse;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lcom/google/android/gms/common/internal/ClientIdentity;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lcom/google/android/gms/common/data/BitmapTeleporter;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lcom/google/android/gms/auth/api/signin/internal/GoogleSignInOptionsExtensionParcelable;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lcom/google/firebase/Timestamp;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lcom/google/android/material/datepicker/SingleDateSelector;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lcom/google/firebase/messaging/RemoteMessage;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lcom/google/android/material/datepicker/RangeDateSelector;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lcom/google/android/material/internal/ParcelableSparseIntArray;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lcom/google/android/material/internal/ParcelableSparseBooleanArray;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Landroidx/versionedparcelable/ParcelImpl;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Landroidx/activity/result/IntentSenderRequest;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lcom/google/android/material/datepicker/DateValidatorPointForward;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lcom/google/android/material/datepicker/DateValidatorPointBackward;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lcom/google/android/material/badge/BadgeState$State;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Landroidx/activity/result/ActivityResult;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lcom/google/android/gms/common/api/ApiMetadata;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lcom/google/android/libraries/play/games/internal/zzam;

    .line 94
    .line 95
    return-object p0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

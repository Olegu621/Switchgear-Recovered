.class public final Ltf3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ltf3;->a:I

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
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Ltf3;->a:I

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    const/4 v4, 0x5

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x4

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x3

    .line 14
    const/4 v9, 0x2

    .line 15
    const/4 v10, 0x0

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v5, -0x1

    .line 24
    move-wide v13, v2

    .line 25
    move-wide v15, v13

    .line 26
    move/from16 v17, v5

    .line 27
    .line 28
    move-object v12, v10

    .line 29
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-ge v2, v0, :cond_4

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    int-to-char v3, v2

    .line 40
    if-eq v3, v9, :cond_3

    .line 41
    .line 42
    if-eq v3, v8, :cond_2

    .line 43
    .line 44
    if-eq v3, v6, :cond_1

    .line 45
    .line 46
    if-eq v3, v4, :cond_0

    .line 47
    .line 48
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 53
    .line 54
    .line 55
    move-result v17

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 58
    .line 59
    .line 60
    move-result-wide v15

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v13

    .line 66
    goto :goto_0

    .line 67
    :cond_3
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v12

    .line 71
    goto :goto_0

    .line 72
    :cond_4
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 73
    .line 74
    .line 75
    new-instance v11, Lcom/google/android/gms/drive/DriveId;

    .line 76
    .line 77
    invoke-direct/range {v11 .. v17}, Lcom/google/android/gms/drive/DriveId;-><init>(Ljava/lang/String;JJI)V

    .line 78
    .line 79
    .line 80
    return-object v11

    .line 81
    :pswitch_0
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    move-object v2, v10

    .line 86
    move-object v3, v2

    .line 87
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-ge v4, v0, :cond_9

    .line 92
    .line 93
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    int-to-char v11, v4

    .line 98
    if-eq v11, v5, :cond_8

    .line 99
    .line 100
    if-eq v11, v9, :cond_7

    .line 101
    .line 102
    if-eq v11, v8, :cond_6

    .line 103
    .line 104
    if-eq v11, v6, :cond_5

    .line 105
    .line 106
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    sget-object v3, Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 111
    .line 112
    invoke-static {v1, v4, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    check-cast v3, Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_6
    invoke-static {v4, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    goto :goto_1

    .line 124
    :cond_7
    sget-object v2, Lcom/google/android/gms/common/Feature;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 125
    .line 126
    invoke-static {v1, v4, v2}, Lqj3;->m(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    check-cast v2, [Lcom/google/android/gms/common/Feature;

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_8
    invoke-static {v4, v1}, Lqj3;->f(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    goto :goto_1

    .line 138
    :cond_9
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 139
    .line 140
    .line 141
    new-instance v0, Lcom/google/android/gms/common/internal/zzj;

    .line 142
    .line 143
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 144
    .line 145
    .line 146
    iput-object v10, v0, Lcom/google/android/gms/common/internal/zzj;->a:Landroid/os/Bundle;

    .line 147
    .line 148
    iput-object v2, v0, Lcom/google/android/gms/common/internal/zzj;->b:[Lcom/google/android/gms/common/Feature;

    .line 149
    .line 150
    iput v7, v0, Lcom/google/android/gms/common/internal/zzj;->c:I

    .line 151
    .line 152
    iput-object v3, v0, Lcom/google/android/gms/common/internal/zzj;->d:Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;

    .line 153
    .line 154
    return-object v0

    .line 155
    :pswitch_1
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    move-object v2, v10

    .line 160
    move-object v3, v2

    .line 161
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-ge v4, v0, :cond_d

    .line 166
    .line 167
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    int-to-char v5, v4

    .line 172
    if-eq v5, v9, :cond_c

    .line 173
    .line 174
    if-eq v5, v8, :cond_b

    .line 175
    .line 176
    if-eq v5, v6, :cond_a

    .line 177
    .line 178
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_a
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    goto :goto_2

    .line 187
    :cond_b
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    goto :goto_2

    .line 192
    :cond_c
    sget-object v5, Lcom/google/android/gms/fido/u2f/api/common/KeyHandle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 193
    .line 194
    invoke-static {v1, v4, v5}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    move-object v10, v4

    .line 199
    check-cast v10, Lcom/google/android/gms/fido/u2f/api/common/KeyHandle;

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_d
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 203
    .line 204
    .line 205
    new-instance v0, Lcom/google/android/gms/fido/u2f/api/common/RegisteredKey;

    .line 206
    .line 207
    invoke-direct {v0, v10, v2, v3}, Lcom/google/android/gms/fido/u2f/api/common/RegisteredKey;-><init>(Lcom/google/android/gms/fido/u2f/api/common/KeyHandle;Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    return-object v0

    .line 211
    :pswitch_2
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    move-object v2, v10

    .line 216
    move-object v3, v2

    .line 217
    move-object v5, v3

    .line 218
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    if-ge v7, v0, :cond_12

    .line 223
    .line 224
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    int-to-char v11, v7

    .line 229
    if-eq v11, v9, :cond_11

    .line 230
    .line 231
    if-eq v11, v8, :cond_10

    .line 232
    .line 233
    if-eq v11, v6, :cond_f

    .line 234
    .line 235
    if-eq v11, v4, :cond_e

    .line 236
    .line 237
    invoke-static {v7, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 238
    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_e
    invoke-static {v7, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    goto :goto_3

    .line 246
    :cond_f
    invoke-static {v7, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    goto :goto_3

    .line 251
    :cond_10
    invoke-static {v7, v1}, Lqj3;->z(ILandroid/os/Parcel;)Ljava/lang/Boolean;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    goto :goto_3

    .line 256
    :cond_11
    invoke-static {v7, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v10

    .line 260
    goto :goto_3

    .line 261
    :cond_12
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 262
    .line 263
    .line 264
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorSelectionCriteria;

    .line 265
    .line 266
    invoke-direct {v0, v10, v2, v3, v5}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorSelectionCriteria;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    return-object v0

    .line 270
    :pswitch_3
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    if-ge v2, v0, :cond_14

    .line 279
    .line 280
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    int-to-char v3, v2

    .line 285
    if-eq v3, v9, :cond_13

    .line 286
    .line 287
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 288
    .line 289
    .line 290
    goto :goto_4

    .line 291
    :cond_13
    invoke-static {v2, v1}, Lqj3;->f(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 292
    .line 293
    .line 294
    move-result-object v10

    .line 295
    goto :goto_4

    .line 296
    :cond_14
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 297
    .line 298
    .line 299
    new-instance v0, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .line 300
    .line 301
    invoke-direct {v0, v10}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;-><init>(Landroid/os/Bundle;)V

    .line 302
    .line 303
    .line 304
    return-object v0

    .line 305
    :pswitch_4
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    move-object v2, v10

    .line 310
    move-object v3, v2

    .line 311
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    if-ge v4, v0, :cond_18

    .line 316
    .line 317
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    int-to-char v5, v4

    .line 322
    if-eq v5, v9, :cond_17

    .line 323
    .line 324
    if-eq v5, v8, :cond_16

    .line 325
    .line 326
    if-eq v5, v6, :cond_15

    .line 327
    .line 328
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 329
    .line 330
    .line 331
    goto :goto_5

    .line 332
    :cond_15
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    goto :goto_5

    .line 337
    :cond_16
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    goto :goto_5

    .line 342
    :cond_17
    invoke-static {v4, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 343
    .line 344
    .line 345
    move-result-object v10

    .line 346
    goto :goto_5

    .line 347
    :cond_18
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 348
    .line 349
    .line 350
    new-instance v0, Lcom/google/android/gms/fido/u2f/api/common/RegisterResponseData;

    .line 351
    .line 352
    invoke-direct {v0, v10, v2, v3}, Lcom/google/android/gms/fido/u2f/api/common/RegisterResponseData;-><init>([BLjava/lang/String;Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    return-object v0

    .line 356
    :pswitch_5
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    if-ge v2, v0, :cond_1b

    .line 365
    .line 366
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    int-to-char v3, v2

    .line 371
    if-eq v3, v9, :cond_1a

    .line 372
    .line 373
    if-eq v3, v8, :cond_19

    .line 374
    .line 375
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 376
    .line 377
    .line 378
    goto :goto_6

    .line 379
    :cond_19
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v10

    .line 383
    goto :goto_6

    .line 384
    :cond_1a
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 385
    .line 386
    .line 387
    move-result v7

    .line 388
    goto :goto_6

    .line 389
    :cond_1b
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 390
    .line 391
    .line 392
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;

    .line 393
    .line 394
    invoke-direct {v0, v7, v10}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;-><init>(ILjava/lang/String;)V

    .line 395
    .line 396
    .line 397
    return-object v0

    .line 398
    :pswitch_6
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    move-wide v4, v2

    .line 403
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    if-ge v6, v0, :cond_1e

    .line 408
    .line 409
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 410
    .line 411
    .line 412
    move-result v6

    .line 413
    int-to-char v7, v6

    .line 414
    if-eq v7, v9, :cond_1d

    .line 415
    .line 416
    if-eq v7, v8, :cond_1c

    .line 417
    .line 418
    invoke-static {v6, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 419
    .line 420
    .line 421
    goto :goto_7

    .line 422
    :cond_1c
    invoke-static {v6, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 423
    .line 424
    .line 425
    move-result-wide v4

    .line 426
    goto :goto_7

    .line 427
    :cond_1d
    invoke-static {v6, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 428
    .line 429
    .line 430
    move-result-wide v2

    .line 431
    goto :goto_7

    .line 432
    :cond_1e
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 433
    .line 434
    .line 435
    new-instance v0, Lcom/google/android/gms/drive/zzh;

    .line 436
    .line 437
    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/drive/zzh;-><init>(JJ)V

    .line 438
    .line 439
    .line 440
    return-object v0

    .line 441
    :pswitch_7
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    move-object v2, v10

    .line 446
    move-object v3, v2

    .line 447
    move-object v4, v3

    .line 448
    move-object v5, v4

    .line 449
    move-object v6, v5

    .line 450
    move-object v7, v6

    .line 451
    move-object v8, v7

    .line 452
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 453
    .line 454
    .line 455
    move-result v9

    .line 456
    if-ge v9, v0, :cond_1f

    .line 457
    .line 458
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 459
    .line 460
    .line 461
    move-result v9

    .line 462
    int-to-char v10, v9

    .line 463
    packed-switch v10, :pswitch_data_1

    .line 464
    .line 465
    .line 466
    invoke-static {v9, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 467
    .line 468
    .line 469
    goto :goto_8

    .line 470
    :pswitch_8
    invoke-static {v9, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v8

    .line 474
    goto :goto_8

    .line 475
    :pswitch_9
    sget-object v7, Lcom/google/android/gms/fido/u2f/api/common/ChannelIdValue;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 476
    .line 477
    invoke-static {v1, v9, v7}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 478
    .line 479
    .line 480
    move-result-object v7

    .line 481
    check-cast v7, Lcom/google/android/gms/fido/u2f/api/common/ChannelIdValue;

    .line 482
    .line 483
    goto :goto_8

    .line 484
    :pswitch_a
    sget-object v6, Lcom/google/android/gms/fido/u2f/api/common/RegisteredKey;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 485
    .line 486
    invoke-static {v1, v9, v6}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 487
    .line 488
    .line 489
    move-result-object v6

    .line 490
    goto :goto_8

    .line 491
    :pswitch_b
    sget-object v5, Lcom/google/android/gms/fido/u2f/api/common/RegisterRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 492
    .line 493
    invoke-static {v1, v9, v5}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 494
    .line 495
    .line 496
    move-result-object v5

    .line 497
    goto :goto_8

    .line 498
    :pswitch_c
    sget-object v4, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 499
    .line 500
    invoke-static {v1, v9, v4}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 501
    .line 502
    .line 503
    move-result-object v4

    .line 504
    check-cast v4, Landroid/net/Uri;

    .line 505
    .line 506
    goto :goto_8

    .line 507
    :pswitch_d
    invoke-static {v9, v1}, Lqj3;->A(ILandroid/os/Parcel;)Ljava/lang/Double;

    .line 508
    .line 509
    .line 510
    move-result-object v3

    .line 511
    goto :goto_8

    .line 512
    :pswitch_e
    invoke-static {v9, v1}, Lqj3;->E(ILandroid/os/Parcel;)Ljava/lang/Integer;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    goto :goto_8

    .line 517
    :cond_1f
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 518
    .line 519
    .line 520
    new-instance v1, Lcom/google/android/gms/fido/u2f/api/common/RegisterRequestParams;

    .line 521
    .line 522
    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/fido/u2f/api/common/RegisterRequestParams;-><init>(Ljava/lang/Integer;Ljava/lang/Double;Landroid/net/Uri;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/google/android/gms/fido/u2f/api/common/ChannelIdValue;Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    return-object v1

    .line 526
    :pswitch_f
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    move-object v2, v10

    .line 531
    move-object v3, v2

    .line 532
    move-object v5, v3

    .line 533
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 534
    .line 535
    .line 536
    move-result v7

    .line 537
    if-ge v7, v0, :cond_24

    .line 538
    .line 539
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 540
    .line 541
    .line 542
    move-result v7

    .line 543
    int-to-char v11, v7

    .line 544
    if-eq v11, v9, :cond_23

    .line 545
    .line 546
    if-eq v11, v8, :cond_22

    .line 547
    .line 548
    if-eq v11, v6, :cond_21

    .line 549
    .line 550
    if-eq v11, v4, :cond_20

    .line 551
    .line 552
    invoke-static {v7, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 553
    .line 554
    .line 555
    goto :goto_9

    .line 556
    :cond_20
    invoke-static {v7, v1}, Lqj3;->k(ILandroid/os/Parcel;)[Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v5

    .line 560
    goto :goto_9

    .line 561
    :cond_21
    invoke-static {v7, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    goto :goto_9

    .line 566
    :cond_22
    invoke-static {v7, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    goto :goto_9

    .line 571
    :cond_23
    invoke-static {v7, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 572
    .line 573
    .line 574
    move-result-object v10

    .line 575
    goto :goto_9

    .line 576
    :cond_24
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 577
    .line 578
    .line 579
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;

    .line 580
    .line 581
    invoke-direct {v0, v10, v2, v3, v5}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;-><init>([B[B[B[Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    return-object v0

    .line 585
    :pswitch_10
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 586
    .line 587
    .line 588
    move-result v0

    .line 589
    move-object v12, v10

    .line 590
    move-object v13, v12

    .line 591
    move-object v14, v13

    .line 592
    move-object v15, v14

    .line 593
    move-object/from16 v16, v15

    .line 594
    .line 595
    move-object/from16 v17, v16

    .line 596
    .line 597
    move-object/from16 v18, v17

    .line 598
    .line 599
    move-object/from16 v19, v18

    .line 600
    .line 601
    move-object/from16 v20, v19

    .line 602
    .line 603
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 604
    .line 605
    .line 606
    move-result v2

    .line 607
    if-ge v2, v0, :cond_25

    .line 608
    .line 609
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 610
    .line 611
    .line 612
    move-result v2

    .line 613
    int-to-char v3, v2

    .line 614
    packed-switch v3, :pswitch_data_2

    .line 615
    .line 616
    .line 617
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 618
    .line 619
    .line 620
    goto :goto_a

    .line 621
    :pswitch_11
    sget-object v3, Lcom/google/android/gms/drive/query/internal/zzz;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 622
    .line 623
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    move-object/from16 v20, v2

    .line 628
    .line 629
    check-cast v20, Lcom/google/android/gms/drive/query/internal/zzz;

    .line 630
    .line 631
    goto :goto_a

    .line 632
    :pswitch_12
    sget-object v3, Lcom/google/android/gms/drive/query/internal/zzl;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 633
    .line 634
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    move-object/from16 v19, v2

    .line 639
    .line 640
    check-cast v19, Lcom/google/android/gms/drive/query/internal/zzl;

    .line 641
    .line 642
    goto :goto_a

    .line 643
    :pswitch_13
    sget-object v3, Lcom/google/android/gms/drive/query/internal/zzn;->CREATOR:Lho3;

    .line 644
    .line 645
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    move-object/from16 v18, v2

    .line 650
    .line 651
    check-cast v18, Lcom/google/android/gms/drive/query/internal/zzn;

    .line 652
    .line 653
    goto :goto_a

    .line 654
    :pswitch_14
    sget-object v3, Lcom/google/android/gms/drive/query/internal/zzt;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 655
    .line 656
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    move-object/from16 v17, v2

    .line 661
    .line 662
    check-cast v17, Lcom/google/android/gms/drive/query/internal/zzt;

    .line 663
    .line 664
    goto :goto_a

    .line 665
    :pswitch_15
    sget-object v3, Lcom/google/android/gms/drive/query/internal/zzp;->CREATOR:Leq3;

    .line 666
    .line 667
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 668
    .line 669
    .line 670
    move-result-object v2

    .line 671
    move-object/from16 v16, v2

    .line 672
    .line 673
    check-cast v16, Lcom/google/android/gms/drive/query/internal/zzp;

    .line 674
    .line 675
    goto :goto_a

    .line 676
    :pswitch_16
    sget-object v3, Lcom/google/android/gms/drive/query/internal/zzv;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 677
    .line 678
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 679
    .line 680
    .line 681
    move-result-object v2

    .line 682
    move-object v15, v2

    .line 683
    check-cast v15, Lcom/google/android/gms/drive/query/internal/zzv;

    .line 684
    .line 685
    goto :goto_a

    .line 686
    :pswitch_17
    sget-object v3, Lcom/google/android/gms/drive/query/internal/zzr;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 687
    .line 688
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 689
    .line 690
    .line 691
    move-result-object v2

    .line 692
    move-object v14, v2

    .line 693
    check-cast v14, Lcom/google/android/gms/drive/query/internal/zzr;

    .line 694
    .line 695
    goto :goto_a

    .line 696
    :pswitch_18
    sget-object v3, Lcom/google/android/gms/drive/query/internal/zzd;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 697
    .line 698
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 699
    .line 700
    .line 701
    move-result-object v2

    .line 702
    move-object v13, v2

    .line 703
    check-cast v13, Lcom/google/android/gms/drive/query/internal/zzd;

    .line 704
    .line 705
    goto :goto_a

    .line 706
    :pswitch_19
    sget-object v3, Lcom/google/android/gms/drive/query/internal/zzb;->CREATOR:Lye3;

    .line 707
    .line 708
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 709
    .line 710
    .line 711
    move-result-object v2

    .line 712
    move-object v12, v2

    .line 713
    check-cast v12, Lcom/google/android/gms/drive/query/internal/zzb;

    .line 714
    .line 715
    goto :goto_a

    .line 716
    :cond_25
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 717
    .line 718
    .line 719
    new-instance v11, Lcom/google/android/gms/drive/query/internal/FilterHolder;

    .line 720
    .line 721
    invoke-direct/range {v11 .. v20}, Lcom/google/android/gms/drive/query/internal/FilterHolder;-><init>(Lcom/google/android/gms/drive/query/internal/zzb;Lcom/google/android/gms/drive/query/internal/zzd;Lcom/google/android/gms/drive/query/internal/zzr;Lcom/google/android/gms/drive/query/internal/zzv;Lcom/google/android/gms/drive/query/internal/zzp;Lcom/google/android/gms/drive/query/internal/zzt;Lcom/google/android/gms/drive/query/internal/zzn;Lcom/google/android/gms/drive/query/internal/zzl;Lcom/google/android/gms/drive/query/internal/zzz;)V

    .line 722
    .line 723
    .line 724
    return-object v11

    .line 725
    :pswitch_1a
    new-instance v0, Lcom/google/android/gms/common/internal/BinderWrapper;

    .line 726
    .line 727
    invoke-direct {v0, v1}, Lcom/google/android/gms/common/internal/BinderWrapper;-><init>(Landroid/os/Parcel;)V

    .line 728
    .line 729
    .line 730
    return-object v0

    .line 731
    :pswitch_1b
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 732
    .line 733
    .line 734
    move-result v0

    .line 735
    move-object v2, v10

    .line 736
    move-object v3, v2

    .line 737
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 738
    .line 739
    .line 740
    move-result v4

    .line 741
    if-ge v4, v0, :cond_2a

    .line 742
    .line 743
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 744
    .line 745
    .line 746
    move-result v4

    .line 747
    int-to-char v11, v4

    .line 748
    if-eq v11, v5, :cond_29

    .line 749
    .line 750
    if-eq v11, v9, :cond_28

    .line 751
    .line 752
    if-eq v11, v8, :cond_27

    .line 753
    .line 754
    if-eq v11, v6, :cond_26

    .line 755
    .line 756
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 757
    .line 758
    .line 759
    goto :goto_b

    .line 760
    :cond_26
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v3

    .line 764
    goto :goto_b

    .line 765
    :cond_27
    invoke-static {v4, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    goto :goto_b

    .line 770
    :cond_28
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 771
    .line 772
    .line 773
    move-result-object v10

    .line 774
    goto :goto_b

    .line 775
    :cond_29
    invoke-static {v4, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 776
    .line 777
    .line 778
    move-result v7

    .line 779
    goto :goto_b

    .line 780
    :cond_2a
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 781
    .line 782
    .line 783
    new-instance v0, Lcom/google/android/gms/fido/u2f/api/common/RegisterRequest;

    .line 784
    .line 785
    invoke-direct {v0, v7, v10, v2, v3}, Lcom/google/android/gms/fido/u2f/api/common/RegisterRequest;-><init>(ILjava/lang/String;[BLjava/lang/String;)V

    .line 786
    .line 787
    .line 788
    return-object v0

    .line 789
    :pswitch_1c
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 790
    .line 791
    .line 792
    move-result v0

    .line 793
    move-object v12, v10

    .line 794
    move-object v13, v12

    .line 795
    move-object v14, v13

    .line 796
    move-object v15, v14

    .line 797
    move-object/from16 v16, v15

    .line 798
    .line 799
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 800
    .line 801
    .line 802
    move-result v2

    .line 803
    if-ge v2, v0, :cond_30

    .line 804
    .line 805
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 806
    .line 807
    .line 808
    move-result v2

    .line 809
    int-to-char v3, v2

    .line 810
    if-eq v3, v9, :cond_2f

    .line 811
    .line 812
    if-eq v3, v8, :cond_2e

    .line 813
    .line 814
    if-eq v3, v6, :cond_2d

    .line 815
    .line 816
    if-eq v3, v4, :cond_2c

    .line 817
    .line 818
    const/4 v5, 0x6

    .line 819
    if-eq v3, v5, :cond_2b

    .line 820
    .line 821
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 822
    .line 823
    .line 824
    goto :goto_c

    .line 825
    :cond_2b
    invoke-static {v2, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 826
    .line 827
    .line 828
    move-result-object v16

    .line 829
    goto :goto_c

    .line 830
    :cond_2c
    invoke-static {v2, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 831
    .line 832
    .line 833
    move-result-object v15

    .line 834
    goto :goto_c

    .line 835
    :cond_2d
    invoke-static {v2, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 836
    .line 837
    .line 838
    move-result-object v14

    .line 839
    goto :goto_c

    .line 840
    :cond_2e
    invoke-static {v2, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 841
    .line 842
    .line 843
    move-result-object v13

    .line 844
    goto :goto_c

    .line 845
    :cond_2f
    invoke-static {v2, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 846
    .line 847
    .line 848
    move-result-object v12

    .line 849
    goto :goto_c

    .line 850
    :cond_30
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 851
    .line 852
    .line 853
    new-instance v11, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAssertionResponse;

    .line 854
    .line 855
    invoke-direct/range {v11 .. v16}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAssertionResponse;-><init>([B[B[B[B[B)V

    .line 856
    .line 857
    .line 858
    return-object v11

    .line 859
    :pswitch_1d
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 860
    .line 861
    .line 862
    move-result v0

    .line 863
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 864
    .line 865
    .line 866
    move-result v2

    .line 867
    if-ge v2, v0, :cond_33

    .line 868
    .line 869
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 870
    .line 871
    .line 872
    move-result v2

    .line 873
    int-to-char v3, v2

    .line 874
    if-eq v3, v5, :cond_32

    .line 875
    .line 876
    if-eq v3, v9, :cond_31

    .line 877
    .line 878
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 879
    .line 880
    .line 881
    goto :goto_d

    .line 882
    :cond_31
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 883
    .line 884
    .line 885
    move-result v7

    .line 886
    goto :goto_d

    .line 887
    :cond_32
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v10

    .line 891
    goto :goto_d

    .line 892
    :cond_33
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 893
    .line 894
    .line 895
    new-instance v0, Lcom/google/android/gms/drive/query/internal/zzf;

    .line 896
    .line 897
    invoke-direct {v0, v10, v7}, Lcom/google/android/gms/drive/query/internal/zzf;-><init>(Ljava/lang/String;Z)V

    .line 898
    .line 899
    .line 900
    return-object v0

    .line 901
    :pswitch_1e
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 902
    .line 903
    .line 904
    move-result v0

    .line 905
    move/from16 v18, v7

    .line 906
    .line 907
    move-object v12, v10

    .line 908
    move-object v13, v12

    .line 909
    move-object v14, v13

    .line 910
    move-object v15, v14

    .line 911
    move-object/from16 v16, v15

    .line 912
    .line 913
    move-object/from16 v17, v16

    .line 914
    .line 915
    move-object/from16 v19, v17

    .line 916
    .line 917
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 918
    .line 919
    .line 920
    move-result v2

    .line 921
    if-ge v2, v0, :cond_34

    .line 922
    .line 923
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 924
    .line 925
    .line 926
    move-result v2

    .line 927
    int-to-char v3, v2

    .line 928
    packed-switch v3, :pswitch_data_3

    .line 929
    .line 930
    .line 931
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 932
    .line 933
    .line 934
    goto :goto_e

    .line 935
    :pswitch_1f
    invoke-static {v2, v1}, Lqj3;->C(ILandroid/os/Parcel;)Landroid/os/IBinder;

    .line 936
    .line 937
    .line 938
    move-result-object v19

    .line 939
    goto :goto_e

    .line 940
    :pswitch_20
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 941
    .line 942
    .line 943
    move-result v18

    .line 944
    goto :goto_e

    .line 945
    :pswitch_21
    invoke-static {v2, v1}, Lqj3;->l(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 946
    .line 947
    .line 948
    move-result-object v17

    .line 949
    goto :goto_e

    .line 950
    :pswitch_22
    sget-object v3, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 951
    .line 952
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 953
    .line 954
    .line 955
    move-result-object v2

    .line 956
    move-object/from16 v16, v2

    .line 957
    .line 958
    check-cast v16, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .line 959
    .line 960
    goto :goto_e

    .line 961
    :pswitch_23
    sget-object v3, Landroid/os/ParcelFileDescriptor;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 962
    .line 963
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 964
    .line 965
    .line 966
    move-result-object v2

    .line 967
    move-object v15, v2

    .line 968
    check-cast v15, Landroid/os/ParcelFileDescriptor;

    .line 969
    .line 970
    goto :goto_e

    .line 971
    :pswitch_24
    sget-object v3, Landroid/os/ParcelFileDescriptor;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 972
    .line 973
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 974
    .line 975
    .line 976
    move-result-object v2

    .line 977
    move-object v14, v2

    .line 978
    check-cast v14, Landroid/os/ParcelFileDescriptor;

    .line 979
    .line 980
    goto :goto_e

    .line 981
    :pswitch_25
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 982
    .line 983
    .line 984
    move-result-object v13

    .line 985
    goto :goto_e

    .line 986
    :pswitch_26
    sget-object v3, Lcom/google/android/gms/drive/DriveId;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 987
    .line 988
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 989
    .line 990
    .line 991
    move-result-object v2

    .line 992
    move-object v12, v2

    .line 993
    check-cast v12, Lcom/google/android/gms/drive/DriveId;

    .line 994
    .line 995
    goto :goto_e

    .line 996
    :cond_34
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 997
    .line 998
    .line 999
    new-instance v11, Lcom/google/android/gms/drive/events/CompletionEvent;

    .line 1000
    .line 1001
    invoke-direct/range {v11 .. v19}, Lcom/google/android/gms/drive/events/CompletionEvent;-><init>(Lcom/google/android/gms/drive/DriveId;Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Landroid/os/ParcelFileDescriptor;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;Ljava/util/ArrayList;ILandroid/os/IBinder;)V

    .line 1002
    .line 1003
    .line 1004
    return-object v11

    .line 1005
    :pswitch_27
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1006
    .line 1007
    .line 1008
    move-result v0

    .line 1009
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1010
    .line 1011
    .line 1012
    move-result v2

    .line 1013
    if-ge v2, v0, :cond_35

    .line 1014
    .line 1015
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1016
    .line 1017
    .line 1018
    move-result v2

    .line 1019
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1020
    .line 1021
    .line 1022
    goto :goto_f

    .line 1023
    :cond_35
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1024
    .line 1025
    .line 1026
    new-instance v0, Lcom/google/android/gms/recaptchabase/InitResult;

    .line 1027
    .line 1028
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1029
    .line 1030
    .line 1031
    return-object v0

    .line 1032
    :pswitch_28
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v0

    .line 1036
    :try_start_0
    invoke-static {v0}, Lcom/google/android/gms/fido/u2f/api/common/ProtocolVersion;->a(Ljava/lang/String;)Lcom/google/android/gms/fido/u2f/api/common/ProtocolVersion;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v10
    :try_end_0
    .catch Lhz1; {:try_start_0 .. :try_end_0} :catch_0

    .line 1040
    goto :goto_10

    .line 1041
    :catch_0
    move-exception v0

    .line 1042
    invoke-static {v0}, Lds0;->p(Ljava/lang/Throwable;)V

    .line 1043
    .line 1044
    .line 1045
    :goto_10
    return-object v10

    .line 1046
    :pswitch_29
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1047
    .line 1048
    .line 1049
    move-result v0

    .line 1050
    move-object v2, v10

    .line 1051
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1052
    .line 1053
    .line 1054
    move-result v3

    .line 1055
    if-ge v3, v0, :cond_38

    .line 1056
    .line 1057
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1058
    .line 1059
    .line 1060
    move-result v3

    .line 1061
    int-to-char v4, v3

    .line 1062
    if-eq v4, v5, :cond_37

    .line 1063
    .line 1064
    if-eq v4, v9, :cond_36

    .line 1065
    .line 1066
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1067
    .line 1068
    .line 1069
    goto :goto_11

    .line 1070
    :cond_36
    invoke-static {v3, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 1071
    .line 1072
    .line 1073
    move-result-object v2

    .line 1074
    goto :goto_11

    .line 1075
    :cond_37
    invoke-static {v3, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 1076
    .line 1077
    .line 1078
    move-result-object v10

    .line 1079
    goto :goto_11

    .line 1080
    :cond_38
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1081
    .line 1082
    .line 1083
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/zze;

    .line 1084
    .line 1085
    invoke-direct {v0, v10, v2}, Lcom/google/android/gms/fido/fido2/api/common/zze;-><init>([B[B)V

    .line 1086
    .line 1087
    .line 1088
    return-object v0

    .line 1089
    :pswitch_2a
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1090
    .line 1091
    .line 1092
    move-result v0

    .line 1093
    move v2, v7

    .line 1094
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1095
    .line 1096
    .line 1097
    move-result v3

    .line 1098
    if-ge v3, v0, :cond_3c

    .line 1099
    .line 1100
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1101
    .line 1102
    .line 1103
    move-result v3

    .line 1104
    int-to-char v4, v3

    .line 1105
    if-eq v4, v9, :cond_3b

    .line 1106
    .line 1107
    if-eq v4, v8, :cond_3a

    .line 1108
    .line 1109
    if-eq v4, v6, :cond_39

    .line 1110
    .line 1111
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1112
    .line 1113
    .line 1114
    goto :goto_12

    .line 1115
    :cond_39
    sget-object v4, Lcom/google/android/gms/drive/DriveSpace;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1116
    .line 1117
    invoke-static {v1, v3, v4}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v10

    .line 1121
    goto :goto_12

    .line 1122
    :cond_3a
    invoke-static {v3, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1123
    .line 1124
    .line 1125
    move-result v2

    .line 1126
    goto :goto_12

    .line 1127
    :cond_3b
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1128
    .line 1129
    .line 1130
    move-result v7

    .line 1131
    goto :goto_12

    .line 1132
    :cond_3c
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1133
    .line 1134
    .line 1135
    new-instance v0, Lcom/google/android/gms/drive/events/zze;

    .line 1136
    .line 1137
    invoke-direct {v0, v7, v2, v10}, Lcom/google/android/gms/drive/events/zze;-><init>(IZLjava/util/ArrayList;)V

    .line 1138
    .line 1139
    .line 1140
    return-object v0

    .line 1141
    :pswitch_2b
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1142
    .line 1143
    .line 1144
    move-result v0

    .line 1145
    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1146
    .line 1147
    .line 1148
    move-result v2

    .line 1149
    if-ge v2, v0, :cond_3d

    .line 1150
    .line 1151
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1152
    .line 1153
    .line 1154
    move-result v2

    .line 1155
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1156
    .line 1157
    .line 1158
    goto :goto_13

    .line 1159
    :cond_3d
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1160
    .line 1161
    .line 1162
    new-instance v0, Lcom/google/android/gms/recaptchabase/InitRequest;

    .line 1163
    .line 1164
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1165
    .line 1166
    .line 1167
    return-object v0

    .line 1168
    :pswitch_2c
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1169
    .line 1170
    .line 1171
    move-result v0

    .line 1172
    move-object v2, v10

    .line 1173
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1174
    .line 1175
    .line 1176
    move-result v3

    .line 1177
    if-ge v3, v0, :cond_40

    .line 1178
    .line 1179
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1180
    .line 1181
    .line 1182
    move-result v3

    .line 1183
    int-to-char v4, v3

    .line 1184
    if-eq v4, v5, :cond_3f

    .line 1185
    .line 1186
    if-eq v4, v9, :cond_3e

    .line 1187
    .line 1188
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1189
    .line 1190
    .line 1191
    goto :goto_14

    .line 1192
    :cond_3e
    sget-object v2, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1193
    .line 1194
    invoke-static {v1, v3, v2}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v2

    .line 1198
    check-cast v2, Landroid/net/Uri;

    .line 1199
    .line 1200
    goto :goto_14

    .line 1201
    :cond_3f
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v3

    .line 1205
    move-object v10, v3

    .line 1206
    goto :goto_14

    .line 1207
    :cond_40
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1208
    .line 1209
    .line 1210
    new-instance v0, Lcom/google/android/gms/games/internal/player/StockProfileImageEntity;

    .line 1211
    .line 1212
    invoke-direct {v0, v2, v10}, Lcom/google/android/gms/games/internal/player/StockProfileImageEntity;-><init>(Landroid/net/Uri;Ljava/lang/String;)V

    .line 1213
    .line 1214
    .line 1215
    return-object v0

    .line 1216
    :pswitch_2d
    invoke-static {}, Lcom/google/android/gms/common/internal/DowngradeableSafeParcel;->E1()V

    .line 1217
    .line 1218
    .line 1219
    invoke-static {}, Lcom/google/android/gms/common/internal/DowngradeableSafeParcel;->D1()V

    .line 1220
    .line 1221
    .line 1222
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1223
    .line 1224
    .line 1225
    move-result v0

    .line 1226
    move/from16 v21, v7

    .line 1227
    .line 1228
    move/from16 v22, v21

    .line 1229
    .line 1230
    move/from16 v24, v22

    .line 1231
    .line 1232
    move/from16 v25, v24

    .line 1233
    .line 1234
    move/from16 v26, v25

    .line 1235
    .line 1236
    move/from16 v27, v26

    .line 1237
    .line 1238
    move/from16 v28, v27

    .line 1239
    .line 1240
    move/from16 v32, v28

    .line 1241
    .line 1242
    move/from16 v33, v32

    .line 1243
    .line 1244
    move/from16 v34, v33

    .line 1245
    .line 1246
    move/from16 v36, v34

    .line 1247
    .line 1248
    move-object v12, v10

    .line 1249
    move-object v13, v12

    .line 1250
    move-object v14, v13

    .line 1251
    move-object v15, v14

    .line 1252
    move-object/from16 v16, v15

    .line 1253
    .line 1254
    move-object/from16 v17, v16

    .line 1255
    .line 1256
    move-object/from16 v18, v17

    .line 1257
    .line 1258
    move-object/from16 v19, v18

    .line 1259
    .line 1260
    move-object/from16 v20, v19

    .line 1261
    .line 1262
    move-object/from16 v23, v20

    .line 1263
    .line 1264
    move-object/from16 v29, v23

    .line 1265
    .line 1266
    move-object/from16 v30, v29

    .line 1267
    .line 1268
    move-object/from16 v31, v30

    .line 1269
    .line 1270
    move-object/from16 v35, v31

    .line 1271
    .line 1272
    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1273
    .line 1274
    .line 1275
    move-result v2

    .line 1276
    if-ge v2, v0, :cond_41

    .line 1277
    .line 1278
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1279
    .line 1280
    .line 1281
    move-result v2

    .line 1282
    int-to-char v3, v2

    .line 1283
    packed-switch v3, :pswitch_data_4

    .line 1284
    .line 1285
    .line 1286
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1287
    .line 1288
    .line 1289
    goto :goto_15

    .line 1290
    :pswitch_2e
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1291
    .line 1292
    .line 1293
    move-result v2

    .line 1294
    move/from16 v36, v2

    .line 1295
    .line 1296
    goto :goto_15

    .line 1297
    :pswitch_2f
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v2

    .line 1301
    move-object/from16 v35, v2

    .line 1302
    .line 1303
    goto :goto_15

    .line 1304
    :pswitch_30
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1305
    .line 1306
    .line 1307
    move-result v2

    .line 1308
    move/from16 v34, v2

    .line 1309
    .line 1310
    goto :goto_15

    .line 1311
    :pswitch_31
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1312
    .line 1313
    .line 1314
    move-result v2

    .line 1315
    move/from16 v33, v2

    .line 1316
    .line 1317
    goto :goto_15

    .line 1318
    :pswitch_32
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1319
    .line 1320
    .line 1321
    move-result v2

    .line 1322
    move/from16 v32, v2

    .line 1323
    .line 1324
    goto :goto_15

    .line 1325
    :pswitch_33
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v2

    .line 1329
    move-object/from16 v31, v2

    .line 1330
    .line 1331
    goto :goto_15

    .line 1332
    :pswitch_34
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v2

    .line 1336
    move-object/from16 v30, v2

    .line 1337
    .line 1338
    goto :goto_15

    .line 1339
    :pswitch_35
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v2

    .line 1343
    move-object/from16 v29, v2

    .line 1344
    .line 1345
    goto :goto_15

    .line 1346
    :pswitch_36
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1347
    .line 1348
    .line 1349
    move-result v2

    .line 1350
    move/from16 v28, v2

    .line 1351
    .line 1352
    goto :goto_15

    .line 1353
    :pswitch_37
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1354
    .line 1355
    .line 1356
    move-result v2

    .line 1357
    move/from16 v27, v2

    .line 1358
    .line 1359
    goto :goto_15

    .line 1360
    :pswitch_38
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1361
    .line 1362
    .line 1363
    move-result v2

    .line 1364
    move/from16 v26, v2

    .line 1365
    .line 1366
    goto :goto_15

    .line 1367
    :pswitch_39
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1368
    .line 1369
    .line 1370
    move-result v2

    .line 1371
    move/from16 v25, v2

    .line 1372
    .line 1373
    goto :goto_15

    .line 1374
    :pswitch_3a
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1375
    .line 1376
    .line 1377
    move-result v2

    .line 1378
    move/from16 v24, v2

    .line 1379
    .line 1380
    goto :goto_15

    .line 1381
    :pswitch_3b
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v2

    .line 1385
    move-object/from16 v23, v2

    .line 1386
    .line 1387
    goto :goto_15

    .line 1388
    :pswitch_3c
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1389
    .line 1390
    .line 1391
    move-result v2

    .line 1392
    move/from16 v22, v2

    .line 1393
    .line 1394
    goto :goto_15

    .line 1395
    :pswitch_3d
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1396
    .line 1397
    .line 1398
    move-result v2

    .line 1399
    move/from16 v21, v2

    .line 1400
    .line 1401
    goto/16 :goto_15

    .line 1402
    .line 1403
    :pswitch_3e
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1404
    .line 1405
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v2

    .line 1409
    check-cast v2, Landroid/net/Uri;

    .line 1410
    .line 1411
    move-object/from16 v20, v2

    .line 1412
    .line 1413
    goto/16 :goto_15

    .line 1414
    .line 1415
    :pswitch_3f
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1416
    .line 1417
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v2

    .line 1421
    check-cast v2, Landroid/net/Uri;

    .line 1422
    .line 1423
    move-object/from16 v19, v2

    .line 1424
    .line 1425
    goto/16 :goto_15

    .line 1426
    .line 1427
    :pswitch_40
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1428
    .line 1429
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v2

    .line 1433
    check-cast v2, Landroid/net/Uri;

    .line 1434
    .line 1435
    move-object/from16 v18, v2

    .line 1436
    .line 1437
    goto/16 :goto_15

    .line 1438
    .line 1439
    :pswitch_41
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v2

    .line 1443
    move-object/from16 v17, v2

    .line 1444
    .line 1445
    goto/16 :goto_15

    .line 1446
    .line 1447
    :pswitch_42
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v2

    .line 1451
    move-object/from16 v16, v2

    .line 1452
    .line 1453
    goto/16 :goto_15

    .line 1454
    .line 1455
    :pswitch_43
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v2

    .line 1459
    move-object v15, v2

    .line 1460
    goto/16 :goto_15

    .line 1461
    .line 1462
    :pswitch_44
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v2

    .line 1466
    move-object v14, v2

    .line 1467
    goto/16 :goto_15

    .line 1468
    .line 1469
    :pswitch_45
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v2

    .line 1473
    move-object v13, v2

    .line 1474
    goto/16 :goto_15

    .line 1475
    .line 1476
    :pswitch_46
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v2

    .line 1480
    move-object v12, v2

    .line 1481
    goto/16 :goto_15

    .line 1482
    .line 1483
    :cond_41
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1484
    .line 1485
    .line 1486
    new-instance v11, Lcom/google/android/gms/games/GameEntity;

    .line 1487
    .line 1488
    invoke-direct/range {v11 .. v36}, Lcom/google/android/gms/games/GameEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;ZZLjava/lang/String;IIIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Z)V

    .line 1489
    .line 1490
    .line 1491
    return-object v11

    .line 1492
    :pswitch_47
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1493
    .line 1494
    .line 1495
    move-result v0

    .line 1496
    move-object v2, v10

    .line 1497
    move-object v3, v2

    .line 1498
    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1499
    .line 1500
    .line 1501
    move-result v4

    .line 1502
    if-ge v4, v0, :cond_46

    .line 1503
    .line 1504
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1505
    .line 1506
    .line 1507
    move-result v4

    .line 1508
    int-to-char v11, v4

    .line 1509
    if-eq v11, v5, :cond_45

    .line 1510
    .line 1511
    if-eq v11, v9, :cond_44

    .line 1512
    .line 1513
    if-eq v11, v8, :cond_43

    .line 1514
    .line 1515
    if-eq v11, v6, :cond_42

    .line 1516
    .line 1517
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1518
    .line 1519
    .line 1520
    goto :goto_16

    .line 1521
    :cond_42
    sget-object v3, Lcom/google/android/gms/fido/common/Transport;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1522
    .line 1523
    invoke-static {v1, v4, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v3

    .line 1527
    goto :goto_16

    .line 1528
    :cond_43
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v2

    .line 1532
    goto :goto_16

    .line 1533
    :cond_44
    invoke-static {v4, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 1534
    .line 1535
    .line 1536
    move-result-object v10

    .line 1537
    goto :goto_16

    .line 1538
    :cond_45
    invoke-static {v4, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1539
    .line 1540
    .line 1541
    move-result v7

    .line 1542
    goto :goto_16

    .line 1543
    :cond_46
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1544
    .line 1545
    .line 1546
    new-instance v0, Lcom/google/android/gms/fido/u2f/api/common/KeyHandle;

    .line 1547
    .line 1548
    invoke-direct {v0, v7, v10, v2, v3}, Lcom/google/android/gms/fido/u2f/api/common/KeyHandle;-><init>(I[BLjava/lang/String;Ljava/util/ArrayList;)V

    .line 1549
    .line 1550
    .line 1551
    return-object v0

    .line 1552
    :pswitch_48
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1553
    .line 1554
    .line 1555
    move-result v0

    .line 1556
    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1557
    .line 1558
    .line 1559
    move-result v2

    .line 1560
    if-ge v2, v0, :cond_48

    .line 1561
    .line 1562
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1563
    .line 1564
    .line 1565
    move-result v2

    .line 1566
    int-to-char v3, v2

    .line 1567
    if-eq v3, v5, :cond_47

    .line 1568
    .line 1569
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1570
    .line 1571
    .line 1572
    goto :goto_17

    .line 1573
    :cond_47
    sget-object v3, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1574
    .line 1575
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v2

    .line 1579
    move-object v10, v2

    .line 1580
    check-cast v10, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .line 1581
    .line 1582
    goto :goto_17

    .line 1583
    :cond_48
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1584
    .line 1585
    .line 1586
    new-instance v0, Lcom/google/android/gms/drive/query/internal/zzd;

    .line 1587
    .line 1588
    invoke-direct {v0, v10}, Lcom/google/android/gms/drive/query/internal/zzd;-><init>(Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V

    .line 1589
    .line 1590
    .line 1591
    return-object v0

    .line 1592
    :pswitch_49
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1593
    .line 1594
    .line 1595
    move-result v0

    .line 1596
    move-object v2, v10

    .line 1597
    move-object v3, v2

    .line 1598
    :goto_18
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1599
    .line 1600
    .line 1601
    move-result v4

    .line 1602
    if-ge v4, v0, :cond_4d

    .line 1603
    .line 1604
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1605
    .line 1606
    .line 1607
    move-result v4

    .line 1608
    int-to-char v11, v4

    .line 1609
    if-eq v11, v5, :cond_4c

    .line 1610
    .line 1611
    if-eq v11, v9, :cond_4b

    .line 1612
    .line 1613
    if-eq v11, v8, :cond_4a

    .line 1614
    .line 1615
    if-eq v11, v6, :cond_49

    .line 1616
    .line 1617
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1618
    .line 1619
    .line 1620
    goto :goto_18

    .line 1621
    :cond_49
    sget-object v3, Lcom/google/android/gms/common/ConnectionResult;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1622
    .line 1623
    invoke-static {v1, v4, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v3

    .line 1627
    check-cast v3, Lcom/google/android/gms/common/ConnectionResult;

    .line 1628
    .line 1629
    goto :goto_18

    .line 1630
    :cond_4a
    sget-object v2, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1631
    .line 1632
    invoke-static {v1, v4, v2}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v2

    .line 1636
    check-cast v2, Landroid/app/PendingIntent;

    .line 1637
    .line 1638
    goto :goto_18

    .line 1639
    :cond_4b
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v10

    .line 1643
    goto :goto_18

    .line 1644
    :cond_4c
    invoke-static {v4, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1645
    .line 1646
    .line 1647
    move-result v7

    .line 1648
    goto :goto_18

    .line 1649
    :cond_4d
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1650
    .line 1651
    .line 1652
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 1653
    .line 1654
    invoke-direct {v0, v7, v10, v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 1655
    .line 1656
    .line 1657
    return-object v0

    .line 1658
    :pswitch_4a
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1659
    .line 1660
    .line 1661
    move-result v0

    .line 1662
    move v14, v7

    .line 1663
    move v15, v14

    .line 1664
    move/from16 v16, v15

    .line 1665
    .line 1666
    move/from16 v18, v16

    .line 1667
    .line 1668
    move/from16 v19, v18

    .line 1669
    .line 1670
    move/from16 v20, v19

    .line 1671
    .line 1672
    move/from16 v21, v20

    .line 1673
    .line 1674
    move/from16 v22, v21

    .line 1675
    .line 1676
    move/from16 v23, v22

    .line 1677
    .line 1678
    move/from16 v24, v23

    .line 1679
    .line 1680
    move/from16 v25, v24

    .line 1681
    .line 1682
    move-object v12, v10

    .line 1683
    move-object v13, v12

    .line 1684
    move-object/from16 v17, v13

    .line 1685
    .line 1686
    :goto_19
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1687
    .line 1688
    .line 1689
    move-result v2

    .line 1690
    if-ge v2, v0, :cond_4e

    .line 1691
    .line 1692
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1693
    .line 1694
    .line 1695
    move-result v2

    .line 1696
    int-to-char v3, v2

    .line 1697
    packed-switch v3, :pswitch_data_5

    .line 1698
    .line 1699
    .line 1700
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1701
    .line 1702
    .line 1703
    goto :goto_19

    .line 1704
    :pswitch_4b
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1705
    .line 1706
    .line 1707
    move-result v2

    .line 1708
    move/from16 v25, v2

    .line 1709
    .line 1710
    goto :goto_19

    .line 1711
    :pswitch_4c
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1712
    .line 1713
    .line 1714
    move-result v2

    .line 1715
    move/from16 v24, v2

    .line 1716
    .line 1717
    goto :goto_19

    .line 1718
    :pswitch_4d
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1719
    .line 1720
    .line 1721
    move-result v2

    .line 1722
    move/from16 v23, v2

    .line 1723
    .line 1724
    goto :goto_19

    .line 1725
    :pswitch_4e
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1726
    .line 1727
    .line 1728
    move-result v2

    .line 1729
    move/from16 v22, v2

    .line 1730
    .line 1731
    goto :goto_19

    .line 1732
    :pswitch_4f
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1733
    .line 1734
    .line 1735
    move-result v2

    .line 1736
    move/from16 v21, v2

    .line 1737
    .line 1738
    goto :goto_19

    .line 1739
    :pswitch_50
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1740
    .line 1741
    .line 1742
    move-result v2

    .line 1743
    move/from16 v20, v2

    .line 1744
    .line 1745
    goto :goto_19

    .line 1746
    :pswitch_51
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1747
    .line 1748
    .line 1749
    move-result v2

    .line 1750
    move/from16 v19, v2

    .line 1751
    .line 1752
    goto :goto_19

    .line 1753
    :pswitch_52
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1754
    .line 1755
    .line 1756
    move-result v2

    .line 1757
    move/from16 v18, v2

    .line 1758
    .line 1759
    goto :goto_19

    .line 1760
    :pswitch_53
    sget-object v3, Lcom/google/android/gms/games/internal/player/StockProfileImageEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1761
    .line 1762
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1763
    .line 1764
    .line 1765
    move-result-object v2

    .line 1766
    check-cast v2, Lcom/google/android/gms/games/internal/player/StockProfileImageEntity;

    .line 1767
    .line 1768
    move-object/from16 v17, v2

    .line 1769
    .line 1770
    goto :goto_19

    .line 1771
    :pswitch_54
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1772
    .line 1773
    .line 1774
    move-result v2

    .line 1775
    move/from16 v16, v2

    .line 1776
    .line 1777
    goto :goto_19

    .line 1778
    :pswitch_55
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1779
    .line 1780
    .line 1781
    move-result v2

    .line 1782
    move v15, v2

    .line 1783
    goto :goto_19

    .line 1784
    :pswitch_56
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1785
    .line 1786
    .line 1787
    move-result v2

    .line 1788
    move v14, v2

    .line 1789
    goto :goto_19

    .line 1790
    :pswitch_57
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v2

    .line 1794
    move-object v13, v2

    .line 1795
    goto :goto_19

    .line 1796
    :pswitch_58
    sget-object v3, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1797
    .line 1798
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v2

    .line 1802
    check-cast v2, Lcom/google/android/gms/common/api/Status;

    .line 1803
    .line 1804
    move-object v12, v2

    .line 1805
    goto :goto_19

    .line 1806
    :cond_4e
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1807
    .line 1808
    .line 1809
    new-instance v11, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;

    .line 1810
    .line 1811
    invoke-direct/range {v11 .. v25}, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/lang/String;ZZZLcom/google/android/gms/games/internal/player/StockProfileImageEntity;ZZIZZIIZ)V

    .line 1812
    .line 1813
    .line 1814
    return-object v11

    .line 1815
    :pswitch_59
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1816
    .line 1817
    .line 1818
    move-result v0

    .line 1819
    move v2, v7

    .line 1820
    :goto_1a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1821
    .line 1822
    .line 1823
    move-result v3

    .line 1824
    if-ge v3, v0, :cond_52

    .line 1825
    .line 1826
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1827
    .line 1828
    .line 1829
    move-result v3

    .line 1830
    int-to-char v4, v3

    .line 1831
    if-eq v4, v5, :cond_51

    .line 1832
    .line 1833
    if-eq v4, v9, :cond_50

    .line 1834
    .line 1835
    if-eq v4, v8, :cond_4f

    .line 1836
    .line 1837
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1838
    .line 1839
    .line 1840
    goto :goto_1a

    .line 1841
    :cond_4f
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1842
    .line 1843
    .line 1844
    move-result v2

    .line 1845
    goto :goto_1a

    .line 1846
    :cond_50
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1847
    .line 1848
    .line 1849
    move-result v3

    .line 1850
    move v7, v3

    .line 1851
    goto :goto_1a

    .line 1852
    :cond_51
    sget-object v4, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1853
    .line 1854
    invoke-static {v1, v3, v4}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v3

    .line 1858
    check-cast v3, Landroid/net/Uri;

    .line 1859
    .line 1860
    move-object v10, v3

    .line 1861
    goto :goto_1a

    .line 1862
    :cond_52
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1863
    .line 1864
    .line 1865
    new-instance v0, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;

    .line 1866
    .line 1867
    invoke-direct {v0, v10, v7, v2}, Lcom/google/android/gms/games/internal/game/ScreenshotEntity;-><init>(Landroid/net/Uri;II)V

    .line 1868
    .line 1869
    .line 1870
    return-object v0

    .line 1871
    :pswitch_5a
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1872
    .line 1873
    .line 1874
    move-result v0

    .line 1875
    :goto_1b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1876
    .line 1877
    .line 1878
    move-result v2

    .line 1879
    if-ge v2, v0, :cond_55

    .line 1880
    .line 1881
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1882
    .line 1883
    .line 1884
    move-result v2

    .line 1885
    int-to-char v3, v2

    .line 1886
    if-eq v3, v9, :cond_54

    .line 1887
    .line 1888
    if-eq v3, v8, :cond_53

    .line 1889
    .line 1890
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1891
    .line 1892
    .line 1893
    goto :goto_1b

    .line 1894
    :cond_53
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v10

    .line 1898
    goto :goto_1b

    .line 1899
    :cond_54
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1900
    .line 1901
    .line 1902
    move-result v7

    .line 1903
    goto :goto_1b

    .line 1904
    :cond_55
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1905
    .line 1906
    .line 1907
    new-instance v0, Lcom/google/android/gms/fido/u2f/api/common/ErrorResponseData;

    .line 1908
    .line 1909
    invoke-direct {v0, v7, v10}, Lcom/google/android/gms/fido/u2f/api/common/ErrorResponseData;-><init>(ILjava/lang/String;)V

    .line 1910
    .line 1911
    .line 1912
    return-object v0

    .line 1913
    :pswitch_5b
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1914
    .line 1915
    .line 1916
    move-result v0

    .line 1917
    move-object v12, v10

    .line 1918
    move-object v13, v12

    .line 1919
    move-object v14, v13

    .line 1920
    move-object v15, v14

    .line 1921
    move-object/from16 v16, v15

    .line 1922
    .line 1923
    move-object/from16 v17, v16

    .line 1924
    .line 1925
    move-object/from16 v18, v17

    .line 1926
    .line 1927
    move-object/from16 v19, v18

    .line 1928
    .line 1929
    move-object/from16 v20, v19

    .line 1930
    .line 1931
    :goto_1c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1932
    .line 1933
    .line 1934
    move-result v2

    .line 1935
    if-ge v2, v0, :cond_56

    .line 1936
    .line 1937
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1938
    .line 1939
    .line 1940
    move-result v2

    .line 1941
    int-to-char v3, v2

    .line 1942
    packed-switch v3, :pswitch_data_6

    .line 1943
    .line 1944
    .line 1945
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1946
    .line 1947
    .line 1948
    goto :goto_1c

    .line 1949
    :pswitch_5c
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/GoogleThirdPartyPaymentExtension;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1950
    .line 1951
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1952
    .line 1953
    .line 1954
    move-result-object v2

    .line 1955
    move-object/from16 v20, v2

    .line 1956
    .line 1957
    check-cast v20, Lcom/google/android/gms/fido/fido2/api/common/GoogleThirdPartyPaymentExtension;

    .line 1958
    .line 1959
    goto :goto_1c

    .line 1960
    :pswitch_5d
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/zzad;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1961
    .line 1962
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v2

    .line 1966
    move-object/from16 v19, v2

    .line 1967
    .line 1968
    check-cast v19, Lcom/google/android/gms/fido/fido2/api/common/zzad;

    .line 1969
    .line 1970
    goto :goto_1c

    .line 1971
    :pswitch_5e
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/zzr;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1972
    .line 1973
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1974
    .line 1975
    .line 1976
    move-result-object v2

    .line 1977
    move-object/from16 v18, v2

    .line 1978
    .line 1979
    check-cast v18, Lcom/google/android/gms/fido/fido2/api/common/zzr;

    .line 1980
    .line 1981
    goto :goto_1c

    .line 1982
    :pswitch_5f
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/zzaa;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1983
    .line 1984
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v2

    .line 1988
    move-object/from16 v17, v2

    .line 1989
    .line 1990
    check-cast v17, Lcom/google/android/gms/fido/fido2/api/common/zzaa;

    .line 1991
    .line 1992
    goto :goto_1c

    .line 1993
    :pswitch_60
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/zzy;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1994
    .line 1995
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1996
    .line 1997
    .line 1998
    move-result-object v2

    .line 1999
    move-object/from16 v16, v2

    .line 2000
    .line 2001
    check-cast v16, Lcom/google/android/gms/fido/fido2/api/common/zzy;

    .line 2002
    .line 2003
    goto :goto_1c

    .line 2004
    :pswitch_61
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/zzw;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2005
    .line 2006
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v2

    .line 2010
    move-object v15, v2

    .line 2011
    check-cast v15, Lcom/google/android/gms/fido/fido2/api/common/zzw;

    .line 2012
    .line 2013
    goto :goto_1c

    .line 2014
    :pswitch_62
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/UserVerificationMethodExtension;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2015
    .line 2016
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2017
    .line 2018
    .line 2019
    move-result-object v2

    .line 2020
    move-object v14, v2

    .line 2021
    check-cast v14, Lcom/google/android/gms/fido/fido2/api/common/UserVerificationMethodExtension;

    .line 2022
    .line 2023
    goto :goto_1c

    .line 2024
    :pswitch_63
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/zzp;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2025
    .line 2026
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2027
    .line 2028
    .line 2029
    move-result-object v2

    .line 2030
    move-object v13, v2

    .line 2031
    check-cast v13, Lcom/google/android/gms/fido/fido2/api/common/zzp;

    .line 2032
    .line 2033
    goto :goto_1c

    .line 2034
    :pswitch_64
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/FidoAppIdExtension;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2035
    .line 2036
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 2037
    .line 2038
    .line 2039
    move-result-object v2

    .line 2040
    move-object v12, v2

    .line 2041
    check-cast v12, Lcom/google/android/gms/fido/fido2/api/common/FidoAppIdExtension;

    .line 2042
    .line 2043
    goto :goto_1c

    .line 2044
    :cond_56
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 2045
    .line 2046
    .line 2047
    new-instance v11, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensions;

    .line 2048
    .line 2049
    invoke-direct/range {v11 .. v20}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensions;-><init>(Lcom/google/android/gms/fido/fido2/api/common/FidoAppIdExtension;Lcom/google/android/gms/fido/fido2/api/common/zzp;Lcom/google/android/gms/fido/fido2/api/common/UserVerificationMethodExtension;Lcom/google/android/gms/fido/fido2/api/common/zzw;Lcom/google/android/gms/fido/fido2/api/common/zzy;Lcom/google/android/gms/fido/fido2/api/common/zzaa;Lcom/google/android/gms/fido/fido2/api/common/zzr;Lcom/google/android/gms/fido/fido2/api/common/zzad;Lcom/google/android/gms/fido/fido2/api/common/GoogleThirdPartyPaymentExtension;)V

    .line 2050
    .line 2051
    .line 2052
    return-object v11

    .line 2053
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_10
        :pswitch_f
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch

    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
    .end packed-switch

    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    :pswitch_data_3
    .packed-switch 0x2
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
    .end packed-switch

    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
    .end packed-switch

    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
    .end packed-switch

    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    :pswitch_data_6
    .packed-switch 0x2
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Ltf3;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lcom/google/android/gms/drive/DriveId;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lcom/google/android/gms/common/internal/zzj;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lcom/google/android/gms/fido/u2f/api/common/RegisteredKey;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorSelectionCriteria;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lcom/google/android/gms/fido/u2f/api/common/RegisterResponseData;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lcom/google/android/gms/drive/zzh;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lcom/google/android/gms/fido/u2f/api/common/RegisterRequestParams;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lcom/google/android/gms/drive/query/internal/FilterHolder;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lcom/google/android/gms/common/internal/BinderWrapper;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lcom/google/android/gms/fido/u2f/api/common/RegisterRequest;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAssertionResponse;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lcom/google/android/gms/drive/query/internal/zzf;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lcom/google/android/gms/drive/events/CompletionEvent;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lcom/google/android/gms/recaptchabase/InitResult;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lcom/google/android/gms/fido/u2f/api/common/ProtocolVersion;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/zze;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lcom/google/android/gms/drive/events/zze;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lcom/google/android/gms/recaptchabase/InitRequest;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lcom/google/android/gms/games/internal/player/StockProfileImageEntity;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lcom/google/android/gms/games/GameEntity;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lcom/google/android/gms/fido/u2f/api/common/KeyHandle;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lcom/google/android/gms/drive/query/internal/zzd;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lcom/google/android/gms/common/api/Status;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lcom/google/android/gms/games/internal/game/ScreenshotEntity;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lcom/google/android/gms/fido/u2f/api/common/ErrorResponseData;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensions;

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

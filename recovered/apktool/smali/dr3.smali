.class public final Ldr3;
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
    iput p1, p0, Ldr3;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static a(Lcom/google/android/gms/games/zzt;Landroid/os/Parcel;)V
    .locals 5

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {v0, p1}, Lw11;->c0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lcom/google/android/gms/games/zzt;->a:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x4

    .line 11
    invoke-static {p1, v2, v3}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/google/android/gms/games/zzt;->b:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-static {p1, v2, v1, v4}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x3

    .line 25
    iget-object v2, p0, Lcom/google/android/gms/games/zzt;->c:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {p1, v1, v2, v4}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lcom/google/android/gms/games/zzt;->d:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {p1, v3, p0, v4}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, p1}, Lw11;->f0(ILandroid/os/Parcel;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 53

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Ldr3;->a:I

    .line 6
    .line 7
    const-string v2, "Overread allowed size end="

    .line 8
    .line 9
    const/4 v3, 0x6

    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    const/4 v6, 0x5

    .line 13
    const/4 v7, 0x4

    .line 14
    const/4 v8, 0x3

    .line 15
    const/4 v9, 0x2

    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v11, 0x1

    .line 18
    const/4 v12, 0x0

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-ge v2, v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    int-to-char v3, v2

    .line 37
    if-eq v3, v11, :cond_0

    .line 38
    .line 39
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    move-wide v4, v2

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/zzy;

    .line 53
    .line 54
    invoke-direct {v0, v4, v5}, Lcom/google/android/gms/fido/fido2/api/common/zzy;-><init>(J)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_0
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    move-wide v15, v4

    .line 63
    move v13, v10

    .line 64
    move v14, v13

    .line 65
    move/from16 v17, v14

    .line 66
    .line 67
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-ge v2, v0, :cond_6

    .line 72
    .line 73
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    int-to-char v3, v2

    .line 78
    if-eq v3, v11, :cond_5

    .line 79
    .line 80
    if-eq v3, v9, :cond_4

    .line 81
    .line 82
    if-eq v3, v8, :cond_3

    .line 83
    .line 84
    if-eq v3, v7, :cond_2

    .line 85
    .line 86
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    move/from16 v17, v2

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 98
    .line 99
    .line 100
    move-result-wide v2

    .line 101
    move-wide v15, v2

    .line 102
    goto :goto_1

    .line 103
    :cond_4
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    move v14, v2

    .line 108
    goto :goto_1

    .line 109
    :cond_5
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    move v13, v2

    .line 114
    goto :goto_1

    .line 115
    :cond_6
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 116
    .line 117
    .line 118
    new-instance v12, Lcom/google/android/gms/auth/api/accounttransfer/DeviceMetaData;

    .line 119
    .line 120
    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/auth/api/accounttransfer/DeviceMetaData;-><init>(IZJZ)V

    .line 121
    .line 122
    .line 123
    return-object v12

    .line 124
    :pswitch_1
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-ge v2, v0, :cond_8

    .line 133
    .line 134
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    int-to-char v3, v2

    .line 139
    if-eq v3, v11, :cond_7

    .line 140
    .line 141
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_7
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v12

    .line 149
    goto :goto_2

    .line 150
    :cond_8
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 151
    .line 152
    .line 153
    new-instance v0, Lcom/google/android/gms/drive/query/internal/zzx;

    .line 154
    .line 155
    invoke-direct {v0, v12}, Lcom/google/android/gms/drive/query/internal/zzx;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-object v0

    .line 159
    :pswitch_2
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    if-ge v2, v0, :cond_a

    .line 168
    .line 169
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    int-to-char v3, v2

    .line 174
    if-eq v3, v9, :cond_9

    .line 175
    .line 176
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_9
    sget-object v3, Lcom/google/android/gms/drive/DriveSpace;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 181
    .line 182
    invoke-static {v1, v2, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 183
    .line 184
    .line 185
    move-result-object v12

    .line 186
    goto :goto_3

    .line 187
    :cond_a
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 188
    .line 189
    .line 190
    new-instance v0, Lcom/google/android/gms/drive/events/zzx;

    .line 191
    .line 192
    invoke-direct {v0, v12}, Lcom/google/android/gms/drive/events/zzx;-><init>(Ljava/util/ArrayList;)V

    .line 193
    .line 194
    .line 195
    return-object v0

    .line 196
    :pswitch_3
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    new-instance v14, Ljava/util/HashSet;

    .line 201
    .line 202
    invoke-direct {v14}, Ljava/util/HashSet;-><init>()V

    .line 203
    .line 204
    .line 205
    move v15, v10

    .line 206
    move/from16 v17, v15

    .line 207
    .line 208
    move-object/from16 v16, v12

    .line 209
    .line 210
    move-object/from16 v18, v16

    .line 211
    .line 212
    move-object/from16 v19, v18

    .line 213
    .line 214
    move-object/from16 v20, v19

    .line 215
    .line 216
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-ge v4, v0, :cond_b

    .line 221
    .line 222
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    int-to-char v5, v4

    .line 227
    packed-switch v5, :pswitch_data_1

    .line 228
    .line 229
    .line 230
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 231
    .line 232
    .line 233
    goto :goto_4

    .line 234
    :pswitch_4
    sget-object v5, Lcom/google/android/gms/auth/api/accounttransfer/DeviceMetaData;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 235
    .line 236
    invoke-static {v1, v4, v5}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    check-cast v4, Lcom/google/android/gms/auth/api/accounttransfer/DeviceMetaData;

    .line 241
    .line 242
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    invoke-virtual {v14, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-object/from16 v20, v4

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :pswitch_5
    sget-object v5, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 253
    .line 254
    invoke-static {v1, v4, v5}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    check-cast v4, Landroid/app/PendingIntent;

    .line 259
    .line 260
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    invoke-virtual {v14, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-object/from16 v19, v4

    .line 268
    .line 269
    goto :goto_4

    .line 270
    :pswitch_6
    invoke-static {v4, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    invoke-virtual {v14, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-object/from16 v18, v4

    .line 282
    .line 283
    goto :goto_4

    .line 284
    :pswitch_7
    invoke-static {v4, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    invoke-virtual {v14, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move/from16 v17, v4

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :pswitch_8
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    invoke-virtual {v14, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-object/from16 v16, v4

    .line 310
    .line 311
    goto :goto_4

    .line 312
    :pswitch_9
    invoke-static {v4, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 313
    .line 314
    .line 315
    move-result v4

    .line 316
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 317
    .line 318
    .line 319
    move-result-object v5

    .line 320
    invoke-virtual {v14, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move v15, v4

    .line 324
    goto :goto_4

    .line 325
    :cond_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    if-ne v3, v0, :cond_c

    .line 330
    .line 331
    new-instance v13, Lcom/google/android/gms/auth/api/accounttransfer/zzw;

    .line 332
    .line 333
    invoke-direct/range {v13 .. v20}, Lcom/google/android/gms/auth/api/accounttransfer/zzw;-><init>(Ljava/util/HashSet;ILjava/lang/String;I[BLandroid/app/PendingIntent;Lcom/google/android/gms/auth/api/accounttransfer/DeviceMetaData;)V

    .line 334
    .line 335
    .line 336
    return-object v13

    .line 337
    :cond_c
    new-instance v3, Lg62;

    .line 338
    .line 339
    invoke-static {v0, v2}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-direct {v3, v0, v1}, Lg62;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    .line 344
    .line 345
    .line 346
    throw v3

    .line 347
    :pswitch_a
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    if-ge v2, v0, :cond_e

    .line 356
    .line 357
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    int-to-char v3, v2

    .line 362
    if-eq v3, v11, :cond_d

    .line 363
    .line 364
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 365
    .line 366
    .line 367
    goto :goto_5

    .line 368
    :cond_d
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 369
    .line 370
    .line 371
    move-result v10

    .line 372
    goto :goto_5

    .line 373
    :cond_e
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 374
    .line 375
    .line 376
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/zzw;

    .line 377
    .line 378
    invoke-direct {v0, v10}, Lcom/google/android/gms/fido/fido2/api/common/zzw;-><init>(Z)V

    .line 379
    .line 380
    .line 381
    return-object v0

    .line 382
    :pswitch_b
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 383
    .line 384
    .line 385
    move-result v0

    .line 386
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 387
    .line 388
    .line 389
    move-result v2

    .line 390
    if-ge v2, v0, :cond_10

    .line 391
    .line 392
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    int-to-char v3, v2

    .line 397
    if-eq v3, v11, :cond_f

    .line 398
    .line 399
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 400
    .line 401
    .line 402
    goto :goto_6

    .line 403
    :cond_f
    sget-object v3, Lcom/google/android/gms/drive/query/internal/FilterHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 404
    .line 405
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    move-object v12, v2

    .line 410
    check-cast v12, Lcom/google/android/gms/drive/query/internal/FilterHolder;

    .line 411
    .line 412
    goto :goto_6

    .line 413
    :cond_10
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 414
    .line 415
    .line 416
    new-instance v0, Lcom/google/android/gms/drive/query/internal/zzv;

    .line 417
    .line 418
    invoke-direct {v0, v12}, Lcom/google/android/gms/drive/query/internal/zzv;-><init>(Lcom/google/android/gms/drive/query/internal/FilterHolder;)V

    .line 419
    .line 420
    .line 421
    return-object v0

    .line 422
    :pswitch_c
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 427
    .line 428
    .line 429
    move-result v2

    .line 430
    if-ge v2, v0, :cond_12

    .line 431
    .line 432
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    int-to-char v3, v2

    .line 437
    if-eq v3, v8, :cond_11

    .line 438
    .line 439
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 440
    .line 441
    .line 442
    goto :goto_7

    .line 443
    :cond_11
    sget-object v3, Lcom/google/android/gms/internal/drive/zzh;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 444
    .line 445
    invoke-static {v1, v2, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 446
    .line 447
    .line 448
    move-result-object v12

    .line 449
    goto :goto_7

    .line 450
    :cond_12
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 451
    .line 452
    .line 453
    new-instance v0, Lcom/google/android/gms/drive/events/zzv;

    .line 454
    .line 455
    invoke-direct {v0, v12}, Lcom/google/android/gms/drive/events/zzv;-><init>(Ljava/util/ArrayList;)V

    .line 456
    .line 457
    .line 458
    return-object v0

    .line 459
    :pswitch_d
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    move v6, v10

    .line 464
    move v7, v6

    .line 465
    move-object v2, v12

    .line 466
    move-object v3, v2

    .line 467
    move-object v4, v3

    .line 468
    move-object v5, v4

    .line 469
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 470
    .line 471
    .line 472
    move-result v8

    .line 473
    if-ge v8, v0, :cond_13

    .line 474
    .line 475
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 476
    .line 477
    .line 478
    move-result v8

    .line 479
    int-to-char v9, v8

    .line 480
    packed-switch v9, :pswitch_data_2

    .line 481
    .line 482
    .line 483
    invoke-static {v8, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 484
    .line 485
    .line 486
    goto :goto_8

    .line 487
    :pswitch_e
    invoke-static {v8, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 488
    .line 489
    .line 490
    move-result v7

    .line 491
    goto :goto_8

    .line 492
    :pswitch_f
    invoke-static {v8, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 493
    .line 494
    .line 495
    move-result v6

    .line 496
    goto :goto_8

    .line 497
    :pswitch_10
    invoke-static {v8, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 498
    .line 499
    .line 500
    move-result-object v5

    .line 501
    goto :goto_8

    .line 502
    :pswitch_11
    invoke-static {v8, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 503
    .line 504
    .line 505
    move-result-object v4

    .line 506
    goto :goto_8

    .line 507
    :pswitch_12
    invoke-static {v8, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v3

    .line 511
    goto :goto_8

    .line 512
    :pswitch_13
    invoke-static {v8, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    goto :goto_8

    .line 517
    :cond_13
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 518
    .line 519
    .line 520
    new-instance v1, Lcom/google/android/gms/fido/fido2/api/common/FidoCredentialDetails;

    .line 521
    .line 522
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/fido/fido2/api/common/FidoCredentialDetails;-><init>(Ljava/lang/String;Ljava/lang/String;[B[BZZ)V

    .line 523
    .line 524
    .line 525
    return-object v1

    .line 526
    :pswitch_14
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    new-instance v14, Ljava/util/HashSet;

    .line 531
    .line 532
    invoke-direct {v14}, Ljava/util/HashSet;-><init>()V

    .line 533
    .line 534
    .line 535
    move v15, v10

    .line 536
    move-object/from16 v16, v12

    .line 537
    .line 538
    move-object/from16 v17, v16

    .line 539
    .line 540
    move-object/from16 v18, v17

    .line 541
    .line 542
    move-object/from16 v19, v18

    .line 543
    .line 544
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 545
    .line 546
    .line 547
    move-result v3

    .line 548
    if-ge v3, v0, :cond_19

    .line 549
    .line 550
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 551
    .line 552
    .line 553
    move-result v3

    .line 554
    int-to-char v4, v3

    .line 555
    if-eq v4, v11, :cond_18

    .line 556
    .line 557
    if-eq v4, v9, :cond_17

    .line 558
    .line 559
    if-eq v4, v8, :cond_16

    .line 560
    .line 561
    if-eq v4, v7, :cond_15

    .line 562
    .line 563
    if-eq v4, v6, :cond_14

    .line 564
    .line 565
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 566
    .line 567
    .line 568
    goto :goto_9

    .line 569
    :cond_14
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v3

    .line 573
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 574
    .line 575
    .line 576
    move-result-object v4

    .line 577
    invoke-virtual {v14, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    move-object/from16 v19, v3

    .line 581
    .line 582
    goto :goto_9

    .line 583
    :cond_15
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v3

    .line 587
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 588
    .line 589
    .line 590
    move-result-object v4

    .line 591
    invoke-virtual {v14, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 592
    .line 593
    .line 594
    move-object/from16 v18, v3

    .line 595
    .line 596
    goto :goto_9

    .line 597
    :cond_16
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v3

    .line 601
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 602
    .line 603
    .line 604
    move-result-object v4

    .line 605
    invoke-virtual {v14, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    move-object/from16 v17, v3

    .line 609
    .line 610
    goto :goto_9

    .line 611
    :cond_17
    sget-object v4, Lcom/google/android/gms/auth/api/accounttransfer/zzw;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 612
    .line 613
    invoke-static {v1, v3, v4}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 614
    .line 615
    .line 616
    move-result-object v3

    .line 617
    check-cast v3, Lcom/google/android/gms/auth/api/accounttransfer/zzw;

    .line 618
    .line 619
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 620
    .line 621
    .line 622
    move-result-object v4

    .line 623
    invoke-virtual {v14, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    move-object/from16 v16, v3

    .line 627
    .line 628
    goto :goto_9

    .line 629
    :cond_18
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 630
    .line 631
    .line 632
    move-result v3

    .line 633
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 634
    .line 635
    .line 636
    move-result-object v4

    .line 637
    invoke-virtual {v14, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    move v15, v3

    .line 641
    goto :goto_9

    .line 642
    :cond_19
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 643
    .line 644
    .line 645
    move-result v3

    .line 646
    if-ne v3, v0, :cond_1a

    .line 647
    .line 648
    new-instance v13, Lcom/google/android/gms/auth/api/accounttransfer/zzu;

    .line 649
    .line 650
    invoke-direct/range {v13 .. v19}, Lcom/google/android/gms/auth/api/accounttransfer/zzu;-><init>(Ljava/util/HashSet;ILcom/google/android/gms/auth/api/accounttransfer/zzw;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    return-object v13

    .line 654
    :cond_1a
    new-instance v3, Lg62;

    .line 655
    .line 656
    invoke-static {v0, v2}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    invoke-direct {v3, v0, v1}, Lg62;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    .line 661
    .line 662
    .line 663
    throw v3

    .line 664
    :pswitch_15
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 665
    .line 666
    .line 667
    move-result v0

    .line 668
    move-object v2, v12

    .line 669
    move-object v3, v2

    .line 670
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 671
    .line 672
    .line 673
    move-result v4

    .line 674
    if-ge v4, v0, :cond_1f

    .line 675
    .line 676
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 677
    .line 678
    .line 679
    move-result v4

    .line 680
    int-to-char v5, v4

    .line 681
    if-eq v5, v11, :cond_1e

    .line 682
    .line 683
    if-eq v5, v9, :cond_1d

    .line 684
    .line 685
    if-eq v5, v8, :cond_1c

    .line 686
    .line 687
    if-eq v5, v7, :cond_1b

    .line 688
    .line 689
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 690
    .line 691
    .line 692
    goto :goto_a

    .line 693
    :cond_1b
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    goto :goto_a

    .line 698
    :cond_1c
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v2

    .line 702
    goto :goto_a

    .line 703
    :cond_1d
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v4

    .line 707
    move-object v12, v4

    .line 708
    goto :goto_a

    .line 709
    :cond_1e
    invoke-static {v4, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 710
    .line 711
    .line 712
    move-result v4

    .line 713
    move v10, v4

    .line 714
    goto :goto_a

    .line 715
    :cond_1f
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 716
    .line 717
    .line 718
    new-instance v0, Lcom/google/android/gms/games/zzt;

    .line 719
    .line 720
    invoke-direct {v0, v10, v12, v2, v3}, Lcom/google/android/gms/games/zzt;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 721
    .line 722
    .line 723
    return-object v0

    .line 724
    :pswitch_16
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 725
    .line 726
    .line 727
    move-result v0

    .line 728
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 729
    .line 730
    .line 731
    move-result v2

    .line 732
    if-ge v2, v0, :cond_21

    .line 733
    .line 734
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 735
    .line 736
    .line 737
    move-result v2

    .line 738
    int-to-char v3, v2

    .line 739
    if-eq v3, v9, :cond_20

    .line 740
    .line 741
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 742
    .line 743
    .line 744
    goto :goto_b

    .line 745
    :cond_20
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v12

    .line 749
    goto :goto_b

    .line 750
    :cond_21
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 751
    .line 752
    .line 753
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/FidoAppIdExtension;

    .line 754
    .line 755
    invoke-direct {v0, v12}, Lcom/google/android/gms/fido/fido2/api/common/FidoAppIdExtension;-><init>(Ljava/lang/String;)V

    .line 756
    .line 757
    .line 758
    return-object v0

    .line 759
    :pswitch_17
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 760
    .line 761
    .line 762
    move-result v0

    .line 763
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 764
    .line 765
    .line 766
    move-result v2

    .line 767
    if-ge v2, v0, :cond_22

    .line 768
    .line 769
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 770
    .line 771
    .line 772
    move-result v2

    .line 773
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 774
    .line 775
    .line 776
    goto :goto_c

    .line 777
    :cond_22
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 778
    .line 779
    .line 780
    new-instance v0, Lcom/google/android/gms/drive/query/internal/zzt;

    .line 781
    .line 782
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 783
    .line 784
    .line 785
    return-object v0

    .line 786
    :pswitch_18
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 787
    .line 788
    .line 789
    move-result v0

    .line 790
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 791
    .line 792
    .line 793
    move-result v2

    .line 794
    if-ge v2, v0, :cond_24

    .line 795
    .line 796
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 797
    .line 798
    .line 799
    move-result v2

    .line 800
    int-to-char v3, v2

    .line 801
    if-eq v3, v9, :cond_23

    .line 802
    .line 803
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 804
    .line 805
    .line 806
    goto :goto_d

    .line 807
    :cond_23
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 808
    .line 809
    .line 810
    move-result v10

    .line 811
    goto :goto_d

    .line 812
    :cond_24
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 813
    .line 814
    .line 815
    new-instance v0, Lcom/google/android/gms/drive/events/zzt;

    .line 816
    .line 817
    invoke-direct {v0, v10}, Lcom/google/android/gms/drive/events/zzt;-><init>(I)V

    .line 818
    .line 819
    .line 820
    return-object v0

    .line 821
    :pswitch_19
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 822
    .line 823
    .line 824
    move-result v0

    .line 825
    move v2, v10

    .line 826
    move-object v3, v12

    .line 827
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 828
    .line 829
    .line 830
    move-result v4

    .line 831
    if-ge v4, v0, :cond_29

    .line 832
    .line 833
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 834
    .line 835
    .line 836
    move-result v4

    .line 837
    int-to-char v5, v4

    .line 838
    if-eq v5, v11, :cond_28

    .line 839
    .line 840
    if-eq v5, v9, :cond_27

    .line 841
    .line 842
    if-eq v5, v8, :cond_26

    .line 843
    .line 844
    if-eq v5, v7, :cond_25

    .line 845
    .line 846
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 847
    .line 848
    .line 849
    goto :goto_e

    .line 850
    :cond_25
    invoke-static {v4, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 851
    .line 852
    .line 853
    move-result v2

    .line 854
    goto :goto_e

    .line 855
    :cond_26
    invoke-static {v4, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 856
    .line 857
    .line 858
    move-result v10

    .line 859
    goto :goto_e

    .line 860
    :cond_27
    invoke-static {v4, v1}, Lqj3;->C(ILandroid/os/Parcel;)Landroid/os/IBinder;

    .line 861
    .line 862
    .line 863
    move-result-object v3

    .line 864
    goto :goto_e

    .line 865
    :cond_28
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v12

    .line 869
    goto :goto_e

    .line 870
    :cond_29
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 871
    .line 872
    .line 873
    new-instance v0, Lcom/google/android/gms/common/zzt;

    .line 874
    .line 875
    invoke-direct {v0, v12, v3, v10, v2}, Lcom/google/android/gms/common/zzt;-><init>(Ljava/lang/String;Landroid/os/IBinder;ZZ)V

    .line 876
    .line 877
    .line 878
    return-object v0

    .line 879
    :pswitch_1a
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 880
    .line 881
    .line 882
    move-result v0

    .line 883
    move v2, v10

    .line 884
    move-object v3, v12

    .line 885
    move-object v4, v3

    .line 886
    move-object v5, v4

    .line 887
    move-object v6, v5

    .line 888
    move-object v7, v6

    .line 889
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 890
    .line 891
    .line 892
    move-result v8

    .line 893
    if-ge v8, v0, :cond_2a

    .line 894
    .line 895
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 896
    .line 897
    .line 898
    move-result v8

    .line 899
    int-to-char v9, v8

    .line 900
    packed-switch v9, :pswitch_data_3

    .line 901
    .line 902
    .line 903
    invoke-static {v8, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 904
    .line 905
    .line 906
    goto :goto_f

    .line 907
    :pswitch_1b
    invoke-static {v8, v1}, Lqj3;->l(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 908
    .line 909
    .line 910
    move-result-object v7

    .line 911
    goto :goto_f

    .line 912
    :pswitch_1c
    invoke-static {v8, v1}, Lqj3;->l(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 913
    .line 914
    .line 915
    move-result-object v6

    .line 916
    goto :goto_f

    .line 917
    :pswitch_1d
    invoke-static {v8, v1}, Lqj3;->l(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 918
    .line 919
    .line 920
    move-result-object v5

    .line 921
    goto :goto_f

    .line 922
    :pswitch_1e
    invoke-static {v8, v1}, Lqj3;->l(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 923
    .line 924
    .line 925
    move-result-object v4

    .line 926
    goto :goto_f

    .line 927
    :pswitch_1f
    invoke-static {v8, v1}, Lqj3;->l(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 928
    .line 929
    .line 930
    move-result-object v3

    .line 931
    goto :goto_f

    .line 932
    :pswitch_20
    invoke-static {v8, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 933
    .line 934
    .line 935
    move-result v2

    .line 936
    goto :goto_f

    .line 937
    :cond_2a
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 938
    .line 939
    .line 940
    new-instance v1, Lcom/google/android/gms/auth/api/accounttransfer/zzs;

    .line 941
    .line 942
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/auth/api/accounttransfer/zzs;-><init>(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 943
    .line 944
    .line 945
    return-object v1

    .line 946
    :pswitch_21
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 947
    .line 948
    .line 949
    move-result v0

    .line 950
    const-wide/16 v2, 0x32

    .line 951
    .line 952
    const/4 v4, 0x0

    .line 953
    const-wide v12, 0x7fffffffffffffffL

    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    const v5, 0x7fffffff

    .line 959
    .line 960
    .line 961
    move-wide/from16 v16, v2

    .line 962
    .line 963
    move/from16 v18, v4

    .line 964
    .line 965
    move/from16 v21, v5

    .line 966
    .line 967
    move v15, v11

    .line 968
    move-wide/from16 v19, v12

    .line 969
    .line 970
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 971
    .line 972
    .line 973
    move-result v2

    .line 974
    if-ge v2, v0, :cond_30

    .line 975
    .line 976
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 977
    .line 978
    .line 979
    move-result v2

    .line 980
    int-to-char v3, v2

    .line 981
    if-eq v3, v11, :cond_2f

    .line 982
    .line 983
    if-eq v3, v9, :cond_2e

    .line 984
    .line 985
    if-eq v3, v8, :cond_2d

    .line 986
    .line 987
    if-eq v3, v7, :cond_2c

    .line 988
    .line 989
    if-eq v3, v6, :cond_2b

    .line 990
    .line 991
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 992
    .line 993
    .line 994
    goto :goto_10

    .line 995
    :cond_2b
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 996
    .line 997
    .line 998
    move-result v2

    .line 999
    move/from16 v21, v2

    .line 1000
    .line 1001
    goto :goto_10

    .line 1002
    :cond_2c
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1003
    .line 1004
    .line 1005
    move-result-wide v2

    .line 1006
    move-wide/from16 v19, v2

    .line 1007
    .line 1008
    goto :goto_10

    .line 1009
    :cond_2d
    invoke-static {v2, v1}, Lqj3;->B(ILandroid/os/Parcel;)F

    .line 1010
    .line 1011
    .line 1012
    move-result v2

    .line 1013
    move/from16 v18, v2

    .line 1014
    .line 1015
    goto :goto_10

    .line 1016
    :cond_2e
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1017
    .line 1018
    .line 1019
    move-result-wide v2

    .line 1020
    move-wide/from16 v16, v2

    .line 1021
    .line 1022
    goto :goto_10

    .line 1023
    :cond_2f
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1024
    .line 1025
    .line 1026
    move-result v15

    .line 1027
    goto :goto_10

    .line 1028
    :cond_30
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1029
    .line 1030
    .line 1031
    new-instance v14, Lcom/google/android/gms/location/zzs;

    .line 1032
    .line 1033
    invoke-direct/range {v14 .. v21}, Lcom/google/android/gms/location/zzs;-><init>(ZJFJI)V

    .line 1034
    .line 1035
    .line 1036
    return-object v14

    .line 1037
    :pswitch_22
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1038
    .line 1039
    .line 1040
    move-result v0

    .line 1041
    :try_start_0
    invoke-static {v0}, Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;->a(I)Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v12
    :try_end_0
    .catch Lpe0; {:try_start_0 .. :try_end_0} :catch_0

    .line 1045
    goto :goto_11

    .line 1046
    :catch_0
    move-exception v0

    .line 1047
    invoke-static {v0}, Ln4;->n(Ljava/lang/Throwable;)V

    .line 1048
    .line 1049
    .line 1050
    :goto_11
    return-object v12

    .line 1051
    :pswitch_23
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1052
    .line 1053
    .line 1054
    move-result v0

    .line 1055
    move v14, v10

    .line 1056
    move-object v15, v12

    .line 1057
    move-object/from16 v16, v15

    .line 1058
    .line 1059
    move-object/from16 v17, v16

    .line 1060
    .line 1061
    move-object/from16 v18, v17

    .line 1062
    .line 1063
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1064
    .line 1065
    .line 1066
    move-result v2

    .line 1067
    if-ge v2, v0, :cond_36

    .line 1068
    .line 1069
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1070
    .line 1071
    .line 1072
    move-result v2

    .line 1073
    int-to-char v4, v2

    .line 1074
    if-eq v4, v9, :cond_35

    .line 1075
    .line 1076
    if-eq v4, v8, :cond_34

    .line 1077
    .line 1078
    if-eq v4, v7, :cond_33

    .line 1079
    .line 1080
    if-eq v4, v6, :cond_32

    .line 1081
    .line 1082
    if-eq v4, v3, :cond_31

    .line 1083
    .line 1084
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1085
    .line 1086
    .line 1087
    goto :goto_12

    .line 1088
    :cond_31
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v18

    .line 1092
    goto :goto_12

    .line 1093
    :cond_32
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1094
    .line 1095
    .line 1096
    move-result v14

    .line 1097
    goto :goto_12

    .line 1098
    :cond_33
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v17

    .line 1102
    goto :goto_12

    .line 1103
    :cond_34
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v16

    .line 1107
    goto :goto_12

    .line 1108
    :cond_35
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v15

    .line 1112
    goto :goto_12

    .line 1113
    :cond_36
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1114
    .line 1115
    .line 1116
    new-instance v13, Lcom/google/android/gms/drive/UserMetadata;

    .line 1117
    .line 1118
    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/drive/UserMetadata;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1119
    .line 1120
    .line 1121
    return-object v13

    .line 1122
    :pswitch_24
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1123
    .line 1124
    .line 1125
    move-result v0

    .line 1126
    move-wide v14, v4

    .line 1127
    move-wide/from16 v16, v14

    .line 1128
    .line 1129
    move-object/from16 v18, v12

    .line 1130
    .line 1131
    move-object/from16 v19, v18

    .line 1132
    .line 1133
    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1134
    .line 1135
    .line 1136
    move-result v2

    .line 1137
    if-ge v2, v0, :cond_3b

    .line 1138
    .line 1139
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1140
    .line 1141
    .line 1142
    move-result v2

    .line 1143
    int-to-char v3, v2

    .line 1144
    if-eq v3, v11, :cond_3a

    .line 1145
    .line 1146
    if-eq v3, v9, :cond_39

    .line 1147
    .line 1148
    if-eq v3, v8, :cond_38

    .line 1149
    .line 1150
    if-eq v3, v7, :cond_37

    .line 1151
    .line 1152
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1153
    .line 1154
    .line 1155
    goto :goto_13

    .line 1156
    :cond_37
    sget-object v3, Lcom/google/android/gms/games/PlayerLevel;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1157
    .line 1158
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v2

    .line 1162
    check-cast v2, Lcom/google/android/gms/games/PlayerLevel;

    .line 1163
    .line 1164
    move-object/from16 v19, v2

    .line 1165
    .line 1166
    goto :goto_13

    .line 1167
    :cond_38
    sget-object v3, Lcom/google/android/gms/games/PlayerLevel;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1168
    .line 1169
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v2

    .line 1173
    check-cast v2, Lcom/google/android/gms/games/PlayerLevel;

    .line 1174
    .line 1175
    move-object/from16 v18, v2

    .line 1176
    .line 1177
    goto :goto_13

    .line 1178
    :cond_39
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1179
    .line 1180
    .line 1181
    move-result-wide v2

    .line 1182
    move-wide/from16 v16, v2

    .line 1183
    .line 1184
    goto :goto_13

    .line 1185
    :cond_3a
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1186
    .line 1187
    .line 1188
    move-result-wide v2

    .line 1189
    move-wide v14, v2

    .line 1190
    goto :goto_13

    .line 1191
    :cond_3b
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1192
    .line 1193
    .line 1194
    new-instance v13, Lcom/google/android/gms/games/PlayerLevelInfo;

    .line 1195
    .line 1196
    invoke-direct/range {v13 .. v19}, Lcom/google/android/gms/games/PlayerLevelInfo;-><init>(JJLcom/google/android/gms/games/PlayerLevel;Lcom/google/android/gms/games/PlayerLevel;)V

    .line 1197
    .line 1198
    .line 1199
    return-object v13

    .line 1200
    :pswitch_25
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1201
    .line 1202
    .line 1203
    move-result v0

    .line 1204
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1205
    .line 1206
    .line 1207
    move-result v2

    .line 1208
    if-ge v2, v0, :cond_3d

    .line 1209
    .line 1210
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1211
    .line 1212
    .line 1213
    move-result v2

    .line 1214
    int-to-char v3, v2

    .line 1215
    if-eq v3, v11, :cond_3c

    .line 1216
    .line 1217
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1218
    .line 1219
    .line 1220
    goto :goto_14

    .line 1221
    :cond_3c
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1222
    .line 1223
    .line 1224
    move-result v10

    .line 1225
    goto :goto_14

    .line 1226
    :cond_3d
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1227
    .line 1228
    .line 1229
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/zzr;

    .line 1230
    .line 1231
    invoke-direct {v0, v10}, Lcom/google/android/gms/fido/fido2/api/common/zzr;-><init>(Z)V

    .line 1232
    .line 1233
    .line 1234
    return-object v0

    .line 1235
    :pswitch_26
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1236
    .line 1237
    .line 1238
    move-result v0

    .line 1239
    move-object v2, v12

    .line 1240
    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1241
    .line 1242
    .line 1243
    move-result v3

    .line 1244
    if-ge v3, v0, :cond_40

    .line 1245
    .line 1246
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1247
    .line 1248
    .line 1249
    move-result v3

    .line 1250
    int-to-char v4, v3

    .line 1251
    if-eq v4, v11, :cond_3f

    .line 1252
    .line 1253
    if-eq v4, v9, :cond_3e

    .line 1254
    .line 1255
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1256
    .line 1257
    .line 1258
    goto :goto_15

    .line 1259
    :cond_3e
    sget-object v2, Lcom/google/android/gms/drive/query/internal/FilterHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1260
    .line 1261
    invoke-static {v1, v3, v2}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v2

    .line 1265
    goto :goto_15

    .line 1266
    :cond_3f
    sget-object v4, Lcom/google/android/gms/drive/query/internal/zzx;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1267
    .line 1268
    invoke-static {v1, v3, v4}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v3

    .line 1272
    move-object v12, v3

    .line 1273
    check-cast v12, Lcom/google/android/gms/drive/query/internal/zzx;

    .line 1274
    .line 1275
    goto :goto_15

    .line 1276
    :cond_40
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1277
    .line 1278
    .line 1279
    new-instance v0, Lcom/google/android/gms/drive/query/internal/zzr;

    .line 1280
    .line 1281
    invoke-direct {v0, v12, v2}, Lcom/google/android/gms/drive/query/internal/zzr;-><init>(Lcom/google/android/gms/drive/query/internal/zzx;Ljava/util/ArrayList;)V

    .line 1282
    .line 1283
    .line 1284
    return-object v0

    .line 1285
    :pswitch_27
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1286
    .line 1287
    .line 1288
    move-result v0

    .line 1289
    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1290
    .line 1291
    .line 1292
    move-result v2

    .line 1293
    if-ge v2, v0, :cond_42

    .line 1294
    .line 1295
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1296
    .line 1297
    .line 1298
    move-result v2

    .line 1299
    int-to-char v3, v2

    .line 1300
    if-eq v3, v9, :cond_41

    .line 1301
    .line 1302
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1303
    .line 1304
    .line 1305
    goto :goto_16

    .line 1306
    :cond_41
    sget-object v3, Lcom/google/android/gms/internal/drive/zzh;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1307
    .line 1308
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v2

    .line 1312
    move-object v12, v2

    .line 1313
    check-cast v12, Lcom/google/android/gms/internal/drive/zzh;

    .line 1314
    .line 1315
    goto :goto_16

    .line 1316
    :cond_42
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1317
    .line 1318
    .line 1319
    new-instance v0, Lcom/google/android/gms/drive/events/zzr;

    .line 1320
    .line 1321
    invoke-direct {v0, v12}, Lcom/google/android/gms/drive/events/zzr;-><init>(Lcom/google/android/gms/internal/drive/zzh;)V

    .line 1322
    .line 1323
    .line 1324
    return-object v0

    .line 1325
    :pswitch_28
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1326
    .line 1327
    .line 1328
    move-result v0

    .line 1329
    move v2, v10

    .line 1330
    move v3, v2

    .line 1331
    move-object v4, v12

    .line 1332
    move-object v5, v4

    .line 1333
    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1334
    .line 1335
    .line 1336
    move-result v6

    .line 1337
    if-ge v6, v0, :cond_43

    .line 1338
    .line 1339
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1340
    .line 1341
    .line 1342
    move-result v6

    .line 1343
    int-to-char v7, v6

    .line 1344
    packed-switch v7, :pswitch_data_4

    .line 1345
    .line 1346
    .line 1347
    invoke-static {v6, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1348
    .line 1349
    .line 1350
    goto :goto_17

    .line 1351
    :pswitch_29
    invoke-static {v6, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1352
    .line 1353
    .line 1354
    move-result v3

    .line 1355
    goto :goto_17

    .line 1356
    :pswitch_2a
    invoke-static {v6, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1357
    .line 1358
    .line 1359
    move-result v2

    .line 1360
    goto :goto_17

    .line 1361
    :pswitch_2b
    invoke-static {v6, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v5

    .line 1365
    goto :goto_17

    .line 1366
    :pswitch_2c
    invoke-static {v6, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v4

    .line 1370
    goto :goto_17

    .line 1371
    :pswitch_2d
    invoke-static {v6, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1372
    .line 1373
    .line 1374
    move-result v10

    .line 1375
    goto :goto_17

    .line 1376
    :pswitch_2e
    invoke-static {v6, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v12

    .line 1380
    goto :goto_17

    .line 1381
    :cond_43
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1382
    .line 1383
    .line 1384
    new-instance v0, Lcom/google/android/gms/drive/zzr;

    .line 1385
    .line 1386
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1387
    .line 1388
    .line 1389
    iput-object v12, v0, Lcom/google/android/gms/drive/zzr;->a:Ljava/lang/String;

    .line 1390
    .line 1391
    iput v10, v0, Lcom/google/android/gms/drive/zzr;->b:I

    .line 1392
    .line 1393
    iput-object v4, v0, Lcom/google/android/gms/drive/zzr;->c:Ljava/lang/String;

    .line 1394
    .line 1395
    iput-object v5, v0, Lcom/google/android/gms/drive/zzr;->d:Ljava/lang/String;

    .line 1396
    .line 1397
    iput v2, v0, Lcom/google/android/gms/drive/zzr;->e:I

    .line 1398
    .line 1399
    iput-boolean v3, v0, Lcom/google/android/gms/drive/zzr;->f:Z

    .line 1400
    .line 1401
    return-object v0

    .line 1402
    :pswitch_2f
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1403
    .line 1404
    .line 1405
    move-result v0

    .line 1406
    const-wide/16 v2, -0x1

    .line 1407
    .line 1408
    move-wide/from16 v18, v2

    .line 1409
    .line 1410
    move v14, v10

    .line 1411
    move/from16 v16, v14

    .line 1412
    .line 1413
    move/from16 v17, v16

    .line 1414
    .line 1415
    move-object v15, v12

    .line 1416
    :goto_18
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1417
    .line 1418
    .line 1419
    move-result v2

    .line 1420
    if-ge v2, v0, :cond_49

    .line 1421
    .line 1422
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1423
    .line 1424
    .line 1425
    move-result v2

    .line 1426
    int-to-char v3, v2

    .line 1427
    if-eq v3, v11, :cond_48

    .line 1428
    .line 1429
    if-eq v3, v9, :cond_47

    .line 1430
    .line 1431
    if-eq v3, v8, :cond_46

    .line 1432
    .line 1433
    if-eq v3, v7, :cond_45

    .line 1434
    .line 1435
    if-eq v3, v6, :cond_44

    .line 1436
    .line 1437
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1438
    .line 1439
    .line 1440
    goto :goto_18

    .line 1441
    :cond_44
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1442
    .line 1443
    .line 1444
    move-result-wide v2

    .line 1445
    move-wide/from16 v18, v2

    .line 1446
    .line 1447
    goto :goto_18

    .line 1448
    :cond_45
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1449
    .line 1450
    .line 1451
    move-result v2

    .line 1452
    move/from16 v17, v2

    .line 1453
    .line 1454
    goto :goto_18

    .line 1455
    :cond_46
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1456
    .line 1457
    .line 1458
    move-result v2

    .line 1459
    move/from16 v16, v2

    .line 1460
    .line 1461
    goto :goto_18

    .line 1462
    :cond_47
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v2

    .line 1466
    move-object v15, v2

    .line 1467
    goto :goto_18

    .line 1468
    :cond_48
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1469
    .line 1470
    .line 1471
    move-result v2

    .line 1472
    move v14, v2

    .line 1473
    goto :goto_18

    .line 1474
    :cond_49
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1475
    .line 1476
    .line 1477
    new-instance v13, Lcom/google/android/gms/common/zzr;

    .line 1478
    .line 1479
    invoke-direct/range {v13 .. v19}, Lcom/google/android/gms/common/zzr;-><init>(ZLjava/lang/String;IIJ)V

    .line 1480
    .line 1481
    .line 1482
    return-object v13

    .line 1483
    :pswitch_30
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1484
    .line 1485
    .line 1486
    move-result v0

    .line 1487
    const-string v2, ""

    .line 1488
    .line 1489
    const/16 v3, 0x64

    .line 1490
    .line 1491
    const-wide/32 v6, -0x80000000

    .line 1492
    .line 1493
    .line 1494
    move-object/from16 v37, v2

    .line 1495
    .line 1496
    move-object/from16 v38, v37

    .line 1497
    .line 1498
    move-object/from16 v44, v38

    .line 1499
    .line 1500
    move-object/from16 v49, v44

    .line 1501
    .line 1502
    move/from16 v43, v3

    .line 1503
    .line 1504
    move-wide/from16 v18, v4

    .line 1505
    .line 1506
    move-wide/from16 v20, v18

    .line 1507
    .line 1508
    move-wide/from16 v28, v20

    .line 1509
    .line 1510
    move-wide/from16 v34, v28

    .line 1511
    .line 1512
    move-wide/from16 v41, v34

    .line 1513
    .line 1514
    move-wide/from16 v46, v41

    .line 1515
    .line 1516
    move-wide/from16 v50, v46

    .line 1517
    .line 1518
    move-wide/from16 v25, v6

    .line 1519
    .line 1520
    move/from16 v24, v10

    .line 1521
    .line 1522
    move/from16 v30, v24

    .line 1523
    .line 1524
    move/from16 v32, v30

    .line 1525
    .line 1526
    move/from16 v40, v32

    .line 1527
    .line 1528
    move/from16 v45, v40

    .line 1529
    .line 1530
    move/from16 v52, v45

    .line 1531
    .line 1532
    move/from16 v23, v11

    .line 1533
    .line 1534
    move/from16 v31, v23

    .line 1535
    .line 1536
    move-object v14, v12

    .line 1537
    move-object v15, v14

    .line 1538
    move-object/from16 v16, v15

    .line 1539
    .line 1540
    move-object/from16 v17, v16

    .line 1541
    .line 1542
    move-object/from16 v22, v17

    .line 1543
    .line 1544
    move-object/from16 v27, v22

    .line 1545
    .line 1546
    move-object/from16 v33, v27

    .line 1547
    .line 1548
    move-object/from16 v36, v33

    .line 1549
    .line 1550
    move-object/from16 v39, v36

    .line 1551
    .line 1552
    move-object/from16 v48, v39

    .line 1553
    .line 1554
    :goto_19
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1555
    .line 1556
    .line 1557
    move-result v2

    .line 1558
    if-ge v2, v0, :cond_4a

    .line 1559
    .line 1560
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1561
    .line 1562
    .line 1563
    move-result v2

    .line 1564
    int-to-char v3, v2

    .line 1565
    packed-switch v3, :pswitch_data_5

    .line 1566
    .line 1567
    .line 1568
    :pswitch_31
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1569
    .line 1570
    .line 1571
    goto :goto_19

    .line 1572
    :pswitch_32
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1573
    .line 1574
    .line 1575
    move-result v2

    .line 1576
    move/from16 v52, v2

    .line 1577
    .line 1578
    goto :goto_19

    .line 1579
    :pswitch_33
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1580
    .line 1581
    .line 1582
    move-result-wide v2

    .line 1583
    move-wide/from16 v50, v2

    .line 1584
    .line 1585
    goto :goto_19

    .line 1586
    :pswitch_34
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v2

    .line 1590
    move-object/from16 v49, v2

    .line 1591
    .line 1592
    goto :goto_19

    .line 1593
    :pswitch_35
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v2

    .line 1597
    move-object/from16 v48, v2

    .line 1598
    .line 1599
    goto :goto_19

    .line 1600
    :pswitch_36
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1601
    .line 1602
    .line 1603
    move-result-wide v2

    .line 1604
    move-wide/from16 v46, v2

    .line 1605
    .line 1606
    goto :goto_19

    .line 1607
    :pswitch_37
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1608
    .line 1609
    .line 1610
    move-result v2

    .line 1611
    move/from16 v45, v2

    .line 1612
    .line 1613
    goto :goto_19

    .line 1614
    :pswitch_38
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v2

    .line 1618
    move-object/from16 v44, v2

    .line 1619
    .line 1620
    goto :goto_19

    .line 1621
    :pswitch_39
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1622
    .line 1623
    .line 1624
    move-result v2

    .line 1625
    move/from16 v43, v2

    .line 1626
    .line 1627
    goto :goto_19

    .line 1628
    :pswitch_3a
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1629
    .line 1630
    .line 1631
    move-result-wide v2

    .line 1632
    move-wide/from16 v41, v2

    .line 1633
    .line 1634
    goto :goto_19

    .line 1635
    :pswitch_3b
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1636
    .line 1637
    .line 1638
    move-result v2

    .line 1639
    move/from16 v40, v2

    .line 1640
    .line 1641
    goto :goto_19

    .line 1642
    :pswitch_3c
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v2

    .line 1646
    move-object/from16 v39, v2

    .line 1647
    .line 1648
    goto :goto_19

    .line 1649
    :pswitch_3d
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v2

    .line 1653
    move-object/from16 v38, v2

    .line 1654
    .line 1655
    goto :goto_19

    .line 1656
    :pswitch_3e
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v2

    .line 1660
    move-object/from16 v37, v2

    .line 1661
    .line 1662
    goto :goto_19

    .line 1663
    :pswitch_3f
    invoke-static {v2, v1}, Lqj3;->l(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v2

    .line 1667
    move-object/from16 v36, v2

    .line 1668
    .line 1669
    goto :goto_19

    .line 1670
    :pswitch_40
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1671
    .line 1672
    .line 1673
    move-result-wide v2

    .line 1674
    move-wide/from16 v34, v2

    .line 1675
    .line 1676
    goto :goto_19

    .line 1677
    :pswitch_41
    invoke-static {v2, v1}, Lqj3;->z(ILandroid/os/Parcel;)Ljava/lang/Boolean;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v2

    .line 1681
    move-object/from16 v33, v2

    .line 1682
    .line 1683
    goto/16 :goto_19

    .line 1684
    .line 1685
    :pswitch_42
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1686
    .line 1687
    .line 1688
    move-result v2

    .line 1689
    move/from16 v32, v2

    .line 1690
    .line 1691
    goto/16 :goto_19

    .line 1692
    .line 1693
    :pswitch_43
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1694
    .line 1695
    .line 1696
    move-result v2

    .line 1697
    move/from16 v31, v2

    .line 1698
    .line 1699
    goto/16 :goto_19

    .line 1700
    .line 1701
    :pswitch_44
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1702
    .line 1703
    .line 1704
    move-result v2

    .line 1705
    move/from16 v30, v2

    .line 1706
    .line 1707
    goto/16 :goto_19

    .line 1708
    .line 1709
    :pswitch_45
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1710
    .line 1711
    .line 1712
    move-result-wide v2

    .line 1713
    move-wide/from16 v28, v2

    .line 1714
    .line 1715
    goto/16 :goto_19

    .line 1716
    .line 1717
    :pswitch_46
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v2

    .line 1721
    move-object/from16 v27, v2

    .line 1722
    .line 1723
    goto/16 :goto_19

    .line 1724
    .line 1725
    :pswitch_47
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1726
    .line 1727
    .line 1728
    move-result-wide v2

    .line 1729
    move-wide/from16 v25, v2

    .line 1730
    .line 1731
    goto/16 :goto_19

    .line 1732
    .line 1733
    :pswitch_48
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1734
    .line 1735
    .line 1736
    move-result v2

    .line 1737
    move/from16 v24, v2

    .line 1738
    .line 1739
    goto/16 :goto_19

    .line 1740
    .line 1741
    :pswitch_49
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1742
    .line 1743
    .line 1744
    move-result v2

    .line 1745
    move/from16 v23, v2

    .line 1746
    .line 1747
    goto/16 :goto_19

    .line 1748
    .line 1749
    :pswitch_4a
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v2

    .line 1753
    move-object/from16 v22, v2

    .line 1754
    .line 1755
    goto/16 :goto_19

    .line 1756
    .line 1757
    :pswitch_4b
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1758
    .line 1759
    .line 1760
    move-result-wide v2

    .line 1761
    move-wide/from16 v20, v2

    .line 1762
    .line 1763
    goto/16 :goto_19

    .line 1764
    .line 1765
    :pswitch_4c
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1766
    .line 1767
    .line 1768
    move-result-wide v2

    .line 1769
    move-wide/from16 v18, v2

    .line 1770
    .line 1771
    goto/16 :goto_19

    .line 1772
    .line 1773
    :pswitch_4d
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1774
    .line 1775
    .line 1776
    move-result-object v2

    .line 1777
    move-object/from16 v17, v2

    .line 1778
    .line 1779
    goto/16 :goto_19

    .line 1780
    .line 1781
    :pswitch_4e
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v2

    .line 1785
    move-object/from16 v16, v2

    .line 1786
    .line 1787
    goto/16 :goto_19

    .line 1788
    .line 1789
    :pswitch_4f
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v2

    .line 1793
    move-object v15, v2

    .line 1794
    goto/16 :goto_19

    .line 1795
    .line 1796
    :pswitch_50
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v2

    .line 1800
    move-object v14, v2

    .line 1801
    goto/16 :goto_19

    .line 1802
    .line 1803
    :cond_4a
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1804
    .line 1805
    .line 1806
    new-instance v13, Lcom/google/android/gms/measurement/internal/zzr;

    .line 1807
    .line 1808
    invoke-direct/range {v13 .. v52}, Lcom/google/android/gms/measurement/internal/zzr;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;ZZJLjava/lang/String;JIZZLjava/lang/Boolean;JLjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;JI)V

    .line 1809
    .line 1810
    .line 1811
    return-object v13

    .line 1812
    nop

    .line 1813
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_30
        :pswitch_2f
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    .line 1884
    .line 1885
    .line 1886
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x2
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x2
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_31
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_31
        :pswitch_42
        :pswitch_31
        :pswitch_31
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_31
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_31
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Ldr3;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/zzy;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lcom/google/android/gms/auth/api/accounttransfer/DeviceMetaData;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lcom/google/android/gms/drive/query/internal/zzx;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lcom/google/android/gms/drive/events/zzx;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lcom/google/android/gms/auth/api/accounttransfer/zzw;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/zzw;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lcom/google/android/gms/drive/query/internal/zzv;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lcom/google/android/gms/drive/events/zzv;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/FidoCredentialDetails;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lcom/google/android/gms/auth/api/accounttransfer/zzu;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lcom/google/android/gms/games/zzt;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/FidoAppIdExtension;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lcom/google/android/gms/drive/query/internal/zzt;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lcom/google/android/gms/drive/events/zzt;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lcom/google/android/gms/common/zzt;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lcom/google/android/gms/auth/api/accounttransfer/zzs;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lcom/google/android/gms/location/zzs;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lcom/google/android/gms/drive/UserMetadata;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lcom/google/android/gms/games/PlayerLevelInfo;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/zzr;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lcom/google/android/gms/drive/query/internal/zzr;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lcom/google/android/gms/drive/events/zzr;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lcom/google/android/gms/drive/zzr;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lcom/google/android/gms/common/zzr;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzr;

    .line 82
    .line 83
    return-object p0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
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

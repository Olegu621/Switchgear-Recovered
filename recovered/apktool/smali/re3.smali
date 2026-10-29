.class public final Lre3;
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
    iput p1, p0, Lre3;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static a(Lcom/google/android/gms/measurement/internal/zzbg;Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbg;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/16 v1, 0x4f45

    .line 4
    .line 5
    invoke-static {v1, p1}, Lw11;->c0(ILandroid/os/Parcel;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v2, v0, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x3

    .line 15
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzbg;->b:Lcom/google/android/gms/measurement/internal/zzbe;

    .line 16
    .line 17
    invoke-static {p1, v0, v2, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 18
    .line 19
    .line 20
    const/4 p2, 0x4

    .line 21
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbg;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p1, p2, v0, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    iget-wide v2, p0, Lcom/google/android/gms/measurement/internal/zzbg;->d:J

    .line 27
    .line 28
    const/16 p0, 0x8

    .line 29
    .line 30
    const/4 p2, 0x5

    .line 31
    invoke-static {p1, p2, p0}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1, p1}, Lw11;->f0(ILandroid/os/Parcel;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Lre3;->a:I

    .line 6
    .line 7
    const-string v2, ""

    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    const/4 v5, 0x5

    .line 12
    const/4 v6, 0x4

    .line 13
    const/4 v7, 0x3

    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v10, 0x1

    .line 17
    const/4 v11, 0x2

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    move-object v2, v9

    .line 26
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-ge v3, v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    int-to-char v4, v3

    .line 37
    if-eq v4, v11, :cond_1

    .line 38
    .line 39
    if-eq v4, v7, :cond_0

    .line 40
    .line 41
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    sget-object v4, Lcom/google/android/gms/drive/metadata/CustomPropertyKey;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 51
    .line 52
    invoke-static {v1, v3, v4}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    move-object v9, v3

    .line 57
    check-cast v9, Lcom/google/android/gms/drive/metadata/CustomPropertyKey;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 61
    .line 62
    .line 63
    new-instance v0, Lcom/google/android/gms/drive/metadata/internal/zzc;

    .line 64
    .line 65
    invoke-direct {v0, v9, v2}, Lcom/google/android/gms/drive/metadata/internal/zzc;-><init>(Lcom/google/android/gms/drive/metadata/CustomPropertyKey;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_0
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-ge v2, v0, :cond_5

    .line 78
    .line 79
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    int-to-char v3, v2

    .line 84
    if-eq v3, v10, :cond_4

    .line 85
    .line 86
    if-eq v3, v11, :cond_3

    .line 87
    .line 88
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    goto :goto_1

    .line 97
    :cond_4
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    goto :goto_1

    .line 102
    :cond_5
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 103
    .line 104
    .line 105
    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    .line 106
    .line 107
    invoke-direct {v0, v8, v9}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-object v0

    .line 111
    :pswitch_1
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-ge v2, v0, :cond_7

    .line 120
    .line 121
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    int-to-char v3, v2

    .line 126
    if-eq v3, v10, :cond_6

    .line 127
    .line 128
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_6
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    goto :goto_2

    .line 137
    :cond_7
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 138
    .line 139
    .line 140
    new-instance v0, Lcom/google/android/gms/recaptchabase/ExecuteResult;

    .line 141
    .line 142
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 143
    .line 144
    .line 145
    iput-object v9, v0, Lcom/google/android/gms/recaptchabase/ExecuteResult;->a:Ljava/lang/String;

    .line 146
    .line 147
    return-object v0

    .line 148
    :pswitch_2
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    const/4 v2, 0x0

    .line 153
    move/from16 v22, v2

    .line 154
    .line 155
    move-wide/from16 v18, v3

    .line 156
    .line 157
    move-wide/from16 v20, v18

    .line 158
    .line 159
    move-wide/from16 v25, v20

    .line 160
    .line 161
    move/from16 v24, v8

    .line 162
    .line 163
    move-object v11, v9

    .line 164
    move-object v12, v11

    .line 165
    move-object v13, v12

    .line 166
    move-object v14, v13

    .line 167
    move-object v15, v14

    .line 168
    move-object/from16 v16, v15

    .line 169
    .line 170
    move-object/from16 v17, v16

    .line 171
    .line 172
    move-object/from16 v23, v17

    .line 173
    .line 174
    move-object/from16 v27, v23

    .line 175
    .line 176
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-ge v2, v0, :cond_8

    .line 181
    .line 182
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    int-to-char v3, v2

    .line 187
    packed-switch v3, :pswitch_data_1

    .line 188
    .line 189
    .line 190
    :pswitch_3
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 191
    .line 192
    .line 193
    goto :goto_3

    .line 194
    :pswitch_4
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    move-object/from16 v27, v2

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :pswitch_5
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 202
    .line 203
    .line 204
    move-result-wide v2

    .line 205
    move-wide/from16 v25, v2

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :pswitch_6
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    move/from16 v24, v2

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :pswitch_7
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    move-object/from16 v23, v2

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :pswitch_8
    invoke-static {v2, v1}, Lqj3;->B(ILandroid/os/Parcel;)F

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    move/from16 v22, v2

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :pswitch_9
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 230
    .line 231
    .line 232
    move-result-wide v2

    .line 233
    move-wide/from16 v20, v2

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :pswitch_a
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 237
    .line 238
    .line 239
    move-result-wide v2

    .line 240
    move-wide/from16 v18, v2

    .line 241
    .line 242
    goto :goto_3

    .line 243
    :pswitch_b
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    move-object/from16 v17, v2

    .line 248
    .line 249
    goto :goto_3

    .line 250
    :pswitch_c
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    move-object/from16 v16, v2

    .line 255
    .line 256
    goto :goto_3

    .line 257
    :pswitch_d
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    move-object v15, v2

    .line 262
    goto :goto_3

    .line 263
    :pswitch_e
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 264
    .line 265
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    check-cast v2, Landroid/net/Uri;

    .line 270
    .line 271
    move-object v14, v2

    .line 272
    goto :goto_3

    .line 273
    :pswitch_f
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    move-object v13, v2

    .line 278
    goto :goto_3

    .line 279
    :pswitch_10
    sget-object v3, Lcom/google/android/gms/games/PlayerEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 280
    .line 281
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    check-cast v2, Lcom/google/android/gms/games/PlayerEntity;

    .line 286
    .line 287
    move-object v12, v2

    .line 288
    goto :goto_3

    .line 289
    :pswitch_11
    sget-object v3, Lcom/google/android/gms/games/GameEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 290
    .line 291
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    check-cast v2, Lcom/google/android/gms/games/GameEntity;

    .line 296
    .line 297
    move-object v11, v2

    .line 298
    goto :goto_3

    .line 299
    :cond_8
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 300
    .line 301
    .line 302
    new-instance v10, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;

    .line 303
    .line 304
    invoke-direct/range {v10 .. v27}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;-><init>(Lcom/google/android/gms/games/GameEntity;Lcom/google/android/gms/games/PlayerEntity;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJFLjava/lang/String;ZJLjava/lang/String;)V

    .line 305
    .line 306
    .line 307
    return-object v10

    .line 308
    :pswitch_12
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 309
    .line 310
    .line 311
    move-result-wide v4

    .line 312
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    neg-int v0, v0

    .line 317
    invoke-static {v0, v1}, Lcom/google/android/libraries/play/games/internal/zzcv;->a(ILandroid/os/Parcel;)Lsr3;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    move-object v3, v2

    .line 322
    invoke-static {v1}, Lcom/google/android/libraries/play/games/internal/zzcv;->b(Landroid/os/Parcel;)Ljava/util/HashSet;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-static {v0, v1}, Lcom/google/android/libraries/play/games/internal/zzcv;->d(ILandroid/os/Parcel;)Lig3;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    move-object v1, v3

    .line 331
    move-object v3, v0

    .line 332
    new-instance v0, Lcom/google/android/libraries/play/games/internal/zzcv;

    .line 333
    .line 334
    invoke-direct/range {v0 .. v5}, Lcom/google/android/libraries/play/games/internal/zzcv;-><init>(Lsr3;Ljava/util/HashSet;Lig3;J)V

    .line 335
    .line 336
    .line 337
    return-object v0

    .line 338
    :pswitch_13
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 339
    .line 340
    .line 341
    move-result-wide v5

    .line 342
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    neg-int v0, v0

    .line 347
    invoke-static {v0, v1}, Lcom/google/android/libraries/play/games/internal/zzcv;->a(ILandroid/os/Parcel;)Lsr3;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    invoke-static {v1}, Lcom/google/android/libraries/play/games/internal/zzcv;->b(Landroid/os/Parcel;)Ljava/util/HashSet;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    invoke-static {v0, v1}, Lcom/google/android/libraries/play/games/internal/zzcv;->d(ILandroid/os/Parcel;)Lig3;

    .line 356
    .line 357
    .line 358
    move-result-object v4

    .line 359
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 360
    .line 361
    .line 362
    move-result-wide v7

    .line 363
    const-class v0, Lcom/google/android/libraries/play/games/internal/zzcl;

    .line 364
    .line 365
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    move-object v9, v0

    .line 374
    check-cast v9, Lcom/google/android/libraries/play/games/internal/zzcl;

    .line 375
    .line 376
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 377
    .line 378
    .line 379
    move-result-wide v10

    .line 380
    new-instance v1, Lcom/google/android/libraries/play/games/internal/zzcs;

    .line 381
    .line 382
    invoke-direct/range {v1 .. v11}, Lcom/google/android/libraries/play/games/internal/zzcs;-><init>(Lsr3;Ljava/util/HashSet;Lig3;JJLcom/google/android/libraries/play/games/internal/zzcl;J)V

    .line 383
    .line 384
    .line 385
    return-object v1

    .line 386
    :pswitch_14
    new-instance v0, Lcom/google/android/libraries/play/games/internal/zzcn;

    .line 387
    .line 388
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 389
    .line 390
    .line 391
    move-result-wide v1

    .line 392
    invoke-direct {v0, v1, v2}, Lcom/google/android/libraries/play/games/internal/zzcn;-><init>(J)V

    .line 393
    .line 394
    .line 395
    return-object v0

    .line 396
    :pswitch_15
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    new-array v0, v0, [B

    .line 401
    .line 402
    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readByteArray([B)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    new-array v2, v2, [B

    .line 410
    .line 411
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readByteArray([B)V

    .line 412
    .line 413
    .line 414
    :try_start_0
    invoke-static {}, Lon3;->a()Lon3;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    invoke-static {v0, v1}, Lwr3;->o([BLon3;)Lwr3;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-static {}, Lon3;->a()Lon3;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    invoke-static {v2, v1}, Lcm3;->o([BLon3;)Lcm3;

    .line 427
    .line 428
    .line 429
    move-result-object v1
    :try_end_0
    .catch Luo3; {:try_start_0 .. :try_end_0} :catch_0

    .line 430
    goto :goto_4

    .line 431
    :catch_0
    move-exception v0

    .line 432
    sget-object v1, Lcom/google/android/libraries/play/games/internal/zzcl;->c:Lqc3;

    .line 433
    .line 434
    invoke-virtual {v1}, Lqc3;->o()Lrg3;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    invoke-interface {v1, v0}, Lnh3;->b(Luo3;)Lnh3;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    check-cast v0, Lrg3;

    .line 443
    .line 444
    const-string v1, "createFromParcel"

    .line 445
    .line 446
    const/16 v2, 0x38

    .line 447
    .line 448
    const-string v3, "com/google/android/libraries/play/logging/ulex/common/play/logsystem/PlayGlobalDimensionData$1"

    .line 449
    .line 450
    const-string v4, "PlayGlobalDimensionData.java"

    .line 451
    .line 452
    invoke-interface {v0, v2, v3, v1, v4}, Lnh3;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnh3;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    check-cast v0, Lrg3;

    .line 457
    .line 458
    invoke-interface {v0}, Lnh3;->zzq()V

    .line 459
    .line 460
    .line 461
    invoke-static {}, Lwr3;->p()Lwr3;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    invoke-static {}, Lcm3;->p()Lcm3;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    :goto_4
    new-instance v2, Lcom/google/android/libraries/play/games/internal/zzcl;

    .line 470
    .line 471
    invoke-direct {v2, v0, v1}, Lcom/google/android/libraries/play/games/internal/zzcl;-><init>(Lwr3;Lcm3;)V

    .line 472
    .line 473
    .line 474
    return-object v2

    .line 475
    :pswitch_16
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 476
    .line 477
    .line 478
    move-result v0

    .line 479
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 480
    .line 481
    .line 482
    move-result v2

    .line 483
    if-ge v2, v0, :cond_b

    .line 484
    .line 485
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 486
    .line 487
    .line 488
    move-result v2

    .line 489
    int-to-char v3, v2

    .line 490
    if-eq v3, v10, :cond_a

    .line 491
    .line 492
    if-eq v3, v11, :cond_9

    .line 493
    .line 494
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 495
    .line 496
    .line 497
    goto :goto_5

    .line 498
    :cond_9
    sget-object v3, Lcom/google/android/gms/auth/AccountChangeEvent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 499
    .line 500
    invoke-static {v1, v2, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    move-object v9, v2

    .line 505
    goto :goto_5

    .line 506
    :cond_a
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 507
    .line 508
    .line 509
    move-result v2

    .line 510
    move v8, v2

    .line 511
    goto :goto_5

    .line 512
    :cond_b
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 513
    .line 514
    .line 515
    new-instance v0, Lcom/google/android/gms/auth/AccountChangeEventsResponse;

    .line 516
    .line 517
    invoke-direct {v0, v8, v9}, Lcom/google/android/gms/auth/AccountChangeEventsResponse;-><init>(ILjava/util/ArrayList;)V

    .line 518
    .line 519
    .line 520
    return-object v0

    .line 521
    :pswitch_17
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 522
    .line 523
    .line 524
    move-result v0

    .line 525
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 526
    .line 527
    .line 528
    move-result v2

    .line 529
    if-ge v2, v0, :cond_e

    .line 530
    .line 531
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 532
    .line 533
    .line 534
    move-result v2

    .line 535
    int-to-char v3, v2

    .line 536
    if-eq v3, v10, :cond_d

    .line 537
    .line 538
    if-eq v3, v11, :cond_c

    .line 539
    .line 540
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 541
    .line 542
    .line 543
    goto :goto_6

    .line 544
    :cond_c
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 545
    .line 546
    .line 547
    move-result v8

    .line 548
    goto :goto_6

    .line 549
    :cond_d
    sget-object v3, Lcom/google/android/gms/drive/query/internal/zzf;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 550
    .line 551
    invoke-static {v1, v2, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 552
    .line 553
    .line 554
    move-result-object v9

    .line 555
    goto :goto_6

    .line 556
    :cond_e
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 557
    .line 558
    .line 559
    new-instance v0, Lcom/google/android/gms/drive/query/SortOrder;

    .line 560
    .line 561
    invoke-direct {v0, v9, v8}, Lcom/google/android/gms/drive/query/SortOrder;-><init>(Ljava/util/ArrayList;Z)V

    .line 562
    .line 563
    .line 564
    return-object v0

    .line 565
    :pswitch_18
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 566
    .line 567
    .line 568
    move-result v0

    .line 569
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 570
    .line 571
    .line 572
    move-result v2

    .line 573
    if-ge v2, v0, :cond_11

    .line 574
    .line 575
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 576
    .line 577
    .line 578
    move-result v2

    .line 579
    int-to-char v3, v2

    .line 580
    if-eq v3, v11, :cond_10

    .line 581
    .line 582
    if-eq v3, v7, :cond_f

    .line 583
    .line 584
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 585
    .line 586
    .line 587
    goto :goto_7

    .line 588
    :cond_f
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 589
    .line 590
    .line 591
    move-result v8

    .line 592
    goto :goto_7

    .line 593
    :cond_10
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v9

    .line 597
    goto :goto_7

    .line 598
    :cond_11
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 599
    .line 600
    .line 601
    new-instance v0, Lcom/google/android/gms/drive/metadata/CustomPropertyKey;

    .line 602
    .line 603
    invoke-direct {v0, v9, v8}, Lcom/google/android/gms/drive/metadata/CustomPropertyKey;-><init>(Ljava/lang/String;I)V

    .line 604
    .line 605
    .line 606
    return-object v0

    .line 607
    :pswitch_19
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 612
    .line 613
    .line 614
    move-result v2

    .line 615
    if-ge v2, v0, :cond_13

    .line 616
    .line 617
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 618
    .line 619
    .line 620
    move-result v2

    .line 621
    int-to-char v3, v2

    .line 622
    if-eq v3, v7, :cond_12

    .line 623
    .line 624
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 625
    .line 626
    .line 627
    goto :goto_8

    .line 628
    :cond_12
    sget-object v3, Lcom/google/android/gms/drive/events/zze;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 629
    .line 630
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    move-object v9, v2

    .line 635
    check-cast v9, Lcom/google/android/gms/drive/events/zze;

    .line 636
    .line 637
    goto :goto_8

    .line 638
    :cond_13
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 639
    .line 640
    .line 641
    new-instance v0, Lcom/google/android/gms/drive/events/zzb;

    .line 642
    .line 643
    invoke-direct {v0, v9}, Lcom/google/android/gms/drive/events/zzb;-><init>(Lcom/google/android/gms/drive/events/zze;)V

    .line 644
    .line 645
    .line 646
    return-object v0

    .line 647
    :pswitch_1a
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 648
    .line 649
    .line 650
    move-result v0

    .line 651
    move v14, v8

    .line 652
    move v15, v14

    .line 653
    move/from16 v17, v15

    .line 654
    .line 655
    move-object v13, v9

    .line 656
    move-object/from16 v16, v13

    .line 657
    .line 658
    move-object/from16 v18, v16

    .line 659
    .line 660
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 661
    .line 662
    .line 663
    move-result v2

    .line 664
    if-ge v2, v0, :cond_1a

    .line 665
    .line 666
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 667
    .line 668
    .line 669
    move-result v2

    .line 670
    int-to-char v3, v2

    .line 671
    if-eq v3, v11, :cond_19

    .line 672
    .line 673
    if-eq v3, v7, :cond_18

    .line 674
    .line 675
    if-eq v3, v6, :cond_17

    .line 676
    .line 677
    if-eq v3, v5, :cond_16

    .line 678
    .line 679
    const/4 v4, 0x7

    .line 680
    if-eq v3, v4, :cond_15

    .line 681
    .line 682
    const/16 v4, 0x8

    .line 683
    .line 684
    if-eq v3, v4, :cond_14

    .line 685
    .line 686
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 687
    .line 688
    .line 689
    goto :goto_9

    .line 690
    :cond_14
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v18

    .line 694
    goto :goto_9

    .line 695
    :cond_15
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 696
    .line 697
    .line 698
    move-result v17

    .line 699
    goto :goto_9

    .line 700
    :cond_16
    sget-object v3, Lcom/google/android/gms/drive/DriveId;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 701
    .line 702
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 703
    .line 704
    .line 705
    move-result-object v2

    .line 706
    move-object/from16 v16, v2

    .line 707
    .line 708
    check-cast v16, Lcom/google/android/gms/drive/DriveId;

    .line 709
    .line 710
    goto :goto_9

    .line 711
    :cond_17
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 712
    .line 713
    .line 714
    move-result v15

    .line 715
    goto :goto_9

    .line 716
    :cond_18
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 717
    .line 718
    .line 719
    move-result v14

    .line 720
    goto :goto_9

    .line 721
    :cond_19
    sget-object v3, Landroid/os/ParcelFileDescriptor;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 722
    .line 723
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 724
    .line 725
    .line 726
    move-result-object v2

    .line 727
    move-object v13, v2

    .line 728
    check-cast v13, Landroid/os/ParcelFileDescriptor;

    .line 729
    .line 730
    goto :goto_9

    .line 731
    :cond_1a
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 732
    .line 733
    .line 734
    new-instance v12, Lcom/google/android/gms/drive/Contents;

    .line 735
    .line 736
    invoke-direct/range {v12 .. v18}, Lcom/google/android/gms/drive/Contents;-><init>(Landroid/os/ParcelFileDescriptor;IILcom/google/android/gms/drive/DriveId;ZLjava/lang/String;)V

    .line 737
    .line 738
    .line 739
    return-object v12

    .line 740
    :pswitch_1b
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 741
    .line 742
    .line 743
    move-result v0

    .line 744
    move v2, v8

    .line 745
    move v3, v2

    .line 746
    move v4, v10

    .line 747
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 748
    .line 749
    .line 750
    move-result v5

    .line 751
    if-ge v5, v0, :cond_1f

    .line 752
    .line 753
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 754
    .line 755
    .line 756
    move-result v5

    .line 757
    int-to-char v9, v5

    .line 758
    if-eq v9, v10, :cond_1e

    .line 759
    .line 760
    if-eq v9, v11, :cond_1d

    .line 761
    .line 762
    if-eq v9, v7, :cond_1c

    .line 763
    .line 764
    if-eq v9, v6, :cond_1b

    .line 765
    .line 766
    invoke-static {v5, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 767
    .line 768
    .line 769
    goto :goto_a

    .line 770
    :cond_1b
    invoke-static {v5, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 771
    .line 772
    .line 773
    move-result v4

    .line 774
    goto :goto_a

    .line 775
    :cond_1c
    invoke-static {v5, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 776
    .line 777
    .line 778
    move-result v3

    .line 779
    goto :goto_a

    .line 780
    :cond_1d
    invoke-static {v5, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 781
    .line 782
    .line 783
    move-result v2

    .line 784
    goto :goto_a

    .line 785
    :cond_1e
    invoke-static {v5, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 786
    .line 787
    .line 788
    move-result v8

    .line 789
    goto :goto_a

    .line 790
    :cond_1f
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 791
    .line 792
    .line 793
    new-instance v0, Lcom/google/android/gms/common/api/ComplianceOptions;

    .line 794
    .line 795
    invoke-direct {v0, v8, v2, v3, v4}, Lcom/google/android/gms/common/api/ComplianceOptions;-><init>(IIIZ)V

    .line 796
    .line 797
    .line 798
    return-object v0

    .line 799
    :pswitch_1c
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 800
    .line 801
    .line 802
    move-result v0

    .line 803
    move-object v13, v9

    .line 804
    move-object v14, v13

    .line 805
    move-object v15, v14

    .line 806
    move-object/from16 v16, v15

    .line 807
    .line 808
    move-object/from16 v17, v16

    .line 809
    .line 810
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 811
    .line 812
    .line 813
    move-result v2

    .line 814
    if-ge v2, v0, :cond_25

    .line 815
    .line 816
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 817
    .line 818
    .line 819
    move-result v2

    .line 820
    int-to-char v3, v2

    .line 821
    if-eq v3, v10, :cond_24

    .line 822
    .line 823
    if-eq v3, v11, :cond_23

    .line 824
    .line 825
    if-eq v3, v6, :cond_22

    .line 826
    .line 827
    if-eq v3, v5, :cond_21

    .line 828
    .line 829
    const/4 v4, 0x6

    .line 830
    if-eq v3, v4, :cond_20

    .line 831
    .line 832
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 833
    .line 834
    .line 835
    goto :goto_b

    .line 836
    :cond_20
    invoke-static {v2, v1}, Lqj3;->G(ILandroid/os/Parcel;)Ljava/lang/Long;

    .line 837
    .line 838
    .line 839
    move-result-object v2

    .line 840
    move-object/from16 v17, v2

    .line 841
    .line 842
    goto :goto_b

    .line 843
    :cond_21
    sget-object v3, Lcom/google/android/gms/common/data/BitmapTeleporter;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 844
    .line 845
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 846
    .line 847
    .line 848
    move-result-object v2

    .line 849
    check-cast v2, Lcom/google/android/gms/common/data/BitmapTeleporter;

    .line 850
    .line 851
    move-object v15, v2

    .line 852
    goto :goto_b

    .line 853
    :cond_22
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 854
    .line 855
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 856
    .line 857
    .line 858
    move-result-object v2

    .line 859
    check-cast v2, Landroid/net/Uri;

    .line 860
    .line 861
    move-object/from16 v16, v2

    .line 862
    .line 863
    goto :goto_b

    .line 864
    :cond_23
    invoke-static {v2, v1}, Lqj3;->G(ILandroid/os/Parcel;)Ljava/lang/Long;

    .line 865
    .line 866
    .line 867
    move-result-object v2

    .line 868
    move-object v14, v2

    .line 869
    goto :goto_b

    .line 870
    :cond_24
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object v2

    .line 874
    move-object v13, v2

    .line 875
    goto :goto_b

    .line 876
    :cond_25
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 877
    .line 878
    .line 879
    new-instance v12, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChangeEntity;

    .line 880
    .line 881
    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChangeEntity;-><init>(Ljava/lang/String;Ljava/lang/Long;Lcom/google/android/gms/common/data/BitmapTeleporter;Landroid/net/Uri;Ljava/lang/Long;)V

    .line 882
    .line 883
    .line 884
    return-object v12

    .line 885
    :pswitch_1d
    invoke-static {}, Lcom/google/android/gms/common/internal/DowngradeableSafeParcel;->E1()V

    .line 886
    .line 887
    .line 888
    invoke-static {}, Lcom/google/android/gms/common/internal/DowngradeableSafeParcel;->D1()V

    .line 889
    .line 890
    .line 891
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 892
    .line 893
    .line 894
    move-result v0

    .line 895
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 896
    .line 897
    .line 898
    move-result v2

    .line 899
    if-ge v2, v0, :cond_26

    .line 900
    .line 901
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 902
    .line 903
    .line 904
    move-result v2

    .line 905
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 906
    .line 907
    .line 908
    goto :goto_c

    .line 909
    :cond_26
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 910
    .line 911
    .line 912
    new-instance v0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;

    .line 913
    .line 914
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 915
    .line 916
    .line 917
    return-object v0

    .line 918
    :pswitch_1e
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 919
    .line 920
    .line 921
    move-result v0

    .line 922
    invoke-static {}, Lcom/google/android/gms/fido/u2f/api/common/ErrorCode;->values()[Lcom/google/android/gms/fido/u2f/api/common/ErrorCode;

    .line 923
    .line 924
    .line 925
    move-result-object v1

    .line 926
    array-length v2, v1

    .line 927
    :goto_d
    if-ge v8, v2, :cond_28

    .line 928
    .line 929
    aget-object v3, v1, v8

    .line 930
    .line 931
    iget v4, v3, Lcom/google/android/gms/fido/u2f/api/common/ErrorCode;->a:I

    .line 932
    .line 933
    if-ne v0, v4, :cond_27

    .line 934
    .line 935
    goto :goto_e

    .line 936
    :cond_27
    add-int/lit8 v8, v8, 0x1

    .line 937
    .line 938
    goto :goto_d

    .line 939
    :cond_28
    sget-object v3, Lcom/google/android/gms/fido/u2f/api/common/ErrorCode;->b:Lcom/google/android/gms/fido/u2f/api/common/ErrorCode;

    .line 940
    .line 941
    :goto_e
    return-object v3

    .line 942
    :pswitch_1f
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 943
    .line 944
    .line 945
    move-result v0

    .line 946
    move-object v2, v9

    .line 947
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 948
    .line 949
    .line 950
    move-result v3

    .line 951
    if-ge v3, v0, :cond_2b

    .line 952
    .line 953
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 954
    .line 955
    .line 956
    move-result v3

    .line 957
    int-to-char v4, v3

    .line 958
    if-eq v4, v10, :cond_2a

    .line 959
    .line 960
    if-eq v4, v11, :cond_29

    .line 961
    .line 962
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 963
    .line 964
    .line 965
    goto :goto_f

    .line 966
    :cond_29
    sget-object v2, Lcom/google/android/gms/fido/fido2/api/common/zze;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 967
    .line 968
    invoke-static {v1, v3, v2}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 969
    .line 970
    .line 971
    move-result-object v2

    .line 972
    check-cast v2, Lcom/google/android/gms/fido/fido2/api/common/zze;

    .line 973
    .line 974
    goto :goto_f

    .line 975
    :cond_2a
    sget-object v4, Lcom/google/android/gms/fido/fido2/api/common/UvmEntries;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 976
    .line 977
    invoke-static {v1, v3, v4}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 978
    .line 979
    .line 980
    move-result-object v3

    .line 981
    move-object v9, v3

    .line 982
    check-cast v9, Lcom/google/android/gms/fido/fido2/api/common/UvmEntries;

    .line 983
    .line 984
    goto :goto_f

    .line 985
    :cond_2b
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 986
    .line 987
    .line 988
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;

    .line 989
    .line 990
    invoke-direct {v0, v9, v2}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;-><init>(Lcom/google/android/gms/fido/fido2/api/common/UvmEntries;Lcom/google/android/gms/fido/fido2/api/common/zze;)V

    .line 991
    .line 992
    .line 993
    return-object v0

    .line 994
    :pswitch_20
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 995
    .line 996
    .line 997
    move-result v0

    .line 998
    move v2, v8

    .line 999
    move v3, v2

    .line 1000
    move v4, v3

    .line 1001
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1002
    .line 1003
    .line 1004
    move-result v5

    .line 1005
    if-ge v5, v0, :cond_30

    .line 1006
    .line 1007
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1008
    .line 1009
    .line 1010
    move-result v5

    .line 1011
    int-to-char v9, v5

    .line 1012
    if-eq v9, v10, :cond_2f

    .line 1013
    .line 1014
    if-eq v9, v11, :cond_2e

    .line 1015
    .line 1016
    if-eq v9, v7, :cond_2d

    .line 1017
    .line 1018
    if-eq v9, v6, :cond_2c

    .line 1019
    .line 1020
    invoke-static {v5, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1021
    .line 1022
    .line 1023
    goto :goto_10

    .line 1024
    :cond_2c
    invoke-static {v5, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1025
    .line 1026
    .line 1027
    move-result v4

    .line 1028
    goto :goto_10

    .line 1029
    :cond_2d
    invoke-static {v5, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1030
    .line 1031
    .line 1032
    move-result v3

    .line 1033
    goto :goto_10

    .line 1034
    :cond_2e
    invoke-static {v5, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1035
    .line 1036
    .line 1037
    move-result v2

    .line 1038
    goto :goto_10

    .line 1039
    :cond_2f
    invoke-static {v5, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1040
    .line 1041
    .line 1042
    move-result v5

    .line 1043
    move v8, v5

    .line 1044
    goto :goto_10

    .line 1045
    :cond_30
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1046
    .line 1047
    .line 1048
    new-instance v0, Lcom/google/android/gms/location/zzbx;

    .line 1049
    .line 1050
    invoke-direct {v0, v8, v2, v3, v4}, Lcom/google/android/gms/location/zzbx;-><init>(IIII)V

    .line 1051
    .line 1052
    .line 1053
    return-object v0

    .line 1054
    :pswitch_21
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1055
    .line 1056
    .line 1057
    move-result v0

    .line 1058
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1059
    .line 1060
    .line 1061
    move-result v2

    .line 1062
    if-ge v2, v0, :cond_33

    .line 1063
    .line 1064
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1065
    .line 1066
    .line 1067
    move-result v2

    .line 1068
    int-to-char v3, v2

    .line 1069
    if-eq v3, v10, :cond_32

    .line 1070
    .line 1071
    if-eq v3, v11, :cond_31

    .line 1072
    .line 1073
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1074
    .line 1075
    .line 1076
    goto :goto_11

    .line 1077
    :cond_31
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1078
    .line 1079
    .line 1080
    move-result v2

    .line 1081
    move v8, v2

    .line 1082
    goto :goto_11

    .line 1083
    :cond_32
    sget-object v3, Lcom/google/android/gms/location/zzbx;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1084
    .line 1085
    invoke-static {v1, v2, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v2

    .line 1089
    move-object v9, v2

    .line 1090
    goto :goto_11

    .line 1091
    :cond_33
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1092
    .line 1093
    .line 1094
    new-instance v0, Lcom/google/android/gms/location/SleepSegmentRequest;

    .line 1095
    .line 1096
    invoke-direct {v0, v8, v9}, Lcom/google/android/gms/location/SleepSegmentRequest;-><init>(ILjava/util/ArrayList;)V

    .line 1097
    .line 1098
    .line 1099
    return-object v0

    .line 1100
    :pswitch_22
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1101
    .line 1102
    .line 1103
    move-result v0

    .line 1104
    move-wide/from16 v16, v3

    .line 1105
    .line 1106
    move-wide/from16 v18, v16

    .line 1107
    .line 1108
    move v13, v8

    .line 1109
    move v14, v13

    .line 1110
    move v15, v14

    .line 1111
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1112
    .line 1113
    .line 1114
    move-result v2

    .line 1115
    if-ge v2, v0, :cond_39

    .line 1116
    .line 1117
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1118
    .line 1119
    .line 1120
    move-result v2

    .line 1121
    int-to-char v3, v2

    .line 1122
    if-eq v3, v10, :cond_38

    .line 1123
    .line 1124
    if-eq v3, v11, :cond_37

    .line 1125
    .line 1126
    if-eq v3, v7, :cond_36

    .line 1127
    .line 1128
    if-eq v3, v6, :cond_35

    .line 1129
    .line 1130
    if-eq v3, v5, :cond_34

    .line 1131
    .line 1132
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1133
    .line 1134
    .line 1135
    goto :goto_12

    .line 1136
    :cond_34
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1137
    .line 1138
    .line 1139
    move-result v2

    .line 1140
    move v15, v2

    .line 1141
    goto :goto_12

    .line 1142
    :cond_35
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1143
    .line 1144
    .line 1145
    move-result v2

    .line 1146
    move v14, v2

    .line 1147
    goto :goto_12

    .line 1148
    :cond_36
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1149
    .line 1150
    .line 1151
    move-result v2

    .line 1152
    move v13, v2

    .line 1153
    goto :goto_12

    .line 1154
    :cond_37
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1155
    .line 1156
    .line 1157
    move-result-wide v2

    .line 1158
    move-wide/from16 v18, v2

    .line 1159
    .line 1160
    goto :goto_12

    .line 1161
    :cond_38
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1162
    .line 1163
    .line 1164
    move-result-wide v2

    .line 1165
    move-wide/from16 v16, v2

    .line 1166
    .line 1167
    goto :goto_12

    .line 1168
    :cond_39
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1169
    .line 1170
    .line 1171
    new-instance v12, Lcom/google/android/gms/location/SleepSegmentEvent;

    .line 1172
    .line 1173
    invoke-direct/range {v12 .. v19}, Lcom/google/android/gms/location/SleepSegmentEvent;-><init>(IIIJJ)V

    .line 1174
    .line 1175
    .line 1176
    return-object v12

    .line 1177
    :pswitch_23
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1178
    .line 1179
    .line 1180
    move-result v0

    .line 1181
    move v10, v8

    .line 1182
    move v11, v10

    .line 1183
    move v12, v11

    .line 1184
    move v13, v12

    .line 1185
    move v14, v13

    .line 1186
    move v15, v14

    .line 1187
    move/from16 v16, v15

    .line 1188
    .line 1189
    move/from16 v17, v16

    .line 1190
    .line 1191
    move/from16 v18, v17

    .line 1192
    .line 1193
    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1194
    .line 1195
    .line 1196
    move-result v2

    .line 1197
    if-ge v2, v0, :cond_3a

    .line 1198
    .line 1199
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1200
    .line 1201
    .line 1202
    move-result v2

    .line 1203
    int-to-char v3, v2

    .line 1204
    packed-switch v3, :pswitch_data_2

    .line 1205
    .line 1206
    .line 1207
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1208
    .line 1209
    .line 1210
    goto :goto_13

    .line 1211
    :pswitch_24
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1212
    .line 1213
    .line 1214
    move-result v2

    .line 1215
    move/from16 v18, v2

    .line 1216
    .line 1217
    goto :goto_13

    .line 1218
    :pswitch_25
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1219
    .line 1220
    .line 1221
    move-result v2

    .line 1222
    move/from16 v17, v2

    .line 1223
    .line 1224
    goto :goto_13

    .line 1225
    :pswitch_26
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1226
    .line 1227
    .line 1228
    move-result v2

    .line 1229
    move/from16 v16, v2

    .line 1230
    .line 1231
    goto :goto_13

    .line 1232
    :pswitch_27
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1233
    .line 1234
    .line 1235
    move-result v2

    .line 1236
    move v15, v2

    .line 1237
    goto :goto_13

    .line 1238
    :pswitch_28
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1239
    .line 1240
    .line 1241
    move-result v2

    .line 1242
    move v14, v2

    .line 1243
    goto :goto_13

    .line 1244
    :pswitch_29
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1245
    .line 1246
    .line 1247
    move-result v2

    .line 1248
    move v13, v2

    .line 1249
    goto :goto_13

    .line 1250
    :pswitch_2a
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1251
    .line 1252
    .line 1253
    move-result v2

    .line 1254
    move v12, v2

    .line 1255
    goto :goto_13

    .line 1256
    :pswitch_2b
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1257
    .line 1258
    .line 1259
    move-result v2

    .line 1260
    move v11, v2

    .line 1261
    goto :goto_13

    .line 1262
    :pswitch_2c
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1263
    .line 1264
    .line 1265
    move-result v2

    .line 1266
    move v10, v2

    .line 1267
    goto :goto_13

    .line 1268
    :cond_3a
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1269
    .line 1270
    .line 1271
    new-instance v9, Lcom/google/android/gms/location/SleepClassifyEvent;

    .line 1272
    .line 1273
    invoke-direct/range {v9 .. v18}, Lcom/google/android/gms/location/SleepClassifyEvent;-><init>(IIIIIIIZI)V

    .line 1274
    .line 1275
    .line 1276
    return-object v9

    .line 1277
    :pswitch_2d
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1278
    .line 1279
    .line 1280
    move-result v0

    .line 1281
    move-object v3, v9

    .line 1282
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1283
    .line 1284
    .line 1285
    move-result v4

    .line 1286
    if-ge v4, v0, :cond_3e

    .line 1287
    .line 1288
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1289
    .line 1290
    .line 1291
    move-result v4

    .line 1292
    int-to-char v5, v4

    .line 1293
    if-eq v5, v10, :cond_3d

    .line 1294
    .line 1295
    if-eq v5, v11, :cond_3c

    .line 1296
    .line 1297
    if-eq v5, v7, :cond_3b

    .line 1298
    .line 1299
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1300
    .line 1301
    .line 1302
    goto :goto_14

    .line 1303
    :cond_3b
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v2

    .line 1307
    goto :goto_14

    .line 1308
    :cond_3c
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1309
    .line 1310
    invoke-static {v1, v4, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v3

    .line 1314
    check-cast v3, Landroid/app/PendingIntent;

    .line 1315
    .line 1316
    goto :goto_14

    .line 1317
    :cond_3d
    invoke-static {v4, v1}, Lqj3;->l(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v4

    .line 1321
    move-object v9, v4

    .line 1322
    goto :goto_14

    .line 1323
    :cond_3e
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1324
    .line 1325
    .line 1326
    new-instance v0, Lcom/google/android/gms/location/zzbq;

    .line 1327
    .line 1328
    invoke-direct {v0, v9, v3, v2}, Lcom/google/android/gms/location/zzbq;-><init>(Ljava/util/List;Landroid/app/PendingIntent;Ljava/lang/String;)V

    .line 1329
    .line 1330
    .line 1331
    return-object v0

    .line 1332
    :pswitch_2e
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1333
    .line 1334
    .line 1335
    move-result v0

    .line 1336
    const-wide/16 v2, -0x1

    .line 1337
    .line 1338
    move-wide v15, v2

    .line 1339
    move-wide/from16 v17, v15

    .line 1340
    .line 1341
    move v13, v10

    .line 1342
    move v14, v13

    .line 1343
    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1344
    .line 1345
    .line 1346
    move-result v2

    .line 1347
    if-ge v2, v0, :cond_43

    .line 1348
    .line 1349
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1350
    .line 1351
    .line 1352
    move-result v2

    .line 1353
    int-to-char v3, v2

    .line 1354
    if-eq v3, v10, :cond_42

    .line 1355
    .line 1356
    if-eq v3, v11, :cond_41

    .line 1357
    .line 1358
    if-eq v3, v7, :cond_40

    .line 1359
    .line 1360
    if-eq v3, v6, :cond_3f

    .line 1361
    .line 1362
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1363
    .line 1364
    .line 1365
    goto :goto_15

    .line 1366
    :cond_3f
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1367
    .line 1368
    .line 1369
    move-result-wide v2

    .line 1370
    move-wide/from16 v17, v2

    .line 1371
    .line 1372
    goto :goto_15

    .line 1373
    :cond_40
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1374
    .line 1375
    .line 1376
    move-result-wide v2

    .line 1377
    move-wide v15, v2

    .line 1378
    goto :goto_15

    .line 1379
    :cond_41
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1380
    .line 1381
    .line 1382
    move-result v14

    .line 1383
    goto :goto_15

    .line 1384
    :cond_42
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1385
    .line 1386
    .line 1387
    move-result v13

    .line 1388
    goto :goto_15

    .line 1389
    :cond_43
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1390
    .line 1391
    .line 1392
    new-instance v12, Lcom/google/android/gms/location/zzbo;

    .line 1393
    .line 1394
    invoke-direct/range {v12 .. v18}, Lcom/google/android/gms/location/zzbo;-><init>(IIJJ)V

    .line 1395
    .line 1396
    .line 1397
    return-object v12

    .line 1398
    :pswitch_2f
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1399
    .line 1400
    .line 1401
    move-result v0

    .line 1402
    move v2, v8

    .line 1403
    move v3, v2

    .line 1404
    move v4, v3

    .line 1405
    move v5, v4

    .line 1406
    move v6, v5

    .line 1407
    move v7, v6

    .line 1408
    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1409
    .line 1410
    .line 1411
    move-result v8

    .line 1412
    if-ge v8, v0, :cond_44

    .line 1413
    .line 1414
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1415
    .line 1416
    .line 1417
    move-result v8

    .line 1418
    int-to-char v9, v8

    .line 1419
    packed-switch v9, :pswitch_data_3

    .line 1420
    .line 1421
    .line 1422
    invoke-static {v8, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1423
    .line 1424
    .line 1425
    goto :goto_16

    .line 1426
    :pswitch_30
    invoke-static {v8, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1427
    .line 1428
    .line 1429
    move-result v7

    .line 1430
    goto :goto_16

    .line 1431
    :pswitch_31
    invoke-static {v8, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1432
    .line 1433
    .line 1434
    move-result v6

    .line 1435
    goto :goto_16

    .line 1436
    :pswitch_32
    invoke-static {v8, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1437
    .line 1438
    .line 1439
    move-result v5

    .line 1440
    goto :goto_16

    .line 1441
    :pswitch_33
    invoke-static {v8, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1442
    .line 1443
    .line 1444
    move-result v4

    .line 1445
    goto :goto_16

    .line 1446
    :pswitch_34
    invoke-static {v8, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1447
    .line 1448
    .line 1449
    move-result v3

    .line 1450
    goto :goto_16

    .line 1451
    :pswitch_35
    invoke-static {v8, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1452
    .line 1453
    .line 1454
    move-result v2

    .line 1455
    goto :goto_16

    .line 1456
    :cond_44
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1457
    .line 1458
    .line 1459
    new-instance v1, Lcom/google/android/gms/location/LocationSettingsStates;

    .line 1460
    .line 1461
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/location/LocationSettingsStates;-><init>(ZZZZZZ)V

    .line 1462
    .line 1463
    .line 1464
    return-object v1

    .line 1465
    :pswitch_36
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1466
    .line 1467
    .line 1468
    move-result v0

    .line 1469
    move-object v2, v9

    .line 1470
    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1471
    .line 1472
    .line 1473
    move-result v3

    .line 1474
    if-ge v3, v0, :cond_47

    .line 1475
    .line 1476
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1477
    .line 1478
    .line 1479
    move-result v3

    .line 1480
    int-to-char v4, v3

    .line 1481
    if-eq v4, v10, :cond_46

    .line 1482
    .line 1483
    if-eq v4, v11, :cond_45

    .line 1484
    .line 1485
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1486
    .line 1487
    .line 1488
    goto :goto_17

    .line 1489
    :cond_45
    sget-object v2, Lcom/google/android/gms/location/LocationSettingsStates;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1490
    .line 1491
    invoke-static {v1, v3, v2}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v2

    .line 1495
    check-cast v2, Lcom/google/android/gms/location/LocationSettingsStates;

    .line 1496
    .line 1497
    goto :goto_17

    .line 1498
    :cond_46
    sget-object v4, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1499
    .line 1500
    invoke-static {v1, v3, v4}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v3

    .line 1504
    check-cast v3, Lcom/google/android/gms/common/api/Status;

    .line 1505
    .line 1506
    move-object v9, v3

    .line 1507
    goto :goto_17

    .line 1508
    :cond_47
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1509
    .line 1510
    .line 1511
    new-instance v0, Lcom/google/android/gms/location/LocationSettingsResult;

    .line 1512
    .line 1513
    invoke-direct {v0, v9, v2}, Lcom/google/android/gms/location/LocationSettingsResult;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/location/LocationSettingsStates;)V

    .line 1514
    .line 1515
    .line 1516
    return-object v0

    .line 1517
    :pswitch_37
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1518
    .line 1519
    .line 1520
    move-result v0

    .line 1521
    move v2, v8

    .line 1522
    move-object v3, v9

    .line 1523
    :goto_18
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1524
    .line 1525
    .line 1526
    move-result v4

    .line 1527
    if-ge v4, v0, :cond_4c

    .line 1528
    .line 1529
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1530
    .line 1531
    .line 1532
    move-result v4

    .line 1533
    int-to-char v6, v4

    .line 1534
    if-eq v6, v10, :cond_4b

    .line 1535
    .line 1536
    if-eq v6, v11, :cond_4a

    .line 1537
    .line 1538
    if-eq v6, v7, :cond_49

    .line 1539
    .line 1540
    if-eq v6, v5, :cond_48

    .line 1541
    .line 1542
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1543
    .line 1544
    .line 1545
    goto :goto_18

    .line 1546
    :cond_48
    sget-object v3, Lcom/google/android/gms/location/zzbj;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1547
    .line 1548
    invoke-static {v1, v4, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v3

    .line 1552
    check-cast v3, Lcom/google/android/gms/location/zzbj;

    .line 1553
    .line 1554
    goto :goto_18

    .line 1555
    :cond_49
    invoke-static {v4, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1556
    .line 1557
    .line 1558
    move-result v2

    .line 1559
    goto :goto_18

    .line 1560
    :cond_4a
    invoke-static {v4, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1561
    .line 1562
    .line 1563
    move-result v4

    .line 1564
    move v8, v4

    .line 1565
    goto :goto_18

    .line 1566
    :cond_4b
    sget-object v6, Lcom/google/android/gms/location/LocationRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1567
    .line 1568
    invoke-static {v1, v4, v6}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v4

    .line 1572
    move-object v9, v4

    .line 1573
    goto :goto_18

    .line 1574
    :cond_4c
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1575
    .line 1576
    .line 1577
    new-instance v0, Lcom/google/android/gms/location/LocationSettingsRequest;

    .line 1578
    .line 1579
    invoke-direct {v0, v9, v8, v2, v3}, Lcom/google/android/gms/location/LocationSettingsRequest;-><init>(Ljava/util/ArrayList;ZZLcom/google/android/gms/location/zzbj;)V

    .line 1580
    .line 1581
    .line 1582
    return-object v0

    .line 1583
    :pswitch_38
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1584
    .line 1585
    .line 1586
    move-result v0

    .line 1587
    move-object v3, v2

    .line 1588
    move-object v4, v3

    .line 1589
    :goto_19
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1590
    .line 1591
    .line 1592
    move-result v6

    .line 1593
    if-ge v6, v0, :cond_50

    .line 1594
    .line 1595
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1596
    .line 1597
    .line 1598
    move-result v6

    .line 1599
    int-to-char v7, v6

    .line 1600
    if-eq v7, v10, :cond_4f

    .line 1601
    .line 1602
    if-eq v7, v11, :cond_4e

    .line 1603
    .line 1604
    if-eq v7, v5, :cond_4d

    .line 1605
    .line 1606
    invoke-static {v6, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1607
    .line 1608
    .line 1609
    goto :goto_19

    .line 1610
    :cond_4d
    invoke-static {v6, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1611
    .line 1612
    .line 1613
    move-result-object v2

    .line 1614
    goto :goto_19

    .line 1615
    :cond_4e
    invoke-static {v6, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v4

    .line 1619
    goto :goto_19

    .line 1620
    :cond_4f
    invoke-static {v6, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v3

    .line 1624
    goto :goto_19

    .line 1625
    :cond_50
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1626
    .line 1627
    .line 1628
    new-instance v0, Lcom/google/android/gms/location/zzbj;

    .line 1629
    .line 1630
    invoke-direct {v0, v2, v3, v4}, Lcom/google/android/gms/location/zzbj;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1631
    .line 1632
    .line 1633
    return-object v0

    .line 1634
    :pswitch_39
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1635
    .line 1636
    .line 1637
    move-result v0

    .line 1638
    move-wide/from16 v16, v3

    .line 1639
    .line 1640
    move-object v13, v9

    .line 1641
    move-object v14, v13

    .line 1642
    move-object v15, v14

    .line 1643
    :goto_1a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1644
    .line 1645
    .line 1646
    move-result v2

    .line 1647
    if-ge v2, v0, :cond_55

    .line 1648
    .line 1649
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1650
    .line 1651
    .line 1652
    move-result v2

    .line 1653
    int-to-char v3, v2

    .line 1654
    if-eq v3, v11, :cond_54

    .line 1655
    .line 1656
    if-eq v3, v7, :cond_53

    .line 1657
    .line 1658
    if-eq v3, v6, :cond_52

    .line 1659
    .line 1660
    if-eq v3, v5, :cond_51

    .line 1661
    .line 1662
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1663
    .line 1664
    .line 1665
    goto :goto_1a

    .line 1666
    :cond_51
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1667
    .line 1668
    .line 1669
    move-result-wide v2

    .line 1670
    move-wide/from16 v16, v2

    .line 1671
    .line 1672
    goto :goto_1a

    .line 1673
    :cond_52
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v2

    .line 1677
    move-object v15, v2

    .line 1678
    goto :goto_1a

    .line 1679
    :cond_53
    sget-object v3, Lcom/google/android/gms/measurement/internal/zzbe;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1680
    .line 1681
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v2

    .line 1685
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzbe;

    .line 1686
    .line 1687
    move-object v14, v2

    .line 1688
    goto :goto_1a

    .line 1689
    :cond_54
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v2

    .line 1693
    move-object v13, v2

    .line 1694
    goto :goto_1a

    .line 1695
    :cond_55
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1696
    .line 1697
    .line 1698
    new-instance v12, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 1699
    .line 1700
    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbe;Ljava/lang/String;J)V

    .line 1701
    .line 1702
    .line 1703
    return-object v12

    .line 1704
    :pswitch_3a
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1705
    .line 1706
    .line 1707
    move-result v0

    .line 1708
    sget-object v2, Lcom/google/android/gms/location/LocationResult;->b:Ljava/util/List;

    .line 1709
    .line 1710
    :goto_1b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1711
    .line 1712
    .line 1713
    move-result v3

    .line 1714
    if-ge v3, v0, :cond_57

    .line 1715
    .line 1716
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1717
    .line 1718
    .line 1719
    move-result v3

    .line 1720
    int-to-char v4, v3

    .line 1721
    if-eq v4, v10, :cond_56

    .line 1722
    .line 1723
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1724
    .line 1725
    .line 1726
    goto :goto_1b

    .line 1727
    :cond_56
    sget-object v2, Landroid/location/Location;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1728
    .line 1729
    invoke-static {v1, v3, v2}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v2

    .line 1733
    goto :goto_1b

    .line 1734
    :cond_57
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1735
    .line 1736
    .line 1737
    new-instance v0, Lcom/google/android/gms/location/LocationResult;

    .line 1738
    .line 1739
    invoke-direct {v0, v2}, Lcom/google/android/gms/location/LocationResult;-><init>(Ljava/util/List;)V

    .line 1740
    .line 1741
    .line 1742
    return-object v0

    .line 1743
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
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
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_3
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
    .end packed-switch

    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
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
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
    .end packed-switch

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
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lre3;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lcom/google/android/gms/drive/metadata/internal/zzc;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lcom/google/android/gms/common/api/Scope;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lcom/google/android/gms/recaptchabase/ExecuteResult;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lcom/google/android/libraries/play/games/internal/zzcv;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lcom/google/android/libraries/play/games/internal/zzcs;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lcom/google/android/libraries/play/games/internal/zzcn;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lcom/google/android/libraries/play/games/internal/zzcl;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lcom/google/android/gms/auth/AccountChangeEventsResponse;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lcom/google/android/gms/drive/query/SortOrder;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lcom/google/android/gms/drive/metadata/CustomPropertyKey;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lcom/google/android/gms/drive/events/zzb;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lcom/google/android/gms/drive/Contents;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lcom/google/android/gms/common/api/ComplianceOptions;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lcom/google/android/gms/games/snapshot/SnapshotMetadataChangeEntity;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lcom/google/android/gms/fido/u2f/api/common/ErrorCode;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lcom/google/android/gms/location/zzbx;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lcom/google/android/gms/location/SleepSegmentRequest;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lcom/google/android/gms/location/SleepSegmentEvent;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lcom/google/android/gms/location/SleepClassifyEvent;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lcom/google/android/gms/location/zzbq;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lcom/google/android/gms/location/zzbo;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lcom/google/android/gms/location/LocationSettingsStates;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lcom/google/android/gms/location/LocationSettingsResult;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lcom/google/android/gms/location/LocationSettingsRequest;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lcom/google/android/gms/location/zzbj;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzbg;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lcom/google/android/gms/location/LocationResult;

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

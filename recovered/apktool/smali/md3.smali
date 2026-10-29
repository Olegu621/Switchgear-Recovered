.class public final Lmd3;
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
    iput p1, p0, Lmd3;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static a(Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;Landroid/os/Parcel;I)V
    .locals 6

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
    iget-object v1, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->a:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v2, v1, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    iget-object v2, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p1, v1, v2, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    iget-wide v1, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->c:J

    .line 21
    .line 22
    const/16 v4, 0x8

    .line 23
    .line 24
    const/4 v5, 0x3

    .line 25
    invoke-static {p1, v5, v4}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v1, v2}, Landroid/os/Parcel;->writeLong(J)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x4

    .line 32
    iget-object v2, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->d:Landroid/net/Uri;

    .line 33
    .line 34
    invoke-static {p1, v1, v2, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x5

    .line 38
    iget-object v2, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->e:Landroid/net/Uri;

    .line 39
    .line 40
    invoke-static {p1, v1, v2, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x6

    .line 44
    iget-object p0, p0, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;->f:Landroid/net/Uri;

    .line 45
    .line 46
    invoke-static {p1, v1, p0, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 47
    .line 48
    .line 49
    invoke-static {v0, p1}, Lw11;->f0(ILandroid/os/Parcel;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Lmd3;->a:I

    .line 6
    .line 7
    const-string v2, ""

    .line 8
    .line 9
    const/16 v3, 0x3e8

    .line 10
    .line 11
    const/4 v4, 0x5

    .line 12
    const-wide/16 v5, 0x0

    .line 13
    .line 14
    const/4 v7, 0x4

    .line 15
    const/4 v8, 0x3

    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v10, 0x1

    .line 18
    const/4 v11, 0x2

    .line 19
    const/4 v12, 0x0

    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/16 v2, 0x66

    .line 28
    .line 29
    const-wide/32 v3, 0x36ee80

    .line 30
    .line 31
    .line 32
    const-wide/32 v7, 0x927c0

    .line 33
    .line 34
    .line 35
    const-wide v10, 0x7fffffffffffffffL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    const v12, 0x7fffffff

    .line 41
    .line 42
    .line 43
    const/4 v13, 0x0

    .line 44
    move v14, v13

    .line 45
    move v13, v12

    .line 46
    move-wide v11, v10

    .line 47
    move v10, v9

    .line 48
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 49
    .line 50
    .line 51
    move-result v15

    .line 52
    if-ge v15, v0, :cond_0

    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 55
    .line 56
    .line 57
    move-result v15

    .line 58
    move/from16 p0, v10

    .line 59
    .line 60
    int-to-char v10, v15

    .line 61
    packed-switch v10, :pswitch_data_1

    .line 62
    .line 63
    .line 64
    invoke-static {v15, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 65
    .line 66
    .line 67
    :goto_1
    move/from16 v10, p0

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :pswitch_0
    invoke-static {v15, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    goto :goto_0

    .line 75
    :pswitch_1
    invoke-static {v15, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 76
    .line 77
    .line 78
    move-result-wide v5

    .line 79
    goto :goto_1

    .line 80
    :pswitch_2
    invoke-static {v15, v1}, Lqj3;->B(ILandroid/os/Parcel;)F

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    move v14, v10

    .line 85
    goto :goto_1

    .line 86
    :pswitch_3
    invoke-static {v15, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    move v13, v10

    .line 91
    goto :goto_1

    .line 92
    :pswitch_4
    invoke-static {v15, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 93
    .line 94
    .line 95
    move-result-wide v10

    .line 96
    move-wide v11, v10

    .line 97
    goto :goto_1

    .line 98
    :pswitch_5
    invoke-static {v15, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    goto :goto_1

    .line 103
    :pswitch_6
    invoke-static {v15, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 104
    .line 105
    .line 106
    move-result-wide v7

    .line 107
    goto :goto_1

    .line 108
    :pswitch_7
    invoke-static {v15, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 109
    .line 110
    .line 111
    move-result-wide v3

    .line 112
    goto :goto_1

    .line 113
    :pswitch_8
    invoke-static {v15, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    goto :goto_1

    .line 118
    :cond_0
    move/from16 p0, v10

    .line 119
    .line 120
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 121
    .line 122
    .line 123
    new-instance v0, Lcom/google/android/gms/location/LocationRequest;

    .line 124
    .line 125
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 126
    .line 127
    .line 128
    iput v2, v0, Lcom/google/android/gms/location/LocationRequest;->a:I

    .line 129
    .line 130
    iput-wide v3, v0, Lcom/google/android/gms/location/LocationRequest;->b:J

    .line 131
    .line 132
    iput-wide v7, v0, Lcom/google/android/gms/location/LocationRequest;->c:J

    .line 133
    .line 134
    iput-boolean v9, v0, Lcom/google/android/gms/location/LocationRequest;->d:Z

    .line 135
    .line 136
    iput-wide v11, v0, Lcom/google/android/gms/location/LocationRequest;->e:J

    .line 137
    .line 138
    iput v13, v0, Lcom/google/android/gms/location/LocationRequest;->f:I

    .line 139
    .line 140
    iput v14, v0, Lcom/google/android/gms/location/LocationRequest;->i:F

    .line 141
    .line 142
    iput-wide v5, v0, Lcom/google/android/gms/location/LocationRequest;->v:J

    .line 143
    .line 144
    move/from16 v9, p0

    .line 145
    .line 146
    iput-boolean v9, v0, Lcom/google/android/gms/location/LocationRequest;->w:Z

    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_9
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-ge v2, v0, :cond_2

    .line 158
    .line 159
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    int-to-char v3, v2

    .line 164
    if-eq v3, v11, :cond_1

    .line 165
    .line 166
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_1
    invoke-static {v2, v1}, Lqj3;->f(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 171
    .line 172
    .line 173
    move-result-object v12

    .line 174
    goto :goto_2

    .line 175
    :cond_2
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 176
    .line 177
    .line 178
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzbe;

    .line 179
    .line 180
    invoke-direct {v0, v12}, Lcom/google/android/gms/measurement/internal/zzbe;-><init>(Landroid/os/Bundle;)V

    .line 181
    .line 182
    .line 183
    return-object v0

    .line 184
    :pswitch_a
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    move v2, v10

    .line 189
    move v9, v2

    .line 190
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 191
    .line 192
    .line 193
    move-result v13

    .line 194
    if-ge v13, v0, :cond_8

    .line 195
    .line 196
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 197
    .line 198
    .line 199
    move-result v13

    .line 200
    int-to-char v14, v13

    .line 201
    if-eq v14, v10, :cond_7

    .line 202
    .line 203
    if-eq v14, v11, :cond_6

    .line 204
    .line 205
    if-eq v14, v8, :cond_5

    .line 206
    .line 207
    if-eq v14, v7, :cond_4

    .line 208
    .line 209
    if-eq v14, v4, :cond_3

    .line 210
    .line 211
    invoke-static {v13, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_3
    sget-object v12, Lcom/google/android/gms/location/zzbo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 216
    .line 217
    invoke-static {v1, v13, v12}, Lqj3;->m(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v12

    .line 221
    check-cast v12, [Lcom/google/android/gms/location/zzbo;

    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_4
    invoke-static {v13, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    goto :goto_3

    .line 229
    :cond_5
    invoke-static {v13, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 230
    .line 231
    .line 232
    move-result-wide v5

    .line 233
    goto :goto_3

    .line 234
    :cond_6
    invoke-static {v13, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 235
    .line 236
    .line 237
    move-result v9

    .line 238
    goto :goto_3

    .line 239
    :cond_7
    invoke-static {v13, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    goto :goto_3

    .line 244
    :cond_8
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 245
    .line 246
    .line 247
    new-instance v0, Lcom/google/android/gms/location/LocationAvailability;

    .line 248
    .line 249
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 250
    .line 251
    .line 252
    iput v3, v0, Lcom/google/android/gms/location/LocationAvailability;->d:I

    .line 253
    .line 254
    iput v2, v0, Lcom/google/android/gms/location/LocationAvailability;->a:I

    .line 255
    .line 256
    iput v9, v0, Lcom/google/android/gms/location/LocationAvailability;->b:I

    .line 257
    .line 258
    iput-wide v5, v0, Lcom/google/android/gms/location/LocationAvailability;->c:J

    .line 259
    .line 260
    iput-object v12, v0, Lcom/google/android/gms/location/LocationAvailability;->e:[Lcom/google/android/gms/location/zzbo;

    .line 261
    .line 262
    return-object v0

    .line 263
    :pswitch_b
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    move-wide v13, v5

    .line 268
    move-wide v15, v13

    .line 269
    move-wide/from16 v17, v15

    .line 270
    .line 271
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    if-ge v2, v0, :cond_c

    .line 276
    .line 277
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    int-to-char v3, v2

    .line 282
    if-eq v3, v11, :cond_b

    .line 283
    .line 284
    if-eq v3, v8, :cond_a

    .line 285
    .line 286
    if-eq v3, v7, :cond_9

    .line 287
    .line 288
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 289
    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_9
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 293
    .line 294
    .line 295
    move-result-wide v17

    .line 296
    goto :goto_4

    .line 297
    :cond_a
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 298
    .line 299
    .line 300
    move-result-wide v15

    .line 301
    goto :goto_4

    .line 302
    :cond_b
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 303
    .line 304
    .line 305
    move-result-wide v13

    .line 306
    goto :goto_4

    .line 307
    :cond_c
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 308
    .line 309
    .line 310
    new-instance v12, Lcom/google/android/gms/drive/zza;

    .line 311
    .line 312
    invoke-direct/range {v12 .. v18}, Lcom/google/android/gms/drive/zza;-><init>(JJJ)V

    .line 313
    .line 314
    .line 315
    return-object v12

    .line 316
    :pswitch_c
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    const-wide/16 v2, -0x1

    .line 321
    .line 322
    move-wide v15, v2

    .line 323
    move v14, v9

    .line 324
    move/from16 v18, v14

    .line 325
    .line 326
    move-object/from16 v17, v12

    .line 327
    .line 328
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    if-ge v2, v0, :cond_11

    .line 333
    .line 334
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    int-to-char v3, v2

    .line 339
    if-eq v3, v10, :cond_10

    .line 340
    .line 341
    if-eq v3, v11, :cond_f

    .line 342
    .line 343
    if-eq v3, v8, :cond_e

    .line 344
    .line 345
    if-eq v3, v7, :cond_d

    .line 346
    .line 347
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 348
    .line 349
    .line 350
    goto :goto_5

    .line 351
    :cond_d
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    move/from16 v18, v2

    .line 356
    .line 357
    goto :goto_5

    .line 358
    :cond_e
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 359
    .line 360
    .line 361
    move-result-wide v2

    .line 362
    move-wide v15, v2

    .line 363
    goto :goto_5

    .line 364
    :cond_f
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 365
    .line 366
    .line 367
    move-result v2

    .line 368
    move v14, v2

    .line 369
    goto :goto_5

    .line 370
    :cond_10
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    move-object/from16 v17, v2

    .line 375
    .line 376
    goto :goto_5

    .line 377
    :cond_11
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 378
    .line 379
    .line 380
    new-instance v13, Lcom/google/android/gms/common/Feature;

    .line 381
    .line 382
    invoke-direct/range {v13 .. v18}, Lcom/google/android/gms/common/Feature;-><init>(IJLjava/lang/String;Z)V

    .line 383
    .line 384
    .line 385
    return-object v13

    .line 386
    :pswitch_d
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    new-instance v1, Lcom/google/android/gms/cloudmessaging/zzd;

    .line 391
    .line 392
    invoke-direct {v1, v0}, Lcom/google/android/gms/cloudmessaging/zzd;-><init>(Landroid/os/IBinder;)V

    .line 393
    .line 394
    .line 395
    return-object v1

    .line 396
    :pswitch_e
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    move v14, v9

    .line 401
    move v15, v14

    .line 402
    move/from16 v17, v15

    .line 403
    .line 404
    move-object/from16 v16, v12

    .line 405
    .line 406
    move-object/from16 v18, v16

    .line 407
    .line 408
    move-object/from16 v19, v18

    .line 409
    .line 410
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    if-ge v2, v0, :cond_18

    .line 415
    .line 416
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    int-to-char v5, v2

    .line 421
    if-eq v5, v10, :cond_17

    .line 422
    .line 423
    if-eq v5, v11, :cond_16

    .line 424
    .line 425
    if-eq v5, v8, :cond_15

    .line 426
    .line 427
    if-eq v5, v7, :cond_14

    .line 428
    .line 429
    if-eq v5, v4, :cond_13

    .line 430
    .line 431
    if-eq v5, v3, :cond_12

    .line 432
    .line 433
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 434
    .line 435
    .line 436
    goto :goto_6

    .line 437
    :cond_12
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    move v14, v2

    .line 442
    goto :goto_6

    .line 443
    :cond_13
    invoke-static {v2, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    move-object/from16 v19, v2

    .line 448
    .line 449
    goto :goto_6

    .line 450
    :cond_14
    invoke-static {v2, v1}, Lqj3;->f(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    move-object/from16 v18, v2

    .line 455
    .line 456
    goto :goto_6

    .line 457
    :cond_15
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    move/from16 v17, v2

    .line 462
    .line 463
    goto :goto_6

    .line 464
    :cond_16
    sget-object v5, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 465
    .line 466
    invoke-static {v1, v2, v5}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    check-cast v2, Landroid/app/PendingIntent;

    .line 471
    .line 472
    move-object/from16 v16, v2

    .line 473
    .line 474
    goto :goto_6

    .line 475
    :cond_17
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    move v15, v2

    .line 480
    goto :goto_6

    .line 481
    :cond_18
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 482
    .line 483
    .line 484
    new-instance v13, Lcom/google/android/gms/auth/api/proxy/ProxyResponse;

    .line 485
    .line 486
    invoke-direct/range {v13 .. v19}, Lcom/google/android/gms/auth/api/proxy/ProxyResponse;-><init>(IILandroid/app/PendingIntent;ILandroid/os/Bundle;[B)V

    .line 487
    .line 488
    .line 489
    return-object v13

    .line 490
    :pswitch_f
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    move-object v2, v12

    .line 495
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    if-ge v3, v0, :cond_1b

    .line 500
    .line 501
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    int-to-char v4, v3

    .line 506
    if-eq v4, v10, :cond_1a

    .line 507
    .line 508
    if-eq v4, v11, :cond_19

    .line 509
    .line 510
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 511
    .line 512
    .line 513
    goto :goto_7

    .line 514
    :cond_19
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    goto :goto_7

    .line 519
    :cond_1a
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v12

    .line 523
    goto :goto_7

    .line 524
    :cond_1b
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 525
    .line 526
    .line 527
    new-instance v0, Lcom/google/android/gms/recaptchabase/ExecuteRequest;

    .line 528
    .line 529
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 530
    .line 531
    .line 532
    iput-object v12, v0, Lcom/google/android/gms/recaptchabase/ExecuteRequest;->a:Ljava/lang/String;

    .line 533
    .line 534
    iput-object v2, v0, Lcom/google/android/gms/recaptchabase/ExecuteRequest;->b:Ljava/lang/String;

    .line 535
    .line 536
    return-object v0

    .line 537
    :pswitch_10
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 538
    .line 539
    .line 540
    move-result v0

    .line 541
    move v2, v9

    .line 542
    move v3, v2

    .line 543
    move v4, v3

    .line 544
    move v5, v4

    .line 545
    move v6, v5

    .line 546
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 547
    .line 548
    .line 549
    move-result v7

    .line 550
    if-ge v7, v0, :cond_21

    .line 551
    .line 552
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 553
    .line 554
    .line 555
    move-result v7

    .line 556
    int-to-char v8, v7

    .line 557
    if-eq v8, v10, :cond_20

    .line 558
    .line 559
    if-eq v8, v11, :cond_1f

    .line 560
    .line 561
    const/4 v9, 0x7

    .line 562
    if-eq v8, v9, :cond_1e

    .line 563
    .line 564
    const/16 v9, 0x8

    .line 565
    .line 566
    if-eq v8, v9, :cond_1d

    .line 567
    .line 568
    const/16 v9, 0x9

    .line 569
    .line 570
    if-eq v8, v9, :cond_1c

    .line 571
    .line 572
    invoke-static {v7, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 573
    .line 574
    .line 575
    goto :goto_8

    .line 576
    :cond_1c
    invoke-static {v7, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 577
    .line 578
    .line 579
    move-result v6

    .line 580
    goto :goto_8

    .line 581
    :cond_1d
    invoke-static {v7, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 582
    .line 583
    .line 584
    move-result v5

    .line 585
    goto :goto_8

    .line 586
    :cond_1e
    invoke-static {v7, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 587
    .line 588
    .line 589
    move-result v4

    .line 590
    goto :goto_8

    .line 591
    :cond_1f
    invoke-static {v7, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 592
    .line 593
    .line 594
    move-result v3

    .line 595
    goto :goto_8

    .line 596
    :cond_20
    invoke-static {v7, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 597
    .line 598
    .line 599
    move-result v2

    .line 600
    goto :goto_8

    .line 601
    :cond_21
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 602
    .line 603
    .line 604
    new-instance v1, Lcom/google/android/gms/games/video/VideoConfiguration;

    .line 605
    .line 606
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/games/video/VideoConfiguration;-><init>(IIZZZ)V

    .line 607
    .line 608
    .line 609
    return-object v1

    .line 610
    :pswitch_11
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 611
    .line 612
    .line 613
    move-result v0

    .line 614
    move v2, v9

    .line 615
    move-object v3, v12

    .line 616
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 617
    .line 618
    .line 619
    move-result v4

    .line 620
    if-ge v4, v0, :cond_26

    .line 621
    .line 622
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 623
    .line 624
    .line 625
    move-result v4

    .line 626
    int-to-char v5, v4

    .line 627
    if-eq v5, v10, :cond_25

    .line 628
    .line 629
    if-eq v5, v11, :cond_24

    .line 630
    .line 631
    if-eq v5, v8, :cond_23

    .line 632
    .line 633
    if-eq v5, v7, :cond_22

    .line 634
    .line 635
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 636
    .line 637
    .line 638
    goto :goto_9

    .line 639
    :cond_22
    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 640
    .line 641
    invoke-static {v1, v4, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 642
    .line 643
    .line 644
    move-result-object v3

    .line 645
    check-cast v3, Landroid/accounts/Account;

    .line 646
    .line 647
    goto :goto_9

    .line 648
    :cond_23
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v4

    .line 652
    move-object v12, v4

    .line 653
    goto :goto_9

    .line 654
    :cond_24
    invoke-static {v4, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 655
    .line 656
    .line 657
    move-result v2

    .line 658
    goto :goto_9

    .line 659
    :cond_25
    invoke-static {v4, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 660
    .line 661
    .line 662
    move-result v4

    .line 663
    move v9, v4

    .line 664
    goto :goto_9

    .line 665
    :cond_26
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 666
    .line 667
    .line 668
    new-instance v0, Lcom/google/android/gms/auth/AccountChangeEventsRequest;

    .line 669
    .line 670
    invoke-direct {v0, v9, v2, v12, v3}, Lcom/google/android/gms/auth/AccountChangeEventsRequest;-><init>(IILjava/lang/String;Landroid/accounts/Account;)V

    .line 671
    .line 672
    .line 673
    return-object v0

    .line 674
    :pswitch_12
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 675
    .line 676
    .line 677
    move-result v0

    .line 678
    move-object v2, v12

    .line 679
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 680
    .line 681
    .line 682
    move-result v3

    .line 683
    if-ge v3, v0, :cond_29

    .line 684
    .line 685
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 686
    .line 687
    .line 688
    move-result v3

    .line 689
    int-to-char v4, v3

    .line 690
    if-eq v4, v10, :cond_28

    .line 691
    .line 692
    if-eq v4, v8, :cond_27

    .line 693
    .line 694
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 695
    .line 696
    .line 697
    goto :goto_a

    .line 698
    :cond_27
    sget-object v2, Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 699
    .line 700
    invoke-static {v1, v3, v2}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 701
    .line 702
    .line 703
    move-result-object v2

    .line 704
    check-cast v2, Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;

    .line 705
    .line 706
    goto :goto_a

    .line 707
    :cond_28
    sget-object v4, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 708
    .line 709
    invoke-static {v1, v3, v4}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 710
    .line 711
    .line 712
    move-result-object v3

    .line 713
    check-cast v3, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;

    .line 714
    .line 715
    move-object v12, v3

    .line 716
    goto :goto_a

    .line 717
    :cond_29
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 718
    .line 719
    .line 720
    new-instance v0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;

    .line 721
    .line 722
    invoke-direct {v0, v12, v2}, Lcom/google/android/gms/games/snapshot/SnapshotEntity;-><init>(Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;)V

    .line 723
    .line 724
    .line 725
    return-object v0

    .line 726
    :pswitch_13
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 727
    .line 728
    .line 729
    move-result v0

    .line 730
    move-wide/from16 v16, v5

    .line 731
    .line 732
    move-object v14, v12

    .line 733
    move-object v15, v14

    .line 734
    move-object/from16 v18, v15

    .line 735
    .line 736
    move-object/from16 v19, v18

    .line 737
    .line 738
    move-object/from16 v20, v19

    .line 739
    .line 740
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 741
    .line 742
    .line 743
    move-result v2

    .line 744
    if-ge v2, v0, :cond_2a

    .line 745
    .line 746
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 747
    .line 748
    .line 749
    move-result v2

    .line 750
    int-to-char v3, v2

    .line 751
    packed-switch v3, :pswitch_data_2

    .line 752
    .line 753
    .line 754
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 755
    .line 756
    .line 757
    goto :goto_b

    .line 758
    :pswitch_14
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 759
    .line 760
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 761
    .line 762
    .line 763
    move-result-object v2

    .line 764
    check-cast v2, Landroid/net/Uri;

    .line 765
    .line 766
    move-object/from16 v20, v2

    .line 767
    .line 768
    goto :goto_b

    .line 769
    :pswitch_15
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 770
    .line 771
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    check-cast v2, Landroid/net/Uri;

    .line 776
    .line 777
    move-object/from16 v19, v2

    .line 778
    .line 779
    goto :goto_b

    .line 780
    :pswitch_16
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 781
    .line 782
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 783
    .line 784
    .line 785
    move-result-object v2

    .line 786
    check-cast v2, Landroid/net/Uri;

    .line 787
    .line 788
    move-object/from16 v18, v2

    .line 789
    .line 790
    goto :goto_b

    .line 791
    :pswitch_17
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 792
    .line 793
    .line 794
    move-result-wide v2

    .line 795
    move-wide/from16 v16, v2

    .line 796
    .line 797
    goto :goto_b

    .line 798
    :pswitch_18
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v2

    .line 802
    move-object v15, v2

    .line 803
    goto :goto_b

    .line 804
    :pswitch_19
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    move-object v14, v2

    .line 809
    goto :goto_b

    .line 810
    :cond_2a
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 811
    .line 812
    .line 813
    new-instance v13, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;

    .line 814
    .line 815
    invoke-direct/range {v13 .. v20}, Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;-><init>(Ljava/lang/String;Ljava/lang/String;JLandroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;)V

    .line 816
    .line 817
    .line 818
    return-object v13

    .line 819
    :pswitch_1a
    invoke-static {}, Lcom/google/android/gms/common/internal/DowngradeableSafeParcel;->E1()V

    .line 820
    .line 821
    .line 822
    invoke-static {}, Lcom/google/android/gms/common/internal/DowngradeableSafeParcel;->D1()V

    .line 823
    .line 824
    .line 825
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 826
    .line 827
    .line 828
    move-result v0

    .line 829
    move-object v2, v12

    .line 830
    move-object v3, v2

    .line 831
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 832
    .line 833
    .line 834
    move-result v4

    .line 835
    if-ge v4, v0, :cond_2f

    .line 836
    .line 837
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 838
    .line 839
    .line 840
    move-result v4

    .line 841
    int-to-char v5, v4

    .line 842
    if-eq v5, v10, :cond_2e

    .line 843
    .line 844
    if-eq v5, v11, :cond_2d

    .line 845
    .line 846
    if-eq v5, v8, :cond_2c

    .line 847
    .line 848
    if-eq v5, v7, :cond_2b

    .line 849
    .line 850
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 851
    .line 852
    .line 853
    goto :goto_c

    .line 854
    :cond_2b
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 855
    .line 856
    invoke-static {v1, v4, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 857
    .line 858
    .line 859
    move-result-object v3

    .line 860
    check-cast v3, Landroid/net/Uri;

    .line 861
    .line 862
    goto :goto_c

    .line 863
    :cond_2c
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v2

    .line 867
    goto :goto_c

    .line 868
    :cond_2d
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 869
    .line 870
    .line 871
    move-result-object v4

    .line 872
    move-object v12, v4

    .line 873
    goto :goto_c

    .line 874
    :cond_2e
    invoke-static {v4, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 875
    .line 876
    .line 877
    move-result v4

    .line 878
    move v9, v4

    .line 879
    goto :goto_c

    .line 880
    :cond_2f
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 881
    .line 882
    .line 883
    new-instance v0, Lcom/google/android/gms/games/internal/game/GameBadgeEntity;

    .line 884
    .line 885
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 886
    .line 887
    .line 888
    iput v9, v0, Lcom/google/android/gms/games/internal/game/GameBadgeEntity;->b:I

    .line 889
    .line 890
    iput-object v12, v0, Lcom/google/android/gms/games/internal/game/GameBadgeEntity;->c:Ljava/lang/String;

    .line 891
    .line 892
    iput-object v2, v0, Lcom/google/android/gms/games/internal/game/GameBadgeEntity;->d:Ljava/lang/String;

    .line 893
    .line 894
    iput-object v3, v0, Lcom/google/android/gms/games/internal/game/GameBadgeEntity;->e:Landroid/net/Uri;

    .line 895
    .line 896
    return-object v0

    .line 897
    :pswitch_1b
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 898
    .line 899
    .line 900
    move-result v0

    .line 901
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 902
    .line 903
    .line 904
    move-result v2

    .line 905
    if-ge v2, v0, :cond_31

    .line 906
    .line 907
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 908
    .line 909
    .line 910
    move-result v2

    .line 911
    int-to-char v3, v2

    .line 912
    if-eq v3, v10, :cond_30

    .line 913
    .line 914
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 915
    .line 916
    .line 917
    goto :goto_d

    .line 918
    :cond_30
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 919
    .line 920
    .line 921
    move-result v9

    .line 922
    goto :goto_d

    .line 923
    :cond_31
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 924
    .line 925
    .line 926
    new-instance v0, Lcom/google/android/gms/games/zza;

    .line 927
    .line 928
    invoke-direct {v0, v9}, Lcom/google/android/gms/games/zza;-><init>(I)V

    .line 929
    .line 930
    .line 931
    return-object v0

    .line 932
    :pswitch_1c
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 933
    .line 934
    .line 935
    move-result v0

    .line 936
    move-object v2, v12

    .line 937
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 938
    .line 939
    .line 940
    move-result v3

    .line 941
    if-ge v3, v0, :cond_35

    .line 942
    .line 943
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 944
    .line 945
    .line 946
    move-result v3

    .line 947
    int-to-char v4, v3

    .line 948
    if-eq v4, v11, :cond_34

    .line 949
    .line 950
    if-eq v4, v8, :cond_33

    .line 951
    .line 952
    if-eq v4, v7, :cond_32

    .line 953
    .line 954
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 955
    .line 956
    .line 957
    goto :goto_e

    .line 958
    :cond_32
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    move-result-object v2

    .line 962
    goto :goto_e

    .line 963
    :cond_33
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 964
    .line 965
    .line 966
    move-result-object v12

    .line 967
    goto :goto_e

    .line 968
    :cond_34
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 969
    .line 970
    .line 971
    move-result v9

    .line 972
    goto :goto_e

    .line 973
    :cond_35
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 974
    .line 975
    .line 976
    new-instance v0, Lcom/google/android/gms/fido/u2f/api/common/ChannelIdValue;

    .line 977
    .line 978
    invoke-direct {v0, v9, v12, v2}, Lcom/google/android/gms/fido/u2f/api/common/ChannelIdValue;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 979
    .line 980
    .line 981
    return-object v0

    .line 982
    :pswitch_1d
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 983
    .line 984
    .line 985
    move-result v0

    .line 986
    move v2, v9

    .line 987
    move v3, v2

    .line 988
    move-object v5, v12

    .line 989
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 990
    .line 991
    .line 992
    move-result v6

    .line 993
    if-ge v6, v0, :cond_3b

    .line 994
    .line 995
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 996
    .line 997
    .line 998
    move-result v6

    .line 999
    int-to-char v13, v6

    .line 1000
    if-eq v13, v10, :cond_3a

    .line 1001
    .line 1002
    if-eq v13, v11, :cond_39

    .line 1003
    .line 1004
    if-eq v13, v8, :cond_38

    .line 1005
    .line 1006
    if-eq v13, v7, :cond_37

    .line 1007
    .line 1008
    if-eq v13, v4, :cond_36

    .line 1009
    .line 1010
    invoke-static {v6, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1011
    .line 1012
    .line 1013
    goto :goto_f

    .line 1014
    :cond_36
    invoke-static {v6, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v5

    .line 1018
    goto :goto_f

    .line 1019
    :cond_37
    invoke-static {v6, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1020
    .line 1021
    .line 1022
    move-result v3

    .line 1023
    goto :goto_f

    .line 1024
    :cond_38
    sget-object v12, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1025
    .line 1026
    invoke-static {v1, v6, v12}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v12

    .line 1030
    goto :goto_f

    .line 1031
    :cond_39
    invoke-static {v6, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1032
    .line 1033
    .line 1034
    move-result v2

    .line 1035
    goto :goto_f

    .line 1036
    :cond_3a
    invoke-static {v6, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1037
    .line 1038
    .line 1039
    move-result v9

    .line 1040
    goto :goto_f

    .line 1041
    :cond_3b
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1042
    .line 1043
    .line 1044
    new-instance v0, Lcom/google/android/gms/fido/sourcedevice/SourceStartDirectTransferOptions;

    .line 1045
    .line 1046
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1047
    .line 1048
    .line 1049
    iput v9, v0, Lcom/google/android/gms/fido/sourcedevice/SourceStartDirectTransferOptions;->a:I

    .line 1050
    .line 1051
    iput-boolean v2, v0, Lcom/google/android/gms/fido/sourcedevice/SourceStartDirectTransferOptions;->b:Z

    .line 1052
    .line 1053
    iput-object v12, v0, Lcom/google/android/gms/fido/sourcedevice/SourceStartDirectTransferOptions;->c:Ljava/util/ArrayList;

    .line 1054
    .line 1055
    iput-boolean v3, v0, Lcom/google/android/gms/fido/sourcedevice/SourceStartDirectTransferOptions;->d:Z

    .line 1056
    .line 1057
    iput-object v5, v0, Lcom/google/android/gms/fido/sourcedevice/SourceStartDirectTransferOptions;->e:Ljava/lang/String;

    .line 1058
    .line 1059
    return-object v0

    .line 1060
    :pswitch_1e
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v0

    .line 1064
    :try_start_0
    invoke-static {v0}, Lcom/google/android/gms/fido/fido2/api/common/AttestationConveyancePreference;->a(Ljava/lang/String;)Lcom/google/android/gms/fido/fido2/api/common/AttestationConveyancePreference;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v12
    :try_end_0
    .catch Lzd; {:try_start_0 .. :try_end_0} :catch_0

    .line 1068
    goto :goto_10

    .line 1069
    :catch_0
    move-exception v0

    .line 1070
    invoke-static {v0}, Lds0;->p(Ljava/lang/Throwable;)V

    .line 1071
    .line 1072
    .line 1073
    :goto_10
    return-object v12

    .line 1074
    :pswitch_1f
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1075
    .line 1076
    .line 1077
    move-result v0

    .line 1078
    move v6, v9

    .line 1079
    move v8, v6

    .line 1080
    move-object v2, v12

    .line 1081
    move-object v3, v2

    .line 1082
    move-object v4, v3

    .line 1083
    move-object v5, v4

    .line 1084
    move-object v7, v5

    .line 1085
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1086
    .line 1087
    .line 1088
    move-result v9

    .line 1089
    if-ge v9, v0, :cond_3c

    .line 1090
    .line 1091
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1092
    .line 1093
    .line 1094
    move-result v9

    .line 1095
    int-to-char v10, v9

    .line 1096
    packed-switch v10, :pswitch_data_3

    .line 1097
    .line 1098
    .line 1099
    :pswitch_20
    invoke-static {v9, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1100
    .line 1101
    .line 1102
    goto :goto_11

    .line 1103
    :pswitch_21
    invoke-static {v9, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1104
    .line 1105
    .line 1106
    move-result v8

    .line 1107
    goto :goto_11

    .line 1108
    :pswitch_22
    sget-object v7, Lcom/google/android/gms/drive/DriveSpace;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1109
    .line 1110
    invoke-static {v1, v9, v7}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v7

    .line 1114
    goto :goto_11

    .line 1115
    :pswitch_23
    invoke-static {v9, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1116
    .line 1117
    .line 1118
    move-result v6

    .line 1119
    goto :goto_11

    .line 1120
    :pswitch_24
    invoke-static {v9, v1}, Lqj3;->l(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v5

    .line 1124
    goto :goto_11

    .line 1125
    :pswitch_25
    sget-object v4, Lcom/google/android/gms/drive/query/SortOrder;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1126
    .line 1127
    invoke-static {v1, v9, v4}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v4

    .line 1131
    check-cast v4, Lcom/google/android/gms/drive/query/SortOrder;

    .line 1132
    .line 1133
    goto :goto_11

    .line 1134
    :pswitch_26
    invoke-static {v9, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v3

    .line 1138
    goto :goto_11

    .line 1139
    :pswitch_27
    sget-object v2, Lcom/google/android/gms/drive/query/internal/zzr;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1140
    .line 1141
    invoke-static {v1, v9, v2}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v2

    .line 1145
    check-cast v2, Lcom/google/android/gms/drive/query/internal/zzr;

    .line 1146
    .line 1147
    goto :goto_11

    .line 1148
    :cond_3c
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1149
    .line 1150
    .line 1151
    new-instance v1, Lcom/google/android/gms/drive/query/Query;

    .line 1152
    .line 1153
    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/drive/query/Query;-><init>(Lcom/google/android/gms/drive/query/internal/zzr;Ljava/lang/String;Lcom/google/android/gms/drive/query/SortOrder;Ljava/util/List;ZLjava/util/ArrayList;Z)V

    .line 1154
    .line 1155
    .line 1156
    return-object v1

    .line 1157
    :pswitch_28
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1158
    .line 1159
    .line 1160
    move-result v0

    .line 1161
    move v2, v9

    .line 1162
    move v3, v2

    .line 1163
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1164
    .line 1165
    .line 1166
    move-result v4

    .line 1167
    if-ge v4, v0, :cond_40

    .line 1168
    .line 1169
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1170
    .line 1171
    .line 1172
    move-result v4

    .line 1173
    int-to-char v5, v4

    .line 1174
    if-eq v5, v10, :cond_3f

    .line 1175
    .line 1176
    if-eq v5, v11, :cond_3e

    .line 1177
    .line 1178
    if-eq v5, v8, :cond_3d

    .line 1179
    .line 1180
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1181
    .line 1182
    .line 1183
    goto :goto_12

    .line 1184
    :cond_3d
    invoke-static {v1, v4, v7}, Lqj3;->T(Landroid/os/Parcel;II)V

    .line 1185
    .line 1186
    .line 1187
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1188
    .line 1189
    .line 1190
    move-result v3

    .line 1191
    int-to-short v3, v3

    .line 1192
    goto :goto_12

    .line 1193
    :cond_3e
    invoke-static {v1, v4, v7}, Lqj3;->T(Landroid/os/Parcel;II)V

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1197
    .line 1198
    .line 1199
    move-result v2

    .line 1200
    int-to-short v2, v2

    .line 1201
    goto :goto_12

    .line 1202
    :cond_3f
    invoke-static {v4, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1203
    .line 1204
    .line 1205
    move-result v9

    .line 1206
    goto :goto_12

    .line 1207
    :cond_40
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1208
    .line 1209
    .line 1210
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/UvmEntry;

    .line 1211
    .line 1212
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1213
    .line 1214
    .line 1215
    iput v9, v0, Lcom/google/android/gms/fido/fido2/api/common/UvmEntry;->a:I

    .line 1216
    .line 1217
    iput-short v2, v0, Lcom/google/android/gms/fido/fido2/api/common/UvmEntry;->b:S

    .line 1218
    .line 1219
    iput-short v3, v0, Lcom/google/android/gms/fido/fido2/api/common/UvmEntry;->c:S

    .line 1220
    .line 1221
    return-object v0

    .line 1222
    :pswitch_29
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1223
    .line 1224
    .line 1225
    move-result v0

    .line 1226
    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1227
    .line 1228
    .line 1229
    move-result v2

    .line 1230
    if-ge v2, v0, :cond_42

    .line 1231
    .line 1232
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1233
    .line 1234
    .line 1235
    move-result v2

    .line 1236
    int-to-char v3, v2

    .line 1237
    if-eq v3, v10, :cond_41

    .line 1238
    .line 1239
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1240
    .line 1241
    .line 1242
    goto :goto_13

    .line 1243
    :cond_41
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/UvmEntry;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1244
    .line 1245
    invoke-static {v1, v2, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v12

    .line 1249
    goto :goto_13

    .line 1250
    :cond_42
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1251
    .line 1252
    .line 1253
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/UvmEntries;

    .line 1254
    .line 1255
    invoke-direct {v0, v12}, Lcom/google/android/gms/fido/fido2/api/common/UvmEntries;-><init>(Ljava/util/ArrayList;)V

    .line 1256
    .line 1257
    .line 1258
    return-object v0

    .line 1259
    :pswitch_2a
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1260
    .line 1261
    .line 1262
    move-result v0

    .line 1263
    move-object v3, v12

    .line 1264
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1265
    .line 1266
    .line 1267
    move-result v4

    .line 1268
    if-ge v4, v0, :cond_47

    .line 1269
    .line 1270
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1271
    .line 1272
    .line 1273
    move-result v4

    .line 1274
    int-to-char v5, v4

    .line 1275
    if-eq v5, v10, :cond_46

    .line 1276
    .line 1277
    if-eq v5, v11, :cond_45

    .line 1278
    .line 1279
    if-eq v5, v8, :cond_44

    .line 1280
    .line 1281
    if-eq v5, v7, :cond_43

    .line 1282
    .line 1283
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1284
    .line 1285
    .line 1286
    goto :goto_14

    .line 1287
    :cond_43
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v3

    .line 1291
    goto :goto_14

    .line 1292
    :cond_44
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v2

    .line 1296
    goto :goto_14

    .line 1297
    :cond_45
    invoke-static {v4, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1298
    .line 1299
    .line 1300
    move-result v4

    .line 1301
    move v9, v4

    .line 1302
    goto :goto_14

    .line 1303
    :cond_46
    sget-object v5, Lcom/google/android/gms/internal/location/zzbe;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1304
    .line 1305
    invoke-static {v1, v4, v5}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v4

    .line 1309
    move-object v12, v4

    .line 1310
    goto :goto_14

    .line 1311
    :cond_47
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1312
    .line 1313
    .line 1314
    new-instance v0, Lcom/google/android/gms/location/GeofencingRequest;

    .line 1315
    .line 1316
    invoke-direct {v0, v12, v9, v2, v3}, Lcom/google/android/gms/location/GeofencingRequest;-><init>(Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;)V

    .line 1317
    .line 1318
    .line 1319
    return-object v0

    .line 1320
    :pswitch_2b
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v0

    .line 1324
    :try_start_1
    invoke-static {v0}, Lcom/google/android/gms/fido/fido2/api/common/zzat;->a(Ljava/lang/String;)Lcom/google/android/gms/fido/fido2/api/common/zzat;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v12
    :try_end_1
    .catch Lwd3; {:try_start_1 .. :try_end_1} :catch_1

    .line 1328
    goto :goto_15

    .line 1329
    :catch_1
    move-exception v0

    .line 1330
    invoke-static {v0}, Lds0;->p(Ljava/lang/Throwable;)V

    .line 1331
    .line 1332
    .line 1333
    :goto_15
    return-object v12

    .line 1334
    :pswitch_2c
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1335
    .line 1336
    .line 1337
    move-result v0

    .line 1338
    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1339
    .line 1340
    .line 1341
    move-result v2

    .line 1342
    if-ge v2, v0, :cond_49

    .line 1343
    .line 1344
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1345
    .line 1346
    .line 1347
    move-result v2

    .line 1348
    int-to-char v3, v2

    .line 1349
    if-eq v3, v10, :cond_48

    .line 1350
    .line 1351
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1352
    .line 1353
    .line 1354
    goto :goto_16

    .line 1355
    :cond_48
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1356
    .line 1357
    .line 1358
    move-result v9

    .line 1359
    goto :goto_16

    .line 1360
    :cond_49
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1361
    .line 1362
    .line 1363
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/UserVerificationMethodExtension;

    .line 1364
    .line 1365
    invoke-direct {v0, v9}, Lcom/google/android/gms/fido/fido2/api/common/UserVerificationMethodExtension;-><init>(Z)V

    .line 1366
    .line 1367
    .line 1368
    return-object v0

    .line 1369
    :pswitch_2d
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1370
    .line 1371
    .line 1372
    move-result v0

    .line 1373
    move-object v2, v12

    .line 1374
    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1375
    .line 1376
    .line 1377
    move-result v3

    .line 1378
    if-ge v3, v0, :cond_4c

    .line 1379
    .line 1380
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1381
    .line 1382
    .line 1383
    move-result v3

    .line 1384
    int-to-char v4, v3

    .line 1385
    if-eq v4, v11, :cond_4b

    .line 1386
    .line 1387
    if-eq v4, v8, :cond_4a

    .line 1388
    .line 1389
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1390
    .line 1391
    .line 1392
    goto :goto_17

    .line 1393
    :cond_4a
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v2

    .line 1397
    goto :goto_17

    .line 1398
    :cond_4b
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v12

    .line 1402
    goto :goto_17

    .line 1403
    :cond_4c
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1404
    .line 1405
    .line 1406
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/TokenBinding;

    .line 1407
    .line 1408
    invoke-direct {v0, v12, v2}, Lcom/google/android/gms/fido/fido2/api/common/TokenBinding;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1409
    .line 1410
    .line 1411
    return-object v0

    .line 1412
    :pswitch_2e
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1413
    .line 1414
    .line 1415
    move-result v0

    .line 1416
    :goto_18
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1417
    .line 1418
    .line 1419
    move-result v2

    .line 1420
    if-ge v2, v0, :cond_4e

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
    if-eq v3, v10, :cond_4d

    .line 1428
    .line 1429
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1430
    .line 1431
    .line 1432
    goto :goto_18

    .line 1433
    :cond_4d
    invoke-static {v2, v1}, Lqj3;->f(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v12

    .line 1437
    goto :goto_18

    .line 1438
    :cond_4e
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1439
    .line 1440
    .line 1441
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzao;

    .line 1442
    .line 1443
    invoke-direct {v0, v12}, Lcom/google/android/gms/measurement/internal/zzao;-><init>(Landroid/os/Bundle;)V

    .line 1444
    .line 1445
    .line 1446
    return-object v0

    .line 1447
    :pswitch_2f
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v0

    .line 1451
    if-nez v0, :cond_4f

    .line 1452
    .line 1453
    goto :goto_19

    .line 1454
    :cond_4f
    move-object v2, v0

    .line 1455
    :goto_19
    :try_start_2
    invoke-static {v2}, Lcom/google/android/gms/fido/fido2/api/common/ResidentKeyRequirement;->a(Ljava/lang/String;)Lcom/google/android/gms/fido/fido2/api/common/ResidentKeyRequirement;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v12
    :try_end_2
    .catch Lo32; {:try_start_2 .. :try_end_2} :catch_2

    .line 1459
    goto :goto_1a

    .line 1460
    :catch_2
    move-exception v0

    .line 1461
    invoke-static {v0}, Lds0;->p(Ljava/lang/Throwable;)V

    .line 1462
    .line 1463
    .line 1464
    :goto_1a
    return-object v12

    .line 1465
    :pswitch_30
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1466
    .line 1467
    .line 1468
    move-result v0

    .line 1469
    move-object v2, v12

    .line 1470
    move-object v3, v2

    .line 1471
    move-object v5, v3

    .line 1472
    :goto_1b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1473
    .line 1474
    .line 1475
    move-result v6

    .line 1476
    if-ge v6, v0, :cond_54

    .line 1477
    .line 1478
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1479
    .line 1480
    .line 1481
    move-result v6

    .line 1482
    int-to-char v9, v6

    .line 1483
    if-eq v9, v11, :cond_53

    .line 1484
    .line 1485
    if-eq v9, v8, :cond_52

    .line 1486
    .line 1487
    if-eq v9, v7, :cond_51

    .line 1488
    .line 1489
    if-eq v9, v4, :cond_50

    .line 1490
    .line 1491
    invoke-static {v6, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1492
    .line 1493
    .line 1494
    goto :goto_1b

    .line 1495
    :cond_50
    invoke-static {v6, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v5

    .line 1499
    goto :goto_1b

    .line 1500
    :cond_51
    invoke-static {v6, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v3

    .line 1504
    goto :goto_1b

    .line 1505
    :cond_52
    invoke-static {v6, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v2

    .line 1509
    goto :goto_1b

    .line 1510
    :cond_53
    invoke-static {v6, v1}, Lqj3;->g(ILandroid/os/Parcel;)[B

    .line 1511
    .line 1512
    .line 1513
    move-result-object v12

    .line 1514
    goto :goto_1b

    .line 1515
    :cond_54
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1516
    .line 1517
    .line 1518
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialUserEntity;

    .line 1519
    .line 1520
    invoke-direct {v0, v2, v3, v5, v12}, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialUserEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 1521
    .line 1522
    .line 1523
    return-object v0

    .line 1524
    :pswitch_31
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v0

    .line 1528
    :try_start_3
    invoke-static {v0}, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialType;->a(Ljava/lang/String;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialType;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v12
    :try_end_3
    .catch Lnz1; {:try_start_3 .. :try_end_3} :catch_3

    .line 1532
    goto :goto_1c

    .line 1533
    :catch_3
    move-exception v0

    .line 1534
    invoke-static {v0}, Lds0;->p(Ljava/lang/Throwable;)V

    .line 1535
    .line 1536
    .line 1537
    :goto_1c
    return-object v12

    .line 1538
    :pswitch_32
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1539
    .line 1540
    .line 1541
    move-result v0

    .line 1542
    move-object v2, v12

    .line 1543
    move-object v3, v2

    .line 1544
    :goto_1d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1545
    .line 1546
    .line 1547
    move-result v4

    .line 1548
    if-ge v4, v0, :cond_58

    .line 1549
    .line 1550
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1551
    .line 1552
    .line 1553
    move-result v4

    .line 1554
    int-to-char v5, v4

    .line 1555
    if-eq v5, v11, :cond_57

    .line 1556
    .line 1557
    if-eq v5, v8, :cond_56

    .line 1558
    .line 1559
    if-eq v5, v7, :cond_55

    .line 1560
    .line 1561
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1562
    .line 1563
    .line 1564
    goto :goto_1d

    .line 1565
    :cond_55
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v3

    .line 1569
    goto :goto_1d

    .line 1570
    :cond_56
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v2

    .line 1574
    goto :goto_1d

    .line 1575
    :cond_57
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v12

    .line 1579
    goto :goto_1d

    .line 1580
    :cond_58
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1581
    .line 1582
    .line 1583
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRpEntity;

    .line 1584
    .line 1585
    invoke-direct {v0, v12, v2, v3}, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRpEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1586
    .line 1587
    .line 1588
    return-object v0

    .line 1589
    :pswitch_33
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1590
    .line 1591
    .line 1592
    move-result v0

    .line 1593
    :goto_1e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1594
    .line 1595
    .line 1596
    move-result v2

    .line 1597
    if-ge v2, v0, :cond_5a

    .line 1598
    .line 1599
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1600
    .line 1601
    .line 1602
    move-result v2

    .line 1603
    int-to-char v3, v2

    .line 1604
    if-eq v3, v10, :cond_59

    .line 1605
    .line 1606
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1607
    .line 1608
    .line 1609
    goto :goto_1e

    .line 1610
    :cond_59
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1611
    .line 1612
    .line 1613
    move-result v9

    .line 1614
    goto :goto_1e

    .line 1615
    :cond_5a
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1616
    .line 1617
    .line 1618
    new-instance v0, Lcom/google/android/gms/common/internal/zzai;

    .line 1619
    .line 1620
    invoke-direct {v0, v9}, Lcom/google/android/gms/common/internal/zzai;-><init>(I)V

    .line 1621
    .line 1622
    .line 1623
    return-object v0

    .line 1624
    nop

    .line 1625
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_33
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
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
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
    .end packed-switch

    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    :pswitch_data_1
    .packed-switch 0x1
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

    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
    .end packed-switch

    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_27
        :pswitch_20
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lmd3;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lcom/google/android/gms/location/LocationRequest;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzbe;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lcom/google/android/gms/location/LocationAvailability;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lcom/google/android/gms/drive/zza;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lcom/google/android/gms/common/Feature;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lcom/google/android/gms/cloudmessaging/zzd;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lcom/google/android/gms/auth/api/proxy/ProxyResponse;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lcom/google/android/gms/recaptchabase/ExecuteRequest;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lcom/google/android/gms/games/video/VideoConfiguration;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lcom/google/android/gms/auth/AccountChangeEventsRequest;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lcom/google/android/gms/games/snapshot/SnapshotEntity;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lcom/google/android/gms/games/internal/game/GameBadgeEntity;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lcom/google/android/gms/games/zza;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lcom/google/android/gms/fido/u2f/api/common/ChannelIdValue;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lcom/google/android/gms/fido/sourcedevice/SourceStartDirectTransferOptions;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/AttestationConveyancePreference;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lcom/google/android/gms/drive/query/Query;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/UvmEntry;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/UvmEntries;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lcom/google/android/gms/location/GeofencingRequest;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/zzat;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/UserVerificationMethodExtension;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/TokenBinding;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzao;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/ResidentKeyRequirement;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialUserEntity;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialType;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialRpEntity;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lcom/google/android/gms/common/internal/zzai;

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

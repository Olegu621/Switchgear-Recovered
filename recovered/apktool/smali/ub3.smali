.class public final Lub3;
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
    iput p1, p0, Lub3;->a:I

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
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Lub3;->a:I

    .line 6
    .line 7
    const/4 v2, 0x5

    .line 8
    const/16 v3, 0x3e8

    .line 9
    .line 10
    const/4 v4, 0x4

    .line 11
    const/4 v5, 0x3

    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v9, 0x0

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
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-ge v2, v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    int-to-char v3, v2

    .line 34
    if-eq v3, v6, :cond_1

    .line 35
    .line 36
    if-eq v3, v5, :cond_0

    .line 37
    .line 38
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    sget-object v3, Lcom/google/android/gms/drive/DriveId;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 48
    .line 49
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    move-object v9, v2

    .line 54
    check-cast v9, Lcom/google/android/gms/drive/DriveId;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Lcom/google/android/gms/drive/events/ChangeEvent;

    .line 61
    .line 62
    invoke-direct {v0, v9, v8}, Lcom/google/android/gms/drive/events/ChangeEvent;-><init>(Lcom/google/android/gms/drive/DriveId;I)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_0
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    move-object v3, v9

    .line 71
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-ge v4, v0, :cond_5

    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    int-to-char v5, v4

    .line 82
    if-eq v5, v6, :cond_4

    .line 83
    .line 84
    if-eq v5, v2, :cond_3

    .line 85
    .line 86
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    sget-object v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 91
    .line 92
    invoke-static {v1, v4, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    invoke-static {v4, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    goto :goto_1

    .line 104
    :cond_5
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 105
    .line 106
    .line 107
    new-instance v0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;

    .line 108
    .line 109
    invoke-direct {v0, v9, v3}, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;-><init>(Ljava/lang/String;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 110
    .line 111
    .line 112
    return-object v0

    .line 113
    :pswitch_1
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    move-object v2, v9

    .line 118
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-ge v3, v0, :cond_8

    .line 123
    .line 124
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    int-to-char v4, v3

    .line 129
    if-eq v4, v7, :cond_7

    .line 130
    .line 131
    if-eq v4, v6, :cond_6

    .line 132
    .line 133
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_6
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    goto :goto_2

    .line 142
    :cond_7
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    goto :goto_2

    .line 147
    :cond_8
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 148
    .line 149
    .line 150
    new-instance v0, Lcom/google/android/gms/auth/api/identity/SignInPassword;

    .line 151
    .line 152
    invoke-direct {v0, v9, v2}, Lcom/google/android/gms/auth/api/identity/SignInPassword;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return-object v0

    .line 156
    :pswitch_2
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    move-object v11, v9

    .line 161
    move-object v12, v11

    .line 162
    move-object v13, v12

    .line 163
    move-object v14, v13

    .line 164
    move-object v15, v14

    .line 165
    move-object/from16 v16, v15

    .line 166
    .line 167
    move-object/from16 v17, v16

    .line 168
    .line 169
    move-object/from16 v18, v17

    .line 170
    .line 171
    move-object/from16 v19, v18

    .line 172
    .line 173
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-ge v2, v0, :cond_9

    .line 178
    .line 179
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    int-to-char v3, v2

    .line 184
    packed-switch v3, :pswitch_data_1

    .line 185
    .line 186
    .line 187
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :pswitch_3
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 192
    .line 193
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    move-object/from16 v19, v2

    .line 198
    .line 199
    check-cast v19, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :pswitch_4
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v18

    .line 206
    goto :goto_3

    .line 207
    :pswitch_5
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v17

    .line 211
    goto :goto_3

    .line 212
    :pswitch_6
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v16

    .line 216
    goto :goto_3

    .line 217
    :pswitch_7
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 218
    .line 219
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    move-object v15, v2

    .line 224
    check-cast v15, Landroid/net/Uri;

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :pswitch_8
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v14

    .line 231
    goto :goto_3

    .line 232
    :pswitch_9
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v13

    .line 236
    goto :goto_3

    .line 237
    :pswitch_a
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v12

    .line 241
    goto :goto_3

    .line 242
    :pswitch_b
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v11

    .line 246
    goto :goto_3

    .line 247
    :cond_9
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 248
    .line 249
    .line 250
    new-instance v10, Lcom/google/android/gms/auth/api/identity/SignInCredential;

    .line 251
    .line 252
    invoke-direct/range {v10 .. v19}, Lcom/google/android/gms/auth/api/identity/SignInCredential;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;)V

    .line 253
    .line 254
    .line 255
    return-object v10

    .line 256
    :pswitch_c
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    if-ge v2, v0, :cond_b

    .line 265
    .line 266
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    int-to-char v3, v2

    .line 271
    if-eq v3, v7, :cond_a

    .line 272
    .line 273
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 274
    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_a
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 278
    .line 279
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    move-object v9, v2

    .line 284
    check-cast v9, Landroid/app/PendingIntent;

    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_b
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 288
    .line 289
    .line 290
    new-instance v0, Lcom/google/android/gms/auth/api/identity/SavePasswordResult;

    .line 291
    .line 292
    invoke-direct {v0, v9}, Lcom/google/android/gms/auth/api/identity/SavePasswordResult;-><init>(Landroid/app/PendingIntent;)V

    .line 293
    .line 294
    .line 295
    return-object v0

    .line 296
    :pswitch_d
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    move-object v2, v9

    .line 301
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    if-ge v3, v0, :cond_f

    .line 306
    .line 307
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    int-to-char v4, v3

    .line 312
    if-eq v4, v7, :cond_e

    .line 313
    .line 314
    if-eq v4, v6, :cond_d

    .line 315
    .line 316
    if-eq v4, v5, :cond_c

    .line 317
    .line 318
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 319
    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_c
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 323
    .line 324
    .line 325
    move-result v8

    .line 326
    goto :goto_5

    .line 327
    :cond_d
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    goto :goto_5

    .line 332
    :cond_e
    sget-object v4, Lcom/google/android/gms/auth/api/identity/SignInPassword;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 333
    .line 334
    invoke-static {v1, v3, v4}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    move-object v9, v3

    .line 339
    check-cast v9, Lcom/google/android/gms/auth/api/identity/SignInPassword;

    .line 340
    .line 341
    goto :goto_5

    .line 342
    :cond_f
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 343
    .line 344
    .line 345
    new-instance v0, Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;

    .line 346
    .line 347
    invoke-direct {v0, v9, v2, v8}, Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;-><init>(Lcom/google/android/gms/auth/api/identity/SignInPassword;Ljava/lang/String;I)V

    .line 348
    .line 349
    .line 350
    return-object v0

    .line 351
    :pswitch_e
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 352
    .line 353
    .line 354
    move-result v0

    .line 355
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    if-ge v2, v0, :cond_11

    .line 360
    .line 361
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 362
    .line 363
    .line 364
    move-result v2

    .line 365
    int-to-char v3, v2

    .line 366
    if-eq v3, v7, :cond_10

    .line 367
    .line 368
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 369
    .line 370
    .line 371
    goto :goto_6

    .line 372
    :cond_10
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 373
    .line 374
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    move-object v9, v2

    .line 379
    check-cast v9, Landroid/app/PendingIntent;

    .line 380
    .line 381
    goto :goto_6

    .line 382
    :cond_11
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 383
    .line 384
    .line 385
    new-instance v0, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenResult;

    .line 386
    .line 387
    invoke-direct {v0, v9}, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenResult;-><init>(Landroid/app/PendingIntent;)V

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
    move v7, v8

    .line 396
    move-object v2, v9

    .line 397
    move-object v3, v2

    .line 398
    move-object v4, v3

    .line 399
    move-object v5, v4

    .line 400
    move-object v6, v5

    .line 401
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 402
    .line 403
    .line 404
    move-result v8

    .line 405
    if-ge v8, v0, :cond_12

    .line 406
    .line 407
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 408
    .line 409
    .line 410
    move-result v8

    .line 411
    int-to-char v9, v8

    .line 412
    packed-switch v9, :pswitch_data_2

    .line 413
    .line 414
    .line 415
    invoke-static {v8, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 416
    .line 417
    .line 418
    goto :goto_7

    .line 419
    :pswitch_10
    invoke-static {v8, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 420
    .line 421
    .line 422
    move-result v7

    .line 423
    goto :goto_7

    .line 424
    :pswitch_11
    invoke-static {v8, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v6

    .line 428
    goto :goto_7

    .line 429
    :pswitch_12
    invoke-static {v8, v1}, Lqj3;->l(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 430
    .line 431
    .line 432
    move-result-object v5

    .line 433
    goto :goto_7

    .line 434
    :pswitch_13
    invoke-static {v8, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v4

    .line 438
    goto :goto_7

    .line 439
    :pswitch_14
    invoke-static {v8, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    goto :goto_7

    .line 444
    :pswitch_15
    sget-object v2, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 445
    .line 446
    invoke-static {v1, v8, v2}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    check-cast v2, Landroid/app/PendingIntent;

    .line 451
    .line 452
    goto :goto_7

    .line 453
    :cond_12
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 454
    .line 455
    .line 456
    new-instance v1, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;

    .line 457
    .line 458
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;-><init>(Landroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)V

    .line 459
    .line 460
    .line 461
    return-object v1

    .line 462
    :pswitch_16
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 463
    .line 464
    .line 465
    move-result v0

    .line 466
    move-object v2, v9

    .line 467
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    if-ge v3, v0, :cond_15

    .line 472
    .line 473
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 474
    .line 475
    .line 476
    move-result v3

    .line 477
    int-to-char v4, v3

    .line 478
    if-eq v4, v7, :cond_14

    .line 479
    .line 480
    if-eq v4, v6, :cond_13

    .line 481
    .line 482
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 483
    .line 484
    .line 485
    goto :goto_8

    .line 486
    :cond_13
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    goto :goto_8

    .line 491
    :cond_14
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v9

    .line 495
    goto :goto_8

    .line 496
    :cond_15
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 497
    .line 498
    .line 499
    new-instance v0, Lcom/google/android/gms/auth/api/credentials/IdToken;

    .line 500
    .line 501
    invoke-direct {v0, v9, v2}, Lcom/google/android/gms/auth/api/credentials/IdToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    return-object v0

    .line 505
    :pswitch_17
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 506
    .line 507
    .line 508
    move-result v0

    .line 509
    move v2, v8

    .line 510
    move v7, v2

    .line 511
    move-object v3, v9

    .line 512
    move-object v4, v3

    .line 513
    move-object v5, v4

    .line 514
    move-object v6, v5

    .line 515
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 516
    .line 517
    .line 518
    move-result v8

    .line 519
    if-ge v8, v0, :cond_16

    .line 520
    .line 521
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 522
    .line 523
    .line 524
    move-result v8

    .line 525
    int-to-char v9, v8

    .line 526
    packed-switch v9, :pswitch_data_3

    .line 527
    .line 528
    .line 529
    invoke-static {v8, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 530
    .line 531
    .line 532
    goto :goto_9

    .line 533
    :pswitch_18
    invoke-static {v8, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 534
    .line 535
    .line 536
    move-result v2

    .line 537
    goto :goto_9

    .line 538
    :pswitch_19
    invoke-static {v8, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 539
    .line 540
    .line 541
    move-result v7

    .line 542
    goto :goto_9

    .line 543
    :pswitch_1a
    invoke-static {v8, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v6

    .line 547
    goto :goto_9

    .line 548
    :pswitch_1b
    invoke-static {v8, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v5

    .line 552
    goto :goto_9

    .line 553
    :pswitch_1c
    invoke-static {v8, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v4

    .line 557
    goto :goto_9

    .line 558
    :pswitch_1d
    invoke-static {v8, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    goto :goto_9

    .line 563
    :cond_16
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 564
    .line 565
    .line 566
    new-instance v1, Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;

    .line 567
    .line 568
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 569
    .line 570
    .line 571
    return-object v1

    .line 572
    :pswitch_1e
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 573
    .line 574
    .line 575
    move-result v0

    .line 576
    move v11, v8

    .line 577
    move v13, v11

    .line 578
    move v14, v13

    .line 579
    move/from16 v16, v14

    .line 580
    .line 581
    move-object v12, v9

    .line 582
    move-object v15, v12

    .line 583
    move-object/from16 v17, v15

    .line 584
    .line 585
    move-object/from16 v18, v17

    .line 586
    .line 587
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 588
    .line 589
    .line 590
    move-result v2

    .line 591
    if-ge v2, v0, :cond_18

    .line 592
    .line 593
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 594
    .line 595
    .line 596
    move-result v2

    .line 597
    int-to-char v4, v2

    .line 598
    if-eq v4, v3, :cond_17

    .line 599
    .line 600
    packed-switch v4, :pswitch_data_4

    .line 601
    .line 602
    .line 603
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 604
    .line 605
    .line 606
    goto :goto_a

    .line 607
    :pswitch_1f
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v18

    .line 611
    goto :goto_a

    .line 612
    :pswitch_20
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v17

    .line 616
    goto :goto_a

    .line 617
    :pswitch_21
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 618
    .line 619
    .line 620
    move-result v16

    .line 621
    goto :goto_a

    .line 622
    :pswitch_22
    invoke-static {v2, v1}, Lqj3;->k(ILandroid/os/Parcel;)[Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v15

    .line 626
    goto :goto_a

    .line 627
    :pswitch_23
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 628
    .line 629
    .line 630
    move-result v14

    .line 631
    goto :goto_a

    .line 632
    :pswitch_24
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 633
    .line 634
    .line 635
    move-result v13

    .line 636
    goto :goto_a

    .line 637
    :pswitch_25
    sget-object v4, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 638
    .line 639
    invoke-static {v1, v2, v4}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 640
    .line 641
    .line 642
    move-result-object v2

    .line 643
    move-object v12, v2

    .line 644
    check-cast v12, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    .line 645
    .line 646
    goto :goto_a

    .line 647
    :cond_17
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 648
    .line 649
    .line 650
    move-result v11

    .line 651
    goto :goto_a

    .line 652
    :cond_18
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 653
    .line 654
    .line 655
    new-instance v10, Lcom/google/android/gms/auth/api/credentials/HintRequest;

    .line 656
    .line 657
    invoke-direct/range {v10 .. v18}, Lcom/google/android/gms/auth/api/credentials/HintRequest;-><init>(ILcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;ZZ[Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    return-object v10

    .line 661
    :pswitch_26
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 662
    .line 663
    .line 664
    move-result v0

    .line 665
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 666
    .line 667
    .line 668
    move-result v2

    .line 669
    if-ge v2, v0, :cond_1a

    .line 670
    .line 671
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 672
    .line 673
    .line 674
    move-result v2

    .line 675
    int-to-char v3, v2

    .line 676
    if-eq v3, v7, :cond_19

    .line 677
    .line 678
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 679
    .line 680
    .line 681
    goto :goto_b

    .line 682
    :cond_19
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 683
    .line 684
    .line 685
    move-result v8

    .line 686
    goto :goto_b

    .line 687
    :cond_1a
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 688
    .line 689
    .line 690
    new-instance v0, Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;

    .line 691
    .line 692
    invoke-direct {v0, v8}, Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;-><init>(I)V

    .line 693
    .line 694
    .line 695
    return-object v0

    .line 696
    :pswitch_27
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 697
    .line 698
    .line 699
    move-result v0

    .line 700
    move v11, v8

    .line 701
    move v12, v11

    .line 702
    move/from16 v16, v12

    .line 703
    .line 704
    move/from16 v19, v16

    .line 705
    .line 706
    move-object v13, v9

    .line 707
    move-object v14, v13

    .line 708
    move-object v15, v14

    .line 709
    move-object/from16 v17, v15

    .line 710
    .line 711
    move-object/from16 v18, v17

    .line 712
    .line 713
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 714
    .line 715
    .line 716
    move-result v2

    .line 717
    if-ge v2, v0, :cond_1c

    .line 718
    .line 719
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 720
    .line 721
    .line 722
    move-result v2

    .line 723
    int-to-char v4, v2

    .line 724
    if-eq v4, v3, :cond_1b

    .line 725
    .line 726
    packed-switch v4, :pswitch_data_5

    .line 727
    .line 728
    .line 729
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 730
    .line 731
    .line 732
    goto :goto_c

    .line 733
    :pswitch_28
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 734
    .line 735
    .line 736
    move-result v19

    .line 737
    goto :goto_c

    .line 738
    :pswitch_29
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v18

    .line 742
    goto :goto_c

    .line 743
    :pswitch_2a
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object v17

    .line 747
    goto :goto_c

    .line 748
    :pswitch_2b
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 749
    .line 750
    .line 751
    move-result v16

    .line 752
    goto :goto_c

    .line 753
    :pswitch_2c
    sget-object v4, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 754
    .line 755
    invoke-static {v1, v2, v4}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 756
    .line 757
    .line 758
    move-result-object v2

    .line 759
    move-object v15, v2

    .line 760
    check-cast v15, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    .line 761
    .line 762
    goto :goto_c

    .line 763
    :pswitch_2d
    sget-object v4, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 764
    .line 765
    invoke-static {v1, v2, v4}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    move-object v14, v2

    .line 770
    check-cast v14, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    .line 771
    .line 772
    goto :goto_c

    .line 773
    :pswitch_2e
    invoke-static {v2, v1}, Lqj3;->k(ILandroid/os/Parcel;)[Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object v13

    .line 777
    goto :goto_c

    .line 778
    :pswitch_2f
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 779
    .line 780
    .line 781
    move-result v12

    .line 782
    goto :goto_c

    .line 783
    :cond_1b
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 784
    .line 785
    .line 786
    move-result v11

    .line 787
    goto :goto_c

    .line 788
    :cond_1c
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 789
    .line 790
    .line 791
    new-instance v10, Lcom/google/android/gms/auth/api/credentials/CredentialRequest;

    .line 792
    .line 793
    invoke-direct/range {v10 .. v19}, Lcom/google/android/gms/auth/api/credentials/CredentialRequest;-><init>(IZ[Ljava/lang/String;Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;ZLjava/lang/String;Ljava/lang/String;Z)V

    .line 794
    .line 795
    .line 796
    return-object v10

    .line 797
    :pswitch_30
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 798
    .line 799
    .line 800
    move-result v0

    .line 801
    const-string v2, ""

    .line 802
    .line 803
    move-object v3, v2

    .line 804
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 805
    .line 806
    .line 807
    move-result v5

    .line 808
    if-ge v5, v0, :cond_20

    .line 809
    .line 810
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 811
    .line 812
    .line 813
    move-result v5

    .line 814
    int-to-char v6, v5

    .line 815
    if-eq v6, v4, :cond_1f

    .line 816
    .line 817
    const/4 v7, 0x7

    .line 818
    if-eq v6, v7, :cond_1e

    .line 819
    .line 820
    const/16 v7, 0x8

    .line 821
    .line 822
    if-eq v6, v7, :cond_1d

    .line 823
    .line 824
    invoke-static {v5, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 825
    .line 826
    .line 827
    goto :goto_d

    .line 828
    :cond_1d
    invoke-static {v5, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v3

    .line 832
    goto :goto_d

    .line 833
    :cond_1e
    sget-object v6, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 834
    .line 835
    invoke-static {v1, v5, v6}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 836
    .line 837
    .line 838
    move-result-object v5

    .line 839
    move-object v9, v5

    .line 840
    check-cast v9, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 841
    .line 842
    goto :goto_d

    .line 843
    :cond_1f
    invoke-static {v5, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v2

    .line 847
    goto :goto_d

    .line 848
    :cond_20
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 849
    .line 850
    .line 851
    new-instance v0, Lcom/google/android/gms/auth/api/signin/SignInAccount;

    .line 852
    .line 853
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 854
    .line 855
    .line 856
    iput-object v9, v0, Lcom/google/android/gms/auth/api/signin/SignInAccount;->b:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 857
    .line 858
    const-string v1, "8.3 and 8.4 SDKs require non-null email"

    .line 859
    .line 860
    invoke-static {v2, v1}, Lkb1;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 861
    .line 862
    .line 863
    iput-object v2, v0, Lcom/google/android/gms/auth/api/signin/SignInAccount;->a:Ljava/lang/String;

    .line 864
    .line 865
    const-string v1, "8.3 and 8.4 SDKs require non-null userId"

    .line 866
    .line 867
    invoke-static {v3, v1}, Lkb1;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 868
    .line 869
    .line 870
    iput-object v3, v0, Lcom/google/android/gms/auth/api/signin/SignInAccount;->c:Ljava/lang/String;

    .line 871
    .line 872
    return-object v0

    .line 873
    :pswitch_31
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 874
    .line 875
    .line 876
    move-result v0

    .line 877
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 878
    .line 879
    .line 880
    move-result v2

    .line 881
    if-ge v2, v0, :cond_22

    .line 882
    .line 883
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 884
    .line 885
    .line 886
    move-result v2

    .line 887
    int-to-char v3, v2

    .line 888
    if-eq v3, v7, :cond_21

    .line 889
    .line 890
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 891
    .line 892
    .line 893
    goto :goto_e

    .line 894
    :cond_21
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 895
    .line 896
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 897
    .line 898
    .line 899
    move-result-object v2

    .line 900
    move-object v9, v2

    .line 901
    check-cast v9, Landroid/app/PendingIntent;

    .line 902
    .line 903
    goto :goto_e

    .line 904
    :cond_22
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 905
    .line 906
    .line 907
    new-instance v0, Lcom/google/android/gms/auth/api/identity/BeginSignInResult;

    .line 908
    .line 909
    invoke-direct {v0, v9}, Lcom/google/android/gms/auth/api/identity/BeginSignInResult;-><init>(Landroid/app/PendingIntent;)V

    .line 910
    .line 911
    .line 912
    return-object v0

    .line 913
    :pswitch_32
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 914
    .line 915
    .line 916
    move-result v0

    .line 917
    move v10, v8

    .line 918
    move v11, v10

    .line 919
    move v12, v11

    .line 920
    move v13, v12

    .line 921
    move v14, v13

    .line 922
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 923
    .line 924
    .line 925
    move-result v2

    .line 926
    if-ge v2, v0, :cond_28

    .line 927
    .line 928
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 929
    .line 930
    .line 931
    move-result v2

    .line 932
    int-to-char v8, v2

    .line 933
    if-eq v8, v7, :cond_27

    .line 934
    .line 935
    if-eq v8, v6, :cond_26

    .line 936
    .line 937
    if-eq v8, v5, :cond_25

    .line 938
    .line 939
    if-eq v8, v4, :cond_24

    .line 940
    .line 941
    if-eq v8, v3, :cond_23

    .line 942
    .line 943
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 944
    .line 945
    .line 946
    goto :goto_f

    .line 947
    :cond_23
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 948
    .line 949
    .line 950
    move-result v10

    .line 951
    goto :goto_f

    .line 952
    :cond_24
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 953
    .line 954
    .line 955
    move-result v11

    .line 956
    goto :goto_f

    .line 957
    :cond_25
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 958
    .line 959
    .line 960
    move-result v14

    .line 961
    goto :goto_f

    .line 962
    :cond_26
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 963
    .line 964
    .line 965
    move-result v13

    .line 966
    goto :goto_f

    .line 967
    :cond_27
    invoke-static {v2, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 968
    .line 969
    .line 970
    move-result v12

    .line 971
    goto :goto_f

    .line 972
    :cond_28
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 973
    .line 974
    .line 975
    new-instance v9, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    .line 976
    .line 977
    invoke-direct/range {v9 .. v14}, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;-><init>(IIZZZ)V

    .line 978
    .line 979
    .line 980
    return-object v9

    .line 981
    :pswitch_33
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 982
    .line 983
    .line 984
    move-result v0

    .line 985
    move-object v11, v9

    .line 986
    move-object v12, v11

    .line 987
    move-object v13, v12

    .line 988
    move-object v14, v13

    .line 989
    move-object v15, v14

    .line 990
    move-object/from16 v16, v15

    .line 991
    .line 992
    move-object/from16 v17, v16

    .line 993
    .line 994
    move-object/from16 v18, v17

    .line 995
    .line 996
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 997
    .line 998
    .line 999
    move-result v2

    .line 1000
    if-ge v2, v0, :cond_29

    .line 1001
    .line 1002
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1003
    .line 1004
    .line 1005
    move-result v2

    .line 1006
    int-to-char v3, v2

    .line 1007
    packed-switch v3, :pswitch_data_6

    .line 1008
    .line 1009
    .line 1010
    :pswitch_34
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1011
    .line 1012
    .line 1013
    goto :goto_10

    .line 1014
    :pswitch_35
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v18

    .line 1018
    goto :goto_10

    .line 1019
    :pswitch_36
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v17

    .line 1023
    goto :goto_10

    .line 1024
    :pswitch_37
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v16

    .line 1028
    goto :goto_10

    .line 1029
    :pswitch_38
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v15

    .line 1033
    goto :goto_10

    .line 1034
    :pswitch_39
    sget-object v3, Lcom/google/android/gms/auth/api/credentials/IdToken;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1035
    .line 1036
    invoke-static {v1, v2, v3}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v14

    .line 1040
    goto :goto_10

    .line 1041
    :pswitch_3a
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1042
    .line 1043
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v2

    .line 1047
    move-object v13, v2

    .line 1048
    check-cast v13, Landroid/net/Uri;

    .line 1049
    .line 1050
    goto :goto_10

    .line 1051
    :pswitch_3b
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v12

    .line 1055
    goto :goto_10

    .line 1056
    :pswitch_3c
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v11

    .line 1060
    goto :goto_10

    .line 1061
    :cond_29
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1062
    .line 1063
    .line 1064
    new-instance v10, Lcom/google/android/gms/auth/api/credentials/Credential;

    .line 1065
    .line 1066
    invoke-direct/range {v10 .. v18}, Lcom/google/android/gms/auth/api/credentials/Credential;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1067
    .line 1068
    .line 1069
    return-object v10

    .line 1070
    :pswitch_3d
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1071
    .line 1072
    .line 1073
    move-result v0

    .line 1074
    move v2, v8

    .line 1075
    move v3, v2

    .line 1076
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1077
    .line 1078
    .line 1079
    move-result v10

    .line 1080
    if-ge v10, v0, :cond_2e

    .line 1081
    .line 1082
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1083
    .line 1084
    .line 1085
    move-result v10

    .line 1086
    int-to-char v11, v10

    .line 1087
    if-eq v11, v7, :cond_2d

    .line 1088
    .line 1089
    if-eq v11, v6, :cond_2c

    .line 1090
    .line 1091
    if-eq v11, v5, :cond_2b

    .line 1092
    .line 1093
    if-eq v11, v4, :cond_2a

    .line 1094
    .line 1095
    invoke-static {v10, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1096
    .line 1097
    .line 1098
    goto :goto_11

    .line 1099
    :cond_2a
    sget-object v9, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1100
    .line 1101
    invoke-static {v1, v10, v9}, Lqj3;->m(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v9

    .line 1105
    check-cast v9, [Lcom/google/android/gms/common/api/Scope;

    .line 1106
    .line 1107
    goto :goto_11

    .line 1108
    :cond_2b
    invoke-static {v10, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1109
    .line 1110
    .line 1111
    move-result v3

    .line 1112
    goto :goto_11

    .line 1113
    :cond_2c
    invoke-static {v10, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1114
    .line 1115
    .line 1116
    move-result v2

    .line 1117
    goto :goto_11

    .line 1118
    :cond_2d
    invoke-static {v10, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1119
    .line 1120
    .line 1121
    move-result v8

    .line 1122
    goto :goto_11

    .line 1123
    :cond_2e
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1124
    .line 1125
    .line 1126
    new-instance v0, Lcom/google/android/gms/common/internal/zax;

    .line 1127
    .line 1128
    invoke-direct {v0, v8, v2, v3, v9}, Lcom/google/android/gms/common/internal/zax;-><init>(III[Lcom/google/android/gms/common/api/Scope;)V

    .line 1129
    .line 1130
    .line 1131
    return-object v0

    .line 1132
    :pswitch_3e
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1133
    .line 1134
    .line 1135
    move-result v0

    .line 1136
    move v11, v8

    .line 1137
    move v14, v11

    .line 1138
    move v15, v14

    .line 1139
    move-object v12, v9

    .line 1140
    move-object v13, v12

    .line 1141
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1142
    .line 1143
    .line 1144
    move-result v3

    .line 1145
    if-ge v3, v0, :cond_34

    .line 1146
    .line 1147
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1148
    .line 1149
    .line 1150
    move-result v3

    .line 1151
    int-to-char v8, v3

    .line 1152
    if-eq v8, v7, :cond_33

    .line 1153
    .line 1154
    if-eq v8, v6, :cond_32

    .line 1155
    .line 1156
    if-eq v8, v5, :cond_31

    .line 1157
    .line 1158
    if-eq v8, v4, :cond_30

    .line 1159
    .line 1160
    if-eq v8, v2, :cond_2f

    .line 1161
    .line 1162
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1163
    .line 1164
    .line 1165
    goto :goto_12

    .line 1166
    :cond_2f
    invoke-static {v3, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1167
    .line 1168
    .line 1169
    move-result v15

    .line 1170
    goto :goto_12

    .line 1171
    :cond_30
    invoke-static {v3, v1}, Lqj3;->y(ILandroid/os/Parcel;)Z

    .line 1172
    .line 1173
    .line 1174
    move-result v14

    .line 1175
    goto :goto_12

    .line 1176
    :cond_31
    sget-object v8, Lcom/google/android/gms/common/ConnectionResult;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1177
    .line 1178
    invoke-static {v1, v3, v8}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v3

    .line 1182
    move-object v13, v3

    .line 1183
    check-cast v13, Lcom/google/android/gms/common/ConnectionResult;

    .line 1184
    .line 1185
    goto :goto_12

    .line 1186
    :cond_32
    invoke-static {v3, v1}, Lqj3;->C(ILandroid/os/Parcel;)Landroid/os/IBinder;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v12

    .line 1190
    goto :goto_12

    .line 1191
    :cond_33
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1192
    .line 1193
    .line 1194
    move-result v11

    .line 1195
    goto :goto_12

    .line 1196
    :cond_34
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1197
    .line 1198
    .line 1199
    new-instance v10, Lcom/google/android/gms/common/internal/zav;

    .line 1200
    .line 1201
    invoke-direct/range {v10 .. v15}, Lcom/google/android/gms/common/internal/zav;-><init>(ILandroid/os/IBinder;Lcom/google/android/gms/common/ConnectionResult;ZZ)V

    .line 1202
    .line 1203
    .line 1204
    return-object v10

    .line 1205
    :pswitch_3f
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1206
    .line 1207
    .line 1208
    move-result v0

    .line 1209
    move v2, v8

    .line 1210
    move-object v3, v9

    .line 1211
    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1212
    .line 1213
    .line 1214
    move-result v10

    .line 1215
    if-ge v10, v0, :cond_39

    .line 1216
    .line 1217
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1218
    .line 1219
    .line 1220
    move-result v10

    .line 1221
    int-to-char v11, v10

    .line 1222
    if-eq v11, v7, :cond_38

    .line 1223
    .line 1224
    if-eq v11, v6, :cond_37

    .line 1225
    .line 1226
    if-eq v11, v5, :cond_36

    .line 1227
    .line 1228
    if-eq v11, v4, :cond_35

    .line 1229
    .line 1230
    invoke-static {v10, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1231
    .line 1232
    .line 1233
    goto :goto_13

    .line 1234
    :cond_35
    sget-object v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1235
    .line 1236
    invoke-static {v1, v10, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v3

    .line 1240
    check-cast v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 1241
    .line 1242
    goto :goto_13

    .line 1243
    :cond_36
    invoke-static {v10, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1244
    .line 1245
    .line 1246
    move-result v2

    .line 1247
    goto :goto_13

    .line 1248
    :cond_37
    sget-object v9, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1249
    .line 1250
    invoke-static {v1, v10, v9}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v9

    .line 1254
    check-cast v9, Landroid/accounts/Account;

    .line 1255
    .line 1256
    goto :goto_13

    .line 1257
    :cond_38
    invoke-static {v10, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1258
    .line 1259
    .line 1260
    move-result v8

    .line 1261
    goto :goto_13

    .line 1262
    :cond_39
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1263
    .line 1264
    .line 1265
    new-instance v0, Lcom/google/android/gms/common/internal/zat;

    .line 1266
    .line 1267
    invoke-direct {v0, v8, v9, v2, v3}, Lcom/google/android/gms/common/internal/zat;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    .line 1268
    .line 1269
    .line 1270
    return-object v0

    .line 1271
    :pswitch_40
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1272
    .line 1273
    .line 1274
    move-result v0

    .line 1275
    move-object v2, v9

    .line 1276
    move-object v3, v2

    .line 1277
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1278
    .line 1279
    .line 1280
    move-result v4

    .line 1281
    if-ge v4, v0, :cond_3e

    .line 1282
    .line 1283
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1284
    .line 1285
    .line 1286
    move-result v4

    .line 1287
    int-to-char v10, v4

    .line 1288
    if-eq v10, v7, :cond_3d

    .line 1289
    .line 1290
    if-eq v10, v6, :cond_3b

    .line 1291
    .line 1292
    if-eq v10, v5, :cond_3a

    .line 1293
    .line 1294
    invoke-static {v4, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1295
    .line 1296
    .line 1297
    goto :goto_14

    .line 1298
    :cond_3a
    sget-object v3, Lcom/google/android/gms/common/server/response/zan;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1299
    .line 1300
    invoke-static {v1, v4, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v3

    .line 1304
    check-cast v3, Lcom/google/android/gms/common/server/response/zan;

    .line 1305
    .line 1306
    goto :goto_14

    .line 1307
    :cond_3b
    invoke-static {v4, v1}, Lqj3;->H(ILandroid/os/Parcel;)I

    .line 1308
    .line 1309
    .line 1310
    move-result v2

    .line 1311
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1312
    .line 1313
    .line 1314
    move-result v4

    .line 1315
    if-nez v2, :cond_3c

    .line 1316
    .line 1317
    move-object v2, v9

    .line 1318
    goto :goto_14

    .line 1319
    :cond_3c
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v10

    .line 1323
    invoke-virtual {v10, v1, v4, v2}, Landroid/os/Parcel;->appendFrom(Landroid/os/Parcel;II)V

    .line 1324
    .line 1325
    .line 1326
    add-int/2addr v4, v2

    .line 1327
    invoke-virtual {v1, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1328
    .line 1329
    .line 1330
    move-object v2, v10

    .line 1331
    goto :goto_14

    .line 1332
    :cond_3d
    invoke-static {v4, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1333
    .line 1334
    .line 1335
    move-result v8

    .line 1336
    goto :goto_14

    .line 1337
    :cond_3e
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1338
    .line 1339
    .line 1340
    new-instance v0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;

    .line 1341
    .line 1342
    invoke-direct {v0, v8, v2, v3}, Lcom/google/android/gms/common/server/response/SafeParcelResponse;-><init>(ILandroid/os/Parcel;Lcom/google/android/gms/common/server/response/zan;)V

    .line 1343
    .line 1344
    .line 1345
    return-object v0

    .line 1346
    :pswitch_41
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1347
    .line 1348
    .line 1349
    move-result v0

    .line 1350
    move-object v2, v9

    .line 1351
    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1352
    .line 1353
    .line 1354
    move-result v3

    .line 1355
    if-ge v3, v0, :cond_42

    .line 1356
    .line 1357
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1358
    .line 1359
    .line 1360
    move-result v3

    .line 1361
    int-to-char v4, v3

    .line 1362
    if-eq v4, v7, :cond_41

    .line 1363
    .line 1364
    if-eq v4, v6, :cond_40

    .line 1365
    .line 1366
    if-eq v4, v5, :cond_3f

    .line 1367
    .line 1368
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1369
    .line 1370
    .line 1371
    goto :goto_15

    .line 1372
    :cond_3f
    sget-object v2, Lcom/google/android/gms/common/server/response/zam;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1373
    .line 1374
    invoke-static {v1, v3, v2}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v2

    .line 1378
    goto :goto_15

    .line 1379
    :cond_40
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v9

    .line 1383
    goto :goto_15

    .line 1384
    :cond_41
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1385
    .line 1386
    .line 1387
    move-result v8

    .line 1388
    goto :goto_15

    .line 1389
    :cond_42
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1390
    .line 1391
    .line 1392
    new-instance v0, Lcom/google/android/gms/common/server/response/zal;

    .line 1393
    .line 1394
    invoke-direct {v0, v8, v9, v2}, Lcom/google/android/gms/common/server/response/zal;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 1395
    .line 1396
    .line 1397
    return-object v0

    .line 1398
    :pswitch_42
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1399
    .line 1400
    .line 1401
    move-result v0

    .line 1402
    move-object v2, v9

    .line 1403
    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1404
    .line 1405
    .line 1406
    move-result v3

    .line 1407
    if-ge v3, v0, :cond_46

    .line 1408
    .line 1409
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1410
    .line 1411
    .line 1412
    move-result v3

    .line 1413
    int-to-char v4, v3

    .line 1414
    if-eq v4, v7, :cond_45

    .line 1415
    .line 1416
    if-eq v4, v6, :cond_44

    .line 1417
    .line 1418
    if-eq v4, v5, :cond_43

    .line 1419
    .line 1420
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1421
    .line 1422
    .line 1423
    goto :goto_16

    .line 1424
    :cond_43
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v2

    .line 1428
    goto :goto_16

    .line 1429
    :cond_44
    sget-object v4, Lcom/google/android/gms/common/server/response/zal;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1430
    .line 1431
    invoke-static {v1, v3, v4}, Lqj3;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v9

    .line 1435
    goto :goto_16

    .line 1436
    :cond_45
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1437
    .line 1438
    .line 1439
    move-result v8

    .line 1440
    goto :goto_16

    .line 1441
    :cond_46
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1442
    .line 1443
    .line 1444
    new-instance v0, Lcom/google/android/gms/common/server/response/zan;

    .line 1445
    .line 1446
    invoke-direct {v0, v8, v2, v9}, Lcom/google/android/gms/common/server/response/zan;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 1447
    .line 1448
    .line 1449
    return-object v0

    .line 1450
    :pswitch_43
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1451
    .line 1452
    .line 1453
    move-result v0

    .line 1454
    const/4 v2, -0x1

    .line 1455
    const-wide/16 v3, 0x0

    .line 1456
    .line 1457
    move/from16 v21, v2

    .line 1458
    .line 1459
    move-wide v14, v3

    .line 1460
    move-wide/from16 v16, v14

    .line 1461
    .line 1462
    move v11, v8

    .line 1463
    move v12, v11

    .line 1464
    move v13, v12

    .line 1465
    move/from16 v20, v13

    .line 1466
    .line 1467
    move-object/from16 v18, v9

    .line 1468
    .line 1469
    move-object/from16 v19, v18

    .line 1470
    .line 1471
    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1472
    .line 1473
    .line 1474
    move-result v2

    .line 1475
    if-ge v2, v0, :cond_47

    .line 1476
    .line 1477
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1478
    .line 1479
    .line 1480
    move-result v2

    .line 1481
    int-to-char v3, v2

    .line 1482
    packed-switch v3, :pswitch_data_7

    .line 1483
    .line 1484
    .line 1485
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1486
    .line 1487
    .line 1488
    goto :goto_17

    .line 1489
    :pswitch_44
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1490
    .line 1491
    .line 1492
    move-result v2

    .line 1493
    move/from16 v21, v2

    .line 1494
    .line 1495
    goto :goto_17

    .line 1496
    :pswitch_45
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1497
    .line 1498
    .line 1499
    move-result v2

    .line 1500
    move/from16 v20, v2

    .line 1501
    .line 1502
    goto :goto_17

    .line 1503
    :pswitch_46
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v2

    .line 1507
    move-object/from16 v19, v2

    .line 1508
    .line 1509
    goto :goto_17

    .line 1510
    :pswitch_47
    invoke-static {v2, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v2

    .line 1514
    move-object/from16 v18, v2

    .line 1515
    .line 1516
    goto :goto_17

    .line 1517
    :pswitch_48
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1518
    .line 1519
    .line 1520
    move-result-wide v2

    .line 1521
    move-wide/from16 v16, v2

    .line 1522
    .line 1523
    goto :goto_17

    .line 1524
    :pswitch_49
    invoke-static {v2, v1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 1525
    .line 1526
    .line 1527
    move-result-wide v2

    .line 1528
    move-wide v14, v2

    .line 1529
    goto :goto_17

    .line 1530
    :pswitch_4a
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1531
    .line 1532
    .line 1533
    move-result v2

    .line 1534
    move v13, v2

    .line 1535
    goto :goto_17

    .line 1536
    :pswitch_4b
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1537
    .line 1538
    .line 1539
    move-result v2

    .line 1540
    move v12, v2

    .line 1541
    goto :goto_17

    .line 1542
    :pswitch_4c
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1543
    .line 1544
    .line 1545
    move-result v2

    .line 1546
    move v11, v2

    .line 1547
    goto :goto_17

    .line 1548
    :cond_47
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1549
    .line 1550
    .line 1551
    new-instance v10, Lcom/google/android/gms/common/internal/MethodInvocation;

    .line 1552
    .line 1553
    invoke-direct/range {v10 .. v21}, Lcom/google/android/gms/common/internal/MethodInvocation;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    .line 1554
    .line 1555
    .line 1556
    return-object v10

    .line 1557
    :pswitch_4d
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1558
    .line 1559
    .line 1560
    move-result v0

    .line 1561
    move-object v2, v9

    .line 1562
    :goto_18
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1563
    .line 1564
    .line 1565
    move-result v3

    .line 1566
    if-ge v3, v0, :cond_4b

    .line 1567
    .line 1568
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1569
    .line 1570
    .line 1571
    move-result v3

    .line 1572
    int-to-char v4, v3

    .line 1573
    if-eq v4, v7, :cond_4a

    .line 1574
    .line 1575
    if-eq v4, v6, :cond_49

    .line 1576
    .line 1577
    if-eq v4, v5, :cond_48

    .line 1578
    .line 1579
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1580
    .line 1581
    .line 1582
    goto :goto_18

    .line 1583
    :cond_48
    sget-object v2, Lcom/google/android/gms/common/internal/zav;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1584
    .line 1585
    invoke-static {v1, v3, v2}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v2

    .line 1589
    check-cast v2, Lcom/google/android/gms/common/internal/zav;

    .line 1590
    .line 1591
    goto :goto_18

    .line 1592
    :cond_49
    sget-object v4, Lcom/google/android/gms/common/ConnectionResult;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1593
    .line 1594
    invoke-static {v1, v3, v4}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v3

    .line 1598
    move-object v9, v3

    .line 1599
    check-cast v9, Lcom/google/android/gms/common/ConnectionResult;

    .line 1600
    .line 1601
    goto :goto_18

    .line 1602
    :cond_4a
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1603
    .line 1604
    .line 1605
    move-result v8

    .line 1606
    goto :goto_18

    .line 1607
    :cond_4b
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1608
    .line 1609
    .line 1610
    new-instance v0, Lcom/google/android/gms/signin/internal/zak;

    .line 1611
    .line 1612
    invoke-direct {v0, v8, v9, v2}, Lcom/google/android/gms/signin/internal/zak;-><init>(ILcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/common/internal/zav;)V

    .line 1613
    .line 1614
    .line 1615
    return-object v0

    .line 1616
    :pswitch_4e
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1617
    .line 1618
    .line 1619
    move-result v0

    .line 1620
    move-object v2, v9

    .line 1621
    :goto_19
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1622
    .line 1623
    .line 1624
    move-result v3

    .line 1625
    if-ge v3, v0, :cond_4f

    .line 1626
    .line 1627
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1628
    .line 1629
    .line 1630
    move-result v3

    .line 1631
    int-to-char v4, v3

    .line 1632
    if-eq v4, v7, :cond_4e

    .line 1633
    .line 1634
    if-eq v4, v6, :cond_4d

    .line 1635
    .line 1636
    if-eq v4, v5, :cond_4c

    .line 1637
    .line 1638
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1639
    .line 1640
    .line 1641
    goto :goto_19

    .line 1642
    :cond_4c
    sget-object v2, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->CREATOR:Lcc3;

    .line 1643
    .line 1644
    invoke-static {v1, v3, v2}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v2

    .line 1648
    check-cast v2, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    .line 1649
    .line 1650
    goto :goto_19

    .line 1651
    :cond_4d
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v9

    .line 1655
    goto :goto_19

    .line 1656
    :cond_4e
    invoke-static {v3, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1657
    .line 1658
    .line 1659
    move-result v8

    .line 1660
    goto :goto_19

    .line 1661
    :cond_4f
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1662
    .line 1663
    .line 1664
    new-instance v0, Lcom/google/android/gms/common/server/response/zam;

    .line 1665
    .line 1666
    invoke-direct {v0, v2, v9, v8}, Lcom/google/android/gms/common/server/response/zam;-><init>(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/String;I)V

    .line 1667
    .line 1668
    .line 1669
    return-object v0

    .line 1670
    :pswitch_4f
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1671
    .line 1672
    .line 1673
    move-result v0

    .line 1674
    :goto_1a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1675
    .line 1676
    .line 1677
    move-result v2

    .line 1678
    if-ge v2, v0, :cond_52

    .line 1679
    .line 1680
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1681
    .line 1682
    .line 1683
    move-result v2

    .line 1684
    int-to-char v3, v2

    .line 1685
    if-eq v3, v7, :cond_51

    .line 1686
    .line 1687
    if-eq v3, v6, :cond_50

    .line 1688
    .line 1689
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1690
    .line 1691
    .line 1692
    goto :goto_1a

    .line 1693
    :cond_50
    sget-object v3, Lcom/google/android/gms/common/internal/zat;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1694
    .line 1695
    invoke-static {v1, v2, v3}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v2

    .line 1699
    move-object v9, v2

    .line 1700
    check-cast v9, Lcom/google/android/gms/common/internal/zat;

    .line 1701
    .line 1702
    goto :goto_1a

    .line 1703
    :cond_51
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1704
    .line 1705
    .line 1706
    move-result v8

    .line 1707
    goto :goto_1a

    .line 1708
    :cond_52
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1709
    .line 1710
    .line 1711
    new-instance v0, Lcom/google/android/gms/signin/internal/zai;

    .line 1712
    .line 1713
    invoke-direct {v0, v8, v9}, Lcom/google/android/gms/signin/internal/zai;-><init>(ILcom/google/android/gms/common/internal/zat;)V

    .line 1714
    .line 1715
    .line 1716
    return-object v0

    .line 1717
    :pswitch_50
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1718
    .line 1719
    .line 1720
    move-result v0

    .line 1721
    move-object v2, v9

    .line 1722
    :goto_1b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1723
    .line 1724
    .line 1725
    move-result v3

    .line 1726
    if-ge v3, v0, :cond_55

    .line 1727
    .line 1728
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1729
    .line 1730
    .line 1731
    move-result v3

    .line 1732
    int-to-char v4, v3

    .line 1733
    if-eq v4, v7, :cond_54

    .line 1734
    .line 1735
    if-eq v4, v6, :cond_53

    .line 1736
    .line 1737
    invoke-static {v3, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1738
    .line 1739
    .line 1740
    goto :goto_1b

    .line 1741
    :cond_53
    invoke-static {v3, v1}, Lqj3;->j(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1742
    .line 1743
    .line 1744
    move-result-object v2

    .line 1745
    goto :goto_1b

    .line 1746
    :cond_54
    invoke-static {v3, v1}, Lqj3;->l(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v9

    .line 1750
    goto :goto_1b

    .line 1751
    :cond_55
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1752
    .line 1753
    .line 1754
    new-instance v0, Lcom/google/android/gms/signin/internal/zag;

    .line 1755
    .line 1756
    invoke-direct {v0, v2, v9}, Lcom/google/android/gms/signin/internal/zag;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1757
    .line 1758
    .line 1759
    return-object v0

    .line 1760
    :pswitch_51
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1761
    .line 1762
    .line 1763
    move-result v0

    .line 1764
    move v2, v8

    .line 1765
    move v3, v2

    .line 1766
    :goto_1c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1767
    .line 1768
    .line 1769
    move-result v10

    .line 1770
    if-ge v10, v0, :cond_5a

    .line 1771
    .line 1772
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1773
    .line 1774
    .line 1775
    move-result v10

    .line 1776
    int-to-char v11, v10

    .line 1777
    if-eq v11, v7, :cond_59

    .line 1778
    .line 1779
    if-eq v11, v6, :cond_58

    .line 1780
    .line 1781
    if-eq v11, v5, :cond_57

    .line 1782
    .line 1783
    if-eq v11, v4, :cond_56

    .line 1784
    .line 1785
    invoke-static {v10, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1786
    .line 1787
    .line 1788
    goto :goto_1c

    .line 1789
    :cond_56
    invoke-static {v10, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1790
    .line 1791
    .line 1792
    move-result v3

    .line 1793
    goto :goto_1c

    .line 1794
    :cond_57
    invoke-static {v10, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1795
    .line 1796
    .line 1797
    move-result v2

    .line 1798
    goto :goto_1c

    .line 1799
    :cond_58
    sget-object v9, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1800
    .line 1801
    invoke-static {v1, v10, v9}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1802
    .line 1803
    .line 1804
    move-result-object v9

    .line 1805
    check-cast v9, Landroid/net/Uri;

    .line 1806
    .line 1807
    goto :goto_1c

    .line 1808
    :cond_59
    invoke-static {v10, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1809
    .line 1810
    .line 1811
    move-result v8

    .line 1812
    goto :goto_1c

    .line 1813
    :cond_5a
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1814
    .line 1815
    .line 1816
    new-instance v0, Lcom/google/android/gms/common/images/WebImage;

    .line 1817
    .line 1818
    invoke-direct {v0, v8, v9, v2, v3}, Lcom/google/android/gms/common/images/WebImage;-><init>(ILandroid/net/Uri;II)V

    .line 1819
    .line 1820
    .line 1821
    return-object v0

    .line 1822
    :pswitch_52
    invoke-static {v1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 1823
    .line 1824
    .line 1825
    move-result v0

    .line 1826
    move v11, v8

    .line 1827
    move v14, v11

    .line 1828
    move-object v12, v9

    .line 1829
    move-object v13, v12

    .line 1830
    move-object v15, v13

    .line 1831
    :goto_1d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1832
    .line 1833
    .line 1834
    move-result v2

    .line 1835
    if-ge v2, v0, :cond_60

    .line 1836
    .line 1837
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1838
    .line 1839
    .line 1840
    move-result v2

    .line 1841
    int-to-char v9, v2

    .line 1842
    if-eq v9, v7, :cond_5f

    .line 1843
    .line 1844
    if-eq v9, v6, :cond_5e

    .line 1845
    .line 1846
    if-eq v9, v5, :cond_5d

    .line 1847
    .line 1848
    if-eq v9, v4, :cond_5c

    .line 1849
    .line 1850
    if-eq v9, v3, :cond_5b

    .line 1851
    .line 1852
    invoke-static {v2, v1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 1853
    .line 1854
    .line 1855
    goto :goto_1d

    .line 1856
    :cond_5b
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1857
    .line 1858
    .line 1859
    move-result v11

    .line 1860
    goto :goto_1d

    .line 1861
    :cond_5c
    invoke-static {v2, v1}, Lqj3;->f(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v15

    .line 1865
    goto :goto_1d

    .line 1866
    :cond_5d
    invoke-static {v2, v1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 1867
    .line 1868
    .line 1869
    move-result v14

    .line 1870
    goto :goto_1d

    .line 1871
    :cond_5e
    sget-object v9, Landroid/database/CursorWindow;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1872
    .line 1873
    invoke-static {v1, v2, v9}, Lqj3;->m(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1874
    .line 1875
    .line 1876
    move-result-object v2

    .line 1877
    move-object v13, v2

    .line 1878
    check-cast v13, [Landroid/database/CursorWindow;

    .line 1879
    .line 1880
    goto :goto_1d

    .line 1881
    :cond_5f
    invoke-static {v2, v1}, Lqj3;->k(ILandroid/os/Parcel;)[Ljava/lang/String;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v12

    .line 1885
    goto :goto_1d

    .line 1886
    :cond_60
    invoke-static {v0, v1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 1887
    .line 1888
    .line 1889
    new-instance v10, Lcom/google/android/gms/common/data/DataHolder;

    .line 1890
    .line 1891
    invoke-direct/range {v10 .. v15}, Lcom/google/android/gms/common/data/DataHolder;-><init>(I[Ljava/lang/String;[Landroid/database/CursorWindow;ILandroid/os/Bundle;)V

    .line 1892
    .line 1893
    .line 1894
    new-instance v0, Landroid/os/Bundle;

    .line 1895
    .line 1896
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1897
    .line 1898
    .line 1899
    iput-object v0, v10, Lcom/google/android/gms/common/data/DataHolder;->c:Landroid/os/Bundle;

    .line 1900
    .line 1901
    move v0, v8

    .line 1902
    :goto_1e
    iget-object v1, v10, Lcom/google/android/gms/common/data/DataHolder;->b:[Ljava/lang/String;

    .line 1903
    .line 1904
    array-length v2, v1

    .line 1905
    if-ge v0, v2, :cond_61

    .line 1906
    .line 1907
    iget-object v2, v10, Lcom/google/android/gms/common/data/DataHolder;->c:Landroid/os/Bundle;

    .line 1908
    .line 1909
    aget-object v1, v1, v0

    .line 1910
    .line 1911
    invoke-virtual {v2, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 1912
    .line 1913
    .line 1914
    add-int/lit8 v0, v0, 0x1

    .line 1915
    .line 1916
    goto :goto_1e

    .line 1917
    :cond_61
    iget-object v0, v10, Lcom/google/android/gms/common/data/DataHolder;->d:[Landroid/database/CursorWindow;

    .line 1918
    .line 1919
    array-length v1, v0

    .line 1920
    new-array v1, v1, [I

    .line 1921
    .line 1922
    iput-object v1, v10, Lcom/google/android/gms/common/data/DataHolder;->i:[I

    .line 1923
    .line 1924
    move v1, v8

    .line 1925
    :goto_1f
    array-length v2, v0

    .line 1926
    if-ge v8, v2, :cond_62

    .line 1927
    .line 1928
    iget-object v2, v10, Lcom/google/android/gms/common/data/DataHolder;->i:[I

    .line 1929
    .line 1930
    aput v1, v2, v8

    .line 1931
    .line 1932
    aget-object v2, v0, v8

    .line 1933
    .line 1934
    invoke-virtual {v2}, Landroid/database/CursorWindow;->getStartPosition()I

    .line 1935
    .line 1936
    .line 1937
    move-result v2

    .line 1938
    sub-int v2, v1, v2

    .line 1939
    .line 1940
    aget-object v3, v0, v8

    .line 1941
    .line 1942
    invoke-virtual {v3}, Landroid/database/CursorWindow;->getNumRows()I

    .line 1943
    .line 1944
    .line 1945
    move-result v3

    .line 1946
    sub-int/2addr v3, v2

    .line 1947
    add-int/2addr v1, v3

    .line 1948
    add-int/lit8 v8, v8, 0x1

    .line 1949
    .line 1950
    goto :goto_1f

    .line 1951
    :cond_62
    iput v1, v10, Lcom/google/android/gms/common/data/DataHolder;->v:I

    .line 1952
    .line 1953
    return-object v10

    .line 1954
    nop

    .line 1955
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_27
        :pswitch_26
        :pswitch_1e
        :pswitch_17
        :pswitch_16
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch

    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
    .end packed-switch

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
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
    .end packed-switch

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
    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
    .end packed-switch

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
    :pswitch_data_6
    .packed-switch 0x1
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_34
        :pswitch_34
        :pswitch_36
        :pswitch_35
    .end packed-switch

    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
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
    :pswitch_data_7
    .packed-switch 0x1
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lub3;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lcom/google/android/gms/drive/events/ChangeEvent;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lcom/google/android/gms/auth/api/identity/SignInPassword;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lcom/google/android/gms/auth/api/identity/SignInCredential;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lcom/google/android/gms/auth/api/identity/SavePasswordResult;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenResult;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lcom/google/android/gms/auth/api/credentials/IdToken;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lcom/google/android/gms/auth/api/credentials/HintRequest;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lcom/google/android/gms/auth/api/identity/GetPhoneNumberHintIntentRequest;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lcom/google/android/gms/auth/api/credentials/CredentialRequest;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lcom/google/android/gms/auth/api/signin/SignInAccount;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lcom/google/android/gms/auth/api/identity/BeginSignInResult;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lcom/google/android/gms/auth/api/credentials/Credential;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lcom/google/android/gms/common/internal/zax;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lcom/google/android/gms/common/internal/zav;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lcom/google/android/gms/common/internal/zat;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lcom/google/android/gms/common/server/response/SafeParcelResponse;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lcom/google/android/gms/common/server/response/zal;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lcom/google/android/gms/common/server/response/zan;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lcom/google/android/gms/common/internal/MethodInvocation;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lcom/google/android/gms/signin/internal/zak;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lcom/google/android/gms/common/server/response/zam;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lcom/google/android/gms/signin/internal/zai;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lcom/google/android/gms/signin/internal/zag;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lcom/google/android/gms/common/images/WebImage;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lcom/google/android/gms/common/data/DataHolder;

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

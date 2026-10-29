.class public final enum Lrj;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Lqj;

.field public static final enum U:Lrj;

.field public static final enum V:Lrj;

.field public static final enum W:Lrj;

.field public static final enum X:Lrj;

.field public static final enum Y:Lrj;

.field public static final enum Z:Lrj;

.field public static final enum a0:Lrj;

.field public static final enum b:Lrj;

.field public static final enum b0:Lrj;

.field public static final enum c:Lrj;

.field public static final enum c0:Lrj;

.field public static final enum d:Lrj;

.field public static final enum d0:Lrj;

.field public static final enum e:Lrj;

.field public static final enum e0:Lrj;

.field public static final enum f:Lrj;

.field public static final enum f0:Lrj;

.field public static final enum g0:Lrj;

.field public static final enum h0:Lrj;

.field public static final enum i:Lrj;

.field public static final enum i0:Lrj;

.field public static final enum j0:Lrj;

.field public static final enum k0:Lrj;

.field public static final enum l0:Lrj;

.field public static final enum m0:Lrj;

.field public static final enum n0:Lrj;

.field public static final enum o0:Lrj;

.field public static final synthetic p0:[Lrj;

.field public static final enum v:Lrj;

.field public static final enum w:Lrj;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 33

    .line 1
    new-instance v1, Lrj;

    .line 2
    .line 3
    const-string v0, "cmpId"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0xc

    .line 7
    .line 8
    invoke-direct {v1, v0, v2, v3}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    sput-object v1, Lrj;->b:Lrj;

    .line 12
    .line 13
    new-instance v2, Lrj;

    .line 14
    .line 15
    const-string v0, "cmpVersion"

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    invoke-direct {v2, v0, v4, v3}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    sput-object v2, Lrj;->c:Lrj;

    .line 22
    .line 23
    new-instance v0, Lrj;

    .line 24
    .line 25
    const-string v5, "consentLanguage"

    .line 26
    .line 27
    const/4 v6, 0x2

    .line 28
    invoke-direct {v0, v5, v6, v3}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lrj;->d:Lrj;

    .line 32
    .line 33
    new-instance v5, Lrj;

    .line 34
    .line 35
    const-string v7, "consentScreen"

    .line 36
    .line 37
    const/4 v8, 0x3

    .line 38
    const/4 v9, 0x6

    .line 39
    invoke-direct {v5, v7, v8, v9}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 40
    .line 41
    .line 42
    sput-object v5, Lrj;->e:Lrj;

    .line 43
    .line 44
    move-object v7, v5

    .line 45
    new-instance v5, Lrj;

    .line 46
    .line 47
    const-string v10, "created"

    .line 48
    .line 49
    const/4 v11, 0x4

    .line 50
    const/16 v12, 0x24

    .line 51
    .line 52
    invoke-direct {v5, v10, v11, v12}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 53
    .line 54
    .line 55
    sput-object v5, Lrj;->f:Lrj;

    .line 56
    .line 57
    new-instance v10, Lrj;

    .line 58
    .line 59
    const-string v11, "isServiceSpecific"

    .line 60
    .line 61
    const/4 v13, 0x5

    .line 62
    invoke-direct {v10, v11, v13, v4}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 63
    .line 64
    .line 65
    sput-object v10, Lrj;->i:Lrj;

    .line 66
    .line 67
    move-object v11, v7

    .line 68
    new-instance v7, Lrj;

    .line 69
    .line 70
    const-string v13, "lastUpdated"

    .line 71
    .line 72
    invoke-direct {v7, v13, v9, v12}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 73
    .line 74
    .line 75
    sput-object v7, Lrj;->v:Lrj;

    .line 76
    .line 77
    new-instance v12, Lrj;

    .line 78
    .line 79
    const-string v13, "policyVersion"

    .line 80
    .line 81
    const/4 v14, 0x7

    .line 82
    invoke-direct {v12, v13, v14, v9}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 83
    .line 84
    .line 85
    sput-object v12, Lrj;->w:Lrj;

    .line 86
    .line 87
    new-instance v13, Lrj;

    .line 88
    .line 89
    const-string v14, "publisherCountryCode"

    .line 90
    .line 91
    const/16 v15, 0x8

    .line 92
    .line 93
    invoke-direct {v13, v14, v15, v3}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 94
    .line 95
    .line 96
    sput-object v13, Lrj;->U:Lrj;

    .line 97
    .line 98
    move-object v14, v10

    .line 99
    new-instance v10, Lrj;

    .line 100
    .line 101
    const-string v15, "publisherLegitimateInterests"

    .line 102
    .line 103
    const/16 v8, 0x9

    .line 104
    .line 105
    const/16 v6, 0x18

    .line 106
    .line 107
    invoke-direct {v10, v15, v8, v6}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 108
    .line 109
    .line 110
    sput-object v10, Lrj;->V:Lrj;

    .line 111
    .line 112
    move-object v8, v11

    .line 113
    new-instance v11, Lrj;

    .line 114
    .line 115
    const-string v15, "publisherConsents"

    .line 116
    .line 117
    const/16 v9, 0xa

    .line 118
    .line 119
    invoke-direct {v11, v15, v9, v6}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 120
    .line 121
    .line 122
    sput-object v11, Lrj;->W:Lrj;

    .line 123
    .line 124
    move-object v9, v8

    .line 125
    move-object v8, v12

    .line 126
    new-instance v12, Lrj;

    .line 127
    .line 128
    const-string v15, "purposeConsents"

    .line 129
    .line 130
    const/16 v4, 0xb

    .line 131
    .line 132
    invoke-direct {v12, v15, v4, v6}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 133
    .line 134
    .line 135
    sput-object v12, Lrj;->X:Lrj;

    .line 136
    .line 137
    move-object v4, v9

    .line 138
    move-object v9, v13

    .line 139
    new-instance v13, Lrj;

    .line 140
    .line 141
    const-string v15, "purposeLegitimateInterests"

    .line 142
    .line 143
    invoke-direct {v13, v15, v3, v6}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 144
    .line 145
    .line 146
    sput-object v13, Lrj;->Y:Lrj;

    .line 147
    .line 148
    move-object v15, v14

    .line 149
    new-instance v14, Lrj;

    .line 150
    .line 151
    const-string v6, "purposeOneTreatment"

    .line 152
    .line 153
    const/16 v3, 0xd

    .line 154
    .line 155
    move-object/from16 v22, v0

    .line 156
    .line 157
    const/4 v0, 0x1

    .line 158
    invoke-direct {v14, v6, v3, v0}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 159
    .line 160
    .line 161
    sput-object v14, Lrj;->Z:Lrj;

    .line 162
    .line 163
    move-object v6, v15

    .line 164
    new-instance v15, Lrj;

    .line 165
    .line 166
    const-string v3, "specialFeatureOptins"

    .line 167
    .line 168
    const/16 v0, 0xe

    .line 169
    .line 170
    move-object/from16 v23, v1

    .line 171
    .line 172
    const/16 v1, 0xc

    .line 173
    .line 174
    invoke-direct {v15, v3, v0, v1}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 175
    .line 176
    .line 177
    sput-object v15, Lrj;->a0:Lrj;

    .line 178
    .line 179
    new-instance v0, Lrj;

    .line 180
    .line 181
    const-string v3, "useNonStandardStacks"

    .line 182
    .line 183
    const/16 v1, 0xf

    .line 184
    .line 185
    move-object/from16 v24, v2

    .line 186
    .line 187
    const/4 v2, 0x1

    .line 188
    invoke-direct {v0, v3, v1, v2}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 189
    .line 190
    .line 191
    sput-object v0, Lrj;->b0:Lrj;

    .line 192
    .line 193
    new-instance v1, Lrj;

    .line 194
    .line 195
    const-string v2, "vendorListVersion"

    .line 196
    .line 197
    const/16 v3, 0x10

    .line 198
    .line 199
    move-object/from16 v25, v0

    .line 200
    .line 201
    const/16 v0, 0xc

    .line 202
    .line 203
    invoke-direct {v1, v2, v3, v0}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 204
    .line 205
    .line 206
    sput-object v1, Lrj;->c0:Lrj;

    .line 207
    .line 208
    new-instance v0, Lrj;

    .line 209
    .line 210
    const-string v2, "version"

    .line 211
    .line 212
    const/16 v3, 0x11

    .line 213
    .line 214
    move-object/from16 v27, v1

    .line 215
    .line 216
    const/4 v1, 0x6

    .line 217
    invoke-direct {v0, v2, v3, v1}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 218
    .line 219
    .line 220
    sput-object v0, Lrj;->d0:Lrj;

    .line 221
    .line 222
    new-instance v1, Lrj;

    .line 223
    .line 224
    const-string v2, "anyBoolean"

    .line 225
    .line 226
    const/16 v3, 0x12

    .line 227
    .line 228
    move-object/from16 v28, v0

    .line 229
    .line 230
    const/4 v0, 0x1

    .line 231
    invoke-direct {v1, v2, v3, v0}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 232
    .line 233
    .line 234
    sput-object v1, Lrj;->e0:Lrj;

    .line 235
    .line 236
    new-instance v2, Lrj;

    .line 237
    .line 238
    const-string v3, "encodingType"

    .line 239
    .line 240
    move-object/from16 v29, v1

    .line 241
    .line 242
    const/16 v1, 0x13

    .line 243
    .line 244
    invoke-direct {v2, v3, v1, v0}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 245
    .line 246
    .line 247
    sput-object v2, Lrj;->f0:Lrj;

    .line 248
    .line 249
    new-instance v0, Lrj;

    .line 250
    .line 251
    const-string v1, "maxId"

    .line 252
    .line 253
    const/16 v3, 0x14

    .line 254
    .line 255
    move-object/from16 v30, v2

    .line 256
    .line 257
    const/16 v2, 0x10

    .line 258
    .line 259
    invoke-direct {v0, v1, v3, v2}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 260
    .line 261
    .line 262
    sput-object v0, Lrj;->g0:Lrj;

    .line 263
    .line 264
    new-instance v1, Lrj;

    .line 265
    .line 266
    const-string v2, "numCustomPurposes"

    .line 267
    .line 268
    const/16 v3, 0x15

    .line 269
    .line 270
    move-object/from16 v31, v0

    .line 271
    .line 272
    const/4 v0, 0x6

    .line 273
    invoke-direct {v1, v2, v3, v0}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 274
    .line 275
    .line 276
    sput-object v1, Lrj;->h0:Lrj;

    .line 277
    .line 278
    new-instance v0, Lrj;

    .line 279
    .line 280
    const-string v2, "numEntries"

    .line 281
    .line 282
    const/16 v3, 0x16

    .line 283
    .line 284
    move-object/from16 v32, v1

    .line 285
    .line 286
    const/16 v1, 0xc

    .line 287
    .line 288
    invoke-direct {v0, v2, v3, v1}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 289
    .line 290
    .line 291
    sput-object v0, Lrj;->i0:Lrj;

    .line 292
    .line 293
    new-instance v2, Lrj;

    .line 294
    .line 295
    const-string v3, "numRestrictions"

    .line 296
    .line 297
    move-object/from16 v21, v0

    .line 298
    .line 299
    const/16 v0, 0x17

    .line 300
    .line 301
    invoke-direct {v2, v3, v0, v1}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 302
    .line 303
    .line 304
    sput-object v2, Lrj;->j0:Lrj;

    .line 305
    .line 306
    new-instance v0, Lrj;

    .line 307
    .line 308
    const-string v1, "purposeId"

    .line 309
    .line 310
    move-object/from16 v18, v2

    .line 311
    .line 312
    const/16 v2, 0x18

    .line 313
    .line 314
    const/4 v3, 0x6

    .line 315
    invoke-direct {v0, v1, v2, v3}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 316
    .line 317
    .line 318
    sput-object v0, Lrj;->k0:Lrj;

    .line 319
    .line 320
    new-instance v1, Lrj;

    .line 321
    .line 322
    const-string v2, "restrictionType"

    .line 323
    .line 324
    const/16 v3, 0x19

    .line 325
    .line 326
    move-object/from16 v20, v0

    .line 327
    .line 328
    const/4 v0, 0x2

    .line 329
    invoke-direct {v1, v2, v3, v0}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 330
    .line 331
    .line 332
    sput-object v1, Lrj;->l0:Lrj;

    .line 333
    .line 334
    new-instance v0, Lrj;

    .line 335
    .line 336
    const-string v2, "segmentType"

    .line 337
    .line 338
    const/16 v3, 0x1a

    .line 339
    .line 340
    move-object/from16 v17, v1

    .line 341
    .line 342
    const/4 v1, 0x3

    .line 343
    invoke-direct {v0, v2, v3, v1}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 344
    .line 345
    .line 346
    sput-object v0, Lrj;->m0:Lrj;

    .line 347
    .line 348
    new-instance v1, Lrj;

    .line 349
    .line 350
    const-string v2, "singleOrRange"

    .line 351
    .line 352
    const/16 v3, 0x1b

    .line 353
    .line 354
    move-object/from16 v16, v0

    .line 355
    .line 356
    const/4 v0, 0x1

    .line 357
    invoke-direct {v1, v2, v3, v0}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 358
    .line 359
    .line 360
    sput-object v1, Lrj;->n0:Lrj;

    .line 361
    .line 362
    new-instance v0, Lrj;

    .line 363
    .line 364
    const-string v2, "vendorId"

    .line 365
    .line 366
    const/16 v3, 0x1c

    .line 367
    .line 368
    move-object/from16 v19, v1

    .line 369
    .line 370
    const/16 v1, 0x10

    .line 371
    .line 372
    invoke-direct {v0, v2, v3, v1}, Lrj;-><init>(Ljava/lang/String;II)V

    .line 373
    .line 374
    .line 375
    sput-object v0, Lrj;->o0:Lrj;

    .line 376
    .line 377
    move-object/from16 v26, v17

    .line 378
    .line 379
    move-object/from16 v3, v22

    .line 380
    .line 381
    move-object/from16 v1, v23

    .line 382
    .line 383
    move-object/from16 v2, v24

    .line 384
    .line 385
    move-object/from16 v17, v27

    .line 386
    .line 387
    move-object/from16 v22, v32

    .line 388
    .line 389
    move-object/from16 v27, v16

    .line 390
    .line 391
    move-object/from16 v24, v18

    .line 392
    .line 393
    move-object/from16 v23, v21

    .line 394
    .line 395
    move-object/from16 v16, v25

    .line 396
    .line 397
    move-object/from16 v18, v28

    .line 398
    .line 399
    move-object/from16 v21, v31

    .line 400
    .line 401
    move-object/from16 v28, v19

    .line 402
    .line 403
    move-object/from16 v25, v20

    .line 404
    .line 405
    move-object/from16 v19, v29

    .line 406
    .line 407
    move-object/from16 v20, v30

    .line 408
    .line 409
    move-object/from16 v29, v0

    .line 410
    .line 411
    filled-new-array/range {v1 .. v29}, [Lrj;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    sput-object v0, Lrj;->p0:[Lrj;

    .line 416
    .line 417
    new-instance v0, Lle0;

    .line 418
    .line 419
    new-instance v0, Lqj;

    .line 420
    .line 421
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 422
    .line 423
    .line 424
    sput-object v0, Lrj;->Companion:Lqj;

    .line 425
    .line 426
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lrj;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lrj;
    .locals 1

    .line 1
    const-class v0, Lrj;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lrj;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lrj;
    .locals 1

    .line 1
    sget-object v0, Lrj;->p0:[Lrj;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lrj;

    .line 8
    .line 9
    return-object v0
.end method

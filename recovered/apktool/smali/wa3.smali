.class public final synthetic Lwa3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic b:Lwa3;

.field public static final synthetic c:Lwa3;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwa3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lwa3;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lwa3;->b:Lwa3;

    .line 8
    .line 9
    new-instance v0, Lwa3;

    .line 10
    .line 11
    const/16 v1, 0x16

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lwa3;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lwa3;->c:Lwa3;

    .line 17
    .line 18
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lwa3;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    .line 1
    iget p0, p0, Lwa3;->a:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lcom/google/android/gms/location/ActivityTransition;

    .line 10
    .line 11
    check-cast p2, Lcom/google/android/gms/location/ActivityTransition;

    .line 12
    .line 13
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p2}, Lkb1;->n(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget p0, p1, Lcom/google/android/gms/location/ActivityTransition;->a:I

    .line 20
    .line 21
    iget v3, p2, Lcom/google/android/gms/location/ActivityTransition;->a:I

    .line 22
    .line 23
    if-eq p0, v3, :cond_0

    .line 24
    .line 25
    if-lt p0, v3, :cond_3

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget p0, p1, Lcom/google/android/gms/location/ActivityTransition;->b:I

    .line 29
    .line 30
    iget p1, p2, Lcom/google/android/gms/location/ActivityTransition;->b:I

    .line 31
    .line 32
    if-ne p0, p1, :cond_1

    .line 33
    .line 34
    move v0, v1

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    if-ge p0, p1, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    :goto_0
    move v0, v2

    .line 40
    :cond_3
    :goto_1
    return v0

    .line 41
    :pswitch_0
    check-cast p2, Ljava/lang/Long;

    .line 42
    .line 43
    check-cast p1, Ljava/lang/Long;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 46
    .line 47
    .line 48
    move-result-wide p0

    .line 49
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->compare(JJ)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    return p0

    .line 58
    :pswitch_1
    check-cast p1, Ljava/util/Map$Entry;

    .line 59
    .line 60
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, Ljava/lang/String;

    .line 65
    .line 66
    check-cast p2, Ljava/util/Map$Entry;

    .line 67
    .line 68
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    return p0

    .line 79
    :pswitch_2
    invoke-static {p1}, Lpm2;->c(Ljava/lang/Object;)I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    invoke-static {p2}, Lpm2;->c(Ljava/lang/Object;)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-ne p0, v0, :cond_8

    .line 88
    .line 89
    invoke-static {p0}, Len;->y(I)I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    if-eqz p0, :cond_7

    .line 94
    .line 95
    if-eq p0, v2, :cond_6

    .line 96
    .line 97
    const/4 v0, 0x2

    .line 98
    if-eq p0, v0, :cond_5

    .line 99
    .line 100
    const/4 v0, 0x3

    .line 101
    if-ne p0, v0, :cond_4

    .line 102
    .line 103
    check-cast p1, Ljava/lang/Double;

    .line 104
    .line 105
    check-cast p2, Ljava/lang/Double;

    .line 106
    .line 107
    invoke-virtual {p1, p2}, Ljava/lang/Double;->compareTo(Ljava/lang/Double;)I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    goto :goto_2

    .line 112
    :cond_4
    const/4 p0, 0x0

    .line 113
    throw p0

    .line 114
    :cond_5
    check-cast p1, Ljava/lang/Long;

    .line 115
    .line 116
    check-cast p2, Ljava/lang/Long;

    .line 117
    .line 118
    invoke-virtual {p1, p2}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    goto :goto_2

    .line 123
    :cond_6
    check-cast p1, Ljava/lang/String;

    .line 124
    .line 125
    check-cast p2, Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    goto :goto_2

    .line 132
    :cond_7
    check-cast p1, Ljava/lang/Boolean;

    .line 133
    .line 134
    check-cast p2, Ljava/lang/Boolean;

    .line 135
    .line 136
    invoke-virtual {p1, p2}, Ljava/lang/Boolean;->compareTo(Ljava/lang/Boolean;)I

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    goto :goto_2

    .line 141
    :cond_8
    invoke-static {p0, v0}, Len;->b(II)I

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    :goto_2
    return p0

    .line 146
    :pswitch_3
    check-cast p1, Lcom/google/android/gms/common/api/Scope;

    .line 147
    .line 148
    check-cast p2, Lcom/google/android/gms/common/api/Scope;

    .line 149
    .line 150
    iget-object p0, p1, Lcom/google/android/gms/common/api/Scope;->b:Ljava/lang/String;

    .line 151
    .line 152
    iget-object p1, p2, Lcom/google/android/gms/common/api/Scope;->b:Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    return p0

    .line 159
    :pswitch_4
    check-cast p1, Lc43;

    .line 160
    .line 161
    check-cast p2, Lc43;

    .line 162
    .line 163
    iget p0, p1, Lc43;->b:I

    .line 164
    .line 165
    iget p1, p2, Lc43;->b:I

    .line 166
    .line 167
    sub-int/2addr p0, p1

    .line 168
    return p0

    .line 169
    :pswitch_5
    check-cast p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;

    .line 170
    .line 171
    iget p0, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->b:I

    .line 172
    .line 173
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    check-cast p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;

    .line 178
    .line 179
    iget p1, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->b:I

    .line 180
    .line 181
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-static {p0, p1}, Lix;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    return p0

    .line 190
    :pswitch_6
    check-cast p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;

    .line 191
    .line 192
    iget p0, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;->c:I

    .line 193
    .line 194
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    check-cast p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;

    .line 199
    .line 200
    iget p1, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;->c:I

    .line 201
    .line 202
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-static {p0, p1}, Lix;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 207
    .line 208
    .line 209
    move-result p0

    .line 210
    return p0

    .line 211
    :pswitch_7
    check-cast p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;

    .line 212
    .line 213
    iget p0, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->c:I

    .line 214
    .line 215
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    check-cast p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;

    .line 220
    .line 221
    iget p1, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->c:I

    .line 222
    .line 223
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-static {p0, p1}, Lix;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 228
    .line 229
    .line 230
    move-result p0

    .line 231
    return p0

    .line 232
    :pswitch_8
    check-cast p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;

    .line 233
    .line 234
    iget p0, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->c:I

    .line 235
    .line 236
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    check-cast p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;

    .line 241
    .line 242
    iget p1, p2, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->c:I

    .line 243
    .line 244
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    invoke-static {p0, p1}, Lix;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 249
    .line 250
    .line 251
    move-result p0

    .line 252
    return p0

    .line 253
    :pswitch_9
    check-cast p1, Landroid/view/View;

    .line 254
    .line 255
    check-cast p2, Landroid/view/View;

    .line 256
    .line 257
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 258
    .line 259
    .line 260
    move-result p0

    .line 261
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    sub-int/2addr p0, p1

    .line 266
    return p0

    .line 267
    :pswitch_a
    check-cast p1, Ljava/lang/String;

    .line 268
    .line 269
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 270
    .line 271
    .line 272
    move-result p0

    .line 273
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    check-cast p2, Ljava/lang/String;

    .line 278
    .line 279
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 280
    .line 281
    .line 282
    move-result p1

    .line 283
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    invoke-static {p0, p1}, Lix;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 288
    .line 289
    .line 290
    move-result p0

    .line 291
    return p0

    .line 292
    :pswitch_b
    check-cast p1, Lbv1;

    .line 293
    .line 294
    iget-object p0, p1, Lbv1;->b:Ljava/lang/String;

    .line 295
    .line 296
    check-cast p2, Lbv1;

    .line 297
    .line 298
    iget-object p1, p2, Lbv1;->b:Ljava/lang/String;

    .line 299
    .line 300
    invoke-static {p0, p1}, Lix;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 301
    .line 302
    .line 303
    move-result p0

    .line 304
    return p0

    .line 305
    :pswitch_c
    check-cast p1, Lvi;

    .line 306
    .line 307
    iget-object p0, p1, Lvi;->a:Ljava/lang/String;

    .line 308
    .line 309
    check-cast p2, Lvi;

    .line 310
    .line 311
    iget-object p1, p2, Lvi;->a:Ljava/lang/String;

    .line 312
    .line 313
    invoke-static {p0, p1}, Lix;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 314
    .line 315
    .line 316
    move-result p0

    .line 317
    return p0

    .line 318
    :pswitch_d
    check-cast p1, Lbv1;

    .line 319
    .line 320
    iget-object p0, p1, Lbv1;->b:Ljava/lang/String;

    .line 321
    .line 322
    check-cast p2, Lbv1;

    .line 323
    .line 324
    iget-object p1, p2, Lbv1;->b:Ljava/lang/String;

    .line 325
    .line 326
    invoke-static {p0, p1}, Lix;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 327
    .line 328
    .line 329
    move-result p0

    .line 330
    return p0

    .line 331
    :pswitch_e
    check-cast p1, Lqf2;

    .line 332
    .line 333
    check-cast p2, Lqf2;

    .line 334
    .line 335
    iget p0, p1, Lqf2;->b:I

    .line 336
    .line 337
    iget p1, p2, Lqf2;->b:I

    .line 338
    .line 339
    sub-int/2addr p0, p1

    .line 340
    return p0

    .line 341
    :pswitch_f
    if-nez p1, :cond_9

    .line 342
    .line 343
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    new-instance p0, Ljava/lang/ClassCastException;

    .line 347
    .line 348
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 349
    .line 350
    .line 351
    throw p0

    .line 352
    :cond_9
    new-instance p0, Ljava/lang/ClassCastException;

    .line 353
    .line 354
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 355
    .line 356
    .line 357
    throw p0

    .line 358
    :pswitch_10
    check-cast p1, Lgq0;

    .line 359
    .line 360
    check-cast p2, Lgq0;

    .line 361
    .line 362
    iget-object p0, p1, Lgq0;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 363
    .line 364
    if-nez p0, :cond_a

    .line 365
    .line 366
    move v3, v2

    .line 367
    goto :goto_3

    .line 368
    :cond_a
    move v3, v1

    .line 369
    :goto_3
    iget-object v4, p2, Lgq0;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 370
    .line 371
    if-nez v4, :cond_b

    .line 372
    .line 373
    move v4, v2

    .line 374
    goto :goto_4

    .line 375
    :cond_b
    move v4, v1

    .line 376
    :goto_4
    if-eq v3, v4, :cond_c

    .line 377
    .line 378
    if-nez p0, :cond_11

    .line 379
    .line 380
    goto :goto_5

    .line 381
    :cond_c
    iget-boolean p0, p1, Lgq0;->a:Z

    .line 382
    .line 383
    iget-boolean v3, p2, Lgq0;->a:Z

    .line 384
    .line 385
    if-eq p0, v3, :cond_e

    .line 386
    .line 387
    if-eqz p0, :cond_d

    .line 388
    .line 389
    goto :goto_6

    .line 390
    :cond_d
    :goto_5
    move v0, v2

    .line 391
    goto :goto_6

    .line 392
    :cond_e
    iget p0, p2, Lgq0;->b:I

    .line 393
    .line 394
    iget v0, p1, Lgq0;->b:I

    .line 395
    .line 396
    sub-int v0, p0, v0

    .line 397
    .line 398
    if-eqz v0, :cond_f

    .line 399
    .line 400
    goto :goto_6

    .line 401
    :cond_f
    iget p0, p1, Lgq0;->c:I

    .line 402
    .line 403
    iget p1, p2, Lgq0;->c:I

    .line 404
    .line 405
    sub-int v0, p0, p1

    .line 406
    .line 407
    if-eqz v0, :cond_10

    .line 408
    .line 409
    goto :goto_6

    .line 410
    :cond_10
    move v0, v1

    .line 411
    :cond_11
    :goto_6
    return v0

    .line 412
    :pswitch_11
    check-cast p1, Lbv1;

    .line 413
    .line 414
    iget-object p0, p1, Lbv1;->b:Ljava/lang/String;

    .line 415
    .line 416
    check-cast p2, Lbv1;

    .line 417
    .line 418
    iget-object p1, p2, Lbv1;->b:Ljava/lang/String;

    .line 419
    .line 420
    invoke-static {p0, p1}, Lix;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 421
    .line 422
    .line 423
    move-result p0

    .line 424
    return p0

    .line 425
    :pswitch_12
    check-cast p1, Landroid/view/View;

    .line 426
    .line 427
    check-cast p2, Landroid/view/View;

    .line 428
    .line 429
    sget-object p0, Le33;->a:Ljava/util/WeakHashMap;

    .line 430
    .line 431
    invoke-static {p1}, Ls23;->m(Landroid/view/View;)F

    .line 432
    .line 433
    .line 434
    move-result p0

    .line 435
    invoke-static {p2}, Ls23;->m(Landroid/view/View;)F

    .line 436
    .line 437
    .line 438
    move-result p1

    .line 439
    cmpl-float p2, p0, p1

    .line 440
    .line 441
    if-lez p2, :cond_12

    .line 442
    .line 443
    goto :goto_7

    .line 444
    :cond_12
    cmpg-float p0, p0, p1

    .line 445
    .line 446
    if-gez p0, :cond_13

    .line 447
    .line 448
    move v0, v2

    .line 449
    goto :goto_7

    .line 450
    :cond_13
    move v0, v1

    .line 451
    :goto_7
    return v0

    .line 452
    :pswitch_13
    check-cast p1, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;

    .line 453
    .line 454
    iget-wide p0, p1, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;->a:J

    .line 455
    .line 456
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 457
    .line 458
    .line 459
    move-result-object p0

    .line 460
    check-cast p2, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;

    .line 461
    .line 462
    iget-wide p1, p2, Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;->a:J

    .line 463
    .line 464
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    invoke-static {p0, p1}, Lix;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 469
    .line 470
    .line 471
    move-result p0

    .line 472
    return p0

    .line 473
    :pswitch_14
    check-cast p1, Lbv1;

    .line 474
    .line 475
    iget-object p0, p1, Lbv1;->b:Ljava/lang/String;

    .line 476
    .line 477
    check-cast p2, Lbv1;

    .line 478
    .line 479
    iget-object p1, p2, Lbv1;->b:Ljava/lang/String;

    .line 480
    .line 481
    invoke-static {p0, p1}, Lix;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 482
    .line 483
    .line 484
    move-result p0

    .line 485
    return p0

    .line 486
    :pswitch_15
    check-cast p1, [I

    .line 487
    .line 488
    check-cast p2, [I

    .line 489
    .line 490
    aget p0, p1, v1

    .line 491
    .line 492
    aget p1, p2, v1

    .line 493
    .line 494
    sub-int/2addr p0, p1

    .line 495
    return p0

    .line 496
    :pswitch_16
    check-cast p1, Lcom/google/android/gms/common/api/Scope;

    .line 497
    .line 498
    check-cast p2, Lcom/google/android/gms/common/api/Scope;

    .line 499
    .line 500
    iget-object p0, p1, Lcom/google/android/gms/common/api/Scope;->b:Ljava/lang/String;

    .line 501
    .line 502
    iget-object p1, p2, Lcom/google/android/gms/common/api/Scope;->b:Ljava/lang/String;

    .line 503
    .line 504
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 505
    .line 506
    .line 507
    move-result p0

    .line 508
    return p0

    .line 509
    :pswitch_data_0
    .packed-switch 0x0
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

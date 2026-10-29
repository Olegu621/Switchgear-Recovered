.class public abstract La43;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Lf31;

.field public b:Ljava/lang/String;

.field public final c:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La43;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-void
.end method

.method public static c(Ljava/lang/String;)La43;
    .locals 12

    .line 1
    const-string v0, "CUSTOM"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance p0, Lx33;

    .line 11
    .line 12
    invoke-direct {p0}, La43;-><init>()V

    .line 13
    .line 14
    .line 15
    new-array v0, v1, [F

    .line 16
    .line 17
    iput-object v0, p0, Lx33;->d:[F

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/16 v2, 0x9

    .line 25
    .line 26
    const/16 v3, 0x8

    .line 27
    .line 28
    const/4 v4, 0x7

    .line 29
    const/4 v5, 0x6

    .line 30
    const/4 v6, 0x5

    .line 31
    const/4 v7, 0x4

    .line 32
    const/4 v8, 0x3

    .line 33
    const/4 v9, 0x2

    .line 34
    const/4 v10, 0x0

    .line 35
    const/4 v11, -0x1

    .line 36
    sparse-switch v0, :sswitch_data_0

    .line 37
    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :sswitch_0
    const-string v0, "waveOffset"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-nez p0, :cond_1

    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    :cond_1
    const/16 v11, 0xd

    .line 52
    .line 53
    goto/16 :goto_0

    .line 54
    .line 55
    :sswitch_1
    const-string v0, "alpha"

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-nez p0, :cond_2

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_2
    const/16 v11, 0xc

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :sswitch_2
    const-string v0, "transitionPathRotate"

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-nez p0, :cond_3

    .line 76
    .line 77
    goto/16 :goto_0

    .line 78
    .line 79
    :cond_3
    const/16 v11, 0xb

    .line 80
    .line 81
    goto/16 :goto_0

    .line 82
    .line 83
    :sswitch_3
    const-string v0, "elevation"

    .line 84
    .line 85
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-nez p0, :cond_4

    .line 90
    .line 91
    goto/16 :goto_0

    .line 92
    .line 93
    :cond_4
    const/16 v11, 0xa

    .line 94
    .line 95
    goto/16 :goto_0

    .line 96
    .line 97
    :sswitch_4
    const-string v0, "rotation"

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-nez p0, :cond_5

    .line 104
    .line 105
    goto/16 :goto_0

    .line 106
    .line 107
    :cond_5
    move v11, v2

    .line 108
    goto/16 :goto_0

    .line 109
    .line 110
    :sswitch_5
    const-string v0, "waveVariesBy"

    .line 111
    .line 112
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-nez p0, :cond_6

    .line 117
    .line 118
    goto/16 :goto_0

    .line 119
    .line 120
    :cond_6
    move v11, v3

    .line 121
    goto/16 :goto_0

    .line 122
    .line 123
    :sswitch_6
    const-string v0, "scaleY"

    .line 124
    .line 125
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-nez p0, :cond_7

    .line 130
    .line 131
    goto/16 :goto_0

    .line 132
    .line 133
    :cond_7
    move v11, v4

    .line 134
    goto :goto_0

    .line 135
    :sswitch_7
    const-string v0, "scaleX"

    .line 136
    .line 137
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    if-nez p0, :cond_8

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_8
    move v11, v5

    .line 145
    goto :goto_0

    .line 146
    :sswitch_8
    const-string v0, "progress"

    .line 147
    .line 148
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    if-nez p0, :cond_9

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_9
    move v11, v6

    .line 156
    goto :goto_0

    .line 157
    :sswitch_9
    const-string v0, "translationZ"

    .line 158
    .line 159
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    if-nez p0, :cond_a

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_a
    move v11, v7

    .line 167
    goto :goto_0

    .line 168
    :sswitch_a
    const-string v0, "translationY"

    .line 169
    .line 170
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    if-nez p0, :cond_b

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_b
    move v11, v8

    .line 178
    goto :goto_0

    .line 179
    :sswitch_b
    const-string v0, "translationX"

    .line 180
    .line 181
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    if-nez p0, :cond_c

    .line 186
    .line 187
    goto :goto_0

    .line 188
    :cond_c
    move v11, v9

    .line 189
    goto :goto_0

    .line 190
    :sswitch_c
    const-string v0, "rotationY"

    .line 191
    .line 192
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    if-nez p0, :cond_d

    .line 197
    .line 198
    goto :goto_0

    .line 199
    :cond_d
    move v11, v1

    .line 200
    goto :goto_0

    .line 201
    :sswitch_d
    const-string v0, "rotationX"

    .line 202
    .line 203
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result p0

    .line 207
    if-nez p0, :cond_e

    .line 208
    .line 209
    goto :goto_0

    .line 210
    :cond_e
    move v11, v10

    .line 211
    :goto_0
    packed-switch v11, :pswitch_data_0

    .line 212
    .line 213
    .line 214
    const/4 p0, 0x0

    .line 215
    return-object p0

    .line 216
    :pswitch_0
    new-instance p0, Lw33;

    .line 217
    .line 218
    invoke-direct {p0, v10}, Lw33;-><init>(I)V

    .line 219
    .line 220
    .line 221
    return-object p0

    .line 222
    :pswitch_1
    new-instance p0, Lw33;

    .line 223
    .line 224
    invoke-direct {p0, v10}, Lw33;-><init>(I)V

    .line 225
    .line 226
    .line 227
    return-object p0

    .line 228
    :pswitch_2
    new-instance p0, Ly33;

    .line 229
    .line 230
    invoke-direct {p0}, La43;-><init>()V

    .line 231
    .line 232
    .line 233
    return-object p0

    .line 234
    :pswitch_3
    new-instance p0, Lw33;

    .line 235
    .line 236
    invoke-direct {p0, v1}, Lw33;-><init>(I)V

    .line 237
    .line 238
    .line 239
    return-object p0

    .line 240
    :pswitch_4
    new-instance p0, Lw33;

    .line 241
    .line 242
    invoke-direct {p0, v9}, Lw33;-><init>(I)V

    .line 243
    .line 244
    .line 245
    return-object p0

    .line 246
    :pswitch_5
    new-instance p0, Lw33;

    .line 247
    .line 248
    invoke-direct {p0, v10}, Lw33;-><init>(I)V

    .line 249
    .line 250
    .line 251
    return-object p0

    .line 252
    :pswitch_6
    new-instance p0, Lw33;

    .line 253
    .line 254
    invoke-direct {p0, v5}, Lw33;-><init>(I)V

    .line 255
    .line 256
    .line 257
    return-object p0

    .line 258
    :pswitch_7
    new-instance p0, Lw33;

    .line 259
    .line 260
    invoke-direct {p0, v6}, Lw33;-><init>(I)V

    .line 261
    .line 262
    .line 263
    return-object p0

    .line 264
    :pswitch_8
    new-instance p0, Lz33;

    .line 265
    .line 266
    invoke-direct {p0}, La43;-><init>()V

    .line 267
    .line 268
    .line 269
    iput-boolean v10, p0, Lz33;->d:Z

    .line 270
    .line 271
    return-object p0

    .line 272
    :pswitch_9
    new-instance p0, Lw33;

    .line 273
    .line 274
    invoke-direct {p0, v2}, Lw33;-><init>(I)V

    .line 275
    .line 276
    .line 277
    return-object p0

    .line 278
    :pswitch_a
    new-instance p0, Lw33;

    .line 279
    .line 280
    invoke-direct {p0, v3}, Lw33;-><init>(I)V

    .line 281
    .line 282
    .line 283
    return-object p0

    .line 284
    :pswitch_b
    new-instance p0, Lw33;

    .line 285
    .line 286
    invoke-direct {p0, v4}, Lw33;-><init>(I)V

    .line 287
    .line 288
    .line 289
    return-object p0

    .line 290
    :pswitch_c
    new-instance p0, Lw33;

    .line 291
    .line 292
    invoke-direct {p0, v7}, Lw33;-><init>(I)V

    .line 293
    .line 294
    .line 295
    return-object p0

    .line 296
    :pswitch_d
    new-instance p0, Lw33;

    .line 297
    .line 298
    invoke-direct {p0, v8}, Lw33;-><init>(I)V

    .line 299
    .line 300
    .line 301
    return-object p0

    .line 302
    nop

    .line 303
    :sswitch_data_0
    .sparse-switch
        -0x4a771f66 -> :sswitch_d
        -0x4a771f65 -> :sswitch_c
        -0x490b9c39 -> :sswitch_b
        -0x490b9c38 -> :sswitch_a
        -0x490b9c37 -> :sswitch_9
        -0x3bab3dd3 -> :sswitch_8
        -0x3621dfb2 -> :sswitch_7
        -0x3621dfb1 -> :sswitch_6
        -0x2f893320 -> :sswitch_5
        -0x266f082 -> :sswitch_4
        -0x42d1a3 -> :sswitch_3
        0x2382115 -> :sswitch_2
        0x589b15e -> :sswitch_1
        0x94e04ec -> :sswitch_0
    .end sparse-switch

    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    :pswitch_data_0
    .packed-switch 0x0
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


# virtual methods
.method public final a(F)F
    .locals 10

    .line 1
    iget-object p0, p0, La43;->a:Lf31;

    .line 2
    .line 3
    iget-object v0, p0, Lf31;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lpy0;

    .line 6
    .line 7
    iget-object v1, p0, Lf31;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, [D

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    const/4 v3, 0x1

    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    float-to-double v5, p1

    .line 17
    invoke-virtual {v0, v5, v6, v1}, Lpy0;->g0(D[D)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, Lf31;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, [F

    .line 24
    .line 25
    aget v0, v0, v4

    .line 26
    .line 27
    float-to-double v5, v0

    .line 28
    aput-wide v5, v1, v4

    .line 29
    .line 30
    iget-object v0, p0, Lf31;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, [F

    .line 33
    .line 34
    aget v0, v0, v4

    .line 35
    .line 36
    float-to-double v5, v0

    .line 37
    aput-wide v5, v1, v3

    .line 38
    .line 39
    iget-object v0, p0, Lf31;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, [F

    .line 42
    .line 43
    aget v0, v0, v4

    .line 44
    .line 45
    float-to-double v5, v0

    .line 46
    aput-wide v5, v1, v2

    .line 47
    .line 48
    :goto_0
    iget-object v0, p0, Lf31;->g:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, [D

    .line 51
    .line 52
    aget-wide v4, v0, v4

    .line 53
    .line 54
    aget-wide v6, v0, v3

    .line 55
    .line 56
    iget-object v0, p0, Lf31;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lac1;

    .line 59
    .line 60
    float-to-double v8, p1

    .line 61
    invoke-virtual {v0, v8, v9, v6, v7}, Lac1;->z(DD)D

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    iget-object p0, p0, Lf31;->g:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, [D

    .line 68
    .line 69
    aget-wide v2, p0, v2

    .line 70
    .line 71
    mul-double/2addr v0, v2

    .line 72
    add-double/2addr v0, v4

    .line 73
    double-to-float p0, v0

    .line 74
    return p0
.end method

.method public final b(F)F
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v0, v0, La43;->a:Lf31;

    .line 6
    .line 7
    iget-object v2, v0, Lf31;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lac1;

    .line 10
    .line 11
    iget-object v3, v0, Lf31;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lpy0;

    .line 14
    .line 15
    iget-object v4, v0, Lf31;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, [D

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x2

    .line 21
    const-wide/16 v7, 0x0

    .line 22
    .line 23
    const/4 v9, 0x1

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    float-to-double v10, v1

    .line 27
    invoke-virtual {v3, v10, v11, v4}, Lpy0;->k0(D[D)V

    .line 28
    .line 29
    .line 30
    iget-object v3, v0, Lf31;->i:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, Lpy0;

    .line 33
    .line 34
    iget-object v4, v0, Lf31;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v4, [D

    .line 37
    .line 38
    invoke-virtual {v3, v10, v11, v4}, Lpy0;->g0(D[D)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    aput-wide v7, v4, v5

    .line 43
    .line 44
    aput-wide v7, v4, v9

    .line 45
    .line 46
    aput-wide v7, v4, v6

    .line 47
    .line 48
    :goto_0
    float-to-double v3, v1

    .line 49
    iget-object v1, v0, Lf31;->g:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, [D

    .line 52
    .line 53
    aget-wide v10, v1, v9

    .line 54
    .line 55
    invoke-virtual {v2, v3, v4, v10, v11}, Lac1;->z(DD)D

    .line 56
    .line 57
    .line 58
    move-result-wide v10

    .line 59
    iget-object v1, v0, Lf31;->g:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, [D

    .line 62
    .line 63
    aget-wide v12, v1, v9

    .line 64
    .line 65
    iget-object v1, v0, Lf31;->h:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, [D

    .line 68
    .line 69
    aget-wide v14, v1, v9

    .line 70
    .line 71
    invoke-virtual {v2, v3, v4}, Lac1;->s(D)D

    .line 72
    .line 73
    .line 74
    move-result-wide v16

    .line 75
    add-double v16, v16, v12

    .line 76
    .line 77
    cmpg-double v1, v3, v7

    .line 78
    .line 79
    if-gtz v1, :cond_1

    .line 80
    .line 81
    const-wide v3, 0x3ee4f8b588e368f1L    # 1.0E-5

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    .line 88
    .line 89
    cmpl-double v1, v3, v12

    .line 90
    .line 91
    if-ltz v1, :cond_2

    .line 92
    .line 93
    const-wide v3, 0x3feffffde7210be9L    # 0.999999

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    :cond_2
    :goto_1
    iget-object v1, v2, Lac1;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, [D

    .line 101
    .line 102
    invoke-static {v1, v3, v4}, Ljava/util/Arrays;->binarySearch([DD)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-lez v1, :cond_3

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    if-eqz v1, :cond_4

    .line 110
    .line 111
    neg-int v1, v1

    .line 112
    add-int/lit8 v7, v1, -0x1

    .line 113
    .line 114
    iget-object v8, v2, Lac1;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v8, [F

    .line 117
    .line 118
    aget v9, v8, v7

    .line 119
    .line 120
    sub-int/2addr v1, v6

    .line 121
    aget v8, v8, v1

    .line 122
    .line 123
    sub-float/2addr v9, v8

    .line 124
    float-to-double v12, v9

    .line 125
    iget-object v2, v2, Lac1;->c:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v2, [D

    .line 128
    .line 129
    aget-wide v18, v2, v7

    .line 130
    .line 131
    aget-wide v1, v2, v1

    .line 132
    .line 133
    sub-double v18, v18, v1

    .line 134
    .line 135
    div-double v12, v12, v18

    .line 136
    .line 137
    mul-double/2addr v3, v12

    .line 138
    float-to-double v7, v8

    .line 139
    mul-double/2addr v12, v1

    .line 140
    sub-double/2addr v7, v12

    .line 141
    add-double/2addr v7, v3

    .line 142
    :cond_4
    :goto_2
    add-double/2addr v7, v14

    .line 143
    const-wide v1, 0x401921fb54442d18L    # 6.283185307179586

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    mul-double/2addr v7, v1

    .line 149
    mul-double v1, v1, v16

    .line 150
    .line 151
    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    .line 152
    .line 153
    .line 154
    move-result-wide v1

    .line 155
    mul-double/2addr v1, v7

    .line 156
    iget-object v3, v0, Lf31;->h:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v3, [D

    .line 159
    .line 160
    aget-wide v4, v3, v5

    .line 161
    .line 162
    aget-wide v7, v3, v6

    .line 163
    .line 164
    mul-double/2addr v10, v7

    .line 165
    add-double/2addr v10, v4

    .line 166
    iget-object v0, v0, Lf31;->g:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, [D

    .line 169
    .line 170
    aget-wide v3, v0, v6

    .line 171
    .line 172
    mul-double/2addr v1, v3

    .line 173
    add-double/2addr v1, v10

    .line 174
    double-to-float v0, v1

    .line 175
    return v0
.end method

.method public abstract d(Landroid/view/View;F)V
.end method

.method public final e()V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La43;->c:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v3, Lwa3;

    .line 13
    .line 14
    const/4 v4, 0x7

    .line 15
    invoke-direct {v3, v4}, Lwa3;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 19
    .line 20
    .line 21
    new-array v3, v2, [D

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    new-array v5, v4, [I

    .line 25
    .line 26
    const/4 v6, 0x1

    .line 27
    const/4 v7, 0x3

    .line 28
    aput v7, v5, v6

    .line 29
    .line 30
    const/4 v8, 0x0

    .line 31
    aput v2, v5, v8

    .line 32
    .line 33
    sget-object v9, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-static {v9, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    check-cast v5, [[D

    .line 40
    .line 41
    new-instance v10, Lf31;

    .line 42
    .line 43
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    new-instance v11, Lac1;

    .line 47
    .line 48
    const/4 v12, 0x4

    .line 49
    invoke-direct {v11, v12}, Lac1;-><init>(I)V

    .line 50
    .line 51
    .line 52
    new-array v12, v8, [F

    .line 53
    .line 54
    iput-object v12, v11, Lac1;->b:Ljava/lang/Object;

    .line 55
    .line 56
    new-array v12, v8, [D

    .line 57
    .line 58
    iput-object v12, v11, Lac1;->c:Ljava/lang/Object;

    .line 59
    .line 60
    iput-object v11, v10, Lf31;->a:Ljava/lang/Object;

    .line 61
    .line 62
    new-array v11, v2, [F

    .line 63
    .line 64
    iput-object v11, v10, Lf31;->b:Ljava/lang/Object;

    .line 65
    .line 66
    new-array v11, v2, [D

    .line 67
    .line 68
    iput-object v11, v10, Lf31;->f:Ljava/lang/Object;

    .line 69
    .line 70
    new-array v11, v2, [F

    .line 71
    .line 72
    iput-object v11, v10, Lf31;->c:Ljava/lang/Object;

    .line 73
    .line 74
    new-array v11, v2, [F

    .line 75
    .line 76
    iput-object v11, v10, Lf31;->d:Ljava/lang/Object;

    .line 77
    .line 78
    new-array v11, v2, [F

    .line 79
    .line 80
    iput-object v11, v10, Lf31;->e:Ljava/lang/Object;

    .line 81
    .line 82
    new-array v2, v2, [F

    .line 83
    .line 84
    iput-object v10, v0, La43;->a:Lf31;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_9

    .line 95
    .line 96
    iget-object v0, v0, La43;->a:Lf31;

    .line 97
    .line 98
    iget-object v1, v0, Lf31;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, [F

    .line 101
    .line 102
    iget-object v2, v0, Lf31;->a:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v2, Lac1;

    .line 105
    .line 106
    iget-object v10, v0, Lf31;->f:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v10, [D

    .line 109
    .line 110
    array-length v11, v10

    .line 111
    new-array v12, v4, [I

    .line 112
    .line 113
    aput v7, v12, v6

    .line 114
    .line 115
    aput v11, v12, v8

    .line 116
    .line 117
    invoke-static {v9, v12}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    check-cast v7, [[D

    .line 122
    .line 123
    iget-object v9, v0, Lf31;->b:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v9, [F

    .line 126
    .line 127
    array-length v11, v9

    .line 128
    add-int/2addr v11, v4

    .line 129
    new-array v11, v11, [D

    .line 130
    .line 131
    iput-object v11, v0, Lf31;->g:Ljava/lang/Object;

    .line 132
    .line 133
    array-length v11, v9

    .line 134
    add-int/2addr v11, v4

    .line 135
    new-array v11, v11, [D

    .line 136
    .line 137
    iput-object v11, v0, Lf31;->h:Ljava/lang/Object;

    .line 138
    .line 139
    aget-wide v11, v10, v8

    .line 140
    .line 141
    const-wide/16 v13, 0x0

    .line 142
    .line 143
    cmpl-double v11, v11, v13

    .line 144
    .line 145
    if-lez v11, :cond_1

    .line 146
    .line 147
    aget v11, v1, v8

    .line 148
    .line 149
    invoke-virtual {v2, v13, v14, v11}, Lac1;->d(DF)V

    .line 150
    .line 151
    .line 152
    :cond_1
    array-length v11, v10

    .line 153
    sub-int/2addr v11, v6

    .line 154
    aget-wide v15, v10, v11

    .line 155
    .line 156
    move-wide/from16 v17, v13

    .line 157
    .line 158
    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    .line 159
    .line 160
    cmpg-double v12, v15, v13

    .line 161
    .line 162
    if-gez v12, :cond_2

    .line 163
    .line 164
    aget v11, v1, v11

    .line 165
    .line 166
    invoke-virtual {v2, v13, v14, v11}, Lac1;->d(DF)V

    .line 167
    .line 168
    .line 169
    :cond_2
    move v11, v8

    .line 170
    :goto_0
    array-length v12, v7

    .line 171
    if-ge v11, v12, :cond_3

    .line 172
    .line 173
    aget-object v12, v7, v11

    .line 174
    .line 175
    iget-object v13, v0, Lf31;->d:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v13, [F

    .line 178
    .line 179
    aget v13, v13, v11

    .line 180
    .line 181
    float-to-double v13, v13

    .line 182
    aput-wide v13, v12, v8

    .line 183
    .line 184
    iget-object v13, v0, Lf31;->e:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v13, [F

    .line 187
    .line 188
    aget v13, v13, v11

    .line 189
    .line 190
    float-to-double v13, v13

    .line 191
    aput-wide v13, v12, v6

    .line 192
    .line 193
    aget v13, v9, v11

    .line 194
    .line 195
    float-to-double v13, v13

    .line 196
    aput-wide v13, v12, v4

    .line 197
    .line 198
    aget-wide v12, v10, v11

    .line 199
    .line 200
    aget v14, v1, v11

    .line 201
    .line 202
    invoke-virtual {v2, v12, v13, v14}, Lac1;->d(DF)V

    .line 203
    .line 204
    .line 205
    add-int/lit8 v11, v11, 0x1

    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_3
    move v1, v8

    .line 209
    move-wide/from16 v11, v17

    .line 210
    .line 211
    :goto_1
    iget-object v4, v2, Lac1;->b:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v4, [F

    .line 214
    .line 215
    array-length v9, v4

    .line 216
    if-ge v1, v9, :cond_4

    .line 217
    .line 218
    aget v4, v4, v1

    .line 219
    .line 220
    float-to-double v13, v4

    .line 221
    add-double/2addr v11, v13

    .line 222
    add-int/lit8 v1, v1, 0x1

    .line 223
    .line 224
    goto :goto_1

    .line 225
    :cond_4
    move v1, v6

    .line 226
    move-wide/from16 v13, v17

    .line 227
    .line 228
    :goto_2
    iget-object v4, v2, Lac1;->b:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v4, [F

    .line 231
    .line 232
    array-length v9, v4

    .line 233
    const/high16 v15, 0x40000000    # 2.0f

    .line 234
    .line 235
    if-ge v1, v9, :cond_5

    .line 236
    .line 237
    add-int/lit8 v9, v1, -0x1

    .line 238
    .line 239
    aget v16, v4, v9

    .line 240
    .line 241
    aget v4, v4, v1

    .line 242
    .line 243
    add-float v16, v16, v4

    .line 244
    .line 245
    div-float v4, v16, v15

    .line 246
    .line 247
    iget-object v15, v2, Lac1;->c:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v15, [D

    .line 250
    .line 251
    aget-wide v19, v15, v1

    .line 252
    .line 253
    aget-wide v21, v15, v9

    .line 254
    .line 255
    sub-double v19, v19, v21

    .line 256
    .line 257
    move/from16 v16, v8

    .line 258
    .line 259
    float-to-double v8, v4

    .line 260
    mul-double v19, v19, v8

    .line 261
    .line 262
    add-double v13, v19, v13

    .line 263
    .line 264
    add-int/lit8 v1, v1, 0x1

    .line 265
    .line 266
    move/from16 v8, v16

    .line 267
    .line 268
    goto :goto_2

    .line 269
    :cond_5
    move/from16 v16, v8

    .line 270
    .line 271
    move/from16 v1, v16

    .line 272
    .line 273
    :goto_3
    iget-object v4, v2, Lac1;->b:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v4, [F

    .line 276
    .line 277
    array-length v8, v4

    .line 278
    if-ge v1, v8, :cond_6

    .line 279
    .line 280
    aget v8, v4, v1

    .line 281
    .line 282
    float-to-double v8, v8

    .line 283
    div-double v19, v11, v13

    .line 284
    .line 285
    mul-double v8, v8, v19

    .line 286
    .line 287
    double-to-float v8, v8

    .line 288
    aput v8, v4, v1

    .line 289
    .line 290
    add-int/lit8 v1, v1, 0x1

    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_6
    iget-object v1, v2, Lac1;->d:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v1, [D

    .line 296
    .line 297
    aput-wide v17, v1, v16

    .line 298
    .line 299
    move v1, v6

    .line 300
    :goto_4
    iget-object v4, v2, Lac1;->b:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v4, [F

    .line 303
    .line 304
    array-length v8, v4

    .line 305
    if-ge v1, v8, :cond_7

    .line 306
    .line 307
    add-int/lit8 v8, v1, -0x1

    .line 308
    .line 309
    aget v9, v4, v8

    .line 310
    .line 311
    aget v4, v4, v1

    .line 312
    .line 313
    add-float/2addr v9, v4

    .line 314
    div-float/2addr v9, v15

    .line 315
    iget-object v4, v2, Lac1;->c:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v4, [D

    .line 318
    .line 319
    aget-wide v11, v4, v1

    .line 320
    .line 321
    aget-wide v13, v4, v8

    .line 322
    .line 323
    sub-double/2addr v11, v13

    .line 324
    iget-object v4, v2, Lac1;->d:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v4, [D

    .line 327
    .line 328
    aget-wide v13, v4, v8

    .line 329
    .line 330
    float-to-double v8, v9

    .line 331
    mul-double/2addr v11, v8

    .line 332
    add-double/2addr v11, v13

    .line 333
    aput-wide v11, v4, v1

    .line 334
    .line 335
    add-int/lit8 v1, v1, 0x1

    .line 336
    .line 337
    goto :goto_4

    .line 338
    :cond_7
    array-length v1, v10

    .line 339
    if-le v1, v6, :cond_8

    .line 340
    .line 341
    move/from16 v1, v16

    .line 342
    .line 343
    invoke-static {v1, v10, v7}, Lpy0;->V(I[D[[D)Lpy0;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    iput-object v2, v0, Lf31;->i:Ljava/lang/Object;

    .line 348
    .line 349
    goto :goto_5

    .line 350
    :cond_8
    move/from16 v1, v16

    .line 351
    .line 352
    const/4 v2, 0x0

    .line 353
    iput-object v2, v0, Lf31;->i:Ljava/lang/Object;

    .line 354
    .line 355
    :goto_5
    invoke-static {v1, v3, v5}, Lpy0;->V(I[D[[D)Lpy0;

    .line 356
    .line 357
    .line 358
    return-void

    .line 359
    :cond_9
    invoke-static {v1}, Lfm0;->f(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, La43;->b:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Ljava/text/DecimalFormat;

    .line 4
    .line 5
    const-string v2, "##.##"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La43;->c:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    invoke-static {p0}, Lfm0;->f(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    throw p0
.end method

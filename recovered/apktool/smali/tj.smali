.class public final Ltj;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Z

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/firebase/messaging/FirebaseMessaging;Lli2;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltj;->d:Ljava/lang/Object;

    .line 48
    iput-object p2, p0, Ltj;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lki3;Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltj;->d:Ljava/lang/Object;

    .line 46
    invoke-static {p2}, Lkb1;->k(Ljava/lang/String;)V

    iput-object p2, p0, Ltj;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lsj;I)V
    .locals 1

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iget p2, p1, Lsj;->b:I

    .line 8
    .line 9
    const/16 v0, 0x15

    .line 10
    .line 11
    if-lt p2, v0, :cond_0

    .line 12
    .line 13
    and-int/lit8 p2, p2, 0x3

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    if-ne p2, v0, :cond_0

    .line 17
    .line 18
    iput-object p1, p0, Ltj;->a:Ljava/lang/Object;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-static {}, Lyl0;->a()Lyl0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    throw p0

    .line 26
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ltj;->a:Ljava/lang/Object;

    .line 30
    .line 31
    new-instance p1, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Ltj;->c:Ljava/lang/Object;

    .line 37
    .line 38
    const/4 p1, 0x5

    .line 39
    new-array p1, p1, [I

    .line 40
    .line 41
    iput-object p1, p0, Ltj;->d:Ljava/lang/Object;

    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public static a([II)F
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    aget v0, p0, v0

    .line 3
    .line 4
    sub-int/2addr p1, v0

    .line 5
    const/4 v0, 0x3

    .line 6
    aget v0, p0, v0

    .line 7
    .line 8
    sub-int/2addr p1, v0

    .line 9
    int-to-float p1, p1

    .line 10
    const/4 v0, 0x2

    .line 11
    aget p0, p0, v0

    .line 12
    .line 13
    int-to-float p0, p0

    .line 14
    const/high16 v0, 0x40000000    # 2.0f

    .line 15
    .line 16
    div-float/2addr p0, v0

    .line 17
    sub-float/2addr p1, p0

    .line 18
    return p1
.end method

.method public static b([I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    array-length v2, p0

    .line 4
    if-ge v1, v2, :cond_0

    .line 5
    .line 6
    aput v0, p0, v1

    .line 7
    .line 8
    add-int/lit8 v1, v1, 0x1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    return-void
.end method

.method public static d([I)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    const/4 v3, 0x5

    .line 5
    if-ge v1, v3, :cond_1

    .line 6
    .line 7
    aget v3, p0, v1

    .line 8
    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    add-int/2addr v2, v3

    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v1, 0x7

    .line 17
    if-ge v2, v1, :cond_2

    .line 18
    .line 19
    return v0

    .line 20
    :cond_2
    int-to-float v1, v2

    .line 21
    const/high16 v2, 0x40e00000    # 7.0f

    .line 22
    .line 23
    div-float/2addr v1, v2

    .line 24
    const/high16 v2, 0x40000000    # 2.0f

    .line 25
    .line 26
    div-float v2, v1, v2

    .line 27
    .line 28
    aget v3, p0, v0

    .line 29
    .line 30
    int-to-float v3, v3

    .line 31
    sub-float v3, v1, v3

    .line 32
    .line 33
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    cmpg-float v3, v3, v2

    .line 38
    .line 39
    if-gez v3, :cond_3

    .line 40
    .line 41
    const/4 v3, 0x1

    .line 42
    aget v4, p0, v3

    .line 43
    .line 44
    int-to-float v4, v4

    .line 45
    sub-float v4, v1, v4

    .line 46
    .line 47
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    cmpg-float v4, v4, v2

    .line 52
    .line 53
    if-gez v4, :cond_3

    .line 54
    .line 55
    const/high16 v4, 0x40400000    # 3.0f

    .line 56
    .line 57
    mul-float v5, v1, v4

    .line 58
    .line 59
    const/4 v6, 0x2

    .line 60
    aget v6, p0, v6

    .line 61
    .line 62
    int-to-float v6, v6

    .line 63
    sub-float/2addr v5, v6

    .line 64
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    mul-float/2addr v4, v2

    .line 69
    cmpg-float v4, v5, v4

    .line 70
    .line 71
    if-gez v4, :cond_3

    .line 72
    .line 73
    const/4 v4, 0x3

    .line 74
    aget v4, p0, v4

    .line 75
    .line 76
    int-to-float v4, v4

    .line 77
    sub-float v4, v1, v4

    .line 78
    .line 79
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    cmpg-float v4, v4, v2

    .line 84
    .line 85
    if-gez v4, :cond_3

    .line 86
    .line 87
    const/4 v4, 0x4

    .line 88
    aget p0, p0, v4

    .line 89
    .line 90
    int-to-float p0, p0

    .line 91
    sub-float/2addr v1, p0

    .line 92
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    cmpg-float p0, p0, v2

    .line 97
    .line 98
    if-gez p0, :cond_3

    .line 99
    .line 100
    return v3

    .line 101
    :cond_3
    return v0
.end method


# virtual methods
.method public c(III)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Ltj;->b:Z

    .line 2
    .line 3
    iget-object p0, p0, Ltj;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lsj;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p2, p1}, Lsj;->b(II)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2}, Lsj;->b(II)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    :goto_0
    if-eqz p0, :cond_1

    .line 19
    .line 20
    shl-int/lit8 p0, p3, 0x1

    .line 21
    .line 22
    or-int/lit8 p0, p0, 0x1

    .line 23
    .line 24
    return p0

    .line 25
    :cond_1
    shl-int/lit8 p0, p3, 0x1

    .line 26
    .line 27
    return p0
.end method

.method public e(II[I)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-object v2, v0, Ltj;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    aget v4, v1, v3

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    aget v6, v1, v5

    .line 14
    .line 15
    add-int/2addr v4, v6

    .line 16
    const/4 v6, 0x2

    .line 17
    aget v7, v1, v6

    .line 18
    .line 19
    add-int/2addr v4, v7

    .line 20
    const/4 v7, 0x3

    .line 21
    aget v8, v1, v7

    .line 22
    .line 23
    add-int/2addr v4, v8

    .line 24
    const/4 v8, 0x4

    .line 25
    aget v9, v1, v8

    .line 26
    .line 27
    add-int/2addr v4, v9

    .line 28
    move/from16 v9, p2

    .line 29
    .line 30
    invoke-static {v1, v9}, Ltj;->a([II)F

    .line 31
    .line 32
    .line 33
    move-result v9

    .line 34
    float-to-int v9, v9

    .line 35
    aget v10, v1, v6

    .line 36
    .line 37
    iget-object v11, v0, Ltj;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v11, Lsj;

    .line 40
    .line 41
    iget v12, v11, Lsj;->b:I

    .line 42
    .line 43
    iget v13, v11, Lsj;->a:I

    .line 44
    .line 45
    iget-object v0, v0, Ltj;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, [I

    .line 48
    .line 49
    invoke-static {v0}, Ltj;->b([I)V

    .line 50
    .line 51
    .line 52
    move/from16 v14, p1

    .line 53
    .line 54
    :goto_0
    if-ltz v14, :cond_0

    .line 55
    .line 56
    invoke-virtual {v11, v9, v14}, Lsj;->b(II)Z

    .line 57
    .line 58
    .line 59
    move-result v15

    .line 60
    if-eqz v15, :cond_0

    .line 61
    .line 62
    aget v15, v0, v6

    .line 63
    .line 64
    add-int/2addr v15, v5

    .line 65
    aput v15, v0, v6

    .line 66
    .line 67
    add-int/lit8 v14, v14, -0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    const/4 v15, 0x5

    .line 71
    const/high16 v16, 0x7fc00000    # Float.NaN

    .line 72
    .line 73
    if-gez v14, :cond_2

    .line 74
    .line 75
    move/from16 v17, v3

    .line 76
    .line 77
    :cond_1
    :goto_1
    move/from16 v3, v16

    .line 78
    .line 79
    goto/16 :goto_8

    .line 80
    .line 81
    :cond_2
    :goto_2
    if-ltz v14, :cond_3

    .line 82
    .line 83
    invoke-virtual {v11, v9, v14}, Lsj;->b(II)Z

    .line 84
    .line 85
    .line 86
    move-result v17

    .line 87
    if-nez v17, :cond_3

    .line 88
    .line 89
    move/from16 v17, v3

    .line 90
    .line 91
    aget v3, v0, v5

    .line 92
    .line 93
    if-gt v3, v10, :cond_4

    .line 94
    .line 95
    add-int/lit8 v3, v3, 0x1

    .line 96
    .line 97
    aput v3, v0, v5

    .line 98
    .line 99
    add-int/lit8 v14, v14, -0x1

    .line 100
    .line 101
    move/from16 v3, v17

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    move/from16 v17, v3

    .line 105
    .line 106
    :cond_4
    if-ltz v14, :cond_1

    .line 107
    .line 108
    aget v3, v0, v5

    .line 109
    .line 110
    if-le v3, v10, :cond_5

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_5
    :goto_3
    if-ltz v14, :cond_6

    .line 114
    .line 115
    invoke-virtual {v11, v9, v14}, Lsj;->b(II)Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-eqz v3, :cond_6

    .line 120
    .line 121
    aget v3, v0, v17

    .line 122
    .line 123
    if-gt v3, v10, :cond_6

    .line 124
    .line 125
    add-int/lit8 v3, v3, 0x1

    .line 126
    .line 127
    aput v3, v0, v17

    .line 128
    .line 129
    add-int/lit8 v14, v14, -0x1

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    aget v3, v0, v17

    .line 133
    .line 134
    if-le v3, v10, :cond_7

    .line 135
    .line 136
    :goto_4
    goto :goto_1

    .line 137
    :cond_7
    add-int/lit8 v3, p1, 0x1

    .line 138
    .line 139
    :goto_5
    if-ge v3, v12, :cond_8

    .line 140
    .line 141
    invoke-virtual {v11, v9, v3}, Lsj;->b(II)Z

    .line 142
    .line 143
    .line 144
    move-result v14

    .line 145
    if-eqz v14, :cond_8

    .line 146
    .line 147
    aget v14, v0, v6

    .line 148
    .line 149
    add-int/2addr v14, v5

    .line 150
    aput v14, v0, v6

    .line 151
    .line 152
    add-int/lit8 v3, v3, 0x1

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_8
    if-ne v3, v12, :cond_9

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_9
    :goto_6
    if-ge v3, v12, :cond_a

    .line 159
    .line 160
    invoke-virtual {v11, v9, v3}, Lsj;->b(II)Z

    .line 161
    .line 162
    .line 163
    move-result v14

    .line 164
    if-nez v14, :cond_a

    .line 165
    .line 166
    aget v14, v0, v7

    .line 167
    .line 168
    if-ge v14, v10, :cond_a

    .line 169
    .line 170
    add-int/lit8 v14, v14, 0x1

    .line 171
    .line 172
    aput v14, v0, v7

    .line 173
    .line 174
    add-int/lit8 v3, v3, 0x1

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_a
    if-eq v3, v12, :cond_1

    .line 178
    .line 179
    aget v14, v0, v7

    .line 180
    .line 181
    if-lt v14, v10, :cond_b

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_b
    :goto_7
    if-ge v3, v12, :cond_c

    .line 185
    .line 186
    invoke-virtual {v11, v9, v3}, Lsj;->b(II)Z

    .line 187
    .line 188
    .line 189
    move-result v14

    .line 190
    if-eqz v14, :cond_c

    .line 191
    .line 192
    aget v14, v0, v8

    .line 193
    .line 194
    if-ge v14, v10, :cond_c

    .line 195
    .line 196
    add-int/lit8 v14, v14, 0x1

    .line 197
    .line 198
    aput v14, v0, v8

    .line 199
    .line 200
    add-int/lit8 v3, v3, 0x1

    .line 201
    .line 202
    goto :goto_7

    .line 203
    :cond_c
    aget v12, v0, v8

    .line 204
    .line 205
    if-lt v12, v10, :cond_d

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_d
    aget v10, v0, v17

    .line 209
    .line 210
    aget v14, v0, v5

    .line 211
    .line 212
    add-int/2addr v10, v14

    .line 213
    aget v14, v0, v6

    .line 214
    .line 215
    add-int/2addr v10, v14

    .line 216
    aget v14, v0, v7

    .line 217
    .line 218
    add-int/2addr v10, v14

    .line 219
    add-int/2addr v10, v12

    .line 220
    sub-int/2addr v10, v4

    .line 221
    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    mul-int/2addr v10, v15

    .line 226
    mul-int/lit8 v12, v4, 0x2

    .line 227
    .line 228
    if-lt v10, v12, :cond_e

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_e
    invoke-static {v0}, Ltj;->d([I)Z

    .line 232
    .line 233
    .line 234
    move-result v10

    .line 235
    if-eqz v10, :cond_1

    .line 236
    .line 237
    invoke-static {v0, v3}, Ltj;->a([II)F

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    :goto_8
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    if-nez v10, :cond_2f

    .line 246
    .line 247
    float-to-int v10, v3

    .line 248
    aget v1, v1, v6

    .line 249
    .line 250
    invoke-static {v0}, Ltj;->b([I)V

    .line 251
    .line 252
    .line 253
    move v12, v9

    .line 254
    :goto_9
    if-ltz v12, :cond_f

    .line 255
    .line 256
    invoke-virtual {v11, v12, v10}, Lsj;->b(II)Z

    .line 257
    .line 258
    .line 259
    move-result v14

    .line 260
    if-eqz v14, :cond_f

    .line 261
    .line 262
    aget v14, v0, v6

    .line 263
    .line 264
    add-int/2addr v14, v5

    .line 265
    aput v14, v0, v6

    .line 266
    .line 267
    add-int/lit8 v12, v12, -0x1

    .line 268
    .line 269
    goto :goto_9

    .line 270
    :cond_f
    if-gez v12, :cond_11

    .line 271
    .line 272
    :cond_10
    :goto_a
    move/from16 v1, v16

    .line 273
    .line 274
    goto/16 :goto_10

    .line 275
    .line 276
    :cond_11
    :goto_b
    if-ltz v12, :cond_12

    .line 277
    .line 278
    invoke-virtual {v11, v12, v10}, Lsj;->b(II)Z

    .line 279
    .line 280
    .line 281
    move-result v14

    .line 282
    if-nez v14, :cond_12

    .line 283
    .line 284
    aget v14, v0, v5

    .line 285
    .line 286
    if-gt v14, v1, :cond_12

    .line 287
    .line 288
    add-int/lit8 v14, v14, 0x1

    .line 289
    .line 290
    aput v14, v0, v5

    .line 291
    .line 292
    add-int/lit8 v12, v12, -0x1

    .line 293
    .line 294
    goto :goto_b

    .line 295
    :cond_12
    if-ltz v12, :cond_10

    .line 296
    .line 297
    aget v14, v0, v5

    .line 298
    .line 299
    if-le v14, v1, :cond_13

    .line 300
    .line 301
    goto :goto_a

    .line 302
    :cond_13
    :goto_c
    if-ltz v12, :cond_14

    .line 303
    .line 304
    invoke-virtual {v11, v12, v10}, Lsj;->b(II)Z

    .line 305
    .line 306
    .line 307
    move-result v14

    .line 308
    if-eqz v14, :cond_14

    .line 309
    .line 310
    aget v14, v0, v17

    .line 311
    .line 312
    if-gt v14, v1, :cond_14

    .line 313
    .line 314
    add-int/lit8 v14, v14, 0x1

    .line 315
    .line 316
    aput v14, v0, v17

    .line 317
    .line 318
    add-int/lit8 v12, v12, -0x1

    .line 319
    .line 320
    goto :goto_c

    .line 321
    :cond_14
    aget v12, v0, v17

    .line 322
    .line 323
    if-le v12, v1, :cond_15

    .line 324
    .line 325
    goto :goto_a

    .line 326
    :cond_15
    add-int/2addr v9, v5

    .line 327
    :goto_d
    if-ge v9, v13, :cond_16

    .line 328
    .line 329
    invoke-virtual {v11, v9, v10}, Lsj;->b(II)Z

    .line 330
    .line 331
    .line 332
    move-result v12

    .line 333
    if-eqz v12, :cond_16

    .line 334
    .line 335
    aget v12, v0, v6

    .line 336
    .line 337
    add-int/2addr v12, v5

    .line 338
    aput v12, v0, v6

    .line 339
    .line 340
    add-int/lit8 v9, v9, 0x1

    .line 341
    .line 342
    goto :goto_d

    .line 343
    :cond_16
    if-ne v9, v13, :cond_17

    .line 344
    .line 345
    goto :goto_a

    .line 346
    :cond_17
    :goto_e
    if-ge v9, v13, :cond_18

    .line 347
    .line 348
    invoke-virtual {v11, v9, v10}, Lsj;->b(II)Z

    .line 349
    .line 350
    .line 351
    move-result v12

    .line 352
    if-nez v12, :cond_18

    .line 353
    .line 354
    aget v12, v0, v7

    .line 355
    .line 356
    if-ge v12, v1, :cond_18

    .line 357
    .line 358
    add-int/lit8 v12, v12, 0x1

    .line 359
    .line 360
    aput v12, v0, v7

    .line 361
    .line 362
    add-int/lit8 v9, v9, 0x1

    .line 363
    .line 364
    goto :goto_e

    .line 365
    :cond_18
    if-eq v9, v13, :cond_10

    .line 366
    .line 367
    aget v12, v0, v7

    .line 368
    .line 369
    if-lt v12, v1, :cond_19

    .line 370
    .line 371
    goto :goto_a

    .line 372
    :cond_19
    :goto_f
    if-ge v9, v13, :cond_1a

    .line 373
    .line 374
    invoke-virtual {v11, v9, v10}, Lsj;->b(II)Z

    .line 375
    .line 376
    .line 377
    move-result v12

    .line 378
    if-eqz v12, :cond_1a

    .line 379
    .line 380
    aget v12, v0, v8

    .line 381
    .line 382
    if-ge v12, v1, :cond_1a

    .line 383
    .line 384
    add-int/lit8 v12, v12, 0x1

    .line 385
    .line 386
    aput v12, v0, v8

    .line 387
    .line 388
    add-int/lit8 v9, v9, 0x1

    .line 389
    .line 390
    goto :goto_f

    .line 391
    :cond_1a
    aget v12, v0, v8

    .line 392
    .line 393
    if-lt v12, v1, :cond_1b

    .line 394
    .line 395
    goto :goto_a

    .line 396
    :cond_1b
    aget v1, v0, v17

    .line 397
    .line 398
    aget v14, v0, v5

    .line 399
    .line 400
    add-int/2addr v1, v14

    .line 401
    aget v14, v0, v6

    .line 402
    .line 403
    add-int/2addr v1, v14

    .line 404
    aget v14, v0, v7

    .line 405
    .line 406
    add-int/2addr v1, v14

    .line 407
    add-int/2addr v1, v12

    .line 408
    sub-int/2addr v1, v4

    .line 409
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    mul-int/2addr v1, v15

    .line 414
    if-lt v1, v4, :cond_1c

    .line 415
    .line 416
    goto/16 :goto_a

    .line 417
    .line 418
    :cond_1c
    invoke-static {v0}, Ltj;->d([I)Z

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    if-eqz v1, :cond_10

    .line 423
    .line 424
    invoke-static {v0, v9}, Ltj;->a([II)F

    .line 425
    .line 426
    .line 427
    move-result v16

    .line 428
    goto/16 :goto_a

    .line 429
    .line 430
    :goto_10
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 431
    .line 432
    .line 433
    move-result v9

    .line 434
    if-nez v9, :cond_2f

    .line 435
    .line 436
    float-to-int v9, v1

    .line 437
    invoke-static {v0}, Ltj;->b([I)V

    .line 438
    .line 439
    .line 440
    move/from16 v12, v17

    .line 441
    .line 442
    :goto_11
    if-lt v10, v12, :cond_1d

    .line 443
    .line 444
    if-lt v9, v12, :cond_1d

    .line 445
    .line 446
    sub-int v14, v9, v12

    .line 447
    .line 448
    move/from16 v16, v6

    .line 449
    .line 450
    sub-int v6, v10, v12

    .line 451
    .line 452
    invoke-virtual {v11, v14, v6}, Lsj;->b(II)Z

    .line 453
    .line 454
    .line 455
    move-result v6

    .line 456
    if-eqz v6, :cond_1e

    .line 457
    .line 458
    aget v6, v0, v16

    .line 459
    .line 460
    add-int/2addr v6, v5

    .line 461
    aput v6, v0, v16

    .line 462
    .line 463
    add-int/lit8 v12, v12, 0x1

    .line 464
    .line 465
    move/from16 v6, v16

    .line 466
    .line 467
    goto :goto_11

    .line 468
    :cond_1d
    move/from16 v16, v6

    .line 469
    .line 470
    :cond_1e
    aget v6, v0, v16

    .line 471
    .line 472
    if-nez v6, :cond_1f

    .line 473
    .line 474
    goto/16 :goto_19

    .line 475
    .line 476
    :cond_1f
    :goto_12
    if-lt v10, v12, :cond_20

    .line 477
    .line 478
    if-lt v9, v12, :cond_20

    .line 479
    .line 480
    sub-int v6, v9, v12

    .line 481
    .line 482
    sub-int v14, v10, v12

    .line 483
    .line 484
    invoke-virtual {v11, v6, v14}, Lsj;->b(II)Z

    .line 485
    .line 486
    .line 487
    move-result v6

    .line 488
    if-nez v6, :cond_20

    .line 489
    .line 490
    aget v6, v0, v5

    .line 491
    .line 492
    add-int/2addr v6, v5

    .line 493
    aput v6, v0, v5

    .line 494
    .line 495
    add-int/lit8 v12, v12, 0x1

    .line 496
    .line 497
    goto :goto_12

    .line 498
    :cond_20
    aget v6, v0, v5

    .line 499
    .line 500
    if-nez v6, :cond_21

    .line 501
    .line 502
    goto/16 :goto_19

    .line 503
    .line 504
    :cond_21
    :goto_13
    if-lt v10, v12, :cond_22

    .line 505
    .line 506
    if-lt v9, v12, :cond_22

    .line 507
    .line 508
    sub-int v6, v9, v12

    .line 509
    .line 510
    sub-int v14, v10, v12

    .line 511
    .line 512
    invoke-virtual {v11, v6, v14}, Lsj;->b(II)Z

    .line 513
    .line 514
    .line 515
    move-result v6

    .line 516
    if-eqz v6, :cond_22

    .line 517
    .line 518
    aget v6, v0, v17

    .line 519
    .line 520
    add-int/2addr v6, v5

    .line 521
    aput v6, v0, v17

    .line 522
    .line 523
    add-int/lit8 v12, v12, 0x1

    .line 524
    .line 525
    goto :goto_13

    .line 526
    :cond_22
    aget v6, v0, v17

    .line 527
    .line 528
    if-nez v6, :cond_23

    .line 529
    .line 530
    goto/16 :goto_19

    .line 531
    .line 532
    :cond_23
    iget v6, v11, Lsj;->b:I

    .line 533
    .line 534
    move v12, v5

    .line 535
    :goto_14
    add-int v14, v10, v12

    .line 536
    .line 537
    move/from16 v18, v7

    .line 538
    .line 539
    if-ge v14, v6, :cond_24

    .line 540
    .line 541
    add-int v7, v9, v12

    .line 542
    .line 543
    if-ge v7, v13, :cond_24

    .line 544
    .line 545
    invoke-virtual {v11, v7, v14}, Lsj;->b(II)Z

    .line 546
    .line 547
    .line 548
    move-result v7

    .line 549
    if-eqz v7, :cond_24

    .line 550
    .line 551
    aget v7, v0, v16

    .line 552
    .line 553
    add-int/2addr v7, v5

    .line 554
    aput v7, v0, v16

    .line 555
    .line 556
    add-int/lit8 v12, v12, 0x1

    .line 557
    .line 558
    move/from16 v7, v18

    .line 559
    .line 560
    goto :goto_14

    .line 561
    :cond_24
    :goto_15
    add-int v7, v10, v12

    .line 562
    .line 563
    if-ge v7, v6, :cond_25

    .line 564
    .line 565
    add-int v14, v9, v12

    .line 566
    .line 567
    if-ge v14, v13, :cond_25

    .line 568
    .line 569
    invoke-virtual {v11, v14, v7}, Lsj;->b(II)Z

    .line 570
    .line 571
    .line 572
    move-result v7

    .line 573
    if-nez v7, :cond_25

    .line 574
    .line 575
    aget v7, v0, v18

    .line 576
    .line 577
    add-int/2addr v7, v5

    .line 578
    aput v7, v0, v18

    .line 579
    .line 580
    add-int/lit8 v12, v12, 0x1

    .line 581
    .line 582
    goto :goto_15

    .line 583
    :cond_25
    aget v7, v0, v18

    .line 584
    .line 585
    if-nez v7, :cond_26

    .line 586
    .line 587
    goto/16 :goto_19

    .line 588
    .line 589
    :cond_26
    :goto_16
    add-int v7, v10, v12

    .line 590
    .line 591
    if-ge v7, v6, :cond_27

    .line 592
    .line 593
    add-int v14, v9, v12

    .line 594
    .line 595
    if-ge v14, v13, :cond_27

    .line 596
    .line 597
    invoke-virtual {v11, v14, v7}, Lsj;->b(II)Z

    .line 598
    .line 599
    .line 600
    move-result v7

    .line 601
    if-eqz v7, :cond_27

    .line 602
    .line 603
    aget v7, v0, v8

    .line 604
    .line 605
    add-int/2addr v7, v5

    .line 606
    aput v7, v0, v8

    .line 607
    .line 608
    add-int/lit8 v12, v12, 0x1

    .line 609
    .line 610
    goto :goto_16

    .line 611
    :cond_27
    aget v6, v0, v8

    .line 612
    .line 613
    if-nez v6, :cond_28

    .line 614
    .line 615
    goto/16 :goto_19

    .line 616
    .line 617
    :cond_28
    move/from16 v6, v17

    .line 618
    .line 619
    move v7, v6

    .line 620
    :goto_17
    if-ge v6, v15, :cond_2a

    .line 621
    .line 622
    aget v9, v0, v6

    .line 623
    .line 624
    if-nez v9, :cond_29

    .line 625
    .line 626
    goto/16 :goto_19

    .line 627
    .line 628
    :cond_29
    add-int/2addr v7, v9

    .line 629
    add-int/lit8 v6, v6, 0x1

    .line 630
    .line 631
    goto :goto_17

    .line 632
    :cond_2a
    const/4 v6, 0x7

    .line 633
    if-ge v7, v6, :cond_2b

    .line 634
    .line 635
    goto/16 :goto_19

    .line 636
    .line 637
    :cond_2b
    int-to-float v6, v7

    .line 638
    const/high16 v7, 0x40e00000    # 7.0f

    .line 639
    .line 640
    div-float/2addr v6, v7

    .line 641
    const v9, 0x3faa9fbe    # 1.333f

    .line 642
    .line 643
    .line 644
    div-float v9, v6, v9

    .line 645
    .line 646
    aget v10, v0, v17

    .line 647
    .line 648
    int-to-float v10, v10

    .line 649
    sub-float v10, v6, v10

    .line 650
    .line 651
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 652
    .line 653
    .line 654
    move-result v10

    .line 655
    cmpg-float v10, v10, v9

    .line 656
    .line 657
    if-gez v10, :cond_2f

    .line 658
    .line 659
    aget v10, v0, v5

    .line 660
    .line 661
    int-to-float v10, v10

    .line 662
    sub-float v10, v6, v10

    .line 663
    .line 664
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 665
    .line 666
    .line 667
    move-result v10

    .line 668
    cmpg-float v10, v10, v9

    .line 669
    .line 670
    if-gez v10, :cond_2f

    .line 671
    .line 672
    const/high16 v10, 0x40400000    # 3.0f

    .line 673
    .line 674
    mul-float v11, v6, v10

    .line 675
    .line 676
    aget v12, v0, v16

    .line 677
    .line 678
    int-to-float v12, v12

    .line 679
    sub-float/2addr v11, v12

    .line 680
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 681
    .line 682
    .line 683
    move-result v11

    .line 684
    mul-float/2addr v10, v9

    .line 685
    cmpg-float v10, v11, v10

    .line 686
    .line 687
    if-gez v10, :cond_2f

    .line 688
    .line 689
    aget v10, v0, v18

    .line 690
    .line 691
    int-to-float v10, v10

    .line 692
    sub-float v10, v6, v10

    .line 693
    .line 694
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 695
    .line 696
    .line 697
    move-result v10

    .line 698
    cmpg-float v10, v10, v9

    .line 699
    .line 700
    if-gez v10, :cond_2f

    .line 701
    .line 702
    aget v0, v0, v8

    .line 703
    .line 704
    int-to-float v0, v0

    .line 705
    sub-float/2addr v6, v0

    .line 706
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 707
    .line 708
    .line 709
    move-result v0

    .line 710
    cmpg-float v0, v0, v9

    .line 711
    .line 712
    if-gez v0, :cond_2f

    .line 713
    .line 714
    int-to-float v0, v4

    .line 715
    div-float/2addr v0, v7

    .line 716
    move/from16 v4, v17

    .line 717
    .line 718
    :goto_18
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 719
    .line 720
    .line 721
    move-result v6

    .line 722
    if-ge v4, v6, :cond_2e

    .line 723
    .line 724
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object v6

    .line 728
    check-cast v6, Lni0;

    .line 729
    .line 730
    iget v7, v6, Lni0;->c:F

    .line 731
    .line 732
    iget v8, v6, Ls42;->a:F

    .line 733
    .line 734
    iget v9, v6, Ls42;->b:F

    .line 735
    .line 736
    sub-float v10, v3, v9

    .line 737
    .line 738
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 739
    .line 740
    .line 741
    move-result v10

    .line 742
    cmpg-float v10, v10, v0

    .line 743
    .line 744
    if-gtz v10, :cond_2d

    .line 745
    .line 746
    sub-float v10, v1, v8

    .line 747
    .line 748
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 749
    .line 750
    .line 751
    move-result v10

    .line 752
    cmpg-float v10, v10, v0

    .line 753
    .line 754
    if-gtz v10, :cond_2d

    .line 755
    .line 756
    sub-float v10, v0, v7

    .line 757
    .line 758
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 759
    .line 760
    .line 761
    move-result v10

    .line 762
    const/high16 v11, 0x3f800000    # 1.0f

    .line 763
    .line 764
    cmpg-float v11, v10, v11

    .line 765
    .line 766
    if-lez v11, :cond_2c

    .line 767
    .line 768
    cmpg-float v7, v10, v7

    .line 769
    .line 770
    if-gtz v7, :cond_2d

    .line 771
    .line 772
    :cond_2c
    iget v7, v6, Lni0;->d:I

    .line 773
    .line 774
    add-int/lit8 v10, v7, 0x1

    .line 775
    .line 776
    int-to-float v7, v7

    .line 777
    mul-float/2addr v8, v7

    .line 778
    add-float/2addr v8, v1

    .line 779
    int-to-float v1, v10

    .line 780
    div-float/2addr v8, v1

    .line 781
    mul-float/2addr v9, v7

    .line 782
    add-float/2addr v9, v3

    .line 783
    div-float/2addr v9, v1

    .line 784
    iget v3, v6, Lni0;->c:F

    .line 785
    .line 786
    mul-float/2addr v7, v3

    .line 787
    add-float/2addr v7, v0

    .line 788
    div-float/2addr v7, v1

    .line 789
    new-instance v0, Lni0;

    .line 790
    .line 791
    invoke-direct {v0, v8, v9, v7, v10}, Lni0;-><init>(FFFI)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v2, v4, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    return v5

    .line 798
    :cond_2d
    add-int/lit8 v4, v4, 0x1

    .line 799
    .line 800
    goto :goto_18

    .line 801
    :cond_2e
    new-instance v4, Lni0;

    .line 802
    .line 803
    invoke-direct {v4, v1, v3, v0, v5}, Lni0;-><init>(FFFI)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 807
    .line 808
    .line 809
    return v5

    .line 810
    :cond_2f
    :goto_19
    return v17
.end method

.method public f()Z
    .locals 9

    .line 1
    iget-object p0, p0, Ltj;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v2

    .line 16
    move v5, v3

    .line 17
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    if-eqz v6, :cond_1

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    check-cast v6, Lni0;

    .line 28
    .line 29
    iget v7, v6, Lni0;->d:I

    .line 30
    .line 31
    const/4 v8, 0x2

    .line 32
    if-lt v7, v8, :cond_0

    .line 33
    .line 34
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    iget v6, v6, Lni0;->c:F

    .line 37
    .line 38
    add-float/2addr v5, v6

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v1, 0x3

    .line 41
    if-ge v4, v1, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    int-to-float v0, v0

    .line 45
    div-float v0, v5, v0

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Lni0;

    .line 62
    .line 63
    iget v1, v1, Lni0;->c:F

    .line 64
    .line 65
    sub-float/2addr v1, v0

    .line 66
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    add-float/2addr v3, v1

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    const p0, 0x3d4ccccd    # 0.05f

    .line 73
    .line 74
    .line 75
    mul-float/2addr v5, p0

    .line 76
    cmpg-float p0, v3, v5

    .line 77
    .line 78
    if-gtz p0, :cond_4

    .line 79
    .line 80
    const/4 p0, 0x1

    .line 81
    return p0

    .line 82
    :cond_4
    :goto_2
    return v2
.end method

.method public declared-synchronized g()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Ltj;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Ltj;->i()Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Ltj;->c:Ljava/lang/Object;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    new-instance v0, Ls80;

    .line 17
    .line 18
    const/16 v1, 0xf

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ls80;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Ltj;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lli2;

    .line 26
    .line 27
    check-cast v1, Lxe0;

    .line 28
    .line 29
    iget-object v2, v1, Lxe0;->c:Lfx2;

    .line 30
    .line 31
    invoke-virtual {v1, v2, v0}, Lxe0;->a(Ljava/util/concurrent/Executor;Lye0;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p0, Ltj;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    monitor-exit p0

    .line 41
    return-void

    .line 42
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    throw v0
.end method

.method public declared-synchronized h()Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ltj;->g()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Ltj;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v0, p0, Ltj;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lvi0;

    .line 23
    .line 24
    invoke-virtual {v0}, Lvi0;->a()V

    .line 25
    .line 26
    .line 27
    iget-object v0, v0, Lvi0;->g:Lq51;

    .line 28
    .line 29
    invoke-virtual {v0}, Lq51;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La40;

    .line 34
    .line 35
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    :try_start_1
    iget-boolean v1, v0, La40;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    .line 38
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 39
    move v0, v1

    .line 40
    :goto_0
    monitor-exit p0

    .line 41
    return v0

    .line 42
    :catchall_1
    move-exception v1

    .line 43
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 44
    :try_start_4
    throw v1

    .line 45
    :goto_1
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 46
    throw v0
.end method

.method public i()Ljava/lang/Boolean;
    .locals 5

    .line 1
    const-string v0, "firebase_messaging_auto_init_enabled"

    .line 2
    .line 3
    iget-object p0, p0, Ltj;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lvi0;

    .line 8
    .line 9
    invoke-virtual {p0}, Lvi0;->a()V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lvi0;->a:Landroid/content/Context;

    .line 13
    .line 14
    const-string v1, "com.google.firebase.messaging"

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v3, "auto_init"

    .line 22
    .line 23
    invoke-interface {v1, v3}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const/16 v2, 0x80

    .line 49
    .line 50
    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    iget-object v1, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 73
    .line 74
    .line 75
    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    return-object p0

    .line 77
    :catch_0
    :cond_1
    const/4 p0, 0x0

    .line 78
    return-object p0
.end method

.method public j()Lzl0;
    .locals 6

    .line 1
    iget-object v0, p0, Ltj;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lzl0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    move v1, v0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    const/4 v3, 0x6

    .line 12
    const/16 v4, 0x8

    .line 13
    .line 14
    if-ge v1, v3, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v1, v4, v2}, Ltj;->c(III)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v1, 0x7

    .line 24
    invoke-virtual {p0, v1, v4, v2}, Ltj;->c(III)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {p0, v4, v4, v2}, Ltj;->c(III)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {p0, v4, v1, v2}, Ltj;->c(III)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const/4 v2, 0x5

    .line 37
    :goto_1
    if-ltz v2, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0, v4, v2, v1}, Ltj;->c(III)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    add-int/lit8 v2, v2, -0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    iget-object v2, p0, Ltj;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Lsj;

    .line 49
    .line 50
    iget v2, v2, Lsj;->b:I

    .line 51
    .line 52
    add-int/lit8 v3, v2, -0x7

    .line 53
    .line 54
    add-int/lit8 v5, v2, -0x1

    .line 55
    .line 56
    :goto_2
    if-lt v5, v3, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0, v4, v5, v0}, Ltj;->c(III)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    add-int/lit8 v5, v5, -0x1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    add-int/lit8 v3, v2, -0x8

    .line 66
    .line 67
    :goto_3
    if-ge v3, v2, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0, v3, v4, v0}, Ltj;->c(III)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    invoke-static {v1, v0}, Lzl0;->a(II)Lzl0;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    if-eqz v2, :cond_5

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_5
    xor-int/lit16 v1, v1, 0x5412

    .line 84
    .line 85
    xor-int/lit16 v0, v0, 0x5412

    .line 86
    .line 87
    invoke-static {v1, v0}, Lzl0;->a(II)Lzl0;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    :goto_4
    iput-object v2, p0, Ltj;->d:Ljava/lang/Object;

    .line 92
    .line 93
    if-eqz v2, :cond_6

    .line 94
    .line 95
    return-object v2

    .line 96
    :cond_6
    invoke-static {}, Lyl0;->a()Lyl0;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    throw p0
.end method

.method public k()Lf23;
    .locals 7

    .line 1
    iget-object v0, p0, Ltj;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lf23;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Ltj;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lsj;

    .line 11
    .line 12
    iget v0, v0, Lsj;->b:I

    .line 13
    .line 14
    add-int/lit8 v1, v0, -0x11

    .line 15
    .line 16
    div-int/lit8 v1, v1, 0x4

    .line 17
    .line 18
    const/4 v2, 0x6

    .line 19
    if-gt v1, v2, :cond_1

    .line 20
    .line 21
    invoke-static {v1}, Lf23;->c(I)Lf23;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_1
    add-int/lit8 v1, v0, -0xb

    .line 27
    .line 28
    const/4 v2, 0x5

    .line 29
    const/4 v3, 0x0

    .line 30
    move v4, v2

    .line 31
    move v5, v3

    .line 32
    :goto_0
    if-ltz v4, :cond_3

    .line 33
    .line 34
    add-int/lit8 v6, v0, -0x9

    .line 35
    .line 36
    :goto_1
    if-lt v6, v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0, v6, v4, v5}, Ltj;->c(III)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    add-int/lit8 v6, v6, -0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    add-int/lit8 v4, v4, -0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-static {v5}, Lf23;->b(I)Lf23;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    if-eqz v4, :cond_4

    .line 53
    .line 54
    iget v5, v4, Lf23;->a:I

    .line 55
    .line 56
    mul-int/lit8 v5, v5, 0x4

    .line 57
    .line 58
    add-int/lit8 v5, v5, 0x11

    .line 59
    .line 60
    if-ne v5, v0, :cond_4

    .line 61
    .line 62
    iput-object v4, p0, Ltj;->c:Ljava/lang/Object;

    .line 63
    .line 64
    return-object v4

    .line 65
    :cond_4
    :goto_2
    if-ltz v2, :cond_6

    .line 66
    .line 67
    add-int/lit8 v4, v0, -0x9

    .line 68
    .line 69
    :goto_3
    if-lt v4, v1, :cond_5

    .line 70
    .line 71
    invoke-virtual {p0, v2, v4, v3}, Ltj;->c(III)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    add-int/lit8 v4, v4, -0x1

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_5
    add-int/lit8 v2, v2, -0x1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_6
    invoke-static {v3}, Lf23;->b(I)Lf23;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-eqz v1, :cond_7

    .line 86
    .line 87
    iget v2, v1, Lf23;->a:I

    .line 88
    .line 89
    mul-int/lit8 v2, v2, 0x4

    .line 90
    .line 91
    add-int/lit8 v2, v2, 0x11

    .line 92
    .line 93
    if-ne v2, v0, :cond_7

    .line 94
    .line 95
    iput-object v1, p0, Ltj;->c:Ljava/lang/Object;

    .line 96
    .line 97
    return-object v1

    .line 98
    :cond_7
    invoke-static {}, Lyl0;->a()Lyl0;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    throw p0
.end method

.method public l()V
    .locals 6

    .line 1
    iget-object v0, p0, Ltj;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lzl0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    const/16 v0, 0x8

    .line 9
    .line 10
    invoke-static {v0}, Len;->E(I)[I

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Ltj;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lzl0;

    .line 17
    .line 18
    iget-byte v1, v1, Lzl0;->b:B

    .line 19
    .line 20
    aget v0, v0, v1

    .line 21
    .line 22
    iget-object p0, p0, Ltj;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Lsj;

    .line 25
    .line 26
    iget v1, p0, Lsj;->b:I

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    move v3, v2

    .line 30
    :goto_0
    if-ge v3, v1, :cond_3

    .line 31
    .line 32
    move v4, v2

    .line 33
    :goto_1
    if-ge v4, v1, :cond_2

    .line 34
    .line 35
    invoke-static {v0, v3, v4}, Len;->a(III)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0, v4, v3}, Lsj;->a(II)V

    .line 42
    .line 43
    .line 44
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    :goto_2
    return-void
.end method

.method public m()Ljava/lang/String;
    .locals 3

    .line 1
    iget-boolean v0, p0, Ltj;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Ltj;->b:Z

    .line 7
    .line 8
    iget-object v0, p0, Ltj;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lki3;

    .line 11
    .line 12
    iget-object v1, p0, Ltj;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Ltj;->c:Ljava/lang/Object;

    .line 26
    .line 27
    :cond_0
    iget-object p0, p0, Ltj;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Ljava/lang/String;

    .line 30
    .line 31
    return-object p0
.end method

.method public n(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ltj;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lki3;

    .line 4
    .line 5
    invoke-virtual {v0}, Lki3;->D()Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Ltj;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/lang/String;

    .line 16
    .line 17
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Ltj;->c:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method

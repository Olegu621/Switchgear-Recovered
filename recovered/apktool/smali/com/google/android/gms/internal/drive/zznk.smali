.class final Lcom/google/android/gms/internal/drive/zznk;
.super Lcom/google/android/gms/internal/drive/zznh;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/drive/zznh;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static zza([BIJI)I
    .locals 2

    .line 1
    if-eqz p4, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p4, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-ne p4, v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0, p2, p3}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    .line 10
    .line 11
    .line 12
    move-result p4

    .line 13
    const-wide/16 v0, 0x1

    .line 14
    .line 15
    add-long/2addr p2, v0

    .line 16
    invoke-static {p0, p2, p3}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p1, p4, p0}, Lcom/google/android/gms/internal/drive/zznf;->zzd(III)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 26
    .line 27
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p0

    .line 31
    :cond_1
    invoke-static {p0, p2, p3}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/drive/zznf;->zzs(II)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0

    .line 40
    :cond_2
    invoke-static {p1}, Lcom/google/android/gms/internal/drive/zznf;->zzaz(I)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0
.end method


# virtual methods
.method public final zzb(I[BII)I
    .locals 17

    move-object/from16 v0, p2

    move/from16 v1, p3

    move/from16 v2, p4

    or-int v3, v1, v2

    .line 309
    array-length v4, v0

    sub-int/2addr v4, v2

    or-int/2addr v3, v4

    const/4 v4, 0x0

    if-ltz v3, :cond_12

    int-to-long v5, v1

    int-to-long v1, v2

    sub-long/2addr v1, v5

    long-to-int v1, v1

    const/16 v2, 0x10

    const-wide/16 v7, 0x1

    if-ge v1, v2, :cond_0

    move v2, v4

    goto :goto_1

    :cond_0
    move v2, v4

    move-wide v9, v5

    :goto_0
    if-ge v2, v1, :cond_2

    add-long v11, v9, v7

    .line 310
    invoke-static {v0, v9, v10}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    move-result v3

    if-gez v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move-wide v9, v11

    goto :goto_0

    :cond_2
    move v2, v1

    :goto_1
    sub-int/2addr v1, v2

    int-to-long v2, v2

    add-long/2addr v5, v2

    :goto_2
    move v2, v4

    :goto_3
    if-lez v1, :cond_4

    add-long v2, v5, v7

    .line 311
    invoke-static {v0, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    move-result v5

    if-ltz v5, :cond_3

    add-int/lit8 v1, v1, -0x1

    move-wide v15, v2

    move v2, v5

    move-wide v5, v15

    goto :goto_3

    :cond_3
    move-wide v15, v2

    move v2, v5

    move-wide v5, v15

    :cond_4
    if-nez v1, :cond_5

    return v4

    :cond_5
    add-int/lit8 v3, v1, -0x1

    const/16 v9, -0x20

    const/4 v10, -0x1

    const/16 v11, -0x41

    if-ge v2, v9, :cond_9

    if-nez v3, :cond_6

    return v2

    :cond_6
    add-int/lit8 v1, v1, -0x2

    const/16 v3, -0x3e

    if-lt v2, v3, :cond_8

    add-long v2, v5, v7

    .line 312
    invoke-static {v0, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    move-result v5

    if-le v5, v11, :cond_7

    goto :goto_4

    :cond_7
    move-wide v5, v2

    move-wide/from16 p0, v7

    goto :goto_5

    :cond_8
    :goto_4
    return v10

    :cond_9
    const/16 v12, -0x10

    const-wide/16 v13, 0x2

    if-ge v2, v12, :cond_f

    const/4 v12, 0x2

    if-ge v3, v12, :cond_a

    .line 313
    invoke-static {v0, v2, v5, v6, v3}, Lcom/google/android/gms/internal/drive/zznk;->zza([BIJI)I

    move-result v0

    return v0

    :cond_a
    add-int/lit8 v1, v1, -0x3

    move-wide/from16 p0, v7

    add-long v7, v5, p0

    .line 314
    invoke-static {v0, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    move-result v3

    if-gt v3, v11, :cond_e

    const/16 v12, -0x60

    if-ne v2, v9, :cond_b

    if-lt v3, v12, :cond_e

    :cond_b
    const/16 v9, -0x13

    if-ne v2, v9, :cond_c

    if-ge v3, v12, :cond_e

    :cond_c
    add-long/2addr v5, v13

    .line 315
    invoke-static {v0, v7, v8}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    move-result v2

    if-le v2, v11, :cond_d

    goto :goto_6

    :cond_d
    :goto_5
    move-wide/from16 v7, p0

    goto :goto_2

    :cond_e
    :goto_6
    return v10

    :cond_f
    move-wide/from16 p0, v7

    const/4 v7, 0x3

    if-ge v3, v7, :cond_10

    .line 316
    invoke-static {v0, v2, v5, v6, v3}, Lcom/google/android/gms/internal/drive/zznk;->zza([BIJI)I

    move-result v0

    return v0

    :cond_10
    add-int/lit8 v1, v1, -0x4

    add-long v7, v5, p0

    .line 317
    invoke-static {v0, v5, v6}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    move-result v3

    if-gt v3, v11, :cond_11

    shl-int/lit8 v2, v2, 0x1c

    add-int/lit8 v3, v3, 0x70

    add-int/2addr v3, v2

    shr-int/lit8 v2, v3, 0x1e

    if-nez v2, :cond_11

    add-long/2addr v13, v5

    .line 318
    invoke-static {v0, v7, v8}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    move-result v2

    if-gt v2, v11, :cond_11

    const-wide/16 v2, 0x3

    add-long/2addr v5, v2

    .line 319
    invoke-static {v0, v13, v14}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    move-result v2

    if-le v2, v11, :cond_d

    :cond_11
    return v10

    .line 320
    :cond_12
    array-length v0, v0

    .line 321
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Array length=%d, index=%d, limit=%d"

    invoke-static {v1, v0}, Lio/sentry/u2;->p(Ljava/lang/String;[Ljava/lang/Object;)V

    return v4
.end method

.method public final zzb(Ljava/lang/CharSequence;[BII)I
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    int-to-long v4, v2

    .line 10
    int-to-long v6, v3

    .line 11
    add-long/2addr v6, v4

    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v8

    .line 16
    const/4 v9, 0x0

    .line 17
    if-gt v8, v3, :cond_c

    .line 18
    .line 19
    array-length v10, v1

    .line 20
    sub-int/2addr v10, v3

    .line 21
    if-lt v10, v2, :cond_c

    .line 22
    .line 23
    :goto_0
    const-wide/16 v2, 0x1

    .line 24
    .line 25
    const/16 v10, 0x80

    .line 26
    .line 27
    if-ge v9, v8, :cond_0

    .line 28
    .line 29
    invoke-interface {v0, v9}, Ljava/lang/CharSequence;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result v11

    .line 33
    if-ge v11, v10, :cond_0

    .line 34
    .line 35
    add-long/2addr v2, v4

    .line 36
    int-to-byte v10, v11

    .line 37
    invoke-static {v1, v4, v5, v10}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v9, v9, 0x1

    .line 41
    .line 42
    move-wide v4, v2

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    if-ne v9, v8, :cond_1

    .line 45
    .line 46
    long-to-int v0, v4

    .line 47
    return v0

    .line 48
    :cond_1
    :goto_1
    if-ge v9, v8, :cond_b

    .line 49
    .line 50
    invoke-interface {v0, v9}, Ljava/lang/CharSequence;->charAt(I)C

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    if-ge v11, v10, :cond_2

    .line 55
    .line 56
    cmp-long v12, v4, v6

    .line 57
    .line 58
    if-gez v12, :cond_2

    .line 59
    .line 60
    add-long v12, v4, v2

    .line 61
    .line 62
    int-to-byte v11, v11

    .line 63
    invoke-static {v1, v4, v5, v11}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 64
    .line 65
    .line 66
    move-wide/from16 p3, v2

    .line 67
    .line 68
    move-wide v4, v12

    .line 69
    goto/16 :goto_2

    .line 70
    .line 71
    :cond_2
    const/16 v12, 0x800

    .line 72
    .line 73
    const-wide/16 v13, 0x2

    .line 74
    .line 75
    if-ge v11, v12, :cond_3

    .line 76
    .line 77
    sub-long v15, v6, v13

    .line 78
    .line 79
    cmp-long v12, v4, v15

    .line 80
    .line 81
    if-gtz v12, :cond_3

    .line 82
    .line 83
    move-wide/from16 p3, v2

    .line 84
    .line 85
    add-long v2, v4, p3

    .line 86
    .line 87
    ushr-int/lit8 v12, v11, 0x6

    .line 88
    .line 89
    or-int/lit16 v12, v12, 0x3c0

    .line 90
    .line 91
    int-to-byte v12, v12

    .line 92
    invoke-static {v1, v4, v5, v12}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 93
    .line 94
    .line 95
    add-long/2addr v4, v13

    .line 96
    and-int/lit8 v11, v11, 0x3f

    .line 97
    .line 98
    or-int/2addr v11, v10

    .line 99
    int-to-byte v11, v11

    .line 100
    invoke-static {v1, v2, v3, v11}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 101
    .line 102
    .line 103
    goto/16 :goto_2

    .line 104
    .line 105
    :cond_3
    move-wide/from16 p3, v2

    .line 106
    .line 107
    const v2, 0xdfff

    .line 108
    .line 109
    .line 110
    const v3, 0xd800

    .line 111
    .line 112
    .line 113
    const-wide/16 v15, 0x3

    .line 114
    .line 115
    if-lt v11, v3, :cond_4

    .line 116
    .line 117
    if-ge v2, v11, :cond_5

    .line 118
    .line 119
    :cond_4
    sub-long v17, v6, v15

    .line 120
    .line 121
    cmp-long v12, v4, v17

    .line 122
    .line 123
    if-gtz v12, :cond_5

    .line 124
    .line 125
    add-long v2, v4, p3

    .line 126
    .line 127
    ushr-int/lit8 v12, v11, 0xc

    .line 128
    .line 129
    or-int/lit16 v12, v12, 0x1e0

    .line 130
    .line 131
    int-to-byte v12, v12

    .line 132
    invoke-static {v1, v4, v5, v12}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 133
    .line 134
    .line 135
    add-long/2addr v13, v4

    .line 136
    ushr-int/lit8 v12, v11, 0x6

    .line 137
    .line 138
    and-int/lit8 v12, v12, 0x3f

    .line 139
    .line 140
    or-int/2addr v12, v10

    .line 141
    int-to-byte v12, v12

    .line 142
    invoke-static {v1, v2, v3, v12}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 143
    .line 144
    .line 145
    add-long/2addr v4, v15

    .line 146
    and-int/lit8 v2, v11, 0x3f

    .line 147
    .line 148
    or-int/2addr v2, v10

    .line 149
    int-to-byte v2, v2

    .line 150
    invoke-static {v1, v13, v14, v2}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_5
    const-wide/16 v17, 0x4

    .line 155
    .line 156
    sub-long v19, v6, v17

    .line 157
    .line 158
    cmp-long v12, v4, v19

    .line 159
    .line 160
    if-gtz v12, :cond_8

    .line 161
    .line 162
    add-int/lit8 v2, v9, 0x1

    .line 163
    .line 164
    if-eq v2, v8, :cond_7

    .line 165
    .line 166
    invoke-interface {v0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    invoke-static {v11, v3}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    if-eqz v9, :cond_6

    .line 175
    .line 176
    invoke-static {v11, v3}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    add-long v11, v4, p3

    .line 181
    .line 182
    ushr-int/lit8 v9, v3, 0x12

    .line 183
    .line 184
    or-int/lit16 v9, v9, 0xf0

    .line 185
    .line 186
    int-to-byte v9, v9

    .line 187
    invoke-static {v1, v4, v5, v9}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 188
    .line 189
    .line 190
    add-long/2addr v13, v4

    .line 191
    ushr-int/lit8 v9, v3, 0xc

    .line 192
    .line 193
    and-int/lit8 v9, v9, 0x3f

    .line 194
    .line 195
    or-int/2addr v9, v10

    .line 196
    int-to-byte v9, v9

    .line 197
    invoke-static {v1, v11, v12, v9}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 198
    .line 199
    .line 200
    add-long v11, v4, v15

    .line 201
    .line 202
    ushr-int/lit8 v9, v3, 0x6

    .line 203
    .line 204
    and-int/lit8 v9, v9, 0x3f

    .line 205
    .line 206
    or-int/2addr v9, v10

    .line 207
    int-to-byte v9, v9

    .line 208
    invoke-static {v1, v13, v14, v9}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 209
    .line 210
    .line 211
    add-long v4, v4, v17

    .line 212
    .line 213
    and-int/lit8 v3, v3, 0x3f

    .line 214
    .line 215
    or-int/2addr v3, v10

    .line 216
    int-to-byte v3, v3

    .line 217
    invoke-static {v1, v11, v12, v3}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJB)V

    .line 218
    .line 219
    .line 220
    move v9, v2

    .line 221
    :goto_2
    add-int/lit8 v9, v9, 0x1

    .line 222
    .line 223
    move-wide/from16 v2, p3

    .line 224
    .line 225
    goto/16 :goto_1

    .line 226
    .line 227
    :cond_6
    move v9, v2

    .line 228
    :cond_7
    new-instance v0, Lcom/google/android/gms/internal/drive/zznj;

    .line 229
    .line 230
    add-int/lit8 v9, v9, -0x1

    .line 231
    .line 232
    invoke-direct {v0, v9, v8}, Lcom/google/android/gms/internal/drive/zznj;-><init>(II)V

    .line 233
    .line 234
    .line 235
    throw v0

    .line 236
    :cond_8
    if-gt v3, v11, :cond_a

    .line 237
    .line 238
    if-gt v11, v2, :cond_a

    .line 239
    .line 240
    add-int/lit8 v1, v9, 0x1

    .line 241
    .line 242
    if-eq v1, v8, :cond_9

    .line 243
    .line 244
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    invoke-static {v11, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-nez v0, :cond_a

    .line 253
    .line 254
    :cond_9
    new-instance v0, Lcom/google/android/gms/internal/drive/zznj;

    .line 255
    .line 256
    invoke-direct {v0, v9, v8}, Lcom/google/android/gms/internal/drive/zznj;-><init>(II)V

    .line 257
    .line 258
    .line 259
    throw v0

    .line 260
    :cond_a
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 261
    .line 262
    new-instance v1, Ljava/lang/StringBuilder;

    .line 263
    .line 264
    const/16 v2, 0x2e

    .line 265
    .line 266
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 267
    .line 268
    .line 269
    const-string v2, "Failed writing "

    .line 270
    .line 271
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    const-string v2, " at index "

    .line 278
    .line 279
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    throw v0

    .line 293
    :cond_b
    long-to-int v0, v4

    .line 294
    return v0

    .line 295
    :cond_c
    add-int/lit8 v8, v8, -0x1

    .line 296
    .line 297
    invoke-interface {v0, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    add-int v1, v2, v3

    .line 302
    .line 303
    const/16 v2, 0x25

    .line 304
    .line 305
    invoke-static {v2, v0, v1}, Lpk3;->l(III)V

    .line 306
    .line 307
    .line 308
    return v9
.end method

.method public final zzg([BII)Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/drive/zzkq;
        }
    .end annotation

    .line 1
    or-int p0, p2, p3

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    sub-int/2addr v0, p2

    .line 5
    sub-int/2addr v0, p3

    .line 6
    or-int/2addr p0, v0

    .line 7
    if-ltz p0, :cond_9

    .line 8
    .line 9
    add-int p0, p2, p3

    .line 10
    .line 11
    new-array v4, p3, [C

    .line 12
    .line 13
    const/4 p3, 0x0

    .line 14
    move v0, p3

    .line 15
    :goto_0
    if-ge p2, p0, :cond_0

    .line 16
    .line 17
    int-to-long v1, p2

    .line 18
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1}, Lcom/google/android/gms/internal/drive/zzng;->zzh(B)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    add-int/lit8 p2, p2, 0x1

    .line 29
    .line 30
    add-int/lit8 v2, v0, 0x1

    .line 31
    .line 32
    invoke-static {v1, v4, v0}, Lcom/google/android/gms/internal/drive/zzng;->zzb(B[CI)V

    .line 33
    .line 34
    .line 35
    move v0, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v5, v0

    .line 38
    :goto_1
    if-ge p2, p0, :cond_8

    .line 39
    .line 40
    add-int/lit8 v0, p2, 0x1

    .line 41
    .line 42
    int-to-long v1, p2

    .line 43
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-static {v1}, Lcom/google/android/gms/internal/drive/zzng;->zzh(B)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    add-int/lit8 p2, v5, 0x1

    .line 54
    .line 55
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzng;->zzb(B[CI)V

    .line 56
    .line 57
    .line 58
    :goto_2
    if-ge v0, p0, :cond_1

    .line 59
    .line 60
    int-to-long v1, v0

    .line 61
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-static {v1}, Lcom/google/android/gms/internal/drive/zzng;->zzh(B)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    add-int/lit8 v0, v0, 0x1

    .line 72
    .line 73
    add-int/lit8 v2, p2, 0x1

    .line 74
    .line 75
    invoke-static {v1, v4, p2}, Lcom/google/android/gms/internal/drive/zzng;->zzb(B[CI)V

    .line 76
    .line 77
    .line 78
    move p2, v2

    .line 79
    goto :goto_2

    .line 80
    :cond_1
    move v5, p2

    .line 81
    move p2, v0

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    invoke-static {v1}, Lcom/google/android/gms/internal/drive/zzng;->zzi(B)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    if-ge v0, p0, :cond_3

    .line 90
    .line 91
    add-int/lit8 p2, p2, 0x2

    .line 92
    .line 93
    int-to-long v2, v0

    .line 94
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    add-int/lit8 v2, v5, 0x1

    .line 99
    .line 100
    invoke-static {v1, v0, v4, v5}, Lcom/google/android/gms/internal/drive/zzng;->zzb(BB[CI)V

    .line 101
    .line 102
    .line 103
    move v5, v2

    .line 104
    goto :goto_1

    .line 105
    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdn()Lcom/google/android/gms/internal/drive/zzkq;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    throw p0

    .line 110
    :cond_4
    invoke-static {v1}, Lcom/google/android/gms/internal/drive/zzng;->zzj(B)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_6

    .line 115
    .line 116
    add-int/lit8 v2, p0, -0x1

    .line 117
    .line 118
    if-ge v0, v2, :cond_5

    .line 119
    .line 120
    add-int/lit8 v2, p2, 0x2

    .line 121
    .line 122
    int-to-long v6, v0

    .line 123
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    add-int/lit8 p2, p2, 0x3

    .line 128
    .line 129
    int-to-long v2, v2

    .line 130
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    add-int/lit8 v3, v5, 0x1

    .line 135
    .line 136
    invoke-static {v1, v0, v2, v4, v5}, Lcom/google/android/gms/internal/drive/zzng;->zzb(BBB[CI)V

    .line 137
    .line 138
    .line 139
    move v5, v3

    .line 140
    goto :goto_1

    .line 141
    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdn()Lcom/google/android/gms/internal/drive/zzkq;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    throw p0

    .line 146
    :cond_6
    add-int/lit8 v2, p0, -0x2

    .line 147
    .line 148
    if-ge v0, v2, :cond_7

    .line 149
    .line 150
    add-int/lit8 v2, p2, 0x2

    .line 151
    .line 152
    int-to-long v6, v0

    .line 153
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    add-int/lit8 v3, p2, 0x3

    .line 158
    .line 159
    int-to-long v6, v2

    .line 160
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    add-int/lit8 p2, p2, 0x4

    .line 165
    .line 166
    int-to-long v6, v3

    .line 167
    invoke-static {p1, v6, v7}, Lcom/google/android/gms/internal/drive/zznd;->zza([BJ)B

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    move v8, v1

    .line 172
    move v1, v0

    .line 173
    move v0, v8

    .line 174
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/drive/zzng;->zzb(BBBB[CI)V

    .line 175
    .line 176
    .line 177
    add-int/lit8 v5, v5, 0x2

    .line 178
    .line 179
    goto/16 :goto_1

    .line 180
    .line 181
    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdn()Lcom/google/android/gms/internal/drive/zzkq;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    throw p0

    .line 186
    :cond_8
    new-instance p0, Ljava/lang/String;

    .line 187
    .line 188
    invoke-direct {p0, v4, p3, v5}, Ljava/lang/String;-><init>([CII)V

    .line 189
    .line 190
    .line 191
    return-object p0

    .line 192
    :cond_9
    array-length p0, p1

    .line 193
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    const-string p1, "buffer length=%d, index=%d, size=%d"

    .line 210
    .line 211
    invoke-static {p1, p0}, Lio/sentry/u2;->p(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    const/4 p0, 0x0

    .line 215
    return-object p0
.end method

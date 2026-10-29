.class final Lcom/google/android/gms/internal/drive/zzni;
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


# virtual methods
.method public final zzb(I[BII)I
    .locals 6

    :goto_0
    if-ge p3, p4, :cond_0

    .line 257
    aget-byte p0, p2, p3

    if-ltz p0, :cond_0

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    if-lt p3, p4, :cond_1

    return p0

    :cond_1
    :goto_1
    if-lt p3, p4, :cond_2

    return p0

    :cond_2
    add-int/lit8 p1, p3, 0x1

    .line 258
    aget-byte v0, p2, p3

    if-gez v0, :cond_d

    const/16 v1, -0x20

    const/4 v2, -0x1

    const/16 v3, -0x41

    if-ge v0, v1, :cond_5

    if-lt p1, p4, :cond_3

    return v0

    :cond_3
    const/16 v1, -0x3e

    if-lt v0, v1, :cond_4

    add-int/lit8 p3, p3, 0x2

    .line 259
    aget-byte p1, p2, p1

    if-le p1, v3, :cond_1

    :cond_4
    return v2

    :cond_5
    const/16 v4, -0x10

    if-ge v0, v4, :cond_a

    add-int/lit8 v4, p4, -0x1

    if-lt p1, v4, :cond_6

    .line 260
    invoke-static {p2, p1, p4}, Lcom/google/android/gms/internal/drive/zznf;->zzh([BII)I

    move-result p0

    return p0

    :cond_6
    add-int/lit8 v4, p3, 0x2

    .line 261
    aget-byte p1, p2, p1

    if-gt p1, v3, :cond_9

    const/16 v5, -0x60

    if-ne v0, v1, :cond_7

    if-lt p1, v5, :cond_9

    :cond_7
    const/16 v1, -0x13

    if-ne v0, v1, :cond_8

    if-ge p1, v5, :cond_9

    :cond_8
    add-int/lit8 p3, p3, 0x3

    aget-byte p1, p2, v4

    if-le p1, v3, :cond_1

    :cond_9
    return v2

    :cond_a
    add-int/lit8 v1, p4, -0x2

    if-lt p1, v1, :cond_b

    .line 262
    invoke-static {p2, p1, p4}, Lcom/google/android/gms/internal/drive/zznf;->zzh([BII)I

    move-result p0

    return p0

    :cond_b
    add-int/lit8 v1, p3, 0x2

    .line 263
    aget-byte p1, p2, p1

    if-gt p1, v3, :cond_c

    shl-int/lit8 v0, v0, 0x1c

    add-int/lit8 p1, p1, 0x70

    add-int/2addr p1, v0

    shr-int/lit8 p1, p1, 0x1e

    if-nez p1, :cond_c

    add-int/lit8 p1, p3, 0x3

    aget-byte v0, p2, v1

    if-gt v0, v3, :cond_c

    add-int/lit8 p3, p3, 0x4

    aget-byte p1, p2, p1

    if-le p1, v3, :cond_1

    :cond_c
    return v2

    :cond_d
    move p3, p1

    goto :goto_1
.end method

.method public final zzb(Ljava/lang/CharSequence;[BII)I
    .locals 6

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    add-int/2addr p4, p3

    .line 6
    const/4 v0, 0x0

    .line 7
    :goto_0
    const/16 v1, 0x80

    .line 8
    .line 9
    if-ge v0, p0, :cond_0

    .line 10
    .line 11
    add-int v2, v0, p3

    .line 12
    .line 13
    if-ge v2, p4, :cond_0

    .line 14
    .line 15
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-ge v3, v1, :cond_0

    .line 20
    .line 21
    int-to-byte v1, v3

    .line 22
    aput-byte v1, p2, v2

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-ne v0, p0, :cond_1

    .line 28
    .line 29
    add-int/2addr p3, p0

    .line 30
    return p3

    .line 31
    :cond_1
    add-int/2addr p3, v0

    .line 32
    :goto_1
    if-ge v0, p0, :cond_b

    .line 33
    .line 34
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-ge v2, v1, :cond_2

    .line 39
    .line 40
    if-ge p3, p4, :cond_2

    .line 41
    .line 42
    add-int/lit8 v3, p3, 0x1

    .line 43
    .line 44
    int-to-byte v2, v2

    .line 45
    aput-byte v2, p2, p3

    .line 46
    .line 47
    move p3, v3

    .line 48
    goto/16 :goto_2

    .line 49
    .line 50
    :cond_2
    const/16 v3, 0x800

    .line 51
    .line 52
    if-ge v2, v3, :cond_3

    .line 53
    .line 54
    add-int/lit8 v3, p4, -0x2

    .line 55
    .line 56
    if-gt p3, v3, :cond_3

    .line 57
    .line 58
    add-int/lit8 v3, p3, 0x1

    .line 59
    .line 60
    ushr-int/lit8 v4, v2, 0x6

    .line 61
    .line 62
    or-int/lit16 v4, v4, 0x3c0

    .line 63
    .line 64
    int-to-byte v4, v4

    .line 65
    aput-byte v4, p2, p3

    .line 66
    .line 67
    add-int/lit8 p3, p3, 0x2

    .line 68
    .line 69
    and-int/lit8 v2, v2, 0x3f

    .line 70
    .line 71
    or-int/2addr v2, v1

    .line 72
    int-to-byte v2, v2

    .line 73
    aput-byte v2, p2, v3

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    const v3, 0xdfff

    .line 77
    .line 78
    .line 79
    const v4, 0xd800

    .line 80
    .line 81
    .line 82
    if-lt v2, v4, :cond_4

    .line 83
    .line 84
    if-ge v3, v2, :cond_5

    .line 85
    .line 86
    :cond_4
    add-int/lit8 v5, p4, -0x3

    .line 87
    .line 88
    if-gt p3, v5, :cond_5

    .line 89
    .line 90
    add-int/lit8 v3, p3, 0x1

    .line 91
    .line 92
    ushr-int/lit8 v4, v2, 0xc

    .line 93
    .line 94
    or-int/lit16 v4, v4, 0x1e0

    .line 95
    .line 96
    int-to-byte v4, v4

    .line 97
    aput-byte v4, p2, p3

    .line 98
    .line 99
    add-int/lit8 v4, p3, 0x2

    .line 100
    .line 101
    ushr-int/lit8 v5, v2, 0x6

    .line 102
    .line 103
    and-int/lit8 v5, v5, 0x3f

    .line 104
    .line 105
    or-int/2addr v5, v1

    .line 106
    int-to-byte v5, v5

    .line 107
    aput-byte v5, p2, v3

    .line 108
    .line 109
    add-int/lit8 p3, p3, 0x3

    .line 110
    .line 111
    and-int/lit8 v2, v2, 0x3f

    .line 112
    .line 113
    or-int/2addr v2, v1

    .line 114
    int-to-byte v2, v2

    .line 115
    aput-byte v2, p2, v4

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_5
    add-int/lit8 v5, p4, -0x4

    .line 119
    .line 120
    if-gt p3, v5, :cond_8

    .line 121
    .line 122
    add-int/lit8 v3, v0, 0x1

    .line 123
    .line 124
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-eq v3, v4, :cond_7

    .line 129
    .line 130
    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    invoke-static {v2, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-eqz v4, :cond_6

    .line 139
    .line 140
    invoke-static {v2, v0}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    add-int/lit8 v2, p3, 0x1

    .line 145
    .line 146
    ushr-int/lit8 v4, v0, 0x12

    .line 147
    .line 148
    or-int/lit16 v4, v4, 0xf0

    .line 149
    .line 150
    int-to-byte v4, v4

    .line 151
    aput-byte v4, p2, p3

    .line 152
    .line 153
    add-int/lit8 v4, p3, 0x2

    .line 154
    .line 155
    ushr-int/lit8 v5, v0, 0xc

    .line 156
    .line 157
    and-int/lit8 v5, v5, 0x3f

    .line 158
    .line 159
    or-int/2addr v5, v1

    .line 160
    int-to-byte v5, v5

    .line 161
    aput-byte v5, p2, v2

    .line 162
    .line 163
    add-int/lit8 v2, p3, 0x3

    .line 164
    .line 165
    ushr-int/lit8 v5, v0, 0x6

    .line 166
    .line 167
    and-int/lit8 v5, v5, 0x3f

    .line 168
    .line 169
    or-int/2addr v5, v1

    .line 170
    int-to-byte v5, v5

    .line 171
    aput-byte v5, p2, v4

    .line 172
    .line 173
    add-int/lit8 p3, p3, 0x4

    .line 174
    .line 175
    and-int/lit8 v0, v0, 0x3f

    .line 176
    .line 177
    or-int/2addr v0, v1

    .line 178
    int-to-byte v0, v0

    .line 179
    aput-byte v0, p2, v2

    .line 180
    .line 181
    move v0, v3

    .line 182
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 183
    .line 184
    goto/16 :goto_1

    .line 185
    .line 186
    :cond_6
    move v0, v3

    .line 187
    :cond_7
    new-instance p1, Lcom/google/android/gms/internal/drive/zznj;

    .line 188
    .line 189
    add-int/lit8 v0, v0, -0x1

    .line 190
    .line 191
    invoke-direct {p1, v0, p0}, Lcom/google/android/gms/internal/drive/zznj;-><init>(II)V

    .line 192
    .line 193
    .line 194
    throw p1

    .line 195
    :cond_8
    if-gt v4, v2, :cond_a

    .line 196
    .line 197
    if-gt v2, v3, :cond_a

    .line 198
    .line 199
    add-int/lit8 p2, v0, 0x1

    .line 200
    .line 201
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 202
    .line 203
    .line 204
    move-result p4

    .line 205
    if-eq p2, p4, :cond_9

    .line 206
    .line 207
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    invoke-static {v2, p1}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    if-nez p1, :cond_a

    .line 216
    .line 217
    :cond_9
    new-instance p1, Lcom/google/android/gms/internal/drive/zznj;

    .line 218
    .line 219
    invoke-direct {p1, v0, p0}, Lcom/google/android/gms/internal/drive/zznj;-><init>(II)V

    .line 220
    .line 221
    .line 222
    throw p1

    .line 223
    :cond_a
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 224
    .line 225
    new-instance p1, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    const/16 p2, 0x25

    .line 228
    .line 229
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 230
    .line 231
    .line 232
    const-string p2, "Failed writing "

    .line 233
    .line 234
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const-string p2, " at index "

    .line 241
    .line 242
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw p0

    .line 256
    :cond_b
    return p3
.end method

.method public final zzg([BII)Ljava/lang/String;
    .locals 6
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
    aget-byte v1, p1, p2

    .line 18
    .line 19
    invoke-static {v1}, Lcom/google/android/gms/internal/drive/zzng;->zzh(B)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    add-int/lit8 p2, p2, 0x1

    .line 26
    .line 27
    add-int/lit8 v2, v0, 0x1

    .line 28
    .line 29
    invoke-static {v1, v4, v0}, Lcom/google/android/gms/internal/drive/zzng;->zzb(B[CI)V

    .line 30
    .line 31
    .line 32
    move v0, v2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v5, v0

    .line 35
    :goto_1
    if-ge p2, p0, :cond_8

    .line 36
    .line 37
    add-int/lit8 v0, p2, 0x1

    .line 38
    .line 39
    move v1, v0

    .line 40
    aget-byte v0, p1, p2

    .line 41
    .line 42
    invoke-static {v0}, Lcom/google/android/gms/internal/drive/zzng;->zzh(B)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    add-int/lit8 p2, v5, 0x1

    .line 49
    .line 50
    invoke-static {v0, v4, v5}, Lcom/google/android/gms/internal/drive/zzng;->zzb(B[CI)V

    .line 51
    .line 52
    .line 53
    move v0, v1

    .line 54
    :goto_2
    if-ge v0, p0, :cond_1

    .line 55
    .line 56
    aget-byte v1, p1, v0

    .line 57
    .line 58
    invoke-static {v1}, Lcom/google/android/gms/internal/drive/zzng;->zzh(B)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    add-int/lit8 v0, v0, 0x1

    .line 65
    .line 66
    add-int/lit8 v2, p2, 0x1

    .line 67
    .line 68
    invoke-static {v1, v4, p2}, Lcom/google/android/gms/internal/drive/zzng;->zzb(B[CI)V

    .line 69
    .line 70
    .line 71
    move p2, v2

    .line 72
    goto :goto_2

    .line 73
    :cond_1
    move v5, p2

    .line 74
    move p2, v0

    .line 75
    goto :goto_1

    .line 76
    :cond_2
    invoke-static {v0}, Lcom/google/android/gms/internal/drive/zzng;->zzi(B)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_4

    .line 81
    .line 82
    if-ge v1, p0, :cond_3

    .line 83
    .line 84
    add-int/lit8 p2, p2, 0x2

    .line 85
    .line 86
    aget-byte v1, p1, v1

    .line 87
    .line 88
    add-int/lit8 v2, v5, 0x1

    .line 89
    .line 90
    invoke-static {v0, v1, v4, v5}, Lcom/google/android/gms/internal/drive/zzng;->zzb(BB[CI)V

    .line 91
    .line 92
    .line 93
    move v5, v2

    .line 94
    goto :goto_1

    .line 95
    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdn()Lcom/google/android/gms/internal/drive/zzkq;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    throw p0

    .line 100
    :cond_4
    invoke-static {v0}, Lcom/google/android/gms/internal/drive/zzng;->zzj(B)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_6

    .line 105
    .line 106
    add-int/lit8 v2, p0, -0x1

    .line 107
    .line 108
    if-ge v1, v2, :cond_5

    .line 109
    .line 110
    add-int/lit8 v2, p2, 0x2

    .line 111
    .line 112
    aget-byte v1, p1, v1

    .line 113
    .line 114
    add-int/lit8 p2, p2, 0x3

    .line 115
    .line 116
    aget-byte v2, p1, v2

    .line 117
    .line 118
    add-int/lit8 v3, v5, 0x1

    .line 119
    .line 120
    invoke-static {v0, v1, v2, v4, v5}, Lcom/google/android/gms/internal/drive/zzng;->zzb(BBB[CI)V

    .line 121
    .line 122
    .line 123
    move v5, v3

    .line 124
    goto :goto_1

    .line 125
    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdn()Lcom/google/android/gms/internal/drive/zzkq;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    throw p0

    .line 130
    :cond_6
    add-int/lit8 v2, p0, -0x2

    .line 131
    .line 132
    if-ge v1, v2, :cond_7

    .line 133
    .line 134
    add-int/lit8 v2, p2, 0x2

    .line 135
    .line 136
    aget-byte v1, p1, v1

    .line 137
    .line 138
    add-int/lit8 v3, p2, 0x3

    .line 139
    .line 140
    aget-byte v2, p1, v2

    .line 141
    .line 142
    add-int/lit8 p2, p2, 0x4

    .line 143
    .line 144
    aget-byte v3, p1, v3

    .line 145
    .line 146
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/drive/zzng;->zzb(BBBB[CI)V

    .line 147
    .line 148
    .line 149
    add-int/lit8 v5, v5, 0x2

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/drive/zzkq;->zzdn()Lcom/google/android/gms/internal/drive/zzkq;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    throw p0

    .line 157
    :cond_8
    new-instance p0, Ljava/lang/String;

    .line 158
    .line 159
    invoke-direct {p0, v4, p3, v5}, Ljava/lang/String;-><init>([CII)V

    .line 160
    .line 161
    .line 162
    return-object p0

    .line 163
    :cond_9
    array-length p0, p1

    .line 164
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    const-string p1, "buffer length=%d, index=%d, size=%d"

    .line 181
    .line 182
    invoke-static {p1, p0}, Lio/sentry/u2;->p(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    const/4 p0, 0x0

    .line 186
    return-object p0
.end method

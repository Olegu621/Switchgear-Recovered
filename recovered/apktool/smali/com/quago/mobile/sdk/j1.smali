.class public final Lcom/quago/mobile/sdk/j1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final g:[F

.field public static final h:Ljava/nio/FloatBuffer;

.field public static final i:Ljava/nio/FloatBuffer;


# instance fields
.field public a:Ljava/nio/FloatBuffer;

.field public b:Ljava/nio/FloatBuffer;

.field public c:I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v1, v0, [F

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    new-array v0, v0, [F

    .line 8
    .line 9
    fill-array-data v0, :array_1

    .line 10
    .line 11
    .line 12
    sget-object v2, Lcom/quago/mobile/sdk/q;->a:[F

    .line 13
    .line 14
    const/16 v2, 0x18

    .line 15
    .line 16
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-virtual {v3, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 36
    .line 37
    .line 38
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 57
    .line 58
    .line 59
    const/16 v0, 0x8

    .line 60
    .line 61
    new-array v2, v0, [F

    .line 62
    .line 63
    fill-array-data v2, :array_2

    .line 64
    .line 65
    .line 66
    sput-object v2, Lcom/quago/mobile/sdk/j1;->g:[F

    .line 67
    .line 68
    new-array v0, v0, [F

    .line 69
    .line 70
    fill-array-data v0, :array_3

    .line 71
    .line 72
    .line 73
    const/16 v3, 0x20

    .line 74
    .line 75
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v4, v2}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 94
    .line 95
    .line 96
    sput-object v4, Lcom/quago/mobile/sdk/j1;->h:Ljava/nio/FloatBuffer;

    .line 97
    .line 98
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v2, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 117
    .line 118
    .line 119
    sput-object v2, Lcom/quago/mobile/sdk/j1;->i:Ljava/nio/FloatBuffer;

    .line 120
    .line 121
    return-void

    .line 122
    nop

    .line 123
    :array_0
    .array-data 4
        0x0
        0x3f13cd3a
        -0x41000000    # -0.5f
        -0x416c32c6
        0x3f000000    # 0.5f
        -0x416c32c6
    .end array-data

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    :array_1
    .array-data 4
        0x3f000000    # 0.5f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    :array_2
    .array-data 4
        -0x41000000    # -0.5f
        -0x41000000    # -0.5f
        0x3f000000    # 0.5f
        -0x41000000    # -0.5f
        -0x41000000    # -0.5f
        0x3f000000    # 0.5f
        0x3f000000    # 0.5f
        0x3f000000    # 0.5f
    .end array-data

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    :array_3
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()Lcom/quago/mobile/sdk/j1;
    .locals 4

    .line 287
    new-instance v0, Lcom/quago/mobile/sdk/j1;

    invoke-direct {v0}, Lcom/quago/mobile/sdk/j1;-><init>()V

    .line 288
    sget-object v1, Lcom/quago/mobile/sdk/j1;->h:Ljava/nio/FloatBuffer;

    iput-object v1, v0, Lcom/quago/mobile/sdk/j1;->a:Ljava/nio/FloatBuffer;

    .line 289
    sget-object v1, Lcom/quago/mobile/sdk/j1;->i:Ljava/nio/FloatBuffer;

    iput-object v1, v0, Lcom/quago/mobile/sdk/j1;->b:Ljava/nio/FloatBuffer;

    const/4 v1, 0x2

    .line 290
    iput v1, v0, Lcom/quago/mobile/sdk/j1;->e:I

    const/16 v2, 0x8

    .line 291
    iput v2, v0, Lcom/quago/mobile/sdk/j1;->d:I

    .line 292
    sget-object v3, Lcom/quago/mobile/sdk/j1;->g:[F

    array-length v3, v3

    div-int/2addr v3, v1

    iput v3, v0, Lcom/quago/mobile/sdk/j1;->c:I

    .line 293
    iput v2, v0, Lcom/quago/mobile/sdk/j1;->f:I

    return-object v0
.end method

.method public static a(Lcom/quago/mobile/sdk/b;)Lcom/quago/mobile/sdk/j1;
    .locals 15

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p0, v2}, Lcom/quago/mobile/sdk/b;->a(F)Landroid/graphics/PointF;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    new-instance v4, Landroid/graphics/PointF;

    .line 17
    .line 18
    iget v5, v3, Landroid/graphics/PointF;->x:F

    .line 19
    .line 20
    iget v6, v3, Landroid/graphics/PointF;->y:F

    .line 21
    .line 22
    const/high16 v7, 0x3e800000    # 0.25f

    .line 23
    .line 24
    sub-float/2addr v6, v7

    .line 25
    invoke-direct {v4, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    new-instance v4, Landroid/graphics/PointF;

    .line 32
    .line 33
    iget v5, v3, Landroid/graphics/PointF;->x:F

    .line 34
    .line 35
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 36
    .line 37
    add-float/2addr v3, v7

    .line 38
    invoke-direct {v4, v5, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    :goto_0
    const/16 v4, 0x1e

    .line 46
    .line 47
    if-ge v3, v4, :cond_0

    .line 48
    .line 49
    int-to-float v4, v3

    .line 50
    const v5, 0x3d088889

    .line 51
    .line 52
    .line 53
    mul-float/2addr v5, v4

    .line 54
    invoke-virtual {p0, v5}, Lcom/quago/mobile/sdk/b;->a(F)Landroid/graphics/PointF;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    new-instance v5, Landroid/graphics/PointF;

    .line 59
    .line 60
    iget v6, v4, Landroid/graphics/PointF;->x:F

    .line 61
    .line 62
    iget v8, v4, Landroid/graphics/PointF;->y:F

    .line 63
    .line 64
    sub-float/2addr v8, v7

    .line 65
    invoke-direct {v5, v6, v8}, Landroid/graphics/PointF;-><init>(FF)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    new-instance v5, Landroid/graphics/PointF;

    .line 72
    .line 73
    iget v6, v4, Landroid/graphics/PointF;->x:F

    .line 74
    .line 75
    iget v4, v4, Landroid/graphics/PointF;->y:F

    .line 76
    .line 77
    add-float/2addr v4, v7

    .line 78
    invoke-direct {v5, v6, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    add-int/lit8 v3, v3, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    const/high16 v3, 0x3f800000    # 1.0f

    .line 88
    .line 89
    invoke-virtual {p0, v3}, Lcom/quago/mobile/sdk/b;->a(F)Landroid/graphics/PointF;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    new-instance v4, Landroid/graphics/PointF;

    .line 94
    .line 95
    iget v5, p0, Landroid/graphics/PointF;->x:F

    .line 96
    .line 97
    iget v6, p0, Landroid/graphics/PointF;->y:F

    .line 98
    .line 99
    sub-float/2addr v6, v7

    .line 100
    invoke-direct {v4, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    new-instance v4, Landroid/graphics/PointF;

    .line 107
    .line 108
    iget v5, p0, Landroid/graphics/PointF;->x:F

    .line 109
    .line 110
    iget p0, p0, Landroid/graphics/PointF;->y:F

    .line 111
    .line 112
    add-float/2addr p0, v7

    .line 113
    invoke-direct {v4, v5, p0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    add-int/2addr v4, p0

    .line 128
    mul-int/lit8 p0, v4, 0x2

    .line 129
    .line 130
    new-array v5, p0, [F

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    add-int/2addr v7, v6

    .line 141
    mul-int/lit8 v6, v7, 0x2

    .line 142
    .line 143
    new-array v6, v6, [F

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    int-to-float v8, v8

    .line 150
    const/high16 v9, 0x3f000000    # 0.5f

    .line 151
    .line 152
    div-float/2addr v9, v8

    .line 153
    const/4 v8, 0x0

    .line 154
    move v10, v8

    .line 155
    move v11, v10

    .line 156
    move v12, v11

    .line 157
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 158
    .line 159
    .line 160
    move-result v13

    .line 161
    if-ge v10, v13, :cond_2

    .line 162
    .line 163
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v13

    .line 167
    check-cast v13, Landroid/graphics/PointF;

    .line 168
    .line 169
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v14

    .line 173
    check-cast v14, Landroid/graphics/PointF;

    .line 174
    .line 175
    if-eqz v11, :cond_1

    .line 176
    .line 177
    iget v14, v13, Landroid/graphics/PointF;->x:F

    .line 178
    .line 179
    aput v14, v5, v12

    .line 180
    .line 181
    add-int/lit8 v14, v12, 0x1

    .line 182
    .line 183
    iget v13, v13, Landroid/graphics/PointF;->y:F

    .line 184
    .line 185
    aput v13, v5, v14

    .line 186
    .line 187
    int-to-float v13, v10

    .line 188
    mul-float/2addr v13, v9

    .line 189
    aput v13, v6, v12

    .line 190
    .line 191
    aput v3, v6, v14

    .line 192
    .line 193
    add-int/lit8 v12, v12, 0x2

    .line 194
    .line 195
    add-int/lit8 v10, v10, 0x1

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_1
    iget v13, v14, Landroid/graphics/PointF;->x:F

    .line 199
    .line 200
    aput v13, v5, v12

    .line 201
    .line 202
    add-int/lit8 v13, v12, 0x1

    .line 203
    .line 204
    iget v14, v14, Landroid/graphics/PointF;->y:F

    .line 205
    .line 206
    aput v14, v5, v13

    .line 207
    .line 208
    int-to-float v14, v10

    .line 209
    mul-float/2addr v14, v9

    .line 210
    aput v14, v6, v12

    .line 211
    .line 212
    aput v2, v6, v13

    .line 213
    .line 214
    add-int/lit8 v12, v12, 0x2

    .line 215
    .line 216
    :goto_2
    xor-int/lit8 v11, v11, 0x1

    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_2
    const/16 v0, 0x8

    .line 220
    .line 221
    mul-int/2addr v4, v0

    .line 222
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-virtual {v1, v5}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v8}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 242
    .line 243
    .line 244
    mul-int/2addr v7, v0

    .line 245
    invoke-static {v7}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-virtual {v2, v6}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v8}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 265
    .line 266
    .line 267
    new-instance v3, Lcom/quago/mobile/sdk/j1;

    .line 268
    .line 269
    invoke-direct {v3}, Lcom/quago/mobile/sdk/j1;-><init>()V

    .line 270
    .line 271
    .line 272
    iput-object v1, v3, Lcom/quago/mobile/sdk/j1;->a:Ljava/nio/FloatBuffer;

    .line 273
    .line 274
    iput-object v2, v3, Lcom/quago/mobile/sdk/j1;->b:Ljava/nio/FloatBuffer;

    .line 275
    .line 276
    const/4 v1, 0x2

    .line 277
    iput v1, v3, Lcom/quago/mobile/sdk/j1;->e:I

    .line 278
    .line 279
    iput v0, v3, Lcom/quago/mobile/sdk/j1;->d:I

    .line 280
    .line 281
    div-int/2addr p0, v1

    .line 282
    iput p0, v3, Lcom/quago/mobile/sdk/j1;->c:I

    .line 283
    .line 284
    iput v0, v3, Lcom/quago/mobile/sdk/j1;->f:I

    .line 285
    .line 286
    return-object v3
.end method

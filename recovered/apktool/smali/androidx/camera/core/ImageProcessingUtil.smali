.class public abstract Landroidx/camera/core/ImageProcessingUtil;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "image_processing_util_jni"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static a(Lmw0;)V
    .locals 15

    .line 1
    invoke-static {p0}, Landroidx/camera/core/ImageProcessingUtil;->d(Lmw0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "ImageProcessingUtil"

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string p0, "Unsupported format for YUV to RGB"

    .line 10
    .line 11
    invoke-static {v1, p0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-interface {p0}, Lmw0;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v10

    .line 19
    invoke-interface {p0}, Lmw0;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result v11

    .line 23
    invoke-interface {p0}, Lmw0;->j()[Llw0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v2, 0x0

    .line 28
    aget-object v0, v0, v2

    .line 29
    .line 30
    invoke-interface {v0}, Llw0;->b()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-interface {p0}, Lmw0;->j()[Llw0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const/4 v4, 0x1

    .line 39
    aget-object v0, v0, v4

    .line 40
    .line 41
    invoke-interface {v0}, Llw0;->b()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    invoke-interface {p0}, Lmw0;->j()[Llw0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const/4 v6, 0x2

    .line 50
    aget-object v0, v0, v6

    .line 51
    .line 52
    invoke-interface {v0}, Llw0;->b()I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    invoke-interface {p0}, Lmw0;->j()[Llw0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    aget-object v0, v0, v2

    .line 61
    .line 62
    invoke-interface {v0}, Llw0;->j()I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    invoke-interface {p0}, Lmw0;->j()[Llw0;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    aget-object v0, v0, v4

    .line 71
    .line 72
    invoke-interface {v0}, Llw0;->j()I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    invoke-interface {p0}, Lmw0;->j()[Llw0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    aget-object v0, v0, v2

    .line 81
    .line 82
    invoke-interface {v0}, Llw0;->getBuffer()Ljava/nio/ByteBuffer;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-interface {p0}, Lmw0;->j()[Llw0;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    aget-object v0, v0, v4

    .line 91
    .line 92
    invoke-interface {v0}, Llw0;->getBuffer()Ljava/nio/ByteBuffer;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-interface {p0}, Lmw0;->j()[Llw0;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    aget-object p0, p0, v6

    .line 101
    .line 102
    invoke-interface {p0}, Llw0;->getBuffer()Ljava/nio/ByteBuffer;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    move v12, v8

    .line 107
    move v13, v9

    .line 108
    move v14, v9

    .line 109
    invoke-static/range {v2 .. v14}, Landroidx/camera/core/ImageProcessingUtil;->nativeShiftPixel(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;IIIIIIII)I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    if-eqz p0, :cond_1

    .line 114
    .line 115
    const-string p0, "One pixel shift for YUV failure"

    .line 116
    .line 117
    invoke-static {v1, p0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_1
    return-void
.end method

.method public static b(Lmw0;Low0;Ljava/nio/ByteBuffer;IZ)Lvv0;
    .locals 20

    .line 1
    move/from16 v0, p3

    .line 2
    .line 3
    invoke-static/range {p0 .. p0}, Landroidx/camera/core/ImageProcessingUtil;->d(Lmw0;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v17, 0x0

    .line 8
    .line 9
    const-string v2, "ImageProcessingUtil"

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const-string v0, "Unsupported format for YUV to RGB"

    .line 14
    .line 15
    invoke-static {v2, v0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v17

    .line 19
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    const/16 v1, 0x5a

    .line 25
    .line 26
    if-eq v0, v1, :cond_2

    .line 27
    .line 28
    const/16 v1, 0xb4

    .line 29
    .line 30
    if-eq v0, v1, :cond_2

    .line 31
    .line 32
    const/16 v1, 0x10e

    .line 33
    .line 34
    if-ne v0, v1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string v0, "Unsupported rotation degrees for rotate RGB"

    .line 38
    .line 39
    invoke-static {v2, v0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v17

    .line 43
    :cond_2
    :goto_0
    invoke-interface/range {p1 .. p1}, Low0;->getSurface()Landroid/view/Surface;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    invoke-interface/range {p0 .. p0}, Lmw0;->getWidth()I

    .line 48
    .line 49
    .line 50
    move-result v11

    .line 51
    invoke-interface/range {p0 .. p0}, Lmw0;->getHeight()I

    .line 52
    .line 53
    .line 54
    move-result v12

    .line 55
    invoke-interface/range {p0 .. p0}, Lmw0;->j()[Llw0;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const/4 v3, 0x0

    .line 60
    aget-object v1, v1, v3

    .line 61
    .line 62
    invoke-interface {v1}, Llw0;->b()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    invoke-interface/range {p0 .. p0}, Lmw0;->j()[Llw0;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    const/16 v18, 0x1

    .line 71
    .line 72
    aget-object v4, v4, v18

    .line 73
    .line 74
    invoke-interface {v4}, Llw0;->b()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    invoke-interface/range {p0 .. p0}, Lmw0;->j()[Llw0;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    const/4 v6, 0x2

    .line 83
    aget-object v5, v5, v6

    .line 84
    .line 85
    invoke-interface {v5}, Llw0;->b()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    invoke-interface/range {p0 .. p0}, Lmw0;->j()[Llw0;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    aget-object v7, v7, v3

    .line 94
    .line 95
    invoke-interface {v7}, Llw0;->j()I

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    invoke-interface/range {p0 .. p0}, Lmw0;->j()[Llw0;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    aget-object v8, v8, v18

    .line 104
    .line 105
    invoke-interface {v8}, Llw0;->j()I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    if-eqz p4, :cond_3

    .line 110
    .line 111
    move v13, v7

    .line 112
    goto :goto_1

    .line 113
    :cond_3
    move v13, v3

    .line 114
    :goto_1
    if-eqz p4, :cond_4

    .line 115
    .line 116
    move v14, v8

    .line 117
    goto :goto_2

    .line 118
    :cond_4
    move v14, v3

    .line 119
    :goto_2
    if-eqz p4, :cond_5

    .line 120
    .line 121
    move v15, v8

    .line 122
    goto :goto_3

    .line 123
    :cond_5
    move v15, v3

    .line 124
    :goto_3
    invoke-interface/range {p0 .. p0}, Lmw0;->j()[Llw0;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    aget-object v10, v10, v3

    .line 129
    .line 130
    invoke-interface {v10}, Llw0;->getBuffer()Ljava/nio/ByteBuffer;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    invoke-interface/range {p0 .. p0}, Lmw0;->j()[Llw0;

    .line 135
    .line 136
    .line 137
    move-result-object v16

    .line 138
    aget-object v16, v16, v18

    .line 139
    .line 140
    invoke-interface/range {v16 .. v16}, Llw0;->getBuffer()Ljava/nio/ByteBuffer;

    .line 141
    .line 142
    .line 143
    move-result-object v16

    .line 144
    invoke-interface/range {p0 .. p0}, Lmw0;->j()[Llw0;

    .line 145
    .line 146
    .line 147
    move-result-object v19

    .line 148
    aget-object v6, v19, v6

    .line 149
    .line 150
    invoke-interface {v6}, Llw0;->getBuffer()Ljava/nio/ByteBuffer;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    move-object v3, v6

    .line 155
    move v6, v5

    .line 156
    move-object v5, v3

    .line 157
    move-object/from16 v3, v16

    .line 158
    .line 159
    move/from16 v16, v0

    .line 160
    .line 161
    move-object v0, v2

    .line 162
    move v2, v1

    .line 163
    move-object v1, v10

    .line 164
    move-object/from16 v10, p2

    .line 165
    .line 166
    invoke-static/range {v1 .. v16}, Landroidx/camera/core/ImageProcessingUtil;->nativeConvertAndroid420ToABGR(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;IIILandroid/view/Surface;Ljava/nio/ByteBuffer;IIIIII)I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_6

    .line 171
    .line 172
    const-string v1, "YUV to RGB conversion failure"

    .line 173
    .line 174
    invoke-static {v0, v1}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    return-object v17

    .line 178
    :cond_6
    const-string v1, "MH"

    .line 179
    .line 180
    const/4 v2, 0x3

    .line 181
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_7

    .line 186
    .line 187
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 188
    .line 189
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 190
    .line 191
    .line 192
    invoke-static {v0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    sget v1, Landroidx/camera/core/ImageProcessingUtil;->a:I

    .line 196
    .line 197
    add-int/lit8 v1, v1, 0x1

    .line 198
    .line 199
    sput v1, Landroidx/camera/core/ImageProcessingUtil;->a:I

    .line 200
    .line 201
    :cond_7
    invoke-interface/range {p1 .. p1}, Low0;->acquireLatestImage()Lmw0;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    if-nez v1, :cond_8

    .line 206
    .line 207
    const-string v1, "YUV to RGB acquireLatestImage failure"

    .line 208
    .line 209
    invoke-static {v0, v1}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    return-object v17

    .line 213
    :cond_8
    new-instance v0, Lvv0;

    .line 214
    .line 215
    invoke-direct {v0, v1}, Lvv0;-><init>(Lmw0;)V

    .line 216
    .line 217
    .line 218
    new-instance v2, Lkw0;

    .line 219
    .line 220
    const/4 v4, 0x0

    .line 221
    move-object/from16 v3, p0

    .line 222
    .line 223
    invoke-direct {v2, v1, v3, v4}, Lkw0;-><init>(Lmw0;Lmw0;I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v2}, Lcm0;->c(Lbm0;)V

    .line 227
    .line 228
    .line 229
    return-object v0
.end method

.method public static c(Landroid/graphics/Bitmap;Ljava/nio/ByteBuffer;I)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getRowBytes()I

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    const/4 v6, 0x1

    .line 14
    move-object v0, p0

    .line 15
    move-object v1, p1

    .line 16
    move v2, p2

    .line 17
    invoke-static/range {v0 .. v6}, Landroidx/camera/core/ImageProcessingUtil;->nativeCopyBetweenByteBufferAndBitmap(Landroid/graphics/Bitmap;Ljava/nio/ByteBuffer;IIIIZ)I

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static d(Lmw0;)Z
    .locals 2

    .line 1
    invoke-interface {p0}, Lmw0;->getFormat()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x23

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-interface {p0}, Lmw0;->j()[Llw0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    array-length p0, p0

    .line 14
    const/4 v0, 0x3

    .line 15
    if-ne p0, v0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public static e(Lmw0;Low0;Landroid/media/ImageWriter;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)Lvv0;
    .locals 25

    .line 1
    move/from16 v0, p6

    .line 2
    .line 3
    invoke-static/range {p0 .. p0}, Landroidx/camera/core/ImageProcessingUtil;->d(Lmw0;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v23, 0x0

    .line 8
    .line 9
    const-string v2, "ImageProcessingUtil"

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const-string v0, "Unsupported format for rotate YUV"

    .line 14
    .line 15
    invoke-static {v2, v0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v23

    .line 19
    :cond_0
    if-eqz v0, :cond_2

    .line 20
    .line 21
    const/16 v1, 0x5a

    .line 22
    .line 23
    if-eq v0, v1, :cond_2

    .line 24
    .line 25
    const/16 v1, 0xb4

    .line 26
    .line 27
    if-eq v0, v1, :cond_2

    .line 28
    .line 29
    const/16 v1, 0x10e

    .line 30
    .line 31
    if-ne v0, v1, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const-string v0, "Unsupported rotation degrees for rotate YUV"

    .line 35
    .line 36
    invoke-static {v2, v0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v23

    .line 40
    :cond_2
    :goto_0
    if-lez v0, :cond_3

    .line 41
    .line 42
    invoke-interface/range {p0 .. p0}, Lmw0;->getWidth()I

    .line 43
    .line 44
    .line 45
    move-result v20

    .line 46
    invoke-interface/range {p0 .. p0}, Lmw0;->getHeight()I

    .line 47
    .line 48
    .line 49
    move-result v21

    .line 50
    invoke-interface/range {p0 .. p0}, Lmw0;->j()[Llw0;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const/4 v3, 0x0

    .line 55
    aget-object v1, v1, v3

    .line 56
    .line 57
    invoke-interface {v1}, Llw0;->b()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-interface/range {p0 .. p0}, Lmw0;->j()[Llw0;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    const/4 v5, 0x1

    .line 66
    aget-object v4, v4, v5

    .line 67
    .line 68
    invoke-interface {v4}, Llw0;->b()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    invoke-interface/range {p0 .. p0}, Lmw0;->j()[Llw0;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    const/4 v7, 0x2

    .line 77
    aget-object v6, v6, v7

    .line 78
    .line 79
    invoke-interface {v6}, Llw0;->b()I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    invoke-interface/range {p0 .. p0}, Lmw0;->j()[Llw0;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    aget-object v8, v8, v5

    .line 88
    .line 89
    invoke-interface {v8}, Llw0;->j()I

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    invoke-virtual/range {p2 .. p2}, Landroid/media/ImageWriter;->dequeueInputImage()Landroid/media/Image;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    if-nez v9, :cond_4

    .line 98
    .line 99
    :cond_3
    move-object v1, v2

    .line 100
    goto/16 :goto_1

    .line 101
    .line 102
    :cond_4
    invoke-interface/range {p0 .. p0}, Lmw0;->j()[Llw0;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    aget-object v10, v10, v3

    .line 107
    .line 108
    invoke-interface {v10}, Llw0;->getBuffer()Ljava/nio/ByteBuffer;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    invoke-interface/range {p0 .. p0}, Lmw0;->j()[Llw0;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    aget-object v11, v11, v5

    .line 117
    .line 118
    invoke-interface {v11}, Llw0;->getBuffer()Ljava/nio/ByteBuffer;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    invoke-interface/range {p0 .. p0}, Lmw0;->j()[Llw0;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    aget-object v12, v12, v7

    .line 127
    .line 128
    invoke-interface {v12}, Llw0;->getBuffer()Ljava/nio/ByteBuffer;

    .line 129
    .line 130
    .line 131
    move-result-object v12

    .line 132
    invoke-virtual {v9}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    aget-object v13, v13, v3

    .line 137
    .line 138
    invoke-virtual {v13}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    .line 139
    .line 140
    .line 141
    move-result-object v13

    .line 142
    invoke-virtual {v9}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 143
    .line 144
    .line 145
    move-result-object v14

    .line 146
    aget-object v14, v14, v3

    .line 147
    .line 148
    invoke-virtual {v14}, Landroid/media/Image$Plane;->getRowStride()I

    .line 149
    .line 150
    .line 151
    move-result v14

    .line 152
    invoke-virtual {v9}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 153
    .line 154
    .line 155
    move-result-object v15

    .line 156
    aget-object v3, v15, v3

    .line 157
    .line 158
    invoke-virtual {v3}, Landroid/media/Image$Plane;->getPixelStride()I

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    invoke-virtual {v9}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 163
    .line 164
    .line 165
    move-result-object v15

    .line 166
    aget-object v15, v15, v5

    .line 167
    .line 168
    invoke-virtual {v15}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    .line 169
    .line 170
    .line 171
    move-result-object v15

    .line 172
    invoke-virtual {v9}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 173
    .line 174
    .line 175
    move-result-object v16

    .line 176
    aget-object v16, v16, v5

    .line 177
    .line 178
    invoke-virtual/range {v16 .. v16}, Landroid/media/Image$Plane;->getRowStride()I

    .line 179
    .line 180
    .line 181
    move-result v16

    .line 182
    invoke-virtual {v9}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 183
    .line 184
    .line 185
    move-result-object v17

    .line 186
    aget-object v17, v17, v5

    .line 187
    .line 188
    invoke-virtual/range {v17 .. v17}, Landroid/media/Image$Plane;->getPixelStride()I

    .line 189
    .line 190
    .line 191
    move-result v17

    .line 192
    invoke-virtual {v9}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 193
    .line 194
    .line 195
    move-result-object v18

    .line 196
    aget-object v18, v18, v7

    .line 197
    .line 198
    invoke-virtual/range {v18 .. v18}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    .line 199
    .line 200
    .line 201
    move-result-object v18

    .line 202
    invoke-virtual {v9}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 203
    .line 204
    .line 205
    move-result-object v19

    .line 206
    aget-object v19, v19, v7

    .line 207
    .line 208
    invoke-virtual/range {v19 .. v19}, Landroid/media/Image$Plane;->getRowStride()I

    .line 209
    .line 210
    .line 211
    move-result v19

    .line 212
    invoke-virtual {v9}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 213
    .line 214
    .line 215
    move-result-object v22

    .line 216
    aget-object v7, v22, v7

    .line 217
    .line 218
    invoke-virtual {v7}, Landroid/media/Image$Plane;->getPixelStride()I

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    move/from16 v22, v0

    .line 223
    .line 224
    move-object/from16 v24, v2

    .line 225
    .line 226
    move-object v0, v9

    .line 227
    move-object v5, v12

    .line 228
    move v9, v14

    .line 229
    move/from16 v12, v16

    .line 230
    .line 231
    move-object/from16 v14, v18

    .line 232
    .line 233
    move-object/from16 v18, p4

    .line 234
    .line 235
    move v2, v1

    .line 236
    move/from16 v16, v7

    .line 237
    .line 238
    move v7, v8

    .line 239
    move-object v1, v10

    .line 240
    move-object v8, v13

    .line 241
    move/from16 v13, v17

    .line 242
    .line 243
    move-object/from16 v17, p3

    .line 244
    .line 245
    move v10, v3

    .line 246
    move-object v3, v11

    .line 247
    move-object v11, v15

    .line 248
    move/from16 v15, v19

    .line 249
    .line 250
    move-object/from16 v19, p5

    .line 251
    .line 252
    invoke-static/range {v1 .. v22}, Landroidx/camera/core/ImageProcessingUtil;->nativeRotateYUV(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;III)I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-eqz v1, :cond_5

    .line 257
    .line 258
    move-object/from16 v1, v24

    .line 259
    .line 260
    goto :goto_1

    .line 261
    :cond_5
    move-object/from16 v1, p2

    .line 262
    .line 263
    invoke-virtual {v1, v0}, Landroid/media/ImageWriter;->queueInputImage(Landroid/media/Image;)V

    .line 264
    .line 265
    .line 266
    invoke-interface/range {p1 .. p1}, Low0;->acquireLatestImage()Lmw0;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    if-nez v0, :cond_6

    .line 271
    .line 272
    const-string v0, "YUV rotation acquireLatestImage failure"

    .line 273
    .line 274
    move-object/from16 v1, v24

    .line 275
    .line 276
    invoke-static {v1, v0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    return-object v23

    .line 280
    :cond_6
    new-instance v1, Lvv0;

    .line 281
    .line 282
    invoke-direct {v1, v0}, Lvv0;-><init>(Lmw0;)V

    .line 283
    .line 284
    .line 285
    new-instance v2, Lkw0;

    .line 286
    .line 287
    const/4 v4, 0x1

    .line 288
    move-object/from16 v3, p0

    .line 289
    .line 290
    invoke-direct {v2, v0, v3, v4}, Lkw0;-><init>(Lmw0;Lmw0;I)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1, v2}, Lcm0;->c(Lbm0;)V

    .line 294
    .line 295
    .line 296
    return-object v1

    .line 297
    :goto_1
    const-string v0, "rotate YUV failure"

    .line 298
    .line 299
    invoke-static {v1, v0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    return-object v23
.end method

.method public static f([BLandroid/view/Surface;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Landroidx/camera/core/ImageProcessingUtil;->nativeWriteJpegToSurface([BLandroid/view/Surface;)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const-string p0, "ImageProcessingUtil"

    .line 11
    .line 12
    const-string p1, "Failed to enqueue JPEG image."

    .line 13
    .line 14
    invoke-static {p0, p1}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method private static native nativeConvertAndroid420ToABGR(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;IIILandroid/view/Surface;Ljava/nio/ByteBuffer;IIIIII)I
.end method

.method private static native nativeCopyBetweenByteBufferAndBitmap(Landroid/graphics/Bitmap;Ljava/nio/ByteBuffer;IIIIZ)I
.end method

.method private static native nativeRotateYUV(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;III)I
.end method

.method private static native nativeShiftPixel(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;IIIIIIII)I
.end method

.method private static native nativeWriteJpegToSurface([BLandroid/view/Surface;)I
.end method

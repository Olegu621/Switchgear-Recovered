.class public abstract Lrv0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lnw0;


# instance fields
.field public U:Landroid/graphics/Rect;

.field public V:Landroid/graphics/Rect;

.field public W:Landroid/graphics/Matrix;

.field public X:Landroid/graphics/Matrix;

.field public Y:Ljava/nio/ByteBuffer;

.field public Z:Ljava/nio/ByteBuffer;

.field public a:Lx6;

.field public a0:Ljava/nio/ByteBuffer;

.field public volatile b:I

.field public b0:Ljava/nio/ByteBuffer;

.field public volatile c:I

.field public final c0:Ljava/lang/Object;

.field public volatile d:I

.field public d0:Z

.field public volatile e:Z

.field public volatile f:Z

.field public i:Ljava/util/concurrent/Executor;

.field public v:Lir;

.field public w:Landroid/media/ImageWriter;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lrv0;->d:I

    .line 6
    .line 7
    new-instance v1, Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lrv0;->U:Landroid/graphics/Rect;

    .line 13
    .line 14
    new-instance v1, Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lrv0;->V:Landroid/graphics/Rect;

    .line 20
    .line 21
    new-instance v1, Landroid/graphics/Matrix;

    .line 22
    .line 23
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lrv0;->W:Landroid/graphics/Matrix;

    .line 27
    .line 28
    new-instance v1, Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lrv0;->X:Landroid/graphics/Matrix;

    .line 34
    .line 35
    new-instance v1, Ljava/lang/Object;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v1, p0, Lrv0;->c0:Ljava/lang/Object;

    .line 41
    .line 42
    iput-boolean v0, p0, Lrv0;->d0:Z

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public abstract a(Low0;)Lmw0;
.end method

.method public final b(Lmw0;)Ls81;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-boolean v0, v1, Lrv0;->e:Z

    .line 6
    .line 7
    const/4 v9, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget v0, v1, Lrv0;->b:I

    .line 11
    .line 12
    move v8, v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v8, v9

    .line 15
    :goto_0
    iget-object v3, v1, Lrv0;->c0:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v3

    .line 18
    :try_start_0
    iget-object v10, v1, Lrv0;->i:Ljava/util/concurrent/Executor;

    .line 19
    .line 20
    iget-object v0, v1, Lrv0;->a:Lx6;

    .line 21
    .line 22
    iget-boolean v4, v1, Lrv0;->e:Z

    .line 23
    .line 24
    const/4 v11, 0x1

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    iget v4, v1, Lrv0;->c:I

    .line 28
    .line 29
    if-eq v8, v4, :cond_1

    .line 30
    .line 31
    move v12, v11

    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    move-object v14, v3

    .line 35
    goto/16 :goto_7

    .line 36
    .line 37
    :cond_1
    move v12, v9

    .line 38
    :goto_1
    if-eqz v12, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1, v2, v8}, Lrv0;->h(Lmw0;I)V

    .line 41
    .line 42
    .line 43
    :cond_2
    iget-boolean v4, v1, Lrv0;->e:Z

    .line 44
    .line 45
    if-eqz v4, :cond_3

    .line 46
    .line 47
    invoke-virtual/range {p0 .. p1}, Lrv0;->d(Lmw0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    :cond_3
    move-object v4, v3

    .line 51
    :try_start_1
    iget-object v3, v1, Lrv0;->v:Lir;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 52
    .line 53
    move-object v5, v4

    .line 54
    :try_start_2
    iget-object v4, v1, Lrv0;->w:Landroid/media/ImageWriter;

    .line 55
    .line 56
    iget-object v6, v1, Lrv0;->Y:Ljava/nio/ByteBuffer;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 57
    .line 58
    move-object v7, v5

    .line 59
    :try_start_3
    iget-object v5, v1, Lrv0;->Z:Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    iget-object v13, v1, Lrv0;->a0:Ljava/nio/ByteBuffer;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 62
    .line 63
    move-object v14, v7

    .line 64
    :try_start_4
    iget-object v7, v1, Lrv0;->b0:Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    monitor-exit v14
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 67
    if-eqz v0, :cond_a

    .line 68
    .line 69
    if-eqz v10, :cond_a

    .line 70
    .line 71
    iget-boolean v14, v1, Lrv0;->d0:Z

    .line 72
    .line 73
    if-eqz v14, :cond_a

    .line 74
    .line 75
    if-eqz v3, :cond_6

    .line 76
    .line 77
    iget v14, v1, Lrv0;->d:I

    .line 78
    .line 79
    const/4 v15, 0x2

    .line 80
    if-ne v14, v15, :cond_4

    .line 81
    .line 82
    iget-boolean v4, v1, Lrv0;->f:Z

    .line 83
    .line 84
    invoke-static {v2, v3, v6, v8, v4}, Landroidx/camera/core/ImageProcessingUtil;->b(Lmw0;Low0;Ljava/nio/ByteBuffer;IZ)Lvv0;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    :goto_2
    move-object v2, v3

    .line 89
    goto :goto_3

    .line 90
    :cond_4
    iget v6, v1, Lrv0;->d:I

    .line 91
    .line 92
    if-ne v6, v11, :cond_6

    .line 93
    .line 94
    iget-boolean v6, v1, Lrv0;->f:Z

    .line 95
    .line 96
    if-eqz v6, :cond_5

    .line 97
    .line 98
    invoke-static {v2}, Landroidx/camera/core/ImageProcessingUtil;->a(Lmw0;)V

    .line 99
    .line 100
    .line 101
    :cond_5
    if-eqz v4, :cond_6

    .line 102
    .line 103
    if-eqz v5, :cond_6

    .line 104
    .line 105
    if-eqz v13, :cond_6

    .line 106
    .line 107
    if-eqz v7, :cond_6

    .line 108
    .line 109
    move-object v6, v13

    .line 110
    invoke-static/range {v2 .. v8}, Landroidx/camera/core/ImageProcessingUtil;->e(Lmw0;Low0;Landroid/media/ImageWriter;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)Lvv0;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    goto :goto_2

    .line 115
    :cond_6
    const/4 v2, 0x0

    .line 116
    :goto_3
    if-nez v2, :cond_7

    .line 117
    .line 118
    move v9, v11

    .line 119
    :cond_7
    if-eqz v9, :cond_8

    .line 120
    .line 121
    move-object/from16 v4, p1

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_8
    move-object v4, v2

    .line 125
    :goto_4
    new-instance v5, Landroid/graphics/Rect;

    .line 126
    .line 127
    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 128
    .line 129
    .line 130
    new-instance v3, Landroid/graphics/Matrix;

    .line 131
    .line 132
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 133
    .line 134
    .line 135
    iget-object v2, v1, Lrv0;->c0:Ljava/lang/Object;

    .line 136
    .line 137
    monitor-enter v2

    .line 138
    if-eqz v12, :cond_9

    .line 139
    .line 140
    if-nez v9, :cond_9

    .line 141
    .line 142
    :try_start_5
    invoke-interface/range {p1 .. p1}, Lmw0;->getWidth()I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    invoke-interface/range {p1 .. p1}, Lmw0;->getHeight()I

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    invoke-interface {v4}, Lmw0;->getWidth()I

    .line 151
    .line 152
    .line 153
    move-result v9

    .line 154
    invoke-interface {v4}, Lmw0;->getHeight()I

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    invoke-virtual {v1, v6, v7, v9, v11}, Lrv0;->g(IIII)V

    .line 159
    .line 160
    .line 161
    goto :goto_5

    .line 162
    :catchall_1
    move-exception v0

    .line 163
    goto :goto_6

    .line 164
    :cond_9
    :goto_5
    iput v8, v1, Lrv0;->c:I

    .line 165
    .line 166
    iget-object v6, v1, Lrv0;->V:Landroid/graphics/Rect;

    .line 167
    .line 168
    invoke-virtual {v5, v6}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 169
    .line 170
    .line 171
    iget-object v6, v1, Lrv0;->X:Landroid/graphics/Matrix;

    .line 172
    .line 173
    invoke-virtual {v3, v6}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 174
    .line 175
    .line 176
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 177
    new-instance v7, Lum;

    .line 178
    .line 179
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 180
    .line 181
    .line 182
    new-instance v2, Lu32;

    .line 183
    .line 184
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 185
    .line 186
    .line 187
    iput-object v2, v7, Lum;->c:Lu32;

    .line 188
    .line 189
    new-instance v8, Lxm;

    .line 190
    .line 191
    invoke-direct {v8, v7}, Lxm;-><init>(Lum;)V

    .line 192
    .line 193
    .line 194
    iput-object v8, v7, Lum;->b:Lxm;

    .line 195
    .line 196
    const-class v2, Len;

    .line 197
    .line 198
    iput-object v2, v7, Lum;->a:Ljava/lang/Object;

    .line 199
    .line 200
    move-object v6, v0

    .line 201
    :try_start_6
    new-instance v0, Lqv0;

    .line 202
    .line 203
    move-object/from16 v2, p1

    .line 204
    .line 205
    invoke-direct/range {v0 .. v7}, Lqv0;-><init>(Lrv0;Lmw0;Landroid/graphics/Matrix;Lmw0;Landroid/graphics/Rect;Lx6;Lum;)V

    .line 206
    .line 207
    .line 208
    invoke-interface {v10, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 209
    .line 210
    .line 211
    const-string v0, "analyzeImage"

    .line 212
    .line 213
    iput-object v0, v7, Lum;->a:Ljava/lang/Object;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 214
    .line 215
    return-object v8

    .line 216
    :catch_0
    move-exception v0

    .line 217
    invoke-virtual {v8, v0}, Lxm;->b(Ljava/lang/Throwable;)Z

    .line 218
    .line 219
    .line 220
    return-object v8

    .line 221
    :goto_6
    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 222
    throw v0

    .line 223
    :cond_a
    new-instance v0, Lkq1;

    .line 224
    .line 225
    const-string v1, "No analyzer or executor currently set."

    .line 226
    .line 227
    invoke-direct {v0, v1}, Lkq1;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    new-instance v1, Ltw0;

    .line 231
    .line 232
    invoke-direct {v1, v0, v11}, Ltw0;-><init>(Ljava/lang/Object;I)V

    .line 233
    .line 234
    .line 235
    return-object v1

    .line 236
    :catchall_2
    move-exception v0

    .line 237
    goto :goto_7

    .line 238
    :catchall_3
    move-exception v0

    .line 239
    move-object v14, v7

    .line 240
    goto :goto_7

    .line 241
    :catchall_4
    move-exception v0

    .line 242
    move-object v14, v5

    .line 243
    goto :goto_7

    .line 244
    :catchall_5
    move-exception v0

    .line 245
    move-object v14, v4

    .line 246
    :goto_7
    :try_start_8
    monitor-exit v14
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 247
    throw v0
.end method

.method public abstract c()V
.end method

.method public final d(Lmw0;)V
    .locals 3

    .line 1
    iget v0, p0, Lrv0;->d:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_3

    .line 5
    .line 6
    iget-object v0, p0, Lrv0;->Z:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p1}, Lmw0;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-interface {p1}, Lmw0;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    mul-int/2addr v1, v0

    .line 19
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lrv0;->Z:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lrv0;->Z:Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lrv0;->a0:Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-interface {p1}, Lmw0;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-interface {p1}, Lmw0;->getHeight()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    mul-int/2addr v2, v0

    .line 44
    div-int/lit8 v2, v2, 0x4

    .line 45
    .line 46
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Lrv0;->a0:Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    :cond_1
    iget-object v0, p0, Lrv0;->a0:Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lrv0;->b0:Ljava/nio/ByteBuffer;

    .line 58
    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    invoke-interface {p1}, Lmw0;->getWidth()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-interface {p1}, Lmw0;->getHeight()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    mul-int/2addr p1, v0

    .line 70
    div-int/lit8 p1, p1, 0x4

    .line 71
    .line 72
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object p1, p0, Lrv0;->b0:Ljava/nio/ByteBuffer;

    .line 77
    .line 78
    :cond_2
    iget-object p0, p0, Lrv0;->b0:Ljava/nio/ByteBuffer;

    .line 79
    .line 80
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_3
    iget v0, p0, Lrv0;->d:I

    .line 85
    .line 86
    const/4 v1, 0x2

    .line 87
    if-ne v0, v1, :cond_4

    .line 88
    .line 89
    iget-object v0, p0, Lrv0;->Y:Ljava/nio/ByteBuffer;

    .line 90
    .line 91
    if-nez v0, :cond_4

    .line 92
    .line 93
    invoke-interface {p1}, Lmw0;->getWidth()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    invoke-interface {p1}, Lmw0;->getHeight()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    mul-int/2addr p1, v0

    .line 102
    mul-int/lit8 p1, p1, 0x4

    .line 103
    .line 104
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iput-object p1, p0, Lrv0;->Y:Ljava/nio/ByteBuffer;

    .line 109
    .line 110
    :cond_4
    return-void
.end method

.method public abstract e(Lmw0;)V
.end method

.method public final f(Low0;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lrv0;->a(Low0;)Lmw0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lrv0;->e(Lmw0;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void

    .line 11
    :catch_0
    move-exception p0

    .line 12
    const-string p1, "ImageAnalysisAnalyzer"

    .line 13
    .line 14
    const-string v0, "Failed to acquire image."

    .line 15
    .line 16
    invoke-static {p1, v0, p0}, Lhu0;->U(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final g(IIII)V
    .locals 4

    .line 1
    iget v0, p0, Lrv0;->b:I

    .line 2
    .line 3
    new-instance v1, Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 6
    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    new-instance v2, Landroid/graphics/RectF;

    .line 11
    .line 12
    int-to-float p1, p1

    .line 13
    int-to-float p2, p2

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {v2, v3, v3, p1, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 16
    .line 17
    .line 18
    sget-object p1, Lcr2;->a:Landroid/graphics/RectF;

    .line 19
    .line 20
    sget-object p2, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    .line 21
    .line 22
    invoke-virtual {v1, v2, p1, p2}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 23
    .line 24
    .line 25
    int-to-float v0, v0

    .line 26
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 27
    .line 28
    .line 29
    new-instance v0, Landroid/graphics/RectF;

    .line 30
    .line 31
    int-to-float p3, p3

    .line 32
    int-to-float p4, p4

    .line 33
    invoke-direct {v0, v3, v3, p3, p4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 34
    .line 35
    .line 36
    new-instance p3, Landroid/graphics/Matrix;

    .line 37
    .line 38
    invoke-direct {p3}, Landroid/graphics/Matrix;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p3, p1, v0, p2}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-object p1, p0, Lrv0;->U:Landroid/graphics/Rect;

    .line 48
    .line 49
    new-instance p2, Landroid/graphics/RectF;

    .line 50
    .line 51
    invoke-direct {p2, p1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 55
    .line 56
    .line 57
    new-instance p1, Landroid/graphics/Rect;

    .line 58
    .line 59
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2, p1}, Landroid/graphics/RectF;->round(Landroid/graphics/Rect;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lrv0;->V:Landroid/graphics/Rect;

    .line 66
    .line 67
    iget-object p1, p0, Lrv0;->X:Landroid/graphics/Matrix;

    .line 68
    .line 69
    iget-object p0, p0, Lrv0;->W:Landroid/graphics/Matrix;

    .line 70
    .line 71
    invoke-virtual {p1, p0, v1}, Landroid/graphics/Matrix;->setConcat(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Z

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final h(Lmw0;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lrv0;->v:Lir;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_4

    .line 6
    :cond_0
    invoke-virtual {v0}, Lir;->j()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Lmw0;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-interface {p1}, Lmw0;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget-object v1, p0, Lrv0;->v:Lir;

    .line 18
    .line 19
    invoke-virtual {v1}, Lir;->a()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v2, p0, Lrv0;->v:Lir;

    .line 24
    .line 25
    invoke-virtual {v2}, Lir;->g()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/16 v3, 0x5a

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    if-eq p2, v3, :cond_2

    .line 33
    .line 34
    const/16 v3, 0x10e

    .line 35
    .line 36
    if-ne p2, v3, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 p2, 0x0

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    :goto_0
    move p2, v4

    .line 42
    :goto_1
    if-eqz p2, :cond_3

    .line 43
    .line 44
    move v3, p1

    .line 45
    goto :goto_2

    .line 46
    :cond_3
    move v3, v0

    .line 47
    :goto_2
    if-eqz p2, :cond_4

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_4
    move v0, p1

    .line 51
    :goto_3
    new-instance p1, Lir;

    .line 52
    .line 53
    invoke-static {v3, v0, v1, v2}, Li13;->j(IIII)Lk8;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-direct {p1, p2}, Lir;-><init>(Low0;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lrv0;->v:Lir;

    .line 61
    .line 62
    iget p1, p0, Lrv0;->d:I

    .line 63
    .line 64
    if-ne p1, v4, :cond_6

    .line 65
    .line 66
    iget-object p1, p0, Lrv0;->w:Landroid/media/ImageWriter;

    .line 67
    .line 68
    if-eqz p1, :cond_5

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/media/ImageWriter;->close()V

    .line 71
    .line 72
    .line 73
    :cond_5
    iget-object p1, p0, Lrv0;->v:Lir;

    .line 74
    .line 75
    invoke-virtual {p1}, Lir;->getSurface()Landroid/view/Surface;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget-object p2, p0, Lrv0;->v:Lir;

    .line 80
    .line 81
    invoke-virtual {p2}, Lir;->g()I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    invoke-static {p1, p2}, Landroid/media/ImageWriter;->newInstance(Landroid/view/Surface;I)Landroid/media/ImageWriter;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iput-object p1, p0, Lrv0;->w:Landroid/media/ImageWriter;

    .line 90
    .line 91
    :cond_6
    :goto_4
    return-void
.end method

.class public final Lmj2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final U:Lxm;

.field public final V:Lum;

.field public final a:Ljava/lang/Object;

.field public final b:Landroid/view/Surface;

.field public final c:I

.field public final d:Landroid/util/Size;

.field public final e:[F

.field public f:Lc00;

.field public i:Ljava/util/concurrent/Executor;

.field public v:Z

.field public w:Z


# direct methods
.method public constructor <init>(Landroid/view/Surface;ILandroid/util/Size;Lsg;Lsg;)V
    .locals 6

    .line 1
    const-string v0, "SurfaceOutputImpl close future complete"

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Lmj2;->a:Ljava/lang/Object;

    .line 12
    .line 13
    const/16 v1, 0x10

    .line 14
    .line 15
    new-array v2, v1, [F

    .line 16
    .line 17
    iput-object v2, p0, Lmj2;->e:[F

    .line 18
    .line 19
    new-array v3, v1, [F

    .line 20
    .line 21
    new-array v4, v1, [F

    .line 22
    .line 23
    new-array v1, v1, [F

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    iput-boolean v5, p0, Lmj2;->v:Z

    .line 27
    .line 28
    iput-boolean v5, p0, Lmj2;->w:Z

    .line 29
    .line 30
    iput-object p1, p0, Lmj2;->b:Landroid/view/Surface;

    .line 31
    .line 32
    iput p2, p0, Lmj2;->c:I

    .line 33
    .line 34
    iput-object p3, p0, Lmj2;->d:Landroid/util/Size;

    .line 35
    .line 36
    invoke-static {v2, v4, p4}, Lmj2;->c([F[FLsg;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v3, v1, p5}, Lmj2;->c([F[FLsg;)V

    .line 40
    .line 41
    .line 42
    new-instance p1, Lum;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    new-instance p2, Lu32;

    .line 48
    .line 49
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p2, p1, Lum;->c:Lu32;

    .line 53
    .line 54
    new-instance p2, Lxm;

    .line 55
    .line 56
    invoke-direct {p2, p1}, Lxm;-><init>(Lum;)V

    .line 57
    .line 58
    .line 59
    iput-object p2, p1, Lum;->b:Lxm;

    .line 60
    .line 61
    :try_start_0
    iput-object p1, p0, Lmj2;->V:Lum;

    .line 62
    .line 63
    iput-object v0, p1, Lum;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catch_0
    move-exception p1

    .line 67
    invoke-virtual {p2, p1}, Lxm;->b(Ljava/lang/Throwable;)Z

    .line 68
    .line 69
    .line 70
    :goto_0
    iput-object p2, p0, Lmj2;->U:Lxm;

    .line 71
    .line 72
    return-void
.end method

.method public static c([F[FLsg;)V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 3
    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, p2, Lsg;->a:Landroid/util/Size;

    .line 9
    .line 10
    iget-boolean v2, p2, Lsg;->e:Z

    .line 11
    .line 12
    iget v3, p2, Lsg;->d:I

    .line 13
    .line 14
    invoke-static {p0}, Lw11;->A([F)V

    .line 15
    .line 16
    .line 17
    int-to-float v4, v3

    .line 18
    invoke-static {v4, p0}, Lw11;->z(F[F)V

    .line 19
    .line 20
    .line 21
    const/high16 v4, -0x40800000    # -1.0f

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    const/high16 v6, 0x3f800000    # 1.0f

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-static {p0, v0, v6, v5, v5}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    .line 29
    .line 30
    .line 31
    invoke-static {p0, v0, v4, v6, v6}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-static {v1, v3}, Lcr2;->e(Landroid/util/Size;I)Landroid/util/Size;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    new-instance v8, Landroid/graphics/RectF;

    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    int-to-float v9, v9

    .line 45
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    int-to-float v1, v1

    .line 50
    invoke-direct {v8, v5, v5, v9, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 51
    .line 52
    .line 53
    new-instance v1, Landroid/graphics/RectF;

    .line 54
    .line 55
    invoke-virtual {v7}, Landroid/util/Size;->getWidth()I

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    int-to-float v9, v9

    .line 60
    invoke-virtual {v7}, Landroid/util/Size;->getHeight()I

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    int-to-float v10, v10

    .line 65
    invoke-direct {v1, v5, v5, v9, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 66
    .line 67
    .line 68
    invoke-static {v8, v1, v3, v2}, Lcr2;->a(Landroid/graphics/RectF;Landroid/graphics/RectF;IZ)Landroid/graphics/Matrix;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v2, Landroid/graphics/RectF;

    .line 73
    .line 74
    iget-object v3, p2, Lsg;->b:Landroid/graphics/Rect;

    .line 75
    .line 76
    invoke-direct {v2, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 80
    .line 81
    .line 82
    iget v1, v2, Landroid/graphics/RectF;->left:F

    .line 83
    .line 84
    invoke-virtual {v7}, Landroid/util/Size;->getWidth()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    int-to-float v3, v3

    .line 89
    div-float/2addr v1, v3

    .line 90
    invoke-virtual {v7}, Landroid/util/Size;->getHeight()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    int-to-float v3, v3

    .line 95
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    sub-float/2addr v3, v8

    .line 100
    iget v8, v2, Landroid/graphics/RectF;->top:F

    .line 101
    .line 102
    sub-float/2addr v3, v8

    .line 103
    invoke-virtual {v7}, Landroid/util/Size;->getHeight()I

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    int-to-float v8, v8

    .line 108
    div-float/2addr v3, v8

    .line 109
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    invoke-virtual {v7}, Landroid/util/Size;->getWidth()I

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    int-to-float v9, v9

    .line 118
    div-float/2addr v8, v9

    .line 119
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    invoke-virtual {v7}, Landroid/util/Size;->getHeight()I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    int-to-float v7, v7

    .line 128
    div-float/2addr v2, v7

    .line 129
    invoke-static {p0, v0, v1, v3, v5}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    .line 130
    .line 131
    .line 132
    invoke-static {p0, v0, v8, v2, v6}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    .line 133
    .line 134
    .line 135
    iget-object p2, p2, Lsg;->c:Lzp;

    .line 136
    .line 137
    invoke-static {p1, v0}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 138
    .line 139
    .line 140
    invoke-static {p1}, Lw11;->A([F)V

    .line 141
    .line 142
    .line 143
    if-eqz p2, :cond_2

    .line 144
    .line 145
    invoke-interface {p2}, Lzp;->k()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    const-string v2, "Camera has no transform."

    .line 150
    .line 151
    invoke-static {v2, v1}, Lde3;->j(Ljava/lang/String;Z)V

    .line 152
    .line 153
    .line 154
    invoke-interface {p2}, Lzp;->m()Lxp;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-interface {v1}, Lxp;->a()I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    int-to-float v1, v1

    .line 163
    invoke-static {v1, p1}, Lw11;->z(F[F)V

    .line 164
    .line 165
    .line 166
    invoke-interface {p2}, Lzp;->m()Lxp;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-interface {p2}, Lxp;->d()I

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    if-nez p2, :cond_2

    .line 175
    .line 176
    invoke-static {p1, v0, v6, v5, v5}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    .line 177
    .line 178
    .line 179
    invoke-static {p1, v0, v4, v6, v6}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    .line 180
    .line 181
    .line 182
    :cond_2
    invoke-static {p1, v0, p1, v0}, Landroid/opengl/Matrix;->invertM([FI[FI)Z

    .line 183
    .line 184
    .line 185
    const/4 v10, 0x0

    .line 186
    const/4 v12, 0x0

    .line 187
    const/4 v8, 0x0

    .line 188
    move-object v11, p0

    .line 189
    move-object v7, p0

    .line 190
    move-object v9, p1

    .line 191
    invoke-static/range {v7 .. v12}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 192
    .line 193
    .line 194
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lmj2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lmj2;->w:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Lmj2;->w:Z

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    iget-object p0, p0, Lmj2;->V:Lum;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, v0}, Lum;->a(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p0
.end method

.method public final f(Lnt0;Lc00;)Landroid/view/Surface;
    .locals 1

    .line 1
    iget-object v0, p0, Lmj2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, Lmj2;->i:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Lmj2;->f:Lc00;

    .line 7
    .line 8
    iget-boolean p1, p0, Lmj2;->v:Z

    .line 9
    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lmj2;->g()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object p0, p0, Lmj2;->b:Landroid/view/Surface;

    .line 17
    .line 18
    return-object p0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p0
.end method

.method public final g()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lmj2;->a:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    iget-object v2, p0, Lmj2;->i:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    iget-object v2, p0, Lmj2;->f:Lc00;

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-boolean v3, p0, Lmj2;->w:Z

    .line 19
    .line 20
    if-nez v3, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lmj2;->i:Ljava/util/concurrent/Executor;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    iput-boolean v3, p0, Lmj2;->v:Z

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    :goto_0
    const/4 v2, 0x1

    .line 34
    iput-boolean v2, p0, Lmj2;->v:Z

    .line 35
    .line 36
    :cond_2
    const/4 v2, 0x0

    .line 37
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    :try_start_1
    new-instance v1, Lji1;

    .line 41
    .line 42
    const/16 v3, 0xa

    .line 43
    .line 44
    invoke-direct {v1, v3, p0, v0}, Lji1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v2, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catch_0
    const-string p0, "SurfaceOutputImpl"

    .line 52
    .line 53
    invoke-static {p0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    :cond_3
    return-void

    .line 57
    :goto_2
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    throw p0
.end method

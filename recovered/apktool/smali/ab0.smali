.class public final Lab0;
.super Ljq1;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public n:I

.field public o:I

.field public final p:Lxt0;

.field public final q:Lxt0;


# direct methods
.method public constructor <init>(Lxt0;Lxt0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljq1;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lab0;->n:I

    .line 6
    .line 7
    iput v0, p0, Lab0;->o:I

    .line 8
    .line 9
    iput-object p1, p0, Lab0;->p:Lxt0;

    .line 10
    .line 11
    iput-object p2, p0, Lab0;->q:Lxt0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final e(Lmb0;)Luf;
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    invoke-super {p0, p1}, Ljq1;->e(Lmb0;)Luf;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Lsp0;->h()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lab0;->n:I

    .line 12
    .line 13
    invoke-static {}, Lsp0;->h()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, Lab0;->o:I

    .line 18
    .line 19
    return-object p1
.end method

.method public final l(JLandroid/view/Surface;Lmj2;Landroid/graphics/SurfaceTexture;Landroid/graphics/SurfaceTexture;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ljq1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lsp0;->d(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Ljq1;->c:Ljava/lang/Thread;

    .line 8
    .line 9
    invoke-static {v0}, Lsp0;->c(Ljava/lang/Thread;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Ljq1;->b:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v0, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-string v2, "The surface is not registered."

    .line 19
    .line 20
    invoke-static {v2, v1}, Lde3;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lgg;

    .line 28
    .line 29
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    sget-object v2, Lsp0;->j:Lgg;

    .line 33
    .line 34
    if-ne v1, v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0, p3}, Ljq1;->b(Landroid/view/Surface;)Lgg;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-nez v1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {v0, p3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :cond_1
    move-object v3, v1

    .line 47
    iget-object v0, v3, Lgg;->a:Landroid/opengl/EGLSurface;

    .line 48
    .line 49
    iget-object v1, p0, Ljq1;->i:Landroid/view/Surface;

    .line 50
    .line 51
    if-eq p3, v1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Ljq1;->f(Landroid/opengl/EGLSurface;)V

    .line 54
    .line 55
    .line 56
    iput-object p3, p0, Ljq1;->i:Landroid/view/Surface;

    .line 57
    .line 58
    :cond_2
    const/high16 v1, 0x3f800000    # 1.0f

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-static {v2, v2, v2, v1}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 62
    .line 63
    .line 64
    const/16 v1, 0x4000

    .line 65
    .line 66
    invoke-static {v1}, Landroid/opengl/GLES20;->glClear(I)V

    .line 67
    .line 68
    .line 69
    iget-object v6, p0, Lab0;->p:Lxt0;

    .line 70
    .line 71
    iget v7, p0, Lab0;->n:I

    .line 72
    .line 73
    move-object v2, p0

    .line 74
    move-object v4, p4

    .line 75
    move-object v5, p5

    .line 76
    invoke-virtual/range {v2 .. v7}, Lab0;->m(Lgg;Lmj2;Landroid/graphics/SurfaceTexture;Lxt0;I)V

    .line 77
    .line 78
    .line 79
    iget-object v6, v2, Lab0;->q:Lxt0;

    .line 80
    .line 81
    iget v7, v2, Lab0;->o:I

    .line 82
    .line 83
    move-object v5, p6

    .line 84
    invoke-virtual/range {v2 .. v7}, Lab0;->m(Lgg;Lmj2;Landroid/graphics/SurfaceTexture;Lxt0;I)V

    .line 85
    .line 86
    .line 87
    iget-object p0, v2, Ljq1;->d:Landroid/opengl/EGLDisplay;

    .line 88
    .line 89
    invoke-static {p0, v0, p1, p2}, Landroid/opengl/EGLExt;->eglPresentationTimeANDROID(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;J)Z

    .line 90
    .line 91
    .line 92
    iget-object p0, v2, Ljq1;->d:Landroid/opengl/EGLDisplay;

    .line 93
    .line 94
    invoke-static {p0, v0}, Landroid/opengl/EGL14;->eglSwapBuffers(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-nez p0, :cond_3

    .line 99
    .line 100
    new-instance p0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string p1, "Failed to swap buffers with EGL error: 0x"

    .line 103
    .line 104
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    const-string p1, "DualOpenGlRenderer"

    .line 123
    .line 124
    invoke-static {p1, p0}, Lhu0;->H0(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    const/4 p0, 0x0

    .line 128
    invoke-virtual {v2, p3, p0}, Ljq1;->i(Landroid/view/Surface;Z)V

    .line 129
    .line 130
    .line 131
    :cond_3
    :goto_0
    return-void
.end method

.method public final m(Lgg;Lmj2;Landroid/graphics/SurfaceTexture;Lxt0;I)V
    .locals 10

    .line 1
    invoke-virtual {p0, p5}, Ljq1;->k(I)V

    .line 2
    .line 3
    .line 4
    iget p5, p1, Lgg;->b:I

    .line 5
    .line 6
    iget p1, p1, Lgg;->c:I

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0, v0, p5, p1}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v0, p5, p1}, Landroid/opengl/GLES20;->glScissor(IIII)V

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x10

    .line 16
    .line 17
    new-array v4, v1, [F

    .line 18
    .line 19
    invoke-virtual {p3, v4}, Landroid/graphics/SurfaceTexture;->getTransformMatrix([F)V

    .line 20
    .line 21
    .line 22
    new-array v2, v1, [F

    .line 23
    .line 24
    iget-object v6, p2, Lmj2;->e:[F

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-static/range {v2 .. v7}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Ljq1;->k:Lqp0;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    instance-of p2, p0, Lrp0;

    .line 38
    .line 39
    const-string p3, "glUniformMatrix4fv"

    .line 40
    .line 41
    const/4 v3, 0x1

    .line 42
    if-eqz p2, :cond_0

    .line 43
    .line 44
    move-object p2, p0

    .line 45
    check-cast p2, Lrp0;

    .line 46
    .line 47
    iget p2, p2, Lrp0;->f:I

    .line 48
    .line 49
    invoke-static {p2, v3, v0, v2, v0}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 50
    .line 51
    .line 52
    invoke-static {p3}, Lsp0;->b(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    new-instance p2, Landroid/util/Size;

    .line 56
    .line 57
    int-to-float v2, p5

    .line 58
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    const/high16 p4, 0x3f800000    # 1.0f

    .line 62
    .line 63
    mul-float/2addr v2, p4

    .line 64
    float-to-int v2, v2

    .line 65
    int-to-float v4, p1

    .line 66
    mul-float/2addr v4, p4

    .line 67
    float-to-int v4, v4

    .line 68
    invoke-direct {p2, v2, v4}, Landroid/util/Size;-><init>(II)V

    .line 69
    .line 70
    .line 71
    new-instance v2, Landroid/util/Size;

    .line 72
    .line 73
    invoke-direct {v2, p5, p1}, Landroid/util/Size;-><init>(II)V

    .line 74
    .line 75
    .line 76
    new-array v6, v1, [F

    .line 77
    .line 78
    invoke-static {v6, v0}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 79
    .line 80
    .line 81
    new-array v8, v1, [F

    .line 82
    .line 83
    invoke-static {v8, v0}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 84
    .line 85
    .line 86
    new-array v4, v1, [F

    .line 87
    .line 88
    invoke-static {v4, v0}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    int-to-float p1, p1

    .line 96
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 97
    .line 98
    .line 99
    move-result p5

    .line 100
    int-to-float p5, p5

    .line 101
    div-float/2addr p1, p5

    .line 102
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    int-to-float p2, p2

    .line 107
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 108
    .line 109
    .line 110
    move-result p5

    .line 111
    int-to-float p5, p5

    .line 112
    div-float/2addr p2, p5

    .line 113
    invoke-static {v6, v0, p1, p2, p4}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    .line 114
    .line 115
    .line 116
    const/4 p1, 0x0

    .line 117
    invoke-static {v8, v0, p1, p1, p1}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    .line 118
    .line 119
    .line 120
    const/4 v7, 0x0

    .line 121
    const/4 v9, 0x0

    .line 122
    const/4 v5, 0x0

    .line 123
    invoke-static/range {v4 .. v9}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 124
    .line 125
    .line 126
    iget p1, p0, Lqp0;->b:I

    .line 127
    .line 128
    invoke-static {p1, v3, v0, v4, v0}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 129
    .line 130
    .line 131
    invoke-static {p3}, Lsp0;->b(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    iget p0, p0, Lqp0;->c:I

    .line 135
    .line 136
    invoke-static {p0, p4}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    .line 137
    .line 138
    .line 139
    const-string p0, "glUniform1f"

    .line 140
    .line 141
    invoke-static {p0}, Lsp0;->b(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    const/16 p0, 0xbe2

    .line 145
    .line 146
    invoke-static {p0}, Landroid/opengl/GLES20;->glEnable(I)V

    .line 147
    .line 148
    .line 149
    const/16 p1, 0x302

    .line 150
    .line 151
    const/16 p2, 0x303

    .line 152
    .line 153
    invoke-static {p1, p2, v3, p2}, Landroid/opengl/GLES20;->glBlendFuncSeparate(IIII)V

    .line 154
    .line 155
    .line 156
    const/4 p1, 0x5

    .line 157
    const/4 p2, 0x4

    .line 158
    invoke-static {p1, v0, p2}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 159
    .line 160
    .line 161
    const-string p1, "glDrawArrays"

    .line 162
    .line 163
    invoke-static {p1}, Lsp0;->b(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-static {p0}, Landroid/opengl/GLES20;->glDisable(I)V

    .line 167
    .line 168
    .line 169
    return-void
.end method

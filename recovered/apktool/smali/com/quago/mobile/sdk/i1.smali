.class public final Lcom/quago/mobile/sdk/i1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/quago/mobile/sdk/q;->a()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput v0, p0, Lcom/quago/mobile/sdk/i1;->a:I

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string v1, "aPosition"

    .line 13
    .line 14
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Lcom/quago/mobile/sdk/i1;->d:I

    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/quago/mobile/sdk/q;->a(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget v0, p0, Lcom/quago/mobile/sdk/i1;->a:I

    .line 24
    .line 25
    const-string v1, "aTextureCoord"

    .line 26
    .line 27
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iput v0, p0, Lcom/quago/mobile/sdk/i1;->e:I

    .line 32
    .line 33
    invoke-static {v0, v1}, Lcom/quago/mobile/sdk/q;->a(ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget v0, p0, Lcom/quago/mobile/sdk/i1;->a:I

    .line 37
    .line 38
    const-string v1, "uMVPMatrix"

    .line 39
    .line 40
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iput v0, p0, Lcom/quago/mobile/sdk/i1;->b:I

    .line 45
    .line 46
    invoke-static {v0, v1}, Lcom/quago/mobile/sdk/q;->a(ILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget v0, p0, Lcom/quago/mobile/sdk/i1;->a:I

    .line 50
    .line 51
    const-string v1, "uTexMatrix"

    .line 52
    .line 53
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iput v0, p0, Lcom/quago/mobile/sdk/i1;->c:I

    .line 58
    .line 59
    invoke-static {v0, v1}, Lcom/quago/mobile/sdk/q;->a(ILjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_0
    const-string p0, "Unable to create program"

    .line 64
    .line 65
    invoke-static {p0}, Lf42;->s(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    throw p0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 124
    iget v0, p0, Lcom/quago/mobile/sdk/i1;->a:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    const/4 v0, -0x1

    .line 125
    iput v0, p0, Lcom/quago/mobile/sdk/i1;->a:I

    return-void
.end method

.method public final a([FLjava/nio/FloatBuffer;III[FLjava/nio/FloatBuffer;II)V
    .locals 10

    .line 1
    const-string v0, "render start"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/quago/mobile/sdk/q;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/quago/mobile/sdk/i1;->a:I

    .line 7
    .line 8
    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 9
    .line 10
    .line 11
    const-string v0, "glUseProgram"

    .line 12
    .line 13
    invoke-static {v0}, Lcom/quago/mobile/sdk/q;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const v0, 0x84c0

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 20
    .line 21
    .line 22
    const/16 v0, 0xde1

    .line 23
    .line 24
    move/from16 v1, p8

    .line 25
    .line 26
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 27
    .line 28
    .line 29
    iget v1, p0, Lcom/quago/mobile/sdk/i1;->b:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-static {v1, v2, v3, p1, v3}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 34
    .line 35
    .line 36
    const-string p1, "glUniformMatrix4fv"

    .line 37
    .line 38
    invoke-static {p1}, Lcom/quago/mobile/sdk/q;->a(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget v1, p0, Lcom/quago/mobile/sdk/i1;->c:I

    .line 42
    .line 43
    move-object/from16 v4, p6

    .line 44
    .line 45
    invoke-static {v1, v2, v3, v4, v3}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Lcom/quago/mobile/sdk/q;->a(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget p1, p0, Lcom/quago/mobile/sdk/i1;->d:I

    .line 52
    .line 53
    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 54
    .line 55
    .line 56
    const-string p1, "glEnableVertexAttribArray"

    .line 57
    .line 58
    invoke-static {p1}, Lcom/quago/mobile/sdk/q;->a(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget v4, p0, Lcom/quago/mobile/sdk/i1;->d:I

    .line 62
    .line 63
    const/16 v6, 0x1406

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    move-object v9, p2

    .line 67
    move v5, p4

    .line 68
    move v8, p5

    .line 69
    invoke-static/range {v4 .. v9}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 70
    .line 71
    .line 72
    const-string p2, "glVertexAttribPointer"

    .line 73
    .line 74
    invoke-static {p2}, Lcom/quago/mobile/sdk/q;->a(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget v1, p0, Lcom/quago/mobile/sdk/i1;->e:I

    .line 78
    .line 79
    invoke-static {v1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Lcom/quago/mobile/sdk/q;->a(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iget v4, p0, Lcom/quago/mobile/sdk/i1;->e:I

    .line 86
    .line 87
    const/4 v5, 0x2

    .line 88
    move-object/from16 v9, p7

    .line 89
    .line 90
    move/from16 v8, p9

    .line 91
    .line 92
    invoke-static/range {v4 .. v9}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 93
    .line 94
    .line 95
    invoke-static {p2}, Lcom/quago/mobile/sdk/q;->a(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const/4 p1, 0x5

    .line 99
    invoke-static {p1, v3, p3}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 100
    .line 101
    .line 102
    const-string p1, "glDrawArrays"

    .line 103
    .line 104
    invoke-static {p1}, Lcom/quago/mobile/sdk/q;->a(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget p1, p0, Lcom/quago/mobile/sdk/i1;->d:I

    .line 108
    .line 109
    invoke-static {p1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 110
    .line 111
    .line 112
    iget p0, p0, Lcom/quago/mobile/sdk/i1;->e:I

    .line 113
    .line 114
    invoke-static {p0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 115
    .line 116
    .line 117
    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 118
    .line 119
    .line 120
    invoke-static {v3}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 121
    .line 122
    .line 123
    return-void
.end method

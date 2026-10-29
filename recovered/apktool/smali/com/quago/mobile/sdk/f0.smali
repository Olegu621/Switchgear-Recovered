.class public final Lcom/quago/mobile/sdk/f0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Landroid/opengl/EGLDisplay;

.field public b:Landroid/opengl/EGLContext;

.field public c:Landroid/opengl/EGLConfig;


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/quago/mobile/sdk/f0;->a:Landroid/opengl/EGLDisplay;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/quago/mobile/sdk/f0;->b:Landroid/opengl/EGLContext;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/quago/mobile/sdk/f0;->c:Landroid/opengl/EGLConfig;

    .line 10
    .line 11
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 12
    .line 13
    iput-object v1, p0, Lcom/quago/mobile/sdk/f0;->a:Landroid/opengl/EGLDisplay;

    .line 14
    .line 15
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 16
    .line 17
    iput-object v1, p0, Lcom/quago/mobile/sdk/f0;->b:Landroid/opengl/EGLContext;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {v2}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iput-object v3, p0, Lcom/quago/mobile/sdk/f0;->a:Landroid/opengl/EGLDisplay;

    .line 25
    .line 26
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 27
    .line 28
    if-eq v3, v4, :cond_3

    .line 29
    .line 30
    const/4 v4, 0x2

    .line 31
    new-array v5, v4, [I

    .line 32
    .line 33
    const/4 v6, 0x1

    .line 34
    invoke-static {v3, v5, v2, v5, v6}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    iget-object v3, p0, Lcom/quago/mobile/sdk/f0;->b:Landroid/opengl/EGLContext;

    .line 41
    .line 42
    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 43
    .line 44
    if-ne v3, v5, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/quago/mobile/sdk/f0;->b()Landroid/opengl/EGLConfig;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    const/16 v0, 0x3098

    .line 53
    .line 54
    const/16 v5, 0x3038

    .line 55
    .line 56
    filled-new-array {v0, v4, v5}, [I

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v4, p0, Lcom/quago/mobile/sdk/f0;->a:Landroid/opengl/EGLDisplay;

    .line 61
    .line 62
    invoke-static {v4, v3, v1, v0, v2}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v1, "eglCreateContext"

    .line 67
    .line 68
    invoke-static {v1}, Lcom/quago/mobile/sdk/f0;->a(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iput-object v3, p0, Lcom/quago/mobile/sdk/f0;->c:Landroid/opengl/EGLConfig;

    .line 72
    .line 73
    iput-object v0, p0, Lcom/quago/mobile/sdk/f0;->b:Landroid/opengl/EGLContext;

    .line 74
    .line 75
    return-void

    .line 76
    :cond_0
    const-string p0, "failed to find a suitable EGLConfig"

    .line 77
    .line 78
    invoke-static {p0}, Lf42;->s(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :cond_1
    return-void

    .line 83
    :cond_2
    iput-object v0, p0, Lcom/quago/mobile/sdk/f0;->a:Landroid/opengl/EGLDisplay;

    .line 84
    .line 85
    const-string p0, "failed to initialize EGL14"

    .line 86
    .line 87
    invoke-static {p0}, Lf42;->s(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v0

    .line 91
    :cond_3
    const-string p0, "failed to get EGL14 display"

    .line 92
    .line 93
    invoke-static {p0}, Lf42;->s(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v0
.end method

.method public static a(Ljava/lang/String;)V
    .locals 2

    .line 38
    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    move-result v0

    const/16 v1, 0x3000

    if-ne v0, v1, :cond_0

    return-void

    .line 39
    :cond_0
    const-string v1, ": EGL error: 0x"

    .line 40
    invoke-static {p0, v1}, Lfm0;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 41
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lio/sentry/u2;->n(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/opengl/EGLSurface;
    .locals 4

    .line 1
    const/16 v0, 0x3056

    .line 2
    .line 3
    const/16 v1, 0x3038

    .line 4
    .line 5
    const/16 v2, 0x3057

    .line 6
    .line 7
    const/16 v3, 0x200

    .line 8
    .line 9
    filled-new-array {v2, v3, v0, v3, v1}, [I

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/quago/mobile/sdk/f0;->a:Landroid/opengl/EGLDisplay;

    .line 14
    .line 15
    iget-object p0, p0, Lcom/quago/mobile/sdk/f0;->c:Landroid/opengl/EGLConfig;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static {v1, p0, v0, v2}, Landroid/opengl/EGL14;->eglCreatePbufferSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;[II)Landroid/opengl/EGLSurface;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string v0, "eglCreatePbufferSurface()"

    .line 23
    .line 24
    invoke-static {v0}, Lcom/quago/mobile/sdk/f0;->a(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    const-string p0, "surface was null"

    .line 31
    .line 32
    invoke-static {p0}, Lf42;->s(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public final a(Landroid/opengl/EGLSurface;)V
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/quago/mobile/sdk/f0;->a:Landroid/opengl/EGLDisplay;

    invoke-static {p0, p1}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    return-void
.end method

.method public final b()Landroid/opengl/EGLConfig;
    .locals 9

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    new-array v2, v0, [I

    .line 4
    .line 5
    fill-array-data v2, :array_0

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    new-array v4, v0, [Landroid/opengl/EGLConfig;

    .line 10
    .line 11
    new-array v7, v0, [I

    .line 12
    .line 13
    iget-object v1, p0, Lcom/quago/mobile/sdk/f0;->a:Landroid/opengl/EGLDisplay;

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-static/range {v1 .. v8}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    aget-object p0, v4, p0

    .line 29
    .line 30
    return-object p0

    .line 31
    :array_0
    .array-data 4
        0x3024
        0x8
        0x3023
        0x8
        0x3022
        0x8
        0x3021
        0x8
        0x3040
        0x4
        0x3038
        0x0
        0x3038
    .end array-data
.end method

.method public final b(Landroid/opengl/EGLSurface;)V
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/quago/mobile/sdk/f0;->a:Landroid/opengl/EGLDisplay;

    iget-object p0, p0, Lcom/quago/mobile/sdk/f0;->b:Landroid/opengl/EGLContext;

    invoke-static {v0, p1, p1, p0}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    .line 32
    :cond_0
    const-string p0, "failed to eglMakeCurrent()"

    invoke-static {p0}, Lf42;->s(Ljava/lang/String;)V

    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/quago/mobile/sdk/f0;->a:Landroid/opengl/EGLDisplay;

    .line 2
    .line 3
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 8
    .line 9
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 10
    .line 11
    invoke-static {v0, v1, v1, v2}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/quago/mobile/sdk/f0;->a:Landroid/opengl/EGLDisplay;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/quago/mobile/sdk/f0;->b:Landroid/opengl/EGLContext;

    .line 17
    .line 18
    invoke-static {v0, v1}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 19
    .line 20
    .line 21
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/quago/mobile/sdk/f0;->a:Landroid/opengl/EGLDisplay;

    .line 25
    .line 26
    invoke-static {v0}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 30
    .line 31
    iput-object v0, p0, Lcom/quago/mobile/sdk/f0;->a:Landroid/opengl/EGLDisplay;

    .line 32
    .line 33
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 34
    .line 35
    iput-object v0, p0, Lcom/quago/mobile/sdk/f0;->b:Landroid/opengl/EGLContext;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lcom/quago/mobile/sdk/f0;->c:Landroid/opengl/EGLConfig;

    .line 39
    .line 40
    return-void
.end method

.class public final Lxq;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lrm2;


# static fields
.field public static final U:Llf;

.field public static final V:Llf;

.field public static final b:Llf;

.field public static final c:Llf;

.field public static final d:Llf;

.field public static final e:Llf;

.field public static final f:Llf;

.field public static final i:Llf;

.field public static final v:Llf;

.field public static final w:Llf;


# instance fields
.field public final a:Lnq1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Llf;

    .line 2
    .line 3
    const-string v1, "camerax.core.appConfig.cameraFactoryProvider"

    .line 4
    .line 5
    const-class v2, Leo;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lxq;->b:Llf;

    .line 12
    .line 13
    new-instance v0, Llf;

    .line 14
    .line 15
    const-string v1, "camerax.core.appConfig.deviceSurfaceManagerProvider"

    .line 16
    .line 17
    const-class v2, Lfo;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lxq;->c:Llf;

    .line 23
    .line 24
    new-instance v0, Llf;

    .line 25
    .line 26
    const-string v1, "camerax.core.appConfig.useCaseConfigFactoryProvider"

    .line 27
    .line 28
    const-class v2, Lgo;

    .line 29
    .line 30
    invoke-direct {v0, v1, v2, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lxq;->d:Llf;

    .line 34
    .line 35
    new-instance v0, Llf;

    .line 36
    .line 37
    const-string v1, "camerax.core.appConfig.cameraExecutor"

    .line 38
    .line 39
    const-class v2, Ljava/util/concurrent/Executor;

    .line 40
    .line 41
    invoke-direct {v0, v1, v2, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lxq;->e:Llf;

    .line 45
    .line 46
    new-instance v0, Llf;

    .line 47
    .line 48
    const-string v1, "camerax.core.appConfig.schedulerHandler"

    .line 49
    .line 50
    const-class v2, Landroid/os/Handler;

    .line 51
    .line 52
    invoke-direct {v0, v1, v2, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lxq;->f:Llf;

    .line 56
    .line 57
    new-instance v0, Llf;

    .line 58
    .line 59
    const-string v1, "camerax.core.appConfig.minimumLoggingLevel"

    .line 60
    .line 61
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 62
    .line 63
    invoke-direct {v0, v1, v2, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 64
    .line 65
    .line 66
    sput-object v0, Lxq;->i:Llf;

    .line 67
    .line 68
    new-instance v0, Llf;

    .line 69
    .line 70
    const-string v1, "camerax.core.appConfig.availableCamerasLimiter"

    .line 71
    .line 72
    const-class v2, Ljq;

    .line 73
    .line 74
    invoke-direct {v0, v1, v2, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 75
    .line 76
    .line 77
    sput-object v0, Lxq;->v:Llf;

    .line 78
    .line 79
    new-instance v0, Llf;

    .line 80
    .line 81
    const-string v1, "camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming"

    .line 82
    .line 83
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 84
    .line 85
    invoke-direct {v0, v1, v2, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 86
    .line 87
    .line 88
    sput-object v0, Lxq;->w:Llf;

    .line 89
    .line 90
    new-instance v0, Llf;

    .line 91
    .line 92
    const-string v1, "camerax.core.appConfig.cameraProviderInitRetryPolicy"

    .line 93
    .line 94
    const-class v2, Ly42;

    .line 95
    .line 96
    invoke-direct {v0, v1, v2, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 97
    .line 98
    .line 99
    sput-object v0, Lxq;->U:Llf;

    .line 100
    .line 101
    new-instance v0, Llf;

    .line 102
    .line 103
    const-string v1, "camerax.core.appConfig.quirksSettings"

    .line 104
    .line 105
    const-class v2, Li02;

    .line 106
    .line 107
    invoke-direct {v0, v1, v2, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 108
    .line 109
    .line 110
    sput-object v0, Lxq;->V:Llf;

    .line 111
    .line 112
    return-void
.end method

.method public constructor <init>(Lnq1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxq;->a:Lnq1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d()Ljq;
    .locals 1

    .line 1
    iget-object p0, p0, Lxq;->a:Lnq1;

    .line 2
    .line 3
    sget-object v0, Lxq;->v:Llf;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0, v0}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    goto :goto_0

    .line 10
    :catch_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    check-cast p0, Ljq;

    .line 12
    .line 13
    return-object p0
.end method

.method public final j()Leo;
    .locals 1

    .line 1
    iget-object p0, p0, Lxq;->a:Lnq1;

    .line 2
    .line 3
    sget-object v0, Lxq;->b:Llf;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0, v0}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    goto :goto_0

    .line 10
    :catch_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    check-cast p0, Leo;

    .line 12
    .line 13
    return-object p0
.end method

.method public final k()Lty;
    .locals 0

    .line 1
    iget-object p0, p0, Lxq;->a:Lnq1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m()J
    .locals 3

    .line 1
    iget-object p0, p0, Lxq;->a:Lnq1;

    .line 2
    .line 3
    sget-object v0, Lxq;->w:Llf;

    .line 4
    .line 5
    const-wide/16 v1, -0x1

    .line 6
    .line 7
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :try_start_0
    invoke-virtual {p0, v0}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    :catch_0
    check-cast v1, Ljava/lang/Long;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    return-wide v0
.end method

.method public final o()Lfo;
    .locals 1

    .line 1
    iget-object p0, p0, Lxq;->a:Lnq1;

    .line 2
    .line 3
    sget-object v0, Lxq;->c:Llf;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0, v0}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    goto :goto_0

    .line 10
    :catch_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    check-cast p0, Lfo;

    .line 12
    .line 13
    return-object p0
.end method

.method public final p()Lgo;
    .locals 1

    .line 1
    iget-object p0, p0, Lxq;->a:Lnq1;

    .line 2
    .line 3
    sget-object v0, Lxq;->d:Llf;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0, v0}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    goto :goto_0

    .line 10
    :catch_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    check-cast p0, Lgo;

    .line 12
    .line 13
    return-object p0
.end method

.class public interface abstract Lzy2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lrm2;
.implements Lhw0;


# static fields
.field public static final G:Llf;

.field public static final H:Llf;

.field public static final I:Llf;

.field public static final J:Llf;

.field public static final K:Llf;

.field public static final L:Llf;

.field public static final M:Llf;

.field public static final N:Llf;

.field public static final O:Llf;

.field public static final P:Llf;

.field public static final Q:Llf;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Llf;

    .line 2
    .line 3
    const-string v1, "camerax.core.useCase.defaultSessionConfig"

    .line 4
    .line 5
    const-class v2, Lfb2;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lzy2;->G:Llf;

    .line 12
    .line 13
    new-instance v0, Llf;

    .line 14
    .line 15
    const-string v1, "camerax.core.useCase.defaultCaptureConfig"

    .line 16
    .line 17
    const-class v2, Ljr;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lzy2;->H:Llf;

    .line 23
    .line 24
    new-instance v0, Llf;

    .line 25
    .line 26
    const-string v1, "camerax.core.useCase.sessionConfigUnpacker"

    .line 27
    .line 28
    const-class v2, Lio;

    .line 29
    .line 30
    invoke-direct {v0, v1, v2, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lzy2;->I:Llf;

    .line 34
    .line 35
    new-instance v0, Llf;

    .line 36
    .line 37
    const-string v1, "camerax.core.useCase.captureConfigUnpacker"

    .line 38
    .line 39
    const-class v2, Lco;

    .line 40
    .line 41
    invoke-direct {v0, v1, v2, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lzy2;->J:Llf;

    .line 45
    .line 46
    new-instance v0, Llf;

    .line 47
    .line 48
    const-string v1, "camerax.core.useCase.surfaceOccupancyPriority"

    .line 49
    .line 50
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    invoke-direct {v0, v1, v2, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lzy2;->K:Llf;

    .line 56
    .line 57
    new-instance v0, Llf;

    .line 58
    .line 59
    const-string v1, "camerax.core.useCase.targetFrameRate"

    .line 60
    .line 61
    const-class v4, Landroid/util/Range;

    .line 62
    .line 63
    invoke-direct {v0, v1, v4, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 64
    .line 65
    .line 66
    sput-object v0, Lzy2;->L:Llf;

    .line 67
    .line 68
    new-instance v0, Llf;

    .line 69
    .line 70
    const-string v1, "camerax.core.useCase.zslDisabled"

    .line 71
    .line 72
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    invoke-direct {v0, v1, v4, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 75
    .line 76
    .line 77
    sput-object v0, Lzy2;->M:Llf;

    .line 78
    .line 79
    new-instance v0, Llf;

    .line 80
    .line 81
    const-string v1, "camerax.core.useCase.highResolutionDisabled"

    .line 82
    .line 83
    invoke-direct {v0, v1, v4, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 84
    .line 85
    .line 86
    sput-object v0, Lzy2;->N:Llf;

    .line 87
    .line 88
    new-instance v0, Llf;

    .line 89
    .line 90
    const-string v1, "camerax.core.useCase.captureType"

    .line 91
    .line 92
    const-class v4, Lbz2;

    .line 93
    .line 94
    invoke-direct {v0, v1, v4, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 95
    .line 96
    .line 97
    sput-object v0, Lzy2;->O:Llf;

    .line 98
    .line 99
    new-instance v0, Llf;

    .line 100
    .line 101
    const-string v1, "camerax.core.useCase.previewStabilizationMode"

    .line 102
    .line 103
    invoke-direct {v0, v1, v2, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 104
    .line 105
    .line 106
    sput-object v0, Lzy2;->P:Llf;

    .line 107
    .line 108
    new-instance v0, Llf;

    .line 109
    .line 110
    const-string v1, "camerax.core.useCase.videoStabilizationMode"

    .line 111
    .line 112
    invoke-direct {v0, v1, v2, v3}, Llf;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/hardware/camera2/CaptureRequest$Key;)V

    .line 113
    .line 114
    .line 115
    sput-object v0, Lzy2;->Q:Llf;

    .line 116
    .line 117
    return-void
.end method


# virtual methods
.method public t()Lbz2;
    .locals 1

    .line 1
    sget-object v0, Lzy2;->O:Llf;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lx02;->e(Llf;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lbz2;

    .line 8
    .line 9
    return-object p0
.end method

.method public v()I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sget-object v1, Lzy2;->P:Llf;

    .line 7
    .line 8
    invoke-interface {p0, v1, v0}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

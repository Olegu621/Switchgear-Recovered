.class public final Lbw0;
.super Lco;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final b:Lbw0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lbw0;

    .line 2
    .line 3
    new-instance v1, Lec0;

    .line 4
    .line 5
    const/16 v2, 0xf

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lec0;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lbw0;->b:Lbw0;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Lzy2;Lir;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lco;->a(Lzy2;Lir;)V

    .line 2
    .line 3
    .line 4
    instance-of p0, p1, Law0;

    .line 5
    .line 6
    if-eqz p0, :cond_4

    .line 7
    .line 8
    check-cast p1, Law0;

    .line 9
    .line 10
    invoke-static {}, Luk1;->j()Luk1;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, Law0;->b:Llf;

    .line 15
    .line 16
    invoke-interface {p1, v0}, Lx02;->h(Llf;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    invoke-interface {p1, v0}, Lx02;->e(Llf;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const-class v0, Landroidx/camera/camera2/internal/compat/quirk/ImageCapturePixelHDRPlusQuirk;

    .line 33
    .line 34
    sget-object v1, Lf80;->a:Ler0;

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ler0;->h(Ljava/lang/Class;)Lh02;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Landroidx/camera/camera2/internal/compat/quirk/ImageCapturePixelHDRPlusQuirk;

    .line 41
    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    if-eqz p1, :cond_2

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    if-eq p1, v0, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {}, Lwt0;->e()Landroid/hardware/camera2/CaptureRequest$Key;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-static {p1}, Lho;->L(Landroid/hardware/camera2/CaptureRequest$Key;)Llf;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p0, p1, v0}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-static {}, Lwt0;->e()Landroid/hardware/camera2/CaptureRequest$Key;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-static {p1}, Lho;->L(Landroid/hardware/camera2/CaptureRequest$Key;)Llf;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p0, p1, v0}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    :goto_0
    new-instance p1, Lho;

    .line 79
    .line 80
    invoke-static {p0}, Lnq1;->d(Lty;)Lnq1;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-direct {p1, p0}, Ld52;-><init>(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, p1}, Lir;->e(Lty;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_4
    const-string p0, "config is not ImageCaptureConfig"

    .line 92
    .line 93
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

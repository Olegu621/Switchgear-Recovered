.class public final Loq1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lqq1;


# direct methods
.method public constructor <init>(ILandroid/view/Surface;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x21

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, Lvq1;

    .line 11
    .line 12
    new-instance v1, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 13
    .line 14
    invoke-direct {v1, p1, p2}, Landroid/hardware/camera2/params/OutputConfiguration;-><init>(ILandroid/view/Surface;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Lqq1;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Loq1;->a:Lqq1;

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const/16 v1, 0x1c

    .line 24
    .line 25
    if-lt v0, v1, :cond_1

    .line 26
    .line 27
    new-instance v0, Luq1;

    .line 28
    .line 29
    new-instance v1, Ltq1;

    .line 30
    .line 31
    new-instance v2, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 32
    .line 33
    invoke-direct {v2, p1, p2}, Landroid/hardware/camera2/params/OutputConfiguration;-><init>(ILandroid/view/Surface;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v1, v2}, Ltq1;-><init>(Landroid/hardware/camera2/params/OutputConfiguration;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, v1}, Lqq1;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Loq1;->a:Lqq1;

    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    const/16 v1, 0x1a

    .line 46
    .line 47
    if-lt v0, v1, :cond_2

    .line 48
    .line 49
    new-instance v0, Lsq1;

    .line 50
    .line 51
    new-instance v1, Lrq1;

    .line 52
    .line 53
    new-instance v2, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 54
    .line 55
    invoke-direct {v2, p1, p2}, Landroid/hardware/camera2/params/OutputConfiguration;-><init>(ILandroid/view/Surface;)V

    .line 56
    .line 57
    .line 58
    invoke-direct {v1, v2}, Lrq1;-><init>(Landroid/hardware/camera2/params/OutputConfiguration;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, v1}, Lqq1;-><init>(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Loq1;->a:Lqq1;

    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    new-instance v0, Lqq1;

    .line 68
    .line 69
    new-instance v1, Lpq1;

    .line 70
    .line 71
    new-instance v2, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 72
    .line 73
    invoke-direct {v2, p1, p2}, Landroid/hardware/camera2/params/OutputConfiguration;-><init>(ILandroid/view/Surface;)V

    .line 74
    .line 75
    .line 76
    invoke-direct {v1, v2}, Lpq1;-><init>(Landroid/hardware/camera2/params/OutputConfiguration;)V

    .line 77
    .line 78
    .line 79
    invoke-direct {v0, v1}, Lqq1;-><init>(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, Loq1;->a:Lqq1;

    .line 83
    .line 84
    return-void
.end method

.method public constructor <init>(Lqq1;)V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput-object p1, p0, Loq1;->a:Lqq1;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Loq1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Loq1;

    .line 8
    .line 9
    iget-object p1, p1, Loq1;->a:Lqq1;

    .line 10
    .line 11
    iget-object p0, p0, Loq1;->a:Lqq1;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lqq1;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Loq1;->a:Lqq1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqq1;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

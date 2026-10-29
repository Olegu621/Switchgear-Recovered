.class public Lsq1;
.super Lqq1;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# virtual methods
.method public final a(Landroid/view/Surface;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lsq1;->c()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/params/OutputConfiguration;->addSurface(Landroid/view/Surface;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final b()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lsq1;->c()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/hardware/camera2/params/OutputConfiguration;->enableSurfaceSharing()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lqq1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Lrq1;

    .line 4
    .line 5
    invoke-static {v0}, Lde3;->f(Z)V

    .line 6
    .line 7
    .line 8
    check-cast p0, Lrq1;

    .line 9
    .line 10
    iget-object p0, p0, Lrq1;->a:Landroid/hardware/camera2/params/OutputConfiguration;

    .line 11
    .line 12
    return-object p0
.end method

.method public d()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lqq1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lrq1;

    .line 4
    .line 5
    iget-object p0, p0, Lrq1;->b:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0
.end method

.method public final e()Z
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/AssertionError;

    .line 2
    .line 3
    const-string v0, "isSurfaceSharingEnabled() should not be called on API >= 26"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public f(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Lqq1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lrq1;

    .line 4
    .line 5
    iput-wide p1, p0, Lrq1;->c:J

    .line 6
    .line 7
    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lqq1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lrq1;

    .line 4
    .line 5
    iput-object p1, p0, Lrq1;->b:Ljava/lang/String;

    .line 6
    .line 7
    return-void
.end method

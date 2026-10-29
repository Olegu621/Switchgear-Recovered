.class public Lqq1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqq1;->a:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/view/Surface;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqq1;->c()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/hardware/camera2/params/OutputConfiguration;->getSurface()Landroid/view/Surface;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eq v0, p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lqq1;->e()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string p1, "Cannot have 2 surfaces for a non-sharing configuration"

    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0

    .line 27
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    const-string p1, "Exceeds maximum number of surfaces"

    .line 30
    .line 31
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p0

    .line 35
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    const-string p1, "Surface is already added!"

    .line 38
    .line 39
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object p0, p0, Lqq1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lpq1;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lpq1;->c:Z

    .line 7
    .line 8
    return-void
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lqq1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Lpq1;

    .line 4
    .line 5
    invoke-static {v0}, Lde3;->f(Z)V

    .line 6
    .line 7
    .line 8
    check-cast p0, Lpq1;

    .line 9
    .line 10
    iget-object p0, p0, Lpq1;->a:Landroid/hardware/camera2/params/OutputConfiguration;

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
    check-cast p0, Lpq1;

    .line 4
    .line 5
    iget-object p0, p0, Lpq1;->b:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0
.end method

.method public e()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lqq1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lpq1;

    .line 4
    .line 5
    iget-boolean p0, p0, Lpq1;->c:Z

    .line 6
    .line 7
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lqq1;

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
    check-cast p1, Lqq1;

    .line 8
    .line 9
    iget-object p1, p1, Lqq1;->a:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p0, p0, Lqq1;->a:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public f(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Lqq1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lpq1;

    .line 4
    .line 5
    iput-wide p1, p0, Lpq1;->d:J

    .line 6
    .line 7
    return-void
.end method

.method public g(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lqq1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lpq1;

    .line 4
    .line 5
    iput-object p1, p0, Lpq1;->b:Ljava/lang/String;

    .line 6
    .line 7
    return-void
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lqq1;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public i(J)V
    .locals 0

    .line 1
    return-void
.end method

.class public final Landroidx/camera/camera2/Camera2Config$DefaultProvider;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getCameraXConfig()Lxq;
    .locals 4

    .line 1
    new-instance p0, Leo;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lfo;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lgo;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v2, Lwq;

    .line 17
    .line 18
    invoke-direct {v2}, Lwq;-><init>()V

    .line 19
    .line 20
    .line 21
    sget-object v3, Lxq;->b:Llf;

    .line 22
    .line 23
    iget-object v2, v2, Lwq;->a:Luk1;

    .line 24
    .line 25
    invoke-virtual {v2, v3, p0}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lxq;->c:Llf;

    .line 29
    .line 30
    invoke-virtual {v2, p0, v0}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lxq;->d:Llf;

    .line 34
    .line 35
    invoke-virtual {v2, p0, v1}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    new-instance p0, Lxq;

    .line 39
    .line 40
    invoke-static {v2}, Lnq1;->d(Lty;)Lnq1;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-direct {p0, v0}, Lxq;-><init>(Lnq1;)V

    .line 45
    .line 46
    .line 47
    return-object p0
.end method

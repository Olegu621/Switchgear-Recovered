.class public final Lq01;
.super Lo01;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final U:Lau;

.field public final V:Ljava/lang/Object;

.field public final v:Lz01;

.field public final w:Lr01;


# direct methods
.method public constructor <init>(Lz01;Lr01;Lau;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ls91;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq01;->v:Lz01;

    .line 5
    .line 6
    iput-object p2, p0, Lq01;->w:Lr01;

    .line 7
    .line 8
    iput-object p3, p0, Lq01;->U:Lau;

    .line 9
    .line 10
    iput-object p4, p0, Lq01;->V:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    iget-object p1, p0, Lq01;->U:Lau;

    .line 2
    .line 3
    invoke-static {p1}, Lz01;->G(Ls91;)Lau;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lq01;->v:Lz01;

    .line 8
    .line 9
    iget-object v1, p0, Lq01;->w:Lr01;

    .line 10
    .line 11
    iget-object p0, p0, Lq01;->V:Ljava/lang/Object;

    .line 12
    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    :cond_0
    iget-object v2, p1, Lau;->v:Lcu;

    .line 16
    .line 17
    new-instance v3, Lq01;

    .line 18
    .line 19
    invoke-direct {v3, v0, v1, p1, p0}, Lq01;-><init>(Lz01;Lr01;Lau;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x1

    .line 24
    invoke-static {v2, v4, v3, v5}, Lhu0;->n0(Lh01;ZLo01;I)Le90;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    sget-object v3, Lrn1;->a:Lrn1;

    .line 29
    .line 30
    if-eq v2, v3, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    invoke-static {p1}, Lz01;->G(Ls91;)Lau;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-nez p1, :cond_0

    .line 38
    .line 39
    :cond_2
    invoke-virtual {v0, v1, p0}, Lz01;->q(Lr01;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {v0, p0}, Lz01;->g(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

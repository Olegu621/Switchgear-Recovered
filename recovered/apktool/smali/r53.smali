.class public final Lr53;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lzp;


# instance fields
.field public final a:Lt53;

.field public final b:Lu53;

.field public final c:Ls53;


# direct methods
.method public constructor <init>(Lzp;Ls53;Lf42;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lr53;->c:Ls53;

    .line 5
    .line 6
    new-instance p2, Lt53;

    .line 7
    .line 8
    invoke-interface {p1}, Lzp;->e()Lnp;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    invoke-direct {p2, p3}, Lt53;-><init>(Lnp;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lr53;->a:Lt53;

    .line 16
    .line 17
    new-instance p2, Lu53;

    .line 18
    .line 19
    invoke-interface {p1}, Lzp;->m()Lxp;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {p2, p1}, Lu53;-><init>(Lxp;)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Lr53;->b:Lu53;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final b(Lwy2;)V
    .locals 0

    .line 1
    invoke-static {}, Lpg3;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lr53;->c:Ls53;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ls53;->b(Lwy2;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final d(Lwy2;)V
    .locals 0

    .line 1
    invoke-static {}, Lpg3;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lr53;->c:Ls53;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ls53;->d(Lwy2;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final e()Lnp;
    .locals 0

    .line 1
    iget-object p0, p0, Lr53;->a:Lt53;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g(Lwy2;)V
    .locals 0

    .line 1
    invoke-static {}, Lpg3;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lr53;->c:Ls53;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ls53;->g(Lwy2;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final i(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Operation not supported by VirtualCamera."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final j(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Operation not supported by VirtualCamera."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final k()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final m()Lxp;
    .locals 0

    .line 1
    iget-object p0, p0, Lr53;->b:Lu53;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n(Lwy2;)V
    .locals 0

    .line 1
    invoke-static {}, Lpg3;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lr53;->c:Ls53;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ls53;->n(Lwy2;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

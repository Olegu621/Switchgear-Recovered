.class public final Lht1;
.super Lsq3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# virtual methods
.method public A()Llb2;
    .locals 1

    .line 1
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lqa2;

    .line 4
    .line 5
    iget-object v0, p0, Lqa2;->h:Llb2;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Llb2;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Llb2;-><init>(Lqa2;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lqa2;->h:Llb2;

    .line 15
    .line 16
    :cond_0
    iget-object p0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lqa2;

    .line 19
    .line 20
    invoke-virtual {p0}, Lqa2;->d()Luq2;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-object p0, p0, Luq2;->k:Lza2;

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

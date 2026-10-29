.class public final Lyt;
.super Lj01;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final v:Ler;


# direct methods
.method public constructor <init>(Ler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ls91;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyt;->v:Ler;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lo01;->o()Lz01;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lyt;->v:Ler;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ler;->q(Lz01;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Ler;->y()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Ler;->d:Lc10;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast v0, Lp80;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lp80;->o(Ljava/lang/Throwable;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    :goto_0
    if-eqz v0, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p0, p1}, Ler;->n(Ljava/lang/Throwable;)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ler;->y()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0}, Ler;->o()V

    .line 43
    .line 44
    .line 45
    :cond_2
    :goto_1
    return-void
.end method

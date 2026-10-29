.class public final Ly81;
.super Lz81;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ld71;


# instance fields
.field public final e:Lg71;

.field public final synthetic f:La91;


# direct methods
.method public constructor <init>(La91;Lg71;Lfp1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly81;->f:La91;

    .line 2
    .line 3
    invoke-direct {p0, p1, p3}, Lz81;-><init>(La91;Lfp1;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Ly81;->e:Lg71;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly81;->e:Lg71;

    .line 2
    .line 3
    invoke-interface {v0}, Lg71;->getLifecycle()Lv61;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Lv61;->b(Lf71;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final c(Lg71;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ly81;->e:Lg71;

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-object p0, p0, Ly81;->e:Lg71;

    .line 2
    .line 3
    invoke-interface {p0}, Lg71;->getLifecycle()Lv61;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Li71;

    .line 8
    .line 9
    iget-object p0, p0, Li71;->c:Lu61;

    .line 10
    .line 11
    sget-object v0, Lu61;->d:Lu61;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-ltz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final onStateChanged(Lg71;Lt61;)V
    .locals 2

    .line 1
    iget-object p1, p0, Ly81;->e:Lg71;

    .line 2
    .line 3
    invoke-interface {p1}, Lg71;->getLifecycle()Lv61;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Li71;

    .line 8
    .line 9
    iget-object p2, p2, Li71;->c:Lu61;

    .line 10
    .line 11
    sget-object v0, Lu61;->a:Lu61;

    .line 12
    .line 13
    if-ne p2, v0, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Ly81;->f:La91;

    .line 16
    .line 17
    iget-object p0, p0, Lz81;->a:Lfp1;

    .line 18
    .line 19
    invoke-virtual {p1, p0}, La91;->i(Lfp1;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    if-eq v0, p2, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Ly81;->d()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {p0, v0}, Lz81;->a(Z)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Lg71;->getLifecycle()Lv61;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Li71;

    .line 38
    .line 39
    iget-object v0, v0, Li71;->c:Lu61;

    .line 40
    .line 41
    move-object v1, v0

    .line 42
    move-object v0, p2

    .line 43
    move-object p2, v1

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-void
.end method

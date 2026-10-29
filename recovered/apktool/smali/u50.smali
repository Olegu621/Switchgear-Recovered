.class public final Lu50;
.super Lpg3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public U:Z

.field public i:I

.field public v:I

.field public w:Z


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 3

    .line 1
    iget p1, p0, Lu50;->i:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    add-int/2addr p1, v0

    .line 5
    iput p1, p0, Lu50;->i:I

    .line 6
    .line 7
    iget-boolean p1, p0, Lu50;->U:Z

    .line 8
    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    iget-boolean p1, p0, Lu50;->w:Z

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const-string p1, "App is in foreground"

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const-string v2, "LifecycleTkr"

    .line 19
    .line 20
    invoke-static {v2, p1, v1}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 21
    .line 22
    .line 23
    sget-object p1, Lrs0;->y:Lrs0;

    .line 24
    .line 25
    iget-object p1, p1, Lrs0;->p:Lra2;

    .line 26
    .line 27
    new-instance v1, Lvc0;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-direct {v1, v2}, Lvc0;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v1}, Lra2;->u(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iput-boolean v0, p0, Lu50;->w:Z

    .line 37
    .line 38
    :cond_1
    const/4 p1, 0x0

    .line 39
    iput-boolean p1, p0, Lu50;->U:Z

    .line 40
    .line 41
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget v0, p0, Lu50;->v:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Lu50;->v:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v1, v0

    .line 18
    :goto_0
    iput-boolean v1, p0, Lu50;->U:Z

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    iget p1, p0, Lu50;->i:I

    .line 23
    .line 24
    iget v1, p0, Lu50;->v:I

    .line 25
    .line 26
    if-ne p1, v1, :cond_1

    .line 27
    .line 28
    iput-boolean v0, p0, Lu50;->w:Z

    .line 29
    .line 30
    const-string p0, "App is in background"

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    const-string v0, "LifecycleTkr"

    .line 34
    .line 35
    invoke-static {v0, p0, p1}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lrs0;->y:Lrs0;

    .line 39
    .line 40
    iget-object p0, p0, Lrs0;->p:Lra2;

    .line 41
    .line 42
    new-instance p1, Lvc0;

    .line 43
    .line 44
    const/4 v0, 0x2

    .line 45
    invoke-direct {p1, v0}, Lvc0;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lra2;->u(Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
.end method

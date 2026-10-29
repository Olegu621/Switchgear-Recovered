.class public Lcom/supercell/titan/BackgroundObserver;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/supercell/titan/BackgroundObserver$Listener;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Z

.field public final c:Lcom/supercell/titan/BackgroundObserver$Listener;


# direct methods
.method public constructor <init>(Lcom/supercell/titan/BackgroundObserver$Listener;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/supercell/titan/BackgroundObserver;->a:I

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/supercell/titan/BackgroundObserver;->b:Z

    .line 8
    .line 9
    iput-object p1, p0, Lcom/supercell/titan/BackgroundObserver;->c:Lcom/supercell/titan/BackgroundObserver$Listener;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/supercell/titan/BackgroundObserver;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Lcom/supercell/titan/BackgroundObserver;->a:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/supercell/titan/BackgroundObserver;->b:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/supercell/titan/BackgroundObserver;->c:Lcom/supercell/titan/BackgroundObserver$Listener;

    .line 14
    .line 15
    invoke-interface {p0, p1}, Lcom/supercell/titan/BackgroundObserver$Listener;->onForeground(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput-boolean v0, p0, Lcom/supercell/titan/BackgroundObserver;->b:Z

    .line 6
    .line 7
    iget v1, p0, Lcom/supercell/titan/BackgroundObserver;->a:I

    .line 8
    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    iput v1, p0, Lcom/supercell/titan/BackgroundObserver;->a:I

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Lcom/supercell/titan/BackgroundObserver;->c:Lcom/supercell/titan/BackgroundObserver$Listener;

    .line 18
    .line 19
    invoke-interface {p0, p1}, Lcom/supercell/titan/BackgroundObserver$Listener;->onBackground(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

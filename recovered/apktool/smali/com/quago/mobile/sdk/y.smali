.class public final Lcom/quago/mobile/sdk/y;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final a:Lcom/quago/mobile/sdk/QuagoSettings;


# direct methods
.method public constructor <init>(Lcom/quago/mobile/sdk/QuagoSettings;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/quago/mobile/sdk/y;->a:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    instance-of v1, v0, Lcom/quago/mobile/sdk/e1;

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    :goto_0
    return-void

    .line 20
    :cond_2
    iget-object v1, p0, Lcom/quago/mobile/sdk/y;->a:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/quago/mobile/sdk/QuagoSettings;->isManualMotionDispatcherEnabled()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    iget-object p0, p0, Lcom/quago/mobile/sdk/y;->a:Lcom/quago/mobile/sdk/QuagoSettings;

    .line 27
    .line 28
    if-eqz v1, :cond_4

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/quago/mobile/sdk/QuagoSettings;->isManualKeysDispatcherEnabled()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_3

    .line 35
    .line 36
    new-instance p0, Lcom/quago/mobile/sdk/a0;

    .line 37
    .line 38
    invoke-direct {p0, v0}, Lcom/quago/mobile/sdk/a0;-><init>(Landroid/view/Window$Callback;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p0}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_3
    new-instance p0, Lcom/quago/mobile/sdk/c0;

    .line 46
    .line 47
    invoke-direct {p0, v0}, Lcom/quago/mobile/sdk/c0;-><init>(Landroid/view/Window$Callback;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p0}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_4
    invoke-virtual {p0}, Lcom/quago/mobile/sdk/QuagoSettings;->isManualKeysDispatcherEnabled()Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_5

    .line 59
    .line 60
    new-instance p0, Lcom/quago/mobile/sdk/b0;

    .line 61
    .line 62
    invoke-direct {p0, v0}, Lcom/quago/mobile/sdk/b0;-><init>(Landroid/view/Window$Callback;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p0}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_5
    new-instance p0, Lcom/quago/mobile/sdk/z;

    .line 70
    .line 71
    invoke-direct {p0, v0}, Lcom/quago/mobile/sdk/z;-><init>(Landroid/view/Window$Callback;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p0}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

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
    invoke-static {}, Lcom/quago/mobile/sdk/Quago;->onPause()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sput-object p0, Lcom/quago/mobile/sdk/Quago;->currActivityRef:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    invoke-static {}, Lcom/quago/mobile/sdk/Quago;->onResume()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/quago/mobile/sdk/y;->a(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-static {}, Lcom/quago/mobile/sdk/Quago;->onStop()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

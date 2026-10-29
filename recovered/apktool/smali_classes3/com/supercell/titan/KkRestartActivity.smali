.class public final Lcom/supercell/titan/KkRestartActivity;
.super Landroid/app/Activity;
.source "KkRestartActivity.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 15
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 16
    new-instance p1, Landroid/view/View;

    invoke-direct {p1, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 17
    const/high16 v0, -0x1000000

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 18
    invoke-virtual {p0, p1}, Lcom/supercell/titan/KkRestartActivity;->setContentView(Landroid/view/View;)V

    .line 20
    invoke-virtual {p0}, Lcom/supercell/titan/KkRestartActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "fusion.old_pid"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    .line 21
    if-lez p1, :cond_0

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    if-eq p1, v0, :cond_0

    .line 22
    invoke-static {p1}, Landroid/os/Process;->killProcess(I)V

    .line 24
    :cond_0
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lcom/supercell/titan/KkRestartActivity$1;

    invoke-direct {v0, p0}, Lcom/supercell/titan/KkRestartActivity$1;-><init>(Lcom/supercell/titan/KkRestartActivity;)V

    const-wide/16 v1, 0x28a

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 36
    return-void
.end method

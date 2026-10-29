.class public final Lcom/supercell/titan/m;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/supercell/titan/BackgroundObserver$Listener;


# virtual methods
.method public final onBackground(Landroid/content/Context;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    sput-boolean p0, Lcom/supercell/titan/TitanApplication;->c:Z

    .line 3
    .line 4
    sget-boolean p0, Lcom/supercell/titan/TitanApplication;->nativeLibrariesLoaded:Z

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lcom/supercell/titan/GameApp;->nOnAppStop()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final onForeground(Landroid/content/Context;)V
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    sput-boolean p0, Lcom/supercell/titan/TitanApplication;->c:Z

    .line 3
    .line 4
    sget-boolean p0, Lcom/supercell/titan/TitanApplication;->nativeLibrariesLoaded:Z

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lcom/supercell/titan/GameApp;->nOnAppStart()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

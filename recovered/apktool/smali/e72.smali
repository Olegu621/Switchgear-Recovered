.class public final Le72;
.super Lw20;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Z

.field public final synthetic c:Lcom/supercell/titan/ScExternalWebView;


# direct methods
.method public constructor <init>(Lcom/supercell/titan/ScExternalWebView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le72;->c:Lcom/supercell/titan/ScExternalWebView;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Le72;->b:Z

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final onNavigationEvent(ILandroid/os/Bundle;)V
    .locals 2

    .line 1
    const/4 p2, 0x2

    .line 2
    const/4 v0, 0x1

    .line 3
    iget-object v1, p0, Le72;->c:Lcom/supercell/titan/ScExternalWebView;

    .line 4
    .line 5
    if-ne p1, p2, :cond_0

    .line 6
    .line 7
    iget-boolean p2, p0, Le72;->b:Z

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    iput-boolean v0, p0, Le72;->b:Z

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/supercell/titan/ScExternalWebView;->a()V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance p2, Ld72;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-direct {p2, p0, v0}, Ld72;-><init>(Le72;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Lcom/supercell/titan/GameApp;->runOnView(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const/4 p2, 0x3

    .line 31
    if-ne p1, p2, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/supercell/titan/ScExternalWebView;->a()V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance p2, Ld72;

    .line 41
    .line 42
    invoke-direct {p2, p0, v0}, Ld72;-><init>(Le72;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2}, Lcom/supercell/titan/GameApp;->runOnView(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void
.end method

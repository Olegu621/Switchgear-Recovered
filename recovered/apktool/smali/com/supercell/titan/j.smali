.class public final Lcom/supercell/titan/j;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/supercell/titan/GameApp$OnActivityResultListener;


# instance fields
.field public final synthetic a:Lcom/supercell/titan/ScExternalWebView;


# direct methods
.method public constructor <init>(Lcom/supercell/titan/ScExternalWebView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/supercell/titan/j;->a:Lcom/supercell/titan/ScExternalWebView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 1
    const p2, 0xa04c

    .line 2
    .line 3
    .line 4
    if-ne p1, p2, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/supercell/titan/j;->a:Lcom/supercell/titan/ScExternalWebView;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/supercell/titan/ScExternalWebView;->a()V

    .line 9
    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    iput-boolean p2, p1, Lcom/supercell/titan/ScExternalWebView;->a:Z

    .line 13
    .line 14
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance p2, Ls2;

    .line 19
    .line 20
    const/16 p3, 0x1d

    .line 21
    .line 22
    invoke-direct {p2, p0, p3}, Ls2;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Lcom/supercell/titan/GameApp;->runOnView(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, p0}, Lcom/supercell/titan/GameApp;->removeActivityResultListener(Lcom/supercell/titan/GameApp$OnActivityResultListener;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

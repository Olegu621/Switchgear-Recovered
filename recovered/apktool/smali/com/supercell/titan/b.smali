.class public final Lcom/supercell/titan/b;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/supercell/titan/GameApp$OnActivityResultListener;


# instance fields
.field public final synthetic a:Lcom/supercell/titan/GameApp$ShowStorePageListener;

.field public final synthetic b:Lcom/supercell/titan/GameApp;


# direct methods
.method public constructor <init>(Lcom/supercell/titan/GameApp;Lcom/supercell/titan/GameApp$ShowStorePageListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/supercell/titan/b;->b:Lcom/supercell/titan/GameApp;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/supercell/titan/b;->a:Lcom/supercell/titan/GameApp$ShowStorePageListener;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 1
    const p2, 0xf1b31

    .line 2
    .line 3
    .line 4
    if-ne p1, p2, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/supercell/titan/b;->b:Lcom/supercell/titan/GameApp;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Lcom/supercell/titan/GameApp;->removeActivityResultListener(Lcom/supercell/titan/GameApp$OnActivityResultListener;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p1, Lcom/supercell/titan/GameApp;->w0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lcom/supercell/titan/b;->a:Lcom/supercell/titan/GameApp$ShowStorePageListener;

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-interface {p0, p1}, Lcom/supercell/titan/GameApp$ShowStorePageListener;->onCompletion(Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

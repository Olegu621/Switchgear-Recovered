.class public final Lcom/supercell/titan/i;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/supercell/titan/GameApp$ActivityEventListener;


# instance fields
.field public final a:Lcom/supercell/titan/RequestPermissionListener;


# direct methods
.method public constructor <init>(Lcom/supercell/titan/RequestPermissionListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/supercell/titan/i;->a:Lcom/supercell/titan/RequestPermissionListener;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    const p2, 0xef422

    .line 2
    .line 3
    .line 4
    if-ne p1, p2, :cond_1

    .line 5
    .line 6
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    array-length p2, p3

    .line 11
    const/4 v0, 0x0

    .line 12
    if-lez p2, :cond_0

    .line 13
    .line 14
    aget p2, p3, v0

    .line 15
    .line 16
    if-nez p2, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    :cond_0
    iget-object p2, p0, Lcom/supercell/titan/i;->a:Lcom/supercell/titan/RequestPermissionListener;

    .line 20
    .line 21
    invoke-interface {p2, v0}, Lcom/supercell/titan/RequestPermissionListener;->onPermissionResult(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lcom/supercell/titan/GameApp;->removeActivityEventListener(Lcom/supercell/titan/GameApp$ActivityEventListener;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

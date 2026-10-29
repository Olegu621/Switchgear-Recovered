.class public final Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver$2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lfj;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;-><init>(Landroid/content/Context;Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "com/supercell/id/scid_plugin/PlayStoreCountryObserver$2",
        "Lfj;",
        "",
        "onBillingServiceDisconnected",
        "()V",
        "Lkj;",
        "billingResult",
        "onBillingSetupFinished",
        "(Lkj;)V",
        "scid_plugin_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;


# direct methods
.method public constructor <init>(Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver$2;->this$0:Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onBillingServiceDisconnected()V
    .locals 0

    .line 1
    return-void
.end method

.method public onBillingSetupFinished(Lkj;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p1, Lkj;->a:I

    .line 5
    .line 6
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver$2;->this$0:Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-static {p0}, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;->access$getCallback$p(Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;)Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p0, p1}, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;->access$queryBillingConfig(Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-static {p0}, Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;->access$getCallback$p(Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;)Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    iget-object p1, p1, Lkj;->b:Ljava/lang/String;

    .line 23
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v1, "Failed to set up billingClient: "

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {p0, p1}, Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;->onError(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.class public final Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin$onAttachedToEngine$1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;->onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "com/supercell/id/scid_plugin/PlatformInterfacePlugin$onAttachedToEngine$1",
        "Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;",
        "onCountryRetrieved",
        "",
        "country",
        "",
        "onError",
        "errorMessage",
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
.field final synthetic this$0:Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;


# direct methods
.method public constructor <init>(Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin$onAttachedToEngine$1;->this$0:Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onCountryRetrieved(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin$onAttachedToEngine$1;->this$0:Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;

    .line 2
    .line 3
    new-instance v0, Lo42;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lo42;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;->access$setPlayStoreCountry$p(Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;Lo42;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin$onAttachedToEngine$1;->this$0:Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;

    .line 5
    .line 6
    sget-object p1, Lo42;->b:Lm42;

    .line 7
    .line 8
    new-instance p1, Ljava/lang/Exception;

    .line 9
    .line 10
    const-string v0, "Failed to get appstore country"

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Ln42;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    new-instance p1, Lo42;

    .line 21
    .line 22
    invoke-direct {p1, v0}, Lo42;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0, p1}, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;->access$setPlayStoreCountry$p(Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;Lo42;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

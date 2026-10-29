.class public final Lcom/supercell/id/scid_plugin/ScidPlugin;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityAware;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0008\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0008\u0010\u0014\u001a\u00020\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/supercell/id/scid_plugin/ScidPlugin;",
        "Lio/flutter/embedding/engine/plugins/FlutterPlugin;",
        "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;",
        "<init>",
        "()V",
        "platformInterfacePlugin",
        "Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;",
        "mobileScannerPlugin",
        "Lcom/supercell/id/scid_plugin/MobileScannerPlugin;",
        "onAttachedToEngine",
        "",
        "flutterPluginBinding",
        "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;",
        "onDetachedFromEngine",
        "onAttachedToActivity",
        "activityPluginBinding",
        "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;",
        "onDetachedFromActivity",
        "onReattachedToActivityForConfigChanges",
        "binding",
        "onDetachedFromActivityForConfigChanges",
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
.field private mobileScannerPlugin:Lcom/supercell/id/scid_plugin/MobileScannerPlugin;

.field private platformInterfacePlugin:Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/ScidPlugin;->mobileScannerPlugin:Lcom/supercell/id/scid_plugin/MobileScannerPlugin;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/supercell/id/scid_plugin/MobileScannerPlugin;->onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;->onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/supercell/id/scid_plugin/ScidPlugin;->platformInterfacePlugin:Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;

    .line 13
    .line 14
    new-instance v0, Lcom/supercell/id/scid_plugin/MobileScannerPlugin;

    .line 15
    .line 16
    invoke-direct {v0}, Lcom/supercell/id/scid_plugin/MobileScannerPlugin;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lcom/supercell/id/scid_plugin/MobileScannerPlugin;->onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/supercell/id/scid_plugin/ScidPlugin;->mobileScannerPlugin:Lcom/supercell/id/scid_plugin/MobileScannerPlugin;

    .line 23
    .line 24
    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/ScidPlugin;->mobileScannerPlugin:Lcom/supercell/id/scid_plugin/MobileScannerPlugin;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/supercell/id/scid_plugin/MobileScannerPlugin;->onDetachedFromActivity()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/ScidPlugin;->mobileScannerPlugin:Lcom/supercell/id/scid_plugin/MobileScannerPlugin;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/supercell/id/scid_plugin/MobileScannerPlugin;->onDetachedFromActivityForConfigChanges()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/supercell/id/scid_plugin/ScidPlugin;->mobileScannerPlugin:Lcom/supercell/id/scid_plugin/MobileScannerPlugin;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/supercell/id/scid_plugin/MobileScannerPlugin;->onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/supercell/id/scid_plugin/ScidPlugin;->mobileScannerPlugin:Lcom/supercell/id/scid_plugin/MobileScannerPlugin;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/supercell/id/scid_plugin/ScidPlugin;->platformInterfacePlugin:Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;->onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iput-object v0, p0, Lcom/supercell/id/scid_plugin/ScidPlugin;->platformInterfacePlugin:Lcom/supercell/id/scid_plugin/PlatformInterfacePlugin;

    .line 22
    .line 23
    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/supercell/id/scid_plugin/ScidPlugin;->mobileScannerPlugin:Lcom/supercell/id/scid_plugin/MobileScannerPlugin;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/supercell/id/scid_plugin/MobileScannerPlugin;->onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

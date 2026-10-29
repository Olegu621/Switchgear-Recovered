.class Lio/flutter/embedding/engine/renderer/FlutterRenderer$1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/flutter/embedding/engine/renderer/FlutterUiDisplayListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/renderer/FlutterRenderer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/flutter/embedding/engine/renderer/FlutterRenderer;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/renderer/FlutterRenderer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$1;->this$0:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onFlutterUiDisplayed()V
    .locals 1

    .line 1
    iget-object p0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$1;->this$0:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-static {p0, v0}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->access$002(Lio/flutter/embedding/engine/renderer/FlutterRenderer;Z)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onFlutterUiNoLongerDisplayed()V
    .locals 1

    .line 1
    iget-object p0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$1;->this$0:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {p0, v0}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->access$002(Lio/flutter/embedding/engine/renderer/FlutterRenderer;Z)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method

.class public final synthetic Lio/flutter/plugin/platform/b;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/flutter/plugin/platform/PlatformViewsController$1;

.field public final synthetic b:Lio/flutter/plugin/platform/VirtualDisplayController;

.field public final synthetic c:F

.field public final synthetic d:Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel$PlatformViewBufferResized;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/PlatformViewsController$1;Lio/flutter/plugin/platform/VirtualDisplayController;FLio/flutter/embedding/engine/systemchannels/PlatformViewsChannel$PlatformViewBufferResized;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/flutter/plugin/platform/b;->a:Lio/flutter/plugin/platform/PlatformViewsController$1;

    .line 5
    .line 6
    iput-object p2, p0, Lio/flutter/plugin/platform/b;->b:Lio/flutter/plugin/platform/VirtualDisplayController;

    .line 7
    .line 8
    iput p3, p0, Lio/flutter/plugin/platform/b;->c:F

    .line 9
    .line 10
    iput-object p4, p0, Lio/flutter/plugin/platform/b;->d:Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel$PlatformViewBufferResized;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lio/flutter/plugin/platform/b;->c:F

    .line 2
    .line 3
    iget-object v1, p0, Lio/flutter/plugin/platform/b;->d:Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel$PlatformViewBufferResized;

    .line 4
    .line 5
    iget-object v2, p0, Lio/flutter/plugin/platform/b;->a:Lio/flutter/plugin/platform/PlatformViewsController$1;

    .line 6
    .line 7
    iget-object p0, p0, Lio/flutter/plugin/platform/b;->b:Lio/flutter/plugin/platform/VirtualDisplayController;

    .line 8
    .line 9
    invoke-static {v2, p0, v0, v1}, Lio/flutter/plugin/platform/PlatformViewsController$1;->a(Lio/flutter/plugin/platform/PlatformViewsController$1;Lio/flutter/plugin/platform/VirtualDisplayController;FLio/flutter/embedding/engine/systemchannels/PlatformViewsChannel$PlatformViewBufferResized;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

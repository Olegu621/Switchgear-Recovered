.class public interface abstract Lio/flutter/view/TextureRegistry$SurfaceProducer$Callback;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/view/TextureRegistry$SurfaceProducer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Callback"
.end annotation


# virtual methods
.method public onSurfaceAvailable()V
    .locals 0

    .line 1
    invoke-interface {p0}, Lio/flutter/view/TextureRegistry$SurfaceProducer$Callback;->onSurfaceCreated()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onSurfaceCleanup()V
    .locals 0

    .line 1
    invoke-interface {p0}, Lio/flutter/view/TextureRegistry$SurfaceProducer$Callback;->onSurfaceDestroyed()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onSurfaceCreated()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
        forRemoval = true
        since = "Flutter 3.27"
    .end annotation

    .line 1
    return-void
.end method

.method public onSurfaceDestroyed()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
        forRemoval = true
        since = "Flutter 3.28"
    .end annotation

    .line 1
    return-void
.end method

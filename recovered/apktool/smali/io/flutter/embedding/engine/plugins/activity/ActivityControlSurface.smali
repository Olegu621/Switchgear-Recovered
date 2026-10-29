.class public interface abstract Lio/flutter/embedding/engine/plugins/activity/ActivityControlSurface;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# virtual methods
.method public abstract attachToActivity(Lio/flutter/embedding/android/ExclusiveAppComponent;Lv61;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/embedding/android/ExclusiveAppComponent<",
            "Landroid/app/Activity;",
            ">;",
            "Lv61;",
            ")V"
        }
    .end annotation
.end method

.method public abstract detachFromActivity()V
.end method

.method public abstract detachFromActivityForConfigChanges()V
.end method

.method public abstract onActivityResult(IILandroid/content/Intent;)Z
.end method

.method public abstract onNewIntent(Landroid/content/Intent;)V
.end method

.method public abstract onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
.end method

.method public abstract onRestoreInstanceState(Landroid/os/Bundle;)V
.end method

.method public abstract onSaveInstanceState(Landroid/os/Bundle;)V
.end method

.method public abstract onUserLeaveHint()V
.end method

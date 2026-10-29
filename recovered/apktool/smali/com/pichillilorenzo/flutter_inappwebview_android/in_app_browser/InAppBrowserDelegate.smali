.class public interface abstract Lcom/pichillilorenzo/flutter_inappwebview_android/in_app_browser/InAppBrowserDelegate;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# virtual methods
.method public abstract didChangeProgress(I)V
.end method

.method public abstract didChangeTitle(Ljava/lang/String;)V
.end method

.method public abstract didFailNavigation(Ljava/lang/String;ILjava/lang/String;)V
.end method

.method public abstract didFinishNavigation(Ljava/lang/String;)V
.end method

.method public abstract didStartNavigation(Ljava/lang/String;)V
.end method

.method public abstract didUpdateVisitedHistory(Ljava/lang/String;)V
.end method

.method public abstract getActivity()Landroid/app/Activity;
.end method

.method public abstract getActivityResultListeners()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/pichillilorenzo/flutter_inappwebview_android/in_app_browser/ActivityResultListener;",
            ">;"
        }
    .end annotation
.end method

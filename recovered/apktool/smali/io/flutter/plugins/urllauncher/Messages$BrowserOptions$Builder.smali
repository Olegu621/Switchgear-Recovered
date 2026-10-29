.class public final Lio/flutter/plugins/urllauncher/Messages$BrowserOptions$Builder;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/urllauncher/Messages$BrowserOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private showTitle:Ljava/lang/Boolean;


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
.method public build()Lio/flutter/plugins/urllauncher/Messages$BrowserOptions;
    .locals 1

    .line 1
    new-instance v0, Lio/flutter/plugins/urllauncher/Messages$BrowserOptions;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/flutter/plugins/urllauncher/Messages$BrowserOptions;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lio/flutter/plugins/urllauncher/Messages$BrowserOptions$Builder;->showTitle:Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lio/flutter/plugins/urllauncher/Messages$BrowserOptions;->setShowTitle(Ljava/lang/Boolean;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public setShowTitle(Ljava/lang/Boolean;)Lio/flutter/plugins/urllauncher/Messages$BrowserOptions$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lio/flutter/plugins/urllauncher/Messages$BrowserOptions$Builder;->showTitle:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

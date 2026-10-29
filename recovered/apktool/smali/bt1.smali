.class public final synthetic Lbt1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;II)V
    .locals 0

    .line 1
    iput p3, p0, Lbt1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lbt1;->c:Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;

    .line 4
    .line 5
    iput p2, p0, Lbt1;->b:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 2

    .line 1
    iget v0, p0, Lbt1;->a:I

    .line 2
    .line 3
    iget v1, p0, Lbt1;->b:I

    .line 4
    .line 5
    iget-object p0, p0, Lbt1;->c:Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lio/flutter/plugin/platform/PlatformViewsController2;

    .line 11
    .line 12
    invoke-static {p0, v1, p1, p2}, Lio/flutter/plugin/platform/PlatformViewsController2;->a(Lio/flutter/plugin/platform/PlatformViewsController2;ILandroid/view/View;Z)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p0, Lio/flutter/plugin/platform/PlatformViewsController;

    .line 17
    .line 18
    invoke-static {p0, v1, p1, p2}, Lio/flutter/plugin/platform/PlatformViewsController;->d(Lio/flutter/plugin/platform/PlatformViewsController;ILandroid/view/View;Z)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

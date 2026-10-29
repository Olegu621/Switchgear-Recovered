.class public final synthetic Lhj1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Exception;

.field public final synthetic c:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Exception;Lio/flutter/plugin/common/MethodChannel$Result;I)V
    .locals 0

    .line 1
    iput p3, p0, Lhj1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lhj1;->b:Ljava/lang/Exception;

    .line 4
    .line 5
    iput-object p2, p0, Lhj1;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lhj1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhj1;->b:Ljava/lang/Exception;

    .line 7
    .line 8
    instance-of v1, v0, Lt7;

    .line 9
    .line 10
    iget-object p0, p0, Lhj1;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const-string v3, "MobileScanner"

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-string v0, "Called start() while already started"

    .line 18
    .line 19
    invoke-interface {p0, v3, v0, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    instance-of v1, v0, Ltp;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    const-string v0, "Error occurred when setting up camera!"

    .line 28
    .line 29
    invoke-interface {p0, v3, v0, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    instance-of v0, v0, Lln1;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    const-string v0, "No camera found or failed to open camera!"

    .line 38
    .line 39
    invoke-interface {p0, v3, v0, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const-string v0, "Unknown error occurred."

    .line 44
    .line 45
    invoke-interface {p0, v3, v0, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    return-void

    .line 49
    :pswitch_0
    iget-object v0, p0, Lhj1;->b:Ljava/lang/Exception;

    .line 50
    .line 51
    iget-object p0, p0, Lhj1;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 52
    .line 53
    invoke-static {p0, v0}, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->a(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Exception;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

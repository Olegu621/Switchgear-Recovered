.class public final synthetic Luk0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p6, p0, Luk0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Luk0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Luk0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Luk0;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Luk0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p5, p0, Luk0;->f:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Luk0;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Luk0;->f:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Luk0;->e:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Luk0;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Luk0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p0, p0, Luk0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    check-cast v4, Landroid/view/View;

    .line 19
    .line 20
    check-cast v3, Ljava/util/List;

    .line 21
    .line 22
    check-cast v2, Ljava/util/concurrent/CountDownLatch;

    .line 23
    .line 24
    check-cast v1, Lio/sentry/ILogger;

    .line 25
    .line 26
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Lio/sentry/protocol/k0;

    .line 33
    .line 34
    const-string v6, "android_view_system"

    .line 35
    .line 36
    invoke-direct {v5, v6, v0}, Lio/sentry/protocol/k0;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v4}, Lio/sentry/android/core/ViewHierarchyEventProcessor;->b(Landroid/view/View;)Lio/sentry/protocol/l0;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    invoke-static {v4, v6, v3}, Lio/sentry/android/core/ViewHierarchyEventProcessor;->a(Landroid/view/View;Lio/sentry/protocol/l0;Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception p0

    .line 57
    sget-object v0, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 58
    .line 59
    const-string v2, "Failed to process view hierarchy."

    .line 60
    .line 61
    invoke-interface {v1, v0, v2, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    :goto_0
    return-void

    .line 65
    :pswitch_0
    check-cast p0, Lio/flutter/embedding/engine/loader/FlutterLoader;

    .line 66
    .line 67
    check-cast v4, Landroid/content/Context;

    .line 68
    .line 69
    check-cast v3, [Ljava/lang/String;

    .line 70
    .line 71
    check-cast v2, Landroid/os/Handler;

    .line 72
    .line 73
    check-cast v1, Ljava/lang/Runnable;

    .line 74
    .line 75
    invoke-static {p0, v4, v3, v2, v1}, Lio/flutter/embedding/engine/loader/FlutterLoader;->a(Lio/flutter/embedding/engine/loader/FlutterLoader;Landroid/content/Context;[Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_1
    check-cast p0, Lio/flutter/embedding/engine/loader/FlutterLoader;

    .line 80
    .line 81
    check-cast v4, Landroid/content/Context;

    .line 82
    .line 83
    check-cast v3, [Ljava/lang/String;

    .line 84
    .line 85
    check-cast v2, Landroid/os/Handler;

    .line 86
    .line 87
    check-cast v1, Ljava/lang/Runnable;

    .line 88
    .line 89
    invoke-static {p0, v4, v3, v2, v1}, Lio/flutter/embedding/engine/loader/FlutterLoader;->b(Lio/flutter/embedding/engine/loader/FlutterLoader;Landroid/content/Context;[Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

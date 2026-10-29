.class public Lcom/supercell/id/FlutterSupport;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lg71;
.implements Ld71;
.implements Landroid/app/Application$ActivityLifecycleCallbacks;
.implements Landroid/content/ComponentCallbacks2;


# static fields
.field private static final DEFAULT_FLUTTER_ENGINE_ID:Ljava/lang/String; = "scidEngine"

.field private static final ENGINE_ARGS:[Ljava/lang/String;

.field private static final FLUTTER_PLATFORM_CHANNEL_NAME:Ljava/lang/String; = "supercell/platform"

.field private static final TAG:Ljava/lang/String; = "FlutterSupport"


# instance fields
.field private activity:Landroid/app/Activity;

.field private final activityClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private activityResumed:Z

.field private final application:Landroid/app/Application;

.field private changingConfigurations:Z

.field private destroyed:Z

.field engine:Lio/flutter/embedding/engine/FlutterEngine;

.field private engineInitialized:Z

.field private hitTestRects:[F

.field private lifecycle:Li71;

.field private final messageQueue:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcl0;",
            ">;"
        }
    .end annotation
.end field

.field private panel:Lcom/supercell/id/FlutterPanel;

.field private panelResumed:Z

.field private final pendingHandlers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private pendingWindowVisible:Ljava/lang/Boolean;

.field private userData:J

.field private windowOpen:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "--no-enable-merged-platform-ui-thread"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/supercell/id/FlutterSupport;->ENGINE_ARGS:[Ljava/lang/String;

    .line 8
    .line 9
    const-string v0, "scid_sdk"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(JLandroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/supercell/id/FlutterSupport;->engineInitialized:Z

    .line 6
    .line 7
    new-array v1, v0, [F

    .line 8
    .line 9
    iput-object v1, p0, Lcom/supercell/id/FlutterSupport;->hitTestRects:[F

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/supercell/id/FlutterSupport;->panelResumed:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/supercell/id/FlutterSupport;->activityResumed:Z

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/supercell/id/FlutterSupport;->destroyed:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/supercell/id/FlutterSupport;->changingConfigurations:Z

    .line 18
    .line 19
    new-instance v1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lcom/supercell/id/FlutterSupport;->messageQueue:Ljava/util/Queue;

    .line 25
    .line 26
    new-instance v1, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/supercell/id/FlutterSupport;->pendingHandlers:Ljava/util/Map;

    .line 32
    .line 33
    iput-wide p1, p0, Lcom/supercell/id/FlutterSupport;->userData:J

    .line 34
    .line 35
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lcom/supercell/id/FlutterSupport;->activityClass:Ljava/lang/Class;

    .line 40
    .line 41
    invoke-virtual {p3}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lcom/supercell/id/FlutterSupport;->application:Landroid/app/Application;

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p0}, Landroid/app/Application;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 51
    .line 52
    .line 53
    iput-object p3, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 54
    .line 55
    new-instance p1, Lyk0;

    .line 56
    .line 57
    invoke-direct {p1, p0, v0}, Lyk0;-><init>(Lcom/supercell/id/FlutterSupport;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p3, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public static synthetic a(Lcom/supercell/id/FlutterSupport;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/supercell/id/FlutterSupport;->processMessageQueue()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private applyPendingHandlers()V
    .locals 8

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_3

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/supercell/id/FlutterSupport;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v1, p0, Lcom/supercell/id/FlutterSupport;->pendingHandlers:Ljava/util/Map;

    .line 19
    .line 20
    monitor-enter v1

    .line 21
    :try_start_0
    iget-object p0, p0, Lcom/supercell/id/FlutterSupport;->pendingHandlers:Ljava/util/Map;

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ljava/util/Map$Entry;

    .line 42
    .line 43
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/lang/String;

    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Ljava/lang/Long;

    .line 54
    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    const-wide/16 v6, 0x0

    .line 62
    .line 63
    cmp-long v4, v4, v6

    .line 64
    .line 65
    if-eqz v4, :cond_1

    .line 66
    .line 67
    new-instance v4, Lxk0;

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    invoke-direct {v4, v2, v5}, Lxk0;-><init>(Ljava/lang/Long;I)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v0, v3, v4}, Lio/flutter/plugin/common/BinaryMessenger;->setMessageHandler(Ljava/lang/String;Lio/flutter/plugin/common/BinaryMessenger$BinaryMessageHandler;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception p0

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    monitor-exit v1

    .line 80
    return-void

    .line 81
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    throw p0

    .line 83
    :cond_3
    const-string p0, "applyPendingHandlers must be called on the main thread"

    .line 84
    .line 85
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method private applyPendingWindowState()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->pendingWindowVisible:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    iput-object v1, p0, Lcom/supercell/id/FlutterSupport;->pendingWindowVisible:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-direct {p0, v0}, Lcom/supercell/id/FlutterSupport;->applyWindowState(Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method private applyWindowState(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/supercell/id/FlutterSupport;->engineInitialized:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/supercell/id/FlutterSupport;->engineInitialized:Z

    .line 7
    .line 8
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->lifecycle:Li71;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, v0, v1}, Lcom/supercell/id/FlutterSupport;->onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/supercell/id/FlutterSupport;->onActivityStarted(Landroid/app/Activity;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/supercell/id/FlutterSupport;->onActivityResumed(Landroid/app/Activity;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-boolean v0, p0, Lcom/supercell/id/FlutterSupport;->windowOpen:Z

    .line 29
    .line 30
    if-eq v0, p1, :cond_2

    .line 31
    .line 32
    iput-boolean p1, p0, Lcom/supercell/id/FlutterSupport;->windowOpen:Z

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-direct {p0}, Lcom/supercell/id/FlutterSupport;->createPanel()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-direct {p0}, Lcom/supercell/id/FlutterSupport;->destroyPanel()V

    .line 41
    .line 42
    .line 43
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/supercell/id/FlutterSupport;->panel:Lcom/supercell/id/FlutterPanel;

    .line 44
    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    iget-object p0, p0, Lcom/supercell/id/FlutterSupport;->hitTestRects:[F

    .line 48
    .line 49
    invoke-virtual {p1, p0}, Lcom/supercell/id/FlutterPanel;->setHitTestRects([F)V

    .line 50
    .line 51
    .line 52
    :cond_3
    return-void
.end method

.method public static synthetic b(Ljava/lang/Long;Ljava/nio/ByteBuffer;Lio/flutter/plugin/common/BinaryMessenger$BinaryReply;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/supercell/id/FlutterSupport;->lambda$applyPendingHandlers$1(Ljava/lang/Long;Ljava/nio/ByteBuffer;Lio/flutter/plugin/common/BinaryMessenger$BinaryReply;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static native binaryChannelReply(Ljava/nio/ByteBuffer;J)V
.end method

.method public static native binaryMessageHandler(JLjava/nio/ByteBuffer;Lio/flutter/plugin/common/BinaryMessenger$BinaryReply;)V
.end method

.method public static synthetic c(Lcom/supercell/id/FlutterSupport;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/supercell/id/FlutterSupport;->lambda$setMessageHandler$5(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private createPanel()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->panel:Lcom/supercell/id/FlutterPanel;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    :try_start_0
    new-instance v0, Lcom/supercell/id/FlutterPanel;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2, p0}, Lcom/supercell/id/FlutterPanel;-><init>(Landroid/app/Activity;Lio/flutter/embedding/engine/FlutterEngine;Lcom/supercell/id/FlutterSupport;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/supercell/id/FlutterSupport;->panel:Lcom/supercell/id/FlutterPanel;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p0

    .line 26
    sget-object v0, Lcom/supercell/id/FlutterSupport;->TAG:Ljava/lang/String;

    .line 27
    .line 28
    const-string v1, "showDialog failed"

    .line 29
    .line 30
    invoke-static {v0, v1, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public static synthetic d(Lcom/supercell/id/FlutterSupport;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/supercell/id/FlutterSupport;->onFlutterInitialized()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private destroyPanel()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->panel:Lcom/supercell/id/FlutterPanel;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lcom/supercell/id/FlutterSupport;->panel:Lcom/supercell/id/FlutterPanel;

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {v0}, Lcom/supercell/id/FlutterPanel;->destroy()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception p0

    .line 13
    sget-object v0, Lcom/supercell/id/FlutterSupport;->TAG:Ljava/lang/String;

    .line 14
    .line 15
    const-string v1, "dismissDialog failed"

    .line 16
    .line 17
    invoke-static {v0, v1, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public static synthetic e(Lcom/supercell/id/FlutterSupport;[FZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/supercell/id/FlutterSupport;->lambda$setWindowVisibility$2([FZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Lcom/supercell/id/FlutterSupport;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/supercell/id/FlutterSupport;->lambda$new$0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Ljava/lang/Long;Ljava/nio/ByteBuffer;Lio/flutter/plugin/common/BinaryMessenger$BinaryReply;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/supercell/id/FlutterSupport;->lambda$setMessageHandler$4(Ljava/lang/Long;Ljava/nio/ByteBuffer;Lio/flutter/plugin/common/BinaryMessenger$BinaryReply;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngine;->getDartExecutor()Lio/flutter/embedding/engine/dart/DartExecutor;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lio/flutter/embedding/engine/dart/DartExecutor;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static synthetic h(Lcom/supercell/id/FlutterSupport;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/supercell/id/FlutterSupport;->lambda$onActivityCreated$6()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(JLjava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/supercell/id/FlutterSupport;->lambda$sendMessage$3(JLjava/nio/ByteBuffer;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$applyPendingHandlers$1(Ljava/lang/Long;Ljava/nio/ByteBuffer;Lio/flutter/plugin/common/BinaryMessenger$BinaryReply;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1, p1, p2}, Lcom/supercell/id/FlutterSupport;->binaryMessageHandler(JLjava/nio/ByteBuffer;Lio/flutter/plugin/common/BinaryMessenger$BinaryReply;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private synthetic lambda$new$0()V
    .locals 6

    .line 1
    invoke-static {}, Lio/flutter/FlutterInjector;->instance()Lio/flutter/FlutterInjector;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lio/flutter/FlutterInjector;->flutterLoader()Lio/flutter/embedding/engine/loader/FlutterLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/supercell/id/FlutterSupport;->application:Landroid/app/Application;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/loader/FlutterLoader;->startInitialization(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/supercell/id/FlutterSupport;->application:Landroid/app/Application;

    .line 15
    .line 16
    sget-object v2, Lcom/supercell/id/FlutterSupport;->ENGINE_ARGS:[Ljava/lang/String;

    .line 17
    .line 18
    new-instance v3, Landroid/os/Handler;

    .line 19
    .line 20
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 25
    .line 26
    .line 27
    new-instance v4, Lyk0;

    .line 28
    .line 29
    const/4 v5, 0x2

    .line 30
    invoke-direct {v4, p0, v5}, Lyk0;-><init>(Lcom/supercell/id/FlutterSupport;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, v2, v3, v4}, Lio/flutter/embedding/engine/loader/FlutterLoader;->ensureInitializationCompleteAsync(Landroid/content/Context;[Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method private synthetic lambda$onActivityCreated$6()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/supercell/id/FlutterSupport;->windowOpen:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/supercell/id/FlutterSupport;->createPanel()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->panel:Lcom/supercell/id/FlutterPanel;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lcom/supercell/id/FlutterSupport;->hitTestRects:[F

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Lcom/supercell/id/FlutterPanel;->setHitTestRects([F)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method private static synthetic lambda$sendMessage$3(JLjava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    invoke-static {p2, p0, p1}, Lcom/supercell/id/FlutterSupport;->binaryChannelReply(Ljava/nio/ByteBuffer;J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$setMessageHandler$4(Ljava/lang/Long;Ljava/nio/ByteBuffer;Lio/flutter/plugin/common/BinaryMessenger$BinaryReply;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1, p1, p2}, Lcom/supercell/id/FlutterSupport;->binaryMessageHandler(JLjava/nio/ByteBuffer;Lio/flutter/plugin/common/BinaryMessenger$BinaryReply;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private synthetic lambda$setMessageHandler$5(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/supercell/id/FlutterSupport;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lcom/supercell/id/FlutterSupport;->pendingHandlers:Ljava/util/Map;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    iget-object p0, p0, Lcom/supercell/id/FlutterSupport;->pendingHandlers:Ljava/util/Map;

    .line 11
    .line 12
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/lang/Long;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    const-wide/16 v4, 0x0

    .line 25
    .line 26
    cmp-long v2, v2, v4

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    new-instance v2, Lxk0;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-direct {v2, p0, v3}, Lxk0;-><init>(Ljava/lang/Long;I)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, p1, v2}, Lio/flutter/plugin/common/BinaryMessenger;->setMessageHandler(Ljava/lang/String;Lio/flutter/plugin/common/BinaryMessenger$BinaryMessageHandler;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    const/4 p0, 0x0

    .line 43
    invoke-interface {v0, p1, p0}, Lio/flutter/plugin/common/BinaryMessenger;->setMessageHandler(Ljava/lang/String;Lio/flutter/plugin/common/BinaryMessenger$BinaryMessageHandler;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    monitor-exit v1

    .line 47
    return-void

    .line 48
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw p0

    .line 50
    :cond_1
    return-void
.end method

.method private synthetic lambda$setWindowVisibility$2([FZ)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, [F->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, [F

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    new-array p1, p1, [F

    .line 12
    .line 13
    :goto_0
    iput-object p1, p0, Lcom/supercell/id/FlutterSupport;->hitTestRects:[F

    .line 14
    .line 15
    iget-object p1, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lcom/supercell/id/FlutterSupport;->pendingWindowVisible:Ljava/lang/Boolean;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, Lcom/supercell/id/FlutterSupport;->pendingWindowVisible:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-direct {p0, p2}, Lcom/supercell/id/FlutterSupport;->applyWindowState(Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private onFlutterInitialized()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/supercell/id/FlutterSupport;->destroyed:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lio/flutter/embedding/engine/FlutterEngine;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/supercell/id/FlutterSupport;->application:Landroid/app/Application;

    .line 9
    .line 10
    sget-object v2, Lcom/supercell/id/FlutterSupport;->ENGINE_ARGS:[Ljava/lang/String;

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Lio/flutter/embedding/engine/FlutterEngine;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 16
    .line 17
    invoke-static {}, Lio/flutter/embedding/engine/FlutterEngineCache;->getInstance()Lio/flutter/embedding/engine/FlutterEngineCache;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "scidEngine"

    .line 22
    .line 23
    iget-object v2, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lio/flutter/embedding/engine/FlutterEngineCache;->put(Ljava/lang/String;Lio/flutter/embedding/engine/FlutterEngine;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->lifecycle:Li71;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 37
    .line 38
    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterEngine;->getActivityControlSurface()Lio/flutter/embedding/engine/plugins/activity/ActivityControlSurface;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, Lqc3;

    .line 43
    .line 44
    iget-object v2, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 45
    .line 46
    iget-object v3, p0, Lcom/supercell/id/FlutterSupport;->lifecycle:Li71;

    .line 47
    .line 48
    const/16 v4, 0x1b

    .line 49
    .line 50
    invoke-direct {v1, v2, v4}, Lqc3;-><init>(Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, v1, v3}, Lio/flutter/embedding/engine/plugins/activity/ActivityControlSurface;->attachToActivity(Lio/flutter/embedding/android/ExclusiveAppComponent;Lv61;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-direct {p0}, Lcom/supercell/id/FlutterSupport;->applyPendingHandlers()V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 60
    .line 61
    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterEngine;->getDartExecutor()Lio/flutter/embedding/engine/dart/DartExecutor;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {}, Lio/flutter/embedding/engine/dart/DartExecutor$DartEntrypoint;->createDefault()Lio/flutter/embedding/engine/dart/DartExecutor$DartEntrypoint;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/dart/DartExecutor;->executeDartEntrypoint(Lio/flutter/embedding/engine/dart/DartExecutor$DartEntrypoint;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {p0}, Lcom/supercell/id/FlutterSupport;->processMessageQueue()V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0}, Lcom/supercell/id/FlutterSupport;->applyPendingWindowState()V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method private postMessage(Ljava/lang/String;Ljava/nio/ByteBuffer;Lio/flutter/plugin/common/BinaryMessenger$BinaryReply;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->messageQueue:Ljava/util/Queue;

    .line 6
    .line 7
    new-instance v1, Lcl0;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, v1, Lcl0;->a:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p2, v1, Lcl0;->b:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    iput-object p3, v1, Lcl0;->c:Lio/flutter/plugin/common/BinaryMessenger$BinaryReply;

    .line 17
    .line 18
    invoke-interface {v0, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 22
    .line 23
    new-instance p2, Lyk0;

    .line 24
    .line 25
    const/4 p3, 0x1

    .line 26
    invoke-direct {p2, p0, p3}, Lyk0;-><init>(Lcom/supercell/id/FlutterSupport;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method private processMessageQueue()V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_2

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/supercell/id/FlutterSupport;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/supercell/id/FlutterSupport;->messageQueue:Ljava/util/Queue;

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Lcom/supercell/id/FlutterSupport;->messageQueue:Ljava/util/Queue;

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcl0;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    iget-object v2, v1, Lcl0;->a:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v3, v1, Lcl0;->b:Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    iget-object v1, v1, Lcl0;->c:Lio/flutter/plugin/common/BinaryMessenger$BinaryReply;

    .line 41
    .line 42
    invoke-interface {v0, v2, v3, v1}, Lio/flutter/plugin/common/BinaryMessenger;->send(Ljava/lang/String;Ljava/nio/ByteBuffer;Lio/flutter/plugin/common/BinaryMessenger$BinaryReply;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    :goto_1
    return-void

    .line 47
    :cond_2
    const-string p0, "processMessageQueue must be called on the main thread"

    .line 48
    .line 49
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method private sendAppLifecycleEvent(I)V
    .locals 3

    .line 1
    sget-object v0, Lio/flutter/plugin/common/StandardMethodCodec;->INSTANCE:Lio/flutter/plugin/common/StandardMethodCodec;

    .line 2
    .line 3
    new-instance v1, Lio/flutter/plugin/common/MethodCall;

    .line 4
    .line 5
    const-string v2, "appLifecycleEvent"

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v1, v2, p1}, Lio/flutter/plugin/common/MethodCall;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/StandardMethodCodec;->encodeMethodCall(Lio/flutter/plugin/common/MethodCall;)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "supercell/platform"

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {p0, v0, p1, v1}, Lcom/supercell/id/FlutterSupport;->postMessage(Ljava/lang/String;Ljava/nio/ByteBuffer;Lio/flutter/plugin/common/BinaryMessenger$BinaryReply;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private updatePaused()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/supercell/id/FlutterSupport;->activityResumed:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/supercell/id/FlutterSupport;->panelResumed:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    :cond_0
    iget-object p0, p0, Lcom/supercell/id/FlutterSupport;->lifecycle:Li71;

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    sget-object v0, Lt61;->ON_PAUSE:Lt61;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Li71;->e(Lt61;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method private updateResumed()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/supercell/id/FlutterSupport;->activityResumed:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/supercell/id/FlutterSupport;->panelResumed:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lcom/supercell/id/FlutterSupport;->lifecycle:Li71;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lt61;->ON_RESUME:Lt61;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Li71;->e(Lt61;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method


# virtual methods
.method public getLifecycle()Lv61;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/id/FlutterSupport;->lifecycle:Li71;

    .line 2
    .line 3
    return-object p0
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->activityClass:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_2

    .line 12
    .line 13
    iput-object p1, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    iput-boolean p2, p0, Lcom/supercell/id/FlutterSupport;->changingConfigurations:Z

    .line 17
    .line 18
    iget-object p2, p0, Lcom/supercell/id/FlutterSupport;->lifecycle:Li71;

    .line 19
    .line 20
    if-nez p2, :cond_0

    .line 21
    .line 22
    new-instance p2, Li71;

    .line 23
    .line 24
    invoke-direct {p2, p0}, Li71;-><init>(Lg71;)V

    .line 25
    .line 26
    .line 27
    iput-object p2, p0, Lcom/supercell/id/FlutterSupport;->lifecycle:Li71;

    .line 28
    .line 29
    invoke-virtual {p2, p0}, Li71;->a(Lf71;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object p2, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 33
    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterEngine;->getActivityControlSurface()Lio/flutter/embedding/engine/plugins/activity/ActivityControlSurface;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    new-instance v0, Lqc3;

    .line 41
    .line 42
    iget-object v1, p0, Lcom/supercell/id/FlutterSupport;->lifecycle:Li71;

    .line 43
    .line 44
    const/16 v2, 0x1b

    .line 45
    .line 46
    invoke-direct {v0, p1, v2}, Lqc3;-><init>(Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p2, v0, v1}, Lio/flutter/embedding/engine/plugins/activity/ActivityControlSurface;->attachToActivity(Lio/flutter/embedding/android/ExclusiveAppComponent;Lv61;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    iget-object p2, p0, Lcom/supercell/id/FlutterSupport;->lifecycle:Li71;

    .line 53
    .line 54
    sget-object v0, Lt61;->ON_CREATE:Lt61;

    .line 55
    .line 56
    invoke-virtual {p2, v0}, Li71;->e(Lt61;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance p2, Lyk0;

    .line 68
    .line 69
    const/4 v0, 0x3

    .line 70
    invoke-direct {p2, p0, v0}, Lyk0;-><init>(Lcom/supercell/id/FlutterSupport;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 74
    .line 75
    .line 76
    invoke-direct {p0}, Lcom/supercell/id/FlutterSupport;->applyPendingWindowState()V

    .line 77
    .line 78
    .line 79
    const/4 p1, 0x1

    .line 80
    invoke-direct {p0, p1}, Lcom/supercell/id/FlutterSupport;->sendAppLifecycleEvent(I)V

    .line 81
    .line 82
    .line 83
    const/4 p1, 0x2

    .line 84
    invoke-direct {p0, p1}, Lcom/supercell/id/FlutterSupport;->sendAppLifecycleEvent(I)V

    .line 85
    .line 86
    .line 87
    :cond_2
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    if-ne p1, v0, :cond_4

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput-boolean p1, p0, Lcom/supercell/id/FlutterSupport;->changingConfigurations:Z

    .line 10
    .line 11
    iget-object p1, p0, Lcom/supercell/id/FlutterSupport;->lifecycle:Li71;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    sget-object v1, Lt61;->ON_DESTROY:Lt61;

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Li71;->e(Lt61;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/supercell/id/FlutterSupport;->lifecycle:Li71;

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Li71;->b(Lf71;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/supercell/id/FlutterSupport;->lifecycle:Li71;

    .line 27
    .line 28
    :cond_0
    invoke-direct {p0}, Lcom/supercell/id/FlutterSupport;->destroyPanel()V

    .line 29
    .line 30
    .line 31
    iget-boolean p1, p0, Lcom/supercell/id/FlutterSupport;->changingConfigurations:Z

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-object p1, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 36
    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-virtual {p1}, Lio/flutter/embedding/engine/FlutterEngine;->getActivityControlSurface()Lio/flutter/embedding/engine/plugins/activity/ActivityControlSurface;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityControlSurface;->detachFromActivityForConfigChanges()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 p1, 0x1

    .line 48
    iput-boolean p1, p0, Lcom/supercell/id/FlutterSupport;->destroyed:Z

    .line 49
    .line 50
    iget-object p1, p0, Lcom/supercell/id/FlutterSupport;->application:Landroid/app/Application;

    .line 51
    .line 52
    invoke-virtual {p1, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lcom/supercell/id/FlutterSupport;->application:Landroid/app/Application;

    .line 56
    .line 57
    invoke-virtual {p1, p0}, Landroid/app/Application;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 61
    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    invoke-virtual {p1}, Lio/flutter/embedding/engine/FlutterEngine;->getActivityControlSurface()Lio/flutter/embedding/engine/plugins/activity/ActivityControlSurface;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityControlSurface;->detachFromActivity()V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 72
    .line 73
    invoke-virtual {p1}, Lio/flutter/embedding/engine/FlutterEngine;->destroy()V

    .line 74
    .line 75
    .line 76
    :cond_2
    iget-object p1, p0, Lcom/supercell/id/FlutterSupport;->pendingHandlers:Ljava/util/Map;

    .line 77
    .line 78
    monitor-enter p1

    .line 79
    :try_start_0
    iget-object v1, p0, Lcom/supercell/id/FlutterSupport;->pendingHandlers:Ljava/util/Map;

    .line 80
    .line 81
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 82
    .line 83
    .line 84
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    :cond_3
    :goto_0
    iput-object v0, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 86
    .line 87
    return-void

    .line 88
    :catchall_0
    move-exception p0

    .line 89
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    throw p0

    .line 91
    :cond_4
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lcom/supercell/id/FlutterSupport;->activityResumed:Z

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/supercell/id/FlutterSupport;->updatePaused()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->panel:Lcom/supercell/id/FlutterPanel;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngine;->getActivityControlSurface()Lio/flutter/embedding/engine/plugins/activity/ActivityControlSurface;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0, p1, p2, p3}, Lio/flutter/embedding/engine/plugins/activity/ActivityControlSurface;->onActivityResult(IILandroid/content/Intent;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/supercell/id/FlutterSupport;->activityResumed:Z

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/supercell/id/FlutterSupport;->updateResumed()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    if-ne p1, v0, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Lcom/supercell/id/FlutterSupport;->lifecycle:Li71;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object v0, Lt61;->ON_START:Lt61;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Li71;->e(Lt61;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1}, Lcom/supercell/id/FlutterSupport;->sendAppLifecycleEvent(I)V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    if-ne p1, v0, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Lcom/supercell/id/FlutterSupport;->lifecycle:Li71;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object v0, Lt61;->ON_STOP:Lt61;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Li71;->e(Lt61;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 p1, 0x3

    .line 15
    invoke-direct {p0, p1}, Lcom/supercell/id/FlutterSupport;->sendAppLifecycleEvent(I)V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onLowMemory()V
    .locals 0

    .line 1
    return-void
.end method

.method public onPanelPaused(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lcom/supercell/id/FlutterSupport;->panelResumed:Z

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/supercell/id/FlutterSupport;->updatePaused()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onPanelResumed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/supercell/id/FlutterSupport;->panelResumed:Z

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/supercell/id/FlutterSupport;->updateResumed()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->panel:Lcom/supercell/id/FlutterPanel;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngine;->getActivityControlSurface()Lio/flutter/embedding/engine/plugins/activity/ActivityControlSurface;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0, p1, p2, p3}, Lio/flutter/embedding/engine/plugins/activity/ActivityControlSurface;->onRequestPermissionsResult(I[Ljava/lang/String;[I)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public onStateChanged(Lg71;Lt61;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Lbl0;->a:[I

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    aget v0, v0, v1

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq v0, v1, :cond_5

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq v0, v1, :cond_5

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    if-eq v0, v1, :cond_4

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    if-eq v0, v1, :cond_3

    .line 25
    .line 26
    const/4 v1, 0x5

    .line 27
    if-eq v0, v1, :cond_1

    .line 28
    .line 29
    :goto_0
    return-void

    .line 30
    :cond_1
    iget-boolean p0, p0, Lcom/supercell/id/FlutterSupport;->changingConfigurations:Z

    .line 31
    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lio/flutter/embedding/engine/FlutterEngine;->getLifecycleChannel()Lio/flutter/embedding/engine/systemchannels/LifecycleChannel;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Lio/flutter/embedding/engine/systemchannels/LifecycleChannel;->appIsDetached()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lio/flutter/embedding/engine/FlutterEngine;->getLifecycleChannel()Lio/flutter/embedding/engine/systemchannels/LifecycleChannel;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Lio/flutter/embedding/engine/systemchannels/LifecycleChannel;->appIsPaused()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lio/flutter/embedding/engine/FlutterEngine;->getLifecycleChannel()Lio/flutter/embedding/engine/systemchannels/LifecycleChannel;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Lio/flutter/embedding/engine/systemchannels/LifecycleChannel;->appIsResumed()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_5
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Lio/flutter/embedding/engine/FlutterEngine;->getLifecycleChannel()Lio/flutter/embedding/engine/systemchannels/LifecycleChannel;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Lio/flutter/embedding/engine/systemchannels/LifecycleChannel;->appIsInactive()V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public onTrimMemory(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/16 v1, 0xa

    .line 7
    .line 8
    if-lt p1, v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterEngine;->getDartExecutor()Lio/flutter/embedding/engine/dart/DartExecutor;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lio/flutter/embedding/engine/dart/DartExecutor;->notifyLowMemoryWarning()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 18
    .line 19
    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterEngine;->getSystemChannel()Lio/flutter/embedding/engine/systemchannels/SystemChannel;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lio/flutter/embedding/engine/systemchannels/SystemChannel;->sendMemoryPressureWarning()V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object p0, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 27
    .line 28
    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngine;->getRenderer()Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0, p1}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->onTrimMemory(I)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public onUserLeaveHint()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->panel:Lcom/supercell/id/FlutterPanel;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/supercell/id/FlutterSupport;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngine;->getActivityControlSurface()Lio/flutter/embedding/engine/plugins/activity/ActivityControlSurface;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Lio/flutter/embedding/engine/plugins/activity/ActivityControlSurface;->onUserLeaveHint()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public resetUserData()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/supercell/id/FlutterSupport;->userData:J

    .line 4
    .line 5
    return-void
.end method

.method public sendMessage(Ljava/lang/String;Ljava/nio/ByteBuffer;J)V
    .locals 1

    .line 1
    new-instance v0, Lzk0;

    .line 2
    .line 3
    invoke-direct {v0, p3, p4}, Lzk0;-><init>(J)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2, v0}, Lcom/supercell/id/FlutterSupport;->postMessage(Ljava/lang/String;Ljava/nio/ByteBuffer;Lio/flutter/plugin/common/BinaryMessenger$BinaryReply;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setMessageHandler(Ljava/lang/String;J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->pendingHandlers:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    cmp-long v1, p2, v1

    .line 7
    .line 8
    iget-object v2, p0, Lcom/supercell/id/FlutterSupport;->pendingHandlers:Ljava/util/Map;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    :try_start_0
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-interface {v2, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-interface {v2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    iget-object p2, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 27
    .line 28
    if-nez p2, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    new-instance p3, Lj8;

    .line 32
    .line 33
    const/16 v0, 0x19

    .line 34
    .line 35
    invoke-direct {p3, v0, p0, p1}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2, p3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    throw p0
.end method

.method public setWindowVisibility(Z[F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterSupport;->activity:Landroid/app/Activity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lal0;

    .line 6
    .line 7
    invoke-direct {v1, p0, p2, p1}, Lal0;-><init>(Lcom/supercell/id/FlutterSupport;[FZ)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

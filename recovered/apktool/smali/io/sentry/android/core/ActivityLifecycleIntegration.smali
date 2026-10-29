.class public final Lio/sentry/android/core/ActivityLifecycleIntegration;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/s1;
.implements Ljava/io/Closeable;
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public U:Lio/sentry/k1;

.field public V:Lio/sentry/m1;

.field public final W:Ljava/util/WeakHashMap;

.field public final X:Ljava/util/WeakHashMap;

.field public final Y:Ljava/util/WeakHashMap;

.field public Z:Lio/sentry/t4;

.field public final a:Landroid/app/Application;

.field public a0:Ljava/util/concurrent/Future;

.field public final b:Lio/sentry/android/core/o0;

.field public final b0:Ljava/util/WeakHashMap;

.field public c:Lio/sentry/h4;

.field public final c0:Lio/sentry/android/core/d;

.field public d:Lio/sentry/android/core/SentryAndroidOptions;

.field public final d0:Lio/sentry/util/a;

.field public e:Z

.field public final e0:Lio/sentry/util/a;

.field public f:Z

.field public final i:Z

.field public v:Z

.field public w:Lio/sentry/h0;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lio/sentry/android/core/o0;Lio/sentry/android/core/d;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->f:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->v:Z

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->w:Lio/sentry/h0;

    .line 13
    .line 14
    new-instance v1, Ljava/util/WeakHashMap;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->W:Ljava/util/WeakHashMap;

    .line 20
    .line 21
    new-instance v1, Ljava/util/WeakHashMap;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->X:Ljava/util/WeakHashMap;

    .line 27
    .line 28
    new-instance v1, Ljava/util/WeakHashMap;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->Y:Ljava/util/WeakHashMap;

    .line 34
    .line 35
    new-instance v1, Lio/sentry/u5;

    .line 36
    .line 37
    const-wide/16 v2, 0x0

    .line 38
    .line 39
    invoke-direct {v1, v2, v3, v2, v3}, Lio/sentry/u5;-><init>(JJ)V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->Z:Lio/sentry/t4;

    .line 43
    .line 44
    iput-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->a0:Ljava/util/concurrent/Future;

    .line 45
    .line 46
    new-instance v0, Ljava/util/WeakHashMap;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->b0:Ljava/util/WeakHashMap;

    .line 52
    .line 53
    new-instance v0, Lio/sentry/util/a;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d0:Lio/sentry/util/a;

    .line 59
    .line 60
    new-instance v0, Lio/sentry/util/a;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e0:Lio/sentry/util/a;

    .line 66
    .line 67
    iput-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->a:Landroid/app/Application;

    .line 68
    .line 69
    iput-object p2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->b:Lio/sentry/android/core/o0;

    .line 70
    .line 71
    iput-object p3, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->c0:Lio/sentry/android/core/d;

    .line 72
    .line 73
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 74
    .line 75
    const/16 p2, 0x1d

    .line 76
    .line 77
    if-lt p1, p2, :cond_0

    .line 78
    .line 79
    const/4 p1, 0x1

    .line 80
    iput-boolean p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->i:Z

    .line 81
    .line 82
    :cond_0
    return-void
.end method

.method public static f(Lio/sentry/k1;Lio/sentry/k1;)V
    .locals 3

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    invoke-interface {p0}, Lio/sentry/k1;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_3

    .line 10
    :cond_0
    invoke-interface {p0}, Lio/sentry/k1;->getDescription()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, " - Deadline Exceeded"

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {p0}, Lio/sentry/k1;->getDescription()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_0
    invoke-interface {p0, v0}, Lio/sentry/k1;->o(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    invoke-interface {p1}, Lio/sentry/k1;->t()Lio/sentry/t4;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    const/4 p1, 0x0

    .line 55
    :goto_1
    if-eqz p1, :cond_3

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    invoke-interface {p0}, Lio/sentry/k1;->w()Lio/sentry/t4;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :goto_2
    sget-object v0, Lio/sentry/f7;->DEADLINE_EXCEEDED:Lio/sentry/f7;

    .line 63
    .line 64
    invoke-static {p0, p1, v0}, Lio/sentry/android/core/ActivityLifecycleIntegration;->g(Lio/sentry/k1;Lio/sentry/t4;Lio/sentry/f7;)V

    .line 65
    .line 66
    .line 67
    :cond_4
    :goto_3
    return-void
.end method

.method public static g(Lio/sentry/k1;Lio/sentry/t4;Lio/sentry/f7;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    invoke-interface {p0}, Lio/sentry/k1;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {p0}, Lio/sentry/k1;->getStatus()Lio/sentry/f7;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    invoke-interface {p0}, Lio/sentry/k1;->getStatus()Lio/sentry/f7;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    sget-object p2, Lio/sentry/f7;->OK:Lio/sentry/f7;

    .line 24
    .line 25
    :goto_0
    invoke-interface {p0, p2, p1}, Lio/sentry/k1;->v(Lio/sentry/f7;Lio/sentry/t4;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    return-void
.end method


# virtual methods
.method public final c(Lio/sentry/t4;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Lio/sentry/android/core/performance/g;->b(Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/performance/h;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lio/sentry/android/core/performance/h;->e()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    new-instance v1, Lio/sentry/r5;

    .line 22
    .line 23
    invoke-virtual {p1}, Lio/sentry/android/core/performance/h;->d()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    iget-wide v2, p1, Lio/sentry/android/core/performance/h;->b:J

    .line 30
    .line 31
    invoke-virtual {p1}, Lio/sentry/android/core/performance/h;->a()J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    add-long/2addr v4, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-wide/16 v4, 0x0

    .line 38
    .line 39
    :goto_0
    const-wide/32 v2, 0xf4240

    .line 40
    .line 41
    .line 42
    mul-long/2addr v4, v2

    .line 43
    invoke-direct {v1, v4, v5}, Lio/sentry/r5;-><init>(J)V

    .line 44
    .line 45
    .line 46
    move-object p1, v1

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move-object p1, v0

    .line 49
    :goto_1
    iget-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->U:Lio/sentry/k1;

    .line 56
    .line 57
    invoke-static {v1, p1, v0}, Lio/sentry/android/core/ActivityLifecycleIntegration;->g(Lio/sentry/k1;Lio/sentry/t4;Lio/sentry/f7;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->V:Lio/sentry/m1;

    .line 61
    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    invoke-interface {v0}, Lio/sentry/k1;->d()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_3

    .line 69
    .line 70
    iget-object p0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->V:Lio/sentry/m1;

    .line 71
    .line 72
    sget-object v0, Lio/sentry/f7;->OK:Lio/sentry/f7;

    .line 73
    .line 74
    invoke-interface {p0, v0, p1}, Lio/sentry/k1;->v(Lio/sentry/f7;Lio/sentry/t4;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    iget-object p0, p0, Lio/sentry/android/core/performance/g;->i0:Lio/sentry/android/core/o0;

    .line 82
    .line 83
    iget-object p0, p0, Lio/sentry/android/core/o0;->a:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p0, Lio/sentry/util/a;

    .line 86
    .line 87
    invoke-virtual {p0}, Lio/sentry/util/a;->c()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lio/sentry/util/a;->close()V

    .line 91
    .line 92
    .line 93
    :cond_4
    return-void
.end method

.method public final close()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->a:Landroid/app/Application;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, v0, Lio/sentry/android/core/performance/g;->c0:Lx6;

    .line 12
    .line 13
    iget-object v0, v0, Lio/sentry/android/core/performance/g;->i0:Lio/sentry/android/core/o0;

    .line 14
    .line 15
    iget-object v0, v0, Lio/sentry/android/core/o0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lio/sentry/util/a;

    .line 18
    .line 19
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    new-array v2, v2, [Ljava/lang/Object;

    .line 37
    .line 38
    const-string v3, "ActivityLifecycleIntegration removed."

    .line 39
    .line 40
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    iget-object p0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->c0:Lio/sentry/android/core/d;

    .line 44
    .line 45
    iget-object v0, p0, Lio/sentry/android/core/d;->g:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lio/sentry/util/a;

    .line 48
    .line 49
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 50
    .line 51
    .line 52
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/android/core/d;->e()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    new-instance v1, Lf72;

    .line 59
    .line 60
    const/16 v2, 0x11

    .line 61
    .line 62
    invoke-direct {v1, p0, v2}, Lf72;-><init>(Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    const-string v2, "FrameMetricsAggregator.stop"

    .line 66
    .line 67
    invoke-virtual {p0, v1, v2}, Lio/sentry/android/core/d;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Lio/sentry/android/core/d;->a:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, Lio/sentry/util/g;

    .line 73
    .line 74
    invoke-virtual {v1}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Landroidx/core/app/FrameMetricsAggregator;

    .line 79
    .line 80
    iget-object v1, v1, Landroidx/core/app/FrameMetricsAggregator;->a:Lur3;

    .line 81
    .line 82
    iget-object v2, v1, Lur3;->b:Ljava/lang/Object;

    .line 83
    .line 84
    const/16 v2, 0x9

    .line 85
    .line 86
    new-array v2, v2, [Landroid/util/SparseIntArray;

    .line 87
    .line 88
    iput-object v2, v1, Lur3;->b:Ljava/lang/Object;

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catchall_0
    move-exception p0

    .line 92
    goto :goto_1

    .line 93
    :cond_1
    :goto_0
    iget-object p0, p0, Lio/sentry/android/core/d;->d:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :catchall_1
    move-exception v0

    .line 109
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    :goto_2
    throw p0
.end method

.method public final h(Lio/sentry/m1;Lio/sentry/k1;Lio/sentry/k1;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    invoke-interface {p1}, Lio/sentry/k1;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Lio/sentry/f7;->DEADLINE_EXCEEDED:Lio/sentry/f7;

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    invoke-interface {p2}, Lio/sentry/k1;->d()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    invoke-interface {p2, v0}, Lio/sentry/k1;->f(Lio/sentry/f7;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-static {p3, p2}, Lio/sentry/android/core/ActivityLifecycleIntegration;->f(Lio/sentry/k1;Lio/sentry/k1;)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->a0:Ljava/util/concurrent/Future;

    .line 27
    .line 28
    if-eqz p2, :cond_2

    .line 29
    .line 30
    const/4 p3, 0x0

    .line 31
    invoke-interface {p2, p3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 32
    .line 33
    .line 34
    const/4 p2, 0x0

    .line 35
    iput-object p2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->a0:Ljava/util/concurrent/Future;

    .line 36
    .line 37
    :cond_2
    invoke-interface {p1}, Lio/sentry/k1;->getStatus()Lio/sentry/f7;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-nez p2, :cond_3

    .line 42
    .line 43
    sget-object p2, Lio/sentry/f7;->OK:Lio/sentry/f7;

    .line 44
    .line 45
    :cond_3
    invoke-interface {p1, p2}, Lio/sentry/k1;->f(Lio/sentry/f7;)V

    .line 46
    .line 47
    .line 48
    iget-object p2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/h4;

    .line 49
    .line 50
    if-eqz p2, :cond_4

    .line 51
    .line 52
    new-instance p3, Lx6;

    .line 53
    .line 54
    const/16 v0, 0x1b

    .line 55
    .line 56
    invoke-direct {p3, v0, p0, p1}, Lx6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, p3}, Lio/sentry/h4;->r(Lio/sentry/d4;)V

    .line 60
    .line 61
    .line 62
    :cond_4
    :goto_0
    return-void
.end method

.method public final i(Lio/sentry/k1;Lio/sentry/k1;)V
    .locals 10

    .line 1
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, Lio/sentry/android/core/performance/g;->d:Lio/sentry/android/core/performance/h;

    .line 6
    .line 7
    iget-object p1, p1, Lio/sentry/android/core/performance/g;->e:Lio/sentry/android/core/performance/h;

    .line 8
    .line 9
    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Lio/sentry/m6;->getDateProvider()Lio/sentry/u4;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Lio/sentry/u4;->a()Lio/sentry/t4;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v1, v2

    .line 24
    :goto_0
    invoke-virtual {v0}, Lio/sentry/android/core/performance/h;->d()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const-wide/32 v4, 0xf4240

    .line 29
    .line 30
    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0}, Lio/sentry/android/core/performance/h;->c()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    invoke-virtual {v0}, Lio/sentry/android/core/performance/h;->b()Lio/sentry/r5;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    invoke-virtual {v1, v3}, Lio/sentry/t4;->b(Lio/sentry/t4;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v6

    .line 51
    div-long/2addr v6, v4

    .line 52
    iget-wide v8, v0, Lio/sentry/android/core/performance/h;->c:J

    .line 53
    .line 54
    add-long/2addr v8, v6

    .line 55
    iput-wide v8, v0, Lio/sentry/android/core/performance/h;->d:J

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 59
    .line 60
    .line 61
    move-result-wide v6

    .line 62
    iput-wide v6, v0, Lio/sentry/android/core/performance/h;->d:J

    .line 63
    .line 64
    :cond_2
    :goto_1
    invoke-virtual {p1}, Lio/sentry/android/core/performance/h;->d()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    invoke-virtual {p1}, Lio/sentry/android/core/performance/h;->c()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    invoke-virtual {p1}, Lio/sentry/android/core/performance/h;->b()Lio/sentry/r5;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    invoke-virtual {v1, v0}, Lio/sentry/t4;->b(Lio/sentry/t4;)J

    .line 85
    .line 86
    .line 87
    move-result-wide v6

    .line 88
    div-long/2addr v6, v4

    .line 89
    iget-wide v8, p1, Lio/sentry/android/core/performance/h;->c:J

    .line 90
    .line 91
    add-long/2addr v8, v6

    .line 92
    iput-wide v8, p1, Lio/sentry/android/core/performance/h;->d:J

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 96
    .line 97
    .line 98
    move-result-wide v6

    .line 99
    iput-wide v6, p1, Lio/sentry/android/core/performance/h;->d:J

    .line 100
    .line 101
    :cond_4
    :goto_2
    invoke-virtual {p0, v1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->c(Lio/sentry/t4;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e0:Lio/sentry/util/a;

    .line 105
    .line 106
    invoke-virtual {p1}, Lio/sentry/util/a;->c()V

    .line 107
    .line 108
    .line 109
    :try_start_0
    iget-object p0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 110
    .line 111
    if-eqz p0, :cond_5

    .line 112
    .line 113
    if-eqz p2, :cond_5

    .line 114
    .line 115
    if-eqz v1, :cond_5

    .line 116
    .line 117
    invoke-interface {p2}, Lio/sentry/k1;->w()Lio/sentry/t4;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {v1, p0}, Lio/sentry/t4;->b(Lio/sentry/t4;)J

    .line 122
    .line 123
    .line 124
    move-result-wide v6

    .line 125
    div-long/2addr v6, v4

    .line 126
    const-string p0, "time_to_initial_display"

    .line 127
    .line 128
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    sget-object v3, Lio/sentry/j2;->MILLISECOND:Lio/sentry/j2;

    .line 133
    .line 134
    invoke-interface {p2, p0, v0, v3}, Lio/sentry/k1;->r(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/j2;)V

    .line 135
    .line 136
    .line 137
    invoke-static {p2, v1, v2}, Lio/sentry/android/core/ActivityLifecycleIntegration;->g(Lio/sentry/k1;Lio/sentry/t4;Lio/sentry/f7;)V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :catchall_0
    move-exception p0

    .line 142
    goto :goto_4

    .line 143
    :cond_5
    if-eqz p2, :cond_6

    .line 144
    .line 145
    invoke-interface {p2}, Lio/sentry/k1;->d()Z

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-nez p0, :cond_6

    .line 150
    .line 151
    invoke-interface {p2}, Lio/sentry/k1;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    .line 153
    .line 154
    :cond_6
    :goto_3
    invoke-virtual {p1}, Lio/sentry/util/a;->close()V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :goto_4
    :try_start_1
    invoke-virtual {p1}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 159
    .line 160
    .line 161
    goto :goto_5

    .line 162
    :catchall_1
    move-exception p1

    .line 163
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    :goto_5
    throw p0
.end method

.method public final k(Landroid/app/Activity;)V
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v3, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/h4;

    .line 11
    .line 12
    if-eqz v3, :cond_1f

    .line 13
    .line 14
    iget-object v3, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->b0:Ljava/util/WeakHashMap;

    .line 15
    .line 16
    invoke-virtual {v3, v2}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-nez v4, :cond_1f

    .line 21
    .line 22
    iget-boolean v4, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    sget-object v0, Lio/sentry/f3;->a:Lio/sentry/f3;

    .line 27
    .line 28
    invoke-virtual {v3, v2, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    iget-object v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 32
    .line 33
    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAutoTraceIdGeneration()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1f

    .line 38
    .line 39
    iget-object v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/h4;

    .line 40
    .line 41
    new-instance v1, Lio/sentry/u2;

    .line 42
    .line 43
    const/16 v2, 0x16

    .line 44
    .line 45
    invoke-direct {v1, v2}, Lio/sentry/u2;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lio/sentry/h4;->r(Lio/sentry/d4;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    invoke-virtual {v3}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    iget-object v6, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->X:Ljava/util/WeakHashMap;

    .line 65
    .line 66
    iget-object v7, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->W:Ljava/util/WeakHashMap;

    .line 67
    .line 68
    if-eqz v5, :cond_1

    .line 69
    .line 70
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Ljava/util/Map$Entry;

    .line 75
    .line 76
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    check-cast v8, Lio/sentry/m1;

    .line 81
    .line 82
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    invoke-virtual {v7, v9}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    check-cast v7, Lio/sentry/k1;

    .line 91
    .line 92
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual {v6, v5}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    check-cast v5, Lio/sentry/k1;

    .line 101
    .line 102
    invoke-virtual {v1, v8, v7, v5}, Lio/sentry/android/core/ActivityLifecycleIntegration;->h(Lio/sentry/m1;Lio/sentry/k1;Lio/sentry/k1;)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    iget-object v8, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 119
    .line 120
    invoke-virtual {v5, v8}, Lio/sentry/android/core/performance/g;->b(Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/performance/h;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-static {}, Lio/sentry/android/core/n0;->j()Z

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    const/4 v10, 0x1

    .line 129
    const/4 v11, 0x0

    .line 130
    if-eqz v8, :cond_3

    .line 131
    .line 132
    invoke-virtual {v5}, Lio/sentry/android/core/performance/h;->d()Z

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    if-eqz v8, :cond_3

    .line 137
    .line 138
    invoke-virtual {v5}, Lio/sentry/android/core/performance/h;->b()Lio/sentry/r5;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    iget-object v8, v8, Lio/sentry/android/core/performance/g;->a:Lio/sentry/android/core/performance/f;

    .line 147
    .line 148
    sget-object v12, Lio/sentry/android/core/performance/f;->COLD:Lio/sentry/android/core/performance/f;

    .line 149
    .line 150
    if-ne v8, v12, :cond_2

    .line 151
    .line 152
    move v8, v10

    .line 153
    goto :goto_1

    .line 154
    :cond_2
    const/4 v8, 0x0

    .line 155
    :goto_1
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    move-object v15, v5

    .line 160
    goto :goto_2

    .line 161
    :cond_3
    move-object v8, v11

    .line 162
    move-object v15, v8

    .line 163
    :goto_2
    new-instance v5, Lio/sentry/k7;

    .line 164
    .line 165
    invoke-direct {v5}, Lio/sentry/k7;-><init>()V

    .line 166
    .line 167
    .line 168
    iget-object v12, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 169
    .line 170
    invoke-virtual {v12}, Lio/sentry/m6;->getDeadlineTimeout()J

    .line 171
    .line 172
    .line 173
    move-result-wide v12

    .line 174
    const-wide/16 v16, 0x0

    .line 175
    .line 176
    cmp-long v14, v12, v16

    .line 177
    .line 178
    if-gtz v14, :cond_4

    .line 179
    .line 180
    move-object v12, v11

    .line 181
    goto :goto_3

    .line 182
    :cond_4
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 183
    .line 184
    .line 185
    move-result-object v12

    .line 186
    :goto_3
    iput-object v12, v5, Lio/sentry/k7;->h:Ljava/lang/Long;

    .line 187
    .line 188
    iget-object v12, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 189
    .line 190
    invoke-virtual {v12}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableActivityLifecycleTracingAutoFinish()Z

    .line 191
    .line 192
    .line 193
    move-result v12

    .line 194
    if-eqz v12, :cond_5

    .line 195
    .line 196
    iget-object v12, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 197
    .line 198
    invoke-virtual {v12}, Lio/sentry/m6;->getIdleTimeout()Ljava/lang/Long;

    .line 199
    .line 200
    .line 201
    move-result-object v12

    .line 202
    iput-object v12, v5, Lio/sentry/k7;->g:Ljava/lang/Long;

    .line 203
    .line 204
    iput-boolean v10, v5, Lio/sentry/e7;->c:Z

    .line 205
    .line 206
    :cond_5
    iput-boolean v10, v5, Lio/sentry/k7;->f:Z

    .line 207
    .line 208
    new-instance v12, Lio/sentry/android/core/e;

    .line 209
    .line 210
    invoke-direct {v12, v1, v0, v4}, Lio/sentry/android/core/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    iput-object v12, v5, Lio/sentry/k7;->i:Lio/sentry/android/core/e;

    .line 214
    .line 215
    iget-boolean v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->v:Z

    .line 216
    .line 217
    if-nez v0, :cond_6

    .line 218
    .line 219
    if-eqz v15, :cond_6

    .line 220
    .line 221
    if-eqz v8, :cond_6

    .line 222
    .line 223
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    iget-object v0, v0, Lio/sentry/android/core/performance/g;->V:Lio/sentry/t3;

    .line 228
    .line 229
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 230
    .line 231
    .line 232
    move-result-object v12

    .line 233
    iput-object v11, v12, Lio/sentry/android/core/performance/g;->V:Lio/sentry/t3;

    .line 234
    .line 235
    move-object v13, v0

    .line 236
    move-object v12, v15

    .line 237
    goto :goto_4

    .line 238
    :cond_6
    iget-object v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->Z:Lio/sentry/t4;

    .line 239
    .line 240
    move-object v12, v0

    .line 241
    move-object v13, v11

    .line 242
    :goto_4
    iput-object v12, v5, Lio/sentry/e7;->a:Lio/sentry/t4;

    .line 243
    .line 244
    if-eqz v13, :cond_7

    .line 245
    .line 246
    move v0, v10

    .line 247
    goto :goto_5

    .line 248
    :cond_7
    const/4 v0, 0x0

    .line 249
    :goto_5
    iput-boolean v0, v5, Lio/sentry/k7;->e:Z

    .line 250
    .line 251
    const-string v14, "auto.ui.activity"

    .line 252
    .line 253
    iput-object v14, v5, Lio/sentry/e7;->d:Ljava/lang/String;

    .line 254
    .line 255
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    iget-object v0, v0, Lio/sentry/android/core/performance/g;->i0:Lio/sentry/android/core/o0;

    .line 260
    .line 261
    iget-object v0, v0, Lio/sentry/android/core/o0;->a:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v0, Lio/sentry/util/a;

    .line 264
    .line 265
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 269
    .line 270
    .line 271
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    iget-object v0, v0, Lio/sentry/android/core/performance/g;->d0:Lio/sentry/protocol/w;

    .line 276
    .line 277
    if-eqz v0, :cond_8

    .line 278
    .line 279
    move/from16 v16, v10

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_8
    const/16 v16, 0x0

    .line 283
    .line 284
    :goto_6
    iget-boolean v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->v:Z

    .line 285
    .line 286
    if-nez v0, :cond_9

    .line 287
    .line 288
    if-eqz v15, :cond_9

    .line 289
    .line 290
    if-eqz v8, :cond_9

    .line 291
    .line 292
    move/from16 v17, v10

    .line 293
    .line 294
    goto :goto_7

    .line 295
    :cond_9
    const/16 v17, 0x0

    .line 296
    .line 297
    :goto_7
    if-eqz v17, :cond_a

    .line 298
    .line 299
    iget-object v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 300
    .line 301
    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableStandaloneAppStartTracing()Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-eqz v0, :cond_a

    .line 306
    .line 307
    if-nez v16, :cond_a

    .line 308
    .line 309
    move/from16 v18, v10

    .line 310
    .line 311
    goto :goto_8

    .line 312
    :cond_a
    const/16 v18, 0x0

    .line 313
    .line 314
    :goto_8
    if-eqz v18, :cond_c

    .line 315
    .line 316
    new-instance v0, Lio/sentry/k7;

    .line 317
    .line 318
    invoke-direct {v0}, Lio/sentry/k7;-><init>()V

    .line 319
    .line 320
    .line 321
    sget-object v10, Lio/sentry/c4;->OFF:Lio/sentry/c4;

    .line 322
    .line 323
    iput-object v10, v0, Lio/sentry/e7;->b:Lio/sentry/c4;

    .line 324
    .line 325
    iput-object v15, v0, Lio/sentry/e7;->a:Lio/sentry/t4;

    .line 326
    .line 327
    if-eqz v13, :cond_b

    .line 328
    .line 329
    const/4 v10, 0x1

    .line 330
    goto :goto_9

    .line 331
    :cond_b
    const/4 v10, 0x0

    .line 332
    :goto_9
    iput-boolean v10, v0, Lio/sentry/k7;->e:Z

    .line 333
    .line 334
    const-string v10, "auto.app.start"

    .line 335
    .line 336
    iput-object v10, v0, Lio/sentry/e7;->d:Ljava/lang/String;

    .line 337
    .line 338
    iget-object v10, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/h4;

    .line 339
    .line 340
    new-instance v11, Lio/sentry/j7;

    .line 341
    .line 342
    sget-object v9, Lio/sentry/protocol/i0;->COMPONENT:Lio/sentry/protocol/i0;

    .line 343
    .line 344
    move-object/from16 v21, v8

    .line 345
    .line 346
    const-string v8, "app.start"

    .line 347
    .line 348
    move-object/from16 v22, v15

    .line 349
    .line 350
    const-string v15, "App Start"

    .line 351
    .line 352
    invoke-direct {v11, v15, v9, v8, v13}, Lio/sentry/j7;-><init>(Ljava/lang/String;Lio/sentry/protocol/i0;Ljava/lang/String;Lio/sentry/t3;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v10, v11, v0}, Lio/sentry/h4;->q(Lio/sentry/j7;Lio/sentry/k7;)Lio/sentry/m1;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    iput-object v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->V:Lio/sentry/m1;

    .line 360
    .line 361
    const-string v8, "app.vitals.start.screen"

    .line 362
    .line 363
    invoke-interface {v0, v4, v8}, Lio/sentry/k1;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-virtual {v0}, Lio/sentry/android/core/performance/g;->a()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    if-eqz v0, :cond_d

    .line 375
    .line 376
    iget-object v8, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->V:Lio/sentry/m1;

    .line 377
    .line 378
    const-string v9, "app.vitals.start.reason"

    .line 379
    .line 380
    invoke-interface {v8, v0, v9}, Lio/sentry/k1;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    goto :goto_a

    .line 384
    :cond_c
    move-object/from16 v21, v8

    .line 385
    .line 386
    move-object/from16 v22, v15

    .line 387
    .line 388
    :cond_d
    :goto_a
    if-eqz v18, :cond_f

    .line 389
    .line 390
    iget-object v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->V:Lio/sentry/m1;

    .line 391
    .line 392
    invoke-interface {v0}, Lio/sentry/k1;->b()Lio/sentry/t6;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-virtual {v0}, Lio/sentry/t6;->a()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    iget-object v8, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->V:Lio/sentry/m1;

    .line 401
    .line 402
    invoke-interface {v8}, Lio/sentry/k1;->k()Lio/sentry/d;

    .line 403
    .line 404
    .line 405
    move-result-object v8

    .line 406
    if-nez v8, :cond_e

    .line 407
    .line 408
    goto :goto_c

    .line 409
    :cond_e
    iget-object v8, v8, Lio/sentry/d;->a:Ljava/lang/String;

    .line 410
    .line 411
    goto :goto_d

    .line 412
    :cond_f
    if-eqz v16, :cond_11

    .line 413
    .line 414
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    iget-object v0, v0, Lio/sentry/android/core/performance/g;->g0:Lio/sentry/t4;

    .line 419
    .line 420
    if-nez v0, :cond_10

    .line 421
    .line 422
    goto :goto_b

    .line 423
    :cond_10
    invoke-virtual {v12, v0}, Lio/sentry/t4;->b(Lio/sentry/t4;)J

    .line 424
    .line 425
    .line 426
    move-result-wide v8

    .line 427
    const-wide v10, 0xdf8475800L

    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    cmp-long v0, v8, v10

    .line 433
    .line 434
    if-gtz v0, :cond_11

    .line 435
    .line 436
    :goto_b
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    iget-object v0, v0, Lio/sentry/android/core/performance/g;->e0:Ljava/lang/String;

    .line 441
    .line 442
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 443
    .line 444
    .line 445
    move-result-object v8

    .line 446
    iget-object v8, v8, Lio/sentry/android/core/performance/g;->f0:Ljava/lang/String;

    .line 447
    .line 448
    goto :goto_d

    .line 449
    :cond_11
    const/4 v0, 0x0

    .line 450
    :goto_c
    const/4 v8, 0x0

    .line 451
    :goto_d
    const-string v9, "ui.load"

    .line 452
    .line 453
    if-nez v0, :cond_13

    .line 454
    .line 455
    :cond_12
    :goto_e
    move-object/from16 v20, v12

    .line 456
    .line 457
    const/4 v0, 0x0

    .line 458
    goto/16 :goto_15

    .line 459
    .line 460
    :cond_13
    iget-object v10, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 461
    .line 462
    if-eqz v10, :cond_12

    .line 463
    .line 464
    invoke-virtual {v10}, Lio/sentry/m6;->isTracingEnabled()Z

    .line 465
    .line 466
    .line 467
    move-result v10

    .line 468
    if-nez v10, :cond_14

    .line 469
    .line 470
    goto :goto_e

    .line 471
    :cond_14
    iget-object v10, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 472
    .line 473
    invoke-virtual {v10}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 474
    .line 475
    .line 476
    move-result-object v10

    .line 477
    if-nez v8, :cond_15

    .line 478
    .line 479
    const/4 v8, 0x0

    .line 480
    goto :goto_f

    .line 481
    :cond_15
    invoke-static {v8}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 482
    .line 483
    .line 484
    move-result-object v8

    .line 485
    :goto_f
    iget-object v11, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 486
    .line 487
    :try_start_0
    new-instance v15, Lio/sentry/t6;

    .line 488
    .line 489
    invoke-direct {v15, v0}, Lio/sentry/t6;-><init>(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    if-eqz v8, :cond_16

    .line 493
    .line 494
    sget-object v0, Lio/sentry/c;->i:Lg5;

    .line 495
    .line 496
    invoke-static {v8}, Lio/sentry/util/o;->c(Ljava/util/List;)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    const/4 v8, 0x0

    .line 501
    invoke-static {v10, v0, v8}, Lio/sentry/c;->a(Lio/sentry/ILogger;Ljava/lang/String;Z)Lio/sentry/c;

    .line 502
    .line 503
    .line 504
    move-result-object v0
    :try_end_0
    .catch Lio/sentry/exception/b; {:try_start_0 .. :try_end_0} :catch_1

    .line 505
    move-object/from16 v20, v12

    .line 506
    .line 507
    goto :goto_10

    .line 508
    :cond_16
    move-object/from16 v20, v12

    .line 509
    .line 510
    const/4 v8, 0x0

    .line 511
    const/4 v12, 0x0

    .line 512
    :try_start_1
    invoke-static {v10, v12, v8}, Lio/sentry/c;->a(Lio/sentry/ILogger;Ljava/lang/String;Z)Lio/sentry/c;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    :goto_10
    invoke-static {v15, v0, v11}, Lio/sentry/t3;->a(Lio/sentry/t6;Lio/sentry/c;Lio/sentry/m6;)Lio/sentry/t3;

    .line 517
    .line 518
    .line 519
    move-result-object v0
    :try_end_1
    .catch Lio/sentry/exception/b; {:try_start_1 .. :try_end_1} :catch_0

    .line 520
    goto :goto_12

    .line 521
    :catch_0
    move-exception v0

    .line 522
    goto :goto_11

    .line 523
    :catch_1
    move-exception v0

    .line 524
    move-object/from16 v20, v12

    .line 525
    .line 526
    :goto_11
    sget-object v8, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 527
    .line 528
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v11

    .line 532
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v11

    .line 536
    const-string v12, "Failed to parse Sentry trace header: %s"

    .line 537
    .line 538
    invoke-interface {v10, v8, v0, v12, v11}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    new-instance v0, Lio/sentry/t3;

    .line 542
    .line 543
    invoke-direct {v0}, Lio/sentry/t3;-><init>()V

    .line 544
    .line 545
    .line 546
    :goto_12
    iget-object v8, v0, Lio/sentry/t3;->a:Ljava/io/Serializable;

    .line 547
    .line 548
    check-cast v8, Ljava/lang/Boolean;

    .line 549
    .line 550
    iget-object v10, v0, Lio/sentry/t3;->e:Ljava/lang/Object;

    .line 551
    .line 552
    check-cast v10, Lio/sentry/c;

    .line 553
    .line 554
    if-nez v8, :cond_17

    .line 555
    .line 556
    const/16 v27, 0x0

    .line 557
    .line 558
    goto :goto_14

    .line 559
    :cond_17
    new-instance v11, Lio/sentry/t3;

    .line 560
    .line 561
    iget-object v12, v10, Lio/sentry/c;->c:Ljava/lang/Double;

    .line 562
    .line 563
    iget-object v15, v10, Lio/sentry/c;->d:Ljava/lang/Double;

    .line 564
    .line 565
    if-nez v15, :cond_18

    .line 566
    .line 567
    const-wide/16 v23, 0x0

    .line 568
    .line 569
    goto :goto_13

    .line 570
    :cond_18
    invoke-virtual {v15}, Ljava/lang/Double;->doubleValue()D

    .line 571
    .line 572
    .line 573
    move-result-wide v23

    .line 574
    :goto_13
    invoke-static/range {v23 .. v24}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 575
    .line 576
    .line 577
    move-result-object v15

    .line 578
    invoke-direct {v11, v8, v12, v15}, Lio/sentry/t3;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)V

    .line 579
    .line 580
    .line 581
    move-object/from16 v27, v11

    .line 582
    .line 583
    :goto_14
    new-instance v23, Lio/sentry/j7;

    .line 584
    .line 585
    iget-object v8, v0, Lio/sentry/t3;->b:Ljava/lang/Object;

    .line 586
    .line 587
    move-object/from16 v24, v8

    .line 588
    .line 589
    check-cast v24, Lio/sentry/protocol/w;

    .line 590
    .line 591
    iget-object v0, v0, Lio/sentry/t3;->c:Ljava/lang/Object;

    .line 592
    .line 593
    move-object/from16 v25, v0

    .line 594
    .line 595
    check-cast v25, Lio/sentry/d7;

    .line 596
    .line 597
    const/16 v26, 0x0

    .line 598
    .line 599
    move-object/from16 v28, v10

    .line 600
    .line 601
    invoke-direct/range {v23 .. v28}, Lio/sentry/j7;-><init>(Lio/sentry/protocol/w;Lio/sentry/d7;Lio/sentry/d7;Lio/sentry/t3;Lio/sentry/c;)V

    .line 602
    .line 603
    .line 604
    move-object/from16 v0, v23

    .line 605
    .line 606
    iput-object v4, v0, Lio/sentry/j7;->a0:Ljava/lang/String;

    .line 607
    .line 608
    sget-object v8, Lio/sentry/protocol/i0;->COMPONENT:Lio/sentry/protocol/i0;

    .line 609
    .line 610
    iput-object v8, v0, Lio/sentry/j7;->b0:Lio/sentry/protocol/i0;

    .line 611
    .line 612
    iput-object v9, v0, Lio/sentry/b7;->e:Ljava/lang/String;

    .line 613
    .line 614
    :goto_15
    iget-object v8, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/h4;

    .line 615
    .line 616
    if-eqz v0, :cond_19

    .line 617
    .line 618
    invoke-virtual {v8, v0, v5}, Lio/sentry/h4;->q(Lio/sentry/j7;Lio/sentry/k7;)Lio/sentry/m1;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    :goto_16
    move-object v12, v0

    .line 623
    goto :goto_17

    .line 624
    :cond_19
    new-instance v0, Lio/sentry/j7;

    .line 625
    .line 626
    sget-object v10, Lio/sentry/protocol/i0;->COMPONENT:Lio/sentry/protocol/i0;

    .line 627
    .line 628
    invoke-direct {v0, v4, v10, v9, v13}, Lio/sentry/j7;-><init>(Ljava/lang/String;Lio/sentry/protocol/i0;Ljava/lang/String;Lio/sentry/t3;)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v8, v0, v5}, Lio/sentry/h4;->q(Lio/sentry/j7;Lio/sentry/k7;)Lio/sentry/m1;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    goto :goto_16

    .line 636
    :goto_17
    if-nez v16, :cond_1a

    .line 637
    .line 638
    goto :goto_18

    .line 639
    :cond_1a
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    const/4 v5, 0x0

    .line 644
    iput-object v5, v0, Lio/sentry/android/core/performance/g;->d0:Lio/sentry/protocol/w;

    .line 645
    .line 646
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    iput-object v5, v0, Lio/sentry/android/core/performance/g;->e0:Ljava/lang/String;

    .line 651
    .line 652
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    iput-object v5, v0, Lio/sentry/android/core/performance/g;->f0:Ljava/lang/String;

    .line 657
    .line 658
    :goto_18
    new-instance v0, Lio/sentry/e7;

    .line 659
    .line 660
    invoke-direct {v0}, Lio/sentry/e7;-><init>()V

    .line 661
    .line 662
    .line 663
    iput-object v14, v0, Lio/sentry/e7;->d:Ljava/lang/String;

    .line 664
    .line 665
    if-eqz v17, :cond_1d

    .line 666
    .line 667
    if-nez v18, :cond_1d

    .line 668
    .line 669
    iget-object v5, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 670
    .line 671
    invoke-virtual {v5}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableStandaloneAppStartTracing()Z

    .line 672
    .line 673
    .line 674
    move-result v5

    .line 675
    if-nez v5, :cond_1d

    .line 676
    .line 677
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Boolean;->booleanValue()Z

    .line 678
    .line 679
    .line 680
    move-result v5

    .line 681
    if-eqz v5, :cond_1b

    .line 682
    .line 683
    const-string v5, "app.start.cold"

    .line 684
    .line 685
    :goto_19
    move-object v13, v5

    .line 686
    goto :goto_1a

    .line 687
    :cond_1b
    const-string v5, "app.start.warm"

    .line 688
    .line 689
    goto :goto_19

    .line 690
    :goto_1a
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Boolean;->booleanValue()Z

    .line 691
    .line 692
    .line 693
    move-result v5

    .line 694
    if-eqz v5, :cond_1c

    .line 695
    .line 696
    const-string v5, "Cold Start"

    .line 697
    .line 698
    :goto_1b
    move-object v14, v5

    .line 699
    goto :goto_1c

    .line 700
    :cond_1c
    const-string v5, "Warm Start"

    .line 701
    .line 702
    goto :goto_1b

    .line 703
    :goto_1c
    sget-object v16, Lio/sentry/r1;->SENTRY:Lio/sentry/r1;

    .line 704
    .line 705
    move-object/from16 v17, v0

    .line 706
    .line 707
    move-object/from16 v15, v22

    .line 708
    .line 709
    invoke-interface/range {v12 .. v17}, Lio/sentry/k1;->n(Ljava/lang/String;Ljava/lang/String;Lio/sentry/t4;Lio/sentry/r1;Lio/sentry/e7;)Lio/sentry/k1;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    move-object/from16 v16, v12

    .line 714
    .line 715
    move-object/from16 v21, v17

    .line 716
    .line 717
    iput-object v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->U:Lio/sentry/k1;

    .line 718
    .line 719
    const/4 v5, 0x0

    .line 720
    invoke-virtual {v1, v5}, Lio/sentry/android/core/ActivityLifecycleIntegration;->c(Lio/sentry/t4;)V

    .line 721
    .line 722
    .line 723
    goto :goto_1d

    .line 724
    :cond_1d
    move-object/from16 v21, v0

    .line 725
    .line 726
    move-object/from16 v16, v12

    .line 727
    .line 728
    :goto_1d
    const-string v0, " initial display"

    .line 729
    .line 730
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v18

    .line 734
    move-object/from16 v19, v20

    .line 735
    .line 736
    sget-object v20, Lio/sentry/r1;->SENTRY:Lio/sentry/r1;

    .line 737
    .line 738
    const-string v17, "ui.load.initial_display"

    .line 739
    .line 740
    invoke-interface/range {v16 .. v21}, Lio/sentry/k1;->n(Ljava/lang/String;Ljava/lang/String;Lio/sentry/t4;Lio/sentry/r1;Lio/sentry/e7;)Lio/sentry/k1;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-virtual {v7, v2, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    iget-boolean v5, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->f:Z

    .line 748
    .line 749
    if-eqz v5, :cond_1e

    .line 750
    .line 751
    iget-object v5, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->w:Lio/sentry/h0;

    .line 752
    .line 753
    if-eqz v5, :cond_1e

    .line 754
    .line 755
    iget-object v5, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 756
    .line 757
    if-eqz v5, :cond_1e

    .line 758
    .line 759
    const-string v5, " full display"

    .line 760
    .line 761
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v18

    .line 765
    const-string v17, "ui.load.full_display"

    .line 766
    .line 767
    invoke-interface/range {v16 .. v21}, Lio/sentry/k1;->n(Ljava/lang/String;Ljava/lang/String;Lio/sentry/t4;Lio/sentry/r1;Lio/sentry/e7;)Lio/sentry/k1;

    .line 768
    .line 769
    .line 770
    move-result-object v4

    .line 771
    move-object/from16 v12, v16

    .line 772
    .line 773
    :try_start_2
    invoke-virtual {v6, v2, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    iget-object v5, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 777
    .line 778
    invoke-virtual {v5}, Lio/sentry/m6;->getExecutorService()Lio/sentry/g1;

    .line 779
    .line 780
    .line 781
    move-result-object v5

    .line 782
    new-instance v6, Lji1;

    .line 783
    .line 784
    invoke-direct {v6, v1, v4, v0}, Lji1;-><init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Lio/sentry/k1;Lio/sentry/k1;)V

    .line 785
    .line 786
    .line 787
    const-wide/16 v7, 0x61a8

    .line 788
    .line 789
    invoke-interface {v5, v6, v7, v8}, Lio/sentry/g1;->b(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    iput-object v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->a0:Ljava/util/concurrent/Future;
    :try_end_2
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_2 .. :try_end_2} :catch_2

    .line 794
    .line 795
    goto :goto_1e

    .line 796
    :catch_2
    move-exception v0

    .line 797
    iget-object v4, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 798
    .line 799
    invoke-virtual {v4}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 800
    .line 801
    .line 802
    move-result-object v4

    .line 803
    sget-object v5, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 804
    .line 805
    const-string v6, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?"

    .line 806
    .line 807
    invoke-interface {v4, v5, v6, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 808
    .line 809
    .line 810
    goto :goto_1e

    .line 811
    :cond_1e
    move-object/from16 v12, v16

    .line 812
    .line 813
    :goto_1e
    iget-object v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/h4;

    .line 814
    .line 815
    new-instance v4, Lpn;

    .line 816
    .line 817
    const/16 v5, 0x15

    .line 818
    .line 819
    invoke-direct {v4, v5, v1, v12}, Lpn;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 820
    .line 821
    .line 822
    invoke-virtual {v0, v4}, Lio/sentry/h4;->r(Lio/sentry/d4;)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {v3, v2, v12}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    :cond_1f
    return-void
.end method

.method public final l(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 4

    .line 1
    sget-object v0, Lio/sentry/h4;->a:Lio/sentry/h4;

    .line 2
    .line 3
    iput-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    iput-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/h4;

    .line 6
    .line 7
    invoke-virtual {p1}, Lio/sentry/m6;->isTracingEnabled()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAutoActivityLifecycleTracing()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    move p1, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move p1, v2

    .line 24
    :goto_0
    iput-boolean p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z

    .line 25
    .line 26
    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 27
    .line 28
    invoke-virtual {p1}, Lio/sentry/m6;->getFullyDisplayedReporter()Lio/sentry/h0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->w:Lio/sentry/h0;

    .line 33
    .line 34
    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 35
    .line 36
    invoke-virtual {p1}, Lio/sentry/m6;->isEnableTimeToFullDisplayTracing()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput-boolean p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->f:Z

    .line 41
    .line 42
    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->a:Landroid/app/Application;

    .line 43
    .line 44
    invoke-virtual {p1, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 45
    .line 46
    .line 47
    iget-boolean p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 52
    .line 53
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableStandaloneAppStartTracing()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    new-instance v0, Lx6;

    .line 64
    .line 65
    const/16 v3, 0x19

    .line 66
    .line 67
    invoke-direct {v0, p0, v3}, Lx6;-><init>(Ljava/lang/Object;I)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p1, Lio/sentry/android/core/performance/g;->c0:Lx6;

    .line 71
    .line 72
    iget-boolean v0, p1, Lio/sentry/android/core/performance/g;->W:Z

    .line 73
    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    iget-object v0, p1, Lio/sentry/android/core/performance/g;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_2

    .line 83
    .line 84
    iget-object v0, p1, Lio/sentry/android/core/performance/g;->Z:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_2

    .line 91
    .line 92
    iget-object v0, p1, Lio/sentry/android/core/performance/g;->a0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 93
    .line 94
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Landroid/os/Looper;->getQueue()Landroid/os/MessageQueue;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    new-instance v1, Lio/sentry/android/core/performance/e;

    .line 110
    .line 111
    invoke-direct {v1, p1}, Lio/sentry/android/core/performance/e;-><init>(Lio/sentry/android/core/performance/g;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1}, Landroid/os/MessageQueue;->addIdleHandler(Landroid/os/MessageQueue$IdleHandler;)V

    .line 115
    .line 116
    .line 117
    :cond_2
    :goto_1
    iget-object p1, p1, Lio/sentry/android/core/performance/g;->i0:Lio/sentry/android/core/o0;

    .line 118
    .line 119
    iget-object p1, p1, Lio/sentry/android/core/o0;->a:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p1, Lio/sentry/util/a;

    .line 122
    .line 123
    invoke-virtual {p1}, Lio/sentry/util/a;->c()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Lio/sentry/util/a;->close()V

    .line 127
    .line 128
    .line 129
    const-string p1, "StandaloneAppStart"

    .line 130
    .line 131
    invoke-static {p1}, Lio/sentry/util/c;->a(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :cond_3
    iget-object p0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 135
    .line 136
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    sget-object p1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 141
    .line 142
    const-string v0, "ActivityLifecycleIntegration installed."

    .line 143
    .line 144
    new-array v1, v2, [Ljava/lang/Object;

    .line 145
    .line 146
    invoke-interface {p0, p1, v0, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    const-string p0, "ActivityLifecycle"

    .line 150
    .line 151
    invoke-static {p0}, Lio/sentry/util/c;->a(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/ActivityLifecycleIntegration;->onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d0:Lio/sentry/util/a;

    .line 9
    .line 10
    invoke-virtual {p2}, Lio/sentry/util/a;->c()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/h4;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lio/sentry/m6;->isEnableScreenTracking()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-static {p1}, Lio/sentry/config/a;->k(Landroid/view/KeyEvent$Callback;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/h4;

    .line 32
    .line 33
    new-instance v2, Lx6;

    .line 34
    .line 35
    const/16 v3, 0x1a

    .line 36
    .line 37
    invoke-direct {v2, v0, v3}, Lx6;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lio/sentry/h4;->r(Lio/sentry/d4;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->k(Landroid/app/Activity;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->W:Ljava/util/WeakHashMap;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Lio/sentry/k1;

    .line 56
    .line 57
    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->X:Ljava/util/WeakHashMap;

    .line 58
    .line 59
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lio/sentry/k1;

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    iput-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->v:Z

    .line 67
    .line 68
    iget-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z

    .line 69
    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    iget-object p0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->w:Lio/sentry/h0;

    .line 77
    .line 78
    if-eqz p0, :cond_2

    .line 79
    .line 80
    new-instance p1, Lio/sentry/u2;

    .line 81
    .line 82
    const/16 v0, 0x9

    .line 83
    .line 84
    invoke-direct {p1, v0}, Lio/sentry/u2;-><init>(I)V

    .line 85
    .line 86
    .line 87
    iget-object p0, p0, Lio/sentry/h0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    .line 92
    :cond_2
    invoke-virtual {p2}, Lio/sentry/util/a;->close()V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :goto_1
    :try_start_1
    invoke-virtual {p2}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :catchall_1
    move-exception p1

    .line 101
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    :goto_2
    throw p0
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->X:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->W:Ljava/util/WeakHashMap;

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->Y:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    iget-object v3, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d0:Lio/sentry/util/a;

    .line 8
    .line 9
    invoke-virtual {v3}, Lio/sentry/util/a;->c()V

    .line 10
    .line 11
    .line 12
    :try_start_0
    invoke-virtual {v2, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    check-cast v4, Lio/sentry/android/core/performance/a;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    if-eqz v4, :cond_2

    .line 20
    .line 21
    iget-object v6, v4, Lio/sentry/android/core/performance/a;->d:Lio/sentry/k1;

    .line 22
    .line 23
    if-eqz v6, :cond_0

    .line 24
    .line 25
    invoke-interface {v6}, Lio/sentry/k1;->d()Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-nez v6, :cond_0

    .line 30
    .line 31
    iget-object v6, v4, Lio/sentry/android/core/performance/a;->d:Lio/sentry/k1;

    .line 32
    .line 33
    sget-object v7, Lio/sentry/f7;->CANCELLED:Lio/sentry/f7;

    .line 34
    .line 35
    invoke-interface {v6, v7}, Lio/sentry/k1;->f(Lio/sentry/f7;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    iput-object v5, v4, Lio/sentry/android/core/performance/a;->d:Lio/sentry/k1;

    .line 39
    .line 40
    iget-object v6, v4, Lio/sentry/android/core/performance/a;->e:Lio/sentry/k1;

    .line 41
    .line 42
    if-eqz v6, :cond_1

    .line 43
    .line 44
    invoke-interface {v6}, Lio/sentry/k1;->d()Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-nez v6, :cond_1

    .line 49
    .line 50
    iget-object v6, v4, Lio/sentry/android/core/performance/a;->e:Lio/sentry/k1;

    .line 51
    .line 52
    sget-object v7, Lio/sentry/f7;->CANCELLED:Lio/sentry/f7;

    .line 53
    .line 54
    invoke-interface {v6, v7}, Lio/sentry/k1;->f(Lio/sentry/f7;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    iput-object v5, v4, Lio/sentry/android/core/performance/a;->e:Lio/sentry/k1;

    .line 58
    .line 59
    :cond_2
    iget-boolean v4, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    const/4 v6, 0x0

    .line 62
    iget-object v7, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->b0:Ljava/util/WeakHashMap;

    .line 63
    .line 64
    if-eqz v4, :cond_8

    .line 65
    .line 66
    :try_start_1
    iget-object v4, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->U:Lio/sentry/k1;

    .line 67
    .line 68
    sget-object v8, Lio/sentry/f7;->CANCELLED:Lio/sentry/f7;

    .line 69
    .line 70
    if-eqz v4, :cond_3

    .line 71
    .line 72
    invoke-interface {v4}, Lio/sentry/k1;->d()Z

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    if-nez v9, :cond_3

    .line 77
    .line 78
    invoke-interface {v4, v8}, Lio/sentry/k1;->f(Lio/sentry/f7;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    iget-object v4, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->V:Lio/sentry/m1;

    .line 82
    .line 83
    if-eqz v4, :cond_4

    .line 84
    .line 85
    invoke-interface {v4}, Lio/sentry/k1;->d()Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-nez v4, :cond_4

    .line 90
    .line 91
    iget-object v4, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->V:Lio/sentry/m1;

    .line 92
    .line 93
    invoke-interface {v4, v8}, Lio/sentry/k1;->f(Lio/sentry/f7;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :catchall_0
    move-exception p0

    .line 98
    goto :goto_1

    .line 99
    :cond_4
    :goto_0
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    check-cast v4, Lio/sentry/k1;

    .line 104
    .line 105
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    check-cast v8, Lio/sentry/k1;

    .line 110
    .line 111
    sget-object v9, Lio/sentry/f7;->DEADLINE_EXCEEDED:Lio/sentry/f7;

    .line 112
    .line 113
    if-eqz v4, :cond_5

    .line 114
    .line 115
    invoke-interface {v4}, Lio/sentry/k1;->d()Z

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    if-nez v10, :cond_5

    .line 120
    .line 121
    invoke-interface {v4, v9}, Lio/sentry/k1;->f(Lio/sentry/f7;)V

    .line 122
    .line 123
    .line 124
    :cond_5
    invoke-static {v8, v4}, Lio/sentry/android/core/ActivityLifecycleIntegration;->f(Lio/sentry/k1;Lio/sentry/k1;)V

    .line 125
    .line 126
    .line 127
    iget-object v4, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->a0:Ljava/util/concurrent/Future;

    .line 128
    .line 129
    if-eqz v4, :cond_6

    .line 130
    .line 131
    invoke-interface {v4, v6}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 132
    .line 133
    .line 134
    iput-object v5, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->a0:Ljava/util/concurrent/Future;

    .line 135
    .line 136
    :cond_6
    iget-boolean v4, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z

    .line 137
    .line 138
    if-eqz v4, :cond_7

    .line 139
    .line 140
    invoke-virtual {v7, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    check-cast v4, Lio/sentry/m1;

    .line 145
    .line 146
    invoke-virtual {p0, v4, v5, v5}, Lio/sentry/android/core/ActivityLifecycleIntegration;->h(Lio/sentry/m1;Lio/sentry/k1;Lio/sentry/k1;)V

    .line 147
    .line 148
    .line 149
    :cond_7
    iput-object v5, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->U:Lio/sentry/k1;

    .line 150
    .line 151
    iput-object v5, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->V:Lio/sentry/m1;

    .line 152
    .line 153
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    :cond_8
    invoke-virtual {v7, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v7}, Ljava/util/WeakHashMap;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_9

    .line 167
    .line 168
    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-nez p1, :cond_9

    .line 173
    .line 174
    iput-boolean v6, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->v:Z

    .line 175
    .line 176
    new-instance p1, Lio/sentry/u5;

    .line 177
    .line 178
    const-wide/16 v0, 0x0

    .line 179
    .line 180
    invoke-direct {p1, v0, v1, v0, v1}, Lio/sentry/u5;-><init>(JJ)V

    .line 181
    .line 182
    .line 183
    iput-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->Z:Lio/sentry/t4;

    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/util/WeakHashMap;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    .line 187
    .line 188
    :cond_9
    invoke-virtual {v3}, Lio/sentry/util/a;->close()V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :goto_1
    :try_start_2
    invoke-virtual {v3}, Lio/sentry/util/a;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :catchall_1
    move-exception p1

    .line 197
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    :goto_2
    throw p0
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d0:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->i:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->onActivityPrePaused(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    .line 22
    .line 23
    goto :goto_2

    .line 24
    :catchall_1
    move-exception p1

    .line 25
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    :goto_2
    throw p0
.end method

.method public final onActivityPostCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->Y:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lio/sentry/android/core/performance/a;

    .line 8
    .line 9
    if-eqz p2, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->V:Lio/sentry/m1;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->U:Lio/sentry/k1;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object p0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->b0:Ljava/util/WeakHashMap;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    move-object v0, p0

    .line 28
    check-cast v0, Lio/sentry/k1;

    .line 29
    .line 30
    :goto_0
    iget-object p0, p2, Lio/sentry/android/core/performance/a;->b:Lio/sentry/t4;

    .line 31
    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget-object p0, p2, Lio/sentry/android/core/performance/a;->a:Ljava/lang/String;

    .line 37
    .line 38
    const-string p1, ".onCreate"

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iget-object p1, p2, Lio/sentry/android/core/performance/a;->b:Lio/sentry/t4;

    .line 45
    .line 46
    invoke-static {v0, p0, p1}, Lio/sentry/android/core/performance/a;->a(Lio/sentry/k1;Ljava/lang/String;Lio/sentry/t4;)Lio/sentry/k1;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    iput-object p0, p2, Lio/sentry/android/core/performance/a;->d:Lio/sentry/k1;

    .line 51
    .line 52
    invoke-interface {p0}, Lio/sentry/k1;->i()V

    .line 53
    .line 54
    .line 55
    :cond_2
    return-void
.end method

.method public final onActivityPostResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityPostStarted(Landroid/app/Activity;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lio/sentry/android/core/ActivityLifecycleIntegration;->Y:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Lio/sentry/android/core/performance/a;

    .line 12
    .line 13
    if-eqz v2, :cond_5

    .line 14
    .line 15
    iget-object v3, v0, Lio/sentry/android/core/ActivityLifecycleIntegration;->V:Lio/sentry/m1;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v3, v0, Lio/sentry/android/core/ActivityLifecycleIntegration;->U:Lio/sentry/k1;

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object v3, v0, Lio/sentry/android/core/ActivityLifecycleIntegration;->b0:Ljava/util/WeakHashMap;

    .line 26
    .line 27
    invoke-virtual {v3, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    move-object v3, v1

    .line 32
    check-cast v3, Lio/sentry/k1;

    .line 33
    .line 34
    :goto_0
    iget-object v1, v2, Lio/sentry/android/core/performance/a;->c:Lio/sentry/t4;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    iget-object v1, v2, Lio/sentry/android/core/performance/a;->a:Ljava/lang/String;

    .line 41
    .line 42
    const-string v4, ".onStart"

    .line 43
    .line 44
    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v4, v2, Lio/sentry/android/core/performance/a;->c:Lio/sentry/t4;

    .line 49
    .line 50
    invoke-static {v3, v1, v4}, Lio/sentry/android/core/performance/a;->a(Lio/sentry/k1;Ljava/lang/String;Lio/sentry/t4;)Lio/sentry/k1;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iput-object v1, v2, Lio/sentry/android/core/performance/a;->e:Lio/sentry/k1;

    .line 55
    .line 56
    invoke-interface {v1}, Lio/sentry/k1;->i()V

    .line 57
    .line 58
    .line 59
    :cond_2
    iget-object v1, v2, Lio/sentry/android/core/performance/a;->d:Lio/sentry/k1;

    .line 60
    .line 61
    if-eqz v1, :cond_5

    .line 62
    .line 63
    iget-object v3, v2, Lio/sentry/android/core/performance/a;->e:Lio/sentry/k1;

    .line 64
    .line 65
    if-nez v3, :cond_3

    .line 66
    .line 67
    goto/16 :goto_1

    .line 68
    .line 69
    :cond_3
    invoke-interface {v1}, Lio/sentry/k1;->t()Lio/sentry/t4;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-object v3, v2, Lio/sentry/android/core/performance/a;->e:Lio/sentry/k1;

    .line 74
    .line 75
    invoke-interface {v3}, Lio/sentry/k1;->t()Lio/sentry/t4;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    if-eqz v1, :cond_5

    .line 80
    .line 81
    if-nez v3, :cond_4

    .line 82
    .line 83
    goto/16 :goto_1

    .line 84
    .line 85
    :cond_4
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 86
    .line 87
    .line 88
    move-result-wide v4

    .line 89
    sget-object v6, Lio/sentry/android/core/j;->a:Lio/sentry/android/core/j1;

    .line 90
    .line 91
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    new-instance v6, Lio/sentry/u5;

    .line 95
    .line 96
    invoke-direct {v6}, Lio/sentry/u5;-><init>()V

    .line 97
    .line 98
    .line 99
    iget-object v7, v2, Lio/sentry/android/core/performance/a;->d:Lio/sentry/k1;

    .line 100
    .line 101
    invoke-interface {v7}, Lio/sentry/k1;->w()Lio/sentry/t4;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-virtual {v6, v7}, Lio/sentry/u5;->b(Lio/sentry/t4;)J

    .line 106
    .line 107
    .line 108
    move-result-wide v7

    .line 109
    const-wide/32 v9, 0xf4240

    .line 110
    .line 111
    .line 112
    div-long/2addr v7, v9

    .line 113
    invoke-virtual {v6, v1}, Lio/sentry/u5;->b(Lio/sentry/t4;)J

    .line 114
    .line 115
    .line 116
    move-result-wide v11

    .line 117
    div-long/2addr v11, v9

    .line 118
    iget-object v1, v2, Lio/sentry/android/core/performance/a;->e:Lio/sentry/k1;

    .line 119
    .line 120
    invoke-interface {v1}, Lio/sentry/k1;->w()Lio/sentry/t4;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v6, v1}, Lio/sentry/u5;->b(Lio/sentry/t4;)J

    .line 125
    .line 126
    .line 127
    move-result-wide v13

    .line 128
    div-long/2addr v13, v9

    .line 129
    invoke-virtual {v6, v3}, Lio/sentry/u5;->b(Lio/sentry/t4;)J

    .line 130
    .line 131
    .line 132
    move-result-wide v15

    .line 133
    div-long/2addr v15, v9

    .line 134
    new-instance v1, Lio/sentry/android/core/performance/b;

    .line 135
    .line 136
    invoke-direct {v1}, Lio/sentry/android/core/performance/b;-><init>()V

    .line 137
    .line 138
    .line 139
    iget-object v3, v2, Lio/sentry/android/core/performance/a;->d:Lio/sentry/k1;

    .line 140
    .line 141
    invoke-interface {v3}, Lio/sentry/k1;->getDescription()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    iget-object v6, v2, Lio/sentry/android/core/performance/a;->d:Lio/sentry/k1;

    .line 146
    .line 147
    invoke-interface {v6}, Lio/sentry/k1;->w()Lio/sentry/t4;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    invoke-virtual {v6}, Lio/sentry/t4;->d()J

    .line 152
    .line 153
    .line 154
    move-result-wide v17

    .line 155
    move-wide/from16 v19, v9

    .line 156
    .line 157
    div-long v9, v17, v19

    .line 158
    .line 159
    sub-long v6, v4, v7

    .line 160
    .line 161
    sub-long v11, v4, v11

    .line 162
    .line 163
    iget-object v8, v1, Lio/sentry/android/core/performance/b;->a:Lio/sentry/android/core/performance/h;

    .line 164
    .line 165
    iput-object v3, v8, Lio/sentry/android/core/performance/h;->a:Ljava/lang/String;

    .line 166
    .line 167
    iput-wide v9, v8, Lio/sentry/android/core/performance/h;->b:J

    .line 168
    .line 169
    iput-wide v6, v8, Lio/sentry/android/core/performance/h;->c:J

    .line 170
    .line 171
    iput-wide v11, v8, Lio/sentry/android/core/performance/h;->d:J

    .line 172
    .line 173
    iget-object v3, v2, Lio/sentry/android/core/performance/a;->e:Lio/sentry/k1;

    .line 174
    .line 175
    invoke-interface {v3}, Lio/sentry/k1;->getDescription()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    iget-object v2, v2, Lio/sentry/android/core/performance/a;->e:Lio/sentry/k1;

    .line 180
    .line 181
    invoke-interface {v2}, Lio/sentry/k1;->w()Lio/sentry/t4;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-virtual {v2}, Lio/sentry/t4;->d()J

    .line 186
    .line 187
    .line 188
    move-result-wide v6

    .line 189
    div-long v6, v6, v19

    .line 190
    .line 191
    sub-long v8, v4, v13

    .line 192
    .line 193
    sub-long/2addr v4, v15

    .line 194
    iget-object v2, v1, Lio/sentry/android/core/performance/b;->b:Lio/sentry/android/core/performance/h;

    .line 195
    .line 196
    iput-object v3, v2, Lio/sentry/android/core/performance/h;->a:Ljava/lang/String;

    .line 197
    .line 198
    iput-wide v6, v2, Lio/sentry/android/core/performance/h;->b:J

    .line 199
    .line 200
    iput-wide v8, v2, Lio/sentry/android/core/performance/h;->c:J

    .line 201
    .line 202
    iput-wide v4, v2, Lio/sentry/android/core/performance/h;->d:J

    .line 203
    .line 204
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    iget-object v2, v2, Lio/sentry/android/core/performance/g;->v:Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    :cond_5
    :goto_1
    const/4 v1, 0x0

    .line 214
    invoke-virtual {v0, v1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->c(Lio/sentry/t4;)V

    .line 215
    .line 216
    .line 217
    return-void
.end method

.method public final onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p2, Lio/sentry/android/core/performance/a;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {p2, v0}, Lio/sentry/android/core/performance/a;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->Y:Ljava/util/WeakHashMap;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iget-boolean p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->v:Z

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/h4;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, Lio/sentry/h4;->l()Lio/sentry/m6;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Lio/sentry/m6;->getDateProvider()Lio/sentry/u4;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {p1}, Lio/sentry/u4;->a()Lio/sentry/t4;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    sget-object p1, Lio/sentry/android/core/j;->a:Lio/sentry/android/core/j1;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance p1, Lio/sentry/u5;

    .line 47
    .line 48
    invoke-direct {p1}, Lio/sentry/u5;-><init>()V

    .line 49
    .line 50
    .line 51
    :goto_0
    iput-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->Z:Lio/sentry/t4;

    .line 52
    .line 53
    iput-object p1, p2, Lio/sentry/android/core/performance/a;->b:Lio/sentry/t4;

    .line 54
    .line 55
    return-void
.end method

.method public final onActivityPrePaused(Landroid/app/Activity;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->v:Z

    .line 3
    .line 4
    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/h4;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lio/sentry/h4;->l()Lio/sentry/m6;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lio/sentry/m6;->getDateProvider()Lio/sentry/u4;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1}, Lio/sentry/u4;->a()Lio/sentry/t4;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget-object p1, Lio/sentry/android/core/j;->a:Lio/sentry/android/core/j1;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance p1, Lio/sentry/u5;

    .line 27
    .line 28
    invoke-direct {p1}, Lio/sentry/u5;-><init>()V

    .line 29
    .line 30
    .line 31
    :goto_0
    iput-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->Z:Lio/sentry/t4;

    .line 32
    .line 33
    return-void
.end method

.method public final onActivityPreStarted(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->Y:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lio/sentry/android/core/performance/a;

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lio/sentry/m6;->getDateProvider()Lio/sentry/u4;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Lio/sentry/u4;->a()Lio/sentry/t4;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object p0, Lio/sentry/android/core/j;->a:Lio/sentry/android/core/j1;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance p0, Lio/sentry/u5;

    .line 30
    .line 31
    invoke-direct {p0}, Lio/sentry/u5;-><init>()V

    .line 32
    .line 33
    .line 34
    :goto_0
    iput-object p0, p1, Lio/sentry/android/core/performance/a;->c:Lio/sentry/t4;

    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d0:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->i:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->onActivityPostStarted(Landroid/app/Activity;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    goto :goto_2

    .line 16
    :cond_0
    :goto_0
    iget-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->W:Ljava/util/WeakHashMap;

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lio/sentry/k1;

    .line 27
    .line 28
    iget-object v2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->X:Ljava/util/WeakHashMap;

    .line 29
    .line 30
    invoke-virtual {v2, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lio/sentry/k1;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    new-instance v3, Lio/sentry/android/core/f;

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    invoke-direct {v3, p0, v2, v1, v4}, Lio/sentry/android/core/f;-><init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Lio/sentry/k1;Lio/sentry/k1;I)V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->b:Lio/sentry/android/core/o0;

    .line 49
    .line 50
    invoke-static {p1, v3, p0}, Lio/sentry/android/core/internal/util/j;->a(Landroid/app/Activity;Ljava/lang/Runnable;Lio/sentry/android/core/o0;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    new-instance p1, Landroid/os/Handler;

    .line 55
    .line 56
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-direct {p1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 61
    .line 62
    .line 63
    new-instance v3, Lio/sentry/android/core/f;

    .line 64
    .line 65
    const/4 v4, 0x1

    .line 66
    invoke-direct {v3, p0, v2, v1, v4}, Lio/sentry/android/core/f;-><init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Lio/sentry/k1;Lio/sentry/k1;I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    :cond_2
    :goto_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :goto_2
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    .line 79
    goto :goto_3

    .line 80
    :catchall_1
    move-exception p1

    .line 81
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    :goto_3
    throw p0
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d0:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->i:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p0, p1, v1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->onActivityPostCreated(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->onActivityPreStarted(Landroid/app/Activity;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    iget-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->c0:Lio/sentry/android/core/d;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lio/sentry/android/core/d;->a(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :catchall_1
    move-exception p1

    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    :goto_2
    throw p0
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

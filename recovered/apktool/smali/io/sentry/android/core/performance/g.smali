.class public final Lio/sentry/android/core/performance/g;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# static fields
.field public static j0:J

.field public static volatile k0:Lio/sentry/android/core/performance/g;

.field public static final l0:Lio/sentry/util/a;


# instance fields
.field public U:Lio/sentry/android/core/h;

.field public V:Lio/sentry/t3;

.field public W:Z

.field public volatile X:Z

.field public final Y:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final Z:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public a:Lio/sentry/android/core/performance/f;

.field public final a0:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final b:Lio/sentry/util/g;

.field public final b0:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public volatile c:J

.field public volatile c0:Lx6;

.field public final d:Lio/sentry/android/core/performance/h;

.field public d0:Lio/sentry/protocol/w;

.field public final e:Lio/sentry/android/core/performance/h;

.field public e0:Ljava/lang/String;

.field public final f:Lio/sentry/android/core/performance/h;

.field public f0:Ljava/lang/String;

.field public g0:Lio/sentry/t4;

.field public h0:Landroid/app/ApplicationStartInfo;

.field public final i:Ljava/util/HashMap;

.field public final i0:Lio/sentry/android/core/o0;

.field public final v:Ljava/util/ArrayList;

.field public w:Lio/sentry/android/core/v;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sput-wide v0, Lio/sentry/android/core/performance/g;->j0:J

    .line 6
    .line 7
    new-instance v0, Lio/sentry/util/a;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lio/sentry/android/core/performance/g;->l0:Lio/sentry/util/a;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lio/sentry/android/core/performance/f;->UNKNOWN:Lio/sentry/android/core/performance/f;

    .line 5
    .line 6
    iput-object v0, p0, Lio/sentry/android/core/performance/g;->a:Lio/sentry/android/core/performance/f;

    .line 7
    .line 8
    new-instance v0, Lio/sentry/util/g;

    .line 9
    .line 10
    new-instance v1, Lio/sentry/hints/j;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Lio/sentry/util/g;-><init>(Lio/sentry/util/f;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lio/sentry/android/core/performance/g;->b:Lio/sentry/util/g;

    .line 19
    .line 20
    const-wide/16 v0, -0x1

    .line 21
    .line 22
    iput-wide v0, p0, Lio/sentry/android/core/performance/g;->c:J

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/v;

    .line 26
    .line 27
    iput-object v0, p0, Lio/sentry/android/core/performance/g;->U:Lio/sentry/android/core/h;

    .line 28
    .line 29
    iput-object v0, p0, Lio/sentry/android/core/performance/g;->V:Lio/sentry/t3;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Lio/sentry/android/core/performance/g;->W:Z

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    iput-boolean v1, p0, Lio/sentry/android/core/performance/g;->X:Z

    .line 36
    .line 37
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lio/sentry/android/core/performance/g;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 43
    .line 44
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 45
    .line 46
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, Lio/sentry/android/core/performance/g;->Z:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 50
    .line 51
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 52
    .line 53
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, Lio/sentry/android/core/performance/g;->a0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 57
    .line 58
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 59
    .line 60
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 61
    .line 62
    .line 63
    iput-object v1, p0, Lio/sentry/android/core/performance/g;->b0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 64
    .line 65
    new-instance v0, Lio/sentry/android/core/o0;

    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    invoke-direct {v0, v1}, Lio/sentry/android/core/o0;-><init>(I)V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Lio/sentry/android/core/performance/g;->i0:Lio/sentry/android/core/o0;

    .line 72
    .line 73
    new-instance v0, Lio/sentry/android/core/performance/h;

    .line 74
    .line 75
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, Lio/sentry/android/core/performance/g;->d:Lio/sentry/android/core/performance/h;

    .line 79
    .line 80
    new-instance v0, Lio/sentry/android/core/performance/h;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, Lio/sentry/android/core/performance/g;->e:Lio/sentry/android/core/performance/h;

    .line 86
    .line 87
    new-instance v0, Lio/sentry/android/core/performance/h;

    .line 88
    .line 89
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v0, p0, Lio/sentry/android/core/performance/g;->f:Lio/sentry/android/core/performance/h;

    .line 93
    .line 94
    new-instance v0, Ljava/util/HashMap;

    .line 95
    .line 96
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object v0, p0, Lio/sentry/android/core/performance/g;->i:Ljava/util/HashMap;

    .line 100
    .line 101
    new-instance v0, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-object v0, p0, Lio/sentry/android/core/performance/g;->v:Ljava/util/ArrayList;

    .line 107
    .line 108
    return-void
.end method

.method public static c()Lio/sentry/android/core/performance/g;
    .locals 2

    .line 1
    sget-object v0, Lio/sentry/android/core/performance/g;->k0:Lio/sentry/android/core/performance/g;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lio/sentry/android/core/performance/g;->l0:Lio/sentry/util/a;

    .line 6
    .line 7
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    sget-object v1, Lio/sentry/android/core/performance/g;->k0:Lio/sentry/android/core/performance/g;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Lio/sentry/android/core/performance/g;

    .line 15
    .line 16
    invoke-direct {v1}, Lio/sentry/android/core/performance/g;-><init>()V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lio/sentry/android/core/performance/g;->k0:Lio/sentry/android/core/performance/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 25
    .line 26
    .line 27
    goto :goto_3

    .line 28
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :catchall_1
    move-exception v0

    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    :goto_2
    throw v1

    .line 37
    :cond_1
    :goto_3
    sget-object v0, Lio/sentry/android/core/performance/g;->k0:Lio/sentry/android/core/performance/g;

    .line 38
    .line 39
    return-object v0
.end method

.method public static d(Landroid/content/ContentProvider;)V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    new-instance v2, Lio/sentry/android/core/performance/h;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, v0, v1}, Lio/sentry/android/core/performance/h;->f(J)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, Lio/sentry/android/core/performance/g;->i:Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {v0, p0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static e(Landroid/content/ContentProvider;)V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v2, v2, Lio/sentry/android/core/performance/g;->i:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lio/sentry/android/core/performance/h;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Lio/sentry/android/core/performance/h;->c()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string v3, ".onCreate"

    .line 34
    .line 35
    invoke-virtual {p0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iput-object p0, v2, Lio/sentry/android/core/performance/h;->a:Ljava/lang/String;

    .line 40
    .line 41
    iput-wide v0, v2, Lio/sentry/android/core/performance/h;->d:J

    .line 42
    .line 43
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lio/sentry/android/core/performance/g;->h0:Landroid/app/ApplicationStartInfo;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x23

    .line 8
    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {p0}, Lio/sentry/android/core/performance/c;->f(Landroid/app/ApplicationStartInfo;)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    packed-switch p0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :pswitch_0
    const-string p0, "start_activity"

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_1
    const-string p0, "service"

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_2
    const-string p0, "push"

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_3
    const-string p0, "other"

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_4
    const-string p0, "launcher_recents"

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_5
    const-string p0, "launcher"

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_6
    const-string p0, "job"

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_7
    const-string p0, "content_provider"

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_8
    const-string p0, "broadcast"

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_9
    const-string p0, "boot_complete"

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_a
    const-string p0, "backup"

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_b
    const-string p0, "alarm"

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 57
    return-object p0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/performance/h;
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->a:Lio/sentry/android/core/performance/f;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/android/core/performance/f;->UNKNOWN:Lio/sentry/android/core/performance/f;

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->b:Lio/sentry/util/g;

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnablePerformanceV2()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    const-wide/32 v0, 0xea60

    .line 26
    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-object p1, p0, Lio/sentry/android/core/performance/g;->d:Lio/sentry/android/core/performance/h;

    .line 31
    .line 32
    invoke-virtual {p1}, Lio/sentry/android/core/performance/h;->d()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    invoke-virtual {p1}, Lio/sentry/android/core/performance/h;->a()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    cmp-long v2, v2, v0

    .line 43
    .line 44
    if-gtz v2, :cond_0

    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_0
    iget-object p0, p0, Lio/sentry/android/core/performance/g;->e:Lio/sentry/android/core/performance/h;

    .line 48
    .line 49
    invoke-virtual {p0}, Lio/sentry/android/core/performance/h;->d()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0}, Lio/sentry/android/core/performance/h;->a()J

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    cmp-long p1, v2, v0

    .line 60
    .line 61
    if-gtz p1, :cond_1

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_1
    new-instance p0, Lio/sentry/android/core/performance/h;

    .line 65
    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    return-object p0
.end method

.method public final declared-synchronized f()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->Z:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, v0, Lio/sentry/android/core/performance/g;->e:Lio/sentry/android/core/performance/h;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    iput-wide v2, v1, Lio/sentry/android/core/performance/h;->d:J

    .line 25
    .line 26
    iget-object v0, v0, Lio/sentry/android/core/performance/g;->d:Lio/sentry/android/core/performance/h;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    iput-wide v1, v0, Lio/sentry/android/core/performance/h;->d:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    :goto_0
    monitor-exit p0

    .line 41
    return-void

    .line 42
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    throw v0
.end method

.method public final g(Landroid/app/Application;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lio/sentry/android/core/performance/g;->W:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_1

    .line 6
    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lio/sentry/android/core/performance/g;->W:Z

    .line 9
    .line 10
    iget-object v1, p0, Lio/sentry/android/core/performance/g;->b:Lio/sentry/util/g;

    .line 11
    .line 12
    iget-object v2, v1, Lio/sentry/util/g;->c:Lio/sentry/util/a;

    .line 13
    .line 14
    invoke-virtual {v2}, Lio/sentry/util/a;->c()V

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    :try_start_0
    iput-object v3, v1, Lio/sentry/util/g;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    invoke-virtual {v2}, Lio/sentry/util/a;->close()V

    .line 21
    .line 22
    .line 23
    sget-object v1, Lio/sentry/android/core/performance/g;->k0:Lio/sentry/android/core/performance/g;

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 26
    .line 27
    .line 28
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v2, 0x23

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    if-lt v1, v2, :cond_2

    .line 34
    .line 35
    const-string v1, "activity"

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Landroid/app/ActivityManager;

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    :try_start_1
    invoke-static {p1}, Lio/sentry/android/core/performance/c;->c(Landroid/app/ActivityManager;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_2

    .line 54
    .line 55
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1}, Lio/sentry/android/core/performance/c;->b(Ljava/lang/Object;)Landroid/app/ApplicationStartInfo;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lio/sentry/android/core/performance/g;->h0:Landroid/app/ApplicationStartInfo;

    .line 64
    .line 65
    invoke-static {p1}, Lio/sentry/android/core/performance/c;->a(Landroid/app/ApplicationStartInfo;)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_2

    .line 70
    .line 71
    invoke-static {p1}, Lio/sentry/android/core/performance/c;->e(Landroid/app/ApplicationStartInfo;)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-ne p1, v0, :cond_1

    .line 76
    .line 77
    sget-object p1, Lio/sentry/android/core/performance/f;->COLD:Lio/sentry/android/core/performance/f;

    .line 78
    .line 79
    iput-object p1, p0, Lio/sentry/android/core/performance/g;->a:Lio/sentry/android/core/performance/f;

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    sget-object p1, Lio/sentry/android/core/performance/f;->WARM:Lio/sentry/android/core/performance/f;

    .line 83
    .line 84
    iput-object p1, p0, Lio/sentry/android/core/performance/g;->a:Lio/sentry/android/core/performance/f;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 85
    .line 86
    :catch_0
    :cond_2
    :goto_0
    iget-object p1, p0, Lio/sentry/android/core/performance/g;->a:Lio/sentry/android/core/performance/f;

    .line 87
    .line 88
    sget-object v1, Lio/sentry/android/core/performance/f;->UNKNOWN:Lio/sentry/android/core/performance/f;

    .line 89
    .line 90
    if-eq p1, v1, :cond_3

    .line 91
    .line 92
    iget-object p1, p0, Lio/sentry/android/core/performance/g;->c0:Lx6;

    .line 93
    .line 94
    if-eqz p1, :cond_5

    .line 95
    .line 96
    :cond_3
    iget-object p1, p0, Lio/sentry/android/core/performance/g;->a0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 97
    .line 98
    invoke-virtual {p1, v3, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-nez p1, :cond_4

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1}, Landroid/os/Looper;->getQueue()Landroid/os/MessageQueue;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    new-instance v0, Lio/sentry/android/core/performance/e;

    .line 114
    .line 115
    invoke-direct {v0, p0}, Lio/sentry/android/core/performance/e;-><init>(Lio/sentry/android/core/performance/g;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, v0}, Landroid/os/MessageQueue;->addIdleHandler(Landroid/os/MessageQueue$IdleHandler;)V

    .line 119
    .line 120
    .line 121
    :cond_5
    :goto_1
    return-void

    .line 122
    :catchall_0
    move-exception p0

    .line 123
    :try_start_2
    invoke-virtual {v2}, Lio/sentry/util/a;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :catchall_1
    move-exception p1

    .line 128
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    :goto_2
    throw p0
.end method

.method public final h(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->d:Lio/sentry/android/core/performance/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/android/core/performance/h;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lio/sentry/android/core/performance/h;->c()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    iput-wide p1, v0, Lio/sentry/android/core/performance/h;->d:J

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object p0, p0, Lio/sentry/android/core/performance/g;->e:Lio/sentry/android/core/performance/h;

    .line 19
    .line 20
    invoke-virtual {p0}, Lio/sentry/android/core/performance/h;->d()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lio/sentry/android/core/performance/h;->c()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iput-wide p1, p0, Lio/sentry/android/core/performance/h;->d:J

    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-object v2, Lio/sentry/android/core/o0;->b:Lio/sentry/android/core/o0;

    .line 6
    .line 7
    invoke-virtual {v2, p1}, Lio/sentry/android/core/o0;->b(Landroid/app/Activity;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lio/sentry/android/core/performance/g;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v2, 0x1

    .line 17
    if-ne p1, v2, :cond_4

    .line 18
    .line 19
    iget-object p1, p0, Lio/sentry/android/core/performance/g;->Z:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_4

    .line 26
    .line 27
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    iget-object p1, p0, Lio/sentry/android/core/performance/g;->d:Lio/sentry/android/core/performance/h;

    .line 32
    .line 33
    iget-wide v5, p1, Lio/sentry/android/core/performance/h;->c:J

    .line 34
    .line 35
    sub-long/2addr v3, v5

    .line 36
    iget-object p1, p0, Lio/sentry/android/core/performance/g;->b:Lio/sentry/util/g;

    .line 37
    .line 38
    invoke-virtual {p1}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_3

    .line 49
    .line 50
    const-wide/32 v5, 0xea60

    .line 51
    .line 52
    .line 53
    cmp-long p1, v3, v5

    .line 54
    .line 55
    if-lez p1, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iget-object p1, p0, Lio/sentry/android/core/performance/g;->a:Lio/sentry/android/core/performance/f;

    .line 59
    .line 60
    sget-object v2, Lio/sentry/android/core/performance/f;->UNKNOWN:Lio/sentry/android/core/performance/f;

    .line 61
    .line 62
    if-ne p1, v2, :cond_4

    .line 63
    .line 64
    if-eqz p2, :cond_1

    .line 65
    .line 66
    sget-object p1, Lio/sentry/android/core/performance/f;->WARM:Lio/sentry/android/core/performance/f;

    .line 67
    .line 68
    iput-object p1, p0, Lio/sentry/android/core/performance/g;->a:Lio/sentry/android/core/performance/f;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    iget-wide p1, p0, Lio/sentry/android/core/performance/g;->c:J

    .line 72
    .line 73
    const-wide/16 v2, -0x1

    .line 74
    .line 75
    cmp-long p1, p1, v2

    .line 76
    .line 77
    if-eqz p1, :cond_2

    .line 78
    .line 79
    iget-wide p1, p0, Lio/sentry/android/core/performance/g;->c:J

    .line 80
    .line 81
    cmp-long p1, v0, p1

    .line 82
    .line 83
    if-lez p1, :cond_2

    .line 84
    .line 85
    sget-object p1, Lio/sentry/android/core/performance/f;->WARM:Lio/sentry/android/core/performance/f;

    .line 86
    .line 87
    iput-object p1, p0, Lio/sentry/android/core/performance/g;->a:Lio/sentry/android/core/performance/f;

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    sget-object p1, Lio/sentry/android/core/performance/f;->COLD:Lio/sentry/android/core/performance/f;

    .line 91
    .line 92
    iput-object p1, p0, Lio/sentry/android/core/performance/g;->a:Lio/sentry/android/core/performance/f;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    :goto_0
    iget-object p1, p0, Lio/sentry/android/core/performance/g;->i0:Lio/sentry/android/core/o0;

    .line 96
    .line 97
    iget-object p1, p1, Lio/sentry/android/core/o0;->a:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p1, Lio/sentry/util/a;

    .line 100
    .line 101
    invoke-virtual {p1}, Lio/sentry/util/a;->c()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Lio/sentry/util/a;->close()V

    .line 105
    .line 106
    .line 107
    sget-object p1, Lio/sentry/android/core/performance/f;->WARM:Lio/sentry/android/core/performance/f;

    .line 108
    .line 109
    iput-object p1, p0, Lio/sentry/android/core/performance/g;->a:Lio/sentry/android/core/performance/f;

    .line 110
    .line 111
    iput-boolean v2, p0, Lio/sentry/android/core/performance/g;->X:Z

    .line 112
    .line 113
    iget-object p1, p0, Lio/sentry/android/core/performance/g;->d:Lio/sentry/android/core/performance/h;

    .line 114
    .line 115
    const/4 p2, 0x0

    .line 116
    iput-object p2, p1, Lio/sentry/android/core/performance/h;->a:Ljava/lang/String;

    .line 117
    .line 118
    const-wide/16 v2, 0x0

    .line 119
    .line 120
    iput-wide v2, p1, Lio/sentry/android/core/performance/h;->c:J

    .line 121
    .line 122
    iput-wide v2, p1, Lio/sentry/android/core/performance/h;->d:J

    .line 123
    .line 124
    iput-wide v2, p1, Lio/sentry/android/core/performance/h;->b:J

    .line 125
    .line 126
    invoke-virtual {p1, v0, v1}, Lio/sentry/android/core/performance/h;->f(J)V

    .line 127
    .line 128
    .line 129
    sput-wide v0, Lio/sentry/android/core/performance/g;->j0:J

    .line 130
    .line 131
    iget-object p1, p0, Lio/sentry/android/core/performance/g;->i:Ljava/util/HashMap;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 134
    .line 135
    .line 136
    iget-object p1, p0, Lio/sentry/android/core/performance/g;->f:Lio/sentry/android/core/performance/h;

    .line 137
    .line 138
    iput-object p2, p1, Lio/sentry/android/core/performance/h;->a:Ljava/lang/String;

    .line 139
    .line 140
    iput-wide v2, p1, Lio/sentry/android/core/performance/h;->c:J

    .line 141
    .line 142
    iput-wide v2, p1, Lio/sentry/android/core/performance/h;->d:J

    .line 143
    .line 144
    iput-wide v2, p1, Lio/sentry/android/core/performance/h;->b:J

    .line 145
    .line 146
    :cond_4
    :goto_1
    iget-object p0, p0, Lio/sentry/android/core/performance/g;->b:Lio/sentry/util/g;

    .line 147
    .line 148
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 149
    .line 150
    invoke-virtual {p0, p1}, Lio/sentry/util/g;->b(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 2

    .line 1
    sget-object v0, Lio/sentry/android/core/o0;->b:Lio/sentry/android/core/o0;

    .line 2
    .line 3
    iget-object v1, v0, Lio/sentry/android/core/o0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v1, p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    iput-object v1, v0, Lio/sentry/android/core/o0;->a:Ljava/lang/Object;

    .line 18
    .line 19
    :goto_0
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    if-gez v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 31
    .line 32
    .line 33
    move v0, v1

    .line 34
    :cond_1
    if-nez v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    sget-object p1, Lio/sentry/android/core/performance/f;->WARM:Lio/sentry/android/core/performance/f;

    .line 43
    .line 44
    iput-object p1, p0, Lio/sentry/android/core/performance/g;->a:Lio/sentry/android/core/performance/f;

    .line 45
    .line 46
    iget-object p1, p0, Lio/sentry/android/core/performance/g;->b:Lio/sentry/util/g;

    .line 47
    .line 48
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lio/sentry/util/g;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x1

    .line 54
    iput-boolean p1, p0, Lio/sentry/android/core/performance/g;->X:Z

    .line 55
    .line 56
    iget-object p0, p0, Lio/sentry/android/core/performance/g;->Z:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 57
    .line 58
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 59
    .line 60
    .line 61
    :cond_2
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    .line 1
    sget-object p0, Lio/sentry/android/core/o0;->b:Lio/sentry/android/core/o0;

    .line 2
    .line 3
    iget-object v0, p0, Lio/sentry/android/core/o0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eq v0, p1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    iput-object p1, p0, Lio/sentry/android/core/o0;->a:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    sget-object p0, Lio/sentry/android/core/o0;->b:Lio/sentry/android/core/o0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lio/sentry/android/core/o0;->b(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    .line 1
    sget-object v0, Lio/sentry/android/core/o0;->b:Lio/sentry/android/core/o0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/sentry/android/core/o0;->b(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->Z:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    new-instance v0, Lio/sentry/android/core/performance/d;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, p0, v1}, Lio/sentry/android/core/performance/d;-><init>(Lio/sentry/android/core/performance/g;I)V

    .line 25
    .line 26
    .line 27
    new-instance p0, Lio/sentry/android/core/o0;

    .line 28
    .line 29
    sget-object v1, Lio/sentry/r2;->a:Lio/sentry/r2;

    .line 30
    .line 31
    invoke-direct {p0, v1}, Lio/sentry/android/core/o0;-><init>(Lio/sentry/ILogger;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v0, p0}, Lio/sentry/android/core/internal/util/j;->a(Landroid/app/Activity;Ljava/lang/Runnable;Lio/sentry/android/core/o0;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    new-instance p1, Landroid/os/Handler;

    .line 39
    .line 40
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Lio/sentry/android/core/performance/d;

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    invoke-direct {v0, p0, v1}, Lio/sentry/android/core/performance/d;-><init>(Lio/sentry/android/core/performance/g;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    .line 1
    sget-object p0, Lio/sentry/android/core/o0;->b:Lio/sentry/android/core/o0;

    .line 2
    .line 3
    iget-object v0, p0, Lio/sentry/android/core/o0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eq v0, p1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    iput-object p1, p0, Lio/sentry/android/core/o0;->a:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

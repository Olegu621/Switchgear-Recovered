.class public Lio/sentry/logger/e;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/logger/b;


# instance fields
.field public final a:Lio/sentry/android/core/SentryAndroidOptions;

.field public final b:Lu93;

.field public final c:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public final d:Lio/sentry/g5;

.field public volatile e:Ljava/util/concurrent/Future;

.field public final f:Lio/sentry/util/a;

.field public volatile i:Z

.field public volatile v:Z

.field public final w:Lio/sentry/s6;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;Lu93;)V
    .locals 3

    .line 1
    new-instance v0, Lio/sentry/g5;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lio/sentry/g5;-><init>(Lio/sentry/m6;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lio/sentry/util/a;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lio/sentry/logger/e;->f:Lio/sentry/util/a;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-boolean v1, p0, Lio/sentry/logger/e;->i:Z

    .line 18
    .line 19
    iput-boolean v1, p0, Lio/sentry/logger/e;->v:Z

    .line 20
    .line 21
    new-instance v1, Lio/sentry/s6;

    .line 22
    .line 23
    const/16 v2, 0x9

    .line 24
    .line 25
    invoke-direct {v1, v2}, Lio/sentry/s6;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lio/sentry/logger/e;->w:Lio/sentry/s6;

    .line 29
    .line 30
    iput-object p1, p0, Lio/sentry/logger/e;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 31
    .line 32
    iput-object p2, p0, Lio/sentry/logger/e;->b:Lu93;

    .line 33
    .line 34
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lio/sentry/logger/e;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 40
    .line 41
    iput-object v0, p0, Lio/sentry/logger/e;->d:Lio/sentry/g5;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/sentry/logger/e;->v:Z

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, v0, v0}, Lio/sentry/logger/e;->g(ZZ)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lio/sentry/logger/e;->d:Lio/sentry/g5;

    .line 10
    .line 11
    new-instance v0, Lio/sentry/logger/d;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, Lio/sentry/logger/d;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lio/sentry/g5;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object p1, p0, Lio/sentry/logger/e;->d:Lio/sentry/g5;

    .line 22
    .line 23
    iget-object v0, p0, Lio/sentry/logger/e;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 24
    .line 25
    invoke-virtual {v0}, Lio/sentry/m6;->getShutdownTimeoutMillis()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    invoke-virtual {p1, v0, v1}, Lio/sentry/g5;->a(J)V

    .line 30
    .line 31
    .line 32
    :goto_0
    iget-object p1, p0, Lio/sentry/logger/e;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Lio/sentry/logger/e;->e()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-void
.end method

.method public final b(J)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0, v0}, Lio/sentry/logger/e;->g(ZZ)V

    .line 3
    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lio/sentry/logger/e;->w:Lio/sentry/s6;

    .line 6
    .line 7
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 8
    .line 9
    iget-object v1, v1, Lio/sentry/s6;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lio/sentry/transport/q;

    .line 12
    .line 13
    invoke-virtual {v2, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    invoke-virtual {v1, v0, p1, p2}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->tryAcquireSharedNanos(IJ)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception p1

    .line 22
    iget-object p0, p0, Lio/sentry/logger/e;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 23
    .line 24
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    sget-object p2, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 29
    .line 30
    const-string v0, "Failed to flush log events"

    .line 31
    .line 32
    invoke-interface {p0, p2, v0, p1}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final d(Lio/sentry/o5;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lio/sentry/logger/e;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lio/sentry/logger/e;->w:Lio/sentry/s6;

    .line 7
    .line 8
    iget-object v0, v0, Lio/sentry/s6;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lio/sentry/transport/q;

    .line 11
    .line 12
    invoke-static {v0}, Lio/sentry/transport/q;->a(Lio/sentry/transport/q;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v1, 0x3e8

    .line 17
    .line 18
    if-lt v0, v1, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lio/sentry/logger/e;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 21
    .line 22
    invoke-virtual {v0}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v1, Lio/sentry/clientreport/d;->QUEUE_OVERFLOW:Lio/sentry/clientreport/d;

    .line 27
    .line 28
    sget-object v2, Lio/sentry/n;->LogItem:Lio/sentry/n;

    .line 29
    .line 30
    invoke-interface {v0, v1, v2}, Lio/sentry/clientreport/f;->a(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lio/sentry/logger/e;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 34
    .line 35
    invoke-virtual {v0}, Lio/sentry/m6;->getSerializer()Lio/sentry/i1;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v2, p0, Lio/sentry/logger/e;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 40
    .line 41
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v0, v2, p1}, Lio/sentry/util/e;->a(Lio/sentry/i1;Lio/sentry/ILogger;Lio/sentry/g2;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    iget-object p0, p0, Lio/sentry/logger/e;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 50
    .line 51
    invoke-virtual {p0}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    sget-object p1, Lio/sentry/n;->LogByte:Lio/sentry/n;

    .line 56
    .line 57
    invoke-interface {p0, v1, p1, v2, v3}, Lio/sentry/clientreport/f;->e(Lio/sentry/clientreport/d;Lio/sentry/n;J)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_1
    iget-object v0, p0, Lio/sentry/logger/e;->w:Lio/sentry/s6;

    .line 62
    .line 63
    iget-object v0, v0, Lio/sentry/s6;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Lio/sentry/transport/q;

    .line 66
    .line 67
    invoke-static {v0}, Lio/sentry/transport/q;->b(Lio/sentry/transport/q;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lio/sentry/logger/e;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    invoke-virtual {p0, p1, p1}, Lio/sentry/logger/e;->g(ZZ)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final e()V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v2, p0, Lio/sentry/logger/e;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Lio/sentry/o5;

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-lt v2, v1, :cond_0

    .line 32
    .line 33
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_3

    .line 38
    .line 39
    new-instance v1, Lio/sentry/p5;

    .line 40
    .line 41
    invoke-direct {v1, v0}, Lio/sentry/p5;-><init>(Ljava/util/List;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Lio/sentry/logger/e;->b:Lu93;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    :try_start_0
    invoke-virtual {v2, v1}, Lu93;->p(Lio/sentry/p5;)Lio/sentry/internal/debugmeta/c;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const/4 v4, 0x0

    .line 55
    invoke-virtual {v2, v1, v4}, Lu93;->y(Lio/sentry/internal/debugmeta/c;Lio/sentry/i0;)Lio/sentry/protocol/w;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catch_0
    move-exception v1

    .line 60
    iget-object v2, v2, Lu93;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, Lio/sentry/android/core/SentryAndroidOptions;

    .line 63
    .line 64
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    sget-object v4, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 69
    .line 70
    const-string v5, "Capturing logs failed."

    .line 71
    .line 72
    new-array v6, v3, [Ljava/lang/Object;

    .line 73
    .line 74
    invoke-interface {v2, v4, v1, v5, v6}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-ge v3, v1, :cond_3

    .line 82
    .line 83
    iget-object v1, p0, Lio/sentry/logger/e;->w:Lio/sentry/s6;

    .line 84
    .line 85
    iget-object v1, v1, Lio/sentry/s6;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v1, Lio/sentry/transport/q;

    .line 88
    .line 89
    sget v2, Lio/sentry/transport/q;->a:I

    .line 90
    .line 91
    const/4 v2, 0x1

    .line 92
    invoke-virtual {v1, v2}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->releaseShared(I)Z

    .line 93
    .line 94
    .line 95
    add-int/lit8 v3, v3, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    return-void
.end method

.method public final g(ZZ)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lio/sentry/logger/e;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lio/sentry/logger/e;->f:Lio/sentry/util/a;

    .line 9
    .line 10
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    iget-object v1, p0, Lio/sentry/logger/e;->e:Ljava/util/concurrent/Future;

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_3

    .line 34
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 35
    iput-boolean p1, p0, Lio/sentry/logger/e;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    move p2, p1

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    const/16 p2, 0x1388

    .line 43
    .line 44
    :goto_1
    :try_start_1
    iget-object v1, p0, Lio/sentry/logger/e;->d:Lio/sentry/g5;

    .line 45
    .line 46
    new-instance v2, Lio/sentry/k2;

    .line 47
    .line 48
    const/4 v3, 0x7

    .line 49
    invoke-direct {v2, p0, v3}, Lio/sentry/k2;-><init>(Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    int-to-long v3, p2

    .line 53
    invoke-virtual {v1, v2, v3, v4}, Lio/sentry/g5;->b(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    iput-object p2, p0, Lio/sentry/logger/e;->e:Ljava/util/concurrent/Future;
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :catch_0
    move-exception p2

    .line 61
    :try_start_2
    iput-boolean p1, p0, Lio/sentry/logger/e;->i:Z

    .line 62
    .line 63
    iget-object p0, p0, Lio/sentry/logger/e;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 64
    .line 65
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    sget-object p1, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 70
    .line 71
    const-string v1, "Logs batch processor flush task rejected"

    .line 72
    .line 73
    invoke-interface {p0, p1, v1, p2}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_2
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :goto_3
    :try_start_3
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 81
    .line 82
    .line 83
    goto :goto_4

    .line 84
    :catchall_1
    move-exception p1

    .line 85
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    :goto_4
    throw p0
.end method

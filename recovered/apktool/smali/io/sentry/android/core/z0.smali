.class public final Lio/sentry/android/core/z0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/android/core/d0;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicLong;

.field public final b:J

.field public c:Lm8;

.field public final d:Lio/sentry/util/g;

.field public final e:Lio/sentry/util/a;

.field public final f:Lio/sentry/h4;

.field public final i:Z

.field public final v:Z

.field public final w:Lio/sentry/transport/d;


# direct methods
.method public constructor <init>(JZZ)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lio/sentry/android/core/z0;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    .line 13
    new-instance v0, Lio/sentry/util/g;

    .line 14
    .line 15
    new-instance v1, Lio/sentry/u2;

    .line 16
    .line 17
    const/16 v2, 0x10

    .line 18
    .line 19
    invoke-direct {v1, v2}, Lio/sentry/u2;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, Lio/sentry/util/g;-><init>(Lio/sentry/util/f;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lio/sentry/android/core/z0;->d:Lio/sentry/util/g;

    .line 26
    .line 27
    new-instance v0, Lio/sentry/util/a;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lio/sentry/android/core/z0;->e:Lio/sentry/util/a;

    .line 33
    .line 34
    iput-wide p1, p0, Lio/sentry/android/core/z0;->b:J

    .line 35
    .line 36
    iput-boolean p3, p0, Lio/sentry/android/core/z0;->i:Z

    .line 37
    .line 38
    iput-boolean p4, p0, Lio/sentry/android/core/z0;->v:Z

    .line 39
    .line 40
    sget-object p1, Lio/sentry/h4;->a:Lio/sentry/h4;

    .line 41
    .line 42
    iput-object p1, p0, Lio/sentry/android/core/z0;->f:Lio/sentry/h4;

    .line 43
    .line 44
    sget-object p1, Lio/sentry/transport/d;->a:Lio/sentry/transport/d;

    .line 45
    .line 46
    iput-object p1, p0, Lio/sentry/android/core/z0;->w:Lio/sentry/transport/d;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/sentry/android/core/z0;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lio/sentry/f;

    .line 6
    .line 7
    invoke-direct {v0}, Lio/sentry/f;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "navigation"

    .line 11
    .line 12
    iput-object v1, v0, Lio/sentry/f;->e:Ljava/lang/String;

    .line 13
    .line 14
    const-string v1, "state"

    .line 15
    .line 16
    invoke-virtual {v0, p1, v1}, Lio/sentry/f;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string p1, "app.lifecycle"

    .line 20
    .line 21
    iput-object p1, v0, Lio/sentry/f;->i:Ljava/lang/String;

    .line 22
    .line 23
    sget-object p1, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 24
    .line 25
    iput-object p1, v0, Lio/sentry/f;->w:Lio/sentry/m5;

    .line 26
    .line 27
    iget-object p0, p0, Lio/sentry/android/core/z0;->f:Lio/sentry/h4;

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lio/sentry/h4;->i(Lio/sentry/f;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/z0;->e:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/z0;->c:Lm8;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/TimerTask;->cancel()Z

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-object v1, p0, Lio/sentry/android/core/z0;->c:Lm8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :catchall_1
    move-exception v0

    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    :goto_2
    throw p0
.end method

.method public final c()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/core/z0;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/sentry/android/core/z0;->w:Lio/sentry/transport/d;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    new-instance v2, Lx6;

    .line 14
    .line 15
    const/16 v3, 0x1d

    .line 16
    .line 17
    invoke-direct {v2, p0, v3}, Lx6;-><init>(Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    iget-object v3, p0, Lio/sentry/android/core/z0;->f:Lio/sentry/h4;

    .line 21
    .line 22
    invoke-virtual {v3, v2}, Lio/sentry/h4;->r(Lio/sentry/d4;)V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lio/sentry/android/core/z0;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    const-wide/16 v6, 0x0

    .line 32
    .line 33
    cmp-long v6, v4, v6

    .line 34
    .line 35
    if-eqz v6, :cond_0

    .line 36
    .line 37
    iget-wide v6, p0, Lio/sentry/android/core/z0;->b:J

    .line 38
    .line 39
    add-long/2addr v4, v6

    .line 40
    cmp-long v4, v4, v0

    .line 41
    .line 42
    if-gtz v4, :cond_2

    .line 43
    .line 44
    :cond_0
    iget-boolean v4, p0, Lio/sentry/android/core/z0;->i:Z

    .line 45
    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    invoke-virtual {v3}, Lio/sentry/h4;->o()V

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual {v3}, Lio/sentry/h4;->l()Lio/sentry/m6;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v4}, Lio/sentry/m6;->getReplayController()Lio/sentry/v3;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-interface {v4}, Lio/sentry/v3;->n()V

    .line 60
    .line 61
    .line 62
    :cond_2
    invoke-virtual {v3}, Lio/sentry/h4;->l()Lio/sentry/m6;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v3}, Lio/sentry/m6;->getReplayController()Lio/sentry/v3;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-interface {v3}, Lio/sentry/v3;->resume()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 74
    .line 75
    .line 76
    const-string v0, "foreground"

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lio/sentry/android/core/z0;->a(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final f()V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/z0;->w:Lio/sentry/transport/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-object v2, p0, Lio/sentry/android/core/z0;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 11
    .line 12
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lio/sentry/android/core/z0;->f:Lio/sentry/h4;

    .line 16
    .line 17
    invoke-virtual {v0}, Lio/sentry/h4;->l()Lio/sentry/m6;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lio/sentry/m6;->getReplayController()Lio/sentry/v3;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Lio/sentry/v3;->pause()V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lio/sentry/android/core/z0;->e:Lio/sentry/util/a;

    .line 29
    .line 30
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 31
    .line 32
    .line 33
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/android/core/z0;->b()V

    .line 34
    .line 35
    .line 36
    new-instance v1, Lm8;

    .line 37
    .line 38
    const/4 v2, 0x2

    .line 39
    invoke-direct {v1, p0, v2}, Lm8;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lio/sentry/android/core/z0;->c:Lm8;

    .line 43
    .line 44
    iget-object v1, p0, Lio/sentry/android/core/z0;->d:Lio/sentry/util/g;

    .line 45
    .line 46
    invoke-virtual {v1}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Ljava/util/Timer;

    .line 51
    .line 52
    iget-object v2, p0, Lio/sentry/android/core/z0;->c:Lm8;

    .line 53
    .line 54
    iget-wide v3, p0, Lio/sentry/android/core/z0;->b:J

    .line 55
    .line 56
    invoke-virtual {v1, v2, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 60
    .line 61
    .line 62
    const-string v0, "background"

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lio/sentry/android/core/z0;->a(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_1
    move-exception v0

    .line 74
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    throw p0
.end method

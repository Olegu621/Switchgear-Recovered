.class public final Lio/sentry/android/core/h;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/r0;
.implements Lio/sentry/transport/o;


# instance fields
.field public U:Lio/sentry/c1;

.field public V:Ljava/util/concurrent/Future;

.field public W:Lio/sentry/m;

.field public final X:Ljava/util/ArrayList;

.field public Y:Lio/sentry/protocol/w;

.field public Z:Lio/sentry/protocol/w;

.field public final a:Lio/sentry/ILogger;

.field public final a0:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final b:Ljava/lang/String;

.field public b0:Lio/sentry/t4;

.field public final c:I

.field public volatile c0:Z

.field public final d:Lio/sentry/util/f;

.field public d0:Z

.field public final e:Lio/sentry/android/core/o0;

.field public e0:Z

.field public f:Z

.field public f0:I

.field public final g0:Lio/sentry/util/a;

.field public final h0:Lio/sentry/util/a;

.field public final i:Lio/sentry/android/core/internal/util/r;

.field public v:Lio/sentry/android/core/t;

.field public w:Z


# direct methods
.method public constructor <init>(Lio/sentry/android/core/o0;Lio/sentry/android/core/internal/util/r;Lio/sentry/ILogger;Ljava/lang/String;ILio/sentry/util/f;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lio/sentry/android/core/h;->f:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, Lio/sentry/android/core/h;->v:Lio/sentry/android/core/t;

    .line 9
    .line 10
    iput-boolean v0, p0, Lio/sentry/android/core/h;->w:Z

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lio/sentry/android/core/h;->X:Ljava/util/ArrayList;

    .line 18
    .line 19
    sget-object v1, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 20
    .line 21
    iput-object v1, p0, Lio/sentry/android/core/h;->Y:Lio/sentry/protocol/w;

    .line 22
    .line 23
    iput-object v1, p0, Lio/sentry/android/core/h;->Z:Lio/sentry/protocol/w;

    .line 24
    .line 25
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lio/sentry/android/core/h;->a0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    new-instance v1, Lio/sentry/u5;

    .line 33
    .line 34
    invoke-direct {v1}, Lio/sentry/u5;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lio/sentry/android/core/h;->b0:Lio/sentry/t4;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    iput-boolean v1, p0, Lio/sentry/android/core/h;->c0:Z

    .line 41
    .line 42
    iput-boolean v0, p0, Lio/sentry/android/core/h;->d0:Z

    .line 43
    .line 44
    iput-boolean v0, p0, Lio/sentry/android/core/h;->e0:Z

    .line 45
    .line 46
    iput v0, p0, Lio/sentry/android/core/h;->f0:I

    .line 47
    .line 48
    new-instance v0, Lio/sentry/util/a;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lio/sentry/android/core/h;->g0:Lio/sentry/util/a;

    .line 54
    .line 55
    new-instance v0, Lio/sentry/util/a;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lio/sentry/android/core/h;->h0:Lio/sentry/util/a;

    .line 61
    .line 62
    iput-object p3, p0, Lio/sentry/android/core/h;->a:Lio/sentry/ILogger;

    .line 63
    .line 64
    iput-object p2, p0, Lio/sentry/android/core/h;->i:Lio/sentry/android/core/internal/util/r;

    .line 65
    .line 66
    iput-object p1, p0, Lio/sentry/android/core/h;->e:Lio/sentry/android/core/o0;

    .line 67
    .line 68
    iput-object p4, p0, Lio/sentry/android/core/h;->b:Ljava/lang/String;

    .line 69
    .line 70
    iput p5, p0, Lio/sentry/android/core/h;->c:I

    .line 71
    .line 72
    iput-object p6, p0, Lio/sentry/android/core/h;->d:Lio/sentry/util/f;

    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/h;->g0:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    iput v1, p0, Lio/sentry/android/core/h;->f0:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    iput-boolean v2, p0, Lio/sentry/android/core/h;->d0:Z

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lio/sentry/android/core/h;->h(Z)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lio/sentry/android/core/h;->a0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :catchall_1
    move-exception p1

    .line 34
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    :goto_2
    throw p0
.end method

.method public final b(Lio/sentry/q3;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/h;->g0:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object v1, Lio/sentry/android/core/g;->a:[I

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    aget p1, v1, p1

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq p1, v1, :cond_1

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    if-eq p1, v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iput-boolean v1, p0, Lio/sentry/android/core/h;->d0:Z

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    iget p1, p0, Lio/sentry/android/core/h;->f0:I

    .line 27
    .line 28
    sub-int/2addr p1, v1

    .line 29
    iput p1, p0, Lio/sentry/android/core/h;->f0:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    if-lez p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    if-gez p1, :cond_3

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    :try_start_1
    iput p1, p0, Lio/sentry/android/core/h;->f0:I

    .line 41
    .line 42
    :cond_3
    iput-boolean v1, p0, Lio/sentry/android/core/h;->d0:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    :goto_0
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :goto_1
    :try_start_2
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :catchall_1
    move-exception p1

    .line 53
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    :goto_2
    throw p0
.end method

.method public final c(Lio/sentry/q3;Lio/sentry/i7;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/h;->g0:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-boolean v1, p0, Lio/sentry/android/core/h;->c0:Z

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-static {}, Lio/sentry/util/m;->a()Lio/sentry/util/l;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Lio/sentry/util/l;->c()D

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    iget-object p2, p2, Lio/sentry/i7;->a:Lio/sentry/m6;

    .line 21
    .line 22
    invoke-virtual {p2}, Lio/sentry/m6;->getProfileSessionSampleRate()Ljava/lang/Double;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 29
    .line 30
    .line 31
    move-result-wide v6

    .line 32
    cmpg-double p2, v6, v4

    .line 33
    .line 34
    if-ltz p2, :cond_0

    .line 35
    .line 36
    move p2, v2

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move p2, v3

    .line 39
    :goto_0
    iput-boolean p2, p0, Lio/sentry/android/core/h;->e0:Z

    .line 40
    .line 41
    iput-boolean v3, p0, Lio/sentry/android/core/h;->c0:Z

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    goto :goto_3

    .line 46
    :cond_1
    :goto_1
    iget-boolean p2, p0, Lio/sentry/android/core/h;->e0:Z

    .line 47
    .line 48
    if-nez p2, :cond_2

    .line 49
    .line 50
    iget-object p0, p0, Lio/sentry/android/core/h;->a:Lio/sentry/ILogger;

    .line 51
    .line 52
    sget-object p1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 53
    .line 54
    const-string p2, "Profiler was not started due to sampling decision."

    .line 55
    .line 56
    new-array v1, v3, [Ljava/lang/Object;

    .line 57
    .line 58
    invoke-interface {p0, p1, p2, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    :try_start_1
    sget-object p2, Lio/sentry/android/core/g;->a:[I

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    aget p1, p2, p1

    .line 72
    .line 73
    if-eq p1, v2, :cond_4

    .line 74
    .line 75
    const/4 p2, 0x2

    .line 76
    if-eq p1, p2, :cond_3

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    iget-boolean p1, p0, Lio/sentry/android/core/h;->w:Z

    .line 80
    .line 81
    if-eqz p1, :cond_6

    .line 82
    .line 83
    iget-object p0, p0, Lio/sentry/android/core/h;->a:Lio/sentry/ILogger;

    .line 84
    .line 85
    sget-object p1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 86
    .line 87
    const-string p2, "Profiler is already running."

    .line 88
    .line 89
    new-array v1, v3, [Ljava/lang/Object;

    .line 90
    .line 91
    invoke-interface {p0, p1, p2, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_4
    :try_start_2
    iget p1, p0, Lio/sentry/android/core/h;->f0:I

    .line 99
    .line 100
    if-gez p1, :cond_5

    .line 101
    .line 102
    iput v3, p0, Lio/sentry/android/core/h;->f0:I

    .line 103
    .line 104
    :cond_5
    iget p1, p0, Lio/sentry/android/core/h;->f0:I

    .line 105
    .line 106
    add-int/2addr p1, v2

    .line 107
    iput p1, p0, Lio/sentry/android/core/h;->f0:I

    .line 108
    .line 109
    :cond_6
    :goto_2
    iget-boolean p1, p0, Lio/sentry/android/core/h;->w:Z

    .line 110
    .line 111
    if-nez p1, :cond_7

    .line 112
    .line 113
    iget-object p1, p0, Lio/sentry/android/core/h;->a:Lio/sentry/ILogger;

    .line 114
    .line 115
    sget-object p2, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 116
    .line 117
    const-string v1, "Started Profiler."

    .line 118
    .line 119
    new-array v2, v3, [Ljava/lang/Object;

    .line 120
    .line 121
    invoke-interface {p1, p2, v1, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Lio/sentry/android/core/h;->g()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 125
    .line 126
    .line 127
    :cond_7
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :goto_3
    :try_start_3
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 132
    .line 133
    .line 134
    goto :goto_4

    .line 135
    :catchall_1
    move-exception p1

    .line 136
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    :goto_4
    throw p0
.end method

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lio/sentry/android/core/h;->c0:Z

    .line 3
    .line 4
    return-void
.end method

.method public final e()Lio/sentry/protocol/w;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/core/h;->Y:Lio/sentry/protocol/w;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/h;->U:Lio/sentry/c1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lio/sentry/w2;->b:Lio/sentry/w2;

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    :cond_0
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lio/sentry/w2;->b:Lio/sentry/w2;

    .line 14
    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lio/sentry/android/core/h;->U:Lio/sentry/c1;

    .line 22
    .line 23
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Lio/sentry/c1;->l()Lio/sentry/m6;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lio/sentry/m6;->getCompositePerformanceCollector()Lio/sentry/m;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lio/sentry/android/core/h;->W:Lio/sentry/m;

    .line 36
    .line 37
    iget-object v0, p0, Lio/sentry/android/core/h;->U:Lio/sentry/c1;

    .line 38
    .line 39
    invoke-interface {v0}, Lio/sentry/c1;->d()Lio/sentry/transport/p;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-object v0, v0, Lio/sentry/transport/p;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void
.end method

.method public final g()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/core/h;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/sentry/android/core/h;->e:Lio/sentry/android/core/o0;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-boolean v0, p0, Lio/sentry/android/core/h;->f:Z

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iput-boolean v1, p0, Lio/sentry/android/core/h;->f:Z

    .line 17
    .line 18
    iget-object v8, p0, Lio/sentry/android/core/h;->a:Lio/sentry/ILogger;

    .line 19
    .line 20
    iget-object v4, p0, Lio/sentry/android/core/h;->b:Ljava/lang/String;

    .line 21
    .line 22
    if-nez v4, :cond_1

    .line 23
    .line 24
    sget-object v0, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 25
    .line 26
    const-string v3, "Disabling profiling because no profiling traces dir path is defined in options."

    .line 27
    .line 28
    new-array v4, v2, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-interface {v8, v0, v3, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget v0, p0, Lio/sentry/android/core/h;->c:I

    .line 35
    .line 36
    if-gtz v0, :cond_2

    .line 37
    .line 38
    sget-object v3, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 39
    .line 40
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v4, "Disabling profiling because trace rate is set to %d"

    .line 49
    .line 50
    invoke-interface {v8, v3, v4, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    new-instance v3, Lio/sentry/android/core/t;

    .line 55
    .line 56
    const v5, 0xf4240

    .line 57
    .line 58
    .line 59
    div-int/2addr v5, v0

    .line 60
    iget-object v6, p0, Lio/sentry/android/core/h;->i:Lio/sentry/android/core/internal/util/r;

    .line 61
    .line 62
    const/4 v7, 0x0

    .line 63
    invoke-direct/range {v3 .. v8}, Lio/sentry/android/core/t;-><init>(Ljava/lang/String;ILio/sentry/android/core/internal/util/r;Lio/sentry/util/f;Lio/sentry/ILogger;)V

    .line 64
    .line 65
    .line 66
    iput-object v3, p0, Lio/sentry/android/core/h;->v:Lio/sentry/android/core/t;

    .line 67
    .line 68
    :goto_0
    iget-object v0, p0, Lio/sentry/android/core/h;->v:Lio/sentry/android/core/t;

    .line 69
    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    iget-object v0, p0, Lio/sentry/android/core/h;->U:Lio/sentry/c1;

    .line 74
    .line 75
    iget-object v3, p0, Lio/sentry/android/core/h;->a:Lio/sentry/ILogger;

    .line 76
    .line 77
    if-eqz v0, :cond_7

    .line 78
    .line 79
    invoke-interface {v0}, Lio/sentry/c1;->d()Lio/sentry/transport/p;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    sget-object v4, Lio/sentry/n;->All:Lio/sentry/n;

    .line 86
    .line 87
    invoke-virtual {v0, v4}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-nez v4, :cond_4

    .line 92
    .line 93
    sget-object v4, Lio/sentry/n;->ProfileChunkUi:Lio/sentry/n;

    .line 94
    .line 95
    invoke-virtual {v0, v4}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    :cond_4
    sget-object v0, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 102
    .line 103
    const-string v1, "SDK is rate limited. Stopping profiler."

    .line 104
    .line 105
    new-array v4, v2, [Ljava/lang/Object;

    .line 106
    .line 107
    invoke-interface {v3, v0, v1, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v2}, Lio/sentry/android/core/h;->h(Z)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_5
    iget-object v0, p0, Lio/sentry/android/core/h;->U:Lio/sentry/c1;

    .line 115
    .line 116
    invoke-interface {v0}, Lio/sentry/c1;->l()Lio/sentry/m6;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0}, Lio/sentry/m6;->getConnectionStatusProvider()Lio/sentry/q0;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-interface {v0}, Lio/sentry/q0;->r0()Lio/sentry/o0;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    sget-object v4, Lio/sentry/o0;->DISCONNECTED:Lio/sentry/o0;

    .line 129
    .line 130
    if-ne v0, v4, :cond_6

    .line 131
    .line 132
    sget-object v0, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 133
    .line 134
    const-string v1, "Device is offline. Stopping profiler."

    .line 135
    .line 136
    new-array v4, v2, [Ljava/lang/Object;

    .line 137
    .line 138
    invoke-interface {v3, v0, v1, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v2}, Lio/sentry/android/core/h;->h(Z)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_6
    iget-object v0, p0, Lio/sentry/android/core/h;->U:Lio/sentry/c1;

    .line 146
    .line 147
    invoke-interface {v0}, Lio/sentry/c1;->l()Lio/sentry/m6;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v0}, Lio/sentry/m6;->getDateProvider()Lio/sentry/u4;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-interface {v0}, Lio/sentry/u4;->a()Lio/sentry/t4;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    iput-object v0, p0, Lio/sentry/android/core/h;->b0:Lio/sentry/t4;

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_7
    new-instance v0, Lio/sentry/u5;

    .line 163
    .line 164
    invoke-direct {v0}, Lio/sentry/u5;-><init>()V

    .line 165
    .line 166
    .line 167
    iput-object v0, p0, Lio/sentry/android/core/h;->b0:Lio/sentry/t4;

    .line 168
    .line 169
    :goto_1
    iget-object v0, p0, Lio/sentry/android/core/h;->v:Lio/sentry/android/core/t;

    .line 170
    .line 171
    invoke-virtual {v0}, Lio/sentry/android/core/t;->c()Lun;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    if-nez v0, :cond_8

    .line 176
    .line 177
    :goto_2
    return-void

    .line 178
    :cond_8
    iput-boolean v1, p0, Lio/sentry/android/core/h;->w:Z

    .line 179
    .line 180
    iget-object v0, p0, Lio/sentry/android/core/h;->Y:Lio/sentry/protocol/w;

    .line 181
    .line 182
    sget-object v2, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 183
    .line 184
    invoke-virtual {v0, v2}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_9

    .line 189
    .line 190
    new-instance v0, Lio/sentry/protocol/w;

    .line 191
    .line 192
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 193
    .line 194
    .line 195
    iput-object v0, p0, Lio/sentry/android/core/h;->Y:Lio/sentry/protocol/w;

    .line 196
    .line 197
    :cond_9
    iget-object v0, p0, Lio/sentry/android/core/h;->Z:Lio/sentry/protocol/w;

    .line 198
    .line 199
    invoke-virtual {v0, v2}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-eqz v0, :cond_a

    .line 204
    .line 205
    new-instance v0, Lio/sentry/protocol/w;

    .line 206
    .line 207
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 208
    .line 209
    .line 210
    iput-object v0, p0, Lio/sentry/android/core/h;->Z:Lio/sentry/protocol/w;

    .line 211
    .line 212
    :cond_a
    iget-object v0, p0, Lio/sentry/android/core/h;->W:Lio/sentry/m;

    .line 213
    .line 214
    if-eqz v0, :cond_b

    .line 215
    .line 216
    iget-object v2, p0, Lio/sentry/android/core/h;->Z:Lio/sentry/protocol/w;

    .line 217
    .line 218
    invoke-virtual {v2}, Lio/sentry/protocol/w;->a()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-interface {v0, v2}, Lio/sentry/m;->a(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    :cond_b
    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/h;->d:Lio/sentry/util/f;

    .line 226
    .line 227
    invoke-interface {v0}, Lio/sentry/util/f;->b()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    check-cast v0, Lio/sentry/g1;

    .line 232
    .line 233
    new-instance v2, Lf72;

    .line 234
    .line 235
    const/16 v4, 0x12

    .line 236
    .line 237
    invoke-direct {v2, p0, v4}, Lf72;-><init>(Ljava/lang/Object;I)V

    .line 238
    .line 239
    .line 240
    const-wide/32 v4, 0xea60

    .line 241
    .line 242
    .line 243
    invoke-interface {v0, v2, v4, v5}, Lio/sentry/g1;->b(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    iput-object v0, p0, Lio/sentry/android/core/h;->V:Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 248
    .line 249
    return-void

    .line 250
    :catch_0
    move-exception v0

    .line 251
    sget-object v2, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 252
    .line 253
    const-string v4, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?"

    .line 254
    .line 255
    invoke-interface {v3, v2, v4, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 256
    .line 257
    .line 258
    iput-boolean v1, p0, Lio/sentry/android/core/h;->d0:Z

    .line 259
    .line 260
    return-void
.end method

.method public final h(Z)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/core/h;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Lio/sentry/android/core/h;->g0:Lio/sentry/util/a;

    .line 5
    .line 6
    invoke-virtual {v1}, Lio/sentry/util/a;->c()V

    .line 7
    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/h;->V:Ljava/util/concurrent/Future;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-interface {v0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    move-object p0, v0

    .line 20
    goto/16 :goto_7

    .line 21
    .line 22
    :cond_0
    :goto_0
    iget-object v0, p0, Lio/sentry/android/core/h;->v:Lio/sentry/android/core/t;

    .line 23
    .line 24
    if-eqz v0, :cond_6

    .line 25
    .line 26
    iget-boolean v0, p0, Lio/sentry/android/core/h;->w:Z

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    goto/16 :goto_6

    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, Lio/sentry/android/core/h;->e:Lio/sentry/android/core/o0;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lio/sentry/android/core/h;->W:Lio/sentry/m;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v2, p0, Lio/sentry/android/core/h;->Z:Lio/sentry/protocol/w;

    .line 42
    .line 43
    invoke-virtual {v2}, Lio/sentry/protocol/w;->a()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-interface {v0, v2}, Lio/sentry/m;->c(Ljava/lang/String;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const/4 v0, 0x0

    .line 53
    :goto_1
    iget-object v2, p0, Lio/sentry/android/core/h;->v:Lio/sentry/android/core/t;

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-virtual {v2, v0, v3}, Lio/sentry/android/core/t;->a(Ljava/util/List;Z)Lio/sentry/android/core/s;

    .line 57
    .line 58
    .line 59
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    iget-object v2, p0, Lio/sentry/android/core/h;->a:Lio/sentry/ILogger;

    .line 61
    .line 62
    if-nez v0, :cond_3

    .line 63
    .line 64
    :try_start_1
    sget-object v0, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 65
    .line 66
    const-string v4, "An error occurred while collecting a profile chunk, and it won\'t be sent."

    .line 67
    .line 68
    new-array v5, v3, [Ljava/lang/Object;

    .line 69
    .line 70
    invoke-interface {v2, v0, v4, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    iget-object v4, p0, Lio/sentry/android/core/h;->h0:Lio/sentry/util/a;

    .line 75
    .line 76
    invoke-virtual {v4}, Lio/sentry/util/a;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    .line 79
    :try_start_2
    iget-object v5, p0, Lio/sentry/android/core/h;->X:Ljava/util/ArrayList;

    .line 80
    .line 81
    new-instance v6, Lio/sentry/n3;

    .line 82
    .line 83
    iget-object v7, p0, Lio/sentry/android/core/h;->Y:Lio/sentry/protocol/w;

    .line 84
    .line 85
    iget-object v8, p0, Lio/sentry/android/core/h;->Z:Lio/sentry/protocol/w;

    .line 86
    .line 87
    iget-object v9, v0, Lio/sentry/android/core/s;->e:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v9, Ljava/util/Map;

    .line 90
    .line 91
    iget-object v0, v0, Lio/sentry/android/core/s;->d:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v10, v0

    .line 94
    check-cast v10, Ljava/io/File;

    .line 95
    .line 96
    iget-object v11, p0, Lio/sentry/android/core/h;->b0:Lio/sentry/t4;

    .line 97
    .line 98
    invoke-direct/range {v6 .. v11}, Lio/sentry/n3;-><init>(Lio/sentry/protocol/w;Lio/sentry/protocol/w;Ljava/util/Map;Ljava/io/File;Lio/sentry/t4;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 102
    .line 103
    .line 104
    :try_start_3
    invoke-virtual {v4}, Lio/sentry/util/a;->close()V

    .line 105
    .line 106
    .line 107
    :goto_2
    iput-boolean v3, p0, Lio/sentry/android/core/h;->w:Z

    .line 108
    .line 109
    sget-object v0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 110
    .line 111
    iput-object v0, p0, Lio/sentry/android/core/h;->Z:Lio/sentry/protocol/w;

    .line 112
    .line 113
    iget-object v0, p0, Lio/sentry/android/core/h;->U:Lio/sentry/c1;

    .line 114
    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    invoke-interface {v0}, Lio/sentry/c1;->l()Lio/sentry/m6;

    .line 118
    .line 119
    .line 120
    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 121
    :try_start_4
    invoke-virtual {v4}, Lio/sentry/m6;->getExecutorService()Lio/sentry/g1;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    new-instance v6, Lio/sentry/android/core/g1;

    .line 126
    .line 127
    const/4 v7, 0x2

    .line 128
    invoke-direct {v6, v7, p0, v4, v0}, Lio/sentry/android/core/g1;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-interface {v5, v6}, Lio/sentry/g1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :catchall_1
    move-exception v0

    .line 136
    :try_start_5
    invoke-virtual {v4}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    sget-object v5, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 141
    .line 142
    const-string v6, "Failed to send profile chunks."

    .line 143
    .line 144
    invoke-interface {v4, v5, v6, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    :cond_4
    :goto_3
    if-eqz p1, :cond_5

    .line 148
    .line 149
    iget-boolean p1, p0, Lio/sentry/android/core/h;->d0:Z

    .line 150
    .line 151
    if-nez p1, :cond_5

    .line 152
    .line 153
    sget-object p1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 154
    .line 155
    const-string v0, "Profile chunk finished. Starting a new one."

    .line 156
    .line 157
    new-array v3, v3, [Ljava/lang/Object;

    .line 158
    .line 159
    invoke-interface {v2, p1, v0, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0}, Lio/sentry/android/core/h;->g()V

    .line 163
    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_5
    sget-object p1, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 167
    .line 168
    iput-object p1, p0, Lio/sentry/android/core/h;->Y:Lio/sentry/protocol/w;

    .line 169
    .line 170
    sget-object p0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 171
    .line 172
    const-string p1, "Profile chunk finished."

    .line 173
    .line 174
    new-array v0, v3, [Ljava/lang/Object;

    .line 175
    .line 176
    invoke-interface {v2, p0, p1, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 177
    .line 178
    .line 179
    :goto_4
    invoke-virtual {v1}, Lio/sentry/util/a;->close()V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :catchall_2
    move-exception v0

    .line 184
    move-object p0, v0

    .line 185
    :try_start_6
    invoke-virtual {v4}, Lio/sentry/util/a;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 186
    .line 187
    .line 188
    goto :goto_5

    .line 189
    :catchall_3
    move-exception v0

    .line 190
    move-object p1, v0

    .line 191
    :try_start_7
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 192
    .line 193
    .line 194
    :goto_5
    throw p0

    .line 195
    :cond_6
    :goto_6
    sget-object p1, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 196
    .line 197
    iput-object p1, p0, Lio/sentry/android/core/h;->Y:Lio/sentry/protocol/w;

    .line 198
    .line 199
    iput-object p1, p0, Lio/sentry/android/core/h;->Z:Lio/sentry/protocol/w;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 200
    .line 201
    invoke-virtual {v1}, Lio/sentry/util/a;->close()V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :goto_7
    :try_start_8
    invoke-virtual {v1}, Lio/sentry/util/a;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 206
    .line 207
    .line 208
    goto :goto_8

    .line 209
    :catchall_4
    move-exception v0

    .line 210
    move-object p1, v0

    .line 211
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 212
    .line 213
    .line 214
    :goto_8
    throw p0
.end method

.method public final k(Lio/sentry/transport/p;)V
    .locals 4

    .line 1
    sget-object v0, Lio/sentry/n;->All:Lio/sentry/n;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    sget-object v0, Lio/sentry/n;->ProfileChunkUi:Lio/sentry/n;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    :goto_0
    sget-object p1, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 20
    .line 21
    const-string v0, "SDK is rate limited. Stopping profiler."

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    new-array v2, v1, [Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v3, p0, Lio/sentry/android/core/h;->a:Lio/sentry/ILogger;

    .line 27
    .line 28
    invoke-interface {v3, p1, v0, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v1}, Lio/sentry/android/core/h;->h(Z)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

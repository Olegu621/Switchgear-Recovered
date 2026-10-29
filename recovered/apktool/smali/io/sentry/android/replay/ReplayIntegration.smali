.class public final Lio/sentry/android/replay/ReplayIntegration;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/s1;
.implements Ljava/io/Closeable;
.implements Lio/sentry/v3;
.implements Lio/sentry/p0;
.implements Lio/sentry/transport/o;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0003\u0006\u0007\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/sentry/android/replay/ReplayIntegration;",
        "Lio/sentry/s1;",
        "Ljava/io/Closeable;",
        "Lio/sentry/v3;",
        "Lio/sentry/p0;",
        "Lio/sentry/transport/o;",
        "io/sentry/android/replay/n",
        "io/sentry/k0",
        "sentry-android-replay_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic d0:I


# instance fields
.field public final U:Lhk2;

.field public final V:Lhk2;

.field public final W:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final X:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public Y:Lio/sentry/android/replay/capture/c;

.field public Z:Lio/sentry/u3;

.field public final a:Landroid/content/Context;

.field public final a0:Lio/sentry/s6;

.field public final b:Lio/sentry/transport/d;

.field public final b0:Lio/sentry/util/a;

.field public volatile c:Lio/sentry/o0;

.field public final c0:Lio/sentry/android/replay/r;

.field public d:Lio/sentry/android/core/SentryAndroidOptions;

.field public e:Lio/sentry/h4;

.field public f:Lio/sentry/android/replay/f0;

.field public i:Lio/sentry/android/replay/gestures/b;

.field public final v:Lhk2;

.field public final w:Lhk2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lio/sentry/k5;->d()Lio/sentry/k5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "maven:io.sentry:sentry-android-replay"

    .line 6
    .line 7
    const-string v2, "8.48.0"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lio/sentry/k5;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-object v0, Lio/sentry/transport/d;->a:Lio/sentry/transport/d;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object p1, v1

    .line 11
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->a:Landroid/content/Context;

    .line 15
    .line 16
    iput-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->b:Lio/sentry/transport/d;

    .line 17
    .line 18
    sget-object p1, Lio/sentry/o0;->UNKNOWN:Lio/sentry/o0;

    .line 19
    .line 20
    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/o0;

    .line 21
    .line 22
    sget-object p1, Lio/sentry/android/replay/a;->c:Lio/sentry/android/replay/a;

    .line 23
    .line 24
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->v:Lhk2;

    .line 29
    .line 30
    sget-object p1, Lio/sentry/android/replay/a;->d:Lio/sentry/android/replay/a;

    .line 31
    .line 32
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->w:Lhk2;

    .line 37
    .line 38
    new-instance p1, Lio/sentry/android/replay/o;

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    invoke-direct {p1, p0, v0}, Lio/sentry/android/replay/o;-><init>(Lio/sentry/android/replay/ReplayIntegration;I)V

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->U:Lhk2;

    .line 49
    .line 50
    new-instance p1, Lio/sentry/android/replay/o;

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-direct {p1, p0, v0}, Lio/sentry/android/replay/o;-><init>(Lio/sentry/android/replay/ReplayIntegration;I)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->V:Lhk2;

    .line 61
    .line 62
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 63
    .line 64
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->W:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 68
    .line 69
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 70
    .line 71
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->X:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 75
    .line 76
    sget-object p1, Lio/sentry/t2;->a:Lio/sentry/t2;

    .line 77
    .line 78
    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->Z:Lio/sentry/u3;

    .line 79
    .line 80
    new-instance p1, Lio/sentry/s6;

    .line 81
    .line 82
    const/4 v0, 0x5

    .line 83
    invoke-direct {p1, v0}, Lio/sentry/s6;-><init>(I)V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->a0:Lio/sentry/s6;

    .line 87
    .line 88
    new-instance p1, Lio/sentry/util/a;

    .line 89
    .line 90
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->b0:Lio/sentry/util/a;

    .line 94
    .line 95
    new-instance p1, Lio/sentry/android/replay/r;

    .line 96
    .line 97
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 98
    .line 99
    .line 100
    sget-object v0, Lio/sentry/android/replay/s;->INITIAL:Lio/sentry/android/replay/s;

    .line 101
    .line 102
    iput-object v0, p1, Lio/sentry/android/replay/r;->a:Lio/sentry/android/replay/s;

    .line 103
    .line 104
    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->c0:Lio/sentry/android/replay/r;

    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Boolean;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->W:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_6

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->o()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    sget-object v0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 17
    .line 18
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->Y:Lio/sentry/android/replay/capture/c;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Lio/sentry/android/replay/capture/c;->d()Lio/sentry/protocol/w;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v1, v2

    .line 29
    :goto_0
    invoke-virtual {v0, v1}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    iget-object p0, p0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 36
    .line 37
    if-eqz p0, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    sget-object p1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    new-array v0, v0, [Ljava/lang/Object;

    .line 47
    .line 48
    const-string v1, "Replay id is not set, not capturing for event"

    .line 49
    .line 50
    invoke-interface {p0, p1, v1, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    const-string p0, "options"

    .line 55
    .line 56
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v2

    .line 60
    :cond_3
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->Y:Lio/sentry/android/replay/capture/c;

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    new-instance v1, Lo;

    .line 71
    .line 72
    const/16 v3, 0x1c

    .line 73
    .line 74
    invoke-direct {v1, p0, v3}, Lo;-><init>(Ljava/lang/Object;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, p1, v1}, Lio/sentry/android/replay/capture/c;->a(ZLo;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    iget-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->Y:Lio/sentry/android/replay/capture/c;

    .line 81
    .line 82
    if-eqz p1, :cond_5

    .line 83
    .line 84
    invoke-virtual {p1}, Lio/sentry/android/replay/capture/c;->b()Lio/sentry/android/replay/capture/c;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    :cond_5
    iput-object v2, p0, Lio/sentry/android/replay/ReplayIntegration;->Y:Lio/sentry/android/replay/capture/c;

    .line 89
    .line 90
    :cond_6
    :goto_1
    return-void
.end method

.method public final close()V
    .locals 7

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->c0:Lio/sentry/android/replay/r;

    .line 2
    .line 3
    const-string v1, "options"

    .line 4
    .line 5
    iget-object v2, p0, Lio/sentry/android/replay/ReplayIntegration;->b0:Lio/sentry/util/a;

    .line 6
    .line 7
    invoke-virtual {v2}, Lio/sentry/util/a;->c()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget-object v3, p0, Lio/sentry/android/replay/ReplayIntegration;->W:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x0

    .line 17
    if-eqz v3, :cond_c

    .line 18
    .line 19
    sget-object v3, Lio/sentry/android/replay/s;->CLOSED:Lio/sentry/android/replay/s;

    .line 20
    .line 21
    invoke-virtual {v0, v3}, Lio/sentry/android/replay/r;->a(Lio/sentry/android/replay/s;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    goto/16 :goto_7

    .line 28
    .line 29
    :cond_0
    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 30
    .line 31
    if-eqz v5, :cond_b

    .line 32
    .line 33
    invoke-virtual {v5}, Lio/sentry/m6;->getConnectionStatusProvider()Lio/sentry/q0;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-interface {v5, p0}, Lio/sentry/q0;->Z0(Lio/sentry/p0;)V

    .line 38
    .line 39
    .line 40
    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/h4;

    .line 41
    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    invoke-virtual {v5}, Lio/sentry/h4;->d()Lio/sentry/transport/p;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    if-eqz v5, :cond_1

    .line 49
    .line 50
    iget-object v5, v5, Lio/sentry/transport/p;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 51
    .line 52
    invoke-virtual {v5, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception p0

    .line 57
    goto/16 :goto_8

    .line 58
    .line 59
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->stop()V

    .line 60
    .line 61
    .line 62
    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->f:Lio/sentry/android/replay/f0;

    .line 63
    .line 64
    if-eqz v5, :cond_2

    .line 65
    .line 66
    invoke-virtual {v5}, Lio/sentry/android/replay/f0;->close()V

    .line 67
    .line 68
    .line 69
    :cond_2
    iput-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->f:Lio/sentry/android/replay/f0;

    .line 70
    .line 71
    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->w:Lhk2;

    .line 72
    .line 73
    invoke-virtual {v5}, Lhk2;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, Lio/sentry/android/replay/u;

    .line 78
    .line 79
    invoke-virtual {v5}, Lio/sentry/android/replay/u;->close()V

    .line 80
    .line 81
    .line 82
    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->U:Lhk2;

    .line 83
    .line 84
    invoke-virtual {v5}, Lhk2;->isInitialized()Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_6

    .line 89
    .line 90
    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 91
    .line 92
    if-eqz v5, :cond_5

    .line 93
    .line 94
    invoke-virtual {v5}, Lio/sentry/m6;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-interface {v5}, Lio/sentry/util/thread/a;->c()Z

    .line 99
    .line 100
    .line 101
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    iget-object v6, p0, Lio/sentry/android/replay/ReplayIntegration;->U:Lhk2;

    .line 103
    .line 104
    if-eqz v5, :cond_4

    .line 105
    .line 106
    :try_start_1
    invoke-virtual {v6}, Lhk2;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    check-cast v5, Lio/sentry/android/replay/util/g;

    .line 111
    .line 112
    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    :try_start_2
    iget-object v6, v5, Lio/sentry/android/replay/util/g;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 114
    .line 115
    invoke-interface {v6}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-nez v6, :cond_3

    .line 120
    .line 121
    iget-object v6, v5, Lio/sentry/android/replay/util/g;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 122
    .line 123
    invoke-interface {v6}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :catchall_1
    move-exception p0

    .line 128
    goto :goto_2

    .line 129
    :cond_3
    :goto_1
    :try_start_3
    monitor-exit v5

    .line 130
    goto :goto_3

    .line 131
    :goto_2
    monitor-exit v5

    .line 132
    throw p0

    .line 133
    :cond_4
    invoke-virtual {v6}, Lhk2;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    check-cast v5, Lio/sentry/android/replay/util/g;

    .line 138
    .line 139
    invoke-virtual {v5}, Lio/sentry/android/replay/util/g;->shutdown()V

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw v4

    .line 147
    :cond_6
    :goto_3
    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->V:Lhk2;

    .line 148
    .line 149
    invoke-virtual {v5}, Lhk2;->isInitialized()Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-eqz v5, :cond_a

    .line 154
    .line 155
    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 156
    .line 157
    if-eqz v5, :cond_9

    .line 158
    .line 159
    invoke-virtual {v5}, Lio/sentry/m6;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-interface {v1}, Lio/sentry/util/thread/a;->c()Z

    .line 164
    .line 165
    .line 166
    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 167
    iget-object p0, p0, Lio/sentry/android/replay/ReplayIntegration;->V:Lhk2;

    .line 168
    .line 169
    if-eqz v1, :cond_8

    .line 170
    .line 171
    :try_start_4
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    check-cast p0, Lio/sentry/android/replay/util/g;

    .line 176
    .line 177
    monitor-enter p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 178
    :try_start_5
    iget-object v1, p0, Lio/sentry/android/replay/util/g;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 179
    .line 180
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-nez v1, :cond_7

    .line 185
    .line 186
    iget-object v1, p0, Lio/sentry/android/replay/util/g;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 187
    .line 188
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :catchall_2
    move-exception v0

    .line 193
    goto :goto_5

    .line 194
    :cond_7
    :goto_4
    :try_start_6
    monitor-exit p0

    .line 195
    goto :goto_6

    .line 196
    :goto_5
    monitor-exit p0

    .line 197
    throw v0

    .line 198
    :cond_8
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    check-cast p0, Lio/sentry/android/replay/util/g;

    .line 203
    .line 204
    invoke-virtual {p0}, Lio/sentry/android/replay/util/g;->shutdown()V

    .line 205
    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_9
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw v4

    .line 212
    :cond_a
    :goto_6
    iput-object v3, v0, Lio/sentry/android/replay/r;->a:Lio/sentry/android/replay/s;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 213
    .line 214
    invoke-static {v2, v4}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :cond_b
    :try_start_7
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 222
    :cond_c
    :goto_7
    invoke-static {v2, v4}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    return-void

    .line 226
    :goto_8
    :try_start_8
    throw p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 227
    :catchall_3
    move-exception v0

    .line 228
    invoke-static {v2, p0}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 229
    .line 230
    .line 231
    throw v0
.end method

.method public final f(Lio/sentry/o0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/o0;

    .line 5
    .line 6
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->Y:Lio/sentry/android/replay/capture/c;

    .line 7
    .line 8
    instance-of v0, v0, Lio/sentry/android/replay/capture/n;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    sget-object v0, Lio/sentry/o0;->DISCONNECTED:Lio/sentry/o0;

    .line 14
    .line 15
    if-ne p1, v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->t()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->v()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final g(Lio/sentry/protocol/w;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->W:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->o()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    iget-object p0, p0, Lio/sentry/android/replay/ReplayIntegration;->Y:Lio/sentry/android/replay/capture/c;

    .line 20
    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    sget-object v0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, Lio/sentry/android/replay/capture/c;->q:Ljava/lang/Object;

    .line 32
    .line 33
    monitor-enter v0

    .line 34
    :try_start_0
    iget-object v1, p0, Lio/sentry/android/replay/capture/c;->r:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/16 v2, 0x64

    .line 41
    .line 42
    if-ge v1, v2, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1}, Lio/sentry/protocol/w;->a()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v1, p0, Lio/sentry/android/replay/capture/c;->r:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    iget-object p0, p0, Lio/sentry/android/replay/capture/c;->r:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    :goto_0
    monitor-exit v0

    .line 65
    return-void

    .line 66
    :goto_1
    monitor-exit v0

    .line 67
    throw p0

    .line 68
    :cond_2
    :goto_2
    return-void
.end method

.method public final h(Lio/sentry/android/replay/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->Z:Lio/sentry/u3;

    .line 2
    .line 3
    return-void
.end method

.method public final i()Lio/sentry/protocol/w;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/replay/ReplayIntegration;->Y:Lio/sentry/android/replay/capture/c;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->d()Lio/sentry/protocol/w;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object p0

    .line 13
    :cond_1
    :goto_0
    sget-object p0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final k(Lio/sentry/transport/p;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->Y:Lio/sentry/android/replay/capture/c;

    .line 2
    .line 3
    instance-of v0, v0, Lio/sentry/android/replay/capture/n;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object v0, Lio/sentry/n;->All:Lio/sentry/n;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    sget-object v0, Lio/sentry/n;->Replay:Lio/sentry/n;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->v()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->t()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final l(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 9

    .line 1
    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x1a

    .line 7
    .line 8
    if-ge v0, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object p1, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 15
    .line 16
    const-string v0, "Session replay is only supported on API 26 and above"

    .line 17
    .line 18
    new-array v1, v1, [Ljava/lang/Object;

    .line 19
    .line 20
    invoke-interface {p0, p1, v0, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-virtual {p1}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v0, v0, Lio/sentry/q6;->d:Ljava/lang/Double;

    .line 29
    .line 30
    const-wide/16 v3, 0x0

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    cmpl-double v0, v5, v3

    .line 39
    .line 40
    if-lez v0, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p1}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v0, v0, Lio/sentry/q6;->e:Ljava/lang/Double;

    .line 48
    .line 49
    if-eqz v0, :cond_5

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 52
    .line 53
    .line 54
    move-result-wide v5

    .line 55
    cmpl-double v0, v5, v3

    .line 56
    .line 57
    if-lez v0, :cond_5

    .line 58
    .line 59
    :goto_0
    sget-object v0, Lio/sentry/h4;->a:Lio/sentry/h4;

    .line 60
    .line 61
    iput-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/h4;

    .line 62
    .line 63
    new-instance v3, Lio/sentry/android/replay/f0;

    .line 64
    .line 65
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->U:Lhk2;

    .line 66
    .line 67
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    move-object v8, v1

    .line 72
    check-cast v8, Lio/sentry/android/replay/util/g;

    .line 73
    .line 74
    iget-object v7, p0, Lio/sentry/android/replay/ReplayIntegration;->a0:Lio/sentry/s6;

    .line 75
    .line 76
    move-object v6, p0

    .line 77
    move-object v5, p0

    .line 78
    move-object v4, p1

    .line 79
    invoke-direct/range {v3 .. v8}, Lio/sentry/android/replay/f0;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/replay/ReplayIntegration;Lio/sentry/android/replay/ReplayIntegration;Lio/sentry/s6;Lio/sentry/android/replay/util/g;)V

    .line 80
    .line 81
    .line 82
    iput-object v3, v5, Lio/sentry/android/replay/ReplayIntegration;->f:Lio/sentry/android/replay/f0;

    .line 83
    .line 84
    new-instance p0, Lio/sentry/android/replay/gestures/b;

    .line 85
    .line 86
    invoke-direct {p0, v4, v5}, Lio/sentry/android/replay/gestures/b;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/replay/ReplayIntegration;)V

    .line 87
    .line 88
    .line 89
    iput-object p0, v5, Lio/sentry/android/replay/ReplayIntegration;->i:Lio/sentry/android/replay/gestures/b;

    .line 90
    .line 91
    iget-object p0, v5, Lio/sentry/android/replay/ReplayIntegration;->W:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 92
    .line 93
    const/4 p1, 0x1

    .line 94
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Lio/sentry/m6;->getConnectionStatusProvider()Lio/sentry/q0;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-interface {p0, v5}, Lio/sentry/q0;->z0(Lio/sentry/p0;)Z

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lio/sentry/h4;->d()Lio/sentry/transport/p;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    if-eqz p0, :cond_2

    .line 109
    .line 110
    iget-object p0, p0, Lio/sentry/transport/p;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 111
    .line 112
    invoke-virtual {p0, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    :cond_2
    const-string p0, "Replay"

    .line 116
    .line 117
    invoke-static {p0}, Lio/sentry/util/c;->a(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iget-object p0, v5, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 121
    .line 122
    const/4 v0, 0x0

    .line 123
    const-string v1, "options"

    .line 124
    .line 125
    if-eqz p0, :cond_4

    .line 126
    .line 127
    invoke-virtual {p0}, Lio/sentry/m6;->getExecutorService()Lio/sentry/g1;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget-object v3, v5, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 135
    .line 136
    if-eqz v3, :cond_3

    .line 137
    .line 138
    new-instance v0, Lf72;

    .line 139
    .line 140
    invoke-direct {v0, v5, v2}, Lf72;-><init>(Ljava/lang/Object;I)V

    .line 141
    .line 142
    .line 143
    :try_start_0
    new-instance v1, Lio/sentry/android/replay/capture/e;

    .line 144
    .line 145
    invoke-direct {v1, p1, v0, v3}, Lio/sentry/android/replay/capture/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-interface {p0, v1}, Lio/sentry/g1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :catchall_0
    move-exception v0

    .line 153
    move-object p0, v0

    .line 154
    invoke-virtual {v3}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    sget-object v0, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 159
    .line 160
    const-string v1, "Failed to submit task ReplayIntegration.finalize_previous_replay to executor"

    .line 161
    .line 162
    invoke-interface {p1, v0, v1, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw v0

    .line 170
    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v0

    .line 174
    :cond_5
    move-object v4, p1

    .line 175
    invoke-virtual {v4}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    sget-object p1, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 180
    .line 181
    const-string v0, "Session replay is disabled, no sample rate specified"

    .line 182
    .line 183
    new-array v1, v1, [Ljava/lang/Object;

    .line 184
    .line 185
    invoke-interface {p0, p1, v0, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    return-void
.end method

.method public final m(Ljava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/sentry/m6;->getCacheDirPath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    new-instance v1, Ljava/io/File;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    array-length v1, v0

    .line 23
    const/4 v2, 0x0

    .line 24
    move v3, v2

    .line 25
    :goto_0
    if-ge v3, v1, :cond_2

    .line 26
    .line 27
    aget-object v4, v0, v3

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const-string v6, "replay_"

    .line 37
    .line 38
    invoke-static {v5, v6, v2}, Lkotlin/text/e;->m(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->i()Lio/sentry/protocol/w;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-virtual {v6}, Lio/sentry/protocol/w;->a()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-static {v5, v6, v2}, Lkotlin/text/StringsKt;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-nez v6, :cond_1

    .line 57
    .line 58
    invoke-static {p1}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-nez v6, :cond_0

    .line 63
    .line 64
    invoke-static {v5, p1, v2}, Lkotlin/text/StringsKt;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-nez v5, :cond_1

    .line 69
    .line 70
    :cond_0
    invoke-static {v4}, Lio/sentry/util/c;->f(Ljava/io/File;)Z

    .line 71
    .line 72
    .line 73
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    return-void

    .line 77
    :cond_3
    const-string p0, "options"

    .line 78
    .line 79
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const/4 p0, 0x0

    .line 83
    throw p0
.end method

.method public final n()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->c0:Lio/sentry/android/replay/r;

    .line 4
    .line 5
    iget-object v2, v0, Lio/sentry/android/replay/ReplayIntegration;->b0:Lio/sentry/util/a;

    .line 6
    .line 7
    invoke-virtual {v2}, Lio/sentry/util/a;->c()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget-object v3, v0, Lio/sentry/android/replay/ReplayIntegration;->W:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 13
    .line 14
    .line 15
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    const/4 v4, 0x0

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    invoke-static {v2, v4}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    :try_start_1
    sget-object v3, Lio/sentry/android/replay/s;->STARTED:Lio/sentry/android/replay/s;

    .line 24
    .line 25
    invoke-virtual {v1, v3}, Lio/sentry/android/replay/r;->a(Lio/sentry/android/replay/s;)Z

    .line 26
    .line 27
    .line 28
    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    const/4 v6, 0x0

    .line 30
    const-string v7, "options"

    .line 31
    .line 32
    if-nez v5, :cond_2

    .line 33
    .line 34
    :try_start_2
    iget-object v0, v0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sget-object v1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 43
    .line 44
    const-string v3, "Session replay is already being recorded, not starting a new one"

    .line 45
    .line 46
    new-array v5, v6, [Ljava/lang/Object;

    .line 47
    .line 48
    invoke-interface {v0, v1, v3, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 49
    .line 50
    .line 51
    invoke-static {v2, v4}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    move-object v1, v0

    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :cond_1
    :try_start_3
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v4

    .line 63
    :cond_2
    iget-object v5, v0, Lio/sentry/android/replay/ReplayIntegration;->v:Lhk2;

    .line 64
    .line 65
    invoke-virtual {v5}, Lhk2;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    check-cast v5, Lio/sentry/util/l;

    .line 70
    .line 71
    iget-object v8, v0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 72
    .line 73
    if-eqz v8, :cond_e

    .line 74
    .line 75
    invoke-virtual {v8}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    iget-object v8, v8, Lio/sentry/q6;->d:Ljava/lang/Double;

    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    const/4 v9, 0x1

    .line 85
    if-eqz v8, :cond_3

    .line 86
    .line 87
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 88
    .line 89
    .line 90
    move-result-wide v10

    .line 91
    invoke-virtual {v5}, Lio/sentry/util/l;->c()D

    .line 92
    .line 93
    .line 94
    move-result-wide v12

    .line 95
    cmpg-double v5, v10, v12

    .line 96
    .line 97
    if-ltz v5, :cond_3

    .line 98
    .line 99
    move v5, v9

    .line 100
    goto :goto_0

    .line 101
    :cond_3
    move v5, v6

    .line 102
    :goto_0
    if-nez v5, :cond_7

    .line 103
    .line 104
    iget-object v8, v0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 105
    .line 106
    if-eqz v8, :cond_6

    .line 107
    .line 108
    invoke-virtual {v8}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    iget-object v8, v8, Lio/sentry/q6;->e:Ljava/lang/Double;

    .line 113
    .line 114
    if-eqz v8, :cond_4

    .line 115
    .line 116
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 117
    .line 118
    .line 119
    move-result-wide v10

    .line 120
    const-wide/16 v12, 0x0

    .line 121
    .line 122
    cmpl-double v8, v10, v12

    .line 123
    .line 124
    if-lez v8, :cond_4

    .line 125
    .line 126
    move v8, v9

    .line 127
    goto :goto_1

    .line 128
    :cond_4
    move v8, v6

    .line 129
    :goto_1
    if-nez v8, :cond_7

    .line 130
    .line 131
    iget-object v0, v0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 132
    .line 133
    if-eqz v0, :cond_5

    .line 134
    .line 135
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    sget-object v1, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 140
    .line 141
    const-string v3, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified"

    .line 142
    .line 143
    new-array v5, v6, [Ljava/lang/Object;

    .line 144
    .line 145
    invoke-interface {v0, v1, v3, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 146
    .line 147
    .line 148
    invoke-static {v2, v4}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_5
    :try_start_4
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v4

    .line 156
    :cond_6
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v4

    .line 160
    :cond_7
    iput-object v3, v1, Lio/sentry/android/replay/r;->a:Lio/sentry/android/replay/s;

    .line 161
    .line 162
    if-eqz v5, :cond_9

    .line 163
    .line 164
    new-instance v10, Lio/sentry/android/replay/capture/n;

    .line 165
    .line 166
    iget-object v11, v0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 167
    .line 168
    if-eqz v11, :cond_8

    .line 169
    .line 170
    iget-object v12, v0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/h4;

    .line 171
    .line 172
    iget-object v13, v0, Lio/sentry/android/replay/ReplayIntegration;->b:Lio/sentry/transport/d;

    .line 173
    .line 174
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->U:Lhk2;

    .line 175
    .line 176
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    move-object v14, v1

    .line 181
    check-cast v14, Lio/sentry/android/replay/util/g;

    .line 182
    .line 183
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->V:Lhk2;

    .line 184
    .line 185
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    move-object v15, v1

    .line 190
    check-cast v15, Lio/sentry/android/replay/util/g;

    .line 191
    .line 192
    invoke-direct/range {v10 .. v15}, Lio/sentry/android/replay/capture/n;-><init>(Lio/sentry/m6;Lio/sentry/c1;Lio/sentry/transport/f;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_8
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw v4

    .line 200
    :cond_9
    new-instance v10, Lio/sentry/android/replay/capture/g;

    .line 201
    .line 202
    iget-object v11, v0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 203
    .line 204
    if-eqz v11, :cond_d

    .line 205
    .line 206
    iget-object v12, v0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/h4;

    .line 207
    .line 208
    iget-object v13, v0, Lio/sentry/android/replay/ReplayIntegration;->b:Lio/sentry/transport/d;

    .line 209
    .line 210
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->v:Lhk2;

    .line 211
    .line 212
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    move-object v14, v1

    .line 217
    check-cast v14, Lio/sentry/util/l;

    .line 218
    .line 219
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->U:Lhk2;

    .line 220
    .line 221
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    move-object v15, v1

    .line 226
    check-cast v15, Lio/sentry/android/replay/util/g;

    .line 227
    .line 228
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->V:Lhk2;

    .line 229
    .line 230
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    move-object/from16 v16, v1

    .line 235
    .line 236
    check-cast v16, Lio/sentry/android/replay/util/g;

    .line 237
    .line 238
    invoke-direct/range {v10 .. v16}, Lio/sentry/android/replay/capture/g;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/h4;Lio/sentry/transport/d;Lio/sentry/util/l;Lio/sentry/android/replay/util/g;Lio/sentry/android/replay/util/g;)V

    .line 239
    .line 240
    .line 241
    :goto_2
    iput-object v10, v0, Lio/sentry/android/replay/ReplayIntegration;->Y:Lio/sentry/android/replay/capture/c;

    .line 242
    .line 243
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->f:Lio/sentry/android/replay/f0;

    .line 244
    .line 245
    if-eqz v1, :cond_a

    .line 246
    .line 247
    iget-object v1, v1, Lio/sentry/android/replay/f0;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 248
    .line 249
    invoke-virtual {v1, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 250
    .line 251
    .line 252
    :cond_a
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->Y:Lio/sentry/android/replay/capture/c;

    .line 253
    .line 254
    if-eqz v1, :cond_b

    .line 255
    .line 256
    new-instance v3, Lio/sentry/protocol/w;

    .line 257
    .line 258
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1, v6, v3, v4}, Lio/sentry/android/replay/capture/c;->m(ILio/sentry/protocol/w;Lio/sentry/n6;)V

    .line 262
    .line 263
    .line 264
    :cond_b
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->f:Lio/sentry/android/replay/f0;

    .line 265
    .line 266
    if-eqz v1, :cond_c

    .line 267
    .line 268
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->w:Lhk2;

    .line 269
    .line 270
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    check-cast v1, Lio/sentry/android/replay/u;

    .line 275
    .line 276
    iget-object v1, v1, Lio/sentry/android/replay/u;->c:Lio/sentry/android/core/e0;

    .line 277
    .line 278
    iget-object v3, v0, Lio/sentry/android/replay/ReplayIntegration;->f:Lio/sentry/android/replay/f0;

    .line 279
    .line 280
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1, v3}, Lio/sentry/android/core/e0;->add(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    :cond_c
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->w:Lhk2;

    .line 287
    .line 288
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    check-cast v1, Lio/sentry/android/replay/u;

    .line 293
    .line 294
    iget-object v1, v1, Lio/sentry/android/replay/u;->c:Lio/sentry/android/core/e0;

    .line 295
    .line 296
    iget-object v0, v0, Lio/sentry/android/replay/ReplayIntegration;->i:Lio/sentry/android/replay/gestures/b;

    .line 297
    .line 298
    invoke-virtual {v1, v0}, Lio/sentry/android/core/e0;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 299
    .line 300
    .line 301
    invoke-static {v2, v4}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 302
    .line 303
    .line 304
    return-void

    .line 305
    :cond_d
    :try_start_5
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    throw v4

    .line 309
    :cond_e
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 313
    :goto_3
    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 314
    :catchall_1
    move-exception v0

    .line 315
    invoke-static {v2, v1}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 316
    .line 317
    .line 318
    throw v0
.end method

.method public final o()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->c0:Lio/sentry/android/replay/r;

    .line 2
    .line 3
    iget-object v0, v0, Lio/sentry/android/replay/r;->a:Lio/sentry/android/replay/s;

    .line 4
    .line 5
    sget-object v1, Lio/sentry/android/replay/s;->STARTED:Lio/sentry/android/replay/s;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-ltz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lio/sentry/android/replay/ReplayIntegration;->c0:Lio/sentry/android/replay/r;

    .line 14
    .line 15
    iget-object p0, p0, Lio/sentry/android/replay/r;->a:Lio/sentry/android/replay/s;

    .line 16
    .line 17
    sget-object v0, Lio/sentry/android/replay/s;->STOPPED:Lio/sentry/android/replay/s;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-gez p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public final p()Lio/sentry/u3;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/replay/ReplayIntegration;->Z:Lio/sentry/u3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final pause()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->X:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->t()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final q(Landroid/graphics/Bitmap;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lh22;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/h4;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v2, Lio/sentry/android/replay/m;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v2, v3, v0}, Lio/sentry/android/replay/m;-><init>(ILh22;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lio/sentry/h4;->r(Lio/sentry/d4;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->Y:Lio/sentry/android/replay/capture/c;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    new-instance v2, Lio/sentry/android/replay/p;

    .line 27
    .line 28
    invoke-direct {v2, p0, p1, v0}, Lio/sentry/android/replay/p;-><init>(Lio/sentry/android/replay/ReplayIntegration;Landroid/graphics/Bitmap;Lh22;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Lio/sentry/android/replay/capture/c;->h(Lio/sentry/android/replay/p;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->Y:Lio/sentry/android/replay/capture/c;

    .line 35
    .line 36
    instance-of p1, p1, Lio/sentry/android/replay/capture/n;

    .line 37
    .line 38
    if-eqz p1, :cond_4

    .line 39
    .line 40
    iget-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/o0;

    .line 41
    .line 42
    sget-object v0, Lio/sentry/o0;->DISCONNECTED:Lio/sentry/o0;

    .line 43
    .line 44
    if-eq p1, v0, :cond_3

    .line 45
    .line 46
    iget-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/h4;

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1}, Lio/sentry/h4;->d()Lio/sentry/transport/p;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    sget-object v1, Lio/sentry/n;->All:Lio/sentry/n;

    .line 58
    .line 59
    invoke-virtual {p1, v1}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-ne p1, v0, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/h4;

    .line 67
    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    invoke-virtual {p1}, Lio/sentry/h4;->d()Lio/sentry/transport/p;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    sget-object v1, Lio/sentry/n;->Replay:Lio/sentry/n;

    .line 77
    .line 78
    invoke-virtual {p1, v1}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-ne p1, v0, :cond_4

    .line 83
    .line 84
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->t()V

    .line 85
    .line 86
    .line 87
    :cond_4
    return-void
.end method

.method public final resume()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->X:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->v()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final s(II)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->W:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_11

    .line 10
    .line 11
    invoke-virtual {v0}, Lio/sentry/android/replay/ReplayIntegration;->o()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_c

    .line 18
    .line 19
    :cond_0
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 20
    .line 21
    const-string v2, "options"

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz v1, :cond_10

    .line 25
    .line 26
    invoke-virtual {v1}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-boolean v1, v1, Lio/sentry/q6;->k:Z

    .line 31
    .line 32
    if-eqz v1, :cond_11

    .line 33
    .line 34
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->a:Landroid/content/Context;

    .line 35
    .line 36
    iget-object v4, v0, Lio/sentry/android/replay/ReplayIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 37
    .line 38
    if-eqz v4, :cond_f

    .line 39
    .line 40
    invoke-virtual {v4}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move/from16 v4, p2

    .line 51
    .line 52
    int-to-float v4, v4

    .line 53
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 62
    .line 63
    div-float v5, v4, v5

    .line 64
    .line 65
    iget-object v6, v2, Lio/sentry/q6;->f:Lio/sentry/p6;

    .line 66
    .line 67
    iget v6, v6, Lio/sentry/p6;->sizeScale:F

    .line 68
    .line 69
    mul-float/2addr v5, v6

    .line 70
    invoke-static {v5}, Ljd1;->a(F)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    rem-int/lit8 v6, v5, 0x10

    .line 75
    .line 76
    const/16 v7, 0x8

    .line 77
    .line 78
    const/16 v8, 0x10

    .line 79
    .line 80
    if-gt v6, v7, :cond_1

    .line 81
    .line 82
    sub-int/2addr v5, v6

    .line 83
    invoke-static {v8, v5}, Ljava/lang/Math;->max(II)I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    :goto_0
    move v11, v5

    .line 88
    move/from16 v5, p1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    rsub-int/lit8 v6, v6, 0x10

    .line 92
    .line 93
    add-int/2addr v5, v6

    .line 94
    goto :goto_0

    .line 95
    :goto_1
    int-to-float v5, v5

    .line 96
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 105
    .line 106
    div-float v1, v5, v1

    .line 107
    .line 108
    iget-object v6, v2, Lio/sentry/q6;->f:Lio/sentry/p6;

    .line 109
    .line 110
    iget v9, v6, Lio/sentry/p6;->sizeScale:F

    .line 111
    .line 112
    mul-float/2addr v1, v9

    .line 113
    invoke-static {v1}, Ljd1;->a(F)I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    rem-int/lit8 v9, v1, 0x10

    .line 118
    .line 119
    if-gt v9, v7, :cond_2

    .line 120
    .line 121
    sub-int/2addr v1, v9

    .line 122
    invoke-static {v8, v1}, Ljava/lang/Math;->max(II)I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    :goto_2
    move v10, v1

    .line 127
    goto :goto_3

    .line 128
    :cond_2
    sub-int/2addr v8, v9

    .line 129
    add-int/2addr v1, v8

    .line 130
    goto :goto_2

    .line 131
    :goto_3
    new-instance v9, Lio/sentry/android/replay/x;

    .line 132
    .line 133
    int-to-float v1, v10

    .line 134
    div-float v12, v1, v5

    .line 135
    .line 136
    int-to-float v1, v11

    .line 137
    div-float v13, v1, v4

    .line 138
    .line 139
    iget v14, v2, Lio/sentry/q6;->g:I

    .line 140
    .line 141
    iget v15, v6, Lio/sentry/p6;->bitRate:I

    .line 142
    .line 143
    invoke-direct/range {v9 .. v15}, Lio/sentry/android/replay/x;-><init>(IIFFII)V

    .line 144
    .line 145
    .line 146
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->W:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_11

    .line 153
    .line 154
    invoke-virtual {v0}, Lio/sentry/android/replay/ReplayIntegration;->o()Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-nez v1, :cond_3

    .line 159
    .line 160
    goto/16 :goto_c

    .line 161
    .line 162
    :cond_3
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->Y:Lio/sentry/android/replay/capture/c;

    .line 163
    .line 164
    if-eqz v1, :cond_4

    .line 165
    .line 166
    invoke-virtual {v1, v9}, Lio/sentry/android/replay/capture/c;->g(Lio/sentry/android/replay/x;)V

    .line 167
    .line 168
    .line 169
    :cond_4
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->f:Lio/sentry/android/replay/f0;

    .line 170
    .line 171
    if-eqz v1, :cond_e

    .line 172
    .line 173
    iget-object v2, v1, Lio/sentry/android/replay/f0;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-nez v2, :cond_5

    .line 180
    .line 181
    goto/16 :goto_b

    .line 182
    .line 183
    :cond_5
    iget-object v2, v1, Lio/sentry/android/replay/f0;->X:Lio/sentry/android/replay/c0;

    .line 184
    .line 185
    if-nez v2, :cond_7

    .line 186
    .line 187
    iget-object v2, v1, Lio/sentry/android/replay/f0;->V:Lio/sentry/util/a;

    .line 188
    .line 189
    invoke-virtual {v2}, Lio/sentry/util/a;->c()V

    .line 190
    .line 191
    .line 192
    :try_start_0
    iget-object v4, v1, Lio/sentry/android/replay/f0;->X:Lio/sentry/android/replay/c0;

    .line 193
    .line 194
    if-nez v4, :cond_6

    .line 195
    .line 196
    new-instance v4, Lio/sentry/android/replay/c0;

    .line 197
    .line 198
    iget-object v5, v1, Lio/sentry/android/replay/f0;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 199
    .line 200
    iget-object v6, v1, Lio/sentry/android/replay/f0;->d:Lio/sentry/s6;

    .line 201
    .line 202
    invoke-direct {v4, v5, v6}, Lio/sentry/android/replay/c0;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/s6;)V

    .line 203
    .line 204
    .line 205
    iput-object v4, v1, Lio/sentry/android/replay/f0;->X:Lio/sentry/android/replay/c0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :catchall_0
    move-exception v0

    .line 209
    move-object v1, v0

    .line 210
    goto :goto_5

    .line 211
    :cond_6
    :goto_4
    invoke-static {v2, v3}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 212
    .line 213
    .line 214
    goto :goto_6

    .line 215
    :goto_5
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 216
    :catchall_1
    move-exception v0

    .line 217
    invoke-static {v2, v1}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    throw v0

    .line 221
    :cond_7
    :goto_6
    iget-object v2, v1, Lio/sentry/android/replay/f0;->X:Lio/sentry/android/replay/c0;

    .line 222
    .line 223
    if-nez v2, :cond_8

    .line 224
    .line 225
    goto :goto_7

    .line 226
    :cond_8
    iput-object v9, v2, Lio/sentry/android/replay/c0;->d:Lio/sentry/android/replay/x;

    .line 227
    .line 228
    :goto_7
    iget-object v2, v1, Lio/sentry/android/replay/f0;->X:Lio/sentry/android/replay/c0;

    .line 229
    .line 230
    if-nez v2, :cond_9

    .line 231
    .line 232
    goto :goto_8

    .line 233
    :cond_9
    new-instance v4, Lio/sentry/android/replay/w;

    .line 234
    .line 235
    iget-object v5, v1, Lio/sentry/android/replay/f0;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 236
    .line 237
    iget-object v6, v1, Lio/sentry/android/replay/f0;->b:Lio/sentry/android/replay/ReplayIntegration;

    .line 238
    .line 239
    invoke-direct {v4, v5, v6, v9, v1}, Lio/sentry/android/replay/w;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/replay/ReplayIntegration;Lio/sentry/android/replay/x;Lio/sentry/android/replay/f0;)V

    .line 240
    .line 241
    .line 242
    iput-object v4, v2, Lio/sentry/android/replay/c0;->c:Lio/sentry/android/replay/w;

    .line 243
    .line 244
    :goto_8
    iget-object v2, v1, Lio/sentry/android/replay/f0;->i:Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->z(Ljava/util/List;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 251
    .line 252
    if-eqz v2, :cond_a

    .line 253
    .line 254
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    move-object v3, v2

    .line 259
    check-cast v3, Landroid/view/View;

    .line 260
    .line 261
    :cond_a
    if-eqz v3, :cond_b

    .line 262
    .line 263
    iget-object v2, v1, Lio/sentry/android/replay/f0;->X:Lio/sentry/android/replay/c0;

    .line 264
    .line 265
    if-eqz v2, :cond_b

    .line 266
    .line 267
    iget-object v2, v2, Lio/sentry/android/replay/c0;->c:Lio/sentry/android/replay/w;

    .line 268
    .line 269
    if-eqz v2, :cond_b

    .line 270
    .line 271
    invoke-virtual {v2, v3}, Lio/sentry/android/replay/w;->a(Landroid/view/View;)V

    .line 272
    .line 273
    .line 274
    :cond_b
    iget-object v2, v1, Lio/sentry/android/replay/f0;->d:Lio/sentry/s6;

    .line 275
    .line 276
    iget-object v3, v1, Lio/sentry/android/replay/f0;->X:Lio/sentry/android/replay/c0;

    .line 277
    .line 278
    iget-object v2, v2, Lio/sentry/s6;->b:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v2, Landroid/os/Handler;

    .line 281
    .line 282
    if-nez v3, :cond_c

    .line 283
    .line 284
    goto :goto_9

    .line 285
    :cond_c
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 286
    .line 287
    .line 288
    :goto_9
    iget-object v2, v1, Lio/sentry/android/replay/f0;->d:Lio/sentry/s6;

    .line 289
    .line 290
    iget-object v3, v1, Lio/sentry/android/replay/f0;->X:Lio/sentry/android/replay/c0;

    .line 291
    .line 292
    iget-object v2, v2, Lio/sentry/s6;->b:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v2, Landroid/os/Handler;

    .line 295
    .line 296
    const/4 v4, 0x0

    .line 297
    if-nez v3, :cond_d

    .line 298
    .line 299
    move v2, v4

    .line 300
    goto :goto_a

    .line 301
    :cond_d
    const-wide/16 v5, 0x64

    .line 302
    .line 303
    invoke-virtual {v2, v3, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    :goto_a
    if-nez v2, :cond_e

    .line 308
    .line 309
    iget-object v1, v1, Lio/sentry/android/replay/f0;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 310
    .line 311
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    sget-object v2, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 316
    .line 317
    const-string v3, "Failed to post the capture runnable, main looper is shutting down."

    .line 318
    .line 319
    new-array v4, v4, [Ljava/lang/Object;

    .line 320
    .line 321
    invoke-interface {v1, v2, v3, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    :cond_e
    :goto_b
    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->c0:Lio/sentry/android/replay/r;

    .line 325
    .line 326
    iget-object v1, v1, Lio/sentry/android/replay/r;->a:Lio/sentry/android/replay/s;

    .line 327
    .line 328
    sget-object v2, Lio/sentry/android/replay/s;->PAUSED:Lio/sentry/android/replay/s;

    .line 329
    .line 330
    if-ne v1, v2, :cond_11

    .line 331
    .line 332
    iget-object v0, v0, Lio/sentry/android/replay/ReplayIntegration;->f:Lio/sentry/android/replay/f0;

    .line 333
    .line 334
    if-eqz v0, :cond_11

    .line 335
    .line 336
    invoke-virtual {v0}, Lio/sentry/android/replay/f0;->h()V

    .line 337
    .line 338
    .line 339
    return-void

    .line 340
    :cond_f
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    throw v3

    .line 344
    :cond_10
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    throw v3

    .line 348
    :cond_11
    :goto_c
    return-void
.end method

.method public final stop()V
    .locals 6

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->c0:Lio/sentry/android/replay/r;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->b0:Lio/sentry/util/a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lio/sentry/util/a;->c()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v2, p0, Lio/sentry/android/replay/ReplayIntegration;->W:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_6

    .line 16
    .line 17
    sget-object v2, Lio/sentry/android/replay/s;->STOPPED:Lio/sentry/android/replay/s;

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Lio/sentry/android/replay/r;->a(Lio/sentry/android/replay/s;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->f:Lio/sentry/android/replay/f0;

    .line 27
    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->w:Lhk2;

    .line 31
    .line 32
    invoke-virtual {v4}, Lhk2;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Lio/sentry/android/replay/u;

    .line 37
    .line 38
    iget-object v4, v4, Lio/sentry/android/replay/u;->c:Lio/sentry/android/core/e0;

    .line 39
    .line 40
    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->f:Lio/sentry/android/replay/f0;

    .line 41
    .line 42
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v5}, Lio/sentry/android/core/e0;->remove(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_1
    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->w:Lhk2;

    .line 49
    .line 50
    invoke-virtual {v4}, Lhk2;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Lio/sentry/android/replay/u;

    .line 55
    .line 56
    iget-object v4, v4, Lio/sentry/android/replay/u;->c:Lio/sentry/android/core/e0;

    .line 57
    .line 58
    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->i:Lio/sentry/android/replay/gestures/b;

    .line 59
    .line 60
    invoke-virtual {v4, v5}, Lio/sentry/android/core/e0;->remove(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->f:Lio/sentry/android/replay/f0;

    .line 64
    .line 65
    if-eqz v4, :cond_2

    .line 66
    .line 67
    invoke-virtual {v4}, Lio/sentry/android/replay/f0;->i()V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :catchall_0
    move-exception p0

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    :goto_0
    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->f:Lio/sentry/android/replay/f0;

    .line 74
    .line 75
    if-eqz v4, :cond_3

    .line 76
    .line 77
    invoke-virtual {v4}, Lio/sentry/android/replay/f0;->l()V

    .line 78
    .line 79
    .line 80
    :cond_3
    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->i:Lio/sentry/android/replay/gestures/b;

    .line 81
    .line 82
    if-eqz v4, :cond_4

    .line 83
    .line 84
    invoke-virtual {v4}, Lio/sentry/android/replay/gestures/b;->b()V

    .line 85
    .line 86
    .line 87
    :cond_4
    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->Y:Lio/sentry/android/replay/capture/c;

    .line 88
    .line 89
    if-eqz v4, :cond_5

    .line 90
    .line 91
    invoke-virtual {v4}, Lio/sentry/android/replay/capture/c;->n()V

    .line 92
    .line 93
    .line 94
    :cond_5
    iput-object v3, p0, Lio/sentry/android/replay/ReplayIntegration;->Y:Lio/sentry/android/replay/capture/c;

    .line 95
    .line 96
    iput-object v2, v0, Lio/sentry/android/replay/r;->a:Lio/sentry/android/replay/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    .line 98
    invoke-static {v1, v3}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_6
    :goto_1
    invoke-static {v1, v3}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :goto_2
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    :catchall_1
    move-exception v0

    .line 108
    invoke-static {v1, p0}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    throw v0
.end method

.method public final t()V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->c0:Lio/sentry/android/replay/r;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->b0:Lio/sentry/util/a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lio/sentry/util/a;->c()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v2, p0, Lio/sentry/android/replay/ReplayIntegration;->W:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_3

    .line 16
    .line 17
    sget-object v2, Lio/sentry/android/replay/s;->PAUSED:Lio/sentry/android/replay/s;

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Lio/sentry/android/replay/r;->a(Lio/sentry/android/replay/s;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->f:Lio/sentry/android/replay/f0;

    .line 27
    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    invoke-virtual {v4}, Lio/sentry/android/replay/f0;->h()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    :goto_0
    iget-object p0, p0, Lio/sentry/android/replay/ReplayIntegration;->Y:Lio/sentry/android/replay/capture/c;

    .line 37
    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->j()V

    .line 41
    .line 42
    .line 43
    :cond_2
    iput-object v2, v0, Lio/sentry/android/replay/r;->a:Lio/sentry/android/replay/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    invoke-static {v1, v3}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    :goto_1
    invoke-static {v1, v3}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :goto_2
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 54
    :catchall_1
    move-exception v0

    .line 55
    invoke-static {v1, p0}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    throw v0
.end method

.method public final v()V
    .locals 6

    .line 1
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->b0:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->W:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_6

    .line 14
    .line 15
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->c0:Lio/sentry/android/replay/r;

    .line 16
    .line 17
    sget-object v3, Lio/sentry/android/replay/s;->RESUMED:Lio/sentry/android/replay/s;

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Lio/sentry/android/replay/r;->a(Lio/sentry/android/replay/s;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->X:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_5

    .line 33
    .line 34
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->c:Lio/sentry/o0;

    .line 35
    .line 36
    sget-object v4, Lio/sentry/o0;->DISCONNECTED:Lio/sentry/o0;

    .line 37
    .line 38
    if-eq v1, v4, :cond_5

    .line 39
    .line 40
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/h4;

    .line 41
    .line 42
    const/4 v4, 0x1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-virtual {v1}, Lio/sentry/h4;->d()Lio/sentry/transport/p;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    sget-object v5, Lio/sentry/n;->All:Lio/sentry/n;

    .line 52
    .line 53
    invoke-virtual {v1, v5}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-ne v1, v4, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    goto :goto_2

    .line 62
    :cond_1
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->e:Lio/sentry/h4;

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    invoke-virtual {v1}, Lio/sentry/h4;->d()Lio/sentry/transport/p;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    sget-object v5, Lio/sentry/n;->Replay:Lio/sentry/n;

    .line 73
    .line 74
    invoke-virtual {v1, v5}, Lio/sentry/transport/p;->f(Lio/sentry/n;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-ne v1, v4, :cond_2

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->c0:Lio/sentry/android/replay/r;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iput-object v3, v1, Lio/sentry/android/replay/r;->a:Lio/sentry/android/replay/s;

    .line 87
    .line 88
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->Y:Lio/sentry/android/replay/capture/c;

    .line 89
    .line 90
    if-eqz v1, :cond_3

    .line 91
    .line 92
    new-instance v3, Ljava/util/Date;

    .line 93
    .line 94
    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v3}, Lio/sentry/android/replay/capture/c;->l(Ljava/util/Date;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    iget-object p0, p0, Lio/sentry/android/replay/ReplayIntegration;->f:Lio/sentry/android/replay/f0;

    .line 101
    .line 102
    if-eqz p0, :cond_4

    .line 103
    .line 104
    invoke-virtual {p0}, Lio/sentry/android/replay/f0;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    .line 106
    .line 107
    :cond_4
    invoke-static {v0, v2}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_5
    :goto_0
    invoke-static {v0, v2}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_6
    :goto_1
    invoke-static {v0, v2}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :goto_2
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 120
    :catchall_1
    move-exception v1

    .line 121
    invoke-static {v0, p0}, Lxe2;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    throw v1
.end method

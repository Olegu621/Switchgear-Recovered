.class public final synthetic Lio/sentry/android/core/h1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/d4;
.implements Lio/sentry/util/f;
.implements Lio/sentry/y3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/util/h;Lio/sentry/ILogger;)V
    .locals 0

    .line 1
    const/16 p1, 0x8

    .line 2
    .line 3
    iput p1, p0, Lio/sentry/android/core/h1;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lio/sentry/android/core/h1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 11
    iput p2, p0, Lio/sentry/android/core/h1;->a:I

    iput-object p1, p0, Lio/sentry/android/core/h1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/sentry/t3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/core/h1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/sentry/a1;

    .line 4
    .line 5
    new-instance p1, Lio/sentry/t3;

    .line 6
    .line 7
    invoke-direct {p1}, Lio/sentry/t3;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0, p1}, Lio/sentry/a1;->O(Lio/sentry/t3;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public b()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lio/sentry/android/core/h1;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/android/core/h1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string v0, "androidx.core.app.FrameMetricsAggregator"

    .line 9
    .line 10
    check-cast p0, Lio/sentry/ILogger;

    .line 11
    .line 12
    invoke-static {v0, p0}, Lio/sentry/util/h;->d(Ljava/lang/String;Lio/sentry/ILogger;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :sswitch_0
    check-cast p0, Lio/sentry/cache/f;

    .line 22
    .line 23
    iget-object v0, p0, Lio/sentry/cache/f;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 24
    .line 25
    const-string v1, ".scope-cache"

    .line 26
    .line 27
    invoke-static {v0, v1}, Lio/sentry/cache/a;->b(Lio/sentry/m6;Ljava/lang/String;)Ljava/io/File;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    sget-object v0, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    new-array v1, v1, [Ljava/lang/Object;

    .line 41
    .line 42
    const-string v2, "Cache dir is not set, cannot store in scope cache"

    .line 43
    .line 44
    invoke-interface {p0, v0, v2, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance p0, Lio/sentry/cache/tape/b;

    .line 48
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    new-instance v2, Ljava/io/File;

    .line 54
    .line 55
    const-string v3, "breadcrumbs.json"

    .line 56
    .line 57
    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :try_start_0
    invoke-virtual {v0}, Lio/sentry/m6;->getMaxBreadcrumbs()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-static {v2}, Lio/sentry/cache/tape/i;->c(Ljava/io/File;)Ljava/io/RandomAccessFile;

    .line 65
    .line 66
    .line 67
    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    :try_start_1
    new-instance v4, Lio/sentry/cache/tape/i;

    .line 69
    .line 70
    invoke-direct {v4, v2, v3, v1}, Lio/sentry/cache/tape/i;-><init>(Ljava/io/File;Ljava/io/RandomAccessFile;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception v1

    .line 75
    :try_start_2
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V

    .line 76
    .line 77
    .line 78
    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 79
    :catch_0
    :try_start_3
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Lio/sentry/m6;->getMaxBreadcrumbs()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-static {v2}, Lio/sentry/cache/tape/i;->c(Ljava/io/File;)Ljava/io/RandomAccessFile;

    .line 87
    .line 88
    .line 89
    move-result-object v3
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 90
    :try_start_4
    new-instance v4, Lio/sentry/cache/tape/i;

    .line 91
    .line 92
    invoke-direct {v4, v2, v3, v1}, Lio/sentry/cache/tape/i;-><init>(Ljava/io/File;Ljava/io/RandomAccessFile;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 93
    .line 94
    .line 95
    :goto_0
    new-instance v0, Lio/sentry/s6;

    .line 96
    .line 97
    const/4 v1, 0x6

    .line 98
    invoke-direct {v0, p0, v1}, Lio/sentry/s6;-><init>(Ljava/lang/Object;I)V

    .line 99
    .line 100
    .line 101
    new-instance p0, Lio/sentry/cache/tape/d;

    .line 102
    .line 103
    invoke-direct {p0, v4, v0}, Lio/sentry/cache/tape/d;-><init>(Lio/sentry/cache/tape/i;Lio/sentry/cache/tape/e;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :catchall_1
    move-exception p0

    .line 108
    :try_start_5
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V

    .line 109
    .line 110
    .line 111
    throw p0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 112
    :catch_1
    move-exception p0

    .line 113
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 118
    .line 119
    const-string v2, "Failed to create breadcrumbs queue"

    .line 120
    .line 121
    invoke-interface {v0, v1, v2, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    new-instance p0, Lio/sentry/cache/tape/b;

    .line 125
    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    .line 128
    .line 129
    :goto_1
    return-object p0

    .line 130
    :sswitch_1
    check-cast p0, Lio/sentry/cache/c;

    .line 131
    .line 132
    iget-object p0, p0, Lio/sentry/cache/c;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 133
    .line 134
    invoke-virtual {p0}, Lio/sentry/m6;->getSerializer()Lio/sentry/i1;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0

    .line 139
    :sswitch_2
    check-cast p0, Lio/sentry/g5;

    .line 140
    .line 141
    sget v0, Lio/sentry/android/core/SentryPerformanceProvider;->f:I

    .line 142
    .line 143
    return-object p0

    .line 144
    nop

    .line 145
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_2
        0x6 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
.end method

.method public e(Lio/sentry/a1;)V
    .locals 5

    .line 1
    iget v0, p0, Lio/sentry/android/core/h1;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, Lio/sentry/android/core/h1;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    check-cast p0, Lio/sentry/android/replay/capture/n;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->d()Lio/sentry/protocol/w;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {p1, v0}, Lio/sentry/a1;->k(Lio/sentry/protocol/w;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Lio/sentry/a1;->F()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 v0, 0x6

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    const/16 v3, 0x2e

    .line 30
    .line 31
    invoke-static {p1, v3, v2, v0}, Lkotlin/text/StringsKt;->F(Ljava/lang/String;CII)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const/4 v3, -0x1

    .line 36
    if-ne v2, v3, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    add-int/2addr v2, v1

    .line 40
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const/4 p1, 0x0

    .line 50
    :goto_0
    iget-object p0, p0, Lio/sentry/android/replay/capture/c;->l:Lio/sentry/android/replay/capture/b;

    .line 51
    .line 52
    sget-object v1, Lio/sentry/android/replay/capture/c;->s:[Lu21;

    .line 53
    .line 54
    const/4 v2, 0x2

    .line 55
    aget-object v1, v1, v2

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lio/sentry/android/replay/capture/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 64
    .line 65
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-nez v2, :cond_3

    .line 74
    .line 75
    new-instance v2, Lio/sentry/android/replay/capture/a;

    .line 76
    .line 77
    iget-object v3, p0, Lio/sentry/android/replay/capture/b;->d:Lio/sentry/android/replay/capture/c;

    .line 78
    .line 79
    const/4 v4, 0x3

    .line 80
    invoke-direct {v2, v1, p1, v3, v4}, Lio/sentry/android/replay/capture/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/c;I)V

    .line 81
    .line 82
    .line 83
    iget-object p0, p0, Lio/sentry/android/replay/capture/b;->c:Lio/sentry/android/replay/capture/c;

    .line 84
    .line 85
    iget-object p1, p0, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/m6;

    .line 86
    .line 87
    invoke-virtual {p1}, Lio/sentry/m6;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-interface {v1}, Lio/sentry/util/thread/a;->c()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_2

    .line 96
    .line 97
    iget-object p0, p0, Lio/sentry/android/replay/capture/c;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 98
    .line 99
    new-instance p1, Lio/sentry/android/replay/util/h;

    .line 100
    .line 101
    new-instance v1, Lio/sentry/k2;

    .line 102
    .line 103
    invoke-direct {v1, v2, v0}, Lio/sentry/k2;-><init>(Ljava/lang/Object;I)V

    .line 104
    .line 105
    .line 106
    const-string v0, "CaptureStrategy.runInBackground"

    .line 107
    .line 108
    invoke-direct {p1, v1, v0}, Lio/sentry/android/replay/util/h;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_2
    :try_start_0
    invoke-virtual {v2}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :catchall_0
    move-exception p0

    .line 120
    invoke-virtual {p1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    sget-object v0, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 125
    .line 126
    const-string v1, "Failed to execute task CaptureStrategy.runInBackground"

    .line 127
    .line 128
    invoke-interface {p1, v0, v1, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    :cond_3
    :goto_1
    return-void

    .line 132
    :pswitch_1
    check-cast p0, Lio/sentry/android/replay/capture/g;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->d()Lio/sentry/protocol/w;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-interface {p1, p0}, Lio/sentry/a1;->k(Lio/sentry/protocol/w;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :pswitch_2
    check-cast p0, [Lio/sentry/m1;

    .line 146
    .line 147
    invoke-interface {p1}, Lio/sentry/a1;->m()Lio/sentry/m1;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    aput-object p1, p0, v2

    .line 152
    .line 153
    return-void

    .line 154
    :pswitch_3
    check-cast p0, Lio/sentry/android/core/internal/gestures/g;

    .line 155
    .line 156
    new-instance v0, Lpn;

    .line 157
    .line 158
    const/16 v1, 0x19

    .line 159
    .line 160
    invoke-direct {v0, v1, p0, p1}, Lpn;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    invoke-interface {p1, v0}, Lio/sentry/a1;->G(Lio/sentry/a4;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :pswitch_4
    check-cast p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 168
    .line 169
    invoke-interface {p1}, Lio/sentry/a1;->r()Lio/sentry/z6;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    if-eqz p1, :cond_4

    .line 174
    .line 175
    iget-object p1, p1, Lio/sentry/z6;->a:Ljava/util/Date;

    .line 176
    .line 177
    if-eqz p1, :cond_4

    .line 178
    .line 179
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 180
    .line 181
    .line 182
    :cond_4
    return-void

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

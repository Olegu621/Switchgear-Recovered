.class public final Lio/sentry/android/core/d;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lio/sentry/m6;Lio/sentry/android/replay/video/a;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lio/sentry/android/core/d;->a:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lio/sentry/android/core/d;->b:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object p1, Lv51;->b:Lv51;

    .line 12
    .line 13
    sget-object v0, Lio/sentry/android/replay/video/c;->a:Lio/sentry/android/replay/video/c;

    .line 14
    .line 15
    invoke-static {p1, v0}, Lr51;->a(Lv51;Lkotlin/jvm/functions/Function0;)Lp51;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Lp51;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const-string v0, "c2.android.avc.encoder"

    .line 32
    .line 33
    invoke-static {v0}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v0, p2, Lio/sentry/android/replay/video/a;->f:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lio/sentry/android/core/d;->c:Ljava/lang/Object;

    .line 48
    .line 49
    new-instance v0, Lf8;

    .line 50
    .line 51
    const/16 v1, 0x19

    .line 52
    .line 53
    invoke-direct {v0, p0, v1}, Lf8;-><init>(Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v0}, Lr51;->a(Lv51;Lkotlin/jvm/functions/Function0;)Lp51;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Lio/sentry/android/core/d;->d:Ljava/lang/Object;

    .line 61
    .line 62
    new-instance p1, Landroid/media/MediaCodec$BufferInfo;

    .line 63
    .line 64
    invoke-direct {p1}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lio/sentry/android/core/d;->e:Ljava/lang/Object;

    .line 68
    .line 69
    new-instance p1, Lio/sentry/android/replay/video/b;

    .line 70
    .line 71
    iget-object v0, p2, Lio/sentry/android/replay/video/a;->a:Ljava/io/File;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget p2, p2, Lio/sentry/android/replay/video/a;->d:I

    .line 81
    .line 82
    int-to-float p2, p2

    .line 83
    invoke-direct {p1, v0, p2}, Lio/sentry/android/replay/video/b;-><init>(Ljava/lang/String;F)V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, Lio/sentry/android/core/d;->f:Ljava/lang/Object;

    .line 87
    .line 88
    return-void
.end method

.method public constructor <init>(Lio/sentry/util/h;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 4

    .line 89
    new-instance v0, Lio/sentry/android/core/o0;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lio/sentry/android/core/o0;-><init>(I)V

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, p0, Lio/sentry/android/core/d;->d:Ljava/lang/Object;

    .line 92
    new-instance v1, Ljava/util/WeakHashMap;

    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v1, p0, Lio/sentry/android/core/d;->e:Ljava/lang/Object;

    .line 93
    new-instance v1, Lio/sentry/util/a;

    .line 94
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 95
    iput-object v1, p0, Lio/sentry/android/core/d;->g:Ljava/lang/Object;

    .line 96
    invoke-virtual {p2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    .line 97
    new-instance v2, Lio/sentry/util/g;

    new-instance v3, Lio/sentry/android/core/h1;

    invoke-direct {v3, p1, v1}, Lio/sentry/android/core/h1;-><init>(Lio/sentry/util/h;Lio/sentry/ILogger;)V

    invoke-direct {v2, v3}, Lio/sentry/util/g;-><init>(Lio/sentry/util/f;)V

    .line 98
    iput-object v2, p0, Lio/sentry/android/core/d;->b:Ljava/lang/Object;

    .line 99
    new-instance p1, Lio/sentry/util/g;

    new-instance v1, Lio/sentry/u2;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lio/sentry/u2;-><init>(I)V

    invoke-direct {p1, v1}, Lio/sentry/util/g;-><init>(Lio/sentry/util/f;)V

    iput-object p1, p0, Lio/sentry/android/core/d;->a:Ljava/lang/Object;

    .line 100
    iput-object p2, p0, Lio/sentry/android/core/d;->c:Ljava/lang/Object;

    .line 101
    iput-object v0, p0, Lio/sentry/android/core/d;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/d;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/util/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/android/core/d;->e()Z

    .line 9
    .line 10
    .line 11
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    :try_start_1
    new-instance v1, Lio/sentry/android/core/b;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, p0, p1, v2}, Lio/sentry/android/core/b;-><init>(Lio/sentry/android/core/d;Landroid/app/Activity;I)V

    .line 22
    .line 23
    .line 24
    const-string v2, "FrameMetricsAggregator.add"

    .line 25
    .line 26
    invoke-virtual {p0, v1, v2}, Lio/sentry/android/core/d;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lio/sentry/android/core/d;->b()Lio/sentry/android/core/c;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    iget-object p0, p0, Lio/sentry/android/core/d;->e:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ljava/util/WeakHashMap;

    .line 38
    .line 39
    invoke-virtual {p0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    :try_start_2
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_1
    move-exception p1

    .line 52
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    throw p0
.end method

.method public b()Lio/sentry/android/core/c;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lio/sentry/android/core/d;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/d;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lio/sentry/util/g;

    .line 11
    .line 12
    invoke-virtual {v0}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :goto_0
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :cond_1
    iget-object p0, p0, Lio/sentry/android/core/d;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Lio/sentry/util/g;

    .line 29
    .line 30
    invoke-virtual {p0}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Landroidx/core/app/FrameMetricsAggregator;

    .line 35
    .line 36
    iget-object p0, p0, Landroidx/core/app/FrameMetricsAggregator;->a:Lur3;

    .line 37
    .line 38
    iget-object p0, p0, Lur3;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, [Landroid/util/SparseIntArray;

    .line 41
    .line 42
    array-length v0, p0

    .line 43
    const/4 v1, 0x0

    .line 44
    if-lez v0, :cond_5

    .line 45
    .line 46
    aget-object p0, p0, v1

    .line 47
    .line 48
    if-eqz p0, :cond_5

    .line 49
    .line 50
    move v0, v1

    .line 51
    move v2, v0

    .line 52
    move v3, v2

    .line 53
    :goto_1
    invoke-virtual {p0}, Landroid/util/SparseIntArray;->size()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-ge v1, v4, :cond_4

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Landroid/util/SparseIntArray;->keyAt(I)I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    invoke-virtual {p0, v1}, Landroid/util/SparseIntArray;->valueAt(I)I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    add-int/2addr v0, v5

    .line 68
    const/16 v6, 0x2bc

    .line 69
    .line 70
    if-le v4, v6, :cond_2

    .line 71
    .line 72
    add-int/2addr v3, v5

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    const/16 v6, 0x10

    .line 75
    .line 76
    if-le v4, v6, :cond_3

    .line 77
    .line 78
    add-int/2addr v2, v5

    .line 79
    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_4
    move v1, v0

    .line 83
    goto :goto_3

    .line 84
    :cond_5
    move v2, v1

    .line 85
    move v3, v2

    .line 86
    :goto_3
    new-instance p0, Lio/sentry/android/core/c;

    .line 87
    .line 88
    invoke-direct {p0, v1, v2, v3}, Lio/sentry/android/core/c;-><init>(III)V

    .line 89
    .line 90
    .line 91
    return-object p0
.end method

.method public c(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/d;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/android/replay/video/b;

    .line 4
    .line 5
    iget-object v1, p0, Lio/sentry/android/core/d;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/media/MediaCodec$BufferInfo;

    .line 8
    .line 9
    iget-object v2, p0, Lio/sentry/android/core/d;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Landroid/media/MediaCodec;

    .line 12
    .line 13
    iget-object p0, p0, Lio/sentry/android/core/d;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lio/sentry/m6;

    .line 16
    .line 17
    invoke-virtual {p0}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-boolean v3, v3, Lio/sentry/q6;->m:Z

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    sget-object v5, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 31
    .line 32
    new-instance v6, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v7, "[Encoder]: drainCodec("

    .line 35
    .line 36
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const/16 v7, 0x29

    .line 43
    .line 44
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    new-array v7, v4, [Ljava/lang/Object;

    .line 52
    .line 53
    invoke-interface {v3, v5, v6, v7}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    if-eqz p1, :cond_2

    .line 57
    .line 58
    invoke-virtual {p0}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    iget-boolean v3, v3, Lio/sentry/q6;->m:Z

    .line 63
    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    sget-object v5, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 71
    .line 72
    const-string v6, "[Encoder]: sending EOS to encoder"

    .line 73
    .line 74
    new-array v7, v4, [Ljava/lang/Object;

    .line 75
    .line 76
    invoke-interface {v3, v5, v6, v7}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    invoke-virtual {v2}, Landroid/media/MediaCodec;->signalEndOfInputStream()V

    .line 80
    .line 81
    .line 82
    :cond_2
    invoke-virtual {v2}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    :cond_3
    :goto_0
    const-wide/32 v5, 0x186a0

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v1, v5, v6}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    const/4 v6, -0x1

    .line 94
    if-ne v5, v6, :cond_5

    .line 95
    .line 96
    if-nez p1, :cond_4

    .line 97
    .line 98
    goto/16 :goto_2

    .line 99
    .line 100
    :cond_4
    invoke-virtual {p0}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    iget-boolean v5, v5, Lio/sentry/q6;->m:Z

    .line 105
    .line 106
    if-eqz v5, :cond_3

    .line 107
    .line 108
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    sget-object v6, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 113
    .line 114
    const-string v7, "[Encoder]: no output available, spinning to await EOS"

    .line 115
    .line 116
    new-array v8, v4, [Ljava/lang/Object;

    .line 117
    .line 118
    invoke-interface {v5, v6, v7, v8}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_5
    const/4 v6, -0x3

    .line 123
    if-ne v5, v6, :cond_6

    .line 124
    .line 125
    invoke-virtual {v2}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    goto :goto_0

    .line 130
    :cond_6
    const/4 v6, -0x2

    .line 131
    if-ne v5, v6, :cond_9

    .line 132
    .line 133
    iget-boolean v5, v0, Lio/sentry/android/replay/video/b;->c:Z

    .line 134
    .line 135
    if-nez v5, :cond_8

    .line 136
    .line 137
    invoke-virtual {v2}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    iget-boolean v6, v6, Lio/sentry/q6;->m:Z

    .line 149
    .line 150
    if-eqz v6, :cond_7

    .line 151
    .line 152
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    sget-object v7, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 157
    .line 158
    new-instance v8, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    const-string v9, "[Encoder]: encoder output format changed: "

    .line 161
    .line 162
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    new-array v9, v4, [Ljava/lang/Object;

    .line 173
    .line 174
    invoke-interface {v6, v7, v8, v9}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_7
    iget-object v6, v0, Lio/sentry/android/replay/video/b;->b:Landroid/media/MediaMuxer;

    .line 178
    .line 179
    invoke-virtual {v6, v5}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    iput v5, v0, Lio/sentry/android/replay/video/b;->d:I

    .line 184
    .line 185
    invoke-virtual {v6}, Landroid/media/MediaMuxer;->start()V

    .line 186
    .line 187
    .line 188
    const/4 v5, 0x1

    .line 189
    iput-boolean v5, v0, Lio/sentry/android/replay/video/b;->c:Z

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_8
    const-string p0, "format changed twice"

    .line 193
    .line 194
    invoke-static {p0}, Lf42;->s(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_9
    if-gez v5, :cond_a

    .line 199
    .line 200
    invoke-virtual {p0}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    iget-boolean v6, v6, Lio/sentry/q6;->m:Z

    .line 205
    .line 206
    if-eqz v6, :cond_3

    .line 207
    .line 208
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    sget-object v7, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 213
    .line 214
    const-string v8, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "

    .line 215
    .line 216
    invoke-static {v5, v8}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    new-array v8, v4, [Ljava/lang/Object;

    .line 221
    .line 222
    invoke-interface {v6, v7, v5, v8}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    goto/16 :goto_0

    .line 226
    .line 227
    :cond_a
    if-eqz v3, :cond_11

    .line 228
    .line 229
    aget-object v6, v3, v5

    .line 230
    .line 231
    if-eqz v6, :cond_11

    .line 232
    .line 233
    iget v7, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 234
    .line 235
    and-int/lit8 v7, v7, 0x2

    .line 236
    .line 237
    if-eqz v7, :cond_c

    .line 238
    .line 239
    invoke-virtual {p0}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    iget-boolean v7, v7, Lio/sentry/q6;->m:Z

    .line 244
    .line 245
    if-eqz v7, :cond_b

    .line 246
    .line 247
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    sget-object v8, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 252
    .line 253
    const-string v9, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG"

    .line 254
    .line 255
    new-array v10, v4, [Ljava/lang/Object;

    .line 256
    .line 257
    invoke-interface {v7, v8, v9, v10}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    :cond_b
    iput v4, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 261
    .line 262
    :cond_c
    iget v7, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 263
    .line 264
    if-eqz v7, :cond_e

    .line 265
    .line 266
    iget-boolean v7, v0, Lio/sentry/android/replay/video/b;->c:Z

    .line 267
    .line 268
    if-eqz v7, :cond_d

    .line 269
    .line 270
    iget-wide v7, v0, Lio/sentry/android/replay/video/b;->a:J

    .line 271
    .line 272
    iget v9, v0, Lio/sentry/android/replay/video/b;->e:I

    .line 273
    .line 274
    add-int/lit8 v10, v9, 0x1

    .line 275
    .line 276
    iput v10, v0, Lio/sentry/android/replay/video/b;->e:I

    .line 277
    .line 278
    int-to-long v9, v9

    .line 279
    mul-long/2addr v7, v9

    .line 280
    iput-wide v7, v0, Lio/sentry/android/replay/video/b;->f:J

    .line 281
    .line 282
    iput-wide v7, v1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 283
    .line 284
    iget-object v7, v0, Lio/sentry/android/replay/video/b;->b:Landroid/media/MediaMuxer;

    .line 285
    .line 286
    iget v8, v0, Lio/sentry/android/replay/video/b;->d:I

    .line 287
    .line 288
    invoke-virtual {v7, v8, v6, v1}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {p0}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    iget-boolean v6, v6, Lio/sentry/q6;->m:Z

    .line 296
    .line 297
    if-eqz v6, :cond_e

    .line 298
    .line 299
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    sget-object v7, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 304
    .line 305
    new-instance v8, Ljava/lang/StringBuilder;

    .line 306
    .line 307
    const-string v9, "[Encoder]: sent "

    .line 308
    .line 309
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    iget v9, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 313
    .line 314
    const-string v10, " bytes to muxer"

    .line 315
    .line 316
    invoke-static {v8, v9, v10}, Lfm0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v8

    .line 320
    new-array v9, v4, [Ljava/lang/Object;

    .line 321
    .line 322
    invoke-interface {v6, v7, v8, v9}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    goto :goto_1

    .line 326
    :cond_d
    const-string p0, "muxer hasn\'t started"

    .line 327
    .line 328
    invoke-static {p0}, Lf42;->s(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    return-void

    .line 332
    :cond_e
    :goto_1
    invoke-virtual {v2, v5, v4}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 333
    .line 334
    .line 335
    iget v5, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 336
    .line 337
    and-int/lit8 v5, v5, 0x4

    .line 338
    .line 339
    if-eqz v5, :cond_3

    .line 340
    .line 341
    invoke-virtual {p0}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    iget-boolean v0, v0, Lio/sentry/q6;->m:Z

    .line 346
    .line 347
    if-eqz v0, :cond_10

    .line 348
    .line 349
    if-nez p1, :cond_f

    .line 350
    .line 351
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    sget-object p1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 356
    .line 357
    const-string v0, "[Encoder]: reached end of stream unexpectedly"

    .line 358
    .line 359
    new-array v1, v4, [Ljava/lang/Object;

    .line 360
    .line 361
    invoke-interface {p0, p1, v0, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    return-void

    .line 365
    :cond_f
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 366
    .line 367
    .line 368
    move-result-object p0

    .line 369
    sget-object p1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 370
    .line 371
    const-string v0, "[Encoder]: end of stream reached"

    .line 372
    .line 373
    new-array v1, v4, [Ljava/lang/Object;

    .line 374
    .line 375
    invoke-interface {p0, p1, v0, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    :cond_10
    :goto_2
    return-void

    .line 379
    :cond_11
    const-string p0, "encoderOutputBuffer "

    .line 380
    .line 381
    const-string p1, " was null"

    .line 382
    .line 383
    invoke-static {v5, p0, p1}, Len;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object p0

    .line 387
    invoke-static {p0}, Lf42;->s(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    return-void
.end method

.method public d(Landroid/graphics/Bitmap;)V
    .locals 4

    .line 1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "xiaomi"

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-static {v0, v1, v2}, Lkotlin/text/StringsKt;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v3, 0x0

    .line 14
    if-nez v1, :cond_2

    .line 15
    .line 16
    const-string v1, "motorola"

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lkotlin/text/StringsKt;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    sget-object v0, Lio/sentry/android/replay/util/i;->SOC_MANUFACTURER:Lio/sentry/android/replay/util/i;

    .line 25
    .line 26
    invoke-static {v0}, Lio/sentry/android/replay/util/k;->a(Lio/sentry/android/replay/util/i;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "spreadtrum"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    invoke-static {v0}, Lio/sentry/android/replay/util/k;->a(Lio/sentry/android/replay/util/i;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "unisoc"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/d;->g:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Landroid/view/Surface;

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    move-object v0, v3

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    :goto_0
    iget-object v0, p0, Lio/sentry/android/core/d;->g:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Landroid/view/Surface;

    .line 67
    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    invoke-virtual {v0, v3}, Landroid/view/Surface;->lockCanvas(Landroid/graphics/Rect;)Landroid/graphics/Canvas;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :goto_1
    if-eqz v0, :cond_3

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    invoke-virtual {v0, p1, v1, v1, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    iget-object p1, p0, Lio/sentry/android/core/d;->g:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p1, Landroid/view/Surface;

    .line 83
    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 87
    .line 88
    .line 89
    :cond_4
    const/4 p1, 0x0

    .line 90
    invoke-virtual {p0, p1}, Lio/sentry/android/core/d;->c(Z)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    iget-object p0, p0, Lio/sentry/android/core/d;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lio/sentry/util/g;

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/sentry/util/g;->a()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableFramesTracking()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isEnablePerformanceV2()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-nez p0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/MediaCodec;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    :try_start_0
    invoke-virtual {p0, v1}, Lio/sentry/android/core/d;->c(Z)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lio/sentry/android/core/d;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroid/view/Surface;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    iget-object v0, p0, Lio/sentry/android/core/d;->f:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lio/sentry/android/replay/video/b;

    .line 30
    .line 31
    iget-object v1, v0, Lio/sentry/android/replay/video/b;->b:Landroid/media/MediaMuxer;

    .line 32
    .line 33
    iget-boolean v0, v0, Lio/sentry/android/replay/video/b;->c:Z

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/media/MediaMuxer;->stop()V

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual {v1}, Landroid/media/MediaMuxer;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :goto_1
    iget-object p0, p0, Lio/sentry/android/core/d;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Lio/sentry/m6;

    .line 47
    .line 48
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    sget-object v1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 53
    .line 54
    const-string v2, "Failed to properly release video encoder"

    .line 55
    .line 56
    invoke-interface {p0, v1, v2, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public g(Ljava/lang/Runnable;Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lio/sentry/android/core/internal/util/e;->a:Lio/sentry/android/core/internal/util/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/e;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/d;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lio/sentry/android/core/o0;

    .line 16
    .line 17
    new-instance v1, Lio/sentry/android/core/g1;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {v1, v2, p0, p1, p2}, Lio/sentry/android/core/g1;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, v0, Lio/sentry/android/core/o0;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Landroid/os/Handler;

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catchall_0
    if-eqz p2, :cond_1

    .line 32
    .line 33
    iget-object p0, p0, Lio/sentry/android/core/d;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 36
    .line 37
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    sget-object p1, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 42
    .line 43
    const-string v0, "Failed to execute "

    .line 44
    .line 45
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    const/4 v0, 0x0

    .line 50
    new-array v0, v0, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-interface {p0, p1, p2, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void
.end method

.class public abstract Lio/sentry/android/replay/capture/c;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final synthetic s:[Lu21;


# instance fields
.field public final a:Lio/sentry/m6;

.field public final b:Lio/sentry/c1;

.field public final c:Lio/sentry/transport/f;

.field public final d:Ljava/util/concurrent/ScheduledExecutorService;

.field public final e:Ljava/util/concurrent/ScheduledExecutorService;

.field public final f:Lio/sentry/android/core/internal/tombstone/b;

.field public final g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public h:Lio/sentry/android/replay/k;

.field public final i:Lio/sentry/android/replay/capture/b;

.field public final j:Lio/sentry/android/replay/capture/b;

.field public final k:Ljava/util/concurrent/atomic/AtomicLong;

.field public final l:Lio/sentry/android/replay/capture/b;

.field public final m:Lio/sentry/android/replay/capture/b;

.field public final n:Lio/sentry/android/replay/capture/b;

.field public final o:Lio/sentry/android/replay/capture/b;

.field public final p:Ljava/util/concurrent/ConcurrentLinkedDeque;

.field public final q:Ljava/lang/Object;

.field public final r:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lyk1;

    .line 2
    .line 3
    const-string v1, "recorderConfig"

    .line 4
    .line 5
    const-string v2, "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;"

    .line 6
    .line 7
    const-class v3, Lio/sentry/android/replay/capture/c;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Lyk1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lj22;->a:Lk22;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v1, Lyk1;

    .line 18
    .line 19
    const-string v2, "segmentTimestamp"

    .line 20
    .line 21
    const-string v4, "getSegmentTimestamp()Ljava/util/Date;"

    .line 22
    .line 23
    invoke-direct {v1, v3, v2, v4}, Lyk1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Lyk1;

    .line 27
    .line 28
    const-string v4, "screenAtStart"

    .line 29
    .line 30
    const-string v5, "getScreenAtStart()Ljava/lang/String;"

    .line 31
    .line 32
    invoke-direct {v2, v3, v4, v5}, Lyk1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v4, Lyk1;

    .line 36
    .line 37
    const-string v5, "currentReplayId"

    .line 38
    .line 39
    const-string v6, "getCurrentReplayId()Lio/sentry/protocol/SentryId;"

    .line 40
    .line 41
    invoke-direct {v4, v3, v5, v6}, Lyk1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance v5, Lyk1;

    .line 45
    .line 46
    const-string v6, "currentSegment"

    .line 47
    .line 48
    const-string v7, "getCurrentSegment()I"

    .line 49
    .line 50
    invoke-direct {v5, v3, v6, v7}, Lyk1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    new-instance v6, Lyk1;

    .line 54
    .line 55
    const-string v7, "replayType"

    .line 56
    .line 57
    const-string v8, "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;"

    .line 58
    .line 59
    invoke-direct {v6, v3, v7, v8}, Lyk1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 v3, 0x6

    .line 63
    new-array v3, v3, [Lu21;

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    aput-object v0, v3, v7

    .line 67
    .line 68
    const/4 v0, 0x1

    .line 69
    aput-object v1, v3, v0

    .line 70
    .line 71
    const/4 v0, 0x2

    .line 72
    aput-object v2, v3, v0

    .line 73
    .line 74
    const/4 v0, 0x3

    .line 75
    aput-object v4, v3, v0

    .line 76
    .line 77
    const/4 v0, 0x4

    .line 78
    aput-object v5, v3, v0

    .line 79
    .line 80
    const/4 v0, 0x5

    .line 81
    aput-object v6, v3, v0

    .line 82
    .line 83
    sput-object v3, Lio/sentry/android/replay/capture/c;->s:[Lu21;

    .line 84
    .line 85
    return-void
.end method

.method public constructor <init>(Lio/sentry/m6;Lio/sentry/c1;Lio/sentry/transport/f;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/m6;

    .line 17
    .line 18
    iput-object p2, p0, Lio/sentry/android/replay/capture/c;->b:Lio/sentry/c1;

    .line 19
    .line 20
    iput-object p3, p0, Lio/sentry/android/replay/capture/c;->c:Lio/sentry/transport/f;

    .line 21
    .line 22
    iput-object p4, p0, Lio/sentry/android/replay/capture/c;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 23
    .line 24
    iput-object p5, p0, Lio/sentry/android/replay/capture/c;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 25
    .line 26
    new-instance p1, Lio/sentry/android/core/internal/tombstone/b;

    .line 27
    .line 28
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p3, p1, Lio/sentry/android/core/internal/tombstone/b;->c:Ljava/lang/Object;

    .line 35
    .line 36
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    const/16 p3, 0xa

    .line 39
    .line 40
    invoke-direct {p2, p3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object p2, p1, Lio/sentry/android/core/internal/tombstone/b;->d:Ljava/lang/Object;

    .line 44
    .line 45
    iput-object p1, p0, Lio/sentry/android/replay/capture/c;->f:Lio/sentry/android/core/internal/tombstone/b;

    .line 46
    .line 47
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 48
    .line 49
    const/4 p2, 0x0

    .line 50
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lio/sentry/android/replay/capture/c;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 54
    .line 55
    new-instance p1, Lio/sentry/android/replay/capture/b;

    .line 56
    .line 57
    const/4 p2, 0x3

    .line 58
    invoke-direct {p1, p0, p0, p2}, Lio/sentry/android/replay/capture/b;-><init>(Lio/sentry/android/replay/capture/c;Lio/sentry/android/replay/capture/c;I)V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Lio/sentry/android/replay/capture/c;->i:Lio/sentry/android/replay/capture/b;

    .line 62
    .line 63
    new-instance p1, Lio/sentry/android/replay/capture/b;

    .line 64
    .line 65
    const/4 p2, 0x4

    .line 66
    invoke-direct {p1, p0, p0, p2}, Lio/sentry/android/replay/capture/b;-><init>(Lio/sentry/android/replay/capture/c;Lio/sentry/android/replay/capture/c;I)V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Lio/sentry/android/replay/capture/c;->j:Lio/sentry/android/replay/capture/b;

    .line 70
    .line 71
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 72
    .line 73
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Lio/sentry/android/replay/capture/c;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 77
    .line 78
    new-instance p1, Lio/sentry/android/replay/capture/b;

    .line 79
    .line 80
    const/4 p2, 0x5

    .line 81
    invoke-direct {p1, p0, p0, p2}, Lio/sentry/android/replay/capture/b;-><init>(Lio/sentry/android/replay/capture/c;Lio/sentry/android/replay/capture/c;I)V

    .line 82
    .line 83
    .line 84
    iput-object p1, p0, Lio/sentry/android/replay/capture/c;->l:Lio/sentry/android/replay/capture/b;

    .line 85
    .line 86
    sget-object p1, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 87
    .line 88
    new-instance p2, Lio/sentry/android/replay/capture/b;

    .line 89
    .line 90
    invoke-direct {p2, p1, p0, p0}, Lio/sentry/android/replay/capture/b;-><init>(Ljava/lang/Object;Lio/sentry/android/replay/capture/c;Lio/sentry/android/replay/capture/c;)V

    .line 91
    .line 92
    .line 93
    iput-object p2, p0, Lio/sentry/android/replay/capture/c;->m:Lio/sentry/android/replay/capture/b;

    .line 94
    .line 95
    new-instance p1, Lio/sentry/android/replay/capture/b;

    .line 96
    .line 97
    const/4 p2, 0x1

    .line 98
    invoke-direct {p1, p0, p0, p2}, Lio/sentry/android/replay/capture/b;-><init>(Lio/sentry/android/replay/capture/c;Lio/sentry/android/replay/capture/c;I)V

    .line 99
    .line 100
    .line 101
    iput-object p1, p0, Lio/sentry/android/replay/capture/c;->n:Lio/sentry/android/replay/capture/b;

    .line 102
    .line 103
    new-instance p1, Lio/sentry/android/replay/capture/b;

    .line 104
    .line 105
    const/4 p2, 0x2

    .line 106
    invoke-direct {p1, p0, p0, p2}, Lio/sentry/android/replay/capture/b;-><init>(Lio/sentry/android/replay/capture/c;Lio/sentry/android/replay/capture/c;I)V

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, Lio/sentry/android/replay/capture/c;->o:Lio/sentry/android/replay/capture/b;

    .line 110
    .line 111
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 112
    .line 113
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedDeque;-><init>()V

    .line 114
    .line 115
    .line 116
    iput-object p1, p0, Lio/sentry/android/replay/capture/c;->p:Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 117
    .line 118
    new-instance p1, Ljava/lang/Object;

    .line 119
    .line 120
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 121
    .line 122
    .line 123
    iput-object p1, p0, Lio/sentry/android/replay/capture/c;->q:Ljava/lang/Object;

    .line 124
    .line 125
    new-instance p1, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 128
    .line 129
    .line 130
    iput-object p1, p0, Lio/sentry/android/replay/capture/c;->r:Ljava/util/ArrayList;

    .line 131
    .line 132
    return-void
.end method

.method public static c(Lio/sentry/android/replay/capture/c;JLjava/util/Date;Lio/sentry/protocol/w;IIIII)Lio/sentry/android/replay/capture/l;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lio/sentry/android/replay/capture/c;->o:Lio/sentry/android/replay/capture/b;

    .line 4
    .line 5
    sget-object v2, Lio/sentry/android/replay/capture/c;->s:[Lu21;

    .line 6
    .line 7
    const/4 v3, 0x5

    .line 8
    aget-object v3, v2, v3

    .line 9
    .line 10
    invoke-virtual {v1, v0, v3}, Lio/sentry/android/replay/capture/b;->a(Ljava/lang/Object;Lu21;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    move-object v12, v1

    .line 15
    check-cast v12, Lio/sentry/n6;

    .line 16
    .line 17
    iget-object v13, v0, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    .line 18
    .line 19
    iget-object v1, v0, Lio/sentry/android/replay/capture/c;->l:Lio/sentry/android/replay/capture/b;

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    aget-object v2, v2, v3

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lio/sentry/android/replay/capture/b;->a(Ljava/lang/Object;Lu21;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    move-object/from16 v16, v1

    .line 29
    .line 30
    check-cast v16, Ljava/lang/String;

    .line 31
    .line 32
    iget-object v1, v0, Lio/sentry/android/replay/capture/c;->p:Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 33
    .line 34
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v2, v0, Lio/sentry/android/replay/capture/c;->q:Ljava/lang/Object;

    .line 44
    .line 45
    monitor-enter v2

    .line 46
    :try_start_0
    iget-object v3, v0, Lio/sentry/android/replay/capture/c;->r:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v19

    .line 52
    iget-object v3, v0, Lio/sentry/android/replay/capture/c;->r:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    monitor-exit v2

    .line 58
    iget-object v3, v0, Lio/sentry/android/replay/capture/c;->b:Lio/sentry/c1;

    .line 59
    .line 60
    iget-object v4, v0, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/m6;

    .line 61
    .line 62
    const/16 v17, 0x0

    .line 63
    .line 64
    move-wide/from16 v5, p1

    .line 65
    .line 66
    move-object/from16 v7, p3

    .line 67
    .line 68
    move-object/from16 v8, p4

    .line 69
    .line 70
    move/from16 v9, p5

    .line 71
    .line 72
    move/from16 v10, p6

    .line 73
    .line 74
    move/from16 v11, p7

    .line 75
    .line 76
    move/from16 v14, p8

    .line 77
    .line 78
    move/from16 v15, p9

    .line 79
    .line 80
    move-object/from16 v18, v1

    .line 81
    .line 82
    invoke-static/range {v3 .. v19}, Lio/sentry/android/replay/capture/i;->a(Lio/sentry/c1;Lio/sentry/m6;JLjava/util/Date;Lio/sentry/protocol/w;IIILio/sentry/n6;Lio/sentry/android/replay/k;IILjava/lang/String;Ljava/util/List;Ljava/util/Deque;Ljava/util/List;)Lio/sentry/android/replay/capture/l;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    monitor-exit v2

    .line 89
    throw v0
.end method


# virtual methods
.method public abstract a(ZLo;)V
.end method

.method public abstract b()Lio/sentry/android/replay/capture/c;
.end method

.method public final d()Lio/sentry/protocol/w;
    .locals 2

    .line 1
    sget-object v0, Lio/sentry/android/replay/capture/c;->s:[Lu21;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, Lio/sentry/android/replay/capture/c;->m:Lio/sentry/android/replay/capture/b;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, Lio/sentry/android/replay/capture/b;->a(Ljava/lang/Object;Lu21;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lio/sentry/protocol/w;

    .line 13
    .line 14
    return-object p0
.end method

.method public final e()I
    .locals 2

    .line 1
    sget-object v0, Lio/sentry/android/replay/capture/c;->s:[Lu21;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, Lio/sentry/android/replay/capture/c;->n:Lio/sentry/android/replay/capture/b;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, Lio/sentry/android/replay/capture/b;->a(Ljava/lang/Object;Lu21;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public final f()Lio/sentry/android/replay/x;
    .locals 2

    .line 1
    sget-object v0, Lio/sentry/android/replay/capture/c;->s:[Lu21;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, Lio/sentry/android/replay/capture/c;->i:Lio/sentry/android/replay/capture/b;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, Lio/sentry/android/replay/capture/b;->a(Ljava/lang/Object;Lu21;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lio/sentry/android/replay/x;

    .line 13
    .line 14
    return-object p0
.end method

.method public abstract g(Lio/sentry/android/replay/x;)V
.end method

.method public abstract h(Lio/sentry/android/replay/p;)V
.end method

.method public i(Landroid/view/MotionEvent;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/sentry/android/replay/capture/c;->f()Lio/sentry/android/replay/x;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-eqz v2, :cond_e

    .line 10
    .line 11
    iget v3, v2, Lio/sentry/android/replay/x;->d:F

    .line 12
    .line 13
    iget v2, v2, Lio/sentry/android/replay/x;->c:F

    .line 14
    .line 15
    iget-object v4, v0, Lio/sentry/android/replay/capture/c;->f:Lio/sentry/android/core/internal/tombstone/b;

    .line 16
    .line 17
    iget-object v5, v4, Lio/sentry/android/core/internal/tombstone/b;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, Lio/sentry/transport/f;

    .line 20
    .line 21
    iget-object v6, v4, Lio/sentry/android/core/internal/tombstone/b;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v6, Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    const/16 v8, 0xa

    .line 30
    .line 31
    const/4 v9, -0x1

    .line 32
    const/4 v10, 0x0

    .line 33
    if-eqz v7, :cond_c

    .line 34
    .line 35
    const/4 v12, 0x1

    .line 36
    if-eq v7, v12, :cond_a

    .line 37
    .line 38
    const/4 v12, 0x2

    .line 39
    if-eq v7, v12, :cond_2

    .line 40
    .line 41
    const/4 v4, 0x3

    .line 42
    if-eq v7, v4, :cond_1

    .line 43
    .line 44
    const/4 v4, 0x5

    .line 45
    if-eq v7, v4, :cond_c

    .line 46
    .line 47
    const/4 v4, 0x6

    .line 48
    if-eq v7, v4, :cond_a

    .line 49
    .line 50
    :cond_0
    :goto_0
    const/4 v11, 0x0

    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_1
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->clear()V

    .line 54
    .line 55
    .line 56
    new-instance v4, Lio/sentry/rrweb/g;

    .line 57
    .line 58
    invoke-direct {v4}, Lio/sentry/rrweb/g;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-interface {v5}, Lio/sentry/transport/f;->c()J

    .line 62
    .line 63
    .line 64
    move-result-wide v5

    .line 65
    iput-wide v5, v4, Lio/sentry/rrweb/b;->b:J

    .line 66
    .line 67
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    mul-float/2addr v5, v2

    .line 72
    iput v5, v4, Lio/sentry/rrweb/g;->f:F

    .line 73
    .line 74
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    mul-float/2addr v1, v3

    .line 79
    iput v1, v4, Lio/sentry/rrweb/g;->i:F

    .line 80
    .line 81
    iput v10, v4, Lio/sentry/rrweb/g;->e:I

    .line 82
    .line 83
    iput v10, v4, Lio/sentry/rrweb/g;->w:I

    .line 84
    .line 85
    sget-object v1, Lio/sentry/rrweb/f;->TouchCancel:Lio/sentry/rrweb/f;

    .line 86
    .line 87
    iput-object v1, v4, Lio/sentry/rrweb/g;->d:Lio/sentry/rrweb/f;

    .line 88
    .line 89
    invoke-static {v4}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    goto/16 :goto_5

    .line 94
    .line 95
    :cond_2
    invoke-interface {v5}, Lio/sentry/transport/f;->c()J

    .line 96
    .line 97
    .line 98
    move-result-wide v12

    .line 99
    iget-wide v14, v4, Lio/sentry/android/core/internal/tombstone/b;->b:J

    .line 100
    .line 101
    const-wide/16 v10, 0x0

    .line 102
    .line 103
    cmp-long v5, v14, v10

    .line 104
    .line 105
    if-eqz v5, :cond_3

    .line 106
    .line 107
    const-wide/16 v16, 0x32

    .line 108
    .line 109
    add-long v14, v14, v16

    .line 110
    .line 111
    cmp-long v5, v14, v12

    .line 112
    .line 113
    if-lez v5, :cond_3

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_3
    iput-wide v12, v4, Lio/sentry/android/core/internal/tombstone/b;->b:J

    .line 117
    .line 118
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v14

    .line 133
    if-eqz v14, :cond_6

    .line 134
    .line 135
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v14

    .line 139
    check-cast v14, Ljava/lang/Integer;

    .line 140
    .line 141
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 145
    .line 146
    .line 147
    move-result v15

    .line 148
    invoke-virtual {v1, v15}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 149
    .line 150
    .line 151
    move-result v15

    .line 152
    if-ne v15, v9, :cond_4

    .line 153
    .line 154
    move-wide/from16 v17, v10

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_4
    move-wide/from16 v17, v10

    .line 158
    .line 159
    iget-wide v9, v4, Lio/sentry/android/core/internal/tombstone/b;->a:J

    .line 160
    .line 161
    cmp-long v9, v9, v17

    .line 162
    .line 163
    if-nez v9, :cond_5

    .line 164
    .line 165
    iput-wide v12, v4, Lio/sentry/android/core/internal/tombstone/b;->a:J

    .line 166
    .line 167
    :cond_5
    invoke-virtual {v6, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    check-cast v9, Ljava/util/Collection;

    .line 175
    .line 176
    new-instance v10, Lio/sentry/rrweb/h;

    .line 177
    .line 178
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v15}, Landroid/view/MotionEvent;->getX(I)F

    .line 182
    .line 183
    .line 184
    move-result v11

    .line 185
    mul-float/2addr v11, v2

    .line 186
    iput v11, v10, Lio/sentry/rrweb/h;->b:F

    .line 187
    .line 188
    invoke-virtual {v1, v15}, Landroid/view/MotionEvent;->getY(I)F

    .line 189
    .line 190
    .line 191
    move-result v11

    .line 192
    mul-float/2addr v11, v3

    .line 193
    iput v11, v10, Lio/sentry/rrweb/h;->c:F

    .line 194
    .line 195
    const/4 v11, 0x0

    .line 196
    iput v11, v10, Lio/sentry/rrweb/h;->a:I

    .line 197
    .line 198
    iget-wide v14, v4, Lio/sentry/android/core/internal/tombstone/b;->a:J

    .line 199
    .line 200
    sub-long v14, v12, v14

    .line 201
    .line 202
    iput-wide v14, v10, Lio/sentry/rrweb/h;->d:J

    .line 203
    .line 204
    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    :goto_2
    move-wide/from16 v10, v17

    .line 208
    .line 209
    const/4 v9, -0x1

    .line 210
    goto :goto_1

    .line 211
    :cond_6
    move-wide/from16 v17, v10

    .line 212
    .line 213
    iget-wide v1, v4, Lio/sentry/android/core/internal/tombstone/b;->a:J

    .line 214
    .line 215
    sub-long v1, v12, v1

    .line 216
    .line 217
    const-wide/16 v9, 0x1f4

    .line 218
    .line 219
    cmp-long v3, v1, v9

    .line 220
    .line 221
    if-lez v3, :cond_0

    .line 222
    .line 223
    new-instance v11, Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-virtual {v6}, Ljava/util/AbstractMap;->size()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    invoke-direct {v11, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    :cond_7
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    if-eqz v5, :cond_9

    .line 245
    .line 246
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    check-cast v5, Ljava/util/Map$Entry;

    .line 251
    .line 252
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    check-cast v7, Ljava/lang/Number;

    .line 257
    .line 258
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 259
    .line 260
    .line 261
    move-result v7

    .line 262
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    check-cast v5, Ljava/util/ArrayList;

    .line 267
    .line 268
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 269
    .line 270
    .line 271
    move-result v9

    .line 272
    if-nez v9, :cond_7

    .line 273
    .line 274
    new-instance v9, Lio/sentry/rrweb/i;

    .line 275
    .line 276
    invoke-direct {v9}, Lio/sentry/rrweb/i;-><init>()V

    .line 277
    .line 278
    .line 279
    iput-wide v12, v9, Lio/sentry/rrweb/b;->b:J

    .line 280
    .line 281
    new-instance v10, Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-static {v5, v8}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 284
    .line 285
    .line 286
    move-result v14

    .line 287
    invoke-direct {v10, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 288
    .line 289
    .line 290
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 291
    .line 292
    .line 293
    move-result-object v5

    .line 294
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result v14

    .line 298
    if-eqz v14, :cond_8

    .line 299
    .line 300
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v14

    .line 304
    check-cast v14, Lio/sentry/rrweb/h;

    .line 305
    .line 306
    move-object/from16 p1, v9

    .line 307
    .line 308
    iget-wide v8, v14, Lio/sentry/rrweb/h;->d:J

    .line 309
    .line 310
    sub-long/2addr v8, v1

    .line 311
    iput-wide v8, v14, Lio/sentry/rrweb/h;->d:J

    .line 312
    .line 313
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-object/from16 v9, p1

    .line 317
    .line 318
    const/16 v8, 0xa

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_8
    move-object v8, v9

    .line 322
    iput-object v10, v8, Lio/sentry/rrweb/i;->e:Ljava/util/List;

    .line 323
    .line 324
    iput v7, v8, Lio/sentry/rrweb/i;->d:I

    .line 325
    .line 326
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 330
    .line 331
    .line 332
    move-result-object v5

    .line 333
    invoke-virtual {v6, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    check-cast v5, Ljava/util/ArrayList;

    .line 341
    .line 342
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 343
    .line 344
    .line 345
    const/16 v8, 0xa

    .line 346
    .line 347
    goto :goto_3

    .line 348
    :cond_9
    move-wide/from16 v7, v17

    .line 349
    .line 350
    iput-wide v7, v4, Lio/sentry/android/core/internal/tombstone/b;->a:J

    .line 351
    .line 352
    goto/16 :goto_5

    .line 353
    .line 354
    :cond_a
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 355
    .line 356
    .line 357
    move-result v4

    .line 358
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 363
    .line 364
    .line 365
    move-result v8

    .line 366
    const/4 v9, -0x1

    .line 367
    if-ne v8, v9, :cond_b

    .line 368
    .line 369
    goto/16 :goto_0

    .line 370
    .line 371
    :cond_b
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 372
    .line 373
    .line 374
    move-result-object v7

    .line 375
    invoke-virtual {v6, v7}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    new-instance v6, Lio/sentry/rrweb/g;

    .line 379
    .line 380
    invoke-direct {v6}, Lio/sentry/rrweb/g;-><init>()V

    .line 381
    .line 382
    .line 383
    invoke-interface {v5}, Lio/sentry/transport/f;->c()J

    .line 384
    .line 385
    .line 386
    move-result-wide v9

    .line 387
    iput-wide v9, v6, Lio/sentry/rrweb/b;->b:J

    .line 388
    .line 389
    invoke-virtual {v1, v8}, Landroid/view/MotionEvent;->getX(I)F

    .line 390
    .line 391
    .line 392
    move-result v5

    .line 393
    mul-float/2addr v5, v2

    .line 394
    iput v5, v6, Lio/sentry/rrweb/g;->f:F

    .line 395
    .line 396
    invoke-virtual {v1, v8}, Landroid/view/MotionEvent;->getY(I)F

    .line 397
    .line 398
    .line 399
    move-result v1

    .line 400
    mul-float/2addr v1, v3

    .line 401
    iput v1, v6, Lio/sentry/rrweb/g;->i:F

    .line 402
    .line 403
    const/4 v11, 0x0

    .line 404
    iput v11, v6, Lio/sentry/rrweb/g;->e:I

    .line 405
    .line 406
    iput v4, v6, Lio/sentry/rrweb/g;->w:I

    .line 407
    .line 408
    sget-object v1, Lio/sentry/rrweb/f;->TouchEnd:Lio/sentry/rrweb/f;

    .line 409
    .line 410
    iput-object v1, v6, Lio/sentry/rrweb/g;->d:Lio/sentry/rrweb/f;

    .line 411
    .line 412
    invoke-static {v6}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 413
    .line 414
    .line 415
    move-result-object v11

    .line 416
    goto :goto_5

    .line 417
    :cond_c
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 418
    .line 419
    .line 420
    move-result v4

    .line 421
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 422
    .line 423
    .line 424
    move-result v4

    .line 425
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 426
    .line 427
    .line 428
    move-result v8

    .line 429
    const/4 v9, -0x1

    .line 430
    if-ne v8, v9, :cond_d

    .line 431
    .line 432
    goto/16 :goto_0

    .line 433
    .line 434
    :cond_d
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 435
    .line 436
    .line 437
    move-result-object v7

    .line 438
    new-instance v9, Ljava/util/ArrayList;

    .line 439
    .line 440
    const/16 v15, 0xa

    .line 441
    .line 442
    invoke-direct {v9, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 443
    .line 444
    .line 445
    invoke-interface {v6, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    new-instance v6, Lio/sentry/rrweb/g;

    .line 449
    .line 450
    invoke-direct {v6}, Lio/sentry/rrweb/g;-><init>()V

    .line 451
    .line 452
    .line 453
    invoke-interface {v5}, Lio/sentry/transport/f;->c()J

    .line 454
    .line 455
    .line 456
    move-result-wide v9

    .line 457
    iput-wide v9, v6, Lio/sentry/rrweb/b;->b:J

    .line 458
    .line 459
    invoke-virtual {v1, v8}, Landroid/view/MotionEvent;->getX(I)F

    .line 460
    .line 461
    .line 462
    move-result v5

    .line 463
    mul-float/2addr v5, v2

    .line 464
    iput v5, v6, Lio/sentry/rrweb/g;->f:F

    .line 465
    .line 466
    invoke-virtual {v1, v8}, Landroid/view/MotionEvent;->getY(I)F

    .line 467
    .line 468
    .line 469
    move-result v1

    .line 470
    mul-float/2addr v1, v3

    .line 471
    iput v1, v6, Lio/sentry/rrweb/g;->i:F

    .line 472
    .line 473
    const/4 v11, 0x0

    .line 474
    iput v11, v6, Lio/sentry/rrweb/g;->e:I

    .line 475
    .line 476
    iput v4, v6, Lio/sentry/rrweb/g;->w:I

    .line 477
    .line 478
    sget-object v1, Lio/sentry/rrweb/f;->TouchStart:Lio/sentry/rrweb/f;

    .line 479
    .line 480
    iput-object v1, v6, Lio/sentry/rrweb/g;->d:Lio/sentry/rrweb/f;

    .line 481
    .line 482
    invoke-static {v6}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 483
    .line 484
    .line 485
    move-result-object v11

    .line 486
    :goto_5
    if-eqz v11, :cond_e

    .line 487
    .line 488
    iget-object v0, v0, Lio/sentry/android/replay/capture/c;->p:Ljava/util/concurrent/ConcurrentLinkedDeque;

    .line 489
    .line 490
    invoke-static {v0, v11}, Luw;->k(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 491
    .line 492
    .line 493
    :cond_e
    return-void
.end method

.method public abstract j()V
.end method

.method public final k(I)V
    .locals 4

    .line 1
    sget-object v0, Lio/sentry/android/replay/capture/c;->s:[Lu21;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p0, p0, Lio/sentry/android/replay/capture/c;->n:Lio/sentry/android/replay/capture/b;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lio/sentry/android/replay/capture/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    new-instance v1, Lt60;

    .line 31
    .line 32
    iget-object v2, p0, Lio/sentry/android/replay/capture/b;->d:Lio/sentry/android/replay/capture/c;

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    invoke-direct {v1, v0, p1, v2, v3}, Lt60;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/c;I)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lio/sentry/android/replay/capture/b;->c:Lio/sentry/android/replay/capture/c;

    .line 39
    .line 40
    iget-object p1, p0, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/m6;

    .line 41
    .line 42
    invoke-virtual {p1}, Lio/sentry/m6;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {v0}, Lio/sentry/util/thread/a;->c()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    iget-object p0, p0, Lio/sentry/android/replay/capture/c;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 53
    .line 54
    new-instance p1, Lio/sentry/android/replay/util/h;

    .line 55
    .line 56
    new-instance v0, Lio/sentry/k2;

    .line 57
    .line 58
    const/4 v2, 0x2

    .line 59
    invoke-direct {v0, v1, v2}, Lio/sentry/k2;-><init>(Ljava/lang/Object;I)V

    .line 60
    .line 61
    .line 62
    const-string v1, "CaptureStrategy.runInBackground"

    .line 63
    .line 64
    invoke-direct {p1, v0, v1}, Lio/sentry/android/replay/util/h;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Lt60;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception p0

    .line 76
    invoke-virtual {p1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    sget-object v0, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 81
    .line 82
    const-string v1, "Failed to execute task CaptureStrategy.runInBackground"

    .line 83
    .line 84
    invoke-interface {p1, v0, v1, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    :cond_1
    return-void
.end method

.method public final l(Ljava/util/Date;)V
    .locals 4

    .line 1
    sget-object v0, Lio/sentry/android/replay/capture/c;->s:[Lu21;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, Lio/sentry/android/replay/capture/c;->j:Lio/sentry/android/replay/capture/b;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lio/sentry/android/replay/capture/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    new-instance v1, Lio/sentry/android/replay/capture/a;

    .line 27
    .line 28
    iget-object v2, p0, Lio/sentry/android/replay/capture/b;->d:Lio/sentry/android/replay/capture/c;

    .line 29
    .line 30
    const/4 v3, 0x2

    .line 31
    invoke-direct {v1, v0, p1, v2, v3}, Lio/sentry/android/replay/capture/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/c;I)V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lio/sentry/android/replay/capture/b;->c:Lio/sentry/android/replay/capture/c;

    .line 35
    .line 36
    iget-object p1, p0, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/m6;

    .line 37
    .line 38
    invoke-virtual {p1}, Lio/sentry/m6;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v0}, Lio/sentry/util/thread/a;->c()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    iget-object p0, p0, Lio/sentry/android/replay/capture/c;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 49
    .line 50
    new-instance p1, Lio/sentry/android/replay/util/h;

    .line 51
    .line 52
    new-instance v0, Lio/sentry/k2;

    .line 53
    .line 54
    const/4 v2, 0x5

    .line 55
    invoke-direct {v0, v1, v2}, Lio/sentry/k2;-><init>(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    const-string v1, "CaptureStrategy.runInBackground"

    .line 59
    .line 60
    invoke-direct {p1, v0, v1}, Lio/sentry/android/replay/util/h;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :catchall_0
    move-exception p0

    .line 72
    invoke-virtual {p1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    sget-object v0, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 77
    .line 78
    const-string v1, "Failed to execute task CaptureStrategy.runInBackground"

    .line 79
    .line 80
    invoke-interface {p1, v0, v1, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    :cond_1
    return-void
.end method

.method public m(ILio/sentry/protocol/w;Lio/sentry/n6;)V
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/android/replay/k;

    .line 5
    .line 6
    iget-object v1, p0, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/m6;

    .line 7
    .line 8
    invoke-direct {v0, v1, p2}, Lio/sentry/android/replay/k;-><init>(Lio/sentry/m6;Lio/sentry/protocol/w;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    .line 12
    .line 13
    sget-object v0, Lio/sentry/android/replay/capture/c;->s:[Lu21;

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    aget-object v2, v0, v1

    .line 17
    .line 18
    iget-object v3, p0, Lio/sentry/android/replay/capture/c;->m:Lio/sentry/android/replay/capture/b;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v2, v3, Lio/sentry/android/replay/capture/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    invoke-virtual {v2, p2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2, p2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    const-string v5, "Failed to execute task CaptureStrategy.runInBackground"

    .line 37
    .line 38
    const-string v6, "CaptureStrategy.runInBackground"

    .line 39
    .line 40
    if-nez v4, :cond_1

    .line 41
    .line 42
    new-instance v4, Lio/sentry/android/replay/capture/a;

    .line 43
    .line 44
    iget-object v7, v3, Lio/sentry/android/replay/capture/b;->d:Lio/sentry/android/replay/capture/c;

    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    invoke-direct {v4, v2, p2, v7, v8}, Lio/sentry/android/replay/capture/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/c;I)V

    .line 48
    .line 49
    .line 50
    iget-object p2, v3, Lio/sentry/android/replay/capture/b;->c:Lio/sentry/android/replay/capture/c;

    .line 51
    .line 52
    iget-object v2, p2, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/m6;

    .line 53
    .line 54
    invoke-virtual {v2}, Lio/sentry/m6;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-interface {v3}, Lio/sentry/util/thread/a;->c()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_0

    .line 63
    .line 64
    iget-object p2, p2, Lio/sentry/android/replay/capture/c;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 65
    .line 66
    new-instance v2, Lio/sentry/android/replay/util/h;

    .line 67
    .line 68
    new-instance v3, Lio/sentry/k2;

    .line 69
    .line 70
    const/4 v7, 0x1

    .line 71
    invoke-direct {v3, v4, v7}, Lio/sentry/k2;-><init>(Ljava/lang/Object;I)V

    .line 72
    .line 73
    .line 74
    invoke-direct {v2, v3, v6}, Lio/sentry/android/replay/util/h;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p2, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    :try_start_0
    invoke-virtual {v4}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :catchall_0
    move-exception p2

    .line 86
    invoke-virtual {v2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 91
    .line 92
    invoke-interface {v2, v3, v5, p2}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lio/sentry/android/replay/capture/c;->k(I)V

    .line 96
    .line 97
    .line 98
    if-nez p3, :cond_3

    .line 99
    .line 100
    instance-of p1, p0, Lio/sentry/android/replay/capture/n;

    .line 101
    .line 102
    if-eqz p1, :cond_2

    .line 103
    .line 104
    sget-object p3, Lio/sentry/n6;->SESSION:Lio/sentry/n6;

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    sget-object p3, Lio/sentry/n6;->BUFFER:Lio/sentry/n6;

    .line 108
    .line 109
    :cond_3
    :goto_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    const/4 p1, 0x5

    .line 113
    aget-object p1, v0, p1

    .line 114
    .line 115
    iget-object p2, p0, Lio/sentry/android/replay/capture/c;->o:Lio/sentry/android/replay/capture/b;

    .line 116
    .line 117
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget-object p1, p2, Lio/sentry/android/replay/capture/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 124
    .line 125
    invoke-virtual {p1, p3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_5

    .line 134
    .line 135
    new-instance v0, Lt60;

    .line 136
    .line 137
    iget-object v2, p2, Lio/sentry/android/replay/capture/b;->d:Lio/sentry/android/replay/capture/c;

    .line 138
    .line 139
    const/4 v3, 0x2

    .line 140
    invoke-direct {v0, p1, p3, v2, v3}, Lt60;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/c;I)V

    .line 141
    .line 142
    .line 143
    iget-object p1, p2, Lio/sentry/android/replay/capture/b;->c:Lio/sentry/android/replay/capture/c;

    .line 144
    .line 145
    iget-object p2, p1, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/m6;

    .line 146
    .line 147
    invoke-virtual {p2}, Lio/sentry/m6;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 148
    .line 149
    .line 150
    move-result-object p3

    .line 151
    invoke-interface {p3}, Lio/sentry/util/thread/a;->c()Z

    .line 152
    .line 153
    .line 154
    move-result p3

    .line 155
    if-eqz p3, :cond_4

    .line 156
    .line 157
    iget-object p1, p1, Lio/sentry/android/replay/capture/c;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 158
    .line 159
    new-instance p2, Lio/sentry/android/replay/util/h;

    .line 160
    .line 161
    new-instance p3, Lio/sentry/k2;

    .line 162
    .line 163
    invoke-direct {p3, v0, v1}, Lio/sentry/k2;-><init>(Ljava/lang/Object;I)V

    .line 164
    .line 165
    .line 166
    invoke-direct {p2, p3, v6}, Lio/sentry/android/replay/util/h;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_4
    :try_start_1
    invoke-virtual {v0}, Lt60;->invoke()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :catchall_1
    move-exception p1

    .line 178
    invoke-virtual {p2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    sget-object p3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 183
    .line 184
    invoke-interface {p2, p3, v5, p1}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 185
    .line 186
    .line 187
    :cond_5
    :goto_2
    new-instance p1, Ljava/util/Date;

    .line 188
    .line 189
    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, p1}, Lio/sentry/android/replay/capture/c;->l(Ljava/util/Date;)V

    .line 193
    .line 194
    .line 195
    iget-object p1, p0, Lio/sentry/android/replay/capture/c;->c:Lio/sentry/transport/f;

    .line 196
    .line 197
    invoke-interface {p1}, Lio/sentry/transport/f;->c()J

    .line 198
    .line 199
    .line 200
    move-result-wide p1

    .line 201
    iget-object p0, p0, Lio/sentry/android/replay/capture/c;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 202
    .line 203
    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 204
    .line 205
    .line 206
    return-void
.end method

.method public abstract n()V
.end method

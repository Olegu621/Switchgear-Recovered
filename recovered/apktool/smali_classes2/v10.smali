.class public final Lv10;
.super Ljava/lang/Thread;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final synthetic w:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final a:Le93;

.field public final b:Lh22;

.field public c:Lw10;

.field public d:J

.field public e:J

.field public f:I

.field public i:Z

.field private volatile indexInArray:I

.field private volatile nextParkedWorker:Ljava/lang/Object;

.field public final synthetic v:Lx10;

.field private volatile synthetic workerCtl$volatile:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lv10;

    .line 2
    .line 3
    const-string v1, "workerCtl$volatile"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lv10;->w:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lx10;I)V
    .locals 2

    .line 1
    iput-object p1, p0, Lv10;->v:Lx10;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 8
    .line 9
    .line 10
    const-class p1, Lx10;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 17
    .line 18
    .line 19
    new-instance p1, Le93;

    .line 20
    .line 21
    invoke-direct {p1}, Le93;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lv10;->a:Le93;

    .line 25
    .line 26
    new-instance p1, Lh22;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lv10;->b:Lh22;

    .line 32
    .line 33
    sget-object p1, Lw10;->d:Lw10;

    .line 34
    .line 35
    iput-object p1, p0, Lv10;->c:Lw10;

    .line 36
    .line 37
    sget-object p1, Lx10;->V:Lr4;

    .line 38
    .line 39
    iput-object p1, p0, Lv10;->nextParkedWorker:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    long-to-int p1, v0

    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/16 p1, 0x2a

    .line 50
    .line 51
    :goto_0
    iput p1, p0, Lv10;->f:I

    .line 52
    .line 53
    invoke-virtual {p0, p2}, Lv10;->f(I)V

    .line 54
    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final a(Z)Lsm2;
    .locals 10

    .line 1
    iget-object v0, p0, Lv10;->c:Lw10;

    .line 2
    .line 3
    sget-object v1, Lw10;->a:Lw10;

    .line 4
    .line 5
    iget-object v3, p0, Lv10;->v:Lx10;

    .line 6
    .line 7
    const/4 v8, 0x1

    .line 8
    iget-object v9, p0, Lv10;->a:Le93;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v0, Lx10;->w:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 14
    .line 15
    :cond_1
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    const-wide v1, 0x7ffffc0000000000L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long/2addr v1, v4

    .line 25
    const/16 v6, 0x2a

    .line 26
    .line 27
    shr-long/2addr v1, v6

    .line 28
    long-to-int v1, v1

    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    invoke-virtual {v9}, Le93;->g()Lsm2;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    iget-object p1, v3, Lx10;->f:Lir0;

    .line 38
    .line 39
    invoke-virtual {p1}, Lt91;->d()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lsm2;

    .line 44
    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0, v8}, Lv10;->i(I)Lsm2;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_2
    return-object p1

    .line 53
    :cond_3
    const-wide v1, 0x40000000000L

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    sub-long v6, v4, v1

    .line 59
    .line 60
    sget-object v2, Lx10;->w:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 61
    .line 62
    invoke-virtual/range {v2 .. v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    sget-object v0, Lw10;->a:Lw10;

    .line 69
    .line 70
    iput-object v0, p0, Lv10;->c:Lw10;

    .line 71
    .line 72
    :goto_0
    if-eqz p1, :cond_7

    .line 73
    .line 74
    iget p1, v3, Lx10;->a:I

    .line 75
    .line 76
    mul-int/lit8 p1, p1, 0x2

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Lv10;->d(I)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_4

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    const/4 v8, 0x0

    .line 86
    :goto_1
    if-eqz v8, :cond_5

    .line 87
    .line 88
    invoke-virtual {p0}, Lv10;->e()Lsm2;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-eqz p1, :cond_5

    .line 93
    .line 94
    return-object p1

    .line 95
    :cond_5
    invoke-virtual {v9}, Le93;->e()Lsm2;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-eqz p1, :cond_6

    .line 100
    .line 101
    return-object p1

    .line 102
    :cond_6
    if-nez v8, :cond_8

    .line 103
    .line 104
    invoke-virtual {p0}, Lv10;->e()Lsm2;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-eqz p1, :cond_8

    .line 109
    .line 110
    return-object p1

    .line 111
    :cond_7
    invoke-virtual {p0}, Lv10;->e()Lsm2;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-eqz p1, :cond_8

    .line 116
    .line 117
    return-object p1

    .line 118
    :cond_8
    const/4 p1, 0x3

    .line 119
    invoke-virtual {p0, p1}, Lv10;->i(I)Lsm2;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0
.end method

.method public final b()I
    .locals 0

    .line 1
    iget p0, p0, Lv10;->indexInArray:I

    .line 2
    .line 3
    return p0
.end method

.method public final c()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lv10;->nextParkedWorker:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d(I)I
    .locals 2

    .line 1
    iget v0, p0, Lv10;->f:I

    .line 2
    .line 3
    shl-int/lit8 v1, v0, 0xd

    .line 4
    .line 5
    xor-int/2addr v0, v1

    .line 6
    shr-int/lit8 v1, v0, 0x11

    .line 7
    .line 8
    xor-int/2addr v0, v1

    .line 9
    shl-int/lit8 v1, v0, 0x5

    .line 10
    .line 11
    xor-int/2addr v0, v1

    .line 12
    iput v0, p0, Lv10;->f:I

    .line 13
    .line 14
    add-int/lit8 p0, p1, -0x1

    .line 15
    .line 16
    and-int v1, p0, p1

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    and-int/2addr p0, v0

    .line 21
    return p0

    .line 22
    :cond_0
    const p0, 0x7fffffff

    .line 23
    .line 24
    .line 25
    and-int/2addr p0, v0

    .line 26
    rem-int/2addr p0, p1

    .line 27
    return p0
.end method

.method public final e()Lsm2;
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lv10;->d(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object p0, p0, Lv10;->v:Lx10;

    .line 7
    .line 8
    iget-object v1, p0, Lx10;->f:Lir0;

    .line 9
    .line 10
    iget-object p0, p0, Lx10;->e:Lir0;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Lt91;->d()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lsm2;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    invoke-virtual {v1}, Lt91;->d()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lsm2;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    invoke-virtual {v1}, Lt91;->d()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lsm2;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_2
    invoke-virtual {p0}, Lt91;->d()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lsm2;

    .line 44
    .line 45
    return-object p0
.end method

.method public final f(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lv10;->v:Lx10;

    .line 7
    .line 8
    iget-object v1, v1, Lx10;->d:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "-worker-"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const-string v1, "TERMINATED"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput p1, p0, Lv10;->indexInArray:I

    .line 38
    .line 39
    return-void
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv10;->nextParkedWorker:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public final h(Lw10;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lv10;->c:Lw10;

    .line 2
    .line 3
    sget-object v1, Lw10;->a:Lw10;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-eqz v1, :cond_1

    .line 11
    .line 12
    sget-object v2, Lx10;->w:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 13
    .line 14
    const-wide v3, 0x40000000000L

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    iget-object v5, p0, Lv10;->v:Lx10;

    .line 20
    .line 21
    invoke-virtual {v2, v5, v3, v4}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 22
    .line 23
    .line 24
    :cond_1
    if-eq v0, p1, :cond_2

    .line 25
    .line 26
    iput-object p1, p0, Lv10;->c:Lw10;

    .line 27
    .line 28
    :cond_2
    return v1
.end method

.method public final i(I)Lsm2;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lx10;->w:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 6
    .line 7
    iget-object v3, v0, Lv10;->v:Lx10;

    .line 8
    .line 9
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    const-wide/32 v6, 0x1fffff

    .line 14
    .line 15
    .line 16
    and-long/2addr v4, v6

    .line 17
    long-to-int v2, v4

    .line 18
    const/4 v4, 0x2

    .line 19
    const/4 v5, 0x0

    .line 20
    if-ge v2, v4, :cond_0

    .line 21
    .line 22
    return-object v5

    .line 23
    :cond_0
    invoke-virtual {v0, v2}, Lv10;->d(I)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/4 v9, 0x0

    .line 28
    const-wide v10, 0x7fffffffffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    :goto_0
    const-wide/16 v12, 0x0

    .line 34
    .line 35
    if-ge v9, v2, :cond_b

    .line 36
    .line 37
    const/4 v14, 0x1

    .line 38
    add-int/2addr v4, v14

    .line 39
    if-le v4, v2, :cond_1

    .line 40
    .line 41
    move v4, v14

    .line 42
    :cond_1
    iget-object v15, v3, Lx10;->i:Lp32;

    .line 43
    .line 44
    invoke-virtual {v15, v4}, Lp32;->b(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v15

    .line 48
    check-cast v15, Lv10;

    .line 49
    .line 50
    if-eqz v15, :cond_9

    .line 51
    .line 52
    if-eq v15, v0, :cond_9

    .line 53
    .line 54
    iget-object v15, v15, Lv10;->a:Le93;

    .line 55
    .line 56
    const/4 v6, 0x3

    .line 57
    if-ne v1, v6, :cond_2

    .line 58
    .line 59
    invoke-virtual {v15}, Le93;->f()Lsm2;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    const-wide v16, 0x7fffffffffffffffL

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    sget-object v6, Le93;->d:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 73
    .line 74
    invoke-virtual {v6, v15}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    const-wide v16, 0x7fffffffffffffffL

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    sget-object v7, Le93;->c:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 84
    .line 85
    invoke-virtual {v7, v15}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-ne v1, v14, :cond_3

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    const/4 v14, 0x0

    .line 93
    :goto_1
    if-eq v6, v7, :cond_4

    .line 94
    .line 95
    if-eqz v14, :cond_5

    .line 96
    .line 97
    sget-object v8, Le93;->e:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 98
    .line 99
    invoke-virtual {v8, v15}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-nez v8, :cond_5

    .line 104
    .line 105
    :cond_4
    move-object v6, v5

    .line 106
    goto :goto_2

    .line 107
    :cond_5
    add-int/lit8 v8, v6, 0x1

    .line 108
    .line 109
    invoke-virtual {v15, v6, v14}, Le93;->h(IZ)Lsm2;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    if-nez v6, :cond_6

    .line 114
    .line 115
    move v6, v8

    .line 116
    goto :goto_1

    .line 117
    :cond_6
    :goto_2
    iget-object v14, v0, Lv10;->b:Lh22;

    .line 118
    .line 119
    if-eqz v6, :cond_7

    .line 120
    .line 121
    iput-object v6, v14, Lh22;->a:Ljava/lang/Object;

    .line 122
    .line 123
    const-wide/16 v7, -0x1

    .line 124
    .line 125
    :goto_3
    const-wide/16 v20, -0x1

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_7
    invoke-virtual {v15, v1, v14}, Le93;->i(ILh22;)J

    .line 129
    .line 130
    .line 131
    move-result-wide v18

    .line 132
    move-wide/from16 v7, v18

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :goto_4
    cmp-long v6, v7, v20

    .line 136
    .line 137
    if-nez v6, :cond_8

    .line 138
    .line 139
    iget-object v0, v14, Lh22;->a:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, Lsm2;

    .line 142
    .line 143
    iput-object v5, v14, Lh22;->a:Ljava/lang/Object;

    .line 144
    .line 145
    return-object v0

    .line 146
    :cond_8
    cmp-long v6, v7, v12

    .line 147
    .line 148
    if-lez v6, :cond_a

    .line 149
    .line 150
    invoke-static {v10, v11, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 151
    .line 152
    .line 153
    move-result-wide v10

    .line 154
    goto :goto_5

    .line 155
    :cond_9
    const-wide v16, 0x7fffffffffffffffL

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    :cond_a
    :goto_5
    add-int/lit8 v9, v9, 0x1

    .line 161
    .line 162
    goto/16 :goto_0

    .line 163
    .line 164
    :cond_b
    const-wide v16, 0x7fffffffffffffffL

    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    cmp-long v1, v10, v16

    .line 170
    .line 171
    if-eqz v1, :cond_c

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_c
    move-wide v10, v12

    .line 175
    :goto_6
    iput-wide v10, v0, Lv10;->e:J

    .line 176
    .line 177
    return-object v5
.end method

.method public final run()V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :cond_0
    :goto_0
    move v0, v2

    .line 5
    :cond_1
    :goto_1
    iget-object v3, v1, Lv10;->v:Lx10;

    .line 6
    .line 7
    sget-object v4, Lx10;->U:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 8
    .line 9
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_2

    .line 14
    .line 15
    goto/16 :goto_a

    .line 16
    .line 17
    :cond_2
    iget-object v3, v1, Lv10;->c:Lw10;

    .line 18
    .line 19
    sget-object v4, Lw10;->e:Lw10;

    .line 20
    .line 21
    if-eq v3, v4, :cond_18

    .line 22
    .line 23
    iget-boolean v3, v1, Lv10;->i:Z

    .line 24
    .line 25
    invoke-virtual {v1, v3}, Lv10;->a(Z)Lsm2;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const-wide/32 v5, -0x200000

    .line 30
    .line 31
    .line 32
    const-wide/16 v7, 0x0

    .line 33
    .line 34
    if-eqz v3, :cond_9

    .line 35
    .line 36
    iput-wide v7, v1, Lv10;->e:J

    .line 37
    .line 38
    iget-object v9, v1, Lv10;->v:Lx10;

    .line 39
    .line 40
    iget-object v0, v3, Lsm2;->b:Lvm2;

    .line 41
    .line 42
    iget v10, v0, Lvm2;->a:I

    .line 43
    .line 44
    iput-wide v7, v1, Lv10;->d:J

    .line 45
    .line 46
    iget-object v0, v1, Lv10;->c:Lw10;

    .line 47
    .line 48
    sget-object v7, Lw10;->c:Lw10;

    .line 49
    .line 50
    if-ne v0, v7, :cond_3

    .line 51
    .line 52
    sget-object v0, Lw10;->b:Lw10;

    .line 53
    .line 54
    iput-object v0, v1, Lv10;->c:Lw10;

    .line 55
    .line 56
    :cond_3
    if-nez v10, :cond_4

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    sget-object v0, Lw10;->b:Lw10;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Lv10;->h(Lw10;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_7

    .line 66
    .line 67
    invoke-virtual {v9}, Lx10;->k()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_5
    sget-object v0, Lx10;->w:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 75
    .line 76
    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 77
    .line 78
    .line 79
    move-result-wide v7

    .line 80
    invoke-virtual {v9, v7, v8}, Lx10;->i(J)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_6
    invoke-virtual {v9}, Lx10;->k()Z

    .line 88
    .line 89
    .line 90
    :cond_7
    :goto_2
    :try_start_0
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :catchall_0
    move-exception v0

    .line 95
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v3}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    invoke-interface {v7, v3, v0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    :goto_3
    if-nez v10, :cond_8

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_8
    sget-object v0, Lx10;->w:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 110
    .line 111
    invoke-virtual {v0, v9, v5, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 112
    .line 113
    .line 114
    iget-object v0, v1, Lv10;->c:Lw10;

    .line 115
    .line 116
    if-eq v0, v4, :cond_0

    .line 117
    .line 118
    sget-object v0, Lw10;->d:Lw10;

    .line 119
    .line 120
    iput-object v0, v1, Lv10;->c:Lw10;

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_9
    iput-boolean v2, v1, Lv10;->i:Z

    .line 124
    .line 125
    iget-wide v3, v1, Lv10;->e:J

    .line 126
    .line 127
    cmp-long v3, v3, v7

    .line 128
    .line 129
    const/4 v4, 0x1

    .line 130
    if-eqz v3, :cond_b

    .line 131
    .line 132
    if-nez v0, :cond_a

    .line 133
    .line 134
    move v0, v4

    .line 135
    goto/16 :goto_1

    .line 136
    .line 137
    :cond_a
    sget-object v0, Lw10;->c:Lw10;

    .line 138
    .line 139
    invoke-virtual {v1, v0}, Lv10;->h(Lw10;)Z

    .line 140
    .line 141
    .line 142
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 143
    .line 144
    .line 145
    iget-wide v3, v1, Lv10;->e:J

    .line 146
    .line 147
    invoke-static {v3, v4}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    .line 148
    .line 149
    .line 150
    iput-wide v7, v1, Lv10;->e:J

    .line 151
    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    :cond_b
    iget-object v3, v1, Lv10;->nextParkedWorker:Ljava/lang/Object;

    .line 155
    .line 156
    sget-object v9, Lx10;->V:Lr4;

    .line 157
    .line 158
    if-eq v3, v9, :cond_15

    .line 159
    .line 160
    sget-object v3, Lv10;->w:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 161
    .line 162
    const/4 v5, -0x1

    .line 163
    invoke-virtual {v3, v1, v5}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 164
    .line 165
    .line 166
    :cond_c
    :goto_4
    iget-object v3, v1, Lv10;->nextParkedWorker:Ljava/lang/Object;

    .line 167
    .line 168
    sget-object v6, Lx10;->V:Lr4;

    .line 169
    .line 170
    if-eq v3, v6, :cond_1

    .line 171
    .line 172
    sget-object v3, Lv10;->w:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 173
    .line 174
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    if-ne v6, v5, :cond_1

    .line 179
    .line 180
    iget-object v6, v1, Lv10;->v:Lx10;

    .line 181
    .line 182
    sget-object v9, Lx10;->U:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 183
    .line 184
    invoke-virtual {v9, v6}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    if-eqz v6, :cond_d

    .line 189
    .line 190
    goto/16 :goto_1

    .line 191
    .line 192
    :cond_d
    iget-object v6, v1, Lv10;->c:Lw10;

    .line 193
    .line 194
    sget-object v12, Lw10;->e:Lw10;

    .line 195
    .line 196
    if-ne v6, v12, :cond_e

    .line 197
    .line 198
    goto/16 :goto_1

    .line 199
    .line 200
    :cond_e
    sget-object v6, Lw10;->c:Lw10;

    .line 201
    .line 202
    invoke-virtual {v1, v6}, Lv10;->h(Lw10;)Z

    .line 203
    .line 204
    .line 205
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 206
    .line 207
    .line 208
    iget-wide v13, v1, Lv10;->d:J

    .line 209
    .line 210
    cmp-long v6, v13, v7

    .line 211
    .line 212
    if-nez v6, :cond_f

    .line 213
    .line 214
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 215
    .line 216
    .line 217
    move-result-wide v13

    .line 218
    iget-object v6, v1, Lv10;->v:Lx10;

    .line 219
    .line 220
    const-wide/32 v15, 0x1fffff

    .line 221
    .line 222
    .line 223
    iget-wide v10, v6, Lx10;->c:J

    .line 224
    .line 225
    add-long/2addr v13, v10

    .line 226
    iput-wide v13, v1, Lv10;->d:J

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_f
    const-wide/32 v15, 0x1fffff

    .line 230
    .line 231
    .line 232
    :goto_5
    iget-object v6, v1, Lv10;->v:Lx10;

    .line 233
    .line 234
    iget-wide v10, v6, Lx10;->c:J

    .line 235
    .line 236
    invoke-static {v10, v11}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    .line 237
    .line 238
    .line 239
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 240
    .line 241
    .line 242
    move-result-wide v10

    .line 243
    iget-wide v13, v1, Lv10;->d:J

    .line 244
    .line 245
    sub-long/2addr v10, v13

    .line 246
    cmp-long v6, v10, v7

    .line 247
    .line 248
    if-ltz v6, :cond_c

    .line 249
    .line 250
    iput-wide v7, v1, Lv10;->d:J

    .line 251
    .line 252
    iget-object v6, v1, Lv10;->v:Lx10;

    .line 253
    .line 254
    iget-object v10, v6, Lx10;->i:Lp32;

    .line 255
    .line 256
    monitor-enter v10

    .line 257
    :try_start_1
    invoke-virtual {v9, v6}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 258
    .line 259
    .line 260
    move-result v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 261
    if-eqz v9, :cond_10

    .line 262
    .line 263
    move v9, v4

    .line 264
    goto :goto_6

    .line 265
    :cond_10
    move v9, v2

    .line 266
    :goto_6
    if-eqz v9, :cond_11

    .line 267
    .line 268
    monitor-exit v10

    .line 269
    goto :goto_4

    .line 270
    :cond_11
    :try_start_2
    sget-object v9, Lx10;->w:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 271
    .line 272
    invoke-virtual {v9, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 273
    .line 274
    .line 275
    move-result-wide v13

    .line 276
    and-long/2addr v13, v15

    .line 277
    long-to-int v11, v13

    .line 278
    iget v13, v6, Lx10;->a:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 279
    .line 280
    if-gt v11, v13, :cond_12

    .line 281
    .line 282
    monitor-exit v10

    .line 283
    goto :goto_4

    .line 284
    :cond_12
    :try_start_3
    invoke-virtual {v3, v1, v5, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 285
    .line 286
    .line 287
    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 288
    if-nez v3, :cond_13

    .line 289
    .line 290
    monitor-exit v10

    .line 291
    goto :goto_4

    .line 292
    :cond_13
    :try_start_4
    iget v3, v1, Lv10;->indexInArray:I

    .line 293
    .line 294
    invoke-virtual {v1, v2}, Lv10;->f(I)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v6, v1, v3, v2}, Lx10;->h(Lv10;II)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v9, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndDecrement(Ljava/lang/Object;)J

    .line 301
    .line 302
    .line 303
    move-result-wide v13

    .line 304
    and-long/2addr v13, v15

    .line 305
    long-to-int v9, v13

    .line 306
    if-eq v9, v3, :cond_14

    .line 307
    .line 308
    iget-object v11, v6, Lx10;->i:Lp32;

    .line 309
    .line 310
    invoke-virtual {v11, v9}, Lp32;->b(I)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v11

    .line 314
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    check-cast v11, Lv10;

    .line 318
    .line 319
    iget-object v13, v6, Lx10;->i:Lp32;

    .line 320
    .line 321
    invoke-virtual {v13, v3, v11}, Lp32;->c(ILv10;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v11, v3}, Lv10;->f(I)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v6, v11, v9, v3}, Lx10;->h(Lv10;II)V

    .line 328
    .line 329
    .line 330
    goto :goto_7

    .line 331
    :catchall_1
    move-exception v0

    .line 332
    goto :goto_8

    .line 333
    :cond_14
    :goto_7
    iget-object v3, v6, Lx10;->i:Lp32;

    .line 334
    .line 335
    const/4 v6, 0x0

    .line 336
    invoke-virtual {v3, v9, v6}, Lp32;->c(ILv10;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 337
    .line 338
    .line 339
    monitor-exit v10

    .line 340
    iput-object v12, v1, Lv10;->c:Lw10;

    .line 341
    .line 342
    goto/16 :goto_4

    .line 343
    .line 344
    :goto_8
    monitor-exit v10

    .line 345
    throw v0

    .line 346
    :cond_15
    const-wide/32 v15, 0x1fffff

    .line 347
    .line 348
    .line 349
    iget-object v3, v1, Lv10;->v:Lx10;

    .line 350
    .line 351
    iget-object v4, v1, Lv10;->nextParkedWorker:Ljava/lang/Object;

    .line 352
    .line 353
    if-eq v4, v9, :cond_16

    .line 354
    .line 355
    goto/16 :goto_1

    .line 356
    .line 357
    :cond_16
    sget-object v4, Lx10;->v:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 358
    .line 359
    :goto_9
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 360
    .line 361
    .line 362
    move-result-wide v19

    .line 363
    and-long v7, v19, v15

    .line 364
    .line 365
    long-to-int v7, v7

    .line 366
    const-wide/32 v8, 0x200000

    .line 367
    .line 368
    .line 369
    add-long v8, v19, v8

    .line 370
    .line 371
    and-long/2addr v8, v5

    .line 372
    iget v10, v1, Lv10;->indexInArray:I

    .line 373
    .line 374
    iget-object v11, v3, Lx10;->i:Lp32;

    .line 375
    .line 376
    invoke-virtual {v11, v7}, Lp32;->b(I)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v7

    .line 380
    iput-object v7, v1, Lv10;->nextParkedWorker:Ljava/lang/Object;

    .line 381
    .line 382
    sget-object v17, Lx10;->v:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 383
    .line 384
    int-to-long v10, v10

    .line 385
    or-long v21, v8, v10

    .line 386
    .line 387
    move-object/from16 v18, v3

    .line 388
    .line 389
    invoke-virtual/range {v17 .. v22}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 390
    .line 391
    .line 392
    move-result v3

    .line 393
    if-eqz v3, :cond_17

    .line 394
    .line 395
    goto/16 :goto_1

    .line 396
    .line 397
    :cond_17
    move-object/from16 v3, v18

    .line 398
    .line 399
    goto :goto_9

    .line 400
    :cond_18
    :goto_a
    sget-object v0, Lw10;->e:Lw10;

    .line 401
    .line 402
    invoke-virtual {v1, v0}, Lv10;->h(Lw10;)Z

    .line 403
    .line 404
    .line 405
    return-void
.end method

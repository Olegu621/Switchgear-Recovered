.class public Ls91;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final synthetic a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic d:J

.field public static final synthetic e:J

.field public static final synthetic f:J


# instance fields
.field private volatile synthetic _next$volatile:Ljava/lang/Object;

.field private volatile synthetic _prev$volatile:Ljava/lang/Object;

.field private volatile synthetic _removedRef$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-class v0, Ls91;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "_next$volatile"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    sput-object v3, Ls91;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    sget-object v3, Lio/sentry/util/b;->a:Lsun/misc/Unsafe;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v3, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    sput-wide v4, Ls91;->d:J

    .line 24
    .line 25
    const-string v2, "_prev$volatile"

    .line 26
    .line 27
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    sput-object v4, Ls91;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v3, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    sput-wide v4, Ls91;->e:J

    .line 42
    .line 43
    const-string v2, "_removedRef$volatile"

    .line 44
    .line 45
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    sput-object v1, Ls91;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 50
    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v3, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    sput-wide v0, Ls91;->f:J

    .line 60
    .line 61
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Ls91;->_next$volatile:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p0, p0, Ls91;->_prev$volatile:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public static f(Ls91;)Ls91;
    .locals 3

    .line 1
    :goto_0
    invoke-virtual {p0}, Ls91;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    sget-object v0, Ls91;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v0, Lio/sentry/util/b;->a:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-wide v1, Ls91;->e:J

    .line 16
    .line 17
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ls91;

    .line 22
    .line 23
    goto :goto_0
.end method


# virtual methods
.method public final d(Lqn1;)V
    .locals 9

    .line 1
    sget-object v0, Ls91;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lio/sentry/util/b;->a:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Ls91;->e:J

    .line 9
    .line 10
    invoke-virtual {v0, p1, v1, v2, p0}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Ls91;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget-wide v1, Ls91;->d:J

    .line 19
    .line 20
    invoke-virtual {v0, p1, v1, v2, p0}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p0}, Ls91;->h()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eq v0, p0, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    :goto_1
    sget-object v3, Lio/sentry/util/b;->a:Lsun/misc/Unsafe;

    .line 31
    .line 32
    sget-wide v5, Ls91;->d:J

    .line 33
    .line 34
    move-object v7, p0

    .line 35
    move-object v4, p0

    .line 36
    move-object v8, p1

    .line 37
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v8, v4}, Ls91;->g(Ls91;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-eq p0, v4, :cond_2

    .line 52
    .line 53
    move-object p0, v4

    .line 54
    move-object p1, v8

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move-object p0, v4

    .line 57
    move-object p1, v8

    .line 58
    goto :goto_1
.end method

.method public final e()Ls91;
    .locals 15

    .line 1
    :goto_0
    sget-object v0, Ls91;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lio/sentry/util/b;->a:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Ls91;->e:J

    .line 9
    .line 10
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    move-object v7, v0

    .line 15
    check-cast v7, Ls91;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    move-object v9, v0

    .line 19
    move-object v8, v7

    .line 20
    :goto_1
    sget-object v3, Ls91;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    if-eqz v8, :cond_c

    .line 26
    .line 27
    sget-object v3, Lio/sentry/util/b;->a:Lsun/misc/Unsafe;

    .line 28
    .line 29
    sget-wide v4, Ls91;->d:J

    .line 30
    .line 31
    invoke-virtual {v3, v8, v4, v5}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    if-ne v6, p0, :cond_3

    .line 36
    .line 37
    if-ne v7, v8, :cond_0

    .line 38
    .line 39
    goto :goto_4

    .line 40
    :cond_0
    :goto_2
    sget-object v3, Lio/sentry/util/b;->a:Lsun/misc/Unsafe;

    .line 41
    .line 42
    sget-wide v5, Ls91;->e:J

    .line 43
    .line 44
    move-object v4, p0

    .line 45
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    move-object v14, v7

    .line 50
    move-object v7, v4

    .line 51
    if-eqz p0, :cond_1

    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_1
    invoke-virtual {v3, v7, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-eq p0, v14, :cond_2

    .line 59
    .line 60
    :goto_3
    move-object p0, v7

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    move-object p0, v7

    .line 63
    move-object v7, v14

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    move-object v14, v7

    .line 66
    move-object v7, p0

    .line 67
    invoke-virtual {v7}, Ls91;->k()Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_4

    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_4
    if-nez v6, :cond_5

    .line 75
    .line 76
    :goto_4
    return-object v8

    .line 77
    :cond_5
    instance-of p0, v6, Lxd;

    .line 78
    .line 79
    if-eqz p0, :cond_6

    .line 80
    .line 81
    check-cast v6, Lxd;

    .line 82
    .line 83
    invoke-virtual {v6, v8}, Lxd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_6
    instance-of p0, v6, Lh32;

    .line 88
    .line 89
    if-eqz p0, :cond_b

    .line 90
    .line 91
    if-eqz v9, :cond_9

    .line 92
    .line 93
    check-cast v6, Lh32;

    .line 94
    .line 95
    iget-object v13, v6, Lh32;->a:Ls91;

    .line 96
    .line 97
    :cond_7
    move-object v12, v8

    .line 98
    sget-object v8, Lio/sentry/util/b;->a:Lsun/misc/Unsafe;

    .line 99
    .line 100
    sget-wide v10, Ls91;->d:J

    .line 101
    .line 102
    invoke-virtual/range {v8 .. v13}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    move-object v3, v8

    .line 107
    move-object v8, v12

    .line 108
    if-eqz p0, :cond_8

    .line 109
    .line 110
    move-object p0, v7

    .line 111
    move-object v8, v9

    .line 112
    move-object v7, v14

    .line 113
    move-object v9, v0

    .line 114
    goto :goto_1

    .line 115
    :cond_8
    invoke-virtual {v3, v9, v4, v5}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    if-eq p0, v8, :cond_7

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_9
    if-eqz v8, :cond_a

    .line 123
    .line 124
    invoke-virtual {v3, v8, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    move-object v8, p0

    .line 129
    check-cast v8, Ls91;

    .line 130
    .line 131
    :goto_5
    move-object p0, v7

    .line 132
    move-object v7, v14

    .line 133
    goto :goto_1

    .line 134
    :cond_a
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 135
    .line 136
    .line 137
    return-object v0

    .line 138
    :cond_b
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-object p0, v6

    .line 142
    check-cast p0, Ls91;

    .line 143
    .line 144
    move-object v9, v8

    .line 145
    move-object v8, p0

    .line 146
    goto :goto_5

    .line 147
    :cond_c
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 148
    .line 149
    .line 150
    return-object v0
.end method

.method public final g(Ls91;)V
    .locals 9

    .line 1
    :goto_0
    sget-object v0, Ls91;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_6

    .line 7
    .line 8
    sget-object v0, Lio/sentry/util/b;->a:Lsun/misc/Unsafe;

    .line 9
    .line 10
    sget-wide v1, Ls91;->e:J

    .line 11
    .line 12
    invoke-virtual {v0, p1, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v7, v0

    .line 17
    check-cast v7, Ls91;

    .line 18
    .line 19
    invoke-virtual {p0}, Ls91;->h()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eq v0, p1, :cond_0

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    :goto_1
    if-eqz p1, :cond_5

    .line 27
    .line 28
    sget-object v3, Lio/sentry/util/b;->a:Lsun/misc/Unsafe;

    .line 29
    .line 30
    sget-wide v5, Ls91;->e:J

    .line 31
    .line 32
    move-object v8, p0

    .line 33
    move-object v4, p1

    .line 34
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    invoke-virtual {v8}, Ls91;->k()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_1

    .line 45
    .line 46
    invoke-virtual {v4}, Ls91;->e()Ls91;

    .line 47
    .line 48
    .line 49
    :cond_1
    :goto_2
    return-void

    .line 50
    :cond_2
    if-eqz v4, :cond_4

    .line 51
    .line 52
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    move-object p1, v4

    .line 57
    if-eq p0, v7, :cond_3

    .line 58
    .line 59
    move-object p0, v8

    .line 60
    goto :goto_0

    .line 61
    :cond_3
    move-object p0, v8

    .line 62
    goto :goto_1

    .line 63
    :cond_4
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_5
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_6
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final h()Ljava/lang/Object;
    .locals 3

    .line 1
    :goto_0
    sget-object v0, Ls91;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lio/sentry/util/b;->a:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Ls91;->d:J

    .line 9
    .line 10
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    instance-of v1, v0, Lxd;

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    check-cast v0, Lxd;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Lxd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    goto :goto_0
.end method

.method public final i()Ls91;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ls91;->h()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Lh32;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    check-cast v0, Lh32;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object p0, v0, Lh32;->a:Ls91;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    check-cast p0, Ls91;

    .line 23
    .line 24
    return-object p0
.end method

.method public final j()Ls91;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ls91;->e()Ls91;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Ls91;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v0, Lio/sentry/util/b;->a:Lsun/misc/Unsafe;

    .line 13
    .line 14
    sget-wide v1, Ls91;->e:J

    .line 15
    .line 16
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ls91;

    .line 21
    .line 22
    invoke-static {p0}, Ls91;->f(Ls91;)Ls91;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    return-object v0
.end method

.method public k()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ls91;->h()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p0, p0, Lh32;

    .line 6
    .line 7
    return p0
.end method

.method public final l()Ls91;
    .locals 7

    .line 1
    :goto_0
    invoke-virtual {p0}, Ls91;->h()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v4

    .line 5
    instance-of v0, v4, Lh32;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast v4, Lh32;

    .line 10
    .line 11
    iget-object p0, v4, Lh32;->a:Ls91;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    if-ne v4, p0, :cond_1

    .line 15
    .line 16
    check-cast v4, Ls91;

    .line 17
    .line 18
    return-object v4

    .line 19
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-object v6, v4

    .line 23
    check-cast v6, Ls91;

    .line 24
    .line 25
    invoke-virtual {v6}, Ls91;->m()Lh32;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    :goto_1
    sget-object v0, Ls91;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    sget-object v0, Lio/sentry/util/b;->a:Lsun/misc/Unsafe;

    .line 35
    .line 36
    sget-wide v2, Ls91;->d:J

    .line 37
    .line 38
    move-object v1, p0

    .line 39
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_2

    .line 44
    .line 45
    invoke-virtual {v6}, Ls91;->e()Ls91;

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_2
    invoke-virtual {v0, v1, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-eq p0, v4, :cond_3

    .line 55
    .line 56
    move-object p0, v1

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    move-object p0, v1

    .line 59
    goto :goto_1
.end method

.method public final m()Lh32;
    .locals 4

    .line 1
    sget-object v0, Ls91;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lio/sentry/util/b;->a:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Ls91;->f:J

    .line 9
    .line 10
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Lh32;

    .line 15
    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    new-instance v3, Lh32;

    .line 19
    .line 20
    invoke-direct {v3, p0}, Lh32;-><init>(Ls91;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p0, v1, v2, v3}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-object v3
.end method

.method public final n(Lo01;Lqn1;Lu01;)I
    .locals 9

    .line 1
    sget-object v0, Ls91;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lio/sentry/util/b;->a:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Ls91;->e:J

    .line 9
    .line 10
    invoke-virtual {v0, p1, v1, v2, p0}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Ls91;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget-wide v1, Ls91;->d:J

    .line 19
    .line 20
    invoke-virtual {v0, p1, v1, v2, p2}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object p2, p3, Lu01;->d:Lqn1;

    .line 24
    .line 25
    :goto_0
    sget-object v3, Lio/sentry/util/b;->a:Lsun/misc/Unsafe;

    .line 26
    .line 27
    sget-wide v5, Ls91;->d:J

    .line 28
    .line 29
    move-object v4, p0

    .line 30
    move-object v7, p2

    .line 31
    move-object v8, p3

    .line 32
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    invoke-virtual {v8, v4}, Lxd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-nez p0, :cond_0

    .line 43
    .line 44
    const/4 p0, 0x1

    .line 45
    return p0

    .line 46
    :cond_0
    const/4 p0, 0x2

    .line 47
    return p0

    .line 48
    :cond_1
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-eq p0, v7, :cond_2

    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return p0

    .line 56
    :cond_2
    move-object p0, v4

    .line 57
    move-object p2, v7

    .line 58
    move-object p3, v8

    .line 59
    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lr91;

    .line 7
    .line 8
    const-string v5, "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    const-class v3, Lk50;

    .line 12
    .line 13
    const-string v4, "classSimpleName"

    .line 14
    .line 15
    move-object v2, p0

    .line 16
    invoke-direct/range {v1 .. v6}, Lty1;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const/16 p0, 0x40

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-static {v2}, Lk50;->t(Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

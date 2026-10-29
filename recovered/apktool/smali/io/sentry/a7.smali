.class public final Lio/sentry/a7;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/k1;


# instance fields
.field public final a:Lio/sentry/t4;

.field public b:Lio/sentry/t4;

.field public final c:Lio/sentry/b7;

.field public final d:Lio/sentry/x6;

.field public e:Ljava/io/IOException;

.field public final f:Lio/sentry/c1;

.field public g:Z

.field public final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final i:Lio/sentry/e7;

.field public j:Lio/sentry/c7;

.field public final k:Ljava/util/concurrent/ConcurrentHashMap;

.field public final l:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(Lio/sentry/j7;Lio/sentry/x6;Lio/sentry/g4;Lio/sentry/k7;)V
    .locals 2

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p0, Lio/sentry/a7;->g:Z

    .line 78
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lio/sentry/a7;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 79
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/a7;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 80
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/a7;->l:Ljava/util/concurrent/ConcurrentHashMap;

    .line 81
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 82
    new-instance v0, Lio/sentry/util/a;

    .line 83
    iput-object p1, p0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 84
    iget-object v0, p4, Lio/sentry/e7;->d:Ljava/lang/String;

    .line 85
    iput-object v0, p1, Lio/sentry/b7;->w:Ljava/lang/String;

    .line 86
    iput-object p2, p0, Lio/sentry/a7;->d:Lio/sentry/x6;

    .line 87
    iput-object p3, p0, Lio/sentry/a7;->f:Lio/sentry/c1;

    const/4 p1, 0x0

    .line 88
    iput-object p1, p0, Lio/sentry/a7;->j:Lio/sentry/c7;

    .line 89
    iget-object p1, p4, Lio/sentry/e7;->a:Lio/sentry/t4;

    if-eqz p1, :cond_0

    .line 90
    iput-object p1, p0, Lio/sentry/a7;->a:Lio/sentry/t4;

    goto :goto_0

    .line 91
    :cond_0
    invoke-virtual {p3}, Lio/sentry/g4;->l()Lio/sentry/m6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/m6;->getDateProvider()Lio/sentry/u4;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/u4;->a()Lio/sentry/t4;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/a7;->a:Lio/sentry/t4;

    .line 92
    :goto_0
    iput-object p4, p0, Lio/sentry/a7;->i:Lio/sentry/e7;

    return-void
.end method

.method public constructor <init>(Lio/sentry/x6;Lio/sentry/g4;Lio/sentry/b7;Lio/sentry/e7;Lio/sentry/u6;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lio/sentry/a7;->g:Z

    .line 6
    .line 7
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lio/sentry/a7;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lio/sentry/a7;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 20
    .line 21
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lio/sentry/a7;->l:Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v0, Lio/sentry/util/a;

    .line 34
    .line 35
    iput-object p3, p0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 36
    .line 37
    iget-object v0, p4, Lio/sentry/e7;->d:Ljava/lang/String;

    .line 38
    .line 39
    iput-object v0, p3, Lio/sentry/b7;->w:Ljava/lang/String;

    .line 40
    .line 41
    iput-object p1, p0, Lio/sentry/a7;->d:Lio/sentry/x6;

    .line 42
    .line 43
    const-string p1, "Scopes are required"

    .line 44
    .line 45
    invoke-static {p2, p1}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iput-object p2, p0, Lio/sentry/a7;->f:Lio/sentry/c1;

    .line 49
    .line 50
    iput-object p4, p0, Lio/sentry/a7;->i:Lio/sentry/e7;

    .line 51
    .line 52
    iput-object p5, p0, Lio/sentry/a7;->j:Lio/sentry/c7;

    .line 53
    .line 54
    iget-object p1, p4, Lio/sentry/e7;->a:Lio/sentry/t4;

    .line 55
    .line 56
    if-eqz p1, :cond_0

    .line 57
    .line 58
    iput-object p1, p0, Lio/sentry/a7;->a:Lio/sentry/t4;

    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    invoke-virtual {p2}, Lio/sentry/g4;->l()Lio/sentry/m6;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lio/sentry/m6;->getDateProvider()Lio/sentry/u4;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-interface {p1}, Lio/sentry/u4;->a()Lio/sentry/t4;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lio/sentry/a7;->a:Lio/sentry/t4;

    .line 74
    .line 75
    return-void
.end method


# virtual methods
.method public final b()Lio/sentry/t6;
    .locals 3

    .line 1
    new-instance v0, Lio/sentry/t6;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 4
    .line 5
    iget-object v1, p0, Lio/sentry/b7;->a:Lio/sentry/protocol/w;

    .line 6
    .line 7
    iget-object v2, p0, Lio/sentry/b7;->b:Lio/sentry/d7;

    .line 8
    .line 9
    iget-object p0, p0, Lio/sentry/b7;->d:Lio/sentry/t3;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p0, p0, Lio/sentry/t3;->a:Ljava/io/Serializable;

    .line 16
    .line 17
    check-cast p0, Ljava/lang/Boolean;

    .line 18
    .line 19
    :goto_0
    invoke-direct {v0, v1, v2, p0}, Lio/sentry/t6;-><init>(Lio/sentry/protocol/w;Lio/sentry/d7;Ljava/lang/Boolean;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public final c(Ljava/lang/String;Lio/sentry/t4;Lio/sentry/r1;)Lio/sentry/k1;
    .locals 6

    .line 1
    new-instance v5, Lio/sentry/e7;

    .line 2
    .line 3
    invoke-direct {v5}, Lio/sentry/e7;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "activity.load"

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    move-object v2, p1

    .line 10
    move-object v3, p2

    .line 11
    move-object v4, p3

    .line 12
    invoke-virtual/range {v0 .. v5}, Lio/sentry/a7;->n(Ljava/lang/String;Ljava/lang/String;Lio/sentry/t4;Lio/sentry/r1;Lio/sentry/e7;)Lio/sentry/k1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final d()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lio/sentry/a7;->g:Z

    .line 2
    .line 3
    return p0
.end method

.method public final f(Lio/sentry/f7;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/a7;->f:Lio/sentry/c1;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/sentry/c1;->l()Lio/sentry/m6;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/sentry/m6;->getDateProvider()Lio/sentry/u4;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Lio/sentry/u4;->a()Lio/sentry/t4;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, p1, v0}, Lio/sentry/a7;->v(Lio/sentry/f7;Lio/sentry/t4;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/b7;->f:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method

.method public final getStatus()Lio/sentry/f7;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/b7;->i:Lio/sentry/f7;

    .line 4
    .line 5
    return-object p0
.end method

.method public final h(Ljava/io/IOException;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/a7;->e:Ljava/io/IOException;

    .line 2
    .line 3
    return-void
.end method

.method public final i()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 2
    .line 3
    iget-object v0, v0, Lio/sentry/b7;->i:Lio/sentry/f7;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lio/sentry/a7;->f(Lio/sentry/f7;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/a7;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0, p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final n(Ljava/lang/String;Ljava/lang/String;Lio/sentry/t4;Lio/sentry/r1;Lio/sentry/e7;)Lio/sentry/k1;
    .locals 10

    .line 1
    iget-boolean v0, p0, Lio/sentry/a7;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lio/sentry/d3;->a:Lio/sentry/d3;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object v0, p0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 9
    .line 10
    iget-object v4, v0, Lio/sentry/b7;->b:Lio/sentry/d7;

    .line 11
    .line 12
    iget-object p0, p0, Lio/sentry/a7;->d:Lio/sentry/x6;

    .line 13
    .line 14
    iget-object v0, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 15
    .line 16
    iget-object v0, v0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 17
    .line 18
    new-instance v1, Lio/sentry/b7;

    .line 19
    .line 20
    iget-object v2, v0, Lio/sentry/b7;->a:Lio/sentry/protocol/w;

    .line 21
    .line 22
    new-instance v3, Lio/sentry/d7;

    .line 23
    .line 24
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v7, v0, Lio/sentry/b7;->d:Lio/sentry/t3;

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    const-string v9, "manual"

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    move-object v5, p1

    .line 34
    invoke-direct/range {v1 .. v9}, Lio/sentry/b7;-><init>(Lio/sentry/protocol/w;Lio/sentry/d7;Lio/sentry/d7;Ljava/lang/String;Ljava/lang/String;Lio/sentry/t3;Lio/sentry/f7;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput-object p2, v1, Lio/sentry/b7;->f:Ljava/lang/String;

    .line 38
    .line 39
    iput-object p4, v1, Lio/sentry/b7;->W:Lio/sentry/r1;

    .line 40
    .line 41
    iput-object p3, p5, Lio/sentry/e7;->a:Lio/sentry/t4;

    .line 42
    .line 43
    invoke-virtual {p0, v1, p5}, Lio/sentry/x6;->z(Lio/sentry/b7;Lio/sentry/e7;)Lio/sentry/k1;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public final o(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 2
    .line 3
    iput-object p1, p0, Lio/sentry/b7;->f:Ljava/lang/String;

    .line 4
    .line 5
    return-void
.end method

.method public final p(Ljava/lang/String;)Lio/sentry/k1;
    .locals 10

    .line 1
    iget-boolean v0, p0, Lio/sentry/a7;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lio/sentry/d3;->a:Lio/sentry/d3;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object v0, p0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 9
    .line 10
    iget-object v4, v0, Lio/sentry/b7;->b:Lio/sentry/d7;

    .line 11
    .line 12
    iget-object p0, p0, Lio/sentry/a7;->d:Lio/sentry/x6;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v0, Lio/sentry/e7;

    .line 18
    .line 19
    invoke-direct {v0}, Lio/sentry/e7;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 23
    .line 24
    iget-object v1, v1, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 25
    .line 26
    move-object v2, v1

    .line 27
    new-instance v1, Lio/sentry/b7;

    .line 28
    .line 29
    move-object v3, v2

    .line 30
    iget-object v2, v3, Lio/sentry/b7;->a:Lio/sentry/protocol/w;

    .line 31
    .line 32
    move-object v5, v3

    .line 33
    new-instance v3, Lio/sentry/d7;

    .line 34
    .line 35
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    iget-object v7, v5, Lio/sentry/b7;->d:Lio/sentry/t3;

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    const-string v9, "manual"

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    move-object v5, p1

    .line 45
    invoke-direct/range {v1 .. v9}, Lio/sentry/b7;-><init>(Lio/sentry/protocol/w;Lio/sentry/d7;Lio/sentry/d7;Ljava/lang/String;Ljava/lang/String;Lio/sentry/t3;Lio/sentry/f7;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    iput-object p1, v1, Lio/sentry/b7;->f:Ljava/lang/String;

    .line 50
    .line 51
    sget-object p1, Lio/sentry/r1;->SENTRY:Lio/sentry/r1;

    .line 52
    .line 53
    iput-object p1, v1, Lio/sentry/b7;->W:Lio/sentry/r1;

    .line 54
    .line 55
    invoke-virtual {p0, v1, v0}, Lio/sentry/x6;->z(Lio/sentry/b7;Lio/sentry/e7;)Lio/sentry/k1;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method public final r(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/j2;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/sentry/a7;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lio/sentry/a7;->f:Lio/sentry/c1;

    .line 6
    .line 7
    invoke-interface {p0}, Lio/sentry/c1;->l()Lio/sentry/m6;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p2, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 16
    .line 17
    const-string p3, "The span is already finished. Measurement %s cannot be set"

    .line 18
    .line 19
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p0, p2, p3, p1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance v0, Lio/sentry/protocol/n;

    .line 28
    .line 29
    invoke-virtual {p3}, Lio/sentry/j2;->apiName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {v0, v1, p2}, Lio/sentry/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/Number;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lio/sentry/a7;->l:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lio/sentry/a7;->d:Lio/sentry/x6;

    .line 42
    .line 43
    iget-object v1, v0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 44
    .line 45
    if-eq v1, p0, :cond_1

    .line 46
    .line 47
    iget-object p0, v1, Lio/sentry/a7;->l:Ljava/util/concurrent/ConcurrentHashMap;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-nez p0, :cond_1

    .line 54
    .line 55
    invoke-virtual {v0, p1, p2, p3}, Lio/sentry/x6;->r(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/j2;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method public final s()Lio/sentry/b7;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 2
    .line 3
    return-object p0
.end method

.method public final t()Lio/sentry/t4;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/a7;->b:Lio/sentry/t4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final u(Ljava/lang/String;Ljava/lang/Number;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/sentry/a7;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lio/sentry/a7;->f:Lio/sentry/c1;

    .line 6
    .line 7
    invoke-interface {p0}, Lio/sentry/c1;->l()Lio/sentry/m6;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p2, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 16
    .line 17
    const-string v0, "The span is already finished. Measurement %s cannot be set"

    .line 18
    .line 19
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p0, p2, v0, p1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance v0, Lio/sentry/protocol/n;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, v1, p2}, Lio/sentry/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/Number;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lio/sentry/a7;->l:Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lio/sentry/a7;->d:Lio/sentry/x6;

    .line 39
    .line 40
    iget-object v1, v0, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 41
    .line 42
    if-eq v1, p0, :cond_1

    .line 43
    .line 44
    iget-object p0, v1, Lio/sentry/a7;->l:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-nez p0, :cond_1

    .line 51
    .line 52
    invoke-virtual {v0, p1, p2}, Lio/sentry/x6;->u(Ljava/lang/String;Ljava/lang/Number;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void
.end method

.method public final v(Lio/sentry/f7;Lio/sentry/t4;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lio/sentry/a7;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_e

    .line 4
    .line 5
    iget-object v0, p0, Lio/sentry/a7;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_3

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 18
    .line 19
    iput-object p1, v0, Lio/sentry/b7;->i:Lio/sentry/f7;

    .line 20
    .line 21
    iget-object p1, v0, Lio/sentry/b7;->b:Lio/sentry/d7;

    .line 22
    .line 23
    iget-object v0, p0, Lio/sentry/a7;->f:Lio/sentry/c1;

    .line 24
    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    invoke-interface {v0}, Lio/sentry/c1;->l()Lio/sentry/m6;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2}, Lio/sentry/m6;->getDateProvider()Lio/sentry/u4;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-interface {p2}, Lio/sentry/u4;->a()Lio/sentry/t4;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    :cond_1
    iput-object p2, p0, Lio/sentry/a7;->b:Lio/sentry/t4;

    .line 40
    .line 41
    iget-object p2, p0, Lio/sentry/a7;->i:Lio/sentry/e7;

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-boolean v1, p2, Lio/sentry/e7;->c:Z

    .line 47
    .line 48
    iget-object v3, p0, Lio/sentry/a7;->d:Lio/sentry/x6;

    .line 49
    .line 50
    if-eqz v1, :cond_b

    .line 51
    .line 52
    iget-object v1, v3, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 53
    .line 54
    iget-object v4, v3, Lio/sentry/x6;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 55
    .line 56
    iget-object v1, v1, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 57
    .line 58
    iget-object v1, v1, Lio/sentry/b7;->b:Lio/sentry/d7;

    .line 59
    .line 60
    invoke-virtual {v1, p1}, Lio/sentry/d7;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_4

    .line 81
    .line 82
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    check-cast v5, Lio/sentry/a7;

    .line 87
    .line 88
    iget-object v6, v5, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 89
    .line 90
    iget-object v6, v6, Lio/sentry/b7;->c:Lio/sentry/d7;

    .line 91
    .line 92
    if-eqz v6, :cond_3

    .line 93
    .line 94
    invoke-virtual {v6, p1}, Lio/sentry/d7;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-eqz v6, :cond_3

    .line 99
    .line 100
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    move-object v4, v1

    .line 105
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    const/4 v1, 0x0

    .line 110
    move-object v4, v1

    .line 111
    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    const-wide/16 v6, 0x0

    .line 116
    .line 117
    if-eqz v5, :cond_9

    .line 118
    .line 119
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    check-cast v5, Lio/sentry/a7;

    .line 124
    .line 125
    if-eqz v1, :cond_6

    .line 126
    .line 127
    iget-object v8, v5, Lio/sentry/a7;->a:Lio/sentry/t4;

    .line 128
    .line 129
    invoke-virtual {v8, v1}, Lio/sentry/t4;->b(Lio/sentry/t4;)J

    .line 130
    .line 131
    .line 132
    move-result-wide v8

    .line 133
    cmp-long v8, v8, v6

    .line 134
    .line 135
    if-gez v8, :cond_7

    .line 136
    .line 137
    :cond_6
    iget-object v1, v5, Lio/sentry/a7;->a:Lio/sentry/t4;

    .line 138
    .line 139
    :cond_7
    if-eqz v4, :cond_8

    .line 140
    .line 141
    iget-object v8, v5, Lio/sentry/a7;->b:Lio/sentry/t4;

    .line 142
    .line 143
    if-eqz v8, :cond_5

    .line 144
    .line 145
    invoke-virtual {v8, v4}, Lio/sentry/t4;->b(Lio/sentry/t4;)J

    .line 146
    .line 147
    .line 148
    move-result-wide v8

    .line 149
    cmp-long v6, v8, v6

    .line 150
    .line 151
    if-lez v6, :cond_5

    .line 152
    .line 153
    :cond_8
    iget-object v4, v5, Lio/sentry/a7;->b:Lio/sentry/t4;

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_9
    iget-boolean p1, p2, Lio/sentry/e7;->c:Z

    .line 157
    .line 158
    if-eqz p1, :cond_b

    .line 159
    .line 160
    if-eqz v4, :cond_b

    .line 161
    .line 162
    iget-object p1, p0, Lio/sentry/a7;->b:Lio/sentry/t4;

    .line 163
    .line 164
    if-eqz p1, :cond_a

    .line 165
    .line 166
    invoke-virtual {p1, v4}, Lio/sentry/t4;->b(Lio/sentry/t4;)J

    .line 167
    .line 168
    .line 169
    move-result-wide p1

    .line 170
    cmp-long p1, p1, v6

    .line 171
    .line 172
    if-lez p1, :cond_b

    .line 173
    .line 174
    :cond_a
    iget-object p1, p0, Lio/sentry/a7;->b:Lio/sentry/t4;

    .line 175
    .line 176
    if-eqz p1, :cond_b

    .line 177
    .line 178
    iput-object v4, p0, Lio/sentry/a7;->b:Lio/sentry/t4;

    .line 179
    .line 180
    :cond_b
    iget-object p1, p0, Lio/sentry/a7;->e:Ljava/io/IOException;

    .line 181
    .line 182
    if-eqz p1, :cond_c

    .line 183
    .line 184
    iget-object p2, v3, Lio/sentry/x6;->e:Ljava/lang/String;

    .line 185
    .line 186
    invoke-interface {v0, p1, p0, p2}, Lio/sentry/c1;->c(Ljava/lang/Throwable;Lio/sentry/a7;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    :cond_c
    iget-object p1, p0, Lio/sentry/a7;->j:Lio/sentry/c7;

    .line 190
    .line 191
    if-eqz p1, :cond_d

    .line 192
    .line 193
    invoke-interface {p1, p0}, Lio/sentry/c7;->b(Lio/sentry/a7;)V

    .line 194
    .line 195
    .line 196
    :cond_d
    iput-boolean v2, p0, Lio/sentry/a7;->g:Z

    .line 197
    .line 198
    :cond_e
    :goto_3
    return-void
.end method

.method public final w()Lio/sentry/t4;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/a7;->a:Lio/sentry/t4;

    .line 2
    .line 3
    return-object p0
.end method

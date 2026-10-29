.class public final Lgk2;
.super Lck2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lqi1;

.field public final c:Landroid/os/Handler;

.field public final d:Ly92;

.field public final e:Lnt0;

.field public f:Lqr;

.field public g:Lgr0;

.field public h:Lxm;

.field public i:Lum;

.field public j:Lyo0;

.field public k:Ljava/util/List;

.field public l:Z

.field public m:Z

.field public n:Z

.field public final o:Lnt0;

.field public final p:Ljava/lang/Object;

.field public q:Ljava/util/ArrayList;

.field public r:Lf81;

.field public final s:Lwl0;

.field public final t:Ld52;

.field public final u:Lzr3;

.field public final v:Lnb2;

.field public final w:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ler0;Ler0;Lqi1;Ly92;Lnt0;Landroid/os/Handler;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lgk2;->a:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lgk2;->k:Ljava/util/List;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lgk2;->l:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lgk2;->m:Z

    .line 18
    .line 19
    iput-boolean v0, p0, Lgk2;->n:Z

    .line 20
    .line 21
    iput-object p3, p0, Lgk2;->b:Lqi1;

    .line 22
    .line 23
    iput-object p6, p0, Lgk2;->c:Landroid/os/Handler;

    .line 24
    .line 25
    iput-object p4, p0, Lgk2;->d:Ly92;

    .line 26
    .line 27
    iput-object p5, p0, Lgk2;->e:Lnt0;

    .line 28
    .line 29
    new-instance p3, Ljava/lang/Object;

    .line 30
    .line 31
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p3, p0, Lgk2;->p:Ljava/lang/Object;

    .line 35
    .line 36
    new-instance p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 37
    .line 38
    invoke-direct {p3, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 39
    .line 40
    .line 41
    iput-object p3, p0, Lgk2;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 42
    .line 43
    new-instance p3, Lwl0;

    .line 44
    .line 45
    invoke-direct {p3, p1, p2}, Lwl0;-><init>(Ler0;Ler0;)V

    .line 46
    .line 47
    .line 48
    iput-object p3, p0, Lgk2;->s:Lwl0;

    .line 49
    .line 50
    new-instance p3, Lzr3;

    .line 51
    .line 52
    const-class p4, Landroidx/camera/camera2/internal/compat/quirk/CaptureSessionStuckQuirk;

    .line 53
    .line 54
    invoke-virtual {p1, p4}, Ler0;->d(Ljava/lang/Class;)Z

    .line 55
    .line 56
    .line 57
    move-result p4

    .line 58
    if-nez p4, :cond_0

    .line 59
    .line 60
    const-class p4, Landroidx/camera/camera2/internal/compat/quirk/IncorrectCaptureStateQuirk;

    .line 61
    .line 62
    invoke-virtual {p1, p4}, Ler0;->d(Ljava/lang/Class;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_1

    .line 67
    .line 68
    :cond_0
    const/4 v0, 0x1

    .line 69
    :cond_1
    invoke-direct {p3, v0}, Lzr3;-><init>(Z)V

    .line 70
    .line 71
    .line 72
    iput-object p3, p0, Lgk2;->u:Lzr3;

    .line 73
    .line 74
    new-instance p1, Ld52;

    .line 75
    .line 76
    const/16 p3, 0x1b

    .line 77
    .line 78
    invoke-direct {p1, p2, p3}, Ld52;-><init>(Ler0;I)V

    .line 79
    .line 80
    .line 81
    iput-object p1, p0, Lgk2;->t:Ld52;

    .line 82
    .line 83
    new-instance p1, Lnb2;

    .line 84
    .line 85
    invoke-direct {p1, p2}, Lnb2;-><init>(Ler0;)V

    .line 86
    .line 87
    .line 88
    iput-object p1, p0, Lgk2;->v:Lnb2;

    .line 89
    .line 90
    iput-object p5, p0, Lgk2;->o:Lnt0;

    .line 91
    .line 92
    return-void
.end method

.method public static l()V
    .locals 1

    .line 1
    const-string v0, "SyncCaptureSessionImpl"

    .line 2
    .line 3
    invoke-static {v0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lgk2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lgk2;->f:Lqr;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lgk2;->f:Lqr;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lqr;->a(Lgk2;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b(Lgk2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lgk2;->f:Lqr;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lgk2;->f:Lqr;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lqr;->b(Lgk2;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final c(Lgk2;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lgk2;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lgk2;->s:Lwl0;

    .line 5
    .line 6
    iget-object v2, p0, Lgk2;->q:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v1, v2}, Lwl0;->a(Ljava/util/ArrayList;)V

    .line 9
    .line 10
    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 12
    invoke-static {}, Lgk2;->l()V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lgk2;->a:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v1

    .line 18
    :try_start_1
    iget-boolean v0, p0, Lgk2;->l:Z

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Lgk2;->l:Z

    .line 25
    .line 26
    iget-object v0, p0, Lgk2;->h:Lxm;

    .line 27
    .line 28
    const-string v3, "Need to call openCaptureSession before using this API."

    .line 29
    .line 30
    invoke-static {v0, v3}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lgk2;->h:Lxm;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_4

    .line 38
    :cond_0
    move-object v0, v2

    .line 39
    :goto_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    iget-object v3, p0, Lgk2;->a:Ljava/lang/Object;

    .line 41
    .line 42
    monitor-enter v3

    .line 43
    :try_start_2
    iget-object v1, p0, Lgk2;->k:Ljava/util/List;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_1

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, Ld70;

    .line 62
    .line 63
    invoke-virtual {v4}, Ld70;->b()V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    iput-object v2, p0, Lgk2;->k:Ljava/util/List;

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :catchall_1
    move-exception p0

    .line 71
    goto :goto_3

    .line 72
    :cond_2
    :goto_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 73
    iget-object v1, p0, Lgk2;->u:Lzr3;

    .line 74
    .line 75
    invoke-virtual {v1}, Lzr3;->w()V

    .line 76
    .line 77
    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    new-instance v1, Ldk2;

    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    invoke-direct {v1, p0, p1, v2}, Ldk2;-><init>(Lgk2;Lgk2;I)V

    .line 84
    .line 85
    .line 86
    invoke-static {}, Lpg3;->g()Lo80;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    iget-object p1, v0, Lxm;->b:Lwm;

    .line 91
    .line 92
    invoke-virtual {p1, v1, p0}, Ll0;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    return-void

    .line 96
    :goto_3
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 97
    throw p0

    .line 98
    :goto_4
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 99
    throw p0

    .line 100
    :catchall_2
    move-exception p0

    .line 101
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 102
    throw p0
.end method

.method public final d(Lgk2;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lgk2;->f:Lqr;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lgk2;->a:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lgk2;->k:Ljava/util/List;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Ld70;

    .line 29
    .line 30
    invoke-virtual {v3}, Ld70;->b()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iput-object v2, p0, Lgk2;->k:Ljava/util/List;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    goto :goto_7

    .line 39
    :cond_1
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    iget-object v0, p0, Lgk2;->u:Lzr3;

    .line 41
    .line 42
    invoke-virtual {v0}, Lzr3;->w()V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lgk2;->b:Lqi1;

    .line 46
    .line 47
    invoke-virtual {v0}, Lqi1;->g()Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_5

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Lgk2;

    .line 66
    .line 67
    if-ne v3, p0, :cond_2

    .line 68
    .line 69
    goto :goto_6

    .line 70
    :cond_2
    iget-object v4, v3, Lgk2;->a:Ljava/lang/Object;

    .line 71
    .line 72
    monitor-enter v4

    .line 73
    :try_start_1
    iget-object v5, v3, Lgk2;->k:Ljava/util/List;

    .line 74
    .line 75
    if-eqz v5, :cond_4

    .line 76
    .line 77
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_3

    .line 86
    .line 87
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    check-cast v6, Ld70;

    .line 92
    .line 93
    invoke-virtual {v6}, Ld70;->b()V

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_3
    iput-object v2, v3, Lgk2;->k:Ljava/util/List;

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :catchall_1
    move-exception p0

    .line 101
    goto :goto_5

    .line 102
    :cond_4
    :goto_4
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 103
    iget-object v3, v3, Lgk2;->u:Lzr3;

    .line 104
    .line 105
    invoke-virtual {v3}, Lzr3;->w()V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :goto_5
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 110
    throw p0

    .line 111
    :cond_5
    :goto_6
    iget-object v1, v0, Lqi1;->b:Ljava/lang/Object;

    .line 112
    .line 113
    monitor-enter v1

    .line 114
    :try_start_3
    iget-object v0, v0, Lqi1;->e:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 117
    .line 118
    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 122
    iget-object p0, p0, Lgk2;->f:Lqr;

    .line 123
    .line 124
    invoke-virtual {p0, p1}, Lqr;->d(Lgk2;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :catchall_2
    move-exception p0

    .line 129
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 130
    throw p0

    .line 131
    :goto_7
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 132
    throw p0
.end method

.method public final e(Lgk2;)V
    .locals 7

    .line 1
    invoke-static {}, Lgk2;->l()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lgk2;->t:Ld52;

    .line 5
    .line 6
    iget-object v1, p0, Lgk2;->b:Lqi1;

    .line 7
    .line 8
    iget-object v2, v1, Lqi1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v2

    .line 11
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v1, v1, Lqi1;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 21
    iget-object v1, p0, Lgk2;->b:Lqi1;

    .line 22
    .line 23
    invoke-virtual {v1}, Lqi1;->e()Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v2, v0, Ld52;->a:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Landroidx/camera/camera2/internal/compat/quirk/CaptureSessionOnClosedNotCalledQuirk;

    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, Lgk2;

    .line 53
    .line 54
    if-ne v4, p1, :cond_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_2

    .line 70
    .line 71
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Lgk2;

    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v3}, Lgk2;->d(Lgk2;)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    iget-object v2, p0, Lgk2;->f:Lqr;

    .line 85
    .line 86
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    iget-object v2, p0, Lgk2;->b:Lqi1;

    .line 90
    .line 91
    iget-object v3, v2, Lqi1;->b:Ljava/lang/Object;

    .line 92
    .line 93
    monitor-enter v3

    .line 94
    :try_start_1
    iget-object v4, v2, Lqi1;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v4, Ljava/util/LinkedHashSet;

    .line 97
    .line 98
    invoke-interface {v4, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    iget-object v4, v2, Lqi1;->e:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v4, Ljava/util/LinkedHashSet;

    .line 104
    .line 105
    invoke-interface {v4, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 109
    invoke-virtual {v2}, Lqi1;->g()Ljava/util/ArrayList;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_6

    .line 122
    .line 123
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    check-cast v3, Lgk2;

    .line 128
    .line 129
    if-ne v3, p0, :cond_3

    .line 130
    .line 131
    goto :goto_7

    .line 132
    :cond_3
    iget-object v4, v3, Lgk2;->a:Ljava/lang/Object;

    .line 133
    .line 134
    monitor-enter v4

    .line 135
    :try_start_2
    iget-object v5, v3, Lgk2;->k:Ljava/util/List;

    .line 136
    .line 137
    if-eqz v5, :cond_5

    .line 138
    .line 139
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    if-eqz v6, :cond_4

    .line 148
    .line 149
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    check-cast v6, Ld70;

    .line 154
    .line 155
    invoke-virtual {v6}, Ld70;->b()V

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_4
    const/4 v5, 0x0

    .line 160
    iput-object v5, v3, Lgk2;->k:Ljava/util/List;

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :catchall_0
    move-exception p0

    .line 164
    goto :goto_6

    .line 165
    :cond_5
    :goto_5
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 166
    iget-object v3, v3, Lgk2;->u:Lzr3;

    .line 167
    .line 168
    invoke-virtual {v3}, Lzr3;->w()V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :goto_6
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 173
    throw p0

    .line 174
    :cond_6
    :goto_7
    iget-object p0, p0, Lgk2;->f:Lqr;

    .line 175
    .line 176
    invoke-virtual {p0, p1}, Lqr;->e(Lgk2;)V

    .line 177
    .line 178
    .line 179
    iget-object p0, v0, Ld52;->a:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast p0, Landroidx/camera/camera2/internal/compat/quirk/CaptureSessionOnClosedNotCalledQuirk;

    .line 182
    .line 183
    if-eqz p0, :cond_9

    .line 184
    .line 185
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 186
    .line 187
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-eqz v1, :cond_8

    .line 199
    .line 200
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    check-cast v1, Lgk2;

    .line 205
    .line 206
    if-ne v1, p1, :cond_7

    .line 207
    .line 208
    goto :goto_9

    .line 209
    :cond_7
    invoke-interface {p0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    goto :goto_8

    .line 213
    :cond_8
    :goto_9
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    :goto_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    if-eqz p1, :cond_9

    .line 222
    .line 223
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    check-cast p1, Lgk2;

    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, p1}, Lgk2;->c(Lgk2;)V

    .line 233
    .line 234
    .line 235
    goto :goto_a

    .line 236
    :cond_9
    return-void

    .line 237
    :catchall_1
    move-exception p0

    .line 238
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 239
    throw p0

    .line 240
    :catchall_2
    move-exception p0

    .line 241
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 242
    throw p0
.end method

.method public final f(Lgk2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lgk2;->f:Lqr;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lgk2;->f:Lqr;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lqr;->f(Lgk2;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final g(Lgk2;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lgk2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lgk2;->n:Z

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iput-boolean v2, p0, Lgk2;->n:Z

    .line 10
    .line 11
    iget-object v1, p0, Lgk2;->h:Lxm;

    .line 12
    .line 13
    const-string v3, "Need to call openCaptureSession before using this API."

    .line 14
    .line 15
    invoke-static {v1, v3}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lgk2;->h:Lxm;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    new-instance v0, Ldk2;

    .line 28
    .line 29
    invoke-direct {v0, p0, p1, v2}, Ldk2;-><init>(Lgk2;Lgk2;I)V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lpg3;->g()Lo80;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    iget-object p1, v1, Lxm;->b:Lwm;

    .line 37
    .line 38
    invoke-virtual {p1, v0, p0}, Ll0;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void

    .line 42
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    throw p0
.end method

.method public final h(Lgk2;Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lgk2;->f:Lqr;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lgk2;->f:Lqr;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lqr;->h(Lgk2;Landroid/view/Surface;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final i(Ljava/util/ArrayList;Lhn;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lgk2;->u:Lzr3;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lzr3;->b(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget-object v0, p0, Lgk2;->g:Lgr0;

    .line 8
    .line 9
    const-string v1, "Need to call openCaptureSession before using this API."

    .line 10
    .line 11
    invoke-static {v0, v1}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lgk2;->g:Lgr0;

    .line 15
    .line 16
    iget-object v0, v0, Lgr0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lcb;

    .line 19
    .line 20
    iget-object p0, p0, Lgk2;->d:Ly92;

    .line 21
    .line 22
    invoke-virtual {v0, p1, p0, p2}, Lcb;->m(Ljava/util/ArrayList;Ly92;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0
.end method

.method public final j()V
    .locals 3

    .line 1
    iget-object v0, p0, Lgk2;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lgk2;->l()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lgk2;->v:Lnb2;

    .line 16
    .line 17
    iget-boolean v0, v0, Lnb2;->a:Z

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :try_start_0
    invoke-static {}, Lgk2;->l()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lgk2;->g:Lgr0;

    .line 25
    .line 26
    const-string v1, "Need to call openCaptureSession before using this API."

    .line 27
    .line 28
    invoke-static {v0, v1}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lgk2;->g:Lgr0;

    .line 32
    .line 33
    iget-object v0, v0, Lgr0;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lcb;

    .line 36
    .line 37
    iget-object v0, v0, Lcb;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Landroid/hardware/camera2/CameraCaptureSession;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->abortCaptures()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lgk2;->l()V

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_0
    invoke-static {}, Lgk2;->l()V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lgk2;->u:Lzr3;

    .line 56
    .line 57
    invoke-virtual {v0}, Lzr3;->f()Ls81;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v1, Lek2;

    .line 62
    .line 63
    invoke-direct {v1, p0, v2}, Lek2;-><init>(Lgk2;I)V

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, Lgk2;->d:Ly92;

    .line 67
    .line 68
    invoke-interface {v0, v1, p0}, Ls81;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final k(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lgk2;->g:Lgr0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lgr0;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v2, 0x1c

    .line 13
    .line 14
    if-lt v1, v2, :cond_0

    .line 15
    .line 16
    new-instance v1, Lbp;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v1, p1, v2}, Lcb;-><init>(Landroid/hardware/camera2/CameraCaptureSession;Lcp;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, v0, Lgr0;->a:Ljava/lang/Object;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v1, Lcb;

    .line 26
    .line 27
    new-instance v2, Lcp;

    .line 28
    .line 29
    iget-object v3, p0, Lgk2;->c:Landroid/os/Handler;

    .line 30
    .line 31
    invoke-direct {v2, v3}, Lcp;-><init>(Landroid/os/Handler;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v1, p1, v2}, Lcb;-><init>(Landroid/hardware/camera2/CameraCaptureSession;Lcp;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, v0, Lgr0;->a:Ljava/lang/Object;

    .line 38
    .line 39
    :goto_0
    iput-object v0, p0, Lgk2;->g:Lgr0;

    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final m()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lgk2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Lgk2;->h:Lxm;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    monitor-exit v0

    .line 12
    return p0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw p0
.end method

.method public final n(Landroid/hardware/camera2/CameraDevice;Lkb2;Ljava/util/List;)Ls81;
    .locals 8

    .line 1
    iget-object v0, p0, Lgk2;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lgk2;->b:Lqi1;

    .line 5
    .line 6
    invoke-virtual {v1}, Lqi1;->e()Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lgk2;

    .line 30
    .line 31
    iget-object v4, v3, Lgk2;->o:Lnt0;

    .line 32
    .line 33
    iget-object v3, v3, Lgk2;->u:Lzr3;

    .line 34
    .line 35
    invoke-virtual {v3}, Lzr3;->f()Ls81;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    new-instance v5, Lbp0;

    .line 40
    .line 41
    const-wide/16 v6, 0x5dc

    .line 42
    .line 43
    invoke-direct {v5, v3, v6, v7, v4}, Lbp0;-><init>(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v5}, Lpy0;->Y(Lvm;)Lxm;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    new-instance v1, Lf81;

    .line 57
    .line 58
    new-instance v3, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lpg3;->g()Lo80;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-direct {v1, v3, v4, v2}, Lf81;-><init>(Ljava/util/ArrayList;ZLo80;)V

    .line 69
    .line 70
    .line 71
    iput-object v1, p0, Lgk2;->r:Lf81;

    .line 72
    .line 73
    invoke-static {v1}, Lyo0;->b(Ls81;)Lyo0;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    new-instance v2, Lfk2;

    .line 78
    .line 79
    invoke-direct {v2, p0, p1, p2, p3}, Lfk2;-><init>(Lgk2;Landroid/hardware/camera2/CameraDevice;Lkb2;Ljava/util/List;)V

    .line 80
    .line 81
    .line 82
    iget-object p0, p0, Lgk2;->d:Ly92;

    .line 83
    .line 84
    invoke-static {v1, v2, p0}, Lw11;->I(Ls81;Lud;Ljava/util/concurrent/Executor;)Lls;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, Lw11;->w(Ls81;)Ls81;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    monitor-exit v0

    .line 93
    return-object p0

    .line 94
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    throw p0
.end method

.method public final o(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lgk2;->u:Lzr3;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lzr3;->b(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget-object v0, p0, Lgk2;->g:Lgr0;

    .line 8
    .line 9
    const-string v1, "Need to call openCaptureSession before using this API."

    .line 10
    .line 11
    invoke-static {v0, v1}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lgk2;->g:Lgr0;

    .line 15
    .line 16
    iget-object v0, v0, Lgr0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lcb;

    .line 19
    .line 20
    iget-object p0, p0, Lgk2;->d:Ly92;

    .line 21
    .line 22
    invoke-virtual {v0, p1, p0, p2}, Lcb;->J(Landroid/hardware/camera2/CaptureRequest;Ly92;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0
.end method

.method public final p(Ljava/util/ArrayList;)Ls81;
    .locals 4

    .line 1
    iget-object v0, p0, Lgk2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lgk2;->m:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 9
    .line 10
    const-string p1, "Opener is disabled"

    .line 11
    .line 12
    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Ltw0;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {p1, p0, v1}, Ltw0;-><init>(Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-object p1

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v1, p0, Lgk2;->d:Ly92;

    .line 26
    .line 27
    iget-object v2, p0, Lgk2;->e:Lnt0;

    .line 28
    .line 29
    invoke-static {p1, v1, v2}, Lqj3;->L(Ljava/util/ArrayList;Ly92;Lnt0;)Lxm;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1}, Lyo0;->b(Ls81;)Lyo0;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-instance v2, Lx6;

    .line 38
    .line 39
    const/16 v3, 0xf

    .line 40
    .line 41
    invoke-direct {v2, v3, p0, p1}, Lx6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lgk2;->d:Ly92;

    .line 45
    .line 46
    invoke-static {v1, v2, p1}, Lw11;->I(Ls81;Lud;Ljava/util/concurrent/Executor;)Lls;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lgk2;->j:Lyo0;

    .line 51
    .line 52
    invoke-static {p1}, Lw11;->w(Ls81;)Ls81;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    monitor-exit v0

    .line 57
    return-object p0

    .line 58
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    throw p0
.end method

.method public final q()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lgk2;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lgk2;->m()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lgk2;->s:Lwl0;

    .line 12
    .line 13
    iget-object v3, p0, Lgk2;->q:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v1, v3}, Lwl0;->a(Ljava/util/ArrayList;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_3

    .line 21
    :cond_0
    iget-object v1, p0, Lgk2;->r:Lf81;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lf81;->cancel(Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 29
    :try_start_1
    iget-object v3, p0, Lgk2;->a:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 32
    :try_start_2
    iget-boolean v4, p0, Lgk2;->m:Z

    .line 33
    .line 34
    if-nez v4, :cond_3

    .line 35
    .line 36
    iget-object v4, p0, Lgk2;->j:Lyo0;

    .line 37
    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    move-object v1, v4

    .line 41
    :cond_2
    iput-boolean v2, p0, Lgk2;->m:Z

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catchall_1
    move-exception p0

    .line 45
    goto :goto_2

    .line 46
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lgk2;->m()Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    xor-int/2addr p0, v2

    .line 51
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    :try_start_3
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 55
    .line 56
    .line 57
    :cond_4
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 58
    return p0

    .line 59
    :goto_2
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 60
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 61
    :catchall_2
    move-exception p0

    .line 62
    if-eqz v1, :cond_5

    .line 63
    .line 64
    :try_start_6
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 65
    .line 66
    .line 67
    :cond_5
    throw p0

    .line 68
    :goto_3
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 69
    throw p0
.end method

.method public final r()Lgr0;
    .locals 1

    .line 1
    iget-object v0, p0, Lgk2;->g:Lgr0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lgk2;->g:Lgr0;

    .line 7
    .line 8
    return-object p0
.end method

.class public final Llj2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:I

.field public final b:Landroid/graphics/Matrix;

.field public final c:Z

.field public final d:Landroid/graphics/Rect;

.field public final e:Z

.field public final f:I

.field public final g:Lpg;

.field public h:I

.field public i:I

.field public j:Z

.field public k:Lrj2;

.field public l:Lkj2;

.field public final m:Ljava/util/HashSet;

.field public n:Z

.field public final o:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(IILpg;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Llj2;->j:Z

    .line 6
    .line 7
    new-instance v1, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Llj2;->m:Ljava/util/HashSet;

    .line 13
    .line 14
    iput-boolean v0, p0, Llj2;->n:Z

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Llj2;->o:Ljava/util/ArrayList;

    .line 22
    .line 23
    iput p1, p0, Llj2;->f:I

    .line 24
    .line 25
    iput p2, p0, Llj2;->a:I

    .line 26
    .line 27
    iput-object p3, p0, Llj2;->g:Lpg;

    .line 28
    .line 29
    iput-object p4, p0, Llj2;->b:Landroid/graphics/Matrix;

    .line 30
    .line 31
    iput-boolean p5, p0, Llj2;->c:Z

    .line 32
    .line 33
    iput-object p6, p0, Llj2;->d:Landroid/graphics/Rect;

    .line 34
    .line 35
    iput p7, p0, Llj2;->i:I

    .line 36
    .line 37
    iput p8, p0, Llj2;->h:I

    .line 38
    .line 39
    iput-boolean p9, p0, Llj2;->e:Z

    .line 40
    .line 41
    new-instance p1, Lkj2;

    .line 42
    .line 43
    iget-object p3, p3, Lpg;->a:Landroid/util/Size;

    .line 44
    .line 45
    invoke-direct {p1, p3, p2}, Lkj2;-><init>(Landroid/util/Size;I)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Llj2;->l:Lkj2;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-boolean p0, p0, Llj2;->n:Z

    .line 2
    .line 3
    xor-int/lit8 p0, p0, 0x1

    .line 4
    .line 5
    const-string v0, "Edge is already closed."

    .line 6
    .line 7
    invoke-static {v0, p0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    invoke-static {}, Lpg3;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Llj2;->l:Lkj2;

    .line 5
    .line 6
    invoke-virtual {v0}, Lkj2;->a()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Llj2;->n:Z

    .line 11
    .line 12
    return-void
.end method

.method public final c(Z)Lrj2;
    .locals 5

    .line 1
    invoke-static {}, Lpg3;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Llj2;->a()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lrj2;

    .line 8
    .line 9
    iget-object v1, p0, Llj2;->g:Lpg;

    .line 10
    .line 11
    iget-object v2, v1, Lpg;->a:Landroid/util/Size;

    .line 12
    .line 13
    iget-object v1, v1, Lpg;->b:Lmb0;

    .line 14
    .line 15
    new-instance v3, Lfj2;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-direct {v3, p0, v4}, Lfj2;-><init>(Llj2;I)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v2, p1, v1, v3}, Lrj2;-><init>(Landroid/util/Size;ZLmb0;Lfj2;)V

    .line 22
    .line 23
    .line 24
    :try_start_0
    iget-object p1, v0, Lrj2;->j:Luw0;

    .line 25
    .line 26
    iget-object v1, p0, Llj2;->l:Lkj2;

    .line 27
    .line 28
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    new-instance v2, Lgj2;

    .line 32
    .line 33
    invoke-direct {v2, v1, v4}, Lgj2;-><init>(Lkj2;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p1, v2}, Lkj2;->g(Ld70;Ljava/lang/Runnable;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    iget-object v1, v1, Ld70;->e:Lxm;

    .line 43
    .line 44
    invoke-static {v1}, Lw11;->w(Ls81;)Ls81;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    new-instance v2, Lhj2;

    .line 49
    .line 50
    invoke-direct {v2, p1, v4}, Lhj2;-><init>(Ld70;I)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lpg3;->g()Lo80;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-interface {v1, v2, p1}, Ls81;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_0
    .catch Lc70; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catch_0
    move-exception p0

    .line 62
    goto :goto_1

    .line 63
    :cond_0
    :goto_0
    iput-object v0, p0, Llj2;->k:Lrj2;

    .line 64
    .line 65
    invoke-virtual {p0}, Llj2;->e()V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :goto_1
    invoke-virtual {v0}, Lrj2;->b()V

    .line 70
    .line 71
    .line 72
    throw p0

    .line 73
    :catch_1
    move-exception p0

    .line 74
    new-instance p1, Ljava/lang/AssertionError;

    .line 75
    .line 76
    const-string v0, "Surface is somehow already closed"

    .line 77
    .line 78
    invoke-direct {p1, v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw p1
.end method

.method public final d()V
    .locals 3

    .line 1
    invoke-static {}, Lpg3;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Llj2;->a()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Llj2;->l:Lkj2;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lpg3;->a()V

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, Lkj2;->q:Ld70;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    iget-object v1, v0, Ld70;->a:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v1

    .line 22
    :try_start_0
    iget-boolean v0, v0, Ld70;->c:Z

    .line 23
    .line 24
    monitor-exit v1

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw p0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Llj2;->j:Z

    .line 33
    .line 34
    iget-object v0, p0, Llj2;->l:Lkj2;

    .line 35
    .line 36
    invoke-virtual {v0}, Lkj2;->a()V

    .line 37
    .line 38
    .line 39
    new-instance v0, Lkj2;

    .line 40
    .line 41
    iget-object v1, p0, Llj2;->g:Lpg;

    .line 42
    .line 43
    iget-object v1, v1, Lpg;->a:Landroid/util/Size;

    .line 44
    .line 45
    iget v2, p0, Llj2;->a:I

    .line 46
    .line 47
    invoke-direct {v0, v1, v2}, Lkj2;-><init>(Landroid/util/Size;I)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Llj2;->l:Lkj2;

    .line 51
    .line 52
    iget-object p0, p0, Llj2;->m:Ljava/util/HashSet;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Ljava/lang/Runnable;

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    :goto_1
    return-void
.end method

.method public final e()V
    .locals 7

    .line 1
    invoke-static {}, Lpg3;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Llj2;->d:Landroid/graphics/Rect;

    .line 5
    .line 6
    iget v2, p0, Llj2;->i:I

    .line 7
    .line 8
    iget v3, p0, Llj2;->h:I

    .line 9
    .line 10
    iget-boolean v4, p0, Llj2;->c:Z

    .line 11
    .line 12
    iget-object v5, p0, Llj2;->b:Landroid/graphics/Matrix;

    .line 13
    .line 14
    iget-boolean v6, p0, Llj2;->e:Z

    .line 15
    .line 16
    new-instance v0, Lvg;

    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, Lvg;-><init>(Landroid/graphics/Rect;IIZLandroid/graphics/Matrix;Z)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Llj2;->k:Lrj2;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v2, v1, Lrj2;->a:Ljava/lang/Object;

    .line 26
    .line 27
    monitor-enter v2

    .line 28
    :try_start_0
    iput-object v0, v1, Lrj2;->k:Lvg;

    .line 29
    .line 30
    iget-object v3, v1, Lrj2;->l:Lpn;

    .line 31
    .line 32
    iget-object v1, v1, Lrj2;->m:Lnt0;

    .line 33
    .line 34
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    new-instance v2, Lnj2;

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-direct {v2, v3, v0, v4}, Lnj2;-><init>(Lpn;Lvg;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Lnt0;->execute(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    move-object p0, v0

    .line 51
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    throw p0

    .line 53
    :cond_0
    :goto_0
    iget-object p0, p0, Llj2;->o:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Lc00;

    .line 70
    .line 71
    invoke-interface {v1, v0}, Lc00;->accept(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    return-void
.end method

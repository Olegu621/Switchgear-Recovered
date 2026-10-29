.class public final Lah3;
.super Lw8;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lah3;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final buildClient(Landroid/content/Context;Landroid/os/Looper;Lwv;Ljava/lang/Object;Lrr0;Lsr0;)Ld9;
    .locals 7

    .line 1
    check-cast p4, Lin3;

    .line 2
    .line 3
    if-nez p4, :cond_0

    .line 4
    .line 5
    new-instance p0, Lml3;

    .line 6
    .line 7
    invoke-direct {p0}, Lml3;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lml3;->a()Lin3;

    .line 11
    .line 12
    .line 13
    move-result-object p4

    .line 14
    :cond_0
    move-object v4, p4

    .line 15
    new-instance v0, Lnd3;

    .line 16
    .line 17
    sget-object p0, Ltd3;->b:Ltd3;

    .line 18
    .line 19
    move-object v1, p1

    .line 20
    move-object v2, p2

    .line 21
    move-object v3, p3

    .line 22
    move-object v5, p5

    .line 23
    move-object v6, p6

    .line 24
    invoke-direct/range {v0 .. v6}, Lnd3;-><init>(Landroid/content/Context;Landroid/os/Looper;Lwv;Lin3;Lrr0;Lsr0;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, v4, Lin3;->e:Lnl3;

    .line 28
    .line 29
    iget-boolean p0, p0, Lnl3;->a:Z

    .line 30
    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    sget-object p0, Lbh3;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Landroid/app/Application;

    .line 40
    .line 41
    invoke-static {p0}, Lbh3;->b(Landroid/app/Application;)Lbh3;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iget-object p1, v0, Lnd3;->d:Lsd3;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lbh3;->c:Ljava/lang/Object;

    .line 54
    .line 55
    monitor-enter p2

    .line 56
    :try_start_0
    iget-object p3, p0, Lbh3;->d:Ljava/util/Set;

    .line 57
    .line 58
    invoke-interface {p3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    if-ne p2, p3, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0}, Lbh3;->a()Landroid/app/Activity;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-nez p0, :cond_1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    invoke-virtual {p1, p0}, Lsd3;->a(Landroid/app/Activity;)V

    .line 80
    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_2
    sget-object p2, Lcom/google/android/gms/tasks/TaskExecutors;->MAIN_THREAD:Ljava/util/concurrent/Executor;

    .line 84
    .line 85
    new-instance p3, Ldp0;

    .line 86
    .line 87
    const/16 p4, 0x19

    .line 88
    .line 89
    invoke-direct {p3, p4, p0, p1}, Ldp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p2, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    move-object p0, v0

    .line 98
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    throw p0

    .line 100
    :cond_3
    :goto_0
    return-object v0
.end method

.method public final synthetic getImpliedScopes(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    iget p0, p0, Lah3;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lin3;

    .line 7
    .line 8
    sget-object p0, Lfq0;->c:Lcom/google/android/gms/common/api/Scope;

    .line 9
    .line 10
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    check-cast p1, Lin3;

    .line 16
    .line 17
    sget-object p0, Lfq0;->a:Lcom/google/android/gms/common/api/Scope;

    .line 18
    .line 19
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getPriority()I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

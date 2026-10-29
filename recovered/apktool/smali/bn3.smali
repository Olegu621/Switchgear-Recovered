.class public final Lbn3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzga;

.field public final synthetic c:Lmn3;


# direct methods
.method public synthetic constructor <init>(Lmn3;Lcom/google/android/gms/measurement/internal/zzga;I)V
    .locals 0

    .line 1
    iput p3, p0, Lbn3;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lbn3;->b:Lcom/google/android/gms/measurement/internal/zzga;

    .line 4
    .line 5
    iput-object p1, p0, Lbn3;->c:Lmn3;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lbn3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lbn3;->c:Lmn3;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iput-boolean v1, v0, Lmn3;->a:Z

    .line 11
    .line 12
    iget-object v1, v0, Lmn3;->c:Lpn3;

    .line 13
    .line 14
    invoke-virtual {v1}, Lpn3;->Q()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    iget-object v2, v1, Lsq3;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Lij3;

    .line 23
    .line 24
    iget-object v2, v2, Lij3;->f:Luh3;

    .line 25
    .line 26
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, v2, Luh3;->X:Lsh3;

    .line 30
    .line 31
    const-string v3, "Connected to remote service"

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lbn3;->b:Lcom/google/android/gms/measurement/internal/zzga;

    .line 37
    .line 38
    invoke-virtual {v1}, Leg3;->y()V

    .line 39
    .line 40
    .line 41
    invoke-static {v2}, Lkb1;->n(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-object v2, v1, Lpn3;->d:Lcom/google/android/gms/measurement/internal/zzga;

    .line 45
    .line 46
    invoke-virtual {v1}, Lpn3;->M()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Lpn3;->O()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p0

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    iget-object p0, p0, Lbn3;->c:Lmn3;

    .line 57
    .line 58
    iget-object p0, p0, Lmn3;->c:Lpn3;

    .line 59
    .line 60
    iget-object v0, p0, Lpn3;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    iput-object v0, p0, Lpn3;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 69
    .line 70
    :cond_1
    return-void

    .line 71
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    throw p0

    .line 73
    :pswitch_0
    iget-object v0, p0, Lbn3;->c:Lmn3;

    .line 74
    .line 75
    monitor-enter v0

    .line 76
    :try_start_2
    iput-boolean v1, v0, Lmn3;->a:Z

    .line 77
    .line 78
    iget-object v1, v0, Lmn3;->c:Lpn3;

    .line 79
    .line 80
    invoke-virtual {v1}, Lpn3;->Q()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-nez v2, :cond_2

    .line 85
    .line 86
    iget-object v2, v1, Lsq3;->a:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, Lij3;

    .line 89
    .line 90
    iget-object v2, v2, Lij3;->f:Luh3;

    .line 91
    .line 92
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 93
    .line 94
    .line 95
    iget-object v2, v2, Luh3;->Y:Lsh3;

    .line 96
    .line 97
    const-string v3, "Connected to service"

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Lsh3;->a(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iget-object p0, p0, Lbn3;->b:Lcom/google/android/gms/measurement/internal/zzga;

    .line 103
    .line 104
    invoke-virtual {v1}, Leg3;->y()V

    .line 105
    .line 106
    .line 107
    iput-object p0, v1, Lpn3;->d:Lcom/google/android/gms/measurement/internal/zzga;

    .line 108
    .line 109
    invoke-virtual {v1}, Lpn3;->M()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Lpn3;->O()V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :catchall_1
    move-exception p0

    .line 117
    goto :goto_3

    .line 118
    :cond_2
    :goto_2
    monitor-exit v0

    .line 119
    return-void

    .line 120
    :goto_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 121
    throw p0

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

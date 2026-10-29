.class public final Lne3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final a:Lfj;

.field public final synthetic b:Lej;


# direct methods
.method public synthetic constructor <init>(Lej;Lfj;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lne3;->b:Lej;

    .line 5
    .line 6
    iput-object p2, p0, Lne3;->a:Lfj;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lkj;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lne3;->b:Lej;

    .line 2
    .line 3
    iget-object v0, v0, Lej;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lne3;->b:Lej;

    .line 7
    .line 8
    iget v1, v1, Lej;->b:I

    .line 9
    .line 10
    const/4 v2, 0x3

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    iget-object p0, p0, Lne3;->a:Lfj;

    .line 19
    .line 20
    invoke-interface {p0, p1}, Lfj;->onBillingSetupFinished(Lkj;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw p0
.end method

.method public final onBindingDied(Landroid/content/ComponentName;)V
    .locals 4

    .line 1
    const-string p1, "BillingClient"

    .line 2
    .line 3
    const-string v0, "Billing service died."

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    :try_start_0
    iget-object v0, p0, Lne3;->b:Lej;

    .line 10
    .line 11
    iget-object v1, v0, Lej;->a:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    :try_start_1
    iget v0, v0, Lej;->b:I

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v2, p1

    .line 21
    :goto_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 22
    iget-object v0, p0, Lne3;->b:Lej;

    .line 23
    .line 24
    iget-object v0, v0, Lej;->g:Lwe2;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzjz;->zzc()Lcom/google/android/gms/internal/play_billing/zzjx;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x6

    .line 33
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzjx;->zzn(I)Lcom/google/android/gms/internal/play_billing/zzjx;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzki;->zzc()Lcom/google/android/gms/internal/play_billing/zzke;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const/16 v3, 0x7a

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/play_billing/zzke;->zzo(I)Lcom/google/android/gms/internal/play_billing/zzke;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzjx;->zza(Lcom/google/android/gms/internal/play_billing/zzke;)Lcom/google/android/gms/internal/play_billing/zzjx;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzjz;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lwe2;->t(Lcom/google/android/gms/internal/play_billing/zzjz;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzkl;->zzB()Lcom/google/android/gms/internal/play_billing/zzkl;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    .line 66
    .line 67
    :try_start_3
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzlk;->zzc()Lcom/google/android/gms/internal/play_billing/zzli;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    iget-object v3, v0, Lwe2;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v3, Lcom/google/android/gms/internal/play_billing/zzku;

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/play_billing/zzli;->zzo(Lcom/google/android/gms/internal/play_billing/zzku;)Lcom/google/android/gms/internal/play_billing/zzli;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/play_billing/zzli;->zzn(Lcom/google/android/gms/internal/play_billing/zzkl;)Lcom/google/android/gms/internal/play_billing/zzli;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzlk;

    .line 86
    .line 87
    iget-object v0, v0, Lwe2;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Lzr3;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Lzr3;->A(Lcom/google/android/gms/internal/play_billing/zzlk;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :catchall_1
    move-exception v0

    .line 96
    :try_start_4
    const-string v1, "BillingLogger"

    .line 97
    .line 98
    const-string v2, "Unable to log."

    .line 99
    .line 100
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :catchall_2
    move-exception v0

    .line 105
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 106
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 107
    :goto_1
    const-string v1, "BillingClient"

    .line 108
    .line 109
    const-string v2, "Unable to log."

    .line 110
    .line 111
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    :goto_2
    iget-object v0, p0, Lne3;->b:Lej;

    .line 115
    .line 116
    iget-object v0, v0, Lej;->a:Ljava/lang/Object;

    .line 117
    .line 118
    monitor-enter v0

    .line 119
    :try_start_7
    iget-object v1, p0, Lne3;->b:Lej;

    .line 120
    .line 121
    iget v1, v1, Lej;->b:I

    .line 122
    .line 123
    const/4 v2, 0x3

    .line 124
    if-eq v1, v2, :cond_3

    .line 125
    .line 126
    iget-object v1, p0, Lne3;->b:Lej;

    .line 127
    .line 128
    iget v1, v1, Lej;->b:I

    .line 129
    .line 130
    if-nez v1, :cond_2

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_2
    iget-object v1, p0, Lne3;->b:Lej;

    .line 134
    .line 135
    invoke-virtual {v1, p1}, Lej;->o(I)V

    .line 136
    .line 137
    .line 138
    iget-object p1, p0, Lne3;->b:Lej;

    .line 139
    .line 140
    invoke-virtual {p1}, Lej;->p()V

    .line 141
    .line 142
    .line 143
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 144
    iget-object p0, p0, Lne3;->a:Lfj;

    .line 145
    .line 146
    invoke-interface {p0}, Lfj;->onBillingServiceDisconnected()V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :catchall_3
    move-exception p0

    .line 151
    goto :goto_4

    .line 152
    :cond_3
    :goto_3
    :try_start_8
    monitor-exit v0

    .line 153
    return-void

    .line 154
    :goto_4
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 155
    throw p0
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 6

    .line 1
    const-string p1, "BillingClient"

    .line 2
    .line 3
    const-string v0, "Billing service connected."

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lne3;->b:Lej;

    .line 9
    .line 10
    iget-object p1, p1, Lej;->a:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter p1

    .line 13
    :try_start_0
    iget-object v0, p0, Lne3;->b:Lej;

    .line 14
    .line 15
    iget v0, v0, Lej;->b:I

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    monitor-exit p1

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    move-object p0, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lne3;->b:Lej;

    .line 26
    .line 27
    invoke-static {p2}, Lcom/google/android/gms/internal/play_billing/zzam;->zzu(Landroid/os/IBinder;)Lcom/google/android/gms/internal/play_billing/zzan;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    iput-object p2, v0, Lej;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 32
    .line 33
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    iget-object p1, p0, Lne3;->b:Lej;

    .line 35
    .line 36
    new-instance v0, Lrc;

    .line 37
    .line 38
    const/4 p2, 0x6

    .line 39
    invoke-direct {v0, p0, p2}, Lrc;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    new-instance v3, Lbb3;

    .line 43
    .line 44
    invoke-direct {v3, p0, p2}, Lbb3;-><init>(Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lej;->u()Landroid/os/Handler;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const-wide/16 v1, 0x7530

    .line 52
    .line 53
    invoke-virtual {p1}, Lej;->l()Ljava/util/concurrent/ExecutorService;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-static/range {v0 .. v5}, Lej;->h(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-nez p1, :cond_1

    .line 62
    .line 63
    iget-object p1, p0, Lne3;->b:Lej;

    .line 64
    .line 65
    invoke-virtual {p1}, Lej;->i()Lkj;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const/16 v1, 0x19

    .line 70
    .line 71
    invoke-virtual {p1, v1, p2, v0}, Lej;->x(IILkj;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v0}, Lne3;->a(Lkj;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    return-void

    .line 78
    :goto_0
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    throw p0
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 4

    .line 1
    const-string p1, "BillingClient"

    .line 2
    .line 3
    const-string v0, "Billing service disconnected."

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    :try_start_0
    iget-object v0, p0, Lne3;->b:Lej;

    .line 10
    .line 11
    iget-object v1, v0, Lej;->a:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    :try_start_1
    iget v0, v0, Lej;->b:I

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v2, p1

    .line 21
    :goto_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 22
    iget-object v0, p0, Lne3;->b:Lej;

    .line 23
    .line 24
    iget-object v0, v0, Lej;->g:Lwe2;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzjz;->zzc()Lcom/google/android/gms/internal/play_billing/zzjx;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x6

    .line 33
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzjx;->zzn(I)Lcom/google/android/gms/internal/play_billing/zzjx;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzki;->zzc()Lcom/google/android/gms/internal/play_billing/zzke;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const/16 v3, 0x79

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/play_billing/zzke;->zzo(I)Lcom/google/android/gms/internal/play_billing/zzke;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzjx;->zza(Lcom/google/android/gms/internal/play_billing/zzke;)Lcom/google/android/gms/internal/play_billing/zzjx;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzjz;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lwe2;->t(Lcom/google/android/gms/internal/play_billing/zzjz;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzlu;->zzB()Lcom/google/android/gms/internal/play_billing/zzlu;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    .line 66
    .line 67
    if-nez v1, :cond_2

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_2
    :try_start_3
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzlk;->zzc()Lcom/google/android/gms/internal/play_billing/zzli;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iget-object v3, v0, Lwe2;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v3, Lcom/google/android/gms/internal/play_billing/zzku;

    .line 77
    .line 78
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/play_billing/zzli;->zzo(Lcom/google/android/gms/internal/play_billing/zzku;)Lcom/google/android/gms/internal/play_billing/zzli;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/play_billing/zzli;->zzq(Lcom/google/android/gms/internal/play_billing/zzlu;)Lcom/google/android/gms/internal/play_billing/zzli;

    .line 82
    .line 83
    .line 84
    iget-object v0, v0, Lwe2;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Lzr3;

    .line 87
    .line 88
    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzlk;

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Lzr3;->A(Lcom/google/android/gms/internal/play_billing/zzlk;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :catchall_1
    move-exception v0

    .line 99
    :try_start_4
    const-string v1, "BillingLogger"

    .line 100
    .line 101
    const-string v2, "Unable to log."

    .line 102
    .line 103
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :catchall_2
    move-exception v0

    .line 108
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 109
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 110
    :goto_1
    const-string v1, "BillingClient"

    .line 111
    .line 112
    const-string v2, "Unable to log."

    .line 113
    .line 114
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    :goto_2
    iget-object v0, p0, Lne3;->b:Lej;

    .line 118
    .line 119
    iget-object v0, v0, Lej;->a:Ljava/lang/Object;

    .line 120
    .line 121
    monitor-enter v0

    .line 122
    :try_start_7
    iget-object v1, p0, Lne3;->b:Lej;

    .line 123
    .line 124
    iget v1, v1, Lej;->b:I

    .line 125
    .line 126
    const/4 v2, 0x3

    .line 127
    if-ne v1, v2, :cond_3

    .line 128
    .line 129
    monitor-exit v0

    .line 130
    return-void

    .line 131
    :catchall_3
    move-exception p0

    .line 132
    goto :goto_3

    .line 133
    :cond_3
    iget-object v1, p0, Lne3;->b:Lej;

    .line 134
    .line 135
    invoke-virtual {v1, p1}, Lej;->o(I)V

    .line 136
    .line 137
    .line 138
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 139
    iget-object p0, p0, Lne3;->a:Lfj;

    .line 140
    .line 141
    invoke-interface {p0}, Lfj;->onBillingServiceDisconnected()V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :goto_3
    :try_start_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 146
    throw p0
.end method

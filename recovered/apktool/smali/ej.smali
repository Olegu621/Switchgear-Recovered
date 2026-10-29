.class public Lej;
.super Ldj;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final A:Ljava/lang/Long;

.field public final a:Ljava/lang/Object;

.field public volatile b:I

.field public final c:Ljava/lang/String;

.field public final d:Landroid/os/Handler;

.field public volatile e:Lu93;

.field public final f:Landroid/content/Context;

.field public final g:Lwe2;

.field public volatile h:Lcom/google/android/gms/internal/play_billing/zzan;

.field public volatile i:Lne3;

.field public j:Z

.field public k:I

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Z

.field public final w:Lec0;

.field public final x:Z

.field public y:Ljava/util/concurrent/ExecutorService;

.field public volatile z:Lcom/google/android/gms/internal/play_billing/zzev;


# direct methods
.method public constructor <init>(Lec0;Landroid/content/Context;)V
    .locals 3

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
    iput-object v0, p0, Lej;->a:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lej;->b:I

    .line 13
    .line 14
    new-instance v1, Landroid/os/Handler;

    .line 15
    .line 16
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lej;->d:Landroid/os/Handler;

    .line 24
    .line 25
    iput v0, p0, Lej;->k:I

    .line 26
    .line 27
    new-instance v0, Ljava/util/Random;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iput-object v2, p0, Lej;->A:Ljava/lang/Long;

    .line 41
    .line 42
    invoke-static {}, Lej;->k()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iput-object v2, p0, Lej;->c:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    iput-object p2, p0, Lej;->f:Landroid/content/Context;

    .line 53
    .line 54
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzku;->zzc()Lcom/google/android/gms/internal/play_billing/zzks;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-static {}, Lej;->k()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/play_billing/zzks;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/zzks;

    .line 63
    .line 64
    .line 65
    iget-object v2, p0, Lej;->f:Landroid/content/Context;

    .line 66
    .line 67
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/play_billing/zzks;->zzn(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/zzks;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/play_billing/zzks;->zzm(J)Lcom/google/android/gms/internal/play_billing/zzks;

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lej;->f:Landroid/content/Context;

    .line 78
    .line 79
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    check-cast p2, Lcom/google/android/gms/internal/play_billing/zzku;

    .line 84
    .line 85
    new-instance v1, Lwe2;

    .line 86
    .line 87
    invoke-direct {v1, v0, p2}, Lwe2;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/zzku;)V

    .line 88
    .line 89
    .line 90
    iput-object v1, p0, Lej;->g:Lwe2;

    .line 91
    .line 92
    const-string p2, "BillingClient"

    .line 93
    .line 94
    const-string v0, "Billing client should have a valid listener but the provided is null."

    .line 95
    .line 96
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    new-instance p2, Lu93;

    .line 100
    .line 101
    iget-object v0, p0, Lej;->f:Landroid/content/Context;

    .line 102
    .line 103
    const/4 v1, 0x0

    .line 104
    iget-object v2, p0, Lej;->g:Lwe2;

    .line 105
    .line 106
    invoke-direct {p2, v0, v1, v2}, Lu93;-><init>(Landroid/content/Context;Ltz1;Lwe2;)V

    .line 107
    .line 108
    .line 109
    iput-object p2, p0, Lej;->e:Lu93;

    .line 110
    .line 111
    iput-object p1, p0, Lej;->w:Lec0;

    .line 112
    .line 113
    iget-object p0, p0, Lej;->f:Landroid/content/Context;

    .line 114
    .line 115
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public constructor <init>(Lec0;Landroid/content/Context;Ltz1;)V
    .locals 5

    .line 119
    invoke-static {}, Lej;->k()Ljava/lang/String;

    move-result-object v0

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lej;->a:Ljava/lang/Object;

    const/4 v1, 0x0

    iput v1, p0, Lej;->b:I

    new-instance v2, Landroid/os/Handler;

    .line 122
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v2, p0, Lej;->d:Landroid/os/Handler;

    iput v1, p0, Lej;->k:I

    new-instance v2, Ljava/util/Random;

    .line 123
    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    invoke-virtual {v2}, Ljava/util/Random;->nextLong()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    iput-object v4, p0, Lej;->A:Ljava/lang/Long;

    iput-object v0, p0, Lej;->c:Ljava/lang/String;

    .line 124
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lej;->f:Landroid/content/Context;

    .line 125
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzku;->zzc()Lcom/google/android/gms/internal/play_billing/zzks;

    move-result-object p2

    .line 126
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/play_billing/zzks;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/zzks;

    iget-object v0, p0, Lej;->f:Landroid/content/Context;

    .line 127
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/play_billing/zzks;->zzn(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/zzks;

    .line 128
    invoke-virtual {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/zzks;->zzm(J)Lcom/google/android/gms/internal/play_billing/zzks;

    .line 129
    iget-object v0, p0, Lej;->f:Landroid/content/Context;

    .line 130
    invoke-virtual {p2}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/play_billing/zzku;

    .line 131
    new-instance v2, Lwe2;

    invoke-direct {v2, v0, p2}, Lwe2;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/play_billing/zzku;)V

    iput-object v2, p0, Lej;->g:Lwe2;

    if-nez p3, :cond_0

    .line 132
    const-string p2, "BillingClient"

    const-string v0, "Billing client should have a valid listener but the provided is null."

    .line 133
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    new-instance p2, Lu93;

    iget-object v0, p0, Lej;->f:Landroid/content/Context;

    iget-object v2, p0, Lej;->g:Lwe2;

    .line 134
    invoke-direct {p2, v0, p3, v2}, Lu93;-><init>(Landroid/content/Context;Ltz1;Lwe2;)V

    iput-object p2, p0, Lej;->e:Lu93;

    iput-object p1, p0, Lej;->w:Lec0;

    iput-boolean v1, p0, Lej;->x:Z

    iget-object p0, p0, Lej;->f:Landroid/content/Context;

    .line 135
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    return-void
.end method

.method public static h(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p5, p0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    long-to-double p1, p1

    .line 6
    new-instance p5, Lcp0;

    .line 7
    .line 8
    const/16 v0, 0x17

    .line 9
    .line 10
    invoke-direct {p5, v0, p0, p3}, Lcp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    const-wide v0, 0x3fee666666666666L    # 0.95

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    mul-double/2addr p1, v0

    .line 19
    double-to-long p1, p1

    .line 20
    invoke-virtual {p4, p5, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :catch_0
    move-exception p0

    .line 25
    const-string p1, "BillingClient"

    .line 26
    .line 27
    const-string p2, "Async task throws exception!"

    .line 28
    .line 29
    invoke-static {p1, p2, p0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public static k()Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "com.android.billingclient.ktx.BuildConfig"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "VERSION_NAME"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    return-object v0

    .line 21
    :catch_0
    const-string v0, "7.1.1"

    .line 22
    .line 23
    return-object v0
.end method


# virtual methods
.method public final A(Lkj;)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Lpl3;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, v1, p0, p1}, Lpl3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lej;->d:Landroid/os/Handler;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public a()V
    .locals 5

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lej;->z(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lej;->a:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lej;->e:Lu93;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lej;->e:Lu93;

    .line 14
    .line 15
    iget-object v2, v1, Lu93;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lgi3;

    .line 18
    .line 19
    iget-object v3, v1, Lu93;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Landroid/content/Context;

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Lgi3;->c(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, v1, Lu93;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lgi3;

    .line 29
    .line 30
    invoke-virtual {v1, v3}, Lgi3;->c(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    :try_start_1
    const-string v2, "BillingClient"

    .line 36
    .line 37
    const-string v3, "There was an exception while shutting down broadcast manager while ending connection!"

    .line 38
    .line 39
    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 40
    .line 41
    .line 42
    :cond_0
    :goto_0
    :try_start_2
    const-string v1, "BillingClient"

    .line 43
    .line 44
    const-string v2, "Unbinding from service."

    .line 45
    .line 46
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lej;->p()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catchall_1
    move-exception v1

    .line 54
    :try_start_3
    const-string v2, "BillingClient"

    .line 55
    .line 56
    const-string v3, "There was an exception while unbinding from the service while ending connection!"

    .line 57
    .line 58
    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 59
    .line 60
    .line 61
    :goto_1
    const/4 v1, 0x3

    .line 62
    :try_start_4
    monitor-enter p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 63
    :try_start_5
    iget-object v2, p0, Lej;->y:Ljava/util/concurrent/ExecutorService;

    .line 64
    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    iput-object v2, p0, Lej;->y:Ljava/util/concurrent/ExecutorService;

    .line 72
    .line 73
    iput-object v2, p0, Lej;->z:Lcom/google/android/gms/internal/play_billing/zzev;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 74
    .line 75
    :cond_1
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 76
    goto :goto_2

    .line 77
    :catchall_2
    move-exception v2

    .line 78
    goto :goto_3

    .line 79
    :goto_2
    :try_start_7
    invoke-virtual {p0, v1}, Lej;->o(I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 80
    .line 81
    .line 82
    goto :goto_4

    .line 83
    :catchall_3
    move-exception p0

    .line 84
    goto :goto_5

    .line 85
    :goto_3
    :try_start_8
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 86
    :try_start_9
    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 87
    :catchall_4
    move-exception v2

    .line 88
    :try_start_a
    const-string v3, "BillingClient"

    .line 89
    .line 90
    const-string v4, "There was an exception while shutting down the executor service while ending connection!"

    .line 91
    .line 92
    invoke-static {v3, v4, v2}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :goto_4
    :try_start_b
    monitor-exit v0

    .line 97
    return-void

    .line 98
    :catchall_5
    move-exception v2

    .line 99
    invoke-virtual {p0, v1}, Lej;->o(I)V

    .line 100
    .line 101
    .line 102
    throw v2

    .line 103
    :goto_5
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 104
    throw p0
.end method

.method public b(Ld5;Lds0;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lej;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p1, Lkf3;->j:Lkj;

    .line 9
    .line 10
    const/4 p2, 0x2

    .line 11
    invoke-virtual {p0, p2, v1, p1}, Lej;->x(IILkj;)V

    .line 12
    .line 13
    .line 14
    iget p0, p1, Lkj;->a:I

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance v2, Lkd3;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-direct {v2, p0, p1, p2, v0}, Lkd3;-><init>(Lej;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    new-instance v5, Lbb3;

    .line 24
    .line 25
    invoke-direct {v5, p0, p2, p1}, Lbb3;-><init>(Lej;Lds0;Ld5;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lej;->u()Landroid/os/Handler;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-virtual {p0}, Lej;->l()Ljava/util/concurrent/ExecutorService;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    const-wide/16 v3, 0x7530

    .line 37
    .line 38
    invoke-static/range {v2 .. v7}, Lej;->h(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Lej;->i()Lkj;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const/16 p2, 0x19

    .line 49
    .line 50
    invoke-virtual {p0, p2, v1, p1}, Lej;->x(IILkj;)V

    .line 51
    .line 52
    .line 53
    iget p0, p1, Lkj;->a:I

    .line 54
    .line 55
    :cond_1
    return-void
.end method

.method public final c()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lej;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lej;->b:I

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x0

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lej;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Lej;->i:Lne3;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    return v3

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p0
.end method

.method public d(Landroid/app/Activity;Lij;)Lkj;
    .locals 34

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v5, p2

    .line 4
    .line 5
    const-string v8, "BUY_INTENT"

    .line 6
    .line 7
    const-string v0, "proxyPackageVersion"

    .line 8
    .line 9
    iget-object v2, v1, Lej;->e:Lu93;

    .line 10
    .line 11
    const/4 v9, 0x2

    .line 12
    if-eqz v2, :cond_48

    .line 13
    .line 14
    iget-object v2, v1, Lej;->e:Lu93;

    .line 15
    .line 16
    iget-object v2, v2, Lu93;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Ltz1;

    .line 19
    .line 20
    if-eqz v2, :cond_48

    .line 21
    .line 22
    invoke-virtual {v1}, Lej;->c()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    sget-object v0, Lkf3;->j:Lkj;

    .line 29
    .line 30
    invoke-virtual {v1, v9, v9, v0}, Lej;->x(IILkj;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0}, Lej;->A(Lkj;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v3, v5, Lij;->b:Ljava/util/List;

    .line 43
    .line 44
    check-cast v3, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 47
    .line 48
    .line 49
    iget-object v3, v5, Lij;->e:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v3, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 52
    .line 53
    const/4 v10, 0x0

    .line 54
    invoke-static {v2, v10}, Lcom/google/android/gms/internal/play_billing/zzcx;->zza(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Lve2;

    .line 59
    .line 60
    invoke-static {v3, v10}, Lcom/google/android/gms/internal/play_billing/zzcx;->zza(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    check-cast v6, Lhj;

    .line 65
    .line 66
    if-eqz v4, :cond_1

    .line 67
    .line 68
    invoke-virtual {v4}, Lve2;->a()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v11

    .line 72
    invoke-virtual {v4}, Lve2;->b()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v12

    .line 76
    goto :goto_0

    .line 77
    :cond_1
    iget-object v11, v6, Lhj;->a:Lzx1;

    .line 78
    .line 79
    iget-object v12, v11, Lzx1;->c:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v11, v11, Lzx1;->d:Ljava/lang/String;

    .line 82
    .line 83
    move-object/from16 v33, v12

    .line 84
    .line 85
    move-object v12, v11

    .line 86
    move-object/from16 v11, v33

    .line 87
    .line 88
    :goto_0
    const-string v13, "subs"

    .line 89
    .line 90
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v14

    .line 94
    const/16 v15, 0x9

    .line 95
    .line 96
    move-object/from16 v16, v10

    .line 97
    .line 98
    const-string v10, "BillingClient"

    .line 99
    .line 100
    if-eqz v14, :cond_3

    .line 101
    .line 102
    iget-boolean v14, v1, Lej;->j:Z

    .line 103
    .line 104
    if-eqz v14, :cond_2

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    const-string v0, "Current client doesn\'t support subscriptions."

    .line 108
    .line 109
    invoke-static {v10, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    sget-object v0, Lkf3;->l:Lkj;

    .line 113
    .line 114
    invoke-virtual {v1, v15, v9, v0}, Lej;->x(IILkj;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v0}, Lej;->A(Lkj;)V

    .line 118
    .line 119
    .line 120
    return-object v0

    .line 121
    :cond_3
    :goto_1
    iget-object v14, v5, Lij;->c:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v14, Ljava/lang/String;

    .line 124
    .line 125
    if-nez v14, :cond_4

    .line 126
    .line 127
    iget-object v14, v5, Lij;->d:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v14, Lxt0;

    .line 130
    .line 131
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget-object v14, v5, Lij;->e:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v14, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 137
    .line 138
    invoke-interface {v14}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 139
    .line 140
    .line 141
    move-result-object v14

    .line 142
    new-instance v15, Lhf3;

    .line 143
    .line 144
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-interface {v14, v15}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 148
    .line 149
    .line 150
    move-result v14

    .line 151
    if-nez v14, :cond_4

    .line 152
    .line 153
    iget-boolean v14, v5, Lij;->a:Z

    .line 154
    .line 155
    if-nez v14, :cond_4

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_4
    iget-boolean v14, v1, Lej;->l:Z

    .line 159
    .line 160
    if-eqz v14, :cond_47

    .line 161
    .line 162
    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 163
    .line 164
    .line 165
    move-result v14

    .line 166
    const/4 v15, 0x1

    .line 167
    if-le v14, v15, :cond_6

    .line 168
    .line 169
    iget-boolean v14, v1, Lej;->q:Z

    .line 170
    .line 171
    if-eqz v14, :cond_5

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_5
    const-string v0, "Current client doesn\'t support multi-item purchases."

    .line 175
    .line 176
    invoke-static {v10, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    sget-object v0, Lkf3;->m:Lkj;

    .line 180
    .line 181
    const/16 v2, 0x13

    .line 182
    .line 183
    invoke-virtual {v1, v2, v9, v0}, Lej;->x(IILkj;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, v0}, Lej;->A(Lkj;)V

    .line 187
    .line 188
    .line 189
    return-object v0

    .line 190
    :cond_6
    :goto_3
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 191
    .line 192
    .line 193
    move-result v14

    .line 194
    if-nez v14, :cond_8

    .line 195
    .line 196
    iget-boolean v14, v1, Lej;->r:Z

    .line 197
    .line 198
    if-eqz v14, :cond_7

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_7
    const-string v0, "Current client doesn\'t support purchases with ProductDetails."

    .line 202
    .line 203
    invoke-static {v10, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    sget-object v0, Lkf3;->o:Lkj;

    .line 207
    .line 208
    const/16 v2, 0x14

    .line 209
    .line 210
    invoke-virtual {v1, v2, v9, v0}, Lej;->x(IILkj;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, v0}, Lej;->A(Lkj;)V

    .line 214
    .line 215
    .line 216
    return-object v0

    .line 217
    :cond_8
    :goto_4
    iget-object v14, v5, Lij;->e:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v14, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 220
    .line 221
    invoke-virtual {v14}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 222
    .line 223
    .line 224
    move-result v14

    .line 225
    const-string v9, "packageName"

    .line 226
    .line 227
    const/4 v15, 0x0

    .line 228
    if-eqz v14, :cond_9

    .line 229
    .line 230
    sget-object v13, Lkf3;->i:Lkj;

    .line 231
    .line 232
    move-object/from16 v22, v0

    .line 233
    .line 234
    move-object/from16 v21, v8

    .line 235
    .line 236
    move-object/from16 v23, v10

    .line 237
    .line 238
    move-object/from16 v18, v11

    .line 239
    .line 240
    move-object/from16 v19, v12

    .line 241
    .line 242
    goto/16 :goto_9

    .line 243
    .line 244
    :cond_9
    iget-object v14, v5, Lij;->e:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v14, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 247
    .line 248
    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v14

    .line 252
    check-cast v14, Lhj;

    .line 253
    .line 254
    move-object/from16 v18, v11

    .line 255
    .line 256
    const/4 v15, 0x1

    .line 257
    :goto_5
    iget-object v11, v5, Lij;->e:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v11, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 260
    .line 261
    invoke-virtual {v11}, Ljava/util/AbstractCollection;->size()I

    .line 262
    .line 263
    .line 264
    move-result v11

    .line 265
    move-object/from16 v19, v12

    .line 266
    .line 267
    const-string v12, "play_pass_subs"

    .line 268
    .line 269
    if-ge v15, v11, :cond_c

    .line 270
    .line 271
    iget-object v11, v5, Lij;->e:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v11, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 274
    .line 275
    invoke-interface {v11, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v11

    .line 279
    check-cast v11, Lhj;

    .line 280
    .line 281
    move/from16 v20, v15

    .line 282
    .line 283
    iget-object v15, v11, Lhj;->a:Lzx1;

    .line 284
    .line 285
    iget-object v15, v15, Lzx1;->d:Ljava/lang/String;

    .line 286
    .line 287
    move-object/from16 v21, v8

    .line 288
    .line 289
    iget-object v8, v14, Lhj;->a:Lzx1;

    .line 290
    .line 291
    iget-object v8, v8, Lzx1;->d:Ljava/lang/String;

    .line 292
    .line 293
    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v8

    .line 297
    if-nez v8, :cond_b

    .line 298
    .line 299
    iget-object v8, v11, Lhj;->a:Lzx1;

    .line 300
    .line 301
    iget-object v8, v8, Lzx1;->d:Ljava/lang/String;

    .line 302
    .line 303
    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v8

    .line 307
    if-eqz v8, :cond_a

    .line 308
    .line 309
    goto :goto_6

    .line 310
    :cond_a
    const-string v8, "All products should have same ProductType."

    .line 311
    .line 312
    const/4 v11, 0x5

    .line 313
    invoke-static {v11, v8}, Lkf3;->a(ILjava/lang/String;)Lkj;

    .line 314
    .line 315
    .line 316
    move-result-object v13

    .line 317
    move-object/from16 v22, v0

    .line 318
    .line 319
    move-object/from16 v23, v10

    .line 320
    .line 321
    goto/16 :goto_9

    .line 322
    .line 323
    :cond_b
    :goto_6
    add-int/lit8 v15, v20, 0x1

    .line 324
    .line 325
    move-object/from16 v12, v19

    .line 326
    .line 327
    move-object/from16 v8, v21

    .line 328
    .line 329
    goto :goto_5

    .line 330
    :cond_c
    move-object/from16 v21, v8

    .line 331
    .line 332
    iget-object v8, v14, Lhj;->a:Lzx1;

    .line 333
    .line 334
    iget-object v11, v8, Lzx1;->b:Lorg/json/JSONObject;

    .line 335
    .line 336
    invoke-virtual {v11, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v11

    .line 340
    new-instance v14, Ljava/util/HashSet;

    .line 341
    .line 342
    invoke-direct {v14}, Ljava/util/HashSet;-><init>()V

    .line 343
    .line 344
    .line 345
    new-instance v15, Ljava/util/HashSet;

    .line 346
    .line 347
    invoke-direct {v15}, Ljava/util/HashSet;-><init>()V

    .line 348
    .line 349
    .line 350
    move-object/from16 v20, v15

    .line 351
    .line 352
    iget-object v15, v5, Lij;->e:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v15, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 355
    .line 356
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    move-object/from16 v22, v0

    .line 361
    .line 362
    move-object/from16 v23, v10

    .line 363
    .line 364
    const/4 v0, 0x0

    .line 365
    :goto_7
    const-string v10, "."

    .line 366
    .line 367
    if-ge v0, v7, :cond_10

    .line 368
    .line 369
    invoke-interface {v15, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v24

    .line 373
    move/from16 v25, v0

    .line 374
    .line 375
    move-object/from16 v0, v24

    .line 376
    .line 377
    check-cast v0, Lhj;

    .line 378
    .line 379
    iget-object v0, v0, Lhj;->a:Lzx1;

    .line 380
    .line 381
    move/from16 v24, v7

    .line 382
    .line 383
    iget-object v7, v0, Lzx1;->c:Ljava/lang/String;

    .line 384
    .line 385
    move-object/from16 v26, v15

    .line 386
    .line 387
    iget-object v15, v0, Lzx1;->d:Ljava/lang/String;

    .line 388
    .line 389
    invoke-virtual {v15, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    invoke-virtual {v14, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v15

    .line 396
    if-eqz v15, :cond_d

    .line 397
    .line 398
    new-instance v0, Ljava/lang/StringBuilder;

    .line 399
    .line 400
    const-string v8, "ProductId can not be duplicated. Invalid product id: "

    .line 401
    .line 402
    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    const/4 v11, 0x5

    .line 416
    invoke-static {v11, v0}, Lkf3;->a(ILjava/lang/String;)Lkj;

    .line 417
    .line 418
    .line 419
    move-result-object v13

    .line 420
    goto/16 :goto_9

    .line 421
    .line 422
    :cond_d
    invoke-virtual {v14, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    iget-object v7, v8, Lzx1;->d:Ljava/lang/String;

    .line 426
    .line 427
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v7

    .line 431
    if-nez v7, :cond_f

    .line 432
    .line 433
    iget-object v7, v0, Lzx1;->d:Ljava/lang/String;

    .line 434
    .line 435
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v7

    .line 439
    if-nez v7, :cond_f

    .line 440
    .line 441
    iget-object v0, v0, Lzx1;->b:Lorg/json/JSONObject;

    .line 442
    .line 443
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    if-eqz v0, :cond_e

    .line 452
    .line 453
    goto :goto_8

    .line 454
    :cond_e
    const-string v0, "All products must have the same package name."

    .line 455
    .line 456
    const/4 v11, 0x5

    .line 457
    invoke-static {v11, v0}, Lkf3;->a(ILjava/lang/String;)Lkj;

    .line 458
    .line 459
    .line 460
    move-result-object v13

    .line 461
    goto :goto_9

    .line 462
    :cond_f
    :goto_8
    add-int/lit8 v0, v25, 0x1

    .line 463
    .line 464
    move/from16 v7, v24

    .line 465
    .line 466
    move-object/from16 v15, v26

    .line 467
    .line 468
    goto :goto_7

    .line 469
    :cond_10
    invoke-virtual/range {v20 .. v20}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 474
    .line 475
    .line 476
    move-result v7

    .line 477
    if-eqz v7, :cond_12

    .line 478
    .line 479
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v7

    .line 483
    check-cast v7, Ljava/lang/String;

    .line 484
    .line 485
    invoke-virtual {v14, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v11

    .line 489
    if-eqz v11, :cond_11

    .line 490
    .line 491
    new-instance v0, Ljava/lang/StringBuilder;

    .line 492
    .line 493
    const-string v8, "OldProductId must not be one of the products to be purchased. Invalid old product id: "

    .line 494
    .line 495
    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    const/4 v11, 0x5

    .line 509
    invoke-static {v11, v0}, Lkf3;->a(ILjava/lang/String;)Lkj;

    .line 510
    .line 511
    .line 512
    move-result-object v13

    .line 513
    goto :goto_9

    .line 514
    :cond_12
    const/4 v11, 0x5

    .line 515
    invoke-virtual {v8}, Lzx1;->a()Lyx1;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    if-eqz v0, :cond_13

    .line 520
    .line 521
    iget-object v0, v0, Lyx1;->e:Llf3;

    .line 522
    .line 523
    if-eqz v0, :cond_13

    .line 524
    .line 525
    const-string v0, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay."

    .line 526
    .line 527
    invoke-static {v11, v0}, Lkf3;->a(ILjava/lang/String;)Lkj;

    .line 528
    .line 529
    .line 530
    move-result-object v13

    .line 531
    goto :goto_9

    .line 532
    :cond_13
    sget-object v13, Lkf3;->i:Lkj;

    .line 533
    .line 534
    :goto_9
    sget-object v0, Lkf3;->i:Lkj;

    .line 535
    .line 536
    if-eq v13, v0, :cond_14

    .line 537
    .line 538
    const/16 v0, 0x78

    .line 539
    .line 540
    const/4 v2, 0x2

    .line 541
    invoke-virtual {v1, v0, v2, v13}, Lej;->x(IILkj;)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v1, v13}, Lej;->A(Lkj;)V

    .line 545
    .line 546
    .line 547
    return-object v13

    .line 548
    :cond_14
    iget-boolean v0, v1, Lej;->l:Z

    .line 549
    .line 550
    if-eqz v0, :cond_3f

    .line 551
    .line 552
    iget-boolean v0, v1, Lej;->m:Z

    .line 553
    .line 554
    iget-object v7, v1, Lej;->w:Lec0;

    .line 555
    .line 556
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    iget-object v7, v1, Lej;->w:Lec0;

    .line 560
    .line 561
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    iget-boolean v7, v1, Lej;->x:Z

    .line 565
    .line 566
    iget-object v8, v1, Lej;->c:Ljava/lang/String;

    .line 567
    .line 568
    iget-object v10, v1, Lej;->A:Ljava/lang/Long;

    .line 569
    .line 570
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 571
    .line 572
    .line 573
    move-result-wide v10

    .line 574
    iget-object v12, v1, Lej;->f:Landroid/content/Context;

    .line 575
    .line 576
    invoke-virtual {v12}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v12

    .line 580
    new-instance v13, Landroid/os/Bundle;

    .line 581
    .line 582
    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 583
    .line 584
    .line 585
    invoke-static {v13, v8, v10, v11}, Lcom/google/android/gms/internal/play_billing/zze;->zzc(Landroid/os/Bundle;Ljava/lang/String;J)Landroid/os/Bundle;

    .line 586
    .line 587
    .line 588
    iget-object v8, v5, Lij;->d:Ljava/lang/Object;

    .line 589
    .line 590
    check-cast v8, Lxt0;

    .line 591
    .line 592
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    iget-object v8, v5, Lij;->c:Ljava/lang/Object;

    .line 596
    .line 597
    check-cast v8, Ljava/lang/String;

    .line 598
    .line 599
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 600
    .line 601
    .line 602
    move-result v8

    .line 603
    if-nez v8, :cond_15

    .line 604
    .line 605
    iget-object v8, v5, Lij;->c:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast v8, Ljava/lang/String;

    .line 608
    .line 609
    const-string v10, "accountId"

    .line 610
    .line 611
    invoke-virtual {v13, v10, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 612
    .line 613
    .line 614
    :cond_15
    invoke-static/range {v16 .. v16}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 615
    .line 616
    .line 617
    move-result v8

    .line 618
    if-nez v8, :cond_16

    .line 619
    .line 620
    const-string v8, "obfuscatedProfileId"

    .line 621
    .line 622
    move-object/from16 v10, v16

    .line 623
    .line 624
    invoke-virtual {v13, v8, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    goto :goto_a

    .line 628
    :cond_16
    move-object/from16 v10, v16

    .line 629
    .line 630
    :goto_a
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 631
    .line 632
    .line 633
    move-result v8

    .line 634
    if-nez v8, :cond_17

    .line 635
    .line 636
    new-instance v8, Ljava/util/ArrayList;

    .line 637
    .line 638
    filled-new-array {v10}, [Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v11

    .line 642
    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 643
    .line 644
    .line 645
    move-result-object v11

    .line 646
    invoke-direct {v8, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 647
    .line 648
    .line 649
    const-string v11, "skusToReplace"

    .line 650
    .line 651
    invoke-virtual {v13, v11, v8}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 652
    .line 653
    .line 654
    :cond_17
    iget-object v8, v5, Lij;->d:Ljava/lang/Object;

    .line 655
    .line 656
    check-cast v8, Lxt0;

    .line 657
    .line 658
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 662
    .line 663
    .line 664
    move-result v8

    .line 665
    if-nez v8, :cond_18

    .line 666
    .line 667
    iget-object v8, v5, Lij;->d:Ljava/lang/Object;

    .line 668
    .line 669
    check-cast v8, Lxt0;

    .line 670
    .line 671
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 672
    .line 673
    .line 674
    const-string v8, "oldSkuPurchaseToken"

    .line 675
    .line 676
    invoke-virtual {v13, v8, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    :cond_18
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 680
    .line 681
    .line 682
    move-result v8

    .line 683
    if-nez v8, :cond_19

    .line 684
    .line 685
    const-string v8, "oldSkuPurchaseId"

    .line 686
    .line 687
    invoke-virtual {v13, v8, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    :cond_19
    iget-object v8, v5, Lij;->d:Ljava/lang/Object;

    .line 691
    .line 692
    check-cast v8, Lxt0;

    .line 693
    .line 694
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    .line 696
    .line 697
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 698
    .line 699
    .line 700
    move-result v8

    .line 701
    if-nez v8, :cond_1a

    .line 702
    .line 703
    iget-object v8, v5, Lij;->d:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v8, Lxt0;

    .line 706
    .line 707
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 708
    .line 709
    .line 710
    const-string v8, "originalExternalTransactionId"

    .line 711
    .line 712
    invoke-virtual {v13, v8, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 713
    .line 714
    .line 715
    :cond_1a
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 716
    .line 717
    .line 718
    move-result v8

    .line 719
    if-nez v8, :cond_1b

    .line 720
    .line 721
    const-string v8, "paymentsPurchaseParams"

    .line 722
    .line 723
    invoke-virtual {v13, v8, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 724
    .line 725
    .line 726
    :cond_1b
    if-eqz v0, :cond_1c

    .line 727
    .line 728
    const-string v0, "enablePendingPurchases"

    .line 729
    .line 730
    const/4 v8, 0x1

    .line 731
    invoke-virtual {v13, v0, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 732
    .line 733
    .line 734
    goto :goto_b

    .line 735
    :cond_1c
    const/4 v8, 0x1

    .line 736
    :goto_b
    if-eqz v7, :cond_1d

    .line 737
    .line 738
    const-string v0, "enableAlternativeBilling"

    .line 739
    .line 740
    invoke-virtual {v13, v0, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 741
    .line 742
    .line 743
    :cond_1d
    iget-object v0, v5, Lij;->e:Ljava/lang/Object;

    .line 744
    .line 745
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 746
    .line 747
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    new-instance v7, Lcom/google/android/gms/internal/play_billing/zza;

    .line 752
    .line 753
    invoke-direct {v7}, Lcom/google/android/gms/internal/play_billing/zza;-><init>()V

    .line 754
    .line 755
    .line 756
    invoke-interface {v0, v7}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 757
    .line 758
    .line 759
    move-result v0

    .line 760
    if-eqz v0, :cond_1e

    .line 761
    .line 762
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzfn;->zza()Lcom/google/android/gms/internal/play_billing/zzfm;

    .line 763
    .line 764
    .line 765
    move-result-object v0

    .line 766
    iget-object v7, v5, Lij;->e:Ljava/lang/Object;

    .line 767
    .line 768
    check-cast v7, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 769
    .line 770
    invoke-interface {v7}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 771
    .line 772
    .line 773
    move-result-object v7

    .line 774
    new-instance v8, Lcom/google/android/gms/internal/play_billing/zzb;

    .line 775
    .line 776
    invoke-direct {v8}, Lcom/google/android/gms/internal/play_billing/zzb;-><init>()V

    .line 777
    .line 778
    .line 779
    invoke-interface {v7, v8}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 780
    .line 781
    .line 782
    move-result-object v7

    .line 783
    new-instance v8, Lcom/google/android/gms/internal/play_billing/zzc;

    .line 784
    .line 785
    invoke-direct {v8, v12}, Lcom/google/android/gms/internal/play_billing/zzc;-><init>(Ljava/lang/String;)V

    .line 786
    .line 787
    .line 788
    invoke-interface {v7, v8}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 789
    .line 790
    .line 791
    move-result-object v7

    .line 792
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzco;->zzo()Ljava/util/stream/Collector;

    .line 793
    .line 794
    .line 795
    move-result-object v8

    .line 796
    invoke-interface {v7, v8}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v7

    .line 800
    check-cast v7, Ljava/lang/Iterable;

    .line 801
    .line 802
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/play_billing/zzfm;->zza(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/play_billing/zzfm;

    .line 803
    .line 804
    .line 805
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzfn;

    .line 810
    .line 811
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzfv;->zzh()[B

    .line 812
    .line 813
    .line 814
    move-result-object v0

    .line 815
    const-string v7, "subscriptionProductReplacementParamsList"

    .line 816
    .line 817
    invoke-virtual {v13, v7, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 818
    .line 819
    .line 820
    :cond_1e
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 821
    .line 822
    .line 823
    move-result v0

    .line 824
    const-string v7, "additionalSkuTypes"

    .line 825
    .line 826
    const-string v8, "additionalSkus"

    .line 827
    .line 828
    const-string v10, "SKU_SERIALIZED_DOCID_LIST"

    .line 829
    .line 830
    const-string v11, "skuDetailsTokens"

    .line 831
    .line 832
    const-string v12, "SKU_OFFER_ID_TOKEN_LIST"

    .line 833
    .line 834
    if-nez v0, :cond_2a

    .line 835
    .line 836
    new-instance v0, Ljava/util/ArrayList;

    .line 837
    .line 838
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 839
    .line 840
    .line 841
    new-instance v14, Ljava/util/ArrayList;

    .line 842
    .line 843
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 844
    .line 845
    .line 846
    new-instance v15, Ljava/util/ArrayList;

    .line 847
    .line 848
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 849
    .line 850
    .line 851
    new-instance v5, Ljava/util/ArrayList;

    .line 852
    .line 853
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 854
    .line 855
    .line 856
    move-object/from16 v20, v6

    .line 857
    .line 858
    new-instance v6, Ljava/util/ArrayList;

    .line 859
    .line 860
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 861
    .line 862
    .line 863
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 864
    .line 865
    .line 866
    move-result-object v24

    .line 867
    const/16 v25, 0x0

    .line 868
    .line 869
    const/16 v26, 0x0

    .line 870
    .line 871
    const/16 v27, 0x0

    .line 872
    .line 873
    const/16 v28, 0x0

    .line 874
    .line 875
    :goto_c
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    .line 876
    .line 877
    .line 878
    move-result v29

    .line 879
    if-eqz v29, :cond_22

    .line 880
    .line 881
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v29

    .line 885
    move-object/from16 v30, v9

    .line 886
    .line 887
    move-object/from16 v9, v29

    .line 888
    .line 889
    check-cast v9, Lve2;

    .line 890
    .line 891
    move-object/from16 v29, v4

    .line 892
    .line 893
    iget-object v4, v9, Lve2;->b:Lorg/json/JSONObject;

    .line 894
    .line 895
    const-string v1, "skuDetailsToken"

    .line 896
    .line 897
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 898
    .line 899
    .line 900
    move-result-object v4

    .line 901
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 902
    .line 903
    .line 904
    move-result v4

    .line 905
    if-nez v4, :cond_1f

    .line 906
    .line 907
    iget-object v4, v9, Lve2;->b:Lorg/json/JSONObject;

    .line 908
    .line 909
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 910
    .line 911
    .line 912
    move-result-object v1

    .line 913
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 914
    .line 915
    .line 916
    :cond_1f
    iget-object v1, v9, Lve2;->b:Lorg/json/JSONObject;

    .line 917
    .line 918
    const-string v4, "offerIdToken"

    .line 919
    .line 920
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v4

    .line 924
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 925
    .line 926
    .line 927
    move-result v31

    .line 928
    if-eqz v31, :cond_20

    .line 929
    .line 930
    const-string v4, "offer_id_token"

    .line 931
    .line 932
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object v4

    .line 936
    :cond_20
    iget-object v1, v9, Lve2;->b:Lorg/json/JSONObject;

    .line 937
    .line 938
    move-object/from16 v31, v3

    .line 939
    .line 940
    const-string v3, "offer_id"

    .line 941
    .line 942
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 943
    .line 944
    .line 945
    move-result-object v1

    .line 946
    iget-object v3, v9, Lve2;->b:Lorg/json/JSONObject;

    .line 947
    .line 948
    move-object/from16 v32, v7

    .line 949
    .line 950
    const-string v7, "offer_type"

    .line 951
    .line 952
    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 953
    .line 954
    .line 955
    move-result v3

    .line 956
    iget-object v7, v9, Lve2;->b:Lorg/json/JSONObject;

    .line 957
    .line 958
    const-string v9, "serializedDocid"

    .line 959
    .line 960
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 961
    .line 962
    .line 963
    move-result-object v7

    .line 964
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 965
    .line 966
    .line 967
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 968
    .line 969
    .line 970
    move-result v4

    .line 971
    const/16 v17, 0x1

    .line 972
    .line 973
    xor-int/lit8 v4, v4, 0x1

    .line 974
    .line 975
    or-int v25, v25, v4

    .line 976
    .line 977
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 978
    .line 979
    .line 980
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 981
    .line 982
    .line 983
    move-result v1

    .line 984
    xor-int/lit8 v1, v1, 0x1

    .line 985
    .line 986
    or-int v26, v26, v1

    .line 987
    .line 988
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 989
    .line 990
    .line 991
    move-result-object v1

    .line 992
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 993
    .line 994
    .line 995
    if-eqz v3, :cond_21

    .line 996
    .line 997
    move/from16 v1, v17

    .line 998
    .line 999
    goto :goto_d

    .line 1000
    :cond_21
    const/4 v1, 0x0

    .line 1001
    :goto_d
    or-int v27, v27, v1

    .line 1002
    .line 1003
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v1

    .line 1007
    xor-int/lit8 v1, v1, 0x1

    .line 1008
    .line 1009
    or-int v28, v28, v1

    .line 1010
    .line 1011
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1012
    .line 1013
    .line 1014
    move-object/from16 v1, p0

    .line 1015
    .line 1016
    move-object/from16 v4, v29

    .line 1017
    .line 1018
    move-object/from16 v9, v30

    .line 1019
    .line 1020
    move-object/from16 v3, v31

    .line 1021
    .line 1022
    move-object/from16 v7, v32

    .line 1023
    .line 1024
    goto/16 :goto_c

    .line 1025
    .line 1026
    :cond_22
    move-object/from16 v31, v3

    .line 1027
    .line 1028
    move-object/from16 v29, v4

    .line 1029
    .line 1030
    move-object/from16 v32, v7

    .line 1031
    .line 1032
    move-object/from16 v30, v9

    .line 1033
    .line 1034
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1035
    .line 1036
    .line 1037
    move-result v1

    .line 1038
    if-nez v1, :cond_23

    .line 1039
    .line 1040
    invoke-virtual {v13, v11, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1041
    .line 1042
    .line 1043
    :cond_23
    if-eqz v25, :cond_24

    .line 1044
    .line 1045
    invoke-virtual {v13, v12, v14}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1046
    .line 1047
    .line 1048
    :cond_24
    if-eqz v26, :cond_25

    .line 1049
    .line 1050
    const-string v0, "SKU_OFFER_ID_LIST"

    .line 1051
    .line 1052
    invoke-virtual {v13, v0, v15}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1053
    .line 1054
    .line 1055
    :cond_25
    if-eqz v27, :cond_26

    .line 1056
    .line 1057
    const-string v0, "SKU_OFFER_TYPE_LIST"

    .line 1058
    .line 1059
    invoke-virtual {v13, v0, v5}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1060
    .line 1061
    .line 1062
    :cond_26
    if-eqz v28, :cond_27

    .line 1063
    .line 1064
    invoke-virtual {v13, v10, v6}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1065
    .line 1066
    .line 1067
    :cond_27
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1068
    .line 1069
    .line 1070
    move-result v0

    .line 1071
    const/4 v1, 0x1

    .line 1072
    if-le v0, v1, :cond_29

    .line 1073
    .line 1074
    new-instance v0, Ljava/util/ArrayList;

    .line 1075
    .line 1076
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1077
    .line 1078
    .line 1079
    move-result v1

    .line 1080
    add-int/lit8 v1, v1, -0x1

    .line 1081
    .line 1082
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1083
    .line 1084
    .line 1085
    new-instance v1, Ljava/util/ArrayList;

    .line 1086
    .line 1087
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1088
    .line 1089
    .line 1090
    move-result v3

    .line 1091
    add-int/lit8 v3, v3, -0x1

    .line 1092
    .line 1093
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1094
    .line 1095
    .line 1096
    const/4 v3, 0x1

    .line 1097
    :goto_e
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1098
    .line 1099
    .line 1100
    move-result v4

    .line 1101
    if-ge v3, v4, :cond_28

    .line 1102
    .line 1103
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v4

    .line 1107
    check-cast v4, Lve2;

    .line 1108
    .line 1109
    invoke-virtual {v4}, Lve2;->a()Ljava/lang/String;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v4

    .line 1113
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v4

    .line 1120
    check-cast v4, Lve2;

    .line 1121
    .line 1122
    invoke-virtual {v4}, Lve2;->b()Ljava/lang/String;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v4

    .line 1126
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1127
    .line 1128
    .line 1129
    add-int/lit8 v3, v3, 0x1

    .line 1130
    .line 1131
    goto :goto_e

    .line 1132
    :cond_28
    invoke-virtual {v13, v8, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1133
    .line 1134
    .line 1135
    move-object/from16 v0, v32

    .line 1136
    .line 1137
    invoke-virtual {v13, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1138
    .line 1139
    .line 1140
    :cond_29
    move-object/from16 v9, v31

    .line 1141
    .line 1142
    goto/16 :goto_12

    .line 1143
    .line 1144
    :cond_2a
    move-object/from16 v31, v3

    .line 1145
    .line 1146
    move-object/from16 v29, v4

    .line 1147
    .line 1148
    move-object/from16 v20, v6

    .line 1149
    .line 1150
    move-object v0, v7

    .line 1151
    move-object/from16 v30, v9

    .line 1152
    .line 1153
    new-instance v1, Ljava/util/ArrayList;

    .line 1154
    .line 1155
    invoke-interface/range {v31 .. v31}, Ljava/util/List;->size()I

    .line 1156
    .line 1157
    .line 1158
    move-result v2

    .line 1159
    add-int/lit8 v2, v2, -0x1

    .line 1160
    .line 1161
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1162
    .line 1163
    .line 1164
    new-instance v2, Ljava/util/ArrayList;

    .line 1165
    .line 1166
    invoke-interface/range {v31 .. v31}, Ljava/util/List;->size()I

    .line 1167
    .line 1168
    .line 1169
    move-result v3

    .line 1170
    add-int/lit8 v3, v3, -0x1

    .line 1171
    .line 1172
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1173
    .line 1174
    .line 1175
    new-instance v3, Ljava/util/ArrayList;

    .line 1176
    .line 1177
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1178
    .line 1179
    .line 1180
    new-instance v4, Ljava/util/ArrayList;

    .line 1181
    .line 1182
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1183
    .line 1184
    .line 1185
    new-instance v5, Ljava/util/ArrayList;

    .line 1186
    .line 1187
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1188
    .line 1189
    .line 1190
    new-instance v6, Ljava/util/ArrayList;

    .line 1191
    .line 1192
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1193
    .line 1194
    .line 1195
    const/4 v7, 0x0

    .line 1196
    :goto_f
    invoke-interface/range {v31 .. v31}, Ljava/util/List;->size()I

    .line 1197
    .line 1198
    .line 1199
    move-result v9

    .line 1200
    if-ge v7, v9, :cond_30

    .line 1201
    .line 1202
    move-object/from16 v9, v31

    .line 1203
    .line 1204
    invoke-interface {v9, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v14

    .line 1208
    check-cast v14, Lhj;

    .line 1209
    .line 1210
    iget-object v15, v14, Lhj;->a:Lzx1;

    .line 1211
    .line 1212
    move-object/from16 v32, v0

    .line 1213
    .line 1214
    iget-object v0, v15, Lzx1;->h:Ljava/lang/String;

    .line 1215
    .line 1216
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 1217
    .line 1218
    .line 1219
    move-result v0

    .line 1220
    if-nez v0, :cond_2b

    .line 1221
    .line 1222
    iget-object v0, v15, Lzx1;->h:Ljava/lang/String;

    .line 1223
    .line 1224
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1225
    .line 1226
    .line 1227
    :cond_2b
    iget-object v0, v14, Lhj;->b:Ljava/lang/String;

    .line 1228
    .line 1229
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1230
    .line 1231
    .line 1232
    iget-object v0, v15, Lzx1;->i:Ljava/lang/String;

    .line 1233
    .line 1234
    iget-object v14, v15, Lzx1;->k:Ljava/util/ArrayList;

    .line 1235
    .line 1236
    if-eqz v14, :cond_2d

    .line 1237
    .line 1238
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1239
    .line 1240
    .line 1241
    move-result v14

    .line 1242
    if-nez v14, :cond_2d

    .line 1243
    .line 1244
    iget-object v14, v15, Lzx1;->k:Ljava/util/ArrayList;

    .line 1245
    .line 1246
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v14

    .line 1250
    :goto_10
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 1251
    .line 1252
    .line 1253
    move-result v15

    .line 1254
    if-eqz v15, :cond_2d

    .line 1255
    .line 1256
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v15

    .line 1260
    check-cast v15, Lyx1;

    .line 1261
    .line 1262
    move-object/from16 v24, v0

    .line 1263
    .line 1264
    iget-object v0, v15, Lyx1;->d:Ljava/lang/String;

    .line 1265
    .line 1266
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1267
    .line 1268
    .line 1269
    move-result v0

    .line 1270
    if-nez v0, :cond_2c

    .line 1271
    .line 1272
    iget-object v0, v15, Lyx1;->d:Ljava/lang/String;

    .line 1273
    .line 1274
    goto :goto_11

    .line 1275
    :cond_2c
    move-object/from16 v0, v24

    .line 1276
    .line 1277
    goto :goto_10

    .line 1278
    :cond_2d
    move-object/from16 v24, v0

    .line 1279
    .line 1280
    move-object/from16 v0, v24

    .line 1281
    .line 1282
    :goto_11
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1283
    .line 1284
    .line 1285
    move-result v14

    .line 1286
    if-nez v14, :cond_2e

    .line 1287
    .line 1288
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1289
    .line 1290
    .line 1291
    :cond_2e
    if-lez v7, :cond_2f

    .line 1292
    .line 1293
    invoke-interface {v9, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v0

    .line 1297
    check-cast v0, Lhj;

    .line 1298
    .line 1299
    iget-object v0, v0, Lhj;->a:Lzx1;

    .line 1300
    .line 1301
    iget-object v0, v0, Lzx1;->c:Ljava/lang/String;

    .line 1302
    .line 1303
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1304
    .line 1305
    .line 1306
    invoke-interface {v9, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v0

    .line 1310
    check-cast v0, Lhj;

    .line 1311
    .line 1312
    iget-object v0, v0, Lhj;->a:Lzx1;

    .line 1313
    .line 1314
    iget-object v0, v0, Lzx1;->d:Ljava/lang/String;

    .line 1315
    .line 1316
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1317
    .line 1318
    .line 1319
    :cond_2f
    add-int/lit8 v7, v7, 0x1

    .line 1320
    .line 1321
    move-object/from16 v31, v9

    .line 1322
    .line 1323
    move-object/from16 v0, v32

    .line 1324
    .line 1325
    goto/16 :goto_f

    .line 1326
    .line 1327
    :cond_30
    move-object/from16 v32, v0

    .line 1328
    .line 1329
    move-object/from16 v9, v31

    .line 1330
    .line 1331
    invoke-virtual {v13, v12, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1332
    .line 1333
    .line 1334
    const-string v0, "AUTO_PAY_BALANCE_THRESHOLD_LIST"

    .line 1335
    .line 1336
    invoke-virtual {v13, v0, v6}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1340
    .line 1341
    .line 1342
    move-result v0

    .line 1343
    if-nez v0, :cond_31

    .line 1344
    .line 1345
    invoke-virtual {v13, v11, v3}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1346
    .line 1347
    .line 1348
    :cond_31
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1349
    .line 1350
    .line 1351
    move-result v0

    .line 1352
    if-nez v0, :cond_32

    .line 1353
    .line 1354
    invoke-virtual {v13, v10, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1355
    .line 1356
    .line 1357
    :cond_32
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1358
    .line 1359
    .line 1360
    move-result v0

    .line 1361
    if-nez v0, :cond_33

    .line 1362
    .line 1363
    invoke-virtual {v13, v8, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1364
    .line 1365
    .line 1366
    move-object/from16 v0, v32

    .line 1367
    .line 1368
    invoke-virtual {v13, v0, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1369
    .line 1370
    .line 1371
    :cond_33
    :goto_12
    invoke-virtual {v13, v12}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1372
    .line 1373
    .line 1374
    move-result v0

    .line 1375
    move-object/from16 v1, p0

    .line 1376
    .line 1377
    if-eqz v0, :cond_35

    .line 1378
    .line 1379
    iget-boolean v0, v1, Lej;->o:Z

    .line 1380
    .line 1381
    if-eqz v0, :cond_34

    .line 1382
    .line 1383
    goto :goto_13

    .line 1384
    :cond_34
    sget-object v0, Lkf3;->n:Lkj;

    .line 1385
    .line 1386
    const/16 v2, 0x15

    .line 1387
    .line 1388
    const/4 v3, 0x2

    .line 1389
    invoke-virtual {v1, v2, v3, v0}, Lej;->x(IILkj;)V

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual {v1, v0}, Lej;->A(Lkj;)V

    .line 1393
    .line 1394
    .line 1395
    return-object v0

    .line 1396
    :cond_35
    :goto_13
    const-string v0, "skuPackageName"

    .line 1397
    .line 1398
    if-eqz v29, :cond_36

    .line 1399
    .line 1400
    move-object/from16 v4, v29

    .line 1401
    .line 1402
    iget-object v2, v4, Lve2;->b:Lorg/json/JSONObject;

    .line 1403
    .line 1404
    move-object/from16 v3, v30

    .line 1405
    .line 1406
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v2

    .line 1410
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1411
    .line 1412
    .line 1413
    move-result v2

    .line 1414
    if-nez v2, :cond_37

    .line 1415
    .line 1416
    iget-object v2, v4, Lve2;->b:Lorg/json/JSONObject;

    .line 1417
    .line 1418
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v2

    .line 1422
    invoke-virtual {v13, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1423
    .line 1424
    .line 1425
    :goto_14
    const/4 v8, 0x1

    .line 1426
    :goto_15
    const/4 v10, 0x0

    .line 1427
    goto :goto_16

    .line 1428
    :cond_36
    move-object/from16 v3, v30

    .line 1429
    .line 1430
    :cond_37
    if-eqz v20, :cond_38

    .line 1431
    .line 1432
    move-object/from16 v6, v20

    .line 1433
    .line 1434
    iget-object v2, v6, Lhj;->a:Lzx1;

    .line 1435
    .line 1436
    iget-object v2, v2, Lzx1;->b:Lorg/json/JSONObject;

    .line 1437
    .line 1438
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v2

    .line 1442
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1443
    .line 1444
    .line 1445
    move-result v2

    .line 1446
    if-nez v2, :cond_38

    .line 1447
    .line 1448
    iget-object v2, v6, Lhj;->a:Lzx1;

    .line 1449
    .line 1450
    iget-object v2, v2, Lzx1;->b:Lorg/json/JSONObject;

    .line 1451
    .line 1452
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v2

    .line 1456
    invoke-virtual {v13, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1457
    .line 1458
    .line 1459
    goto :goto_14

    .line 1460
    :cond_38
    const/4 v8, 0x0

    .line 1461
    goto :goto_15

    .line 1462
    :goto_16
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1463
    .line 1464
    .line 1465
    move-result v0

    .line 1466
    if-nez v0, :cond_39

    .line 1467
    .line 1468
    const-string v0, "accountName"

    .line 1469
    .line 1470
    invoke-virtual {v13, v0, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1471
    .line 1472
    .line 1473
    :cond_39
    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v0

    .line 1477
    if-nez v0, :cond_3a

    .line 1478
    .line 1479
    const-string v0, "Activity\'s intent is null."

    .line 1480
    .line 1481
    move-object/from16 v7, v23

    .line 1482
    .line 1483
    invoke-static {v7, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 1484
    .line 1485
    .line 1486
    goto :goto_17

    .line 1487
    :cond_3a
    move-object/from16 v7, v23

    .line 1488
    .line 1489
    const-string v2, "PROXY_PACKAGE"

    .line 1490
    .line 1491
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v3

    .line 1495
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1496
    .line 1497
    .line 1498
    move-result v3

    .line 1499
    if-nez v3, :cond_3b

    .line 1500
    .line 1501
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v0

    .line 1505
    const-string v2, "proxyPackage"

    .line 1506
    .line 1507
    invoke-virtual {v13, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1508
    .line 1509
    .line 1510
    :try_start_0
    iget-object v2, v1, Lej;->f:Landroid/content/Context;

    .line 1511
    .line 1512
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v2

    .line 1516
    const/4 v3, 0x0

    .line 1517
    invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v0

    .line 1521
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1522
    .line 1523
    move-object/from16 v2, v22

    .line 1524
    .line 1525
    :try_start_1
    invoke-virtual {v13, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1526
    .line 1527
    .line 1528
    goto :goto_17

    .line 1529
    :catch_0
    move-object/from16 v2, v22

    .line 1530
    .line 1531
    :catch_1
    const-string v0, "package not found"

    .line 1532
    .line 1533
    invoke-virtual {v13, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1534
    .line 1535
    .line 1536
    :cond_3b
    :goto_17
    iget-boolean v0, v1, Lej;->r:Z

    .line 1537
    .line 1538
    if-eqz v0, :cond_3c

    .line 1539
    .line 1540
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 1541
    .line 1542
    .line 1543
    move-result v0

    .line 1544
    if-nez v0, :cond_3c

    .line 1545
    .line 1546
    const/16 v15, 0x11

    .line 1547
    .line 1548
    :goto_18
    move v2, v15

    .line 1549
    goto :goto_19

    .line 1550
    :cond_3c
    iget-boolean v0, v1, Lej;->p:Z

    .line 1551
    .line 1552
    if-eqz v0, :cond_3d

    .line 1553
    .line 1554
    if-eqz v8, :cond_3d

    .line 1555
    .line 1556
    const/16 v15, 0xf

    .line 1557
    .line 1558
    goto :goto_18

    .line 1559
    :cond_3d
    iget-boolean v0, v1, Lej;->m:Z

    .line 1560
    .line 1561
    if-eqz v0, :cond_3e

    .line 1562
    .line 1563
    const/16 v2, 0x9

    .line 1564
    .line 1565
    goto :goto_19

    .line 1566
    :cond_3e
    const/4 v15, 0x6

    .line 1567
    goto :goto_18

    .line 1568
    :goto_19
    new-instance v0, Lvd3;

    .line 1569
    .line 1570
    move-object/from16 v5, p2

    .line 1571
    .line 1572
    move-object v6, v13

    .line 1573
    move-object/from16 v3, v18

    .line 1574
    .line 1575
    move-object/from16 v4, v19

    .line 1576
    .line 1577
    invoke-direct/range {v0 .. v6}, Lvd3;-><init>(Lej;ILjava/lang/String;Ljava/lang/String;Lij;Landroid/os/Bundle;)V

    .line 1578
    .line 1579
    .line 1580
    iget-object v2, v1, Lej;->d:Landroid/os/Handler;

    .line 1581
    .line 1582
    invoke-virtual {v1}, Lej;->l()Ljava/util/concurrent/ExecutorService;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v27

    .line 1586
    const-wide/16 v23, 0x1388

    .line 1587
    .line 1588
    const/16 v25, 0x0

    .line 1589
    .line 1590
    move-object/from16 v22, v0

    .line 1591
    .line 1592
    move-object/from16 v26, v2

    .line 1593
    .line 1594
    invoke-static/range {v22 .. v27}, Lej;->h(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v0

    .line 1598
    const/4 v2, 0x2

    .line 1599
    goto :goto_1a

    .line 1600
    :cond_3f
    move-object/from16 v10, v16

    .line 1601
    .line 1602
    move-object/from16 v3, v18

    .line 1603
    .line 1604
    move-object/from16 v4, v19

    .line 1605
    .line 1606
    move-object/from16 v7, v23

    .line 1607
    .line 1608
    new-instance v11, Lkd3;

    .line 1609
    .line 1610
    const/4 v2, 0x2

    .line 1611
    invoke-direct {v11, v1, v3, v4, v2}, Lkd3;-><init>(Lej;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1612
    .line 1613
    .line 1614
    iget-object v15, v1, Lej;->d:Landroid/os/Handler;

    .line 1615
    .line 1616
    invoke-virtual {v1}, Lej;->l()Ljava/util/concurrent/ExecutorService;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v16

    .line 1620
    const-wide/16 v12, 0x1388

    .line 1621
    .line 1622
    const/4 v14, 0x0

    .line 1623
    invoke-static/range {v11 .. v16}, Lej;->h(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v0

    .line 1627
    :goto_1a
    if-nez v0, :cond_40

    .line 1628
    .line 1629
    :try_start_2
    sget-object v0, Lkf3;->c:Lkj;

    .line 1630
    .line 1631
    const/16 v3, 0x19

    .line 1632
    .line 1633
    invoke-virtual {v1, v3, v2, v0}, Lej;->x(IILkj;)V

    .line 1634
    .line 1635
    .line 1636
    invoke-virtual {v1, v0}, Lej;->A(Lkj;)V

    .line 1637
    .line 1638
    .line 1639
    return-object v0

    .line 1640
    :catch_2
    move-exception v0

    .line 1641
    goto/16 :goto_20

    .line 1642
    .line 1643
    :catch_3
    move-exception v0

    .line 1644
    goto/16 :goto_21

    .line 1645
    .line 1646
    :catch_4
    move-exception v0

    .line 1647
    goto/16 :goto_21

    .line 1648
    .line 1649
    :cond_40
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1650
    .line 1651
    const-wide/16 v3, 0x1388

    .line 1652
    .line 1653
    invoke-interface {v0, v3, v4, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 1654
    .line 1655
    .line 1656
    move-result-object v0

    .line 1657
    move-object v2, v0

    .line 1658
    check-cast v2, Landroid/os/Bundle;

    .line 1659
    .line 1660
    invoke-static {v2, v7}, Lcom/google/android/gms/internal/play_billing/zze;->zzb(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 1661
    .line 1662
    .line 1663
    move-result v0

    .line 1664
    invoke-static {v2, v7}, Lcom/google/android/gms/internal/play_billing/zze;->zzh(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v3

    .line 1668
    if-eqz v0, :cond_46

    .line 1669
    .line 1670
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1671
    .line 1672
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1673
    .line 1674
    .line 1675
    const-string v5, "Unable to buy item, Error response code: "

    .line 1676
    .line 1677
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1678
    .line 1679
    .line 1680
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1681
    .line 1682
    .line 1683
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v4

    .line 1687
    invoke-static {v7, v4}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 1688
    .line 1689
    .line 1690
    invoke-static {v0, v3}, Lkf3;->a(ILjava/lang/String;)Lkj;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v3
    :try_end_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 1694
    if-nez v2, :cond_41

    .line 1695
    .line 1696
    :goto_1b
    const/4 v4, 0x1

    .line 1697
    const/4 v8, 0x1

    .line 1698
    goto :goto_1d

    .line 1699
    :cond_41
    :try_start_3
    const-string v0, "LOG_REASON"

    .line 1700
    .line 1701
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v0

    .line 1705
    if-nez v0, :cond_42

    .line 1706
    .line 1707
    goto :goto_1b

    .line 1708
    :cond_42
    instance-of v4, v0, Ljava/lang/Integer;

    .line 1709
    .line 1710
    if-eqz v4, :cond_43

    .line 1711
    .line 1712
    check-cast v0, Ljava/lang/Integer;

    .line 1713
    .line 1714
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1715
    .line 1716
    .line 1717
    move-result v0

    .line 1718
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/zzkg;->zza(I)I

    .line 1719
    .line 1720
    .line 1721
    move-result v8

    .line 1722
    const/4 v4, 0x1

    .line 1723
    goto :goto_1d

    .line 1724
    :catchall_0
    move-exception v0

    .line 1725
    goto :goto_1c

    .line 1726
    :cond_43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1727
    .line 1728
    .line 1729
    move-result-object v0

    .line 1730
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1731
    .line 1732
    .line 1733
    move-result-object v0

    .line 1734
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1735
    .line 1736
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1737
    .line 1738
    .line 1739
    const-string v5, "Unexpected type for bundle log reason: "

    .line 1740
    .line 1741
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1742
    .line 1743
    .line 1744
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1745
    .line 1746
    .line 1747
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v0

    .line 1751
    invoke-static {v7, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1752
    .line 1753
    .line 1754
    goto :goto_1b

    .line 1755
    :goto_1c
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v0

    .line 1759
    const-string v4, "Failed to get log reason from bundle: "

    .line 1760
    .line 1761
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v0

    .line 1765
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v0

    .line 1769
    invoke-static {v7, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 1770
    .line 1771
    .line 1772
    goto :goto_1b

    .line 1773
    :goto_1d
    if-ne v8, v4, :cond_44

    .line 1774
    .line 1775
    const/16 v8, 0x17

    .line 1776
    .line 1777
    :cond_44
    if-nez v2, :cond_45

    .line 1778
    .line 1779
    :goto_1e
    const/4 v2, 0x2

    .line 1780
    goto :goto_1f

    .line 1781
    :cond_45
    :try_start_5
    const-string v0, "ADDITIONAL_LOG_DETAILS"

    .line 1782
    .line 1783
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v10
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 1787
    goto :goto_1e

    .line 1788
    :catchall_1
    move-exception v0

    .line 1789
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v0

    .line 1793
    const-string v2, "Failed to get additional log details from bundle: "

    .line 1794
    .line 1795
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v0

    .line 1799
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1800
    .line 1801
    .line 1802
    move-result-object v0

    .line 1803
    invoke-static {v7, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 1804
    .line 1805
    .line 1806
    goto :goto_1e

    .line 1807
    :goto_1f
    invoke-virtual {v1, v8, v2, v3, v10}, Lej;->y(IILkj;Ljava/lang/String;)V

    .line 1808
    .line 1809
    .line 1810
    invoke-virtual {v1, v3}, Lej;->A(Lkj;)V

    .line 1811
    .line 1812
    .line 1813
    return-object v3

    .line 1814
    :cond_46
    new-instance v0, Landroid/content/Intent;

    .line 1815
    .line 1816
    const-class v3, Lcom/android/billingclient/api/ProxyBillingActivity;

    .line 1817
    .line 1818
    move-object/from16 v4, p1

    .line 1819
    .line 1820
    invoke-direct {v0, v4, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1821
    .line 1822
    .line 1823
    move-object/from16 v3, v21

    .line 1824
    .line 1825
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v2

    .line 1829
    check-cast v2, Landroid/app/PendingIntent;

    .line 1830
    .line 1831
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1832
    .line 1833
    .line 1834
    invoke-virtual {v4, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_6
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 1835
    .line 1836
    .line 1837
    sget-object v0, Lkf3;->i:Lkj;

    .line 1838
    .line 1839
    return-object v0

    .line 1840
    :goto_20
    const-string v2, "Exception while launching billing flow. Try to reconnect"

    .line 1841
    .line 1842
    invoke-static {v7, v2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1843
    .line 1844
    .line 1845
    sget-object v2, Lkf3;->j:Lkj;

    .line 1846
    .line 1847
    invoke-static {v0}, Lif3;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v0

    .line 1851
    const/4 v3, 0x2

    .line 1852
    const/4 v11, 0x5

    .line 1853
    invoke-virtual {v1, v11, v3, v2, v0}, Lej;->y(IILkj;Ljava/lang/String;)V

    .line 1854
    .line 1855
    .line 1856
    invoke-virtual {v1, v2}, Lej;->A(Lkj;)V

    .line 1857
    .line 1858
    .line 1859
    return-object v2

    .line 1860
    :goto_21
    const-string v2, "Time out while launching billing flow. Try to reconnect"

    .line 1861
    .line 1862
    invoke-static {v7, v2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1863
    .line 1864
    .line 1865
    sget-object v2, Lkf3;->k:Lkj;

    .line 1866
    .line 1867
    invoke-static {v0}, Lif3;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v0

    .line 1871
    const/4 v3, 0x4

    .line 1872
    const/4 v4, 0x2

    .line 1873
    invoke-virtual {v1, v3, v4, v2, v0}, Lej;->y(IILkj;Ljava/lang/String;)V

    .line 1874
    .line 1875
    .line 1876
    invoke-virtual {v1, v2}, Lej;->A(Lkj;)V

    .line 1877
    .line 1878
    .line 1879
    return-object v2

    .line 1880
    :cond_47
    move v4, v9

    .line 1881
    move-object v7, v10

    .line 1882
    const-string v0, "Current client doesn\'t support extra params for buy intent."

    .line 1883
    .line 1884
    invoke-static {v7, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 1885
    .line 1886
    .line 1887
    sget-object v0, Lkf3;->g:Lkj;

    .line 1888
    .line 1889
    const/16 v2, 0x12

    .line 1890
    .line 1891
    invoke-virtual {v1, v2, v4, v0}, Lej;->x(IILkj;)V

    .line 1892
    .line 1893
    .line 1894
    invoke-virtual {v1, v0}, Lej;->A(Lkj;)V

    .line 1895
    .line 1896
    .line 1897
    return-object v0

    .line 1898
    :cond_48
    move v4, v9

    .line 1899
    sget-object v0, Lkf3;->r:Lkj;

    .line 1900
    .line 1901
    const/16 v2, 0xc

    .line 1902
    .line 1903
    invoke-virtual {v1, v2, v4, v0}, Lej;->x(IILkj;)V

    .line 1904
    .line 1905
    .line 1906
    return-object v0
.end method

.method public e(Lfs0;Lcom/supercell/titan/g;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lej;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x7

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p1, Lkf3;->j:Lkj;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-virtual {p0, v0, v1, p1}, Lej;->x(IILkj;)V

    .line 12
    .line 13
    .line 14
    new-instance p0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, p1, p0}, Lcom/supercell/titan/g;->a(Lkj;Ljava/util/ArrayList;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-boolean v0, p0, Lej;->r:Z

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-string p1, "BillingClient"

    .line 28
    .line 29
    const-string v0, "Querying product details is not supported."

    .line 30
    .line 31
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Lkf3;->o:Lkj;

    .line 35
    .line 36
    const/16 v0, 0x14

    .line 37
    .line 38
    invoke-virtual {p0, v0, v1, p1}, Lej;->x(IILkj;)V

    .line 39
    .line 40
    .line 41
    new-instance p0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, p1, p0}, Lcom/supercell/titan/g;->a(Lkj;Ljava/util/ArrayList;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    new-instance v2, Lkd3;

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    invoke-direct {v2, p0, p1, p2, v0}, Lkd3;-><init>(Lej;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    new-instance v5, Ldp0;

    .line 57
    .line 58
    const/16 p1, 0x18

    .line 59
    .line 60
    invoke-direct {v5, p1, p0, p2}, Ldp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lej;->u()Landroid/os/Handler;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {p0}, Lej;->l()Ljava/util/concurrent/ExecutorService;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    const-wide/16 v3, 0x7530

    .line 72
    .line 73
    invoke-static/range {v2 .. v7}, Lej;->h(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-nez p1, :cond_2

    .line 78
    .line 79
    invoke-virtual {p0}, Lej;->i()Lkj;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const/16 v0, 0x19

    .line 84
    .line 85
    invoke-virtual {p0, v0, v1, p1}, Lej;->x(IILkj;)V

    .line 86
    .line 87
    .line 88
    new-instance p0, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, p1, p0}, Lcom/supercell/titan/g;->a(Lkj;Ljava/util/ArrayList;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    return-void
.end method

.method public f(Lwe2;Lcom/supercell/titan/h;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lej;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/16 v2, 0x8

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object p1, Lkf3;->j:Lkj;

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    invoke-virtual {p0, v0, v2, p1}, Lej;->x(IILkj;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, p1, v1}, Lcom/supercell/titan/h;->a(Lkj;Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p1, Lwe2;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    iget-object p1, p1, Lwe2;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    const-string p1, "Please fix the input params. SKU type can\'t be empty."

    .line 35
    .line 36
    const-string v0, "BillingClient"

    .line 37
    .line 38
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    sget-object p1, Lkf3;->e:Lkj;

    .line 42
    .line 43
    const/16 v0, 0x31

    .line 44
    .line 45
    invoke-virtual {p0, v0, v2, p1}, Lej;->x(IILkj;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, p1, v1}, Lcom/supercell/titan/h;->a(Lkj;Ljava/util/List;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    new-instance v3, Lpj3;

    .line 53
    .line 54
    invoke-direct {v3, p0, v0, p1, p2}, Lpj3;-><init>(Lej;Ljava/lang/String;Ljava/util/ArrayList;Lcom/supercell/titan/h;)V

    .line 55
    .line 56
    .line 57
    new-instance v6, Lcp0;

    .line 58
    .line 59
    const/16 p1, 0x16

    .line 60
    .line 61
    invoke-direct {v6, p1, p0, p2}, Lcp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lej;->u()Landroid/os/Handler;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-virtual {p0}, Lej;->l()Ljava/util/concurrent/ExecutorService;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    const-wide/16 v4, 0x7530

    .line 73
    .line 74
    invoke-static/range {v3 .. v8}, Lej;->h(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-nez p1, :cond_2

    .line 79
    .line 80
    invoke-virtual {p0}, Lej;->i()Lkj;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const/16 v0, 0x19

    .line 85
    .line 86
    invoke-virtual {p0, v0, v2, p1}, Lej;->x(IILkj;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2, p1, v1}, Lcom/supercell/titan/h;->a(Lkj;Ljava/util/List;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    return-void
.end method

.method public g(Lfj;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lej;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lej;->c()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lej;->v()Lkj;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    monitor-exit v0

    .line 15
    goto/16 :goto_3

    .line 16
    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_0
    iget v1, p0, Lej;->b:I

    .line 21
    .line 22
    const/4 v2, 0x6

    .line 23
    const/4 v3, 0x1

    .line 24
    if-ne v1, v3, :cond_1

    .line 25
    .line 26
    const-string v1, "BillingClient"

    .line 27
    .line 28
    const-string v3, "Client is already in the process of connecting to billing service."

    .line 29
    .line 30
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sget-object v1, Lkf3;->d:Lkj;

    .line 34
    .line 35
    const/16 v3, 0x25

    .line 36
    .line 37
    invoke-virtual {p0, v3, v2, v1}, Lej;->x(IILkj;)V

    .line 38
    .line 39
    .line 40
    monitor-exit v0

    .line 41
    :goto_0
    move-object p0, v1

    .line 42
    goto/16 :goto_3

    .line 43
    .line 44
    :cond_1
    iget v1, p0, Lej;->b:I

    .line 45
    .line 46
    const/4 v4, 0x3

    .line 47
    if-ne v1, v4, :cond_2

    .line 48
    .line 49
    const-string v1, "BillingClient"

    .line 50
    .line 51
    const-string v3, "Client was already closed and can\'t be reused. Please create another instance."

    .line 52
    .line 53
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sget-object v1, Lkf3;->j:Lkj;

    .line 57
    .line 58
    const/16 v3, 0x26

    .line 59
    .line 60
    invoke-virtual {p0, v3, v2, v1}, Lej;->x(IILkj;)V

    .line 61
    .line 62
    .line 63
    monitor-exit v0

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-virtual {p0, v3}, Lej;->o(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lej;->p()V

    .line 69
    .line 70
    .line 71
    const-string v1, "BillingClient"

    .line 72
    .line 73
    const-string v4, "Starting in-app billing setup."

    .line 74
    .line 75
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    new-instance v1, Lne3;

    .line 79
    .line 80
    invoke-direct {v1, p0, p1}, Lne3;-><init>(Lej;Lfj;)V

    .line 81
    .line 82
    .line 83
    iput-object v1, p0, Lej;->i:Lne3;

    .line 84
    .line 85
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    new-instance v0, Landroid/content/Intent;

    .line 87
    .line 88
    const-string v1, "com.android.vending.billing.InAppBillingService.BIND"

    .line 89
    .line 90
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const-string v1, "com.android.vending"

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Lej;->f:Landroid/content/Context;

    .line 99
    .line 100
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    const/4 v4, 0x0

    .line 105
    invoke-virtual {v1, v0, v4}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    const/16 v5, 0x29

    .line 110
    .line 111
    if-eqz v1, :cond_8

    .line 112
    .line 113
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-nez v6, :cond_8

    .line 118
    .line 119
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    check-cast v1, Landroid/content/pm/ResolveInfo;

    .line 124
    .line 125
    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 126
    .line 127
    const/16 v5, 0x28

    .line 128
    .line 129
    if-eqz v1, :cond_7

    .line 130
    .line 131
    iget-object v6, v1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 132
    .line 133
    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 134
    .line 135
    const-string v7, "com.android.vending"

    .line 136
    .line 137
    invoke-static {v6, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    if-eqz v7, :cond_6

    .line 142
    .line 143
    if-eqz v1, :cond_6

    .line 144
    .line 145
    new-instance v5, Landroid/content/ComponentName;

    .line 146
    .line 147
    invoke-direct {v5, v6, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    new-instance v1, Landroid/content/Intent;

    .line 151
    .line 152
    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v5}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 156
    .line 157
    .line 158
    iget-object v0, p0, Lej;->c:Ljava/lang/String;

    .line 159
    .line 160
    const-string v5, "playBillingLibraryVersion"

    .line 161
    .line 162
    invoke-virtual {v1, v5, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Lej;->a:Ljava/lang/Object;

    .line 166
    .line 167
    monitor-enter v0

    .line 168
    :try_start_1
    iget v5, p0, Lej;->b:I

    .line 169
    .line 170
    const/4 v6, 0x2

    .line 171
    if-ne v5, v6, :cond_3

    .line 172
    .line 173
    invoke-virtual {p0}, Lej;->v()Lkj;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    monitor-exit v0

    .line 178
    goto :goto_3

    .line 179
    :catchall_1
    move-exception p0

    .line 180
    goto :goto_1

    .line 181
    :cond_3
    iget v5, p0, Lej;->b:I

    .line 182
    .line 183
    if-eq v5, v3, :cond_4

    .line 184
    .line 185
    const-string v1, "BillingClient"

    .line 186
    .line 187
    const-string v3, "Client state no longer CONNECTING, returning service disconnected."

    .line 188
    .line 189
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    sget-object v1, Lkf3;->j:Lkj;

    .line 193
    .line 194
    const/16 v3, 0x75

    .line 195
    .line 196
    invoke-virtual {p0, v3, v2, v1}, Lej;->x(IILkj;)V

    .line 197
    .line 198
    .line 199
    monitor-exit v0

    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :cond_4
    iget-object v5, p0, Lej;->i:Lne3;

    .line 203
    .line 204
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 205
    iget-object v0, p0, Lej;->f:Landroid/content/Context;

    .line 206
    .line 207
    invoke-virtual {v0, v1, v5, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_5

    .line 212
    .line 213
    const-string p0, "BillingClient"

    .line 214
    .line 215
    const-string v0, "Service was bonded successfully."

    .line 216
    .line 217
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    const/4 p0, 0x0

    .line 221
    goto :goto_3

    .line 222
    :cond_5
    const-string v0, "BillingClient"

    .line 223
    .line 224
    const-string v1, "Connection to Billing service is blocked."

    .line 225
    .line 226
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    const/16 v5, 0x27

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 233
    throw p0

    .line 234
    :cond_6
    const-string v0, "BillingClient"

    .line 235
    .line 236
    const-string v1, "The device doesn\'t have valid Play Store."

    .line 237
    .line 238
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_7
    const-string v0, "BillingClient"

    .line 243
    .line 244
    const-string v1, "The device doesn\'t have valid Play Store."

    .line 245
    .line 246
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    :cond_8
    :goto_2
    invoke-virtual {p0, v4}, Lej;->o(I)V

    .line 250
    .line 251
    .line 252
    const-string v0, "BillingClient"

    .line 253
    .line 254
    const-string v1, "Billing service unavailable on device."

    .line 255
    .line 256
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    sget-object v0, Lkf3;->b:Lkj;

    .line 260
    .line 261
    invoke-virtual {p0, v5, v2, v0}, Lej;->x(IILkj;)V

    .line 262
    .line 263
    .line 264
    move-object p0, v0

    .line 265
    :goto_3
    if-eqz p0, :cond_9

    .line 266
    .line 267
    invoke-interface {p1, p0}, Lfj;->onBillingSetupFinished(Lkj;)V

    .line 268
    .line 269
    .line 270
    :cond_9
    return-void

    .line 271
    :goto_4
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 272
    throw p0
.end method

.method public final i()Lkj;
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    filled-new-array {v1, v0}, [I

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v2, p0, Lej;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v2

    .line 10
    :goto_0
    const/4 v3, 0x2

    .line 11
    if-ge v1, v3, :cond_1

    .line 12
    .line 13
    :try_start_0
    aget v3, v0, v1

    .line 14
    .line 15
    iget v4, p0, Lej;->b:I

    .line 16
    .line 17
    if-ne v4, v3, :cond_0

    .line 18
    .line 19
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    sget-object p0, Lkf3;->j:Lkj;

    .line 21
    .line 22
    return-object p0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    sget-object p0, Lkf3;->h:Lkj;

    .line 30
    .line 31
    return-object p0

    .line 32
    :goto_1
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    throw p0
.end method

.method public final j()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object p0, p0, Lej;->f:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final declared-synchronized l()Ljava/util/concurrent/ExecutorService;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lej;->y:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget v0, Lcom/google/android/gms/internal/play_billing/zze;->zza:I

    .line 7
    .line 8
    new-instance v1, Lhl1;

    .line 9
    .line 10
    invoke-direct {v1}, Lhl1;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lej;->y:Ljava/util/concurrent/ExecutorService;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    iget-object v0, p0, Lej;->y:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    monitor-exit p0

    .line 25
    return-object v0

    .line 26
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw v0
.end method

.method public final m(Lcom/google/android/gms/internal/play_billing/zzjz;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lej;->g:Lwe2;

    .line 2
    .line 3
    iget p0, p0, Lej;->k:I

    .line 4
    .line 5
    invoke-virtual {v0, p1, p0}, Lwe2;->u(Lcom/google/android/gms/internal/play_billing/zzjz;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    const-string p1, "BillingClient"

    .line 11
    .line 12
    const-string v0, "Unable to log."

    .line 13
    .line 14
    invoke-static {p1, v0, p0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final n(Lcom/google/android/gms/internal/play_billing/zzkd;)V
    .locals 3

    .line 1
    const-string v0, "Unable to log."

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lej;->g:Lwe2;

    .line 4
    .line 5
    iget p0, p0, Lej;->k:I

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    .line 9
    .line 10
    :try_start_1
    iget-object v2, v1, Lwe2;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lcom/google/android/gms/internal/play_billing/zzku;

    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/zzhk;->zzn()Lcom/google/android/gms/internal/play_billing/zzhg;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lcom/google/android/gms/internal/play_billing/zzks;

    .line 19
    .line 20
    invoke-virtual {v2, p0}, Lcom/google/android/gms/internal/play_billing/zzks;->zza(I)Lcom/google/android/gms/internal/play_billing/zzks;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lcom/google/android/gms/internal/play_billing/zzku;

    .line 28
    .line 29
    iput-object p0, v1, Lwe2;->c:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Lwe2;->v(Lcom/google/android/gms/internal/play_billing/zzkd;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    :try_start_2
    const-string p1, "BillingLogger"

    .line 37
    .line 38
    invoke-static {p1, v0, p0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_1
    move-exception p0

    .line 43
    const-string p1, "BillingClient"

    .line 44
    .line 45
    invoke-static {p1, v0, p0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final o(I)V
    .locals 6

    .line 1
    const-string v0, "Setting clientState from "

    .line 2
    .line 3
    iget-object v1, p0, Lej;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget v2, p0, Lej;->b:I

    .line 7
    .line 8
    const/4 v3, 0x3

    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    monitor-exit v1

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    goto :goto_2

    .line 15
    :cond_0
    const-string v2, "BillingClient"

    .line 16
    .line 17
    iget v3, p0, Lej;->b:I

    .line 18
    .line 19
    const/4 v4, 0x2

    .line 20
    const/4 v5, 0x1

    .line 21
    if-eqz v3, :cond_3

    .line 22
    .line 23
    if-eq v3, v5, :cond_2

    .line 24
    .line 25
    if-eq v3, v4, :cond_1

    .line 26
    .line 27
    const-string v3, "CLOSED"

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const-string v3, "CONNECTED"

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const-string v3, "CONNECTING"

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    const-string v3, "DISCONNECTED"

    .line 37
    .line 38
    :goto_0
    if-eqz p1, :cond_6

    .line 39
    .line 40
    if-eq p1, v5, :cond_5

    .line 41
    .line 42
    if-eq p1, v4, :cond_4

    .line 43
    .line 44
    const-string v4, "CLOSED"

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_4
    const-string v4, "CONNECTED"

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_5
    const-string v4, "CONNECTING"

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_6
    const-string v4, "DISCONNECTED"

    .line 54
    .line 55
    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, " to "

    .line 64
    .line 65
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iput p1, p0, Lej;->b:I

    .line 79
    .line 80
    monitor-exit v1

    .line 81
    return-void

    .line 82
    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    throw p0
.end method

.method public final p()V
    .locals 5

    .line 1
    iget-object v0, p0, Lej;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lej;->i:Lne3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :try_start_1
    iget-object v2, p0, Lej;->f:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v3, p0, Lej;->i:Lne3;

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 14
    .line 15
    .line 16
    :try_start_2
    iput-object v1, p0, Lej;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 17
    .line 18
    iput-object v1, p0, Lej;->i:Lne3;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :catchall_1
    move-exception v2

    .line 24
    :try_start_3
    const-string v3, "BillingClient"

    .line 25
    .line 26
    const-string v4, "There was an exception while unbinding service!"

    .line 27
    .line 28
    invoke-static {v3, v4, v2}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 29
    .line 30
    .line 31
    :try_start_4
    iput-object v1, p0, Lej;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 32
    .line 33
    iput-object v1, p0, Lej;->i:Lne3;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_2
    move-exception v2

    .line 37
    iput-object v1, p0, Lej;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 38
    .line 39
    iput-object v1, p0, Lej;->i:Lne3;

    .line 40
    .line 41
    throw v2

    .line 42
    :cond_0
    :goto_0
    monitor-exit v0

    .line 43
    return-void

    .line 44
    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 45
    throw p0
.end method

.method public final q(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lbx0;
    .locals 1

    .line 1
    const-string v0, "BillingClient"

    .line 2
    .line 3
    invoke-static {v0, p3, p4}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    const/4 p3, 0x7

    .line 7
    invoke-static {p4}, Lif3;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    invoke-virtual {p0, p2, p3, p1, p4}, Lej;->y(IILkj;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance p0, Lbx0;

    .line 15
    .line 16
    iget p2, p1, Lkj;->a:I

    .line 17
    .line 18
    iget-object p1, p1, Lkj;->b:Ljava/lang/String;

    .line 19
    .line 20
    new-instance p3, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    const/4 p4, 0x6

    .line 26
    invoke-direct {p0, p2, p1, p3, p4}, Lbx0;-><init>(ILjava/lang/String;Ljava/util/ArrayList;I)V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public final r(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lwe2;
    .locals 2

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    invoke-static {p4}, Lif3;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0, p2, v0, p1, v1}, Lej;->y(IILkj;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string p0, "BillingClient"

    .line 11
    .line 12
    invoke-static {p0, p3, p4}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    new-instance p0, Lwe2;

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    const/16 p3, 0x13

    .line 19
    .line 20
    invoke-direct {p0, p3, p1, p2}, Lwe2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public final s(Lkj;ILjava/lang/String;Ljava/lang/Exception;)Lbx0;
    .locals 1

    .line 1
    const-string v0, "BillingClient"

    .line 2
    .line 3
    invoke-static {v0, p3, p4}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p4}, Lif3;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    const/16 p4, 0x8

    .line 11
    .line 12
    invoke-virtual {p0, p2, p4, p1, p3}, Lej;->y(IILkj;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance p0, Lbx0;

    .line 16
    .line 17
    iget p2, p1, Lkj;->a:I

    .line 18
    .line 19
    iget-object p1, p1, Lkj;->b:Ljava/lang/String;

    .line 20
    .line 21
    const/4 p3, 0x0

    .line 22
    invoke-direct {p0, p2, p1, p3, p4}, Lbx0;-><init>(ILjava/lang/String;Ljava/util/ArrayList;I)V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public final t(Lds0;Lkj;ILjava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    const-string p1, "BillingClient"

    .line 2
    .line 3
    invoke-static {p1, p4, p5}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x4

    .line 7
    invoke-static {p5}, Lif3;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    invoke-virtual {p0, p3, p1, p2, p4}, Lej;->y(IILkj;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget p0, p2, Lkj;->a:I

    .line 15
    .line 16
    return-void
.end method

.method public final u()Landroid/os/Handler;
    .locals 1

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lej;->d:Landroid/os/Handler;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance p0, Landroid/os/Handler;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public final v()Lkj;
    .locals 3

    .line 1
    const-string v0, "BillingClient"

    .line 2
    .line 3
    const-string v1, "Service connection is valid. No need to re-initialize."

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzkd;->zzc()Lcom/google/android/gms/internal/play_billing/zzkb;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x6

    .line 13
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/zzkb;->zzn(I)Lcom/google/android/gms/internal/play_billing/zzkb;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzlx;->zzc()Lcom/google/android/gms/internal/play_billing/zzlv;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzlv;->zza(Z)Lcom/google/android/gms/internal/play_billing/zzlv;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/zzkb;->zzm(Lcom/google/android/gms/internal/play_billing/zzlv;)Lcom/google/android/gms/internal/play_billing/zzkb;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzkd;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lej;->n(Lcom/google/android/gms/internal/play_billing/zzkd;)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkf3;->i:Lkj;

    .line 37
    .line 38
    return-object p0
.end method

.method public final w(Lpn;Lkj;ILjava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "BillingClient"

    .line 2
    .line 3
    const-string v1, "getBillingConfig got an exception."

    .line 4
    .line 5
    invoke-static {v0, v1, p4}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    const/16 v0, 0xd

    .line 9
    .line 10
    invoke-static {p4}, Lif3;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p4

    .line 14
    invoke-virtual {p0, p3, v0, p2, p4}, Lej;->y(IILkj;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    invoke-virtual {p1, p2, p0}, Lpn;->g(Lkj;Lgj;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final x(IILkj;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p1, p2, p3}, Lif3;->b(IILkj;)Lcom/google/android/gms/internal/play_billing/zzjz;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lej;->m(Lcom/google/android/gms/internal/play_billing/zzjz;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    const-string p1, "BillingClient"

    .line 11
    .line 12
    const-string p2, "Unable to log."

    .line 13
    .line 14
    invoke-static {p1, p2, p0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final y(IILkj;Ljava/lang/String;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p1, p2, p3, p4}, Lif3;->c(IILkj;Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/zzjz;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lej;->m(Lcom/google/android/gms/internal/play_billing/zzjz;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    const-string p1, "BillingClient"

    .line 11
    .line 12
    const-string p2, "Unable to log."

    .line 13
    .line 14
    invoke-static {p1, p2, p0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final z(I)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p1}, Lif3;->d(I)Lcom/google/android/gms/internal/play_billing/zzkd;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lej;->n(Lcom/google/android/gms/internal/play_billing/zzkd;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    const-string p1, "BillingClient"

    .line 11
    .line 12
    const-string v0, "Unable to log."

    .line 13
    .line 14
    invoke-static {p1, v0, p0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

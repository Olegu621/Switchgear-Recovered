.class public final Lcom/google/android/gms/internal/games_v2/zzbr;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field private static final zza:Ljava/util/concurrent/atomic/AtomicReference;


# instance fields
.field private final zzb:Landroid/app/Application;

.field private final zzc:Lcom/google/android/gms/internal/games_v2/zzau;

.field private final zzd:Lbh3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/games_v2/zzbr;->zza:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>(Landroid/app/Application;Lcom/google/android/gms/internal/games_v2/zzau;Lbh3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/games_v2/zzbr;->zzb:Landroid/app/Application;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/games_v2/zzbr;->zzc:Lcom/google/android/gms/internal/games_v2/zzau;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/games_v2/zzbr;->zzd:Lbh3;

    .line 9
    .line 10
    return-void
.end method

.method public static zza()Landroid/app/Application;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/games_v2/zzbr;->zzb()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/google/android/gms/internal/games_v2/zzbr;->zza:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/google/android/gms/internal/games_v2/zzbr;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/google/android/gms/internal/games_v2/zzbr;->zzb:Landroid/app/Application;

    .line 13
    .line 14
    return-object v0
.end method

.method public static zzb()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/games_v2/zzbr;->zza:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    const-string v1, "PlayGamesSdk has not been initialized. Ensure that PlayGamesSdk.initialize() has been called."

    .line 13
    .line 14
    invoke-static {v1, v0}, Lkb1;->p(Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static zzc(Landroid/content/Context;)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    move v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-static {v1}, Lkb1;->g(Z)V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lcom/google/android/gms/internal/games_v2/zzbr;->zza:Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lcom/google/android/gms/internal/games_v2/zzbr;

    .line 17
    .line 18
    if-nez v2, :cond_5

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    check-cast v2, Landroid/app/Application;

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move-object v2, p0

    .line 30
    check-cast v2, Landroid/app/Application;

    .line 31
    .line 32
    :goto_1
    invoke-static {v2}, Lcom/google/android/gms/internal/games_v2/zzau;->zza(Landroid/app/Application;)Lcom/google/android/gms/internal/games_v2/zzau;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {v2}, Lbh3;->b(Landroid/app/Application;)Lbh3;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    new-instance v4, Lcom/google/android/gms/internal/games_v2/zzbr;

    .line 41
    .line 42
    invoke-direct {v4, v2, p0, v3}, Lcom/google/android/gms/internal/games_v2/zzbr;-><init>(Landroid/app/Application;Lcom/google/android/gms/internal/games_v2/zzau;Lbh3;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    const/4 p0, 0x0

    .line 46
    invoke-virtual {v1, p0, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_4

    .line 51
    .line 52
    iget-object p0, v4, Lcom/google/android/gms/internal/games_v2/zzbr;->zzc:Lcom/google/android/gms/internal/games_v2/zzau;

    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/google/android/gms/internal/games_v2/zzau;->zzc()V

    .line 55
    .line 56
    .line 57
    iget-object p0, v4, Lcom/google/android/gms/internal/games_v2/zzbr;->zzd:Lbh3;

    .line 58
    .line 59
    iget-object v2, p0, Lbh3;->c:Ljava/lang/Object;

    .line 60
    .line 61
    monitor-enter v2

    .line 62
    :try_start_0
    iget-boolean v1, p0, Lbh3;->f:Z

    .line 63
    .line 64
    if-nez v1, :cond_3

    .line 65
    .line 66
    iget-object v1, p0, Lbh3;->a:Landroid/app/Application;

    .line 67
    .line 68
    iget-object v3, p0, Lbh3;->b:Ldh0;

    .line 69
    .line 70
    invoke-virtual {v1, v3}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 71
    .line 72
    .line 73
    iput-boolean v0, p0, Lbh3;->f:Z

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :catchall_0
    move-exception p0

    .line 77
    goto :goto_3

    .line 78
    :cond_3
    :goto_2
    monitor-exit v2

    .line 79
    return-void

    .line 80
    :goto_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    throw p0

    .line 82
    :cond_4
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-eqz p0, :cond_2

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-eqz p0, :cond_2

    .line 93
    .line 94
    :cond_5
    return-void
.end method

.class public final Lur0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final p:Lcom/google/android/gms/common/api/Status;

.field public static final q:Lcom/google/android/gms/common/api/Status;

.field public static final r:Ljava/lang/Object;

.field public static s:Lur0;


# instance fields
.field public a:J

.field public b:Z

.field public c:Lcom/google/android/gms/common/internal/TelemetryData;

.field public d:Lfc3;

.field public final e:Landroid/content/Context;

.field public final f:Lpr0;

.field public final g:Lwe2;

.field public final h:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public k:Lya3;

.field public final l:Lkd;

.field public final m:Lkd;

.field public final n:Lcom/google/android/gms/internal/base/zau;

.field public volatile o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const-string v2, "Sign-out occurred while this API call was in progress."

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lur0;->p:Lcom/google/android/gms/common/api/Status;

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 13
    .line 14
    const-string v2, "The user must be signed in to make this API call."

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lur0;->q:Lcom/google/android/gms/common/api/Status;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lur0;->r:Ljava/lang/Object;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/os/Looper;Landroid/content/Context;)V
    .locals 6

    .line 1
    sget-object v0, Lpr0;->d:Lpr0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x2710

    .line 7
    .line 8
    iput-wide v1, p0, Lur0;->a:J

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-boolean v1, p0, Lur0;->b:Z

    .line 12
    .line 13
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Lur0;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Lur0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 27
    .line 28
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    const/4 v4, 0x5

    .line 31
    const/high16 v5, 0x3f400000    # 0.75f

    .line 32
    .line 33
    invoke-direct {v2, v4, v5, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Lur0;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    iput-object v2, p0, Lur0;->k:Lya3;

    .line 40
    .line 41
    new-instance v2, Lkd;

    .line 42
    .line 43
    invoke-direct {v2, v1}, Lkd;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iput-object v2, p0, Lur0;->l:Lkd;

    .line 47
    .line 48
    new-instance v2, Lkd;

    .line 49
    .line 50
    invoke-direct {v2, v1}, Lkd;-><init>(I)V

    .line 51
    .line 52
    .line 53
    iput-object v2, p0, Lur0;->m:Lkd;

    .line 54
    .line 55
    iput-boolean v3, p0, Lur0;->o:Z

    .line 56
    .line 57
    iput-object p2, p0, Lur0;->e:Landroid/content/Context;

    .line 58
    .line 59
    new-instance v2, Lcom/google/android/gms/internal/base/zau;

    .line 60
    .line 61
    invoke-direct {v2, p1, p0}, Lcom/google/android/gms/internal/base/zau;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 62
    .line 63
    .line 64
    iput-object v2, p0, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 65
    .line 66
    iput-object v0, p0, Lur0;->f:Lpr0;

    .line 67
    .line 68
    new-instance p1, Lwe2;

    .line 69
    .line 70
    const/16 v0, 0x11

    .line 71
    .line 72
    invoke-direct {p1, v0}, Lwe2;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lur0;->g:Lwe2;

    .line 76
    .line 77
    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    sget-object p2, Li13;->p:Ljava/lang/Boolean;

    .line 82
    .line 83
    if-nez p2, :cond_1

    .line 84
    .line 85
    invoke-static {}, Lj13;->l()Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-eqz p2, :cond_0

    .line 90
    .line 91
    const-string p2, "android.hardware.type.automotive"

    .line 92
    .line 93
    invoke-virtual {p1, p2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_0

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    move v3, v1

    .line 101
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    sput-object p1, Li13;->p:Ljava/lang/Boolean;

    .line 106
    .line 107
    :cond_1
    sget-object p1, Li13;->p:Ljava/lang/Boolean;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_2

    .line 114
    .line 115
    iput-boolean v1, p0, Lur0;->o:Z

    .line 116
    .line 117
    :cond_2
    const/4 p0, 0x6

    .line 118
    invoke-virtual {v2, p0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-virtual {v2, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public static a()V
    .locals 3

    .line 1
    sget-object v0, Lur0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lur0;->s:Lur0;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v2, v1, Lur0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 11
    .line 12
    .line 13
    iget-object v1, v1, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw v1
.end method

.method public static e(Lw9;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/api/Status;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    iget-object p0, p0, Lw9;->b:Lh9;

    .line 4
    .line 5
    iget-object p0, p0, Lh9;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "API: "

    .line 12
    .line 13
    const-string v3, " is not available on this device. Connection failed with: "

    .line 14
    .line 15
    invoke-static {v2, p0, v3, v1}, Len;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/16 v1, 0x11

    .line 20
    .line 21
    iget-object v2, p1, Lcom/google/android/gms/common/ConnectionResult;->c:Landroid/app/PendingIntent;

    .line 22
    .line 23
    invoke-direct {v0, v1, p0, v2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public static h(Landroid/content/Context;)Lur0;
    .locals 5

    .line 1
    sget-object v0, Lur0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lur0;->s:Lur0;

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    sget-object v1, Llr0;->a:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    sget-object v2, Llr0;->c:Landroid/os/HandlerThread;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    monitor-exit v1

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance v2, Landroid/os/HandlerThread;

    .line 20
    .line 21
    const-string v3, "GoogleApiHandler"

    .line 22
    .line 23
    const/16 v4, 0x9

    .line 24
    .line 25
    invoke-direct {v2, v3, v4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    sput-object v2, Llr0;->c:Landroid/os/HandlerThread;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 31
    .line 32
    .line 33
    sget-object v2, Llr0;->c:Landroid/os/HandlerThread;

    .line 34
    .line 35
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :goto_0
    :try_start_2
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, Lur0;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    sget-object v3, Lpr0;->c:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-direct {v2, v1, p0}, Lur0;-><init>(Landroid/os/Looper;Landroid/content/Context;)V

    .line 49
    .line 50
    .line 51
    sput-object v2, Lur0;->s:Lur0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :catchall_1
    move-exception p0

    .line 55
    goto :goto_3

    .line 56
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 57
    :try_start_4
    throw p0

    .line 58
    :cond_1
    :goto_2
    sget-object p0, Lur0;->s:Lur0;

    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-object p0

    .line 62
    :goto_3
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 63
    throw p0
.end method


# virtual methods
.method public final b(Lya3;)V
    .locals 2

    .line 1
    sget-object v0, Lur0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lur0;->k:Lya3;

    .line 5
    .line 6
    if-eq v1, p1, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lur0;->k:Lya3;

    .line 9
    .line 10
    iget-object v1, p0, Lur0;->l:Lkd;

    .line 11
    .line 12
    invoke-virtual {v1}, Lkd;->clear()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    iget-object p0, p0, Lur0;->l:Lkd;

    .line 19
    .line 20
    iget-object p1, p1, Lya3;->e:Lkd;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lkd;->addAll(Ljava/util/Collection;)Z

    .line 23
    .line 24
    .line 25
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw p0
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lur0;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Ld52;->D()Ld52;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Ld52;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-boolean v0, v0, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;->b:Z

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    :cond_1
    iget-object p0, p0, Lur0;->g:Lwe2;

    .line 21
    .line 22
    iget-object p0, p0, Lwe2;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Landroid/util/SparseIntArray;

    .line 25
    .line 26
    const v0, 0xc1fa340

    .line 27
    .line 28
    .line 29
    const/4 v1, -0x1

    .line 30
    invoke-virtual {p0, v0, v1}, Landroid/util/SparseIntArray;->get(II)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eq p0, v1, :cond_3

    .line 35
    .line 36
    if-nez p0, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 40
    return p0

    .line 41
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 42
    return p0
.end method

.method public final d(Lcom/google/android/gms/common/ConnectionResult;I)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lur0;->f:Lpr0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lur0;->e:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {p0}, Lpy0;->p0(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    iget v1, p1, Lcom/google/android/gms/common/ConnectionResult;->b:I

    .line 17
    .line 18
    iget-object p1, p1, Lcom/google/android/gms/common/ConnectionResult;->c:Landroid/app/PendingIntent;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    move v4, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v4, v2

    .line 28
    :goto_0
    if-eqz v4, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    const/4 p1, 0x0

    .line 32
    invoke-virtual {v0, p0, p1, v1}, Lqr0;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    if-nez v4, :cond_3

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    const/high16 p1, 0xc000000

    .line 40
    .line 41
    invoke-static {p0, v2, v4, p1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_1
    if-eqz p1, :cond_4

    .line 46
    .line 47
    sget v4, Lcom/google/android/gms/common/api/GoogleApiActivity;->b:I

    .line 48
    .line 49
    new-instance v4, Landroid/content/Intent;

    .line 50
    .line 51
    const-class v5, Lcom/google/android/gms/common/api/GoogleApiActivity;

    .line 52
    .line 53
    invoke-direct {v4, p0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 54
    .line 55
    .line 56
    const-string v5, "pending_intent"

    .line 57
    .line 58
    invoke-virtual {v4, v5, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 59
    .line 60
    .line 61
    const-string p1, "failing_client_id"

    .line 62
    .line 63
    invoke-virtual {v4, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 64
    .line 65
    .line 66
    const-string p1, "notify_manager"

    .line 67
    .line 68
    invoke-virtual {v4, p1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 69
    .line 70
    .line 71
    sget p1, Lcom/google/android/gms/internal/base/zap;->zaa:I

    .line 72
    .line 73
    const/high16 p2, 0x8000000

    .line 74
    .line 75
    or-int/2addr p1, p2

    .line 76
    invoke-static {p0, v2, v4, p1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {v0, p0, v1, p1}, Lpr0;->g(Landroid/content/Context;ILandroid/app/PendingIntent;)V

    .line 81
    .line 82
    .line 83
    return v3

    .line 84
    :cond_4
    :goto_2
    return v2
.end method

.method public final f(Lor0;)Lcb3;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lor0;->getApiKey()Lw9;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lur0;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Lcb3;

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    new-instance v2, Lcb3;

    .line 16
    .line 17
    invoke-direct {v2, p0, p1}, Lcb3;-><init>(Lur0;Lor0;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object p1, v2, Lcb3;->b:Ld9;

    .line 24
    .line 25
    invoke-interface {p1}, Ld9;->requiresSignIn()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iget-object p0, p0, Lur0;->m:Lkd;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lkd;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {v2}, Lcb3;->n()V

    .line 37
    .line 38
    .line 39
    return-object v2
.end method

.method public final g(Lcom/google/android/gms/tasks/TaskCompletionSource;ILor0;)V
    .locals 8

    .line 1
    if-eqz p2, :cond_6

    .line 2
    .line 3
    invoke-virtual {p3}, Lor0;->getApiKey()Lw9;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    invoke-virtual {p0}, Lur0;->c()Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    if-nez p3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Ld52;->D()Ld52;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    iget-object p3, p3, Ld52;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p3, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    if-eqz p3, :cond_3

    .line 24
    .line 25
    iget-boolean v1, p3, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;->b:Z

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    iget-boolean p3, p3, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;->c:Z

    .line 30
    .line 31
    iget-object v1, p0, Lur0;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lcb3;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iget-object v2, v1, Lcb3;->b:Ld9;

    .line 42
    .line 43
    instance-of v4, v2, Lcom/google/android/gms/common/internal/a;

    .line 44
    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    check-cast v2, Lcom/google/android/gms/common/internal/a;

    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/google/android/gms/common/internal/a;->hasConnectionInfo()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    invoke-virtual {v2}, Lcom/google/android/gms/common/internal/a;->isConnecting()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-nez v4, :cond_1

    .line 60
    .line 61
    invoke-static {v1, v2, p2}, Lib3;->a(Lcb3;Lcom/google/android/gms/common/internal/a;I)Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    if-eqz p3, :cond_2

    .line 66
    .line 67
    iget v2, v1, Lcb3;->n:I

    .line 68
    .line 69
    add-int/2addr v2, v0

    .line 70
    iput v2, v1, Lcb3;->n:I

    .line 71
    .line 72
    iget-boolean v0, p3, Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;->c:Z

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    move v0, p3

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    :goto_0
    const/4 p2, 0x0

    .line 78
    move-object v1, p0

    .line 79
    goto :goto_3

    .line 80
    :cond_3
    :goto_1
    new-instance p3, Lib3;

    .line 81
    .line 82
    const-wide/16 v1, 0x0

    .line 83
    .line 84
    if-eqz v0, :cond_4

    .line 85
    .line 86
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 87
    .line 88
    .line 89
    move-result-wide v4

    .line 90
    goto :goto_2

    .line 91
    :cond_4
    move-wide v4, v1

    .line 92
    :goto_2
    if-eqz v0, :cond_5

    .line 93
    .line 94
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 95
    .line 96
    .line 97
    move-result-wide v1

    .line 98
    :cond_5
    move-object v0, p3

    .line 99
    move-wide v6, v1

    .line 100
    move-object v1, p0

    .line 101
    move v2, p2

    .line 102
    invoke-direct/range {v0 .. v7}, Lib3;-><init>(Lur0;ILw9;JJ)V

    .line 103
    .line 104
    .line 105
    move-object p2, v0

    .line 106
    :goto_3
    if-eqz p2, :cond_6

    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    iget-object p1, v1, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    new-instance p3, Lwz0;

    .line 118
    .line 119
    invoke-direct {p3, p1}, Lwz0;-><init>(Lcom/google/android/gms/internal/base/zau;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, p3, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 123
    .line 124
    .line 125
    :cond_6
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lur0;->e:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v3, v0, Lur0;->m:Lkd;

    .line 8
    .line 9
    const-string v4, "GoogleApiManager"

    .line 10
    .line 11
    iget-object v5, v0, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 12
    .line 13
    iget-object v6, v0, Lur0;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    iget v7, v1, Landroid/os/Message;->what:I

    .line 16
    .line 17
    const-wide/32 v8, 0x493e0

    .line 18
    .line 19
    .line 20
    const/16 v10, 0x11

    .line 21
    .line 22
    const/4 v11, 0x0

    .line 23
    const/4 v12, 0x0

    .line 24
    const/4 v13, 0x1

    .line 25
    packed-switch v7, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, "Unknown message id: "

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v4, v0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    return v12

    .line 46
    :pswitch_0
    iput-boolean v12, v0, Lur0;->b:Z

    .line 47
    .line 48
    return v13

    .line 49
    :pswitch_1
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Ljb3;

    .line 52
    .line 53
    iget-wide v2, v1, Ljb3;->c:J

    .line 54
    .line 55
    iget-object v4, v1, Ljb3;->a:Lcom/google/android/gms/common/internal/MethodInvocation;

    .line 56
    .line 57
    iget v6, v1, Ljb3;->b:I

    .line 58
    .line 59
    const-wide/16 v7, 0x0

    .line 60
    .line 61
    cmp-long v2, v2, v7

    .line 62
    .line 63
    if-nez v2, :cond_1

    .line 64
    .line 65
    new-instance v1, Lcom/google/android/gms/common/internal/TelemetryData;

    .line 66
    .line 67
    filled-new-array {v4}, [Lcom/google/android/gms/common/internal/MethodInvocation;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-direct {v1, v6, v2}, Lcom/google/android/gms/common/internal/TelemetryData;-><init>(ILjava/util/List;)V

    .line 76
    .line 77
    .line 78
    iget-object v2, v0, Lur0;->d:Lfc3;

    .line 79
    .line 80
    if-nez v2, :cond_0

    .line 81
    .line 82
    iget-object v4, v0, Lur0;->e:Landroid/content/Context;

    .line 83
    .line 84
    sget-object v7, Lzm2;->b:Lzm2;

    .line 85
    .line 86
    new-instance v3, Lfc3;

    .line 87
    .line 88
    sget-object v6, Lfc3;->a:Lh9;

    .line 89
    .line 90
    sget-object v8, Lnr0;->c:Lnr0;

    .line 91
    .line 92
    const/4 v5, 0x0

    .line 93
    invoke-direct/range {v3 .. v8}, Lor0;-><init>(Landroid/content/Context;Landroid/app/Activity;Lh9;Lb9;Lnr0;)V

    .line 94
    .line 95
    .line 96
    iput-object v3, v0, Lur0;->d:Lfc3;

    .line 97
    .line 98
    :cond_0
    iget-object v0, v0, Lur0;->d:Lfc3;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Lfc3;->c(Lcom/google/android/gms/common/internal/TelemetryData;)Lcom/google/android/gms/tasks/Task;

    .line 101
    .line 102
    .line 103
    return v13

    .line 104
    :cond_1
    iget-object v2, v0, Lur0;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 105
    .line 106
    if-eqz v2, :cond_8

    .line 107
    .line 108
    iget-object v3, v2, Lcom/google/android/gms/common/internal/TelemetryData;->b:Ljava/util/List;

    .line 109
    .line 110
    iget v2, v2, Lcom/google/android/gms/common/internal/TelemetryData;->a:I

    .line 111
    .line 112
    if-ne v2, v6, :cond_4

    .line 113
    .line 114
    if-eqz v3, :cond_2

    .line 115
    .line 116
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    iget v3, v1, Ljb3;->d:I

    .line 121
    .line 122
    if-lt v2, v3, :cond_2

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_2
    iget-object v2, v0, Lur0;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 126
    .line 127
    iget-object v3, v2, Lcom/google/android/gms/common/internal/TelemetryData;->b:Ljava/util/List;

    .line 128
    .line 129
    if-nez v3, :cond_3

    .line 130
    .line 131
    new-instance v3, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object v3, v2, Lcom/google/android/gms/common/internal/TelemetryData;->b:Ljava/util/List;

    .line 137
    .line 138
    :cond_3
    iget-object v2, v2, Lcom/google/android/gms/common/internal/TelemetryData;->b:Ljava/util/List;

    .line 139
    .line 140
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_4
    :goto_0
    invoke-virtual {v5, v10}, Landroid/os/Handler;->removeMessages(I)V

    .line 145
    .line 146
    .line 147
    iget-object v2, v0, Lur0;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 148
    .line 149
    if-eqz v2, :cond_8

    .line 150
    .line 151
    iget v3, v2, Lcom/google/android/gms/common/internal/TelemetryData;->a:I

    .line 152
    .line 153
    if-gtz v3, :cond_5

    .line 154
    .line 155
    invoke-virtual {v0}, Lur0;->c()Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz v3, :cond_7

    .line 160
    .line 161
    :cond_5
    iget-object v3, v0, Lur0;->d:Lfc3;

    .line 162
    .line 163
    if-nez v3, :cond_6

    .line 164
    .line 165
    iget-object v15, v0, Lur0;->e:Landroid/content/Context;

    .line 166
    .line 167
    sget-object v18, Lzm2;->b:Lzm2;

    .line 168
    .line 169
    new-instance v14, Lfc3;

    .line 170
    .line 171
    sget-object v17, Lfc3;->a:Lh9;

    .line 172
    .line 173
    sget-object v19, Lnr0;->c:Lnr0;

    .line 174
    .line 175
    const/16 v16, 0x0

    .line 176
    .line 177
    invoke-direct/range {v14 .. v19}, Lor0;-><init>(Landroid/content/Context;Landroid/app/Activity;Lh9;Lb9;Lnr0;)V

    .line 178
    .line 179
    .line 180
    iput-object v14, v0, Lur0;->d:Lfc3;

    .line 181
    .line 182
    :cond_6
    iget-object v3, v0, Lur0;->d:Lfc3;

    .line 183
    .line 184
    invoke-virtual {v3, v2}, Lfc3;->c(Lcom/google/android/gms/common/internal/TelemetryData;)Lcom/google/android/gms/tasks/Task;

    .line 185
    .line 186
    .line 187
    :cond_7
    iput-object v11, v0, Lur0;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 188
    .line 189
    :cond_8
    :goto_1
    iget-object v2, v0, Lur0;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 190
    .line 191
    if-nez v2, :cond_22

    .line 192
    .line 193
    new-instance v2, Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    new-instance v3, Lcom/google/android/gms/common/internal/TelemetryData;

    .line 202
    .line 203
    invoke-direct {v3, v6, v2}, Lcom/google/android/gms/common/internal/TelemetryData;-><init>(ILjava/util/List;)V

    .line 204
    .line 205
    .line 206
    iput-object v3, v0, Lur0;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 207
    .line 208
    invoke-virtual {v5, v10}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    iget-wide v1, v1, Ljb3;->c:J

    .line 213
    .line 214
    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 215
    .line 216
    .line 217
    return v13

    .line 218
    :pswitch_2
    iget-object v1, v0, Lur0;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 219
    .line 220
    if-eqz v1, :cond_22

    .line 221
    .line 222
    iget v2, v1, Lcom/google/android/gms/common/internal/TelemetryData;->a:I

    .line 223
    .line 224
    if-gtz v2, :cond_9

    .line 225
    .line 226
    invoke-virtual {v0}, Lur0;->c()Z

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-eqz v2, :cond_b

    .line 231
    .line 232
    :cond_9
    iget-object v2, v0, Lur0;->d:Lfc3;

    .line 233
    .line 234
    if-nez v2, :cond_a

    .line 235
    .line 236
    iget-object v4, v0, Lur0;->e:Landroid/content/Context;

    .line 237
    .line 238
    sget-object v7, Lzm2;->b:Lzm2;

    .line 239
    .line 240
    new-instance v3, Lfc3;

    .line 241
    .line 242
    sget-object v6, Lfc3;->a:Lh9;

    .line 243
    .line 244
    sget-object v8, Lnr0;->c:Lnr0;

    .line 245
    .line 246
    const/4 v5, 0x0

    .line 247
    invoke-direct/range {v3 .. v8}, Lor0;-><init>(Landroid/content/Context;Landroid/app/Activity;Lh9;Lb9;Lnr0;)V

    .line 248
    .line 249
    .line 250
    iput-object v3, v0, Lur0;->d:Lfc3;

    .line 251
    .line 252
    :cond_a
    iget-object v2, v0, Lur0;->d:Lfc3;

    .line 253
    .line 254
    invoke-virtual {v2, v1}, Lfc3;->c(Lcom/google/android/gms/common/internal/TelemetryData;)Lcom/google/android/gms/tasks/Task;

    .line 255
    .line 256
    .line 257
    :cond_b
    iput-object v11, v0, Lur0;->c:Lcom/google/android/gms/common/internal/TelemetryData;

    .line 258
    .line 259
    return v13

    .line 260
    :pswitch_3
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v0, Ldb3;

    .line 263
    .line 264
    iget-object v1, v0, Ldb3;->a:Lw9;

    .line 265
    .line 266
    invoke-virtual {v6, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-eqz v1, :cond_22

    .line 271
    .line 272
    iget-object v1, v0, Ldb3;->a:Lw9;

    .line 273
    .line 274
    invoke-virtual {v6, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    check-cast v1, Lcb3;

    .line 279
    .line 280
    iget-object v2, v1, Lcb3;->l:Ljava/util/ArrayList;

    .line 281
    .line 282
    iget-object v3, v1, Lcb3;->o:Lur0;

    .line 283
    .line 284
    iget-object v4, v1, Lcb3;->a:Ljava/util/LinkedList;

    .line 285
    .line 286
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    if-eqz v2, :cond_22

    .line 291
    .line 292
    iget-object v2, v3, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 293
    .line 294
    const/16 v5, 0xf

    .line 295
    .line 296
    invoke-virtual {v2, v5, v0}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    iget-object v2, v3, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 300
    .line 301
    const/16 v3, 0x10

    .line 302
    .line 303
    invoke-virtual {v2, v3, v0}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    iget-object v0, v0, Ldb3;->b:Lcom/google/android/gms/common/Feature;

    .line 307
    .line 308
    new-instance v2, Ljava/util/ArrayList;

    .line 309
    .line 310
    invoke-virtual {v4}, Ljava/util/LinkedList;->size()I

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 315
    .line 316
    .line 317
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    :cond_c
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 322
    .line 323
    .line 324
    move-result v5

    .line 325
    if-eqz v5, :cond_e

    .line 326
    .line 327
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    check-cast v5, Lbc3;

    .line 332
    .line 333
    instance-of v6, v5, Lgb3;

    .line 334
    .line 335
    if-eqz v6, :cond_c

    .line 336
    .line 337
    move-object v6, v5

    .line 338
    check-cast v6, Lgb3;

    .line 339
    .line 340
    invoke-virtual {v6, v1}, Lgb3;->g(Lcb3;)[Lcom/google/android/gms/common/Feature;

    .line 341
    .line 342
    .line 343
    move-result-object v6

    .line 344
    if-eqz v6, :cond_c

    .line 345
    .line 346
    array-length v7, v6

    .line 347
    move v8, v12

    .line 348
    :goto_3
    if-ge v8, v7, :cond_c

    .line 349
    .line 350
    aget-object v9, v6, v8

    .line 351
    .line 352
    invoke-static {v9, v0}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v9

    .line 356
    if-eqz v9, :cond_d

    .line 357
    .line 358
    if-ltz v8, :cond_c

    .line 359
    .line 360
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    goto :goto_2

    .line 364
    :cond_d
    add-int/lit8 v8, v8, 0x1

    .line 365
    .line 366
    goto :goto_3

    .line 367
    :cond_e
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    :goto_4
    if-ge v12, v1, :cond_22

    .line 372
    .line 373
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    check-cast v3, Lbc3;

    .line 378
    .line 379
    invoke-virtual {v4, v3}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    new-instance v5, Loy2;

    .line 383
    .line 384
    invoke-direct {v5, v0}, Loy2;-><init>(Lcom/google/android/gms/common/Feature;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v3, v5}, Lbc3;->b(Ljava/lang/Exception;)V

    .line 388
    .line 389
    .line 390
    add-int/lit8 v12, v12, 0x1

    .line 391
    .line 392
    goto :goto_4

    .line 393
    :pswitch_4
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v0, Ldb3;

    .line 396
    .line 397
    iget-object v1, v0, Ldb3;->a:Lw9;

    .line 398
    .line 399
    invoke-virtual {v6, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    if-eqz v1, :cond_22

    .line 404
    .line 405
    iget-object v1, v0, Ldb3;->a:Lw9;

    .line 406
    .line 407
    invoke-virtual {v6, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    check-cast v1, Lcb3;

    .line 412
    .line 413
    iget-object v2, v1, Lcb3;->l:Ljava/util/ArrayList;

    .line 414
    .line 415
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v0

    .line 419
    if-nez v0, :cond_f

    .line 420
    .line 421
    goto/16 :goto_e

    .line 422
    .line 423
    :cond_f
    iget-boolean v0, v1, Lcb3;->k:Z

    .line 424
    .line 425
    if-nez v0, :cond_22

    .line 426
    .line 427
    iget-object v0, v1, Lcb3;->b:Ld9;

    .line 428
    .line 429
    invoke-interface {v0}, Ld9;->isConnected()Z

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    if-nez v0, :cond_10

    .line 434
    .line 435
    invoke-virtual {v1}, Lcb3;->n()V

    .line 436
    .line 437
    .line 438
    return v13

    .line 439
    :cond_10
    invoke-virtual {v1}, Lcb3;->g()V

    .line 440
    .line 441
    .line 442
    return v13

    .line 443
    :pswitch_5
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast v0, Lza3;

    .line 446
    .line 447
    iget-object v1, v0, Lza3;->a:Lw9;

    .line 448
    .line 449
    iget-object v0, v0, Lza3;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 450
    .line 451
    invoke-virtual {v6, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result v2

    .line 455
    if-nez v2, :cond_11

    .line 456
    .line 457
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 458
    .line 459
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    return v13

    .line 463
    :cond_11
    invoke-virtual {v6, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    check-cast v1, Lcb3;

    .line 468
    .line 469
    invoke-virtual {v1, v12}, Lcb3;->m(Z)Z

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    return v13

    .line 481
    :pswitch_6
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 482
    .line 483
    invoke-virtual {v6, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    if-eqz v0, :cond_22

    .line 488
    .line 489
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 490
    .line 491
    invoke-virtual {v6, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    check-cast v0, Lcb3;

    .line 496
    .line 497
    invoke-virtual {v0, v13}, Lcb3;->m(Z)Z

    .line 498
    .line 499
    .line 500
    return v13

    .line 501
    :pswitch_7
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 502
    .line 503
    invoke-virtual {v6, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v0

    .line 507
    if-eqz v0, :cond_22

    .line 508
    .line 509
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 510
    .line 511
    invoke-virtual {v6, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    check-cast v0, Lcb3;

    .line 516
    .line 517
    iget-object v1, v0, Lcb3;->o:Lur0;

    .line 518
    .line 519
    iget-object v2, v1, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 520
    .line 521
    invoke-static {v2}, Lkb1;->h(Landroid/os/Handler;)V

    .line 522
    .line 523
    .line 524
    iget-boolean v2, v0, Lcb3;->k:Z

    .line 525
    .line 526
    if-eqz v2, :cond_22

    .line 527
    .line 528
    iget-object v3, v0, Lcb3;->c:Lw9;

    .line 529
    .line 530
    iget-object v4, v0, Lcb3;->o:Lur0;

    .line 531
    .line 532
    iget-object v4, v4, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 533
    .line 534
    if-eqz v2, :cond_12

    .line 535
    .line 536
    const/16 v2, 0xb

    .line 537
    .line 538
    invoke-virtual {v4, v2, v3}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    const/16 v2, 0x9

    .line 542
    .line 543
    invoke-virtual {v4, v2, v3}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    iput-boolean v12, v0, Lcb3;->k:Z

    .line 547
    .line 548
    :cond_12
    iget-object v2, v1, Lur0;->f:Lpr0;

    .line 549
    .line 550
    iget-object v1, v1, Lur0;->e:Landroid/content/Context;

    .line 551
    .line 552
    sget v3, Lqr0;->a:I

    .line 553
    .line 554
    invoke-virtual {v2, v1, v3}, Lqr0;->c(Landroid/content/Context;I)I

    .line 555
    .line 556
    .line 557
    move-result v1

    .line 558
    const/16 v2, 0x12

    .line 559
    .line 560
    if-ne v1, v2, :cond_13

    .line 561
    .line 562
    const-string v1, "Connection timed out waiting for Google Play services update to complete."

    .line 563
    .line 564
    new-instance v2, Lcom/google/android/gms/common/api/Status;

    .line 565
    .line 566
    const/16 v3, 0x15

    .line 567
    .line 568
    invoke-direct {v2, v3, v1, v11, v11}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 569
    .line 570
    .line 571
    goto :goto_5

    .line 572
    :cond_13
    const-string v1, "API failed to connect while resuming due to an unknown error."

    .line 573
    .line 574
    new-instance v2, Lcom/google/android/gms/common/api/Status;

    .line 575
    .line 576
    const/16 v3, 0x16

    .line 577
    .line 578
    invoke-direct {v2, v3, v1, v11, v11}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 579
    .line 580
    .line 581
    :goto_5
    invoke-virtual {v0, v2}, Lcb3;->e(Lcom/google/android/gms/common/api/Status;)V

    .line 582
    .line 583
    .line 584
    iget-object v0, v0, Lcb3;->b:Ld9;

    .line 585
    .line 586
    const-string v1, "Timing out connection while resuming."

    .line 587
    .line 588
    invoke-interface {v0, v1}, Ld9;->disconnect(Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    return v13

    .line 592
    :pswitch_8
    invoke-virtual {v3}, Lkd;->iterator()Ljava/util/Iterator;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    :cond_14
    :goto_6
    move-object v1, v0

    .line 597
    check-cast v1, Lwb1;

    .line 598
    .line 599
    invoke-virtual {v1}, Lwb1;->hasNext()Z

    .line 600
    .line 601
    .line 602
    move-result v2

    .line 603
    if-eqz v2, :cond_15

    .line 604
    .line 605
    invoke-virtual {v1}, Lwb1;->next()Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    check-cast v1, Lw9;

    .line 610
    .line 611
    invoke-virtual {v6, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    check-cast v1, Lcb3;

    .line 616
    .line 617
    if-eqz v1, :cond_14

    .line 618
    .line 619
    invoke-virtual {v1}, Lcb3;->r()V

    .line 620
    .line 621
    .line 622
    goto :goto_6

    .line 623
    :cond_15
    invoke-virtual {v3}, Lkd;->clear()V

    .line 624
    .line 625
    .line 626
    return v13

    .line 627
    :pswitch_9
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 628
    .line 629
    invoke-virtual {v6, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 630
    .line 631
    .line 632
    move-result v0

    .line 633
    if-eqz v0, :cond_22

    .line 634
    .line 635
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 636
    .line 637
    invoke-virtual {v6, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    check-cast v0, Lcb3;

    .line 642
    .line 643
    iget-object v1, v0, Lcb3;->o:Lur0;

    .line 644
    .line 645
    iget-object v1, v1, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 646
    .line 647
    invoke-static {v1}, Lkb1;->h(Landroid/os/Handler;)V

    .line 648
    .line 649
    .line 650
    iget-boolean v1, v0, Lcb3;->k:Z

    .line 651
    .line 652
    if-eqz v1, :cond_22

    .line 653
    .line 654
    invoke-virtual {v0}, Lcb3;->n()V

    .line 655
    .line 656
    .line 657
    return v13

    .line 658
    :pswitch_a
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 659
    .line 660
    check-cast v1, Lor0;

    .line 661
    .line 662
    invoke-virtual {v0, v1}, Lur0;->f(Lor0;)Lcb3;

    .line 663
    .line 664
    .line 665
    return v13

    .line 666
    :pswitch_b
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 667
    .line 668
    .line 669
    move-result-object v1

    .line 670
    instance-of v1, v1, Landroid/app/Application;

    .line 671
    .line 672
    if-eqz v1, :cond_22

    .line 673
    .line 674
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 675
    .line 676
    .line 677
    move-result-object v1

    .line 678
    check-cast v1, Landroid/app/Application;

    .line 679
    .line 680
    invoke-static {v1}, Lkh;->a(Landroid/app/Application;)V

    .line 681
    .line 682
    .line 683
    sget-object v1, Lkh;->e:Lkh;

    .line 684
    .line 685
    new-instance v2, Lab3;

    .line 686
    .line 687
    invoke-direct {v2, v0}, Lab3;-><init>(Lur0;)V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    monitor-enter v1

    .line 694
    :try_start_0
    iget-object v3, v1, Lkh;->c:Ljava/util/ArrayList;

    .line 695
    .line 696
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 697
    .line 698
    .line 699
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 700
    iget-object v2, v1, Lkh;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 701
    .line 702
    iget-object v1, v1, Lkh;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 703
    .line 704
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 705
    .line 706
    .line 707
    move-result v3

    .line 708
    if-nez v3, :cond_1a

    .line 709
    .line 710
    sget-object v3, Lmn0;->o:Ljava/lang/Boolean;

    .line 711
    .line 712
    if-nez v3, :cond_18

    .line 713
    .line 714
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 715
    .line 716
    const/16 v4, 0x1c

    .line 717
    .line 718
    if-lt v3, v4, :cond_16

    .line 719
    .line 720
    invoke-static {}, Lrt1;->l()Z

    .line 721
    .line 722
    .line 723
    move-result v3

    .line 724
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 725
    .line 726
    .line 727
    move-result-object v3

    .line 728
    goto :goto_7

    .line 729
    :cond_16
    :try_start_1
    const-class v3, Landroid/os/Process;

    .line 730
    .line 731
    const-string v4, "isIsolated"

    .line 732
    .line 733
    new-array v5, v12, [Lcom/google/android/gms/internal/common/zzi;

    .line 734
    .line 735
    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/common/zzj;->zza(Ljava/lang/Class;Ljava/lang/String;[Lcom/google/android/gms/internal/common/zzi;)Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v3

    .line 739
    new-array v4, v12, [Ljava/lang/Object;

    .line 740
    .line 741
    const-string v5, "expected a non-null reference"

    .line 742
    .line 743
    if-eqz v3, :cond_17

    .line 744
    .line 745
    check-cast v3, Ljava/lang/Boolean;

    .line 746
    .line 747
    goto :goto_7

    .line 748
    :cond_17
    new-instance v3, Lcom/google/android/gms/internal/common/zzy;

    .line 749
    .line 750
    invoke-static {v5, v4}, Lcom/google/android/gms/internal/common/zzx;->zza(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object v4

    .line 754
    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/common/zzy;-><init>(Ljava/lang/String;)V

    .line 755
    .line 756
    .line 757
    throw v3
    :try_end_1
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 758
    :catch_0
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 759
    .line 760
    :goto_7
    sput-object v3, Lmn0;->o:Ljava/lang/Boolean;

    .line 761
    .line 762
    :cond_18
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 763
    .line 764
    .line 765
    move-result v3

    .line 766
    if-nez v3, :cond_19

    .line 767
    .line 768
    new-instance v3, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 769
    .line 770
    invoke-direct {v3}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 771
    .line 772
    .line 773
    invoke-static {v3}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 774
    .line 775
    .line 776
    invoke-virtual {v1, v13}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 777
    .line 778
    .line 779
    move-result v1

    .line 780
    if-nez v1, :cond_1a

    .line 781
    .line 782
    iget v1, v3, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 783
    .line 784
    const/16 v3, 0x64

    .line 785
    .line 786
    if-le v1, v3, :cond_1a

    .line 787
    .line 788
    invoke-virtual {v2, v13}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 789
    .line 790
    .line 791
    goto :goto_8

    .line 792
    :cond_19
    move v1, v13

    .line 793
    goto :goto_9

    .line 794
    :cond_1a
    :goto_8
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 795
    .line 796
    .line 797
    move-result v1

    .line 798
    :goto_9
    if-nez v1, :cond_22

    .line 799
    .line 800
    iput-wide v8, v0, Lur0;->a:J

    .line 801
    .line 802
    goto/16 :goto_e

    .line 803
    .line 804
    :catchall_0
    move-exception v0

    .line 805
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 806
    throw v0

    .line 807
    :pswitch_c
    iget v2, v1, Landroid/os/Message;->arg1:I

    .line 808
    .line 809
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 810
    .line 811
    check-cast v1, Lcom/google/android/gms/common/ConnectionResult;

    .line 812
    .line 813
    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 814
    .line 815
    .line 816
    move-result-object v3

    .line 817
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 818
    .line 819
    .line 820
    move-result-object v3

    .line 821
    :cond_1b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 822
    .line 823
    .line 824
    move-result v5

    .line 825
    if-eqz v5, :cond_1c

    .line 826
    .line 827
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v5

    .line 831
    check-cast v5, Lcb3;

    .line 832
    .line 833
    iget v6, v5, Lcb3;->i:I

    .line 834
    .line 835
    if-ne v6, v2, :cond_1b

    .line 836
    .line 837
    goto :goto_a

    .line 838
    :cond_1c
    move-object v5, v11

    .line 839
    :goto_a
    if-eqz v5, :cond_1e

    .line 840
    .line 841
    iget v2, v1, Lcom/google/android/gms/common/ConnectionResult;->b:I

    .line 842
    .line 843
    const/16 v3, 0xd

    .line 844
    .line 845
    if-ne v2, v3, :cond_1d

    .line 846
    .line 847
    iget-object v0, v0, Lur0;->f:Lpr0;

    .line 848
    .line 849
    new-instance v3, Lcom/google/android/gms/common/api/Status;

    .line 850
    .line 851
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 852
    .line 853
    .line 854
    sget v0, Lwr0;->e:I

    .line 855
    .line 856
    invoke-static {v2}, Lcom/google/android/gms/common/ConnectionResult;->D1(I)Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    iget-object v1, v1, Lcom/google/android/gms/common/ConnectionResult;->d:Ljava/lang/String;

    .line 861
    .line 862
    const-string v2, "Error resolution was canceled by the user, original error message: "

    .line 863
    .line 864
    const-string v4, ": "

    .line 865
    .line 866
    invoke-static {v2, v0, v4, v1}, Len;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    invoke-direct {v3, v10, v0, v11, v11}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 871
    .line 872
    .line 873
    invoke-virtual {v5, v3}, Lcb3;->e(Lcom/google/android/gms/common/api/Status;)V

    .line 874
    .line 875
    .line 876
    return v13

    .line 877
    :cond_1d
    iget-object v0, v5, Lcb3;->c:Lw9;

    .line 878
    .line 879
    invoke-static {v0, v1}, Lur0;->e(Lw9;Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/api/Status;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    invoke-virtual {v5, v0}, Lcb3;->e(Lcom/google/android/gms/common/api/Status;)V

    .line 884
    .line 885
    .line 886
    return v13

    .line 887
    :cond_1e
    const-string v0, "Could not find API instance "

    .line 888
    .line 889
    const-string v1, " while trying to fail enqueued calls."

    .line 890
    .line 891
    invoke-static {v2, v0, v1}, Len;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    new-instance v1, Ljava/lang/Exception;

    .line 896
    .line 897
    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    .line 898
    .line 899
    .line 900
    invoke-static {v4, v0, v1}, Lio/sentry/android/core/n0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 901
    .line 902
    .line 903
    return v13

    .line 904
    :pswitch_d
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 905
    .line 906
    check-cast v1, Lkb3;

    .line 907
    .line 908
    iget-object v2, v1, Lkb3;->c:Lor0;

    .line 909
    .line 910
    iget-object v3, v1, Lkb3;->a:Lbc3;

    .line 911
    .line 912
    invoke-virtual {v2}, Lor0;->getApiKey()Lw9;

    .line 913
    .line 914
    .line 915
    move-result-object v2

    .line 916
    invoke-virtual {v6, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v2

    .line 920
    check-cast v2, Lcb3;

    .line 921
    .line 922
    if-nez v2, :cond_1f

    .line 923
    .line 924
    iget-object v2, v1, Lkb3;->c:Lor0;

    .line 925
    .line 926
    invoke-virtual {v0, v2}, Lur0;->f(Lor0;)Lcb3;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    :cond_1f
    iget-object v4, v2, Lcb3;->b:Ld9;

    .line 931
    .line 932
    invoke-interface {v4}, Ld9;->requiresSignIn()Z

    .line 933
    .line 934
    .line 935
    move-result v4

    .line 936
    if-eqz v4, :cond_20

    .line 937
    .line 938
    iget-object v0, v0, Lur0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 939
    .line 940
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 941
    .line 942
    .line 943
    move-result v0

    .line 944
    iget v1, v1, Lkb3;->b:I

    .line 945
    .line 946
    if-eq v0, v1, :cond_20

    .line 947
    .line 948
    sget-object v0, Lur0;->p:Lcom/google/android/gms/common/api/Status;

    .line 949
    .line 950
    invoke-virtual {v3, v0}, Lbc3;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 951
    .line 952
    .line 953
    invoke-virtual {v2}, Lcb3;->r()V

    .line 954
    .line 955
    .line 956
    return v13

    .line 957
    :cond_20
    invoke-virtual {v2, v3}, Lcb3;->o(Lbc3;)V

    .line 958
    .line 959
    .line 960
    return v13

    .line 961
    :pswitch_e
    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 970
    .line 971
    .line 972
    move-result v1

    .line 973
    if-eqz v1, :cond_22

    .line 974
    .line 975
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    move-result-object v1

    .line 979
    check-cast v1, Lcb3;

    .line 980
    .line 981
    iget-object v2, v1, Lcb3;->o:Lur0;

    .line 982
    .line 983
    iget-object v2, v2, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 984
    .line 985
    invoke-static {v2}, Lkb1;->h(Landroid/os/Handler;)V

    .line 986
    .line 987
    .line 988
    iput-object v11, v1, Lcb3;->m:Lcom/google/android/gms/common/ConnectionResult;

    .line 989
    .line 990
    invoke-virtual {v1}, Lcb3;->n()V

    .line 991
    .line 992
    .line 993
    goto :goto_b

    .line 994
    :pswitch_f
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 995
    .line 996
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 997
    .line 998
    .line 999
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 1000
    .line 1001
    .line 1002
    return v12

    .line 1003
    :pswitch_10
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1004
    .line 1005
    check-cast v1, Ljava/lang/Boolean;

    .line 1006
    .line 1007
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1008
    .line 1009
    .line 1010
    move-result v1

    .line 1011
    if-eq v13, v1, :cond_21

    .line 1012
    .line 1013
    goto :goto_c

    .line 1014
    :cond_21
    const-wide/16 v8, 0x2710

    .line 1015
    .line 1016
    :goto_c
    iput-wide v8, v0, Lur0;->a:J

    .line 1017
    .line 1018
    const/16 v1, 0xc

    .line 1019
    .line 1020
    invoke-virtual {v5, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v2

    .line 1027
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v2

    .line 1031
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1032
    .line 1033
    .line 1034
    move-result v3

    .line 1035
    if-eqz v3, :cond_22

    .line 1036
    .line 1037
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v3

    .line 1041
    check-cast v3, Lw9;

    .line 1042
    .line 1043
    invoke-virtual {v5, v1, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v3

    .line 1047
    iget-wide v6, v0, Lur0;->a:J

    .line 1048
    .line 1049
    invoke-virtual {v5, v3, v6, v7}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1050
    .line 1051
    .line 1052
    goto :goto_d

    .line 1053
    :cond_22
    :goto_e
    return v13

    .line 1054
    nop

    .line 1055
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_d
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Lcom/google/android/gms/common/ConnectionResult;I)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lur0;->d(Lcom/google/android/gms/common/ConnectionResult;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x5

    .line 8
    const/4 v1, 0x0

    .line 9
    iget-object p0, p0, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 10
    .line 11
    invoke-virtual {p0, v0, p2, v1, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

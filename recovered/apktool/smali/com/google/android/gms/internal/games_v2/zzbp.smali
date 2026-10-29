.class final Lcom/google/android/gms/internal/games_v2/zzbp;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/gms/internal/games_v2/zzbm;


# instance fields
.field private final zza:Landroid/app/Application;

.field private final zzb:Lbh3;

.field private final zzc:Lcom/google/android/gms/internal/games_v2/zzaw;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lbh3;Lcom/google/android/gms/internal/games_v2/zzaw;[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/games_v2/zzbp;->zza:Landroid/app/Application;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/games_v2/zzbp;->zzb:Lbh3;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/games_v2/zzbp;->zzc:Lcom/google/android/gms/internal/games_v2/zzaw;

    .line 9
    .line 10
    return-void
.end method

.method private final zzc()Lcom/google/android/gms/internal/games_v2/zzs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/games_v2/zzbp;->zzb:Lbh3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbh3;->a()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, Lcom/google/android/gms/internal/games_v2/zzbp;->zzc:Lcom/google/android/gms/internal/games_v2/zzaw;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lcom/google/android/gms/internal/games_v2/zzaw;->zzb:Lcom/google/android/gms/internal/games_v2/zzq;

    .line 12
    .line 13
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/games_v2/zzr;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/games_v2/zzq;)Lcom/google/android/gms/internal/games_v2/zzs;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/games_v2/zzaw;->zza:Landroid/app/Application;

    .line 19
    .line 20
    iget-object p0, p0, Lcom/google/android/gms/internal/games_v2/zzaw;->zzb:Lcom/google/android/gms/internal/games_v2/zzq;

    .line 21
    .line 22
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/games_v2/zzr;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/games_v2/zzq;)Lcom/google/android/gms/internal/games_v2/zzs;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/games_v2/zzy;)Lcom/google/android/gms/tasks/Task;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/games_v2/zzy;->zza()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/internal/games_v2/zzbp;->zza:Landroid/app/Application;

    .line 9
    .line 10
    invoke-static {v0}, Lpy0;->p0(Landroid/content/Context;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/games_v2/zzbp;->zzc()Lcom/google/android/gms/internal/games_v2/zzs;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/games_v2/zzs;->zza(Lcom/google/android/gms/internal/games_v2/zzy;Z)Lcom/google/android/gms/tasks/Task;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 26
    .line 27
    invoke-direct {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/google/android/gms/internal/games_v2/zzfe;->zza()Ljava/util/concurrent/Executor;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    new-instance v4, Lcom/google/android/gms/internal/games_v2/zzbn;

    .line 35
    .line 36
    invoke-direct {v4, p0, p1, v1}, Lcom/google/android/gms/internal/games_v2/zzbn;-><init>(Lcom/google/android/gms/internal/games_v2/zzbp;Lcom/google/android/gms/internal/games_v2/zzy;Z)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {}, Lcom/google/android/gms/internal/games_v2/zzfe;->zza()Ljava/util/concurrent/Executor;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance v0, Lcom/google/android/gms/internal/games_v2/zzbo;

    .line 48
    .line 49
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/games_v2/zzbo;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method public final synthetic zzb(Lcom/google/android/gms/internal/games_v2/zzy;ZLcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    instance-of v1, v0, Li9;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast v0, Li9;

    .line 18
    .line 19
    invoke-virtual {v0}, Li9;->getStatusCode()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/16 v1, 0x14

    .line 24
    .line 25
    if-eq v0, v1, :cond_2

    .line 26
    .line 27
    :goto_0
    return-object p3

    .line 28
    :cond_2
    const-string p3, "GamesAuthenticator"

    .line 29
    .line 30
    const-string v0, "Service connection suspended during the first sign-in attempt. Trying again."

    .line 31
    .line 32
    invoke-static {p3, v0}, Lcom/google/android/gms/internal/games_v2/zzez;->zza(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0}, Lcom/google/android/gms/internal/games_v2/zzbp;->zzc()Lcom/google/android/gms/internal/games_v2/zzs;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p0, p1, p2}, Lcom/google/android/gms/internal/games_v2/zzs;->zza(Lcom/google/android/gms/internal/games_v2/zzy;Z)Lcom/google/android/gms/tasks/Task;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

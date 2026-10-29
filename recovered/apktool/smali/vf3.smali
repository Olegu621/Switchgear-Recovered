.class public final Lvf3;
.super Lcom/google/android/gms/internal/playcore_age_signals/zze;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic b:Ldc0;

.field public final synthetic c:Lxg3;


# direct methods
.method public constructor <init>(Lxg3;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;Ldc0;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lvf3;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    iput-object p4, p0, Lvf3;->b:Ldc0;

    .line 4
    .line 5
    iput-object p1, p0, Lvf3;->c:Lxg3;

    .line 6
    .line 7
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/playcore_age_signals/zze;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/playcore_age_signals/zzp;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p1, La7;

    .line 6
    .line 7
    const/4 v0, -0x5

    .line 8
    invoke-direct {p1, v0}, La7;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/playcore_age_signals/zze;->zza(Ljava/lang/Exception;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/playcore_age_signals/zze;->zza(Ljava/lang/Exception;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final zzb()V
    .locals 7

    .line 1
    iget-object v0, p0, Lvf3;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lvf3;->c:Lxg3;

    .line 4
    .line 5
    iget-object v2, v1, Lxg3;->b:Lcom/google/android/gms/internal/playcore_age_signals/zzo;

    .line 6
    .line 7
    invoke-virtual {v2}, Lcom/google/android/gms/internal/playcore_age_signals/zzo;->zze()Landroid/os/IInterface;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Lcom/google/android/play/agesignals/protocol/IAgeSignalsService;

    .line 12
    .line 13
    iget-object v3, v1, Lxg3;->a:Landroid/content/Context;

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    new-instance v4, Landroid/os/Bundle;

    .line 20
    .line 21
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v5, "playcore.version.code"

    .line 25
    .line 26
    const/4 v6, 0x2

    .line 27
    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    new-instance v5, Lfg3;

    .line 31
    .line 32
    invoke-direct {v5, v1, v0}, Lfg3;-><init>(Lxg3;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v2, v3, v4, v5}, Lcom/google/android/play/agesignals/protocol/IAgeSignalsService;->n0(Ljava/lang/String;Landroid/os/Bundle;Lfg3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catch_0
    move-exception v1

    .line 40
    sget-object v2, Lxg3;->c:Lcom/google/android/gms/internal/playcore_age_signals/zzd;

    .line 41
    .line 42
    iget-object p0, p0, Lvf3;->b:Ldc0;

    .line 43
    .line 44
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const-string v3, "checkAgeSignals(%s)"

    .line 49
    .line 50
    invoke-virtual {v2, v1, v3, p0}, Lcom/google/android/gms/internal/playcore_age_signals/zzd;->zzb(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 51
    .line 52
    .line 53
    new-instance p0, La7;

    .line 54
    .line 55
    const/16 v1, -0x64

    .line 56
    .line 57
    invoke-direct {p0, v1}, La7;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    .line 61
    .line 62
    .line 63
    return-void
.end method

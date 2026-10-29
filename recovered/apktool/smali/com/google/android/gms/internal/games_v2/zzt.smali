.class public final synthetic Lcom/google/android/gms/internal/games_v2/zzt;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lc32;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/games_v2/zzw;

.field public final synthetic zzb:Lcom/google/android/gms/internal/games_v2/zzy;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/games_v2/zzw;Lcom/google/android/gms/internal/games_v2/zzy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/games_v2/zzt;->zza:Lcom/google/android/gms/internal/games_v2/zzw;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/games_v2/zzt;->zzb:Lcom/google/android/gms/internal/games_v2/zzy;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/games_v2/zzt;->zza:Lcom/google/android/gms/internal/games_v2/zzw;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/gms/internal/games_v2/zzt;->zzb:Lcom/google/android/gms/internal/games_v2/zzy;

    .line 4
    .line 5
    check-cast p1, Lcom/google/android/gms/internal/games_v2/zzx;

    .line 6
    .line 7
    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/google/android/gms/internal/games_v2/zzae;

    .line 14
    .line 15
    new-instance v1, Lcom/google/android/gms/internal/games_v2/zzv;

    .line 16
    .line 17
    invoke-direct {v1, v0, p2}, Lcom/google/android/gms/internal/games_v2/zzv;-><init>(Lcom/google/android/gms/internal/games_v2/zzw;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v1, p0}, Lcom/google/android/gms/internal/games_v2/zzae;->zzd(Lcom/google/android/gms/internal/games_v2/zzad;Lcom/google/android/gms/internal/games_v2/zzy;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

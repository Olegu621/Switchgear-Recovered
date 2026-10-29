.class public final synthetic Lcom/google/android/gms/internal/playcore_age_signals/zzg;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/playcore_age_signals/zzo;

.field public final synthetic zzb:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/playcore_age_signals/zzo;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/playcore_age_signals/zzg;->zza:Lcom/google/android/gms/internal/playcore_age_signals/zzo;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/playcore_age_signals/zzg;->zzb:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/playcore_age_signals/zzg;->zza:Lcom/google/android/gms/internal/playcore_age_signals/zzo;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/gms/internal/playcore_age_signals/zzg;->zzb:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 4
    .line 5
    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/playcore_age_signals/zzo;->zzk(Lcom/google/android/gms/internal/playcore_age_signals/zzo;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/Task;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

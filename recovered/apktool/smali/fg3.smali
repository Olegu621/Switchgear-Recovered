.class public final Lfg3;
.super Lcom/google/android/play/agesignals/protocol/IAgeSignalsServiceCallback$Stub;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lcom/google/android/gms/internal/playcore_age_signals/zzd;

.field public final b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic c:Lxg3;


# direct methods
.method public constructor <init>(Lxg3;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfg3;->c:Lxg3;

    .line 5
    .line 6
    const-string p1, "com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback"

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/playcore_age_signals/zzb;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Lcom/google/android/gms/internal/playcore_age_signals/zzd;

    .line 12
    .line 13
    const-string v0, "OnCheckAgeSignalsCallback"

    .line 14
    .line 15
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/playcore_age_signals/zzd;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lfg3;->a:Lcom/google/android/gms/internal/playcore_age_signals/zzd;

    .line 19
    .line 20
    iput-object p2, p0, Lfg3;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 21
    .line 22
    return-void
.end method

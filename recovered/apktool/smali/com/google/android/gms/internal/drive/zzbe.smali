.class final Lcom/google/android/gms/internal/drive/zzbe;
.super Lum2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum2;"
    }
.end annotation


# instance fields
.field private final synthetic zzep:Lar2;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/drive/zzbb;Lar2;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/drive/zzbe;->zzep:Lar2;

    .line 2
    .line 3
    invoke-direct {p0}, Lum2;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final synthetic doExecute(Lx8;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/drive/zzaw;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/android/gms/internal/drive/zzeo;

    .line 8
    .line 9
    new-instance v0, Lcom/google/android/gms/internal/drive/zzgu;

    .line 10
    .line 11
    new-instance v1, Lcom/google/android/gms/internal/drive/zzei;

    .line 12
    .line 13
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzbe;->zzep:Lar2;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/drive/zzei;-><init>(Lar2;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/drive/zzgu;-><init>(Lcom/google/android/gms/internal/drive/zzei;)V

    .line 19
    .line 20
    .line 21
    new-instance p0, Lcom/google/android/gms/internal/drive/zzhr;

    .line 22
    .line 23
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/drive/zzhr;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v0, p0}, Lcom/google/android/gms/internal/drive/zzeo;->zza(Lcom/google/android/gms/internal/drive/zzgu;Lcom/google/android/gms/internal/drive/zzeq;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

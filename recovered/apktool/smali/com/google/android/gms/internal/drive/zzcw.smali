.class final Lcom/google/android/gms/internal/drive/zzcw;
.super Lum2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum2;"
    }
.end annotation


# instance fields
.field private final synthetic zzdv:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/drive/zzch;I)V
    .locals 0

    .line 1
    const/high16 p1, 0x20000000

    .line 2
    .line 3
    iput p1, p0, Lcom/google/android/gms/internal/drive/zzcw;->zzdv:I

    .line 4
    .line 5
    invoke-direct {p0}, Lum2;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic doExecute(Lx8;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1
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
    new-instance v0, Lcom/google/android/gms/internal/drive/zzr;

    .line 10
    .line 11
    iget p0, p0, Lcom/google/android/gms/internal/drive/zzcw;->zzdv:I

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/drive/zzr;-><init>(I)V

    .line 14
    .line 15
    .line 16
    new-instance p0, Lcom/google/android/gms/internal/drive/zzhi;

    .line 17
    .line 18
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/drive/zzhi;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0, p0}, Lcom/google/android/gms/internal/drive/zzeo;->zza(Lcom/google/android/gms/internal/drive/zzr;Lcom/google/android/gms/internal/drive/zzeq;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

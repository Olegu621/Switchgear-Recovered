.class final Lcom/google/android/gms/internal/drive/zzct;
.super Lum2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum2;"
    }
.end annotation


# instance fields
.field private final synthetic zzfs:Lja0;

.field private final synthetic zzft:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/drive/zzch;Lja0;I)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/drive/zzct;->zzfs:Lja0;

    .line 2
    .line 3
    iput p3, p0, Lcom/google/android/gms/internal/drive/zzct;->zzft:I

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
    .locals 3
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
    new-instance v0, Lcom/google/android/gms/internal/drive/zzgj;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzct;->zzfs:Lja0;

    .line 12
    .line 13
    invoke-interface {v1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget p0, p0, Lcom/google/android/gms/internal/drive/zzct;->zzft:I

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v0, v1, p0, v2}, Lcom/google/android/gms/internal/drive/zzgj;-><init>(Lcom/google/android/gms/drive/DriveId;II)V

    .line 21
    .line 22
    .line 23
    new-instance p0, Lcom/google/android/gms/internal/drive/zzhi;

    .line 24
    .line 25
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/drive/zzhi;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, v0, p0}, Lcom/google/android/gms/internal/drive/zzeo;->zza(Lcom/google/android/gms/internal/drive/zzgj;Lcom/google/android/gms/internal/drive/zzeq;)Lcom/google/android/gms/internal/drive/zzec;

    .line 29
    .line 30
    .line 31
    return-void
.end method

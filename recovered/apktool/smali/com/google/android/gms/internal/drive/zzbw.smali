.class final Lcom/google/android/gms/internal/drive/zzbw;
.super Lcom/google/android/gms/internal/drive/zzl;


# instance fields
.field private final zzdx:Lhi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhi;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhi;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhi;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/drive/zzl;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzbw;->zzdx:Lhi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/common/api/Status;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 21
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzbw;->zzdx:Lhi;

    new-instance v0, Lcom/google/android/gms/internal/drive/zzbz;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/drive/zzbz;-><init>(Lcom/google/android/gms/common/api/Status;Lka0;)V

    invoke-interface {p0, v0}, Lhi;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/drive/zzfn;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzbw;->zzdx:Lhi;

    .line 2
    .line 3
    new-instance v0, Lcom/google/android/gms/internal/drive/zzbz;

    .line 4
    .line 5
    new-instance v1, Lcom/google/android/gms/internal/drive/zzbs;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/google/android/gms/internal/drive/zzfn;->zzdd:Lcom/google/android/gms/drive/DriveId;

    .line 8
    .line 9
    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/drive/zzbs;-><init>(Lcom/google/android/gms/drive/DriveId;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, Lcom/google/android/gms/common/api/Status;->e:Lcom/google/android/gms/common/api/Status;

    .line 13
    .line 14
    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/drive/zzbz;-><init>(Lcom/google/android/gms/common/api/Status;Lka0;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, v0}, Lhi;->setResult(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

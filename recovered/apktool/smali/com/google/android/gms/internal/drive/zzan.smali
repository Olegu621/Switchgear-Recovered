.class final Lcom/google/android/gms/internal/drive/zzan;
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
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzan;->zzdx:Lhi;

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

    .line 28
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzan;->zzdx:Lhi;

    new-instance v0, Lcom/google/android/gms/internal/drive/zzao;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/drive/zzao;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/DriveId;)V

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

    .line 25
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzan;->zzdx:Lhi;

    new-instance v0, Lcom/google/android/gms/internal/drive/zzao;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->e:Lcom/google/android/gms/common/api/Status;

    .line 26
    iget-object p1, p1, Lcom/google/android/gms/internal/drive/zzfn;->zzdd:Lcom/google/android/gms/drive/DriveId;

    .line 27
    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/drive/zzao;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/DriveId;)V

    invoke-interface {p0, v0}, Lhi;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/drive/zzfy;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzan;->zzdx:Lhi;

    .line 2
    .line 3
    new-instance v0, Lcom/google/android/gms/internal/drive/zzao;

    .line 4
    .line 5
    new-instance v1, Lcom/google/android/gms/internal/drive/zzaa;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/google/android/gms/internal/drive/zzfy;->zzdn:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .line 8
    .line 9
    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/drive/zzaa;-><init>(Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ldi1;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget-object v1, Lcom/google/android/gms/common/api/Status;->e:Lcom/google/android/gms/common/api/Status;

    .line 17
    .line 18
    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/drive/zzao;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/DriveId;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0, v0}, Lhi;->setResult(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

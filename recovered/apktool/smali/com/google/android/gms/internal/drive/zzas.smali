.class final Lcom/google/android/gms/internal/drive/zzas;
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
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzas;->zzdx:Lhi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/common/api/Status;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 23
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzas;->zzdx:Lhi;

    new-instance v0, Lcom/google/android/gms/internal/drive/zzaq;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lcom/google/android/gms/internal/drive/zzaq;-><init>(Lcom/google/android/gms/common/api/Status;Lgi1;Z)V

    invoke-interface {p0, v0}, Lhi;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/drive/zzft;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    new-instance v0, Lgi1;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/google/android/gms/internal/drive/zzft;->zzii:Lcom/google/android/gms/common/data/DataHolder;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lgi1;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzas;->zzdx:Lhi;

    .line 9
    .line 10
    new-instance v1, Lcom/google/android/gms/internal/drive/zzaq;

    .line 11
    .line 12
    sget-object v2, Lcom/google/android/gms/common/api/Status;->e:Lcom/google/android/gms/common/api/Status;

    .line 13
    .line 14
    iget-boolean p1, p1, Lcom/google/android/gms/internal/drive/zzft;->zzea:Z

    .line 15
    .line 16
    invoke-direct {v1, v2, v0, p1}, Lcom/google/android/gms/internal/drive/zzaq;-><init>(Lcom/google/android/gms/common/api/Status;Lgi1;Z)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0, v1}, Lhi;->setResult(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

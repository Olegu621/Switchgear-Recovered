.class final Lcom/google/android/gms/internal/drive/zzgl;
.super Lcom/google/android/gms/internal/drive/zzl;


# instance fields
.field private final zzdx:Lhi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhi;"
        }
    .end annotation
.end field

.field private final zziq:Lia0;


# direct methods
.method public constructor <init>(Lhi;Lia0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhi;",
            "Lia0;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/drive/zzl;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzgl;->zzdx:Lhi;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/drive/zzgl;->zziq:Lia0;

    .line 7
    .line 8
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

    .line 37
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzgl;->zzdx:Lhi;

    new-instance v0, Lcom/google/android/gms/internal/drive/zzal;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/drive/zzal;-><init>(Lcom/google/android/gms/common/api/Status;Lfa0;)V

    invoke-interface {p0, v0}, Lhi;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/drive/zzfh;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p1, Lcom/google/android/gms/internal/drive/zzfh;->zzhv:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v1, v2, v2, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->e:Lcom/google/android/gms/common/api/Status;

    .line 14
    .line 15
    :goto_0
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzgl;->zzdx:Lhi;

    .line 16
    .line 17
    new-instance v1, Lcom/google/android/gms/internal/drive/zzal;

    .line 18
    .line 19
    new-instance v2, Lcom/google/android/gms/internal/drive/zzbi;

    .line 20
    .line 21
    iget-object p1, p1, Lcom/google/android/gms/internal/drive/zzfh;->zzes:Lcom/google/android/gms/drive/Contents;

    .line 22
    .line 23
    invoke-direct {v2, p1}, Lcom/google/android/gms/internal/drive/zzbi;-><init>(Lcom/google/android/gms/drive/Contents;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/drive/zzal;-><init>(Lcom/google/android/gms/common/api/Status;Lfa0;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p0, v1}, Lhi;->setResult(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/drive/zzfl;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 33
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzgl;->zziq:Lia0;

    if-eqz p0, :cond_0

    .line 34
    iget-wide v0, p1, Lcom/google/android/gms/internal/drive/zzfl;->zzhy:J

    .line 35
    iget-wide v2, p1, Lcom/google/android/gms/internal/drive/zzfl;->zzhz:J

    .line 36
    invoke-interface {p0, v0, v1, v2, v3}, Lia0;->onProgress(JJ)V

    :cond_0
    return-void
.end method

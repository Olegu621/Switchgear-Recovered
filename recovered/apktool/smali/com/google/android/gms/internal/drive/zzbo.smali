.class final Lcom/google/android/gms/internal/drive/zzbo;
.super Lcom/google/android/gms/internal/drive/zzam;


# instance fields
.field private final synthetic zzdv:I

.field private final synthetic zzey:Lia0;

.field private final synthetic zzez:Lcom/google/android/gms/internal/drive/zzbn;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/drive/zzbn;Ltr0;ILia0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzbo;->zzez:Lcom/google/android/gms/internal/drive/zzbn;

    .line 2
    .line 3
    iput p3, p0, Lcom/google/android/gms/internal/drive/zzbo;->zzdv:I

    .line 4
    .line 5
    iput-object p4, p0, Lcom/google/android/gms/internal/drive/zzbo;->zzey:Lia0;

    .line 6
    .line 7
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/drive/zzam;-><init>(Ltr0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final doExecute(Lx8;)V
    .locals 4
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
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzbo;->zzez:Lcom/google/android/gms/internal/drive/zzbn;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/google/android/gms/internal/drive/zzdp;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget v2, p0, Lcom/google/android/gms/internal/drive/zzbo;->zzdv:I

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/drive/zzgj;-><init>(Lcom/google/android/gms/drive/DriveId;II)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lcom/google/android/gms/internal/drive/zzgl;

    .line 24
    .line 25
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzbo;->zzey:Lia0;

    .line 26
    .line 27
    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/drive/zzgl;-><init>(Lhi;Lia0;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zzeo;->zza(Lcom/google/android/gms/internal/drive/zzgj;Lcom/google/android/gms/internal/drive/zzeq;)Lcom/google/android/gms/internal/drive/zzec;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p1, p1, Lcom/google/android/gms/internal/drive/zzec;->zzgs:Landroid/os/IBinder;

    .line 35
    .line 36
    sget v0, Lcom/google/android/gms/common/internal/ICancelToken$Stub;->a:I

    .line 37
    .line 38
    if-nez p1, :cond_0

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const-string v0, "com.google.android.gms.common.internal.ICancelToken"

    .line 43
    .line 44
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    instance-of v2, v1, Lcom/google/android/gms/common/internal/ICancelToken;

    .line 49
    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    move-object p1, v1

    .line 53
    check-cast p1, Lcom/google/android/gms/common/internal/ICancelToken;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    new-instance v1, Lcom/google/android/gms/common/internal/zzu;

    .line 57
    .line 58
    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    move-object p1, v1

    .line 62
    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setCancelToken(Lcom/google/android/gms/common/internal/ICancelToken;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

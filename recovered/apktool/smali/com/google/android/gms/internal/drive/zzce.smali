.class final Lcom/google/android/gms/internal/drive/zzce;
.super Lcom/google/android/gms/internal/drive/zzl;


# instance fields
.field private final zzdx:Lhi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhi;"
        }
    .end annotation
.end field

.field private final synthetic zzfk:Lcom/google/android/gms/internal/drive/zzcb;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/drive/zzcb;Lhi;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhi;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzce;->zzfk:Lcom/google/android/gms/internal/drive/zzcb;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/drive/zzl;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/drive/zzce;->zzdx:Lhi;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/drive/zzcb;Lhi;Lcom/google/android/gms/internal/drive/zzcc;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzce;-><init>(Lcom/google/android/gms/internal/drive/zzcb;Lhi;)V

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

    .line 19
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzce;->zzdx:Lhi;

    new-instance v1, Lcom/google/android/gms/internal/drive/zzcf;

    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzce;->zzfk:Lcom/google/android/gms/internal/drive/zzcb;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2, v2}, Lcom/google/android/gms/internal/drive/zzcf;-><init>(Lcom/google/android/gms/internal/drive/zzcb;Lcom/google/android/gms/common/api/Status;Lci0;Lcom/google/android/gms/internal/drive/zzcc;)V

    invoke-interface {v0, v1}, Lhi;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/drive/zzfj;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzce;->zzdx:Lhi;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/internal/drive/zzcf;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzce;->zzfk:Lcom/google/android/gms/internal/drive/zzcb;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/google/android/gms/internal/drive/zzfj;->zzhw:Lcom/google/android/gms/internal/drive/zzei;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    sget-object v3, Lcom/google/android/gms/common/api/Status;->e:Lcom/google/android/gms/common/api/Status;

    .line 11
    .line 12
    invoke-direct {v1, p0, v3, p1, v2}, Lcom/google/android/gms/internal/drive/zzcf;-><init>(Lcom/google/android/gms/internal/drive/zzcb;Lcom/google/android/gms/common/api/Status;Lci0;Lcom/google/android/gms/internal/drive/zzcc;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1}, Lhi;->setResult(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

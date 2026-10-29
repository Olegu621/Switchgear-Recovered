.class final Lcom/google/android/gms/internal/drive/zzaz;
.super Lcom/google/android/gms/internal/drive/zzav;


# instance fields
.field private final synthetic zzek:Lcom/google/android/gms/internal/drive/zzj;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/drive/zzaw;Ltr0;Lcom/google/android/gms/internal/drive/zzj;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lcom/google/android/gms/internal/drive/zzaz;->zzek:Lcom/google/android/gms/internal/drive/zzj;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/drive/zzav;-><init>(Ltr0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final synthetic doExecute(Lx8;)V
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
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzaz;->zzek:Lcom/google/android/gms/internal/drive/zzj;

    .line 10
    .line 11
    new-instance v1, Lcom/google/android/gms/internal/drive/zzgy;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/drive/zzgy;-><init>(Lhi;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    invoke-interface {p1, v0, p0, p0, v1}, Lcom/google/android/gms/internal/drive/zzeo;->zza(Lcom/google/android/gms/internal/drive/zzj;Lcom/google/android/gms/internal/drive/zzes;Ljava/lang/String;Lcom/google/android/gms/internal/drive/zzeq;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

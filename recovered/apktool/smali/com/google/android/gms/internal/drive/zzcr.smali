.class final Lcom/google/android/gms/internal/drive/zzcr;
.super Lum2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum2;"
    }
.end annotation


# instance fields
.field private final synthetic zzfq:Lla0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/drive/zzch;Lla0;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/drive/zzcr;->zzfq:Lla0;

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
    iget-boolean v0, p1, Lcom/google/android/gms/internal/drive/zzaw;->zzec:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/google/android/gms/internal/drive/zzeo;

    .line 12
    .line 13
    new-instance v0, Lcom/google/android/gms/internal/drive/zzj;

    .line 14
    .line 15
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzcr;->zzfq:Lla0;

    .line 16
    .line 17
    invoke-interface {p0}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-direct {v0, v1, p0}, Lcom/google/android/gms/internal/drive/zzj;-><init>(ILcom/google/android/gms/drive/DriveId;)V

    .line 23
    .line 24
    .line 25
    new-instance p0, Lcom/google/android/gms/internal/drive/zzhr;

    .line 26
    .line 27
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/drive/zzhr;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 28
    .line 29
    .line 30
    const/4 p2, 0x0

    .line 31
    invoke-interface {p1, v0, p2, p2, p0}, Lcom/google/android/gms/internal/drive/zzeo;->zza(Lcom/google/android/gms/internal/drive/zzj;Lcom/google/android/gms/internal/drive/zzes;Ljava/lang/String;Lcom/google/android/gms/internal/drive/zzeq;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    const-string p0, "Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions"

    .line 36
    .line 37
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

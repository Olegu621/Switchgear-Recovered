.class final Lcom/google/android/gms/internal/drive/zzcx;
.super Lum2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum2;"
    }
.end annotation


# instance fields
.field private final synthetic zzfx:Lfa0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/drive/zzch;Lfa0;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/drive/zzcx;->zzfx:Lfa0;

    .line 2
    .line 3
    invoke-direct {p0}, Lum2;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final doExecute(Lx8;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
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
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzcx;->zzfx:Lfa0;

    .line 12
    .line 13
    invoke-interface {v1}, Lfa0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzcx;->zzfx:Lfa0;

    .line 18
    .line 19
    invoke-interface {p0}, Lfa0;->zzi()Lcom/google/android/gms/drive/Contents;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget p0, p0, Lcom/google/android/gms/drive/Contents;->b:I

    .line 24
    .line 25
    const/high16 v2, 0x20000000

    .line 26
    .line 27
    invoke-direct {v0, v1, v2, p0}, Lcom/google/android/gms/internal/drive/zzgj;-><init>(Lcom/google/android/gms/drive/DriveId;II)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Lcom/google/android/gms/internal/drive/zzhi;

    .line 31
    .line 32
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/drive/zzhi;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1, v0, p0}, Lcom/google/android/gms/internal/drive/zzeo;->zza(Lcom/google/android/gms/internal/drive/zzgj;Lcom/google/android/gms/internal/drive/zzeq;)Lcom/google/android/gms/internal/drive/zzec;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.class final Lcom/google/android/gms/internal/drive/zzda;
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
    iput-object p2, p0, Lcom/google/android/gms/internal/drive/zzda;->zzfx:Lfa0;

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
    new-instance v0, Lcom/google/android/gms/internal/drive/zzo;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzda;->zzfx:Lfa0;

    .line 12
    .line 13
    invoke-interface {p0}, Lfa0;->zzi()Lcom/google/android/gms/drive/Contents;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iget p0, p0, Lcom/google/android/gms/drive/Contents;->b:I

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/drive/zzo;-><init>(IZ)V

    .line 21
    .line 22
    .line 23
    new-instance p0, Lcom/google/android/gms/internal/drive/zzhr;

    .line 24
    .line 25
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/drive/zzhr;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, v0, p0}, Lcom/google/android/gms/internal/drive/zzeo;->zza(Lcom/google/android/gms/internal/drive/zzo;Lcom/google/android/gms/internal/drive/zzeq;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.class final Lcom/google/android/gms/internal/drive/zzbc;
.super Lum2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum2;"
    }
.end annotation


# instance fields
.field private final synthetic zzdw:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/drive/zzbb;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/drive/zzbc;->zzdw:Ljava/lang/String;

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
    .locals 8
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
    new-instance v0, Lcom/google/android/gms/internal/drive/zzek;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzbc;->zzdw:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v2}, Lkb1;->n(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lcom/google/android/gms/drive/DriveId;

    .line 17
    .line 18
    const-wide/16 v5, -0x1

    .line 19
    .line 20
    const/4 v7, -0x1

    .line 21
    const-wide/16 v3, -0x1

    .line 22
    .line 23
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/drive/DriveId;-><init>(Ljava/lang/String;JJI)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    invoke-direct {v0, v1, p0}, Lcom/google/android/gms/internal/drive/zzek;-><init>(Lcom/google/android/gms/drive/DriveId;Z)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Lcom/google/android/gms/internal/drive/zzhl;

    .line 31
    .line 32
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/drive/zzhl;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1, v0, p0}, Lcom/google/android/gms/internal/drive/zzeo;->zza(Lcom/google/android/gms/internal/drive/zzek;Lcom/google/android/gms/internal/drive/zzeq;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

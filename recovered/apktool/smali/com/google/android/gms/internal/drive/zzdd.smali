.class final Lcom/google/android/gms/internal/drive/zzdd;
.super Lum2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum2;"
    }
.end annotation


# instance fields
.field private final synthetic zzfd:Lhi1;

.field private final synthetic zzfq:Lla0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/drive/zzch;Lhi1;Lla0;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/drive/zzdd;->zzfd:Lhi1;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/android/gms/internal/drive/zzdd;->zzfq:Lla0;

    .line 4
    .line 5
    invoke-direct {p0}, Lum2;-><init>()V

    .line 6
    .line 7
    .line 8
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
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzdd;->zzfd:Lhi1;

    .line 4
    .line 5
    iget-object v0, v0, Lhi1;->a:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->D1(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/google/android/gms/internal/drive/zzeo;

    .line 19
    .line 20
    new-instance v0, Lcom/google/android/gms/internal/drive/zzhf;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzdd;->zzfq:Lla0;

    .line 23
    .line 24
    invoke-interface {v1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzdd;->zzfd:Lhi1;

    .line 29
    .line 30
    iget-object p0, p0, Lhi1;->a:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .line 31
    .line 32
    invoke-direct {v0, v1, p0}, Lcom/google/android/gms/internal/drive/zzhf;-><init>(Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V

    .line 33
    .line 34
    .line 35
    new-instance p0, Lcom/google/android/gms/internal/drive/zzhp;

    .line 36
    .line 37
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/drive/zzhp;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1, v0, p0}, Lcom/google/android/gms/internal/drive/zzeo;->zza(Lcom/google/android/gms/internal/drive/zzhf;Lcom/google/android/gms/internal/drive/zzeq;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

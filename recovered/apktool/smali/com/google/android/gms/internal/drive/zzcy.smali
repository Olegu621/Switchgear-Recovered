.class final Lcom/google/android/gms/internal/drive/zzcy;
.super Lum2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum2;"
    }
.end annotation


# instance fields
.field private final synthetic zzew:Lhi1;

.field private final synthetic zzfx:Lfa0;

.field private final synthetic zzfy:Lgn3;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/drive/zzch;Lgn3;Lfa0;Lhi1;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/drive/zzcy;->zzfy:Lgn3;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/android/gms/internal/drive/zzcy;->zzfx:Lfa0;

    .line 4
    .line 5
    iput-object p4, p0, Lcom/google/android/gms/internal/drive/zzcy;->zzew:Lhi1;

    .line 6
    .line 7
    invoke-direct {p0}, Lum2;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final doExecute(Lx8;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/drive/zzaw;

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzcy;->zzfy:Lgn3;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzcy;->zzfx:Lfa0;

    .line 14
    .line 15
    invoke-interface {v0}, Lfa0;->zzj()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzcy;->zzew:Lhi1;

    .line 19
    .line 20
    iget-object v0, v0, Lhi1;->a:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->D1(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lcom/google/android/gms/internal/drive/zzeo;

    .line 34
    .line 35
    new-instance v0, Lcom/google/android/gms/internal/drive/zzm;

    .line 36
    .line 37
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzcy;->zzfx:Lfa0;

    .line 38
    .line 39
    invoke-interface {v1}, Lfa0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzcy;->zzew:Lhi1;

    .line 44
    .line 45
    iget-object v2, v2, Lhi1;->a:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .line 46
    .line 47
    iget-object v3, p0, Lcom/google/android/gms/internal/drive/zzcy;->zzfx:Lfa0;

    .line 48
    .line 49
    invoke-interface {v3}, Lfa0;->zzi()Lcom/google/android/gms/drive/Contents;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    iget v3, v3, Lcom/google/android/gms/drive/Contents;->b:I

    .line 54
    .line 55
    iget-object v4, p0, Lcom/google/android/gms/internal/drive/zzcy;->zzfx:Lfa0;

    .line 56
    .line 57
    invoke-interface {v4}, Lfa0;->zzi()Lcom/google/android/gms/drive/Contents;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    iget-boolean v4, v4, Lcom/google/android/gms/drive/Contents;->e:Z

    .line 62
    .line 63
    iget-object v5, p0, Lcom/google/android/gms/internal/drive/zzcy;->zzfy:Lgn3;

    .line 64
    .line 65
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/drive/zzm;-><init>(Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;IZLgn3;)V

    .line 66
    .line 67
    .line 68
    new-instance p0, Lcom/google/android/gms/internal/drive/zzhr;

    .line 69
    .line 70
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/drive/zzhr;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p1, v0, p0}, Lcom/google/android/gms/internal/drive/zzeo;->zza(Lcom/google/android/gms/internal/drive/zzm;Lcom/google/android/gms/internal/drive/zzeq;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

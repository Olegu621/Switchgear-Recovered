.class final Lcom/google/android/gms/internal/drive/zzbk;
.super Lcom/google/android/gms/internal/drive/zzav;


# instance fields
.field private final synthetic zzev:Lcom/google/android/gms/internal/drive/zzbi;

.field private final synthetic zzew:Lhi1;

.field private final synthetic zzex:Lgn3;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/drive/zzbi;Ltr0;Lhi1;Lgn3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzbk;->zzev:Lcom/google/android/gms/internal/drive/zzbi;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/android/gms/internal/drive/zzbk;->zzew:Lhi1;

    .line 4
    .line 5
    iput-object p4, p0, Lcom/google/android/gms/internal/drive/zzbk;->zzex:Lgn3;

    .line 6
    .line 7
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/drive/zzav;-><init>(Ltr0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final doExecute(Lx8;)V
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
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzbk;->zzew:Lhi1;

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
    new-instance v0, Lcom/google/android/gms/internal/drive/zzm;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzbk;->zzev:Lcom/google/android/gms/internal/drive/zzbi;

    .line 23
    .line 24
    invoke-static {v1}, Lcom/google/android/gms/internal/drive/zzbi;->zza(Lcom/google/android/gms/internal/drive/zzbi;)Lcom/google/android/gms/drive/Contents;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v1, v1, Lcom/google/android/gms/drive/Contents;->d:Lcom/google/android/gms/drive/DriveId;

    .line 29
    .line 30
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzbk;->zzew:Lhi1;

    .line 31
    .line 32
    iget-object v2, v2, Lhi1;->a:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .line 33
    .line 34
    iget-object v3, p0, Lcom/google/android/gms/internal/drive/zzbk;->zzev:Lcom/google/android/gms/internal/drive/zzbi;

    .line 35
    .line 36
    invoke-static {v3}, Lcom/google/android/gms/internal/drive/zzbi;->zza(Lcom/google/android/gms/internal/drive/zzbi;)Lcom/google/android/gms/drive/Contents;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget v3, v3, Lcom/google/android/gms/drive/Contents;->b:I

    .line 41
    .line 42
    iget-object v4, p0, Lcom/google/android/gms/internal/drive/zzbk;->zzev:Lcom/google/android/gms/internal/drive/zzbi;

    .line 43
    .line 44
    invoke-static {v4}, Lcom/google/android/gms/internal/drive/zzbi;->zza(Lcom/google/android/gms/internal/drive/zzbi;)Lcom/google/android/gms/drive/Contents;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    iget-boolean v4, v4, Lcom/google/android/gms/drive/Contents;->e:Z

    .line 49
    .line 50
    iget-object v5, p0, Lcom/google/android/gms/internal/drive/zzbk;->zzex:Lgn3;

    .line 51
    .line 52
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/drive/zzm;-><init>(Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;IZLgn3;)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Lcom/google/android/gms/internal/drive/zzgy;

    .line 56
    .line 57
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/drive/zzgy;-><init>(Lhi;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zzeo;->zza(Lcom/google/android/gms/internal/drive/zzm;Lcom/google/android/gms/internal/drive/zzeq;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.class final Lcom/google/android/gms/internal/drive/zzdt;
.super Lcom/google/android/gms/internal/drive/zzea;


# instance fields
.field private final synthetic zzfd:Lhi1;

.field private final synthetic zzgq:Lcom/google/android/gms/internal/drive/zzdp;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/drive/zzdp;Ltr0;Lhi1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzdt;->zzgq:Lcom/google/android/gms/internal/drive/zzdp;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/android/gms/internal/drive/zzdt;->zzfd:Lhi1;

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/drive/zzea;-><init>(Lcom/google/android/gms/internal/drive/zzdp;Ltr0;Lcom/google/android/gms/internal/drive/zzdq;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final doExecute(Lx8;)V
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
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzdt;->zzfd:Lhi1;

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
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzdt;->zzgq:Lcom/google/android/gms/internal/drive/zzdp;

    .line 23
    .line 24
    iget-object v1, v1, Lcom/google/android/gms/internal/drive/zzdp;->zzk:Lcom/google/android/gms/drive/DriveId;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzdt;->zzfd:Lhi1;

    .line 27
    .line 28
    iget-object v2, v2, Lhi1;->a:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .line 29
    .line 30
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/drive/zzhf;-><init>(Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lcom/google/android/gms/internal/drive/zzdy;

    .line 34
    .line 35
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/drive/zzdy;-><init>(Lhi;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zzeo;->zza(Lcom/google/android/gms/internal/drive/zzhf;Lcom/google/android/gms/internal/drive/zzeq;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.class final Lcom/google/android/gms/internal/drive/zzbt;
.super Lcom/google/android/gms/internal/drive/zzby;


# instance fields
.field private final synthetic zzfd:Lhi1;

.field private final synthetic zzfe:I

.field private final synthetic zzff:I

.field private final synthetic zzfg:Lkf0;

.field private final synthetic zzfh:Lcom/google/android/gms/internal/drive/zzbs;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/drive/zzbs;Ltr0;Lhi1;IILkf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzbt;->zzfh:Lcom/google/android/gms/internal/drive/zzbs;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/android/gms/internal/drive/zzbt;->zzfd:Lhi1;

    .line 4
    .line 5
    iput p4, p0, Lcom/google/android/gms/internal/drive/zzbt;->zzfe:I

    .line 6
    .line 7
    iput p5, p0, Lcom/google/android/gms/internal/drive/zzbt;->zzff:I

    .line 8
    .line 9
    iput-object p6, p0, Lcom/google/android/gms/internal/drive/zzbt;->zzfg:Lkf0;

    .line 10
    .line 11
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/drive/zzby;-><init>(Ltr0;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final doExecute(Lx8;)V
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
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzbt;->zzfd:Lhi1;

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
    new-instance v2, Lcom/google/android/gms/internal/drive/zzw;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzbt;->zzfh:Lcom/google/android/gms/internal/drive/zzbs;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/google/android/gms/internal/drive/zzdp;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzbt;->zzfd:Lhi1;

    .line 23
    .line 24
    iget-object v4, v0, Lhi1;->a:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .line 25
    .line 26
    iget v5, p0, Lcom/google/android/gms/internal/drive/zzbt;->zzfe:I

    .line 27
    .line 28
    iget v6, p0, Lcom/google/android/gms/internal/drive/zzbt;->zzff:I

    .line 29
    .line 30
    iget-object v7, p0, Lcom/google/android/gms/internal/drive/zzbt;->zzfg:Lkf0;

    .line 31
    .line 32
    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/drive/zzw;-><init>(Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;IILkf0;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lcom/google/android/gms/internal/drive/zzeo;

    .line 40
    .line 41
    new-instance v0, Lcom/google/android/gms/internal/drive/zzbv;

    .line 42
    .line 43
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/drive/zzbv;-><init>(Lhi;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p1, v2, v0}, Lcom/google/android/gms/internal/drive/zzeo;->zza(Lcom/google/android/gms/internal/drive/zzw;Lcom/google/android/gms/internal/drive/zzeq;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

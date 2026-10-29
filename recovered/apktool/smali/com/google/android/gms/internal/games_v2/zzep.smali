.class public final synthetic Lcom/google/android/gms/internal/games_v2/zzep;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lc32;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/games/snapshot/Snapshot;

.field public final synthetic zzb:Lmf2;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/games/snapshot/Snapshot;Lmf2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/games_v2/zzep;->zza:Lcom/google/android/gms/games/snapshot/Snapshot;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/games_v2/zzep;->zzb:Lmf2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/games_v2/zzep;->zza:Lcom/google/android/gms/games/snapshot/Snapshot;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/gms/internal/games_v2/zzep;->zzb:Lmf2;

    .line 4
    .line 5
    check-cast p1, Lnd3;

    .line 6
    .line 7
    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Lcom/google/android/gms/games/snapshot/Snapshot;->v1()Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;->isClosed()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    xor-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    const-string v3, "Snapshot already closed"

    .line 23
    .line 24
    invoke-static {v3, v2}, Lkb1;->p(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    move-object v2, p0

    .line 28
    check-cast v2, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChangeEntity;

    .line 29
    .line 30
    iget-object v2, v2, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChangeEntity;->d:Lcom/google/android/gms/common/data/BitmapTeleporter;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-string p0, "Cannot set null temp directory"

    .line 46
    .line 47
    invoke-static {p0}, Ln4;->s(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    :goto_0
    iget-object v2, v1, Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;->a:Lcom/google/android/gms/drive/Contents;

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    iput-object v3, v1, Lcom/google/android/gms/games/snapshot/SnapshotContentsEntity;->a:Lcom/google/android/gms/drive/Contents;

    .line 55
    .line 56
    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Lcom/google/android/gms/games/internal/zzap;

    .line 61
    .line 62
    new-instance v1, Ldd3;

    .line 63
    .line 64
    const/16 v3, 0x9

    .line 65
    .line 66
    invoke-direct {v1, p2, v3}, Ldd3;-><init>(Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v0}, Lcom/google/android/gms/games/snapshot/Snapshot;->getMetadata()Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-object v0, v0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;->c:Ljava/lang/String;

    .line 74
    .line 75
    check-cast p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChangeEntity;

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/google/android/gms/internal/games_v2/zza;->zza()Landroid/os/Parcel;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/games_v2/zzc;->zzf(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v3, p0}, Lcom/google/android/gms/internal/games_v2/zzc;->zzd(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/games_v2/zzc;->zzd(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 91
    .line 92
    .line 93
    const/16 p0, 0x2ee7

    .line 94
    .line 95
    invoke-virtual {p1, p0, v3}, Lcom/google/android/gms/internal/games_v2/zza;->zzc(ILandroid/os/Parcel;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :catch_0
    invoke-static {p2}, Ljb1;->I(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

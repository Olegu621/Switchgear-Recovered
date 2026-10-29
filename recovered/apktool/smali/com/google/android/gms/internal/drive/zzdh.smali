.class final Lcom/google/android/gms/internal/drive/zzdh;
.super Lum2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum2;"
    }
.end annotation


# instance fields
.field private final zzfj:Lka0;

.field private final zzgc:Lhi1;

.field private zzgd:Lkf0;

.field private zzge:Ljava/lang/String;

.field private zzgf:Lbl3;

.field private final zzo:Lfa0;


# direct methods
.method public constructor <init>(Lka0;Lhi1;Lfa0;Lkf0;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lum2;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzdh;->zzfj:Lka0;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/drive/zzdh;->zzgc:Lhi1;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/drive/zzdh;->zzo:Lfa0;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/drive/zzdh;->zzgd:Lkf0;

    .line 11
    .line 12
    const/4 p5, 0x0

    .line 13
    iput-object p5, p0, Lcom/google/android/gms/internal/drive/zzdh;->zzge:Ljava/lang/String;

    .line 14
    .line 15
    const-string v0, "DriveFolder must not be null"

    .line 16
    .line 17
    invoke-static {p1, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v0, "Folder\'s DriveId must not be null"

    .line 25
    .line 26
    invoke-static {p1, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string p1, "MetadataChangeSet must not be null"

    .line 30
    .line 31
    invoke-static {p2, p1}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string p1, "ExecutionOptions must not be null"

    .line 35
    .line 36
    invoke-static {p4, p1}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, Lhi1;->a()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, Lbl3;->a(Ljava/lang/String;)Lbl3;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzdh;->zzgf:Lbl3;

    .line 48
    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    iget-object p0, p1, Lbl3;->a:Ljava/lang/String;

    .line 52
    .line 53
    const-string p1, "application/vnd.google-apps.folder"

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const-string p0, "May not create folders using this method. Use DriveFolderManagerClient#createFolder() instead of mime type application/vnd.google-apps.folder"

    .line 63
    .line 64
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p5

    .line 68
    :cond_1
    :goto_0
    if-eqz p3, :cond_5

    .line 69
    .line 70
    instance-of p0, p3, Lcom/google/android/gms/internal/drive/zzbi;

    .line 71
    .line 72
    if-eqz p0, :cond_4

    .line 73
    .line 74
    invoke-interface {p3}, Lfa0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-nez p0, :cond_3

    .line 79
    .line 80
    invoke-interface {p3}, Lfa0;->zzk()Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-nez p0, :cond_2

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    const-string p0, "DriveContents are already closed."

    .line 88
    .line 89
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p5

    .line 93
    :cond_3
    const-string p0, "Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation."

    .line 94
    .line 95
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p5

    .line 99
    :cond_4
    const-string p0, "Only DriveContents obtained from the Drive API are accepted."

    .line 100
    .line 101
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p5

    .line 105
    :cond_5
    :goto_1
    return-void
.end method


# virtual methods
.method public final doExecute(Lx8;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/drive/zzaw;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzdh;->zzgd:Lkf0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzdh;->zzgc:Lhi1;

    .line 9
    .line 10
    iget-object v1, v0, Lhi1;->a:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, v2}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->D1(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzdh;->zzo:Lfa0;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzdh;->zzgf:Lbl3;

    .line 22
    .line 23
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/drive/zzbs;->zza(Lfa0;Lbl3;)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzdh;->zzgf:Lbl3;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget-object v1, v1, Lbl3;->a:Ljava/lang/String;

    .line 32
    .line 33
    const-string v2, "application/vnd.google-apps"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    :goto_0
    move v7, v1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    const/4 v1, 0x0

    .line 45
    goto :goto_0

    .line 46
    :goto_1
    new-instance v3, Lcom/google/android/gms/internal/drive/zzw;

    .line 47
    .line 48
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzdh;->zzfj:Lka0;

    .line 49
    .line 50
    invoke-interface {v1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iget-object v5, v0, Lhi1;->a:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .line 55
    .line 56
    iget-object v8, p0, Lcom/google/android/gms/internal/drive/zzdh;->zzgd:Lkf0;

    .line 57
    .line 58
    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/drive/zzw;-><init>(Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;IILkf0;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Lcom/google/android/gms/internal/drive/zzeo;

    .line 66
    .line 67
    new-instance p1, Lcom/google/android/gms/internal/drive/zzhj;

    .line 68
    .line 69
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/drive/zzhj;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p0, v3, p1}, Lcom/google/android/gms/internal/drive/zzeo;->zza(Lcom/google/android/gms/internal/drive/zzw;Lcom/google/android/gms/internal/drive/zzeq;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.class final Lcom/google/android/gms/internal/drive/zzao;
.super Ljava/lang/Object;

# interfaces
.implements Lp42;


# instance fields
.field private final zzdy:Lcom/google/android/gms/common/api/Status;

.field private final zzk:Lcom/google/android/gms/drive/DriveId;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/DriveId;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzao;->zzdy:Lcom/google/android/gms/common/api/Status;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/drive/zzao;->zzk:Lcom/google/android/gms/drive/DriveId;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getDriveId()Lcom/google/android/gms/drive/DriveId;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzao;->zzk:Lcom/google/android/gms/drive/DriveId;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzao;->zzdy:Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    return-object p0
.end method

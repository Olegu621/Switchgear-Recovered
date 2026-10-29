.class final Lcom/google/android/gms/internal/drive/zzal;
.super Ljava/lang/Object;

# interfaces
.implements Lb32;
.implements Lp42;


# instance fields
.field private final zzdy:Lcom/google/android/gms/common/api/Status;

.field private final zzo:Lfa0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lfa0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzal;->zzdy:Lcom/google/android/gms/common/api/Status;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/drive/zzal;->zzo:Lfa0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getDriveContents()Lfa0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzal;->zzo:Lfa0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzal;->zzdy:Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    return-object p0
.end method

.method public final release()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzal;->zzo:Lfa0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Lfa0;->zzj()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

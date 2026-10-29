.class final Lcom/google/android/gms/internal/drive/zzcu;
.super Lp22;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp22;"
    }
.end annotation


# instance fields
.field private final synthetic zzfs:Lja0;

.field private final synthetic zzft:I

.field private final synthetic zzfu:Lcom/google/android/gms/internal/drive/zzg;

.field private final synthetic zzfv:Lv81;

.field private final synthetic zzfw:Lcom/google/android/gms/internal/drive/zzch;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/drive/zzch;Lv81;Lja0;ILcom/google/android/gms/internal/drive/zzg;Lv81;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzcu;->zzfw:Lcom/google/android/gms/internal/drive/zzch;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/android/gms/internal/drive/zzcu;->zzfs:Lja0;

    .line 4
    .line 5
    iput p4, p0, Lcom/google/android/gms/internal/drive/zzcu;->zzft:I

    .line 6
    .line 7
    iput-object p5, p0, Lcom/google/android/gms/internal/drive/zzcu;->zzfu:Lcom/google/android/gms/internal/drive/zzg;

    .line 8
    .line 9
    iput-object p6, p0, Lcom/google/android/gms/internal/drive/zzcu;->zzfv:Lv81;

    .line 10
    .line 11
    invoke-direct {p0, p2}, Lp22;-><init>(Lv81;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final registerListener(Lx8;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/drive/zzaw;

    .line 2
    .line 3
    new-instance v0, Lcom/google/android/gms/internal/drive/zzgj;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzcu;->zzfs:Lja0;

    .line 6
    .line 7
    invoke-interface {v1}, Lla0;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget v2, p0, Lcom/google/android/gms/internal/drive/zzcu;->zzft:I

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/drive/zzgj;-><init>(Lcom/google/android/gms/drive/DriveId;II)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/google/android/gms/internal/drive/zzeo;

    .line 22
    .line 23
    new-instance v1, Lcom/google/android/gms/internal/drive/zzdk;

    .line 24
    .line 25
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzcu;->zzfw:Lcom/google/android/gms/internal/drive/zzch;

    .line 26
    .line 27
    iget-object v3, p0, Lcom/google/android/gms/internal/drive/zzcu;->zzfu:Lcom/google/android/gms/internal/drive/zzg;

    .line 28
    .line 29
    iget-object v4, p0, Lcom/google/android/gms/internal/drive/zzcu;->zzfv:Lv81;

    .line 30
    .line 31
    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/internal/drive/zzdk;-><init>(Lcom/google/android/gms/internal/drive/zzch;Lw81;Lv81;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/drive/zzeo;->zza(Lcom/google/android/gms/internal/drive/zzgj;Lcom/google/android/gms/internal/drive/zzeq;)Lcom/google/android/gms/internal/drive/zzec;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzcu;->zzfu:Lcom/google/android/gms/internal/drive/zzg;

    .line 39
    .line 40
    iget-object p1, p1, Lcom/google/android/gms/internal/drive/zzec;->zzgs:Landroid/os/IBinder;

    .line 41
    .line 42
    sget v0, Lcom/google/android/gms/common/internal/ICancelToken$Stub;->a:I

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    if-nez p1, :cond_0

    .line 46
    .line 47
    move-object v2, v0

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const-string v1, "com.google.android.gms.common.internal.ICancelToken"

    .line 50
    .line 51
    invoke-interface {p1, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    instance-of v3, v2, Lcom/google/android/gms/common/internal/ICancelToken;

    .line 56
    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    check-cast v2, Lcom/google/android/gms/common/internal/ICancelToken;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    new-instance v2, Lcom/google/android/gms/common/internal/zzu;

    .line 63
    .line 64
    invoke-direct {v2, p1, v1}, Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/drive/zzg;->setCancelToken(Lcom/google/android/gms/common/internal/ICancelToken;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

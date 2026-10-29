.class public final Lcom/google/android/gms/common/zzt;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/zzt;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lal3;

.field public final c:Z

.field public final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldr3;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldr3;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/google/android/gms/common/zzt;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lal3;ZZ)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, Lcom/google/android/gms/common/zzt;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/common/zzt;->b:Lal3;

    iput-boolean p3, p0, Lcom/google/android/gms/common/zzt;->c:Z

    iput-boolean p4, p0, Lcom/google/android/gms/common/zzt;->d:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/os/IBinder;ZZ)V
    .locals 5

    .line 1
    const-string v0, "Could not unwrap certificate"

    .line 2
    .line 3
    const-string v1, "GoogleCertificatesQuery"

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/gms/common/zzt;->a:Ljava/lang/String;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    :try_start_0
    sget v2, Lcom/google/android/gms/common/internal/zzw;->a:I

    .line 15
    .line 16
    const-string v2, "com.google.android.gms.common.internal.ICertData"

    .line 17
    .line 18
    invoke-interface {p2, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    instance-of v4, v3, Lcom/google/android/gms/common/internal/zzx;

    .line 23
    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    check-cast v3, Lcom/google/android/gms/common/internal/zzx;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    new-instance v3, Lcom/google/android/gms/common/internal/zzv;

    .line 30
    .line 31
    invoke-direct {v3, p2, v2}, Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-interface {v3}, Lcom/google/android/gms/common/internal/zzx;->zzd()Lcom/google/android/gms/dynamic/IObjectWrapper;

    .line 35
    .line 36
    .line 37
    move-result-object p2
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    if-nez p2, :cond_2

    .line 39
    .line 40
    move-object p2, p1

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-static {p2}, Lcom/google/android/gms/dynamic/ObjectWrapper;->b(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    check-cast p2, [B

    .line 47
    .line 48
    :goto_1
    if-eqz p2, :cond_3

    .line 49
    .line 50
    new-instance p1, Lal3;

    .line 51
    .line 52
    invoke-direct {p1, p2}, Lal3;-><init>([B)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    invoke-static {v1, v0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :catch_0
    move-exception p2

    .line 61
    invoke-static {v1, v0, p2}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 62
    .line 63
    .line 64
    :goto_2
    iput-object p1, p0, Lcom/google/android/gms/common/zzt;->b:Lal3;

    .line 65
    .line 66
    iput-boolean p3, p0, Lcom/google/android/gms/common/zzt;->c:Z

    .line 67
    .line 68
    iput-boolean p4, p0, Lcom/google/android/gms/common/zzt;->d:Z

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    const/16 p2, 0x4f45

    .line 2
    .line 3
    invoke-static {p2, p1}, Lw11;->c0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    iget-object v2, p0, Lcom/google/android/gms/common/zzt;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {p1, v1, v2, v0}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/google/android/gms/common/zzt;->b:Lal3;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const-string v0, "GoogleCertificatesQuery"

    .line 19
    .line 20
    const-string v1, "certificate binder is null"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    :cond_0
    const/4 v1, 0x2

    .line 27
    invoke-static {p1, v1, v0}, Lw11;->O(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x3

    .line 31
    const/4 v1, 0x4

    .line 32
    invoke-static {p1, v0, v1}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 33
    .line 34
    .line 35
    iget-boolean v0, p0, Lcom/google/android/gms/common/zzt;->c:Z

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v1, v1}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 41
    .line 42
    .line 43
    iget-boolean p0, p0, Lcom/google/android/gms/common/zzt;->d:Z

    .line 44
    .line 45
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    .line 46
    .line 47
    .line 48
    invoke-static {p2, p1}, Lw11;->f0(ILandroid/os/Parcel;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

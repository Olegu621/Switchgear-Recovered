.class public final Lnd3;
.super Lkr0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lgm3;

.field public final b:Ljava/lang/String;

.field public c:Lcom/google/android/gms/games/PlayerEntity;

.field public final d:Lsd3;

.field public e:Z

.field public final f:J

.field public final i:Lin3;

.field public final v:Ltd3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lwv;Lin3;Lrr0;Lsr0;)V
    .locals 8

    .line 1
    sget-object v0, Ltd3;->b:Ltd3;

    .line 2
    .line 3
    const/4 v4, 0x1

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move-object v5, p3

    .line 8
    move-object v6, p5

    .line 9
    move-object v7, p6

    .line 10
    invoke-direct/range {v1 .. v7}, Lkr0;-><init>(Landroid/content/Context;Landroid/os/Looper;ILwv;Lxy;Lwp1;)V

    .line 11
    .line 12
    .line 13
    new-instance p0, Lgm3;

    .line 14
    .line 15
    invoke-direct {p0, v1}, Lgm3;-><init>(Lnd3;)V

    .line 16
    .line 17
    .line 18
    iput-object p0, v1, Lnd3;->a:Lgm3;

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    iput-boolean p0, v1, Lnd3;->e:Z

    .line 22
    .line 23
    iget-object p0, v5, Lwv;->e:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p0, v1, Lnd3;->b:Ljava/lang/String;

    .line 26
    .line 27
    iput-object v0, v1, Lnd3;->v:Ltd3;

    .line 28
    .line 29
    new-instance p0, Lsd3;

    .line 30
    .line 31
    invoke-direct {p0, v1}, Lsd3;-><init>(Lnd3;)V

    .line 32
    .line 33
    .line 34
    iput-object p0, v1, Lnd3;->d:Lsd3;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    int-to-long p1, p1

    .line 41
    iput-wide p1, v1, Lnd3;->f:J

    .line 42
    .line 43
    iput-object p4, v1, Lnd3;->i:Lin3;

    .line 44
    .line 45
    instance-of p1, v2, Landroid/app/Activity;

    .line 46
    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    invoke-virtual {p0, p1}, Lsd3;->b(Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
.end method

.method public static d(Lnd3;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/google/android/gms/games/internal/zzap;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/games_v2/zza;->zza()Landroid/os/Parcel;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/16 v1, 0x61b7

    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/games_v2/zza;->zzb(ILandroid/os/Parcel;)Landroid/os/Parcel;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object v0, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 18
    .line 19
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/games_v2/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Landroid/app/PendingIntent;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    .line 26
    .line 27
    .line 28
    new-instance p0, Lcom/google/android/gms/common/api/Status;

    .line 29
    .line 30
    const/16 v1, 0x684f

    .line 31
    .line 32
    invoke-static {v1}, Lhu0;->f0(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-direct {p0, v1, v2, v0, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Lvn0;

    .line 41
    .line 42
    invoke-direct {v0, p0}, Li9;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catch_0
    move-exception p0

    .line 50
    invoke-virtual {p1, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/String;IZZ)V
    .locals 3

    .line 1
    const-string v0, "played_with"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "friends_all"

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const-string p3, "Invalid player collection: "

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/String;

    .line 33
    .line 34
    invoke-direct {p1, p3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p0

    .line 41
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lcom/google/android/gms/games/internal/zzap;

    .line 46
    .line 47
    new-instance v1, Lbd3;

    .line 48
    .line 49
    const/4 v2, 0x1

    .line 50
    invoke-direct {v1, p0, p1, v2}, Lbd3;-><init>(Lnd3;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/google/android/gms/internal/games_v2/zza;->zza()Landroid/os/Parcel;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0, v1}, Lcom/google/android/gms/internal/games_v2/zzc;->zzf(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p3}, Landroid/os/Parcel;->writeInt(I)V

    .line 64
    .line 65
    .line 66
    invoke-static {p0, p4}, Lcom/google/android/gms/internal/games_v2/zzc;->zzc(Landroid/os/Parcel;Z)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0, p5}, Lcom/google/android/gms/internal/games_v2/zzc;->zzc(Landroid/os/Parcel;Z)V

    .line 70
    .line 71
    .line 72
    const/16 p2, 0x233c

    .line 73
    .line 74
    invoke-virtual {v0, p2, p0}, Lcom/google/android/gms/internal/games_v2/zza;->zzc(ILandroid/os/Parcel;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :catch_0
    invoke-static {p1}, Ljb1;->I(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final c(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/String;JLjava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/google/android/gms/games/internal/zzap;

    .line 6
    .line 7
    new-instance v0, Ldd3;

    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    invoke-direct {v0, p1, v1}, Ldd3;-><init>(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/android/gms/internal/games_v2/zza;->zza()Landroid/os/Parcel;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/games_v2/zzc;->zzf(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p3, p4}, Landroid/os/Parcel;->writeLong(J)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p5}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/16 p2, 0x1b5a

    .line 30
    .line 31
    invoke-virtual {p0, p2, v1}, Lcom/google/android/gms/internal/games_v2/zza;->zzc(ILandroid/os/Parcel;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_0
    invoke-static {p1}, Ljb1;->I(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final connect(Lei;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lnd3;->c:Lcom/google/android/gms/games/PlayerEntity;

    .line 3
    .line 4
    invoke-super {p0, p1}, Lcom/google/android/gms/common/internal/a;->connect(Lei;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final createServiceInterface(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string p0, "com.google.android.gms.games.internal.IGamesService"

    .line 6
    .line 7
    invoke-interface {p1, p0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Lcom/google/android/gms/games/internal/zzap;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    check-cast v0, Lcom/google/android/gms/games/internal/zzap;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    new-instance v0, Lcom/google/android/gms/games/internal/zzap;

    .line 19
    .line 20
    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/internal/games_v2/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final disconnect()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lnd3;->e:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->isConnected()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    :try_start_0
    iget-object v0, p0, Lnd3;->a:Lgm3;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/games_v2/zzak;->zzb()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lcom/google/android/gms/games/internal/zzap;

    .line 20
    .line 21
    iget-wide v1, p0, Lnd3;->f:J

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/google/android/gms/internal/games_v2/zza;->zza()Landroid/os/Parcel;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3, v1, v2}, Landroid/os/Parcel;->writeLong(J)V

    .line 28
    .line 29
    .line 30
    const/16 v1, 0x1389

    .line 31
    .line 32
    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/games_v2/zza;->zzc(ILandroid/os/Parcel;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catch_0
    const-string v0, "GamesGmsClientImpl"

    .line 37
    .line 38
    const-string v1, "Failed to notify client disconnect."

    .line 39
    .line 40
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/games_v2/zzez;->zzg(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    :goto_0
    invoke-super {p0}, Lcom/google/android/gms/common/internal/a;->disconnect()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->isConnected()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/google/android/gms/games/internal/zzap;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/android/gms/internal/games_v2/zza;->zza()Landroid/os/Parcel;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/16 v1, 0x138e

    .line 18
    .line 19
    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/games_v2/zza;->zzc(ILandroid/os/Parcel;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catch_0
    move-exception p0

    .line 24
    const-string v0, "GamesGmsClientImpl"

    .line 25
    .line 26
    const-string v1, "service died"

    .line 27
    .line 28
    invoke-static {v0, v1, p0}, Lcom/google/android/gms/internal/games_v2/zzez;->zzh(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final getApiFeatures()[Lcom/google/android/gms/common/Feature;
    .locals 0

    .line 1
    sget-object p0, Lhe3;->e:[Lcom/google/android/gms/common/Feature;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getConnectionHint()Landroid/os/Bundle;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final getGetServiceRequestExtraArgs()Landroid/os/Bundle;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lnd3;->i:Lin3;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v2, Landroid/os/Bundle;

    .line 25
    .line 26
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v3, "com.google.android.gms.games.key.isHeadless"

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    const-string v3, "com.google.android.gms.games.key.showConnectingPopup"

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    invoke-virtual {v2, v3, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    const-string v3, "com.google.android.gms.games.key.connectingPopupGravity"

    .line 42
    .line 43
    const/16 v5, 0x11

    .line 44
    .line 45
    invoke-virtual {v2, v3, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    const-string v3, "com.google.android.gms.games.key.retryingSignIn"

    .line 49
    .line 50
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v3, "com.google.android.gms.games.key.sdkVariant"

    .line 54
    .line 55
    iget v5, v1, Lin3;->a:I

    .line 56
    .line 57
    invoke-virtual {v2, v3, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 58
    .line 59
    .line 60
    const-string v3, "com.google.android.gms.games.key.forceResolveAccountKey"

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    invoke-virtual {v2, v3, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v3, "com.google.android.gms.games.key.proxyApis"

    .line 67
    .line 68
    iget-object v6, v1, Lin3;->b:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {v2, v3, v6}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 71
    .line 72
    .line 73
    const-string v3, "com.google.android.gms.games.key.unauthenticated"

    .line 74
    .line 75
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const-string v3, "com.google.android.gms.games.key.skipPgaCheck"

    .line 79
    .line 80
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    const-string v3, "com.google.android.gms.games.key.skipWelcomePopup"

    .line 84
    .line 85
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 86
    .line 87
    .line 88
    const-string v3, "com.google.android.gms.games.key.googleSignInAccount"

    .line 89
    .line 90
    iget-object v4, v1, Lin3;->c:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 91
    .line 92
    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 93
    .line 94
    .line 95
    const-string v3, "com.google.android.gms.games.key.realClientPackageName"

    .line 96
    .line 97
    invoke-virtual {v2, v3, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const-string v3, "com.google.android.gms.games.key.API_VERSION"

    .line 101
    .line 102
    const/16 v4, 0x9

    .line 103
    .line 104
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 105
    .line 106
    .line 107
    const-string v5, "com.google.android.gms.games.key.gameRunToken"

    .line 108
    .line 109
    iget-object v1, v1, Lin3;->d:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v2, v5, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    const-string v1, "com.google.android.gms.games.key.gamePackageName"

    .line 115
    .line 116
    iget-object v5, p0, Lnd3;->b:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v2, v1, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const-string v1, "com.google.android.gms.games.key.desiredLocale"

    .line 122
    .line 123
    invoke-virtual {v2, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    new-instance v0, Lcom/google/android/gms/common/internal/BinderWrapper;

    .line 127
    .line 128
    iget-object v1, p0, Lnd3;->d:Lsd3;

    .line 129
    .line 130
    iget-object v1, v1, Lsd3;->b:Lcom/google/android/gms/internal/games_v2/zzam;

    .line 131
    .line 132
    iget-object v1, v1, Lcom/google/android/gms/internal/games_v2/zzam;->zza:Landroid/os/IBinder;

    .line 133
    .line 134
    invoke-direct {v0, v1}, Lcom/google/android/gms/common/internal/BinderWrapper;-><init>(Landroid/os/IBinder;)V

    .line 135
    .line 136
    .line 137
    const-string v1, "com.google.android.gms.games.key.popupWindowToken"

    .line 138
    .line 139
    invoke-virtual {v2, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-nez v0, :cond_0

    .line 147
    .line 148
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 149
    .line 150
    .line 151
    :cond_0
    invoke-virtual {p0}, Lkr0;->getClientSettings()Lwv;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-static {p0}, Lie2;->b(Lwv;)Landroid/os/Bundle;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    const-string v0, "com.google.android.gms.games.key.signInOptions"

    .line 160
    .line 161
    invoke-virtual {v2, v0, p0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 162
    .line 163
    .line 164
    return-object v2
.end method

.method public final getMinApkVersion()I
    .locals 0

    .line 1
    const p0, 0xbdfcb8

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final getScopesForConnectionlessNonSignIn()Ljava/util/Set;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkr0;->getScopes()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getServiceDescriptor()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "com.google.android.gms.games.internal.IGamesService"

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStartServiceAction()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "com.google.android.gms.games.service.START"

    .line 2
    .line 3
    return-object p0
.end method

.method public final onConnectedLocked(Landroid/os/IInterface;)V
    .locals 4

    .line 1
    check-cast p1, Lcom/google/android/gms/games/internal/zzap;

    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/google/android/gms/common/internal/a;->onConnectedLocked(Landroid/os/IInterface;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lnd3;->e:Z

    .line 7
    .line 8
    iget-object v1, p0, Lnd3;->d:Lsd3;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Lsd3;->c()V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lnd3;->e:Z

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lnd3;->i:Lin3;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/games_v2/zzan;

    .line 24
    .line 25
    iget-object v1, v1, Lsd3;->b:Lcom/google/android/gms/internal/games_v2/zzam;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/games_v2/zzan;-><init>(Lcom/google/android/gms/internal/games_v2/zzam;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Ljn3;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Ljn3;-><init>(Lcom/google/android/gms/internal/games_v2/zzan;)V

    .line 33
    .line 34
    .line 35
    iget-wide v2, p0, Lnd3;->f:J

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/google/android/gms/internal/games_v2/zza;->zza()Landroid/os/Parcel;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0, v1}, Lcom/google/android/gms/internal/games_v2/zzc;->zzf(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 45
    .line 46
    .line 47
    const/16 v0, 0x3c8d

    .line 48
    .line 49
    invoke-virtual {p1, v0, p0}, Lcom/google/android/gms/internal/games_v2/zza;->zzc(ILandroid/os/Parcel;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :catch_0
    move-exception p0

    .line 54
    const-string p1, "GamesGmsClientImpl"

    .line 55
    .line 56
    const-string v0, "service died"

    .line 57
    .line 58
    invoke-static {p1, v0, p0}, Lcom/google/android/gms/internal/games_v2/zzez;->zzh(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/android/gms/common/internal/a;->onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lnd3;->e:Z

    .line 6
    .line 7
    return-void
.end method

.method public final onPostInitHandler(ILandroid/os/IBinder;Landroid/os/Bundle;I)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    const-class v0, Lnd3;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p3, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "show_welcome_popup"

    .line 16
    .line 17
    invoke-virtual {p3, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput-boolean v0, p0, Lnd3;->e:Z

    .line 22
    .line 23
    const-string v0, "com.google.android.gms.games.current_player"

    .line 24
    .line 25
    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lcom/google/android/gms/games/PlayerEntity;

    .line 30
    .line 31
    iput-object v0, p0, Lnd3;->c:Lcom/google/android/gms/games/PlayerEntity;

    .line 32
    .line 33
    const-string v0, "com.google.android.gms.games.current_game"

    .line 34
    .line 35
    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/google/android/gms/games/GameEntity;

    .line 40
    .line 41
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lcom/google/android/gms/common/internal/a;->onPostInitHandler(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final onUserSignOut(Lfi;)V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lqf3;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lqf3;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lnd3;->a:Lgm3;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/google/android/gms/internal/games_v2/zzak;->zzb()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    .line 9
    .line 10
    .line 11
    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lcom/google/android/gms/games/internal/zzap;

    .line 16
    .line 17
    new-instance v1, Ldd3;

    .line 18
    .line 19
    const/16 v2, 0xe

    .line 20
    .line 21
    invoke-direct {v1, v0, v2}, Ldd3;-><init>(Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/google/android/gms/internal/games_v2/zza;->zza()Landroid/os/Parcel;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/games_v2/zzc;->zzf(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 29
    .line 30
    .line 31
    const/16 v1, 0x138a

    .line 32
    .line 33
    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/games_v2/zza;->zzc(ILandroid/os/Parcel;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catch_0
    const/4 p0, 0x4

    .line 38
    :try_start_2
    invoke-static {p0}, Lhu0;->f0(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    iget-object p0, v0, Lqf3;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Lfi;

    .line 44
    .line 45
    check-cast p0, Lfs0;

    .line 46
    .line 47
    invoke-virtual {p0}, Lfs0;->v()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catch_1
    check-cast p1, Lfs0;

    .line 52
    .line 53
    invoke-virtual {p1}, Lfs0;->v()V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final requiresAccount()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final requiresSignIn()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnd3;->i:Lin3;

    .line 2
    .line 3
    iget-object p0, p0, Lin3;->e:Lnl3;

    .line 4
    .line 5
    iget-boolean p0, p0, Lnl3;->c:Z

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x1

    .line 12
    return p0
.end method

.method public final usesClientTelemetry()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

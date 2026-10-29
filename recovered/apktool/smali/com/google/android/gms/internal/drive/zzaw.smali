.class public final Lcom/google/android/gms/internal/drive/zzaw;
.super Lkr0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkr0;"
    }
.end annotation


# instance fields
.field private final zzeb:Ljava/lang/String;

.field protected final zzec:Z

.field private volatile zzed:Lcom/google/android/gms/drive/DriveId;

.field private volatile zzee:Lcom/google/android/gms/drive/DriveId;

.field private volatile zzef:Z

.field private final zzeg:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/android/gms/drive/DriveId;",
            "Ljava/util/Map<",
            "Lss;",
            "Lcom/google/android/gms/internal/drive/zzee;",
            ">;>;"
        }
    .end annotation
.end field

.field private final zzeh:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/android/gms/drive/events/DriveEventService;",
            "Lcom/google/android/gms/internal/drive/zzee;",
            ">;"
        }
    .end annotation
.end field

.field private final zzei:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/android/gms/drive/DriveId;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/drive/zzee;",
            ">;>;"
        }
    .end annotation
.end field

.field private final zzej:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/android/gms/drive/DriveId;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/drive/zzee;",
            ">;>;"
        }
    .end annotation
.end field

.field private final zzz:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lwv;Lrr0;Lsr0;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    const/16 v3, 0xb

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    move-object v6, p5

    .line 9
    invoke-direct/range {v0 .. v6}, Lkr0;-><init>(Landroid/content/Context;Landroid/os/Looper;ILwv;Lxy;Lwp1;)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    iput-boolean p0, v0, Lcom/google/android/gms/internal/drive/zzaw;->zzef:Z

    .line 14
    .line 15
    new-instance p1, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, Lcom/google/android/gms/internal/drive/zzaw;->zzeg:Ljava/util/Map;

    .line 21
    .line 22
    new-instance p1, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, v0, Lcom/google/android/gms/internal/drive/zzaw;->zzeh:Ljava/util/Map;

    .line 28
    .line 29
    new-instance p1, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, v0, Lcom/google/android/gms/internal/drive/zzaw;->zzei:Ljava/util/Map;

    .line 35
    .line 36
    new-instance p1, Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, Lcom/google/android/gms/internal/drive/zzaw;->zzej:Ljava/util/Map;

    .line 42
    .line 43
    iget-object p1, v4, Lwv;->e:Ljava/lang/String;

    .line 44
    .line 45
    iput-object p1, v0, Lcom/google/android/gms/internal/drive/zzaw;->zzeb:Ljava/lang/String;

    .line 46
    .line 47
    iput-object p6, v0, Lcom/google/android/gms/internal/drive/zzaw;->zzz:Landroid/os/Bundle;

    .line 48
    .line 49
    new-instance p1, Landroid/content/Intent;

    .line 50
    .line 51
    const-string p2, "com.google.android.gms.drive.events.HANDLE_EVENT"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p2, p1, p0}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    if-eqz p3, :cond_2

    .line 76
    .line 77
    const/4 p4, 0x0

    .line 78
    const/4 p5, 0x1

    .line 79
    if-ne p3, p5, :cond_1

    .line 80
    .line 81
    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, Landroid/content/pm/ResolveInfo;

    .line 86
    .line 87
    iget-object p0, p0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 88
    .line 89
    iget-boolean p1, p0, Landroid/content/pm/ServiceInfo;->exported:Z

    .line 90
    .line 91
    if-eqz p1, :cond_0

    .line 92
    .line 93
    iput-boolean p5, v0, Lcom/google/android/gms/internal/drive/zzaw;->zzec:Z

    .line 94
    .line 95
    return-void

    .line 96
    :cond_0
    iget-object p0, p0, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    add-int/lit8 p1, p1, 0x3c

    .line 107
    .line 108
    const-string p2, "Drive event service "

    .line 109
    .line 110
    const-string p3, " must be exported in AndroidManifest.xml"

    .line 111
    .line 112
    invoke-static {p1, p2, p0, p3}, Lio/sentry/u2;->j(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    throw p4

    .line 116
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    add-int/lit8 p1, p1, 0x48

    .line 129
    .line 130
    const-string p2, "AndroidManifest.xml can only define one service that handles the "

    .line 131
    .line 132
    const-string p3, " action"

    .line 133
    .line 134
    invoke-static {p1, p2, p0, p3}, Lio/sentry/u2;->j(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    throw p4

    .line 138
    :cond_2
    iput-boolean p0, v0, Lcom/google/android/gms/internal/drive/zzaw;->zzec:Z

    .line 139
    .line 140
    return-void
.end method


# virtual methods
.method public final synthetic createServiceInterface(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string p0, "com.google.android.gms.drive.internal.IDriveService"

    .line 6
    .line 7
    invoke-interface {p1, p0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    instance-of v0, p0, Lcom/google/android/gms/internal/drive/zzeo;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    check-cast p0, Lcom/google/android/gms/internal/drive/zzeo;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_1
    new-instance p0, Lcom/google/android/gms/internal/drive/zzep;

    .line 19
    .line 20
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/drive/zzep;-><init>(Landroid/os/IBinder;)V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public final disconnect()V
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
    move-result-object v0

    .line 11
    check-cast v0, Lcom/google/android/gms/internal/drive/zzeo;

    .line 12
    .line 13
    new-instance v1, Lcom/google/android/gms/internal/drive/zzad;

    .line 14
    .line 15
    invoke-direct {v1}, Lcom/google/android/gms/internal/drive/zzad;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/drive/zzeo;->zza(Lcom/google/android/gms/internal/drive/zzad;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    :catch_0
    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/common/internal/a;->disconnect()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzeg:Ljava/util/Map;

    .line 25
    .line 26
    monitor-enter v0

    .line 27
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzeg:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 30
    .line 31
    .line 32
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 33
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzeh:Ljava/util/Map;

    .line 34
    .line 35
    monitor-enter v1

    .line 36
    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzeh:Ljava/util/Map;

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 39
    .line 40
    .line 41
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 42
    iget-object v0, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzei:Ljava/util/Map;

    .line 43
    .line 44
    monitor-enter v0

    .line 45
    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzei:Ljava/util/Map;

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 48
    .line 49
    .line 50
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 51
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzej:Ljava/util/Map;

    .line 52
    .line 53
    monitor-enter v1

    .line 54
    :try_start_4
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzej:Ljava/util/Map;

    .line 55
    .line 56
    invoke-interface {p0}, Ljava/util/Map;->clear()V

    .line 57
    .line 58
    .line 59
    monitor-exit v1

    .line 60
    return-void

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 63
    throw p0

    .line 64
    :catchall_1
    move-exception p0

    .line 65
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 66
    throw p0

    .line 67
    :catchall_2
    move-exception p0

    .line 68
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 69
    throw p0

    .line 70
    :catchall_3
    move-exception p0

    .line 71
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 72
    throw p0
.end method

.method public final getGetServiceRequestExtraArgs()Landroid/os/Bundle;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lkr0;->getClientSettings()Lwv;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v1, v1, Lwv;->c:Ljava/util/Set;

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    xor-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    invoke-static {v1}, Lkb1;->r(Z)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Landroid/os/Bundle;

    .line 28
    .line 29
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzeb:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    const-string v0, "proxy_package_name"

    .line 41
    .line 42
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzeb:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzz:Landroid/os/Bundle;

    .line 48
    .line 49
    invoke-virtual {v1, p0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 50
    .line 51
    .line 52
    return-object v1
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

.method public final getServiceDescriptor()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "com.google.android.gms.drive.internal.IDriveService"

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStartServiceAction()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "com.google.android.gms.drive.ApiService.START"

    .line 2
    .line 3
    return-object p0
.end method

.method public final onPostInitHandler(ILandroid/os/IBinder;Landroid/os/Bundle;I)V
    .locals 1

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    const-class v0, Lcom/google/android/gms/internal/drive/zzaw;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p3, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "com.google.android.gms.drive.root_id"

    .line 13
    .line 14
    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/google/android/gms/drive/DriveId;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzed:Lcom/google/android/gms/drive/DriveId;

    .line 21
    .line 22
    const-string v0, "com.google.android.gms.drive.appdata_id"

    .line 23
    .line 24
    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lcom/google/android/gms/drive/DriveId;

    .line 29
    .line 30
    iput-object v0, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzee:Lcom/google/android/gms/drive/DriveId;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzef:Z

    .line 34
    .line 35
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lcom/google/android/gms/common/internal/a;->onPostInitHandler(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    .line 36
    .line 37
    .line 38
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
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzeb:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {p0, v0}, Lyy1;->x(Landroid/content/Context;I)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez p0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 35
    return p0
.end method

.method public final zza(Ltr0;Lcom/google/android/gms/drive/DriveId;Lss;)Lsr1;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Lcom/google/android/gms/drive/DriveId;",
            "Lss;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    move v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-static {v1}, Lkb1;->g(Z)V

    .line 8
    .line 9
    .line 10
    const-string v1, "listener"

    .line 11
    .line 12
    invoke-static {p3, v1}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->isConnected()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const-string v2, "Client must be connected"

    .line 20
    .line 21
    invoke-static {v2, v1}, Lkb1;->p(Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzeg:Ljava/util/Map;

    .line 25
    .line 26
    monitor-enter v1

    .line 27
    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzeg:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/util/Map;

    .line 34
    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    new-instance v2, Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v3, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzeg:Ljava/util/Map;

    .line 43
    .line 44
    invoke-interface {v3, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto :goto_3

    .line 50
    :cond_1
    :goto_1
    invoke-interface {v2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Lcom/google/android/gms/internal/drive/zzee;

    .line 55
    .line 56
    if-nez v3, :cond_2

    .line 57
    .line 58
    new-instance v3, Lcom/google/android/gms/internal/drive/zzee;

    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->getLooper()Landroid/os/Looper;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-direct {v3, v4, v5, v0, p3}, Lcom/google/android/gms/internal/drive/zzee;-><init>(Landroid/os/Looper;Landroid/content/Context;ILej3;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v2, p3, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_2
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/drive/zzee;->zzg(I)Z

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    if-eqz p3, :cond_3

    .line 80
    .line 81
    new-instance p0, Lcom/google/android/gms/internal/drive/zzat;

    .line 82
    .line 83
    sget-object p2, Lcom/google/android/gms/common/api/Status;->e:Lcom/google/android/gms/common/api/Status;

    .line 84
    .line 85
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzat;-><init>(Ltr0;Lcom/google/android/gms/common/api/Status;)V

    .line 86
    .line 87
    .line 88
    monitor-exit v1

    .line 89
    return-object p0

    .line 90
    :cond_3
    :goto_2
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/drive/zzee;->zzf(I)V

    .line 91
    .line 92
    .line 93
    new-instance p3, Lcom/google/android/gms/internal/drive/zzj;

    .line 94
    .line 95
    invoke-direct {p3, v0, p2}, Lcom/google/android/gms/internal/drive/zzj;-><init>(ILcom/google/android/gms/drive/DriveId;)V

    .line 96
    .line 97
    .line 98
    new-instance p2, Lcom/google/android/gms/internal/drive/zzax;

    .line 99
    .line 100
    invoke-direct {p2, p0, p1, p3, v3}, Lcom/google/android/gms/internal/drive/zzax;-><init>(Lcom/google/android/gms/internal/drive/zzaw;Ltr0;Lcom/google/android/gms/internal/drive/zzj;Lcom/google/android/gms/internal/drive/zzee;)V

    .line 101
    .line 102
    .line 103
    check-cast p1, Leb3;

    .line 104
    .line 105
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 106
    .line 107
    invoke-virtual {p0, p2}, Lor0;->doWrite(Lgi;)Lgi;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    monitor-exit v1

    .line 112
    return-object p0

    .line 113
    :goto_3
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    throw p0
.end method

.method public final zzae()Lcom/google/android/gms/drive/DriveId;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzed:Lcom/google/android/gms/drive/DriveId;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zzaf()Lcom/google/android/gms/drive/DriveId;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzee:Lcom/google/android/gms/drive/DriveId;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zzag()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzef:Z

    .line 2
    .line 3
    return p0
.end method

.method public final zzah()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzec:Z

    .line 2
    .line 3
    return p0
.end method

.method public final zzb(Ltr0;Lcom/google/android/gms/drive/DriveId;Lss;)Lsr1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Lcom/google/android/gms/drive/DriveId;",
            "Lss;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    move v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-static {v1}, Lkb1;->g(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/gms/common/internal/a;->isConnected()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const-string v2, "Client must be connected"

    .line 15
    .line 16
    invoke-static {v2, v1}, Lkb1;->p(Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    const-string v1, "listener"

    .line 20
    .line 21
    invoke-static {p3, v1}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzeg:Ljava/util/Map;

    .line 25
    .line 26
    monitor-enter v1

    .line 27
    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzeg:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/util/Map;

    .line 34
    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    new-instance p0, Lcom/google/android/gms/internal/drive/zzat;

    .line 38
    .line 39
    sget-object p2, Lcom/google/android/gms/common/api/Status;->e:Lcom/google/android/gms/common/api/Status;

    .line 40
    .line 41
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzat;-><init>(Ltr0;Lcom/google/android/gms/common/api/Status;)V

    .line 42
    .line 43
    .line 44
    monitor-exit v1

    .line 45
    return-object p0

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-interface {v2, p3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    check-cast p3, Lcom/google/android/gms/internal/drive/zzee;

    .line 53
    .line 54
    if-nez p3, :cond_2

    .line 55
    .line 56
    new-instance p0, Lcom/google/android/gms/internal/drive/zzat;

    .line 57
    .line 58
    sget-object p2, Lcom/google/android/gms/common/api/Status;->e:Lcom/google/android/gms/common/api/Status;

    .line 59
    .line 60
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzat;-><init>(Ltr0;Lcom/google/android/gms/common/api/Status;)V

    .line 61
    .line 62
    .line 63
    monitor-exit v1

    .line 64
    return-object p0

    .line 65
    :cond_2
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_3

    .line 70
    .line 71
    iget-object v2, p0, Lcom/google/android/gms/internal/drive/zzaw;->zzeg:Ljava/util/Map;

    .line 72
    .line 73
    invoke-interface {v2, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    :cond_3
    new-instance v2, Lcom/google/android/gms/internal/drive/zzgs;

    .line 77
    .line 78
    invoke-direct {v2, p2, v0}, Lcom/google/android/gms/internal/drive/zzgs;-><init>(Lcom/google/android/gms/drive/DriveId;I)V

    .line 79
    .line 80
    .line 81
    new-instance p2, Lcom/google/android/gms/internal/drive/zzay;

    .line 82
    .line 83
    invoke-direct {p2, p0, p1, v2, p3}, Lcom/google/android/gms/internal/drive/zzay;-><init>(Lcom/google/android/gms/internal/drive/zzaw;Ltr0;Lcom/google/android/gms/internal/drive/zzgs;Lcom/google/android/gms/internal/drive/zzee;)V

    .line 84
    .line 85
    .line 86
    check-cast p1, Leb3;

    .line 87
    .line 88
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 89
    .line 90
    invoke-virtual {p0, p2}, Lor0;->doWrite(Lgi;)Lgi;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    monitor-exit v1

    .line 95
    return-object p0

    .line 96
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    throw p0
.end method

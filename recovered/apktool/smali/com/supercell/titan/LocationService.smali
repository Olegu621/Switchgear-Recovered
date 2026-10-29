.class public Lcom/supercell/titan/LocationService;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/location/LocationListener;
.implements Lcom/supercell/titan/GameApp$ActivityEventListener;


# static fields
.field public static e:Landroid/location/Location;


# instance fields
.field public final a:[Ljava/lang/String;

.field public final b:Landroid/location/LocationManager;

.field public final c:Lcom/supercell/titan/GameApp;

.field public d:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    .line 5
    .line 6
    filled-new-array {v0}, [Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/supercell/titan/LocationService;->a:[Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/supercell/titan/LocationService;->c:Lcom/supercell/titan/GameApp;

    .line 17
    .line 18
    const-string v1, "location"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroid/location/LocationManager;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/supercell/titan/LocationService;->b:Landroid/location/LocationManager;

    .line 27
    .line 28
    return-void
.end method

.method public static a(Landroid/location/Location;Landroid/location/Location;)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    if-nez p0, :cond_1

    .line 9
    .line 10
    goto/16 :goto_8

    .line 11
    .line 12
    :cond_1
    invoke-virtual {p0}, Landroid/location/Location;->getTime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    sub-long/2addr v2, v4

    .line 21
    const-wide/32 v4, 0x1d4c0

    .line 22
    .line 23
    .line 24
    cmp-long v4, v2, v4

    .line 25
    .line 26
    if-lez v4, :cond_2

    .line 27
    .line 28
    move v4, v0

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    move v4, v1

    .line 31
    :goto_0
    const-wide/32 v5, -0x1d4c0

    .line 32
    .line 33
    .line 34
    cmp-long v5, v2, v5

    .line 35
    .line 36
    if-gez v5, :cond_3

    .line 37
    .line 38
    move v5, v0

    .line 39
    goto :goto_1

    .line 40
    :cond_3
    move v5, v1

    .line 41
    :goto_1
    const-wide/16 v6, 0x0

    .line 42
    .line 43
    cmp-long v2, v2, v6

    .line 44
    .line 45
    if-lez v2, :cond_4

    .line 46
    .line 47
    move v2, v0

    .line 48
    goto :goto_2

    .line 49
    :cond_4
    move v2, v1

    .line 50
    :goto_2
    if-eqz v4, :cond_5

    .line 51
    .line 52
    goto :goto_7

    .line 53
    :cond_5
    if-eqz v5, :cond_6

    .line 54
    .line 55
    goto :goto_8

    .line 56
    :cond_6
    invoke-virtual {p0}, Landroid/location/Location;->getAccuracy()F

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    sub-float/2addr v3, v4

    .line 65
    float-to-int v3, v3

    .line 66
    if-lez v3, :cond_7

    .line 67
    .line 68
    move v4, v0

    .line 69
    goto :goto_3

    .line 70
    :cond_7
    move v4, v1

    .line 71
    :goto_3
    if-gez v3, :cond_8

    .line 72
    .line 73
    move v5, v0

    .line 74
    goto :goto_4

    .line 75
    :cond_8
    move v5, v1

    .line 76
    :goto_4
    const/16 v6, 0xc8

    .line 77
    .line 78
    if-le v3, v6, :cond_9

    .line 79
    .line 80
    move v3, v0

    .line 81
    goto :goto_5

    .line 82
    :cond_9
    move v3, v1

    .line 83
    :goto_5
    invoke-virtual {p0}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-nez p0, :cond_b

    .line 92
    .line 93
    if-nez p1, :cond_a

    .line 94
    .line 95
    move p0, v0

    .line 96
    goto :goto_6

    .line 97
    :cond_a
    move p0, v1

    .line 98
    goto :goto_6

    .line 99
    :cond_b
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    :goto_6
    if-eqz v5, :cond_c

    .line 104
    .line 105
    goto :goto_7

    .line 106
    :cond_c
    if-eqz v2, :cond_d

    .line 107
    .line 108
    if-nez v4, :cond_d

    .line 109
    .line 110
    goto :goto_7

    .line 111
    :cond_d
    if-eqz v2, :cond_e

    .line 112
    .line 113
    if-nez v3, :cond_e

    .line 114
    .line 115
    if-eqz p0, :cond_e

    .line 116
    .line 117
    :goto_7
    return v0

    .line 118
    :cond_e
    :goto_8
    return v1
.end method

.method public static native locationChanged(JDD)V
.end method


# virtual methods
.method public init(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/supercell/titan/LocationService;->d:J

    .line 2
    .line 3
    return-void
.end method

.method public isEnabled()Z
    .locals 4

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_0
    iget-object p0, p0, Lcom/supercell/titan/LocationService;->c:Lcom/supercell/titan/GameApp;

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const v0, 0x21d

    const-string v2, "location_mode"

    .line 9
    .line 10
    invoke-static {p0, v2}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result p0
    :try_end_0
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception p0

    .line 16
    const v0, 0x21e

    const-string v2, "LocationService"

    .line 17
    .line 18
    const v0, 0x21f

    const-string v3, "Error checking location mode"

    .line 19
    .line 20
    invoke-static {v2, v3, p0}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move p0, v1

    .line 24
    :goto_0
    if-eqz p0, :cond_0

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    :cond_0
    return v1
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 3

    .line 1
    sput-object p1, Lcom/supercell/titan/LocationService;->e:Landroid/location/Location;

    .line 2
    .line 3
    new-instance v0, Lcp0;

    .line 4
    .line 5
    const/16 v1, 0x11

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, p0, p1, v1, v2}, Lcp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lcom/supercell/titan/LocationService;->c:Lcom/supercell/titan/GameApp;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/supercell/titan/GameApp;->runOnView(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_2

    .line 3
    .line 4
    iget-object p1, p0, Lcom/supercell/titan/LocationService;->c:Lcom/supercell/titan/GameApp;

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Lcom/supercell/titan/GameApp;->removeActivityEventListener(Lcom/supercell/titan/GameApp$ActivityEventListener;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/supercell/titan/LocationService;->a:[Ljava/lang/String;

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    const/4 v1, 0x0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    if-ge v2, v0, :cond_2

    .line 15
    .line 16
    aget-object v3, p1, v2

    .line 17
    .line 18
    move v4, v1

    .line 19
    :goto_1
    array-length v5, p2

    .line 20
    if-ge v4, v5, :cond_1

    .line 21
    .line 22
    aget-object v5, p2, v4

    .line 23
    .line 24
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    aget v5, p3, v4

    .line 31
    .line 32
    if-nez v5, :cond_0

    .line 33
    .line 34
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    new-instance v4, Ldp0;

    .line 39
    .line 40
    const/16 v5, 0x11

    .line 41
    .line 42
    invoke-direct {v4, p0, p0, v5, v1}, Ldp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const v4, 0x220

    const-string v4, "Did not get permissions, can\'t listen for location. Permission:"

    .line 53
    .line 54
    const v5, 0x221

    const-string v5, "LocationService"

    .line 55
    .line 56
    invoke-static {v5, v4}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    invoke-static {v5, v3}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public showSystemSettings()Z
    .locals 4

    .line 1
    :try_start_0
    new-instance v1, Ljava/util/concurrent/FutureTask;

    .line 2
    .line 3
    new-instance v2, Lrc;

    .line 4
    .line 5
    const/4 v3, 0x3

    .line 6
    invoke-direct {v2, p0, v3}, Lrc;-><init>(Ljava/lang/Object;I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lcom/supercell/titan/LocationService;->c:Lcom/supercell/titan/GameApp;

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 15
    .line 16
    .line 17
    :try_start_1
    invoke-virtual {v1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 27
    return p0

    .line 28
    :catch_0
    move-exception p0

    .line 29
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const v0, 0x222

    const-string v1, "LocationService"

    .line 34
    .line 35
    const v0, 0x223

    const-string v2, "Call has thrown an exception"

    .line 36
    .line 37
    invoke-static {v1, v2, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 38
    .line 39
    .line 40
    :catch_1
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method public startUpdatingLocation()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/supercell/titan/e;

    .line 6
    .line 7
    invoke-direct {v1, p0, p0}, Lcom/supercell/titan/e;-><init>(Lcom/supercell/titan/LocationService;Lcom/supercell/titan/LocationService;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public stopUpdatingLocation()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/supercell/titan/f;

    .line 6
    .line 7
    invoke-direct {v1, p0, p0}, Lcom/supercell/titan/f;-><init>(Lcom/supercell/titan/LocationService;Lcom/supercell/titan/LocationService;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

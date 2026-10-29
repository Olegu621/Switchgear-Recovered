.class public Lcom/supercell/titan/ApplicationUtil;
.super Lcom/supercell/titan/ApplicationUtilBase;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static d:Ljava/lang/String;

.field public static e:Z

.field public static f:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

.field public static final m_adInfoRetrieved:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lcom/supercell/titan/ApplicationUtil;

    const v1, 0x18

    const-string v0, ""

    sput-object v0, Lcom/supercell/titan/ApplicationUtil;->d:Ljava/lang/String;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/supercell/titan/ApplicationUtil;->e:Z

    const/4 v0, 0x0

    sput-object v0, Lcom/supercell/titan/ApplicationUtil;->f:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/supercell/titan/ApplicationUtil;->m_adInfoRetrieved:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/supercell/titan/ApplicationUtilBase;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static getAdvertiserID()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/supercell/titan/ApplicationUtil;->d:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static getAdvertiserIDBlocking()Ljava/lang/String;
    .locals 4

    .line 1
    const v0, 0x1f2

    const-string v1, "ApplicationUtil"

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    sget-object v2, Lcom/supercell/titan/ApplicationUtil;->d:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_3

    .line 16
    .line 17
    const v0, 0x1f3

    const-string v2, ""

    .line 18
    .line 19
    sput-object v2, Lcom/supercell/titan/ApplicationUtil;->d:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    sput-boolean v2, Lcom/supercell/titan/ApplicationUtil;->e:Z

    .line 23
    .line 24
    :try_start_0
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v2}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    sput-object v2, Lcom/supercell/titan/ApplicationUtil;->f:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lvr0; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    goto :goto_4

    .line 35
    :catch_0
    move-exception v2

    .line 36
    goto :goto_0

    .line 37
    :catch_1
    move-exception v2

    .line 38
    goto :goto_2

    .line 39
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    const v0, 0x1f4

    const-string v2, "GooglePlayServicesNotAvailableException with no message"

    .line 51
    .line 52
    :goto_1
    invoke-static {v1, v2}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    goto :goto_4

    .line 56
    :goto_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    goto :goto_3

    .line 67
    :cond_1
    const v0, 0x1f5

    const-string v2, "IOException with no message"

    .line 68
    .line 69
    :goto_3
    invoke-static {v1, v2}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    :goto_4
    sget-object v1, Lcom/supercell/titan/ApplicationUtil;->f:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    .line 73
    .line 74
    if-eqz v1, :cond_3

    .line 75
    .line 76
    invoke-virtual {v1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    if-eqz v1, :cond_2

    .line 81
    .line 82
    sput-object v1, Lcom/supercell/titan/ApplicationUtil;->d:Ljava/lang/String;

    .line 83
    .line 84
    :cond_2
    sget-object v1, Lcom/supercell/titan/ApplicationUtil;->f:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    .line 85
    .line 86
    invoke-virtual {v1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    xor-int/lit8 v1, v1, 0x1

    .line 91
    .line 92
    sput-boolean v1, Lcom/supercell/titan/ApplicationUtil;->e:Z

    .line 93
    .line 94
    :cond_3
    sget-object v1, Lcom/supercell/titan/ApplicationUtil;->d:Ljava/lang/String;

    .line 95
    .line 96
    return-object v1
.end method

.method public static getAdvertiserTrackingEnabled()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/supercell/titan/ApplicationUtil;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public static requestAdvertiserInfoOnNewThread()V
    .locals 1

    .line 1
    new-instance v0, Lqc;

    .line 2
    .line 3
    invoke-direct {v0}, Lqc;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

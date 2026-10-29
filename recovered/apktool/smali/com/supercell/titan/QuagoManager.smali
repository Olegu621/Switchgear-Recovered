.class public Lcom/supercell/titan/QuagoManager;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static a:Z

.field public static b:Z

.field public static c:Lcom/supercell/titan/GameApp;

.field public static d:Lcom/supercell/titan/QuagoManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/supercell/titan/QuagoManager;

    const v1, 0x17

    const/4 v0, 0x0

    sput-boolean v0, Lcom/supercell/titan/QuagoManager;->a:Z

    const/4 v0, 0x0

    sput-boolean v0, Lcom/supercell/titan/QuagoManager;->b:Z

    const/4 v0, 0x0

    sput-object v0, Lcom/supercell/titan/QuagoManager;->c:Lcom/supercell/titan/GameApp;

    const/4 v0, 0x0

    sput-object v0, Lcom/supercell/titan/QuagoManager;->d:Lcom/supercell/titan/QuagoManager;

    return-void
.end method

.method public constructor <init>(Lcom/supercell/titan/GameApp;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sput-object p0, Lcom/supercell/titan/QuagoManager;->d:Lcom/supercell/titan/QuagoManager;

    .line 5
    .line 6
    sput-object p1, Lcom/supercell/titan/QuagoManager;->c:Lcom/supercell/titan/GameApp;

    .line 7
    .line 8
    return-void
.end method

.method public static beginSegment(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/supercell/titan/QuagoManager;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Lcom/supercell/titan/QuagoManager;->b:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Lcom/quago/mobile/sdk/Quago;->beginSegment(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static enable(ZIZ)V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/supercell/titan/QuagoManager;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->PRODUCTION:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eq p1, v1, :cond_3

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    if-eq p1, v2, :cond_2

    .line 13
    .line 14
    const/4 v2, 0x3

    .line 15
    if-eq p1, v2, :cond_1

    .line 16
    .line 17
    move-object p1, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    sget-object p1, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->UNAUTHENTIC:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    sget-object p1, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->AUTHENTIC:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    sget-object p1, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->DEVELOPMENT:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 26
    .line 27
    :goto_0
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    if-eqz p0, :cond_6

    .line 31
    .line 32
    sget-object p0, Lcom/supercell/titan/QuagoManager;->d:Lcom/supercell/titan/QuagoManager;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    sget-object p0, Lcom/supercell/titan/QuagoManager;->c:Lcom/supercell/titan/GameApp;

    .line 41
    .line 42
    const v2, 0x15

    const-string v2, "QUAGO_APP_TOKEN"

    .line 43
    .line 44
    invoke-virtual {p0, v2}, Lcom/supercell/titan/GameApp;->getBuildConfigFromGame(Ljava/lang/String;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {p0, p1}, Lcom/quago/mobile/sdk/QuagoSettings;->create(Ljava/lang/String;Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;)Lcom/quago/mobile/sdk/QuagoSettings$Builder;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-ne p1, v0, :cond_4

    .line 55
    .line 56
    sget-object p1, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->DISABLED:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_4
    sget-object p1, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->INFO:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 60
    .line 61
    :goto_1
    invoke-virtual {p0, p1}, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->setLogLevel(Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;)Lcom/quago/mobile/sdk/QuagoSettings$Builder;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    new-instance p1, Lc02;

    .line 66
    .line 67
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p1}, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->overrideLogger(Lcom/quago/mobile/sdk/utils/IQuagoLog;)Lcom/quago/mobile/sdk/QuagoSettings$Builder;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-nez p2, :cond_5

    .line 75
    .line 76
    new-instance p1, Ld02;

    .line 77
    .line 78
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lcom/quago/mobile/sdk/QuagoSettings$Builder;->setJsonCallback(Lcom/quago/mobile/sdk/QuagoSettings$QuagoCallback;)Lcom/quago/mobile/sdk/QuagoSettings$Builder;

    .line 82
    .line 83
    .line 84
    :cond_5
    sget-object p1, Lcom/supercell/titan/QuagoManager;->c:Lcom/supercell/titan/GameApp;

    .line 85
    .line 86
    invoke-static {p1, p0}, Lcom/quago/mobile/sdk/Quago;->initialize(Landroid/app/Activity;Lcom/quago/mobile/sdk/QuagoSettings$Builder;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    sput-boolean v1, Lcom/supercell/titan/QuagoManager;->b:Z

    .line 91
    .line 92
    :goto_2
    sput-boolean v1, Lcom/supercell/titan/QuagoManager;->a:Z

    .line 93
    .line 94
    return-void
.end method

.method public static endSegment()V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/supercell/titan/QuagoManager;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Lcom/supercell/titan/QuagoManager;->b:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/quago/mobile/sdk/Quago;->endSegment()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static native onLog(ILjava/lang/String;Ljava/lang/String;)V
.end method

.method public static onPause()V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/supercell/titan/QuagoManager;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Lcom/supercell/titan/QuagoManager;->b:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/quago/mobile/sdk/Quago;->onPause()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static onResume()V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/supercell/titan/QuagoManager;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Lcom/supercell/titan/QuagoManager;->b:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/quago/mobile/sdk/Quago;->onResume()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static native sendJsonSegments(Ljava/lang/String;[B)V
.end method

.method public static setAdditionalId(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/supercell/titan/QuagoManager;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Lcom/supercell/titan/QuagoManager;->b:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Lcom/quago/mobile/sdk/Quago;->setAdditionalId(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static setAppToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static setKeyValue(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/supercell/titan/QuagoManager;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-boolean v0, Lcom/supercell/titan/QuagoManager;->b:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const v0, 0x16

    const-string v0, "PlayerId"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lcom/quago/mobile/sdk/Quago;->setUserId(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-static {p0, p1}, Lcom/quago/mobile/sdk/Quago;->setKeyValues(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.class public Lcom/supercell/titan/GameApp;
.super Landroid/app/Activity;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/supercell/titan/GameApp$QuagoActivityLifecycleCallbacks;,
        Lcom/supercell/titan/GameApp$OnActivityResultListener;,
        Lcom/supercell/titan/GameApp$NotificationSource;,
        Lcom/supercell/titan/GameApp$NotificationData;,
        Lcom/supercell/titan/GameApp$ActivityEventListener;,
        Lcom/supercell/titan/GameApp$ShowStorePageListener;
    }
.end annotation


# static fields
.field public static final A0:Ljava/util/Vector;

.field public static final B0:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final LOG_OUT_REASON_ANTI_ADDICTION:I

.field public static final LOG_OUT_REASON_AUTH_EXPIRED:I

.field public static final LOG_OUT_REASON_CANCEL_QQ_AUTH:I

.field public static final LOG_OUT_REASON_CANCEL_WECHAT_AUTH:I

.field public static final LOG_OUT_REASON_DENY_WECHAT_AUTH:I

.field public static final LOG_OUT_REASON_LOGIN_TIMEOUT:I

.field public static final LOG_OUT_REASON_NOT_IN_WHITE_LIST:I

.field public static final LOG_OUT_REASON_SWITCH_USER:I

.field public static final LOG_OUT_REASON_UNKNOWN:I

.field public static final LOG_OUT_REASON_USER:I

.field public static final SHOW_STORE_PAGE_REQUEST_CODE:I

.field public static final ScreenOrientation_LandscapeLeft:I

.field public static final ScreenOrientation_LandscapeRight:I

.field public static final ScreenOrientation_Portrait:I

.field public static final ScreenOrientation_PortraitUpsideDown:I

.field public static x0:Lcom/supercell/titan/GameApp;

.field public static y0:I

.field public static final z0:Ljava/util/Vector;


# instance fields
.field public U:I

.field public V:Ljava/util/Vector;

.field public W:Lcom/supercell/titan/GL2JNISurfaceView;

.field public X:Z

.field public Y:Z

.field public Z:Landroid/app/AlarmManager;

.field public a:Landroid/net/wifi/WifiManager$WifiLock;

.field public a0:Ljava/lang/String;

.field public b:Landroid/os/Handler;

.field public b0:Ljava/lang/String;

.field public c:Z

.field public final c0:I

.field public d:Z

.field public d0:Landroid/os/Bundle;

.field public e:Ljava/lang/Thread;

.field public final e0:Ljava/lang/Class;

.field public f:Lcq0;

.field public f0:Lcom/supercell/titan/PurchaseManagerGoogle;

.field public g0:Lcom/supercell/titan/SecurePreferences;

.field public h0:Lcom/supercell/titan/SecurePreferences;

.field public i:I

.field public i0:Lcom/supercell/titan/SecurePreferences;

.field public j0:Landroid/content/SharedPreferences;

.field public k0:Lcom/supercell/titan/GoogleServiceClient;

.field public l0:Z

.field public final m0:Ljava/util/Vector;

.field public n0:I

.field public final o0:Lcom/supercell/titan/GameApp$QuagoActivityLifecycleCallbacks;

.field public final p0:Ljava/util/ArrayList;

.field public q0:F

.field public r0:F

.field public requestedOrientation:I

.field public s0:I

.field public final t0:Ljava/util/concurrent/locks/ReentrantLock;

.field public final u0:Ltc;

.field public v:I

.field public v0:Z

.field public w:I

.field public final w0:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-class v0, Lcom/supercell/titan/GameApp;

    const v1, 0x4

    const v0, 0x6

    sput v0, Lcom/supercell/titan/GameApp;->LOG_OUT_REASON_ANTI_ADDICTION:I

    const v0, 0x2

    sput v0, Lcom/supercell/titan/GameApp;->LOG_OUT_REASON_AUTH_EXPIRED:I

    const v0, 0x7

    sput v0, Lcom/supercell/titan/GameApp;->LOG_OUT_REASON_CANCEL_QQ_AUTH:I

    const v0, 0x8

    sput v0, Lcom/supercell/titan/GameApp;->LOG_OUT_REASON_CANCEL_WECHAT_AUTH:I

    const v0, 0x9

    sput v0, Lcom/supercell/titan/GameApp;->LOG_OUT_REASON_DENY_WECHAT_AUTH:I

    const v0, 0x4

    sput v0, Lcom/supercell/titan/GameApp;->LOG_OUT_REASON_LOGIN_TIMEOUT:I

    const v0, 0x5

    sput v0, Lcom/supercell/titan/GameApp;->LOG_OUT_REASON_NOT_IN_WHITE_LIST:I

    const v0, 0x3

    sput v0, Lcom/supercell/titan/GameApp;->LOG_OUT_REASON_SWITCH_USER:I

    const v0, 0x0

    sput v0, Lcom/supercell/titan/GameApp;->LOG_OUT_REASON_UNKNOWN:I

    const v0, 0x1

    sput v0, Lcom/supercell/titan/GameApp;->LOG_OUT_REASON_USER:I

    const v0, 0xf1b31

    sput v0, Lcom/supercell/titan/GameApp;->SHOW_STORE_PAGE_REQUEST_CODE:I

    const v0, 0x4

    sput v0, Lcom/supercell/titan/GameApp;->ScreenOrientation_LandscapeLeft:I

    const v0, 0x8

    sput v0, Lcom/supercell/titan/GameApp;->ScreenOrientation_LandscapeRight:I

    const v0, 0x1

    sput v0, Lcom/supercell/titan/GameApp;->ScreenOrientation_Portrait:I

    const v0, 0x2

    sput v0, Lcom/supercell/titan/GameApp;->ScreenOrientation_PortraitUpsideDown:I

    const/4 v0, 0x0

    sput-object v0, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x3e8

    .line 6
    .line 7
    div-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    sput v0, Lcom/supercell/titan/GameApp;->y0:I

    .line 10
    .line 11
    new-instance v0, Ljava/util/Vector;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lcom/supercell/titan/GameApp;->z0:Ljava/util/Vector;

    .line 17
    .line 18
    new-instance v0, Ljava/util/Vector;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/supercell/titan/GameApp;->A0:Ljava/util/Vector;

    .line 24
    .line 25
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lcom/supercell/titan/GameApp;->B0:Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 85
    const-class v0, Lcom/supercell/titan/TimeAlarm;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/supercell/titan/GameApp;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 83
    invoke-direct {p0, p1, p2, v0}, Lcom/supercell/titan/GameApp;-><init>(ILjava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/Class;Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p3, 0x0

    .line 5
    iput-object p3, p0, Lcom/supercell/titan/GameApp;->f:Lcq0;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/supercell/titan/GameApp;->i:I

    .line 9
    .line 10
    iput v0, p0, Lcom/supercell/titan/GameApp;->v:I

    .line 11
    .line 12
    iput v0, p0, Lcom/supercell/titan/GameApp;->w:I

    .line 13
    .line 14
    iput v0, p0, Lcom/supercell/titan/GameApp;->U:I

    .line 15
    .line 16
    const-string v1, ""

    .line 17
    .line 18
    iput-object v1, p0, Lcom/supercell/titan/GameApp;->a0:Ljava/lang/String;

    .line 19
    .line 20
    const-string v1, "this game"

    .line 21
    .line 22
    iput-object v1, p0, Lcom/supercell/titan/GameApp;->b0:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p3, p0, Lcom/supercell/titan/GameApp;->j0:Landroid/content/SharedPreferences;

    .line 25
    .line 26
    new-instance p3, Ljava/util/Vector;

    .line 27
    .line 28
    invoke-direct {p3}, Ljava/util/Vector;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p3, p0, Lcom/supercell/titan/GameApp;->m0:Ljava/util/Vector;

    .line 32
    .line 33
    const/4 p3, -0x1

    .line 34
    iput p3, p0, Lcom/supercell/titan/GameApp;->n0:I

    .line 35
    .line 36
    new-instance p3, Lcom/supercell/titan/GameApp$QuagoActivityLifecycleCallbacks;

    .line 37
    .line 38
    invoke-direct {p3}, Lcom/supercell/titan/GameApp$QuagoActivityLifecycleCallbacks;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p3, p0, Lcom/supercell/titan/GameApp;->o0:Lcom/supercell/titan/GameApp$QuagoActivityLifecycleCallbacks;

    .line 42
    .line 43
    new-instance p3, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p3, p0, Lcom/supercell/titan/GameApp;->p0:Ljava/util/ArrayList;

    .line 49
    .line 50
    const/high16 p3, 0x7fc00000    # Float.NaN

    .line 51
    .line 52
    iput p3, p0, Lcom/supercell/titan/GameApp;->q0:F

    .line 53
    .line 54
    iput v0, p0, Lcom/supercell/titan/GameApp;->s0:I

    .line 55
    .line 56
    new-instance p3, Ljava/util/concurrent/locks/ReentrantLock;

    .line 57
    .line 58
    invoke-direct {p3}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p3, p0, Lcom/supercell/titan/GameApp;->t0:Ljava/util/concurrent/locks/ReentrantLock;

    .line 62
    .line 63
    new-instance p3, Ltc;

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    invoke-direct {p3, p0, v1}, Ltc;-><init>(Lcom/supercell/titan/GameApp;I)V

    .line 67
    .line 68
    .line 69
    iput-object p3, p0, Lcom/supercell/titan/GameApp;->u0:Ltc;

    .line 70
    .line 71
    new-instance p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 72
    .line 73
    invoke-direct {p3, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 74
    .line 75
    .line 76
    iput-object p3, p0, Lcom/supercell/titan/GameApp;->w0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 77
    .line 78
    iput p1, p0, Lcom/supercell/titan/GameApp;->c0:I

    .line 79
    .line 80
    iput-object p2, p0, Lcom/supercell/titan/GameApp;->e0:Ljava/lang/Class;

    .line 81
    .line 82
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, -0x1

    .line 84
    invoke-direct {p0, v0, p1, p2}, Lcom/supercell/titan/GameApp;-><init>(ILjava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 86
    invoke-direct {p0, p1, p2, v0}, Lcom/supercell/titan/GameApp;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, -0x1

    .line 87
    invoke-direct {p0, v0, p2, p3}, Lcom/supercell/titan/GameApp;-><init>(ILjava/lang/Class;Ljava/lang/Class;)V

    .line 88
    iput-object p1, p0, Lcom/supercell/titan/GameApp;->b0:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/supercell/titan/GameApp$NotificationSource;)Lcom/supercell/titan/d;
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    sget-object v1, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 4
    .line 5
    iget-object v2, v1, Lcom/supercell/titan/GameApp;->e0:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    const v1, 0xee

    const-string v1, "msg"

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    const v1, 0xef

    const-string v1, "id"

    .line 16
    .line 17
    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    const v1, 0xf0

    const-string v1, "title"

    .line 21
    .line 22
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    const v1, 0xf1

    const-string v1, "sound"

    .line 26
    .line 27
    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    const v1, 0xf2

    const-string v1, "userId"

    .line 31
    .line 32
    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    const v1, 0xf3

    const-string v1, "imageURL"

    .line 36
    .line 37
    invoke-virtual {v0, v1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    const p5, 0xf4

    const-string p5, "channelId"

    .line 41
    .line 42
    invoke-virtual {v0, p5, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 43
    .line 44
    .line 45
    const p5, 0xf5

    const-string p5, "channelName"

    .line 46
    .line 47
    invoke-virtual {v0, p5, p7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 48
    .line 49
    .line 50
    const p5, 0xf6

    const-string p5, "channelDesc"

    .line 51
    .line 52
    invoke-virtual {v0, p5, p8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    const p5, 0xf7

    const-string p5, "color"

    .line 56
    .line 57
    invoke-virtual {v0, p5, p9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 58
    .line 59
    .line 60
    const p5, 0xf8

    const-string p5, "iconResourceName"

    .line 61
    .line 62
    invoke-virtual {v0, p5, p10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 63
    .line 64
    .line 65
    const p5, 0xf9

    const-string p5, "source"

    .line 66
    .line 67
    iget p7, p11, Lcom/supercell/titan/GameApp$NotificationSource;->a:I

    .line 68
    .line 69
    invoke-virtual {v0, p5, p7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 70
    .line 71
    .line 72
    new-instance p5, Lcom/supercell/titan/d;

    .line 73
    .line 74
    invoke-direct {p5}, Ljava/lang/Object;-><init>()V

    .line 75
    .line 76
    .line 77
    iput p4, p5, Lcom/supercell/titan/d;->c:I

    .line 78
    .line 79
    iput-object p1, p5, Lcom/supercell/titan/d;->d:Ljava/lang/String;

    .line 80
    .line 81
    iput-object p2, p5, Lcom/supercell/titan/d;->e:Ljava/lang/String;

    .line 82
    .line 83
    iput-object p0, p5, Lcom/supercell/titan/d;->b:Ljava/lang/String;

    .line 84
    .line 85
    iput-object p3, p5, Lcom/supercell/titan/d;->f:Ljava/lang/String;

    .line 86
    .line 87
    iput-object p6, p5, Lcom/supercell/titan/d;->g:Ljava/lang/String;

    .line 88
    .line 89
    iput-object p11, p5, Lcom/supercell/titan/d;->h:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 90
    .line 91
    sget-object p0, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 92
    .line 93
    const/high16 p1, 0x44000000    # 512.0f

    .line 94
    .line 95
    invoke-static {p0, p4, v0, p1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    iput-object p0, p5, Lcom/supercell/titan/d;->a:Landroid/app/PendingIntent;

    .line 100
    .line 101
    return-object p5
.end method

.method public static addDisplayedNotificationForCancelTracking(Lcom/supercell/titan/GameApp$NotificationData;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/supercell/titan/GameApp$NotificationData;->notificationId:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/supercell/titan/GameApp;->B0:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/supercell/titan/GameApp$NotificationData;->notificationId:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public static areNotificationsEnabled()Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lap1;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lap1;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Lap1;->a:Landroid/app/NotificationManager;

    .line 11
    .line 12
    invoke-static {v0}, Lzo1;->a(Landroid/app/NotificationManager;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
.end method

.method public static b(Landroid/content/Intent;)V
    .locals 8

    .line 1
    if-eqz p0, :cond_9

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_7

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const v0, 0xfa

    const-string v0, "title"

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const v1, 0xfb

    const-string v1, "msg"

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const v2, 0xfc

    const-string v2, "chronosPushNotificationId"

    .line 28
    .line 29
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const v3, 0xfd

    const-string v3, "notificationUniqueId"

    .line 34
    .line 35
    invoke-virtual {p0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const v4, 0xfe

    const-string v4, "userId"

    .line 40
    .line 41
    invoke-virtual {p0, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    const v5, 0xff

    const-string v5, "id"

    .line 46
    .line 47
    const/4 v6, -0x1

    .line 48
    invoke-virtual {p0, v5, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 49
    .line 50
    .line 51
    sget-object v5, Lcom/supercell/titan/GameApp$NotificationSource;->NOT_SET:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 52
    .line 53
    iget v6, v5, Lcom/supercell/titan/GameApp$NotificationSource;->a:I

    .line 54
    .line 55
    const v7, 0x100

    const-string v7, "source"

    .line 56
    .line 57
    invoke-virtual {p0, v7, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    iget v5, v5, Lcom/supercell/titan/GameApp$NotificationSource;->a:I

    .line 62
    .line 63
    if-ne v6, v5, :cond_2

    .line 64
    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-nez v5, :cond_1

    .line 72
    .line 73
    sget-object v5, Lcom/supercell/titan/GameApp$NotificationSource;->CHRONOS:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 74
    .line 75
    iget v5, v5, Lcom/supercell/titan/GameApp$NotificationSource;->a:I

    .line 76
    .line 77
    :goto_0
    move v6, v5

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    sget-object v5, Lcom/supercell/titan/GameApp$NotificationSource;->SERVER:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 80
    .line 81
    iget v5, v5, Lcom/supercell/titan/GameApp$NotificationSource;->a:I

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    :goto_1
    new-instance v5, Lcom/supercell/titan/GameApp$NotificationData;

    .line 85
    .line 86
    invoke-direct {v5}, Lcom/supercell/titan/GameApp$NotificationData;-><init>()V

    .line 87
    .line 88
    .line 89
    const v7, 0x101

    const-string v7, ""

    .line 90
    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    move-object v0, v7

    .line 95
    :goto_2
    iput-object v0, v5, Lcom/supercell/titan/GameApp$NotificationData;->title:Ljava/lang/String;

    .line 96
    .line 97
    const v0, 0x102

    const-string v0, "tap"

    .line 98
    .line 99
    iput-object v0, v5, Lcom/supercell/titan/GameApp$NotificationData;->actionId:Ljava/lang/String;

    .line 100
    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_4
    move-object v1, v7

    .line 105
    :goto_3
    iput-object v1, v5, Lcom/supercell/titan/GameApp$NotificationData;->message:Ljava/lang/String;

    .line 106
    .line 107
    if-eqz v2, :cond_5

    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_5

    .line 114
    .line 115
    move-object v0, v2

    .line 116
    goto :goto_4

    .line 117
    :cond_5
    move-object v0, v7

    .line 118
    :goto_4
    iput-object v0, v5, Lcom/supercell/titan/GameApp$NotificationData;->chronosEventId:Ljava/lang/String;

    .line 119
    .line 120
    if-eqz v3, :cond_6

    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_6

    .line 127
    .line 128
    iput-object v3, v5, Lcom/supercell/titan/GameApp$NotificationData;->notificationId:Ljava/lang/String;

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_6
    sget-object v0, Lcom/supercell/titan/GameApp$NotificationSource;->LOCAL:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 132
    .line 133
    iget v0, v0, Lcom/supercell/titan/GameApp$NotificationSource;->a:I

    .line 134
    .line 135
    if-ne v6, v0, :cond_7

    .line 136
    .line 137
    if-eqz v4, :cond_7

    .line 138
    .line 139
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-nez v0, :cond_7

    .line 144
    .line 145
    iput-object v4, v5, Lcom/supercell/titan/GameApp$NotificationData;->notificationId:Ljava/lang/String;

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_7
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iput-object v0, v5, Lcom/supercell/titan/GameApp$NotificationData;->notificationId:Ljava/lang/String;

    .line 157
    .line 158
    :goto_5
    iput v6, v5, Lcom/supercell/titan/GameApp$NotificationData;->source:I

    .line 159
    .line 160
    const v0, 0x103

    const-string v0, "channelId"

    .line 161
    .line 162
    invoke-virtual {p0, v0, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    iput-object p0, v5, Lcom/supercell/titan/GameApp$NotificationData;->channelId:Ljava/lang/String;

    .line 167
    .line 168
    if-eqz v2, :cond_8

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_8
    move-object v2, v7

    .line 172
    :goto_6
    iput-object v2, v5, Lcom/supercell/titan/GameApp$NotificationData;->chronosEventId:Ljava/lang/String;

    .line 173
    .line 174
    iget-object p0, v5, Lcom/supercell/titan/GameApp$NotificationData;->notificationId:Ljava/lang/String;

    .line 175
    .line 176
    invoke-static {p0}, Lcom/supercell/titan/GameApp;->removeDisplayedNotificationFromCancelTracking(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-static {v5}, Lcom/supercell/titan/GameApp;->trackNotificationReceived(Lcom/supercell/titan/GameApp$NotificationData;)V

    .line 180
    .line 181
    .line 182
    :cond_9
    :goto_7
    return-void
.end method

.method public static native backButtonPressed()Z
.end method

.method public static cancelAllNotifications()V
    .locals 19

    .line 1
    sget-object v1, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    iget-object v1, v1, Lcom/supercell/titan/GameApp;->Z:Landroid/app/AlarmManager;

    .line 4
    .line 5
    sget-object v2, Lcom/supercell/titan/GameApp;->z0:Ljava/util/Vector;

    .line 6
    .line 7
    monitor-enter v2

    .line 8
    :try_start_0
    invoke-virtual {v2}, Ljava/util/Vector;->clear()V

    .line 9
    .line 10
    .line 11
    sget-object v3, Lcom/supercell/titan/GameApp;->A0:Ljava/util/Vector;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/util/Vector;->clear()V

    .line 14
    .line 15
    .line 16
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    sget-object v2, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 18
    .line 19
    iget-object v2, v2, Lcom/supercell/titan/GameApp;->j0:Landroid/content/SharedPreferences;

    .line 20
    .line 21
    const v0, 0x104

    const-string v3, "localNotifications"

    .line 22
    .line 23
    const v0, 0x105

    const-string v4, ""

    .line 24
    .line 25
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    sget-object v3, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 36
    .line 37
    iget-object v3, v3, Lcom/supercell/titan/GameApp;->j0:Landroid/content/SharedPreferences;

    .line 38
    .line 39
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const v0, 0x106

    const-string v4, "localNotifications"

    .line 44
    .line 45
    invoke-interface {v3, v4}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 50
    .line 51
    .line 52
    :try_start_1
    new-instance v3, Lorg/json/JSONArray;

    .line 53
    .line 54
    invoke-direct {v3, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-ge v2, v4, :cond_1

    .line 63
    .line 64
    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    const v0, 0x107

    const-string v5, "userId"

    .line 69
    .line 70
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    const v0, 0x108

    const-string v5, "sound"

    .line 75
    .line 76
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    const v0, 0x109

    const-string v5, "title"

    .line 81
    .line 82
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    const v0, 0x10a

    const-string v5, "imageURL"

    .line 87
    .line 88
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    const v0, 0x10b

    const-string v5, "msg"

    .line 93
    .line 94
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    const v0, 0x10c

    const-string v5, "id"

    .line 99
    .line 100
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    const v0, 0x10d

    const-string v5, "channelId"

    .line 105
    .line 106
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v12

    .line 110
    const v0, 0x10e

    const-string v5, "channelName"

    .line 111
    .line 112
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v13

    .line 116
    const v0, 0x10f

    const-string v5, "channelDesc"

    .line 117
    .line 118
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v14

    .line 122
    const v0, 0x110

    const-string v5, "iconResourceName"

    .line 123
    .line 124
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v16

    .line 128
    const v0, 0x111

    const-string v5, "color"

    .line 129
    .line 130
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v15

    .line 134
    const v0, 0x112

    const-string v5, "source"

    .line 135
    .line 136
    move/from16 v18, v2

    .line 137
    .line 138
    sget-object v2, Lcom/supercell/titan/GameApp$NotificationSource;->NOT_SET:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 139
    .line 140
    iget v2, v2, Lcom/supercell/titan/GameApp$NotificationSource;->a:I

    .line 141
    .line 142
    invoke-virtual {v4, v5, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    invoke-static {v2}, Lcom/supercell/titan/GameApp$NotificationSource;->fromCode(I)Lcom/supercell/titan/GameApp$NotificationSource;

    .line 147
    .line 148
    .line 149
    move-result-object v17

    .line 150
    invoke-static/range {v6 .. v17}, Lcom/supercell/titan/GameApp;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/supercell/titan/GameApp$NotificationSource;)Lcom/supercell/titan/d;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    if-eqz v1, :cond_0

    .line 155
    .line 156
    iget-object v4, v2, Lcom/supercell/titan/d;->a:Landroid/app/PendingIntent;

    .line 157
    .line 158
    invoke-virtual {v1, v4}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 159
    .line 160
    .line 161
    invoke-static {v2}, Lcom/supercell/titan/GameApp;->trackNotificationCanceled(Lcom/supercell/titan/d;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 162
    .line 163
    .line 164
    :cond_0
    add-int/lit8 v2, v18, 0x1

    .line 165
    .line 166
    goto/16 :goto_0

    .line 167
    :catch_0
    move-exception v1

    .line 168
    invoke-static {v1}, Lcom/supercell/titan/SentryTitan;->a(Ljava/lang/Exception;)V

    .line 169
    .line 170
    .line 171
    const v0, 0x113

    const-string v2, "GameApp"

    .line 172
    .line 173
    const v0, 0x114

    const-string v3, "GameApp.cancelAllNotifications()"

    .line 174
    .line 175
    invoke-static {v2, v3, v1}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 176
    .line 177
    .line 178
    invoke-static {v1}, Lcom/supercell/titan/GameApp;->debuggerException(Ljava/lang/Exception;)V

    .line 179
    .line 180
    .line 181
    :cond_1
    return-void

    .line 182
    :catchall_0
    move-exception v1

    .line 183
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 184
    throw v1
.end method

.method public static cancelNotification(I)V
    .locals 18

    .line 1
    move/from16 v4, p0

    .line 2
    .line 3
    sget-object v1, Lcom/supercell/titan/GameApp;->z0:Ljava/util/Vector;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    :cond_0
    :goto_0
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    if-ltz v0, :cond_2

    .line 13
    .line 14
    sget-object v2, Lcom/supercell/titan/GameApp;->z0:Ljava/util/Vector;

    .line 15
    .line 16
    invoke-virtual {v2, v0}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Lcom/supercell/titan/d;

    .line 21
    .line 22
    iget v5, v3, Lcom/supercell/titan/d;->c:I

    .line 23
    .line 24
    if-ne v5, v4, :cond_0

    .line 25
    .line 26
    sget-object v5, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 27
    .line 28
    if-eqz v5, :cond_1

    .line 29
    .line 30
    iget-object v5, v5, Lcom/supercell/titan/GameApp;->Z:Landroid/app/AlarmManager;

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    iget-object v6, v3, Lcom/supercell/titan/d;->a:Landroid/app/PendingIntent;

    .line 35
    .line 36
    invoke-virtual {v5, v6}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto/16 :goto_5

    .line 42
    .line 43
    :cond_1
    :goto_1
    invoke-static {v3}, Lcom/supercell/titan/GameApp;->trackNotificationCanceled(Lcom/supercell/titan/d;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v0}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    sget-object v2, Lcom/supercell/titan/GameApp;->A0:Ljava/util/Vector;

    .line 50
    .line 51
    invoke-virtual {v2, v0}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    sget-object v0, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 57
    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :cond_3
    iget-object v0, v0, Lcom/supercell/titan/GameApp;->j0:Landroid/content/SharedPreferences;

    .line 63
    .line 64
    if-nez v0, :cond_4

    .line 65
    .line 66
    goto/16 :goto_4

    .line 67
    .line 68
    :cond_4
    const v17, 0x115

    const-string v1, "localNotifications"

    .line 69
    .line 70
    const v17, 0x116

    const-string v2, ""

    .line 71
    .line 72
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_9

    .line 81
    .line 82
    sget-object v1, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 83
    .line 84
    iget-object v12, v1, Lcom/supercell/titan/GameApp;->Z:Landroid/app/AlarmManager;

    .line 85
    .line 86
    :try_start_1
    new-instance v13, Lorg/json/JSONArray;

    .line 87
    .line 88
    invoke-direct {v13, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    new-instance v14, Lorg/json/JSONArray;

    .line 92
    .line 93
    invoke-direct {v14}, Lorg/json/JSONArray;-><init>()V

    .line 94
    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    move v15, v0

    .line 98
    :goto_2
    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-ge v15, v0, :cond_7

    .line 103
    .line 104
    invoke-virtual {v13, v15}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const v17, 0x117

    const-string v1, "id"

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-ne v4, v1, :cond_6

    .line 115
    .line 116
    const v17, 0x118

    const-string v1, "userId"

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    const v17, 0x119

    const-string v2, "sound"

    .line 123
    .line 124
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    const v17, 0x11a

    const-string v2, "title"

    .line 129
    .line 130
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    const v17, 0x11b

    const-string v5, "imageURL"

    .line 135
    .line 136
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    const v17, 0x11c

    const-string v6, "channelId"

    .line 141
    .line 142
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    const v17, 0x11d

    const-string v7, "channelName"

    .line 147
    .line 148
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    const v17, 0x11e

    const-string v8, "channelDesc"

    .line 153
    .line 154
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    const v17, 0x11f

    const-string v9, "iconResourceName"

    .line 159
    .line 160
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    const v17, 0x120

    const-string v9, "color"

    .line 165
    .line 166
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 167
    .line 168
    .line 169
    move-result v9

    .line 170
    const v17, 0x121

    const-string v11, "source"

    .line 171
    .line 172
    move-object/from16 v16, v1

    .line 173
    .line 174
    sget-object v1, Lcom/supercell/titan/GameApp$NotificationSource;->NOT_SET:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 175
    .line 176
    iget v1, v1, Lcom/supercell/titan/GameApp$NotificationSource;->a:I

    .line 177
    .line 178
    invoke-virtual {v0, v11, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    invoke-static {v1}, Lcom/supercell/titan/GameApp$NotificationSource;->fromCode(I)Lcom/supercell/titan/GameApp$NotificationSource;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    const v17, 0x122

    const-string v1, "msg"

    .line 187
    .line 188
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    move-object/from16 v0, v16

    .line 193
    .line 194
    invoke-static/range {v0 .. v11}, Lcom/supercell/titan/GameApp;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/supercell/titan/GameApp$NotificationSource;)Lcom/supercell/titan/d;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    if-eqz v12, :cond_5

    .line 199
    .line 200
    iget-object v1, v0, Lcom/supercell/titan/d;->a:Landroid/app/PendingIntent;

    .line 201
    .line 202
    invoke-virtual {v12, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 203
    .line 204
    .line 205
    :cond_5
    invoke-static {v0}, Lcom/supercell/titan/GameApp;->trackNotificationCanceled(Lcom/supercell/titan/d;)V

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_6
    invoke-virtual {v14, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 210
    .line 211
    .line 212
    :goto_3
    add-int/lit8 v15, v15, 0x1

    .line 213
    .line 214
    move/from16 v4, p0

    .line 215
    .line 216
    goto/16 :goto_2

    .line 217
    :cond_7
    invoke-virtual {v14}, Lorg/json/JSONArray;->length()I

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-eq v0, v1, :cond_9

    .line 226
    .line 227
    if-nez v0, :cond_8

    .line 228
    .line 229
    sget-object v0, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 230
    .line 231
    iget-object v0, v0, Lcom/supercell/titan/GameApp;->j0:Landroid/content/SharedPreferences;

    .line 232
    .line 233
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    const v17, 0x123

    const-string v1, "localNotifications"

    .line 238
    .line 239
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_8
    invoke-virtual {v14}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    sget-object v1, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 252
    .line 253
    iget-object v1, v1, Lcom/supercell/titan/GameApp;->j0:Landroid/content/SharedPreferences;

    .line 254
    .line 255
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    const v17, 0x124

    const-string v2, "localNotifications"

    .line 260
    .line 261
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :catch_0
    move-exception v0

    .line 270
    invoke-static {v0}, Lcom/supercell/titan/SentryTitan;->a(Ljava/lang/Exception;)V

    .line 271
    .line 272
    .line 273
    const v17, 0x125

    const-string v1, "GameApp"

    .line 274
    .line 275
    const v17, 0x126

    const-string v2, "Gameapp.cancelNotification()"

    .line 276
    .line 277
    invoke-static {v1, v2, v0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 278
    .line 279
    .line 280
    invoke-static {v0}, Lcom/supercell/titan/GameApp;->debuggerException(Ljava/lang/Exception;)V

    .line 281
    .line 282
    .line 283
    :cond_9
    :goto_4
    return-void

    .line 284
    :goto_5
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 285
    throw v0
.end method

.method public static native createGameMain(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIIFFILjava/lang/String;Landroid/app/Activity;)Ljava/lang/String;
.end method

.method public static createNotification(Ljava/lang/String;Ljava/lang/String;IJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 19

    .line 1
    move/from16 v1, p2

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object/from16 v3, p0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    :goto_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    move-object v3, v2

    .line 24
    :goto_1
    const-wide/16 v4, 0x0

    .line 25
    .line 26
    cmp-long v2, p3, v4

    .line 27
    .line 28
    const-wide/16 v15, 0x3e8

    .line 29
    .line 30
    if-lez v2, :cond_3

    .line 31
    .line 32
    mul-long v4, p3, v15

    .line 33
    .line 34
    :cond_2
    :goto_2
    move-wide v1, v4

    .line 35
    goto :goto_3

    .line 36
    :cond_3
    if-lez v1, :cond_2

    .line 37
    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v4

    .line 42
    int-to-long v1, v1

    .line 43
    mul-long/2addr v1, v15

    .line 44
    add-long/2addr v4, v1

    .line 45
    goto :goto_2

    .line 46
    :goto_3
    sget v4, Lcom/supercell/titan/GameApp;->y0:I

    .line 47
    .line 48
    const/4 v5, 0x1

    .line 49
    add-int/lit8 v7, v4, 0x1

    .line 50
    .line 51
    sput v7, Lcom/supercell/titan/GameApp;->y0:I

    .line 52
    .line 53
    invoke-static {v7}, Lcom/supercell/titan/GameApp;->cancelNotification(I)V

    .line 54
    .line 55
    .line 56
    sget-object v14, Lcom/supercell/titan/GameApp$NotificationSource;->LOCAL:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 57
    .line 58
    move-object/from16 v4, p1

    .line 59
    .line 60
    move/from16 v12, p5

    .line 61
    .line 62
    move-object/from16 v8, p7

    .line 63
    .line 64
    move-object/from16 v9, p8

    .line 65
    .line 66
    move-object/from16 v10, p9

    .line 67
    .line 68
    move-object/from16 v11, p10

    .line 69
    .line 70
    move-object/from16 v6, p11

    .line 71
    .line 72
    move-object/from16 v13, p12

    .line 73
    .line 74
    move-wide/from16 v17, v15

    .line 75
    .line 76
    move v15, v5

    .line 77
    move-object/from16 v5, p6

    .line 78
    .line 79
    invoke-static/range {v3 .. v14}, Lcom/supercell/titan/GameApp;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/supercell/titan/GameApp$NotificationSource;)Lcom/supercell/titan/d;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 84
    .line 85
    .line 86
    move-result-wide v5

    .line 87
    cmp-long v8, v1, v5

    .line 88
    .line 89
    if-gtz v8, :cond_5

    .line 90
    .line 91
    sget-object v7, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 92
    .line 93
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    const v0, 0x127

    const-string v8, "com.supercell.clashroyale"

    .line 98
    .line 99
    invoke-static {v7, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-eqz v7, :cond_4

    .line 104
    .line 105
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 106
    .line 107
    new-instance v7, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    const v0, 0x128

    const-string v8, "Alarm fire time is in the past fireTime="

    .line 110
    .line 111
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v7, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const v0, 0x129

    const-string v8, " timeNow="

    .line 118
    .line 119
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const v0, 0x12a

    const-string v8, " id="

    .line 126
    .line 127
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-static {v3}, Lcom/supercell/titan/SentryTitan;->b(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :cond_4
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    sget-object v1, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 144
    .line 145
    iget-object v1, v1, Lcom/supercell/titan/GameApp;->Z:Landroid/app/AlarmManager;

    .line 146
    .line 147
    invoke-static {v4}, Lcom/supercell/titan/GameApp;->e(Lcom/supercell/titan/d;)V

    .line 148
    .line 149
    .line 150
    add-long v5, v5, v17

    .line 151
    .line 152
    const/4 v2, 0x0

    .line 153
    const/4 v3, 0x0

    .line 154
    :try_start_0
    iget-object v7, v4, Lcom/supercell/titan/d;->a:Landroid/app/PendingIntent;

    .line 155
    .line 156
    invoke-virtual {v1, v2, v5, v6, v7}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    .line 158
    .line 159
    goto :goto_6

    .line 160
    :catch_0
    move-exception v1

    .line 161
    goto :goto_4

    .line 162
    :catch_1
    move-exception v1

    .line 163
    goto :goto_5

    .line 164
    :goto_4
    sget-object v5, Lp92;->c:Lp92;

    .line 165
    .line 166
    invoke-static {v3, v5, v1, v3, v3}, Lcom/supercell/titan/SentryTitan;->addEvent(Ljava/lang/String;Lp92;Ljava/lang/Exception;[Lcom/supercell/titan/SentryTitan$EventAttachment;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const/4 v1, 0x4

    .line 170
    invoke-static {v4, v1}, Lcom/supercell/titan/GameApp;->d(Lcom/supercell/titan/d;I)V

    .line 171
    .line 172
    .line 173
    goto :goto_6

    .line 174
    :goto_5
    sget-object v5, Lp92;->c:Lp92;

    .line 175
    .line 176
    new-instance v6, Lcom/supercell/titan/SentryTitan$EventFileAttachment;

    .line 177
    .line 178
    new-instance v7, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    .line 182
    .line 183
    sget-object v8, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 184
    .line 185
    invoke-virtual {v8}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    invoke-virtual {v8}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    const v0, 0x12b

    const-string v8, "/shared_prefs/localPrefs-plain.xml"

    .line 197
    .line 198
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    invoke-direct {v6, v7}, Lcom/supercell/titan/SentryTitan$EventFileAttachment;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    new-array v7, v15, [Lcom/supercell/titan/SentryTitan$EventAttachment;

    .line 209
    .line 210
    aput-object v6, v7, v2

    .line 211
    .line 212
    invoke-static {v3, v5, v1, v7, v3}, Lcom/supercell/titan/SentryTitan;->addEvent(Ljava/lang/String;Lp92;Ljava/lang/Exception;[Lcom/supercell/titan/SentryTitan$EventAttachment;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    const/4 v1, 0x3

    .line 216
    invoke-static {v4, v1}, Lcom/supercell/titan/GameApp;->d(Lcom/supercell/titan/d;I)V

    .line 217
    .line 218
    .line 219
    :goto_6
    return v2

    .line 220
    :cond_5
    sget-object v3, Lcom/supercell/titan/GameApp;->z0:Ljava/util/Vector;

    .line 221
    .line 222
    monitor-enter v3

    .line 223
    :try_start_1
    invoke-virtual {v3, v4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    sget-object v5, Lcom/supercell/titan/GameApp;->A0:Ljava/util/Vector;

    .line 227
    .line 228
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-virtual {v5, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 236
    invoke-static {v4}, Lcom/supercell/titan/GameApp;->e(Lcom/supercell/titan/d;)V

    .line 237
    .line 238
    .line 239
    return v7

    .line 240
    :catchall_0
    move-exception v1

    .line 241
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 242
    throw v1
.end method

.method public static d(Lcom/supercell/titan/d;I)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->isNativeLibraryLoaded()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Lcom/supercell/titan/GameApp$NotificationData;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/supercell/titan/GameApp$NotificationData;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/supercell/titan/d;->b:Ljava/lang/String;

    .line 14
    .line 15
    const v2, 0x12c

    const-string v2, ""

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object v1, v2

    .line 21
    :goto_0
    iput-object v1, v0, Lcom/supercell/titan/GameApp$NotificationData;->notificationId:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/supercell/titan/d;->h:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    :goto_1
    iget v1, v1, Lcom/supercell/titan/GameApp$NotificationSource;->a:I

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    sget-object v1, Lcom/supercell/titan/GameApp$NotificationSource;->LOCAL:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :goto_2
    iput v1, v0, Lcom/supercell/titan/GameApp$NotificationData;->source:I

    .line 34
    .line 35
    iget-object v1, p0, Lcom/supercell/titan/d;->d:Ljava/lang/String;

    .line 36
    .line 37
    iput-object v1, v0, Lcom/supercell/titan/GameApp$NotificationData;->message:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p0, Lcom/supercell/titan/d;->e:Ljava/lang/String;

    .line 40
    .line 41
    iput-object v1, v0, Lcom/supercell/titan/GameApp$NotificationData;->title:Ljava/lang/String;

    .line 42
    .line 43
    iget-object p0, p0, Lcom/supercell/titan/d;->g:Ljava/lang/String;

    .line 44
    .line 45
    iput-object p0, v0, Lcom/supercell/titan/GameApp$NotificationData;->channelId:Ljava/lang/String;

    .line 46
    .line 47
    iput-object v2, v0, Lcom/supercell/titan/GameApp$NotificationData;->chronosEventId:Ljava/lang/String;

    .line 48
    .line 49
    iput-object v2, v0, Lcom/supercell/titan/GameApp$NotificationData;->actionId:Ljava/lang/String;

    .line 50
    .line 51
    iput p1, v0, Lcom/supercell/titan/GameApp$NotificationData;->deliveryErrorCode:I

    .line 52
    .line 53
    invoke-static {v0}, Lcom/supercell/titan/GameApp;->notificationDelivered(Lcom/supercell/titan/GameApp$NotificationData;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public static debuggerException(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object v0, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/io/StringWriter;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/io/PrintWriter;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const v1, 0x12d

    const-string v1, "GameApp"

    .line 25
    .line 26
    const v2, 0x12e

    const-string v2, "debuggerException"

    .line 27
    .line 28
    invoke-static {v1, v2, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 29
    .line 30
    .line 31
    sget-object p0, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 32
    .line 33
    iget-object p0, p0, Lcom/supercell/titan/GameApp;->m0:Ljava/util/Vector;

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
.end method

.method public static debuggerWarning(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const v0, 0x12f

    const-string v0, "GameApp.debuggerWarning:"

    .line 4
    .line 5
    const v1, 0x130

    const-string v1, "GameApp"

    .line 6
    .line 7
    invoke-static {v1, v0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    invoke-static {v1, p0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    sget-object v0, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/supercell/titan/GameApp;->m0:Ljava/util/Vector;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public static native deinit()V
.end method

.method public static native dialogDismissed(II)V
.end method

.method public static e(Lcom/supercell/titan/d;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->isNativeLibraryLoaded()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Lcom/supercell/titan/GameApp$NotificationData;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/supercell/titan/GameApp$NotificationData;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/supercell/titan/d;->b:Ljava/lang/String;

    .line 14
    .line 15
    const v2, 0x131

    const-string v2, ""

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object v1, v2

    .line 21
    :goto_0
    iput-object v1, v0, Lcom/supercell/titan/GameApp$NotificationData;->notificationId:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/supercell/titan/d;->h:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    :goto_1
    iget v1, v1, Lcom/supercell/titan/GameApp$NotificationSource;->a:I

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    sget-object v1, Lcom/supercell/titan/GameApp$NotificationSource;->LOCAL:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :goto_2
    iput v1, v0, Lcom/supercell/titan/GameApp$NotificationData;->source:I

    .line 34
    .line 35
    iget-object v1, p0, Lcom/supercell/titan/d;->d:Ljava/lang/String;

    .line 36
    .line 37
    iput-object v1, v0, Lcom/supercell/titan/GameApp$NotificationData;->message:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p0, Lcom/supercell/titan/d;->e:Ljava/lang/String;

    .line 40
    .line 41
    iput-object v1, v0, Lcom/supercell/titan/GameApp$NotificationData;->title:Ljava/lang/String;

    .line 42
    .line 43
    iget-object p0, p0, Lcom/supercell/titan/d;->g:Ljava/lang/String;

    .line 44
    .line 45
    iput-object p0, v0, Lcom/supercell/titan/GameApp$NotificationData;->channelId:Ljava/lang/String;

    .line 46
    .line 47
    iput-object v2, v0, Lcom/supercell/titan/GameApp$NotificationData;->chronosEventId:Ljava/lang/String;

    .line 48
    .line 49
    iput-object v2, v0, Lcom/supercell/titan/GameApp$NotificationData;->actionId:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v0}, Lcom/supercell/titan/GameApp;->notificationScheduled(Lcom/supercell/titan/GameApp$NotificationData;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public static getAPKPath()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return-object v0
.end method

.method public static native getAllowedScreenRotations()I
.end method

.method public static getCurrentDisplayMode()Landroid/view/Display$Mode;
    .locals 1

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/view/Display;->getMode()Landroid/view/Display$Mode;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public static getDisplayModes()[Landroid/view/Display$Mode;
    .locals 1

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/view/Display;->getSupportedModes()[Landroid/view/Display$Mode;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public static getHuaweiNotchSize(Landroid/content/Context;)[I
    .locals 4

    .line 1
    const/4 v1, 0x0

    .line 2
    filled-new-array {v1, v1}, [I

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const v0, 0x132

    const-string v2, "com.huawei.android.util.HwNotchSizeUtil"

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const v0, 0x133

    const-string v2, "getNotchSize"

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {p0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, [I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    return-object p0

    .line 30
    :catch_0
    :catchall_0
    return-object v1
.end method

.method public static getInstance()Lcom/supercell/titan/GameApp;
    .locals 1

    .line 1
    sget-object v0, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getNumberOfActiveNotifications()I
    .locals 3

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->areNotificationsEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v2, Lap1;

    .line 14
    .line 15
    invoke-direct {v2, v0}, Lap1;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, v2, Lap1;->a:Landroid/app/NotificationManager;

    .line 19
    .line 20
    invoke-static {v0}, Lyo1;->a(Landroid/app/NotificationManager;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    return v0

    .line 31
    :cond_1
    return v1
.end method

.method public static native handleDeeplinkURL(Ljava/lang/String;)V
.end method

.method public static native handleObservation(I)V
.end method

.method public static hapticFeedback(I)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Leq0;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, p0, v2}, Leq0;-><init>(II)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public static hasHuaweiNotchInScreen(Landroid/content/Context;)Z
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const v0, 0x134

    const-string v1, "com.huawei.android.util.HwNotchSizeUtil"

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const v0, 0x135

    const-string v1, "hasNotchInScreen"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {p0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    return p0

    .line 29
    :catch_0
    :catchall_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public static isEmulator()Z
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/supercell/titan/GameApp;->e:Ljava/lang/Thread;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    :catch_0
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-boolean v0, v0, Lcom/supercell/titan/GameApp;->d:Z

    .line 15
    .line 16
    return v0
.end method

.method public static isFeatureEnabled(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const v0, 0x136

    const-string v1, "EnabledFeatures"

    .line 2
    .line 3
    :try_start_0
    const-class v2, Lcom/supercell/titan/BuildConfig;

    .line 4
    .line 5
    invoke-virtual {v2, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    const v0, 0x137

    const-string v2, "com.supercell.titan.BuildConfig"

    .line 9
    .line 10
    invoke-static {v2, v1}, Lcom/supercell/titan/ReflectionUtils;->getStaticFieldValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    return p0

    .line 21
    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const v0, 0x138

    const-string v2, "BuildConfig does not have field EnabledFeatures, for checking if \'"

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const v0, 0x139

    const-string p0, "\' is enabled."

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const v0, 0x13a

    const-string v1, "GameApp"

    .line 41
    .line 42
    invoke-static {v1, p0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return p0
.end method

.method public static isNativeLibraryLoaded()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/supercell/titan/TitanApplication;->nativeLibrariesLoaded:Z

    .line 2
    .line 3
    return v0
.end method

.method public static isPlayingUserMusic()Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x13b

    const-string v1, "audio"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/media/AudioManager;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/media/AudioManager;->isMusicActive()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    return v0
.end method

.method public static native isScreenResizeSupported()Z
.end method

.method public static killGame()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->finishAndRemoveTask()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static native logDebuggerException(Ljava/lang/String;)V
.end method

.method public static native nOnActivityResult(IILandroid/content/Intent;)V
.end method

.method public static native nOnAppStart()V
.end method

.method public static native nOnAppStop()V
.end method

.method public static native nOnApplicationCreate()V
.end method

.method public static native nOnConfigurationChanged(Landroid/content/res/Configuration;)V
.end method

.method public static native nOnCreate()V
.end method

.method public static native nOnDestroy()V
.end method

.method public static native nOnDisplayAdded(I)V
.end method

.method public static native nOnDisplayChanged(I)V
.end method

.method public static native nOnDisplayRemoved(I)V
.end method

.method public static native nOnKeyDownEvent(II)V
.end method

.method public static native nOnKeyRemap(J[I[ILjava/lang/String;)V
.end method

.method public static native nOnKeyUpEvent(II)V
.end method

.method public static native nOnMouseEvent(FF)V
.end method

.method public static native nOnMouseHoverEvent(FF)V
.end method

.method public static native nOnPause()V
.end method

.method public static native nOnRestart()V
.end method

.method public static native nOnResume()V
.end method

.method public static native nOnStart()V
.end method

.method public static native nOnStop()V
.end method

.method public static native nOnSurfaceChanged(Landroid/view/Surface;II)V
.end method

.method public static native nOnSurfaceCreated(Landroid/view/Surface;)V
.end method

.method public static native nOnSurfaceDestroyed(Landroid/view/Surface;)V
.end method

.method public static native nOnTouchEvent(IIII)V
.end method

.method public static native nOnTrimMemory(I)V
.end method

.method public static native nOnWindowFocusChanged(Z)V
.end method

.method public static native nRunFromUiThread(J)V
.end method

.method private static native notificationCanceled(Lcom/supercell/titan/GameApp$NotificationData;)V
.end method

.method private static native notificationDelivered(Lcom/supercell/titan/GameApp$NotificationData;)V
.end method

.method private static native notificationReceived(Lcom/supercell/titan/GameApp$NotificationData;)V
.end method

.method private static native notificationReceivedOnly(Lcom/supercell/titan/GameApp$NotificationData;)V
.end method

.method private static native notificationScheduled(Lcom/supercell/titan/GameApp$NotificationData;)V
.end method

.method public static openNotificationSettings()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/content/Intent;

    .line 6
    .line 7
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 8
    .line 9
    .line 10
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v3, 0x1a

    .line 13
    .line 14
    const v4, 0x13c

    const-string v4, "android.settings.APP_NOTIFICATION_SETTINGS"

    .line 15
    .line 16
    if-lt v2, v3, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    const v2, 0x13d

    const-string v2, "android.provider.extra.APP_PACKAGE"

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v1, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 32
    .line 33
    .line 34
    const v2, 0x13e

    const-string v2, "app_package"

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iget v2, v2, Landroid/content/pm/ApplicationInfo;->uid:I

    .line 48
    .line 49
    const v3, 0x13f

    const-string v3, "app_uid"

    .line 50
    .line 51
    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static queuePushNotificationValueUpdate(ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/supercell/titan/GameApp;->isStopped()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Ldq0;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v1, p1, p0, v2, p2}, Ldq0;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/supercell/titan/GameApp;->runOnView(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public static reloadApp()V
    .locals 2

    .line 1
    const v0, 0x140

    const-string v0, "GameApp"

    .line 2
    .line 3
    const v1, 0x141

    const-string v1, "reloadApp"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/supercell/titan/GameApp;->requestFinish()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static removeDisplayedNotificationFromCancelTracking(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object v0, Lcom/supercell/titan/GameApp;->B0:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public static native setDeviceVerificationResult(ZZLjava/lang/String;)V
.end method

.method public static setDisplayMode(I)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Leq0;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, p0, v2}, Leq0;-><init>(II)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static native setPushNotificationValues(ILjava/lang/String;Ljava/lang/String;)V
.end method

.method public static native setSafeMargins(IIII)V
.end method

.method public static testDeviceIntegrity([B)V
    .locals 0

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public static trackNotificationCanceled(Lcom/supercell/titan/GameApp$NotificationData;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 49
    invoke-static {}, Lcom/supercell/titan/GameApp;->isNativeLibraryLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    invoke-static {p0}, Lcom/supercell/titan/GameApp;->notificationCanceled(Lcom/supercell/titan/GameApp$NotificationData;)V

    :cond_0
    return-void
.end method

.method public static trackNotificationCanceled(Lcom/supercell/titan/d;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/supercell/titan/GameApp$NotificationData;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/supercell/titan/GameApp$NotificationData;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/supercell/titan/d;->b:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    iput-object v1, v0, Lcom/supercell/titan/GameApp$NotificationData;->notificationId:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/supercell/titan/d;->h:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 22
    .line 23
    iget v1, v1, Lcom/supercell/titan/GameApp$NotificationSource;->a:I

    .line 24
    .line 25
    iput v1, v0, Lcom/supercell/titan/GameApp$NotificationData;->source:I

    .line 26
    .line 27
    iget-object v1, p0, Lcom/supercell/titan/d;->d:Ljava/lang/String;

    .line 28
    .line 29
    iput-object v1, v0, Lcom/supercell/titan/GameApp$NotificationData;->message:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, p0, Lcom/supercell/titan/d;->e:Ljava/lang/String;

    .line 32
    .line 33
    iput-object v1, v0, Lcom/supercell/titan/GameApp$NotificationData;->title:Ljava/lang/String;

    .line 34
    .line 35
    const v1, 0x142

    const-string v1, ""

    .line 36
    .line 37
    iput-object v1, v0, Lcom/supercell/titan/GameApp$NotificationData;->actionId:Ljava/lang/String;

    .line 38
    .line 39
    iput-object v1, v0, Lcom/supercell/titan/GameApp$NotificationData;->chronosEventId:Ljava/lang/String;

    .line 40
    .line 41
    iget-object p0, p0, Lcom/supercell/titan/d;->g:Ljava/lang/String;

    .line 42
    .line 43
    iput-object p0, v0, Lcom/supercell/titan/GameApp$NotificationData;->channelId:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0}, Lcom/supercell/titan/GameApp;->trackNotificationCanceled(Lcom/supercell/titan/GameApp$NotificationData;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static trackNotificationDelivered(Lcom/supercell/titan/GameApp$NotificationData;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lcom/supercell/titan/GameApp;->isNativeLibraryLoaded()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Lcom/supercell/titan/GameApp;->notificationDelivered(Lcom/supercell/titan/GameApp$NotificationData;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static trackNotificationReceived(Lcom/supercell/titan/GameApp$NotificationData;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/supercell/titan/GameApp;->notificationReceived(Lcom/supercell/titan/GameApp$NotificationData;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static trackNotificationReceivedOnly(Lcom/supercell/titan/GameApp$NotificationData;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lcom/supercell/titan/GameApp;->isNativeLibraryLoaded()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Lcom/supercell/titan/GameApp;->notificationReceivedOnly(Lcom/supercell/titan/GameApp$NotificationData;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static vibrateDevice()V
    .locals 4

    .line 1
    :try_start_0
    sget-object v1, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 2
    .line 3
    const v0, 0x143

    const-string v2, "vibrator"

    .line 4
    .line 5
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroid/os/Vibrator;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/os/Vibrator;->hasVibrator()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-wide/16 v2, 0x190

    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Landroid/os/Vibrator;->vibrate(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    :cond_1
    :goto_0
    return-void

    .line 26
    :catch_0
    move-exception v1

    .line 27
    const v0, 0x144

    const-string v2, "GameApp"

    .line 28
    .line 29
    const v0, 0x145

    const-string v3, "GameApp.vibrateDevice()"

    .line 30
    .line 31
    invoke-static {v2, v3, v1}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 32
    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public addActivityEventListener(Lcom/supercell/titan/GameApp$ActivityEventListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/supercell/titan/GameApp;->V:Ljava/util/Vector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/Vector;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/supercell/titan/GameApp;->V:Ljava/util/Vector;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lcom/supercell/titan/GameApp;->V:Ljava/util/Vector;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public addActivityResultListener(Lcom/supercell/titan/GameApp$OnActivityResultListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/supercell/titan/GameApp;->p0:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Lcom/supercell/titan/GameApp;->p0:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p0
.end method

.method public beforeLogicCallback()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/supercell/titan/GameApp;->getPurchaseManager()Lcom/supercell/titan/PurchaseManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/supercell/titan/PurchaseManager;->updateBeforeFrame()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {}, Lcom/supercell/titan/NativeHTTPClientManager;->getInstance()Lcom/supercell/titan/NativeHTTPClientManager;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/supercell/titan/NativeHTTPClientManager;->updateBeforeFrame()V

    .line 15
    .line 16
    .line 17
    sget-boolean v0, Lcom/supercell/titan/VirtualKeyboardHandler;->visible:Z

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v0, :cond_4

    .line 22
    .line 23
    iget v0, p0, Lcom/supercell/titan/GameApp;->s0:I

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    new-instance v0, Landroid/os/Handler;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 34
    .line 35
    .line 36
    iget-object v3, p0, Lcom/supercell/titan/GameApp;->u0:Ltc;

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 39
    .line 40
    .line 41
    :cond_1
    iget v0, p0, Lcom/supercell/titan/GameApp;->s0:I

    .line 42
    .line 43
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    iput v0, p0, Lcom/supercell/titan/GameApp;->s0:I

    .line 46
    .line 47
    const/4 v3, 0x4

    .line 48
    if-ne v0, v3, :cond_2

    .line 49
    .line 50
    iput v1, p0, Lcom/supercell/titan/GameApp;->s0:I

    .line 51
    .line 52
    :cond_2
    iget v0, p0, Lcom/supercell/titan/GameApp;->r0:F

    .line 53
    .line 54
    iget v1, p0, Lcom/supercell/titan/GameApp;->q0:F

    .line 55
    .line 56
    cmpl-float v1, v0, v1

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    iput v0, p0, Lcom/supercell/titan/GameApp;->q0:F

    .line 61
    .line 62
    invoke-static {v0, v2}, Lcom/supercell/titan/VirtualKeyboardHandler;->keyboardSizeChanged(FF)V

    .line 63
    .line 64
    .line 65
    :cond_3
    return-void

    .line 66
    :cond_4
    iget v0, p0, Lcom/supercell/titan/GameApp;->r0:F

    .line 67
    .line 68
    cmpl-float v0, v0, v2

    .line 69
    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    invoke-static {v2, v2}, Lcom/supercell/titan/VirtualKeyboardHandler;->keyboardSizeChanged(FF)V

    .line 73
    .line 74
    .line 75
    :cond_5
    iput v2, p0, Lcom/supercell/titan/GameApp;->q0:F

    .line 76
    .line 77
    iput v2, p0, Lcom/supercell/titan/GameApp;->r0:F

    .line 78
    .line 79
    iput v1, p0, Lcom/supercell/titan/GameApp;->s0:I

    .line 80
    .line 81
    return-void
.end method

.method public final declared-synchronized c(Ljava/lang/String;Ljava/lang/String;Lcom/supercell/titan/SecurePreferences;)Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p3, p1}, Lcom/supercell/titan/SecurePreferences;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p3, p1}, Lcom/supercell/titan/SecurePreferences;->removeValue(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_2

    .line 26
    :cond_1
    invoke-virtual {p3, p1, p2}, Lcom/supercell/titan/SecurePreferences;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    :goto_0
    const/4 p1, 0x1

    .line 30
    :goto_1
    monitor-exit p0

    .line 31
    return p1

    .line 32
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw p1
.end method

.method public getBuildConfigFromGame(Ljava/lang/String;)Ljava/lang/Object;
    .locals 5

    .line 1
    const v0, 0x146

    const-string v1, "GameApp"

    .line 2
    .line 3
    :try_start_0
    const v0, 0x147

    const-string v2, ".BuildConfig"

    .line 4
    .line 5
    const v0, 0x148

    const-string v3, "sc_manifest_package_name"

    .line 6
    .line 7
    invoke-virtual {p0, v3}, Lcom/supercell/titan/GameApp;->getStringResourceByName(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    const v0, 0x149

    const-string v3, "sc_manifest_package_name not found from project resources. Please add it for getBuildConfigFromGame() to work. "

    .line 18
    .line 19
    invoke-static {v1, v3}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    new-instance v3, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    :goto_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    return-object p0

    .line 59
    :catch_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const v0, 0x14a

    const-string v2, "Cannot find value for project BuildConfig key: "

    .line 62
    .line 63
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {v1, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    const/4 p0, 0x0

    .line 77
    return-object p0
.end method

.method public getBundle()Landroid/os/Bundle;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/GameApp;->d0:Landroid/os/Bundle;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDebuggerExceptions()Ljava/util/Vector;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Vector<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/GameApp;->m0:Ljava/util/Vector;

    .line 2
    .line 3
    return-object p0
.end method

.method public getGooglePlayClientID()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/GameApp;->a0:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getIntegerResourceByName(Ljava/lang/String;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v1, 0x14b

    const-string v1, "integer"

    .line 10
    .line 11
    invoke-virtual {p0, p1, v1, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getInteger(I)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public getKLSSO()Ljava/lang/String;
    .locals 0

    .line 1
    const p0, 0x14c

    const-string p0, ""

    .line 2
    .line 3
    return-object p0
.end method

.method public declared-synchronized getKeyValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/supercell/titan/GameApp;->h0:Lcom/supercell/titan/SecurePreferences;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Lcom/supercell/titan/SecurePreferences;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-object v0

    .line 16
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/supercell/titan/GameApp;->g0:Lcom/supercell/titan/SecurePreferences;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/supercell/titan/SecurePreferences;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Lcom/supercell/titan/GameApp;->h0:Lcom/supercell/titan/SecurePreferences;

    .line 29
    .line 30
    invoke-virtual {v1, p1, v0}, Lcom/supercell/titan/SecurePreferences;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/supercell/titan/GameApp;->requestBackup()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    monitor-exit p0

    .line 40
    return-object v0

    .line 41
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    throw p1
.end method

.method public getPurchaseManager()Lcom/supercell/titan/PurchaseManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/GameApp;->f0:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSecurePreferences()Lcom/supercell/titan/SecurePreferences;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/GameApp;->g0:Lcom/supercell/titan/SecurePreferences;

    .line 2
    .line 3
    return-object p0
.end method

.method public getStringResourceByName(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const v2, 0x14d

    const-string v2, "string"

    .line 10
    .line 11
    invoke-virtual {v1, p1, v2, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const p0, 0x14e

    const-string p0, "GameApp.getStringResourceByName unable to find String with id:"

    .line 18
    .line 19
    const v0, 0x14f

    const-string v0, "GameApp"

    .line 20
    .line 21
    invoke-static {v0, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    invoke-static {v0, p1}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    const p0, 0x150

    const-string p0, ""

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public getView()Lcom/supercell/titan/GL2JNISurfaceView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/GameApp;->W:Lcom/supercell/titan/GL2JNISurfaceView;

    .line 2
    .line 3
    return-object p0
.end method

.method public handleDeepLink(Ljava/lang/String;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Lcom/supercell/titan/GameApp;->handleDeeplinkURL(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    const v0, 0x151

    const-string v1, "dsn"

    .line 7
    .line 8
    :try_start_0
    const v0, 0x152

    const-string v2, "sentry_preferences"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-interface {p0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    const v0, 0x153

    const-string v2, "/crashreport.dsn/"

    .line 22
    .line 23
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    const v0, 0x154

    const-string v2, "/"

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-le v4, v2, :cond_1

    .line 42
    .line 43
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_1

    .line 52
    .line 53
    invoke-static {p1, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance v2, Ljava/lang/String;

    .line 58
    .line 59
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 60
    .line 61
    invoke-direct {v2, p1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-interface {p0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 69
    .line 70
    .line 71
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    :cond_1
    return-void

    .line 75
    :catch_0
    move-exception p0

    .line 76
    const v0, 0x155

    const-string p1, "GameApp"

    .line 77
    .line 78
    const v0, 0x156

    const-string v1, "Sentry custom dsn handling failed: "

    .line 79
    .line 80
    invoke-static {p1, v1, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public handleFocusGained()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/supercell/titan/GameApp;->l0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/supercell/titan/GameApp;->v0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/supercell/titan/GameApp;->v0:Z

    .line 11
    .line 12
    new-instance v0, Ltc;

    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    invoke-direct {v0, p0, v1}, Ltc;-><init>(Lcom/supercell/titan/GameApp;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public handleResume(Z)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const v0, 0x157

    const-string v2, "wifi"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Landroid/net/wifi/WifiManager;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->reconnect()Z

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/supercell/titan/GameApp;->a:Landroid/net/wifi/WifiManager$WifiLock;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager$WifiLock;->isHeld()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    iget-object v1, p0, Lcom/supercell/titan/GameApp;->a:Landroid/net/wifi/WifiManager$WifiLock;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager$WifiLock;->acquire()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    :catch_0
    :cond_0
    sget-boolean v1, Lcom/supercell/titan/VirtualKeyboardHandler;->visible:Z

    .line 34
    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    invoke-static {}, Lcom/supercell/titan/VirtualKeyboardHandler;->hideKeyboard()V

    .line 38
    .line 39
    .line 40
    :cond_1
    if-nez p1, :cond_5

    .line 41
    .line 42
    iget-object p1, p0, Lcom/supercell/titan/GameApp;->k0:Lcom/supercell/titan/GoogleServiceClient;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/supercell/titan/GoogleServiceClient;->onStart()V

    .line 45
    .line 46
    .line 47
    const v0, 0x158

    const-string p1, "notification"

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Landroid/app/NotificationManager;

    .line 54
    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    :try_start_1
    sget-object v1, Lcom/supercell/titan/GameApp;->B0:Ljava/util/concurrent/ConcurrentHashMap;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_2

    .line 72
    .line 73
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Lcom/supercell/titan/GameApp$NotificationData;

    .line 78
    .line 79
    invoke-static {v2}, Lcom/supercell/titan/GameApp;->trackNotificationReceivedOnly(Lcom/supercell/titan/GameApp$NotificationData;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    sget-object v1, Lcom/supercell/titan/GameApp;->B0:Ljava/util/concurrent/ConcurrentHashMap;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/app/NotificationManager;->cancelAll()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 89
    .line 90
    .line 91
    :catch_1
    :cond_3
    sget-object p1, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 92
    .line 93
    iget-object p1, p1, Lcom/supercell/titan/GameApp;->Z:Landroid/app/AlarmManager;

    .line 94
    .line 95
    sget-object v1, Lcom/supercell/titan/GameApp;->z0:Ljava/util/Vector;

    .line 96
    .line 97
    monitor-enter v1

    .line 98
    const/4 v2, 0x0

    .line 99
    :goto_1
    :try_start_2
    sget-object v3, Lcom/supercell/titan/GameApp;->z0:Ljava/util/Vector;

    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-ge v2, v4, :cond_4

    .line 106
    .line 107
    invoke-virtual {v3, v2}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    check-cast v3, Lcom/supercell/titan/d;

    .line 112
    .line 113
    iget-object v4, v3, Lcom/supercell/titan/d;->a:Landroid/app/PendingIntent;

    .line 114
    .line 115
    invoke-virtual {p1, v4}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v3}, Lcom/supercell/titan/GameApp;->trackNotificationCanceled(Lcom/supercell/titan/d;)V

    .line 119
    .line 120
    .line 121
    add-int/lit8 v2, v2, 0x1

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :catchall_0
    move-exception p0

    .line 125
    goto :goto_2

    .line 126
    :cond_4
    monitor-exit v1

    .line 127
    goto :goto_3

    .line 128
    :goto_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 129
    throw p0

    .line 130
    :cond_5
    :goto_3
    iget-object p1, p0, Lcom/supercell/titan/GameApp;->f0:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 131
    .line 132
    if-eqz p1, :cond_6

    .line 133
    .line 134
    invoke-virtual {p1}, Lcom/supercell/titan/PurchaseManagerGoogle;->onResume()V

    .line 135
    .line 136
    .line 137
    :cond_6
    invoke-static {}, Lcom/supercell/titan/HelpshiftTitan;->onResume()V

    .line 138
    .line 139
    .line 140
    iget-object p0, p0, Lcom/supercell/titan/GameApp;->W:Lcom/supercell/titan/GL2JNISurfaceView;

    .line 141
    .line 142
    if-eqz p0, :cond_7

    .line 143
    .line 144
    invoke-static {}, Lcom/supercell/titan/GameApp;->nOnStart()V

    .line 145
    .line 146
    .line 147
    :cond_7
    return-void
.end method

.method public isPortrait()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const v0, 0x159

    const-string v0, "window"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Landroid/view/WindowManager;

    .line 12
    .line 13
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Landroid/view/Display;->getOrientation()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    if-ne p0, v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0

    .line 29
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 30
    return p0
.end method

.method public isStopped()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/supercell/titan/GameApp;->X:Z

    .line 2
    .line 3
    return p0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/supercell/titan/GameApp;->k0:Lcom/supercell/titan/GoogleServiceClient;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lcom/supercell/titan/GoogleServiceClient;->onActivityResult(IILandroid/content/Intent;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/supercell/titan/GameApp;->f0:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const v1, 0x989684

    .line 16
    .line 17
    .line 18
    if-ne p1, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2, p3}, Lcom/supercell/titan/PurchaseManager;->onActivityResult(IILandroid/content/Intent;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, Lcom/supercell/titan/GameApp;->p0:Ljava/util/ArrayList;

    .line 24
    .line 25
    monitor-enter v0

    .line 26
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object p0, p0, Lcom/supercell/titan/GameApp;->p0:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 31
    .line 32
    .line 33
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lcom/supercell/titan/GameApp$OnActivityResultListener;

    .line 49
    .line 50
    invoke-interface {v0, p1, p2, p3}, Lcom/supercell/titan/GameApp$OnActivityResultListener;->onActivityResult(IILandroid/content/Intent;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    invoke-static {}, Lcom/supercell/titan/GameApp;->isNativeLibraryLoaded()Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_3

    .line 59
    .line 60
    invoke-static {p1, p2, p3}, Lcom/supercell/titan/GameApp;->nOnActivityResult(IILandroid/content/Intent;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    return-void

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    throw p0
.end method

.method public onBackPressed()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/supercell/titan/TitanWebView;->isInCustomView()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/supercell/titan/TitanWebView;->hideCustomView()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/supercell/titan/GameApp;->W:Lcom/supercell/titan/GL2JNISurfaceView;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-static {}, Lcom/supercell/titan/GameApp;->backButtonPressed()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->isNativeLibraryLoaded()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lcom/supercell/titan/GameApp;->nOnConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 26

    .line 1
    move-object/from16 v13, p0

    .line 2
    .line 3
    invoke-virtual {v13}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, v13, Lcom/supercell/titan/GameApp;->o0:Lcom/supercell/titan/GameApp$QuagoActivityLifecycleCallbacks;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 10
    .line 11
    .line 12
    invoke-super/range {p0 .. p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    sput-object v13, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 16
    .line 17
    new-instance v0, Landroid/os/Handler;

    .line 18
    .line 19
    invoke-virtual {v13}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, v13, Lcom/supercell/titan/GameApp;->b:Landroid/os/Handler;

    .line 27
    .line 28
    new-instance v0, Lcom/supercell/titan/QuagoManager;

    .line 29
    .line 30
    invoke-direct {v0, v13}, Lcom/supercell/titan/QuagoManager;-><init>(Lcom/supercell/titan/GameApp;)V

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-static {}, Lcom/supercell/titan/ApplicationUtil;->requestAdvertiserInfoOnNewThread()V

    .line 42
    .line 43
    .line 44
    const v25, 0x15a

    const-string v0, "googleplay_clientid"

    .line 45
    .line 46
    invoke-virtual {v13, v0}, Lcom/supercell/titan/GameApp;->getStringResourceByName(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, v13, Lcom/supercell/titan/GameApp;->a0:Ljava/lang/String;

    .line 51
    .line 52
    iget v0, v13, Lcom/supercell/titan/GameApp;->c0:I

    .line 53
    .line 54
    const/4 v1, -0x1

    .line 55
    if-eq v0, v1, :cond_0

    .line 56
    .line 57
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, v13, Lcom/supercell/titan/GameApp;->b0:Ljava/lang/String;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object v0, v13, Lcom/supercell/titan/GameApp;->b0:Ljava/lang/String;

    .line 69
    .line 70
    const v25, 0x15b

    const-string v2, "this game"

    .line 71
    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_1

    .line 79
    .line 80
    iget-object v0, v13, Lcom/supercell/titan/GameApp;->b0:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    :cond_1
    const v25, 0x15c

    const-string v0, "app_name"

    .line 89
    .line 90
    invoke-virtual {v13, v0}, Lcom/supercell/titan/GameApp;->getStringResourceByName(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iput-object v0, v13, Lcom/supercell/titan/GameApp;->b0:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_2

    .line 101
    .line 102
    iput-object v2, v13, Lcom/supercell/titan/GameApp;->b0:Ljava/lang/String;

    .line 103
    .line 104
    :cond_2
    :goto_0
    invoke-virtual {v13}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-eqz v0, :cond_3

    .line 109
    .line 110
    const v25, 0x15d

    const-string v2, "NativeDialog"

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    instance-of v2, v0, Lcom/supercell/titan/NativeDialogManager;

    .line 117
    .line 118
    if-eqz v2, :cond_3

    .line 119
    .line 120
    check-cast v0, Lcom/supercell/titan/NativeDialogManager;

    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/supercell/titan/NativeDialogManager;->startupDismiss()V

    .line 123
    .line 124
    .line 125
    :cond_3
    move-object/from16 v0, p1

    .line 126
    .line 127
    iput-object v0, v13, Lcom/supercell/titan/GameApp;->d0:Landroid/os/Bundle;

    .line 128
    .line 129
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 130
    .line 131
    const/16 v2, 0x1d

    .line 132
    .line 133
    const/4 v14, 0x1

    .line 134
    if-ge v0, v2, :cond_4

    .line 135
    .line 136
    invoke-virtual {v13}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    const v25, 0x15e

    const-string v2, "wifi"

    .line 141
    .line 142
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 147
    .line 148
    if-eqz v0, :cond_4

    .line 149
    .line 150
    invoke-virtual {v13}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v0, v14, v2}, Landroid/net/wifi/WifiManager;->createWifiLock(ILjava/lang/String;)Landroid/net/wifi/WifiManager$WifiLock;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    iput-object v2, v13, Lcom/supercell/titan/GameApp;->a:Landroid/net/wifi/WifiManager$WifiLock;

    .line 159
    .line 160
    :try_start_0
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->reconnect()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    .line 162
    .line 163
    :catch_0
    :cond_4
    const v25, 0x15f

    const-string v0, "alarm"

    .line 164
    .line 165
    invoke-virtual {v13, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, Landroid/app/AlarmManager;

    .line 170
    .line 171
    iput-object v0, v13, Lcom/supercell/titan/GameApp;->Z:Landroid/app/AlarmManager;

    .line 172
    .line 173
    invoke-virtual {v13}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    const/16 v2, 0x400

    .line 178
    .line 179
    invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setFlags(II)V

    .line 180
    .line 181
    .line 182
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 183
    .line 184
    const/16 v15, 0x1c

    .line 185
    .line 186
    if-lt v2, v15, :cond_5

    .line 187
    .line 188
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-static {v2}, Lsk0;->A(Landroid/view/WindowManager$LayoutParams;)V

    .line 193
    .line 194
    .line 195
    :cond_5
    const/high16 v2, 0x8000000

    .line 196
    .line 197
    invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setFlags(II)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v13}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    iput v0, v13, Lcom/supercell/titan/GameApp;->requestedOrientation:I

    .line 205
    .line 206
    const v25, 0x160

    const-string v0, "6.0"

    .line 207
    .line 208
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 209
    .line 210
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_6

    .line 215
    .line 216
    iget v0, v13, Lcom/supercell/titan/GameApp;->requestedOrientation:I

    .line 217
    .line 218
    const/4 v2, 0x7

    .line 219
    if-ne v0, v2, :cond_6

    .line 220
    .line 221
    const/4 v0, 0x6

    .line 222
    invoke-virtual {v13, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 223
    .line 224
    .line 225
    iget v0, v13, Lcom/supercell/titan/GameApp;->requestedOrientation:I

    .line 226
    .line 227
    invoke-virtual {v13, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 228
    .line 229
    .line 230
    :cond_6
    sget-object v0, Lrd0;->k:Lrd0;

    .line 231
    .line 232
    if-nez v0, :cond_7

    .line 233
    .line 234
    new-instance v0, Lrd0;

    .line 235
    .line 236
    invoke-virtual {v13}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-direct {v0, v2}, Lrd0;-><init>(Landroid/content/Context;)V

    .line 241
    .line 242
    .line 243
    sput-object v0, Lrd0;->k:Lrd0;

    .line 244
    .line 245
    :cond_7
    sget-object v0, Lrd0;->k:Lrd0;

    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    new-instance v2, Ld52;

    .line 251
    .line 252
    invoke-direct {v2, v13}, Ld52;-><init>(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    new-instance v3, Ljava/lang/Thread;

    .line 256
    .line 257
    new-instance v4, Ldp0;

    .line 258
    .line 259
    const/16 v5, 0x8

    .line 260
    .line 261
    const/4 v6, 0x0

    .line 262
    invoke-direct {v4, v0, v2, v5, v6}, Ldp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 263
    .line 264
    .line 265
    invoke-direct {v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 269
    .line 270
    .line 271
    iput-object v3, v13, Lcom/supercell/titan/GameApp;->e:Ljava/lang/Thread;

    .line 272
    .line 273
    iget-boolean v0, v13, Lcom/supercell/titan/GameApp;->Y:Z

    .line 274
    .line 275
    const/4 v2, 0x0

    .line 276
    if-eqz v0, :cond_8

    .line 277
    .line 278
    goto/16 :goto_e

    .line 279
    .line 280
    :cond_8
    iput-boolean v14, v13, Lcom/supercell/titan/GameApp;->Y:Z

    .line 281
    .line 282
    invoke-virtual {v13}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 291
    .line 292
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    invoke-virtual {v0, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    invoke-static {v5}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    new-instance v7, Lzp0;

    .line 309
    .line 310
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v5, v7}, Ljava/util/Optional;->map(Ljava/util/function/Function;)Ljava/util/Optional;

    .line 314
    .line 315
    .line 316
    move-result-object v5

    .line 317
    const v25, 0x161

    const-string v7, ""

    .line 318
    .line 319
    invoke-virtual {v5, v7}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    move-object v12, v5

    .line 324
    check-cast v12, Ljava/lang/String;

    .line 325
    .line 326
    invoke-virtual {v13}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    const-wide/16 v8, 0x0

    .line 331
    .line 332
    if-eqz v5, :cond_9

    .line 333
    .line 334
    invoke-virtual {v5}, Ljava/io/File;->canWrite()Z

    .line 335
    .line 336
    .line 337
    move-result v10

    .line 338
    if-eqz v10, :cond_9

    .line 339
    .line 340
    invoke-virtual {v5}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v10

    .line 344
    :try_start_1
    new-instance v11, Landroid/os/StatFs;

    .line 345
    .line 346
    invoke-direct {v11, v10}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v11}, Landroid/os/StatFs;->getAvailableBytes()J

    .line 350
    .line 351
    .line 352
    move-result-wide v10
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 353
    goto :goto_1

    .line 354
    :catch_1
    move-wide v10, v8

    .line 355
    :goto_1
    cmp-long v16, v10, v8

    .line 356
    .line 357
    if-lez v16, :cond_9

    .line 358
    .line 359
    goto :goto_2

    .line 360
    :cond_9
    move-object v5, v2

    .line 361
    move-wide v10, v8

    .line 362
    :goto_2
    if-eqz v5, :cond_a

    .line 363
    .line 364
    const-wide/32 v16, 0x40000000

    .line 365
    .line 366
    .line 367
    cmp-long v16, v10, v16

    .line 368
    .line 369
    if-ltz v16, :cond_a

    .line 370
    .line 371
    invoke-virtual {v5}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v5

    .line 375
    move/from16 v16, v1

    .line 376
    .line 377
    move-wide/from16 v17, v8

    .line 378
    .line 379
    goto :goto_5

    .line 380
    :cond_a
    move/from16 v16, v1

    .line 381
    .line 382
    :try_start_2
    invoke-static {v13}, Lv00;->getExternalCacheDirs(Landroid/content/Context;)[Ljava/io/File;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    array-length v2, v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 387
    move-wide/from16 v17, v8

    .line 388
    .line 389
    move v8, v6

    .line 390
    :goto_3
    if-ge v8, v2, :cond_c

    .line 391
    .line 392
    :try_start_3
    aget-object v9, v1, v8

    .line 393
    .line 394
    if-eqz v9, :cond_b

    .line 395
    .line 396
    invoke-virtual {v9}, Ljava/io/File;->canWrite()Z

    .line 397
    .line 398
    .line 399
    move-result v19

    .line 400
    if-eqz v19, :cond_b

    .line 401
    .line 402
    invoke-virtual {v9}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v15
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 406
    :try_start_4
    new-instance v6, Landroid/os/StatFs;

    .line 407
    .line 408
    invoke-direct {v6, v15}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v6}, Landroid/os/StatFs;->getAvailableBytes()J

    .line 412
    .line 413
    .line 414
    move-result-wide v21
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 415
    goto :goto_4

    .line 416
    :catch_2
    move-wide/from16 v21, v17

    .line 417
    .line 418
    :goto_4
    cmp-long v6, v21, v10

    .line 419
    .line 420
    if-lez v6, :cond_b

    .line 421
    .line 422
    move-object v5, v9

    .line 423
    move-wide/from16 v10, v21

    .line 424
    .line 425
    :cond_b
    add-int/lit8 v8, v8, 0x1

    .line 426
    .line 427
    const/4 v6, 0x0

    .line 428
    const/16 v15, 0x1c

    .line 429
    .line 430
    goto :goto_3

    .line 431
    :catch_3
    move-wide/from16 v17, v8

    .line 432
    .line 433
    :catch_4
    :cond_c
    if-eqz v5, :cond_d

    .line 434
    .line 435
    invoke-virtual {v5}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v5

    .line 439
    goto :goto_5

    .line 440
    :cond_d
    const/4 v5, 0x0

    .line 441
    :goto_5
    if-eqz v5, :cond_e

    .line 442
    .line 443
    :try_start_5
    new-instance v1, Landroid/os/StatFs;

    .line 444
    .line 445
    invoke-direct {v1, v5}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBytes()J

    .line 449
    .line 450
    .line 451
    move-result-wide v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 452
    goto :goto_6

    .line 453
    :catch_5
    move-wide/from16 v1, v17

    .line 454
    .line 455
    :goto_6
    cmp-long v6, v1, v17

    .line 456
    .line 457
    move-wide v8, v1

    .line 458
    if-gtz v6, :cond_f

    .line 459
    .line 460
    move-object v5, v7

    .line 461
    goto :goto_7

    .line 462
    :cond_e
    move-object v5, v7

    .line 463
    move-wide/from16 v8, v17

    .line 464
    .line 465
    :cond_f
    :goto_7
    invoke-static {}, Lcom/supercell/titan/ApplicationUtilBase;->getAndroidID()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    if-eqz v1, :cond_10

    .line 470
    .line 471
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 472
    .line 473
    .line 474
    move-result v2

    .line 475
    if-eqz v2, :cond_11

    .line 476
    .line 477
    :cond_10
    invoke-virtual {v13}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 482
    .line 483
    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    :cond_11
    new-instance v2, Lcom/supercell/titan/SecurePreferences;

    .line 488
    .line 489
    const v25, 0x162

    const-string v6, "storage"

    .line 490
    .line 491
    invoke-direct {v2, v13, v6, v1, v14}, Lcom/supercell/titan/SecurePreferences;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 492
    .line 493
    .line 494
    iput-object v2, v13, Lcom/supercell/titan/GameApp;->g0:Lcom/supercell/titan/SecurePreferences;

    .line 495
    .line 496
    invoke-static {}, Lcom/supercell/titan/ApplicationUtilBase;->getAndroidID()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    if-eqz v2, :cond_12

    .line 501
    .line 502
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 503
    .line 504
    .line 505
    move-result v6

    .line 506
    if-eqz v6, :cond_13

    .line 507
    .line 508
    :cond_12
    const v25, 0x163

    const-string v2, "titan"

    .line 509
    .line 510
    invoke-static {v1, v2}, Lfm0;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    :cond_13
    const v25, 0x164

    const-string v1, "localPrefs-plain"

    .line 515
    .line 516
    const/4 v6, 0x0

    .line 517
    invoke-virtual {v13, v1, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    iput-object v1, v13, Lcom/supercell/titan/GameApp;->j0:Landroid/content/SharedPreferences;

    .line 522
    .line 523
    if-eqz v1, :cond_14

    .line 524
    .line 525
    const v25, 0x165

    const-string v10, "localNotifications"

    .line 526
    .line 527
    invoke-interface {v1, v10, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 532
    .line 533
    .line 534
    move-result v1

    .line 535
    if-eqz v1, :cond_14

    .line 536
    .line 537
    new-instance v1, Lcom/supercell/titan/SecurePreferences;

    .line 538
    .line 539
    const v25, 0x166

    const-string v11, "localPrefs"

    .line 540
    .line 541
    invoke-direct {v1, v13, v11, v2, v14}, Lcom/supercell/titan/SecurePreferences;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 542
    .line 543
    .line 544
    iput-object v1, v13, Lcom/supercell/titan/GameApp;->i0:Lcom/supercell/titan/SecurePreferences;

    .line 545
    .line 546
    invoke-virtual {v1, v10}, Lcom/supercell/titan/SecurePreferences;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 551
    .line 552
    .line 553
    move-result v2

    .line 554
    if-nez v2, :cond_14

    .line 555
    .line 556
    iget-object v2, v13, Lcom/supercell/titan/GameApp;->j0:Landroid/content/SharedPreferences;

    .line 557
    .line 558
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    invoke-interface {v2, v10, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 563
    .line 564
    .line 565
    move-result-object v1

    .line 566
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 567
    .line 568
    .line 569
    iget-object v1, v13, Lcom/supercell/titan/GameApp;->i0:Lcom/supercell/titan/SecurePreferences;

    .line 570
    .line 571
    invoke-virtual {v1, v10}, Lcom/supercell/titan/SecurePreferences;->removeValue(Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    :cond_14
    const/16 v1, 0x18

    .line 575
    .line 576
    new-array v1, v1, [I

    .line 577
    .line 578
    fill-array-data v1, :array_0

    .line 579
    .line 580
    .line 581
    invoke-virtual {v13}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 586
    .line 587
    .line 588
    move-result v10

    .line 589
    :goto_8
    add-int/lit8 v10, v10, -0x1

    .line 590
    .line 591
    if-ltz v10, :cond_15

    .line 592
    .line 593
    invoke-virtual {v2, v10}, Ljava/lang/String;->charAt(I)C

    .line 594
    .line 595
    .line 596
    move-result v11

    .line 597
    rem-int/lit8 v15, v10, 0x18

    .line 598
    .line 599
    aget v15, v1, v15

    .line 600
    .line 601
    xor-int/2addr v11, v15

    .line 602
    and-int/lit8 v11, v11, 0x1f

    .line 603
    .line 604
    add-int/lit8 v11, v11, 0x30

    .line 605
    .line 606
    invoke-static {v7}, Len;->p(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 607
    .line 608
    .line 609
    move-result-object v7

    .line 610
    int-to-char v11, v11

    .line 611
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v7

    .line 618
    goto :goto_8

    .line 619
    :cond_15
    new-instance v1, Lcom/supercell/titan/SecurePreferences;

    .line 620
    .line 621
    const v25, 0x167

    const-string v2, "storage_new"

    .line 622
    .line 623
    invoke-direct {v1, v13, v2, v7, v14}, Lcom/supercell/titan/SecurePreferences;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 624
    .line 625
    .line 626
    iput-object v1, v13, Lcom/supercell/titan/GameApp;->h0:Lcom/supercell/titan/SecurePreferences;

    .line 627
    .line 628
    sget-boolean v1, Lcom/supercell/titan/TitanApplication;->nativeLibrariesLoaded:Z

    .line 629
    .line 630
    if-nez v1, :cond_16

    .line 631
    .line 632
    new-instance v1, Lcom/supercell/titan/GL2JNISurfaceView;

    .line 633
    .line 634
    invoke-direct {v1, v0}, Lcom/supercell/titan/GL2JNISurfaceView;-><init>(Landroid/content/Context;)V

    .line 635
    .line 636
    .line 637
    iput-object v1, v13, Lcom/supercell/titan/GameApp;->W:Lcom/supercell/titan/GL2JNISurfaceView;

    .line 638
    .line 639
    invoke-virtual {v13, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    .line 640
    .line 641
    .line 642
    iget-object v1, v13, Lcom/supercell/titan/GameApp;->W:Lcom/supercell/titan/GL2JNISurfaceView;

    .line 643
    .line 644
    new-instance v2, Lcom/supercell/titan/c;

    .line 645
    .line 646
    invoke-direct {v2, v13}, Lcom/supercell/titan/c;-><init>(Lcom/supercell/titan/GameApp;)V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 650
    .line 651
    .line 652
    :cond_16
    invoke-static {v13}, Lorg/fmod/FMOD;->init(Landroid/content/Context;)V

    .line 653
    .line 654
    .line 655
    invoke-static {}, Lcom/supercell/titan/NativeHTTPClientManager;->getInstance()Lcom/supercell/titan/NativeHTTPClientManager;

    .line 656
    .line 657
    .line 658
    invoke-static {}, Lcom/supercell/titan/HelpshiftTitan;->getNotificationCount()I

    .line 659
    .line 660
    .line 661
    invoke-virtual {v13}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 662
    .line 663
    .line 664
    move-result-object v1

    .line 665
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 666
    .line 667
    .line 668
    move-result-object v1

    .line 669
    new-instance v2, Landroid/util/DisplayMetrics;

    .line 670
    .line 671
    invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v1, v2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 675
    .line 676
    .line 677
    move-object v7, v4

    .line 678
    move-wide/from16 v23, v8

    .line 679
    .line 680
    move-object v9, v3

    .line 681
    move-object v3, v5

    .line 682
    move-wide/from16 v4, v23

    .line 683
    .line 684
    iget v8, v2, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 685
    .line 686
    new-instance v10, Landroid/graphics/Point;

    .line 687
    .line 688
    invoke-direct {v10}, Landroid/graphics/Point;-><init>()V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v1, v10}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 692
    .line 693
    .line 694
    move/from16 v20, v6

    .line 695
    .line 696
    iget v6, v10, Landroid/graphics/Point;->x:I

    .line 697
    .line 698
    iget v1, v10, Landroid/graphics/Point;->y:I

    .line 699
    .line 700
    move-object v10, v0

    .line 701
    invoke-virtual {v10}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    move-object v11, v7

    .line 706
    move v7, v1

    .line 707
    move-object v1, v9

    .line 708
    iget v9, v2, Landroid/util/DisplayMetrics;->xdpi:F

    .line 709
    .line 710
    iget v2, v2, Landroid/util/DisplayMetrics;->ydpi:F

    .line 711
    .line 712
    move-object v15, v10

    .line 713
    move v10, v2

    .line 714
    move-object v2, v11

    .line 715
    const/4 v11, 0x2

    .line 716
    invoke-static/range {v0 .. v13}, Lcom/supercell/titan/GameApp;->createGameMain(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIIFFILjava/lang/String;Landroid/app/Activity;)Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    new-instance v1, Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 721
    .line 722
    invoke-direct {v1, v13, v0}, Lcom/supercell/titan/PurchaseManagerGoogle;-><init>(Lcom/supercell/titan/GameApp;Ljava/lang/String;)V

    .line 723
    .line 724
    .line 725
    iput-object v1, v13, Lcom/supercell/titan/GameApp;->f0:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 726
    .line 727
    new-instance v0, Lcom/supercell/titan/GL2JNISurfaceView;

    .line 728
    .line 729
    invoke-direct {v0, v15}, Lcom/supercell/titan/GL2JNISurfaceView;-><init>(Landroid/content/Context;)V

    .line 730
    .line 731
    .line 732
    iput-object v0, v13, Lcom/supercell/titan/GameApp;->W:Lcom/supercell/titan/GL2JNISurfaceView;

    .line 733
    .line 734
    invoke-virtual {v0, v14}, Landroid/view/View;->setFocusable(Z)V

    .line 735
    .line 736
    .line 737
    iget-object v0, v13, Lcom/supercell/titan/GameApp;->W:Lcom/supercell/titan/GL2JNISurfaceView;

    .line 738
    .line 739
    invoke-virtual {v0, v14}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 740
    .line 741
    .line 742
    iget-object v0, v13, Lcom/supercell/titan/GameApp;->W:Lcom/supercell/titan/GL2JNISurfaceView;

    .line 743
    .line 744
    invoke-virtual {v13, v0}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v13}, Lcom/supercell/titan/GameApp;->setSystemUiVisibility()V

    .line 748
    .line 749
    .line 750
    new-instance v0, Lcom/supercell/titan/GoogleServiceClient;

    .line 751
    .line 752
    invoke-direct {v0, v13}, Lcom/supercell/titan/GoogleServiceClient;-><init>(Lcom/supercell/titan/GameApp;)V

    .line 753
    .line 754
    .line 755
    iput-object v0, v13, Lcom/supercell/titan/GameApp;->k0:Lcom/supercell/titan/GoogleServiceClient;

    .line 756
    .line 757
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 758
    .line 759
    const/16 v1, 0x1c

    .line 760
    .line 761
    if-lt v0, v1, :cond_17

    .line 762
    .line 763
    iget-object v0, v13, Lcom/supercell/titan/GameApp;->W:Lcom/supercell/titan/GL2JNISurfaceView;

    .line 764
    .line 765
    new-instance v1, Laq0;

    .line 766
    .line 767
    invoke-direct {v1, v13}, Laq0;-><init>(Lcom/supercell/titan/GameApp;)V

    .line 768
    .line 769
    .line 770
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    .line 771
    .line 772
    .line 773
    goto :goto_d

    .line 774
    :cond_17
    invoke-virtual {v13}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    invoke-static {v0}, Lcom/supercell/titan/GameApp;->hasHuaweiNotchInScreen(Landroid/content/Context;)Z

    .line 779
    .line 780
    .line 781
    move-result v0

    .line 782
    if-eqz v0, :cond_1a

    .line 783
    .line 784
    invoke-virtual {v13}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    invoke-static {v0}, Lcom/supercell/titan/GameApp;->getHuaweiNotchSize(Landroid/content/Context;)[I

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    aget v6, v0, v14

    .line 793
    .line 794
    invoke-virtual {v13}, Lcom/supercell/titan/GameApp;->isPortrait()Z

    .line 795
    .line 796
    .line 797
    move-result v0

    .line 798
    if-eqz v0, :cond_18

    .line 799
    .line 800
    move v0, v6

    .line 801
    goto :goto_9

    .line 802
    :cond_18
    move/from16 v0, v20

    .line 803
    .line 804
    :goto_9
    iput v0, v13, Lcom/supercell/titan/GameApp;->w:I

    .line 805
    .line 806
    iput v0, v13, Lcom/supercell/titan/GameApp;->U:I

    .line 807
    .line 808
    invoke-virtual {v13}, Lcom/supercell/titan/GameApp;->isPortrait()Z

    .line 809
    .line 810
    .line 811
    move-result v0

    .line 812
    if-nez v0, :cond_19

    .line 813
    .line 814
    goto :goto_a

    .line 815
    :cond_19
    move/from16 v6, v20

    .line 816
    .line 817
    :goto_a
    iput v6, v13, Lcom/supercell/titan/GameApp;->v:I

    .line 818
    .line 819
    iput v6, v13, Lcom/supercell/titan/GameApp;->i:I

    .line 820
    .line 821
    invoke-virtual {v13}, Lcom/supercell/titan/GameApp;->setScaledSafeMargins()V

    .line 822
    .line 823
    .line 824
    goto :goto_d

    .line 825
    :cond_1a
    invoke-virtual {v13}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    const v25, 0x168

    const-string v1, "com.oppo.feature.screen.heteromorphism"

    .line 834
    .line 835
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 836
    .line 837
    .line 838
    move-result v0

    .line 839
    if-eqz v0, :cond_1d

    .line 840
    .line 841
    invoke-virtual {v13}, Lcom/supercell/titan/GameApp;->isPortrait()Z

    .line 842
    .line 843
    .line 844
    move-result v0

    .line 845
    const/16 v6, 0x64

    .line 846
    .line 847
    if-eqz v0, :cond_1b

    .line 848
    .line 849
    move v0, v6

    .line 850
    goto :goto_b

    .line 851
    :cond_1b
    move/from16 v0, v20

    .line 852
    .line 853
    :goto_b
    iput v0, v13, Lcom/supercell/titan/GameApp;->w:I

    .line 854
    .line 855
    iput v0, v13, Lcom/supercell/titan/GameApp;->U:I

    .line 856
    .line 857
    invoke-virtual {v13}, Lcom/supercell/titan/GameApp;->isPortrait()Z

    .line 858
    .line 859
    .line 860
    move-result v0

    .line 861
    if-nez v0, :cond_1c

    .line 862
    .line 863
    goto :goto_c

    .line 864
    :cond_1c
    move/from16 v6, v20

    .line 865
    .line 866
    :goto_c
    iput v6, v13, Lcom/supercell/titan/GameApp;->v:I

    .line 867
    .line 868
    iput v6, v13, Lcom/supercell/titan/GameApp;->i:I

    .line 869
    .line 870
    invoke-virtual {v13}, Lcom/supercell/titan/GameApp;->setScaledSafeMargins()V

    .line 871
    .line 872
    .line 873
    :cond_1d
    :goto_d
    invoke-static {}, Lcom/supercell/titan/GameApp;->isNativeLibraryLoaded()Z

    .line 874
    .line 875
    .line 876
    move-result v0

    .line 877
    if-eqz v0, :cond_20

    .line 878
    .line 879
    invoke-static {}, Lcom/supercell/titan/GameApp;->nOnCreate()V

    .line 880
    .line 881
    .line 882
    invoke-virtual {v13}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 883
    .line 884
    .line 885
    move-result-object v0

    .line 886
    if-eqz v0, :cond_20

    .line 887
    .line 888
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    if-nez v1, :cond_1e

    .line 893
    .line 894
    goto :goto_e

    .line 895
    :cond_1e
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    const v25, 0x169

    const-string v1, "id"

    .line 900
    .line 901
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 902
    .line 903
    .line 904
    move-result v1

    .line 905
    if-nez v1, :cond_1f

    .line 906
    .line 907
    const v25, 0x16a

    const-string v1, "msg"

    .line 908
    .line 909
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 910
    .line 911
    .line 912
    move-result v1

    .line 913
    if-nez v1, :cond_1f

    .line 914
    .line 915
    const v25, 0x16b

    const-string v1, "title"

    .line 916
    .line 917
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 918
    .line 919
    .line 920
    move-result v0

    .line 921
    if-eqz v0, :cond_20

    .line 922
    .line 923
    :cond_1f
    invoke-virtual {v13}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 924
    .line 925
    .line 926
    move-result-object v0

    .line 927
    invoke-static {v0}, Lcom/supercell/titan/GameApp;->b(Landroid/content/Intent;)V

    .line 928
    .line 929
    .line 930
    :cond_20
    :goto_e
    invoke-static {}, Lcom/supercell/titan/GameApp;->isNativeLibraryLoaded()Z

    .line 931
    .line 932
    .line 933
    move-result v0

    .line 934
    if-nez v0, :cond_21

    .line 935
    .line 936
    return-void

    .line 937
    :cond_21
    invoke-virtual {v13}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    if-eqz v0, :cond_22

    .line 942
    .line 943
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 944
    .line 945
    .line 946
    move-result-object v1

    .line 947
    if-eqz v1, :cond_22

    .line 948
    .line 949
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 950
    .line 951
    .line 952
    move-result-object v0

    .line 953
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 954
    .line 955
    .line 956
    move-result-object v2

    .line 957
    goto :goto_f

    .line 958
    :cond_22
    const/4 v2, 0x0

    .line 959
    :goto_f
    invoke-virtual {v13, v2}, Lcom/supercell/titan/GameApp;->handleDeepLink(Ljava/lang/String;)V

    .line 960
    .line 961
    .line 962
    return-void

    .line 963
    :array_0
    .array-data 4
        0x66
        0x4c
        0x78
        0x59
        0x42
        0x39
        0x4d
        0x38
        0x34
        0x41
        0x62
        0x65
        0x75
        0x73
        0x45
        0x52
        0x4d
        0x59
        0x39
        0x59
        0x46
        0x7a
        0x56
        0x47
    .end array-data
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/supercell/titan/GameApp;->o0:Lcom/supercell/titan/GameApp$QuagoActivityLifecycleCallbacks;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/supercell/titan/GameApp;->isNativeLibraryLoaded()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-static {}, Lcom/supercell/titan/GameApp;->nOnDestroy()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/supercell/titan/GameApp;->b:Landroid/os/Handler;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lorg/fmod/FMOD;->close()V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, Lcom/supercell/titan/GameApp;->f0:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/supercell/titan/PurchaseManagerGoogle;->onDestroy()V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-static {p0}, Lcom/supercell/titan/GoogleUtils;->onDestroy(Lcom/supercell/titan/GameApp;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, v0}, Lcom/supercell/titan/GameApp;->nOnKeyDownEvent(II)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x18

    .line 6
    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0xa4

    .line 10
    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/16 v0, 0x6f

    .line 18
    .line 19
    if-ne p1, v0, :cond_2

    .line 20
    .line 21
    invoke-static {}, Lcom/supercell/titan/GameApp;->backButtonPressed()Z

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/supercell/titan/GameApp;->setSystemUiVisibility()V

    .line 26
    .line 27
    .line 28
    const-wide/16 v0, 0x1388

    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Lcom/supercell/titan/GameApp;->setSystemUiVisibilityDelayed(J)V

    .line 31
    .line 32
    .line 33
    :cond_2
    :goto_1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getUnicodeChar()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {p1, v0}, Lcom/supercell/titan/GameApp;->nOnKeyUpEvent(II)V

    .line 38
    .line 39
    .line 40
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0
.end method

.method public onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/supercell/titan/GameApp;->W:Lcom/supercell/titan/GL2JNISurfaceView;

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/supercell/titan/GL2JNISurfaceView;->onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/supercell/titan/GameApp;->W:Lcom/supercell/titan/GL2JNISurfaceView;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    invoke-virtual {p0, v0}, Lcom/supercell/titan/GameApp;->handleDeepLink(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lcom/supercell/titan/GameApp;->b(Landroid/content/Intent;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/supercell/titan/GameApp;->isNativeLibraryLoaded()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lcom/supercell/titan/GameApp;->f0:Lcom/supercell/titan/PurchaseManagerGoogle;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/supercell/titan/PurchaseManagerGoogle;->onPause()V

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-static {}, Lcom/supercell/titan/GameApp;->nOnPause()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/supercell/titan/GameApp;->W:Lcom/supercell/titan/GL2JNISurfaceView;

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/supercell/titan/GL2JNISurfaceView;->onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/supercell/titan/GameApp;->V:Ljava/util/Vector;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/supercell/titan/GameApp$ActivityEventListener;

    .line 23
    .line 24
    invoke-interface {v0, p1, p2, p3}, Lcom/supercell/titan/GameApp$ActivityEventListener;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public final onRestart()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->isNativeLibraryLoaded()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/supercell/titan/GameApp;->nOnRestart()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/supercell/titan/GameApp;->isNativeLibraryLoaded()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const v0, 0x16c

    const-string v0, "input_method"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 18
    .line 19
    const v1, 0x1020002

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lcom/supercell/titan/GameApp;->nOnResume()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onStart()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 2
    .line 3
    .line 4
    const v0, 0x16d

    const-string v0, "checkUpdate"

    .line 5
    .line 6
    const-class v1, Lcom/supercell/titan/GameApp;

    .line 7
    .line 8
    const v2, 0x16e

    const-string v2, "com.supercell.titan.AppUpdater"

    .line 9
    .line 10
    invoke-static {v2, v0, v1, p0}, Lcom/supercell/titan/ReflectionUtils;->callStaticMethod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/supercell/titan/GameApp;->isNativeLibraryLoaded()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    sget-boolean v1, Lcom/supercell/titan/KkGateActivity;->foregroundHandoffPending:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    sput-boolean v1, Lcom/supercell/titan/KkGateActivity;->foregroundHandoffPending:Z

    invoke-static {}, Lcom/supercell/titan/GameApp;->nOnAppStart()V

    :cond_1
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lcom/supercell/titan/GameApp;->X:Z

    .line 22
    .line 23
    iget-boolean v1, p0, Lcom/supercell/titan/GameApp;->l0:Z

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Lcom/supercell/titan/GameApp;->v0:Z

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    iput-boolean v0, p0, Lcom/supercell/titan/GameApp;->v0:Z

    .line 32
    .line 33
    iput-boolean v0, p0, Lcom/supercell/titan/GameApp;->l0:Z

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lcom/supercell/titan/GameApp;->handleResume(Z)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object v0, p0, Lcom/supercell/titan/GameApp;->f:Lcq0;

    .line 39
    .line 40
    if-nez v0, :cond_3

    .line 41
    .line 42
    new-instance v0, Lcq0;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lcom/supercell/titan/GameApp;->f:Lcq0;

    .line 48
    .line 49
    const v0, 0x16f

    const-string v0, "display"

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Landroid/hardware/display/DisplayManager;

    .line 56
    .line 57
    iget-object p0, p0, Lcom/supercell/titan/GameApp;->f:Lcq0;

    .line 58
    .line 59
    new-instance v1, Landroid/os/Handler;

    .line 60
    .line 61
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p0, v1}, Landroid/hardware/display/DisplayManager;->registerDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;Landroid/os/Handler;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    invoke-static {}, Lcom/supercell/titan/GameApp;->nOnStart()V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final onStop()V
    .locals 16

    move-object/from16 v15, p0

    .line 1
    const p0, 0x170

    const-string v0, "Game has created ridiculous amount of notifications count="

    .line 2
    .line 3
    invoke-static {}, Lcom/supercell/titan/GameApp;->isNativeLibraryLoaded()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/supercell/titan/GameApp;->nOnStop()V

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 v1, 0x1

    .line 13
    iput-boolean v1, v15, Lcom/supercell/titan/GameApp;->X:Z

    .line 14
    .line 15
    iget-object v2, v15, Lcom/supercell/titan/GameApp;->k0:Lcom/supercell/titan/GoogleServiceClient;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/supercell/titan/GoogleServiceClient;->onStop()V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object v2, v15, Lcom/supercell/titan/GameApp;->a:Landroid/net/wifi/WifiManager$WifiLock;

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/net/wifi/WifiManager$WifiLock;->isHeld()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    iget-object v2, v15, Lcom/supercell/titan/GameApp;->a:Landroid/net/wifi/WifiManager$WifiLock;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/net/wifi/WifiManager$WifiLock;->release()V

    .line 35
    .line 36
    .line 37
    :cond_2
    iget-object v2, v15, Lcom/supercell/titan/GameApp;->j0:Landroid/content/SharedPreferences;

    .line 38
    .line 39
    if-eqz v2, :cond_7

    .line 40
    .line 41
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    invoke-virtual {v15, v2, v3}, Lcom/supercell/titan/GameApp;->removeOutOfDateNotifications(J)V

    .line 46
    .line 47
    .line 48
    sget-object v4, Lcom/supercell/titan/GameApp;->x0:Lcom/supercell/titan/GameApp;

    .line 49
    .line 50
    iget-object v4, v4, Lcom/supercell/titan/GameApp;->Z:Landroid/app/AlarmManager;

    .line 51
    .line 52
    new-instance v5, Lorg/json/JSONArray;

    .line 53
    .line 54
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 55
    .line 56
    .line 57
    sget-object v6, Lcom/supercell/titan/GameApp;->z0:Ljava/util/Vector;

    .line 58
    .line 59
    monitor-enter v6

    .line 60
    :try_start_0
    invoke-virtual {v6}, Ljava/util/Vector;->size()I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    const/16 v8, 0x1ea

    .line 65
    .line 66
    if-le v7, v8, :cond_3

    .line 67
    .line 68
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/util/Vector;->size()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    new-instance v8, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Lcom/supercell/titan/SentryTitan;->b(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :catchall_0
    move-exception v15

    .line 91
    goto/16 :goto_4

    .line 92
    .line 93
    :cond_3
    :goto_0
    const/4 v0, 0x0

    .line 94
    move v7, v0

    .line 95
    move v8, v7

    .line 96
    :goto_1
    sget-object v9, Lcom/supercell/titan/GameApp;->z0:Ljava/util/Vector;

    .line 97
    .line 98
    invoke-virtual {v9}, Ljava/util/Vector;->size()I

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-ge v7, v10, :cond_5

    .line 103
    .line 104
    sget-object v10, Lcom/supercell/titan/GameApp;->A0:Ljava/util/Vector;

    .line 105
    .line 106
    invoke-virtual {v10, v7}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    check-cast v10, Ljava/lang/Long;

    .line 111
    .line 112
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 113
    .line 114
    .line 115
    move-result-wide v10

    .line 116
    cmp-long v12, v2, v10

    .line 117
    .line 118
    if-gez v12, :cond_4

    .line 119
    .line 120
    invoke-virtual {v9, v7}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    check-cast v9, Lcom/supercell/titan/d;

    .line 125
    .line 126
    iget-object v12, v9, Lcom/supercell/titan/d;->d:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    .line 128
    :try_start_1
    iget-object v12, v9, Lcom/supercell/titan/d;->a:Landroid/app/PendingIntent;

    .line 129
    .line 130
    invoke-virtual {v4, v0, v10, v11, v12}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :catch_0
    move-exception v10

    .line 135
    :try_start_2
    sget-object v11, Lp92;->c:Lp92;

    .line 136
    .line 137
    new-instance v12, Lcom/supercell/titan/SentryTitan$EventFileAttachment;

    .line 138
    .line 139
    new-instance v13, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v15}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 145
    .line 146
    .line 147
    move-result-object v14

    .line 148
    invoke-virtual {v14}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v14

    .line 152
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const p0, 0x171

    const-string v14, "/shared_prefs/localPrefs-plain.xml"

    .line 156
    .line 157
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v13

    .line 164
    invoke-direct {v12, v13}, Lcom/supercell/titan/SentryTitan$EventFileAttachment;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    new-array v13, v1, [Lcom/supercell/titan/SentryTitan$EventAttachment;

    .line 168
    .line 169
    aput-object v12, v13, v0

    .line 170
    .line 171
    const/4 v12, 0x0

    .line 172
    invoke-static {v12, v11, v10, v13, v12}, Lcom/supercell/titan/SentryTitan;->addEvent(Ljava/lang/String;Lp92;Ljava/lang/Exception;[Lcom/supercell/titan/SentryTitan$EventAttachment;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    :goto_2
    new-instance v10, Lorg/json/JSONObject;

    .line 176
    .line 177
    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 178
    .line 179
    .line 180
    :try_start_3
    const p0, 0x172

    const-string v11, "title"

    .line 181
    .line 182
    iget-object v12, v9, Lcom/supercell/titan/d;->e:Ljava/lang/String;

    .line 183
    .line 184
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 185
    .line 186
    .line 187
    const p0, 0x173

    const-string v11, "sound"

    .line 188
    .line 189
    iget-object v12, v9, Lcom/supercell/titan/d;->f:Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 192
    .line 193
    .line 194
    const p0, 0x174

    const-string v11, "msg"

    .line 195
    .line 196
    iget-object v12, v9, Lcom/supercell/titan/d;->d:Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 199
    .line 200
    .line 201
    const p0, 0x175

    const-string v11, "userId"

    .line 202
    .line 203
    iget-object v12, v9, Lcom/supercell/titan/d;->b:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 206
    .line 207
    .line 208
    const p0, 0x176

    const-string v11, "id"

    .line 209
    .line 210
    iget v12, v9, Lcom/supercell/titan/d;->c:I

    .line 211
    .line 212
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 213
    .line 214
    .line 215
    const p0, 0x177

    const-string v11, "imageURL"

    .line 216
    .line 217
    const p0, 0x178

    const-string v12, ""

    .line 218
    .line 219
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 220
    .line 221
    .line 222
    const p0, 0x179

    const-string v11, "source"

    .line 223
    .line 224
    iget-object v9, v9, Lcom/supercell/titan/d;->h:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 225
    .line 226
    iget v9, v9, Lcom/supercell/titan/GameApp$NotificationSource;->a:I

    .line 227
    .line 228
    invoke-virtual {v10, v11, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v5, v10}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 232
    .line 233
    .line 234
    move v8, v1

    .line 235
    goto :goto_3

    .line 236
    :catch_1
    move-exception v9

    .line 237
    :try_start_4
    invoke-static {v9}, Lcom/supercell/titan/SentryTitan;->a(Ljava/lang/Exception;)V

    .line 238
    .line 239
    .line 240
    const p0, 0x17a

    const-string v10, "GameApp"

    .line 241
    .line 242
    const p0, 0x17b

    const-string v11, "onStop()"

    .line 243
    .line 244
    invoke-static {v10, v11, v9}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 245
    .line 246
    .line 247
    invoke-static {v9}, Lcom/supercell/titan/GameApp;->debuggerException(Ljava/lang/Exception;)V

    .line 248
    .line 249
    .line 250
    :cond_4
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 251
    .line 252
    goto/16 :goto_1

    .line 253
    .line 254
    :cond_5
    monitor-exit v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 255
    if-eqz v8, :cond_6

    .line 256
    .line 257
    invoke-virtual {v5}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    iget-object v1, v15, Lcom/supercell/titan/GameApp;->j0:Landroid/content/SharedPreferences;

    .line 262
    .line 263
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    const p0, 0x17c

    const-string v2, "localNotifications"

    .line 268
    .line 269
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 274
    .line 275
    .line 276
    goto :goto_5

    .line 277
    :cond_6
    iget-object v0, v15, Lcom/supercell/titan/GameApp;->j0:Landroid/content/SharedPreferences;

    .line 278
    .line 279
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    const p0, 0x17d

    const-string v1, "localNotifications"

    .line 284
    .line 285
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 290
    .line 291
    .line 292
    goto :goto_5

    .line 293
    :goto_4
    :try_start_5
    monitor-exit v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 294
    throw v15

    .line 295
    :cond_7
    :goto_5
    invoke-super {v15}, Landroid/app/Activity;->onStop()V

    .line 296
    .line 297
    .line 298
    return-void
.end method

.method public onTrimMemory(I)V
    .locals 0

    .line 1
    invoke-static {}, Lcom/supercell/titan/GameApp;->isNativeLibraryLoaded()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lcom/supercell/titan/GameApp;->nOnTrimMemory(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/supercell/titan/GameApp;->handleFocusGained()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/supercell/titan/GameApp;->setSystemUiVisibility()V

    .line 10
    .line 11
    .line 12
    :cond_0
    xor-int/lit8 v0, p1, 0x1

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/supercell/titan/GameApp;->l0:Z

    .line 15
    .line 16
    invoke-static {}, Lcom/supercell/titan/GameApp;->isNativeLibraryLoaded()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    invoke-static {p1}, Lcom/supercell/titan/GameApp;->nOnWindowFocusChanged(Z)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public removeActivityEventListener(Lcom/supercell/titan/GameApp$ActivityEventListener;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/GameApp;->V:Ljava/util/Vector;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const p0, 0x17e

    const-string p0, "GameApp"

    .line 6
    .line 7
    const p1, 0x17f

    const-string p1, "Cannot remove activity event listener from empty list."

    .line 8
    .line 9
    invoke-static {p0, p1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/util/Vector;->remove(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public removeActivityResultListener(Lcom/supercell/titan/GameApp$OnActivityResultListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/supercell/titan/GameApp;->p0:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Lcom/supercell/titan/GameApp;->p0:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p0
.end method

.method public removeOutOfDateNotifications()V
    .locals 2

    .line 43
    sget-object v0, Lcom/supercell/titan/GameApp;->z0:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/supercell/titan/GameApp;->removeOutOfDateNotifications(J)V

    :cond_0
    return-void
.end method

.method public removeOutOfDateNotifications(J)V
    .locals 4

    .line 1
    sget-object p0, Lcom/supercell/titan/GameApp;->z0:Ljava/util/Vector;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Ljava/util/Vector;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    :cond_0
    :goto_0
    add-int/lit8 v0, v0, -0x1

    .line 9
    .line 10
    if-ltz v0, :cond_1

    .line 11
    .line 12
    sget-object v1, Lcom/supercell/titan/GameApp;->A0:Ljava/util/Vector;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Ljava/lang/Long;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    cmp-long v2, p1, v2

    .line 25
    .line 26
    if-ltz v2, :cond_0

    .line 27
    .line 28
    sget-object v2, Lcom/supercell/titan/GameApp;->z0:Ljava/util/Vector;

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw p1
.end method

.method public requestBackup()V
    .locals 3

    .line 1
    :try_start_0
    new-instance v1, Landroid/app/backup/BackupManager;

    .line 2
    .line 3
    invoke-direct {v1, p0}, Landroid/app/backup/BackupManager;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/app/backup/BackupManager;->dataChanged()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catch_0
    move-exception p0

    .line 11
    const v0, 0x180

    const-string v1, "GameApp"

    .line 12
    .line 13
    const v0, 0x181

    const-string v2, "GameApp.requestBackup"

    .line 14
    .line 15
    invoke-static {v1, v2, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public requestFinish()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/supercell/titan/GameApp;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/supercell/titan/GameApp;->c:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public runInUiThreadFromCpp(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/supercell/titan/GameApp;->b:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Lyp0;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2}, Lyp0;-><init>(Lcom/supercell/titan/GameApp;J)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public runOnView(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object p0, p0, Lcom/supercell/titan/GameApp;->W:Lcom/supercell/titan/GL2JNISurfaceView;

    .line 5
    .line 6
    if-nez p0, :cond_2

    .line 7
    .line 8
    invoke-static {}, Lcom/supercell/titan/GameApp;->isNativeLibraryLoaded()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance p0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const v0, 0x182

    const-string v0, "runOnView when view = null, "

    .line 17
    .line 18
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Lcom/supercell/titan/GameApp;->logDebuggerException(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void

    .line 36
    :cond_2
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public setFixedSize(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/supercell/titan/GameApp;->W:Lcom/supercell/titan/GL2JNISurfaceView;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/supercell/titan/GL2JNISurfaceView;->setFixedSize(II)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/supercell/titan/GameApp;->setScaledSafeMargins()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setScaledSafeMargins()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/supercell/titan/GameApp;->getView()Lcom/supercell/titan/GL2JNISurfaceView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/supercell/titan/GL2JNISurfaceView;->getScaleX()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Lcom/supercell/titan/GameApp;->getView()Lcom/supercell/titan/GL2JNISurfaceView;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lcom/supercell/titan/GL2JNISurfaceView;->getScaleY()F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget v2, p0, Lcom/supercell/titan/GameApp;->U:I

    .line 18
    .line 19
    int-to-float v2, v2

    .line 20
    mul-float/2addr v2, v1

    .line 21
    float-to-int v2, v2

    .line 22
    iget v3, p0, Lcom/supercell/titan/GameApp;->w:I

    .line 23
    .line 24
    int-to-float v3, v3

    .line 25
    mul-float/2addr v3, v1

    .line 26
    float-to-int v1, v3

    .line 27
    iget v3, p0, Lcom/supercell/titan/GameApp;->i:I

    .line 28
    .line 29
    int-to-float v3, v3

    .line 30
    mul-float/2addr v3, v0

    .line 31
    float-to-int v3, v3

    .line 32
    iget p0, p0, Lcom/supercell/titan/GameApp;->v:I

    .line 33
    .line 34
    int-to-float p0, p0

    .line 35
    mul-float/2addr p0, v0

    .line 36
    float-to-int p0, p0

    .line 37
    invoke-static {v2, v1, v3, p0}, Lcom/supercell/titan/GameApp;->setSafeMargins(IIII)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public setSystemUiVisibility()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/supercell/titan/GameApp;->W:Lcom/supercell/titan/GL2JNISurfaceView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v1, p0, Lcom/supercell/titan/GameApp;->n0:I

    .line 7
    .line 8
    const/4 v2, -0x1

    .line 9
    if-ne v1, v2, :cond_1

    .line 10
    .line 11
    const/16 v1, 0x1706

    .line 12
    .line 13
    iput v1, p0, Lcom/supercell/titan/GameApp;->n0:I

    .line 14
    .line 15
    :cond_1
    iget p0, p0, Lcom/supercell/titan/GameApp;->n0:I

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public setSystemUiVisibilityDelayed(J)V
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ltc;

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-direct {v1, p0, v2}, Ltc;-><init>(Lcom/supercell/titan/GameApp;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public showStorePage(Ljava/lang/String;Ljava/lang/String;Lcom/supercell/titan/GameApp$ShowStorePageListener;)V
    .locals 8

    .line 1
    iget-object v1, p0, Lcom/supercell/titan/GameApp;->w0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    if-eqz v4, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    new-instance v5, Landroid/content/Intent;

    .line 16
    .line 17
    const v0, 0x183

    const-string v6, "android.intent.action.VIEW"

    .line 18
    .line 19
    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const v0, 0x184

    const-string v6, "com.android.vending"

    .line 23
    .line 24
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    new-instance v6, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const v0, 0x185

    const-string v7, "https://play.google.com/d?id="

    .line 30
    .line 31
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const v0, 0x186

    const-string v7, "&referrer="

    .line 38
    .line 39
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5, v4}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    if-eqz v4, :cond_0

    .line 61
    .line 62
    const v0, 0x187

    const-string p1, "overlay"

    .line 63
    .line 64
    invoke-virtual {v5, p1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 65
    .line 66
    .line 67
    const v0, 0x188

    const-string p1, "callerId"

    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {v5, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const v0, 0x189

    const-string v4, "https://play.google.com/store/apps/details?id="

    .line 80
    .line 81
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {v5, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 102
    .line 103
    .line 104
    :goto_0
    new-instance p1, Lcom/supercell/titan/b;

    .line 105
    .line 106
    invoke-direct {p1, p0, p3}, Lcom/supercell/titan/b;-><init>(Lcom/supercell/titan/GameApp;Lcom/supercell/titan/GameApp$ShowStorePageListener;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, p1}, Lcom/supercell/titan/GameApp;->addActivityResultListener(Lcom/supercell/titan/GameApp$OnActivityResultListener;)V

    .line 110
    .line 111
    .line 112
    const p1, 0xf1b31

    .line 113
    .line 114
    .line 115
    :try_start_0
    invoke-virtual {p0, v5, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :catch_0
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 120
    .line 121
    .line 122
    invoke-interface {p3, v2}, Lcom/supercell/titan/GameApp$ShowStorePageListener;->onCompletion(Z)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_1
    invoke-interface {p3, v2}, Lcom/supercell/titan/GameApp$ShowStorePageListener;->onCompletion(Z)V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public declared-synchronized storeKeyValue(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/supercell/titan/GameApp;->g0:Lcom/supercell/titan/SecurePreferences;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/supercell/titan/GameApp;->h0:Lcom/supercell/titan/SecurePreferences;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2, v0}, Lcom/supercell/titan/GameApp;->c(Ljava/lang/String;Ljava/lang/String;Lcom/supercell/titan/SecurePreferences;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, Lcom/supercell/titan/GameApp;->g0:Lcom/supercell/titan/SecurePreferences;

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2, v1}, Lcom/supercell/titan/GameApp;->c(Ljava/lang/String;Ljava/lang/String;Lcom/supercell/titan/SecurePreferences;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    or-int/2addr p1, v0

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/supercell/titan/GameApp;->requestBackup()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    :goto_0
    monitor-exit p0

    .line 30
    return-void

    .line 31
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    throw p1
.end method

.method public tencentLoginDone()V
    .locals 0

    .line 1
    return-void
.end method

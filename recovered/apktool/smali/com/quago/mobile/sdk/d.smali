.class public abstract Lcom/quago/mobile/sdk/d;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static a:Lcom/quago/mobile/sdk/j0;

.field public static b:Lcom/quago/mobile/sdk/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/k0;->a:Ljava/util/Locale;

    .line 2
    .line 3
    new-instance v0, Lcom/quago/mobile/sdk/j0;

    .line 4
    .line 5
    const-string v1, "BiometricBattery"

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/quago/mobile/sdk/j0;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/quago/mobile/sdk/d;->a:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)V
    .locals 3

    const-class v0, Lcom/quago/mobile/sdk/d;

    monitor-enter v0

    .line 49
    :try_start_0
    sget-object v1, Lcom/quago/mobile/sdk/d;->b:Lcom/quago/mobile/sdk/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    .line 50
    :cond_0
    :try_start_1
    invoke-virtual {p0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :catch_0
    move-exception p0

    .line 51
    :try_start_2
    sget-object v1, Lcom/quago/mobile/sdk/d;->a:Lcom/quago/mobile/sdk/j0;

    if-eqz v1, :cond_1

    const-string v2, "disable"

    invoke-virtual {v1, v2, p0}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 52
    sput-object p0, Lcom/quago/mobile/sdk/d;->a:Lcom/quago/mobile/sdk/j0;

    .line 53
    sput-object p0, Lcom/quago/mobile/sdk/d;->b:Lcom/quago/mobile/sdk/c;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method

.method public static declared-synchronized a(Landroid/content/Context;Lcom/quago/mobile/sdk/o0;)V
    .locals 3

    .line 1
    const-class v0, Lcom/quago/mobile/sdk/d;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/quago/mobile/sdk/d;->b:Lcom/quago/mobile/sdk/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    sget-object v1, Lcom/quago/mobile/sdk/d;->a:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    const-string v1, "BiometricBattery"

    .line 15
    .line 16
    sget-object v2, Lcom/quago/mobile/sdk/k0;->a:Ljava/util/Locale;

    .line 17
    .line 18
    new-instance v2, Lcom/quago/mobile/sdk/j0;

    .line 19
    .line 20
    invoke-direct {v2, v1}, Lcom/quago/mobile/sdk/j0;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v2, Lcom/quago/mobile/sdk/d;->a:Lcom/quago/mobile/sdk/j0;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    new-instance v1, Lcom/quago/mobile/sdk/c;

    .line 29
    .line 30
    invoke-direct {v1, p1}, Lcom/quago/mobile/sdk/c;-><init>(Lcom/quago/mobile/sdk/o0;)V

    .line 31
    .line 32
    .line 33
    sput-object v1, Lcom/quago/mobile/sdk/d;->b:Lcom/quago/mobile/sdk/c;

    .line 34
    .line 35
    new-instance p1, Landroid/content/IntentFilter;

    .line 36
    .line 37
    const-string v2, "android.intent.action.BATTERY_CHANGED"

    .line 38
    .line 39
    invoke-direct {p1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v1, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    .line 45
    monitor-exit v0

    .line 46
    return-void

    .line 47
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 48
    throw p0
.end method

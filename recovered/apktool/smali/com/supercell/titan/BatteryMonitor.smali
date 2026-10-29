.class public Lcom/supercell/titan/BatteryMonitor;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/supercell/titan/BatteryMonitor$Snapshot;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:J

.field public c:Lcom/supercell/titan/a;

.field public d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/supercell/titan/BatteryMonitor;->d:Z

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lcom/supercell/titan/BatteryMonitor;->a:Landroid/content/Context;

    .line 12
    .line 13
    iput-wide p2, p0, Lcom/supercell/titan/BatteryMonitor;->b:J

    .line 14
    .line 15
    return-void
.end method

.method public static a(Landroid/content/Intent;)Lcom/supercell/titan/BatteryMonitor$Snapshot;
    .locals 4

    .line 1
    const v0, 0x1be

    const-string v0, "level"

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const v2, 0x1bf

    const-string v2, "scale"

    .line 9
    .line 10
    invoke-virtual {p0, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const v3, 0x1c0

    const-string v3, "status"

    .line 15
    .line 16
    invoke-virtual {p0, v3, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-ltz v0, :cond_0

    .line 21
    .line 22
    if-lez v2, :cond_0

    .line 23
    .line 24
    int-to-float v0, v0

    .line 25
    const/high16 v1, 0x42c80000    # 100.0f

    .line 26
    .line 27
    mul-float/2addr v0, v1

    .line 28
    int-to-float v1, v2

    .line 29
    div-float/2addr v0, v1

    .line 30
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    :cond_0
    const/4 v0, 0x2

    .line 35
    if-eq p0, v0, :cond_2

    .line 36
    .line 37
    const/4 v0, 0x5

    .line 38
    if-ne p0, v0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 p0, 0x0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 44
    :goto_1
    new-instance v0, Lcom/supercell/titan/BatteryMonitor$Snapshot;

    .line 45
    .line 46
    invoke-direct {v0, v1, p0}, Lcom/supercell/titan/BatteryMonitor$Snapshot;-><init>(IZ)V

    .line 47
    .line 48
    .line 49
    return-object v0
.end method

.method private static native updateBatteryInfo(JIZ)V
.end method


# virtual methods
.method public final b(Lcom/supercell/titan/BatteryMonitor$Snapshot;)V
    .locals 3

    .line 1
    iget v0, p1, Lcom/supercell/titan/BatteryMonitor$Snapshot;->level:I

    .line 2
    .line 3
    iget-boolean p1, p1, Lcom/supercell/titan/BatteryMonitor$Snapshot;->charging:Z

    .line 4
    .line 5
    iget-wide v1, p0, Lcom/supercell/titan/BatteryMonitor;->b:J

    .line 6
    .line 7
    invoke-static {v1, v2, v0, p1}, Lcom/supercell/titan/BatteryMonitor;->updateBatteryInfo(JIZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public getOnce()Lcom/supercell/titan/BatteryMonitor$Snapshot;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    .line 2
    .line 3
    const v1, 0x1c1

    const-string v1, "android.intent.action.BATTERY_CHANGED"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcom/supercell/titan/BatteryMonitor;->a:Landroid/content/Context;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-static {p0}, Lcom/supercell/titan/BatteryMonitor;->a(Landroid/content/Intent;)Lcom/supercell/titan/BatteryMonitor$Snapshot;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    new-instance p0, Lcom/supercell/titan/BatteryMonitor$Snapshot;

    .line 23
    .line 24
    const/4 v0, -0x1

    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {p0, v0, v1}, Lcom/supercell/titan/BatteryMonitor$Snapshot;-><init>(IZ)V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public start()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/supercell/titan/BatteryMonitor;->d:Z

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
    iput-boolean v0, p0, Lcom/supercell/titan/BatteryMonitor;->d:Z

    .line 8
    .line 9
    new-instance v0, Landroid/content/IntentFilter;

    .line 10
    .line 11
    const v1, 0x1c2

    const-string v1, "android.intent.action.BATTERY_CHANGED"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iget-object v2, p0, Lcom/supercell/titan/BatteryMonitor;->a:Landroid/content/Context;

    .line 18
    .line 19
    invoke-virtual {v2, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-static {v1}, Lcom/supercell/titan/BatteryMonitor;->a(Landroid/content/Intent;)Lcom/supercell/titan/BatteryMonitor$Snapshot;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {p0, v1}, Lcom/supercell/titan/BatteryMonitor;->b(Lcom/supercell/titan/BatteryMonitor$Snapshot;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    new-instance v1, Lcom/supercell/titan/a;

    .line 33
    .line 34
    invoke-direct {v1, p0}, Lcom/supercell/titan/a;-><init>(Lcom/supercell/titan/BatteryMonitor;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lcom/supercell/titan/BatteryMonitor;->c:Lcom/supercell/titan/a;

    .line 38
    .line 39
    invoke-virtual {v2, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public stop()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/supercell/titan/BatteryMonitor;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/supercell/titan/BatteryMonitor;->d:Z

    .line 8
    .line 9
    new-instance v0, Landroid/content/IntentFilter;

    .line 10
    .line 11
    const v1, 0x1c3

    const-string v1, "android.intent.action.BATTERY_CHANGED"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/supercell/titan/BatteryMonitor;->a:Landroid/content/Context;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-static {v0}, Lcom/supercell/titan/BatteryMonitor;->a(Landroid/content/Intent;)Lcom/supercell/titan/BatteryMonitor$Snapshot;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0, v0}, Lcom/supercell/titan/BatteryMonitor;->b(Lcom/supercell/titan/BatteryMonitor$Snapshot;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, Lcom/supercell/titan/BatteryMonitor;->c:Lcom/supercell/titan/a;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 37
    .line 38
    .line 39
    iput-object v2, p0, Lcom/supercell/titan/BatteryMonitor;->c:Lcom/supercell/titan/a;

    .line 40
    .line 41
    :cond_2
    :goto_0
    return-void
.end method

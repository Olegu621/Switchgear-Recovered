.class public final Lcom/supercell/titan/a;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:Lcom/supercell/titan/BatteryMonitor;


# direct methods
.method public constructor <init>(Lcom/supercell/titan/BatteryMonitor;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/supercell/titan/a;->a:Lcom/supercell/titan/BatteryMonitor;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/a;->a:Lcom/supercell/titan/BatteryMonitor;

    .line 2
    .line 3
    invoke-static {p2}, Lcom/supercell/titan/BatteryMonitor;->a(Landroid/content/Intent;)Lcom/supercell/titan/BatteryMonitor$Snapshot;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lcom/supercell/titan/BatteryMonitor;->b(Lcom/supercell/titan/BatteryMonitor$Snapshot;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

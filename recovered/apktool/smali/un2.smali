.class public final synthetic Lun2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/supercell/titan/ThermalMonitor;


# direct methods
.method public synthetic constructor <init>(Lcom/supercell/titan/ThermalMonitor;I)V
    .locals 0

    .line 1
    iput p2, p0, Lun2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lun2;->b:Lcom/supercell/titan/ThermalMonitor;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lun2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lun2;->b:Lcom/supercell/titan/ThermalMonitor;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lcom/supercell/titan/ThermalMonitor;->b:F

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/supercell/titan/ThermalMonitor;->updatePrediction(F)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iput-wide v0, p0, Lcom/supercell/titan/ThermalMonitor;->a:J

    .line 19
    .line 20
    iget-object v0, p0, Lcom/supercell/titan/ThermalMonitor;->j:Landroid/os/PowerManager;

    .line 21
    .line 22
    iget v1, p0, Lcom/supercell/titan/ThermalMonitor;->c:I

    .line 23
    .line 24
    invoke-static {v0, v1}, Lw0;->a(Landroid/os/PowerManager;I)F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iput v0, p0, Lcom/supercell/titan/ThermalMonitor;->b:F

    .line 29
    .line 30
    new-instance v0, Landroid/os/Handler;

    .line 31
    .line 32
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lun2;

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    invoke-direct {v1, p0, v2}, Lun2;-><init>(Lcom/supercell/titan/ThermalMonitor;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

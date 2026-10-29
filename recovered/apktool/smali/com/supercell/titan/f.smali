.class public final Lcom/supercell/titan/f;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/supercell/titan/LocationService;

.field public final synthetic b:Lcom/supercell/titan/LocationService;


# direct methods
.method public constructor <init>(Lcom/supercell/titan/LocationService;Lcom/supercell/titan/LocationService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/supercell/titan/f;->b:Lcom/supercell/titan/LocationService;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/supercell/titan/f;->a:Lcom/supercell/titan/LocationService;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v1, p0, Lcom/supercell/titan/f;->a:Lcom/supercell/titan/LocationService;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/supercell/titan/f;->b:Lcom/supercell/titan/LocationService;

    .line 4
    .line 5
    :try_start_0
    iget-object v2, p0, Lcom/supercell/titan/LocationService;->b:Landroid/location/LocationManager;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lcom/supercell/titan/LocationService;->c:Lcom/supercell/titan/GameApp;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lcom/supercell/titan/GameApp;->removeActivityEventListener(Lcom/supercell/titan/GameApp$ActivityEventListener;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catch_0
    move-exception p0

    .line 17
    const v0, 0x1a1

    const-string v1, "LocationService"

    .line 18
    .line 19
    const v0, 0x1a2

    const-string v2, "Security Exception while stopping tracking location"

    .line 20
    .line 21
    invoke-static {v1, v2, p0}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

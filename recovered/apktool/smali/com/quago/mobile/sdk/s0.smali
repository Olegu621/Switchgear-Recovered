.class public final Lcom/quago/mobile/sdk/s0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lcom/quago/mobile/sdk/j0;

.field public final b:Lcom/quago/mobile/sdk/x0;

.field public final c:Lcom/quago/mobile/sdk/r0;


# direct methods
.method public constructor <init>(Lcom/quago/mobile/sdk/x0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "QuagoNetworkModule"

    .line 5
    .line 6
    invoke-static {v0}, Lcom/quago/mobile/sdk/k0;->a(Ljava/lang/String;)Lcom/quago/mobile/sdk/j0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/quago/mobile/sdk/s0;->b:Lcom/quago/mobile/sdk/x0;

    .line 13
    .line 14
    new-instance v0, Landroid/os/HandlerThread;

    .line 15
    .line 16
    const-string v1, "NetworkManagerThread"

    .line 17
    .line 18
    const/4 v2, 0x5

    .line 19
    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lcom/quago/mobile/sdk/q0;

    .line 23
    .line 24
    invoke-direct {v1, p0}, Lcom/quago/mobile/sdk/q0;-><init>(Lcom/quago/mobile/sdk/s0;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lcom/quago/mobile/sdk/r0;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-direct {v1, p0, v0, p1}, Lcom/quago/mobile/sdk/r0;-><init>(Lcom/quago/mobile/sdk/s0;Landroid/os/Looper;Lcom/quago/mobile/sdk/x0;)V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lcom/quago/mobile/sdk/s0;->c:Lcom/quago/mobile/sdk/r0;

    .line 43
    .line 44
    return-void
.end method

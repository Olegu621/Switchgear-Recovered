.class public final Lcom/quago/mobile/sdk/c;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:Lcom/quago/mobile/sdk/o0;


# direct methods
.method public constructor <init>(Lcom/quago/mobile/sdk/o0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/quago/mobile/sdk/c;->a:Lcom/quago/mobile/sdk/o0;

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
    .locals 3

    .line 1
    const-string p1, "enable"

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    :try_start_0
    const-string v0, "level"

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-string v2, "scale"

    .line 14
    .line 15
    invoke-virtual {p2, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iget-object p0, p0, Lcom/quago/mobile/sdk/c;->a:Lcom/quago/mobile/sdk/o0;

    .line 20
    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    sget-object p0, Lcom/quago/mobile/sdk/d;->a:Lcom/quago/mobile/sdk/j0;

    .line 24
    .line 25
    if-eqz p0, :cond_3

    .line 26
    .line 27
    const-string p2, "quagoManager is null"

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    new-array v0, v0, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual {p0, p1, p2, v0}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catch_0
    move-exception p0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    int-to-float v0, v0

    .line 39
    int-to-float p2, p2

    .line 40
    div-float/2addr v0, p2

    .line 41
    iget-boolean p2, p0, Lcom/quago/mobile/sdk/o0;->a:Z

    .line 42
    .line 43
    if-nez p2, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    iget-object p0, p0, Lcom/quago/mobile/sdk/o0;->r:Lcom/quago/mobile/sdk/i;

    .line 47
    .line 48
    iget-object p2, p0, Lcom/quago/mobile/sdk/i;->m:Lcom/quago/mobile/sdk/k;

    .line 49
    .line 50
    invoke-virtual {p0, p2, v0}, Lcom/quago/mobile/sdk/i;->a(Lcom/quago/mobile/sdk/k;F)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :goto_0
    sget-object p2, Lcom/quago/mobile/sdk/d;->a:Lcom/quago/mobile/sdk/j0;

    .line 55
    .line 56
    if-eqz p2, :cond_3

    .line 57
    .line 58
    invoke-virtual {p2, p1, p0}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    :goto_1
    return-void
.end method

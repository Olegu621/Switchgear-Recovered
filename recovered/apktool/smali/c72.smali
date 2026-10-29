.class public final Lc72;
.super Ll30;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:Lcom/supercell/titan/ScExternalWebView;


# direct methods
.method public constructor <init>(Lcom/supercell/titan/ScExternalWebView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc72;->a:Lcom/supercell/titan/ScExternalWebView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onCustomTabsServiceConnected(Landroid/content/ComponentName;Le30;)V
    .locals 3

    .line 1
    move-object p1, p2

    .line 2
    check-cast p1, Lk30;

    .line 3
    .line 4
    iget-object p0, p0, Lc72;->a:Lcom/supercell/titan/ScExternalWebView;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/supercell/titan/ScExternalWebView;->c:Lk30;

    .line 7
    .line 8
    :try_start_0
    iget-object p1, p2, Le30;->a:Landroid/support/customtabs/ICustomTabsService;

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    invoke-interface {p1, v0, v1}, Landroid/support/customtabs/ICustomTabsService;->warmup(J)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    :catch_0
    iget-object p1, p0, Lcom/supercell/titan/ScExternalWebView;->c:Lk30;

    .line 16
    .line 17
    iget-object p2, p0, Lcom/supercell/titan/ScExternalWebView;->i:Le72;

    .line 18
    .line 19
    iget-object v0, p1, Le30;->a:Landroid/support/customtabs/ICustomTabsService;

    .line 20
    .line 21
    new-instance v1, Ld30;

    .line 22
    .line 23
    invoke-direct {v1, p2}, Ld30;-><init>(Lw20;)V

    .line 24
    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    :try_start_1
    invoke-interface {v0, v1}, Landroid/support/customtabs/ICustomTabsService;->newSession(Landroid/support/customtabs/ICustomTabsCallback;)Z

    .line 28
    .line 29
    .line 30
    move-result v2
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p2, Lo30;

    .line 35
    .line 36
    iget-object p1, p1, Le30;->b:Landroid/content/ComponentName;

    .line 37
    .line 38
    invoke-direct {p2, v0, v1, p1}, Lo30;-><init>(Landroid/support/customtabs/ICustomTabsService;Ld30;Landroid/content/ComponentName;)V

    .line 39
    .line 40
    .line 41
    :catch_1
    :goto_0
    if-eqz p2, :cond_1

    .line 42
    .line 43
    new-instance p1, Li30;

    .line 44
    .line 45
    invoke-direct {p1, p2}, Li30;-><init>(Lo30;)V

    .line 46
    .line 47
    .line 48
    iget-object p2, p1, Li30;->a:Landroid/content/Intent;

    .line 49
    .line 50
    const-string v0, "android.support.customtabs.extra.TITLE_VISIBILITY"

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Li30;->a()Lj30;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Lcom/supercell/titan/ScExternalWebView;->b:Lj30;

    .line 61
    .line 62
    :cond_1
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lc72;->a:Lcom/supercell/titan/ScExternalWebView;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/supercell/titan/ScExternalWebView;->c:Lk30;

    .line 5
    .line 6
    return-void
.end method

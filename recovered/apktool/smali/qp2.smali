.class public final synthetic Lqp2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic a:Lcom/supercell/titan/TitanWebView$TitanWebViewClient;

.field public final synthetic b:Landroid/webkit/WebView;


# direct methods
.method public synthetic constructor <init>(Lcom/supercell/titan/TitanWebView$TitanWebViewClient;Landroid/webkit/WebView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqp2;->a:Lcom/supercell/titan/TitanWebView$TitanWebViewClient;

    .line 5
    .line 6
    iput-object p2, p0, Lqp2;->b:Landroid/webkit/WebView;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    sget v0, Lcom/supercell/titan/TitanWebView$TitanWebViewClient;->c:I

    .line 4
    .line 5
    const-string v0, "true"

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const-string p1, "TitanWebView"

    .line 14
    .line 15
    const-string v0, "Bridge not available after navigation, re-injecting"

    .line 16
    .line 17
    invoke-static {p1, v0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lqp2;->a:Lcom/supercell/titan/TitanWebView$TitanWebViewClient;

    .line 21
    .line 22
    iget-object p0, p0, Lqp2;->b:Landroid/webkit/WebView;

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lcom/supercell/titan/TitanWebView$TitanWebViewClient;->a(Landroid/webkit/WebView;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.class public Lcom/supercell/titan/TitanWebView$TitanWebChromeClient;
.super Landroid/webkit/WebChromeClient;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/supercell/titan/TitanWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TitanWebChromeClient"
.end annotation


# instance fields
.field public final synthetic a:Lcom/supercell/titan/TitanWebView;


# direct methods
.method public constructor <init>(Lcom/supercell/titan/TitanWebView;Lcom/supercell/titan/TitanWebView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/supercell/titan/TitanWebView$TitanWebChromeClient;->a:Lcom/supercell/titan/TitanWebView;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onHideCustomView()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/webkit/WebChromeClient;->onHideCustomView()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/supercell/titan/TitanWebView;->E:Landroid/view/View;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object p0, p0, Lcom/supercell/titan/TitanWebView$TitanWebChromeClient;->a:Lcom/supercell/titan/TitanWebView;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/supercell/titan/TitanWebView;->q:Landroid/widget/FrameLayout;

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Lcom/supercell/titan/TitanWebView;->E:Landroid/view/View;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/supercell/titan/TitanWebView;->q:Landroid/widget/FrameLayout;

    .line 24
    .line 25
    sget-object v1, Lcom/supercell/titan/TitanWebView;->E:Landroid/view/View;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lcom/supercell/titan/TitanWebView;->r:Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 31
    .line 32
    invoke-interface {p0}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    sput-object p0, Lcom/supercell/titan/TitanWebView;->E:Landroid/view/View;

    .line 37
    .line 38
    sput-object p0, Lcom/supercell/titan/TitanWebView;->D:Lcom/supercell/titan/TitanWebView$TitanWebChromeClient;

    .line 39
    .line 40
    return-void
.end method

.method public onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/supercell/titan/TitanWebView;->E:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {p2}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sput-object p1, Lcom/supercell/titan/TitanWebView;->E:Landroid/view/View;

    .line 10
    .line 11
    sput-object p0, Lcom/supercell/titan/TitanWebView;->D:Lcom/supercell/titan/TitanWebView$TitanWebChromeClient;

    .line 12
    .line 13
    iget-object p0, p0, Lcom/supercell/titan/TitanWebView$TitanWebChromeClient;->a:Lcom/supercell/titan/TitanWebView;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/supercell/titan/TitanWebView;->q:Landroid/widget/FrameLayout;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/supercell/titan/TitanWebView;->q:Landroid/widget/FrameLayout;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Lcom/supercell/titan/TitanWebView;->r:Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 27
    .line 28
    return-void
.end method

.method public onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebView;",
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;",
            "Landroid/webkit/WebChromeClient$FileChooserParams;",
            ")Z"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/TitanWebView$TitanWebChromeClient;->a:Lcom/supercell/titan/TitanWebView;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/supercell/titan/TitanWebView;->m:Landroid/webkit/ValueCallback;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-interface {p1, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iput-object p2, p0, Lcom/supercell/titan/TitanWebView;->m:Landroid/webkit/ValueCallback;

    .line 12
    .line 13
    invoke-virtual {p3}, Landroid/webkit/WebChromeClient$FileChooserParams;->createIntent()Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :try_start_0
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const p3, 0xa03b

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, p1, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance p2, Lcom/supercell/titan/n;

    .line 32
    .line 33
    invoke-direct {p2, p0}, Lcom/supercell/titan/n;-><init>(Lcom/supercell/titan/TitanWebView;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p2}, Lcom/supercell/titan/GameApp;->addActivityResultListener(Lcom/supercell/titan/GameApp$OnActivityResultListener;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :catch_0
    iput-object v0, p0, Lcom/supercell/titan/TitanWebView;->m:Landroid/webkit/ValueCallback;

    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return p0
.end method

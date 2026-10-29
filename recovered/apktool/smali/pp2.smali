.class public final synthetic Lpp2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/supercell/titan/TitanWebView$TitanWebViewClient;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/supercell/titan/TitanWebView$TitanWebViewClient;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lpp2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lpp2;->b:Lcom/supercell/titan/TitanWebView$TitanWebViewClient;

    .line 4
    .line 5
    iput-object p2, p0, Lpp2;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lpp2;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lpp2;->c:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lpp2;->b:Lcom/supercell/titan/TitanWebView$TitanWebViewClient;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lcom/supercell/titan/TitanWebView$TitanWebViewClient;->a:Lcom/supercell/titan/TitanWebView;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lcom/supercell/titan/TitanWebView;->onPageStarted(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object p0, p0, Lcom/supercell/titan/TitanWebView$TitanWebViewClient;->a:Lcom/supercell/titan/TitanWebView;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lcom/supercell/titan/TitanWebView;->onPageFinished(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

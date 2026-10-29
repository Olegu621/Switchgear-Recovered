.class public final synthetic Ld72;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Le72;


# direct methods
.method public synthetic constructor <init>(Le72;I)V
    .locals 0

    .line 1
    iput p2, p0, Ld72;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ld72;->b:Le72;

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
    .locals 2

    .line 1
    iget v0, p0, Ld72;->a:I

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    iget-object p0, p0, Ld72;->b:Le72;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Le72;->c:Lcom/supercell/titan/ScExternalWebView;

    .line 11
    .line 12
    iget-object p0, p0, Le72;->a:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    move-object v1, p0

    .line 17
    :cond_0
    invoke-virtual {v0, v1}, Lcom/supercell/titan/ScExternalWebView;->onPageFailed(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    iget-object v0, p0, Le72;->c:Lcom/supercell/titan/ScExternalWebView;

    .line 22
    .line 23
    iget-object p0, p0, Le72;->a:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    move-object v1, p0

    .line 28
    :cond_1
    invoke-virtual {v0, v1}, Lcom/supercell/titan/ScExternalWebView;->onPageFinished(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

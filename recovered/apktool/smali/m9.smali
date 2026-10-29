.class public final Lm9;
.super Landroid/webkit/WebMessagePort$WebMessageCallback;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lk63;


# direct methods
.method public synthetic constructor <init>(Lk63;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm9;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lm9;->b:Lk63;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/webkit/WebMessagePort$WebMessageCallback;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onMessage(Landroid/webkit/WebMessagePort;Landroid/webkit/WebMessage;)V
    .locals 1

    .line 1
    iget v0, p0, Lm9;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lm63;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lm63;-><init>(Landroid/webkit/WebMessagePort;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Lo9;->d(Landroid/webkit/WebMessage;)Li63;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p0, p0, Lm9;->b:Lk63;

    .line 16
    .line 17
    invoke-virtual {p0, v0, p1}, Lk63;->onMessage(Ll63;Li63;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    new-instance v0, Lm63;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Lm63;-><init>(Landroid/webkit/WebMessagePort;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p2}, Lo9;->d(Landroid/webkit/WebMessage;)Li63;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object p0, p0, Lm9;->b:Lk63;

    .line 31
    .line 32
    invoke-virtual {p0, v0, p1}, Lk63;->onMessage(Ll63;Li63;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

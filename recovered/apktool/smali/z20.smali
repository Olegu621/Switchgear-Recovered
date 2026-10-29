.class public final Lz20;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/os/Bundle;

.field public final synthetic c:Ld30;


# direct methods
.method public synthetic constructor <init>(Ld30;Landroid/os/Bundle;I)V
    .locals 0

    .line 1
    iput p3, p0, Lz20;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lz20;->c:Ld30;

    .line 4
    .line 5
    iput-object p2, p0, Lz20;->b:Landroid/os/Bundle;

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
    iget v0, p0, Lz20;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lz20;->b:Landroid/os/Bundle;

    .line 4
    .line 5
    iget-object p0, p0, Lz20;->c:Ld30;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Ld30;->b:Lw20;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lw20;->onMinimized(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object p0, p0, Ld30;->b:Lw20;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lw20;->onMessageChannelReady(Landroid/os/Bundle;)V

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

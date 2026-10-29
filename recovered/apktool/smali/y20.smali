.class public final Ly20;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/os/Bundle;

.field public final synthetic d:Ld30;


# direct methods
.method public synthetic constructor <init>(Ld30;Ljava/lang/String;Landroid/os/Bundle;I)V
    .locals 0

    .line 1
    iput p4, p0, Ly20;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ly20;->d:Ld30;

    .line 4
    .line 5
    iput-object p2, p0, Ly20;->b:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Ly20;->c:Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Ly20;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Ly20;->c:Landroid/os/Bundle;

    .line 4
    .line 5
    iget-object v2, p0, Ly20;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Ly20;->d:Ld30;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Ld30;->b:Lw20;

    .line 13
    .line 14
    invoke-virtual {p0, v2, v1}, Lw20;->onPostMessage(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object p0, p0, Ld30;->b:Lw20;

    .line 19
    .line 20
    invoke-virtual {p0, v2, v1}, Lw20;->extraCallback(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

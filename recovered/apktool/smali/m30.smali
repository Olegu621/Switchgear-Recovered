.class public final synthetic Lm30;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lfe0;

.field public final synthetic c:Z

.field public final synthetic d:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lfe0;ZLandroid/os/Bundle;I)V
    .locals 0

    .line 1
    iput p4, p0, Lm30;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lm30;->b:Lfe0;

    .line 4
    .line 5
    iput-boolean p2, p0, Lm30;->c:Z

    .line 6
    .line 7
    iput-object p3, p0, Lm30;->d:Landroid/os/Bundle;

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
    iget v0, p0, Lm30;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lm30;->d:Landroid/os/Bundle;

    .line 4
    .line 5
    iget-boolean v2, p0, Lm30;->c:Z

    .line 6
    .line 7
    iget-object p0, p0, Lm30;->b:Lfe0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, v2, v1}, Lfe0;->onVerticalScrollEvent(ZLandroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-interface {p0, v2, v1}, Lfe0;->onSessionEnded(ZLandroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

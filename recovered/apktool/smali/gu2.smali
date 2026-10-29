.class public final synthetic Lgu2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Liu2;


# direct methods
.method public synthetic constructor <init>(Liu2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lgu2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lgu2;->b:Liu2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget p1, p0, Lgu2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lgu2;->b:Liu2;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Liu2;->m()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object p0, p0, Liu2;->h0:Lra2;

    .line 13
    .line 14
    iget-object p0, p0, Lra2;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lv11;

    .line 17
    .line 18
    invoke-virtual {p0}, Lv11;->invoke()Ljava/lang/Object;

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

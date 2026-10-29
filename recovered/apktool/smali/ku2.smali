.class public final synthetic Lku2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lsu2;


# direct methods
.method public synthetic constructor <init>(Lsu2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lku2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lku2;->b:Lsu2;

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
    iget p1, p0, Lku2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lku2;->b:Lsu2;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p1, Lyu1;->b:Lyu1;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lsu2;->b(Lyu1;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    sget-object p1, Lyu1;->b:Lyu1;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lsu2;->b(Lyu1;)V

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

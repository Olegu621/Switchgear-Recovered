.class public final synthetic Llt2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/usercentrics/sdk/ui/components/cards/UCCard;


# direct methods
.method public synthetic constructor <init>(Lcom/usercentrics/sdk/ui/components/cards/UCCard;I)V
    .locals 0

    .line 1
    iput p2, p0, Llt2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Llt2;->b:Lcom/usercentrics/sdk/ui/components/cards/UCCard;

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
    iget p1, p0, Llt2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Llt2;->b:Lcom/usercentrics/sdk/ui/components/cards/UCCard;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget p1, Lcom/usercentrics/sdk/ui/components/cards/UCCard;->e0:I

    .line 9
    .line 10
    iget-boolean p1, p0, Lcom/usercentrics/sdk/ui/components/cards/UCCard;->b0:Z

    .line 11
    .line 12
    xor-int/lit8 p1, p1, 0x1

    .line 13
    .line 14
    iput-boolean p1, p0, Lcom/usercentrics/sdk/ui/components/cards/UCCard;->b0:Z

    .line 15
    .line 16
    iget-object p0, p0, Lcom/usercentrics/sdk/ui/components/cards/UCCard;->c0:Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    sget p1, Lcom/usercentrics/sdk/ui/components/cards/UCCard;->e0:I

    .line 27
    .line 28
    iget-boolean p1, p0, Lcom/usercentrics/sdk/ui/components/cards/UCCard;->b0:Z

    .line 29
    .line 30
    xor-int/lit8 p1, p1, 0x1

    .line 31
    .line 32
    iput-boolean p1, p0, Lcom/usercentrics/sdk/ui/components/cards/UCCard;->b0:Z

    .line 33
    .line 34
    iget-object p0, p0, Lcom/usercentrics/sdk/ui/components/cards/UCCard;->c0:Lkotlin/jvm/functions/Function1;

    .line 35
    .line 36
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

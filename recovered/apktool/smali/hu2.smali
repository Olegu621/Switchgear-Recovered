.class public final Lhu2;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Liu2;


# direct methods
.method public synthetic constructor <init>(Liu2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lhu2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lhu2;->b:Liu2;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lhu2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lhu2;->b:Liu2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucCookieTryAgainBtn:I

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_0
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucCookieRetryMessage:I

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_1
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucCookieRetryBox:I

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Landroid/widget/LinearLayout;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_2
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucCookieLoadingText:I

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_3
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucCookieLoadingBox:I

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Landroid/widget/LinearLayout;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_4
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucCookieDialogTitle:I

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_5
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucCookieDialogList:I

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_6
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucCookieDialogClose:I

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_7
    invoke-static {p0}, Liu2;->k(Liu2;)V

    .line 81
    .line 82
    .line 83
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

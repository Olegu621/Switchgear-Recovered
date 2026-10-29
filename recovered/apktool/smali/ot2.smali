.class public final Lot2;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/usercentrics/sdk/ui/components/cards/UCCard;


# direct methods
.method public synthetic constructor <init>(Lcom/usercentrics/sdk/ui/components/cards/UCCard;I)V
    .locals 0

    .line 1
    iput p2, p0, Lot2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lot2;->b:Lcom/usercentrics/sdk/ui/components/cards/UCCard;

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
    iget v0, p0, Lot2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lot2;->b:Lcom/usercentrics/sdk/ui/components/cards/UCCard;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucCardTitle:I

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
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucCardSwitchListDivider:I

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_1
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucCardSwitchList:I

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Landroid/view/ViewGroup;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_2
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucCardSwitch:I

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCToggle;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_3
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucCardIcon:I

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCButton;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_4
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucCardHeader:I

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :pswitch_5
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucCardExpandableContent:I

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, Landroid/view/ViewGroup;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_6
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucCardDividerExpandedContent:I

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_7
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucCardDescription:I

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_8
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucCardBottomSpacing:I

    .line 84
    .line 85
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :pswitch_9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    sget v0, Lcom/usercentrics/sdk/ui/R$drawable;->uc_ic_expand:I

    .line 98
    .line 99
    invoke-static {p0, v0}, Lmn0;->p(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :pswitch_a
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    sget v0, Lcom/usercentrics/sdk/ui/R$dimen;->ucCardVerticalMargin:I

    .line 113
    .line 114
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    float-to-int p0, p0

    .line 119
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
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

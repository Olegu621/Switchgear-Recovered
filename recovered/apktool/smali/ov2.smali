.class public final Lov2;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;


# direct methods
.method public synthetic constructor <init>(Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;I)V
    .locals 0

    .line 1
    iput p2, p0, Lov2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lov2;->b:Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;

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
    .locals 3

    .line 1
    iget v0, p0, Lov2;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "inflatedStubView"

    .line 5
    .line 6
    iget-object p0, p0, Lov2;->b:Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucHeaderTitle:I

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucHeaderTabLayout:I

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lcom/google/android/material/tabs/TabLayout;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_1
    iget-object p0, p0, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;->h0:Landroid/view/View;

    .line 30
    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucHeaderLogo:I

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v1

    .line 46
    :pswitch_2
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucHeaderLinks:I

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Landroid/view/ViewGroup;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_3
    iget-object p0, p0, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;->h0:Landroid/view/View;

    .line 56
    .line 57
    if-eqz p0, :cond_1

    .line 58
    .line 59
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucHeaderLanguageLoading:I

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Landroid/widget/ProgressBar;

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v1

    .line 72
    :pswitch_4
    iget-object p0, p0, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;->h0:Landroid/view/View;

    .line 73
    .line 74
    if-eqz p0, :cond_2

    .line 75
    .line 76
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucHeaderLanguageIcon:I

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v1

    .line 89
    :pswitch_5
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucHeaderDescription:I

    .line 90
    .line 91
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_6
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucHeaderContentDivider:I

    .line 99
    .line 100
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0

    .line 105
    :pswitch_7
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucHeaderCloseButton:I

    .line 106
    .line 107
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_8
    iget-object p0, p0, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;->h0:Landroid/view/View;

    .line 115
    .line 116
    if-eqz p0, :cond_3

    .line 117
    .line 118
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucHeaderBackButton:I

    .line 119
    .line 120
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 125
    .line 126
    return-object p0

    .line 127
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v1

    .line 131
    :pswitch_9
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucHeaderStub:I

    .line 132
    .line 133
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    check-cast p0, Landroid/view/ViewStub;

    .line 138
    .line 139
    return-object p0

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
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

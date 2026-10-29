.class public final synthetic Lh51;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh51;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lh51;->b:Ljava/lang/Object;

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
    .locals 3

    .line 1
    iget v0, p0, Lh51;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lh51;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Lio/sentry/android/core/s1;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/app/Dialog;->cancel()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    check-cast p0, Lio/sentry/android/core/SentryUserFeedbackButton;

    .line 16
    .line 17
    sget v0, Lio/sentry/android/core/SentryUserFeedbackButton;->b:I

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Lio/sentry/android/core/s1;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lio/sentry/android/core/s1;-><init>(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lio/sentry/android/core/s1;->show()V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lio/sentry/android/core/SentryUserFeedbackButton;->a:Landroid/view/View$OnClickListener;

    .line 32
    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    invoke-interface {p0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void

    .line 39
    :pswitch_1
    check-cast p0, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;

    .line 40
    .line 41
    sget p1, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;->w0:I

    .line 42
    .line 43
    iget-object p0, p0, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;->s0:Lqv2;

    .line 44
    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    iget-object p0, p0, Lqv2;->c:Lyv2;

    .line 48
    .line 49
    iget-object p1, p0, Lyv2;->c:Lac1;

    .line 50
    .line 51
    new-instance v0, Lcom/usercentrics/sdk/ui/PredefinedUIResponse;

    .line 52
    .line 53
    sget-object v1, Lav1;->d:Lav1;

    .line 54
    .line 55
    iget-object v2, p1, Lac1;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, La13;

    .line 58
    .line 59
    invoke-virtual {v2}, La13;->k()Ljava/util/ArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iget-object p1, p1, Lac1;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Ljava/lang/String;

    .line 66
    .line 67
    invoke-direct {v0, v1, v2, p1}, Lcom/usercentrics/sdk/ui/PredefinedUIResponse;-><init>(Lav1;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-object p0, p0, Lyv2;->m:Lts0;

    .line 71
    .line 72
    invoke-static {v0}, Lhe3;->u(Lcom/usercentrics/sdk/ui/PredefinedUIResponse;)Lnz2;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0, p1}, Lts0;->g(Lnz2;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_1
    const-string p0, "viewModel"

    .line 81
    .line 82
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v1

    .line 86
    :pswitch_2
    check-cast p0, Lcom/usercentrics/sdk/ui/secondLayer/component/footer/UCSecondLayerFooter;

    .line 87
    .line 88
    invoke-static {p0}, Lcom/usercentrics/sdk/ui/secondLayer/component/footer/UCSecondLayerFooter;->j(Lcom/usercentrics/sdk/ui/secondLayer/component/footer/UCSecondLayerFooter;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_3
    check-cast p0, Lwe2;

    .line 93
    .line 94
    sget p1, Lcom/usercentrics/sdk/ui/components/links/UCLink;->e0:I

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object p0, p0, Lwe2;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p0, Lkotlin/jvm/functions/Function0;

    .line 102
    .line 103
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :pswitch_4
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCToggle;

    .line 108
    .line 109
    invoke-virtual {p0}, Landroidx/appcompat/widget/SwitchCompat;->toggle()V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_5
    check-cast p0, Lkotlin/jvm/functions/Function0;

    .line 114
    .line 115
    sget p1, Lcom/usercentrics/sdk/ui/components/UCButton;->i0:I

    .line 116
    .line 117
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_6
    check-cast p0, Li51;

    .line 122
    .line 123
    iget-object v0, p0, Li51;->b:Landroid/widget/PopupWindow;

    .line 124
    .line 125
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    instance-of v0, p1, Ljava/lang/String;

    .line 133
    .line 134
    if-eqz v0, :cond_2

    .line 135
    .line 136
    move-object v1, p1

    .line 137
    check-cast v1, Ljava/lang/String;

    .line 138
    .line 139
    :cond_2
    if-nez v1, :cond_3

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_3
    iget-object p0, p0, Li51;->c:Ln01;

    .line 143
    .line 144
    if-eqz p0, :cond_4

    .line 145
    .line 146
    invoke-virtual {p0, v1}, Ln01;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    :cond_4
    :goto_0
    return-void

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

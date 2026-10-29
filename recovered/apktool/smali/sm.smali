.class public final Lsm;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lhk0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lsm;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lsm;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lc10;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lsm;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Lsm;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lot0;

    .line 11
    .line 12
    check-cast v3, Lil0;

    .line 13
    .line 14
    iget-object p0, v3, Lil0;->d:Lts0;

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p0, p0, Lts0;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    .line 22
    .line 23
    iput-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->i0:Lot0;

    .line 24
    .line 25
    new-instance p1, Landroidx/transition/ChangeBounds;

    .line 26
    .line 27
    invoke-direct {p1}, Landroidx/transition/ChangeBounds;-><init>()V

    .line 28
    .line 29
    .line 30
    const-wide/16 v0, 0x12c

    .line 31
    .line 32
    iput-wide v0, p1, Landroidx/transition/Transition;->c:J

    .line 33
    .line 34
    const/4 p2, 0x0

    .line 35
    const/high16 v0, 0x3f800000    # 1.0f

    .line 36
    .line 37
    const v1, 0x3e4ccccd    # 0.2f

    .line 38
    .line 39
    .line 40
    invoke-static {v1, p2, p2, v0}, Lpr1;->b(FFFF)Landroid/view/animation/Interpolator;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iput-object p2, p1, Landroidx/transition/Transition;->d:Landroid/animation/TimeInterpolator;

    .line 45
    .line 46
    invoke-static {p0, p1}, Llr2;->a(Landroid/view/ViewGroup;Landroidx/transition/Transition;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 50
    .line 51
    .line 52
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    :goto_0
    sget-object p0, Lz10;->a:Lz10;

    .line 55
    .line 56
    if-ne v2, p0, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    :goto_1
    return-object v2

    .line 62
    :pswitch_0
    check-cast v3, Lh22;

    .line 63
    .line 64
    iput-object p1, v3, Lh22;->a:Ljava/lang/Object;

    .line 65
    .line 66
    new-instance p1, La;

    .line 67
    .line 68
    invoke-direct {p1, p0}, La;-><init>(Lhk0;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :pswitch_1
    check-cast p1, Lkotlin/Unit;

    .line 73
    .line 74
    check-cast v3, Lb50;

    .line 75
    .line 76
    iget-object p0, v3, Lb50;->h:Lgr0;

    .line 77
    .line 78
    invoke-virtual {p0}, Lgr0;->r()Log2;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    instance-of p0, p0, Lmi0;

    .line 83
    .line 84
    if-nez p0, :cond_3

    .line 85
    .line 86
    invoke-static {v3, v1, p2}, Lb50;->e(Lb50;ZLc10;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    sget-object p1, Lz10;->a:Lz10;

    .line 91
    .line 92
    if-ne p0, p1, :cond_2

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    :goto_2
    return-object p0

    .line 101
    :pswitch_2
    instance-of v0, p2, Lp40;

    .line 102
    .line 103
    if-eqz v0, :cond_4

    .line 104
    .line 105
    move-object v0, p2

    .line 106
    check-cast v0, Lp40;

    .line 107
    .line 108
    iget v4, v0, Lp40;->b:I

    .line 109
    .line 110
    const/high16 v5, -0x80000000

    .line 111
    .line 112
    and-int v6, v4, v5

    .line 113
    .line 114
    if-eqz v6, :cond_4

    .line 115
    .line 116
    sub-int/2addr v4, v5

    .line 117
    iput v4, v0, Lp40;->b:I

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_4
    new-instance v0, Lp40;

    .line 121
    .line 122
    invoke-direct {v0, p0, p2}, Lp40;-><init>(Lsm;Lc10;)V

    .line 123
    .line 124
    .line 125
    :goto_3
    iget-object p0, v0, Lp40;->a:Ljava/lang/Object;

    .line 126
    .line 127
    sget-object p2, Lz10;->a:Lz10;

    .line 128
    .line 129
    iget v4, v0, Lp40;->b:I

    .line 130
    .line 131
    if-eqz v4, :cond_6

    .line 132
    .line 133
    if-ne v4, v1, :cond_5

    .line 134
    .line 135
    invoke-static {p0}, Lpg3;->A(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_5
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 140
    .line 141
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_6
    invoke-static {p0}, Lpg3;->A(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    check-cast v3, Lhk0;

    .line 149
    .line 150
    check-cast p1, Log2;

    .line 151
    .line 152
    instance-of p0, p1, Lv02;

    .line 153
    .line 154
    if-nez p0, :cond_b

    .line 155
    .line 156
    instance-of p0, p1, Lx30;

    .line 157
    .line 158
    if-eqz p0, :cond_8

    .line 159
    .line 160
    check-cast p1, Lx30;

    .line 161
    .line 162
    iget-object p0, p1, Lx30;->b:Ljava/lang/Object;

    .line 163
    .line 164
    iput v1, v0, Lp40;->b:I

    .line 165
    .line 166
    invoke-interface {v3, p0, v0}, Lhk0;->emit(Ljava/lang/Object;Lc10;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    if-ne p0, p2, :cond_7

    .line 171
    .line 172
    move-object v2, p2

    .line 173
    goto :goto_6

    .line 174
    :cond_7
    :goto_4
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_8
    instance-of p0, p1, Lmi0;

    .line 178
    .line 179
    if-eqz p0, :cond_9

    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_9
    instance-of v1, p1, Lhx2;

    .line 183
    .line 184
    :goto_5
    if-eqz v1, :cond_a

    .line 185
    .line 186
    const-string p0, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    .line 187
    .line 188
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    goto :goto_6

    .line 192
    :cond_a
    invoke-static {}, Lds0;->b()V

    .line 193
    .line 194
    .line 195
    :goto_6
    return-object v2

    .line 196
    :cond_b
    check-cast p1, Lv02;

    .line 197
    .line 198
    iget-object p0, p1, Lv02;->b:Ljava/lang/Throwable;

    .line 199
    .line 200
    throw p0

    .line 201
    :pswitch_3
    check-cast v3, Lc00;

    .line 202
    .line 203
    invoke-interface {v3, p1}, Lc00;->accept(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

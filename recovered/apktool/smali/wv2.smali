.class public final Lwv2;
.super Landroidx/appcompat/widget/LinearLayoutCompat;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final d0:Lew2;

.field public final e0:Lhk2;

.field public final f0:Lhk2;

.field public final g0:Lhk2;

.field public final h0:Lhk2;

.field public final i0:Lhk2;

.field public final j0:Lrv2;

.field public k0:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lz00;Lew2;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {p0, p1, v0, v1}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lwv2;->d0:Lew2;

    .line 13
    .line 14
    new-instance v0, Lvv2;

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    invoke-direct {v0, p0, v3}, Lvv2;-><init>(Lwv2;I)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lwv2;->e0:Lhk2;

    .line 25
    .line 26
    new-instance v0, Lvv2;

    .line 27
    .line 28
    const/4 v3, 0x3

    .line 29
    invoke-direct {v0, p0, v3}, Lvv2;-><init>(Lwv2;I)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lwv2;->f0:Lhk2;

    .line 37
    .line 38
    new-instance v0, Lvv2;

    .line 39
    .line 40
    const/4 v3, 0x4

    .line 41
    invoke-direct {v0, p0, v3}, Lvv2;-><init>(Lwv2;I)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lwv2;->g0:Lhk2;

    .line 49
    .line 50
    new-instance v0, Lvv2;

    .line 51
    .line 52
    const/4 v8, 0x1

    .line 53
    invoke-direct {v0, p0, v8}, Lvv2;-><init>(Lwv2;I)V

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, Lwv2;->h0:Lhk2;

    .line 61
    .line 62
    new-instance v0, Lvv2;

    .line 63
    .line 64
    invoke-direct {v0, p0, v1}, Lvv2;-><init>(Lwv2;I)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, Lwv2;->i0:Lhk2;

    .line 72
    .line 73
    new-instance v9, Lrv2;

    .line 74
    .line 75
    new-instance v0, Ln01;

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    const/4 v7, 0x7

    .line 79
    const/4 v1, 0x1

    .line 80
    const-class v3, Lwv2;

    .line 81
    .line 82
    const-string v4, "navigateToTab"

    .line 83
    .line 84
    const-string v5, "navigateToTab(I)V"

    .line 85
    .line 86
    move-object v2, p0

    .line 87
    invoke-direct/range {v0 .. v7}, Ln01;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 88
    .line 89
    .line 90
    move-object v10, v0

    .line 91
    new-instance v0, Lv11;

    .line 92
    .line 93
    const/4 v7, 0x5

    .line 94
    const/4 v1, 0x0

    .line 95
    const-class v3, Lwv2;

    .line 96
    .line 97
    const-string v4, "collapseHeader"

    .line 98
    .line 99
    const-string v5, "collapseHeader()V"

    .line 100
    .line 101
    invoke-direct/range {v0 .. v7}, Lv11;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 102
    .line 103
    .line 104
    invoke-direct {v9, p2, v10, v0}, Lrv2;-><init>(Lew2;Ln01;Lv11;)V

    .line 105
    .line 106
    .line 107
    iput-object v9, p0, Lwv2;->j0:Lrv2;

    .line 108
    .line 109
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    sget v1, Lcom/usercentrics/sdk/ui/R$layout;->uc_layer:I

    .line 118
    .line 119
    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v8}, Landroidx/appcompat/widget/LinearLayoutCompat;->setOrientation(I)V

    .line 123
    .line 124
    .line 125
    const/4 v0, -0x1

    .line 126
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 127
    .line 128
    .line 129
    invoke-direct {p0}, Lwv2;->getUcContentViewPager()Landroidx/viewpager/widget/ViewPager;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0, v9}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 134
    .line 135
    .line 136
    invoke-direct {p0}, Lwv2;->getUcContentViewPager()Landroidx/viewpager/widget/ViewPager;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    new-instance v1, Ltv2;

    .line 141
    .line 142
    invoke-direct {v1, p0}, Ltv2;-><init>(Lwv2;)V

    .line 143
    .line 144
    .line 145
    iget-object v3, v0, Landroidx/viewpager/widget/ViewPager;->F0:Ljava/util/ArrayList;

    .line 146
    .line 147
    if-nez v3, :cond_0

    .line 148
    .line 149
    new-instance v3, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 152
    .line 153
    .line 154
    iput-object v3, v0, Landroidx/viewpager/widget/ViewPager;->F0:Ljava/util/ArrayList;

    .line 155
    .line 156
    :cond_0
    iget-object v0, v0, Landroidx/viewpager/widget/ViewPager;->F0:Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    invoke-direct {p0}, Lwv2;->getUcHeader()Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v0, p2}, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;->m(Lew2;)V

    .line 166
    .line 167
    .line 168
    invoke-direct {p0}, Lwv2;->getUcFooter()Lcom/usercentrics/sdk/ui/secondLayer/component/footer/UCSecondLayerFooter;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v0, p2}, Lcom/usercentrics/sdk/ui/secondLayer/component/footer/UCSecondLayerFooter;->l(Lew2;)V

    .line 173
    .line 174
    .line 175
    new-instance v0, Lf72;

    .line 176
    .line 177
    const/16 v1, 0xb

    .line 178
    .line 179
    invoke-direct {v0, p0, v1}, Lf72;-><init>(Ljava/lang/Object;I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 183
    .line 184
    .line 185
    return-void
.end method

.method private final getUcAppBar()Lcom/google/android/material/appbar/AppBarLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lwv2;->i0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/material/appbar/AppBarLayout;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getUcContentViewPager()Landroidx/viewpager/widget/ViewPager;
    .locals 0

    .line 1
    iget-object p0, p0, Lwv2;->h0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroidx/viewpager/widget/ViewPager;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getUcFooter()Lcom/usercentrics/sdk/ui/secondLayer/component/footer/UCSecondLayerFooter;
    .locals 0

    .line 1
    iget-object p0, p0, Lwv2;->e0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/usercentrics/sdk/ui/secondLayer/component/footer/UCSecondLayerFooter;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getUcHeader()Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;
    .locals 0

    .line 1
    iget-object p0, p0, Lwv2;->f0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getUcToolbar()Landroidx/appcompat/widget/Toolbar;
    .locals 0

    .line 1
    iget-object p0, p0, Lwv2;->g0:Lhk2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroidx/appcompat/widget/Toolbar;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic j(Lwv2;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lwv2;->setupView$lambda$0(Lwv2;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static k(Lwv2;Landroid/view/View;Landroid/view/View;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sget v1, Lcom/usercentrics/sdk/ui/R$id;->ucHeader:I

    .line 12
    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    sget v1, Lcom/usercentrics/sdk/ui/R$id;->ucHeader:I

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    invoke-direct {p0}, Lwv2;->getUcContentViewPager()Landroidx/viewpager/widget/ViewPager;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {p0}, Lwv2;->getUcContentViewPager()Landroidx/viewpager/widget/ViewPager;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    new-instance p2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v0, "page_"

    .line 38
    .line 39
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-eqz p0, :cond_6

    .line 54
    .line 55
    sget p1, Lcom/usercentrics/sdk/ui/R$id;->ucCardTitle:I

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-eqz p0, :cond_6

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    instance-of p1, p1, Lcom/usercentrics/sdk/ui/components/UCButton;

    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    sget v1, Lcom/usercentrics/sdk/ui/R$id;->ucHeader:I

    .line 77
    .line 78
    if-ne p1, v1, :cond_4

    .line 79
    .line 80
    invoke-direct {p0}, Lwv2;->getUcHeader()Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    sget p2, Lcom/usercentrics/sdk/ui/R$id;->ucHeaderLanguageIcon:I

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-nez p1, :cond_2

    .line 98
    .line 99
    invoke-direct {p0}, Lwv2;->getUcHeader()Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    sget p2, Lcom/usercentrics/sdk/ui/R$id;->ucHeaderLanguageIcon:I

    .line 104
    .line 105
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-eqz p1, :cond_3

    .line 110
    .line 111
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_2
    invoke-direct {p0}, Lwv2;->getUcHeader()Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    sget p2, Lcom/usercentrics/sdk/ui/R$id;->ucHeaderCloseButton:I

    .line 120
    .line 121
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-eqz p1, :cond_3

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 128
    .line 129
    .line 130
    :cond_3
    :goto_0
    invoke-direct {p0}, Lwv2;->getUcAppBar()Lcom/google/android/material/appbar/AppBarLayout;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p0, v0, v0, v0}, Lcom/google/android/material/appbar/AppBarLayout;->d(ZZZ)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_4
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    sget p2, Lcom/usercentrics/sdk/ui/R$id;->ucHeader:I

    .line 143
    .line 144
    if-ne p1, p2, :cond_6

    .line 145
    .line 146
    invoke-direct {p0}, Lwv2;->getUcHeader()Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    sget p2, Lcom/usercentrics/sdk/ui/R$id;->ucHeaderTabLayout:I

    .line 151
    .line 152
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    check-cast p1, Lcom/google/android/material/tabs/TabLayout;

    .line 157
    .line 158
    const/4 p2, 0x0

    .line 159
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    instance-of p2, p1, Landroid/view/ViewGroup;

    .line 164
    .line 165
    if-eqz p2, :cond_5

    .line 166
    .line 167
    check-cast p1, Landroid/view/ViewGroup;

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_5
    const/4 p1, 0x0

    .line 171
    :goto_1
    if-eqz p1, :cond_6

    .line 172
    .line 173
    invoke-direct {p0}, Lwv2;->getUcContentViewPager()Landroidx/viewpager/widget/ViewPager;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    invoke-virtual {p2}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    if-eqz p1, :cond_6

    .line 186
    .line 187
    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 194
    .line 195
    .line 196
    invoke-direct {p0}, Lwv2;->getUcAppBar()Lcom/google/android/material/appbar/AppBarLayout;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-virtual {p0, v0, v0, v0}, Lcom/google/android/material/appbar/AppBarLayout;->d(ZZZ)V

    .line 201
    .line 202
    .line 203
    :cond_6
    :goto_2
    return-void
.end method

.method public static final l(Lwv2;Lcv2;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lwv2;->j0:Lrv2;

    .line 2
    .line 3
    iget-object v1, p1, Lcv2;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, Lrv2;->d:Ljava/util/List;

    .line 9
    .line 10
    iget-object v2, v0, Lrv2;->f:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/util/Map$Entry;

    .line 31
    .line 32
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Lkv2;

    .line 37
    .line 38
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-static {v3, v1}, Lkotlin/collections/CollectionsKt;->v(ILjava/util/List;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Ldv2;

    .line 53
    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    iget-object v3, v3, Ldv2;->b:Ljava/util/ArrayList;

    .line 57
    .line 58
    sget-object v5, Lqt2;->Companion:Lpt2;

    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-static {v3}, Lpt2;->a(Ljava/util/List;)Ljava/util/ArrayList;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iput-object v3, v4, Lkv2;->g:Ljava/util/List;

    .line 71
    .line 72
    invoke-virtual {v4}, Landroidx/recyclerview/widget/g;->d()V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {v0}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    const/4 v2, 0x1

    .line 84
    const/4 v3, 0x0

    .line 85
    if-le v0, v2, :cond_2

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    move v2, v3

    .line 89
    :goto_1
    invoke-direct {p0}, Lwv2;->getUcHeader()Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-object v4, p0, Lwv2;->d0:Lew2;

    .line 94
    .line 95
    invoke-direct {p0}, Lwv2;->getUcContentViewPager()Landroidx/viewpager/widget/ViewPager;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance v6, Ljava/util/ArrayList;

    .line 103
    .line 104
    const/16 v7, 0xa

    .line 105
    .line 106
    invoke-static {v1, v7}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    if-eqz v8, :cond_3

    .line 122
    .line 123
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    check-cast v8, Ldv2;

    .line 128
    .line 129
    iget-object v8, v8, Ldv2;->a:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_3
    invoke-virtual {v0, v4, v5, v6, v2}, Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;->l(Lew2;Landroidx/viewpager/widget/ViewPager;Ljava/util/ArrayList;Z)V

    .line 136
    .line 137
    .line 138
    invoke-direct {p0}, Lwv2;->getUcToolbar()Landroidx/appcompat/widget/Toolbar;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-direct {p0}, Lwv2;->getUcToolbar()Landroidx/appcompat/widget/Toolbar;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    if-eqz v2, :cond_4

    .line 151
    .line 152
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    sget v5, Lcom/usercentrics/sdk/ui/R$dimen;->ucTabLayoutHeight:I

    .line 157
    .line 158
    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDimension(I)F

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    float-to-int v2, v2

    .line 163
    goto :goto_3

    .line 164
    :cond_4
    move v2, v3

    .line 165
    :goto_3
    iput v2, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 166
    .line 167
    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 168
    .line 169
    .line 170
    iget-object v0, p0, Lwv2;->k0:Ljava/lang/Integer;

    .line 171
    .line 172
    if-eqz v0, :cond_5

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    goto :goto_4

    .line 179
    :cond_5
    iget p1, p1, Lcv2;->a:I

    .line 180
    .line 181
    :goto_4
    if-lez p1, :cond_6

    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-ge p1, v0, :cond_6

    .line 188
    .line 189
    invoke-direct {p0}, Lwv2;->getUcContentViewPager()Landroidx/viewpager/widget/ViewPager;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    iput-boolean v3, p0, Landroidx/viewpager/widget/ViewPager;->j0:Z

    .line 194
    .line 195
    invoke-virtual {p0, p1, v3, v3, v3}, Landroidx/viewpager/widget/ViewPager;->u(IIZZ)V

    .line 196
    .line 197
    .line 198
    :cond_6
    return-void
.end method

.method public static final m(Lwv2;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lwv2;->getUcAppBar()Lcom/google/android/material/appbar/AppBarLayout;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/material/appbar/AppBarLayout;->d(ZZZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static final synthetic n(Lwv2;)Landroidx/viewpager/widget/ViewPager;
    .locals 0

    .line 1
    invoke-direct {p0}, Lwv2;->getUcContentViewPager()Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic o(Lwv2;)Lcom/usercentrics/sdk/ui/secondLayer/component/footer/UCSecondLayerFooter;
    .locals 0

    .line 1
    invoke-direct {p0}, Lwv2;->getUcFooter()Lcom/usercentrics/sdk/ui/secondLayer/component/footer/UCSecondLayerFooter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic p(Lwv2;)Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;
    .locals 0

    .line 1
    invoke-direct {p0}, Lwv2;->getUcHeader()Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final q(Lwv2;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lwv2;->getUcContentViewPager()Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static final setupView$lambda$0(Lwv2;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lwv2;->getUcAppBar()Lcom/google/android/material/appbar/AppBarLayout;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lwv2;->getUcAppBar()Lcom/google/android/material/appbar/AppBarLayout;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1, v1, v1}, Lcom/google/android/material/appbar/AppBarLayout;->d(ZZZ)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lwv2;->getUcHeader()Lcom/usercentrics/sdk/ui/secondLayer/component/header/UCSecondLayerHeader;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Lsv2;

    .line 31
    .line 32
    invoke-direct {v1, p0}, Lsv2;-><init>(Lwv2;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

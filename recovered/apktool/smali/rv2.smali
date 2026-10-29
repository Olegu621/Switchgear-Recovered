.class public final Lrv2;
.super Landroidx/viewpager/widget/PagerAdapter;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lew2;

.field public final b:Ln01;

.field public final c:Lv11;

.field public d:Ljava/util/List;

.field public final e:Ljava/util/LinkedHashMap;

.field public final f:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Lew2;Ln01;Lv11;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/viewpager/widget/PagerAdapter;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lrv2;->a:Lew2;

    .line 8
    .line 9
    iput-object p2, p0, Lrv2;->b:Ln01;

    .line 10
    .line 11
    iput-object p3, p0, Lrv2;->c:Lv11;

    .line 12
    .line 13
    sget-object p1, Lnd0;->a:Lnd0;

    .line 14
    .line 15
    iput-object p1, p0, Lrv2;->d:Ljava/util/List;

    .line 16
    .line 17
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lrv2;->e:Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lrv2;->f:Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-object p2, p3

    .line 8
    check-cast p2, Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    instance-of p1, p3, Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    check-cast p3, Landroidx/recyclerview/widget/RecyclerView;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p3, p2

    .line 22
    :goto_0
    iget-object p1, p0, Lrv2;->e:Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    instance-of v0, p1, Lr21;

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    invoke-interface {p1, p3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lkv2;

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    iget-object p0, p0, Lrv2;->f:Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    const-string p0, "kotlin.collections.MutableMap"

    .line 44
    .line 45
    invoke-static {p1, p0}, Lgs2;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p2
.end method

.method public final getCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lrv2;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getPageTitle(I)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lrv2;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->v(ILjava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldv2;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Ldv2;->a:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, ""

    .line 17
    .line 18
    return-object p0
.end method

.method public final instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget v1, Lcom/usercentrics/sdk/ui/R$dimen;->ucCardVerticalMargin:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    float-to-int v0, v0

    .line 15
    new-instance v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v3, "Tab list "

    .line 28
    .line 29
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v1, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    new-instance v2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v3, "page_"

    .line 45
    .line 46
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    if-eqz p2, :cond_1

    .line 61
    .line 62
    if-eq p2, v2, :cond_0

    .line 63
    .line 64
    const/4 v3, -0x1

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    sget v3, Lcom/usercentrics/sdk/ui/R$id;->ucHeaderSecondTabRecyclerView:I

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    sget v3, Lcom/usercentrics/sdk/ui/R$id;->ucHeaderFirstTabRecyclerView:I

    .line 70
    .line 71
    :goto_0
    invoke-virtual {v1, v3}, Landroid/view/View;->setId(I)V

    .line 72
    .line 73
    .line 74
    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    invoke-direct {v3, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/k;)V

    .line 83
    .line 84
    .line 85
    new-instance v2, Lkv2;

    .line 86
    .line 87
    new-instance v3, Ln01;

    .line 88
    .line 89
    const/4 v9, 0x0

    .line 90
    const/4 v10, 0x6

    .line 91
    const/4 v4, 0x1

    .line 92
    const-class v6, Lrv2;

    .line 93
    .line 94
    const-string v7, "navigateToCard"

    .line 95
    .line 96
    const-string v8, "navigateToCard(Ljava/lang/String;)V"

    .line 97
    .line 98
    move-object v5, p0

    .line 99
    invoke-direct/range {v3 .. v10}, Ln01;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 100
    .line 101
    .line 102
    new-instance p0, Ljv2;

    .line 103
    .line 104
    invoke-direct {p0, v5, v1, v0}, Ljv2;-><init>(Lrv2;Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 105
    .line 106
    .line 107
    iget-object v0, v5, Lrv2;->a:Lew2;

    .line 108
    .line 109
    invoke-direct {v2, v0, v3, p0}, Lkv2;-><init>(Lew2;Ln01;Ljv2;)V

    .line 110
    .line 111
    .line 112
    iget-object p0, v5, Lrv2;->e:Ljava/util/LinkedHashMap;

    .line 113
    .line 114
    invoke-interface {p0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    iget-object v3, v5, Lrv2;->f:Ljava/util/LinkedHashMap;

    .line 122
    .line 123
    invoke-interface {v3, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    iget-object p0, v5, Lrv2;->d:Ljava/util/List;

    .line 127
    .line 128
    invoke-static {p2, p0}, Lkotlin/collections/CollectionsKt;->v(ILjava/util/List;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    check-cast p0, Ldv2;

    .line 133
    .line 134
    if-eqz p0, :cond_2

    .line 135
    .line 136
    iget-object p0, p0, Ldv2;->b:Ljava/util/ArrayList;

    .line 137
    .line 138
    sget-object p2, Lqt2;->Companion:Lpt2;

    .line 139
    .line 140
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-static {p0}, Lpt2;->a(Ljava/util/List;)Ljava/util/ArrayList;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    iput-object p0, v2, Lkv2;->g:Ljava/util/List;

    .line 148
    .line 149
    invoke-virtual {v2}, Landroidx/recyclerview/widget/g;->d()V

    .line 150
    .line 151
    .line 152
    :cond_2
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/g;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 156
    .line 157
    .line 158
    iget-object p0, v0, Lew2;->a:Lwt2;

    .line 159
    .line 160
    iget-object p0, p0, Lwt2;->f:Ljava/lang/Integer;

    .line 161
    .line 162
    if-eqz p0, :cond_3

    .line 163
    .line 164
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    invoke-virtual {v1, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 169
    .line 170
    .line 171
    :cond_3
    new-instance p0, Lf72;

    .line 172
    .line 173
    const/16 p1, 0xa

    .line 174
    .line 175
    invoke-direct {p0, v1, p1}, Lf72;-><init>(Ljava/lang/Object;I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 179
    .line 180
    .line 181
    return-object v1
.end method

.method public final isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

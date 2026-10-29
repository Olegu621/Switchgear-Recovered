.class public final Lkv2;
.super Landroidx/recyclerview/widget/g;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Liv2;


# instance fields
.field public final d:Lew2;

.field public final e:Ln01;

.field public final f:Ljv2;

.field public g:Ljava/util/List;

.field public final h:Ljava/util/LinkedHashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Liv2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkv2;->Companion:Liv2;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lew2;Ln01;Ljv2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/recyclerview/widget/g;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lkv2;->d:Lew2;

    .line 8
    .line 9
    iput-object p2, p0, Lkv2;->e:Ln01;

    .line 10
    .line 11
    iput-object p3, p0, Lkv2;->f:Ljv2;

    .line 12
    .line 13
    sget-object p1, Lnd0;->a:Lnd0;

    .line 14
    .line 15
    iput-object p1, p0, Lkv2;->g:Ljava/util/List;

    .line 16
    .line 17
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lkv2;->h:Ljava/util/LinkedHashSet;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkv2;->g:Ljava/util/List;

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

.method public final c(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lkv2;->g:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lqt2;

    .line 8
    .line 9
    instance-of p1, p0, Lzv2;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/16 p0, 0x34a

    .line 14
    .line 15
    return p0

    .line 16
    :cond_0
    instance-of p1, p0, Lst2;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const/16 p0, 0x34b

    .line 21
    .line 22
    return p0

    .line 23
    :cond_1
    instance-of p0, p0, Ldu2;

    .line 24
    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    const/16 p0, 0x349

    .line 28
    .line 29
    return p0

    .line 30
    :cond_2
    invoke-static {}, Lds0;->b()V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public final e(Landroidx/recyclerview/widget/o;I)V
    .locals 9

    .line 1
    iget-object v0, p0, Lkv2;->g:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lqt2;

    .line 8
    .line 9
    instance-of v1, p1, Law2;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast p1, Law2;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast v0, Lzv2;

    .line 19
    .line 20
    iget-object p0, p1, Law2;->u:Lcom/usercentrics/sdk/ui/components/UCSectionTitle;

    .line 21
    .line 22
    iget-object p1, v0, Lzv2;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    instance-of v1, p1, Ltt2;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    move-object v1, p1

    .line 34
    check-cast v1, Ltt2;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-object v5, v0

    .line 40
    check-cast v5, Lst2;

    .line 41
    .line 42
    iget-object v0, p0, Lkv2;->h:Ljava/util/LinkedHashSet;

    .line 43
    .line 44
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    iget-object v0, p0, Lkv2;->g:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    sub-int/2addr v0, v2

    .line 59
    if-ne p2, v0, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 v2, 0x0

    .line 63
    :goto_0
    new-instance v7, Ljv2;

    .line 64
    .line 65
    invoke-direct {v7, p0, p2, p1}, Ljv2;-><init>(Lkv2;ILandroidx/recyclerview/widget/o;)V

    .line 66
    .line 67
    .line 68
    iget-object v3, v1, Ltt2;->v:Lcom/usercentrics/sdk/ui/components/cards/UCCard;

    .line 69
    .line 70
    iget-object v4, v1, Ltt2;->u:Lew2;

    .line 71
    .line 72
    iget-object v8, p0, Lkv2;->e:Ln01;

    .line 73
    .line 74
    invoke-virtual/range {v3 .. v8}, Lcom/usercentrics/sdk/ui/components/cards/UCCard;->b(Lew2;Lst2;ZLjv2;Ln01;)V

    .line 75
    .line 76
    .line 77
    iget-object p0, v1, Ltt2;->v:Lcom/usercentrics/sdk/ui/components/cards/UCCard;

    .line 78
    .line 79
    iget-object p1, v1, Landroidx/recyclerview/widget/o;->a:Landroid/view/View;

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    sget v0, Lcom/usercentrics/sdk/ui/R$dimen;->ucCardHorizontalMargin:I

    .line 86
    .line 87
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    float-to-int p2, p2

    .line 92
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    sget v0, Lcom/usercentrics/sdk/ui/R$dimen;->ucCardVerticalMargin:I

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    float-to-int p1, p1

    .line 103
    invoke-static {p0, p2, p1, v2}, Lk33;->a(Landroid/view/ViewGroup;IIZ)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_2
    instance-of p0, p1, Leu2;

    .line 108
    .line 109
    if-eqz p0, :cond_3

    .line 110
    .line 111
    check-cast p1, Leu2;

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    check-cast v0, Ldu2;

    .line 117
    .line 118
    iget-object p0, p1, Leu2;->u:Lcom/usercentrics/sdk/ui/components/UCControllerId;

    .line 119
    .line 120
    invoke-virtual {p0, v0}, Lcom/usercentrics/sdk/ui/components/UCControllerId;->k(Ldu2;)V

    .line 121
    .line 122
    .line 123
    iget-object p1, p1, Landroidx/recyclerview/widget/o;->a:Landroid/view/View;

    .line 124
    .line 125
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    sget v0, Lcom/usercentrics/sdk/ui/R$dimen;->ucCardHorizontalMargin:I

    .line 130
    .line 131
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    float-to-int p2, p2

    .line 136
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    sget v0, Lcom/usercentrics/sdk/ui/R$dimen;->ucCardVerticalMargin:I

    .line 141
    .line 142
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    float-to-int p1, p1

    .line 147
    invoke-static {p0, p2, p1, v2}, Lk33;->a(Landroid/view/ViewGroup;IIZ)V

    .line 148
    .line 149
    .line 150
    :cond_3
    return-void
.end method

.method public final f(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Lkv2;->d:Lew2;

    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    const-string p0, "not implemented"

    .line 8
    .line 9
    invoke-static {p0}, Lf42;->s(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :pswitch_0
    new-instance p2, Ltt2;

    .line 14
    .line 15
    new-instance v1, Lcom/usercentrics/sdk/ui/components/cards/UCCard;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, p1, v0}, Lcom/usercentrics/sdk/ui/components/cards/UCCard;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p2, p0, v1}, Ltt2;-><init>(Lew2;Lcom/usercentrics/sdk/ui/components/cards/UCCard;)V

    .line 28
    .line 29
    .line 30
    return-object p2

    .line 31
    :pswitch_1
    new-instance p2, Law2;

    .line 32
    .line 33
    new-instance v1, Lcom/usercentrics/sdk/ui/components/UCSectionTitle;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, p1, v0}, Lcom/usercentrics/sdk/ui/components/UCSectionTitle;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p2, p0, v1}, Law2;-><init>(Lew2;Lcom/usercentrics/sdk/ui/components/UCSectionTitle;)V

    .line 46
    .line 47
    .line 48
    return-object p2

    .line 49
    :pswitch_2
    new-instance p2, Leu2;

    .line 50
    .line 51
    new-instance v1, Lcom/usercentrics/sdk/ui/components/UCControllerId;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-direct {v1, p1, v0}, Lcom/usercentrics/sdk/ui/components/UCControllerId;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 61
    .line 62
    .line 63
    invoke-direct {p2, p0, v1}, Leu2;-><init>(Lew2;Lcom/usercentrics/sdk/ui/components/UCControllerId;)V

    .line 64
    .line 65
    .line 66
    return-object p2

    .line 67
    :pswitch_data_0
    .packed-switch 0x349
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

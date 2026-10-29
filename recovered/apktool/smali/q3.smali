.class public final Lq3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;ILtc2;Landroid/graphics/Rect;)V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iget v0, p6, Landroid/graphics/Rect;->left:I

    invoke-static {v0}, Lde3;->h(I)V

    .line 44
    iget v0, p6, Landroid/graphics/Rect;->top:I

    invoke-static {v0}, Lde3;->h(I)V

    .line 45
    iget v0, p6, Landroid/graphics/Rect;->right:I

    invoke-static {v0}, Lde3;->h(I)V

    .line 46
    iget v0, p6, Landroid/graphics/Rect;->bottom:I

    invoke-static {v0}, Lde3;->h(I)V

    .line 47
    iput-object p6, p0, Lq3;->b:Ljava/lang/Object;

    .line 48
    iput-object p2, p0, Lq3;->c:Ljava/lang/Object;

    .line 49
    iput-object p1, p0, Lq3;->d:Ljava/lang/Object;

    .line 50
    iput-object p3, p0, Lq3;->e:Ljava/lang/Object;

    .line 51
    iput p4, p0, Lq3;->a:I

    .line 52
    iput-object p5, p0, Lq3;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ler0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lnt1;

    .line 5
    .line 6
    const/16 v1, 0x1e

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lnt1;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lq3;->b:Ljava/lang/Object;

    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lq3;->c:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lq3;->d:Ljava/lang/Object;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    iput v0, p0, Lq3;->a:I

    .line 29
    .line 30
    iput-object p1, p0, Lq3;->e:Ljava/lang/Object;

    .line 31
    .line 32
    new-instance p1, Ler0;

    .line 33
    .line 34
    const/16 v0, 0x8

    .line 35
    .line 36
    invoke-direct {p1, p0, v0}, Ler0;-><init>(Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lq3;->f:Ljava/lang/Object;

    .line 40
    .line 41
    return-void
.end method

.method public static d(Landroid/content/Context;I)Lq3;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move v1, v0

    .line 7
    :goto_0
    const-string v2, "Cannot create a CalendarItemStyle with a styleResId of 0"

    .line 8
    .line 9
    invoke-static {v2, v1}, Lde3;->e(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lcom/google/android/material/R$styleable;->MaterialCalendarItem:[I

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget v1, Lcom/google/android/material/R$styleable;->MaterialCalendarItem_android_insetLeft:I

    .line 19
    .line 20
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    sget v2, Lcom/google/android/material/R$styleable;->MaterialCalendarItem_android_insetTop:I

    .line 25
    .line 26
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    sget v3, Lcom/google/android/material/R$styleable;->MaterialCalendarItem_android_insetRight:I

    .line 31
    .line 32
    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    sget v4, Lcom/google/android/material/R$styleable;->MaterialCalendarItem_android_insetBottom:I

    .line 37
    .line 38
    invoke-virtual {p1, v4, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    new-instance v11, Landroid/graphics/Rect;

    .line 43
    .line 44
    invoke-direct {v11, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 45
    .line 46
    .line 47
    sget v1, Lcom/google/android/material/R$styleable;->MaterialCalendarItem_itemFillColor:I

    .line 48
    .line 49
    invoke-static {p0, p1, v1}, Lde3;->o(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    sget v1, Lcom/google/android/material/R$styleable;->MaterialCalendarItem_itemTextColor:I

    .line 54
    .line 55
    invoke-static {p0, p1, v1}, Lde3;->o(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    sget v1, Lcom/google/android/material/R$styleable;->MaterialCalendarItem_itemStrokeColor:I

    .line 60
    .line 61
    invoke-static {p0, p1, v1}, Lde3;->o(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    sget v1, Lcom/google/android/material/R$styleable;->MaterialCalendarItem_itemStrokeWidth:I

    .line 66
    .line 67
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    sget v1, Lcom/google/android/material/R$styleable;->MaterialCalendarItem_itemShapeAppearance:I

    .line 72
    .line 73
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    sget v2, Lcom/google/android/material/R$styleable;->MaterialCalendarItem_itemShapeAppearanceOverlay:I

    .line 78
    .line 79
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    new-instance v2, Le;

    .line 84
    .line 85
    const/4 v3, 0x0

    .line 86
    invoke-direct {v2, v3}, Le;-><init>(F)V

    .line 87
    .line 88
    .line 89
    invoke-static {p0, v1, v0, v2}, Ltc2;->a(Landroid/content/Context;IILm10;)Lsc2;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0}, Lsc2;->a()Ltc2;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 98
    .line 99
    .line 100
    new-instance v5, Lq3;

    .line 101
    .line 102
    invoke-direct/range {v5 .. v11}, Lq3;-><init>(Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;ILtc2;Landroid/graphics/Rect;)V

    .line 103
    .line 104
    .line 105
    return-object v5
.end method


# virtual methods
.method public a(I)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lq3;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v1, :cond_3

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, Lp3;

    .line 18
    .line 19
    iget v5, v4, Lp3;->a:I

    .line 20
    .line 21
    const/16 v6, 0x8

    .line 22
    .line 23
    const/4 v7, 0x1

    .line 24
    if-ne v5, v6, :cond_0

    .line 25
    .line 26
    iget v4, v4, Lp3;->c:I

    .line 27
    .line 28
    add-int/lit8 v5, v3, 0x1

    .line 29
    .line 30
    invoke-virtual {p0, v4, v5}, Lq3;->g(II)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-ne v4, p1, :cond_2

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    if-ne v5, v7, :cond_2

    .line 38
    .line 39
    iget v5, v4, Lp3;->b:I

    .line 40
    .line 41
    iget v4, v4, Lp3;->c:I

    .line 42
    .line 43
    add-int/2addr v4, v5

    .line 44
    :goto_1
    if-ge v5, v4, :cond_2

    .line 45
    .line 46
    add-int/lit8 v6, v3, 0x1

    .line 47
    .line 48
    invoke-virtual {p0, v5, v6}, Lq3;->g(II)I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-ne v6, p1, :cond_1

    .line 53
    .line 54
    :goto_2
    return v7

    .line 55
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    return v2
.end method

.method public b()V
    .locals 6

    .line 1
    iget-object v0, p0, Lq3;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v1, :cond_0

    .line 12
    .line 13
    iget-object v4, p0, Lq3;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Ler0;

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    check-cast v5, Lp3;

    .line 22
    .line 23
    invoke-virtual {v4, v5}, Ler0;->e(Lp3;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p0, v0}, Lq3;->l(Ljava/util/ArrayList;)V

    .line 30
    .line 31
    .line 32
    iput v2, p0, Lq3;->a:I

    .line 33
    .line 34
    return-void
.end method

.method public c()V
    .locals 9

    .line 1
    iget-object v0, p0, Lq3;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ler0;

    .line 4
    .line 5
    invoke-virtual {p0}, Lq3;->b()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lq3;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_0
    if-ge v4, v2, :cond_4

    .line 19
    .line 20
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    check-cast v5, Lp3;

    .line 25
    .line 26
    iget v6, v5, Lp3;->a:I

    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    if-eq v6, v7, :cond_3

    .line 30
    .line 31
    const/4 v8, 0x2

    .line 32
    if-eq v6, v8, :cond_2

    .line 33
    .line 34
    const/4 v7, 0x4

    .line 35
    if-eq v6, v7, :cond_1

    .line 36
    .line 37
    const/16 v7, 0x8

    .line 38
    .line 39
    if-eq v6, v7, :cond_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    invoke-virtual {v0, v5}, Ler0;->e(Lp3;)V

    .line 43
    .line 44
    .line 45
    iget v6, v5, Lp3;->b:I

    .line 46
    .line 47
    iget v5, v5, Lp3;->c:I

    .line 48
    .line 49
    invoke-virtual {v0, v6, v5}, Ler0;->v(II)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-virtual {v0, v5}, Ler0;->e(Lp3;)V

    .line 54
    .line 55
    .line 56
    iget v6, v5, Lp3;->b:I

    .line 57
    .line 58
    iget v5, v5, Lp3;->c:I

    .line 59
    .line 60
    invoke-virtual {v0, v6, v5}, Ler0;->s(II)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    invoke-virtual {v0, v5}, Ler0;->e(Lp3;)V

    .line 65
    .line 66
    .line 67
    iget v6, v5, Lp3;->b:I

    .line 68
    .line 69
    iget v5, v5, Lp3;->c:I

    .line 70
    .line 71
    iget-object v8, v0, Ler0;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v8, Landroidx/recyclerview/widget/RecyclerView;

    .line 74
    .line 75
    invoke-virtual {v8, v6, v5, v7}, Landroidx/recyclerview/widget/RecyclerView;->Q(IIZ)V

    .line 76
    .line 77
    .line 78
    iput-boolean v7, v8, Landroidx/recyclerview/widget/RecyclerView;->U0:Z

    .line 79
    .line 80
    iget-object v6, v8, Landroidx/recyclerview/widget/RecyclerView;->R0:Ly12;

    .line 81
    .line 82
    iget v7, v6, Ly12;->c:I

    .line 83
    .line 84
    add-int/2addr v7, v5

    .line 85
    iput v7, v6, Ly12;->c:I

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    invoke-virtual {v0, v5}, Ler0;->e(Lp3;)V

    .line 89
    .line 90
    .line 91
    iget v6, v5, Lp3;->b:I

    .line 92
    .line 93
    iget v5, v5, Lp3;->c:I

    .line 94
    .line 95
    invoke-virtual {v0, v6, v5}, Ler0;->u(II)V

    .line 96
    .line 97
    .line 98
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    invoke-virtual {p0, v1}, Lq3;->l(Ljava/util/ArrayList;)V

    .line 102
    .line 103
    .line 104
    iput v3, p0, Lq3;->a:I

    .line 105
    .line 106
    return-void
.end method

.method public e(Lp3;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lq3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnt1;

    .line 4
    .line 5
    iget v1, p1, Lp3;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eq v1, v2, :cond_8

    .line 9
    .line 10
    const/16 v3, 0x8

    .line 11
    .line 12
    if-eq v1, v3, :cond_8

    .line 13
    .line 14
    iget v3, p1, Lp3;->b:I

    .line 15
    .line 16
    invoke-virtual {p0, v3, v1}, Lq3;->n(II)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget v3, p1, Lp3;->b:I

    .line 21
    .line 22
    iget v4, p1, Lp3;->a:I

    .line 23
    .line 24
    const/4 v5, 0x2

    .line 25
    const/4 v6, 0x4

    .line 26
    if-eq v4, v5, :cond_1

    .line 27
    .line 28
    if-ne v4, v6, :cond_0

    .line 29
    .line 30
    move v4, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string p0, "op should be remove or update."

    .line 33
    .line 34
    invoke-static {p1, p0}, Ls80;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    const/4 v4, 0x0

    .line 39
    :goto_0
    move v7, v2

    .line 40
    move v8, v7

    .line 41
    :goto_1
    iget v9, p1, Lp3;->c:I

    .line 42
    .line 43
    if-ge v7, v9, :cond_6

    .line 44
    .line 45
    iget v9, p1, Lp3;->b:I

    .line 46
    .line 47
    mul-int v10, v4, v7

    .line 48
    .line 49
    add-int/2addr v10, v9

    .line 50
    iget v9, p1, Lp3;->a:I

    .line 51
    .line 52
    invoke-virtual {p0, v10, v9}, Lq3;->n(II)I

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    iget v10, p1, Lp3;->a:I

    .line 57
    .line 58
    if-eq v10, v5, :cond_3

    .line 59
    .line 60
    if-eq v10, v6, :cond_2

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_2
    add-int/lit8 v11, v1, 0x1

    .line 64
    .line 65
    if-ne v9, v11, :cond_4

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    if-ne v9, v1, :cond_4

    .line 69
    .line 70
    :goto_2
    add-int/lit8 v8, v8, 0x1

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_4
    :goto_3
    invoke-virtual {p0, v10, v1, v8}, Lq3;->i(III)Lp3;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {p0, v1, v3}, Lq3;->f(Lp3;I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lnt1;->c(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    iget v1, p1, Lp3;->a:I

    .line 84
    .line 85
    if-ne v1, v6, :cond_5

    .line 86
    .line 87
    add-int/2addr v3, v8

    .line 88
    :cond_5
    move v8, v2

    .line 89
    move v1, v9

    .line 90
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_6
    invoke-virtual {v0, p1}, Lnt1;->c(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    if-lez v8, :cond_7

    .line 97
    .line 98
    iget p1, p1, Lp3;->a:I

    .line 99
    .line 100
    invoke-virtual {p0, p1, v1, v8}, Lq3;->i(III)Lp3;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p0, p1, v3}, Lq3;->f(Lp3;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p1}, Lnt1;->c(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    :cond_7
    return-void

    .line 111
    :cond_8
    const-string p0, "should not dispatch add or move for pre layout"

    .line 112
    .line 113
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public f(Lp3;I)V
    .locals 2

    .line 1
    iget-object p0, p0, Lq3;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ler0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ler0;->e(Lp3;)V

    .line 6
    .line 7
    .line 8
    iget v0, p1, Lp3;->a:I

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget p1, p1, Lp3;->c:I

    .line 17
    .line 18
    invoke-virtual {p0, p2, p1}, Ler0;->s(II)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p0, "only remove and update ops can be dispatched in first pass"

    .line 23
    .line 24
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    iget p1, p1, Lp3;->c:I

    .line 29
    .line 30
    iget-object p0, p0, Ler0;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    invoke-virtual {p0, p2, p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->Q(IIZ)V

    .line 36
    .line 37
    .line 38
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->U0:Z

    .line 39
    .line 40
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->R0:Ly12;

    .line 41
    .line 42
    iget p2, p0, Ly12;->c:I

    .line 43
    .line 44
    add-int/2addr p2, p1

    .line 45
    iput p2, p0, Ly12;->c:I

    .line 46
    .line 47
    return-void
.end method

.method public g(II)I
    .locals 5

    .line 1
    iget-object p0, p0, Lq3;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :goto_0
    if-ge p2, v0, :cond_6

    .line 10
    .line 11
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lp3;

    .line 16
    .line 17
    iget v2, v1, Lp3;->a:I

    .line 18
    .line 19
    iget v3, v1, Lp3;->b:I

    .line 20
    .line 21
    const/16 v4, 0x8

    .line 22
    .line 23
    if-ne v2, v4, :cond_2

    .line 24
    .line 25
    if-ne v3, p1, :cond_0

    .line 26
    .line 27
    iget p1, v1, Lp3;->c:I

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    if-ge v3, p1, :cond_1

    .line 31
    .line 32
    add-int/lit8 p1, p1, -0x1

    .line 33
    .line 34
    :cond_1
    iget v1, v1, Lp3;->c:I

    .line 35
    .line 36
    if-gt v1, p1, :cond_5

    .line 37
    .line 38
    add-int/lit8 p1, p1, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    if-gt v3, p1, :cond_5

    .line 42
    .line 43
    const/4 v4, 0x2

    .line 44
    if-ne v2, v4, :cond_4

    .line 45
    .line 46
    iget v1, v1, Lp3;->c:I

    .line 47
    .line 48
    add-int/2addr v3, v1

    .line 49
    if-ge p1, v3, :cond_3

    .line 50
    .line 51
    const/4 p0, -0x1

    .line 52
    return p0

    .line 53
    :cond_3
    sub-int/2addr p1, v1

    .line 54
    goto :goto_1

    .line 55
    :cond_4
    const/4 v3, 0x1

    .line 56
    if-ne v2, v3, :cond_5

    .line 57
    .line 58
    iget v1, v1, Lp3;->c:I

    .line 59
    .line 60
    add-int/2addr p1, v1

    .line 61
    :cond_5
    :goto_1
    add-int/lit8 p2, p2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_6
    return p1
.end method

.method public h()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lq3;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-lez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public i(III)Lp3;
    .locals 0

    .line 1
    iget-object p0, p0, Lq3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lnt1;

    .line 4
    .line 5
    invoke-virtual {p0}, Lnt1;->a()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lp3;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    new-instance p0, Lp3;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput p1, p0, Lp3;->a:I

    .line 19
    .line 20
    iput p2, p0, Lp3;->b:I

    .line 21
    .line 22
    iput p3, p0, Lp3;->c:I

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    iput p1, p0, Lp3;->a:I

    .line 26
    .line 27
    iput p2, p0, Lp3;->b:I

    .line 28
    .line 29
    iput p3, p0, Lp3;->c:I

    .line 30
    .line 31
    return-object p0
.end method

.method public j(Lp3;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lq3;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ler0;

    .line 4
    .line 5
    iget-object p0, p0, Lq3;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget p0, p1, Lp3;->a:I

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq p0, v1, :cond_3

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    if-eq p0, v2, :cond_2

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    if-eq p0, v1, :cond_1

    .line 22
    .line 23
    const/16 v1, 0x8

    .line 24
    .line 25
    if-ne p0, v1, :cond_0

    .line 26
    .line 27
    iget p0, p1, Lp3;->b:I

    .line 28
    .line 29
    iget p1, p1, Lp3;->c:I

    .line 30
    .line 31
    invoke-virtual {v0, p0, p1}, Ler0;->v(II)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    const-string p0, "Unknown update op type for "

    .line 36
    .line 37
    invoke-static {p1, p0}, Ls80;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    iget p0, p1, Lp3;->b:I

    .line 42
    .line 43
    iget p1, p1, Lp3;->c:I

    .line 44
    .line 45
    invoke-virtual {v0, p0, p1}, Ler0;->s(II)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    iget p0, p1, Lp3;->b:I

    .line 50
    .line 51
    iget p1, p1, Lp3;->c:I

    .line 52
    .line 53
    iget-object v0, v0, Ler0;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-virtual {v0, p0, p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->Q(IIZ)V

    .line 59
    .line 60
    .line 61
    iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->U0:Z

    .line 62
    .line 63
    return-void

    .line 64
    :cond_3
    iget p0, p1, Lp3;->b:I

    .line 65
    .line 66
    iget p1, p1, Lp3;->c:I

    .line 67
    .line 68
    invoke-virtual {v0, p0, p1}, Ler0;->u(II)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public k()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lq3;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lnt1;

    .line 6
    .line 7
    iget-object v2, v0, Lq3;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ler0;

    .line 10
    .line 11
    iget-object v3, v0, Lq3;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Ler0;

    .line 14
    .line 15
    iget-object v4, v0, Lq3;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    :cond_0
    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    const/4 v6, 0x1

    .line 27
    sub-int/2addr v5, v6

    .line 28
    const/4 v8, 0x0

    .line 29
    :goto_1
    const/16 v9, 0x8

    .line 30
    .line 31
    const/4 v10, -0x1

    .line 32
    if-ltz v5, :cond_3

    .line 33
    .line 34
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v11

    .line 38
    check-cast v11, Lp3;

    .line 39
    .line 40
    iget v11, v11, Lp3;->a:I

    .line 41
    .line 42
    if-ne v11, v9, :cond_1

    .line 43
    .line 44
    if-eqz v8, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    move v8, v6

    .line 48
    :cond_2
    add-int/lit8 v5, v5, -0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    move v5, v10

    .line 52
    :goto_2
    const/4 v8, 0x2

    .line 53
    const/4 v11, 0x4

    .line 54
    if-eq v5, v10, :cond_22

    .line 55
    .line 56
    add-int/lit8 v9, v5, 0x1

    .line 57
    .line 58
    iget-object v12, v3, Ler0;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v12, Lq3;

    .line 61
    .line 62
    iget-object v13, v12, Lq3;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v13, Lnt1;

    .line 65
    .line 66
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v14

    .line 70
    check-cast v14, Lp3;

    .line 71
    .line 72
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v15

    .line 76
    check-cast v15, Lp3;

    .line 77
    .line 78
    iget v7, v15, Lp3;->a:I

    .line 79
    .line 80
    if-eq v7, v6, :cond_1d

    .line 81
    .line 82
    if-eq v7, v8, :cond_b

    .line 83
    .line 84
    if-eq v7, v11, :cond_4

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    iget v7, v14, Lp3;->c:I

    .line 88
    .line 89
    iget v8, v15, Lp3;->b:I

    .line 90
    .line 91
    if-ge v7, v8, :cond_5

    .line 92
    .line 93
    add-int/lit8 v8, v8, -0x1

    .line 94
    .line 95
    iput v8, v15, Lp3;->b:I

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    iget v10, v15, Lp3;->c:I

    .line 99
    .line 100
    add-int/2addr v8, v10

    .line 101
    if-ge v7, v8, :cond_6

    .line 102
    .line 103
    add-int/lit8 v10, v10, -0x1

    .line 104
    .line 105
    iput v10, v15, Lp3;->c:I

    .line 106
    .line 107
    iget v7, v14, Lp3;->b:I

    .line 108
    .line 109
    invoke-virtual {v12, v11, v7, v6}, Lq3;->i(III)Lp3;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    goto :goto_4

    .line 114
    :cond_6
    :goto_3
    const/4 v6, 0x0

    .line 115
    :goto_4
    iget v7, v14, Lp3;->b:I

    .line 116
    .line 117
    iget v8, v15, Lp3;->b:I

    .line 118
    .line 119
    if-gt v7, v8, :cond_7

    .line 120
    .line 121
    add-int/lit8 v8, v8, 0x1

    .line 122
    .line 123
    iput v8, v15, Lp3;->b:I

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_7
    iget v10, v15, Lp3;->c:I

    .line 127
    .line 128
    add-int/2addr v8, v10

    .line 129
    if-ge v7, v8, :cond_8

    .line 130
    .line 131
    sub-int/2addr v8, v7

    .line 132
    add-int/lit8 v7, v7, 0x1

    .line 133
    .line 134
    invoke-virtual {v12, v11, v7, v8}, Lq3;->i(III)Lp3;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    iget v7, v15, Lp3;->c:I

    .line 139
    .line 140
    sub-int/2addr v7, v8

    .line 141
    iput v7, v15, Lp3;->c:I

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_8
    :goto_5
    const/4 v10, 0x0

    .line 145
    :goto_6
    invoke-virtual {v4, v9, v14}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    iget v7, v15, Lp3;->c:I

    .line 149
    .line 150
    if-lez v7, :cond_9

    .line 151
    .line 152
    invoke-virtual {v4, v5, v15}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    goto :goto_7

    .line 156
    :cond_9
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v13, v15}, Lnt1;->c(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    :goto_7
    if-eqz v6, :cond_a

    .line 163
    .line 164
    invoke-virtual {v4, v5, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_a
    if-eqz v10, :cond_0

    .line 168
    .line 169
    invoke-virtual {v4, v5, v10}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto/16 :goto_0

    .line 173
    .line 174
    :cond_b
    iget v7, v14, Lp3;->b:I

    .line 175
    .line 176
    iget v10, v14, Lp3;->c:I

    .line 177
    .line 178
    iget v11, v15, Lp3;->b:I

    .line 179
    .line 180
    if-ge v7, v10, :cond_d

    .line 181
    .line 182
    if-ne v11, v7, :cond_c

    .line 183
    .line 184
    iget v6, v15, Lp3;->c:I

    .line 185
    .line 186
    sub-int v7, v10, v7

    .line 187
    .line 188
    if-ne v6, v7, :cond_c

    .line 189
    .line 190
    const/4 v7, 0x1

    .line 191
    :goto_8
    const/16 v16, 0x0

    .line 192
    .line 193
    goto :goto_a

    .line 194
    :cond_c
    const/4 v7, 0x0

    .line 195
    goto :goto_8

    .line 196
    :cond_d
    add-int/lit8 v6, v10, 0x1

    .line 197
    .line 198
    if-ne v11, v6, :cond_e

    .line 199
    .line 200
    iget v6, v15, Lp3;->c:I

    .line 201
    .line 202
    sub-int/2addr v7, v10

    .line 203
    if-ne v6, v7, :cond_e

    .line 204
    .line 205
    const/4 v7, 0x1

    .line 206
    :goto_9
    const/16 v16, 0x1

    .line 207
    .line 208
    goto :goto_a

    .line 209
    :cond_e
    const/4 v7, 0x0

    .line 210
    goto :goto_9

    .line 211
    :goto_a
    if-ge v10, v11, :cond_f

    .line 212
    .line 213
    add-int/lit8 v11, v11, -0x1

    .line 214
    .line 215
    iput v11, v15, Lp3;->b:I

    .line 216
    .line 217
    goto :goto_b

    .line 218
    :cond_f
    iget v6, v15, Lp3;->c:I

    .line 219
    .line 220
    add-int/2addr v11, v6

    .line 221
    if-ge v10, v11, :cond_10

    .line 222
    .line 223
    add-int/lit8 v6, v6, -0x1

    .line 224
    .line 225
    iput v6, v15, Lp3;->c:I

    .line 226
    .line 227
    iput v8, v14, Lp3;->a:I

    .line 228
    .line 229
    const/4 v5, 0x1

    .line 230
    iput v5, v14, Lp3;->c:I

    .line 231
    .line 232
    iget v5, v15, Lp3;->c:I

    .line 233
    .line 234
    if-nez v5, :cond_0

    .line 235
    .line 236
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v13, v15}, Lnt1;->c(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    goto/16 :goto_0

    .line 243
    .line 244
    :cond_10
    :goto_b
    iget v6, v14, Lp3;->b:I

    .line 245
    .line 246
    iget v10, v15, Lp3;->b:I

    .line 247
    .line 248
    if-gt v6, v10, :cond_11

    .line 249
    .line 250
    add-int/lit8 v10, v10, 0x1

    .line 251
    .line 252
    iput v10, v15, Lp3;->b:I

    .line 253
    .line 254
    goto :goto_c

    .line 255
    :cond_11
    iget v11, v15, Lp3;->c:I

    .line 256
    .line 257
    add-int/2addr v10, v11

    .line 258
    if-ge v6, v10, :cond_12

    .line 259
    .line 260
    sub-int/2addr v10, v6

    .line 261
    add-int/lit8 v6, v6, 0x1

    .line 262
    .line 263
    invoke-virtual {v12, v8, v6, v10}, Lq3;->i(III)Lp3;

    .line 264
    .line 265
    .line 266
    move-result-object v10

    .line 267
    iget v6, v14, Lp3;->b:I

    .line 268
    .line 269
    iget v8, v15, Lp3;->b:I

    .line 270
    .line 271
    sub-int/2addr v6, v8

    .line 272
    iput v6, v15, Lp3;->c:I

    .line 273
    .line 274
    goto :goto_d

    .line 275
    :cond_12
    :goto_c
    const/4 v10, 0x0

    .line 276
    :goto_d
    if-eqz v7, :cond_13

    .line 277
    .line 278
    invoke-virtual {v4, v5, v15}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v13, v14}, Lnt1;->c(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    goto/16 :goto_0

    .line 288
    .line 289
    :cond_13
    if-eqz v16, :cond_17

    .line 290
    .line 291
    if-eqz v10, :cond_15

    .line 292
    .line 293
    iget v6, v14, Lp3;->b:I

    .line 294
    .line 295
    iget v7, v10, Lp3;->b:I

    .line 296
    .line 297
    if-le v6, v7, :cond_14

    .line 298
    .line 299
    iget v7, v10, Lp3;->c:I

    .line 300
    .line 301
    sub-int/2addr v6, v7

    .line 302
    iput v6, v14, Lp3;->b:I

    .line 303
    .line 304
    :cond_14
    iget v6, v14, Lp3;->c:I

    .line 305
    .line 306
    iget v7, v10, Lp3;->b:I

    .line 307
    .line 308
    if-le v6, v7, :cond_15

    .line 309
    .line 310
    iget v7, v10, Lp3;->c:I

    .line 311
    .line 312
    sub-int/2addr v6, v7

    .line 313
    iput v6, v14, Lp3;->c:I

    .line 314
    .line 315
    :cond_15
    iget v6, v14, Lp3;->b:I

    .line 316
    .line 317
    iget v7, v15, Lp3;->b:I

    .line 318
    .line 319
    if-le v6, v7, :cond_16

    .line 320
    .line 321
    iget v7, v15, Lp3;->c:I

    .line 322
    .line 323
    sub-int/2addr v6, v7

    .line 324
    iput v6, v14, Lp3;->b:I

    .line 325
    .line 326
    :cond_16
    iget v6, v14, Lp3;->c:I

    .line 327
    .line 328
    iget v7, v15, Lp3;->b:I

    .line 329
    .line 330
    if-le v6, v7, :cond_1b

    .line 331
    .line 332
    iget v7, v15, Lp3;->c:I

    .line 333
    .line 334
    sub-int/2addr v6, v7

    .line 335
    iput v6, v14, Lp3;->c:I

    .line 336
    .line 337
    goto :goto_e

    .line 338
    :cond_17
    if-eqz v10, :cond_19

    .line 339
    .line 340
    iget v6, v14, Lp3;->b:I

    .line 341
    .line 342
    iget v7, v10, Lp3;->b:I

    .line 343
    .line 344
    if-lt v6, v7, :cond_18

    .line 345
    .line 346
    iget v7, v10, Lp3;->c:I

    .line 347
    .line 348
    sub-int/2addr v6, v7

    .line 349
    iput v6, v14, Lp3;->b:I

    .line 350
    .line 351
    :cond_18
    iget v6, v14, Lp3;->c:I

    .line 352
    .line 353
    iget v7, v10, Lp3;->b:I

    .line 354
    .line 355
    if-lt v6, v7, :cond_19

    .line 356
    .line 357
    iget v7, v10, Lp3;->c:I

    .line 358
    .line 359
    sub-int/2addr v6, v7

    .line 360
    iput v6, v14, Lp3;->c:I

    .line 361
    .line 362
    :cond_19
    iget v6, v14, Lp3;->b:I

    .line 363
    .line 364
    iget v7, v15, Lp3;->b:I

    .line 365
    .line 366
    if-lt v6, v7, :cond_1a

    .line 367
    .line 368
    iget v7, v15, Lp3;->c:I

    .line 369
    .line 370
    sub-int/2addr v6, v7

    .line 371
    iput v6, v14, Lp3;->b:I

    .line 372
    .line 373
    :cond_1a
    iget v6, v14, Lp3;->c:I

    .line 374
    .line 375
    iget v7, v15, Lp3;->b:I

    .line 376
    .line 377
    if-lt v6, v7, :cond_1b

    .line 378
    .line 379
    iget v7, v15, Lp3;->c:I

    .line 380
    .line 381
    sub-int/2addr v6, v7

    .line 382
    iput v6, v14, Lp3;->c:I

    .line 383
    .line 384
    :cond_1b
    :goto_e
    invoke-virtual {v4, v5, v15}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    iget v6, v14, Lp3;->b:I

    .line 388
    .line 389
    iget v7, v14, Lp3;->c:I

    .line 390
    .line 391
    if-eq v6, v7, :cond_1c

    .line 392
    .line 393
    invoke-virtual {v4, v9, v14}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    goto :goto_f

    .line 397
    :cond_1c
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    :goto_f
    if-eqz v10, :cond_0

    .line 401
    .line 402
    invoke-virtual {v4, v5, v10}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    goto/16 :goto_0

    .line 406
    .line 407
    :cond_1d
    iget v6, v14, Lp3;->c:I

    .line 408
    .line 409
    iget v7, v15, Lp3;->b:I

    .line 410
    .line 411
    if-ge v6, v7, :cond_1e

    .line 412
    .line 413
    move/from16 v16, v10

    .line 414
    .line 415
    goto :goto_10

    .line 416
    :cond_1e
    const/16 v16, 0x0

    .line 417
    .line 418
    :goto_10
    iget v8, v14, Lp3;->b:I

    .line 419
    .line 420
    if-ge v8, v7, :cond_1f

    .line 421
    .line 422
    add-int/lit8 v16, v16, 0x1

    .line 423
    .line 424
    :cond_1f
    if-gt v7, v8, :cond_20

    .line 425
    .line 426
    iget v7, v15, Lp3;->c:I

    .line 427
    .line 428
    add-int/2addr v8, v7

    .line 429
    iput v8, v14, Lp3;->b:I

    .line 430
    .line 431
    :cond_20
    iget v7, v15, Lp3;->b:I

    .line 432
    .line 433
    if-gt v7, v6, :cond_21

    .line 434
    .line 435
    iget v8, v15, Lp3;->c:I

    .line 436
    .line 437
    add-int/2addr v6, v8

    .line 438
    iput v6, v14, Lp3;->c:I

    .line 439
    .line 440
    :cond_21
    add-int v7, v7, v16

    .line 441
    .line 442
    iput v7, v15, Lp3;->b:I

    .line 443
    .line 444
    invoke-virtual {v4, v5, v15}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v4, v9, v14}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    goto/16 :goto_0

    .line 451
    .line 452
    :cond_22
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    const/4 v5, 0x0

    .line 457
    :goto_11
    if-ge v5, v3, :cond_36

    .line 458
    .line 459
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v6

    .line 463
    check-cast v6, Lp3;

    .line 464
    .line 465
    iget v7, v6, Lp3;->a:I

    .line 466
    .line 467
    const/4 v12, 0x1

    .line 468
    if-eq v7, v12, :cond_35

    .line 469
    .line 470
    if-eq v7, v8, :cond_2c

    .line 471
    .line 472
    if-eq v7, v11, :cond_24

    .line 473
    .line 474
    if-eq v7, v9, :cond_23

    .line 475
    .line 476
    :goto_12
    const/16 v18, 0x1

    .line 477
    .line 478
    goto/16 :goto_1e

    .line 479
    .line 480
    :cond_23
    invoke-virtual {v0, v6}, Lq3;->j(Lp3;)V

    .line 481
    .line 482
    .line 483
    goto :goto_12

    .line 484
    :cond_24
    iget v7, v6, Lp3;->b:I

    .line 485
    .line 486
    iget v12, v6, Lp3;->c:I

    .line 487
    .line 488
    add-int/2addr v12, v7

    .line 489
    move v13, v7

    .line 490
    move v15, v10

    .line 491
    const/4 v14, 0x0

    .line 492
    :goto_13
    if-ge v7, v12, :cond_29

    .line 493
    .line 494
    invoke-virtual {v2, v7}, Ler0;->g(I)Landroidx/recyclerview/widget/o;

    .line 495
    .line 496
    .line 497
    move-result-object v17

    .line 498
    if-nez v17, :cond_27

    .line 499
    .line 500
    invoke-virtual {v0, v7}, Lq3;->a(I)Z

    .line 501
    .line 502
    .line 503
    move-result v17

    .line 504
    if-eqz v17, :cond_25

    .line 505
    .line 506
    goto :goto_15

    .line 507
    :cond_25
    const/4 v9, 0x1

    .line 508
    if-ne v15, v9, :cond_26

    .line 509
    .line 510
    invoke-virtual {v0, v11, v13, v14}, Lq3;->i(III)Lp3;

    .line 511
    .line 512
    .line 513
    move-result-object v9

    .line 514
    invoke-virtual {v0, v9}, Lq3;->j(Lp3;)V

    .line 515
    .line 516
    .line 517
    move v13, v7

    .line 518
    const/4 v14, 0x0

    .line 519
    :cond_26
    const/4 v15, 0x0

    .line 520
    :goto_14
    const/16 v18, 0x1

    .line 521
    .line 522
    goto :goto_16

    .line 523
    :cond_27
    :goto_15
    if-nez v15, :cond_28

    .line 524
    .line 525
    invoke-virtual {v0, v11, v13, v14}, Lq3;->i(III)Lp3;

    .line 526
    .line 527
    .line 528
    move-result-object v9

    .line 529
    invoke-virtual {v0, v9}, Lq3;->e(Lp3;)V

    .line 530
    .line 531
    .line 532
    move v13, v7

    .line 533
    const/4 v14, 0x0

    .line 534
    :cond_28
    const/4 v15, 0x1

    .line 535
    goto :goto_14

    .line 536
    :goto_16
    add-int/lit8 v14, v14, 0x1

    .line 537
    .line 538
    add-int/lit8 v7, v7, 0x1

    .line 539
    .line 540
    const/16 v9, 0x8

    .line 541
    .line 542
    goto :goto_13

    .line 543
    :cond_29
    iget v7, v6, Lp3;->c:I

    .line 544
    .line 545
    if-eq v14, v7, :cond_2a

    .line 546
    .line 547
    invoke-virtual {v1, v6}, Lnt1;->c(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0, v11, v13, v14}, Lq3;->i(III)Lp3;

    .line 551
    .line 552
    .line 553
    move-result-object v6

    .line 554
    :cond_2a
    if-nez v15, :cond_2b

    .line 555
    .line 556
    invoke-virtual {v0, v6}, Lq3;->e(Lp3;)V

    .line 557
    .line 558
    .line 559
    goto :goto_12

    .line 560
    :cond_2b
    invoke-virtual {v0, v6}, Lq3;->j(Lp3;)V

    .line 561
    .line 562
    .line 563
    goto :goto_12

    .line 564
    :cond_2c
    iget v7, v6, Lp3;->b:I

    .line 565
    .line 566
    iget v9, v6, Lp3;->c:I

    .line 567
    .line 568
    add-int/2addr v9, v7

    .line 569
    move v12, v7

    .line 570
    move v14, v10

    .line 571
    const/4 v13, 0x0

    .line 572
    :goto_17
    if-ge v12, v9, :cond_32

    .line 573
    .line 574
    invoke-virtual {v2, v12}, Ler0;->g(I)Landroidx/recyclerview/widget/o;

    .line 575
    .line 576
    .line 577
    move-result-object v15

    .line 578
    if-nez v15, :cond_2f

    .line 579
    .line 580
    invoke-virtual {v0, v12}, Lq3;->a(I)Z

    .line 581
    .line 582
    .line 583
    move-result v15

    .line 584
    if-eqz v15, :cond_2d

    .line 585
    .line 586
    goto :goto_19

    .line 587
    :cond_2d
    const/4 v15, 0x1

    .line 588
    if-ne v14, v15, :cond_2e

    .line 589
    .line 590
    invoke-virtual {v0, v8, v7, v13}, Lq3;->i(III)Lp3;

    .line 591
    .line 592
    .line 593
    move-result-object v14

    .line 594
    invoke-virtual {v0, v14}, Lq3;->j(Lp3;)V

    .line 595
    .line 596
    .line 597
    const/4 v14, 0x1

    .line 598
    goto :goto_18

    .line 599
    :cond_2e
    const/4 v14, 0x0

    .line 600
    :goto_18
    const/4 v15, 0x0

    .line 601
    goto :goto_1b

    .line 602
    :cond_2f
    :goto_19
    if-nez v14, :cond_30

    .line 603
    .line 604
    invoke-virtual {v0, v8, v7, v13}, Lq3;->i(III)Lp3;

    .line 605
    .line 606
    .line 607
    move-result-object v14

    .line 608
    invoke-virtual {v0, v14}, Lq3;->e(Lp3;)V

    .line 609
    .line 610
    .line 611
    const/4 v14, 0x1

    .line 612
    goto :goto_1a

    .line 613
    :cond_30
    const/4 v14, 0x0

    .line 614
    :goto_1a
    const/4 v15, 0x1

    .line 615
    :goto_1b
    if-eqz v14, :cond_31

    .line 616
    .line 617
    sub-int/2addr v12, v13

    .line 618
    sub-int/2addr v9, v13

    .line 619
    const/4 v13, 0x1

    .line 620
    :goto_1c
    const/16 v18, 0x1

    .line 621
    .line 622
    goto :goto_1d

    .line 623
    :cond_31
    add-int/lit8 v13, v13, 0x1

    .line 624
    .line 625
    goto :goto_1c

    .line 626
    :goto_1d
    add-int/lit8 v12, v12, 0x1

    .line 627
    .line 628
    move v14, v15

    .line 629
    goto :goto_17

    .line 630
    :cond_32
    const/16 v18, 0x1

    .line 631
    .line 632
    iget v9, v6, Lp3;->c:I

    .line 633
    .line 634
    if-eq v13, v9, :cond_33

    .line 635
    .line 636
    invoke-virtual {v1, v6}, Lnt1;->c(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    invoke-virtual {v0, v8, v7, v13}, Lq3;->i(III)Lp3;

    .line 640
    .line 641
    .line 642
    move-result-object v6

    .line 643
    :cond_33
    if-nez v14, :cond_34

    .line 644
    .line 645
    invoke-virtual {v0, v6}, Lq3;->e(Lp3;)V

    .line 646
    .line 647
    .line 648
    goto :goto_1e

    .line 649
    :cond_34
    invoke-virtual {v0, v6}, Lq3;->j(Lp3;)V

    .line 650
    .line 651
    .line 652
    goto :goto_1e

    .line 653
    :cond_35
    move/from16 v18, v12

    .line 654
    .line 655
    invoke-virtual {v0, v6}, Lq3;->j(Lp3;)V

    .line 656
    .line 657
    .line 658
    :goto_1e
    add-int/lit8 v5, v5, 0x1

    .line 659
    .line 660
    const/16 v9, 0x8

    .line 661
    .line 662
    goto/16 :goto_11

    .line 663
    .line 664
    :cond_36
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 665
    .line 666
    .line 667
    return-void
.end method

.method public l(Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Lp3;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, Lq3;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Lnt1;

    .line 20
    .line 21
    invoke-virtual {v3, v2}, Lnt1;->c(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public m(Landroid/widget/TextView;)V
    .locals 9

    .line 1
    new-instance v0, Lfd1;

    .line 2
    .line 3
    invoke-direct {v0}, Lfd1;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lfd1;

    .line 7
    .line 8
    invoke-direct {v1}, Lfd1;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lq3;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ltc2;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Lfd1;->setShapeAppearanceModel(Ltc2;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lfd1;->setShapeAppearanceModel(Ltc2;)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lq3;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Landroid/content/res/ColorStateList;

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Lfd1;->n(Landroid/content/res/ColorStateList;)V

    .line 26
    .line 27
    .line 28
    iget v2, p0, Lq3;->a:I

    .line 29
    .line 30
    int-to-float v2, v2

    .line 31
    iget-object v3, p0, Lq3;->e:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Landroid/content/res/ColorStateList;

    .line 34
    .line 35
    iget-object v4, v0, Lfd1;->a:Led1;

    .line 36
    .line 37
    iput v2, v4, Led1;->j:F

    .line 38
    .line 39
    invoke-virtual {v0}, Lfd1;->invalidateSelf()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v3}, Lfd1;->s(Landroid/content/res/ColorStateList;)V

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, Lq3;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Landroid/content/res/ColorStateList;

    .line 48
    .line 49
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 50
    .line 51
    .line 52
    new-instance v4, Landroid/graphics/drawable/RippleDrawable;

    .line 53
    .line 54
    const/16 v3, 0x1e

    .line 55
    .line 56
    invoke-virtual {v2, v3}, Landroid/content/res/ColorStateList;->withAlpha(I)Landroid/content/res/ColorStateList;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-direct {v4, v2, v0, v1}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 61
    .line 62
    .line 63
    new-instance v3, Landroid/graphics/drawable/InsetDrawable;

    .line 64
    .line 65
    iget-object p0, p0, Lq3;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, Landroid/graphics/Rect;

    .line 68
    .line 69
    iget v5, p0, Landroid/graphics/Rect;->left:I

    .line 70
    .line 71
    iget v6, p0, Landroid/graphics/Rect;->top:I

    .line 72
    .line 73
    iget v7, p0, Landroid/graphics/Rect;->right:I

    .line 74
    .line 75
    iget v8, p0, Landroid/graphics/Rect;->bottom:I

    .line 76
    .line 77
    invoke-direct/range {v3 .. v8}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 78
    .line 79
    .line 80
    sget-object p0, Le33;->a:Ljava/util/WeakHashMap;

    .line 81
    .line 82
    invoke-virtual {p1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public n(II)I
    .locals 9

    .line 1
    iget-object v0, p0, Lq3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnt1;

    .line 4
    .line 5
    iget-object p0, p0, Lq3;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    sub-int/2addr v1, v2

    .line 15
    :goto_0
    const/16 v3, 0x8

    .line 16
    .line 17
    if-ltz v1, :cond_d

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Lp3;

    .line 24
    .line 25
    iget v5, v4, Lp3;->a:I

    .line 26
    .line 27
    iget v6, v4, Lp3;->b:I

    .line 28
    .line 29
    const/4 v7, 0x2

    .line 30
    if-ne v5, v3, :cond_8

    .line 31
    .line 32
    iget v3, v4, Lp3;->c:I

    .line 33
    .line 34
    if-ge v6, v3, :cond_0

    .line 35
    .line 36
    move v8, v3

    .line 37
    move v5, v6

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    move v5, v3

    .line 40
    move v8, v6

    .line 41
    :goto_1
    if-lt p1, v5, :cond_6

    .line 42
    .line 43
    if-gt p1, v8, :cond_6

    .line 44
    .line 45
    if-ne v5, v6, :cond_3

    .line 46
    .line 47
    if-ne p2, v2, :cond_1

    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    iput v3, v4, Lp3;->c:I

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    if-ne p2, v7, :cond_2

    .line 55
    .line 56
    add-int/lit8 v3, v3, -0x1

    .line 57
    .line 58
    iput v3, v4, Lp3;->c:I

    .line 59
    .line 60
    :cond_2
    :goto_2
    add-int/lit8 p1, p1, 0x1

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_3
    if-ne p2, v2, :cond_4

    .line 64
    .line 65
    add-int/lit8 v6, v6, 0x1

    .line 66
    .line 67
    iput v6, v4, Lp3;->b:I

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    if-ne p2, v7, :cond_5

    .line 71
    .line 72
    add-int/lit8 v6, v6, -0x1

    .line 73
    .line 74
    iput v6, v4, Lp3;->b:I

    .line 75
    .line 76
    :cond_5
    :goto_3
    add-int/lit8 p1, p1, -0x1

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_6
    if-ge p1, v6, :cond_c

    .line 80
    .line 81
    if-ne p2, v2, :cond_7

    .line 82
    .line 83
    add-int/lit8 v6, v6, 0x1

    .line 84
    .line 85
    iput v6, v4, Lp3;->b:I

    .line 86
    .line 87
    add-int/lit8 v3, v3, 0x1

    .line 88
    .line 89
    iput v3, v4, Lp3;->c:I

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_7
    if-ne p2, v7, :cond_c

    .line 93
    .line 94
    add-int/lit8 v6, v6, -0x1

    .line 95
    .line 96
    iput v6, v4, Lp3;->b:I

    .line 97
    .line 98
    add-int/lit8 v3, v3, -0x1

    .line 99
    .line 100
    iput v3, v4, Lp3;->c:I

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_8
    if-gt v6, p1, :cond_a

    .line 104
    .line 105
    if-ne v5, v2, :cond_9

    .line 106
    .line 107
    iget v3, v4, Lp3;->c:I

    .line 108
    .line 109
    sub-int/2addr p1, v3

    .line 110
    goto :goto_4

    .line 111
    :cond_9
    if-ne v5, v7, :cond_c

    .line 112
    .line 113
    iget v3, v4, Lp3;->c:I

    .line 114
    .line 115
    add-int/2addr p1, v3

    .line 116
    goto :goto_4

    .line 117
    :cond_a
    if-ne p2, v2, :cond_b

    .line 118
    .line 119
    add-int/lit8 v6, v6, 0x1

    .line 120
    .line 121
    iput v6, v4, Lp3;->b:I

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_b
    if-ne p2, v7, :cond_c

    .line 125
    .line 126
    add-int/lit8 v6, v6, -0x1

    .line 127
    .line 128
    iput v6, v4, Lp3;->b:I

    .line 129
    .line 130
    :cond_c
    :goto_4
    add-int/lit8 v1, v1, -0x1

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_d
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    sub-int/2addr p2, v2

    .line 138
    :goto_5
    if-ltz p2, :cond_11

    .line 139
    .line 140
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    check-cast v1, Lp3;

    .line 145
    .line 146
    iget v2, v1, Lp3;->a:I

    .line 147
    .line 148
    iget v4, v1, Lp3;->c:I

    .line 149
    .line 150
    if-ne v2, v3, :cond_f

    .line 151
    .line 152
    iget v2, v1, Lp3;->b:I

    .line 153
    .line 154
    if-eq v4, v2, :cond_e

    .line 155
    .line 156
    if-gez v4, :cond_10

    .line 157
    .line 158
    :cond_e
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v1}, Lnt1;->c(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_6

    .line 165
    :cond_f
    if-gtz v4, :cond_10

    .line 166
    .line 167
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v1}, Lnt1;->c(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    :cond_10
    :goto_6
    add-int/lit8 p2, p2, -0x1

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_11
    return p1
.end method

.class public Landroidx/recyclerview/widget/d;
.super Lx12;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final i:Landroid/view/animation/LinearInterpolator;

.field public final j:Landroid/view/animation/DecelerateInterpolator;

.field public k:Landroid/graphics/PointF;

.field public final l:Landroid/util/DisplayMetrics;

.field public m:Z

.field public n:F

.field public o:I

.field public p:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lx12;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/recyclerview/widget/d;->i:Landroid/view/animation/LinearInterpolator;

    .line 10
    .line 11
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/recyclerview/widget/d;->j:Landroid/view/animation/DecelerateInterpolator;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Landroidx/recyclerview/widget/d;->m:Z

    .line 20
    .line 21
    iput v0, p0, Landroidx/recyclerview/widget/d;->o:I

    .line 22
    .line 23
    iput v0, p0, Landroidx/recyclerview/widget/d;->p:I

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Landroidx/recyclerview/widget/d;->l:Landroid/util/DisplayMetrics;

    .line 34
    .line 35
    return-void
.end method

.method public static e(IIIII)I
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p4, v0, :cond_4

    .line 3
    .line 4
    if-eqz p4, :cond_1

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    if-ne p4, p0, :cond_0

    .line 8
    .line 9
    sub-int/2addr p3, p1

    .line 10
    return p3

    .line 11
    :cond_0
    const-string p0, "snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_"

    .line 12
    .line 13
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    sub-int/2addr p2, p0

    .line 19
    if-lez p2, :cond_2

    .line 20
    .line 21
    return p2

    .line 22
    :cond_2
    sub-int/2addr p3, p1

    .line 23
    if-gez p3, :cond_3

    .line 24
    .line 25
    return p3

    .line 26
    :cond_3
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_4
    sub-int/2addr p2, p0

    .line 29
    return p2
.end method


# virtual methods
.method public c(Landroid/view/View;Lv12;)V
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/d;->k:Landroid/graphics/PointF;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 10
    .line 11
    cmpl-float v0, v0, v4

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    if-lez v0, :cond_1

    .line 17
    .line 18
    move v0, v2

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move v0, v1

    .line 21
    goto :goto_1

    .line 22
    :cond_2
    :goto_0
    move v0, v3

    .line 23
    :goto_1
    iget-object v5, p0, Lx12;->c:Landroidx/recyclerview/widget/k;

    .line 24
    .line 25
    if-eqz v5, :cond_4

    .line 26
    .line 27
    invoke-virtual {v5}, Landroidx/recyclerview/widget/k;->o()Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-nez v6, :cond_3

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 39
    .line 40
    invoke-static {p1}, Landroidx/recyclerview/widget/k;->K(Landroid/view/View;)I

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    iget v8, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 45
    .line 46
    sub-int/2addr v7, v8

    .line 47
    invoke-static {p1}, Landroidx/recyclerview/widget/k;->L(Landroid/view/View;)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 52
    .line 53
    add-int/2addr v8, v6

    .line 54
    invoke-virtual {v5}, Landroidx/recyclerview/widget/k;->getPaddingLeft()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    iget v9, v5, Landroidx/recyclerview/widget/k;->Y:I

    .line 59
    .line 60
    invoke-virtual {v5}, Landroidx/recyclerview/widget/k;->getPaddingRight()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    sub-int/2addr v9, v5

    .line 65
    invoke-static {v7, v8, v6, v9, v0}, Landroidx/recyclerview/widget/d;->e(IIIII)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    :goto_2
    move v0, v3

    .line 71
    :goto_3
    iget-object v5, p0, Landroidx/recyclerview/widget/d;->k:Landroid/graphics/PointF;

    .line 72
    .line 73
    if-eqz v5, :cond_6

    .line 74
    .line 75
    iget v5, v5, Landroid/graphics/PointF;->y:F

    .line 76
    .line 77
    cmpl-float v4, v5, v4

    .line 78
    .line 79
    if-nez v4, :cond_5

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_5
    if-lez v4, :cond_7

    .line 83
    .line 84
    move v1, v2

    .line 85
    goto :goto_5

    .line 86
    :cond_6
    :goto_4
    move v1, v3

    .line 87
    :cond_7
    :goto_5
    iget-object v4, p0, Lx12;->c:Landroidx/recyclerview/widget/k;

    .line 88
    .line 89
    if-eqz v4, :cond_9

    .line 90
    .line 91
    invoke-virtual {v4}, Landroidx/recyclerview/widget/k;->p()Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-nez v5, :cond_8

    .line 96
    .line 97
    goto :goto_6

    .line 98
    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 103
    .line 104
    invoke-static {p1}, Landroidx/recyclerview/widget/k;->M(Landroid/view/View;)I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    iget v6, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 109
    .line 110
    sub-int/2addr v5, v6

    .line 111
    invoke-static {p1}, Landroidx/recyclerview/widget/k;->J(Landroid/view/View;)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 116
    .line 117
    add-int/2addr p1, v3

    .line 118
    invoke-virtual {v4}, Landroidx/recyclerview/widget/k;->getPaddingTop()I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    iget v6, v4, Landroidx/recyclerview/widget/k;->Z:I

    .line 123
    .line 124
    invoke-virtual {v4}, Landroidx/recyclerview/widget/k;->getPaddingBottom()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    sub-int/2addr v6, v4

    .line 129
    invoke-static {v5, p1, v3, v6, v1}, Landroidx/recyclerview/widget/d;->e(IIIII)I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    :cond_9
    :goto_6
    mul-int p1, v0, v0

    .line 134
    .line 135
    mul-int v1, v3, v3

    .line 136
    .line 137
    add-int/2addr v1, p1

    .line 138
    int-to-double v4, v1

    .line 139
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 140
    .line 141
    .line 142
    move-result-wide v4

    .line 143
    double-to-int p1, v4

    .line 144
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/d;->g(I)I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    int-to-double v4, p1

    .line 149
    const-wide v6, 0x3fd57a786c22680aL    # 0.3356

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    div-double/2addr v4, v6

    .line 155
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 156
    .line 157
    .line 158
    move-result-wide v4

    .line 159
    double-to-int p1, v4

    .line 160
    if-lez p1, :cond_a

    .line 161
    .line 162
    neg-int v0, v0

    .line 163
    neg-int v1, v3

    .line 164
    iput v0, p2, Lv12;->a:I

    .line 165
    .line 166
    iput v1, p2, Lv12;->b:I

    .line 167
    .line 168
    iput p1, p2, Lv12;->c:I

    .line 169
    .line 170
    iget-object p0, p0, Landroidx/recyclerview/widget/d;->j:Landroid/view/animation/DecelerateInterpolator;

    .line 171
    .line 172
    iput-object p0, p2, Lv12;->e:Landroid/view/animation/Interpolator;

    .line 173
    .line 174
    iput-boolean v2, p2, Lv12;->f:Z

    .line 175
    .line 176
    :cond_a
    return-void
.end method

.method public f(Landroid/util/DisplayMetrics;)F
    .locals 0

    .line 1
    iget p0, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 2
    .line 3
    int-to-float p0, p0

    .line 4
    const/high16 p1, 0x41c80000    # 25.0f

    .line 5
    .line 6
    div-float/2addr p1, p0

    .line 7
    return p1
.end method

.method public g(I)I
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iget-boolean v0, p0, Landroidx/recyclerview/widget/d;->m:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/recyclerview/widget/d;->l:Landroid/util/DisplayMetrics;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/d;->f(Landroid/util/DisplayMetrics;)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Landroidx/recyclerview/widget/d;->n:F

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Landroidx/recyclerview/widget/d;->m:Z

    .line 20
    .line 21
    :cond_0
    iget p0, p0, Landroidx/recyclerview/widget/d;->n:F

    .line 22
    .line 23
    mul-float/2addr p1, p0

    .line 24
    float-to-double p0, p1

    .line 25
    invoke-static {p0, p1}, Ljava/lang/Math;->ceil(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide p0

    .line 29
    double-to-int p0, p0

    .line 30
    return p0
.end method

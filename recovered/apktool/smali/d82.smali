.class public final Ld82;
.super Lr12;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Lg43;

.field public final b:Landroidx/viewpager2/widget/ViewPager2;

.field public final c:Lm43;

.field public final d:Landroidx/recyclerview/widget/LinearLayoutManager;

.field public e:I

.field public f:I

.field public final g:Lc82;

.field public h:I

.field public i:I

.field public j:Z

.field public k:Z

.field public l:Z


# direct methods
.method public constructor <init>(Landroidx/viewpager2/widget/ViewPager2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld82;->b:Landroidx/viewpager2/widget/ViewPager2;

    .line 5
    .line 6
    iget-object p1, p1, Landroidx/viewpager2/widget/ViewPager2;->U:Lm43;

    .line 7
    .line 8
    iput-object p1, p0, Ld82;->c:Lm43;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/k;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 15
    .line 16
    iput-object p1, p0, Ld82;->d:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 17
    .line 18
    new-instance p1, Lc82;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Ld82;->g:Lc82;

    .line 24
    .line 25
    invoke-virtual {p0}, Ld82;->d()V

    .line 26
    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 6

    .line 1
    iget p1, p0, Ld82;->e:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    const/4 v1, 0x1

    .line 5
    if-ne p1, v1, :cond_0

    .line 6
    .line 7
    iget v2, p0, Ld82;->f:I

    .line 8
    .line 9
    if-eq v2, v1, :cond_3

    .line 10
    .line 11
    :cond_0
    if-ne p2, v1, :cond_3

    .line 12
    .line 13
    iput v1, p0, Ld82;->e:I

    .line 14
    .line 15
    iget p1, p0, Ld82;->i:I

    .line 16
    .line 17
    if-eq p1, v0, :cond_1

    .line 18
    .line 19
    iput p1, p0, Ld82;->h:I

    .line 20
    .line 21
    iput v0, p0, Ld82;->i:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget p1, p0, Ld82;->h:I

    .line 25
    .line 26
    if-ne p1, v0, :cond_2

    .line 27
    .line 28
    iget-object p1, p0, Ld82;->d:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->V0()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iput p1, p0, Ld82;->h:I

    .line 35
    .line 36
    :cond_2
    :goto_0
    invoke-virtual {p0, v1}, Ld82;->c(I)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_3
    const/4 v2, 0x4

    .line 41
    const/4 v3, 0x2

    .line 42
    if-eq p1, v1, :cond_4

    .line 43
    .line 44
    if-ne p1, v2, :cond_5

    .line 45
    .line 46
    :cond_4
    if-ne p2, v3, :cond_5

    .line 47
    .line 48
    iget-boolean p1, p0, Ld82;->k:Z

    .line 49
    .line 50
    if-eqz p1, :cond_c

    .line 51
    .line 52
    invoke-virtual {p0, v3}, Ld82;->c(I)V

    .line 53
    .line 54
    .line 55
    iput-boolean v1, p0, Ld82;->j:Z

    .line 56
    .line 57
    return-void

    .line 58
    :cond_5
    iget-object v4, p0, Ld82;->g:Lc82;

    .line 59
    .line 60
    const/4 v5, 0x0

    .line 61
    if-eq p1, v1, :cond_6

    .line 62
    .line 63
    if-ne p1, v2, :cond_9

    .line 64
    .line 65
    :cond_6
    if-nez p2, :cond_9

    .line 66
    .line 67
    invoke-virtual {p0}, Ld82;->e()V

    .line 68
    .line 69
    .line 70
    iget-boolean p1, p0, Ld82;->k:Z

    .line 71
    .line 72
    if-nez p1, :cond_7

    .line 73
    .line 74
    iget p1, v4, Lc82;->a:I

    .line 75
    .line 76
    if-eq p1, v0, :cond_8

    .line 77
    .line 78
    iget-object v1, p0, Ld82;->a:Lg43;

    .line 79
    .line 80
    if-eqz v1, :cond_8

    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    invoke-virtual {v1, p1, v2, v5}, Lg43;->b(IFI)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_7
    iget p1, v4, Lc82;->c:I

    .line 88
    .line 89
    if-nez p1, :cond_9

    .line 90
    .line 91
    iget p1, p0, Ld82;->h:I

    .line 92
    .line 93
    iget v1, v4, Lc82;->a:I

    .line 94
    .line 95
    if-eq p1, v1, :cond_8

    .line 96
    .line 97
    iget-object p1, p0, Ld82;->a:Lg43;

    .line 98
    .line 99
    if-eqz p1, :cond_8

    .line 100
    .line 101
    invoke-virtual {p1, v1}, Lg43;->c(I)V

    .line 102
    .line 103
    .line 104
    :cond_8
    :goto_1
    invoke-virtual {p0, v5}, Ld82;->c(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Ld82;->d()V

    .line 108
    .line 109
    .line 110
    :cond_9
    iget p1, p0, Ld82;->e:I

    .line 111
    .line 112
    if-ne p1, v3, :cond_c

    .line 113
    .line 114
    if-nez p2, :cond_c

    .line 115
    .line 116
    iget-boolean p1, p0, Ld82;->l:Z

    .line 117
    .line 118
    if-eqz p1, :cond_c

    .line 119
    .line 120
    invoke-virtual {p0}, Ld82;->e()V

    .line 121
    .line 122
    .line 123
    iget p1, v4, Lc82;->c:I

    .line 124
    .line 125
    if-nez p1, :cond_c

    .line 126
    .line 127
    iget p1, p0, Ld82;->i:I

    .line 128
    .line 129
    iget p2, v4, Lc82;->a:I

    .line 130
    .line 131
    if-eq p1, p2, :cond_b

    .line 132
    .line 133
    if-ne p2, v0, :cond_a

    .line 134
    .line 135
    move p2, v5

    .line 136
    :cond_a
    iget-object p1, p0, Ld82;->a:Lg43;

    .line 137
    .line 138
    if-eqz p1, :cond_b

    .line 139
    .line 140
    invoke-virtual {p1, p2}, Lg43;->c(I)V

    .line 141
    .line 142
    .line 143
    :cond_b
    invoke-virtual {p0, v5}, Ld82;->c(I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Ld82;->d()V

    .line 147
    .line 148
    .line 149
    :cond_c
    return-void
.end method

.method public final b(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 5

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Ld82;->k:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Ld82;->e()V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Ld82;->j:Z

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    iget-object v2, p0, Ld82;->g:Lc82;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v0, :cond_4

    .line 14
    .line 15
    iput-boolean v3, p0, Ld82;->j:Z

    .line 16
    .line 17
    if-gtz p3, :cond_2

    .line 18
    .line 19
    if-nez p3, :cond_3

    .line 20
    .line 21
    if-gez p2, :cond_0

    .line 22
    .line 23
    move p2, p1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move p2, v3

    .line 26
    :goto_0
    iget-object p3, p0, Ld82;->b:Landroidx/viewpager2/widget/ViewPager2;

    .line 27
    .line 28
    iget-object p3, p3, Landroidx/viewpager2/widget/ViewPager2;->i:Li43;

    .line 29
    .line 30
    invoke-virtual {p3}, Landroidx/recyclerview/widget/k;->N()I

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    if-ne p3, p1, :cond_1

    .line 35
    .line 36
    move p3, p1

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move p3, v3

    .line 39
    :goto_1
    if-ne p2, p3, :cond_3

    .line 40
    .line 41
    :cond_2
    iget p2, v2, Lc82;->c:I

    .line 42
    .line 43
    if-eqz p2, :cond_3

    .line 44
    .line 45
    iget p2, v2, Lc82;->a:I

    .line 46
    .line 47
    add-int/2addr p2, p1

    .line 48
    goto :goto_2

    .line 49
    :cond_3
    iget p2, v2, Lc82;->a:I

    .line 50
    .line 51
    :goto_2
    iput p2, p0, Ld82;->i:I

    .line 52
    .line 53
    iget p3, p0, Ld82;->h:I

    .line 54
    .line 55
    if-eq p3, p2, :cond_6

    .line 56
    .line 57
    iget-object p3, p0, Ld82;->a:Lg43;

    .line 58
    .line 59
    if-eqz p3, :cond_6

    .line 60
    .line 61
    invoke-virtual {p3, p2}, Lg43;->c(I)V

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    iget p2, p0, Ld82;->e:I

    .line 66
    .line 67
    if-nez p2, :cond_6

    .line 68
    .line 69
    iget p2, v2, Lc82;->a:I

    .line 70
    .line 71
    if-ne p2, v1, :cond_5

    .line 72
    .line 73
    move p2, v3

    .line 74
    :cond_5
    iget-object p3, p0, Ld82;->a:Lg43;

    .line 75
    .line 76
    if-eqz p3, :cond_6

    .line 77
    .line 78
    invoke-virtual {p3, p2}, Lg43;->c(I)V

    .line 79
    .line 80
    .line 81
    :cond_6
    :goto_3
    iget p2, v2, Lc82;->a:I

    .line 82
    .line 83
    if-ne p2, v1, :cond_7

    .line 84
    .line 85
    move p2, v3

    .line 86
    :cond_7
    iget p3, v2, Lc82;->b:F

    .line 87
    .line 88
    iget v0, v2, Lc82;->c:I

    .line 89
    .line 90
    iget-object v4, p0, Ld82;->a:Lg43;

    .line 91
    .line 92
    if-eqz v4, :cond_8

    .line 93
    .line 94
    invoke-virtual {v4, p2, p3, v0}, Lg43;->b(IFI)V

    .line 95
    .line 96
    .line 97
    :cond_8
    iget p2, v2, Lc82;->a:I

    .line 98
    .line 99
    iget p3, p0, Ld82;->i:I

    .line 100
    .line 101
    if-eq p2, p3, :cond_9

    .line 102
    .line 103
    if-ne p3, v1, :cond_a

    .line 104
    .line 105
    :cond_9
    iget p2, v2, Lc82;->c:I

    .line 106
    .line 107
    if-nez p2, :cond_a

    .line 108
    .line 109
    iget p2, p0, Ld82;->f:I

    .line 110
    .line 111
    if-eq p2, p1, :cond_a

    .line 112
    .line 113
    invoke-virtual {p0, v3}, Ld82;->c(I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Ld82;->d()V

    .line 117
    .line 118
    .line 119
    :cond_a
    return-void
.end method

.method public final c(I)V
    .locals 2

    .line 1
    iget v0, p0, Ld82;->e:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget v0, p0, Ld82;->f:I

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget v0, p0, Ld82;->f:I

    .line 12
    .line 13
    if-ne v0, p1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iput p1, p0, Ld82;->f:I

    .line 17
    .line 18
    iget-object p0, p0, Ld82;->a:Lg43;

    .line 19
    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lg43;->a(I)V

    .line 23
    .line 24
    .line 25
    :cond_2
    :goto_0
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ld82;->e:I

    .line 3
    .line 4
    iput v0, p0, Ld82;->f:I

    .line 5
    .line 6
    iget-object v1, p0, Ld82;->g:Lc82;

    .line 7
    .line 8
    const/4 v2, -0x1

    .line 9
    iput v2, v1, Lc82;->a:I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    iput v3, v1, Lc82;->b:F

    .line 13
    .line 14
    iput v0, v1, Lc82;->c:I

    .line 15
    .line 16
    iput v2, p0, Ld82;->h:I

    .line 17
    .line 18
    iput v2, p0, Ld82;->i:I

    .line 19
    .line 20
    iput-boolean v0, p0, Ld82;->j:Z

    .line 21
    .line 22
    iput-boolean v0, p0, Ld82;->k:Z

    .line 23
    .line 24
    iput-boolean v0, p0, Ld82;->l:Z

    .line 25
    .line 26
    return-void
.end method

.method public final e()V
    .locals 12

    .line 1
    iget-object v0, p0, Ld82;->d:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->V0()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, Ld82;->g:Lc82;

    .line 8
    .line 9
    iput v1, v2, Lc82;->a:I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, -0x1

    .line 14
    if-ne v1, v5, :cond_0

    .line 15
    .line 16
    iput v5, v2, Lc82;->a:I

    .line 17
    .line 18
    iput v4, v2, Lc82;->b:F

    .line 19
    .line 20
    iput v3, v2, Lc82;->c:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->B(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    iput v5, v2, Lc82;->a:I

    .line 30
    .line 31
    iput v4, v2, Lc82;->b:F

    .line 32
    .line 33
    iput v3, v2, Lc82;->c:I

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 41
    .line 42
    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 43
    .line 44
    iget v5, v5, Landroid/graphics/Rect;->left:I

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 51
    .line 52
    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 53
    .line 54
    iget v6, v6, Landroid/graphics/Rect;->right:I

    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 61
    .line 62
    iget-object v7, v7, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 63
    .line 64
    iget v7, v7, Landroid/graphics/Rect;->top:I

    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    check-cast v8, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 71
    .line 72
    iget-object v8, v8, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 73
    .line 74
    iget v8, v8, Landroid/graphics/Rect;->bottom:I

    .line 75
    .line 76
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    instance-of v10, v9, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 81
    .line 82
    if-eqz v10, :cond_2

    .line 83
    .line 84
    check-cast v9, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 85
    .line 86
    iget v10, v9, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 87
    .line 88
    add-int/2addr v5, v10

    .line 89
    iget v10, v9, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 90
    .line 91
    add-int/2addr v6, v10

    .line 92
    iget v10, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 93
    .line 94
    add-int/2addr v7, v10

    .line 95
    iget v9, v9, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 96
    .line 97
    add-int/2addr v8, v9

    .line 98
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    add-int/2addr v9, v7

    .line 103
    add-int/2addr v9, v8

    .line 104
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    add-int/2addr v8, v5

    .line 109
    add-int/2addr v8, v6

    .line 110
    iget v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->a0:I

    .line 111
    .line 112
    const/4 v10, 0x1

    .line 113
    iget-object v11, p0, Ld82;->c:Lm43;

    .line 114
    .line 115
    if-nez v6, :cond_4

    .line 116
    .line 117
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    sub-int/2addr v1, v5

    .line 122
    invoke-virtual {v11}, Landroid/view/View;->getPaddingLeft()I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    sub-int/2addr v1, v5

    .line 127
    iget-object p0, p0, Ld82;->b:Landroidx/viewpager2/widget/ViewPager2;

    .line 128
    .line 129
    iget-object p0, p0, Landroidx/viewpager2/widget/ViewPager2;->i:Li43;

    .line 130
    .line 131
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->N()I

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    if-ne p0, v10, :cond_3

    .line 136
    .line 137
    neg-int v1, v1

    .line 138
    :cond_3
    move v9, v8

    .line 139
    goto :goto_0

    .line 140
    :cond_4
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    sub-int/2addr p0, v7

    .line 145
    invoke-virtual {v11}, Landroid/view/View;->getPaddingTop()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    sub-int v1, p0, v1

    .line 150
    .line 151
    :goto_0
    neg-int p0, v1

    .line 152
    iput p0, v2, Lc82;->c:I

    .line 153
    .line 154
    if-gez p0, :cond_12

    .line 155
    .line 156
    new-instance p0, Lr8;

    .line 157
    .line 158
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k;->G()I

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-nez p0, :cond_5

    .line 163
    .line 164
    goto/16 :goto_9

    .line 165
    .line 166
    :cond_5
    iget v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->a0:I

    .line 167
    .line 168
    if-nez v1, :cond_6

    .line 169
    .line 170
    move v1, v10

    .line 171
    goto :goto_1

    .line 172
    :cond_6
    move v1, v3

    .line 173
    :goto_1
    const/4 v4, 0x2

    .line 174
    new-array v5, v4, [I

    .line 175
    .line 176
    aput v4, v5, v10

    .line 177
    .line 178
    aput p0, v5, v3

    .line 179
    .line 180
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 181
    .line 182
    invoke-static {v4, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    check-cast v4, [[I

    .line 187
    .line 188
    move v5, v3

    .line 189
    :goto_2
    if-ge v5, p0, :cond_b

    .line 190
    .line 191
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    if-eqz v6, :cond_a

    .line 196
    .line 197
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    instance-of v8, v7, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 202
    .line 203
    if-eqz v8, :cond_7

    .line 204
    .line 205
    check-cast v7, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_7
    sget-object v7, Lr8;->a:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 209
    .line 210
    :goto_3
    aget-object v8, v4, v5

    .line 211
    .line 212
    if-eqz v1, :cond_8

    .line 213
    .line 214
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    .line 215
    .line 216
    .line 217
    move-result v9

    .line 218
    iget v11, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 219
    .line 220
    :goto_4
    sub-int/2addr v9, v11

    .line 221
    goto :goto_5

    .line 222
    :cond_8
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    .line 223
    .line 224
    .line 225
    move-result v9

    .line 226
    iget v11, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :goto_5
    aput v9, v8, v3

    .line 230
    .line 231
    aget-object v8, v4, v5

    .line 232
    .line 233
    if-eqz v1, :cond_9

    .line 234
    .line 235
    invoke-virtual {v6}, Landroid/view/View;->getRight()I

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 240
    .line 241
    :goto_6
    add-int/2addr v6, v7

    .line 242
    goto :goto_7

    .line 243
    :cond_9
    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 248
    .line 249
    goto :goto_6

    .line 250
    :goto_7
    aput v6, v8, v10

    .line 251
    .line 252
    add-int/lit8 v5, v5, 0x1

    .line 253
    .line 254
    goto :goto_2

    .line 255
    :cond_a
    const-string p0, "null view contained in the view hierarchy"

    .line 256
    .line 257
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    return-void

    .line 261
    :cond_b
    new-instance v1, Lwa3;

    .line 262
    .line 263
    invoke-direct {v1, v10}, Lwa3;-><init>(I)V

    .line 264
    .line 265
    .line 266
    invoke-static {v4, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 267
    .line 268
    .line 269
    move v1, v10

    .line 270
    :goto_8
    if-ge v1, p0, :cond_d

    .line 271
    .line 272
    add-int/lit8 v5, v1, -0x1

    .line 273
    .line 274
    aget-object v5, v4, v5

    .line 275
    .line 276
    aget v5, v5, v10

    .line 277
    .line 278
    aget-object v6, v4, v1

    .line 279
    .line 280
    aget v6, v6, v3

    .line 281
    .line 282
    if-eq v5, v6, :cond_c

    .line 283
    .line 284
    goto :goto_a

    .line 285
    :cond_c
    add-int/lit8 v1, v1, 0x1

    .line 286
    .line 287
    goto :goto_8

    .line 288
    :cond_d
    aget-object v1, v4, v3

    .line 289
    .line 290
    aget v5, v1, v10

    .line 291
    .line 292
    aget v1, v1, v3

    .line 293
    .line 294
    sub-int/2addr v5, v1

    .line 295
    if-gtz v1, :cond_f

    .line 296
    .line 297
    sub-int/2addr p0, v10

    .line 298
    aget-object p0, v4, p0

    .line 299
    .line 300
    aget p0, p0, v10

    .line 301
    .line 302
    if-ge p0, v5, :cond_e

    .line 303
    .line 304
    goto :goto_a

    .line 305
    :cond_e
    :goto_9
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k;->G()I

    .line 306
    .line 307
    .line 308
    move-result p0

    .line 309
    if-gt p0, v10, :cond_11

    .line 310
    .line 311
    :cond_f
    :goto_a
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k;->G()I

    .line 312
    .line 313
    .line 314
    move-result p0

    .line 315
    :goto_b
    if-ge v3, p0, :cond_11

    .line 316
    .line 317
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-static {v1}, Lr8;->a(Landroid/view/View;)Z

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    if-nez v1, :cond_10

    .line 326
    .line 327
    add-int/lit8 v3, v3, 0x1

    .line 328
    .line 329
    goto :goto_b

    .line 330
    :cond_10
    const-string p0, "Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."

    .line 331
    .line 332
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    return-void

    .line 336
    :cond_11
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 337
    .line 338
    iget p0, v2, Lc82;->c:I

    .line 339
    .line 340
    const-string v0, "Page can only be offset by a positive amount, not by "

    .line 341
    .line 342
    invoke-static {p0, v0}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    return-void

    .line 350
    :cond_12
    if-nez v9, :cond_13

    .line 351
    .line 352
    goto :goto_c

    .line 353
    :cond_13
    int-to-float p0, p0

    .line 354
    int-to-float v0, v9

    .line 355
    div-float v4, p0, v0

    .line 356
    .line 357
    :goto_c
    iput v4, v2, Lc82;->b:F

    .line 358
    .line 359
    return-void
.end method

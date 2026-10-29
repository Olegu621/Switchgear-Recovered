.class public Lcom/google/android/flexbox/FlexboxLayoutManager;
.super Landroidx/recyclerview/widget/k;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkj0;
.implements Lw12;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;,
        Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;
    }
.end annotation


# static fields
.field public static final y0:Landroid/graphics/Rect;


# instance fields
.field public a0:I

.field public final b0:I

.field public final c0:I

.field public final d0:I

.field public e0:Z

.field public f0:Z

.field public g0:Ljava/util/List;

.field public final h0:Lcom/google/android/flexbox/b;

.field public i0:Landroidx/recyclerview/widget/l;

.field public j0:Ly12;

.field public k0:Lnj0;

.field public final l0:Lmj0;

.field public m0:Lpc0;

.field public n0:Lpc0;

.field public o0:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

.field public p0:I

.field public q0:I

.field public r0:I

.field public s0:I

.field public final t0:Landroid/util/SparseArray;

.field public final u0:Landroid/content/Context;

.field public v0:Landroid/view/View;

.field public w0:I

.field public final x0:Ln7;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->y0:Landroid/graphics/Rect;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/k;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->d0:I

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 13
    .line 14
    new-instance v1, Lcom/google/android/flexbox/b;

    .line 15
    .line 16
    invoke-direct {v1, p0}, Lcom/google/android/flexbox/b;-><init>(Lkj0;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h0:Lcom/google/android/flexbox/b;

    .line 20
    .line 21
    new-instance v1, Lmj0;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Lmj0;-><init>(Lcom/google/android/flexbox/FlexboxLayoutManager;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l0:Lmj0;

    .line 27
    .line 28
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p0:I

    .line 29
    .line 30
    const/high16 v2, -0x80000000

    .line 31
    .line 32
    iput v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q0:I

    .line 33
    .line 34
    iput v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r0:I

    .line 35
    .line 36
    iput v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->s0:I

    .line 37
    .line 38
    new-instance v2, Landroid/util/SparseArray;

    .line 39
    .line 40
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t0:Landroid/util/SparseArray;

    .line 44
    .line 45
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w0:I

    .line 46
    .line 47
    new-instance v0, Ln7;

    .line 48
    .line 49
    const/4 v2, 0x3

    .line 50
    invoke-direct {v0, v2}, Ln7;-><init>(I)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x0:Ln7;

    .line 54
    .line 55
    invoke-static {p1, p2, p3, p4}, Landroidx/recyclerview/widget/k;->P(Landroid/content/Context;Landroid/util/AttributeSet;II)Lo12;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    iget p3, p2, Lo12;->a:I

    .line 60
    .line 61
    const/4 p4, 0x0

    .line 62
    const/4 v0, 0x1

    .line 63
    if-eqz p3, :cond_2

    .line 64
    .line 65
    if-eq p3, v0, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-boolean p2, p2, Lo12;->c:Z

    .line 69
    .line 70
    if-eqz p2, :cond_1

    .line 71
    .line 72
    invoke-virtual {p0, v2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1(I)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    const/4 p2, 0x2

    .line 77
    invoke-virtual {p0, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1(I)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    iget-boolean p2, p2, Lo12;->c:Z

    .line 82
    .line 83
    if-eqz p2, :cond_3

    .line 84
    .line 85
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1(I)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    invoke-virtual {p0, p4}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1(I)V

    .line 90
    .line 91
    .line 92
    :goto_0
    iget p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->b0:I

    .line 93
    .line 94
    if-eq p2, v0, :cond_5

    .line 95
    .line 96
    if-eqz p2, :cond_4

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->r0()V

    .line 100
    .line 101
    .line 102
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 105
    .line 106
    .line 107
    invoke-static {v1}, Lmj0;->b(Lmj0;)V

    .line 108
    .line 109
    .line 110
    iput p4, v1, Lmj0;->d:I

    .line 111
    .line 112
    :goto_1
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->b0:I

    .line 113
    .line 114
    const/4 p2, 0x0

    .line 115
    iput-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 116
    .line 117
    iput-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n0:Lpc0;

    .line 118
    .line 119
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->w0()V

    .line 120
    .line 121
    .line 122
    :cond_5
    iget p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->c0:I

    .line 123
    .line 124
    const/4 p3, 0x4

    .line 125
    if-eq p2, p3, :cond_6

    .line 126
    .line 127
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->r0()V

    .line 128
    .line 129
    .line 130
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 133
    .line 134
    .line 135
    invoke-static {v1}, Lmj0;->b(Lmj0;)V

    .line 136
    .line 137
    .line 138
    iput p4, v1, Lmj0;->d:I

    .line 139
    .line 140
    iput p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->c0:I

    .line 141
    .line 142
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->w0()V

    .line 143
    .line 144
    .line 145
    :cond_6
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u0:Landroid/content/Context;

    .line 146
    .line 147
    return-void
.end method

.method public static T(III)Z
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v1, 0x0

    .line 10
    if-lez p2, :cond_0

    .line 11
    .line 12
    if-eq p0, p2, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    const/high16 p2, -0x80000000

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq v0, p2, :cond_4

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    const/high16 p2, 0x40000000    # 2.0f

    .line 23
    .line 24
    if-eq v0, p2, :cond_1

    .line 25
    .line 26
    return v1

    .line 27
    :cond_1
    if-ne p1, p0, :cond_2

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    return v1

    .line 31
    :cond_3
    return v2

    .line 32
    :cond_4
    if-lt p1, p0, :cond_5

    .line 33
    .line 34
    return v2

    .line 35
    :cond_5
    return v1
.end method


# virtual methods
.method public final C()Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .locals 1

    .line 1
    new-instance p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;

    .line 2
    .line 3
    const/4 v0, -0x2

    .line 4
    invoke-direct {p0, v0, v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->e:F

    .line 9
    .line 10
    const/high16 v0, 0x3f800000    # 1.0f

    .line 11
    .line 12
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->f:F

    .line 13
    .line 14
    const/4 v0, -0x1

    .line 15
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->i:I

    .line 16
    .line 17
    const/high16 v0, -0x40800000    # -1.0f

    .line 18
    .line 19
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->v:F

    .line 20
    .line 21
    const v0, 0xffffff

    .line 22
    .line 23
    .line 24
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->V:I

    .line 25
    .line 26
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->W:I

    .line 27
    .line 28
    return-object p0
.end method

.method public final D(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .locals 0

    .line 1
    new-instance p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final I0(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/recyclerview/widget/d;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/d;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput p2, v0, Lx12;->a:I

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/k;->J0(Landroidx/recyclerview/widget/d;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final L0(Ly12;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->G()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, Ly12;->b()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->O0()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Q0(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->S0(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p1}, Ly12;->b()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lpc0;->b(Landroid/view/View;)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lpc0;->e(Landroid/view/View;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    sub-int/2addr p1, v0

    .line 47
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 48
    .line 49
    invoke-virtual {p0}, Lpc0;->l()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    return p0

    .line 58
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 59
    return p0
.end method

.method public final M0(Ly12;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->G()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, Ly12;->b()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Q0(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->S0(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1}, Ly12;->b()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_3

    .line 25
    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-static {v1}, Landroidx/recyclerview/widget/k;->O(Landroid/view/View;)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-static {v0}, Landroidx/recyclerview/widget/k;->O(Landroid/view/View;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 40
    .line 41
    invoke-virtual {v3, v0}, Lpc0;->b(Landroid/view/View;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 46
    .line 47
    invoke-virtual {v3, v1}, Lpc0;->e(Landroid/view/View;)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    sub-int/2addr v0, v3

    .line 52
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h0:Lcom/google/android/flexbox/b;

    .line 57
    .line 58
    iget-object v3, v3, Lcom/google/android/flexbox/b;->c:[I

    .line 59
    .line 60
    aget p1, v3, p1

    .line 61
    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    const/4 v4, -0x1

    .line 65
    if-ne p1, v4, :cond_2

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    aget v2, v3, v2

    .line 69
    .line 70
    sub-int/2addr v2, p1

    .line 71
    add-int/lit8 v2, v2, 0x1

    .line 72
    .line 73
    int-to-float v0, v0

    .line 74
    int-to-float v2, v2

    .line 75
    div-float/2addr v0, v2

    .line 76
    int-to-float p1, p1

    .line 77
    mul-float/2addr p1, v0

    .line 78
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 79
    .line 80
    invoke-virtual {v0}, Lpc0;->k()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 85
    .line 86
    invoke-virtual {p0, v1}, Lpc0;->e(Landroid/view/View;)I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    sub-int/2addr v0, p0

    .line 91
    int-to-float p0, v0

    .line 92
    add-float/2addr p1, p0

    .line 93
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    return p0

    .line 98
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 99
    return p0
.end method

.method public final N0(Ly12;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->G()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    invoke-virtual {p1}, Ly12;->b()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Q0(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->S0(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1}, Ly12;->b()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_4

    .line 26
    .line 27
    if-eqz v2, :cond_4

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->G()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {p0, v1, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->U0(II)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const/4 v3, -0x1

    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    move v1, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static {v1}, Landroidx/recyclerview/widget/k;->O(Landroid/view/View;)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->G()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    add-int/lit8 v4, v4, -0x1

    .line 54
    .line 55
    invoke-virtual {p0, v4, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->U0(II)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    if-nez v4, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {v4}, Landroidx/recyclerview/widget/k;->O(Landroid/view/View;)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    :goto_1
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 67
    .line 68
    invoke-virtual {v4, v0}, Lpc0;->b(Landroid/view/View;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 73
    .line 74
    invoke-virtual {p0, v2}, Lpc0;->e(Landroid/view/View;)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    sub-int/2addr v0, p0

    .line 79
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    sub-int/2addr v3, v1

    .line 84
    add-int/lit8 v3, v3, 0x1

    .line 85
    .line 86
    int-to-float p0, p0

    .line 87
    int-to-float v0, v3

    .line 88
    div-float/2addr p0, v0

    .line 89
    invoke-virtual {p1}, Ly12;->b()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    int-to-float p1, p1

    .line 94
    mul-float/2addr p0, p1

    .line 95
    float-to-int p0, p0

    .line 96
    return p0

    .line 97
    :cond_4
    :goto_2
    return v1
.end method

.method public final O0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->b0:I

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    new-instance v0, Landroidx/recyclerview/widget/e;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Lpc0;-><init>(Landroidx/recyclerview/widget/k;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 22
    .line 23
    new-instance v0, Landroidx/recyclerview/widget/f;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lpc0;-><init>(Landroidx/recyclerview/widget/k;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n0:Lpc0;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    new-instance v0, Landroidx/recyclerview/widget/f;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Lpc0;-><init>(Landroidx/recyclerview/widget/k;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 37
    .line 38
    new-instance v0, Landroidx/recyclerview/widget/e;

    .line 39
    .line 40
    invoke-direct {v0, p0}, Lpc0;-><init>(Landroidx/recyclerview/widget/k;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n0:Lpc0;

    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    if-nez v1, :cond_3

    .line 47
    .line 48
    new-instance v0, Landroidx/recyclerview/widget/f;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lpc0;-><init>(Landroidx/recyclerview/widget/k;)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 54
    .line 55
    new-instance v0, Landroidx/recyclerview/widget/e;

    .line 56
    .line 57
    invoke-direct {v0, p0}, Lpc0;-><init>(Landroidx/recyclerview/widget/k;)V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n0:Lpc0;

    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    new-instance v0, Landroidx/recyclerview/widget/e;

    .line 64
    .line 65
    invoke-direct {v0, p0}, Lpc0;-><init>(Landroidx/recyclerview/widget/k;)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 69
    .line 70
    new-instance v0, Landroidx/recyclerview/widget/f;

    .line 71
    .line 72
    invoke-direct {v0, p0}, Lpc0;-><init>(Landroidx/recyclerview/widget/k;)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n0:Lpc0;

    .line 76
    .line 77
    return-void
.end method

.method public final P0(Landroidx/recyclerview/widget/l;Ly12;Lnj0;)I
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget v3, v2, Lnj0;->f:I

    .line 8
    .line 9
    const/high16 v4, -0x80000000

    .line 10
    .line 11
    if-eq v3, v4, :cond_1

    .line 12
    .line 13
    iget v5, v2, Lnj0;->a:I

    .line 14
    .line 15
    if-gez v5, :cond_0

    .line 16
    .line 17
    add-int/2addr v3, v5

    .line 18
    iput v3, v2, Lnj0;->f:I

    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0, v1, v2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->a1(Landroidx/recyclerview/widget/l;Lnj0;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget v3, v2, Lnj0;->a:I

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    move v7, v3

    .line 30
    const/4 v8, 0x0

    .line 31
    :goto_0
    if-gtz v7, :cond_3

    .line 32
    .line 33
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 34
    .line 35
    iget-boolean v9, v9, Lnj0;->b:Z

    .line 36
    .line 37
    if-eqz v9, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move/from16 v23, v3

    .line 41
    .line 42
    goto/16 :goto_d

    .line 43
    .line 44
    :cond_3
    :goto_1
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 45
    .line 46
    iget v10, v2, Lnj0;->d:I

    .line 47
    .line 48
    if-ltz v10, :cond_2

    .line 49
    .line 50
    invoke-virtual/range {p2 .. p2}, Ly12;->b()I

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    if-ge v10, v11, :cond_2

    .line 55
    .line 56
    iget v10, v2, Lnj0;->c:I

    .line 57
    .line 58
    if-ltz v10, :cond_2

    .line 59
    .line 60
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    if-ge v10, v9, :cond_2

    .line 65
    .line 66
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 67
    .line 68
    iget v10, v2, Lnj0;->c:I

    .line 69
    .line 70
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    move-object v12, v9

    .line 75
    check-cast v12, Lcom/google/android/flexbox/a;

    .line 76
    .line 77
    iget v9, v12, Lcom/google/android/flexbox/a;->o:I

    .line 78
    .line 79
    iput v9, v2, Lnj0;->d:I

    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    const/4 v10, -0x1

    .line 86
    const/16 v18, 0x20

    .line 87
    .line 88
    iget-object v11, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l0:Lmj0;

    .line 89
    .line 90
    sget-object v15, Lcom/google/android/flexbox/FlexboxLayoutManager;->y0:Landroid/graphics/Rect;

    .line 91
    .line 92
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h0:Lcom/google/android/flexbox/b;

    .line 93
    .line 94
    if-eqz v9, :cond_a

    .line 95
    .line 96
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k;->getPaddingLeft()I

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k;->getPaddingRight()I

    .line 101
    .line 102
    .line 103
    move-result v16

    .line 104
    iget v6, v0, Landroidx/recyclerview/widget/k;->Y:I

    .line 105
    .line 106
    iget v13, v2, Lnj0;->e:I

    .line 107
    .line 108
    iget v14, v2, Lnj0;->h:I

    .line 109
    .line 110
    if-ne v14, v10, :cond_4

    .line 111
    .line 112
    iget v14, v12, Lcom/google/android/flexbox/a;->g:I

    .line 113
    .line 114
    sub-int/2addr v13, v14

    .line 115
    :cond_4
    move/from16 v21, v13

    .line 116
    .line 117
    iget v13, v2, Lnj0;->d:I

    .line 118
    .line 119
    int-to-float v9, v9

    .line 120
    sub-int v6, v6, v16

    .line 121
    .line 122
    int-to-float v6, v6

    .line 123
    iget v11, v11, Lmj0;->d:I

    .line 124
    .line 125
    int-to-float v11, v11

    .line 126
    sub-float/2addr v9, v11

    .line 127
    sub-float/2addr v6, v11

    .line 128
    const/4 v11, 0x0

    .line 129
    invoke-static {v11, v11}, Ljava/lang/Math;->max(FF)F

    .line 130
    .line 131
    .line 132
    move-result v20

    .line 133
    iget v11, v12, Lcom/google/android/flexbox/a;->h:I

    .line 134
    .line 135
    move v14, v13

    .line 136
    const/16 v22, 0x0

    .line 137
    .line 138
    :goto_2
    add-int v10, v13, v11

    .line 139
    .line 140
    if-ge v14, v10, :cond_9

    .line 141
    .line 142
    move v10, v11

    .line 143
    invoke-virtual {v0, v14}, Lcom/google/android/flexbox/FlexboxLayoutManager;->g(I)Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    if-nez v11, :cond_5

    .line 148
    .line 149
    move/from16 v23, v3

    .line 150
    .line 151
    move/from16 v24, v5

    .line 152
    .line 153
    move/from16 v26, v10

    .line 154
    .line 155
    move/from16 v17, v13

    .line 156
    .line 157
    move v5, v14

    .line 158
    move-object/from16 v30, v15

    .line 159
    .line 160
    const/4 v3, -0x1

    .line 161
    goto/16 :goto_5

    .line 162
    .line 163
    :cond_5
    move/from16 v23, v3

    .line 164
    .line 165
    iget v3, v2, Lnj0;->h:I

    .line 166
    .line 167
    move/from16 v24, v5

    .line 168
    .line 169
    const/4 v5, 0x1

    .line 170
    if-ne v3, v5, :cond_6

    .line 171
    .line 172
    invoke-virtual {v0, v15, v11}, Landroidx/recyclerview/widget/k;->n(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 173
    .line 174
    .line 175
    const/4 v3, -0x1

    .line 176
    const/4 v5, 0x0

    .line 177
    invoke-virtual {v0, v3, v11, v5}, Landroidx/recyclerview/widget/k;->l(ILandroid/view/View;Z)V

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_6
    const/4 v3, -0x1

    .line 182
    const/4 v5, 0x0

    .line 183
    invoke-virtual {v0, v15, v11}, Landroidx/recyclerview/widget/k;->n(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 184
    .line 185
    .line 186
    move/from16 v3, v22

    .line 187
    .line 188
    invoke-virtual {v0, v3, v11, v5}, Landroidx/recyclerview/widget/k;->l(ILandroid/view/View;Z)V

    .line 189
    .line 190
    .line 191
    add-int/lit8 v22, v3, 0x1

    .line 192
    .line 193
    :goto_3
    iget-object v3, v4, Lcom/google/android/flexbox/b;->d:[J

    .line 194
    .line 195
    move/from16 v25, v6

    .line 196
    .line 197
    aget-wide v5, v3, v14

    .line 198
    .line 199
    long-to-int v3, v5

    .line 200
    shr-long v5, v5, v18

    .line 201
    .line 202
    long-to-int v5, v5

    .line 203
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    check-cast v6, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;

    .line 208
    .line 209
    invoke-virtual {v0, v11, v3, v5, v6}, Lcom/google/android/flexbox/FlexboxLayoutManager;->c1(Landroid/view/View;IILcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;)Z

    .line 210
    .line 211
    .line 212
    move-result v26

    .line 213
    if-eqz v26, :cond_7

    .line 214
    .line 215
    invoke-virtual {v11, v3, v5}, Landroid/view/View;->measure(II)V

    .line 216
    .line 217
    .line 218
    :cond_7
    iget v3, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 219
    .line 220
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 225
    .line 226
    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 227
    .line 228
    iget v5, v5, Landroid/graphics/Rect;->left:I

    .line 229
    .line 230
    add-int/2addr v3, v5

    .line 231
    int-to-float v3, v3

    .line 232
    add-float/2addr v9, v3

    .line 233
    iget v3, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 234
    .line 235
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 240
    .line 241
    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 242
    .line 243
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 244
    .line 245
    add-int/2addr v3, v5

    .line 246
    int-to-float v3, v3

    .line 247
    sub-float v3, v25, v3

    .line 248
    .line 249
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 254
    .line 255
    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 256
    .line 257
    iget v5, v5, Landroid/graphics/Rect;->top:I

    .line 258
    .line 259
    add-int v5, v21, v5

    .line 260
    .line 261
    move/from16 v25, v3

    .line 262
    .line 263
    iget-boolean v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 264
    .line 265
    move/from16 v26, v10

    .line 266
    .line 267
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h0:Lcom/google/android/flexbox/b;

    .line 268
    .line 269
    if-eqz v3, :cond_8

    .line 270
    .line 271
    invoke-static/range {v25 .. v25}, Ljava/lang/Math;->round(F)I

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 276
    .line 277
    .line 278
    move-result v27

    .line 279
    sub-int v3, v3, v27

    .line 280
    .line 281
    move-object/from16 v27, v15

    .line 282
    .line 283
    invoke-static/range {v25 .. v25}, Ljava/lang/Math;->round(F)I

    .line 284
    .line 285
    .line 286
    move-result v15

    .line 287
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 288
    .line 289
    .line 290
    move-result v28

    .line 291
    add-int v28, v28, v5

    .line 292
    .line 293
    move/from16 v16, v14

    .line 294
    .line 295
    move v14, v5

    .line 296
    move/from16 v5, v16

    .line 297
    .line 298
    move/from16 v17, v13

    .line 299
    .line 300
    move-object/from16 v30, v27

    .line 301
    .line 302
    move/from16 v16, v28

    .line 303
    .line 304
    move v13, v3

    .line 305
    const/4 v3, -0x1

    .line 306
    invoke-virtual/range {v10 .. v16}, Lcom/google/android/flexbox/b;->o(Landroid/view/View;Lcom/google/android/flexbox/a;IIII)V

    .line 307
    .line 308
    .line 309
    goto :goto_4

    .line 310
    :cond_8
    move v3, v14

    .line 311
    move v14, v5

    .line 312
    move v5, v3

    .line 313
    move/from16 v17, v13

    .line 314
    .line 315
    move-object/from16 v30, v15

    .line 316
    .line 317
    const/4 v3, -0x1

    .line 318
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 319
    .line 320
    .line 321
    move-result v13

    .line 322
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 323
    .line 324
    .line 325
    move-result v15

    .line 326
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 327
    .line 328
    .line 329
    move-result v16

    .line 330
    add-int v15, v16, v15

    .line 331
    .line 332
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 333
    .line 334
    .line 335
    move-result v16

    .line 336
    add-int v16, v16, v14

    .line 337
    .line 338
    invoke-virtual/range {v10 .. v16}, Lcom/google/android/flexbox/b;->o(Landroid/view/View;Lcom/google/android/flexbox/a;IIII)V

    .line 339
    .line 340
    .line 341
    :goto_4
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 342
    .line 343
    .line 344
    move-result v10

    .line 345
    iget v13, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 346
    .line 347
    add-int/2addr v10, v13

    .line 348
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 349
    .line 350
    .line 351
    move-result-object v13

    .line 352
    check-cast v13, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 353
    .line 354
    iget-object v13, v13, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 355
    .line 356
    iget v13, v13, Landroid/graphics/Rect;->right:I

    .line 357
    .line 358
    add-int/2addr v10, v13

    .line 359
    int-to-float v10, v10

    .line 360
    add-float v10, v10, v20

    .line 361
    .line 362
    add-float/2addr v10, v9

    .line 363
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 364
    .line 365
    .line 366
    move-result v9

    .line 367
    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 368
    .line 369
    add-int/2addr v9, v6

    .line 370
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 371
    .line 372
    .line 373
    move-result-object v6

    .line 374
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 375
    .line 376
    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 377
    .line 378
    iget v6, v6, Landroid/graphics/Rect;->left:I

    .line 379
    .line 380
    add-int/2addr v9, v6

    .line 381
    int-to-float v6, v9

    .line 382
    add-float v6, v6, v20

    .line 383
    .line 384
    sub-float v6, v25, v6

    .line 385
    .line 386
    move v9, v10

    .line 387
    :goto_5
    add-int/lit8 v14, v5, 0x1

    .line 388
    .line 389
    move/from16 v13, v17

    .line 390
    .line 391
    move/from16 v3, v23

    .line 392
    .line 393
    move/from16 v5, v24

    .line 394
    .line 395
    move/from16 v11, v26

    .line 396
    .line 397
    move-object/from16 v15, v30

    .line 398
    .line 399
    goto/16 :goto_2

    .line 400
    .line 401
    :cond_9
    move/from16 v23, v3

    .line 402
    .line 403
    move/from16 v24, v5

    .line 404
    .line 405
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 406
    .line 407
    iget v3, v3, Lnj0;->h:I

    .line 408
    .line 409
    iget v4, v2, Lnj0;->c:I

    .line 410
    .line 411
    add-int/2addr v4, v3

    .line 412
    iput v4, v2, Lnj0;->c:I

    .line 413
    .line 414
    iget v3, v12, Lcom/google/android/flexbox/a;->g:I

    .line 415
    .line 416
    move/from16 v19, v7

    .line 417
    .line 418
    goto/16 :goto_b

    .line 419
    .line 420
    :cond_a
    move/from16 v23, v3

    .line 421
    .line 422
    move/from16 v24, v5

    .line 423
    .line 424
    move v3, v10

    .line 425
    move-object/from16 v30, v15

    .line 426
    .line 427
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k;->getPaddingTop()I

    .line 428
    .line 429
    .line 430
    move-result v5

    .line 431
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k;->getPaddingBottom()I

    .line 432
    .line 433
    .line 434
    move-result v6

    .line 435
    iget v9, v0, Landroidx/recyclerview/widget/k;->Z:I

    .line 436
    .line 437
    iget v10, v2, Lnj0;->e:I

    .line 438
    .line 439
    iget v13, v2, Lnj0;->h:I

    .line 440
    .line 441
    if-ne v13, v3, :cond_b

    .line 442
    .line 443
    iget v13, v12, Lcom/google/android/flexbox/a;->g:I

    .line 444
    .line 445
    sub-int v14, v10, v13

    .line 446
    .line 447
    add-int/2addr v10, v13

    .line 448
    move/from16 v22, v10

    .line 449
    .line 450
    move/from16 v21, v14

    .line 451
    .line 452
    goto :goto_6

    .line 453
    :cond_b
    move/from16 v21, v10

    .line 454
    .line 455
    move/from16 v22, v21

    .line 456
    .line 457
    :goto_6
    iget v10, v2, Lnj0;->d:I

    .line 458
    .line 459
    int-to-float v5, v5

    .line 460
    sub-int/2addr v9, v6

    .line 461
    int-to-float v6, v9

    .line 462
    iget v9, v11, Lmj0;->d:I

    .line 463
    .line 464
    int-to-float v9, v9

    .line 465
    sub-float/2addr v5, v9

    .line 466
    sub-float/2addr v6, v9

    .line 467
    const/4 v11, 0x0

    .line 468
    invoke-static {v11, v11}, Ljava/lang/Math;->max(FF)F

    .line 469
    .line 470
    .line 471
    move-result v9

    .line 472
    iget v11, v12, Lcom/google/android/flexbox/a;->h:I

    .line 473
    .line 474
    move v13, v6

    .line 475
    move v14, v10

    .line 476
    const/4 v6, 0x0

    .line 477
    :goto_7
    add-int v15, v10, v11

    .line 478
    .line 479
    if-ge v14, v15, :cond_12

    .line 480
    .line 481
    move v15, v11

    .line 482
    invoke-virtual {v0, v14}, Lcom/google/android/flexbox/FlexboxLayoutManager;->g(I)Landroid/view/View;

    .line 483
    .line 484
    .line 485
    move-result-object v11

    .line 486
    if-nez v11, :cond_c

    .line 487
    .line 488
    move-object/from16 v25, v4

    .line 489
    .line 490
    move/from16 v19, v7

    .line 491
    .line 492
    move/from16 v29, v10

    .line 493
    .line 494
    move/from16 v31, v14

    .line 495
    .line 496
    move-object/from16 v4, v30

    .line 497
    .line 498
    const/16 v32, 0x1

    .line 499
    .line 500
    move/from16 v30, v15

    .line 501
    .line 502
    goto/16 :goto_a

    .line 503
    .line 504
    :cond_c
    iget-object v3, v4, Lcom/google/android/flexbox/b;->d:[J

    .line 505
    .line 506
    move-object/from16 v25, v4

    .line 507
    .line 508
    move/from16 v16, v5

    .line 509
    .line 510
    aget-wide v4, v3, v14

    .line 511
    .line 512
    long-to-int v3, v4

    .line 513
    shr-long v4, v4, v18

    .line 514
    .line 515
    long-to-int v4, v4

    .line 516
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 517
    .line 518
    .line 519
    move-result-object v5

    .line 520
    check-cast v5, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;

    .line 521
    .line 522
    invoke-virtual {v0, v11, v3, v4, v5}, Lcom/google/android/flexbox/FlexboxLayoutManager;->c1(Landroid/view/View;IILcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;)Z

    .line 523
    .line 524
    .line 525
    move-result v17

    .line 526
    if-eqz v17, :cond_d

    .line 527
    .line 528
    invoke-virtual {v11, v3, v4}, Landroid/view/View;->measure(II)V

    .line 529
    .line 530
    .line 531
    :cond_d
    iget v3, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 532
    .line 533
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 534
    .line 535
    .line 536
    move-result-object v4

    .line 537
    check-cast v4, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 538
    .line 539
    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 540
    .line 541
    iget v4, v4, Landroid/graphics/Rect;->top:I

    .line 542
    .line 543
    add-int/2addr v3, v4

    .line 544
    int-to-float v3, v3

    .line 545
    add-float v3, v16, v3

    .line 546
    .line 547
    iget v4, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 548
    .line 549
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 550
    .line 551
    .line 552
    move-result-object v16

    .line 553
    move/from16 v26, v3

    .line 554
    .line 555
    move-object/from16 v3, v16

    .line 556
    .line 557
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 558
    .line 559
    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 560
    .line 561
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    .line 562
    .line 563
    add-int/2addr v4, v3

    .line 564
    int-to-float v3, v4

    .line 565
    sub-float v3, v13, v3

    .line 566
    .line 567
    iget v4, v2, Lnj0;->h:I

    .line 568
    .line 569
    const/4 v13, 0x1

    .line 570
    if-ne v4, v13, :cond_e

    .line 571
    .line 572
    move-object/from16 v4, v30

    .line 573
    .line 574
    invoke-virtual {v0, v4, v11}, Landroidx/recyclerview/widget/k;->n(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 575
    .line 576
    .line 577
    move/from16 v27, v3

    .line 578
    .line 579
    move/from16 v19, v7

    .line 580
    .line 581
    const/4 v3, -0x1

    .line 582
    const/4 v7, 0x0

    .line 583
    invoke-virtual {v0, v3, v11, v7}, Landroidx/recyclerview/widget/k;->l(ILandroid/view/View;Z)V

    .line 584
    .line 585
    .line 586
    goto :goto_8

    .line 587
    :cond_e
    move/from16 v27, v3

    .line 588
    .line 589
    move/from16 v19, v7

    .line 590
    .line 591
    move-object/from16 v4, v30

    .line 592
    .line 593
    const/4 v3, -0x1

    .line 594
    const/4 v7, 0x0

    .line 595
    invoke-virtual {v0, v4, v11}, Landroidx/recyclerview/widget/k;->n(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 596
    .line 597
    .line 598
    invoke-virtual {v0, v6, v11, v7}, Landroidx/recyclerview/widget/k;->l(ILandroid/view/View;Z)V

    .line 599
    .line 600
    .line 601
    add-int/lit8 v6, v6, 0x1

    .line 602
    .line 603
    :goto_8
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 604
    .line 605
    .line 606
    move-result-object v16

    .line 607
    move-object/from16 v3, v16

    .line 608
    .line 609
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 610
    .line 611
    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 612
    .line 613
    iget v3, v3, Landroid/graphics/Rect;->left:I

    .line 614
    .line 615
    add-int v3, v21, v3

    .line 616
    .line 617
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 618
    .line 619
    .line 620
    move-result-object v16

    .line 621
    move-object/from16 v7, v16

    .line 622
    .line 623
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 624
    .line 625
    iget-object v7, v7, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 626
    .line 627
    iget v7, v7, Landroid/graphics/Rect;->right:I

    .line 628
    .line 629
    sub-int v16, v22, v7

    .line 630
    .line 631
    move/from16 v17, v13

    .line 632
    .line 633
    iget-boolean v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 634
    .line 635
    iget-boolean v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f0:Z

    .line 636
    .line 637
    move/from16 v29, v10

    .line 638
    .line 639
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h0:Lcom/google/android/flexbox/b;

    .line 640
    .line 641
    if-eqz v13, :cond_10

    .line 642
    .line 643
    if-eqz v7, :cond_f

    .line 644
    .line 645
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 646
    .line 647
    .line 648
    move-result v3

    .line 649
    sub-int v3, v16, v3

    .line 650
    .line 651
    invoke-static/range {v27 .. v27}, Ljava/lang/Math;->round(F)I

    .line 652
    .line 653
    .line 654
    move-result v7

    .line 655
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 656
    .line 657
    .line 658
    move-result v30

    .line 659
    sub-int v7, v7, v30

    .line 660
    .line 661
    move/from16 v30, v17

    .line 662
    .line 663
    invoke-static/range {v27 .. v27}, Ljava/lang/Math;->round(F)I

    .line 664
    .line 665
    .line 666
    move-result v17

    .line 667
    move/from16 v31, v14

    .line 668
    .line 669
    move/from16 v32, v30

    .line 670
    .line 671
    move v14, v3

    .line 672
    move/from16 v30, v15

    .line 673
    .line 674
    move v15, v7

    .line 675
    invoke-virtual/range {v10 .. v17}, Lcom/google/android/flexbox/b;->p(Landroid/view/View;Lcom/google/android/flexbox/a;ZIIII)V

    .line 676
    .line 677
    .line 678
    goto :goto_9

    .line 679
    :cond_f
    move/from16 v31, v14

    .line 680
    .line 681
    move/from16 v30, v15

    .line 682
    .line 683
    move/from16 v32, v17

    .line 684
    .line 685
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 686
    .line 687
    .line 688
    move-result v3

    .line 689
    sub-int v14, v16, v3

    .line 690
    .line 691
    invoke-static/range {v26 .. v26}, Ljava/lang/Math;->round(F)I

    .line 692
    .line 693
    .line 694
    move-result v15

    .line 695
    invoke-static/range {v26 .. v26}, Ljava/lang/Math;->round(F)I

    .line 696
    .line 697
    .line 698
    move-result v3

    .line 699
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 700
    .line 701
    .line 702
    move-result v7

    .line 703
    add-int v17, v7, v3

    .line 704
    .line 705
    invoke-virtual/range {v10 .. v17}, Lcom/google/android/flexbox/b;->p(Landroid/view/View;Lcom/google/android/flexbox/a;ZIIII)V

    .line 706
    .line 707
    .line 708
    goto :goto_9

    .line 709
    :cond_10
    move/from16 v31, v14

    .line 710
    .line 711
    move/from16 v30, v15

    .line 712
    .line 713
    move/from16 v32, v17

    .line 714
    .line 715
    if-eqz v7, :cond_11

    .line 716
    .line 717
    invoke-static/range {v27 .. v27}, Ljava/lang/Math;->round(F)I

    .line 718
    .line 719
    .line 720
    move-result v7

    .line 721
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 722
    .line 723
    .line 724
    move-result v14

    .line 725
    sub-int v15, v7, v14

    .line 726
    .line 727
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 728
    .line 729
    .line 730
    move-result v7

    .line 731
    add-int v16, v7, v3

    .line 732
    .line 733
    invoke-static/range {v27 .. v27}, Ljava/lang/Math;->round(F)I

    .line 734
    .line 735
    .line 736
    move-result v17

    .line 737
    move v14, v3

    .line 738
    invoke-virtual/range {v10 .. v17}, Lcom/google/android/flexbox/b;->p(Landroid/view/View;Lcom/google/android/flexbox/a;ZIIII)V

    .line 739
    .line 740
    .line 741
    goto :goto_9

    .line 742
    :cond_11
    move v14, v3

    .line 743
    invoke-static/range {v26 .. v26}, Ljava/lang/Math;->round(F)I

    .line 744
    .line 745
    .line 746
    move-result v15

    .line 747
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 748
    .line 749
    .line 750
    move-result v3

    .line 751
    add-int v16, v3, v14

    .line 752
    .line 753
    invoke-static/range {v26 .. v26}, Ljava/lang/Math;->round(F)I

    .line 754
    .line 755
    .line 756
    move-result v3

    .line 757
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 758
    .line 759
    .line 760
    move-result v7

    .line 761
    add-int v17, v7, v3

    .line 762
    .line 763
    invoke-virtual/range {v10 .. v17}, Lcom/google/android/flexbox/b;->p(Landroid/view/View;Lcom/google/android/flexbox/a;ZIIII)V

    .line 764
    .line 765
    .line 766
    :goto_9
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 767
    .line 768
    .line 769
    move-result v3

    .line 770
    iget v7, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 771
    .line 772
    add-int/2addr v3, v7

    .line 773
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 774
    .line 775
    .line 776
    move-result-object v7

    .line 777
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 778
    .line 779
    iget-object v7, v7, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 780
    .line 781
    iget v7, v7, Landroid/graphics/Rect;->bottom:I

    .line 782
    .line 783
    add-int/2addr v3, v7

    .line 784
    int-to-float v3, v3

    .line 785
    add-float/2addr v3, v9

    .line 786
    add-float v3, v3, v26

    .line 787
    .line 788
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 789
    .line 790
    .line 791
    move-result v7

    .line 792
    iget v5, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 793
    .line 794
    add-int/2addr v7, v5

    .line 795
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 796
    .line 797
    .line 798
    move-result-object v5

    .line 799
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 800
    .line 801
    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 802
    .line 803
    iget v5, v5, Landroid/graphics/Rect;->top:I

    .line 804
    .line 805
    add-int/2addr v7, v5

    .line 806
    int-to-float v5, v7

    .line 807
    add-float/2addr v5, v9

    .line 808
    sub-float v5, v27, v5

    .line 809
    .line 810
    move v13, v5

    .line 811
    move v5, v3

    .line 812
    :goto_a
    add-int/lit8 v14, v31, 0x1

    .line 813
    .line 814
    move/from16 v7, v19

    .line 815
    .line 816
    move/from16 v10, v29

    .line 817
    .line 818
    move/from16 v11, v30

    .line 819
    .line 820
    const/4 v3, -0x1

    .line 821
    move-object/from16 v30, v4

    .line 822
    .line 823
    move-object/from16 v4, v25

    .line 824
    .line 825
    goto/16 :goto_7

    .line 826
    .line 827
    :cond_12
    move/from16 v19, v7

    .line 828
    .line 829
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 830
    .line 831
    iget v3, v3, Lnj0;->h:I

    .line 832
    .line 833
    iget v4, v2, Lnj0;->c:I

    .line 834
    .line 835
    add-int/2addr v4, v3

    .line 836
    iput v4, v2, Lnj0;->c:I

    .line 837
    .line 838
    iget v3, v12, Lcom/google/android/flexbox/a;->g:I

    .line 839
    .line 840
    :goto_b
    add-int/2addr v8, v3

    .line 841
    if-nez v24, :cond_13

    .line 842
    .line 843
    iget-boolean v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 844
    .line 845
    if-eqz v3, :cond_13

    .line 846
    .line 847
    iget v3, v12, Lcom/google/android/flexbox/a;->g:I

    .line 848
    .line 849
    iget v4, v2, Lnj0;->h:I

    .line 850
    .line 851
    mul-int/2addr v3, v4

    .line 852
    iget v4, v2, Lnj0;->e:I

    .line 853
    .line 854
    sub-int/2addr v4, v3

    .line 855
    iput v4, v2, Lnj0;->e:I

    .line 856
    .line 857
    goto :goto_c

    .line 858
    :cond_13
    iget v3, v12, Lcom/google/android/flexbox/a;->g:I

    .line 859
    .line 860
    iget v4, v2, Lnj0;->h:I

    .line 861
    .line 862
    mul-int/2addr v3, v4

    .line 863
    iget v4, v2, Lnj0;->e:I

    .line 864
    .line 865
    add-int/2addr v4, v3

    .line 866
    iput v4, v2, Lnj0;->e:I

    .line 867
    .line 868
    :goto_c
    iget v3, v12, Lcom/google/android/flexbox/a;->g:I

    .line 869
    .line 870
    sub-int v7, v19, v3

    .line 871
    .line 872
    move/from16 v3, v23

    .line 873
    .line 874
    move/from16 v5, v24

    .line 875
    .line 876
    const/high16 v4, -0x80000000

    .line 877
    .line 878
    goto/16 :goto_0

    .line 879
    .line 880
    :goto_d
    iget v3, v2, Lnj0;->a:I

    .line 881
    .line 882
    sub-int/2addr v3, v8

    .line 883
    iput v3, v2, Lnj0;->a:I

    .line 884
    .line 885
    iget v4, v2, Lnj0;->f:I

    .line 886
    .line 887
    const/high16 v5, -0x80000000

    .line 888
    .line 889
    if-eq v4, v5, :cond_15

    .line 890
    .line 891
    add-int/2addr v4, v8

    .line 892
    iput v4, v2, Lnj0;->f:I

    .line 893
    .line 894
    if-gez v3, :cond_14

    .line 895
    .line 896
    add-int/2addr v4, v3

    .line 897
    iput v4, v2, Lnj0;->f:I

    .line 898
    .line 899
    :cond_14
    invoke-virtual {v0, v1, v2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->a1(Landroidx/recyclerview/widget/l;Lnj0;)V

    .line 900
    .line 901
    .line 902
    :cond_15
    iget v0, v2, Lnj0;->a:I

    .line 903
    .line 904
    sub-int v3, v23, v0

    .line 905
    .line 906
    return v3
.end method

.method public final Q0(I)Landroid/view/View;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->G()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-virtual {p0, v0, v1, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->V0(III)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p1}, Landroidx/recyclerview/widget/k;->O(Landroid/view/View;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h0:Lcom/google/android/flexbox/b;

    .line 18
    .line 19
    iget-object v1, v1, Lcom/google/android/flexbox/b;->c:[I

    .line 20
    .line 21
    aget v0, v1, v0

    .line 22
    .line 23
    const/4 v1, -0x1

    .line 24
    if-ne v0, v1, :cond_1

    .line 25
    .line 26
    :goto_0
    const/4 p0, 0x0

    .line 27
    return-object p0

    .line 28
    :cond_1
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lcom/google/android/flexbox/a;

    .line 35
    .line 36
    invoke-virtual {p0, p1, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->R0(Landroid/view/View;Lcom/google/android/flexbox/a;)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public final R0(Landroid/view/View;Lcom/google/android/flexbox/a;)Landroid/view/View;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget p2, p2, Lcom/google/android/flexbox/a;->h:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    :goto_0
    if-ge v1, p2, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/16 v4, 0x8

    .line 21
    .line 22
    if-ne v3, v4, :cond_0

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_0
    iget-boolean v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 32
    .line 33
    invoke-virtual {v3, p1}, Lpc0;->b(Landroid/view/View;)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 38
    .line 39
    invoke-virtual {v4, v2}, Lpc0;->b(Landroid/view/View;)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-ge v3, v4, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 47
    .line 48
    invoke-virtual {v3, p1}, Lpc0;->e(Landroid/view/View;)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 53
    .line 54
    invoke-virtual {v4, v2}, Lpc0;->e(Landroid/view/View;)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-le v3, v4, :cond_2

    .line 59
    .line 60
    :goto_1
    move-object p1, v2

    .line 61
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    return-object p1
.end method

.method public final S()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final S0(I)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->G()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    invoke-virtual {p0, v0, v1, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->V0(III)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-static {p1}, Landroidx/recyclerview/widget/k;->O(Landroid/view/View;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h0:Lcom/google/android/flexbox/b;

    .line 21
    .line 22
    iget-object v1, v1, Lcom/google/android/flexbox/b;->c:[I

    .line 23
    .line 24
    aget v0, v1, v0

    .line 25
    .line 26
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/google/android/flexbox/a;

    .line 33
    .line 34
    invoke-virtual {p0, p1, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->T0(Landroid/view/View;Lcom/google/android/flexbox/a;)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public final T0(Landroid/view/View;Lcom/google/android/flexbox/a;)Landroid/view/View;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->G()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x2

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->G()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget p2, p2, Lcom/google/android/flexbox/a;->h:I

    .line 16
    .line 17
    sub-int/2addr v2, p2

    .line 18
    add-int/lit8 v2, v2, -0x1

    .line 19
    .line 20
    :goto_0
    if-le v1, v2, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-eqz p2, :cond_2

    .line 27
    .line 28
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/16 v4, 0x8

    .line 33
    .line 34
    if-ne v3, v4, :cond_0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    iget-boolean v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 44
    .line 45
    invoke-virtual {v3, p1}, Lpc0;->e(Landroid/view/View;)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 50
    .line 51
    invoke-virtual {v4, p2}, Lpc0;->e(Landroid/view/View;)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-le v3, v4, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 59
    .line 60
    invoke-virtual {v3, p1}, Lpc0;->b(Landroid/view/View;)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 65
    .line 66
    invoke-virtual {v4, p2}, Lpc0;->b(Landroid/view/View;)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-ge v3, v4, :cond_2

    .line 71
    .line 72
    :goto_1
    move-object p1, p2

    .line 73
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, -0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    return-object p1
.end method

.method public final U0(II)Landroid/view/View;
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    if-le p2, p1, :cond_0

    .line 3
    .line 4
    move v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, -0x1

    .line 7
    :goto_0
    if-eq p1, p2, :cond_6

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->getPaddingLeft()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->getPaddingTop()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    iget v5, p0, Landroidx/recyclerview/widget/k;->Y:I

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->getPaddingRight()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    sub-int/2addr v5, v6

    .line 28
    iget v6, p0, Landroidx/recyclerview/widget/k;->Z:I

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->getPaddingBottom()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    sub-int/2addr v6, v7

    .line 35
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 40
    .line 41
    invoke-static {v2}, Landroidx/recyclerview/widget/k;->K(Landroid/view/View;)I

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 46
    .line 47
    sub-int/2addr v8, v7

    .line 48
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 53
    .line 54
    invoke-static {v2}, Landroidx/recyclerview/widget/k;->M(Landroid/view/View;)I

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 59
    .line 60
    sub-int/2addr v9, v7

    .line 61
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 66
    .line 67
    invoke-static {v2}, Landroidx/recyclerview/widget/k;->L(Landroid/view/View;)I

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 72
    .line 73
    add-int/2addr v10, v7

    .line 74
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 79
    .line 80
    invoke-static {v2}, Landroidx/recyclerview/widget/k;->J(Landroid/view/View;)I

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 85
    .line 86
    add-int/2addr v11, v7

    .line 87
    const/4 v7, 0x0

    .line 88
    if-ge v8, v5, :cond_2

    .line 89
    .line 90
    if-lt v10, v3, :cond_1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    move v3, v7

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    :goto_1
    move v3, v0

    .line 96
    :goto_2
    if-ge v9, v6, :cond_3

    .line 97
    .line 98
    if-lt v11, v4, :cond_4

    .line 99
    .line 100
    :cond_3
    move v7, v0

    .line 101
    :cond_4
    if-eqz v3, :cond_5

    .line 102
    .line 103
    if-eqz v7, :cond_5

    .line 104
    .line 105
    return-object v2

    .line 106
    :cond_5
    add-int/2addr p1, v1

    .line 107
    goto :goto_0

    .line 108
    :cond_6
    const/4 p0, 0x0

    .line 109
    return-object p0
.end method

.method public final V0(III)Landroid/view/View;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->O0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lnj0;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput v1, v0, Lnj0;->h:I

    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 19
    .line 20
    invoke-virtual {v0}, Lpc0;->k()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 25
    .line 26
    invoke-virtual {v2}, Lpc0;->g()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-le p2, p1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v1, -0x1

    .line 34
    :goto_0
    const/4 v3, 0x0

    .line 35
    move-object v4, v3

    .line 36
    :goto_1
    if-eq p1, p2, :cond_7

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    if-nez v5, :cond_2

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_2
    invoke-static {v5}, Landroidx/recyclerview/widget/k;->O(Landroid/view/View;)I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-ltz v6, :cond_6

    .line 50
    .line 51
    if-ge v6, p3, :cond_6

    .line 52
    .line 53
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 58
    .line 59
    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->a:Landroidx/recyclerview/widget/o;

    .line 60
    .line 61
    invoke-virtual {v6}, Landroidx/recyclerview/widget/o;->h()Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_3

    .line 66
    .line 67
    if-nez v4, :cond_6

    .line 68
    .line 69
    move-object v4, v5

    .line 70
    goto :goto_3

    .line 71
    :cond_3
    iget-object v6, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 72
    .line 73
    invoke-virtual {v6, v5}, Lpc0;->e(Landroid/view/View;)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-lt v6, v0, :cond_5

    .line 78
    .line 79
    iget-object v6, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 80
    .line 81
    invoke-virtual {v6, v5}, Lpc0;->b(Landroid/view/View;)I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-le v6, v2, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    return-object v5

    .line 89
    :cond_5
    :goto_2
    if-nez v3, :cond_6

    .line 90
    .line 91
    move-object v3, v5

    .line 92
    :cond_6
    :goto_3
    add-int/2addr p1, v1

    .line 93
    goto :goto_1

    .line 94
    :cond_7
    if-eqz v3, :cond_8

    .line 95
    .line 96
    return-object v3

    .line 97
    :cond_8
    return-object v4
.end method

.method public final W0(ILandroidx/recyclerview/widget/l;Ly12;Z)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 12
    .line 13
    invoke-virtual {v0}, Lpc0;->k()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sub-int v0, p1, v0

    .line 18
    .line 19
    if-lez v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v0, p3, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Y0(ILy12;Landroidx/recyclerview/widget/l;)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 27
    .line 28
    invoke-virtual {v0}, Lpc0;->g()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sub-int/2addr v0, p1

    .line 33
    if-lez v0, :cond_2

    .line 34
    .line 35
    neg-int v0, v0

    .line 36
    invoke-virtual {p0, v0, p3, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Y0(ILy12;Landroidx/recyclerview/widget/l;)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    neg-int p2, p2

    .line 41
    :goto_0
    add-int/2addr p1, p2

    .line 42
    if-eqz p4, :cond_1

    .line 43
    .line 44
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 45
    .line 46
    invoke-virtual {p3}, Lpc0;->g()I

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    sub-int/2addr p3, p1

    .line 51
    if-lez p3, :cond_1

    .line 52
    .line 53
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 54
    .line 55
    invoke-virtual {p0, p3}, Lpc0;->p(I)V

    .line 56
    .line 57
    .line 58
    add-int/2addr p3, p2

    .line 59
    return p3

    .line 60
    :cond_1
    return p2

    .line 61
    :cond_2
    const/4 p0, 0x0

    .line 62
    return p0
.end method

.method public final X()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->r0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final X0(ILandroidx/recyclerview/widget/l;Ly12;Z)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 12
    .line 13
    invoke-virtual {v0}, Lpc0;->g()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sub-int/2addr v0, p1

    .line 18
    if-lez v0, :cond_2

    .line 19
    .line 20
    neg-int v0, v0

    .line 21
    invoke-virtual {p0, v0, p3, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Y0(ILy12;Landroidx/recyclerview/widget/l;)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 27
    .line 28
    invoke-virtual {v0}, Lpc0;->k()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sub-int v0, p1, v0

    .line 33
    .line 34
    if-lez v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0, v0, p3, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Y0(ILy12;Landroidx/recyclerview/widget/l;)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    neg-int p2, p2

    .line 41
    :goto_0
    add-int/2addr p1, p2

    .line 42
    if-eqz p4, :cond_1

    .line 43
    .line 44
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 45
    .line 46
    invoke-virtual {p3}, Lpc0;->k()I

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    sub-int/2addr p1, p3

    .line 51
    if-lez p1, :cond_1

    .line 52
    .line 53
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 54
    .line 55
    neg-int p3, p1

    .line 56
    invoke-virtual {p0, p3}, Lpc0;->p(I)V

    .line 57
    .line 58
    .line 59
    sub-int/2addr p2, p1

    .line 60
    :cond_1
    return p2

    .line 61
    :cond_2
    const/4 p0, 0x0

    .line 62
    return p0
.end method

.method public final Y(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/view/View;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v0:Landroid/view/View;

    .line 8
    .line 9
    return-void
.end method

.method public final Y0(ILy12;Landroidx/recyclerview/widget/l;)I
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k;->G()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_14

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_c

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->O0()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    iput-boolean v3, v1, Lnj0;->i:Z

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    iget-boolean v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    move v1, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v1, v2

    .line 35
    :goto_0
    const/4 v4, -0x1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-gez p1, :cond_2

    .line 39
    .line 40
    :goto_1
    move v5, v3

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move v5, v4

    .line 43
    goto :goto_2

    .line 44
    :cond_3
    if-lez p1, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :goto_2
    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(I)I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 52
    .line 53
    iput v5, v7, Lnj0;->h:I

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    iget v8, v0, Landroidx/recyclerview/widget/k;->Y:I

    .line 60
    .line 61
    iget v9, v0, Landroidx/recyclerview/widget/k;->W:I

    .line 62
    .line 63
    invoke-static {v8, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 64
    .line 65
    .line 66
    move-result v12

    .line 67
    iget v8, v0, Landroidx/recyclerview/widget/k;->Z:I

    .line 68
    .line 69
    iget v9, v0, Landroidx/recyclerview/widget/k;->X:I

    .line 70
    .line 71
    invoke-static {v8, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 72
    .line 73
    .line 74
    move-result v13

    .line 75
    if-nez v7, :cond_4

    .line 76
    .line 77
    iget-boolean v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 78
    .line 79
    if-eqz v8, :cond_4

    .line 80
    .line 81
    move v8, v3

    .line 82
    goto :goto_3

    .line 83
    :cond_4
    move v8, v2

    .line 84
    :goto_3
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h0:Lcom/google/android/flexbox/b;

    .line 85
    .line 86
    if-ne v5, v3, :cond_a

    .line 87
    .line 88
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k;->G()I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    sub-int/2addr v10, v3

    .line 93
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    if-nez v10, :cond_5

    .line 98
    .line 99
    goto/16 :goto_a

    .line 100
    .line 101
    :cond_5
    iget-object v11, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 102
    .line 103
    iget-object v14, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 104
    .line 105
    invoke-virtual {v14, v10}, Lpc0;->b(Landroid/view/View;)I

    .line 106
    .line 107
    .line 108
    move-result v14

    .line 109
    iput v14, v11, Lnj0;->e:I

    .line 110
    .line 111
    invoke-static {v10}, Landroidx/recyclerview/widget/k;->O(Landroid/view/View;)I

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    iget-object v14, v9, Lcom/google/android/flexbox/b;->c:[I

    .line 116
    .line 117
    aget v14, v14, v11

    .line 118
    .line 119
    iget-object v15, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {v15, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v14

    .line 125
    check-cast v14, Lcom/google/android/flexbox/a;

    .line 126
    .line 127
    invoke-virtual {v0, v10, v14}, Lcom/google/android/flexbox/FlexboxLayoutManager;->T0(Landroid/view/View;Lcom/google/android/flexbox/a;)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object v10

    .line 131
    iget-object v14, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 132
    .line 133
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    add-int/2addr v11, v3

    .line 137
    iput v11, v14, Lnj0;->d:I

    .line 138
    .line 139
    iget-object v15, v9, Lcom/google/android/flexbox/b;->c:[I

    .line 140
    .line 141
    move/from16 v16, v3

    .line 142
    .line 143
    array-length v3, v15

    .line 144
    if-gt v3, v11, :cond_6

    .line 145
    .line 146
    iput v4, v14, Lnj0;->c:I

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_6
    aget v3, v15, v11

    .line 150
    .line 151
    iput v3, v14, Lnj0;->c:I

    .line 152
    .line 153
    :goto_4
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 154
    .line 155
    if-eqz v8, :cond_7

    .line 156
    .line 157
    invoke-virtual {v3, v10}, Lpc0;->e(Landroid/view/View;)I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    iput v3, v14, Lnj0;->e:I

    .line 162
    .line 163
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 164
    .line 165
    iget-object v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 166
    .line 167
    invoke-virtual {v8, v10}, Lpc0;->e(Landroid/view/View;)I

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    neg-int v8, v8

    .line 172
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 173
    .line 174
    invoke-virtual {v10}, Lpc0;->k()I

    .line 175
    .line 176
    .line 177
    move-result v10

    .line 178
    add-int/2addr v10, v8

    .line 179
    iput v10, v3, Lnj0;->f:I

    .line 180
    .line 181
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 182
    .line 183
    iget v8, v3, Lnj0;->f:I

    .line 184
    .line 185
    invoke-static {v8, v2}, Ljava/lang/Math;->max(II)I

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    iput v8, v3, Lnj0;->f:I

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_7
    invoke-virtual {v3, v10}, Lpc0;->b(Landroid/view/View;)I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    iput v3, v14, Lnj0;->e:I

    .line 197
    .line 198
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 199
    .line 200
    iget-object v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 201
    .line 202
    invoke-virtual {v8, v10}, Lpc0;->b(Landroid/view/View;)I

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 207
    .line 208
    invoke-virtual {v10}, Lpc0;->g()I

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    sub-int/2addr v8, v10

    .line 213
    iput v8, v3, Lnj0;->f:I

    .line 214
    .line 215
    :goto_5
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 216
    .line 217
    iget v3, v3, Lnj0;->c:I

    .line 218
    .line 219
    if-eq v3, v4, :cond_8

    .line 220
    .line 221
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 222
    .line 223
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    add-int/lit8 v4, v4, -0x1

    .line 228
    .line 229
    if-le v3, v4, :cond_10

    .line 230
    .line 231
    :cond_8
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 232
    .line 233
    iget v3, v3, Lnj0;->d:I

    .line 234
    .line 235
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->j0:Ly12;

    .line 236
    .line 237
    invoke-virtual {v4}, Ly12;->b()I

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-gt v3, v4, :cond_10

    .line 242
    .line 243
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 244
    .line 245
    iget v4, v3, Lnj0;->f:I

    .line 246
    .line 247
    sub-int v14, v6, v4

    .line 248
    .line 249
    const/4 v4, 0x0

    .line 250
    iget-object v11, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x0:Ln7;

    .line 251
    .line 252
    iput-object v4, v11, Ln7;->c:Ljava/lang/Object;

    .line 253
    .line 254
    iput v2, v11, Ln7;->b:I

    .line 255
    .line 256
    if-lez v14, :cond_10

    .line 257
    .line 258
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h0:Lcom/google/android/flexbox/b;

    .line 259
    .line 260
    if-eqz v7, :cond_9

    .line 261
    .line 262
    iget v15, v3, Lnj0;->d:I

    .line 263
    .line 264
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 265
    .line 266
    const/16 v16, -0x1

    .line 267
    .line 268
    move-object/from16 v17, v3

    .line 269
    .line 270
    invoke-virtual/range {v10 .. v17}, Lcom/google/android/flexbox/b;->b(Ln7;IIIIILjava/util/List;)V

    .line 271
    .line 272
    .line 273
    goto :goto_6

    .line 274
    :cond_9
    iget v15, v3, Lnj0;->d:I

    .line 275
    .line 276
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 277
    .line 278
    const/16 v16, -0x1

    .line 279
    .line 280
    move/from16 v17, v13

    .line 281
    .line 282
    move v13, v12

    .line 283
    move/from16 v12, v17

    .line 284
    .line 285
    move-object/from16 v17, v3

    .line 286
    .line 287
    invoke-virtual/range {v10 .. v17}, Lcom/google/android/flexbox/b;->b(Ln7;IIIIILjava/util/List;)V

    .line 288
    .line 289
    .line 290
    move/from16 v18, v13

    .line 291
    .line 292
    move v13, v12

    .line 293
    move/from16 v12, v18

    .line 294
    .line 295
    :goto_6
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 296
    .line 297
    iget v3, v3, Lnj0;->d:I

    .line 298
    .line 299
    invoke-virtual {v9, v12, v13, v3}, Lcom/google/android/flexbox/b;->h(III)V

    .line 300
    .line 301
    .line 302
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 303
    .line 304
    iget v3, v3, Lnj0;->d:I

    .line 305
    .line 306
    invoke-virtual {v9, v3}, Lcom/google/android/flexbox/b;->u(I)V

    .line 307
    .line 308
    .line 309
    goto/16 :goto_9

    .line 310
    .line 311
    :cond_a
    move/from16 v16, v3

    .line 312
    .line 313
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    if-nez v3, :cond_b

    .line 318
    .line 319
    goto/16 :goto_a

    .line 320
    .line 321
    :cond_b
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 322
    .line 323
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 324
    .line 325
    invoke-virtual {v10, v3}, Lpc0;->e(Landroid/view/View;)I

    .line 326
    .line 327
    .line 328
    move-result v10

    .line 329
    iput v10, v7, Lnj0;->e:I

    .line 330
    .line 331
    invoke-static {v3}, Landroidx/recyclerview/widget/k;->O(Landroid/view/View;)I

    .line 332
    .line 333
    .line 334
    move-result v7

    .line 335
    iget-object v10, v9, Lcom/google/android/flexbox/b;->c:[I

    .line 336
    .line 337
    aget v10, v10, v7

    .line 338
    .line 339
    iget-object v11, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 340
    .line 341
    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v10

    .line 345
    check-cast v10, Lcom/google/android/flexbox/a;

    .line 346
    .line 347
    invoke-virtual {v0, v3, v10}, Lcom/google/android/flexbox/FlexboxLayoutManager;->R0(Landroid/view/View;Lcom/google/android/flexbox/a;)Landroid/view/View;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 352
    .line 353
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    iget-object v9, v9, Lcom/google/android/flexbox/b;->c:[I

    .line 357
    .line 358
    aget v9, v9, v7

    .line 359
    .line 360
    if-ne v9, v4, :cond_c

    .line 361
    .line 362
    move v9, v2

    .line 363
    :cond_c
    if-lez v9, :cond_d

    .line 364
    .line 365
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 366
    .line 367
    add-int/lit8 v10, v9, -0x1

    .line 368
    .line 369
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    check-cast v4, Lcom/google/android/flexbox/a;

    .line 374
    .line 375
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 376
    .line 377
    iget v4, v4, Lcom/google/android/flexbox/a;->h:I

    .line 378
    .line 379
    sub-int/2addr v7, v4

    .line 380
    iput v7, v10, Lnj0;->d:I

    .line 381
    .line 382
    goto :goto_7

    .line 383
    :cond_d
    iput v4, v10, Lnj0;->d:I

    .line 384
    .line 385
    :goto_7
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 386
    .line 387
    if-lez v9, :cond_e

    .line 388
    .line 389
    add-int/lit8 v9, v9, -0x1

    .line 390
    .line 391
    goto :goto_8

    .line 392
    :cond_e
    move v9, v2

    .line 393
    :goto_8
    iput v9, v4, Lnj0;->c:I

    .line 394
    .line 395
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 396
    .line 397
    if-eqz v8, :cond_f

    .line 398
    .line 399
    invoke-virtual {v7, v3}, Lpc0;->b(Landroid/view/View;)I

    .line 400
    .line 401
    .line 402
    move-result v7

    .line 403
    iput v7, v4, Lnj0;->e:I

    .line 404
    .line 405
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 406
    .line 407
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 408
    .line 409
    invoke-virtual {v7, v3}, Lpc0;->b(Landroid/view/View;)I

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 414
    .line 415
    invoke-virtual {v7}, Lpc0;->g()I

    .line 416
    .line 417
    .line 418
    move-result v7

    .line 419
    sub-int/2addr v3, v7

    .line 420
    iput v3, v4, Lnj0;->f:I

    .line 421
    .line 422
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 423
    .line 424
    iget v4, v3, Lnj0;->f:I

    .line 425
    .line 426
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    .line 427
    .line 428
    .line 429
    move-result v4

    .line 430
    iput v4, v3, Lnj0;->f:I

    .line 431
    .line 432
    goto :goto_9

    .line 433
    :cond_f
    invoke-virtual {v7, v3}, Lpc0;->e(Landroid/view/View;)I

    .line 434
    .line 435
    .line 436
    move-result v7

    .line 437
    iput v7, v4, Lnj0;->e:I

    .line 438
    .line 439
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 440
    .line 441
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 442
    .line 443
    invoke-virtual {v7, v3}, Lpc0;->e(Landroid/view/View;)I

    .line 444
    .line 445
    .line 446
    move-result v3

    .line 447
    neg-int v3, v3

    .line 448
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 449
    .line 450
    invoke-virtual {v7}, Lpc0;->k()I

    .line 451
    .line 452
    .line 453
    move-result v7

    .line 454
    add-int/2addr v7, v3

    .line 455
    iput v7, v4, Lnj0;->f:I

    .line 456
    .line 457
    :cond_10
    :goto_9
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 458
    .line 459
    iget v4, v3, Lnj0;->f:I

    .line 460
    .line 461
    sub-int v4, v6, v4

    .line 462
    .line 463
    iput v4, v3, Lnj0;->a:I

    .line 464
    .line 465
    :goto_a
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 466
    .line 467
    iget v4, v3, Lnj0;->f:I

    .line 468
    .line 469
    move-object/from16 v7, p2

    .line 470
    .line 471
    move-object/from16 v8, p3

    .line 472
    .line 473
    invoke-virtual {v0, v8, v7, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->P0(Landroidx/recyclerview/widget/l;Ly12;Lnj0;)I

    .line 474
    .line 475
    .line 476
    move-result v3

    .line 477
    add-int/2addr v3, v4

    .line 478
    if-gez v3, :cond_11

    .line 479
    .line 480
    goto :goto_c

    .line 481
    :cond_11
    if-eqz v1, :cond_13

    .line 482
    .line 483
    if-le v6, v3, :cond_12

    .line 484
    .line 485
    neg-int v1, v5

    .line 486
    mul-int/2addr v1, v3

    .line 487
    goto :goto_b

    .line 488
    :cond_12
    move/from16 v1, p1

    .line 489
    .line 490
    goto :goto_b

    .line 491
    :cond_13
    if-le v6, v3, :cond_12

    .line 492
    .line 493
    mul-int v1, v5, v3

    .line 494
    .line 495
    :goto_b
    iget-object v2, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 496
    .line 497
    neg-int v3, v1

    .line 498
    invoke-virtual {v2, v3}, Lpc0;->p(I)V

    .line 499
    .line 500
    .line 501
    iget-object v0, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 502
    .line 503
    iput v1, v0, Lnj0;->g:I

    .line 504
    .line 505
    return v1

    .line 506
    :cond_14
    :goto_c
    return v2
.end method

.method public final Z(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final Z0(I)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->G()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->O0()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v0:Landroid/view/View;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    :goto_0
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iget v0, p0, Landroidx/recyclerview/widget/k;->Y:I

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    iget v0, p0, Landroidx/recyclerview/widget/k;->Z:I

    .line 36
    .line 37
    :goto_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->N()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const/4 v3, 0x1

    .line 42
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l0:Lmj0;

    .line 43
    .line 44
    if-ne v2, v3, :cond_4

    .line 45
    .line 46
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-gez p1, :cond_3

    .line 51
    .line 52
    iget p0, p0, Lmj0;->d:I

    .line 53
    .line 54
    add-int/2addr v0, p0

    .line 55
    sub-int/2addr v0, v1

    .line 56
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    neg-int p0, p0

    .line 61
    return p0

    .line 62
    :cond_3
    iget p0, p0, Lmj0;->d:I

    .line 63
    .line 64
    add-int v0, p0, p1

    .line 65
    .line 66
    if-lez v0, :cond_6

    .line 67
    .line 68
    neg-int p0, p0

    .line 69
    return p0

    .line 70
    :cond_4
    if-lez p1, :cond_5

    .line 71
    .line 72
    iget p0, p0, Lmj0;->d:I

    .line 73
    .line 74
    sub-int/2addr v0, p0

    .line 75
    sub-int/2addr v0, v1

    .line 76
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    return p0

    .line 81
    :cond_5
    iget p0, p0, Lmj0;->d:I

    .line 82
    .line 83
    add-int v0, p0, p1

    .line 84
    .line 85
    if-ltz v0, :cond_7

    .line 86
    .line 87
    :cond_6
    return p1

    .line 88
    :cond_7
    neg-int p0, p0

    .line 89
    return p0

    .line 90
    :cond_8
    :goto_2
    const/4 p0, 0x0

    .line 91
    return p0
.end method

.method public final a(I)Landroid/graphics/PointF;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->G()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :goto_0
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_1
    invoke-static {v0}, Landroidx/recyclerview/widget/k;->O(Landroid/view/View;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ge p1, v0, :cond_2

    .line 22
    .line 23
    const/4 p1, -0x1

    .line 24
    goto :goto_1

    .line 25
    :cond_2
    const/4 p1, 0x1

    .line 26
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    const/4 v0, 0x0

    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    new-instance p0, Landroid/graphics/PointF;

    .line 34
    .line 35
    int-to-float p1, p1

    .line 36
    invoke-direct {p0, v0, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_3
    new-instance p0, Landroid/graphics/PointF;

    .line 41
    .line 42
    int-to-float p1, p1

    .line 43
    invoke-direct {p0, p1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 44
    .line 45
    .line 46
    return-object p0
.end method

.method public final a1(Landroidx/recyclerview/widget/l;Lnj0;)V
    .locals 9

    .line 1
    iget-boolean v0, p2, Lnj0;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_a

    .line 6
    .line 7
    :cond_0
    iget v0, p2, Lnj0;->h:I

    .line 8
    .line 9
    iget v1, p2, Lnj0;->f:I

    .line 10
    .line 11
    iget-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h0:Lcom/google/android/flexbox/b;

    .line 12
    .line 13
    const/4 v3, -0x1

    .line 14
    if-ne v0, v3, :cond_d

    .line 15
    .line 16
    if-gez v1, :cond_1

    .line 17
    .line 18
    goto/16 :goto_a

    .line 19
    .line 20
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->G()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    goto/16 :goto_a

    .line 27
    .line 28
    :cond_2
    add-int/lit8 v1, v0, -0x1

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    if-nez v4, :cond_3

    .line 35
    .line 36
    goto/16 :goto_a

    .line 37
    .line 38
    :cond_3
    iget-object v2, v2, Lcom/google/android/flexbox/b;->c:[I

    .line 39
    .line 40
    invoke-static {v4}, Landroidx/recyclerview/widget/k;->O(Landroid/view/View;)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    aget v2, v2, v4

    .line 45
    .line 46
    if-ne v2, v3, :cond_4

    .line 47
    .line 48
    goto/16 :goto_a

    .line 49
    .line 50
    :cond_4
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Lcom/google/android/flexbox/a;

    .line 57
    .line 58
    move v4, v1

    .line 59
    :goto_0
    if-ltz v4, :cond_9

    .line 60
    .line 61
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    if-nez v5, :cond_5

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_5
    iget v6, p2, Lnj0;->f:I

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-nez v7, :cond_6

    .line 75
    .line 76
    iget-boolean v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 77
    .line 78
    if-eqz v7, :cond_6

    .line 79
    .line 80
    iget-object v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 81
    .line 82
    invoke-virtual {v7, v5}, Lpc0;->b(Landroid/view/View;)I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-gt v7, v6, :cond_9

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_6
    iget-object v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 90
    .line 91
    invoke-virtual {v7, v5}, Lpc0;->e(Landroid/view/View;)I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    iget-object v8, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 96
    .line 97
    invoke-virtual {v8}, Lpc0;->f()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    sub-int/2addr v8, v6

    .line 102
    if-lt v7, v8, :cond_9

    .line 103
    .line 104
    :goto_1
    iget v6, v3, Lcom/google/android/flexbox/a;->o:I

    .line 105
    .line 106
    invoke-static {v5}, Landroidx/recyclerview/widget/k;->O(Landroid/view/View;)I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-ne v6, v5, :cond_8

    .line 111
    .line 112
    if-gtz v2, :cond_7

    .line 113
    .line 114
    move v0, v4

    .line 115
    goto :goto_3

    .line 116
    :cond_7
    iget v0, p2, Lnj0;->h:I

    .line 117
    .line 118
    add-int/2addr v2, v0

    .line 119
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, Lcom/google/android/flexbox/a;

    .line 126
    .line 127
    move-object v3, v0

    .line 128
    move v0, v4

    .line 129
    :cond_8
    :goto_2
    add-int/lit8 v4, v4, -0x1

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_9
    :goto_3
    if-lt v1, v0, :cond_1a

    .line 133
    .line 134
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    if-eqz v2, :cond_c

    .line 143
    .line 144
    iget-object v2, p0, Landroidx/recyclerview/widget/k;->a:Lec;

    .line 145
    .line 146
    invoke-virtual {v2, v1}, Lec;->x(I)I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    iget-object v4, v2, Lec;->b:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v4, Lts0;

    .line 153
    .line 154
    iget-object v5, v4, Lts0;->a:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 157
    .line 158
    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    if-nez v5, :cond_a

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_a
    iget-object v6, v2, Lec;->c:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v6, Lbu;

    .line 168
    .line 169
    invoke-virtual {v6, v3}, Lbu;->f(I)Z

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-eqz v6, :cond_b

    .line 174
    .line 175
    invoke-virtual {v2, v5}, Lec;->O(Landroid/view/View;)V

    .line 176
    .line 177
    .line 178
    :cond_b
    invoke-virtual {v4, v3}, Lts0;->D(I)V

    .line 179
    .line 180
    .line 181
    :cond_c
    :goto_4
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/l;->f(Landroid/view/View;)V

    .line 182
    .line 183
    .line 184
    add-int/lit8 v1, v1, -0x1

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_d
    if-gez v1, :cond_e

    .line 188
    .line 189
    goto/16 :goto_a

    .line 190
    .line 191
    :cond_e
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->G()I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-nez v0, :cond_f

    .line 196
    .line 197
    goto/16 :goto_a

    .line 198
    .line 199
    :cond_f
    const/4 v1, 0x0

    .line 200
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    if-nez v4, :cond_10

    .line 205
    .line 206
    goto/16 :goto_a

    .line 207
    .line 208
    :cond_10
    iget-object v2, v2, Lcom/google/android/flexbox/b;->c:[I

    .line 209
    .line 210
    invoke-static {v4}, Landroidx/recyclerview/widget/k;->O(Landroid/view/View;)I

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    aget v2, v2, v4

    .line 215
    .line 216
    if-ne v2, v3, :cond_11

    .line 217
    .line 218
    goto/16 :goto_a

    .line 219
    .line 220
    :cond_11
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 221
    .line 222
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    check-cast v4, Lcom/google/android/flexbox/a;

    .line 227
    .line 228
    :goto_5
    if-ge v1, v0, :cond_16

    .line 229
    .line 230
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    if-nez v5, :cond_12

    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_12
    iget v6, p2, Lnj0;->f:I

    .line 238
    .line 239
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    if-nez v7, :cond_13

    .line 244
    .line 245
    iget-boolean v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 246
    .line 247
    if-eqz v7, :cond_13

    .line 248
    .line 249
    iget-object v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 250
    .line 251
    invoke-virtual {v7}, Lpc0;->f()I

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    iget-object v8, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 256
    .line 257
    invoke-virtual {v8, v5}, Lpc0;->e(Landroid/view/View;)I

    .line 258
    .line 259
    .line 260
    move-result v8

    .line 261
    sub-int/2addr v7, v8

    .line 262
    if-gt v7, v6, :cond_16

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_13
    iget-object v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 266
    .line 267
    invoke-virtual {v7, v5}, Lpc0;->b(Landroid/view/View;)I

    .line 268
    .line 269
    .line 270
    move-result v7

    .line 271
    if-gt v7, v6, :cond_16

    .line 272
    .line 273
    :goto_6
    iget v6, v4, Lcom/google/android/flexbox/a;->p:I

    .line 274
    .line 275
    invoke-static {v5}, Landroidx/recyclerview/widget/k;->O(Landroid/view/View;)I

    .line 276
    .line 277
    .line 278
    move-result v5

    .line 279
    if-ne v6, v5, :cond_15

    .line 280
    .line 281
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 282
    .line 283
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    add-int/lit8 v3, v3, -0x1

    .line 288
    .line 289
    if-lt v2, v3, :cond_14

    .line 290
    .line 291
    goto :goto_8

    .line 292
    :cond_14
    iget v3, p2, Lnj0;->h:I

    .line 293
    .line 294
    add-int/2addr v2, v3

    .line 295
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 296
    .line 297
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    check-cast v3, Lcom/google/android/flexbox/a;

    .line 302
    .line 303
    move-object v4, v3

    .line 304
    move v3, v1

    .line 305
    :cond_15
    :goto_7
    add-int/lit8 v1, v1, 0x1

    .line 306
    .line 307
    goto :goto_5

    .line 308
    :cond_16
    move v1, v3

    .line 309
    :goto_8
    if-ltz v1, :cond_1a

    .line 310
    .line 311
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 312
    .line 313
    .line 314
    move-result-object p2

    .line 315
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    if-eqz v0, :cond_19

    .line 320
    .line 321
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->a:Lec;

    .line 322
    .line 323
    invoke-virtual {v0, v1}, Lec;->x(I)I

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    iget-object v3, v0, Lec;->b:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v3, Lts0;

    .line 330
    .line 331
    iget-object v4, v3, Lts0;->a:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 334
    .line 335
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    if-nez v4, :cond_17

    .line 340
    .line 341
    goto :goto_9

    .line 342
    :cond_17
    iget-object v5, v0, Lec;->c:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v5, Lbu;

    .line 345
    .line 346
    invoke-virtual {v5, v2}, Lbu;->f(I)Z

    .line 347
    .line 348
    .line 349
    move-result v5

    .line 350
    if-eqz v5, :cond_18

    .line 351
    .line 352
    invoke-virtual {v0, v4}, Lec;->O(Landroid/view/View;)V

    .line 353
    .line 354
    .line 355
    :cond_18
    invoke-virtual {v3, v2}, Lts0;->D(I)V

    .line 356
    .line 357
    .line 358
    :cond_19
    :goto_9
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/l;->f(Landroid/view/View;)V

    .line 359
    .line 360
    .line 361
    add-int/lit8 v1, v1, -0x1

    .line 362
    .line 363
    goto :goto_8

    .line 364
    :cond_1a
    :goto_a
    return-void
.end method

.method public final b(Landroid/view/View;IILcom/google/android/flexbox/a;)V
    .locals 0

    .line 1
    sget-object p2, Lcom/google/android/flexbox/FlexboxLayoutManager;->y0:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/k;->n(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 17
    .line 18
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 19
    .line 20
    iget p0, p0, Landroid/graphics/Rect;->left:I

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 27
    .line 28
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 29
    .line 30
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 31
    .line 32
    add-int/2addr p0, p1

    .line 33
    iget p1, p4, Lcom/google/android/flexbox/a;->e:I

    .line 34
    .line 35
    add-int/2addr p1, p0

    .line 36
    iput p1, p4, Lcom/google/android/flexbox/a;->e:I

    .line 37
    .line 38
    iget p1, p4, Lcom/google/android/flexbox/a;->f:I

    .line 39
    .line 40
    add-int/2addr p1, p0

    .line 41
    iput p1, p4, Lcom/google/android/flexbox/a;->f:I

    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 49
    .line 50
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 51
    .line 52
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 59
    .line 60
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 61
    .line 62
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 63
    .line 64
    add-int/2addr p0, p1

    .line 65
    iget p1, p4, Lcom/google/android/flexbox/a;->e:I

    .line 66
    .line 67
    add-int/2addr p1, p0

    .line 68
    iput p1, p4, Lcom/google/android/flexbox/a;->e:I

    .line 69
    .line 70
    iget p1, p4, Lcom/google/android/flexbox/a;->f:I

    .line 71
    .line 72
    add-int/2addr p1, p0

    .line 73
    iput p1, p4, Lcom/google/android/flexbox/a;->f:I

    .line 74
    .line 75
    return-void
.end method

.method public final b1(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->a0:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->r0()V

    .line 6
    .line 7
    .line 8
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->a0:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n0:Lpc0;

    .line 14
    .line 15
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l0:Lmj0;

    .line 21
    .line 22
    invoke-static {p1}, Lmj0;->b(Lmj0;)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput v0, p1, Lmj0;->d:I

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->w0()V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final c(Lcom/google/android/flexbox/a;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final c1(Landroid/view/View;IILcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean p0, p0, Landroidx/recyclerview/widget/k;->v:Z

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    iget v0, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 16
    .line 17
    invoke-static {p0, p2, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->T(III)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iget p1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 28
    .line 29
    invoke-static {p0, p3, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->T(III)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-nez p0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    return p0

    .line 38
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 39
    return p0
.end method

.method public final d(I)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->g(I)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final d1(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->G()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    invoke-virtual {p0, v0, v1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->U0(II)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v0}, Landroidx/recyclerview/widget/k;->O(Landroid/view/View;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :goto_0
    if-lt p1, v1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->G()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h0:Lcom/google/android/flexbox/b;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Lcom/google/android/flexbox/b;->j(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lcom/google/android/flexbox/b;->k(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0}, Lcom/google/android/flexbox/b;->i(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, v1, Lcom/google/android/flexbox/b;->c:[I

    .line 38
    .line 39
    array-length v0, v0

    .line 40
    if-lt p1, v0, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w0:I

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-nez p1, :cond_3

    .line 51
    .line 52
    :goto_1
    return-void

    .line 53
    :cond_3
    invoke-static {p1}, Landroidx/recyclerview/widget/k;->O(Landroid/view/View;)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p0:I

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_4

    .line 64
    .line 65
    iget-boolean v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Lpc0;->b(Landroid/view/View;)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 76
    .line 77
    invoke-virtual {v0}, Lpc0;->h()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    add-int/2addr v0, p1

    .line 82
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q0:I

    .line 83
    .line 84
    return-void

    .line 85
    :cond_4
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Lpc0;->e(Landroid/view/View;)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 92
    .line 93
    invoke-virtual {v0}, Lpc0;->k()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    sub-int/2addr p1, v0

    .line 98
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q0:I

    .line 99
    .line 100
    return-void
.end method

.method public final e(III)I
    .locals 1

    .line 1
    iget p1, p0, Landroidx/recyclerview/widget/k;->Y:I

    .line 2
    .line 3
    iget v0, p0, Landroidx/recyclerview/widget/k;->W:I

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->o()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {p1, v0, p2, p3, p0}, Landroidx/recyclerview/widget/k;->H(IIIIZ)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final e1(Lmj0;ZZ)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/high16 v1, -0x80000000

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz p3, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    iget p3, p0, Landroidx/recyclerview/widget/k;->X:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget p3, p0, Landroidx/recyclerview/widget/k;->W:I

    .line 17
    .line 18
    :goto_0
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    if-ne p3, v1, :cond_2

    .line 23
    .line 24
    :cond_1
    move v0, v2

    .line 25
    :cond_2
    iput-boolean v0, v3, Lnj0;->b:Z

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_3
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 29
    .line 30
    iput-boolean v0, p3, Lnj0;->b:Z

    .line 31
    .line 32
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    if-nez p3, :cond_4

    .line 37
    .line 38
    iget-boolean p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 39
    .line 40
    if-eqz p3, :cond_4

    .line 41
    .line 42
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 43
    .line 44
    iget v0, p1, Lmj0;->c:I

    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->getPaddingRight()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    sub-int/2addr v0, v3

    .line 51
    iput v0, p3, Lnj0;->a:I

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_4
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 55
    .line 56
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 57
    .line 58
    invoke-virtual {v0}, Lpc0;->g()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget v3, p1, Lmj0;->c:I

    .line 63
    .line 64
    sub-int/2addr v0, v3

    .line 65
    iput v0, p3, Lnj0;->a:I

    .line 66
    .line 67
    :goto_2
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 68
    .line 69
    iget v0, p1, Lmj0;->a:I

    .line 70
    .line 71
    iput v0, p3, Lnj0;->d:I

    .line 72
    .line 73
    iput v2, p3, Lnj0;->h:I

    .line 74
    .line 75
    iget v0, p1, Lmj0;->c:I

    .line 76
    .line 77
    iput v0, p3, Lnj0;->e:I

    .line 78
    .line 79
    iput v1, p3, Lnj0;->f:I

    .line 80
    .line 81
    iget v0, p1, Lmj0;->b:I

    .line 82
    .line 83
    iput v0, p3, Lnj0;->c:I

    .line 84
    .line 85
    if-eqz p2, :cond_5

    .line 86
    .line 87
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 88
    .line 89
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    if-le p2, v2, :cond_5

    .line 94
    .line 95
    iget p2, p1, Lmj0;->b:I

    .line 96
    .line 97
    if-ltz p2, :cond_5

    .line 98
    .line 99
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result p3

    .line 105
    sub-int/2addr p3, v2

    .line 106
    if-ge p2, p3, :cond_5

    .line 107
    .line 108
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 109
    .line 110
    iget p1, p1, Lmj0;->b:I

    .line 111
    .line 112
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Lcom/google/android/flexbox/a;

    .line 117
    .line 118
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 119
    .line 120
    iget p2, p0, Lnj0;->c:I

    .line 121
    .line 122
    add-int/2addr p2, v2

    .line 123
    iput p2, p0, Lnj0;->c:I

    .line 124
    .line 125
    iget p1, p1, Lcom/google/android/flexbox/a;->h:I

    .line 126
    .line 127
    iget p2, p0, Lnj0;->d:I

    .line 128
    .line 129
    add-int/2addr p2, p1

    .line 130
    iput p2, p0, Lnj0;->d:I

    .line 131
    .line 132
    :cond_5
    return-void
.end method

.method public final f(ILandroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t0:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f0(II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->d1(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final f1(Lmj0;ZZ)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/high16 v1, -0x80000000

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz p3, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    iget p3, p0, Landroidx/recyclerview/widget/k;->X:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget p3, p0, Landroidx/recyclerview/widget/k;->W:I

    .line 17
    .line 18
    :goto_0
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    if-ne p3, v1, :cond_2

    .line 23
    .line 24
    :cond_1
    move v0, v2

    .line 25
    :cond_2
    iput-boolean v0, v3, Lnj0;->b:Z

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_3
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 29
    .line 30
    iput-boolean v0, p3, Lnj0;->b:Z

    .line 31
    .line 32
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    if-nez p3, :cond_4

    .line 37
    .line 38
    iget-boolean p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 39
    .line 40
    if-eqz p3, :cond_4

    .line 41
    .line 42
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 43
    .line 44
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v0:Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget v3, p1, Lmj0;->c:I

    .line 51
    .line 52
    sub-int/2addr v0, v3

    .line 53
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 54
    .line 55
    invoke-virtual {v3}, Lpc0;->k()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    sub-int/2addr v0, v3

    .line 60
    iput v0, p3, Lnj0;->a:I

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 64
    .line 65
    iget v0, p1, Lmj0;->c:I

    .line 66
    .line 67
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 68
    .line 69
    invoke-virtual {v3}, Lpc0;->k()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    sub-int/2addr v0, v3

    .line 74
    iput v0, p3, Lnj0;->a:I

    .line 75
    .line 76
    :goto_2
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 77
    .line 78
    iget v0, p1, Lmj0;->a:I

    .line 79
    .line 80
    iput v0, p3, Lnj0;->d:I

    .line 81
    .line 82
    const/4 v0, -0x1

    .line 83
    iput v0, p3, Lnj0;->h:I

    .line 84
    .line 85
    iget v0, p1, Lmj0;->c:I

    .line 86
    .line 87
    iput v0, p3, Lnj0;->e:I

    .line 88
    .line 89
    iput v1, p3, Lnj0;->f:I

    .line 90
    .line 91
    iget v0, p1, Lmj0;->b:I

    .line 92
    .line 93
    iput v0, p3, Lnj0;->c:I

    .line 94
    .line 95
    if-eqz p2, :cond_5

    .line 96
    .line 97
    if-lez v0, :cond_5

    .line 98
    .line 99
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    iget p1, p1, Lmj0;->b:I

    .line 106
    .line 107
    if-le p2, p1, :cond_5

    .line 108
    .line 109
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    check-cast p1, Lcom/google/android/flexbox/a;

    .line 116
    .line 117
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 118
    .line 119
    iget p2, p0, Lnj0;->c:I

    .line 120
    .line 121
    sub-int/2addr p2, v2

    .line 122
    iput p2, p0, Lnj0;->c:I

    .line 123
    .line 124
    iget p1, p1, Lcom/google/android/flexbox/a;->h:I

    .line 125
    .line 126
    iget p2, p0, Lnj0;->d:I

    .line 127
    .line 128
    sub-int/2addr p2, p1

    .line 129
    iput p2, p0, Lnj0;->d:I

    .line 130
    .line 131
    :cond_5
    return-void
.end method

.method public final g(I)Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t0:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/View;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i0:Landroidx/recyclerview/widget/l;

    .line 13
    .line 14
    const-wide v0, 0x7fffffffffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1, v0, v1}, Landroidx/recyclerview/widget/l;->i(IJ)Landroidx/recyclerview/widget/o;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget-object p0, p0, Landroidx/recyclerview/widget/o;->a:Landroid/view/View;

    .line 24
    .line 25
    return-object p0
.end method

.method public final getAlignContent()I
    .locals 0

    .line 1
    const/4 p0, 0x5

    .line 2
    return p0
.end method

.method public final getAlignItems()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->c0:I

    .line 2
    .line 3
    return p0
.end method

.method public final getFlexDirection()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->a0:I

    .line 2
    .line 3
    return p0
.end method

.method public final getFlexItemCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->j0:Ly12;

    .line 2
    .line 3
    invoke-virtual {p0}, Ly12;->b()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getFlexLinesInternal()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFlexWrap()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->b0:I

    .line 2
    .line 3
    return p0
.end method

.method public final getLargestMainSize()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/high16 v2, -0x80000000

    .line 18
    .line 19
    :goto_0
    if-ge v1, v0, :cond_1

    .line 20
    .line 21
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Lcom/google/android/flexbox/a;

    .line 28
    .line 29
    iget v3, v3, Lcom/google/android/flexbox/a;->e:I

    .line 30
    .line 31
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return v2
.end method

.method public final getMaxLine()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->d0:I

    .line 2
    .line 3
    return p0
.end method

.method public final getSumOfCrossSize()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lcom/google/android/flexbox/a;

    .line 18
    .line 19
    iget v3, v3, Lcom/google/android/flexbox/a;->g:I

    .line 20
    .line 21
    add-int/2addr v2, v3

    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return v2
.end method

.method public final h(Landroid/view/View;II)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 12
    .line 13
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 14
    .line 15
    iget p0, p0, Landroid/graphics/Rect;->left:I

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 22
    .line 23
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 24
    .line 25
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 26
    .line 27
    :goto_0
    add-int/2addr p0, p1

    .line 28
    return p0

    .line 29
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 34
    .line 35
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 36
    .line 37
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 44
    .line 45
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 46
    .line 47
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 48
    .line 49
    goto :goto_0
.end method

.method public final h0(II)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->d1(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final i(III)I
    .locals 1

    .line 1
    iget p1, p0, Landroidx/recyclerview/widget/k;->Z:I

    .line 2
    .line 3
    iget v0, p0, Landroidx/recyclerview/widget/k;->X:I

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->p()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {p1, v0, p2, p3, p0}, Landroidx/recyclerview/widget/k;->H(IIIIZ)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final i0(II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->d1(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->a0:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    if-ne p0, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    :goto_0
    return v0
.end method

.method public final j0(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->d1(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final k(Landroid/view/View;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 12
    .line 13
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 14
    .line 15
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 22
    .line 23
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 24
    .line 25
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 26
    .line 27
    :goto_0
    add-int/2addr p0, p1

    .line 28
    return p0

    .line 29
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 34
    .line 35
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 36
    .line 37
    iget p0, p0, Landroid/graphics/Rect;->left:I

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 44
    .line 45
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->b:Landroid/graphics/Rect;

    .line 46
    .line 47
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 48
    .line 49
    goto :goto_0
.end method

.method public final k0(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->d1(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->d1(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final l0(Landroidx/recyclerview/widget/l;Ly12;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iput-object v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i0:Landroidx/recyclerview/widget/l;

    .line 8
    .line 9
    iput-object v2, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->j0:Ly12;

    .line 10
    .line 11
    invoke-virtual {v2}, Ly12;->b()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    iget-boolean v4, v2, Ly12;->g:Z

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    goto/16 :goto_1b

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k;->N()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->a0:I

    .line 28
    .line 29
    iget v6, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->b0:I

    .line 30
    .line 31
    const/4 v7, 0x1

    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v9, 0x2

    .line 34
    if-eqz v5, :cond_a

    .line 35
    .line 36
    if-eq v5, v7, :cond_7

    .line 37
    .line 38
    if-eq v5, v9, :cond_4

    .line 39
    .line 40
    const/4 v10, 0x3

    .line 41
    if-eq v5, v10, :cond_1

    .line 42
    .line 43
    iput-boolean v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 44
    .line 45
    iput-boolean v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f0:Z

    .line 46
    .line 47
    goto :goto_6

    .line 48
    :cond_1
    if-ne v4, v7, :cond_2

    .line 49
    .line 50
    move v4, v7

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    move v4, v8

    .line 53
    :goto_0
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 54
    .line 55
    if-ne v6, v9, :cond_3

    .line 56
    .line 57
    xor-int/2addr v4, v7

    .line 58
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 59
    .line 60
    :cond_3
    iput-boolean v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f0:Z

    .line 61
    .line 62
    goto :goto_6

    .line 63
    :cond_4
    if-ne v4, v7, :cond_5

    .line 64
    .line 65
    move v4, v7

    .line 66
    goto :goto_1

    .line 67
    :cond_5
    move v4, v8

    .line 68
    :goto_1
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 69
    .line 70
    if-ne v6, v9, :cond_6

    .line 71
    .line 72
    xor-int/2addr v4, v7

    .line 73
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 74
    .line 75
    :cond_6
    iput-boolean v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f0:Z

    .line 76
    .line 77
    goto :goto_6

    .line 78
    :cond_7
    if-eq v4, v7, :cond_8

    .line 79
    .line 80
    move v4, v7

    .line 81
    goto :goto_2

    .line 82
    :cond_8
    move v4, v8

    .line 83
    :goto_2
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 84
    .line 85
    if-ne v6, v9, :cond_9

    .line 86
    .line 87
    move v4, v7

    .line 88
    goto :goto_3

    .line 89
    :cond_9
    move v4, v8

    .line 90
    :goto_3
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f0:Z

    .line 91
    .line 92
    goto :goto_6

    .line 93
    :cond_a
    if-ne v4, v7, :cond_b

    .line 94
    .line 95
    move v4, v7

    .line 96
    goto :goto_4

    .line 97
    :cond_b
    move v4, v8

    .line 98
    :goto_4
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 99
    .line 100
    if-ne v6, v9, :cond_c

    .line 101
    .line 102
    move v4, v7

    .line 103
    goto :goto_5

    .line 104
    :cond_c
    move v4, v8

    .line 105
    :goto_5
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f0:Z

    .line 106
    .line 107
    :goto_6
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->O0()V

    .line 108
    .line 109
    .line 110
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 111
    .line 112
    if-nez v4, :cond_d

    .line 113
    .line 114
    new-instance v4, Lnj0;

    .line 115
    .line 116
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 117
    .line 118
    .line 119
    iput v7, v4, Lnj0;->h:I

    .line 120
    .line 121
    iput-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 122
    .line 123
    :cond_d
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h0:Lcom/google/android/flexbox/b;

    .line 124
    .line 125
    invoke-virtual {v4, v3}, Lcom/google/android/flexbox/b;->j(I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4, v3}, Lcom/google/android/flexbox/b;->k(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, v3}, Lcom/google/android/flexbox/b;->i(I)V

    .line 132
    .line 133
    .line 134
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 135
    .line 136
    iput-boolean v8, v5, Lnj0;->i:Z

    .line 137
    .line 138
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->o0:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 139
    .line 140
    if-eqz v5, :cond_e

    .line 141
    .line 142
    iget v6, v5, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->a:I

    .line 143
    .line 144
    if-ltz v6, :cond_e

    .line 145
    .line 146
    if-ge v6, v3, :cond_e

    .line 147
    .line 148
    iput v6, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p0:I

    .line 149
    .line 150
    :cond_e
    iget-object v6, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l0:Lmj0;

    .line 151
    .line 152
    iget-boolean v9, v6, Lmj0;->f:Z

    .line 153
    .line 154
    const/high16 v10, -0x80000000

    .line 155
    .line 156
    const/4 v11, -0x1

    .line 157
    if-eqz v9, :cond_f

    .line 158
    .line 159
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p0:I

    .line 160
    .line 161
    if-ne v9, v11, :cond_f

    .line 162
    .line 163
    if-eqz v5, :cond_28

    .line 164
    .line 165
    :cond_f
    invoke-static {v6}, Lmj0;->b(Lmj0;)V

    .line 166
    .line 167
    .line 168
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->o0:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 169
    .line 170
    iget-boolean v9, v2, Ly12;->g:Z

    .line 171
    .line 172
    if-nez v9, :cond_1d

    .line 173
    .line 174
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p0:I

    .line 175
    .line 176
    if-ne v9, v11, :cond_10

    .line 177
    .line 178
    goto/16 :goto_a

    .line 179
    .line 180
    :cond_10
    if-ltz v9, :cond_1c

    .line 181
    .line 182
    invoke-virtual {v2}, Ly12;->b()I

    .line 183
    .line 184
    .line 185
    move-result v12

    .line 186
    if-lt v9, v12, :cond_11

    .line 187
    .line 188
    goto/16 :goto_9

    .line 189
    .line 190
    :cond_11
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p0:I

    .line 191
    .line 192
    iput v9, v6, Lmj0;->a:I

    .line 193
    .line 194
    iget-object v12, v4, Lcom/google/android/flexbox/b;->c:[I

    .line 195
    .line 196
    aget v9, v12, v9

    .line 197
    .line 198
    iput v9, v6, Lmj0;->b:I

    .line 199
    .line 200
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->o0:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 201
    .line 202
    if-eqz v9, :cond_12

    .line 203
    .line 204
    invoke-virtual {v2}, Ly12;->b()I

    .line 205
    .line 206
    .line 207
    move-result v12

    .line 208
    iget v9, v9, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->a:I

    .line 209
    .line 210
    if-ltz v9, :cond_12

    .line 211
    .line 212
    if-ge v9, v12, :cond_12

    .line 213
    .line 214
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 215
    .line 216
    invoke-virtual {v9}, Lpc0;->k()I

    .line 217
    .line 218
    .line 219
    move-result v9

    .line 220
    iget v5, v5, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->b:I

    .line 221
    .line 222
    add-int/2addr v9, v5

    .line 223
    iput v9, v6, Lmj0;->c:I

    .line 224
    .line 225
    iput-boolean v7, v6, Lmj0;->g:Z

    .line 226
    .line 227
    iput v11, v6, Lmj0;->b:I

    .line 228
    .line 229
    goto/16 :goto_11

    .line 230
    .line 231
    :cond_12
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q0:I

    .line 232
    .line 233
    if-ne v5, v10, :cond_1a

    .line 234
    .line 235
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p0:I

    .line 236
    .line 237
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/k;->B(I)Landroid/view/View;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    if-eqz v5, :cond_17

    .line 242
    .line 243
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 244
    .line 245
    invoke-virtual {v9, v5}, Lpc0;->c(Landroid/view/View;)I

    .line 246
    .line 247
    .line 248
    move-result v9

    .line 249
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 250
    .line 251
    invoke-virtual {v12}, Lpc0;->l()I

    .line 252
    .line 253
    .line 254
    move-result v12

    .line 255
    if-le v9, v12, :cond_13

    .line 256
    .line 257
    invoke-static {v6}, Lmj0;->a(Lmj0;)V

    .line 258
    .line 259
    .line 260
    goto/16 :goto_11

    .line 261
    .line 262
    :cond_13
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 263
    .line 264
    invoke-virtual {v9, v5}, Lpc0;->e(Landroid/view/View;)I

    .line 265
    .line 266
    .line 267
    move-result v9

    .line 268
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 269
    .line 270
    invoke-virtual {v12}, Lpc0;->k()I

    .line 271
    .line 272
    .line 273
    move-result v12

    .line 274
    sub-int/2addr v9, v12

    .line 275
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 276
    .line 277
    if-gez v9, :cond_14

    .line 278
    .line 279
    invoke-virtual {v12}, Lpc0;->k()I

    .line 280
    .line 281
    .line 282
    move-result v5

    .line 283
    iput v5, v6, Lmj0;->c:I

    .line 284
    .line 285
    iput-boolean v8, v6, Lmj0;->e:Z

    .line 286
    .line 287
    goto/16 :goto_11

    .line 288
    .line 289
    :cond_14
    invoke-virtual {v12}, Lpc0;->g()I

    .line 290
    .line 291
    .line 292
    move-result v9

    .line 293
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 294
    .line 295
    invoke-virtual {v12, v5}, Lpc0;->b(Landroid/view/View;)I

    .line 296
    .line 297
    .line 298
    move-result v12

    .line 299
    sub-int/2addr v9, v12

    .line 300
    if-gez v9, :cond_15

    .line 301
    .line 302
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 303
    .line 304
    invoke-virtual {v5}, Lpc0;->g()I

    .line 305
    .line 306
    .line 307
    move-result v5

    .line 308
    iput v5, v6, Lmj0;->c:I

    .line 309
    .line 310
    iput-boolean v7, v6, Lmj0;->e:Z

    .line 311
    .line 312
    goto/16 :goto_11

    .line 313
    .line 314
    :cond_15
    iget-boolean v9, v6, Lmj0;->e:Z

    .line 315
    .line 316
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 317
    .line 318
    if-eqz v9, :cond_16

    .line 319
    .line 320
    invoke-virtual {v12, v5}, Lpc0;->b(Landroid/view/View;)I

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 325
    .line 326
    invoke-virtual {v9}, Lpc0;->m()I

    .line 327
    .line 328
    .line 329
    move-result v9

    .line 330
    add-int/2addr v9, v5

    .line 331
    goto :goto_7

    .line 332
    :cond_16
    invoke-virtual {v12, v5}, Lpc0;->e(Landroid/view/View;)I

    .line 333
    .line 334
    .line 335
    move-result v9

    .line 336
    :goto_7
    iput v9, v6, Lmj0;->c:I

    .line 337
    .line 338
    goto/16 :goto_11

    .line 339
    .line 340
    :cond_17
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k;->G()I

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    if-lez v5, :cond_19

    .line 345
    .line 346
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    if-eqz v5, :cond_19

    .line 351
    .line 352
    invoke-static {v5}, Landroidx/recyclerview/widget/k;->O(Landroid/view/View;)I

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p0:I

    .line 357
    .line 358
    if-ge v9, v5, :cond_18

    .line 359
    .line 360
    move v5, v7

    .line 361
    goto :goto_8

    .line 362
    :cond_18
    move v5, v8

    .line 363
    :goto_8
    iput-boolean v5, v6, Lmj0;->e:Z

    .line 364
    .line 365
    :cond_19
    invoke-static {v6}, Lmj0;->a(Lmj0;)V

    .line 366
    .line 367
    .line 368
    goto/16 :goto_11

    .line 369
    .line 370
    :cond_1a
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 371
    .line 372
    .line 373
    move-result v5

    .line 374
    if-nez v5, :cond_1b

    .line 375
    .line 376
    iget-boolean v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 377
    .line 378
    if-eqz v5, :cond_1b

    .line 379
    .line 380
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q0:I

    .line 381
    .line 382
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 383
    .line 384
    invoke-virtual {v9}, Lpc0;->h()I

    .line 385
    .line 386
    .line 387
    move-result v9

    .line 388
    sub-int/2addr v5, v9

    .line 389
    iput v5, v6, Lmj0;->c:I

    .line 390
    .line 391
    goto/16 :goto_11

    .line 392
    .line 393
    :cond_1b
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 394
    .line 395
    invoke-virtual {v5}, Lpc0;->k()I

    .line 396
    .line 397
    .line 398
    move-result v5

    .line 399
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q0:I

    .line 400
    .line 401
    add-int/2addr v5, v9

    .line 402
    iput v5, v6, Lmj0;->c:I

    .line 403
    .line 404
    goto/16 :goto_11

    .line 405
    .line 406
    :cond_1c
    :goto_9
    iput v11, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p0:I

    .line 407
    .line 408
    iput v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q0:I

    .line 409
    .line 410
    :cond_1d
    :goto_a
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k;->G()I

    .line 411
    .line 412
    .line 413
    move-result v5

    .line 414
    if-nez v5, :cond_1e

    .line 415
    .line 416
    goto/16 :goto_10

    .line 417
    .line 418
    :cond_1e
    iget-boolean v5, v6, Lmj0;->e:Z

    .line 419
    .line 420
    if-eqz v5, :cond_1f

    .line 421
    .line 422
    invoke-virtual {v2}, Ly12;->b()I

    .line 423
    .line 424
    .line 425
    move-result v5

    .line 426
    invoke-virtual {v0, v5}, Lcom/google/android/flexbox/FlexboxLayoutManager;->S0(I)Landroid/view/View;

    .line 427
    .line 428
    .line 429
    move-result-object v5

    .line 430
    goto :goto_b

    .line 431
    :cond_1f
    invoke-virtual {v2}, Ly12;->b()I

    .line 432
    .line 433
    .line 434
    move-result v5

    .line 435
    invoke-virtual {v0, v5}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Q0(I)Landroid/view/View;

    .line 436
    .line 437
    .line 438
    move-result-object v5

    .line 439
    :goto_b
    if-eqz v5, :cond_26

    .line 440
    .line 441
    iget-object v9, v6, Lmj0;->h:Lcom/google/android/flexbox/FlexboxLayoutManager;

    .line 442
    .line 443
    iget v12, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->b0:I

    .line 444
    .line 445
    if-nez v12, :cond_20

    .line 446
    .line 447
    iget-object v12, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->n0:Lpc0;

    .line 448
    .line 449
    goto :goto_c

    .line 450
    :cond_20
    iget-object v12, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 451
    .line 452
    :goto_c
    invoke-virtual {v9}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 453
    .line 454
    .line 455
    move-result v13

    .line 456
    if-nez v13, :cond_22

    .line 457
    .line 458
    iget-boolean v13, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->e0:Z

    .line 459
    .line 460
    if-eqz v13, :cond_22

    .line 461
    .line 462
    iget-boolean v13, v6, Lmj0;->e:Z

    .line 463
    .line 464
    if-eqz v13, :cond_21

    .line 465
    .line 466
    invoke-virtual {v12, v5}, Lpc0;->e(Landroid/view/View;)I

    .line 467
    .line 468
    .line 469
    move-result v13

    .line 470
    invoke-virtual {v12}, Lpc0;->m()I

    .line 471
    .line 472
    .line 473
    move-result v12

    .line 474
    add-int/2addr v12, v13

    .line 475
    iput v12, v6, Lmj0;->c:I

    .line 476
    .line 477
    goto :goto_d

    .line 478
    :cond_21
    invoke-virtual {v12, v5}, Lpc0;->b(Landroid/view/View;)I

    .line 479
    .line 480
    .line 481
    move-result v12

    .line 482
    iput v12, v6, Lmj0;->c:I

    .line 483
    .line 484
    goto :goto_d

    .line 485
    :cond_22
    iget-boolean v13, v6, Lmj0;->e:Z

    .line 486
    .line 487
    if-eqz v13, :cond_23

    .line 488
    .line 489
    invoke-virtual {v12, v5}, Lpc0;->b(Landroid/view/View;)I

    .line 490
    .line 491
    .line 492
    move-result v13

    .line 493
    invoke-virtual {v12}, Lpc0;->m()I

    .line 494
    .line 495
    .line 496
    move-result v12

    .line 497
    add-int/2addr v12, v13

    .line 498
    iput v12, v6, Lmj0;->c:I

    .line 499
    .line 500
    goto :goto_d

    .line 501
    :cond_23
    invoke-virtual {v12, v5}, Lpc0;->e(Landroid/view/View;)I

    .line 502
    .line 503
    .line 504
    move-result v12

    .line 505
    iput v12, v6, Lmj0;->c:I

    .line 506
    .line 507
    :goto_d
    invoke-static {v5}, Landroidx/recyclerview/widget/k;->O(Landroid/view/View;)I

    .line 508
    .line 509
    .line 510
    move-result v5

    .line 511
    iput v5, v6, Lmj0;->a:I

    .line 512
    .line 513
    iput-boolean v8, v6, Lmj0;->g:Z

    .line 514
    .line 515
    iget-object v12, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->h0:Lcom/google/android/flexbox/b;

    .line 516
    .line 517
    iget-object v12, v12, Lcom/google/android/flexbox/b;->c:[I

    .line 518
    .line 519
    if-eq v5, v11, :cond_24

    .line 520
    .line 521
    goto :goto_e

    .line 522
    :cond_24
    move v5, v8

    .line 523
    :goto_e
    aget v5, v12, v5

    .line 524
    .line 525
    if-eq v5, v11, :cond_25

    .line 526
    .line 527
    goto :goto_f

    .line 528
    :cond_25
    move v5, v8

    .line 529
    :goto_f
    iput v5, v6, Lmj0;->b:I

    .line 530
    .line 531
    iget-object v5, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 532
    .line 533
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 534
    .line 535
    .line 536
    move-result v5

    .line 537
    iget v12, v6, Lmj0;->b:I

    .line 538
    .line 539
    if-le v5, v12, :cond_27

    .line 540
    .line 541
    iget-object v5, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 542
    .line 543
    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v5

    .line 547
    check-cast v5, Lcom/google/android/flexbox/a;

    .line 548
    .line 549
    iget v5, v5, Lcom/google/android/flexbox/a;->o:I

    .line 550
    .line 551
    iput v5, v6, Lmj0;->a:I

    .line 552
    .line 553
    goto :goto_11

    .line 554
    :cond_26
    :goto_10
    invoke-static {v6}, Lmj0;->a(Lmj0;)V

    .line 555
    .line 556
    .line 557
    iput v8, v6, Lmj0;->a:I

    .line 558
    .line 559
    iput v8, v6, Lmj0;->b:I

    .line 560
    .line 561
    :cond_27
    :goto_11
    iput-boolean v7, v6, Lmj0;->f:Z

    .line 562
    .line 563
    :cond_28
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/k;->A(Landroidx/recyclerview/widget/l;)V

    .line 564
    .line 565
    .line 566
    iget-boolean v5, v6, Lmj0;->e:Z

    .line 567
    .line 568
    if-eqz v5, :cond_29

    .line 569
    .line 570
    invoke-virtual {v0, v6, v8, v7}, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1(Lmj0;ZZ)V

    .line 571
    .line 572
    .line 573
    goto :goto_12

    .line 574
    :cond_29
    invoke-virtual {v0, v6, v8, v7}, Lcom/google/android/flexbox/FlexboxLayoutManager;->e1(Lmj0;ZZ)V

    .line 575
    .line 576
    .line 577
    :goto_12
    iget v5, v0, Landroidx/recyclerview/widget/k;->Y:I

    .line 578
    .line 579
    iget v9, v0, Landroidx/recyclerview/widget/k;->W:I

    .line 580
    .line 581
    invoke-static {v5, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 582
    .line 583
    .line 584
    move-result v14

    .line 585
    iget v5, v0, Landroidx/recyclerview/widget/k;->Z:I

    .line 586
    .line 587
    iget v9, v0, Landroidx/recyclerview/widget/k;->X:I

    .line 588
    .line 589
    invoke-static {v5, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 590
    .line 591
    .line 592
    move-result v15

    .line 593
    iget v5, v0, Landroidx/recyclerview/widget/k;->Y:I

    .line 594
    .line 595
    iget v9, v0, Landroidx/recyclerview/widget/k;->Z:I

    .line 596
    .line 597
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 598
    .line 599
    .line 600
    move-result v12

    .line 601
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u0:Landroid/content/Context;

    .line 602
    .line 603
    if-eqz v12, :cond_2c

    .line 604
    .line 605
    iget v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r0:I

    .line 606
    .line 607
    if-eq v12, v10, :cond_2a

    .line 608
    .line 609
    if-eq v12, v5, :cond_2a

    .line 610
    .line 611
    move v10, v7

    .line 612
    goto :goto_13

    .line 613
    :cond_2a
    move v10, v8

    .line 614
    :goto_13
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 615
    .line 616
    iget-boolean v7, v12, Lnj0;->b:Z

    .line 617
    .line 618
    if-eqz v7, :cond_2b

    .line 619
    .line 620
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 621
    .line 622
    .line 623
    move-result-object v7

    .line 624
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 625
    .line 626
    .line 627
    move-result-object v7

    .line 628
    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 629
    .line 630
    goto :goto_14

    .line 631
    :cond_2b
    iget v7, v12, Lnj0;->a:I

    .line 632
    .line 633
    :goto_14
    move/from16 v16, v7

    .line 634
    .line 635
    goto :goto_16

    .line 636
    :cond_2c
    iget v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->s0:I

    .line 637
    .line 638
    if-eq v7, v10, :cond_2d

    .line 639
    .line 640
    if-eq v7, v9, :cond_2d

    .line 641
    .line 642
    const/4 v10, 0x1

    .line 643
    goto :goto_15

    .line 644
    :cond_2d
    move v10, v8

    .line 645
    :goto_15
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 646
    .line 647
    iget-boolean v12, v7, Lnj0;->b:Z

    .line 648
    .line 649
    if-eqz v12, :cond_2e

    .line 650
    .line 651
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 652
    .line 653
    .line 654
    move-result-object v7

    .line 655
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 656
    .line 657
    .line 658
    move-result-object v7

    .line 659
    iget v7, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 660
    .line 661
    goto :goto_14

    .line 662
    :cond_2e
    iget v7, v7, Lnj0;->a:I

    .line 663
    .line 664
    goto :goto_14

    .line 665
    :goto_16
    iput v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r0:I

    .line 666
    .line 667
    iput v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->s0:I

    .line 668
    .line 669
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w0:I

    .line 670
    .line 671
    const/4 v7, 0x0

    .line 672
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x0:Ln7;

    .line 673
    .line 674
    if-ne v5, v11, :cond_32

    .line 675
    .line 676
    iget v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p0:I

    .line 677
    .line 678
    if-ne v12, v11, :cond_2f

    .line 679
    .line 680
    if-eqz v10, :cond_32

    .line 681
    .line 682
    :cond_2f
    iget-boolean v3, v6, Lmj0;->e:Z

    .line 683
    .line 684
    if-eqz v3, :cond_30

    .line 685
    .line 686
    goto/16 :goto_19

    .line 687
    .line 688
    :cond_30
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 689
    .line 690
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 691
    .line 692
    .line 693
    iput-object v7, v9, Ln7;->c:Ljava/lang/Object;

    .line 694
    .line 695
    iput v8, v9, Ln7;->b:I

    .line 696
    .line 697
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 698
    .line 699
    .line 700
    move-result v3

    .line 701
    iget v5, v6, Lmj0;->a:I

    .line 702
    .line 703
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h0:Lcom/google/android/flexbox/b;

    .line 704
    .line 705
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x0:Ln7;

    .line 706
    .line 707
    if-eqz v3, :cond_31

    .line 708
    .line 709
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 710
    .line 711
    const/16 v17, 0x0

    .line 712
    .line 713
    move-object/from16 v19, v3

    .line 714
    .line 715
    move/from16 v18, v5

    .line 716
    .line 717
    invoke-virtual/range {v12 .. v19}, Lcom/google/android/flexbox/b;->b(Ln7;IIIIILjava/util/List;)V

    .line 718
    .line 719
    .line 720
    goto :goto_17

    .line 721
    :cond_31
    move/from16 v18, v5

    .line 722
    .line 723
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 724
    .line 725
    const/16 v17, 0x0

    .line 726
    .line 727
    move/from16 v19, v15

    .line 728
    .line 729
    move v15, v14

    .line 730
    move/from16 v14, v19

    .line 731
    .line 732
    move-object/from16 v19, v3

    .line 733
    .line 734
    invoke-virtual/range {v12 .. v19}, Lcom/google/android/flexbox/b;->b(Ln7;IIIIILjava/util/List;)V

    .line 735
    .line 736
    .line 737
    move/from16 v20, v15

    .line 738
    .line 739
    move v15, v14

    .line 740
    move/from16 v14, v20

    .line 741
    .line 742
    :goto_17
    iget-object v3, v9, Ln7;->c:Ljava/lang/Object;

    .line 743
    .line 744
    check-cast v3, Ljava/util/List;

    .line 745
    .line 746
    iput-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 747
    .line 748
    invoke-virtual {v4, v14, v15, v8}, Lcom/google/android/flexbox/b;->h(III)V

    .line 749
    .line 750
    .line 751
    invoke-virtual {v4, v8}, Lcom/google/android/flexbox/b;->u(I)V

    .line 752
    .line 753
    .line 754
    iget-object v3, v4, Lcom/google/android/flexbox/b;->c:[I

    .line 755
    .line 756
    iget v4, v6, Lmj0;->a:I

    .line 757
    .line 758
    aget v3, v3, v4

    .line 759
    .line 760
    iput v3, v6, Lmj0;->b:I

    .line 761
    .line 762
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 763
    .line 764
    iput v3, v4, Lnj0;->c:I

    .line 765
    .line 766
    goto/16 :goto_19

    .line 767
    .line 768
    :cond_32
    iget v10, v6, Lmj0;->a:I

    .line 769
    .line 770
    if-eq v5, v11, :cond_33

    .line 771
    .line 772
    invoke-static {v5, v10}, Ljava/lang/Math;->min(II)I

    .line 773
    .line 774
    .line 775
    move-result v10

    .line 776
    :cond_33
    iput-object v7, v9, Ln7;->c:Ljava/lang/Object;

    .line 777
    .line 778
    iput v8, v9, Ln7;->b:I

    .line 779
    .line 780
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 781
    .line 782
    .line 783
    move-result v5

    .line 784
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 785
    .line 786
    if-eqz v5, :cond_35

    .line 787
    .line 788
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 789
    .line 790
    .line 791
    move-result v5

    .line 792
    if-lez v5, :cond_34

    .line 793
    .line 794
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 795
    .line 796
    invoke-virtual {v4, v10, v3}, Lcom/google/android/flexbox/b;->d(ILjava/util/List;)V

    .line 797
    .line 798
    .line 799
    iget v3, v6, Lmj0;->a:I

    .line 800
    .line 801
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 802
    .line 803
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h0:Lcom/google/android/flexbox/b;

    .line 804
    .line 805
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x0:Ln7;

    .line 806
    .line 807
    move/from16 v18, v3

    .line 808
    .line 809
    move-object/from16 v19, v5

    .line 810
    .line 811
    move/from16 v17, v10

    .line 812
    .line 813
    invoke-virtual/range {v12 .. v19}, Lcom/google/android/flexbox/b;->b(Ln7;IIIIILjava/util/List;)V

    .line 814
    .line 815
    .line 816
    goto :goto_18

    .line 817
    :cond_34
    invoke-virtual {v4, v3}, Lcom/google/android/flexbox/b;->i(I)V

    .line 818
    .line 819
    .line 820
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 821
    .line 822
    const/16 v18, -0x1

    .line 823
    .line 824
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h0:Lcom/google/android/flexbox/b;

    .line 825
    .line 826
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x0:Ln7;

    .line 827
    .line 828
    const/16 v17, 0x0

    .line 829
    .line 830
    move-object/from16 v19, v3

    .line 831
    .line 832
    invoke-virtual/range {v12 .. v19}, Lcom/google/android/flexbox/b;->b(Ln7;IIIIILjava/util/List;)V

    .line 833
    .line 834
    .line 835
    goto :goto_18

    .line 836
    :cond_35
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 837
    .line 838
    .line 839
    move-result v5

    .line 840
    if-lez v5, :cond_36

    .line 841
    .line 842
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 843
    .line 844
    invoke-virtual {v4, v10, v3}, Lcom/google/android/flexbox/b;->d(ILjava/util/List;)V

    .line 845
    .line 846
    .line 847
    iget v3, v6, Lmj0;->a:I

    .line 848
    .line 849
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 850
    .line 851
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h0:Lcom/google/android/flexbox/b;

    .line 852
    .line 853
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x0:Ln7;

    .line 854
    .line 855
    move/from16 v17, v15

    .line 856
    .line 857
    move v15, v14

    .line 858
    move/from16 v14, v17

    .line 859
    .line 860
    move/from16 v18, v3

    .line 861
    .line 862
    move-object/from16 v19, v5

    .line 863
    .line 864
    move/from16 v17, v10

    .line 865
    .line 866
    invoke-virtual/range {v12 .. v19}, Lcom/google/android/flexbox/b;->b(Ln7;IIIIILjava/util/List;)V

    .line 867
    .line 868
    .line 869
    move v10, v15

    .line 870
    move v15, v14

    .line 871
    move v14, v10

    .line 872
    move/from16 v10, v17

    .line 873
    .line 874
    goto :goto_18

    .line 875
    :cond_36
    invoke-virtual {v4, v3}, Lcom/google/android/flexbox/b;->i(I)V

    .line 876
    .line 877
    .line 878
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 879
    .line 880
    const/16 v18, -0x1

    .line 881
    .line 882
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h0:Lcom/google/android/flexbox/b;

    .line 883
    .line 884
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x0:Ln7;

    .line 885
    .line 886
    const/16 v17, 0x0

    .line 887
    .line 888
    move/from16 v19, v15

    .line 889
    .line 890
    move v15, v14

    .line 891
    move/from16 v14, v19

    .line 892
    .line 893
    move-object/from16 v19, v3

    .line 894
    .line 895
    invoke-virtual/range {v12 .. v19}, Lcom/google/android/flexbox/b;->b(Ln7;IIIIILjava/util/List;)V

    .line 896
    .line 897
    .line 898
    move/from16 v20, v15

    .line 899
    .line 900
    move v15, v14

    .line 901
    move/from16 v14, v20

    .line 902
    .line 903
    :goto_18
    iget-object v3, v9, Ln7;->c:Ljava/lang/Object;

    .line 904
    .line 905
    check-cast v3, Ljava/util/List;

    .line 906
    .line 907
    iput-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 908
    .line 909
    invoke-virtual {v4, v14, v15, v10}, Lcom/google/android/flexbox/b;->h(III)V

    .line 910
    .line 911
    .line 912
    invoke-virtual {v4, v10}, Lcom/google/android/flexbox/b;->u(I)V

    .line 913
    .line 914
    .line 915
    :goto_19
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 916
    .line 917
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->P0(Landroidx/recyclerview/widget/l;Ly12;Lnj0;)I

    .line 918
    .line 919
    .line 920
    iget-boolean v3, v6, Lmj0;->e:Z

    .line 921
    .line 922
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 923
    .line 924
    if-eqz v3, :cond_37

    .line 925
    .line 926
    iget v3, v4, Lnj0;->e:I

    .line 927
    .line 928
    const/4 v5, 0x1

    .line 929
    invoke-virtual {v0, v6, v5, v8}, Lcom/google/android/flexbox/FlexboxLayoutManager;->e1(Lmj0;ZZ)V

    .line 930
    .line 931
    .line 932
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 933
    .line 934
    invoke-virtual {v0, v1, v2, v4}, Lcom/google/android/flexbox/FlexboxLayoutManager;->P0(Landroidx/recyclerview/widget/l;Ly12;Lnj0;)I

    .line 935
    .line 936
    .line 937
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 938
    .line 939
    iget v4, v4, Lnj0;->e:I

    .line 940
    .line 941
    goto :goto_1a

    .line 942
    :cond_37
    const/4 v5, 0x1

    .line 943
    iget v4, v4, Lnj0;->e:I

    .line 944
    .line 945
    invoke-virtual {v0, v6, v5, v8}, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1(Lmj0;ZZ)V

    .line 946
    .line 947
    .line 948
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 949
    .line 950
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->P0(Landroidx/recyclerview/widget/l;Ly12;Lnj0;)I

    .line 951
    .line 952
    .line 953
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k0:Lnj0;

    .line 954
    .line 955
    iget v3, v3, Lnj0;->e:I

    .line 956
    .line 957
    :goto_1a
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k;->G()I

    .line 958
    .line 959
    .line 960
    move-result v7

    .line 961
    if-lez v7, :cond_39

    .line 962
    .line 963
    iget-boolean v6, v6, Lmj0;->e:Z

    .line 964
    .line 965
    if-eqz v6, :cond_38

    .line 966
    .line 967
    invoke-virtual {v0, v4, v1, v2, v5}, Lcom/google/android/flexbox/FlexboxLayoutManager;->W0(ILandroidx/recyclerview/widget/l;Ly12;Z)I

    .line 968
    .line 969
    .line 970
    move-result v4

    .line 971
    add-int/2addr v4, v3

    .line 972
    invoke-virtual {v0, v4, v1, v2, v8}, Lcom/google/android/flexbox/FlexboxLayoutManager;->X0(ILandroidx/recyclerview/widget/l;Ly12;Z)I

    .line 973
    .line 974
    .line 975
    return-void

    .line 976
    :cond_38
    invoke-virtual {v0, v3, v1, v2, v5}, Lcom/google/android/flexbox/FlexboxLayoutManager;->X0(ILandroidx/recyclerview/widget/l;Ly12;Z)I

    .line 977
    .line 978
    .line 979
    move-result v3

    .line 980
    add-int/2addr v3, v4

    .line 981
    invoke-virtual {v0, v3, v1, v2, v8}, Lcom/google/android/flexbox/FlexboxLayoutManager;->W0(ILandroidx/recyclerview/widget/l;Ly12;Z)I

    .line 982
    .line 983
    .line 984
    :cond_39
    :goto_1b
    return-void
.end method

.method public final m0(Ly12;)V
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->o0:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p0:I

    .line 6
    .line 7
    const/high16 v0, -0x80000000

    .line 8
    .line 9
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q0:I

    .line 10
    .line 11
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w0:I

    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l0:Lmj0;

    .line 14
    .line 15
    invoke-static {p1}, Lmj0;->b(Lmj0;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t0:Landroid/util/SparseArray;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/util/SparseArray;->clear()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final n0(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->o0:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->w0()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final o()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->b0:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    iget v0, p0, Landroidx/recyclerview/widget/k;->Y:I

    .line 17
    .line 18
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v0:Landroid/view/View;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move p0, v1

    .line 29
    :goto_0
    if-le v0, p0, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    return v1

    .line 33
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 34
    return p0
.end method

.method public final o0()Landroid/os/Parcelable;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->o0:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iget v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->a:I

    .line 11
    .line 12
    iput v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->a:I

    .line 13
    .line 14
    iget v0, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->b:I

    .line 15
    .line 16
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->b:I

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance v0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->G()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-lez v1, :cond_1

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/k;->F(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Landroidx/recyclerview/widget/k;->O(Landroid/view/View;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    iput v2, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->a:I

    .line 40
    .line 41
    iget-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 42
    .line 43
    invoke-virtual {v2, v1}, Lpc0;->e(Landroid/view/View;)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m0:Lpc0;

    .line 48
    .line 49
    invoke-virtual {p0}, Lpc0;->k()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    sub-int/2addr v1, p0

    .line 54
    iput v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->b:I

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_1
    const/4 p0, -0x1

    .line 58
    iput p0, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->a:I

    .line 59
    .line 60
    return-object v0
.end method

.method public final p()Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->b0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    xor-int/2addr p0, v1

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    iget v0, p0, Landroidx/recyclerview/widget/k;->Z:I

    .line 19
    .line 20
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v0:Landroid/view/View;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move p0, v2

    .line 31
    :goto_0
    if-le v0, p0, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    return v2

    .line 35
    :cond_3
    :goto_1
    return v1
.end method

.method public final q(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;

    .line 2
    .line 3
    return p0
.end method

.method public final setFlexLines(Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g0:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final u(Ly12;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->L0(Ly12;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final v(Ly12;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->M0(Ly12;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final w(Ly12;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->N0(Ly12;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final x(Ly12;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->L0(Ly12;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final x0(ILy12;Landroidx/recyclerview/widget/l;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->b0:I

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z0(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l0:Lmj0;

    .line 17
    .line 18
    iget p3, p2, Lmj0;->d:I

    .line 19
    .line 20
    add-int/2addr p3, p1

    .line 21
    iput p3, p2, Lmj0;->d:I

    .line 22
    .line 23
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n0:Lpc0;

    .line 24
    .line 25
    neg-int p2, p1

    .line 26
    invoke-virtual {p0, p2}, Lpc0;->p(I)V

    .line 27
    .line 28
    .line 29
    return p1

    .line 30
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Y0(ILy12;Landroidx/recyclerview/widget/l;)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t0:Landroid/util/SparseArray;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/util/SparseArray;->clear()V

    .line 37
    .line 38
    .line 39
    return p1
.end method

.method public final y(Ly12;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->M0(Ly12;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final y0(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p0:I

    .line 2
    .line 3
    const/high16 p1, -0x80000000

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q0:I

    .line 6
    .line 7
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->o0:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    iput v0, p1, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->a:I

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->w0()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final z(Ly12;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->N0(Ly12;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final z0(ILy12;Landroidx/recyclerview/widget/l;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->b0:I

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z0(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l0:Lmj0;

    .line 23
    .line 24
    iget p3, p2, Lmj0;->d:I

    .line 25
    .line 26
    add-int/2addr p3, p1

    .line 27
    iput p3, p2, Lmj0;->d:I

    .line 28
    .line 29
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n0:Lpc0;

    .line 30
    .line 31
    neg-int p2, p1

    .line 32
    invoke-virtual {p0, p2}, Lpc0;->p(I)V

    .line 33
    .line 34
    .line 35
    return p1

    .line 36
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Y0(ILy12;Landroidx/recyclerview/widget/l;)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t0:Landroid/util/SparseArray;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/util/SparseArray;->clear()V

    .line 43
    .line 44
    .line 45
    return p1
.end method

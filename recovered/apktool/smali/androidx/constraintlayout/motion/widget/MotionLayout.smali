.class public Landroidx/constraintlayout/motion/widget/MotionLayout;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lqm1;


# static fields
.field public static s1:Z


# instance fields
.field public A0:I

.field public B0:Ldk1;

.field public C0:Z

.field public final D0:Lch2;

.field public final E0:Lck1;

.field public F0:Lx70;

.field public G0:I

.field public H0:I

.field public I0:Z

.field public J0:F

.field public K0:F

.field public L0:J

.field public M0:F

.field public N0:Z

.field public O0:Ljava/util/ArrayList;

.field public P0:Ljava/util/ArrayList;

.field public Q0:Ljava/util/ArrayList;

.field public R0:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public S0:I

.field public T0:J

.field public U0:F

.field public V0:I

.field public W0:F

.field public X0:Z

.field public Y0:I

.field public Z0:I

.field public a1:I

.field public b1:I

.field public c1:I

.field public d1:I

.field public e1:F

.field public final f1:Ld31;

.field public g0:Llk1;

.field public g1:Z

.field public h0:Lak1;

.field public h1:Lfk1;

.field public i0:Landroid/view/animation/Interpolator;

.field public i1:Lji1;

.field public j0:F

.field public final j1:Landroid/graphics/Rect;

.field public k0:I

.field public k1:Z

.field public l0:I

.field public l1:Lhk1;

.field public m0:I

.field public final m1:Lek1;

.field public n0:I

.field public n1:Z

.field public o0:I

.field public final o1:Landroid/graphics/RectF;

.field public p0:Z

.field public p1:Landroid/view/View;

.field public final q0:Ljava/util/HashMap;

.field public q1:Landroid/graphics/Matrix;

.field public r0:J

.field public final r1:Ljava/util/ArrayList;

.field public s0:F

.field public t0:F

.field public u0:F

.field public v0:J

.field public w0:F

.field public x0:Z

.field public y0:Z

.field public z0:Lgk1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i0:Landroid/view/animation/Interpolator;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j0:F

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 12
    .line 13
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 14
    .line 15
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->n0:I

    .line 19
    .line 20
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->o0:I

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p0:Z

    .line 24
    .line 25
    new-instance v2, Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q0:Ljava/util/HashMap;

    .line 31
    .line 32
    const-wide/16 v2, 0x0

    .line 33
    .line 34
    iput-wide v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r0:J

    .line 35
    .line 36
    const/high16 v2, 0x3f800000    # 1.0f

    .line 37
    .line 38
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s0:F

    .line 39
    .line 40
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t0:F

    .line 41
    .line 42
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 43
    .line 44
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 45
    .line 46
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y0:Z

    .line 47
    .line 48
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A0:I

    .line 49
    .line 50
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->C0:Z

    .line 51
    .line 52
    new-instance v2, Lch2;

    .line 53
    .line 54
    invoke-direct {v2}, Lch2;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->D0:Lch2;

    .line 58
    .line 59
    new-instance v2, Lck1;

    .line 60
    .line 61
    invoke-direct {v2, p0}, Lck1;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 62
    .line 63
    .line 64
    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->E0:Lck1;

    .line 65
    .line 66
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->I0:Z

    .line 67
    .line 68
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N0:Z

    .line 69
    .line 70
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->O0:Ljava/util/ArrayList;

    .line 71
    .line 72
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->P0:Ljava/util/ArrayList;

    .line 73
    .line 74
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Q0:Ljava/util/ArrayList;

    .line 75
    .line 76
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->R0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 77
    .line 78
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->S0:I

    .line 79
    .line 80
    const-wide/16 v2, -0x1

    .line 81
    .line 82
    iput-wide v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->T0:J

    .line 83
    .line 84
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->U0:F

    .line 85
    .line 86
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->V0:I

    .line 87
    .line 88
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->W0:F

    .line 89
    .line 90
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->X0:Z

    .line 91
    .line 92
    new-instance v0, Ld31;

    .line 93
    .line 94
    invoke-direct {v0}, Ld31;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->f1:Ld31;

    .line 98
    .line 99
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:Z

    .line 100
    .line 101
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i1:Lji1;

    .line 102
    .line 103
    new-instance v0, Ljava/util/HashMap;

    .line 104
    .line 105
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 106
    .line 107
    .line 108
    new-instance v0, Landroid/graphics/Rect;

    .line 109
    .line 110
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 111
    .line 112
    .line 113
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:Landroid/graphics/Rect;

    .line 114
    .line 115
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k1:Z

    .line 116
    .line 117
    sget-object v0, Lhk1;->a:Lhk1;

    .line 118
    .line 119
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Lhk1;

    .line 120
    .line 121
    new-instance v0, Lek1;

    .line 122
    .line 123
    invoke-direct {v0, p0}, Lek1;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 124
    .line 125
    .line 126
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:Lek1;

    .line 127
    .line 128
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->n1:Z

    .line 129
    .line 130
    new-instance v0, Landroid/graphics/RectF;

    .line 131
    .line 132
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 133
    .line 134
    .line 135
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->o1:Landroid/graphics/RectF;

    .line 136
    .line 137
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p1:Landroid/view/View;

    .line 138
    .line 139
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q1:Landroid/graphics/Matrix;

    .line 140
    .line 141
    new-instance p1, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 144
    .line 145
    .line 146
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r1:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {p0, p2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->s(Landroid/util/AttributeSet;)V

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 152
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 153
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i0:Landroid/view/animation/Interpolator;

    const/4 p3, 0x0

    .line 154
    iput p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j0:F

    const/4 v0, -0x1

    .line 155
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 156
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 157
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    const/4 v0, 0x0

    .line 158
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->n0:I

    .line 159
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->o0:I

    const/4 v1, 0x1

    .line 160
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p0:Z

    .line 161
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q0:Ljava/util/HashMap;

    const-wide/16 v1, 0x0

    .line 162
    iput-wide v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r0:J

    const/high16 v1, 0x3f800000    # 1.0f

    .line 163
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s0:F

    .line 164
    iput p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t0:F

    .line 165
    iput p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 166
    iput p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 167
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y0:Z

    .line 168
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A0:I

    .line 169
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->C0:Z

    .line 170
    new-instance v1, Lch2;

    invoke-direct {v1}, Lch2;-><init>()V

    iput-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->D0:Lch2;

    .line 171
    new-instance v1, Lck1;

    invoke-direct {v1, p0}, Lck1;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    iput-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->E0:Lck1;

    .line 172
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->I0:Z

    .line 173
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N0:Z

    .line 174
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->O0:Ljava/util/ArrayList;

    .line 175
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->P0:Ljava/util/ArrayList;

    .line 176
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Q0:Ljava/util/ArrayList;

    .line 177
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->R0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 178
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->S0:I

    const-wide/16 v1, -0x1

    .line 179
    iput-wide v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->T0:J

    .line 180
    iput p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->U0:F

    .line 181
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->V0:I

    .line 182
    iput p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->W0:F

    .line 183
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->X0:Z

    .line 184
    new-instance p3, Ld31;

    invoke-direct {p3}, Ld31;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->f1:Ld31;

    .line 185
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:Z

    .line 186
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i1:Lji1;

    .line 187
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    .line 188
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:Landroid/graphics/Rect;

    .line 189
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k1:Z

    .line 190
    sget-object p3, Lhk1;->a:Lhk1;

    iput-object p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Lhk1;

    .line 191
    new-instance p3, Lek1;

    invoke-direct {p3, p0}, Lek1;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    iput-object p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:Lek1;

    .line 192
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->n1:Z

    .line 193
    new-instance p3, Landroid/graphics/RectF;

    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->o1:Landroid/graphics/RectF;

    .line 194
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p1:Landroid/view/View;

    .line 195
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q1:Landroid/graphics/Matrix;

    .line 196
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r1:Ljava/util/ArrayList;

    .line 197
    invoke-virtual {p0, p2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->s(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static j(Landroidx/constraintlayout/motion/widget/MotionLayout;Lzz;)Landroid/graphics/Rect;
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j1:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p1}, Lzz;->t()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput v0, p0, Landroid/graphics/Rect;->top:I

    .line 8
    .line 9
    invoke-virtual {p1}, Lzz;->s()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Landroid/graphics/Rect;->left:I

    .line 14
    .line 15
    invoke-virtual {p1}, Lzz;->r()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget v1, p0, Landroid/graphics/Rect;->left:I

    .line 20
    .line 21
    add-int/2addr v0, v1

    .line 22
    iput v0, p0, Landroid/graphics/Rect;->right:I

    .line 23
    .line 24
    invoke-virtual {p1}, Lzz;->l()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iget v0, p0, Landroid/graphics/Rect;->top:I

    .line 29
    .line 30
    add-int/2addr p1, v0

    .line 31
    iput p1, p0, Landroid/graphics/Rect;->bottom:I

    .line 32
    .line 33
    return-object p0
.end method


# virtual methods
.method public final A(I)V
    .locals 14

    .line 1
    invoke-super {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lfk1;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lfk1;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 19
    .line 20
    iput p1, p0, Lfk1;->d:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 24
    .line 25
    const/4 v1, -0x1

    .line 26
    if-eqz v0, :cond_6

    .line 27
    .line 28
    iget-object v0, v0, Llk1;->b:Ln7;

    .line 29
    .line 30
    if-eqz v0, :cond_6

    .line 31
    .line 32
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 33
    .line 34
    iget-object v0, v0, Ln7;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Landroid/util/SparseArray;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lwg2;

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    move v2, p1

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    iget-object v3, v0, Lwg2;->b:Ljava/util/ArrayList;

    .line 49
    .line 50
    iget v0, v0, Lwg2;->c:I

    .line 51
    .line 52
    if-ne v0, v2, :cond_3

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_5

    .line 64
    .line 65
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    check-cast v4, Lxg2;

    .line 70
    .line 71
    iget v4, v4, Lxg2;->e:I

    .line 72
    .line 73
    if-ne v2, v4, :cond_4

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    move v2, v0

    .line 77
    :goto_0
    if-eq v2, v1, :cond_6

    .line 78
    .line 79
    move p1, v2

    .line 80
    :cond_6
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 81
    .line 82
    if-ne v0, p1, :cond_7

    .line 83
    .line 84
    return-void

    .line 85
    :cond_7
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    if-ne v2, p1, :cond_8

    .line 89
    .line 90
    invoke-virtual {p0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->k(F)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_8
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 95
    .line 96
    const/high16 v4, 0x3f800000    # 1.0f

    .line 97
    .line 98
    if-ne v2, p1, :cond_9

    .line 99
    .line 100
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->k(F)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_9
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    if-eq v0, v1, :cond_a

    .line 108
    .line 109
    invoke-virtual {p0, v0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->y(II)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->k(F)V

    .line 113
    .line 114
    .line 115
    iput v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 116
    .line 117
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->k(F)V

    .line 118
    .line 119
    .line 120
    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i1:Lji1;

    .line 121
    .line 122
    return-void

    .line 123
    :cond_a
    const/4 v0, 0x0

    .line 124
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->C0:Z

    .line 125
    .line 126
    iput v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 127
    .line 128
    iput v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t0:F

    .line 129
    .line 130
    iput v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 131
    .line 132
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 133
    .line 134
    .line 135
    move-result-wide v5

    .line 136
    iput-wide v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v0:J

    .line 137
    .line 138
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 139
    .line 140
    .line 141
    move-result-wide v5

    .line 142
    iput-wide v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r0:J

    .line 143
    .line 144
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->x0:Z

    .line 145
    .line 146
    iput-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h0:Lak1;

    .line 147
    .line 148
    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 149
    .line 150
    invoke-virtual {v5}, Llk1;->c()I

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    int-to-float v5, v5

    .line 155
    const/high16 v6, 0x447a0000    # 1000.0f

    .line 156
    .line 157
    div-float/2addr v5, v6

    .line 158
    iput v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s0:F

    .line 159
    .line 160
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 161
    .line 162
    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 163
    .line 164
    iget v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 165
    .line 166
    invoke-virtual {v5, v1, v6}, Llk1;->n(II)V

    .line 167
    .line 168
    .line 169
    new-instance v1, Landroid/util/SparseArray;

    .line 170
    .line 171
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    iget-object v6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q0:Ljava/util/HashMap;

    .line 179
    .line 180
    invoke-virtual {v6}, Ljava/util/HashMap;->clear()V

    .line 181
    .line 182
    .line 183
    move v7, v0

    .line 184
    :goto_1
    if-ge v7, v5, :cond_b

    .line 185
    .line 186
    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 187
    .line 188
    .line 189
    move-result-object v8

    .line 190
    new-instance v9, Lzj1;

    .line 191
    .line 192
    invoke-direct {v9, v8}, Lzj1;-><init>(Landroid/view/View;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v6, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v8}, Landroid/view/View;->getId()I

    .line 199
    .line 200
    .line 201
    move-result v9

    .line 202
    invoke-virtual {v6, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    check-cast v8, Lzj1;

    .line 207
    .line 208
    invoke-virtual {v1, v9, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    add-int/lit8 v7, v7, 0x1

    .line 212
    .line 213
    goto :goto_1

    .line 214
    :cond_b
    const/4 v1, 0x1

    .line 215
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y0:Z

    .line 216
    .line 217
    iget-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 218
    .line 219
    invoke-virtual {v7, p1}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    iget-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:Lek1;

    .line 224
    .line 225
    invoke-virtual {v7, v2, p1}, Lek1;->e(Landroidx/constraintlayout/widget/d;Landroidx/constraintlayout/widget/d;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->v()V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v7}, Lek1;->a()V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    move v2, v0

    .line 239
    :goto_2
    if-ge v2, p1, :cond_e

    .line 240
    .line 241
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v8

    .line 249
    check-cast v8, Lzj1;

    .line 250
    .line 251
    if-nez v8, :cond_c

    .line 252
    .line 253
    goto/16 :goto_4

    .line 254
    .line 255
    :cond_c
    iget-object v9, v8, Lzj1;->f:Lik1;

    .line 256
    .line 257
    iput v3, v9, Lik1;->c:F

    .line 258
    .line 259
    iput v3, v9, Lik1;->d:F

    .line 260
    .line 261
    invoke-virtual {v7}, Landroid/view/View;->getX()F

    .line 262
    .line 263
    .line 264
    move-result v10

    .line 265
    invoke-virtual {v7}, Landroid/view/View;->getY()F

    .line 266
    .line 267
    .line 268
    move-result v11

    .line 269
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 270
    .line 271
    .line 272
    move-result v12

    .line 273
    int-to-float v12, v12

    .line 274
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    .line 275
    .line 276
    .line 277
    move-result v13

    .line 278
    int-to-float v13, v13

    .line 279
    invoke-virtual {v9, v10, v11, v12, v13}, Lik1;->d(FFFF)V

    .line 280
    .line 281
    .line 282
    iget-object v8, v8, Lzj1;->h:Lxj1;

    .line 283
    .line 284
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v7}, Landroid/view/View;->getX()F

    .line 288
    .line 289
    .line 290
    invoke-virtual {v7}, Landroid/view/View;->getY()F

    .line 291
    .line 292
    .line 293
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 294
    .line 295
    .line 296
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    .line 297
    .line 298
    .line 299
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 300
    .line 301
    .line 302
    move-result v9

    .line 303
    iput v9, v8, Lxj1;->c:I

    .line 304
    .line 305
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    if-eqz v9, :cond_d

    .line 310
    .line 311
    move v9, v3

    .line 312
    goto :goto_3

    .line 313
    :cond_d
    invoke-virtual {v7}, Landroid/view/View;->getAlpha()F

    .line 314
    .line 315
    .line 316
    move-result v9

    .line 317
    :goto_3
    iput v9, v8, Lxj1;->a:F

    .line 318
    .line 319
    invoke-virtual {v7}, Landroid/view/View;->getElevation()F

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    iput v9, v8, Lxj1;->d:F

    .line 324
    .line 325
    invoke-virtual {v7}, Landroid/view/View;->getRotation()F

    .line 326
    .line 327
    .line 328
    move-result v9

    .line 329
    iput v9, v8, Lxj1;->e:F

    .line 330
    .line 331
    invoke-virtual {v7}, Landroid/view/View;->getRotationX()F

    .line 332
    .line 333
    .line 334
    move-result v9

    .line 335
    iput v9, v8, Lxj1;->f:F

    .line 336
    .line 337
    invoke-virtual {v7}, Landroid/view/View;->getRotationY()F

    .line 338
    .line 339
    .line 340
    move-result v9

    .line 341
    iput v9, v8, Lxj1;->i:F

    .line 342
    .line 343
    invoke-virtual {v7}, Landroid/view/View;->getScaleX()F

    .line 344
    .line 345
    .line 346
    move-result v9

    .line 347
    iput v9, v8, Lxj1;->v:F

    .line 348
    .line 349
    invoke-virtual {v7}, Landroid/view/View;->getScaleY()F

    .line 350
    .line 351
    .line 352
    move-result v9

    .line 353
    iput v9, v8, Lxj1;->w:F

    .line 354
    .line 355
    invoke-virtual {v7}, Landroid/view/View;->getPivotX()F

    .line 356
    .line 357
    .line 358
    move-result v9

    .line 359
    iput v9, v8, Lxj1;->U:F

    .line 360
    .line 361
    invoke-virtual {v7}, Landroid/view/View;->getPivotY()F

    .line 362
    .line 363
    .line 364
    move-result v9

    .line 365
    iput v9, v8, Lxj1;->V:F

    .line 366
    .line 367
    invoke-virtual {v7}, Landroid/view/View;->getTranslationX()F

    .line 368
    .line 369
    .line 370
    move-result v9

    .line 371
    iput v9, v8, Lxj1;->W:F

    .line 372
    .line 373
    invoke-virtual {v7}, Landroid/view/View;->getTranslationY()F

    .line 374
    .line 375
    .line 376
    move-result v9

    .line 377
    iput v9, v8, Lxj1;->X:F

    .line 378
    .line 379
    invoke-virtual {v7}, Landroid/view/View;->getTranslationZ()F

    .line 380
    .line 381
    .line 382
    move-result v7

    .line 383
    iput v7, v8, Lxj1;->Y:F

    .line 384
    .line 385
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 386
    .line 387
    goto/16 :goto_2

    .line 388
    .line 389
    :cond_e
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 390
    .line 391
    .line 392
    move-result p1

    .line 393
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    iget-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Q0:Ljava/util/ArrayList;

    .line 398
    .line 399
    if-eqz v7, :cond_13

    .line 400
    .line 401
    move v7, v0

    .line 402
    :goto_5
    if-ge v7, v5, :cond_10

    .line 403
    .line 404
    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 405
    .line 406
    .line 407
    move-result-object v8

    .line 408
    invoke-virtual {v6, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v8

    .line 412
    check-cast v8, Lzj1;

    .line 413
    .line 414
    if-nez v8, :cond_f

    .line 415
    .line 416
    goto :goto_6

    .line 417
    :cond_f
    iget-object v9, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 418
    .line 419
    invoke-virtual {v9, v8}, Llk1;->f(Lzj1;)V

    .line 420
    .line 421
    .line 422
    :goto_6
    add-int/lit8 v7, v7, 0x1

    .line 423
    .line 424
    goto :goto_5

    .line 425
    :cond_10
    iget-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Q0:Ljava/util/ArrayList;

    .line 426
    .line 427
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 428
    .line 429
    .line 430
    move-result-object v7

    .line 431
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 432
    .line 433
    .line 434
    move-result v8

    .line 435
    if-eqz v8, :cond_11

    .line 436
    .line 437
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v8

    .line 441
    check-cast v8, Landroidx/constraintlayout/motion/widget/MotionHelper;

    .line 442
    .line 443
    invoke-virtual {v8, p0, v6}, Landroidx/constraintlayout/motion/widget/MotionHelper;->r(Landroidx/constraintlayout/motion/widget/MotionLayout;Ljava/util/HashMap;)V

    .line 444
    .line 445
    .line 446
    goto :goto_7

    .line 447
    :cond_11
    move v7, v0

    .line 448
    :goto_8
    if-ge v7, v5, :cond_15

    .line 449
    .line 450
    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 451
    .line 452
    .line 453
    move-result-object v8

    .line 454
    invoke-virtual {v6, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v8

    .line 458
    check-cast v8, Lzj1;

    .line 459
    .line 460
    if-nez v8, :cond_12

    .line 461
    .line 462
    goto :goto_9

    .line 463
    :cond_12
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 464
    .line 465
    .line 466
    move-result-wide v9

    .line 467
    invoke-virtual {v8, v9, v10, p1, v2}, Lzj1;->h(JII)V

    .line 468
    .line 469
    .line 470
    :goto_9
    add-int/lit8 v7, v7, 0x1

    .line 471
    .line 472
    goto :goto_8

    .line 473
    :cond_13
    move v7, v0

    .line 474
    :goto_a
    if-ge v7, v5, :cond_15

    .line 475
    .line 476
    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 477
    .line 478
    .line 479
    move-result-object v8

    .line 480
    invoke-virtual {v6, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v8

    .line 484
    check-cast v8, Lzj1;

    .line 485
    .line 486
    if-nez v8, :cond_14

    .line 487
    .line 488
    goto :goto_b

    .line 489
    :cond_14
    iget-object v9, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 490
    .line 491
    invoke-virtual {v9, v8}, Llk1;->f(Lzj1;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 495
    .line 496
    .line 497
    move-result-wide v9

    .line 498
    invoke-virtual {v8, v9, v10, p1, v2}, Lzj1;->h(JII)V

    .line 499
    .line 500
    .line 501
    :goto_b
    add-int/lit8 v7, v7, 0x1

    .line 502
    .line 503
    goto :goto_a

    .line 504
    :cond_15
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 505
    .line 506
    iget-object p1, p1, Llk1;->c:Lkk1;

    .line 507
    .line 508
    if-eqz p1, :cond_16

    .line 509
    .line 510
    iget p1, p1, Lkk1;->i:F

    .line 511
    .line 512
    goto :goto_c

    .line 513
    :cond_16
    move p1, v3

    .line 514
    :goto_c
    cmpl-float v2, p1, v3

    .line 515
    .line 516
    if-eqz v2, :cond_18

    .line 517
    .line 518
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 519
    .line 520
    .line 521
    const v7, -0x800001

    .line 522
    .line 523
    .line 524
    move v8, v0

    .line 525
    :goto_d
    if-ge v8, v5, :cond_17

    .line 526
    .line 527
    invoke-virtual {p0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 528
    .line 529
    .line 530
    move-result-object v9

    .line 531
    invoke-virtual {v6, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v9

    .line 535
    check-cast v9, Lzj1;

    .line 536
    .line 537
    iget-object v9, v9, Lzj1;->g:Lik1;

    .line 538
    .line 539
    iget v10, v9, Lik1;->e:F

    .line 540
    .line 541
    iget v9, v9, Lik1;->f:F

    .line 542
    .line 543
    add-float/2addr v9, v10

    .line 544
    invoke-static {v2, v9}, Ljava/lang/Math;->min(FF)F

    .line 545
    .line 546
    .line 547
    move-result v2

    .line 548
    invoke-static {v7, v9}, Ljava/lang/Math;->max(FF)F

    .line 549
    .line 550
    .line 551
    move-result v7

    .line 552
    add-int/lit8 v8, v8, 0x1

    .line 553
    .line 554
    goto :goto_d

    .line 555
    :cond_17
    :goto_e
    if-ge v0, v5, :cond_18

    .line 556
    .line 557
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 558
    .line 559
    .line 560
    move-result-object v8

    .line 561
    invoke-virtual {v6, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v8

    .line 565
    check-cast v8, Lzj1;

    .line 566
    .line 567
    iget-object v9, v8, Lzj1;->g:Lik1;

    .line 568
    .line 569
    iget v10, v9, Lik1;->e:F

    .line 570
    .line 571
    iget v9, v9, Lik1;->f:F

    .line 572
    .line 573
    sub-float v11, v4, p1

    .line 574
    .line 575
    div-float v11, v4, v11

    .line 576
    .line 577
    iput v11, v8, Lzj1;->n:F

    .line 578
    .line 579
    add-float/2addr v10, v9

    .line 580
    sub-float/2addr v10, v2

    .line 581
    mul-float/2addr v10, p1

    .line 582
    sub-float v9, v7, v2

    .line 583
    .line 584
    div-float/2addr v10, v9

    .line 585
    sub-float v9, p1, v10

    .line 586
    .line 587
    iput v9, v8, Lzj1;->m:F

    .line 588
    .line 589
    add-int/lit8 v0, v0, 0x1

    .line 590
    .line 591
    goto :goto_e

    .line 592
    :cond_18
    iput v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t0:F

    .line 593
    .line 594
    iput v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 595
    .line 596
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y0:Z

    .line 597
    .line 598
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 599
    .line 600
    .line 601
    return-void
.end method

.method public final B(ILandroidx/constraintlayout/widget/d;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Llk1;->g:Landroid/util/SparseArray;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 11
    .line 12
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 19
    .line 20
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:Lek1;

    .line 27
    .line 28
    invoke-virtual {v2, v0, v1}, Lek1;->e(Landroidx/constraintlayout/widget/d;Landroidx/constraintlayout/widget/d;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->v()V

    .line 32
    .line 33
    .line 34
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 35
    .line 36
    if-ne v0, p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p2, p0}, Landroidx/constraintlayout/widget/d;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Q0:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Landroidx/constraintlayout/motion/widget/MotionHelper;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->m(Z)V

    .line 31
    .line 32
    .line 33
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    iget-object v3, v3, Llk1;->q:Lb5;

    .line 39
    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    iget-object v5, v3, Lb5;->f:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v5, Ljava/util/ArrayList;

    .line 45
    .line 46
    iget-object v6, v3, Lb5;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v6, Ljava/util/ArrayList;

    .line 49
    .line 50
    if-nez v6, :cond_1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_2

    .line 62
    .line 63
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    check-cast v7, Ld53;

    .line 68
    .line 69
    invoke-virtual {v7}, Ld53;->a()V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    iget-object v6, v3, Lb5;->e:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v6, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 81
    .line 82
    .line 83
    iget-object v5, v3, Lb5;->e:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v5, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_3

    .line 92
    .line 93
    iput-object v4, v3, Lb5;->e:Ljava/lang/Object;

    .line 94
    .line 95
    :cond_3
    :goto_2
    invoke-super/range {p0 .. p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 96
    .line 97
    .line 98
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 99
    .line 100
    if-nez v3, :cond_4

    .line 101
    .line 102
    goto/16 :goto_23

    .line 103
    .line 104
    :cond_4
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A0:I

    .line 105
    .line 106
    const/4 v5, 0x1

    .line 107
    and-int/2addr v3, v5

    .line 108
    const/high16 v6, 0x41300000    # 11.0f

    .line 109
    .line 110
    const/high16 v7, 0x41200000    # 10.0f

    .line 111
    .line 112
    if-ne v3, v5, :cond_b

    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_b

    .line 119
    .line 120
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->S0:I

    .line 121
    .line 122
    add-int/2addr v3, v5

    .line 123
    iput v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->S0:I

    .line 124
    .line 125
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 126
    .line 127
    .line 128
    move-result-wide v8

    .line 129
    iget-wide v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->T0:J

    .line 130
    .line 131
    const-wide/16 v12, -0x1

    .line 132
    .line 133
    cmp-long v3, v10, v12

    .line 134
    .line 135
    if-eqz v3, :cond_5

    .line 136
    .line 137
    sub-long v10, v8, v10

    .line 138
    .line 139
    const-wide/32 v12, 0xbebc200

    .line 140
    .line 141
    .line 142
    cmp-long v3, v10, v12

    .line 143
    .line 144
    if-lez v3, :cond_6

    .line 145
    .line 146
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->S0:I

    .line 147
    .line 148
    int-to-float v3, v3

    .line 149
    long-to-float v10, v10

    .line 150
    const v11, 0x3089705f    # 1.0E-9f

    .line 151
    .line 152
    .line 153
    mul-float/2addr v10, v11

    .line 154
    div-float/2addr v3, v10

    .line 155
    const/high16 v10, 0x42c80000    # 100.0f

    .line 156
    .line 157
    mul-float/2addr v3, v10

    .line 158
    float-to-int v3, v3

    .line 159
    int-to-float v3, v3

    .line 160
    div-float/2addr v3, v10

    .line 161
    iput v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->U0:F

    .line 162
    .line 163
    iput v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->S0:I

    .line 164
    .line 165
    iput-wide v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->T0:J

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_5
    iput-wide v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->T0:J

    .line 169
    .line 170
    :cond_6
    :goto_3
    new-instance v3, Landroid/graphics/Paint;

    .line 171
    .line 172
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 173
    .line 174
    .line 175
    const/high16 v8, 0x42280000    # 42.0f

    .line 176
    .line 177
    invoke-virtual {v3, v8}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    const/high16 v9, 0x447a0000    # 1000.0f

    .line 185
    .line 186
    mul-float/2addr v8, v9

    .line 187
    float-to-int v8, v8

    .line 188
    int-to-float v8, v8

    .line 189
    div-float/2addr v8, v7

    .line 190
    new-instance v9, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    iget v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->U0:F

    .line 196
    .line 197
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v10, " fps "

    .line 201
    .line 202
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    iget v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 206
    .line 207
    const-string v11, "UNDEFINED"

    .line 208
    .line 209
    const/4 v12, -0x1

    .line 210
    if-ne v10, v12, :cond_7

    .line 211
    .line 212
    move-object v10, v11

    .line 213
    goto :goto_4

    .line 214
    :cond_7
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 215
    .line 216
    .line 217
    move-result-object v13

    .line 218
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 219
    .line 220
    .line 221
    move-result-object v13

    .line 222
    invoke-virtual {v13, v10}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    :goto_4
    const-string v13, " -> "

    .line 227
    .line 228
    invoke-static {v9, v10, v13}, Lfm0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v9

    .line 232
    invoke-static {v9}, Len;->p(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    iget v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 237
    .line 238
    if-ne v10, v12, :cond_8

    .line 239
    .line 240
    move-object v10, v11

    .line 241
    goto :goto_5

    .line 242
    :cond_8
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 243
    .line 244
    .line 245
    move-result-object v13

    .line 246
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 247
    .line 248
    .line 249
    move-result-object v13

    .line 250
    invoke-virtual {v13, v10}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v10

    .line 254
    :goto_5
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    const-string v10, " (progress: "

    .line 258
    .line 259
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    const-string v8, " ) state="

    .line 266
    .line 267
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    iget v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 271
    .line 272
    if-ne v8, v12, :cond_9

    .line 273
    .line 274
    const-string v8, "undefined"

    .line 275
    .line 276
    goto :goto_7

    .line 277
    :cond_9
    if-ne v8, v12, :cond_a

    .line 278
    .line 279
    goto :goto_6

    .line 280
    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 281
    .line 282
    .line 283
    move-result-object v10

    .line 284
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 285
    .line 286
    .line 287
    move-result-object v10

    .line 288
    invoke-virtual {v10, v8}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v11

    .line 292
    :goto_6
    move-object v8, v11

    .line 293
    :goto_7
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v8

    .line 300
    const/high16 v9, -0x1000000

    .line 301
    .line 302
    invoke-virtual {v3, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    add-int/lit8 v9, v9, -0x1d

    .line 310
    .line 311
    int-to-float v9, v9

    .line 312
    invoke-virtual {v1, v8, v6, v9, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 313
    .line 314
    .line 315
    const v9, -0x77ff78

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 322
    .line 323
    .line 324
    move-result v9

    .line 325
    add-int/lit8 v9, v9, -0x1e

    .line 326
    .line 327
    int-to-float v9, v9

    .line 328
    invoke-virtual {v1, v8, v7, v9, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 329
    .line 330
    .line 331
    :cond_b
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A0:I

    .line 332
    .line 333
    if-le v3, v5, :cond_34

    .line 334
    .line 335
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->B0:Ldk1;

    .line 336
    .line 337
    if-nez v3, :cond_c

    .line 338
    .line 339
    new-instance v3, Ldk1;

    .line 340
    .line 341
    invoke-direct {v3, v0}, Ldk1;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 342
    .line 343
    .line 344
    iput-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->B0:Ldk1;

    .line 345
    .line 346
    :cond_c
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->B0:Ldk1;

    .line 347
    .line 348
    iget-object v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 349
    .line 350
    invoke-virtual {v8}, Llk1;->c()I

    .line 351
    .line 352
    .line 353
    move-result v8

    .line 354
    iget v9, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A0:I

    .line 355
    .line 356
    iget-object v10, v3, Ldk1;->g:Landroid/graphics/Paint;

    .line 357
    .line 358
    iget-object v11, v3, Ldk1;->f:Landroid/graphics/Paint;

    .line 359
    .line 360
    iget-object v12, v3, Ldk1;->i:Landroid/graphics/Paint;

    .line 361
    .line 362
    iget v13, v3, Ldk1;->m:I

    .line 363
    .line 364
    iget-object v14, v3, Ldk1;->e:Landroid/graphics/Paint;

    .line 365
    .line 366
    iget-object v15, v3, Ldk1;->n:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 367
    .line 368
    move/from16 v16, v2

    .line 369
    .line 370
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q0:Ljava/util/HashMap;

    .line 371
    .line 372
    if-eqz v2, :cond_34

    .line 373
    .line 374
    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    .line 375
    .line 376
    .line 377
    move-result v17

    .line 378
    if-nez v17, :cond_d

    .line 379
    .line 380
    goto/16 :goto_21

    .line 381
    .line 382
    :cond_d
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 383
    .line 384
    .line 385
    invoke-virtual {v15}, Landroid/view/View;->isInEditMode()Z

    .line 386
    .line 387
    .line 388
    move-result v17

    .line 389
    const/4 v4, 0x2

    .line 390
    if-nez v17, :cond_e

    .line 391
    .line 392
    and-int/lit8 v5, v9, 0x1

    .line 393
    .line 394
    if-ne v5, v4, :cond_e

    .line 395
    .line 396
    new-instance v5, Ljava/lang/StringBuilder;

    .line 397
    .line 398
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v15}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 402
    .line 403
    .line 404
    move-result-object v19

    .line 405
    invoke-virtual/range {v19 .. v19}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    iget v6, v15, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 410
    .line 411
    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    const-string v4, ":"

    .line 419
    .line 420
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v15}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v4

    .line 434
    invoke-virtual {v15}, Landroid/view/View;->getHeight()I

    .line 435
    .line 436
    .line 437
    move-result v5

    .line 438
    add-int/lit8 v5, v5, -0x1e

    .line 439
    .line 440
    int-to-float v5, v5

    .line 441
    iget-object v6, v3, Ldk1;->h:Landroid/graphics/Paint;

    .line 442
    .line 443
    invoke-virtual {v1, v4, v7, v5, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v15}, Landroid/view/View;->getHeight()I

    .line 447
    .line 448
    .line 449
    move-result v5

    .line 450
    add-int/lit8 v5, v5, -0x1d

    .line 451
    .line 452
    int-to-float v5, v5

    .line 453
    const/high16 v6, 0x41300000    # 11.0f

    .line 454
    .line 455
    invoke-virtual {v1, v4, v6, v5, v14}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 456
    .line 457
    .line 458
    :cond_e
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 467
    .line 468
    .line 469
    move-result v4

    .line 470
    if-eqz v4, :cond_33

    .line 471
    .line 472
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v4

    .line 476
    check-cast v4, Lzj1;

    .line 477
    .line 478
    iget-object v5, v4, Lzj1;->f:Lik1;

    .line 479
    .line 480
    iget-object v6, v4, Lzj1;->u:Ljava/util/ArrayList;

    .line 481
    .line 482
    iget v7, v5, Lik1;->b:I

    .line 483
    .line 484
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 485
    .line 486
    .line 487
    move-result-object v15

    .line 488
    :goto_9
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 489
    .line 490
    .line 491
    move-result v19

    .line 492
    if-eqz v19, :cond_f

    .line 493
    .line 494
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v19

    .line 498
    move-object/from16 v21, v2

    .line 499
    .line 500
    move-object/from16 v2, v19

    .line 501
    .line 502
    check-cast v2, Lik1;

    .line 503
    .line 504
    iget v2, v2, Lik1;->b:I

    .line 505
    .line 506
    invoke-static {v7, v2}, Ljava/lang/Math;->max(II)I

    .line 507
    .line 508
    .line 509
    move-result v7

    .line 510
    move-object/from16 v2, v21

    .line 511
    .line 512
    goto :goto_9

    .line 513
    :cond_f
    move-object/from16 v21, v2

    .line 514
    .line 515
    iget-object v2, v4, Lzj1;->g:Lik1;

    .line 516
    .line 517
    iget v2, v2, Lik1;->b:I

    .line 518
    .line 519
    invoke-static {v7, v2}, Ljava/lang/Math;->max(II)I

    .line 520
    .line 521
    .line 522
    move-result v2

    .line 523
    if-lez v9, :cond_10

    .line 524
    .line 525
    if-nez v2, :cond_10

    .line 526
    .line 527
    const/4 v2, 0x1

    .line 528
    :cond_10
    if-nez v2, :cond_11

    .line 529
    .line 530
    move-object/from16 v2, v21

    .line 531
    .line 532
    goto :goto_8

    .line 533
    :cond_11
    iget-object v7, v3, Ldk1;->c:[F

    .line 534
    .line 535
    iget-object v15, v3, Ldk1;->b:[I

    .line 536
    .line 537
    if-eqz v7, :cond_14

    .line 538
    .line 539
    move-object/from16 v19, v6

    .line 540
    .line 541
    iget-object v6, v4, Lzj1;->j:[Lpy0;

    .line 542
    .line 543
    aget-object v6, v6, v16

    .line 544
    .line 545
    invoke-virtual {v6}, Lpy0;->n0()[D

    .line 546
    .line 547
    .line 548
    move-result-object v6

    .line 549
    if-eqz v15, :cond_12

    .line 550
    .line 551
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 552
    .line 553
    .line 554
    move-result-object v22

    .line 555
    move/from16 v23, v16

    .line 556
    .line 557
    :goto_a
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    .line 558
    .line 559
    .line 560
    move-result v24

    .line 561
    if-eqz v24, :cond_12

    .line 562
    .line 563
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v24

    .line 567
    move-object/from16 v27, v7

    .line 568
    .line 569
    move-object/from16 v7, v24

    .line 570
    .line 571
    check-cast v7, Lik1;

    .line 572
    .line 573
    add-int/lit8 v24, v23, 0x1

    .line 574
    .line 575
    iget v7, v7, Lik1;->Z:I

    .line 576
    .line 577
    aput v7, v15, v23

    .line 578
    .line 579
    move/from16 v23, v24

    .line 580
    .line 581
    move-object/from16 v7, v27

    .line 582
    .line 583
    goto :goto_a

    .line 584
    :cond_12
    move-object/from16 v27, v7

    .line 585
    .line 586
    move/from16 v7, v16

    .line 587
    .line 588
    move/from16 v28, v7

    .line 589
    .line 590
    :goto_b
    array-length v15, v6

    .line 591
    if-ge v7, v15, :cond_13

    .line 592
    .line 593
    iget-object v15, v4, Lzj1;->j:[Lpy0;

    .line 594
    .line 595
    aget-object v15, v15, v16

    .line 596
    .line 597
    move/from16 v30, v7

    .line 598
    .line 599
    move/from16 v29, v8

    .line 600
    .line 601
    aget-wide v7, v6, v30

    .line 602
    .line 603
    move-object/from16 v31, v6

    .line 604
    .line 605
    iget-object v6, v4, Lzj1;->p:[D

    .line 606
    .line 607
    invoke-virtual {v15, v7, v8, v6}, Lpy0;->g0(D[D)V

    .line 608
    .line 609
    .line 610
    iget-object v6, v4, Lzj1;->f:Lik1;

    .line 611
    .line 612
    aget-wide v23, v31, v30

    .line 613
    .line 614
    iget-object v7, v4, Lzj1;->o:[I

    .line 615
    .line 616
    iget-object v8, v4, Lzj1;->p:[D

    .line 617
    .line 618
    move-object/from16 v22, v6

    .line 619
    .line 620
    move-object/from16 v25, v7

    .line 621
    .line 622
    move-object/from16 v26, v8

    .line 623
    .line 624
    invoke-virtual/range {v22 .. v28}, Lik1;->c(D[I[D[FI)V

    .line 625
    .line 626
    .line 627
    add-int/lit8 v28, v28, 0x2

    .line 628
    .line 629
    add-int/lit8 v7, v30, 0x1

    .line 630
    .line 631
    move/from16 v8, v29

    .line 632
    .line 633
    move-object/from16 v6, v31

    .line 634
    .line 635
    goto :goto_b

    .line 636
    :cond_13
    move/from16 v29, v8

    .line 637
    .line 638
    div-int/lit8 v28, v28, 0x2

    .line 639
    .line 640
    move/from16 v6, v28

    .line 641
    .line 642
    goto :goto_c

    .line 643
    :cond_14
    move-object/from16 v19, v6

    .line 644
    .line 645
    move/from16 v29, v8

    .line 646
    .line 647
    move/from16 v6, v16

    .line 648
    .line 649
    :goto_c
    iput v6, v3, Ldk1;->k:I

    .line 650
    .line 651
    const/4 v6, 0x1

    .line 652
    if-lt v2, v6, :cond_32

    .line 653
    .line 654
    div-int/lit8 v8, v29, 0x10

    .line 655
    .line 656
    iget-object v6, v3, Ldk1;->a:[F

    .line 657
    .line 658
    if-eqz v6, :cond_15

    .line 659
    .line 660
    array-length v6, v6

    .line 661
    mul-int/lit8 v7, v8, 0x2

    .line 662
    .line 663
    if-eq v6, v7, :cond_16

    .line 664
    .line 665
    :cond_15
    mul-int/lit8 v6, v8, 0x2

    .line 666
    .line 667
    new-array v6, v6, [F

    .line 668
    .line 669
    iput-object v6, v3, Ldk1;->a:[F

    .line 670
    .line 671
    new-instance v6, Landroid/graphics/Path;

    .line 672
    .line 673
    invoke-direct {v6}, Landroid/graphics/Path;-><init>()V

    .line 674
    .line 675
    .line 676
    iput-object v6, v3, Ldk1;->d:Landroid/graphics/Path;

    .line 677
    .line 678
    :cond_16
    int-to-float v6, v13

    .line 679
    invoke-virtual {v1, v6, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 680
    .line 681
    .line 682
    const/high16 v6, 0x77000000

    .line 683
    .line 684
    invoke-virtual {v14, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v12, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v11, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {v10, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 694
    .line 695
    .line 696
    iget-object v6, v3, Ldk1;->a:[F

    .line 697
    .line 698
    add-int/lit8 v7, v8, -0x1

    .line 699
    .line 700
    int-to-float v7, v7

    .line 701
    const/high16 v15, 0x3f800000    # 1.0f

    .line 702
    .line 703
    div-float v7, v15, v7

    .line 704
    .line 705
    move/from16 v30, v15

    .line 706
    .line 707
    iget-object v15, v4, Lzj1;->y:Ljava/util/HashMap;

    .line 708
    .line 709
    move-object/from16 v27, v6

    .line 710
    .line 711
    const-string v6, "translationX"

    .line 712
    .line 713
    if-nez v15, :cond_17

    .line 714
    .line 715
    const/4 v15, 0x0

    .line 716
    :goto_d
    move/from16 v31, v7

    .line 717
    .line 718
    goto :goto_e

    .line 719
    :cond_17
    invoke-virtual {v15, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v15

    .line 723
    check-cast v15, Lw43;

    .line 724
    .line 725
    goto :goto_d

    .line 726
    :goto_e
    iget-object v7, v4, Lzj1;->y:Ljava/util/HashMap;

    .line 727
    .line 728
    move/from16 v32, v9

    .line 729
    .line 730
    const-string v9, "translationY"

    .line 731
    .line 732
    if-nez v7, :cond_18

    .line 733
    .line 734
    const/4 v7, 0x0

    .line 735
    goto :goto_f

    .line 736
    :cond_18
    invoke-virtual {v7, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v7

    .line 740
    check-cast v7, Lw43;

    .line 741
    .line 742
    :goto_f
    iget-object v0, v4, Lzj1;->z:Ljava/util/HashMap;

    .line 743
    .line 744
    if-nez v0, :cond_19

    .line 745
    .line 746
    const/4 v0, 0x0

    .line 747
    goto :goto_10

    .line 748
    :cond_19
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    check-cast v0, La43;

    .line 753
    .line 754
    :goto_10
    iget-object v6, v4, Lzj1;->z:Ljava/util/HashMap;

    .line 755
    .line 756
    if-nez v6, :cond_1a

    .line 757
    .line 758
    const/4 v6, 0x0

    .line 759
    goto :goto_11

    .line 760
    :cond_1a
    invoke-virtual {v6, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object v6

    .line 764
    check-cast v6, La43;

    .line 765
    .line 766
    :goto_11
    move/from16 v9, v16

    .line 767
    .line 768
    :goto_12
    const/high16 v22, 0x7fc00000    # Float.NaN

    .line 769
    .line 770
    const/16 v23, 0x0

    .line 771
    .line 772
    if-ge v9, v8, :cond_29

    .line 773
    .line 774
    move/from16 v33, v8

    .line 775
    .line 776
    int-to-float v8, v9

    .line 777
    mul-float v8, v8, v31

    .line 778
    .line 779
    move/from16 v24, v8

    .line 780
    .line 781
    iget v8, v4, Lzj1;->n:F

    .line 782
    .line 783
    cmpl-float v25, v8, v30

    .line 784
    .line 785
    if-eqz v25, :cond_1d

    .line 786
    .line 787
    move/from16 v25, v8

    .line 788
    .line 789
    iget v8, v4, Lzj1;->m:F

    .line 790
    .line 791
    cmpg-float v26, v24, v8

    .line 792
    .line 793
    if-gez v26, :cond_1b

    .line 794
    .line 795
    move/from16 v26, v8

    .line 796
    .line 797
    move/from16 v8, v23

    .line 798
    .line 799
    goto :goto_13

    .line 800
    :cond_1b
    move/from16 v26, v8

    .line 801
    .line 802
    move/from16 v8, v24

    .line 803
    .line 804
    :goto_13
    cmpl-float v24, v8, v26

    .line 805
    .line 806
    move/from16 v35, v9

    .line 807
    .line 808
    move-object/from16 v34, v10

    .line 809
    .line 810
    if-lez v24, :cond_1c

    .line 811
    .line 812
    float-to-double v9, v8

    .line 813
    const-wide/high16 v36, 0x3ff0000000000000L    # 1.0

    .line 814
    .line 815
    cmpg-double v9, v9, v36

    .line 816
    .line 817
    if-gez v9, :cond_1c

    .line 818
    .line 819
    sub-float v8, v8, v26

    .line 820
    .line 821
    mul-float v8, v8, v25

    .line 822
    .line 823
    move/from16 v9, v30

    .line 824
    .line 825
    invoke-static {v8, v9}, Ljava/lang/Math;->min(FF)F

    .line 826
    .line 827
    .line 828
    move-result v8

    .line 829
    goto :goto_14

    .line 830
    :cond_1c
    move/from16 v9, v30

    .line 831
    .line 832
    goto :goto_14

    .line 833
    :cond_1d
    move/from16 v35, v9

    .line 834
    .line 835
    move-object/from16 v34, v10

    .line 836
    .line 837
    move/from16 v8, v24

    .line 838
    .line 839
    :goto_14
    float-to-double v9, v8

    .line 840
    move-wide/from16 v24, v9

    .line 841
    .line 842
    iget-object v9, v5, Lik1;->a:Lr4;

    .line 843
    .line 844
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 845
    .line 846
    .line 847
    move-result-object v10

    .line 848
    :goto_15
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 849
    .line 850
    .line 851
    move-result v26

    .line 852
    if-eqz v26, :cond_20

    .line 853
    .line 854
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 855
    .line 856
    .line 857
    move-result-object v26

    .line 858
    move-object/from16 v28, v10

    .line 859
    .line 860
    move-object/from16 v10, v26

    .line 861
    .line 862
    check-cast v10, Lik1;

    .line 863
    .line 864
    move-object/from16 v36, v5

    .line 865
    .line 866
    iget-object v5, v10, Lik1;->a:Lr4;

    .line 867
    .line 868
    if-eqz v5, :cond_1f

    .line 869
    .line 870
    move-object/from16 v26, v5

    .line 871
    .line 872
    iget v5, v10, Lik1;->c:F

    .line 873
    .line 874
    cmpg-float v37, v5, v8

    .line 875
    .line 876
    if-gez v37, :cond_1e

    .line 877
    .line 878
    move/from16 v23, v5

    .line 879
    .line 880
    move-object/from16 v9, v26

    .line 881
    .line 882
    goto :goto_16

    .line 883
    :cond_1e
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->isNaN(F)Z

    .line 884
    .line 885
    .line 886
    move-result v5

    .line 887
    if-eqz v5, :cond_1f

    .line 888
    .line 889
    iget v5, v10, Lik1;->c:F

    .line 890
    .line 891
    move/from16 v22, v5

    .line 892
    .line 893
    :cond_1f
    :goto_16
    move-object/from16 v10, v28

    .line 894
    .line 895
    move-object/from16 v5, v36

    .line 896
    .line 897
    goto :goto_15

    .line 898
    :cond_20
    move-object/from16 v36, v5

    .line 899
    .line 900
    if-eqz v9, :cond_22

    .line 901
    .line 902
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->isNaN(F)Z

    .line 903
    .line 904
    .line 905
    move-result v5

    .line 906
    if-eqz v5, :cond_21

    .line 907
    .line 908
    const/high16 v22, 0x3f800000    # 1.0f

    .line 909
    .line 910
    :cond_21
    sub-float v5, v8, v23

    .line 911
    .line 912
    sub-float v22, v22, v23

    .line 913
    .line 914
    div-float v5, v5, v22

    .line 915
    .line 916
    move-object v10, v12

    .line 917
    move/from16 v37, v13

    .line 918
    .line 919
    float-to-double v12, v5

    .line 920
    invoke-virtual {v9, v12, v13}, Lr4;->a(D)D

    .line 921
    .line 922
    .line 923
    move-result-wide v12

    .line 924
    double-to-float v5, v12

    .line 925
    mul-float v5, v5, v22

    .line 926
    .line 927
    add-float v5, v5, v23

    .line 928
    .line 929
    float-to-double v12, v5

    .line 930
    goto :goto_17

    .line 931
    :cond_22
    move-object v10, v12

    .line 932
    move/from16 v37, v13

    .line 933
    .line 934
    move-wide/from16 v12, v24

    .line 935
    .line 936
    :goto_17
    iget-object v5, v4, Lzj1;->j:[Lpy0;

    .line 937
    .line 938
    aget-object v5, v5, v16

    .line 939
    .line 940
    iget-object v9, v4, Lzj1;->p:[D

    .line 941
    .line 942
    invoke-virtual {v5, v12, v13, v9}, Lpy0;->g0(D[D)V

    .line 943
    .line 944
    .line 945
    iget-object v5, v4, Lzj1;->k:Lwc;

    .line 946
    .line 947
    if-eqz v5, :cond_23

    .line 948
    .line 949
    iget-object v9, v4, Lzj1;->p:[D

    .line 950
    .line 951
    move-object/from16 v38, v10

    .line 952
    .line 953
    array-length v10, v9

    .line 954
    if-lez v10, :cond_24

    .line 955
    .line 956
    invoke-virtual {v5, v12, v13, v9}, Lwc;->g0(D[D)V

    .line 957
    .line 958
    .line 959
    goto :goto_18

    .line 960
    :cond_23
    move-object/from16 v38, v10

    .line 961
    .line 962
    :cond_24
    :goto_18
    iget-object v5, v4, Lzj1;->f:Lik1;

    .line 963
    .line 964
    iget-object v9, v4, Lzj1;->o:[I

    .line 965
    .line 966
    iget-object v10, v4, Lzj1;->p:[D

    .line 967
    .line 968
    mul-int/lit8 v28, v35, 0x2

    .line 969
    .line 970
    move-object/from16 v22, v5

    .line 971
    .line 972
    move-object/from16 v25, v9

    .line 973
    .line 974
    move-object/from16 v26, v10

    .line 975
    .line 976
    move-wide/from16 v23, v12

    .line 977
    .line 978
    invoke-virtual/range {v22 .. v28}, Lik1;->c(D[I[D[FI)V

    .line 979
    .line 980
    .line 981
    if-eqz v0, :cond_25

    .line 982
    .line 983
    aget v5, v27, v28

    .line 984
    .line 985
    invoke-virtual {v0, v8}, La43;->a(F)F

    .line 986
    .line 987
    .line 988
    move-result v9

    .line 989
    add-float/2addr v9, v5

    .line 990
    aput v9, v27, v28

    .line 991
    .line 992
    goto :goto_19

    .line 993
    :cond_25
    if-eqz v15, :cond_26

    .line 994
    .line 995
    aget v5, v27, v28

    .line 996
    .line 997
    invoke-virtual {v15, v8}, Lw43;->a(F)F

    .line 998
    .line 999
    .line 1000
    move-result v9

    .line 1001
    add-float/2addr v9, v5

    .line 1002
    aput v9, v27, v28

    .line 1003
    .line 1004
    :cond_26
    :goto_19
    if-eqz v6, :cond_27

    .line 1005
    .line 1006
    add-int/lit8 v28, v28, 0x1

    .line 1007
    .line 1008
    aget v5, v27, v28

    .line 1009
    .line 1010
    invoke-virtual {v6, v8}, La43;->a(F)F

    .line 1011
    .line 1012
    .line 1013
    move-result v8

    .line 1014
    add-float/2addr v8, v5

    .line 1015
    aput v8, v27, v28

    .line 1016
    .line 1017
    goto :goto_1a

    .line 1018
    :cond_27
    if-eqz v7, :cond_28

    .line 1019
    .line 1020
    add-int/lit8 v28, v28, 0x1

    .line 1021
    .line 1022
    aget v5, v27, v28

    .line 1023
    .line 1024
    invoke-virtual {v7, v8}, Lw43;->a(F)F

    .line 1025
    .line 1026
    .line 1027
    move-result v8

    .line 1028
    add-float/2addr v8, v5

    .line 1029
    aput v8, v27, v28

    .line 1030
    .line 1031
    :cond_28
    :goto_1a
    add-int/lit8 v9, v35, 0x1

    .line 1032
    .line 1033
    move/from16 v8, v33

    .line 1034
    .line 1035
    move-object/from16 v10, v34

    .line 1036
    .line 1037
    move-object/from16 v5, v36

    .line 1038
    .line 1039
    move/from16 v13, v37

    .line 1040
    .line 1041
    move-object/from16 v12, v38

    .line 1042
    .line 1043
    const/high16 v30, 0x3f800000    # 1.0f

    .line 1044
    .line 1045
    goto/16 :goto_12

    .line 1046
    .line 1047
    :cond_29
    move-object/from16 v36, v5

    .line 1048
    .line 1049
    move-object/from16 v34, v10

    .line 1050
    .line 1051
    move-object/from16 v38, v12

    .line 1052
    .line 1053
    move/from16 v37, v13

    .line 1054
    .line 1055
    iget v0, v3, Ldk1;->k:I

    .line 1056
    .line 1057
    invoke-virtual {v3, v1, v2, v0, v4}, Ldk1;->a(Landroid/graphics/Canvas;IILzj1;)V

    .line 1058
    .line 1059
    .line 1060
    const/16 v0, -0x55cd

    .line 1061
    .line 1062
    invoke-virtual {v14, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1063
    .line 1064
    .line 1065
    const v0, -0x1f8a66

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v11, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1069
    .line 1070
    .line 1071
    move-object/from16 v10, v38

    .line 1072
    .line 1073
    invoke-virtual {v10, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1074
    .line 1075
    .line 1076
    const v0, -0xcc5600

    .line 1077
    .line 1078
    .line 1079
    move-object/from16 v5, v34

    .line 1080
    .line 1081
    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1082
    .line 1083
    .line 1084
    move/from16 v0, v37

    .line 1085
    .line 1086
    neg-int v6, v0

    .line 1087
    int-to-float v6, v6

    .line 1088
    invoke-virtual {v1, v6, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1089
    .line 1090
    .line 1091
    iget v6, v3, Ldk1;->k:I

    .line 1092
    .line 1093
    invoke-virtual {v3, v1, v2, v6, v4}, Ldk1;->a(Landroid/graphics/Canvas;IILzj1;)V

    .line 1094
    .line 1095
    .line 1096
    const/4 v6, 0x5

    .line 1097
    if-ne v2, v6, :cond_31

    .line 1098
    .line 1099
    iget-object v2, v3, Ldk1;->j:[F

    .line 1100
    .line 1101
    iget-object v7, v3, Ldk1;->d:Landroid/graphics/Path;

    .line 1102
    .line 1103
    invoke-virtual {v7}, Landroid/graphics/Path;->reset()V

    .line 1104
    .line 1105
    .line 1106
    move/from16 v7, v16

    .line 1107
    .line 1108
    :goto_1b
    const/16 v9, 0x32

    .line 1109
    .line 1110
    if-gt v7, v9, :cond_30

    .line 1111
    .line 1112
    int-to-float v9, v7

    .line 1113
    const/high16 v12, 0x42480000    # 50.0f

    .line 1114
    .line 1115
    div-float/2addr v9, v12

    .line 1116
    const/4 v12, 0x0

    .line 1117
    invoke-virtual {v4, v9, v12}, Lzj1;->b(F[F)F

    .line 1118
    .line 1119
    .line 1120
    move-result v9

    .line 1121
    iget-object v13, v4, Lzj1;->j:[Lpy0;

    .line 1122
    .line 1123
    aget-object v13, v13, v16

    .line 1124
    .line 1125
    move v15, v6

    .line 1126
    move/from16 v18, v7

    .line 1127
    .line 1128
    float-to-double v6, v9

    .line 1129
    iget-object v9, v4, Lzj1;->p:[D

    .line 1130
    .line 1131
    invoke-virtual {v13, v6, v7, v9}, Lpy0;->g0(D[D)V

    .line 1132
    .line 1133
    .line 1134
    iget-object v6, v4, Lzj1;->o:[I

    .line 1135
    .line 1136
    iget-object v7, v4, Lzj1;->p:[D

    .line 1137
    .line 1138
    move-object/from16 v9, v36

    .line 1139
    .line 1140
    iget v13, v9, Lik1;->e:F

    .line 1141
    .line 1142
    iget v12, v9, Lik1;->f:F

    .line 1143
    .line 1144
    move/from16 v24, v15

    .line 1145
    .line 1146
    iget v15, v9, Lik1;->i:F

    .line 1147
    .line 1148
    const/high16 v25, 0x40000000    # 2.0f

    .line 1149
    .line 1150
    iget v8, v9, Lik1;->v:F

    .line 1151
    .line 1152
    move/from16 v37, v0

    .line 1153
    .line 1154
    move-object/from16 v26, v2

    .line 1155
    .line 1156
    move/from16 v0, v16

    .line 1157
    .line 1158
    :goto_1c
    array-length v2, v6

    .line 1159
    move-object/from16 v27, v4

    .line 1160
    .line 1161
    if-ge v0, v2, :cond_2e

    .line 1162
    .line 1163
    move-object/from16 v34, v5

    .line 1164
    .line 1165
    aget-wide v4, v7, v0

    .line 1166
    .line 1167
    double-to-float v4, v4

    .line 1168
    aget v5, v6, v0

    .line 1169
    .line 1170
    const/4 v2, 0x1

    .line 1171
    if-eq v5, v2, :cond_2d

    .line 1172
    .line 1173
    const/4 v2, 0x2

    .line 1174
    if-eq v5, v2, :cond_2c

    .line 1175
    .line 1176
    const/4 v2, 0x3

    .line 1177
    if-eq v5, v2, :cond_2b

    .line 1178
    .line 1179
    const/4 v2, 0x4

    .line 1180
    if-eq v5, v2, :cond_2a

    .line 1181
    .line 1182
    goto :goto_1d

    .line 1183
    :cond_2a
    move v8, v4

    .line 1184
    goto :goto_1d

    .line 1185
    :cond_2b
    move v15, v4

    .line 1186
    goto :goto_1d

    .line 1187
    :cond_2c
    move v12, v4

    .line 1188
    goto :goto_1d

    .line 1189
    :cond_2d
    move v13, v4

    .line 1190
    :goto_1d
    add-int/lit8 v0, v0, 0x1

    .line 1191
    .line 1192
    move-object/from16 v4, v27

    .line 1193
    .line 1194
    move-object/from16 v5, v34

    .line 1195
    .line 1196
    goto :goto_1c

    .line 1197
    :cond_2e
    move-object/from16 v34, v5

    .line 1198
    .line 1199
    iget-object v0, v9, Lik1;->X:Lzj1;

    .line 1200
    .line 1201
    if-eqz v0, :cond_2f

    .line 1202
    .line 1203
    float-to-double v4, v13

    .line 1204
    float-to-double v6, v12

    .line 1205
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    .line 1206
    .line 1207
    .line 1208
    move-result-wide v12

    .line 1209
    mul-double/2addr v12, v4

    .line 1210
    const-wide/16 v30, 0x0

    .line 1211
    .line 1212
    add-double v12, v12, v30

    .line 1213
    .line 1214
    div-float v0, v15, v25

    .line 1215
    .line 1216
    move-object/from16 v33, v3

    .line 1217
    .line 1218
    float-to-double v2, v0

    .line 1219
    sub-double/2addr v12, v2

    .line 1220
    double-to-float v13, v12

    .line 1221
    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    .line 1222
    .line 1223
    .line 1224
    move-result-wide v2

    .line 1225
    mul-double/2addr v2, v4

    .line 1226
    sub-double v30, v30, v2

    .line 1227
    .line 1228
    div-float v0, v8, v25

    .line 1229
    .line 1230
    float-to-double v2, v0

    .line 1231
    sub-double v2, v30, v2

    .line 1232
    .line 1233
    double-to-float v12, v2

    .line 1234
    goto :goto_1e

    .line 1235
    :cond_2f
    move-object/from16 v33, v3

    .line 1236
    .line 1237
    :goto_1e
    add-float/2addr v15, v13

    .line 1238
    add-float/2addr v8, v12

    .line 1239
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->isNaN(F)Z

    .line 1240
    .line 1241
    .line 1242
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->isNaN(F)Z

    .line 1243
    .line 1244
    .line 1245
    add-float v13, v13, v23

    .line 1246
    .line 1247
    add-float v12, v12, v23

    .line 1248
    .line 1249
    add-float v15, v15, v23

    .line 1250
    .line 1251
    add-float v8, v8, v23

    .line 1252
    .line 1253
    aput v13, v26, v16

    .line 1254
    .line 1255
    const/16 v17, 0x1

    .line 1256
    .line 1257
    aput v12, v26, v17

    .line 1258
    .line 1259
    const/16 v20, 0x2

    .line 1260
    .line 1261
    aput v15, v26, v20

    .line 1262
    .line 1263
    const/16 v28, 0x3

    .line 1264
    .line 1265
    aput v12, v26, v28

    .line 1266
    .line 1267
    const/4 v2, 0x4

    .line 1268
    aput v15, v26, v2

    .line 1269
    .line 1270
    aput v8, v26, v24

    .line 1271
    .line 1272
    const/4 v0, 0x6

    .line 1273
    aput v13, v26, v0

    .line 1274
    .line 1275
    const/4 v3, 0x7

    .line 1276
    aput v8, v26, v3

    .line 1277
    .line 1278
    move-object/from16 v4, v33

    .line 1279
    .line 1280
    iget-object v5, v4, Ldk1;->d:Landroid/graphics/Path;

    .line 1281
    .line 1282
    invoke-virtual {v5, v13, v12}, Landroid/graphics/Path;->moveTo(FF)V

    .line 1283
    .line 1284
    .line 1285
    iget-object v5, v4, Ldk1;->d:Landroid/graphics/Path;

    .line 1286
    .line 1287
    aget v6, v26, v20

    .line 1288
    .line 1289
    aget v7, v26, v28

    .line 1290
    .line 1291
    invoke-virtual {v5, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1292
    .line 1293
    .line 1294
    iget-object v5, v4, Ldk1;->d:Landroid/graphics/Path;

    .line 1295
    .line 1296
    const/4 v2, 0x4

    .line 1297
    aget v2, v26, v2

    .line 1298
    .line 1299
    aget v6, v26, v24

    .line 1300
    .line 1301
    invoke-virtual {v5, v2, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1302
    .line 1303
    .line 1304
    iget-object v2, v4, Ldk1;->d:Landroid/graphics/Path;

    .line 1305
    .line 1306
    aget v0, v26, v0

    .line 1307
    .line 1308
    aget v3, v26, v3

    .line 1309
    .line 1310
    invoke-virtual {v2, v0, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1311
    .line 1312
    .line 1313
    iget-object v0, v4, Ldk1;->d:Landroid/graphics/Path;

    .line 1314
    .line 1315
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 1316
    .line 1317
    .line 1318
    add-int/lit8 v7, v18, 0x1

    .line 1319
    .line 1320
    move-object v3, v4

    .line 1321
    move-object/from16 v36, v9

    .line 1322
    .line 1323
    move/from16 v6, v24

    .line 1324
    .line 1325
    move-object/from16 v2, v26

    .line 1326
    .line 1327
    move-object/from16 v4, v27

    .line 1328
    .line 1329
    move-object/from16 v5, v34

    .line 1330
    .line 1331
    move/from16 v0, v37

    .line 1332
    .line 1333
    goto/16 :goto_1b

    .line 1334
    .line 1335
    :cond_30
    move/from16 v37, v0

    .line 1336
    .line 1337
    move-object v4, v3

    .line 1338
    move-object/from16 v34, v5

    .line 1339
    .line 1340
    const/16 v17, 0x1

    .line 1341
    .line 1342
    const/16 v20, 0x2

    .line 1343
    .line 1344
    const/high16 v25, 0x40000000    # 2.0f

    .line 1345
    .line 1346
    const/high16 v0, 0x44000000    # 512.0f

    .line 1347
    .line 1348
    invoke-virtual {v14, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1349
    .line 1350
    .line 1351
    move/from16 v0, v25

    .line 1352
    .line 1353
    invoke-virtual {v1, v0, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1354
    .line 1355
    .line 1356
    iget-object v0, v4, Ldk1;->d:Landroid/graphics/Path;

    .line 1357
    .line 1358
    invoke-virtual {v1, v0, v14}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 1359
    .line 1360
    .line 1361
    const/high16 v0, -0x40000000    # -2.0f

    .line 1362
    .line 1363
    invoke-virtual {v1, v0, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1364
    .line 1365
    .line 1366
    const/high16 v0, -0x10000

    .line 1367
    .line 1368
    invoke-virtual {v14, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1369
    .line 1370
    .line 1371
    iget-object v0, v4, Ldk1;->d:Landroid/graphics/Path;

    .line 1372
    .line 1373
    invoke-virtual {v1, v0, v14}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 1374
    .line 1375
    .line 1376
    goto :goto_20

    .line 1377
    :cond_31
    move/from16 v37, v0

    .line 1378
    .line 1379
    move-object v4, v3

    .line 1380
    move-object/from16 v34, v5

    .line 1381
    .line 1382
    const/16 v17, 0x1

    .line 1383
    .line 1384
    :goto_1f
    const/16 v20, 0x2

    .line 1385
    .line 1386
    goto :goto_20

    .line 1387
    :cond_32
    move-object v4, v3

    .line 1388
    move/from16 v17, v6

    .line 1389
    .line 1390
    move/from16 v32, v9

    .line 1391
    .line 1392
    move-object/from16 v34, v10

    .line 1393
    .line 1394
    move-object v10, v12

    .line 1395
    move/from16 v37, v13

    .line 1396
    .line 1397
    goto :goto_1f

    .line 1398
    :goto_20
    move-object/from16 v0, p0

    .line 1399
    .line 1400
    move-object v3, v4

    .line 1401
    move-object v12, v10

    .line 1402
    move-object/from16 v2, v21

    .line 1403
    .line 1404
    move/from16 v8, v29

    .line 1405
    .line 1406
    move/from16 v9, v32

    .line 1407
    .line 1408
    move-object/from16 v10, v34

    .line 1409
    .line 1410
    move/from16 v13, v37

    .line 1411
    .line 1412
    goto/16 :goto_8

    .line 1413
    .line 1414
    :cond_33
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 1415
    .line 1416
    .line 1417
    :cond_34
    :goto_21
    move-object/from16 v0, p0

    .line 1418
    .line 1419
    iget-object v0, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Q0:Ljava/util/ArrayList;

    .line 1420
    .line 1421
    if-eqz v0, :cond_35

    .line 1422
    .line 1423
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v0

    .line 1427
    :goto_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1428
    .line 1429
    .line 1430
    move-result v1

    .line 1431
    if-eqz v1, :cond_35

    .line 1432
    .line 1433
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v1

    .line 1437
    check-cast v1, Landroidx/constraintlayout/motion/widget/MotionHelper;

    .line 1438
    .line 1439
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1440
    .line 1441
    .line 1442
    goto :goto_22

    .line 1443
    :cond_35
    :goto_23
    return-void
.end method

.method public final f(I)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->V:Lsz;

    .line 3
    .line 4
    return-void
.end method

.method public getConstraintSetIds()[I
    .locals 4

    .line 1
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    iget-object p0, p0, Llk1;->g:Landroid/util/SparseArray;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    new-array v1, v0, [I

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    aput v3, v1, v2

    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-object v1
.end method

.method public getCurrentState()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 2
    .line 3
    return p0
.end method

.method public getDefinedTransitions()Ljava/util/ArrayList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lkk1;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    iget-object p0, p0, Llk1;->d:Ljava/util/ArrayList;

    .line 8
    .line 9
    return-object p0
.end method

.method public getDesignTool()Lx70;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->F0:Lx70;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lx70;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->F0:Lx70;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->F0:Lx70;

    .line 13
    .line 14
    return-object p0
.end method

.method public getEndState()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 2
    .line 3
    return p0
.end method

.method public getNanoTime()J
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public getProgress()F
    .locals 0

    .line 1
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 2
    .line 3
    return p0
.end method

.method public getScene()Llk1;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 2
    .line 3
    return-object p0
.end method

.method public getStartState()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 2
    .line 3
    return p0
.end method

.method public getTargetPosition()F
    .locals 0

    .line 1
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 2
    .line 3
    return p0
.end method

.method public getTransitionState()Landroid/os/Bundle;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lfk1;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lfk1;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 13
    .line 14
    iget-object v1, v0, Lfk1;->e:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 15
    .line 16
    iget v2, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 17
    .line 18
    iput v2, v0, Lfk1;->d:I

    .line 19
    .line 20
    iget v2, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 21
    .line 22
    iput v2, v0, Lfk1;->c:I

    .line 23
    .line 24
    invoke-virtual {v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getVelocity()F

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iput v2, v0, Lfk1;->b:F

    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iput v1, v0, Lfk1;->a:F

    .line 35
    .line 36
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v0, Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v1, "motion.progress"

    .line 47
    .line 48
    iget v2, p0, Lfk1;->a:F

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 51
    .line 52
    .line 53
    const-string v1, "motion.velocity"

    .line 54
    .line 55
    iget v2, p0, Lfk1;->b:F

    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 58
    .line 59
    .line 60
    const-string v1, "motion.StartState"

    .line 61
    .line 62
    iget v2, p0, Lfk1;->c:I

    .line 63
    .line 64
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    const-string v1, "motion.EndState"

    .line 68
    .line 69
    iget p0, p0, Lfk1;->d:I

    .line 70
    .line 71
    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 72
    .line 73
    .line 74
    return-object v0
.end method

.method public getTransitionTimeMs()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 2
    .line 3
    const/high16 v1, 0x447a0000    # 1000.0f

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Llk1;->c()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    int-to-float v0, v0

    .line 12
    div-float/2addr v0, v1

    .line 13
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s0:F

    .line 14
    .line 15
    :cond_0
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s0:F

    .line 16
    .line 17
    mul-float/2addr p0, v1

    .line 18
    float-to-long v0, p0

    .line 19
    return-wide v0
.end method

.method public getVelocity()F
    .locals 0

    .line 1
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j0:F

    .line 2
    .line 3
    return p0
.end method

.method public final k(F)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 7
    .line 8
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t0:F

    .line 9
    .line 10
    cmpl-float v1, v1, v2

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->x0:Z

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 19
    .line 20
    :cond_1
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 21
    .line 22
    cmpl-float v2, v1, p1

    .line 23
    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    :goto_0
    return-void

    .line 27
    :cond_2
    const/4 v2, 0x0

    .line 28
    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->C0:Z

    .line 29
    .line 30
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 31
    .line 32
    invoke-virtual {v0}, Llk1;->c()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    int-to-float p1, p1

    .line 37
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 38
    .line 39
    div-float/2addr p1, v0

    .line 40
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s0:F

    .line 41
    .line 42
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h0:Lak1;

    .line 49
    .line 50
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 51
    .line 52
    invoke-virtual {p1}, Llk1;->e()Landroid/view/animation/Interpolator;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i0:Landroid/view/animation/Interpolator;

    .line 57
    .line 58
    iput-boolean v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->x0:Z

    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 61
    .line 62
    .line 63
    move-result-wide v2

    .line 64
    iput-wide v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r0:J

    .line 65
    .line 66
    const/4 p1, 0x1

    .line 67
    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y0:Z

    .line 68
    .line 69
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t0:F

    .line 70
    .line 71
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final l()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q0:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lzj1;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    iget-object v2, v2, Lzj1;->b:Landroid/view/View;

    .line 23
    .line 24
    invoke-static {v2}, Lde3;->v(Landroid/view/View;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, "button"

    .line 29
    .line 30
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
.end method

.method public final m(Z)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v0:J

    .line 4
    .line 5
    const-wide/16 v3, -0x1

    .line 6
    .line 7
    cmp-long v1, v1, v3

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    iput-wide v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v0:J

    .line 16
    .line 17
    :cond_0
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    cmpl-float v3, v1, v2

    .line 21
    .line 22
    const/4 v4, -0x1

    .line 23
    const/high16 v5, 0x3f800000    # 1.0f

    .line 24
    .line 25
    if-lez v3, :cond_1

    .line 26
    .line 27
    cmpg-float v3, v1, v5

    .line 28
    .line 29
    if-gez v3, :cond_1

    .line 30
    .line 31
    iput v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 32
    .line 33
    :cond_1
    iget-boolean v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N0:Z

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    const/4 v7, 0x0

    .line 37
    if-nez v3, :cond_3

    .line 38
    .line 39
    iget-boolean v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y0:Z

    .line 40
    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    if-nez p1, :cond_3

    .line 44
    .line 45
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 46
    .line 47
    cmpl-float v3, v3, v1

    .line 48
    .line 49
    if-eqz v3, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    move/from16 v20, v2

    .line 53
    .line 54
    goto/16 :goto_d

    .line 55
    .line 56
    :cond_3
    :goto_0
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 57
    .line 58
    sub-float/2addr v3, v1

    .line 59
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 64
    .line 65
    .line 66
    move-result-wide v8

    .line 67
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h0:Lak1;

    .line 68
    .line 69
    const v10, 0x3089705f    # 1.0E-9f

    .line 70
    .line 71
    .line 72
    if-nez v3, :cond_4

    .line 73
    .line 74
    iget-wide v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v0:J

    .line 75
    .line 76
    sub-long v11, v8, v11

    .line 77
    .line 78
    long-to-float v11, v11

    .line 79
    mul-float/2addr v11, v1

    .line 80
    mul-float/2addr v11, v10

    .line 81
    iget v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s0:F

    .line 82
    .line 83
    div-float/2addr v11, v12

    .line 84
    goto :goto_1

    .line 85
    :cond_4
    move v11, v2

    .line 86
    :goto_1
    iget v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 87
    .line 88
    add-float/2addr v12, v11

    .line 89
    iget-boolean v13, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->x0:Z

    .line 90
    .line 91
    if-eqz v13, :cond_5

    .line 92
    .line 93
    iget v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 94
    .line 95
    :cond_5
    cmpl-float v13, v1, v2

    .line 96
    .line 97
    if-lez v13, :cond_6

    .line 98
    .line 99
    iget v14, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 100
    .line 101
    cmpl-float v14, v12, v14

    .line 102
    .line 103
    if-gez v14, :cond_7

    .line 104
    .line 105
    :cond_6
    cmpg-float v14, v1, v2

    .line 106
    .line 107
    if-gtz v14, :cond_8

    .line 108
    .line 109
    iget v14, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 110
    .line 111
    cmpg-float v14, v12, v14

    .line 112
    .line 113
    if-gtz v14, :cond_8

    .line 114
    .line 115
    :cond_7
    iget v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 116
    .line 117
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y0:Z

    .line 118
    .line 119
    move v14, v6

    .line 120
    goto :goto_2

    .line 121
    :cond_8
    move v14, v7

    .line 122
    :goto_2
    iput v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 123
    .line 124
    iput v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t0:F

    .line 125
    .line 126
    iput-wide v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v0:J

    .line 127
    .line 128
    const v15, 0x3727c5ac    # 1.0E-5f

    .line 129
    .line 130
    .line 131
    if-eqz v3, :cond_10

    .line 132
    .line 133
    if-nez v14, :cond_10

    .line 134
    .line 135
    iget-boolean v14, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->C0:Z

    .line 136
    .line 137
    if-eqz v14, :cond_e

    .line 138
    .line 139
    iget-wide v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r0:J

    .line 140
    .line 141
    sub-long v11, v8, v11

    .line 142
    .line 143
    long-to-float v11, v11

    .line 144
    mul-float/2addr v11, v10

    .line 145
    invoke-interface {v3, v11}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    iget-object v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h0:Lak1;

    .line 150
    .line 151
    const/4 v11, 0x2

    .line 152
    iget-object v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->D0:Lch2;

    .line 153
    .line 154
    if-ne v10, v12, :cond_a

    .line 155
    .line 156
    iget-object v10, v12, Lch2;->c:Lbh2;

    .line 157
    .line 158
    invoke-interface {v10}, Lbh2;->a()Z

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    if-eqz v10, :cond_9

    .line 163
    .line 164
    move v10, v11

    .line 165
    goto :goto_3

    .line 166
    :cond_9
    move v10, v6

    .line 167
    goto :goto_3

    .line 168
    :cond_a
    move v10, v7

    .line 169
    :goto_3
    iput v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 170
    .line 171
    iput-wide v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v0:J

    .line 172
    .line 173
    iget-object v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h0:Lak1;

    .line 174
    .line 175
    if-eqz v8, :cond_d

    .line 176
    .line 177
    invoke-virtual {v8}, Lak1;->a()F

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    iput v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j0:F

    .line 182
    .line 183
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 184
    .line 185
    .line 186
    move-result v9

    .line 187
    iget v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s0:F

    .line 188
    .line 189
    mul-float/2addr v9, v12

    .line 190
    cmpg-float v9, v9, v15

    .line 191
    .line 192
    if-gtz v9, :cond_b

    .line 193
    .line 194
    if-ne v10, v11, :cond_b

    .line 195
    .line 196
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y0:Z

    .line 197
    .line 198
    :cond_b
    cmpl-float v9, v8, v2

    .line 199
    .line 200
    if-lez v9, :cond_c

    .line 201
    .line 202
    cmpl-float v9, v3, v5

    .line 203
    .line 204
    if-ltz v9, :cond_c

    .line 205
    .line 206
    iput v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 207
    .line 208
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y0:Z

    .line 209
    .line 210
    move v3, v5

    .line 211
    :cond_c
    cmpg-float v8, v8, v2

    .line 212
    .line 213
    if-gez v8, :cond_d

    .line 214
    .line 215
    cmpg-float v8, v3, v2

    .line 216
    .line 217
    if-gtz v8, :cond_d

    .line 218
    .line 219
    iput v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 220
    .line 221
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y0:Z

    .line 222
    .line 223
    move v12, v2

    .line 224
    goto :goto_6

    .line 225
    :cond_d
    move v12, v3

    .line 226
    goto :goto_6

    .line 227
    :cond_e
    invoke-interface {v3, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    iget-object v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h0:Lak1;

    .line 232
    .line 233
    if-eqz v8, :cond_f

    .line 234
    .line 235
    invoke-virtual {v8}, Lak1;->a()F

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    iput v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j0:F

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_f
    add-float/2addr v12, v11

    .line 243
    invoke-interface {v8, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 244
    .line 245
    .line 246
    move-result v8

    .line 247
    sub-float/2addr v8, v3

    .line 248
    mul-float/2addr v8, v1

    .line 249
    div-float/2addr v8, v11

    .line 250
    iput v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j0:F

    .line 251
    .line 252
    :goto_4
    move v12, v3

    .line 253
    :goto_5
    move v10, v7

    .line 254
    goto :goto_6

    .line 255
    :cond_10
    iput v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j0:F

    .line 256
    .line 257
    goto :goto_5

    .line 258
    :goto_6
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j0:F

    .line 259
    .line 260
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    cmpl-float v3, v3, v15

    .line 265
    .line 266
    if-lez v3, :cond_11

    .line 267
    .line 268
    sget-object v3, Lhk1;->c:Lhk1;

    .line 269
    .line 270
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 271
    .line 272
    .line 273
    :cond_11
    sget-object v3, Lhk1;->d:Lhk1;

    .line 274
    .line 275
    if-eq v10, v6, :cond_16

    .line 276
    .line 277
    if-lez v13, :cond_12

    .line 278
    .line 279
    iget v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 280
    .line 281
    cmpl-float v8, v12, v8

    .line 282
    .line 283
    if-gez v8, :cond_13

    .line 284
    .line 285
    :cond_12
    cmpg-float v8, v1, v2

    .line 286
    .line 287
    if-gtz v8, :cond_14

    .line 288
    .line 289
    iget v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 290
    .line 291
    cmpg-float v8, v12, v8

    .line 292
    .line 293
    if-gtz v8, :cond_14

    .line 294
    .line 295
    :cond_13
    iget v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 296
    .line 297
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y0:Z

    .line 298
    .line 299
    :cond_14
    cmpl-float v8, v12, v5

    .line 300
    .line 301
    if-gez v8, :cond_15

    .line 302
    .line 303
    cmpg-float v8, v12, v2

    .line 304
    .line 305
    if-gtz v8, :cond_16

    .line 306
    .line 307
    :cond_15
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y0:Z

    .line 308
    .line 309
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 310
    .line 311
    .line 312
    :cond_16
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 313
    .line 314
    .line 315
    move-result v8

    .line 316
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N0:Z

    .line 317
    .line 318
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 319
    .line 320
    .line 321
    move-result-wide v16

    .line 322
    iput v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->e1:F

    .line 323
    .line 324
    iget-object v9, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i0:Landroid/view/animation/Interpolator;

    .line 325
    .line 326
    if-nez v9, :cond_17

    .line 327
    .line 328
    move v15, v12

    .line 329
    goto :goto_7

    .line 330
    :cond_17
    invoke-interface {v9, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 331
    .line 332
    .line 333
    move-result v9

    .line 334
    move v15, v9

    .line 335
    :goto_7
    iget-object v9, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i0:Landroid/view/animation/Interpolator;

    .line 336
    .line 337
    if-eqz v9, :cond_18

    .line 338
    .line 339
    iget v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s0:F

    .line 340
    .line 341
    div-float v10, v1, v10

    .line 342
    .line 343
    add-float/2addr v10, v12

    .line 344
    invoke-interface {v9, v10}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    iput v9, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j0:F

    .line 349
    .line 350
    iget-object v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i0:Landroid/view/animation/Interpolator;

    .line 351
    .line 352
    invoke-interface {v10, v12}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 353
    .line 354
    .line 355
    move-result v10

    .line 356
    sub-float/2addr v9, v10

    .line 357
    iput v9, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j0:F

    .line 358
    .line 359
    :cond_18
    move v9, v7

    .line 360
    :goto_8
    if-ge v9, v8, :cond_1a

    .line 361
    .line 362
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 363
    .line 364
    .line 365
    move-result-object v10

    .line 366
    iget-object v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q0:Ljava/util/HashMap;

    .line 367
    .line 368
    invoke-virtual {v11, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v11

    .line 372
    move-object v14, v11

    .line 373
    check-cast v14, Lzj1;

    .line 374
    .line 375
    if-eqz v14, :cond_19

    .line 376
    .line 377
    iget-boolean v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N0:Z

    .line 378
    .line 379
    move/from16 v20, v2

    .line 380
    .line 381
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->f1:Ld31;

    .line 382
    .line 383
    move-object/from16 v18, v2

    .line 384
    .line 385
    move-object/from16 v19, v10

    .line 386
    .line 387
    invoke-virtual/range {v14 .. v19}, Lzj1;->e(FJLd31;Landroid/view/View;)Z

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    or-int/2addr v2, v11

    .line 392
    iput-boolean v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N0:Z

    .line 393
    .line 394
    goto :goto_9

    .line 395
    :cond_19
    move/from16 v20, v2

    .line 396
    .line 397
    :goto_9
    add-int/lit8 v9, v9, 0x1

    .line 398
    .line 399
    move/from16 v2, v20

    .line 400
    .line 401
    goto :goto_8

    .line 402
    :cond_1a
    move/from16 v20, v2

    .line 403
    .line 404
    if-lez v13, :cond_1b

    .line 405
    .line 406
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 407
    .line 408
    cmpl-float v2, v12, v2

    .line 409
    .line 410
    if-gez v2, :cond_1c

    .line 411
    .line 412
    :cond_1b
    cmpg-float v2, v1, v20

    .line 413
    .line 414
    if-gtz v2, :cond_1d

    .line 415
    .line 416
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 417
    .line 418
    cmpg-float v2, v12, v2

    .line 419
    .line 420
    if-gtz v2, :cond_1d

    .line 421
    .line 422
    :cond_1c
    move v2, v6

    .line 423
    goto :goto_a

    .line 424
    :cond_1d
    move v2, v7

    .line 425
    :goto_a
    iget-boolean v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N0:Z

    .line 426
    .line 427
    if-nez v8, :cond_1e

    .line 428
    .line 429
    iget-boolean v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y0:Z

    .line 430
    .line 431
    if-nez v8, :cond_1e

    .line 432
    .line 433
    if-eqz v2, :cond_1e

    .line 434
    .line 435
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 436
    .line 437
    .line 438
    :cond_1e
    iget-boolean v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->X0:Z

    .line 439
    .line 440
    if-eqz v8, :cond_1f

    .line 441
    .line 442
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->requestLayout()V

    .line 443
    .line 444
    .line 445
    :cond_1f
    iget-boolean v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N0:Z

    .line 446
    .line 447
    xor-int/2addr v2, v6

    .line 448
    or-int/2addr v2, v8

    .line 449
    iput-boolean v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N0:Z

    .line 450
    .line 451
    cmpg-float v2, v12, v20

    .line 452
    .line 453
    if-gtz v2, :cond_20

    .line 454
    .line 455
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 456
    .line 457
    if-eq v2, v4, :cond_20

    .line 458
    .line 459
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 460
    .line 461
    if-eq v4, v2, :cond_20

    .line 462
    .line 463
    iput v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 464
    .line 465
    iget-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 466
    .line 467
    invoke-virtual {v4, v2}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/widget/d;->a(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 475
    .line 476
    .line 477
    move v7, v6

    .line 478
    :cond_20
    float-to-double v8, v12

    .line 479
    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    .line 480
    .line 481
    cmpl-double v2, v8, v10

    .line 482
    .line 483
    if-ltz v2, :cond_21

    .line 484
    .line 485
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 486
    .line 487
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 488
    .line 489
    if-eq v2, v4, :cond_21

    .line 490
    .line 491
    iput v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 492
    .line 493
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 494
    .line 495
    invoke-virtual {v2, v4}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/widget/d;->a(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 503
    .line 504
    .line 505
    move v7, v6

    .line 506
    :cond_21
    iget-boolean v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N0:Z

    .line 507
    .line 508
    if-nez v2, :cond_25

    .line 509
    .line 510
    iget-boolean v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y0:Z

    .line 511
    .line 512
    if-eqz v2, :cond_22

    .line 513
    .line 514
    goto :goto_b

    .line 515
    :cond_22
    if-lez v13, :cond_23

    .line 516
    .line 517
    cmpl-float v2, v12, v5

    .line 518
    .line 519
    if-eqz v2, :cond_24

    .line 520
    .line 521
    :cond_23
    cmpg-float v2, v1, v20

    .line 522
    .line 523
    if-gez v2, :cond_26

    .line 524
    .line 525
    cmpl-float v2, v12, v20

    .line 526
    .line 527
    if-nez v2, :cond_26

    .line 528
    .line 529
    :cond_24
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 530
    .line 531
    .line 532
    goto :goto_c

    .line 533
    :cond_25
    :goto_b
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 534
    .line 535
    .line 536
    :cond_26
    :goto_c
    iget-boolean v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->N0:Z

    .line 537
    .line 538
    if-nez v2, :cond_29

    .line 539
    .line 540
    iget-boolean v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y0:Z

    .line 541
    .line 542
    if-nez v2, :cond_29

    .line 543
    .line 544
    if-lez v13, :cond_27

    .line 545
    .line 546
    cmpl-float v2, v12, v5

    .line 547
    .line 548
    if-eqz v2, :cond_28

    .line 549
    .line 550
    :cond_27
    cmpg-float v1, v1, v20

    .line 551
    .line 552
    if-gez v1, :cond_29

    .line 553
    .line 554
    cmpl-float v1, v12, v20

    .line 555
    .line 556
    if-nez v1, :cond_29

    .line 557
    .line 558
    :cond_28
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->t()V

    .line 559
    .line 560
    .line 561
    :cond_29
    :goto_d
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 562
    .line 563
    cmpl-float v2, v1, v5

    .line 564
    .line 565
    if-ltz v2, :cond_2b

    .line 566
    .line 567
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 568
    .line 569
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 570
    .line 571
    if-eq v1, v2, :cond_2a

    .line 572
    .line 573
    goto :goto_e

    .line 574
    :cond_2a
    move v6, v7

    .line 575
    :goto_e
    iput v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 576
    .line 577
    :goto_f
    move v7, v6

    .line 578
    goto :goto_11

    .line 579
    :cond_2b
    cmpg-float v1, v1, v20

    .line 580
    .line 581
    if-gtz v1, :cond_2d

    .line 582
    .line 583
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 584
    .line 585
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 586
    .line 587
    if-eq v1, v2, :cond_2c

    .line 588
    .line 589
    goto :goto_10

    .line 590
    :cond_2c
    move v6, v7

    .line 591
    :goto_10
    iput v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 592
    .line 593
    goto :goto_f

    .line 594
    :cond_2d
    :goto_11
    iget-boolean v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->n1:Z

    .line 595
    .line 596
    or-int/2addr v1, v7

    .line 597
    iput-boolean v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->n1:Z

    .line 598
    .line 599
    if-eqz v7, :cond_2e

    .line 600
    .line 601
    iget-boolean v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:Z

    .line 602
    .line 603
    if-nez v1, :cond_2e

    .line 604
    .line 605
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->requestLayout()V

    .line 606
    .line 607
    .line 608
    :cond_2e
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 609
    .line 610
    iput v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t0:F

    .line 611
    .line 612
    return-void
.end method

.method public final n()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z0:Lgk1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->R0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    :cond_0
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->W0:F

    .line 16
    .line 17
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t0:F

    .line 18
    .line 19
    cmpl-float v0, v0, v1

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->V0:I

    .line 24
    .line 25
    const/4 v1, -0x1

    .line 26
    if-eq v0, v1, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->R0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Lgk1;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->V0:I

    .line 53
    .line 54
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t0:F

    .line 55
    .line 56
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->W0:F

    .line 57
    .line 58
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->R0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 59
    .line 60
    if-eqz p0, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Lgk1;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    return-void
.end method

.method public final o()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z0:Lgk1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->R0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    :cond_0
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->V0:I

    .line 16
    .line 17
    const/4 v1, -0x1

    .line 18
    if-ne v0, v1, :cond_2

    .line 19
    .line 20
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 21
    .line 22
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->V0:I

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r1:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/lit8 v2, v2, -0x1

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move v2, v1

    .line 50
    :goto_0
    iget v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 51
    .line 52
    if-eq v2, v3, :cond_2

    .line 53
    .line 54
    if-eq v3, v1, :cond_2

    .line 55
    .line 56
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->u()V

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i1:Lji1;

    .line 67
    .line 68
    if-eqz p0, :cond_3

    .line 69
    .line 70
    invoke-virtual {p0}, Lji1;->run()V

    .line 71
    .line 72
    .line 73
    :cond_3
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 9

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 14
    .line 15
    if-eqz v0, :cond_7

    .line 16
    .line 17
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 18
    .line 19
    const/4 v2, -0x1

    .line 20
    if-eq v1, v2, :cond_7

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 27
    .line 28
    iget-object v2, v1, Llk1;->g:Landroid/util/SparseArray;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    :goto_0
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-ge v3, v4, :cond_4

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    iget-object v5, v1, Llk1;->i:Landroid/util/SparseIntArray;

    .line 42
    .line 43
    invoke-virtual {v5, v4}, Landroid/util/SparseIntArray;->get(I)I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    invoke-virtual {v5}, Landroid/util/SparseIntArray;->size()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    :goto_1
    if-lez v6, :cond_3

    .line 52
    .line 53
    if-ne v6, v4, :cond_1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    add-int/lit8 v8, v7, -0x1

    .line 57
    .line 58
    if-gez v7, :cond_2

    .line 59
    .line 60
    :goto_2
    const-string v1, "MotionScene"

    .line 61
    .line 62
    const-string v2, "Cannot be derived from yourself"

    .line 63
    .line 64
    invoke-static {v1, v2}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_2
    invoke-virtual {v5, v6}, Landroid/util/SparseIntArray;->get(I)I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    move v7, v8

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-virtual {v1, v4, p0}, Llk1;->m(ILandroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 75
    .line 76
    .line 77
    add-int/lit8 v3, v3, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    :goto_3
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Q0:Ljava/util/ArrayList;

    .line 81
    .line 82
    if-eqz v1, :cond_5

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_5

    .line 93
    .line 94
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Landroidx/constraintlayout/motion/widget/MotionHelper;

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_5
    if-eqz v0, :cond_6

    .line 105
    .line 106
    invoke-virtual {v0, p0}, Landroidx/constraintlayout/widget/d;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 107
    .line 108
    .line 109
    :cond_6
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 110
    .line 111
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 112
    .line 113
    :cond_7
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->t()V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 117
    .line 118
    if-eqz v0, :cond_9

    .line 119
    .line 120
    iget-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k1:Z

    .line 121
    .line 122
    if-eqz v1, :cond_8

    .line 123
    .line 124
    new-instance v0, Lye;

    .line 125
    .line 126
    const/16 v1, 0x12

    .line 127
    .line 128
    invoke-direct {v0, p0, v1}, Lye;-><init>(Ljava/lang/Object;I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_8
    invoke-virtual {v0}, Lfk1;->a()V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_9
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 140
    .line 141
    if-eqz v0, :cond_a

    .line 142
    .line 143
    iget-object v0, v0, Llk1;->c:Lkk1;

    .line 144
    .line 145
    if-eqz v0, :cond_a

    .line 146
    .line 147
    iget v0, v0, Lkk1;->n:I

    .line 148
    .line 149
    const/4 v1, 0x4

    .line 150
    if-ne v0, v1, :cond_a

    .line 151
    .line 152
    const/high16 v0, 0x3f800000    # 1.0f

    .line 153
    .line 154
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->k(F)V

    .line 155
    .line 156
    .line 157
    const/4 v0, 0x0

    .line 158
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i1:Lji1;

    .line 159
    .line 160
    sget-object v0, Lhk1;->b:Lhk1;

    .line 161
    .line 162
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 163
    .line 164
    .line 165
    sget-object v0, Lhk1;->c:Lhk1;

    .line 166
    .line 167
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 168
    .line 169
    .line 170
    :cond_a
    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 9
    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    iget-boolean v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p0:Z

    .line 13
    .line 14
    if-nez v5, :cond_1

    .line 15
    .line 16
    :cond_0
    const/16 v16, 0x0

    .line 17
    .line 18
    goto/16 :goto_14

    .line 19
    .line 20
    :cond_1
    iget-object v7, v3, Llk1;->q:Lb5;

    .line 21
    .line 22
    if-eqz v7, :cond_2a

    .line 23
    .line 24
    iget-object v3, v7, Lb5;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v5, v7, Lb5;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 31
    .line 32
    invoke-virtual {v5}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getCurrentState()I

    .line 33
    .line 34
    .line 35
    move-result v15

    .line 36
    if-ne v15, v1, :cond_2

    .line 37
    .line 38
    goto/16 :goto_12

    .line 39
    .line 40
    :cond_2
    iget-object v6, v7, Lb5;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v6, Ljava/util/HashSet;

    .line 43
    .line 44
    if-nez v6, :cond_5

    .line 45
    .line 46
    new-instance v6, Ljava/util/HashSet;

    .line 47
    .line 48
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v6, v7, Lb5;->d:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-eqz v8, :cond_5

    .line 62
    .line 63
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    check-cast v8, Le53;

    .line 68
    .line 69
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    const/4 v10, 0x0

    .line 74
    :goto_0
    if-ge v10, v9, :cond_3

    .line 75
    .line 76
    invoke-virtual {v5, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    invoke-virtual {v8, v11}, Le53;->a(Landroid/view/View;)Z

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    if-eqz v12, :cond_4

    .line 85
    .line 86
    invoke-virtual {v11}, Landroid/view/View;->getId()I

    .line 87
    .line 88
    .line 89
    iget-object v12, v7, Lb5;->d:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v12, Ljava/util/HashSet;

    .line 92
    .line 93
    invoke-virtual {v12, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_5
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    new-instance v9, Landroid/graphics/Rect;

    .line 108
    .line 109
    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    iget-object v11, v7, Lb5;->e:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v11, Ljava/util/ArrayList;

    .line 119
    .line 120
    const/4 v12, 0x2

    .line 121
    const/4 v13, 0x1

    .line 122
    if-eqz v11, :cond_9

    .line 123
    .line 124
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result v11

    .line 128
    if-nez v11, :cond_9

    .line 129
    .line 130
    iget-object v11, v7, Lb5;->e:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v11, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v14

    .line 142
    if-eqz v14, :cond_9

    .line 143
    .line 144
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v14

    .line 148
    check-cast v14, Ld53;

    .line 149
    .line 150
    const/16 v16, 0x0

    .line 151
    .line 152
    iget-object v4, v14, Ld53;->l:Landroid/graphics/Rect;

    .line 153
    .line 154
    if-eq v10, v13, :cond_7

    .line 155
    .line 156
    if-eq v10, v12, :cond_6

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_6
    iget-object v1, v14, Ld53;->c:Lzj1;

    .line 160
    .line 161
    iget-object v1, v1, Lzj1;->b:Landroid/view/View;

    .line 162
    .line 163
    invoke-virtual {v1, v4}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 164
    .line 165
    .line 166
    float-to-int v1, v6

    .line 167
    float-to-int v12, v8

    .line 168
    invoke-virtual {v4, v1, v12}, Landroid/graphics/Rect;->contains(II)Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-nez v1, :cond_8

    .line 173
    .line 174
    iget-boolean v1, v14, Ld53;->h:Z

    .line 175
    .line 176
    if-nez v1, :cond_8

    .line 177
    .line 178
    invoke-virtual {v14}, Ld53;->b()V

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_7
    iget-boolean v1, v14, Ld53;->h:Z

    .line 183
    .line 184
    if-nez v1, :cond_8

    .line 185
    .line 186
    invoke-virtual {v14}, Ld53;->b()V

    .line 187
    .line 188
    .line 189
    :cond_8
    :goto_2
    const/4 v1, -0x1

    .line 190
    const/4 v12, 0x2

    .line 191
    goto :goto_1

    .line 192
    :cond_9
    const/16 v16, 0x0

    .line 193
    .line 194
    if-eqz v10, :cond_a

    .line 195
    .line 196
    if-eq v10, v13, :cond_a

    .line 197
    .line 198
    goto/16 :goto_13

    .line 199
    .line 200
    :cond_a
    iget-object v1, v5, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 201
    .line 202
    if-nez v1, :cond_b

    .line 203
    .line 204
    const/4 v1, 0x0

    .line 205
    goto :goto_3

    .line 206
    :cond_b
    invoke-virtual {v1, v15}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    :goto_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    if-eqz v11, :cond_2b

    .line 219
    .line 220
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    check-cast v11, Le53;

    .line 225
    .line 226
    iget v12, v11, Le53;->b:I

    .line 227
    .line 228
    if-ne v12, v13, :cond_c

    .line 229
    .line 230
    if-nez v10, :cond_29

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_c
    const/4 v14, 0x2

    .line 234
    if-ne v12, v14, :cond_d

    .line 235
    .line 236
    if-ne v10, v13, :cond_29

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_d
    const/4 v14, 0x3

    .line 240
    if-ne v12, v14, :cond_29

    .line 241
    .line 242
    if-nez v10, :cond_29

    .line 243
    .line 244
    :goto_5
    iget-object v12, v7, Lb5;->d:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v12, Ljava/util/HashSet;

    .line 247
    .line 248
    invoke-virtual {v12}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object v18

    .line 252
    :goto_6
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v12

    .line 256
    if-eqz v12, :cond_29

    .line 257
    .line 258
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v12

    .line 262
    check-cast v12, Landroid/view/View;

    .line 263
    .line 264
    invoke-virtual {v11, v12}, Le53;->a(Landroid/view/View;)Z

    .line 265
    .line 266
    .line 267
    move-result v14

    .line 268
    if-nez v14, :cond_e

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_e
    invoke-virtual {v12, v9}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 272
    .line 273
    .line 274
    float-to-int v14, v6

    .line 275
    float-to-int v4, v8

    .line 276
    invoke-virtual {v9, v14, v4}, Landroid/graphics/Rect;->contains(II)Z

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    if-eqz v4, :cond_28

    .line 281
    .line 282
    filled-new-array {v12}, [Landroid/view/View;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    iget-object v12, v11, Le53;->f:Lm31;

    .line 287
    .line 288
    iget-object v14, v11, Le53;->g:Landroidx/constraintlayout/widget/c;

    .line 289
    .line 290
    iget-boolean v13, v11, Le53;->c:Z

    .line 291
    .line 292
    if-eqz v13, :cond_f

    .line 293
    .line 294
    move-object/from16 v20, v3

    .line 295
    .line 296
    move/from16 v24, v6

    .line 297
    .line 298
    move/from16 v23, v8

    .line 299
    .line 300
    move-object/from16 v21, v9

    .line 301
    .line 302
    move/from16 v17, v10

    .line 303
    .line 304
    const/4 v3, 0x1

    .line 305
    goto/16 :goto_10

    .line 306
    .line 307
    :cond_f
    iget v13, v11, Le53;->e:I

    .line 308
    .line 309
    move-object/from16 v20, v3

    .line 310
    .line 311
    const/4 v3, 0x2

    .line 312
    if-ne v13, v3, :cond_1b

    .line 313
    .line 314
    aget-object v3, v4, v16

    .line 315
    .line 316
    move v4, v8

    .line 317
    new-instance v8, Lzj1;

    .line 318
    .line 319
    invoke-direct {v8, v3}, Lzj1;-><init>(Landroid/view/View;)V

    .line 320
    .line 321
    .line 322
    iget-object v13, v8, Lzj1;->f:Lik1;

    .line 323
    .line 324
    const/4 v14, 0x0

    .line 325
    iput v14, v13, Lik1;->c:F

    .line 326
    .line 327
    iput v14, v13, Lik1;->d:F

    .line 328
    .line 329
    const/4 v14, 0x1

    .line 330
    iput-boolean v14, v8, Lzj1;->G:Z

    .line 331
    .line 332
    invoke-virtual {v3}, Landroid/view/View;->getX()F

    .line 333
    .line 334
    .line 335
    move-result v14

    .line 336
    move-object/from16 v22, v3

    .line 337
    .line 338
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getY()F

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    move/from16 v23, v4

    .line 343
    .line 344
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getWidth()I

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    int-to-float v4, v4

    .line 349
    move/from16 v24, v6

    .line 350
    .line 351
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getHeight()I

    .line 352
    .line 353
    .line 354
    move-result v6

    .line 355
    int-to-float v6, v6

    .line 356
    invoke-virtual {v13, v14, v3, v4, v6}, Lik1;->d(FFFF)V

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getX()F

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getY()F

    .line 364
    .line 365
    .line 366
    move-result v4

    .line 367
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getWidth()I

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    int-to-float v6, v6

    .line 372
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getHeight()I

    .line 373
    .line 374
    .line 375
    move-result v13

    .line 376
    int-to-float v13, v13

    .line 377
    iget-object v14, v8, Lzj1;->g:Lik1;

    .line 378
    .line 379
    invoke-virtual {v14, v3, v4, v6, v13}, Lik1;->d(FFFF)V

    .line 380
    .line 381
    .line 382
    iget-object v3, v8, Lzj1;->h:Lxj1;

    .line 383
    .line 384
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getX()F

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getY()F

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getWidth()I

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getHeight()I

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getVisibility()I

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    iput v4, v3, Lxj1;->c:I

    .line 404
    .line 405
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getVisibility()I

    .line 406
    .line 407
    .line 408
    move-result v4

    .line 409
    if-eqz v4, :cond_10

    .line 410
    .line 411
    const/4 v4, 0x0

    .line 412
    goto :goto_7

    .line 413
    :cond_10
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getAlpha()F

    .line 414
    .line 415
    .line 416
    move-result v4

    .line 417
    :goto_7
    iput v4, v3, Lxj1;->a:F

    .line 418
    .line 419
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getElevation()F

    .line 420
    .line 421
    .line 422
    move-result v4

    .line 423
    iput v4, v3, Lxj1;->d:F

    .line 424
    .line 425
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getRotation()F

    .line 426
    .line 427
    .line 428
    move-result v4

    .line 429
    iput v4, v3, Lxj1;->e:F

    .line 430
    .line 431
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getRotationX()F

    .line 432
    .line 433
    .line 434
    move-result v4

    .line 435
    iput v4, v3, Lxj1;->f:F

    .line 436
    .line 437
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getRotationY()F

    .line 438
    .line 439
    .line 440
    move-result v4

    .line 441
    iput v4, v3, Lxj1;->i:F

    .line 442
    .line 443
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getScaleX()F

    .line 444
    .line 445
    .line 446
    move-result v4

    .line 447
    iput v4, v3, Lxj1;->v:F

    .line 448
    .line 449
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getScaleY()F

    .line 450
    .line 451
    .line 452
    move-result v4

    .line 453
    iput v4, v3, Lxj1;->w:F

    .line 454
    .line 455
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getPivotX()F

    .line 456
    .line 457
    .line 458
    move-result v4

    .line 459
    iput v4, v3, Lxj1;->U:F

    .line 460
    .line 461
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getPivotY()F

    .line 462
    .line 463
    .line 464
    move-result v4

    .line 465
    iput v4, v3, Lxj1;->V:F

    .line 466
    .line 467
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getTranslationX()F

    .line 468
    .line 469
    .line 470
    move-result v4

    .line 471
    iput v4, v3, Lxj1;->W:F

    .line 472
    .line 473
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getTranslationY()F

    .line 474
    .line 475
    .line 476
    move-result v4

    .line 477
    iput v4, v3, Lxj1;->X:F

    .line 478
    .line 479
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getTranslationZ()F

    .line 480
    .line 481
    .line 482
    move-result v4

    .line 483
    iput v4, v3, Lxj1;->Y:F

    .line 484
    .line 485
    iget-object v3, v8, Lzj1;->i:Lxj1;

    .line 486
    .line 487
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getX()F

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getY()F

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getWidth()I

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getHeight()I

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getVisibility()I

    .line 503
    .line 504
    .line 505
    move-result v4

    .line 506
    iput v4, v3, Lxj1;->c:I

    .line 507
    .line 508
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getVisibility()I

    .line 509
    .line 510
    .line 511
    move-result v4

    .line 512
    if-eqz v4, :cond_11

    .line 513
    .line 514
    const/4 v14, 0x0

    .line 515
    goto :goto_8

    .line 516
    :cond_11
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getAlpha()F

    .line 517
    .line 518
    .line 519
    move-result v14

    .line 520
    :goto_8
    iput v14, v3, Lxj1;->a:F

    .line 521
    .line 522
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getElevation()F

    .line 523
    .line 524
    .line 525
    move-result v4

    .line 526
    iput v4, v3, Lxj1;->d:F

    .line 527
    .line 528
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getRotation()F

    .line 529
    .line 530
    .line 531
    move-result v4

    .line 532
    iput v4, v3, Lxj1;->e:F

    .line 533
    .line 534
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getRotationX()F

    .line 535
    .line 536
    .line 537
    move-result v4

    .line 538
    iput v4, v3, Lxj1;->f:F

    .line 539
    .line 540
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getRotationY()F

    .line 541
    .line 542
    .line 543
    move-result v4

    .line 544
    iput v4, v3, Lxj1;->i:F

    .line 545
    .line 546
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getScaleX()F

    .line 547
    .line 548
    .line 549
    move-result v4

    .line 550
    iput v4, v3, Lxj1;->v:F

    .line 551
    .line 552
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getScaleY()F

    .line 553
    .line 554
    .line 555
    move-result v4

    .line 556
    iput v4, v3, Lxj1;->w:F

    .line 557
    .line 558
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getPivotX()F

    .line 559
    .line 560
    .line 561
    move-result v4

    .line 562
    iput v4, v3, Lxj1;->U:F

    .line 563
    .line 564
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getPivotY()F

    .line 565
    .line 566
    .line 567
    move-result v4

    .line 568
    iput v4, v3, Lxj1;->V:F

    .line 569
    .line 570
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getTranslationX()F

    .line 571
    .line 572
    .line 573
    move-result v4

    .line 574
    iput v4, v3, Lxj1;->W:F

    .line 575
    .line 576
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getTranslationY()F

    .line 577
    .line 578
    .line 579
    move-result v4

    .line 580
    iput v4, v3, Lxj1;->X:F

    .line 581
    .line 582
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getTranslationZ()F

    .line 583
    .line 584
    .line 585
    move-result v4

    .line 586
    iput v4, v3, Lxj1;->Y:F

    .line 587
    .line 588
    iget-object v3, v12, Lm31;->a:Ljava/util/HashMap;

    .line 589
    .line 590
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v3

    .line 594
    check-cast v3, Ljava/util/ArrayList;

    .line 595
    .line 596
    if-eqz v3, :cond_12

    .line 597
    .line 598
    iget-object v4, v8, Lzj1;->w:Ljava/util/ArrayList;

    .line 599
    .line 600
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 601
    .line 602
    .line 603
    :cond_12
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 604
    .line 605
    .line 606
    move-result v3

    .line 607
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 608
    .line 609
    .line 610
    move-result v4

    .line 611
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 612
    .line 613
    .line 614
    move-result-wide v12

    .line 615
    invoke-virtual {v8, v12, v13, v3, v4}, Lzj1;->h(JII)V

    .line 616
    .line 617
    .line 618
    new-instance v6, Ld53;

    .line 619
    .line 620
    move-object v3, v9

    .line 621
    iget v9, v11, Le53;->h:I

    .line 622
    .line 623
    move v4, v10

    .line 624
    iget v10, v11, Le53;->i:I

    .line 625
    .line 626
    iget v12, v11, Le53;->b:I

    .line 627
    .line 628
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 629
    .line 630
    .line 631
    move-result-object v13

    .line 632
    iget v14, v11, Le53;->l:I

    .line 633
    .line 634
    move-object/from16 v21, v3

    .line 635
    .line 636
    const/4 v3, -0x2

    .line 637
    if-eq v14, v3, :cond_1a

    .line 638
    .line 639
    const/4 v3, -0x1

    .line 640
    if-eq v14, v3, :cond_19

    .line 641
    .line 642
    if-eqz v14, :cond_18

    .line 643
    .line 644
    const/4 v3, 0x1

    .line 645
    if-eq v14, v3, :cond_17

    .line 646
    .line 647
    const/4 v13, 0x2

    .line 648
    if-eq v14, v13, :cond_16

    .line 649
    .line 650
    const/4 v13, 0x4

    .line 651
    if-eq v14, v13, :cond_15

    .line 652
    .line 653
    const/4 v13, 0x5

    .line 654
    if-eq v14, v13, :cond_14

    .line 655
    .line 656
    const/4 v13, 0x6

    .line 657
    if-eq v14, v13, :cond_13

    .line 658
    .line 659
    const/4 v3, 0x2

    .line 660
    const/4 v13, 0x0

    .line 661
    goto :goto_a

    .line 662
    :cond_13
    new-instance v13, Landroid/view/animation/AnticipateInterpolator;

    .line 663
    .line 664
    invoke-direct {v13}, Landroid/view/animation/AnticipateInterpolator;-><init>()V

    .line 665
    .line 666
    .line 667
    :goto_9
    const/4 v3, 0x2

    .line 668
    goto :goto_a

    .line 669
    :cond_14
    new-instance v13, Landroid/view/animation/OvershootInterpolator;

    .line 670
    .line 671
    invoke-direct {v13}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    .line 672
    .line 673
    .line 674
    goto :goto_9

    .line 675
    :cond_15
    new-instance v13, Landroid/view/animation/BounceInterpolator;

    .line 676
    .line 677
    invoke-direct {v13}, Landroid/view/animation/BounceInterpolator;-><init>()V

    .line 678
    .line 679
    .line 680
    goto :goto_9

    .line 681
    :cond_16
    new-instance v13, Landroid/view/animation/DecelerateInterpolator;

    .line 682
    .line 683
    invoke-direct {v13}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 684
    .line 685
    .line 686
    goto :goto_9

    .line 687
    :cond_17
    new-instance v13, Landroid/view/animation/AccelerateInterpolator;

    .line 688
    .line 689
    invoke-direct {v13}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 690
    .line 691
    .line 692
    goto :goto_9

    .line 693
    :cond_18
    const/4 v3, 0x1

    .line 694
    new-instance v13, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 695
    .line 696
    invoke-direct {v13}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 697
    .line 698
    .line 699
    goto :goto_9

    .line 700
    :cond_19
    const/4 v3, 0x1

    .line 701
    iget-object v13, v11, Le53;->m:Ljava/lang/String;

    .line 702
    .line 703
    invoke-static {v13}, Lr4;->c(Ljava/lang/String;)Lr4;

    .line 704
    .line 705
    .line 706
    move-result-object v13

    .line 707
    new-instance v14, Lyj1;

    .line 708
    .line 709
    const/4 v3, 0x2

    .line 710
    invoke-direct {v14, v13, v3}, Lyj1;-><init>(Lr4;I)V

    .line 711
    .line 712
    .line 713
    move-object v13, v14

    .line 714
    goto :goto_a

    .line 715
    :cond_1a
    const/4 v3, 0x2

    .line 716
    iget v14, v11, Le53;->n:I

    .line 717
    .line 718
    invoke-static {v13, v14}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    .line 719
    .line 720
    .line 721
    move-result-object v13

    .line 722
    :goto_a
    iget v14, v11, Le53;->p:I

    .line 723
    .line 724
    move/from16 v17, v12

    .line 725
    .line 726
    move-object v12, v13

    .line 727
    move v13, v14

    .line 728
    iget v14, v11, Le53;->q:I

    .line 729
    .line 730
    move/from16 v19, v17

    .line 731
    .line 732
    move/from16 v17, v4

    .line 733
    .line 734
    move-object v4, v11

    .line 735
    move/from16 v11, v19

    .line 736
    .line 737
    move/from16 v19, v3

    .line 738
    .line 739
    const/4 v3, 0x1

    .line 740
    invoke-direct/range {v6 .. v14}, Ld53;-><init>(Lb5;Lzj1;IIILandroid/view/animation/Interpolator;II)V

    .line 741
    .line 742
    .line 743
    move-object v11, v4

    .line 744
    goto/16 :goto_11

    .line 745
    .line 746
    :cond_1b
    move/from16 v19, v3

    .line 747
    .line 748
    move/from16 v24, v6

    .line 749
    .line 750
    move/from16 v23, v8

    .line 751
    .line 752
    move-object/from16 v21, v9

    .line 753
    .line 754
    move/from16 v17, v10

    .line 755
    .line 756
    const/4 v3, 0x1

    .line 757
    if-ne v13, v3, :cond_20

    .line 758
    .line 759
    invoke-virtual {v5}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getConstraintSetIds()[I

    .line 760
    .line 761
    .line 762
    move-result-object v6

    .line 763
    move/from16 v8, v16

    .line 764
    .line 765
    :goto_b
    array-length v9, v6

    .line 766
    if-ge v8, v9, :cond_20

    .line 767
    .line 768
    aget v9, v6, v8

    .line 769
    .line 770
    if-ne v9, v15, :cond_1c

    .line 771
    .line 772
    goto :goto_d

    .line 773
    :cond_1c
    iget-object v10, v5, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 774
    .line 775
    if-nez v10, :cond_1d

    .line 776
    .line 777
    const/4 v9, 0x0

    .line 778
    goto :goto_c

    .line 779
    :cond_1d
    invoke-virtual {v10, v9}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 780
    .line 781
    .line 782
    move-result-object v9

    .line 783
    :goto_c
    aget-object v10, v4, v16

    .line 784
    .line 785
    invoke-virtual {v10}, Landroid/view/View;->getId()I

    .line 786
    .line 787
    .line 788
    move-result v10

    .line 789
    invoke-virtual {v9, v10}, Landroidx/constraintlayout/widget/d;->i(I)Landroidx/constraintlayout/widget/c;

    .line 790
    .line 791
    .line 792
    move-result-object v9

    .line 793
    if-eqz v14, :cond_1f

    .line 794
    .line 795
    iget-object v10, v14, Landroidx/constraintlayout/widget/c;->h:Ltz;

    .line 796
    .line 797
    if-eqz v10, :cond_1e

    .line 798
    .line 799
    invoke-virtual {v10, v9}, Ltz;->e(Landroidx/constraintlayout/widget/c;)V

    .line 800
    .line 801
    .line 802
    :cond_1e
    iget-object v9, v9, Landroidx/constraintlayout/widget/c;->g:Ljava/util/HashMap;

    .line 803
    .line 804
    iget-object v10, v14, Landroidx/constraintlayout/widget/c;->g:Ljava/util/HashMap;

    .line 805
    .line 806
    invoke-virtual {v9, v10}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 807
    .line 808
    .line 809
    :cond_1f
    :goto_d
    add-int/lit8 v8, v8, 0x1

    .line 810
    .line 811
    goto :goto_b

    .line 812
    :cond_20
    new-instance v6, Landroidx/constraintlayout/widget/d;

    .line 813
    .line 814
    invoke-direct {v6}, Landroidx/constraintlayout/widget/d;-><init>()V

    .line 815
    .line 816
    .line 817
    iget-object v8, v6, Landroidx/constraintlayout/widget/d;->f:Ljava/util/HashMap;

    .line 818
    .line 819
    invoke-virtual {v8}, Ljava/util/HashMap;->clear()V

    .line 820
    .line 821
    .line 822
    iget-object v9, v1, Landroidx/constraintlayout/widget/d;->f:Ljava/util/HashMap;

    .line 823
    .line 824
    invoke-virtual {v9}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 825
    .line 826
    .line 827
    move-result-object v9

    .line 828
    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 829
    .line 830
    .line 831
    move-result-object v9

    .line 832
    :goto_e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 833
    .line 834
    .line 835
    move-result v10

    .line 836
    if-eqz v10, :cond_22

    .line 837
    .line 838
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v10

    .line 842
    check-cast v10, Ljava/lang/Integer;

    .line 843
    .line 844
    iget-object v13, v1, Landroidx/constraintlayout/widget/d;->f:Ljava/util/HashMap;

    .line 845
    .line 846
    invoke-virtual {v13, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v13

    .line 850
    check-cast v13, Landroidx/constraintlayout/widget/c;

    .line 851
    .line 852
    if-nez v13, :cond_21

    .line 853
    .line 854
    goto :goto_e

    .line 855
    :cond_21
    invoke-virtual {v13}, Landroidx/constraintlayout/widget/c;->b()Landroidx/constraintlayout/widget/c;

    .line 856
    .line 857
    .line 858
    move-result-object v13

    .line 859
    invoke-virtual {v8, v10, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    goto :goto_e

    .line 863
    :cond_22
    aget-object v8, v4, v16

    .line 864
    .line 865
    invoke-virtual {v8}, Landroid/view/View;->getId()I

    .line 866
    .line 867
    .line 868
    move-result v8

    .line 869
    invoke-virtual {v6, v8}, Landroidx/constraintlayout/widget/d;->i(I)Landroidx/constraintlayout/widget/c;

    .line 870
    .line 871
    .line 872
    move-result-object v8

    .line 873
    if-eqz v14, :cond_24

    .line 874
    .line 875
    iget-object v9, v14, Landroidx/constraintlayout/widget/c;->h:Ltz;

    .line 876
    .line 877
    if-eqz v9, :cond_23

    .line 878
    .line 879
    invoke-virtual {v9, v8}, Ltz;->e(Landroidx/constraintlayout/widget/c;)V

    .line 880
    .line 881
    .line 882
    :cond_23
    iget-object v8, v8, Landroidx/constraintlayout/widget/c;->g:Ljava/util/HashMap;

    .line 883
    .line 884
    iget-object v9, v14, Landroidx/constraintlayout/widget/c;->g:Ljava/util/HashMap;

    .line 885
    .line 886
    invoke-virtual {v8, v9}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 887
    .line 888
    .line 889
    :cond_24
    invoke-virtual {v5, v15, v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->B(ILandroidx/constraintlayout/widget/d;)V

    .line 890
    .line 891
    .line 892
    sget v6, Landroidx/constraintlayout/widget/R$id;->view_transition:I

    .line 893
    .line 894
    invoke-virtual {v5, v6, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->B(ILandroidx/constraintlayout/widget/d;)V

    .line 895
    .line 896
    .line 897
    sget v6, Landroidx/constraintlayout/widget/R$id;->view_transition:I

    .line 898
    .line 899
    invoke-virtual {v5, v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->x(I)V

    .line 900
    .line 901
    .line 902
    new-instance v6, Lkk1;

    .line 903
    .line 904
    iget-object v8, v5, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 905
    .line 906
    sget v9, Landroidx/constraintlayout/widget/R$id;->view_transition:I

    .line 907
    .line 908
    invoke-direct {v6, v8, v9, v15}, Lkk1;-><init>(Llk1;II)V

    .line 909
    .line 910
    .line 911
    aget-object v8, v4, v16

    .line 912
    .line 913
    iget v9, v11, Le53;->h:I

    .line 914
    .line 915
    const/4 v10, -0x1

    .line 916
    if-eq v9, v10, :cond_25

    .line 917
    .line 918
    const/16 v10, 0x8

    .line 919
    .line 920
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 921
    .line 922
    .line 923
    move-result v9

    .line 924
    iput v9, v6, Lkk1;->h:I

    .line 925
    .line 926
    :cond_25
    iget v9, v11, Le53;->d:I

    .line 927
    .line 928
    iput v9, v6, Lkk1;->p:I

    .line 929
    .line 930
    iget v9, v11, Le53;->l:I

    .line 931
    .line 932
    iget-object v10, v11, Le53;->m:Ljava/lang/String;

    .line 933
    .line 934
    iget v13, v11, Le53;->n:I

    .line 935
    .line 936
    iput v9, v6, Lkk1;->e:I

    .line 937
    .line 938
    iput-object v10, v6, Lkk1;->f:Ljava/lang/String;

    .line 939
    .line 940
    iput v13, v6, Lkk1;->g:I

    .line 941
    .line 942
    invoke-virtual {v8}, Landroid/view/View;->getId()I

    .line 943
    .line 944
    .line 945
    move-result v8

    .line 946
    if-eqz v12, :cond_27

    .line 947
    .line 948
    iget-object v9, v12, Lm31;->a:Ljava/util/HashMap;

    .line 949
    .line 950
    invoke-virtual {v9, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v9

    .line 954
    check-cast v9, Ljava/util/ArrayList;

    .line 955
    .line 956
    new-instance v10, Lm31;

    .line 957
    .line 958
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 959
    .line 960
    .line 961
    new-instance v12, Ljava/util/HashMap;

    .line 962
    .line 963
    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 964
    .line 965
    .line 966
    iput-object v12, v10, Lm31;->a:Ljava/util/HashMap;

    .line 967
    .line 968
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 969
    .line 970
    .line 971
    move-result-object v9

    .line 972
    :goto_f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 973
    .line 974
    .line 975
    move-result v12

    .line 976
    if-eqz v12, :cond_26

    .line 977
    .line 978
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    move-result-object v12

    .line 982
    check-cast v12, La31;

    .line 983
    .line 984
    invoke-virtual {v12}, La31;->a()La31;

    .line 985
    .line 986
    .line 987
    move-result-object v12

    .line 988
    iput v8, v12, La31;->b:I

    .line 989
    .line 990
    invoke-virtual {v10, v12}, Lm31;->b(La31;)V

    .line 991
    .line 992
    .line 993
    goto :goto_f

    .line 994
    :cond_26
    iget-object v8, v6, Lkk1;->k:Ljava/util/ArrayList;

    .line 995
    .line 996
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 997
    .line 998
    .line 999
    :cond_27
    invoke-virtual {v5, v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setTransition(Lkk1;)V

    .line 1000
    .line 1001
    .line 1002
    new-instance v6, Lji1;

    .line 1003
    .line 1004
    const/16 v8, 0x11

    .line 1005
    .line 1006
    invoke-direct {v6, v8, v11, v4}, Lji1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1007
    .line 1008
    .line 1009
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1010
    .line 1011
    invoke-virtual {v5, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->k(F)V

    .line 1012
    .line 1013
    .line 1014
    iput-object v6, v5, Landroidx/constraintlayout/motion/widget/MotionLayout;->i1:Lji1;

    .line 1015
    .line 1016
    goto :goto_11

    .line 1017
    :cond_28
    move-object/from16 v20, v3

    .line 1018
    .line 1019
    move/from16 v24, v6

    .line 1020
    .line 1021
    move/from16 v23, v8

    .line 1022
    .line 1023
    move-object/from16 v21, v9

    .line 1024
    .line 1025
    move/from16 v17, v10

    .line 1026
    .line 1027
    move v3, v13

    .line 1028
    :goto_10
    const/16 v19, 0x2

    .line 1029
    .line 1030
    :goto_11
    move v13, v3

    .line 1031
    move/from16 v10, v17

    .line 1032
    .line 1033
    move-object/from16 v3, v20

    .line 1034
    .line 1035
    move-object/from16 v9, v21

    .line 1036
    .line 1037
    move/from16 v8, v23

    .line 1038
    .line 1039
    move/from16 v6, v24

    .line 1040
    .line 1041
    goto/16 :goto_6

    .line 1042
    .line 1043
    :cond_29
    move-object/from16 v20, v3

    .line 1044
    .line 1045
    move/from16 v24, v6

    .line 1046
    .line 1047
    move/from16 v23, v8

    .line 1048
    .line 1049
    move-object/from16 v21, v9

    .line 1050
    .line 1051
    move/from16 v17, v10

    .line 1052
    .line 1053
    move v3, v13

    .line 1054
    const/16 v19, 0x2

    .line 1055
    .line 1056
    move v13, v3

    .line 1057
    move/from16 v10, v17

    .line 1058
    .line 1059
    move-object/from16 v3, v20

    .line 1060
    .line 1061
    move-object/from16 v9, v21

    .line 1062
    .line 1063
    move/from16 v8, v23

    .line 1064
    .line 1065
    move/from16 v6, v24

    .line 1066
    .line 1067
    goto/16 :goto_4

    .line 1068
    .line 1069
    :cond_2a
    :goto_12
    const/16 v16, 0x0

    .line 1070
    .line 1071
    :cond_2b
    :goto_13
    iget-object v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 1072
    .line 1073
    iget-object v1, v1, Llk1;->c:Lkk1;

    .line 1074
    .line 1075
    if-eqz v1, :cond_2f

    .line 1076
    .line 1077
    iget-boolean v2, v1, Lkk1;->o:Z

    .line 1078
    .line 1079
    if-nez v2, :cond_2f

    .line 1080
    .line 1081
    iget-object v1, v1, Lkk1;->l:Lmq2;

    .line 1082
    .line 1083
    if-eqz v1, :cond_2f

    .line 1084
    .line 1085
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 1086
    .line 1087
    .line 1088
    move-result v2

    .line 1089
    if-nez v2, :cond_2c

    .line 1090
    .line 1091
    new-instance v2, Landroid/graphics/RectF;

    .line 1092
    .line 1093
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v1, v0, v2}, Lmq2;->b(Landroid/view/ViewGroup;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v2

    .line 1100
    if-eqz v2, :cond_2c

    .line 1101
    .line 1102
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 1103
    .line 1104
    .line 1105
    move-result v3

    .line 1106
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 1107
    .line 1108
    .line 1109
    move-result v4

    .line 1110
    invoke-virtual {v2, v3, v4}, Landroid/graphics/RectF;->contains(FF)Z

    .line 1111
    .line 1112
    .line 1113
    move-result v2

    .line 1114
    if-nez v2, :cond_2c

    .line 1115
    .line 1116
    goto :goto_14

    .line 1117
    :cond_2c
    iget v1, v1, Lmq2;->e:I

    .line 1118
    .line 1119
    const/4 v3, -0x1

    .line 1120
    if-eq v1, v3, :cond_2f

    .line 1121
    .line 1122
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p1:Landroid/view/View;

    .line 1123
    .line 1124
    if-eqz v2, :cond_2d

    .line 1125
    .line 1126
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 1127
    .line 1128
    .line 1129
    move-result v2

    .line 1130
    if-eq v2, v1, :cond_2e

    .line 1131
    .line 1132
    :cond_2d
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v1

    .line 1136
    iput-object v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p1:Landroid/view/View;

    .line 1137
    .line 1138
    :cond_2e
    iget-object v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p1:Landroid/view/View;

    .line 1139
    .line 1140
    if-eqz v1, :cond_2f

    .line 1141
    .line 1142
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 1143
    .line 1144
    .line 1145
    move-result v1

    .line 1146
    int-to-float v1, v1

    .line 1147
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p1:Landroid/view/View;

    .line 1148
    .line 1149
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 1150
    .line 1151
    .line 1152
    move-result v2

    .line 1153
    int-to-float v2, v2

    .line 1154
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p1:Landroid/view/View;

    .line 1155
    .line 1156
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    .line 1157
    .line 1158
    .line 1159
    move-result v3

    .line 1160
    int-to-float v3, v3

    .line 1161
    iget-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p1:Landroid/view/View;

    .line 1162
    .line 1163
    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    .line 1164
    .line 1165
    .line 1166
    move-result v4

    .line 1167
    int-to-float v4, v4

    .line 1168
    iget-object v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->o1:Landroid/graphics/RectF;

    .line 1169
    .line 1170
    invoke-virtual {v5, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 1171
    .line 1172
    .line 1173
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 1174
    .line 1175
    .line 1176
    move-result v1

    .line 1177
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 1178
    .line 1179
    .line 1180
    move-result v2

    .line 1181
    invoke-virtual {v5, v1, v2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 1182
    .line 1183
    .line 1184
    move-result v1

    .line 1185
    if-eqz v1, :cond_2f

    .line 1186
    .line 1187
    iget-object v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p1:Landroid/view/View;

    .line 1188
    .line 1189
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 1190
    .line 1191
    .line 1192
    move-result v1

    .line 1193
    int-to-float v1, v1

    .line 1194
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p1:Landroid/view/View;

    .line 1195
    .line 1196
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 1197
    .line 1198
    .line 1199
    move-result v2

    .line 1200
    int-to-float v2, v2

    .line 1201
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p1:Landroid/view/View;

    .line 1202
    .line 1203
    move-object/from16 v4, p1

    .line 1204
    .line 1205
    invoke-virtual {v0, v1, v2, v3, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->r(FFLandroid/view/View;Landroid/view/MotionEvent;)Z

    .line 1206
    .line 1207
    .line 1208
    move-result v1

    .line 1209
    if-nez v1, :cond_2f

    .line 1210
    .line 1211
    invoke-virtual/range {p0 .. p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1212
    .line 1213
    .line 1214
    move-result v0

    .line 1215
    return v0

    .line 1216
    :cond_2f
    :goto_14
    return v16
.end method

.method public final onLayout(ZIIII)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    invoke-super/range {p0 .. p5}, Landroidx/constraintlayout/widget/ConstraintLayout;->onLayout(ZIIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:Z

    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    move-object p1, v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sub-int/2addr p4, p2

    .line 19
    sub-int/2addr p5, p3

    .line 20
    :try_start_1
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->G0:I

    .line 21
    .line 22
    if-ne p1, p4, :cond_1

    .line 23
    .line 24
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->H0:I

    .line 25
    .line 26
    if-eq p1, p5, :cond_2

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->v()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->m(Z)V

    .line 32
    .line 33
    .line 34
    :cond_2
    iput p4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->G0:I

    .line 35
    .line 36
    iput p5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->H0:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:Z

    .line 39
    .line 40
    return-void

    .line 41
    :goto_0
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g1:Z

    .line 42
    .line 43
    throw p1
.end method

.method public final onMeasure(II)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:La00;

    .line 8
    .line 9
    iget-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 10
    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    invoke-super/range {p0 .. p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->onMeasure(II)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->n0:I

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x1

    .line 21
    if-ne v4, v1, :cond_2

    .line 22
    .line 23
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->o0:I

    .line 24
    .line 25
    if-eq v4, v2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v4, v5

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    :goto_0
    move v4, v6

    .line 31
    :goto_1
    iget-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->n1:Z

    .line 32
    .line 33
    if-eqz v7, :cond_3

    .line 34
    .line 35
    iput-boolean v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->n1:Z

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->t()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->u()V

    .line 41
    .line 42
    .line 43
    move v4, v6

    .line 44
    :cond_3
    iget-boolean v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->v:Z

    .line 45
    .line 46
    if-eqz v7, :cond_4

    .line 47
    .line 48
    move v4, v6

    .line 49
    :cond_4
    iput v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->n0:I

    .line 50
    .line 51
    iput v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->o0:I

    .line 52
    .line 53
    iget-object v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 54
    .line 55
    invoke-virtual {v7}, Llk1;->h()I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    iget-object v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 60
    .line 61
    iget-object v8, v8, Llk1;->c:Lkk1;

    .line 62
    .line 63
    const/4 v9, -0x1

    .line 64
    if-nez v8, :cond_5

    .line 65
    .line 66
    move v8, v9

    .line 67
    goto :goto_2

    .line 68
    :cond_5
    iget v8, v8, Lkk1;->c:I

    .line 69
    .line 70
    :goto_2
    iget-object v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:Lek1;

    .line 71
    .line 72
    if-nez v4, :cond_6

    .line 73
    .line 74
    iget v11, v10, Lek1;->e:I

    .line 75
    .line 76
    if-ne v7, v11, :cond_6

    .line 77
    .line 78
    iget v11, v10, Lek1;->f:I

    .line 79
    .line 80
    if-eq v8, v11, :cond_7

    .line 81
    .line 82
    :cond_6
    iget v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 83
    .line 84
    if-eq v11, v9, :cond_7

    .line 85
    .line 86
    invoke-super/range {p0 .. p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->onMeasure(II)V

    .line 87
    .line 88
    .line 89
    iget-object v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 90
    .line 91
    invoke-virtual {v1, v7}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 96
    .line 97
    invoke-virtual {v2, v8}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v10, v1, v2}, Lek1;->e(Landroidx/constraintlayout/widget/d;Landroidx/constraintlayout/widget/d;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v10}, Lek1;->f()V

    .line 105
    .line 106
    .line 107
    iput v7, v10, Lek1;->e:I

    .line 108
    .line 109
    iput v8, v10, Lek1;->f:I

    .line 110
    .line 111
    move v1, v5

    .line 112
    goto :goto_3

    .line 113
    :cond_7
    if-eqz v4, :cond_8

    .line 114
    .line 115
    invoke-super/range {p0 .. p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->onMeasure(II)V

    .line 116
    .line 117
    .line 118
    :cond_8
    move v1, v6

    .line 119
    :goto_3
    iget-boolean v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->X0:Z

    .line 120
    .line 121
    if-nez v2, :cond_9

    .line 122
    .line 123
    if-eqz v1, :cond_e

    .line 124
    .line 125
    :cond_9
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    add-int/2addr v2, v1

    .line 134
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    add-int/2addr v4, v1

    .line 143
    invoke-virtual {v3}, Lzz;->r()I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    add-int/2addr v1, v4

    .line 148
    invoke-virtual {v3}, Lzz;->l()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    add-int/2addr v3, v2

    .line 153
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->c1:I

    .line 154
    .line 155
    const/high16 v4, -0x80000000

    .line 156
    .line 157
    if-eq v2, v4, :cond_a

    .line 158
    .line 159
    if-nez v2, :cond_b

    .line 160
    .line 161
    :cond_a
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Y0:I

    .line 162
    .line 163
    int-to-float v2, v1

    .line 164
    iget v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->e1:F

    .line 165
    .line 166
    iget v8, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->a1:I

    .line 167
    .line 168
    sub-int/2addr v8, v1

    .line 169
    int-to-float v1, v8

    .line 170
    mul-float/2addr v7, v1

    .line 171
    add-float/2addr v7, v2

    .line 172
    float-to-int v1, v7

    .line 173
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->requestLayout()V

    .line 174
    .line 175
    .line 176
    :cond_b
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->d1:I

    .line 177
    .line 178
    if-eq v2, v4, :cond_c

    .line 179
    .line 180
    if-nez v2, :cond_d

    .line 181
    .line 182
    :cond_c
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Z0:I

    .line 183
    .line 184
    int-to-float v3, v2

    .line 185
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->e1:F

    .line 186
    .line 187
    iget v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->b1:I

    .line 188
    .line 189
    sub-int/2addr v7, v2

    .line 190
    int-to-float v2, v7

    .line 191
    mul-float/2addr v4, v2

    .line 192
    add-float/2addr v4, v3

    .line 193
    float-to-int v3, v4

    .line 194
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->requestLayout()V

    .line 195
    .line 196
    .line 197
    :cond_d
    invoke-virtual {v0, v1, v3}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 198
    .line 199
    .line 200
    :cond_e
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 201
    .line 202
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 203
    .line 204
    sub-float/2addr v1, v2

    .line 205
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 210
    .line 211
    .line 212
    move-result-wide v2

    .line 213
    iget-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h0:Lak1;

    .line 214
    .line 215
    instance-of v7, v4, Lch2;

    .line 216
    .line 217
    const v8, 0x3089705f    # 1.0E-9f

    .line 218
    .line 219
    .line 220
    const/4 v9, 0x0

    .line 221
    if-nez v7, :cond_f

    .line 222
    .line 223
    iget-wide v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v0:J

    .line 224
    .line 225
    sub-long v10, v2, v10

    .line 226
    .line 227
    long-to-float v7, v10

    .line 228
    mul-float/2addr v7, v1

    .line 229
    mul-float/2addr v7, v8

    .line 230
    iget v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s0:F

    .line 231
    .line 232
    div-float/2addr v7, v10

    .line 233
    goto :goto_4

    .line 234
    :cond_f
    move v7, v9

    .line 235
    :goto_4
    iget v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 236
    .line 237
    add-float/2addr v10, v7

    .line 238
    iget-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->x0:Z

    .line 239
    .line 240
    if-eqz v7, :cond_10

    .line 241
    .line 242
    iget v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 243
    .line 244
    :cond_10
    cmpl-float v7, v1, v9

    .line 245
    .line 246
    if-lez v7, :cond_11

    .line 247
    .line 248
    iget v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 249
    .line 250
    cmpl-float v11, v10, v11

    .line 251
    .line 252
    if-gez v11, :cond_12

    .line 253
    .line 254
    :cond_11
    cmpg-float v11, v1, v9

    .line 255
    .line 256
    if-gtz v11, :cond_13

    .line 257
    .line 258
    iget v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 259
    .line 260
    cmpg-float v11, v10, v11

    .line 261
    .line 262
    if-gtz v11, :cond_13

    .line 263
    .line 264
    :cond_12
    iget v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_13
    move v6, v5

    .line 268
    :goto_5
    if-eqz v4, :cond_15

    .line 269
    .line 270
    if-nez v6, :cond_15

    .line 271
    .line 272
    iget-boolean v6, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->C0:Z

    .line 273
    .line 274
    if-eqz v6, :cond_14

    .line 275
    .line 276
    iget-wide v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r0:J

    .line 277
    .line 278
    sub-long/2addr v2, v10

    .line 279
    long-to-float v2, v2

    .line 280
    mul-float/2addr v2, v8

    .line 281
    invoke-interface {v4, v2}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 282
    .line 283
    .line 284
    move-result v10

    .line 285
    goto :goto_6

    .line 286
    :cond_14
    invoke-interface {v4, v10}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 287
    .line 288
    .line 289
    move-result v10

    .line 290
    :cond_15
    :goto_6
    if-lez v7, :cond_16

    .line 291
    .line 292
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 293
    .line 294
    cmpl-float v2, v10, v2

    .line 295
    .line 296
    if-gez v2, :cond_17

    .line 297
    .line 298
    :cond_16
    cmpg-float v1, v1, v9

    .line 299
    .line 300
    if-gtz v1, :cond_18

    .line 301
    .line 302
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 303
    .line 304
    cmpg-float v1, v10, v1

    .line 305
    .line 306
    if-gtz v1, :cond_18

    .line 307
    .line 308
    :cond_17
    iget v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 309
    .line 310
    :cond_18
    iput v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->e1:F

    .line 311
    .line 312
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 317
    .line 318
    .line 319
    move-result-wide v13

    .line 320
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->i0:Landroid/view/animation/Interpolator;

    .line 321
    .line 322
    if-nez v2, :cond_19

    .line 323
    .line 324
    :goto_7
    move v12, v10

    .line 325
    goto :goto_8

    .line 326
    :cond_19
    invoke-interface {v2, v10}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 327
    .line 328
    .line 329
    move-result v10

    .line 330
    goto :goto_7

    .line 331
    :goto_8
    if-ge v5, v1, :cond_1b

    .line 332
    .line 333
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    iget-object v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q0:Ljava/util/HashMap;

    .line 338
    .line 339
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    move-object v11, v3

    .line 344
    check-cast v11, Lzj1;

    .line 345
    .line 346
    if-eqz v11, :cond_1a

    .line 347
    .line 348
    iget-object v15, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->f1:Ld31;

    .line 349
    .line 350
    move-object/from16 v16, v2

    .line 351
    .line 352
    invoke-virtual/range {v11 .. v16}, Lzj1;->e(FJLd31;Landroid/view/View;)Z

    .line 353
    .line 354
    .line 355
    :cond_1a
    add-int/lit8 v5, v5, 0x1

    .line 356
    .line 357
    goto :goto_8

    .line 358
    :cond_1b
    iget-boolean v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->X0:Z

    .line 359
    .line 360
    if-eqz v1, :cond_1c

    .line 361
    .line 362
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->requestLayout()V

    .line 363
    .line 364
    .line 365
    :cond_1c
    return-void
.end method

.method public final onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final onNestedPreScroll(Landroid/view/View;II[II)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 10
    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    :cond_0
    iget-object v5, v4, Llk1;->c:Lkk1;

    .line 16
    .line 17
    if-eqz v5, :cond_15

    .line 18
    .line 19
    iget-boolean v6, v5, Lkk1;->o:Z

    .line 20
    .line 21
    if-eqz v6, :cond_1

    .line 22
    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_1
    const/4 v7, -0x1

    .line 26
    if-nez v6, :cond_2

    .line 27
    .line 28
    iget-object v6, v5, Lkk1;->l:Lmq2;

    .line 29
    .line 30
    if-eqz v6, :cond_2

    .line 31
    .line 32
    iget v6, v6, Lmq2;->e:I

    .line 33
    .line 34
    if-eq v6, v7, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-eq v8, v6, :cond_2

    .line 41
    .line 42
    goto/16 :goto_3

    .line 43
    .line 44
    :cond_2
    iget-object v6, v4, Llk1;->c:Lkk1;

    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    if-eqz v6, :cond_3

    .line 48
    .line 49
    iget-object v6, v6, Lkk1;->l:Lmq2;

    .line 50
    .line 51
    if-eqz v6, :cond_3

    .line 52
    .line 53
    iget-boolean v6, v6, Lmq2;->u:Z

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    move v6, v8

    .line 57
    :goto_0
    const/high16 v9, 0x3f800000    # 1.0f

    .line 58
    .line 59
    const/4 v10, 0x0

    .line 60
    if-eqz v6, :cond_6

    .line 61
    .line 62
    iget-object v6, v5, Lkk1;->l:Lmq2;

    .line 63
    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    iget v6, v6, Lmq2;->w:I

    .line 67
    .line 68
    and-int/lit8 v6, v6, 0x4

    .line 69
    .line 70
    if-eqz v6, :cond_4

    .line 71
    .line 72
    move v7, v3

    .line 73
    :cond_4
    iget v6, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t0:F

    .line 74
    .line 75
    cmpl-float v11, v6, v9

    .line 76
    .line 77
    if-eqz v11, :cond_5

    .line 78
    .line 79
    cmpl-float v6, v6, v10

    .line 80
    .line 81
    if-nez v6, :cond_6

    .line 82
    .line 83
    :cond_5
    invoke-virtual {v1, v7}, Landroid/view/View;->canScrollVertically(I)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_6

    .line 88
    .line 89
    goto/16 :goto_3

    .line 90
    .line 91
    :cond_6
    iget-object v5, v5, Lkk1;->l:Lmq2;

    .line 92
    .line 93
    const/4 v6, 0x1

    .line 94
    if-eqz v5, :cond_d

    .line 95
    .line 96
    iget v5, v5, Lmq2;->w:I

    .line 97
    .line 98
    and-int/2addr v5, v6

    .line 99
    if-eqz v5, :cond_d

    .line 100
    .line 101
    int-to-float v5, v2

    .line 102
    int-to-float v7, v3

    .line 103
    iget-object v11, v4, Llk1;->c:Lkk1;

    .line 104
    .line 105
    if-eqz v11, :cond_a

    .line 106
    .line 107
    iget-object v11, v11, Lkk1;->l:Lmq2;

    .line 108
    .line 109
    if-eqz v11, :cond_a

    .line 110
    .line 111
    iget-object v12, v11, Lmq2;->n:[F

    .line 112
    .line 113
    iget-object v13, v11, Lmq2;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 114
    .line 115
    invoke-virtual {v13}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 116
    .line 117
    .line 118
    move-result v14

    .line 119
    move-object/from16 v17, v12

    .line 120
    .line 121
    iget-object v12, v11, Lmq2;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 122
    .line 123
    iget v13, v11, Lmq2;->d:I

    .line 124
    .line 125
    iget v15, v11, Lmq2;->h:F

    .line 126
    .line 127
    move/from16 p5, v10

    .line 128
    .line 129
    iget v10, v11, Lmq2;->g:F

    .line 130
    .line 131
    move/from16 v16, v10

    .line 132
    .line 133
    invoke-virtual/range {v12 .. v17}, Landroidx/constraintlayout/motion/widget/MotionLayout;->p(IFFF[F)V

    .line 134
    .line 135
    .line 136
    iget v10, v11, Lmq2;->k:F

    .line 137
    .line 138
    cmpl-float v12, v10, p5

    .line 139
    .line 140
    const v13, 0x33d6bf95    # 1.0E-7f

    .line 141
    .line 142
    .line 143
    if-eqz v12, :cond_8

    .line 144
    .line 145
    aget v7, v17, v8

    .line 146
    .line 147
    cmpl-float v7, v7, p5

    .line 148
    .line 149
    if-nez v7, :cond_7

    .line 150
    .line 151
    aput v13, v17, v8

    .line 152
    .line 153
    :cond_7
    mul-float/2addr v5, v10

    .line 154
    aget v7, v17, v8

    .line 155
    .line 156
    div-float/2addr v5, v7

    .line 157
    goto :goto_1

    .line 158
    :cond_8
    aget v5, v17, v6

    .line 159
    .line 160
    cmpl-float v5, v5, p5

    .line 161
    .line 162
    if-nez v5, :cond_9

    .line 163
    .line 164
    aput v13, v17, v6

    .line 165
    .line 166
    :cond_9
    iget v5, v11, Lmq2;->l:F

    .line 167
    .line 168
    mul-float/2addr v7, v5

    .line 169
    aget v5, v17, v6

    .line 170
    .line 171
    div-float v5, v7, v5

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_a
    move/from16 p5, v10

    .line 175
    .line 176
    move/from16 v5, p5

    .line 177
    .line 178
    :goto_1
    iget v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 179
    .line 180
    cmpg-float v10, v7, p5

    .line 181
    .line 182
    if-gtz v10, :cond_b

    .line 183
    .line 184
    cmpg-float v10, v5, p5

    .line 185
    .line 186
    if-ltz v10, :cond_c

    .line 187
    .line 188
    :cond_b
    cmpl-float v7, v7, v9

    .line 189
    .line 190
    if-ltz v7, :cond_e

    .line 191
    .line 192
    cmpl-float v5, v5, p5

    .line 193
    .line 194
    if-lez v5, :cond_e

    .line 195
    .line 196
    :cond_c
    invoke-virtual {v1, v8}, Landroid/view/View;->setNestedScrollingEnabled(Z)V

    .line 197
    .line 198
    .line 199
    new-instance v0, Lye;

    .line 200
    .line 201
    move-object v2, v1

    .line 202
    check-cast v2, Landroid/view/ViewGroup;

    .line 203
    .line 204
    const/16 v3, 0x11

    .line 205
    .line 206
    invoke-direct {v0, v2, v3}, Lye;-><init>(Ljava/lang/Object;I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :cond_d
    move/from16 p5, v10

    .line 214
    .line 215
    :cond_e
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t0:F

    .line 216
    .line 217
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 218
    .line 219
    .line 220
    move-result-wide v10

    .line 221
    int-to-float v5, v2

    .line 222
    iput v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->J0:F

    .line 223
    .line 224
    int-to-float v7, v3

    .line 225
    iput v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->K0:F

    .line 226
    .line 227
    iget-wide v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->L0:J

    .line 228
    .line 229
    sub-long v12, v10, v12

    .line 230
    .line 231
    long-to-double v12, v12

    .line 232
    const-wide v14, 0x3e112e0be826d695L    # 1.0E-9

    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    mul-double/2addr v12, v14

    .line 238
    double-to-float v12, v12

    .line 239
    iput v12, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->M0:F

    .line 240
    .line 241
    iput-wide v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->L0:J

    .line 242
    .line 243
    iget-object v4, v4, Llk1;->c:Lkk1;

    .line 244
    .line 245
    if-eqz v4, :cond_12

    .line 246
    .line 247
    iget-object v4, v4, Lkk1;->l:Lmq2;

    .line 248
    .line 249
    if-eqz v4, :cond_12

    .line 250
    .line 251
    iget-object v15, v4, Lmq2;->n:[F

    .line 252
    .line 253
    iget-object v10, v4, Lmq2;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 254
    .line 255
    invoke-virtual {v10}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 256
    .line 257
    .line 258
    move-result v12

    .line 259
    iget-boolean v11, v4, Lmq2;->m:Z

    .line 260
    .line 261
    if-nez v11, :cond_f

    .line 262
    .line 263
    iput-boolean v6, v4, Lmq2;->m:Z

    .line 264
    .line 265
    invoke-virtual {v10, v12}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 266
    .line 267
    .line 268
    :cond_f
    move-object v11, v10

    .line 269
    iget-object v10, v4, Lmq2;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 270
    .line 271
    move-object v13, v11

    .line 272
    iget v11, v4, Lmq2;->d:I

    .line 273
    .line 274
    move-object v14, v13

    .line 275
    iget v13, v4, Lmq2;->h:F

    .line 276
    .line 277
    move-object/from16 v16, v14

    .line 278
    .line 279
    iget v14, v4, Lmq2;->g:F

    .line 280
    .line 281
    move-object/from16 p1, v16

    .line 282
    .line 283
    invoke-virtual/range {v10 .. v15}, Landroidx/constraintlayout/motion/widget/MotionLayout;->p(IFFF[F)V

    .line 284
    .line 285
    .line 286
    iget v10, v4, Lmq2;->k:F

    .line 287
    .line 288
    aget v11, v15, v8

    .line 289
    .line 290
    mul-float/2addr v10, v11

    .line 291
    iget v11, v4, Lmq2;->l:F

    .line 292
    .line 293
    aget v13, v15, v6

    .line 294
    .line 295
    mul-float/2addr v11, v13

    .line 296
    add-float/2addr v11, v10

    .line 297
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 298
    .line 299
    .line 300
    move-result v10

    .line 301
    float-to-double v10, v10

    .line 302
    const-wide v13, 0x3f847ae147ae147bL    # 0.01

    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    cmpg-double v10, v10, v13

    .line 308
    .line 309
    if-gez v10, :cond_10

    .line 310
    .line 311
    const v10, 0x3c23d70a    # 0.01f

    .line 312
    .line 313
    .line 314
    aput v10, v15, v8

    .line 315
    .line 316
    aput v10, v15, v6

    .line 317
    .line 318
    :cond_10
    iget v10, v4, Lmq2;->k:F

    .line 319
    .line 320
    cmpl-float v11, v10, p5

    .line 321
    .line 322
    if-eqz v11, :cond_11

    .line 323
    .line 324
    mul-float/2addr v5, v10

    .line 325
    aget v4, v15, v8

    .line 326
    .line 327
    div-float/2addr v5, v4

    .line 328
    goto :goto_2

    .line 329
    :cond_11
    iget v4, v4, Lmq2;->l:F

    .line 330
    .line 331
    mul-float/2addr v7, v4

    .line 332
    aget v4, v15, v6

    .line 333
    .line 334
    div-float v5, v7, v4

    .line 335
    .line 336
    :goto_2
    add-float/2addr v12, v5

    .line 337
    invoke-static {v12, v9}, Ljava/lang/Math;->min(FF)F

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    move/from16 v5, p5

    .line 342
    .line 343
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 348
    .line 349
    .line 350
    move-result v5

    .line 351
    cmpl-float v5, v4, v5

    .line 352
    .line 353
    if-eqz v5, :cond_12

    .line 354
    .line 355
    move-object/from16 v11, p1

    .line 356
    .line 357
    invoke-virtual {v11, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 358
    .line 359
    .line 360
    :cond_12
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t0:F

    .line 361
    .line 362
    cmpl-float v1, v1, v4

    .line 363
    .line 364
    if-eqz v1, :cond_13

    .line 365
    .line 366
    aput v2, p4, v8

    .line 367
    .line 368
    aput v3, p4, v6

    .line 369
    .line 370
    :cond_13
    invoke-virtual {v0, v8}, Landroidx/constraintlayout/motion/widget/MotionLayout;->m(Z)V

    .line 371
    .line 372
    .line 373
    aget v1, p4, v8

    .line 374
    .line 375
    if-nez v1, :cond_14

    .line 376
    .line 377
    aget v1, p4, v6

    .line 378
    .line 379
    if-eqz v1, :cond_15

    .line 380
    .line 381
    :cond_14
    iput-boolean v6, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->I0:Z

    .line 382
    .line 383
    :cond_15
    :goto_3
    return-void
.end method

.method public final onNestedScroll(Landroid/view/View;IIIII)V
    .locals 0

    .line 24
    return-void
.end method

.method public final onNestedScroll(Landroid/view/View;IIIII[I)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->I0:Z

    .line 2
    .line 3
    const/4 p6, 0x0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    :cond_0
    aget p1, p7, p6

    .line 11
    .line 12
    add-int/2addr p1, p4

    .line 13
    aput p1, p7, p6

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    aget p2, p7, p1

    .line 17
    .line 18
    add-int/2addr p2, p5

    .line 19
    aput p2, p7, p1

    .line 20
    .line 21
    :cond_1
    iput-boolean p6, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->I0:Z

    .line 22
    .line 23
    return-void
.end method

.method public final onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iput-wide p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->L0:J

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->M0:F

    .line 9
    .line 10
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->J0:F

    .line 11
    .line 12
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->K0:F

    .line 13
    .line 14
    return-void
.end method

.method public final onRtlPropertiesChanged(I)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->e()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    iput-boolean p0, p1, Llk1;->p:Z

    .line 10
    .line 11
    iget-object p1, p1, Llk1;->c:Lkk1;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p1, Lkk1;->l:Lmq2;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Lmq2;->c(Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final onStartNestedScroll(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Llk1;->c:Lkk1;

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Lkk1;->l:Lmq2;

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    iget p0, p0, Lmq2;->w:I

    .line 14
    .line 15
    and-int/lit8 p0, p0, 0x2

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final onStopNestedScroll(Landroid/view/View;I)V
    .locals 10

    .line 1
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 2
    .line 3
    if-eqz p1, :cond_6

    .line 4
    .line 5
    iget p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->M0:F

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    cmpl-float v1, p2, v0

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_3

    .line 13
    :cond_0
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->J0:F

    .line 14
    .line 15
    div-float/2addr v1, p2

    .line 16
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->K0:F

    .line 17
    .line 18
    div-float/2addr p0, p2

    .line 19
    iget-object p1, p1, Llk1;->c:Lkk1;

    .line 20
    .line 21
    if-eqz p1, :cond_6

    .line 22
    .line 23
    iget-object p1, p1, Lkk1;->l:Lmq2;

    .line 24
    .line 25
    if-eqz p1, :cond_6

    .line 26
    .line 27
    iget-object v7, p1, Lmq2;->n:[F

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    iput-boolean p2, p1, Lmq2;->m:Z

    .line 31
    .line 32
    iget-object v8, p1, Lmq2;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 33
    .line 34
    invoke-virtual {v8}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    iget-object v2, p1, Lmq2;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 39
    .line 40
    iget v3, p1, Lmq2;->d:I

    .line 41
    .line 42
    iget v5, p1, Lmq2;->h:F

    .line 43
    .line 44
    iget v6, p1, Lmq2;->g:F

    .line 45
    .line 46
    invoke-virtual/range {v2 .. v7}, Landroidx/constraintlayout/motion/widget/MotionLayout;->p(IFFF[F)V

    .line 47
    .line 48
    .line 49
    iget v2, p1, Lmq2;->k:F

    .line 50
    .line 51
    aget v3, v7, p2

    .line 52
    .line 53
    iget v5, p1, Lmq2;->l:F

    .line 54
    .line 55
    const/4 v6, 0x1

    .line 56
    aget v7, v7, v6

    .line 57
    .line 58
    cmpl-float v9, v2, v0

    .line 59
    .line 60
    if-eqz v9, :cond_1

    .line 61
    .line 62
    mul-float/2addr v1, v2

    .line 63
    div-float/2addr v1, v3

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    mul-float/2addr p0, v5

    .line 66
    div-float v1, p0, v7

    .line 67
    .line 68
    :goto_0
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-nez p0, :cond_2

    .line 73
    .line 74
    const/high16 p0, 0x40400000    # 3.0f

    .line 75
    .line 76
    div-float p0, v1, p0

    .line 77
    .line 78
    add-float/2addr v4, p0

    .line 79
    :cond_2
    cmpl-float p0, v4, v0

    .line 80
    .line 81
    if-eqz p0, :cond_6

    .line 82
    .line 83
    const/high16 p0, 0x3f800000    # 1.0f

    .line 84
    .line 85
    cmpl-float v2, v4, p0

    .line 86
    .line 87
    if-eqz v2, :cond_3

    .line 88
    .line 89
    move v2, v6

    .line 90
    goto :goto_1

    .line 91
    :cond_3
    move v2, p2

    .line 92
    :goto_1
    iget p1, p1, Lmq2;->c:I

    .line 93
    .line 94
    const/4 v3, 0x3

    .line 95
    if-eq p1, v3, :cond_4

    .line 96
    .line 97
    move p2, v6

    .line 98
    :cond_4
    and-int/2addr p2, v2

    .line 99
    if-eqz p2, :cond_6

    .line 100
    .line 101
    float-to-double v2, v4

    .line 102
    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    .line 103
    .line 104
    cmpg-double p2, v2, v4

    .line 105
    .line 106
    if-gez p2, :cond_5

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    move v0, p0

    .line 110
    :goto_2
    invoke-virtual {v8, v0, v1, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->z(FFI)V

    .line 111
    .line 112
    .line 113
    :cond_6
    :goto_3
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 6
    .line 7
    if-eqz v2, :cond_61

    .line 8
    .line 9
    iget-boolean v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p0:Z

    .line 10
    .line 11
    if-eqz v3, :cond_61

    .line 12
    .line 13
    invoke-virtual {v2}, Llk1;->o()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_61

    .line 18
    .line 19
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 20
    .line 21
    iget-object v3, v2, Llk1;->c:Lkk1;

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    iget-boolean v3, v3, Lkk1;->o:Z

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0

    .line 34
    :cond_0
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getCurrentState()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    iget-object v4, v2, Llk1;->a:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 39
    .line 40
    new-instance v5, Landroid/graphics/RectF;

    .line 41
    .line 42
    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object v6, v2, Llk1;->o:Lgr0;

    .line 46
    .line 47
    if-nez v6, :cond_1

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    sget-object v6, Lgr0;->c:Lgr0;

    .line 53
    .line 54
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    iput-object v7, v6, Lgr0;->a:Ljava/lang/Object;

    .line 59
    .line 60
    iput-object v6, v2, Llk1;->o:Lgr0;

    .line 61
    .line 62
    :cond_1
    iget-object v6, v2, Llk1;->o:Lgr0;

    .line 63
    .line 64
    iget-object v6, v6, Lgr0;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v6, Landroid/view/VelocityTracker;

    .line 67
    .line 68
    if-eqz v6, :cond_2

    .line 69
    .line 70
    invoke-virtual {v6, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    const/4 v8, 0x2

    .line 74
    const/4 v10, -0x1

    .line 75
    if-eq v3, v10, :cond_19

    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    if-eqz v12, :cond_16

    .line 82
    .line 83
    if-eq v12, v8, :cond_3

    .line 84
    .line 85
    goto/16 :goto_b

    .line 86
    .line 87
    :cond_3
    iget-boolean v12, v2, Llk1;->m:Z

    .line 88
    .line 89
    if-eqz v12, :cond_4

    .line 90
    .line 91
    goto/16 :goto_b

    .line 92
    .line 93
    :cond_4
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 94
    .line 95
    .line 96
    move-result v12

    .line 97
    iget v13, v2, Llk1;->s:F

    .line 98
    .line 99
    sub-float/2addr v12, v13

    .line 100
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    iget v14, v2, Llk1;->r:F

    .line 105
    .line 106
    sub-float/2addr v13, v14

    .line 107
    float-to-double v14, v13

    .line 108
    const-wide/16 v16, 0x0

    .line 109
    .line 110
    cmpl-double v14, v14, v16

    .line 111
    .line 112
    if-nez v14, :cond_5

    .line 113
    .line 114
    float-to-double v14, v12

    .line 115
    cmpl-double v14, v14, v16

    .line 116
    .line 117
    if-eqz v14, :cond_5f

    .line 118
    .line 119
    :cond_5
    iget-object v14, v2, Llk1;->l:Landroid/view/MotionEvent;

    .line 120
    .line 121
    if-nez v14, :cond_6

    .line 122
    .line 123
    goto/16 :goto_2c

    .line 124
    .line 125
    :cond_6
    if-eq v3, v10, :cond_14

    .line 126
    .line 127
    iget-object v15, v2, Llk1;->b:Ln7;

    .line 128
    .line 129
    if-eqz v15, :cond_7

    .line 130
    .line 131
    invoke-virtual {v15, v3}, Ln7;->o(I)I

    .line 132
    .line 133
    .line 134
    move-result v15

    .line 135
    if-eq v15, v10, :cond_7

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_7
    move v15, v3

    .line 139
    :goto_0
    new-instance v6, Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 142
    .line 143
    .line 144
    iget-object v10, v2, Llk1;->d:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v10

    .line 150
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v18

    .line 154
    if-eqz v18, :cond_a

    .line 155
    .line 156
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v18

    .line 160
    move-object/from16 v8, v18

    .line 161
    .line 162
    check-cast v8, Lkk1;

    .line 163
    .line 164
    iget v7, v8, Lkk1;->d:I

    .line 165
    .line 166
    if-eq v7, v15, :cond_8

    .line 167
    .line 168
    iget v7, v8, Lkk1;->c:I

    .line 169
    .line 170
    if-ne v7, v15, :cond_9

    .line 171
    .line 172
    :cond_8
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    :cond_9
    const/4 v8, 0x2

    .line 176
    goto :goto_1

    .line 177
    :cond_a
    new-instance v7, Landroid/graphics/RectF;

    .line 178
    .line 179
    invoke-direct {v7}, Landroid/graphics/RectF;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    const/4 v8, 0x0

    .line 187
    const/4 v10, 0x0

    .line 188
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v15

    .line 192
    if-eqz v15, :cond_13

    .line 193
    .line 194
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v15

    .line 198
    check-cast v15, Lkk1;

    .line 199
    .line 200
    iget-boolean v9, v15, Lkk1;->o:Z

    .line 201
    .line 202
    if-eqz v9, :cond_b

    .line 203
    .line 204
    move-object/from16 v20, v6

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_b
    iget-object v9, v15, Lkk1;->l:Lmq2;

    .line 208
    .line 209
    if-eqz v9, :cond_11

    .line 210
    .line 211
    iget-boolean v11, v2, Llk1;->p:Z

    .line 212
    .line 213
    invoke-virtual {v9, v11}, Lmq2;->c(Z)V

    .line 214
    .line 215
    .line 216
    iget-object v9, v15, Lkk1;->l:Lmq2;

    .line 217
    .line 218
    invoke-virtual {v9, v4, v7}, Lmq2;->b(Landroid/view/ViewGroup;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 219
    .line 220
    .line 221
    move-result-object v9

    .line 222
    if-eqz v9, :cond_c

    .line 223
    .line 224
    invoke-virtual {v14}, Landroid/view/MotionEvent;->getX()F

    .line 225
    .line 226
    .line 227
    move-result v11

    .line 228
    move-object/from16 v20, v6

    .line 229
    .line 230
    invoke-virtual {v14}, Landroid/view/MotionEvent;->getY()F

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    invoke-virtual {v9, v11, v6}, Landroid/graphics/RectF;->contains(FF)Z

    .line 235
    .line 236
    .line 237
    move-result v6

    .line 238
    if-nez v6, :cond_d

    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_c
    move-object/from16 v20, v6

    .line 242
    .line 243
    :cond_d
    iget-object v6, v15, Lkk1;->l:Lmq2;

    .line 244
    .line 245
    invoke-virtual {v6, v4, v7}, Lmq2;->a(Landroid/view/ViewGroup;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    if-eqz v6, :cond_e

    .line 250
    .line 251
    invoke-virtual {v14}, Landroid/view/MotionEvent;->getX()F

    .line 252
    .line 253
    .line 254
    move-result v9

    .line 255
    invoke-virtual {v14}, Landroid/view/MotionEvent;->getY()F

    .line 256
    .line 257
    .line 258
    move-result v11

    .line 259
    invoke-virtual {v6, v9, v11}, Landroid/graphics/RectF;->contains(FF)Z

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    if-nez v6, :cond_e

    .line 264
    .line 265
    :goto_3
    move-object/from16 v6, v20

    .line 266
    .line 267
    goto :goto_2

    .line 268
    :cond_e
    iget-object v6, v15, Lkk1;->l:Lmq2;

    .line 269
    .line 270
    iget v9, v6, Lmq2;->k:F

    .line 271
    .line 272
    mul-float/2addr v9, v13

    .line 273
    iget v11, v6, Lmq2;->l:F

    .line 274
    .line 275
    mul-float/2addr v11, v12

    .line 276
    add-float/2addr v11, v9

    .line 277
    iget-boolean v6, v6, Lmq2;->j:Z

    .line 278
    .line 279
    if-eqz v6, :cond_f

    .line 280
    .line 281
    invoke-virtual {v14}, Landroid/view/MotionEvent;->getX()F

    .line 282
    .line 283
    .line 284
    move-result v6

    .line 285
    iget-object v9, v15, Lkk1;->l:Lmq2;

    .line 286
    .line 287
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    const/high16 v9, 0x3f000000    # 0.5f

    .line 291
    .line 292
    sub-float/2addr v6, v9

    .line 293
    invoke-virtual {v14}, Landroid/view/MotionEvent;->getY()F

    .line 294
    .line 295
    .line 296
    move-result v11

    .line 297
    move/from16 v21, v9

    .line 298
    .line 299
    iget-object v9, v15, Lkk1;->l:Lmq2;

    .line 300
    .line 301
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    sub-float v11, v11, v21

    .line 305
    .line 306
    add-float v9, v13, v6

    .line 307
    .line 308
    move-object/from16 v21, v7

    .line 309
    .line 310
    add-float v7, v12, v11

    .line 311
    .line 312
    move/from16 v22, v8

    .line 313
    .line 314
    float-to-double v7, v7

    .line 315
    move-object/from16 v23, v10

    .line 316
    .line 317
    float-to-double v9, v9

    .line 318
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->atan2(DD)D

    .line 319
    .line 320
    .line 321
    move-result-wide v7

    .line 322
    float-to-double v9, v6

    .line 323
    move-wide/from16 v24, v7

    .line 324
    .line 325
    float-to-double v6, v11

    .line 326
    invoke-static {v9, v10, v6, v7}, Ljava/lang/Math;->atan2(DD)D

    .line 327
    .line 328
    .line 329
    move-result-wide v6

    .line 330
    sub-double v7, v24, v6

    .line 331
    .line 332
    double-to-float v6, v7

    .line 333
    const/high16 v7, 0x41200000    # 10.0f

    .line 334
    .line 335
    mul-float v11, v6, v7

    .line 336
    .line 337
    goto :goto_4

    .line 338
    :cond_f
    move-object/from16 v21, v7

    .line 339
    .line 340
    move/from16 v22, v8

    .line 341
    .line 342
    move-object/from16 v23, v10

    .line 343
    .line 344
    :goto_4
    iget v6, v15, Lkk1;->c:I

    .line 345
    .line 346
    if-ne v6, v3, :cond_10

    .line 347
    .line 348
    const/high16 v6, -0x40800000    # -1.0f

    .line 349
    .line 350
    :goto_5
    mul-float/2addr v11, v6

    .line 351
    goto :goto_6

    .line 352
    :cond_10
    const v6, 0x3f8ccccd    # 1.1f

    .line 353
    .line 354
    .line 355
    goto :goto_5

    .line 356
    :goto_6
    cmpl-float v6, v11, v22

    .line 357
    .line 358
    if-lez v6, :cond_12

    .line 359
    .line 360
    move v8, v11

    .line 361
    move-object v10, v15

    .line 362
    goto :goto_7

    .line 363
    :cond_11
    move-object/from16 v20, v6

    .line 364
    .line 365
    move-object/from16 v21, v7

    .line 366
    .line 367
    move/from16 v22, v8

    .line 368
    .line 369
    move-object/from16 v23, v10

    .line 370
    .line 371
    :cond_12
    move/from16 v8, v22

    .line 372
    .line 373
    move-object/from16 v10, v23

    .line 374
    .line 375
    :goto_7
    move-object/from16 v6, v20

    .line 376
    .line 377
    move-object/from16 v7, v21

    .line 378
    .line 379
    goto/16 :goto_2

    .line 380
    .line 381
    :cond_13
    move-object/from16 v23, v10

    .line 382
    .line 383
    goto :goto_8

    .line 384
    :cond_14
    iget-object v10, v2, Llk1;->c:Lkk1;

    .line 385
    .line 386
    :goto_8
    if-eqz v10, :cond_19

    .line 387
    .line 388
    invoke-virtual {v0, v10}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setTransition(Lkk1;)V

    .line 389
    .line 390
    .line 391
    iget-object v3, v2, Llk1;->c:Lkk1;

    .line 392
    .line 393
    iget-object v3, v3, Lkk1;->l:Lmq2;

    .line 394
    .line 395
    invoke-virtual {v3, v4, v5}, Lmq2;->b(Landroid/view/ViewGroup;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 396
    .line 397
    .line 398
    move-result-object v3

    .line 399
    if-eqz v3, :cond_15

    .line 400
    .line 401
    iget-object v4, v2, Llk1;->l:Landroid/view/MotionEvent;

    .line 402
    .line 403
    invoke-virtual {v4}, Landroid/view/MotionEvent;->getX()F

    .line 404
    .line 405
    .line 406
    move-result v4

    .line 407
    iget-object v5, v2, Llk1;->l:Landroid/view/MotionEvent;

    .line 408
    .line 409
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getY()F

    .line 410
    .line 411
    .line 412
    move-result v5

    .line 413
    invoke-virtual {v3, v4, v5}, Landroid/graphics/RectF;->contains(FF)Z

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    if-nez v3, :cond_15

    .line 418
    .line 419
    const/4 v3, 0x1

    .line 420
    goto :goto_9

    .line 421
    :cond_15
    const/4 v3, 0x0

    .line 422
    :goto_9
    iput-boolean v3, v2, Llk1;->n:Z

    .line 423
    .line 424
    iget-object v3, v2, Llk1;->c:Lkk1;

    .line 425
    .line 426
    iget-object v3, v3, Lkk1;->l:Lmq2;

    .line 427
    .line 428
    iget v4, v2, Llk1;->r:F

    .line 429
    .line 430
    iget v5, v2, Llk1;->s:F

    .line 431
    .line 432
    iput v4, v3, Lmq2;->p:F

    .line 433
    .line 434
    iput v5, v3, Lmq2;->q:F

    .line 435
    .line 436
    const/4 v6, 0x0

    .line 437
    iput-boolean v6, v3, Lmq2;->m:Z

    .line 438
    .line 439
    goto :goto_b

    .line 440
    :cond_16
    const/4 v6, 0x0

    .line 441
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 442
    .line 443
    .line 444
    move-result v3

    .line 445
    iput v3, v2, Llk1;->r:F

    .line 446
    .line 447
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 448
    .line 449
    .line 450
    move-result v3

    .line 451
    iput v3, v2, Llk1;->s:F

    .line 452
    .line 453
    iput-object v1, v2, Llk1;->l:Landroid/view/MotionEvent;

    .line 454
    .line 455
    iput-boolean v6, v2, Llk1;->m:Z

    .line 456
    .line 457
    iget-object v1, v2, Llk1;->c:Lkk1;

    .line 458
    .line 459
    iget-object v1, v1, Lkk1;->l:Lmq2;

    .line 460
    .line 461
    if-eqz v1, :cond_5f

    .line 462
    .line 463
    invoke-virtual {v1, v4, v5}, Lmq2;->a(Landroid/view/ViewGroup;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    if-eqz v1, :cond_17

    .line 468
    .line 469
    iget-object v3, v2, Llk1;->l:Landroid/view/MotionEvent;

    .line 470
    .line 471
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getX()F

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    iget-object v6, v2, Llk1;->l:Landroid/view/MotionEvent;

    .line 476
    .line 477
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    .line 478
    .line 479
    .line 480
    move-result v6

    .line 481
    invoke-virtual {v1, v3, v6}, Landroid/graphics/RectF;->contains(FF)Z

    .line 482
    .line 483
    .line 484
    move-result v1

    .line 485
    if-nez v1, :cond_17

    .line 486
    .line 487
    const/4 v1, 0x0

    .line 488
    iput-object v1, v2, Llk1;->l:Landroid/view/MotionEvent;

    .line 489
    .line 490
    const/4 v1, 0x1

    .line 491
    iput-boolean v1, v2, Llk1;->m:Z

    .line 492
    .line 493
    goto/16 :goto_2c

    .line 494
    .line 495
    :cond_17
    iget-object v1, v2, Llk1;->c:Lkk1;

    .line 496
    .line 497
    iget-object v1, v1, Lkk1;->l:Lmq2;

    .line 498
    .line 499
    invoke-virtual {v1, v4, v5}, Lmq2;->b(Landroid/view/ViewGroup;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    if-eqz v1, :cond_18

    .line 504
    .line 505
    iget-object v3, v2, Llk1;->l:Landroid/view/MotionEvent;

    .line 506
    .line 507
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getX()F

    .line 508
    .line 509
    .line 510
    move-result v3

    .line 511
    iget-object v4, v2, Llk1;->l:Landroid/view/MotionEvent;

    .line 512
    .line 513
    invoke-virtual {v4}, Landroid/view/MotionEvent;->getY()F

    .line 514
    .line 515
    .line 516
    move-result v4

    .line 517
    invoke-virtual {v1, v3, v4}, Landroid/graphics/RectF;->contains(FF)Z

    .line 518
    .line 519
    .line 520
    move-result v1

    .line 521
    if-nez v1, :cond_18

    .line 522
    .line 523
    const/4 v1, 0x1

    .line 524
    iput-boolean v1, v2, Llk1;->n:Z

    .line 525
    .line 526
    goto :goto_a

    .line 527
    :cond_18
    const/4 v6, 0x0

    .line 528
    iput-boolean v6, v2, Llk1;->n:Z

    .line 529
    .line 530
    :goto_a
    iget-object v1, v2, Llk1;->c:Lkk1;

    .line 531
    .line 532
    iget-object v1, v1, Lkk1;->l:Lmq2;

    .line 533
    .line 534
    iget v3, v2, Llk1;->r:F

    .line 535
    .line 536
    iget v2, v2, Llk1;->s:F

    .line 537
    .line 538
    iput v3, v1, Lmq2;->p:F

    .line 539
    .line 540
    iput v2, v1, Lmq2;->q:F

    .line 541
    .line 542
    goto/16 :goto_2c

    .line 543
    .line 544
    :cond_19
    :goto_b
    iget-boolean v3, v2, Llk1;->m:Z

    .line 545
    .line 546
    if-eqz v3, :cond_1a

    .line 547
    .line 548
    goto/16 :goto_2c

    .line 549
    .line 550
    :cond_1a
    iget-object v3, v2, Llk1;->c:Lkk1;

    .line 551
    .line 552
    if-eqz v3, :cond_5d

    .line 553
    .line 554
    iget-object v3, v3, Lkk1;->l:Lmq2;

    .line 555
    .line 556
    if-eqz v3, :cond_5d

    .line 557
    .line 558
    iget-object v9, v3, Lmq2;->n:[F

    .line 559
    .line 560
    iget-boolean v4, v2, Llk1;->n:Z

    .line 561
    .line 562
    if-nez v4, :cond_5d

    .line 563
    .line 564
    iget-object v10, v2, Llk1;->o:Lgr0;

    .line 565
    .line 566
    iget-object v11, v3, Lmq2;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 567
    .line 568
    iget-boolean v4, v3, Lmq2;->j:Z

    .line 569
    .line 570
    const/4 v14, 0x3

    .line 571
    const-wide v20, 0x3f847ae147ae147bL    # 0.01

    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    const/4 v6, 0x6

    .line 577
    sget-object v8, Lhk1;->d:Lhk1;

    .line 578
    .line 579
    const-wide/high16 v22, 0x3fe0000000000000L    # 0.5

    .line 580
    .line 581
    if-eqz v4, :cond_3c

    .line 582
    .line 583
    iget-object v4, v3, Lmq2;->o:[I

    .line 584
    .line 585
    iget-object v13, v10, Lgr0;->a:Ljava/lang/Object;

    .line 586
    .line 587
    check-cast v13, Landroid/view/VelocityTracker;

    .line 588
    .line 589
    if-eqz v13, :cond_1b

    .line 590
    .line 591
    invoke-virtual {v13, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 592
    .line 593
    .line 594
    :cond_1b
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    .line 595
    .line 596
    .line 597
    move-result v13

    .line 598
    if-eqz v13, :cond_3b

    .line 599
    .line 600
    const/high16 v24, 0x43b40000    # 360.0f

    .line 601
    .line 602
    const/high16 v25, 0x40000000    # 2.0f

    .line 603
    .line 604
    const/4 v5, 0x1

    .line 605
    if-eq v13, v5, :cond_2b

    .line 606
    .line 607
    const/4 v5, 0x2

    .line 608
    if-eq v13, v5, :cond_1c

    .line 609
    .line 610
    goto/16 :goto_2a

    .line 611
    .line 612
    :cond_1c
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 613
    .line 614
    .line 615
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 616
    .line 617
    .line 618
    invoke-virtual {v11}, Landroid/view/View;->getWidth()I

    .line 619
    .line 620
    .line 621
    move-result v5

    .line 622
    int-to-float v5, v5

    .line 623
    div-float v5, v5, v25

    .line 624
    .line 625
    invoke-virtual {v11}, Landroid/view/View;->getHeight()I

    .line 626
    .line 627
    .line 628
    move-result v6

    .line 629
    int-to-float v6, v6

    .line 630
    div-float v6, v6, v25

    .line 631
    .line 632
    iget v8, v3, Lmq2;->i:I

    .line 633
    .line 634
    const/4 v13, -0x1

    .line 635
    if-eq v8, v13, :cond_1d

    .line 636
    .line 637
    invoke-virtual {v11, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 638
    .line 639
    .line 640
    move-result-object v5

    .line 641
    invoke-virtual {v11, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 642
    .line 643
    .line 644
    const/16 v19, 0x0

    .line 645
    .line 646
    aget v6, v4, v19

    .line 647
    .line 648
    int-to-float v6, v6

    .line 649
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 650
    .line 651
    .line 652
    move-result v8

    .line 653
    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    .line 654
    .line 655
    .line 656
    move-result v13

    .line 657
    add-int/2addr v13, v8

    .line 658
    int-to-float v8, v13

    .line 659
    div-float v8, v8, v25

    .line 660
    .line 661
    add-float/2addr v6, v8

    .line 662
    const/16 v18, 0x1

    .line 663
    .line 664
    aget v4, v4, v18

    .line 665
    .line 666
    int-to-float v4, v4

    .line 667
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 668
    .line 669
    .line 670
    move-result v8

    .line 671
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    .line 672
    .line 673
    .line 674
    move-result v5

    .line 675
    add-int/2addr v5, v8

    .line 676
    int-to-float v5, v5

    .line 677
    div-float v5, v5, v25

    .line 678
    .line 679
    add-float/2addr v4, v5

    .line 680
    move v5, v6

    .line 681
    move v6, v4

    .line 682
    goto :goto_c

    .line 683
    :cond_1d
    iget v8, v3, Lmq2;->d:I

    .line 684
    .line 685
    const/4 v13, -0x1

    .line 686
    if-eq v8, v13, :cond_1f

    .line 687
    .line 688
    iget-object v13, v11, Landroidx/constraintlayout/motion/widget/MotionLayout;->q0:Ljava/util/HashMap;

    .line 689
    .line 690
    invoke-virtual {v11, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 691
    .line 692
    .line 693
    move-result-object v8

    .line 694
    invoke-virtual {v13, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v8

    .line 698
    check-cast v8, Lzj1;

    .line 699
    .line 700
    iget-object v8, v8, Lzj1;->f:Lik1;

    .line 701
    .line 702
    iget v8, v8, Lik1;->V:I

    .line 703
    .line 704
    invoke-virtual {v11, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 705
    .line 706
    .line 707
    move-result-object v8

    .line 708
    if-nez v8, :cond_1e

    .line 709
    .line 710
    const-string v4, "TouchResponse"

    .line 711
    .line 712
    const-string v8, "could not find view to animate to"

    .line 713
    .line 714
    invoke-static {v4, v8}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 715
    .line 716
    .line 717
    goto :goto_c

    .line 718
    :cond_1e
    invoke-virtual {v11, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 719
    .line 720
    .line 721
    const/16 v19, 0x0

    .line 722
    .line 723
    aget v5, v4, v19

    .line 724
    .line 725
    int-to-float v5, v5

    .line 726
    invoke-virtual {v8}, Landroid/view/View;->getLeft()I

    .line 727
    .line 728
    .line 729
    move-result v6

    .line 730
    invoke-virtual {v8}, Landroid/view/View;->getRight()I

    .line 731
    .line 732
    .line 733
    move-result v13

    .line 734
    add-int/2addr v13, v6

    .line 735
    int-to-float v6, v13

    .line 736
    div-float v6, v6, v25

    .line 737
    .line 738
    add-float/2addr v5, v6

    .line 739
    const/16 v18, 0x1

    .line 740
    .line 741
    aget v4, v4, v18

    .line 742
    .line 743
    int-to-float v4, v4

    .line 744
    invoke-virtual {v8}, Landroid/view/View;->getTop()I

    .line 745
    .line 746
    .line 747
    move-result v6

    .line 748
    invoke-virtual {v8}, Landroid/view/View;->getBottom()I

    .line 749
    .line 750
    .line 751
    move-result v8

    .line 752
    add-int/2addr v8, v6

    .line 753
    int-to-float v6, v8

    .line 754
    div-float v6, v6, v25

    .line 755
    .line 756
    add-float/2addr v6, v4

    .line 757
    :cond_1f
    :goto_c
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 758
    .line 759
    .line 760
    move-result v4

    .line 761
    sub-float v13, v4, v5

    .line 762
    .line 763
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 764
    .line 765
    .line 766
    move-result v4

    .line 767
    sub-float v14, v4, v6

    .line 768
    .line 769
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 770
    .line 771
    .line 772
    move-result v4

    .line 773
    sub-float/2addr v4, v6

    .line 774
    float-to-double v7, v4

    .line 775
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 776
    .line 777
    .line 778
    move-result v4

    .line 779
    sub-float/2addr v4, v5

    .line 780
    move v15, v13

    .line 781
    float-to-double v12, v4

    .line 782
    invoke-static {v7, v8, v12, v13}, Ljava/lang/Math;->atan2(DD)D

    .line 783
    .line 784
    .line 785
    move-result-wide v12

    .line 786
    iget v4, v3, Lmq2;->q:F

    .line 787
    .line 788
    sub-float/2addr v4, v6

    .line 789
    float-to-double v6, v4

    .line 790
    iget v4, v3, Lmq2;->p:F

    .line 791
    .line 792
    sub-float/2addr v4, v5

    .line 793
    float-to-double v4, v4

    .line 794
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    .line 795
    .line 796
    .line 797
    move-result-wide v4

    .line 798
    sub-double v4, v12, v4

    .line 799
    .line 800
    const-wide v6, 0x4066800000000000L    # 180.0

    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    mul-double/2addr v4, v6

    .line 806
    const-wide v6, 0x400921fb54442d18L    # Math.PI

    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    div-double/2addr v4, v6

    .line 812
    double-to-float v4, v4

    .line 813
    const/high16 v5, 0x43a50000    # 330.0f

    .line 814
    .line 815
    cmpl-float v5, v4, v5

    .line 816
    .line 817
    if-lez v5, :cond_21

    .line 818
    .line 819
    sub-float v4, v4, v24

    .line 820
    .line 821
    :cond_20
    :goto_d
    move/from16 v19, v4

    .line 822
    .line 823
    goto :goto_e

    .line 824
    :cond_21
    const/high16 v5, -0x3c5b0000    # -330.0f

    .line 825
    .line 826
    cmpg-float v5, v4, v5

    .line 827
    .line 828
    if-gez v5, :cond_20

    .line 829
    .line 830
    add-float v4, v4, v24

    .line 831
    .line 832
    goto :goto_d

    .line 833
    :goto_e
    invoke-static/range {v19 .. v19}, Ljava/lang/Math;->abs(F)F

    .line 834
    .line 835
    .line 836
    move-result v4

    .line 837
    float-to-double v4, v4

    .line 838
    cmpl-double v4, v4, v20

    .line 839
    .line 840
    if-gtz v4, :cond_22

    .line 841
    .line 842
    iget-boolean v4, v3, Lmq2;->m:Z

    .line 843
    .line 844
    if-eqz v4, :cond_5d

    .line 845
    .line 846
    :cond_22
    invoke-virtual {v11}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 847
    .line 848
    .line 849
    move-result v6

    .line 850
    iget-boolean v4, v3, Lmq2;->m:Z

    .line 851
    .line 852
    if-nez v4, :cond_23

    .line 853
    .line 854
    const/4 v4, 0x1

    .line 855
    iput-boolean v4, v3, Lmq2;->m:Z

    .line 856
    .line 857
    invoke-virtual {v11, v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 858
    .line 859
    .line 860
    goto :goto_f

    .line 861
    :cond_23
    const/4 v4, 0x1

    .line 862
    :goto_f
    iget v5, v3, Lmq2;->d:I

    .line 863
    .line 864
    const/4 v7, -0x1

    .line 865
    if-eq v5, v7, :cond_24

    .line 866
    .line 867
    move/from16 v18, v4

    .line 868
    .line 869
    iget-object v4, v3, Lmq2;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 870
    .line 871
    iget v7, v3, Lmq2;->h:F

    .line 872
    .line 873
    iget v8, v3, Lmq2;->g:F

    .line 874
    .line 875
    move-wide/from16 v22, v12

    .line 876
    .line 877
    const/16 v12, 0x3e8

    .line 878
    .line 879
    invoke-virtual/range {v4 .. v9}, Landroidx/constraintlayout/motion/widget/MotionLayout;->p(IFFF[F)V

    .line 880
    .line 881
    .line 882
    aget v4, v9, v18

    .line 883
    .line 884
    float-to-double v4, v4

    .line 885
    invoke-static {v4, v5}, Ljava/lang/Math;->toDegrees(D)D

    .line 886
    .line 887
    .line 888
    move-result-wide v4

    .line 889
    double-to-float v4, v4

    .line 890
    aput v4, v9, v18

    .line 891
    .line 892
    goto :goto_10

    .line 893
    :cond_24
    move/from16 v18, v4

    .line 894
    .line 895
    move-wide/from16 v22, v12

    .line 896
    .line 897
    const/16 v12, 0x3e8

    .line 898
    .line 899
    aput v24, v9, v18

    .line 900
    .line 901
    :goto_10
    iget v4, v3, Lmq2;->v:F

    .line 902
    .line 903
    mul-float v19, v19, v4

    .line 904
    .line 905
    aget v4, v9, v18

    .line 906
    .line 907
    div-float v19, v19, v4

    .line 908
    .line 909
    add-float v4, v19, v6

    .line 910
    .line 911
    const/high16 v5, 0x3f800000    # 1.0f

    .line 912
    .line 913
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    .line 914
    .line 915
    .line 916
    move-result v4

    .line 917
    const/4 v6, 0x0

    .line 918
    invoke-static {v4, v6}, Ljava/lang/Math;->max(FF)F

    .line 919
    .line 920
    .line 921
    move-result v4

    .line 922
    invoke-virtual {v11}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 923
    .line 924
    .line 925
    move-result v7

    .line 926
    cmpl-float v8, v4, v7

    .line 927
    .line 928
    if-eqz v8, :cond_2a

    .line 929
    .line 930
    cmpl-float v8, v7, v6

    .line 931
    .line 932
    if-eqz v8, :cond_25

    .line 933
    .line 934
    cmpl-float v5, v7, v5

    .line 935
    .line 936
    if-nez v5, :cond_26

    .line 937
    .line 938
    :cond_25
    invoke-virtual {v11}, Landroidx/constraintlayout/motion/widget/MotionLayout;->l()V

    .line 939
    .line 940
    .line 941
    :cond_26
    invoke-virtual {v11, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 942
    .line 943
    .line 944
    iget-object v4, v10, Lgr0;->a:Ljava/lang/Object;

    .line 945
    .line 946
    check-cast v4, Landroid/view/VelocityTracker;

    .line 947
    .line 948
    if-eqz v4, :cond_27

    .line 949
    .line 950
    invoke-virtual {v4, v12}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 951
    .line 952
    .line 953
    :cond_27
    iget-object v4, v10, Lgr0;->a:Ljava/lang/Object;

    .line 954
    .line 955
    check-cast v4, Landroid/view/VelocityTracker;

    .line 956
    .line 957
    if-eqz v4, :cond_28

    .line 958
    .line 959
    invoke-virtual {v4}, Landroid/view/VelocityTracker;->getXVelocity()F

    .line 960
    .line 961
    .line 962
    move-result v4

    .line 963
    goto :goto_11

    .line 964
    :cond_28
    const/4 v4, 0x0

    .line 965
    :goto_11
    iget-object v5, v10, Lgr0;->a:Ljava/lang/Object;

    .line 966
    .line 967
    check-cast v5, Landroid/view/VelocityTracker;

    .line 968
    .line 969
    if-eqz v5, :cond_29

    .line 970
    .line 971
    invoke-virtual {v5}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 972
    .line 973
    .line 974
    move-result v6

    .line 975
    goto :goto_12

    .line 976
    :cond_29
    const/4 v6, 0x0

    .line 977
    :goto_12
    float-to-double v5, v6

    .line 978
    float-to-double v7, v4

    .line 979
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->hypot(DD)D

    .line 980
    .line 981
    .line 982
    move-result-wide v9

    .line 983
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->atan2(DD)D

    .line 984
    .line 985
    .line 986
    move-result-wide v4

    .line 987
    sub-double v4, v4, v22

    .line 988
    .line 989
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 990
    .line 991
    .line 992
    move-result-wide v4

    .line 993
    mul-double/2addr v4, v9

    .line 994
    float-to-double v6, v15

    .line 995
    float-to-double v8, v14

    .line 996
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->hypot(DD)D

    .line 997
    .line 998
    .line 999
    move-result-wide v6

    .line 1000
    div-double/2addr v4, v6

    .line 1001
    double-to-float v4, v4

    .line 1002
    float-to-double v4, v4

    .line 1003
    invoke-static {v4, v5}, Ljava/lang/Math;->toDegrees(D)D

    .line 1004
    .line 1005
    .line 1006
    move-result-wide v4

    .line 1007
    double-to-float v4, v4

    .line 1008
    iput v4, v11, Landroidx/constraintlayout/motion/widget/MotionLayout;->j0:F

    .line 1009
    .line 1010
    goto :goto_13

    .line 1011
    :cond_2a
    iput v6, v11, Landroidx/constraintlayout/motion/widget/MotionLayout;->j0:F

    .line 1012
    .line 1013
    :goto_13
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 1014
    .line 1015
    .line 1016
    move-result v4

    .line 1017
    iput v4, v3, Lmq2;->p:F

    .line 1018
    .line 1019
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 1020
    .line 1021
    .line 1022
    move-result v4

    .line 1023
    iput v4, v3, Lmq2;->q:F

    .line 1024
    .line 1025
    goto/16 :goto_2a

    .line 1026
    .line 1027
    :cond_2b
    const/4 v5, 0x0

    .line 1028
    iput-boolean v5, v3, Lmq2;->m:Z

    .line 1029
    .line 1030
    iget-object v5, v10, Lgr0;->a:Ljava/lang/Object;

    .line 1031
    .line 1032
    check-cast v5, Landroid/view/VelocityTracker;

    .line 1033
    .line 1034
    if-eqz v5, :cond_2c

    .line 1035
    .line 1036
    const/16 v7, 0x10

    .line 1037
    .line 1038
    invoke-virtual {v5, v7}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 1039
    .line 1040
    .line 1041
    :cond_2c
    iget-object v5, v10, Lgr0;->a:Ljava/lang/Object;

    .line 1042
    .line 1043
    check-cast v5, Landroid/view/VelocityTracker;

    .line 1044
    .line 1045
    if-eqz v5, :cond_2d

    .line 1046
    .line 1047
    invoke-virtual {v5}, Landroid/view/VelocityTracker;->getXVelocity()F

    .line 1048
    .line 1049
    .line 1050
    move-result v5

    .line 1051
    move v12, v5

    .line 1052
    goto :goto_14

    .line 1053
    :cond_2d
    const/4 v12, 0x0

    .line 1054
    :goto_14
    iget-object v5, v10, Lgr0;->a:Ljava/lang/Object;

    .line 1055
    .line 1056
    check-cast v5, Landroid/view/VelocityTracker;

    .line 1057
    .line 1058
    if-eqz v5, :cond_2e

    .line 1059
    .line 1060
    invoke-virtual {v5}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 1061
    .line 1062
    .line 1063
    move-result v5

    .line 1064
    move v10, v5

    .line 1065
    :goto_15
    move v5, v6

    .line 1066
    goto :goto_16

    .line 1067
    :cond_2e
    const/4 v10, 0x0

    .line 1068
    goto :goto_15

    .line 1069
    :goto_16
    invoke-virtual {v11}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 1070
    .line 1071
    .line 1072
    move-result v6

    .line 1073
    invoke-virtual {v11}, Landroid/view/View;->getWidth()I

    .line 1074
    .line 1075
    .line 1076
    move-result v7

    .line 1077
    int-to-float v7, v7

    .line 1078
    div-float v7, v7, v25

    .line 1079
    .line 1080
    invoke-virtual {v11}, Landroid/view/View;->getHeight()I

    .line 1081
    .line 1082
    .line 1083
    move-result v13

    .line 1084
    int-to-float v13, v13

    .line 1085
    div-float v13, v13, v25

    .line 1086
    .line 1087
    iget v5, v3, Lmq2;->i:I

    .line 1088
    .line 1089
    const/4 v15, -0x1

    .line 1090
    const/high16 v27, 0x40400000    # 3.0f

    .line 1091
    .line 1092
    if-eq v5, v15, :cond_2f

    .line 1093
    .line 1094
    invoke-virtual {v11, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v5

    .line 1098
    invoke-virtual {v11, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 1099
    .line 1100
    .line 1101
    const/16 v19, 0x0

    .line 1102
    .line 1103
    aget v7, v4, v19

    .line 1104
    .line 1105
    int-to-float v7, v7

    .line 1106
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 1107
    .line 1108
    .line 1109
    move-result v13

    .line 1110
    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    .line 1111
    .line 1112
    .line 1113
    move-result v15

    .line 1114
    add-int/2addr v15, v13

    .line 1115
    int-to-float v13, v15

    .line 1116
    div-float v13, v13, v25

    .line 1117
    .line 1118
    add-float/2addr v7, v13

    .line 1119
    const/16 v18, 0x1

    .line 1120
    .line 1121
    aget v4, v4, v18

    .line 1122
    .line 1123
    int-to-float v4, v4

    .line 1124
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 1125
    .line 1126
    .line 1127
    move-result v13

    .line 1128
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    .line 1129
    .line 1130
    .line 1131
    move-result v5

    .line 1132
    :goto_17
    add-int/2addr v5, v13

    .line 1133
    int-to-float v5, v5

    .line 1134
    div-float v5, v5, v25

    .line 1135
    .line 1136
    add-float v13, v5, v4

    .line 1137
    .line 1138
    goto :goto_18

    .line 1139
    :cond_2f
    iget v5, v3, Lmq2;->d:I

    .line 1140
    .line 1141
    const/4 v15, -0x1

    .line 1142
    if-eq v5, v15, :cond_30

    .line 1143
    .line 1144
    iget-object v7, v11, Landroidx/constraintlayout/motion/widget/MotionLayout;->q0:Ljava/util/HashMap;

    .line 1145
    .line 1146
    invoke-virtual {v11, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v5

    .line 1150
    invoke-virtual {v7, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v5

    .line 1154
    check-cast v5, Lzj1;

    .line 1155
    .line 1156
    iget-object v5, v5, Lzj1;->f:Lik1;

    .line 1157
    .line 1158
    iget v5, v5, Lik1;->V:I

    .line 1159
    .line 1160
    invoke-virtual {v11, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v5

    .line 1164
    invoke-virtual {v11, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 1165
    .line 1166
    .line 1167
    const/16 v19, 0x0

    .line 1168
    .line 1169
    aget v7, v4, v19

    .line 1170
    .line 1171
    int-to-float v7, v7

    .line 1172
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 1173
    .line 1174
    .line 1175
    move-result v13

    .line 1176
    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    .line 1177
    .line 1178
    .line 1179
    move-result v15

    .line 1180
    add-int/2addr v15, v13

    .line 1181
    int-to-float v13, v15

    .line 1182
    div-float v13, v13, v25

    .line 1183
    .line 1184
    add-float/2addr v7, v13

    .line 1185
    const/16 v18, 0x1

    .line 1186
    .line 1187
    aget v4, v4, v18

    .line 1188
    .line 1189
    int-to-float v4, v4

    .line 1190
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 1191
    .line 1192
    .line 1193
    move-result v13

    .line 1194
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    .line 1195
    .line 1196
    .line 1197
    move-result v5

    .line 1198
    goto :goto_17

    .line 1199
    :cond_30
    :goto_18
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 1200
    .line 1201
    .line 1202
    move-result v4

    .line 1203
    sub-float v15, v4, v7

    .line 1204
    .line 1205
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 1206
    .line 1207
    .line 1208
    move-result v4

    .line 1209
    sub-float v13, v4, v13

    .line 1210
    .line 1211
    float-to-double v4, v13

    .line 1212
    move/from16 v19, v6

    .line 1213
    .line 1214
    float-to-double v6, v15

    .line 1215
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->atan2(DD)D

    .line 1216
    .line 1217
    .line 1218
    move-result-wide v4

    .line 1219
    invoke-static {v4, v5}, Ljava/lang/Math;->toDegrees(D)D

    .line 1220
    .line 1221
    .line 1222
    move-result-wide v20

    .line 1223
    iget v5, v3, Lmq2;->d:I

    .line 1224
    .line 1225
    const/4 v7, -0x1

    .line 1226
    if-eq v5, v7, :cond_31

    .line 1227
    .line 1228
    iget-object v4, v3, Lmq2;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 1229
    .line 1230
    iget v7, v3, Lmq2;->h:F

    .line 1231
    .line 1232
    move-object v6, v8

    .line 1233
    iget v8, v3, Lmq2;->g:F

    .line 1234
    .line 1235
    move-object/from16 v28, v6

    .line 1236
    .line 1237
    move/from16 v25, v12

    .line 1238
    .line 1239
    move/from16 v6, v19

    .line 1240
    .line 1241
    const/4 v12, 0x6

    .line 1242
    invoke-virtual/range {v4 .. v9}, Landroidx/constraintlayout/motion/widget/MotionLayout;->p(IFFF[F)V

    .line 1243
    .line 1244
    .line 1245
    const/16 v18, 0x1

    .line 1246
    .line 1247
    aget v4, v9, v18

    .line 1248
    .line 1249
    float-to-double v4, v4

    .line 1250
    invoke-static {v4, v5}, Ljava/lang/Math;->toDegrees(D)D

    .line 1251
    .line 1252
    .line 1253
    move-result-wide v4

    .line 1254
    double-to-float v4, v4

    .line 1255
    aput v4, v9, v18

    .line 1256
    .line 1257
    goto :goto_19

    .line 1258
    :cond_31
    move-object/from16 v28, v8

    .line 1259
    .line 1260
    move/from16 v25, v12

    .line 1261
    .line 1262
    const/4 v12, 0x6

    .line 1263
    const/16 v18, 0x1

    .line 1264
    .line 1265
    aput v24, v9, v18

    .line 1266
    .line 1267
    :goto_19
    add-float/2addr v10, v13

    .line 1268
    float-to-double v4, v10

    .line 1269
    add-float v6, v25, v15

    .line 1270
    .line 1271
    float-to-double v6, v6

    .line 1272
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->atan2(DD)D

    .line 1273
    .line 1274
    .line 1275
    move-result-wide v4

    .line 1276
    invoke-static {v4, v5}, Ljava/lang/Math;->toDegrees(D)D

    .line 1277
    .line 1278
    .line 1279
    move-result-wide v4

    .line 1280
    sub-double v4, v4, v20

    .line 1281
    .line 1282
    double-to-float v4, v4

    .line 1283
    const/high16 v5, 0x427a0000    # 62.5f

    .line 1284
    .line 1285
    mul-float/2addr v4, v5

    .line 1286
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 1287
    .line 1288
    .line 1289
    move-result v5

    .line 1290
    if-nez v5, :cond_32

    .line 1291
    .line 1292
    mul-float v15, v4, v27

    .line 1293
    .line 1294
    iget v5, v3, Lmq2;->v:F

    .line 1295
    .line 1296
    mul-float/2addr v15, v5

    .line 1297
    const/16 v18, 0x1

    .line 1298
    .line 1299
    aget v5, v9, v18

    .line 1300
    .line 1301
    div-float/2addr v15, v5

    .line 1302
    add-float v6, v15, v19

    .line 1303
    .line 1304
    :goto_1a
    const/16 v16, 0x0

    .line 1305
    .line 1306
    goto :goto_1b

    .line 1307
    :cond_32
    move/from16 v6, v19

    .line 1308
    .line 1309
    goto :goto_1a

    .line 1310
    :goto_1b
    cmpl-float v5, v6, v16

    .line 1311
    .line 1312
    if-eqz v5, :cond_39

    .line 1313
    .line 1314
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1315
    .line 1316
    cmpl-float v5, v6, v26

    .line 1317
    .line 1318
    if-eqz v5, :cond_39

    .line 1319
    .line 1320
    iget v5, v3, Lmq2;->c:I

    .line 1321
    .line 1322
    if-eq v5, v14, :cond_39

    .line 1323
    .line 1324
    iget v7, v3, Lmq2;->v:F

    .line 1325
    .line 1326
    mul-float/2addr v4, v7

    .line 1327
    const/16 v18, 0x1

    .line 1328
    .line 1329
    aget v7, v9, v18

    .line 1330
    .line 1331
    div-float/2addr v4, v7

    .line 1332
    float-to-double v6, v6

    .line 1333
    cmpg-double v6, v6, v22

    .line 1334
    .line 1335
    if-gez v6, :cond_33

    .line 1336
    .line 1337
    const/4 v6, 0x0

    .line 1338
    goto :goto_1c

    .line 1339
    :cond_33
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1340
    .line 1341
    :goto_1c
    if-ne v5, v12, :cond_35

    .line 1342
    .line 1343
    add-float v6, v19, v4

    .line 1344
    .line 1345
    const/16 v16, 0x0

    .line 1346
    .line 1347
    cmpg-float v5, v6, v16

    .line 1348
    .line 1349
    if-gez v5, :cond_34

    .line 1350
    .line 1351
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 1352
    .line 1353
    .line 1354
    move-result v4

    .line 1355
    :cond_34
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1356
    .line 1357
    :cond_35
    iget v5, v3, Lmq2;->c:I

    .line 1358
    .line 1359
    const/4 v7, 0x7

    .line 1360
    if-ne v5, v7, :cond_37

    .line 1361
    .line 1362
    add-float v6, v19, v4

    .line 1363
    .line 1364
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1365
    .line 1366
    cmpl-float v5, v6, v26

    .line 1367
    .line 1368
    if-lez v5, :cond_36

    .line 1369
    .line 1370
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 1371
    .line 1372
    .line 1373
    move-result v4

    .line 1374
    neg-float v4, v4

    .line 1375
    :cond_36
    const/4 v6, 0x0

    .line 1376
    :cond_37
    iget v3, v3, Lmq2;->c:I

    .line 1377
    .line 1378
    mul-float v4, v4, v27

    .line 1379
    .line 1380
    invoke-virtual {v11, v6, v4, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->z(FFI)V

    .line 1381
    .line 1382
    .line 1383
    const/16 v16, 0x0

    .line 1384
    .line 1385
    cmpl-float v3, v16, v19

    .line 1386
    .line 1387
    if-gez v3, :cond_38

    .line 1388
    .line 1389
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1390
    .line 1391
    cmpg-float v3, v26, v19

    .line 1392
    .line 1393
    if-gtz v3, :cond_5d

    .line 1394
    .line 1395
    :cond_38
    move-object/from16 v13, v28

    .line 1396
    .line 1397
    invoke-virtual {v11, v13}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 1398
    .line 1399
    .line 1400
    goto/16 :goto_2a

    .line 1401
    .line 1402
    :cond_39
    move-object/from16 v13, v28

    .line 1403
    .line 1404
    const/16 v16, 0x0

    .line 1405
    .line 1406
    cmpl-float v3, v16, v6

    .line 1407
    .line 1408
    if-gez v3, :cond_3a

    .line 1409
    .line 1410
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1411
    .line 1412
    cmpg-float v3, v26, v6

    .line 1413
    .line 1414
    if-gtz v3, :cond_5d

    .line 1415
    .line 1416
    :cond_3a
    invoke-virtual {v11, v13}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 1417
    .line 1418
    .line 1419
    goto/16 :goto_2a

    .line 1420
    .line 1421
    :cond_3b
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 1422
    .line 1423
    .line 1424
    move-result v4

    .line 1425
    iput v4, v3, Lmq2;->p:F

    .line 1426
    .line 1427
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 1428
    .line 1429
    .line 1430
    move-result v4

    .line 1431
    iput v4, v3, Lmq2;->q:F

    .line 1432
    .line 1433
    const/4 v6, 0x0

    .line 1434
    iput-boolean v6, v3, Lmq2;->m:Z

    .line 1435
    .line 1436
    goto/16 :goto_2a

    .line 1437
    .line 1438
    :cond_3c
    move v12, v6

    .line 1439
    move-object v13, v8

    .line 1440
    const/16 v15, 0x3e8

    .line 1441
    .line 1442
    const/high16 v27, 0x40400000    # 3.0f

    .line 1443
    .line 1444
    iget-object v4, v10, Lgr0;->a:Ljava/lang/Object;

    .line 1445
    .line 1446
    check-cast v4, Landroid/view/VelocityTracker;

    .line 1447
    .line 1448
    if-eqz v4, :cond_3d

    .line 1449
    .line 1450
    invoke-virtual {v4, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 1451
    .line 1452
    .line 1453
    :cond_3d
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    .line 1454
    .line 1455
    .line 1456
    move-result v4

    .line 1457
    if-eqz v4, :cond_5c

    .line 1458
    .line 1459
    const/4 v5, 0x1

    .line 1460
    if-eq v4, v5, :cond_4d

    .line 1461
    .line 1462
    const/4 v5, 0x2

    .line 1463
    if-eq v4, v5, :cond_3e

    .line 1464
    .line 1465
    goto/16 :goto_2a

    .line 1466
    .line 1467
    :cond_3e
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 1468
    .line 1469
    .line 1470
    move-result v4

    .line 1471
    iget v5, v3, Lmq2;->q:F

    .line 1472
    .line 1473
    sub-float v13, v4, v5

    .line 1474
    .line 1475
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 1476
    .line 1477
    .line 1478
    move-result v4

    .line 1479
    iget v5, v3, Lmq2;->p:F

    .line 1480
    .line 1481
    sub-float v14, v4, v5

    .line 1482
    .line 1483
    iget v4, v3, Lmq2;->k:F

    .line 1484
    .line 1485
    mul-float/2addr v4, v14

    .line 1486
    iget v5, v3, Lmq2;->l:F

    .line 1487
    .line 1488
    mul-float/2addr v5, v13

    .line 1489
    add-float/2addr v5, v4

    .line 1490
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 1491
    .line 1492
    .line 1493
    move-result v4

    .line 1494
    iget v5, v3, Lmq2;->x:F

    .line 1495
    .line 1496
    cmpl-float v4, v4, v5

    .line 1497
    .line 1498
    if-gtz v4, :cond_3f

    .line 1499
    .line 1500
    iget-boolean v4, v3, Lmq2;->m:Z

    .line 1501
    .line 1502
    if-eqz v4, :cond_5d

    .line 1503
    .line 1504
    :cond_3f
    invoke-virtual {v11}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 1505
    .line 1506
    .line 1507
    move-result v6

    .line 1508
    iget-boolean v4, v3, Lmq2;->m:Z

    .line 1509
    .line 1510
    if-nez v4, :cond_40

    .line 1511
    .line 1512
    const/4 v5, 0x1

    .line 1513
    iput-boolean v5, v3, Lmq2;->m:Z

    .line 1514
    .line 1515
    invoke-virtual {v11, v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 1516
    .line 1517
    .line 1518
    :cond_40
    iget v5, v3, Lmq2;->d:I

    .line 1519
    .line 1520
    iget-object v4, v3, Lmq2;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 1521
    .line 1522
    const/4 v7, -0x1

    .line 1523
    if-eq v5, v7, :cond_41

    .line 1524
    .line 1525
    iget v7, v3, Lmq2;->h:F

    .line 1526
    .line 1527
    iget v8, v3, Lmq2;->g:F

    .line 1528
    .line 1529
    invoke-virtual/range {v4 .. v9}, Landroidx/constraintlayout/motion/widget/MotionLayout;->p(IFFF[F)V

    .line 1530
    .line 1531
    .line 1532
    const/16 v18, 0x1

    .line 1533
    .line 1534
    const/16 v19, 0x0

    .line 1535
    .line 1536
    goto :goto_1d

    .line 1537
    :cond_41
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 1538
    .line 1539
    .line 1540
    move-result v4

    .line 1541
    invoke-virtual {v11}, Landroid/view/View;->getHeight()I

    .line 1542
    .line 1543
    .line 1544
    move-result v5

    .line 1545
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 1546
    .line 1547
    .line 1548
    move-result v4

    .line 1549
    int-to-float v4, v4

    .line 1550
    iget v5, v3, Lmq2;->l:F

    .line 1551
    .line 1552
    mul-float/2addr v5, v4

    .line 1553
    const/16 v18, 0x1

    .line 1554
    .line 1555
    aput v5, v9, v18

    .line 1556
    .line 1557
    iget v5, v3, Lmq2;->k:F

    .line 1558
    .line 1559
    mul-float/2addr v4, v5

    .line 1560
    const/16 v19, 0x0

    .line 1561
    .line 1562
    aput v4, v9, v19

    .line 1563
    .line 1564
    :goto_1d
    iget v4, v3, Lmq2;->k:F

    .line 1565
    .line 1566
    aget v5, v9, v19

    .line 1567
    .line 1568
    mul-float/2addr v4, v5

    .line 1569
    iget v5, v3, Lmq2;->l:F

    .line 1570
    .line 1571
    aget v7, v9, v18

    .line 1572
    .line 1573
    mul-float/2addr v5, v7

    .line 1574
    add-float/2addr v5, v4

    .line 1575
    iget v4, v3, Lmq2;->v:F

    .line 1576
    .line 1577
    mul-float/2addr v5, v4

    .line 1578
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 1579
    .line 1580
    .line 1581
    move-result v4

    .line 1582
    float-to-double v4, v4

    .line 1583
    cmpg-double v4, v4, v20

    .line 1584
    .line 1585
    const v5, 0x3c23d70a    # 0.01f

    .line 1586
    .line 1587
    .line 1588
    const/16 v19, 0x0

    .line 1589
    .line 1590
    if-gez v4, :cond_42

    .line 1591
    .line 1592
    aput v5, v9, v19

    .line 1593
    .line 1594
    aput v5, v9, v18

    .line 1595
    .line 1596
    :cond_42
    iget v4, v3, Lmq2;->k:F

    .line 1597
    .line 1598
    const/4 v7, 0x0

    .line 1599
    cmpl-float v4, v4, v7

    .line 1600
    .line 1601
    if-eqz v4, :cond_43

    .line 1602
    .line 1603
    aget v4, v9, v19

    .line 1604
    .line 1605
    div-float/2addr v14, v4

    .line 1606
    goto :goto_1e

    .line 1607
    :cond_43
    aget v4, v9, v18

    .line 1608
    .line 1609
    div-float v14, v13, v4

    .line 1610
    .line 1611
    :goto_1e
    add-float/2addr v6, v14

    .line 1612
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1613
    .line 1614
    invoke-static {v6, v4}, Ljava/lang/Math;->min(FF)F

    .line 1615
    .line 1616
    .line 1617
    move-result v6

    .line 1618
    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    .line 1619
    .line 1620
    .line 1621
    move-result v4

    .line 1622
    iget v6, v3, Lmq2;->c:I

    .line 1623
    .line 1624
    if-ne v6, v12, :cond_44

    .line 1625
    .line 1626
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    .line 1627
    .line 1628
    .line 1629
    move-result v4

    .line 1630
    :cond_44
    iget v5, v3, Lmq2;->c:I

    .line 1631
    .line 1632
    const/4 v7, 0x7

    .line 1633
    if-ne v5, v7, :cond_45

    .line 1634
    .line 1635
    const v5, 0x3f7d70a4    # 0.99f

    .line 1636
    .line 1637
    .line 1638
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    .line 1639
    .line 1640
    .line 1641
    move-result v4

    .line 1642
    :cond_45
    invoke-virtual {v11}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 1643
    .line 1644
    .line 1645
    move-result v5

    .line 1646
    cmpl-float v6, v4, v5

    .line 1647
    .line 1648
    if-eqz v6, :cond_4c

    .line 1649
    .line 1650
    const/16 v16, 0x0

    .line 1651
    .line 1652
    cmpl-float v6, v5, v16

    .line 1653
    .line 1654
    if-eqz v6, :cond_46

    .line 1655
    .line 1656
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1657
    .line 1658
    cmpl-float v5, v5, v26

    .line 1659
    .line 1660
    if-nez v5, :cond_47

    .line 1661
    .line 1662
    :cond_46
    invoke-virtual {v11}, Landroidx/constraintlayout/motion/widget/MotionLayout;->l()V

    .line 1663
    .line 1664
    .line 1665
    :cond_47
    invoke-virtual {v11, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 1666
    .line 1667
    .line 1668
    iget-object v4, v10, Lgr0;->a:Ljava/lang/Object;

    .line 1669
    .line 1670
    check-cast v4, Landroid/view/VelocityTracker;

    .line 1671
    .line 1672
    if-eqz v4, :cond_48

    .line 1673
    .line 1674
    invoke-virtual {v4, v15}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 1675
    .line 1676
    .line 1677
    :cond_48
    iget-object v4, v10, Lgr0;->a:Ljava/lang/Object;

    .line 1678
    .line 1679
    check-cast v4, Landroid/view/VelocityTracker;

    .line 1680
    .line 1681
    if-eqz v4, :cond_49

    .line 1682
    .line 1683
    invoke-virtual {v4}, Landroid/view/VelocityTracker;->getXVelocity()F

    .line 1684
    .line 1685
    .line 1686
    move-result v4

    .line 1687
    goto :goto_1f

    .line 1688
    :cond_49
    const/4 v4, 0x0

    .line 1689
    :goto_1f
    iget-object v5, v10, Lgr0;->a:Ljava/lang/Object;

    .line 1690
    .line 1691
    check-cast v5, Landroid/view/VelocityTracker;

    .line 1692
    .line 1693
    if-eqz v5, :cond_4a

    .line 1694
    .line 1695
    invoke-virtual {v5}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 1696
    .line 1697
    .line 1698
    move-result v5

    .line 1699
    goto :goto_20

    .line 1700
    :cond_4a
    const/4 v5, 0x0

    .line 1701
    :goto_20
    iget v6, v3, Lmq2;->k:F

    .line 1702
    .line 1703
    const/4 v7, 0x0

    .line 1704
    cmpl-float v6, v6, v7

    .line 1705
    .line 1706
    if-eqz v6, :cond_4b

    .line 1707
    .line 1708
    const/16 v19, 0x0

    .line 1709
    .line 1710
    aget v5, v9, v19

    .line 1711
    .line 1712
    div-float/2addr v4, v5

    .line 1713
    goto :goto_21

    .line 1714
    :cond_4b
    const/16 v18, 0x1

    .line 1715
    .line 1716
    aget v4, v9, v18

    .line 1717
    .line 1718
    div-float v4, v5, v4

    .line 1719
    .line 1720
    :goto_21
    iput v4, v11, Landroidx/constraintlayout/motion/widget/MotionLayout;->j0:F

    .line 1721
    .line 1722
    goto :goto_22

    .line 1723
    :cond_4c
    const/4 v7, 0x0

    .line 1724
    iput v7, v11, Landroidx/constraintlayout/motion/widget/MotionLayout;->j0:F

    .line 1725
    .line 1726
    :goto_22
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 1727
    .line 1728
    .line 1729
    move-result v4

    .line 1730
    iput v4, v3, Lmq2;->p:F

    .line 1731
    .line 1732
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 1733
    .line 1734
    .line 1735
    move-result v4

    .line 1736
    iput v4, v3, Lmq2;->q:F

    .line 1737
    .line 1738
    goto/16 :goto_2a

    .line 1739
    .line 1740
    :cond_4d
    const/4 v6, 0x0

    .line 1741
    iput-boolean v6, v3, Lmq2;->m:Z

    .line 1742
    .line 1743
    iget-object v4, v10, Lgr0;->a:Ljava/lang/Object;

    .line 1744
    .line 1745
    check-cast v4, Landroid/view/VelocityTracker;

    .line 1746
    .line 1747
    if-eqz v4, :cond_4e

    .line 1748
    .line 1749
    invoke-virtual {v4, v15}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 1750
    .line 1751
    .line 1752
    :cond_4e
    iget-object v4, v10, Lgr0;->a:Ljava/lang/Object;

    .line 1753
    .line 1754
    check-cast v4, Landroid/view/VelocityTracker;

    .line 1755
    .line 1756
    if-eqz v4, :cond_4f

    .line 1757
    .line 1758
    invoke-virtual {v4}, Landroid/view/VelocityTracker;->getXVelocity()F

    .line 1759
    .line 1760
    .line 1761
    move-result v4

    .line 1762
    move v15, v4

    .line 1763
    goto :goto_23

    .line 1764
    :cond_4f
    const/4 v15, 0x0

    .line 1765
    :goto_23
    iget-object v4, v10, Lgr0;->a:Ljava/lang/Object;

    .line 1766
    .line 1767
    check-cast v4, Landroid/view/VelocityTracker;

    .line 1768
    .line 1769
    if-eqz v4, :cond_50

    .line 1770
    .line 1771
    invoke-virtual {v4}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 1772
    .line 1773
    .line 1774
    move-result v4

    .line 1775
    move v10, v4

    .line 1776
    goto :goto_24

    .line 1777
    :cond_50
    const/4 v10, 0x0

    .line 1778
    :goto_24
    invoke-virtual {v11}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getProgress()F

    .line 1779
    .line 1780
    .line 1781
    move-result v6

    .line 1782
    iget v5, v3, Lmq2;->d:I

    .line 1783
    .line 1784
    iget-object v4, v3, Lmq2;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 1785
    .line 1786
    const/4 v7, -0x1

    .line 1787
    if-eq v5, v7, :cond_51

    .line 1788
    .line 1789
    iget v7, v3, Lmq2;->h:F

    .line 1790
    .line 1791
    iget v8, v3, Lmq2;->g:F

    .line 1792
    .line 1793
    invoke-virtual/range {v4 .. v9}, Landroidx/constraintlayout/motion/widget/MotionLayout;->p(IFFF[F)V

    .line 1794
    .line 1795
    .line 1796
    const/16 v18, 0x1

    .line 1797
    .line 1798
    const/16 v19, 0x0

    .line 1799
    .line 1800
    goto :goto_25

    .line 1801
    :cond_51
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 1802
    .line 1803
    .line 1804
    move-result v4

    .line 1805
    invoke-virtual {v11}, Landroid/view/View;->getHeight()I

    .line 1806
    .line 1807
    .line 1808
    move-result v5

    .line 1809
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 1810
    .line 1811
    .line 1812
    move-result v4

    .line 1813
    int-to-float v4, v4

    .line 1814
    iget v5, v3, Lmq2;->l:F

    .line 1815
    .line 1816
    mul-float/2addr v5, v4

    .line 1817
    const/16 v18, 0x1

    .line 1818
    .line 1819
    aput v5, v9, v18

    .line 1820
    .line 1821
    iget v5, v3, Lmq2;->k:F

    .line 1822
    .line 1823
    mul-float/2addr v4, v5

    .line 1824
    const/16 v19, 0x0

    .line 1825
    .line 1826
    aput v4, v9, v19

    .line 1827
    .line 1828
    :goto_25
    iget v4, v3, Lmq2;->k:F

    .line 1829
    .line 1830
    aget v5, v9, v19

    .line 1831
    .line 1832
    aget v7, v9, v18

    .line 1833
    .line 1834
    const/16 v16, 0x0

    .line 1835
    .line 1836
    cmpl-float v4, v4, v16

    .line 1837
    .line 1838
    if-eqz v4, :cond_52

    .line 1839
    .line 1840
    div-float/2addr v15, v5

    .line 1841
    goto :goto_26

    .line 1842
    :cond_52
    div-float v15, v10, v7

    .line 1843
    .line 1844
    :goto_26
    invoke-static {v15}, Ljava/lang/Float;->isNaN(F)Z

    .line 1845
    .line 1846
    .line 1847
    move-result v4

    .line 1848
    if-nez v4, :cond_53

    .line 1849
    .line 1850
    div-float v4, v15, v27

    .line 1851
    .line 1852
    add-float/2addr v4, v6

    .line 1853
    :goto_27
    const/16 v16, 0x0

    .line 1854
    .line 1855
    goto :goto_28

    .line 1856
    :cond_53
    move v4, v6

    .line 1857
    goto :goto_27

    .line 1858
    :goto_28
    cmpl-float v5, v4, v16

    .line 1859
    .line 1860
    if-eqz v5, :cond_5a

    .line 1861
    .line 1862
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1863
    .line 1864
    cmpl-float v5, v4, v26

    .line 1865
    .line 1866
    if-eqz v5, :cond_5a

    .line 1867
    .line 1868
    iget v5, v3, Lmq2;->c:I

    .line 1869
    .line 1870
    if-eq v5, v14, :cond_5a

    .line 1871
    .line 1872
    float-to-double v7, v4

    .line 1873
    cmpg-double v4, v7, v22

    .line 1874
    .line 1875
    if-gez v4, :cond_54

    .line 1876
    .line 1877
    const/4 v4, 0x0

    .line 1878
    goto :goto_29

    .line 1879
    :cond_54
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1880
    .line 1881
    :goto_29
    if-ne v5, v12, :cond_56

    .line 1882
    .line 1883
    add-float v4, v6, v15

    .line 1884
    .line 1885
    const/16 v16, 0x0

    .line 1886
    .line 1887
    cmpg-float v4, v4, v16

    .line 1888
    .line 1889
    if-gez v4, :cond_55

    .line 1890
    .line 1891
    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    .line 1892
    .line 1893
    .line 1894
    move-result v15

    .line 1895
    :cond_55
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1896
    .line 1897
    :cond_56
    iget v5, v3, Lmq2;->c:I

    .line 1898
    .line 1899
    const/4 v7, 0x7

    .line 1900
    if-ne v5, v7, :cond_58

    .line 1901
    .line 1902
    add-float v4, v6, v15

    .line 1903
    .line 1904
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1905
    .line 1906
    cmpl-float v4, v4, v26

    .line 1907
    .line 1908
    if-lez v4, :cond_57

    .line 1909
    .line 1910
    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    .line 1911
    .line 1912
    .line 1913
    move-result v4

    .line 1914
    neg-float v15, v4

    .line 1915
    :cond_57
    const/4 v4, 0x0

    .line 1916
    :cond_58
    iget v3, v3, Lmq2;->c:I

    .line 1917
    .line 1918
    invoke-virtual {v11, v4, v15, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->z(FFI)V

    .line 1919
    .line 1920
    .line 1921
    const/16 v16, 0x0

    .line 1922
    .line 1923
    cmpl-float v3, v16, v6

    .line 1924
    .line 1925
    if-gez v3, :cond_59

    .line 1926
    .line 1927
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1928
    .line 1929
    cmpg-float v3, v26, v6

    .line 1930
    .line 1931
    if-gtz v3, :cond_5d

    .line 1932
    .line 1933
    :cond_59
    invoke-virtual {v11, v13}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 1934
    .line 1935
    .line 1936
    goto :goto_2a

    .line 1937
    :cond_5a
    const/16 v16, 0x0

    .line 1938
    .line 1939
    cmpl-float v3, v16, v4

    .line 1940
    .line 1941
    if-gez v3, :cond_5b

    .line 1942
    .line 1943
    const/high16 v26, 0x3f800000    # 1.0f

    .line 1944
    .line 1945
    cmpg-float v3, v26, v4

    .line 1946
    .line 1947
    if-gtz v3, :cond_5d

    .line 1948
    .line 1949
    :cond_5b
    invoke-virtual {v11, v13}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 1950
    .line 1951
    .line 1952
    goto :goto_2a

    .line 1953
    :cond_5c
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 1954
    .line 1955
    .line 1956
    move-result v4

    .line 1957
    iput v4, v3, Lmq2;->p:F

    .line 1958
    .line 1959
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 1960
    .line 1961
    .line 1962
    move-result v4

    .line 1963
    iput v4, v3, Lmq2;->q:F

    .line 1964
    .line 1965
    const/4 v6, 0x0

    .line 1966
    iput-boolean v6, v3, Lmq2;->m:Z

    .line 1967
    .line 1968
    :cond_5d
    :goto_2a
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 1969
    .line 1970
    .line 1971
    move-result v3

    .line 1972
    iput v3, v2, Llk1;->r:F

    .line 1973
    .line 1974
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 1975
    .line 1976
    .line 1977
    move-result v3

    .line 1978
    iput v3, v2, Llk1;->s:F

    .line 1979
    .line 1980
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    .line 1981
    .line 1982
    .line 1983
    move-result v1

    .line 1984
    const/4 v5, 0x1

    .line 1985
    if-ne v1, v5, :cond_5f

    .line 1986
    .line 1987
    iget-object v1, v2, Llk1;->o:Lgr0;

    .line 1988
    .line 1989
    if-eqz v1, :cond_5f

    .line 1990
    .line 1991
    iget-object v3, v1, Lgr0;->a:Ljava/lang/Object;

    .line 1992
    .line 1993
    check-cast v3, Landroid/view/VelocityTracker;

    .line 1994
    .line 1995
    if-eqz v3, :cond_5e

    .line 1996
    .line 1997
    invoke-virtual {v3}, Landroid/view/VelocityTracker;->recycle()V

    .line 1998
    .line 1999
    .line 2000
    const/4 v3, 0x0

    .line 2001
    iput-object v3, v1, Lgr0;->a:Ljava/lang/Object;

    .line 2002
    .line 2003
    goto :goto_2b

    .line 2004
    :cond_5e
    const/4 v3, 0x0

    .line 2005
    :goto_2b
    iput-object v3, v2, Llk1;->o:Lgr0;

    .line 2006
    .line 2007
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 2008
    .line 2009
    const/4 v7, -0x1

    .line 2010
    if-eq v1, v7, :cond_5f

    .line 2011
    .line 2012
    invoke-virtual {v2, v1, v0}, Llk1;->a(ILandroidx/constraintlayout/motion/widget/MotionLayout;)Z

    .line 2013
    .line 2014
    .line 2015
    :cond_5f
    :goto_2c
    iget-object v0, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 2016
    .line 2017
    iget-object v0, v0, Llk1;->c:Lkk1;

    .line 2018
    .line 2019
    iget v1, v0, Lkk1;->r:I

    .line 2020
    .line 2021
    and-int/lit8 v1, v1, 0x4

    .line 2022
    .line 2023
    if-eqz v1, :cond_60

    .line 2024
    .line 2025
    iget-object v0, v0, Lkk1;->l:Lmq2;

    .line 2026
    .line 2027
    iget-boolean v0, v0, Lmq2;->m:Z

    .line 2028
    .line 2029
    return v0

    .line 2030
    :cond_60
    const/16 v18, 0x1

    .line 2031
    .line 2032
    return v18

    .line 2033
    :cond_61
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2034
    .line 2035
    .line 2036
    move-result v0

    .line 2037
    return v0
.end method

.method public final onViewAdded(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Landroidx/constraintlayout/motion/widget/MotionHelper;

    .line 5
    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    check-cast p1, Landroidx/constraintlayout/motion/widget/MotionHelper;

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->R0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->R0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->R0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    iget-boolean v0, p1, Landroidx/constraintlayout/motion/widget/MotionHelper;->w:Z

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->O0:Ljava/util/ArrayList;

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    new-instance v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->O0:Ljava/util/ArrayList;

    .line 40
    .line 41
    :cond_1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->O0:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-boolean v0, p1, Landroidx/constraintlayout/motion/widget/MotionHelper;->U:Z

    .line 47
    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->P0:Ljava/util/ArrayList;

    .line 51
    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    new-instance v0, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->P0:Ljava/util/ArrayList;

    .line 60
    .line 61
    :cond_3
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->P0:Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :cond_4
    instance-of v0, p1, Landroidx/constraintlayout/helper/widget/MotionEffect;

    .line 67
    .line 68
    if-eqz v0, :cond_6

    .line 69
    .line 70
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Q0:Ljava/util/ArrayList;

    .line 71
    .line 72
    if-nez v0, :cond_5

    .line 73
    .line 74
    new-instance v0, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Q0:Ljava/util/ArrayList;

    .line 80
    .line 81
    :cond_5
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Q0:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    :cond_6
    return-void
.end method

.method public final onViewRemoved(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewRemoved(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->O0:Ljava/util/ArrayList;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->P0:Ljava/util/ArrayList;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public final p(IFFF[F)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->b(I)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q0:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lzj1;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p2, p3, p4, p5}, Lzj1;->d(FFF[F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    if-nez v0, :cond_1

    .line 23
    .line 24
    const-string p0, ""

    .line 25
    .line 26
    invoke-static {p1, p0}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string p2, "WARNING could not find view id "

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const-string p1, "MotionLayout"

    .line 58
    .line 59
    invoke-static {p1, p0}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final q(I)Lkk1;
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 2
    .line 3
    iget-object p0, p0, Llk1;->d:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lkk1;

    .line 20
    .line 21
    iget v1, v0, Lkk1;->a:I

    .line 22
    .line 23
    if-ne v1, p1, :cond_0

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public final r(FFLandroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    instance-of v0, p3, Landroid/view/ViewGroup;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    move-object v0, p3

    .line 7
    check-cast v0, Landroid/view/ViewGroup;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    sub-int/2addr v2, v1

    .line 14
    :goto_0
    if-ltz v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    int-to-float v4, v4

    .line 25
    add-float/2addr v4, p1

    .line 26
    invoke-virtual {p3}, Landroid/view/View;->getScrollX()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    int-to-float v5, v5

    .line 31
    sub-float/2addr v4, v5

    .line 32
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    int-to-float v5, v5

    .line 37
    add-float/2addr v5, p2

    .line 38
    invoke-virtual {p3}, Landroid/view/View;->getScrollY()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    int-to-float v6, v6

    .line 43
    sub-float/2addr v5, v6

    .line 44
    invoke-virtual {p0, v4, v5, v3, p4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->r(FFLandroid/view/View;Landroid/view/MotionEvent;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_0

    .line 49
    .line 50
    move v0, v1

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const/4 v0, 0x0

    .line 56
    :goto_1
    if-nez v0, :cond_5

    .line 57
    .line 58
    invoke-virtual {p3}, Landroid/view/View;->getRight()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    int-to-float v2, v2

    .line 63
    add-float/2addr v2, p1

    .line 64
    invoke-virtual {p3}, Landroid/view/View;->getLeft()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    int-to-float v3, v3

    .line 69
    sub-float/2addr v2, v3

    .line 70
    invoke-virtual {p3}, Landroid/view/View;->getBottom()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    int-to-float v3, v3

    .line 75
    add-float/2addr v3, p2

    .line 76
    invoke-virtual {p3}, Landroid/view/View;->getTop()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    int-to-float v4, v4

    .line 81
    sub-float/2addr v3, v4

    .line 82
    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->o1:Landroid/graphics/RectF;

    .line 83
    .line 84
    invoke-virtual {v4, p1, p2, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p4}, Landroid/view/MotionEvent;->getAction()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_2

    .line 92
    .line 93
    invoke-virtual {p4}, Landroid/view/MotionEvent;->getX()F

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    invoke-virtual {p4}, Landroid/view/MotionEvent;->getY()F

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    invoke-virtual {v4, v2, v3}, Landroid/graphics/RectF;->contains(FF)Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_5

    .line 106
    .line 107
    :cond_2
    neg-float p1, p1

    .line 108
    neg-float p2, p2

    .line 109
    invoke-virtual {p3}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v2}, Landroid/graphics/Matrix;->isIdentity()Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_3

    .line 118
    .line 119
    invoke-virtual {p4, p1, p2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p3, p4}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    neg-float p1, p1

    .line 127
    neg-float p2, p2

    .line 128
    invoke-virtual {p4, p1, p2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_3
    invoke-static {p4}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 133
    .line 134
    .line 135
    move-result-object p4

    .line 136
    invoke-virtual {p4, p1, p2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 137
    .line 138
    .line 139
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q1:Landroid/graphics/Matrix;

    .line 140
    .line 141
    if-nez p1, :cond_4

    .line 142
    .line 143
    new-instance p1, Landroid/graphics/Matrix;

    .line 144
    .line 145
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 146
    .line 147
    .line 148
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q1:Landroid/graphics/Matrix;

    .line 149
    .line 150
    :cond_4
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q1:Landroid/graphics/Matrix;

    .line 151
    .line 152
    invoke-virtual {v2, p1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 153
    .line 154
    .line 155
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q1:Landroid/graphics/Matrix;

    .line 156
    .line 157
    invoke-virtual {p4, p0}, Landroid/view/MotionEvent;->transform(Landroid/graphics/Matrix;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p3, p4}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    invoke-virtual {p4}, Landroid/view/MotionEvent;->recycle()V

    .line 165
    .line 166
    .line 167
    :goto_2
    if-eqz p0, :cond_5

    .line 168
    .line 169
    return v1

    .line 170
    :cond_5
    return v0
.end method

.method public final requestLayout()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->X0:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v0, v1, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    iget-object v0, v0, Llk1;->c:Lkk1;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget v0, v0, Lkk1;->q:I

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const/4 v1, 0x2

    .line 24
    if-ne v0, v1, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x0

    .line 31
    :goto_0
    if-ge v1, v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q0:Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Lzj1;

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    iput-boolean v3, v2, Lzj1;->d:Z

    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    :goto_1
    return-void

    .line 52
    :cond_2
    invoke-super {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final s(Landroid/util/AttributeSet;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sput-boolean v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s1:Z

    .line 6
    .line 7
    const-string v0, "MotionLayout"

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz p1, :cond_9

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    sget-object v4, Landroidx/constraintlayout/widget/R$styleable;->MotionLayout:[I

    .line 18
    .line 19
    invoke-virtual {v3, p1, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x1

    .line 28
    move v5, v2

    .line 29
    move v6, v4

    .line 30
    :goto_0
    if-ge v5, v3, :cond_7

    .line 31
    .line 32
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    sget v8, Landroidx/constraintlayout/widget/R$styleable;->MotionLayout_layoutDescription:I

    .line 37
    .line 38
    if-ne v7, v8, :cond_0

    .line 39
    .line 40
    invoke-virtual {p1, v7, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    new-instance v8, Llk1;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    invoke-direct {v8, v9, p0, v7}, Llk1;-><init>(Landroid/content/Context;Landroidx/constraintlayout/motion/widget/MotionLayout;I)V

    .line 51
    .line 52
    .line 53
    iput-object v8, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_0
    sget v8, Landroidx/constraintlayout/widget/R$styleable;->MotionLayout_currentState:I

    .line 57
    .line 58
    if-ne v7, v8, :cond_1

    .line 59
    .line 60
    invoke-virtual {p1, v7, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    iput v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_1
    sget v8, Landroidx/constraintlayout/widget/R$styleable;->MotionLayout_motionProgress:I

    .line 68
    .line 69
    if-ne v7, v8, :cond_2

    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    iput v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 77
    .line 78
    iput-boolean v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y0:Z

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_2
    sget v8, Landroidx/constraintlayout/widget/R$styleable;->MotionLayout_applyMotionScene:I

    .line 82
    .line 83
    if-ne v7, v8, :cond_3

    .line 84
    .line 85
    invoke-virtual {p1, v7, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    goto :goto_2

    .line 90
    :cond_3
    sget v8, Landroidx/constraintlayout/widget/R$styleable;->MotionLayout_showPaths:I

    .line 91
    .line 92
    if-ne v7, v8, :cond_5

    .line 93
    .line 94
    iget v8, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A0:I

    .line 95
    .line 96
    if-nez v8, :cond_6

    .line 97
    .line 98
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-eqz v7, :cond_4

    .line 103
    .line 104
    const/4 v7, 0x2

    .line 105
    goto :goto_1

    .line 106
    :cond_4
    move v7, v2

    .line 107
    :goto_1
    iput v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A0:I

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    sget v8, Landroidx/constraintlayout/widget/R$styleable;->MotionLayout_motionDebug:I

    .line 111
    .line 112
    if-ne v7, v8, :cond_6

    .line 113
    .line 114
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    iput v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A0:I

    .line 119
    .line 120
    :cond_6
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 124
    .line 125
    .line 126
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 127
    .line 128
    if-nez p1, :cond_8

    .line 129
    .line 130
    const-string p1, "WARNING NO app:layoutDescription tag"

    .line 131
    .line 132
    invoke-static {v0, p1}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    :cond_8
    if-nez v6, :cond_9

    .line 136
    .line 137
    const/4 p1, 0x0

    .line 138
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 139
    .line 140
    :cond_9
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A0:I

    .line 141
    .line 142
    if-eqz p1, :cond_18

    .line 143
    .line 144
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 145
    .line 146
    if-nez p1, :cond_a

    .line 147
    .line 148
    const-string p1, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\""

    .line 149
    .line 150
    invoke-static {v0, p1}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    goto/16 :goto_7

    .line 154
    .line 155
    :cond_a
    invoke-virtual {p1}, Llk1;->h()I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 160
    .line 161
    invoke-virtual {v3}, Llk1;->h()I

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    invoke-virtual {v3, v4}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-static {v4, p1}, Lde3;->u(Landroid/content/Context;I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    move v5, v2

    .line 182
    :goto_3
    const-string v6, "CHECK: "

    .line 183
    .line 184
    if-ge v5, v4, :cond_d

    .line 185
    .line 186
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    invoke-virtual {v7}, Landroid/view/View;->getId()I

    .line 191
    .line 192
    .line 193
    move-result v8

    .line 194
    if-ne v8, v1, :cond_b

    .line 195
    .line 196
    const-string v9, " ALL VIEWS SHOULD HAVE ID\'s "

    .line 197
    .line 198
    invoke-static {v6, p1, v9}, Len;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v10, " does not!"

    .line 214
    .line 215
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v9

    .line 222
    invoke-static {v0, v9}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 223
    .line 224
    .line 225
    :cond_b
    invoke-virtual {v3, v8}, Landroidx/constraintlayout/widget/d;->i(I)Landroidx/constraintlayout/widget/c;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    if-nez v8, :cond_c

    .line 230
    .line 231
    const-string v8, " NO CONSTRAINTS for "

    .line 232
    .line 233
    invoke-static {v6, p1, v8}, Len;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    move-result-object v6

    .line 237
    invoke-static {v7}, Lde3;->v(Landroid/view/View;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    invoke-static {v0, v6}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 249
    .line 250
    .line 251
    :cond_c
    add-int/lit8 v5, v5, 0x1

    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_d
    iget-object v4, v3, Landroidx/constraintlayout/widget/d;->f:Ljava/util/HashMap;

    .line 255
    .line 256
    invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    new-array v5, v2, [Ljava/lang/Integer;

    .line 261
    .line 262
    invoke-interface {v4, v5}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    check-cast v4, [Ljava/lang/Integer;

    .line 267
    .line 268
    array-length v5, v4

    .line 269
    new-array v7, v5, [I

    .line 270
    .line 271
    move v8, v2

    .line 272
    :goto_4
    if-ge v8, v5, :cond_e

    .line 273
    .line 274
    aget-object v9, v4, v8

    .line 275
    .line 276
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 277
    .line 278
    .line 279
    move-result v9

    .line 280
    aput v9, v7, v8

    .line 281
    .line 282
    add-int/lit8 v8, v8, 0x1

    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_e
    :goto_5
    if-ge v2, v5, :cond_12

    .line 286
    .line 287
    aget v4, v7, v2

    .line 288
    .line 289
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 290
    .line 291
    .line 292
    move-result-object v8

    .line 293
    invoke-static {v8, v4}, Lde3;->u(Landroid/content/Context;I)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    aget v9, v7, v2

    .line 298
    .line 299
    invoke-virtual {p0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 300
    .line 301
    .line 302
    move-result-object v9

    .line 303
    if-nez v9, :cond_f

    .line 304
    .line 305
    new-instance v9, Ljava/lang/StringBuilder;

    .line 306
    .line 307
    invoke-direct {v9, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    const-string v10, " NO View matches id "

    .line 314
    .line 315
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v9

    .line 325
    invoke-static {v0, v9}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 326
    .line 327
    .line 328
    :cond_f
    invoke-virtual {v3, v4}, Landroidx/constraintlayout/widget/d;->h(I)Landroidx/constraintlayout/widget/c;

    .line 329
    .line 330
    .line 331
    move-result-object v9

    .line 332
    iget-object v9, v9, Landroidx/constraintlayout/widget/c;->e:Luz;

    .line 333
    .line 334
    iget v9, v9, Luz;->d:I

    .line 335
    .line 336
    const-string v10, ") no LAYOUT_HEIGHT"

    .line 337
    .line 338
    const-string v11, "("

    .line 339
    .line 340
    if-ne v9, v1, :cond_10

    .line 341
    .line 342
    invoke-static {v6, p1, v11, v8, v10}, Lfm0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v9

    .line 346
    invoke-static {v0, v9}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 347
    .line 348
    .line 349
    :cond_10
    invoke-virtual {v3, v4}, Landroidx/constraintlayout/widget/d;->h(I)Landroidx/constraintlayout/widget/c;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    iget-object v4, v4, Landroidx/constraintlayout/widget/c;->e:Luz;

    .line 354
    .line 355
    iget v4, v4, Luz;->c:I

    .line 356
    .line 357
    if-ne v4, v1, :cond_11

    .line 358
    .line 359
    invoke-static {v6, p1, v11, v8, v10}, Lfm0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    invoke-static {v0, v4}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 364
    .line 365
    .line 366
    :cond_11
    add-int/lit8 v2, v2, 0x1

    .line 367
    .line 368
    goto :goto_5

    .line 369
    :cond_12
    new-instance p1, Landroid/util/SparseIntArray;

    .line 370
    .line 371
    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    .line 372
    .line 373
    .line 374
    new-instance v2, Landroid/util/SparseIntArray;

    .line 375
    .line 376
    invoke-direct {v2}, Landroid/util/SparseIntArray;-><init>()V

    .line 377
    .line 378
    .line 379
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 380
    .line 381
    iget-object v3, v3, Llk1;->d:Ljava/util/ArrayList;

    .line 382
    .line 383
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    :cond_13
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 388
    .line 389
    .line 390
    move-result v4

    .line 391
    if-eqz v4, :cond_18

    .line 392
    .line 393
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    check-cast v4, Lkk1;

    .line 398
    .line 399
    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 400
    .line 401
    iget-object v5, v5, Llk1;->c:Lkk1;

    .line 402
    .line 403
    iget v5, v4, Lkk1;->d:I

    .line 404
    .line 405
    iget v6, v4, Lkk1;->c:I

    .line 406
    .line 407
    if-ne v5, v6, :cond_14

    .line 408
    .line 409
    const-string v5, "CHECK: start and end constraint set should not be the same!"

    .line 410
    .line 411
    invoke-static {v0, v5}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 412
    .line 413
    .line 414
    :cond_14
    iget v5, v4, Lkk1;->d:I

    .line 415
    .line 416
    iget v4, v4, Lkk1;->c:I

    .line 417
    .line 418
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 419
    .line 420
    .line 421
    move-result-object v6

    .line 422
    invoke-static {v6, v5}, Lde3;->u(Landroid/content/Context;I)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v6

    .line 426
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 427
    .line 428
    .line 429
    move-result-object v7

    .line 430
    invoke-static {v7, v4}, Lde3;->u(Landroid/content/Context;I)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v7

    .line 434
    invoke-virtual {p1, v5}, Landroid/util/SparseIntArray;->get(I)I

    .line 435
    .line 436
    .line 437
    move-result v8

    .line 438
    const-string v9, "->"

    .line 439
    .line 440
    if-ne v8, v4, :cond_15

    .line 441
    .line 442
    new-instance v8, Ljava/lang/StringBuilder;

    .line 443
    .line 444
    const-string v10, "CHECK: two transitions with the same start and end "

    .line 445
    .line 446
    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v8

    .line 462
    invoke-static {v0, v8}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 463
    .line 464
    .line 465
    :cond_15
    invoke-virtual {v2, v4}, Landroid/util/SparseIntArray;->get(I)I

    .line 466
    .line 467
    .line 468
    move-result v8

    .line 469
    if-ne v8, v5, :cond_16

    .line 470
    .line 471
    new-instance v8, Ljava/lang/StringBuilder;

    .line 472
    .line 473
    const-string v10, "CHECK: you can\'t have reverse transitions"

    .line 474
    .line 475
    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v7

    .line 491
    invoke-static {v0, v7}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 492
    .line 493
    .line 494
    :cond_16
    invoke-virtual {p1, v5, v4}, Landroid/util/SparseIntArray;->put(II)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2, v4, v5}, Landroid/util/SparseIntArray;->put(II)V

    .line 498
    .line 499
    .line 500
    iget-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 501
    .line 502
    invoke-virtual {v7, v5}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 503
    .line 504
    .line 505
    move-result-object v5

    .line 506
    if-nez v5, :cond_17

    .line 507
    .line 508
    new-instance v5, Ljava/lang/StringBuilder;

    .line 509
    .line 510
    const-string v7, " no such constraintSetStart "

    .line 511
    .line 512
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v5

    .line 522
    invoke-static {v0, v5}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 523
    .line 524
    .line 525
    :cond_17
    iget-object v5, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 526
    .line 527
    invoke-virtual {v5, v4}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 528
    .line 529
    .line 530
    move-result-object v4

    .line 531
    if-nez v4, :cond_13

    .line 532
    .line 533
    new-instance v4, Ljava/lang/StringBuilder;

    .line 534
    .line 535
    const-string v5, " no such constraintSetEnd "

    .line 536
    .line 537
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v4

    .line 547
    invoke-static {v0, v4}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 548
    .line 549
    .line 550
    goto/16 :goto_6

    .line 551
    .line 552
    :cond_18
    :goto_7
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 553
    .line 554
    if-ne p1, v1, :cond_1a

    .line 555
    .line 556
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 557
    .line 558
    if-eqz p1, :cond_1a

    .line 559
    .line 560
    invoke-virtual {p1}, Llk1;->h()I

    .line 561
    .line 562
    .line 563
    move-result p1

    .line 564
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 565
    .line 566
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 567
    .line 568
    invoke-virtual {p1}, Llk1;->h()I

    .line 569
    .line 570
    .line 571
    move-result p1

    .line 572
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 573
    .line 574
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 575
    .line 576
    iget-object p1, p1, Llk1;->c:Lkk1;

    .line 577
    .line 578
    if-nez p1, :cond_19

    .line 579
    .line 580
    goto :goto_8

    .line 581
    :cond_19
    iget v1, p1, Lkk1;->c:I

    .line 582
    .line 583
    :goto_8
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 584
    .line 585
    :cond_1a
    return-void
.end method

.method public setDebugMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A0:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setDelayedApplicationOfInitialState(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k1:Z

    .line 2
    .line 3
    return-void
.end method

.method public setInteractionEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->p0:Z

    .line 2
    .line 3
    return-void
.end method

.method public setInterpolatedProgress(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lhk1;->c:Lhk1;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 11
    .line 12
    invoke-virtual {v0}, Llk1;->e()Landroid/view/animation/Interpolator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {v0, p1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public setOnHide(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->P0:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, v0, :cond_0

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->P0:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Landroidx/constraintlayout/motion/widget/MotionHelper;

    .line 19
    .line 20
    invoke-virtual {v2, p1}, Landroidx/constraintlayout/motion/widget/MotionHelper;->setProgress(F)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public setOnShow(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->O0:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, v0, :cond_0

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->O0:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Landroidx/constraintlayout/motion/widget/MotionHelper;

    .line 19
    .line 20
    invoke-virtual {v2, p1}, Landroidx/constraintlayout/motion/widget/MotionHelper;->setProgress(F)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public setProgress(F)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    const/high16 v2, 0x3f800000    # 1.0f

    .line 5
    .line 6
    if-ltz v1, :cond_0

    .line 7
    .line 8
    cmpl-float v3, p1, v2

    .line 9
    .line 10
    if-lez v3, :cond_1

    .line 11
    .line 12
    :cond_0
    const-string v3, "MotionLayout"

    .line 13
    .line 14
    const-string v4, "Warning! Progress is defined for values between 0.0 and 1.0 inclusive"

    .line 15
    .line 16
    invoke-static {v3, v4}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-super {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_3

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    new-instance v0, Lfk1;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Lfk1;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 35
    .line 36
    :cond_2
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 37
    .line 38
    iput p1, p0, Lfk1;->a:F

    .line 39
    .line 40
    return-void

    .line 41
    :cond_3
    sget-object v3, Lhk1;->d:Lhk1;

    .line 42
    .line 43
    sget-object v4, Lhk1;->c:Lhk1;

    .line 44
    .line 45
    if-gtz v1, :cond_5

    .line 46
    .line 47
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 48
    .line 49
    cmpl-float v1, v1, v2

    .line 50
    .line 51
    if-nez v1, :cond_4

    .line 52
    .line 53
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 54
    .line 55
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 56
    .line 57
    if-ne v1, v2, :cond_4

    .line 58
    .line 59
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 60
    .line 61
    .line 62
    :cond_4
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 63
    .line 64
    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 65
    .line 66
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 67
    .line 68
    cmpl-float v0, v1, v0

    .line 69
    .line 70
    if-nez v0, :cond_8

    .line 71
    .line 72
    invoke-virtual {p0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    cmpl-float v1, p1, v2

    .line 77
    .line 78
    if-ltz v1, :cond_7

    .line 79
    .line 80
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 81
    .line 82
    cmpl-float v0, v1, v0

    .line 83
    .line 84
    if-nez v0, :cond_6

    .line 85
    .line 86
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 87
    .line 88
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 89
    .line 90
    if-ne v0, v1, :cond_6

    .line 91
    .line 92
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 93
    .line 94
    .line 95
    :cond_6
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 96
    .line 97
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 98
    .line 99
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 100
    .line 101
    cmpl-float v0, v0, v2

    .line 102
    .line 103
    if-nez v0, :cond_8

    .line 104
    .line 105
    invoke-virtual {p0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_7
    const/4 v0, -0x1

    .line 110
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 111
    .line 112
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 113
    .line 114
    .line 115
    :cond_8
    :goto_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 116
    .line 117
    if-nez v0, :cond_9

    .line 118
    .line 119
    return-void

    .line 120
    :cond_9
    const/4 v0, 0x1

    .line 121
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->x0:Z

    .line 122
    .line 123
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 124
    .line 125
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t0:F

    .line 126
    .line 127
    const-wide/16 v1, -0x1

    .line 128
    .line 129
    iput-wide v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v0:J

    .line 130
    .line 131
    iput-wide v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r0:J

    .line 132
    .line 133
    const/4 p1, 0x0

    .line 134
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h0:Lak1;

    .line 135
    .line 136
    iput-boolean v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y0:Z

    .line 137
    .line 138
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public setScene(Llk1;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput-boolean v0, p1, Llk1;->p:Z

    .line 8
    .line 9
    iget-object p1, p1, Llk1;->c:Lkk1;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Lkk1;->l:Lmq2;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lmq2;->c(Z)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->v()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setStartState(I)V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lfk1;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lfk1;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 19
    .line 20
    iput p1, p0, Lfk1;->c:I

    .line 21
    .line 22
    iput p1, p0, Lfk1;->d:I

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 26
    .line 27
    return-void
.end method

.method public setState(Lhk1;)V
    .locals 4

    .line 1
    sget-object v0, Lhk1;->d:Lhk1;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Lhk1;

    .line 12
    .line 13
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Lhk1;

    .line 14
    .line 15
    sget-object v2, Lhk1;->c:Lhk1;

    .line 16
    .line 17
    if-ne v1, v2, :cond_1

    .line 18
    .line 19
    if-ne p1, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->n()V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    if-eq v1, v3, :cond_3

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    if-eq v1, v2, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    if-ne p1, v0, :cond_5

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->o()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_3
    if-ne p1, v2, :cond_4

    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->n()V

    .line 46
    .line 47
    .line 48
    :cond_4
    if-ne p1, v0, :cond_5

    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->o()V

    .line 51
    .line 52
    .line 53
    :cond_5
    :goto_0
    return-void
.end method

.method public setTransition(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->q(I)Lkk1;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget v0, p1, Lkk1;->d:I

    .line 10
    .line 11
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 12
    .line 13
    iget v0, p1, Lkk1;->c:I

    .line 14
    .line 15
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 16
    .line 17
    invoke-super {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    new-instance p1, Lfk1;

    .line 28
    .line 29
    invoke-direct {p1, p0}, Lfk1;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 33
    .line 34
    :cond_0
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 35
    .line 36
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 37
    .line 38
    iput v0, p1, Lfk1;->c:I

    .line 39
    .line 40
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 41
    .line 42
    iput p0, p1, Lfk1;->d:I

    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 46
    .line 47
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 48
    .line 49
    const/high16 v2, 0x3f800000    # 1.0f

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    if-ne v0, v1, :cond_2

    .line 53
    .line 54
    move v0, v3

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 57
    .line 58
    if-ne v0, v1, :cond_3

    .line 59
    .line 60
    move v0, v2

    .line 61
    goto :goto_0

    .line 62
    :cond_3
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 63
    .line 64
    :goto_0
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 65
    .line 66
    iput-object p1, v1, Llk1;->c:Lkk1;

    .line 67
    .line 68
    iget-object p1, p1, Lkk1;->l:Lmq2;

    .line 69
    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    iget-boolean v1, v1, Llk1;->p:Z

    .line 73
    .line 74
    invoke-virtual {p1, v1}, Lmq2;->c(Z)V

    .line 75
    .line 76
    .line 77
    :cond_4
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 78
    .line 79
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 80
    .line 81
    invoke-virtual {p1, v1}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 86
    .line 87
    iget v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 88
    .line 89
    invoke-virtual {v1, v4}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iget-object v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:Lek1;

    .line 94
    .line 95
    invoke-virtual {v4, p1, v1}, Lek1;->e(Landroidx/constraintlayout/widget/d;Landroidx/constraintlayout/widget/d;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->v()V

    .line 99
    .line 100
    .line 101
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 102
    .line 103
    cmpl-float p1, p1, v0

    .line 104
    .line 105
    if-eqz p1, :cond_6

    .line 106
    .line 107
    cmpl-float p1, v0, v3

    .line 108
    .line 109
    if-nez p1, :cond_5

    .line 110
    .line 111
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->l()V

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 115
    .line 116
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 117
    .line 118
    invoke-virtual {p1, v1}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p1, p0}, Landroidx/constraintlayout/widget/d;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_5
    cmpl-float p1, v0, v2

    .line 127
    .line 128
    if-nez p1, :cond_6

    .line 129
    .line 130
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->l()V

    .line 131
    .line 132
    .line 133
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 134
    .line 135
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 136
    .line 137
    invoke-virtual {p1, v1}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p1, p0}, Landroidx/constraintlayout/widget/d;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 142
    .line 143
    .line 144
    :cond_6
    :goto_1
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-eqz p1, :cond_7

    .line 149
    .line 150
    move p1, v3

    .line 151
    goto :goto_2

    .line 152
    :cond_7
    move p1, v0

    .line 153
    :goto_2
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 154
    .line 155
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-eqz p1, :cond_8

    .line 160
    .line 161
    invoke-static {}, Lde3;->t()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->k(F)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_8
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 169
    .line 170
    .line 171
    :cond_9
    return-void
.end method

.method public setTransition(Lkk1;)V
    .locals 3

    .line 172
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 173
    iput-object p1, v0, Llk1;->c:Lkk1;

    if-eqz p1, :cond_0

    .line 174
    iget-object v1, p1, Lkk1;->l:Lmq2;

    if-eqz v1, :cond_0

    .line 175
    iget-boolean v0, v0, Llk1;->p:Z

    invoke-virtual {v1, v0}, Lmq2;->c(Z)V

    .line 176
    :cond_0
    sget-object v0, Lhk1;->b:Lhk1;

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 177
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 178
    iget-object v1, v1, Llk1;->c:Lkk1;

    const/4 v2, -0x1

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_0

    .line 179
    :cond_1
    iget v1, v1, Lkk1;->c:I

    :goto_0
    if-ne v0, v1, :cond_2

    const/high16 v0, 0x3f800000    # 1.0f

    .line 180
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 181
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t0:F

    .line 182
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 183
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 184
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->t0:F

    .line 185
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 186
    :goto_1
    iget p1, p1, Lkk1;->r:I

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_3

    const-wide/16 v0, -0x1

    goto :goto_2

    .line 187
    :cond_3
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    move-result-wide v0

    :goto_2
    iput-wide v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v0:J

    .line 188
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    invoke-virtual {p1}, Llk1;->h()I

    move-result p1

    .line 189
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 190
    iget-object v1, v0, Llk1;->c:Lkk1;

    if-nez v1, :cond_4

    goto :goto_3

    .line 191
    :cond_4
    iget v2, v1, Lkk1;->c:I

    .line 192
    :goto_3
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    if-ne p1, v1, :cond_5

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    if-ne v2, v1, :cond_5

    return-void

    .line 193
    :cond_5
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 194
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 195
    invoke-virtual {v0, p1, v2}, Llk1;->n(II)V

    .line 196
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    invoke-virtual {p1, v0}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    move-result-object p1

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    invoke-virtual {v0, v1}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    move-result-object v0

    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:Lek1;

    invoke-virtual {v1, p1, v0}, Lek1;->e(Landroidx/constraintlayout/widget/d;Landroidx/constraintlayout/widget/d;)V

    .line 197
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 198
    iput p1, v1, Lek1;->e:I

    .line 199
    iput v0, v1, Lek1;->f:I

    .line 200
    invoke-virtual {v1}, Lek1;->f()V

    .line 201
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->v()V

    return-void
.end method

.method public setTransitionDuration(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string p0, "MotionLayout"

    .line 6
    .line 7
    const-string p1, "MotionScene not defined"

    .line 8
    .line 9
    invoke-static {p0, p1}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Llk1;->c:Lkk1;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/16 p0, 0x8

    .line 18
    .line 19
    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    iput p0, v0, Lkk1;->h:I

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iput p1, p0, Llk1;->j:I

    .line 27
    .line 28
    return-void
.end method

.method public setTransitionListener(Lgk1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z0:Lgk1;

    .line 2
    .line 3
    return-void
.end method

.method public setTransitionState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lfk1;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lfk1;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-string v1, "motion.progress"

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iput v1, v0, Lfk1;->a:F

    .line 24
    .line 25
    const-string v1, "motion.velocity"

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iput v1, v0, Lfk1;->b:F

    .line 32
    .line 33
    const-string v1, "motion.StartState"

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iput v1, v0, Lfk1;->c:I

    .line 40
    .line 41
    const-string v1, "motion.EndState"

    .line 42
    .line 43
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iput p1, v0, Lfk1;->d:I

    .line 48
    .line 49
    invoke-super {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 56
    .line 57
    invoke-virtual {p0}, Lfk1;->a()V

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void
.end method

.method public final t()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_5

    .line 6
    .line 7
    :cond_0
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 8
    .line 9
    invoke-virtual {v0, v1, p0}, Llk1;->a(ILandroidx/constraintlayout/motion/widget/MotionLayout;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->requestLayout()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 20
    .line 21
    const/4 v1, -0x1

    .line 22
    if-eq v0, v1, :cond_9

    .line 23
    .line 24
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 25
    .line 26
    iget-object v3, v2, Llk1;->f:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v2, v2, Llk1;->d:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_3

    .line 39
    .line 40
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, Lkk1;

    .line 45
    .line 46
    iget-object v6, v5, Lkk1;->m:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-lez v6, :cond_2

    .line 53
    .line 54
    iget-object v5, v5, Lkk1;->m:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    check-cast v6, Ljk1;

    .line 71
    .line 72
    invoke-virtual {v6, p0}, Ljk1;->b(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_5

    .line 85
    .line 86
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    check-cast v5, Lkk1;

    .line 91
    .line 92
    iget-object v6, v5, Lkk1;->m:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-lez v6, :cond_4

    .line 99
    .line 100
    iget-object v5, v5, Lkk1;->m:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-eqz v6, :cond_4

    .line 111
    .line 112
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    check-cast v6, Ljk1;

    .line 117
    .line 118
    invoke-virtual {v6, p0}, Ljk1;->b(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_7

    .line 131
    .line 132
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    check-cast v4, Lkk1;

    .line 137
    .line 138
    iget-object v5, v4, Lkk1;->m:Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-lez v5, :cond_6

    .line 145
    .line 146
    iget-object v5, v4, Lkk1;->m:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    if-eqz v6, :cond_6

    .line 157
    .line 158
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    check-cast v6, Ljk1;

    .line 163
    .line 164
    invoke-virtual {v6, p0, v0, v4}, Ljk1;->a(Landroidx/constraintlayout/motion/widget/MotionLayout;ILkk1;)V

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-eqz v3, :cond_9

    .line 177
    .line 178
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, Lkk1;

    .line 183
    .line 184
    iget-object v4, v3, Lkk1;->m:Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-lez v4, :cond_8

    .line 191
    .line 192
    iget-object v4, v3, Lkk1;->m:Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    if-eqz v5, :cond_8

    .line 203
    .line 204
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    check-cast v5, Ljk1;

    .line 209
    .line 210
    invoke-virtual {v5, p0, v0, v3}, Ljk1;->a(Landroidx/constraintlayout/motion/widget/MotionLayout;ILkk1;)V

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_9
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 215
    .line 216
    invoke-virtual {v0}, Llk1;->o()Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_c

    .line 221
    .line 222
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 223
    .line 224
    iget-object p0, p0, Llk1;->c:Lkk1;

    .line 225
    .line 226
    if-eqz p0, :cond_c

    .line 227
    .line 228
    iget-object p0, p0, Lkk1;->l:Lmq2;

    .line 229
    .line 230
    if-eqz p0, :cond_c

    .line 231
    .line 232
    iget-object v0, p0, Lmq2;->r:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 233
    .line 234
    iget v2, p0, Lmq2;->d:I

    .line 235
    .line 236
    if-eq v2, v1, :cond_a

    .line 237
    .line 238
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    if-nez v1, :cond_b

    .line 243
    .line 244
    new-instance v2, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    const-string v3, "cannot find TouchAnchorId @id/"

    .line 247
    .line 248
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    iget p0, p0, Lmq2;->d:I

    .line 256
    .line 257
    invoke-static {v0, p0}, Lde3;->u(Landroid/content/Context;I)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    const-string v0, "TouchResponse"

    .line 269
    .line 270
    invoke-static {v0, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 271
    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_a
    const/4 v1, 0x0

    .line 275
    :cond_b
    :goto_4
    instance-of p0, v1, Landroidx/core/widget/NestedScrollView;

    .line 276
    .line 277
    if-eqz p0, :cond_c

    .line 278
    .line 279
    check-cast v1, Landroidx/core/widget/NestedScrollView;

    .line 280
    .line 281
    new-instance p0, Lri;

    .line 282
    .line 283
    const/4 v0, 0x1

    .line 284
    invoke-direct {p0, v0}, Lri;-><init>(I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 288
    .line 289
    .line 290
    new-instance p0, Lq62;

    .line 291
    .line 292
    const/4 v0, 0x5

    .line 293
    invoke-direct {p0, v0}, Lq62;-><init>(I)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1, p0}, Landroidx/core/widget/NestedScrollView;->setOnScrollChangeListener(Lmm1;)V

    .line 297
    .line 298
    .line 299
    :cond_c
    :goto_5
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 11
    .line 12
    invoke-static {v0, v2}, Lde3;->u(Landroid/content/Context;I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v2, "->"

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 25
    .line 26
    invoke-static {v0, v2}, Lde3;->u(Landroid/content/Context;I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, " (pos:"

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, " Dpos/Dt:"

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j0:F

    .line 49
    .line 50
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method

.method public final u()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z0:Lgk1;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->R0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    :cond_0
    return-void

    .line 16
    :cond_1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r1:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_4

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/Integer;

    .line 33
    .line 34
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->z0:Lgk1;

    .line 35
    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-interface {v3, v4}, Lgk1;->a(I)V

    .line 43
    .line 44
    .line 45
    :cond_3
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->R0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 46
    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_2

    .line 58
    .line 59
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Lgk1;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    invoke-interface {v4, v5}, Lgk1;->a(I)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final v()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:Lek1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lek1;->f()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final w(FF)V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lfk1;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lfk1;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 19
    .line 20
    iput p1, p0, Lfk1;->a:F

    .line 21
    .line 22
    iput p2, p0, Lfk1;->b:F

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lhk1;->c:Lhk1;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 31
    .line 32
    .line 33
    iput p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j0:F

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    cmpl-float p2, p2, v0

    .line 37
    .line 38
    const/high16 v1, 0x3f800000    # 1.0f

    .line 39
    .line 40
    if-eqz p2, :cond_3

    .line 41
    .line 42
    if-lez p2, :cond_2

    .line 43
    .line 44
    move v0, v1

    .line 45
    :cond_2
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->k(F)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    cmpl-float p2, p1, v0

    .line 50
    .line 51
    if-eqz p2, :cond_5

    .line 52
    .line 53
    cmpl-float p2, p1, v1

    .line 54
    .line 55
    if-eqz p2, :cond_5

    .line 56
    .line 57
    const/high16 p2, 0x3f000000    # 0.5f

    .line 58
    .line 59
    cmpl-float p1, p1, p2

    .line 60
    .line 61
    if-lez p1, :cond_4

    .line 62
    .line 63
    move v0, v1

    .line 64
    :cond_4
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->k(F)V

    .line 65
    .line 66
    .line 67
    :cond_5
    return-void
.end method

.method public final x(I)V
    .locals 6

    .line 1
    sget-object v0, Lhk1;->b:Lhk1;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Lhk1;)V

    .line 4
    .line 5
    .line 6
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 10
    .line 11
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->V:Lsz;

    .line 14
    .line 15
    if-eqz v1, :cond_e

    .line 16
    .line 17
    iget-object p0, v1, Lsz;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 20
    .line 21
    iget-object v2, v1, Lsz;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Landroid/util/SparseArray;

    .line 24
    .line 25
    iget v3, v1, Lsz;->a:I

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    const/high16 v5, -0x40800000    # -1.0f

    .line 29
    .line 30
    if-ne v3, p1, :cond_8

    .line 31
    .line 32
    if-ne p1, v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lqz;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Lqz;

    .line 46
    .line 47
    :goto_0
    iget v2, v1, Lsz;->b:I

    .line 48
    .line 49
    if-eq v2, v0, :cond_1

    .line 50
    .line 51
    iget-object v3, p1, Lqz;->b:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Lrz;

    .line 58
    .line 59
    invoke-virtual {v2, v5, v5}, Lrz;->a(FF)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    goto/16 :goto_9

    .line 66
    .line 67
    :cond_1
    iget-object v2, p1, Lqz;->b:Ljava/util/ArrayList;

    .line 68
    .line 69
    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-ge v4, v3, :cond_3

    .line 74
    .line 75
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Lrz;

    .line 80
    .line 81
    invoke-virtual {v3, v5, v5}, Lrz;->a(FF)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_2

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    move v4, v0

    .line 92
    :goto_2
    iget-object p1, p1, Lqz;->b:Ljava/util/ArrayList;

    .line 93
    .line 94
    iget v2, v1, Lsz;->b:I

    .line 95
    .line 96
    if-ne v2, v4, :cond_4

    .line 97
    .line 98
    goto/16 :goto_9

    .line 99
    .line 100
    :cond_4
    if-ne v4, v0, :cond_5

    .line 101
    .line 102
    const/4 v2, 0x0

    .line 103
    goto :goto_3

    .line 104
    :cond_5
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Lrz;

    .line 109
    .line 110
    iget-object v2, v2, Lrz;->f:Landroidx/constraintlayout/widget/d;

    .line 111
    .line 112
    :goto_3
    if-ne v4, v0, :cond_6

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_6
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, Lrz;

    .line 120
    .line 121
    iget p1, p1, Lrz;->e:I

    .line 122
    .line 123
    :goto_4
    if-nez v2, :cond_7

    .line 124
    .line 125
    goto :goto_9

    .line 126
    :cond_7
    iput v4, v1, Lsz;->b:I

    .line 127
    .line 128
    invoke-virtual {v2, p0}, Landroidx/constraintlayout/widget/d;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_8
    iput p1, v1, Lsz;->a:I

    .line 133
    .line 134
    invoke-virtual {v2, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    check-cast p1, Lqz;

    .line 139
    .line 140
    iget-object v2, p1, Lqz;->b:Ljava/util/ArrayList;

    .line 141
    .line 142
    :goto_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-ge v4, v3, :cond_a

    .line 147
    .line 148
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    check-cast v3, Lrz;

    .line 153
    .line 154
    invoke-virtual {v3, v5, v5}, Lrz;->a(FF)Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-eqz v3, :cond_9

    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_a
    move v4, v0

    .line 165
    :goto_6
    iget-object v2, p1, Lqz;->b:Ljava/util/ArrayList;

    .line 166
    .line 167
    if-ne v4, v0, :cond_b

    .line 168
    .line 169
    iget-object p1, p1, Lqz;->d:Landroidx/constraintlayout/widget/d;

    .line 170
    .line 171
    goto :goto_7

    .line 172
    :cond_b
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    check-cast p1, Lrz;

    .line 177
    .line 178
    iget-object p1, p1, Lrz;->f:Landroidx/constraintlayout/widget/d;

    .line 179
    .line 180
    :goto_7
    if-ne v4, v0, :cond_c

    .line 181
    .line 182
    goto :goto_8

    .line 183
    :cond_c
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    check-cast v0, Lrz;

    .line 188
    .line 189
    iget v0, v0, Lrz;->e:I

    .line 190
    .line 191
    :goto_8
    if-nez p1, :cond_d

    .line 192
    .line 193
    goto :goto_9

    .line 194
    :cond_d
    iput v4, v1, Lsz;->b:I

    .line 195
    .line 196
    invoke-virtual {p1, p0}, Landroidx/constraintlayout/widget/d;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :cond_e
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 201
    .line 202
    if-eqz v0, :cond_f

    .line 203
    .line 204
    invoke-virtual {v0, p1}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {p1, p0}, Landroidx/constraintlayout/widget/d;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 209
    .line 210
    .line 211
    :cond_f
    :goto_9
    return-void
.end method

.method public final y(II)V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lfk1;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lfk1;-><init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:Lfk1;

    .line 19
    .line 20
    iput p1, p0, Lfk1;->c:I

    .line 21
    .line 22
    iput p2, p0, Lfk1;->d:I

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->k0:I

    .line 30
    .line 31
    iput p2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m0:I

    .line 32
    .line 33
    invoke-virtual {v0, p1, p2}, Llk1;->n(II)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 43
    .line 44
    invoke-virtual {v0, p2}, Llk1;->b(I)Landroidx/constraintlayout/widget/d;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:Lek1;

    .line 49
    .line 50
    invoke-virtual {v0, p1, p2}, Lek1;->e(Landroidx/constraintlayout/widget/d;Landroidx/constraintlayout/widget/d;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->v()V

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->k(F)V

    .line 60
    .line 61
    .line 62
    :cond_2
    return-void
.end method

.method public final z(FFI)V
    .locals 13

    .line 1
    move/from16 v0, p3

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 9
    .line 10
    cmpl-float v1, v1, p1

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    :goto_0
    return-void

    .line 15
    :cond_1
    const/4 v1, 0x1

    .line 16
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->C0:Z

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    iput-wide v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r0:J

    .line 23
    .line 24
    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 25
    .line 26
    invoke-virtual {v2}, Llk1;->c()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    int-to-float v2, v2

    .line 31
    const/high16 v4, 0x447a0000    # 1000.0f

    .line 32
    .line 33
    div-float v4, v2, v4

    .line 34
    .line 35
    iput v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s0:F

    .line 36
    .line 37
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 38
    .line 39
    iput-boolean v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y0:Z

    .line 40
    .line 41
    iget-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->D0:Lch2;

    .line 42
    .line 43
    const/high16 v2, 0x3f800000    # 1.0f

    .line 44
    .line 45
    const/4 v5, 0x7

    .line 46
    const/4 v6, 0x6

    .line 47
    const/4 v8, 0x2

    .line 48
    const/4 v9, 0x0

    .line 49
    const/4 v10, 0x0

    .line 50
    if-eqz v0, :cond_7

    .line 51
    .line 52
    if-eq v0, v1, :cond_7

    .line 53
    .line 54
    if-eq v0, v8, :cond_7

    .line 55
    .line 56
    const/4 v11, 0x4

    .line 57
    iget-object v12, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->E0:Lck1;

    .line 58
    .line 59
    if-eq v0, v11, :cond_6

    .line 60
    .line 61
    const/4 v11, 0x5

    .line 62
    if-eq v0, v11, :cond_2

    .line 63
    .line 64
    if-eq v0, v6, :cond_7

    .line 65
    .line 66
    if-eq v0, v5, :cond_7

    .line 67
    .line 68
    goto/16 :goto_c

    .line 69
    .line 70
    :cond_2
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 71
    .line 72
    iget-object v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 73
    .line 74
    invoke-virtual {v1}, Llk1;->g()F

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    cmpl-float v4, p2, v10

    .line 79
    .line 80
    const/high16 v5, 0x40000000    # 2.0f

    .line 81
    .line 82
    if-lez v4, :cond_3

    .line 83
    .line 84
    div-float v4, p2, v1

    .line 85
    .line 86
    mul-float v6, p2, v4

    .line 87
    .line 88
    mul-float/2addr v1, v4

    .line 89
    mul-float/2addr v1, v4

    .line 90
    div-float/2addr v1, v5

    .line 91
    sub-float/2addr v6, v1

    .line 92
    add-float/2addr v6, v0

    .line 93
    cmpl-float v0, v6, v2

    .line 94
    .line 95
    if-lez v0, :cond_4

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    neg-float v2, p2

    .line 99
    div-float/2addr v2, v1

    .line 100
    mul-float v4, p2, v2

    .line 101
    .line 102
    mul-float/2addr v1, v2

    .line 103
    mul-float/2addr v1, v2

    .line 104
    div-float/2addr v1, v5

    .line 105
    add-float/2addr v1, v4

    .line 106
    add-float/2addr v1, v0

    .line 107
    cmpg-float v0, v1, v10

    .line 108
    .line 109
    if-gez v0, :cond_4

    .line 110
    .line 111
    :goto_1
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 112
    .line 113
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 114
    .line 115
    invoke-virtual {v0}, Llk1;->g()F

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    iput p2, v12, Lck1;->a:F

    .line 120
    .line 121
    iput p1, v12, Lck1;->b:F

    .line 122
    .line 123
    iput v0, v12, Lck1;->c:F

    .line 124
    .line 125
    iput-object v12, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h0:Lak1;

    .line 126
    .line 127
    goto/16 :goto_c

    .line 128
    .line 129
    :cond_4
    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 130
    .line 131
    iget v4, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->s0:F

    .line 132
    .line 133
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 134
    .line 135
    invoke-virtual {v0}, Llk1;->g()F

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 140
    .line 141
    iget-object v0, v0, Llk1;->c:Lkk1;

    .line 142
    .line 143
    if-eqz v0, :cond_5

    .line 144
    .line 145
    iget-object v0, v0, Lkk1;->l:Lmq2;

    .line 146
    .line 147
    if-eqz v0, :cond_5

    .line 148
    .line 149
    iget v0, v0, Lmq2;->s:F

    .line 150
    .line 151
    move v6, v0

    .line 152
    goto :goto_2

    .line 153
    :cond_5
    move v6, v10

    .line 154
    :goto_2
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->D0:Lch2;

    .line 155
    .line 156
    move v2, p1

    .line 157
    move v3, p2

    .line 158
    invoke-virtual/range {v0 .. v6}, Lch2;->b(FFFFFF)V

    .line 159
    .line 160
    .line 161
    iput v10, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->j0:F

    .line 162
    .line 163
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 164
    .line 165
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 166
    .line 167
    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 168
    .line 169
    iput-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h0:Lak1;

    .line 170
    .line 171
    goto/16 :goto_c

    .line 172
    .line 173
    :cond_6
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 174
    .line 175
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 176
    .line 177
    invoke-virtual {v0}, Llk1;->g()F

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    iput p2, v12, Lck1;->a:F

    .line 182
    .line 183
    iput p1, v12, Lck1;->b:F

    .line 184
    .line 185
    iput v0, v12, Lck1;->c:F

    .line 186
    .line 187
    iput-object v12, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h0:Lak1;

    .line 188
    .line 189
    goto/16 :goto_c

    .line 190
    .line 191
    :cond_7
    if-eq v0, v1, :cond_a

    .line 192
    .line 193
    if-ne v0, v5, :cond_8

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_8
    if-eq v0, v8, :cond_b

    .line 197
    .line 198
    if-ne v0, v6, :cond_9

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_9
    move v2, p1

    .line 202
    goto :goto_4

    .line 203
    :cond_a
    :goto_3
    move v2, v10

    .line 204
    :cond_b
    :goto_4
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 205
    .line 206
    iget-object v0, p1, Llk1;->c:Lkk1;

    .line 207
    .line 208
    if-eqz v0, :cond_c

    .line 209
    .line 210
    iget-object v1, v0, Lkk1;->l:Lmq2;

    .line 211
    .line 212
    if-eqz v1, :cond_c

    .line 213
    .line 214
    iget v1, v1, Lmq2;->D:I

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_c
    move v1, v9

    .line 218
    :goto_5
    iget v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 219
    .line 220
    move-object v5, v0

    .line 221
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->D0:Lch2;

    .line 222
    .line 223
    if-nez v1, :cond_e

    .line 224
    .line 225
    invoke-virtual {p1}, Llk1;->g()F

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    iget-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 230
    .line 231
    iget-object p1, p1, Llk1;->c:Lkk1;

    .line 232
    .line 233
    if-eqz p1, :cond_d

    .line 234
    .line 235
    iget-object p1, p1, Lkk1;->l:Lmq2;

    .line 236
    .line 237
    if-eqz p1, :cond_d

    .line 238
    .line 239
    iget v10, p1, Lmq2;->s:F

    .line 240
    .line 241
    :cond_d
    move v1, v3

    .line 242
    move v6, v10

    .line 243
    move v3, p2

    .line 244
    invoke-virtual/range {v0 .. v6}, Lch2;->b(FFFFFF)V

    .line 245
    .line 246
    .line 247
    goto :goto_b

    .line 248
    :cond_e
    move v1, v3

    .line 249
    if-eqz v5, :cond_f

    .line 250
    .line 251
    iget-object p1, v5, Lkk1;->l:Lmq2;

    .line 252
    .line 253
    if-eqz p1, :cond_f

    .line 254
    .line 255
    iget p1, p1, Lmq2;->z:F

    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_f
    move p1, v10

    .line 259
    :goto_6
    if-eqz v5, :cond_10

    .line 260
    .line 261
    iget-object v3, v5, Lkk1;->l:Lmq2;

    .line 262
    .line 263
    if-eqz v3, :cond_10

    .line 264
    .line 265
    iget v3, v3, Lmq2;->A:F

    .line 266
    .line 267
    goto :goto_7

    .line 268
    :cond_10
    move v3, v10

    .line 269
    :goto_7
    if-eqz v5, :cond_11

    .line 270
    .line 271
    iget-object v4, v5, Lkk1;->l:Lmq2;

    .line 272
    .line 273
    if-eqz v4, :cond_11

    .line 274
    .line 275
    iget v4, v4, Lmq2;->y:F

    .line 276
    .line 277
    goto :goto_8

    .line 278
    :cond_11
    move v4, v10

    .line 279
    :goto_8
    if-eqz v5, :cond_12

    .line 280
    .line 281
    iget-object v6, v5, Lkk1;->l:Lmq2;

    .line 282
    .line 283
    if-eqz v6, :cond_12

    .line 284
    .line 285
    iget v6, v6, Lmq2;->B:F

    .line 286
    .line 287
    goto :goto_9

    .line 288
    :cond_12
    move v6, v10

    .line 289
    :goto_9
    if-eqz v5, :cond_13

    .line 290
    .line 291
    iget-object v5, v5, Lkk1;->l:Lmq2;

    .line 292
    .line 293
    if-eqz v5, :cond_13

    .line 294
    .line 295
    iget v5, v5, Lmq2;->C:I

    .line 296
    .line 297
    goto :goto_a

    .line 298
    :cond_13
    move v5, v9

    .line 299
    :goto_a
    iget-object v8, v0, Lch2;->b:Lcg2;

    .line 300
    .line 301
    if-nez v8, :cond_14

    .line 302
    .line 303
    new-instance v8, Lcg2;

    .line 304
    .line 305
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 306
    .line 307
    .line 308
    const-wide/high16 v11, 0x3fe0000000000000L    # 0.5

    .line 309
    .line 310
    iput-wide v11, v8, Lcg2;->a:D

    .line 311
    .line 312
    iput v9, v8, Lcg2;->i:I

    .line 313
    .line 314
    iput-object v8, v0, Lch2;->b:Lcg2;

    .line 315
    .line 316
    :cond_14
    iget-object v8, v0, Lch2;->b:Lcg2;

    .line 317
    .line 318
    iput-object v8, v0, Lch2;->c:Lbh2;

    .line 319
    .line 320
    float-to-double v11, v2

    .line 321
    iput-wide v11, v8, Lcg2;->c:D

    .line 322
    .line 323
    float-to-double v11, v4

    .line 324
    iput-wide v11, v8, Lcg2;->a:D

    .line 325
    .line 326
    iput v1, v8, Lcg2;->e:F

    .line 327
    .line 328
    float-to-double v0, v3

    .line 329
    iput-wide v0, v8, Lcg2;->b:D

    .line 330
    .line 331
    iput p1, v8, Lcg2;->g:F

    .line 332
    .line 333
    iput v6, v8, Lcg2;->h:F

    .line 334
    .line 335
    iput v5, v8, Lcg2;->i:I

    .line 336
    .line 337
    iput v10, v8, Lcg2;->d:F

    .line 338
    .line 339
    :goto_b
    iget p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 340
    .line 341
    iput v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0:F

    .line 342
    .line 343
    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 344
    .line 345
    iput-object v7, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->h0:Lak1;

    .line 346
    .line 347
    :goto_c
    iput-boolean v9, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->x0:Z

    .line 348
    .line 349
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 350
    .line 351
    .line 352
    move-result-wide v0

    .line 353
    iput-wide v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout;->r0:J

    .line 354
    .line 355
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 356
    .line 357
    .line 358
    return-void
.end method

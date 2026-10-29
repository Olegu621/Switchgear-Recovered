.class public final Lzj1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public A:I

.field public B:I

.field public C:Landroid/view/View;

.field public D:I

.field public E:F

.field public F:Landroid/view/animation/Interpolator;

.field public G:Z

.field public final a:Landroid/graphics/Rect;

.field public final b:Landroid/view/View;

.field public final c:I

.field public d:Z

.field public e:I

.field public final f:Lik1;

.field public final g:Lik1;

.field public final h:Lxj1;

.field public final i:Lxj1;

.field public j:[Lpy0;

.field public k:Lwc;

.field public l:F

.field public m:F

.field public n:F

.field public o:[I

.field public p:[D

.field public q:[D

.field public r:[Ljava/lang/String;

.field public s:[I

.field public final t:[F

.field public final u:Ljava/util/ArrayList;

.field public final v:[F

.field public final w:Ljava/util/ArrayList;

.field public x:Ljava/util/HashMap;

.field public y:Ljava/util/HashMap;

.field public z:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lzj1;->a:Landroid/graphics/Rect;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lzj1;->d:Z

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    iput v1, p0, Lzj1;->e:I

    .line 16
    .line 17
    new-instance v2, Lik1;

    .line 18
    .line 19
    invoke-direct {v2}, Lik1;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v2, p0, Lzj1;->f:Lik1;

    .line 23
    .line 24
    new-instance v2, Lik1;

    .line 25
    .line 26
    invoke-direct {v2}, Lik1;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v2, p0, Lzj1;->g:Lik1;

    .line 30
    .line 31
    new-instance v2, Lxj1;

    .line 32
    .line 33
    invoke-direct {v2}, Lxj1;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Lzj1;->h:Lxj1;

    .line 37
    .line 38
    new-instance v2, Lxj1;

    .line 39
    .line 40
    invoke-direct {v2}, Lxj1;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, Lzj1;->i:Lxj1;

    .line 44
    .line 45
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 46
    .line 47
    iput v2, p0, Lzj1;->l:F

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    iput v3, p0, Lzj1;->m:F

    .line 51
    .line 52
    const/high16 v3, 0x3f800000    # 1.0f

    .line 53
    .line 54
    iput v3, p0, Lzj1;->n:F

    .line 55
    .line 56
    const/4 v3, 0x4

    .line 57
    new-array v3, v3, [F

    .line 58
    .line 59
    iput-object v3, p0, Lzj1;->t:[F

    .line 60
    .line 61
    new-instance v3, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v3, p0, Lzj1;->u:Ljava/util/ArrayList;

    .line 67
    .line 68
    const/4 v3, 0x1

    .line 69
    new-array v3, v3, [F

    .line 70
    .line 71
    iput-object v3, p0, Lzj1;->v:[F

    .line 72
    .line 73
    new-instance v3, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v3, p0, Lzj1;->w:Ljava/util/ArrayList;

    .line 79
    .line 80
    iput v1, p0, Lzj1;->A:I

    .line 81
    .line 82
    iput v1, p0, Lzj1;->B:I

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    iput-object v3, p0, Lzj1;->C:Landroid/view/View;

    .line 86
    .line 87
    iput v1, p0, Lzj1;->D:I

    .line 88
    .line 89
    iput v2, p0, Lzj1;->E:F

    .line 90
    .line 91
    iput-object v3, p0, Lzj1;->F:Landroid/view/animation/Interpolator;

    .line 92
    .line 93
    iput-boolean v0, p0, Lzj1;->G:Z

    .line 94
    .line 95
    iput-object p1, p0, Lzj1;->b:Landroid/view/View;

    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    iput v0, p0, Lzj1;->c:I

    .line 102
    .line 103
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public static g(Landroid/graphics/Rect;Landroid/graphics/Rect;III)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    if-eq p2, v0, :cond_3

    .line 4
    .line 5
    if-eq p2, v1, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p2, v0, :cond_1

    .line 9
    .line 10
    const/4 p4, 0x4

    .line 11
    if-eq p2, p4, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget p2, p0, Landroid/graphics/Rect;->left:I

    .line 15
    .line 16
    iget p4, p0, Landroid/graphics/Rect;->right:I

    .line 17
    .line 18
    add-int/2addr p2, p4

    .line 19
    iget p4, p0, Landroid/graphics/Rect;->bottom:I

    .line 20
    .line 21
    iget v0, p0, Landroid/graphics/Rect;->top:I

    .line 22
    .line 23
    add-int/2addr p4, v0

    .line 24
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    add-int/2addr v0, p4

    .line 29
    div-int/2addr v0, v1

    .line 30
    sub-int/2addr p3, v0

    .line 31
    iput p3, p1, Landroid/graphics/Rect;->left:I

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    sub-int/2addr p2, p3

    .line 38
    div-int/2addr p2, v1

    .line 39
    iput p2, p1, Landroid/graphics/Rect;->top:I

    .line 40
    .line 41
    iget p2, p1, Landroid/graphics/Rect;->left:I

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    add-int/2addr p3, p2

    .line 48
    iput p3, p1, Landroid/graphics/Rect;->right:I

    .line 49
    .line 50
    iget p2, p1, Landroid/graphics/Rect;->top:I

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    add-int/2addr p0, p2

    .line 57
    iput p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    iget p2, p0, Landroid/graphics/Rect;->left:I

    .line 61
    .line 62
    iget p3, p0, Landroid/graphics/Rect;->right:I

    .line 63
    .line 64
    add-int/2addr p2, p3

    .line 65
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    div-int/2addr p3, v1

    .line 70
    iget v0, p0, Landroid/graphics/Rect;->top:I

    .line 71
    .line 72
    add-int/2addr p3, v0

    .line 73
    div-int/lit8 v0, p2, 0x2

    .line 74
    .line 75
    sub-int/2addr p3, v0

    .line 76
    iput p3, p1, Landroid/graphics/Rect;->left:I

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    add-int/2addr p3, p2

    .line 83
    div-int/2addr p3, v1

    .line 84
    sub-int/2addr p4, p3

    .line 85
    iput p4, p1, Landroid/graphics/Rect;->top:I

    .line 86
    .line 87
    iget p2, p1, Landroid/graphics/Rect;->left:I

    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    add-int/2addr p3, p2

    .line 94
    iput p3, p1, Landroid/graphics/Rect;->right:I

    .line 95
    .line 96
    iget p2, p1, Landroid/graphics/Rect;->top:I

    .line 97
    .line 98
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    add-int/2addr p0, p2

    .line 103
    iput p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 104
    .line 105
    return-void

    .line 106
    :cond_2
    iget p2, p0, Landroid/graphics/Rect;->left:I

    .line 107
    .line 108
    iget p4, p0, Landroid/graphics/Rect;->right:I

    .line 109
    .line 110
    add-int/2addr p2, p4

    .line 111
    iget p4, p0, Landroid/graphics/Rect;->top:I

    .line 112
    .line 113
    iget v0, p0, Landroid/graphics/Rect;->bottom:I

    .line 114
    .line 115
    add-int/2addr p4, v0

    .line 116
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    add-int/2addr v0, p4

    .line 121
    div-int/2addr v0, v1

    .line 122
    sub-int/2addr p3, v0

    .line 123
    iput p3, p1, Landroid/graphics/Rect;->left:I

    .line 124
    .line 125
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 126
    .line 127
    .line 128
    move-result p3

    .line 129
    sub-int/2addr p2, p3

    .line 130
    div-int/2addr p2, v1

    .line 131
    iput p2, p1, Landroid/graphics/Rect;->top:I

    .line 132
    .line 133
    iget p2, p1, Landroid/graphics/Rect;->left:I

    .line 134
    .line 135
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 136
    .line 137
    .line 138
    move-result p3

    .line 139
    add-int/2addr p3, p2

    .line 140
    iput p3, p1, Landroid/graphics/Rect;->right:I

    .line 141
    .line 142
    iget p2, p1, Landroid/graphics/Rect;->top:I

    .line 143
    .line 144
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    add-int/2addr p0, p2

    .line 149
    iput p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 150
    .line 151
    return-void

    .line 152
    :cond_3
    iget p2, p0, Landroid/graphics/Rect;->left:I

    .line 153
    .line 154
    iget p3, p0, Landroid/graphics/Rect;->right:I

    .line 155
    .line 156
    add-int/2addr p2, p3

    .line 157
    iget p3, p0, Landroid/graphics/Rect;->top:I

    .line 158
    .line 159
    iget v0, p0, Landroid/graphics/Rect;->bottom:I

    .line 160
    .line 161
    add-int/2addr p3, v0

    .line 162
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    sub-int/2addr p3, v0

    .line 167
    div-int/2addr p3, v1

    .line 168
    iput p3, p1, Landroid/graphics/Rect;->left:I

    .line 169
    .line 170
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 171
    .line 172
    .line 173
    move-result p3

    .line 174
    add-int/2addr p3, p2

    .line 175
    div-int/2addr p3, v1

    .line 176
    sub-int/2addr p4, p3

    .line 177
    iput p4, p1, Landroid/graphics/Rect;->top:I

    .line 178
    .line 179
    iget p2, p1, Landroid/graphics/Rect;->left:I

    .line 180
    .line 181
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 182
    .line 183
    .line 184
    move-result p3

    .line 185
    add-int/2addr p3, p2

    .line 186
    iput p3, p1, Landroid/graphics/Rect;->right:I

    .line 187
    .line 188
    iget p2, p1, Landroid/graphics/Rect;->top:I

    .line 189
    .line 190
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 191
    .line 192
    .line 193
    move-result p0

    .line 194
    add-int/2addr p0, p2

    .line 195
    iput p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 196
    .line 197
    return-void
.end method


# virtual methods
.method public final a(La31;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lzj1;->w:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(F[F)F
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/high16 v2, 0x3f800000    # 1.0f

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    aput v2, p2, v1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget v3, p0, Lzj1;->n:F

    .line 11
    .line 12
    float-to-double v4, v3

    .line 13
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 14
    .line 15
    cmpl-double v4, v4, v6

    .line 16
    .line 17
    if-eqz v4, :cond_2

    .line 18
    .line 19
    iget v4, p0, Lzj1;->m:F

    .line 20
    .line 21
    cmpg-float v5, p1, v4

    .line 22
    .line 23
    if-gez v5, :cond_1

    .line 24
    .line 25
    move p1, v0

    .line 26
    :cond_1
    cmpl-float v5, p1, v4

    .line 27
    .line 28
    if-lez v5, :cond_2

    .line 29
    .line 30
    float-to-double v8, p1

    .line 31
    cmpg-double v5, v8, v6

    .line 32
    .line 33
    if-gez v5, :cond_2

    .line 34
    .line 35
    sub-float/2addr p1, v4

    .line 36
    mul-float/2addr p1, v3

    .line 37
    invoke-static {p1, v2}, Ljava/lang/Math;->min(FF)F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    :cond_2
    :goto_0
    iget-object v3, p0, Lzj1;->f:Lik1;

    .line 42
    .line 43
    iget-object v3, v3, Lik1;->a:Lr4;

    .line 44
    .line 45
    iget-object p0, p0, Lzj1;->u:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const/high16 v4, 0x7fc00000    # Float.NaN

    .line 52
    .line 53
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_5

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, Lik1;

    .line 64
    .line 65
    iget-object v6, v5, Lik1;->a:Lr4;

    .line 66
    .line 67
    if-eqz v6, :cond_3

    .line 68
    .line 69
    iget v7, v5, Lik1;->c:F

    .line 70
    .line 71
    cmpg-float v8, v7, p1

    .line 72
    .line 73
    if-gez v8, :cond_4

    .line 74
    .line 75
    move-object v3, v6

    .line 76
    move v0, v7

    .line 77
    goto :goto_1

    .line 78
    :cond_4
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_3

    .line 83
    .line 84
    iget v4, v5, Lik1;->c:F

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    if-eqz v3, :cond_8

    .line 88
    .line 89
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    if-eqz p0, :cond_6

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_6
    move v2, v4

    .line 97
    :goto_2
    sub-float/2addr p1, v0

    .line 98
    sub-float/2addr v2, v0

    .line 99
    div-float/2addr p1, v2

    .line 100
    float-to-double p0, p1

    .line 101
    invoke-virtual {v3, p0, p1}, Lr4;->a(D)D

    .line 102
    .line 103
    .line 104
    move-result-wide v4

    .line 105
    double-to-float v4, v4

    .line 106
    mul-float/2addr v4, v2

    .line 107
    add-float/2addr v4, v0

    .line 108
    if-eqz p2, :cond_7

    .line 109
    .line 110
    invoke-virtual {v3, p0, p1}, Lr4;->b(D)D

    .line 111
    .line 112
    .line 113
    move-result-wide p0

    .line 114
    double-to-float p0, p0

    .line 115
    aput p0, p2, v1

    .line 116
    .line 117
    :cond_7
    return v4

    .line 118
    :cond_8
    return p1
.end method

.method public final c(D[F[F)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p4

    .line 6
    .line 7
    const/4 v4, 0x4

    .line 8
    new-array v5, v4, [D

    .line 9
    .line 10
    new-array v6, v4, [D

    .line 11
    .line 12
    iget-object v7, v0, Lzj1;->j:[Lpy0;

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    aget-object v7, v7, v8

    .line 16
    .line 17
    invoke-virtual {v7, v1, v2, v5}, Lpy0;->g0(D[D)V

    .line 18
    .line 19
    .line 20
    iget-object v7, v0, Lzj1;->j:[Lpy0;

    .line 21
    .line 22
    aget-object v7, v7, v8

    .line 23
    .line 24
    invoke-virtual {v7, v1, v2, v6}, Lpy0;->k0(D[D)V

    .line 25
    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    invoke-static {v3, v7}, Ljava/util/Arrays;->fill([FF)V

    .line 29
    .line 30
    .line 31
    iget-object v9, v0, Lzj1;->o:[I

    .line 32
    .line 33
    iget-object v0, v0, Lzj1;->f:Lik1;

    .line 34
    .line 35
    iget v10, v0, Lik1;->e:F

    .line 36
    .line 37
    iget v11, v0, Lik1;->f:F

    .line 38
    .line 39
    iget v12, v0, Lik1;->i:F

    .line 40
    .line 41
    iget v13, v0, Lik1;->v:F

    .line 42
    .line 43
    move v15, v7

    .line 44
    move/from16 v16, v15

    .line 45
    .line 46
    move/from16 v17, v16

    .line 47
    .line 48
    move/from16 v18, v17

    .line 49
    .line 50
    move v14, v8

    .line 51
    move/from16 v19, v14

    .line 52
    .line 53
    :goto_0
    array-length v8, v9

    .line 54
    if-ge v14, v8, :cond_4

    .line 55
    .line 56
    move-object v8, v5

    .line 57
    aget-wide v4, v8, v14

    .line 58
    .line 59
    double-to-float v4, v4

    .line 60
    move v5, v4

    .line 61
    aget-wide v3, v6, v14

    .line 62
    .line 63
    double-to-float v3, v3

    .line 64
    aget v4, v9, v14

    .line 65
    .line 66
    move/from16 v21, v3

    .line 67
    .line 68
    const/4 v3, 0x1

    .line 69
    if-eq v4, v3, :cond_3

    .line 70
    .line 71
    const/4 v3, 0x2

    .line 72
    if-eq v4, v3, :cond_2

    .line 73
    .line 74
    const/4 v3, 0x3

    .line 75
    if-eq v4, v3, :cond_1

    .line 76
    .line 77
    const/4 v3, 0x4

    .line 78
    if-eq v4, v3, :cond_0

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_0
    move v13, v5

    .line 82
    move/from16 v18, v21

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    const/4 v3, 0x4

    .line 86
    move v12, v5

    .line 87
    move/from16 v16, v21

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    const/4 v3, 0x4

    .line 91
    move v11, v5

    .line 92
    move/from16 v7, v21

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    const/4 v3, 0x4

    .line 96
    move v10, v5

    .line 97
    move/from16 v15, v21

    .line 98
    .line 99
    :goto_1
    add-int/lit8 v14, v14, 0x1

    .line 100
    .line 101
    move v4, v3

    .line 102
    move-object v5, v8

    .line 103
    move-object/from16 v3, p4

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    const/high16 v3, 0x40000000    # 2.0f

    .line 107
    .line 108
    div-float v16, v16, v3

    .line 109
    .line 110
    add-float v16, v16, v15

    .line 111
    .line 112
    div-float v18, v18, v3

    .line 113
    .line 114
    add-float v18, v18, v7

    .line 115
    .line 116
    iget-object v0, v0, Lik1;->X:Lzj1;

    .line 117
    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    const/4 v4, 0x2

    .line 121
    new-array v5, v4, [F

    .line 122
    .line 123
    new-array v4, v4, [F

    .line 124
    .line 125
    invoke-virtual {v0, v1, v2, v5, v4}, Lzj1;->c(D[F[F)V

    .line 126
    .line 127
    .line 128
    aget v0, v5, v19

    .line 129
    .line 130
    const/16 v20, 0x1

    .line 131
    .line 132
    aget v1, v5, v20

    .line 133
    .line 134
    aget v2, v4, v19

    .line 135
    .line 136
    aget v4, v4, v20

    .line 137
    .line 138
    float-to-double v5, v0

    .line 139
    float-to-double v8, v10

    .line 140
    float-to-double v10, v11

    .line 141
    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    .line 142
    .line 143
    .line 144
    move-result-wide v21

    .line 145
    mul-double v21, v21, v8

    .line 146
    .line 147
    add-double v21, v21, v5

    .line 148
    .line 149
    div-float v0, v12, v3

    .line 150
    .line 151
    float-to-double v5, v0

    .line 152
    sub-double v5, v21, v5

    .line 153
    .line 154
    double-to-float v0, v5

    .line 155
    float-to-double v5, v1

    .line 156
    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    .line 157
    .line 158
    .line 159
    move-result-wide v21

    .line 160
    mul-double v21, v21, v8

    .line 161
    .line 162
    sub-double v5, v5, v21

    .line 163
    .line 164
    div-float v1, v13, v3

    .line 165
    .line 166
    float-to-double v8, v1

    .line 167
    sub-double/2addr v5, v8

    .line 168
    double-to-float v1, v5

    .line 169
    float-to-double v5, v2

    .line 170
    float-to-double v8, v15

    .line 171
    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    .line 172
    .line 173
    .line 174
    move-result-wide v14

    .line 175
    mul-double/2addr v14, v8

    .line 176
    add-double/2addr v14, v5

    .line 177
    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    .line 178
    .line 179
    .line 180
    move-result-wide v5

    .line 181
    move/from16 p0, v3

    .line 182
    .line 183
    move/from16 p1, v4

    .line 184
    .line 185
    float-to-double v3, v7

    .line 186
    mul-double/2addr v5, v3

    .line 187
    add-double/2addr v5, v14

    .line 188
    double-to-float v2, v5

    .line 189
    move/from16 v5, p1

    .line 190
    .line 191
    float-to-double v5, v5

    .line 192
    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    .line 193
    .line 194
    .line 195
    move-result-wide v14

    .line 196
    mul-double/2addr v14, v8

    .line 197
    sub-double/2addr v5, v14

    .line 198
    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    .line 199
    .line 200
    .line 201
    move-result-wide v7

    .line 202
    mul-double/2addr v7, v3

    .line 203
    add-double/2addr v7, v5

    .line 204
    double-to-float v3, v7

    .line 205
    move v10, v0

    .line 206
    move v11, v1

    .line 207
    move/from16 v16, v2

    .line 208
    .line 209
    move/from16 v18, v3

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_5
    move/from16 p0, v3

    .line 213
    .line 214
    :goto_2
    div-float v12, v12, p0

    .line 215
    .line 216
    add-float/2addr v12, v10

    .line 217
    add-float v12, v12, v17

    .line 218
    .line 219
    aput v12, p3, v19

    .line 220
    .line 221
    div-float v13, v13, p0

    .line 222
    .line 223
    add-float/2addr v13, v11

    .line 224
    add-float v13, v13, v17

    .line 225
    .line 226
    const/16 v20, 0x1

    .line 227
    .line 228
    aput v13, p3, v20

    .line 229
    .line 230
    aput v16, p4, v19

    .line 231
    .line 232
    aput v18, p4, v20

    .line 233
    .line 234
    return-void
.end method

.method public final d(FFF[F)V
    .locals 12

    .line 1
    iget-object v0, p0, Lzj1;->v:[F

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lzj1;->b(F[F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v1, p0, Lzj1;->j:[Lpy0;

    .line 8
    .line 9
    iget-object v2, p0, Lzj1;->f:Lik1;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    aget-object v1, v1, v3

    .line 15
    .line 16
    float-to-double v4, p1

    .line 17
    iget-object p1, p0, Lzj1;->q:[D

    .line 18
    .line 19
    invoke-virtual {v1, v4, v5, p1}, Lpy0;->k0(D[D)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lzj1;->j:[Lpy0;

    .line 23
    .line 24
    aget-object p1, p1, v3

    .line 25
    .line 26
    iget-object v1, p0, Lzj1;->p:[D

    .line 27
    .line 28
    invoke-virtual {p1, v4, v5, v1}, Lpy0;->g0(D[D)V

    .line 29
    .line 30
    .line 31
    aget p1, v0, v3

    .line 32
    .line 33
    :goto_0
    iget-object v10, p0, Lzj1;->q:[D

    .line 34
    .line 35
    array-length v0, v10

    .line 36
    if-ge v3, v0, :cond_0

    .line 37
    .line 38
    aget-wide v0, v10, v3

    .line 39
    .line 40
    float-to-double v6, p1

    .line 41
    mul-double/2addr v0, v6

    .line 42
    aput-wide v0, v10, v3

    .line 43
    .line 44
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-object p1, p0, Lzj1;->k:Lwc;

    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    iget-object v0, p0, Lzj1;->p:[D

    .line 52
    .line 53
    array-length v1, v0

    .line 54
    if-lez v1, :cond_1

    .line 55
    .line 56
    invoke-virtual {p1, v4, v5, v0}, Lwc;->g0(D[D)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lzj1;->k:Lwc;

    .line 60
    .line 61
    iget-object v0, p0, Lzj1;->q:[D

    .line 62
    .line 63
    invoke-virtual {p1, v4, v5, v0}, Lwc;->k0(D[D)V

    .line 64
    .line 65
    .line 66
    iget-object v9, p0, Lzj1;->o:[I

    .line 67
    .line 68
    iget-object v10, p0, Lzj1;->q:[D

    .line 69
    .line 70
    iget-object v11, p0, Lzj1;->p:[D

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move v6, p2

    .line 76
    move v7, p3

    .line 77
    move-object/from16 v8, p4

    .line 78
    .line 79
    invoke-static/range {v6 .. v11}, Lik1;->e(FF[F[I[D[D)V

    .line 80
    .line 81
    .line 82
    :cond_1
    return-void

    .line 83
    :cond_2
    iget-object v9, p0, Lzj1;->o:[I

    .line 84
    .line 85
    iget-object v11, p0, Lzj1;->p:[D

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move v6, p2

    .line 91
    move v7, p3

    .line 92
    move-object/from16 v8, p4

    .line 93
    .line 94
    invoke-static/range {v6 .. v11}, Lik1;->e(FF[F[I[D[D)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_3
    iget-object p0, p0, Lzj1;->g:Lik1;

    .line 99
    .line 100
    iget p1, p0, Lik1;->e:F

    .line 101
    .line 102
    iget v0, v2, Lik1;->e:F

    .line 103
    .line 104
    sub-float/2addr p1, v0

    .line 105
    iget v0, p0, Lik1;->f:F

    .line 106
    .line 107
    iget v1, v2, Lik1;->f:F

    .line 108
    .line 109
    sub-float/2addr v0, v1

    .line 110
    iget v1, p0, Lik1;->i:F

    .line 111
    .line 112
    iget v4, v2, Lik1;->i:F

    .line 113
    .line 114
    sub-float/2addr v1, v4

    .line 115
    iget p0, p0, Lik1;->v:F

    .line 116
    .line 117
    iget v2, v2, Lik1;->v:F

    .line 118
    .line 119
    sub-float/2addr p0, v2

    .line 120
    add-float/2addr v1, p1

    .line 121
    add-float/2addr p0, v0

    .line 122
    const/high16 v2, 0x3f800000    # 1.0f

    .line 123
    .line 124
    sub-float v4, v2, p2

    .line 125
    .line 126
    mul-float/2addr v4, p1

    .line 127
    mul-float/2addr v1, p2

    .line 128
    add-float/2addr v1, v4

    .line 129
    aput v1, p4, v3

    .line 130
    .line 131
    sub-float/2addr v2, p3

    .line 132
    mul-float/2addr v2, v0

    .line 133
    mul-float/2addr p0, p3

    .line 134
    add-float/2addr p0, v2

    .line 135
    const/4 p1, 0x1

    .line 136
    aput p0, p4, p1

    .line 137
    .line 138
    return-void
.end method

.method public final e(FJLd31;Landroid/view/View;)Z
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p5

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move/from16 v2, p1

    .line 7
    .line 8
    invoke-virtual {v0, v2, v1}, Lzj1;->b(F[F)F

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    iget v3, v0, Lzj1;->D:I

    .line 13
    .line 14
    const/high16 v8, 0x3f800000    # 1.0f

    .line 15
    .line 16
    const/4 v9, -0x1

    .line 17
    if-eq v3, v9, :cond_3

    .line 18
    .line 19
    int-to-float v3, v3

    .line 20
    div-float v3, v8, v3

    .line 21
    .line 22
    div-float v4, v2, v3

    .line 23
    .line 24
    float-to-double v4, v4

    .line 25
    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    double-to-float v4, v4

    .line 30
    mul-float/2addr v4, v3

    .line 31
    rem-float/2addr v2, v3

    .line 32
    div-float/2addr v2, v3

    .line 33
    iget v5, v0, Lzj1;->E:F

    .line 34
    .line 35
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_0

    .line 40
    .line 41
    iget v5, v0, Lzj1;->E:F

    .line 42
    .line 43
    add-float/2addr v2, v5

    .line 44
    rem-float/2addr v2, v8

    .line 45
    :cond_0
    iget-object v5, v0, Lzj1;->F:Landroid/view/animation/Interpolator;

    .line 46
    .line 47
    if-eqz v5, :cond_1

    .line 48
    .line 49
    invoke-interface {v5, v2}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    float-to-double v10, v2

    .line 55
    const-wide/high16 v12, 0x3fe0000000000000L    # 0.5

    .line 56
    .line 57
    cmpl-double v2, v10, v12

    .line 58
    .line 59
    if-lez v2, :cond_2

    .line 60
    .line 61
    move v2, v8

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    const/4 v2, 0x0

    .line 64
    :goto_0
    mul-float/2addr v2, v3

    .line 65
    add-float/2addr v2, v4

    .line 66
    :cond_3
    iget-object v3, v0, Lzj1;->y:Ljava/util/HashMap;

    .line 67
    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_4

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Lw43;

    .line 89
    .line 90
    invoke-virtual {v4, v6, v2}, Lw43;->c(Landroid/view/View;F)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    iget-object v3, v0, Lzj1;->x:Ljava/util/HashMap;

    .line 95
    .line 96
    const/4 v10, 0x0

    .line 97
    if-eqz v3, :cond_7

    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    move-object v12, v1

    .line 108
    move v13, v10

    .line 109
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_6

    .line 114
    .line 115
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, Lc53;

    .line 120
    .line 121
    instance-of v3, v1, La53;

    .line 122
    .line 123
    if-eqz v3, :cond_5

    .line 124
    .line 125
    move-object v12, v1

    .line 126
    check-cast v12, La53;

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_5
    move-wide/from16 v3, p2

    .line 130
    .line 131
    move-object/from16 v5, p4

    .line 132
    .line 133
    invoke-virtual/range {v1 .. v6}, Lc53;->b(FJLd31;Landroid/view/View;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    or-int/2addr v13, v1

    .line 138
    move-object/from16 v6, p5

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_6
    move-object v1, v12

    .line 142
    goto :goto_3

    .line 143
    :cond_7
    move v13, v10

    .line 144
    :goto_3
    iget-object v3, v0, Lzj1;->j:[Lpy0;

    .line 145
    .line 146
    iget-object v11, v0, Lzj1;->f:Lik1;

    .line 147
    .line 148
    if-eqz v3, :cond_26

    .line 149
    .line 150
    aget-object v3, v3, v10

    .line 151
    .line 152
    float-to-double v14, v2

    .line 153
    const/high16 p1, 0x3f000000    # 0.5f

    .line 154
    .line 155
    iget-object v4, v0, Lzj1;->p:[D

    .line 156
    .line 157
    invoke-virtual {v3, v14, v15, v4}, Lpy0;->g0(D[D)V

    .line 158
    .line 159
    .line 160
    iget-object v3, v0, Lzj1;->j:[Lpy0;

    .line 161
    .line 162
    aget-object v3, v3, v10

    .line 163
    .line 164
    iget-object v4, v0, Lzj1;->q:[D

    .line 165
    .line 166
    invoke-virtual {v3, v14, v15, v4}, Lpy0;->k0(D[D)V

    .line 167
    .line 168
    .line 169
    iget-object v3, v0, Lzj1;->k:Lwc;

    .line 170
    .line 171
    if-eqz v3, :cond_8

    .line 172
    .line 173
    iget-object v4, v0, Lzj1;->p:[D

    .line 174
    .line 175
    const/16 v16, 0x0

    .line 176
    .line 177
    array-length v7, v4

    .line 178
    if-lez v7, :cond_9

    .line 179
    .line 180
    invoke-virtual {v3, v14, v15, v4}, Lwc;->g0(D[D)V

    .line 181
    .line 182
    .line 183
    iget-object v3, v0, Lzj1;->k:Lwc;

    .line 184
    .line 185
    iget-object v4, v0, Lzj1;->q:[D

    .line 186
    .line 187
    invoke-virtual {v3, v14, v15, v4}, Lwc;->k0(D[D)V

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_8
    const/16 v16, 0x0

    .line 192
    .line 193
    :cond_9
    :goto_4
    iget-boolean v3, v0, Lzj1;->G:Z

    .line 194
    .line 195
    if-nez v3, :cond_1d

    .line 196
    .line 197
    iget-object v3, v0, Lzj1;->o:[I

    .line 198
    .line 199
    iget-object v7, v0, Lzj1;->p:[D

    .line 200
    .line 201
    const/high16 v17, 0x40000000    # 2.0f

    .line 202
    .line 203
    iget-object v4, v0, Lzj1;->q:[D

    .line 204
    .line 205
    move/from16 v18, v8

    .line 206
    .line 207
    iget-boolean v8, v0, Lzj1;->d:Z

    .line 208
    .line 209
    iget v9, v11, Lik1;->e:F

    .line 210
    .line 211
    move/from16 v19, v10

    .line 212
    .line 213
    iget v10, v11, Lik1;->f:F

    .line 214
    .line 215
    iget v5, v11, Lik1;->i:F

    .line 216
    .line 217
    const/16 v20, 0x1

    .line 218
    .line 219
    iget v12, v11, Lik1;->v:F

    .line 220
    .line 221
    move-object/from16 v21, v1

    .line 222
    .line 223
    array-length v1, v3

    .line 224
    if-eqz v1, :cond_a

    .line 225
    .line 226
    iget-object v1, v11, Lik1;->a0:[D

    .line 227
    .line 228
    array-length v1, v1

    .line 229
    move/from16 v22, v5

    .line 230
    .line 231
    array-length v5, v3

    .line 232
    add-int/lit8 v5, v5, -0x1

    .line 233
    .line 234
    aget v5, v3, v5

    .line 235
    .line 236
    if-gt v1, v5, :cond_b

    .line 237
    .line 238
    array-length v1, v3

    .line 239
    add-int/lit8 v1, v1, -0x1

    .line 240
    .line 241
    aget v1, v3, v1

    .line 242
    .line 243
    add-int/lit8 v1, v1, 0x1

    .line 244
    .line 245
    new-array v5, v1, [D

    .line 246
    .line 247
    iput-object v5, v11, Lik1;->a0:[D

    .line 248
    .line 249
    new-array v1, v1, [D

    .line 250
    .line 251
    iput-object v1, v11, Lik1;->b0:[D

    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_a
    move/from16 v22, v5

    .line 255
    .line 256
    :cond_b
    :goto_5
    iget-object v1, v11, Lik1;->a0:[D

    .line 257
    .line 258
    move-object v5, v7

    .line 259
    move/from16 v23, v8

    .line 260
    .line 261
    const-wide/high16 v7, 0x7ff8000000000000L    # Double.NaN

    .line 262
    .line 263
    invoke-static {v1, v7, v8}, Ljava/util/Arrays;->fill([DD)V

    .line 264
    .line 265
    .line 266
    move/from16 v1, v19

    .line 267
    .line 268
    :goto_6
    array-length v7, v3

    .line 269
    if-ge v1, v7, :cond_c

    .line 270
    .line 271
    iget-object v7, v11, Lik1;->a0:[D

    .line 272
    .line 273
    aget v8, v3, v1

    .line 274
    .line 275
    aget-wide v24, v5, v1

    .line 276
    .line 277
    aput-wide v24, v7, v8

    .line 278
    .line 279
    iget-object v7, v11, Lik1;->b0:[D

    .line 280
    .line 281
    aget-wide v24, v4, v1

    .line 282
    .line 283
    aput-wide v24, v7, v8

    .line 284
    .line 285
    add-int/lit8 v1, v1, 0x1

    .line 286
    .line 287
    goto :goto_6

    .line 288
    :cond_c
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 289
    .line 290
    move/from16 v7, v16

    .line 291
    .line 292
    move v8, v7

    .line 293
    move/from16 v24, v8

    .line 294
    .line 295
    move/from16 v3, v19

    .line 296
    .line 297
    move/from16 v25, v22

    .line 298
    .line 299
    move/from16 v22, v24

    .line 300
    .line 301
    :goto_7
    iget-object v5, v11, Lik1;->a0:[D

    .line 302
    .line 303
    move/from16 v26, v12

    .line 304
    .line 305
    array-length v12, v5

    .line 306
    const-wide/16 v27, 0x0

    .line 307
    .line 308
    move-object/from16 v29, v5

    .line 309
    .line 310
    if-ge v3, v12, :cond_14

    .line 311
    .line 312
    aget-wide v30, v29, v3

    .line 313
    .line 314
    invoke-static/range {v30 .. v31}, Ljava/lang/Double;->isNaN(D)Z

    .line 315
    .line 316
    .line 317
    move-result v12

    .line 318
    if-eqz v12, :cond_d

    .line 319
    .line 320
    move/from16 v29, v13

    .line 321
    .line 322
    goto :goto_a

    .line 323
    :cond_d
    iget-object v12, v11, Lik1;->a0:[D

    .line 324
    .line 325
    aget-wide v29, v12, v3

    .line 326
    .line 327
    invoke-static/range {v29 .. v30}, Ljava/lang/Double;->isNaN(D)Z

    .line 328
    .line 329
    .line 330
    move-result v12

    .line 331
    if-eqz v12, :cond_e

    .line 332
    .line 333
    :goto_8
    move-wide/from16 v5, v27

    .line 334
    .line 335
    goto :goto_9

    .line 336
    :cond_e
    iget-object v12, v11, Lik1;->a0:[D

    .line 337
    .line 338
    aget-wide v29, v12, v3

    .line 339
    .line 340
    add-double v27, v29, v27

    .line 341
    .line 342
    goto :goto_8

    .line 343
    :goto_9
    double-to-float v5, v5

    .line 344
    iget-object v6, v11, Lik1;->b0:[D

    .line 345
    .line 346
    move/from16 v29, v13

    .line 347
    .line 348
    aget-wide v12, v6, v3

    .line 349
    .line 350
    double-to-float v6, v12

    .line 351
    move/from16 v12, v20

    .line 352
    .line 353
    if-eq v3, v12, :cond_13

    .line 354
    .line 355
    const/4 v12, 0x2

    .line 356
    if-eq v3, v12, :cond_12

    .line 357
    .line 358
    const/4 v12, 0x3

    .line 359
    if-eq v3, v12, :cond_11

    .line 360
    .line 361
    const/4 v12, 0x4

    .line 362
    if-eq v3, v12, :cond_10

    .line 363
    .line 364
    const/4 v6, 0x5

    .line 365
    if-eq v3, v6, :cond_f

    .line 366
    .line 367
    :goto_a
    move/from16 v12, v26

    .line 368
    .line 369
    goto :goto_b

    .line 370
    :cond_f
    move v1, v5

    .line 371
    goto :goto_a

    .line 372
    :cond_10
    move v12, v5

    .line 373
    move/from16 v24, v6

    .line 374
    .line 375
    goto :goto_b

    .line 376
    :cond_11
    move/from16 v25, v5

    .line 377
    .line 378
    move/from16 v22, v6

    .line 379
    .line 380
    goto :goto_a

    .line 381
    :cond_12
    move v10, v5

    .line 382
    move v8, v6

    .line 383
    goto :goto_a

    .line 384
    :cond_13
    move v9, v5

    .line 385
    move v7, v6

    .line 386
    goto :goto_a

    .line 387
    :goto_b
    add-int/lit8 v3, v3, 0x1

    .line 388
    .line 389
    move/from16 v13, v29

    .line 390
    .line 391
    const/16 v20, 0x1

    .line 392
    .line 393
    goto :goto_7

    .line 394
    :cond_14
    move/from16 v29, v13

    .line 395
    .line 396
    iget-object v3, v11, Lik1;->X:Lzj1;

    .line 397
    .line 398
    if-eqz v3, :cond_17

    .line 399
    .line 400
    const/4 v12, 0x2

    .line 401
    new-array v5, v12, [F

    .line 402
    .line 403
    new-array v6, v12, [F

    .line 404
    .line 405
    invoke-virtual {v3, v14, v15, v5, v6}, Lzj1;->c(D[F[F)V

    .line 406
    .line 407
    .line 408
    aget v3, v5, v19

    .line 409
    .line 410
    const/16 v20, 0x1

    .line 411
    .line 412
    aget v5, v5, v20

    .line 413
    .line 414
    aget v13, v6, v19

    .line 415
    .line 416
    aget v6, v6, v20

    .line 417
    .line 418
    move/from16 v22, v13

    .line 419
    .line 420
    float-to-double v12, v3

    .line 421
    move-wide/from16 v30, v12

    .line 422
    .line 423
    float-to-double v12, v9

    .line 424
    float-to-double v9, v10

    .line 425
    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    .line 426
    .line 427
    .line 428
    move-result-wide v32

    .line 429
    mul-double v32, v32, v12

    .line 430
    .line 431
    add-double v32, v32, v30

    .line 432
    .line 433
    div-float v3, v25, v17

    .line 434
    .line 435
    move-wide/from16 v30, v9

    .line 436
    .line 437
    float-to-double v9, v3

    .line 438
    sub-double v9, v32, v9

    .line 439
    .line 440
    double-to-float v9, v9

    .line 441
    move v3, v9

    .line 442
    float-to-double v9, v5

    .line 443
    invoke-static/range {v30 .. v31}, Ljava/lang/Math;->cos(D)D

    .line 444
    .line 445
    .line 446
    move-result-wide v32

    .line 447
    mul-double v32, v32, v12

    .line 448
    .line 449
    sub-double v9, v9, v32

    .line 450
    .line 451
    div-float v5, v26, v17

    .line 452
    .line 453
    move-wide/from16 v32, v9

    .line 454
    .line 455
    float-to-double v9, v5

    .line 456
    sub-double v9, v32, v9

    .line 457
    .line 458
    double-to-float v10, v9

    .line 459
    move/from16 v5, v22

    .line 460
    .line 461
    move/from16 v22, v10

    .line 462
    .line 463
    float-to-double v9, v5

    .line 464
    move-wide/from16 v32, v9

    .line 465
    .line 466
    float-to-double v9, v7

    .line 467
    invoke-static/range {v30 .. v31}, Ljava/lang/Math;->sin(D)D

    .line 468
    .line 469
    .line 470
    move-result-wide v34

    .line 471
    mul-double v34, v34, v9

    .line 472
    .line 473
    add-double v34, v34, v32

    .line 474
    .line 475
    invoke-static/range {v30 .. v31}, Ljava/lang/Math;->cos(D)D

    .line 476
    .line 477
    .line 478
    move-result-wide v32

    .line 479
    mul-double v32, v32, v12

    .line 480
    .line 481
    float-to-double v7, v8

    .line 482
    mul-double v32, v32, v7

    .line 483
    .line 484
    move-wide/from16 v36, v7

    .line 485
    .line 486
    add-double v7, v32, v34

    .line 487
    .line 488
    double-to-float v5, v7

    .line 489
    float-to-double v6, v6

    .line 490
    invoke-static/range {v30 .. v31}, Ljava/lang/Math;->cos(D)D

    .line 491
    .line 492
    .line 493
    move-result-wide v32

    .line 494
    mul-double v32, v32, v9

    .line 495
    .line 496
    sub-double v6, v6, v32

    .line 497
    .line 498
    invoke-static/range {v30 .. v31}, Ljava/lang/Math;->sin(D)D

    .line 499
    .line 500
    .line 501
    move-result-wide v8

    .line 502
    mul-double/2addr v8, v12

    .line 503
    mul-double v8, v8, v36

    .line 504
    .line 505
    add-double/2addr v8, v6

    .line 506
    double-to-float v6, v8

    .line 507
    array-length v7, v4

    .line 508
    const/4 v12, 0x2

    .line 509
    if-lt v7, v12, :cond_15

    .line 510
    .line 511
    float-to-double v7, v5

    .line 512
    aput-wide v7, v4, v19

    .line 513
    .line 514
    float-to-double v7, v6

    .line 515
    const/16 v20, 0x1

    .line 516
    .line 517
    aput-wide v7, v4, v20

    .line 518
    .line 519
    :cond_15
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 520
    .line 521
    .line 522
    move-result v4

    .line 523
    if-nez v4, :cond_16

    .line 524
    .line 525
    float-to-double v7, v1

    .line 526
    float-to-double v9, v6

    .line 527
    float-to-double v4, v5

    .line 528
    invoke-static {v9, v10, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    .line 529
    .line 530
    .line 531
    move-result-wide v4

    .line 532
    invoke-static {v4, v5}, Ljava/lang/Math;->toDegrees(D)D

    .line 533
    .line 534
    .line 535
    move-result-wide v4

    .line 536
    add-double/2addr v4, v7

    .line 537
    double-to-float v1, v4

    .line 538
    move-object/from16 v6, p5

    .line 539
    .line 540
    invoke-virtual {v6, v1}, Landroid/view/View;->setRotation(F)V

    .line 541
    .line 542
    .line 543
    goto :goto_c

    .line 544
    :cond_16
    move-object/from16 v6, p5

    .line 545
    .line 546
    :goto_c
    move v9, v3

    .line 547
    move/from16 v10, v22

    .line 548
    .line 549
    goto :goto_d

    .line 550
    :cond_17
    move-object/from16 v6, p5

    .line 551
    .line 552
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 553
    .line 554
    .line 555
    move-result v3

    .line 556
    if-nez v3, :cond_18

    .line 557
    .line 558
    div-float v22, v22, v17

    .line 559
    .line 560
    add-float v3, v22, v7

    .line 561
    .line 562
    div-float v24, v24, v17

    .line 563
    .line 564
    add-float v4, v24, v8

    .line 565
    .line 566
    float-to-double v7, v1

    .line 567
    float-to-double v4, v4

    .line 568
    float-to-double v12, v3

    .line 569
    invoke-static {v4, v5, v12, v13}, Ljava/lang/Math;->atan2(DD)D

    .line 570
    .line 571
    .line 572
    move-result-wide v3

    .line 573
    invoke-static {v3, v4}, Ljava/lang/Math;->toDegrees(D)D

    .line 574
    .line 575
    .line 576
    move-result-wide v3

    .line 577
    add-double/2addr v3, v7

    .line 578
    add-double v3, v3, v27

    .line 579
    .line 580
    double-to-float v1, v3

    .line 581
    invoke-virtual {v6, v1}, Landroid/view/View;->setRotation(F)V

    .line 582
    .line 583
    .line 584
    :cond_18
    :goto_d
    instance-of v1, v6, Landroidx/constraintlayout/utils/widget/MotionLabel;

    .line 585
    .line 586
    if-eqz v1, :cond_19

    .line 587
    .line 588
    add-float v1, v9, v25

    .line 589
    .line 590
    add-float v12, v10, v26

    .line 591
    .line 592
    move-object v3, v6

    .line 593
    check-cast v3, Landroidx/constraintlayout/utils/widget/MotionLabel;

    .line 594
    .line 595
    invoke-virtual {v3, v9, v10, v1, v12}, Landroidx/constraintlayout/utils/widget/MotionLabel;->c(FFFF)V

    .line 596
    .line 597
    .line 598
    :goto_e
    move/from16 v1, v19

    .line 599
    .line 600
    goto :goto_10

    .line 601
    :cond_19
    add-float v9, v9, p1

    .line 602
    .line 603
    float-to-int v1, v9

    .line 604
    add-float v10, v10, p1

    .line 605
    .line 606
    float-to-int v3, v10

    .line 607
    add-float v9, v9, v25

    .line 608
    .line 609
    float-to-int v4, v9

    .line 610
    add-float v10, v10, v26

    .line 611
    .line 612
    float-to-int v5, v10

    .line 613
    sub-int v7, v4, v1

    .line 614
    .line 615
    sub-int v8, v5, v3

    .line 616
    .line 617
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    .line 618
    .line 619
    .line 620
    move-result v9

    .line 621
    if-ne v7, v9, :cond_1b

    .line 622
    .line 623
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 624
    .line 625
    .line 626
    move-result v9

    .line 627
    if-eq v8, v9, :cond_1a

    .line 628
    .line 629
    goto :goto_f

    .line 630
    :cond_1a
    if-eqz v23, :cond_1c

    .line 631
    .line 632
    :cond_1b
    :goto_f
    const/high16 v9, 0x40000000    # 2.0f

    .line 633
    .line 634
    invoke-static {v7, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 635
    .line 636
    .line 637
    move-result v7

    .line 638
    invoke-static {v8, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 639
    .line 640
    .line 641
    move-result v8

    .line 642
    invoke-virtual {v6, v7, v8}, Landroid/view/View;->measure(II)V

    .line 643
    .line 644
    .line 645
    :cond_1c
    invoke-virtual {v6, v1, v3, v4, v5}, Landroid/view/View;->layout(IIII)V

    .line 646
    .line 647
    .line 648
    goto :goto_e

    .line 649
    :goto_10
    iput-boolean v1, v0, Lzj1;->d:Z

    .line 650
    .line 651
    goto :goto_11

    .line 652
    :cond_1d
    move-object/from16 v6, p5

    .line 653
    .line 654
    move-object/from16 v21, v1

    .line 655
    .line 656
    move/from16 v18, v8

    .line 657
    .line 658
    move/from16 v29, v13

    .line 659
    .line 660
    const/high16 v17, 0x40000000    # 2.0f

    .line 661
    .line 662
    :goto_11
    iget v1, v0, Lzj1;->B:I

    .line 663
    .line 664
    const/4 v3, -0x1

    .line 665
    if-eq v1, v3, :cond_1f

    .line 666
    .line 667
    iget-object v1, v0, Lzj1;->C:Landroid/view/View;

    .line 668
    .line 669
    if-nez v1, :cond_1e

    .line 670
    .line 671
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 672
    .line 673
    .line 674
    move-result-object v1

    .line 675
    check-cast v1, Landroid/view/View;

    .line 676
    .line 677
    iget v3, v0, Lzj1;->B:I

    .line 678
    .line 679
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 680
    .line 681
    .line 682
    move-result-object v1

    .line 683
    iput-object v1, v0, Lzj1;->C:Landroid/view/View;

    .line 684
    .line 685
    :cond_1e
    iget-object v1, v0, Lzj1;->C:Landroid/view/View;

    .line 686
    .line 687
    if-eqz v1, :cond_1f

    .line 688
    .line 689
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 690
    .line 691
    .line 692
    move-result v1

    .line 693
    iget-object v3, v0, Lzj1;->C:Landroid/view/View;

    .line 694
    .line 695
    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    .line 696
    .line 697
    .line 698
    move-result v3

    .line 699
    add-int/2addr v3, v1

    .line 700
    int-to-float v1, v3

    .line 701
    div-float v1, v1, v17

    .line 702
    .line 703
    iget-object v3, v0, Lzj1;->C:Landroid/view/View;

    .line 704
    .line 705
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 706
    .line 707
    .line 708
    move-result v3

    .line 709
    iget-object v4, v0, Lzj1;->C:Landroid/view/View;

    .line 710
    .line 711
    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    .line 712
    .line 713
    .line 714
    move-result v4

    .line 715
    add-int/2addr v4, v3

    .line 716
    int-to-float v3, v4

    .line 717
    div-float v3, v3, v17

    .line 718
    .line 719
    invoke-virtual {v6}, Landroid/view/View;->getRight()I

    .line 720
    .line 721
    .line 722
    move-result v4

    .line 723
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    .line 724
    .line 725
    .line 726
    move-result v5

    .line 727
    sub-int/2addr v4, v5

    .line 728
    if-lez v4, :cond_1f

    .line 729
    .line 730
    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    .line 731
    .line 732
    .line 733
    move-result v4

    .line 734
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    .line 735
    .line 736
    .line 737
    move-result v5

    .line 738
    sub-int/2addr v4, v5

    .line 739
    if-lez v4, :cond_1f

    .line 740
    .line 741
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    .line 742
    .line 743
    .line 744
    move-result v4

    .line 745
    int-to-float v4, v4

    .line 746
    sub-float/2addr v3, v4

    .line 747
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    .line 748
    .line 749
    .line 750
    move-result v4

    .line 751
    int-to-float v4, v4

    .line 752
    sub-float/2addr v1, v4

    .line 753
    invoke-virtual {v6, v3}, Landroid/view/View;->setPivotX(F)V

    .line 754
    .line 755
    .line 756
    invoke-virtual {v6, v1}, Landroid/view/View;->setPivotY(F)V

    .line 757
    .line 758
    .line 759
    :cond_1f
    iget-object v1, v0, Lzj1;->y:Ljava/util/HashMap;

    .line 760
    .line 761
    if-eqz v1, :cond_21

    .line 762
    .line 763
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    :cond_20
    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 772
    .line 773
    .line 774
    move-result v3

    .line 775
    if-eqz v3, :cond_21

    .line 776
    .line 777
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    move-result-object v3

    .line 781
    check-cast v3, Lw43;

    .line 782
    .line 783
    instance-of v4, v3, Lu43;

    .line 784
    .line 785
    if-eqz v4, :cond_20

    .line 786
    .line 787
    iget-object v4, v0, Lzj1;->q:[D

    .line 788
    .line 789
    array-length v5, v4

    .line 790
    const/4 v12, 0x1

    .line 791
    if-le v5, v12, :cond_20

    .line 792
    .line 793
    check-cast v3, Lu43;

    .line 794
    .line 795
    const/16 v19, 0x0

    .line 796
    .line 797
    aget-wide v7, v4, v19

    .line 798
    .line 799
    aget-wide v9, v4, v12

    .line 800
    .line 801
    invoke-virtual {v3, v2}, Lw43;->a(F)F

    .line 802
    .line 803
    .line 804
    move-result v3

    .line 805
    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->atan2(DD)D

    .line 806
    .line 807
    .line 808
    move-result-wide v4

    .line 809
    invoke-static {v4, v5}, Ljava/lang/Math;->toDegrees(D)D

    .line 810
    .line 811
    .line 812
    move-result-wide v4

    .line 813
    double-to-float v4, v4

    .line 814
    add-float/2addr v3, v4

    .line 815
    invoke-virtual {v6, v3}, Landroid/view/View;->setRotation(F)V

    .line 816
    .line 817
    .line 818
    goto :goto_12

    .line 819
    :cond_21
    if-eqz v21, :cond_22

    .line 820
    .line 821
    iget-object v1, v0, Lzj1;->q:[D

    .line 822
    .line 823
    const/16 v19, 0x0

    .line 824
    .line 825
    aget-wide v7, v1, v19

    .line 826
    .line 827
    const/16 v20, 0x1

    .line 828
    .line 829
    aget-wide v9, v1, v20

    .line 830
    .line 831
    move-wide/from16 v3, p2

    .line 832
    .line 833
    move-object/from16 v5, p4

    .line 834
    .line 835
    move-object/from16 v1, v21

    .line 836
    .line 837
    invoke-virtual/range {v1 .. v6}, Lc53;->a(FJLd31;Landroid/view/View;)F

    .line 838
    .line 839
    .line 840
    move-result v3

    .line 841
    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->atan2(DD)D

    .line 842
    .line 843
    .line 844
    move-result-wide v4

    .line 845
    invoke-static {v4, v5}, Ljava/lang/Math;->toDegrees(D)D

    .line 846
    .line 847
    .line 848
    move-result-wide v4

    .line 849
    double-to-float v4, v4

    .line 850
    add-float/2addr v3, v4

    .line 851
    invoke-virtual {v6, v3}, Landroid/view/View;->setRotation(F)V

    .line 852
    .line 853
    .line 854
    iget-boolean v1, v1, Lc53;->d:Z

    .line 855
    .line 856
    or-int v13, v29, v1

    .line 857
    .line 858
    goto :goto_13

    .line 859
    :cond_22
    move/from16 v13, v29

    .line 860
    .line 861
    :goto_13
    const/4 v12, 0x1

    .line 862
    :goto_14
    iget-object v1, v0, Lzj1;->j:[Lpy0;

    .line 863
    .line 864
    array-length v3, v1

    .line 865
    if-ge v12, v3, :cond_23

    .line 866
    .line 867
    aget-object v1, v1, v12

    .line 868
    .line 869
    iget-object v3, v0, Lzj1;->t:[F

    .line 870
    .line 871
    invoke-virtual {v1, v14, v15, v3}, Lpy0;->h0(D[F)V

    .line 872
    .line 873
    .line 874
    iget-object v1, v11, Lik1;->Y:Ljava/util/LinkedHashMap;

    .line 875
    .line 876
    iget-object v4, v0, Lzj1;->r:[Ljava/lang/String;

    .line 877
    .line 878
    add-int/lit8 v5, v12, -0x1

    .line 879
    .line 880
    aget-object v4, v4, v5

    .line 881
    .line 882
    invoke-virtual {v1, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    move-result-object v1

    .line 886
    check-cast v1, Lpz;

    .line 887
    .line 888
    invoke-static {v1, v6, v3}, Ljb1;->C(Lpz;Landroid/view/View;[F)V

    .line 889
    .line 890
    .line 891
    add-int/lit8 v12, v12, 0x1

    .line 892
    .line 893
    goto :goto_14

    .line 894
    :cond_23
    iget-object v1, v0, Lzj1;->h:Lxj1;

    .line 895
    .line 896
    iget v3, v1, Lxj1;->b:I

    .line 897
    .line 898
    if-nez v3, :cond_29

    .line 899
    .line 900
    cmpg-float v3, v2, v16

    .line 901
    .line 902
    if-gtz v3, :cond_24

    .line 903
    .line 904
    iget v1, v1, Lxj1;->c:I

    .line 905
    .line 906
    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    .line 907
    .line 908
    .line 909
    goto :goto_15

    .line 910
    :cond_24
    cmpl-float v3, v2, v18

    .line 911
    .line 912
    iget-object v4, v0, Lzj1;->i:Lxj1;

    .line 913
    .line 914
    if-ltz v3, :cond_25

    .line 915
    .line 916
    iget v1, v4, Lxj1;->c:I

    .line 917
    .line 918
    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    .line 919
    .line 920
    .line 921
    goto :goto_15

    .line 922
    :cond_25
    iget v3, v4, Lxj1;->c:I

    .line 923
    .line 924
    iget v1, v1, Lxj1;->c:I

    .line 925
    .line 926
    if-eq v3, v1, :cond_29

    .line 927
    .line 928
    const/4 v1, 0x0

    .line 929
    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    .line 930
    .line 931
    .line 932
    goto :goto_15

    .line 933
    :cond_26
    move-object/from16 v6, p5

    .line 934
    .line 935
    move/from16 v29, v13

    .line 936
    .line 937
    const/high16 p1, 0x3f000000    # 0.5f

    .line 938
    .line 939
    iget v1, v11, Lik1;->e:F

    .line 940
    .line 941
    iget-object v3, v0, Lzj1;->g:Lik1;

    .line 942
    .line 943
    iget v4, v3, Lik1;->e:F

    .line 944
    .line 945
    invoke-static {v4, v1, v2, v1}, Len;->g(FFFF)F

    .line 946
    .line 947
    .line 948
    move-result v1

    .line 949
    iget v4, v11, Lik1;->f:F

    .line 950
    .line 951
    iget v5, v3, Lik1;->f:F

    .line 952
    .line 953
    invoke-static {v5, v4, v2, v4}, Len;->g(FFFF)F

    .line 954
    .line 955
    .line 956
    move-result v4

    .line 957
    iget v5, v11, Lik1;->i:F

    .line 958
    .line 959
    iget v7, v3, Lik1;->i:F

    .line 960
    .line 961
    invoke-static {v7, v5, v2, v5}, Len;->g(FFFF)F

    .line 962
    .line 963
    .line 964
    move-result v8

    .line 965
    iget v9, v11, Lik1;->v:F

    .line 966
    .line 967
    iget v3, v3, Lik1;->v:F

    .line 968
    .line 969
    invoke-static {v3, v9, v2, v9}, Len;->g(FFFF)F

    .line 970
    .line 971
    .line 972
    move-result v10

    .line 973
    add-float v1, v1, p1

    .line 974
    .line 975
    float-to-int v11, v1

    .line 976
    add-float v4, v4, p1

    .line 977
    .line 978
    float-to-int v12, v4

    .line 979
    add-float/2addr v1, v8

    .line 980
    float-to-int v1, v1

    .line 981
    add-float/2addr v4, v10

    .line 982
    float-to-int v4, v4

    .line 983
    sub-int v8, v1, v11

    .line 984
    .line 985
    sub-int v10, v4, v12

    .line 986
    .line 987
    cmpl-float v5, v7, v5

    .line 988
    .line 989
    if-nez v5, :cond_27

    .line 990
    .line 991
    cmpl-float v3, v3, v9

    .line 992
    .line 993
    if-nez v3, :cond_27

    .line 994
    .line 995
    iget-boolean v3, v0, Lzj1;->d:Z

    .line 996
    .line 997
    if-eqz v3, :cond_28

    .line 998
    .line 999
    :cond_27
    const/high16 v9, 0x40000000    # 2.0f

    .line 1000
    .line 1001
    invoke-static {v8, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1002
    .line 1003
    .line 1004
    move-result v3

    .line 1005
    invoke-static {v10, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1006
    .line 1007
    .line 1008
    move-result v5

    .line 1009
    invoke-virtual {v6, v3, v5}, Landroid/view/View;->measure(II)V

    .line 1010
    .line 1011
    .line 1012
    const/4 v3, 0x0

    .line 1013
    iput-boolean v3, v0, Lzj1;->d:Z

    .line 1014
    .line 1015
    :cond_28
    invoke-virtual {v6, v11, v12, v1, v4}, Landroid/view/View;->layout(IIII)V

    .line 1016
    .line 1017
    .line 1018
    move/from16 v13, v29

    .line 1019
    .line 1020
    :cond_29
    :goto_15
    iget-object v1, v0, Lzj1;->z:Ljava/util/HashMap;

    .line 1021
    .line 1022
    if-eqz v1, :cond_2b

    .line 1023
    .line 1024
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v1

    .line 1028
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v1

    .line 1032
    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1033
    .line 1034
    .line 1035
    move-result v3

    .line 1036
    if-eqz v3, :cond_2b

    .line 1037
    .line 1038
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v3

    .line 1042
    check-cast v3, La43;

    .line 1043
    .line 1044
    instance-of v4, v3, Ly33;

    .line 1045
    .line 1046
    if-eqz v4, :cond_2a

    .line 1047
    .line 1048
    check-cast v3, Ly33;

    .line 1049
    .line 1050
    iget-object v4, v0, Lzj1;->q:[D

    .line 1051
    .line 1052
    const/16 v19, 0x0

    .line 1053
    .line 1054
    aget-wide v7, v4, v19

    .line 1055
    .line 1056
    const/16 v20, 0x1

    .line 1057
    .line 1058
    aget-wide v9, v4, v20

    .line 1059
    .line 1060
    invoke-virtual {v3, v2}, La43;->a(F)F

    .line 1061
    .line 1062
    .line 1063
    move-result v3

    .line 1064
    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->atan2(DD)D

    .line 1065
    .line 1066
    .line 1067
    move-result-wide v4

    .line 1068
    invoke-static {v4, v5}, Ljava/lang/Math;->toDegrees(D)D

    .line 1069
    .line 1070
    .line 1071
    move-result-wide v4

    .line 1072
    double-to-float v4, v4

    .line 1073
    add-float/2addr v3, v4

    .line 1074
    invoke-virtual {v6, v3}, Landroid/view/View;->setRotation(F)V

    .line 1075
    .line 1076
    .line 1077
    goto :goto_16

    .line 1078
    :cond_2a
    const/16 v19, 0x0

    .line 1079
    .line 1080
    const/16 v20, 0x1

    .line 1081
    .line 1082
    invoke-virtual {v3, v6, v2}, La43;->d(Landroid/view/View;F)V

    .line 1083
    .line 1084
    .line 1085
    goto :goto_16

    .line 1086
    :cond_2b
    return v13
.end method

.method public final f(Lik1;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lzj1;->b:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getX()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    float-to-int v0, v0

    .line 8
    int-to-float v0, v0

    .line 9
    iget-object v1, p0, Lzj1;->b:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/View;->getY()F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    float-to-int v1, v1

    .line 16
    int-to-float v1, v1

    .line 17
    iget-object v2, p0, Lzj1;->b:Landroid/view/View;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    int-to-float v2, v2

    .line 24
    iget-object p0, p0, Lzj1;->b:Landroid/view/View;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    int-to-float p0, p0

    .line 31
    invoke-virtual {p1, v0, v1, v2, p0}, Lik1;->d(FFFF)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final h(JII)V
    .locals 46

    move-object/from16 v0, p0

    .line 1
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 2
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 3
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 4
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 5
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 6
    iget v5, v0, Lzj1;->A:I

    iget-object v6, v0, Lzj1;->f:Lik1;

    const/4 v7, -0x1

    if-eq v5, v7, :cond_0

    .line 7
    iput v5, v6, Lik1;->U:I

    .line 8
    :cond_0
    iget-object v5, v0, Lzj1;->h:Lxj1;

    iget v8, v5, Lxj1;->a:F

    .line 9
    iget-object v9, v0, Lzj1;->i:Lxj1;

    iget v10, v9, Lxj1;->a:F

    invoke-static {v8, v10}, Lxj1;->b(FF)Z

    move-result v8

    const-string v10, "alpha"

    if-eqz v8, :cond_1

    .line 10
    invoke-virtual {v2, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 11
    :cond_1
    iget v8, v5, Lxj1;->d:F

    iget v11, v9, Lxj1;->d:F

    invoke-static {v8, v11}, Lxj1;->b(FF)Z

    move-result v8

    const-string v11, "elevation"

    if-eqz v8, :cond_2

    .line 12
    invoke-virtual {v2, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 13
    :cond_2
    iget v8, v5, Lxj1;->c:I

    iget v12, v9, Lxj1;->c:I

    if-eq v8, v12, :cond_4

    iget v13, v5, Lxj1;->b:I

    if-nez v13, :cond_4

    if-eqz v8, :cond_3

    if-nez v12, :cond_4

    .line 14
    :cond_3
    invoke-virtual {v2, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 15
    :cond_4
    iget v8, v5, Lxj1;->e:F

    iget v12, v9, Lxj1;->e:F

    invoke-static {v8, v12}, Lxj1;->b(FF)Z

    move-result v8

    const-string v12, "rotation"

    if-eqz v8, :cond_5

    .line 16
    invoke-virtual {v2, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 17
    :cond_5
    iget v8, v5, Lxj1;->Z:F

    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v8

    const-string v13, "transitionPathRotate"

    if-eqz v8, :cond_6

    iget v8, v9, Lxj1;->Z:F

    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v8

    if-nez v8, :cond_7

    .line 18
    :cond_6
    invoke-virtual {v2, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 19
    :cond_7
    iget v8, v5, Lxj1;->a0:F

    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v8

    const-string v14, "progress"

    if-eqz v8, :cond_8

    iget v8, v9, Lxj1;->a0:F

    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v8

    if-nez v8, :cond_9

    .line 20
    :cond_8
    invoke-virtual {v2, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 21
    :cond_9
    iget v8, v5, Lxj1;->f:F

    iget v15, v9, Lxj1;->f:F

    invoke-static {v8, v15}, Lxj1;->b(FF)Z

    move-result v8

    const-string v15, "rotationX"

    if-eqz v8, :cond_a

    .line 22
    invoke-virtual {v2, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 23
    :cond_a
    iget v8, v5, Lxj1;->i:F

    iget v7, v9, Lxj1;->i:F

    invoke-static {v8, v7}, Lxj1;->b(FF)Z

    move-result v7

    const-string v8, "rotationY"

    if-eqz v7, :cond_b

    .line 24
    invoke-virtual {v2, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 25
    :cond_b
    iget v7, v5, Lxj1;->U:F

    move-object/from16 v16, v1

    iget v1, v9, Lxj1;->U:F

    invoke-static {v7, v1}, Lxj1;->b(FF)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 26
    const-string v1, "transformPivotX"

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 27
    :cond_c
    iget v1, v5, Lxj1;->V:F

    iget v7, v9, Lxj1;->V:F

    invoke-static {v1, v7}, Lxj1;->b(FF)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 28
    const-string v1, "transformPivotY"

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 29
    :cond_d
    iget v1, v5, Lxj1;->v:F

    iget v7, v9, Lxj1;->v:F

    invoke-static {v1, v7}, Lxj1;->b(FF)Z

    move-result v1

    const-string v7, "scaleX"

    if-eqz v1, :cond_e

    .line 30
    invoke-virtual {v2, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 31
    :cond_e
    iget v1, v5, Lxj1;->w:F

    move-object/from16 v17, v3

    iget v3, v9, Lxj1;->w:F

    invoke-static {v1, v3}, Lxj1;->b(FF)Z

    move-result v1

    const-string v3, "scaleY"

    if-eqz v1, :cond_f

    .line 32
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 33
    :cond_f
    iget v1, v5, Lxj1;->W:F

    move-object/from16 v18, v15

    iget v15, v9, Lxj1;->W:F

    invoke-static {v1, v15}, Lxj1;->b(FF)Z

    move-result v1

    const-string v15, "translationX"

    if-eqz v1, :cond_10

    .line 34
    invoke-virtual {v2, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 35
    :cond_10
    iget v1, v5, Lxj1;->X:F

    move-object/from16 v19, v8

    iget v8, v9, Lxj1;->X:F

    invoke-static {v1, v8}, Lxj1;->b(FF)Z

    move-result v1

    const-string v8, "translationY"

    if-eqz v1, :cond_11

    .line 36
    invoke-virtual {v2, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 37
    :cond_11
    iget v1, v5, Lxj1;->Y:F

    move-object/from16 v20, v5

    iget v5, v9, Lxj1;->Y:F

    invoke-static {v1, v5}, Lxj1;->b(FF)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 38
    const-string v1, "translationZ"

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 39
    :cond_12
    iget-object v5, v0, Lzj1;->g:Lik1;

    iget-object v1, v0, Lzj1;->u:Ljava/util/ArrayList;

    move-object/from16 v22, v9

    iget-object v9, v0, Lzj1;->w:Ljava/util/ArrayList;

    move-object/from16 v23, v9

    if-eqz v23, :cond_31

    .line 40
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v26

    :goto_0
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->hasNext()Z

    move-result v27

    if-eqz v27, :cond_31

    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v27

    move-object/from16 v9, v27

    check-cast v9, La31;

    move-object/from16 v27, v15

    .line 41
    instance-of v15, v9, Ls31;

    if-eqz v15, :cond_2f

    .line 42
    check-cast v9, Ls31;

    .line 43
    new-instance v15, Lik1;

    .line 44
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    move-object/from16 v29, v8

    const/4 v8, 0x0

    .line 45
    iput v8, v15, Lik1;->b:I

    const/high16 v8, 0x7fc00000    # Float.NaN

    .line 46
    iput v8, v15, Lik1;->w:F

    const/4 v8, -0x1

    .line 47
    iput v8, v15, Lik1;->U:I

    .line 48
    iput v8, v15, Lik1;->V:I

    const/high16 v8, 0x7fc00000    # Float.NaN

    .line 49
    iput v8, v15, Lik1;->W:F

    const/4 v8, 0x0

    .line 50
    iput-object v8, v15, Lik1;->X:Lzj1;

    .line 51
    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v8, v15, Lik1;->Y:Ljava/util/LinkedHashMap;

    const/4 v8, 0x0

    .line 52
    iput v8, v15, Lik1;->Z:I

    move-object/from16 v31, v14

    const/16 v8, 0x12

    .line 53
    new-array v14, v8, [D

    iput-object v14, v15, Lik1;->a0:[D

    .line 54
    new-array v14, v8, [D

    iput-object v14, v15, Lik1;->b0:[D

    .line 55
    iget v8, v6, Lik1;->V:I

    const/4 v14, -0x1

    const/high16 v32, 0x42c80000    # 100.0f

    if-eq v8, v14, :cond_1d

    .line 56
    iget v8, v9, La31;->a:I

    int-to-float v8, v8

    div-float v8, v8, v32

    .line 57
    iput v8, v15, Lik1;->c:F

    .line 58
    iget v14, v9, Ls31;->h:I

    iput v14, v15, Lik1;->b:I

    .line 59
    iget v14, v9, Ls31;->m:I

    iput v14, v15, Lik1;->Z:I

    .line 60
    iget v14, v9, Ls31;->i:F

    invoke-static {v14}, Ljava/lang/Float;->isNaN(F)Z

    move-result v14

    if-eqz v14, :cond_13

    move v14, v8

    :goto_1
    move-object/from16 v33, v7

    goto :goto_2

    :cond_13
    iget v14, v9, Ls31;->i:F

    goto :goto_1

    .line 61
    :goto_2
    iget v7, v9, Ls31;->j:F

    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-eqz v7, :cond_14

    move v7, v8

    :goto_3
    move-object/from16 v34, v3

    goto :goto_4

    :cond_14
    iget v7, v9, Ls31;->j:F

    goto :goto_3

    .line 62
    :goto_4
    iget v3, v5, Lik1;->i:F

    move/from16 v30, v3

    iget v3, v6, Lik1;->i:F

    sub-float v30, v30, v3

    move/from16 v32, v3

    .line 63
    iget v3, v5, Lik1;->v:F

    move/from16 v35, v3

    iget v3, v6, Lik1;->v:F

    sub-float v35, v35, v3

    move/from16 v36, v3

    .line 64
    iget v3, v15, Lik1;->c:F

    iput v3, v15, Lik1;->d:F

    mul-float v30, v30, v14

    add-float v3, v30, v32

    float-to-int v3, v3

    int-to-float v3, v3

    .line 65
    iput v3, v15, Lik1;->i:F

    mul-float v35, v35, v7

    add-float v3, v35, v36

    float-to-int v3, v3

    int-to-float v3, v3

    .line 66
    iput v3, v15, Lik1;->v:F

    .line 67
    iget v3, v9, Ls31;->m:I

    move-object/from16 v35, v12

    .line 68
    iget v12, v9, Ls31;->k:F

    move/from16 v30, v12

    const/4 v12, 0x1

    if-eq v3, v12, :cond_1a

    const/4 v12, 0x2

    if-eq v3, v12, :cond_17

    .line 69
    invoke-static/range {v30 .. v30}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_15

    move v3, v8

    goto :goto_5

    :cond_15
    iget v3, v9, Ls31;->k:F

    :goto_5
    iget v7, v5, Lik1;->e:F

    iget v12, v6, Lik1;->e:F

    invoke-static {v7, v12, v3, v12}, Len;->g(FFFF)F

    move-result v3

    iput v3, v15, Lik1;->e:F

    .line 70
    iget v3, v9, Ls31;->l:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_16

    goto :goto_6

    :cond_16
    iget v8, v9, Ls31;->l:F

    :goto_6
    iget v3, v5, Lik1;->f:F

    iget v7, v6, Lik1;->f:F

    invoke-static {v3, v7, v8, v7}, Len;->g(FFFF)F

    move-result v3

    iput v3, v15, Lik1;->f:F

    goto :goto_b

    .line 71
    :cond_17
    invoke-static/range {v30 .. v30}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_18

    iget v3, v5, Lik1;->e:F

    iget v7, v6, Lik1;->e:F

    invoke-static {v3, v7, v8, v7}, Len;->g(FFFF)F

    move-result v3

    goto :goto_7

    :cond_18
    iget v3, v9, Ls31;->k:F

    invoke-static {v7, v14}, Ljava/lang/Math;->min(FF)F

    move-result v7

    mul-float/2addr v3, v7

    :goto_7
    iput v3, v15, Lik1;->e:F

    .line 72
    iget v3, v9, Ls31;->l:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_19

    iget v3, v5, Lik1;->f:F

    iget v7, v6, Lik1;->f:F

    invoke-static {v3, v7, v8, v7}, Len;->g(FFFF)F

    move-result v3

    goto :goto_8

    :cond_19
    iget v3, v9, Ls31;->l:F

    :goto_8
    iput v3, v15, Lik1;->f:F

    goto :goto_b

    .line 73
    :cond_1a
    invoke-static/range {v30 .. v30}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_1b

    move v3, v8

    goto :goto_9

    :cond_1b
    iget v3, v9, Ls31;->k:F

    :goto_9
    iget v7, v5, Lik1;->e:F

    iget v12, v6, Lik1;->e:F

    invoke-static {v7, v12, v3, v12}, Len;->g(FFFF)F

    move-result v3

    iput v3, v15, Lik1;->e:F

    .line 74
    iget v3, v9, Ls31;->l:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_1c

    goto :goto_a

    :cond_1c
    iget v8, v9, Ls31;->l:F

    :goto_a
    iget v3, v5, Lik1;->f:F

    iget v7, v6, Lik1;->f:F

    invoke-static {v3, v7, v8, v7}, Len;->g(FFFF)F

    move-result v3

    iput v3, v15, Lik1;->f:F

    .line 75
    :goto_b
    iget v3, v6, Lik1;->V:I

    iput v3, v15, Lik1;->V:I

    .line 76
    iget-object v3, v9, Ls31;->f:Ljava/lang/String;

    invoke-static {v3}, Lr4;->c(Ljava/lang/String;)Lr4;

    move-result-object v3

    iput-object v3, v15, Lik1;->a:Lr4;

    .line 77
    iget v3, v9, Ls31;->g:I

    iput v3, v15, Lik1;->U:I

    :goto_c
    move/from16 v8, p4

    goto/16 :goto_1b

    :cond_1d
    move-object/from16 v34, v3

    move-object/from16 v33, v7

    move-object/from16 v35, v12

    .line 78
    iget v3, v9, Ls31;->m:I

    .line 79
    iget v7, v9, La31;->a:I

    const/4 v14, 0x1

    if-eq v3, v14, :cond_29

    const/4 v14, 0x2

    if-eq v3, v14, :cond_24

    int-to-float v3, v7

    div-float v3, v3, v32

    .line 80
    iput v3, v15, Lik1;->c:F

    .line 81
    iget v7, v9, Ls31;->h:I

    iput v7, v15, Lik1;->b:I

    .line 82
    iget v7, v9, Ls31;->i:F

    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-eqz v7, :cond_1e

    move v7, v3

    goto :goto_d

    :cond_1e
    iget v7, v9, Ls31;->i:F

    .line 83
    :goto_d
    iget v14, v9, Ls31;->j:F

    invoke-static {v14}, Ljava/lang/Float;->isNaN(F)Z

    move-result v14

    if-eqz v14, :cond_1f

    move v14, v3

    goto :goto_e

    :cond_1f
    iget v14, v9, Ls31;->j:F

    .line 84
    :goto_e
    iget v8, v5, Lik1;->i:F

    const/high16 v37, 0x40000000    # 2.0f

    iget v12, v6, Lik1;->i:F

    sub-float v32, v8, v12

    move/from16 v38, v3

    .line 85
    iget v3, v5, Lik1;->v:F

    move/from16 v39, v3

    iget v3, v6, Lik1;->v:F

    sub-float v40, v39, v3

    move/from16 v41, v3

    .line 86
    iget v3, v15, Lik1;->c:F

    iput v3, v15, Lik1;->d:F

    .line 87
    iget v3, v6, Lik1;->e:F

    div-float v42, v12, v37

    add-float v42, v42, v3

    move/from16 v43, v3

    .line 88
    iget v3, v6, Lik1;->f:F

    div-float v44, v41, v37

    add-float v44, v44, v3

    move/from16 v45, v3

    .line 89
    iget v3, v5, Lik1;->e:F

    div-float v8, v8, v37

    add-float/2addr v8, v3

    .line 90
    iget v3, v5, Lik1;->f:F

    div-float v39, v39, v37

    add-float v39, v39, v3

    sub-float v8, v8, v42

    sub-float v39, v39, v44

    mul-float v3, v8, v38

    add-float v3, v3, v43

    mul-float v32, v32, v7

    div-float v7, v32, v37

    sub-float/2addr v3, v7

    float-to-int v3, v3

    int-to-float v3, v3

    .line 91
    iput v3, v15, Lik1;->e:F

    mul-float v3, v39, v38

    add-float v3, v3, v45

    mul-float v40, v40, v14

    div-float v14, v40, v37

    sub-float/2addr v3, v14

    float-to-int v3, v3

    int-to-float v3, v3

    .line 92
    iput v3, v15, Lik1;->f:F

    add-float v12, v12, v32

    float-to-int v3, v12

    int-to-float v3, v3

    .line 93
    iput v3, v15, Lik1;->i:F

    add-float v3, v41, v40

    float-to-int v3, v3

    int-to-float v3, v3

    .line 94
    iput v3, v15, Lik1;->v:F

    .line 95
    iget v3, v9, Ls31;->k:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_20

    move/from16 v3, v38

    :goto_f
    const/high16 v30, 0x7fc00000    # Float.NaN

    goto :goto_10

    :cond_20
    iget v3, v9, Ls31;->k:F

    goto :goto_f

    .line 96
    :goto_10
    invoke-static/range {v30 .. v30}, Ljava/lang/Float;->isNaN(F)Z

    move-result v12

    if-eqz v12, :cond_21

    const/4 v12, 0x0

    :goto_11
    move/from16 v32, v3

    goto :goto_12

    :cond_21
    move/from16 v12, v30

    goto :goto_11

    .line 97
    :goto_12
    iget v3, v9, Ls31;->l:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_22

    move/from16 v3, v38

    goto :goto_13

    :cond_22
    iget v3, v9, Ls31;->l:F

    .line 98
    :goto_13
    invoke-static/range {v30 .. v30}, Ljava/lang/Float;->isNaN(F)Z

    move-result v37

    if-eqz v37, :cond_23

    const/16 v30, 0x0

    :cond_23
    move/from16 v37, v3

    const/4 v3, 0x0

    .line 99
    iput v3, v15, Lik1;->Z:I

    .line 100
    iget v3, v6, Lik1;->e:F

    mul-float v32, v32, v8

    add-float v32, v32, v3

    mul-float v30, v30, v39

    add-float v30, v30, v32

    sub-float v3, v30, v7

    float-to-int v3, v3

    int-to-float v3, v3

    iput v3, v15, Lik1;->e:F

    .line 101
    iget v3, v6, Lik1;->f:F

    mul-float/2addr v8, v12

    add-float/2addr v8, v3

    mul-float v39, v39, v37

    add-float v39, v39, v8

    sub-float v3, v39, v14

    float-to-int v3, v3

    int-to-float v3, v3

    iput v3, v15, Lik1;->f:F

    .line 102
    iget-object v3, v9, Ls31;->f:Ljava/lang/String;

    invoke-static {v3}, Lr4;->c(Ljava/lang/String;)Lr4;

    move-result-object v3

    iput-object v3, v15, Lik1;->a:Lr4;

    .line 103
    iget v3, v9, Ls31;->g:I

    iput v3, v15, Lik1;->U:I

    goto/16 :goto_c

    :cond_24
    const/high16 v37, 0x40000000    # 2.0f

    int-to-float v3, v7

    div-float v3, v3, v32

    .line 104
    iput v3, v15, Lik1;->c:F

    .line 105
    iget v7, v9, Ls31;->h:I

    iput v7, v15, Lik1;->b:I

    .line 106
    iget v7, v9, Ls31;->i:F

    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-eqz v7, :cond_25

    move v7, v3

    goto :goto_14

    :cond_25
    iget v7, v9, Ls31;->i:F

    .line 107
    :goto_14
    iget v8, v9, Ls31;->j:F

    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v8

    if-eqz v8, :cond_26

    move v8, v3

    goto :goto_15

    :cond_26
    iget v8, v9, Ls31;->j:F

    .line 108
    :goto_15
    iget v12, v5, Lik1;->i:F

    iget v14, v6, Lik1;->i:F

    sub-float v30, v12, v14

    move/from16 v32, v3

    .line 109
    iget v3, v5, Lik1;->v:F

    move/from16 v36, v3

    iget v3, v6, Lik1;->v:F

    sub-float v38, v36, v3

    move/from16 v39, v3

    .line 110
    iget v3, v15, Lik1;->c:F

    iput v3, v15, Lik1;->d:F

    .line 111
    iget v3, v6, Lik1;->e:F

    div-float v40, v14, v37

    add-float v40, v40, v3

    move/from16 v41, v3

    .line 112
    iget v3, v6, Lik1;->f:F

    div-float v42, v39, v37

    add-float v42, v42, v3

    move/from16 v43, v3

    .line 113
    iget v3, v5, Lik1;->e:F

    div-float v12, v12, v37

    add-float/2addr v12, v3

    .line 114
    iget v3, v5, Lik1;->f:F

    div-float v36, v36, v37

    add-float v36, v36, v3

    sub-float v12, v12, v40

    sub-float v36, v36, v42

    mul-float v12, v12, v32

    add-float v12, v12, v41

    mul-float v30, v30, v7

    div-float v3, v30, v37

    sub-float/2addr v12, v3

    float-to-int v3, v12

    int-to-float v3, v3

    .line 115
    iput v3, v15, Lik1;->e:F

    mul-float v36, v36, v32

    add-float v36, v36, v43

    mul-float v38, v38, v8

    div-float v3, v38, v37

    sub-float v3, v36, v3

    float-to-int v3, v3

    int-to-float v3, v3

    .line 116
    iput v3, v15, Lik1;->f:F

    add-float v14, v14, v30

    float-to-int v3, v14

    int-to-float v3, v3

    .line 117
    iput v3, v15, Lik1;->i:F

    add-float v3, v39, v38

    float-to-int v3, v3

    int-to-float v3, v3

    .line 118
    iput v3, v15, Lik1;->v:F

    const/4 v12, 0x2

    .line 119
    iput v12, v15, Lik1;->Z:I

    .line 120
    iget v3, v9, Ls31;->k:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_27

    move/from16 v3, p3

    int-to-float v7, v3

    .line 121
    iget v8, v15, Lik1;->i:F

    sub-float/2addr v7, v8

    float-to-int v7, v7

    .line 122
    iget v8, v9, Ls31;->k:F

    int-to-float v7, v7

    mul-float/2addr v8, v7

    float-to-int v7, v8

    int-to-float v7, v7

    iput v7, v15, Lik1;->e:F

    goto :goto_16

    :cond_27
    move/from16 v3, p3

    .line 123
    :goto_16
    iget v7, v9, Ls31;->l:F

    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    move/from16 v8, p4

    if-nez v7, :cond_28

    int-to-float v7, v8

    .line 124
    iget v12, v15, Lik1;->v:F

    sub-float/2addr v7, v12

    float-to-int v7, v7

    .line 125
    iget v12, v9, Ls31;->l:F

    int-to-float v7, v7

    mul-float/2addr v12, v7

    float-to-int v7, v12

    int-to-float v7, v7

    iput v7, v15, Lik1;->f:F

    .line 126
    :cond_28
    iget v7, v15, Lik1;->V:I

    iput v7, v15, Lik1;->V:I

    .line 127
    iget-object v7, v9, Ls31;->f:Ljava/lang/String;

    invoke-static {v7}, Lr4;->c(Ljava/lang/String;)Lr4;

    move-result-object v7

    iput-object v7, v15, Lik1;->a:Lr4;

    .line 128
    iget v7, v9, Ls31;->g:I

    iput v7, v15, Lik1;->U:I

    goto/16 :goto_1b

    :cond_29
    move/from16 v3, p3

    move/from16 v8, p4

    const/high16 v37, 0x40000000    # 2.0f

    int-to-float v7, v7

    div-float v7, v7, v32

    .line 129
    iput v7, v15, Lik1;->c:F

    .line 130
    iget v12, v9, Ls31;->h:I

    iput v12, v15, Lik1;->b:I

    .line 131
    iget v12, v9, Ls31;->i:F

    invoke-static {v12}, Ljava/lang/Float;->isNaN(F)Z

    move-result v12

    if-eqz v12, :cond_2a

    move v12, v7

    goto :goto_17

    :cond_2a
    iget v12, v9, Ls31;->i:F

    .line 132
    :goto_17
    iget v14, v9, Ls31;->j:F

    invoke-static {v14}, Ljava/lang/Float;->isNaN(F)Z

    move-result v14

    if-eqz v14, :cond_2b

    move v14, v7

    goto :goto_18

    :cond_2b
    iget v14, v9, Ls31;->j:F

    .line 133
    :goto_18
    iget v3, v5, Lik1;->i:F

    move/from16 v30, v3

    iget v3, v6, Lik1;->i:F

    sub-float v3, v30, v3

    move/from16 v30, v3

    .line 134
    iget v3, v5, Lik1;->v:F

    move/from16 v32, v3

    iget v3, v6, Lik1;->v:F

    sub-float v3, v32, v3

    move/from16 v32, v3

    .line 135
    iget v3, v15, Lik1;->c:F

    iput v3, v15, Lik1;->d:F

    .line 136
    iget v3, v9, Ls31;->k:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_2c

    goto :goto_19

    :cond_2c
    iget v7, v9, Ls31;->k:F

    .line 137
    :goto_19
    iget v3, v6, Lik1;->e:F

    move/from16 v38, v3

    iget v3, v6, Lik1;->i:F

    div-float v39, v3, v37

    add-float v39, v39, v38

    move/from16 v40, v3

    .line 138
    iget v3, v6, Lik1;->f:F

    move/from16 v41, v3

    iget v3, v6, Lik1;->v:F

    div-float v42, v3, v37

    add-float v42, v42, v41

    move/from16 v43, v3

    .line 139
    iget v3, v5, Lik1;->e:F

    move/from16 v44, v3

    iget v3, v5, Lik1;->i:F

    div-float v3, v3, v37

    add-float v3, v3, v44

    move/from16 v44, v3

    .line 140
    iget v3, v5, Lik1;->f:F

    move/from16 v45, v3

    iget v3, v5, Lik1;->v:F

    div-float v3, v3, v37

    add-float v3, v3, v45

    sub-float v39, v44, v39

    sub-float v3, v3, v42

    mul-float v42, v39, v7

    add-float v38, v38, v42

    mul-float v12, v12, v30

    div-float v30, v12, v37

    move/from16 v44, v7

    sub-float v7, v38, v30

    float-to-int v7, v7

    int-to-float v7, v7

    .line 141
    iput v7, v15, Lik1;->e:F

    mul-float v7, v3, v44

    add-float v38, v41, v7

    mul-float v14, v14, v32

    div-float v32, v14, v37

    move/from16 v37, v7

    sub-float v7, v38, v32

    float-to-int v7, v7

    int-to-float v7, v7

    .line 142
    iput v7, v15, Lik1;->f:F

    add-float v7, v40, v12

    float-to-int v7, v7

    int-to-float v7, v7

    .line 143
    iput v7, v15, Lik1;->i:F

    add-float v7, v43, v14

    float-to-int v7, v7

    int-to-float v7, v7

    .line 144
    iput v7, v15, Lik1;->v:F

    .line 145
    iget v7, v9, Ls31;->l:F

    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-eqz v7, :cond_2d

    const/16 v36, 0x0

    goto :goto_1a

    :cond_2d
    iget v7, v9, Ls31;->l:F

    move/from16 v36, v7

    :goto_1a
    neg-float v3, v3

    mul-float v3, v3, v36

    mul-float v39, v39, v36

    const/4 v12, 0x1

    .line 146
    iput v12, v15, Lik1;->Z:I

    .line 147
    iget v7, v6, Lik1;->e:F

    add-float v7, v7, v42

    sub-float v7, v7, v30

    float-to-int v7, v7

    int-to-float v7, v7

    .line 148
    iget v12, v6, Lik1;->f:F

    add-float v12, v12, v37

    sub-float v12, v12, v32

    float-to-int v12, v12

    int-to-float v12, v12

    add-float/2addr v7, v3

    .line 149
    iput v7, v15, Lik1;->e:F

    add-float v12, v12, v39

    .line 150
    iput v12, v15, Lik1;->f:F

    .line 151
    iget v3, v15, Lik1;->V:I

    iput v3, v15, Lik1;->V:I

    .line 152
    iget-object v3, v9, Ls31;->f:Ljava/lang/String;

    invoke-static {v3}, Lr4;->c(Ljava/lang/String;)Lr4;

    move-result-object v3

    iput-object v3, v15, Lik1;->a:Lr4;

    .line 153
    iget v3, v9, Ls31;->g:I

    iput v3, v15, Lik1;->U:I

    .line 154
    :goto_1b
    invoke-static {v1, v15}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;)I

    move-result v3

    if-nez v3, :cond_2e

    .line 155
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v12, " KeyPath position \""

    invoke-direct {v7, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v12, v15, Lik1;->d:F

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v12, "\" outside of range"

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v12, "MotionController"

    invoke-static {v12, v7}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2e
    neg-int v3, v3

    const/16 v28, 0x1

    add-int/lit8 v3, v3, -0x1

    .line 156
    invoke-virtual {v1, v3, v15}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 157
    iget v3, v9, Ls31;->e:I

    const/4 v14, -0x1

    if-eq v3, v14, :cond_30

    .line 158
    iput v3, v0, Lzj1;->e:I

    goto :goto_1c

    :cond_2f
    move-object/from16 v34, v3

    move-object/from16 v33, v7

    move-object/from16 v29, v8

    move-object/from16 v35, v12

    move-object/from16 v31, v14

    move/from16 v8, p4

    .line 159
    invoke-virtual {v9, v4}, La31;->d(Ljava/util/HashMap;)V

    .line 160
    invoke-virtual {v9, v2}, La31;->b(Ljava/util/HashSet;)V

    :cond_30
    :goto_1c
    move-object/from16 v15, v27

    move-object/from16 v8, v29

    move-object/from16 v14, v31

    move-object/from16 v7, v33

    move-object/from16 v3, v34

    move-object/from16 v12, v35

    goto/16 :goto_0

    :cond_31
    move-object/from16 v34, v3

    move-object/from16 v33, v7

    move-object/from16 v29, v8

    move-object/from16 v35, v12

    move-object/from16 v31, v14

    move-object/from16 v27, v15

    .line 161
    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v3

    const-string v12, "CUSTOM,"

    const-string v7, ","

    if-nez v3, :cond_5e

    .line 162
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    iput-object v3, v0, Lzj1;->y:Ljava/util/HashMap;

    .line 163
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v30

    if-eqz v30, :cond_47

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v30

    move-object/from16 v9, v30

    check-cast v9, Ljava/lang/String;

    .line 164
    invoke-virtual {v9, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v30

    if-eqz v30, :cond_35

    .line 165
    new-instance v8, Landroid/util/SparseArray;

    invoke-direct {v8}, Landroid/util/SparseArray;-><init>()V

    .line 166
    invoke-virtual {v9, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v36

    const/16 v28, 0x1

    aget-object v15, v36, v28

    .line 167
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v36

    :goto_1e
    invoke-interface/range {v36 .. v36}, Ljava/util/Iterator;->hasNext()Z

    move-result v38

    if-eqz v38, :cond_34

    invoke-interface/range {v36 .. v36}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v38

    move-object/from16 v14, v38

    check-cast v14, La31;

    move-object/from16 v38, v1

    .line 168
    iget-object v1, v14, La31;->d:Ljava/util/HashMap;

    if-nez v1, :cond_33

    :cond_32
    :goto_1f
    move-object/from16 v1, v38

    goto :goto_1e

    .line 169
    :cond_33
    invoke-virtual {v1, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpz;

    if-eqz v1, :cond_32

    .line 170
    iget v14, v14, La31;->a:I

    invoke-virtual {v8, v14, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    goto :goto_1f

    :cond_34
    move-object/from16 v38, v1

    .line 171
    new-instance v1, Lt43;

    .line 172
    invoke-direct {v1}, Lw43;-><init>()V

    .line 173
    invoke-virtual {v9, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v14

    const/16 v28, 0x1

    aget-object v14, v14, v28

    .line 174
    iput-object v8, v1, Lt43;->f:Landroid/util/SparseArray;

    move-object/from16 v15, v31

    move-object/from16 v14, v33

    move-object/from16 v8, v34

    move-object/from16 v31, v3

    move-object/from16 v33, v12

    move-object/from16 v3, v29

    move-object/from16 v29, v2

    move-object/from16 v2, v27

    move-object/from16 v27, v6

    move-object/from16 v6, v19

    move-object/from16 v19, v5

    move-object/from16 v5, v18

    move-object/from16 v18, v7

    move-object v7, v1

    move-object/from16 v1, v35

    goto/16 :goto_2b

    :cond_35
    move-object/from16 v38, v1

    .line 175
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    :goto_20
    move-object/from16 v15, v31

    move-object/from16 v14, v33

    move-object/from16 v8, v34

    move-object/from16 v1, v35

    :goto_21
    move-object/from16 v31, v3

    :goto_22
    move-object/from16 v3, v29

    :goto_23
    move-object/from16 v29, v2

    move-object/from16 v2, v27

    :goto_24
    move-object/from16 v27, v6

    move-object/from16 v6, v19

    :goto_25
    move-object/from16 v19, v5

    move-object/from16 v5, v18

    :goto_26
    const/16 v18, -0x1

    goto/16 :goto_2a

    :sswitch_0
    const-string v1, "waveOffset"

    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_36

    goto :goto_20

    :cond_36
    const/16 v1, 0xf

    goto :goto_27

    :sswitch_1
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_37

    goto :goto_20

    :cond_37
    const/16 v1, 0xe

    goto :goto_27

    :sswitch_2
    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_38

    goto :goto_20

    :cond_38
    const/16 v1, 0xd

    goto :goto_27

    :sswitch_3
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_39

    goto :goto_20

    :cond_39
    const/16 v1, 0xc

    :goto_27
    move-object/from16 v15, v31

    move-object/from16 v14, v33

    move-object/from16 v8, v34

    move-object/from16 v31, v3

    move-object/from16 v3, v29

    move-object/from16 v29, v2

    move-object/from16 v2, v27

    move-object/from16 v27, v6

    move-object/from16 v6, v19

    move-object/from16 v19, v5

    move-object/from16 v5, v18

    move/from16 v18, v1

    move-object/from16 v1, v35

    goto/16 :goto_2a

    :sswitch_4
    move-object/from16 v1, v35

    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3a

    goto/16 :goto_29

    :cond_3a
    const/16 v8, 0xb

    goto :goto_28

    :sswitch_5
    move-object/from16 v1, v35

    const-string v8, "transformPivotY"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3b

    goto :goto_29

    :cond_3b
    const/16 v8, 0xa

    :goto_28
    move-object/from16 v15, v31

    move-object/from16 v14, v33

    move-object/from16 v31, v3

    move-object/from16 v3, v29

    move-object/from16 v29, v2

    move-object/from16 v2, v27

    move-object/from16 v27, v6

    move-object/from16 v6, v19

    move-object/from16 v19, v5

    move-object/from16 v5, v18

    move/from16 v18, v8

    move-object/from16 v8, v34

    goto/16 :goto_2a

    :sswitch_6
    move-object/from16 v1, v35

    const-string v8, "transformPivotX"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3c

    goto :goto_29

    :cond_3c
    move-object/from16 v15, v31

    move-object/from16 v14, v33

    move-object/from16 v8, v34

    move-object/from16 v31, v3

    move-object/from16 v3, v29

    move-object/from16 v29, v2

    move-object/from16 v2, v27

    move-object/from16 v27, v6

    move-object/from16 v6, v19

    move-object/from16 v19, v5

    move-object/from16 v5, v18

    const/16 v18, 0x9

    goto/16 :goto_2a

    :sswitch_7
    move-object/from16 v1, v35

    const-string v8, "waveVariesBy"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3d

    :goto_29
    move-object/from16 v15, v31

    move-object/from16 v14, v33

    move-object/from16 v8, v34

    goto/16 :goto_21

    :cond_3d
    move-object/from16 v15, v31

    move-object/from16 v14, v33

    move-object/from16 v8, v34

    move-object/from16 v31, v3

    move-object/from16 v3, v29

    move-object/from16 v29, v2

    move-object/from16 v2, v27

    move-object/from16 v27, v6

    move-object/from16 v6, v19

    move-object/from16 v19, v5

    move-object/from16 v5, v18

    const/16 v18, 0x8

    goto/16 :goto_2a

    :sswitch_8
    move-object/from16 v8, v34

    move-object/from16 v1, v35

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    move-object/from16 v15, v31

    if-nez v14, :cond_3e

    move-object/from16 v14, v33

    goto/16 :goto_21

    :cond_3e
    move-object/from16 v14, v33

    move-object/from16 v31, v3

    move-object/from16 v3, v29

    move-object/from16 v29, v2

    move-object/from16 v2, v27

    move-object/from16 v27, v6

    move-object/from16 v6, v19

    move-object/from16 v19, v5

    move-object/from16 v5, v18

    const/16 v18, 0x7

    goto/16 :goto_2a

    :sswitch_9
    move-object/from16 v14, v33

    move-object/from16 v8, v34

    move-object/from16 v1, v35

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_3f

    move-object/from16 v15, v31

    goto/16 :goto_21

    :cond_3f
    move-object/from16 v15, v31

    move-object/from16 v31, v3

    move-object/from16 v3, v29

    move-object/from16 v29, v2

    move-object/from16 v2, v27

    move-object/from16 v27, v6

    move-object/from16 v6, v19

    move-object/from16 v19, v5

    move-object/from16 v5, v18

    const/16 v18, 0x6

    goto/16 :goto_2a

    :sswitch_a
    move-object/from16 v15, v31

    move-object/from16 v14, v33

    move-object/from16 v8, v34

    move-object/from16 v1, v35

    invoke-virtual {v9, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v31

    if-nez v31, :cond_40

    goto/16 :goto_21

    :cond_40
    move-object/from16 v31, v3

    move-object/from16 v3, v29

    move-object/from16 v29, v2

    move-object/from16 v2, v27

    move-object/from16 v27, v6

    move-object/from16 v6, v19

    move-object/from16 v19, v5

    move-object/from16 v5, v18

    const/16 v18, 0x5

    goto/16 :goto_2a

    :sswitch_b
    move-object/from16 v15, v31

    move-object/from16 v14, v33

    move-object/from16 v8, v34

    move-object/from16 v1, v35

    move-object/from16 v31, v3

    const-string v3, "translationZ"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_41

    goto/16 :goto_22

    :cond_41
    move-object/from16 v3, v29

    move-object/from16 v29, v2

    move-object/from16 v2, v27

    move-object/from16 v27, v6

    move-object/from16 v6, v19

    move-object/from16 v19, v5

    move-object/from16 v5, v18

    const/16 v18, 0x4

    goto/16 :goto_2a

    :sswitch_c
    move-object/from16 v15, v31

    move-object/from16 v14, v33

    move-object/from16 v8, v34

    move-object/from16 v1, v35

    move-object/from16 v31, v3

    move-object/from16 v3, v29

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v29

    if-nez v29, :cond_42

    goto/16 :goto_23

    :cond_42
    move-object/from16 v29, v2

    move-object/from16 v2, v27

    move-object/from16 v27, v6

    move-object/from16 v6, v19

    move-object/from16 v19, v5

    move-object/from16 v5, v18

    const/16 v18, 0x3

    goto/16 :goto_2a

    :sswitch_d
    move-object/from16 v15, v31

    move-object/from16 v14, v33

    move-object/from16 v8, v34

    move-object/from16 v1, v35

    move-object/from16 v31, v3

    move-object/from16 v3, v29

    move-object/from16 v29, v2

    move-object/from16 v2, v27

    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v27

    if-nez v27, :cond_43

    goto/16 :goto_24

    :cond_43
    move-object/from16 v27, v6

    move-object/from16 v6, v19

    move-object/from16 v19, v5

    move-object/from16 v5, v18

    const/16 v18, 0x2

    goto :goto_2a

    :sswitch_e
    move-object/from16 v15, v31

    move-object/from16 v14, v33

    move-object/from16 v8, v34

    move-object/from16 v1, v35

    move-object/from16 v31, v3

    move-object/from16 v3, v29

    move-object/from16 v29, v2

    move-object/from16 v2, v27

    move-object/from16 v27, v6

    move-object/from16 v6, v19

    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-nez v19, :cond_44

    goto/16 :goto_25

    :cond_44
    move-object/from16 v19, v5

    move-object/from16 v5, v18

    const/16 v18, 0x1

    goto :goto_2a

    :sswitch_f
    move-object/from16 v15, v31

    move-object/from16 v14, v33

    move-object/from16 v8, v34

    move-object/from16 v1, v35

    move-object/from16 v31, v3

    move-object/from16 v3, v29

    move-object/from16 v29, v2

    move-object/from16 v2, v27

    move-object/from16 v27, v6

    move-object/from16 v6, v19

    move-object/from16 v19, v5

    move-object/from16 v5, v18

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-nez v18, :cond_45

    goto/16 :goto_26

    :cond_45
    const/16 v18, 0x0

    :goto_2a
    packed-switch v18, :pswitch_data_0

    move-object/from16 v18, v7

    move-object/from16 v33, v12

    const/4 v7, 0x0

    goto/16 :goto_2b

    :pswitch_0
    move-object/from16 v18, v7

    .line 176
    new-instance v7, Ls43;

    move-object/from16 v33, v12

    const/4 v12, 0x0

    .line 177
    invoke-direct {v7, v12}, Ls43;-><init>(I)V

    goto/16 :goto_2b

    :pswitch_1
    move-object/from16 v18, v7

    move-object/from16 v33, v12

    const/4 v12, 0x0

    .line 178
    new-instance v7, Ls43;

    .line 179
    invoke-direct {v7, v12}, Ls43;-><init>(I)V

    goto/16 :goto_2b

    :pswitch_2
    move-object/from16 v18, v7

    move-object/from16 v33, v12

    .line 180
    new-instance v7, Lu43;

    .line 181
    invoke-direct {v7}, Lw43;-><init>()V

    goto/16 :goto_2b

    :pswitch_3
    move-object/from16 v18, v7

    move-object/from16 v33, v12

    .line 182
    new-instance v7, Ls43;

    const/4 v12, 0x1

    .line 183
    invoke-direct {v7, v12}, Ls43;-><init>(I)V

    goto/16 :goto_2b

    :pswitch_4
    move-object/from16 v18, v7

    move-object/from16 v33, v12

    .line 184
    new-instance v7, Ls43;

    const/4 v12, 0x4

    .line 185
    invoke-direct {v7, v12}, Ls43;-><init>(I)V

    goto/16 :goto_2b

    :pswitch_5
    move-object/from16 v18, v7

    move-object/from16 v33, v12

    .line 186
    new-instance v7, Ls43;

    const/4 v12, 0x3

    .line 187
    invoke-direct {v7, v12}, Ls43;-><init>(I)V

    goto/16 :goto_2b

    :pswitch_6
    move-object/from16 v18, v7

    move-object/from16 v33, v12

    .line 188
    new-instance v7, Ls43;

    const/4 v12, 0x2

    .line 189
    invoke-direct {v7, v12}, Ls43;-><init>(I)V

    goto/16 :goto_2b

    :pswitch_7
    move-object/from16 v18, v7

    move-object/from16 v33, v12

    .line 190
    new-instance v7, Ls43;

    const/4 v12, 0x0

    .line 191
    invoke-direct {v7, v12}, Ls43;-><init>(I)V

    goto :goto_2b

    :pswitch_8
    move-object/from16 v18, v7

    move-object/from16 v33, v12

    const/4 v12, 0x0

    .line 192
    new-instance v7, Ls43;

    const/16 v12, 0x8

    .line 193
    invoke-direct {v7, v12}, Ls43;-><init>(I)V

    goto :goto_2b

    :pswitch_9
    move-object/from16 v18, v7

    move-object/from16 v33, v12

    .line 194
    new-instance v7, Ls43;

    const/4 v12, 0x7

    .line 195
    invoke-direct {v7, v12}, Ls43;-><init>(I)V

    goto :goto_2b

    :pswitch_a
    move-object/from16 v18, v7

    move-object/from16 v33, v12

    .line 196
    new-instance v7, Lv43;

    .line 197
    invoke-direct {v7}, Lw43;-><init>()V

    const/4 v12, 0x0

    .line 198
    iput-boolean v12, v7, Lv43;->f:Z

    goto :goto_2b

    :pswitch_b
    move-object/from16 v18, v7

    move-object/from16 v33, v12

    .line 199
    new-instance v7, Ls43;

    const/16 v12, 0xb

    .line 200
    invoke-direct {v7, v12}, Ls43;-><init>(I)V

    goto :goto_2b

    :pswitch_c
    move-object/from16 v18, v7

    move-object/from16 v33, v12

    .line 201
    new-instance v7, Ls43;

    const/16 v12, 0xa

    .line 202
    invoke-direct {v7, v12}, Ls43;-><init>(I)V

    goto :goto_2b

    :pswitch_d
    move-object/from16 v18, v7

    move-object/from16 v33, v12

    .line 203
    new-instance v7, Ls43;

    const/16 v12, 0x9

    .line 204
    invoke-direct {v7, v12}, Ls43;-><init>(I)V

    goto :goto_2b

    :pswitch_e
    move-object/from16 v18, v7

    move-object/from16 v33, v12

    .line 205
    new-instance v7, Ls43;

    const/4 v12, 0x6

    .line 206
    invoke-direct {v7, v12}, Ls43;-><init>(I)V

    goto :goto_2b

    :pswitch_f
    move-object/from16 v18, v7

    move-object/from16 v33, v12

    .line 207
    new-instance v7, Ls43;

    const/4 v12, 0x5

    .line 208
    invoke-direct {v7, v12}, Ls43;-><init>(I)V

    :goto_2b
    if-nez v7, :cond_46

    :goto_2c
    move-object/from16 v35, v1

    move-object/from16 v34, v8

    move-object/from16 v7, v18

    move-object/from16 v12, v33

    move-object/from16 v1, v38

    move-object/from16 v18, v5

    move-object/from16 v33, v14

    move-object/from16 v5, v19

    move-object/from16 v19, v6

    move-object/from16 v6, v27

    move-object/from16 v27, v2

    move-object/from16 v2, v29

    move-object/from16 v29, v3

    move-object/from16 v3, v31

    move-object/from16 v31, v15

    goto/16 :goto_1d

    .line 209
    :cond_46
    iput-object v9, v7, Lw43;->e:Ljava/lang/String;

    .line 210
    iget-object v12, v0, Lzj1;->y:Ljava/util/HashMap;

    invoke-virtual {v12, v9, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2c

    :cond_47
    move-object/from16 v38, v1

    move-object/from16 v3, v29

    move-object/from16 v15, v31

    move-object/from16 v14, v33

    move-object/from16 v8, v34

    move-object/from16 v1, v35

    move-object/from16 v29, v2

    move-object/from16 v33, v12

    move-object/from16 v2, v27

    move-object/from16 v27, v6

    move-object/from16 v6, v19

    move-object/from16 v19, v5

    move-object/from16 v5, v18

    move-object/from16 v18, v7

    if-eqz v23, :cond_5a

    .line 211
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La31;

    .line 212
    instance-of v12, v9, Lc31;

    if-eqz v12, :cond_59

    .line 213
    iget-object v12, v0, Lzj1;->y:Ljava/util/HashMap;

    check-cast v9, Lc31;

    .line 214
    invoke-virtual {v12}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v31

    invoke-interface/range {v31 .. v31}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v31

    :goto_2e
    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->hasNext()Z

    move-result v34

    if-eqz v34, :cond_59

    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v34

    move-object/from16 v35, v7

    move-object/from16 v7, v34

    check-cast v7, Ljava/lang/String;

    .line 215
    invoke-virtual {v12, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v34

    move-object/from16 v36, v12

    move-object/from16 v12, v34

    check-cast v12, Lw43;

    if-nez v12, :cond_48

    :goto_2f
    move-object/from16 v7, v35

    move-object/from16 v12, v36

    goto :goto_2e

    :cond_48
    move-object/from16 v34, v4

    .line 216
    const-string v4, "CUSTOM"

    invoke-virtual {v7, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4a

    const/4 v4, 0x7

    .line 217
    invoke-virtual {v7, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 218
    iget-object v4, v9, La31;->d:Ljava/util/HashMap;

    invoke-virtual {v4, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpz;

    if-eqz v4, :cond_49

    .line 219
    check-cast v12, Lt43;

    iget v7, v9, La31;->a:I

    .line 220
    iget-object v12, v12, Lt43;->f:Landroid/util/SparseArray;

    invoke-virtual {v12, v7, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    :cond_49
    :goto_30
    move-object/from16 v4, v34

    goto :goto_2f

    .line 221
    :cond_4a
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_1

    :goto_31
    const/4 v4, -0x1

    goto/16 :goto_32

    :sswitch_10
    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4b

    goto :goto_31

    :cond_4b
    const/16 v4, 0xd

    goto/16 :goto_32

    :sswitch_11
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4c

    goto :goto_31

    :cond_4c
    const/16 v4, 0xc

    goto/16 :goto_32

    :sswitch_12
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4d

    goto :goto_31

    :cond_4d
    const/16 v4, 0xb

    goto/16 :goto_32

    :sswitch_13
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4e

    goto :goto_31

    :cond_4e
    const/16 v4, 0xa

    goto/16 :goto_32

    :sswitch_14
    const-string v4, "transformPivotY"

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4f

    goto :goto_31

    :cond_4f
    const/16 v4, 0x9

    goto/16 :goto_32

    :sswitch_15
    const-string v4, "transformPivotX"

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_50

    goto :goto_31

    :cond_50
    const/16 v4, 0x8

    goto :goto_32

    :sswitch_16
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_51

    goto :goto_31

    :cond_51
    const/4 v4, 0x7

    goto :goto_32

    :sswitch_17
    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_52

    goto :goto_31

    :cond_52
    const/4 v4, 0x6

    goto :goto_32

    :sswitch_18
    invoke-virtual {v7, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_53

    goto :goto_31

    :cond_53
    const/4 v4, 0x5

    goto :goto_32

    :sswitch_19
    const-string v4, "translationZ"

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_54

    goto :goto_31

    :cond_54
    const/4 v4, 0x4

    goto :goto_32

    :sswitch_1a
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_55

    goto :goto_31

    :cond_55
    const/4 v4, 0x3

    goto :goto_32

    :sswitch_1b
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_56

    goto :goto_31

    :cond_56
    const/4 v4, 0x2

    goto :goto_32

    :sswitch_1c
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_57

    goto/16 :goto_31

    :cond_57
    const/4 v4, 0x1

    goto :goto_32

    :sswitch_1d
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_58

    goto/16 :goto_31

    :cond_58
    const/4 v4, 0x0

    :goto_32
    packed-switch v4, :pswitch_data_1

    goto/16 :goto_30

    .line 222
    :pswitch_10
    iget v4, v9, Lc31;->f:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_49

    .line 223
    iget v4, v9, La31;->a:I

    iget v7, v9, Lc31;->f:F

    invoke-virtual {v12, v7, v4}, Lw43;->b(FI)V

    goto/16 :goto_30

    .line 224
    :pswitch_11
    iget v4, v9, Lc31;->m:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_49

    .line 225
    iget v4, v9, La31;->a:I

    iget v7, v9, Lc31;->m:F

    invoke-virtual {v12, v7, v4}, Lw43;->b(FI)V

    goto/16 :goto_30

    .line 226
    :pswitch_12
    iget v4, v9, Lc31;->g:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_49

    .line 227
    iget v4, v9, La31;->a:I

    iget v7, v9, Lc31;->g:F

    invoke-virtual {v12, v7, v4}, Lw43;->b(FI)V

    goto/16 :goto_30

    .line 228
    :pswitch_13
    iget v4, v9, Lc31;->h:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_49

    .line 229
    iget v4, v9, La31;->a:I

    iget v7, v9, Lc31;->h:F

    invoke-virtual {v12, v7, v4}, Lw43;->b(FI)V

    goto/16 :goto_30

    .line 230
    :pswitch_14
    iget v4, v9, Lc31;->j:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_49

    .line 231
    iget v4, v9, La31;->a:I

    iget v7, v9, Lc31;->l:F

    invoke-virtual {v12, v7, v4}, Lw43;->b(FI)V

    goto/16 :goto_30

    .line 232
    :pswitch_15
    iget v4, v9, Lc31;->i:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_49

    .line 233
    iget v4, v9, La31;->a:I

    iget v7, v9, Lc31;->k:F

    invoke-virtual {v12, v7, v4}, Lw43;->b(FI)V

    goto/16 :goto_30

    .line 234
    :pswitch_16
    iget v4, v9, Lc31;->o:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_49

    .line 235
    iget v4, v9, La31;->a:I

    iget v7, v9, Lc31;->o:F

    invoke-virtual {v12, v7, v4}, Lw43;->b(FI)V

    goto/16 :goto_30

    .line 236
    :pswitch_17
    iget v4, v9, Lc31;->n:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_49

    .line 237
    iget v4, v9, La31;->a:I

    iget v7, v9, Lc31;->n:F

    invoke-virtual {v12, v7, v4}, Lw43;->b(FI)V

    goto/16 :goto_30

    .line 238
    :pswitch_18
    iget v4, v9, Lc31;->s:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_49

    .line 239
    iget v4, v9, La31;->a:I

    iget v7, v9, Lc31;->s:F

    invoke-virtual {v12, v7, v4}, Lw43;->b(FI)V

    goto/16 :goto_30

    .line 240
    :pswitch_19
    iget v4, v9, Lc31;->r:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_49

    .line 241
    iget v4, v9, La31;->a:I

    iget v7, v9, Lc31;->r:F

    invoke-virtual {v12, v7, v4}, Lw43;->b(FI)V

    goto/16 :goto_30

    .line 242
    :pswitch_1a
    iget v4, v9, Lc31;->q:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_49

    .line 243
    iget v4, v9, La31;->a:I

    iget v7, v9, Lc31;->q:F

    invoke-virtual {v12, v7, v4}, Lw43;->b(FI)V

    goto/16 :goto_30

    .line 244
    :pswitch_1b
    iget v4, v9, Lc31;->p:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_49

    .line 245
    iget v4, v9, La31;->a:I

    iget v7, v9, Lc31;->p:F

    invoke-virtual {v12, v7, v4}, Lw43;->b(FI)V

    goto/16 :goto_30

    .line 246
    :pswitch_1c
    iget v4, v9, Lc31;->j:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_49

    .line 247
    iget v4, v9, La31;->a:I

    iget v7, v9, Lc31;->j:F

    invoke-virtual {v12, v7, v4}, Lw43;->b(FI)V

    goto/16 :goto_30

    .line 248
    :pswitch_1d
    iget v4, v9, Lc31;->i:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_49

    .line 249
    iget v4, v9, La31;->a:I

    iget v7, v9, Lc31;->i:F

    invoke-virtual {v12, v7, v4}, Lw43;->b(FI)V

    goto/16 :goto_30

    :cond_59
    move-object/from16 v34, v4

    move-object/from16 v35, v7

    move-object/from16 v4, v34

    move-object/from16 v7, v35

    goto/16 :goto_2d

    :cond_5a
    move-object/from16 v34, v4

    .line 250
    iget-object v4, v0, Lzj1;->y:Ljava/util/HashMap;

    move-object/from16 v7, v20

    const/4 v12, 0x0

    invoke-virtual {v7, v12, v4}, Lxj1;->a(ILjava/util/HashMap;)V

    .line 251
    iget-object v4, v0, Lzj1;->y:Ljava/util/HashMap;

    const/16 v7, 0x64

    move-object/from16 v9, v22

    invoke-virtual {v9, v7, v4}, Lxj1;->a(ILjava/util/HashMap;)V

    .line 252
    iget-object v4, v0, Lzj1;->y:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_33
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    move-object/from16 v9, v34

    .line 253
    invoke-virtual {v9, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5b

    .line 254
    invoke-virtual {v9, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    if-eqz v12, :cond_5b

    .line 255
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    :goto_34
    move-object/from16 v20, v4

    goto :goto_35

    :cond_5b
    const/4 v12, 0x0

    goto :goto_34

    .line 256
    :goto_35
    iget-object v4, v0, Lzj1;->y:Ljava/util/HashMap;

    invoke-virtual {v4, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lw43;

    if-eqz v4, :cond_5c

    .line 257
    invoke-virtual {v4, v12}, Lw43;->d(I)V

    :cond_5c
    move-object/from16 v34, v9

    move-object/from16 v4, v20

    goto :goto_33

    :cond_5d
    move-object/from16 v9, v34

    goto :goto_36

    :cond_5e
    move-object/from16 v38, v1

    move-object v9, v4

    move-object/from16 v3, v29

    move-object/from16 v15, v31

    move-object/from16 v14, v33

    move-object/from16 v8, v34

    move-object/from16 v1, v35

    move-object/from16 v29, v2

    move-object/from16 v33, v12

    move-object/from16 v2, v27

    move-object/from16 v27, v6

    move-object/from16 v6, v19

    move-object/from16 v19, v5

    move-object/from16 v5, v18

    move-object/from16 v18, v7

    .line 258
    :goto_36
    invoke-virtual/range {v16 .. v16}, Ljava/util/HashSet;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_75

    .line 259
    iget-object v4, v0, Lzj1;->x:Ljava/util/HashMap;

    if-nez v4, :cond_5f

    .line 260
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    iput-object v4, v0, Lzj1;->x:Ljava/util/HashMap;

    .line 261
    :cond_5f
    invoke-virtual/range {v16 .. v16}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_37
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_72

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 262
    iget-object v12, v0, Lzj1;->x:Ljava/util/HashMap;

    invoke-virtual {v12, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_60

    goto :goto_37

    :cond_60
    move-object/from16 v12, v33

    .line 263
    invoke-virtual {v7, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v16

    if-eqz v16, :cond_64

    move-object/from16 v16, v4

    .line 264
    new-instance v4, Landroid/util/SparseArray;

    invoke-direct {v4}, Landroid/util/SparseArray;-><init>()V

    move-object/from16 v33, v12

    move-object/from16 v12, v18

    .line 265
    invoke-virtual {v7, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v18

    move-object/from16 v34, v9

    const/16 v28, 0x1

    aget-object v9, v18, v28

    .line 266
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_38
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_63

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v0, v20

    check-cast v0, La31;

    move-object/from16 v20, v5

    .line 267
    iget-object v5, v0, La31;->d:Ljava/util/HashMap;

    if-nez v5, :cond_62

    :cond_61
    :goto_39
    move-object/from16 v0, p0

    move-object/from16 v5, v20

    goto :goto_38

    .line 268
    :cond_62
    invoke-virtual {v5, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpz;

    if-eqz v5, :cond_61

    .line 269
    iget v0, v0, La31;->a:I

    invoke-virtual {v4, v0, v5}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    goto :goto_39

    :cond_63
    move-object/from16 v20, v5

    .line 270
    new-instance v0, Lz43;

    .line 271
    invoke-direct {v0}, Lc53;-><init>()V

    .line 272
    new-instance v5, Landroid/util/SparseArray;

    invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V

    iput-object v5, v0, Lz43;->i:Landroid/util/SparseArray;

    .line 273
    invoke-virtual {v7, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    const/16 v28, 0x1

    aget-object v5, v5, v28

    iput-object v5, v0, Lz43;->g:Ljava/lang/String;

    .line 274
    iput-object v4, v0, Lz43;->h:Landroid/util/SparseArray;

    move-object v4, v10

    move-object/from16 v5, v20

    :goto_3a
    move-wide/from16 v9, p1

    goto/16 :goto_41

    :cond_64
    move-object/from16 v16, v4

    move-object/from16 v20, v5

    move-object/from16 v34, v9

    move-object/from16 v33, v12

    move-object/from16 v12, v18

    .line 275
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_2

    :goto_3b
    move-object/from16 v5, v20

    :goto_3c
    const/4 v0, -0x1

    goto/16 :goto_3e

    :sswitch_1e
    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_65

    goto :goto_3b

    :cond_65
    const/16 v0, 0xb

    goto :goto_3d

    :sswitch_1f
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_66

    goto :goto_3b

    :cond_66
    const/16 v0, 0xa

    :goto_3d
    move-object/from16 v5, v20

    goto/16 :goto_3e

    :sswitch_20
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_67

    goto :goto_3b

    :cond_67
    move-object/from16 v5, v20

    const/16 v0, 0x9

    goto/16 :goto_3e

    :sswitch_21
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_68

    goto :goto_3b

    :cond_68
    move-object/from16 v5, v20

    const/16 v0, 0x8

    goto/16 :goto_3e

    :sswitch_22
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_69

    goto :goto_3b

    :cond_69
    move-object/from16 v5, v20

    const/4 v0, 0x7

    goto :goto_3e

    :sswitch_23
    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6a

    goto :goto_3b

    :cond_6a
    move-object/from16 v5, v20

    const/4 v0, 0x6

    goto :goto_3e

    :sswitch_24
    invoke-virtual {v7, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6b

    goto :goto_3b

    :cond_6b
    move-object/from16 v5, v20

    const/4 v0, 0x5

    goto :goto_3e

    :sswitch_25
    const-string v0, "translationZ"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6c

    goto :goto_3b

    :cond_6c
    move-object/from16 v5, v20

    const/4 v0, 0x4

    goto :goto_3e

    :sswitch_26
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6d

    goto :goto_3b

    :cond_6d
    move-object/from16 v5, v20

    const/4 v0, 0x3

    goto :goto_3e

    :sswitch_27
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6e

    goto :goto_3b

    :cond_6e
    move-object/from16 v5, v20

    const/4 v0, 0x2

    goto :goto_3e

    :sswitch_28
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6f

    goto/16 :goto_3b

    :cond_6f
    move-object/from16 v5, v20

    const/4 v0, 0x1

    goto :goto_3e

    :sswitch_29
    move-object/from16 v5, v20

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_70

    goto/16 :goto_3c

    :cond_70
    const/4 v0, 0x0

    :goto_3e
    packed-switch v0, :pswitch_data_2

    move-object v4, v10

    const/4 v0, 0x0

    goto/16 :goto_3a

    .line 276
    :pswitch_1e
    new-instance v0, Ly43;

    const/4 v4, 0x0

    .line 277
    invoke-direct {v0, v4}, Ly43;-><init>(I)V

    :goto_3f
    move-object v4, v10

    move-wide/from16 v9, p1

    goto :goto_40

    .line 278
    :pswitch_1f
    new-instance v0, La53;

    .line 279
    invoke-direct {v0}, Lc53;-><init>()V

    goto :goto_3f

    .line 280
    :pswitch_20
    new-instance v0, Ly43;

    const/4 v4, 0x1

    .line 281
    invoke-direct {v0, v4}, Ly43;-><init>(I)V

    goto :goto_3f

    .line 282
    :pswitch_21
    new-instance v0, Ly43;

    const/4 v4, 0x2

    .line 283
    invoke-direct {v0, v4}, Ly43;-><init>(I)V

    goto :goto_3f

    .line 284
    :pswitch_22
    new-instance v0, Ly43;

    const/4 v4, 0x6

    .line 285
    invoke-direct {v0, v4}, Ly43;-><init>(I)V

    goto :goto_3f

    .line 286
    :pswitch_23
    new-instance v0, Ly43;

    const/4 v4, 0x5

    .line 287
    invoke-direct {v0, v4}, Ly43;-><init>(I)V

    goto :goto_3f

    .line 288
    :pswitch_24
    new-instance v0, Lb53;

    .line 289
    invoke-direct {v0}, Lc53;-><init>()V

    const/4 v4, 0x0

    .line 290
    iput-boolean v4, v0, Lb53;->g:Z

    goto :goto_3f

    .line 291
    :pswitch_25
    new-instance v0, Ly43;

    const/16 v4, 0x9

    .line 292
    invoke-direct {v0, v4}, Ly43;-><init>(I)V

    goto :goto_3f

    :pswitch_26
    const/16 v4, 0x9

    .line 293
    new-instance v0, Ly43;

    const/16 v9, 0x8

    .line 294
    invoke-direct {v0, v9}, Ly43;-><init>(I)V

    goto :goto_3f

    :pswitch_27
    const/16 v4, 0x9

    const/16 v9, 0x8

    .line 295
    new-instance v0, Ly43;

    const/4 v4, 0x7

    .line 296
    invoke-direct {v0, v4}, Ly43;-><init>(I)V

    goto :goto_3f

    :pswitch_28
    const/4 v4, 0x7

    const/16 v9, 0x8

    .line 297
    new-instance v0, Ly43;

    const/4 v4, 0x4

    .line 298
    invoke-direct {v0, v4}, Ly43;-><init>(I)V

    goto :goto_3f

    :pswitch_29
    const/16 v9, 0x8

    .line 299
    new-instance v0, Ly43;

    const/4 v4, 0x3

    .line 300
    invoke-direct {v0, v4}, Ly43;-><init>(I)V

    goto :goto_3f

    .line 301
    :goto_40
    iput-wide v9, v0, Lc53;->e:J

    :goto_41
    if-nez v0, :cond_71

    move-object/from16 v0, p0

    move-object v10, v4

    move-object/from16 v18, v12

    move-object/from16 v4, v16

    move-object/from16 v9, v34

    goto/16 :goto_37

    .line 302
    :cond_71
    iput-object v7, v0, Lc53;->b:Ljava/lang/String;

    move-object/from16 v35, v1

    move-object/from16 v18, v2

    move-object/from16 v1, p0

    .line 303
    iget-object v2, v1, Lzj1;->x:Ljava/util/HashMap;

    invoke-virtual {v2, v7, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v1

    move-object v10, v4

    move-object/from16 v4, v16

    move-object/from16 v2, v18

    move-object/from16 v9, v34

    move-object/from16 v1, v35

    move-object/from16 v18, v12

    goto/16 :goto_37

    :cond_72
    move-object v1, v0

    move-object/from16 v34, v9

    if-eqz v23, :cond_73

    .line 304
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_42
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_73

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La31;

    goto :goto_42

    .line 305
    :cond_73
    iget-object v0, v1, Lzj1;->x:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_43
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_76

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v9, v34

    .line 306
    invoke-virtual {v9, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_74

    .line 307
    invoke-virtual {v9, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_44

    :cond_74
    const/4 v3, 0x0

    .line 308
    :goto_44
    iget-object v4, v1, Lzj1;->x:Ljava/util/HashMap;

    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc53;

    invoke-virtual {v2, v3}, Lc53;->c(I)V

    move-object/from16 v34, v9

    goto :goto_43

    :cond_75
    move-object v1, v0

    .line 309
    :cond_76
    invoke-virtual/range {v38 .. v38}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v2, v0, 0x2

    new-array v3, v2, [Lik1;

    const/4 v12, 0x0

    .line 310
    aput-object v27, v3, v12

    const/16 v28, 0x1

    add-int/lit8 v0, v0, 0x1

    .line 311
    aput-object v19, v3, v0

    .line 312
    invoke-virtual/range {v38 .. v38}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_77

    iget v0, v1, Lzj1;->e:I

    const/4 v14, -0x1

    if-ne v0, v14, :cond_77

    .line 313
    iput v12, v1, Lzj1;->e:I

    .line 314
    :cond_77
    invoke-virtual/range {v38 .. v38}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v4, 0x1

    :goto_45
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_78

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lik1;

    add-int/lit8 v6, v4, 0x1

    .line 315
    aput-object v5, v3, v4

    move v4, v6

    goto :goto_45

    .line 316
    :cond_78
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    move-object/from16 v4, v19

    .line 317
    iget-object v4, v4, Lik1;->Y:Ljava/util/LinkedHashMap;

    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_46
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    move-object/from16 v6, v27

    .line 318
    iget-object v7, v6, Lik1;->Y:Ljava/util/LinkedHashMap;

    invoke-virtual {v7, v5}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_79

    .line 319
    new-instance v7, Ljava/lang/StringBuilder;

    move-object/from16 v12, v33

    invoke-direct {v7, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v8, v29

    invoke-virtual {v8, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7a

    .line 320
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_47

    :cond_79
    move-object/from16 v8, v29

    move-object/from16 v12, v33

    :cond_7a
    :goto_47
    move-object/from16 v27, v6

    move-object/from16 v29, v8

    move-object/from16 v33, v12

    goto :goto_46

    :cond_7b
    const/4 v5, 0x0

    .line 321
    new-array v4, v5, [Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, v1, Lzj1;->r:[Ljava/lang/String;

    .line 322
    array-length v0, v0

    new-array v0, v0, [I

    iput-object v0, v1, Lzj1;->s:[I

    const/4 v0, 0x0

    .line 323
    :goto_48
    iget-object v4, v1, Lzj1;->r:[Ljava/lang/String;

    array-length v5, v4

    if-ge v0, v5, :cond_7e

    .line 324
    aget-object v4, v4, v0

    .line 325
    iget-object v5, v1, Lzj1;->s:[I

    const/16 v25, 0x0

    aput v25, v5, v0

    const/4 v5, 0x0

    :goto_49
    if-ge v5, v2, :cond_7d

    .line 326
    aget-object v6, v3, v5

    iget-object v6, v6, Lik1;->Y:Ljava/util/LinkedHashMap;

    invoke-virtual {v6, v4}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7c

    .line 327
    aget-object v6, v3, v5

    iget-object v6, v6, Lik1;->Y:Ljava/util/LinkedHashMap;

    invoke-virtual {v6, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpz;

    if-eqz v6, :cond_7c

    .line 328
    iget-object v4, v1, Lzj1;->s:[I

    aget v5, v4, v0

    invoke-virtual {v6}, Lpz;->c()I

    move-result v6

    add-int/2addr v6, v5

    aput v6, v4, v0

    goto :goto_4a

    :cond_7c
    add-int/lit8 v5, v5, 0x1

    goto :goto_49

    :cond_7d
    :goto_4a
    add-int/lit8 v0, v0, 0x1

    goto :goto_48

    :cond_7e
    const/16 v25, 0x0

    .line 329
    aget-object v0, v3, v25

    iget v0, v0, Lik1;->U:I

    const/4 v14, -0x1

    if-eq v0, v14, :cond_7f

    const/4 v0, 0x1

    goto :goto_4b

    :cond_7f
    const/4 v0, 0x0

    .line 330
    :goto_4b
    array-length v4, v4

    const/16 v21, 0x12

    add-int v4, v21, v4

    new-array v5, v4, [Z

    const/4 v6, 0x1

    :goto_4c
    if-ge v6, v2, :cond_80

    .line 331
    aget-object v7, v3, v6

    add-int/lit8 v8, v6, -0x1

    aget-object v8, v3, v8

    .line 332
    iget v9, v7, Lik1;->e:F

    .line 333
    iget v10, v8, Lik1;->e:F

    invoke-static {v9, v10}, Lik1;->b(FF)Z

    move-result v9

    .line 334
    iget v10, v7, Lik1;->f:F

    iget v11, v8, Lik1;->f:F

    invoke-static {v10, v11}, Lik1;->b(FF)Z

    move-result v10

    const/16 v25, 0x0

    .line 335
    aget-boolean v11, v5, v25

    iget v12, v7, Lik1;->d:F

    iget v13, v8, Lik1;->d:F

    invoke-static {v12, v13}, Lik1;->b(FF)Z

    move-result v12

    or-int/2addr v11, v12

    aput-boolean v11, v5, v25

    const/16 v28, 0x1

    .line 336
    aget-boolean v11, v5, v28

    or-int/2addr v9, v10

    or-int/2addr v9, v0

    or-int v10, v11, v9

    aput-boolean v10, v5, v28

    const/16 v24, 0x2

    .line 337
    aget-boolean v10, v5, v24

    or-int/2addr v9, v10

    aput-boolean v9, v5, v24

    const/16 v37, 0x3

    .line 338
    aget-boolean v9, v5, v37

    iget v10, v7, Lik1;->i:F

    iget v11, v8, Lik1;->i:F

    invoke-static {v10, v11}, Lik1;->b(FF)Z

    move-result v10

    or-int/2addr v9, v10

    aput-boolean v9, v5, v37

    const/16 v39, 0x4

    .line 339
    aget-boolean v9, v5, v39

    iget v7, v7, Lik1;->v:F

    iget v8, v8, Lik1;->v:F

    invoke-static {v7, v8}, Lik1;->b(FF)Z

    move-result v7

    or-int/2addr v7, v9

    aput-boolean v7, v5, v39

    add-int/lit8 v6, v6, 0x1

    goto :goto_4c

    :cond_80
    const/4 v0, 0x0

    const/4 v6, 0x1

    :goto_4d
    if-ge v6, v4, :cond_82

    .line 340
    aget-boolean v7, v5, v6

    if-eqz v7, :cond_81

    add-int/lit8 v0, v0, 0x1

    :cond_81
    add-int/lit8 v6, v6, 0x1

    goto :goto_4d

    .line 341
    :cond_82
    new-array v6, v0, [I

    iput-object v6, v1, Lzj1;->o:[I

    const/4 v12, 0x2

    .line 342
    invoke-static {v12, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 343
    new-array v6, v0, [D

    iput-object v6, v1, Lzj1;->p:[D

    .line 344
    new-array v0, v0, [D

    iput-object v0, v1, Lzj1;->q:[D

    const/4 v0, 0x0

    const/4 v6, 0x1

    :goto_4e
    if-ge v6, v4, :cond_84

    .line 345
    aget-boolean v7, v5, v6

    if-eqz v7, :cond_83

    .line 346
    iget-object v7, v1, Lzj1;->o:[I

    add-int/lit8 v8, v0, 0x1

    aput v6, v7, v0

    move v0, v8

    :cond_83
    add-int/lit8 v6, v6, 0x1

    goto :goto_4e

    .line 347
    :cond_84
    iget-object v0, v1, Lzj1;->o:[I

    array-length v0, v0

    const/4 v12, 0x2

    new-array v4, v12, [I

    const/16 v28, 0x1

    aput v0, v4, v28

    const/16 v25, 0x0

    aput v2, v4, v25

    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[D

    .line 348
    new-array v5, v2, [D

    const/4 v6, 0x0

    :goto_4f
    if-ge v6, v2, :cond_87

    .line 349
    aget-object v7, v3, v6

    aget-object v8, v4, v6

    iget-object v9, v1, Lzj1;->o:[I

    .line 350
    iget v10, v7, Lik1;->d:F

    .line 351
    iget v11, v7, Lik1;->e:F

    iget v12, v7, Lik1;->f:F

    iget v13, v7, Lik1;->i:F

    iget v14, v7, Lik1;->v:F

    iget v7, v7, Lik1;->w:F

    move-object/from16 v16, v3

    const/4 v15, 0x6

    new-array v3, v15, [F

    const/16 v25, 0x0

    aput v10, v3, v25

    const/16 v28, 0x1

    aput v11, v3, v28

    const/16 v24, 0x2

    aput v12, v3, v24

    const/16 v37, 0x3

    aput v13, v3, v37

    const/16 v39, 0x4

    aput v14, v3, v39

    const/4 v12, 0x5

    aput v7, v3, v12

    const/4 v7, 0x0

    const/4 v10, 0x0

    .line 352
    :goto_50
    array-length v11, v9

    if-ge v7, v11, :cond_86

    .line 353
    aget v11, v9, v7

    if-ge v11, v15, :cond_85

    add-int/lit8 v13, v10, 0x1

    .line 354
    aget v11, v3, v11

    float-to-double v14, v11

    aput-wide v14, v8, v10

    move v10, v13

    :cond_85
    add-int/lit8 v7, v7, 0x1

    const/4 v15, 0x6

    goto :goto_50

    .line 355
    :cond_86
    aget-object v3, v16, v6

    iget v3, v3, Lik1;->c:F

    float-to-double v7, v3

    aput-wide v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v3, v16

    goto :goto_4f

    :cond_87
    move-object/from16 v16, v3

    const/4 v3, 0x0

    .line 356
    :goto_51
    iget-object v6, v1, Lzj1;->o:[I

    array-length v7, v6

    if-ge v3, v7, :cond_89

    .line 357
    aget v6, v6, v3

    const/4 v12, 0x6

    if-ge v6, v12, :cond_88

    .line 358
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v1, Lzj1;->o:[I

    aget v7, v7, v3

    sget-object v8, Lik1;->c0:[Ljava/lang/String;

    aget-object v7, v8, v7

    const-string v8, " ["

    .line 359
    invoke-static {v6, v7, v8}, Lfm0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    :goto_52
    if-ge v7, v2, :cond_88

    invoke-static {v6}, Len;->p(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 360
    aget-object v8, v4, v7

    aget-wide v9, v8, v3

    invoke-virtual {v6, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v7, v7, 0x1

    goto :goto_52

    :cond_88
    add-int/lit8 v3, v3, 0x1

    goto :goto_51

    .line 361
    :cond_89
    iget-object v3, v1, Lzj1;->r:[Ljava/lang/String;

    array-length v3, v3

    const/16 v28, 0x1

    add-int/lit8 v3, v3, 0x1

    new-array v3, v3, [Lpy0;

    iput-object v3, v1, Lzj1;->j:[Lpy0;

    const/4 v3, 0x0

    .line 362
    :goto_53
    iget-object v6, v1, Lzj1;->r:[Ljava/lang/String;

    array-length v7, v6

    if-ge v3, v7, :cond_91

    .line 363
    aget-object v6, v6, v3

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_54
    if-ge v7, v2, :cond_90

    .line 364
    aget-object v11, v16, v7

    .line 365
    iget-object v11, v11, Lik1;->Y:Ljava/util/LinkedHashMap;

    .line 366
    invoke-virtual {v11, v6}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8f

    if-nez v10, :cond_8b

    .line 367
    new-array v9, v2, [D

    .line 368
    aget-object v10, v16, v7

    .line 369
    iget-object v10, v10, Lik1;->Y:Ljava/util/LinkedHashMap;

    .line 370
    invoke-virtual {v10, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpz;

    if-nez v10, :cond_8a

    const/4 v10, 0x0

    :goto_55
    const/4 v12, 0x2

    goto :goto_56

    .line 371
    :cond_8a
    invoke-virtual {v10}, Lpz;->c()I

    move-result v10

    goto :goto_55

    .line 372
    :goto_56
    new-array v11, v12, [I

    const/16 v28, 0x1

    aput v10, v11, v28

    const/16 v25, 0x0

    aput v2, v11, v25

    invoke-static {v0, v11}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [[D

    .line 373
    :cond_8b
    aget-object v11, v16, v7

    iget v12, v11, Lik1;->c:F

    float-to-double v12, v12

    aput-wide v12, v9, v8

    .line 374
    aget-object v12, v10, v8

    .line 375
    iget-object v11, v11, Lik1;->Y:Ljava/util/LinkedHashMap;

    invoke-virtual {v11, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpz;

    if-nez v11, :cond_8c

    goto :goto_57

    .line 376
    :cond_8c
    invoke-virtual {v11}, Lpz;->c()I

    move-result v13

    const/4 v14, 0x1

    if-ne v13, v14, :cond_8e

    .line 377
    invoke-virtual {v11}, Lpz;->a()F

    move-result v11

    float-to-double v13, v11

    const/16 v25, 0x0

    aput-wide v13, v12, v25

    :cond_8d
    :goto_57
    move/from16 v19, v3

    move-object/from16 p1, v6

    move/from16 v20, v7

    goto :goto_59

    .line 378
    :cond_8e
    invoke-virtual {v11}, Lpz;->c()I

    move-result v13

    .line 379
    new-array v14, v13, [F

    .line 380
    invoke-virtual {v11, v14}, Lpz;->b([F)V

    const/4 v11, 0x0

    const/4 v15, 0x0

    :goto_58
    if-ge v11, v13, :cond_8d

    add-int/lit8 v18, v15, 0x1

    move/from16 v19, v3

    .line 381
    aget v3, v14, v11

    move-object/from16 p1, v6

    move/from16 v20, v7

    float-to-double v6, v3

    aput-wide v6, v12, v15

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v6, p1

    move/from16 v15, v18

    move/from16 v3, v19

    move/from16 v7, v20

    goto :goto_58

    :goto_59
    add-int/lit8 v8, v8, 0x1

    goto :goto_5a

    :cond_8f
    move/from16 v19, v3

    move-object/from16 p1, v6

    move/from16 v20, v7

    :goto_5a
    add-int/lit8 v7, v20, 0x1

    move-object/from16 v6, p1

    move/from16 v3, v19

    goto/16 :goto_54

    :cond_90
    move/from16 v19, v3

    .line 382
    invoke-static {v9, v8}, Ljava/util/Arrays;->copyOf([DI)[D

    move-result-object v3

    .line 383
    invoke-static {v10, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [[D

    .line 384
    iget-object v7, v1, Lzj1;->j:[Lpy0;

    add-int/lit8 v8, v19, 0x1

    iget v9, v1, Lzj1;->e:I

    invoke-static {v9, v3, v6}, Lpy0;->V(I[D[[D)Lpy0;

    move-result-object v3

    aput-object v3, v7, v8

    move v3, v8

    goto/16 :goto_53

    .line 385
    :cond_91
    iget-object v3, v1, Lzj1;->j:[Lpy0;

    iget v6, v1, Lzj1;->e:I

    invoke-static {v6, v5, v4}, Lpy0;->V(I[D[[D)Lpy0;

    move-result-object v4

    const/16 v25, 0x0

    aput-object v4, v3, v25

    .line 386
    aget-object v3, v16, v25

    iget v3, v3, Lik1;->U:I

    const/4 v14, -0x1

    if-eq v3, v14, :cond_93

    .line 387
    new-array v3, v2, [I

    .line 388
    new-array v4, v2, [D

    const/4 v12, 0x2

    .line 389
    new-array v5, v12, [I

    const/16 v28, 0x1

    aput v12, v5, v28

    aput v2, v5, v25

    invoke-static {v0, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[D

    const/4 v8, 0x0

    :goto_5b
    if-ge v8, v2, :cond_92

    .line 390
    aget-object v5, v16, v8

    iget v6, v5, Lik1;->U:I

    aput v6, v3, v8

    .line 391
    iget v6, v5, Lik1;->c:F

    float-to-double v6, v6

    aput-wide v6, v4, v8

    .line 392
    aget-object v6, v0, v8

    iget v7, v5, Lik1;->e:F

    float-to-double v9, v7

    const/16 v25, 0x0

    aput-wide v9, v6, v25

    .line 393
    iget v5, v5, Lik1;->f:F

    float-to-double v9, v5

    const/16 v28, 0x1

    aput-wide v9, v6, v28

    add-int/lit8 v8, v8, 0x1

    goto :goto_5b

    .line 394
    :cond_92
    new-instance v2, Lwc;

    invoke-direct {v2, v3, v4, v0}, Lwc;-><init>([I[D[[D)V

    .line 395
    iput-object v2, v1, Lzj1;->k:Lwc;

    .line 396
    :cond_93
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, v1, Lzj1;->z:Ljava/util/HashMap;

    if-eqz v23, :cond_97

    .line 397
    invoke-virtual/range {v17 .. v17}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_95

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 398
    invoke-static {v2}, La43;->c(Ljava/lang/String;)La43;

    move-result-object v3

    if-nez v3, :cond_94

    goto :goto_5c

    .line 399
    :cond_94
    iput-object v2, v3, La43;->b:Ljava/lang/String;

    .line 400
    iget-object v4, v1, Lzj1;->z:Ljava/util/HashMap;

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5c

    .line 401
    :cond_95
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_96

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La31;

    goto :goto_5d

    .line 402
    :cond_96
    iget-object v0, v1, Lzj1;->z:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_97

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La43;

    .line 403
    invoke-virtual {v1}, La43;->e()V

    goto :goto_5e

    :cond_97
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4a771f66 -> :sswitch_f
        -0x4a771f65 -> :sswitch_e
        -0x490b9c39 -> :sswitch_d
        -0x490b9c38 -> :sswitch_c
        -0x490b9c37 -> :sswitch_b
        -0x3bab3dd3 -> :sswitch_a
        -0x3621dfb2 -> :sswitch_9
        -0x3621dfb1 -> :sswitch_8
        -0x2f893320 -> :sswitch_7
        -0x2d5a2d1e -> :sswitch_6
        -0x2d5a2d1d -> :sswitch_5
        -0x266f082 -> :sswitch_4
        -0x42d1a3 -> :sswitch_3
        0x2382115 -> :sswitch_2
        0x589b15e -> :sswitch_1
        0x94e04ec -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x4a771f66 -> :sswitch_1d
        -0x4a771f65 -> :sswitch_1c
        -0x490b9c39 -> :sswitch_1b
        -0x490b9c38 -> :sswitch_1a
        -0x490b9c37 -> :sswitch_19
        -0x3bab3dd3 -> :sswitch_18
        -0x3621dfb2 -> :sswitch_17
        -0x3621dfb1 -> :sswitch_16
        -0x2d5a2d1e -> :sswitch_15
        -0x2d5a2d1d -> :sswitch_14
        -0x266f082 -> :sswitch_13
        -0x42d1a3 -> :sswitch_12
        0x2382115 -> :sswitch_11
        0x589b15e -> :sswitch_10
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x4a771f66 -> :sswitch_29
        -0x4a771f65 -> :sswitch_28
        -0x490b9c39 -> :sswitch_27
        -0x490b9c38 -> :sswitch_26
        -0x490b9c37 -> :sswitch_25
        -0x3bab3dd3 -> :sswitch_24
        -0x3621dfb2 -> :sswitch_23
        -0x3621dfb1 -> :sswitch_22
        -0x266f082 -> :sswitch_21
        -0x42d1a3 -> :sswitch_20
        0x2382115 -> :sswitch_1f
        0x589b15e -> :sswitch_1e
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, " start: x: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lzj1;->f:Lik1;

    .line 9
    .line 10
    iget v2, v1, Lik1;->e:F

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v2, " y: "

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget v1, v1, Lik1;->f:F

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, " end: x: "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lzj1;->g:Lik1;

    .line 31
    .line 32
    iget v1, p0, Lik1;->e:F

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget p0, p0, Lik1;->f:F

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

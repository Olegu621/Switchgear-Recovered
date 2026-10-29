.class public final Lnw;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public A:Landroid/graphics/Typeface;

.field public B:Landroid/graphics/Typeface;

.field public C:Landroid/graphics/Typeface;

.field public D:Landroid/graphics/Typeface;

.field public E:Lbr;

.field public F:Lbr;

.field public G:Ljava/lang/CharSequence;

.field public H:Ljava/lang/CharSequence;

.field public I:Z

.field public J:Z

.field public K:Landroid/graphics/Bitmap;

.field public L:F

.field public M:F

.field public N:F

.field public O:F

.field public P:F

.field public Q:I

.field public R:[I

.field public S:Z

.field public final T:Landroid/text/TextPaint;

.field public final U:Landroid/text/TextPaint;

.field public V:Landroid/animation/TimeInterpolator;

.field public W:Landroid/animation/TimeInterpolator;

.field public X:F

.field public Y:F

.field public Z:F

.field public final a:Landroid/view/ViewGroup;

.field public a0:Landroid/content/res/ColorStateList;

.field public b:Z

.field public b0:F

.field public c:F

.field public c0:F

.field public d:Z

.field public d0:F

.field public e:F

.field public e0:Landroid/content/res/ColorStateList;

.field public f:F

.field public f0:F

.field public g:I

.field public g0:F

.field public final h:Landroid/graphics/Rect;

.field public h0:F

.field public final i:Landroid/graphics/Rect;

.field public i0:Landroid/text/StaticLayout;

.field public final j:Landroid/graphics/RectF;

.field public j0:F

.field public k:I

.field public k0:F

.field public l:I

.field public l0:F

.field public m:F

.field public m0:Ljava/lang/CharSequence;

.field public n:F

.field public n0:I

.field public o:Landroid/content/res/ColorStateList;

.field public o0:F

.field public p:Landroid/content/res/ColorStateList;

.field public p0:F

.field public q:I

.field public q0:I

.field public r:F

.field public s:F

.field public t:F

.field public u:F

.field public v:F

.field public w:F

.field public x:Landroid/graphics/Typeface;

.field public y:Landroid/graphics/Typeface;

.field public z:Landroid/graphics/Typeface;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x10

    .line 5
    .line 6
    iput v0, p0, Lnw;->k:I

    .line 7
    .line 8
    iput v0, p0, Lnw;->l:I

    .line 9
    .line 10
    const/high16 v0, 0x41700000    # 15.0f

    .line 11
    .line 12
    iput v0, p0, Lnw;->m:F

    .line 13
    .line 14
    iput v0, p0, Lnw;->n:F

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lnw;->J:Z

    .line 18
    .line 19
    iput v0, p0, Lnw;->n0:I

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput v1, p0, Lnw;->o0:F

    .line 23
    .line 24
    const/high16 v1, 0x3f800000    # 1.0f

    .line 25
    .line 26
    iput v1, p0, Lnw;->p0:F

    .line 27
    .line 28
    iput v0, p0, Lnw;->q0:I

    .line 29
    .line 30
    iput-object p1, p0, Lnw;->a:Landroid/view/ViewGroup;

    .line 31
    .line 32
    new-instance v0, Landroid/text/TextPaint;

    .line 33
    .line 34
    const/16 v2, 0x81

    .line 35
    .line 36
    invoke-direct {v0, v2}, Landroid/text/TextPaint;-><init>(I)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lnw;->T:Landroid/text/TextPaint;

    .line 40
    .line 41
    new-instance v2, Landroid/text/TextPaint;

    .line 42
    .line 43
    invoke-direct {v2, v0}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    .line 44
    .line 45
    .line 46
    iput-object v2, p0, Lnw;->U:Landroid/text/TextPaint;

    .line 47
    .line 48
    new-instance v0, Landroid/graphics/Rect;

    .line 49
    .line 50
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lnw;->i:Landroid/graphics/Rect;

    .line 54
    .line 55
    new-instance v0, Landroid/graphics/Rect;

    .line 56
    .line 57
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lnw;->h:Landroid/graphics/Rect;

    .line 61
    .line 62
    new-instance v0, Landroid/graphics/RectF;

    .line 63
    .line 64
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Lnw;->j:Landroid/graphics/RectF;

    .line 68
    .line 69
    iget v0, p0, Lnw;->e:F

    .line 70
    .line 71
    const/high16 v2, 0x3f000000    # 0.5f

    .line 72
    .line 73
    invoke-static {v1, v0, v2, v0}, Len;->g(FFFF)F

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iput v0, p0, Lnw;->f:F

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p0, p1}, Lnw;->h(Landroid/content/res/Configuration;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public static a(IFI)I
    .locals 5

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    sub-float/2addr v0, p1

    .line 4
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    int-to-float v1, v1

    .line 9
    mul-float/2addr v1, v0

    .line 10
    invoke-static {p2}, Landroid/graphics/Color;->alpha(I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    int-to-float v2, v2

    .line 15
    mul-float/2addr v2, p1

    .line 16
    add-float/2addr v2, v1

    .line 17
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    int-to-float v1, v1

    .line 22
    mul-float/2addr v1, v0

    .line 23
    invoke-static {p2}, Landroid/graphics/Color;->red(I)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    int-to-float v3, v3

    .line 28
    mul-float/2addr v3, p1

    .line 29
    add-float/2addr v3, v1

    .line 30
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    int-to-float v1, v1

    .line 35
    mul-float/2addr v1, v0

    .line 36
    invoke-static {p2}, Landroid/graphics/Color;->green(I)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    int-to-float v4, v4

    .line 41
    mul-float/2addr v4, p1

    .line 42
    add-float/2addr v4, v1

    .line 43
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    int-to-float p0, p0

    .line 48
    mul-float/2addr p0, v0

    .line 49
    invoke-static {p2}, Landroid/graphics/Color;->blue(I)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    int-to-float p2, p2

    .line 54
    mul-float/2addr p2, p1

    .line 55
    add-float/2addr p2, p0

    .line 56
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    invoke-static {p0, p1, v0, p2}, Landroid/graphics/Color;->argb(IIII)I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    return p0
.end method

.method public static g(FFFLandroid/animation/TimeInterpolator;)F
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-interface {p3, p2}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    :cond_0
    invoke-static {p0, p1, p2}, Lu8;->a(FFF)F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method


# virtual methods
.method public final b(Ljava/lang/CharSequence;)Z
    .locals 2

    .line 1
    sget-object v0, Le33;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    iget-object v0, p0, Lnw;->a:Landroid/view/ViewGroup;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    iget-boolean p0, p0, Lnw;->J:Z

    .line 15
    .line 16
    if-eqz p0, :cond_2

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    sget-object p0, Len2;->d:Lzr3;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    sget-object p0, Len2;->c:Lzr3;

    .line 24
    .line 25
    :goto_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p0, p1, v0}, Lzr3;->i(Ljava/lang/CharSequence;I)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :cond_2
    return v1
.end method

.method public final c(FZ)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lnw;->G:Ljava/lang/CharSequence;

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    goto/16 :goto_8

    .line 10
    .line 11
    :cond_0
    iget-object v2, v0, Lnw;->i:Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    int-to-float v2, v2

    .line 18
    iget-object v3, v0, Lnw;->h:Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    int-to-float v3, v3

    .line 25
    const/high16 v4, 0x3f800000    # 1.0f

    .line 26
    .line 27
    sub-float v5, v1, v4

    .line 28
    .line 29
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const v6, 0x3727c5ac    # 1.0E-5f

    .line 34
    .line 35
    .line 36
    cmpg-float v5, v5, v6

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v9, 0x1

    .line 41
    if-gez v5, :cond_2

    .line 42
    .line 43
    iget v1, v0, Lnw;->n:F

    .line 44
    .line 45
    iget v3, v0, Lnw;->f0:F

    .line 46
    .line 47
    iput v4, v0, Lnw;->L:F

    .line 48
    .line 49
    iget-object v5, v0, Lnw;->D:Landroid/graphics/Typeface;

    .line 50
    .line 51
    iget-object v6, v0, Lnw;->x:Landroid/graphics/Typeface;

    .line 52
    .line 53
    if-eq v5, v6, :cond_1

    .line 54
    .line 55
    iput-object v6, v0, Lnw;->D:Landroid/graphics/Typeface;

    .line 56
    .line 57
    move v5, v9

    .line 58
    goto :goto_3

    .line 59
    :cond_1
    move v5, v8

    .line 60
    goto :goto_3

    .line 61
    :cond_2
    iget v5, v0, Lnw;->m:F

    .line 62
    .line 63
    iget v10, v0, Lnw;->g0:F

    .line 64
    .line 65
    iget-object v11, v0, Lnw;->D:Landroid/graphics/Typeface;

    .line 66
    .line 67
    iget-object v12, v0, Lnw;->A:Landroid/graphics/Typeface;

    .line 68
    .line 69
    if-eq v11, v12, :cond_3

    .line 70
    .line 71
    iput-object v12, v0, Lnw;->D:Landroid/graphics/Typeface;

    .line 72
    .line 73
    move v11, v9

    .line 74
    goto :goto_0

    .line 75
    :cond_3
    move v11, v8

    .line 76
    :goto_0
    sub-float v12, v1, v7

    .line 77
    .line 78
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    .line 79
    .line 80
    .line 81
    move-result v12

    .line 82
    cmpg-float v6, v12, v6

    .line 83
    .line 84
    if-gez v6, :cond_4

    .line 85
    .line 86
    iput v4, v0, Lnw;->L:F

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    iget v6, v0, Lnw;->m:F

    .line 90
    .line 91
    iget v12, v0, Lnw;->n:F

    .line 92
    .line 93
    iget-object v13, v0, Lnw;->W:Landroid/animation/TimeInterpolator;

    .line 94
    .line 95
    invoke-static {v6, v12, v1, v13}, Lnw;->g(FFFLandroid/animation/TimeInterpolator;)F

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    iget v6, v0, Lnw;->m:F

    .line 100
    .line 101
    div-float/2addr v1, v6

    .line 102
    iput v1, v0, Lnw;->L:F

    .line 103
    .line 104
    :goto_1
    iget v1, v0, Lnw;->n:F

    .line 105
    .line 106
    iget v6, v0, Lnw;->m:F

    .line 107
    .line 108
    div-float/2addr v1, v6

    .line 109
    mul-float v6, v3, v1

    .line 110
    .line 111
    if-eqz p2, :cond_6

    .line 112
    .line 113
    :cond_5
    move v2, v3

    .line 114
    :goto_2
    move v1, v5

    .line 115
    move v3, v10

    .line 116
    move v5, v11

    .line 117
    goto :goto_3

    .line 118
    :cond_6
    cmpl-float v6, v6, v2

    .line 119
    .line 120
    if-lez v6, :cond_5

    .line 121
    .line 122
    div-float/2addr v2, v1

    .line 123
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    move v2, v1

    .line 128
    goto :goto_2

    .line 129
    :goto_3
    cmpl-float v6, v2, v7

    .line 130
    .line 131
    if-lez v6, :cond_b

    .line 132
    .line 133
    iget v6, v0, Lnw;->M:F

    .line 134
    .line 135
    cmpl-float v6, v6, v1

    .line 136
    .line 137
    if-eqz v6, :cond_7

    .line 138
    .line 139
    move v6, v9

    .line 140
    goto :goto_4

    .line 141
    :cond_7
    move v6, v8

    .line 142
    :goto_4
    iget v10, v0, Lnw;->h0:F

    .line 143
    .line 144
    cmpl-float v10, v10, v3

    .line 145
    .line 146
    if-eqz v10, :cond_8

    .line 147
    .line 148
    move v10, v9

    .line 149
    goto :goto_5

    .line 150
    :cond_8
    move v10, v8

    .line 151
    :goto_5
    if-nez v6, :cond_a

    .line 152
    .line 153
    if-nez v10, :cond_a

    .line 154
    .line 155
    iget-boolean v6, v0, Lnw;->S:Z

    .line 156
    .line 157
    if-nez v6, :cond_a

    .line 158
    .line 159
    if-eqz v5, :cond_9

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_9
    move v5, v8

    .line 163
    goto :goto_7

    .line 164
    :cond_a
    :goto_6
    move v5, v9

    .line 165
    :goto_7
    iput v1, v0, Lnw;->M:F

    .line 166
    .line 167
    iput v3, v0, Lnw;->h0:F

    .line 168
    .line 169
    iput-boolean v8, v0, Lnw;->S:Z

    .line 170
    .line 171
    :cond_b
    iget-object v1, v0, Lnw;->H:Ljava/lang/CharSequence;

    .line 172
    .line 173
    if-eqz v1, :cond_d

    .line 174
    .line 175
    if-eqz v5, :cond_c

    .line 176
    .line 177
    goto :goto_9

    .line 178
    :cond_c
    :goto_8
    return-void

    .line 179
    :cond_d
    :goto_9
    iget v1, v0, Lnw;->M:F

    .line 180
    .line 181
    iget-object v3, v0, Lnw;->T:Landroid/text/TextPaint;

    .line 182
    .line 183
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 184
    .line 185
    .line 186
    iget-object v1, v0, Lnw;->D:Landroid/graphics/Typeface;

    .line 187
    .line 188
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 189
    .line 190
    .line 191
    iget v1, v0, Lnw;->h0:F

    .line 192
    .line 193
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 194
    .line 195
    .line 196
    iget v1, v0, Lnw;->L:F

    .line 197
    .line 198
    cmpl-float v1, v1, v4

    .line 199
    .line 200
    if-eqz v1, :cond_e

    .line 201
    .line 202
    move v1, v9

    .line 203
    goto :goto_a

    .line 204
    :cond_e
    move v1, v8

    .line 205
    :goto_a
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setLinearText(Z)V

    .line 206
    .line 207
    .line 208
    iget-object v1, v0, Lnw;->G:Ljava/lang/CharSequence;

    .line 209
    .line 210
    invoke-virtual {v0, v1}, Lnw;->b(Ljava/lang/CharSequence;)Z

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    iput-boolean v1, v0, Lnw;->I:Z

    .line 215
    .line 216
    iget v5, v0, Lnw;->n0:I

    .line 217
    .line 218
    if-le v5, v9, :cond_f

    .line 219
    .line 220
    if-eqz v1, :cond_10

    .line 221
    .line 222
    iget-boolean v6, v0, Lnw;->d:Z

    .line 223
    .line 224
    if-eqz v6, :cond_f

    .line 225
    .line 226
    goto :goto_b

    .line 227
    :cond_f
    move v5, v9

    .line 228
    :cond_10
    :goto_b
    if-ne v5, v9, :cond_11

    .line 229
    .line 230
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 231
    .line 232
    goto :goto_c

    .line 233
    :cond_11
    iget v6, v0, Lnw;->k:I

    .line 234
    .line 235
    invoke-static {v6, v1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    and-int/lit8 v6, v6, 0x7

    .line 240
    .line 241
    if-eq v6, v9, :cond_15

    .line 242
    .line 243
    iget-boolean v10, v0, Lnw;->I:Z

    .line 244
    .line 245
    const/4 v11, 0x5

    .line 246
    if-eq v6, v11, :cond_13

    .line 247
    .line 248
    if-eqz v10, :cond_12

    .line 249
    .line 250
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 251
    .line 252
    goto :goto_c

    .line 253
    :cond_12
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 254
    .line 255
    goto :goto_c

    .line 256
    :cond_13
    if-eqz v10, :cond_14

    .line 257
    .line 258
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 259
    .line 260
    goto :goto_c

    .line 261
    :cond_14
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 262
    .line 263
    goto :goto_c

    .line 264
    :cond_15
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 265
    .line 266
    :goto_c
    iget-object v10, v0, Lnw;->G:Ljava/lang/CharSequence;

    .line 267
    .line 268
    float-to-int v2, v2

    .line 269
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 270
    .line 271
    .line 272
    move-result v11

    .line 273
    sget-object v12, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 274
    .line 275
    sget-object v12, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 276
    .line 277
    iget v13, v0, Lnw;->o0:F

    .line 278
    .line 279
    iget v14, v0, Lnw;->p0:F

    .line 280
    .line 281
    iget v15, v0, Lnw;->q0:I

    .line 282
    .line 283
    if-nez v10, :cond_16

    .line 284
    .line 285
    const-string v10, ""

    .line 286
    .line 287
    :cond_16
    invoke-static {v8, v2}, Ljava/lang/Math;->max(II)I

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    move/from16 v16, v4

    .line 292
    .line 293
    if-ne v5, v9, :cond_17

    .line 294
    .line 295
    int-to-float v4, v2

    .line 296
    invoke-static {v10, v3, v4, v12}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    .line 297
    .line 298
    .line 299
    move-result-object v10

    .line 300
    :cond_17
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 301
    .line 302
    .line 303
    move-result v4

    .line 304
    invoke-static {v4, v11}, Ljava/lang/Math;->min(II)I

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    if-eqz v1, :cond_18

    .line 309
    .line 310
    if-ne v5, v9, :cond_18

    .line 311
    .line 312
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 313
    .line 314
    :cond_18
    invoke-static {v10, v8, v4, v3, v2}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    invoke-virtual {v2, v6}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2, v8}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    .line 322
    .line 323
    .line 324
    if-eqz v1, :cond_19

    .line 325
    .line 326
    sget-object v1, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    .line 327
    .line 328
    goto :goto_d

    .line 329
    :cond_19
    sget-object v1, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    .line 330
    .line 331
    :goto_d
    invoke-virtual {v2, v1}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    .line 332
    .line 333
    .line 334
    if-eqz v12, :cond_1a

    .line 335
    .line 336
    invoke-virtual {v2, v12}, Landroid/text/StaticLayout$Builder;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)Landroid/text/StaticLayout$Builder;

    .line 337
    .line 338
    .line 339
    :cond_1a
    invoke-virtual {v2, v5}, Landroid/text/StaticLayout$Builder;->setMaxLines(I)Landroid/text/StaticLayout$Builder;

    .line 340
    .line 341
    .line 342
    cmpl-float v1, v13, v7

    .line 343
    .line 344
    if-nez v1, :cond_1b

    .line 345
    .line 346
    cmpl-float v1, v14, v16

    .line 347
    .line 348
    if-eqz v1, :cond_1c

    .line 349
    .line 350
    :cond_1b
    invoke-virtual {v2, v13, v14}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    .line 351
    .line 352
    .line 353
    :cond_1c
    if-le v5, v9, :cond_1d

    .line 354
    .line 355
    invoke-virtual {v2, v15}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    .line 356
    .line 357
    .line 358
    :cond_1d
    invoke-virtual {v2}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    iput-object v1, v0, Lnw;->i0:Landroid/text/StaticLayout;

    .line 366
    .line 367
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    iput-object v1, v0, Lnw;->H:Ljava/lang/CharSequence;

    .line 372
    .line 373
    return-void
.end method

.method public final d(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lnw;->H:Ljava/lang/CharSequence;

    .line 6
    .line 7
    if-eqz v1, :cond_9

    .line 8
    .line 9
    iget-boolean v1, p0, Lnw;->b:Z

    .line 10
    .line 11
    if-eqz v1, :cond_9

    .line 12
    .line 13
    iget v1, p0, Lnw;->M:F

    .line 14
    .line 15
    iget-object v8, p0, Lnw;->T:Landroid/text/TextPaint;

    .line 16
    .line 17
    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 18
    .line 19
    .line 20
    iget v1, p0, Lnw;->v:F

    .line 21
    .line 22
    iget v2, p0, Lnw;->w:F

    .line 23
    .line 24
    iget v3, p0, Lnw;->L:F

    .line 25
    .line 26
    const/high16 v4, 0x3f800000    # 1.0f

    .line 27
    .line 28
    cmpl-float v4, v3, v4

    .line 29
    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    iget-boolean v4, p0, Lnw;->d:Z

    .line 33
    .line 34
    if-nez v4, :cond_0

    .line 35
    .line 36
    invoke-virtual {p1, v3, v3, v1, v2}, Landroid/graphics/Canvas;->scale(FFFF)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iget v3, p0, Lnw;->n0:I

    .line 40
    .line 41
    const/4 v9, 0x1

    .line 42
    if-le v3, v9, :cond_8

    .line 43
    .line 44
    iget-boolean v3, p0, Lnw;->I:Z

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    iget-boolean v3, p0, Lnw;->d:Z

    .line 49
    .line 50
    if-eqz v3, :cond_8

    .line 51
    .line 52
    :cond_1
    iget-boolean v3, p0, Lnw;->d:Z

    .line 53
    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    iget v3, p0, Lnw;->c:F

    .line 57
    .line 58
    iget v4, p0, Lnw;->f:F

    .line 59
    .line 60
    cmpl-float v3, v3, v4

    .line 61
    .line 62
    if-lez v3, :cond_8

    .line 63
    .line 64
    :cond_2
    iget v1, p0, Lnw;->v:F

    .line 65
    .line 66
    iget-object v3, p0, Lnw;->i0:Landroid/text/StaticLayout;

    .line 67
    .line 68
    const/4 v10, 0x0

    .line 69
    invoke-virtual {v3, v10}, Landroid/text/StaticLayout;->getLineStart(I)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    int-to-float v3, v3

    .line 74
    sub-float/2addr v1, v3

    .line 75
    invoke-virtual {v8}, Landroid/graphics/Paint;->getAlpha()I

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 80
    .line 81
    .line 82
    iget v1, p0, Lnw;->l0:F

    .line 83
    .line 84
    int-to-float v2, v11

    .line 85
    mul-float/2addr v1, v2

    .line 86
    float-to-int v1, v1

    .line 87
    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 88
    .line 89
    .line 90
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 91
    .line 92
    const/16 v12, 0x1f

    .line 93
    .line 94
    if-lt v1, v12, :cond_3

    .line 95
    .line 96
    iget v3, p0, Lnw;->N:F

    .line 97
    .line 98
    iget v4, p0, Lnw;->O:F

    .line 99
    .line 100
    iget v5, p0, Lnw;->P:F

    .line 101
    .line 102
    iget v6, p0, Lnw;->Q:I

    .line 103
    .line 104
    invoke-virtual {v8}, Landroid/graphics/Paint;->getAlpha()I

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    invoke-static {v6, v7}, Lxe2;->j(II)I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    invoke-virtual {v8, v3, v4, v5, v6}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 113
    .line 114
    .line 115
    :cond_3
    iget-object v3, p0, Lnw;->i0:Landroid/text/StaticLayout;

    .line 116
    .line 117
    invoke-virtual {v3, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 118
    .line 119
    .line 120
    iget v3, p0, Lnw;->k0:F

    .line 121
    .line 122
    mul-float/2addr v3, v2

    .line 123
    float-to-int v2, v3

    .line 124
    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 125
    .line 126
    .line 127
    if-lt v1, v12, :cond_4

    .line 128
    .line 129
    iget v2, p0, Lnw;->N:F

    .line 130
    .line 131
    iget v3, p0, Lnw;->O:F

    .line 132
    .line 133
    iget v4, p0, Lnw;->P:F

    .line 134
    .line 135
    iget v5, p0, Lnw;->Q:I

    .line 136
    .line 137
    invoke-virtual {v8}, Landroid/graphics/Paint;->getAlpha()I

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    invoke-static {v5, v6}, Lxe2;->j(II)I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    invoke-virtual {v8, v2, v3, v4, v5}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 146
    .line 147
    .line 148
    :cond_4
    iget-object v2, p0, Lnw;->i0:Landroid/text/StaticLayout;

    .line 149
    .line 150
    invoke-virtual {v2, v10}, Landroid/text/Layout;->getLineBaseline(I)I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    iget-object v3, p0, Lnw;->m0:Ljava/lang/CharSequence;

    .line 155
    .line 156
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    int-to-float v7, v2

    .line 161
    const/4 v4, 0x0

    .line 162
    const/4 v6, 0x0

    .line 163
    move-object v2, p1

    .line 164
    invoke-virtual/range {v2 .. v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    .line 165
    .line 166
    .line 167
    if-lt v1, v12, :cond_5

    .line 168
    .line 169
    iget p1, p0, Lnw;->N:F

    .line 170
    .line 171
    iget v1, p0, Lnw;->O:F

    .line 172
    .line 173
    iget v3, p0, Lnw;->P:F

    .line 174
    .line 175
    iget v4, p0, Lnw;->Q:I

    .line 176
    .line 177
    invoke-virtual {v8, p1, v1, v3, v4}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 178
    .line 179
    .line 180
    :cond_5
    iget-boolean p1, p0, Lnw;->d:Z

    .line 181
    .line 182
    if-nez p1, :cond_7

    .line 183
    .line 184
    iget-object p1, p0, Lnw;->m0:Ljava/lang/CharSequence;

    .line 185
    .line 186
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    const-string v1, "\u2026"

    .line 195
    .line 196
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-eqz v1, :cond_6

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    sub-int/2addr v1, v9

    .line 207
    invoke-virtual {p1, v10, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    :cond_6
    move-object v3, p1

    .line 212
    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 213
    .line 214
    .line 215
    iget-object p0, p0, Lnw;->i0:Landroid/text/StaticLayout;

    .line 216
    .line 217
    invoke-virtual {p0, v10}, Landroid/text/Layout;->getLineEnd(I)I

    .line 218
    .line 219
    .line 220
    move-result p0

    .line 221
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    const/4 v6, 0x0

    .line 230
    const/4 v4, 0x0

    .line 231
    invoke-virtual/range {v2 .. v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V

    .line 232
    .line 233
    .line 234
    :cond_7
    move-object p1, v2

    .line 235
    goto :goto_0

    .line 236
    :cond_8
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 237
    .line 238
    .line 239
    iget-object p0, p0, Lnw;->i0:Landroid/text/StaticLayout;

    .line 240
    .line 241
    invoke-virtual {p0, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 242
    .line 243
    .line 244
    :goto_0
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 245
    .line 246
    .line 247
    :cond_9
    return-void
.end method

.method public final e()F
    .locals 2

    .line 1
    iget v0, p0, Lnw;->n:F

    .line 2
    .line 3
    iget-object v1, p0, Lnw;->U:Landroid/text/TextPaint;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lnw;->x:Landroid/graphics/Typeface;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 11
    .line 12
    .line 13
    iget p0, p0, Lnw;->f0:F

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/graphics/Paint;->ascent()F

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    neg-float p0, p0

    .line 23
    return p0
.end method

.method public final f(Landroid/content/res/ColorStateList;)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object p0, p0, Lnw;->R:[I

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1, p0, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_1
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public final h(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-lt v0, v1, :cond_4

    .line 6
    .line 7
    iget-object v0, p0, Lnw;->z:Landroid/graphics/Typeface;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {p1, v0}, Ljb1;->s(Landroid/content/res/Configuration;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lnw;->y:Landroid/graphics/Typeface;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lnw;->C:Landroid/graphics/Typeface;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-static {p1, v0}, Ljb1;->s(Landroid/content/res/Configuration;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lnw;->B:Landroid/graphics/Typeface;

    .line 26
    .line 27
    :cond_1
    iget-object p1, p0, Lnw;->y:Landroid/graphics/Typeface;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iget-object p1, p0, Lnw;->z:Landroid/graphics/Typeface;

    .line 33
    .line 34
    :goto_0
    iput-object p1, p0, Lnw;->x:Landroid/graphics/Typeface;

    .line 35
    .line 36
    iget-object p1, p0, Lnw;->B:Landroid/graphics/Typeface;

    .line 37
    .line 38
    if-eqz p1, :cond_3

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    iget-object p1, p0, Lnw;->C:Landroid/graphics/Typeface;

    .line 42
    .line 43
    :goto_1
    iput-object p1, p0, Lnw;->A:Landroid/graphics/Typeface;

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    invoke-virtual {p0, p1}, Lnw;->j(Z)V

    .line 47
    .line 48
    .line 49
    :cond_4
    return-void
.end method

.method public final i()V
    .locals 2

    .line 1
    iget-object v0, p0, Lnw;->i:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lnw;->h:Landroid/graphics/Rect;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-lez v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-lez v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    iput-boolean v0, p0, Lnw;->b:Z

    .line 33
    .line 34
    return-void
.end method

.method public final j(Z)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lnw;->a:Landroid/view/ViewGroup;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-lez v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-gtz v3, :cond_1

    .line 18
    .line 19
    :cond_0
    if-eqz v1, :cond_19

    .line 20
    .line 21
    :cond_1
    const/high16 v3, 0x3f800000    # 1.0f

    .line 22
    .line 23
    invoke-virtual {v0, v3, v1}, Lnw;->c(FZ)V

    .line 24
    .line 25
    .line 26
    iget-object v4, v0, Lnw;->H:Ljava/lang/CharSequence;

    .line 27
    .line 28
    iget-object v5, v0, Lnw;->T:Landroid/text/TextPaint;

    .line 29
    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    iget-object v6, v0, Lnw;->i0:Landroid/text/StaticLayout;

    .line 33
    .line 34
    if-eqz v6, :cond_2

    .line 35
    .line 36
    invoke-virtual {v6}, Landroid/text/Layout;->getWidth()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    int-to-float v6, v6

    .line 41
    sget-object v7, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 42
    .line 43
    invoke-static {v4, v5, v6, v7}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    iput-object v4, v0, Lnw;->m0:Ljava/lang/CharSequence;

    .line 48
    .line 49
    :cond_2
    iget-object v4, v0, Lnw;->m0:Ljava/lang/CharSequence;

    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    const/4 v7, 0x0

    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    invoke-virtual {v5, v4, v7, v8}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    iput v4, v0, Lnw;->j0:F

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    iput v6, v0, Lnw;->j0:F

    .line 67
    .line 68
    :goto_0
    iget v4, v0, Lnw;->l:I

    .line 69
    .line 70
    iget-boolean v8, v0, Lnw;->I:Z

    .line 71
    .line 72
    invoke-static {v4, v8}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    and-int/lit8 v8, v4, 0x70

    .line 77
    .line 78
    iget-object v9, v0, Lnw;->i:Landroid/graphics/Rect;

    .line 79
    .line 80
    const/16 v10, 0x50

    .line 81
    .line 82
    const/16 v11, 0x30

    .line 83
    .line 84
    const/high16 v12, 0x40000000    # 2.0f

    .line 85
    .line 86
    if-eq v8, v11, :cond_5

    .line 87
    .line 88
    if-eq v8, v10, :cond_4

    .line 89
    .line 90
    invoke-virtual {v5}, Landroid/graphics/Paint;->descent()F

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    invoke-virtual {v5}, Landroid/graphics/Paint;->ascent()F

    .line 95
    .line 96
    .line 97
    move-result v13

    .line 98
    sub-float/2addr v8, v13

    .line 99
    div-float/2addr v8, v12

    .line 100
    invoke-virtual {v9}, Landroid/graphics/Rect;->centerY()I

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    int-to-float v13, v13

    .line 105
    sub-float/2addr v13, v8

    .line 106
    iput v13, v0, Lnw;->s:F

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    iget v8, v9, Landroid/graphics/Rect;->bottom:I

    .line 110
    .line 111
    int-to-float v8, v8

    .line 112
    invoke-virtual {v5}, Landroid/graphics/Paint;->ascent()F

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    add-float/2addr v13, v8

    .line 117
    iput v13, v0, Lnw;->s:F

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_5
    iget v8, v9, Landroid/graphics/Rect;->top:I

    .line 121
    .line 122
    int-to-float v8, v8

    .line 123
    iput v8, v0, Lnw;->s:F

    .line 124
    .line 125
    :goto_1
    const v8, 0x800007

    .line 126
    .line 127
    .line 128
    and-int/2addr v4, v8

    .line 129
    const/4 v13, 0x5

    .line 130
    const/4 v14, 0x1

    .line 131
    if-eq v4, v14, :cond_7

    .line 132
    .line 133
    if-eq v4, v13, :cond_6

    .line 134
    .line 135
    iget v4, v9, Landroid/graphics/Rect;->left:I

    .line 136
    .line 137
    int-to-float v4, v4

    .line 138
    iput v4, v0, Lnw;->u:F

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_6
    iget v4, v9, Landroid/graphics/Rect;->right:I

    .line 142
    .line 143
    int-to-float v4, v4

    .line 144
    iget v15, v0, Lnw;->j0:F

    .line 145
    .line 146
    sub-float/2addr v4, v15

    .line 147
    iput v4, v0, Lnw;->u:F

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_7
    invoke-virtual {v9}, Landroid/graphics/Rect;->centerX()I

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    int-to-float v4, v4

    .line 155
    iget v15, v0, Lnw;->j0:F

    .line 156
    .line 157
    div-float/2addr v15, v12

    .line 158
    sub-float/2addr v4, v15

    .line 159
    iput v4, v0, Lnw;->u:F

    .line 160
    .line 161
    :goto_2
    invoke-virtual {v0, v6, v1}, Lnw;->c(FZ)V

    .line 162
    .line 163
    .line 164
    iget-object v1, v0, Lnw;->i0:Landroid/text/StaticLayout;

    .line 165
    .line 166
    if-eqz v1, :cond_8

    .line 167
    .line 168
    invoke-virtual {v1}, Landroid/text/Layout;->getHeight()I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    int-to-float v1, v1

    .line 173
    goto :goto_3

    .line 174
    :cond_8
    move v1, v6

    .line 175
    :goto_3
    iget-object v4, v0, Lnw;->i0:Landroid/text/StaticLayout;

    .line 176
    .line 177
    if-eqz v4, :cond_9

    .line 178
    .line 179
    iget v15, v0, Lnw;->n0:I

    .line 180
    .line 181
    if-le v15, v14, :cond_9

    .line 182
    .line 183
    invoke-virtual {v4}, Landroid/text/Layout;->getWidth()I

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    int-to-float v4, v4

    .line 188
    goto :goto_4

    .line 189
    :cond_9
    iget-object v4, v0, Lnw;->H:Ljava/lang/CharSequence;

    .line 190
    .line 191
    if-eqz v4, :cond_a

    .line 192
    .line 193
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 194
    .line 195
    .line 196
    move-result v15

    .line 197
    invoke-virtual {v5, v4, v7, v15}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    goto :goto_4

    .line 202
    :cond_a
    move v4, v6

    .line 203
    :goto_4
    iget-object v15, v0, Lnw;->i0:Landroid/text/StaticLayout;

    .line 204
    .line 205
    if-eqz v15, :cond_b

    .line 206
    .line 207
    invoke-virtual {v15}, Landroid/text/StaticLayout;->getLineCount()I

    .line 208
    .line 209
    .line 210
    move-result v15

    .line 211
    goto :goto_5

    .line 212
    :cond_b
    move v15, v7

    .line 213
    :goto_5
    iput v15, v0, Lnw;->q:I

    .line 214
    .line 215
    iget v15, v0, Lnw;->k:I

    .line 216
    .line 217
    move/from16 v16, v8

    .line 218
    .line 219
    iget-boolean v8, v0, Lnw;->I:Z

    .line 220
    .line 221
    invoke-static {v15, v8}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 222
    .line 223
    .line 224
    move-result v8

    .line 225
    and-int/lit8 v15, v8, 0x70

    .line 226
    .line 227
    move/from16 v17, v12

    .line 228
    .line 229
    iget-object v12, v0, Lnw;->h:Landroid/graphics/Rect;

    .line 230
    .line 231
    if-eq v15, v11, :cond_d

    .line 232
    .line 233
    if-eq v15, v10, :cond_c

    .line 234
    .line 235
    div-float v1, v1, v17

    .line 236
    .line 237
    invoke-virtual {v12}, Landroid/graphics/Rect;->centerY()I

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    int-to-float v10, v10

    .line 242
    sub-float/2addr v10, v1

    .line 243
    iput v10, v0, Lnw;->r:F

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_c
    iget v10, v12, Landroid/graphics/Rect;->bottom:I

    .line 247
    .line 248
    int-to-float v10, v10

    .line 249
    sub-float/2addr v10, v1

    .line 250
    invoke-virtual {v5}, Landroid/graphics/Paint;->descent()F

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    add-float/2addr v1, v10

    .line 255
    iput v1, v0, Lnw;->r:F

    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_d
    iget v1, v12, Landroid/graphics/Rect;->top:I

    .line 259
    .line 260
    int-to-float v1, v1

    .line 261
    iput v1, v0, Lnw;->r:F

    .line 262
    .line 263
    :goto_6
    and-int v1, v8, v16

    .line 264
    .line 265
    if-eq v1, v14, :cond_f

    .line 266
    .line 267
    if-eq v1, v13, :cond_e

    .line 268
    .line 269
    iget v1, v12, Landroid/graphics/Rect;->left:I

    .line 270
    .line 271
    int-to-float v1, v1

    .line 272
    iput v1, v0, Lnw;->t:F

    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_e
    iget v1, v12, Landroid/graphics/Rect;->right:I

    .line 276
    .line 277
    int-to-float v1, v1

    .line 278
    sub-float/2addr v1, v4

    .line 279
    iput v1, v0, Lnw;->t:F

    .line 280
    .line 281
    goto :goto_7

    .line 282
    :cond_f
    invoke-virtual {v12}, Landroid/graphics/Rect;->centerX()I

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    int-to-float v1, v1

    .line 287
    div-float v4, v4, v17

    .line 288
    .line 289
    sub-float/2addr v1, v4

    .line 290
    iput v1, v0, Lnw;->t:F

    .line 291
    .line 292
    :goto_7
    iget-object v1, v0, Lnw;->K:Landroid/graphics/Bitmap;

    .line 293
    .line 294
    if-eqz v1, :cond_10

    .line 295
    .line 296
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 297
    .line 298
    .line 299
    const/4 v1, 0x0

    .line 300
    iput-object v1, v0, Lnw;->K:Landroid/graphics/Bitmap;

    .line 301
    .line 302
    :cond_10
    iget v1, v0, Lnw;->c:F

    .line 303
    .line 304
    invoke-virtual {v0, v1}, Lnw;->r(F)V

    .line 305
    .line 306
    .line 307
    iget v1, v0, Lnw;->c:F

    .line 308
    .line 309
    iget-boolean v4, v0, Lnw;->d:Z

    .line 310
    .line 311
    iget-object v8, v0, Lnw;->j:Landroid/graphics/RectF;

    .line 312
    .line 313
    if-eqz v4, :cond_12

    .line 314
    .line 315
    iget v4, v0, Lnw;->f:F

    .line 316
    .line 317
    cmpg-float v4, v1, v4

    .line 318
    .line 319
    if-gez v4, :cond_11

    .line 320
    .line 321
    move-object v9, v12

    .line 322
    :cond_11
    invoke-virtual {v8, v9}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 323
    .line 324
    .line 325
    goto :goto_8

    .line 326
    :cond_12
    iget v4, v12, Landroid/graphics/Rect;->left:I

    .line 327
    .line 328
    int-to-float v4, v4

    .line 329
    iget v10, v9, Landroid/graphics/Rect;->left:I

    .line 330
    .line 331
    int-to-float v10, v10

    .line 332
    iget-object v11, v0, Lnw;->V:Landroid/animation/TimeInterpolator;

    .line 333
    .line 334
    invoke-static {v4, v10, v1, v11}, Lnw;->g(FFFLandroid/animation/TimeInterpolator;)F

    .line 335
    .line 336
    .line 337
    move-result v4

    .line 338
    iput v4, v8, Landroid/graphics/RectF;->left:F

    .line 339
    .line 340
    iget v4, v0, Lnw;->r:F

    .line 341
    .line 342
    iget v10, v0, Lnw;->s:F

    .line 343
    .line 344
    iget-object v11, v0, Lnw;->V:Landroid/animation/TimeInterpolator;

    .line 345
    .line 346
    invoke-static {v4, v10, v1, v11}, Lnw;->g(FFFLandroid/animation/TimeInterpolator;)F

    .line 347
    .line 348
    .line 349
    move-result v4

    .line 350
    iput v4, v8, Landroid/graphics/RectF;->top:F

    .line 351
    .line 352
    iget v4, v12, Landroid/graphics/Rect;->right:I

    .line 353
    .line 354
    int-to-float v4, v4

    .line 355
    iget v10, v9, Landroid/graphics/Rect;->right:I

    .line 356
    .line 357
    int-to-float v10, v10

    .line 358
    iget-object v11, v0, Lnw;->V:Landroid/animation/TimeInterpolator;

    .line 359
    .line 360
    invoke-static {v4, v10, v1, v11}, Lnw;->g(FFFLandroid/animation/TimeInterpolator;)F

    .line 361
    .line 362
    .line 363
    move-result v4

    .line 364
    iput v4, v8, Landroid/graphics/RectF;->right:F

    .line 365
    .line 366
    iget v4, v12, Landroid/graphics/Rect;->bottom:I

    .line 367
    .line 368
    int-to-float v4, v4

    .line 369
    iget v9, v9, Landroid/graphics/Rect;->bottom:I

    .line 370
    .line 371
    int-to-float v9, v9

    .line 372
    iget-object v10, v0, Lnw;->V:Landroid/animation/TimeInterpolator;

    .line 373
    .line 374
    invoke-static {v4, v9, v1, v10}, Lnw;->g(FFFLandroid/animation/TimeInterpolator;)F

    .line 375
    .line 376
    .line 377
    move-result v4

    .line 378
    iput v4, v8, Landroid/graphics/RectF;->bottom:F

    .line 379
    .line 380
    :goto_8
    iget-boolean v4, v0, Lnw;->d:Z

    .line 381
    .line 382
    if-eqz v4, :cond_14

    .line 383
    .line 384
    iget v4, v0, Lnw;->f:F

    .line 385
    .line 386
    cmpg-float v4, v1, v4

    .line 387
    .line 388
    if-gez v4, :cond_13

    .line 389
    .line 390
    iget v4, v0, Lnw;->t:F

    .line 391
    .line 392
    iput v4, v0, Lnw;->v:F

    .line 393
    .line 394
    iget v4, v0, Lnw;->r:F

    .line 395
    .line 396
    iput v4, v0, Lnw;->w:F

    .line 397
    .line 398
    invoke-virtual {v0, v6}, Lnw;->r(F)V

    .line 399
    .line 400
    .line 401
    move v4, v6

    .line 402
    goto :goto_9

    .line 403
    :cond_13
    iget v4, v0, Lnw;->u:F

    .line 404
    .line 405
    iput v4, v0, Lnw;->v:F

    .line 406
    .line 407
    iget v4, v0, Lnw;->s:F

    .line 408
    .line 409
    iget v8, v0, Lnw;->g:I

    .line 410
    .line 411
    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    .line 412
    .line 413
    .line 414
    move-result v7

    .line 415
    int-to-float v7, v7

    .line 416
    sub-float/2addr v4, v7

    .line 417
    iput v4, v0, Lnw;->w:F

    .line 418
    .line 419
    invoke-virtual {v0, v3}, Lnw;->r(F)V

    .line 420
    .line 421
    .line 422
    move v4, v3

    .line 423
    goto :goto_9

    .line 424
    :cond_14
    iget v4, v0, Lnw;->t:F

    .line 425
    .line 426
    iget v7, v0, Lnw;->u:F

    .line 427
    .line 428
    iget-object v8, v0, Lnw;->V:Landroid/animation/TimeInterpolator;

    .line 429
    .line 430
    invoke-static {v4, v7, v1, v8}, Lnw;->g(FFFLandroid/animation/TimeInterpolator;)F

    .line 431
    .line 432
    .line 433
    move-result v4

    .line 434
    iput v4, v0, Lnw;->v:F

    .line 435
    .line 436
    iget v4, v0, Lnw;->r:F

    .line 437
    .line 438
    iget v7, v0, Lnw;->s:F

    .line 439
    .line 440
    iget-object v8, v0, Lnw;->V:Landroid/animation/TimeInterpolator;

    .line 441
    .line 442
    invoke-static {v4, v7, v1, v8}, Lnw;->g(FFFLandroid/animation/TimeInterpolator;)F

    .line 443
    .line 444
    .line 445
    move-result v4

    .line 446
    iput v4, v0, Lnw;->w:F

    .line 447
    .line 448
    invoke-virtual {v0, v1}, Lnw;->r(F)V

    .line 449
    .line 450
    .line 451
    move v4, v1

    .line 452
    :goto_9
    sub-float v7, v3, v1

    .line 453
    .line 454
    sget-object v8, Lu8;->b:Lxg0;

    .line 455
    .line 456
    invoke-static {v6, v3, v7, v8}, Lnw;->g(FFFLandroid/animation/TimeInterpolator;)F

    .line 457
    .line 458
    .line 459
    move-result v7

    .line 460
    sub-float v7, v3, v7

    .line 461
    .line 462
    iput v7, v0, Lnw;->k0:F

    .line 463
    .line 464
    sget-object v7, Le33;->a:Ljava/util/WeakHashMap;

    .line 465
    .line 466
    invoke-virtual {v2}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 467
    .line 468
    .line 469
    invoke-static {v3, v6, v1, v8}, Lnw;->g(FFFLandroid/animation/TimeInterpolator;)F

    .line 470
    .line 471
    .line 472
    move-result v7

    .line 473
    iput v7, v0, Lnw;->l0:F

    .line 474
    .line 475
    invoke-virtual {v2}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 476
    .line 477
    .line 478
    iget-object v7, v0, Lnw;->p:Landroid/content/res/ColorStateList;

    .line 479
    .line 480
    iget-object v9, v0, Lnw;->o:Landroid/content/res/ColorStateList;

    .line 481
    .line 482
    if-eq v7, v9, :cond_15

    .line 483
    .line 484
    invoke-virtual {v0, v9}, Lnw;->f(Landroid/content/res/ColorStateList;)I

    .line 485
    .line 486
    .line 487
    move-result v7

    .line 488
    iget-object v9, v0, Lnw;->p:Landroid/content/res/ColorStateList;

    .line 489
    .line 490
    invoke-virtual {v0, v9}, Lnw;->f(Landroid/content/res/ColorStateList;)I

    .line 491
    .line 492
    .line 493
    move-result v9

    .line 494
    invoke-static {v7, v4, v9}, Lnw;->a(IFI)I

    .line 495
    .line 496
    .line 497
    move-result v4

    .line 498
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 499
    .line 500
    .line 501
    goto :goto_a

    .line 502
    :cond_15
    invoke-virtual {v0, v7}, Lnw;->f(Landroid/content/res/ColorStateList;)I

    .line 503
    .line 504
    .line 505
    move-result v4

    .line 506
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 507
    .line 508
    .line 509
    :goto_a
    iget v4, v0, Lnw;->f0:F

    .line 510
    .line 511
    iget v7, v0, Lnw;->g0:F

    .line 512
    .line 513
    cmpl-float v9, v4, v7

    .line 514
    .line 515
    if-eqz v9, :cond_16

    .line 516
    .line 517
    invoke-static {v7, v4, v1, v8}, Lnw;->g(FFFLandroid/animation/TimeInterpolator;)F

    .line 518
    .line 519
    .line 520
    move-result v4

    .line 521
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 522
    .line 523
    .line 524
    goto :goto_b

    .line 525
    :cond_16
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 526
    .line 527
    .line 528
    :goto_b
    iget v4, v0, Lnw;->b0:F

    .line 529
    .line 530
    iget v7, v0, Lnw;->X:F

    .line 531
    .line 532
    invoke-static {v4, v7, v1}, Lu8;->a(FFF)F

    .line 533
    .line 534
    .line 535
    move-result v4

    .line 536
    iput v4, v0, Lnw;->N:F

    .line 537
    .line 538
    iget v4, v0, Lnw;->c0:F

    .line 539
    .line 540
    iget v7, v0, Lnw;->Y:F

    .line 541
    .line 542
    invoke-static {v4, v7, v1}, Lu8;->a(FFF)F

    .line 543
    .line 544
    .line 545
    move-result v4

    .line 546
    iput v4, v0, Lnw;->O:F

    .line 547
    .line 548
    iget v4, v0, Lnw;->d0:F

    .line 549
    .line 550
    iget v7, v0, Lnw;->Z:F

    .line 551
    .line 552
    invoke-static {v4, v7, v1}, Lu8;->a(FFF)F

    .line 553
    .line 554
    .line 555
    move-result v4

    .line 556
    iput v4, v0, Lnw;->P:F

    .line 557
    .line 558
    iget-object v4, v0, Lnw;->e0:Landroid/content/res/ColorStateList;

    .line 559
    .line 560
    invoke-virtual {v0, v4}, Lnw;->f(Landroid/content/res/ColorStateList;)I

    .line 561
    .line 562
    .line 563
    move-result v4

    .line 564
    iget-object v7, v0, Lnw;->a0:Landroid/content/res/ColorStateList;

    .line 565
    .line 566
    invoke-virtual {v0, v7}, Lnw;->f(Landroid/content/res/ColorStateList;)I

    .line 567
    .line 568
    .line 569
    move-result v7

    .line 570
    invoke-static {v4, v1, v7}, Lnw;->a(IFI)I

    .line 571
    .line 572
    .line 573
    move-result v4

    .line 574
    iput v4, v0, Lnw;->Q:I

    .line 575
    .line 576
    iget v7, v0, Lnw;->N:F

    .line 577
    .line 578
    iget v8, v0, Lnw;->O:F

    .line 579
    .line 580
    iget v9, v0, Lnw;->P:F

    .line 581
    .line 582
    invoke-virtual {v5, v7, v8, v9, v4}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 583
    .line 584
    .line 585
    iget-boolean v4, v0, Lnw;->d:Z

    .line 586
    .line 587
    if-eqz v4, :cond_18

    .line 588
    .line 589
    invoke-virtual {v5}, Landroid/graphics/Paint;->getAlpha()I

    .line 590
    .line 591
    .line 592
    move-result v4

    .line 593
    iget v7, v0, Lnw;->f:F

    .line 594
    .line 595
    cmpg-float v8, v1, v7

    .line 596
    .line 597
    if-gtz v8, :cond_17

    .line 598
    .line 599
    iget v0, v0, Lnw;->e:F

    .line 600
    .line 601
    invoke-static {v3, v6, v0, v7, v1}, Lu8;->b(FFFFF)F

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    goto :goto_c

    .line 606
    :cond_17
    invoke-static {v6, v3, v7, v3, v1}, Lu8;->b(FFFFF)F

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    :goto_c
    int-to-float v1, v4

    .line 611
    mul-float/2addr v0, v1

    .line 612
    float-to-int v0, v0

    .line 613
    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 614
    .line 615
    .line 616
    :cond_18
    invoke-virtual {v2}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 617
    .line 618
    .line 619
    :cond_19
    return-void
.end method

.method public final k(I)V
    .locals 4

    .line 1
    new-instance v0, Ldn2;

    .line 2
    .line 3
    iget-object v1, p0, Lnw;->a:Landroid/view/ViewGroup;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, v2, p1}, Ldn2;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    iget-object p1, v0, Ldn2;->j:Landroid/content/res/ColorStateList;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iput-object p1, p0, Lnw;->p:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    :cond_0
    iget p1, v0, Ldn2;->k:F

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    cmpl-float v2, p1, v2

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    iput p1, p0, Lnw;->n:F

    .line 26
    .line 27
    :cond_1
    iget-object p1, v0, Ldn2;->a:Landroid/content/res/ColorStateList;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iput-object p1, p0, Lnw;->a0:Landroid/content/res/ColorStateList;

    .line 32
    .line 33
    :cond_2
    iget p1, v0, Ldn2;->e:F

    .line 34
    .line 35
    iput p1, p0, Lnw;->Y:F

    .line 36
    .line 37
    iget p1, v0, Ldn2;->f:F

    .line 38
    .line 39
    iput p1, p0, Lnw;->Z:F

    .line 40
    .line 41
    iget p1, v0, Ldn2;->g:F

    .line 42
    .line 43
    iput p1, p0, Lnw;->X:F

    .line 44
    .line 45
    iget p1, v0, Ldn2;->i:F

    .line 46
    .line 47
    iput p1, p0, Lnw;->f0:F

    .line 48
    .line 49
    iget-object p1, p0, Lnw;->F:Lbr;

    .line 50
    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    iput-boolean v2, p1, Lbr;->i:Z

    .line 55
    .line 56
    :cond_3
    new-instance p1, Lbr;

    .line 57
    .line 58
    new-instance v2, Lqc3;

    .line 59
    .line 60
    const/16 v3, 0x11

    .line 61
    .line 62
    invoke-direct {v2, p0, v3}, Lqc3;-><init>(Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ldn2;->a()V

    .line 66
    .line 67
    .line 68
    iget-object v3, v0, Ldn2;->n:Landroid/graphics/Typeface;

    .line 69
    .line 70
    invoke-direct {p1, v2, v3}, Lbr;-><init>(Lar;Landroid/graphics/Typeface;)V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lnw;->F:Lbr;

    .line 74
    .line 75
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget-object v1, p0, Lnw;->F:Lbr;

    .line 80
    .line 81
    invoke-virtual {v0, p1, v1}, Ldn2;->c(Landroid/content/Context;Lkb1;)V

    .line 82
    .line 83
    .line 84
    const/4 p1, 0x0

    .line 85
    invoke-virtual {p0, p1}, Lnw;->j(Z)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final l(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnw;->p:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lnw;->p:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1}, Lnw;->j(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final m(I)V
    .locals 1

    .line 1
    iget v0, p0, Lnw;->l:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lnw;->l:I

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1}, Lnw;->j(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final n(Landroid/graphics/Typeface;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lnw;->F:Lbr;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, v0, Lbr;->i:Z

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lnw;->z:Landroid/graphics/Typeface;

    .line 9
    .line 10
    if-eq v0, p1, :cond_2

    .line 11
    .line 12
    iput-object p1, p0, Lnw;->z:Landroid/graphics/Typeface;

    .line 13
    .line 14
    iget-object v0, p0, Lnw;->a:Landroid/view/ViewGroup;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0, p1}, Ljb1;->s(Landroid/content/res/Configuration;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lnw;->y:Landroid/graphics/Typeface;

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    iget-object p1, p0, Lnw;->z:Landroid/graphics/Typeface;

    .line 37
    .line 38
    :cond_1
    iput-object p1, p0, Lnw;->x:Landroid/graphics/Typeface;

    .line 39
    .line 40
    return v1

    .line 41
    :cond_2
    const/4 p0, 0x0

    .line 42
    return p0
.end method

.method public final o(I)V
    .locals 4

    .line 1
    new-instance v0, Ldn2;

    .line 2
    .line 3
    iget-object v1, p0, Lnw;->a:Landroid/view/ViewGroup;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, v2, p1}, Ldn2;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    iget-object p1, v0, Ldn2;->j:Landroid/content/res/ColorStateList;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iput-object p1, p0, Lnw;->o:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    :cond_0
    iget p1, v0, Ldn2;->k:F

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    cmpl-float v2, p1, v2

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    iput p1, p0, Lnw;->m:F

    .line 26
    .line 27
    :cond_1
    iget-object p1, v0, Ldn2;->a:Landroid/content/res/ColorStateList;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iput-object p1, p0, Lnw;->e0:Landroid/content/res/ColorStateList;

    .line 32
    .line 33
    :cond_2
    iget p1, v0, Ldn2;->e:F

    .line 34
    .line 35
    iput p1, p0, Lnw;->c0:F

    .line 36
    .line 37
    iget p1, v0, Ldn2;->f:F

    .line 38
    .line 39
    iput p1, p0, Lnw;->d0:F

    .line 40
    .line 41
    iget p1, v0, Ldn2;->g:F

    .line 42
    .line 43
    iput p1, p0, Lnw;->b0:F

    .line 44
    .line 45
    iget p1, v0, Ldn2;->i:F

    .line 46
    .line 47
    iput p1, p0, Lnw;->g0:F

    .line 48
    .line 49
    iget-object p1, p0, Lnw;->E:Lbr;

    .line 50
    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    iput-boolean v2, p1, Lbr;->i:Z

    .line 55
    .line 56
    :cond_3
    new-instance p1, Lbr;

    .line 57
    .line 58
    new-instance v2, Ld52;

    .line 59
    .line 60
    invoke-direct {v2, p0}, Ld52;-><init>(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ldn2;->a()V

    .line 64
    .line 65
    .line 66
    iget-object v3, v0, Ldn2;->n:Landroid/graphics/Typeface;

    .line 67
    .line 68
    invoke-direct {p1, v2, v3}, Lbr;-><init>(Lar;Landroid/graphics/Typeface;)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lnw;->E:Lbr;

    .line 72
    .line 73
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object v1, p0, Lnw;->E:Lbr;

    .line 78
    .line 79
    invoke-virtual {v0, p1, v1}, Ldn2;->c(Landroid/content/Context;Lkb1;)V

    .line 80
    .line 81
    .line 82
    const/4 p1, 0x0

    .line 83
    invoke-virtual {p0, p1}, Lnw;->j(Z)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final p(Landroid/graphics/Typeface;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lnw;->E:Lbr;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, v0, Lbr;->i:Z

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lnw;->C:Landroid/graphics/Typeface;

    .line 9
    .line 10
    if-eq v0, p1, :cond_2

    .line 11
    .line 12
    iput-object p1, p0, Lnw;->C:Landroid/graphics/Typeface;

    .line 13
    .line 14
    iget-object v0, p0, Lnw;->a:Landroid/view/ViewGroup;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0, p1}, Ljb1;->s(Landroid/content/res/Configuration;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lnw;->B:Landroid/graphics/Typeface;

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    iget-object p1, p0, Lnw;->C:Landroid/graphics/Typeface;

    .line 37
    .line 38
    :cond_1
    iput-object p1, p0, Lnw;->A:Landroid/graphics/Typeface;

    .line 39
    .line 40
    return v1

    .line 41
    :cond_2
    const/4 p0, 0x0

    .line 42
    return p0
.end method

.method public final q(F)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    const/high16 v2, 0x3f800000    # 1.0f

    .line 5
    .line 6
    if-gez v1, :cond_0

    .line 7
    .line 8
    move p1, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    cmpl-float v1, p1, v2

    .line 11
    .line 12
    if-lez v1, :cond_1

    .line 13
    .line 14
    move p1, v2

    .line 15
    :cond_1
    :goto_0
    iget v1, p0, Lnw;->c:F

    .line 16
    .line 17
    cmpl-float v1, p1, v1

    .line 18
    .line 19
    if-eqz v1, :cond_a

    .line 20
    .line 21
    iput p1, p0, Lnw;->c:F

    .line 22
    .line 23
    iget-boolean v1, p0, Lnw;->d:Z

    .line 24
    .line 25
    iget-object v3, p0, Lnw;->i:Landroid/graphics/Rect;

    .line 26
    .line 27
    iget-object v4, p0, Lnw;->h:Landroid/graphics/Rect;

    .line 28
    .line 29
    iget-object v5, p0, Lnw;->j:Landroid/graphics/RectF;

    .line 30
    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    iget v1, p0, Lnw;->f:F

    .line 34
    .line 35
    cmpg-float v1, p1, v1

    .line 36
    .line 37
    if-gez v1, :cond_2

    .line 38
    .line 39
    move-object v3, v4

    .line 40
    :cond_2
    invoke-virtual {v5, v3}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    iget v1, v4, Landroid/graphics/Rect;->left:I

    .line 45
    .line 46
    int-to-float v1, v1

    .line 47
    iget v6, v3, Landroid/graphics/Rect;->left:I

    .line 48
    .line 49
    int-to-float v6, v6

    .line 50
    iget-object v7, p0, Lnw;->V:Landroid/animation/TimeInterpolator;

    .line 51
    .line 52
    invoke-static {v1, v6, p1, v7}, Lnw;->g(FFFLandroid/animation/TimeInterpolator;)F

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    iput v1, v5, Landroid/graphics/RectF;->left:F

    .line 57
    .line 58
    iget v1, p0, Lnw;->r:F

    .line 59
    .line 60
    iget v6, p0, Lnw;->s:F

    .line 61
    .line 62
    iget-object v7, p0, Lnw;->V:Landroid/animation/TimeInterpolator;

    .line 63
    .line 64
    invoke-static {v1, v6, p1, v7}, Lnw;->g(FFFLandroid/animation/TimeInterpolator;)F

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    iput v1, v5, Landroid/graphics/RectF;->top:F

    .line 69
    .line 70
    iget v1, v4, Landroid/graphics/Rect;->right:I

    .line 71
    .line 72
    int-to-float v1, v1

    .line 73
    iget v6, v3, Landroid/graphics/Rect;->right:I

    .line 74
    .line 75
    int-to-float v6, v6

    .line 76
    iget-object v7, p0, Lnw;->V:Landroid/animation/TimeInterpolator;

    .line 77
    .line 78
    invoke-static {v1, v6, p1, v7}, Lnw;->g(FFFLandroid/animation/TimeInterpolator;)F

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    iput v1, v5, Landroid/graphics/RectF;->right:F

    .line 83
    .line 84
    iget v1, v4, Landroid/graphics/Rect;->bottom:I

    .line 85
    .line 86
    int-to-float v1, v1

    .line 87
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    .line 88
    .line 89
    int-to-float v3, v3

    .line 90
    iget-object v4, p0, Lnw;->V:Landroid/animation/TimeInterpolator;

    .line 91
    .line 92
    invoke-static {v1, v3, p1, v4}, Lnw;->g(FFFLandroid/animation/TimeInterpolator;)F

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    iput v1, v5, Landroid/graphics/RectF;->bottom:F

    .line 97
    .line 98
    :goto_1
    iget-boolean v1, p0, Lnw;->d:Z

    .line 99
    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    iget v1, p0, Lnw;->f:F

    .line 103
    .line 104
    cmpg-float v1, p1, v1

    .line 105
    .line 106
    if-gez v1, :cond_4

    .line 107
    .line 108
    iget v1, p0, Lnw;->t:F

    .line 109
    .line 110
    iput v1, p0, Lnw;->v:F

    .line 111
    .line 112
    iget v1, p0, Lnw;->r:F

    .line 113
    .line 114
    iput v1, p0, Lnw;->w:F

    .line 115
    .line 116
    invoke-virtual {p0, v0}, Lnw;->r(F)V

    .line 117
    .line 118
    .line 119
    move v1, v0

    .line 120
    goto :goto_2

    .line 121
    :cond_4
    iget v1, p0, Lnw;->u:F

    .line 122
    .line 123
    iput v1, p0, Lnw;->v:F

    .line 124
    .line 125
    iget v1, p0, Lnw;->s:F

    .line 126
    .line 127
    const/4 v3, 0x0

    .line 128
    iget v4, p0, Lnw;->g:I

    .line 129
    .line 130
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    int-to-float v3, v3

    .line 135
    sub-float/2addr v1, v3

    .line 136
    iput v1, p0, Lnw;->w:F

    .line 137
    .line 138
    invoke-virtual {p0, v2}, Lnw;->r(F)V

    .line 139
    .line 140
    .line 141
    move v1, v2

    .line 142
    goto :goto_2

    .line 143
    :cond_5
    iget v1, p0, Lnw;->t:F

    .line 144
    .line 145
    iget v3, p0, Lnw;->u:F

    .line 146
    .line 147
    iget-object v4, p0, Lnw;->V:Landroid/animation/TimeInterpolator;

    .line 148
    .line 149
    invoke-static {v1, v3, p1, v4}, Lnw;->g(FFFLandroid/animation/TimeInterpolator;)F

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    iput v1, p0, Lnw;->v:F

    .line 154
    .line 155
    iget v1, p0, Lnw;->r:F

    .line 156
    .line 157
    iget v3, p0, Lnw;->s:F

    .line 158
    .line 159
    iget-object v4, p0, Lnw;->V:Landroid/animation/TimeInterpolator;

    .line 160
    .line 161
    invoke-static {v1, v3, p1, v4}, Lnw;->g(FFFLandroid/animation/TimeInterpolator;)F

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    iput v1, p0, Lnw;->w:F

    .line 166
    .line 167
    invoke-virtual {p0, p1}, Lnw;->r(F)V

    .line 168
    .line 169
    .line 170
    move v1, p1

    .line 171
    :goto_2
    sub-float v3, v2, p1

    .line 172
    .line 173
    sget-object v4, Lu8;->b:Lxg0;

    .line 174
    .line 175
    invoke-static {v0, v2, v3, v4}, Lnw;->g(FFFLandroid/animation/TimeInterpolator;)F

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    sub-float v3, v2, v3

    .line 180
    .line 181
    iput v3, p0, Lnw;->k0:F

    .line 182
    .line 183
    sget-object v3, Le33;->a:Ljava/util/WeakHashMap;

    .line 184
    .line 185
    iget-object v3, p0, Lnw;->a:Landroid/view/ViewGroup;

    .line 186
    .line 187
    invoke-virtual {v3}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 188
    .line 189
    .line 190
    invoke-static {v2, v0, p1, v4}, Lnw;->g(FFFLandroid/animation/TimeInterpolator;)F

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    iput v5, p0, Lnw;->l0:F

    .line 195
    .line 196
    invoke-virtual {v3}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 197
    .line 198
    .line 199
    iget-object v5, p0, Lnw;->p:Landroid/content/res/ColorStateList;

    .line 200
    .line 201
    iget-object v6, p0, Lnw;->o:Landroid/content/res/ColorStateList;

    .line 202
    .line 203
    iget-object v7, p0, Lnw;->T:Landroid/text/TextPaint;

    .line 204
    .line 205
    if-eq v5, v6, :cond_6

    .line 206
    .line 207
    invoke-virtual {p0, v6}, Lnw;->f(Landroid/content/res/ColorStateList;)I

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    iget-object v6, p0, Lnw;->p:Landroid/content/res/ColorStateList;

    .line 212
    .line 213
    invoke-virtual {p0, v6}, Lnw;->f(Landroid/content/res/ColorStateList;)I

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    invoke-static {v5, v1, v6}, Lnw;->a(IFI)I

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_6
    invoke-virtual {p0, v5}, Lnw;->f(Landroid/content/res/ColorStateList;)I

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 230
    .line 231
    .line 232
    :goto_3
    iget v1, p0, Lnw;->f0:F

    .line 233
    .line 234
    iget v5, p0, Lnw;->g0:F

    .line 235
    .line 236
    cmpl-float v6, v1, v5

    .line 237
    .line 238
    if-eqz v6, :cond_7

    .line 239
    .line 240
    invoke-static {v5, v1, p1, v4}, Lnw;->g(FFFLandroid/animation/TimeInterpolator;)F

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 245
    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_7
    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 249
    .line 250
    .line 251
    :goto_4
    iget v1, p0, Lnw;->b0:F

    .line 252
    .line 253
    iget v4, p0, Lnw;->X:F

    .line 254
    .line 255
    invoke-static {v1, v4, p1}, Lu8;->a(FFF)F

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    iput v1, p0, Lnw;->N:F

    .line 260
    .line 261
    iget v1, p0, Lnw;->c0:F

    .line 262
    .line 263
    iget v4, p0, Lnw;->Y:F

    .line 264
    .line 265
    invoke-static {v1, v4, p1}, Lu8;->a(FFF)F

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    iput v1, p0, Lnw;->O:F

    .line 270
    .line 271
    iget v1, p0, Lnw;->d0:F

    .line 272
    .line 273
    iget v4, p0, Lnw;->Z:F

    .line 274
    .line 275
    invoke-static {v1, v4, p1}, Lu8;->a(FFF)F

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    iput v1, p0, Lnw;->P:F

    .line 280
    .line 281
    iget-object v1, p0, Lnw;->e0:Landroid/content/res/ColorStateList;

    .line 282
    .line 283
    invoke-virtual {p0, v1}, Lnw;->f(Landroid/content/res/ColorStateList;)I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    iget-object v4, p0, Lnw;->a0:Landroid/content/res/ColorStateList;

    .line 288
    .line 289
    invoke-virtual {p0, v4}, Lnw;->f(Landroid/content/res/ColorStateList;)I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    invoke-static {v1, p1, v4}, Lnw;->a(IFI)I

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    iput v1, p0, Lnw;->Q:I

    .line 298
    .line 299
    iget v4, p0, Lnw;->N:F

    .line 300
    .line 301
    iget v5, p0, Lnw;->O:F

    .line 302
    .line 303
    iget v6, p0, Lnw;->P:F

    .line 304
    .line 305
    invoke-virtual {v7, v4, v5, v6, v1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 306
    .line 307
    .line 308
    iget-boolean v1, p0, Lnw;->d:Z

    .line 309
    .line 310
    if-eqz v1, :cond_9

    .line 311
    .line 312
    invoke-virtual {v7}, Landroid/graphics/Paint;->getAlpha()I

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    iget v4, p0, Lnw;->f:F

    .line 317
    .line 318
    cmpg-float v5, p1, v4

    .line 319
    .line 320
    if-gtz v5, :cond_8

    .line 321
    .line 322
    iget p0, p0, Lnw;->e:F

    .line 323
    .line 324
    invoke-static {v2, v0, p0, v4, p1}, Lu8;->b(FFFFF)F

    .line 325
    .line 326
    .line 327
    move-result p0

    .line 328
    goto :goto_5

    .line 329
    :cond_8
    invoke-static {v0, v2, v4, v2, p1}, Lu8;->b(FFFFF)F

    .line 330
    .line 331
    .line 332
    move-result p0

    .line 333
    :goto_5
    int-to-float p1, v1

    .line 334
    mul-float/2addr p0, p1

    .line 335
    float-to-int p0, p0

    .line 336
    invoke-virtual {v7, p0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 337
    .line 338
    .line 339
    :cond_9
    invoke-virtual {v3}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 340
    .line 341
    .line 342
    :cond_a
    return-void
.end method

.method public final r(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lnw;->c(FZ)V

    .line 3
    .line 4
    .line 5
    sget-object p1, Le33;->a:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    iget-object p0, p0, Lnw;->a:Landroid/view/ViewGroup;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

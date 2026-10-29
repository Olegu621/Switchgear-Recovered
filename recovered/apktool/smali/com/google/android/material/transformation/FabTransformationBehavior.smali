.class public abstract Lcom/google/android/material/transformation/FabTransformationBehavior;
.super Lcom/google/android/material/transformation/ExpandableTransformationBehavior;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final c:Landroid/graphics/Rect;

.field public final d:Landroid/graphics/RectF;

.field public final e:Landroid/graphics/RectF;

.field public final f:[I

.field public g:F

.field public h:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;-><init>()V

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
    iput-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->c:Landroid/graphics/Rect;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/RectF;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->d:Landroid/graphics/RectF;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/RectF;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->e:Landroid/graphics/RectF;

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    new-array v0, v0, [I

    .line 27
    .line 28
    iput-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->f:[I

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->c:Landroid/graphics/Rect;

    .line 33
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->d:Landroid/graphics/RectF;

    .line 34
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->e:Landroid/graphics/RectF;

    const/4 p1, 0x2

    .line 35
    new-array p1, p1, [I

    iput-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->f:[I

    return-void
.end method

.method public static u(FFZLwc0;)Landroid/util/Pair;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float p0, p0, v0

    .line 3
    .line 4
    if-eqz p0, :cond_4

    .line 5
    .line 6
    cmpl-float p0, p1, v0

    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    cmpg-float p1, p1, v0

    .line 14
    .line 15
    if-ltz p1, :cond_2

    .line 16
    .line 17
    :cond_1
    if-nez p2, :cond_3

    .line 18
    .line 19
    if-lez p0, :cond_3

    .line 20
    .line 21
    :cond_2
    iget-object p0, p3, Lwc0;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lmk1;

    .line 24
    .line 25
    const-string p1, "translationXCurveUpwards"

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lmk1;->f(Ljava/lang/String;)Lnk1;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-object p1, p3, Lwc0;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Lmk1;

    .line 34
    .line 35
    const-string p2, "translationYCurveUpwards"

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Lmk1;->f(Ljava/lang/String;)Lnk1;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    iget-object p0, p3, Lwc0;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lmk1;

    .line 45
    .line 46
    const-string p1, "translationXCurveDownwards"

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lmk1;->f(Ljava/lang/String;)Lnk1;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    iget-object p1, p3, Lwc0;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Lmk1;

    .line 55
    .line 56
    const-string p2, "translationYCurveDownwards"

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Lmk1;->f(Ljava/lang/String;)Lnk1;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    goto :goto_1

    .line 63
    :cond_4
    :goto_0
    iget-object p0, p3, Lwc0;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, Lmk1;

    .line 66
    .line 67
    const-string p1, "translationXLinear"

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lmk1;->f(Ljava/lang/String;)Lnk1;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    iget-object p1, p3, Lwc0;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, Lmk1;

    .line 76
    .line 77
    const-string p2, "translationYLinear"

    .line 78
    .line 79
    invoke-virtual {p1, p2}, Lmk1;->f(Ljava/lang/String;)Lnk1;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    :goto_1
    new-instance p2, Landroid/util/Pair;

    .line 84
    .line 85
    invoke-direct {p2, p0, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return-object p2
.end method

.method public static x(Lwc0;Lnk1;F)F
    .locals 8

    .line 1
    iget-wide v0, p1, Lnk1;->a:J

    .line 2
    .line 3
    iget-wide v2, p1, Lnk1;->b:J

    .line 4
    .line 5
    iget-object p0, p0, Lwc0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lmk1;

    .line 8
    .line 9
    const-string v4, "expansion"

    .line 10
    .line 11
    invoke-virtual {p0, v4}, Lmk1;->f(Ljava/lang/String;)Lnk1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-wide v4, p0, Lnk1;->a:J

    .line 16
    .line 17
    iget-wide v6, p0, Lnk1;->b:J

    .line 18
    .line 19
    add-long/2addr v4, v6

    .line 20
    const-wide/16 v6, 0x11

    .line 21
    .line 22
    add-long/2addr v4, v6

    .line 23
    sub-long/2addr v4, v0

    .line 24
    long-to-float p0, v4

    .line 25
    long-to-float v0, v2

    .line 26
    div-float/2addr p0, v0

    .line 27
    invoke-virtual {p1}, Lnk1;->b()Landroid/animation/TimeInterpolator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p1, p0}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    const/4 p1, 0x0

    .line 36
    invoke-static {p2, p1, p0}, Lu8;->a(FFF)F

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0
.end method


# virtual methods
.method public final b(Landroid/view/View;Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x8

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eq p0, v0, :cond_2

    .line 9
    .line 10
    instance-of p0, p2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 11
    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    check-cast p2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 15
    .line 16
    invoke-virtual {p2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getExpandedComponentIdHint()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-ne p0, p1, :cond_1

    .line 27
    .line 28
    :cond_0
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_1
    return v1

    .line 31
    :cond_2
    const-string p0, "This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead."

    .line 32
    .line 33
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return v1
.end method

.method public final c(Landroidx/coordinatorlayout/widget/c;)V
    .locals 0

    .line 1
    iget p0, p1, Landroidx/coordinatorlayout/widget/c;->h:I

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/16 p0, 0x50

    .line 6
    .line 7
    iput p0, p1, Landroidx/coordinatorlayout/widget/c;->h:I

    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final t(Landroid/view/View;Landroid/view/View;ZZ)Landroid/animation/AnimatorSet;
    .locals 28

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
    move/from16 v3, p3

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {v0, v4, v3}, Lcom/google/android/material/transformation/FabTransformationBehavior;->z(Landroid/content/Context;Z)Lwc0;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/view/View;->getTranslationX()F

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    iput v5, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->g:F

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/view/View;->getTranslationY()F

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    iput v5, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->h:F

    .line 30
    .line 31
    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v6, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    sget-object v7, Le33;->a:Ljava/util/WeakHashMap;

    .line 42
    .line 43
    invoke-static {v2}, Ls23;->i(Landroid/view/View;)F

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    invoke-static {v1}, Ls23;->i(Landroid/view/View;)F

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    sub-float/2addr v7, v8

    .line 52
    const/4 v8, 0x1

    .line 53
    const/4 v9, 0x0

    .line 54
    const/4 v10, 0x0

    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    if-nez p4, :cond_1

    .line 58
    .line 59
    neg-float v7, v7

    .line 60
    invoke-virtual {v2, v7}, Landroid/view/View;->setTranslationZ(F)V

    .line 61
    .line 62
    .line 63
    :cond_1
    sget-object v7, Landroid/view/View;->TRANSLATION_Z:Landroid/util/Property;

    .line 64
    .line 65
    new-array v11, v8, [F

    .line 66
    .line 67
    aput v9, v11, v10

    .line 68
    .line 69
    invoke-static {v2, v7, v11}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    goto :goto_0

    .line 74
    :cond_2
    sget-object v11, Landroid/view/View;->TRANSLATION_Z:Landroid/util/Property;

    .line 75
    .line 76
    neg-float v7, v7

    .line 77
    new-array v12, v8, [F

    .line 78
    .line 79
    aput v7, v12, v10

    .line 80
    .line 81
    invoke-static {v2, v11, v12}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    :goto_0
    iget-object v11, v4, Lwc0;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v11, Lmk1;

    .line 88
    .line 89
    const-string v12, "elevation"

    .line 90
    .line 91
    invoke-virtual {v11, v12}, Lmk1;->f(Ljava/lang/String;)Lnk1;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    invoke-virtual {v11, v7}, Lnk1;->a(Landroid/animation/Animator;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    iget-object v7, v4, Lwc0;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v7, Lzb0;

    .line 104
    .line 105
    invoke-virtual {v0, v1, v2, v7}, Lcom/google/android/material/transformation/FabTransformationBehavior;->v(Landroid/view/View;Landroid/view/View;Lzb0;)F

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    iget-object v11, v4, Lwc0;->c:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v11, Lzb0;

    .line 112
    .line 113
    invoke-virtual {v0, v1, v2, v11}, Lcom/google/android/material/transformation/FabTransformationBehavior;->w(Landroid/view/View;Landroid/view/View;Lzb0;)F

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    invoke-static {v7, v11, v3, v4}, Lcom/google/android/material/transformation/FabTransformationBehavior;->u(FFZLwc0;)Landroid/util/Pair;

    .line 118
    .line 119
    .line 120
    move-result-object v12

    .line 121
    iget-object v13, v12, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v13, Lnk1;

    .line 124
    .line 125
    iget-object v12, v12, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v12, Lnk1;

    .line 128
    .line 129
    iget-object v14, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->e:Landroid/graphics/RectF;

    .line 130
    .line 131
    iget-object v15, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->c:Landroid/graphics/Rect;

    .line 132
    .line 133
    move/from16 v16, v10

    .line 134
    .line 135
    iget-object v10, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->d:Landroid/graphics/RectF;

    .line 136
    .line 137
    if-eqz v3, :cond_4

    .line 138
    .line 139
    move/from16 v17, v9

    .line 140
    .line 141
    if-nez p4, :cond_3

    .line 142
    .line 143
    neg-float v9, v7

    .line 144
    invoke-virtual {v2, v9}, Landroid/view/View;->setTranslationX(F)V

    .line 145
    .line 146
    .line 147
    neg-float v9, v11

    .line 148
    invoke-virtual {v2, v9}, Landroid/view/View;->setTranslationY(F)V

    .line 149
    .line 150
    .line 151
    :cond_3
    sget-object v9, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    .line 152
    .line 153
    move-object/from16 v18, v6

    .line 154
    .line 155
    new-array v6, v8, [F

    .line 156
    .line 157
    aput v17, v6, v16

    .line 158
    .line 159
    invoke-static {v2, v9, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    sget-object v9, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    .line 164
    .line 165
    move-object/from16 v19, v6

    .line 166
    .line 167
    new-array v6, v8, [F

    .line 168
    .line 169
    aput v17, v6, v16

    .line 170
    .line 171
    invoke-static {v2, v9, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    neg-float v7, v7

    .line 176
    neg-float v9, v11

    .line 177
    invoke-static {v4, v13, v7}, Lcom/google/android/material/transformation/FabTransformationBehavior;->x(Lwc0;Lnk1;F)F

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    invoke-static {v4, v12, v9}, Lcom/google/android/material/transformation/FabTransformationBehavior;->x(Lwc0;Lnk1;F)F

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    invoke-virtual {v2, v15}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v10, v15}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v2, v14}, Lcom/google/android/material/transformation/FabTransformationBehavior;->y(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v14, v7, v9}, Landroid/graphics/RectF;->offset(FF)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v14, v10}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    .line 198
    .line 199
    .line 200
    invoke-virtual {v10, v14}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 201
    .line 202
    .line 203
    move-object v7, v6

    .line 204
    move-object/from16 v6, v19

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_4
    move-object/from16 v18, v6

    .line 208
    .line 209
    move/from16 v17, v9

    .line 210
    .line 211
    sget-object v6, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    .line 212
    .line 213
    neg-float v7, v7

    .line 214
    new-array v9, v8, [F

    .line 215
    .line 216
    aput v7, v9, v16

    .line 217
    .line 218
    invoke-static {v2, v6, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    sget-object v7, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    .line 223
    .line 224
    neg-float v9, v11

    .line 225
    new-array v11, v8, [F

    .line 226
    .line 227
    aput v9, v11, v16

    .line 228
    .line 229
    invoke-static {v2, v7, v11}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    :goto_1
    invoke-virtual {v13, v6}, Lnk1;->a(Landroid/animation/Animator;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12, v7}, Lnk1;->a(Landroid/animation/Animator;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    invoke-virtual {v10}, Landroid/graphics/RectF;->width()F

    .line 246
    .line 247
    .line 248
    move-result v6

    .line 249
    invoke-virtual {v10}, Landroid/graphics/RectF;->height()F

    .line 250
    .line 251
    .line 252
    move-result v7

    .line 253
    iget-object v9, v4, Lwc0;->c:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v9, Lzb0;

    .line 256
    .line 257
    invoke-virtual {v0, v1, v2, v9}, Lcom/google/android/material/transformation/FabTransformationBehavior;->v(Landroid/view/View;Landroid/view/View;Lzb0;)F

    .line 258
    .line 259
    .line 260
    move-result v9

    .line 261
    iget-object v11, v4, Lwc0;->c:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v11, Lzb0;

    .line 264
    .line 265
    invoke-virtual {v0, v1, v2, v11}, Lcom/google/android/material/transformation/FabTransformationBehavior;->w(Landroid/view/View;Landroid/view/View;Lzb0;)F

    .line 266
    .line 267
    .line 268
    move-result v11

    .line 269
    invoke-static {v9, v11, v3, v4}, Lcom/google/android/material/transformation/FabTransformationBehavior;->u(FFZLwc0;)Landroid/util/Pair;

    .line 270
    .line 271
    .line 272
    move-result-object v12

    .line 273
    iget-object v13, v12, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v13, Lnk1;

    .line 276
    .line 277
    iget-object v12, v12, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v12, Lnk1;

    .line 280
    .line 281
    sget-object v8, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    .line 282
    .line 283
    if-eqz v3, :cond_5

    .line 284
    .line 285
    :goto_2
    move/from16 v19, v9

    .line 286
    .line 287
    move/from16 v20, v11

    .line 288
    .line 289
    const/4 v9, 0x1

    .line 290
    goto :goto_3

    .line 291
    :cond_5
    iget v9, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->g:F

    .line 292
    .line 293
    goto :goto_2

    .line 294
    :goto_3
    new-array v11, v9, [F

    .line 295
    .line 296
    aput v19, v11, v16

    .line 297
    .line 298
    invoke-static {v1, v8, v11}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 299
    .line 300
    .line 301
    move-result-object v8

    .line 302
    sget-object v11, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    .line 303
    .line 304
    if-eqz v3, :cond_6

    .line 305
    .line 306
    goto :goto_4

    .line 307
    :cond_6
    iget v3, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->h:F

    .line 308
    .line 309
    move/from16 v20, v3

    .line 310
    .line 311
    :goto_4
    new-array v3, v9, [F

    .line 312
    .line 313
    aput v20, v3, v16

    .line 314
    .line 315
    invoke-static {v1, v11, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-virtual {v13, v8}, Lnk1;->a(Landroid/animation/Animator;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12, v3}, Lnk1;->a(Landroid/animation/Animator;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    instance-of v3, v2, Lav;

    .line 332
    .line 333
    if-eqz v3, :cond_7

    .line 334
    .line 335
    instance-of v8, v1, Landroid/widget/ImageView;

    .line 336
    .line 337
    if-nez v8, :cond_8

    .line 338
    .line 339
    :cond_7
    :goto_5
    move-object/from16 v8, v18

    .line 340
    .line 341
    goto :goto_7

    .line 342
    :cond_8
    move-object v8, v2

    .line 343
    check-cast v8, Lav;

    .line 344
    .line 345
    move-object v9, v1

    .line 346
    check-cast v9, Landroid/widget/ImageView;

    .line 347
    .line 348
    invoke-virtual {v9}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 349
    .line 350
    .line 351
    move-result-object v9

    .line 352
    if-nez v9, :cond_9

    .line 353
    .line 354
    goto :goto_5

    .line 355
    :cond_9
    invoke-virtual {v9}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 356
    .line 357
    .line 358
    const/16 v11, 0xff

    .line 359
    .line 360
    if-eqz p3, :cond_b

    .line 361
    .line 362
    if-nez p4, :cond_a

    .line 363
    .line 364
    invoke-virtual {v9, v11}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 365
    .line 366
    .line 367
    :cond_a
    sget-object v11, Lr90;->a:Lr90;

    .line 368
    .line 369
    filled-new-array/range {v16 .. v16}, [I

    .line 370
    .line 371
    .line 372
    move-result-object v12

    .line 373
    invoke-static {v9, v11, v12}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Landroid/util/Property;[I)Landroid/animation/ObjectAnimator;

    .line 374
    .line 375
    .line 376
    move-result-object v11

    .line 377
    goto :goto_6

    .line 378
    :cond_b
    sget-object v12, Lr90;->a:Lr90;

    .line 379
    .line 380
    filled-new-array {v11}, [I

    .line 381
    .line 382
    .line 383
    move-result-object v11

    .line 384
    invoke-static {v9, v12, v11}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Landroid/util/Property;[I)Landroid/animation/ObjectAnimator;

    .line 385
    .line 386
    .line 387
    move-result-object v11

    .line 388
    :goto_6
    new-instance v12, Lsk;

    .line 389
    .line 390
    const/4 v13, 0x3

    .line 391
    invoke-direct {v12, v2, v13}, Lsk;-><init>(Ljava/lang/Object;I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v11, v12}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 395
    .line 396
    .line 397
    iget-object v12, v4, Lwc0;->b:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v12, Lmk1;

    .line 400
    .line 401
    const-string v13, "iconFade"

    .line 402
    .line 403
    invoke-virtual {v12, v13}, Lmk1;->f(Ljava/lang/String;)Lnk1;

    .line 404
    .line 405
    .line 406
    move-result-object v12

    .line 407
    invoke-virtual {v12, v11}, Lnk1;->a(Landroid/animation/Animator;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    new-instance v11, Lqg0;

    .line 414
    .line 415
    invoke-direct {v11, v8, v9}, Lqg0;-><init>(Lav;Landroid/graphics/drawable/Drawable;)V

    .line 416
    .line 417
    .line 418
    move-object/from16 v8, v18

    .line 419
    .line 420
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    :goto_7
    if-nez v3, :cond_c

    .line 424
    .line 425
    move/from16 v18, v3

    .line 426
    .line 427
    goto/16 :goto_a

    .line 428
    .line 429
    :cond_c
    move-object v9, v2

    .line 430
    check-cast v9, Lav;

    .line 431
    .line 432
    iget-object v11, v4, Lwc0;->c:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v11, Lzb0;

    .line 435
    .line 436
    invoke-virtual {v0, v1, v10}, Lcom/google/android/material/transformation/FabTransformationBehavior;->y(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 437
    .line 438
    .line 439
    iget v12, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->g:F

    .line 440
    .line 441
    iget v13, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->h:F

    .line 442
    .line 443
    invoke-virtual {v10, v12, v13}, Landroid/graphics/RectF;->offset(FF)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v0, v2, v14}, Lcom/google/android/material/transformation/FabTransformationBehavior;->y(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v0, v1, v2, v11}, Lcom/google/android/material/transformation/FabTransformationBehavior;->v(Landroid/view/View;Landroid/view/View;Lzb0;)F

    .line 450
    .line 451
    .line 452
    move-result v11

    .line 453
    neg-float v11, v11

    .line 454
    move/from16 v12, v17

    .line 455
    .line 456
    invoke-virtual {v14, v11, v12}, Landroid/graphics/RectF;->offset(FF)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v10}, Landroid/graphics/RectF;->centerX()F

    .line 460
    .line 461
    .line 462
    move-result v11

    .line 463
    iget v12, v14, Landroid/graphics/RectF;->left:F

    .line 464
    .line 465
    sub-float/2addr v11, v12

    .line 466
    iget-object v12, v4, Lwc0;->c:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v12, Lzb0;

    .line 469
    .line 470
    invoke-virtual {v0, v1, v10}, Lcom/google/android/material/transformation/FabTransformationBehavior;->y(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 471
    .line 472
    .line 473
    iget v13, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->g:F

    .line 474
    .line 475
    move/from16 v18, v3

    .line 476
    .line 477
    iget v3, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->h:F

    .line 478
    .line 479
    invoke-virtual {v10, v13, v3}, Landroid/graphics/RectF;->offset(FF)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v0, v2, v14}, Lcom/google/android/material/transformation/FabTransformationBehavior;->y(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0, v1, v2, v12}, Lcom/google/android/material/transformation/FabTransformationBehavior;->w(Landroid/view/View;Landroid/view/View;Lzb0;)F

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    neg-float v0, v0

    .line 490
    const/4 v12, 0x0

    .line 491
    invoke-virtual {v14, v12, v0}, Landroid/graphics/RectF;->offset(FF)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v10}, Landroid/graphics/RectF;->centerY()F

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    iget v3, v14, Landroid/graphics/RectF;->top:F

    .line 499
    .line 500
    sub-float/2addr v0, v3

    .line 501
    move-object v3, v1

    .line 502
    check-cast v3, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 503
    .line 504
    invoke-virtual {v3}, Landroid/view/View;->isLaidOut()Z

    .line 505
    .line 506
    .line 507
    move-result v10

    .line 508
    if-eqz v10, :cond_d

    .line 509
    .line 510
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 511
    .line 512
    .line 513
    move-result v10

    .line 514
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 515
    .line 516
    .line 517
    move-result v12

    .line 518
    move/from16 v13, v16

    .line 519
    .line 520
    invoke-virtual {v15, v13, v13, v10, v12}, Landroid/graphics/Rect;->set(IIII)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v3, v15}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->j(Landroid/graphics/Rect;)V

    .line 524
    .line 525
    .line 526
    :cond_d
    invoke-virtual {v15}, Landroid/graphics/Rect;->width()I

    .line 527
    .line 528
    .line 529
    move-result v3

    .line 530
    int-to-float v3, v3

    .line 531
    const/high16 v10, 0x40000000    # 2.0f

    .line 532
    .line 533
    div-float/2addr v3, v10

    .line 534
    iget-object v10, v4, Lwc0;->b:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast v10, Lmk1;

    .line 537
    .line 538
    const-string v12, "expansion"

    .line 539
    .line 540
    invoke-virtual {v10, v12}, Lmk1;->f(Ljava/lang/String;)Lnk1;

    .line 541
    .line 542
    .line 543
    move-result-object v10

    .line 544
    const-wide/16 v12, 0x0

    .line 545
    .line 546
    if-eqz p3, :cond_10

    .line 547
    .line 548
    if-nez p4, :cond_e

    .line 549
    .line 550
    new-instance v14, Lzu;

    .line 551
    .line 552
    invoke-direct {v14, v11, v0, v3}, Lzu;-><init>(FFF)V

    .line 553
    .line 554
    .line 555
    invoke-interface {v9, v14}, Lav;->setRevealInfo(Lzu;)V

    .line 556
    .line 557
    .line 558
    :cond_e
    if-eqz p4, :cond_f

    .line 559
    .line 560
    invoke-interface {v9}, Lav;->getRevealInfo()Lzu;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    iget v3, v3, Lzu;->c:F

    .line 565
    .line 566
    :cond_f
    invoke-static {v11, v0, v6, v7}, Lpg3;->h(FFFF)F

    .line 567
    .line 568
    .line 569
    move-result v6

    .line 570
    invoke-static {v9, v11, v0, v6}, Lpy0;->O(Lav;FFF)Landroid/animation/AnimatorSet;

    .line 571
    .line 572
    .line 573
    move-result-object v6

    .line 574
    new-instance v7, Lvu;

    .line 575
    .line 576
    const/4 v14, 0x1

    .line 577
    invoke-direct {v7, v9, v14}, Lvu;-><init>(Lav;I)V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v6, v7}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 581
    .line 582
    .line 583
    iget-wide v14, v10, Lnk1;->a:J

    .line 584
    .line 585
    float-to-int v7, v11

    .line 586
    float-to-int v0, v0

    .line 587
    cmp-long v11, v14, v12

    .line 588
    .line 589
    if-lez v11, :cond_14

    .line 590
    .line 591
    invoke-static {v2, v7, v0, v3, v3}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    invoke-virtual {v0, v12, v13}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 596
    .line 597
    .line 598
    invoke-virtual {v0, v14, v15}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    goto :goto_9

    .line 605
    :cond_10
    invoke-interface {v9}, Lav;->getRevealInfo()Lzu;

    .line 606
    .line 607
    .line 608
    move-result-object v6

    .line 609
    iget v6, v6, Lzu;->c:F

    .line 610
    .line 611
    invoke-static {v9, v11, v0, v3}, Lpy0;->O(Lav;FFF)Landroid/animation/AnimatorSet;

    .line 612
    .line 613
    .line 614
    move-result-object v7

    .line 615
    iget-wide v14, v10, Lnk1;->a:J

    .line 616
    .line 617
    float-to-int v11, v11

    .line 618
    float-to-int v0, v0

    .line 619
    cmp-long v20, v14, v12

    .line 620
    .line 621
    if-lez v20, :cond_11

    .line 622
    .line 623
    invoke-static {v2, v11, v0, v6, v6}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    .line 624
    .line 625
    .line 626
    move-result-object v6

    .line 627
    invoke-virtual {v6, v12, v13}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v6, v14, v15}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    :cond_11
    iget-wide v14, v10, Lnk1;->a:J

    .line 637
    .line 638
    iget-wide v12, v10, Lnk1;->b:J

    .line 639
    .line 640
    iget-object v6, v4, Lwc0;->b:Ljava/lang/Object;

    .line 641
    .line 642
    check-cast v6, Lmk1;

    .line 643
    .line 644
    iget-object v6, v6, Lmk1;->a:Lle2;

    .line 645
    .line 646
    move-object/from16 p0, v7

    .line 647
    .line 648
    iget v7, v6, Lle2;->c:I

    .line 649
    .line 650
    move-wide/from16 v22, v12

    .line 651
    .line 652
    move-wide/from16 v20, v14

    .line 653
    .line 654
    const-wide/16 v12, 0x0

    .line 655
    .line 656
    const/4 v14, 0x0

    .line 657
    :goto_8
    if-ge v14, v7, :cond_12

    .line 658
    .line 659
    invoke-virtual {v6, v14}, Lle2;->j(I)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v15

    .line 663
    check-cast v15, Lnk1;

    .line 664
    .line 665
    move-object/from16 v24, v6

    .line 666
    .line 667
    move/from16 v25, v7

    .line 668
    .line 669
    iget-wide v6, v15, Lnk1;->a:J

    .line 670
    .line 671
    move-wide/from16 v26, v6

    .line 672
    .line 673
    iget-wide v6, v15, Lnk1;->b:J

    .line 674
    .line 675
    add-long v6, v26, v6

    .line 676
    .line 677
    invoke-static {v12, v13, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 678
    .line 679
    .line 680
    move-result-wide v12

    .line 681
    add-int/lit8 v14, v14, 0x1

    .line 682
    .line 683
    move-object/from16 v6, v24

    .line 684
    .line 685
    move/from16 v7, v25

    .line 686
    .line 687
    goto :goto_8

    .line 688
    :cond_12
    add-long v14, v20, v22

    .line 689
    .line 690
    cmp-long v6, v14, v12

    .line 691
    .line 692
    if-gez v6, :cond_13

    .line 693
    .line 694
    invoke-static {v2, v11, v0, v3, v3}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    invoke-virtual {v0, v14, v15}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 699
    .line 700
    .line 701
    sub-long/2addr v12, v14

    .line 702
    invoke-virtual {v0, v12, v13}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 703
    .line 704
    .line 705
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 706
    .line 707
    .line 708
    :cond_13
    move-object/from16 v6, p0

    .line 709
    .line 710
    :cond_14
    :goto_9
    invoke-virtual {v10, v6}, Lnk1;->a(Landroid/animation/Animator;)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 714
    .line 715
    .line 716
    new-instance v0, Lvu;

    .line 717
    .line 718
    const/4 v13, 0x0

    .line 719
    invoke-direct {v0, v9, v13}, Lvu;-><init>(Lav;I)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 723
    .line 724
    .line 725
    :goto_a
    if-nez v18, :cond_15

    .line 726
    .line 727
    goto :goto_d

    .line 728
    :cond_15
    move-object v0, v2

    .line 729
    check-cast v0, Lav;

    .line 730
    .line 731
    sget-object v3, Le33;->a:Ljava/util/WeakHashMap;

    .line 732
    .line 733
    invoke-static {v1}, Ls23;->g(Landroid/view/View;)Landroid/content/res/ColorStateList;

    .line 734
    .line 735
    .line 736
    move-result-object v3

    .line 737
    if-eqz v3, :cond_16

    .line 738
    .line 739
    invoke-virtual {v1}, Landroid/view/View;->getDrawableState()[I

    .line 740
    .line 741
    .line 742
    move-result-object v6

    .line 743
    invoke-virtual {v3}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 744
    .line 745
    .line 746
    move-result v7

    .line 747
    invoke-virtual {v3, v6, v7}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 748
    .line 749
    .line 750
    move-result v3

    .line 751
    goto :goto_b

    .line 752
    :cond_16
    const/4 v3, 0x0

    .line 753
    :goto_b
    const v6, 0xffffff

    .line 754
    .line 755
    .line 756
    and-int/2addr v6, v3

    .line 757
    if-eqz p3, :cond_18

    .line 758
    .line 759
    if-nez p4, :cond_17

    .line 760
    .line 761
    invoke-interface {v0, v3}, Lav;->setCircularRevealScrimColor(I)V

    .line 762
    .line 763
    .line 764
    :cond_17
    sget-object v3, Lyu;->a:Lyu;

    .line 765
    .line 766
    filled-new-array {v6}, [I

    .line 767
    .line 768
    .line 769
    move-result-object v6

    .line 770
    invoke-static {v0, v3, v6}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Landroid/util/Property;[I)Landroid/animation/ObjectAnimator;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    goto :goto_c

    .line 775
    :cond_18
    sget-object v6, Lyu;->a:Lyu;

    .line 776
    .line 777
    filled-new-array {v3}, [I

    .line 778
    .line 779
    .line 780
    move-result-object v3

    .line 781
    invoke-static {v0, v6, v3}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Landroid/util/Property;[I)Landroid/animation/ObjectAnimator;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    :goto_c
    sget-object v3, Lyc;->b:Lyc;

    .line 786
    .line 787
    invoke-virtual {v0, v3}, Landroid/animation/ValueAnimator;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    .line 788
    .line 789
    .line 790
    iget-object v3, v4, Lwc0;->b:Ljava/lang/Object;

    .line 791
    .line 792
    check-cast v3, Lmk1;

    .line 793
    .line 794
    const-string v6, "color"

    .line 795
    .line 796
    invoke-virtual {v3, v6}, Lmk1;->f(Ljava/lang/String;)Lnk1;

    .line 797
    .line 798
    .line 799
    move-result-object v3

    .line 800
    invoke-virtual {v3, v0}, Lnk1;->a(Landroid/animation/Animator;)V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    :goto_d
    instance-of v0, v2, Landroid/view/ViewGroup;

    .line 807
    .line 808
    if-nez v0, :cond_19

    .line 809
    .line 810
    goto :goto_10

    .line 811
    :cond_19
    sget v0, Lcom/google/android/material/R$id;->mtrl_child_content_container:I

    .line 812
    .line 813
    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    const/4 v3, 0x0

    .line 818
    if-eqz v0, :cond_1a

    .line 819
    .line 820
    instance-of v6, v0, Landroid/view/ViewGroup;

    .line 821
    .line 822
    if-eqz v6, :cond_1d

    .line 823
    .line 824
    move-object v3, v0

    .line 825
    check-cast v3, Landroid/view/ViewGroup;

    .line 826
    .line 827
    goto :goto_f

    .line 828
    :cond_1a
    instance-of v0, v2, Lcom/google/android/material/transformation/TransformationChildLayout;

    .line 829
    .line 830
    if-nez v0, :cond_1c

    .line 831
    .line 832
    instance-of v0, v2, Lcom/google/android/material/transformation/TransformationChildCard;

    .line 833
    .line 834
    if-eqz v0, :cond_1b

    .line 835
    .line 836
    goto :goto_e

    .line 837
    :cond_1b
    move-object v3, v2

    .line 838
    check-cast v3, Landroid/view/ViewGroup;

    .line 839
    .line 840
    goto :goto_f

    .line 841
    :cond_1c
    :goto_e
    move-object v0, v2

    .line 842
    check-cast v0, Landroid/view/ViewGroup;

    .line 843
    .line 844
    const/4 v13, 0x0

    .line 845
    invoke-virtual {v0, v13}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    instance-of v6, v0, Landroid/view/ViewGroup;

    .line 850
    .line 851
    if-eqz v6, :cond_1d

    .line 852
    .line 853
    move-object v3, v0

    .line 854
    check-cast v3, Landroid/view/ViewGroup;

    .line 855
    .line 856
    :cond_1d
    :goto_f
    if-nez v3, :cond_1e

    .line 857
    .line 858
    :goto_10
    const/16 v16, 0x0

    .line 859
    .line 860
    goto :goto_12

    .line 861
    :cond_1e
    if-eqz p3, :cond_20

    .line 862
    .line 863
    if-nez p4, :cond_1f

    .line 864
    .line 865
    sget-object v0, Ldu;->a:Ldu;

    .line 866
    .line 867
    const/16 v17, 0x0

    .line 868
    .line 869
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 870
    .line 871
    .line 872
    move-result-object v6

    .line 873
    invoke-virtual {v0, v3, v6}, Ldu;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 874
    .line 875
    .line 876
    :cond_1f
    sget-object v0, Ldu;->a:Ldu;

    .line 877
    .line 878
    const/4 v14, 0x1

    .line 879
    new-array v6, v14, [F

    .line 880
    .line 881
    const/high16 v7, 0x3f800000    # 1.0f

    .line 882
    .line 883
    const/16 v16, 0x0

    .line 884
    .line 885
    aput v7, v6, v16

    .line 886
    .line 887
    invoke-static {v3, v0, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    goto :goto_11

    .line 892
    :cond_20
    const/4 v14, 0x1

    .line 893
    const/16 v16, 0x0

    .line 894
    .line 895
    sget-object v0, Ldu;->a:Ldu;

    .line 896
    .line 897
    new-array v6, v14, [F

    .line 898
    .line 899
    const/16 v17, 0x0

    .line 900
    .line 901
    aput v17, v6, v16

    .line 902
    .line 903
    invoke-static {v3, v0, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    :goto_11
    iget-object v3, v4, Lwc0;->b:Ljava/lang/Object;

    .line 908
    .line 909
    check-cast v3, Lmk1;

    .line 910
    .line 911
    const-string v4, "contentFade"

    .line 912
    .line 913
    invoke-virtual {v3, v4}, Lmk1;->f(Ljava/lang/String;)Lnk1;

    .line 914
    .line 915
    .line 916
    move-result-object v3

    .line 917
    invoke-virtual {v3, v0}, Lnk1;->a(Landroid/animation/Animator;)V

    .line 918
    .line 919
    .line 920
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 921
    .line 922
    .line 923
    :goto_12
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 924
    .line 925
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 926
    .line 927
    .line 928
    invoke-static {v0, v5}, Lw11;->y(Landroid/animation/AnimatorSet;Ljava/util/ArrayList;)V

    .line 929
    .line 930
    .line 931
    new-instance v3, Lpg0;

    .line 932
    .line 933
    move/from16 v4, p3

    .line 934
    .line 935
    invoke-direct {v3, v4, v2, v1}, Lpg0;-><init>(ZLandroid/view/View;Landroid/view/View;)V

    .line 936
    .line 937
    .line 938
    invoke-virtual {v0, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 939
    .line 940
    .line 941
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 942
    .line 943
    .line 944
    move-result v1

    .line 945
    move/from16 v10, v16

    .line 946
    .line 947
    :goto_13
    if-ge v10, v1, :cond_21

    .line 948
    .line 949
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 950
    .line 951
    .line 952
    move-result-object v2

    .line 953
    check-cast v2, Landroid/animation/Animator$AnimatorListener;

    .line 954
    .line 955
    invoke-virtual {v0, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 956
    .line 957
    .line 958
    add-int/lit8 v10, v10, 0x1

    .line 959
    .line 960
    goto :goto_13

    .line 961
    :cond_21
    return-object v0
.end method

.method public final v(Landroid/view/View;Landroid/view/View;Lzb0;)F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->d:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/transformation/FabTransformationBehavior;->y(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 4
    .line 5
    .line 6
    iget p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->g:F

    .line 7
    .line 8
    iget v1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->h:F

    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, Landroid/graphics/RectF;->offset(FF)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->e:Landroid/graphics/RectF;

    .line 14
    .line 15
    invoke-virtual {p0, p2, p1}, Lcom/google/android/material/transformation/FabTransformationBehavior;->y(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    sub-float/2addr p0, p1

    .line 30
    const/4 p1, 0x0

    .line 31
    add-float/2addr p0, p1

    .line 32
    return p0
.end method

.method public final w(Landroid/view/View;Landroid/view/View;Lzb0;)F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->d:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/transformation/FabTransformationBehavior;->y(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 4
    .line 5
    .line 6
    iget p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->g:F

    .line 7
    .line 8
    iget v1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->h:F

    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, Landroid/graphics/RectF;->offset(FF)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->e:Landroid/graphics/RectF;

    .line 14
    .line 15
    invoke-virtual {p0, p2, p1}, Lcom/google/android/material/transformation/FabTransformationBehavior;->y(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerY()F

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    sub-float/2addr p0, p1

    .line 30
    const/4 p1, 0x0

    .line 31
    add-float/2addr p0, p1

    .line 32
    return p0
.end method

.method public final y(Landroid/view/View;Landroid/graphics/RectF;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    int-to-float v1, v1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p2, v2, v2, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->f:[I

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    aget v0, p0, v0

    .line 22
    .line 23
    int-to-float v0, v0

    .line 24
    const/4 v1, 0x1

    .line 25
    aget p0, p0, v1

    .line 26
    .line 27
    int-to-float p0, p0

    .line 28
    invoke-virtual {p2, v0, p0}, Landroid/graphics/RectF;->offsetTo(FF)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    neg-float p0, p0

    .line 36
    float-to-int p0, p0

    .line 37
    int-to-float p0, p0

    .line 38
    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    neg-float p1, p1

    .line 43
    float-to-int p1, p1

    .line 44
    int-to-float p1, p1

    .line 45
    invoke-virtual {p2, p0, p1}, Landroid/graphics/RectF;->offset(FF)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public abstract z(Landroid/content/Context;Z)Lwc0;
.end method

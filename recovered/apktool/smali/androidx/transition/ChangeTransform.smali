.class public Landroidx/transition/ChangeTransform;
.super Landroidx/transition/Transition;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final m0:[Ljava/lang/String;

.field public static final n0:Lms;

.field public static final o0:Lms;

.field public static final p0:Z


# instance fields
.field public final j0:Z

.field public final k0:Z

.field public final l0:Landroid/graphics/Matrix;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "android:changeTransform:transforms"

    .line 2
    .line 3
    const-string v1, "android:changeTransform:parentMatrix"

    .line 4
    .line 5
    const-string v2, "android:changeTransform:matrix"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Landroidx/transition/ChangeTransform;->m0:[Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Lms;

    .line 14
    .line 15
    const-string v1, "nonTranslations"

    .line 16
    .line 17
    const/4 v2, 0x6

    .line 18
    const-class v3, [F

    .line 19
    .line 20
    invoke-direct {v0, v1, v3, v2}, Lms;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Landroidx/transition/ChangeTransform;->n0:Lms;

    .line 24
    .line 25
    new-instance v0, Lms;

    .line 26
    .line 27
    const-string v1, "translations"

    .line 28
    .line 29
    const/4 v2, 0x7

    .line 30
    const-class v3, Landroid/graphics/PointF;

    .line 31
    .line 32
    invoke-direct {v0, v1, v3, v2}, Lms;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Landroidx/transition/ChangeTransform;->o0:Lms;

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    sput-boolean v0, Landroidx/transition/ChangeTransform;->p0:Z

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/transition/Transition;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/transition/ChangeTransform;->j0:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Landroidx/transition/ChangeTransform;->k0:Z

    .line 8
    .line 9
    new-instance v1, Landroid/graphics/Matrix;

    .line 10
    .line 11
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Landroidx/transition/ChangeTransform;->l0:Landroid/graphics/Matrix;

    .line 15
    .line 16
    sget-object v1, Lk50;->g:[I

    .line 17
    .line 18
    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p2, Lorg/xmlpull/v1/XmlPullParser;

    .line 23
    .line 24
    const-string v1, "reparentWithOverlay"

    .line 25
    .line 26
    invoke-static {p2, v1}, Lk50;->y(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    move v1, v0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p1, v0, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    :goto_0
    iput-boolean v1, p0, Landroidx/transition/ChangeTransform;->j0:Z

    .line 39
    .line 40
    const-string v1, "reparent"

    .line 41
    .line 42
    invoke-static {p2, v1}, Lk50;->y(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-nez p2, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const/4 p2, 0x0

    .line 50
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    :goto_1
    iput-boolean v0, p0, Landroidx/transition/ChangeTransform;->k0:Z

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 57
    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final H(Lor2;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lor2;->b:Landroid/view/View;

    .line 2
    .line 3
    iget-object p1, p1, Lor2;->a:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    const-string v1, "android:changeTransform:parent"

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    new-instance v1, Lws;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lws;-><init>(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    const-string v2, "android:changeTransform:transforms"

    .line 29
    .line 30
    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/graphics/Matrix;->isIdentity()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance v2, Landroid/graphics/Matrix;

    .line 47
    .line 48
    invoke-direct {v2, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    :goto_0
    const/4 v2, 0x0

    .line 53
    :goto_1
    const-string v1, "android:changeTransform:matrix"

    .line 54
    .line 55
    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    iget-boolean p0, p0, Landroidx/transition/ChangeTransform;->k0:Z

    .line 59
    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    new-instance p0, Landroid/graphics/Matrix;

    .line 63
    .line 64
    invoke-direct {p0}, Landroid/graphics/Matrix;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Landroid/view/ViewGroup;

    .line 72
    .line 73
    sget-object v2, Ll53;->a:Ln53;

    .line 74
    .line 75
    invoke-virtual {v2, v1, p0}, Ln53;->S(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    neg-int v2, v2

    .line 83
    int-to-float v2, v2

    .line 84
    invoke-virtual {v1}, Landroid/view/View;->getScrollY()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    neg-int v1, v1

    .line 89
    int-to-float v1, v1

    .line 90
    invoke-virtual {p0, v2, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 91
    .line 92
    .line 93
    const-string v1, "android:changeTransform:parentMatrix"

    .line 94
    .line 95
    invoke-virtual {p1, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    sget p0, Landroidx/transition/R$id;->transition_transform:I

    .line 99
    .line 100
    invoke-virtual {v0, p0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    const-string v1, "android:changeTransform:intermediateMatrix"

    .line 105
    .line 106
    invoke-virtual {p1, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    sget p0, Landroidx/transition/R$id;->parent_matrix:I

    .line 110
    .line 111
    invoke-virtual {v0, p0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    const-string v0, "android:changeTransform:intermediateParentMatrix"

    .line 116
    .line 117
    invoke-virtual {p1, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    :cond_3
    :goto_2
    return-void
.end method

.method public final d(Lor2;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/transition/ChangeTransform;->H(Lor2;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final g(Lor2;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/transition/ChangeTransform;->H(Lor2;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Lor2;->b:Landroid/view/View;

    .line 5
    .line 6
    sget-boolean p1, Landroidx/transition/ChangeTransform;->p0:Z

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroid/view/ViewGroup;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final k(Landroid/view/ViewGroup;Lor2;Lor2;)Landroid/animation/Animator;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    move-object/from16 v2, p3

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v9, v0, Lor2;->b:Landroid/view/View;

    .line 12
    .line 13
    iget-object v10, v0, Lor2;->a:Ljava/util/HashMap;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v4, v2, Lor2;->b:Landroid/view/View;

    .line 18
    .line 19
    iget-object v11, v2, Lor2;->a:Ljava/util/HashMap;

    .line 20
    .line 21
    const-string v12, "android:changeTransform:parent"

    .line 22
    .line 23
    invoke-virtual {v10, v12}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {v11, v12}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    :cond_0
    const/16 v16, 0x0

    .line 36
    .line 37
    goto/16 :goto_1b

    .line 38
    .line 39
    :cond_1
    invoke-virtual {v10, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    move-object v13, v0

    .line 44
    check-cast v13, Landroid/view/ViewGroup;

    .line 45
    .line 46
    invoke-virtual {v11, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/view/ViewGroup;

    .line 51
    .line 52
    iget-boolean v2, v1, Landroidx/transition/ChangeTransform;->k0:Z

    .line 53
    .line 54
    const/4 v15, 0x1

    .line 55
    if-eqz v2, :cond_5

    .line 56
    .line 57
    invoke-virtual {v1, v13}, Landroidx/transition/Transition;->s(Landroid/view/View;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_3

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Landroidx/transition/Transition;->s(Landroid/view/View;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-nez v2, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v1, v13, v15}, Landroidx/transition/Transition;->n(Landroid/view/View;Z)Lor2;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-eqz v2, :cond_4

    .line 75
    .line 76
    iget-object v2, v2, Lor2;->b:Landroid/view/View;

    .line 77
    .line 78
    if-ne v0, v2, :cond_4

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    :goto_0
    if-ne v13, v0, :cond_4

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    move v2, v15

    .line 85
    goto :goto_2

    .line 86
    :cond_5
    :goto_1
    const/4 v2, 0x0

    .line 87
    :goto_2
    const-string v0, "android:changeTransform:intermediateMatrix"

    .line 88
    .line 89
    invoke-virtual {v10, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Landroid/graphics/Matrix;

    .line 94
    .line 95
    const-string v3, "android:changeTransform:matrix"

    .line 96
    .line 97
    if-eqz v0, :cond_6

    .line 98
    .line 99
    invoke-virtual {v10, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    :cond_6
    const-string v0, "android:changeTransform:intermediateParentMatrix"

    .line 103
    .line 104
    invoke-virtual {v10, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Landroid/graphics/Matrix;

    .line 109
    .line 110
    const-string v5, "android:changeTransform:parentMatrix"

    .line 111
    .line 112
    if-eqz v0, :cond_7

    .line 113
    .line 114
    invoke-virtual {v10, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    :cond_7
    if-eqz v2, :cond_9

    .line 118
    .line 119
    invoke-virtual {v11, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Landroid/graphics/Matrix;

    .line 124
    .line 125
    sget v6, Landroidx/transition/R$id;->parent_matrix:I

    .line 126
    .line 127
    invoke-virtual {v4, v6, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    iget-object v6, v1, Landroidx/transition/ChangeTransform;->l0:Landroid/graphics/Matrix;

    .line 131
    .line 132
    invoke-virtual {v6}, Landroid/graphics/Matrix;->reset()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v6}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 136
    .line 137
    .line 138
    invoke-virtual {v10, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, Landroid/graphics/Matrix;

    .line 143
    .line 144
    if-nez v0, :cond_8

    .line 145
    .line 146
    new-instance v0, Landroid/graphics/Matrix;

    .line 147
    .line 148
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v10, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    :cond_8
    invoke-virtual {v10, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v16

    .line 158
    move/from16 p2, v15

    .line 159
    .line 160
    move-object/from16 v15, v16

    .line 161
    .line 162
    check-cast v15, Landroid/graphics/Matrix;

    .line 163
    .line 164
    invoke-virtual {v0, v15}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v6}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_9
    move/from16 p2, v15

    .line 172
    .line 173
    :goto_3
    invoke-virtual {v10, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, Landroid/graphics/Matrix;

    .line 178
    .line 179
    invoke-virtual {v11, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    check-cast v3, Landroid/graphics/Matrix;

    .line 184
    .line 185
    if-nez v0, :cond_a

    .line 186
    .line 187
    sget-object v0, Lld1;->a:Lkd1;

    .line 188
    .line 189
    :cond_a
    if-nez v3, :cond_b

    .line 190
    .line 191
    sget-object v3, Lld1;->a:Lkd1;

    .line 192
    .line 193
    :cond_b
    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    const/high16 v15, 0x3f800000    # 1.0f

    .line 198
    .line 199
    const/4 v8, 0x0

    .line 200
    if-eqz v6, :cond_c

    .line 201
    .line 202
    move-object v14, v5

    .line 203
    const/4 v8, 0x0

    .line 204
    const/16 v19, 0x2

    .line 205
    .line 206
    goto/16 :goto_4

    .line 207
    .line 208
    :cond_c
    const-string v6, "android:changeTransform:transforms"

    .line 209
    .line 210
    invoke-virtual {v11, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    check-cast v6, Lws;

    .line 215
    .line 216
    invoke-virtual {v4, v8}, Landroid/view/View;->setTranslationX(F)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v4, v8}, Landroid/view/View;->setTranslationY(F)V

    .line 220
    .line 221
    .line 222
    sget-object v17, Le33;->a:Ljava/util/WeakHashMap;

    .line 223
    .line 224
    invoke-static {v4, v8}, Ls23;->w(Landroid/view/View;F)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4, v15}, Landroid/view/View;->setScaleX(F)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4, v15}, Landroid/view/View;->setScaleY(F)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v4, v8}, Landroid/view/View;->setRotationX(F)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v4, v8}, Landroid/view/View;->setRotationY(F)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4, v8}, Landroid/view/View;->setRotation(F)V

    .line 240
    .line 241
    .line 242
    const/16 v15, 0x9

    .line 243
    .line 244
    new-array v8, v15, [F

    .line 245
    .line 246
    invoke-virtual {v0, v8}, Landroid/graphics/Matrix;->getValues([F)V

    .line 247
    .line 248
    .line 249
    new-array v0, v15, [F

    .line 250
    .line 251
    invoke-virtual {v3, v0}, Landroid/graphics/Matrix;->getValues([F)V

    .line 252
    .line 253
    .line 254
    move-object/from16 v18, v5

    .line 255
    .line 256
    move-object v5, v6

    .line 257
    new-instance v6, Lvs;

    .line 258
    .line 259
    invoke-direct {v6, v4, v8}, Lvs;-><init>(Landroid/view/View;[F)V

    .line 260
    .line 261
    .line 262
    const/16 v19, 0x2

    .line 263
    .line 264
    new-instance v14, Lpj0;

    .line 265
    .line 266
    new-array v15, v15, [F

    .line 267
    .line 268
    move/from16 v20, v2

    .line 269
    .line 270
    const/4 v2, 0x0

    .line 271
    invoke-direct {v14, v2}, Lpj0;-><init>(I)V

    .line 272
    .line 273
    .line 274
    iput-object v15, v14, Lpj0;->b:Ljava/lang/Object;

    .line 275
    .line 276
    filled-new-array {v8, v0}, [[F

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    sget-object v15, Landroidx/transition/ChangeTransform;->n0:Lms;

    .line 281
    .line 282
    invoke-static {v15, v14, v2}, Landroid/animation/PropertyValuesHolder;->ofObject(Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/PropertyValuesHolder;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    iget-object v14, v1, Landroidx/transition/Transition;->f0:Landroidx/transition/PathMotion;

    .line 287
    .line 288
    aget v15, v8, v19

    .line 289
    .line 290
    const/16 v21, 0x5

    .line 291
    .line 292
    aget v8, v8, v21

    .line 293
    .line 294
    move-object/from16 v22, v0

    .line 295
    .line 296
    aget v0, v22, v19

    .line 297
    .line 298
    aget v1, v22, v21

    .line 299
    .line 300
    invoke-virtual {v14, v15, v8, v0, v1}, Landroidx/transition/PathMotion;->a(FFFF)Landroid/graphics/Path;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    sget-object v1, Landroidx/transition/ChangeTransform;->o0:Lms;

    .line 305
    .line 306
    const/4 v8, 0x0

    .line 307
    invoke-static {v1, v8, v0}, Landroid/animation/PropertyValuesHolder;->ofObject(Landroid/util/Property;Landroid/animation/TypeConverter;Landroid/graphics/Path;)Landroid/animation/PropertyValuesHolder;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    filled-new-array {v2, v0}, [Landroid/animation/PropertyValuesHolder;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-static {v6, v0}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    .line 316
    .line 317
    .line 318
    move-result-object v8

    .line 319
    new-instance v0, Lts;

    .line 320
    .line 321
    move-object/from16 v1, p0

    .line 322
    .line 323
    move-object/from16 v14, v18

    .line 324
    .line 325
    move/from16 v2, v20

    .line 326
    .line 327
    invoke-direct/range {v0 .. v6}, Lts;-><init>(Landroidx/transition/ChangeTransform;ZLandroid/graphics/Matrix;Landroid/view/View;Lws;Lvs;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v8, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v8, v0}, Landroid/animation/Animator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    .line 334
    .line 335
    .line 336
    :goto_4
    sget-boolean v0, Landroidx/transition/ChangeTransform;->p0:Z

    .line 337
    .line 338
    if-eqz v2, :cond_29

    .line 339
    .line 340
    if-eqz v8, :cond_29

    .line 341
    .line 342
    iget-boolean v2, v1, Landroidx/transition/ChangeTransform;->j0:Z

    .line 343
    .line 344
    if-eqz v2, :cond_29

    .line 345
    .line 346
    invoke-virtual {v11, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    check-cast v2, Landroid/graphics/Matrix;

    .line 351
    .line 352
    new-instance v3, Landroid/graphics/Matrix;

    .line 353
    .line 354
    invoke-direct {v3, v2}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 355
    .line 356
    .line 357
    sget-object v2, Ll53;->a:Ln53;

    .line 358
    .line 359
    invoke-virtual {v2, v7, v3}, Ln53;->T(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 360
    .line 361
    .line 362
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 363
    .line 364
    const/16 v5, 0x1c

    .line 365
    .line 366
    const-class v6, Landroid/view/ViewGroup;

    .line 367
    .line 368
    if-ne v2, v5, :cond_10

    .line 369
    .line 370
    sget-boolean v2, Ler0;->f:Z

    .line 371
    .line 372
    if-nez v2, :cond_e

    .line 373
    .line 374
    :try_start_0
    sget-boolean v2, Ler0;->d:Z
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    .line 375
    .line 376
    if-nez v2, :cond_d

    .line 377
    .line 378
    :try_start_1
    const-string v2, "android.view.GhostView"

    .line 379
    .line 380
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    sput-object v2, Ler0;->c:Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 385
    .line 386
    :catch_0
    :try_start_2
    sput-boolean p2, Ler0;->d:Z

    .line 387
    .line 388
    :cond_d
    sget-object v2, Ler0;->c:Ljava/lang/Class;

    .line 389
    .line 390
    const-string v5, "addGhost"

    .line 391
    .line 392
    const-class v11, Landroid/view/View;

    .line 393
    .line 394
    const-class v13, Landroid/graphics/Matrix;

    .line 395
    .line 396
    filled-new-array {v11, v6, v13}, [Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    move-result-object v6

    .line 400
    invoke-virtual {v2, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    sput-object v2, Ler0;->e:Ljava/lang/reflect/Method;

    .line 405
    .line 406
    move/from16 v5, p2

    .line 407
    .line 408
    invoke-virtual {v2, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1

    .line 409
    .line 410
    .line 411
    :catch_1
    const/4 v5, 0x1

    .line 412
    sput-boolean v5, Ler0;->f:Z

    .line 413
    .line 414
    :cond_e
    sget-object v2, Ler0;->e:Ljava/lang/reflect/Method;

    .line 415
    .line 416
    if-eqz v2, :cond_f

    .line 417
    .line 418
    :try_start_3
    new-instance v5, Ler0;

    .line 419
    .line 420
    filled-new-array {v4, v7, v3}, [Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    const/4 v6, 0x0

    .line 425
    invoke-virtual {v2, v6, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    check-cast v2, Landroid/view/View;

    .line 430
    .line 431
    const/4 v3, 0x0

    .line 432
    invoke-direct {v5, v2, v3}, Ler0;-><init>(Ljava/lang/Object;I)V
    :try_end_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_2

    .line 433
    .line 434
    .line 435
    move-object/from16 v16, v5

    .line 436
    .line 437
    goto :goto_6

    .line 438
    :catch_2
    move-exception v0

    .line 439
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-static {v0}, Lds0;->p(Ljava/lang/Throwable;)V

    .line 444
    .line 445
    .line 446
    :goto_5
    const/16 v16, 0x0

    .line 447
    .line 448
    return-object v16

    .line 449
    :catch_3
    :cond_f
    const/16 v16, 0x0

    .line 450
    .line 451
    :goto_6
    move/from16 v18, v0

    .line 452
    .line 453
    move-object/from16 v20, v8

    .line 454
    .line 455
    move-object/from16 v5, v16

    .line 456
    .line 457
    goto/16 :goto_18

    .line 458
    .line 459
    :cond_10
    sget v2, Lfr0;->i:I

    .line 460
    .line 461
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    instance-of v2, v2, Landroid/view/ViewGroup;

    .line 466
    .line 467
    if-eqz v2, :cond_28

    .line 468
    .line 469
    sget v2, Ldr0;->c:I

    .line 470
    .line 471
    sget v2, Landroidx/transition/R$id;->ghost_view_holder:I

    .line 472
    .line 473
    invoke-virtual {v7, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    check-cast v2, Ldr0;

    .line 478
    .line 479
    sget v5, Landroidx/transition/R$id;->ghost_view:I

    .line 480
    .line 481
    invoke-virtual {v4, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v5

    .line 485
    check-cast v5, Lfr0;

    .line 486
    .line 487
    if-eqz v5, :cond_11

    .line 488
    .line 489
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 490
    .line 491
    .line 492
    move-result-object v11

    .line 493
    check-cast v11, Ldr0;

    .line 494
    .line 495
    if-eq v11, v2, :cond_11

    .line 496
    .line 497
    iget v13, v5, Lfr0;->d:I

    .line 498
    .line 499
    invoke-virtual {v11, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 500
    .line 501
    .line 502
    const/4 v5, 0x0

    .line 503
    goto :goto_7

    .line 504
    :cond_11
    const/4 v13, 0x0

    .line 505
    :goto_7
    if-nez v5, :cond_24

    .line 506
    .line 507
    new-instance v5, Lfr0;

    .line 508
    .line 509
    invoke-direct {v5, v4}, Lfr0;-><init>(Landroid/view/View;)V

    .line 510
    .line 511
    .line 512
    iput-object v3, v5, Lfr0;->e:Landroid/graphics/Matrix;

    .line 513
    .line 514
    if-nez v2, :cond_12

    .line 515
    .line 516
    new-instance v2, Ldr0;

    .line 517
    .line 518
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    invoke-direct {v2, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 523
    .line 524
    .line 525
    const/4 v3, 0x0

    .line 526
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 527
    .line 528
    .line 529
    iput-object v7, v2, Ldr0;->a:Landroid/view/ViewGroup;

    .line 530
    .line 531
    sget v3, Landroidx/transition/R$id;->ghost_view_holder:I

    .line 532
    .line 533
    invoke-virtual {v7, v3, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    invoke-virtual {v3, v2}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    .line 541
    .line 542
    .line 543
    const/4 v3, 0x1

    .line 544
    iput-boolean v3, v2, Ldr0;->b:Z

    .line 545
    .line 546
    goto :goto_8

    .line 547
    :cond_12
    iget-object v3, v2, Ldr0;->a:Landroid/view/ViewGroup;

    .line 548
    .line 549
    iget-boolean v11, v2, Ldr0;->b:Z

    .line 550
    .line 551
    if-eqz v11, :cond_23

    .line 552
    .line 553
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 554
    .line 555
    .line 556
    move-result-object v11

    .line 557
    invoke-virtual {v11, v2}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    invoke-virtual {v3, v2}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    .line 565
    .line 566
    .line 567
    :goto_8
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 568
    .line 569
    .line 570
    move-result v3

    .line 571
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 572
    .line 573
    .line 574
    move-result v11

    .line 575
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 576
    .line 577
    .line 578
    move-result v14

    .line 579
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 580
    .line 581
    .line 582
    move-result v15

    .line 583
    add-int/2addr v15, v14

    .line 584
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 585
    .line 586
    .line 587
    move-result v14

    .line 588
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    .line 589
    .line 590
    .line 591
    move-result v16

    .line 592
    add-int v14, v16, v14

    .line 593
    .line 594
    invoke-static {v2, v3, v11, v15, v14}, Ll53;->a(Landroid/view/View;IIII)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 598
    .line 599
    .line 600
    move-result v3

    .line 601
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 602
    .line 603
    .line 604
    move-result v11

    .line 605
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 606
    .line 607
    .line 608
    move-result v14

    .line 609
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 610
    .line 611
    .line 612
    move-result v15

    .line 613
    add-int/2addr v15, v14

    .line 614
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 615
    .line 616
    .line 617
    move-result v14

    .line 618
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    .line 619
    .line 620
    .line 621
    move-result v7

    .line 622
    add-int/2addr v7, v14

    .line 623
    invoke-static {v5, v3, v11, v15, v7}, Ll53;->a(Landroid/view/View;IIII)V

    .line 624
    .line 625
    .line 626
    new-instance v3, Ljava/util/ArrayList;

    .line 627
    .line 628
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 629
    .line 630
    .line 631
    iget-object v7, v5, Lfr0;->c:Landroid/view/View;

    .line 632
    .line 633
    invoke-static {v7, v3}, Ldr0;->a(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 634
    .line 635
    .line 636
    new-instance v7, Ljava/util/ArrayList;

    .line 637
    .line 638
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 642
    .line 643
    .line 644
    move-result v11

    .line 645
    const/4 v14, 0x1

    .line 646
    sub-int/2addr v11, v14

    .line 647
    move v14, v11

    .line 648
    const/4 v11, 0x0

    .line 649
    :goto_9
    if-gt v11, v14, :cond_20

    .line 650
    .line 651
    add-int v15, v11, v14

    .line 652
    .line 653
    div-int/lit8 v15, v15, 0x2

    .line 654
    .line 655
    invoke-virtual {v2, v15}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 656
    .line 657
    .line 658
    move-result-object v16

    .line 659
    move/from16 v18, v0

    .line 660
    .line 661
    move-object/from16 v0, v16

    .line 662
    .line 663
    check-cast v0, Lfr0;

    .line 664
    .line 665
    iget-object v0, v0, Lfr0;->c:Landroid/view/View;

    .line 666
    .line 667
    invoke-static {v0, v7}, Ldr0;->a(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 671
    .line 672
    .line 673
    move-result v0

    .line 674
    if-nez v0, :cond_1f

    .line 675
    .line 676
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 677
    .line 678
    .line 679
    move-result v0

    .line 680
    if-nez v0, :cond_1f

    .line 681
    .line 682
    const/4 v0, 0x0

    .line 683
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v1

    .line 687
    move-object/from16 v20, v8

    .line 688
    .line 689
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v8

    .line 693
    if-eq v1, v8, :cond_13

    .line 694
    .line 695
    move-object/from16 p1, v3

    .line 696
    .line 697
    goto :goto_b

    .line 698
    :cond_13
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 699
    .line 700
    .line 701
    move-result v0

    .line 702
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 703
    .line 704
    .line 705
    move-result v1

    .line 706
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 707
    .line 708
    .line 709
    move-result v0

    .line 710
    const/4 v1, 0x1

    .line 711
    :goto_a
    if-ge v1, v0, :cond_1d

    .line 712
    .line 713
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v8

    .line 717
    check-cast v8, Landroid/view/View;

    .line 718
    .line 719
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v16

    .line 723
    move/from16 v21, v1

    .line 724
    .line 725
    move-object/from16 v1, v16

    .line 726
    .line 727
    check-cast v1, Landroid/view/View;

    .line 728
    .line 729
    if-eq v8, v1, :cond_1c

    .line 730
    .line 731
    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    check-cast v0, Landroid/view/ViewGroup;

    .line 736
    .line 737
    move-object/from16 p1, v3

    .line 738
    .line 739
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 740
    .line 741
    .line 742
    move-result v3

    .line 743
    invoke-virtual {v8}, Landroid/view/View;->getZ()F

    .line 744
    .line 745
    .line 746
    move-result v16

    .line 747
    invoke-virtual {v1}, Landroid/view/View;->getZ()F

    .line 748
    .line 749
    .line 750
    move-result v21

    .line 751
    cmpl-float v16, v16, v21

    .line 752
    .line 753
    if-eqz v16, :cond_16

    .line 754
    .line 755
    invoke-virtual {v8}, Landroid/view/View;->getZ()F

    .line 756
    .line 757
    .line 758
    move-result v0

    .line 759
    invoke-virtual {v1}, Landroid/view/View;->getZ()F

    .line 760
    .line 761
    .line 762
    move-result v1

    .line 763
    cmpl-float v0, v0, v1

    .line 764
    .line 765
    if-lez v0, :cond_15

    .line 766
    .line 767
    :goto_b
    move-object/from16 v16, v7

    .line 768
    .line 769
    :cond_14
    :goto_c
    move/from16 v22, v14

    .line 770
    .line 771
    move/from16 v14, v19

    .line 772
    .line 773
    const/16 v24, 0x0

    .line 774
    .line 775
    goto/16 :goto_13

    .line 776
    .line 777
    :cond_15
    move-object/from16 v16, v7

    .line 778
    .line 779
    move/from16 v14, v19

    .line 780
    .line 781
    const/16 v24, 0x0

    .line 782
    .line 783
    goto/16 :goto_12

    .line 784
    .line 785
    :cond_16
    move-object/from16 v16, v7

    .line 786
    .line 787
    const/4 v7, 0x0

    .line 788
    :goto_d
    if-ge v7, v3, :cond_14

    .line 789
    .line 790
    move/from16 v21, v3

    .line 791
    .line 792
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 793
    .line 794
    move/from16 v22, v14

    .line 795
    .line 796
    const/16 v14, 0x1d

    .line 797
    .line 798
    if-lt v3, v14, :cond_17

    .line 799
    .line 800
    invoke-static {v0, v7}, Ldt1;->d(Landroid/view/ViewGroup;I)I

    .line 801
    .line 802
    .line 803
    move-result v3

    .line 804
    move/from16 v23, v7

    .line 805
    .line 806
    move/from16 v14, v19

    .line 807
    .line 808
    const/16 v24, 0x0

    .line 809
    .line 810
    goto :goto_11

    .line 811
    :cond_17
    sget-boolean v3, Lpy0;->j:Z

    .line 812
    .line 813
    if-nez v3, :cond_18

    .line 814
    .line 815
    :try_start_4
    const-string v3, "getChildDrawingOrder"
    :try_end_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_5

    .line 816
    .line 817
    move/from16 v23, v7

    .line 818
    .line 819
    move/from16 v14, v19

    .line 820
    .line 821
    :try_start_5
    new-array v7, v14, [Ljava/lang/Class;

    .line 822
    .line 823
    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 824
    .line 825
    const/16 v24, 0x0

    .line 826
    .line 827
    aput-object v14, v7, v24

    .line 828
    .line 829
    move-object/from16 v24, v14

    .line 830
    .line 831
    const/4 v14, 0x1

    .line 832
    aput-object v24, v7, v14

    .line 833
    .line 834
    invoke-virtual {v6, v3, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 835
    .line 836
    .line 837
    move-result-object v3

    .line 838
    sput-object v3, Lpy0;->i:Ljava/lang/reflect/Method;

    .line 839
    .line 840
    invoke-virtual {v3, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_4

    .line 841
    .line 842
    .line 843
    :catch_4
    :goto_e
    const/4 v14, 0x1

    .line 844
    goto :goto_f

    .line 845
    :catch_5
    move/from16 v23, v7

    .line 846
    .line 847
    goto :goto_e

    .line 848
    :goto_f
    sput-boolean v14, Lpy0;->j:Z

    .line 849
    .line 850
    goto :goto_10

    .line 851
    :cond_18
    move/from16 v23, v7

    .line 852
    .line 853
    :goto_10
    sget-object v3, Lpy0;->i:Ljava/lang/reflect/Method;

    .line 854
    .line 855
    if-eqz v3, :cond_19

    .line 856
    .line 857
    const/4 v14, 0x2

    .line 858
    :try_start_6
    new-array v7, v14, [Ljava/lang/Object;

    .line 859
    .line 860
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 861
    .line 862
    .line 863
    move-result v19

    .line 864
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 865
    .line 866
    .line 867
    move-result-object v19
    :try_end_6
    .catch Ljava/lang/IllegalAccessException; {:try_start_6 .. :try_end_6} :catch_6
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_6 .. :try_end_6} :catch_6

    .line 868
    const/16 v24, 0x0

    .line 869
    .line 870
    :try_start_7
    aput-object v19, v7, v24

    .line 871
    .line 872
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 873
    .line 874
    .line 875
    move-result-object v19

    .line 876
    const/16 v25, 0x1

    .line 877
    .line 878
    aput-object v19, v7, v25

    .line 879
    .line 880
    invoke-virtual {v3, v0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 881
    .line 882
    .line 883
    move-result-object v3

    .line 884
    check-cast v3, Ljava/lang/Integer;

    .line 885
    .line 886
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 887
    .line 888
    .line 889
    move-result v3
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_7
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_7 .. :try_end_7} :catch_7

    .line 890
    goto :goto_11

    .line 891
    :cond_19
    const/4 v14, 0x2

    .line 892
    :catch_6
    const/16 v24, 0x0

    .line 893
    .line 894
    :catch_7
    move/from16 v3, v23

    .line 895
    .line 896
    :goto_11
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 897
    .line 898
    .line 899
    move-result-object v3

    .line 900
    if-ne v3, v8, :cond_1a

    .line 901
    .line 902
    goto :goto_12

    .line 903
    :cond_1a
    if-ne v3, v1, :cond_1b

    .line 904
    .line 905
    goto :goto_13

    .line 906
    :cond_1b
    add-int/lit8 v7, v23, 0x1

    .line 907
    .line 908
    move/from16 v19, v14

    .line 909
    .line 910
    move/from16 v3, v21

    .line 911
    .line 912
    move/from16 v14, v22

    .line 913
    .line 914
    goto :goto_d

    .line 915
    :cond_1c
    move-object/from16 p1, v3

    .line 916
    .line 917
    move-object/from16 v16, v7

    .line 918
    .line 919
    move/from16 v22, v14

    .line 920
    .line 921
    move/from16 v14, v19

    .line 922
    .line 923
    const/16 v24, 0x0

    .line 924
    .line 925
    add-int/lit8 v1, v21, 0x1

    .line 926
    .line 927
    move/from16 v14, v22

    .line 928
    .line 929
    goto/16 :goto_a

    .line 930
    .line 931
    :cond_1d
    move-object/from16 p1, v3

    .line 932
    .line 933
    move-object/from16 v16, v7

    .line 934
    .line 935
    move/from16 v22, v14

    .line 936
    .line 937
    move/from16 v14, v19

    .line 938
    .line 939
    const/16 v24, 0x0

    .line 940
    .line 941
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->size()I

    .line 942
    .line 943
    .line 944
    move-result v1

    .line 945
    if-ne v1, v0, :cond_1e

    .line 946
    .line 947
    goto :goto_13

    .line 948
    :cond_1e
    :goto_12
    add-int/lit8 v15, v15, -0x1

    .line 949
    .line 950
    goto :goto_14

    .line 951
    :cond_1f
    move-object/from16 p1, v3

    .line 952
    .line 953
    move-object/from16 v16, v7

    .line 954
    .line 955
    move-object/from16 v20, v8

    .line 956
    .line 957
    goto/16 :goto_c

    .line 958
    .line 959
    :goto_13
    add-int/lit8 v15, v15, 0x1

    .line 960
    .line 961
    move v11, v15

    .line 962
    move/from16 v15, v22

    .line 963
    .line 964
    :goto_14
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->clear()V

    .line 965
    .line 966
    .line 967
    move-object/from16 v1, p0

    .line 968
    .line 969
    move-object/from16 v3, p1

    .line 970
    .line 971
    move/from16 v19, v14

    .line 972
    .line 973
    move v14, v15

    .line 974
    move-object/from16 v7, v16

    .line 975
    .line 976
    move/from16 v0, v18

    .line 977
    .line 978
    move-object/from16 v8, v20

    .line 979
    .line 980
    goto/16 :goto_9

    .line 981
    .line 982
    :cond_20
    move/from16 v18, v0

    .line 983
    .line 984
    move-object/from16 v20, v8

    .line 985
    .line 986
    if-ltz v11, :cond_22

    .line 987
    .line 988
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 989
    .line 990
    .line 991
    move-result v0

    .line 992
    if-lt v11, v0, :cond_21

    .line 993
    .line 994
    goto :goto_15

    .line 995
    :cond_21
    invoke-virtual {v2, v5, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 996
    .line 997
    .line 998
    goto :goto_16

    .line 999
    :cond_22
    :goto_15
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1000
    .line 1001
    .line 1002
    :goto_16
    iput v13, v5, Lfr0;->d:I

    .line 1003
    .line 1004
    goto :goto_17

    .line 1005
    :cond_23
    const-string v0, "This GhostViewHolder is detached!"

    .line 1006
    .line 1007
    invoke-static {v0}, Lf42;->l(Ljava/lang/String;)V

    .line 1008
    .line 1009
    .line 1010
    goto/16 :goto_5

    .line 1011
    .line 1012
    :cond_24
    move/from16 v18, v0

    .line 1013
    .line 1014
    move-object/from16 v20, v8

    .line 1015
    .line 1016
    iput-object v3, v5, Lfr0;->e:Landroid/graphics/Matrix;

    .line 1017
    .line 1018
    :goto_17
    iget v0, v5, Lfr0;->d:I

    .line 1019
    .line 1020
    const/4 v14, 0x1

    .line 1021
    add-int/2addr v0, v14

    .line 1022
    iput v0, v5, Lfr0;->d:I

    .line 1023
    .line 1024
    :goto_18
    if-nez v5, :cond_25

    .line 1025
    .line 1026
    goto :goto_1a

    .line 1027
    :cond_25
    invoke-virtual {v10, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v0

    .line 1031
    check-cast v0, Landroid/view/ViewGroup;

    .line 1032
    .line 1033
    invoke-interface {v5, v0, v9}, Lcr0;->a(Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 1034
    .line 1035
    .line 1036
    move-object/from16 v0, p0

    .line 1037
    .line 1038
    :goto_19
    iget-object v1, v0, Landroidx/transition/Transition;->w:Landroidx/transition/TransitionSet;

    .line 1039
    .line 1040
    if-eqz v1, :cond_26

    .line 1041
    .line 1042
    move-object v0, v1

    .line 1043
    goto :goto_19

    .line 1044
    :cond_26
    new-instance v1, Lus;

    .line 1045
    .line 1046
    invoke-direct {v1}, Lus;-><init>()V

    .line 1047
    .line 1048
    .line 1049
    iput-object v4, v1, Lus;->b:Ljava/lang/Object;

    .line 1050
    .line 1051
    iput-object v5, v1, Lus;->c:Ljava/lang/Object;

    .line 1052
    .line 1053
    invoke-virtual {v0, v1}, Landroidx/transition/Transition;->a(Lir2;)V

    .line 1054
    .line 1055
    .line 1056
    if-eqz v18, :cond_2a

    .line 1057
    .line 1058
    if-eq v9, v4, :cond_27

    .line 1059
    .line 1060
    const/4 v0, 0x0

    .line 1061
    invoke-static {v9, v0}, Ll53;->b(Landroid/view/View;F)V

    .line 1062
    .line 1063
    .line 1064
    :cond_27
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1065
    .line 1066
    invoke-static {v4, v0}, Ll53;->b(Landroid/view/View;F)V

    .line 1067
    .line 1068
    .line 1069
    goto :goto_1a

    .line 1070
    :cond_28
    const-string v0, "Ghosted views must be parented by a ViewGroup"

    .line 1071
    .line 1072
    invoke-static {v0}, Ln4;->j(Ljava/lang/String;)V

    .line 1073
    .line 1074
    .line 1075
    goto/16 :goto_5

    .line 1076
    .line 1077
    :cond_29
    move/from16 v18, v0

    .line 1078
    .line 1079
    move-object/from16 v20, v8

    .line 1080
    .line 1081
    if-nez v18, :cond_2a

    .line 1082
    .line 1083
    invoke-virtual {v13, v9}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 1084
    .line 1085
    .line 1086
    :cond_2a
    :goto_1a
    return-object v20

    .line 1087
    :goto_1b
    return-object v16
.end method

.method public final p()[Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Landroidx/transition/ChangeTransform;->m0:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.class public Landroidx/transition/ChangeImageTransform;
.super Landroidx/transition/Transition;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final j0:[Ljava/lang/String;

.field public static final k0:Lyc;

.field public static final l0:Lms;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "android:changeImageTransform:matrix"

    .line 2
    .line 3
    const-string v1, "android:changeImageTransform:bounds"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Landroidx/transition/ChangeImageTransform;->j0:[Ljava/lang/String;

    .line 10
    .line 11
    new-instance v0, Lyc;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, v1}, Lyc;-><init>(I)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Landroidx/transition/ChangeImageTransform;->k0:Lyc;

    .line 18
    .line 19
    new-instance v0, Lms;

    .line 20
    .line 21
    const-string v1, "animatedTransform"

    .line 22
    .line 23
    const/4 v2, 0x5

    .line 24
    const-class v3, Landroid/graphics/Matrix;

    .line 25
    .line 26
    invoke-direct {v0, v1, v3, v2}, Lms;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Landroidx/transition/ChangeImageTransform;->l0:Lms;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/transition/Transition;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static H(Lor2;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lor2;->b:Landroid/view/View;

    .line 2
    .line 3
    instance-of v1, v0, Landroid/widget/ImageView;

    .line 4
    .line 5
    if-eqz v1, :cond_5

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_1

    .line 14
    .line 15
    :cond_0
    move-object v1, v0

    .line 16
    check-cast v1, Landroid/widget/ImageView;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    goto/16 :goto_1

    .line 25
    .line 26
    :cond_1
    iget-object p0, p0, Lor2;->a:Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    new-instance v5, Landroid/graphics/Rect;

    .line 45
    .line 46
    invoke-direct {v5, v2, v3, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 47
    .line 48
    .line 49
    const-string v0, "android:changeImageTransform:bounds"

    .line 50
    .line 51
    invoke-virtual {p0, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-lez v2, :cond_4

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-lez v0, :cond_4

    .line 69
    .line 70
    sget-object v0, Lrs;->a:[I

    .line 71
    .line 72
    invoke-virtual {v1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    aget v0, v0, v2

    .line 81
    .line 82
    const/4 v2, 0x1

    .line 83
    if-eq v0, v2, :cond_3

    .line 84
    .line 85
    const/4 v2, 0x2

    .line 86
    if-eq v0, v2, :cond_2

    .line 87
    .line 88
    new-instance v0, Landroid/graphics/Matrix;

    .line 89
    .line 90
    invoke-virtual {v1}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-direct {v0, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    int-to-float v3, v3

    .line 111
    int-to-float v2, v2

    .line 112
    div-float v4, v3, v2

    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    int-to-float v1, v1

    .line 123
    int-to-float v0, v0

    .line 124
    div-float v5, v1, v0

    .line 125
    .line 126
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    mul-float/2addr v2, v4

    .line 131
    mul-float/2addr v0, v4

    .line 132
    sub-float/2addr v3, v2

    .line 133
    const/high16 v2, 0x40000000    # 2.0f

    .line 134
    .line 135
    div-float/2addr v3, v2

    .line 136
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    sub-float/2addr v1, v0

    .line 141
    div-float/2addr v1, v2

    .line 142
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    new-instance v1, Landroid/graphics/Matrix;

    .line 147
    .line 148
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v4, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 152
    .line 153
    .line 154
    int-to-float v2, v3

    .line 155
    int-to-float v0, v0

    .line 156
    invoke-virtual {v1, v2, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 157
    .line 158
    .line 159
    move-object v0, v1

    .line 160
    goto :goto_0

    .line 161
    :cond_3
    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    new-instance v2, Landroid/graphics/Matrix;

    .line 166
    .line 167
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    int-to-float v3, v3

    .line 175
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    int-to-float v4, v4

    .line 180
    div-float/2addr v3, v4

    .line 181
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    int-to-float v1, v1

    .line 186
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    int-to-float v0, v0

    .line 191
    div-float/2addr v1, v0

    .line 192
    invoke-virtual {v2, v3, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 193
    .line 194
    .line 195
    move-object v0, v2

    .line 196
    goto :goto_0

    .line 197
    :cond_4
    new-instance v0, Landroid/graphics/Matrix;

    .line 198
    .line 199
    invoke-virtual {v1}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-direct {v0, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 204
    .line 205
    .line 206
    :goto_0
    const-string v1, "android:changeImageTransform:matrix"

    .line 207
    .line 208
    invoke-virtual {p0, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    :cond_5
    :goto_1
    return-void
.end method


# virtual methods
.method public final d(Lor2;)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/transition/ChangeImageTransform;->H(Lor2;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final g(Lor2;)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/transition/ChangeImageTransform;->H(Lor2;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final k(Landroid/view/ViewGroup;Lor2;Lor2;)Landroid/animation/Animator;
    .locals 4

    .line 1
    if-eqz p2, :cond_a

    .line 2
    .line 3
    iget-object p0, p2, Lor2;->a:Ljava/util/HashMap;

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    iget-object p1, p3, Lor2;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    const-string p2, "android:changeImageTransform:bounds"

    .line 12
    .line 13
    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/graphics/Rect;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    check-cast p2, Landroid/graphics/Rect;

    .line 24
    .line 25
    if-eqz v0, :cond_a

    .line 26
    .line 27
    if-nez p2, :cond_1

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_1
    const-string v1, "android:changeImageTransform:matrix"

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Landroid/graphics/Matrix;

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Landroid/graphics/Matrix;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    const/4 v2, 0x1

    .line 46
    if-nez p0, :cond_2

    .line 47
    .line 48
    if-eqz p1, :cond_3

    .line 49
    .line 50
    :cond_2
    if-eqz p0, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Landroid/graphics/Matrix;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_4

    .line 57
    .line 58
    :cond_3
    move v3, v2

    .line 59
    goto :goto_0

    .line 60
    :cond_4
    move v3, v1

    .line 61
    :goto_0
    invoke-virtual {v0, p2}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-eqz p2, :cond_5

    .line 66
    .line 67
    if-eqz v3, :cond_5

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_5
    iget-object p2, p3, Lor2;->b:Landroid/view/View;

    .line 71
    .line 72
    check-cast p2, Landroid/widget/ImageView;

    .line 73
    .line 74
    invoke-virtual {p2}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 83
    .line 84
    .line 85
    move-result p3

    .line 86
    sget-object v3, Landroidx/transition/ChangeImageTransform;->l0:Lms;

    .line 87
    .line 88
    if-lez v0, :cond_9

    .line 89
    .line 90
    if-gtz p3, :cond_6

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_6
    if-nez p0, :cond_7

    .line 94
    .line 95
    sget-object p0, Lld1;->a:Lkd1;

    .line 96
    .line 97
    :cond_7
    if-nez p1, :cond_8

    .line 98
    .line 99
    sget-object p1, Lld1;->a:Lkd1;

    .line 100
    .line 101
    :cond_8
    invoke-virtual {v3, p2, p0}, Lms;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    new-instance p3, Lmr2;

    .line 105
    .line 106
    invoke-direct {p3}, Lmr2;-><init>()V

    .line 107
    .line 108
    .line 109
    filled-new-array {p0, p1}, [Landroid/graphics/Matrix;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-static {p2, v3, p3, p0}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :cond_9
    :goto_1
    const/4 p0, 0x2

    .line 119
    new-array p0, p0, [Landroid/graphics/Matrix;

    .line 120
    .line 121
    sget-object p1, Lld1;->a:Lkd1;

    .line 122
    .line 123
    aput-object p1, p0, v1

    .line 124
    .line 125
    aput-object p1, p0, v2

    .line 126
    .line 127
    sget-object p1, Landroidx/transition/ChangeImageTransform;->k0:Lyc;

    .line 128
    .line 129
    invoke-static {p2, v3, p1, p0}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    :cond_a
    :goto_2
    const/4 p0, 0x0

    .line 135
    return-object p0
.end method

.method public final p()[Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Landroidx/transition/ChangeImageTransform;->j0:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

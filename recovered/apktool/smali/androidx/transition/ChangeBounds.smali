.class public Landroidx/transition/ChangeBounds;
.super Landroidx/transition/Transition;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final k0:[Ljava/lang/String;

.field public static final l0:Lms;

.field public static final m0:Lms;

.field public static final n0:Lms;

.field public static final o0:Lms;

.field public static final p0:Lms;

.field public static final q0:Lpj0;


# instance fields
.field public final j0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "android:changeBounds:windowX"

    .line 2
    .line 3
    const-string v1, "android:changeBounds:windowY"

    .line 4
    .line 5
    const-string v2, "android:changeBounds:bounds"

    .line 6
    .line 7
    const-string v3, "android:changeBounds:clip"

    .line 8
    .line 9
    const-string v4, "android:changeBounds:parent"

    .line 10
    .line 11
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Landroidx/transition/ChangeBounds;->k0:[Ljava/lang/String;

    .line 16
    .line 17
    new-instance v0, Lji;

    .line 18
    .line 19
    const-string v1, "boundsOrigin"

    .line 20
    .line 21
    const-class v2, Landroid/graphics/PointF;

    .line 22
    .line 23
    invoke-direct {v0, v2, v1}, Lji;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v1, v0, Lji;->b:Ljava/lang/Object;

    .line 32
    .line 33
    new-instance v0, Lms;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    const-string v3, "topLeft"

    .line 37
    .line 38
    invoke-direct {v0, v3, v2, v1}, Lms;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Landroidx/transition/ChangeBounds;->l0:Lms;

    .line 42
    .line 43
    new-instance v0, Lms;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    const-string v4, "bottomRight"

    .line 47
    .line 48
    invoke-direct {v0, v4, v2, v1}, Lms;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Landroidx/transition/ChangeBounds;->m0:Lms;

    .line 52
    .line 53
    new-instance v0, Lms;

    .line 54
    .line 55
    const/4 v1, 0x2

    .line 56
    invoke-direct {v0, v4, v2, v1}, Lms;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Landroidx/transition/ChangeBounds;->n0:Lms;

    .line 60
    .line 61
    new-instance v0, Lms;

    .line 62
    .line 63
    const/4 v1, 0x3

    .line 64
    invoke-direct {v0, v3, v2, v1}, Lms;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 65
    .line 66
    .line 67
    sput-object v0, Landroidx/transition/ChangeBounds;->o0:Lms;

    .line 68
    .line 69
    new-instance v0, Lms;

    .line 70
    .line 71
    const-string v1, "position"

    .line 72
    .line 73
    const/4 v3, 0x4

    .line 74
    invoke-direct {v0, v1, v2, v3}, Lms;-><init>(Ljava/lang/String;Ljava/lang/Class;I)V

    .line 75
    .line 76
    .line 77
    sput-object v0, Landroidx/transition/ChangeBounds;->p0:Lms;

    .line 78
    .line 79
    new-instance v0, Lpj0;

    .line 80
    .line 81
    const/4 v1, 0x2

    .line 82
    invoke-direct {v0, v1}, Lpj0;-><init>(I)V

    .line 83
    .line 84
    .line 85
    sput-object v0, Landroidx/transition/ChangeBounds;->q0:Lpj0;

    .line 86
    .line 87
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    const/4 v0, 0x0

    .line 35
    iput-boolean v0, p0, Landroidx/transition/ChangeBounds;->j0:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/transition/Transition;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/transition/ChangeBounds;->j0:Z

    .line 6
    .line 7
    sget-object v1, Lk50;->d:[I

    .line 8
    .line 9
    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p2, Landroid/content/res/XmlResourceParser;

    .line 14
    .line 15
    const-string v1, "resizeClip"

    .line 16
    .line 17
    invoke-static {p2, v1}, Lk50;->y(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p1, v0, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 29
    .line 30
    .line 31
    iput-boolean v0, p0, Landroidx/transition/ChangeBounds;->j0:Z

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final H(Lor2;)V
    .locals 6

    .line 1
    iget-object v0, p1, Lor2;->b:Landroid/view/View;

    .line 2
    .line 3
    iget-object p1, p1, Lor2;->a:Ljava/util/HashMap;

    .line 4
    .line 5
    sget-object v1, Le33;->a:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    :cond_0
    new-instance v1, Landroid/graphics/Rect;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 44
    .line 45
    .line 46
    const-string v2, "android:changeBounds:bounds"

    .line 47
    .line 48
    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    const-string v1, "android:changeBounds:parent"

    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    iget-boolean p0, p0, Landroidx/transition/ChangeBounds;->j0:Z

    .line 61
    .line 62
    if-eqz p0, :cond_1

    .line 63
    .line 64
    const-string p0, "android:changeBounds:clip"

    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :cond_1
    return-void
.end method

.method public final d(Lor2;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/transition/ChangeBounds;->H(Lor2;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final g(Lor2;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/transition/ChangeBounds;->H(Lor2;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final k(Landroid/view/ViewGroup;Lor2;Lor2;)Landroid/animation/Animator;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v1, Lor2;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    :cond_0
    :goto_0
    const/4 v3, 0x0

    .line 14
    goto/16 :goto_b

    .line 15
    .line 16
    :cond_1
    iget-object v4, v2, Lor2;->a:Ljava/util/HashMap;

    .line 17
    .line 18
    const-string v5, "android:changeBounds:parent"

    .line 19
    .line 20
    invoke-virtual {v1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    check-cast v6, Landroid/view/ViewGroup;

    .line 25
    .line 26
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Landroid/view/ViewGroup;

    .line 31
    .line 32
    if-eqz v6, :cond_0

    .line 33
    .line 34
    if-nez v5, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    iget-object v8, v2, Lor2;->b:Landroid/view/View;

    .line 38
    .line 39
    const-string v2, "android:changeBounds:bounds"

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    check-cast v5, Landroid/graphics/Rect;

    .line 46
    .line 47
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Landroid/graphics/Rect;

    .line 52
    .line 53
    iget v6, v5, Landroid/graphics/Rect;->left:I

    .line 54
    .line 55
    iget v10, v2, Landroid/graphics/Rect;->left:I

    .line 56
    .line 57
    iget v7, v5, Landroid/graphics/Rect;->top:I

    .line 58
    .line 59
    iget v11, v2, Landroid/graphics/Rect;->top:I

    .line 60
    .line 61
    iget v9, v5, Landroid/graphics/Rect;->right:I

    .line 62
    .line 63
    iget v12, v2, Landroid/graphics/Rect;->right:I

    .line 64
    .line 65
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 66
    .line 67
    iget v13, v2, Landroid/graphics/Rect;->bottom:I

    .line 68
    .line 69
    sub-int v2, v9, v6

    .line 70
    .line 71
    sub-int v14, v5, v7

    .line 72
    .line 73
    sub-int v15, v12, v10

    .line 74
    .line 75
    sub-int v3, v13, v11

    .line 76
    .line 77
    move/from16 p2, v3

    .line 78
    .line 79
    const-string v3, "android:changeBounds:clip"

    .line 80
    .line 81
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, Landroid/graphics/Rect;

    .line 86
    .line 87
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Landroid/graphics/Rect;

    .line 92
    .line 93
    const/16 p3, 0x1

    .line 94
    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    if-nez v14, :cond_4

    .line 98
    .line 99
    :cond_3
    if-eqz v15, :cond_8

    .line 100
    .line 101
    if-eqz p2, :cond_8

    .line 102
    .line 103
    :cond_4
    if-ne v6, v10, :cond_6

    .line 104
    .line 105
    if-eq v7, v11, :cond_5

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_5
    const/16 v16, 0x0

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_6
    :goto_1
    move/from16 v16, p3

    .line 112
    .line 113
    :goto_2
    if-ne v9, v12, :cond_7

    .line 114
    .line 115
    if-eq v5, v13, :cond_9

    .line 116
    .line 117
    :cond_7
    add-int/lit8 v16, v16, 0x1

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_8
    const/16 v16, 0x0

    .line 121
    .line 122
    :cond_9
    :goto_3
    if-eqz v1, :cond_a

    .line 123
    .line 124
    invoke-virtual {v1, v3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v17

    .line 128
    if-eqz v17, :cond_b

    .line 129
    .line 130
    :cond_a
    if-nez v1, :cond_c

    .line 131
    .line 132
    if-eqz v3, :cond_c

    .line 133
    .line 134
    :cond_b
    add-int/lit8 v16, v16, 0x1

    .line 135
    .line 136
    :cond_c
    move/from16 v4, v16

    .line 137
    .line 138
    const/16 v17, 0x0

    .line 139
    .line 140
    if-lez v4, :cond_0

    .line 141
    .line 142
    move-object/from16 v16, v1

    .line 143
    .line 144
    iget-boolean v1, v0, Landroidx/transition/ChangeBounds;->j0:Z

    .line 145
    .line 146
    move/from16 v18, v1

    .line 147
    .line 148
    sget-object v1, Landroidx/transition/ChangeBounds;->p0:Lms;

    .line 149
    .line 150
    if-nez v18, :cond_11

    .line 151
    .line 152
    invoke-static {v8, v6, v7, v9, v5}, Ll53;->a(Landroid/view/View;IIII)V

    .line 153
    .line 154
    .line 155
    const/4 v3, 0x2

    .line 156
    if-ne v4, v3, :cond_e

    .line 157
    .line 158
    if-ne v2, v15, :cond_d

    .line 159
    .line 160
    move/from16 v4, p2

    .line 161
    .line 162
    if-ne v14, v4, :cond_d

    .line 163
    .line 164
    iget-object v2, v0, Landroidx/transition/Transition;->f0:Landroidx/transition/PathMotion;

    .line 165
    .line 166
    int-to-float v3, v6

    .line 167
    int-to-float v4, v7

    .line 168
    int-to-float v5, v10

    .line 169
    int-to-float v6, v11

    .line 170
    invoke-virtual {v2, v3, v4, v5, v6}, Landroidx/transition/PathMotion;->a(FFFF)Landroid/graphics/Path;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    const/4 v3, 0x0

    .line 175
    invoke-static {v8, v1, v3, v2}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeConverter;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    goto/16 :goto_a

    .line 180
    .line 181
    :cond_d
    new-instance v1, Lqs;

    .line 182
    .line 183
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 184
    .line 185
    .line 186
    iput-object v8, v1, Lqs;->e:Landroid/view/View;

    .line 187
    .line 188
    iget-object v2, v0, Landroidx/transition/Transition;->f0:Landroidx/transition/PathMotion;

    .line 189
    .line 190
    int-to-float v3, v6

    .line 191
    int-to-float v4, v7

    .line 192
    int-to-float v6, v10

    .line 193
    int-to-float v7, v11

    .line 194
    invoke-virtual {v2, v3, v4, v6, v7}, Landroidx/transition/PathMotion;->a(FFFF)Landroid/graphics/Path;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    sget-object v3, Landroidx/transition/ChangeBounds;->l0:Lms;

    .line 199
    .line 200
    const/4 v4, 0x0

    .line 201
    invoke-static {v1, v3, v4, v2}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeConverter;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    iget-object v3, v0, Landroidx/transition/Transition;->f0:Landroidx/transition/PathMotion;

    .line 206
    .line 207
    int-to-float v6, v9

    .line 208
    int-to-float v5, v5

    .line 209
    int-to-float v7, v12

    .line 210
    int-to-float v9, v13

    .line 211
    invoke-virtual {v3, v6, v5, v7, v9}, Landroidx/transition/PathMotion;->a(FFFF)Landroid/graphics/Path;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    sget-object v5, Landroidx/transition/ChangeBounds;->m0:Lms;

    .line 216
    .line 217
    invoke-static {v1, v5, v4, v3}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeConverter;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    new-instance v4, Landroid/animation/AnimatorSet;

    .line 222
    .line 223
    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    .line 224
    .line 225
    .line 226
    const/4 v5, 0x2

    .line 227
    new-array v5, v5, [Landroid/animation/Animator;

    .line 228
    .line 229
    aput-object v2, v5, v17

    .line 230
    .line 231
    aput-object v3, v5, p3

    .line 232
    .line 233
    invoke-virtual {v4, v5}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 234
    .line 235
    .line 236
    new-instance v2, Lns;

    .line 237
    .line 238
    invoke-direct {v2, v1}, Lns;-><init>(Lqs;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v4, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 242
    .line 243
    .line 244
    move-object v1, v4

    .line 245
    goto/16 :goto_a

    .line 246
    .line 247
    :cond_e
    if-ne v6, v10, :cond_f

    .line 248
    .line 249
    if-eq v7, v11, :cond_10

    .line 250
    .line 251
    :cond_f
    const/4 v3, 0x0

    .line 252
    goto :goto_4

    .line 253
    :cond_10
    iget-object v1, v0, Landroidx/transition/Transition;->f0:Landroidx/transition/PathMotion;

    .line 254
    .line 255
    int-to-float v2, v9

    .line 256
    int-to-float v3, v5

    .line 257
    int-to-float v4, v12

    .line 258
    int-to-float v5, v13

    .line 259
    invoke-virtual {v1, v2, v3, v4, v5}, Landroidx/transition/PathMotion;->a(FFFF)Landroid/graphics/Path;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    sget-object v2, Landroidx/transition/ChangeBounds;->n0:Lms;

    .line 264
    .line 265
    const/4 v3, 0x0

    .line 266
    invoke-static {v8, v2, v3, v1}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeConverter;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    goto/16 :goto_a

    .line 271
    .line 272
    :goto_4
    iget-object v1, v0, Landroidx/transition/Transition;->f0:Landroidx/transition/PathMotion;

    .line 273
    .line 274
    int-to-float v2, v6

    .line 275
    int-to-float v4, v7

    .line 276
    int-to-float v5, v10

    .line 277
    int-to-float v6, v11

    .line 278
    invoke-virtual {v1, v2, v4, v5, v6}, Landroidx/transition/PathMotion;->a(FFFF)Landroid/graphics/Path;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    sget-object v2, Landroidx/transition/ChangeBounds;->o0:Lms;

    .line 283
    .line 284
    invoke-static {v8, v2, v3, v1}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeConverter;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    goto/16 :goto_a

    .line 289
    .line 290
    :cond_11
    move/from16 v4, p2

    .line 291
    .line 292
    invoke-static {v2, v15}, Ljava/lang/Math;->max(II)I

    .line 293
    .line 294
    .line 295
    move-result v5

    .line 296
    invoke-static {v14, v4}, Ljava/lang/Math;->max(II)I

    .line 297
    .line 298
    .line 299
    move-result v9

    .line 300
    add-int/2addr v5, v6

    .line 301
    add-int/2addr v9, v7

    .line 302
    invoke-static {v8, v6, v7, v5, v9}, Ll53;->a(Landroid/view/View;IIII)V

    .line 303
    .line 304
    .line 305
    if-ne v6, v10, :cond_13

    .line 306
    .line 307
    if-eq v7, v11, :cond_12

    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_12
    move-object/from16 p2, v3

    .line 311
    .line 312
    const/4 v3, 0x0

    .line 313
    goto :goto_6

    .line 314
    :cond_13
    :goto_5
    iget-object v5, v0, Landroidx/transition/Transition;->f0:Landroidx/transition/PathMotion;

    .line 315
    .line 316
    int-to-float v6, v6

    .line 317
    int-to-float v7, v7

    .line 318
    int-to-float v9, v10

    .line 319
    move-object/from16 p2, v3

    .line 320
    .line 321
    int-to-float v3, v11

    .line 322
    invoke-virtual {v5, v6, v7, v9, v3}, Landroidx/transition/PathMotion;->a(FFFF)Landroid/graphics/Path;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    const/4 v5, 0x0

    .line 327
    invoke-static {v8, v1, v5, v3}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeConverter;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    :goto_6
    if-nez v16, :cond_14

    .line 332
    .line 333
    new-instance v1, Landroid/graphics/Rect;

    .line 334
    .line 335
    move/from16 v5, v17

    .line 336
    .line 337
    invoke-direct {v1, v5, v5, v2, v14}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 338
    .line 339
    .line 340
    goto :goto_7

    .line 341
    :cond_14
    move/from16 v5, v17

    .line 342
    .line 343
    move-object/from16 v1, v16

    .line 344
    .line 345
    :goto_7
    if-nez p2, :cond_15

    .line 346
    .line 347
    new-instance v2, Landroid/graphics/Rect;

    .line 348
    .line 349
    invoke-direct {v2, v5, v5, v15, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 350
    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_15
    move-object/from16 v2, p2

    .line 354
    .line 355
    :goto_8
    invoke-virtual {v1, v2}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    if-nez v4, :cond_16

    .line 360
    .line 361
    sget-object v4, Le33;->a:Ljava/util/WeakHashMap;

    .line 362
    .line 363
    invoke-virtual {v8, v1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 364
    .line 365
    .line 366
    sget-object v4, Landroidx/transition/ChangeBounds;->q0:Lpj0;

    .line 367
    .line 368
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    const-string v2, "clipBounds"

    .line 373
    .line 374
    invoke-static {v8, v2, v4, v1}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    new-instance v7, Los;

    .line 379
    .line 380
    move-object/from16 v9, p2

    .line 381
    .line 382
    invoke-direct/range {v7 .. v13}, Los;-><init>(Landroid/view/View;Landroid/graphics/Rect;IIII)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1, v7}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 386
    .line 387
    .line 388
    goto :goto_9

    .line 389
    :cond_16
    const/4 v1, 0x0

    .line 390
    :goto_9
    sget-boolean v2, Lnr2;->a:Z

    .line 391
    .line 392
    if-nez v3, :cond_17

    .line 393
    .line 394
    goto :goto_a

    .line 395
    :cond_17
    if-nez v1, :cond_18

    .line 396
    .line 397
    move-object v1, v3

    .line 398
    goto :goto_a

    .line 399
    :cond_18
    new-instance v2, Landroid/animation/AnimatorSet;

    .line 400
    .line 401
    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    .line 402
    .line 403
    .line 404
    const/4 v5, 0x2

    .line 405
    new-array v4, v5, [Landroid/animation/Animator;

    .line 406
    .line 407
    const/16 v17, 0x0

    .line 408
    .line 409
    aput-object v3, v4, v17

    .line 410
    .line 411
    aput-object v1, v4, p3

    .line 412
    .line 413
    invoke-virtual {v2, v4}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 414
    .line 415
    .line 416
    move-object v1, v2

    .line 417
    :goto_a
    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    instance-of v2, v2, Landroid/view/ViewGroup;

    .line 422
    .line 423
    if-eqz v2, :cond_19

    .line 424
    .line 425
    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    check-cast v2, Landroid/view/ViewGroup;

    .line 430
    .line 431
    move/from16 v3, p3

    .line 432
    .line 433
    invoke-static {v2, v3}, Lpy0;->u0(Landroid/view/ViewGroup;Z)V

    .line 434
    .line 435
    .line 436
    new-instance v3, Lps;

    .line 437
    .line 438
    invoke-direct {v3, v2}, Lps;-><init>(Landroid/view/ViewGroup;)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v0, v3}, Landroidx/transition/Transition;->a(Lir2;)V

    .line 442
    .line 443
    .line 444
    :cond_19
    return-object v1

    .line 445
    :goto_b
    return-object v3
.end method

.method public final p()[Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Landroidx/transition/ChangeBounds;->k0:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

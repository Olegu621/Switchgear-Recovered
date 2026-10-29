.class public abstract Landroidx/transition/Visibility;
.super Landroidx/transition/Transition;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final k0:[Ljava/lang/String;


# instance fields
.field public j0:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "android:visibility:visibility"

    .line 2
    .line 3
    const-string v1, "android:visibility:parent"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Landroidx/transition/Visibility;->k0:[Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    const/4 v0, 0x3

    .line 39
    iput v0, p0, Landroidx/transition/Visibility;->j0:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/transition/Transition;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    iput v0, p0, Landroidx/transition/Visibility;->j0:I

    .line 6
    .line 7
    sget-object v0, Lk50;->e:[I

    .line 8
    .line 9
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p2, Landroid/content/res/XmlResourceParser;

    .line 14
    .line 15
    const-string v0, "transitionVisibilityMode"

    .line 16
    .line 17
    invoke-static {p2, v0}, Lk50;->y(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    const/4 v0, 0x0

    .line 22
    if-nez p2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p1, v0, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 30
    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroidx/transition/Visibility;->L(I)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public static H(Lor2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lor2;->b:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object p0, p0, Lor2;->a:Ljava/util/HashMap;

    .line 8
    .line 9
    const-string v2, "android:visibility:visibility"

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    const-string v1, "android:visibility:parent"

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    new-array v1, v1, [I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 31
    .line 32
    .line 33
    const-string v0, "android:visibility:screenLocation"

    .line 34
    .line 35
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static I(Lor2;Lor2;)Lb63;
    .locals 8

    .line 1
    new-instance v0, Lb63;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-boolean v1, v0, Lb63;->a:Z

    .line 8
    .line 9
    iput-boolean v1, v0, Lb63;->b:Z

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, -0x1

    .line 13
    const-string v4, "android:visibility:parent"

    .line 14
    .line 15
    const-string v5, "android:visibility:visibility"

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    iget-object v6, p0, Lor2;->a:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    check-cast v7, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    iput v7, v0, Lb63;->c:I

    .line 38
    .line 39
    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    check-cast v6, Landroid/view/ViewGroup;

    .line 44
    .line 45
    iput-object v6, v0, Lb63;->e:Landroid/view/ViewGroup;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iput v3, v0, Lb63;->c:I

    .line 49
    .line 50
    iput-object v2, v0, Lb63;->e:Landroid/view/ViewGroup;

    .line 51
    .line 52
    :goto_0
    if-eqz p1, :cond_1

    .line 53
    .line 54
    iget-object v6, p1, Lor2;->a:Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_1

    .line 61
    .line 62
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    iput v2, v0, Lb63;->d:I

    .line 73
    .line 74
    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Landroid/view/ViewGroup;

    .line 79
    .line 80
    iput-object v2, v0, Lb63;->f:Landroid/view/ViewGroup;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    iput v3, v0, Lb63;->d:I

    .line 84
    .line 85
    iput-object v2, v0, Lb63;->f:Landroid/view/ViewGroup;

    .line 86
    .line 87
    :goto_1
    const/4 v2, 0x1

    .line 88
    if-eqz p0, :cond_6

    .line 89
    .line 90
    if-eqz p1, :cond_6

    .line 91
    .line 92
    iget p0, v0, Lb63;->c:I

    .line 93
    .line 94
    iget p1, v0, Lb63;->d:I

    .line 95
    .line 96
    if-ne p0, p1, :cond_2

    .line 97
    .line 98
    iget-object v3, v0, Lb63;->e:Landroid/view/ViewGroup;

    .line 99
    .line 100
    iget-object v4, v0, Lb63;->f:Landroid/view/ViewGroup;

    .line 101
    .line 102
    if-ne v3, v4, :cond_2

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_2
    if-eq p0, p1, :cond_4

    .line 106
    .line 107
    if-nez p0, :cond_3

    .line 108
    .line 109
    iput-boolean v1, v0, Lb63;->b:Z

    .line 110
    .line 111
    iput-boolean v2, v0, Lb63;->a:Z

    .line 112
    .line 113
    return-object v0

    .line 114
    :cond_3
    if-nez p1, :cond_8

    .line 115
    .line 116
    iput-boolean v2, v0, Lb63;->b:Z

    .line 117
    .line 118
    iput-boolean v2, v0, Lb63;->a:Z

    .line 119
    .line 120
    return-object v0

    .line 121
    :cond_4
    iget-object p0, v0, Lb63;->f:Landroid/view/ViewGroup;

    .line 122
    .line 123
    if-nez p0, :cond_5

    .line 124
    .line 125
    iput-boolean v1, v0, Lb63;->b:Z

    .line 126
    .line 127
    iput-boolean v2, v0, Lb63;->a:Z

    .line 128
    .line 129
    return-object v0

    .line 130
    :cond_5
    iget-object p0, v0, Lb63;->e:Landroid/view/ViewGroup;

    .line 131
    .line 132
    if-nez p0, :cond_8

    .line 133
    .line 134
    iput-boolean v2, v0, Lb63;->b:Z

    .line 135
    .line 136
    iput-boolean v2, v0, Lb63;->a:Z

    .line 137
    .line 138
    return-object v0

    .line 139
    :cond_6
    if-nez p0, :cond_7

    .line 140
    .line 141
    iget p0, v0, Lb63;->d:I

    .line 142
    .line 143
    if-nez p0, :cond_7

    .line 144
    .line 145
    iput-boolean v2, v0, Lb63;->b:Z

    .line 146
    .line 147
    iput-boolean v2, v0, Lb63;->a:Z

    .line 148
    .line 149
    return-object v0

    .line 150
    :cond_7
    if-nez p1, :cond_8

    .line 151
    .line 152
    iget p0, v0, Lb63;->c:I

    .line 153
    .line 154
    if-nez p0, :cond_8

    .line 155
    .line 156
    iput-boolean v1, v0, Lb63;->b:Z

    .line 157
    .line 158
    iput-boolean v2, v0, Lb63;->a:Z

    .line 159
    .line 160
    :cond_8
    :goto_2
    return-object v0
.end method


# virtual methods
.method public J(Landroid/view/ViewGroup;Landroid/view/View;Lor2;Lor2;)Landroid/animation/Animator;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public K(Landroid/view/ViewGroup;Landroid/view/View;Lor2;)Landroid/animation/Animator;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final L(I)V
    .locals 1

    .line 1
    and-int/lit8 v0, p1, -0x4

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, Landroidx/transition/Visibility;->j0:I

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string p0, "Only MODE_IN and MODE_OUT flags are allowed"

    .line 9
    .line 10
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public d(Lor2;)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/transition/Visibility;->H(Lor2;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public g(Lor2;)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/transition/Visibility;->H(Lor2;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final k(Landroid/view/ViewGroup;Lor2;Lor2;)Landroid/animation/Animator;
    .locals 22

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
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-static/range {p2 .. p3}, Landroidx/transition/Visibility;->I(Lor2;Lor2;)Lb63;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    iget-boolean v5, v4, Lb63;->a:Z

    .line 14
    .line 15
    if-eqz v5, :cond_0

    .line 16
    .line 17
    iget-object v5, v4, Lb63;->e:Landroid/view/ViewGroup;

    .line 18
    .line 19
    if-nez v5, :cond_1

    .line 20
    .line 21
    iget-object v5, v4, Lb63;->f:Landroid/view/ViewGroup;

    .line 22
    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    const/16 v16, 0x0

    .line 27
    .line 28
    goto/16 :goto_e

    .line 29
    .line 30
    :cond_1
    :goto_1
    iget-boolean v5, v4, Lb63;->b:Z

    .line 31
    .line 32
    const/4 v7, 0x1

    .line 33
    const/4 v8, 0x0

    .line 34
    if-eqz v5, :cond_4

    .line 35
    .line 36
    iget v4, v0, Landroidx/transition/Visibility;->j0:I

    .line 37
    .line 38
    and-int/2addr v4, v7

    .line 39
    if-ne v4, v7, :cond_0

    .line 40
    .line 41
    if-nez v3, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    iget-object v4, v3, Lor2;->b:Landroid/view/View;

    .line 45
    .line 46
    if-nez v2, :cond_3

    .line 47
    .line 48
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    check-cast v5, Landroid/view/View;

    .line 53
    .line 54
    invoke-virtual {v0, v5, v8}, Landroidx/transition/Transition;->n(Landroid/view/View;Z)Lor2;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-virtual {v0, v5, v8}, Landroidx/transition/Transition;->q(Landroid/view/View;Z)Lor2;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-static {v7, v5}, Landroidx/transition/Visibility;->I(Lor2;Lor2;)Lb63;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    iget-boolean v5, v5, Lb63;->a:Z

    .line 67
    .line 68
    if-eqz v5, :cond_3

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    invoke-virtual {v0, v1, v4, v2, v3}, Landroidx/transition/Visibility;->J(Landroid/view/ViewGroup;Landroid/view/View;Lor2;Lor2;)Landroid/animation/Animator;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0

    .line 76
    :cond_4
    iget v4, v4, Lb63;->d:I

    .line 77
    .line 78
    iget v5, v0, Landroidx/transition/Visibility;->j0:I

    .line 79
    .line 80
    const/4 v9, 0x2

    .line 81
    and-int/2addr v5, v9

    .line 82
    if-eq v5, v9, :cond_5

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_5
    if-nez v2, :cond_6

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_6
    iget-object v5, v2, Lor2;->b:Landroid/view/View;

    .line 89
    .line 90
    if-eqz v3, :cond_7

    .line 91
    .line 92
    iget-object v3, v3, Lor2;->b:Landroid/view/View;

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_7
    const/4 v3, 0x0

    .line 96
    :goto_2
    sget v10, Landroidx/transition/R$id;->save_overlay_view:I

    .line 97
    .line 98
    invoke-virtual {v5, v10}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    check-cast v10, Landroid/view/View;

    .line 103
    .line 104
    if-eqz v10, :cond_8

    .line 105
    .line 106
    move/from16 v18, v4

    .line 107
    .line 108
    move/from16 v17, v7

    .line 109
    .line 110
    move/from16 v19, v8

    .line 111
    .line 112
    const/4 v6, 0x0

    .line 113
    const/16 v16, 0x0

    .line 114
    .line 115
    goto/16 :goto_d

    .line 116
    .line 117
    :cond_8
    if-eqz v3, :cond_c

    .line 118
    .line 119
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    if-nez v10, :cond_9

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_9
    const/4 v10, 0x4

    .line 127
    if-ne v4, v10, :cond_a

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_a
    if-ne v5, v3, :cond_b

    .line 131
    .line 132
    :goto_3
    move-object v10, v3

    .line 133
    move v11, v8

    .line 134
    const/4 v3, 0x0

    .line 135
    goto :goto_6

    .line 136
    :cond_b
    move v11, v7

    .line 137
    const/4 v3, 0x0

    .line 138
    :goto_4
    const/4 v10, 0x0

    .line 139
    goto :goto_6

    .line 140
    :cond_c
    :goto_5
    if-eqz v3, :cond_b

    .line 141
    .line 142
    move v11, v8

    .line 143
    goto :goto_4

    .line 144
    :goto_6
    if-eqz v11, :cond_16

    .line 145
    .line 146
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 147
    .line 148
    .line 149
    move-result-object v11

    .line 150
    if-nez v11, :cond_d

    .line 151
    .line 152
    move/from16 v18, v4

    .line 153
    .line 154
    move/from16 v17, v7

    .line 155
    .line 156
    move v7, v8

    .line 157
    move/from16 v19, v7

    .line 158
    .line 159
    move-object v6, v10

    .line 160
    const/16 v16, 0x0

    .line 161
    .line 162
    move-object v10, v5

    .line 163
    goto/16 :goto_d

    .line 164
    .line 165
    :cond_d
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    instance-of v11, v11, Landroid/view/View;

    .line 170
    .line 171
    if-eqz v11, :cond_16

    .line 172
    .line 173
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 174
    .line 175
    .line 176
    move-result-object v11

    .line 177
    check-cast v11, Landroid/view/View;

    .line 178
    .line 179
    invoke-virtual {v0, v11, v7}, Landroidx/transition/Transition;->q(Landroid/view/View;Z)Lor2;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    invoke-virtual {v0, v11, v7}, Landroidx/transition/Transition;->n(Landroid/view/View;Z)Lor2;

    .line 184
    .line 185
    .line 186
    move-result-object v13

    .line 187
    invoke-static {v12, v13}, Landroidx/transition/Visibility;->I(Lor2;Lor2;)Lb63;

    .line 188
    .line 189
    .line 190
    move-result-object v12

    .line 191
    iget-boolean v12, v12, Lb63;->a:Z

    .line 192
    .line 193
    if-nez v12, :cond_15

    .line 194
    .line 195
    sget-boolean v3, Lnr2;->a:Z

    .line 196
    .line 197
    new-instance v3, Landroid/graphics/Matrix;

    .line 198
    .line 199
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v11}, Landroid/view/View;->getScrollX()I

    .line 203
    .line 204
    .line 205
    move-result v12

    .line 206
    neg-int v12, v12

    .line 207
    int-to-float v12, v12

    .line 208
    invoke-virtual {v11}, Landroid/view/View;->getScrollY()I

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    neg-int v11, v11

    .line 213
    int-to-float v11, v11

    .line 214
    invoke-virtual {v3, v12, v11}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 215
    .line 216
    .line 217
    sget-object v11, Ll53;->a:Ln53;

    .line 218
    .line 219
    invoke-virtual {v11, v5, v3}, Ln53;->S(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v11, v1, v3}, Ln53;->T(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 223
    .line 224
    .line 225
    new-instance v11, Landroid/graphics/RectF;

    .line 226
    .line 227
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 228
    .line 229
    .line 230
    move-result v12

    .line 231
    int-to-float v12, v12

    .line 232
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 233
    .line 234
    .line 235
    move-result v13

    .line 236
    int-to-float v13, v13

    .line 237
    const/4 v14, 0x0

    .line 238
    invoke-direct {v11, v14, v14, v12, v13}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v3, v11}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 242
    .line 243
    .line 244
    iget v12, v11, Landroid/graphics/RectF;->left:F

    .line 245
    .line 246
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 247
    .line 248
    .line 249
    move-result v12

    .line 250
    iget v13, v11, Landroid/graphics/RectF;->top:F

    .line 251
    .line 252
    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    .line 253
    .line 254
    .line 255
    move-result v13

    .line 256
    iget v14, v11, Landroid/graphics/RectF;->right:F

    .line 257
    .line 258
    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    .line 259
    .line 260
    .line 261
    move-result v14

    .line 262
    iget v15, v11, Landroid/graphics/RectF;->bottom:F

    .line 263
    .line 264
    invoke-static {v15}, Ljava/lang/Math;->round(F)I

    .line 265
    .line 266
    .line 267
    move-result v15

    .line 268
    const/16 v16, 0x0

    .line 269
    .line 270
    new-instance v6, Landroid/widget/ImageView;

    .line 271
    .line 272
    move/from16 v17, v7

    .line 273
    .line 274
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    invoke-direct {v6, v7}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 279
    .line 280
    .line 281
    sget-object v7, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 282
    .line 283
    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    .line 287
    .line 288
    .line 289
    move-result v7

    .line 290
    if-nez v1, :cond_e

    .line 291
    .line 292
    move/from16 v18, v8

    .line 293
    .line 294
    goto :goto_7

    .line 295
    :cond_e
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 296
    .line 297
    .line 298
    move-result v18

    .line 299
    :goto_7
    if-nez v7, :cond_10

    .line 300
    .line 301
    if-nez v18, :cond_f

    .line 302
    .line 303
    move/from16 v18, v4

    .line 304
    .line 305
    move/from16 v19, v8

    .line 306
    .line 307
    move-object/from16 v20, v10

    .line 308
    .line 309
    move-object/from16 v0, v16

    .line 310
    .line 311
    goto/16 :goto_a

    .line 312
    .line 313
    :cond_f
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 314
    .line 315
    .line 316
    move-result-object v18

    .line 317
    move/from16 v19, v8

    .line 318
    .line 319
    move-object/from16 v8, v18

    .line 320
    .line 321
    check-cast v8, Landroid/view/ViewGroup;

    .line 322
    .line 323
    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 324
    .line 325
    .line 326
    move-result v18

    .line 327
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 328
    .line 329
    .line 330
    move-result-object v9

    .line 331
    invoke-virtual {v9, v5}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    .line 332
    .line 333
    .line 334
    move/from16 v9, v18

    .line 335
    .line 336
    goto :goto_8

    .line 337
    :cond_10
    move/from16 v19, v8

    .line 338
    .line 339
    move-object/from16 v8, v16

    .line 340
    .line 341
    move/from16 v9, v19

    .line 342
    .line 343
    :goto_8
    invoke-virtual {v11}, Landroid/graphics/RectF;->width()F

    .line 344
    .line 345
    .line 346
    move-result v18

    .line 347
    move/from16 p3, v7

    .line 348
    .line 349
    invoke-static/range {v18 .. v18}, Ljava/lang/Math;->round(F)I

    .line 350
    .line 351
    .line 352
    move-result v7

    .line 353
    invoke-virtual {v11}, Landroid/graphics/RectF;->height()F

    .line 354
    .line 355
    .line 356
    move-result v18

    .line 357
    move-object/from16 v20, v10

    .line 358
    .line 359
    invoke-static/range {v18 .. v18}, Ljava/lang/Math;->round(F)I

    .line 360
    .line 361
    .line 362
    move-result v10

    .line 363
    if-lez v7, :cond_12

    .line 364
    .line 365
    if-lez v10, :cond_12

    .line 366
    .line 367
    move/from16 v18, v4

    .line 368
    .line 369
    mul-int v4, v7, v10

    .line 370
    .line 371
    int-to-float v4, v4

    .line 372
    const/high16 v21, 0x49800000    # 1048576.0f

    .line 373
    .line 374
    div-float v4, v21, v4

    .line 375
    .line 376
    const/high16 v0, 0x3f800000    # 1.0f

    .line 377
    .line 378
    invoke-static {v0, v4}, Ljava/lang/Math;->min(FF)F

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    int-to-float v4, v7

    .line 383
    mul-float/2addr v4, v0

    .line 384
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 385
    .line 386
    .line 387
    move-result v4

    .line 388
    int-to-float v7, v10

    .line 389
    mul-float/2addr v7, v0

    .line 390
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 391
    .line 392
    .line 393
    move-result v7

    .line 394
    iget v10, v11, Landroid/graphics/RectF;->left:F

    .line 395
    .line 396
    neg-float v10, v10

    .line 397
    iget v11, v11, Landroid/graphics/RectF;->top:F

    .line 398
    .line 399
    neg-float v11, v11

    .line 400
    invoke-virtual {v3, v10, v11}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 401
    .line 402
    .line 403
    invoke-virtual {v3, v0, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 404
    .line 405
    .line 406
    sget-boolean v0, Lnr2;->a:Z

    .line 407
    .line 408
    if-eqz v0, :cond_11

    .line 409
    .line 410
    new-instance v0, Landroid/graphics/Picture;

    .line 411
    .line 412
    invoke-direct {v0}, Landroid/graphics/Picture;-><init>()V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v0, v4, v7}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    invoke-virtual {v4, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v5, v4}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v0}, Landroid/graphics/Picture;->endRecording()V

    .line 426
    .line 427
    .line 428
    invoke-static {v0}, Lrt1;->c(Landroid/graphics/Picture;)Landroid/graphics/Bitmap;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    goto :goto_9

    .line 433
    :cond_11
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 434
    .line 435
    invoke-static {v4, v7, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    new-instance v4, Landroid/graphics/Canvas;

    .line 440
    .line 441
    invoke-direct {v4, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v4, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v5, v4}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 448
    .line 449
    .line 450
    goto :goto_9

    .line 451
    :cond_12
    move/from16 v18, v4

    .line 452
    .line 453
    move-object/from16 v0, v16

    .line 454
    .line 455
    :goto_9
    if-nez p3, :cond_13

    .line 456
    .line 457
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    invoke-virtual {v3, v5}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v8, v5, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 465
    .line 466
    .line 467
    :cond_13
    :goto_a
    if-eqz v0, :cond_14

    .line 468
    .line 469
    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 470
    .line 471
    .line 472
    :cond_14
    sub-int v0, v14, v12

    .line 473
    .line 474
    const/high16 v3, 0x40000000    # 2.0f

    .line 475
    .line 476
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    sub-int v4, v15, v13

    .line 481
    .line 482
    invoke-static {v4, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 483
    .line 484
    .line 485
    move-result v3

    .line 486
    invoke-virtual {v6, v0, v3}, Landroid/view/View;->measure(II)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v6, v12, v13, v14, v15}, Landroid/view/View;->layout(IIII)V

    .line 490
    .line 491
    .line 492
    move-object v10, v6

    .line 493
    :goto_b
    move/from16 v7, v19

    .line 494
    .line 495
    move-object/from16 v6, v20

    .line 496
    .line 497
    goto :goto_d

    .line 498
    :cond_15
    move/from16 v18, v4

    .line 499
    .line 500
    move/from16 v17, v7

    .line 501
    .line 502
    move/from16 v19, v8

    .line 503
    .line 504
    move-object/from16 v20, v10

    .line 505
    .line 506
    const/16 v16, 0x0

    .line 507
    .line 508
    invoke-virtual {v11}, Landroid/view/View;->getId()I

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    invoke-virtual {v11}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 513
    .line 514
    .line 515
    move-result-object v4

    .line 516
    if-nez v4, :cond_17

    .line 517
    .line 518
    const/4 v4, -0x1

    .line 519
    if-eq v0, v4, :cond_17

    .line 520
    .line 521
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 522
    .line 523
    .line 524
    goto :goto_c

    .line 525
    :cond_16
    move/from16 v18, v4

    .line 526
    .line 527
    move/from16 v17, v7

    .line 528
    .line 529
    move/from16 v19, v8

    .line 530
    .line 531
    move-object/from16 v20, v10

    .line 532
    .line 533
    const/16 v16, 0x0

    .line 534
    .line 535
    :cond_17
    :goto_c
    move-object v10, v3

    .line 536
    goto :goto_b

    .line 537
    :goto_d
    if-eqz v10, :cond_1b

    .line 538
    .line 539
    if-nez v7, :cond_18

    .line 540
    .line 541
    iget-object v0, v2, Lor2;->a:Ljava/util/HashMap;

    .line 542
    .line 543
    const-string v3, "android:visibility:screenLocation"

    .line 544
    .line 545
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    check-cast v0, [I

    .line 550
    .line 551
    aget v3, v0, v19

    .line 552
    .line 553
    aget v0, v0, v17

    .line 554
    .line 555
    const/4 v4, 0x2

    .line 556
    new-array v4, v4, [I

    .line 557
    .line 558
    invoke-virtual {v1, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 559
    .line 560
    .line 561
    aget v6, v4, v19

    .line 562
    .line 563
    sub-int/2addr v3, v6

    .line 564
    invoke-virtual {v10}, Landroid/view/View;->getLeft()I

    .line 565
    .line 566
    .line 567
    move-result v6

    .line 568
    sub-int/2addr v3, v6

    .line 569
    invoke-virtual {v10, v3}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 570
    .line 571
    .line 572
    aget v3, v4, v17

    .line 573
    .line 574
    sub-int/2addr v0, v3

    .line 575
    invoke-virtual {v10}, Landroid/view/View;->getTop()I

    .line 576
    .line 577
    .line 578
    move-result v3

    .line 579
    sub-int/2addr v0, v3

    .line 580
    invoke-virtual {v10, v0}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-virtual {v0, v10}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    .line 588
    .line 589
    .line 590
    :cond_18
    move-object/from16 v0, p0

    .line 591
    .line 592
    invoke-virtual {v0, v1, v10, v2}, Landroidx/transition/Visibility;->K(Landroid/view/ViewGroup;Landroid/view/View;Lor2;)Landroid/animation/Animator;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    if-nez v7, :cond_1a

    .line 597
    .line 598
    if-nez v2, :cond_19

    .line 599
    .line 600
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    invoke-virtual {v0, v10}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    .line 605
    .line 606
    .line 607
    return-object v2

    .line 608
    :cond_19
    sget v3, Landroidx/transition/R$id;->save_overlay_view:I

    .line 609
    .line 610
    invoke-virtual {v5, v3, v10}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 611
    .line 612
    .line 613
    new-instance v3, Lz53;

    .line 614
    .line 615
    invoke-direct {v3, v0, v1, v10, v5}, Lz53;-><init>(Landroidx/transition/Visibility;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v0, v3}, Landroidx/transition/Transition;->a(Lir2;)V

    .line 619
    .line 620
    .line 621
    :cond_1a
    return-object v2

    .line 622
    :cond_1b
    move-object/from16 v0, p0

    .line 623
    .line 624
    if-eqz v6, :cond_1d

    .line 625
    .line 626
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 627
    .line 628
    .line 629
    move-result v3

    .line 630
    move/from16 v4, v19

    .line 631
    .line 632
    invoke-static {v4, v6}, Ll53;->c(ILandroid/view/View;)V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v0, v1, v6, v2}, Landroidx/transition/Visibility;->K(Landroid/view/ViewGroup;Landroid/view/View;Lor2;)Landroid/animation/Animator;

    .line 636
    .line 637
    .line 638
    move-result-object v1

    .line 639
    if-eqz v1, :cond_1c

    .line 640
    .line 641
    new-instance v2, La63;

    .line 642
    .line 643
    move/from16 v3, v18

    .line 644
    .line 645
    invoke-direct {v2, v6, v3}, La63;-><init>(Landroid/view/View;I)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v0, v2}, Landroidx/transition/Transition;->a(Lir2;)V

    .line 655
    .line 656
    .line 657
    return-object v1

    .line 658
    :cond_1c
    invoke-static {v3, v6}, Ll53;->c(ILandroid/view/View;)V

    .line 659
    .line 660
    .line 661
    return-object v1

    .line 662
    :cond_1d
    :goto_e
    return-object v16
.end method

.method public final p()[Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Landroidx/transition/Visibility;->k0:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final r(Lor2;Lor2;)Z
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    iget-object p0, p2, Lor2;->a:Ljava/util/HashMap;

    .line 11
    .line 12
    const-string v0, "android:visibility:visibility"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    iget-object v1, p1, Lor2;->a:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eq p0, v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-static {p1, p2}, Landroidx/transition/Visibility;->I(Lor2;Lor2;)Lb63;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-boolean p1, p0, Lb63;->a:Z

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    iget p1, p0, Lb63;->c:I

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p0, p0, Lb63;->d:I

    .line 40
    .line 41
    if-nez p0, :cond_3

    .line 42
    .line 43
    :cond_2
    const/4 p0, 0x1

    .line 44
    return p0

    .line 45
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 46
    return p0
.end method

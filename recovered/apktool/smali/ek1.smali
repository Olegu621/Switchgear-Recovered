.class public final Lek1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:La00;

.field public b:La00;

.field public c:Landroidx/constraintlayout/widget/d;

.field public d:Landroidx/constraintlayout/widget/d;

.field public e:I

.field public f:I

.field public final synthetic g:Landroidx/constraintlayout/motion/widget/MotionLayout;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lek1;->g:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 5
    .line 6
    new-instance p1, La00;

    .line 7
    .line 8
    invoke-direct {p1}, La00;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lek1;->a:La00;

    .line 12
    .line 13
    new-instance p1, La00;

    .line 14
    .line 15
    invoke-direct {p1}, La00;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lek1;->b:La00;

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-object p1, p0, Lek1;->c:Landroidx/constraintlayout/widget/d;

    .line 22
    .line 23
    iput-object p1, p0, Lek1;->d:Landroidx/constraintlayout/widget/d;

    .line 24
    .line 25
    return-void
.end method

.method public static c(La00;La00;)V
    .locals 5

    .line 1
    iget-object v0, p0, La00;->u0:Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v2, p1, La00;->u0:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p0, v1}, Lzz;->g(Lzz;Ljava/util/HashMap;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_6

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lzz;

    .line 34
    .line 35
    instance-of v3, v2, Lvh;

    .line 36
    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    new-instance v3, Lvh;

    .line 40
    .line 41
    invoke-direct {v3}, Lvh;-><init>()V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    instance-of v3, v2, Lbs0;

    .line 46
    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    new-instance v3, Lbs0;

    .line 50
    .line 51
    invoke-direct {v3}, Lbs0;-><init>()V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    instance-of v3, v2, Lgk0;

    .line 56
    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    new-instance v3, Lgk0;

    .line 60
    .line 61
    invoke-direct {v3}, Lgk0;-><init>()V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    instance-of v3, v2, Lbs1;

    .line 66
    .line 67
    if-eqz v3, :cond_3

    .line 68
    .line 69
    new-instance v3, Lbs1;

    .line 70
    .line 71
    invoke-direct {v3}, Ly53;-><init>()V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    instance-of v3, v2, Lcu0;

    .line 76
    .line 77
    if-eqz v3, :cond_4

    .line 78
    .line 79
    new-instance v3, Lcu0;

    .line 80
    .line 81
    invoke-direct {v3}, Lcu0;-><init>()V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    new-instance v3, Lzz;

    .line 86
    .line 87
    invoke-direct {v3}, Lzz;-><init>()V

    .line 88
    .line 89
    .line 90
    :goto_1
    iget-object v4, p1, La00;->u0:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    iget-object v4, v3, Lzz;->V:Lzz;

    .line 96
    .line 97
    if-eqz v4, :cond_5

    .line 98
    .line 99
    check-cast v4, La00;

    .line 100
    .line 101
    iget-object v4, v4, La00;->u0:Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, Lzz;->D()V

    .line 107
    .line 108
    .line 109
    :cond_5
    iput-object p1, v3, Lzz;->V:Lzz;

    .line 110
    .line 111
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_7

    .line 124
    .line 125
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    check-cast p1, Lzz;

    .line 130
    .line 131
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, Lzz;

    .line 136
    .line 137
    invoke-virtual {v0, p1, v1}, Lzz;->g(Lzz;Ljava/util/HashMap;)V

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_7
    return-void
.end method

.method public static d(La00;Landroid/view/View;)Lzz;
    .locals 4

    .line 1
    iget-object v0, p0, Lzz;->h0:Landroid/view/View;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object p0, p0, La00;->u0:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lzz;

    .line 20
    .line 21
    iget-object v3, v2, Lzz;->h0:Landroid/view/View;

    .line 22
    .line 23
    if-ne v3, p1, :cond_1

    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lek1;->g:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->q0:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 12
    .line 13
    .line 14
    new-instance v4, Landroid/util/SparseArray;

    .line 15
    .line 16
    invoke-direct {v4}, Landroid/util/SparseArray;-><init>()V

    .line 17
    .line 18
    .line 19
    new-array v5, v2, [I

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    :goto_0
    if-ge v7, v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v8

    .line 28
    new-instance v9, Lzj1;

    .line 29
    .line 30
    invoke-direct {v9, v8}, Lzj1;-><init>(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v8}, Landroid/view/View;->getId()I

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    aput v10, v5, v7

    .line 38
    .line 39
    invoke-virtual {v4, v10, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    add-int/lit8 v7, v7, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 v7, 0x0

    .line 49
    :goto_1
    if-ge v7, v2, :cond_10

    .line 50
    .line 51
    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    check-cast v10, Lzj1;

    .line 60
    .line 61
    if-nez v10, :cond_1

    .line 62
    .line 63
    move/from16 v20, v2

    .line 64
    .line 65
    move-object/from16 v16, v3

    .line 66
    .line 67
    move-object/from16 v19, v4

    .line 68
    .line 69
    move-object/from16 v17, v5

    .line 70
    .line 71
    move/from16 v18, v7

    .line 72
    .line 73
    const/4 v4, 0x0

    .line 74
    goto/16 :goto_6

    .line 75
    .line 76
    :cond_1
    iget-object v11, v10, Lzj1;->a:Landroid/graphics/Rect;

    .line 77
    .line 78
    iget-object v12, v10, Lzj1;->f:Lik1;

    .line 79
    .line 80
    iget-object v13, v0, Lek1;->c:Landroidx/constraintlayout/widget/d;

    .line 81
    .line 82
    const-string v14, ")"

    .line 83
    .line 84
    const-string v15, " ("

    .line 85
    .line 86
    const-string v6, "no widget for  "

    .line 87
    .line 88
    const-string v8, "MotionLayout"

    .line 89
    .line 90
    if-eqz v13, :cond_b

    .line 91
    .line 92
    iget-object v13, v0, Lek1;->a:La00;

    .line 93
    .line 94
    invoke-static {v13, v9}, Lek1;->d(La00;Landroid/view/View;)Lzz;

    .line 95
    .line 96
    .line 97
    move-result-object v13

    .line 98
    if-eqz v13, :cond_a

    .line 99
    .line 100
    invoke-static {v1, v13}, Landroidx/constraintlayout/motion/widget/MotionLayout;->j(Landroidx/constraintlayout/motion/widget/MotionLayout;Lzz;)Landroid/graphics/Rect;

    .line 101
    .line 102
    .line 103
    move-result-object v13

    .line 104
    move-object/from16 v16, v3

    .line 105
    .line 106
    iget-object v3, v0, Lek1;->c:Landroidx/constraintlayout/widget/d;

    .line 107
    .line 108
    move-object/from16 v17, v5

    .line 109
    .line 110
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    move/from16 v18, v7

    .line 115
    .line 116
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    move-object/from16 v19, v4

    .line 121
    .line 122
    iget v4, v3, Landroidx/constraintlayout/widget/d;->c:I

    .line 123
    .line 124
    if-eqz v4, :cond_2

    .line 125
    .line 126
    invoke-static {v13, v11, v4, v5, v7}, Lzj1;->g(Landroid/graphics/Rect;Landroid/graphics/Rect;III)V

    .line 127
    .line 128
    .line 129
    :cond_2
    const/4 v5, 0x0

    .line 130
    iput v5, v12, Lik1;->c:F

    .line 131
    .line 132
    iput v5, v12, Lik1;->d:F

    .line 133
    .line 134
    invoke-virtual {v10, v12}, Lzj1;->f(Lik1;)V

    .line 135
    .line 136
    .line 137
    iget v5, v13, Landroid/graphics/Rect;->left:I

    .line 138
    .line 139
    int-to-float v5, v5

    .line 140
    iget v7, v13, Landroid/graphics/Rect;->top:I

    .line 141
    .line 142
    int-to-float v7, v7

    .line 143
    move/from16 v20, v2

    .line 144
    .line 145
    invoke-virtual {v13}, Landroid/graphics/Rect;->width()I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    int-to-float v2, v2

    .line 150
    move-object/from16 v21, v11

    .line 151
    .line 152
    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    int-to-float v11, v11

    .line 157
    invoke-virtual {v12, v5, v7, v2, v11}, Lik1;->d(FFFF)V

    .line 158
    .line 159
    .line 160
    iget v2, v10, Lzj1;->c:I

    .line 161
    .line 162
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/widget/d;->h(I)Landroidx/constraintlayout/widget/c;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-virtual {v12, v2}, Lik1;->a(Landroidx/constraintlayout/widget/c;)V

    .line 167
    .line 168
    .line 169
    iget-object v5, v2, Landroidx/constraintlayout/widget/c;->d:Lvz;

    .line 170
    .line 171
    iget v7, v5, Lvz;->g:F

    .line 172
    .line 173
    iput v7, v10, Lzj1;->l:F

    .line 174
    .line 175
    iget-object v7, v10, Lzj1;->h:Lxj1;

    .line 176
    .line 177
    iget v11, v10, Lzj1;->c:I

    .line 178
    .line 179
    invoke-virtual {v7, v13, v3, v4, v11}, Lxj1;->c(Landroid/graphics/Rect;Landroidx/constraintlayout/widget/d;II)V

    .line 180
    .line 181
    .line 182
    iget-object v2, v2, Landroidx/constraintlayout/widget/c;->f:Lxz;

    .line 183
    .line 184
    iget v2, v2, Lxz;->i:I

    .line 185
    .line 186
    iput v2, v10, Lzj1;->B:I

    .line 187
    .line 188
    iget v2, v5, Lvz;->j:I

    .line 189
    .line 190
    iput v2, v10, Lzj1;->D:I

    .line 191
    .line 192
    iget v2, v5, Lvz;->i:F

    .line 193
    .line 194
    iput v2, v10, Lzj1;->E:F

    .line 195
    .line 196
    iget-object v2, v10, Lzj1;->b:Landroid/view/View;

    .line 197
    .line 198
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    iget v3, v5, Lvz;->l:I

    .line 203
    .line 204
    iget-object v4, v5, Lvz;->k:Ljava/lang/String;

    .line 205
    .line 206
    iget v5, v5, Lvz;->m:I

    .line 207
    .line 208
    const/4 v7, -0x2

    .line 209
    if-eq v3, v7, :cond_9

    .line 210
    .line 211
    const/4 v7, -0x1

    .line 212
    if-eq v3, v7, :cond_8

    .line 213
    .line 214
    if-eqz v3, :cond_7

    .line 215
    .line 216
    const/4 v2, 0x1

    .line 217
    if-eq v3, v2, :cond_6

    .line 218
    .line 219
    const/4 v2, 0x2

    .line 220
    if-eq v3, v2, :cond_5

    .line 221
    .line 222
    const/4 v2, 0x4

    .line 223
    if-eq v3, v2, :cond_4

    .line 224
    .line 225
    const/4 v2, 0x5

    .line 226
    if-eq v3, v2, :cond_3

    .line 227
    .line 228
    const/4 v2, 0x0

    .line 229
    :goto_2
    const/4 v4, 0x0

    .line 230
    goto :goto_3

    .line 231
    :cond_3
    new-instance v2, Landroid/view/animation/OvershootInterpolator;

    .line 232
    .line 233
    invoke-direct {v2}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    .line 234
    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_4
    new-instance v2, Landroid/view/animation/BounceInterpolator;

    .line 238
    .line 239
    invoke-direct {v2}, Landroid/view/animation/BounceInterpolator;-><init>()V

    .line 240
    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_5
    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    .line 244
    .line 245
    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 246
    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_6
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    .line 250
    .line 251
    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 252
    .line 253
    .line 254
    goto :goto_2

    .line 255
    :cond_7
    new-instance v2, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 256
    .line 257
    invoke-direct {v2}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 258
    .line 259
    .line 260
    goto :goto_2

    .line 261
    :cond_8
    invoke-static {v4}, Lr4;->c(Ljava/lang/String;)Lr4;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    new-instance v3, Lyj1;

    .line 266
    .line 267
    const/4 v4, 0x0

    .line 268
    invoke-direct {v3, v2, v4}, Lyj1;-><init>(Lr4;I)V

    .line 269
    .line 270
    .line 271
    move-object v2, v3

    .line 272
    goto :goto_3

    .line 273
    :cond_9
    const/4 v4, 0x0

    .line 274
    invoke-static {v2, v5}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    :goto_3
    iput-object v2, v10, Lzj1;->F:Landroid/view/animation/Interpolator;

    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_a
    move/from16 v20, v2

    .line 282
    .line 283
    move-object/from16 v16, v3

    .line 284
    .line 285
    move-object/from16 v19, v4

    .line 286
    .line 287
    move-object/from16 v17, v5

    .line 288
    .line 289
    move/from16 v18, v7

    .line 290
    .line 291
    move-object/from16 v21, v11

    .line 292
    .line 293
    const/4 v4, 0x0

    .line 294
    iget v2, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->A0:I

    .line 295
    .line 296
    if-eqz v2, :cond_c

    .line 297
    .line 298
    new-instance v2, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 301
    .line 302
    .line 303
    invoke-static {}, Lde3;->t()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-static {v9}, Lde3;->v(Landroid/view/View;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    invoke-static {v8, v2}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 342
    .line 343
    .line 344
    goto :goto_4

    .line 345
    :cond_b
    move/from16 v20, v2

    .line 346
    .line 347
    move-object/from16 v16, v3

    .line 348
    .line 349
    move-object/from16 v19, v4

    .line 350
    .line 351
    move-object/from16 v17, v5

    .line 352
    .line 353
    move/from16 v18, v7

    .line 354
    .line 355
    move-object/from16 v21, v11

    .line 356
    .line 357
    const/4 v4, 0x0

    .line 358
    :cond_c
    :goto_4
    iget-object v2, v0, Lek1;->d:Landroidx/constraintlayout/widget/d;

    .line 359
    .line 360
    if-eqz v2, :cond_f

    .line 361
    .line 362
    iget-object v2, v0, Lek1;->b:La00;

    .line 363
    .line 364
    invoke-static {v2, v9}, Lek1;->d(La00;Landroid/view/View;)Lzz;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    if-eqz v2, :cond_e

    .line 369
    .line 370
    invoke-static {v1, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->j(Landroidx/constraintlayout/motion/widget/MotionLayout;Lzz;)Landroid/graphics/Rect;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    iget-object v3, v0, Lek1;->d:Landroidx/constraintlayout/widget/d;

    .line 375
    .line 376
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 377
    .line 378
    .line 379
    move-result v5

    .line 380
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 381
    .line 382
    .line 383
    move-result v6

    .line 384
    iget-object v7, v10, Lzj1;->g:Lik1;

    .line 385
    .line 386
    iget v8, v3, Landroidx/constraintlayout/widget/d;->c:I

    .line 387
    .line 388
    if-eqz v8, :cond_d

    .line 389
    .line 390
    move-object/from16 v9, v21

    .line 391
    .line 392
    invoke-static {v2, v9, v8, v5, v6}, Lzj1;->g(Landroid/graphics/Rect;Landroid/graphics/Rect;III)V

    .line 393
    .line 394
    .line 395
    move-object v11, v9

    .line 396
    goto :goto_5

    .line 397
    :cond_d
    move-object v11, v2

    .line 398
    :goto_5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 399
    .line 400
    iput v2, v7, Lik1;->c:F

    .line 401
    .line 402
    iput v2, v7, Lik1;->d:F

    .line 403
    .line 404
    invoke-virtual {v10, v7}, Lzj1;->f(Lik1;)V

    .line 405
    .line 406
    .line 407
    iget v2, v11, Landroid/graphics/Rect;->left:I

    .line 408
    .line 409
    int-to-float v2, v2

    .line 410
    iget v5, v11, Landroid/graphics/Rect;->top:I

    .line 411
    .line 412
    int-to-float v5, v5

    .line 413
    invoke-virtual {v11}, Landroid/graphics/Rect;->width()I

    .line 414
    .line 415
    .line 416
    move-result v6

    .line 417
    int-to-float v6, v6

    .line 418
    invoke-virtual {v11}, Landroid/graphics/Rect;->height()I

    .line 419
    .line 420
    .line 421
    move-result v9

    .line 422
    int-to-float v9, v9

    .line 423
    invoke-virtual {v7, v2, v5, v6, v9}, Lik1;->d(FFFF)V

    .line 424
    .line 425
    .line 426
    iget v2, v10, Lzj1;->c:I

    .line 427
    .line 428
    invoke-virtual {v3, v2}, Landroidx/constraintlayout/widget/d;->h(I)Landroidx/constraintlayout/widget/c;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    invoke-virtual {v7, v2}, Lik1;->a(Landroidx/constraintlayout/widget/c;)V

    .line 433
    .line 434
    .line 435
    iget-object v2, v10, Lzj1;->i:Lxj1;

    .line 436
    .line 437
    iget v5, v10, Lzj1;->c:I

    .line 438
    .line 439
    invoke-virtual {v2, v11, v3, v8, v5}, Lxj1;->c(Landroid/graphics/Rect;Landroidx/constraintlayout/widget/d;II)V

    .line 440
    .line 441
    .line 442
    goto :goto_6

    .line 443
    :cond_e
    iget v2, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->A0:I

    .line 444
    .line 445
    if-eqz v2, :cond_f

    .line 446
    .line 447
    new-instance v2, Ljava/lang/StringBuilder;

    .line 448
    .line 449
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 450
    .line 451
    .line 452
    invoke-static {}, Lde3;->t()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v3

    .line 456
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    invoke-static {v9}, Lde3;->v(Landroid/view/View;)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v3

    .line 466
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v3

    .line 480
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    invoke-static {v8, v2}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 491
    .line 492
    .line 493
    :cond_f
    :goto_6
    add-int/lit8 v7, v18, 0x1

    .line 494
    .line 495
    move-object/from16 v3, v16

    .line 496
    .line 497
    move-object/from16 v5, v17

    .line 498
    .line 499
    move-object/from16 v4, v19

    .line 500
    .line 501
    move/from16 v2, v20

    .line 502
    .line 503
    goto/16 :goto_1

    .line 504
    .line 505
    :cond_10
    move-object/from16 v19, v4

    .line 506
    .line 507
    move-object/from16 v17, v5

    .line 508
    .line 509
    const/4 v4, 0x0

    .line 510
    move v0, v2

    .line 511
    move v6, v4

    .line 512
    :goto_7
    if-ge v6, v0, :cond_12

    .line 513
    .line 514
    aget v1, v17, v6

    .line 515
    .line 516
    move-object/from16 v2, v19

    .line 517
    .line 518
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    check-cast v1, Lzj1;

    .line 523
    .line 524
    iget-object v3, v1, Lzj1;->f:Lik1;

    .line 525
    .line 526
    iget v3, v3, Lik1;->V:I

    .line 527
    .line 528
    const/4 v7, -0x1

    .line 529
    if-eq v3, v7, :cond_11

    .line 530
    .line 531
    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    check-cast v3, Lzj1;

    .line 536
    .line 537
    iget-object v4, v1, Lzj1;->f:Lik1;

    .line 538
    .line 539
    iget-object v5, v3, Lzj1;->f:Lik1;

    .line 540
    .line 541
    invoke-virtual {v4, v3, v5}, Lik1;->f(Lzj1;Lik1;)V

    .line 542
    .line 543
    .line 544
    iget-object v1, v1, Lzj1;->g:Lik1;

    .line 545
    .line 546
    iget-object v4, v3, Lzj1;->g:Lik1;

    .line 547
    .line 548
    invoke-virtual {v1, v3, v4}, Lik1;->f(Lzj1;Lik1;)V

    .line 549
    .line 550
    .line 551
    :cond_11
    add-int/lit8 v6, v6, 0x1

    .line 552
    .line 553
    move-object/from16 v19, v2

    .line 554
    .line 555
    goto :goto_7

    .line 556
    :cond_12
    return-void
.end method

.method public final b(II)V
    .locals 5

    .line 1
    iget-object v0, p0, Lek1;->g:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getOptimizationLevel()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l0:I

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getStartState()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-ne v2, v3, :cond_7

    .line 14
    .line 15
    iget-object v2, p0, Lek1;->b:La00;

    .line 16
    .line 17
    iget-object v3, p0, Lek1;->d:Landroidx/constraintlayout/widget/d;

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    iget v4, v3, Landroidx/constraintlayout/widget/d;->c:I

    .line 22
    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v4, p2

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    move v4, p1

    .line 29
    :goto_1
    if-eqz v3, :cond_3

    .line 30
    .line 31
    iget v3, v3, Landroidx/constraintlayout/widget/d;->c:I

    .line 32
    .line 33
    if-nez v3, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move v3, p1

    .line 37
    goto :goto_3

    .line 38
    :cond_3
    :goto_2
    move v3, p2

    .line 39
    :goto_3
    invoke-virtual {v0, v2, v1, v4, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(La00;III)V

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, Lek1;->c:Landroidx/constraintlayout/widget/d;

    .line 43
    .line 44
    if-eqz v2, :cond_6

    .line 45
    .line 46
    iget-object p0, p0, Lek1;->a:La00;

    .line 47
    .line 48
    iget v2, v2, Landroidx/constraintlayout/widget/d;->c:I

    .line 49
    .line 50
    if-nez v2, :cond_4

    .line 51
    .line 52
    move v3, p1

    .line 53
    goto :goto_4

    .line 54
    :cond_4
    move v3, p2

    .line 55
    :goto_4
    if-nez v2, :cond_5

    .line 56
    .line 57
    move p1, p2

    .line 58
    :cond_5
    invoke-virtual {v0, p0, v1, v3, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(La00;III)V

    .line 59
    .line 60
    .line 61
    :cond_6
    return-void

    .line 62
    :cond_7
    iget-object v2, p0, Lek1;->c:Landroidx/constraintlayout/widget/d;

    .line 63
    .line 64
    if-eqz v2, :cond_a

    .line 65
    .line 66
    iget-object v3, p0, Lek1;->a:La00;

    .line 67
    .line 68
    iget v2, v2, Landroidx/constraintlayout/widget/d;->c:I

    .line 69
    .line 70
    if-nez v2, :cond_8

    .line 71
    .line 72
    move v4, p1

    .line 73
    goto :goto_5

    .line 74
    :cond_8
    move v4, p2

    .line 75
    :goto_5
    if-nez v2, :cond_9

    .line 76
    .line 77
    move v2, p2

    .line 78
    goto :goto_6

    .line 79
    :cond_9
    move v2, p1

    .line 80
    :goto_6
    invoke-virtual {v0, v3, v1, v4, v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(La00;III)V

    .line 81
    .line 82
    .line 83
    :cond_a
    iget-object v2, p0, Lek1;->b:La00;

    .line 84
    .line 85
    iget-object p0, p0, Lek1;->d:Landroidx/constraintlayout/widget/d;

    .line 86
    .line 87
    if-eqz p0, :cond_c

    .line 88
    .line 89
    iget v3, p0, Landroidx/constraintlayout/widget/d;->c:I

    .line 90
    .line 91
    if-nez v3, :cond_b

    .line 92
    .line 93
    goto :goto_7

    .line 94
    :cond_b
    move v3, p2

    .line 95
    goto :goto_8

    .line 96
    :cond_c
    :goto_7
    move v3, p1

    .line 97
    :goto_8
    if-eqz p0, :cond_d

    .line 98
    .line 99
    iget p0, p0, Landroidx/constraintlayout/widget/d;->c:I

    .line 100
    .line 101
    if-nez p0, :cond_e

    .line 102
    .line 103
    :cond_d
    move p1, p2

    .line 104
    :cond_e
    invoke-virtual {v0, v2, v1, v3, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(La00;III)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final e(Landroidx/constraintlayout/widget/d;Landroidx/constraintlayout/widget/d;)V
    .locals 6

    .line 1
    iput-object p1, p0, Lek1;->c:Landroidx/constraintlayout/widget/d;

    .line 2
    .line 3
    iput-object p2, p0, Lek1;->d:Landroidx/constraintlayout/widget/d;

    .line 4
    .line 5
    new-instance v0, La00;

    .line 6
    .line 7
    invoke-direct {v0}, La00;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lek1;->a:La00;

    .line 11
    .line 12
    new-instance v0, La00;

    .line 13
    .line 14
    invoke-direct {v0}, La00;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lek1;->b:La00;

    .line 18
    .line 19
    iget-object v1, p0, Lek1;->a:La00;

    .line 20
    .line 21
    sget-boolean v2, Landroidx/constraintlayout/motion/widget/MotionLayout;->s1:Z

    .line 22
    .line 23
    iget-object v2, p0, Lek1;->g:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 24
    .line 25
    iget-object v3, v2, Landroidx/constraintlayout/widget/ConstraintLayout;->c:La00;

    .line 26
    .line 27
    iget-object v4, v3, La00;->y0:Lxi;

    .line 28
    .line 29
    iput-object v4, v1, La00;->y0:Lxi;

    .line 30
    .line 31
    iget-object v5, v1, La00;->w0:Lu70;

    .line 32
    .line 33
    iput-object v4, v5, Lu70;->f:Lxi;

    .line 34
    .line 35
    iget-object v4, v3, La00;->y0:Lxi;

    .line 36
    .line 37
    iput-object v4, v0, La00;->y0:Lxi;

    .line 38
    .line 39
    iget-object v0, v0, La00;->w0:Lu70;

    .line 40
    .line 41
    iput-object v4, v0, Lu70;->f:Lxi;

    .line 42
    .line 43
    iget-object v0, v1, La00;->u0:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lek1;->b:La00;

    .line 49
    .line 50
    iget-object v0, v0, La00;->u0:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lek1;->a:La00;

    .line 56
    .line 57
    invoke-static {v3, v0}, Lek1;->c(La00;La00;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lek1;->b:La00;

    .line 61
    .line 62
    invoke-static {v3, v0}, Lek1;->c(La00;La00;)V

    .line 63
    .line 64
    .line 65
    iget v0, v2, Landroidx/constraintlayout/motion/widget/MotionLayout;->u0:F

    .line 66
    .line 67
    float-to-double v0, v0

    .line 68
    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    .line 69
    .line 70
    cmpl-double v0, v0, v3

    .line 71
    .line 72
    if-lez v0, :cond_1

    .line 73
    .line 74
    if-eqz p1, :cond_0

    .line 75
    .line 76
    iget-object v0, p0, Lek1;->a:La00;

    .line 77
    .line 78
    invoke-virtual {p0, v0, p1}, Lek1;->g(La00;Landroidx/constraintlayout/widget/d;)V

    .line 79
    .line 80
    .line 81
    :cond_0
    iget-object p1, p0, Lek1;->b:La00;

    .line 82
    .line 83
    invoke-virtual {p0, p1, p2}, Lek1;->g(La00;Landroidx/constraintlayout/widget/d;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    iget-object v0, p0, Lek1;->b:La00;

    .line 88
    .line 89
    invoke-virtual {p0, v0, p2}, Lek1;->g(La00;Landroidx/constraintlayout/widget/d;)V

    .line 90
    .line 91
    .line 92
    if-eqz p1, :cond_2

    .line 93
    .line 94
    iget-object p2, p0, Lek1;->a:La00;

    .line 95
    .line 96
    invoke-virtual {p0, p2, p1}, Lek1;->g(La00;Landroidx/constraintlayout/widget/d;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    :goto_0
    iget-object p1, p0, Lek1;->a:La00;

    .line 100
    .line 101
    invoke-virtual {v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->e()Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    iput-boolean p2, p1, La00;->z0:Z

    .line 106
    .line 107
    iget-object p1, p0, Lek1;->a:La00;

    .line 108
    .line 109
    iget-object p2, p1, La00;->v0:Lec;

    .line 110
    .line 111
    invoke-virtual {p2, p1}, Lec;->P(La00;)V

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, Lek1;->b:La00;

    .line 115
    .line 116
    invoke-virtual {v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->e()Z

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    iput-boolean p2, p1, La00;->z0:Z

    .line 121
    .line 122
    iget-object p1, p0, Lek1;->b:La00;

    .line 123
    .line 124
    iget-object p2, p1, La00;->v0:Lec;

    .line 125
    .line 126
    invoke-virtual {p2, p1}, Lec;->P(La00;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    if-eqz p1, :cond_4

    .line 134
    .line 135
    iget p2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 136
    .line 137
    sget-object v0, Lyz;->b:Lyz;

    .line 138
    .line 139
    const/4 v1, -0x2

    .line 140
    if-ne p2, v1, :cond_3

    .line 141
    .line 142
    iget-object p2, p0, Lek1;->a:La00;

    .line 143
    .line 144
    invoke-virtual {p2, v0}, Lzz;->N(Lyz;)V

    .line 145
    .line 146
    .line 147
    iget-object p2, p0, Lek1;->b:La00;

    .line 148
    .line 149
    invoke-virtual {p2, v0}, Lzz;->N(Lyz;)V

    .line 150
    .line 151
    .line 152
    :cond_3
    iget p1, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 153
    .line 154
    if-ne p1, v1, :cond_4

    .line 155
    .line 156
    iget-object p1, p0, Lek1;->a:La00;

    .line 157
    .line 158
    invoke-virtual {p1, v0}, Lzz;->O(Lyz;)V

    .line 159
    .line 160
    .line 161
    iget-object p0, p0, Lek1;->b:La00;

    .line 162
    .line 163
    invoke-virtual {p0, v0}, Lzz;->O(Lyz;)V

    .line 164
    .line 165
    .line 166
    :cond_4
    return-void
.end method

.method public final f()V
    .locals 13

    .line 1
    iget-object v0, p0, Lek1;->g:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 2
    .line 3
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->n0:I

    .line 4
    .line 5
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->o0:I

    .line 6
    .line 7
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    iput v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->c1:I

    .line 16
    .line 17
    iput v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->d1:I

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getOptimizationLevel()I

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1, v2}, Lek1;->b(II)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    instance-of v5, v5, Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 30
    .line 31
    const/4 v7, 0x1

    .line 32
    const/4 v8, 0x0

    .line 33
    if-eqz v5, :cond_0

    .line 34
    .line 35
    const/high16 v5, 0x40000000    # 2.0f

    .line 36
    .line 37
    if-ne v3, v5, :cond_0

    .line 38
    .line 39
    if-ne v4, v5, :cond_0

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_0
    invoke-virtual {p0, v1, v2}, Lek1;->b(II)V

    .line 43
    .line 44
    .line 45
    iget-object v3, p0, Lek1;->a:La00;

    .line 46
    .line 47
    invoke-virtual {v3}, Lzz;->r()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    iput v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Y0:I

    .line 52
    .line 53
    iget-object v3, p0, Lek1;->a:La00;

    .line 54
    .line 55
    invoke-virtual {v3}, Lzz;->l()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    iput v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Z0:I

    .line 60
    .line 61
    iget-object v3, p0, Lek1;->b:La00;

    .line 62
    .line 63
    invoke-virtual {v3}, Lzz;->r()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    iput v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->a1:I

    .line 68
    .line 69
    iget-object v3, p0, Lek1;->b:La00;

    .line 70
    .line 71
    invoke-virtual {v3}, Lzz;->l()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    iput v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->b1:I

    .line 76
    .line 77
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Y0:I

    .line 78
    .line 79
    iget v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->a1:I

    .line 80
    .line 81
    if-ne v4, v5, :cond_2

    .line 82
    .line 83
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Z0:I

    .line 84
    .line 85
    if-eq v4, v3, :cond_1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    move v3, v8

    .line 89
    goto :goto_1

    .line 90
    :cond_2
    :goto_0
    move v3, v7

    .line 91
    :goto_1
    iput-boolean v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->X0:Z

    .line 92
    .line 93
    :goto_2
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Y0:I

    .line 94
    .line 95
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Z0:I

    .line 96
    .line 97
    iget v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->c1:I

    .line 98
    .line 99
    const/high16 v6, -0x80000000

    .line 100
    .line 101
    if-eq v5, v6, :cond_3

    .line 102
    .line 103
    if-nez v5, :cond_4

    .line 104
    .line 105
    :cond_3
    int-to-float v5, v3

    .line 106
    iget v9, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->e1:F

    .line 107
    .line 108
    iget v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->a1:I

    .line 109
    .line 110
    sub-int/2addr v10, v3

    .line 111
    int-to-float v3, v10

    .line 112
    mul-float/2addr v9, v3

    .line 113
    add-float/2addr v9, v5

    .line 114
    float-to-int v3, v9

    .line 115
    :cond_4
    iget v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->d1:I

    .line 116
    .line 117
    if-eq v5, v6, :cond_5

    .line 118
    .line 119
    if-nez v5, :cond_6

    .line 120
    .line 121
    :cond_5
    int-to-float v5, v4

    .line 122
    iget v6, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->e1:F

    .line 123
    .line 124
    iget v9, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->b1:I

    .line 125
    .line 126
    sub-int/2addr v9, v4

    .line 127
    int-to-float v4, v9

    .line 128
    mul-float/2addr v6, v4

    .line 129
    add-float/2addr v6, v5

    .line 130
    float-to-int v4, v6

    .line 131
    :cond_6
    iget-object v5, p0, Lek1;->a:La00;

    .line 132
    .line 133
    iget-boolean v6, v5, La00;->I0:Z

    .line 134
    .line 135
    if-nez v6, :cond_8

    .line 136
    .line 137
    iget-object v6, p0, Lek1;->b:La00;

    .line 138
    .line 139
    iget-boolean v6, v6, La00;->I0:Z

    .line 140
    .line 141
    if-eqz v6, :cond_7

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_7
    move-object v6, v5

    .line 145
    move v5, v8

    .line 146
    goto :goto_4

    .line 147
    :cond_8
    :goto_3
    move-object v6, v5

    .line 148
    move v5, v7

    .line 149
    :goto_4
    iget-boolean v6, v6, La00;->J0:Z

    .line 150
    .line 151
    if-nez v6, :cond_a

    .line 152
    .line 153
    iget-object p0, p0, Lek1;->b:La00;

    .line 154
    .line 155
    iget-boolean p0, p0, La00;->J0:Z

    .line 156
    .line 157
    if-eqz p0, :cond_9

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_9
    move v6, v8

    .line 161
    goto :goto_6

    .line 162
    :cond_a
    :goto_5
    move v6, v7

    .line 163
    :goto_6
    invoke-virtual/range {v0 .. v6}, Landroidx/constraintlayout/widget/ConstraintLayout;->g(IIIIZZ)V

    .line 164
    .line 165
    .line 166
    iget-object p0, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q0:Ljava/util/HashMap;

    .line 167
    .line 168
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:Lek1;

    .line 173
    .line 174
    invoke-virtual {v2}, Lek1;->a()V

    .line 175
    .line 176
    .line 177
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y0:Z

    .line 178
    .line 179
    new-instance v2, Landroid/util/SparseArray;

    .line 180
    .line 181
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 182
    .line 183
    .line 184
    move v3, v8

    .line 185
    :goto_7
    if-ge v3, v1, :cond_b

    .line 186
    .line 187
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    invoke-virtual {p0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    check-cast v4, Lzj1;

    .line 200
    .line 201
    invoke-virtual {v2, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    add-int/lit8 v3, v3, 0x1

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_b
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    iget-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 216
    .line 217
    iget-object v4, v4, Llk1;->c:Lkk1;

    .line 218
    .line 219
    const/4 v5, -0x1

    .line 220
    if-eqz v4, :cond_c

    .line 221
    .line 222
    iget v4, v4, Lkk1;->p:I

    .line 223
    .line 224
    goto :goto_8

    .line 225
    :cond_c
    move v4, v5

    .line 226
    :goto_8
    if-eq v4, v5, :cond_e

    .line 227
    .line 228
    move v6, v8

    .line 229
    :goto_9
    if-ge v6, v1, :cond_e

    .line 230
    .line 231
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    invoke-virtual {p0, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v9

    .line 239
    check-cast v9, Lzj1;

    .line 240
    .line 241
    if-eqz v9, :cond_d

    .line 242
    .line 243
    iput v4, v9, Lzj1;->A:I

    .line 244
    .line 245
    :cond_d
    add-int/lit8 v6, v6, 0x1

    .line 246
    .line 247
    goto :goto_9

    .line 248
    :cond_e
    new-instance v4, Landroid/util/SparseBooleanArray;

    .line 249
    .line 250
    invoke-direct {v4}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0}, Ljava/util/HashMap;->size()I

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    new-array v6, v6, [I

    .line 258
    .line 259
    move v9, v8

    .line 260
    move v10, v9

    .line 261
    :goto_a
    if-ge v9, v1, :cond_10

    .line 262
    .line 263
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 264
    .line 265
    .line 266
    move-result-object v11

    .line 267
    invoke-virtual {p0, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v11

    .line 271
    check-cast v11, Lzj1;

    .line 272
    .line 273
    iget-object v12, v11, Lzj1;->f:Lik1;

    .line 274
    .line 275
    iget v12, v12, Lik1;->V:I

    .line 276
    .line 277
    if-eq v12, v5, :cond_f

    .line 278
    .line 279
    invoke-virtual {v4, v12, v7}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 280
    .line 281
    .line 282
    add-int/lit8 v12, v10, 0x1

    .line 283
    .line 284
    iget-object v11, v11, Lzj1;->f:Lik1;

    .line 285
    .line 286
    iget v11, v11, Lik1;->V:I

    .line 287
    .line 288
    aput v11, v6, v10

    .line 289
    .line 290
    move v10, v12

    .line 291
    :cond_f
    add-int/lit8 v9, v9, 0x1

    .line 292
    .line 293
    goto :goto_a

    .line 294
    :cond_10
    iget-object v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Q0:Ljava/util/ArrayList;

    .line 295
    .line 296
    if-eqz v5, :cond_15

    .line 297
    .line 298
    move v5, v8

    .line 299
    :goto_b
    if-ge v5, v10, :cond_12

    .line 300
    .line 301
    aget v9, v6, v5

    .line 302
    .line 303
    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 304
    .line 305
    .line 306
    move-result-object v9

    .line 307
    invoke-virtual {p0, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v9

    .line 311
    check-cast v9, Lzj1;

    .line 312
    .line 313
    if-nez v9, :cond_11

    .line 314
    .line 315
    goto :goto_c

    .line 316
    :cond_11
    iget-object v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 317
    .line 318
    invoke-virtual {v11, v9}, Llk1;->f(Lzj1;)V

    .line 319
    .line 320
    .line 321
    :goto_c
    add-int/lit8 v5, v5, 0x1

    .line 322
    .line 323
    goto :goto_b

    .line 324
    :cond_12
    iget-object v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->Q0:Ljava/util/ArrayList;

    .line 325
    .line 326
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 331
    .line 332
    .line 333
    move-result v9

    .line 334
    if-eqz v9, :cond_13

    .line 335
    .line 336
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v9

    .line 340
    check-cast v9, Landroidx/constraintlayout/motion/widget/MotionHelper;

    .line 341
    .line 342
    invoke-virtual {v9, v0, p0}, Landroidx/constraintlayout/motion/widget/MotionHelper;->r(Landroidx/constraintlayout/motion/widget/MotionLayout;Ljava/util/HashMap;)V

    .line 343
    .line 344
    .line 345
    goto :goto_d

    .line 346
    :cond_13
    move v5, v8

    .line 347
    :goto_e
    if-ge v5, v10, :cond_17

    .line 348
    .line 349
    aget v9, v6, v5

    .line 350
    .line 351
    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 352
    .line 353
    .line 354
    move-result-object v9

    .line 355
    invoke-virtual {p0, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v9

    .line 359
    check-cast v9, Lzj1;

    .line 360
    .line 361
    if-nez v9, :cond_14

    .line 362
    .line 363
    goto :goto_f

    .line 364
    :cond_14
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 365
    .line 366
    .line 367
    move-result-wide v11

    .line 368
    invoke-virtual {v9, v11, v12, v2, v3}, Lzj1;->h(JII)V

    .line 369
    .line 370
    .line 371
    :goto_f
    add-int/lit8 v5, v5, 0x1

    .line 372
    .line 373
    goto :goto_e

    .line 374
    :cond_15
    move v5, v8

    .line 375
    :goto_10
    if-ge v5, v10, :cond_17

    .line 376
    .line 377
    aget v9, v6, v5

    .line 378
    .line 379
    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 380
    .line 381
    .line 382
    move-result-object v9

    .line 383
    invoke-virtual {p0, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v9

    .line 387
    check-cast v9, Lzj1;

    .line 388
    .line 389
    if-nez v9, :cond_16

    .line 390
    .line 391
    goto :goto_11

    .line 392
    :cond_16
    iget-object v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 393
    .line 394
    invoke-virtual {v11, v9}, Llk1;->f(Lzj1;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 398
    .line 399
    .line 400
    move-result-wide v11

    .line 401
    invoke-virtual {v9, v11, v12, v2, v3}, Lzj1;->h(JII)V

    .line 402
    .line 403
    .line 404
    :goto_11
    add-int/lit8 v5, v5, 0x1

    .line 405
    .line 406
    goto :goto_10

    .line 407
    :cond_17
    move v5, v8

    .line 408
    :goto_12
    if-ge v5, v1, :cond_1a

    .line 409
    .line 410
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 411
    .line 412
    .line 413
    move-result-object v6

    .line 414
    invoke-virtual {p0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v9

    .line 418
    check-cast v9, Lzj1;

    .line 419
    .line 420
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    .line 421
    .line 422
    .line 423
    move-result v6

    .line 424
    invoke-virtual {v4, v6}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 425
    .line 426
    .line 427
    move-result v6

    .line 428
    if-eqz v6, :cond_18

    .line 429
    .line 430
    goto :goto_13

    .line 431
    :cond_18
    if-eqz v9, :cond_19

    .line 432
    .line 433
    iget-object v6, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 434
    .line 435
    invoke-virtual {v6, v9}, Llk1;->f(Lzj1;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 439
    .line 440
    .line 441
    move-result-wide v10

    .line 442
    invoke-virtual {v9, v10, v11, v2, v3}, Lzj1;->h(JII)V

    .line 443
    .line 444
    .line 445
    :cond_19
    :goto_13
    add-int/lit8 v5, v5, 0x1

    .line 446
    .line 447
    goto :goto_12

    .line 448
    :cond_1a
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->g0:Llk1;

    .line 449
    .line 450
    iget-object v2, v2, Llk1;->c:Lkk1;

    .line 451
    .line 452
    const/4 v3, 0x0

    .line 453
    if-eqz v2, :cond_1b

    .line 454
    .line 455
    iget v2, v2, Lkk1;->i:F

    .line 456
    .line 457
    goto :goto_14

    .line 458
    :cond_1b
    move v2, v3

    .line 459
    :goto_14
    cmpl-float v3, v2, v3

    .line 460
    .line 461
    if-eqz v3, :cond_25

    .line 462
    .line 463
    float-to-double v3, v2

    .line 464
    const-wide/16 v5, 0x0

    .line 465
    .line 466
    cmpg-double v3, v3, v5

    .line 467
    .line 468
    if-gez v3, :cond_1c

    .line 469
    .line 470
    goto :goto_15

    .line 471
    :cond_1c
    move v7, v8

    .line 472
    :goto_15
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 473
    .line 474
    .line 475
    move-result v2

    .line 476
    const v3, -0x800001

    .line 477
    .line 478
    .line 479
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 480
    .line 481
    .line 482
    move v9, v3

    .line 483
    move v6, v4

    .line 484
    move v5, v8

    .line 485
    :goto_16
    const/high16 v10, 0x3f800000    # 1.0f

    .line 486
    .line 487
    if-ge v5, v1, :cond_23

    .line 488
    .line 489
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 490
    .line 491
    .line 492
    move-result-object v11

    .line 493
    invoke-virtual {p0, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v11

    .line 497
    check-cast v11, Lzj1;

    .line 498
    .line 499
    iget v12, v11, Lzj1;->l:F

    .line 500
    .line 501
    invoke-static {v12}, Ljava/lang/Float;->isNaN(F)Z

    .line 502
    .line 503
    .line 504
    move-result v12

    .line 505
    if-nez v12, :cond_21

    .line 506
    .line 507
    move v5, v8

    .line 508
    :goto_17
    if-ge v5, v1, :cond_1e

    .line 509
    .line 510
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 511
    .line 512
    .line 513
    move-result-object v6

    .line 514
    invoke-virtual {p0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v6

    .line 518
    check-cast v6, Lzj1;

    .line 519
    .line 520
    iget v9, v6, Lzj1;->l:F

    .line 521
    .line 522
    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    .line 523
    .line 524
    .line 525
    move-result v9

    .line 526
    if-nez v9, :cond_1d

    .line 527
    .line 528
    iget v9, v6, Lzj1;->l:F

    .line 529
    .line 530
    invoke-static {v4, v9}, Ljava/lang/Math;->min(FF)F

    .line 531
    .line 532
    .line 533
    move-result v4

    .line 534
    iget v6, v6, Lzj1;->l:F

    .line 535
    .line 536
    invoke-static {v3, v6}, Ljava/lang/Math;->max(FF)F

    .line 537
    .line 538
    .line 539
    move-result v3

    .line 540
    :cond_1d
    add-int/lit8 v5, v5, 0x1

    .line 541
    .line 542
    goto :goto_17

    .line 543
    :cond_1e
    :goto_18
    if-ge v8, v1, :cond_25

    .line 544
    .line 545
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 546
    .line 547
    .line 548
    move-result-object v5

    .line 549
    invoke-virtual {p0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v5

    .line 553
    check-cast v5, Lzj1;

    .line 554
    .line 555
    iget v6, v5, Lzj1;->l:F

    .line 556
    .line 557
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    .line 558
    .line 559
    .line 560
    move-result v6

    .line 561
    if-nez v6, :cond_20

    .line 562
    .line 563
    sub-float v6, v10, v2

    .line 564
    .line 565
    div-float v6, v10, v6

    .line 566
    .line 567
    iput v6, v5, Lzj1;->n:F

    .line 568
    .line 569
    iget v6, v5, Lzj1;->l:F

    .line 570
    .line 571
    if-eqz v7, :cond_1f

    .line 572
    .line 573
    sub-float v6, v3, v6

    .line 574
    .line 575
    sub-float v9, v3, v4

    .line 576
    .line 577
    div-float/2addr v6, v9

    .line 578
    mul-float/2addr v6, v2

    .line 579
    sub-float v6, v2, v6

    .line 580
    .line 581
    iput v6, v5, Lzj1;->m:F

    .line 582
    .line 583
    goto :goto_19

    .line 584
    :cond_1f
    sub-float/2addr v6, v4

    .line 585
    mul-float/2addr v6, v2

    .line 586
    sub-float v9, v3, v4

    .line 587
    .line 588
    div-float/2addr v6, v9

    .line 589
    sub-float v6, v2, v6

    .line 590
    .line 591
    iput v6, v5, Lzj1;->m:F

    .line 592
    .line 593
    :cond_20
    :goto_19
    add-int/lit8 v8, v8, 0x1

    .line 594
    .line 595
    goto :goto_18

    .line 596
    :cond_21
    iget-object v10, v11, Lzj1;->g:Lik1;

    .line 597
    .line 598
    iget v11, v10, Lik1;->e:F

    .line 599
    .line 600
    iget v10, v10, Lik1;->f:F

    .line 601
    .line 602
    if-eqz v7, :cond_22

    .line 603
    .line 604
    sub-float/2addr v10, v11

    .line 605
    goto :goto_1a

    .line 606
    :cond_22
    add-float/2addr v10, v11

    .line 607
    :goto_1a
    invoke-static {v6, v10}, Ljava/lang/Math;->min(FF)F

    .line 608
    .line 609
    .line 610
    move-result v6

    .line 611
    invoke-static {v9, v10}, Ljava/lang/Math;->max(FF)F

    .line 612
    .line 613
    .line 614
    move-result v9

    .line 615
    add-int/lit8 v5, v5, 0x1

    .line 616
    .line 617
    goto/16 :goto_16

    .line 618
    .line 619
    :cond_23
    :goto_1b
    if-ge v8, v1, :cond_25

    .line 620
    .line 621
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    invoke-virtual {p0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v3

    .line 629
    check-cast v3, Lzj1;

    .line 630
    .line 631
    iget-object v4, v3, Lzj1;->g:Lik1;

    .line 632
    .line 633
    iget v5, v4, Lik1;->e:F

    .line 634
    .line 635
    iget v4, v4, Lik1;->f:F

    .line 636
    .line 637
    if-eqz v7, :cond_24

    .line 638
    .line 639
    sub-float/2addr v4, v5

    .line 640
    goto :goto_1c

    .line 641
    :cond_24
    add-float/2addr v4, v5

    .line 642
    :goto_1c
    sub-float v5, v10, v2

    .line 643
    .line 644
    div-float v5, v10, v5

    .line 645
    .line 646
    iput v5, v3, Lzj1;->n:F

    .line 647
    .line 648
    sub-float/2addr v4, v6

    .line 649
    mul-float/2addr v4, v2

    .line 650
    sub-float v5, v9, v6

    .line 651
    .line 652
    div-float/2addr v4, v5

    .line 653
    sub-float v4, v2, v4

    .line 654
    .line 655
    iput v4, v3, Lzj1;->m:F

    .line 656
    .line 657
    add-int/lit8 v8, v8, 0x1

    .line 658
    .line 659
    goto :goto_1b

    .line 660
    :cond_25
    return-void
.end method

.method public final g(La00;Landroidx/constraintlayout/widget/d;)V
    .locals 11

    .line 1
    new-instance v5, Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v4, Landroidx/constraintlayout/widget/Constraints$LayoutParams;

    .line 7
    .line 8
    invoke-direct {v4}, Landroidx/constraintlayout/widget/Constraints$LayoutParams;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v5}, Landroid/util/SparseArray;->clear()V

    .line 12
    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    invoke-virtual {v5, v6, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lek1;->g:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {v5, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    iget v1, p2, Landroidx/constraintlayout/widget/d;->c:I

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    iget-object p0, p0, Lek1;->b:La00;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getOptimizationLevel()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/high16 v3, 0x40000000    # 2.0f

    .line 44
    .line 45
    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    invoke-static {v7, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    sget-boolean v7, Landroidx/constraintlayout/motion/widget/MotionLayout;->s1:Z

    .line 58
    .line 59
    invoke-virtual {v0, p0, v1, v2, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(La00;III)V

    .line 60
    .line 61
    .line 62
    :cond_0
    iget-object p0, p1, La00;->u0:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    const/4 v7, 0x1

    .line 73
    if-eqz v1, :cond_1

    .line 74
    .line 75
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Lzz;

    .line 80
    .line 81
    iput-boolean v7, v1, Lzz;->j0:Z

    .line 82
    .line 83
    iget-object v2, v1, Lzz;->h0:Landroid/view/View;

    .line 84
    .line 85
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-virtual {v5, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    iget-object p0, p1, La00;->u0:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_6

    .line 104
    .line 105
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    move-object v3, v1

    .line 110
    check-cast v3, Lzz;

    .line 111
    .line 112
    iget-object v2, v3, Lzz;->h0:Landroid/view/View;

    .line 113
    .line 114
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    iget-object v8, p2, Landroidx/constraintlayout/widget/d;->f:Ljava/util/HashMap;

    .line 119
    .line 120
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    invoke-virtual {v8, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    if-eqz v9, :cond_2

    .line 129
    .line 130
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v8, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, Landroidx/constraintlayout/widget/c;

    .line 139
    .line 140
    if-eqz v1, :cond_2

    .line 141
    .line 142
    invoke-virtual {v1, v4}, Landroidx/constraintlayout/widget/c;->a(Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;)V

    .line 143
    .line 144
    .line 145
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-virtual {p2, v1}, Landroidx/constraintlayout/widget/d;->h(I)Landroidx/constraintlayout/widget/c;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    iget-object v1, v1, Landroidx/constraintlayout/widget/c;->e:Luz;

    .line 154
    .line 155
    iget v1, v1, Luz;->c:I

    .line 156
    .line 157
    invoke-virtual {v3, v1}, Lzz;->P(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    invoke-virtual {p2, v1}, Landroidx/constraintlayout/widget/d;->h(I)Landroidx/constraintlayout/widget/c;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iget-object v1, v1, Landroidx/constraintlayout/widget/c;->e:Luz;

    .line 169
    .line 170
    iget v1, v1, Luz;->d:I

    .line 171
    .line 172
    invoke-virtual {v3, v1}, Lzz;->M(I)V

    .line 173
    .line 174
    .line 175
    instance-of v1, v2, Landroidx/constraintlayout/widget/ConstraintHelper;

    .line 176
    .line 177
    if-eqz v1, :cond_4

    .line 178
    .line 179
    move-object v1, v2

    .line 180
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintHelper;

    .line 181
    .line 182
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 183
    .line 184
    .line 185
    move-result v8

    .line 186
    iget-object v9, p2, Landroidx/constraintlayout/widget/d;->f:Ljava/util/HashMap;

    .line 187
    .line 188
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    invoke-virtual {v9, v10}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    if-eqz v10, :cond_3

    .line 197
    .line 198
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    check-cast v8, Landroidx/constraintlayout/widget/c;

    .line 207
    .line 208
    if-eqz v8, :cond_3

    .line 209
    .line 210
    instance-of v9, v3, Lcu0;

    .line 211
    .line 212
    if-eqz v9, :cond_3

    .line 213
    .line 214
    move-object v9, v3

    .line 215
    check-cast v9, Lcu0;

    .line 216
    .line 217
    invoke-virtual {v1, v8, v9, v4, v5}, Landroidx/constraintlayout/widget/ConstraintHelper;->l(Landroidx/constraintlayout/widget/c;Lcu0;Landroidx/constraintlayout/widget/Constraints$LayoutParams;Landroid/util/SparseArray;)V

    .line 218
    .line 219
    .line 220
    :cond_3
    instance-of v1, v2, Landroidx/constraintlayout/widget/Barrier;

    .line 221
    .line 222
    if-eqz v1, :cond_4

    .line 223
    .line 224
    move-object v1, v2

    .line 225
    check-cast v1, Landroidx/constraintlayout/widget/Barrier;

    .line 226
    .line 227
    invoke-virtual {v1}, Landroidx/constraintlayout/widget/ConstraintHelper;->q()V

    .line 228
    .line 229
    .line 230
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    invoke-virtual {v4, v1}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->resolveLayoutDirection(I)V

    .line 235
    .line 236
    .line 237
    sget-boolean v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->s1:Z

    .line 238
    .line 239
    const/4 v1, 0x0

    .line 240
    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(ZLandroid/view/View;Lzz;Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;Landroid/util/SparseArray;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    invoke-virtual {p2, v1}, Landroidx/constraintlayout/widget/d;->h(I)Landroidx/constraintlayout/widget/c;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    iget-object v1, v1, Landroidx/constraintlayout/widget/c;->c:Lwz;

    .line 252
    .line 253
    iget v1, v1, Lwz;->c:I

    .line 254
    .line 255
    if-ne v1, v7, :cond_5

    .line 256
    .line 257
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    iput v1, v3, Lzz;->i0:I

    .line 262
    .line 263
    goto/16 :goto_1

    .line 264
    .line 265
    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    invoke-virtual {p2, v1}, Landroidx/constraintlayout/widget/d;->h(I)Landroidx/constraintlayout/widget/c;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    iget-object v1, v1, Landroidx/constraintlayout/widget/c;->c:Lwz;

    .line 274
    .line 275
    iget v1, v1, Lwz;->b:I

    .line 276
    .line 277
    iput v1, v3, Lzz;->i0:I

    .line 278
    .line 279
    goto/16 :goto_1

    .line 280
    .line 281
    :cond_6
    iget-object p0, p1, La00;->u0:Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 288
    .line 289
    .line 290
    move-result p1

    .line 291
    if-eqz p1, :cond_9

    .line 292
    .line 293
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    check-cast p1, Lzz;

    .line 298
    .line 299
    instance-of p2, p1, Ly53;

    .line 300
    .line 301
    if-eqz p2, :cond_7

    .line 302
    .line 303
    iget-object p2, p1, Lzz;->h0:Landroid/view/View;

    .line 304
    .line 305
    check-cast p2, Landroidx/constraintlayout/widget/ConstraintHelper;

    .line 306
    .line 307
    check-cast p1, Lcu0;

    .line 308
    .line 309
    invoke-virtual {p2, p1, v5}, Landroidx/constraintlayout/widget/ConstraintHelper;->p(Lcu0;Landroid/util/SparseArray;)V

    .line 310
    .line 311
    .line 312
    check-cast p1, Ly53;

    .line 313
    .line 314
    move p2, v6

    .line 315
    :goto_2
    iget v0, p1, Lcu0;->v0:I

    .line 316
    .line 317
    if-ge p2, v0, :cond_7

    .line 318
    .line 319
    iget-object v0, p1, Lcu0;->u0:[Lzz;

    .line 320
    .line 321
    aget-object v0, v0, p2

    .line 322
    .line 323
    if-eqz v0, :cond_8

    .line 324
    .line 325
    iput-boolean v7, v0, Lzz;->G:Z

    .line 326
    .line 327
    :cond_8
    add-int/lit8 p2, p2, 0x1

    .line 328
    .line 329
    goto :goto_2

    .line 330
    :cond_9
    return-void
.end method

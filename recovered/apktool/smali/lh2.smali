.class public final Llh2;
.super Lwy2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public A:Lcb2;

.field public final o:Lmh2;

.field public final p:Ls53;

.field public final q:Lxt0;

.field public final r:Lxt0;

.field public s:Lac1;

.field public t:Lb5;

.field public u:Llj2;

.field public v:Llj2;

.field public w:Llj2;

.field public x:Llj2;

.field public y:Lbb2;

.field public z:Lbb2;


# direct methods
.method public constructor <init>(Lzp;Lzp;Lxt0;Lxt0;Ljava/util/HashSet;Lcz2;)V
    .locals 1

    .line 1
    invoke-static {p5}, Llh2;->G(Ljava/util/HashSet;)Lmh2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lwy2;-><init>(Lzy2;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p5}, Llh2;->G(Ljava/util/HashSet;)Lmh2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Llh2;->o:Lmh2;

    .line 13
    .line 14
    iput-object p3, p0, Llh2;->q:Lxt0;

    .line 15
    .line 16
    iput-object p4, p0, Llh2;->r:Lxt0;

    .line 17
    .line 18
    move-object p3, p2

    .line 19
    move-object p2, p1

    .line 20
    new-instance p1, Ls53;

    .line 21
    .line 22
    move-object p4, p5

    .line 23
    move-object p5, p6

    .line 24
    new-instance p6, Lf42;

    .line 25
    .line 26
    const/16 v0, 0x8

    .line 27
    .line 28
    invoke-direct {p6, v0}, Lf42;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-direct/range {p1 .. p6}, Ls53;-><init>(Lzp;Lzp;Ljava/util/HashSet;Lcz2;Lf42;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Llh2;->p:Ls53;

    .line 35
    .line 36
    return-void
.end method

.method public static F(Lwy2;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    instance-of v1, p0, Llh2;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    check-cast p0, Llh2;

    .line 11
    .line 12
    iget-object p0, p0, Llh2;->p:Ls53;

    .line 13
    .line 14
    iget-object p0, p0, Ls53;->a:Ljava/util/HashSet;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lwy2;

    .line 31
    .line 32
    iget-object v1, v1, Lwy2;->f:Lzy2;

    .line 33
    .line 34
    invoke-interface {v1}, Lzy2;->t()Lbz2;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-object v0

    .line 43
    :cond_1
    iget-object p0, p0, Lwy2;->f:Lzy2;

    .line 44
    .line 45
    invoke-interface {p0}, Lzy2;->t()Lbz2;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    return-object v0
.end method

.method public static G(Ljava/util/HashSet;)Lmh2;
    .locals 5

    .line 1
    new-instance v0, Lwq;

    .line 2
    .line 3
    invoke-static {}, Luk1;->j()Luk1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lwq;-><init>(Luk1;)V

    .line 8
    .line 9
    .line 10
    sget-object v0, Lhw0;->o:Llf;

    .line 11
    .line 12
    const/16 v2, 0x22

    .line 13
    .line 14
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v0, v2}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lwy2;

    .line 41
    .line 42
    iget-object v3, v2, Lwy2;->f:Lzy2;

    .line 43
    .line 44
    sget-object v4, Lzy2;->O:Llf;

    .line 45
    .line 46
    invoke-interface {v3, v4}, Lx02;->h(Llf;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    iget-object v2, v2, Lwy2;->f:Lzy2;

    .line 53
    .line 54
    invoke-interface {v2}, Lzy2;->t()Lbz2;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const-string v2, "StreamSharing"

    .line 63
    .line 64
    const-string v3, "A child does not have capture type."

    .line 65
    .line 66
    invoke-static {v2, v3}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    sget-object p0, Lmh2;->b:Llf;

    .line 71
    .line 72
    invoke-virtual {v1, p0, v0}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Ljw0;->t:Llf;

    .line 76
    .line 77
    const/4 v0, 0x2

    .line 78
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v1, p0, v0}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance p0, Lmh2;

    .line 86
    .line 87
    invoke-static {v1}, Lnq1;->d(Lty;)Lnq1;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-direct {p0, v0}, Lmh2;-><init>(Lnq1;)V

    .line 92
    .line 93
    .line 94
    return-object p0
.end method


# virtual methods
.method public final B()V
    .locals 4

    .line 1
    iget-object v0, p0, Llh2;->A:Lcb2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lcb2;->b()V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Llh2;->A:Lcb2;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Llh2;->u:Llj2;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Llj2;->b()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Llh2;->u:Llj2;

    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, Llh2;->v:Llj2;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, Llj2;->b()V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Llh2;->v:Llj2;

    .line 28
    .line 29
    :cond_2
    iget-object v0, p0, Llh2;->w:Llj2;

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-virtual {v0}, Llj2;->b()V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Llh2;->w:Llj2;

    .line 37
    .line 38
    :cond_3
    iget-object v0, p0, Llh2;->x:Llj2;

    .line 39
    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    invoke-virtual {v0}, Llj2;->b()V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Llh2;->x:Llj2;

    .line 46
    .line 47
    :cond_4
    iget-object v0, p0, Llh2;->s:Lac1;

    .line 48
    .line 49
    if-eqz v0, :cond_5

    .line 50
    .line 51
    iget-object v2, v0, Lac1;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Lx60;

    .line 54
    .line 55
    invoke-virtual {v2}, Lx60;->f()V

    .line 56
    .line 57
    .line 58
    new-instance v2, Lf72;

    .line 59
    .line 60
    const/4 v3, 0x2

    .line 61
    invoke-direct {v2, v0, v3}, Lf72;-><init>(Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    invoke-static {v2}, Lpg3;->w(Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    iput-object v1, p0, Llh2;->s:Lac1;

    .line 68
    .line 69
    :cond_5
    iget-object v0, p0, Llh2;->t:Lb5;

    .line 70
    .line 71
    if-eqz v0, :cond_6

    .line 72
    .line 73
    iget-object v2, v0, Lb5;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, Lcb0;

    .line 76
    .line 77
    invoke-virtual {v2}, Lcb0;->e()V

    .line 78
    .line 79
    .line 80
    new-instance v2, Ls2;

    .line 81
    .line 82
    const/16 v3, 0x12

    .line 83
    .line 84
    invoke-direct {v2, v0, v3}, Ls2;-><init>(Ljava/lang/Object;I)V

    .line 85
    .line 86
    .line 87
    invoke-static {v2}, Lpg3;->w(Ljava/lang/Runnable;)V

    .line 88
    .line 89
    .line 90
    iput-object v1, p0, Llh2;->t:Lb5;

    .line 91
    .line 92
    :cond_6
    return-void
.end method

.method public final C(Ljava/lang/String;Ljava/lang/String;Lzy2;Lpg;Lpg;)Ljava/util/List;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p5

    .line 4
    .line 5
    invoke-static {}, Lpg3;->a()V

    .line 6
    .line 7
    .line 8
    iget-object v6, v0, Llh2;->p:Ls53;

    .line 9
    .line 10
    if-nez v3, :cond_8

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    move-object/from16 v2, p2

    .line 16
    .line 17
    move-object/from16 v3, p3

    .line 18
    .line 19
    move-object/from16 v4, p4

    .line 20
    .line 21
    invoke-virtual/range {v0 .. v5}, Llh2;->D(Ljava/lang/String;Ljava/lang/String;Lzy2;Lpg;Lpg;)V

    .line 22
    .line 23
    .line 24
    move-object v12, v0

    .line 25
    move-object v13, v4

    .line 26
    invoke-virtual {v12}, Lwy2;->b()Lzp;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    new-instance v1, Lac1;

    .line 34
    .line 35
    iget-object v2, v13, Lpg;->b:Lmb0;

    .line 36
    .line 37
    new-instance v3, Lx60;

    .line 38
    .line 39
    invoke-direct {v3, v2}, Lx60;-><init>(Lmb0;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, v0, v3}, Lac1;-><init>(Lzp;Lx60;)V

    .line 43
    .line 44
    .line 45
    iput-object v1, v12, Llh2;->s:Lac1;

    .line 46
    .line 47
    iget-object v0, v12, Lwy2;->i:Landroid/graphics/Rect;

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    const/4 v0, 0x1

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/4 v0, 0x0

    .line 54
    :goto_0
    iget-object v4, v12, Llh2;->w:Llj2;

    .line 55
    .line 56
    iget-object v1, v12, Lwy2;->f:Lzy2;

    .line 57
    .line 58
    check-cast v1, Ljw0;

    .line 59
    .line 60
    invoke-interface {v1}, Ljw0;->s()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v7, Ljava/util/HashMap;

    .line 68
    .line 69
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    iget-object v1, v6, Ls53;->a:Ljava/util/HashSet;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_1

    .line 83
    .line 84
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Lwy2;

    .line 89
    .line 90
    iget-object v2, v6, Ls53;->V:Ls32;

    .line 91
    .line 92
    iget-object v3, v6, Ls53;->f:Lzp;

    .line 93
    .line 94
    move-object/from16 v26, v6

    .line 95
    .line 96
    move v6, v0

    .line 97
    move-object/from16 v0, v26

    .line 98
    .line 99
    invoke-virtual/range {v0 .. v6}, Ls53;->o(Lwy2;Ls32;Lzp;Llj2;IZ)Lfg;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    move-object v14, v0

    .line 104
    invoke-virtual {v7, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move v0, v6

    .line 108
    move-object v6, v14

    .line 109
    goto :goto_1

    .line 110
    :cond_1
    move-object v14, v6

    .line 111
    iget-object v0, v12, Llh2;->s:Lac1;

    .line 112
    .line 113
    iget-object v1, v12, Llh2;->w:Llj2;

    .line 114
    .line 115
    new-instance v2, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v7}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 122
    .line 123
    .line 124
    if-eqz v1, :cond_7

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-static {}, Lpg3;->a()V

    .line 130
    .line 131
    .line 132
    new-instance v3, Ldb0;

    .line 133
    .line 134
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 135
    .line 136
    .line 137
    iput-object v3, v0, Lac1;->d:Ljava/lang/Object;

    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_3

    .line 148
    .line 149
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    check-cast v3, Lfg;

    .line 154
    .line 155
    iget-object v4, v0, Lac1;->d:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v4, Ldb0;

    .line 158
    .line 159
    iget-object v5, v3, Lfg;->d:Landroid/graphics/Rect;

    .line 160
    .line 161
    iget v6, v3, Lfg;->f:I

    .line 162
    .line 163
    iget-boolean v8, v3, Lfg;->g:Z

    .line 164
    .line 165
    new-instance v9, Landroid/graphics/Matrix;

    .line 166
    .line 167
    iget-object v13, v1, Llj2;->b:Landroid/graphics/Matrix;

    .line 168
    .line 169
    invoke-direct {v9, v13}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 170
    .line 171
    .line 172
    new-instance v13, Landroid/graphics/RectF;

    .line 173
    .line 174
    invoke-direct {v13, v5}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 175
    .line 176
    .line 177
    iget-object v15, v3, Lfg;->e:Landroid/util/Size;

    .line 178
    .line 179
    sget-object v16, Lcr2;->a:Landroid/graphics/RectF;

    .line 180
    .line 181
    new-instance v10, Landroid/graphics/RectF;

    .line 182
    .line 183
    invoke-virtual {v15}, Landroid/util/Size;->getWidth()I

    .line 184
    .line 185
    .line 186
    move-result v11

    .line 187
    int-to-float v11, v11

    .line 188
    move-object/from16 p1, v2

    .line 189
    .line 190
    invoke-virtual {v15}, Landroid/util/Size;->getHeight()I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    int-to-float v2, v2

    .line 195
    move-object/from16 v16, v5

    .line 196
    .line 197
    const/4 v5, 0x0

    .line 198
    invoke-direct {v10, v5, v5, v11, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 199
    .line 200
    .line 201
    invoke-static {v13, v10, v6, v8}, Lcr2;->a(Landroid/graphics/RectF;Landroid/graphics/RectF;IZ)Landroid/graphics/Matrix;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-virtual {v9, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 206
    .line 207
    .line 208
    invoke-static/range {v16 .. v16}, Lcr2;->d(Landroid/graphics/Rect;)Landroid/util/Size;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-static {v2, v6}, Lcr2;->e(Landroid/util/Size;I)Landroid/util/Size;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-static {v2, v15}, Lcr2;->c(Landroid/util/Size;Landroid/util/Size;)Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    invoke-static {v2}, Lde3;->f(Z)V

    .line 221
    .line 222
    .line 223
    new-instance v2, Landroid/graphics/Rect;

    .line 224
    .line 225
    invoke-virtual {v15}, Landroid/util/Size;->getWidth()I

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    invoke-virtual {v15}, Landroid/util/Size;->getHeight()I

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    const/4 v11, 0x0

    .line 234
    invoke-direct {v2, v11, v11, v5, v10}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 235
    .line 236
    .line 237
    iget-object v5, v1, Llj2;->g:Lpg;

    .line 238
    .line 239
    invoke-virtual {v5}, Lpg;->a()Lb5;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    iput-object v15, v5, Lb5;->b:Ljava/lang/Object;

    .line 244
    .line 245
    invoke-virtual {v5}, Lb5;->k()Lpg;

    .line 246
    .line 247
    .line 248
    move-result-object v18

    .line 249
    new-instance v15, Llj2;

    .line 250
    .line 251
    iget v5, v3, Lfg;->b:I

    .line 252
    .line 253
    iget v10, v3, Lfg;->c:I

    .line 254
    .line 255
    iget v11, v1, Llj2;->i:I

    .line 256
    .line 257
    sub-int v22, v11, v6

    .line 258
    .line 259
    iget-boolean v6, v1, Llj2;->e:Z

    .line 260
    .line 261
    if-eq v6, v8, :cond_2

    .line 262
    .line 263
    const/16 v24, 0x1

    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_2
    const/16 v24, 0x0

    .line 267
    .line 268
    :goto_3
    const/16 v20, 0x0

    .line 269
    .line 270
    const/16 v23, -0x1

    .line 271
    .line 272
    move-object/from16 v21, v2

    .line 273
    .line 274
    move/from16 v16, v5

    .line 275
    .line 276
    move-object/from16 v19, v9

    .line 277
    .line 278
    move/from16 v17, v10

    .line 279
    .line 280
    invoke-direct/range {v15 .. v24}, Llj2;-><init>(IILpg;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v4, v3, v15}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-object/from16 v2, p1

    .line 287
    .line 288
    goto/16 :goto_2

    .line 289
    .line 290
    :cond_3
    iget-object v2, v0, Lac1;->b:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v2, Lx60;

    .line 293
    .line 294
    const/4 v3, 0x1

    .line 295
    invoke-virtual {v1, v3}, Llj2;->c(Z)Lrj2;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    iget-object v3, v2, Lx60;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 300
    .line 301
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    if-eqz v3, :cond_4

    .line 306
    .line 307
    invoke-virtual {v4}, Lrj2;->b()V

    .line 308
    .line 309
    .line 310
    goto :goto_4

    .line 311
    :cond_4
    new-instance v3, Lj8;

    .line 312
    .line 313
    const/16 v5, 0x10

    .line 314
    .line 315
    invoke-direct {v3, v5, v2, v4}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    new-instance v5, Lv60;

    .line 319
    .line 320
    const/4 v11, 0x0

    .line 321
    invoke-direct {v5, v4, v11}, Lv60;-><init>(Lrj2;I)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2, v3, v5}, Lx60;->b(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    .line 325
    .line 326
    .line 327
    :goto_4
    iget-object v2, v0, Lac1;->d:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v2, Ldb0;

    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 340
    .line 341
    .line 342
    move-result v3

    .line 343
    if-eqz v3, :cond_5

    .line 344
    .line 345
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    check-cast v3, Ljava/util/Map$Entry;

    .line 350
    .line 351
    invoke-virtual {v0, v1, v3}, Lac1;->f(Llj2;Ljava/util/Map$Entry;)V

    .line 352
    .line 353
    .line 354
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    check-cast v4, Llj2;

    .line 359
    .line 360
    new-instance v5, Lzo;

    .line 361
    .line 362
    const/16 v6, 0xc

    .line 363
    .line 364
    invoke-direct {v5, v6, v0, v1, v3}, Lzo;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    invoke-static {}, Lpg3;->a()V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v4}, Llj2;->a()V

    .line 374
    .line 375
    .line 376
    iget-object v3, v4, Llj2;->m:Ljava/util/HashSet;

    .line 377
    .line 378
    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    goto :goto_5

    .line 382
    :cond_5
    iget-object v2, v0, Lac1;->d:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v2, Ldb0;

    .line 385
    .line 386
    new-instance v3, Ldl0;

    .line 387
    .line 388
    const/4 v4, 0x1

    .line 389
    invoke-direct {v3, v2, v4}, Ldl0;-><init>(Ljava/lang/Object;I)V

    .line 390
    .line 391
    .line 392
    iget-object v1, v1, Llj2;->o:Ljava/util/ArrayList;

    .line 393
    .line 394
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    iget-object v0, v0, Lac1;->d:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v0, Ldb0;

    .line 400
    .line 401
    new-instance v1, Ljava/util/HashMap;

    .line 402
    .line 403
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v7}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 415
    .line 416
    .line 417
    move-result v3

    .line 418
    if-eqz v3, :cond_6

    .line 419
    .line 420
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    check-cast v3, Ljava/util/Map$Entry;

    .line 425
    .line 426
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    check-cast v4, Lwy2;

    .line 431
    .line 432
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v3

    .line 436
    invoke-virtual {v0, v3}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    check-cast v3, Llj2;

    .line 441
    .line 442
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    goto :goto_6

    .line 446
    :cond_6
    invoke-virtual {v14, v1}, Ls53;->s(Ljava/util/HashMap;)V

    .line 447
    .line 448
    .line 449
    iget-object v0, v12, Llh2;->y:Lbb2;

    .line 450
    .line 451
    invoke-virtual {v0}, Lbb2;->c()Lfb2;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    new-instance v1, Ljava/util/ArrayList;

    .line 460
    .line 461
    const/4 v3, 0x1

    .line 462
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 463
    .line 464
    .line 465
    const/16 v25, 0x0

    .line 466
    .line 467
    aget-object v0, v0, v25

    .line 468
    .line 469
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    return-object v0

    .line 480
    :cond_7
    const-string v0, "Null surfaceEdge"

    .line 481
    .line 482
    invoke-static {v0}, Ln4;->s(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    const/4 v0, 0x0

    .line 486
    return-object v0

    .line 487
    :cond_8
    move-object/from16 v13, p4

    .line 488
    .line 489
    move-object v12, v0

    .line 490
    move-object v14, v6

    .line 491
    invoke-virtual/range {p0 .. p5}, Llh2;->D(Ljava/lang/String;Ljava/lang/String;Lzy2;Lpg;Lpg;)V

    .line 492
    .line 493
    .line 494
    new-instance v0, Llj2;

    .line 495
    .line 496
    iget-object v4, v12, Lwy2;->j:Landroid/graphics/Matrix;

    .line 497
    .line 498
    invoke-virtual {v12}, Lwy2;->h()Lzp;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    invoke-interface {v1}, Lzp;->k()Z

    .line 506
    .line 507
    .line 508
    move-result v5

    .line 509
    iget-object v1, v3, Lpg;->a:Landroid/util/Size;

    .line 510
    .line 511
    iget-object v2, v12, Lwy2;->i:Landroid/graphics/Rect;

    .line 512
    .line 513
    if-eqz v2, :cond_9

    .line 514
    .line 515
    const/4 v11, 0x0

    .line 516
    :goto_7
    move-object v6, v2

    .line 517
    goto :goto_8

    .line 518
    :cond_9
    new-instance v2, Landroid/graphics/Rect;

    .line 519
    .line 520
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 521
    .line 522
    .line 523
    move-result v6

    .line 524
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    const/4 v11, 0x0

    .line 529
    invoke-direct {v2, v11, v11, v6, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 530
    .line 531
    .line 532
    goto :goto_7

    .line 533
    :goto_8
    invoke-virtual {v12}, Lwy2;->h()Lzp;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12, v1, v11}, Lwy2;->g(Lzp;Z)I

    .line 541
    .line 542
    .line 543
    move-result v7

    .line 544
    invoke-virtual {v12}, Lwy2;->h()Lzp;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12, v1}, Lwy2;->k(Lzp;)Z

    .line 552
    .line 553
    .line 554
    move-result v9

    .line 555
    const/4 v1, 0x3

    .line 556
    const/16 v2, 0x22

    .line 557
    .line 558
    const/4 v8, -0x1

    .line 559
    invoke-direct/range {v0 .. v9}, Llj2;-><init>(IILpg;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    .line 560
    .line 561
    .line 562
    iput-object v0, v12, Llh2;->v:Llj2;

    .line 563
    .line 564
    invoke-virtual {v12}, Lwy2;->h()Lzp;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    iput-object v0, v12, Llh2;->x:Llj2;

    .line 572
    .line 573
    iget-object v0, v12, Llh2;->v:Llj2;

    .line 574
    .line 575
    move-object/from16 v4, p3

    .line 576
    .line 577
    invoke-virtual {v12, v0, v4, v3}, Llh2;->E(Llj2;Lzy2;Lpg;)Lbb2;

    .line 578
    .line 579
    .line 580
    move-result-object v7

    .line 581
    iput-object v7, v12, Llh2;->z:Lbb2;

    .line 582
    .line 583
    iget-object v0, v12, Llh2;->A:Lcb2;

    .line 584
    .line 585
    if-eqz v0, :cond_a

    .line 586
    .line 587
    invoke-virtual {v0}, Lcb2;->b()V

    .line 588
    .line 589
    .line 590
    :cond_a
    new-instance v8, Lcb2;

    .line 591
    .line 592
    new-instance v0, Lkh2;

    .line 593
    .line 594
    move-object/from16 v2, p1

    .line 595
    .line 596
    move-object v6, v3

    .line 597
    move-object v1, v12

    .line 598
    move-object v5, v13

    .line 599
    move-object/from16 v3, p2

    .line 600
    .line 601
    invoke-direct/range {v0 .. v6}, Lkh2;-><init>(Llh2;Ljava/lang/String;Ljava/lang/String;Lzy2;Lpg;Lpg;)V

    .line 602
    .line 603
    .line 604
    invoke-direct {v8, v0}, Lcb2;-><init>(Ldb2;)V

    .line 605
    .line 606
    .line 607
    iput-object v8, v12, Llh2;->A:Lcb2;

    .line 608
    .line 609
    iput-object v8, v7, Lab2;->f:Lcb2;

    .line 610
    .line 611
    invoke-virtual {v12}, Lwy2;->b()Lzp;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    invoke-virtual {v12}, Lwy2;->h()Lzp;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    new-instance v2, Lb5;

    .line 620
    .line 621
    iget-object v3, v13, Lpg;->b:Lmb0;

    .line 622
    .line 623
    new-instance v4, Lcb0;

    .line 624
    .line 625
    iget-object v5, v12, Llh2;->q:Lxt0;

    .line 626
    .line 627
    iget-object v6, v12, Llh2;->r:Lxt0;

    .line 628
    .line 629
    invoke-direct {v4, v3, v5, v6}, Lcb0;-><init>(Lmb0;Lxt0;Lxt0;)V

    .line 630
    .line 631
    .line 632
    invoke-direct {v2, v0, v1, v4}, Lb5;-><init>(Lzp;Lzp;Lcb0;)V

    .line 633
    .line 634
    .line 635
    iput-object v2, v12, Llh2;->t:Lb5;

    .line 636
    .line 637
    iget-object v0, v12, Lwy2;->i:Landroid/graphics/Rect;

    .line 638
    .line 639
    if-eqz v0, :cond_b

    .line 640
    .line 641
    const/4 v6, 0x1

    .line 642
    goto :goto_9

    .line 643
    :cond_b
    const/4 v6, 0x0

    .line 644
    :goto_9
    iget-object v4, v12, Llh2;->w:Llj2;

    .line 645
    .line 646
    iget-object v7, v12, Llh2;->x:Llj2;

    .line 647
    .line 648
    iget-object v0, v12, Lwy2;->f:Lzy2;

    .line 649
    .line 650
    check-cast v0, Ljw0;

    .line 651
    .line 652
    invoke-interface {v0}, Ljw0;->s()I

    .line 653
    .line 654
    .line 655
    move-result v5

    .line 656
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 657
    .line 658
    .line 659
    new-instance v8, Ljava/util/HashMap;

    .line 660
    .line 661
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 662
    .line 663
    .line 664
    iget-object v0, v14, Ls53;->a:Ljava/util/HashSet;

    .line 665
    .line 666
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 667
    .line 668
    .line 669
    move-result-object v9

    .line 670
    :goto_a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 671
    .line 672
    .line 673
    move-result v0

    .line 674
    if-eqz v0, :cond_c

    .line 675
    .line 676
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    move-object v1, v0

    .line 681
    check-cast v1, Lwy2;

    .line 682
    .line 683
    iget-object v2, v14, Ls53;->V:Ls32;

    .line 684
    .line 685
    iget-object v3, v14, Ls53;->f:Lzp;

    .line 686
    .line 687
    move-object v0, v14

    .line 688
    invoke-virtual/range {v0 .. v6}, Ls53;->o(Lwy2;Ls32;Lzp;Llj2;IZ)Lfg;

    .line 689
    .line 690
    .line 691
    move-result-object v10

    .line 692
    move-object v11, v4

    .line 693
    iget-object v2, v0, Ls53;->W:Ls32;

    .line 694
    .line 695
    iget-object v3, v0, Ls53;->i:Lzp;

    .line 696
    .line 697
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-object v4, v7

    .line 701
    invoke-virtual/range {v0 .. v6}, Ls53;->o(Lwy2;Ls32;Lzp;Llj2;IZ)Lfg;

    .line 702
    .line 703
    .line 704
    move-result-object v2

    .line 705
    new-instance v3, Lof;

    .line 706
    .line 707
    invoke-direct {v3, v10, v2}, Lof;-><init>(Lfg;Lfg;)V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v8, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-object v4, v11

    .line 714
    goto :goto_a

    .line 715
    :cond_c
    move-object v0, v14

    .line 716
    iget-object v13, v12, Llh2;->t:Lb5;

    .line 717
    .line 718
    iget-object v1, v12, Llh2;->w:Llj2;

    .line 719
    .line 720
    iget-object v2, v12, Llh2;->x:Llj2;

    .line 721
    .line 722
    new-instance v3, Ljava/util/ArrayList;

    .line 723
    .line 724
    invoke-virtual {v8}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 725
    .line 726
    .line 727
    move-result-object v4

    .line 728
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 729
    .line 730
    .line 731
    new-instance v4, Lpf;

    .line 732
    .line 733
    invoke-direct {v4, v1, v2, v3}, Lpf;-><init>(Llj2;Llj2;Ljava/util/ArrayList;)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 737
    .line 738
    .line 739
    iget-object v1, v13, Lb5;->b:Ljava/lang/Object;

    .line 740
    .line 741
    check-cast v1, Lcb0;

    .line 742
    .line 743
    invoke-static {}, Lpg3;->a()V

    .line 744
    .line 745
    .line 746
    iput-object v4, v13, Lb5;->f:Ljava/lang/Object;

    .line 747
    .line 748
    new-instance v2, Ldb0;

    .line 749
    .line 750
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 751
    .line 752
    .line 753
    iput-object v2, v13, Lb5;->e:Ljava/lang/Object;

    .line 754
    .line 755
    iget-object v2, v13, Lb5;->f:Ljava/lang/Object;

    .line 756
    .line 757
    check-cast v2, Lpf;

    .line 758
    .line 759
    iget-object v3, v2, Lpf;->a:Llj2;

    .line 760
    .line 761
    iget-object v4, v2, Lpf;->b:Llj2;

    .line 762
    .line 763
    iget-object v2, v2, Lpf;->c:Ljava/util/ArrayList;

    .line 764
    .line 765
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 770
    .line 771
    .line 772
    move-result v5

    .line 773
    if-eqz v5, :cond_e

    .line 774
    .line 775
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v5

    .line 779
    check-cast v5, Lof;

    .line 780
    .line 781
    iget-object v6, v13, Lb5;->e:Ljava/lang/Object;

    .line 782
    .line 783
    check-cast v6, Ldb0;

    .line 784
    .line 785
    iget-object v7, v5, Lof;->a:Lfg;

    .line 786
    .line 787
    iget-object v9, v7, Lfg;->d:Landroid/graphics/Rect;

    .line 788
    .line 789
    iget v10, v7, Lfg;->f:I

    .line 790
    .line 791
    iget-boolean v11, v7, Lfg;->g:Z

    .line 792
    .line 793
    new-instance v18, Landroid/graphics/Matrix;

    .line 794
    .line 795
    invoke-direct/range {v18 .. v18}, Landroid/graphics/Matrix;-><init>()V

    .line 796
    .line 797
    .line 798
    invoke-static {v9}, Lcr2;->d(Landroid/graphics/Rect;)Landroid/util/Size;

    .line 799
    .line 800
    .line 801
    move-result-object v9

    .line 802
    invoke-static {v9, v10}, Lcr2;->e(Landroid/util/Size;I)Landroid/util/Size;

    .line 803
    .line 804
    .line 805
    move-result-object v9

    .line 806
    iget-object v14, v7, Lfg;->e:Landroid/util/Size;

    .line 807
    .line 808
    invoke-static {v9, v14}, Lcr2;->c(Landroid/util/Size;Landroid/util/Size;)Z

    .line 809
    .line 810
    .line 811
    move-result v9

    .line 812
    invoke-static {v9}, Lde3;->f(Z)V

    .line 813
    .line 814
    .line 815
    new-instance v9, Landroid/graphics/Rect;

    .line 816
    .line 817
    invoke-virtual {v14}, Landroid/util/Size;->getWidth()I

    .line 818
    .line 819
    .line 820
    move-result v15

    .line 821
    move-object/from16 p1, v2

    .line 822
    .line 823
    invoke-virtual {v14}, Landroid/util/Size;->getHeight()I

    .line 824
    .line 825
    .line 826
    move-result v2

    .line 827
    move-object/from16 p2, v8

    .line 828
    .line 829
    const/4 v8, 0x0

    .line 830
    invoke-direct {v9, v8, v8, v15, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 831
    .line 832
    .line 833
    iget-object v2, v3, Llj2;->g:Lpg;

    .line 834
    .line 835
    invoke-virtual {v2}, Lpg;->a()Lb5;

    .line 836
    .line 837
    .line 838
    move-result-object v2

    .line 839
    iput-object v14, v2, Lb5;->b:Ljava/lang/Object;

    .line 840
    .line 841
    invoke-virtual {v2}, Lb5;->k()Lpg;

    .line 842
    .line 843
    .line 844
    move-result-object v17

    .line 845
    new-instance v14, Llj2;

    .line 846
    .line 847
    iget v15, v7, Lfg;->b:I

    .line 848
    .line 849
    iget v2, v7, Lfg;->c:I

    .line 850
    .line 851
    iget v7, v3, Llj2;->i:I

    .line 852
    .line 853
    sub-int v21, v7, v10

    .line 854
    .line 855
    iget-boolean v7, v3, Llj2;->e:Z

    .line 856
    .line 857
    if-eq v7, v11, :cond_d

    .line 858
    .line 859
    const/16 v23, 0x1

    .line 860
    .line 861
    goto :goto_c

    .line 862
    :cond_d
    const/16 v23, 0x0

    .line 863
    .line 864
    :goto_c
    const/16 v19, 0x0

    .line 865
    .line 866
    const/16 v22, -0x1

    .line 867
    .line 868
    move/from16 v16, v2

    .line 869
    .line 870
    move-object/from16 v20, v9

    .line 871
    .line 872
    invoke-direct/range {v14 .. v23}, Llj2;-><init>(IILpg;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    .line 873
    .line 874
    .line 875
    invoke-virtual {v6, v5, v14}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-object/from16 v2, p1

    .line 879
    .line 880
    move-object/from16 v8, p2

    .line 881
    .line 882
    goto :goto_b

    .line 883
    :cond_e
    move-object/from16 p2, v8

    .line 884
    .line 885
    const/4 v2, 0x1

    .line 886
    invoke-virtual {v3, v2}, Llj2;->c(Z)Lrj2;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    invoke-virtual {v1, v2}, Lcb0;->d(Lrj2;)V

    .line 891
    .line 892
    .line 893
    const/4 v11, 0x0

    .line 894
    invoke-virtual {v4, v11}, Llj2;->c(Z)Lrj2;

    .line 895
    .line 896
    .line 897
    move-result-object v2

    .line 898
    invoke-virtual {v1, v2}, Lcb0;->d(Lrj2;)V

    .line 899
    .line 900
    .line 901
    iget-object v1, v13, Lb5;->c:Ljava/lang/Object;

    .line 902
    .line 903
    move-object v14, v1

    .line 904
    check-cast v14, Lzp;

    .line 905
    .line 906
    iget-object v1, v13, Lb5;->d:Ljava/lang/Object;

    .line 907
    .line 908
    move-object v15, v1

    .line 909
    check-cast v15, Lzp;

    .line 910
    .line 911
    iget-object v1, v13, Lb5;->e:Ljava/lang/Object;

    .line 912
    .line 913
    check-cast v1, Ldb0;

    .line 914
    .line 915
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 916
    .line 917
    .line 918
    move-result-object v1

    .line 919
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 920
    .line 921
    .line 922
    move-result-object v1

    .line 923
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 924
    .line 925
    .line 926
    move-result v2

    .line 927
    if-eqz v2, :cond_f

    .line 928
    .line 929
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    move-result-object v2

    .line 933
    move-object/from16 v18, v2

    .line 934
    .line 935
    check-cast v18, Ljava/util/Map$Entry;

    .line 936
    .line 937
    move-object/from16 v16, v3

    .line 938
    .line 939
    move-object/from16 v17, v4

    .line 940
    .line 941
    invoke-virtual/range {v13 .. v18}, Lb5;->l(Lzp;Lzp;Llj2;Llj2;Ljava/util/Map$Entry;)V

    .line 942
    .line 943
    .line 944
    invoke-interface/range {v18 .. v18}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    move-result-object v2

    .line 948
    check-cast v2, Llj2;

    .line 949
    .line 950
    move-object/from16 v19, v18

    .line 951
    .line 952
    move-object/from16 v18, v17

    .line 953
    .line 954
    move-object/from16 v17, v16

    .line 955
    .line 956
    move-object/from16 v16, v15

    .line 957
    .line 958
    move-object v15, v14

    .line 959
    move-object v14, v13

    .line 960
    new-instance v13, Lon;

    .line 961
    .line 962
    const/16 v20, 0x3

    .line 963
    .line 964
    invoke-direct/range {v13 .. v20}, Lon;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 965
    .line 966
    .line 967
    move-object v3, v13

    .line 968
    move-object v13, v14

    .line 969
    move-object v14, v15

    .line 970
    move-object/from16 v15, v16

    .line 971
    .line 972
    move-object/from16 v16, v17

    .line 973
    .line 974
    move-object/from16 v17, v18

    .line 975
    .line 976
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 977
    .line 978
    .line 979
    invoke-static {}, Lpg3;->a()V

    .line 980
    .line 981
    .line 982
    invoke-virtual {v2}, Llj2;->a()V

    .line 983
    .line 984
    .line 985
    iget-object v2, v2, Llj2;->m:Ljava/util/HashSet;

    .line 986
    .line 987
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 988
    .line 989
    .line 990
    move-object/from16 v3, v16

    .line 991
    .line 992
    move-object/from16 v4, v17

    .line 993
    .line 994
    goto :goto_d

    .line 995
    :cond_f
    iget-object v1, v13, Lb5;->e:Ljava/lang/Object;

    .line 996
    .line 997
    check-cast v1, Ldb0;

    .line 998
    .line 999
    new-instance v2, Ljava/util/HashMap;

    .line 1000
    .line 1001
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual/range {p2 .. p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v3

    .line 1008
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v3

    .line 1012
    :goto_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1013
    .line 1014
    .line 1015
    move-result v4

    .line 1016
    if-eqz v4, :cond_10

    .line 1017
    .line 1018
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v4

    .line 1022
    check-cast v4, Ljava/util/Map$Entry;

    .line 1023
    .line 1024
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v5

    .line 1028
    check-cast v5, Lwy2;

    .line 1029
    .line 1030
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v4

    .line 1034
    invoke-virtual {v1, v4}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v4

    .line 1038
    check-cast v4, Llj2;

    .line 1039
    .line 1040
    invoke-virtual {v2, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1041
    .line 1042
    .line 1043
    goto :goto_e

    .line 1044
    :cond_10
    invoke-virtual {v0, v2}, Ls53;->s(Ljava/util/HashMap;)V

    .line 1045
    .line 1046
    .line 1047
    iget-object v0, v12, Llh2;->y:Lbb2;

    .line 1048
    .line 1049
    invoke-virtual {v0}, Lbb2;->c()Lfb2;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v0

    .line 1053
    iget-object v1, v12, Llh2;->z:Lbb2;

    .line 1054
    .line 1055
    invoke-virtual {v1}, Lbb2;->c()Lfb2;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v1

    .line 1059
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v0

    .line 1063
    new-instance v1, Ljava/util/ArrayList;

    .line 1064
    .line 1065
    const/4 v2, 0x2

    .line 1066
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1067
    .line 1068
    .line 1069
    :goto_f
    if-ge v11, v2, :cond_11

    .line 1070
    .line 1071
    aget-object v3, v0, v11

    .line 1072
    .line 1073
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1077
    .line 1078
    .line 1079
    add-int/lit8 v11, v11, 0x1

    .line 1080
    .line 1081
    goto :goto_f

    .line 1082
    :cond_11
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v0

    .line 1086
    return-object v0
.end method

.method public final D(Ljava/lang/String;Ljava/lang/String;Lzy2;Lpg;Lpg;)V
    .locals 10

    .line 1
    new-instance v0, Llj2;

    .line 2
    .line 3
    iget-object v4, p0, Lwy2;->j:Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-virtual {p0}, Lwy2;->b()Lzp;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-interface {v1}, Lzp;->k()Z

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    iget-object v1, p4, Lpg;->a:Landroid/util/Size;

    .line 17
    .line 18
    iget-object v2, p0, Lwy2;->i:Landroid/graphics/Rect;

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Landroid/graphics/Rect;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-direct {v2, v6, v6, v7, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-virtual {p0}, Lwy2;->b()Lzp;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v1, v6}, Lwy2;->g(Lzp;Z)I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    invoke-virtual {p0}, Lwy2;->b()Lzp;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v1}, Lwy2;->k(Lzp;)Z

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    const/4 v1, 0x3

    .line 60
    move-object v6, v2

    .line 61
    const/16 v2, 0x22

    .line 62
    .line 63
    const/4 v8, -0x1

    .line 64
    move-object v3, p4

    .line 65
    invoke-direct/range {v0 .. v9}, Llj2;-><init>(IILpg;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Llh2;->u:Llj2;

    .line 69
    .line 70
    invoke-virtual {p0}, Lwy2;->b()Lzp;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, Llh2;->w:Llj2;

    .line 78
    .line 79
    iget-object v0, p0, Llh2;->u:Llj2;

    .line 80
    .line 81
    invoke-virtual {p0, v0, p3, p4}, Llh2;->E(Llj2;Lzy2;Lpg;)Lbb2;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    iput-object v7, p0, Llh2;->y:Lbb2;

    .line 86
    .line 87
    iget-object v0, p0, Llh2;->A:Lcb2;

    .line 88
    .line 89
    if-eqz v0, :cond_1

    .line 90
    .line 91
    invoke-virtual {v0}, Lcb2;->b()V

    .line 92
    .line 93
    .line 94
    :cond_1
    new-instance v8, Lcb2;

    .line 95
    .line 96
    new-instance v0, Lkh2;

    .line 97
    .line 98
    move-object v1, p0

    .line 99
    move-object v2, p1

    .line 100
    move-object v3, p2

    .line 101
    move-object v4, p3

    .line 102
    move-object v5, p4

    .line 103
    move-object v6, p5

    .line 104
    invoke-direct/range {v0 .. v6}, Lkh2;-><init>(Llh2;Ljava/lang/String;Ljava/lang/String;Lzy2;Lpg;Lpg;)V

    .line 105
    .line 106
    .line 107
    invoke-direct {v8, v0}, Lcb2;-><init>(Ldb2;)V

    .line 108
    .line 109
    .line 110
    iput-object v8, p0, Llh2;->A:Lcb2;

    .line 111
    .line 112
    iput-object v8, v7, Lab2;->f:Lcb2;

    .line 113
    .line 114
    return-void
.end method

.method public final E(Llj2;Lzy2;Lpg;)Lbb2;
    .locals 10

    .line 1
    iget-object v0, p3, Lpg;->a:Landroid/util/Size;

    .line 2
    .line 3
    invoke-static {p2, v0}, Lbb2;->d(Lzy2;Landroid/util/Size;)Lbb2;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget-object v0, p2, Lab2;->b:Lir;

    .line 8
    .line 9
    iget-object p0, p0, Llh2;->p:Ls53;

    .line 10
    .line 11
    iget-object v1, p0, Ls53;->a:Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, -0x1

    .line 18
    move v3, v2

    .line 19
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Lwy2;

    .line 30
    .line 31
    iget-object v4, v4, Lwy2;->f:Lzy2;

    .line 32
    .line 33
    sget-object v5, Lzy2;->G:Llf;

    .line 34
    .line 35
    invoke-interface {v4, v5}, Lx02;->e(Llf;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Lfb2;

    .line 40
    .line 41
    iget-object v4, v4, Lfb2;->g:Ljr;

    .line 42
    .line 43
    iget v4, v4, Ljr;->c:I

    .line 44
    .line 45
    sget-object v5, Lfb2;->i:Ljava/util/List;

    .line 46
    .line 47
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-interface {v5, v6}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-interface {v5, v7}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-lt v6, v5, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move v3, v4

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    if-eq v3, v2, :cond_2

    .line 69
    .line 70
    iput v3, v0, Lir;->a:I

    .line 71
    .line 72
    :cond_2
    iget-object v1, p3, Lpg;->a:Landroid/util/Size;

    .line 73
    .line 74
    iget-object v3, p0, Ls53;->a:Ljava/util/HashSet;

    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_9

    .line 85
    .line 86
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, Lwy2;

    .line 91
    .line 92
    iget-object v4, v4, Lwy2;->f:Lzy2;

    .line 93
    .line 94
    invoke-static {v4, v1}, Lbb2;->d(Lzy2;Landroid/util/Size;)Lbb2;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-virtual {v4}, Lbb2;->c()Lfb2;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    iget-object v5, v4, Lfb2;->g:Ljr;

    .line 103
    .line 104
    iget-object v6, v5, Ljr;->d:Ljava/util/List;

    .line 105
    .line 106
    invoke-virtual {v0, v6}, Lir;->b(Ljava/util/Collection;)V

    .line 107
    .line 108
    .line 109
    iget-object v6, v4, Lfb2;->e:Ljava/util/List;

    .line 110
    .line 111
    iget-object v7, p2, Lab2;->e:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    :cond_3
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    if-eqz v8, :cond_4

    .line 122
    .line 123
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    check-cast v8, Lmo;

    .line 128
    .line 129
    invoke-virtual {v0, v8}, Lir;->c(Lmo;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-nez v9, :cond_3

    .line 137
    .line 138
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    iget-object v6, v4, Lfb2;->d:Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    if-eqz v7, :cond_6

    .line 153
    .line 154
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    check-cast v7, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    .line 159
    .line 160
    iget-object v8, p2, Lab2;->d:Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    if-eqz v9, :cond_5

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_5
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_6
    iget-object v4, v4, Lfb2;->c:Ljava/util/List;

    .line 174
    .line 175
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    if-eqz v6, :cond_8

    .line 184
    .line 185
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    check-cast v6, Landroid/hardware/camera2/CameraDevice$StateCallback;

    .line 190
    .line 191
    iget-object v7, p2, Lab2;->c:Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    if-eqz v8, :cond_7

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_7
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_8
    iget-object v4, v5, Ljr;->b:Lnq1;

    .line 205
    .line 206
    invoke-virtual {v0, v4}, Lir;->e(Lty;)V

    .line 207
    .line 208
    .line 209
    goto/16 :goto_1

    .line 210
    .line 211
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-static {}, Lpg3;->a()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1}, Llj2;->a()V

    .line 218
    .line 219
    .line 220
    iget-boolean v1, p1, Llj2;->j:Z

    .line 221
    .line 222
    const/4 v3, 0x1

    .line 223
    xor-int/2addr v1, v3

    .line 224
    const-string v4, "Consumer can only be linked once."

    .line 225
    .line 226
    invoke-static {v4, v1}, Lde3;->j(Ljava/lang/String;Z)V

    .line 227
    .line 228
    .line 229
    iput-boolean v3, p1, Llj2;->j:Z

    .line 230
    .line 231
    iget-object p1, p1, Llj2;->l:Lkj2;

    .line 232
    .line 233
    iget-object v1, p3, Lpg;->b:Lmb0;

    .line 234
    .line 235
    invoke-virtual {p2, p1, v1, v2}, Lbb2;->b(Ld70;Lmb0;I)V

    .line 236
    .line 237
    .line 238
    iget-object p0, p0, Ls53;->v:Lki1;

    .line 239
    .line 240
    invoke-virtual {v0, p0}, Lir;->c(Lmo;)V

    .line 241
    .line 242
    .line 243
    iget-object p0, p3, Lpg;->d:Lty;

    .line 244
    .line 245
    if-eqz p0, :cond_a

    .line 246
    .line 247
    invoke-virtual {v0, p0}, Lir;->e(Lty;)V

    .line 248
    .line 249
    .line 250
    :cond_a
    return-object p2
.end method

.method public final e(ZLcz2;)Lzy2;
    .locals 3

    .line 1
    iget-object v0, p0, Llh2;->o:Lmh2;

    .line 2
    .line 3
    invoke-interface {v0}, Lzy2;->t()Lbz2;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-interface {p2, v1, v2}, Lcz2;->a(Lbz2;I)Lty;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, v0, Lmh2;->a:Lnq1;

    .line 15
    .line 16
    invoke-static {p2, p1}, Lty;->q(Lty;Lty;)Lnq1;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :cond_0
    if-nez p2, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :cond_1
    invoke-virtual {p0, p2}, Llh2;->j(Lty;)Lyy2;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lwq;

    .line 29
    .line 30
    invoke-virtual {p0}, Lwq;->o()Lzy2;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final i()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance p0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public final j(Lty;)Lyy2;
    .locals 0

    .line 1
    new-instance p0, Lwq;

    .line 2
    .line 3
    invoke-static {p1}, Luk1;->m(Lty;)Luk1;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p0, p1}, Lwq;-><init>(Luk1;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final p()V
    .locals 5

    .line 1
    iget-object p0, p0, Llh2;->p:Ls53;

    .line 2
    .line 3
    iget-object v0, p0, Ls53;->a:Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lwy2;

    .line 20
    .line 21
    iget-object v2, p0, Ls53;->c:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lr53;

    .line 28
    .line 29
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    iget-object v4, p0, Ls53;->e:Lcz2;

    .line 34
    .line 35
    invoke-virtual {v1, v3, v4}, Lwy2;->e(ZLcz2;)Lzy2;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-virtual {v1, v2, v4, v4, v3}, Lwy2;->a(Lzp;Lzp;Lzy2;Lzy2;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-void
.end method

.method public final r(Lxp;Lyy2;)Lzy2;
    .locals 12

    .line 1
    invoke-interface {p2}, Luf0;->m()Luk1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Llh2;->p:Ls53;

    .line 6
    .line 7
    iget-object v0, p0, Ls53;->w:Ljava/util/HashSet;

    .line 8
    .line 9
    iget-object v1, p0, Ls53;->V:Ls32;

    .line 10
    .line 11
    iget-object v2, v1, Ls32;->f:Lxp;

    .line 12
    .line 13
    const/16 v3, 0x22

    .line 14
    .line 15
    invoke-interface {v2, v3}, Lxp;->g(I)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    iget-object v6, v1, Ls32;->d:Ljava/util/HashSet;

    .line 25
    .line 26
    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    const/4 v9, 0x0

    .line 35
    if-eqz v8, :cond_2

    .line 36
    .line 37
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    check-cast v8, Lzy2;

    .line 42
    .line 43
    sget-object v10, Lzy2;->N:Llf;

    .line 44
    .line 45
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-interface {v8, v10, v11}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v10

    .line 51
    check-cast v10, Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    if-eqz v10, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    instance-of v10, v8, Ljw0;

    .line 61
    .line 62
    if-eqz v10, :cond_0

    .line 63
    .line 64
    check-cast v8, Ljw0;

    .line 65
    .line 66
    sget-object v10, Ljw0;->A:Llf;

    .line 67
    .line 68
    invoke-interface {v8, v10, v9}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    check-cast v8, Lq32;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    sget-object v7, Ljw0;->z:Llf;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    :try_start_0
    invoke-virtual {p1, v7}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v7
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    goto :goto_1

    .line 85
    :catch_0
    move-object v7, v9

    .line 86
    :goto_1
    check-cast v7, Ljava/util/List;

    .line 87
    .line 88
    if-eqz v7, :cond_5

    .line 89
    .line 90
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-eqz v7, :cond_4

    .line 99
    .line 100
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    check-cast v7, Landroid/util/Pair;

    .line 105
    .line 106
    iget-object v8, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v8, Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    invoke-virtual {v8, v10}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-eqz v8, :cond_3

    .line 119
    .line 120
    iget-object v2, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v2, [Landroid/util/Size;

    .line 123
    .line 124
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    goto :goto_2

    .line 129
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    .line 134
    :cond_5
    :goto_2
    iget-object v3, v1, Ls32;->c:Landroid/util/Rational;

    .line 135
    .line 136
    new-instance v7, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    new-instance v8, Ljava/util/HashSet;

    .line 142
    .line 143
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    if-eqz v10, :cond_6

    .line 155
    .line 156
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v10

    .line 160
    check-cast v10, Lzy2;

    .line 161
    .line 162
    invoke-virtual {v1, v10}, Ls32;->b(Lzy2;)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    invoke-interface {v8, v10}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_6
    invoke-virtual {v8}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    :cond_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    if-eqz v8, :cond_8

    .line 179
    .line 180
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    check-cast v8, Landroid/util/Size;

    .line 185
    .line 186
    invoke-static {v3, v8}, Lsd;->a(Landroid/util/Rational;Landroid/util/Size;)Z

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    if-nez v8, :cond_7

    .line 191
    .line 192
    iget-object v6, v1, Ls32;->b:Landroid/util/Rational;

    .line 193
    .line 194
    invoke-virtual {v1, v6, v2, v4}, Ls32;->f(Landroid/util/Rational;Ljava/util/List;Z)Ljava/util/ArrayList;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 199
    .line 200
    .line 201
    :cond_8
    invoke-virtual {v1, v3, v2, v4}, Ls32;->f(Landroid/util/Rational;Ljava/util/List;Z)Ljava/util/ArrayList;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1, v2, v4}, Ls32;->e(Ljava/util/List;Z)Ljava/util/ArrayList;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 213
    .line 214
    .line 215
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    const/4 v6, 0x1

    .line 220
    const-string v8, "ResolutionsMerger"

    .line 221
    .line 222
    if-eqz v3, :cond_9

    .line 223
    .line 224
    const-string v3, "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV."

    .line 225
    .line 226
    invoke-static {v8, v3}, Lhu0;->H0(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1, v2, v6}, Ls32;->e(Ljava/util/List;Z)Ljava/util/ArrayList;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 234
    .line 235
    .line 236
    :cond_9
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    invoke-static {v8}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    sget-object v1, Ljw0;->B:Llf;

    .line 243
    .line 244
    invoke-virtual {p1, v1, v7}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    sget-object v1, Lzy2;->K:Llf;

    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    move v3, v4

    .line 254
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    if-eqz v7, :cond_a

    .line 259
    .line 260
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v7

    .line 264
    check-cast v7, Lzy2;

    .line 265
    .line 266
    sget-object v8, Lzy2;->K:Llf;

    .line 267
    .line 268
    invoke-interface {v7, v8, v5}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    check-cast v7, Ljava/lang/Integer;

    .line 273
    .line 274
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 275
    .line 276
    .line 277
    move-result v7

    .line 278
    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    goto :goto_4

    .line 283
    :cond_a
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    invoke-virtual {p1, v1, v2}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    new-instance v1, Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    if-eqz v2, :cond_b

    .line 304
    .line 305
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    check-cast v2, Lzy2;

    .line 310
    .line 311
    sget-object v3, Lhw0;->p:Llf;

    .line 312
    .line 313
    sget-object v7, Lmb0;->c:Lmb0;

    .line 314
    .line 315
    invoke-interface {v2, v3, v7}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    check-cast v2, Lmb0;

    .line 320
    .line 321
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    goto :goto_5

    .line 328
    :cond_b
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-eqz v0, :cond_c

    .line 333
    .line 334
    goto/16 :goto_a

    .line 335
    .line 336
    :cond_c
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    check-cast v0, Lmb0;

    .line 341
    .line 342
    iget v2, v0, Lmb0;->a:I

    .line 343
    .line 344
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    iget v0, v0, Lmb0;->b:I

    .line 349
    .line 350
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    move v3, v6

    .line 355
    :goto_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    if-ge v3, v4, :cond_17

    .line 360
    .line 361
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    check-cast v4, Lmb0;

    .line 366
    .line 367
    iget v7, v4, Lmb0;->a:I

    .line 368
    .line 369
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 370
    .line 371
    .line 372
    move-result-object v7

    .line 373
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 374
    .line 375
    .line 376
    move-result-object v8

    .line 377
    const/4 v10, 0x2

    .line 378
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 379
    .line 380
    .line 381
    move-result-object v10

    .line 382
    invoke-virtual {v2, v5}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v11

    .line 386
    if-eqz v11, :cond_d

    .line 387
    .line 388
    :goto_7
    move-object v2, v7

    .line 389
    goto :goto_8

    .line 390
    :cond_d
    invoke-virtual {v7, v5}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v11

    .line 394
    if-eqz v11, :cond_e

    .line 395
    .line 396
    goto :goto_8

    .line 397
    :cond_e
    invoke-virtual {v2, v10}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v11

    .line 401
    if-eqz v11, :cond_f

    .line 402
    .line 403
    invoke-virtual {v7, v8}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v11

    .line 407
    if-nez v11, :cond_f

    .line 408
    .line 409
    goto :goto_7

    .line 410
    :cond_f
    invoke-virtual {v7, v10}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v10

    .line 414
    if-eqz v10, :cond_10

    .line 415
    .line 416
    invoke-virtual {v2, v8}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v8

    .line 420
    if-nez v8, :cond_10

    .line 421
    .line 422
    goto :goto_8

    .line 423
    :cond_10
    invoke-virtual {v2, v7}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v7

    .line 427
    if-eqz v7, :cond_11

    .line 428
    .line 429
    goto :goto_8

    .line 430
    :cond_11
    move-object v2, v9

    .line 431
    :goto_8
    iget v4, v4, Lmb0;->b:I

    .line 432
    .line 433
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object v4

    .line 437
    invoke-virtual {v0, v5}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v7

    .line 441
    if-eqz v7, :cond_12

    .line 442
    .line 443
    move-object v0, v4

    .line 444
    goto :goto_9

    .line 445
    :cond_12
    invoke-virtual {v4, v5}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v7

    .line 449
    if-eqz v7, :cond_13

    .line 450
    .line 451
    goto :goto_9

    .line 452
    :cond_13
    invoke-virtual {v0, v4}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v4

    .line 456
    if-eqz v4, :cond_14

    .line 457
    .line 458
    goto :goto_9

    .line 459
    :cond_14
    move-object v0, v9

    .line 460
    :goto_9
    if-eqz v2, :cond_16

    .line 461
    .line 462
    if-nez v0, :cond_15

    .line 463
    .line 464
    goto :goto_a

    .line 465
    :cond_15
    add-int/lit8 v3, v3, 0x1

    .line 466
    .line 467
    goto :goto_6

    .line 468
    :cond_16
    :goto_a
    move-object v1, v9

    .line 469
    goto :goto_b

    .line 470
    :cond_17
    new-instance v1, Lmb0;

    .line 471
    .line 472
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 473
    .line 474
    .line 475
    move-result v2

    .line 476
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    invoke-direct {v1, v2, v0}, Lmb0;-><init>(II)V

    .line 481
    .line 482
    .line 483
    :goto_b
    if-eqz v1, :cond_1b

    .line 484
    .line 485
    sget-object v0, Lhw0;->p:Llf;

    .line 486
    .line 487
    invoke-virtual {p1, v0, v1}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    iget-object p0, p0, Ls53;->a:Ljava/util/HashSet;

    .line 491
    .line 492
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 493
    .line 494
    .line 495
    move-result-object p0

    .line 496
    :cond_18
    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 497
    .line 498
    .line 499
    move-result v0

    .line 500
    if-eqz v0, :cond_1a

    .line 501
    .line 502
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    check-cast v0, Lwy2;

    .line 507
    .line 508
    iget-object v1, v0, Lwy2;->f:Lzy2;

    .line 509
    .line 510
    sget-object v2, Lzy2;->Q:Llf;

    .line 511
    .line 512
    invoke-interface {v1, v2, v5}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    check-cast v1, Ljava/lang/Integer;

    .line 517
    .line 518
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 519
    .line 520
    .line 521
    move-result v1

    .line 522
    if-eqz v1, :cond_19

    .line 523
    .line 524
    iget-object v1, v0, Lwy2;->f:Lzy2;

    .line 525
    .line 526
    invoke-interface {v1, v2, v5}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    check-cast v1, Ljava/lang/Integer;

    .line 531
    .line 532
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 533
    .line 534
    .line 535
    invoke-virtual {p1, v2, v1}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    :cond_19
    iget-object v1, v0, Lwy2;->f:Lzy2;

    .line 539
    .line 540
    invoke-interface {v1}, Lzy2;->v()I

    .line 541
    .line 542
    .line 543
    move-result v1

    .line 544
    if-eqz v1, :cond_18

    .line 545
    .line 546
    sget-object v1, Lzy2;->P:Llf;

    .line 547
    .line 548
    iget-object v0, v0, Lwy2;->f:Lzy2;

    .line 549
    .line 550
    invoke-interface {v0}, Lzy2;->v()I

    .line 551
    .line 552
    .line 553
    move-result v0

    .line 554
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    invoke-virtual {p1, v1, v0}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    goto :goto_c

    .line 562
    :cond_1a
    invoke-interface {p2}, Lyy2;->o()Lzy2;

    .line 563
    .line 564
    .line 565
    move-result-object p0

    .line 566
    return-object p0

    .line 567
    :cond_1b
    const-string p0, "Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children."

    .line 568
    .line 569
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    return-object v9
.end method

.method public final s()V
    .locals 1

    .line 1
    iget-object p0, p0, Llh2;->p:Ls53;

    .line 2
    .line 3
    iget-object p0, p0, Ls53;->a:Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lwy2;

    .line 20
    .line 21
    invoke-virtual {v0}, Lwy2;->s()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lwy2;->q()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public final t()V
    .locals 1

    .line 1
    iget-object p0, p0, Llh2;->p:Ls53;

    .line 2
    .line 3
    iget-object p0, p0, Ls53;->a:Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lwy2;

    .line 20
    .line 21
    invoke-virtual {v0}, Lwy2;->t()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public final u(Lty;)Lpg;
    .locals 3

    .line 1
    iget-object v0, p0, Llh2;->y:Lbb2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbb2;->a(Lty;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Llh2;->y:Lbb2;

    .line 7
    .line 8
    invoke-virtual {v0}, Lbb2;->c()Lfb2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    aget-object v0, v0, v2

    .line 24
    .line 25
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0, v0}, Lwy2;->A(Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lwy2;->g:Lpg;

    .line 39
    .line 40
    invoke-virtual {p0}, Lpg;->a()Lb5;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iput-object p1, p0, Lb5;->e:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {p0}, Lb5;->k()Lpg;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public final v(Lpg;Lpg;)Lpg;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lwy2;->d()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-virtual {p0}, Lwy2;->h()Lzp;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    move-object v2, v0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p0}, Lwy2;->h()Lzp;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Lzp;->m()Lxp;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Lxp;->b()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v3, p0, Lwy2;->f:Lzy2;

    .line 28
    .line 29
    move-object v0, p0

    .line 30
    move-object v4, p1

    .line 31
    move-object v5, p2

    .line 32
    invoke-virtual/range {v0 .. v5}, Llh2;->C(Ljava/lang/String;Ljava/lang/String;Lzy2;Lpg;Lpg;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {v0, p0}, Lwy2;->A(Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lwy2;->m()V

    .line 40
    .line 41
    .line 42
    return-object v4
.end method

.method public final w()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Llh2;->B()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Llh2;->p:Ls53;

    .line 5
    .line 6
    iget-object v0, p0, Ls53;->a:Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lwy2;

    .line 23
    .line 24
    iget-object v2, p0, Ls53;->c:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lr53;

    .line 31
    .line 32
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Lwy2;->z(Lzp;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
.end method

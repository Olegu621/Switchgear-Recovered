.class public final Landroidx/fragment/app/g;
.super Lwf2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final c:Ljava/util/ArrayList;

.field public final d:Landroidx/fragment/app/c0;

.field public final e:Landroidx/fragment/app/c0;

.field public final f:Lln0;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayList;

.field public final j:Lid;

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/util/ArrayList;

.field public final m:Lid;

.field public final n:Lid;

.field public final o:Z

.field public final p:Lfr;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Landroidx/fragment/app/c0;Landroidx/fragment/app/c0;Lln0;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Lid;Ljava/util/ArrayList;Ljava/util/ArrayList;Lid;Lid;Z)V
    .locals 0

    .line 1
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/fragment/app/g;->c:Ljava/util/ArrayList;

    .line 8
    .line 9
    iput-object p2, p0, Landroidx/fragment/app/g;->d:Landroidx/fragment/app/c0;

    .line 10
    .line 11
    iput-object p3, p0, Landroidx/fragment/app/g;->e:Landroidx/fragment/app/c0;

    .line 12
    .line 13
    iput-object p4, p0, Landroidx/fragment/app/g;->f:Lln0;

    .line 14
    .line 15
    iput-object p5, p0, Landroidx/fragment/app/g;->g:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Landroidx/fragment/app/g;->h:Ljava/util/ArrayList;

    .line 18
    .line 19
    iput-object p7, p0, Landroidx/fragment/app/g;->i:Ljava/util/ArrayList;

    .line 20
    .line 21
    iput-object p8, p0, Landroidx/fragment/app/g;->j:Lid;

    .line 22
    .line 23
    iput-object p9, p0, Landroidx/fragment/app/g;->k:Ljava/util/ArrayList;

    .line 24
    .line 25
    iput-object p10, p0, Landroidx/fragment/app/g;->l:Ljava/util/ArrayList;

    .line 26
    .line 27
    iput-object p11, p0, Landroidx/fragment/app/g;->m:Lid;

    .line 28
    .line 29
    iput-object p12, p0, Landroidx/fragment/app/g;->n:Lid;

    .line 30
    .line 31
    iput-boolean p13, p0, Landroidx/fragment/app/g;->o:Z

    .line 32
    .line 33
    new-instance p1, Lfr;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Landroidx/fragment/app/g;->p:Lfr;

    .line 39
    .line 40
    return-void
.end method

.method public static f(Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Landroid/view/ViewGroup;

    .line 7
    .line 8
    invoke-static {v0}, Ll33;->b(Landroid/view/ViewGroup;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_3

    .line 19
    .line 20
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-ge v1, p0, :cond_3

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_1

    .line 40
    .line 41
    invoke-static {v2, p1}, Landroidx/fragment/app/g;->f(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_3
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final b(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/fragment/app/g;->p:Lfr;

    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-boolean p1, p0, Lfr;->a:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lfr;->a:Z

    .line 17
    .line 18
    iput-boolean p1, p0, Lfr;->c:Z

    .line 19
    .line 20
    iget-object p1, p0, Lfr;->b:Lqc3;

    .line 21
    .line 22
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    const/4 v0, 0x0

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    :try_start_1
    iget-object p1, p1, Lqc3;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Landroidx/transition/Transition;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/transition/Transition;->cancel()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_1
    move-exception p1

    .line 35
    monitor-enter p0

    .line 36
    :try_start_2
    iput-boolean v0, p0, Lfr;->c:Z

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 39
    .line 40
    .line 41
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 42
    throw p1

    .line 43
    :catchall_2
    move-exception p1

    .line 44
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 45
    throw p1

    .line 46
    :cond_1
    :goto_0
    monitor-enter p0

    .line 47
    :try_start_4
    iput-boolean v0, p0, Lfr;->c:Z

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 50
    .line 51
    .line 52
    monitor-exit p0

    .line 53
    return-void

    .line 54
    :catchall_3
    move-exception p1

    .line 55
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 56
    throw p1

    .line 57
    :goto_1
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 58
    throw p1
.end method

.method public final c(Landroid/view/ViewGroup;)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/view/View;->isLaidOut()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    iget-object v3, v0, Landroidx/fragment/app/g;->c:Ljava/util/ArrayList;

    .line 13
    .line 14
    const/4 v4, 0x2

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1c

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lu60;

    .line 32
    .line 33
    iget-object v5, v3, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 34
    .line 35
    invoke-static {v4}, Landroidx/fragment/app/w;->K(I)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-static {v5}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-object v3, v3, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 48
    .line 49
    invoke-virtual {v3, v0}, Landroidx/fragment/app/c0;->c(Lwf2;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    new-instance v2, Landroid/view/View;

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-direct {v2, v5}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 60
    .line 61
    .line 62
    new-instance v5, Landroid/graphics/Rect;

    .line 63
    .line 64
    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    const/4 v9, 0x0

    .line 72
    const/4 v10, 0x0

    .line 73
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    iget-object v13, v0, Landroidx/fragment/app/g;->j:Lid;

    .line 78
    .line 79
    iget-object v14, v0, Landroidx/fragment/app/g;->g:Ljava/lang/Object;

    .line 80
    .line 81
    iget-object v15, v0, Landroidx/fragment/app/g;->e:Landroidx/fragment/app/c0;

    .line 82
    .line 83
    iget-object v4, v0, Landroidx/fragment/app/g;->d:Landroidx/fragment/app/c0;

    .line 84
    .line 85
    iget-object v8, v0, Landroidx/fragment/app/g;->i:Ljava/util/ArrayList;

    .line 86
    .line 87
    iget-object v7, v0, Landroidx/fragment/app/g;->h:Ljava/util/ArrayList;

    .line 88
    .line 89
    iget-object v12, v0, Landroidx/fragment/app/g;->f:Lln0;

    .line 90
    .line 91
    if-eqz v11, :cond_6

    .line 92
    .line 93
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v11

    .line 97
    check-cast v11, Lu60;

    .line 98
    .line 99
    iget-object v11, v11, Lu60;->d:Ljava/lang/Object;

    .line 100
    .line 101
    if-eqz v11, :cond_5

    .line 102
    .line 103
    if-eqz v4, :cond_5

    .line 104
    .line 105
    if-eqz v15, :cond_5

    .line 106
    .line 107
    invoke-virtual {v13}, Lle2;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v11

    .line 111
    if-nez v11, :cond_5

    .line 112
    .line 113
    if-eqz v14, :cond_5

    .line 114
    .line 115
    iget-object v11, v15, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 116
    .line 117
    iget-object v13, v4, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 118
    .line 119
    sget-object v17, Len0;->a:Ljn0;

    .line 120
    .line 121
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-object/from16 v23, v6

    .line 128
    .line 129
    iget-boolean v6, v0, Landroidx/fragment/app/g;->o:Z

    .line 130
    .line 131
    if-eqz v6, :cond_2

    .line 132
    .line 133
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->getEnterTransitionCallback()Lmd2;

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_2
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->getEnterTransitionCallback()Lmd2;

    .line 138
    .line 139
    .line 140
    :goto_2
    new-instance v6, Lzo;

    .line 141
    .line 142
    const/4 v11, 0x3

    .line 143
    invoke-direct {v6, v11, v15, v4, v0}, Lzo;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v1, v6}, Lfq1;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 147
    .line 148
    .line 149
    iget-object v4, v0, Landroidx/fragment/app/g;->m:Lid;

    .line 150
    .line 151
    invoke-virtual {v4}, Lid;->values()Ljava/util/Collection;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 156
    .line 157
    .line 158
    iget-object v6, v0, Landroidx/fragment/app/g;->l:Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v11

    .line 164
    if-nez v11, :cond_3

    .line 165
    .line 166
    const/4 v11, 0x0

    .line 167
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    check-cast v6, Ljava/lang/String;

    .line 175
    .line 176
    const/4 v9, 0x0

    .line 177
    invoke-virtual {v4, v6, v9}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    check-cast v4, Landroid/view/View;

    .line 182
    .line 183
    invoke-virtual {v12, v4, v14}, Lln0;->m(Landroid/view/View;Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    move-object v9, v4

    .line 187
    :cond_3
    iget-object v4, v0, Landroidx/fragment/app/g;->n:Lid;

    .line 188
    .line 189
    invoke-virtual {v4}, Lid;->values()Ljava/util/Collection;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 194
    .line 195
    .line 196
    iget-object v6, v0, Landroidx/fragment/app/g;->k:Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result v11

    .line 202
    if-nez v11, :cond_4

    .line 203
    .line 204
    const/4 v11, 0x0

    .line 205
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    check-cast v6, Ljava/lang/String;

    .line 213
    .line 214
    const/4 v11, 0x0

    .line 215
    invoke-virtual {v4, v6, v11}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    check-cast v4, Landroid/view/View;

    .line 220
    .line 221
    if-eqz v4, :cond_4

    .line 222
    .line 223
    new-instance v6, Lj8;

    .line 224
    .line 225
    invoke-direct {v6, v12, v4, v5}, Lj8;-><init>(Lln0;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 226
    .line 227
    .line 228
    invoke-static {v1, v6}, Lfq1;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 229
    .line 230
    .line 231
    const/4 v4, 0x1

    .line 232
    move v10, v4

    .line 233
    :cond_4
    invoke-virtual {v12, v14, v2, v7}, Lln0;->p(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 234
    .line 235
    .line 236
    const/16 v19, 0x0

    .line 237
    .line 238
    const/16 v20, 0x0

    .line 239
    .line 240
    iget-object v4, v0, Landroidx/fragment/app/g;->g:Ljava/lang/Object;

    .line 241
    .line 242
    move-object/from16 v21, v4

    .line 243
    .line 244
    move-object/from16 v18, v4

    .line 245
    .line 246
    move-object/from16 v22, v8

    .line 247
    .line 248
    move-object/from16 v17, v12

    .line 249
    .line 250
    invoke-virtual/range {v17 .. v22}, Lln0;->l(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 251
    .line 252
    .line 253
    :goto_3
    move-object/from16 v6, v23

    .line 254
    .line 255
    const/4 v4, 0x2

    .line 256
    goto/16 :goto_1

    .line 257
    .line 258
    :cond_5
    move-object/from16 v23, v6

    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_6
    move-object v6, v8

    .line 262
    move-object v8, v12

    .line 263
    new-instance v11, Ljava/util/ArrayList;

    .line 264
    .line 265
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v12

    .line 272
    move-object/from16 v23, v6

    .line 273
    .line 274
    move-object/from16 v24, v7

    .line 275
    .line 276
    const/4 v6, 0x0

    .line 277
    const/4 v7, 0x0

    .line 278
    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v17

    .line 282
    move/from16 v25, v10

    .line 283
    .line 284
    if-eqz v17, :cond_11

    .line 285
    .line 286
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v17

    .line 290
    move-object/from16 v10, v17

    .line 291
    .line 292
    check-cast v10, Lu60;

    .line 293
    .line 294
    move-object/from16 v26, v12

    .line 295
    .line 296
    iget-object v12, v10, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 297
    .line 298
    move-object/from16 v27, v13

    .line 299
    .line 300
    iget-object v13, v10, Lu60;->b:Ljava/lang/Object;

    .line 301
    .line 302
    invoke-virtual {v8, v13}, Lln0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v13

    .line 306
    if-eqz v13, :cond_10

    .line 307
    .line 308
    new-instance v0, Ljava/util/ArrayList;

    .line 309
    .line 310
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 311
    .line 312
    .line 313
    move-object/from16 v28, v3

    .line 314
    .line 315
    iget-object v3, v12, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 316
    .line 317
    move-object/from16 v29, v14

    .line 318
    .line 319
    iget-object v14, v3, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 320
    .line 321
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    invoke-static {v14, v0}, Landroidx/fragment/app/g;->f(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 325
    .line 326
    .line 327
    if-eqz v29, :cond_9

    .line 328
    .line 329
    if-eq v12, v4, :cond_7

    .line 330
    .line 331
    if-ne v12, v15, :cond_9

    .line 332
    .line 333
    :cond_7
    if-ne v12, v4, :cond_8

    .line 334
    .line 335
    invoke-static/range {v24 .. v24}, Lkotlin/collections/CollectionsKt;->N(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 336
    .line 337
    .line 338
    move-result-object v14

    .line 339
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 340
    .line 341
    .line 342
    goto :goto_5

    .line 343
    :cond_8
    invoke-static/range {v23 .. v23}, Lkotlin/collections/CollectionsKt;->N(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 344
    .line 345
    .line 346
    move-result-object v14

    .line 347
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 348
    .line 349
    .line 350
    :cond_9
    :goto_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 351
    .line 352
    .line 353
    move-result v14

    .line 354
    if-eqz v14, :cond_a

    .line 355
    .line 356
    invoke-virtual {v8, v2, v13}, Lln0;->a(Landroid/view/View;Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    move-object/from16 v17, v8

    .line 360
    .line 361
    move-object v8, v0

    .line 362
    move-object v0, v13

    .line 363
    move-object/from16 v13, v17

    .line 364
    .line 365
    move-object/from16 v17, v2

    .line 366
    .line 367
    goto :goto_6

    .line 368
    :cond_a
    invoke-virtual {v8, v13, v0}, Lln0;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 369
    .line 370
    .line 371
    const/16 v21, 0x0

    .line 372
    .line 373
    const/16 v22, 0x0

    .line 374
    .line 375
    move-object/from16 v19, v13

    .line 376
    .line 377
    move-object/from16 v20, v0

    .line 378
    .line 379
    move-object/from16 v17, v8

    .line 380
    .line 381
    move-object/from16 v18, v13

    .line 382
    .line 383
    invoke-virtual/range {v17 .. v22}, Lln0;->l(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 384
    .line 385
    .line 386
    move-object/from16 v13, v17

    .line 387
    .line 388
    move-object/from16 v0, v18

    .line 389
    .line 390
    move-object/from16 v8, v20

    .line 391
    .line 392
    iget v14, v12, Landroidx/fragment/app/c0;->a:I

    .line 393
    .line 394
    move-object/from16 v17, v2

    .line 395
    .line 396
    const/4 v2, 0x3

    .line 397
    if-ne v14, v2, :cond_b

    .line 398
    .line 399
    const/4 v14, 0x0

    .line 400
    iput-boolean v14, v12, Landroidx/fragment/app/c0;->i:Z

    .line 401
    .line 402
    new-instance v14, Ljava/util/ArrayList;

    .line 403
    .line 404
    invoke-direct {v14, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 405
    .line 406
    .line 407
    iget-object v2, v3, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 408
    .line 409
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    iget-object v2, v3, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 413
    .line 414
    invoke-virtual {v13, v0, v2, v14}, Lln0;->k(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 415
    .line 416
    .line 417
    new-instance v2, Ls2;

    .line 418
    .line 419
    const/16 v3, 0xd

    .line 420
    .line 421
    invoke-direct {v2, v8, v3}, Ls2;-><init>(Ljava/lang/Object;I)V

    .line 422
    .line 423
    .line 424
    invoke-static {v1, v2}, Lfq1;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 425
    .line 426
    .line 427
    :cond_b
    :goto_6
    iget v2, v12, Landroidx/fragment/app/c0;->a:I

    .line 428
    .line 429
    const/4 v3, 0x2

    .line 430
    if-ne v2, v3, :cond_d

    .line 431
    .line 432
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 433
    .line 434
    .line 435
    if-eqz v25, :cond_c

    .line 436
    .line 437
    invoke-virtual {v13, v0, v5}, Lln0;->n(Ljava/lang/Object;Landroid/graphics/Rect;)V

    .line 438
    .line 439
    .line 440
    :cond_c
    invoke-static {v3}, Landroidx/fragment/app/w;->K(I)Z

    .line 441
    .line 442
    .line 443
    move-result v2

    .line 444
    if-eqz v2, :cond_e

    .line 445
    .line 446
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 454
    .line 455
    .line 456
    move-result v3

    .line 457
    if-eqz v3, :cond_e

    .line 458
    .line 459
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v3

    .line 463
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    check-cast v3, Landroid/view/View;

    .line 467
    .line 468
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    goto :goto_7

    .line 472
    :cond_d
    invoke-virtual {v13, v9, v0}, Lln0;->m(Landroid/view/View;Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    const/16 v16, 0x2

    .line 476
    .line 477
    invoke-static/range {v16 .. v16}, Landroidx/fragment/app/w;->K(I)Z

    .line 478
    .line 479
    .line 480
    move-result v2

    .line 481
    if-eqz v2, :cond_e

    .line 482
    .line 483
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 491
    .line 492
    .line 493
    move-result v3

    .line 494
    if-eqz v3, :cond_e

    .line 495
    .line 496
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    check-cast v3, Landroid/view/View;

    .line 504
    .line 505
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    goto :goto_8

    .line 509
    :cond_e
    iget-boolean v2, v10, Lu60;->c:Z

    .line 510
    .line 511
    if-eqz v2, :cond_f

    .line 512
    .line 513
    invoke-virtual {v13, v6, v0}, Lln0;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v6

    .line 517
    :goto_9
    move-object/from16 v0, p0

    .line 518
    .line 519
    move-object v8, v13

    .line 520
    move-object/from16 v2, v17

    .line 521
    .line 522
    move/from16 v10, v25

    .line 523
    .line 524
    move-object/from16 v12, v26

    .line 525
    .line 526
    move-object/from16 v13, v27

    .line 527
    .line 528
    move-object/from16 v3, v28

    .line 529
    .line 530
    move-object/from16 v14, v29

    .line 531
    .line 532
    goto/16 :goto_4

    .line 533
    .line 534
    :cond_f
    invoke-virtual {v13, v7, v0}, Lln0;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v7

    .line 538
    goto :goto_9

    .line 539
    :cond_10
    move-object/from16 v0, p0

    .line 540
    .line 541
    move/from16 v10, v25

    .line 542
    .line 543
    move-object/from16 v12, v26

    .line 544
    .line 545
    move-object/from16 v13, v27

    .line 546
    .line 547
    goto/16 :goto_4

    .line 548
    .line 549
    :cond_11
    move-object/from16 v28, v3

    .line 550
    .line 551
    move-object/from16 v27, v13

    .line 552
    .line 553
    move-object v0, v14

    .line 554
    move-object v13, v8

    .line 555
    invoke-virtual {v13, v6, v7, v0}, Lln0;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    const/16 v16, 0x2

    .line 560
    .line 561
    invoke-static/range {v16 .. v16}, Landroidx/fragment/app/w;->K(I)Z

    .line 562
    .line 563
    .line 564
    move-result v3

    .line 565
    if-eqz v3, :cond_12

    .line 566
    .line 567
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    :cond_12
    new-instance v3, Lkotlin/Pair;

    .line 571
    .line 572
    invoke-direct {v3, v11, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    iget-object v2, v3, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 576
    .line 577
    check-cast v2, Ljava/util/ArrayList;

    .line 578
    .line 579
    new-instance v5, Ljava/util/ArrayList;

    .line 580
    .line 581
    const/16 v6, 0xa

    .line 582
    .line 583
    move-object/from16 v7, v28

    .line 584
    .line 585
    invoke-static {v7, v6}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 586
    .line 587
    .line 588
    move-result v6

    .line 589
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 593
    .line 594
    .line 595
    move-result-object v6

    .line 596
    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 597
    .line 598
    .line 599
    move-result v7

    .line 600
    if-eqz v7, :cond_13

    .line 601
    .line 602
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v7

    .line 606
    check-cast v7, Lu60;

    .line 607
    .line 608
    iget-object v7, v7, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 609
    .line 610
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    goto :goto_a

    .line 614
    :cond_13
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 615
    .line 616
    .line 617
    move-result-object v5

    .line 618
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 619
    .line 620
    .line 621
    move-result v6

    .line 622
    move-object/from16 v7, p0

    .line 623
    .line 624
    iget-object v8, v7, Landroidx/fragment/app/g;->f:Lln0;

    .line 625
    .line 626
    iget-object v9, v3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 627
    .line 628
    if-eqz v6, :cond_14

    .line 629
    .line 630
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v6

    .line 634
    check-cast v6, Landroidx/fragment/app/c0;

    .line 635
    .line 636
    iget-object v10, v6, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 637
    .line 638
    new-instance v10, Lj8;

    .line 639
    .line 640
    const/16 v11, 0xd

    .line 641
    .line 642
    invoke-direct {v10, v11, v6, v7}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 643
    .line 644
    .line 645
    iget-object v6, v7, Landroidx/fragment/app/g;->p:Lfr;

    .line 646
    .line 647
    invoke-virtual {v8, v9, v6, v10}, Lln0;->o(Ljava/lang/Object;Lfr;Lj8;)V

    .line 648
    .line 649
    .line 650
    goto :goto_b

    .line 651
    :cond_14
    new-instance v3, Lt60;

    .line 652
    .line 653
    invoke-direct {v3, v7, v1, v9}, Lt60;-><init>(Landroidx/fragment/app/g;Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 654
    .line 655
    .line 656
    const/4 v5, 0x4

    .line 657
    invoke-static {v5, v2}, Len0;->a(ILjava/util/ArrayList;)V

    .line 658
    .line 659
    .line 660
    new-instance v12, Ljava/util/ArrayList;

    .line 661
    .line 662
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 663
    .line 664
    .line 665
    iget-object v11, v7, Landroidx/fragment/app/g;->i:Ljava/util/ArrayList;

    .line 666
    .line 667
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 668
    .line 669
    .line 670
    move-result v5

    .line 671
    const/4 v6, 0x0

    .line 672
    :goto_c
    if-ge v6, v5, :cond_15

    .line 673
    .line 674
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v9

    .line 678
    check-cast v9, Landroid/view/View;

    .line 679
    .line 680
    sget-object v10, Le33;->a:Ljava/util/WeakHashMap;

    .line 681
    .line 682
    invoke-static {v9}, Ls23;->k(Landroid/view/View;)Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v10

    .line 686
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    const/4 v10, 0x0

    .line 690
    invoke-static {v9, v10}, Ls23;->v(Landroid/view/View;Ljava/lang/String;)V

    .line 691
    .line 692
    .line 693
    add-int/lit8 v6, v6, 0x1

    .line 694
    .line 695
    goto :goto_c

    .line 696
    :cond_15
    const/16 v16, 0x2

    .line 697
    .line 698
    invoke-static/range {v16 .. v16}, Landroidx/fragment/app/w;->K(I)Z

    .line 699
    .line 700
    .line 701
    move-result v5

    .line 702
    iget-object v13, v7, Landroidx/fragment/app/g;->h:Ljava/util/ArrayList;

    .line 703
    .line 704
    if-eqz v5, :cond_17

    .line 705
    .line 706
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 707
    .line 708
    .line 709
    move-result-object v5

    .line 710
    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 711
    .line 712
    .line 713
    move-result v6

    .line 714
    if-eqz v6, :cond_16

    .line 715
    .line 716
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v6

    .line 720
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 721
    .line 722
    .line 723
    check-cast v6, Landroid/view/View;

    .line 724
    .line 725
    invoke-static {v6}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    sget-object v7, Le33;->a:Ljava/util/WeakHashMap;

    .line 729
    .line 730
    invoke-static {v6}, Ls23;->k(Landroid/view/View;)Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    goto :goto_d

    .line 734
    :cond_16
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 735
    .line 736
    .line 737
    move-result-object v5

    .line 738
    :goto_e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 739
    .line 740
    .line 741
    move-result v6

    .line 742
    if-eqz v6, :cond_17

    .line 743
    .line 744
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v6

    .line 748
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    check-cast v6, Landroid/view/View;

    .line 752
    .line 753
    invoke-static {v6}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    sget-object v7, Le33;->a:Ljava/util/WeakHashMap;

    .line 757
    .line 758
    invoke-static {v6}, Ls23;->k(Landroid/view/View;)Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    goto :goto_e

    .line 762
    :cond_17
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 766
    .line 767
    .line 768
    move-result v10

    .line 769
    new-instance v14, Ljava/util/ArrayList;

    .line 770
    .line 771
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 772
    .line 773
    .line 774
    const/4 v3, 0x0

    .line 775
    :goto_f
    if-ge v3, v10, :cond_1b

    .line 776
    .line 777
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    move-result-object v5

    .line 781
    check-cast v5, Landroid/view/View;

    .line 782
    .line 783
    sget-object v6, Le33;->a:Ljava/util/WeakHashMap;

    .line 784
    .line 785
    invoke-static {v5}, Ls23;->k(Landroid/view/View;)Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v6

    .line 789
    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 790
    .line 791
    .line 792
    if-nez v6, :cond_18

    .line 793
    .line 794
    move/from16 v17, v3

    .line 795
    .line 796
    move-object/from16 v5, v27

    .line 797
    .line 798
    goto :goto_11

    .line 799
    :cond_18
    const/4 v9, 0x0

    .line 800
    invoke-static {v5, v9}, Ls23;->v(Landroid/view/View;Ljava/lang/String;)V

    .line 801
    .line 802
    .line 803
    move-object/from16 v5, v27

    .line 804
    .line 805
    invoke-virtual {v5, v6, v9}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v7

    .line 809
    check-cast v7, Ljava/lang/String;

    .line 810
    .line 811
    const/4 v9, 0x0

    .line 812
    :goto_10
    move/from16 v17, v3

    .line 813
    .line 814
    if-ge v9, v10, :cond_1a

    .line 815
    .line 816
    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 817
    .line 818
    .line 819
    move-result-object v3

    .line 820
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    move-result v3

    .line 824
    if-eqz v3, :cond_19

    .line 825
    .line 826
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v3

    .line 830
    check-cast v3, Landroid/view/View;

    .line 831
    .line 832
    invoke-static {v3, v6}, Ls23;->v(Landroid/view/View;Ljava/lang/String;)V

    .line 833
    .line 834
    .line 835
    goto :goto_11

    .line 836
    :cond_19
    add-int/lit8 v9, v9, 0x1

    .line 837
    .line 838
    move/from16 v3, v17

    .line 839
    .line 840
    goto :goto_10

    .line 841
    :cond_1a
    :goto_11
    add-int/lit8 v3, v17, 0x1

    .line 842
    .line 843
    move-object/from16 v27, v5

    .line 844
    .line 845
    goto :goto_f

    .line 846
    :cond_1b
    new-instance v9, Lkn0;

    .line 847
    .line 848
    invoke-direct/range {v9 .. v14}, Lkn0;-><init>(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 849
    .line 850
    .line 851
    invoke-static {v1, v9}, Lfq1;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 852
    .line 853
    .line 854
    const/4 v14, 0x0

    .line 855
    invoke-static {v14, v2}, Len0;->a(ILjava/util/ArrayList;)V

    .line 856
    .line 857
    .line 858
    invoke-virtual {v8, v0, v13, v11}, Lln0;->q(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 859
    .line 860
    .line 861
    const/16 v16, 0x2

    .line 862
    .line 863
    invoke-static/range {v16 .. v16}, Landroidx/fragment/app/w;->K(I)Z

    .line 864
    .line 865
    .line 866
    move-result v0

    .line 867
    if-eqz v0, :cond_1c

    .line 868
    .line 869
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 870
    .line 871
    .line 872
    invoke-static {v15}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    :cond_1c
    return-void
.end method

.method public final d(Lfh;Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final e(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Landroidx/fragment/app/g;->c:Ljava/util/ArrayList;

    .line 9
    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lu60;

    .line 27
    .line 28
    iget-object v0, v0, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    invoke-static {v1}, Landroidx/fragment/app/w;->K(I)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-void

    .line 45
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_5

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lu60;

    .line 67
    .line 68
    iget-object v0, v0, Landroidx/fragment/app/f;->a:Landroidx/fragment/app/c0;

    .line 69
    .line 70
    iget-object v0, v0, Landroidx/fragment/app/c0;->c:Landroidx/fragment/app/Fragment;

    .line 71
    .line 72
    iget-boolean v0, v0, Landroidx/fragment/app/Fragment;->mTransitioning:Z

    .line 73
    .line 74
    if-nez v0, :cond_4

    .line 75
    .line 76
    const/4 p1, 0x0

    .line 77
    goto :goto_2

    .line 78
    :cond_5
    :goto_1
    const/4 p1, 0x1

    .line 79
    :goto_2
    if-eqz p1, :cond_6

    .line 80
    .line 81
    iget-object p1, p0, Landroidx/fragment/app/g;->g:Ljava/lang/Object;

    .line 82
    .line 83
    if-eqz p1, :cond_6

    .line 84
    .line 85
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Landroidx/fragment/app/g;->d:Landroidx/fragment/app/c0;

    .line 89
    .line 90
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    iget-object p0, p0, Landroidx/fragment/app/g;->e:Landroidx/fragment/app/c0;

    .line 94
    .line 95
    invoke-static {p0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    :cond_6
    return-void
.end method

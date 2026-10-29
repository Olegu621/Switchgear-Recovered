.class public final Lvw1;
.super Lwy2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final v:Ltw1;

.field public static final w:Lnt0;


# instance fields
.field public o:Luw1;

.field public p:Ljava/util/concurrent/Executor;

.field public q:Lbb2;

.field public r:Luw0;

.field public s:Llj2;

.field public t:Lrj2;

.field public u:Lcb2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ltw1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lvw1;->v:Ltw1;

    .line 7
    .line 8
    invoke-static {}, Lpg3;->o()Lnt0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lvw1;->w:Lnt0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final B()V
    .locals 2

    .line 1
    iget-object v0, p0, Lvw1;->u:Lcb2;

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
    iput-object v1, p0, Lvw1;->u:Lcb2;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lvw1;->r:Luw0;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ld70;->a()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lvw1;->r:Luw0;

    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, Lvw1;->s:Llj2;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, Llj2;->b()V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lvw1;->s:Llj2;

    .line 28
    .line 29
    :cond_2
    iput-object v1, p0, Lvw1;->t:Lrj2;

    .line 30
    .line 31
    return-void
.end method

.method public final C()Lfs0;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lwy2;->b()Lzp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lwy2;->g:Lpg;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, v1, Lpg;->a:Landroid/util/Size;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v1, v2

    .line 14
    :goto_0
    if-eqz v0, :cond_3

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    iget-object v2, p0, Lwy2;->i:Landroid/graphics/Rect;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    if-nez v2, :cond_2

    .line 23
    .line 24
    new-instance v2, Landroid/graphics/Rect;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-direct {v2, v3, v3, v4, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-virtual {p0, v0, v3}, Lwy2;->g(Lzp;Z)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    new-instance v0, Lfs0;

    .line 42
    .line 43
    invoke-direct {v0, v1, v2, p0}, Lfs0;-><init>(Landroid/util/Size;Landroid/graphics/Rect;I)V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_3
    :goto_1
    return-object v2
.end method

.method public final D(Luw1;)V
    .locals 1

    .line 1
    invoke-static {}, Lpg3;->a()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvw1;->o:Luw1;

    .line 5
    .line 6
    sget-object p1, Lvw1;->w:Lnt0;

    .line 7
    .line 8
    iput-object p1, p0, Lvw1;->p:Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    iget-object p1, p0, Lwy2;->g:Lpg;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object v0, p1, Lpg;->a:Landroid/util/Size;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lwy2;->f:Lzy2;

    .line 21
    .line 22
    check-cast v0, Lww1;

    .line 23
    .line 24
    invoke-virtual {p0, v0, p1}, Lvw1;->E(Lww1;Lpg;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lwy2;->n()V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p0}, Lwy2;->m()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final E(Lww1;Lpg;)V
    .locals 14

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v10

    .line 8
    invoke-static {}, Lpg3;->a()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lwy2;->b()Lzp;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lvw1;->B()V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lvw1;->s:Llj2;

    .line 22
    .line 23
    const/4 v11, 0x0

    .line 24
    const/4 v12, 0x1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    move v1, v12

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v1, v11

    .line 30
    :goto_0
    const/4 v2, 0x0

    .line 31
    invoke-static {v2, v1}, Lde3;->j(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Llj2;

    .line 35
    .line 36
    iget-object v4, p0, Lwy2;->j:Landroid/graphics/Matrix;

    .line 37
    .line 38
    invoke-interface {v0}, Lzp;->k()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    iget-object v6, v3, Lpg;->a:Landroid/util/Size;

    .line 43
    .line 44
    iget-object v7, p0, Lwy2;->i:Landroid/graphics/Rect;

    .line 45
    .line 46
    if-eqz v7, :cond_1

    .line 47
    .line 48
    move-object v6, v7

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    if-eqz v6, :cond_2

    .line 51
    .line 52
    new-instance v2, Landroid/graphics/Rect;

    .line 53
    .line 54
    invoke-virtual {v6}, Landroid/util/Size;->getWidth()I

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    invoke-virtual {v6}, Landroid/util/Size;->getHeight()I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    invoke-direct {v2, v11, v11, v7, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 63
    .line 64
    .line 65
    :cond_2
    move-object v6, v2

    .line 66
    :goto_1
    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v0}, Lwy2;->k(Lzp;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-virtual {p0, v0, v2}, Lwy2;->g(Lzp;Z)I

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    iget-object v2, p0, Lwy2;->f:Lzy2;

    .line 78
    .line 79
    check-cast v2, Ljw0;

    .line 80
    .line 81
    sget-object v13, Ljw0;->s:Llf;

    .line 82
    .line 83
    invoke-interface {v2, v13, v10}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Ljava/lang/Integer;

    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    invoke-interface {v0}, Lzp;->k()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eqz v2, :cond_3

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Lwy2;->k(Lzp;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    move v9, v12

    .line 106
    :goto_2
    move-object v0, v1

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    move v9, v11

    .line 109
    goto :goto_2

    .line 110
    :goto_3
    const/4 v1, 0x1

    .line 111
    const/16 v2, 0x22

    .line 112
    .line 113
    invoke-direct/range {v0 .. v9}, Llj2;-><init>(IILpg;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    .line 114
    .line 115
    .line 116
    iput-object v0, p0, Lvw1;->s:Llj2;

    .line 117
    .line 118
    new-instance v1, Ls2;

    .line 119
    .line 120
    const/16 v2, 0x1b

    .line 121
    .line 122
    invoke-direct {v1, p0, v2}, Ls2;-><init>(Ljava/lang/Object;I)V

    .line 123
    .line 124
    .line 125
    invoke-static {}, Lpg3;->a()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Llj2;->a()V

    .line 129
    .line 130
    .line 131
    iget-object v0, v0, Llj2;->m:Ljava/util/HashSet;

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    iget-object v0, p0, Lvw1;->s:Llj2;

    .line 137
    .line 138
    invoke-virtual {v0, v12}, Llj2;->c(Z)Lrj2;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iput-object v0, p0, Lvw1;->t:Lrj2;

    .line 143
    .line 144
    iget-object v0, v0, Lrj2;->j:Luw0;

    .line 145
    .line 146
    iput-object v0, p0, Lvw1;->r:Luw0;

    .line 147
    .line 148
    iget-object v0, p0, Lvw1;->o:Luw1;

    .line 149
    .line 150
    const/4 v1, 0x3

    .line 151
    if-eqz v0, :cond_5

    .line 152
    .line 153
    invoke-virtual {p0}, Lwy2;->b()Lzp;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    iget-object v2, p0, Lvw1;->s:Llj2;

    .line 158
    .line 159
    if-eqz v0, :cond_4

    .line 160
    .line 161
    if-eqz v2, :cond_4

    .line 162
    .line 163
    invoke-virtual {p0, v0}, Lwy2;->k(Lzp;)Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    invoke-virtual {p0, v0, v4}, Lwy2;->g(Lzp;Z)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    iget-object v4, p0, Lwy2;->f:Lzy2;

    .line 172
    .line 173
    check-cast v4, Ljw0;

    .line 174
    .line 175
    invoke-interface {v4, v13, v10}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    check-cast v4, Ljava/lang/Integer;

    .line 180
    .line 181
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    new-instance v5, Lij2;

    .line 186
    .line 187
    invoke-direct {v5, v2, v0, v4}, Lij2;-><init>(Llj2;II)V

    .line 188
    .line 189
    .line 190
    invoke-static {v5}, Lpg3;->w(Ljava/lang/Runnable;)V

    .line 191
    .line 192
    .line 193
    :cond_4
    iget-object v0, p0, Lvw1;->o:Luw1;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    iget-object v2, p0, Lvw1;->t:Lrj2;

    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    iget-object v4, p0, Lvw1;->p:Ljava/util/concurrent/Executor;

    .line 204
    .line 205
    new-instance v5, Lji1;

    .line 206
    .line 207
    invoke-direct {v5, v1, v0, v2}, Lji1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 211
    .line 212
    .line 213
    :cond_5
    iget-object v0, v3, Lpg;->a:Landroid/util/Size;

    .line 214
    .line 215
    invoke-static {p1, v0}, Lbb2;->d(Lzy2;Landroid/util/Size;)Lbb2;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    iget-object v2, v0, Lab2;->b:Lir;

    .line 220
    .line 221
    iget-object v4, v3, Lpg;->c:Landroid/util/Range;

    .line 222
    .line 223
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    sget-object v5, Ljr;->j:Llf;

    .line 227
    .line 228
    iget-object v6, v2, Lir;->d:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v6, Luk1;

    .line 231
    .line 232
    invoke-virtual {v6, v5, v4}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-interface {p1}, Lzy2;->v()I

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    if-eqz p1, :cond_6

    .line 240
    .line 241
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    if-eqz p1, :cond_6

    .line 245
    .line 246
    sget-object v4, Lzy2;->P:Llf;

    .line 247
    .line 248
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    iget-object v5, v2, Lir;->d:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v5, Luk1;

    .line 255
    .line 256
    invoke-virtual {v5, v4, p1}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    :cond_6
    iget-object p1, v3, Lpg;->d:Lty;

    .line 260
    .line 261
    if-eqz p1, :cond_7

    .line 262
    .line 263
    invoke-virtual {v2, p1}, Lir;->e(Lty;)V

    .line 264
    .line 265
    .line 266
    :cond_7
    iget-object p1, p0, Lvw1;->o:Luw1;

    .line 267
    .line 268
    if-eqz p1, :cond_8

    .line 269
    .line 270
    iget-object p1, p0, Lvw1;->r:Luw0;

    .line 271
    .line 272
    iget-object v2, v3, Lpg;->b:Lmb0;

    .line 273
    .line 274
    iget-object v3, p0, Lwy2;->f:Lzy2;

    .line 275
    .line 276
    check-cast v3, Ljw0;

    .line 277
    .line 278
    sget-object v4, Ljw0;->t:Llf;

    .line 279
    .line 280
    invoke-interface {v3, v4, v10}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    check-cast v3, Ljava/lang/Integer;

    .line 285
    .line 286
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    invoke-virtual {v0, p1, v2, v3}, Lbb2;->b(Ld70;Lmb0;I)V

    .line 291
    .line 292
    .line 293
    :cond_8
    iget-object p1, p0, Lvw1;->u:Lcb2;

    .line 294
    .line 295
    if-eqz p1, :cond_9

    .line 296
    .line 297
    invoke-virtual {p1}, Lcb2;->b()V

    .line 298
    .line 299
    .line 300
    :cond_9
    new-instance p1, Lcb2;

    .line 301
    .line 302
    new-instance v2, Lkv0;

    .line 303
    .line 304
    invoke-direct {v2, p0, v1}, Lkv0;-><init>(Ljava/lang/Object;I)V

    .line 305
    .line 306
    .line 307
    invoke-direct {p1, v2}, Lcb2;-><init>(Ldb2;)V

    .line 308
    .line 309
    .line 310
    iput-object p1, p0, Lvw1;->u:Lcb2;

    .line 311
    .line 312
    iput-object p1, v0, Lab2;->f:Lcb2;

    .line 313
    .line 314
    iput-object v0, p0, Lvw1;->q:Lbb2;

    .line 315
    .line 316
    invoke-virtual {v0}, Lbb2;->c()Lfb2;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    new-instance v0, Ljava/util/ArrayList;

    .line 325
    .line 326
    invoke-direct {v0, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 327
    .line 328
    .line 329
    aget-object p1, p1, v11

    .line 330
    .line 331
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    invoke-virtual {p0, p1}, Lwy2;->A(Ljava/util/List;)V

    .line 342
    .line 343
    .line 344
    return-void
.end method

.method public final e(ZLcz2;)Lzy2;
    .locals 3

    .line 1
    sget-object v0, Lvw1;->v:Ltw1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Ltw1;->a:Lww1;

    .line 7
    .line 8
    invoke-interface {v0}, Lzy2;->t()Lbz2;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-interface {p2, v1, v2}, Lcz2;->a(Lbz2;I)Lty;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-static {p2, v0}, Lty;->q(Lty;Lty;)Lnq1;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    :cond_0
    if-nez p2, :cond_1

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-virtual {p0, p2}, Lvw1;->j(Lty;)Lyy2;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lnr;

    .line 32
    .line 33
    new-instance p1, Lww1;

    .line 34
    .line 35
    iget-object p0, p0, Lnr;->b:Luk1;

    .line 36
    .line 37
    invoke-static {p0}, Lnq1;->d(Lty;)Lnq1;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-direct {p1, p0}, Lww1;-><init>(Lnq1;)V

    .line 42
    .line 43
    .line 44
    return-object p1
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
    const/4 v0, 0x1

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
    .locals 1

    .line 1
    new-instance p0, Lnr;

    .line 2
    .line 3
    invoke-static {p1}, Luk1;->m(Lty;)Luk1;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x3

    .line 8
    invoke-direct {p0, p1, v0}, Lnr;-><init>(Luk1;I)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final r(Lxp;Lyy2;)Lzy2;
    .locals 1

    .line 1
    invoke-interface {p2}, Luf0;->m()Luk1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p1, Lhw0;->o:Llf;

    .line 6
    .line 7
    const/16 v0, 0x22

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0, p1, v0}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2}, Lyy2;->o()Lzy2;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwy2;->f()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "Preview:"

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final u(Lty;)Lpg;
    .locals 3

    .line 1
    iget-object v0, p0, Lvw1;->q:Lbb2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbb2;->a(Lty;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lvw1;->q:Lbb2;

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
    .locals 0

    .line 1
    iget-object p2, p0, Lwy2;->f:Lzy2;

    .line 2
    .line 3
    check-cast p2, Lww1;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lvw1;->E(Lww1;Lpg;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final w()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lvw1;->B()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final y(Landroid/graphics/Rect;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lwy2;->i:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p0}, Lwy2;->b()Lzp;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lvw1;->s:Llj2;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lwy2;->k(Lzp;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p0, p1, v1}, Lwy2;->g(Lzp;Z)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget-object p0, p0, Lwy2;->f:Lzy2;

    .line 22
    .line 23
    check-cast p0, Ljw0;

    .line 24
    .line 25
    sget-object v1, Ljw0;->s:Llf;

    .line 26
    .line 27
    const/4 v2, -0x1

    .line 28
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {p0, v1, v2}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    new-instance v1, Lij2;

    .line 43
    .line 44
    invoke-direct {v1, v0, p1, p0}, Lij2;-><init>(Llj2;II)V

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Lpg3;->w(Ljava/lang/Runnable;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void
.end method

.class public final Lzv0;
.super Lwy2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final x:Lxv0;


# instance fields
.field public final o:I

.field public final p:Ljava/util/concurrent/atomic/AtomicReference;

.field public final q:I

.field public final r:Ls72;

.field public s:Lbb2;

.field public t:Lra2;

.field public u:Lqm2;

.field public v:Lcb2;

.field public final w:Lzb0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxv0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lzv0;->x:Lxv0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Law0;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lwy2;-><init>(Lzy2;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lzv0;->p:Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    const/4 p1, -0x1

    .line 13
    iput p1, p0, Lzv0;->q:I

    .line 14
    .line 15
    new-instance p1, Lzb0;

    .line 16
    .line 17
    const/16 v1, 0xf

    .line 18
    .line 19
    invoke-direct {p1, p0, v1}, Lzb0;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lzv0;->w:Lzb0;

    .line 23
    .line 24
    iget-object p1, p0, Lwy2;->f:Lzy2;

    .line 25
    .line 26
    check-cast p1, Law0;

    .line 27
    .line 28
    sget-object v1, Law0;->b:Llf;

    .line 29
    .line 30
    invoke-interface {p1, v1}, Lx02;->h(Llf;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-interface {p1, v1}, Lx02;->e(Llf;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iput v1, p0, Lzv0;->o:I

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v1, 0x1

    .line 50
    iput v1, p0, Lzv0;->o:I

    .line 51
    .line 52
    :goto_0
    sget-object v1, Law0;->v:Llf;

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-interface {p1, v1, v2}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    sget-object v1, Law0;->w:Llf;

    .line 69
    .line 70
    invoke-interface {p1, v1, v0}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Ls72;

    .line 75
    .line 76
    new-instance v0, Ls72;

    .line 77
    .line 78
    invoke-direct {v0, p1}, Ls72;-><init>(Ls72;)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, Lzv0;->r:Ls72;

    .line 82
    .line 83
    return-void
.end method

.method public static E(ILjava/util/List;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/util/Pair;

    .line 16
    .line 17
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method


# virtual methods
.method public final B(Z)V
    .locals 2

    .line 1
    invoke-static {}, Lpg3;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lzv0;->v:Lcb2;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcb2;->b()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lzv0;->v:Lcb2;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lzv0;->t:Lra2;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lra2;->g()V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lzv0;->t:Lra2;

    .line 22
    .line 23
    :cond_1
    if-nez p1, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lzv0;->u:Lqm2;

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p1}, Lqm2;->a()V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lzv0;->u:Lqm2;

    .line 33
    .line 34
    :cond_2
    return-void
.end method

.method public final C(Ljava/lang/String;Law0;Lpg;)Lbb2;
    .locals 16

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
    invoke-static {}, Lpg3;->a()V

    .line 8
    .line 9
    .line 10
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    iget-object v4, v2, Lpg;->a:Landroid/util/Size;

    .line 14
    .line 15
    invoke-virtual {v0}, Lwy2;->b()Lzp;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-interface {v3}, Lzp;->k()Z

    .line 23
    .line 24
    .line 25
    move-result v10

    .line 26
    xor-int/lit8 v7, v10, 0x1

    .line 27
    .line 28
    iget-object v3, v0, Lzv0;->t:Lra2;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    invoke-static {v5, v7}, Lde3;->j(Ljava/lang/String;Z)V

    .line 34
    .line 35
    .line 36
    iget-object v3, v0, Lzv0;->t:Lra2;

    .line 37
    .line 38
    invoke-virtual {v3}, Lra2;->g()V

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object v3, v0, Lwy2;->f:Lzy2;

    .line 42
    .line 43
    sget-object v6, Law0;->U:Llf;

    .line 44
    .line 45
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-interface {v3, v6, v8}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    invoke-virtual {v0}, Lwy2;->b()Lzp;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-interface {v3}, Lzp;->f()Lhp;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-interface {v3}, Lhp;->u()V

    .line 68
    .line 69
    .line 70
    :cond_1
    new-instance v11, Lra2;

    .line 71
    .line 72
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-static {}, Lpg3;->a()V

    .line 76
    .line 77
    .line 78
    iput-object v1, v11, Lra2;->a:Ljava/lang/Object;

    .line 79
    .line 80
    sget-object v3, Lzy2;->J:Llf;

    .line 81
    .line 82
    invoke-interface {v1, v3, v5}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    check-cast v3, Lco;

    .line 87
    .line 88
    if-eqz v3, :cond_12

    .line 89
    .line 90
    new-instance v6, Lir;

    .line 91
    .line 92
    invoke-direct {v6}, Lir;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, v1, v6}, Lco;->a(Lzy2;Lir;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v6}, Lir;->i()Ljr;

    .line 99
    .line 100
    .line 101
    new-instance v12, Lcb;

    .line 102
    .line 103
    const/16 v3, 0x15

    .line 104
    .line 105
    const/4 v13, 0x0

    .line 106
    invoke-direct {v12, v3, v13}, Lcb;-><init>(IZ)V

    .line 107
    .line 108
    .line 109
    iput-object v12, v11, Lra2;->b:Ljava/lang/Object;

    .line 110
    .line 111
    new-instance v14, Lk8;

    .line 112
    .line 113
    invoke-static {}, Lpg3;->n()Lwz0;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    sget-object v6, Lvz0;->C:Llf;

    .line 118
    .line 119
    invoke-interface {v1, v6, v3}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    check-cast v3, Ljava/util/concurrent/Executor;

    .line 124
    .line 125
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    invoke-direct {v14, v3}, Lk8;-><init>(Ljava/util/concurrent/Executor;)V

    .line 129
    .line 130
    .line 131
    iput-object v14, v11, Lra2;->c:Ljava/lang/Object;

    .line 132
    .line 133
    invoke-virtual {v1}, Law0;->l()I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    sget-object v6, Law0;->d:Llf;

    .line 138
    .line 139
    invoke-interface {v1, v6, v5}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    check-cast v6, Ljava/lang/Integer;

    .line 144
    .line 145
    if-eqz v6, :cond_2

    .line 146
    .line 147
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    goto :goto_0

    .line 152
    :cond_2
    sget-object v6, Lhw0;->o:Llf;

    .line 153
    .line 154
    invoke-interface {v1, v6, v5}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    check-cast v6, Ljava/lang/Integer;

    .line 159
    .line 160
    if-eqz v6, :cond_3

    .line 161
    .line 162
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    const/16 v8, 0x1005

    .line 167
    .line 168
    if-ne v6, v8, :cond_3

    .line 169
    .line 170
    move v6, v8

    .line 171
    goto :goto_0

    .line 172
    :cond_3
    const/16 v6, 0x100

    .line 173
    .line 174
    :goto_0
    sget-object v8, Law0;->f:Llf;

    .line 175
    .line 176
    invoke-interface {v1, v8, v5}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    if-nez v1, :cond_11

    .line 181
    .line 182
    move v5, v3

    .line 183
    new-instance v3, Ljf;

    .line 184
    .line 185
    new-instance v8, Lac0;

    .line 186
    .line 187
    invoke-direct {v8}, Lac0;-><init>()V

    .line 188
    .line 189
    .line 190
    new-instance v9, Lac0;

    .line 191
    .line 192
    invoke-direct {v9}, Lac0;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-direct/range {v3 .. v9}, Ljf;-><init>(Landroid/util/Size;IIZLac0;Lac0;)V

    .line 196
    .line 197
    .line 198
    iput-object v3, v11, Lra2;->d:Ljava/lang/Object;

    .line 199
    .line 200
    iget-object v1, v12, Lcb;->c:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v1, Ljf;

    .line 203
    .line 204
    if-nez v1, :cond_4

    .line 205
    .line 206
    iget-object v1, v12, Lcb;->b:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v1, Lir;

    .line 209
    .line 210
    if-nez v1, :cond_4

    .line 211
    .line 212
    const/4 v1, 0x1

    .line 213
    goto :goto_1

    .line 214
    :cond_4
    move v1, v13

    .line 215
    :goto_1
    const-string v7, "CaptureNode does not support recreation yet."

    .line 216
    .line 217
    invoke-static {v7, v1}, Lde3;->j(Ljava/lang/String;Z)V

    .line 218
    .line 219
    .line 220
    iput-object v3, v12, Lcb;->c:Ljava/lang/Object;

    .line 221
    .line 222
    new-instance v1, Lmr;

    .line 223
    .line 224
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 225
    .line 226
    .line 227
    const/4 v7, 0x2

    .line 228
    const/4 v15, 0x4

    .line 229
    if-eqz v10, :cond_9

    .line 230
    .line 231
    new-instance v10, Lli1;

    .line 232
    .line 233
    move/from16 p1, v13

    .line 234
    .line 235
    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    .line 236
    .line 237
    .line 238
    move-result v13

    .line 239
    const/16 p2, 0x1

    .line 240
    .line 241
    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    invoke-direct {v10, v13, v6, v5, v15}, Lli1;-><init>(IIII)V

    .line 246
    .line 247
    .line 248
    iget-object v6, v10, Lli1;->b:Lki1;

    .line 249
    .line 250
    new-array v13, v7, [Lmo;

    .line 251
    .line 252
    aput-object v1, v13, p1

    .line 253
    .line 254
    aput-object v6, v13, p2

    .line 255
    .line 256
    invoke-static {v13}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 261
    .line 262
    .line 263
    move-result v6

    .line 264
    if-eqz v6, :cond_5

    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    move/from16 v13, p2

    .line 272
    .line 273
    if-ne v6, v13, :cond_6

    .line 274
    .line 275
    move/from16 v6, p1

    .line 276
    .line 277
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    check-cast v1, Lmo;

    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_6
    new-instance v6, Ljava/util/ArrayList;

    .line 285
    .line 286
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 287
    .line 288
    .line 289
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    :cond_7
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 294
    .line 295
    .line 296
    move-result v13

    .line 297
    if-eqz v13, :cond_8

    .line 298
    .line 299
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v13

    .line 303
    check-cast v13, Lmo;

    .line 304
    .line 305
    instance-of v15, v13, Loo;

    .line 306
    .line 307
    if-nez v15, :cond_7

    .line 308
    .line 309
    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    goto :goto_2

    .line 313
    :cond_8
    :goto_3
    new-instance v1, Lkr;

    .line 314
    .line 315
    const/4 v6, 0x0

    .line 316
    invoke-direct {v1, v12, v6}, Lkr;-><init>(Lcb;I)V

    .line 317
    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_9
    move v6, v13

    .line 321
    new-instance v10, Lfs0;

    .line 322
    .line 323
    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    .line 328
    .line 329
    .line 330
    move-result v13

    .line 331
    invoke-static {v1, v13, v5, v15}, Li13;->j(IIII)Lk8;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    const/4 v13, 0x7

    .line 336
    invoke-direct {v10, v1, v13}, Lfs0;-><init>(Ljava/lang/Object;I)V

    .line 337
    .line 338
    .line 339
    new-instance v1, Lkr;

    .line 340
    .line 341
    const/4 v13, 0x1

    .line 342
    invoke-direct {v1, v12, v13}, Lkr;-><init>(Lcb;I)V

    .line 343
    .line 344
    .line 345
    :goto_4
    invoke-interface {v10}, Low0;->getSurface()Landroid/view/Surface;

    .line 346
    .line 347
    .line 348
    move-result-object v13

    .line 349
    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    iget-object v15, v3, Ljf;->a:Luw0;

    .line 353
    .line 354
    if-nez v15, :cond_a

    .line 355
    .line 356
    const/4 v15, 0x1

    .line 357
    goto :goto_5

    .line 358
    :cond_a
    move v15, v6

    .line 359
    :goto_5
    const-string v6, "The surface is already set."

    .line 360
    .line 361
    invoke-static {v6, v15}, Lde3;->j(Ljava/lang/String;Z)V

    .line 362
    .line 363
    .line 364
    new-instance v6, Luw0;

    .line 365
    .line 366
    invoke-direct {v6, v13, v4, v5}, Luw0;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    .line 367
    .line 368
    .line 369
    iput-object v6, v3, Ljf;->a:Luw0;

    .line 370
    .line 371
    new-instance v3, Lir;

    .line 372
    .line 373
    invoke-direct {v3, v10}, Lir;-><init>(Low0;)V

    .line 374
    .line 375
    .line 376
    iput-object v3, v12, Lcb;->b:Ljava/lang/Object;

    .line 377
    .line 378
    new-instance v3, Ln4;

    .line 379
    .line 380
    invoke-direct {v3, v12}, Ln4;-><init>(Lcb;)V

    .line 381
    .line 382
    .line 383
    invoke-static {}, Lpg3;->o()Lnt0;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    invoke-interface {v10, v3, v4}, Low0;->f(Lnw0;Ljava/util/concurrent/Executor;)V

    .line 388
    .line 389
    .line 390
    iput-object v1, v8, Lac0;->b:Ljava/lang/Object;

    .line 391
    .line 392
    new-instance v1, Lkr;

    .line 393
    .line 394
    invoke-direct {v1, v12, v7}, Lkr;-><init>(Lcb;I)V

    .line 395
    .line 396
    .line 397
    iput-object v1, v9, Lac0;->b:Ljava/lang/Object;

    .line 398
    .line 399
    iget-object v1, v14, Lk8;->c:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v1, Ler0;

    .line 402
    .line 403
    const-class v3, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;

    .line 404
    .line 405
    invoke-virtual {v1, v3}, Ler0;->h(Ljava/lang/Class;)Lh02;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    check-cast v1, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;

    .line 410
    .line 411
    iput-object v11, v0, Lzv0;->t:Lra2;

    .line 412
    .line 413
    iget-object v1, v0, Lzv0;->u:Lqm2;

    .line 414
    .line 415
    if-nez v1, :cond_b

    .line 416
    .line 417
    new-instance v1, Lqm2;

    .line 418
    .line 419
    iget-object v3, v0, Lzv0;->w:Lzb0;

    .line 420
    .line 421
    invoke-direct {v1, v3}, Lqm2;-><init>(Lzb0;)V

    .line 422
    .line 423
    .line 424
    iput-object v1, v0, Lzv0;->u:Lqm2;

    .line 425
    .line 426
    :cond_b
    iget-object v1, v0, Lzv0;->u:Lqm2;

    .line 427
    .line 428
    iget-object v3, v0, Lzv0;->t:Lra2;

    .line 429
    .line 430
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    invoke-static {}, Lpg3;->a()V

    .line 434
    .line 435
    .line 436
    iput-object v3, v1, Lqm2;->b:Lra2;

    .line 437
    .line 438
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-static {}, Lpg3;->a()V

    .line 442
    .line 443
    .line 444
    iget-object v3, v3, Lra2;->b:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v3, Lcb;

    .line 447
    .line 448
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    invoke-static {}, Lpg3;->a()V

    .line 452
    .line 453
    .line 454
    iget-object v4, v3, Lcb;->b:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v4, Lir;

    .line 457
    .line 458
    if-eqz v4, :cond_c

    .line 459
    .line 460
    const/4 v13, 0x1

    .line 461
    goto :goto_6

    .line 462
    :cond_c
    const/4 v13, 0x0

    .line 463
    :goto_6
    const-string v4, "The ImageReader is not initialized."

    .line 464
    .line 465
    invoke-static {v4, v13}, Lde3;->j(Ljava/lang/String;Z)V

    .line 466
    .line 467
    .line 468
    iget-object v3, v3, Lcb;->b:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v3, Lir;

    .line 471
    .line 472
    iget-object v4, v3, Lir;->c:Ljava/lang/Object;

    .line 473
    .line 474
    monitor-enter v4

    .line 475
    :try_start_0
    iput-object v1, v3, Lir;->f:Ljava/lang/Object;

    .line 476
    .line 477
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 478
    iget-object v1, v0, Lzv0;->t:Lra2;

    .line 479
    .line 480
    iget-object v3, v2, Lpg;->a:Landroid/util/Size;

    .line 481
    .line 482
    iget-object v4, v1, Lra2;->a:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v4, Law0;

    .line 485
    .line 486
    invoke-static {v4, v3}, Lbb2;->d(Lzy2;Landroid/util/Size;)Lbb2;

    .line 487
    .line 488
    .line 489
    move-result-object v3

    .line 490
    iget-object v1, v1, Lra2;->d:Ljava/lang/Object;

    .line 491
    .line 492
    check-cast v1, Ljf;

    .line 493
    .line 494
    iget-object v4, v1, Ljf;->a:Luw0;

    .line 495
    .line 496
    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    sget-object v5, Lmb0;->d:Lmb0;

    .line 500
    .line 501
    invoke-static {v4}, Lmg;->a(Ld70;)Lb5;

    .line 502
    .line 503
    .line 504
    move-result-object v4

    .line 505
    iput-object v5, v4, Lb5;->f:Ljava/lang/Object;

    .line 506
    .line 507
    invoke-virtual {v4}, Lb5;->j()Lmg;

    .line 508
    .line 509
    .line 510
    move-result-object v4

    .line 511
    iget-object v5, v3, Lab2;->a:Ljava/util/LinkedHashSet;

    .line 512
    .line 513
    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    iget-object v1, v1, Ljf;->b:Luw0;

    .line 517
    .line 518
    if-eqz v1, :cond_d

    .line 519
    .line 520
    invoke-static {v1}, Lmg;->a(Ld70;)Lb5;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    invoke-virtual {v1}, Lb5;->j()Lmg;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    iput-object v1, v3, Lab2;->h:Lmg;

    .line 529
    .line 530
    :cond_d
    iget v1, v0, Lzv0;->o:I

    .line 531
    .line 532
    if-ne v1, v7, :cond_e

    .line 533
    .line 534
    iget-boolean v1, v2, Lpg;->e:Z

    .line 535
    .line 536
    if-nez v1, :cond_e

    .line 537
    .line 538
    invoke-virtual {v0}, Lwy2;->c()Lnp;

    .line 539
    .line 540
    .line 541
    move-result-object v1

    .line 542
    invoke-interface {v1, v3}, Lnp;->e(Lbb2;)V

    .line 543
    .line 544
    .line 545
    :cond_e
    iget-object v1, v2, Lpg;->d:Lty;

    .line 546
    .line 547
    if-eqz v1, :cond_f

    .line 548
    .line 549
    iget-object v2, v3, Lab2;->b:Lir;

    .line 550
    .line 551
    invoke-virtual {v2, v1}, Lir;->e(Lty;)V

    .line 552
    .line 553
    .line 554
    :cond_f
    iget-object v1, v0, Lzv0;->v:Lcb2;

    .line 555
    .line 556
    if-eqz v1, :cond_10

    .line 557
    .line 558
    invoke-virtual {v1}, Lcb2;->b()V

    .line 559
    .line 560
    .line 561
    :cond_10
    new-instance v1, Lcb2;

    .line 562
    .line 563
    new-instance v2, Lkv0;

    .line 564
    .line 565
    const/4 v13, 0x1

    .line 566
    invoke-direct {v2, v0, v13}, Lkv0;-><init>(Ljava/lang/Object;I)V

    .line 567
    .line 568
    .line 569
    invoke-direct {v1, v2}, Lcb2;-><init>(Ldb2;)V

    .line 570
    .line 571
    .line 572
    iput-object v1, v0, Lzv0;->v:Lcb2;

    .line 573
    .line 574
    iput-object v1, v3, Lab2;->f:Lcb2;

    .line 575
    .line 576
    return-object v3

    .line 577
    :catchall_0
    move-exception v0

    .line 578
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 579
    throw v0

    .line 580
    :cond_11
    move-object v3, v5

    .line 581
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 582
    .line 583
    .line 584
    throw v3

    .line 585
    :cond_12
    move-object v3, v5

    .line 586
    const-string v0, "Implementation is missing option unpacker for "

    .line 587
    .line 588
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    sget-object v4, Lrm2;->D:Llf;

    .line 593
    .line 594
    invoke-interface {v1, v4, v2}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    check-cast v1, Ljava/lang/String;

    .line 599
    .line 600
    invoke-static {v1, v0}, Lds0;->w(Ljava/lang/Object;Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    throw v3
.end method

.method public final D()I
    .locals 3

    .line 1
    iget-object v0, p0, Lzv0;->p:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lzv0;->q:I

    .line 5
    .line 6
    const/4 v2, -0x1

    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p0, p0, Lwy2;->f:Lzy2;

    .line 11
    .line 12
    check-cast p0, Law0;

    .line 13
    .line 14
    sget-object v1, Law0;->c:Llf;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {p0, v1, v2}, Lx02;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    :goto_0
    monitor-exit v0

    .line 32
    return v1

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw p0
.end method

.method public final e(ZLcz2;)Lzy2;
    .locals 3

    .line 1
    sget-object v0, Lzv0;->x:Lxv0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lxv0;->a:Law0;

    .line 7
    .line 8
    invoke-interface {v0}, Lzy2;->t()Lbz2;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget v2, p0, Lzv0;->o:I

    .line 13
    .line 14
    invoke-interface {p2, v1, v2}, Lcz2;->a(Lbz2;I)Lty;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-static {p2, v0}, Lty;->q(Lty;Lty;)Lnq1;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    :cond_0
    if-nez p2, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0

    .line 28
    :cond_1
    invoke-virtual {p0, p2}, Lzv0;->j(Lty;)Lyy2;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Lnr;

    .line 33
    .line 34
    new-instance p1, Law0;

    .line 35
    .line 36
    iget-object p0, p0, Lnr;->b:Luk1;

    .line 37
    .line 38
    invoke-static {p0}, Lnq1;->d(Lty;)Lnq1;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-direct {p1, p0}, Law0;-><init>(Lnq1;)V

    .line 43
    .line 44
    .line 45
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
    const/4 v0, 0x4

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
    const/4 v0, 0x2

    .line 8
    invoke-direct {p0, p1, v0}, Lnr;-><init>(Luk1;I)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final p()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lwy2;->b()Lzp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "Attached camera cannot be null"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lzv0;->D()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x3

    .line 15
    if-ne v0, v1, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Lwy2;->b()Lzp;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    invoke-interface {p0}, Lzp;->m()Lxp;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0}, Lxp;->d()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p0, -0x1

    .line 33
    :goto_0
    if-nez p0, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const-string p0, "Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture"

    .line 37
    .line 38
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_1
    return-void
.end method

.method public final q()V
    .locals 3

    .line 1
    const-string v0, "ImageCapture"

    .line 2
    .line 3
    invoke-static {v0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lzv0;->p:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lzv0;->p:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    monitor-exit v0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-virtual {p0}, Lwy2;->c()Lnp;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p0}, Lzv0;->D()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-interface {v1, v2}, Lnp;->c(I)V

    .line 30
    .line 31
    .line 32
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    :goto_0
    iget-object v0, p0, Lzv0;->r:Ls72;

    .line 34
    .line 35
    invoke-virtual {p0}, Lwy2;->c()Lnp;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p0, v0}, Lnp;->d(Ls72;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    throw p0
.end method

.method public final r(Lxp;Lyy2;)Lzy2;
    .locals 9

    .line 1
    const/16 v0, 0x23

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/16 v2, 0x100

    .line 8
    .line 9
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-interface {p1}, Lxp;->f()Ler0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-class v4, Landroidx/camera/core/internal/compat/quirk/SoftwareJpegEncodingPreferredQuirk;

    .line 18
    .line 19
    invoke-virtual {p1, v4}, Ler0;->d(Ljava/lang/Class;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const-string v4, "ImageCapture"

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-interface {p2}, Luf0;->m()Luk1;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    sget-object v6, Law0;->i:Llf;

    .line 34
    .line 35
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    :try_start_0
    invoke-virtual {v5, v6}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v7
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    :catch_0
    invoke-virtual {p1, v7}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    const-string p1, "Device quirk suggests software JPEG encoder, but it has been explicitly disabled."

    .line 51
    .line 52
    invoke-static {v4, p1}, Lhu0;->H0(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-static {v4}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    invoke-interface {p2}, Luf0;->m()Luk1;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    sget-object v5, Law0;->i:Llf;

    .line 64
    .line 65
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-virtual {p1, v5, v6}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    :goto_0
    invoke-interface {p2}, Luf0;->m()Luk1;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 75
    .line 76
    sget-object v6, Law0;->i:Llf;

    .line 77
    .line 78
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    :try_start_1
    invoke-virtual {p1, v6}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v7
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 87
    :catch_1
    invoke-virtual {v5, v7}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    const/4 v6, 0x1

    .line 92
    const/4 v7, 0x0

    .line 93
    const/4 v8, 0x0

    .line 94
    if-eqz v5, :cond_4

    .line 95
    .line 96
    invoke-virtual {p0}, Lwy2;->b()Lzp;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    if-nez v5, :cond_2

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    invoke-virtual {p0}, Lwy2;->b()Lzp;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-interface {v5}, Lzp;->f()Lhp;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-interface {v5}, Lhp;->u()V

    .line 112
    .line 113
    .line 114
    :goto_1
    sget-object v5, Law0;->d:Llf;

    .line 115
    .line 116
    :try_start_2
    invoke-virtual {p1, v5}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v5
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 120
    goto :goto_2

    .line 121
    :catch_2
    move-object v5, v7

    .line 122
    :goto_2
    check-cast v5, Ljava/lang/Integer;

    .line 123
    .line 124
    if-eqz v5, :cond_3

    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    if-eq v5, v2, :cond_3

    .line 131
    .line 132
    const-string v5, "Software JPEG cannot be used with non-JPEG output buffer format."

    .line 133
    .line 134
    invoke-static {v4, v5}, Lhu0;->H0(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_3
    move v8, v6

    .line 139
    :goto_3
    if-nez v8, :cond_4

    .line 140
    .line 141
    const-string v5, "Unable to support software JPEG. Disabling."

    .line 142
    .line 143
    invoke-static {v4, v5}, Lhu0;->H0(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    sget-object v4, Law0;->i:Llf;

    .line 147
    .line 148
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 149
    .line 150
    invoke-virtual {p1, v4, v5}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_4
    invoke-interface {p2}, Luf0;->m()Luk1;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    sget-object v4, Law0;->d:Llf;

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    :try_start_3
    invoke-virtual {p1, v4}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    .line 166
    goto :goto_4

    .line 167
    :catch_3
    move-object p1, v7

    .line 168
    :goto_4
    check-cast p1, Ljava/lang/Integer;

    .line 169
    .line 170
    if-eqz p1, :cond_7

    .line 171
    .line 172
    invoke-virtual {p0}, Lwy2;->b()Lzp;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    if-nez v1, :cond_5

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_5
    invoke-virtual {p0}, Lwy2;->b()Lzp;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-interface {p0}, Lzp;->f()Lhp;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-interface {p0}, Lhp;->u()V

    .line 188
    .line 189
    .line 190
    :goto_5
    invoke-interface {p2}, Luf0;->m()Luk1;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    sget-object v1, Lhw0;->o:Llf;

    .line 195
    .line 196
    if-eqz v8, :cond_6

    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    :goto_6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {p0, v1, p1}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    goto/16 :goto_8

    .line 211
    .line 212
    :cond_7
    invoke-interface {p2}, Luf0;->m()Luk1;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    sget-object p1, Law0;->e:Llf;

    .line 217
    .line 218
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    :try_start_4
    invoke-virtual {p0, p1}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p0
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_4

    .line 225
    goto :goto_7

    .line 226
    :catch_4
    move-object p0, v7

    .line 227
    :goto_7
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result p0

    .line 235
    if-eqz p0, :cond_8

    .line 236
    .line 237
    invoke-interface {p2}, Luf0;->m()Luk1;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    sget-object p1, Lhw0;->o:Llf;

    .line 242
    .line 243
    const/16 v0, 0x1005

    .line 244
    .line 245
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {p0, p1, v0}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-interface {p2}, Luf0;->m()Luk1;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    sget-object p1, Lhw0;->p:Llf;

    .line 257
    .line 258
    sget-object v0, Lmb0;->c:Lmb0;

    .line 259
    .line 260
    invoke-virtual {p0, p1, v0}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    goto :goto_8

    .line 264
    :cond_8
    if-eqz v8, :cond_9

    .line 265
    .line 266
    invoke-interface {p2}, Luf0;->m()Luk1;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    sget-object p1, Lhw0;->o:Llf;

    .line 271
    .line 272
    invoke-virtual {p0, p1, v1}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    goto :goto_8

    .line 276
    :cond_9
    invoke-interface {p2}, Luf0;->m()Luk1;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    sget-object p1, Ljw0;->z:Llf;

    .line 281
    .line 282
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    :try_start_5
    invoke-virtual {p0, p1}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v7
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_5

    .line 289
    :catch_5
    check-cast v7, Ljava/util/List;

    .line 290
    .line 291
    if-nez v7, :cond_a

    .line 292
    .line 293
    invoke-interface {p2}, Luf0;->m()Luk1;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    sget-object p1, Lhw0;->o:Llf;

    .line 298
    .line 299
    invoke-virtual {p0, p1, v3}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    goto :goto_8

    .line 303
    :cond_a
    invoke-static {v2, v7}, Lzv0;->E(ILjava/util/List;)Z

    .line 304
    .line 305
    .line 306
    move-result p0

    .line 307
    if-eqz p0, :cond_b

    .line 308
    .line 309
    invoke-interface {p2}, Luf0;->m()Luk1;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    sget-object p1, Lhw0;->o:Llf;

    .line 314
    .line 315
    invoke-virtual {p0, p1, v3}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    goto :goto_8

    .line 319
    :cond_b
    invoke-static {v0, v7}, Lzv0;->E(ILjava/util/List;)Z

    .line 320
    .line 321
    .line 322
    move-result p0

    .line 323
    if-eqz p0, :cond_c

    .line 324
    .line 325
    invoke-interface {p2}, Luf0;->m()Luk1;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    sget-object p1, Lhw0;->o:Llf;

    .line 330
    .line 331
    invoke-virtual {p0, p1, v1}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    :cond_c
    :goto_8
    invoke-interface {p2}, Lyy2;->o()Lzy2;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    return-object p0
.end method

.method public final t()V
    .locals 1

    .line 1
    iget-object v0, p0, Lzv0;->r:Ls72;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls72;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ls72;->a()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lzv0;->u:Lqm2;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lqm2;->a()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
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
    const-string v0, "ImageCapture:"

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
    iget-object v0, p0, Lzv0;->s:Lbb2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbb2;->a(Lty;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lzv0;->s:Lbb2;

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
    .locals 2

    .line 1
    invoke-virtual {p0}, Lwy2;->d()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p0, Lwy2;->f:Lzy2;

    .line 6
    .line 7
    check-cast v0, Law0;

    .line 8
    .line 9
    invoke-virtual {p0, p2, v0, p1}, Lzv0;->C(Ljava/lang/String;Law0;Lpg;)Lbb2;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iput-object p2, p0, Lzv0;->s:Lbb2;

    .line 14
    .line 15
    invoke-virtual {p2}, Lbb2;->c()Lfb2;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    aget-object p2, p2, v1

    .line 31
    .line 32
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p0, p2}, Lwy2;->A(Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lwy2;->m()V

    .line 46
    .line 47
    .line 48
    return-object p1
.end method

.method public final w()V
    .locals 1

    .line 1
    iget-object v0, p0, Lzv0;->r:Ls72;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls72;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ls72;->a()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lzv0;->u:Lqm2;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lqm2;->a()V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0}, Lzv0;->B(Z)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0}, Lwy2;->c()Lnp;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0, v0}, Lnp;->d(Ls72;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

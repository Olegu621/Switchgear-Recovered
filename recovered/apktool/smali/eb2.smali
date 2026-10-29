.class public final Leb2;
.super Lab2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final i:Lnb2;

.field public j:Z

.field public k:Z

.field public final l:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lab2;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lnb2;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1}, Lnb2;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Leb2;->i:Lnb2;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Leb2;->j:Z

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Leb2;->k:Z

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Leb2;->l:Ljava/util/ArrayList;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Lfb2;)V
    .locals 9

    .line 1
    iget-object v0, p1, Lfb2;->g:Ljr;

    .line 2
    .line 3
    iget v1, v0, Ljr;->c:I

    .line 4
    .line 5
    iget-object v2, v0, Ljr;->b:Lnq1;

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    iget-object v4, p0, Lab2;->b:Lir;

    .line 9
    .line 10
    if-eq v1, v3, :cond_1

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    iput-boolean v3, p0, Leb2;->k:Z

    .line 14
    .line 15
    iget v3, v4, Lir;->a:I

    .line 16
    .line 17
    sget-object v5, Lfb2;->i:Ljava/util/List;

    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    invoke-interface {v5, v6}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    invoke-interface {v5, v7}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-lt v6, v5, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v1, v3

    .line 39
    :goto_0
    iput v1, v4, Lir;->a:I

    .line 40
    .line 41
    :cond_1
    sget-object v1, Ljr;->j:Llf;

    .line 42
    .line 43
    sget-object v3, Lpg;->f:Landroid/util/Range;

    .line 44
    .line 45
    :try_start_0
    invoke-virtual {v2, v1}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    :catch_0
    check-cast v3, Landroid/util/Range;

    .line 50
    .line 51
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    sget-object v1, Lpg;->f:Landroid/util/Range;

    .line 55
    .line 56
    invoke-virtual {v3, v1}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    const-string v6, "ValidatingBuilder"

    .line 61
    .line 62
    const/4 v7, 0x0

    .line 63
    if-eqz v5, :cond_2

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    iget-object v5, v4, Lir;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v5, Luk1;

    .line 69
    .line 70
    sget-object v8, Ljr;->j:Llf;

    .line 71
    .line 72
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    :try_start_1
    invoke-virtual {v5, v8}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 79
    goto :goto_1

    .line 80
    :catch_1
    move-object v5, v1

    .line 81
    :goto_1
    check-cast v5, Landroid/util/Range;

    .line 82
    .line 83
    invoke-virtual {v5, v1}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    sget-object v1, Ljr;->j:Llf;

    .line 90
    .line 91
    iget-object v5, v4, Lir;->d:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v5, Luk1;

    .line 94
    .line 95
    invoke-virtual {v5, v1, v3}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    iget-object v1, v4, Lir;->d:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v1, Luk1;

    .line 102
    .line 103
    sget-object v5, Ljr;->j:Llf;

    .line 104
    .line 105
    sget-object v8, Lpg;->f:Landroid/util/Range;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    :try_start_2
    invoke-virtual {v1, v5}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v8
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 114
    :catch_2
    check-cast v8, Landroid/util/Range;

    .line 115
    .line 116
    invoke-virtual {v8, v3}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_4

    .line 121
    .line 122
    iput-boolean v7, p0, Leb2;->j:Z

    .line 123
    .line 124
    invoke-static {v6}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    :cond_4
    :goto_2
    invoke-virtual {v0}, Ljr;->a()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_5

    .line 132
    .line 133
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    if-eqz v1, :cond_5

    .line 137
    .line 138
    sget-object v3, Lzy2;->P:Llf;

    .line 139
    .line 140
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    iget-object v5, v4, Lir;->d:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v5, Luk1;

    .line 147
    .line 148
    invoke-virtual {v5, v3, v1}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :cond_5
    invoke-virtual {v0}, Ljr;->b()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_6

    .line 156
    .line 157
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    if-eqz v1, :cond_6

    .line 161
    .line 162
    sget-object v3, Lzy2;->Q:Llf;

    .line 163
    .line 164
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iget-object v5, v4, Lir;->d:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v5, Luk1;

    .line 171
    .line 172
    invoke-virtual {v5, v3, v1}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    :cond_6
    iget-object v1, v0, Ljr;->f:Lnm2;

    .line 176
    .line 177
    iget-object v3, v4, Lir;->f:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v3, Lcl1;

    .line 180
    .line 181
    iget-object v5, v4, Lir;->c:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v5, Ljava/util/HashSet;

    .line 184
    .line 185
    iget-object v3, v3, Lnm2;->a:Landroid/util/ArrayMap;

    .line 186
    .line 187
    iget-object v1, v1, Lnm2;->a:Landroid/util/ArrayMap;

    .line 188
    .line 189
    invoke-virtual {v3, v1}, Landroid/util/ArrayMap;->putAll(Ljava/util/Map;)V

    .line 190
    .line 191
    .line 192
    iget-object v1, p0, Lab2;->c:Ljava/util/ArrayList;

    .line 193
    .line 194
    iget-object v3, p1, Lfb2;->c:Ljava/util/List;

    .line 195
    .line 196
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 197
    .line 198
    .line 199
    iget-object v1, p0, Lab2;->d:Ljava/util/ArrayList;

    .line 200
    .line 201
    iget-object v3, p1, Lfb2;->d:Ljava/util/List;

    .line 202
    .line 203
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 204
    .line 205
    .line 206
    iget-object v1, v0, Ljr;->d:Ljava/util/List;

    .line 207
    .line 208
    invoke-virtual {v4, v1}, Lir;->b(Ljava/util/Collection;)V

    .line 209
    .line 210
    .line 211
    iget-object v1, p0, Lab2;->e:Ljava/util/ArrayList;

    .line 212
    .line 213
    iget-object v3, p1, Lfb2;->e:Ljava/util/List;

    .line 214
    .line 215
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 216
    .line 217
    .line 218
    iget-object v1, p1, Lfb2;->f:Ldb2;

    .line 219
    .line 220
    if-eqz v1, :cond_7

    .line 221
    .line 222
    iget-object v3, p0, Leb2;->l:Ljava/util/ArrayList;

    .line 223
    .line 224
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    :cond_7
    iget-object v1, p1, Lfb2;->h:Landroid/hardware/camera2/params/InputConfiguration;

    .line 228
    .line 229
    if-eqz v1, :cond_8

    .line 230
    .line 231
    iput-object v1, p0, Lab2;->g:Landroid/hardware/camera2/params/InputConfiguration;

    .line 232
    .line 233
    :cond_8
    iget-object v1, p1, Lfb2;->a:Ljava/util/ArrayList;

    .line 234
    .line 235
    iget-object v3, p0, Lab2;->a:Ljava/util/LinkedHashSet;

    .line 236
    .line 237
    invoke-interface {v3, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 238
    .line 239
    .line 240
    iget-object v0, v0, Ljr;->a:Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-interface {v5, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 247
    .line 248
    .line 249
    new-instance v0, Ljava/util/ArrayList;

    .line 250
    .line 251
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 252
    .line 253
    .line 254
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    :cond_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    if-eqz v3, :cond_a

    .line 263
    .line 264
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    check-cast v3, Lmg;

    .line 269
    .line 270
    iget-object v8, v3, Lmg;->a:Ld70;

    .line 271
    .line 272
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    iget-object v3, v3, Lmg;->b:Ljava/util/List;

    .line 276
    .line 277
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v8

    .line 285
    if-eqz v8, :cond_9

    .line 286
    .line 287
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v8

    .line 291
    check-cast v8, Ld70;

    .line 292
    .line 293
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    goto :goto_3

    .line 297
    :cond_a
    invoke-interface {v0, v5}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-nez v0, :cond_b

    .line 302
    .line 303
    invoke-static {v6}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    iput-boolean v7, p0, Leb2;->j:Z

    .line 307
    .line 308
    :cond_b
    iget-object p1, p1, Lfb2;->b:Lmg;

    .line 309
    .line 310
    if-eqz p1, :cond_d

    .line 311
    .line 312
    iget-object v0, p0, Lab2;->h:Lmg;

    .line 313
    .line 314
    if-eq v0, p1, :cond_c

    .line 315
    .line 316
    if-eqz v0, :cond_c

    .line 317
    .line 318
    invoke-static {v6}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    iput-boolean v7, p0, Leb2;->j:Z

    .line 322
    .line 323
    goto :goto_4

    .line 324
    :cond_c
    iput-object p1, p0, Lab2;->h:Lmg;

    .line 325
    .line 326
    :cond_d
    :goto_4
    invoke-virtual {v4, v2}, Lir;->e(Lty;)V

    .line 327
    .line 328
    .line 329
    return-void
.end method

.method public final b()Lfb2;
    .locals 11

    .line 1
    iget-boolean v0, p0, Leb2;->j:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    new-instance v3, Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object v0, p0, Lab2;->a:Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Leb2;->i:Lnb2;

    .line 14
    .line 15
    iget-boolean v2, v0, Lnb2;->a:Z

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v2, Lsj2;

    .line 21
    .line 22
    invoke-direct {v2, v0}, Lsj2;-><init>(Lnb2;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v3, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object v0, p0, Leb2;->l:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    new-instance v1, Lkv0;

    .line 37
    .line 38
    const/4 v0, 0x4

    .line 39
    invoke-direct {v1, p0, v0}, Lkv0;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    :cond_1
    move-object v8, v1

    .line 43
    new-instance v2, Lfb2;

    .line 44
    .line 45
    new-instance v4, Ljava/util/ArrayList;

    .line 46
    .line 47
    iget-object v0, p0, Lab2;->c:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 50
    .line 51
    .line 52
    new-instance v5, Ljava/util/ArrayList;

    .line 53
    .line 54
    iget-object v0, p0, Lab2;->d:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 57
    .line 58
    .line 59
    new-instance v6, Ljava/util/ArrayList;

    .line 60
    .line 61
    iget-object v0, p0, Lab2;->e:Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lab2;->b:Lir;

    .line 67
    .line 68
    invoke-virtual {v0}, Lir;->i()Ljr;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    iget-object v9, p0, Lab2;->g:Landroid/hardware/camera2/params/InputConfiguration;

    .line 73
    .line 74
    iget-object v10, p0, Lab2;->h:Lmg;

    .line 75
    .line 76
    invoke-direct/range {v2 .. v10}, Lfb2;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljr;Ldb2;Landroid/hardware/camera2/params/InputConfiguration;Lmg;)V

    .line 77
    .line 78
    .line 79
    return-object v2

    .line 80
    :cond_2
    const-string p0, "Unsupported session configuration combination"

    .line 81
    .line 82
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-object v1
.end method

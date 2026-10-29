.class public final Lf31;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lej0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lf31;->a:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p2, p0, Lf31;->b:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p3, p0, Lf31;->c:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p4, p0, Lf31;->d:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object p5, p0, Lf31;->e:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object p6, p0, Lf31;->f:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object p7, p0, Lf31;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object p8, p0, Lf31;->h:Ljava/lang/Object;

    .line 28
    .line 29
    iput-object p9, p0, Lf31;->i:Ljava/lang/Object;

    .line 30
    .line 31
    return-void
.end method

.method public static a(Ljava/util/Map;Ljava/util/List;Lq50;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
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
    check-cast v0, Ljava/lang/String;

    .line 16
    .line 17
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/util/List;

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    new-instance v1, Ljava/util/LinkedList;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-interface {v1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-void
.end method

.method public static d(Ljava/util/HashMap;Ljava/util/List;Lq50;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    :goto_0
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
    check-cast v0, Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/util/List;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-interface {v0, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return-void
.end method


# virtual methods
.method public declared-synchronized b(Lyq2;)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    iget-object v0, p1, Lyq2;->a:Ljava/lang/String;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p1, Lyq2;->b:Ljava/lang/String;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    new-instance v1, Ljava/util/LinkedList;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lf31;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/util/List;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lf31;->f:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljava/util/HashMap;

    .line 37
    .line 38
    const-string v2, "*"

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/util/List;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_3

    .line 56
    .line 57
    const-string v0, "f31"

    .line 58
    .line 59
    new-instance v2, Lji1;

    .line 60
    .line 61
    const/16 v3, 0x9

    .line 62
    .line 63
    invoke-direct {v2, v3, v1, p1}, Lji1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const/4 p1, 0x0

    .line 67
    invoke-static {v0, p1, v2}, Lmf0;->a(Ljava/lang/String;ZLjava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    :cond_3
    monitor-exit p0

    .line 71
    return-void

    .line 72
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    throw p1
.end method

.method public c(Lyg;I)V
    .locals 46

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    iget-object v2, v3, Lyg;->b:[B

    .line 6
    .line 7
    iget-object v0, v1, Lf31;->f:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v6, v0

    .line 10
    check-cast v6, Ls52;

    .line 11
    .line 12
    iget-object v0, v1, Lf31;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lei1;

    .line 15
    .line 16
    iget-object v4, v3, Lyg;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v4}, Lei1;->a(Ljava/lang/String;)Lvr2;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    move-object v9, v4

    .line 23
    const-wide/16 v4, 0x0

    .line 24
    .line 25
    :goto_0
    new-instance v0, Luy2;

    .line 26
    .line 27
    const/4 v10, 0x0

    .line 28
    invoke-direct {v0, v1, v3, v10}, Luy2;-><init>(Lf31;Lyg;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v6, v0}, Ls52;->k(Lbk2;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1f

    .line 42
    .line 43
    new-instance v0, Luy2;

    .line 44
    .line 45
    const/4 v11, 0x1

    .line 46
    invoke-direct {v0, v1, v3, v11}, Luy2;-><init>(Lf31;Lyg;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v6, v0}, Ls52;->k(Lbk2;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    move-object v12, v0

    .line 54
    check-cast v12, Ljava/lang/Iterable;

    .line 55
    .line 56
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_0

    .line 65
    .line 66
    return-void

    .line 67
    :cond_0
    const/4 v0, 0x3

    .line 68
    const-wide/16 v14, -0x1

    .line 69
    .line 70
    if-nez v9, :cond_1

    .line 71
    .line 72
    const-string v8, "Uploader"

    .line 73
    .line 74
    const-string v10, "Unknown backend for %s, deleting event batch for it..."

    .line 75
    .line 76
    invoke-static {v8, v10, v3}, Lpy0;->P(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    new-instance v8, Lbf;

    .line 80
    .line 81
    invoke-direct {v8, v0, v14, v15}, Lbf;-><init>(IJ)V

    .line 82
    .line 83
    .line 84
    move-object/from16 v32, v2

    .line 85
    .line 86
    move-wide/from16 v33, v4

    .line 87
    .line 88
    :goto_1
    const/4 v3, 0x2

    .line 89
    goto/16 :goto_12

    .line 90
    .line 91
    :cond_1
    new-instance v8, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v16

    .line 100
    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v17

    .line 104
    if-eqz v17, :cond_2

    .line 105
    .line 106
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v17

    .line 110
    move-object/from16 v13, v17

    .line 111
    .line 112
    check-cast v13, Lhg;

    .line 113
    .line 114
    iget-object v13, v13, Lhg;->c:Lrf;

    .line 115
    .line 116
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_2
    const-string v13, "proto"

    .line 121
    .line 122
    if-eqz v2, :cond_3

    .line 123
    .line 124
    iget-object v7, v1, Lf31;->i:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v7, Ls52;

    .line 127
    .line 128
    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    new-instance v11, Lty2;

    .line 132
    .line 133
    invoke-direct {v11, v7, v10}, Lty2;-><init>(Ls52;I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v6, v11}, Ls52;->k(Lbk2;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    check-cast v7, Ltv;

    .line 141
    .line 142
    new-instance v11, Lxy1;

    .line 143
    .line 144
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 145
    .line 146
    .line 147
    new-instance v0, Ljava/util/HashMap;

    .line 148
    .line 149
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 150
    .line 151
    .line 152
    iput-object v0, v11, Lxy1;->f:Ljava/lang/Object;

    .line 153
    .line 154
    iget-object v0, v1, Lf31;->g:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v0, Lyv;

    .line 157
    .line 158
    invoke-interface {v0}, Lyv;->a()J

    .line 159
    .line 160
    .line 161
    move-result-wide v18

    .line 162
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    iput-object v0, v11, Lxy1;->d:Ljava/lang/Object;

    .line 167
    .line 168
    iget-object v0, v1, Lf31;->h:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v0, Lyv;

    .line 171
    .line 172
    invoke-interface {v0}, Lyv;->a()J

    .line 173
    .line 174
    .line 175
    move-result-wide v18

    .line 176
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    iput-object v0, v11, Lxy1;->e:Ljava/lang/Object;

    .line 181
    .line 182
    const-string v0, "GDT_CLIENT_METRICS"

    .line 183
    .line 184
    iput-object v0, v11, Lxy1;->a:Ljava/lang/Object;

    .line 185
    .line 186
    new-instance v0, Lsd0;

    .line 187
    .line 188
    new-instance v14, Lvd0;

    .line 189
    .line 190
    invoke-direct {v14, v13}, Lvd0;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    sget-object v15, Lvy1;->a:Lac1;

    .line 197
    .line 198
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    new-instance v10, Ljava/io/ByteArrayOutputStream;

    .line 202
    .line 203
    invoke-direct {v10}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 204
    .line 205
    .line 206
    :try_start_0
    invoke-virtual {v15, v10, v7}, Lac1;->j(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 207
    .line 208
    .line 209
    :catch_0
    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    invoke-direct {v0, v14, v7}, Lsd0;-><init>(Lvd0;[B)V

    .line 214
    .line 215
    .line 216
    iput-object v0, v11, Lxy1;->c:Ljava/lang/Object;

    .line 217
    .line 218
    invoke-virtual {v11}, Lxy1;->d()Lrf;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    move-object v7, v9

    .line 223
    check-cast v7, Las;

    .line 224
    .line 225
    invoke-virtual {v7, v0}, Las;->a(Lrf;)Lrf;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    :cond_3
    move-object v0, v9

    .line 233
    check-cast v0, Las;

    .line 234
    .line 235
    new-instance v7, Ljava/util/HashMap;

    .line 236
    .line 237
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 245
    .line 246
    .line 247
    move-result v10

    .line 248
    if-eqz v10, :cond_5

    .line 249
    .line 250
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v10

    .line 254
    check-cast v10, Lrf;

    .line 255
    .line 256
    iget-object v11, v10, Lrf;->a:Ljava/lang/String;

    .line 257
    .line 258
    invoke-virtual {v7, v11}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v14

    .line 262
    if-nez v14, :cond_4

    .line 263
    .line 264
    new-instance v14, Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    invoke-virtual {v7, v11, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_4
    invoke-virtual {v7, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v11

    .line 280
    check-cast v11, Ljava/util/List;

    .line 281
    .line 282
    invoke-interface {v11, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    goto :goto_3

    .line 286
    :cond_5
    new-instance v8, Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v7}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 300
    .line 301
    .line 302
    move-result v10

    .line 303
    const-string v15, "CctTransportBackend"

    .line 304
    .line 305
    if-eqz v10, :cond_10

    .line 306
    .line 307
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v10

    .line 311
    check-cast v10, Ljava/util/Map$Entry;

    .line 312
    .line 313
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v21

    .line 317
    move-object/from16 v11, v21

    .line 318
    .line 319
    check-cast v11, Ljava/util/List;

    .line 320
    .line 321
    const/4 v14, 0x0

    .line 322
    invoke-interface {v11, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v11

    .line 326
    check-cast v11, Lrf;

    .line 327
    .line 328
    sget-object v20, Lb02;->a:Lb02;

    .line 329
    .line 330
    iget-object v14, v0, Las;->f:Lyv;

    .line 331
    .line 332
    invoke-interface {v14}, Lyv;->a()J

    .line 333
    .line 334
    .line 335
    move-result-wide v24

    .line 336
    iget-object v14, v0, Las;->e:Lyv;

    .line 337
    .line 338
    invoke-interface {v14}, Lyv;->a()J

    .line 339
    .line 340
    .line 341
    move-result-wide v26

    .line 342
    const-string v14, "sdk-version"

    .line 343
    .line 344
    invoke-virtual {v11, v14}, Lrf;->b(Ljava/lang/String;)I

    .line 345
    .line 346
    .line 347
    move-result v14

    .line 348
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 349
    .line 350
    .line 351
    move-result-object v29

    .line 352
    const-string v14, "model"

    .line 353
    .line 354
    invoke-virtual {v11, v14}, Lrf;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v30

    .line 358
    const-string v14, "hardware"

    .line 359
    .line 360
    invoke-virtual {v11, v14}, Lrf;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v31

    .line 364
    const-string v14, "device"

    .line 365
    .line 366
    invoke-virtual {v11, v14}, Lrf;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v32

    .line 370
    const-string v14, "product"

    .line 371
    .line 372
    invoke-virtual {v11, v14}, Lrf;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v33

    .line 376
    const-string v14, "os-uild"

    .line 377
    .line 378
    invoke-virtual {v11, v14}, Lrf;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v34

    .line 382
    const-string v14, "manufacturer"

    .line 383
    .line 384
    invoke-virtual {v11, v14}, Lrf;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v35

    .line 388
    const-string v14, "fingerprint"

    .line 389
    .line 390
    invoke-virtual {v11, v14}, Lrf;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v36

    .line 394
    const-string v14, "country"

    .line 395
    .line 396
    invoke-virtual {v11, v14}, Lrf;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v38

    .line 400
    const-string v14, "locale"

    .line 401
    .line 402
    invoke-virtual {v11, v14}, Lrf;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v37

    .line 406
    const-string v14, "mcc_mnc"

    .line 407
    .line 408
    invoke-virtual {v11, v14}, Lrf;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v39

    .line 412
    const-string v14, "application_build"

    .line 413
    .line 414
    invoke-virtual {v11, v14}, Lrf;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v40

    .line 418
    new-instance v28, Lze;

    .line 419
    .line 420
    invoke-direct/range {v28 .. v40}, Lze;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    move-object/from16 v11, v28

    .line 424
    .line 425
    new-instance v14, Lkf;

    .line 426
    .line 427
    invoke-direct {v14, v11}, Lkf;-><init>(Lze;)V

    .line 428
    .line 429
    .line 430
    :try_start_1
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v11

    .line 434
    check-cast v11, Ljava/lang/String;

    .line 435
    .line 436
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 437
    .line 438
    .line 439
    move-result v11

    .line 440
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 441
    .line 442
    .line 443
    move-result-object v11
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 444
    move-object/from16 v29, v11

    .line 445
    .line 446
    const/16 v30, 0x0

    .line 447
    .line 448
    goto :goto_5

    .line 449
    :catch_1
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v11

    .line 453
    check-cast v11, Ljava/lang/String;

    .line 454
    .line 455
    move-object/from16 v30, v11

    .line 456
    .line 457
    const/16 v29, 0x0

    .line 458
    .line 459
    :goto_5
    new-instance v11, Ljava/util/ArrayList;

    .line 460
    .line 461
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 462
    .line 463
    .line 464
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v10

    .line 468
    check-cast v10, Ljava/util/List;

    .line 469
    .line 470
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 471
    .line 472
    .line 473
    move-result-object v10

    .line 474
    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 475
    .line 476
    .line 477
    move-result v22

    .line 478
    if-eqz v22, :cond_f

    .line 479
    .line 480
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v22

    .line 484
    move-object/from16 v1, v22

    .line 485
    .line 486
    check-cast v1, Lrf;

    .line 487
    .line 488
    move-object/from16 v32, v2

    .line 489
    .line 490
    iget-object v2, v1, Lrf;->c:Lsd0;

    .line 491
    .line 492
    iget-object v3, v2, Lsd0;->a:Lvd0;

    .line 493
    .line 494
    iget-object v2, v2, Lsd0;->b:[B

    .line 495
    .line 496
    move-wide/from16 v33, v4

    .line 497
    .line 498
    new-instance v4, Lvd0;

    .line 499
    .line 500
    invoke-direct {v4, v13}, Lvd0;-><init>(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v3, v4}, Lvd0;->equals(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v4

    .line 507
    if-eqz v4, :cond_6

    .line 508
    .line 509
    new-instance v3, Leq2;

    .line 510
    .line 511
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 512
    .line 513
    .line 514
    iput-object v2, v3, Leq2;->d:Ljava/lang/Object;

    .line 515
    .line 516
    goto :goto_7

    .line 517
    :cond_6
    new-instance v4, Lvd0;

    .line 518
    .line 519
    const-string v5, "json"

    .line 520
    .line 521
    invoke-direct {v4, v5}, Lvd0;-><init>(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v3, v4}, Lvd0;->equals(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result v4

    .line 528
    if-eqz v4, :cond_e

    .line 529
    .line 530
    new-instance v3, Ljava/lang/String;

    .line 531
    .line 532
    const-string v4, "UTF-8"

    .line 533
    .line 534
    invoke-static {v4}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 535
    .line 536
    .line 537
    move-result-object v4

    .line 538
    invoke-direct {v3, v2, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 539
    .line 540
    .line 541
    new-instance v2, Leq2;

    .line 542
    .line 543
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 544
    .line 545
    .line 546
    iput-object v3, v2, Leq2;->e:Ljava/lang/Object;

    .line 547
    .line 548
    move-object v3, v2

    .line 549
    :goto_7
    iget-wide v4, v1, Lrf;->d:J

    .line 550
    .line 551
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    iput-object v2, v3, Leq2;->a:Ljava/lang/Object;

    .line 556
    .line 557
    iget-wide v4, v1, Lrf;->e:J

    .line 558
    .line 559
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 560
    .line 561
    .line 562
    move-result-object v2

    .line 563
    iput-object v2, v3, Leq2;->c:Ljava/lang/Object;

    .line 564
    .line 565
    const-string v2, "tz-offset"

    .line 566
    .line 567
    iget-object v4, v1, Lrf;->f:Ljava/util/Map;

    .line 568
    .line 569
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    check-cast v2, Ljava/lang/String;

    .line 574
    .line 575
    if-nez v2, :cond_7

    .line 576
    .line 577
    const-wide/16 v4, 0x0

    .line 578
    .line 579
    goto :goto_8

    .line 580
    :cond_7
    invoke-static {v2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 585
    .line 586
    .line 587
    move-result-wide v4

    .line 588
    :goto_8
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    iput-object v2, v3, Leq2;->f:Ljava/lang/Object;

    .line 593
    .line 594
    const-string v2, "net-type"

    .line 595
    .line 596
    invoke-virtual {v1, v2}, Lrf;->b(Ljava/lang/String;)I

    .line 597
    .line 598
    .line 599
    move-result v2

    .line 600
    sget-object v4, Lwm1;->a:Landroid/util/SparseArray;

    .line 601
    .line 602
    invoke-virtual {v4, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v2

    .line 606
    check-cast v2, Lwm1;

    .line 607
    .line 608
    const-string v4, "mobile-subtype"

    .line 609
    .line 610
    invoke-virtual {v1, v4}, Lrf;->b(Ljava/lang/String;)I

    .line 611
    .line 612
    .line 613
    move-result v4

    .line 614
    sget-object v5, Lvm1;->a:Landroid/util/SparseArray;

    .line 615
    .line 616
    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v4

    .line 620
    check-cast v4, Lvm1;

    .line 621
    .line 622
    new-instance v5, Leg;

    .line 623
    .line 624
    invoke-direct {v5, v2, v4}, Leg;-><init>(Lwm1;Lvm1;)V

    .line 625
    .line 626
    .line 627
    iput-object v5, v3, Leq2;->i:Ljava/lang/Object;

    .line 628
    .line 629
    iget-object v1, v1, Lrf;->b:Ljava/lang/Integer;

    .line 630
    .line 631
    if-eqz v1, :cond_8

    .line 632
    .line 633
    iput-object v1, v3, Leq2;->b:Ljava/lang/Object;

    .line 634
    .line 635
    :cond_8
    iget-object v1, v3, Leq2;->a:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v1, Ljava/lang/Long;

    .line 638
    .line 639
    if-nez v1, :cond_9

    .line 640
    .line 641
    const-string v1, " eventTimeMs"

    .line 642
    .line 643
    goto :goto_9

    .line 644
    :cond_9
    const-string v1, ""

    .line 645
    .line 646
    :goto_9
    iget-object v2, v3, Leq2;->c:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v2, Ljava/lang/Long;

    .line 649
    .line 650
    if-nez v2, :cond_a

    .line 651
    .line 652
    const-string v2, " eventUptimeMs"

    .line 653
    .line 654
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v1

    .line 658
    :cond_a
    iget-object v2, v3, Leq2;->f:Ljava/lang/Object;

    .line 659
    .line 660
    check-cast v2, Ljava/lang/Long;

    .line 661
    .line 662
    if-nez v2, :cond_b

    .line 663
    .line 664
    const-string v2, " timezoneOffsetSeconds"

    .line 665
    .line 666
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v1

    .line 670
    :cond_b
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 671
    .line 672
    .line 673
    move-result v2

    .line 674
    if-eqz v2, :cond_d

    .line 675
    .line 676
    new-instance v35, Lbg;

    .line 677
    .line 678
    iget-object v1, v3, Leq2;->a:Ljava/lang/Object;

    .line 679
    .line 680
    check-cast v1, Ljava/lang/Long;

    .line 681
    .line 682
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 683
    .line 684
    .line 685
    move-result-wide v36

    .line 686
    iget-object v1, v3, Leq2;->b:Ljava/lang/Object;

    .line 687
    .line 688
    move-object/from16 v38, v1

    .line 689
    .line 690
    check-cast v38, Ljava/lang/Integer;

    .line 691
    .line 692
    iget-object v1, v3, Leq2;->c:Ljava/lang/Object;

    .line 693
    .line 694
    check-cast v1, Ljava/lang/Long;

    .line 695
    .line 696
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 697
    .line 698
    .line 699
    move-result-wide v39

    .line 700
    iget-object v1, v3, Leq2;->d:Ljava/lang/Object;

    .line 701
    .line 702
    move-object/from16 v41, v1

    .line 703
    .line 704
    check-cast v41, [B

    .line 705
    .line 706
    iget-object v1, v3, Leq2;->e:Ljava/lang/Object;

    .line 707
    .line 708
    move-object/from16 v42, v1

    .line 709
    .line 710
    check-cast v42, Ljava/lang/String;

    .line 711
    .line 712
    iget-object v1, v3, Leq2;->f:Ljava/lang/Object;

    .line 713
    .line 714
    check-cast v1, Ljava/lang/Long;

    .line 715
    .line 716
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 717
    .line 718
    .line 719
    move-result-wide v43

    .line 720
    iget-object v1, v3, Leq2;->i:Ljava/lang/Object;

    .line 721
    .line 722
    move-object/from16 v45, v1

    .line 723
    .line 724
    check-cast v45, Leg;

    .line 725
    .line 726
    invoke-direct/range {v35 .. v45}, Lbg;-><init>(JLjava/lang/Integer;J[BLjava/lang/String;JLxm1;)V

    .line 727
    .line 728
    .line 729
    move-object/from16 v1, v35

    .line 730
    .line 731
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 732
    .line 733
    .line 734
    :cond_c
    :goto_a
    move-object/from16 v1, p0

    .line 735
    .line 736
    move-object/from16 v3, p1

    .line 737
    .line 738
    move-object/from16 v2, v32

    .line 739
    .line 740
    move-wide/from16 v4, v33

    .line 741
    .line 742
    goto/16 :goto_6

    .line 743
    .line 744
    :cond_d
    const-string v0, "Missing required properties:"

    .line 745
    .line 746
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    invoke-static {v0}, Lf42;->l(Ljava/lang/String;)V

    .line 751
    .line 752
    .line 753
    return-void

    .line 754
    :cond_e
    invoke-static {v15}, Lpy0;->l0(Ljava/lang/String;)Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v1

    .line 758
    const/4 v2, 0x5

    .line 759
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 760
    .line 761
    .line 762
    move-result v4

    .line 763
    if-eqz v4, :cond_c

    .line 764
    .line 765
    new-instance v4, Ljava/lang/StringBuilder;

    .line 766
    .line 767
    const-string v5, "Received event of unsupported encoding "

    .line 768
    .line 769
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 770
    .line 771
    .line 772
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 773
    .line 774
    .line 775
    const-string v3, ". Skipping..."

    .line 776
    .line 777
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v3

    .line 784
    invoke-static {v1, v3}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 785
    .line 786
    .line 787
    goto :goto_a

    .line 788
    :cond_f
    move-object/from16 v32, v2

    .line 789
    .line 790
    move-wide/from16 v33, v4

    .line 791
    .line 792
    new-instance v23, Lcg;

    .line 793
    .line 794
    move-object/from16 v31, v11

    .line 795
    .line 796
    move-object/from16 v28, v14

    .line 797
    .line 798
    invoke-direct/range {v23 .. v31}, Lcg;-><init>(JJLkf;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 799
    .line 800
    .line 801
    move-object/from16 v1, v23

    .line 802
    .line 803
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    move-object/from16 v1, p0

    .line 807
    .line 808
    move-object/from16 v3, p1

    .line 809
    .line 810
    goto/16 :goto_4

    .line 811
    .line 812
    :cond_10
    move-object/from16 v32, v2

    .line 813
    .line 814
    move-wide/from16 v33, v4

    .line 815
    .line 816
    const/4 v2, 0x5

    .line 817
    new-instance v1, Lcf;

    .line 818
    .line 819
    invoke-direct {v1, v8}, Lcf;-><init>(Ljava/util/ArrayList;)V

    .line 820
    .line 821
    .line 822
    iget-object v3, v0, Las;->d:Ljava/net/URL;

    .line 823
    .line 824
    if-eqz v32, :cond_12

    .line 825
    .line 826
    :try_start_2
    invoke-static/range {v32 .. v32}, Lgm;->a([B)Lgm;

    .line 827
    .line 828
    .line 829
    move-result-object v3

    .line 830
    iget-object v4, v3, Lgm;->b:Ljava/lang/String;

    .line 831
    .line 832
    if-eqz v4, :cond_11

    .line 833
    .line 834
    goto :goto_b

    .line 835
    :cond_11
    const/4 v4, 0x0

    .line 836
    :goto_b
    iget-object v3, v3, Lgm;->a:Ljava/lang/String;

    .line 837
    .line 838
    invoke-static {v3}, Las;->b(Ljava/lang/String;)Ljava/net/URL;

    .line 839
    .line 840
    .line 841
    move-result-object v3
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 842
    move-object v5, v4

    .line 843
    :goto_c
    const/4 v4, 0x3

    .line 844
    goto :goto_e

    .line 845
    :catch_2
    new-instance v0, Lbf;

    .line 846
    .line 847
    const-wide/16 v1, -0x1

    .line 848
    .line 849
    const/4 v4, 0x3

    .line 850
    invoke-direct {v0, v4, v1, v2}, Lbf;-><init>(IJ)V

    .line 851
    .line 852
    .line 853
    :goto_d
    move-object v8, v0

    .line 854
    goto/16 :goto_1

    .line 855
    .line 856
    :cond_12
    const/4 v5, 0x0

    .line 857
    goto :goto_c

    .line 858
    :goto_e
    :try_start_3
    new-instance v7, Lec;

    .line 859
    .line 860
    const/16 v8, 0xf

    .line 861
    .line 862
    invoke-direct {v7, v8, v3, v1, v5}, Lec;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 863
    .line 864
    .line 865
    new-instance v1, Lx6;

    .line 866
    .line 867
    invoke-direct {v1, v0, v4}, Lx6;-><init>(Ljava/lang/Object;I)V

    .line 868
    .line 869
    .line 870
    move v14, v2

    .line 871
    :cond_13
    invoke-virtual {v1, v7}, Lx6;->c(Lec;)Lbd;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    iget-object v2, v0, Lbd;->c:Ljava/lang/Object;

    .line 876
    .line 877
    check-cast v2, Ljava/net/URL;

    .line 878
    .line 879
    if-eqz v2, :cond_14

    .line 880
    .line 881
    const-string v3, "Following redirect to: %s"

    .line 882
    .line 883
    invoke-static {v15, v3, v2}, Lpy0;->P(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 884
    .line 885
    .line 886
    new-instance v3, Lec;

    .line 887
    .line 888
    iget-object v4, v7, Lec;->c:Ljava/lang/Object;

    .line 889
    .line 890
    check-cast v4, Lcf;

    .line 891
    .line 892
    iget-object v5, v7, Lec;->d:Ljava/lang/Object;

    .line 893
    .line 894
    check-cast v5, Ljava/lang/String;

    .line 895
    .line 896
    invoke-direct {v3, v8, v2, v4, v5}, Lec;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 897
    .line 898
    .line 899
    move-object v7, v3

    .line 900
    goto :goto_f

    .line 901
    :cond_14
    const/4 v7, 0x0

    .line 902
    :goto_f
    if-eqz v7, :cond_15

    .line 903
    .line 904
    add-int/lit8 v14, v14, -0x1

    .line 905
    .line 906
    const/4 v2, 0x1

    .line 907
    if-ge v14, v2, :cond_13

    .line 908
    .line 909
    :cond_15
    iget v1, v0, Lbd;->a:I

    .line 910
    .line 911
    const/16 v2, 0xc8

    .line 912
    .line 913
    if-ne v1, v2, :cond_16

    .line 914
    .line 915
    iget-wide v0, v0, Lbd;->b:J

    .line 916
    .line 917
    new-instance v2, Lbf;

    .line 918
    .line 919
    const/4 v3, 0x1

    .line 920
    invoke-direct {v2, v3, v0, v1}, Lbf;-><init>(IJ)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 921
    .line 922
    .line 923
    move-object v8, v2

    .line 924
    goto/16 :goto_1

    .line 925
    .line 926
    :catch_3
    move-exception v0

    .line 927
    goto :goto_11

    .line 928
    :cond_16
    const/16 v0, 0x1f4

    .line 929
    .line 930
    if-ge v1, v0, :cond_17

    .line 931
    .line 932
    const/16 v0, 0x194

    .line 933
    .line 934
    if-ne v1, v0, :cond_18

    .line 935
    .line 936
    :cond_17
    const-wide/16 v1, -0x1

    .line 937
    .line 938
    goto :goto_10

    .line 939
    :cond_18
    const/16 v0, 0x190

    .line 940
    .line 941
    if-ne v1, v0, :cond_19

    .line 942
    .line 943
    :try_start_4
    new-instance v0, Lbf;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    .line 944
    .line 945
    const-wide/16 v1, -0x1

    .line 946
    .line 947
    const/4 v3, 0x4

    .line 948
    :try_start_5
    invoke-direct {v0, v3, v1, v2}, Lbf;-><init>(IJ)V

    .line 949
    .line 950
    .line 951
    goto :goto_d

    .line 952
    :catch_4
    move-exception v0

    .line 953
    const-wide/16 v1, -0x1

    .line 954
    .line 955
    goto :goto_11

    .line 956
    :cond_19
    const-wide/16 v1, -0x1

    .line 957
    .line 958
    new-instance v0, Lbf;

    .line 959
    .line 960
    const/4 v4, 0x3

    .line 961
    invoke-direct {v0, v4, v1, v2}, Lbf;-><init>(IJ)V

    .line 962
    .line 963
    .line 964
    goto :goto_d

    .line 965
    :goto_10
    new-instance v0, Lbf;

    .line 966
    .line 967
    const/4 v3, 0x2

    .line 968
    invoke-direct {v0, v3, v1, v2}, Lbf;-><init>(IJ)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 969
    .line 970
    .line 971
    goto :goto_d

    .line 972
    :goto_11
    const-string v1, "Could not make request to the backend"

    .line 973
    .line 974
    invoke-static {v15, v1, v0}, Lpy0;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 975
    .line 976
    .line 977
    new-instance v0, Lbf;

    .line 978
    .line 979
    const-wide/16 v1, -0x1

    .line 980
    .line 981
    const/4 v3, 0x2

    .line 982
    invoke-direct {v0, v3, v1, v2}, Lbf;-><init>(IJ)V

    .line 983
    .line 984
    .line 985
    move-object v8, v0

    .line 986
    :goto_12
    iget v0, v8, Lbf;->a:I

    .line 987
    .line 988
    if-ne v0, v3, :cond_1a

    .line 989
    .line 990
    new-instance v0, Lh70;

    .line 991
    .line 992
    move-object/from16 v1, p0

    .line 993
    .line 994
    move-object/from16 v3, p1

    .line 995
    .line 996
    move-object v2, v12

    .line 997
    move-wide/from16 v4, v33

    .line 998
    .line 999
    invoke-direct/range {v0 .. v5}, Lh70;-><init>(Lf31;Ljava/lang/Iterable;Lyg;J)V

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {v6, v0}, Ls52;->k(Lbk2;)Ljava/lang/Object;

    .line 1003
    .line 1004
    .line 1005
    iget-object v0, v1, Lf31;->d:Ljava/lang/Object;

    .line 1006
    .line 1007
    check-cast v0, Lec;

    .line 1008
    .line 1009
    const/4 v2, 0x1

    .line 1010
    add-int/lit8 v1, p2, 0x1

    .line 1011
    .line 1012
    invoke-virtual {v0, v3, v1, v2}, Lec;->K(Lyg;IZ)V

    .line 1013
    .line 1014
    .line 1015
    return-void

    .line 1016
    :cond_1a
    move-object/from16 v1, p0

    .line 1017
    .line 1018
    move-object/from16 v3, p1

    .line 1019
    .line 1020
    move-object v7, v12

    .line 1021
    move-wide/from16 v4, v33

    .line 1022
    .line 1023
    const/4 v2, 0x1

    .line 1024
    new-instance v10, Lpn;

    .line 1025
    .line 1026
    const/16 v11, 0x11

    .line 1027
    .line 1028
    invoke-direct {v10, v11, v1, v7}, Lpn;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v6, v10}, Ls52;->k(Lbk2;)Ljava/lang/Object;

    .line 1032
    .line 1033
    .line 1034
    if-ne v0, v2, :cond_1b

    .line 1035
    .line 1036
    iget-wide v7, v8, Lbf;->b:J

    .line 1037
    .line 1038
    invoke-static {v4, v5, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 1039
    .line 1040
    .line 1041
    move-result-wide v4

    .line 1042
    if-eqz v32, :cond_1e

    .line 1043
    .line 1044
    new-instance v0, Lx6;

    .line 1045
    .line 1046
    const/16 v2, 0x10

    .line 1047
    .line 1048
    invoke-direct {v0, v1, v2}, Lx6;-><init>(Ljava/lang/Object;I)V

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v6, v0}, Ls52;->k(Lbk2;)Ljava/lang/Object;

    .line 1052
    .line 1053
    .line 1054
    goto :goto_14

    .line 1055
    :cond_1b
    const/4 v2, 0x4

    .line 1056
    if-ne v0, v2, :cond_1e

    .line 1057
    .line 1058
    new-instance v0, Ljava/util/HashMap;

    .line 1059
    .line 1060
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1061
    .line 1062
    .line 1063
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v2

    .line 1067
    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1068
    .line 1069
    .line 1070
    move-result v7

    .line 1071
    if-eqz v7, :cond_1d

    .line 1072
    .line 1073
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v7

    .line 1077
    check-cast v7, Lhg;

    .line 1078
    .line 1079
    iget-object v7, v7, Lhg;->c:Lrf;

    .line 1080
    .line 1081
    iget-object v7, v7, Lrf;->a:Ljava/lang/String;

    .line 1082
    .line 1083
    invoke-virtual {v0, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 1084
    .line 1085
    .line 1086
    move-result v8

    .line 1087
    if-nez v8, :cond_1c

    .line 1088
    .line 1089
    const/16 v17, 0x1

    .line 1090
    .line 1091
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v8

    .line 1095
    invoke-virtual {v0, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1096
    .line 1097
    .line 1098
    goto :goto_13

    .line 1099
    :cond_1c
    const/16 v17, 0x1

    .line 1100
    .line 1101
    invoke-virtual {v0, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v8

    .line 1105
    check-cast v8, Ljava/lang/Integer;

    .line 1106
    .line 1107
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 1108
    .line 1109
    .line 1110
    move-result v8

    .line 1111
    add-int/lit8 v8, v8, 0x1

    .line 1112
    .line 1113
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v8

    .line 1117
    invoke-virtual {v0, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1118
    .line 1119
    .line 1120
    goto :goto_13

    .line 1121
    :cond_1d
    new-instance v2, Lpn;

    .line 1122
    .line 1123
    const/16 v7, 0x12

    .line 1124
    .line 1125
    invoke-direct {v2, v7, v1, v0}, Lpn;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual {v6, v2}, Ls52;->k(Lbk2;)Ljava/lang/Object;

    .line 1129
    .line 1130
    .line 1131
    :cond_1e
    :goto_14
    move-object/from16 v2, v32

    .line 1132
    .line 1133
    goto/16 :goto_0

    .line 1134
    .line 1135
    :cond_1f
    new-instance v0, Lbp0;

    .line 1136
    .line 1137
    invoke-direct {v0, v1, v4, v5, v3}, Lbp0;-><init>(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual {v6, v0}, Ls52;->k(Lbk2;)Ljava/lang/Object;

    .line 1141
    .line 1142
    .line 1143
    return-void
.end method

.method public declared-synchronized e(Ljava/lang/String;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lf31;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lq50;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :cond_0
    :try_start_1
    iget-object v1, p0, Lf31;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lf31;->i:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lfs0;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v1, v1, Lfs0;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lf31;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-virtual {v0}, Lq50;->h()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {p1, v1, v0}, Lf31;->d(Ljava/util/HashMap;Ljava/util/List;Lq50;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lf31;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-virtual {v0}, Lq50;->d()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {p1, v1, v0}, Lf31;->d(Ljava/util/HashMap;Ljava/util/List;Lq50;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lf31;->e:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Ljava/util/HashMap;

    .line 65
    .line 66
    invoke-virtual {v0}, Lq50;->g()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {p1, v1, v0}, Lf31;->d(Ljava/util/HashMap;Ljava/util/List;Lq50;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lf31;->f:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-virtual {v0}, Lq50;->c()Lnd0;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {p1, v1, v0}, Lf31;->d(Ljava/util/HashMap;Ljava/util/List;Lq50;)V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lf31;->g:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p1, Ljava/util/HashMap;

    .line 87
    .line 88
    invoke-virtual {v0}, Lq50;->f()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {p1, v1, v0}, Lf31;->d(Ljava/util/HashMap;Ljava/util/List;Lq50;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lf31;->h:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p1, Ljava/util/HashMap;

    .line 98
    .line 99
    invoke-virtual {v0}, Lq50;->e()Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {p1, v1, v0}, Lf31;->d(Ljava/util/HashMap;Ljava/util/List;Lq50;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    .line 105
    .line 106
    monitor-exit p0

    .line 107
    return-void

    .line 108
    :catchall_0
    move-exception p1

    .line 109
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 110
    throw p1
.end method

.method public declared-synchronized f(Lk;)Lfs0;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    instance-of v0, p1, Lm0;

    .line 6
    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    new-instance v0, Ljava/util/LinkedList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lf31;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/util/HashMap;

    .line 17
    .line 18
    move-object v2, p1

    .line 19
    check-cast v2, Lm0;

    .line 20
    .line 21
    invoke-virtual {v2}, Lm0;->d()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/util/List;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_0
    :goto_0
    iget-object v1, p0, Lf31;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Ljava/util/HashMap;

    .line 43
    .line 44
    const-string v2, "*"

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Ljava/util/List;

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_4

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lq50;

    .line 72
    .line 73
    iget-object v2, p0, Lf31;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Ljava/lang/String;

    .line 82
    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    iget-object v3, p0, Lf31;->i:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v3, Lfs0;

    .line 88
    .line 89
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    :try_start_1
    iget-object v4, v3, Lfs0;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v4, Ljava/util/HashMap;

    .line 93
    .line 94
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    check-cast v4, Ltg2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    .line 100
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 101
    goto :goto_2

    .line 102
    :catchall_1
    move-exception p1

    .line 103
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 104
    :try_start_4
    throw p1

    .line 105
    :cond_2
    const/4 v4, 0x0

    .line 106
    :goto_2
    new-instance v3, Ltg2;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 112
    .line 113
    .line 114
    iput-object p1, v3, Ltg2;->a:Lk;

    .line 115
    .line 116
    iput-object v4, v3, Ltg2;->b:Ltg2;

    .line 117
    .line 118
    iput-object v1, v3, Ltg2;->c:Lq50;

    .line 119
    .line 120
    if-eqz v2, :cond_3

    .line 121
    .line 122
    iget-object v1, p0, Lf31;->i:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v1, Lfs0;

    .line 125
    .line 126
    monitor-enter v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 127
    :try_start_5
    iget-object v4, v1, Lfs0;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v4, Ljava/util/HashMap;

    .line 130
    .line 131
    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 132
    .line 133
    .line 134
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 135
    goto :goto_3

    .line 136
    :catchall_2
    move-exception p1

    .line 137
    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 138
    :try_start_8
    throw p1

    .line 139
    :cond_3
    :goto_3
    invoke-virtual {v3}, Ltg2;->a()Lng2;

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_4
    iget-object p1, p0, Lf31;->i:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p1, Lfs0;

    .line 146
    .line 147
    monitor-enter p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 148
    :try_start_9
    new-instance v0, Lfs0;

    .line 149
    .line 150
    const/16 v1, 0x12

    .line 151
    .line 152
    invoke-direct {v0, v1}, Lfs0;-><init>(I)V

    .line 153
    .line 154
    .line 155
    new-instance v1, Ljava/util/HashMap;

    .line 156
    .line 157
    iget-object v2, p1, Lfs0;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v2, Ljava/util/HashMap;

    .line 160
    .line 161
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 162
    .line 163
    .line 164
    iput-object v1, v0, Lfs0;->b:Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 165
    .line 166
    :try_start_a
    monitor-exit p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 167
    monitor-exit p0

    .line 168
    return-object v0

    .line 169
    :catchall_3
    move-exception v0

    .line 170
    :try_start_b
    monitor-exit p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 171
    :try_start_c
    throw v0

    .line 172
    :goto_4
    monitor-exit p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 173
    throw p1
.end method

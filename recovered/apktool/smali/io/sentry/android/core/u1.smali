.class public final Lio/sentry/android/core/u1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/android/core/internal/util/q;
.implements Lio/sentry/x0;


# static fields
.field public static final h:Lio/sentry/u5;


# instance fields
.field public final a:Z

.field public final b:Lio/sentry/util/a;

.field public final c:Lio/sentry/android/core/internal/util/r;

.field public volatile d:Ljava/lang/String;

.field public final e:Ljava/util/TreeSet;

.field public final f:Ljava/util/concurrent/ConcurrentSkipListSet;

.field public g:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lio/sentry/u5;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-direct {v0, v1, v2, v1, v2}, Lio/sentry/u5;-><init>(JJ)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lio/sentry/android/core/u1;->h:Lio/sentry/u5;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/internal/util/r;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/util/a;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/android/core/u1;->b:Lio/sentry/util/a;

    .line 10
    .line 11
    new-instance v0, Ljava/util/TreeSet;

    .line 12
    .line 13
    new-instance v1, Lkl0;

    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    invoke-direct {v1, v2}, Lkl0;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lio/sentry/android/core/u1;->e:Ljava/util/TreeSet;

    .line 23
    .line 24
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lio/sentry/android/core/u1;->f:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 30
    .line 31
    const-wide/32 v0, 0xfe502a

    .line 32
    .line 33
    .line 34
    iput-wide v0, p0, Lio/sentry/android/core/u1;->g:J

    .line 35
    .line 36
    iput-object p2, p0, Lio/sentry/android/core/u1;->c:Lio/sentry/android/core/internal/util/r;

    .line 37
    .line 38
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnablePerformanceV2()Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-eqz p2, :cond_0

    .line 43
    .line 44
    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableFramesTracking()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 p1, 0x0

    .line 53
    :goto_0
    iput-boolean p1, p0, Lio/sentry/android/core/u1;->a:Z

    .line 54
    .line 55
    return-void
.end method

.method public static g(Lio/sentry/t4;)J
    .locals 4

    .line 1
    instance-of v0, p0, Lio/sentry/u5;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lio/sentry/android/core/u1;->h:Lio/sentry/u5;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lio/sentry/t4;->b(Lio/sentry/t4;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    const-wide/32 v2, 0xf4240

    .line 17
    .line 18
    .line 19
    mul-long/2addr v0, v2

    .line 20
    invoke-virtual {p0}, Lio/sentry/t4;->d()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    sub-long/2addr v0, v2

    .line 25
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    sub-long/2addr v2, v0

    .line 30
    return-wide v2
.end method


# virtual methods
.method public final b(JJJJZZF)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lio/sentry/android/core/u1;->f:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0xe10

    .line 10
    .line 11
    if-le v2, v3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-wide v2, 0x41cdcd6500000000L    # 1.0E9

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    move/from16 v4, p11

    .line 20
    .line 21
    float-to-double v4, v4

    .line 22
    div-double/2addr v2, v4

    .line 23
    double-to-long v2, v2

    .line 24
    iput-wide v2, v0, Lio/sentry/android/core/u1;->g:J

    .line 25
    .line 26
    if-nez p9, :cond_2

    .line 27
    .line 28
    if-eqz p10, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :goto_0
    return-void

    .line 32
    :cond_2
    :goto_1
    new-instance v4, Lio/sentry/android/core/t1;

    .line 33
    .line 34
    move-wide/from16 v5, p1

    .line 35
    .line 36
    move-wide/from16 v7, p3

    .line 37
    .line 38
    move-wide/from16 v9, p5

    .line 39
    .line 40
    move-wide/from16 v11, p7

    .line 41
    .line 42
    move/from16 v13, p9

    .line 43
    .line 44
    move/from16 v14, p10

    .line 45
    .line 46
    move-wide v15, v2

    .line 47
    invoke-direct/range {v4 .. v16}, Lio/sentry/android/core/t1;-><init>(JJJJZZJ)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v4}, Ljava/util/concurrent/ConcurrentSkipListSet;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/u1;->b:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/u1;->d:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lio/sentry/android/core/u1;->c:Lio/sentry/android/core/internal/util/r;

    .line 11
    .line 12
    iget-object v2, p0, Lio/sentry/android/core/u1;->d:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lio/sentry/android/core/internal/util/r;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-object v1, p0, Lio/sentry/android/core/u1;->d:Ljava/lang/String;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    iget-object v1, p0, Lio/sentry/android/core/u1;->f:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->clear()V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lio/sentry/android/core/u1;->e:Ljava/util/TreeSet;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/util/TreeSet;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 38
    .line 39
    .line 40
    goto :goto_2

    .line 41
    :catchall_1
    move-exception v0

    .line 42
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    :goto_2
    throw p0
.end method

.method public final e(Lio/sentry/k1;)V
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lio/sentry/android/core/u1;->e:Ljava/util/TreeSet;

    .line 6
    .line 7
    iget-boolean v3, v0, Lio/sentry/android/core/u1;->a:Z

    .line 8
    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    instance-of v3, v1, Lio/sentry/d3;

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    instance-of v3, v1, Lio/sentry/f3;

    .line 18
    .line 19
    if-eqz v3, :cond_2

    .line 20
    .line 21
    return-void

    .line 22
    :cond_2
    iget-object v3, v0, Lio/sentry/android/core/u1;->b:Lio/sentry/util/a;

    .line 23
    .line 24
    invoke-virtual {v3}, Lio/sentry/util/a;->c()V

    .line 25
    .line 26
    .line 27
    :try_start_0
    invoke-virtual {v2, v1}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 31
    if-nez v4, :cond_3

    .line 32
    .line 33
    invoke-virtual {v3}, Lio/sentry/util/a;->close()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_3
    invoke-virtual {v3}, Lio/sentry/util/a;->close()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Lio/sentry/util/a;->c()V

    .line 41
    .line 42
    .line 43
    :try_start_1
    invoke-virtual {v2, v1}, Ljava/util/TreeSet;->remove(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 47
    iget-object v5, v0, Lio/sentry/android/core/u1;->f:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 48
    .line 49
    if-nez v4, :cond_4

    .line 50
    .line 51
    :goto_0
    invoke-virtual {v3}, Lio/sentry/util/a;->close()V

    .line 52
    .line 53
    .line 54
    move-object v13, v2

    .line 55
    move-object/from16 v28, v3

    .line 56
    .line 57
    move-object/from16 v31, v5

    .line 58
    .line 59
    goto/16 :goto_d

    .line 60
    .line 61
    :cond_4
    :try_start_2
    invoke-interface {v1}, Lio/sentry/k1;->t()Lio/sentry/t4;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    if-nez v4, :cond_5

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_5
    invoke-interface {v1}, Lio/sentry/k1;->w()Lio/sentry/t4;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-static {v6}, Lio/sentry/android/core/u1;->g(Lio/sentry/t4;)J

    .line 73
    .line 74
    .line 75
    move-result-wide v6

    .line 76
    invoke-static {v4}, Lio/sentry/android/core/u1;->g(Lio/sentry/t4;)J

    .line 77
    .line 78
    .line 79
    move-result-wide v8

    .line 80
    sub-long v10, v8, v6

    .line 81
    .line 82
    const-wide/16 v12, 0x0

    .line 83
    .line 84
    cmp-long v4, v10, v12

    .line 85
    .line 86
    if-gtz v4, :cond_6

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_6
    iget-wide v14, v0, Lio/sentry/android/core/u1;->g:J

    .line 90
    .line 91
    invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentSkipListSet;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    const-wide/32 v16, 0x29b92700

    .line 96
    .line 97
    .line 98
    const/16 v18, 0x1

    .line 99
    .line 100
    const/16 v19, 0x0

    .line 101
    .line 102
    if-nez v4, :cond_12

    .line 103
    .line 104
    new-instance v4, Lio/sentry/android/core/t1;

    .line 105
    .line 106
    invoke-direct {v4, v6, v7}, Lio/sentry/android/core/t1;-><init>(J)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5, v4}, Ljava/util/concurrent/ConcurrentSkipListSet;->tailSet(Ljava/lang/Object;)Ljava/util/NavigableSet;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-interface {v4}, Ljava/util/NavigableSet;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    move-wide/from16 v22, v12

    .line 118
    .line 119
    move-wide/from16 v24, v22

    .line 120
    .line 121
    move-wide/from16 v26, v24

    .line 122
    .line 123
    move/from16 v20, v19

    .line 124
    .line 125
    move/from16 v21, v20

    .line 126
    .line 127
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v28

    .line 131
    if-eqz v28, :cond_11

    .line 132
    .line 133
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v28

    .line 137
    move-object/from16 v12, v28

    .line 138
    .line 139
    check-cast v12, Lio/sentry/android/core/t1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 140
    .line 141
    move-object v13, v2

    .line 142
    move-object/from16 v28, v3

    .line 143
    .line 144
    :try_start_3
    iget-wide v2, v12, Lio/sentry/android/core/t1;->a:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 145
    .line 146
    move-wide/from16 v31, v2

    .line 147
    .line 148
    iget-wide v2, v12, Lio/sentry/android/core/t1;->d:J

    .line 149
    .line 150
    move-wide/from16 v33, v2

    .line 151
    .line 152
    iget-wide v2, v12, Lio/sentry/android/core/t1;->i:J

    .line 153
    .line 154
    move-wide/from16 v35, v2

    .line 155
    .line 156
    iget-wide v2, v12, Lio/sentry/android/core/t1;->b:J

    .line 157
    .line 158
    cmp-long v37, v31, v8

    .line 159
    .line 160
    if-lez v37, :cond_7

    .line 161
    .line 162
    :goto_2
    move-object/from16 v31, v5

    .line 163
    .line 164
    goto/16 :goto_8

    .line 165
    .line 166
    :cond_7
    cmp-long v14, v31, v6

    .line 167
    .line 168
    if-ltz v14, :cond_a

    .line 169
    .line 170
    cmp-long v14, v2, v8

    .line 171
    .line 172
    if-gtz v14, :cond_a

    .line 173
    .line 174
    :try_start_4
    iget-wide v2, v12, Lio/sentry/android/core/t1;->c:J

    .line 175
    .line 176
    iget-boolean v14, v12, Lio/sentry/android/core/t1;->e:Z

    .line 177
    .line 178
    iget-boolean v12, v12, Lio/sentry/android/core/t1;->f:Z

    .line 179
    .line 180
    add-long v22, v22, v2

    .line 181
    .line 182
    if-eqz v12, :cond_8

    .line 183
    .line 184
    add-long v26, v26, v33

    .line 185
    .line 186
    add-int/lit8 v21, v21, 0x1

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_8
    if-eqz v14, :cond_9

    .line 190
    .line 191
    add-long v24, v24, v33

    .line 192
    .line 193
    add-int/lit8 v20, v20, 0x1

    .line 194
    .line 195
    :cond_9
    :goto_3
    move-object/from16 v32, v4

    .line 196
    .line 197
    move-object/from16 v31, v5

    .line 198
    .line 199
    goto :goto_7

    .line 200
    :catchall_0
    move-exception v0

    .line 201
    :goto_4
    move-object v1, v0

    .line 202
    goto/16 :goto_11

    .line 203
    .line 204
    :cond_a
    cmp-long v14, v6, v31

    .line 205
    .line 206
    if-lez v14, :cond_b

    .line 207
    .line 208
    cmp-long v14, v6, v2

    .line 209
    .line 210
    if-ltz v14, :cond_c

    .line 211
    .line 212
    :cond_b
    cmp-long v14, v8, v31

    .line 213
    .line 214
    if-lez v14, :cond_9

    .line 215
    .line 216
    cmp-long v14, v8, v2

    .line 217
    .line 218
    if-gez v14, :cond_9

    .line 219
    .line 220
    :cond_c
    sub-long v14, v6, v31

    .line 221
    .line 222
    move-object/from16 v32, v4

    .line 223
    .line 224
    move-object/from16 v31, v5

    .line 225
    .line 226
    const-wide/16 v4, 0x0

    .line 227
    .line 228
    invoke-static {v4, v5, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 229
    .line 230
    .line 231
    move-result-wide v14

    .line 232
    sub-long v14, v14, v35

    .line 233
    .line 234
    invoke-static {v4, v5, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 235
    .line 236
    .line 237
    move-result-wide v14

    .line 238
    sub-long v4, v33, v14

    .line 239
    .line 240
    invoke-static {v4, v5, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 241
    .line 242
    .line 243
    move-result-wide v4

    .line 244
    iget-wide v14, v12, Lio/sentry/android/core/t1;->a:J

    .line 245
    .line 246
    invoke-static {v6, v7, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 247
    .line 248
    .line 249
    move-result-wide v14

    .line 250
    invoke-static {v8, v9, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 251
    .line 252
    .line 253
    move-result-wide v2

    .line 254
    sub-long/2addr v2, v14

    .line 255
    cmp-long v12, v2, v35

    .line 256
    .line 257
    if-lez v12, :cond_d

    .line 258
    .line 259
    move/from16 v12, v18

    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_d
    move/from16 v12, v19

    .line 263
    .line 264
    :goto_5
    cmp-long v14, v2, v16

    .line 265
    .line 266
    if-lez v14, :cond_e

    .line 267
    .line 268
    move/from16 v14, v18

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_e
    move/from16 v14, v19

    .line 272
    .line 273
    :goto_6
    add-long v22, v22, v2

    .line 274
    .line 275
    if-eqz v14, :cond_f

    .line 276
    .line 277
    add-long v26, v26, v4

    .line 278
    .line 279
    add-int/lit8 v21, v21, 0x1

    .line 280
    .line 281
    goto :goto_7

    .line 282
    :cond_f
    if-eqz v12, :cond_10

    .line 283
    .line 284
    add-long v24, v24, v4

    .line 285
    .line 286
    add-int/lit8 v20, v20, 0x1

    .line 287
    .line 288
    :cond_10
    :goto_7
    move-object v2, v13

    .line 289
    move-object/from16 v3, v28

    .line 290
    .line 291
    move-object/from16 v5, v31

    .line 292
    .line 293
    move-object/from16 v4, v32

    .line 294
    .line 295
    move-wide/from16 v14, v35

    .line 296
    .line 297
    const-wide/16 v12, 0x0

    .line 298
    .line 299
    goto/16 :goto_1

    .line 300
    .line 301
    :catchall_1
    move-exception v0

    .line 302
    move-object/from16 v28, v3

    .line 303
    .line 304
    goto :goto_4

    .line 305
    :cond_11
    move-object v13, v2

    .line 306
    move-object/from16 v28, v3

    .line 307
    .line 308
    goto/16 :goto_2

    .line 309
    .line 310
    :cond_12
    move-object v13, v2

    .line 311
    move-object/from16 v28, v3

    .line 312
    .line 313
    move-object/from16 v31, v5

    .line 314
    .line 315
    move/from16 v20, v19

    .line 316
    .line 317
    move/from16 v21, v20

    .line 318
    .line 319
    const-wide/16 v22, 0x0

    .line 320
    .line 321
    const-wide/16 v24, 0x0

    .line 322
    .line 323
    const-wide/16 v26, 0x0

    .line 324
    .line 325
    :goto_8
    add-int v2, v20, v21

    .line 326
    .line 327
    iget-object v3, v0, Lio/sentry/android/core/u1;->c:Lio/sentry/android/core/internal/util/r;

    .line 328
    .line 329
    iget-object v4, v3, Lio/sentry/android/core/internal/util/r;->V:Landroid/view/Choreographer;

    .line 330
    .line 331
    const-wide/16 v5, -0x1

    .line 332
    .line 333
    if-eqz v4, :cond_13

    .line 334
    .line 335
    iget-object v3, v3, Lio/sentry/android/core/internal/util/r;->W:Ljava/lang/reflect/Field;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 336
    .line 337
    if-eqz v3, :cond_13

    .line 338
    .line 339
    :try_start_5
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    check-cast v3, Ljava/lang/Long;

    .line 344
    .line 345
    if-eqz v3, :cond_13

    .line 346
    .line 347
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 348
    .line 349
    .line 350
    move-result-wide v3
    :try_end_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 351
    goto :goto_9

    .line 352
    :catch_0
    :cond_13
    move-wide v3, v5

    .line 353
    :goto_9
    cmp-long v5, v3, v5

    .line 354
    .line 355
    if-eqz v5, :cond_19

    .line 356
    .line 357
    sub-long/2addr v8, v3

    .line 358
    const-wide/16 v4, 0x0

    .line 359
    .line 360
    :try_start_6
    invoke-static {v4, v5, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 361
    .line 362
    .line 363
    move-result-wide v6

    .line 364
    cmp-long v3, v6, v14

    .line 365
    .line 366
    if-lez v3, :cond_14

    .line 367
    .line 368
    move/from16 v3, v18

    .line 369
    .line 370
    goto :goto_a

    .line 371
    :cond_14
    move/from16 v3, v19

    .line 372
    .line 373
    :goto_a
    if-eqz v3, :cond_17

    .line 374
    .line 375
    cmp-long v3, v6, v16

    .line 376
    .line 377
    if-lez v3, :cond_15

    .line 378
    .line 379
    move/from16 v3, v18

    .line 380
    .line 381
    goto :goto_b

    .line 382
    :cond_15
    move/from16 v3, v19

    .line 383
    .line 384
    :goto_b
    sub-long v4, v6, v14

    .line 385
    .line 386
    const-wide/16 v8, 0x0

    .line 387
    .line 388
    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 389
    .line 390
    .line 391
    move-result-wide v4

    .line 392
    add-long v22, v22, v6

    .line 393
    .line 394
    if-eqz v3, :cond_16

    .line 395
    .line 396
    add-long v26, v26, v4

    .line 397
    .line 398
    add-int/lit8 v21, v21, 0x1

    .line 399
    .line 400
    goto :goto_c

    .line 401
    :cond_16
    add-long v24, v24, v4

    .line 402
    .line 403
    add-int/lit8 v20, v20, 0x1

    .line 404
    .line 405
    goto :goto_c

    .line 406
    :cond_17
    move/from16 v18, v19

    .line 407
    .line 408
    :goto_c
    add-int v2, v2, v18

    .line 409
    .line 410
    sub-long v10, v10, v22

    .line 411
    .line 412
    const-wide/16 v29, 0x0

    .line 413
    .line 414
    cmp-long v3, v10, v29

    .line 415
    .line 416
    if-lez v3, :cond_18

    .line 417
    .line 418
    long-to-double v3, v10

    .line 419
    long-to-double v5, v14

    .line 420
    div-double/2addr v3, v5

    .line 421
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 422
    .line 423
    .line 424
    move-result-wide v3

    .line 425
    double-to-int v3, v3

    .line 426
    move/from16 v19, v3

    .line 427
    .line 428
    :cond_18
    add-int v2, v2, v19

    .line 429
    .line 430
    :cond_19
    add-long v3, v24, v26

    .line 431
    .line 432
    long-to-double v3, v3

    .line 433
    const-wide v5, 0x41cdcd6500000000L    # 1.0E9

    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    div-double/2addr v3, v5

    .line 439
    const-string v5, "frames.total"

    .line 440
    .line 441
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 442
    .line 443
    .line 444
    move-result-object v6

    .line 445
    invoke-interface {v1, v6, v5}, Lio/sentry/k1;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    const-string v5, "frames.slow"

    .line 449
    .line 450
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 451
    .line 452
    .line 453
    move-result-object v6

    .line 454
    invoke-interface {v1, v6, v5}, Lio/sentry/k1;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    const-string v5, "frames.frozen"

    .line 458
    .line 459
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 460
    .line 461
    .line 462
    move-result-object v6

    .line 463
    invoke-interface {v1, v6, v5}, Lio/sentry/k1;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    const-string v5, "frames.delay"

    .line 467
    .line 468
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 469
    .line 470
    .line 471
    move-result-object v6

    .line 472
    invoke-interface {v1, v6, v5}, Lio/sentry/k1;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    instance-of v5, v1, Lio/sentry/m1;

    .line 476
    .line 477
    if-eqz v5, :cond_1a

    .line 478
    .line 479
    const-string v5, "frames_total"

    .line 480
    .line 481
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    invoke-interface {v1, v5, v2}, Lio/sentry/k1;->u(Ljava/lang/String;Ljava/lang/Number;)V

    .line 486
    .line 487
    .line 488
    const-string v2, "frames_slow"

    .line 489
    .line 490
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 491
    .line 492
    .line 493
    move-result-object v5

    .line 494
    invoke-interface {v1, v2, v5}, Lio/sentry/k1;->u(Ljava/lang/String;Ljava/lang/Number;)V

    .line 495
    .line 496
    .line 497
    const-string v2, "frames_frozen"

    .line 498
    .line 499
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 500
    .line 501
    .line 502
    move-result-object v5

    .line 503
    invoke-interface {v1, v2, v5}, Lio/sentry/k1;->u(Ljava/lang/String;Ljava/lang/Number;)V

    .line 504
    .line 505
    .line 506
    const-string v2, "frames_delay"

    .line 507
    .line 508
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    invoke-interface {v1, v2, v3}, Lio/sentry/k1;->u(Ljava/lang/String;Ljava/lang/Number;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 513
    .line 514
    .line 515
    :cond_1a
    invoke-virtual/range {v28 .. v28}, Lio/sentry/util/a;->close()V

    .line 516
    .line 517
    .line 518
    :goto_d
    invoke-virtual/range {v28 .. v28}, Lio/sentry/util/a;->c()V

    .line 519
    .line 520
    .line 521
    :try_start_7
    invoke-virtual {v13}, Ljava/util/TreeSet;->isEmpty()Z

    .line 522
    .line 523
    .line 524
    move-result v1

    .line 525
    if-eqz v1, :cond_1b

    .line 526
    .line 527
    invoke-virtual {v0}, Lio/sentry/android/core/u1;->d()V

    .line 528
    .line 529
    .line 530
    goto :goto_e

    .line 531
    :catchall_2
    move-exception v0

    .line 532
    move-object v1, v0

    .line 533
    goto :goto_f

    .line 534
    :cond_1b
    invoke-virtual {v13}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    check-cast v0, Lio/sentry/k1;

    .line 539
    .line 540
    new-instance v1, Lio/sentry/android/core/t1;

    .line 541
    .line 542
    invoke-interface {v0}, Lio/sentry/k1;->w()Lio/sentry/t4;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    invoke-static {v0}, Lio/sentry/android/core/u1;->g(Lio/sentry/t4;)J

    .line 547
    .line 548
    .line 549
    move-result-wide v2

    .line 550
    invoke-direct {v1, v2, v3}, Lio/sentry/android/core/t1;-><init>(J)V

    .line 551
    .line 552
    .line 553
    move-object/from16 v0, v31

    .line 554
    .line 555
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->headSet(Ljava/lang/Object;)Ljava/util/NavigableSet;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-interface {v0}, Ljava/util/Set;->clear()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 560
    .line 561
    .line 562
    :goto_e
    invoke-virtual/range {v28 .. v28}, Lio/sentry/util/a;->close()V

    .line 563
    .line 564
    .line 565
    return-void

    .line 566
    :goto_f
    :try_start_8
    invoke-virtual/range {v28 .. v28}, Lio/sentry/util/a;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 567
    .line 568
    .line 569
    goto :goto_10

    .line 570
    :catchall_3
    move-exception v0

    .line 571
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 572
    .line 573
    .line 574
    :goto_10
    throw v1

    .line 575
    :goto_11
    :try_start_9
    invoke-virtual/range {v28 .. v28}, Lio/sentry/util/a;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 576
    .line 577
    .line 578
    goto :goto_12

    .line 579
    :catchall_4
    move-exception v0

    .line 580
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 581
    .line 582
    .line 583
    :goto_12
    throw v1

    .line 584
    :catchall_5
    move-exception v0

    .line 585
    move-object/from16 v28, v3

    .line 586
    .line 587
    move-object v1, v0

    .line 588
    :try_start_a
    invoke-virtual/range {v28 .. v28}, Lio/sentry/util/a;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 589
    .line 590
    .line 591
    goto :goto_13

    .line 592
    :catchall_6
    move-exception v0

    .line 593
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 594
    .line 595
    .line 596
    :goto_13
    throw v1
.end method

.method public final f(Lio/sentry/k1;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/sentry/android/core/u1;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    instance-of v0, p1, Lio/sentry/d3;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    instance-of v0, p1, Lio/sentry/f3;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    :goto_0
    return-void

    .line 16
    :cond_2
    iget-object v0, p0, Lio/sentry/android/core/u1;->b:Lio/sentry/util/a;

    .line 17
    .line 18
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 19
    .line 20
    .line 21
    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/u1;->e:Ljava/util/TreeSet;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lio/sentry/android/core/u1;->d:Ljava/lang/String;

    .line 27
    .line 28
    if-nez p1, :cond_3

    .line 29
    .line 30
    iget-object p1, p0, Lio/sentry/android/core/u1;->c:Lio/sentry/android/core/internal/util/r;

    .line 31
    .line 32
    invoke-virtual {p1, p0}, Lio/sentry/android/core/internal/util/r;->a(Lio/sentry/android/core/internal/util/q;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lio/sentry/android/core/u1;->d:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_2

    .line 41
    :cond_3
    :goto_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :goto_2
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    .line 47
    .line 48
    goto :goto_3

    .line 49
    :catchall_1
    move-exception p1

    .line 50
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    :goto_3
    throw p0
.end method

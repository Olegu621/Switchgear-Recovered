.class public final Lio/sentry/android/core/v;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/n1;


# instance fields
.field public final U:Lio/sentry/android/core/internal/util/r;

.field public volatile V:Lio/sentry/s3;

.field public volatile W:Lio/sentry/android/core/t;

.field public X:J

.field public Y:J

.field public Z:Ljava/util/Date;

.field public final a:Landroid/content/Context;

.field public final a0:Lio/sentry/util/a;

.field public final b:Lio/sentry/ILogger;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:I

.field public final f:Lio/sentry/util/f;

.field public final i:Lio/sentry/android/core/o0;

.field public v:Z

.field public final w:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/core/o0;Lio/sentry/android/core/internal/util/r;Lio/sentry/ILogger;Ljava/lang/String;ZILio/sentry/util/f;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lio/sentry/android/core/v;->v:Z

    .line 6
    .line 7
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lio/sentry/android/core/v;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lio/sentry/android/core/v;->W:Lio/sentry/android/core/t;

    .line 16
    .line 17
    new-instance v0, Lio/sentry/util/a;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lio/sentry/android/core/v;->a0:Lio/sentry/util/a;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    move-object p1, v0

    .line 31
    :cond_0
    iput-object p1, p0, Lio/sentry/android/core/v;->a:Landroid/content/Context;

    .line 32
    .line 33
    const-string p1, "ILogger is required"

    .line 34
    .line 35
    invoke-static {p4, p1}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iput-object p4, p0, Lio/sentry/android/core/v;->b:Lio/sentry/ILogger;

    .line 39
    .line 40
    iput-object p3, p0, Lio/sentry/android/core/v;->U:Lio/sentry/android/core/internal/util/r;

    .line 41
    .line 42
    const-string p1, "The BuildInfoProvider is required."

    .line 43
    .line 44
    invoke-static {p2, p1}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iput-object p2, p0, Lio/sentry/android/core/v;->i:Lio/sentry/android/core/o0;

    .line 48
    .line 49
    iput-object p5, p0, Lio/sentry/android/core/v;->c:Ljava/lang/String;

    .line 50
    .line 51
    iput-boolean p6, p0, Lio/sentry/android/core/v;->d:Z

    .line 52
    .line 53
    iput p7, p0, Lio/sentry/android/core/v;->e:I

    .line 54
    .line 55
    iput-object p8, p0, Lio/sentry/android/core/v;->f:Lio/sentry/util/f;

    .line 56
    .line 57
    new-instance p1, Ljava/util/Date;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Lio/sentry/android/core/v;->Z:Ljava/util/Date;

    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lio/sentry/m6;)Lio/sentry/r3;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    move-object/from16 v6, p3

    .line 6
    .line 7
    move-object/from16 v1, p6

    .line 8
    .line 9
    iget-object v2, v0, Lio/sentry/android/core/v;->i:Lio/sentry/android/core/o0;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    iget-object v2, v0, Lio/sentry/android/core/v;->W:Lio/sentry/android/core/t;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v2, v0, Lio/sentry/android/core/v;->a0:Lio/sentry/util/a;

    .line 23
    .line 24
    invoke-virtual {v2}, Lio/sentry/util/a;->c()V

    .line 25
    .line 26
    .line 27
    :try_start_0
    iget-object v5, v0, Lio/sentry/android/core/v;->V:Lio/sentry/s3;

    .line 28
    .line 29
    if-eqz v5, :cond_1

    .line 30
    .line 31
    iget-object v7, v5, Lio/sentry/s3;->a:Ljava/lang/String;

    .line 32
    .line 33
    move-object/from16 v9, p2

    .line 34
    .line 35
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-nez v7, :cond_2

    .line 40
    .line 41
    :cond_1
    move-object/from16 p5, v3

    .line 42
    .line 43
    goto/16 :goto_8

    .line 44
    .line 45
    :cond_2
    iput-object v3, v0, Lio/sentry/android/core/v;->V:Lio/sentry/s3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    invoke-virtual {v2}, Lio/sentry/util/a;->close()V

    .line 48
    .line 49
    .line 50
    iget-object v2, v0, Lio/sentry/android/core/v;->b:Lio/sentry/ILogger;

    .line 51
    .line 52
    sget-object v7, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 53
    .line 54
    const-string v10, "Transaction %s (%s) finished."

    .line 55
    .line 56
    filled-new-array {v4, v6}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v11

    .line 60
    invoke-interface {v2, v7, v10, v11}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v0, Lio/sentry/android/core/v;->W:Lio/sentry/android/core/t;

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    move-object/from16 v10, p5

    .line 67
    .line 68
    invoke-virtual {v2, v10, v7}, Lio/sentry/android/core/t;->a(Ljava/util/List;Z)Lio/sentry/android/core/s;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget-object v10, v0, Lio/sentry/android/core/v;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 73
    .line 74
    invoke-virtual {v10, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 75
    .line 76
    .line 77
    if-nez v2, :cond_3

    .line 78
    .line 79
    :goto_0
    return-object v3

    .line 80
    :cond_3
    iget-wide v10, v2, Lio/sentry/android/core/s;->a:J

    .line 81
    .line 82
    iget-wide v12, v0, Lio/sentry/android/core/v;->X:J

    .line 83
    .line 84
    sub-long/2addr v10, v12

    .line 85
    move-object v12, v3

    .line 86
    new-instance v3, Ljava/util/ArrayList;

    .line 87
    .line 88
    const/4 v13, 0x1

    .line 89
    invoke-direct {v3, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    iget-wide v13, v2, Lio/sentry/android/core/s;->a:J

    .line 96
    .line 97
    move/from16 v16, v7

    .line 98
    .line 99
    move v15, v8

    .line 100
    iget-wide v7, v0, Lio/sentry/android/core/v;->X:J

    .line 101
    .line 102
    move-object/from16 p5, v12

    .line 103
    .line 104
    move-wide/from16 v17, v13

    .line 105
    .line 106
    iget-wide v12, v2, Lio/sentry/android/core/s;->c:J

    .line 107
    .line 108
    move-object v14, v3

    .line 109
    iget-wide v3, v0, Lio/sentry/android/core/v;->Y:J

    .line 110
    .line 111
    move-wide/from16 v19, v3

    .line 112
    .line 113
    iget-object v3, v5, Lio/sentry/s3;->e:Ljava/lang/Long;

    .line 114
    .line 115
    if-nez v3, :cond_4

    .line 116
    .line 117
    sub-long v3, v17, v7

    .line 118
    .line 119
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    iput-object v3, v5, Lio/sentry/s3;->e:Ljava/lang/Long;

    .line 124
    .line 125
    iget-object v3, v5, Lio/sentry/s3;->d:Ljava/lang/Long;

    .line 126
    .line 127
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 128
    .line 129
    .line 130
    move-result-wide v3

    .line 131
    sub-long/2addr v3, v7

    .line 132
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    iput-object v3, v5, Lio/sentry/s3;->d:Ljava/lang/Long;

    .line 137
    .line 138
    sub-long v12, v12, v19

    .line 139
    .line 140
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    iput-object v3, v5, Lio/sentry/s3;->i:Ljava/lang/Long;

    .line 145
    .line 146
    iget-object v3, v5, Lio/sentry/s3;->f:Ljava/lang/Long;

    .line 147
    .line 148
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 149
    .line 150
    .line 151
    move-result-wide v3

    .line 152
    sub-long v3, v3, v19

    .line 153
    .line 154
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    iput-object v3, v5, Lio/sentry/s3;->f:Ljava/lang/Long;

    .line 159
    .line 160
    :cond_4
    instance-of v3, v1, Lio/sentry/android/core/SentryAndroidOptions;

    .line 161
    .line 162
    if-eqz v3, :cond_5

    .line 163
    .line 164
    iget-object v3, v0, Lio/sentry/android/core/v;->a:Landroid/content/Context;

    .line 165
    .line 166
    move-object v4, v1

    .line 167
    check-cast v4, Lio/sentry/android/core/SentryAndroidOptions;

    .line 168
    .line 169
    invoke-static {v3, v4}, Lio/sentry/android/core/t0;->c(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/t0;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    iget-object v3, v3, Lio/sentry/android/core/t0;->h:Ljava/lang/Long;

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_5
    move-object/from16 v3, p5

    .line 177
    .line 178
    :goto_1
    if-eqz v3, :cond_6

    .line 179
    .line 180
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 181
    .line 182
    .line 183
    move-result-wide v3

    .line 184
    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    goto :goto_2

    .line 189
    :cond_6
    const-string v3, "0"

    .line 190
    .line 191
    :goto_2
    sget-object v4, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    .line 192
    .line 193
    new-instance v5, Lio/sentry/r3;

    .line 194
    .line 195
    iget-object v7, v2, Lio/sentry/android/core/s;->d:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v7, Ljava/io/File;

    .line 198
    .line 199
    iget-object v8, v0, Lio/sentry/android/core/v;->Z:Ljava/util/Date;

    .line 200
    .line 201
    invoke-static {v10, v11}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    iget-object v11, v0, Lio/sentry/android/core/v;->i:Lio/sentry/android/core/o0;

    .line 206
    .line 207
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    if-eqz v4, :cond_7

    .line 211
    .line 212
    array-length v11, v4

    .line 213
    if-lez v11, :cond_7

    .line 214
    .line 215
    aget-object v4, v4, v16

    .line 216
    .line 217
    :goto_3
    move-object v1, v7

    .line 218
    move-object v7, v10

    .line 219
    goto :goto_4

    .line 220
    :cond_7
    const-string v4, ""

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :goto_4
    new-instance v10, Lio/sentry/j0;

    .line 224
    .line 225
    const/4 v11, 0x3

    .line 226
    invoke-direct {v10, v11}, Lio/sentry/j0;-><init>(I)V

    .line 227
    .line 228
    .line 229
    iget-object v11, v0, Lio/sentry/android/core/v;->i:Lio/sentry/android/core/o0;

    .line 230
    .line 231
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    sget-object v11, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 235
    .line 236
    iget-object v12, v0, Lio/sentry/android/core/v;->i:Lio/sentry/android/core/o0;

    .line 237
    .line 238
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    sget-object v12, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 242
    .line 243
    iget-object v13, v0, Lio/sentry/android/core/v;->i:Lio/sentry/android/core/o0;

    .line 244
    .line 245
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    sget-object v13, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 249
    .line 250
    iget-object v0, v0, Lio/sentry/android/core/v;->i:Lio/sentry/android/core/o0;

    .line 251
    .line 252
    invoke-virtual {v0}, Lio/sentry/android/core/o0;->a()Ljava/lang/Boolean;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual/range {p6 .. p6}, Lio/sentry/m6;->getProguardUuid()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v16

    .line 260
    invoke-virtual/range {p6 .. p6}, Lio/sentry/m6;->getRelease()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v17

    .line 264
    invoke-virtual/range {p6 .. p6}, Lio/sentry/m6;->getEnvironment()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v18

    .line 268
    move-object/from16 p0, v0

    .line 269
    .line 270
    iget-boolean v0, v2, Lio/sentry/android/core/s;->b:Z

    .line 271
    .line 272
    if-nez v0, :cond_9

    .line 273
    .line 274
    if-eqz p4, :cond_8

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_8
    const-string v0, "normal"

    .line 278
    .line 279
    :goto_5
    move-object/from16 v19, v0

    .line 280
    .line 281
    goto :goto_7

    .line 282
    :cond_9
    :goto_6
    const-string v0, "timeout"

    .line 283
    .line 284
    goto :goto_5

    .line 285
    :goto_7
    iget-object v0, v2, Lio/sentry/android/core/s;->e:Ljava/lang/Object;

    .line 286
    .line 287
    move-object/from16 v20, v0

    .line 288
    .line 289
    check-cast v20, Ljava/util/Map;

    .line 290
    .line 291
    move-object v0, v5

    .line 292
    move-object v2, v8

    .line 293
    move-object v5, v9

    .line 294
    move v8, v15

    .line 295
    move-object v15, v3

    .line 296
    move-object v9, v4

    .line 297
    move-object v3, v14

    .line 298
    move-object/from16 v14, p0

    .line 299
    .line 300
    move-object/from16 v4, p1

    .line 301
    .line 302
    invoke-direct/range {v0 .. v20}, Lio/sentry/r3;-><init>(Ljava/io/File;Ljava/util/Date;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 303
    .line 304
    .line 305
    return-object v0

    .line 306
    :catchall_0
    move-exception v0

    .line 307
    move-object v1, v0

    .line 308
    goto :goto_9

    .line 309
    :goto_8
    :try_start_1
    iget-object v0, v0, Lio/sentry/android/core/v;->b:Lio/sentry/ILogger;

    .line 310
    .line 311
    sget-object v1, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 312
    .line 313
    const-string v3, "Transaction %s (%s) finished, but was not currently being profiled. Skipping"

    .line 314
    .line 315
    filled-new-array {v4, v6}, [Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    invoke-interface {v0, v1, v3, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2}, Lio/sentry/util/a;->close()V

    .line 323
    .line 324
    .line 325
    return-object p5

    .line 326
    :goto_9
    :try_start_2
    invoke-virtual {v2}, Lio/sentry/util/a;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 327
    .line 328
    .line 329
    goto :goto_a

    .line 330
    :catchall_1
    move-exception v0

    .line 331
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 332
    .line 333
    .line 334
    :goto_a
    throw v1
.end method

.method public final close()V
    .locals 8

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/v;->V:Lio/sentry/s3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v2, v0, Lio/sentry/s3;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, v0, Lio/sentry/s3;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, v0, Lio/sentry/s3;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lio/sentry/c1;->l()Lio/sentry/m6;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    const/4 v5, 0x1

    .line 20
    const/4 v6, 0x0

    .line 21
    move-object v1, p0

    .line 22
    invoke-virtual/range {v1 .. v7}, Lio/sentry/android/core/v;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lio/sentry/m6;)Lio/sentry/r3;

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v1, p0

    .line 27
    :goto_0
    iget-object p0, v1, Lio/sentry/android/core/v;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 31
    .line 32
    .line 33
    iget-object p0, v1, Lio/sentry/android/core/v;->W:Lio/sentry/android/core/t;

    .line 34
    .line 35
    if-eqz p0, :cond_3

    .line 36
    .line 37
    iget-object p0, v1, Lio/sentry/android/core/v;->W:Lio/sentry/android/core/t;

    .line 38
    .line 39
    iget-object v1, p0, Lio/sentry/android/core/t;->o:Lio/sentry/util/a;

    .line 40
    .line 41
    invoke-virtual {v1}, Lio/sentry/util/a;->c()V

    .line 42
    .line 43
    .line 44
    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/t;->d:Ljava/util/concurrent/Future;

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    const/4 v3, 0x1

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-interface {v0, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 51
    .line 52
    .line 53
    iput-object v2, p0, Lio/sentry/android/core/t;->d:Ljava/util/concurrent/Future;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    move-object p0, v0

    .line 58
    goto :goto_2

    .line 59
    :cond_1
    :goto_1
    iget-boolean v0, p0, Lio/sentry/android/core/t;->n:Z

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    invoke-virtual {p0, v2, v3}, Lio/sentry/android/core/t;->a(Ljava/util/List;Z)Lio/sentry/android/core/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    :cond_2
    invoke-virtual {v1}, Lio/sentry/util/a;->close()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :goto_2
    :try_start_1
    invoke-virtual {v1}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :catchall_1
    move-exception v0

    .line 75
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    :goto_3
    throw p0

    .line 79
    :cond_3
    return-void
.end method

.method public final e(Lio/sentry/m1;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/v;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lio/sentry/android/core/v;->V:Lio/sentry/s3;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lio/sentry/android/core/v;->a0:Lio/sentry/util/a;

    .line 14
    .line 15
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 16
    .line 17
    .line 18
    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/v;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-object v1, p0, Lio/sentry/android/core/v;->V:Lio/sentry/s3;

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    new-instance v1, Lio/sentry/s3;

    .line 31
    .line 32
    iget-wide v2, p0, Lio/sentry/android/core/v;->X:J

    .line 33
    .line 34
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-wide v3, p0, Lio/sentry/android/core/v;->Y:J

    .line 39
    .line 40
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-direct {v1, p1, v2, v3}, Lio/sentry/s3;-><init>(Lio/sentry/m1;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, Lio/sentry/android/core/v;->V:Lio/sentry/s3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :catchall_1
    move-exception p1

    .line 61
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    :goto_2
    throw p0

    .line 65
    :cond_1
    return-void
.end method

.method public final f(Lio/sentry/x6;Ljava/util/List;Lio/sentry/m6;)Lio/sentry/r3;
    .locals 7

    .line 1
    iget-object v1, p1, Lio/sentry/x6;->e:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p1, Lio/sentry/x6;->a:Lio/sentry/protocol/w;

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/sentry/protocol/w;->a()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object p1, p1, Lio/sentry/x6;->b:Lio/sentry/a7;

    .line 10
    .line 11
    iget-object p1, p1, Lio/sentry/a7;->c:Lio/sentry/b7;

    .line 12
    .line 13
    iget-object p1, p1, Lio/sentry/b7;->a:Lio/sentry/protocol/w;

    .line 14
    .line 15
    invoke-virtual {p1}, Lio/sentry/protocol/w;->a()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v0, p0

    .line 21
    move-object v5, p2

    .line 22
    move-object v6, p3

    .line 23
    invoke-virtual/range {v0 .. v6}, Lio/sentry/android/core/v;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lio/sentry/m6;)Lio/sentry/r3;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public final isRunning()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/core/v;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final start()V
    .locals 11

    .line 1
    iget-object v0, p0, Lio/sentry/android/core/v;->i:Lio/sentry/android/core/o0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/sentry/android/core/v;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_7

    .line 14
    .line 15
    iget-boolean v0, p0, Lio/sentry/android/core/v;->v:Z

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iput-boolean v1, p0, Lio/sentry/android/core/v;->v:Z

    .line 22
    .line 23
    iget-boolean v0, p0, Lio/sentry/android/core/v;->d:Z

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lio/sentry/android/core/v;->b:Lio/sentry/ILogger;

    .line 28
    .line 29
    sget-object v1, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 30
    .line 31
    const-string v3, "Profiling is disabled in options."

    .line 32
    .line 33
    new-array v4, v2, [Ljava/lang/Object;

    .line 34
    .line 35
    invoke-interface {v0, v1, v3, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v6, p0, Lio/sentry/android/core/v;->c:Ljava/lang/String;

    .line 40
    .line 41
    if-nez v6, :cond_2

    .line 42
    .line 43
    iget-object v0, p0, Lio/sentry/android/core/v;->b:Lio/sentry/ILogger;

    .line 44
    .line 45
    sget-object v1, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 46
    .line 47
    const-string v3, "Disabling profiling because no profiling traces dir path is defined in options."

    .line 48
    .line 49
    new-array v4, v2, [Ljava/lang/Object;

    .line 50
    .line 51
    invoke-interface {v0, v1, v3, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    iget v0, p0, Lio/sentry/android/core/v;->e:I

    .line 56
    .line 57
    if-gtz v0, :cond_3

    .line 58
    .line 59
    iget-object v1, p0, Lio/sentry/android/core/v;->b:Lio/sentry/ILogger;

    .line 60
    .line 61
    sget-object v3, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 62
    .line 63
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v4, "Disabling profiling because trace rate is set to %d"

    .line 72
    .line 73
    invoke-interface {v1, v3, v4, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    new-instance v5, Lio/sentry/android/core/t;

    .line 78
    .line 79
    const v1, 0xf4240

    .line 80
    .line 81
    .line 82
    div-int v7, v1, v0

    .line 83
    .line 84
    iget-object v8, p0, Lio/sentry/android/core/v;->U:Lio/sentry/android/core/internal/util/r;

    .line 85
    .line 86
    iget-object v9, p0, Lio/sentry/android/core/v;->f:Lio/sentry/util/f;

    .line 87
    .line 88
    iget-object v10, p0, Lio/sentry/android/core/v;->b:Lio/sentry/ILogger;

    .line 89
    .line 90
    invoke-direct/range {v5 .. v10}, Lio/sentry/android/core/t;-><init>(Ljava/lang/String;ILio/sentry/android/core/internal/util/r;Lio/sentry/util/f;Lio/sentry/ILogger;)V

    .line 91
    .line 92
    .line 93
    iput-object v5, p0, Lio/sentry/android/core/v;->W:Lio/sentry/android/core/t;

    .line 94
    .line 95
    :goto_0
    iget-object v0, p0, Lio/sentry/android/core/v;->W:Lio/sentry/android/core/t;

    .line 96
    .line 97
    if-nez v0, :cond_4

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    iget-object v0, p0, Lio/sentry/android/core/v;->W:Lio/sentry/android/core/t;

    .line 101
    .line 102
    invoke-virtual {v0}, Lio/sentry/android/core/t;->c()Lun;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-nez v0, :cond_6

    .line 107
    .line 108
    :goto_1
    iget-object v0, p0, Lio/sentry/android/core/v;->W:Lio/sentry/android/core/t;

    .line 109
    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    iget-object v0, p0, Lio/sentry/android/core/v;->W:Lio/sentry/android/core/t;

    .line 113
    .line 114
    iget-boolean v0, v0, Lio/sentry/android/core/t;->n:Z

    .line 115
    .line 116
    if-eqz v0, :cond_5

    .line 117
    .line 118
    iget-object p0, p0, Lio/sentry/android/core/v;->b:Lio/sentry/ILogger;

    .line 119
    .line 120
    sget-object v0, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 121
    .line 122
    const-string v1, "A profile is already running. This profile will be ignored."

    .line 123
    .line 124
    new-array v2, v2, [Ljava/lang/Object;

    .line 125
    .line 126
    invoke-interface {p0, v0, v1, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_5
    iget-object v1, p0, Lio/sentry/android/core/v;->a0:Lio/sentry/util/a;

    .line 131
    .line 132
    invoke-virtual {v1}, Lio/sentry/util/a;->c()V

    .line 133
    .line 134
    .line 135
    const/4 v0, 0x0

    .line 136
    :try_start_0
    iput-object v0, p0, Lio/sentry/android/core/v;->V:Lio/sentry/s3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    .line 138
    invoke-virtual {v1}, Lio/sentry/util/a;->close()V

    .line 139
    .line 140
    .line 141
    iget-object p0, p0, Lio/sentry/android/core/v;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 142
    .line 143
    invoke-virtual {p0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :catchall_0
    move-exception v0

    .line 148
    move-object p0, v0

    .line 149
    :try_start_1
    invoke-virtual {v1}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :catchall_1
    move-exception v0

    .line 154
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 155
    .line 156
    .line 157
    :goto_2
    throw p0

    .line 158
    :cond_6
    iget-wide v3, v0, Lun;->a:J

    .line 159
    .line 160
    iput-wide v3, p0, Lio/sentry/android/core/v;->X:J

    .line 161
    .line 162
    iget-wide v3, v0, Lun;->b:J

    .line 163
    .line 164
    iput-wide v3, p0, Lio/sentry/android/core/v;->Y:J

    .line 165
    .line 166
    iget-object v0, v0, Lun;->c:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, Ljava/util/Date;

    .line 169
    .line 170
    iput-object v0, p0, Lio/sentry/android/core/v;->Z:Ljava/util/Date;

    .line 171
    .line 172
    iget-object p0, p0, Lio/sentry/android/core/v;->b:Lio/sentry/ILogger;

    .line 173
    .line 174
    sget-object v0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 175
    .line 176
    const-string v1, "Profiler started."

    .line 177
    .line 178
    new-array v2, v2, [Ljava/lang/Object;

    .line 179
    .line 180
    invoke-interface {p0, v0, v1, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :cond_7
    return-void
.end method

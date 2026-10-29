.class public final Lio/sentry/android/core/x;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/transport/h;
.implements Lio/sentry/android/core/j0;


# instance fields
.field public final a:Lio/sentry/android/core/SentryAndroidOptions;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/sentry/android/core/x;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()I
    .locals 0

    .line 1
    const/4 p0, 0x6

    .line 2
    return p0
.end method

.method public b()Ljava/lang/Long;
    .locals 2

    .line 1
    const-string v0, "last_anr_report"

    .line 2
    .line 3
    const-string v1, "ANR"

    .line 4
    .line 5
    iget-object p0, p0, Lio/sentry/android/core/x;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 6
    .line 7
    invoke-static {p0, v0, v1}, Lio/sentry/android/core/cache/b;->h(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public d()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "ANR"

    .line 2
    .line 3
    return-object p0
.end method

.method public e()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/core/x;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/sentry/android/core/SentryAndroidOptions;->isReportHistoricalAnrs()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isConnected()Z
    .locals 2

    .line 1
    iget-object p0, p0, Lio/sentry/android/core/x;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/sentry/m6;->getConnectionStatusProvider()Lio/sentry/q0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Lio/sentry/q0;->r0()Lio/sentry/o0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object v0, Lio/sentry/android/core/w;->a:[I

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    aget p0, v0, p0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    if-eq p0, v0, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    if-eq p0, v1, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    if-eq p0, v1, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return p0

    .line 30
    :cond_0
    return v0
.end method

.method public w(Landroid/app/ApplicationExitInfo;Z)Lio/sentry/l;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lio/sentry/android/core/x;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    invoke-static/range {p1 .. p1}, Lcom/appsflyer/internal/o;->b(Landroid/app/ApplicationExitInfo;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v6

    .line 9
    invoke-static/range {p1 .. p1}, Lcom/appsflyer/internal/o;->a(Landroid/app/ApplicationExitInfo;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v2, 0x64

    .line 14
    .line 15
    const/4 v10, 0x1

    .line 16
    if-eq v0, v2, :cond_0

    .line 17
    .line 18
    move v9, v10

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    move v9, v0

    .line 22
    :goto_0
    :try_start_0
    invoke-static/range {p1 .. p1}, Lcom/appsflyer/internal/o;->f(Landroid/app/ApplicationExitInfo;)Ljava/io/InputStream;

    .line 23
    .line 24
    .line 25
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    :try_start_1
    new-instance v0, Lio/sentry/t3;

    .line 29
    .line 30
    sget-object v3, Lio/sentry/android/core/a0;->NO_DUMP:Lio/sentry/android/core/a0;

    .line 31
    .line 32
    invoke-direct {v0, v3}, Lio/sentry/t3;-><init>(Lio/sentry/android/core/a0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    .line 34
    .line 35
    if-eqz v2, :cond_5

    .line 36
    .line 37
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 38
    .line 39
    .line 40
    goto/16 :goto_8

    .line 41
    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto/16 :goto_7

    .line 44
    .line 45
    :catchall_1
    move-exception v0

    .line 46
    move-object v3, v0

    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_1
    :try_start_3
    invoke-static {v2}, Lio/sentry/config/a;->t(Ljava/io/InputStream;)[B

    .line 50
    .line 51
    .line 52
    move-result-object v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 53
    :try_start_4
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 54
    .line 55
    .line 56
    :try_start_5
    new-instance v2, Ljava/io/BufferedReader;

    .line 57
    .line 58
    new-instance v0, Ljava/io/InputStreamReader;

    .line 59
    .line 60
    new-instance v3, Ljava/io/ByteArrayInputStream;

    .line 61
    .line 62
    invoke-direct {v3, v13}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 66
    .line 67
    .line 68
    invoke-direct {v2, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 69
    .line 70
    .line 71
    :try_start_6
    new-instance v0, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    :goto_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    if-eqz v3, :cond_2

    .line 81
    .line 82
    new-instance v4, Lio/sentry/android/core/internal/threaddump/a;

    .line 83
    .line 84
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object v3, v4, Lio/sentry/android/core/internal/threaddump/a;->a:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    new-instance v3, Lcd1;

    .line 94
    .line 95
    invoke-direct {v3, v0}, Lcd1;-><init>(Ljava/util/ArrayList;)V

    .line 96
    .line 97
    .line 98
    new-instance v0, Lio/sentry/android/core/internal/threaddump/b;

    .line 99
    .line 100
    invoke-direct {v0, v1, v9}, Lio/sentry/android/core/internal/threaddump/b;-><init>(Lio/sentry/m6;Z)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v3}, Lio/sentry/android/core/internal/threaddump/b;->d(Lcd1;)V

    .line 104
    .line 105
    .line 106
    iget-object v14, v0, Lio/sentry/android/core/internal/threaddump/b;->f:Ljava/util/ArrayList;

    .line 107
    .line 108
    new-instance v15, Ljava/util/ArrayList;

    .line 109
    .line 110
    iget-object v3, v0, Lio/sentry/android/core/internal/threaddump/b;->e:Ljava/util/HashMap;

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-direct {v15, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 117
    .line 118
    .line 119
    iget-object v0, v0, Lio/sentry/android/core/internal/threaddump/b;->g:Lio/sentry/s6;

    .line 120
    .line 121
    iget-object v0, v0, Lio/sentry/s6;->b:Ljava/lang/Object;

    .line 122
    .line 123
    move-object/from16 v16, v0

    .line 124
    .line 125
    check-cast v16, Lio/sentry/protocol/c;

    .line 126
    .line 127
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_3

    .line 132
    .line 133
    new-instance v0, Lio/sentry/t3;

    .line 134
    .line 135
    sget-object v3, Lio/sentry/android/core/a0;->NO_DUMP:Lio/sentry/android/core/a0;

    .line 136
    .line 137
    invoke-direct {v0, v3}, Lio/sentry/t3;-><init>(Lio/sentry/android/core/a0;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 138
    .line 139
    .line 140
    :try_start_7
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 141
    .line 142
    .line 143
    goto :goto_8

    .line 144
    :catchall_2
    move-exception v0

    .line 145
    goto :goto_4

    .line 146
    :catchall_3
    move-exception v0

    .line 147
    move-object v3, v0

    .line 148
    goto :goto_2

    .line 149
    :cond_3
    :try_start_8
    new-instance v11, Lio/sentry/t3;

    .line 150
    .line 151
    sget-object v12, Lio/sentry/android/core/a0;->DUMP:Lio/sentry/android/core/a0;

    .line 152
    .line 153
    invoke-direct/range {v11 .. v16}, Lio/sentry/t3;-><init>(Lio/sentry/android/core/a0;[BLjava/util/ArrayList;Ljava/util/ArrayList;Lio/sentry/protocol/c;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 154
    .line 155
    .line 156
    :try_start_9
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 157
    .line 158
    .line 159
    move-object v0, v11

    .line 160
    goto :goto_8

    .line 161
    :goto_2
    :try_start_a
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :catchall_4
    move-exception v0

    .line 166
    :try_start_b
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 167
    .line 168
    .line 169
    :goto_3
    throw v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 170
    :goto_4
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    sget-object v3, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 175
    .line 176
    const-string v4, "Failed to parse ANR thread dump"

    .line 177
    .line 178
    invoke-interface {v2, v3, v4, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 179
    .line 180
    .line 181
    new-instance v0, Lio/sentry/t3;

    .line 182
    .line 183
    sget-object v2, Lio/sentry/android/core/a0;->ERROR:Lio/sentry/android/core/a0;

    .line 184
    .line 185
    invoke-direct {v0, v2, v13}, Lio/sentry/t3;-><init>(Lio/sentry/android/core/a0;[B)V

    .line 186
    .line 187
    .line 188
    goto :goto_8

    .line 189
    :goto_5
    if-eqz v2, :cond_4

    .line 190
    .line 191
    :try_start_c
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 192
    .line 193
    .line 194
    goto :goto_6

    .line 195
    :catchall_5
    move-exception v0

    .line 196
    :try_start_d
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    :cond_4
    :goto_6
    throw v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 200
    :goto_7
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    sget-object v3, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 205
    .line 206
    const-string v4, "Failed to read ANR thread dump"

    .line 207
    .line 208
    invoke-interface {v2, v3, v4, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 209
    .line 210
    .line 211
    new-instance v0, Lio/sentry/t3;

    .line 212
    .line 213
    sget-object v2, Lio/sentry/android/core/a0;->NO_DUMP:Lio/sentry/android/core/a0;

    .line 214
    .line 215
    invoke-direct {v0, v2}, Lio/sentry/t3;-><init>(Lio/sentry/android/core/a0;)V

    .line 216
    .line 217
    .line 218
    :cond_5
    :goto_8
    iget-object v2, v0, Lio/sentry/t3;->b:Ljava/lang/Object;

    .line 219
    .line 220
    move-object v11, v2

    .line 221
    check-cast v11, Lio/sentry/android/core/a0;

    .line 222
    .line 223
    sget-object v2, Lio/sentry/android/core/a0;->NO_DUMP:Lio/sentry/android/core/a0;

    .line 224
    .line 225
    if-ne v11, v2, :cond_6

    .line 226
    .line 227
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    sget-object v1, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 232
    .line 233
    invoke-static/range {p1 .. p1}, Lcom/appsflyer/internal/o;->g(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    const-string v3, "Not reporting ANR event as there was no thread dump for the ANR %s"

    .line 242
    .line 243
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    const/4 v0, 0x0

    .line 247
    return-object v0

    .line 248
    :cond_6
    new-instance v2, Lio/sentry/android/core/z;

    .line 249
    .line 250
    invoke-virtual {v1}, Lio/sentry/m6;->getFlushTimeoutMillis()J

    .line 251
    .line 252
    .line 253
    move-result-wide v3

    .line 254
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    move/from16 v8, p2

    .line 259
    .line 260
    invoke-direct/range {v2 .. v9}, Lio/sentry/android/core/z;-><init>(JLio/sentry/ILogger;JZZ)V

    .line 261
    .line 262
    .line 263
    invoke-static {v2}, Lio/sentry/util/c;->e(Ljava/lang/Object;)Lio/sentry/i0;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    new-instance v4, Lio/sentry/c5;

    .line 268
    .line 269
    invoke-direct {v4}, Lio/sentry/c5;-><init>()V

    .line 270
    .line 271
    .line 272
    sget-object v5, Lio/sentry/android/core/a0;->ERROR:Lio/sentry/android/core/a0;

    .line 273
    .line 274
    if-ne v11, v5, :cond_7

    .line 275
    .line 276
    new-instance v5, Lio/sentry/protocol/p;

    .line 277
    .line 278
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 279
    .line 280
    .line 281
    const-string v8, "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub."

    .line 282
    .line 283
    iput-object v8, v5, Lio/sentry/protocol/p;->a:Ljava/lang/String;

    .line 284
    .line 285
    iput-object v5, v4, Lio/sentry/c5;->b0:Lio/sentry/protocol/p;

    .line 286
    .line 287
    goto :goto_9

    .line 288
    :cond_7
    sget-object v5, Lio/sentry/android/core/a0;->DUMP:Lio/sentry/android/core/a0;

    .line 289
    .line 290
    if-ne v11, v5, :cond_9

    .line 291
    .line 292
    iget-object v5, v0, Lio/sentry/t3;->d:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v5, Ljava/util/List;

    .line 295
    .line 296
    new-instance v8, Lio/sentry/d2;

    .line 297
    .line 298
    invoke-direct {v8, v5}, Lio/sentry/d2;-><init>(Ljava/util/List;)V

    .line 299
    .line 300
    .line 301
    iput-object v8, v4, Lio/sentry/c5;->d0:Lio/sentry/d2;

    .line 302
    .line 303
    iget-object v5, v0, Lio/sentry/t3;->a:Ljava/io/Serializable;

    .line 304
    .line 305
    check-cast v5, Ljava/util/ArrayList;

    .line 306
    .line 307
    if-eqz v5, :cond_8

    .line 308
    .line 309
    new-instance v8, Lio/sentry/protocol/f;

    .line 310
    .line 311
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 312
    .line 313
    .line 314
    new-instance v9, Ljava/util/ArrayList;

    .line 315
    .line 316
    invoke-direct {v9, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 317
    .line 318
    .line 319
    iput-object v9, v8, Lio/sentry/protocol/f;->b:Ljava/util/List;

    .line 320
    .line 321
    iput-object v8, v4, Lio/sentry/q4;->Y:Lio/sentry/protocol/f;

    .line 322
    .line 323
    :cond_8
    iget-object v5, v0, Lio/sentry/t3;->e:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v5, Lio/sentry/protocol/c;

    .line 326
    .line 327
    if-eqz v5, :cond_9

    .line 328
    .line 329
    iget-object v8, v4, Lio/sentry/q4;->b:Lio/sentry/protocol/e;

    .line 330
    .line 331
    const-string v9, "art"

    .line 332
    .line 333
    invoke-virtual {v8, v5, v9}, Lio/sentry/protocol/e;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    :cond_9
    :goto_9
    sget-object v5, Lio/sentry/m5;->FATAL:Lio/sentry/m5;

    .line 337
    .line 338
    iput-object v5, v4, Lio/sentry/c5;->f0:Lio/sentry/m5;

    .line 339
    .line 340
    new-instance v5, Ljava/util/Date;

    .line 341
    .line 342
    invoke-direct {v5, v6, v7}, Ljava/util/Date;-><init>(J)V

    .line 343
    .line 344
    .line 345
    iput-object v5, v4, Lio/sentry/c5;->a0:Ljava/util/Date;

    .line 346
    .line 347
    invoke-virtual {v1}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachAnrThreadDump()Z

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    if-eqz v1, :cond_a

    .line 352
    .line 353
    iget-object v0, v0, Lio/sentry/t3;->c:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v0, [B

    .line 356
    .line 357
    if-eqz v0, :cond_a

    .line 358
    .line 359
    new-instance v1, Lio/sentry/a;

    .line 360
    .line 361
    const-string v5, "thread-dump.txt"

    .line 362
    .line 363
    const-string v6, "text/plain"

    .line 364
    .line 365
    invoke-direct {v1, v0, v5, v6}, Lio/sentry/a;-><init>([BLjava/lang/String;Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    iput-object v1, v3, Lio/sentry/i0;->f:Lio/sentry/a;

    .line 369
    .line 370
    :cond_a
    new-instance v0, Lio/sentry/l;

    .line 371
    .line 372
    invoke-direct {v0, v10, v4, v3, v2}, Lio/sentry/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    return-object v0
.end method

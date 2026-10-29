.class public final synthetic Lpr;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lud;
.implements Lbk2;
.implements Lvm;
.implements Lcom/google/android/gms/tasks/SuccessContinuation;
.implements Lq52;
.implements Lio/sentry/z3;
.implements Lio/sentry/c7;
.implements Lio/sentry/a4;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lpr;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lpr;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lpr;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p4, p0, Lpr;->d:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(Lio/sentry/z6;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lpr;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu93;

    .line 4
    .line 5
    iget-object v1, p0, Lpr;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lio/sentry/c5;

    .line 8
    .line 9
    iget-object p0, p0, Lpr;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lio/sentry/i0;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz p1, :cond_6

    .line 15
    .line 16
    invoke-virtual {v1}, Lio/sentry/c5;->f()Lio/sentry/protocol/v;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    sget-object v0, Lio/sentry/y6;->Crashed:Lio/sentry/y6;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v0, v3

    .line 27
    :goto_0
    sget-object v4, Lio/sentry/y6;->Crashed:Lio/sentry/y6;

    .line 28
    .line 29
    if-eq v4, v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1}, Lio/sentry/c5;->g()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    :cond_1
    const/4 v2, 0x1

    .line 38
    :cond_2
    iget-object v4, v1, Lio/sentry/q4;->d:Lio/sentry/protocol/r;

    .line 39
    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    iget-object v4, v4, Lio/sentry/protocol/r;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 43
    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    const-string v5, "user-agent"

    .line 47
    .line 48
    invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_3

    .line 53
    .line 54
    iget-object v1, v1, Lio/sentry/q4;->d:Lio/sentry/protocol/r;

    .line 55
    .line 56
    iget-object v1, v1, Lio/sentry/protocol/r;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 57
    .line 58
    invoke-virtual {v1, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Ljava/lang/String;

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    move-object v1, v3

    .line 66
    :goto_1
    const-string v4, "sentry:typeCheckHint"

    .line 67
    .line 68
    invoke-virtual {p0, v4}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    instance-of v4, p0, Lio/sentry/hints/a;

    .line 73
    .line 74
    if-eqz v4, :cond_4

    .line 75
    .line 76
    check-cast p0, Lio/sentry/hints/a;

    .line 77
    .line 78
    invoke-interface {p0}, Lio/sentry/hints/a;->e()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    sget-object v0, Lio/sentry/y6;->Abnormal:Lio/sentry/y6;

    .line 83
    .line 84
    :cond_4
    invoke-virtual {p1, v0, v1, v2, v3}, Lio/sentry/z6;->c(Lio/sentry/y6;Ljava/lang/String;ZLjava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-eqz p0, :cond_5

    .line 89
    .line 90
    iget-object p0, p1, Lio/sentry/z6;->i:Lio/sentry/y6;

    .line 91
    .line 92
    sget-object v0, Lio/sentry/y6;->Ok:Lio/sentry/y6;

    .line 93
    .line 94
    if-eq p0, v0, :cond_5

    .line 95
    .line 96
    new-instance p0, Ljava/util/Date;

    .line 97
    .line 98
    invoke-direct {p0}, Ljava/util/Date;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, p0}, Lio/sentry/z6;->b(Ljava/util/Date;)V

    .line 102
    .line 103
    .line 104
    :cond_5
    return-void

    .line 105
    :cond_6
    iget-object p0, v0, Lu93;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 108
    .line 109
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    sget-object p1, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 114
    .line 115
    const-string v0, "Session is null on scope.withSession"

    .line 116
    .line 117
    new-array v1, v2, [Ljava/lang/Object;

    .line 118
    .line 119
    invoke-interface {p0, p1, v0, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lpr;->a:I

    .line 4
    .line 5
    const-string v2, "bytes"

    .line 6
    .line 7
    const-string v3, "PRAGMA page_size"

    .line 8
    .line 9
    const-string v4, "PRAGMA page_count"

    .line 10
    .line 11
    const/4 v5, 0x6

    .line 12
    const/4 v6, 0x5

    .line 13
    const/4 v7, 0x4

    .line 14
    const/4 v8, 0x3

    .line 15
    sget-object v9, Lca1;->d:Lca1;

    .line 16
    .line 17
    const/4 v10, 0x2

    .line 18
    const/4 v12, 0x1

    .line 19
    iget-object v13, v0, Lpr;->d:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v14, v0, Lpr;->c:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v0, v0, Lpr;->b:Ljava/lang/Object;

    .line 24
    .line 25
    const/4 v15, 0x0

    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    check-cast v0, Ls52;

    .line 30
    .line 31
    check-cast v14, Ljava/util/HashMap;

    .line 32
    .line 33
    check-cast v13, Lra2;

    .line 34
    .line 35
    iget-object v1, v13, Lra2;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Ljava/util/ArrayList;

    .line 38
    .line 39
    move-object/from16 v2, p1

    .line 40
    .line 41
    check-cast v2, Landroid/database/Cursor;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    if-eqz v11, :cond_8

    .line 51
    .line 52
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v11

    .line 56
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getInt(I)I

    .line 57
    .line 58
    .line 59
    move-result v15

    .line 60
    sget-object v16, Lca1;->b:Lca1;

    .line 61
    .line 62
    if-nez v15, :cond_0

    .line 63
    .line 64
    :goto_1
    move-object/from16 v5, v16

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_0
    if-ne v15, v12, :cond_1

    .line 68
    .line 69
    sget-object v16, Lca1;->c:Lca1;

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    if-ne v15, v10, :cond_2

    .line 73
    .line 74
    move-object v5, v9

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    if-ne v15, v8, :cond_3

    .line 77
    .line 78
    sget-object v16, Lca1;->e:Lca1;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    if-ne v15, v7, :cond_4

    .line 82
    .line 83
    sget-object v16, Lca1;->f:Lca1;

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    if-ne v15, v6, :cond_5

    .line 87
    .line 88
    sget-object v16, Lca1;->i:Lca1;

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    if-ne v15, v5, :cond_6

    .line 92
    .line 93
    sget-object v16, Lca1;->v:Lca1;

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_6
    const-string v5, "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN"

    .line 97
    .line 98
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v15

    .line 102
    const-string v6, "SQLiteEventStore"

    .line 103
    .line 104
    invoke-static {v6, v5, v15}, Lpy0;->P(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :goto_2
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 109
    .line 110
    .line 111
    move-result-wide v7

    .line 112
    invoke-virtual {v14, v11}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v16

    .line 116
    if-nez v16, :cond_7

    .line 117
    .line 118
    new-instance v6, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v14, v11, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    :cond_7
    invoke-virtual {v14, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    check-cast v6, Ljava/util/List;

    .line 131
    .line 132
    new-instance v11, Lda1;

    .line 133
    .line 134
    invoke-direct {v11, v7, v8, v5}, Lda1;-><init>(JLca1;)V

    .line 135
    .line 136
    .line 137
    invoke-interface {v6, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    const/4 v5, 0x6

    .line 141
    const/4 v6, 0x5

    .line 142
    const/4 v7, 0x4

    .line 143
    const/4 v8, 0x3

    .line 144
    const/4 v15, 0x0

    .line 145
    goto :goto_0

    .line 146
    :cond_8
    invoke-virtual {v14}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    if-eqz v5, :cond_9

    .line 159
    .line 160
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    check-cast v5, Ljava/util/Map$Entry;

    .line 165
    .line 166
    sget v6, Lfa1;->c:I

    .line 167
    .line 168
    new-instance v6, Ljava/util/ArrayList;

    .line 169
    .line 170
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    check-cast v6, Ljava/lang/String;

    .line 178
    .line 179
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    check-cast v5, Ljava/util/List;

    .line 184
    .line 185
    new-instance v7, Lfa1;

    .line 186
    .line 187
    invoke-static {v5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-direct {v7, v6, v5}, Lfa1;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_9
    iget-object v2, v0, Ls52;->b:Lyv;

    .line 199
    .line 200
    invoke-interface {v2}, Lyv;->a()J

    .line 201
    .line 202
    .line 203
    move-result-wide v5

    .line 204
    invoke-virtual {v0}, Ls52;->c()Landroid/database/sqlite/SQLiteDatabase;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 209
    .line 210
    .line 211
    :try_start_0
    const-string v7, "SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1"

    .line 212
    .line 213
    const/4 v8, 0x0

    .line 214
    new-array v9, v8, [Ljava/lang/String;

    .line 215
    .line 216
    invoke-virtual {v2, v7, v9}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 217
    .line 218
    .line 219
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 220
    :try_start_1
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    .line 221
    .line 222
    .line 223
    invoke-interface {v7, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 224
    .line 225
    .line 226
    move-result-wide v8

    .line 227
    new-instance v10, Lko2;

    .line 228
    .line 229
    invoke-direct {v10, v8, v9, v5, v6}, Lko2;-><init>(JJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 230
    .line 231
    .line 232
    :try_start_2
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 239
    .line 240
    .line 241
    iput-object v10, v13, Lra2;->b:Ljava/lang/Object;

    .line 242
    .line 243
    invoke-virtual {v0}, Ls52;->c()Landroid/database/sqlite/SQLiteDatabase;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-virtual {v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    .line 252
    .line 253
    .line 254
    move-result-wide v4

    .line 255
    invoke-virtual {v0}, Ls52;->c()Landroid/database/sqlite/SQLiteDatabase;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-virtual {v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    .line 264
    .line 265
    .line 266
    move-result-wide v2

    .line 267
    mul-long/2addr v2, v4

    .line 268
    sget-object v4, Lsf;->f:Lsf;

    .line 269
    .line 270
    iget-wide v4, v4, Lsf;->a:J

    .line 271
    .line 272
    new-instance v6, Lgh2;

    .line 273
    .line 274
    invoke-direct {v6, v2, v3, v4, v5}, Lgh2;-><init>(JJ)V

    .line 275
    .line 276
    .line 277
    new-instance v2, Lhr0;

    .line 278
    .line 279
    invoke-direct {v2, v6}, Lhr0;-><init>(Lgh2;)V

    .line 280
    .line 281
    .line 282
    iput-object v2, v13, Lra2;->d:Ljava/lang/Object;

    .line 283
    .line 284
    iget-object v0, v0, Ls52;->e:Ljavax/inject/Provider;

    .line 285
    .line 286
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    check-cast v0, Ljava/lang/String;

    .line 291
    .line 292
    iput-object v0, v13, Lra2;->a:Ljava/lang/Object;

    .line 293
    .line 294
    new-instance v0, Ltv;

    .line 295
    .line 296
    iget-object v2, v13, Lra2;->b:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v2, Lko2;

    .line 299
    .line 300
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    iget-object v3, v13, Lra2;->d:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v3, Lhr0;

    .line 307
    .line 308
    iget-object v4, v13, Lra2;->a:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v4, Ljava/lang/String;

    .line 311
    .line 312
    invoke-direct {v0, v2, v1, v3, v4}, Ltv;-><init>(Lko2;Ljava/util/List;Lhr0;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    return-object v0

    .line 316
    :catchall_0
    move-exception v0

    .line 317
    goto :goto_4

    .line 318
    :catchall_1
    move-exception v0

    .line 319
    :try_start_3
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 320
    .line 321
    .line 322
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 323
    :goto_4
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 324
    .line 325
    .line 326
    throw v0

    .line 327
    :pswitch_0
    check-cast v0, Ls52;

    .line 328
    .line 329
    check-cast v14, Ljava/util/ArrayList;

    .line 330
    .line 331
    check-cast v13, Lyg;

    .line 332
    .line 333
    move-object/from16 v1, p1

    .line 334
    .line 335
    check-cast v1, Landroid/database/Cursor;

    .line 336
    .line 337
    :goto_5
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    if-eqz v3, :cond_12

    .line 342
    .line 343
    const/4 v8, 0x0

    .line 344
    invoke-interface {v1, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 345
    .line 346
    .line 347
    move-result-wide v3

    .line 348
    const/4 v5, 0x7

    .line 349
    invoke-interface {v1, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 350
    .line 351
    .line 352
    move-result v5

    .line 353
    if-eqz v5, :cond_a

    .line 354
    .line 355
    move v5, v12

    .line 356
    goto :goto_6

    .line 357
    :cond_a
    const/4 v5, 0x0

    .line 358
    :goto_6
    new-instance v7, Lxy1;

    .line 359
    .line 360
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 361
    .line 362
    .line 363
    new-instance v6, Ljava/util/HashMap;

    .line 364
    .line 365
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 366
    .line 367
    .line 368
    iput-object v6, v7, Lxy1;->f:Ljava/lang/Object;

    .line 369
    .line 370
    invoke-interface {v1, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v6

    .line 374
    if-eqz v6, :cond_11

    .line 375
    .line 376
    iput-object v6, v7, Lxy1;->a:Ljava/lang/Object;

    .line 377
    .line 378
    invoke-interface {v1, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 379
    .line 380
    .line 381
    move-result-wide v8

    .line 382
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 383
    .line 384
    .line 385
    move-result-object v6

    .line 386
    iput-object v6, v7, Lxy1;->d:Ljava/lang/Object;

    .line 387
    .line 388
    const/4 v15, 0x3

    .line 389
    invoke-interface {v1, v15}, Landroid/database/Cursor;->getLong(I)J

    .line 390
    .line 391
    .line 392
    move-result-wide v8

    .line 393
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    iput-object v6, v7, Lxy1;->e:Ljava/lang/Object;

    .line 398
    .line 399
    if-eqz v5, :cond_c

    .line 400
    .line 401
    new-instance v5, Lsd0;

    .line 402
    .line 403
    const/4 v6, 0x4

    .line 404
    invoke-interface {v1, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v8

    .line 408
    if-nez v8, :cond_b

    .line 409
    .line 410
    sget-object v8, Ls52;->f:Lvd0;

    .line 411
    .line 412
    :goto_7
    const/4 v9, 0x5

    .line 413
    goto :goto_8

    .line 414
    :cond_b
    new-instance v9, Lvd0;

    .line 415
    .line 416
    invoke-direct {v9, v8}, Lvd0;-><init>(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    move-object v8, v9

    .line 420
    goto :goto_7

    .line 421
    :goto_8
    invoke-interface {v1, v9}, Landroid/database/Cursor;->getBlob(I)[B

    .line 422
    .line 423
    .line 424
    move-result-object v6

    .line 425
    invoke-direct {v5, v8, v6}, Lsd0;-><init>(Lvd0;[B)V

    .line 426
    .line 427
    .line 428
    iput-object v5, v7, Lxy1;->c:Ljava/lang/Object;

    .line 429
    .line 430
    move-object/from16 v22, v0

    .line 431
    .line 432
    const/16 v21, 0x0

    .line 433
    .line 434
    :goto_9
    const/4 v0, 0x6

    .line 435
    goto/16 :goto_d

    .line 436
    .line 437
    :cond_c
    const/4 v9, 0x5

    .line 438
    new-instance v5, Lsd0;

    .line 439
    .line 440
    const/4 v6, 0x4

    .line 441
    invoke-interface {v1, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v8

    .line 445
    if-nez v8, :cond_d

    .line 446
    .line 447
    sget-object v8, Ls52;->f:Lvd0;

    .line 448
    .line 449
    goto :goto_a

    .line 450
    :cond_d
    new-instance v6, Lvd0;

    .line 451
    .line 452
    invoke-direct {v6, v8}, Lvd0;-><init>(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    move-object v8, v6

    .line 456
    :goto_a
    invoke-virtual {v0}, Ls52;->c()Landroid/database/sqlite/SQLiteDatabase;

    .line 457
    .line 458
    .line 459
    move-result-object v17

    .line 460
    filled-new-array {v2}, [Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v19

    .line 464
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v6

    .line 468
    filled-new-array {v6}, [Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v21

    .line 472
    const/16 v23, 0x0

    .line 473
    .line 474
    const-string v24, "sequence_num"

    .line 475
    .line 476
    const-string v18, "event_payloads"

    .line 477
    .line 478
    const-string v20, "event_id = ?"

    .line 479
    .line 480
    const/16 v22, 0x0

    .line 481
    .line 482
    invoke-virtual/range {v17 .. v24}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 483
    .line 484
    .line 485
    move-result-object v6

    .line 486
    :try_start_4
    new-instance v9, Ljava/util/ArrayList;

    .line 487
    .line 488
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 489
    .line 490
    .line 491
    const/4 v10, 0x0

    .line 492
    :goto_b
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    .line 493
    .line 494
    .line 495
    move-result v19

    .line 496
    if-eqz v19, :cond_e

    .line 497
    .line 498
    const/4 v12, 0x0

    .line 499
    invoke-interface {v6, v12}, Landroid/database/Cursor;->getBlob(I)[B

    .line 500
    .line 501
    .line 502
    move-result-object v15

    .line 503
    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    array-length v12, v15

    .line 507
    add-int/2addr v10, v12

    .line 508
    const/4 v12, 0x1

    .line 509
    const/4 v15, 0x3

    .line 510
    goto :goto_b

    .line 511
    :cond_e
    new-array v10, v10, [B

    .line 512
    .line 513
    const/4 v12, 0x0

    .line 514
    const/4 v15, 0x0

    .line 515
    const/16 v21, 0x0

    .line 516
    .line 517
    :goto_c
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 518
    .line 519
    .line 520
    move-result v11

    .line 521
    if-ge v12, v11, :cond_f

    .line 522
    .line 523
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v11

    .line 527
    check-cast v11, [B

    .line 528
    .line 529
    move-object/from16 v22, v0

    .line 530
    .line 531
    array-length v0, v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 532
    move-object/from16 p1, v6

    .line 533
    .line 534
    const/4 v6, 0x0

    .line 535
    :try_start_5
    invoke-static {v11, v6, v10, v15, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 536
    .line 537
    .line 538
    array-length v0, v11
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 539
    add-int/2addr v15, v0

    .line 540
    add-int/lit8 v12, v12, 0x1

    .line 541
    .line 542
    move-object/from16 v6, p1

    .line 543
    .line 544
    move-object/from16 v0, v22

    .line 545
    .line 546
    goto :goto_c

    .line 547
    :catchall_2
    move-exception v0

    .line 548
    goto :goto_e

    .line 549
    :cond_f
    move-object/from16 v22, v0

    .line 550
    .line 551
    move-object/from16 p1, v6

    .line 552
    .line 553
    invoke-interface/range {p1 .. p1}, Landroid/database/Cursor;->close()V

    .line 554
    .line 555
    .line 556
    invoke-direct {v5, v8, v10}, Lsd0;-><init>(Lvd0;[B)V

    .line 557
    .line 558
    .line 559
    iput-object v5, v7, Lxy1;->c:Ljava/lang/Object;

    .line 560
    .line 561
    goto :goto_9

    .line 562
    :goto_d
    invoke-interface {v1, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 563
    .line 564
    .line 565
    move-result v5

    .line 566
    if-nez v5, :cond_10

    .line 567
    .line 568
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 569
    .line 570
    .line 571
    move-result v5

    .line 572
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 573
    .line 574
    .line 575
    move-result-object v5

    .line 576
    iput-object v5, v7, Lxy1;->b:Ljava/lang/Object;

    .line 577
    .line 578
    :cond_10
    invoke-virtual {v7}, Lxy1;->d()Lrf;

    .line 579
    .line 580
    .line 581
    move-result-object v5

    .line 582
    new-instance v6, Lhg;

    .line 583
    .line 584
    invoke-direct {v6, v3, v4, v13, v5}, Lhg;-><init>(JLyg;Lrf;)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    move-object/from16 v0, v22

    .line 591
    .line 592
    const/4 v10, 0x2

    .line 593
    const/4 v12, 0x1

    .line 594
    goto/16 :goto_5

    .line 595
    .line 596
    :catchall_3
    move-exception v0

    .line 597
    move-object/from16 p1, v6

    .line 598
    .line 599
    :goto_e
    invoke-interface/range {p1 .. p1}, Landroid/database/Cursor;->close()V

    .line 600
    .line 601
    .line 602
    throw v0

    .line 603
    :cond_11
    const/16 v21, 0x0

    .line 604
    .line 605
    const-string v0, "Null transportName"

    .line 606
    .line 607
    invoke-static {v0}, Ln4;->s(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    goto :goto_f

    .line 611
    :cond_12
    const/16 v21, 0x0

    .line 612
    .line 613
    :goto_f
    return-object v21

    .line 614
    :pswitch_1
    const/16 v21, 0x0

    .line 615
    .line 616
    check-cast v0, Ls52;

    .line 617
    .line 618
    check-cast v14, Lrf;

    .line 619
    .line 620
    iget-object v1, v14, Lrf;->c:Lsd0;

    .line 621
    .line 622
    iget-object v5, v14, Lrf;->a:Ljava/lang/String;

    .line 623
    .line 624
    check-cast v13, Lyg;

    .line 625
    .line 626
    move-object/from16 v6, p1

    .line 627
    .line 628
    check-cast v6, Landroid/database/sqlite/SQLiteDatabase;

    .line 629
    .line 630
    const/4 v8, 0x0

    .line 631
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 632
    .line 633
    .line 634
    move-result-object v7

    .line 635
    invoke-virtual {v0}, Ls52;->c()Landroid/database/sqlite/SQLiteDatabase;

    .line 636
    .line 637
    .line 638
    move-result-object v8

    .line 639
    invoke-virtual {v8, v4}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 640
    .line 641
    .line 642
    move-result-object v4

    .line 643
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    .line 644
    .line 645
    .line 646
    move-result-wide v10

    .line 647
    invoke-virtual {v0}, Ls52;->c()Landroid/database/sqlite/SQLiteDatabase;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    invoke-virtual {v4, v3}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 652
    .line 653
    .line 654
    move-result-object v3

    .line 655
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    .line 656
    .line 657
    .line 658
    move-result-wide v3

    .line 659
    mul-long/2addr v3, v10

    .line 660
    iget-object v8, v0, Ls52;->d:Lsf;

    .line 661
    .line 662
    iget-wide v10, v8, Lsf;->a:J

    .line 663
    .line 664
    cmp-long v3, v3, v10

    .line 665
    .line 666
    if-ltz v3, :cond_13

    .line 667
    .line 668
    const-wide/16 v1, 0x1

    .line 669
    .line 670
    invoke-virtual {v0, v1, v2, v9, v5}, Ls52;->i(JLca1;Ljava/lang/String;)V

    .line 671
    .line 672
    .line 673
    const-wide/16 v0, -0x1

    .line 674
    .line 675
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    goto/16 :goto_15

    .line 680
    .line 681
    :cond_13
    invoke-static {v6, v13}, Ls52;->f(Landroid/database/sqlite/SQLiteDatabase;Lyg;)Ljava/lang/Long;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    if-eqz v0, :cond_14

    .line 686
    .line 687
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 688
    .line 689
    .line 690
    move-result-wide v3

    .line 691
    goto :goto_10

    .line 692
    :cond_14
    new-instance v0, Landroid/content/ContentValues;

    .line 693
    .line 694
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 695
    .line 696
    .line 697
    const-string v3, "backend_name"

    .line 698
    .line 699
    iget-object v4, v13, Lyg;->a:Ljava/lang/String;

    .line 700
    .line 701
    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 702
    .line 703
    .line 704
    iget-object v3, v13, Lyg;->c:Lpx1;

    .line 705
    .line 706
    invoke-static {v3}, Lrx1;->a(Lpx1;)I

    .line 707
    .line 708
    .line 709
    move-result v3

    .line 710
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 711
    .line 712
    .line 713
    move-result-object v3

    .line 714
    const-string v4, "priority"

    .line 715
    .line 716
    invoke-virtual {v0, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 717
    .line 718
    .line 719
    const-string v3, "next_request_ms"

    .line 720
    .line 721
    invoke-virtual {v0, v3, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 722
    .line 723
    .line 724
    iget-object v3, v13, Lyg;->b:[B

    .line 725
    .line 726
    if-eqz v3, :cond_15

    .line 727
    .line 728
    const-string v4, "extras"

    .line 729
    .line 730
    const/4 v12, 0x0

    .line 731
    invoke-static {v3, v12}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object v3

    .line 735
    invoke-virtual {v0, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 736
    .line 737
    .line 738
    :cond_15
    const-string v3, "transport_contexts"

    .line 739
    .line 740
    move-object/from16 v4, v21

    .line 741
    .line 742
    invoke-virtual {v6, v3, v4, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 743
    .line 744
    .line 745
    move-result-wide v9

    .line 746
    move-wide v3, v9

    .line 747
    :goto_10
    iget v0, v8, Lsf;->e:I

    .line 748
    .line 749
    iget-object v8, v1, Lsd0;->b:[B

    .line 750
    .line 751
    array-length v9, v8

    .line 752
    if-gt v9, v0, :cond_16

    .line 753
    .line 754
    const/4 v9, 0x1

    .line 755
    goto :goto_11

    .line 756
    :cond_16
    const/4 v9, 0x0

    .line 757
    :goto_11
    new-instance v10, Landroid/content/ContentValues;

    .line 758
    .line 759
    invoke-direct {v10}, Landroid/content/ContentValues;-><init>()V

    .line 760
    .line 761
    .line 762
    const-string v11, "context_id"

    .line 763
    .line 764
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 765
    .line 766
    .line 767
    move-result-object v3

    .line 768
    invoke-virtual {v10, v11, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 769
    .line 770
    .line 771
    const-string v3, "transport_name"

    .line 772
    .line 773
    invoke-virtual {v10, v3, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 774
    .line 775
    .line 776
    iget-wide v3, v14, Lrf;->d:J

    .line 777
    .line 778
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 779
    .line 780
    .line 781
    move-result-object v3

    .line 782
    const-string v4, "timestamp_ms"

    .line 783
    .line 784
    invoke-virtual {v10, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 785
    .line 786
    .line 787
    iget-wide v3, v14, Lrf;->e:J

    .line 788
    .line 789
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 790
    .line 791
    .line 792
    move-result-object v3

    .line 793
    const-string v4, "uptime_ms"

    .line 794
    .line 795
    invoke-virtual {v10, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 796
    .line 797
    .line 798
    iget-object v1, v1, Lsd0;->a:Lvd0;

    .line 799
    .line 800
    iget-object v1, v1, Lvd0;->a:Ljava/lang/String;

    .line 801
    .line 802
    const-string v3, "payload_encoding"

    .line 803
    .line 804
    invoke-virtual {v10, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 805
    .line 806
    .line 807
    const-string v1, "code"

    .line 808
    .line 809
    iget-object v3, v14, Lrf;->b:Ljava/lang/Integer;

    .line 810
    .line 811
    invoke-virtual {v10, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 812
    .line 813
    .line 814
    const-string v1, "num_attempts"

    .line 815
    .line 816
    invoke-virtual {v10, v1, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 817
    .line 818
    .line 819
    const-string v1, "inline"

    .line 820
    .line 821
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 822
    .line 823
    .line 824
    move-result-object v3

    .line 825
    invoke-virtual {v10, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 826
    .line 827
    .line 828
    if-eqz v9, :cond_17

    .line 829
    .line 830
    move-object v1, v8

    .line 831
    goto :goto_12

    .line 832
    :cond_17
    const/4 v12, 0x0

    .line 833
    new-array v1, v12, [B

    .line 834
    .line 835
    :goto_12
    const-string v3, "payload"

    .line 836
    .line 837
    invoke-virtual {v10, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 838
    .line 839
    .line 840
    const-string v1, "events"

    .line 841
    .line 842
    const/4 v4, 0x0

    .line 843
    invoke-virtual {v6, v1, v4, v10}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 844
    .line 845
    .line 846
    move-result-wide v10

    .line 847
    const-string v1, "event_id"

    .line 848
    .line 849
    if-nez v9, :cond_18

    .line 850
    .line 851
    array-length v3, v8

    .line 852
    int-to-double v3, v3

    .line 853
    int-to-double v12, v0

    .line 854
    div-double/2addr v3, v12

    .line 855
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 856
    .line 857
    .line 858
    move-result-wide v3

    .line 859
    double-to-int v3, v3

    .line 860
    const/4 v12, 0x1

    .line 861
    :goto_13
    if-gt v12, v3, :cond_18

    .line 862
    .line 863
    add-int/lit8 v4, v12, -0x1

    .line 864
    .line 865
    mul-int/2addr v4, v0

    .line 866
    mul-int v5, v12, v0

    .line 867
    .line 868
    array-length v7, v8

    .line 869
    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    .line 870
    .line 871
    .line 872
    move-result v5

    .line 873
    invoke-static {v8, v4, v5}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 874
    .line 875
    .line 876
    move-result-object v4

    .line 877
    new-instance v5, Landroid/content/ContentValues;

    .line 878
    .line 879
    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    .line 880
    .line 881
    .line 882
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 883
    .line 884
    .line 885
    move-result-object v7

    .line 886
    invoke-virtual {v5, v1, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 887
    .line 888
    .line 889
    const-string v7, "sequence_num"

    .line 890
    .line 891
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 892
    .line 893
    .line 894
    move-result-object v9

    .line 895
    invoke-virtual {v5, v7, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v5, v2, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 899
    .line 900
    .line 901
    const-string v4, "event_payloads"

    .line 902
    .line 903
    const/4 v7, 0x0

    .line 904
    invoke-virtual {v6, v4, v7, v5}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 905
    .line 906
    .line 907
    add-int/lit8 v12, v12, 0x1

    .line 908
    .line 909
    goto :goto_13

    .line 910
    :cond_18
    iget-object v0, v14, Lrf;->f:Ljava/util/Map;

    .line 911
    .line 912
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 913
    .line 914
    .line 915
    move-result-object v0

    .line 916
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    :goto_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 925
    .line 926
    .line 927
    move-result v2

    .line 928
    if-eqz v2, :cond_19

    .line 929
    .line 930
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v2

    .line 934
    check-cast v2, Ljava/util/Map$Entry;

    .line 935
    .line 936
    new-instance v3, Landroid/content/ContentValues;

    .line 937
    .line 938
    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 939
    .line 940
    .line 941
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 942
    .line 943
    .line 944
    move-result-object v4

    .line 945
    invoke-virtual {v3, v1, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 946
    .line 947
    .line 948
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v4

    .line 952
    check-cast v4, Ljava/lang/String;

    .line 953
    .line 954
    const-string v5, "name"

    .line 955
    .line 956
    invoke-virtual {v3, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 957
    .line 958
    .line 959
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-result-object v2

    .line 963
    check-cast v2, Ljava/lang/String;

    .line 964
    .line 965
    const-string v4, "value"

    .line 966
    .line 967
    invoke-virtual {v3, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 968
    .line 969
    .line 970
    const-string v2, "event_metadata"

    .line 971
    .line 972
    const/4 v4, 0x0

    .line 973
    invoke-virtual {v6, v2, v4, v3}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 974
    .line 975
    .line 976
    goto :goto_14

    .line 977
    :cond_19
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 978
    .line 979
    .line 980
    move-result-object v0

    .line 981
    :goto_15
    return-object v0

    .line 982
    nop

    .line 983
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;)Ls81;
    .locals 19

    move-object/from16 v0, p0

    const-string v1, "openCaptureSession() should not be possible in state: "

    const-string v2, "openCaptureSession() not execute in state: "

    iget-object v3, v0, Lpr;->b:Ljava/lang/Object;

    check-cast v3, Lrr;

    iget-object v4, v0, Lpr;->c:Ljava/lang/Object;

    check-cast v4, Lfb2;

    iget-object v0, v0, Lpr;->d:Ljava/lang/Object;

    check-cast v0, Landroid/hardware/camera2/CameraDevice;

    move-object/from16 v5, p1

    check-cast v5, Ljava/util/List;

    .line 983
    iget-object v6, v3, Lrr;->a:Ljava/lang/Object;

    monitor-enter v6

    .line 984
    :try_start_0
    iget v7, v3, Lrr;->i:I

    invoke-static {v7}, Len;->y(I)I

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_a

    if-eq v7, v8, :cond_a

    const/4 v9, 0x2

    const/4 v10, 0x4

    if-eq v7, v9, :cond_0

    if-eq v7, v10, :cond_a

    .line 985
    new-instance v0, Ljava/util/concurrent/CancellationException;

    iget v1, v3, Lrr;->i:I

    invoke-static {v1}, Len;->C(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 986
    new-instance v1, Ltw0;

    invoke-direct {v1, v0, v8}, Ltw0;-><init>(Ljava/lang/Object;I)V

    .line 987
    monitor-exit v6

    return-object v1

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    .line 988
    :cond_0
    iget-object v1, v3, Lrr;->g:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    const/4 v1, 0x0

    move v2, v1

    .line 989
    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    if-ge v2, v7, :cond_1

    .line 990
    iget-object v7, v3, Lrr;->g:Ljava/util/HashMap;

    iget-object v11, v3, Lrr;->h:Ljava/util/List;

    invoke-interface {v11, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ld70;

    .line 991
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/Surface;

    .line 992
    invoke-virtual {v7, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 993
    :cond_1
    iput v10, v3, Lrr;->i:I

    .line 994
    const-string v2, "CaptureSession"

    .line 995
    invoke-static {v2}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 996
    iget-object v2, v3, Lrr;->c:Lqr;

    new-instance v5, Lqr;

    .line 997
    iget-object v7, v4, Lfb2;->d:Ljava/util/List;

    .line 998
    invoke-direct {v5, v7, v8}, Lqr;-><init>(Ljava/util/List;I)V

    new-array v7, v9, [Lck2;

    aput-object v2, v7, v1

    aput-object v5, v7, v8

    .line 999
    new-instance v1, Lqr;

    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2, v9}, Lqr;-><init>(Ljava/util/List;I)V

    .line 1000
    new-instance v2, Lho;

    .line 1001
    iget-object v5, v4, Lfb2;->g:Ljr;

    .line 1002
    iget-object v7, v5, Ljr;->b:Lnq1;

    .line 1003
    invoke-direct {v2, v7}, Ld52;-><init>(Ljava/lang/Object;)V

    .line 1004
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 1005
    invoke-static {}, Luk1;->j()Luk1;

    .line 1006
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1007
    invoke-static {}, Lcl1;->a()Lcl1;

    .line 1008
    iget-object v10, v5, Ljr;->a:Ljava/util/ArrayList;

    invoke-interface {v7, v10}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 1009
    iget-object v10, v5, Ljr;->b:Lnq1;

    invoke-static {v10}, Luk1;->m(Lty;)Luk1;

    move-result-object v10

    .line 1010
    iget v14, v5, Ljr;->c:I

    .line 1011
    iget-object v11, v5, Ljr;->d:Ljava/util/List;

    .line 1012
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1013
    iget-boolean v11, v5, Ljr;->e:Z

    .line 1014
    iget-object v5, v5, Ljr;->f:Lnm2;

    .line 1015
    new-instance v12, Landroid/util/ArrayMap;

    invoke-direct {v12}, Landroid/util/ArrayMap;-><init>()V

    .line 1016
    iget-object v13, v5, Lnm2;->a:Landroid/util/ArrayMap;

    .line 1017
    invoke-virtual {v13}, Landroid/util/ArrayMap;->keySet()Ljava/util/Set;

    move-result-object v13

    .line 1018
    invoke-interface {v13}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_2

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    .line 1019
    iget-object v8, v5, Lnm2;->a:Landroid/util/ArrayMap;

    invoke-virtual {v8, v15}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    .line 1020
    invoke-virtual {v12, v15, v8}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v8, 0x1

    goto :goto_1

    .line 1021
    :cond_2
    new-instance v5, Lcl1;

    .line 1022
    invoke-direct {v5, v12}, Lnm2;-><init>(Landroid/util/ArrayMap;)V

    .line 1023
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1024
    iget-object v2, v2, Ld52;->a:Ljava/lang/Object;

    check-cast v2, Lty;

    .line 1025
    sget-object v12, Lho;->W:Llf;

    const/4 v13, 0x0

    invoke-interface {v2, v12, v13}, Lty;->b(Llf;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 1026
    iget-object v12, v4, Lfb2;->a:Ljava/util/ArrayList;

    .line 1027
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lmg;

    .line 1028
    iget-object v15, v3, Lrr;->g:Ljava/util/HashMap;

    .line 1029
    invoke-virtual {v3, v13, v15, v2}, Lrr;->d(Lmg;Ljava/util/HashMap;Ljava/lang/String;)Loq1;

    move-result-object v15

    move-object/from16 p1, v2

    .line 1030
    iget-object v2, v3, Lrr;->l:Ljava/util/HashMap;

    move-object/from16 v16, v10

    .line 1031
    iget-object v10, v13, Lmg;->a:Ld70;

    .line 1032
    invoke-virtual {v2, v10}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1033
    iget-object v2, v3, Lrr;->l:Ljava/util/HashMap;

    .line 1034
    iget-object v10, v13, Lmg;->a:Ld70;

    .line 1035
    invoke-virtual {v2, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    move v13, v11

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    .line 1036
    iget-object v2, v15, Loq1;->a:Lqq1;

    invoke-virtual {v2, v10, v11}, Lqq1;->i(J)V

    goto :goto_3

    :cond_3
    move v13, v11

    .line 1037
    :goto_3
    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p1

    move v11, v13

    move-object/from16 v10, v16

    goto :goto_2

    :cond_4
    move-object/from16 v16, v10

    move v13, v11

    .line 1038
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1039
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 1040
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Loq1;

    .line 1041
    iget-object v12, v11, Loq1;->a:Lqq1;

    .line 1042
    invoke-virtual {v12}, Lqq1;->c()Ljava/lang/Object;

    move-result-object v12

    .line 1043
    check-cast v12, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-virtual {v12}, Landroid/hardware/camera2/params/OutputConfiguration;->getSurface()Landroid/view/Surface;

    move-result-object v12

    .line 1044
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    goto :goto_4

    .line 1045
    :cond_5
    iget-object v12, v11, Loq1;->a:Lqq1;

    .line 1046
    invoke-virtual {v12}, Lqq1;->c()Ljava/lang/Object;

    move-result-object v12

    .line 1047
    check-cast v12, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-virtual {v12}, Landroid/hardware/camera2/params/OutputConfiguration;->getSurface()Landroid/view/Surface;

    move-result-object v12

    .line 1048
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1049
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 1050
    :cond_6
    iget-object v2, v3, Lrr;->d:Lgk2;

    .line 1051
    iput-object v1, v2, Lgk2;->f:Lqr;

    .line 1052
    new-instance v1, Lkb2;

    .line 1053
    iget-object v8, v2, Lgk2;->d:Ly92;

    .line 1054
    new-instance v11, Ldp;

    const/4 v12, 0x1

    invoke-direct {v11, v2, v12}, Ldp;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v1, v10, v8, v11}, Lkb2;-><init>(Ljava/util/ArrayList;Ly92;Ldp;)V

    .line 1055
    iget-object v2, v4, Lfb2;->g:Ljr;

    .line 1056
    iget v2, v2, Ljr;->c:I

    const/4 v8, 0x5

    if-ne v2, v8, :cond_7

    .line 1057
    iget-object v2, v4, Lfb2;->h:Landroid/hardware/camera2/params/InputConfiguration;

    if-eqz v2, :cond_7

    .line 1058
    invoke-static {v2}, Lby0;->a(Ljava/lang/Object;)Lby0;

    move-result-object v2

    .line 1059
    iget-object v4, v1, Lkb2;->a:Ljb2;

    invoke-interface {v4, v2}, Ljb2;->h(Lby0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1060
    :cond_7
    :try_start_1
    new-instance v11, Ljr;

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1061
    invoke-static/range {v16 .. v16}, Lnq1;->d(Lty;)Lnq1;

    move-result-object v2

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1062
    sget-object v4, Lnm2;->b:Lnm2;

    .line 1063
    new-instance v4, Landroid/util/ArrayMap;

    invoke-direct {v4}, Landroid/util/ArrayMap;-><init>()V

    .line 1064
    iget-object v7, v5, Lnm2;->a:Landroid/util/ArrayMap;

    .line 1065
    invoke-virtual {v7}, Landroid/util/ArrayMap;->keySet()Ljava/util/Set;

    move-result-object v7

    .line 1066
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 1067
    iget-object v9, v5, Lnm2;->a:Landroid/util/ArrayMap;

    invoke-virtual {v9, v8}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    .line 1068
    invoke-virtual {v4, v8, v9}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 1069
    :cond_8
    new-instance v5, Lnm2;

    invoke-direct {v5, v4}, Lnm2;-><init>(Landroid/util/ArrayMap;)V

    const/16 v18, 0x0

    move-object/from16 v17, v5

    move/from16 v16, v13

    move-object v13, v2

    .line 1070
    invoke-direct/range {v11 .. v18}, Ljr;-><init>(Ljava/util/ArrayList;Lnq1;ILjava/util/ArrayList;ZLnm2;Lso;)V

    .line 1071
    iget-object v2, v3, Lrr;->q:Lme;

    .line 1072
    invoke-static {v11, v0, v2}, Ljb1;->k(Ljr;Landroid/hardware/camera2/CameraDevice;Lme;)Landroid/hardware/camera2/CaptureRequest;

    move-result-object v2

    if-eqz v2, :cond_9

    .line 1073
    iget-object v4, v1, Lkb2;->a:Ljb2;

    invoke-interface {v4, v2}, Ljb2;->g(Landroid/hardware/camera2/CaptureRequest;)V
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1074
    :cond_9
    :try_start_2
    iget-object v2, v3, Lrr;->d:Lgk2;

    iget-object v3, v3, Lrr;->h:Ljava/util/List;

    invoke-virtual {v2, v0, v1, v3}, Lgk2;->n(Landroid/hardware/camera2/CameraDevice;Lkb2;Ljava/util/List;)Ls81;

    move-result-object v0

    monitor-exit v6

    return-object v0

    :catch_0
    move-exception v0

    .line 1075
    new-instance v1, Ltw0;

    const/4 v12, 0x1

    invoke-direct {v1, v0, v12}, Ltw0;-><init>(Ljava/lang/Object;I)V

    .line 1076
    monitor-exit v6

    return-object v1

    .line 1077
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    iget v2, v3, Lrr;->i:I

    invoke-static {v2}, Len;->C(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1078
    new-instance v1, Ltw0;

    const/4 v12, 0x1

    invoke-direct {v1, v0, v12}, Ltw0;-><init>(Ljava/lang/Object;I)V

    .line 1079
    monitor-exit v6

    return-object v1

    .line 1080
    :goto_6
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public b(Lio/sentry/a7;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lpr;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/x6;

    .line 4
    .line 5
    iget-object v1, p0, Lpr;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lio/sentry/c7;

    .line 8
    .line 9
    iget-object p0, p0, Lpr;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v1, p1}, Lio/sentry/c7;->b(Lio/sentry/a7;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p1, v0, Lio/sentry/x6;->r:Lio/sentry/k7;

    .line 19
    .line 20
    iget-object p1, p1, Lio/sentry/k7;->i:Lio/sentry/android/core/e;

    .line 21
    .line 22
    if-eqz p1, :cond_7

    .line 23
    .line 24
    iget-object v1, p1, Lio/sentry/android/core/e;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lio/sentry/android/core/ActivityLifecycleIntegration;

    .line 27
    .line 28
    iget-object v2, p1, Lio/sentry/android/core/e;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    iget-object p1, p1, Lio/sentry/android/core/e;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Landroid/app/Activity;

    .line 41
    .line 42
    if-eqz v2, :cond_6

    .line 43
    .line 44
    iget-object p1, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->c0:Lio/sentry/android/core/d;

    .line 45
    .line 46
    invoke-interface {v0}, Lio/sentry/m1;->g()Lio/sentry/protocol/w;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v3, "none"

    .line 51
    .line 52
    iget-object v4, p1, Lio/sentry/android/core/d;->g:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Lio/sentry/util/a;

    .line 55
    .line 56
    invoke-virtual {v4}, Lio/sentry/util/a;->c()V

    .line 57
    .line 58
    .line 59
    :try_start_0
    invoke-virtual {p1}, Lio/sentry/android/core/d;->e()Z

    .line 60
    .line 61
    .line 62
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    if-nez v5, :cond_2

    .line 64
    .line 65
    :cond_1
    :goto_0
    invoke-virtual {v4}, Lio/sentry/util/a;->close()V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_3

    .line 69
    .line 70
    :cond_2
    :try_start_1
    new-instance v5, Lio/sentry/android/core/b;

    .line 71
    .line 72
    const/4 v6, 0x1

    .line 73
    invoke-direct {v5, p1, v2, v6}, Lio/sentry/android/core/b;-><init>(Lio/sentry/android/core/d;Landroid/app/Activity;I)V

    .line 74
    .line 75
    .line 76
    const/4 v6, 0x0

    .line 77
    invoke-virtual {p1, v5, v6}, Lio/sentry/android/core/d;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v5, p1, Lio/sentry/android/core/d;->e:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v5, Ljava/util/WeakHashMap;

    .line 83
    .line 84
    invoke-virtual {v5, v2}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    check-cast v2, Lio/sentry/android/core/c;

    .line 89
    .line 90
    if-nez v2, :cond_3

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    invoke-virtual {p1}, Lio/sentry/android/core/d;->b()Lio/sentry/android/core/c;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    if-nez v5, :cond_4

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    iget v6, v5, Lio/sentry/android/core/c;->a:I

    .line 101
    .line 102
    iget v7, v2, Lio/sentry/android/core/c;->a:I

    .line 103
    .line 104
    sub-int/2addr v6, v7

    .line 105
    iget v7, v5, Lio/sentry/android/core/c;->b:I

    .line 106
    .line 107
    iget v8, v2, Lio/sentry/android/core/c;->b:I

    .line 108
    .line 109
    sub-int/2addr v7, v8

    .line 110
    iget v5, v5, Lio/sentry/android/core/c;->c:I

    .line 111
    .line 112
    iget v2, v2, Lio/sentry/android/core/c;->c:I

    .line 113
    .line 114
    sub-int/2addr v5, v2

    .line 115
    new-instance v2, Lio/sentry/android/core/c;

    .line 116
    .line 117
    invoke-direct {v2, v6, v7, v5}, Lio/sentry/android/core/c;-><init>(III)V

    .line 118
    .line 119
    .line 120
    move-object v6, v2

    .line 121
    :goto_1
    if-eqz v6, :cond_1

    .line 122
    .line 123
    iget v2, v6, Lio/sentry/android/core/c;->c:I

    .line 124
    .line 125
    iget v5, v6, Lio/sentry/android/core/c;->b:I

    .line 126
    .line 127
    iget v6, v6, Lio/sentry/android/core/c;->a:I

    .line 128
    .line 129
    if-nez v6, :cond_5

    .line 130
    .line 131
    if-nez v5, :cond_5

    .line 132
    .line 133
    if-nez v2, :cond_5

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_5
    new-instance v7, Lio/sentry/protocol/n;

    .line 137
    .line 138
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-direct {v7, v3, v6}, Lio/sentry/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/Number;)V

    .line 143
    .line 144
    .line 145
    new-instance v6, Lio/sentry/protocol/n;

    .line 146
    .line 147
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-direct {v6, v3, v5}, Lio/sentry/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/Number;)V

    .line 152
    .line 153
    .line 154
    new-instance v5, Lio/sentry/protocol/n;

    .line 155
    .line 156
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-direct {v5, v3, v2}, Lio/sentry/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/Number;)V

    .line 161
    .line 162
    .line 163
    new-instance v2, Ljava/util/HashMap;

    .line 164
    .line 165
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 166
    .line 167
    .line 168
    const-string v3, "frames_total"

    .line 169
    .line 170
    invoke-virtual {v2, v3, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    const-string v3, "frames_slow"

    .line 174
    .line 175
    invoke-virtual {v2, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    const-string v3, "frames_frozen"

    .line 179
    .line 180
    invoke-virtual {v2, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    iget-object p1, p1, Lio/sentry/android/core/d;->d:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 186
    .line 187
    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 188
    .line 189
    .line 190
    goto :goto_0

    .line 191
    :catchall_0
    move-exception p0

    .line 192
    :try_start_2
    invoke-virtual {v4}, Lio/sentry/util/a;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :catchall_1
    move-exception p1

    .line 197
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    :goto_2
    throw p0

    .line 201
    :cond_6
    iget-object v1, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 202
    .line 203
    if-eqz v1, :cond_7

    .line 204
    .line 205
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    sget-object v2, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 210
    .line 211
    const-string v3, "Unable to track activity frames as the Activity %s has been destroyed."

    .line 212
    .line 213
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-interface {v1, v2, v3, p1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    :cond_7
    :goto_3
    iget-object p1, v0, Lio/sentry/x6;->q:Lio/sentry/m;

    .line 221
    .line 222
    if-eqz p1, :cond_8

    .line 223
    .line 224
    invoke-interface {p1, v0}, Lio/sentry/m;->f(Lio/sentry/m1;)Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    :cond_8
    return-void
.end method

.method public c(Lio/sentry/m1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lpr;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/android/core/internal/gestures/g;

    .line 4
    .line 5
    iget-object v1, p0, Lpr;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lio/sentry/a1;

    .line 8
    .line 9
    iget-object p0, p0, Lpr;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lio/sentry/m1;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    invoke-interface {v1, p0}, Lio/sentry/a1;->I(Lio/sentry/m1;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object p1, v0, Lio/sentry/android/core/internal/gestures/g;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 20
    .line 21
    invoke-virtual {p1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    sget-object v0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 26
    .line 27
    invoke-interface {p0}, Lio/sentry/m1;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v1, "Transaction \'%s\' won\'t be bound to the Scope since there\'s one already in there."

    .line 36
    .line 37
    invoke-interface {p1, v0, v1, p0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public execute()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lpr;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ln60;

    .line 4
    .line 5
    iget-object v1, p0, Lpr;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lyg;

    .line 8
    .line 9
    iget-object p0, p0, Lpr;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lrf;

    .line 12
    .line 13
    iget-object v2, v0, Ln60;->d:Ls52;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v3, v1, Lyg;->c:Lpx1;

    .line 19
    .line 20
    const-string v4, "SQLiteEventStore"

    .line 21
    .line 22
    invoke-static {v4}, Lpy0;->l0(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/4 v5, 0x3

    .line 27
    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    new-instance v4, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v5, "Storing event with priority="

    .line 36
    .line 37
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    :cond_0
    new-instance v3, Lpr;

    .line 44
    .line 45
    const/4 v4, 0x4

    .line 46
    invoke-direct {v3, v4, v2, p0, v1}, Lpr;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v3}, Ls52;->g(Lq52;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Ljava/lang/Long;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object p0, v0, Ln60;->a:Lec;

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    const/4 v2, 0x0

    .line 62
    invoke-virtual {p0, v1, v0, v2}, Lec;->K(Lyg;IZ)V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    return-object p0
.end method

.method public then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 7

    .line 1
    iget-object v0, p0, Lpr;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 4
    .line 5
    iget-object v1, p0, Lpr;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lpr;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lhh2;

    .line 12
    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v2, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    .line 16
    .line 17
    invoke-static {v2}, Lcom/google/firebase/messaging/FirebaseMessaging;->c(Landroid/content/Context;)Lxi1;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string v3, "[DEFAULT]"

    .line 22
    .line 23
    iget-object v4, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lvi0;

    .line 24
    .line 25
    invoke-virtual {v4}, Lvi0;->a()V

    .line 26
    .line 27
    .line 28
    iget-object v5, v4, Lvi0;->b:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    const-string v3, ""

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v4}, Lvi0;->d()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    :goto_0
    iget-object v4, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->h:Lsz;

    .line 44
    .line 45
    invoke-virtual {v4}, Lsz;->a()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    monitor-enter v2

    .line 50
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 51
    .line 52
    .line 53
    move-result-wide v5

    .line 54
    invoke-static {p1, v5, v6, v4}, Lhh2;->c(Ljava/lang/String;JLjava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    if-nez v4, :cond_1

    .line 59
    .line 60
    monitor-exit v2

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    :try_start_1
    iget-object v5, v2, Lxi1;->a:Landroid/content/SharedPreferences;

    .line 63
    .line 64
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    new-instance v6, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v3, "|T|"

    .line 77
    .line 78
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, "|*"

    .line 85
    .line 86
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-interface {v5, v1, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 94
    .line 95
    .line 96
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    .line 98
    .line 99
    monitor-exit v2

    .line 100
    :goto_1
    if-eqz p0, :cond_2

    .line 101
    .line 102
    iget-object p0, p0, Lhh2;->b:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p0, Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-nez p0, :cond_4

    .line 111
    .line 112
    :cond_2
    const-string p0, "[DEFAULT]"

    .line 113
    .line 114
    iget-object v1, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lvi0;

    .line 115
    .line 116
    invoke-virtual {v1}, Lvi0;->a()V

    .line 117
    .line 118
    .line 119
    iget-object v2, v1, Lvi0;->b:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    if-eqz p0, :cond_4

    .line 126
    .line 127
    const-string p0, "FirebaseMessaging"

    .line 128
    .line 129
    const/4 v2, 0x3

    .line 130
    invoke-static {p0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    if-eqz p0, :cond_3

    .line 135
    .line 136
    invoke-virtual {v1}, Lvi0;->a()V

    .line 137
    .line 138
    .line 139
    :cond_3
    new-instance p0, Landroid/content/Intent;

    .line 140
    .line 141
    const-string v1, "com.google.firebase.messaging.NEW_TOKEN"

    .line 142
    .line 143
    invoke-direct {p0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    const-string v1, "token"

    .line 147
    .line 148
    invoke-virtual {p0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 149
    .line 150
    .line 151
    new-instance v1, Lcb;

    .line 152
    .line 153
    iget-object v0, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    .line 154
    .line 155
    const/4 v2, 0x1

    .line 156
    invoke-direct {v1, v0, v2}, Lcb;-><init>(Landroid/content/Context;I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, p0}, Lcb;->F(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    .line 160
    .line 161
    .line 162
    :cond_4
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    return-object p0

    .line 167
    :catchall_0
    move-exception p0

    .line 168
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 169
    throw p0
.end method

.method public w(Lum;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lpr;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lxm;

    .line 4
    .line 5
    iget-object v1, p0, Lpr;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ly92;

    .line 8
    .line 9
    iget-object p0, p0, Lpr;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance v2, Ls2;

    .line 14
    .line 15
    const/16 v3, 0x10

    .line 16
    .line 17
    invoke-direct {v2, v0, v3}, Ls2;-><init>(Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    iget-object v3, p1, Lum;->c:Lu32;

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v3, v2, v1}, Ll0;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    new-instance v2, Ld52;

    .line 28
    .line 29
    invoke-direct {v2, p1}, Ld52;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    new-instance p1, Ldp0;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-direct {p1, v3, v0, v2}, Ldp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1, v1}, Lxm;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 39
    .line 40
    .line 41
    new-instance p1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v0, "surfaceList["

    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string p0, "]"

    .line 52
    .line 53
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method

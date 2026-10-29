.class public final Lwh3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:I

.field public b:J

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lfd3;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lwh3;->a:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh3;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwh3;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwh3;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lwh3;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lwh3;->e:Ljava/lang/Object;

    .line 12
    .line 13
    iput-wide p4, p0, Lwh3;->b:J

    .line 14
    .line 15
    return-void
.end method

.method public static b(Lcom/google/android/gms/measurement/internal/zzbg;)Lwh3;
    .locals 6

    .line 1
    new-instance v0, Lwh3;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzbg;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzbg;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzbg;->b:Lcom/google/android/gms/measurement/internal/zzbe;

    .line 8
    .line 9
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzbe;->G1()Landroid/os/Bundle;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-wide v4, p0, Lcom/google/android/gms/measurement/internal/zzbg;->d:J

    .line 14
    .line 15
    invoke-direct/range {v0 .. v5}, Lwh3;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhs;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhs;->zzd()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v6

    .line 11
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzhs;->zza()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v12

    .line 15
    iget-object v0, v1, Lwh3;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lfd3;

    .line 18
    .line 19
    iget-object v2, v0, Lqo3;->b:Lmp3;

    .line 20
    .line 21
    iget-object v3, v0, Lqo3;->b:Lmp3;

    .line 22
    .line 23
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v4, v0

    .line 26
    check-cast v4, Lij3;

    .line 27
    .line 28
    invoke-virtual {v2}, Lmp3;->i0()Lci3;

    .line 29
    .line 30
    .line 31
    const-string v8, "_eid"

    .line 32
    .line 33
    invoke-static {v5, v8}, Lci3;->H(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v9, 0x0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    move-object v0, v9

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {v0}, Lci3;->O(Lcom/google/android/gms/internal/measurement/zzhw;)Ljava/io/Serializable;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_0
    move-object v10, v0

    .line 47
    check-cast v10, Ljava/lang/Long;

    .line 48
    .line 49
    if-eqz v10, :cond_12

    .line 50
    .line 51
    const-string v0, "_ep"

    .line 52
    .line 53
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_e

    .line 58
    .line 59
    invoke-virtual {v2}, Lmp3;->i0()Lci3;

    .line 60
    .line 61
    .line 62
    const-string v0, "_en"

    .line 63
    .line 64
    invoke-static {v5, v0}, Lci3;->H(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-nez v0, :cond_1

    .line 69
    .line 70
    move-object v0, v9

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-static {v0}, Lci3;->O(Lcom/google/android/gms/internal/measurement/zzhw;)Ljava/io/Serializable;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    :goto_1
    move-object v15, v0

    .line 77
    check-cast v15, Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    iget-object v0, v4, Lij3;->f:Luh3;

    .line 86
    .line 87
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, v0, Luh3;->i:Lsh3;

    .line 91
    .line 92
    const-string v1, "Extra parameter without an event name. eventId"

    .line 93
    .line 94
    invoke-virtual {v0, v10, v1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-object v9

    .line 98
    :cond_2
    iget-object v0, v1, Lwh3;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 101
    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    iget-object v0, v1, Lwh3;->d:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Ljava/lang/Long;

    .line 107
    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 111
    .line 112
    .line 113
    move-result-wide v16

    .line 114
    iget-object v0, v1, Lwh3;->d:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, Ljava/lang/Long;

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 119
    .line 120
    .line 121
    move-result-wide v18

    .line 122
    cmp-long v0, v16, v18

    .line 123
    .line 124
    if-eqz v0, :cond_3

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_3
    const-wide/16 v17, 0x0

    .line 128
    .line 129
    goto/16 :goto_b

    .line 130
    .line 131
    :cond_4
    :goto_2
    iget-object v0, v2, Lmp3;->c:Lae3;

    .line 132
    .line 133
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 134
    .line 135
    .line 136
    iget-object v2, v0, Lsq3;->a:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v2, Lij3;

    .line 139
    .line 140
    invoke-virtual {v0}, Lsq3;->y()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Lwo3;->A()V

    .line 144
    .line 145
    .line 146
    :try_start_0
    invoke-virtual {v0}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    const-string v6, "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"

    .line 151
    .line 152
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v11

    .line 156
    filled-new-array {v7, v11}, [Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v11

    .line 160
    invoke-virtual {v0, v6, v11}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 161
    .line 162
    .line 163
    move-result-object v6
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 164
    :try_start_1
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-nez v0, :cond_5

    .line 169
    .line 170
    iget-object v0, v2, Lij3;->f:Luh3;

    .line 171
    .line 172
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 173
    .line 174
    .line 175
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 176
    .line 177
    const-string v11, "Main event not found"

    .line 178
    .line 179
    invoke-virtual {v0, v11}, Lsh3;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 180
    .line 181
    .line 182
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 183
    .line 184
    .line 185
    move-object v0, v9

    .line 186
    move-object/from16 v16, v0

    .line 187
    .line 188
    :goto_3
    const-wide/16 v17, 0x0

    .line 189
    .line 190
    goto/16 :goto_a

    .line 191
    .line 192
    :catchall_0
    move-exception v0

    .line 193
    goto :goto_6

    .line 194
    :catch_0
    move-exception v0

    .line 195
    move-object/from16 v16, v9

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_5
    const/4 v0, 0x0

    .line 199
    :try_start_2
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    const/4 v11, 0x1

    .line 204
    invoke-interface {v6, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 205
    .line 206
    .line 207
    move-result-wide v16

    .line 208
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 209
    .line 210
    .line 211
    move-result-object v11
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 212
    move-object/from16 v16, v9

    .line 213
    .line 214
    :try_start_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzhs;->zzk()Lcom/google/android/gms/internal/measurement/zzhr;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    invoke-static {v9, v0}, Lci3;->m0(Lcom/google/android/gms/internal/measurement/zzma;[B)Lcom/google/android/gms/internal/measurement/zznk;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhr;

    .line 223
    .line 224
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhs;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 229
    .line 230
    :try_start_4
    invoke-static {v0, v11}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 231
    .line 232
    .line 233
    move-result-object v0
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 234
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 235
    .line 236
    .line 237
    goto :goto_3

    .line 238
    :catch_1
    move-exception v0

    .line 239
    :try_start_5
    iget-object v9, v2, Lij3;->f:Luh3;

    .line 240
    .line 241
    invoke-static {v9}, Lij3;->l(Lhk3;)V

    .line 242
    .line 243
    .line 244
    iget-object v9, v9, Luh3;->f:Lsh3;

    .line 245
    .line 246
    const-string v11, "Failed to merge main event. appId, eventId"
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 247
    .line 248
    const-wide/16 v17, 0x0

    .line 249
    .line 250
    :try_start_6
    invoke-static {v7}, Luh3;->H(Ljava/lang/String;)Lth3;

    .line 251
    .line 252
    .line 253
    move-result-object v13

    .line 254
    invoke-virtual {v9, v11, v13, v10, v0}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 255
    .line 256
    .line 257
    :goto_4
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 258
    .line 259
    .line 260
    :cond_6
    move-object/from16 v0, v16

    .line 261
    .line 262
    goto :goto_a

    .line 263
    :catch_2
    move-exception v0

    .line 264
    goto :goto_9

    .line 265
    :catch_3
    move-exception v0

    .line 266
    :goto_5
    const-wide/16 v17, 0x0

    .line 267
    .line 268
    goto :goto_9

    .line 269
    :goto_6
    move-object v9, v6

    .line 270
    goto/16 :goto_10

    .line 271
    .line 272
    :catchall_1
    move-exception v0

    .line 273
    move-object/from16 v16, v9

    .line 274
    .line 275
    goto :goto_7

    .line 276
    :catch_4
    move-exception v0

    .line 277
    move-object/from16 v16, v9

    .line 278
    .line 279
    const-wide/16 v17, 0x0

    .line 280
    .line 281
    goto :goto_8

    .line 282
    :goto_7
    move-object/from16 v9, v16

    .line 283
    .line 284
    goto/16 :goto_10

    .line 285
    .line 286
    :goto_8
    move-object/from16 v6, v16

    .line 287
    .line 288
    :goto_9
    :try_start_7
    iget-object v2, v2, Lij3;->f:Luh3;

    .line 289
    .line 290
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 291
    .line 292
    .line 293
    iget-object v2, v2, Luh3;->f:Lsh3;

    .line 294
    .line 295
    const-string v9, "Error selecting main event"

    .line 296
    .line 297
    invoke-virtual {v2, v0, v9}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 298
    .line 299
    .line 300
    if-eqz v6, :cond_6

    .line 301
    .line 302
    goto :goto_4

    .line 303
    :goto_a
    if-eqz v0, :cond_7

    .line 304
    .line 305
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 306
    .line 307
    if-nez v2, :cond_8

    .line 308
    .line 309
    :cond_7
    move-object v8, v10

    .line 310
    goto/16 :goto_f

    .line 311
    .line 312
    :cond_8
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 313
    .line 314
    iput-object v2, v1, Lwh3;->c:Ljava/lang/Object;

    .line 315
    .line 316
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v0, Ljava/lang/Long;

    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 321
    .line 322
    .line 323
    move-result-wide v13

    .line 324
    iput-wide v13, v1, Lwh3;->b:J

    .line 325
    .line 326
    invoke-virtual {v3}, Lmp3;->i0()Lci3;

    .line 327
    .line 328
    .line 329
    iget-object v0, v1, Lwh3;->c:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 332
    .line 333
    invoke-static {v0, v8}, Lci3;->I(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Ljava/io/Serializable;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    check-cast v0, Ljava/lang/Long;

    .line 338
    .line 339
    iput-object v0, v1, Lwh3;->d:Ljava/lang/Object;

    .line 340
    .line 341
    :goto_b
    iget-wide v8, v1, Lwh3;->b:J

    .line 342
    .line 343
    const-wide/16 v13, -0x1

    .line 344
    .line 345
    add-long/2addr v8, v13

    .line 346
    iput-wide v8, v1, Lwh3;->b:J

    .line 347
    .line 348
    cmp-long v0, v8, v17

    .line 349
    .line 350
    if-gtz v0, :cond_9

    .line 351
    .line 352
    iget-object v0, v3, Lmp3;->c:Lae3;

    .line 353
    .line 354
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 355
    .line 356
    .line 357
    iget-object v2, v0, Lsq3;->a:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v2, Lij3;

    .line 360
    .line 361
    invoke-virtual {v0}, Lsq3;->y()V

    .line 362
    .line 363
    .line 364
    iget-object v6, v2, Lij3;->f:Luh3;

    .line 365
    .line 366
    invoke-static {v6}, Lij3;->l(Lhk3;)V

    .line 367
    .line 368
    .line 369
    iget-object v6, v6, Luh3;->Y:Lsh3;

    .line 370
    .line 371
    const-string v8, "Clearing complex main event info. appId"

    .line 372
    .line 373
    invoke-virtual {v6, v7, v8}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    :try_start_8
    invoke-virtual {v0}, Lae3;->q0()Landroid/database/sqlite/SQLiteDatabase;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    const-string v6, "delete from main_event_params where app_id=?"

    .line 381
    .line 382
    filled-new-array {v7}, [Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v7

    .line 386
    invoke-virtual {v0, v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_5

    .line 387
    .line 388
    .line 389
    goto :goto_c

    .line 390
    :catch_5
    move-exception v0

    .line 391
    iget-object v2, v2, Lij3;->f:Luh3;

    .line 392
    .line 393
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 394
    .line 395
    .line 396
    iget-object v2, v2, Luh3;->f:Lsh3;

    .line 397
    .line 398
    const-string v6, "Error clearing complex main event"

    .line 399
    .line 400
    invoke-virtual {v2, v0, v6}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    goto :goto_c

    .line 404
    :cond_9
    iget-object v6, v3, Lmp3;->c:Lae3;

    .line 405
    .line 406
    invoke-static {v6}, Lmp3;->S(Lwo3;)V

    .line 407
    .line 408
    .line 409
    move-object v2, v10

    .line 410
    iget-wide v9, v1, Lwh3;->b:J

    .line 411
    .line 412
    iget-object v0, v1, Lwh3;->c:Ljava/lang/Object;

    .line 413
    .line 414
    move-object v11, v0

    .line 415
    check-cast v11, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 416
    .line 417
    move-object v8, v2

    .line 418
    invoke-virtual/range {v6 .. v11}, Lae3;->S(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/zzhs;)V

    .line 419
    .line 420
    .line 421
    :goto_c
    new-instance v0, Ljava/util/ArrayList;

    .line 422
    .line 423
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 424
    .line 425
    .line 426
    iget-object v1, v1, Lwh3;->c:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 429
    .line 430
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzhs;->zza()Ljava/util/List;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    :cond_a
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 439
    .line 440
    .line 441
    move-result v2

    .line 442
    if-eqz v2, :cond_b

    .line 443
    .line 444
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzhw;

    .line 449
    .line 450
    invoke-virtual {v3}, Lmp3;->i0()Lci3;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzhw;->zzb()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v6

    .line 457
    invoke-static {v5, v6}, Lci3;->H(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 458
    .line 459
    .line 460
    move-result-object v6

    .line 461
    if-nez v6, :cond_a

    .line 462
    .line 463
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    goto :goto_d

    .line 467
    :cond_b
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 468
    .line 469
    .line 470
    move-result v1

    .line 471
    if-nez v1, :cond_c

    .line 472
    .line 473
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 474
    .line 475
    .line 476
    move-object v12, v0

    .line 477
    goto :goto_e

    .line 478
    :cond_c
    iget-object v0, v4, Lij3;->f:Luh3;

    .line 479
    .line 480
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 481
    .line 482
    .line 483
    iget-object v0, v0, Luh3;->i:Lsh3;

    .line 484
    .line 485
    const-string v1, "No unique parameters in main event. eventName"

    .line 486
    .line 487
    invoke-virtual {v0, v15, v1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    :goto_e
    move-object v6, v15

    .line 491
    goto :goto_13

    .line 492
    :goto_f
    iget-object v0, v4, Lij3;->f:Luh3;

    .line 493
    .line 494
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 495
    .line 496
    .line 497
    iget-object v0, v0, Luh3;->i:Lsh3;

    .line 498
    .line 499
    const-string v1, "Extra parameter without existing main event. eventName, eventId"

    .line 500
    .line 501
    invoke-virtual {v0, v15, v1, v8}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    return-object v16

    .line 505
    :goto_10
    if-eqz v9, :cond_d

    .line 506
    .line 507
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 508
    .line 509
    .line 510
    :cond_d
    throw v0

    .line 511
    :cond_e
    move-object/from16 v16, v9

    .line 512
    .line 513
    move-object v8, v10

    .line 514
    const-wide/16 v17, 0x0

    .line 515
    .line 516
    iput-object v8, v1, Lwh3;->d:Ljava/lang/Object;

    .line 517
    .line 518
    iput-object v5, v1, Lwh3;->c:Ljava/lang/Object;

    .line 519
    .line 520
    invoke-virtual {v2}, Lmp3;->i0()Lci3;

    .line 521
    .line 522
    .line 523
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    const-string v3, "_epc"

    .line 528
    .line 529
    invoke-static {v5, v3}, Lci3;->H(Lcom/google/android/gms/internal/measurement/zzhs;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhw;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    if-nez v3, :cond_f

    .line 534
    .line 535
    move-object/from16 v9, v16

    .line 536
    .line 537
    goto :goto_11

    .line 538
    :cond_f
    invoke-static {v3}, Lci3;->O(Lcom/google/android/gms/internal/measurement/zzhw;)Ljava/io/Serializable;

    .line 539
    .line 540
    .line 541
    move-result-object v9

    .line 542
    :goto_11
    if-nez v9, :cond_10

    .line 543
    .line 544
    goto :goto_12

    .line 545
    :cond_10
    move-object v0, v9

    .line 546
    :goto_12
    check-cast v0, Ljava/lang/Long;

    .line 547
    .line 548
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 549
    .line 550
    .line 551
    move-result-wide v9

    .line 552
    iput-wide v9, v1, Lwh3;->b:J

    .line 553
    .line 554
    cmp-long v0, v9, v17

    .line 555
    .line 556
    if-gtz v0, :cond_11

    .line 557
    .line 558
    iget-object v0, v4, Lij3;->f:Luh3;

    .line 559
    .line 560
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 561
    .line 562
    .line 563
    iget-object v0, v0, Luh3;->i:Lsh3;

    .line 564
    .line 565
    const-string v1, "Complex event with zero extra param count. eventName"

    .line 566
    .line 567
    invoke-virtual {v0, v6, v1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    goto :goto_13

    .line 571
    :cond_11
    iget-object v0, v2, Lmp3;->c:Lae3;

    .line 572
    .line 573
    invoke-static {v0}, Lmp3;->S(Lwo3;)V

    .line 574
    .line 575
    .line 576
    iget-wide v3, v1, Lwh3;->b:J

    .line 577
    .line 578
    move-object/from16 v1, p2

    .line 579
    .line 580
    move-object v2, v8

    .line 581
    invoke-virtual/range {v0 .. v5}, Lae3;->S(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/zzhs;)V

    .line 582
    .line 583
    .line 584
    :cond_12
    :goto_13
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/zzme;->zzcl()Lcom/google/android/gms/internal/measurement/zzma;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhr;

    .line 589
    .line 590
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/measurement/zzhr;->zzl(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhr;->zzi()Lcom/google/android/gms/internal/measurement/zzhr;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/measurement/zzhr;->zzh(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/zzhr;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzma;->zzbc()Lcom/google/android/gms/internal/measurement/zzme;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzhs;

    .line 604
    .line 605
    return-object v0
.end method

.method public c()Lcom/google/android/gms/measurement/internal/zzbg;
    .locals 6

    .line 1
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 2
    .line 3
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzbe;

    .line 4
    .line 5
    new-instance v1, Landroid/os/Bundle;

    .line 6
    .line 7
    iget-object v3, p0, Lwh3;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {v1, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, v1}, Lcom/google/android/gms/measurement/internal/zzbe;-><init>(Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lwh3;->d:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v3, v1

    .line 20
    check-cast v3, Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p0, Lwh3;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Ljava/lang/String;

    .line 25
    .line 26
    iget-wide v4, p0, Lwh3;->b:J

    .line 27
    .line 28
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbe;Ljava/lang/String;J)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lwh3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lwh3;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p0, Lwh3;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Landroid/os/Bundle;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object p0, p0, Lwh3;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    add-int/lit8 v2, v2, 0xd

    .line 48
    .line 49
    add-int/2addr v2, v3

    .line 50
    new-instance v3, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    add-int/lit8 v2, v2, 0x8

    .line 53
    .line 54
    add-int/2addr v2, v4

    .line 55
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 56
    .line 57
    .line 58
    const-string v2, "origin="

    .line 59
    .line 60
    const-string v4, ",name="

    .line 61
    .line 62
    invoke-static {v3, v2, v0, v4, p0}, Lfm0;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const-string p0, ",params="

    .line 66
    .line 67
    invoke-static {v3, p0, v1}, Lfm0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

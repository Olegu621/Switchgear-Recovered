.class public final Lvf1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lht1;

.field public final b:Lwc0;

.field public final c:Lef1;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/List;

.field public final f:Lif1;

.field public final g:Lbx0;

.field public final h:Ljava/util/ArrayList;

.field public i:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lht1;Lif1;Lwc0;Lef1;Ljava/util/List;Ljava/util/List;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    move-object/from16 v3, p2

    .line 14
    .line 15
    iput-object v3, v0, Lvf1;->a:Lht1;

    .line 16
    .line 17
    move-object/from16 v3, p4

    .line 18
    .line 19
    iput-object v3, v0, Lvf1;->b:Lwc0;

    .line 20
    .line 21
    iput-object v2, v0, Lvf1;->c:Lef1;

    .line 22
    .line 23
    move-object/from16 v3, p6

    .line 24
    .line 25
    iput-object v3, v0, Lvf1;->d:Ljava/util/List;

    .line 26
    .line 27
    move-object/from16 v3, p7

    .line 28
    .line 29
    iput-object v3, v0, Lvf1;->e:Ljava/util/List;

    .line 30
    .line 31
    new-instance v3, Lif1;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x0

    .line 39
    const/4 v10, 0x0

    .line 40
    const/4 v11, 0x0

    .line 41
    const/4 v12, 0x0

    .line 42
    const/4 v13, 0x0

    .line 43
    const/4 v14, 0x0

    .line 44
    const/4 v15, 0x0

    .line 45
    const/16 v16, 0x0

    .line 46
    .line 47
    const/16 v17, 0x0

    .line 48
    .line 49
    const/16 v18, 0x0

    .line 50
    .line 51
    invoke-direct/range {v3 .. v18}, Lif1;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lwf1;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 52
    .line 53
    .line 54
    iput-object v3, v0, Lvf1;->f:Lif1;

    .line 55
    .line 56
    new-instance v4, Lbx0;

    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v6, 0x3

    .line 60
    invoke-direct {v4, v5, v6}, Lbx0;-><init>(BI)V

    .line 61
    .line 62
    .line 63
    iput-object v4, v0, Lvf1;->g:Lbx0;

    .line 64
    .line 65
    new-instance v4, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v4, v0, Lvf1;->h:Ljava/util/ArrayList;

    .line 71
    .line 72
    if-eqz v1, :cond_0

    .line 73
    .line 74
    invoke-virtual {v3, v1}, Lif1;->b(Lif1;)V

    .line 75
    .line 76
    .line 77
    :cond_0
    if-eqz v2, :cond_1

    .line 78
    .line 79
    new-instance v1, Lf8;

    .line 80
    .line 81
    invoke-direct {v1, v0, v6}, Lf8;-><init>(Ljava/lang/Object;I)V

    .line 82
    .line 83
    .line 84
    new-instance v0, Lts0;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object v0, v2, Lef1;->e:Lts0;

    .line 90
    .line 91
    new-instance v3, Ldf1;

    .line 92
    .line 93
    invoke-direct {v3, v2, v1}, Ldf1;-><init>(Lef1;Lf8;)V

    .line 94
    .line 95
    .line 96
    iget v1, v2, Lef1;->a:I

    .line 97
    .line 98
    int-to-long v1, v1

    .line 99
    const-wide/16 v4, 0x3e8

    .line 100
    .line 101
    mul-long/2addr v1, v4

    .line 102
    new-instance v4, Ljava/util/Timer;

    .line 103
    .line 104
    invoke-direct {v4}, Ljava/util/Timer;-><init>()V

    .line 105
    .line 106
    .line 107
    iput-object v4, v0, Lts0;->a:Ljava/lang/Object;

    .line 108
    .line 109
    move-wide v5, v1

    .line 110
    move-wide/from16 p2, v1

    .line 111
    .line 112
    move-object/from16 p1, v3

    .line 113
    .line 114
    move-object/from16 p0, v4

    .line 115
    .line 116
    move-wide/from16 p4, v5

    .line 117
    .line 118
    invoke-virtual/range {p0 .. p5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 119
    .line 120
    .line 121
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Lk;)V
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lof1;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    iget-boolean v2, v0, Lvf1;->i:Z

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iput-boolean v3, v0, Lvf1;->i:Z

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    instance-of v2, v1, Lnf1;

    .line 20
    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    iput-boolean v4, v0, Lvf1;->i:Z

    .line 24
    .line 25
    :cond_2
    :goto_0
    iget-object v2, v1, Lk;->a:Ljava/util/ArrayList;

    .line 26
    .line 27
    iget-object v5, v0, Lvf1;->f:Lif1;

    .line 28
    .line 29
    iget-object v6, v5, Lif1;->a:Ljava/lang/Double;

    .line 30
    .line 31
    if-eqz v6, :cond_3

    .line 32
    .line 33
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 34
    .line 35
    .line 36
    move-result-wide v6

    .line 37
    goto :goto_1

    .line 38
    :cond_3
    const-wide/16 v6, 0x0

    .line 39
    .line 40
    :goto_1
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    new-instance v7, Lkotlin/Pair;

    .line 45
    .line 46
    const-string v8, "currentTime"

    .line 47
    .line 48
    invoke-direct {v7, v8, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v6, v5, Lif1;->b:Ljava/lang/Double;

    .line 52
    .line 53
    new-instance v8, Lkotlin/Pair;

    .line 54
    .line 55
    const-string v9, "duration"

    .line 56
    .line 57
    invoke-direct {v8, v9, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object v6, v5, Lif1;->c:Ljava/lang/Boolean;

    .line 61
    .line 62
    if-eqz v6, :cond_4

    .line 63
    .line 64
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    :cond_4
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    move-object v6, v9

    .line 73
    new-instance v9, Lkotlin/Pair;

    .line 74
    .line 75
    const-string v10, "ended"

    .line 76
    .line 77
    invoke-direct {v9, v10, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iget-object v4, v5, Lif1;->d:Ljava/lang/Boolean;

    .line 81
    .line 82
    new-instance v10, Lkotlin/Pair;

    .line 83
    .line 84
    const-string v11, "fullscreen"

    .line 85
    .line 86
    invoke-direct {v10, v11, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object v4, v5, Lif1;->e:Ljava/lang/Boolean;

    .line 90
    .line 91
    new-instance v11, Lkotlin/Pair;

    .line 92
    .line 93
    const-string v12, "livestream"

    .line 94
    .line 95
    invoke-direct {v11, v12, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object v4, v5, Lif1;->f:Ljava/lang/String;

    .line 99
    .line 100
    new-instance v12, Lkotlin/Pair;

    .line 101
    .line 102
    const-string v13, "label"

    .line 103
    .line 104
    invoke-direct {v12, v13, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object v4, v5, Lif1;->g:Ljava/lang/Boolean;

    .line 108
    .line 109
    new-instance v13, Lkotlin/Pair;

    .line 110
    .line 111
    const-string v14, "loop"

    .line 112
    .line 113
    invoke-direct {v13, v14, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iget-object v4, v5, Lif1;->h:Lwf1;

    .line 117
    .line 118
    const/16 v22, 0x0

    .line 119
    .line 120
    if-eqz v4, :cond_5

    .line 121
    .line 122
    invoke-virtual {v4}, Lwf1;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    goto :goto_2

    .line 127
    :cond_5
    move-object/from16 v4, v22

    .line 128
    .line 129
    :goto_2
    new-instance v14, Lkotlin/Pair;

    .line 130
    .line 131
    const-string v15, "mediaType"

    .line 132
    .line 133
    invoke-direct {v14, v15, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    iget-object v4, v5, Lif1;->i:Ljava/lang/Boolean;

    .line 137
    .line 138
    new-instance v15, Lkotlin/Pair;

    .line 139
    .line 140
    const-string v3, "muted"

    .line 141
    .line 142
    invoke-direct {v15, v3, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iget-object v3, v5, Lif1;->j:Ljava/lang/Boolean;

    .line 146
    .line 147
    if-eqz v3, :cond_6

    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    goto :goto_3

    .line 154
    :cond_6
    const/4 v3, 0x1

    .line 155
    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    new-instance v4, Lkotlin/Pair;

    .line 160
    .line 161
    move-object/from16 v16, v6

    .line 162
    .line 163
    const-string v6, "paused"

    .line 164
    .line 165
    invoke-direct {v4, v6, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    iget-object v3, v5, Lif1;->k:Ljava/lang/Boolean;

    .line 169
    .line 170
    new-instance v6, Lkotlin/Pair;

    .line 171
    .line 172
    move-object/from16 v17, v4

    .line 173
    .line 174
    const-string v4, "pictureInPicture"

    .line 175
    .line 176
    invoke-direct {v6, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    iget-object v3, v5, Lif1;->l:Ljava/lang/String;

    .line 180
    .line 181
    new-instance v4, Lkotlin/Pair;

    .line 182
    .line 183
    move-object/from16 v18, v6

    .line 184
    .line 185
    const-string v6, "playerType"

    .line 186
    .line 187
    invoke-direct {v4, v6, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    iget-object v3, v5, Lif1;->m:Ljava/lang/Double;

    .line 191
    .line 192
    new-instance v6, Lkotlin/Pair;

    .line 193
    .line 194
    move-object/from16 v19, v4

    .line 195
    .line 196
    const-string v4, "playbackRate"

    .line 197
    .line 198
    invoke-direct {v6, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    iget-object v3, v5, Lif1;->n:Ljava/lang/String;

    .line 202
    .line 203
    new-instance v4, Lkotlin/Pair;

    .line 204
    .line 205
    move-object/from16 v20, v6

    .line 206
    .line 207
    const-string v6, "quality"

    .line 208
    .line 209
    invoke-direct {v4, v6, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    iget-object v3, v5, Lif1;->o:Ljava/lang/Integer;

    .line 213
    .line 214
    new-instance v5, Lkotlin/Pair;

    .line 215
    .line 216
    const-string v6, "volume"

    .line 217
    .line 218
    invoke-direct {v5, v6, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    move-object/from16 v21, v5

    .line 222
    .line 223
    move-object/from16 v6, v16

    .line 224
    .line 225
    move-object/from16 v16, v17

    .line 226
    .line 227
    move-object/from16 v17, v18

    .line 228
    .line 229
    move-object/from16 v18, v19

    .line 230
    .line 231
    move-object/from16 v19, v20

    .line 232
    .line 233
    move-object/from16 v20, v4

    .line 234
    .line 235
    filled-new-array/range {v7 .. v21}, [Lkotlin/Pair;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-static {v3}, Loc1;->e([Lkotlin/Pair;)Ljava/util/Map;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 244
    .line 245
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 246
    .line 247
    .line 248
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    :cond_7
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result v5

    .line 260
    if-eqz v5, :cond_8

    .line 261
    .line 262
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    check-cast v5, Ljava/util/Map$Entry;

    .line 267
    .line 268
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    if-eqz v7, :cond_7

    .line 273
    .line 274
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    invoke-interface {v4, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    goto :goto_4

    .line 286
    :cond_8
    new-instance v3, Lb92;

    .line 287
    .line 288
    const-string v5, "iglu:com.snowplowanalytics.snowplow/media_player/jsonschema/2-0-0"

    .line 289
    .line 290
    invoke-direct {v3, v5, v4}, Lb92;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    iget-object v4, v0, Lvf1;->b:Lwc0;

    .line 294
    .line 295
    if-eqz v4, :cond_10

    .line 296
    .line 297
    iget-object v5, v4, Lwc0;->b:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v5, Lac1;

    .line 300
    .line 301
    iget-object v4, v4, Lwc0;->c:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v4, Ltf1;

    .line 304
    .line 305
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    sget-object v7, Lmn0;->j:Ljava/lang/String;

    .line 312
    .line 313
    iget-object v8, v5, Lac1;->b:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v8, Ljava/lang/String;

    .line 316
    .line 317
    new-instance v9, Lkotlin/Pair;

    .line 318
    .line 319
    const-string v10, "mediaSessionId"

    .line 320
    .line 321
    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    iget-object v8, v5, Lac1;->c:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v8, Ljava/util/Date;

    .line 327
    .line 328
    invoke-static {v8}, Lmn0;->o(Ljava/util/Date;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v8

    .line 332
    new-instance v10, Lkotlin/Pair;

    .line 333
    .line 334
    const-string v11, "startedAt"

    .line 335
    .line 336
    invoke-direct {v10, v11, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    iget-object v5, v5, Lac1;->d:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v5, Ljava/lang/Integer;

    .line 342
    .line 343
    new-instance v8, Lkotlin/Pair;

    .line 344
    .line 345
    const-string v11, "pingInterval"

    .line 346
    .line 347
    invoke-direct {v8, v11, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    iget-wide v11, v4, Ltf1;->i:J

    .line 351
    .line 352
    invoke-static {v11, v12}, Lac1;->K(J)Ljava/lang/Double;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    new-instance v11, Lkotlin/Pair;

    .line 357
    .line 358
    const-string v12, "timePlayed"

    .line 359
    .line 360
    invoke-direct {v11, v12, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    iget-wide v12, v4, Ltf1;->k:J

    .line 364
    .line 365
    invoke-static {v12, v13}, Lac1;->K(J)Ljava/lang/Double;

    .line 366
    .line 367
    .line 368
    move-result-object v5

    .line 369
    new-instance v12, Lkotlin/Pair;

    .line 370
    .line 371
    const-string v13, "timePaused"

    .line 372
    .line 373
    invoke-direct {v12, v13, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    iget-wide v13, v4, Ltf1;->j:J

    .line 377
    .line 378
    invoke-static {v13, v14}, Lac1;->K(J)Ljava/lang/Double;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    new-instance v13, Lkotlin/Pair;

    .line 383
    .line 384
    const-string v14, "timePlayedMuted"

    .line 385
    .line 386
    invoke-direct {v13, v14, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    iget-wide v14, v4, Ltf1;->h:J

    .line 390
    .line 391
    invoke-static {v14, v15}, Lac1;->K(J)Ljava/lang/Double;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    new-instance v14, Lkotlin/Pair;

    .line 396
    .line 397
    const-string v15, "timeSpentAds"

    .line 398
    .line 399
    invoke-direct {v14, v15, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    move-object/from16 v25, v8

    .line 403
    .line 404
    move-object/from16 v23, v9

    .line 405
    .line 406
    iget-wide v8, v4, Ltf1;->l:J

    .line 407
    .line 408
    invoke-static {v8, v9}, Lac1;->K(J)Ljava/lang/Double;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    new-instance v8, Lkotlin/Pair;

    .line 413
    .line 414
    const-string v9, "timeBuffering"

    .line 415
    .line 416
    invoke-direct {v8, v9, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    iget v5, v4, Ltf1;->n:I

    .line 420
    .line 421
    if-lez v5, :cond_9

    .line 422
    .line 423
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 424
    .line 425
    .line 426
    move-result-object v5

    .line 427
    goto :goto_5

    .line 428
    :cond_9
    move-object/from16 v5, v22

    .line 429
    .line 430
    :goto_5
    new-instance v9, Lkotlin/Pair;

    .line 431
    .line 432
    const-string v15, "ads"

    .line 433
    .line 434
    invoke-direct {v9, v15, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    iget v5, v4, Ltf1;->m:I

    .line 438
    .line 439
    if-lez v5, :cond_a

    .line 440
    .line 441
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 442
    .line 443
    .line 444
    move-result-object v5

    .line 445
    goto :goto_6

    .line 446
    :cond_a
    move-object/from16 v5, v22

    .line 447
    .line 448
    :goto_6
    new-instance v15, Lkotlin/Pair;

    .line 449
    .line 450
    move-object/from16 v30, v8

    .line 451
    .line 452
    const-string v8, "adBreaks"

    .line 453
    .line 454
    invoke-direct {v15, v8, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    iget v5, v4, Ltf1;->o:I

    .line 458
    .line 459
    if-lez v5, :cond_b

    .line 460
    .line 461
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 462
    .line 463
    .line 464
    move-result-object v5

    .line 465
    goto :goto_7

    .line 466
    :cond_b
    move-object/from16 v5, v22

    .line 467
    .line 468
    :goto_7
    new-instance v8, Lkotlin/Pair;

    .line 469
    .line 470
    move-object/from16 v31, v9

    .line 471
    .line 472
    const-string v9, "adsSkipped"

    .line 473
    .line 474
    invoke-direct {v8, v9, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    iget v5, v4, Ltf1;->p:I

    .line 478
    .line 479
    if-lez v5, :cond_c

    .line 480
    .line 481
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 482
    .line 483
    .line 484
    move-result-object v5

    .line 485
    goto :goto_8

    .line 486
    :cond_c
    move-object/from16 v5, v22

    .line 487
    .line 488
    :goto_8
    new-instance v9, Lkotlin/Pair;

    .line 489
    .line 490
    move-object/from16 v33, v8

    .line 491
    .line 492
    const-string v8, "adsClicked"

    .line 493
    .line 494
    invoke-direct {v9, v8, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v4}, Ltf1;->a()D

    .line 498
    .line 499
    .line 500
    move-result-wide v16

    .line 501
    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    .line 502
    .line 503
    cmpg-double v5, v16, v18

    .line 504
    .line 505
    if-nez v5, :cond_d

    .line 506
    .line 507
    move-object/from16 v34, v9

    .line 508
    .line 509
    move-object/from16 v5, v22

    .line 510
    .line 511
    goto :goto_9

    .line 512
    :cond_d
    invoke-virtual {v4}, Ltf1;->a()D

    .line 513
    .line 514
    .line 515
    move-result-wide v16

    .line 516
    const-wide v18, 0x408f400000000000L    # 1000.0

    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    move-object/from16 v34, v9

    .line 522
    .line 523
    mul-double v8, v16, v18

    .line 524
    .line 525
    double-to-int v5, v8

    .line 526
    int-to-double v8, v5

    .line 527
    div-double v8, v8, v18

    .line 528
    .line 529
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 530
    .line 531
    .line 532
    move-result-object v5

    .line 533
    :goto_9
    new-instance v8, Lkotlin/Pair;

    .line 534
    .line 535
    const-string v9, "avgPlaybackRate"

    .line 536
    .line 537
    invoke-direct {v8, v9, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    iget-object v4, v4, Ltf1;->f:Ljava/util/LinkedHashSet;

    .line 541
    .line 542
    invoke-interface {v4}, Ljava/util/Set;->size()I

    .line 543
    .line 544
    .line 545
    move-result v4

    .line 546
    sget-object v5, Lib0;->d:Lib0;

    .line 547
    .line 548
    invoke-static {v4, v5}, Lmn0;->D(ILib0;)J

    .line 549
    .line 550
    .line 551
    move-result-wide v4

    .line 552
    invoke-static {v4, v5}, Lac1;->K(J)Ljava/lang/Double;

    .line 553
    .line 554
    .line 555
    move-result-object v4

    .line 556
    new-instance v5, Lkotlin/Pair;

    .line 557
    .line 558
    const-string v9, "contentWatched"

    .line 559
    .line 560
    invoke-direct {v5, v9, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    move-object/from16 v36, v5

    .line 564
    .line 565
    move-object/from16 v35, v8

    .line 566
    .line 567
    move-object/from16 v24, v10

    .line 568
    .line 569
    move-object/from16 v26, v11

    .line 570
    .line 571
    move-object/from16 v27, v12

    .line 572
    .line 573
    move-object/from16 v28, v13

    .line 574
    .line 575
    move-object/from16 v29, v14

    .line 576
    .line 577
    move-object/from16 v32, v15

    .line 578
    .line 579
    filled-new-array/range {v23 .. v36}, [Lkotlin/Pair;

    .line 580
    .line 581
    .line 582
    move-result-object v4

    .line 583
    invoke-static {v4}, Loc1;->e([Lkotlin/Pair;)Ljava/util/Map;

    .line 584
    .line 585
    .line 586
    move-result-object v4

    .line 587
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 588
    .line 589
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 590
    .line 591
    .line 592
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 593
    .line 594
    .line 595
    move-result-object v4

    .line 596
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 597
    .line 598
    .line 599
    move-result-object v4

    .line 600
    :cond_e
    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 601
    .line 602
    .line 603
    move-result v8

    .line 604
    if-eqz v8, :cond_f

    .line 605
    .line 606
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v8

    .line 610
    check-cast v8, Ljava/util/Map$Entry;

    .line 611
    .line 612
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v9

    .line 616
    if-eqz v9, :cond_e

    .line 617
    .line 618
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v9

    .line 622
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v8

    .line 626
    invoke-virtual {v5, v9, v8}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    goto :goto_a

    .line 630
    :cond_f
    new-instance v4, Lb92;

    .line 631
    .line 632
    invoke-direct {v4, v7, v5}, Lb92;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    goto :goto_b

    .line 636
    :cond_10
    move-object/from16 v4, v22

    .line 637
    .line 638
    :goto_b
    filled-new-array {v3, v4}, [Lb92;

    .line 639
    .line 640
    .line 641
    move-result-object v3

    .line 642
    invoke-static {v3}, Lqd;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 643
    .line 644
    .line 645
    move-result-object v3

    .line 646
    iget-object v4, v0, Lvf1;->g:Lbx0;

    .line 647
    .line 648
    iget-object v5, v4, Lbx0;->b:Ljava/lang/Object;

    .line 649
    .line 650
    check-cast v5, Lzd1;

    .line 651
    .line 652
    const-string v7, "name"

    .line 653
    .line 654
    if-eqz v5, :cond_13

    .line 655
    .line 656
    sget-object v8, Lmn0;->k:Ljava/lang/String;

    .line 657
    .line 658
    iget-object v9, v5, Lzd1;->a:Ljava/lang/String;

    .line 659
    .line 660
    new-instance v10, Lkotlin/Pair;

    .line 661
    .line 662
    const-string v11, "adId"

    .line 663
    .line 664
    invoke-direct {v10, v11, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 665
    .line 666
    .line 667
    iget-object v9, v5, Lzd1;->b:Ljava/lang/String;

    .line 668
    .line 669
    new-instance v11, Lkotlin/Pair;

    .line 670
    .line 671
    invoke-direct {v11, v7, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 672
    .line 673
    .line 674
    iget-object v9, v5, Lzd1;->c:Ljava/lang/String;

    .line 675
    .line 676
    new-instance v12, Lkotlin/Pair;

    .line 677
    .line 678
    const-string v13, "creativeId"

    .line 679
    .line 680
    invoke-direct {v12, v13, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 681
    .line 682
    .line 683
    iget-object v9, v5, Lzd1;->d:Ljava/lang/Integer;

    .line 684
    .line 685
    new-instance v13, Lkotlin/Pair;

    .line 686
    .line 687
    const-string v14, "podPosition"

    .line 688
    .line 689
    invoke-direct {v13, v14, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 690
    .line 691
    .line 692
    iget-object v9, v5, Lzd1;->e:Ljava/lang/Double;

    .line 693
    .line 694
    new-instance v14, Lkotlin/Pair;

    .line 695
    .line 696
    invoke-direct {v14, v6, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 697
    .line 698
    .line 699
    iget-object v5, v5, Lzd1;->f:Ljava/lang/Boolean;

    .line 700
    .line 701
    new-instance v15, Lkotlin/Pair;

    .line 702
    .line 703
    const-string v6, "skippable"

    .line 704
    .line 705
    invoke-direct {v15, v6, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 706
    .line 707
    .line 708
    filled-new-array/range {v10 .. v15}, [Lkotlin/Pair;

    .line 709
    .line 710
    .line 711
    move-result-object v5

    .line 712
    invoke-static {v5}, Loc1;->e([Lkotlin/Pair;)Ljava/util/Map;

    .line 713
    .line 714
    .line 715
    move-result-object v5

    .line 716
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 717
    .line 718
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 719
    .line 720
    .line 721
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 722
    .line 723
    .line 724
    move-result-object v5

    .line 725
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 726
    .line 727
    .line 728
    move-result-object v5

    .line 729
    :cond_11
    :goto_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 730
    .line 731
    .line 732
    move-result v9

    .line 733
    if-eqz v9, :cond_12

    .line 734
    .line 735
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v9

    .line 739
    check-cast v9, Ljava/util/Map$Entry;

    .line 740
    .line 741
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v10

    .line 745
    if-eqz v10, :cond_11

    .line 746
    .line 747
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v10

    .line 751
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v9

    .line 755
    invoke-virtual {v6, v10, v9}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    goto :goto_c

    .line 759
    :cond_12
    new-instance v5, Lb92;

    .line 760
    .line 761
    invoke-direct {v5, v8, v6}, Lb92;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 762
    .line 763
    .line 764
    goto :goto_d

    .line 765
    :cond_13
    move-object/from16 v5, v22

    .line 766
    .line 767
    :goto_d
    iget-object v4, v4, Lbx0;->d:Ljava/lang/Object;

    .line 768
    .line 769
    check-cast v4, Ltd1;

    .line 770
    .line 771
    if-eqz v4, :cond_17

    .line 772
    .line 773
    sget-object v6, Lmn0;->l:Ljava/lang/String;

    .line 774
    .line 775
    iget-object v8, v4, Ltd1;->a:Ljava/lang/String;

    .line 776
    .line 777
    new-instance v9, Lkotlin/Pair;

    .line 778
    .line 779
    const-string v10, "breakId"

    .line 780
    .line 781
    invoke-direct {v9, v10, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 782
    .line 783
    .line 784
    iget-object v8, v4, Ltd1;->b:Ljava/lang/String;

    .line 785
    .line 786
    new-instance v10, Lkotlin/Pair;

    .line 787
    .line 788
    invoke-direct {v10, v7, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 789
    .line 790
    .line 791
    iget-object v7, v4, Ltd1;->e:Ljava/lang/Double;

    .line 792
    .line 793
    new-instance v8, Lkotlin/Pair;

    .line 794
    .line 795
    const-string v11, "startTime"

    .line 796
    .line 797
    invoke-direct {v8, v11, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 798
    .line 799
    .line 800
    iget-object v7, v4, Ltd1;->c:Lwd1;

    .line 801
    .line 802
    if-eqz v7, :cond_14

    .line 803
    .line 804
    invoke-virtual {v7}, Lwd1;->toString()Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v22

    .line 808
    :cond_14
    move-object/from16 v7, v22

    .line 809
    .line 810
    new-instance v11, Lkotlin/Pair;

    .line 811
    .line 812
    const-string v12, "breakType"

    .line 813
    .line 814
    invoke-direct {v11, v12, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 815
    .line 816
    .line 817
    iget-object v4, v4, Ltd1;->d:Ljava/lang/Integer;

    .line 818
    .line 819
    new-instance v7, Lkotlin/Pair;

    .line 820
    .line 821
    const-string v12, "podSize"

    .line 822
    .line 823
    invoke-direct {v7, v12, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 824
    .line 825
    .line 826
    filled-new-array {v9, v10, v8, v11, v7}, [Lkotlin/Pair;

    .line 827
    .line 828
    .line 829
    move-result-object v4

    .line 830
    invoke-static {v4}, Loc1;->e([Lkotlin/Pair;)Ljava/util/Map;

    .line 831
    .line 832
    .line 833
    move-result-object v4

    .line 834
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 835
    .line 836
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 837
    .line 838
    .line 839
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 840
    .line 841
    .line 842
    move-result-object v4

    .line 843
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 844
    .line 845
    .line 846
    move-result-object v4

    .line 847
    :cond_15
    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 848
    .line 849
    .line 850
    move-result v8

    .line 851
    if-eqz v8, :cond_16

    .line 852
    .line 853
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v8

    .line 857
    check-cast v8, Ljava/util/Map$Entry;

    .line 858
    .line 859
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v9

    .line 863
    if-eqz v9, :cond_15

    .line 864
    .line 865
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 866
    .line 867
    .line 868
    move-result-object v9

    .line 869
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v8

    .line 873
    invoke-virtual {v7, v9, v8}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    goto :goto_e

    .line 877
    :cond_16
    new-instance v4, Lb92;

    .line 878
    .line 879
    invoke-direct {v4, v6, v7}, Lb92;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 880
    .line 881
    .line 882
    goto :goto_f

    .line 883
    :cond_17
    move-object/from16 v4, v22

    .line 884
    .line 885
    :goto_f
    filled-new-array {v5, v4}, [Lb92;

    .line 886
    .line 887
    .line 888
    move-result-object v4

    .line 889
    invoke-static {v4}, Lqd;->h([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 890
    .line 891
    .line 892
    move-result-object v4

    .line 893
    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->B(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 894
    .line 895
    .line 896
    move-result-object v3

    .line 897
    iget-object v4, v0, Lvf1;->e:Ljava/util/List;

    .line 898
    .line 899
    if-eqz v4, :cond_18

    .line 900
    .line 901
    goto :goto_10

    .line 902
    :cond_18
    sget-object v4, Lnd0;->a:Lnd0;

    .line 903
    .line 904
    :goto_10
    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->B(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 905
    .line 906
    .line 907
    move-result-object v3

    .line 908
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 909
    .line 910
    .line 911
    iget-object v0, v0, Lvf1;->a:Lht1;

    .line 912
    .line 913
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 914
    .line 915
    check-cast v0, Lqa2;

    .line 916
    .line 917
    iget-object v2, v0, Lqa2;->c:Luq2;

    .line 918
    .line 919
    if-eqz v2, :cond_19

    .line 920
    .line 921
    goto :goto_11

    .line 922
    :cond_19
    sget v2, Lk50;->b:I

    .line 923
    .line 924
    const-string v2, "ht1"

    .line 925
    .line 926
    const-string v3, "Recreating tracker instance after it was removed. This will not be supported in future versions."

    .line 927
    .line 928
    invoke-static {v2, v3}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 929
    .line 930
    .line 931
    :goto_11
    invoke-virtual {v0}, Lqa2;->d()Luq2;

    .line 932
    .line 933
    .line 934
    move-result-object v0

    .line 935
    invoke-virtual {v0, v1}, Luq2;->c(Lk;)Ljava/util/UUID;

    .line 936
    .line 937
    .line 938
    return-void
.end method

.method public final b()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lvf1;->f:Lif1;

    .line 2
    .line 3
    iget-object v1, v0, Lif1;->j:Ljava/lang/Boolean;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v1, v2

    .line 14
    :goto_0
    const/4 v3, 0x0

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    goto/16 :goto_3

    .line 18
    .line 19
    :cond_1
    iget-object v1, p0, Lvf1;->d:Ljava/util/List;

    .line 20
    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_2
    invoke-virtual {v0}, Lif1;->a()Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_a

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    new-instance v4, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_4

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    move-object v6, v5

    .line 55
    check-cast v6, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-gt v6, v0, :cond_3

    .line 62
    .line 63
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_9

    .line 83
    .line 84
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Ljava/lang/Comparable;

    .line 89
    .line 90
    :cond_6
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_7

    .line 95
    .line 96
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    check-cast v4, Ljava/lang/Comparable;

    .line 101
    .line 102
    invoke-interface {v1, v4}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-gez v5, :cond_6

    .line 107
    .line 108
    move-object v1, v4

    .line 109
    goto :goto_2

    .line 110
    :cond_7
    check-cast v1, Ljava/lang/Number;

    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iget-object p0, p0, Lvf1;->h:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_8

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    return v2

    .line 137
    :cond_9
    invoke-static {}, Ln4;->o()V

    .line 138
    .line 139
    .line 140
    :cond_a
    :goto_3
    return v3
.end method

.method public final c(Lk;Lif1;Lzd1;Ltd1;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lvf1;->f:Lif1;

    .line 5
    .line 6
    invoke-virtual {v0, p2}, Lif1;->b(Lif1;)V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    goto/16 :goto_4

    .line 12
    .line 13
    :cond_0
    :goto_0
    instance-of p2, p1, Lkf1;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    move-object p2, p1

    .line 19
    check-cast p2, Lkf1;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-object p2, v0

    .line 23
    :goto_1
    if-eqz p2, :cond_2

    .line 24
    .line 25
    iget-object v1, p0, Lvf1;->f:Lif1;

    .line 26
    .line 27
    invoke-interface {p2, v1}, Lkf1;->a(Lif1;)V

    .line 28
    .line 29
    .line 30
    :cond_2
    iget-object p2, p0, Lvf1;->g:Lbx0;

    .line 31
    .line 32
    iget-object v1, p0, Lvf1;->f:Lif1;

    .line 33
    .line 34
    invoke-virtual {p2, p1, v1, p3, p4}, Lbx0;->f(Lk;Lif1;Lzd1;Ltd1;)V

    .line 35
    .line 36
    .line 37
    iget-object p2, p0, Lvf1;->b:Lwc0;

    .line 38
    .line 39
    if-eqz p2, :cond_3

    .line 40
    .line 41
    iget-object p3, p0, Lvf1;->f:Lif1;

    .line 42
    .line 43
    invoke-virtual {p2, p1, p3, p4}, Lwc0;->E(Lk;Lif1;Ltd1;)V

    .line 44
    .line 45
    .line 46
    :cond_3
    iget-object p2, p0, Lvf1;->c:Lef1;

    .line 47
    .line 48
    const/4 p3, 0x0

    .line 49
    if-eqz p2, :cond_5

    .line 50
    .line 51
    iget-object p4, p0, Lvf1;->f:Lif1;

    .line 52
    .line 53
    iget-object p4, p4, Lif1;->j:Ljava/lang/Boolean;

    .line 54
    .line 55
    if-nez p4, :cond_4

    .line 56
    .line 57
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 58
    .line 59
    :cond_4
    iput-object p4, p2, Lef1;->b:Ljava/lang/Boolean;

    .line 60
    .line 61
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {p4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p4

    .line 67
    if-eqz p4, :cond_5

    .line 68
    .line 69
    iput p3, p2, Lef1;->c:I

    .line 70
    .line 71
    :cond_5
    if-eqz p1, :cond_6

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Lvf1;->a(Lk;)V

    .line 74
    .line 75
    .line 76
    :cond_6
    invoke-virtual {p0}, Lvf1;->b()Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-eqz p2, :cond_7

    .line 81
    .line 82
    new-instance p2, Lbf1;

    .line 83
    .line 84
    iget-object p4, p0, Lvf1;->f:Lif1;

    .line 85
    .line 86
    invoke-virtual {p4}, Lif1;->a()Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object p4

    .line 90
    invoke-direct {p2, p4}, Lbf1;-><init>(Ljava/lang/Integer;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p2}, Lvf1;->a(Lk;)V

    .line 94
    .line 95
    .line 96
    :cond_7
    iget-object p2, p0, Lvf1;->g:Lbx0;

    .line 97
    .line 98
    instance-of p4, p1, Lsd1;

    .line 99
    .line 100
    if-eqz p4, :cond_8

    .line 101
    .line 102
    iput-object v0, p2, Lbx0;->d:Ljava/lang/Object;

    .line 103
    .line 104
    iput p3, p2, Lbx0;->c:I

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_8
    instance-of p3, p1, Lyd1;

    .line 108
    .line 109
    if-eqz p3, :cond_9

    .line 110
    .line 111
    const/4 p1, 0x1

    .line 112
    goto :goto_2

    .line 113
    :cond_9
    instance-of p1, p1, Lge1;

    .line 114
    .line 115
    :goto_2
    if-eqz p1, :cond_a

    .line 116
    .line 117
    iput-object v0, p2, Lbx0;->b:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    .line 119
    :cond_a
    :goto_3
    monitor-exit p0

    .line 120
    return-void

    .line 121
    :goto_4
    monitor-exit p0

    .line 122
    throw p1
.end method

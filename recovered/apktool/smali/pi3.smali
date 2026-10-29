.class public final Lpi3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lul3;
.implements Ljd3;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lpi3;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkn3;)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lso3;->a:Ljava/nio/charset/Charset;

    iput-object p1, p0, Lpi3;->a:Ljava/lang/Object;

    iput-object p0, p1, Lkn3;->a:Lpi3;

    return-void
.end method

.method public synthetic constructor <init>(Lqf3;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lpi3;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lpi3;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lac3;

    .line 10
    .line 11
    const/16 v1, 0xa

    .line 12
    .line 13
    invoke-direct {p1, v0, v1}, Lac3;-><init>(Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lgd3;->a(Ljd3;)Ljd3;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v1, Lwe2;

    .line 21
    .line 22
    const/16 v2, 0x1a

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-direct {v1, v0, p1, v2, v3}, Lwe2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Lgd3;->a(Ljd3;)Ljd3;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v1, Lqf3;

    .line 33
    .line 34
    invoke-direct {v1, v0}, Lqf3;-><init>(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Lgd3;->a(Ljd3;)Ljd3;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v2, Lac1;

    .line 42
    .line 43
    const/16 v3, 0x1c

    .line 44
    .line 45
    invoke-direct {v2, v3, p1, v1, v0}, Lac1;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v2}, Lgd3;->a(Ljd3;)Ljd3;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance v0, Lac3;

    .line 53
    .line 54
    const/4 v1, 0x6

    .line 55
    invoke-direct {v0, p1, v1}, Lac3;-><init>(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lgd3;->a(Ljd3;)Ljd3;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lpi3;->a:Ljava/lang/Object;

    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lpi3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Llo3;

    .line 4
    .line 5
    invoke-virtual {v0}, Leg3;->y()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lij3;

    .line 11
    .line 12
    iget-object v1, v0, Lij3;->e:Lki3;

    .line 13
    .line 14
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, Lij3;->V:Lxt0;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    invoke-virtual {v1, v3, v4}, Lki3;->J(J)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    iget-object v1, v0, Lij3;->e:Lki3;

    .line 33
    .line 34
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, v1, Lki3;->W:Lhi3;

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    invoke-virtual {v1, v3}, Lhi3;->b(Z)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 44
    .line 45
    invoke-direct {v1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-static {v1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 49
    .line 50
    .line 51
    iget v1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 52
    .line 53
    const/16 v3, 0x64

    .line 54
    .line 55
    if-ne v1, v3, :cond_0

    .line 56
    .line 57
    iget-object v0, v0, Lij3;->f:Luh3;

    .line 58
    .line 59
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 63
    .line 64
    const-string v1, "Detected application was in foreground"

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    invoke-virtual {p0, v0, v1}, Lpi3;->d(J)V

    .line 77
    .line 78
    .line 79
    :cond_0
    return-void
.end method

.method public b(ILjava/lang/Throwable;[B)V
    .locals 17

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v2, v2, Lpi3;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lij3;

    .line 12
    .line 13
    const-string v4, "timestamp"

    .line 14
    .line 15
    const-string v5, "gad_source"

    .line 16
    .line 17
    const-string v6, "gbraid"

    .line 18
    .line 19
    const-string v7, "gclid"

    .line 20
    .line 21
    const-string v8, "deeplink"

    .line 22
    .line 23
    const-string v9, ""

    .line 24
    .line 25
    iget-object v10, v2, Lij3;->f:Luh3;

    .line 26
    .line 27
    const/16 v11, 0xc8

    .line 28
    .line 29
    if-eq v0, v11, :cond_1

    .line 30
    .line 31
    const/16 v11, 0xcc

    .line 32
    .line 33
    if-eq v0, v11, :cond_1

    .line 34
    .line 35
    const/16 v11, 0x130

    .line 36
    .line 37
    if-ne v0, v11, :cond_0

    .line 38
    .line 39
    move v0, v11

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object v2, v10

    .line 42
    goto/16 :goto_6

    .line 43
    .line 44
    :cond_1
    :goto_0
    if-nez v1, :cond_0

    .line 45
    .line 46
    iget-object v0, v2, Lij3;->e:Lki3;

    .line 47
    .line 48
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, v0, Lki3;->e0:Lhi3;

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    invoke-virtual {v0, v1}, Lhi3;->b(Z)V

    .line 55
    .line 56
    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    array-length v0, v3

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    :cond_2
    move-object v2, v10

    .line 63
    goto/16 :goto_5

    .line 64
    .line 65
    :cond_3
    new-instance v0, Ljava/lang/String;

    .line 66
    .line 67
    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    .line 68
    .line 69
    .line 70
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 71
    .line 72
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_4

    .line 84
    .line 85
    invoke-static {v10}, Lij3;->l(Lhk3;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, v10, Luh3;->X:Lsh3;

    .line 89
    .line 90
    const-string v1, "Deferred Deep Link is empty."

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :catch_0
    move-exception v0

    .line 97
    move-object v2, v10

    .line 98
    goto/16 :goto_3

    .line 99
    .line 100
    :cond_4
    invoke-virtual {v1, v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v1, v6, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    invoke-virtual {v1, v5, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    const-wide/16 v12, 0x0

    .line 113
    .line 114
    invoke-virtual {v1, v4, v12, v13}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 115
    .line 116
    .line 117
    move-result-wide v12

    .line 118
    new-instance v1, Landroid/os/Bundle;

    .line 119
    .line 120
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 121
    .line 122
    .line 123
    iget-object v14, v2, Lij3;->w:Lup3;

    .line 124
    .line 125
    invoke-static {v14}, Lij3;->j(Lsq3;)V

    .line 126
    .line 127
    .line 128
    iget-object v15, v14, Lsq3;->a:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v15, Lij3;

    .line 131
    .line 132
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result v16

    .line 136
    if-eqz v16, :cond_5

    .line 137
    .line 138
    move-object/from16 v16, v10

    .line 139
    .line 140
    goto/16 :goto_2

    .line 141
    .line 142
    :cond_5
    move-wide/from16 p0, v12

    .line 143
    .line 144
    iget-object v12, v15, Lij3;->a:Landroid/content/Context;

    .line 145
    .line 146
    invoke-virtual {v12}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 147
    .line 148
    .line 149
    move-result-object v13
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 150
    move-object/from16 v16, v10

    .line 151
    .line 152
    :try_start_1
    new-instance v10, Landroid/content/Intent;

    .line 153
    .line 154
    move-object/from16 p2, v14

    .line 155
    .line 156
    const-string v14, "android.intent.action.VIEW"

    .line 157
    .line 158
    move-object/from16 p3, v15

    .line 159
    .line 160
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 161
    .line 162
    .line 163
    move-result-object v15

    .line 164
    invoke-direct {v10, v14, v15}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 165
    .line 166
    .line 167
    const/4 v14, 0x0

    .line 168
    invoke-virtual {v13, v10, v14}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    if-eqz v10, :cond_a

    .line 173
    .line 174
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result v10

    .line 178
    if-nez v10, :cond_a

    .line 179
    .line 180
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    if-nez v10, :cond_6

    .line 185
    .line 186
    invoke-virtual {v1, v6, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :catch_1
    move-exception v0

    .line 191
    move-object/from16 v2, v16

    .line 192
    .line 193
    goto/16 :goto_3

    .line 194
    .line 195
    :cond_6
    :goto_1
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    if-nez v6, :cond_7

    .line 200
    .line 201
    invoke-virtual {v1, v5, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    :cond_7
    invoke-virtual {v1, v7, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    const-string v3, "_cis"

    .line 208
    .line 209
    const-string v5, "ddp"

    .line 210
    .line 211
    invoke-virtual {v1, v3, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    iget-object v2, v2, Lij3;->X:Lsl3;

    .line 215
    .line 216
    const-string v3, "auto"

    .line 217
    .line 218
    const-string v5, "_cmp"

    .line 219
    .line 220
    invoke-virtual {v2, v3, v5, v1}, Lsl3;->G(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 224
    .line 225
    .line 226
    move-result v1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 227
    if-eqz v1, :cond_8

    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_8
    :try_start_2
    const-string v1, "google.analytics.deferred.deeplink.prefs"

    .line 231
    .line 232
    invoke-virtual {v12, v1, v14}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-interface {v1, v8, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 241
    .line 242
    .line 243
    invoke-static/range {p0 .. p1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 244
    .line 245
    .line 246
    move-result-wide v2

    .line 247
    invoke-interface {v1, v4, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 248
    .line 249
    .line 250
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 251
    .line 252
    .line 253
    move-result v0
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 254
    if-eqz v0, :cond_b

    .line 255
    .line 256
    :try_start_3
    new-instance v0, Landroid/content/Intent;

    .line 257
    .line 258
    const-string v1, "android.google.analytics.action.DEEPLINK_ACTION"

    .line 259
    .line 260
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    move-object/from16 v15, p3

    .line 264
    .line 265
    iget-object v1, v15, Lij3;->a:Landroid/content/Context;

    .line 266
    .line 267
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 268
    .line 269
    const/16 v3, 0x22

    .line 270
    .line 271
    if-ge v2, v3, :cond_9

    .line 272
    .line 273
    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :cond_9
    invoke-static {}, Lgh;->f()Landroid/app/BroadcastOptions;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-static {v2}, Lgh;->g(Landroid/app/BroadcastOptions;)Landroid/app/BroadcastOptions;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    invoke-static {v2}, Lgh;->j(Landroid/app/BroadcastOptions;)Landroid/os/Bundle;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    invoke-static {v1, v0, v2}, Lgh;->q(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 290
    .line 291
    .line 292
    return-void

    .line 293
    :catch_2
    move-exception v0

    .line 294
    move-object/from16 v1, p2

    .line 295
    .line 296
    iget-object v1, v1, Lsq3;->a:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v1, Lij3;

    .line 299
    .line 300
    iget-object v1, v1, Lij3;->f:Luh3;

    .line 301
    .line 302
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 303
    .line 304
    .line 305
    iget-object v1, v1, Luh3;->f:Lsh3;

    .line 306
    .line 307
    const-string v2, "Failed to persist Deferred Deep Link. exception"

    .line 308
    .line 309
    invoke-virtual {v1, v0, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    goto :goto_4

    .line 313
    :cond_a
    :goto_2
    invoke-static/range {v16 .. v16}, Lij3;->l(Lhk3;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 314
    .line 315
    .line 316
    move-object/from16 v2, v16

    .line 317
    .line 318
    :try_start_4
    iget-object v1, v2, Luh3;->w:Lsh3;

    .line 319
    .line 320
    const-string v4, "Deferred Deep Link validation failed. gclid, gbraid, deep link"

    .line 321
    .line 322
    invoke-virtual {v1, v4, v3, v11, v0}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_3

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    :catch_3
    move-exception v0

    .line 327
    :goto_3
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 328
    .line 329
    .line 330
    iget-object v1, v2, Luh3;->f:Lsh3;

    .line 331
    .line 332
    const-string v2, "Failed to parse the Deferred Deep Link response. exception"

    .line 333
    .line 334
    invoke-virtual {v1, v0, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    :cond_b
    :goto_4
    return-void

    .line 338
    :goto_5
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 339
    .line 340
    .line 341
    iget-object v0, v2, Luh3;->X:Lsh3;

    .line 342
    .line 343
    const-string v1, "Deferred Deep Link response empty."

    .line 344
    .line 345
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    return-void

    .line 349
    :goto_6
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 350
    .line 351
    .line 352
    iget-object v2, v2, Luh3;->w:Lsh3;

    .line 353
    .line 354
    const-string v3, "Network Request for Deferred Deep Link failed. response, exception"

    .line 355
    .line 356
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-virtual {v2, v0, v3, v1}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    return-void
.end method

.method public c(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lpi3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Llo3;

    .line 4
    .line 5
    invoke-virtual {v0}, Leg3;->y()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Llo3;->D()V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lij3;

    .line 14
    .line 15
    iget-object v1, v0, Lij3;->e:Lki3;

    .line 16
    .line 17
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1, p2}, Lki3;->J(J)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, v1, Lki3;->W:Lhi3;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-virtual {v2, v3}, Lhi3;->b(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lij3;->q()Lih3;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Lih3;->E()V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-static {v1}, Lij3;->j(Lsq3;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, v1, Lki3;->a0:Lio/sentry/android/core/s;

    .line 46
    .line 47
    invoke-virtual {v0, p1, p2}, Lio/sentry/android/core/s;->b(J)V

    .line 48
    .line 49
    .line 50
    iget-object v0, v1, Lki3;->W:Lhi3;

    .line 51
    .line 52
    invoke-virtual {v0}, Lhi3;->a()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {p0, p1, p2}, Lpi3;->d(J)V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void
.end method

.method public d(J)V
    .locals 13

    .line 1
    iget-object p0, p0, Lpi3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Llo3;

    .line 4
    .line 5
    invoke-virtual {p0}, Leg3;->y()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lij3;

    .line 11
    .line 12
    invoke-virtual {p0}, Lij3;->d()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_0

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lij3;->e:Lki3;

    .line 21
    .line 22
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, v0, Lki3;->a0:Lio/sentry/android/core/s;

    .line 26
    .line 27
    invoke-virtual {v1, p1, p2}, Lio/sentry/android/core/s;->b(J)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lij3;->V:Lxt0;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    iget-object v3, p0, Lij3;->f:Luh3;

    .line 40
    .line 41
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 42
    .line 43
    .line 44
    iget-object v3, v3, Luh3;->Y:Lsh3;

    .line 45
    .line 46
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v2, "Session started, time"

    .line 51
    .line 52
    invoke-virtual {v3, v1, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-wide/16 v1, 0x3e8

    .line 56
    .line 57
    div-long v1, p1, v1

    .line 58
    .line 59
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    iget-object v7, p0, Lij3;->X:Lsl3;

    .line 64
    .line 65
    invoke-static {v7}, Lij3;->k(Lwg3;)V

    .line 66
    .line 67
    .line 68
    move-object v3, v7

    .line 69
    const-string v7, "auto"

    .line 70
    .line 71
    const-string v8, "_sid"

    .line 72
    .line 73
    move-wide v4, p1

    .line 74
    invoke-virtual/range {v3 .. v8}, Lsl3;->K(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    move-wide v11, v4

    .line 78
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 79
    .line 80
    .line 81
    iget-object p0, v0, Lki3;->b0:Lio/sentry/android/core/s;

    .line 82
    .line 83
    invoke-virtual {p0, v1, v2}, Lio/sentry/android/core/s;->b(J)V

    .line 84
    .line 85
    .line 86
    iget-object p0, v0, Lki3;->W:Lhi3;

    .line 87
    .line 88
    const/4 p1, 0x0

    .line 89
    invoke-virtual {p0, p1}, Lhi3;->b(Z)V

    .line 90
    .line 91
    .line 92
    new-instance v10, Landroid/os/Bundle;

    .line 93
    .line 94
    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 95
    .line 96
    .line 97
    const-string p0, "_sid"

    .line 98
    .line 99
    invoke-virtual {v10, p0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 100
    .line 101
    .line 102
    invoke-static {v3}, Lij3;->k(Lwg3;)V

    .line 103
    .line 104
    .line 105
    const-string v8, "auto"

    .line 106
    .line 107
    const-string v9, "_s"

    .line 108
    .line 109
    move-object v7, v3

    .line 110
    invoke-virtual/range {v7 .. v12}, Lsl3;->H(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 111
    .line 112
    .line 113
    iget-object p0, v0, Lki3;->g0:Ltj;

    .line 114
    .line 115
    invoke-virtual {p0}, Ltj;->m()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-nez p1, :cond_1

    .line 124
    .line 125
    new-instance v10, Landroid/os/Bundle;

    .line 126
    .line 127
    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 128
    .line 129
    .line 130
    const-string p1, "_ffr"

    .line 131
    .line 132
    invoke-virtual {v10, p1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v3}, Lij3;->k(Lwg3;)V

    .line 136
    .line 137
    .line 138
    const-string v8, "auto"

    .line 139
    .line 140
    const-string v9, "_ssr"

    .line 141
    .line 142
    move-object v7, v3

    .line 143
    invoke-virtual/range {v7 .. v12}, Lsl3;->H(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 144
    .line 145
    .line 146
    :cond_1
    :goto_0
    return-void
.end method

.method public e(ILcn3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lpi3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lkn3;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lkn3;->g(ILcn3;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public f(II)V
    .locals 1

    .line 1
    add-int v0, p2, p2

    .line 2
    .line 3
    shr-int/lit8 p2, p2, 0x1f

    .line 4
    .line 5
    xor-int/2addr p2, v0

    .line 6
    iget-object p0, p0, Lpi3;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lkn3;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lkn3;->c(II)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public g(IJ)V
    .locals 3

    .line 1
    add-long v0, p2, p2

    .line 2
    .line 3
    const/16 v2, 0x3f

    .line 4
    .line 5
    shr-long/2addr p2, v2

    .line 6
    xor-long/2addr p2, v0

    .line 7
    iget-object p0, p0, Lpi3;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lkn3;

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3}, Lkn3;->e(IJ)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public h(ILjava/lang/Object;Lbq3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lpi3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lkn3;

    .line 4
    .line 5
    check-cast p2, Ltm3;

    .line 6
    .line 7
    shl-int/lit8 p1, p1, 0x3

    .line 8
    .line 9
    or-int/lit8 p1, p1, 0x2

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lkn3;->j(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2, p3}, Ltm3;->b(Lbq3;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p0, p1}, Lkn3;->j(I)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lkn3;->a:Lpi3;

    .line 22
    .line 23
    invoke-interface {p3, p2, p0}, Lbq3;->e(Ljava/lang/Object;Lpi3;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public i(ILjava/lang/Object;Lbq3;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lpi3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lkn3;

    .line 4
    .line 5
    check-cast p2, Ltm3;

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    invoke-virtual {p0, p1, v0}, Lkn3;->b(II)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lkn3;->a:Lpi3;

    .line 12
    .line 13
    invoke-interface {p3, p2, v0}, Lbq3;->e(Ljava/lang/Object;Lpi3;)V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x4

    .line 17
    invoke-virtual {p0, p1, p2}, Lkn3;->b(II)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public zza()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lpi3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lqf3;

    .line 4
    .line 5
    iget-object p0, p0, Lqf3;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/content/Context;

    .line 8
    .line 9
    return-object p0
.end method

.class public final Lvc0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final synthetic b:Lvc0;


# instance fields
.field public final synthetic a:I


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lvc0;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, Lvc0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lvc0;->b:Lvc0;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lvc0;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget p0, p0, Lvc0;->a:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzkl;->zzc()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-static {}, Lcom/supercell/titan/VirtualKeyboardHandler;->inputOkPressed()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    invoke-static {}, Lcom/supercell/titan/VirtualKeyboardHandler;->inputOkPressed()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_2
    :try_start_0
    invoke-static {}, Lrs0;->b()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p0, "Helpshift"

    .line 28
    .line 29
    const-string v0, "requestUnreadMessageCount is called with shouldFetchFromServer = true"

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-static {p0, v0, v1}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lrs0;->y:Lrs0;

    .line 36
    .line 37
    iget-object v0, p0, Lrs0;->p:Lra2;

    .line 38
    .line 39
    new-instance v1, Lye;

    .line 40
    .line 41
    const/16 v2, 0xc

    .line 42
    .line 43
    invoke-direct {v1, p0, v2}, Lye;-><init>(Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lra2;->u(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception v0

    .line 51
    move-object p0, v0

    .line 52
    const-string v0, "HelpshiftTitan"

    .line 53
    .line 54
    const-string v1, "HelpshiftTitan.requestNotificationCount"

    .line 55
    .line 56
    invoke-static {v0, v1, p0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 57
    .line 58
    .line 59
    :goto_0
    return-void

    .line 60
    :pswitch_3
    sget-object p0, Lrs0;->y:Lrs0;

    .line 61
    .line 62
    iget-object p0, p0, Lrs0;->s:Lcb;

    .line 63
    .line 64
    invoke-virtual {p0}, Lcb;->L()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_4
    sget-object p0, Lrs0;->y:Lrs0;

    .line 69
    .line 70
    iget-object v2, p0, Lrs0;->j:Lxy1;

    .line 71
    .line 72
    monitor-enter v2

    .line 73
    :try_start_1
    iget-object v3, v2, Lxy1;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v3, Ler0;

    .line 76
    .line 77
    const-string v4, "app_launch_last_sync_timestamp"

    .line 78
    .line 79
    iget-object v3, v3, Ler0;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v3, Ler0;

    .line 82
    .line 83
    invoke-virtual {v3, v4}, Ler0;->p(Ljava/lang/String;)J

    .line 84
    .line 85
    .line 86
    move-result-wide v3

    .line 87
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 88
    .line 89
    .line 90
    move-result-wide v5

    .line 91
    invoke-virtual {v2, v5, v6}, Lxy1;->b(J)V

    .line 92
    .line 93
    .line 94
    const-wide/32 v7, 0x5265c00

    .line 95
    .line 96
    .line 97
    add-long v9, v3, v7

    .line 98
    .line 99
    cmp-long v9, v5, v9

    .line 100
    .line 101
    if-lez v9, :cond_3

    .line 102
    .line 103
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 104
    .line 105
    .line 106
    move-result-wide v9

    .line 107
    div-long/2addr v3, v7

    .line 108
    div-long/2addr v9, v7

    .line 109
    cmp-long v3, v3, v9

    .line 110
    .line 111
    if-nez v3, :cond_1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    invoke-virtual {v2}, Lxy1;->f()Lorg/json/JSONArray;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-nez v4, :cond_2

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_2
    iget-object v4, v2, Lxy1;->e:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v4, Lra2;

    .line 128
    .line 129
    iget-object v4, v4, Lra2;->a:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v4, Lfs0;

    .line 132
    .line 133
    new-instance v7, Les0;

    .line 134
    .line 135
    invoke-direct {v7, v2, v3, v5, v6}, Les0;-><init>(Lxy1;Lorg/json/JSONArray;J)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4, v7}, Lfs0;->w(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    .line 140
    .line 141
    :cond_3
    :goto_1
    monitor-exit v2

    .line 142
    iget-object v2, p0, Lrs0;->j:Lxy1;

    .line 143
    .line 144
    iget-object v3, v2, Lxy1;->c:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v3, Ler0;

    .line 147
    .line 148
    invoke-virtual {v3}, Ler0;->n()Lorg/json/JSONArray;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-nez v4, :cond_4

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    iget-object v4, v2, Lxy1;->e:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v4, Lra2;

    .line 162
    .line 163
    iget-object v4, v4, Lra2;->a:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v4, Lfs0;

    .line 166
    .line 167
    new-instance v5, Ldp0;

    .line 168
    .line 169
    const/16 v6, 0x9

    .line 170
    .line 171
    invoke-direct {v5, v2, v3, v6, v1}, Ldp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4, v5}, Lfs0;->w(Ljava/lang/Runnable;)V

    .line 175
    .line 176
    .line 177
    :goto_2
    new-instance v7, Lwi1;

    .line 178
    .line 179
    iget-object v8, p0, Lrs0;->x:Landroid/content/Context;

    .line 180
    .line 181
    iget-object v9, p0, Lrs0;->g:Lec0;

    .line 182
    .line 183
    iget-object v10, p0, Lrs0;->n:Ler0;

    .line 184
    .line 185
    iget-object v11, p0, Lrs0;->r:Lcb;

    .line 186
    .line 187
    iget-object v12, p0, Lrs0;->p:Lra2;

    .line 188
    .line 189
    invoke-direct/range {v7 .. v12}, Lwi1;-><init>(Landroid/content/Context;Lec0;Ler0;Lcb;Lra2;)V

    .line 190
    .line 191
    .line 192
    iget-object v2, v7, Lwi1;->a:Landroid/content/SharedPreferences;

    .line 193
    .line 194
    const-string v3, "migration_state"

    .line 195
    .line 196
    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    if-eq v3, v0, :cond_7

    .line 201
    .line 202
    if-nez v3, :cond_5

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_5
    const-string v0, "failure_logs_synced"

    .line 206
    .line 207
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_6

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_6
    iget-object v0, v7, Lwi1;->e:Lra2;

    .line 215
    .line 216
    iget-object v0, v0, Lra2;->a:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, Lfs0;

    .line 219
    .line 220
    new-instance v2, Lye;

    .line 221
    .line 222
    const/16 v3, 0x10

    .line 223
    .line 224
    invoke-direct {v2, v7, v3}, Lye;-><init>(Ljava/lang/Object;I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v2}, Lfs0;->w(Ljava/lang/Runnable;)V

    .line 228
    .line 229
    .line 230
    :cond_7
    :goto_3
    iget-object v0, p0, Lrs0;->f:Lnm;

    .line 231
    .line 232
    iget-object v2, v0, Lnm;->a:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v2, Ler0;

    .line 235
    .line 236
    invoke-virtual {v0}, Lnm;->m()Z

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    if-nez v3, :cond_8

    .line 241
    .line 242
    invoke-virtual {v0}, Lnm;->p()Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-eqz v3, :cond_8

    .line 247
    .line 248
    invoke-virtual {v2}, Ler0;->m()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-static {v3}, Lb40;->p(Ljava/lang/String;)Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-nez v3, :cond_8

    .line 257
    .line 258
    iget-object p0, v0, Lnm;->c:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast p0, Lqi1;

    .line 261
    .line 262
    invoke-virtual {v2}, Ler0;->m()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-virtual {v0}, Lnm;->e()Ljava/util/HashMap;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    new-instance v4, Ler0;

    .line 271
    .line 272
    const/16 v5, 0x16

    .line 273
    .line 274
    invoke-direct {v4, v0, v5}, Ler0;-><init>(Ljava/lang/Object;I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {p0, v2, v3, v1, v4}, Lqi1;->i(Ljava/lang/String;Ljava/util/HashMap;ZLer0;)V

    .line 278
    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_8
    iget-object p0, p0, Lrs0;->s:Lcb;

    .line 282
    .line 283
    invoke-virtual {p0}, Lcb;->K()V

    .line 284
    .line 285
    .line 286
    :goto_4
    return-void

    .line 287
    :catchall_0
    move-exception v0

    .line 288
    move-object p0, v0

    .line 289
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 290
    throw p0

    .line 291
    :pswitch_5
    :try_start_3
    const-string p0, "EmojiCompat.EmojiCompatInitializer.run"

    .line 292
    .line 293
    sget v2, Loq2;->a:I

    .line 294
    .line 295
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    sget-object p0, Lsc0;->k:Lsc0;

    .line 299
    .line 300
    if-eqz p0, :cond_9

    .line 301
    .line 302
    goto :goto_5

    .line 303
    :cond_9
    move v0, v1

    .line 304
    :goto_5
    if-eqz v0, :cond_a

    .line 305
    .line 306
    invoke-static {}, Lsc0;->a()Lsc0;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    invoke-virtual {p0}, Lsc0;->c()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 311
    .line 312
    .line 313
    :cond_a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 314
    .line 315
    .line 316
    return-void

    .line 317
    :catchall_1
    move-exception v0

    .line 318
    move-object p0, v0

    .line 319
    sget v0, Loq2;->a:I

    .line 320
    .line 321
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 322
    .line 323
    .line 324
    throw p0

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

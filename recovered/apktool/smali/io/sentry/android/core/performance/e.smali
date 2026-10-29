.class public final synthetic Lio/sentry/android/core/performance/e;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/os/MessageQueue$IdleHandler;


# instance fields
.field public final synthetic a:Lio/sentry/android/core/performance/g;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/performance/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/sentry/android/core/performance/e;->a:Lio/sentry/android/core/performance/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final queueIdle()Z
    .locals 12

    .line 1
    iget-object p0, p0, Lio/sentry/android/core/performance/e;->a:Lio/sentry/android/core/performance/g;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Lio/sentry/android/core/performance/g;->c:J

    .line 8
    .line 9
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->a0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_e

    .line 22
    .line 23
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->c0:Lx6;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-static {}, Lio/sentry/android/core/n0;->j()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->b:Lio/sentry/util/g;

    .line 36
    .line 37
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Lio/sentry/util/g;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->a:Lio/sentry/android/core/performance/f;

    .line 43
    .line 44
    sget-object v2, Lio/sentry/android/core/performance/f;->UNKNOWN:Lio/sentry/android/core/performance/f;

    .line 45
    .line 46
    if-ne v0, v2, :cond_1

    .line 47
    .line 48
    sget-object v0, Lio/sentry/android/core/performance/f;->COLD:Lio/sentry/android/core/performance/f;

    .line 49
    .line 50
    iput-object v0, p0, Lio/sentry/android/core/performance/g;->a:Lio/sentry/android/core/performance/f;

    .line 51
    .line 52
    :cond_1
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/v;

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    iget-object v0, v0, Lio/sentry/android/core/v;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/v;

    .line 66
    .line 67
    invoke-virtual {v0}, Lio/sentry/android/core/v;->close()V

    .line 68
    .line 69
    .line 70
    iput-object v2, p0, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/v;

    .line 71
    .line 72
    :cond_2
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->U:Lio/sentry/android/core/h;

    .line 73
    .line 74
    const/4 v3, 0x1

    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    iget-boolean v4, v0, Lio/sentry/android/core/h;->w:Z

    .line 78
    .line 79
    if-eqz v4, :cond_3

    .line 80
    .line 81
    invoke-virtual {v0, v3}, Lio/sentry/android/core/h;->a(Z)V

    .line 82
    .line 83
    .line 84
    iput-object v2, p0, Lio/sentry/android/core/performance/g;->U:Lio/sentry/android/core/h;

    .line 85
    .line 86
    :cond_3
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->c0:Lx6;

    .line 87
    .line 88
    if-eqz v0, :cond_e

    .line 89
    .line 90
    iget-object v4, p0, Lio/sentry/android/core/performance/g;->b0:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 91
    .line 92
    invoke-virtual {v4, v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_e

    .line 97
    .line 98
    iget-object v3, p0, Lio/sentry/android/core/performance/g;->f:Lio/sentry/android/core/performance/h;

    .line 99
    .line 100
    invoke-virtual {v3}, Lio/sentry/android/core/performance/h;->e()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    const-wide/32 v5, 0xf4240

    .line 105
    .line 106
    .line 107
    if-eqz v4, :cond_4

    .line 108
    .line 109
    iget-wide v7, v3, Lio/sentry/android/core/performance/h;->c:J

    .line 110
    .line 111
    invoke-virtual {v3}, Lio/sentry/android/core/performance/h;->a()J

    .line 112
    .line 113
    .line 114
    move-result-wide v3

    .line 115
    add-long/2addr v3, v7

    .line 116
    invoke-virtual {p0, v3, v4}, Lio/sentry/android/core/performance/g;->h(J)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_4
    iget-object v3, p0, Lio/sentry/android/core/performance/g;->h0:Landroid/app/ApplicationStartInfo;

    .line 121
    .line 122
    if-eqz v3, :cond_5

    .line 123
    .line 124
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 125
    .line 126
    const/16 v7, 0x23

    .line 127
    .line 128
    if-lt v4, v7, :cond_5

    .line 129
    .line 130
    :try_start_0
    invoke-static {v3}, Lio/sentry/android/core/performance/c;->d(Landroid/app/ApplicationStartInfo;)Ljava/util/Map;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    const/4 v4, 0x2

    .line 135
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    check-cast v3, Ljava/lang/Long;

    .line 144
    .line 145
    if-eqz v3, :cond_5

    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 148
    .line 149
    .line 150
    move-result-wide v3

    .line 151
    div-long/2addr v3, v5

    .line 152
    invoke-virtual {p0, v3, v4}, Lio/sentry/android/core/performance/g;->h(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :catchall_0
    :cond_5
    sget-wide v3, Lio/sentry/android/core/performance/g;->j0:J

    .line 157
    .line 158
    invoke-virtual {p0, v3, v4}, Lio/sentry/android/core/performance/g;->h(J)V

    .line 159
    .line 160
    .line 161
    :goto_0
    iget-object p0, v0, Lx6;->b:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast p0, Lio/sentry/android/core/ActivityLifecycleIntegration;

    .line 164
    .line 165
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/h4;

    .line 166
    .line 167
    if-eqz v0, :cond_e

    .line 168
    .line 169
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->d:Lio/sentry/android/core/SentryAndroidOptions;

    .line 170
    .line 171
    if-eqz v0, :cond_e

    .line 172
    .line 173
    iget-boolean v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->e:Z

    .line 174
    .line 175
    if-nez v0, :cond_6

    .line 176
    .line 177
    goto/16 :goto_5

    .line 178
    .line 179
    :cond_6
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    iput-object v2, v0, Lio/sentry/android/core/performance/g;->V:Lio/sentry/t3;

    .line 184
    .line 185
    iget-object v3, v0, Lio/sentry/android/core/performance/g;->d:Lio/sentry/android/core/performance/h;

    .line 186
    .line 187
    invoke-virtual {v3}, Lio/sentry/android/core/performance/h;->d()Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-eqz v4, :cond_7

    .line 192
    .line 193
    invoke-virtual {v3}, Lio/sentry/android/core/performance/h;->e()Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-eqz v4, :cond_7

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_7
    iget-object v3, v0, Lio/sentry/android/core/performance/g;->e:Lio/sentry/android/core/performance/h;

    .line 201
    .line 202
    :goto_1
    invoke-virtual {v3}, Lio/sentry/android/core/performance/h;->d()Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-eqz v4, :cond_e

    .line 207
    .line 208
    invoke-virtual {v3}, Lio/sentry/android/core/performance/h;->e()Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    if-nez v4, :cond_8

    .line 213
    .line 214
    goto/16 :goto_5

    .line 215
    .line 216
    :cond_8
    invoke-virtual {v3}, Lio/sentry/android/core/performance/h;->b()Lio/sentry/r5;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    invoke-virtual {v3}, Lio/sentry/android/core/performance/h;->e()Z

    .line 221
    .line 222
    .line 223
    move-result v7

    .line 224
    if-eqz v7, :cond_a

    .line 225
    .line 226
    new-instance v7, Lio/sentry/r5;

    .line 227
    .line 228
    invoke-virtual {v3}, Lio/sentry/android/core/performance/h;->d()Z

    .line 229
    .line 230
    .line 231
    move-result v8

    .line 232
    if-eqz v8, :cond_9

    .line 233
    .line 234
    iget-wide v8, v3, Lio/sentry/android/core/performance/h;->b:J

    .line 235
    .line 236
    invoke-virtual {v3}, Lio/sentry/android/core/performance/h;->a()J

    .line 237
    .line 238
    .line 239
    move-result-wide v10

    .line 240
    add-long/2addr v10, v8

    .line 241
    goto :goto_2

    .line 242
    :cond_9
    const-wide/16 v10, 0x0

    .line 243
    .line 244
    :goto_2
    mul-long/2addr v10, v5

    .line 245
    invoke-direct {v7, v10, v11}, Lio/sentry/r5;-><init>(J)V

    .line 246
    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_a
    move-object v7, v2

    .line 250
    :goto_3
    if-eqz v4, :cond_e

    .line 251
    .line 252
    if-nez v7, :cond_b

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_b
    iput-object v7, v0, Lio/sentry/android/core/performance/g;->g0:Lio/sentry/t4;

    .line 256
    .line 257
    iget-object v3, v0, Lio/sentry/android/core/performance/g;->i0:Lio/sentry/android/core/o0;

    .line 258
    .line 259
    iget-object v3, v3, Lio/sentry/android/core/o0;->a:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v3, Lio/sentry/util/a;

    .line 262
    .line 263
    invoke-virtual {v3}, Lio/sentry/util/a;->c()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v3}, Lio/sentry/util/a;->close()V

    .line 267
    .line 268
    .line 269
    iget-boolean v0, v0, Lio/sentry/android/core/performance/g;->X:Z

    .line 270
    .line 271
    if-eqz v0, :cond_e

    .line 272
    .line 273
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    new-instance v3, Lio/sentry/k7;

    .line 278
    .line 279
    invoke-direct {v3}, Lio/sentry/k7;-><init>()V

    .line 280
    .line 281
    .line 282
    sget-object v5, Lio/sentry/c4;->OFF:Lio/sentry/c4;

    .line 283
    .line 284
    iput-object v5, v3, Lio/sentry/e7;->b:Lio/sentry/c4;

    .line 285
    .line 286
    iput-object v4, v3, Lio/sentry/e7;->a:Lio/sentry/t4;

    .line 287
    .line 288
    const-string v4, "auto.app.start"

    .line 289
    .line 290
    iput-object v4, v3, Lio/sentry/e7;->d:Ljava/lang/String;

    .line 291
    .line 292
    iput-boolean v1, v3, Lio/sentry/k7;->e:Z

    .line 293
    .line 294
    new-instance v4, Lio/sentry/j7;

    .line 295
    .line 296
    sget-object v5, Lio/sentry/protocol/i0;->COMPONENT:Lio/sentry/protocol/i0;

    .line 297
    .line 298
    const-string v6, "app.start"

    .line 299
    .line 300
    const-string v8, "App Start"

    .line 301
    .line 302
    invoke-direct {v4, v8, v5, v6, v2}, Lio/sentry/j7;-><init>(Ljava/lang/String;Lio/sentry/protocol/i0;Ljava/lang/String;Lio/sentry/t3;)V

    .line 303
    .line 304
    .line 305
    iget-object p0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->c:Lio/sentry/h4;

    .line 306
    .line 307
    invoke-virtual {p0, v4, v3}, Lio/sentry/h4;->q(Lio/sentry/j7;Lio/sentry/k7;)Lio/sentry/m1;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    invoke-virtual {v0}, Lio/sentry/android/core/performance/g;->a()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    if-eqz v3, :cond_c

    .line 316
    .line 317
    const-string v4, "app.vitals.start.reason"

    .line 318
    .line 319
    invoke-interface {p0, v3, v4}, Lio/sentry/k1;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    :cond_c
    invoke-interface {p0}, Lio/sentry/k1;->s()Lio/sentry/b7;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    iget-object v3, v3, Lio/sentry/b7;->a:Lio/sentry/protocol/w;

    .line 327
    .line 328
    iput-object v3, v0, Lio/sentry/android/core/performance/g;->d0:Lio/sentry/protocol/w;

    .line 329
    .line 330
    invoke-interface {p0}, Lio/sentry/k1;->b()Lio/sentry/t6;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    invoke-virtual {v3}, Lio/sentry/t6;->a()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    iput-object v3, v0, Lio/sentry/android/core/performance/g;->e0:Ljava/lang/String;

    .line 339
    .line 340
    invoke-interface {p0}, Lio/sentry/k1;->k()Lio/sentry/d;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    if-nez v3, :cond_d

    .line 345
    .line 346
    goto :goto_4

    .line 347
    :cond_d
    iget-object v2, v3, Lio/sentry/d;->a:Ljava/lang/String;

    .line 348
    .line 349
    :goto_4
    iput-object v2, v0, Lio/sentry/android/core/performance/g;->f0:Ljava/lang/String;

    .line 350
    .line 351
    sget-object v0, Lio/sentry/f7;->OK:Lio/sentry/f7;

    .line 352
    .line 353
    invoke-interface {p0, v0, v7}, Lio/sentry/k1;->v(Lio/sentry/f7;Lio/sentry/t4;)V

    .line 354
    .line 355
    .line 356
    :cond_e
    :goto_5
    return v1
.end method

.class public final synthetic Lio/sentry/android/core/b0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;JLandroid/content/res/Configuration;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lio/sentry/android/core/b0;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lio/sentry/android/core/b0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-wide p2, p0, Lio/sentry/android/core/b0;->b:J

    .line 10
    .line 11
    iput-object p4, p0, Lio/sentry/android/core/b0;->d:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/android/replay/capture/g;Lio/sentry/android/replay/p;J)V
    .locals 1

    .line 14
    const/4 v0, 0x1

    iput v0, p0, Lio/sentry/android/core/b0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/b0;->c:Ljava/lang/Object;

    iput-object p2, p0, Lio/sentry/android/core/b0;->d:Ljava/lang/Object;

    iput-wide p3, p0, Lio/sentry/android/core/b0;->b:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget v0, p0, Lio/sentry/android/core/b0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-wide v3, p0, Lio/sentry/android/core/b0;->b:J

    .line 6
    .line 7
    iget-object v5, p0, Lio/sentry/android/core/b0;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Lio/sentry/android/core/b0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v9, p0

    .line 15
    check-cast v9, Lio/sentry/android/replay/capture/g;

    .line 16
    .line 17
    check-cast v5, Lio/sentry/android/replay/p;

    .line 18
    .line 19
    iget-object p0, v9, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v5, p0, v0}, Lio/sentry/android/replay/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object p0, v9, Lio/sentry/android/replay/capture/g;->v:Lio/sentry/transport/f;

    .line 31
    .line 32
    invoke-interface {p0}, Lio/sentry/transport/f;->c()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    iget-object p0, v9, Lio/sentry/android/replay/capture/g;->t:Lio/sentry/m6;

    .line 37
    .line 38
    invoke-virtual {p0}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    iget-wide v5, p0, Lio/sentry/q6;->h:J

    .line 43
    .line 44
    sub-long v7, v3, v5

    .line 45
    .line 46
    iget-object p0, v9, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    .line 47
    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0, v7, v8}, Lio/sentry/android/replay/k;->i(J)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object p0, v2

    .line 56
    :goto_0
    iget-object v0, v9, Lio/sentry/android/replay/capture/c;->l:Lio/sentry/android/replay/capture/b;

    .line 57
    .line 58
    sget-object v3, Lio/sentry/android/replay/capture/c;->s:[Lu21;

    .line 59
    .line 60
    aget-object v1, v3, v1

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v1, v0, Lio/sentry/android/replay/capture/b;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 69
    .line 70
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-nez v3, :cond_3

    .line 79
    .line 80
    new-instance v3, Lio/sentry/android/replay/capture/a;

    .line 81
    .line 82
    iget-object v4, v0, Lio/sentry/android/replay/capture/b;->d:Lio/sentry/android/replay/capture/c;

    .line 83
    .line 84
    const/4 v5, 0x3

    .line 85
    invoke-direct {v3, v1, p0, v4, v5}, Lio/sentry/android/replay/capture/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/c;I)V

    .line 86
    .line 87
    .line 88
    iget-object p0, v0, Lio/sentry/android/replay/capture/b;->c:Lio/sentry/android/replay/capture/c;

    .line 89
    .line 90
    iget-object v1, p0, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/m6;

    .line 91
    .line 92
    invoke-virtual {v1}, Lio/sentry/m6;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-interface {v0}, Lio/sentry/util/thread/a;->c()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_2

    .line 101
    .line 102
    iget-object p0, p0, Lio/sentry/android/replay/capture/c;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 103
    .line 104
    new-instance v0, Lio/sentry/android/replay/util/h;

    .line 105
    .line 106
    new-instance v1, Lio/sentry/k2;

    .line 107
    .line 108
    const/4 v4, 0x6

    .line 109
    invoke-direct {v1, v3, v4}, Lio/sentry/k2;-><init>(Ljava/lang/Object;I)V

    .line 110
    .line 111
    .line 112
    const-string v3, "CaptureStrategy.runInBackground"

    .line 113
    .line 114
    invoke-direct {v0, v1, v3}, Lio/sentry/android/replay/util/h;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-interface {p0, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    :try_start_0
    invoke-virtual {v3}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :catchall_0
    move-exception v0

    .line 126
    move-object p0, v0

    .line 127
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 132
    .line 133
    const-string v3, "Failed to execute task CaptureStrategy.runInBackground"

    .line 134
    .line 135
    invoke-interface {v0, v1, v3, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    :cond_3
    :goto_1
    iget-object p0, v9, Lio/sentry/android/replay/capture/g;->x:Ljava/util/ArrayList;

    .line 139
    .line 140
    new-instance v10, Le22;

    .line 141
    .line 142
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 143
    .line 144
    .line 145
    new-instance v6, Lio/sentry/android/replay/j;

    .line 146
    .line 147
    const/4 v11, 0x1

    .line 148
    invoke-direct/range {v6 .. v11}, Lio/sentry/android/replay/j;-><init>(JLjava/lang/Object;Ljava/io/Serializable;I)V

    .line 149
    .line 150
    .line 151
    invoke-static {p0, v6}, Luw;->n(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V

    .line 152
    .line 153
    .line 154
    iget-boolean v0, v10, Le22;->a:Z

    .line 155
    .line 156
    if-eqz v0, :cond_7

    .line 157
    .line 158
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    const/4 v0, 0x0

    .line 163
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_7

    .line 168
    .line 169
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    add-int/lit8 v3, v0, 0x1

    .line 174
    .line 175
    if-ltz v0, :cond_6

    .line 176
    .line 177
    check-cast v1, Lio/sentry/android/replay/capture/j;

    .line 178
    .line 179
    iget-object v4, v1, Lio/sentry/android/replay/capture/j;->a:Lio/sentry/o6;

    .line 180
    .line 181
    iput v0, v4, Lio/sentry/o6;->e0:I

    .line 182
    .line 183
    iget-object v1, v1, Lio/sentry/android/replay/capture/j;->b:Lio/sentry/x3;

    .line 184
    .line 185
    iget-object v1, v1, Lio/sentry/x3;->b:Ljava/util/List;

    .line 186
    .line 187
    if-eqz v1, :cond_5

    .line 188
    .line 189
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    :cond_4
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-eqz v4, :cond_5

    .line 198
    .line 199
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    check-cast v4, Lio/sentry/rrweb/b;

    .line 204
    .line 205
    instance-of v5, v4, Lio/sentry/rrweb/m;

    .line 206
    .line 207
    if-eqz v5, :cond_4

    .line 208
    .line 209
    check-cast v4, Lio/sentry/rrweb/m;

    .line 210
    .line 211
    iput v0, v4, Lio/sentry/rrweb/m;->d:I

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_5
    move v0, v3

    .line 215
    goto :goto_2

    .line 216
    :cond_6
    invoke-static {}, Lpw;->g()V

    .line 217
    .line 218
    .line 219
    throw v2

    .line 220
    :cond_7
    return-void

    .line 221
    :pswitch_0
    check-cast p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;

    .line 222
    .line 223
    check-cast v5, Landroid/content/res/Configuration;

    .line 224
    .line 225
    iget-object v0, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->b:Lio/sentry/h4;

    .line 226
    .line 227
    if-eqz v0, :cond_b

    .line 228
    .line 229
    iget-object v0, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->a:Landroid/content/Context;

    .line 230
    .line 231
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 240
    .line 241
    const/4 v6, 0x1

    .line 242
    if-eq v0, v6, :cond_9

    .line 243
    .line 244
    if-eq v0, v1, :cond_8

    .line 245
    .line 246
    goto :goto_4

    .line 247
    :cond_8
    sget-object v2, Lio/sentry/protocol/g;->LANDSCAPE:Lio/sentry/protocol/g;

    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_9
    sget-object v2, Lio/sentry/protocol/g;->PORTRAIT:Lio/sentry/protocol/g;

    .line 251
    .line 252
    :goto_4
    if-eqz v2, :cond_a

    .line 253
    .line 254
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 259
    .line 260
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    goto :goto_5

    .line 265
    :cond_a
    const-string v0, "undefined"

    .line 266
    .line 267
    :goto_5
    new-instance v1, Lio/sentry/f;

    .line 268
    .line 269
    invoke-direct {v1, v3, v4}, Lio/sentry/f;-><init>(J)V

    .line 270
    .line 271
    .line 272
    const-string v2, "navigation"

    .line 273
    .line 274
    iput-object v2, v1, Lio/sentry/f;->e:Ljava/lang/String;

    .line 275
    .line 276
    const-string v2, "device.orientation"

    .line 277
    .line 278
    iput-object v2, v1, Lio/sentry/f;->i:Ljava/lang/String;

    .line 279
    .line 280
    const-string v2, "position"

    .line 281
    .line 282
    invoke-virtual {v1, v0, v2}, Lio/sentry/f;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    sget-object v0, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 286
    .line 287
    iput-object v0, v1, Lio/sentry/f;->w:Lio/sentry/m5;

    .line 288
    .line 289
    new-instance v0, Lio/sentry/i0;

    .line 290
    .line 291
    invoke-direct {v0}, Lio/sentry/i0;-><init>()V

    .line 292
    .line 293
    .line 294
    const-string v2, "android:configuration"

    .line 295
    .line 296
    invoke-virtual {v0, v5, v2}, Lio/sentry/i0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    iget-object p0, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->b:Lio/sentry/h4;

    .line 300
    .line 301
    invoke-virtual {p0, v1, v0}, Lio/sentry/h4;->f(Lio/sentry/f;Lio/sentry/i0;)V

    .line 302
    .line 303
    .line 304
    :cond_b
    return-void

    .line 305
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public abstract Lio/sentry/m4;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static volatile a:Lio/sentry/d1;

.field public static volatile b:Lio/sentry/c1;

.field public static final c:Lio/sentry/b4;

.field public static volatile d:Z

.field public static final e:Ljava/nio/charset/Charset;

.field public static final f:J

.field public static final g:Lio/sentry/util/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lio/sentry/y2;->a:Lio/sentry/y2;

    .line 2
    .line 3
    sput-object v0, Lio/sentry/m4;->a:Lio/sentry/d1;

    .line 4
    .line 5
    sget-object v0, Lio/sentry/w2;->b:Lio/sentry/w2;

    .line 6
    .line 7
    sput-object v0, Lio/sentry/m4;->b:Lio/sentry/c1;

    .line 8
    .line 9
    new-instance v0, Lio/sentry/b4;

    .line 10
    .line 11
    invoke-static {}, Lio/sentry/m6;->empty()Lio/sentry/m6;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Lio/sentry/b4;-><init>(Lio/sentry/m6;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lio/sentry/m4;->c:Lio/sentry/b4;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    sput-boolean v0, Lio/sentry/m4;->d:Z

    .line 22
    .line 23
    const-string v0, "UTF-8"

    .line 24
    .line 25
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lio/sentry/m4;->e:Ljava/nio/charset/Charset;

    .line 30
    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    sput-wide v0, Lio/sentry/m4;->f:J

    .line 36
    .line 37
    new-instance v0, Lio/sentry/util/a;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lio/sentry/m4;->g:Lio/sentry/util/a;

    .line 43
    .line 44
    return-void
.end method

.method public static a()V
    .locals 3

    .line 1
    sget-object v0, Lio/sentry/m4;->g:Lio/sentry/util/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/sentry/util/a;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget-object v2, Lio/sentry/w2;->b:Lio/sentry/w2;

    .line 11
    .line 12
    sput-object v2, Lio/sentry/m4;->b:Lio/sentry/c1;

    .line 13
    .line 14
    sget-object v2, Lio/sentry/m4;->a:Lio/sentry/d1;

    .line 15
    .line 16
    invoke-interface {v2}, Lio/sentry/d1;->close()V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-interface {v1, v2}, Lio/sentry/c1;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_1
    move-exception v0

    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    throw v1
.end method

.method public static b()Lio/sentry/c1;
    .locals 2

    .line 1
    sget-boolean v0, Lio/sentry/m4;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lio/sentry/m4;->b:Lio/sentry/c1;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    sget-object v0, Lio/sentry/m4;->a:Lio/sentry/d1;

    .line 9
    .line 10
    invoke-interface {v0}, Lio/sentry/d1;->get()Lio/sentry/c1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    invoke-interface {v0}, Lio/sentry/c1;->s()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-object v0

    .line 24
    :cond_2
    :goto_0
    sget-object v0, Lio/sentry/m4;->b:Lio/sentry/c1;

    .line 25
    .line 26
    const-string v1, "getCurrentScopes"

    .line 27
    .line 28
    invoke-interface {v0, v1}, Lio/sentry/c1;->z(Ljava/lang/String;)Lio/sentry/c1;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, Lio/sentry/m4;->a:Lio/sentry/d1;

    .line 33
    .line 34
    invoke-interface {v1, v0}, Lio/sentry/d1;->a(Lio/sentry/c1;)Lio/sentry/h1;

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public static c(Lio/sentry/android/core/u;Lio/sentry/android/core/e;)V
    .locals 8

    .line 1
    const-class p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    new-instance v0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    invoke-direct {v0}, Lio/sentry/android/core/SentryAndroidOptions;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p1, v0}, Lio/sentry/android/core/e;->d(Lio/sentry/android/core/SentryAndroidOptions;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v2, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 18
    .line 19
    const-string v3, "Error in the \'OptionsConfiguration.configure\' callback."

    .line 20
    .line 21
    invoke-interface {v1, v2, v3, p1}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    const-string p1, "You are running Android. Please, use SentryAndroid.init. "

    .line 25
    .line 26
    sget-object v1, Lio/sentry/m4;->g:Lio/sentry/util/a;

    .line 27
    .line 28
    invoke-virtual {v1}, Lio/sentry/util/a;->c()V

    .line 29
    .line 30
    .line 31
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v3, "io.sentry.android.core.SentryAndroidOptions"

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    sget-boolean v2, Lio/sentry/util/k;->a:Z

    .line 44
    .line 45
    if-nez v2, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :catchall_1
    move-exception p0

    .line 63
    goto/16 :goto_c

    .line 64
    .line 65
    :cond_1
    :goto_1
    invoke-static {v0}, Lio/sentry/m4;->g(Lio/sentry/android/core/SentryAndroidOptions;)Z

    .line 66
    .line 67
    .line 68
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 69
    if-nez p0, :cond_2

    .line 70
    .line 71
    :goto_2
    invoke-virtual {v1}, Lio/sentry/util/a;->close()V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_b

    .line 75
    .line 76
    :cond_2
    :try_start_2
    invoke-virtual {v0}, Lio/sentry/m6;->isGlobalHubMode()Ljava/lang/Boolean;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    const/4 p1, 0x1

    .line 81
    if-eqz p0, :cond_3

    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    goto :goto_3

    .line 88
    :cond_3
    move p0, p1

    .line 89
    :goto_3
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    sget-object v3, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 94
    .line 95
    const-string v4, "GlobalHubMode: \'%s\'"

    .line 96
    .line 97
    invoke-static {p0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-interface {v2, v3, v4, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sput-boolean p0, Lio/sentry/m4;->d:Z

    .line 109
    .line 110
    invoke-virtual {v0}, Lio/sentry/m6;->getFatalLogger()Lio/sentry/ILogger;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    instance-of p0, p0, Lio/sentry/r2;

    .line 115
    .line 116
    if-eqz p0, :cond_4

    .line 117
    .line 118
    new-instance p0, Lio/sentry/l2;

    .line 119
    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, p0}, Lio/sentry/m6;->setFatalLogger(Lio/sentry/ILogger;)V

    .line 124
    .line 125
    .line 126
    :cond_4
    sget-object p0, Lio/sentry/m4;->c:Lio/sentry/b4;

    .line 127
    .line 128
    iget-object v2, p0, Lio/sentry/b4;->l:Lio/sentry/m6;

    .line 129
    .line 130
    invoke-static {}, Lio/sentry/m4;->f()Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    invoke-static {v2, v0, v3}, Lio/sentry/util/c;->s(Lio/sentry/m6;Lio/sentry/android/core/SentryAndroidOptions;Z)Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    const/4 v3, 0x0

    .line 139
    if-eqz v2, :cond_a

    .line 140
    .line 141
    invoke-static {}, Lio/sentry/m4;->f()Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-eqz v2, :cond_5

    .line 146
    .line 147
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    sget-object v4, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 152
    .line 153
    const-string v5, "Sentry has been already initialized. Previous configuration will be overwritten."

    .line 154
    .line 155
    new-array v6, v3, [Ljava/lang/Object;

    .line 156
    .line 157
    invoke-interface {v2, v4, v5, v6}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_5
    invoke-virtual {v0}, Lio/sentry/m6;->activate()V

    .line 161
    .line 162
    .line 163
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-interface {v2, p1}, Lio/sentry/c1;->a(Z)V

    .line 168
    .line 169
    .line 170
    iput-object v0, p0, Lio/sentry/b4;->l:Lio/sentry/m6;

    .line 171
    .line 172
    iget-object v2, p0, Lio/sentry/b4;->g:Ljava/util/Queue;

    .line 173
    .line 174
    invoke-virtual {v0}, Lio/sentry/m6;->getMaxBreadcrumbs()I

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    invoke-static {v4}, Lio/sentry/b4;->a(I)Ljava/util/Queue;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    iput-object v4, p0, Lio/sentry/b4;->g:Ljava/util/Queue;

    .line 183
    .line 184
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    if-eqz v4, :cond_6

    .line 193
    .line 194
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    check-cast v4, Lio/sentry/f;

    .line 199
    .line 200
    const/4 v5, 0x0

    .line 201
    invoke-virtual {p0, v4, v5}, Lio/sentry/b4;->f(Lio/sentry/f;Lio/sentry/i0;)V

    .line 202
    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_6
    new-instance v2, Lio/sentry/b4;

    .line 206
    .line 207
    invoke-direct {v2, v0}, Lio/sentry/b4;-><init>(Lio/sentry/m6;)V

    .line 208
    .line 209
    .line 210
    new-instance v4, Lio/sentry/b4;

    .line 211
    .line 212
    invoke-direct {v4, v0}, Lio/sentry/b4;-><init>(Lio/sentry/m6;)V

    .line 213
    .line 214
    .line 215
    new-instance v5, Lio/sentry/g4;

    .line 216
    .line 217
    invoke-direct {v5, v2, v4, p0}, Lio/sentry/g4;-><init>(Lio/sentry/a1;Lio/sentry/a1;Lio/sentry/a1;)V

    .line 218
    .line 219
    .line 220
    sput-object v5, Lio/sentry/m4;->b:Lio/sentry/c1;

    .line 221
    .line 222
    invoke-virtual {v0}, Lio/sentry/m6;->isDebug()Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-eqz v2, :cond_7

    .line 227
    .line 228
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    instance-of v2, v2, Lio/sentry/r2;

    .line 233
    .line 234
    if-eqz v2, :cond_7

    .line 235
    .line 236
    new-instance v2, Lio/sentry/l2;

    .line 237
    .line 238
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, v2}, Lio/sentry/m6;->setLogger(Lio/sentry/ILogger;)V

    .line 242
    .line 243
    .line 244
    :cond_7
    invoke-static {v0}, Lio/sentry/m4;->e(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 245
    .line 246
    .line 247
    sget-object v2, Lio/sentry/m4;->a:Lio/sentry/d1;

    .line 248
    .line 249
    sget-object v4, Lio/sentry/m4;->b:Lio/sentry/c1;

    .line 250
    .line 251
    invoke-interface {v2, v4}, Lio/sentry/d1;->a(Lio/sentry/c1;)Lio/sentry/h1;

    .line 252
    .line 253
    .line 254
    invoke-static {v0}, Lio/sentry/m4;->d(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 255
    .line 256
    .line 257
    new-instance v2, Lu93;

    .line 258
    .line 259
    invoke-direct {v2, v0}, Lu93;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 260
    .line 261
    .line 262
    iput-object v2, p0, Lio/sentry/b4;->u:Lio/sentry/f1;

    .line 263
    .line 264
    invoke-virtual {v0}, Lio/sentry/m6;->getExecutorService()Lio/sentry/g1;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    invoke-interface {p0}, Lio/sentry/g1;->isClosed()Z

    .line 269
    .line 270
    .line 271
    move-result p0

    .line 272
    if-eqz p0, :cond_8

    .line 273
    .line 274
    new-instance p0, Lio/sentry/g5;

    .line 275
    .line 276
    invoke-direct {p0, v0}, Lio/sentry/g5;-><init>(Lio/sentry/m6;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, p0}, Lio/sentry/m6;->setExecutorService(Lio/sentry/g1;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 280
    .line 281
    .line 282
    :cond_8
    :try_start_3
    invoke-virtual {v0}, Lio/sentry/m6;->getExecutorService()Lio/sentry/g1;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    new-instance v2, Lio/sentry/k4;

    .line 287
    .line 288
    invoke-direct {v2, v0, v3}, Lio/sentry/k4;-><init>(Lio/sentry/android/core/SentryAndroidOptions;I)V

    .line 289
    .line 290
    .line 291
    invoke-interface {p0, v2}, Lio/sentry/g1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_3
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 292
    .line 293
    .line 294
    goto :goto_5

    .line 295
    :catch_0
    move-exception p0

    .line 296
    :try_start_4
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    sget-object v4, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 301
    .line 302
    const-string v5, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?"

    .line 303
    .line 304
    invoke-interface {v2, v4, v5, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 305
    .line 306
    .line 307
    :goto_5
    :try_start_5
    invoke-virtual {v0}, Lio/sentry/m6;->getExecutorService()Lio/sentry/g1;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    new-instance v2, Lio/sentry/k2;

    .line 312
    .line 313
    invoke-direct {v2, v0, v3}, Lio/sentry/k2;-><init>(Ljava/lang/Object;I)V

    .line 314
    .line 315
    .line 316
    invoke-interface {p0, v2}, Lio/sentry/g1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 317
    .line 318
    .line 319
    goto :goto_6

    .line 320
    :catchall_2
    move-exception p0

    .line 321
    :try_start_6
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    sget-object v3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 326
    .line 327
    const-string v4, "Failed to move previous session."

    .line 328
    .line 329
    invoke-interface {v2, v3, v4, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 330
    .line 331
    .line 332
    :goto_6
    invoke-virtual {v0}, Lio/sentry/m6;->getIntegrations()Ljava/util/List;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 341
    .line 342
    .line 343
    move-result v2

    .line 344
    if-eqz v2, :cond_9

    .line 345
    .line 346
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    check-cast v2, Lio/sentry/s1;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 351
    .line 352
    :try_start_7
    invoke-interface {v2, v0}, Lio/sentry/s1;->l(Lio/sentry/android/core/SentryAndroidOptions;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 353
    .line 354
    .line 355
    goto :goto_7

    .line 356
    :catchall_3
    move-exception v3

    .line 357
    :try_start_8
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 358
    .line 359
    .line 360
    move-result-object v4

    .line 361
    sget-object v5, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 362
    .line 363
    new-instance v6, Ljava/lang/StringBuilder;

    .line 364
    .line 365
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 366
    .line 367
    .line 368
    const-string v7, "Failed to register the integration "

    .line 369
    .line 370
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    invoke-interface {v4, v5, v2, v3}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 389
    .line 390
    .line 391
    goto :goto_7

    .line 392
    :cond_9
    :try_start_9
    invoke-virtual {v0}, Lio/sentry/m6;->getExecutorService()Lio/sentry/g1;

    .line 393
    .line 394
    .line 395
    move-result-object p0

    .line 396
    new-instance v2, Lio/sentry/k4;

    .line 397
    .line 398
    const/4 v3, 0x2

    .line 399
    invoke-direct {v2, v0, v3}, Lio/sentry/k4;-><init>(Lio/sentry/android/core/SentryAndroidOptions;I)V

    .line 400
    .line 401
    .line 402
    invoke-interface {p0, v2}, Lio/sentry/g1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 403
    .line 404
    .line 405
    goto :goto_8

    .line 406
    :catchall_4
    move-exception p0

    .line 407
    :try_start_a
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    sget-object v3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 412
    .line 413
    const-string v4, "Failed to notify options observers."

    .line 414
    .line 415
    invoke-interface {v2, v3, v4, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 416
    .line 417
    .line 418
    :goto_8
    :try_start_b
    invoke-virtual {v0}, Lio/sentry/m6;->getExecutorService()Lio/sentry/g1;

    .line 419
    .line 420
    .line 421
    move-result-object p0

    .line 422
    new-instance v2, Lio/sentry/m3;

    .line 423
    .line 424
    invoke-direct {v2, v0}, Lio/sentry/m3;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 425
    .line 426
    .line 427
    invoke-interface {p0, v2}, Lio/sentry/g1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 428
    .line 429
    .line 430
    goto :goto_9

    .line 431
    :catchall_5
    move-exception p0

    .line 432
    :try_start_c
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    sget-object v3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 437
    .line 438
    const-string v4, "Failed to finalize previous session."

    .line 439
    .line 440
    invoke-interface {v2, v3, v4, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 441
    .line 442
    .line 443
    :goto_9
    invoke-virtual {v0}, Lio/sentry/m6;->getExecutorService()Lio/sentry/g1;

    .line 444
    .line 445
    .line 446
    move-result-object p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 447
    :try_start_d
    new-instance v2, Lio/sentry/k4;

    .line 448
    .line 449
    invoke-direct {v2, v0, p1}, Lio/sentry/k4;-><init>(Lio/sentry/android/core/SentryAndroidOptions;I)V

    .line 450
    .line 451
    .line 452
    invoke-interface {p0, v2}, Lio/sentry/g1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 453
    .line 454
    .line 455
    goto :goto_a

    .line 456
    :catchall_6
    move-exception p0

    .line 457
    :try_start_e
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 458
    .line 459
    .line 460
    move-result-object p1

    .line 461
    sget-object v2, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 462
    .line 463
    const-string v3, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?"

    .line 464
    .line 465
    invoke-interface {p1, v2, v3, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 466
    .line 467
    .line 468
    :goto_a
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 469
    .line 470
    .line 471
    move-result-object p0

    .line 472
    sget-object p1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 473
    .line 474
    const-string v2, "Using openTelemetryMode %s"

    .line 475
    .line 476
    invoke-virtual {v0}, Lio/sentry/m6;->getOpenTelemetryMode()Lio/sentry/v5;

    .line 477
    .line 478
    .line 479
    move-result-object v3

    .line 480
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v3

    .line 484
    invoke-interface {p0, p1, v2, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 488
    .line 489
    .line 490
    move-result-object p0

    .line 491
    const-string v2, "Using span factory %s"

    .line 492
    .line 493
    invoke-virtual {v0}, Lio/sentry/m6;->getSpanFactory()Lio/sentry/l1;

    .line 494
    .line 495
    .line 496
    move-result-object v3

    .line 497
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v3

    .line 505
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v3

    .line 509
    invoke-interface {p0, p1, v2, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 513
    .line 514
    .line 515
    move-result-object p0

    .line 516
    const-string v0, "Using scopes storage %s"

    .line 517
    .line 518
    sget-object v2, Lio/sentry/m4;->a:Lio/sentry/d1;

    .line 519
    .line 520
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    invoke-interface {p0, p1, v0, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 533
    .line 534
    .line 535
    goto/16 :goto_2

    .line 536
    .line 537
    :cond_a
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 538
    .line 539
    .line 540
    move-result-object p0

    .line 541
    sget-object p1, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 542
    .line 543
    const-string v0, "This init call has been ignored due to priority being too low."

    .line 544
    .line 545
    new-array v2, v3, [Ljava/lang/Object;

    .line 546
    .line 547
    invoke-interface {p0, p1, v0, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 548
    .line 549
    .line 550
    goto/16 :goto_2

    .line 551
    .line 552
    :goto_b
    return-void

    .line 553
    :goto_c
    :try_start_f
    invoke-virtual {v1}, Lio/sentry/util/a;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 554
    .line 555
    .line 556
    goto :goto_d

    .line 557
    :catchall_7
    move-exception p1

    .line 558
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 559
    .line 560
    .line 561
    :goto_d
    throw p0
.end method

.method public static d(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 6
    .line 7
    invoke-virtual {p0}, Lio/sentry/m6;->getDsn()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "Initializing SDK with DSN: \'%s\'"

    .line 16
    .line 17
    invoke-interface {v0, v1, v3, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lio/sentry/m6;->getOutboxPath()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    new-instance v0, Ljava/io/File;

    .line 28
    .line 29
    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const-string v2, "No outbox dir path is defined in options."

    .line 37
    .line 38
    new-array v4, v3, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-interface {v0, v1, v2, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-virtual {p0}, Lio/sentry/m6;->getCacheDirPath()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    new-instance v1, Ljava/io/File;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lio/sentry/m6;->getEnvelopeDiskCache()Lio/sentry/cache/d;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    instance-of v0, v0, Lio/sentry/transport/i;

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    sget-object v0, Lio/sentry/cache/c;->w:Ljava/nio/charset/Charset;

    .line 66
    .line 67
    invoke-virtual {p0}, Lio/sentry/m6;->getCacheDirPath()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p0}, Lio/sentry/m6;->getMaxCacheItems()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v0, :cond_1

    .line 76
    .line 77
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget-object v1, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 82
    .line 83
    const-string v2, "cacheDirPath is null, returning NoOpEnvelopeCache"

    .line 84
    .line 85
    new-array v4, v3, [Ljava/lang/Object;

    .line 86
    .line 87
    invoke-interface {v0, v1, v2, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    sget-object v0, Lio/sentry/transport/i;->a:Lio/sentry/transport/i;

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    new-instance v2, Lio/sentry/cache/c;

    .line 94
    .line 95
    invoke-direct {v2, p0, v0, v1}, Lio/sentry/cache/c;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Ljava/lang/String;I)V

    .line 96
    .line 97
    .line 98
    move-object v0, v2

    .line 99
    :goto_1
    invoke-virtual {p0, v0}, Lio/sentry/m6;->setEnvelopeDiskCache(Lio/sentry/cache/d;)V

    .line 100
    .line 101
    .line 102
    :cond_2
    invoke-virtual {p0}, Lio/sentry/m6;->getProfilingTracesDirPath()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {p0}, Lio/sentry/m6;->isProfilingEnabled()Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-nez v1, :cond_3

    .line 111
    .line 112
    invoke-virtual {p0}, Lio/sentry/m6;->isContinuousProfilingEnabled()Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_4

    .line 117
    .line 118
    :cond_3
    if-eqz v0, :cond_4

    .line 119
    .line 120
    new-instance v1, Ljava/io/File;

    .line 121
    .line 122
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 126
    .line 127
    .line 128
    :try_start_0
    invoke-virtual {p0}, Lio/sentry/m6;->getExecutorService()Lio/sentry/g1;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    new-instance v2, Lf72;

    .line 133
    .line 134
    const/16 v4, 0xf

    .line 135
    .line 136
    invoke-direct {v2, v1, v4}, Lf72;-><init>(Ljava/lang/Object;I)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v0, v2}, Lio/sentry/g1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :catch_0
    move-exception v0

    .line 144
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    sget-object v2, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 149
    .line 150
    const-string v4, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?"

    .line 151
    .line 152
    invoke-interface {v1, v2, v4, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    :cond_4
    :goto_2
    invoke-virtual {p0}, Lio/sentry/m6;->getModulesLoader()Lio/sentry/internal/modules/a;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {p0}, Lio/sentry/m6;->isSendModules()Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-nez v1, :cond_5

    .line 164
    .line 165
    sget-object v0, Lio/sentry/internal/modules/e;->a:Lio/sentry/internal/modules/e;

    .line 166
    .line 167
    invoke-virtual {p0, v0}, Lio/sentry/m6;->setModulesLoader(Lio/sentry/internal/modules/a;)V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_5
    instance-of v0, v0, Lio/sentry/internal/modules/e;

    .line 172
    .line 173
    if-eqz v0, :cond_6

    .line 174
    .line 175
    new-instance v0, Lio/sentry/internal/modules/f;

    .line 176
    .line 177
    new-instance v1, Lio/sentry/internal/modules/c;

    .line 178
    .line 179
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-direct {v1, v2}, Lio/sentry/internal/modules/c;-><init>(Lio/sentry/ILogger;)V

    .line 184
    .line 185
    .line 186
    new-instance v2, Lio/sentry/internal/modules/f;

    .line 187
    .line 188
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-direct {v2, v4}, Lio/sentry/internal/modules/f;-><init>(Lio/sentry/ILogger;)V

    .line 193
    .line 194
    .line 195
    const/4 v4, 0x2

    .line 196
    new-array v4, v4, [Lio/sentry/internal/modules/a;

    .line 197
    .line 198
    aput-object v1, v4, v3

    .line 199
    .line 200
    const/4 v1, 0x1

    .line 201
    aput-object v2, v4, v1

    .line 202
    .line 203
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-direct {v0, v1, v2}, Lio/sentry/internal/modules/f;-><init>(Ljava/util/List;Lio/sentry/ILogger;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0, v0}, Lio/sentry/m6;->setModulesLoader(Lio/sentry/internal/modules/a;)V

    .line 215
    .line 216
    .line 217
    :cond_6
    :goto_3
    invoke-virtual {p0}, Lio/sentry/m6;->getDebugMetaLoader()Lio/sentry/internal/debugmeta/a;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    instance-of v0, v0, Lio/sentry/internal/debugmeta/b;

    .line 222
    .line 223
    if-eqz v0, :cond_7

    .line 224
    .line 225
    new-instance v0, Lio/sentry/internal/debugmeta/c;

    .line 226
    .line 227
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-direct {v0, v1}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/ILogger;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0, v0}, Lio/sentry/m6;->setDebugMetaLoader(Lio/sentry/internal/debugmeta/a;)V

    .line 235
    .line 236
    .line 237
    :cond_7
    invoke-virtual {p0}, Lio/sentry/m6;->getDebugMetaLoader()Lio/sentry/internal/debugmeta/a;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-interface {v0}, Lio/sentry/internal/debugmeta/a;->f()Ljava/util/List;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    if-eqz v0, :cond_17

    .line 246
    .line 247
    invoke-virtual {p0}, Lio/sentry/m6;->getBundleIds()Ljava/util/Set;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    const/4 v2, -0x1

    .line 256
    const-string v4, ","

    .line 257
    .line 258
    if-eqz v1, :cond_9

    .line 259
    .line 260
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    :cond_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    if-eqz v5, :cond_9

    .line 269
    .line 270
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    check-cast v5, Ljava/util/Properties;

    .line 275
    .line 276
    const-string v6, "io.sentry.bundle-ids"

    .line 277
    .line 278
    invoke-virtual {v5, v6}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    sget-object v7, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 287
    .line 288
    const-string v8, "Bundle IDs found: %s"

    .line 289
    .line 290
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    invoke-interface {v6, v7, v8, v9}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    if-eqz v5, :cond_8

    .line 298
    .line 299
    invoke-virtual {v5, v4, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    array-length v6, v5

    .line 304
    move v7, v3

    .line 305
    :goto_4
    if-ge v7, v6, :cond_8

    .line 306
    .line 307
    aget-object v8, v5, v7

    .line 308
    .line 309
    invoke-virtual {p0, v8}, Lio/sentry/m6;->addBundleId(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    add-int/lit8 v7, v7, 0x1

    .line 313
    .line 314
    goto :goto_4

    .line 315
    :cond_9
    invoke-virtual {p0}, Lio/sentry/m6;->getProguardUuid()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    if-nez v1, :cond_b

    .line 320
    .line 321
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    :cond_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    if-eqz v5, :cond_b

    .line 330
    .line 331
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v5

    .line 335
    check-cast v5, Ljava/util/Properties;

    .line 336
    .line 337
    const-string v6, "io.sentry.ProguardUuids"

    .line 338
    .line 339
    invoke-virtual {v5, v6}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    if-eqz v5, :cond_a

    .line 344
    .line 345
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    sget-object v6, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 350
    .line 351
    const-string v7, "Proguard UUID found: %s"

    .line 352
    .line 353
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v8

    .line 357
    invoke-interface {v1, v6, v7, v8}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {p0, v5}, Lio/sentry/m6;->setProguardUuid(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    :cond_b
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    :cond_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 368
    .line 369
    .line 370
    move-result v5

    .line 371
    if-eqz v5, :cond_e

    .line 372
    .line 373
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v5

    .line 377
    check-cast v5, Ljava/util/Properties;

    .line 378
    .line 379
    const-string v6, "io.sentry.build-tool"

    .line 380
    .line 381
    invoke-virtual {v5, v6}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v6

    .line 385
    if-eqz v6, :cond_c

    .line 386
    .line 387
    const-string v1, "io.sentry.build-tool-version"

    .line 388
    .line 389
    invoke-virtual {v5, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    if-nez v1, :cond_d

    .line 394
    .line 395
    const-string v1, "unknown"

    .line 396
    .line 397
    :cond_d
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 398
    .line 399
    .line 400
    move-result-object v5

    .line 401
    sget-object v7, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 402
    .line 403
    const-string v8, "Build tool found: %s, version %s"

    .line 404
    .line 405
    filled-new-array {v6, v1}, [Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v9

    .line 409
    invoke-interface {v5, v7, v8, v9}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    invoke-static {}, Lio/sentry/k5;->d()Lio/sentry/k5;

    .line 413
    .line 414
    .line 415
    move-result-object v5

    .line 416
    invoke-virtual {v5, v6, v1}, Lio/sentry/k5;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    :cond_e
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    :cond_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 424
    .line 425
    .line 426
    move-result v1

    .line 427
    if-eqz v1, :cond_17

    .line 428
    .line 429
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    check-cast v1, Ljava/util/Properties;

    .line 434
    .line 435
    const-string v5, "io.sentry.distribution.org-slug"

    .line 436
    .line 437
    invoke-virtual {v1, v5}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v5

    .line 441
    const-string v6, "io.sentry.distribution.project-slug"

    .line 442
    .line 443
    invoke-virtual {v1, v6}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v6

    .line 447
    const-string v7, "io.sentry.distribution.auth-token"

    .line 448
    .line 449
    invoke-virtual {v1, v7}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v7

    .line 453
    const-string v8, "io.sentry.distribution.build-configuration"

    .line 454
    .line 455
    invoke-virtual {v1, v8}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v8

    .line 459
    const-string v9, "io.sentry.distribution.install-groups-override"

    .line 460
    .line 461
    invoke-virtual {v1, v9}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    if-nez v5, :cond_10

    .line 466
    .line 467
    if-nez v6, :cond_10

    .line 468
    .line 469
    if-nez v7, :cond_10

    .line 470
    .line 471
    if-nez v8, :cond_10

    .line 472
    .line 473
    if-eqz v1, :cond_f

    .line 474
    .line 475
    :cond_10
    invoke-virtual {p0}, Lio/sentry/m6;->getDistribution()Lio/sentry/d6;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    if-eqz v5, :cond_11

    .line 480
    .line 481
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 482
    .line 483
    .line 484
    move-result v9

    .line 485
    if-nez v9, :cond_11

    .line 486
    .line 487
    iget-object v9, v0, Lio/sentry/d6;->b:Ljava/lang/String;

    .line 488
    .line 489
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 490
    .line 491
    .line 492
    move-result v9

    .line 493
    if-eqz v9, :cond_11

    .line 494
    .line 495
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 496
    .line 497
    .line 498
    move-result-object v9

    .line 499
    sget-object v10, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 500
    .line 501
    const-string v11, "Distribution org slug found: %s"

    .line 502
    .line 503
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v12

    .line 507
    invoke-interface {v9, v10, v11, v12}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    iput-object v5, v0, Lio/sentry/d6;->b:Ljava/lang/String;

    .line 511
    .line 512
    :cond_11
    if-eqz v6, :cond_12

    .line 513
    .line 514
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 515
    .line 516
    .line 517
    move-result v5

    .line 518
    if-nez v5, :cond_12

    .line 519
    .line 520
    iget-object v5, v0, Lio/sentry/d6;->c:Ljava/lang/String;

    .line 521
    .line 522
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 523
    .line 524
    .line 525
    move-result v5

    .line 526
    if-eqz v5, :cond_12

    .line 527
    .line 528
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 529
    .line 530
    .line 531
    move-result-object v5

    .line 532
    sget-object v9, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 533
    .line 534
    const-string v10, "Distribution project slug found: %s"

    .line 535
    .line 536
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v11

    .line 540
    invoke-interface {v5, v9, v10, v11}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    iput-object v6, v0, Lio/sentry/d6;->c:Ljava/lang/String;

    .line 544
    .line 545
    :cond_12
    if-eqz v7, :cond_13

    .line 546
    .line 547
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 548
    .line 549
    .line 550
    move-result v5

    .line 551
    if-nez v5, :cond_13

    .line 552
    .line 553
    iget-object v5, v0, Lio/sentry/d6;->a:Ljava/lang/String;

    .line 554
    .line 555
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 556
    .line 557
    .line 558
    move-result v5

    .line 559
    if-eqz v5, :cond_13

    .line 560
    .line 561
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 562
    .line 563
    .line 564
    move-result-object v5

    .line 565
    sget-object v6, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 566
    .line 567
    const-string v9, "Distribution org auth token found"

    .line 568
    .line 569
    new-array v10, v3, [Ljava/lang/Object;

    .line 570
    .line 571
    invoke-interface {v5, v6, v9, v10}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    iput-object v7, v0, Lio/sentry/d6;->a:Ljava/lang/String;

    .line 575
    .line 576
    :cond_13
    if-eqz v8, :cond_14

    .line 577
    .line 578
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    .line 579
    .line 580
    .line 581
    move-result v5

    .line 582
    if-nez v5, :cond_14

    .line 583
    .line 584
    iget-object v5, v0, Lio/sentry/d6;->d:Ljava/lang/String;

    .line 585
    .line 586
    if-nez v5, :cond_14

    .line 587
    .line 588
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 589
    .line 590
    .line 591
    move-result-object v5

    .line 592
    sget-object v6, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 593
    .line 594
    const-string v7, "Distribution build configuration found: %s"

    .line 595
    .line 596
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v9

    .line 600
    invoke-interface {v5, v6, v7, v9}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    iput-object v8, v0, Lio/sentry/d6;->d:Ljava/lang/String;

    .line 604
    .line 605
    :cond_14
    if-eqz v1, :cond_17

    .line 606
    .line 607
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 608
    .line 609
    .line 610
    move-result v5

    .line 611
    if-nez v5, :cond_17

    .line 612
    .line 613
    iget-object v5, v0, Lio/sentry/d6;->e:Ljava/util/ArrayList;

    .line 614
    .line 615
    if-nez v5, :cond_17

    .line 616
    .line 617
    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v1

    .line 621
    new-instance v2, Ljava/util/ArrayList;

    .line 622
    .line 623
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 624
    .line 625
    .line 626
    array-length v4, v1

    .line 627
    move v5, v3

    .line 628
    :goto_5
    if-ge v5, v4, :cond_16

    .line 629
    .line 630
    aget-object v6, v1, v5

    .line 631
    .line 632
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v6

    .line 636
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 637
    .line 638
    .line 639
    move-result v7

    .line 640
    if-nez v7, :cond_15

    .line 641
    .line 642
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 643
    .line 644
    .line 645
    :cond_15
    add-int/lit8 v5, v5, 0x1

    .line 646
    .line 647
    goto :goto_5

    .line 648
    :cond_16
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 649
    .line 650
    .line 651
    move-result v1

    .line 652
    if-nez v1, :cond_17

    .line 653
    .line 654
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 655
    .line 656
    .line 657
    move-result-object v1

    .line 658
    sget-object v4, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 659
    .line 660
    const-string v5, "Distribution install groups override found: %s"

    .line 661
    .line 662
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v6

    .line 666
    invoke-interface {v1, v4, v5, v6}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 667
    .line 668
    .line 669
    iput-object v2, v0, Lio/sentry/d6;->e:Ljava/util/ArrayList;

    .line 670
    .line 671
    :cond_17
    invoke-virtual {p0}, Lio/sentry/m6;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    instance-of v0, v0, Lio/sentry/util/thread/b;

    .line 676
    .line 677
    if-eqz v0, :cond_18

    .line 678
    .line 679
    sget-object v0, Lio/sentry/util/thread/c;->b:Lio/sentry/util/thread/c;

    .line 680
    .line 681
    invoke-virtual {p0, v0}, Lio/sentry/m6;->setThreadChecker(Lio/sentry/util/thread/a;)V

    .line 682
    .line 683
    .line 684
    :cond_18
    invoke-virtual {p0}, Lio/sentry/m6;->getPerformanceCollectors()Ljava/util/List;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 689
    .line 690
    .line 691
    move-result v0

    .line 692
    if-eqz v0, :cond_19

    .line 693
    .line 694
    new-instance v0, Lio/sentry/t1;

    .line 695
    .line 696
    invoke-direct {v0}, Lio/sentry/t1;-><init>()V

    .line 697
    .line 698
    .line 699
    invoke-virtual {p0, v0}, Lio/sentry/m6;->addPerformanceCollector(Lio/sentry/x0;)V

    .line 700
    .line 701
    .line 702
    :cond_19
    invoke-virtual {p0}, Lio/sentry/m6;->isEnableBackpressureHandling()Z

    .line 703
    .line 704
    .line 705
    move-result v0

    .line 706
    if-eqz v0, :cond_1b

    .line 707
    .line 708
    sget-boolean v0, Lio/sentry/util/k;->a:Z

    .line 709
    .line 710
    if-nez v0, :cond_1b

    .line 711
    .line 712
    invoke-virtual {p0}, Lio/sentry/m6;->getBackpressureMonitor()Lio/sentry/backpressure/b;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    instance-of v0, v0, Lio/sentry/backpressure/c;

    .line 717
    .line 718
    if-eqz v0, :cond_1a

    .line 719
    .line 720
    new-instance v0, Lio/sentry/backpressure/a;

    .line 721
    .line 722
    invoke-direct {v0, p0}, Lio/sentry/backpressure/a;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {p0, v0}, Lio/sentry/m6;->setBackpressureMonitor(Lio/sentry/backpressure/b;)V

    .line 726
    .line 727
    .line 728
    :cond_1a
    invoke-virtual {p0}, Lio/sentry/m6;->getBackpressureMonitor()Lio/sentry/backpressure/b;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    invoke-interface {v0}, Lio/sentry/backpressure/b;->start()V

    .line 733
    .line 734
    .line 735
    :cond_1b
    sget-boolean v0, Lio/sentry/util/k;->a:Z

    .line 736
    .line 737
    const/4 v1, 0x0

    .line 738
    if-nez v0, :cond_21

    .line 739
    .line 740
    invoke-virtual {p0}, Lio/sentry/m6;->isContinuousProfilingEnabled()Z

    .line 741
    .line 742
    .line 743
    move-result v0

    .line 744
    if-eqz v0, :cond_21

    .line 745
    .line 746
    invoke-virtual {p0}, Lio/sentry/m6;->getContinuousProfiler()Lio/sentry/r0;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    instance-of v0, v0, Lio/sentry/o2;

    .line 751
    .line 752
    if-eqz v0, :cond_21

    .line 753
    .line 754
    :try_start_1
    invoke-virtual {p0}, Lio/sentry/m6;->getProfilingTracesDirPath()Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    if-eqz v0, :cond_1c

    .line 759
    .line 760
    goto :goto_7

    .line 761
    :cond_1c
    new-instance v0, Ljava/io/File;

    .line 762
    .line 763
    const-string v2, "java.io.tmpdir"

    .line 764
    .line 765
    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    const-string v4, "sentry_profiling_traces"

    .line 770
    .line 771
    invoke-direct {v0, v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 775
    .line 776
    .line 777
    move-result v2

    .line 778
    if-nez v2, :cond_1e

    .line 779
    .line 780
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 781
    .line 782
    .line 783
    move-result v2

    .line 784
    if-eqz v2, :cond_1d

    .line 785
    .line 786
    goto :goto_6

    .line 787
    :cond_1d
    const-string v2, "Creating a fallback directory for profiling failed in "

    .line 788
    .line 789
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    invoke-static {v0, v2}, Ln4;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 794
    .line 795
    .line 796
    goto :goto_7

    .line 797
    :cond_1e
    :goto_6
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    invoke-virtual {p0, v0}, Lio/sentry/m6;->setProfilingTracesDirPath(Ljava/lang/String;)V

    .line 802
    .line 803
    .line 804
    :goto_7
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    invoke-virtual {p0}, Lio/sentry/m6;->getProfilingTracesHz()I

    .line 809
    .line 810
    .line 811
    invoke-virtual {p0}, Lio/sentry/m6;->getExecutorService()Lio/sentry/g1;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 812
    .line 813
    .line 814
    :try_start_2
    const-class v2, Lio/sentry/profiling/a;

    .line 815
    .line 816
    invoke-static {v2}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;)Ljava/util/ServiceLoader;

    .line 817
    .line 818
    .line 819
    move-result-object v2

    .line 820
    invoke-virtual {v2}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    .line 821
    .line 822
    .line 823
    move-result-object v2

    .line 824
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 825
    .line 826
    .line 827
    move-result v4

    .line 828
    if-eqz v4, :cond_1f

    .line 829
    .line 830
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v2

    .line 834
    goto :goto_8

    .line 835
    :cond_1f
    move-object v2, v1

    .line 836
    :goto_8
    if-nez v2, :cond_20

    .line 837
    .line 838
    sget-object v2, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 839
    .line 840
    const-string v4, "No continuous profiler provider found, using NoOpContinuousProfiler"

    .line 841
    .line 842
    new-array v5, v3, [Ljava/lang/Object;

    .line 843
    .line 844
    invoke-interface {v0, v2, v4, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 845
    .line 846
    .line 847
    goto :goto_a

    .line 848
    :catchall_0
    move-exception v2

    .line 849
    goto :goto_9

    .line 850
    :cond_20
    new-instance v2, Ljava/lang/ClassCastException;

    .line 851
    .line 852
    invoke-direct {v2}, Ljava/lang/ClassCastException;-><init>()V

    .line 853
    .line 854
    .line 855
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 856
    :goto_9
    :try_start_3
    sget-object v4, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 857
    .line 858
    const-string v5, "Failed to load continuous profiler provider, using NoOpContinuousProfiler"

    .line 859
    .line 860
    invoke-interface {v0, v4, v5, v2}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 861
    .line 862
    .line 863
    :goto_a
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 864
    .line 865
    .line 866
    move-result-object v0

    .line 867
    sget-object v2, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 868
    .line 869
    const-string v4, "Could not load profiler, profiling will be disabled. If you are using Spring or Spring Boot with the OTEL Agent profiler init will be retried."

    .line 870
    .line 871
    new-array v5, v3, [Ljava/lang/Object;

    .line 872
    .line 873
    invoke-interface {v0, v2, v4, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 874
    .line 875
    .line 876
    goto :goto_b

    .line 877
    :catch_1
    move-exception v0

    .line 878
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 879
    .line 880
    .line 881
    move-result-object v2

    .line 882
    sget-object v4, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 883
    .line 884
    const-string v5, "Failed to create default profiling traces directory"

    .line 885
    .line 886
    invoke-interface {v2, v4, v5, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 887
    .line 888
    .line 889
    :goto_b
    invoke-virtual {p0}, Lio/sentry/m6;->getContinuousProfiler()Lio/sentry/r0;

    .line 890
    .line 891
    .line 892
    goto :goto_c

    .line 893
    :cond_21
    invoke-virtual {p0}, Lio/sentry/m6;->getContinuousProfiler()Lio/sentry/r0;

    .line 894
    .line 895
    .line 896
    :goto_c
    sget-boolean v0, Lio/sentry/util/k;->a:Z

    .line 897
    .line 898
    if-nez v0, :cond_24

    .line 899
    .line 900
    invoke-virtual {p0}, Lio/sentry/m6;->isContinuousProfilingEnabled()Z

    .line 901
    .line 902
    .line 903
    move-result v0

    .line 904
    if-eqz v0, :cond_24

    .line 905
    .line 906
    invoke-virtual {p0}, Lio/sentry/m6;->getProfilerConverter()Lio/sentry/z0;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    instance-of v0, v0, Lio/sentry/s2;

    .line 911
    .line 912
    if-eqz v0, :cond_24

    .line 913
    .line 914
    sget-object v0, Lio/sentry/m4;->c:Lio/sentry/b4;

    .line 915
    .line 916
    iget-object v0, v0, Lio/sentry/b4;->l:Lio/sentry/m6;

    .line 917
    .line 918
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 919
    .line 920
    .line 921
    move-result-object v0

    .line 922
    :try_start_4
    const-class v2, Lio/sentry/profiling/b;

    .line 923
    .line 924
    invoke-static {v2}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;)Ljava/util/ServiceLoader;

    .line 925
    .line 926
    .line 927
    move-result-object v2

    .line 928
    invoke-virtual {v2}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    .line 929
    .line 930
    .line 931
    move-result-object v2

    .line 932
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 933
    .line 934
    .line 935
    move-result v4

    .line 936
    if-eqz v4, :cond_22

    .line 937
    .line 938
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    move-result-object v1

    .line 942
    :cond_22
    if-nez v1, :cond_23

    .line 943
    .line 944
    sget-object v1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 945
    .line 946
    const-string v2, "No profile converter provider found, using NoOpProfileConverter"

    .line 947
    .line 948
    new-array v4, v3, [Ljava/lang/Object;

    .line 949
    .line 950
    invoke-interface {v0, v1, v2, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 951
    .line 952
    .line 953
    goto :goto_e

    .line 954
    :catchall_1
    move-exception v1

    .line 955
    goto :goto_d

    .line 956
    :cond_23
    new-instance v1, Ljava/lang/ClassCastException;

    .line 957
    .line 958
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 959
    .line 960
    .line 961
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 962
    :goto_d
    sget-object v2, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 963
    .line 964
    const-string v4, "Failed to load profile converter provider, using NoOpProfileConverter"

    .line 965
    .line 966
    invoke-interface {v0, v2, v4, v1}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 967
    .line 968
    .line 969
    :goto_e
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 970
    .line 971
    .line 972
    move-result-object v0

    .line 973
    sget-object v1, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 974
    .line 975
    const-string v2, "Could not load profile converter. If you are using Spring or Spring Boot with the OTEL Agent, profile converter init will be retried."

    .line 976
    .line 977
    new-array v3, v3, [Ljava/lang/Object;

    .line 978
    .line 979
    invoke-interface {v0, v1, v2, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 980
    .line 981
    .line 982
    invoke-virtual {p0}, Lio/sentry/m6;->getProfilerConverter()Lio/sentry/z0;

    .line 983
    .line 984
    .line 985
    goto :goto_f

    .line 986
    :cond_24
    invoke-virtual {p0}, Lio/sentry/m6;->getProfilerConverter()Lio/sentry/z0;

    .line 987
    .line 988
    .line 989
    :goto_f
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 990
    .line 991
    .line 992
    move-result-object v0

    .line 993
    sget-object v1, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 994
    .line 995
    invoke-virtual {p0}, Lio/sentry/m6;->isContinuousProfilingEnabled()Z

    .line 996
    .line 997
    .line 998
    move-result v2

    .line 999
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v2

    .line 1003
    invoke-virtual {p0}, Lio/sentry/m6;->getProfileLifecycle()Lio/sentry/q3;

    .line 1004
    .line 1005
    .line 1006
    move-result-object p0

    .line 1007
    filled-new-array {v2, p0}, [Ljava/lang/Object;

    .line 1008
    .line 1009
    .line 1010
    move-result-object p0

    .line 1011
    const-string v2, "Continuous profiler is enabled %s mode: %s"

    .line 1012
    .line 1013
    invoke-interface {v0, v1, v2, p0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1014
    .line 1015
    .line 1016
    return-void
.end method

.method public static e(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 6

    .line 1
    sget-object v0, Lio/sentry/r2;->a:Lio/sentry/r2;

    .line 2
    .line 3
    sget-boolean v1, Lio/sentry/util/k;->a:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lio/sentry/m6;->getOpenTelemetryMode()Lio/sentry/v5;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    sget-object v3, Lio/sentry/v5;->AUTO:Lio/sentry/v5;

    .line 13
    .line 14
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_3

    .line 19
    .line 20
    const-string v2, "io.sentry.opentelemetry.agent.AgentMarker"

    .line 21
    .line 22
    invoke-static {v2, v0}, Lio/sentry/util/h;->d(Ljava/lang/String;Lio/sentry/ILogger;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x0

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    sget-object v4, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 34
    .line 35
    const-string v5, "openTelemetryMode has been inferred from AUTO to AGENT"

    .line 36
    .line 37
    new-array v3, v3, [Ljava/lang/Object;

    .line 38
    .line 39
    invoke-interface {v2, v4, v5, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sget-object v2, Lio/sentry/v5;->AGENT:Lio/sentry/v5;

    .line 43
    .line 44
    invoke-virtual {p0, v2}, Lio/sentry/m6;->setOpenTelemetryMode(Lio/sentry/v5;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const-string v2, "io.sentry.opentelemetry.agent.AgentlessMarker"

    .line 49
    .line 50
    invoke-static {v2, v0}, Lio/sentry/util/h;->d(Ljava/lang/String;Lio/sentry/ILogger;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    sget-object v4, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 61
    .line 62
    const-string v5, "openTelemetryMode has been inferred from AUTO to AGENTLESS"

    .line 63
    .line 64
    new-array v3, v3, [Ljava/lang/Object;

    .line 65
    .line 66
    invoke-interface {v2, v4, v5, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    sget-object v2, Lio/sentry/v5;->AGENTLESS:Lio/sentry/v5;

    .line 70
    .line 71
    invoke-virtual {p0, v2}, Lio/sentry/m6;->setOpenTelemetryMode(Lio/sentry/v5;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    const-string v2, "io.sentry.opentelemetry.agent.AgentlessSpringMarker"

    .line 76
    .line 77
    invoke-static {v2, v0}, Lio/sentry/util/h;->d(Ljava/lang/String;Lio/sentry/ILogger;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_3

    .line 82
    .line 83
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    sget-object v4, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 88
    .line 89
    const-string v5, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING"

    .line 90
    .line 91
    new-array v3, v3, [Ljava/lang/Object;

    .line 92
    .line 93
    invoke-interface {v2, v4, v5, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    sget-object v2, Lio/sentry/v5;->AGENTLESS_SPRING:Lio/sentry/v5;

    .line 97
    .line 98
    invoke-virtual {p0, v2}, Lio/sentry/m6;->setOpenTelemetryMode(Lio/sentry/v5;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    :goto_0
    sget-object v2, Lio/sentry/v5;->OFF:Lio/sentry/v5;

    .line 102
    .line 103
    invoke-virtual {p0}, Lio/sentry/m6;->getOpenTelemetryMode()Lio/sentry/v5;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    const/4 v4, 0x1

    .line 108
    if-ne v2, v3, :cond_4

    .line 109
    .line 110
    new-instance v3, Lio/sentry/e3;

    .line 111
    .line 112
    invoke-direct {v3, v4}, Lio/sentry/e3;-><init>(I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v3}, Lio/sentry/m6;->setSpanFactory(Lio/sentry/l1;)V

    .line 116
    .line 117
    .line 118
    :cond_4
    sget-object v3, Lio/sentry/m4;->a:Lio/sentry/d1;

    .line 119
    .line 120
    invoke-interface {v3}, Lio/sentry/d1;->close()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, Lio/sentry/m6;->getScopesStorageFactory()Lio/sentry/e1;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Lio/sentry/m6;->getOpenTelemetryMode()Lio/sentry/v5;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    if-ne v2, v3, :cond_5

    .line 131
    .line 132
    new-instance v0, Lio/sentry/s;

    .line 133
    .line 134
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 135
    .line 136
    .line 137
    sput-object v0, Lio/sentry/m4;->a:Lio/sentry/d1;

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_5
    if-nez v1, :cond_6

    .line 141
    .line 142
    const-string v1, "io.sentry.opentelemetry.OtelContextScopesStorage"

    .line 143
    .line 144
    invoke-static {v1, v0}, Lio/sentry/util/h;->d(Ljava/lang/String;Lio/sentry/ILogger;)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_6

    .line 149
    .line 150
    invoke-static {v0, v1, v4}, Lio/sentry/util/h;->f(Lio/sentry/ILogger;Ljava/lang/String;Z)Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    if-eqz v0, :cond_6

    .line 155
    .line 156
    const/4 v1, 0x0

    .line 157
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    instance-of v1, v0, Lio/sentry/d1;

    .line 166
    .line 167
    if-eqz v1, :cond_6

    .line 168
    .line 169
    check-cast v0, Lio/sentry/d1;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :catch_0
    :cond_6
    new-instance v0, Lio/sentry/s;

    .line 173
    .line 174
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 175
    .line 176
    .line 177
    :goto_1
    sput-object v0, Lio/sentry/m4;->a:Lio/sentry/d1;

    .line 178
    .line 179
    :goto_2
    sget-boolean v0, Lio/sentry/util/k;->a:Z

    .line 180
    .line 181
    if-nez v0, :cond_b

    .line 182
    .line 183
    invoke-virtual {p0}, Lio/sentry/m6;->getOpenTelemetryMode()Lio/sentry/v5;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    sget-object v1, Lio/sentry/v5;->OFF:Lio/sentry/v5;

    .line 188
    .line 189
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-eqz v1, :cond_7

    .line 194
    .line 195
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 196
    .line 197
    goto/16 :goto_3

    .line 198
    .line 199
    :cond_7
    sget-object v1, Lio/sentry/util/n;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 200
    .line 201
    new-instance v1, Ljava/util/ArrayList;

    .line 202
    .line 203
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 204
    .line 205
    .line 206
    sget-object v2, Lio/sentry/v5;->AGENT:Lio/sentry/v5;

    .line 207
    .line 208
    if-eq v2, v0, :cond_8

    .line 209
    .line 210
    sget-object v3, Lio/sentry/v5;->AGENTLESS_SPRING:Lio/sentry/v5;

    .line 211
    .line 212
    if-ne v3, v0, :cond_9

    .line 213
    .line 214
    :cond_8
    const-string v3, "auto.http.spring_jakarta.webmvc"

    .line 215
    .line 216
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    const-string v3, "auto.http.spring.webmvc"

    .line 220
    .line 221
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    const-string v3, "auto.http.spring7.webmvc"

    .line 225
    .line 226
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    const-string v3, "auto.spring_jakarta.webflux"

    .line 230
    .line 231
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    const-string v3, "auto.spring.webflux"

    .line 235
    .line 236
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    const-string v3, "auto.spring7.webflux"

    .line 240
    .line 241
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    const-string v3, "auto.db.jdbc"

    .line 245
    .line 246
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    const-string v3, "auto.http.spring_jakarta.webclient"

    .line 250
    .line 251
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    const-string v3, "auto.http.spring.webclient"

    .line 255
    .line 256
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    const-string v3, "auto.http.spring7.webclient"

    .line 260
    .line 261
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    const-string v3, "auto.http.spring_jakarta.restclient"

    .line 265
    .line 266
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    const-string v3, "auto.http.spring.restclient"

    .line 270
    .line 271
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    const-string v3, "auto.http.spring7.restclient"

    .line 275
    .line 276
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    const-string v3, "auto.http.spring_jakarta.resttemplate"

    .line 280
    .line 281
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    const-string v3, "auto.http.spring.resttemplate"

    .line 285
    .line 286
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    const-string v3, "auto.http.spring7.resttemplate"

    .line 290
    .line 291
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    const-string v3, "auto.http.openfeign"

    .line 295
    .line 296
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    const-string v3, "auto.http.ktor-client"

    .line 300
    .line 301
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    const-string v3, "auto.queue.spring_jakarta.kafka.producer"

    .line 305
    .line 306
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    const-string v3, "auto.queue.spring_jakarta.kafka.consumer"

    .line 310
    .line 311
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    const-string v3, "auto.queue.kafka.producer"

    .line 315
    .line 316
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    const-string v3, "auto.queue.kafka.consumer"

    .line 320
    .line 321
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    :cond_9
    if-ne v2, v0, :cond_a

    .line 325
    .line 326
    const-string v0, "auto.graphql.graphql"

    .line 327
    .line 328
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    const-string v0, "auto.graphql.graphql22"

    .line 332
    .line 333
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    :cond_a
    move-object v0, v1

    .line 337
    :goto_3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    if-eqz v1, :cond_b

    .line 346
    .line 347
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    check-cast v1, Ljava/lang/String;

    .line 352
    .line 353
    invoke-virtual {p0, v1}, Lio/sentry/m6;->addIgnoredSpanOrigin(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    goto :goto_4

    .line 357
    :cond_b
    return-void
.end method

.method public static f()Z
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lio/sentry/c1;->isEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public static g(Lio/sentry/android/core/SentryAndroidOptions;)Z
    .locals 11

    .line 1
    invoke-virtual {p0}, Lio/sentry/m6;->isEnableExternalConfiguration()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_1f

    .line 8
    .line 9
    const-string v0, "sentry.properties"

    .line 10
    .line 11
    new-instance v3, Lio/sentry/l2;

    .line 12
    .line 13
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v4, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v5, Lio/sentry/config/e;

    .line 22
    .line 23
    const-string v6, "sentry."

    .line 24
    .line 25
    invoke-static {}, Ljava/lang/System;->getProperties()Ljava/util/Properties;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-direct {v5, v6, v7}, Lio/sentry/config/e;-><init>(Ljava/lang/String;Ljava/util/Properties;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    new-instance v5, Lio/sentry/config/c;

    .line 36
    .line 37
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    const-string v5, "sentry.properties.file"

    .line 44
    .line 45
    invoke-static {v5}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    if-eqz v5, :cond_0

    .line 50
    .line 51
    new-instance v6, Lk8;

    .line 52
    .line 53
    invoke-direct {v6, v5, v3, v2}, Lk8;-><init>(Ljava/lang/String;Lio/sentry/l2;Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v6}, Lk8;->j()Ljava/util/Properties;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    if-eqz v5, :cond_0

    .line 61
    .line 62
    new-instance v6, Lio/sentry/config/e;

    .line 63
    .line 64
    invoke-direct {v6, v5}, Lio/sentry/config/e;-><init>(Ljava/util/Properties;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    :cond_0
    const-string v5, "SENTRY_PROPERTIES_FILE"

    .line 71
    .line 72
    invoke-static {v5}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    if-eqz v5, :cond_1

    .line 77
    .line 78
    new-instance v6, Lk8;

    .line 79
    .line 80
    invoke-direct {v6, v5, v3, v2}, Lk8;-><init>(Ljava/lang/String;Lio/sentry/l2;Z)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6}, Lk8;->j()Ljava/util/Properties;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    if-eqz v5, :cond_1

    .line 88
    .line 89
    new-instance v6, Lio/sentry/config/e;

    .line 90
    .line 91
    invoke-direct {v6, v5}, Lio/sentry/config/e;-><init>(Ljava/util/Properties;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    :cond_1
    const-class v5, Lio/sentry/config/a;

    .line 98
    .line 99
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-static {v5}, Lio/sentry/util/c;->d(Ljava/lang/ClassLoader;)Ljava/lang/ClassLoader;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    const/4 v6, 0x0

    .line 108
    :try_start_0
    invoke-virtual {v5, v0}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 109
    .line 110
    .line 111
    move-result-object v5
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    if-eqz v5, :cond_2

    .line 113
    .line 114
    :try_start_1
    new-instance v7, Ljava/io/BufferedInputStream;

    .line 115
    .line 116
    invoke-direct {v7, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    .line 118
    .line 119
    :try_start_2
    new-instance v8, Ljava/util/Properties;

    .line 120
    .line 121
    invoke-direct {v8}, Ljava/util/Properties;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v8, v7}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 125
    .line 126
    .line 127
    :try_start_3
    invoke-virtual {v7}, Ljava/io/BufferedInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 128
    .line 129
    .line 130
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 131
    .line 132
    .line 133
    goto :goto_5

    .line 134
    :catch_0
    move-exception v5

    .line 135
    goto :goto_4

    .line 136
    :catchall_0
    move-exception v7

    .line 137
    goto :goto_1

    .line 138
    :catchall_1
    move-exception v8

    .line 139
    :try_start_5
    invoke-virtual {v7}, Ljava/io/BufferedInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :catchall_2
    move-exception v7

    .line 144
    :try_start_6
    invoke-virtual {v8, v7}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    :goto_0
    throw v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 148
    :goto_1
    :try_start_7
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :catchall_3
    move-exception v5

    .line 153
    :try_start_8
    invoke-virtual {v7, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    :goto_2
    throw v7

    .line 157
    :cond_2
    if-eqz v5, :cond_3

    .line 158
    .line 159
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    .line 160
    .line 161
    .line 162
    :cond_3
    :goto_3
    move-object v8, v6

    .line 163
    goto :goto_5

    .line 164
    :goto_4
    sget-object v7, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 165
    .line 166
    const-string v8, "Failed to load Sentry configuration from classpath resource: %s"

    .line 167
    .line 168
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v9

    .line 172
    invoke-virtual {v3, v7, v5, v8, v9}, Lio/sentry/l2;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :goto_5
    if-eqz v8, :cond_4

    .line 177
    .line 178
    new-instance v5, Lio/sentry/config/e;

    .line 179
    .line 180
    invoke-direct {v5, v8}, Lio/sentry/config/e;-><init>(Ljava/util/Properties;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    :cond_4
    new-instance v5, Lk8;

    .line 187
    .line 188
    invoke-direct {v5, v0, v3, v1}, Lk8;-><init>(Ljava/lang/String;Lio/sentry/l2;Z)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v5}, Lk8;->j()Ljava/util/Properties;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    if-eqz v0, :cond_5

    .line 196
    .line 197
    new-instance v3, Lio/sentry/config/e;

    .line 198
    .line 199
    invoke-direct {v3, v0}, Lio/sentry/config/e;-><init>(Ljava/util/Properties;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    :cond_5
    new-instance v0, Lio/sentry/config/b;

    .line 206
    .line 207
    invoke-direct {v0, v4}, Lio/sentry/config/b;-><init>(Ljava/util/ArrayList;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    new-instance v4, Lio/sentry/e0;

    .line 215
    .line 216
    invoke-direct {v4}, Lio/sentry/e0;-><init>()V

    .line 217
    .line 218
    .line 219
    const-string v5, "dsn"

    .line 220
    .line 221
    invoke-virtual {v0, v5}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    iput-object v5, v4, Lio/sentry/e0;->a:Ljava/lang/String;

    .line 226
    .line 227
    const-string v5, "environment"

    .line 228
    .line 229
    invoke-virtual {v0, v5}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    iput-object v5, v4, Lio/sentry/e0;->b:Ljava/lang/String;

    .line 234
    .line 235
    const-string v5, "release"

    .line 236
    .line 237
    invoke-virtual {v0, v5}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    iput-object v5, v4, Lio/sentry/e0;->c:Ljava/lang/String;

    .line 242
    .line 243
    const-string v5, "dist"

    .line 244
    .line 245
    invoke-virtual {v0, v5}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    iput-object v5, v4, Lio/sentry/e0;->d:Ljava/lang/String;

    .line 250
    .line 251
    const-string v5, "servername"

    .line 252
    .line 253
    invoke-virtual {v0, v5}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    iput-object v5, v4, Lio/sentry/e0;->e:Ljava/lang/String;

    .line 258
    .line 259
    const-string v5, "uncaught.handler.enabled"

    .line 260
    .line 261
    invoke-interface {v0, v5}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    iput-object v5, v4, Lio/sentry/e0;->f:Ljava/lang/Boolean;

    .line 266
    .line 267
    const-string v5, "uncaught.handler.print-stacktrace"

    .line 268
    .line 269
    invoke-interface {v0, v5}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    iput-object v5, v4, Lio/sentry/e0;->y:Ljava/lang/Boolean;

    .line 274
    .line 275
    const-string v5, "sample-rate"

    .line 276
    .line 277
    invoke-virtual {v0, v5}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    if-eqz v5, :cond_6

    .line 282
    .line 283
    :try_start_9
    invoke-static {v5}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    .line 284
    .line 285
    .line 286
    move-result-object v5
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_1

    .line 287
    goto :goto_6

    .line 288
    :catch_1
    :cond_6
    move-object v5, v6

    .line 289
    :goto_6
    iput-object v5, v4, Lio/sentry/e0;->i:Ljava/lang/Double;

    .line 290
    .line 291
    const-string v5, "traces-sample-rate"

    .line 292
    .line 293
    invoke-virtual {v0, v5}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    if-eqz v5, :cond_7

    .line 298
    .line 299
    :try_start_a
    invoke-static {v5}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    .line 300
    .line 301
    .line 302
    move-result-object v5
    :try_end_a
    .catch Ljava/lang/NumberFormatException; {:try_start_a .. :try_end_a} :catch_2

    .line 303
    goto :goto_7

    .line 304
    :catch_2
    :cond_7
    move-object v5, v6

    .line 305
    :goto_7
    iput-object v5, v4, Lio/sentry/e0;->j:Ljava/lang/Double;

    .line 306
    .line 307
    const-string v5, "profiles-sample-rate"

    .line 308
    .line 309
    invoke-virtual {v0, v5}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    if-eqz v5, :cond_8

    .line 314
    .line 315
    :try_start_b
    invoke-static {v5}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    .line 316
    .line 317
    .line 318
    move-result-object v5
    :try_end_b
    .catch Ljava/lang/NumberFormatException; {:try_start_b .. :try_end_b} :catch_3

    .line 319
    goto :goto_8

    .line 320
    :catch_3
    :cond_8
    move-object v5, v6

    .line 321
    :goto_8
    iput-object v5, v4, Lio/sentry/e0;->k:Ljava/lang/Double;

    .line 322
    .line 323
    const-string v5, "debug"

    .line 324
    .line 325
    invoke-interface {v0, v5}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    iput-object v5, v4, Lio/sentry/e0;->g:Ljava/lang/Boolean;

    .line 330
    .line 331
    const-string v5, "enable-deduplication"

    .line 332
    .line 333
    invoke-interface {v0, v5}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    iput-object v5, v4, Lio/sentry/e0;->h:Ljava/lang/Boolean;

    .line 338
    .line 339
    const-string v5, "send-client-reports"

    .line 340
    .line 341
    invoke-interface {v0, v5}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 342
    .line 343
    .line 344
    move-result-object v5

    .line 345
    iput-object v5, v4, Lio/sentry/e0;->z:Ljava/lang/Boolean;

    .line 346
    .line 347
    const-string v5, "force-init"

    .line 348
    .line 349
    invoke-interface {v0, v5}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 350
    .line 351
    .line 352
    move-result-object v5

    .line 353
    iput-object v5, v4, Lio/sentry/e0;->Q:Ljava/lang/Boolean;

    .line 354
    .line 355
    const-string v5, "max-request-body-size"

    .line 356
    .line 357
    invoke-virtual {v0, v5}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v5

    .line 361
    if-eqz v5, :cond_9

    .line 362
    .line 363
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 364
    .line 365
    invoke-virtual {v5, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v5

    .line 369
    invoke-static {v5}, Lio/sentry/k6;->valueOf(Ljava/lang/String;)Lio/sentry/k6;

    .line 370
    .line 371
    .line 372
    move-result-object v5

    .line 373
    iput-object v5, v4, Lio/sentry/e0;->l:Lio/sentry/k6;

    .line 374
    .line 375
    :cond_9
    invoke-virtual {v0}, Lio/sentry/config/b;->c()Ljava/util/Map;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    check-cast v5, Ljava/util/concurrent/ConcurrentHashMap;

    .line 380
    .line 381
    invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 386
    .line 387
    .line 388
    move-result-object v5

    .line 389
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 390
    .line 391
    .line 392
    move-result v7

    .line 393
    if-eqz v7, :cond_a

    .line 394
    .line 395
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v7

    .line 399
    check-cast v7, Ljava/util/Map$Entry;

    .line 400
    .line 401
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v8

    .line 405
    check-cast v8, Ljava/lang/String;

    .line 406
    .line 407
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v7

    .line 411
    check-cast v7, Ljava/lang/String;

    .line 412
    .line 413
    iget-object v9, v4, Lio/sentry/e0;->m:Ljava/util/concurrent/ConcurrentHashMap;

    .line 414
    .line 415
    invoke-virtual {v9, v8, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    goto :goto_9

    .line 419
    :cond_a
    const-string v5, "proxy.host"

    .line 420
    .line 421
    invoke-virtual {v0, v5}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v5

    .line 425
    const-string v7, "proxy.user"

    .line 426
    .line 427
    invoke-virtual {v0, v7}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v7

    .line 431
    const-string v8, "proxy.pass"

    .line 432
    .line 433
    invoke-virtual {v0, v8}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v8

    .line 437
    const-string v9, "proxy.port"

    .line 438
    .line 439
    invoke-virtual {v0, v9}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v9

    .line 443
    if-eqz v9, :cond_b

    .line 444
    .line 445
    goto :goto_a

    .line 446
    :cond_b
    const-string v9, "80"

    .line 447
    .line 448
    :goto_a
    if-eqz v5, :cond_c

    .line 449
    .line 450
    new-instance v10, Lio/sentry/j6;

    .line 451
    .line 452
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 453
    .line 454
    .line 455
    iput-object v5, v10, Lio/sentry/j6;->a:Ljava/lang/String;

    .line 456
    .line 457
    iput-object v9, v10, Lio/sentry/j6;->b:Ljava/lang/String;

    .line 458
    .line 459
    iput-object v7, v10, Lio/sentry/j6;->c:Ljava/lang/String;

    .line 460
    .line 461
    iput-object v8, v10, Lio/sentry/j6;->d:Ljava/lang/String;

    .line 462
    .line 463
    iput-object v10, v4, Lio/sentry/e0;->n:Lio/sentry/j6;

    .line 464
    .line 465
    :cond_c
    const-string v5, "in-app-includes"

    .line 466
    .line 467
    invoke-interface {v0, v5}, Lio/sentry/config/d;->d(Ljava/lang/String;)Ljava/util/List;

    .line 468
    .line 469
    .line 470
    move-result-object v5

    .line 471
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 472
    .line 473
    .line 474
    move-result-object v5

    .line 475
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 476
    .line 477
    .line 478
    move-result v7

    .line 479
    if-eqz v7, :cond_d

    .line 480
    .line 481
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v7

    .line 485
    check-cast v7, Ljava/lang/String;

    .line 486
    .line 487
    iget-object v8, v4, Lio/sentry/e0;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 488
    .line 489
    invoke-virtual {v8, v7}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    goto :goto_b

    .line 493
    :cond_d
    const-string v5, "in-app-excludes"

    .line 494
    .line 495
    invoke-interface {v0, v5}, Lio/sentry/config/d;->d(Ljava/lang/String;)Ljava/util/List;

    .line 496
    .line 497
    .line 498
    move-result-object v5

    .line 499
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 500
    .line 501
    .line 502
    move-result-object v5

    .line 503
    :goto_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 504
    .line 505
    .line 506
    move-result v7

    .line 507
    if-eqz v7, :cond_e

    .line 508
    .line 509
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v7

    .line 513
    check-cast v7, Ljava/lang/String;

    .line 514
    .line 515
    iget-object v8, v4, Lio/sentry/e0;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 516
    .line 517
    invoke-virtual {v8, v7}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    goto :goto_c

    .line 521
    :cond_e
    const-string v5, "trace-propagation-targets"

    .line 522
    .line 523
    invoke-virtual {v0, v5}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v7

    .line 527
    if-eqz v7, :cond_f

    .line 528
    .line 529
    invoke-interface {v0, v5}, Lio/sentry/config/d;->d(Ljava/lang/String;)Ljava/util/List;

    .line 530
    .line 531
    .line 532
    move-result-object v5

    .line 533
    goto :goto_d

    .line 534
    :cond_f
    move-object v5, v6

    .line 535
    :goto_d
    if-nez v5, :cond_10

    .line 536
    .line 537
    const-string v7, "tracing-origins"

    .line 538
    .line 539
    invoke-virtual {v0, v7}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v8

    .line 543
    if-eqz v8, :cond_10

    .line 544
    .line 545
    invoke-interface {v0, v7}, Lio/sentry/config/d;->d(Ljava/lang/String;)Ljava/util/List;

    .line 546
    .line 547
    .line 548
    move-result-object v5

    .line 549
    :cond_10
    if-eqz v5, :cond_13

    .line 550
    .line 551
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 552
    .line 553
    .line 554
    move-result-object v5

    .line 555
    :cond_11
    :goto_e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 556
    .line 557
    .line 558
    move-result v7

    .line 559
    if-eqz v7, :cond_13

    .line 560
    .line 561
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v7

    .line 565
    check-cast v7, Ljava/lang/String;

    .line 566
    .line 567
    iget-object v8, v4, Lio/sentry/e0;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 568
    .line 569
    if-nez v8, :cond_12

    .line 570
    .line 571
    new-instance v8, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 572
    .line 573
    invoke-direct {v8}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 574
    .line 575
    .line 576
    iput-object v8, v4, Lio/sentry/e0;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 577
    .line 578
    :cond_12
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 579
    .line 580
    .line 581
    move-result v8

    .line 582
    if-nez v8, :cond_11

    .line 583
    .line 584
    iget-object v8, v4, Lio/sentry/e0;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 585
    .line 586
    invoke-virtual {v8, v7}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    goto :goto_e

    .line 590
    :cond_13
    const-string v5, "context-tags"

    .line 591
    .line 592
    invoke-interface {v0, v5}, Lio/sentry/config/d;->d(Ljava/lang/String;)Ljava/util/List;

    .line 593
    .line 594
    .line 595
    move-result-object v5

    .line 596
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 597
    .line 598
    .line 599
    move-result-object v5

    .line 600
    :goto_f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 601
    .line 602
    .line 603
    move-result v7

    .line 604
    if-eqz v7, :cond_14

    .line 605
    .line 606
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v7

    .line 610
    check-cast v7, Ljava/lang/String;

    .line 611
    .line 612
    iget-object v8, v4, Lio/sentry/e0;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 613
    .line 614
    invoke-virtual {v8, v7}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    goto :goto_f

    .line 618
    :cond_14
    const-string v5, "proguard-uuid"

    .line 619
    .line 620
    invoke-virtual {v0, v5}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v5

    .line 624
    iput-object v5, v4, Lio/sentry/e0;->s:Ljava/lang/String;

    .line 625
    .line 626
    const-string v5, "bundle-ids"

    .line 627
    .line 628
    invoke-interface {v0, v5}, Lio/sentry/config/d;->d(Ljava/lang/String;)Ljava/util/List;

    .line 629
    .line 630
    .line 631
    move-result-object v5

    .line 632
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 633
    .line 634
    .line 635
    move-result-object v5

    .line 636
    :goto_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 637
    .line 638
    .line 639
    move-result v7

    .line 640
    if-eqz v7, :cond_15

    .line 641
    .line 642
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v7

    .line 646
    check-cast v7, Ljava/lang/String;

    .line 647
    .line 648
    iget-object v8, v4, Lio/sentry/e0;->A:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 649
    .line 650
    invoke-virtual {v8, v7}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    goto :goto_10

    .line 654
    :cond_15
    const-string v5, "idle-timeout"

    .line 655
    .line 656
    invoke-interface {v0, v5}, Lio/sentry/config/d;->b(Ljava/lang/String;)Ljava/lang/Long;

    .line 657
    .line 658
    .line 659
    move-result-object v5

    .line 660
    iput-object v5, v4, Lio/sentry/e0;->t:Ljava/lang/Long;

    .line 661
    .line 662
    const-string v5, "shutdown-timeout-millis"

    .line 663
    .line 664
    invoke-interface {v0, v5}, Lio/sentry/config/d;->b(Ljava/lang/String;)Ljava/lang/Long;

    .line 665
    .line 666
    .line 667
    move-result-object v5

    .line 668
    iput-object v5, v4, Lio/sentry/e0;->u:Ljava/lang/Long;

    .line 669
    .line 670
    const-string v5, "session-flush-timeout-millis"

    .line 671
    .line 672
    invoke-interface {v0, v5}, Lio/sentry/config/d;->b(Ljava/lang/String;)Ljava/lang/Long;

    .line 673
    .line 674
    .line 675
    move-result-object v5

    .line 676
    iput-object v5, v4, Lio/sentry/e0;->v:Ljava/lang/Long;

    .line 677
    .line 678
    const-string v5, "ignored-errors"

    .line 679
    .line 680
    invoke-virtual {v0, v5}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v5

    .line 684
    const-string v7, ","

    .line 685
    .line 686
    if-eqz v5, :cond_16

    .line 687
    .line 688
    invoke-virtual {v5, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v5

    .line 692
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 693
    .line 694
    .line 695
    move-result-object v5

    .line 696
    goto :goto_11

    .line 697
    :cond_16
    move-object v5, v6

    .line 698
    :goto_11
    iput-object v5, v4, Lio/sentry/e0;->x:Ljava/util/List;

    .line 699
    .line 700
    const-string v5, "enabled"

    .line 701
    .line 702
    invoke-interface {v0, v5}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 703
    .line 704
    .line 705
    move-result-object v5

    .line 706
    iput-object v5, v4, Lio/sentry/e0;->B:Ljava/lang/Boolean;

    .line 707
    .line 708
    const-string v5, "enable-pretty-serialization-output"

    .line 709
    .line 710
    invoke-interface {v0, v5}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 711
    .line 712
    .line 713
    move-result-object v5

    .line 714
    iput-object v5, v4, Lio/sentry/e0;->C:Ljava/lang/Boolean;

    .line 715
    .line 716
    const-string v5, "send-modules"

    .line 717
    .line 718
    invoke-interface {v0, v5}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 719
    .line 720
    .line 721
    move-result-object v5

    .line 722
    iput-object v5, v4, Lio/sentry/e0;->J:Ljava/lang/Boolean;

    .line 723
    .line 724
    const-string v5, "send-default-pii"

    .line 725
    .line 726
    invoke-interface {v0, v5}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 727
    .line 728
    .line 729
    move-result-object v5

    .line 730
    iput-object v5, v4, Lio/sentry/e0;->K:Ljava/lang/Boolean;

    .line 731
    .line 732
    const-string v5, "ignored-checkins"

    .line 733
    .line 734
    invoke-virtual {v0, v5}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v5

    .line 738
    if-eqz v5, :cond_17

    .line 739
    .line 740
    invoke-virtual {v5, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v5

    .line 744
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 745
    .line 746
    .line 747
    move-result-object v5

    .line 748
    goto :goto_12

    .line 749
    :cond_17
    move-object v5, v6

    .line 750
    :goto_12
    iput-object v5, v4, Lio/sentry/e0;->H:Ljava/util/List;

    .line 751
    .line 752
    const-string v5, "ignored-transactions"

    .line 753
    .line 754
    invoke-virtual {v0, v5}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v5

    .line 758
    if-eqz v5, :cond_18

    .line 759
    .line 760
    invoke-virtual {v5, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v5

    .line 764
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 765
    .line 766
    .line 767
    move-result-object v5

    .line 768
    goto :goto_13

    .line 769
    :cond_18
    move-object v5, v6

    .line 770
    :goto_13
    iput-object v5, v4, Lio/sentry/e0;->I:Ljava/util/List;

    .line 771
    .line 772
    const-string v5, "enable-backpressure-handling"

    .line 773
    .line 774
    invoke-interface {v0, v5}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 775
    .line 776
    .line 777
    move-result-object v5

    .line 778
    iput-object v5, v4, Lio/sentry/e0;->L:Ljava/lang/Boolean;

    .line 779
    .line 780
    const-string v5, "enable-database-transaction-tracing"

    .line 781
    .line 782
    invoke-interface {v0, v5}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 783
    .line 784
    .line 785
    move-result-object v5

    .line 786
    iput-object v5, v4, Lio/sentry/e0;->M:Ljava/lang/Boolean;

    .line 787
    .line 788
    const-string v5, "enable-cache-tracing"

    .line 789
    .line 790
    invoke-interface {v0, v5}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 791
    .line 792
    .line 793
    move-result-object v5

    .line 794
    iput-object v5, v4, Lio/sentry/e0;->N:Ljava/lang/Boolean;

    .line 795
    .line 796
    const-string v5, "enable-queue-tracing"

    .line 797
    .line 798
    invoke-interface {v0, v5}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 799
    .line 800
    .line 801
    move-result-object v5

    .line 802
    iput-object v5, v4, Lio/sentry/e0;->O:Ljava/lang/Boolean;

    .line 803
    .line 804
    const-string v5, "global-hub-mode"

    .line 805
    .line 806
    invoke-interface {v0, v5}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 807
    .line 808
    .line 809
    move-result-object v5

    .line 810
    iput-object v5, v4, Lio/sentry/e0;->P:Ljava/lang/Boolean;

    .line 811
    .line 812
    const-string v5, "capture-open-telemetry-events"

    .line 813
    .line 814
    invoke-interface {v0, v5}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 815
    .line 816
    .line 817
    move-result-object v5

    .line 818
    iput-object v5, v4, Lio/sentry/e0;->R:Ljava/lang/Boolean;

    .line 819
    .line 820
    const-string v5, "logs.enabled"

    .line 821
    .line 822
    invoke-interface {v0, v5}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 823
    .line 824
    .line 825
    move-result-object v5

    .line 826
    iput-object v5, v4, Lio/sentry/e0;->E:Ljava/lang/Boolean;

    .line 827
    .line 828
    const-string v5, "metrics.enabled"

    .line 829
    .line 830
    invoke-interface {v0, v5}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 831
    .line 832
    .line 833
    move-result-object v5

    .line 834
    iput-object v5, v4, Lio/sentry/e0;->F:Ljava/lang/Boolean;

    .line 835
    .line 836
    const-string v5, "ignored-exceptions-for-type"

    .line 837
    .line 838
    invoke-interface {v0, v5}, Lio/sentry/config/d;->d(Ljava/lang/String;)Ljava/util/List;

    .line 839
    .line 840
    .line 841
    move-result-object v5

    .line 842
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 843
    .line 844
    .line 845
    move-result-object v5

    .line 846
    :goto_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 847
    .line 848
    .line 849
    move-result v7

    .line 850
    if-eqz v7, :cond_1a

    .line 851
    .line 852
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    move-result-object v7

    .line 856
    check-cast v7, Ljava/lang/String;

    .line 857
    .line 858
    :try_start_c
    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 859
    .line 860
    .line 861
    move-result-object v8

    .line 862
    const-class v9, Ljava/lang/Throwable;

    .line 863
    .line 864
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 865
    .line 866
    .line 867
    move-result v9

    .line 868
    if-eqz v9, :cond_19

    .line 869
    .line 870
    iget-object v9, v4, Lio/sentry/e0;->w:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 871
    .line 872
    invoke-virtual {v9, v8}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 873
    .line 874
    .line 875
    goto :goto_14

    .line 876
    :cond_19
    sget-object v8, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 877
    .line 878
    const-string v9, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable"

    .line 879
    .line 880
    filled-new-array {v7, v7}, [Ljava/lang/Object;

    .line 881
    .line 882
    .line 883
    move-result-object v10

    .line 884
    invoke-interface {v3, v8, v9, v10}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_c
    .catch Ljava/lang/ClassNotFoundException; {:try_start_c .. :try_end_c} :catch_4

    .line 885
    .line 886
    .line 887
    goto :goto_14

    .line 888
    :catch_4
    sget-object v8, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 889
    .line 890
    const-string v9, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found"

    .line 891
    .line 892
    filled-new-array {v7, v7}, [Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    move-result-object v7

    .line 896
    invoke-interface {v3, v8, v9, v7}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 897
    .line 898
    .line 899
    goto :goto_14

    .line 900
    :cond_1a
    const-string v3, "cron.default-checkin-margin"

    .line 901
    .line 902
    invoke-interface {v0, v3}, Lio/sentry/config/d;->b(Ljava/lang/String;)Ljava/lang/Long;

    .line 903
    .line 904
    .line 905
    move-result-object v3

    .line 906
    const-string v5, "cron.default-max-runtime"

    .line 907
    .line 908
    invoke-interface {v0, v5}, Lio/sentry/config/d;->b(Ljava/lang/String;)Ljava/lang/Long;

    .line 909
    .line 910
    .line 911
    move-result-object v5

    .line 912
    const-string v7, "cron.default-timezone"

    .line 913
    .line 914
    invoke-virtual {v0, v7}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v7

    .line 918
    const-string v8, "cron.default-failure-issue-threshold"

    .line 919
    .line 920
    invoke-interface {v0, v8}, Lio/sentry/config/d;->b(Ljava/lang/String;)Ljava/lang/Long;

    .line 921
    .line 922
    .line 923
    move-result-object v8

    .line 924
    const-string v9, "cron.default-recovery-threshold"

    .line 925
    .line 926
    invoke-interface {v0, v9}, Lio/sentry/config/d;->b(Ljava/lang/String;)Ljava/lang/Long;

    .line 927
    .line 928
    .line 929
    move-result-object v9

    .line 930
    if-nez v3, :cond_1b

    .line 931
    .line 932
    if-nez v5, :cond_1b

    .line 933
    .line 934
    if-nez v7, :cond_1b

    .line 935
    .line 936
    if-nez v8, :cond_1b

    .line 937
    .line 938
    if-eqz v9, :cond_1c

    .line 939
    .line 940
    :cond_1b
    new-instance v10, Lio/sentry/c6;

    .line 941
    .line 942
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 943
    .line 944
    .line 945
    iput-object v3, v10, Lio/sentry/c6;->a:Ljava/lang/Long;

    .line 946
    .line 947
    iput-object v5, v10, Lio/sentry/c6;->b:Ljava/lang/Long;

    .line 948
    .line 949
    iput-object v7, v10, Lio/sentry/c6;->c:Ljava/lang/String;

    .line 950
    .line 951
    iput-object v8, v10, Lio/sentry/c6;->d:Ljava/lang/Long;

    .line 952
    .line 953
    iput-object v9, v10, Lio/sentry/c6;->e:Ljava/lang/Long;

    .line 954
    .line 955
    iput-object v10, v4, Lio/sentry/e0;->X:Lio/sentry/c6;

    .line 956
    .line 957
    :cond_1c
    const-string v3, "enable-strict-trace-continuation"

    .line 958
    .line 959
    invoke-interface {v0, v3}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 960
    .line 961
    .line 962
    move-result-object v3

    .line 963
    iput-object v3, v4, Lio/sentry/e0;->V:Ljava/lang/Boolean;

    .line 964
    .line 965
    const-string v3, "org-id"

    .line 966
    .line 967
    invoke-virtual {v0, v3}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 968
    .line 969
    .line 970
    move-result-object v3

    .line 971
    iput-object v3, v4, Lio/sentry/e0;->W:Ljava/lang/String;

    .line 972
    .line 973
    const-string v3, "enable-spotlight"

    .line 974
    .line 975
    invoke-interface {v0, v3}, Lio/sentry/config/d;->a(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 976
    .line 977
    .line 978
    move-result-object v3

    .line 979
    iput-object v3, v4, Lio/sentry/e0;->D:Ljava/lang/Boolean;

    .line 980
    .line 981
    const-string v3, "spotlight-connection-url"

    .line 982
    .line 983
    invoke-virtual {v0, v3}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 984
    .line 985
    .line 986
    move-result-object v3

    .line 987
    iput-object v3, v4, Lio/sentry/e0;->G:Ljava/lang/String;

    .line 988
    .line 989
    const-string v3, "profile-session-sample-rate"

    .line 990
    .line 991
    invoke-virtual {v0, v3}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 992
    .line 993
    .line 994
    move-result-object v3

    .line 995
    if-eqz v3, :cond_1d

    .line 996
    .line 997
    :try_start_d
    invoke-static {v3}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    .line 998
    .line 999
    .line 1000
    move-result-object v6
    :try_end_d
    .catch Ljava/lang/NumberFormatException; {:try_start_d .. :try_end_d} :catch_5

    .line 1001
    :catch_5
    :cond_1d
    iput-object v6, v4, Lio/sentry/e0;->S:Ljava/lang/Double;

    .line 1002
    .line 1003
    const-string v3, "profiling-traces-dir-path"

    .line 1004
    .line 1005
    invoke-virtual {v0, v3}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v3

    .line 1009
    iput-object v3, v4, Lio/sentry/e0;->T:Ljava/lang/String;

    .line 1010
    .line 1011
    const-string v3, "profile-lifecycle"

    .line 1012
    .line 1013
    invoke-virtual {v0, v3}, Lio/sentry/config/b;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    if-eqz v0, :cond_1e

    .line 1018
    .line 1019
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 1020
    .line 1021
    .line 1022
    move-result v3

    .line 1023
    if-nez v3, :cond_1e

    .line 1024
    .line 1025
    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v0

    .line 1029
    invoke-static {v0}, Lio/sentry/q3;->valueOf(Ljava/lang/String;)Lio/sentry/q3;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    iput-object v0, v4, Lio/sentry/e0;->U:Lio/sentry/q3;

    .line 1034
    .line 1035
    :cond_1e
    invoke-virtual {p0, v4}, Lio/sentry/m6;->merge(Lio/sentry/e0;)V

    .line 1036
    .line 1037
    .line 1038
    :cond_1f
    invoke-virtual {p0}, Lio/sentry/m6;->getDsn()Ljava/lang/String;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v0

    .line 1042
    invoke-virtual {p0}, Lio/sentry/m6;->isEnabled()Z

    .line 1043
    .line 1044
    .line 1045
    move-result v3

    .line 1046
    if-eqz v3, :cond_22

    .line 1047
    .line 1048
    if-eqz v0, :cond_20

    .line 1049
    .line 1050
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 1051
    .line 1052
    .line 1053
    move-result v3

    .line 1054
    if-eqz v3, :cond_20

    .line 1055
    .line 1056
    goto :goto_15

    .line 1057
    :cond_20
    if-eqz v0, :cond_21

    .line 1058
    .line 1059
    invoke-virtual {p0}, Lio/sentry/m6;->retrieveParsedDsn()Lio/sentry/z;

    .line 1060
    .line 1061
    .line 1062
    return v2

    .line 1063
    :cond_21
    const-string p0, "DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK."

    .line 1064
    .line 1065
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 1066
    .line 1067
    .line 1068
    return v1

    .line 1069
    :cond_22
    :goto_15
    invoke-static {}, Lio/sentry/m4;->a()V

    .line 1070
    .line 1071
    .line 1072
    return v1
.end method

.method public static h(Lpn;)V
    .locals 1

    .line 1
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p0}, Lio/sentry/c1;->k(Lpn;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

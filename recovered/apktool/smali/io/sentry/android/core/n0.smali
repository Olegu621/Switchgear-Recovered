.class public abstract Lio/sentry/android/core/n0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Las0;

.field public static final b:Las0;

.field public static final c:Las0;

.field public static final d:Las0;

.field public static final e:Las0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Las0;

    .line 2
    .line 3
    new-instance v1, Lio/sentry/u2;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lio/sentry/u2;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Las0;-><init>(Lio/sentry/u2;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lio/sentry/android/core/n0;->a:Las0;

    .line 14
    .line 15
    new-instance v0, Las0;

    .line 16
    .line 17
    new-instance v1, Lio/sentry/u2;

    .line 18
    .line 19
    const/16 v2, 0xb

    .line 20
    .line 21
    invoke-direct {v1, v2}, Lio/sentry/u2;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1}, Las0;-><init>(Lio/sentry/u2;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lio/sentry/android/core/n0;->b:Las0;

    .line 28
    .line 29
    new-instance v0, Las0;

    .line 30
    .line 31
    new-instance v1, Lio/sentry/u2;

    .line 32
    .line 33
    const/16 v2, 0xc

    .line 34
    .line 35
    invoke-direct {v1, v2}, Lio/sentry/u2;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1}, Las0;-><init>(Lio/sentry/u2;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lio/sentry/android/core/n0;->c:Las0;

    .line 42
    .line 43
    new-instance v0, Las0;

    .line 44
    .line 45
    new-instance v1, Lio/sentry/u2;

    .line 46
    .line 47
    const/16 v2, 0xd

    .line 48
    .line 49
    invoke-direct {v1, v2}, Lio/sentry/u2;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v1}, Las0;-><init>(Lio/sentry/u2;)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lio/sentry/android/core/n0;->d:Las0;

    .line 56
    .line 57
    new-instance v0, Las0;

    .line 58
    .line 59
    new-instance v1, Lio/sentry/u2;

    .line 60
    .line 61
    const/16 v2, 0xe

    .line 62
    .line 63
    invoke-direct {v1, v2}, Lio/sentry/u2;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v0, v1}, Las0;-><init>(Lio/sentry/u2;)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lio/sentry/android/core/n0;->e:Las0;

    .line 70
    .line 71
    return-void
.end method

.method public static a(Ljava/lang/String;Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/f;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Logcat"

    .line 7
    .line 8
    iput-object v1, v0, Lio/sentry/f;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p2, v0, Lio/sentry/f;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p1, v0, Lio/sentry/f;->w:Lio/sentry/m5;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const-string p1, "tag"

    .line 17
    .line 18
    invoke-virtual {v0, p0, p1}, Lio/sentry/f;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    if-eqz p3, :cond_1

    .line 22
    .line 23
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    const-string p0, "throwable"

    .line 30
    .line 31
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p1, p0}, Lio/sentry/f;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-interface {p0, v0}, Lio/sentry/c1;->i(Lio/sentry/f;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public static b(Lio/sentry/q5;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lio/sentry/c1;->l()Lio/sentry/m6;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lio/sentry/m6;->getLogs()Lio/sentry/e6;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-boolean v0, v0, Lio/sentry/e6;->a:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    if-eqz p2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    :goto_0
    new-instance v1, Lio/sentry/d;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v2, "auto.log.logcat"

    .line 32
    .line 33
    iput-object v2, v1, Lio/sentry/d;->a:Ljava/lang/String;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    if-eqz p2, :cond_4

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-interface {p2}, Lio/sentry/c1;->t()Lio/sentry/logger/a;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    const-string v3, "\n"

    .line 52
    .line 53
    invoke-static {p1, v3, v0}, Len;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :cond_3
    new-array p1, v2, [Ljava/lang/Object;

    .line 58
    .line 59
    invoke-interface {p2, p0, v1, v0, p1}, Lio/sentry/logger/a;->e(Lio/sentry/q5;Lio/sentry/d;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_4
    :goto_1
    invoke-static {}, Lio/sentry/m4;->b()Lio/sentry/c1;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-interface {p2}, Lio/sentry/c1;->t()Lio/sentry/logger/a;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    new-array v0, v2, [Ljava/lang/Object;

    .line 72
    .line 73
    invoke-interface {p2, p0, v1, p1, v0}, Lio/sentry/logger/a;->e(Lio/sentry/q5;Lio/sentry/d;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public static c(Landroid/content/Context;Lio/sentry/android/core/o0;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 12

    .line 1
    const-string p1, ""

    .line 2
    .line 3
    const-string v0, "io.sentry.traces.trace-propagation-targets"

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 6
    .line 7
    .line 8
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v2, 0x21

    .line 11
    .line 12
    if-lt v1, v2, :cond_0

    .line 13
    .line 14
    sget-object v1, Lio/sentry/android/core/n0;->d:Las0;

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Las0;->c(Landroid/content/Context;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Landroid/content/pm/ApplicationInfo;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object v1, Lio/sentry/android/core/n0;->e:Las0;

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Las0;->c(Landroid/content/Context;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Landroid/content/pm/ApplicationInfo;

    .line 30
    .line 31
    :goto_0
    const/4 v1, 0x0

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object p0, v1

    .line 38
    :goto_1
    invoke-virtual {p2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const/4 v3, 0x0

    .line 43
    if-eqz p0, :cond_27

    .line 44
    .line 45
    const-string v4, "io.sentry.debug"

    .line 46
    .line 47
    invoke-virtual {p2}, Lio/sentry/m6;->isDebug()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    invoke-static {p0, v2, v4, v5}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setDebug(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Lio/sentry/m6;->isDebug()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_2

    .line 63
    .line 64
    const-string v4, "io.sentry.debug.level"

    .line 65
    .line 66
    invoke-virtual {p2}, Lio/sentry/m6;->getDiagnosticLevel()Lio/sentry/m5;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 75
    .line 76
    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-static {p0, v2, v4, v5}, Lio/sentry/android/core/n0;->o(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    if-eqz v4, :cond_2

    .line 85
    .line 86
    invoke-virtual {v4, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-static {v4}, Lio/sentry/m5;->valueOf(Ljava/lang/String;)Lio/sentry/m5;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setDiagnosticLevel(Lio/sentry/m5;)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :catchall_0
    move-exception p0

    .line 99
    goto/16 :goto_e

    .line 100
    .line 101
    :cond_2
    :goto_2
    const-string v4, "io.sentry.anr.enable"

    .line 102
    .line 103
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrEnabled()Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    invoke-static {p0, v2, v4, v5}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrEnabled(Z)V

    .line 112
    .line 113
    .line 114
    const-string v4, "io.sentry.tombstone.enable"

    .line 115
    .line 116
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isTombstoneEnabled()Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    invoke-static {p0, v2, v4, v5}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setTombstoneEnabled(Z)V

    .line 125
    .line 126
    .line 127
    const-string v4, "io.sentry.tombstone.attach-raw"

    .line 128
    .line 129
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachRawTombstone()Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    invoke-static {p0, v2, v4, v5}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachRawTombstone(Z)V

    .line 138
    .line 139
    .line 140
    const-string v4, "io.sentry.tombstone.report-historical"

    .line 141
    .line 142
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isReportHistoricalTombstones()Z

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    invoke-static {p0, v2, v4, v5}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setReportHistoricalTombstones(Z)V

    .line 151
    .line 152
    .line 153
    const-string v4, "io.sentry.auto-session-tracking.enable"

    .line 154
    .line 155
    invoke-virtual {p2}, Lio/sentry/m6;->isEnableAutoSessionTracking()Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    invoke-static {p0, v2, v4, v5}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setEnableAutoSessionTracking(Z)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2}, Lio/sentry/m6;->getSampleRate()Ljava/lang/Double;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    const-wide/high16 v5, -0x4010000000000000L    # -1.0

    .line 171
    .line 172
    if-nez v4, :cond_3

    .line 173
    .line 174
    const-string v4, "io.sentry.sample-rate"

    .line 175
    .line 176
    invoke-static {p0, v2, v4}, Lio/sentry/android/core/n0;->l(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    .line 177
    .line 178
    .line 179
    move-result-wide v7

    .line 180
    cmpl-double v4, v7, v5

    .line 181
    .line 182
    if-eqz v4, :cond_3

    .line 183
    .line 184
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setSampleRate(Ljava/lang/Double;)V

    .line 189
    .line 190
    .line 191
    :cond_3
    const-string v4, "io.sentry.anr.report-debug"

    .line 192
    .line 193
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrReportInDebug()Z

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrReportInDebug(Z)V

    .line 202
    .line 203
    .line 204
    const-string v4, "io.sentry.anr.timeout-interval-millis"

    .line 205
    .line 206
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->getAnrTimeoutIntervalMillis()J

    .line 207
    .line 208
    .line 209
    move-result-wide v7

    .line 210
    invoke-static {p0, v2, v4, v7, v8}, Lio/sentry/android/core/n0;->n(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    .line 211
    .line 212
    .line 213
    move-result-wide v7

    .line 214
    invoke-virtual {p2, v7, v8}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrTimeoutIntervalMillis(J)V

    .line 215
    .line 216
    .line 217
    const-string v4, "io.sentry.anr.attach-thread-dumps"

    .line 218
    .line 219
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachAnrThreadDump()Z

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachAnrThreadDump(Z)V

    .line 228
    .line 229
    .line 230
    const-string v4, "io.sentry.anr.report-historical"

    .line 231
    .line 232
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isReportHistoricalAnrs()Z

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setReportHistoricalAnrs(Z)V

    .line 241
    .line 242
    .line 243
    const-string v4, "io.sentry.dsn"

    .line 244
    .line 245
    invoke-virtual {p2}, Lio/sentry/m6;->getDsn()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->o(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    const-string v7, "io.sentry.enabled"

    .line 254
    .line 255
    invoke-virtual {p2}, Lio/sentry/m6;->isEnabled()Z

    .line 256
    .line 257
    .line 258
    move-result v8

    .line 259
    invoke-static {p0, v2, v7, v8}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 260
    .line 261
    .line 262
    move-result v7

    .line 263
    if-eqz v7, :cond_5

    .line 264
    .line 265
    if-eqz v4, :cond_4

    .line 266
    .line 267
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 268
    .line 269
    .line 270
    move-result v8

    .line 271
    if-eqz v8, :cond_4

    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_4
    if-nez v4, :cond_6

    .line 275
    .line 276
    invoke-virtual {p2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 277
    .line 278
    .line 279
    move-result-object v8

    .line 280
    sget-object v9, Lio/sentry/m5;->FATAL:Lio/sentry/m5;

    .line 281
    .line 282
    const-string v10, "DSN is required. Use empty string to disable SDK."

    .line 283
    .line 284
    new-array v11, v3, [Ljava/lang/Object;

    .line 285
    .line 286
    invoke-interface {v8, v9, v10, v11}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    goto :goto_4

    .line 290
    :cond_5
    :goto_3
    invoke-virtual {p2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 291
    .line 292
    .line 293
    move-result-object v8

    .line 294
    sget-object v9, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 295
    .line 296
    const-string v10, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android"

    .line 297
    .line 298
    new-array v11, v3, [Ljava/lang/Object;

    .line 299
    .line 300
    invoke-interface {v8, v9, v10, v11}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    :cond_6
    :goto_4
    invoke-virtual {p2, v7}, Lio/sentry/m6;->setEnabled(Z)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setDsn(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    const-string v4, "io.sentry.ndk.enable"

    .line 310
    .line 311
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableNdk()Z

    .line 312
    .line 313
    .line 314
    move-result v7

    .line 315
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableNdk(Z)V

    .line 320
    .line 321
    .line 322
    const-string v4, "io.sentry.ndk.scope-sync.enable"

    .line 323
    .line 324
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableScopeSync()Z

    .line 325
    .line 326
    .line 327
    move-result v7

    .line 328
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableScopeSync(Z)V

    .line 333
    .line 334
    .line 335
    const-string v4, "io.sentry.ndk.sdk-name"

    .line 336
    .line 337
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->getNativeSdkName()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v7

    .line 341
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->o(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    if-eqz v4, :cond_7

    .line 346
    .line 347
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setNativeSdkName(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    :cond_7
    const-string v4, "io.sentry.release"

    .line 351
    .line 352
    invoke-virtual {p2}, Lio/sentry/m6;->getRelease()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v7

    .line 356
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->o(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setRelease(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    const-string v4, "io.sentry.dist"

    .line 364
    .line 365
    invoke-virtual {p2}, Lio/sentry/m6;->getDist()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v7

    .line 369
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->o(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setDist(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    const-string v4, "io.sentry.environment"

    .line 377
    .line 378
    invoke-virtual {p2}, Lio/sentry/m6;->getEnvironment()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v7

    .line 382
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->o(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setEnvironment(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    const-string v4, "io.sentry.session-tracking.timeout-interval-millis"

    .line 390
    .line 391
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionTrackingIntervalMillis()J

    .line 392
    .line 393
    .line 394
    move-result-wide v7

    .line 395
    invoke-static {p0, v2, v4, v7, v8}, Lio/sentry/android/core/n0;->n(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    .line 396
    .line 397
    .line 398
    move-result-wide v7

    .line 399
    invoke-virtual {p2, v7, v8}, Lio/sentry/m6;->setSessionTrackingIntervalMillis(J)V

    .line 400
    .line 401
    .line 402
    const-string v4, "io.sentry.max-breadcrumbs"

    .line 403
    .line 404
    invoke-virtual {p2}, Lio/sentry/m6;->getMaxBreadcrumbs()I

    .line 405
    .line 406
    .line 407
    move-result v7

    .line 408
    int-to-long v7, v7

    .line 409
    invoke-static {p0, v2, v4, v7, v8}, Lio/sentry/android/core/n0;->n(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    .line 410
    .line 411
    .line 412
    move-result-wide v7

    .line 413
    long-to-int v4, v7

    .line 414
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setMaxBreadcrumbs(I)V

    .line 415
    .line 416
    .line 417
    const-string v4, "io.sentry.breadcrumbs.activity-lifecycle"

    .line 418
    .line 419
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableActivityLifecycleBreadcrumbs()Z

    .line 420
    .line 421
    .line 422
    move-result v7

    .line 423
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableActivityLifecycleBreadcrumbs(Z)V

    .line 428
    .line 429
    .line 430
    const-string v4, "io.sentry.breadcrumbs.app-lifecycle"

    .line 431
    .line 432
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAppLifecycleBreadcrumbs()Z

    .line 433
    .line 434
    .line 435
    move-result v7

    .line 436
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 437
    .line 438
    .line 439
    move-result v4

    .line 440
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAppLifecycleBreadcrumbs(Z)V

    .line 441
    .line 442
    .line 443
    const-string v4, "io.sentry.breadcrumbs.system-events"

    .line 444
    .line 445
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableSystemEventBreadcrumbs()Z

    .line 446
    .line 447
    .line 448
    move-result v7

    .line 449
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 450
    .line 451
    .line 452
    move-result v4

    .line 453
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableSystemEventBreadcrumbs(Z)V

    .line 454
    .line 455
    .line 456
    const-string v4, "io.sentry.breadcrumbs.app-components"

    .line 457
    .line 458
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAppComponentBreadcrumbs()Z

    .line 459
    .line 460
    .line 461
    move-result v7

    .line 462
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 463
    .line 464
    .line 465
    move-result v4

    .line 466
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAppComponentBreadcrumbs(Z)V

    .line 467
    .line 468
    .line 469
    const-string v4, "io.sentry.breadcrumbs.user-interaction"

    .line 470
    .line 471
    invoke-virtual {p2}, Lio/sentry/m6;->isEnableUserInteractionBreadcrumbs()Z

    .line 472
    .line 473
    .line 474
    move-result v7

    .line 475
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 476
    .line 477
    .line 478
    move-result v4

    .line 479
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setEnableUserInteractionBreadcrumbs(Z)V

    .line 480
    .line 481
    .line 482
    const-string v4, "io.sentry.breadcrumbs.network-events"

    .line 483
    .line 484
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableNetworkEventBreadcrumbs()Z

    .line 485
    .line 486
    .line 487
    move-result v7

    .line 488
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 489
    .line 490
    .line 491
    move-result v4

    .line 492
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableNetworkEventBreadcrumbs(Z)V

    .line 493
    .line 494
    .line 495
    const-string v4, "io.sentry.uncaught-exception-handler.enable"

    .line 496
    .line 497
    invoke-virtual {p2}, Lio/sentry/m6;->isEnableUncaughtExceptionHandler()Z

    .line 498
    .line 499
    .line 500
    move-result v7

    .line 501
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 502
    .line 503
    .line 504
    move-result v4

    .line 505
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setEnableUncaughtExceptionHandler(Z)V

    .line 506
    .line 507
    .line 508
    const-string v4, "io.sentry.attach-threads"

    .line 509
    .line 510
    invoke-virtual {p2}, Lio/sentry/m6;->isAttachThreads()Z

    .line 511
    .line 512
    .line 513
    move-result v7

    .line 514
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 515
    .line 516
    .line 517
    move-result v4

    .line 518
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setAttachThreads(Z)V

    .line 519
    .line 520
    .line 521
    const-string v4, "io.sentry.attach-screenshot"

    .line 522
    .line 523
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachScreenshot()Z

    .line 524
    .line 525
    .line 526
    move-result v7

    .line 527
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 528
    .line 529
    .line 530
    move-result v4

    .line 531
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachScreenshot(Z)V

    .line 532
    .line 533
    .line 534
    const-string v4, "io.sentry.attach-view-hierarchy"

    .line 535
    .line 536
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachViewHierarchy()Z

    .line 537
    .line 538
    .line 539
    move-result v7

    .line 540
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 541
    .line 542
    .line 543
    move-result v4

    .line 544
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachViewHierarchy(Z)V

    .line 545
    .line 546
    .line 547
    const-string v4, "io.sentry.send-client-reports"

    .line 548
    .line 549
    invoke-virtual {p2}, Lio/sentry/m6;->isSendClientReports()Z

    .line 550
    .line 551
    .line 552
    move-result v7

    .line 553
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 554
    .line 555
    .line 556
    move-result v4

    .line 557
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setSendClientReports(Z)V

    .line 558
    .line 559
    .line 560
    const-string v4, "io.sentry.auto-init"

    .line 561
    .line 562
    const/4 v7, 0x1

    .line 563
    invoke-static {p0, v2, v4, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 564
    .line 565
    .line 566
    move-result v4

    .line 567
    if-eqz v4, :cond_8

    .line 568
    .line 569
    sget-object v4, Lio/sentry/q1;->LOW:Lio/sentry/q1;

    .line 570
    .line 571
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setInitPriority(Lio/sentry/q1;)V

    .line 572
    .line 573
    .line 574
    :cond_8
    const-string v4, "io.sentry.force-init"

    .line 575
    .line 576
    invoke-virtual {p2}, Lio/sentry/m6;->isForceInit()Z

    .line 577
    .line 578
    .line 579
    move-result v8

    .line 580
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 581
    .line 582
    .line 583
    move-result v4

    .line 584
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setForceInit(Z)V

    .line 585
    .line 586
    .line 587
    const-string v4, "io.sentry.additional-context"

    .line 588
    .line 589
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isCollectAdditionalContext()Z

    .line 590
    .line 591
    .line 592
    move-result v8

    .line 593
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 594
    .line 595
    .line 596
    move-result v4

    .line 597
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setCollectAdditionalContext(Z)V

    .line 598
    .line 599
    .line 600
    const-string v4, "io.sentry.external-storage-context"

    .line 601
    .line 602
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isCollectExternalStorageContext()Z

    .line 603
    .line 604
    .line 605
    move-result v8

    .line 606
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 607
    .line 608
    .line 609
    move-result v4

    .line 610
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setCollectExternalStorageContext(Z)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {p2}, Lio/sentry/m6;->getTracesSampleRate()Ljava/lang/Double;

    .line 614
    .line 615
    .line 616
    move-result-object v4

    .line 617
    if-nez v4, :cond_9

    .line 618
    .line 619
    const-string v4, "io.sentry.traces.sample-rate"

    .line 620
    .line 621
    invoke-static {p0, v2, v4}, Lio/sentry/android/core/n0;->l(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    .line 622
    .line 623
    .line 624
    move-result-wide v8

    .line 625
    cmpl-double v4, v8, v5

    .line 626
    .line 627
    if-eqz v4, :cond_9

    .line 628
    .line 629
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 630
    .line 631
    .line 632
    move-result-object v4

    .line 633
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setTracesSampleRate(Ljava/lang/Double;)V

    .line 634
    .line 635
    .line 636
    :cond_9
    const-string v4, "io.sentry.traces.trace-sampling"

    .line 637
    .line 638
    invoke-virtual {p2}, Lio/sentry/m6;->isTraceSampling()Z

    .line 639
    .line 640
    .line 641
    move-result v8

    .line 642
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 643
    .line 644
    .line 645
    move-result v4

    .line 646
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setTraceSampling(Z)V

    .line 647
    .line 648
    .line 649
    const-string v4, "io.sentry.traces.activity.enable"

    .line 650
    .line 651
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAutoActivityLifecycleTracing()Z

    .line 652
    .line 653
    .line 654
    move-result v8

    .line 655
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 656
    .line 657
    .line 658
    move-result v4

    .line 659
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAutoActivityLifecycleTracing(Z)V

    .line 660
    .line 661
    .line 662
    const-string v4, "io.sentry.traces.activity.auto-finish.enable"

    .line 663
    .line 664
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableActivityLifecycleTracingAutoFinish()Z

    .line 665
    .line 666
    .line 667
    move-result v8

    .line 668
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 669
    .line 670
    .line 671
    move-result v4

    .line 672
    invoke-virtual {p2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableActivityLifecycleTracingAutoFinish(Z)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {p2}, Lio/sentry/m6;->getProfilesSampleRate()Ljava/lang/Double;

    .line 676
    .line 677
    .line 678
    move-result-object v4

    .line 679
    if-nez v4, :cond_a

    .line 680
    .line 681
    const-string v4, "io.sentry.traces.profiling.sample-rate"

    .line 682
    .line 683
    invoke-static {p0, v2, v4}, Lio/sentry/android/core/n0;->l(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    .line 684
    .line 685
    .line 686
    move-result-wide v8

    .line 687
    cmpl-double v4, v8, v5

    .line 688
    .line 689
    if-eqz v4, :cond_a

    .line 690
    .line 691
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 692
    .line 693
    .line 694
    move-result-object v4

    .line 695
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setProfilesSampleRate(Ljava/lang/Double;)V

    .line 696
    .line 697
    .line 698
    :cond_a
    invoke-virtual {p2}, Lio/sentry/m6;->getProfileSessionSampleRate()Ljava/lang/Double;

    .line 699
    .line 700
    .line 701
    move-result-object v4

    .line 702
    if-nez v4, :cond_b

    .line 703
    .line 704
    const-string v4, "io.sentry.traces.profiling.session-sample-rate"

    .line 705
    .line 706
    invoke-static {p0, v2, v4}, Lio/sentry/android/core/n0;->l(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    .line 707
    .line 708
    .line 709
    move-result-wide v8

    .line 710
    cmpl-double v4, v8, v5

    .line 711
    .line 712
    if-eqz v4, :cond_b

    .line 713
    .line 714
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 715
    .line 716
    .line 717
    move-result-object v4

    .line 718
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setProfileSessionSampleRate(Ljava/lang/Double;)V

    .line 719
    .line 720
    .line 721
    :cond_b
    const-string v4, "io.sentry.traces.profiling.lifecycle"

    .line 722
    .line 723
    invoke-virtual {p2}, Lio/sentry/m6;->getProfileLifecycle()Lio/sentry/q3;

    .line 724
    .line 725
    .line 726
    move-result-object v8

    .line 727
    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v8

    .line 731
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 732
    .line 733
    invoke-virtual {v8, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v8

    .line 737
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/n0;->o(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v4

    .line 741
    if-eqz v4, :cond_c

    .line 742
    .line 743
    invoke-virtual {v4, v9}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object v4

    .line 747
    invoke-static {v4}, Lio/sentry/q3;->valueOf(Ljava/lang/String;)Lio/sentry/q3;

    .line 748
    .line 749
    .line 750
    move-result-object v4

    .line 751
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setProfileLifecycle(Lio/sentry/q3;)V

    .line 752
    .line 753
    .line 754
    :cond_c
    const-string v4, "io.sentry.traces.profiling.start-on-app-start"

    .line 755
    .line 756
    invoke-virtual {p2}, Lio/sentry/m6;->isStartProfilerOnAppStart()Z

    .line 757
    .line 758
    .line 759
    move-result v8

    .line 760
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 761
    .line 762
    .line 763
    move-result v4

    .line 764
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setStartProfilerOnAppStart(Z)V

    .line 765
    .line 766
    .line 767
    const-string v4, "io.sentry.traces.user-interaction.enable"

    .line 768
    .line 769
    invoke-virtual {p2}, Lio/sentry/m6;->isEnableUserInteractionTracing()Z

    .line 770
    .line 771
    .line 772
    move-result v8

    .line 773
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 774
    .line 775
    .line 776
    move-result v4

    .line 777
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setEnableUserInteractionTracing(Z)V

    .line 778
    .line 779
    .line 780
    const-string v4, "io.sentry.traces.time-to-full-display.enable"

    .line 781
    .line 782
    invoke-virtual {p2}, Lio/sentry/m6;->isEnableTimeToFullDisplayTracing()Z

    .line 783
    .line 784
    .line 785
    move-result v8

    .line 786
    invoke-static {p0, v2, v4, v8}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 787
    .line 788
    .line 789
    move-result v4

    .line 790
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setEnableTimeToFullDisplayTracing(Z)V

    .line 791
    .line 792
    .line 793
    const-string v4, "io.sentry.traces.idle-timeout"

    .line 794
    .line 795
    const-wide/16 v8, -0x1

    .line 796
    .line 797
    invoke-static {p0, v2, v4, v8, v9}, Lio/sentry/android/core/n0;->n(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    .line 798
    .line 799
    .line 800
    move-result-wide v10

    .line 801
    cmp-long v4, v10, v8

    .line 802
    .line 803
    if-eqz v4, :cond_d

    .line 804
    .line 805
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 806
    .line 807
    .line 808
    move-result-object v4

    .line 809
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setIdleTimeout(Ljava/lang/Long;)V

    .line 810
    .line 811
    .line 812
    :cond_d
    invoke-static {p0, v2, v0}, Lio/sentry/android/core/n0;->m(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 813
    .line 814
    .line 815
    move-result-object v4

    .line 816
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 817
    .line 818
    .line 819
    move-result v0

    .line 820
    if-eqz v0, :cond_e

    .line 821
    .line 822
    if-nez v4, :cond_e

    .line 823
    .line 824
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 825
    .line 826
    invoke-virtual {p2, v0}, Lio/sentry/m6;->setTracePropagationTargets(Ljava/util/List;)V

    .line 827
    .line 828
    .line 829
    goto :goto_5

    .line 830
    :cond_e
    if-eqz v4, :cond_f

    .line 831
    .line 832
    invoke-virtual {p2, v4}, Lio/sentry/m6;->setTracePropagationTargets(Ljava/util/List;)V

    .line 833
    .line 834
    .line 835
    :cond_f
    :goto_5
    const-string v0, "io.sentry.traces.frames-tracking"

    .line 836
    .line 837
    invoke-static {p0, v2, v0, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 838
    .line 839
    .line 840
    move-result v0

    .line 841
    invoke-virtual {p2, v0}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableFramesTracking(Z)V

    .line 842
    .line 843
    .line 844
    const-string v0, "io.sentry.proguard-uuid"

    .line 845
    .line 846
    invoke-virtual {p2}, Lio/sentry/m6;->getProguardUuid()Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v4

    .line 850
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/n0;->o(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    invoke-virtual {p2, v0}, Lio/sentry/m6;->setProguardUuid(Ljava/lang/String;)V

    .line 855
    .line 856
    .line 857
    invoke-virtual {p2}, Lio/sentry/m6;->getSdkVersion()Lio/sentry/protocol/u;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    if-nez v0, :cond_10

    .line 862
    .line 863
    new-instance v0, Lio/sentry/protocol/u;

    .line 864
    .line 865
    invoke-direct {v0, p1, p1}, Lio/sentry/protocol/u;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    :cond_10
    const-string p1, "io.sentry.sdk.name"

    .line 869
    .line 870
    invoke-virtual {v0}, Lio/sentry/protocol/u;->a()Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object v4

    .line 874
    invoke-static {p0, v2, p1, v4}, Lio/sentry/android/core/n0;->p(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object p1

    .line 878
    const-string v4, "name is required."

    .line 879
    .line 880
    invoke-static {p1, v4}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 881
    .line 882
    .line 883
    iput-object p1, v0, Lio/sentry/protocol/u;->a:Ljava/lang/String;

    .line 884
    .line 885
    const-string p1, "io.sentry.sdk.version"

    .line 886
    .line 887
    invoke-virtual {v0}, Lio/sentry/protocol/u;->b()Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v4

    .line 891
    invoke-static {p0, v2, p1, v4}, Lio/sentry/android/core/n0;->p(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 892
    .line 893
    .line 894
    move-result-object p1

    .line 895
    const-string v4, "version is required."

    .line 896
    .line 897
    invoke-static {p1, v4}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 898
    .line 899
    .line 900
    iput-object p1, v0, Lio/sentry/protocol/u;->b:Ljava/lang/String;

    .line 901
    .line 902
    invoke-virtual {p2, v0}, Lio/sentry/m6;->setSdkVersion(Lio/sentry/protocol/u;)V

    .line 903
    .line 904
    .line 905
    const-string p1, "io.sentry.send-default-pii"

    .line 906
    .line 907
    invoke-virtual {p2}, Lio/sentry/m6;->isSendDefaultPii()Z

    .line 908
    .line 909
    .line 910
    move-result v0

    .line 911
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 912
    .line 913
    .line 914
    move-result p1

    .line 915
    invoke-virtual {p2, p1}, Lio/sentry/m6;->setSendDefaultPii(Z)V

    .line 916
    .line 917
    .line 918
    const-string p1, "io.sentry.gradle-plugin-integrations"

    .line 919
    .line 920
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/n0;->m(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 921
    .line 922
    .line 923
    move-result-object p1

    .line 924
    if-eqz p1, :cond_11

    .line 925
    .line 926
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 927
    .line 928
    .line 929
    move-result-object p1

    .line 930
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 931
    .line 932
    .line 933
    move-result v0

    .line 934
    if-eqz v0, :cond_11

    .line 935
    .line 936
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    check-cast v0, Ljava/lang/String;

    .line 941
    .line 942
    invoke-static {}, Lio/sentry/k5;->d()Lio/sentry/k5;

    .line 943
    .line 944
    .line 945
    move-result-object v4

    .line 946
    invoke-virtual {v4, v0}, Lio/sentry/k5;->a(Ljava/lang/String;)V

    .line 947
    .line 948
    .line 949
    goto :goto_6

    .line 950
    :cond_11
    const-string p1, "io.sentry.enable-root-check"

    .line 951
    .line 952
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableRootCheck()Z

    .line 953
    .line 954
    .line 955
    move-result v0

    .line 956
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 957
    .line 958
    .line 959
    move-result p1

    .line 960
    invoke-virtual {p2, p1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableRootCheck(Z)V

    .line 961
    .line 962
    .line 963
    const-string p1, "io.sentry.send-modules"

    .line 964
    .line 965
    invoke-virtual {p2}, Lio/sentry/m6;->isSendModules()Z

    .line 966
    .line 967
    .line 968
    move-result v0

    .line 969
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 970
    .line 971
    .line 972
    move-result p1

    .line 973
    invoke-virtual {p2, p1}, Lio/sentry/m6;->setSendModules(Z)V

    .line 974
    .line 975
    .line 976
    const-string p1, "io.sentry.performance-v2.enable"

    .line 977
    .line 978
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnablePerformanceV2()Z

    .line 979
    .line 980
    .line 981
    move-result v0

    .line 982
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 983
    .line 984
    .line 985
    move-result p1

    .line 986
    invoke-virtual {p2, p1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnablePerformanceV2(Z)V

    .line 987
    .line 988
    .line 989
    const-string p1, "io.sentry.standalone-app-start-tracing.enable"

    .line 990
    .line 991
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableStandaloneAppStartTracing()Z

    .line 992
    .line 993
    .line 994
    move-result v0

    .line 995
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 996
    .line 997
    .line 998
    move-result p1

    .line 999
    invoke-virtual {p2, p1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableStandaloneAppStartTracing(Z)V

    .line 1000
    .line 1001
    .line 1002
    const-string p1, "io.sentry.profiling.enable-app-start"

    .line 1003
    .line 1004
    invoke-virtual {p2}, Lio/sentry/m6;->isEnableAppStartProfiling()Z

    .line 1005
    .line 1006
    .line 1007
    move-result v0

    .line 1008
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1009
    .line 1010
    .line 1011
    move-result p1

    .line 1012
    invoke-virtual {p2, p1}, Lio/sentry/m6;->setEnableAppStartProfiling(Z)V

    .line 1013
    .line 1014
    .line 1015
    const-string p1, "io.sentry.enable-scope-persistence"

    .line 1016
    .line 1017
    invoke-virtual {p2}, Lio/sentry/m6;->isEnableScopePersistence()Z

    .line 1018
    .line 1019
    .line 1020
    move-result v0

    .line 1021
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1022
    .line 1023
    .line 1024
    move-result p1

    .line 1025
    invoke-virtual {p2, p1}, Lio/sentry/m6;->setEnableScopePersistence(Z)V

    .line 1026
    .line 1027
    .line 1028
    const-string p1, "io.sentry.traces.enable-auto-id-generation"

    .line 1029
    .line 1030
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAutoTraceIdGeneration()Z

    .line 1031
    .line 1032
    .line 1033
    move-result v0

    .line 1034
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1035
    .line 1036
    .line 1037
    move-result p1

    .line 1038
    invoke-virtual {p2, p1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAutoTraceIdGeneration(Z)V

    .line 1039
    .line 1040
    .line 1041
    const-string p1, "io.sentry.traces.deadline-timeout"

    .line 1042
    .line 1043
    invoke-virtual {p2}, Lio/sentry/m6;->getDeadlineTimeout()J

    .line 1044
    .line 1045
    .line 1046
    move-result-wide v8

    .line 1047
    invoke-static {p0, v2, p1, v8, v9}, Lio/sentry/android/core/n0;->n(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J

    .line 1048
    .line 1049
    .line 1050
    move-result-wide v8

    .line 1051
    invoke-virtual {p2, v8, v9}, Lio/sentry/m6;->setDeadlineTimeout(J)V

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1055
    .line 1056
    .line 1057
    move-result-object p1

    .line 1058
    invoke-virtual {p1}, Lio/sentry/q6;->x()Ljava/lang/Double;

    .line 1059
    .line 1060
    .line 1061
    move-result-object p1

    .line 1062
    if-nez p1, :cond_12

    .line 1063
    .line 1064
    const-string p1, "io.sentry.session-replay.session-sample-rate"

    .line 1065
    .line 1066
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/n0;->l(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    .line 1067
    .line 1068
    .line 1069
    move-result-wide v8

    .line 1070
    cmpl-double p1, v8, v5

    .line 1071
    .line 1072
    if-eqz p1, :cond_12

    .line 1073
    .line 1074
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1075
    .line 1076
    .line 1077
    move-result-object p1

    .line 1078
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v0

    .line 1082
    invoke-virtual {p1, v0}, Lio/sentry/q6;->I(Ljava/lang/Double;)V

    .line 1083
    .line 1084
    .line 1085
    :cond_12
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1086
    .line 1087
    .line 1088
    move-result-object p1

    .line 1089
    invoke-virtual {p1}, Lio/sentry/q6;->w()Ljava/lang/Double;

    .line 1090
    .line 1091
    .line 1092
    move-result-object p1

    .line 1093
    if-nez p1, :cond_13

    .line 1094
    .line 1095
    const-string p1, "io.sentry.session-replay.on-error-sample-rate"

    .line 1096
    .line 1097
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/n0;->l(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    .line 1098
    .line 1099
    .line 1100
    move-result-wide v8

    .line 1101
    cmpl-double p1, v8, v5

    .line 1102
    .line 1103
    if-eqz p1, :cond_13

    .line 1104
    .line 1105
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1106
    .line 1107
    .line 1108
    move-result-object p1

    .line 1109
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v0

    .line 1113
    invoke-virtual {p1, v0}, Lio/sentry/q6;->H(Ljava/lang/Double;)V

    .line 1114
    .line 1115
    .line 1116
    :cond_13
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1117
    .line 1118
    .line 1119
    move-result-object p1

    .line 1120
    const-string v0, "io.sentry.session-replay.mask-all-text"

    .line 1121
    .line 1122
    invoke-static {p0, v2, v0, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1123
    .line 1124
    .line 1125
    move-result v0

    .line 1126
    invoke-virtual {p1, v0}, Lio/sentry/q6;->p(Z)V

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1130
    .line 1131
    .line 1132
    move-result-object p1

    .line 1133
    const-string v0, "io.sentry.session-replay.mask-all-images"

    .line 1134
    .line 1135
    invoke-static {p0, v2, v0, v7}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1136
    .line 1137
    .line 1138
    move-result v0

    .line 1139
    invoke-virtual {p1, v0}, Lio/sentry/q6;->o(Z)V

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1143
    .line 1144
    .line 1145
    move-result-object p1

    .line 1146
    const-string v0, "io.sentry.session-replay.debug"

    .line 1147
    .line 1148
    invoke-static {p0, v2, v0, v3}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1149
    .line 1150
    .line 1151
    move-result v0

    .line 1152
    invoke-virtual {p1, v0}, Lio/sentry/q6;->B(Z)V

    .line 1153
    .line 1154
    .line 1155
    const-string p1, "io.sentry.session-replay.screenshot-strategy"

    .line 1156
    .line 1157
    invoke-static {p0, v2, p1, v1}, Lio/sentry/android/core/n0;->o(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1158
    .line 1159
    .line 1160
    move-result-object p1

    .line 1161
    if-eqz p1, :cond_15

    .line 1162
    .line 1163
    const-string v0, "canvas"

    .line 1164
    .line 1165
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1166
    .line 1167
    invoke-virtual {p1, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1168
    .line 1169
    .line 1170
    move-result-object p1

    .line 1171
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1172
    .line 1173
    .line 1174
    move-result p1

    .line 1175
    if-eqz p1, :cond_14

    .line 1176
    .line 1177
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1178
    .line 1179
    .line 1180
    move-result-object p1

    .line 1181
    sget-object v0, Lio/sentry/i4;->CANVAS:Lio/sentry/i4;

    .line 1182
    .line 1183
    iput-object v0, p1, Lio/sentry/q6;->n:Lio/sentry/i4;

    .line 1184
    .line 1185
    goto :goto_7

    .line 1186
    :cond_14
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1187
    .line 1188
    .line 1189
    move-result-object p1

    .line 1190
    sget-object v0, Lio/sentry/i4;->PIXEL_COPY:Lio/sentry/i4;

    .line 1191
    .line 1192
    iput-object v0, p1, Lio/sentry/q6;->n:Lio/sentry/i4;

    .line 1193
    .line 1194
    :cond_15
    :goto_7
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1195
    .line 1196
    .line 1197
    move-result-object p1

    .line 1198
    const-string v0, "io.sentry.session-replay.capture-surface-views"

    .line 1199
    .line 1200
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v4

    .line 1204
    invoke-virtual {v4}, Lio/sentry/q6;->y()Z

    .line 1205
    .line 1206
    .line 1207
    move-result v4

    .line 1208
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1209
    .line 1210
    .line 1211
    move-result v0

    .line 1212
    invoke-virtual {p1, v0}, Lio/sentry/q6;->A(Z)V

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1216
    .line 1217
    .line 1218
    move-result-object p1

    .line 1219
    invoke-virtual {p1}, Lio/sentry/q6;->s()Ljava/util/List;

    .line 1220
    .line 1221
    .line 1222
    move-result-object p1

    .line 1223
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1224
    .line 1225
    .line 1226
    move-result p1

    .line 1227
    if-eqz p1, :cond_18

    .line 1228
    .line 1229
    const-string p1, "io.sentry.session-replay.network-detail-allow-urls"

    .line 1230
    .line 1231
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/n0;->m(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 1232
    .line 1233
    .line 1234
    move-result-object p1

    .line 1235
    if-eqz p1, :cond_18

    .line 1236
    .line 1237
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1238
    .line 1239
    .line 1240
    move-result v0

    .line 1241
    if-nez v0, :cond_18

    .line 1242
    .line 1243
    new-instance v0, Ljava/util/ArrayList;

    .line 1244
    .line 1245
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1246
    .line 1247
    .line 1248
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1249
    .line 1250
    .line 1251
    move-result-object p1

    .line 1252
    :cond_16
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1253
    .line 1254
    .line 1255
    move-result v4

    .line 1256
    if-eqz v4, :cond_17

    .line 1257
    .line 1258
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v4

    .line 1262
    check-cast v4, Ljava/lang/String;

    .line 1263
    .line 1264
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v4

    .line 1268
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 1269
    .line 1270
    .line 1271
    move-result v7

    .line 1272
    if-nez v7, :cond_16

    .line 1273
    .line 1274
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1275
    .line 1276
    .line 1277
    goto :goto_8

    .line 1278
    :cond_17
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1279
    .line 1280
    .line 1281
    move-result p1

    .line 1282
    if-nez p1, :cond_18

    .line 1283
    .line 1284
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1285
    .line 1286
    .line 1287
    move-result-object p1

    .line 1288
    invoke-virtual {p1, v0}, Lio/sentry/q6;->D(Ljava/util/ArrayList;)V

    .line 1289
    .line 1290
    .line 1291
    :cond_18
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1292
    .line 1293
    .line 1294
    move-result-object p1

    .line 1295
    invoke-virtual {p1}, Lio/sentry/q6;->t()Ljava/util/List;

    .line 1296
    .line 1297
    .line 1298
    move-result-object p1

    .line 1299
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1300
    .line 1301
    .line 1302
    move-result p1

    .line 1303
    if-eqz p1, :cond_1b

    .line 1304
    .line 1305
    const-string p1, "io.sentry.session-replay.network-detail-deny-urls"

    .line 1306
    .line 1307
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/n0;->m(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 1308
    .line 1309
    .line 1310
    move-result-object p1

    .line 1311
    if-eqz p1, :cond_1b

    .line 1312
    .line 1313
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1314
    .line 1315
    .line 1316
    move-result v0

    .line 1317
    if-nez v0, :cond_1b

    .line 1318
    .line 1319
    new-instance v0, Ljava/util/ArrayList;

    .line 1320
    .line 1321
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1322
    .line 1323
    .line 1324
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1325
    .line 1326
    .line 1327
    move-result-object p1

    .line 1328
    :cond_19
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1329
    .line 1330
    .line 1331
    move-result v4

    .line 1332
    if-eqz v4, :cond_1a

    .line 1333
    .line 1334
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v4

    .line 1338
    check-cast v4, Ljava/lang/String;

    .line 1339
    .line 1340
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v4

    .line 1344
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 1345
    .line 1346
    .line 1347
    move-result v7

    .line 1348
    if-nez v7, :cond_19

    .line 1349
    .line 1350
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1351
    .line 1352
    .line 1353
    goto :goto_9

    .line 1354
    :cond_1a
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1355
    .line 1356
    .line 1357
    move-result p1

    .line 1358
    if-nez p1, :cond_1b

    .line 1359
    .line 1360
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1361
    .line 1362
    .line 1363
    move-result-object p1

    .line 1364
    invoke-virtual {p1, v0}, Lio/sentry/q6;->E(Ljava/util/ArrayList;)V

    .line 1365
    .line 1366
    .line 1367
    :cond_1b
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1368
    .line 1369
    .line 1370
    move-result-object p1

    .line 1371
    const-string v0, "io.sentry.session-replay.network-capture-bodies"

    .line 1372
    .line 1373
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v4

    .line 1377
    invoke-virtual {v4}, Lio/sentry/q6;->z()Z

    .line 1378
    .line 1379
    .line 1380
    move-result v4

    .line 1381
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1382
    .line 1383
    .line 1384
    move-result v0

    .line 1385
    invoke-virtual {p1, v0}, Lio/sentry/q6;->C(Z)V

    .line 1386
    .line 1387
    .line 1388
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1389
    .line 1390
    .line 1391
    move-result-object p1

    .line 1392
    invoke-virtual {p1}, Lio/sentry/q6;->u()Ljava/util/List;

    .line 1393
    .line 1394
    .line 1395
    move-result-object p1

    .line 1396
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 1397
    .line 1398
    .line 1399
    move-result p1

    .line 1400
    sget-object v0, Lio/sentry/q6;->u:Ljava/util/List;

    .line 1401
    .line 1402
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1403
    .line 1404
    .line 1405
    move-result v0

    .line 1406
    if-ne p1, v0, :cond_1e

    .line 1407
    .line 1408
    const-string p1, "io.sentry.session-replay.network-request-headers"

    .line 1409
    .line 1410
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/n0;->m(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 1411
    .line 1412
    .line 1413
    move-result-object p1

    .line 1414
    if-eqz p1, :cond_1e

    .line 1415
    .line 1416
    new-instance v0, Ljava/util/ArrayList;

    .line 1417
    .line 1418
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1419
    .line 1420
    .line 1421
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1422
    .line 1423
    .line 1424
    move-result-object p1

    .line 1425
    :cond_1c
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1426
    .line 1427
    .line 1428
    move-result v4

    .line 1429
    if-eqz v4, :cond_1d

    .line 1430
    .line 1431
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v4

    .line 1435
    check-cast v4, Ljava/lang/String;

    .line 1436
    .line 1437
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v4

    .line 1441
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 1442
    .line 1443
    .line 1444
    move-result v7

    .line 1445
    if-nez v7, :cond_1c

    .line 1446
    .line 1447
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1448
    .line 1449
    .line 1450
    goto :goto_a

    .line 1451
    :cond_1d
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1452
    .line 1453
    .line 1454
    move-result p1

    .line 1455
    if-nez p1, :cond_1e

    .line 1456
    .line 1457
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1458
    .line 1459
    .line 1460
    move-result-object p1

    .line 1461
    invoke-virtual {p1, v0}, Lio/sentry/q6;->F(Ljava/util/ArrayList;)V

    .line 1462
    .line 1463
    .line 1464
    :cond_1e
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1465
    .line 1466
    .line 1467
    move-result-object p1

    .line 1468
    invoke-virtual {p1}, Lio/sentry/q6;->v()Ljava/util/List;

    .line 1469
    .line 1470
    .line 1471
    move-result-object p1

    .line 1472
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 1473
    .line 1474
    .line 1475
    move-result p1

    .line 1476
    sget-object v0, Lio/sentry/q6;->u:Ljava/util/List;

    .line 1477
    .line 1478
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1479
    .line 1480
    .line 1481
    move-result v0

    .line 1482
    if-ne p1, v0, :cond_21

    .line 1483
    .line 1484
    const-string p1, "io.sentry.session-replay.network-response-headers"

    .line 1485
    .line 1486
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/n0;->m(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 1487
    .line 1488
    .line 1489
    move-result-object p1

    .line 1490
    if-eqz p1, :cond_21

    .line 1491
    .line 1492
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1493
    .line 1494
    .line 1495
    move-result v0

    .line 1496
    if-nez v0, :cond_21

    .line 1497
    .line 1498
    new-instance v0, Ljava/util/ArrayList;

    .line 1499
    .line 1500
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1501
    .line 1502
    .line 1503
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1504
    .line 1505
    .line 1506
    move-result-object p1

    .line 1507
    :cond_1f
    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1508
    .line 1509
    .line 1510
    move-result v4

    .line 1511
    if-eqz v4, :cond_20

    .line 1512
    .line 1513
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v4

    .line 1517
    check-cast v4, Ljava/lang/String;

    .line 1518
    .line 1519
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v4

    .line 1523
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 1524
    .line 1525
    .line 1526
    move-result v7

    .line 1527
    if-nez v7, :cond_1f

    .line 1528
    .line 1529
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1530
    .line 1531
    .line 1532
    goto :goto_b

    .line 1533
    :cond_20
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1534
    .line 1535
    .line 1536
    move-result p1

    .line 1537
    if-nez p1, :cond_21

    .line 1538
    .line 1539
    invoke-virtual {p2}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 1540
    .line 1541
    .line 1542
    move-result-object p1

    .line 1543
    invoke-virtual {p1, v0}, Lio/sentry/q6;->G(Ljava/util/ArrayList;)V

    .line 1544
    .line 1545
    .line 1546
    :cond_21
    const-string p1, "io.sentry.ignored-errors"

    .line 1547
    .line 1548
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/n0;->m(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 1549
    .line 1550
    .line 1551
    move-result-object p1

    .line 1552
    invoke-virtual {p2, p1}, Lio/sentry/m6;->setIgnoredErrors(Ljava/util/List;)V

    .line 1553
    .line 1554
    .line 1555
    const-string p1, "io.sentry.in-app-includes"

    .line 1556
    .line 1557
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/n0;->m(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 1558
    .line 1559
    .line 1560
    move-result-object p1

    .line 1561
    if-eqz p1, :cond_22

    .line 1562
    .line 1563
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1564
    .line 1565
    .line 1566
    move-result v0

    .line 1567
    if-nez v0, :cond_22

    .line 1568
    .line 1569
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1570
    .line 1571
    .line 1572
    move-result-object p1

    .line 1573
    :goto_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1574
    .line 1575
    .line 1576
    move-result v0

    .line 1577
    if-eqz v0, :cond_22

    .line 1578
    .line 1579
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v0

    .line 1583
    check-cast v0, Ljava/lang/String;

    .line 1584
    .line 1585
    invoke-virtual {p2, v0}, Lio/sentry/m6;->addInAppInclude(Ljava/lang/String;)V

    .line 1586
    .line 1587
    .line 1588
    goto :goto_c

    .line 1589
    :cond_22
    const-string p1, "io.sentry.in-app-excludes"

    .line 1590
    .line 1591
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/n0;->m(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;

    .line 1592
    .line 1593
    .line 1594
    move-result-object p1

    .line 1595
    if-eqz p1, :cond_23

    .line 1596
    .line 1597
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1598
    .line 1599
    .line 1600
    move-result v0

    .line 1601
    if-nez v0, :cond_23

    .line 1602
    .line 1603
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1604
    .line 1605
    .line 1606
    move-result-object p1

    .line 1607
    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1608
    .line 1609
    .line 1610
    move-result v0

    .line 1611
    if-eqz v0, :cond_23

    .line 1612
    .line 1613
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v0

    .line 1617
    check-cast v0, Ljava/lang/String;

    .line 1618
    .line 1619
    invoke-virtual {p2, v0}, Lio/sentry/m6;->addInAppExclude(Ljava/lang/String;)V

    .line 1620
    .line 1621
    .line 1622
    goto :goto_d

    .line 1623
    :cond_23
    invoke-virtual {p2}, Lio/sentry/m6;->getLogs()Lio/sentry/e6;

    .line 1624
    .line 1625
    .line 1626
    move-result-object p1

    .line 1627
    const-string v0, "io.sentry.logs.enabled"

    .line 1628
    .line 1629
    invoke-virtual {p2}, Lio/sentry/m6;->getLogs()Lio/sentry/e6;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v4

    .line 1633
    invoke-virtual {v4}, Lio/sentry/e6;->a()Z

    .line 1634
    .line 1635
    .line 1636
    move-result v4

    .line 1637
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1638
    .line 1639
    .line 1640
    move-result v0

    .line 1641
    invoke-virtual {p1, v0}, Lio/sentry/e6;->b(Z)V

    .line 1642
    .line 1643
    .line 1644
    invoke-virtual {p2}, Lio/sentry/m6;->getMetrics()Lio/sentry/f6;

    .line 1645
    .line 1646
    .line 1647
    move-result-object p1

    .line 1648
    const-string v0, "io.sentry.metrics.enabled"

    .line 1649
    .line 1650
    invoke-virtual {p2}, Lio/sentry/m6;->getMetrics()Lio/sentry/f6;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v4

    .line 1654
    invoke-virtual {v4}, Lio/sentry/f6;->a()Z

    .line 1655
    .line 1656
    .line 1657
    move-result v4

    .line 1658
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1659
    .line 1660
    .line 1661
    move-result v0

    .line 1662
    invoke-virtual {p1, v0}, Lio/sentry/f6;->b(Z)V

    .line 1663
    .line 1664
    .line 1665
    invoke-virtual {p2}, Lio/sentry/m6;->getFeedbackOptions()Lio/sentry/h5;

    .line 1666
    .line 1667
    .line 1668
    move-result-object p1

    .line 1669
    const-string v0, "io.sentry.feedback.is-name-required"

    .line 1670
    .line 1671
    invoke-virtual {p1}, Lio/sentry/h5;->b()Z

    .line 1672
    .line 1673
    .line 1674
    move-result v4

    .line 1675
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1676
    .line 1677
    .line 1678
    move-result v0

    .line 1679
    invoke-virtual {p1, v0}, Lio/sentry/h5;->i(Z)V

    .line 1680
    .line 1681
    .line 1682
    const-string v0, "io.sentry.feedback.show-name"

    .line 1683
    .line 1684
    invoke-virtual {p1}, Lio/sentry/h5;->e()Z

    .line 1685
    .line 1686
    .line 1687
    move-result v4

    .line 1688
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1689
    .line 1690
    .line 1691
    move-result v0

    .line 1692
    invoke-virtual {p1, v0}, Lio/sentry/h5;->l(Z)V

    .line 1693
    .line 1694
    .line 1695
    const-string v0, "io.sentry.feedback.is-email-required"

    .line 1696
    .line 1697
    invoke-virtual {p1}, Lio/sentry/h5;->a()Z

    .line 1698
    .line 1699
    .line 1700
    move-result v4

    .line 1701
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1702
    .line 1703
    .line 1704
    move-result v0

    .line 1705
    invoke-virtual {p1, v0}, Lio/sentry/h5;->h(Z)V

    .line 1706
    .line 1707
    .line 1708
    const-string v0, "io.sentry.feedback.show-email"

    .line 1709
    .line 1710
    invoke-virtual {p1}, Lio/sentry/h5;->d()Z

    .line 1711
    .line 1712
    .line 1713
    move-result v4

    .line 1714
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1715
    .line 1716
    .line 1717
    move-result v0

    .line 1718
    invoke-virtual {p1, v0}, Lio/sentry/h5;->k(Z)V

    .line 1719
    .line 1720
    .line 1721
    const-string v0, "io.sentry.feedback.use-sentry-user"

    .line 1722
    .line 1723
    invoke-virtual {p1}, Lio/sentry/h5;->f()Z

    .line 1724
    .line 1725
    .line 1726
    move-result v4

    .line 1727
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1728
    .line 1729
    .line 1730
    move-result v0

    .line 1731
    invoke-virtual {p1, v0}, Lio/sentry/h5;->m(Z)V

    .line 1732
    .line 1733
    .line 1734
    const-string v0, "io.sentry.feedback.show-branding"

    .line 1735
    .line 1736
    invoke-virtual {p1}, Lio/sentry/h5;->c()Z

    .line 1737
    .line 1738
    .line 1739
    move-result v4

    .line 1740
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1741
    .line 1742
    .line 1743
    move-result v0

    .line 1744
    invoke-virtual {p1, v0}, Lio/sentry/h5;->j(Z)V

    .line 1745
    .line 1746
    .line 1747
    const-string v0, "io.sentry.feedback.use-shake-gesture"

    .line 1748
    .line 1749
    invoke-virtual {p1}, Lio/sentry/h5;->g()Z

    .line 1750
    .line 1751
    .line 1752
    move-result v4

    .line 1753
    invoke-static {p0, v2, v0, v4}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1754
    .line 1755
    .line 1756
    move-result v0

    .line 1757
    invoke-virtual {p1, v0}, Lio/sentry/h5;->n(Z)V

    .line 1758
    .line 1759
    .line 1760
    const-string p1, "io.sentry.strict-trace-continuation.enabled"

    .line 1761
    .line 1762
    invoke-virtual {p2}, Lio/sentry/m6;->isStrictTraceContinuation()Z

    .line 1763
    .line 1764
    .line 1765
    move-result v0

    .line 1766
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1767
    .line 1768
    .line 1769
    move-result p1

    .line 1770
    invoke-virtual {p2, p1}, Lio/sentry/m6;->setStrictTraceContinuation(Z)V

    .line 1771
    .line 1772
    .line 1773
    const-string p1, "io.sentry.org-id"

    .line 1774
    .line 1775
    invoke-static {p0, v2, p1, v1}, Lio/sentry/android/core/n0;->o(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1776
    .line 1777
    .line 1778
    move-result-object p1

    .line 1779
    if-eqz p1, :cond_24

    .line 1780
    .line 1781
    invoke-virtual {p2, p1}, Lio/sentry/m6;->setOrgId(Ljava/lang/String;)V

    .line 1782
    .line 1783
    .line 1784
    :cond_24
    const-string p1, "io.sentry.spotlight.enable"

    .line 1785
    .line 1786
    invoke-virtual {p2}, Lio/sentry/m6;->isEnableSpotlight()Z

    .line 1787
    .line 1788
    .line 1789
    move-result v0

    .line 1790
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1791
    .line 1792
    .line 1793
    move-result p1

    .line 1794
    invoke-virtual {p2, p1}, Lio/sentry/m6;->setEnableSpotlight(Z)V

    .line 1795
    .line 1796
    .line 1797
    const-string p1, "io.sentry.spotlight.url"

    .line 1798
    .line 1799
    invoke-static {p0, v2, p1, v1}, Lio/sentry/android/core/n0;->o(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1800
    .line 1801
    .line 1802
    move-result-object p1

    .line 1803
    if-eqz p1, :cond_25

    .line 1804
    .line 1805
    invoke-virtual {p2, p1}, Lio/sentry/m6;->setSpotlightConnectionUrl(Ljava/lang/String;)V

    .line 1806
    .line 1807
    .line 1808
    :cond_25
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->getScreenshot()Lio/sentry/android/core/l1;

    .line 1809
    .line 1810
    .line 1811
    move-result-object p1

    .line 1812
    const-string v0, "io.sentry.screenshot.mask-all-text"

    .line 1813
    .line 1814
    invoke-static {p0, v2, v0, v3}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1815
    .line 1816
    .line 1817
    move-result v0

    .line 1818
    invoke-virtual {p1, v0}, Lta;->p(Z)V

    .line 1819
    .line 1820
    .line 1821
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->getScreenshot()Lio/sentry/android/core/l1;

    .line 1822
    .line 1823
    .line 1824
    move-result-object p1

    .line 1825
    const-string v0, "io.sentry.screenshot.mask-all-images"

    .line 1826
    .line 1827
    invoke-static {p0, v2, v0, v3}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1828
    .line 1829
    .line 1830
    move-result v0

    .line 1831
    invoke-virtual {p1, v0}, Lio/sentry/android/core/l1;->o(Z)V

    .line 1832
    .line 1833
    .line 1834
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->getAnrProfilingSampleRate()Ljava/lang/Double;

    .line 1835
    .line 1836
    .line 1837
    move-result-object p1

    .line 1838
    if-nez p1, :cond_26

    .line 1839
    .line 1840
    const-string p1, "io.sentry.anr.profiling.sample-rate"

    .line 1841
    .line 1842
    invoke-static {p0, v2, p1}, Lio/sentry/android/core/n0;->l(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D

    .line 1843
    .line 1844
    .line 1845
    move-result-wide v0

    .line 1846
    cmpl-double p1, v0, v5

    .line 1847
    .line 1848
    if-eqz p1, :cond_26

    .line 1849
    .line 1850
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1851
    .line 1852
    .line 1853
    move-result-object p1

    .line 1854
    invoke-virtual {p2, p1}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrProfilingSampleRate(Ljava/lang/Double;)V

    .line 1855
    .line 1856
    .line 1857
    :cond_26
    const-string p1, "io.sentry.anr.enable-fingerprinting"

    .line 1858
    .line 1859
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAnrFingerprinting()Z

    .line 1860
    .line 1861
    .line 1862
    move-result v0

    .line 1863
    invoke-static {p0, v2, p1, v0}, Lio/sentry/android/core/n0;->k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 1864
    .line 1865
    .line 1866
    move-result p0

    .line 1867
    invoke-virtual {p2, p0}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAnrFingerprinting(Z)V

    .line 1868
    .line 1869
    .line 1870
    :cond_27
    invoke-virtual {p2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1871
    .line 1872
    .line 1873
    move-result-object p0

    .line 1874
    sget-object p1, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 1875
    .line 1876
    const-string v0, "Retrieving configuration from AndroidManifest.xml"

    .line 1877
    .line 1878
    new-array v1, v3, [Ljava/lang/Object;

    .line 1879
    .line 1880
    invoke-interface {p0, p1, v0, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1881
    .line 1882
    .line 1883
    return-void

    .line 1884
    :goto_e
    invoke-virtual {p2}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 1885
    .line 1886
    .line 1887
    move-result-object p1

    .line 1888
    sget-object p2, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1889
    .line 1890
    const-string v0, "Failed to read configuration from android manifest metadata."

    .line 1891
    .line 1892
    invoke-interface {p1, p2, v0, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1893
    .line 1894
    .line 1895
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 1
    sget-object v0, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, p1, v1}, Lio/sentry/android/core/n0;->a(Ljava/lang/String;Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lio/sentry/q5;->ERROR:Lio/sentry/q5;

    .line 8
    .line 9
    invoke-static {v0, p1, v1}, Lio/sentry/android/core/n0;->b(Lio/sentry/q5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 2
    .line 3
    invoke-static {p0, v0, p1, p2}, Lio/sentry/android/core/n0;->a(Ljava/lang/String;Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lio/sentry/q5;->ERROR:Lio/sentry/q5;

    .line 7
    .line 8
    invoke-static {v0, p1, p2}, Lio/sentry/android/core/n0;->b(Lio/sentry/q5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public static f(Lio/sentry/ILogger;)Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, " "

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    aget-object p0, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    sget-object v1, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 16
    .line 17
    const-string v2, "Error getting device family."

    .line 18
    .line 19
    invoke-interface {p0, v1, v2, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public static g(Landroid/content/Context;Lio/sentry/ILogger;)Landroid/app/ActivityManager$MemoryInfo;
    .locals 3

    .line 1
    const-string v0, "Error getting MemoryInfo."

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    const-string v2, "activity"

    .line 5
    .line 6
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Landroid/app/ActivityManager;

    .line 11
    .line 12
    new-instance v2, Landroid/app/ActivityManager$MemoryInfo;

    .line 13
    .line 14
    invoke-direct {v2}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 15
    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object p0, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    new-array v2, v2, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-interface {p1, p0, v0, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :goto_0
    sget-object v2, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 35
    .line 36
    invoke-interface {p1, v2, v0, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    return-object v1
.end method

.method public static h(Landroid/content/Context;Lio/sentry/android/core/o0;)Landroid/content/pm/PackageInfo;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v0, 0x21

    .line 7
    .line 8
    if-lt p1, v0, :cond_0

    .line 9
    .line 10
    sget-object p1, Lio/sentry/android/core/n0;->a:Las0;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Las0;->c(Landroid/content/Context;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Landroid/content/pm/PackageInfo;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    sget-object p1, Lio/sentry/android/core/n0;->b:Las0;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Las0;->c(Landroid/content/Context;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Landroid/content/pm/PackageInfo;

    .line 26
    .line 27
    return-object p0
.end method

.method public static i(Landroid/content/pm/PackageInfo;Lio/sentry/android/core/o0;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v0, 0x1c

    .line 7
    .line 8
    if-lt p1, v0, :cond_0

    .line 9
    .line 10
    invoke-static {p0}, Lrt1;->b(Landroid/content/pm/PackageInfo;)J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    invoke-static {p0, p1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 20
    .line 21
    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static j()Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 3
    .line 4
    invoke-direct {v1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 8
    .line 9
    .line 10
    iget v1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    const/16 v2, 0x64

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    :catchall_0
    :cond_0
    return v0
.end method

.method public static k(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    sget-object p3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p2, " read: "

    .line 16
    .line 17
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const/4 v0, 0x0

    .line 28
    new-array v0, v0, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-interface {p1, p3, p2, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return p0
.end method

.method public static l(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)D
    .locals 4

    .line 1
    const/high16 v0, -0x40800000    # -1.0f

    .line 2
    .line 3
    invoke-virtual {p0, p2, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Float;->doubleValue()D

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    .line 16
    .line 17
    cmpl-double v2, v0, v2

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    const/4 v0, -0x1

    .line 22
    invoke-virtual {p0, p2, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Integer;->doubleValue()D

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    :cond_0
    sget-object p0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 35
    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p2, " read: "

    .line 45
    .line 46
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    const/4 v2, 0x0

    .line 57
    new-array v2, v2, [Ljava/lang/Object;

    .line 58
    .line 59
    invoke-interface {p1, p0, p2, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-wide v0
.end method

.method public static m(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 6
    .line 7
    const-string v1, " read: "

    .line 8
    .line 9
    invoke-static {p2, v1, p0}, Len;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    const/4 v1, 0x0

    .line 14
    new-array v1, v1, [Ljava/lang/Object;

    .line 15
    .line 16
    invoke-interface {p1, v0, p2, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const-string p1, ","

    .line 22
    .line 23
    const/4 p2, -0x1

    .line 24
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public static n(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;J)J
    .locals 1

    .line 1
    long-to-int p3, p3

    .line 2
    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    int-to-long p3, p0

    .line 7
    sget-object p0, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p2, " read: "

    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    const/4 v0, 0x0

    .line 30
    new-array v0, v0, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-interface {p1, p0, p2, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-wide p3
.end method

.method public static o(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 6
    .line 7
    const-string v0, " read: "

    .line 8
    .line 9
    invoke-static {p2, v0, p0}, Len;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    const/4 v0, 0x0

    .line 14
    new-array v0, v0, [Ljava/lang/Object;

    .line 15
    .line 16
    invoke-interface {p1, p3, p2, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public static p(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 6
    .line 7
    const-string v0, " read: "

    .line 8
    .line 9
    invoke-static {p2, v0, p0}, Len;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    const/4 v0, 0x0

    .line 14
    new-array v0, v0, [Ljava/lang/Object;

    .line 15
    .line 16
    invoke-interface {p1, p3, p2, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public static q(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 1
    sget-object v0, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, p1, v1}, Lio/sentry/android/core/n0;->a(Ljava/lang/String;Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lio/sentry/q5;->WARN:Lio/sentry/q5;

    .line 8
    .line 9
    invoke-static {v0, p1, v1}, Lio/sentry/android/core/n0;->b(Lio/sentry/q5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public static r(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    sget-object v0, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1, p1}, Lio/sentry/android/core/n0;->a(Ljava/lang/String;Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 5
    .line 6
    .line 7
    sget-object p0, Lio/sentry/q5;->WARN:Lio/sentry/q5;

    .line 8
    .line 9
    invoke-static {p0, v1, p1}, Lio/sentry/android/core/n0;->b(Lio/sentry/q5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 2
    .line 3
    invoke-static {p0, v0, p1, p2}, Lio/sentry/android/core/n0;->a(Ljava/lang/String;Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lio/sentry/q5;->WARN:Lio/sentry/q5;

    .line 7
    .line 8
    invoke-static {p0, p1, p2}, Lio/sentry/android/core/n0;->b(Lio/sentry/q5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static t(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, p1, v1}, Lio/sentry/android/core/n0;->a(Ljava/lang/String;Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lio/sentry/q5;->FATAL:Lio/sentry/q5;

    .line 8
    .line 9
    invoke-static {v0, p1, v1}, Lio/sentry/android/core/n0;->b(Lio/sentry/q5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 2
    .line 3
    invoke-static {p0, v0, p1, p2}, Lio/sentry/android/core/n0;->a(Ljava/lang/String;Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lio/sentry/q5;->FATAL:Lio/sentry/q5;

    .line 7
    .line 8
    invoke-static {v0, p1, p2}, Lio/sentry/android/core/n0;->b(Lio/sentry/q5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1, p2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 12
    .line 13
    .line 14
    return-void
.end method

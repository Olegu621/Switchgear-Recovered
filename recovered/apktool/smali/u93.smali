.class public final Lu93;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/f1;
.implements Lei;


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ltz1;Lwe2;)V
    .locals 0

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu93;->b:Ljava/lang/Object;

    iput-object p2, p0, Lu93;->c:Ljava/lang/Object;

    iput-object p3, p0, Lu93;->d:Ljava/lang/Object;

    new-instance p1, Lgi3;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lgi3;-><init>(Lu93;Z)V

    iput-object p1, p0, Lu93;->e:Ljava/lang/Object;

    new-instance p1, Lgi3;

    const/4 p2, 0x0

    .line 195
    invoke-direct {p1, p0, p2}, Lgi3;-><init>(Lu93;Z)V

    iput-object p1, p0, Lu93;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/sentry/r4;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lu93;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p1, p0, Lu93;->b:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lu93;->a:Z

    .line 15
    .line 16
    invoke-virtual {p1}, Lio/sentry/m6;->getTransportFactory()Lio/sentry/o1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    instance-of v1, v0, Lio/sentry/g3;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    new-instance v0, Lio/sentry/l2;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lio/sentry/m6;->setTransportFactory(Lio/sentry/o1;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p1}, Lio/sentry/m6;->retrieveParsedDsn()Lio/sentry/z;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p1}, Lio/sentry/m6;->getSentryClientName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v3, v1, Lio/sentry/z;->c:Ljava/net/URI;

    .line 41
    .line 42
    new-instance v4, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/net/URI;->getPath()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v5, "/envelope/"

    .line 55
    .line 56
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v3, v4}, Ljava/net/URI;->resolve(Ljava/lang/String;)Ljava/net/URI;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    iget-object v4, v1, Lio/sentry/z;->b:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v1, v1, Lio/sentry/z;->a:Ljava/lang/String;

    .line 74
    .line 75
    new-instance v5, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v6, "Sentry sentry_version=7,sentry_client="

    .line 78
    .line 79
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v6, ",sentry_key="

    .line 86
    .line 87
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    if-eqz v1, :cond_1

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-lez v4, :cond_1

    .line 100
    .line 101
    const-string v4, ",sentry_secret="

    .line 102
    .line 103
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    goto :goto_0

    .line 108
    :cond_1
    const-string v1, ""

    .line 109
    .line 110
    :goto_0
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    new-instance v4, Ljava/util/HashMap;

    .line 118
    .line 119
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 120
    .line 121
    .line 122
    const-string v5, "User-Agent"

    .line 123
    .line 124
    invoke-virtual {v4, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    const-string v2, "X-Sentry-Auth"

    .line 128
    .line 129
    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    new-instance v1, Lio/sentry/internal/debugmeta/c;

    .line 133
    .line 134
    invoke-direct {v1, v3, v4}, Lio/sentry/internal/debugmeta/c;-><init>(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 135
    .line 136
    .line 137
    invoke-interface {v0, p1, v1}, Lio/sentry/o1;->o(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/internal/debugmeta/c;)Lio/sentry/transport/g;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iput-object v0, p0, Lu93;->c:Ljava/lang/Object;

    .line 142
    .line 143
    invoke-virtual {p1}, Lio/sentry/m6;->getLogs()Lio/sentry/e6;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iget-boolean v0, v0, Lio/sentry/e6;->a:Z

    .line 148
    .line 149
    if-eqz v0, :cond_2

    .line 150
    .line 151
    invoke-virtual {p1}, Lio/sentry/m6;->getLogs()Lio/sentry/e6;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget-object v0, v0, Lio/sentry/e6;->b:Lio/sentry/logger/c;

    .line 156
    .line 157
    invoke-interface {v0, p1, p0}, Lio/sentry/logger/c;->c(Lio/sentry/android/core/SentryAndroidOptions;Lu93;)Lio/sentry/logger/b;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iput-object v0, p0, Lu93;->e:Ljava/lang/Object;

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_2
    sget-object v0, Lio/sentry/logger/f;->b:Lio/sentry/logger/f;

    .line 165
    .line 166
    iput-object v0, p0, Lu93;->e:Ljava/lang/Object;

    .line 167
    .line 168
    :goto_1
    invoke-virtual {p1}, Lio/sentry/m6;->getMetrics()Lio/sentry/f6;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    iget-boolean v0, v0, Lio/sentry/f6;->a:Z

    .line 173
    .line 174
    if-eqz v0, :cond_3

    .line 175
    .line 176
    invoke-virtual {p1}, Lio/sentry/m6;->getMetrics()Lio/sentry/f6;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    iget-object v0, v0, Lio/sentry/f6;->b:Lio/sentry/metrics/b;

    .line 181
    .line 182
    invoke-interface {v0, p1, p0}, Lio/sentry/metrics/b;->c(Lio/sentry/android/core/SentryAndroidOptions;Lu93;)Lio/sentry/metrics/a;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    iput-object p1, p0, Lu93;->f:Ljava/lang/Object;

    .line 187
    .line 188
    return-void

    .line 189
    :cond_3
    sget-object p1, Lio/sentry/metrics/d;->a:Lio/sentry/metrics/d;

    .line 190
    .line 191
    iput-object p1, p0, Lu93;->f:Ljava/lang/Object;

    .line 192
    .line 193
    return-void
.end method

.method public constructor <init>(Ljn;Lgp;Ly92;)V
    .locals 4

    .line 197
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p3, 0x0

    .line 198
    iput-boolean p3, p0, Lu93;->a:Z

    .line 199
    new-instance p3, Ls93;

    invoke-direct {p3, p0}, Ls93;-><init>(Lu93;)V

    iput-object p3, p0, Lu93;->f:Ljava/lang/Object;

    .line 200
    iput-object p1, p0, Lu93;->b:Ljava/lang/Object;

    .line 201
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    if-lt p3, v0, :cond_0

    .line 202
    :try_start_0
    invoke-static {}, Lw0;->g()Landroid/hardware/camera2/CameraCharacteristics$Key;

    move-result-object p3

    invoke-virtual {p2, p3}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/util/Range;
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p3

    .line 203
    const-string v0, "ZoomControl"

    const-string v1, "AssertionError, fail to get camera characteristic."

    invoke-static {v0, v1, p3}, Lhu0;->I0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p3, 0x0

    :goto_0
    if-eqz p3, :cond_0

    .line 204
    new-instance p3, Lzr3;

    invoke-direct {p3, p2}, Lzr3;-><init>(Lgp;)V

    goto :goto_1

    .line 205
    :cond_0
    new-instance p3, Lgr0;

    invoke-direct {p3, p2}, Lgr0;-><init>(Ljava/lang/Object;)V

    .line 206
    :goto_1
    iput-object p3, p0, Lu93;->e:Ljava/lang/Object;

    .line 207
    new-instance p2, Lv93;

    invoke-interface {p3}, Lt93;->e()F

    move-result v0

    invoke-interface {p3}, Lt93;->h()F

    move-result p3

    invoke-direct {p2, v0, p3}, Lv93;-><init>(FF)V

    iput-object p2, p0, Lu93;->c:Ljava/lang/Object;

    .line 208
    invoke-virtual {p2}, Lv93;->e()V

    .line 209
    new-instance p3, Lrk1;

    .line 210
    new-instance v0, Lyf;

    invoke-virtual {p2}, Lv93;->d()F

    move-result v1

    .line 211
    invoke-virtual {p2}, Lv93;->b()F

    move-result v2

    .line 212
    invoke-virtual {p2}, Lv93;->c()F

    move-result v3

    invoke-virtual {p2}, Lv93;->a()F

    move-result p2

    invoke-direct {v0, v1, v2, v3, p2}, Lyf;-><init>(FFFF)V

    .line 213
    invoke-direct {p3, v0}, La91;-><init>(Ljava/lang/Object;)V

    .line 214
    iput-object p3, p0, Lu93;->d:Ljava/lang/Object;

    .line 215
    iget-object p0, p0, Lu93;->f:Ljava/lang/Object;

    check-cast p0, Ls93;

    invoke-virtual {p1, p0}, Ljn;->h(Lin;)V

    return-void
.end method

.method public constructor <init>(Lur0;Ld9;Lw9;)V
    .locals 0

    .line 196
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu93;->f:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lu93;->d:Ljava/lang/Object;

    iput-object p1, p0, Lu93;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lu93;->a:Z

    iput-object p2, p0, Lu93;->b:Ljava/lang/Object;

    iput-object p3, p0, Lu93;->c:Ljava/lang/Object;

    return-void
.end method

.method public static s(Lio/sentry/i0;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/i0;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lio/sentry/i0;->d:Lio/sentry/a;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Lio/sentry/i0;->e:Lio/sentry/a;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object v1, p0, Lio/sentry/i0;->f:Lio/sentry/a;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_2
    iget-object p0, p0, Lio/sentry/i0;->g:Lio/sentry/a;

    .line 30
    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :cond_3
    return-object v0
.end method


# virtual methods
.method public A(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu93;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lur0;

    .line 4
    .line 5
    iget-object v0, v0, Lur0;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    iget-object p0, p0, Lu93;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lw9;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lcb3;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lcb3;->q(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public B(Z)V
    .locals 5

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    .line 2
    .line 3
    const-string v1, "com.android.vending.billing.PURCHASES_UPDATED"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Landroid/content/IntentFilter;

    .line 9
    .line 10
    const-string v2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED"

    .line 11
    .line 12
    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v2, "com.android.vending.billing.ALTERNATIVE_BILLING"

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-boolean p1, p0, Lu93;->a:Z

    .line 21
    .line 22
    iget-object p1, p0, Lu93;->f:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Lgi3;

    .line 25
    .line 26
    iget-object v2, p0, Lu93;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Landroid/content/Context;

    .line 29
    .line 30
    invoke-virtual {p1, v2, v1}, Lgi3;->a(Landroid/content/Context;Landroid/content/IntentFilter;)V

    .line 31
    .line 32
    .line 33
    iget-boolean p1, p0, Lu93;->a:Z

    .line 34
    .line 35
    iget-object v1, p0, Lu93;->e:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lgi3;

    .line 38
    .line 39
    iget-object p0, p0, Lu93;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Landroid/content/Context;

    .line 42
    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    monitor-enter v1

    .line 46
    :try_start_0
    iget-boolean p1, v1, Lgi3;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    monitor-exit v1

    .line 51
    return-void

    .line 52
    :cond_0
    :try_start_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 53
    .line 54
    const-string v2, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST"

    .line 55
    .line 56
    const/16 v3, 0x21

    .line 57
    .line 58
    const/4 v4, 0x1

    .line 59
    if-lt p1, v3, :cond_2

    .line 60
    .line 61
    iget-boolean p1, v1, Lgi3;->c:Z

    .line 62
    .line 63
    if-eq v4, p1, :cond_1

    .line 64
    .line 65
    const/4 p1, 0x4

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const/4 p1, 0x2

    .line 68
    :goto_0
    invoke-static {p0, v1, v0, p1}, Lho2;->e(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_0
    move-exception p0

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    const/4 p1, 0x0

    .line 75
    invoke-virtual {p0, v1, v0, v2, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 76
    .line 77
    .line 78
    :goto_1
    iput-boolean v4, v1, Lgi3;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    .line 80
    monitor-exit v1

    .line 81
    return-void

    .line 82
    :goto_2
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 83
    throw p0

    .line 84
    :cond_3
    invoke-virtual {v1, p0, v0}, Lgi3;->a(Landroid/content/Context;Landroid/content/IntentFilter;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public a(Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lu93;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    new-array v4, v3, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v5, "Closing SentryClient."

    .line 15
    .line 16
    invoke-interface {v1, v2, v5, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const-wide/16 v1, 0x0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lio/sentry/m6;->getShutdownTimeoutMillis()J

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    :goto_0
    invoke-virtual {p0, v1, v2}, Lu93;->b(J)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lu93;->e:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lio/sentry/logger/b;

    .line 34
    .line 35
    invoke-interface {v1, p1}, Lio/sentry/logger/b;->a(Z)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lu93;->f:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lio/sentry/metrics/a;

    .line 41
    .line 42
    invoke-interface {v1, p1}, Lio/sentry/metrics/a;->a(Z)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lu93;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Lio/sentry/transport/g;

    .line 48
    .line 49
    invoke-interface {v1, p1}, Lio/sentry/transport/g;->a(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catch_0
    move-exception p1

    .line 54
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    sget-object v2, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 59
    .line 60
    const-string v4, "Failed to close the connection to the Sentry Server."

    .line 61
    .line 62
    invoke-interface {v1, v2, v4, p1}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-virtual {v0}, Lio/sentry/m6;->getEventProcessors()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    :cond_1
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Lio/sentry/c0;

    .line 84
    .line 85
    instance-of v2, v1, Ljava/io/Closeable;

    .line 86
    .line 87
    if-eqz v2, :cond_1

    .line 88
    .line 89
    :try_start_1
    move-object v2, v1

    .line 90
    check-cast v2, Ljava/io/Closeable;

    .line 91
    .line 92
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :catch_1
    move-exception v2

    .line 97
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    sget-object v5, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 102
    .line 103
    const-string v6, "Failed to close the event processor {}."

    .line 104
    .line 105
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-interface {v4, v5, v6, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_2
    iput-boolean v3, p0, Lu93;->a:Z

    .line 114
    .line 115
    return-void
.end method

.method public b(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu93;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/logger/b;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lio/sentry/logger/b;->b(J)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lu93;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lio/sentry/metrics/a;

    .line 11
    .line 12
    invoke-interface {v0, p1, p2}, Lio/sentry/metrics/a;->b(J)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lu93;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lio/sentry/transport/g;

    .line 18
    .line 19
    invoke-interface {p0, p1, p2}, Lio/sentry/transport/g;->b(J)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public c(Lio/sentry/z6;Lio/sentry/i0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lu93;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    const-string v1, "Session is required."

    .line 6
    .line 7
    invoke-static {p1, v1}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p1, Lio/sentry/z6;->X:Ljava/lang/String;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lio/sentry/m6;->getSerializer()Lio/sentry/i1;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0}, Lio/sentry/m6;->getSdkVersion()Lio/sentry/protocol/u;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "Serializer is required."

    .line 30
    .line 31
    invoke-static {v1, v3}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance v3, Lio/sentry/internal/debugmeta/c;

    .line 35
    .line 36
    invoke-static {v1, p1}, Lio/sentry/a5;->d(Lio/sentry/i1;Lio/sentry/z6;)Lio/sentry/a5;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-direct {v3, v1, v2, p1}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/protocol/w;Lio/sentry/protocol/u;Lio/sentry/a5;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v3, p2}, Lu93;->h(Lio/sentry/internal/debugmeta/c;Lio/sentry/i0;)Lio/sentry/protocol/w;

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catch_0
    move-exception p0

    .line 49
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    sget-object p2, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 54
    .line 55
    const-string v0, "Failed to capture session."

    .line 56
    .line 57
    invoke-interface {p1, p2, v0, p0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    sget-object p1, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 66
    .line 67
    const/4 p2, 0x0

    .line 68
    new-array p2, p2, [Ljava/lang/Object;

    .line 69
    .line 70
    const-string v0, "Sessions can\'t be captured without setting a release."

    .line 71
    .line 72
    invoke-interface {p0, p1, v0, p2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public d()Lio/sentry/transport/p;
    .locals 0

    .line 1
    iget-object p0, p0, Lu93;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/sentry/transport/g;

    .line 4
    .line 5
    invoke-interface {p0}, Lio/sentry/transport/g;->d()Lio/sentry/transport/p;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public e()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lu93;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/sentry/transport/g;

    .line 4
    .line 5
    invoke-interface {p0}, Lio/sentry/transport/g;->e()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public f(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lu93;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lur0;

    .line 4
    .line 5
    iget-object v0, v0, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 6
    .line 7
    new-instance v1, Ldp0;

    .line 8
    .line 9
    const/16 v2, 0x15

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v1, p0, p1, v2, v3}, Ldp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public g(Lio/sentry/o6;Lio/sentry/a1;Lio/sentry/i0;)Lio/sentry/protocol/w;
    .locals 9

    .line 1
    iget-object v0, p0, Lu93;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p3}, Lu93;->z(Lio/sentry/q4;Lio/sentry/i0;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_8

    .line 10
    .line 11
    iget-object v1, p1, Lio/sentry/q4;->d:Lio/sentry/protocol/r;

    .line 12
    .line 13
    iget-object v2, p1, Lio/sentry/q4;->b:Lio/sentry/protocol/e;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-interface {p2}, Lio/sentry/a1;->L()Lio/sentry/protocol/r;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, p1, Lio/sentry/q4;->d:Lio/sentry/protocol/r;

    .line 22
    .line 23
    :cond_0
    iget-object v1, p1, Lio/sentry/q4;->w:Lio/sentry/protocol/j0;

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-interface {p2}, Lio/sentry/a1;->K()Lio/sentry/protocol/j0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iput-object v1, p1, Lio/sentry/q4;->w:Lio/sentry/protocol/j0;

    .line 32
    .line 33
    :cond_1
    iget-object v1, p1, Lio/sentry/q4;->e:Ljava/util/AbstractMap;

    .line 34
    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    invoke-interface {p2}, Lio/sentry/a1;->z()Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {p1, v1}, Lio/sentry/q4;->c(Ljava/util/Map;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-interface {p2}, Lio/sentry/a1;->z()Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_4

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Ljava/util/Map$Entry;

    .line 68
    .line 69
    iget-object v4, p1, Lio/sentry/q4;->e:Ljava/util/AbstractMap;

    .line 70
    .line 71
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-interface {v4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-nez v4, :cond_3

    .line 80
    .line 81
    iget-object v4, p1, Lio/sentry/q4;->e:Ljava/util/AbstractMap;

    .line 82
    .line 83
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    check-cast v5, Ljava/lang/String;

    .line 88
    .line 89
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, Ljava/lang/String;

    .line 94
    .line 95
    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    :goto_1
    new-instance v1, Lio/sentry/protocol/e;

    .line 100
    .line 101
    invoke-interface {p2}, Lio/sentry/a1;->D()Lio/sentry/protocol/e;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-direct {v1, v3}, Lio/sentry/protocol/e;-><init>(Lio/sentry/protocol/e;)V

    .line 106
    .line 107
    .line 108
    iget-object v1, v1, Lio/sentry/protocol/e;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_6

    .line 123
    .line 124
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    check-cast v3, Ljava/util/Map$Entry;

    .line 129
    .line 130
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-virtual {v2, v4}, Lio/sentry/protocol/e;->a(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-nez v4, :cond_5

    .line 139
    .line 140
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    check-cast v4, Ljava/lang/String;

    .line 145
    .line 146
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v2, v3, v4}, Lio/sentry/protocol/e;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_6
    invoke-interface {p2}, Lio/sentry/a1;->g()Lio/sentry/k1;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v2}, Lio/sentry/protocol/e;->i()Lio/sentry/b7;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    if-nez v3, :cond_8

    .line 163
    .line 164
    if-nez v1, :cond_7

    .line 165
    .line 166
    invoke-interface {p2}, Lio/sentry/a1;->u()Lio/sentry/t3;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-static {v1}, Lio/sentry/j7;->b(Lio/sentry/t3;)Lio/sentry/j7;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {v2, v1}, Lio/sentry/protocol/e;->v(Lio/sentry/b7;)V

    .line 175
    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_7
    invoke-interface {v1}, Lio/sentry/k1;->s()Lio/sentry/b7;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-virtual {v2, v1}, Lio/sentry/protocol/e;->v(Lio/sentry/b7;)V

    .line 183
    .line 184
    .line 185
    :cond_8
    :goto_3
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    sget-object v2, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 190
    .line 191
    iget-object v3, p1, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 192
    .line 193
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    const-string v4, "Capturing session replay: %s"

    .line 198
    .line 199
    invoke-interface {v1, v2, v4, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    sget-object v1, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 203
    .line 204
    iget-object v2, p1, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 205
    .line 206
    if-eqz v2, :cond_9

    .line 207
    .line 208
    move-object v1, v2

    .line 209
    :cond_9
    invoke-virtual {v0}, Lio/sentry/m6;->getEventProcessors()Ljava/util/List;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    if-eqz v3, :cond_b

    .line 222
    .line 223
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    check-cast v3, Lio/sentry/c0;

    .line 228
    .line 229
    :try_start_0
    invoke-interface {v3, p1, p3}, Lio/sentry/c0;->c(Lio/sentry/o6;Lio/sentry/i0;)Lio/sentry/o6;

    .line 230
    .line 231
    .line 232
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 233
    goto :goto_4

    .line 234
    :catchall_0
    move-exception v4

    .line 235
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    sget-object v6, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 240
    .line 241
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v7

    .line 253
    const-string v8, "An exception occurred while processing replay event by processor: %s"

    .line 254
    .line 255
    invoke-interface {v5, v6, v4, v8, v7}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    :goto_4
    if-nez p1, :cond_a

    .line 259
    .line 260
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    sget-object v4, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 265
    .line 266
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    const-string v5, "Replay event was dropped by a processor: %s"

    .line 279
    .line 280
    invoke-interface {v2, v4, v5, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    sget-object v3, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    .line 288
    .line 289
    sget-object v4, Lio/sentry/n;->Replay:Lio/sentry/n;

    .line 290
    .line 291
    invoke-interface {v2, v3, v4}, Lio/sentry/clientreport/f;->a(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    .line 292
    .line 293
    .line 294
    :cond_b
    if-eqz p1, :cond_c

    .line 295
    .line 296
    invoke-virtual {v0}, Lio/sentry/m6;->getBeforeSendReplay()Lio/sentry/a6;

    .line 297
    .line 298
    .line 299
    :cond_c
    if-nez p1, :cond_d

    .line 300
    .line 301
    sget-object p0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 302
    .line 303
    return-object p0

    .line 304
    :cond_d
    const/4 v2, 0x0

    .line 305
    :try_start_1
    invoke-virtual {p0, p2, p3, p1, v2}, Lu93;->t(Lio/sentry/a1;Lio/sentry/i0;Lio/sentry/q4;Ljava/lang/String;)Lio/sentry/h7;

    .line 306
    .line 307
    .line 308
    move-result-object p2

    .line 309
    const-class v2, Lio/sentry/hints/b;

    .line 310
    .line 311
    const-string v3, "sentry:typeCheckHint"

    .line 312
    .line 313
    invoke-virtual {p3, v3}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    iget-object v3, p3, Lio/sentry/i0;->h:Lio/sentry/x3;

    .line 322
    .line 323
    invoke-virtual {p0, p1, v3, p2, v2}, Lu93;->r(Lio/sentry/o6;Lio/sentry/x3;Lio/sentry/h7;Z)Lio/sentry/internal/debugmeta/c;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    invoke-virtual {p3}, Lio/sentry/i0;->a()V

    .line 328
    .line 329
    .line 330
    iget-object p0, p0, Lu93;->c:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast p0, Lio/sentry/transport/g;

    .line 333
    .line 334
    invoke-interface {p0, p1, p3}, Lio/sentry/transport/g;->F0(Lio/sentry/internal/debugmeta/c;Lio/sentry/i0;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 335
    .line 336
    .line 337
    goto :goto_5

    .line 338
    :catch_0
    move-exception p0

    .line 339
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    sget-object p2, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 344
    .line 345
    const-string p3, "Capturing event %s failed."

    .line 346
    .line 347
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-interface {p1, p2, p0, p3, v0}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    sget-object v1, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 355
    .line 356
    :goto_5
    return-object v1
.end method

.method public h(Lio/sentry/internal/debugmeta/c;Lio/sentry/i0;)Lio/sentry/protocol/w;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lio/sentry/i0;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lu93;->y(Lio/sentry/internal/debugmeta/c;Lio/sentry/i0;)Lio/sentry/protocol/w;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    return-object p0

    .line 9
    :catch_0
    move-exception p1

    .line 10
    iget-object p0, p0, Lu93;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 13
    .line 14
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object p2, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 19
    .line 20
    const-string v0, "Failed to capture envelope."

    .line 21
    .line 22
    invoke-interface {p0, p2, v0, p1}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 26
    .line 27
    return-object p0
.end method

.method public i(Lio/sentry/o5;Lio/sentry/a1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu93;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    invoke-interface {p2}, Lio/sentry/a1;->M()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p0, p1, p2}, Lu93;->w(Lio/sentry/o5;Ljava/util/List;)Lio/sentry/o5;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0}, Lio/sentry/m6;->getEventProcessors()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p0, p1, p2}, Lu93;->w(Lio/sentry/o5;Ljava/util/List;)Lio/sentry/o5;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    :goto_0
    return-void

    .line 27
    :cond_1
    invoke-virtual {v0}, Lio/sentry/m6;->getLogs()Lio/sentry/e6;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lu93;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lio/sentry/logger/b;

    .line 37
    .line 38
    invoke-interface {p0, p1}, Lio/sentry/logger/b;->d(Lio/sentry/o5;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public isEnabled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lu93;->a:Z

    .line 2
    .line 3
    return p0
.end method

.method public j(Lio/sentry/o3;)Lio/sentry/protocol/w;
    .locals 7

    .line 1
    const-string v0, "profileChunk is required."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu93;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 9
    .line 10
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 15
    .line 16
    iget-object v3, p1, Lio/sentry/o3;->c:Lio/sentry/protocol/w;

    .line 17
    .line 18
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const-string v4, "Capturing profile chunk: %s"

    .line 23
    .line 24
    invoke-interface {v1, v2, v4, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p1, Lio/sentry/o3;->c:Lio/sentry/protocol/w;

    .line 28
    .line 29
    iget-object v2, p1, Lio/sentry/o3;->a:Lio/sentry/protocol/f;

    .line 30
    .line 31
    invoke-static {v2, v0}, Lio/sentry/protocol/f;->a(Lio/sentry/protocol/f;Lio/sentry/m6;)Lio/sentry/protocol/f;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    iput-object v2, p1, Lio/sentry/o3;->a:Lio/sentry/protocol/f;

    .line 38
    .line 39
    :cond_0
    :try_start_0
    new-instance v2, Lio/sentry/internal/debugmeta/c;

    .line 40
    .line 41
    new-instance v3, Lio/sentry/v4;

    .line 42
    .line 43
    invoke-virtual {v0}, Lio/sentry/m6;->getSdkVersion()Lio/sentry/protocol/u;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-direct {v3, v1, v4, v5}, Lio/sentry/v4;-><init>(Lio/sentry/protocol/w;Lio/sentry/protocol/u;Lio/sentry/h7;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lio/sentry/m6;->getSerializer()Lio/sentry/i1;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v0}, Lio/sentry/m6;->getProfilerConverter()Lio/sentry/z0;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-static {p1, v4, v6}, Lio/sentry/a5;->c(Lio/sentry/o3;Lio/sentry/i1;Lio/sentry/z0;)Lio/sentry/a5;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-direct {v2, v3, p1}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/v4;Ljava/util/List;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v2, v5}, Lu93;->y(Lio/sentry/internal/debugmeta/c;Lio/sentry/i0;)Lio/sentry/protocol/w;

    .line 71
    .line 72
    .line 73
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lio/sentry/exception/c; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    return-object p0

    .line 75
    :catch_0
    move-exception p0

    .line 76
    goto :goto_0

    .line 77
    :catch_1
    move-exception p0

    .line 78
    :goto_0
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    sget-object v0, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 83
    .line 84
    const-string v2, "Capturing profile chunk %s failed."

    .line 85
    .line 86
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-interface {p1, v0, p0, v2, v1}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    sget-object p0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 94
    .line 95
    return-object p0
.end method

.method public k(Lio/sentry/protocol/f0;Lio/sentry/h7;Lio/sentry/a1;Lio/sentry/i0;Lio/sentry/r3;)Lio/sentry/protocol/w;
    .locals 12

    .line 1
    iget-object v2, p0, Lu93;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v7, v2

    .line 4
    check-cast v7, Lio/sentry/android/core/SentryAndroidOptions;

    .line 5
    .line 6
    if-nez p4, :cond_0

    .line 7
    .line 8
    new-instance v2, Lio/sentry/i0;

    .line 9
    .line 10
    invoke-direct {v2}, Lio/sentry/i0;-><init>()V

    .line 11
    .line 12
    .line 13
    move-object v8, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object/from16 v8, p4

    .line 16
    .line 17
    :goto_0
    invoke-virtual {p0, p1, v8}, Lu93;->z(Lio/sentry/q4;Lio/sentry/i0;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-interface {p3}, Lio/sentry/a1;->B()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    iget-object v3, v8, Lio/sentry/i0;->b:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v7}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    sget-object v3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 39
    .line 40
    iget-object v4, p1, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 41
    .line 42
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const-string v5, "Capturing transaction: %s"

    .line 47
    .line 48
    invoke-interface {v2, v3, v5, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v7}, Lio/sentry/m6;->getIgnoredTransactions()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v3, p1, Lio/sentry/protocol/f0;->a0:Ljava/lang/String;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    if-nez v3, :cond_2

    .line 59
    .line 60
    goto/16 :goto_3

    .line 61
    .line 62
    :cond_2
    if-eqz v2, :cond_8

    .line 63
    .line 64
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_3

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_5

    .line 80
    .line 81
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    check-cast v6, Lio/sentry/g0;

    .line 86
    .line 87
    iget-object v6, v6, Lio/sentry/g0;->a:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_4

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :catchall_0
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eqz v5, :cond_8

    .line 105
    .line 106
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    check-cast v5, Lio/sentry/g0;

    .line 111
    .line 112
    :try_start_0
    iget-object v5, v5, Lio/sentry/g0;->b:Ljava/util/regex/Pattern;

    .line 113
    .line 114
    if-nez v5, :cond_7

    .line 115
    .line 116
    move v5, v4

    .line 117
    goto :goto_1

    .line 118
    :cond_7
    invoke-virtual {v5, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 123
    .line 124
    .line 125
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    :goto_1
    if-eqz v5, :cond_6

    .line 127
    .line 128
    :goto_2
    invoke-virtual {v7}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    sget-object v2, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 133
    .line 134
    iget-object v3, p1, Lio/sentry/protocol/f0;->a0:Ljava/lang/String;

    .line 135
    .line 136
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    const-string v4, "Transaction was dropped as transaction name %s is ignored"

    .line 141
    .line 142
    invoke-interface {v1, v2, v4, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v7}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    sget-object v2, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    .line 150
    .line 151
    sget-object v3, Lio/sentry/n;->Transaction:Lio/sentry/n;

    .line 152
    .line 153
    invoke-interface {v1, v2, v3}, Lio/sentry/clientreport/f;->a(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v7}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    sget-object v3, Lio/sentry/n;->Span:Lio/sentry/n;

    .line 161
    .line 162
    iget-object v0, p1, Lio/sentry/protocol/f0;->d0:Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    add-int/lit8 v0, v0, 0x1

    .line 169
    .line 170
    int-to-long v4, v0

    .line 171
    invoke-interface {v1, v2, v3, v4, v5}, Lio/sentry/clientreport/f;->e(Lio/sentry/clientreport/d;Lio/sentry/n;J)V

    .line 172
    .line 173
    .line 174
    sget-object v0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 175
    .line 176
    return-object v0

    .line 177
    :cond_8
    :goto_3
    sget-object v2, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 178
    .line 179
    iget-object v3, p1, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 180
    .line 181
    if-eqz v3, :cond_9

    .line 182
    .line 183
    move-object v9, v3

    .line 184
    goto :goto_4

    .line 185
    :cond_9
    move-object v9, v2

    .line 186
    :goto_4
    invoke-virtual {p0, p1, v8}, Lu93;->z(Lio/sentry/q4;Lio/sentry/i0;)Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-eqz v3, :cond_a

    .line 191
    .line 192
    invoke-virtual {p0, p1, p3}, Lu93;->n(Lio/sentry/q4;Lio/sentry/a1;)V

    .line 193
    .line 194
    .line 195
    invoke-interface {p3}, Lio/sentry/a1;->M()Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-virtual {p0, p1, v8, v3}, Lu93;->x(Lio/sentry/protocol/f0;Lio/sentry/i0;Ljava/util/List;)Lio/sentry/protocol/f0;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    if-nez v0, :cond_b

    .line 204
    .line 205
    invoke-virtual {v7}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    sget-object v5, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 210
    .line 211
    const-string v6, "Transaction was dropped by applyScope"

    .line 212
    .line 213
    new-array v10, v4, [Ljava/lang/Object;

    .line 214
    .line 215
    invoke-interface {v3, v5, v6, v10}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_a
    move-object v0, p1

    .line 220
    :cond_b
    :goto_5
    if-eqz v0, :cond_c

    .line 221
    .line 222
    invoke-virtual {v7}, Lio/sentry/m6;->getEventProcessors()Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-virtual {p0, v0, v8, v3}, Lu93;->x(Lio/sentry/protocol/f0;Lio/sentry/i0;Ljava/util/List;)Lio/sentry/protocol/f0;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    :cond_c
    if-nez v0, :cond_d

    .line 231
    .line 232
    invoke-virtual {v7}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    sget-object v1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 237
    .line 238
    const-string v3, "Transaction was dropped by Event processors."

    .line 239
    .line 240
    new-array v4, v4, [Ljava/lang/Object;

    .line 241
    .line 242
    invoke-interface {v0, v1, v3, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    return-object v2

    .line 246
    :cond_d
    iget-object v2, v0, Lio/sentry/protocol/f0;->d0:Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    invoke-virtual {v7}, Lio/sentry/m6;->getBeforeSendTransaction()Lio/sentry/b6;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    if-eqz v3, :cond_e

    .line 257
    .line 258
    const/4 v3, 0x0

    .line 259
    :try_start_1
    sget-object v5, Lcom/supercell/titan/TitanApplication;->b:Lcom/supercell/titan/TitanApplication;

    .line 260
    .line 261
    iget-object v5, v0, Lio/sentry/q4;->e:Ljava/util/AbstractMap;

    .line 262
    .line 263
    const-string v6, "supercell-drop-transaction"

    .line 264
    .line 265
    invoke-interface {v5, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 269
    if-eqz v5, :cond_e

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_e
    move-object v3, v0

    .line 273
    goto :goto_6

    .line 274
    :catchall_1
    move-exception v0

    .line 275
    invoke-virtual {v7}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    sget-object v6, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 280
    .line 281
    const-string v10, "The BeforeSendTransaction callback threw an exception. It will be added as breadcrumb and continue."

    .line 282
    .line 283
    invoke-interface {v5, v6, v10, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 284
    .line 285
    .line 286
    :goto_6
    if-nez v3, :cond_f

    .line 287
    .line 288
    move v0, v4

    .line 289
    goto :goto_7

    .line 290
    :cond_f
    iget-object v0, v3, Lio/sentry/protocol/f0;->d0:Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 293
    .line 294
    .line 295
    move-result v0

    .line 296
    :goto_7
    if-nez v3, :cond_10

    .line 297
    .line 298
    invoke-virtual {v7}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    sget-object v1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 303
    .line 304
    const-string v3, "Transaction was dropped by beforeSendTransaction."

    .line 305
    .line 306
    new-array v4, v4, [Ljava/lang/Object;

    .line 307
    .line 308
    invoke-interface {v0, v1, v3, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v7}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    sget-object v1, Lio/sentry/clientreport/d;->BEFORE_SEND:Lio/sentry/clientreport/d;

    .line 316
    .line 317
    sget-object v3, Lio/sentry/n;->Transaction:Lio/sentry/n;

    .line 318
    .line 319
    invoke-interface {v0, v1, v3}, Lio/sentry/clientreport/f;->a(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v7}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    sget-object v3, Lio/sentry/n;->Span:Lio/sentry/n;

    .line 327
    .line 328
    add-int/lit8 v2, v2, 0x1

    .line 329
    .line 330
    int-to-long v4, v2

    .line 331
    invoke-interface {v0, v1, v3, v4, v5}, Lio/sentry/clientreport/f;->e(Lio/sentry/clientreport/d;Lio/sentry/n;J)V

    .line 332
    .line 333
    .line 334
    sget-object v0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 335
    .line 336
    return-object v0

    .line 337
    :cond_10
    if-ge v0, v2, :cond_11

    .line 338
    .line 339
    sub-int/2addr v2, v0

    .line 340
    invoke-virtual {v7}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    sget-object v4, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 345
    .line 346
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    const-string v6, "%d spans were dropped by beforeSendTransaction."

    .line 355
    .line 356
    invoke-interface {v0, v4, v6, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v7}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    sget-object v4, Lio/sentry/clientreport/d;->BEFORE_SEND:Lio/sentry/clientreport/d;

    .line 364
    .line 365
    sget-object v5, Lio/sentry/n;->Span:Lio/sentry/n;

    .line 366
    .line 367
    int-to-long v10, v2

    .line 368
    invoke-interface {v0, v4, v5, v10, v11}, Lio/sentry/clientreport/f;->e(Lio/sentry/clientreport/d;Lio/sentry/n;J)V

    .line 369
    .line 370
    .line 371
    :cond_11
    :try_start_2
    invoke-static {v8}, Lu93;->s(Lio/sentry/i0;)Ljava/util/ArrayList;

    .line 372
    .line 373
    .line 374
    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lio/sentry/exception/c; {:try_start_2 .. :try_end_2} :catch_2

    .line 375
    move-object v2, v3

    .line 376
    :try_start_3
    new-instance v3, Ljava/util/ArrayList;

    .line 377
    .line 378
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    if-eqz v4, :cond_12

    .line 390
    .line 391
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v4

    .line 395
    check-cast v4, Lio/sentry/a;

    .line 396
    .line 397
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    goto :goto_8

    .line 401
    :cond_12
    const/4 v4, 0x0

    .line 402
    move-object v1, p0

    .line 403
    move-object v5, p2

    .line 404
    move-object/from16 v6, p5

    .line 405
    .line 406
    invoke-virtual/range {v1 .. v6}, Lu93;->o(Lio/sentry/q4;Ljava/util/ArrayList;Lio/sentry/z6;Lio/sentry/h7;Lio/sentry/r3;)Lio/sentry/internal/debugmeta/c;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-virtual {v8}, Lio/sentry/i0;->a()V

    .line 411
    .line 412
    .line 413
    if-eqz v0, :cond_13

    .line 414
    .line 415
    invoke-virtual {p0, v0, v8}, Lu93;->y(Lio/sentry/internal/debugmeta/c;Lio/sentry/i0;)Lio/sentry/protocol/w;

    .line 416
    .line 417
    .line 418
    move-result-object v9
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Lio/sentry/exception/c; {:try_start_3 .. :try_end_3} :catch_0

    .line 419
    goto :goto_b

    .line 420
    :catch_0
    move-exception v0

    .line 421
    goto :goto_a

    .line 422
    :catch_1
    move-exception v0

    .line 423
    goto :goto_a

    .line 424
    :catch_2
    move-exception v0

    .line 425
    :goto_9
    move-object v2, v3

    .line 426
    goto :goto_a

    .line 427
    :catch_3
    move-exception v0

    .line 428
    goto :goto_9

    .line 429
    :goto_a
    invoke-virtual {v7}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    sget-object v3, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 434
    .line 435
    const-string v4, "Capturing transaction %s failed."

    .line 436
    .line 437
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v5

    .line 441
    invoke-interface {v1, v3, v0, v4, v5}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    sget-object v9, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 445
    .line 446
    :cond_13
    :goto_b
    sget-object v0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 447
    .line 448
    invoke-virtual {v9, v0}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result v0

    .line 452
    if-nez v0, :cond_14

    .line 453
    .line 454
    iget-object v0, v2, Lio/sentry/q4;->b:Lio/sentry/protocol/e;

    .line 455
    .line 456
    invoke-virtual {v0}, Lio/sentry/protocol/e;->i()Lio/sentry/b7;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    if-eqz v0, :cond_14

    .line 461
    .line 462
    invoke-virtual {v7}, Lio/sentry/m6;->getReplayController()Lio/sentry/v3;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    iget-object v0, v0, Lio/sentry/b7;->a:Lio/sentry/protocol/w;

    .line 467
    .line 468
    invoke-interface {v1, v0}, Lio/sentry/v3;->g(Lio/sentry/protocol/w;)V

    .line 469
    .line 470
    .line 471
    :cond_14
    return-object v9
.end method

.method public l(Lio/sentry/protocol/k;Lio/sentry/a1;)Lio/sentry/protocol/w;
    .locals 10

    .line 1
    iget-object v0, p0, Lu93;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lio/sentry/android/core/SentryAndroidOptions;

    .line 5
    .line 6
    new-instance v0, Lio/sentry/c5;

    .line 7
    .line 8
    invoke-direct {v0}, Lio/sentry/c5;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "feedback"

    .line 12
    .line 13
    iget-object v3, v0, Lio/sentry/q4;->b:Lio/sentry/protocol/e;

    .line 14
    .line 15
    invoke-virtual {v3, p1, v2}, Lio/sentry/protocol/e;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    new-instance v2, Lio/sentry/i0;

    .line 19
    .line 20
    invoke-direct {v2}, Lio/sentry/i0;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v4, p1, Lio/sentry/protocol/k;->f:Ljava/lang/String;

    .line 24
    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    invoke-interface {p2}, Lio/sentry/a1;->F()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iput-object v4, p1, Lio/sentry/protocol/k;->f:Ljava/lang/String;

    .line 32
    .line 33
    :cond_0
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    sget-object v5, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 38
    .line 39
    iget-object v6, v0, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 40
    .line 41
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    const-string v7, "Capturing feedback: %s"

    .line 46
    .line 47
    invoke-interface {v4, v5, v7, v6}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0, v2}, Lu93;->z(Lio/sentry/q4;Lio/sentry/i0;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_9

    .line 55
    .line 56
    iget-object v4, v0, Lio/sentry/q4;->w:Lio/sentry/protocol/j0;

    .line 57
    .line 58
    if-nez v4, :cond_1

    .line 59
    .line 60
    invoke-interface {p2}, Lio/sentry/a1;->K()Lio/sentry/protocol/j0;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    iput-object v4, v0, Lio/sentry/q4;->w:Lio/sentry/protocol/j0;

    .line 65
    .line 66
    :cond_1
    iget-object v4, v0, Lio/sentry/q4;->e:Ljava/util/AbstractMap;

    .line 67
    .line 68
    if-nez v4, :cond_2

    .line 69
    .line 70
    invoke-interface {p2}, Lio/sentry/a1;->z()Ljava/util/Map;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v0, v4}, Lio/sentry/q4;->c(Ljava/util/Map;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    invoke-interface {p2}, Lio/sentry/a1;->z()Ljava/util/Map;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_4

    .line 95
    .line 96
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    check-cast v5, Ljava/util/Map$Entry;

    .line 101
    .line 102
    iget-object v6, v0, Lio/sentry/q4;->e:Ljava/util/AbstractMap;

    .line 103
    .line 104
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-interface {v6, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    if-nez v6, :cond_3

    .line 113
    .line 114
    iget-object v6, v0, Lio/sentry/q4;->e:Ljava/util/AbstractMap;

    .line 115
    .line 116
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    check-cast v7, Ljava/lang/String;

    .line 121
    .line 122
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    check-cast v5, Ljava/lang/String;

    .line 127
    .line 128
    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_4
    :goto_1
    new-instance v4, Lio/sentry/protocol/e;

    .line 133
    .line 134
    invoke-interface {p2}, Lio/sentry/a1;->D()Lio/sentry/protocol/e;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-direct {v4, v5}, Lio/sentry/protocol/e;-><init>(Lio/sentry/protocol/e;)V

    .line 139
    .line 140
    .line 141
    iget-object v4, v4, Lio/sentry/protocol/e;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 142
    .line 143
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-eqz v5, :cond_6

    .line 156
    .line 157
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    check-cast v5, Ljava/util/Map$Entry;

    .line 162
    .line 163
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    invoke-virtual {v3, v6}, Lio/sentry/protocol/e;->a(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-nez v6, :cond_5

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
    invoke-virtual {v3, v5, v6}, Lio/sentry/protocol/e;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_6
    invoke-interface {p2}, Lio/sentry/a1;->g()Lio/sentry/k1;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    invoke-virtual {v3}, Lio/sentry/protocol/e;->i()Lio/sentry/b7;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    if-nez v5, :cond_8

    .line 196
    .line 197
    if-nez v4, :cond_7

    .line 198
    .line 199
    invoke-interface {p2}, Lio/sentry/a1;->u()Lio/sentry/t3;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-static {v4}, Lio/sentry/j7;->b(Lio/sentry/t3;)Lio/sentry/j7;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    invoke-virtual {v3, v4}, Lio/sentry/protocol/e;->v(Lio/sentry/b7;)V

    .line 208
    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_7
    invoke-interface {v4}, Lio/sentry/k1;->s()Lio/sentry/b7;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    invoke-virtual {v3, v4}, Lio/sentry/protocol/e;->v(Lio/sentry/b7;)V

    .line 216
    .line 217
    .line 218
    :cond_8
    :goto_3
    invoke-interface {p2}, Lio/sentry/a1;->M()Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-virtual {p0, v0, v2, v3}, Lu93;->v(Lio/sentry/c5;Lio/sentry/i0;Ljava/util/List;)Lio/sentry/c5;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-nez v0, :cond_9

    .line 227
    .line 228
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    sget-object p1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 233
    .line 234
    const/4 p2, 0x0

    .line 235
    new-array p2, p2, [Ljava/lang/Object;

    .line 236
    .line 237
    const-string v0, "Feedback was dropped by applyScope"

    .line 238
    .line 239
    invoke-interface {p0, p1, v0, p2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    sget-object p0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 243
    .line 244
    return-object p0

    .line 245
    :cond_9
    invoke-virtual {v1}, Lio/sentry/m6;->getEventProcessors()Ljava/util/List;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    invoke-virtual {p0, v0, v2, v3}, Lu93;->v(Lio/sentry/c5;Lio/sentry/i0;Ljava/util/List;)Lio/sentry/c5;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    if-eqz v5, :cond_a

    .line 254
    .line 255
    invoke-virtual {v1}, Lio/sentry/m6;->getBeforeSendFeedback()Lio/sentry/z5;

    .line 256
    .line 257
    .line 258
    :cond_a
    if-nez v5, :cond_b

    .line 259
    .line 260
    sget-object p0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 261
    .line 262
    return-object p0

    .line 263
    :cond_b
    sget-object v0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 264
    .line 265
    iget-object v3, v5, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 266
    .line 267
    if-eqz v3, :cond_c

    .line 268
    .line 269
    goto :goto_4

    .line 270
    :cond_c
    move-object v3, v0

    .line 271
    :goto_4
    iget-object v4, p1, Lio/sentry/protocol/k;->e:Lio/sentry/protocol/w;

    .line 272
    .line 273
    if-nez v4, :cond_d

    .line 274
    .line 275
    invoke-virtual {v1}, Lio/sentry/m6;->getReplayController()Lio/sentry/v3;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 280
    .line 281
    invoke-interface {v4, v6}, Lio/sentry/v3;->c(Ljava/lang/Boolean;)V

    .line 282
    .line 283
    .line 284
    invoke-interface {p2}, Lio/sentry/a1;->i()Lio/sentry/protocol/w;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    invoke-virtual {v4, v0}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-nez v0, :cond_d

    .line 293
    .line 294
    iput-object v4, p1, Lio/sentry/protocol/k;->e:Lio/sentry/protocol/w;

    .line 295
    .line 296
    :cond_d
    :try_start_0
    iget-object p1, v5, Lio/sentry/c5;->g0:Ljava/lang/String;

    .line 297
    .line 298
    invoke-virtual {p0, p2, v2, v5, p1}, Lu93;->t(Lio/sentry/a1;Lio/sentry/i0;Lio/sentry/q4;Ljava/lang/String;)Lio/sentry/h7;

    .line 299
    .line 300
    .line 301
    move-result-object v8

    .line 302
    invoke-static {v2}, Lu93;->s(Lio/sentry/i0;)Ljava/util/ArrayList;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    const/4 v7, 0x0

    .line 307
    const/4 v9, 0x0

    .line 308
    move-object v4, p0

    .line 309
    invoke-virtual/range {v4 .. v9}, Lu93;->o(Lio/sentry/q4;Ljava/util/ArrayList;Lio/sentry/z6;Lio/sentry/h7;Lio/sentry/r3;)Lio/sentry/internal/debugmeta/c;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    invoke-virtual {v2}, Lio/sentry/i0;->a()V

    .line 314
    .line 315
    .line 316
    if-eqz p0, :cond_e

    .line 317
    .line 318
    invoke-virtual {v4, p0, v2}, Lu93;->y(Lio/sentry/internal/debugmeta/c;Lio/sentry/i0;)Lio/sentry/protocol/w;

    .line 319
    .line 320
    .line 321
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lio/sentry/exception/c; {:try_start_0 .. :try_end_0} :catch_0

    .line 322
    return-object p0

    .line 323
    :catch_0
    move-exception v0

    .line 324
    :goto_5
    move-object p0, v0

    .line 325
    goto :goto_6

    .line 326
    :catch_1
    move-exception v0

    .line 327
    goto :goto_5

    .line 328
    :cond_e
    return-object v3

    .line 329
    :goto_6
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    sget-object p2, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 334
    .line 335
    const-string v0, "Capturing feedback %s failed."

    .line 336
    .line 337
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    invoke-interface {p1, p2, p0, v0, v1}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    sget-object p0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 345
    .line 346
    return-object p0
.end method

.method public m(Lio/sentry/c5;Lio/sentry/a1;Lio/sentry/i0;)Lio/sentry/protocol/w;
    .locals 15

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v7, p2

    .line 4
    .line 5
    move-object/from16 v8, p3

    .line 6
    .line 7
    iget-object v2, p0, Lu93;->b:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v9, v2

    .line 10
    check-cast v9, Lio/sentry/android/core/SentryAndroidOptions;

    .line 11
    .line 12
    invoke-virtual {p0, v0, v8}, Lu93;->z(Lio/sentry/q4;Lio/sentry/i0;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const-class v3, Lio/sentry/hints/d;

    .line 17
    .line 18
    const-string v10, "sentry:typeCheckHint"

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v8, v10}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v3, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    if-eqz v7, :cond_0

    .line 33
    .line 34
    invoke-interface {v7}, Lio/sentry/a1;->B()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    iget-object v4, v8, Lio/sentry/i0;->b:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {v9}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    sget-object v4, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 50
    .line 51
    iget-object v5, v0, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 52
    .line 53
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    const-string v6, "Capturing event: %s"

    .line 58
    .line 59
    invoke-interface {v2, v4, v6, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lio/sentry/q4;->a()Ljava/lang/Throwable;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    if-eqz v2, :cond_1

    .line 67
    .line 68
    invoke-virtual {v9}, Lio/sentry/m6;->getIgnoredExceptionsForType()Ljava/util/Set;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_1

    .line 81
    .line 82
    invoke-virtual {v9}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    const-string v2, "Event was dropped as the exception %s is ignored"

    .line 95
    .line 96
    invoke-interface {v0, v4, v2, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v9}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sget-object v1, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    .line 104
    .line 105
    sget-object v2, Lio/sentry/n;->Error:Lio/sentry/n;

    .line 106
    .line 107
    invoke-interface {v0, v1, v2}, Lio/sentry/clientreport/f;->a(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    .line 108
    .line 109
    .line 110
    sget-object v0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 111
    .line 112
    return-object v0

    .line 113
    :cond_1
    invoke-virtual {v9}, Lio/sentry/m6;->getIgnoredErrors()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    const/4 v11, 0x0

    .line 118
    if-eqz v2, :cond_b

    .line 119
    .line 120
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_2

    .line 125
    .line 126
    goto/16 :goto_2

    .line 127
    .line 128
    :cond_2
    new-instance v4, Ljava/util/HashSet;

    .line 129
    .line 130
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 131
    .line 132
    .line 133
    iget-object v5, v0, Lio/sentry/c5;->b0:Lio/sentry/protocol/p;

    .line 134
    .line 135
    if-eqz v5, :cond_4

    .line 136
    .line 137
    iget-object v6, v5, Lio/sentry/protocol/p;->b:Ljava/lang/String;

    .line 138
    .line 139
    if-eqz v6, :cond_3

    .line 140
    .line 141
    invoke-virtual {v4, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    :cond_3
    iget-object v5, v5, Lio/sentry/protocol/p;->a:Ljava/lang/String;

    .line 145
    .line 146
    if-eqz v5, :cond_4

    .line 147
    .line 148
    invoke-virtual {v4, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    :cond_4
    invoke-virtual {v0}, Lio/sentry/q4;->a()Ljava/lang/Throwable;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    if-eqz v5, :cond_5

    .line 156
    .line 157
    invoke-virtual {v5}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-virtual {v4, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    :cond_5
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    :cond_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    if-eqz v6, :cond_7

    .line 173
    .line 174
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    check-cast v6, Lio/sentry/g0;

    .line 179
    .line 180
    iget-object v6, v6, Lio/sentry/g0;->a:Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {v4, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    if-eqz v6, :cond_6

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_7
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    if-eqz v5, :cond_b

    .line 198
    .line 199
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    check-cast v5, Lio/sentry/g0;

    .line 204
    .line 205
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    :cond_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v12

    .line 213
    if-eqz v12, :cond_8

    .line 214
    .line 215
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v12

    .line 219
    check-cast v12, Ljava/lang/String;

    .line 220
    .line 221
    iget-object v13, v5, Lio/sentry/g0;->b:Ljava/util/regex/Pattern;

    .line 222
    .line 223
    if-nez v13, :cond_a

    .line 224
    .line 225
    move v12, v11

    .line 226
    goto :goto_0

    .line 227
    :cond_a
    invoke-virtual {v13, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 228
    .line 229
    .line 230
    move-result-object v12

    .line 231
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->matches()Z

    .line 232
    .line 233
    .line 234
    move-result v12

    .line 235
    :goto_0
    if-eqz v12, :cond_9

    .line 236
    .line 237
    :goto_1
    invoke-virtual {v9}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    sget-object v2, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 242
    .line 243
    iget-object v0, v0, Lio/sentry/c5;->b0:Lio/sentry/protocol/p;

    .line 244
    .line 245
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    const-string v3, "Event was dropped as it matched a string/pattern in ignoredErrors"

    .line 250
    .line 251
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v9}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    sget-object v1, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    .line 259
    .line 260
    sget-object v2, Lio/sentry/n;->Error:Lio/sentry/n;

    .line 261
    .line 262
    invoke-interface {v0, v1, v2}, Lio/sentry/clientreport/f;->a(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    .line 263
    .line 264
    .line 265
    sget-object v0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 266
    .line 267
    return-object v0

    .line 268
    :cond_b
    :goto_2
    invoke-virtual {p0, v0, v8}, Lu93;->z(Lio/sentry/q4;Lio/sentry/i0;)Z

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    if-eqz v2, :cond_13

    .line 273
    .line 274
    if-eqz v7, :cond_12

    .line 275
    .line 276
    invoke-virtual/range {p0 .. p2}, Lu93;->n(Lio/sentry/q4;Lio/sentry/a1;)V

    .line 277
    .line 278
    .line 279
    iget-object v2, v0, Lio/sentry/c5;->g0:Ljava/lang/String;

    .line 280
    .line 281
    iget-object v4, v0, Lio/sentry/q4;->b:Lio/sentry/protocol/e;

    .line 282
    .line 283
    if-nez v2, :cond_c

    .line 284
    .line 285
    invoke-interface {v7}, Lio/sentry/a1;->N()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    iput-object v2, v0, Lio/sentry/c5;->g0:Ljava/lang/String;

    .line 290
    .line 291
    :cond_c
    iget-object v2, v0, Lio/sentry/c5;->h0:Ljava/util/List;

    .line 292
    .line 293
    if-nez v2, :cond_d

    .line 294
    .line 295
    invoke-interface {v7}, Lio/sentry/a1;->J()Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    invoke-virtual {v0, v2}, Lio/sentry/c5;->h(Ljava/util/List;)V

    .line 300
    .line 301
    .line 302
    :cond_d
    invoke-interface {v7}, Lio/sentry/a1;->t()Lio/sentry/m5;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    if-eqz v2, :cond_e

    .line 307
    .line 308
    invoke-interface {v7}, Lio/sentry/a1;->t()Lio/sentry/m5;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    iput-object v2, v0, Lio/sentry/c5;->f0:Lio/sentry/m5;

    .line 313
    .line 314
    :cond_e
    invoke-interface {v7}, Lio/sentry/a1;->g()Lio/sentry/k1;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    invoke-virtual {v4}, Lio/sentry/protocol/e;->i()Lio/sentry/b7;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    if-nez v5, :cond_10

    .line 323
    .line 324
    if-nez v2, :cond_f

    .line 325
    .line 326
    invoke-interface {v7}, Lio/sentry/a1;->u()Lio/sentry/t3;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-static {v2}, Lio/sentry/j7;->b(Lio/sentry/t3;)Lio/sentry/j7;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    invoke-virtual {v4, v2}, Lio/sentry/protocol/e;->v(Lio/sentry/b7;)V

    .line 335
    .line 336
    .line 337
    goto :goto_3

    .line 338
    :cond_f
    invoke-interface {v2}, Lio/sentry/k1;->s()Lio/sentry/b7;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    invoke-virtual {v4, v2}, Lio/sentry/protocol/e;->v(Lio/sentry/b7;)V

    .line 343
    .line 344
    .line 345
    :cond_10
    :goto_3
    invoke-virtual {v4}, Lio/sentry/protocol/e;->f()Lio/sentry/protocol/j;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    if-nez v2, :cond_11

    .line 350
    .line 351
    invoke-interface {v7}, Lio/sentry/a1;->h()Lio/sentry/protocol/j;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    if-eqz v2, :cond_11

    .line 356
    .line 357
    invoke-virtual {v4, v2}, Lio/sentry/protocol/e;->p(Lio/sentry/protocol/j;)V

    .line 358
    .line 359
    .line 360
    :cond_11
    invoke-interface {v7}, Lio/sentry/a1;->M()Ljava/util/List;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    invoke-virtual {p0, v0, v8, v2}, Lu93;->u(Lio/sentry/c5;Lio/sentry/i0;Ljava/util/List;)Lio/sentry/c5;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    :cond_12
    if-nez v0, :cond_13

    .line 369
    .line 370
    invoke-virtual {v9}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    sget-object v1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 375
    .line 376
    const-string v2, "Event was dropped by applyScope"

    .line 377
    .line 378
    new-array v3, v11, [Ljava/lang/Object;

    .line 379
    .line 380
    invoke-interface {v0, v1, v2, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    sget-object v0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 384
    .line 385
    return-object v0

    .line 386
    :cond_13
    invoke-virtual {v9}, Lio/sentry/m6;->getEventProcessors()Ljava/util/List;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    invoke-virtual {p0, v0, v8, v2}, Lu93;->u(Lio/sentry/c5;Lio/sentry/i0;Ljava/util/List;)Lio/sentry/c5;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    if-eqz v2, :cond_14

    .line 395
    .line 396
    invoke-virtual {v9}, Lio/sentry/m6;->getBeforeSend()Lio/sentry/z5;

    .line 397
    .line 398
    .line 399
    :cond_14
    const/4 v12, 0x0

    .line 400
    if-eqz v2, :cond_19

    .line 401
    .line 402
    :try_start_0
    invoke-virtual {v9}, Lio/sentry/m6;->isEnableEventSizeLimiting()Z

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    if-nez v0, :cond_15

    .line 407
    .line 408
    goto :goto_4

    .line 409
    :cond_15
    invoke-static {v2, v9}, Lio/sentry/util/c;->k(Lio/sentry/c5;Lio/sentry/android/core/SentryAndroidOptions;)Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-eqz v0, :cond_16

    .line 414
    .line 415
    goto :goto_4

    .line 416
    :cond_16
    invoke-virtual {v9}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    sget-object v4, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 421
    .line 422
    const-string v5, "Event %s exceeds %d bytes limit. Reducing size by dropping fields."

    .line 423
    .line 424
    iget-object v6, v2, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 425
    .line 426
    const-wide/32 v13, 0x100000

    .line 427
    .line 428
    .line 429
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 430
    .line 431
    .line 432
    move-result-object v13

    .line 433
    filled-new-array {v6, v13}, [Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v6

    .line 437
    invoke-interface {v0, v4, v5, v6}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v9}, Lio/sentry/m6;->getOnOversizedEvent()Lio/sentry/h6;

    .line 441
    .line 442
    .line 443
    iget-object v0, v2, Lio/sentry/q4;->X:Ljava/util/List;

    .line 444
    .line 445
    if-eqz v0, :cond_17

    .line 446
    .line 447
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    if-nez v0, :cond_17

    .line 452
    .line 453
    iput-object v12, v2, Lio/sentry/q4;->X:Ljava/util/List;

    .line 454
    .line 455
    invoke-virtual {v9}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    sget-object v4, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 460
    .line 461
    const-string v5, "Removed breadcrumbs to reduce size of event %s"

    .line 462
    .line 463
    iget-object v6, v2, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 464
    .line 465
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v6

    .line 469
    invoke-interface {v0, v4, v5, v6}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    :cond_17
    invoke-static {v2, v9}, Lio/sentry/util/c;->k(Lio/sentry/c5;Lio/sentry/android/core/SentryAndroidOptions;)Z

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    if-eqz v0, :cond_18

    .line 477
    .line 478
    goto :goto_4

    .line 479
    :cond_18
    invoke-static {v2, v9}, Lio/sentry/util/c;->t(Lio/sentry/c5;Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 480
    .line 481
    .line 482
    invoke-static {v2, v9}, Lio/sentry/util/c;->k(Lio/sentry/c5;Lio/sentry/android/core/SentryAndroidOptions;)Z

    .line 483
    .line 484
    .line 485
    move-result v0

    .line 486
    if-nez v0, :cond_19

    .line 487
    .line 488
    invoke-virtual {v9}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    sget-object v4, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 493
    .line 494
    const-string v5, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server."

    .line 495
    .line 496
    iget-object v6, v2, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 497
    .line 498
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v6

    .line 502
    invoke-interface {v0, v4, v5, v6}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 503
    .line 504
    .line 505
    goto :goto_4

    .line 506
    :catchall_0
    move-exception v0

    .line 507
    invoke-virtual {v9}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 508
    .line 509
    .line 510
    move-result-object v4

    .line 511
    sget-object v5, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 512
    .line 513
    const-string v6, "An error occurred while limiting event size. Event will be sent as-is."

    .line 514
    .line 515
    invoke-interface {v4, v5, v6, v0}, Lio/sentry/ILogger;->d(Lio/sentry/m5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 516
    .line 517
    .line 518
    :cond_19
    :goto_4
    if-nez v2, :cond_1a

    .line 519
    .line 520
    sget-object v0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 521
    .line 522
    return-object v0

    .line 523
    :cond_1a
    if-eqz v7, :cond_1b

    .line 524
    .line 525
    new-instance v0, Lio/sentry/u2;

    .line 526
    .line 527
    const/4 v4, 0x3

    .line 528
    invoke-direct {v0, v4}, Lio/sentry/u2;-><init>(I)V

    .line 529
    .line 530
    .line 531
    invoke-interface {v7, v0}, Lio/sentry/a1;->v(Lio/sentry/z3;)Lio/sentry/z6;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    goto :goto_5

    .line 536
    :cond_1b
    move-object v0, v12

    .line 537
    :goto_5
    if-eqz v0, :cond_1d

    .line 538
    .line 539
    iget-object v4, v0, Lio/sentry/z6;->i:Lio/sentry/y6;

    .line 540
    .line 541
    sget-object v5, Lio/sentry/y6;->Ok:Lio/sentry/y6;

    .line 542
    .line 543
    if-eq v4, v5, :cond_1d

    .line 544
    .line 545
    :cond_1c
    :goto_6
    move-object v4, v12

    .line 546
    goto :goto_7

    .line 547
    :cond_1d
    invoke-static {v8}, Lio/sentry/util/c;->r(Lio/sentry/i0;)Z

    .line 548
    .line 549
    .line 550
    move-result v4

    .line 551
    if-eqz v4, :cond_1c

    .line 552
    .line 553
    if-eqz v7, :cond_1e

    .line 554
    .line 555
    new-instance v4, Lpr;

    .line 556
    .line 557
    const/4 v5, 0x7

    .line 558
    invoke-direct {v4, v5, p0, v2, v8}, Lpr;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    invoke-interface {v7, v4}, Lio/sentry/a1;->v(Lio/sentry/z3;)Lio/sentry/z6;

    .line 562
    .line 563
    .line 564
    move-result-object v4

    .line 565
    goto :goto_7

    .line 566
    :cond_1e
    invoke-virtual {v9}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 567
    .line 568
    .line 569
    move-result-object v4

    .line 570
    sget-object v5, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 571
    .line 572
    const-string v6, "Scope is null on client.captureEvent"

    .line 573
    .line 574
    new-array v13, v11, [Ljava/lang/Object;

    .line 575
    .line 576
    invoke-interface {v4, v5, v6, v13}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    goto :goto_6

    .line 580
    :goto_7
    invoke-virtual {v9}, Lio/sentry/m6;->getSampleRate()Ljava/lang/Double;

    .line 581
    .line 582
    .line 583
    move-result-object v5

    .line 584
    if-nez v5, :cond_1f

    .line 585
    .line 586
    move-object v5, v12

    .line 587
    goto :goto_8

    .line 588
    :cond_1f
    invoke-static {}, Lio/sentry/util/m;->a()Lio/sentry/util/l;

    .line 589
    .line 590
    .line 591
    move-result-object v5

    .line 592
    :goto_8
    invoke-virtual {v9}, Lio/sentry/m6;->getSampleRate()Ljava/lang/Double;

    .line 593
    .line 594
    .line 595
    move-result-object v6

    .line 596
    if-eqz v6, :cond_21

    .line 597
    .line 598
    if-eqz v5, :cond_21

    .line 599
    .line 600
    invoke-virtual {v9}, Lio/sentry/m6;->getSampleRate()Ljava/lang/Double;

    .line 601
    .line 602
    .line 603
    move-result-object v6

    .line 604
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 605
    .line 606
    .line 607
    move-result-wide v13

    .line 608
    invoke-virtual {v5}, Lio/sentry/util/l;->c()D

    .line 609
    .line 610
    .line 611
    move-result-wide v5

    .line 612
    cmpg-double v5, v13, v5

    .line 613
    .line 614
    if-ltz v5, :cond_20

    .line 615
    .line 616
    goto :goto_9

    .line 617
    :cond_20
    invoke-virtual {v9}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 618
    .line 619
    .line 620
    move-result-object v5

    .line 621
    sget-object v6, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 622
    .line 623
    iget-object v2, v2, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 624
    .line 625
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    const-string v13, "Event %s was dropped due to sampling decision."

    .line 630
    .line 631
    invoke-interface {v5, v6, v13, v2}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v9}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    sget-object v5, Lio/sentry/clientreport/d;->SAMPLE_RATE:Lio/sentry/clientreport/d;

    .line 639
    .line 640
    sget-object v6, Lio/sentry/n;->Error:Lio/sentry/n;

    .line 641
    .line 642
    invoke-interface {v2, v5, v6}, Lio/sentry/clientreport/f;->a(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    .line 643
    .line 644
    .line 645
    move-object v2, v12

    .line 646
    :cond_21
    :goto_9
    const/4 v5, 0x1

    .line 647
    if-nez v4, :cond_23

    .line 648
    .line 649
    :cond_22
    move v0, v11

    .line 650
    goto :goto_b

    .line 651
    :cond_23
    if-nez v0, :cond_24

    .line 652
    .line 653
    :goto_a
    move v0, v5

    .line 654
    goto :goto_b

    .line 655
    :cond_24
    iget-object v6, v4, Lio/sentry/z6;->i:Lio/sentry/y6;

    .line 656
    .line 657
    sget-object v13, Lio/sentry/y6;->Crashed:Lio/sentry/y6;

    .line 658
    .line 659
    if-ne v6, v13, :cond_25

    .line 660
    .line 661
    iget-object v6, v0, Lio/sentry/z6;->i:Lio/sentry/y6;

    .line 662
    .line 663
    if-eq v6, v13, :cond_25

    .line 664
    .line 665
    goto :goto_a

    .line 666
    :cond_25
    iget-object v6, v4, Lio/sentry/z6;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 667
    .line 668
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 669
    .line 670
    .line 671
    move-result v6

    .line 672
    if-lez v6, :cond_22

    .line 673
    .line 674
    iget-object v0, v0, Lio/sentry/z6;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 675
    .line 676
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 677
    .line 678
    .line 679
    move-result v0

    .line 680
    if-gtz v0, :cond_22

    .line 681
    .line 682
    goto :goto_a

    .line 683
    :goto_b
    if-nez v2, :cond_26

    .line 684
    .line 685
    if-nez v0, :cond_26

    .line 686
    .line 687
    invoke-virtual {v9}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    sget-object v1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 692
    .line 693
    const-string v2, "Not sending session update for dropped event as it did not cause the session health to change."

    .line 694
    .line 695
    new-array v3, v11, [Ljava/lang/Object;

    .line 696
    .line 697
    invoke-interface {v0, v1, v2, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 698
    .line 699
    .line 700
    sget-object v0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 701
    .line 702
    return-object v0

    .line 703
    :cond_26
    sget-object v0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 704
    .line 705
    if-eqz v2, :cond_27

    .line 706
    .line 707
    iget-object v6, v2, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 708
    .line 709
    if-eqz v6, :cond_27

    .line 710
    .line 711
    move-object v13, v6

    .line 712
    goto :goto_c

    .line 713
    :cond_27
    move-object v13, v0

    .line 714
    :goto_c
    const-class v0, Lio/sentry/hints/b;

    .line 715
    .line 716
    invoke-virtual {v8, v10}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v6

    .line 720
    invoke-virtual {v0, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 721
    .line 722
    .line 723
    move-result v0

    .line 724
    invoke-virtual {v8, v10}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object v6

    .line 728
    invoke-virtual {v3, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 729
    .line 730
    .line 731
    move-result v3

    .line 732
    if-eqz v3, :cond_28

    .line 733
    .line 734
    const-class v3, Lio/sentry/android/core/v0;

    .line 735
    .line 736
    invoke-virtual {v8, v10}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v6

    .line 740
    invoke-virtual {v3, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 741
    .line 742
    .line 743
    move-result v3

    .line 744
    if-nez v3, :cond_28

    .line 745
    .line 746
    move v3, v5

    .line 747
    goto :goto_d

    .line 748
    :cond_28
    move v3, v11

    .line 749
    :goto_d
    if-eqz v2, :cond_2b

    .line 750
    .line 751
    if-nez v0, :cond_2b

    .line 752
    .line 753
    if-nez v3, :cond_2b

    .line 754
    .line 755
    invoke-virtual {v2}, Lio/sentry/c5;->g()Z

    .line 756
    .line 757
    .line 758
    move-result v0

    .line 759
    if-nez v0, :cond_29

    .line 760
    .line 761
    invoke-virtual {v2}, Lio/sentry/c5;->f()Lio/sentry/protocol/v;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    if-eqz v0, :cond_2b

    .line 766
    .line 767
    :cond_29
    invoke-virtual {v9}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 772
    .line 773
    .line 774
    invoke-virtual {v9}, Lio/sentry/m6;->getReplayController()Lio/sentry/v3;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    invoke-virtual {v2}, Lio/sentry/c5;->f()Lio/sentry/protocol/v;

    .line 779
    .line 780
    .line 781
    move-result-object v3

    .line 782
    if-eqz v3, :cond_2a

    .line 783
    .line 784
    goto :goto_e

    .line 785
    :cond_2a
    move v5, v11

    .line 786
    :goto_e
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 787
    .line 788
    .line 789
    move-result-object v3

    .line 790
    invoke-interface {v0, v3}, Lio/sentry/v3;->c(Ljava/lang/Boolean;)V

    .line 791
    .line 792
    .line 793
    :cond_2b
    if-eqz v2, :cond_2c

    .line 794
    .line 795
    :try_start_1
    iget-object v0, v2, Lio/sentry/c5;->g0:Ljava/lang/String;

    .line 796
    .line 797
    goto :goto_f

    .line 798
    :cond_2c
    move-object v0, v12

    .line 799
    :goto_f
    invoke-virtual {p0, v7, v8, v2, v0}, Lu93;->t(Lio/sentry/a1;Lio/sentry/i0;Lio/sentry/q4;Ljava/lang/String;)Lio/sentry/h7;

    .line 800
    .line 801
    .line 802
    move-result-object v5

    .line 803
    if-eqz v2, :cond_2d

    .line 804
    .line 805
    invoke-static {v8}, Lu93;->s(Lio/sentry/i0;)Ljava/util/ArrayList;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    move-object v3, v0

    .line 810
    goto :goto_10

    .line 811
    :catch_0
    move-exception v0

    .line 812
    goto :goto_11

    .line 813
    :catch_1
    move-exception v0

    .line 814
    goto :goto_11

    .line 815
    :cond_2d
    move-object v3, v12

    .line 816
    :goto_10
    const/4 v6, 0x0

    .line 817
    move-object v1, p0

    .line 818
    invoke-virtual/range {v1 .. v6}, Lu93;->o(Lio/sentry/q4;Ljava/util/ArrayList;Lio/sentry/z6;Lio/sentry/h7;Lio/sentry/r3;)Lio/sentry/internal/debugmeta/c;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    invoke-virtual {v8}, Lio/sentry/i0;->a()V

    .line 823
    .line 824
    .line 825
    if-eqz v0, :cond_2e

    .line 826
    .line 827
    invoke-virtual {p0, v0, v8}, Lu93;->y(Lio/sentry/internal/debugmeta/c;Lio/sentry/i0;)Lio/sentry/protocol/w;

    .line 828
    .line 829
    .line 830
    move-result-object v13
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lio/sentry/exception/c; {:try_start_1 .. :try_end_1} :catch_0

    .line 831
    goto :goto_12

    .line 832
    :goto_11
    invoke-virtual {v9}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 833
    .line 834
    .line 835
    move-result-object v1

    .line 836
    sget-object v2, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 837
    .line 838
    const-string v3, "Capturing event %s failed."

    .line 839
    .line 840
    filled-new-array {v13}, [Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v4

    .line 844
    invoke-interface {v1, v2, v0, v3, v4}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 845
    .line 846
    .line 847
    sget-object v13, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 848
    .line 849
    :cond_2e
    :goto_12
    if-eqz v7, :cond_30

    .line 850
    .line 851
    invoke-interface {v7}, Lio/sentry/a1;->m()Lio/sentry/m1;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    if-eqz v0, :cond_30

    .line 856
    .line 857
    const-class v1, Lio/sentry/hints/l;

    .line 858
    .line 859
    invoke-virtual {v8, v10}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v2

    .line 863
    invoke-virtual {v1, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 864
    .line 865
    .line 866
    move-result v1

    .line 867
    if-eqz v1, :cond_30

    .line 868
    .line 869
    invoke-virtual {v8, v10}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v1

    .line 873
    instance-of v2, v1, Lio/sentry/hints/c;

    .line 874
    .line 875
    if-eqz v2, :cond_2f

    .line 876
    .line 877
    check-cast v1, Lio/sentry/hints/c;

    .line 878
    .line 879
    invoke-interface {v0}, Lio/sentry/m1;->g()Lio/sentry/protocol/w;

    .line 880
    .line 881
    .line 882
    move-result-object v2

    .line 883
    invoke-virtual {v1, v2}, Lio/sentry/hints/c;->g(Lio/sentry/protocol/w;)V

    .line 884
    .line 885
    .line 886
    sget-object v1, Lio/sentry/f7;->ABORTED:Lio/sentry/f7;

    .line 887
    .line 888
    invoke-interface {v0, v1, v11, v8}, Lio/sentry/m1;->e(Lio/sentry/f7;ZLio/sentry/i0;)V

    .line 889
    .line 890
    .line 891
    goto :goto_13

    .line 892
    :cond_2f
    sget-object v1, Lio/sentry/f7;->ABORTED:Lio/sentry/f7;

    .line 893
    .line 894
    invoke-interface {v0, v1, v11, v12}, Lio/sentry/m1;->e(Lio/sentry/f7;ZLio/sentry/i0;)V

    .line 895
    .line 896
    .line 897
    :cond_30
    :goto_13
    return-object v13
.end method

.method public n(Lio/sentry/q4;Lio/sentry/a1;)V
    .locals 4

    .line 1
    if-eqz p2, :cond_c

    .line 2
    .line 3
    iget-object v0, p1, Lio/sentry/q4;->d:Lio/sentry/protocol/r;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p2}, Lio/sentry/a1;->L()Lio/sentry/protocol/r;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p1, Lio/sentry/q4;->d:Lio/sentry/protocol/r;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p1, Lio/sentry/q4;->w:Lio/sentry/protocol/j0;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p2}, Lio/sentry/a1;->K()Lio/sentry/protocol/j0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p1, Lio/sentry/q4;->w:Lio/sentry/protocol/j0;

    .line 22
    .line 23
    :cond_1
    iget-object v0, p1, Lio/sentry/q4;->e:Ljava/util/AbstractMap;

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-interface {p2}, Lio/sentry/a1;->z()Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1, v0}, Lio/sentry/q4;->c(Ljava/util/Map;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-interface {p2}, Lio/sentry/a1;->z()Ljava/util/Map;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Ljava/util/Map$Entry;

    .line 58
    .line 59
    iget-object v2, p1, Lio/sentry/q4;->e:Ljava/util/AbstractMap;

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-nez v2, :cond_3

    .line 70
    .line 71
    iget-object v2, p1, Lio/sentry/q4;->e:Ljava/util/AbstractMap;

    .line 72
    .line 73
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    check-cast v3, Ljava/lang/String;

    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Ljava/lang/String;

    .line 84
    .line 85
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    :goto_1
    iget-object v0, p1, Lio/sentry/q4;->X:Ljava/util/List;

    .line 90
    .line 91
    if-nez v0, :cond_5

    .line 92
    .line 93
    new-instance p0, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-interface {p2}, Lio/sentry/a1;->s()Ljava/util/Queue;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 105
    .line 106
    .line 107
    iput-object v0, p1, Lio/sentry/q4;->X:Ljava/util/List;

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    invoke-interface {p2}, Lio/sentry/a1;->s()Ljava/util/Queue;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget-object v1, p1, Lio/sentry/q4;->X:Ljava/util/List;

    .line 115
    .line 116
    if-eqz v1, :cond_6

    .line 117
    .line 118
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-nez v2, :cond_6

    .line 123
    .line 124
    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 125
    .line 126
    .line 127
    iget-object p0, p0, Lu93;->d:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p0, Lio/sentry/r4;

    .line 130
    .line 131
    invoke-static {v1, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 132
    .line 133
    .line 134
    :cond_6
    :goto_2
    iget-object p0, p1, Lio/sentry/q4;->Z:Ljava/util/AbstractMap;

    .line 135
    .line 136
    if-nez p0, :cond_8

    .line 137
    .line 138
    invoke-interface {p2}, Lio/sentry/a1;->getExtras()Ljava/util/Map;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    if-eqz p0, :cond_7

    .line 143
    .line 144
    new-instance v0, Ljava/util/HashMap;

    .line 145
    .line 146
    invoke-direct {v0, p0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_7
    const/4 v0, 0x0

    .line 151
    :goto_3
    iput-object v0, p1, Lio/sentry/q4;->Z:Ljava/util/AbstractMap;

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_8
    invoke-interface {p2}, Lio/sentry/a1;->getExtras()Ljava/util/Map;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    :cond_9
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_a

    .line 171
    .line 172
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    check-cast v0, Ljava/util/Map$Entry;

    .line 177
    .line 178
    iget-object v1, p1, Lio/sentry/q4;->Z:Ljava/util/AbstractMap;

    .line 179
    .line 180
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-nez v1, :cond_9

    .line 189
    .line 190
    iget-object v1, p1, Lio/sentry/q4;->Z:Ljava/util/AbstractMap;

    .line 191
    .line 192
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    check-cast v2, Ljava/lang/String;

    .line 197
    .line 198
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_a
    :goto_5
    iget-object p0, p1, Lio/sentry/q4;->b:Lio/sentry/protocol/e;

    .line 207
    .line 208
    new-instance p1, Lio/sentry/protocol/e;

    .line 209
    .line 210
    invoke-interface {p2}, Lio/sentry/a1;->D()Lio/sentry/protocol/e;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    invoke-direct {p1, p2}, Lio/sentry/protocol/e;-><init>(Lio/sentry/protocol/e;)V

    .line 215
    .line 216
    .line 217
    iget-object p1, p1, Lio/sentry/protocol/e;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    :cond_b
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 228
    .line 229
    .line 230
    move-result p2

    .line 231
    if-eqz p2, :cond_c

    .line 232
    .line 233
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p2

    .line 237
    check-cast p2, Ljava/util/Map$Entry;

    .line 238
    .line 239
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {p0, v0}, Lio/sentry/protocol/e;->a(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-nez v0, :cond_b

    .line 248
    .line 249
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, Ljava/lang/String;

    .line 254
    .line 255
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p2

    .line 259
    invoke-virtual {p0, p2, v0}, Lio/sentry/protocol/e;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_c
    return-void
.end method

.method public o(Lio/sentry/q4;Ljava/util/ArrayList;Lio/sentry/z6;Lio/sentry/h7;Lio/sentry/r3;)Lio/sentry/internal/debugmeta/c;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    move-object/from16 v4, p5

    .line 8
    .line 9
    iget-object v2, v2, Lu93;->b:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v6, v2

    .line 12
    check-cast v6, Lio/sentry/android/core/SentryAndroidOptions;

    .line 13
    .line 14
    new-instance v7, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v6}, Lio/sentry/m6;->getSerializer()Lio/sentry/i1;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    sget-object v3, Lio/sentry/a5;->d:Ljava/nio/charset/Charset;

    .line 27
    .line 28
    const-string v3, "ISerializer is required."

    .line 29
    .line 30
    invoke-static {v2, v3}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v3, Lio/sentry/internal/debugmeta/c;

    .line 34
    .line 35
    new-instance v5, Lbh0;

    .line 36
    .line 37
    const/4 v9, 0x5

    .line 38
    invoke-direct {v5, v9, v2, v0}, Lbh0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v3, v5}, Lio/sentry/internal/debugmeta/c;-><init>(Ljava/util/concurrent/Callable;)V

    .line 42
    .line 43
    .line 44
    new-instance v10, Lio/sentry/b5;

    .line 45
    .line 46
    invoke-static {v0}, Lio/sentry/l5;->resolve(Ljava/lang/Object;)Lio/sentry/l5;

    .line 47
    .line 48
    .line 49
    move-result-object v11

    .line 50
    new-instance v12, Lio/sentry/w4;

    .line 51
    .line 52
    const/4 v2, 0x4

    .line 53
    invoke-direct {v12, v3, v2}, Lio/sentry/w4;-><init>(Lio/sentry/internal/debugmeta/c;I)V

    .line 54
    .line 55
    .line 56
    const/4 v14, 0x0

    .line 57
    const/4 v15, 0x0

    .line 58
    const-string v13, "application/json"

    .line 59
    .line 60
    invoke-direct/range {v10 .. v15}, Lio/sentry/b5;-><init>(Lio/sentry/l5;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    new-instance v2, Lio/sentry/a5;

    .line 64
    .line 65
    new-instance v5, Lio/sentry/w4;

    .line 66
    .line 67
    invoke-direct {v5, v3, v9}, Lio/sentry/w4;-><init>(Lio/sentry/internal/debugmeta/c;I)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v2, v10, v5}, Lio/sentry/a5;-><init>(Lio/sentry/b5;Ljava/util/concurrent/Callable;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    iget-object v0, v0, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 77
    .line 78
    move-object v9, v0

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    move-object v9, v8

    .line 81
    :goto_0
    if-eqz v1, :cond_1

    .line 82
    .line 83
    invoke-virtual {v6}, Lio/sentry/m6;->getSerializer()Lio/sentry/i1;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0, v1}, Lio/sentry/a5;->d(Lio/sentry/i1;Lio/sentry/z6;)Lio/sentry/a5;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    :cond_1
    if-eqz v4, :cond_2

    .line 95
    .line 96
    invoke-virtual {v6}, Lio/sentry/m6;->getMaxTraceFileSize()J

    .line 97
    .line 98
    .line 99
    move-result-wide v2

    .line 100
    invoke-virtual {v6}, Lio/sentry/m6;->getSerializer()Lio/sentry/i1;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    sget-object v0, Lio/sentry/a5;->d:Ljava/nio/charset/Charset;

    .line 105
    .line 106
    iget-object v1, v4, Lio/sentry/r3;->a:Ljava/io/File;

    .line 107
    .line 108
    new-instance v10, Lio/sentry/internal/debugmeta/c;

    .line 109
    .line 110
    new-instance v0, Lio/sentry/y4;

    .line 111
    .line 112
    invoke-direct/range {v0 .. v5}, Lio/sentry/y4;-><init>(Ljava/io/File;JLio/sentry/r3;Lio/sentry/i1;)V

    .line 113
    .line 114
    .line 115
    invoke-direct {v10, v0}, Lio/sentry/internal/debugmeta/c;-><init>(Ljava/util/concurrent/Callable;)V

    .line 116
    .line 117
    .line 118
    new-instance v11, Lio/sentry/b5;

    .line 119
    .line 120
    sget-object v12, Lio/sentry/l5;->Profile:Lio/sentry/l5;

    .line 121
    .line 122
    new-instance v13, Lio/sentry/w4;

    .line 123
    .line 124
    const/4 v0, 0x0

    .line 125
    invoke-direct {v13, v10, v0}, Lio/sentry/w4;-><init>(Lio/sentry/internal/debugmeta/c;I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v15

    .line 132
    const/16 v16, 0x0

    .line 133
    .line 134
    const-string v14, "application-json"

    .line 135
    .line 136
    invoke-direct/range {v11 .. v16}, Lio/sentry/b5;-><init>(Lio/sentry/l5;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    new-instance v0, Lio/sentry/a5;

    .line 140
    .line 141
    new-instance v1, Lio/sentry/w4;

    .line 142
    .line 143
    const/4 v2, 0x1

    .line 144
    invoke-direct {v1, v10, v2}, Lio/sentry/w4;-><init>(Lio/sentry/internal/debugmeta/c;I)V

    .line 145
    .line 146
    .line 147
    invoke-direct {v0, v11, v1}, Lio/sentry/a5;-><init>(Lio/sentry/b5;Ljava/util/concurrent/Callable;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    if-nez v9, :cond_2

    .line 154
    .line 155
    new-instance v9, Lio/sentry/protocol/w;

    .line 156
    .line 157
    iget-object v0, v4, Lio/sentry/r3;->h0:Ljava/lang/String;

    .line 158
    .line 159
    invoke-direct {v9, v0}, Lio/sentry/protocol/w;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :cond_2
    if-eqz p2, :cond_3

    .line 163
    .line 164
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_3

    .line 173
    .line 174
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    move-object v11, v1

    .line 179
    check-cast v11, Lio/sentry/a;

    .line 180
    .line 181
    invoke-virtual {v6}, Lio/sentry/m6;->getSerializer()Lio/sentry/i1;

    .line 182
    .line 183
    .line 184
    move-result-object v14

    .line 185
    invoke-virtual {v6}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 186
    .line 187
    .line 188
    move-result-object v15

    .line 189
    invoke-virtual {v6}, Lio/sentry/m6;->getMaxAttachmentSize()J

    .line 190
    .line 191
    .line 192
    move-result-wide v12

    .line 193
    sget-object v1, Lio/sentry/a5;->d:Ljava/nio/charset/Charset;

    .line 194
    .line 195
    new-instance v1, Lio/sentry/internal/debugmeta/c;

    .line 196
    .line 197
    new-instance v10, Lio/sentry/y4;

    .line 198
    .line 199
    invoke-direct/range {v10 .. v15}, Lio/sentry/y4;-><init>(Lio/sentry/a;JLio/sentry/i1;Lio/sentry/ILogger;)V

    .line 200
    .line 201
    .line 202
    invoke-direct {v1, v10}, Lio/sentry/internal/debugmeta/c;-><init>(Ljava/util/concurrent/Callable;)V

    .line 203
    .line 204
    .line 205
    new-instance v12, Lio/sentry/b5;

    .line 206
    .line 207
    sget-object v13, Lio/sentry/l5;->Attachment:Lio/sentry/l5;

    .line 208
    .line 209
    new-instance v14, Lio/sentry/w4;

    .line 210
    .line 211
    const/16 v2, 0xe

    .line 212
    .line 213
    invoke-direct {v14, v1, v2}, Lio/sentry/w4;-><init>(Lio/sentry/internal/debugmeta/c;I)V

    .line 214
    .line 215
    .line 216
    iget-object v15, v11, Lio/sentry/a;->f:Ljava/lang/String;

    .line 217
    .line 218
    iget-object v2, v11, Lio/sentry/a;->e:Ljava/lang/String;

    .line 219
    .line 220
    iget-object v3, v11, Lio/sentry/a;->g:Ljava/lang/String;

    .line 221
    .line 222
    move-object/from16 v16, v2

    .line 223
    .line 224
    move-object/from16 v17, v3

    .line 225
    .line 226
    invoke-direct/range {v12 .. v17}, Lio/sentry/b5;-><init>(Lio/sentry/l5;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    new-instance v2, Lio/sentry/a5;

    .line 230
    .line 231
    new-instance v3, Lio/sentry/w4;

    .line 232
    .line 233
    const/16 v4, 0xf

    .line 234
    .line 235
    invoke-direct {v3, v1, v4}, Lio/sentry/w4;-><init>(Lio/sentry/internal/debugmeta/c;I)V

    .line 236
    .line 237
    .line 238
    invoke-direct {v2, v12, v3}, Lio/sentry/a5;-><init>(Lio/sentry/b5;Ljava/util/concurrent/Callable;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_3
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-nez v0, :cond_4

    .line 250
    .line 251
    new-instance v0, Lio/sentry/v4;

    .line 252
    .line 253
    invoke-virtual {v6}, Lio/sentry/m6;->getSdkVersion()Lio/sentry/protocol/u;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    move-object/from16 v2, p4

    .line 258
    .line 259
    invoke-direct {v0, v9, v1, v2}, Lio/sentry/v4;-><init>(Lio/sentry/protocol/w;Lio/sentry/protocol/u;Lio/sentry/h7;)V

    .line 260
    .line 261
    .line 262
    new-instance v1, Lio/sentry/internal/debugmeta/c;

    .line 263
    .line 264
    invoke-direct {v1, v0, v7}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/v4;Ljava/util/List;)V

    .line 265
    .line 266
    .line 267
    return-object v1

    .line 268
    :cond_4
    return-object v8
.end method

.method public p(Lio/sentry/p5;)Lio/sentry/internal/debugmeta/c;
    .locals 13

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lu93;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 9
    .line 10
    invoke-virtual {p0}, Lio/sentry/m6;->getSerializer()Lio/sentry/i1;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Lio/sentry/a5;->d:Ljava/nio/charset/Charset;

    .line 15
    .line 16
    const-string v2, "ISerializer is required."

    .line 17
    .line 18
    invoke-static {v1, v2}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lio/sentry/internal/debugmeta/c;

    .line 22
    .line 23
    new-instance v3, Lbh0;

    .line 24
    .line 25
    const/4 v4, 0x6

    .line 26
    invoke-direct {v3, v4, v1, p1}, Lbh0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v2, v3}, Lio/sentry/internal/debugmeta/c;-><init>(Ljava/util/concurrent/Callable;)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Lio/sentry/b5;

    .line 33
    .line 34
    sget-object v6, Lio/sentry/l5;->Log:Lio/sentry/l5;

    .line 35
    .line 36
    new-instance v7, Lio/sentry/w4;

    .line 37
    .line 38
    invoke-direct {v7, v2, v4}, Lio/sentry/w4;-><init>(Lio/sentry/internal/debugmeta/c;I)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p1, Lio/sentry/p5;->a:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v12

    .line 51
    const-string v8, "application/vnd.sentry.items.log+json"

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    const/4 v10, 0x0

    .line 55
    const/4 v11, 0x0

    .line 56
    invoke-direct/range {v5 .. v12}, Lio/sentry/b5;-><init>(Lio/sentry/l5;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 57
    .line 58
    .line 59
    new-instance p1, Lio/sentry/a5;

    .line 60
    .line 61
    new-instance v1, Lio/sentry/w4;

    .line 62
    .line 63
    const/16 v3, 0x8

    .line 64
    .line 65
    invoke-direct {v1, v2, v3}, Lio/sentry/w4;-><init>(Lio/sentry/internal/debugmeta/c;I)V

    .line 66
    .line 67
    .line 68
    invoke-direct {p1, v5, v1}, Lio/sentry/a5;-><init>(Lio/sentry/b5;Ljava/util/concurrent/Callable;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    new-instance p1, Lio/sentry/v4;

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    invoke-virtual {p0}, Lio/sentry/m6;->getSdkVersion()Lio/sentry/protocol/u;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-direct {p1, v1, p0, v1}, Lio/sentry/v4;-><init>(Lio/sentry/protocol/w;Lio/sentry/protocol/u;Lio/sentry/h7;)V

    .line 82
    .line 83
    .line 84
    new-instance p0, Lio/sentry/internal/debugmeta/c;

    .line 85
    .line 86
    invoke-direct {p0, p1, v0}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/v4;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    return-object p0
.end method

.method public q(Lio/sentry/t5;)Lio/sentry/internal/debugmeta/c;
    .locals 13

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lu93;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 9
    .line 10
    invoke-virtual {p0}, Lio/sentry/m6;->getSerializer()Lio/sentry/i1;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Lio/sentry/a5;->d:Ljava/nio/charset/Charset;

    .line 15
    .line 16
    const-string v2, "ISerializer is required."

    .line 17
    .line 18
    invoke-static {v1, v2}, Lio/sentry/util/c;->q(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lio/sentry/internal/debugmeta/c;

    .line 22
    .line 23
    new-instance v3, Lbh0;

    .line 24
    .line 25
    const/4 v4, 0x3

    .line 26
    invoke-direct {v3, v4, v1, p1}, Lbh0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v2, v3}, Lio/sentry/internal/debugmeta/c;-><init>(Ljava/util/concurrent/Callable;)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Lio/sentry/b5;

    .line 33
    .line 34
    sget-object v6, Lio/sentry/l5;->TraceMetric:Lio/sentry/l5;

    .line 35
    .line 36
    new-instance v7, Lio/sentry/w4;

    .line 37
    .line 38
    const/4 v1, 0x7

    .line 39
    invoke-direct {v7, v2, v1}, Lio/sentry/w4;-><init>(Lio/sentry/internal/debugmeta/c;I)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p1, Lio/sentry/t5;->a:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v12

    .line 52
    const-string v8, "application/vnd.sentry.items.trace-metric+json"

    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    const/4 v10, 0x0

    .line 56
    const/4 v11, 0x0

    .line 57
    invoke-direct/range {v5 .. v12}, Lio/sentry/b5;-><init>(Lio/sentry/l5;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 58
    .line 59
    .line 60
    new-instance p1, Lio/sentry/a5;

    .line 61
    .line 62
    new-instance v1, Lio/sentry/w4;

    .line 63
    .line 64
    const/16 v3, 0xd

    .line 65
    .line 66
    invoke-direct {v1, v2, v3}, Lio/sentry/w4;-><init>(Lio/sentry/internal/debugmeta/c;I)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p1, v5, v1}, Lio/sentry/a5;-><init>(Lio/sentry/b5;Ljava/util/concurrent/Callable;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    new-instance p1, Lio/sentry/v4;

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-virtual {p0}, Lio/sentry/m6;->getSdkVersion()Lio/sentry/protocol/u;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-direct {p1, v1, p0, v1}, Lio/sentry/v4;-><init>(Lio/sentry/protocol/w;Lio/sentry/protocol/u;Lio/sentry/h7;)V

    .line 83
    .line 84
    .line 85
    new-instance p0, Lio/sentry/internal/debugmeta/c;

    .line 86
    .line 87
    invoke-direct {p0, p1, v0}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/v4;Ljava/util/List;)V

    .line 88
    .line 89
    .line 90
    return-object p0
.end method

.method public r(Lio/sentry/o6;Lio/sentry/x3;Lio/sentry/h7;Z)Lio/sentry/internal/debugmeta/c;
    .locals 16

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    new-instance v7, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    move-object/from16 v0, p0

    .line 9
    .line 10
    iget-object v0, v0, Lu93;->b:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v8, v0

    .line 13
    check-cast v8, Lio/sentry/android/core/SentryAndroidOptions;

    .line 14
    .line 15
    invoke-virtual {v8}, Lio/sentry/m6;->getSerializer()Lio/sentry/i1;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v8}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    sget-object v0, Lio/sentry/a5;->d:Ljava/nio/charset/Charset;

    .line 24
    .line 25
    iget-object v4, v2, Lio/sentry/o6;->a0:Ljava/io/File;

    .line 26
    .line 27
    new-instance v9, Lio/sentry/internal/debugmeta/c;

    .line 28
    .line 29
    new-instance v0, Lio/sentry/x4;

    .line 30
    .line 31
    move-object/from16 v3, p2

    .line 32
    .line 33
    move/from16 v6, p4

    .line 34
    .line 35
    invoke-direct/range {v0 .. v6}, Lio/sentry/x4;-><init>(Lio/sentry/i1;Lio/sentry/o6;Lio/sentry/x3;Ljava/io/File;Lio/sentry/ILogger;Z)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v9, v0}, Lio/sentry/internal/debugmeta/c;-><init>(Ljava/util/concurrent/Callable;)V

    .line 39
    .line 40
    .line 41
    new-instance v10, Lio/sentry/b5;

    .line 42
    .line 43
    sget-object v11, Lio/sentry/l5;->ReplayVideo:Lio/sentry/l5;

    .line 44
    .line 45
    new-instance v12, Lio/sentry/w4;

    .line 46
    .line 47
    const/16 v0, 0xb

    .line 48
    .line 49
    invoke-direct {v12, v9, v0}, Lio/sentry/w4;-><init>(Lio/sentry/internal/debugmeta/c;I)V

    .line 50
    .line 51
    .line 52
    const/4 v14, 0x0

    .line 53
    const/4 v15, 0x0

    .line 54
    const/4 v13, 0x0

    .line 55
    invoke-direct/range {v10 .. v15}, Lio/sentry/b5;-><init>(Lio/sentry/l5;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Lio/sentry/a5;

    .line 59
    .line 60
    new-instance v1, Lio/sentry/w4;

    .line 61
    .line 62
    const/16 v3, 0xc

    .line 63
    .line 64
    invoke-direct {v1, v9, v3}, Lio/sentry/w4;-><init>(Lio/sentry/internal/debugmeta/c;I)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v0, v10, v1}, Lio/sentry/a5;-><init>(Lio/sentry/b5;Ljava/util/concurrent/Callable;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    iget-object v0, v2, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 74
    .line 75
    new-instance v1, Lio/sentry/v4;

    .line 76
    .line 77
    invoke-virtual {v8}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    iget-object v2, v2, Lio/sentry/q6;->l:Lio/sentry/protocol/u;

    .line 82
    .line 83
    move-object/from16 v3, p3

    .line 84
    .line 85
    invoke-direct {v1, v0, v2, v3}, Lio/sentry/v4;-><init>(Lio/sentry/protocol/w;Lio/sentry/protocol/u;Lio/sentry/h7;)V

    .line 86
    .line 87
    .line 88
    new-instance v0, Lio/sentry/internal/debugmeta/c;

    .line 89
    .line 90
    invoke-direct {v0, v1, v7}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/v4;Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    return-object v0
.end method

.method public t(Lio/sentry/a1;Lio/sentry/i0;Lio/sentry/q4;Ljava/lang/String;)Lio/sentry/h7;
    .locals 3

    .line 1
    iget-object p0, p0, Lu93;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    const-string v0, "sentry:typeCheckHint"

    .line 6
    .line 7
    invoke-virtual {p2, v0}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const-class v0, Lio/sentry/hints/b;

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const/4 v0, 0x0

    .line 18
    if-eqz p2, :cond_4

    .line 19
    .line 20
    if-eqz p3, :cond_6

    .line 21
    .line 22
    new-instance p1, Lio/sentry/c;

    .line 23
    .line 24
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-direct {p1, p2}, Lio/sentry/c;-><init>(Lio/sentry/ILogger;)V

    .line 29
    .line 30
    .line 31
    iget-object p2, p3, Lio/sentry/q4;->b:Lio/sentry/protocol/e;

    .line 32
    .line 33
    invoke-virtual {p2}, Lio/sentry/protocol/e;->i()Lio/sentry/b7;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    iget-object v1, v1, Lio/sentry/b7;->a:Lio/sentry/protocol/w;

    .line 40
    .line 41
    invoke-virtual {v1}, Lio/sentry/protocol/w;->a()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v1, v0

    .line 47
    :goto_0
    const-string v2, "sentry-trace_id"

    .line 48
    .line 49
    invoke-virtual {p1, v2, v1}, Lio/sentry/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lio/sentry/m6;->retrieveParsedDsn()Lio/sentry/z;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-object v1, v1, Lio/sentry/z;->b:Ljava/lang/String;

    .line 57
    .line 58
    const-string v2, "sentry-public_key"

    .line 59
    .line 60
    invoke-virtual {p1, v2, v1}, Lio/sentry/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p3, Lio/sentry/q4;->f:Ljava/lang/String;

    .line 64
    .line 65
    const-string v2, "sentry-release"

    .line 66
    .line 67
    invoke-virtual {p1, v2, v1}, Lio/sentry/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-object p3, p3, Lio/sentry/q4;->i:Ljava/lang/String;

    .line 71
    .line 72
    const-string v1, "sentry-environment"

    .line 73
    .line 74
    invoke-virtual {p1, v1, p3}, Lio/sentry/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lio/sentry/m6;->getEffectiveOrgId()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const-string p3, "sentry-org_id"

    .line 82
    .line 83
    invoke-virtual {p1, p3, p0}, Lio/sentry/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const-string p0, "sentry-transaction"

    .line 87
    .line 88
    invoke-virtual {p1, p0, p4}, Lio/sentry/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget-boolean p0, p1, Lio/sentry/c;->f:Z

    .line 92
    .line 93
    if-eqz p0, :cond_1

    .line 94
    .line 95
    iput-object v0, p1, Lio/sentry/c;->c:Ljava/lang/Double;

    .line 96
    .line 97
    :cond_1
    const-string p0, "sentry-sampled"

    .line 98
    .line 99
    invoke-virtual {p1, p0, v0}, Lio/sentry/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iget-boolean p0, p1, Lio/sentry/c;->f:Z

    .line 103
    .line 104
    if-eqz p0, :cond_2

    .line 105
    .line 106
    iput-object v0, p1, Lio/sentry/c;->d:Ljava/lang/Double;

    .line 107
    .line 108
    :cond_2
    const-string p0, "replay_id"

    .line 109
    .line 110
    invoke-virtual {p2, p0}, Lio/sentry/protocol/e;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    if-eqz p3, :cond_3

    .line 115
    .line 116
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p4

    .line 120
    sget-object v0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 121
    .line 122
    invoke-virtual {v0}, Lio/sentry/protocol/w;->a()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p4

    .line 130
    if-nez p4, :cond_3

    .line 131
    .line 132
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p3

    .line 136
    const-string p4, "sentry-replay_id"

    .line 137
    .line 138
    invoke-virtual {p1, p4, p3}, Lio/sentry/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    iget-object p2, p2, Lio/sentry/protocol/e;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 142
    .line 143
    invoke-virtual {p2, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    :cond_3
    const/4 p0, 0x0

    .line 147
    iput-boolean p0, p1, Lio/sentry/c;->f:Z

    .line 148
    .line 149
    invoke-virtual {p1}, Lio/sentry/c;->f()Lio/sentry/h7;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0

    .line 154
    :cond_4
    if-eqz p1, :cond_6

    .line 155
    .line 156
    invoke-interface {p1}, Lio/sentry/a1;->m()Lio/sentry/m1;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    if-eqz p2, :cond_5

    .line 161
    .line 162
    invoke-interface {p2}, Lio/sentry/k1;->a()Lio/sentry/h7;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    return-object p0

    .line 167
    :cond_5
    new-instance p2, Lpn;

    .line 168
    .line 169
    const/16 p3, 0x1d

    .line 170
    .line 171
    invoke-direct {p2, p3, p1, p0}, Lpn;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-interface {p1, p2}, Lio/sentry/a1;->E(Lio/sentry/y3;)Lio/sentry/t3;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    iget-object p0, p0, Lio/sentry/t3;->e:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast p0, Lio/sentry/c;

    .line 181
    .line 182
    invoke-virtual {p0}, Lio/sentry/c;->f()Lio/sentry/h7;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    return-object p0

    .line 187
    :cond_6
    return-object v0
.end method

.method public u(Lio/sentry/c5;Lio/sentry/i0;Ljava/util/List;)Lio/sentry/c5;
    .locals 6

    .line 1
    iget-object p0, p0, Lu93;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lio/sentry/c0;

    .line 20
    .line 21
    :try_start_0
    instance-of v1, v0, Lio/sentry/android/core/i0;

    .line 22
    .line 23
    const-class v2, Lio/sentry/hints/b;

    .line 24
    .line 25
    const-string v3, "sentry:typeCheckHint"

    .line 26
    .line 27
    invoke-virtual {p2, v3}, Lio/sentry/i0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    move-object v1, v0

    .line 40
    check-cast v1, Lio/sentry/android/core/i0;

    .line 41
    .line 42
    invoke-virtual {v1, p1, p2}, Lio/sentry/android/core/i0;->f(Lio/sentry/c5;Lio/sentry/i0;)Lio/sentry/c5;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    if-nez v2, :cond_2

    .line 47
    .line 48
    if-nez v1, :cond_2

    .line 49
    .line 50
    invoke-interface {v0, p1, p2}, Lio/sentry/c0;->f(Lio/sentry/c5;Lio/sentry/i0;)Lio/sentry/c5;

    .line 51
    .line 52
    .line 53
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v1

    .line 56
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const-string v5, "An exception occurred while processing event by processor: %s"

    .line 75
    .line 76
    invoke-interface {v2, v3, v1, v5, v4}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    :goto_0
    if-nez p1, :cond_0

    .line 80
    .line 81
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    sget-object p3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const-string v1, "Event was dropped by a processor: %s"

    .line 100
    .line 101
    invoke-interface {p2, p3, v1, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    sget-object p2, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    .line 109
    .line 110
    sget-object p3, Lio/sentry/n;->Error:Lio/sentry/n;

    .line 111
    .line 112
    invoke-interface {p0, p2, p3}, Lio/sentry/clientreport/f;->a(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    .line 113
    .line 114
    .line 115
    :cond_3
    return-object p1
.end method

.method public v(Lio/sentry/c5;Lio/sentry/i0;Ljava/util/List;)Lio/sentry/c5;
    .locals 6

    .line 1
    iget-object p0, p0, Lu93;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lio/sentry/c0;

    .line 20
    .line 21
    :try_start_0
    invoke-interface {v0, p1, p2}, Lio/sentry/c0;->f(Lio/sentry/c5;Lio/sentry/i0;)Lio/sentry/c5;

    .line 22
    .line 23
    .line 24
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    const-string v5, "An exception occurred while processing feedback event by processor: %s"

    .line 46
    .line 47
    invoke-interface {v2, v3, v1, v5, v4}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    if-nez p1, :cond_0

    .line 51
    .line 52
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    sget-object p3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v1, "Feedback event was dropped by a processor: %s"

    .line 71
    .line 72
    invoke-interface {p2, p3, v1, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    sget-object p2, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    .line 80
    .line 81
    sget-object p3, Lio/sentry/n;->Feedback:Lio/sentry/n;

    .line 82
    .line 83
    invoke-interface {p0, p2, p3}, Lio/sentry/clientreport/f;->a(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    .line 84
    .line 85
    .line 86
    :cond_1
    return-object p1
.end method

.method public w(Lio/sentry/o5;Ljava/util/List;)Lio/sentry/o5;
    .locals 6

    .line 1
    iget-object p0, p0, Lu93;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lio/sentry/c0;

    .line 20
    .line 21
    :try_start_0
    invoke-interface {v0, p1}, Lio/sentry/c0;->h(Lio/sentry/o5;)Lio/sentry/o5;

    .line 22
    .line 23
    .line 24
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_1

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    const-string v5, "An exception occurred while processing log event by processor: %s"

    .line 46
    .line 47
    invoke-interface {v2, v3, v1, v5, v4}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object v1, p1

    .line 51
    :goto_1
    if-nez v1, :cond_0

    .line 52
    .line 53
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    sget-object v2, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v3, "Log event was dropped by a processor: %s"

    .line 72
    .line 73
    invoke-interface {p2, v2, v3, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    sget-object v0, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    .line 81
    .line 82
    sget-object v2, Lio/sentry/n;->LogItem:Lio/sentry/n;

    .line 83
    .line 84
    invoke-interface {p2, v0, v2}, Lio/sentry/clientreport/f;->a(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lio/sentry/m6;->getSerializer()Lio/sentry/i1;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-static {p2, v2, p1}, Lio/sentry/util/e;->a(Lio/sentry/i1;Lio/sentry/ILogger;Lio/sentry/g2;)J

    .line 96
    .line 97
    .line 98
    move-result-wide p1

    .line 99
    invoke-virtual {p0}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    sget-object v2, Lio/sentry/n;->LogByte:Lio/sentry/n;

    .line 104
    .line 105
    invoke-interface {p0, v0, v2, p1, p2}, Lio/sentry/clientreport/f;->e(Lio/sentry/clientreport/d;Lio/sentry/n;J)V

    .line 106
    .line 107
    .line 108
    move-object p1, v1

    .line 109
    goto :goto_2

    .line 110
    :cond_0
    move-object p1, v1

    .line 111
    goto :goto_0

    .line 112
    :cond_1
    :goto_2
    return-object p1
.end method

.method public x(Lio/sentry/protocol/f0;Lio/sentry/i0;Ljava/util/List;)Lio/sentry/protocol/f0;
    .locals 7

    .line 1
    iget-object p0, p0, Lu93;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lio/sentry/c0;

    .line 20
    .line 21
    iget-object v1, p1, Lio/sentry/protocol/f0;->d0:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    :try_start_0
    invoke-interface {v0, p1, p2}, Lio/sentry/c0;->g(Lio/sentry/protocol/f0;Lio/sentry/i0;)Lio/sentry/protocol/f0;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception v2

    .line 33
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    sget-object v4, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    const-string v6, "An exception occurred while processing transaction by processor: %s"

    .line 52
    .line 53
    invoke-interface {v3, v4, v2, v6, v5}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    if-nez p1, :cond_1

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    goto :goto_2

    .line 60
    :cond_1
    iget-object v2, p1, Lio/sentry/protocol/f0;->d0:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    :goto_2
    if-nez p1, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    sget-object p3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v2, "Transaction was dropped by a processor: %s"

    .line 87
    .line 88
    invoke-interface {p2, p3, v2, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    sget-object p3, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    .line 96
    .line 97
    sget-object v0, Lio/sentry/n;->Transaction:Lio/sentry/n;

    .line 98
    .line 99
    invoke-interface {p2, p3, v0}, Lio/sentry/clientreport/f;->a(Lio/sentry/clientreport/d;Lio/sentry/n;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    sget-object p2, Lio/sentry/n;->Span:Lio/sentry/n;

    .line 107
    .line 108
    add-int/lit8 v1, v1, 0x1

    .line 109
    .line 110
    int-to-long v0, v1

    .line 111
    invoke-interface {p0, p3, p2, v0, v1}, Lio/sentry/clientreport/f;->e(Lio/sentry/clientreport/d;Lio/sentry/n;J)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_2
    if-ge v2, v1, :cond_0

    .line 116
    .line 117
    sub-int/2addr v1, v2

    .line 118
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    sget-object v3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 123
    .line 124
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    filled-new-array {v4, v0}, [Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    const-string v4, "%d spans were dropped by a processor: %s"

    .line 141
    .line 142
    invoke-interface {v2, v3, v4, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Lio/sentry/m6;->getClientReportRecorder()Lio/sentry/clientreport/f;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    sget-object v2, Lio/sentry/clientreport/d;->EVENT_PROCESSOR:Lio/sentry/clientreport/d;

    .line 150
    .line 151
    sget-object v3, Lio/sentry/n;->Span:Lio/sentry/n;

    .line 152
    .line 153
    int-to-long v4, v1

    .line 154
    invoke-interface {v0, v2, v3, v4, v5}, Lio/sentry/clientreport/f;->e(Lio/sentry/clientreport/d;Lio/sentry/n;J)V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    :cond_3
    :goto_3
    return-object p1
.end method

.method public y(Lio/sentry/internal/debugmeta/c;Lio/sentry/i0;)Lio/sentry/protocol/w;
    .locals 2

    .line 1
    iget-object v0, p0, Lu93;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/sentry/m6;->getBeforeEnvelopeCallback()Lio/sentry/y5;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lio/sentry/k5;->d()Lio/sentry/k5;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v1, v0}, Lio/sentry/k5;->c(Lio/sentry/ILogger;)Z

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lu93;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lio/sentry/transport/g;

    .line 22
    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance p2, Lio/sentry/i0;

    .line 29
    .line 30
    invoke-direct {p2}, Lio/sentry/i0;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {p0, p1, p2}, Lio/sentry/transport/g;->F0(Lio/sentry/internal/debugmeta/c;Lio/sentry/i0;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-interface {p0, p1, p2}, Lio/sentry/transport/g;->F0(Lio/sentry/internal/debugmeta/c;Lio/sentry/i0;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iget-object p0, p1, Lio/sentry/internal/debugmeta/c;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lio/sentry/v4;

    .line 43
    .line 44
    iget-object p0, p0, Lio/sentry/v4;->a:Lio/sentry/protocol/w;

    .line 45
    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_1
    sget-object p0, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 50
    .line 51
    return-object p0
.end method

.method public z(Lio/sentry/q4;Lio/sentry/i0;)Z
    .locals 1

    .line 1
    invoke-static {p2}, Lio/sentry/util/c;->r(Lio/sentry/i0;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    iget-object p0, p0, Lu93;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 12
    .line 13
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p2, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 18
    .line 19
    iget-object p1, p1, Lio/sentry/q4;->a:Lio/sentry/protocol/w;

    .line 20
    .line 21
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "Event was cached so not applying scope: %s"

    .line 26
    .line 27
    invoke-interface {p0, p2, v0, p1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return p0
.end method

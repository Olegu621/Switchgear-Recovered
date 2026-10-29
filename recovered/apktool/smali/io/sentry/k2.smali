.class public final Lio/sentry/k2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lio/sentry/k2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lio/sentry/k2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lio/sentry/k2;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lio/sentry/k2;->b:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    check-cast v0, Lio/sentry/metrics/c;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0}, Lio/sentry/metrics/c;->d()V

    .line 13
    .line 14
    .line 15
    iget-object p0, v0, Lio/sentry/metrics/c;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    const/16 v2, 0x3e8

    .line 22
    .line 23
    if-ge p0, v2, :cond_0

    .line 24
    .line 25
    iget-object p0, v0, Lio/sentry/metrics/c;->f:Lio/sentry/util/a;

    .line 26
    .line 27
    invoke-virtual {p0}, Lio/sentry/util/a;->c()V

    .line 28
    .line 29
    .line 30
    :try_start_0
    iget-object v2, v0, Lio/sentry/metrics/c;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lio/sentry/metrics/c;->e(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lio/sentry/util/a;->close()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :goto_1
    :try_start_1
    invoke-virtual {p0}, Lio/sentry/util/a;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :catchall_1
    move-exception p0

    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    :goto_2
    throw v0

    .line 57
    :pswitch_0
    iget-object p0, p0, Lio/sentry/k2;->b:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v0, p0

    .line 60
    check-cast v0, Lio/sentry/logger/e;

    .line 61
    .line 62
    :cond_2
    invoke-virtual {v0}, Lio/sentry/logger/e;->e()V

    .line 63
    .line 64
    .line 65
    iget-object p0, v0, Lio/sentry/logger/e;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    const/16 v2, 0x64

    .line 72
    .line 73
    if-ge p0, v2, :cond_2

    .line 74
    .line 75
    iget-object p0, v0, Lio/sentry/logger/e;->f:Lio/sentry/util/a;

    .line 76
    .line 77
    invoke-virtual {p0}, Lio/sentry/util/a;->c()V

    .line 78
    .line 79
    .line 80
    :try_start_2
    iget-object v2, v0, Lio/sentry/logger/e;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_3

    .line 87
    .line 88
    const/4 v2, 0x1

    .line 89
    invoke-virtual {v0, v2, v1}, Lio/sentry/logger/e;->g(ZZ)V

    .line 90
    .line 91
    .line 92
    goto :goto_3

    .line 93
    :catchall_2
    move-exception v0

    .line 94
    goto :goto_4

    .line 95
    :cond_3
    iput-boolean v1, v0, Lio/sentry/logger/e;->i:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 96
    .line 97
    :goto_3
    invoke-virtual {p0}, Lio/sentry/util/a;->close()V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :goto_4
    :try_start_3
    invoke-virtual {p0}, Lio/sentry/util/a;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 102
    .line 103
    .line 104
    goto :goto_5

    .line 105
    :catchall_3
    move-exception p0

    .line 106
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    :goto_5
    throw v0

    .line 110
    :pswitch_1
    iget-object p0, p0, Lio/sentry/k2;->b:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p0, Lio/sentry/android/replay/capture/a;

    .line 113
    .line 114
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :pswitch_2
    iget-object p0, p0, Lio/sentry/k2;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p0, Lio/sentry/android/replay/capture/a;

    .line 121
    .line 122
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :pswitch_3
    iget-object p0, p0, Lio/sentry/k2;->b:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p0, Lio/sentry/android/replay/capture/a;

    .line 129
    .line 130
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_4
    iget-object p0, p0, Lio/sentry/k2;->b:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p0, Lt60;

    .line 137
    .line 138
    invoke-virtual {p0}, Lt60;->invoke()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :pswitch_5
    iget-object p0, p0, Lio/sentry/k2;->b:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p0, Lt60;

    .line 145
    .line 146
    invoke-virtual {p0}, Lt60;->invoke()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :pswitch_6
    iget-object p0, p0, Lio/sentry/k2;->b:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast p0, Lio/sentry/android/replay/capture/a;

    .line 153
    .line 154
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :pswitch_7
    iget-object p0, p0, Lio/sentry/k2;->b:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 161
    .line 162
    invoke-virtual {p0}, Lio/sentry/m6;->getCacheDirPath()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    if-nez v0, :cond_4

    .line 167
    .line 168
    invoke-virtual {p0}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    sget-object v0, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 173
    .line 174
    const-string v2, "Cache dir is not set, not moving the previous session."

    .line 175
    .line 176
    new-array v1, v1, [Ljava/lang/Object;

    .line 177
    .line 178
    invoke-interface {p0, v0, v2, v1}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    goto :goto_6

    .line 182
    :cond_4
    invoke-virtual {p0}, Lio/sentry/m6;->getEnvelopeDiskCache()Lio/sentry/cache/d;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    instance-of v1, p0, Lio/sentry/cache/c;

    .line 187
    .line 188
    if-eqz v1, :cond_5

    .line 189
    .line 190
    sget-object v1, Lio/sentry/cache/c;->w:Ljava/nio/charset/Charset;

    .line 191
    .line 192
    new-instance v1, Ljava/io/File;

    .line 193
    .line 194
    const-string v2, "session.json"

    .line 195
    .line 196
    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    new-instance v2, Ljava/io/File;

    .line 200
    .line 201
    const-string v3, "previous_session.json"

    .line 202
    .line 203
    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    check-cast p0, Lio/sentry/cache/c;

    .line 207
    .line 208
    invoke-virtual {p0, v1, v2}, Lio/sentry/cache/c;->c(Ljava/io/File;Ljava/io/File;)V

    .line 209
    .line 210
    .line 211
    iget-object p0, p0, Lio/sentry/cache/c;->e:Ljava/util/concurrent/CountDownLatch;

    .line 212
    .line 213
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 214
    .line 215
    .line 216
    :cond_5
    :goto_6
    return-void

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

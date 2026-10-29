.class public final synthetic Lk31;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:J

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p6, p0, Lk31;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lk31;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lk31;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-wide p3, p0, Lk31;->d:J

    .line 8
    .line 9
    iput-object p5, p0, Lk31;->e:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lk31;->a:I

    .line 4
    .line 5
    iget-object v2, v0, Lk31;->e:Ljava/lang/Object;

    .line 6
    .line 7
    iget-wide v3, v0, Lk31;->d:J

    .line 8
    .line 9
    iget-object v5, v0, Lk31;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v0, v0, Lk31;->b:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object v6, v0

    .line 17
    check-cast v6, Lio/sentry/android/replay/capture/n;

    .line 18
    .line 19
    check-cast v5, Lio/sentry/android/replay/p;

    .line 20
    .line 21
    check-cast v2, Lio/sentry/android/replay/x;

    .line 22
    .line 23
    iget-object v0, v6, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    .line 24
    .line 25
    iget-object v1, v6, Lio/sentry/android/replay/capture/n;->t:Lio/sentry/m6;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v5, v0, v3}, Lio/sentry/android/replay/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v0, v6, Lio/sentry/android/replay/capture/c;->j:Lio/sentry/android/replay/capture/b;

    .line 37
    .line 38
    sget-object v3, Lio/sentry/android/replay/capture/c;->s:[Lu21;

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    aget-object v3, v3, v4

    .line 42
    .line 43
    invoke-virtual {v0, v6, v3}, Lio/sentry/android/replay/capture/b;->a(Ljava/lang/Object;Lu21;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    move-object v9, v0

    .line 48
    check-cast v9, Ljava/util/Date;

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    if-nez v9, :cond_1

    .line 52
    .line 53
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    sget-object v2, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 58
    .line 59
    const-string v3, "Segment timestamp is not set, not recording frame"

    .line 60
    .line 61
    new-array v0, v0, [Ljava/lang/Object;

    .line 62
    .line 63
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :cond_1
    iget-object v3, v6, Lio/sentry/android/replay/capture/c;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_2

    .line 75
    .line 76
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    sget-object v2, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 81
    .line 82
    const-string v3, "Not capturing segment, because the app is terminating, will be captured on next launch"

    .line 83
    .line 84
    new-array v0, v0, [Ljava/lang/Object;

    .line 85
    .line 86
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_0

    .line 90
    .line 91
    :cond_2
    if-nez v2, :cond_3

    .line 92
    .line 93
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    sget-object v2, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 98
    .line 99
    const-string v3, "Recorder config is not set, not capturing a segment"

    .line 100
    .line 101
    new-array v0, v0, [Ljava/lang/Object;

    .line 102
    .line 103
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_3
    iget-object v3, v6, Lio/sentry/android/replay/capture/n;->v:Lio/sentry/transport/f;

    .line 108
    .line 109
    invoke-interface {v3}, Lio/sentry/transport/f;->c()J

    .line 110
    .line 111
    .line 112
    move-result-wide v16

    .line 113
    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    .line 114
    .line 115
    .line 116
    move-result-wide v7

    .line 117
    sub-long v7, v16, v7

    .line 118
    .line 119
    invoke-virtual {v1}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    iget-wide v10, v3, Lio/sentry/q6;->i:J

    .line 124
    .line 125
    cmp-long v3, v7, v10

    .line 126
    .line 127
    if-ltz v3, :cond_4

    .line 128
    .line 129
    invoke-virtual {v1}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    iget-wide v7, v3, Lio/sentry/q6;->i:J

    .line 134
    .line 135
    invoke-virtual {v6}, Lio/sentry/android/replay/capture/c;->d()Lio/sentry/protocol/w;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    invoke-virtual {v6}, Lio/sentry/android/replay/capture/c;->e()I

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    iget v12, v2, Lio/sentry/android/replay/x;->b:I

    .line 144
    .line 145
    iget v13, v2, Lio/sentry/android/replay/x;->a:I

    .line 146
    .line 147
    iget v14, v2, Lio/sentry/android/replay/x;->e:I

    .line 148
    .line 149
    iget v15, v2, Lio/sentry/android/replay/x;->f:I

    .line 150
    .line 151
    invoke-static/range {v6 .. v15}, Lio/sentry/android/replay/capture/c;->c(Lio/sentry/android/replay/capture/c;JLjava/util/Date;Lio/sentry/protocol/w;IIIII)Lio/sentry/android/replay/capture/l;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    instance-of v3, v2, Lio/sentry/android/replay/capture/j;

    .line 156
    .line 157
    if-eqz v3, :cond_4

    .line 158
    .line 159
    check-cast v2, Lio/sentry/android/replay/capture/j;

    .line 160
    .line 161
    iget-object v3, v6, Lio/sentry/android/replay/capture/n;->u:Lio/sentry/c1;

    .line 162
    .line 163
    invoke-static {v2, v3}, Lio/sentry/android/replay/capture/j;->a(Lio/sentry/android/replay/capture/j;Lio/sentry/c1;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v6}, Lio/sentry/android/replay/capture/c;->e()I

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    add-int/2addr v3, v4

    .line 171
    invoke-virtual {v6, v3}, Lio/sentry/android/replay/capture/c;->k(I)V

    .line 172
    .line 173
    .line 174
    iget-object v2, v2, Lio/sentry/android/replay/capture/j;->a:Lio/sentry/o6;

    .line 175
    .line 176
    iget-object v2, v2, Lio/sentry/o6;->f0:Ljava/util/Date;

    .line 177
    .line 178
    invoke-virtual {v6, v2}, Lio/sentry/android/replay/capture/c;->l(Ljava/util/Date;)V

    .line 179
    .line 180
    .line 181
    :cond_4
    iget-object v2, v6, Lio/sentry/android/replay/capture/c;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 182
    .line 183
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 184
    .line 185
    .line 186
    move-result-wide v2

    .line 187
    sub-long v16, v16, v2

    .line 188
    .line 189
    invoke-virtual {v1}, Lio/sentry/m6;->getSessionReplay()Lio/sentry/q6;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    iget-wide v2, v2, Lio/sentry/q6;->j:J

    .line 194
    .line 195
    cmp-long v2, v16, v2

    .line 196
    .line 197
    if-ltz v2, :cond_5

    .line 198
    .line 199
    invoke-virtual {v1}, Lio/sentry/m6;->getReplayController()Lio/sentry/v3;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-interface {v2}, Lio/sentry/v3;->stop()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    sget-object v2, Lio/sentry/m5;->INFO:Lio/sentry/m5;

    .line 211
    .line 212
    const-string v3, "Session replay deadline exceeded (1h), stopping recording"

    .line 213
    .line 214
    new-array v0, v0, [Ljava/lang/Object;

    .line 215
    .line 216
    invoke-interface {v1, v2, v3, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    :cond_5
    :goto_0
    return-void

    .line 220
    :pswitch_0
    check-cast v0, Lio/flutter/embedding/android/KeyEmbedderResponder;

    .line 221
    .line 222
    check-cast v5, Lio/flutter/embedding/android/KeyboardMap$KeyPair;

    .line 223
    .line 224
    check-cast v2, Landroid/view/KeyEvent;

    .line 225
    .line 226
    invoke-static {v0, v5, v3, v4, v2}, Lio/flutter/embedding/android/KeyEmbedderResponder;->a(Lio/flutter/embedding/android/KeyEmbedderResponder;Lio/flutter/embedding/android/KeyboardMap$KeyPair;JLandroid/view/KeyEvent;)V

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :pswitch_1
    check-cast v0, Lio/flutter/embedding/android/KeyEmbedderResponder;

    .line 231
    .line 232
    check-cast v5, Lio/flutter/embedding/android/KeyboardMap$KeyPair;

    .line 233
    .line 234
    check-cast v2, Landroid/view/KeyEvent;

    .line 235
    .line 236
    invoke-static {v0, v5, v3, v4, v2}, Lio/flutter/embedding/android/KeyEmbedderResponder;->b(Lio/flutter/embedding/android/KeyEmbedderResponder;Lio/flutter/embedding/android/KeyboardMap$KeyPair;JLandroid/view/KeyEvent;)V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    nop

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
